package com.vdtt.model;

import com.vdtt.data.SQLStatement;
import com.vdtt.db.DbManager;
import com.vdtt.item.Item;
import com.vdtt.mail.Mail;
import com.vdtt.util.Log;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class GiftCode {
    private static final GiftCode instance = new GiftCode();

    public static GiftCode getInstance() {
        return instance;
    }
    public void use(Char player, String code) {
        try {
            int lent = code.length();
            if (code.equals("") || lent < 5 || lent > 30) {
                player.getService().serverDialog("Mã quà tặng có chiều dài từ 5 đến 30 ký tự.");
                return;
            }

            PreparedStatement stmt = DbManager.getInstance().getConnection(DbManager.GIFT_CODE).prepareStatement(
                    SQLStatement.GET_GIFT_CODE, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setString(1, code);
            ResultSet res = stmt.executeQuery();
            try {
                if (!res.first()) {
                    player.getService().serverDialog("Mã quà tặng không tồn tại hoặc đã hết hạn.");
                    return;
                }
                if(code.toLowerCase().contains("888zeni")){
                    if(player.activated == 1){
                        player.getService().serverDialog("Sau khi mở thành viên tại Bulma sẽ nhập được mã quà tặng này!");
                        return;
                    }
                }
                int id = res.getInt("id");
                byte status = res.getByte("status");
                byte type = res.getByte("type");
                byte used = res.getByte("used");
                if (status == 1) {
                    player.getService().serverDialog("Mã quà tặng đã được sử dụng");
                    return;
                } else if (type == 1 && isUsedGiftCode(player, code)) {
                    player.getService().serverDialog("Mỗi người chỉ được sử dụng 1 lần.");
                    return;
//                } else if (player.user.session.getCountUseGiftCode() >= 10000) {
//                    player.getService().serverDialog("Mỗi ngày chỉ có thể nhập tối đa 10 mã quà tặng.");
//                    return;
                } else if (type > 1&&isUsedGiftByType(player,type)) {
                    player.getService().serverDialog("Bạn đã sử dụng loại giftcode này rồi");
                    return;
                } else if(type == 1 && used == 0 ){
                    player.getService().serverDialog("Đã hết số lần sử dụng mã quà tặng này.");
                    return;
                } else if (type == 100 && !player.isNewBie) {
                    player.getService().serverDialog("Mã quà tặng này chỉ dành cho tài khoản mới.");
                    return;
                }
                int zeni = res.getInt("zeni");
                int xu = res.getInt("xu");
                int ballz = res.getInt("ballz");
                JSONArray arrItem = (JSONArray) (new JSONParser().parse(res.getString("items")));

                int size = arrItem.size();

                if (size > player.getSlotNull()) {
                    player.getService().serverDialog("Bạn không đủ chỗ trống trong hành trang.");
                    return;
                }
                Mail mail = player.createMail("Hệ thống","Thư của hệ thống","Phần thưởng mã quà tặng :"+code,ballz,xu,zeni,null);
                player.mailManager.addMail(mail);
                for (int i = 0; i < size; i++) {
                    JSONObject itemObj = (JSONObject) arrItem.get(i);
                    Item newItem = new Item(itemObj);
                    if(newItem.expire > 0){
                        newItem.expire+=System.currentTimeMillis();
                    }
                    Mail mail1 = player.createMail("Hệ thống","Thư của hệ thống","Phần thưởng mã quà tặng :"+code,0,0,0,newItem);
                    player.mailManager.addMail(mail1);

                }

                player.user.session.addUseGiftCode();
                player.getService().serverMessage("Nhận mã quà tặng thành công vui lòng kiểm tra thư");
                addUsedGiftCode(player, code,type);


                if(used > 0 && type == 1){
                    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                    res.updateByte("used", (byte) (used -1));
                    res.updateTimestamp("updated_at", timestamp);
                    res.updateRow();
                }else if (type == 0||type > 1) {
                    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                    res.updateByte("status", (byte) 1);
                    res.updateTimestamp("updated_at", timestamp);
                    res.updateRow();
                }
            } finally {
                res.close();
                stmt.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  public boolean isUsedGiftByType(Char player,int typeCode){
        try {
            PreparedStatement stmt = DbManager.getInstance().getConnection(DbManager.GIFT_CODE).prepareStatement(
                    SQLStatement.CHECK_EXIST_TYPE, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            stmt.setInt(1, player.id);
            stmt.setInt(2, player.user.id);
            stmt.setInt(3,typeCode);
            ResultSet res = stmt.executeQuery();
            try {
                if (res.first()) {
                    return true;
                }
            } finally {
                res.close();
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
  }
    public boolean isUsedGiftCode(Char player, String giftCode) {
        try {
            PreparedStatement stmt = DbManager.getInstance().getConnection(DbManager.GIFT_CODE).prepareStatement(
                    SQLStatement.CHECK_EXIST_USED_GIFT_CODE, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            stmt.setString(1, giftCode);
            stmt.setInt(2, player.id);
            ResultSet res = stmt.executeQuery();
            try {
                if (res.first()) {
                    return true;
                }
            } finally {
                res.close();
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public void addUsedGiftCode(Char player, String giftCode,int typeCode) {
        try {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            PreparedStatement stmt = DbManager.getInstance().getConnection(DbManager.GIFT_CODE).prepareStatement(SQLStatement.INSERT_USED_GIFT_CODE);
            stmt.setInt(1, player.id);
            stmt.setInt(2, player.user.id);
            stmt.setString(3, giftCode);
            stmt.setInt(4,typeCode);
            stmt.setTimestamp(5, timestamp);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
