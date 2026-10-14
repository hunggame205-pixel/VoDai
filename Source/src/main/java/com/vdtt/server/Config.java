package com.vdtt.server;

import com.vdtt.util.Log;
import lombok.Getter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

@Getter
public class Config {

    private static final Config instance = new Config();
    private boolean showLog;

    public static Config getInstance() {
        return instance;
    }


    // Server
    private int serverID;
    private int port;

    // MySql
    private String dbHost;
    private int dbPort;
    private String dbUser;
    private String dbPassword;
    private String dbName;
    private String dbDriver;
    private int dbMinConnections;
    private int dbMaxConnections;
    private int dbConnectionTimeout;
    private int dbLeakDetectionThreshold;
    private int dbIdleTimeout;

    private int adminPort;
    private String adminKey;
    public int expRate = 1;
    public int[][] upgradeLevels = {
            {2, 200000, 5 * 60 * 1000},           // Cấp 1 -> 2: 5 phút
            {4, 400000, 10 * 60 * 1000},          // Cấp 2 -> 3: 10 phút
            {8, 800000, 30 * 60 * 1000},          // Cấp 3 -> 4: 30 phút
            {16, 1600000, 60 * 60 * 1000},          // Cấp 4 -> 5: 1 giờ
            {32, 3200000, 2 * 60 * 60 * 1000},     // Cấp 5 -> 6: 2 giờ
            {64, 6400000, 4 * 60 * 60 * 1000},     // Cấp 6 -> 7: 4 giờ
            {128, 12800000, 8 * 60 * 60 * 1000},     // Cấp 7 -> 8: 8 giờ
            {160, 20000000, 16 * 60 * 60 * 1000},   // Cấp 8 -> 9: 16 giờ
            {180, 40000000, 24 * 60 * 60 * 1000},   // Cấp 9 -> 10: 1 ngày
            {200, 60000000, 2 * 24 * 60 * 60 * 1000}, // Cấp 10 -> 11: 2 ngày
            {250, 80000000, 7 * 24 * 60 * 60 * 1000}, // Cấp 11 -> 12: 7 ngày
            {300, 100000000, 14 * 24 * 60 * 60 * 1000}, // Cấp 12 -> 13: 14 ngày
            {340, 120000000, 28 * 24 * 60 * 60 * 1000}, // Cấp 12 -> 13: 14 ngày
            {340, 120000000, 28 * 24 * 60 * 60 * 1000}, // Cấp 12 -> 13: 14 ngày
            {340, 120000000, 28 * 24 * 60 * 60 * 1000}, // Cấp 12 -> 13: 14 ngày
            {340, 120000000, 28 * 24 * 60 * 60 * 1000} // Cấp 13 -> 14: 28 ngày
    };

