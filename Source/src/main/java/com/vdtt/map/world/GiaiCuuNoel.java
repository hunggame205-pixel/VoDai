package com.vdtt.map.world;

import com.vdtt.event.Noel;
import com.vdtt.map.Map;
import com.vdtt.map.MapManager;
import com.vdtt.map.zones.ZNoel;
import com.vdtt.map.zones.Zone;
import com.vdtt.model.Char;
import com.vdtt.util.Log;

import java.util.ArrayList;
import java.util.List;

public class GiaiCuuNoel extends World{

    public static List<GiaiCuuNoel> list = new ArrayList<>();

    public static void add(GiaiCuuNoel world) {
        synchronized (list) {
            list.add(world);
        }
    }
    public static void remove(GiaiCuuNoel world) {
        synchronized (list) {
            list.remove(world);
        }
    }
    public static GiaiCuuNoel get(int id) {
        synchronized (list) {
            for (GiaiCuuNoel world : list) {
                if (world.isInEvent(id)) {
                    return world;
                }
            }
        }
        return null;
    }

    public ArrayList<Integer> listCharId;


    public GiaiCuuNoel() {
        setType(World.NOEL);
        this.name = "GiaiCuuNoel";
        generateId();
        for (int i = 0; i < 5; i++) {
            Map map = MapManager.getInstance().find(93+i);
            ZNoel zNoel = new ZNoel(i, map.mapTemplate, map);
            zNoel.setWorld(this);
            addZone(zNoel);
        }
        setCountdown(1800);
        listCharId = new ArrayList<>();
        this.initFinished = true;
        add(this);
    }

    public boolean isInEvent(int id){
        for (int i : listCharId){
            if (i == id){
                return true;
            }
        }
        return false;
    }

    public void joinZone(Char _char) {
        zones.get(0).join(_char, 0);
        for (int id : this.listCharId) {
            if (id == _char.id) {
                return;
            }
        }
        this.listCharId.add(_char.id);
    }

    public void join(Char _char,int mapId) {
        for (Zone z : zones) {
            if (z.map.id == mapId) {
                z.join(_char, -1);
                return;
            }
        }
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
                    _char.joinZone(86, 0, -1);
                    _char.removeWorld(World.NOEL);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            Log.error("close noel error", e);
        } finally {
            super.close();
            remove(this);
        }
    }

    @Override
    public boolean enterWorld(Zone pre, Zone next) {
        return !pre.map.isNoel()&&next.map.isNoel();
    }

    @Override
    public boolean leaveWorld(Zone pre, Zone next) {
        return pre.map.isNoel()&&!next.map.isNoel();
    }
}
