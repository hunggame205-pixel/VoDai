package com.vdtt.network;

import com.vdtt.data.DataCenter;
import com.vdtt.db.DbManager;
import com.vdtt.map.MapManager;
import com.vdtt.model.User;
import com.vdtt.server.Server;
import com.vdtt.server.ServerManager;
import com.vdtt.server.VDTT;
import com.vdtt.util.Log;
import com.vdtt.util.VDTTUtlis;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.zip.Deflater;

public class Session implements ISession {
    /**
     * Lệnh đăng ký tài khoản ngay trong client (chưa đăng nhập).
     * Client gửi trong gói -123: Message.c((byte) Session.CMD_REGISTER) rồi writeUTF(username), writeUTF(password).
     */
    public static final byte CMD_REGISTER = -17;
    public String IPAddress;
    private Sender sender;
    public int id;
    public Socket sc;
    public DataInputStream dis;
    public DataOutputStream dos;
    private IMessageHandler controller;
    private Service service;
    private Thread collectorThread;
    private Thread sendThread;
    public boolean connected;
    public boolean sendKeyComplete;
    private boolean isClosed;
    private boolean isSenData;
    private boolean isLoginSuccess;
    public boolean isLogin;
    public User user;
    public Object waitSendSession = new Object();


    public Session(Socket sc, int id) throws IOException {
        this.sc = sc;
        this.id = id;
        this.sc.setKeepAlive(true);
        connected = true;
        this.dis = new DataInputStream(sc.getInputStream());
        this.dos = new DataOutputStream(sc.getOutputStream());
        setHandler(new Controller(this));
        setService(new Service(this));
        sendThread = new Thread(sender = new Sender());
        String remoteSocketAddress = sc.getRemoteSocketAddress().toString();
        sendThread.setName("sender: " + remoteSocketAddress);
        collectorThread = new Thread(new MessageCollector());
        collectorThread.setName("dis: " + remoteSocketAddress);
        collectorThread.start();
    }

    @Override
    public boolean isConnected() {
        return connected && sc != null && sc.isConnected();
    }

    @Override
    public void setHandler(IMessageHandler messageHandler) {
        this.controller = messageHandler;
    }

    public IMessageHandler getMessageHandler() {
        return this.controller;
    }

    @Override
    public void setService(Service service) {
        this.service = service;
    }

    public Service getService() {
        return this.service;
    }

    @Override
    public void sendMessage(Message message) {
        if (isConnected()) {
            sender.addMessage(message);
        }
    }

    @Override
    public void close() {
        cleanNetwork();
    }

    private void cleanNetwork() {
        try {
            if (user != null) {
                if (user.sltChar != null) {
                    if (!user.sltChar.isCleaned) {
                        user.sltChar.cleanUp();
                    }
                }
                if (!user.isCleaned) {
                    user.cleanUp();
                }
            }
            connected = false;
            isLoginSuccess = false;
            if (sc != null) {
                sc.close();
                sc = null;
            }
            if (dos != null) {
                dos.close();
                dos = null;
            }
            if (dis != null) {
                dis.close();
                dis = null;
            }
            if (sendThread != null) {
                sendThread.interrupt();
                sendThread = null;
            }
            if (collectorThread != null) {
                collectorThread.interrupt();
                collectorThread = null;
            }
            controller = null;
            service = null;
            System.gc();
        } catch (Exception e) {
            Log.error("cleanNetwork err", e);
        }
    }

    private void processMessage(Message ms) {
        if (!isClosed && isConnected()) {
            controller.onMessage(ms);
        }
    }

    public void readKey(Message mss) {
        try {
            if (!sendKeyComplete) {
                byte firstByte = mss.reader().readByte();
                byte secondByte = mss.reader().readByte();
                short firstShort = mss.reader().readShort();
                short secondShort = mss.reader().readShort();
                byte thirdByte = mss.reader().readByte();
                byte fourthByte = mss.reader().readByte();
                byte fifthByte = mss.reader().readByte();
                sendKeyComplete = true;
                sendThread.start();
            }
        } catch (IOException e) {

        }
    }