    public  String[] events = {
            "Đua Top sức mạnh@Điểm sức mạnh: trong quá trình luyện tập, đánh quái điểm sức mạnh của nhân vật sẽ được tăng lên. Nhân vật đạt Top 1-5 trên bảng xếp hạng sức mạnh sẽ nhận được phần thưởng có giá trị.@1762800000000",
            "Đua Top phẩm chất@Điểm phẩm chất: là tổng chỉ số của các vật phẩm trên người và dự phòng của nhân vật. Nhân vật đạt Top 1-10 trên bảng xếp hạng phẩm chất sẽ nhận được phần thưởng có giá trị.@1762800000000",
            "Đua Top nạp Zeni@Khi quy đổi Coin sang Zeni sẽ được điểm đua top. Nhân vật đạt Top 1-5 trên bảng xếp hạng Nạp Zeni sẽ nhận được phần thưởng có giá trị.@1762800000000",
            "Đua Top Vũ Trụ@Top Vũ Trụ: được sắp xếp theo cấp và kinh nghiệm của Vũ Trụ. Vũ Trụ đạt Top 1-5 trên bảng xếp hạng Vũ Trụ sẽ nhận được phần thưởng của Vũ Trụ (tất cả các thành viên trong Vũ Trụ đều nhận được phần thưởng)@1762800000000",
            "Đua Top nhi đồng sức mạnh@Là đua top sức mạnh nhưng chỉ tính các nhân vật được tạo trong thời gian diễn ra sự kiện. Nhân vật đạt Top 1-5 trên bảng xếp hạng nhi đồng sẽ nhận được phần thưởng có giá trị.@1762800000000",
            "Đua Top nhi đồng phẩm chất@Tương tự như đua top phẩm chất, nhưng chỉ dành riêng cho những nhân vật được tạo trong khoảng thời gian diễn ra đua top nhi đồng.@1762800000000",
            "Đua Top nạp Zeni (tuần)@Điểm sôi nổi (tuần) tương tự như điểm sôi nổi nhưng mỗi tuần sẽ bị reset về 0. Mỗi tuần nhân vật đạt Top 1-3 trên bảng xếp hạng sôi nổi (tuần) sẽ nhận được phần thưởng có giá trị. Lưu ý: bảng xếp hạng chỉ tính đến 23h ngày cuối cùng của tuần.@1762800000000",
            "Đua Top ép sao (tuần)@Điểm ép sao (tuần) được tính khi nhân vật ép sao thành công trang bị, cấp ép sao càng cao thì điểm càng nhiều, khi qua tuần mới điểm ép sao tuần sẽ bị reset về 0. Mỗi tuần nhân vật đạt Top 1-3 trên bảng xếp hạng ép sao (tuần) sẽ nhận được phần thưởng có giá trị. Lưu ý: bảng xếp hạng chỉ tính đến 23h ngày cuối cùng của tuần.@1762800000000",
            "Đua Top cống hiến (tuần)@Điểm cống hiến Vũ Trụ (tuần): mỗi tuần Vũ Trụ có điểm cống hiến tuần nhiều nhất sẽ nhận được phần thưởng có giá trị. Lưu ý: chỉ Vũ Trụ đạt Top 1 mới nhận được phần thưởng.@1762800000000"
    };

    // Game
    private String event;
    //

    public void setExpRate(int expRate) {
        this.expRate = expRate;
    }

    public void setEvent(String event) {
        this.event = event;
    }



    public boolean load() {
        try {
            FileInputStream input = new FileInputStream(new File("config.properties"));
            Properties props = new Properties();
            props.load(new InputStreamReader(input, StandardCharsets.UTF_8));
            props.forEach((t, u) -> {
                Log.info(String.format("Config - %s: %s", t, u));
            });
            showLog = Boolean.parseBoolean(props.getProperty("server.log.display"));
            serverID = Integer.parseInt(props.getProperty("server.id"));
            port = Integer.parseInt(props.getProperty("server.port"));
            dbDriver = props.getProperty("db.driver");
            dbHost = props.getProperty("db.host");
            dbPort = Integer.parseInt(props.getProperty("db.port"));
            dbUser = props.getProperty("db.user");
            dbPassword = props.getProperty("db.password");
            dbName = props.getProperty("db.dbname");
            dbMaxConnections = Integer.parseInt(props.getProperty("db.maxconnections"));
            dbMinConnections = Integer.parseInt(props.getProperty("db.minconnections"));
            dbConnectionTimeout = Integer.parseInt(props.getProperty("db.connectionTimeout"));
            dbLeakDetectionThreshold = Integer.parseInt(props.getProperty("db.leakDetectionThreshold"));
            dbIdleTimeout = Integer.parseInt(props.getProperty("db.idleTimeout"));
            adminPort = props.containsKey("admin.port") ? Integer.parseInt(props.getProperty("admin.port")) : 7107;
            adminKey = props.containsKey("admin.key") ? props.getProperty("admin.key") : "change-me";

            if (props.containsKey("game.event")) {
                event = props.getProperty("game.event");
            }
            if (props.containsKey("game.expRate")) {
                expRate = Integer.parseInt(props.getProperty("game.expRate"));
            }



        } catch (IOException | NumberFormatException ex) {
            Log.error("load config err: " + ex.getMessage(), ex);
            return false;
        }
        return true;
    }

    public int getAdminPort() {
        return adminPort;
    }

    public String getAdminKey() {
        return adminKey;
    }

    public String getJdbcUrl() {
        return "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
    }



}

