package com.vdtt.server;

import com.vdtt.admin.AdminSocket;
import com.vdtt.auto.RewardSystem;
import com.vdtt.clan.Clan;
import com.vdtt.data.Caption;
import com.vdtt.data.DataCenter;
import com.vdtt.db.DbManager;
import com.vdtt.effect.EffectTemplateManager;
import com.vdtt.event.Event;
import com.vdtt.item.Item;
import com.vdtt.item.ItemManager;
import com.vdtt.map.MapManager;
import com.vdtt.map.world.WorldManager;
import com.vdtt.mob.MobManager;
import com.vdtt.mob.MobNew;
import com.vdtt.model.Char;
import com.vdtt.model.RandomItem;
import com.vdtt.model.User;
import com.vdtt.network.Session;
import com.vdtt.reward.RewardManager;
import com.vdtt.skill.Skill;
import com.vdtt.skill.SkillTemplate;
import com.vdtt.stall.StallManager;
import com.vdtt.store.StoreManager;
import com.vdtt.util.Log;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
        private static final Set<String> blockedIPs = ConcurrentHashMap.newKeySet();

    public static void blockIP(String ip) {
        if (ip == null || ip.isEmpty()) return;
        blockedIPs.add(ip);
    }

    public static boolean isBlockedIP(String ip) {
        return blockedIPs.contains(ip);
    }
    public static ServerSocket server;
    public static boolean start;
    public static int id;
    private static boolean isStop;

