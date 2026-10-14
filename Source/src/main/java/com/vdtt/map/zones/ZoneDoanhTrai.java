package com.vdtt.map.zones;

import com.vdtt.event.Event;
import com.vdtt.item.Item;
import com.vdtt.map.Map;
import com.vdtt.map.MapTemplate;
import com.vdtt.map.item.ItemMap;
import com.vdtt.map.item.ItemMapFactory;
import com.vdtt.mob.Mob;
import com.vdtt.model.Char;
import com.vdtt.model.RandomItem;
import com.vdtt.model.WayPoint;
import com.vdtt.task.MobInfo;
import com.vdtt.task.TaskFactory;
import com.vdtt.util.Log;
import com.vdtt.util.VDTTUtlis;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ZoneDoanhTrai extends ZWorld{
    public byte level;
    public boolean isCreateBoss = false;
    public ZoneDoanhTrai(int id, MapTemplate tilemap, Map map) {
        super(id, tilemap, map);
    }

    @Override
    public void createMonster() {
        try {
            for (Mob mob : map.mapTemplate.mobList) {
                if (mob != null) {
                    Mob mob2 = mob.clone();
                    mob2.idEntity = monsters.size();
                    mob2.zone = this;
                    mob2.isCantRespawn=true;
                    mob2.kiNow = mob.kiMax= 150;
                    mob2.dameMax = 300;
                    monsters.add(mob2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void requestChangeMap(@NotNull Char p) {
        try {
            if (map.mapTemplate.listWayPoint.size() > 0) {
                WayPoint way = null;
                for (WayPoint wayPoint : map.mapTemplate.listWayPoint) {
                    if (way == null || wayPoint.getRange(p) <= way.getRange(p)) {
                        way = wayPoint;
                    }
                }
                if (way == null || way.getRange(p) > 250) {
                    this.join(p, 0);
                } else {
                    Zone z = this.world.find(way.mapNext);
                    if(!z.isOpened) {
                        this.join(p, 0);
                        p.serverMessage("Vui lòng tiêu diệt boss để mở cửa");
                    }
                    else
                    z.join(p, 0);
                }
            } else {
                Log.debug("Không thể chuyển map vì không có waypoint");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void update() {
        super.update();
        refresh();
    }
    public void refresh() {
        if(getLivingMonsters().size() == 0){
            if(map.id == 106&&!isCreateBoss){
                isCreateBoss = true;
                Mob boss = new Mob(monsters.size(),290,20000*level*map.id,level,1563,338,5000);
                boss.zone = this;
                addMob(boss);
            } else if (map.id == 107&&!isCreateBoss) {
                isCreateBoss = true;
                Mob boss = new Mob(monsters.size(),291,20000*level*map.id,level,1277,341,5000);
                boss.zone = this;
                addMob(boss);
            } else if (map.id == 108&&!isCreateBoss) {
                isCreateBoss = true;
                Mob boss = new Mob(monsters.size(),292,20000*level*map.id,level,1367,342,5000);
                boss.zone = this;
                addMob(boss);
            } else if (map.id == 109&&!isCreateBoss) {
                isCreateBoss = true;
                Mob tuong = new Mob(monsters.size(),297,1000000,level,2121,340,500);
                tuong.zone = this;
                addMob(tuong);
                Mob boss = new Mob(monsters.size(),293,20000*level*map.id,level,2121,340,5000);
                boss.zone = this;
                addMob(boss);
            } else if (map.id == 110&&!isCreateBoss) {
                isCreateBoss = true;
                Mob gamma = new Mob(monsters.size(),294,20000*level*map.id,level,377,342,5000);
                gamma.zone = this;
                addMob(gamma);
                Mob boss = new Mob(monsters.size(),295,20000*level*map.id,level,377,342,5000);
                boss.zone = this;
                addMob(boss);
            } else if (map.id == 111&&!isCreateBoss) {
                isCreateBoss = true;
                Mob boss = new Mob(monsters.size(),296,20000*level*map.id,level,1313,499,5000);
                boss.zone = this;
                addMob(boss);
            }
        }
    }
    @Override
    public void mobDead(Mob mob, Char killer) {
        if(mob.id == 290){
            for (int i = 0; i < 3; i++) {
                int itemId = RandomItem.DOANH_TRAI.next();
                if (itemId == -1) {
                    return;
                }
                Item item = new Item(itemId);
                item.setQuantity(1);
                ItemMap itemMap = ItemMapFactory.getInstance()
                        .builder()
                        .id(numberDropItem++)
                        .x((short) (mob.x + VDTTUtlis.nextInt(-30, 50)))
                        .y((short) (mob.y))
                        .build();
                itemMap.setOwnerID(killer.id);
                if (item != null) {
                    itemMap.setItem(item);
                    addItemMap(itemMap);
                    getService().addItemMap(itemMap, killer);
                }
            }
            Zone z = world.find(107);
            z.isOpened = true;
            world.getService().serverMessage("Cửa tiếp theo đã mở");
        } else if (mob.id == 291) {
            for (int i = 0; i < 3; i++) {
                int itemId = RandomItem.DOANH_TRAI.next();
                if (itemId == -1) {
                    return;
                }
                Item item = new Item(itemId);
                item.setQuantity(1);
                ItemMap itemMap = ItemMapFactory.getInstance()
                        .builder()
                        .id(numberDropItem++)
                        .x((short) (mob.x + VDTTUtlis.nextInt(-30, 50)))
                        .y((short) (mob.y))
                        .build();
                itemMap.setOwnerID(killer.id);
                if (item != null) {
                    itemMap.setItem(item);
                    addItemMap(itemMap);
                    getService().addItemMap(itemMap, killer);
                }
            }
            Zone z = world.find(108);
            z.isOpened = true;
            world.getService().serverMessage("Cửa tiếp theo đã mở");
        } else if (mob.id == 292) {
            for (int i = 0; i < 3; i++) {
                int itemId = RandomItem.DOANH_TRAI.next();
                if (itemId == -1) {
                    return;
                }
                Item item = new Item(itemId);
                item.setQuantity(1);
                ItemMap itemMap = ItemMapFactory.getInstance()
                        .builder()
                        .id(numberDropItem++)
                        .x((short) (mob.x + VDTTUtlis.nextInt(-30, 50)))
                        .y((short) (mob.y))
                        .build();
                itemMap.setOwnerID(killer.id);
                if (item != null) {
                    itemMap.setItem(item);
                    addItemMap(itemMap);
                    getService().addItemMap(itemMap, killer);
                }
            }
            Zone z = world.find(109);
            z.isOpened = true;
            world.getService().serverMessage("Cửa tiếp theo đã mở");
        } else if (mob.id == 293) {
            for (int i = 0; i < 3; i++) {
                int itemId = RandomItem.DOANH_TRAI.next();
                if (itemId == -1) {
                    return;
                }
                Item item = new Item(itemId);
                item.setQuantity(1);
                ItemMap itemMap = ItemMapFactory.getInstance()
                        .builder()
                        .id(numberDropItem++)
                        .x((short) (mob.x + VDTTUtlis.nextInt(-30, 50)))
                        .y((short) (mob.y))
                        .build();
                itemMap.setOwnerID(killer.id);
                if (item != null) {
                    itemMap.setItem(item);
                    addItemMap(itemMap);
                    getService().addItemMap(itemMap, killer);
                }
            }
            Zone z = world.find(110);
            z.isOpened = true;
            world.getService().serverMessage("Cửa tiếp theo đã mở");
        } else if (mob.id == 295||mob.id == 294) {
            if(mob.id == 295){
                for (int i = 0; i < 5; i++) {
                    int itemId = RandomItem.DOANH_TRAI.next();
                    if (itemId == -1) {
                        return;
                    }
                    Item item = new Item(itemId);
                    item.setQuantity(1);
                    ItemMap itemMap = ItemMapFactory.getInstance()
                            .builder()
                            .id(numberDropItem++)
                            .x((short) (mob.x + VDTTUtlis.nextInt(-30, 50)))
                            .y((short) (mob.y))
                            .build();
                    itemMap.setOwnerID(killer.id);
                    if (item != null) {
                        itemMap.setItem(item);
                        addItemMap(itemMap);
                        getService().addItemMap(itemMap, killer);
                    }
                }
            }
            if(getLivingMonsters().size() == 0) {
                Zone z = world.find(111);
                z.isOpened = true;
                world.getService().serverMessage("Cửa tiếp theo đã mở");
            }
        } else if (mob.id == 296) {
            for (int i = 0; i < 7; i++) {
                int itemId = RandomItem.DOANH_TRAI.next();
                if (itemId == -1) {
                    return;
                }
                Item item = new Item(itemId);
                item.setQuantity(1);
                ItemMap itemMap = ItemMapFactory.getInstance()
                        .builder()
                        .id(numberDropItem++)
                        .x((short) (mob.x + VDTTUtlis.nextInt(-30, 50)))
                        .y((short) (mob.y))
                        .build();
                itemMap.setOwnerID(killer.id);
                if (item != null) {
                    itemMap.setItem(item);
                    addItemMap(itemMap);
                    getService().addItemMap(itemMap, killer);
                }
            }
            Item item = new Item(RandomItem.DOANH_TRAI_VIP.next());
            item.setQuantity(1);
            ItemMap itemMap = ItemMapFactory.getInstance()
                    .builder()
                    .id(numberDropItem++)
                    .x((short) (mob.x + VDTTUtlis.nextInt(-30, 50)))
                    .y((short) (mob.y))
                    .build();
            itemMap.setOwnerID(killer.id);
            if (item != null) {
                itemMap.setItem(item);
                addItemMap(itemMap);
                getService().addItemMap(itemMap, killer);
            }
            world.setCountdown(10);
            List<Char> chars = getChars();
            for (Char c : chars) {
                try {
                    c.serverMessage("Chúc mừng bạn đã hoàn thành doanh trại, Có 10s nhặt đồ");
                    c.getService().sendTimeInMap(world.getCountDown(), (byte) 0);
//                    Item it = new Item(1151);
//                    it.setLock(true);
//                    it.setQuantity(1);
//                    c.addItemToBag(it);
//                    c.getService().addItem(it);
                    if(Event.isNoel()){
                        if (c.getSlotNull() > 0) {
                            Item it = new Item(930);
                            it.setLock(true);
                            it.setQuantity(20);
                            c.addItemToBag(it);
                            c.getService().addItem(it);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

