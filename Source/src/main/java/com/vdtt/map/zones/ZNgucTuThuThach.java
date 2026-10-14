package com.vdtt.map.zones;

import com.vdtt.item.Item;
import com.vdtt.map.Map;
import com.vdtt.map.MapTemplate;
import com.vdtt.map.item.ItemMap;
import com.vdtt.map.item.ItemMapFactory;
import com.vdtt.mob.Mob;
import com.vdtt.model.Char;
import com.vdtt.util.VDTTUtlis;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ZNgucTuThuThach extends ZWorld {
    public byte round;
    public byte maxRound = 20;
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);


    public ZNgucTuThuThach(int id, MapTemplate tilemap, Map map) {
        super(id, tilemap, map);
    }
    public void createBoss(){
        Mob mob = new Mob();
        mob.idEntity = 0;
        mob.x = 584;
        mob.y = 197;
        mob.level = 50;
        mob.zone = this;
        mob.id = 201;
        mob.hp = mob.hpFull = mob.hpGoc = 5000000;
        mob.dameMax = 1000;
        mob.kiNow = mob.kiMax = 0;
        mob.levelBoss = 7;
        mob.dameMin = mob.dameMax * 90 / 100;
        monsters.add(mob);
    }

    public void updateRound(){
        round++;
        if(round >= maxRound){
            world.getService().serverMessage("Chúc mừng các chiến binh đã hoàn thành tất cả các tầng!!");
            world.setCountdown(10);
            return;
        }
        world.getService().serverMessage("Các chiến binh có 5s nhặt đồ trước khi chuyển qua Tầng mới!!!");
        world.setCountdown(300);
        scheduler.schedule(() -> {
            if(world.isClosed()){
                return;
            }
            Mob mob = monsters.get(0);
            mob.isDead = false;
            mob.status = 0;
            mob.effects.clear();
            long num = (long)mob.hpGoc * (long)Math.pow(2,round);
            if(num >= Integer.MAX_VALUE){
                num = Integer.MAX_VALUE;
            }
            mob.hp = mob.hpFull = (int) num;
            mob.levelBoss = 7;
            getService().recoveryMonster(mob);
            world.getService().serverMessage("Tầng " + round + " đã mở ra!!!");
        }, 5, TimeUnit.SECONDS);
    }

    @Override
    public void mobDead(Mob mob, Char killer){
        Item item = new Item(1151);
        item.setQuantity(1);
        item.setLock(true);
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
        Item item1 = new Item(1174);
        item1.setQuantity(1);
        item1.setLock(true);
        ItemMap itemMap1 = ItemMapFactory.getInstance()
                .builder()
                .id(numberDropItem++)
                .x((short) (mob.x + VDTTUtlis.nextInt(-30, 50)))
                .y((short) (mob.y))
                .build();
        itemMap1.setOwnerID(killer.id);
        if (item1 != null) {
            itemMap1.setItem(item1);
            addItemMap(itemMap1);
            getService().addItemMap(itemMap1, killer);
        }
        updateRound();
    }

}
