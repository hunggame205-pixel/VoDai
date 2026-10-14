package com.vdtt.auto;

import com.vdtt.db.DbManager;
import com.vdtt.item.Item;
import com.vdtt.mail.Mail;
import com.vdtt.model.Char;
import com.vdtt.reward.DailyReward;
import com.vdtt.reward.RewardManager;
import com.vdtt.server.CaoThu;
import com.vdtt.server.Config;
import com.vdtt.server.Ranked;
import com.vdtt.server.ServerManager;
import com.vdtt.util.Log;

import java.sql.*;
import java.util.*;
import java.util.Date;
import java.util.concurrent.*;

/**
 * System to manage and distribute rewards to top ranked players
 */
public class RewardSystem {
    private static final String SYSTEM_SENDER = "Hệ thống";
    private static final String SYSTEM_TITLE = "Thư từ hệ thống";
    private static final int MAIL_EXPIRE_DAYS = 7;
    private static final int MAX_MAIL_SIZE = 120;

    private static final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
    private static final Map<Integer, ScheduledFuture<?>> scheduledTasks = new ConcurrentHashMap<>();
    private static final Queue<RewardSystem> overdueRewards = new ConcurrentLinkedQueue<>();
    private static final Object processLock = new Object();

    private final List<RewardTop> rewardTops;
    private int eventId;
    private int rankId;
    private boolean isClaimed;

    public RewardSystem() {
        this.rewardTops = new ArrayList<>();
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public void setRankId(int rankId) {
        this.rankId = rankId;
    }

    /**
     * Khởi tạo và lập lịch phát quà
     */
    public static void initAutoReward() {
        try {
            Connection conn = DbManager.getInstance().getConnection(DbManager.GAME);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM reward_system WHERE is_receive = FALSE AND server_id = ?");
            stmt.setInt(1, Config.getInstance().getServerID());
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                processRewardSystem(rs);
            }

            // Xử lý các phần thưởng quá hạn

        } catch (SQLException e) {
            Log.error("Error initializing auto rewards", e);
        }
    }

    /**
     * Xử lý từng reward system
     */
    private static void processRewardSystem(ResultSet rs) throws SQLException {
        RewardSystem rewardSystem = new RewardSystem();
        rewardSystem.setEventId(rs.getInt("event_id"));
        rewardSystem.setRankId(rs.getInt("rank_id"));

        Calendar calendar = Calendar.getInstance();
        Date rewardDate = rs.getDate("reward_date");
        Time rewardTime = rs.getTime("reward_time");

        calendar.setTime(rewardDate);
        calendar.set(Calendar.HOUR_OF_DAY, rewardTime.getHours());
        calendar.set(Calendar.MINUTE, rewardTime.getMinutes());
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        long rewardTimeMillis = calendar.getTimeInMillis();
        long currentTime = System.currentTimeMillis();
        long delay = rewardTimeMillis - currentTime;

        if (delay < 0) {
            overdueRewards.offer(rewardSystem);
        } else {
            scheduleReward(rewardSystem, delay);
        }
    }

    /**
     * Lập lịch phát quà
     */
    private static void scheduleReward(RewardSystem rewardSystem, long delay) {
        // Hủy task cũ nếu có
        cancelSchedule(rewardSystem.eventId);

        // Tạo task mới
        ScheduledFuture<?> future = scheduler.schedule(() -> {
            try {
                Log.info("Start granting rewards for event " + rewardSystem.eventId);
                synchronized (processLock) {
                    Ranked.refresh();
                    rewardSystem.loadRewardTops();
                    rewardSystem.grantRewards();
                }
                Log.info("Completed granting rewards for event " + rewardSystem.eventId);
            } catch (Exception e) {
                Log.error("Error executing scheduled reward for event " + rewardSystem.eventId, e);
            } finally {
                scheduledTasks.remove(rewardSystem.eventId);
            }
        }, delay, TimeUnit.MILLISECONDS);

        scheduledTasks.put(rewardSystem.eventId, future);
        Log.info("Scheduled reward for event " + rewardSystem.eventId +
                " at " + new Date(System.currentTimeMillis() + delay));
    }

    /**
     * Xử lý phần thưởng quá hạn
     */
    private static void processOverdueRewards() {
//        RewardSystem reward;
//        while ((reward = overdueRewards.poll()) != null) {
//            try {
//                Log.info("Processing overdue reward for event " + reward.eventId);
//                synchronized (processLock) {
//                    reward.loadRewardTops();
//                    reward.grantRewards();
//                }
//            } catch (Exception e) {
//                Log.error("Error processing overdue reward for event " + reward.eventId, e);
//            }
//        }
    }

    /**
     * Load danh sách phần thưởng
     */
    public void loadRewardTops() {
        try {
            Connection conn = DbManager.getInstance().getConnection(DbManager.SERVER);
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM reward_items WHERE reward_top_id IN (SELECT id FROM reward_system WHERE event_id = ?)");
            ps.setInt(1, eventId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                RewardTop rewardTop = createRewardTopFromResultSet(rs);
                if (rewardTop != null) {
                    rewardTops.add(rewardTop);
                }
            }
        } catch (SQLException e) {
            Log.error("Error loading reward tops for event " + eventId, e);
        }
    }

    /**
     * Phát quà cho người chơi
     */
    public void grantRewards() {
        if (isClaimed) {
            return;
        }

        boolean success = false;
        try {
            processRewards();
            updateRewardStatus();
            success = true;
        } catch (Exception e) {
            Log.error("Error granting rewards for event " + eventId, e);
            throw e;
        } finally {
            isClaimed = success;
        }
    }

