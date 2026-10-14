package com.vdtt.map.world;

import com.vdtt.item.Item;
import com.vdtt.map.Map;
import com.vdtt.map.MapManager;
import com.vdtt.map.zones.SummerArena;
import com.vdtt.map.zones.ZWorld;
import com.vdtt.map.zones.Zone;
import com.vdtt.model.Char;
import com.vdtt.util.Log;

import java.util.ArrayList;
import java.util.List;

public class SummerEvent extends World {
    public static List<SummerEvent> dungeons = new ArrayList<>();

    public static void addEvent(SummerEvent dungeon) {
        synchronized (dungeons) {
            dungeons.add(dungeon);
        }
    }

    public static SummerEvent findEventById(int id) {
        synchronized (dungeons) {
            for (SummerEvent dun : dungeons) {
                if (dun.isInEvent(id)) {
                    return dun;
                }
            }
        }
        return null;
    }
    public void removeEvent(SummerEvent dungeon) {
        synchronized (dungeons) {
            dungeons.remove(dungeon);
        }
    }
    public ArrayList<Integer> listCharId;


    public SummerEvent() {
        setType(World.SUMMER_EVENT);
        this.name = "SummerEvent";
        generateId();
        this.countDown = 3600;
        Map map = new Map((short) 88);
        ZWorld zone = new SummerArena(id, map.mapTemplate, map);
        zone.setWorld(this);
        addZone(zone);
        this.listCharId = new ArrayList<>();
        this.initFinished = true;
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
        zones.get(0).join(_char, -1);
        for (int id : this.listCharId) {
            if (id == _char.id) {
                return;
            }
        }
        this.listCharId.add(_char.id);
    }

    public void reward() {
        List<Char> members = getMembers();
        for (Char _char : members) {
            try {
                if (!_char.isCleaned) {
                    _char.addClanPoint(10);
                    Item item = new Item(965);
                    item.setQuantity(15);
                    _char.addItemToBag(item);
                    _char.getService().addItem(item);
                    _char.getService().serverMessage("Bạn đã nhận được 10 điểm cống hiến vũ trụ");
                }
            } catch (Exception e) {
                e.printStackTrace();
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
                    _char.removeWorld(World.SUMMER_EVENT);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            Log.error("close hell error", e);
        } finally {
            super.close();
            removeEvent(this);
        }
    }

    @Override
    public boolean enterWorld(Zone pre, Zone next) {
        return !pre.isWorld && next.isWorld;
    }

    @Override
    public boolean leaveWorld(Zone pre, Zone next) {
        return pre.isWorld && !next.isWorld;
    }
}
