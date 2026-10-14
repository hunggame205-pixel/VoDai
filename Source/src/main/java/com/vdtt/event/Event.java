package com.vdtt.event;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.vdtt.data.SQLStatement;
import com.vdtt.db.DbManager;
import com.vdtt.item.ItemManager;
import com.vdtt.item.Item;

import com.vdtt.model.Char;

import com.vdtt.event.eventpoint.EventPoint;
import com.vdtt.event.eventpoint.Point;
import com.vdtt.server.GlobalService;
import com.vdtt.map.zones.Zone;
import com.vdtt.server.Config;
import com.vdtt.util.Log;
import java.lang.reflect.Modifier;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.vdtt.util.RandomCollection;
import com.vdtt.util.VDTTUtlis;
import lombok.Getter;
import lombok.Setter;

public abstract class Event {

    public static final int SUMMER = 0;

    public static final byte DOI_BANG_LUONG = 0;
    public static final byte DOI_BANG_XU = 1;

    public static final long EXPIRE_7_DAY = 604800000L;
    public static final long EXPIRE_30_DAY = 2592000000L;

    public static final RandomCollection<Integer> DOI_PHAN_TU = new RandomCollection<>();
    public static final int TRUNG_THU = 1;
    public static final int NOEL = 2;

    static {

    }

    private static Event instance;

    public static void init() {
        instance = null;
        String name = Config.getInstance().getEvent();
        if (name == null || name.trim().isEmpty()) {
            return;
        }
        name = name.trim();
        try {
            Class<?> type = Class.forName(name);
            if (!Event.class.isAssignableFrom(type) || Modifier.isAbstract(type.getModifiers())) {
                Log.warn("Su kien khong hop le: " + name);
                return;
            }
            instance = (Event) type.newInstance();
        } catch (ClassNotFoundException ex) {
            Log.warn("Khong tim thay su kien: " + name);
        } catch (InstantiationException | IllegalAccessException ex) {
            Log.error("Khong tao duoc su kien " + name, ex);
        }
    }

    public static Event getEvent() {
        return instance;
    }

    public static boolean isEvent() {
        return (instance != null && !instance.isEnded());
    }

    public static boolean isSummer() {
        return isEvent() && instance instanceof SumMer;
    }



    public static void useVipEventItem(Char _char, int type, RandomCollection<Integer> rc) {

    }

    @Getter
    @Setter
    protected int id;
    protected List<EventPoint> eventPoints;
    @Getter
    protected RandomCollection<Integer> itemsThrownFromMonsters;
    @Getter
    protected RandomCollection<Integer> itemsRecFromCoinItem;
    @Getter
    protected RandomCollection<Integer> itemsRecFromGoldItem;
    @Getter
    protected RandomCollection<Integer> itemsRecFromGold2Item;
    protected Set<String> keyEventPoint;
    protected Calendar endTime = Calendar.getInstance();

    public Event() {
        itemsThrownFromMonsters = new RandomCollection<>();
        itemsRecFromCoinItem = new RandomCollection<>();
        itemsRecFromGoldItem = new RandomCollection<>();
        itemsRecFromGold2Item = new RandomCollection<>();
        eventPoints = new ArrayList<>();
        keyEventPoint = new TreeSet<>();
        initRandomItem();
    }

    public static boolean isTrungThu() {
        return isEvent() && instance instanceof TrungThu;
    }

    public static boolean isNoel() {
        return isEvent() && instance instanceof Noel;
    }

    public abstract void initStore();

    public int randomItemID() {
        return itemsThrownFromMonsters.next();
    }

    public abstract void action(Char p, int type, int amount);

    public abstract void menu(Char p,int idNpc);

    public void useItem(Char _char, Item item) {

    }

    public EventPoint createEventPoint() {
        EventPoint eventPoint = new EventPoint();
        keyEventPoint.forEach((key) -> {
            eventPoint.add(new Point(key, 0, 0));
        });
        return eventPoint;
    }

