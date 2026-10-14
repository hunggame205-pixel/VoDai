package com.vdtt.server;

import com.vdtt.clan.Clan;
import com.vdtt.clan.Member;
import com.vdtt.db.DbManager;
import com.vdtt.util.Log;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.*;

public class Ranked {
    public static final String[] NAME = {"Top Cao Thủ", "Top Phẩm chất", "Top Sôi nổi", "TOP Vũ Trụ","Top Nạp thẻ"};

    public static final Vector[] RANKED = new Vector[13];

    public static void init() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                refresh();
            }
        };
        long delay = 60 * 60 * 1000;
        Timer timer = new Timer("Ranked");
        timer.schedule(timerTask, 0, delay);
    }

    public static void refresh() {
        initTopCaoThu();
        initTopVuTru();
        initTopNap();
        initTopKillBossVuTru();
        initTopByClass(0);
        initTopByClass(1);
        initTopByClass(2);
        initTopByClass(3);
        initTopByClass(4);
        initTopByClass(5);
        initTopPhamChat();
        Log.info("Refresh ranked success.");
    }

    public static void initTopCaoThu() {
        try {
            Vector ranked = new Vector<>();
            Connection conn = DbManager.getInstance().getConnection(DbManager.SERVER);
            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT `name`,`clan`,`class`, CAST(JSON_EXTRACT(data, \"$.exp\") AS UNSIGNED) AS `exp` FROM players where `server_id` = ? AND created_at > ? ORDER BY `exp` DESC LIMIT 100;");
            stmt.setInt(1, Config.getInstance().getServerID());
            LocalDateTime targetDate = LocalDateTime.of(2024, 11, 11, 5, 0);
            stmt.setTimestamp(2, Timestamp.valueOf(targetDate));
            ResultSet res = stmt.executeQuery();
            ArrayList<CaoThu> list = new ArrayList<>();
            while (res.next()) {
                CaoThu rank = new CaoThu();
                rank.num = res.getLong("exp");
                rank.name = res.getString("name");
                int clan = res.getInt("clan");
                if (clan != 0) {
                    Optional<Clan> g = Clan.getClanDAO().get(clan);
                    if (g != null && g.isPresent()) {
                        Member mem = g.get().getMemberByName(rank.name);
                        if (mem != null) {
                            rank.clanName = g.get().getName();
                        }
                    }
                }
                rank.classId = (byte) (res.getByte("class") + 1);
                list.add(rank);
            }
            order(list);
            for (CaoThu c : list) {
                ranked.add(c);
            }
            res.close();
            stmt.close();
            RANKED[0] = ranked;
        } catch (SQLException ex) {
            Log.error("init top cao thu", ex);
        }
    }
    public static void initTopPhamChat() {
        try {
            Vector ranked = new Vector<>();
            Connection conn = DbManager.getInstance().getConnection(DbManager.SERVER);
            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT `name`,`clan`,`class`, CAST(JSON_EXTRACT(data, \"$.pointPhamChat\") AS UNSIGNED) AS `exp` FROM players where `server_id` = ? AND created_at > ? ORDER BY `exp` DESC LIMIT 100;");
            stmt.setInt(1, Config.getInstance().getServerID());
            LocalDateTime targetDate = LocalDateTime.of(2024, 11, 11, 5, 0);
            stmt.setTimestamp(2, Timestamp.valueOf(targetDate));
            ResultSet res = stmt.executeQuery();
            ArrayList<CaoThu> list = new ArrayList<>();
            while (res.next()) {
                CaoThu rank = new CaoThu();
                rank.num = res.getLong("exp");
                rank.name = res.getString("name");
                int clan = res.getInt("clan");
                if (clan != 0) {
                    Optional<Clan> g = Clan.getClanDAO().get(clan);
                    if (g != null && g.isPresent()) {
                        Member mem = g.get().getMemberByName(rank.name);
                        if (mem != null) {
                            rank.clanName = g.get().getName();
                        }
                    }
                }
                rank.classId = (byte) (res.getByte("class") + 1);
                list.add(rank);
            }
            order(list);
            for (CaoThu c : list) {
                ranked.add(c);
            }
            res.close();
            stmt.close();
            RANKED[12] = ranked;
        } catch (SQLException ex) {
            Log.error("init top pham chat", ex);
        }
    }

    public static void initTopByClass(int clazz) {
        try {
            Vector ranked = new Vector<>();
            Connection conn = DbManager.getInstance().getConnection(DbManager.SERVER);
            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT `name`,`clan`, CAST(JSON_EXTRACT(data, \"$.exp\") AS UNSIGNED) AS `exp` FROM players where `class` = ? AND created_at > ? ORDER BY `exp` DESC LIMIT 20;");
            stmt.setInt(1, clazz);
            LocalDateTime targetDate = LocalDateTime.of(2024, 11, 11, 5, 0);
            stmt.setTimestamp(2, Timestamp.valueOf(targetDate));
            ResultSet res = stmt.executeQuery();
            ArrayList<CaoThu> list = new ArrayList<>();
            while (res.next()) {
                CaoThu rank = new CaoThu();
                rank.num = res.getLong("exp");
                rank.name = res.getString("name");
                int clan = res.getInt("clan");
                if (clan != 0) {
                    Optional<Clan> g = Clan.getClanDAO().get(clan);
                    if (g != null && g.isPresent()) {
                        Member mem = g.get().getMemberByName(rank.name);
                        if (mem != null) {
                            rank.clanName = g.get().getName();
                        }
                    }
                }
                rank.classId = (byte) (clazz + 1);
                list.add(rank);
            }
            order(list);
            for (CaoThu c : list) {
                ranked.add(c);
            }
            res.close();
            stmt.close();
            RANKED[6+clazz] = ranked;
        } catch (SQLException ex) {
            Log.error("init top cao thu", ex);
        }
    }
    public static void initTopNap() {
        try {
            Vector ranked = new Vector<>();
            Connection conn = DbManager.getInstance().getConnection(DbManager.SERVER);
            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT `name`,`clan`,`class`, CAST(JSON_EXTRACT(data, \"$.mocNap\") AS UNSIGNED) AS `mocNap` FROM players where `server_id` = ? AND created_at > ? ORDER BY `mocNap` DESC LIMIT 100;");
            stmt.setInt(1, Config.getInstance().getServerID());
            LocalDateTime targetDate = LocalDateTime.of(2024, 11, 11, 5, 0);
            stmt.setTimestamp(2, Timestamp.valueOf(targetDate));
            ResultSet res = stmt.executeQuery();
            ArrayList<CaoThu> list = new ArrayList<>();
            while (res.next()) {
                CaoThu rank = new CaoThu();
                rank.num = res.getLong("mocNap");
                rank.name = res.getString("name");
                int clan = res.getInt("clan");
                if (clan != 0) {
                    Optional<Clan> g = Clan.getClanDAO().get(clan);
                    if (g != null && g.isPresent()) {
                        Member mem = g.get().getMemberByName(rank.name);
                        if (mem != null) {
                            rank.clanName = g.get().getName();
                        }
                    }
                }
                rank.classId = (byte) (res.getByte("class") + 1);
                list.add(rank);
            }
            order(list);
            for (CaoThu c : list) {
                ranked.add(c);
            }
            res.close();
            stmt.close();
            RANKED[2] = ranked;
        } catch (Exception ex) {
            Log.error("init top nap", ex);
        }
    }

    public static void initTopVuTru() {
        try {
            Vector ranked = new Vector<>();
            Connection conn = DbManager.getInstance().getConnection(DbManager.SERVER);
            PreparedStatement stmt = conn
                    .prepareStatement("SELECT `id` FROM `clan` WHERE `level` > 0 ORDER BY `level` DESC LIMIT 100;");
            ResultSet res = stmt.executeQuery();
            int i = 1;
            while (res.next()) {
                int id = res.getInt("id");
                Optional<Clan> g = Clan.getClanDAO().get(id);
                if (g != null && g.isPresent()) {
                    Clan clan = g.get();
                    ranked.add(clan);
                }
            }
            ranked.sort(new Comparator<Clan>() {
                @Override
                public int compare(Clan o1, Clan o2) {
                    int level1 = o1.getLevel();
                    int level2 = o2.getLevel();
                    int comp = Integer.compare(level2, level1);
                    if (comp != 0) {
                        return comp;
                    }
                    long exp1 = o1.getExp();
                    long exp2 = o2.getExp();
                    return Long.compare(exp2, exp1);
                }
            });
            res.close();
            stmt.close();
            RANKED[1] = ranked;
        } catch (SQLException ex) {
            Log.error("init top gia toc", ex);
        }
    }
    public static void initTopKillBossVuTru() {
        try {
            Vector ranked = new Vector<>();
            Connection conn = DbManager.getInstance().getConnection(DbManager.SERVER);
            PreparedStatement stmt = conn
                    .prepareStatement("SELECT `id` FROM `clan` WHERE `pointKillBoss` > 0 ORDER BY `pointKillBoss` DESC LIMIT 100;");
            ResultSet res = stmt.executeQuery();
            int i = 1;
            while (res.next()) {
                int id = res.getInt("id");
                Optional<Clan> g = Clan.getClanDAO().get(id);
                if (g != null && g.isPresent()) {
                    Clan clan = g.get();
                    ranked.add(clan);
                }
            }
            res.close();
            stmt.close();
            RANKED[3] = ranked;
        } catch (SQLException ex) {
            Log.error("init top gia toc", ex);
        }
    }

    private static void order(List<CaoThu> ranks) {

        Collections.sort(ranks, new Comparator() {

            public int compare(Object o1, Object o2) {

                Long level1 = ((CaoThu) o1).num;
                Long level2 = ((CaoThu) o2).num;
                return level2.compareTo(level1);
            }
        });
    }
}
