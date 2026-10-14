package com.vdtt.server;

import com.vdtt.clan.Clan;
import com.vdtt.db.DbManager;
import com.vdtt.model.Char;
import com.vdtt.util.Log;
import com.vdtt.util.VDTTUtlis;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskResetManager {
    private static TaskResetManager instance;
    private final ConcurrentHashMap<Integer, LocalDateTime> playerLastResetTimes = new ConcurrentHashMap<>();
    private final LocalTime[] resetTimes = {
            LocalTime.of(0, 0),
            LocalTime.of(4, 0),
            LocalTime.of(8, 0),
            LocalTime.of(12, 0),
            LocalTime.of(16, 0),
            LocalTime.of(20, 0)
    };

    // Public method to provide access to the singleton instance
    public static synchronized TaskResetManager getInstance() {
        if (instance == null) {
            instance = new TaskResetManager();
        }
        return instance;
    }
    public void resetNewDay() {
        VDTTUtlis.schedule(() -> {
            resetNewDayAllPlayer();
            resetClanNewDay();
            ServerManager.countUseItemDT.clear();
        }, 0, 0, 0);
    }
    public void resetNewDayAllPlayer() {
        List<Char> chars = ServerManager.getChars();
        try {
            Connection conn = DbManager.getInstance().getConnection(DbManager.SAVE_DATA);
            try {
                String sql = "UPDATE `players` SET `last_login_time` = ? WHERE `id` = ? LIMIT 1;";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    for (Char pl : chars) {
                        try {
                            if (pl != null && !pl.isCleaned) {
                                pl.resetNewDay();
                                stmt.setLong(1, System.currentTimeMillis());
                                stmt.setInt(2, pl.id);
                                stmt.executeUpdate();
                            }
                        } catch (SQLException e) {
                            Log.error("Failed to update player: " + pl.id, e);
                        } catch (Exception e) {
                            Log.error("Unexpected error for player: " + pl.id, e);
                        }
                    }
                }
            } catch (SQLException e) {
                Log.error("Database connection error", e);
            } catch (Exception e) {
                Log.error("Unexpected error", e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resetClanNewDay(){
        try {
            List<Clan> clans = Clan.getClanDAO().getAll();
            Connection conn = DbManager.getInstance().getConnection(1);
            Date now = new Date();
            synchronized (clans) {
                for (Clan clan : clans) {
                    try {
                        clan.openDun = 1;
                        clan.countKick = 5;
                        clan.countInvite = 5;
                        PreparedStatement stmt3 = conn.prepareStatement(
                                "UPDATE `clan` SET `open_dun` = 1,`countinvite` = 5,`countkick` = 5, `updated_at` = ? WHERE `id` = ? LIMIT 1;");
                        stmt3.setString(1, VDTTUtlis.dateToString(now, "yyyy-MM-dd"));
                        stmt3.setInt(2, clan.id);
                        stmt3.executeUpdate();
                        stmt3.close();
                    } catch (Exception e) {
                        Log.error("update err ", e);
                    }
                }
            }
        } catch (Exception e) {
            Log.error("resetClanNewDay err ", e);
        }
    }

}