    public void login(Message ms) {
        try {
            String username = ms.readUTF();
            String password = ms.readUTF();
            int ver = ms.reader().readInt();
//            try {
//                if(ver != 2){
//                    service.serverDialog("Vui lòng tải lại phiên bản trên trang chủ!");
//                    return;
//                }
//                String key = ms.readUTF();
//                if (!key.equals("j5Z3dgPbnROc3gmpdEVrWI4ost")) {
//                    service.serverDialog("Vui lòng sử dụng phiên bản chính thức từ trang chủ!");
//                    return;
//                }
//            } catch (IOException e) {
//                service.serverDialog("Đã xảy ra lỗi, vui lòng thử lại hoặc tải bản mới nhất!");
//                close();
//                return;
//            }
            if (!connected || VDTT.isStop) {
                close();
                return;
            }
            if (!isSenData) {
                isSenData = true;
                service.updateTextClient();
                service.updateData();
                service.updateDataSkill();
            }
            if (this.isLoginSuccess) {
                return;
            }
            if (isLogin) {
                return;
            }
            isLogin = true;
            User us = new User(this, username, password);
            us.login();
            if (us.isLoadFinish) {
                this.isLoginSuccess = true;
                this.isLogin = false;
                this.user = us;
                Controller controller = (Controller) getMessageHandler();
                controller.setUser(us);
                controller.setService((Service) service);
                service.sendTabSelectChar(us);
            }
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

    /**
     * Đăng ký tài khoản game ngay trong client, ghi vào cùng bảng `users` mà server đọc lúc login
     * (giống form web register.php: mật khẩu lưu nguyên bản vì server so sánh trực tiếp).
     */
    public void register(Message ms) {
        try {
            if (user != null) {
                return;
            }
            String username = ms.readUTF().trim();
            String password = ms.readUTF();
            String email = ms.readUTF().trim();
            if (!username.matches("[a-zA-Z0-9]{4,20}")) {
                service.serverDialog("Tên tài khoản 4-20 ký tự, chỉ gồm chữ và số.");
                return;
            }
            if (password.length() < 4 || password.length() > 100) {
                service.serverDialog("Mật khẩu phải từ 4 đến 100 ký tự.");
                return;
            }
            if (email.indexOf('@') <= 0 || email.indexOf('.') < 0) {
                service.serverDialog("Email không hợp lệ.");
                return;
            }
            String ip = IPAddress == null ? "" : IPAddress;
            int result = DbManager.getInstance().registerAccount(username, password, email, ip);
            if (result == 0) {
                Log.info("Dang ky tai khoan: " + username + " - " + email);
                service.serverDialog("Đăng ký thành công, hãy đăng nhập để chơi.");
            } else if (result == 1) {
                service.serverDialog("Tên tài khoản đã tồn tại.");
            } else {
                service.serverDialog("Không tạo được tài khoản, vui lòng thử lại sau.");
            }
        } catch (Exception e) {
            service.serverDialog("Dữ liệu đăng ký không hợp lệ.");
        }
    }

    private boolean CMD_MOVE(byte cmd) {
        return cmd == 123 || cmd == 124 || cmd == 125 || cmd == -82 || cmd == -83 || cmd == -84;
    }

    public byte msgNew(byte cmd) {
        if (cmd == -128
                || cmd == -92
                || cmd == -91
                || cmd == -87
                || cmd == -86
                || cmd == -84
                || cmd == -81
                || cmd == -80
                || cmd == -79
                || cmd == -65
                || cmd == -64
                || cmd == -63
                || cmd == -41
                || cmd == 20
                || cmd == 61
                || cmd == 123
                || cmd == -112
                || cmd == -111
                || cmd == -79
                || cmd == -80
                || cmd == -128) return cmd;
        if (cmd == -125) return 112;
        if (cmd == -124) return -47;
        if (cmd == -123) return 64;
        if (cmd == -122) return -115;
        if (cmd == -113) return -104;
        if (cmd == -110) return 2;
        if (cmd == -109) return 86;
        if (cmd == -108) return 53;
        if (cmd == -107) return 114;
        if (cmd == -106) return -123;
        if (cmd == -105) return -57;
        if (cmd == -104) return 38;
        if (cmd == -103) return 81;
        if (cmd == -102) return -98;
        if (cmd == -101) return 119;
        if (cmd == -99) return 87;
        if (cmd == -98) return 118;
        if (cmd == -97) return 79;
        if (cmd == -96) return -31;
        if (cmd == -95) return 55;
        if (cmd == -94) return 52;
        if (cmd == -93) return -19;
        if (cmd == -89) return -3;
        if (cmd == -88) return -38;
        if (cmd == -85) return 105;
        if (cmd == -68) return -106;
        if (cmd == -67) return -94;
        if (cmd == -66) return -53;
        if (cmd == -62) return 97;
        if (cmd == -61) return -113;
        if (cmd == -59) return -15;
        if (cmd == -58) return -97;
        if (cmd == -56) return 68;
        if (cmd == -55) return 121;
        if (cmd == -54) return -121;
        if (cmd == -53) return 33;
        if (cmd == -52) return -46;
        if (cmd == -51) return 75;
        if (cmd == -50) return -16;
        if (cmd == -49) return 46;
        if (cmd == -48) return 110;
        if (cmd == -47) return 73;
        if (cmd == -46) return -107;
        if (cmd == -45) return 106;
        if (cmd == -44) return -78;
        if (cmd == -43) return 67;
        if (cmd == -42) return 78;
        if (cmd == -37) return 37;
        if (cmd == -36) return 92;
        if (cmd == -35) return 7;
        if (cmd == -34) return 77;
        if (cmd == -33) return -21;
        if (cmd == -32) return -122;
        if (cmd == -31) return -28;
        if (cmd == -30) return 16;
        if (cmd == -29) return 103;
        if (cmd == -28) return -120;
        if (cmd == -27) return 80;
        if (cmd == -26) return 11;
        if (cmd == -25) return -110;
        if (cmd == -24) return 116;
        if (cmd == -23) return -69;
        if (cmd == -22) return 40;
        if (cmd == -21) return -119;
        if (cmd == -20) return 107;
        if (cmd == -57) return 63;
        if (cmd == -18) return -54;
        if (cmd == -17) return 120;
        if (cmd == -16) return 93;
        if (cmd == -15) return 30;
        if (cmd == -14) return 12;
        if (cmd == -13) return -83;
        if (cmd == -12) return -101;
        if (cmd == -11) return -13;
        if (cmd == -10) return -9;
        if (cmd == -9) return -77;
        if (cmd == -8) return -70;
        if (cmd == -6) return -71;
        if (cmd == -5) return -93;
        if (cmd == -4) return -90;
        if (cmd == -3) return -108;
        if (cmd == -2) return 69;
        if (cmd == -1) return -66;
        if (cmd == 0) return -29;
        if (cmd == 1) return 71;
        if (cmd == 2) return 72;
        if (cmd == 3) return -23;
        if (cmd == 4) return 29;
        if (cmd == 5) return -82;
        if (cmd == 6) return -109;
        if (cmd == 7) return -32;
        if (cmd == 8) return 84;
        if (cmd == 10) return 57;
        if (cmd == 12) return -99;
        if (cmd == 13) return 34;
        if (cmd == 15) return 70;
        if (cmd == 16) return -12;
        if (cmd == 17) return 95;
        if (cmd == 18) return 99;
        if (cmd == 19) return 98;
        if (cmd == 21) return 26;
        if (cmd == 22) return 51;
        if (cmd == 23) return 18;
        if (cmd == 24) return -34;
        if (cmd == 25) return 44;
        if (cmd == 26) return -103;
        if (cmd == 27) return 43;
        if (cmd == 28) return 91;
        if (cmd == 29) return 108;
        if (cmd == 31) return 45;
        if (cmd == 32) return -1;
        if (cmd == 33) return -33;
        if (cmd == 34) return 3;
        if (cmd == 35) return -102;
        if (cmd == 36) return 58;
        if (cmd == 37) return -39;
        if (cmd == 39) return 27;
        if (cmd == 41) return -5;
        if (cmd == 43) return -58;
        if (cmd == 44) return 54;
        if (cmd == 45) return 102;
        if (cmd == 49) return 9;
        if (cmd == 50) return 83;
        if (cmd == 51) return 113;
        if (cmd == 52) return 10;
        if (cmd == 54) return -45;
        if (cmd == 55) return -56;
        if (cmd == 56) return 49;
        if (cmd == 57) return -35;
        if (cmd == 58) return -95;
        if (cmd == 59) return 82;
        if (cmd == 60) return 25;
        if (cmd == 63) return -43;
        if (cmd == 64) return -14;
        if (cmd == 65) return 0;
        if (cmd == 66) return 90;
        if (cmd == 67) return -118;
        if (cmd == 68) return -61;
        if (cmd == 69) return 21;
        if (cmd == 70) return 94;
        if (cmd == 71) return 104;
        if (cmd == 72) return 59;
        if (cmd == 73) return -67;
        if (cmd == 74) return -37;
        if (cmd == 75) return 35;
        if (cmd == 76) return -100;
        if (cmd == 77) return -50;
        if (cmd == 78) return -27;
        if (cmd == 79) return -20;
        if (cmd == 80) return -24;
        if (cmd == 81) return -40;
        if (cmd == 82) return 39;
        if (cmd == 83) return -6;
        if (cmd == 86) return 32;
        if (cmd == 87) return 60;
        if (cmd == 89) return 15;
        if (cmd == 90) return 89;
        if (cmd == 91) return 4;
        if (cmd == 92) return -76;
        if (cmd == 93) return 76;
        if (cmd == 94) return -11;
        if (cmd == 97) return -22;
        if (cmd == 98) return 42;
        if (cmd == 99) return 115;
        if (cmd == 100) return 1;
        if (cmd == 101) return -17;
        if (cmd == 102) return -117;
        if (cmd == 103) return -72;
        if (cmd == 104) return -59;
        if (cmd == 105) return -48;
        if (cmd == 106) return 23;
        if (cmd == 107) return 111;
        if (cmd == 108) return 101;
        if (cmd == 109) return -51;
        if (cmd == 110) return 100;
        if (cmd == 111) return 109;
        if (cmd == 112) return -10;
        if (cmd == 113) return -7;
        if (cmd == 114) return 65;
        if (cmd == 115) return -74;
        if (cmd == 116) return 8;
        if (cmd == 117) return -2;
        if (cmd == 118) return 36;
        if (cmd == 119) return -62;
        if (cmd == 120) return 22;
        if (cmd == 121) return -18;
        if (cmd == 122) return -68;
        if (cmd == 123) return -89;
        if (cmd == 126) return 6;
        if (cmd == 127) return 31;
        return cmd;
    }


    public void disconnect() {
        try {
            if (sc != null) {
                sc.close();
            }
        } catch (Exception e) {
            Log.error("disconnect err", e);
        }
    }

    public void closeMessage() {
        try {
            if (isClosed) {
                return;
            }
            isClosed = true;
            try {
                ServerManager.remove(this.IPAddress);
            } catch (Exception e) {
                Log.error("remove ipv4 from list", e);
            }
            try {
                if (user != null) {
                    try {
                        user.saveData();
                    } catch (Exception e) {
                        Log.error("save user: " + user.username + " - err: " + e.getMessage(), e);
                    } finally {
                        ServerManager.removeUser(user);
                    }
                    if (user.sltChar != null && user.isLoginFinish) {
                        try {
                            user.sltChar.close();
                            user.sltChar.saveData();
                        } catch (Exception e) {
                            Log.error("save player: " + user.sltChar.name + " - err: " + e.getMessage(), e);
                        } finally {
                            ServerManager.removeChar(user.sltChar);
                            user.sltChar.outZone();
                        }

                    }
                }
            } finally {
                close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getCountUseGiftCode() {
//        String ip = this.IPAddress;
//        if (!ServerManager.countUseGiftCodeByIp.containsKey(ip)) {
//            ServerManager.countUseGiftCodeByIp.put(ip, 0);
//        }
        return 999;
    }

    public void addUseGiftCode() {
//        String ip = this.IPAddress;
//        int countUseGiftCodeByIp = getCountUseGiftCode();
//        ServerManager.countUseGiftCodeByIp.put(ip, countUseGiftCodeByIp + 1);
    }


    private class Sender implements Runnable {

        private final ConcurrentLinkedQueue<Message> sendingMessage;

        public Sender() {
            sendingMessage = new ConcurrentLinkedQueue<>();
        }


        public void addMessage(Message message) {
            sendingMessage.offer(message);
        }

        @Override
        public void run() {
            while (isConnected()) {
                try {
                    Message m = sendingMessage.poll();
                    while (m != null) {
                        byte cmd = m.getCommand();
                        byte[] data = m.getData();
                        switch (cmd) {
                            case -92:
                            case -91:
                            case -87:
                            case -81:
                            case -65:
                            case -64:
                            case -63:
                            case -41:
                            case 20:
                            case 61:
                            case 123:
                            case -84:
                                dos.writeByte(cmd);
                                dos.write(data);
                                break;
                            default:
                                if (!m.inflate && data.length < Short.MAX_VALUE) {
                                    dos.writeByte(msgNew(cmd));
                                    if (data != null && data.length > 0) {
                                        byte[] arrayByte = {2, 9, 0, 7, 2, 0, 0, 4};
                                        for (int i = 0; i < data.length; i++) {
                                            if (i % 2 == 0) {
                                                data[i] = (byte) (data[i] + arrayByte[i % arrayByte.length]);
                                            } else {
                                                data[i] = (byte) (data[i] - arrayByte[i % arrayByte.length]);
                                            }
                                        }
                                        dos.writeShort(data.length);
                                        dos.write(data);
                                    } else {
                                        dos.writeShort(0);
                                    }
                                } else {
                                    data = VDTTUtlis.deflateByteArray(data);
                                    dos.writeByte(-80);
                                    dos.writeByte(msgNew(cmd));
                                    if (data != null && data.length > 0) {
                                        byte[] arrayByte = {2, 9, 0, 7, 2, 0, 0, 4};
                                        for (int i = 0; i < data.length; i++) {
                                            if (i % 2 == 0) {
                                                data[i] = (byte) (data[i] + arrayByte[i % arrayByte.length]);
                                            } else {
                                                data[i] = (byte) (data[i] - arrayByte[i % arrayByte.length]);
                                            }
                                        }
                                        dos.writeShort(data.length);
                                        dos.write(data);
                                    } else {
                                        dos.writeShort(0);
                                    }
                                }
                        }
                        dos.flush();
                        m = sendingMessage.poll();
                    }
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException e) {
                    }
                } catch (Exception e) {
//                    e.printStackTrace();
                    closeMessage();
                    return;
                }
            }

        }
    }

    class MessageCollector implements Runnable {

        @Override
        public void run() {
            while (isConnected()) {
                try {
                    byte cmd = dis.readByte();
                    int byte1;
                    int byte2;
                    int byte3;
                    switch (cmd) {
                        case -82:
                            byte1 = dis.readByte();
                            int[] arrayXY = null;
                            try {
                                user.sltChar.x += byte1;
                                service.updateMove(true);
                            } catch (Exception e) {

                            }
                            continue;
                        case -83:
                            byte1 = dis.readByte();
                            try {
                                user.sltChar.y += byte1;
                                service.updateMove(true);
                            } catch (Exception e) {

                            }
                            continue;
                        case -84:
                            byte1 = dis.readUnsignedByte();
                            byte2 = dis.readUnsignedByte();
                            byte3 = dis.readUnsignedByte();
                            user.sltChar.updateXY(VDTTUtlis.getXYReal(byte1, byte2, byte3, MapManager.getInstance().getMapTemplates().get(user.sltChar.mapId).maxX));
                            service.updateMove(false);
                            continue;
                        case 123:
                            byte1 = dis.readUnsignedByte();
                            byte2 = dis.readUnsignedByte();
                            byte3 = dis.readUnsignedByte();
                            user.sltChar.updateXY(VDTTUtlis.getXYReal(byte1, byte2, byte3, MapManager.getInstance().getMapTemplates().get(user.sltChar.mapId).maxX));
                            service.updateMove(false);
                            continue;
                        case 124:
                            byte1 = dis.readByte();
                            user.sltChar.y += byte1;
                            service.updateMove(false);
                            continue;
                        case 125:
                            byte1 = dis.readByte();
                            user.sltChar.x += byte1;
                            service.updateMove(false);
                            continue;
                        case 61:
                            int indexSkill = dis.readByte();
                            user.sltChar.useSkill(indexSkill);
                            continue;
                        case -65:
                        case -60:
                            indexSkill = dis.readByte();
                            int idMob;
                            if (cmd == -65) {
                                idMob = dis.readByte();
                            } else {
                                idMob = dis.readShort();
                            }
                            user.sltChar.attackMob(indexSkill, idMob);
                            continue;
                        case -64:
                            indexSkill = dis.readByte();
                            idMob = dis.readByte();//day
                            user.sltChar.mountAttack(indexSkill, idMob);
                            continue;
                        case -87:
                            dis.readByte();
                            dis.readShort();
                            continue;
                        case -81:
                            dis.readByte();
                            dis.readInt();
                            continue;
                        case 20:
                            byte var = dis.readByte();
                            int var1 = dis.readInt();
                            user.sltChar.attackChar(var1, var);
                            continue;
                    }
                    boolean isDeflate = false;
                    int length = 0;
                    switch (cmd) {
                        case -80:
                            cmd = dis.readByte();
                            length = (dis.readByte() & 255 >> 8) + (dis.readByte() & 255);
                            isDeflate = true;
                            break;
                        default:
                            length = dis.readUnsignedShort();
                            break;
                    }
                    byte[] data = new byte[length];
                    int off = 0;

                    while (length > 0) {
                        int len;
                        if (length - 2048 <= 0) {
                            len = length;
                        } else {
                            len = 2048;
                        }

                        int available = dis.available();
                        if (available == 0) {
                            VDTTUtlis.sleep(1l);
                        } else {
                            if (len > available) {
                                len = available;
                            }

                            dis.read(data, off, len);
                            off += len;
                            length -= len;
                        }
                    }
                    if (isDeflate) {
                        data = VDTTUtlis.inflateByteArray(data);
                    }
                    Message message = new Message(cmd, data);
                    controller.onMessage(message);
                } catch (Exception ex) {
                    closeMessage();
                    return;
                }
            }
        }
    }

}
