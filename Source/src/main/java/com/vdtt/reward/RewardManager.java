package com.vdtt.reward;

import com.vdtt.db.DbManager;
import com.vdtt.item.Item;
import com.vdtt.util.Log;
import com.vdtt.util.ParseData;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RewardManager {
    private static final RewardManager instance = new RewardManager();

    public static RewardManager gI() {
        return instance;
    }

    public List<DailyReward> dailyRewards;

    public void init() {
        dailyRewards = new ArrayList<>();
        try {
            PreparedStatement stmt = DbManager.getInstance().getConnection(DbManager.SERVER).prepareStatement("SELECT * FROM `dailyreward`;");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                DailyReward reward = new DailyReward();
                reward.id = resultSet.getInt("id");
                reward.name = resultSet.getString("name");
                reward.type = resultSet.getInt("type");
                JSONObject itemJson = (JSONObject) JSONValue.parse(resultSet.getString("item"));
                ParseData parse = new ParseData(itemJson);
                int itemID = parse.getInt("id");
                int quantity = parse.getInt("quantity");
                boolean isLock = parse.getBoolean("isLock");
                Item item = new Item(itemID);
                item.setQuantity(quantity);
                item.setLock(isLock);
                item.strOption = parse.getString("strOption");
                item.expire = parse.getLong("expire");
                reward.item = item;
                reward.require = resultSet.getInt("require");
                dailyRewards.add(reward);
            }
            Log.debug("Loaded " + dailyRewards.size() + " daily rewards");
            resultSet.close();
            stmt.close();
        } catch (Exception ex) {
            Log.error(ex.getMessage(), ex);
        }
    }
    public DailyReward find(int id){
        for (DailyReward reward: dailyRewards){
            if(reward.id==id){
                return reward;
            }
        }
        return null;
    }
    public List<DailyReward>getListByType(int type){
        List<DailyReward>rewardList = new ArrayList<>();
        for (DailyReward reward: dailyRewards){
            if(reward.type==type){
                rewardList.add(reward);
            }
        }
        return rewardList;
    }
}