    public void loadEventPoint() {
        try {
            eventPoints.clear();
            PreparedStatement ps = DbManager.getInstance().getConnection(DbManager.GAME)
                    .prepareStatement(SQLStatement.LOAD_EVENT_POINT);
            ps.setInt(1, this.id);
            ps.setInt(2, Config.getInstance().getServerID());
            ResultSet rs = ps.executeQuery();
            Gson g = new Gson();
            while (rs.next()) {
                EventPoint eventPoint = createEventPoint();
                int id = rs.getInt("id");
                int playerID = rs.getInt("player_id");
                String name = rs.getString("name");
                ArrayList<Point> points = g.fromJson(rs.getString("point"), new TypeToken<ArrayList<Point>>() {
                }.getType());
                eventPoint.setId(id);
                eventPoint.setPlayerID(playerID);
                eventPoint.setPlayerName(name);
                eventPoint.setPoints(points);
                eventPoint.addIfMissing(keyEventPoint);
                eventPoints.add(eventPoint);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Event.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addEventPoint(EventPoint eventPoint) {
        synchronized (eventPoints) {
            eventPoints.add(eventPoint);
        }
    }

    public void removeEventPoint(EventPoint eventPoint) {
        synchronized (eventPoints) {
            eventPoints.remove(eventPoint);
        }
    }

    public EventPoint findEventPointByPlayerID(int playerID) {
        synchronized (eventPoints) {
            for (EventPoint ev : eventPoints) {
                if (ev.getPlayerID() == playerID) {
                    return ev;
                }
            }
            return null;
        }
    }

    public abstract void initMap(Zone zone);

    // use only 1 item
    public boolean useEventItem(Char p, int itemId, RandomCollection<Integer> rc) {
        int[][] itemRequires = new int[][] { { itemId, 1 } };
        return useEventItem(p, 1, itemRequires, 0, 0, 0, rc);
    }

    public boolean useEventItem(Char p, int number, int[][] itemRequire, int gold, int coin, int yen,
            RandomCollection<Integer> rc) {
        return makeEventItem(p, number, itemRequire, gold, coin, yen, rc, -1);
    }

    public boolean useEventItem(Char p, int number, int gold, int coin, RandomCollection<Integer> rc) {
        return makeEventItem(p, number, new int[][] {}, gold, coin, 0, rc, -1);
    }

    public boolean makeEventItem(Char p, int number, int[][] itemRequire, int gold, int coin, int yen,
            int itemIdReceive) {
        return makeEventItem(p, number, itemRequire, gold, coin, yen, null, itemIdReceive);
    }

    public boolean makeEventItem(Char p, int number, int[][] itemRequire, int gold, int coin, int yen,
            RandomCollection<Integer> rc, int itemIdReceive) {
        if (number < 1) {
            p.getService().sendTextNPC( "Số lượng tối thiểu là 1.","");
            return false;
        }

        if (number > 1000) {
            p.getService().sendTextNPC( "Số lượng tối đa là 1.000.","");
            return false;
        }

        int priceGold = number * gold;
        int priceCoin = number * coin;
        int priceYen = number * yen;

        for (int i = 0; i < itemRequire.length; i++) {
            int itemId = itemRequire[i][0];
            int amount = itemRequire[i][1] * number;
            int index = p.getIndexItemByIdInBag(itemId);
            if (index == -1 || p.bag[index] == null || !p.bag[index].has(amount)) {
                p.getService().sendTextNPC("Không đủ " + ItemManager.getInstance().getItemName(itemId),"");
                return false;
            }
        }
        if (p.zeni < priceGold) {
            p.getService().sendTextNPC( "Không đủ Zeni","");
            return false;
        } else if (p.ballZ < priceCoin) {
            p.getService().sendTextNPC( "Không đủ BallZ","");
            return false;
        } else if (rc != null && p.getSlotNull() < number) {
            p.serverDialog("Không đủ chỗ trống trong túi");
            return false;
        } else if (itemIdReceive != -1 && p.getSlotNull() < 1) {
            p.serverDialog("Không đủ chỗ trống trong túi");
            return false;
        }


        if (priceGold > 0) {
            p.addZeni(-priceGold,true);
        }

        if (priceCoin > 0) {
            p.addBallz(-priceCoin,true);
        }

        for (int i = 0; i < itemRequire.length; i++) {
            int itemId = itemRequire[i][0];
            int amount = itemRequire[i][1] * number;
            int index = p.getIndexItemByIdInBag(itemId);
            p.removeItem(index, amount, true);
        }

        if (rc != null) {
            p.addEXP(VDTTUtlis.nextInt(80000,120000));
            p.addCoin(VDTTUtlis.nextInt(80000,120000),true);
            for (int i = 0; i < number; i++) {
                int itemId = rc.next();
                Item itm = new Item(itemId);
                Item itmUsed = new Item(itemRequire[0][0]); // item used
                itm.initExpire();
                p.addItemToBag(itm);
                p.getService().addItem(itm);
//              ktg
                if (itm.id == 896 ||itm.id == 897 ||itm.id == 898 ||itm.id == 1050 || itm.id == 1051 || itm.id == 297 || itm.id == 296 || itm.id == 295 || itm.id == 891 || itm.id == 374 || itm.id == 555 || itm.id == 298 || itm.id == 431 || itm.id == 519 || itm.id == 284|| itm.id == 309 || itm.id == 848 || itm.id == 972|| itm.id == 989 || itm.id == 8 || itm.id == 9|| itm.id == 435 || itm.id == 437 ) {
                    GlobalService.getInstance().chat("Hệ thống","Người chơi c#item"+
                            p.name + "c#white sử dụng " + itmUsed.template.name + " nhận được " + itm.template.name, (byte) 1);
                }
            }

        } else if (itemIdReceive != -1) {
            Item itm = new Item(itemIdReceive);
            itm.setQuantity(number);
            p.addItemToBag(itm);
            p.getService().addItem(itm);
//            if (priceGold > 0) {
//                p.getEventPoint().addPoint(EventPoint.DIEM_TIEU_XAI, 1);
//            }
        }
        return true;
    }

    public void viewTop(Char p, String key, String title, String format) {
        List<EventPoint> list = eventPoints.stream().sorted((o1, o2) -> {
            int p1 = o1.getPoint(key);
            int p2 = o2.getPoint(key);
            return p2 - p1;
        }).limit(10).filter(t -> t.getPoint(key) > 0).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        int rank = 1;
        for (EventPoint t : list) {
            sb.append(String.format(format,rank++, t.getPlayerName(), t.getPoint(key)))
                    .append("\n;");
        }
        p.getService().sendTextNPC(title,sb.toString());
    }

    public int getRanking(Char p, String key) {
        List<EventPoint> list = eventPoints.stream().sorted((o1, o2) -> {
            int p1 = o1.getPoint(key);
            int p2 = o2.getPoint(key);
            return p2 - p1;
        }).limit(10).filter(t -> t.getPoint(key) > 0).collect(Collectors.toList());
        int rank = 0;
        for (EventPoint t : list) {
            rank++;
            if (t.getPlayerName().equals(p.name)) {
                return rank;
            }
        }
        return 99;
    }

    public boolean isEnded() {
        return endTime.getTime().getTime() - System.currentTimeMillis() <= 0;
    }

    public void initRandomItem() {

    }

}
