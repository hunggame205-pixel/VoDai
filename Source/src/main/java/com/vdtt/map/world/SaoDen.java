package com.vdtt.map.world;

import com.vdtt.effect.Effect;
import com.vdtt.map.Map;
import com.vdtt.map.MapManager;
import com.vdtt.map.zones.ZSaoDen;
import com.vdtt.map.zones.Zone;
import com.vdtt.model.Char;
import com.vdtt.util.Log;

import java.util.List;

public class SaoDen extends World{

    public SaoDen(){
        setType(World.SAO_DEN);
        this.name = "SaoDen";
        this.generateId();
        this.countDown = 1500;
        Map map = new Map((short) 39);
        for (int i = 0; i < 30; i++) {
            ZSaoDen z = new ZSaoDen(i, map.mapTemplate, map);
            z.setWorld(this);
            addZone(z);
        }
        this.initFinished = true;
    }
    public void joinZone(Char p,int id){
        zones.get(id).join(p,1);
    }
    @Override
    public void close() {
        try {
            if (this.isClosed) {
                return;
            }
            List<Char> members = getMembers();
            for (Char _char : members) {
                try {
                    if (_char.isCleaned) {
                        continue;
                    }
                    Effect eff = _char.getEm().findByID(132);
                    if (eff != null) {
                        _char.getEm().remove(eff);
                        _char.getService().playerRemoveEffect(eff);
                    }
                    _char.joinZone(86, 0, -1);
                    _char.removeWorld(World.SAO_DEN);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            Log.error("close saoden error", e);
        } finally {
            super.close();
            MapManager.getInstance().saoDen=null;
        }
    }

    @Override
    public boolean enterWorld(Zone pre, Zone next) {
        Log.debug(!pre.map.isSaoDen()&&next.map.isSaoDen());
        return !pre.map.isSaoDen()&&next.map.isSaoDen();
    }

    @Override
    public boolean leaveWorld(Zone pre, Zone next) {
        return pre.map.isSaoDen()&&!next.map.isSaoDen();
    }
}
