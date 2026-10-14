package com.vdtt.map.zones;

import com.vdtt.data.DataCenter;
import com.vdtt.event.Event;
import com.vdtt.map.*;
import com.vdtt.map.item.ItemMap;
import com.vdtt.mob.Mob;
import com.vdtt.model.Char;
import com.vdtt.model.WayPoint;
import com.vdtt.network.Message;
import com.vdtt.npc.Npc;
import com.vdtt.server.GlobalService;
import com.vdtt.task.MobInfo;
import com.vdtt.task.TaskFactory;
import com.vdtt.util.Log;
import com.vdtt.util.VDTTUtlis;
import lombok.Builder;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Zone {

    @Getter
    private boolean isClosed;
    private List<Char> players;
    private List<ItemMap> itemMaps;
    @Getter
    public List<Mob> monsters;
    private List<ItemMap> listRemoveItem;
    @Getter
    private List<Npc> npcs;
    public short numberDropItem;
    public int id;
    public byte numberElitez, numberChief;
    public MapTemplate template;
    public Map map;
    public List<Mob> waitingListRecoveries;
    public List<Mob> waitingListDelete;
    public List<Mob> listRecoveries;
    public long lastUpdateEverySecond;
    public long lastUpdateEveryHalfSecond;
    public long lastUpdateEveryFiveSecond;
    public long lastUpdateEveryMinute;
    private ReadWriteLock lockMob;
    private ReadWriteLock lockChar;
    private ReadWriteLock lockItem;
    public boolean isOpened;
    public long timeStart;
    public int timeLength;
    public boolean bZ;
    public boolean isWorld;
    public byte round;
    public List<Integer> khanGia;

    @Getter
    private MapService service;

    //
//    @Getter
//    private MobFactory mobFactory;
    @Builder
    public Zone(int id, MapTemplate tilemap, Map map) {
        this.id = id;
        this.template = tilemap;
        this.map = map;
        players = new ArrayList<>();
        monsters = new ArrayList<>();
        itemMaps = new ArrayList<>();
        npcs = new ArrayList<>();
        listRemoveItem = new ArrayList<>();
        waitingListRecoveries = new ArrayList<>();
        waitingListDelete = new ArrayList<>();
        listRecoveries = new ArrayList<>();
        lockMob = new ReentrantReadWriteLock();
        lockChar = new ReentrantReadWriteLock();
        lockItem = new ReentrantReadWriteLock();
        map.addZone(this);
        init();
        if (map.isVoDai() || map.isGDSM()) {
            khanGia = new ArrayList<>();
        }
    }

    public void addNpc(Npc npc) {
        this.npcs.add(npc);
    }


    public void init() {
        this.service = new MapService(this);
        this.numberChief = 0;
        this.numberElitez = 0;
        createMonster();
        createNpc();

//        if (Event.isEvent()) {
//            Event.getEvent().initMap(this);
//        }
    }

    public void createMonster() {
        try {
            for (Mob mob : map.mapTemplate.mobList) {
                if (mob != null) {
                    Mob mob2 = mob.clone();
                    mob2.idEntity = monsters.size();
                    mob2.zone = this;
                    if (map.id == 19) {
                        mob2.hp = mob2.hpFull = 100000;
                    }
                    if (!map.mapTemplate.isPhoBan()) {
                        MobInfo mobInfo = MobInfo.builder().mapID(map.id).mobID(mob2.id).level(mob2.getTemplate().timeThuHoach).name(mob2.getTemplate().name).build();
                        TaskFactory.getInstance().addMobInfoTaskDay(mobInfo);
                    }
                    monsters.add(mob2);
                }
            }
            if (Event.isSummer() && (map.id == 88 || map.id == 77 || map.id == 81 || map.id == 55 || map.id == 57)) {
                Mob mob = new Mob();
                mob.idEntity = monsters.size();
                mob.id = 77;
                mob.zone = this;
                mob.hp = mob.hpFull = 100000;
                mob.kiNow = mob.kiMax = 5000;
                mob.levelBoss = 6;
                mob.status = 0;
                switch (map.id) {
                    case 57:
                        mob.x = 910;
                        mob.y = 362;
                        break;
                    case 55:
                        mob.x = 1569;
                        mob.y = 429;
                        break;
                    case 88:
                        mob.x = 303;
                        mob.y = 416;
                        break;
                    case 77:
                        mob.x = 260;
                        mob.y = 416;
                        break;
                    case 81:
                        mob.x = 799;
                        mob.y = 415;
                        break;
                }
                monsters.add(mob);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createNpc() {
        try {
            for (Npc npc : map.mapTemplate.npcList) {
                if (npc != null) {
                    Npc npc2 = npc.clone();
                    npc2.idEntity = npcs.size();
                    npcs.add(npc2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public Char findCharById(int id) {
        lockChar.readLock().lock();
        try {
            for (Char c : players) {
                if (c != null && c.id == id) {
                    return c;
                }
            }
        } finally {
            lockChar.readLock().unlock();
        }
        return null;
    }

    public Char findCharName(String name) {
        lockChar.readLock().lock();
        try {
            for (Char c : players) {
                if (c.user != null && c.user.session != null && c.name.equals(name)) {
                    return c;
                }
            }
        } finally {
            lockChar.readLock().unlock();
        }
        return null;
    }

    public void addChar(Char _char) {
        if (players != null) {
            lockChar.writeLock().lock();
            try {
                this.players.add(_char);
            } finally {
                lockChar.writeLock().unlock();
            }
        }
    }

    public List<Char> getChars() {
        ArrayList<Char> chars = new ArrayList<>();
        lockChar.readLock().lock();
        try {
            if (players != null) {
                for (Char c : players) {
                    if (c == null || c.isCleaned) {
                        continue;
                    }
                    chars.add(c);
                }
            }
        } finally {
            lockChar.readLock().unlock();
        }
        return chars;
    }

    public void join(Char p, int typeTau) {
        try {
            Zone preZone = p.zone;
            p.mapId = (short) this.template.id;

            if (preZone != null) {
                if ((preZone.map.isWorld() && !map.isWorld()) || (preZone.isWorld && !isWorld)) {
                    p.removeMemberFromWorld(preZone, this);
                }
                if(preZone.map.isVoDai()||preZone.map.isGDSM()){
                    if(preZone.map.id != this.map.id) {
                        p.outZone();
                    }
                }
                if (preZone.map.isSaoDen()) {
                    p.checkSaoDen();
                }
                preZone.out(p);
                if (preZone.map.id != this.map.id) {
                    int[] xy = null;
                    if (typeTau == -1) {
                        xy = getArrayXYNext(preZone.map.id);
                    } else {
                        xy = getArrayXYRND();
                    }
                    p.updateXY2(xy);
                }
            }
            p.zone = this;
            if (p.pet != null) {
                p.pet.zone = this;
            }
            // thêm player vào khu cho người chơi khác
            p.getService().sendZone(this, typeTau);
            getService().playerAdd(p);
            getService().sendInfoVuTru(p);
            p.getEm().displayAllEffect(null, this.getService(), p);
            addChar(p);
            loadMap(p);// load người trong map
            getService().changePk(p);
            getService().sendPet(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void joinNotChangeMap(Char p, int i) {
        Zone preZone = p.zone;
        p.mapId = (short) i;
        if (preZone != null) {
            preZone.out(p);
        }
        p.zone = this;
        if (p.pet != null) {
            p.pet.zone = this;
        }
        // thêm player vào khu cho người chơi khác
        p.getService().sendZone(this, 0, i);
        getService().playerAdd(p);
        getService().sendInfoVuTru(p);
        p.getEm().displayAllEffect(null, this.getService(), p);
        addChar(p);
        loadMap(p);// load người trong map
        getService().changePk(p);
        getService().khanDai(p.id);
    }


    public void out(Char p) {
        try {
            removeChar(p);
            getService().playerRemove(p.id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadMap(Char _char) {
        List<Char> chars = getChars();
        for (Char _char2 : chars) {
            try {
                if (_char != _char2) {
//                    _char.getService().playerAdd(_char2);
                    _char2.getEm().displayAllEffect(null, getService(), _char2);
                    getService().changePk(_char2);
                    getService().sendInfoVuTru(_char2);
                    getService().sendPet(_char2);
                    if (_char2.mapId == 49 || _char2.mapId == 47) {
                        _char.getService().khanDai(_char2.id);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void removeItem(ItemMap item) {
        if (itemMaps != null) {
            lockItem.writeLock().lock();
            try {
                itemMaps.remove(item);
            } finally {
                lockItem.writeLock().unlock();
            }
        }
    }

    public void removeChar(Char _char) {
        if (players != null) {
            lockChar.writeLock().lock();
            try {
                players.remove(_char);
            } finally {
                lockChar.writeLock().unlock();
            }
        }

    }

    public void removeMonster(Mob mob) {
        if (monsters != null) {
            lockMob.writeLock().lock();
            try {
                monsters.remove(mob);
                getService().removeMonster(mob);
            } finally {
                lockMob.writeLock().unlock();
            }
        }
    }

    public void removeItem() {
        try {
            for (ItemMap item : listRemoveItem) {
                try {
                    removeItem(item);
                    getService().removeItem(item.getId());
                } catch (Exception ex) {
                    Logger.getLogger(Zone.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            listRemoveItem.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeChar(Message m) {
        try {
            List<Char> chars = getChars();
            m.writer().writeByte(chars.size());
            for (int i = 0; i < chars.size(); i++) {
                Char pl = chars.get(i);
                m.writer().writeInt(pl.id);
                pl.writeData(m.writer(), m);
            }
        } catch (Exception e) {

        }
    }

    public void writeMob(Message m) {
        try {
            int size = monsters.size();
            m.writer().writeShort(size);
            for (int i = 0; i < size; i++) {
                Mob mob = monsters.get(i);
                mob.write(m);
            }
        } catch (Exception e) {

        }
    }

    public void writeNpc(Message m) {
        try {
            m.writer().writeShort(npcs.size());
            for (Npc npc : npcs) {
                npc.writeMessage(m);
            }
        } catch (Exception e) {

        }
    }

    public void requestChangeMap(@NotNull Char p) {
        try {
            if (map.mapTemplate.listWayPoint.size() > 0) {
                WayPoint way = null;
                for (WayPoint wayPoint : map.mapTemplate.listWayPoint) {
                    if (way == null || wayPoint.getRange(p) <= way.getRange(p)) {
                        way = wayPoint;
                    }
                }
                if (way == null || way.getRange(p) > 250) {
                    p.joinZone(p.mapId, 0, 1);
                } else {
                    if (way.mapNext == 47 || way.mapNext == 49) {
                        if (way.mapNext == 49) {
                            if (p.deathMatch != null) {
                                p.deathMatch.out(p);
                            }
                            VoDaiSucManh dauTruong = MapManager.getInstance().VDSM;
                            if (dauTruong != null) {
                                dauTruong.removeMember(p);
                            }
                        }
                        if (way.mapNext == 47) {
                            if (p.getGroup() != null) {
                                if (p.matchUp != null) {
                                    p.matchUp.out(p.getGroup());
                                    p.matchUp = null;
                                }
                                GiaiDauSucManh gdsm = MapManager.getInstance().GDSM;
                                if (gdsm != null) {
                                    gdsm.removeMember(p.getGroup());
                                }
                            }
                        }
                        joinNotChangeMap(p, way.mapNext);
                    } else
                        p.changeMap(way.mapNext);
                }
            } else {
                Log.debug("Không thể chuyển map vì không có waypoint");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public int getNumberChar() {
        if (!isClosed) {
            return players.size();
        }
        return 0;
    }

    public Mob findMoLivebByID(int idMob) {
        List<Mob> mobs = monsters;
        for (Mob mob : mobs) {
            if (mob.idEntity == idMob && !mob.isDead) {
                return mob;
            }
        }
        return null;
    }

    public boolean findBossInZone() {
        List<Mob> mobs = monsters;
        for (Mob mob : mobs) {
            if (!mob.isDead && mob.levelBoss == 7 && mob.id == 273) {
                return true;
            }
        }
        return false;
    }

    public boolean findBossEventInZone() {
        List<Mob> mobs = monsters;
        for (Mob mob : mobs) {
            if (!mob.isDead && mob.id == 134) {
                return true;
            }
        }
        return false;
    }

    public boolean checkBossInZone() {
        List<Mob> mobs = monsters;
        for (Mob mob : mobs) {
            if (!mob.isDead && mob.levelBoss == 7) {
                return true;
            }
        }
        return false;
    }

    public List<Mob> getLivingMonsters() {
        ArrayList<Mob> mobs = new ArrayList<>();
        for (Mob mob : monsters) {
            if (!mob.isDead && mob.hp > 0) {
                mobs.add(mob);
            }
        }
        return mobs;
    }

    public void sendAttackMob(int idEntity, int hp, boolean isCrit) {
        try {
            Message message;
            if (idEntity < 127 && hp < Short.MAX_VALUE) {
                message = new Message((byte) 8);
                message.writer().writeByte(idEntity);
                message.writer().writeShort(hp);
            } else {
                message = new Message((byte) 52);
                message.writer().writeShort(idEntity);
                message.writer().writeInt(hp);
            }
            if (isCrit) {
                message.writer().writeBoolean(true);
            } else {
                message.writer().writeBoolean(false);
            }
            getService().sendMessage(message);
            message.cleanup();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public int[] getArrayXYNext(int mapOLD) {
        try {
            if ((mapOLD == 58 || mapOLD == map.id) && map.id == 56) {
                return new int[]{70, 310};
            }
            if (mapOLD == 56 && map.id == 58) {
                return new int[]{180, 50};
            } else {
                if (map.id == 56) {
                    return new int[]{489, 309};
                }
            }
            if (map.id == 19) {
                return new int[]{140, 230};
            }
            if (map.id == 9) {
                return new int[]{151, 293};
            }
            if (map.id == 50) {
                return new int[]{548, 473};
            }

            MapTemplate map = this.map.mapTemplate;

            for (int i = 0; i < map.listWayPoint.size(); i++) {
                if (map.listWayPoint.get(i).mapNext == mapOLD) {
                    return new int[]{(map.listWayPoint.get(i).x < 200 ? 35 : map.maxX - 35), map.V.c(map.listWayPoint.get(i).x < 200 ? 35 : map.maxX - 35, map.listWayPoint.get(i).y).y - 1};
                }
            }
        } catch (Exception e) {
            Log.error("Lỗi getArrayXYNext: " + e);
        }

        return new int[]{0, 0};
    }

    public ItemMap findItemMapById(short id) {
        lockItem.readLock().lock();
        try {
            for (ItemMap item : itemMaps) {
                if (item.getId() == id) {
                    return item;
                }
            }
        } finally {
            lockItem.readLock().unlock();
        }
        return null;
    }

    public void addItemMap(ItemMap item) {
        if (itemMaps != null) {
            lockItem.writeLock().lock();
            try {
                this.itemMaps.add(item);
            } finally {
                lockItem.writeLock().unlock();
            }
        }
    }

    public int[] getArrayXYRND() {
        MapTemplate map = this.map.mapTemplate;
        int x = VDTTUtlis.nextInt(50, map.maxX - 200);
        int y = 0;
        if (map.id == 50) {
            return new int[]{548, 473};
        }
        if (map.id == 106) {
            return new int[]{177, 336};
        }
        if (map.id == 93) {
            return new int[]{39, 315};
        }
        try {
            y = map.V.c(x, VDTTUtlis.nextInt(50, map.maxY - 200)).y;
        } catch (Exception e) {
            y = map.maxY - 200;
        }
        return new int[]{x, y};
    }

    public void setSkillPaint_1(Mob mob, Char _char, short skillId) {
        try {
            int idMob = mob.idEntity;
            Message message = new Message((byte) 61);
            message.writer().writeInt(_char.id);
            message.writer().writeShort(skillId);
            message.writer().writeShort(idMob);
            getService().sendMessage(message);
            message.cleanup();
        } catch (Exception ex) {

        }
    }

    public void addMob(Mob mob) {
        try {
            if (monsters == null) {
                return;
            }
            lockMob.writeLock().lock();
            try {
                monsters.add(mob);
            } finally {
                lockMob.writeLock().unlock();
            }
            getService().addMob(mob);
        } catch (Exception ex) {
            Logger.getLogger(Zone.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getNumberItem() {
        return itemMaps.size();
    }

    public void updateItemMap() {
        try {
            if (this.itemMaps.size() > 0) {
                lockItem.readLock().lock();
                try {
                    for (ItemMap item : itemMaps) {
                        try {
                            if (item.isExpired()) {
                                listRemoveItem.add(item);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } finally {
                    lockItem.readLock().unlock();
                }
                if (listRemoveItem.size() > 0) {
                    removeItem();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateChar() {
        try {
            if (this.players.size() > 0) {
                long now = System.currentTimeMillis();
                boolean isUpdateEverySecond = ((now - this.lastUpdateEverySecond) >= 1000);
                if (isUpdateEverySecond) {
                    this.lastUpdateEverySecond = now;
                }
                boolean isUpdateEveryHalfSecond = ((now - this.lastUpdateEveryHalfSecond) >= 500);
                if (isUpdateEveryHalfSecond) {
                    this.lastUpdateEveryHalfSecond = now;
                }
                boolean isUpdateEveryFiveSecond = ((now - this.lastUpdateEveryFiveSecond) >= 5000);
                if (isUpdateEveryFiveSecond) {
                    this.lastUpdateEveryFiveSecond = now;
                }
                boolean isUpdateEveryMinute = ((now - this.lastUpdateEveryMinute) >= 60000);
                if (isUpdateEveryMinute) {
                    this.lastUpdateEveryMinute = now;
                }
                if (isUpdateEveryHalfSecond || isUpdateEverySecond || isUpdateEveryFiveSecond || isUpdateEveryMinute) {
                    List<Char> mChars = getChars();
                    for (Char _char : mChars) {
                        try {
                            if (_char.isBot) {
                                continue;
                            }
                            if (isUpdateEveryHalfSecond) {
                                _char.updateEveryHalfSecond();
                            }
                            if (isUpdateEverySecond) {
                                _char.updateEverySecond();
                            }
                            if (isUpdateEveryFiveSecond) {
                                _char.updateEveryFiveSecond();
                            }
                            if (isUpdateEveryMinute) {
                                _char.updateEveryMinute();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addMobForRespawnList(Mob mob) {
        synchronized (listRecoveries) {
            listRecoveries.add(mob);
        }
    }

    public void recoveryAllMonsters() {
        lockMob.writeLock().lock();
        try {
            monsters.clear();
        } finally {
            lockMob.writeLock().unlock();
        }
        int id = 0;
        for (Mob mob : map.mapTemplate.mobList) {
            Mob monster = mob.clone();
            monster.idEntity = id++;
            monster.zone = this;
            addMob(monster);
        }
    }

    public void reloadMob() {
        for (Mob mob : monsters) {
            getService().addMob(mob);
        }
    }

    public void recoveryMonster() {
        synchronized (this.listRecoveries) {
            for (Mob mob : this.listRecoveries) {
                if(map.isNamec() && mob.id >= 306 && mob.id <= 312){
                    String text = mob.getTemplate().name + " đã xuất hiện tại " + map.mapTemplate.name + " khu " + this.id;
                    GlobalService.getInstance().chat("Hệ thống", text, (byte) 1);
                }
                getService().recoveryMonster(mob);
                this.waitingListRecoveries.remove(mob);

            }
            this.listRecoveries.clear();
        }
    }

    public void updateRecovery() {
        synchronized (waitingListRecoveries) {
            if (this.waitingListRecoveries.size() > 0) {
                for (Mob mob : this.waitingListRecoveries) {
                    mob.recoveryTimeCount--;
                    if (mob.recoveryTimeCount <= 0) {
                        mob.recovery();
                        addMobForRespawnList(mob);
                    }
                }
                if (listRecoveries.size() > 0) {
                    recoveryMonster();
                }
            }
        }
    }

    public void updateMob() {
        try {
            if (players.size() > 0 && monsters.size() > 0) {
                lockMob.readLock().lock();
                try {
                    for (Mob mob : monsters) {
                        try {
                            if (mob.timeRemove != -1 && mob.timeRemove < System.currentTimeMillis()) {
                                waitingListDelete.add(mob);
                            }
                            mob.update();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } finally {
                    lockMob.readLock().unlock();
                }
                try {
                    if (waitingListDelete.size() > 0) {
                        for (Mob mob : waitingListDelete) {
                            removeMonster(mob);
                        }
                        waitingListDelete.clear();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        if (!isClosed) {
            updateItemMap();
            updateRecovery();
            updateMob();
        }
    }

    public void close() {
        if (!isClosed) {
            this.isClosed = true;
            this.map = null;
            this.players = null;
            this.itemMaps = null;
            this.monsters = null;
            this.listRecoveries = null;
            this.listRemoveItem = null;
            this.waitingListRecoveries = null;
        }
    }

    public void addMobForWatingListRespawn(Mob mob) {
        synchronized (waitingListRecoveries) {
            if (!mob.isCantRespawn) {
                waitingListRecoveries.add(mob);
            }
        }
    }

    public Npc getNpc(int id) {
        for (Npc npc : npcs) {
            if (npc.idEntity == id) {
                return npc;
            }
        }
        return null;
    }

    public List<ItemMap> getItemMaps() {
        List<ItemMap> list = new ArrayList<>();

        lockItem.readLock().lock();
        try {
            for (ItemMap itemMap : itemMaps) {
                list.add(itemMap);
            }
        } finally {
            lockItem.readLock().unlock();
        }
        return list;
    }

    public void writeItemMap(Message m) throws IOException {
        List<ItemMap> itemMaps1 = getItemMaps();
        m.writer().writeShort(itemMaps1.size());
        for (int i = 0; i < itemMaps1.size(); i++) {
            ItemMap itemMap = itemMaps1.get(i);
            itemMap.write(m);
        }

    }

    public Mob createBoss(short id, int hp, short timeThuHoach, short x, short y, int kimax) {
        return new Mob(getMonsters().size(), id, hp, timeThuHoach, x, y, kimax);
    }

    public void mobDead(Mob mob, Char killer) {

    }

    public List<Mob> getMobInZone(byte maxTarget) {
        List<Mob> mobs = new ArrayList<>();
        for (Mob mob : monsters) {
            if (mob.isDead) {
                continue;
            }
            mobs.add(mob);
            if (mobs.size() >= maxTarget) {
                break;
            }
        }
        return mobs;
    }
    public Mob findNearestMob(int playerX, int playerY) {
        List<Mob> mobs = getLivingMonsters();
        if (mobs == null || mobs.isEmpty()) {
            return null;
        }

        Mob nearestMob = null;
        double minDistance = Double.MAX_VALUE;

        for (Mob mob : mobs) {
            // Tính khoảng cách từ nhân vật đến mob
            double distance = Math.sqrt(
                    Math.pow(mob.x - playerX, 2) +
                            Math.pow(mob.y - playerY, 2)
            );

            // Nếu tìm thấy mob gần hơn
            if (distance < minDistance) {
                minDistance = distance;
                nearestMob = mob;
            }
        }

        return nearestMob;
    }

    public double distance(Char p1, Char p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    public List<Char> getPlayerByPlayer(Char p, int count) {
        List<Char> players = getChars();
        Collections.sort(players, new Comparator<Char>() {
            @Override
            public int compare(Char p1, Char p2) {
                return Double.compare(distance(p, p1), distance(p, p2));
            }
        });
        List<Char> chars = players.subList(0, Math.min(count, players.size()));
        return chars;
    }

    public Npc getNpcById(int i) {
        for (Npc npc : npcs) {
            if (npc.id == i) {
                return npc;
            }
        }
        return null;
    }
}
