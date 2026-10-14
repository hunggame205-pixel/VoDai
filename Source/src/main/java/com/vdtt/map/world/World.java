package com.vdtt.map.world;

import com.vdtt.map.zones.Zone;
import com.vdtt.model.Char;
import com.vdtt.util.Log;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.Collectors;

public abstract class World {

    public static final byte ARENA = 0;
    public static final byte CANDY_BATTLEFIELD = 1;
    public static final byte DUNGEON = 2;
    public static final byte TERRITORY = 3;
    public static final byte SEVEN_BEASTS = 4;
    public static final byte TIME_ZOOM = 5;
    public static final byte SUMMER_EVENT = 6;
    public static final byte SAO_DEN = 7;
    public static final byte SPACE_TOURNAMENT = 8;
    public static final byte NGUC_TU_THU_THACH = 9;
    public static final byte NOEL = 10;

    public static int number = 0;
    public static byte DoanhTrai =9;

    @Getter
    protected int id;
    @Getter
    @Setter
    protected byte type;
    @Getter
    protected int countDown;
    @Getter
    protected boolean isClosed;
    protected boolean initFinished;
    protected ReadWriteLock lock;
    protected ArrayList<Char> members;
    public ArrayList<Zone> zones;
    @Getter
    protected WorldService service;
    @Getter
    protected String name;

    public World() {
        this.name = "World";
        this.members = new ArrayList<>();
        this.zones = new ArrayList<>();
        this.lock = new ReentrantReadWriteLock();
        this.service = new WorldService(this);
        WorldManager.getInstance().addWorld(this);
    }

    public void generateId() {
        this.id = number++;
    }

    public List<Char> getMembers() {
        lock.readLock().lock();
        try {
            return members.stream().distinct().collect(Collectors.toList());
        } finally {
            lock.readLock().unlock();
        }
    }

    public void addMember(Char _char) {
            lock.writeLock().lock();
            try {
                this.members.add(_char);
                Log.debug(String.format("add %s playername: %s", toString(), _char.name));
            } finally {
                lock.writeLock().unlock();
            }
    }

    public void removeMember(Char _char) {
        lock.writeLock().lock();
        try {
            this.members.remove(_char);
            Log.debug(String.format("remove %s playername: %s", toString(), _char.name));
        } finally {
            lock.writeLock().unlock();
        }
    }

    public abstract boolean enterWorld(Zone pre, Zone next);

    public abstract boolean leaveWorld(Zone pre, Zone next);

    public void clearAllMember() {
        lock.writeLock().lock();
        try {
            this.members.clear();
        } finally {
            lock.writeLock().unlock();
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

    public void update() {
        if (countDown > 0) {
            countDown--;
            if (countDown <= 0) {
                close();
                return;
            }
        }
    }

    public void close() {
        this.isClosed = true;
        clearAllMember();
        this.members = null;
        zones.forEach(z -> z.close());
        this.zones = null;
    }

    public Zone find(int id) {
        for (Zone zone : this.zones) {
            if (zone.map.id == id) {
                return zone;
            }
        }
        return null;
    }

    public void setCountdown(int countDown) {
        this.countDown = countDown;
        service.sendTimeInMap(countDown);
    }

    @Override
    public String toString() {
        return String.format("%s[%d]", this.name, this.id);
    }
}

