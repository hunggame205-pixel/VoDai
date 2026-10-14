package com.vdtt.map.world;

import com.vdtt.map.Map;
import com.vdtt.map.MapManager;
import com.vdtt.map.MapService;
import com.vdtt.map.zones.Zone;
import com.vdtt.map.zones.ZoneDoanhTrai;
import com.vdtt.model.Char;
import com.vdtt.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DoanhTrai extends World {
    public static List<DoanhTrai> doanhTrais = new ArrayList<>();

    public static DoanhTrai getDoanhTrai(int id) {
        for (DoanhTrai d : doanhTrais) {
            if (d.id == id) {
                return d;
            }
        }
        return null;
    }

    public static void addDoanhTrai(DoanhTrai d) {
        synchronized (doanhTrais) {
            doanhTrais.add(d);
        }
    }

    public static void removeDoanhTrai(DoanhTrai d) {
        synchronized (doanhTrais) {
            doanhTrais.remove(d);
        }
    }

    public DoanhTrai(int level) {
        setType(World.DoanhTrai);
        this.name = "DoanhTrai";
        generateId();
        setCountdown(2700);
        for (int i = 0; i < 6; i++) {
            Map map = MapManager.getInstance().find(106 + i);
            ZoneDoanhTrai z = new ZoneDoanhTrai(i, map.mapTemplate, map);
            z.level = (byte) level;
            z.setWorld(this);
            addZone(z);
        }
        initFinished = true;
    }

    public void joinMap(Char p) {
        zones.get(0).join(p, 1);
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
                    _char.joinZone(86, 0, 1);
//                    _char.serverMessage("Cửa đi ngục đã được khép lại.");
                    _char.removeWorld(World.DoanhTrai);
                    _char.idDoanhTrai=-1;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            Log.error("close doanh trai error", e);
        } finally {
            super.close();
            removeDoanhTrai(this);
        }

    }

    @Override
    public boolean enterWorld(Zone pre, Zone next) {
        return !pre.map.isDoanhTrai() && next.map.isDoanhTrai();
    }

    @Override
    public boolean leaveWorld(Zone pre, Zone next) {
        return pre.map.isDoanhTrai() && !next.map.isDoanhTrai();
    }
}
