package com.vdtt.map.world;

import com.vdtt.effect.Effect;
import com.vdtt.map.Map;
import com.vdtt.map.MapManager;
import com.vdtt.map.zones.HellArena;
import com.vdtt.map.zones.Zone;
import com.vdtt.model.Char;
import com.vdtt.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Hell extends World {
    public static List<Hell> dungeons = new ArrayList<>();

    public static void addHell(Hell dungeon) {
        synchronized (dungeons) {
            dungeons.add(dungeon);
        }
    }

    public static Hell findHellById(int id) {
        synchronized (dungeons) {
            for (Hell dun : dungeons) {
                if (dun.isInEvent(id)) {
                    return dun;
                }
            }
        }
        return null;
    }
    public void removeHell(Hell dungeon) {
        synchronized (dungeons) {
            dungeons.remove(dungeon);
        }
    }

    public ArrayList<Integer> listCharId;

    public Hell(int level) {
        setType(World.DUNGEON);
        this.name = "Dungeon";
        generateId();
        setCountdown(2100);
        Map map = MapManager.getInstance().find(19);
        HellArena z = new HellArena(this.id, map.mapTemplate, map, getLevel(level));
        z.setWorld(this);
        addZone(z);
        listCharId = new ArrayList<>();
        this.initFinished = true;
    }
    public void addPointPB(int point) {
        List<Char> members = getMembers();
        for (Char _char : members) {
            try {
                if(!_char.isCleaned)
                _char.updatePointPB(point);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    public void addCountTaskFide() {
        List<Char> members = getMembers();
        for (Char _char : members) {
            try {
                if(!_char.isCleaned){
                    if(_char.getEm().findByID(162)!=null){
                        Effect effect = _char.getEm().findByID(162);
                        effect.param++;
                        if(effect.param >= 8){
                            effect.param = 8;
                        }
                        _char.zone.getService().playerAddEffect(_char, effect);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    public int getLevel(int level) {
        return level == 1 ? 17 : level == 2 ? 27 : level == 3 ? 37 : level == 4 ? 47 : level == 5 ? 57 : 67;
    }

    public void joinZone(Char _char) {
        if(_char.taskId==14&&_char.taskMain != null&&_char.taskMain.index == 0){
            _char.updateTaskCount(101);
        }
        zones.get(0).join(_char, -1);
        for (int id : this.listCharId) {
            if (id == _char.id) {
                return;
            }
        }
        this.listCharId.add(_char.id);
    }
    public boolean isInEvent(int id){
        for (int i : listCharId){
            if (i == id){
                return true;
            }
        }
        return false;
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
                    _char.joinZone(56, 0, -1);
                    _char.serverMessage("Cửa đi ngục đã được khép lại.");
                    _char.removeWorld(World.DUNGEON);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            Log.error("close hell error", e);
        } finally {
            super.close();
            removeHell(this);
        }

    }

    @Override
    public boolean enterWorld(Zone pre, Zone next) {
        return !pre.map.isHell() && next.map.isHell();
    }

    @Override
    public boolean leaveWorld(Zone pre, Zone next) {
        return pre.map.isHell() && !next.map.isHell();
    }
}
