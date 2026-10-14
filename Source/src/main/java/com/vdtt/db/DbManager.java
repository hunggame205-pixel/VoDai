package com.vdtt.db;

import com.vdtt.data.SQLStatement;
import com.vdtt.lib.ZConnection;
import com.vdtt.mail.Mail;
import com.vdtt.model.Char;
import com.vdtt.server.Config;
import com.vdtt.server.VDTT;
import com.vdtt.util.Log;
import com.vdtt.util.VDTTUtlis;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.HikariPoolMXBean;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.sql.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbManager {

    private static DbManager instance = null;
    private HikariDataSource hikariDataSource;
    private List<ZConnection> connections;
    private final int timeOut;

    public static final int GAME = 0;
    public static final int LOGIN = 1;
    public static final int SAVE_DATA = 2;
    public static final int SERVER = 3;
    public static final int UPDATE = 4;
    public static final int GIFT_CODE = 5;
    public static final int LOAD_CHAR = 6;
    public static final int CREATE_CHAR = 7;


    public static DbManager getInstance() {
        if (instance == null) {
            instance = new DbManager();
        }
        return instance;
    }

    private DbManager() {
        timeOut = 10;
        connections = new ArrayList<>();
        connections.add(new ZConnection(timeOut));
        connections.add(new ZConnection(timeOut));
        connections.add(new ZConnection(timeOut));
        connections.add(new ZConnection(timeOut));
        connections.add(new ZConnection(timeOut));
        connections.add(new ZConnection(timeOut));
        connections.add(new ZConnection(timeOut));
        connections.add(new ZConnection(timeOut));
    }

    public Connection getConnection() throws SQLException {
        return this.hikariDataSource.getConnection();
    }

    public boolean start() {
        if (this.hikariDataSource != null) {
            Log.warn("DB Connection Pool has already been created.");
            return false;
        } else {
            try {
                Config serverConfig = Config.getInstance();
                HikariConfig config = new HikariConfig();
                config.setJdbcUrl(Config.getInstance().getJdbcUrl());
                config.setDriverClassName(serverConfig.getDbDriver());
                config.setUsername(serverConfig.getDbUser());
                config.setPassword(serverConfig.getDbPassword());
                config.setMinimumIdle(serverConfig.getDbMinConnections());
                config.setMaximumPoolSize(serverConfig.getDbMaxConnections());
                config.setConnectionTimeout(serverConfig.getDbConnectionTimeout());
//                config.setLeakDetectionThreshold(serverConfig.getDbLeakDetectionThreshold());
                config.setIdleTimeout(serverConfig.getDbIdleTimeout());
                config.addDataSourceProperty("cachePrepStmts", "true");
                config.addDataSourceProperty("prepStmtCacheSize", "250");
                config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
                config.setValidationTimeout(3000); // Validate connections within 3 seconds
                config.setMaxLifetime(1800000); // Maximum lifetime of a connection in the pool (30 minutes)
                config.setConnectionTestQuery("SELECT 1");
                this.hikariDataSource = new HikariDataSource(config);
                Log.info("DB Connection Pool has created.");
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                Log.error("DB Connection Pool Creation has failed.");
                return false;
            }
        }
    }

    public ArrayList<HashMap<String, Object>> convertResultSetToList(ResultSet rs) {
        ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        try {
            ResultSetMetaData resultSetMetaData = rs.getMetaData();
            int count = resultSetMetaData.getColumnCount();
            while (rs.next()) {
                HashMap<String, Object> map = new HashMap<>();
                int index = 1;
                while (index <= count) {
                    int type = resultSetMetaData.getColumnType(index);
                    String name = resultSetMetaData.getColumnName(index);
                    switch (type) {
                        case -5: {
                            map.put(name, rs.getLong(index));
                            break;
                        }
                        case 6: {
                            map.put(name, rs.getFloat(index));
                            break;
                        }
                        case 12: {
                            map.put(name, rs.getString(index));
                            break;
                        }
                        case 1: {
                            map.put(name, rs.getString(index));
                            break;
                        }
                        case 4: {
                            map.put(name, rs.getInt(index));
                            break;
                        }
                        case 16: {
                            map.put(name, rs.getBoolean(index));
                            break;
                        }
                        case -7: {
                            map.put(name, rs.getByte(index));
                            break;
                        }

                        default: {
                            map.put(name, rs.getObject(index));
                            break;
                        }
                    }
                    ++index;
                }
                list.add(map);
            }
            rs.close();
        } catch (SQLException sQLException) {
            Log.error("convertResultSetToList ex: " + sQLException.getMessage());
        }
        return list;
    }

    public Connection getConnection(int index) throws SQLException {
        if (hikariDataSource == null) {
            while (hikariDataSource == null) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException ex) {
                    Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return connections.get(index).getConnection();
//        Config serverConfig = Config.getInstance();
//        String URL = serverConfig.getJdbcUrl();
//        String USERNAME = serverConfig.getDbUser();
//        String PASSWORD = serverConfig.getDbPassword();
//        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public void shutdown() {
        try {
            if (this.hikariDataSource != null) {
                this.hikariDataSource.close();
                Log.info("DB Connection Pool is shutting down.");
            }
            this.hikariDataSource = null;
        } catch (Exception e) {
            Log.warn("Error when shutting down DB Connection Pool");
        }
    }

    public int update(String sql, Object... params) {
        try {
            Connection conn = getInstance().getConnection(UPDATE);
            PreparedStatement stmt = conn.prepareStatement(sql);
            try {
                for (int i = 0; i < params.length; i++) {
                    stmt.setObject(i + 1, params[i]);
                }
                int result = stmt.executeUpdate();
                return result;
            } finally {
                stmt.close();
            }
        } catch (SQLException e) {
            Log.error("update() EXCEPTION: " + e.getMessage(), e);
        }
        return -1;
    }

    public void active_account(String username) {
        update(SQLStatement.ACTIVE_ACCOUNT, 0, username);
    }

    public void lock_account(String username) {
        update(SQLStatement.LOCK_ACCOUNT, 0, username);
    }

    public void banuntil_account(String username, int time) {
        update(SQLStatement.BANUNI_ACCOUNT, LocalDateTime.now().plusHours(time), username);
        update(SQLStatement.LOCK_ACCOUNT, 1, username);
    }

    public int getCoin(String username) {
        int coin = 0;
        String sql = SQLStatement.GET_COIN; // Ensure this is a constant or a properly parameterized SQL query
        try  {
            Connection conn = getInstance().getConnection(UPDATE);
            PreparedStatement stmt = conn.prepareStatement(sql);
            try {
                stmt.setString(1, username);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        coin = rs.getInt("coin");
                    }
                }
            }finally {
                stmt.close();
            }
        } catch (SQLException e) {
            Log.error("getCoin() EXCEPTION: " + e.getMessage(), e);
        }
        return coin;
    }

    public boolean updateCoin(String username, int coin) {
        String sql = "UPDATE `users` SET `coin` = `coin` - ? WHERE `username` = ? AND `coin` >= ?";
        try {
            Connection conn = getInstance().getConnection(UPDATE);
            conn.setAutoCommit(false);  // Bắt đầu transaction
            try {
                // Khóa và kiểm tra coin
                String checkSql = "SELECT coin FROM users WHERE username = ? FOR UPDATE";
                PreparedStatement checkStmt = conn.prepareStatement(checkSql);
                checkStmt.setString(1, username);
                ResultSet rs = checkStmt.executeQuery();

                if (rs.next()) {
                    int currentCoin = rs.getInt("coin");
                    if (currentCoin >= coin) {
                        // Đủ coin thì update
                        PreparedStatement updateStmt = conn.prepareStatement(sql);
                        updateStmt.setInt(1, coin);
                        updateStmt.setString(2, username);
                        updateStmt.setInt(3, coin);
                        int updated = updateStmt.executeUpdate();

                        if (updated > 0) {
                            conn.commit();  // Lưu thay đổi
                            return true;    // Update thành công
                        }
                    }
                }
                conn.rollback();  // Rollback nếu không update được
                return false;     // Update thất bại
            } catch (SQLException e) {
                conn.rollback();  // Rollback nếu có lỗi
            } finally {
                conn.setAutoCommit(true);
            }
        } catch (SQLException e) {
            Log.error("updateCoin() EXCEPTION: " + e.getMessage(), e);
            return false;  // Có lỗi return false
        }
        return false;
    }

    /**
     * Tạo tài khoản game trong bảng `users` (cùng bảng web register.php dùng).
     *
     * @return 0 = tạo thành công, 1 = tên tài khoản đã tồn tại, 2 = lỗi database
     */
    public int registerAccount(String username, String password, String email, String ip) {
        try {
            Connection conn = getInstance().getConnection(UPDATE);
            try (PreparedStatement check = conn.prepareStatement(
                    "SELECT `id` FROM `users` WHERE `username` = ? LIMIT 1")) {
                check.setString(1, username);
                try (ResultSet rs = check.executeQuery()) {
                    if (rs.next()) {
                        return 1;
                    }
                }
            }
            try (PreparedStatement insert = conn.prepareStatement(
                    "INSERT INTO `users` (`username`, `password`, `password2`, `email`, `ip_address`, `admin`, `balance`) VALUES (?, ?, ?, ?, ?, 0, 0)")) {
                insert.setString(1, username);
                insert.setString(2, password);
                insert.setString(3, password);
                insert.setString(4, email == null ? "" : email);
                insert.setString(5, ip == null ? "" : ip);
                return insert.executeUpdate() > 0 ? 0 : 2;
            }
        } catch (SQLException e) {
            Log.error("registerAccount() EXCEPTION: " + e.getMessage(), e);
            return 2;
        }
    }

    public List<Mail> getMail(String name) {
        List<Mail> list = new ArrayList<>();
        String sql = "SELECT `mail` FROM `players` WHERE `name` = ?";
        try {
            Connection conn = getInstance().getConnection(UPDATE);
            PreparedStatement stmt = conn.prepareStatement(sql);
            try {
                stmt.setString(1, name);
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        JSONArray mail = (JSONArray) JSONValue.parse(rs.getString("mail"));
                        if (mail != null) {
                            int size2 = mail.size();
                            for (int i = 0; i < size2; i++) {
                                try {
                                    JSONObject obj = (JSONObject) mail.get(i);
                                    Mail mail1 = new Mail(obj);
                                    if (mail1.time > (System.currentTimeMillis() / 1000)) {
                                        list.add(mail1);
                                    }
                                } catch (Exception e) {
                                    Log.error("err: " + e.getMessage(), e);
                                }
                            }
                        }
                    }
                }
            }finally {
                stmt.close();
            }
        } catch (SQLException e) {
            Log.error("getMail() EXCEPTION: " + e.getMessage(), e);
        }
        return list;
    }

    public void updateMail(String name, List<Mail> mail) {
        String sql = "UPDATE `players` SET `mail` = ? WHERE `name` = ?";
        try {
            Connection conn = getInstance().getConnection(UPDATE);
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                JSONArray array = new JSONArray();
                for (Mail mail1 : mail) {
                    array.add(mail1.toJson());
                }
                stmt.setString(1, array.toJSONString());
                stmt.setString(2, name);
                stmt.executeUpdate();
            } catch (SQLException e) {
                Log.error("updateMail() EXCEPTION: " + e.getMessage(), e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection login() throws SQLException {
        Config serverConfig = Config.getInstance();
        String URL = serverConfig.getJdbcUrl();
        String USERNAME = serverConfig.getDbUser();
        String PASSWORD = serverConfig.getDbPassword();
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    public String getInfo() {
        HikariPoolMXBean poolMXBean = hikariDataSource.getHikariPoolMXBean();
        StringBuilder sb = new StringBuilder();
        sb.append("DB Connection Pool Info:\n");
        sb.append(" |- ActiveConnections:   ").append(poolMXBean.getActiveConnections()).append("\n");
        sb.append(" |- IdleConnections:     ").append(poolMXBean.getIdleConnections()).append("\n");
        sb.append(" |- TotalConnections:    ").append(poolMXBean.getTotalConnections()).append("\n");
        sb.append(" |- ThreadsAwaitingConnection: ").append(poolMXBean.getThreadsAwaitingConnection()).append("\n");
        sb.append(" |- MaxConnections: ").append(hikariDataSource.getMaximumPoolSize()).append("\n");
        sb.append(" |- MinConnections: ").append(hikariDataSource.getMinimumIdle()).append("\n");
        return sb.toString();
    }
}

