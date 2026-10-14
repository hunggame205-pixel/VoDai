package com.vdtt.map.zones;

import com.vdtt.item.Item;
import com.vdtt.map.Map;
import com.vdtt.map.MapTemplate;
import com.vdtt.map.item.ItemMap;
import com.vdtt.map.item.ItemMapFactory;
import com.vdtt.map.world.SummerEvent;
import com.vdtt.mob.Mob;
import com.vdtt.model.Char;
import com.vdtt.model.RandomItem;
import com.vdtt.util.Log;
import com.vdtt.util.VDTTUtlis;
import org.jetbrains.annotations.NotNull;

public class SummerArena extends ZWorld {
    public byte turn;

    public SummerArena(int id, MapTemplate tilemap, Map map) {
        super(id, tilemap, map);
        isWorld = true;
    }
    @Override
    public void createNpc(){

    }

    @Override
    public void createMonster() {
        for (Mob mob : map.mapTemplate.mobList) {
            Mob m = mob.clone();
            m.idEntity = monsters.size();
            m.id = 183;
            m.zone = this;
            m.hp = m.hpFull = 1000000;
            m.kiNow = mob.kiMax = 10000;
            m.attackDelay = 10000;
            mob.status=0;
            monsters.add(m);
        }
    }

    @Override
    public void update() {
        super.update();
        refresh();
    }

    public void refresh() {
        if (getLivingMonsters().size() <= 1) {
            if (turn == 0) {
                turn = 1;
                for (Mob m : monsters) {
                    m.id = 278;
                    m.isDead = false;
                    m.hp = m.hpFull;
                    m.status = 2;
                    getService().removeMonster(m);
                    getService().addMob(m);
                }
            } else if (turn == 1) {
                turn = 2;
                for (Mob m : monsters) {
                    m.id = 279;
                    m.hp = m.hpFull;
                    m.isDead = false;
                    m.status = 2;
                    getService().removeMonster(m);
                    getService().addMob(m);
                }
            } else if (turn == 2) {
                turn = 3;
                for (Mob m : monsters) {
                    m.id = 280;
                    m.hp = m.hpFull;
                    m.isDead = false;
                    m.status = 2;
                    getService().removeMonster(m);
                    getService().addMob(m);
                }
            } else if (turn == 3) {
                turn = 4;
                Mob mob = new Mob();
                mob.idEntity = monsters.size();
                mob.id = 88;
                mob.zone = this;
                mob.hp = mob.hpFull = 100000000;
                mob.kiNow = mob.kiMax = 50000;
                mob.x = 1160;
                mob.y = 416;
                mob.levelBoss = 6;
                mob.dameMax = 10000;
                monsters.add(mob);
                getService().addMob(mob);
            }
        }
    }
    @Override
    public void requestChangeMap(@NotNull Char p) {
        join(p, -1);
    }

        @Override
    public void mobDead(Mob mob, Char killer) {
        if (mob.id == 183 || (mob.id >= 277 && mob.id <= 280)) {
            int itemId = RandomItem.MORO_CON.next();
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
        } else if (mob.id == 88) {
            for (int i = 0; i < 40; i++) {
                int itemId = RandomItem.MORO_BOSS.next();
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
            SummerEvent world = (SummerEvent) this.world;
            world.reward();
            world.setCountdown(10);
            world.getService().serverMessage("Phó bản đã kết thúc , Các chiến binh sẽ được dịch chuyển ra ngoài sau 10s");
        }
    }

}
