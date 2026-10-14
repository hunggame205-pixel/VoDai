package com.vdtt.map;

import com.vdtt.map.zones.NgucTu;
import com.vdtt.map.zones.ZNamec;
import com.vdtt.map.zones.Zone;
import com.vdtt.model.Char;
import com.vdtt.util.Log;
import com.vdtt.util.VDTTUtlis;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Map {
    public short id;
    @Getter
    private List<Zone> zones = new ArrayList<>();
    public MapTemplate mapTemplate;
    public static boolean running = true;
    public Thread threadUpdateChar, threadUpdateOther;
    private ReadWriteLock lock;
    public int maxPlayer = 30;
    public Map(short id) {
        try {
            this.id = id;
            this.mapTemplate = MapManager.getInstance().getMapTemplates().get(id);
            this.mapTemplate.createWayPoint();
            this.mapTemplate.loadData();
            this.mapTemplate.loadData2();
            lock = new ReentrantReadWriteLock();
            initZone();
            update();
        } catch (Exception e) {
            Log.error("Map: " + id, e);
            e.printStackTrace();
        }
    }
    public void initZone() {
        zones.clear();
        for (int i = 0; i < 30; i++) {
            Zone z = null;
            if(id == 2||id == 4|| id == 6||id == 8) {
                z = new NgucTu((byte) i, this.mapTemplate, this);
            } else if (isNamec()) {
                z = new ZNamec((byte) i, this.mapTemplate, this);
                if(i == 2)
                    return;
            } else
            z = new Zone((byte) i, this.mapTemplate, this);
        }
    }
    public void addZone(Zone z) {
        lock.writeLock().lock();
        try {
            zones.add(z);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void removeZone(Zone z) {
        lock.writeLock().lock();
        try {
            zones.remove(z);
        } finally {
            lock.writeLock().unlock();
        }
    }
    public Zone getZoneById(int index) {
        return this.zones.get(index);
    }

    public void joinZone(Char _char, int zoneId,int typeTau) {
        try {
            if (isNamec()) {
                zoneId = 0;
            }
            Zone z = getZoneById(zoneId);
            if (z != null) {
                if(z.getChars().size() < getMaxPlayer(z)) {
                    z.join(_char, typeTau);
                }else {
                    if(isNamec()){
                        _char.joinZone(86, 0,0);
                        _char.serverDialog("Hiện khu vực này đã đầy, hãy thử lại sau");
                        return;
                    }
                    for (int i = 0; i < zones.size(); i++) {
                        Zone z1 = zones.get(i);
                        if(z1.getChars().size() < getMaxPlayer(z1)) {
                            z1.join(_char, typeTau);
                            break;
                        }
                    }
                }
            }else {
                MapManager.getInstance().joinZone(_char, 86, 0,typeTau);
            }
        } catch (Exception e) {
            Log.error(String.format("Char: %s, Map: %s, Cleaned: %b", _char.name, this.id, _char.isCleaned), e);
            e.printStackTrace();
        }
    }
    public int getMaxPlayer(Zone zone) {
        if(zone.findBossInZone()){
            return 80;
        } else if (zone.findBossEventInZone()) {
            return 50;
        } else if (id == 44) {
            return 200;
        } else if (isNamec()) {
            return 80;
        } else {
            return 30;
        }
    }
    public void updateChar() {
        while (running) {
            try {
                long l1 = System.currentTimeMillis();
                lock.readLock().lock();
                try {
                    for (Zone zone : zones) {
                        if (!zone.isClosed()) {
                            zone.updateChar();
                        }
                    }
                } finally {
                    lock.readLock().unlock();
                }
                long l2 = System.currentTimeMillis() - l1;
                if (l2 >= 500L) {
                    continue;
                }
                try {
                    Thread.sleep(500L - l2);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    public void updateOther() {
        while (running) {
            try {
                long l1 = System.currentTimeMillis();
                ArrayList<Zone> list = new ArrayList<>();
                lock.readLock().lock();
                try {
                    for (Zone zone : zones) {
                        if (!zone.isClosed()) {
                            zone.update();
                        } else {
                            list.add(zone);
                        }
                    }
                } finally {
                    lock.readLock().unlock();
                }
                if (list.size() > 0) {
                    lock.writeLock().lock();
                    try {
                        zones.removeAll(list);
                    } finally {
                        lock.writeLock().unlock();
                    }
                }
                long l2 = System.currentTimeMillis() - l1;
                if (l2 >= 1000L) {
                    continue;
                }
                try {
                    Thread.sleep(1000L - l2);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    public void update() {
        this.threadUpdateChar = new Thread(new Runnable() {
            @Override
            public void run() {
                updateChar();
            }

        });
        this.threadUpdateChar.start();
        this.threadUpdateOther = new Thread(new Runnable() {
            @Override
            public void run() {
                updateOther();
            }
        });
        this.threadUpdateOther.start();
    }

    public void close() {
        if (this.threadUpdateChar != null && this.threadUpdateChar.isAlive()) {
            this.threadUpdateChar.interrupt();
        }
        this.threadUpdateChar = null;
        if (this.threadUpdateOther != null && this.threadUpdateOther.isAlive()) {
            this.threadUpdateOther.interrupt();
        }
        this.threadUpdateOther = null;
    }

    public Zone rand() {
        return zones.get(VDTTUtlis.nextInt(zones.size()));
    }

    public boolean isWorld() {
        return isTrainZone()||isHell()||isNgucTu()||isDoanhTrai()||isGDSM()||isVoDai()||isNgucTuThuThach()||isNoel()||isNamec();
    }
    public boolean isTrainZone() {
        return id == 84;
    }

    public boolean isHell() {
        return id == 19;
    }
    public boolean isNgucTu() {
        return id == 2||id == 4|| id == 6||id == 8;
    }
    public boolean isEvent() {
        return id == 44;
    }
    public boolean isNgucTuThuThach() {
        return id == 9;
    }

    public boolean isSaoDen() {
        return id == 39;
    }
    public boolean isVoDai() {
        return id == 50||id == 49;
    }
    public boolean isDoanhTrai() {
        return id >= 106&&id <= 111;
    }
    public boolean isNoel() {
        return id == 93||id == 94||id == 95||id == 96||id == 97;
    }


    public boolean isGDSM() {
        return id == 48||id == 47;
    }
    public boolean isNamec() {
        return id >= 112&&id <= 120;
    }
}
