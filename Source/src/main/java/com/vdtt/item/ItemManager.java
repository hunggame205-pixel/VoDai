package com.vdtt.item;

import com.vdtt.data.DataCenter;
import com.vdtt.db.DbManager;
import com.vdtt.mob.Mob;
import com.vdtt.model.RandomItem;
import com.vdtt.npc.Npc;
import com.vdtt.util.Log;
import com.vdtt.util.RandomCollection;
import com.vdtt.util.VDTTUtlis;
import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ItemManager {
    private static final ItemManager instance = new ItemManager();

    public static ItemManager getInstance() {
        return instance;
    }
    public final ArrayList<ItemTemplate> itemTemplates = new ArrayList<>();
    public final ArrayList<ItemOptionTemplate> optionTemplates = new ArrayList<>();
    public List<Item>itemNapThe = new ArrayList<>();
    public List<Item>itemThuVanMay = new ArrayList<>();
    public RandomCollection<Item> itemThuVanMayRandom = new RandomCollection<>();
    public List<Item>tvmNew = new ArrayList<>();
    public List<Item>tvmNew2 = new ArrayList<>();




    public void loadItem() {
        try {
            Connection conn = DbManager.getInstance().getConnection(DbManager.GAME);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM `item`;", ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = stmt.executeQuery();
            resultSet.last();
            resultSet.beforeFirst();
            while (resultSet.next()) {
                try {
                    ItemTemplate item = new ItemTemplate();
                    item.id = resultSet.getShort("id");
                    item.name = resultSet.getString("name");
                    item.type = resultSet.getByte("type");
                    item.detail = resultSet.getString("detail");
                    item.gioiTinh = resultSet.getByte("gioiTinh");
                    item.phamChatNeed = resultSet.getInt("phamChatNeed");
                    item.isXepChong = resultSet.getBoolean("isXepChong");
                    item.idIcon = resultSet.getShort("idIcon");
                    item.typeChar = resultSet.getByte("typeChar");
                    item.levelNeed = resultSet.getShort("levelNeed");
                    item.width = resultSet.getShort("width");
                    item.height = resultSet.getShort("height");
                    add(item);
                } catch (Exception e) {
                    return;
                }
            }
            resultSet.close();
            stmt.close();
            loadItemOption();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void loadItemThuVanMay(){
        try {
            Connection conn = DbManager.getInstance().getConnection(DbManager.GAME);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM `thuvanmay`;", ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = stmt.executeQuery();
            resultSet.last();
            resultSet.beforeFirst();
            while (resultSet.next()) {
                try {
                    int id = resultSet.getInt("id");
                    JSONObject jsonObject = new JSONObject(resultSet.getString("item"));
                    int itemId = jsonObject.getInt("id");
                    Item item = new Item(itemId);
                    item.quantity = jsonObject.getInt("quantity");
                    item.expire = jsonObject.getLong("expire");
                    item.strOption = jsonObject.getString("strOption");
                    item.isLock = jsonObject.getBoolean("isLock");
                    item.quantity = jsonObject.getInt("quantity");
                    if(item.quantity <= 0){
                        item.quantity = 1;
                    }
                    if(item.expire >0){
                        item.expire += System.currentTimeMillis();
                    }
                    itemThuVanMay.add(item);
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            loadItemThuVanMayRandom();
            resultSet.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void loadTVMNew(){
        try {
            Connection conn = DbManager.getInstance().getConnection(DbManager.GAME);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM `tvmnew`;", ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = stmt.executeQuery();
            resultSet.last();
            resultSet.beforeFirst();
            while (resultSet.next()) {
                try {
                    int id = resultSet.getInt("id");
                    boolean isLock = resultSet.getBoolean("isLock");
                    int quantity = resultSet.getInt("quantity");
                    long expire = resultSet.getLong("expire");
                    String options = resultSet.getString("option");
                    int percent = resultSet.getInt("percent");
                    int type = resultSet.getInt("type");
                    int upgrade = resultSet.getInt("upgrade");
                    Item item = new Item(id, isLock, quantity);
                    item.expire = expire;
                    item.strOption = options;
                    item.upgrade = (byte) upgrade;
                    tvmNew.add(item);
                    RandomItem.TVM_NEW.add(percent, item);
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            resultSet.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void loadTVMNew2(){
        try {
            Connection conn = DbManager.getInstance().getConnection(DbManager.GAME);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM `tvmnew2`;", ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = stmt.executeQuery();
            resultSet.last();
            resultSet.beforeFirst();
            while (resultSet.next()) {
                try {
                    int id = resultSet.getInt("id");
                    boolean isLock = resultSet.getBoolean("isLock");
                    int quantity = resultSet.getInt("quantity");
                    long expire = resultSet.getLong("expire");
                    String options = resultSet.getString("option");
                    int percent = resultSet.getInt("percent");
                    int type = resultSet.getInt("type");
                    int upgrade = resultSet.getInt("upgrade");
                    Item item = new Item(id, isLock, quantity);
                    item.expire = expire;
                    item.strOption = options;
                    item.upgrade = (byte) upgrade;
                    tvmNew2.add(item);
                    RandomItem.TVM_NEW_2.add(percent, item);
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            resultSet.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void loadItemThuVanMayRandom(){
        itemThuVanMayRandom.add(30, itemThuVanMay.get(0));
        itemThuVanMayRandom.add(5, itemThuVanMay.get(1));
        itemThuVanMayRandom.add(5, itemThuVanMay.get(2));
        itemThuVanMayRandom.add(2, itemThuVanMay.get(3));
        itemThuVanMayRandom.add(2, itemThuVanMay.get(4));
        itemThuVanMayRandom.add(15, itemThuVanMay.get(5));
        itemThuVanMayRandom.add(6, itemThuVanMay.get(6));
        itemThuVanMayRandom.add(1, itemThuVanMay.get(7));
        itemThuVanMayRandom.add(1, itemThuVanMay.get(8));
        itemThuVanMayRandom.add(9, itemThuVanMay.get(9));
        itemThuVanMayRandom.add(15, itemThuVanMay.get(10));
        itemThuVanMayRandom.add(30, itemThuVanMay.get(11));
        itemThuVanMayRandom.add(5, itemThuVanMay.get(12));
        itemThuVanMayRandom.add(5, itemThuVanMay.get(13));
        itemThuVanMayRandom.add(5, itemThuVanMay.get(14));
        itemThuVanMayRandom.add(5, itemThuVanMay.get(15));
        itemThuVanMayRandom.add(8, itemThuVanMay.get(16));
        itemThuVanMayRandom.add(2, itemThuVanMay.get(17));
        itemThuVanMayRandom.add(3, itemThuVanMay.get(18));
        itemThuVanMayRandom.add(5, itemThuVanMay.get(19));
        itemThuVanMayRandom.add(1, itemThuVanMay.get(20));
        itemThuVanMayRandom.add(1, itemThuVanMay.get(21));
        itemThuVanMayRandom.add(12, itemThuVanMay.get(22));
        itemThuVanMayRandom.add(1, itemThuVanMay.get(23));
    }
    public void loadItemOption() {
        try {
            Connection conn = DbManager.getInstance().getConnection(DbManager.GAME);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM `option`;", ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = stmt.executeQuery();
            resultSet.last();
            resultSet.beforeFirst();
            while (resultSet.next()) {
                try {
                   ItemOptionTemplate item = new ItemOptionTemplate();
                    item.id = resultSet.getShort("id");
                    item.text = resultSet.getString("text");
                    item.type = resultSet.getByte("type");
                    item.level = resultSet.getByte("level");
                    item.strOption = resultSet.getString("strOption");
                    optionTemplates.add(item);
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            resultSet.close();
            stmt.close();
            Log.info("Load item option success "+optionTemplates.size());
            DataCenter.gI().itemOptionTemplate = optionTemplates.toArray(new ItemOptionTemplate[getOptionSize()]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void loadItemNap(){
        try {
            String path = "itemnap.json";
            if (!Files.exists(Paths.get(path)))
                return;
            String content = new String(Files.readAllBytes(Paths.get(path)));
            if (content == null || content.isEmpty()) {
                return;
            }
            JSONArray jsonArray = new JSONArray(content);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int id = jsonObject.getInt("id");
                Item item = new Item(id);
                item.quantity = jsonObject.getInt("quantity");
                item.expire = jsonObject.getLong("expire");
                item.strOption = jsonObject.getString("strData");
                itemNapThe.add(item);
            }
            Log.debug("Load itemnap.json success "+itemNapThe.size());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void add(ItemTemplate entry) {
        itemTemplates.add(entry);
    }

    public ItemTemplate getItemTemplate(int index) {
        return itemTemplates.get(index);
    }
    public int getOptionSize() {
        return this.optionTemplates.size();
    }
    public ItemOptionTemplate getItemOptionTemplate(int index) {
        return optionTemplates.get(index);
    }
    public List<ItemTemplate> createSet(int levelNeed, int idChar) {
        List<ItemTemplate> set = new ArrayList<>();
        if(idChar==5){
            levelNeed = 1;
        }
        for (ItemTemplate item : itemTemplates) {
            if ((item.type == 2 || item.type == 4 || item.type == 6 || item.type == 8)
                    && item.levelNeed == levelNeed && item.typeChar == idChar) {
                if(!item.name.startsWith("Kích hoạt")
                        &&!item.name.contains("Cẩm Tú")
                        &&!item.name.contains("Khâm La")
                        &&!item.name.contains("Hiệp Nghĩa")
                        &&!item.name.contains("Hạo Thiên"))
                set.add(item);
            }
        }
        return set;
    }
    public int findByName(String name){
        int id =-1;
        for(ItemOptionTemplate op: optionTemplates){
            if(op.text.toLowerCase().equals(name.toLowerCase())){
                return op.id;
            }
        }
        return id;
    }

    public String getItemName(int itemId) {
        return itemTemplates.get(itemId).name;
    }
}
