package com.vdtt.map.world;

import com.vdtt.map.Map;
import com.vdtt.map.MapManager;
import com.vdtt.map.zones.ZNgucTuThuThach;
import com.vdtt.map.zones.ZWorld;
import com.vdtt.map.zones.Zone;
import com.vdtt.model.Char;
import com.vdtt.util.Log;

import java.util.ArrayList;
import java.util.List;

public class NgucTuThuThach extends World {
    public static List<NgucTuThuThach> ngucTuThuThaches= new ArrayList<>();
    public static void addNgucTuThuThach(NgucTuThuThach ngucTuThuThach){
        synchronized (ngucTuThuThaches){
            ngucTuThuThaches.add(ngucTuThuThach);
        }
    }
    public static void removeNgucTuThuThach(NgucTuThuThach ngucTuThuThach){
        synchronized (ngucTuThuThaches){
            ngucTuThuThaches.remove(ngucTuThuThach);
        }
    }
    public static NgucTuThuThach findNgucTu(int id){
        synchronized (ngucTuThuThaches){
            for (NgucTuThuThach ngucTuThuThach : ngucTuThuThaches){
                if (ngucTuThuThach.charId == id){
                    return ngucTuThuThach;
                }
            }
        }
        return null;
    }
    public int charId;

    public NgucTuThuThach() {
        setType(World.NGUC_TU_THU_THACH);
        this.name = "NgucTuThuThach";
        generateId();
        setCountdown(300);
        Map map = MapManager.getInstance().find(9);
        ZNgucTuThuThach z = new ZNgucTuThuThach(this.id, map.mapTemplate, map);
        z.setWorld(this);
        z.createBoss();
        addZone(z);
        initFinished = true;
        addNgucTuThuThach(this);
    }

    public void join(Char p) {
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
                    _char.removeWorld(World.NGUC_TU_THU_THACH);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            Log.error("close nguc tu thu thach error", e);
        } finally {
            super.close();
            removeNgucTuThuThach(this);
        }
    }

    @Override
    public boolean enterWorld(Zone pre, Zone next) {
        return !pre.map.isNgucTuThuThach() && next.map.isNgucTuThuThach();
    }

    @Override
    public boolean leaveWorld(Zone pre, Zone next) {
        return pre.map.isNgucTuThuThach() && !next.map.isNgucTuThuThach();
    }
}
