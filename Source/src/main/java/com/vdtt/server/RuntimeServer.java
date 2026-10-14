package com.vdtt.server;

import com.vdtt.data.StringMenu;
import com.vdtt.event.Event;
import com.vdtt.event.FideTrungThu;
import com.vdtt.map.GiaiDauSucManh;
import com.vdtt.map.Map;
import com.vdtt.map.MapManager;
import com.vdtt.map.VoDaiSucManh;
import com.vdtt.map.world.SaoDen;
import com.vdtt.map.zones.Zone;
import com.vdtt.model.Char;
import com.vdtt.network.Message;
import com.vdtt.util.Log;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;

public class RuntimeServer implements Runnable {
    private static final RuntimeServer instance = new RuntimeServer();

    public static RuntimeServer gI() {
        return instance;
    }

    public long timeStart = 0;
    private HashSet<Integer> playerIDs = new HashSet<>();
    public int countKillCell;

    public void reset() {
        playerIDs.clear();
    }

    public synchronized void uocRongALL(Char pl, byte type) {
        try {
            GlobalService.getInstance().chat("Hệ thống", "Bầu trời vừa tối lại, c#item" + pl.name + "c#white đã triệu hồi rồng thần", (byte) 1);
            timeStart = System.currentTimeMillis() + 180000;
            RuntimeServer.gI().uocRong(pl.id, (short) 440);
            if (type == 0) {
                pl.getService().effectCerealian();
                pl.getService().menuUocRong(StringMenu.Cerealian);
            } else if (type == 1) {
                pl.getService().effectEath();
                pl.getService().menuUocRong(StringMenu.Eath);
            } else if (type == 2) {
                pl.getService().effectSaoDen();
                pl.getService().menuUocRong(StringMenu.SaoDen);
            } else if (type == 3) {
                pl.getService().testEffect(479);
                pl.getService().menuUocRong(StringMenu.Noel);
            } else if (type == 4) {
                pl.getService().testEffect(450);
                pl.getService().menuUocRong(StringMenu.Namec);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void uocRong(int idPlayer, short id) {
        try {
            Message m = new Message((byte) 3);
            m.writer().writeInt(idPlayer);
            m.writer().writeShort(id);
            GlobalService.getInstance().sendMessage(m);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resetEffectUoc() {
        try {
            timeStart = 0;
            Message m = new Message((byte) 3);
            m.writer().writeInt(-1);
            m.writer().writeShort(440);
            GlobalService.getInstance().sendMessage(m);
        } catch (Exception e) {

        }
    }

    @Override
    public void run() {
       while (Server.start && !VDTT.isStop) {

            try {
                if (timeStart > 0 && timeStart < System.currentTimeMillis()) {
                    resetEffectUoc();
                }
                Calendar cal = Calendar.getInstance();
                int hour = cal.get(Calendar.HOUR_OF_DAY);
                int minute = cal.get(Calendar.MINUTE);
                int second = cal.get(Calendar.SECOND);
                int day = cal.get(Calendar.DAY_OF_WEEK);
                if (minute % 10 == 0 && second == 0 && Event.isTrungThu()) {
                    SpawnBossManager.getInstance().spawnAll(SpawnBossManager.EVENT);
                }
                if (hour == 19 && minute == 35 && second == 0) {
                    MapManager.getInstance().saoDen = new SaoDen();
                    GlobalService.getInstance().chat("Hệ thống", "Sao Đen đã mở cửa, mời các bạn tham gia", (byte) 1);
                }
//                if(hour == 21 &&minute == 0&&second == 0){
//                    VoDaiSucManh.initDauTruong();
//                    GlobalService.getInstance().chat("Hệ thống", "Võ đài vũ trụ đã mở báo danh, mời các bạn tham gia", (byte) 1);
//                }
                if (hour == 21 && minute == 0 && second == 0) {
//                    if(day == 2||day == 4||day == 6) {
                    VoDaiSucManh.initDauTruong();
                    GlobalService.getInstance().chat("Hệ thống", "Võ đài vũ trụ đã mở báo danh, mời các bạn tham gia", (byte) 1);
//                    }else {
//                        GiaiDauSucManh.initDauTruong();
//                        GlobalService.getInstance().chat("Hệ thống", "Giải đấu sức mạnh đã mở báo danh, mời các bạn tham gia", (byte) 1);
//                    }
                }
//                if(hour == 20 &&minute == 0&&second == 0){
//                    try {
//                        Map map = MapManager.getInstance().find(86);
//                        Zone z = map.rand();
//                        FideTrungThu fideTrungThu = new FideTrungThu();
//                        fideTrungThu.zone = z;
//                        fideTrungThu.zone.addChar(fideTrungThu.pl);
//                        z.getService().playerAdd(fideTrungThu.pl);
//                        fideTrungThu.start();
//                        GlobalService.getInstance().chat("Hệ thống", "Em Bé đã xuất hiện tại nhà Bulma . Các chiến binh nhanh chóng tìm kiếm để nhận những món quà bất ngờ", (byte) 1);
//                    } catch (Exception e) {
//
//                    }
//                }
                Thread.sleep(1000l);
            } catch (Exception e) {
                Log.error("RuntimeServer", e);
            }
        }
    }
}
