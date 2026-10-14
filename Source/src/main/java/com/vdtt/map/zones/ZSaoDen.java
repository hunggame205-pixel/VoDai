package com.vdtt.map.zones;

import com.vdtt.effect.Effect;
import com.vdtt.map.Map;
import com.vdtt.map.MapTemplate;
import com.vdtt.map.world.SaoDen;
import com.vdtt.mob.Mob;
import com.vdtt.model.Char;
import com.vdtt.util.VDTTUtlis;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ZSaoDen extends ZWorld{

    public ZSaoDen(int id, MapTemplate tilemap, Map map) {
        super(id, tilemap, map);
    }
    @Override
    public void createMonster(){
        int listMob[] = {108,109,110,111,112,113,114};
        int percent[] = {30,25,15,10,14,5,1};
        int[][] listXY = {{234,506},{234,290},{1255,284},{1182,459},{519,505},{337,505},{999,459}};
        int index = VDTTUtlis.randomWithRate(percent,100);
        int idMob = listMob[index];
        Mob mob = new Mob();
        mob.idEntity=monsters.size();
        mob.id=idMob;
        mob.x = listXY[index][0];
        mob.y = listXY[index][1];
        mob.zone = this;
        mob.levelBoss = 6;
        mob.hp=mob.hpFull= 6400000+(idMob-108)*1000000;
        mob.kiNow=mob.kiMax = 5000;
        monsters.add(mob);
    }
    @Override
    public void update(){
        super.update();
    }
    public void refresh(){

    }
    @Override
    public void mobDead(Mob mob, Char pl){
        List<Char> chars = getChars();
        int idNgocRong = mob.getSaoDenByMob();
        if(idNgocRong > 0){
            Effect effect = new Effect(132,TimeUnit.MINUTES.toMillis(5),idNgocRong);
            pl.getEm().setEffect(effect);
            for (Char c : chars){
                if(c!= null&&!c.isCleaned) {
                    c.setTypePk((byte) 3);
                }
            }
        }
    }
}