    private void processRewards() {
        try {
            List<CaoThu> list = Ranked.RANKED[rankId];
            list = list.subList(0, Math.min(rewardTops.size(), list.size()));

            for (int i = 0; i < list.size(); i++) {
                CaoThu caoThu = list.get(i);
                RewardTop rewardTop = getRewardTop(i+1);
                if (rewardTop != null && rewardTop.items != null && !rewardTop.items.isEmpty()) {
                    claimReward(caoThu.name, rewardTop);
                }
            }
        } finally {
            rewardTops.clear();
        }
    }

    private void updateRewardStatus() {
        try {
            Connection conn = DbManager.getInstance().getConnection(DbManager.GAME);
            PreparedStatement ps = conn.prepareStatement(
                    "UPDATE reward_system SET is_receive = TRUE WHERE event_id = ?");
            ps.setInt(1, eventId);
            ps.executeUpdate();
        } catch (SQLException e) {
            Log.error("Error updating reward status for event " + eventId, e);
            throw new RuntimeException(e);
        }
    }

    private void claimReward(String name, RewardTop rw) {
        try {
            Char player = ServerManager.findCharByName(name);
            if (player != null) {
                sendRewardToOnlinePlayer(player, rw);
            } else {
                sendRewardToOfflinePlayer(name, rw);
            }
        } catch (Exception e) {
            Log.error("Claim reward error for player " + name, e);
            logRewardClaim(name, rw.id, "ERROR", e.getMessage());
        }
    }

    private void sendRewardToOnlinePlayer(Char player, RewardTop rw) {
        for (Item item : rw.items) {
            Item clonedItem = item.clone();
            Mail mail = player.createMail(SYSTEM_SENDER, SYSTEM_TITLE, rw.name, 0, 0, 0, clonedItem);
            player.mailManager.addMail(mail);
        }
        logRewardClaim(player.name, rw.id, "SUCCESS", null);
    }

    private void sendRewardToOfflinePlayer(String name, RewardTop rw) {
        List<Mail> mailList = DbManager.getInstance().getMail(name);
        if (mailList.size() >= MAX_MAIL_SIZE) {
            logRewardClaim(name, rw.id, "FAILED", "Mail box is full");
            return;
        }

        for (Item item : rw.items) {
            Mail mail = createMail(mailList, rw.name, item);
            mailList.add(mail);
        }

        DbManager.getInstance().updateMail(name, mailList);
        logRewardClaim(name, rw.id, "SUCCESS", null);
    }

    private Mail createMail(List<Mail> mailList, String content, Item item) {
        Mail mail = new Mail();
        mail.id = mailList.isEmpty() ? 0 : mailList.get(mailList.size() - 1).id + 1;
        mail.setSender(SYSTEM_SENDER);
        mail.setTitle(SYSTEM_TITLE);
        mail.setContent(content);
        mail.setBallz(0);
        mail.setCoin(0);
        mail.setZeni(0);
        mail.setItem(item.clone());
        mail.setTime((int) ((System.currentTimeMillis() + TimeUnit.DAYS.toMillis(MAIL_EXPIRE_DAYS)) / 1000));
        return mail;
    }

    private RewardTop createRewardTopFromResultSet(ResultSet rs) throws SQLException {
        String itemsStr = rs.getString("items");
        if (itemsStr == null || itemsStr.isEmpty()) {
            return null;
        }

        RewardTop rewardTop = new RewardTop();
        rewardTop.id = rs.getInt("id");
        rewardTop.items = new ArrayList<>();

        String[] itemStrs = itemsStr.split(",");
        for (String itemStr : itemStrs) {
            try {
                DailyReward dailyReward = RewardManager.gI().find(Integer.parseInt(itemStr.trim()));
                if (dailyReward != null) {
                    rewardTop.items.add(dailyReward.item);
                    rewardTop.name = dailyReward.name;
                }
            } catch (NumberFormatException e) {
                Log.error("Invalid item id format: " + itemStr, e);
            }
        }

        return rewardTop;
    }

    private void logRewardClaim(String playerName, int rewardTopId, String status, String errorMessage) {
        try {
            Connection conn = DbManager.getInstance().getConnection(DbManager.SERVER);
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO reward_claim_logs (event_id, rank_id, player_name, reward_top_id, status, error_message) " +
                            "VALUES (?, ?, ?, ?, ?, ?)");
            ps.setInt(1, eventId);
            ps.setInt(2, rankId);
            ps.setString(3, playerName);
            ps.setInt(4, eventId);
            ps.setString(5, status);
            ps.setString(6, errorMessage);
            ps.executeUpdate();
        } catch (SQLException e) {
            Log.error("Error logging reward claim for player " + playerName, e);
        }
    }

    private RewardTop getRewardTop(int id) {
        for (RewardTop rewardTop : rewardTops) {
            if (rewardTop.id == id) {
                return rewardTop;
            }
        }
        return null;
    }

    /**
     * Hủy schedule cho một event
     */
    public static void cancelSchedule(int eventId) {
        ScheduledFuture<?> task = scheduledTasks.remove(eventId);
        if (task != null) {
            task.cancel(false);
        }
    }

    /**
     * Shutdown toàn bộ hệ thống reward
     */
    public static void shutdown() {
        // Hủy tất cả scheduled tasks
        for (ScheduledFuture<?> task : scheduledTasks.values()) {
            task.cancel(false);
        }
        scheduledTasks.clear();

        // Shutdown executor
        scheduler.shutdown();
        try {
            if (!scheduler.awaitTermination(60, TimeUnit.SECONDS)) {
                scheduler.shutdownNow();
            }
        } catch (InterruptedException e) {
            scheduler.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}