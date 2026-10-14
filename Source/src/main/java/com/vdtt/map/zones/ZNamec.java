package com.vdtt.map.zones;

import com.vdtt.item.Item;
import com.vdtt.map.Map;
import com.vdtt.map.MapTemplate;
import com.vdtt.map.item.ItemMap;
import com.vdtt.map.item.ItemMapFactory;
import com.vdtt.mob.Mob;
import com.vdtt.model.Char;
import com.vdtt.model.RandomItem;
import com.vdtt.util.VDTTUtlis;

import java.util.Calendar;
import java.util.List;

public class ZNamec extends Zone {

    public ZNamec(int id, MapTemplate tilemap, Map map) {
        super(id, tilemap, map);
    }

    @Override
    public void update() {
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        if (hour >= 22 || hour < 10) {
            List<Char> chars = getChars();
            for (Char c : chars) {
                try {
                    if (c != null && !c.isCleaned) {
                        c.joinZone(86, 0, 0);
                        c.serverDialog("Hoạt động đã kết thúc");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (!isClosed()) {
            super.update();
        }
    }
    public int getItemByMap(){
        switch (template.id){
            case 112:
                return 901;
            case 113:
                return 902;
            case 114:
                return 903;
            case 115:
                return 904;
            case 116:
                return 905;
            case 117:
                return 906;
            case 118:
                return 907;
        }
        return -1;
    }

    @Override
    public void mobDead(Mob mob, Char killer){
        byte isAddKi = (byte) Math.abs(mob.level - killer.level());
        if(isAddKi > 20){
            return;
        }
        if(mob.id >= 306 && mob.id <= 312){
            for (int i = 0; i < 20; i++) {
                Item item = new Item(RandomItem.NAMEC_BOSS.next());
                item.setQuantity(1);
//                item.isLock = true;
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
            int nroId = getItemByMap();
            if(nroId != -1) {
                Item item = new Item(nroId);
                item.setQuantity(1);
//                item.isLock = true;
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
            mob.recoveryTimeCount = 7200;
            addMobForWatingListRespawn(mob);
        }else {
            if(VDTTUtlis.nextInt(20)< 5){
                Item item = new Item(RandomItem.NAMEC_NORMAL.next());
                item.setQuantity(1);
//                item.isLock = true;
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
    }
}
