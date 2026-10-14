package com.vdtt.map.zones;

import com.vdtt.event.Event;
import com.vdtt.item.Item;
import com.vdtt.map.*;
import com.vdtt.map.item.ItemMap;
import com.vdtt.map.item.ItemMapFactory;
import com.vdtt.map.world.GiaiCuuNoel;
import com.vdtt.mob.Mob;
import com.vdtt.model.Char;
import com.vdtt.model.RandomItem;
import com.vdtt.model.WayPoint;
import com.vdtt.task.MobInfo;
import com.vdtt.task.TaskFactory;
import com.vdtt.util.Log;
import com.vdtt.util.VDTTUtlis;
import org.jetbrains.annotations.NotNull;

public class ZNoel extends ZWorld {
    public boolean isDone = false;
    public boolean isCreateBoss = false;

    public ZNoel(int id, MapTemplate tilemap, Map map) {
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
                    if (mob2.levelBoss == 2) {
                        mob2.hp = 0;
                    }
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
                    join(p, 0);
                } else {
                    if (!isDone) {
                        join(p, 0);
                        p.getService().serverMessage("Chưa hoàn thành cửa ải hiện tại");
                        return;
                    }
                    GiaiCuuNoel world = (GiaiCuuNoel) getWorld();
                    world.join(p,way.mapNext);
                }
            } else {
                Log.debug("Không thể chuyển map vì không có waypoint");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void mobDead(Mob mob, Char pl) {
        if (mob.id >= 267 && mob.id <= 271) {
            isDone = true;
            for (int i = 0; i < 80; i++) {
                int itemId = RandomItem.GIAI_CUU_NOEL.next();
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
                itemMap.setOwnerID(pl.id);
                if (item != null) {
                    itemMap.setItem(item);
                    addItemMap(itemMap);
                    getService().addItemMap(itemMap, pl);
                }
            }
            if (mob.id == 271) {
                world.setCountdown(10);
                world.getService().serverMessage("Hoạt động Noel sẽ kết thúc sau 10 giây");
            }else {
                world.getService().serverMessage("Cửa ải đã hoàn thành");
            }
        } else {
            if (getLivingMonsters().size() == 0 && !isCreateBoss) {
                createBoss();
            }
        }
    }

    public void createBoss() {
        isCreateBoss = true;
        Mob mob = null;
        for (Mob mob1 : monsters) {
            if (mob1.id >= 267 && mob1.id <= 271) {
                mob = mob1;
                break;
            }
        }
        if (mob != null) {
            mob.hp = mob.hpFull;
            getService().recoveryMonster(mob);
            world.getService().serverMessage("Boss đã xuất hiện");
        }
    }
}
