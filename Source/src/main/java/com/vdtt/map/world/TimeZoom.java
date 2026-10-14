package com.vdtt.map.world;

import com.vdtt.map.Map;
import com.vdtt.map.MapManager;
import com.vdtt.map.MapTemplate;
import com.vdtt.map.zones.ZTimeZoom;
import com.vdtt.map.zones.Zone;
import com.vdtt.model.Char;

import java.util.ArrayList;
import java.util.List;

public class TimeZoom extends World {

    public int level;
    public byte type;
    public static List<TimeZoom> zoomList = new ArrayList<>();

    public static void addZoom(TimeZoom zoom) {
        synchronized (zoomList) {
            zoomList.add(zoom);
        }
    }

    public static void removeZoom(TimeZoom zoom) {
        synchronized (zoomList) {
            zoomList.remove(zoom);
        }
    }

    public static TimeZoom getZoom(int level, byte type) {
        synchronized (zoomList) {
            for (TimeZoom zoom : zoomList) {
                if (zoom.level == level && zoom.type == type&&zoom.zones.get(0).getChars().size() < 4) {
                    return zoom;
                }
            }
        }
        return null;
    }


    public TimeZoom(int level, byte type) {
        setType(World.TIME_ZOOM);
        this.name = "TimeZoom";
        generateId();
        this.countDown = 360000;
        this.level = level;
        this.type = type;
        Map map = MapManager.getInstance().find(84);
        ZTimeZoom zone = new ZTimeZoom(this.id, map.mapTemplate,map,level);
        zone.setWorld(this);
        zones.add(zone);
        this.initFinished = true;

    }

    @Override
    public void update() {
        if (countDown <= 0) {
            close();
            return;
        }
    }

    public void joinZone(Char _char) {
        zones.get(0).join(_char, -1);
    }

    public void close() {
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
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        super.close();
    }

    @Override
    public boolean enterWorld(Zone pre, Zone next) {
        return false;
    }

    @Override
    public boolean leaveWorld(Zone pre, Zone next) {
        return false;
    }
}
