package com.vdtt.server;

import com.vdtt.data.DataCenter;
import com.vdtt.map.Map;
import com.vdtt.map.MapManager;
import com.vdtt.map.MapTemplate;
import com.vdtt.map.zones.Zone;
import com.vdtt.mob.Mob;
import com.vdtt.mob.MobTemplate;
import com.vdtt.model.Entity;
import com.vdtt.util.Log;
import com.vdtt.util.RandomCollection;
import com.vdtt.util.VDTTUtlis;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
public class SpawnBoss {

    private int id;
    private Map map;
    private final RandomCollection<Integer> mobs = new RandomCollection<>();
    private Mob currMonster;
    private short x, y;
    private int hp;
    private int kiMax;

    public SpawnBoss(int id, Map map, short x, short y, int hp, int kiMax) {
        this.id = id;
        this.map = map;
        this.x = x;
        this.y = y;
        this.hp = hp;
        this.kiMax = kiMax;
    }

    public void add(int rate, int mobID) {
        mobs.add(rate, mobID);
    }

    public void spawn() {
        if (currMonster != null && currMonster.id != 296) {
            currMonster.die();
            currMonster = null;
        }
        if (mobs.next() == 134) {
            List<Short>list = new ArrayList<>();
            for (MapTemplate mapTemplate : MapManager.getInstance().getMapTemplates()) {
                if (mapTemplate.type == 0&&mapTemplate.mobList.size()>0&&mapTemplate.id < 100) {
                    list.add(mapTemplate.id);
                }
            }
            map = MapManager.getInstance().find(list.get(VDTTUtlis.nextInt(0, list.size() - 1)));
        }
        int zoneId = VDTTUtlis.nextInt(0, 9);
        Zone z = map.getZoneById(zoneId);
        int mobID = mobs.next();
        if(mobID == 308){
            SpawnBossManager.zoneTDST = zoneId;
        }
        if(mobID >= 309 && mobID <= 312){
           z = map.getZoneById(SpawnBossManager.zoneTDST);
        }
        MobTemplate mobTemplate = DataCenter.gI().mobTemplate[mobID];
        Mob mob = z.createBoss((short) mobID, hp, mobTemplate.getTimeThuHoach(), x, y, kiMax);
        if(map.mapTemplate.listEntity.size() != 0) {
            Entity entity = map.mapTemplate.listEntity.get(VDTTUtlis.nextInt(0, map.mapTemplate.listEntity.size() - 1));
            mob.x = entity.x;
            mob.y = entity.y;
        }else {
            mob.x = x;
            mob.y = y;
        }
        mob.zone = z;
        z.addMob(mob);
        currMonster = mob;
        String text = mob.getTemplate().name + " đã xuất hiện tại " + map.mapTemplate.name + " khu " + z.id;
        GlobalService.getInstance().chat("Hệ thống", text, (byte) 1);
        Log.info(text +" "+ map.mapTemplate.id + " khu " + z.id);
    }
}

