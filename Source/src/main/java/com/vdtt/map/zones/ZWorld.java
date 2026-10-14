package com.vdtt.map.zones;

import com.vdtt.map.Map;
import com.vdtt.map.MapTemplate;
import com.vdtt.map.world.World;
import com.vdtt.model.Char;
import com.vdtt.util.Log;
import lombok.Getter;
import lombok.Setter;

public class ZWorld extends Zone {

    @Getter
    @Setter
    protected World world;

    public ZWorld(int id, MapTemplate tilemap, Map map) {
        super(id, tilemap, map);
    }

    @Override
    public void join(Char p,int typeTau) {
        try {
            Zone preZone = p.zone;
            if (preZone != null) {
                if (!preZone.map.isWorld()||preZone.isWorld||!preZone.map.isSaoDen()) {
                    p.addMemberForWorld(preZone, this);
                }
            }
            super.join(p,typeTau);
           p.getService().sendTimeInMap(world.getCountDown(), (byte) 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}