public static void start() {
    VDTT.isStop = false;
    start = true;
    id = 0;

    setOffline();
    WorldManager.getInstance().start();

    try {
        server = new ServerSocket(7105);
        server.setReuseAddress(true); // tránh lỗi chiếm port

        Log.info("Server started port : " + server.getLocalPort());

        // ===== Thread autosave =====
        new Thread(new AutoSaveData(), "AutoSaveData").start();

        // ===== Runtime =====
        Thread runtime = new Thread(RuntimeServer.gI(), "RuntimeServer");
        runtime.start();

        // ===== Stall =====
        Thread stall = new Thread(StallManager.getInstance(), "Gian hàng");
        stall.start();

        // ===== Spawn boss =====
        SpawnBossManager.getInstance().init();
        SpawnBossManager.getInstance().spawnRepeat(SpawnBossManager.FIDE, 1, SpawnBossManager.RANDOM);
        SpawnBossManager.getInstance().spawnRepeat(SpawnBossManager.TUONG_LAI, 1, SpawnBossManager.RANDOM);
        SpawnBossManager.getInstance().spawnRepeat(SpawnBossManager.VAMPA, 1, SpawnBossManager.RANDOM);
        SpawnBossManager.getInstance().spawnRepeat(SpawnBossManager.NAMEC, 1, SpawnBossManager.RANDOM);
        SpawnBossManager.getInstance().spawnRepeat(SpawnBossManager.YARDAT, 1, SpawnBossManager.RANDOM);
        SpawnBossManager.getInstance().spawnRepeat(SpawnBossManager.HOANG_MAC, 1, SpawnBossManager.RANDOM);

        SpawnBossManager.getInstance().spawn(12, 0, 0, SpawnBossManager.ZAMASU, SpawnBossManager.RANDOM);
        SpawnBossManager.getInstance().spawn(22, 0, 0, SpawnBossManager.ZAMASU, SpawnBossManager.RANDOM);
        SpawnBossManager.getInstance().spawn(20, 0, 0, SpawnBossManager.NOEL, SpawnBossManager.ALL);

        TaskResetManager.getInstance().resetNewDay();

        Log.info("Thread Start " + Thread.activeCount());

        // ===== THREAD ACCEPT CLIENT =====
        new Thread(() -> {
            while (start && !VDTT.isStop) {
                try {
                    Socket client = server.accept();

                    if (VDTT.isStop) {
                        client.close();
                        break;
                    }

                    String ip = client.getInetAddress().getHostAddress();
                          // 🚫 CHẶN IP NGAY TẠI ĐÂY
            if (ServerManager.isBlockedIP(ip)) {
                Log.warn("Blocked IP tried to connect: " + ip);
                client.close();
                continue;
            }
                    Session session = new Session(client, ++id);
                    session.IPAddress = ip;

                    ServerManager.add(ip);

                } catch (IOException e) {
                    if (!VDTT.isStop) {
                        Log.error("Accept client error", e);
                    }
                }
            }

            Log.info("Accept thread stopped");
        }, "AcceptClient").start();

    } catch (IOException e) {
        Log.error("Start server failed", e);
    }
}



    public static void updateMaxConnect() {
        try {
            PreparedStatement stmt = DbManager.getInstance().getConnection(DbManager.GAME).prepareStatement("SET GLOBAL max_connections = 10000000000;");
            stmt.executeUpdate();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setOffline() {
        try {
            Connection conn = DbManager.getInstance().getConnection(DbManager.GAME);
            PreparedStatement stmt = conn.prepareStatement("UPDATE `users` SET `online` = ?;");
            stmt.setInt(1, 0);
            stmt.executeUpdate();
            stmt.close();

            stmt = conn.prepareStatement("UPDATE `players` SET `online` = ?;");
            stmt.setInt(1, 0);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void init() {
        Config.getInstance().load();
        if (!DbManager.getInstance().start()) {
            return;
        }
        Caption.a();
        Event.init();
        Event event = Event.getEvent();
        if (event != null) {
            event.loadEventPoint();
            event.initStore();
        }
        ItemManager.getInstance().loadItem();
        ItemManager.getInstance().loadTVMNew();
        ItemManager.getInstance().loadTVMNew2();
        ItemManager.getInstance().loadItemThuVanMay();
        DataCenter.gI().loadData();
        MapManager.getInstance().init();
        StoreManager.getInstance().init();
        EffectTemplateManager.getInstance().init();
        ItemManager.getInstance().loadItemNap();
        RewardManager.gI().init();
        RandomItem.init();
        Clan.getClanDAO().load();
        Ranked.init();
        loadTuiMu();
        loadMount();
        loadSkill();
        loadSKillTemplate();
        initMobNew();
        RewardSystem.initAutoReward();
        AdminSocket.init();
    }

    public static void saveAll() {
//        try {
//            StallManager.getInstance().save();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            List<Clan> clans = Clan.getClanDAO().getAll();
            synchronized (clans) {
                for (Clan clan : clans) {
                    Clan.getClanDAO().update(clan);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            List<Char> chars = ServerManager.getChars();
            for (Char _char : chars) {
                try {
                    if (!_char.isCleaned) {
                        _char.saveData();
                        if (!_char.user.isCleaned) {
                            _char.user.saveData();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
//            Log.info("Làm mới bảng xếp hạng");
//            Ranked.refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

public static void stop() {

    Log.info("=== STOP SERVER ===");

    // 1. set cờ
    VDTT.isStop = true;
    start = false;

    // 2. stop hệ thống
    Clan.running = false;

 ///   try {
     //   SpawnBossManager.getInstance().stop(); // 🔴 QUAN TRỌNG
  //  } catch (Exception ignored) {}

    try {
        WorldManager.getInstance().close();
    } catch (Exception ignored) {}

    try {
        StallManager.getInstance().stop();
    } catch (Exception ignored) {}

    try {
        RewardSystem.shutdown();
    } catch (Exception ignored) {}

    // 3. save clan
    try {
        List<Clan> clans = Clan.getClanDAO().getAll();
        synchronized (clans) {
            for (Clan clan : clans) {
                Clan.getClanDAO().update(clan);
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    // 4. đóng socket để nhả accept()
    try {
        if (server != null && !server.isClosed()) {
            server.close();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    // 5. đóng session / tài nguyên
    close();

    Log.info("=== SERVER STOPPED SUCCESSFULLY ===");
}



    public static void close() {
        try {
            List<User> users = ServerManager.getUsers();
            for (User user : users) {
                if (!user.isCleaned) {
                    user.session.closeMessage();
                }
            }
            server.close();
            server = null;
            if (ServerManager.getUsers().isEmpty()) {

            }
            Log.info("End socket");
        } catch (IOException e) {
        }
    }

    public static void maintance() {
        try {
            Calendar calendar = Calendar.getInstance();
            VDTT.isStop = true;
            Log.info("Chuẩn bị đóng máy chủ.");
            String name = "Hệ thống";
//            String text = "Máy chủ bảo trì sau 5 phút, vui lòng thoát game để tránh mất dữ liệu!";
//            GlobalService.getInstance().chat(name, text, (byte) 1);
//            Log.info("Hệ thống Đóng sau 5 phút.");
//            Thread.sleep(240000);
            String text2 = "Máy chủ bảo trì sau 1 phút, vui lòng thoát game để tránh mất dữ liệu!";
            GlobalService.getInstance().chat(name, text2, (byte) 1);
            Log.info("Hệ thống Đóng sau 1 phút.");
            Thread.sleep(60000);
            Log.info("Hệ thống Bắt đầu đóng máy chủ.");
            Server.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loadTuiMu() {
        try {
            Connection conn = DbManager.getInstance().getConnection(DbManager.GAME);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM `tuimu`;");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                boolean isLock = resultSet.getBoolean("isLock");
                int quantity = resultSet.getInt("quantity");
                long expire = resultSet.getLong("expire");
                String options = resultSet.getString("option");
                int percent = resultSet.getInt("percent");
                int type = resultSet.getInt("type");
                int upgrade = resultSet.getInt("upgrade");
                Item item = new Item(id);
                item.isLock = isLock;
                item.setQuantity(quantity);
                item.expire = expire;
                item.strOption = options;
                item.upgrade = (byte) upgrade;
                if (type == 0) {
                    RandomItem.TUI_MU_NHO.add(percent, item);
                } else if (type == 1) {
                    RandomItem.TUI_MU_LON.add(percent, item);
                }
            }
            resultSet.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void loadMount() {
        try {
            Connection conn = DbManager.getInstance().getConnection(DbManager.GAME);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM `mount`;");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int frameStart = resultSet.getInt("frameStart");
                int frameEnd = resultSet.getInt("frameEnd");
                int tick = resultSet.getInt("tick");
                int attackStart = resultSet.getInt("attackStart");
                int attackEnd = resultSet.getInt("attackEnd");
                int tickAttack = resultSet.getInt("tickAttack");
                int dx = resultSet.getInt("dx");
                int dy = resultSet.getInt("dy");
                Mount mount = new Mount(id, frameStart, frameEnd, tick, attackStart, attackEnd, tickAttack, dx, dy);
                MountManager.getInstance().addMount(mount);
            }
            resultSet.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void loadSkill() {
        try {
            Connection conn = DbManager.getInstance().getConnection(DbManager.GAME);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM `skill`;");
            ResultSet resultSet = stmt.executeQuery();
            List<Skill> skills = new ArrayList<>();
            while (resultSet.next()) {
                Skill skill = new Skill();
                skill.id = resultSet.getShort("id");
                skill.coolDown = resultSet.getInt("coolDown");
                skill.maxTarget = resultSet.getByte("maxTarget");
                skill.level = resultSet.getByte("level");
                skill.levelNeed = resultSet.getShort("levelNeed");
                skill.isSkillTemplate = resultSet.getShort("isSkillTemplate");
                skill.rangeDoc = resultSet.getShort("rangeDoc");
                skill.rangeNgang = resultSet.getShort("rangeNgang");
                skill.m = resultSet.getString("m");
                skill.mpUsing = resultSet.getShort("mpUsing");
                skill.kiUpgrade = resultSet.getLong("kiUpgrade");
                skills.add(skill);
            }
            Log.debug("Load skill: " + skills.size());
            DataCenter.gI().skill = skills.toArray(new Skill[0]);
            resultSet.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void loadSKillTemplate() {
        try {
            Connection conn = DbManager.getInstance().getConnection(DbManager.GAME);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM `skilltemplate`;");
            ResultSet resultSet = stmt.executeQuery();
            List<SkillTemplate> skillTemplates = new ArrayList<>();
            while (resultSet.next()) {
                SkillTemplate skillTemplate = new SkillTemplate(resultSet.getInt("id"));
                skillTemplate.name = resultSet.getString("name");
                skillTemplate.detail = resultSet.getString("detail");
                skillTemplate.levelNeed = resultSet.getShort("levelNeed");
                skillTemplate.idChar = resultSet.getByte("idChar");
                skillTemplate.levelMax = resultSet.getByte("levelMax");
                skillTemplate.type = resultSet.getByte("type");
                skillTemplate.idIcon = resultSet.getShort("idIcon");
                skillTemplate.i = resultSet.getShort("i");
                skillTemplates.add(skillTemplate);
            }
            Log.debug("Load skill template: " + skillTemplates.size());
            DataCenter.gI().skillTemplate = skillTemplates.toArray(new SkillTemplate[0]);
            resultSet.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void initMobNew() {
        try {
            Connection conn = DbManager.getInstance().getConnection(DbManager.GAME);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM `mobnew`;");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("pet_id");
                int dxMove = resultSet.getInt("dxMove");
                int dyMove = resultSet.getInt("dyMove");
                int dxStand = resultSet.getInt("dxStand");
                int dyStand = resultSet.getInt("dyStand");
                int frameStartMove = resultSet.getInt("frameStartMove");
                int frameEndMove = resultSet.getInt("frameEndMove");
                int frameStartStand = resultSet.getInt("frameStartStand");
                int frameEndStand = resultSet.getInt("frameEndStand");
                boolean isBong = resultSet.getBoolean("isBong");
                MobNew mobNew = new MobNew(id, dxMove, dyMove, dxStand, dyStand, frameStartMove, frameEndMove, frameStartStand, frameEndStand, isBong);
                MobManager.getInstance().addMobNew(mobNew);
            }
            resultSet.close();
            stmt.close();
            Log.info("Init mob new done: " + MobManager.getInstance().mobNews.size());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
