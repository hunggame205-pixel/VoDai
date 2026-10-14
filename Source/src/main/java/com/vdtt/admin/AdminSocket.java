package com.vdtt.admin;

import com.vdtt.data.DataCenter;
import com.vdtt.db.DbManager;
import com.vdtt.event.Event;
import com.vdtt.mail.Mail;
import com.vdtt.mob.Mob;
import com.vdtt.mob.MobTemplate;
import com.vdtt.model.Char;
import com.vdtt.model.User;
import com.vdtt.server.Config;
import com.vdtt.server.Server;
import com.vdtt.server.ServerManager;
import com.vdtt.server.SpawnBoss;
import com.vdtt.server.SpawnBossManager;
import com.vdtt.store.Store;
import com.vdtt.store.StoreManager;
import com.vdtt.util.Log;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AdminSocket {

    private static final byte[] STORE_TYPES = {
            StoreManager.TYPE_TIEN_LOI, StoreManager.TYPE_KHU_KHOA, StoreManager.TYPE_KY_NANG,
            StoreManager.TYPE_DO_XIN, StoreManager.TYPE_TRANG_PHUC, StoreManager.TYPE_CAI_TRANG,
            StoreManager.TYPE_THOI_TRANG, StoreManager.TYPE_COMBO
    };

    private static final String[] BOSS_KEYS = {
            SpawnBossManager.FIDE, SpawnBossManager.TUONG_LAI, SpawnBossManager.VAMPA, SpawnBossManager.NAMEC,
            SpawnBossManager.YARDAT, SpawnBossManager.ZAMASU, SpawnBossManager.HOANG_MAC, SpawnBossManager.EVENT,
            SpawnBossManager.NOEL
    };

    private static final long startedAt = System.currentTimeMillis();

    private static boolean running;

    private static ScheduledExecutorService scheduler;

    public static synchronized void init() {
        if (running) {
            return;
        }
        running = true;
        Thread thread = new Thread(AdminSocket::listen, "AdminSocket");
        thread.setDaemon(true);
        thread.start();
    }

    private static void listen() {
        int port = Config.getInstance().getAdminPort();
        try (ServerSocket server = new ServerSocket(port, 50, InetAddress.getByName("127.0.0.1"))) {
            Log.info("AdminSocket dang chay o cong " + port);
            while (true) {
                Socket client = server.accept();
                Thread handler = new Thread(() -> handle(client), "AdminSocket-client");
                handler.setDaemon(true);
                handler.start();
            }
        } catch (Exception e) {
            running = false;
            Log.error("AdminSocket err: " + e.getMessage(), e);
        }
    }

    private static void handle(Socket socket) {
        try (Socket client = socket;
             BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream(), StandardCharsets.UTF_8));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream(), StandardCharsets.UTF_8))) {
            String line = reader.readLine();
            if (line == null) {
                return;
            }
            writer.write(run(line.trim()));
            writer.write("\n");
            writer.flush();
        } catch (Exception e) {
            Log.error("AdminSocket err: " + e.getMessage(), e);
        }
    }

    private static String run(String line) {
        String key = Config.getInstance().getAdminKey();
        if (key == null || key.isEmpty() || !line.startsWith(key + " ")) {
            return "SAI KEY ADMIN";
        }
        String command = line.substring(key.length() + 1).trim();
        if (command.equals("INFO")) {
            return info();
        }
        if (command.equals("SAVE_ALL")) {
            Server.saveAll();
            return "OK Da luu du lieu";
        }
        if (command.equals("SYNC_STORE")) {
            return syncStore();
        }
        if (command.startsWith("KICK ")) {
            return kick(command.substring(5).trim());
        }
        if (command.startsWith("BROADCAST ")) {
            return broadcast(command.substring(10).trim());
        }
        if (command.startsWith("MAIL ")) {
            return mail(command.substring(5).trim());
        }
        if (command.startsWith("MAINTENANCE_TIME")) {
            return maintenanceTime(command.substring(16).trim());
        }
        if (command.equals("MAINTENANCE") || command.startsWith("MAINTENANCE ")) {
            return maintenance(command.substring(11).trim());
        }
        if (command.equals("CONFIG")) {
            return config();
        }
        if (command.equals("BOSS_LIST")) {
            return bossList();
        }
        if (command.startsWith("BOSS_RESPAWN_IDLE")) {
            return bossRespawnIdle();
        }
        if (command.equals("BOSS_RESET_ALL")) {
            return bossResetAll();
        }
        if (command.startsWith("BOSS_RESPAWN ")) {
            return bossRespawn(command.substring(13).trim());
        }
        if (command.startsWith("SET_EXP ")) {
            return setExp(command.substring(8).trim());
        }
        if (command.equals("SET_EVENT") || command.startsWith("SET_EVENT ")) {
            return setEvent(command.length() > 9 ? command.substring(9).trim() : "");
        }
        return "LENH KHONG HOP LE: " + command;
    }

    private static String info() {
        Runtime runtime = Runtime.getRuntime();
        long total = runtime.totalMemory();
        long used = total - runtime.freeMemory();
        long uptime = (System.currentTimeMillis() - startedAt) / 1000;
        return String.format("OK online=%d, nho=%d/%dMB, uptime=%ds",
                ServerManager.getNumberOnline(), used / 1048576, total / 1048576, uptime);
    }

    private static String bossList() {
        List<String> rows = new ArrayList<>();
        int idle = 0;
        for (String key : BOSS_KEYS) {
            List<SpawnBoss> bosses = SpawnBossManager.getInstance().getListSpawnBoss(key);
            if (bosses == null) {
                continue;
            }
            for (SpawnBoss boss : bosses) {
                Mob mob = boss.getCurrMonster();
                int mobId = bossMobId(boss);
                String status;
                String name;
                String mapName = boss.getMap() == null || boss.getMap().mapTemplate == null ? "" : String.valueOf(boss.getMap().mapTemplate.name);
                String zone = "";
                if (mob == null) {
                    status = "IDLE";
                    name = bossMobName(boss);
                } else {
                    status = mob.isDead ? "DEAD" : "ACTIVE";
                    name = mob.getTemplate() == null ? bossMobName(boss) : mob.getTemplate().name;
                    if (mob.zone != null) {
                        zone = String.valueOf(mob.zone.id);
                        if (mob.zone.template != null) {
                            mapName = String.valueOf(mob.zone.template.name);
                        }
                    }
                }
                if (!"ACTIVE".equals(status)) {
                    idle++;
                }
                rows.add(key + "|" + boss.getId() + "|" + name + "|" + status + "|" + mapName + "|" + zone + "|" + boss.getHp() + "|" + mobId);
            }
        }
        return "OK total=" + rows.size() + "; idle=" + idle + "\n" + String.join("\n", rows);
    }

    private static int bossMobId(SpawnBoss boss) {
        Mob mob = boss.getCurrMonster();
        if (mob != null && mob.getTemplate() != null && mob.getTemplate().id > 0) {
            return mob.getTemplate().id;
        }
        Integer mobId = boss.getMobs().first();
        return mobId == null ? 0 : mobId;
    }

    private static String bossMobName(SpawnBoss boss) {
        int mobId = bossMobId(boss);
        MobTemplate[] templates = DataCenter.gI().mobTemplate;
        if (templates == null || mobId <= 0 || mobId >= templates.length || templates[mobId] == null
                || templates[mobId].name == null || templates[mobId].name.isEmpty()) {
            return "Boss #" + boss.getId();
        }
        return templates[mobId].name;
    }

    private static String bossRespawn(String payload) {
        String[] parts = payload.split("\\s+");
        if (parts.length < 2) {
            return "THIEU NHOM BOSS VA ID";
        }
        List<SpawnBoss> bosses = SpawnBossManager.getInstance().getListSpawnBoss(parts[0]);
        if (bosses == null) {
            return "NHOM BOSS KHONG HOP LE: " + parts[0];
        }
        int id;
        try {
            id = Integer.parseInt(parts[1]);
        } catch (Exception e) {
            return "ID BOSS KHONG HOP LE: " + parts[1];
        }
        for (SpawnBoss boss : bosses) {
            if (boss.getId() == id) {
                boss.spawn();
                return "OK Da trieu hoi " + bossMobName(boss) + " #" + id;
            }
        }
        return "KHONG TIM THAY BOSS #" + id + " TRONG NHOM " + parts[0];
    }

    private static String bossResetAll() {
        int done = 0;
        for (String group : BOSS_KEYS) {
            List<SpawnBoss> bosses = SpawnBossManager.getInstance().getListSpawnBoss(group);
            if (bosses == null) {
                continue;
            }
            for (SpawnBoss boss : bosses) {
                Mob mob = boss.getCurrMonster();
                if (mob == null) {
                    continue;
                }
                if (!mob.bossEvent()) {
                    mob.die();
                }
                boss.setCurrMonster(null);
                done++;
            }
        }
        return "OK Da reset " + done + " boss";
    }

    private static String bossRespawnIdle() {
        int done = 0;
        for (String group : BOSS_KEYS) {
            List<SpawnBoss> bosses = SpawnBossManager.getInstance().getListSpawnBoss(group);
            if (bosses == null) {
                continue;
            }
            for (SpawnBoss boss : bosses) {
                Mob mob = boss.getCurrMonster();
                if (mob == null || mob.isDead) {
                    boss.spawn();
                    done++;
                }
            }
        }
        return "OK Da hoi sinh " + done + " boss nghi";
    }

    private static String config() {
        Config config = Config.getInstance();
        String event = config.getEvent();
        return "OK expRate=" + config.getExpRate() + "; event=" + (event == null ? "" : event.trim())
                + "; port=" + config.getPort() + "; serverId=" + config.getServerID();
    }

    private static String setExp(String payload) {
        int rate;
        try {
            rate = Integer.parseInt(payload.trim());
        } catch (Exception e) {
            return "TY LE EXP KHONG HOP LE";
        }
        if (rate < 1 || rate > 1000) {
            return "TY LE EXP KHONG HOP LE";
        }
        Config.getInstance().setExpRate(rate);
        return "OK expRate=" + rate;
    }

    private static String setEvent(String payload) {
        String name = payload.trim();
        if (!name.isEmpty()) {
            try {
                Class<?> type = Class.forName(name);
                if (!Event.class.isAssignableFrom(type) || Modifier.isAbstract(type.getModifiers())) {
                    return "SU KIEN KHONG HOP LE " + name;
                }
            } catch (ClassNotFoundException e) {
                return "KHONG TIM THAY SU KIEN " + name;
            }
        }
        Config.getInstance().setEvent(name);
        Event.init();
        return "OK event=" + name;
    }

    private static String maintenance(String payload) {
        int seconds;
        try {
            seconds = Integer.parseInt(payload.trim());
        } catch (Exception e) {
            seconds = 0;
        }
        if (seconds < 0) {
            seconds = 0;
        }
        final int delay = seconds;
        Thread thread = new Thread(() -> {
            if (delay > 0) {
                Log.info("Bao tri sau " + delay + " giay.");
                try {
                    Thread.sleep(delay * 1000L);
                } catch (InterruptedException e) {
                    return;
                }
            }
            Server.maintance();
            System.exit(0);
        }, "AdminMaintenance");
        thread.setDaemon(true);
        thread.start();
        return "OK Bao tri sau " + delay + " giay";
    }

    private static String maintenanceTime(String payload) {
        String value = payload.trim();
        if (!value.matches("([01]\\d|2[0-3]):[0-5]\\d")) {
            return "GIO KHONG HOP LE";
        }
        if (scheduler != null) {
            scheduler.shutdownNow();
        }
        scheduler = Executors.newSingleThreadScheduledExecutor(runnable -> {
            Thread thread = new Thread(runnable, "AdminMaintenanceDaily");
            thread.setDaemon(true);
            return thread;
        });
        String[] parts = value.split(":");
        Calendar next = Calendar.getInstance();
        next.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parts[0]));
        next.set(Calendar.MINUTE, Integer.parseInt(parts[1]));
        next.set(Calendar.SECOND, 0);
        next.set(Calendar.MILLISECOND, 0);
        if (next.getTimeInMillis() <= System.currentTimeMillis()) {
            next.add(Calendar.DAY_OF_MONTH, 1);
        }
        long delay = next.getTimeInMillis() - System.currentTimeMillis();
        scheduler.scheduleAtFixedRate(() -> {
            Server.maintance();
            System.exit(0);
        }, delay, 86400000L, TimeUnit.MILLISECONDS);
        return "OK Hen bao tri hang ngay luc " + value;
    }

    private static String syncStore() {
        int loaded = 0;
        for (byte type : STORE_TYPES) {
            Store store = StoreManager.getInstance().find(type);
            if (store == null) {
                continue;
            }
            store.getItems().clear();
            if (store.load()) {
                loaded++;
            }
        }
        return "OK Da nap lai " + loaded + " shop";
    }

    private static String kick(String username) {
        if (username.isEmpty()) {
            return "THIEU TEN TAI KHOAN";
        }
        User user = ServerManager.findUserByUsername(username);
        if (user == null) {
            return "KHONG TIM THAY TAI KHOAN " + username;
        }
        user.session.closeMessage();
        return "OK Da kick " + username;
    }

    private static String mail(String payload)
    {
        int split = payload.indexOf('{');
        if (split <= 0) {
            return "THIEU DU LIEU THU";
        }
        String name = payload.substring(0, split).trim();
        JSONObject json;
        try {
            json = (JSONObject) JSONValue.parse(payload.substring(split).trim());
        } catch (Exception e) {
            json = null;
        }
        if (name.isEmpty()) {
            return "THIEU TEN NHAN VAT";
        }
        if (json == null) {
            return "JSON THU KHONG HOP LE";
        }
        if (json.get("item") == null) {
            json.remove("item");
        }
        Mail mail;
        try {
            mail = new Mail(json);
        } catch (Exception e) {
            return "THU THIEU DU LIEU: " + e.getMessage();
        }
        Char online = ServerManager.findCharByName(name);
        if (online != null) {
            if (online.mailManager.size() >= 120) {
                return "HOM THU DAY";
            }
            mail.id = online.mailManager.getID();
            online.mailManager.addMail(mail);
            return saveMail(name, online.mailManager.toJson());
        }
        List<Mail> list = DbManager.getInstance().getMail(name);
        if (list.size() >= 120) {
            return "HOM THU DAY";
        }
        mail.id = list.isEmpty() ? 0 : list.get(list.size() - 1).id + 1;
        list.add(mail);
        JSONArray array = new JSONArray();
        for (Mail item : list) {
            array.add(item.toJson());
        }
        return saveMail(name, array);
    }

    private static String saveMail(String name, JSONArray array)
    {
        try (Connection conn = DbManager.getInstance().getConnection(DbManager.UPDATE);
             PreparedStatement stmt = conn.prepareStatement("UPDATE `players` SET `mail` = ? WHERE `name` = ?")) {
            stmt.setString(1, array.toJSONString());
            stmt.setString(2, name);
            if (stmt.executeUpdate() <= 0) {
                return "KHONG TIM THAY NHAN VAT " + name;
            }
        } catch (Exception e) {
            Log.error("AdminSocket mail err: " + e.getMessage(), e);
            return "LOI LUU THU: " + e.getMessage();
        }
        return "OK Da gui thu cho " + name;
    }

    private static String broadcast(String text) {
        if (text.isEmpty()) {
            return "THIEU NOI DUNG THONG BAO";
        }
        List<Char> players = ServerManager.getChars();
        for (Char player : players) {
            player.serverDialog(text);
        }
        return "OK Da gui thong bao cho " + players.size() + " nguoi choi";
    }
}
