package com.vdtt.mob;

import com.vdtt.data.DataCenter;
import com.vdtt.effect.Effect;
import com.vdtt.event.Event;
import com.vdtt.event.SumMer;
import com.vdtt.event.TrungThu;
import com.vdtt.item.Item;
import com.vdtt.map.item.ItemMap;
import com.vdtt.map.item.ItemMapFactory;
import com.vdtt.map.zones.Zone;
import com.vdtt.model.Char;
import com.vdtt.model.Entity;
import com.vdtt.model.RandomItem;
import com.vdtt.network.Message;
import com.vdtt.server.GlobalService;
import com.vdtt.server.RuntimeServer;
import com.vdtt.server.SpawnBossManager;
import com.vdtt.task.TaskOrder;
import com.vdtt.util.Log;
import com.vdtt.util.VDTTUtlis;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Mob extends Entity implements Cloneable {
    public static final byte ITEM = 1;
    public static final byte ITEM_TASK = 2;
    public static final byte BOSS = 4;
    public static final byte EQUIP = 5;
    public static final byte XU = 0;
    public static final byte EVENT = 6;

    public int id;
    public int idEntity;
    public boolean isPaint;
    public int level;
    public int hpGoc;
    public int hpFull;
    public int levelBoss;
    public byte status;
    public long timeReSpawn;
    public int kiNow = 0;
    public Mob mob2;
    public int x;
    public int y;
    public boolean isDead;
    public int recoveryTimeCount;
    public Zone zone;
    public Vector<Integer> chars = new Vector<>();
    public boolean isCantRespawn;
    public Lock lock = new ReentrantLock();
    public int hp;
    public long lastTimeAttack;
    public int attackDelay = 20000;
    public boolean isEvent;
    public int dameMin = 1;
    public int dameMax = 1;
    public int kiMax;
    public String nameCall = "";
    public long timeRemove = -1;
    public ConcurrentHashMap<Short, Effect> effects = new ConcurrentHashMap<>();

    public Mob() {
    }

    public Mob(int idEntity, int id, int hp, int level, int x, int y, int kiMax) {
        this.idEntity = idEntity;
        this.id = id;
        this.hp = hp;
        this.hpFull = hp;
        this.level = level;
        this.x = x;
        this.y = y;
        this.hpGoc = hp;
        this.levelBoss = 7;
        this.status = 0;
        this.kiMax = kiNow = kiMax;
        dameMax = kiMax / 25;
        if (id == 273) {
            dameMax = 500;
        }
        attackDelay= 5000;
        dameMin = dameMax * 90 / 100;

    }

    public void readJson(JSONObject json) {
        try {
            this.id = json.getInt("id");
            this.isPaint = json.getBoolean("isPaint");
            this.level = json.getInt("level");
            this.hpFull = json.getInt("hpGoc");
            this.hp = json.getInt("hpFull");
            this.levelBoss = json.getInt("typeMob");
            this.x = (short) json.getInt("x");
            this.y = (short) json.getInt("y");
            this.status = 2;
            loadKiNow();
        } catch (JSONException ex) {
            ex.printStackTrace();
        }
    }

    public void mobReload() {
        kiNow = DataCenter.gI().mobTemplate[this.id].timeThuHoach * 15;
        if (kiMax > 0) {
            kiNow = kiMax;
        }
    }

    public void loadKiNow() {
        kiNow = DataCenter.gI().mobTemplate[this.id].timeThuHoach * 15;
        dameMax = DataCenter.gI().mobTemplate[this.id].timeThuHoach * 5;
        dameMin = dameMax * 90 / 100;
    }

    public Mob clone() {
        try {
            return (Mob) super.clone();
        } catch (Exception var2) {
            return null;
        }
    }

    public void write(Message m) {
        try {
            m.writer().writeShort(this.idEntity);
            m.writer().writeBoolean(isPaint);
            m.writeUTF(nameCall);
            m.writer().writeShort(id);
            m.writer().writeShort(x);
            m.writer().writeShort(y);

            m.writer().writeShort(level);
            m.writer().writeByte(0);
            m.writer().writeByte(getStatus());
            m.writer().writeInt(hp);
//            if(levelBoss == 1||levelBoss == 2||levelBoss == 10){
//                m.writer().writeInt(hp);
//            }else
            m.writer().writeInt(hpFull);
            m.writer().writeByte(levelBoss);
            m.writer().writeByte(0);
        } catch (IOException e) {

        }
    }

    public MobTemplate getTemplate() {
        return DataCenter.gI().mobTemplate[this.id];
    }

    private void attack() {
        Vector<Char> list = new Vector<Char>();
        Vector<Char> chars = getChars();
        for (Char _char : chars) {
            if (_char.isCleaned) {
                continue;
            }
            if (_char.isDead) {
                continue;
            }
            if (Math.abs(this.x - _char.x) > 150 || Math.abs(this.y - _char.y) > 150) {
                continue;
            }
            list.add(_char);
        }
        if (list.isEmpty()) {
            return;
        }
        int rand = VDTTUtlis.nextInt(list.size());
        Char pl = list.get(rand);
        attack(pl, null);
    }

    public void attack(Char pl, Char owner) {
        if (pl != null && !pl.isDead) {
            pl.lock.lock();
            try {
                int dameHp = VDTTUtlis.nextInt(dameMin, dameMax);
                int level = this.level;
                if (zone.map.isHell()) {
                    dameHp *= 2;
                }
                // level = this.level > 0 ? this.level : 1;
                int exactly = VDTTUtlis.nextInt((level * 100) + 100);
                if(pl.miss> 2) {
                    int miss = VDTTUtlis.nextInt(pl.miss);
                    boolean isMiss = exactly < miss;
                    if (isMiss && !zone.map.isHell()) {
                        dameHp = -1;
                    } else {
                        if (dameHp <= 0) {
                            dameHp = 1;
                        }
                    }
                }
                if(levelBoss > 1){
                    if(VDTTUtlis.nextInt(0,100)<20){
                        Effect eff = new Effect(11, 3000, 0);
                        pl.getEm().setEffect(eff);
                    }
                    if(VDTTUtlis.nextInt(0,100)<20){
                        Effect eff = new Effect(8, 3000, 0);
                        pl.getEm().setEffect(eff);
                    }
                    if(VDTTUtlis.nextInt(0,100)<20){
                        Effect eff = new Effect(12, 3000, 0);
                        pl.getEm().setEffect(eff);
                    }
                }
                if(id == 290){
                    if(VDTTUtlis.nextInt(0,100)<20){
                        Effect eff = new Effect(109, 5000, 0);
                        pl.getEm().setEffect(eff);
                    }
                }
                if(id == 296){
                    if(VDTTUtlis.nextInt(0,100)<20){
                        Effect eff = new Effect(76, 3000, 0);
                        pl.getEm().setEffect(eff);
                    }
                }
                if (pl.getEm().findByID(113) != null) {
                    dameHp = 0;
                }
                attack(pl);
                dameHp -= pl.reduceDame;
                if (dameHp > 0) {
                    pl.hp-=dameHp;
                    if (pl.hp <= 0) {
                        pl.startDie();
                    }
                    zone.getService().npcAttackPlayer(this, pl,pl.mp,pl.hp, false);
                }
            } finally {
                pl.lock.unlock();
            }
        }
    }

    public void attack(Char p) {
        try {
            zone.getService().npcAttackPlayer(this, p);
        } catch (Exception e) {
            Log.error("mob attack er", e);
        }
    }

    public boolean checkExist(int charId) {
        for (int id : chars) {
            if (id == charId) {
                return true;
            }
        }
        return false;
    }

    public Vector<Char> getChars() {
        Vector<Char> chars = new Vector<>();
        Vector<Integer> clone = (Vector<Integer>) this.chars.clone();
        for (int id : clone) {
            Char _char = zone.findCharById(id);
            if (_char != null) {
                chars.addElement(_char);
            }
        }
        return chars;
    }
    public boolean bossEvent(){
        if(id == 77&&(zone.map.id ==55||zone.map.id ==57||zone.map.id ==88||zone.map.id ==77||zone.map.id ==81)&&Event.getEvent()!= null&&Event.getEvent().isSummer()){
            return true;
        }
        return false;
    }
    public void die() {
        this.hp = 0;
        this.status = 4;
        this.recoveryTimeCount = 12;
        this.isDead = true;
        if(bossEvent()){
            recoveryTimeCount=1;
            RuntimeServer.gI().countKillCell++;
            if(RuntimeServer.gI().countKillCell% 200 == 0)
                SpawnBossManager.getInstance().spawnAll(SpawnBossManager.EVENT);
        }
        this.chars.clear();
        this.zone.getService().updateMobDie(this);
    }

    public int getStatus() {
        return !isPaint && hp > 0 ? 0 : 4;
    }


    public void dead(Char killer, boolean isDeTu) {
        try {
            if(kiNow < 0){
                kiNow = 0;
            }
 if (isDeTu) {
    if (killer != null && killer.pet != null) {
        // cộng cho ĐỆ
        killer.pet.addEXP((long) kiNow);

        // cộng cho CHỦ (ké)
        killer.addEXP((long) kiNow / 2);
    }
    return;
}
 

 else if (killer != null) {
                int kiAdd = kiNow * 2 + kiNow * (killer.increaseKI / 10) / 100;
                byte isAddKi = (byte) Math.abs(getTemplate().timeThuHoach - killer.level());
                if (isAddKi > 8 && !zone.map.isWorld() && levelBoss != 7&&!zone.isWorld&&!killer.bossEvent(this)&&id!= 296&&!zone.map.isSaoDen() && id != 134) {
                    killer.getService().notifyNoUpKi();
                } else {
                    killer.addEXP(kiAdd);
                    if (killer.pet != null) {
                        killer.pet.addEXP(kiAdd);
                    }
                    if (killer.getGroup() != null) {
                        long expGroup = kiAdd / 5;
                        List<Char> chars = killer.getGroup().getCharsInZone(zone.map.id, zone.id);
                        for (Char _char : chars) {
                            if (_char != null && !_char.isCleaned && _char != killer && !_char.isDead) {
                                _char.addEXP(expGroup);
                            }
                        }
                    }
                }
                if (isAddKi <= 8&&!zone.map.isNoel()) {
                    int[] percents = {4, 6, 2, 88};
                    byte[] types = {Mob.XU, Mob.ITEM, Mob.EQUIP, -1};
                    int index = VDTTUtlis.randomWithRate(percents, 100);
                    byte type = types[index];
                    if (type == -1) {
                        // khai nhan phu thien nhan phu

                    }
                    if (type != -1 && type != Mob.XU && !zone.map.isTrainZone()) {
                        dropItem(killer, type);
                    } else if (type == Mob.XU) {
                        killer.addCoin(VDTTUtlis.nextInt(10000), true);
                    }
                    if (Event.isEvent()) {
                        int distance = 7;
                        int percentage = 10; // ti le item event
                        if (isAddKi <= distance) {
                            int r = VDTTUtlis.nextInt(100);
                            if (r < percentage) {
                                dropItem(killer, EVENT);
                            }
                        }
                    }
                    if (this.levelBoss == 1) {
//                        if(Event.isNoel()){
//                            if (killer.getSlotNull() > 0) {
//                                Item it = new Item(930);
//                                it.setLock(false);
//                                it.setQuantity(1);
//                                killer.addItemToBag(it);
//                                killer.getService().addItem(it);
//                            }
//                        }
                        killer.addCoin(VDTTUtlis.nextInt(10000), true);
                        killer.totalTA++;
                        killer.updateSucManhCDV(5);
                        if(killer.archievement.tinhAnhArchivement< 100)
                            killer.archievement.tinhAnhArchivement++;
                        if(killer.archievement.tinhAnh2Archivement< 1000)
                            killer.archievement.tinhAnh2Archivement++;
                        Item item = new Item(RandomItem.ITEM_THU_LINH.next());
                        item.setQuantity(1);
                        item.isLock = false;
                        ItemMap itemMap = ItemMapFactory.getInstance()
                                .builder()
                                .id(zone.numberDropItem++)
                                .x((short) (x + VDTTUtlis.nextInt(-30, 50)))
                                .y((short) (y))
                                .build();
                        itemMap.setOwnerID(killer.id);
                        if (item != null) {
                            itemMap.setItem(item);
                            zone.addItemMap(itemMap);
                            zone.getService().addItemMap(itemMap, killer);
                        }
                    } else if (this.levelBoss == 2) {
//                        if(Event.isNoel()){
//                            if (killer.getSlotNull() > 0) {
//                                Item it = new Item(930);
//                                it.setLock(false);
//                                it.setQuantity(2);
//                                killer.addItemToBag(it);
//                                killer.getService().addItem(it);
//                            }
//                        }
                        killer.updateSucManhCDV(15);
                        for (int i = 0; i < 4; i++) {
                            Item item = new Item(RandomItem.ITEM_THU_LINH.next());
                            item.setQuantity(1);
                            item.isLock = false;
                            ItemMap itemMap = ItemMapFactory.getInstance()
                                    .builder()
                                    .id(zone.numberDropItem++)
                                    .x((short) (x + VDTTUtlis.nextInt(-30, 50)))
                                    .y((short) (y))
                                    .build();
                            itemMap.setOwnerID(killer.id);
                            if (item != null) {
                                itemMap.setItem(item);
                                zone.addItemMap(itemMap);
                                zone.getService().addItemMap(itemMap, killer);
                            }
                        }
                        killer.addCoin(VDTTUtlis.nextInt(10000), true);
                        killer.totalTL++;
                        if(killer.archievement.thuLinhArchivement< 50)
                            killer.archievement.thuLinhArchivement++;
                        if(killer.archievement.thuLinh2Archivement< 500)
                            killer.archievement.thuLinh2Archivement++;
                    } else if (this.levelBoss == 10) {
                        killer.totalSQ++;
                        killer.updateSucManhCDV(10);
                        if(killer.archievement.sieuQuaiArchivement< 50)
                            killer.archievement.sieuQuaiArchivement++;
                        if(killer.archievement.sieuQuai2Archivement< 500)
                            killer.archievement.sieuQuai2Archivement++;
                        Item item = new Item(RandomItem.ITEM_THU_LINH.next());
                        item.setQuantity(1);
                        item.isLock = false;
                        ItemMap itemMap = ItemMapFactory.getInstance()
                                .builder()
                                .id(zone.numberDropItem++)
                                .x((short) (x + VDTTUtlis.nextInt(-30, 50)))
                                .y((short) (y))
                                .build();
                        itemMap.setOwnerID(killer.id);
                        if (item != null) {
                            itemMap.setItem(item);
                            zone.addItemMap(itemMap);
                            zone.getService().addItemMap(itemMap, killer);
                        }
                    }
                }
                if (killer.taskOrders != null && !killer.taskOrders.isComplete()) {
                    TaskOrder task = killer.taskOrders;
                    if (task.killId == id) {
                        if (task.taskId == TaskOrder.TASK_NORMAL) {
                            task.updateTask(1);
                        }
                        if (task.taskId == TaskOrder.TASK_TA_TL) {
                            if (this.levelBoss == 1||this.levelBoss == 2||this.levelBoss == 10) {
                                task.updateTask(1);
                            }
                        }
                    }

                }
                if(killer.bossEvent(this)){
                    int index = killer.getIndexItemByIdInBag(990);
                    if(index > -1){
                        killer.removeItem(index,1,true);
                    }
                    killer.addEXP(VDTTUtlis.nextInt(80000,120000));
                    killer.addCoin(VDTTUtlis.nextInt(80000,120000), true);
                    killer.getEventPoint().addPoint(SumMer.TOP_KILL_CELL,1);
                    Item it = new Item(RandomItem.CELL_CON.next());
                    it.initExpire();
                    it.setQuantity(1);
                    it.isLock = false;
                    if (it.id == 297 || it.id == 296 || it.id == 295 || it.id == 891 || it.id == 374 || it.id == 555 || it.id == 298 || it.id == 431 || it.id == 519 || it.id == 284|| it.id == 309 || it.id == 848 || it.id == 972|| it.id == 989 || it.id == 8 || it.id == 9|| it.id == 435 || it.id == 437 ) {
                        GlobalService.getInstance().chat("Hệ thống","Người chơi c#item"+
                                killer.name + "c#white Hạ Cell nhận được " + it.template.name, (byte) 1);
                    }
                    ItemMap itemMap = ItemMapFactory.getInstance()
                            .builder()
                            .id(zone.numberDropItem++)
                            .x((short) (x + VDTTUtlis.nextInt(-30, 50)))
                            .y((short) (y))
                            .build();
                    itemMap.setOwnerID(killer.id);
                    if (it != null) {
                        itemMap.setItem(it);
                        zone.addItemMap(itemMap);
                        zone.getService().addItemMap(itemMap, killer);
                    }
                }
                if (levelBoss == 7 && id != 273&&id!= 296&&id!= 134&&!zone.map.isDoanhTrai()&&!zone.map.isNgucTuThuThach()&&zone.map.id != 83) {
                    GlobalService.getInstance().chat("Hệ thống", "Boss " + getTemplate().name + " đã bị chiến binh c#item" + killer.name + "c#white tiêu diệt tại " + zone.template.name + " khu " + zone.id, (byte) 1);
                    for (int i = 0; i < 45; i++) {
                        dropItem(killer, Mob.BOSS);
                    }
                    if(killer.archievement.killBossArchivement< 10)
                        killer.archievement.killBossArchivement++;
                    if(killer.archievement.killBoss2Archivement< 100)
                        killer.archievement.killBoss2Archivement++;
                    killer.pointKame += 2;
                    killer.pointSuper += 2;
                    killer.addClanPoint(2);
                    killer.getService().serverMessage("Bạn đã nhận được 2 điểm Kame");
                    killer.getService().serverMessage("Bạn đã nhận được 2 điểm Super");
                    killer.addBallz(VDTTUtlis.nextInt(20000), true);
                    if (killer.getGroup() != null) {
                        List<Char> chars = killer.getGroup().getCharsInZone(zone.map.id, zone.id);
                        for (Char _char : chars) {
                            if (_char != null && !_char.isCleaned && _char != killer && !_char.isDead) {
                                _char.pointKame += 2;
                                _char.getService().serverMessage("Bạn đã nhận được 2 điểm Kame");
                                _char.pointSuper += 2;
                                _char.getService().serverMessage("Bạn đã nhận được 2 điểm Super");
                            }
                        }
                    }
                    if (id == 199 && killer.getEm().findByID(162) != null) {
                        Effect effect = killer.getEm().findByID(162);
                        effect.param = 8;
                        killer.zone.getService().playerAddEffect(killer, effect);
                    }
                    if(Event.isNoel()){
                        if (killer.getSlotNull() > 0) {
                            Item it = new Item(930);
                            it.setLock(false);
                            it.setQuantity(10);
                            killer.addItemToBag(it);
                            killer.getService().addItem(it);
                        }
                    }
                }
                if(id >= 308 && id <= 312&&Event.isNoel() && zone.map.id == 83){
                    GlobalService.getInstance().chat("Hệ thống", "Boss " + getTemplate().name + " đã bị chiến binh c#item" + killer.name + "c#white tiêu diệt tại "+zone.template.name, (byte) 1);
                    for (int i = 0; i < 100; i++) {
                        Item it = new Item(RandomItem.BOSS_TDST.next());
                        it.setQuantity(1);
                        ItemMap itemMap = ItemMapFactory.getInstance()
                                .builder()
                                .id(zone.numberDropItem++)
                                .x((short) (x + VDTTUtlis.nextInt(-30, 50)))
                                .y((short) (y))
                                .build();
                        itemMap.setOwnerID(killer.id);
                        if (it != null) {
                            itemMap.setItem(it);
                            zone.addItemMap(itemMap);
                            zone.getService().addItemMap(itemMap, killer);
                        }
                    }
                }
                if(id == 134&&Event.isTrungThu()){
                    killer.getEventPoint().addPoint(TrungThu.TOP_KILL_BOSS, 1);
                    killer.addPointKillBoss(1);
                    GlobalService.getInstance().chat("Hệ thống", "Boss " + getTemplate().name + " đã bị chiến binh c#item" + killer.name + "c#white tiêu diệt tại "+zone.template.name, (byte) 1);
                    for (int i = 0; i < 100; i++) {
                        Item it = new Item(RandomItem.THO_DAI_CA.next());
                        it.setQuantity(1);
                        ItemMap itemMap = ItemMapFactory.getInstance()
                                .builder()
                                .id(zone.numberDropItem++)
                                .x((short) (x + VDTTUtlis.nextInt(-30, 50)))
                                .y((short) (y))
                                .build();
                        itemMap.setOwnerID(killer.id);
                        if (it != null) {
                            itemMap.setItem(it);
                            zone.addItemMap(itemMap);
                            zone.getService().addItemMap(itemMap, killer);
                        }
                    }
                }
                if (id == 273) {
                    GlobalService.getInstance().chat("Hệ thống", "Boss " + getTemplate().name + " đã bị chiến binh " + killer.name + " tiêu diệt", (byte) 1);
                    Item detu = new Item(891);
                    detu.setQuantity(1);
                    detu.expire = -1;
                    detu.isLock = true;
                    ItemMap itemMap = ItemMapFactory.getInstance()
                            .builder()
                            .id(zone.numberDropItem++)
                            .x((short) (x + VDTTUtlis.nextInt(-30, 50)))
                            .y((short) (y))
                            .build();
                    itemMap.setOwnerID(killer.id);
                    if (detu != null) {
                        itemMap.setItem(detu);
                        zone.addItemMap(itemMap);
                        zone.getService().addItemMap(itemMap, killer);
                    }
                }
                if(id == 296&&Event.isSummer()&&!zone.map.isDoanhTrai()){
                    GlobalService.getInstance().chat("Hệ thống", "Boss " + getTemplate().name + " đã bị chiến binh c#item" + killer.name + "c#white tiêu diệt", (byte) 1);
                    killer.addClanPoint(50);
                    for (int i = 0; i < 50; i++) {
                        Item it = new Item(RandomItem.CELL_MAX.next());
                        it.setQuantity(1);
                        ItemMap itemMap = ItemMapFactory.getInstance()
                                .builder()
                                .id(zone.numberDropItem++)
                                .x((short) (x + VDTTUtlis.nextInt(-30, 50)))
                                .y((short) (y))
                                .build();
                        itemMap.setOwnerID(killer.id);
                        if (it != null) {
                            itemMap.setItem(it);
                            zone.addItemMap(itemMap);
                            zone.getService().addItemMap(itemMap, killer);
                        }
                    }
                }
                if (killer.taskMain != null) {
                    killer.updateTaskKillMonster(this);
                    dropItem(killer, (byte) 2);
                }
                try {
                    if (killer.getGroup() != null) {
                        List<Char> chars = killer.getGroup().getCharsInZone(zone.map.id, zone.id);
                        for (Char _char : chars) {
                            if (_char != null && !_char.isCleaned && _char != killer) {
                                if (_char.taskMain != null) {
                                    _char.updateTaskKillMonster(this);
                                }
                                if (_char.taskOrders != null && !_char.taskOrders.isComplete()) {
                                    TaskOrder task = _char.taskOrders;
                                    if (task.killId == id) {
                                        if (task.taskId == TaskOrder.TASK_NORMAL) {
                                            task.updateTask(1);
                                        }
                                        if (task.taskId == TaskOrder.TASK_TA_TL) {
                                            if (this.levelBoss == 1||this.levelBoss == 2||this.levelBoss == 10) {
                                                task.updateTask(1);
                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                } catch (Exception e) {

                }
                if (zone != null) {
                    zone.mobDead(this, killer);
                }
            }
            if (levelBoss != 7 && !zone.map.isHell()&&!zone.isWorld&&!zone.map.isEvent()&&!zone.map.isSaoDen()&&!zone.map.isDoanhTrai()&&!zone.map.isNoel()) {
                zone.addMobForWatingListRespawn(this);
            }
        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }

    public void dropItem(Char owner, byte type) {
        try {
            if (zone.getNumberItem() > 100) {
                return;
            }
            Item itm = null;
            int itemId = 0;
            if (type == 2) {
                itemId = owner.getIdItemTask(id);
                if (itemId == -1) {
                    return;
                }
            } else if (type == EQUIP) {
                itemId = RandomItem.ITEM_EQUIP.next();
            } else if (type == ITEM) {
                itemId = RandomItem.SAO_PHA_LE.next();
            } else if (type == EVENT) {
                itemId = Event.getEvent().randomItemID();
                if (itemId == -1) {
                    return;
                }
            } else if (type == BOSS) {
                itemId = RandomItem.BOSS.next();
            }
            Item item = new Item(itemId);
            if (type == EQUIP) {
                int percents = VDTTUtlis.nextInt(1, 7);
                item.createOptionRandom(VDTTUtlis.nextInt(1, 4), percents);
            }
            item.setQuantity(1);
            item.expire = -1;
            item.isLock = false;
            ItemMap itemMap = ItemMapFactory.getInstance()
                    .builder()
                    .id(zone.numberDropItem++)
                    .x((short) (x + VDTTUtlis.nextInt(-30, 50)))
                    .y((short) (y))
                    .build();
            itemMap.setOwnerID(owner.id);
            if (item != null) {
                itemMap.setItem(item);
                zone.addItemMap(itemMap);
                zone.getService().addItemMap(itemMap, owner);

            }
        } catch (Exception e) {
            Log.error("dropItem", e);
        }
    }

    public void update() {
        if (!this.isDead && id != 154 && id != 221 && id != 213 && this.hp > 0&&!isEvent) {
            List<Char> list = zone.getChars();
            if (list.size() > 0) {
                int add = getTemplate().speedMove;
                if (levelBoss == 10) {
                    add += 100;
                }
                for (Char _char : list) {
                    if (_char.isDead) {
                        continue;
                    }
                    if (Math.abs(this.x - _char.x) < 100 + add && Math.abs(this.y - _char.y) < 100 + add && !chars.contains(_char.id)) {
                        addCharId(_char.id);
                    }
                }
            }
            if (chars.size() > 0) {
                long now = System.currentTimeMillis();
                if (now - this.lastTimeAttack > this.attackDelay) {
                    this.lastTimeAttack = now;
                    attack();
                }
            }
        }
        Vector<Short> removeEffect = new Vector<>();
        boolean isDoc = false;
        for (Map.Entry<Short, Effect> entry : this.effects.entrySet()) {
            Effect eff = entry.getValue();
            if (eff == null || eff.isExpired()) {
                removeEffect.add(entry.getKey());
            }else {
                if (entry.getKey() == 9) {
                    isDoc = true;
                }
            }
        }
        if(isDoc&&!isDead){
            int num = hpFull/100;
            num = num > 200000?200000:num;
            if(hp - num > 0){
                hp -= num;
                zone.getService().updateHPMob(idEntity, hp,hpFull, (byte) levelBoss);
            }
        }
        for (short b : removeEffect) {
            this.effects.remove(b);
            zone.getService().removeEffectMob(idEntity, b);
        }
    }

    public boolean isEffect(short id) {
        return this.effects.containsKey(id);
    }

    public void recovery() {
//        this.itemMap = null;
        this.isDead = false;
        status = 0;
        mobReload();
        setHP();
        this.effects.clear();
    }

    private void setHP() {
        int levelOld = levelBoss;
        int rand = VDTTUtlis.nextInt(20000); // Random number between 1 and 100
        if (rand <= 2) { // 5% chance (1% + 5% = 6%)
            levelBoss = 2;
        } else if (rand <= 8) {
            levelBoss = 10;
        } else if (rand <= 20) { // 10% chance (6% + 10% = 16%)
            levelBoss = 1;
        } else {
            levelBoss = 0;
        }
        if(levelOld == 7&&zone.map.isNamec())
            levelBoss = 7;
        if (this.levelBoss == 1) {
            this.hp = this.hpFull * 40;
            this.kiNow *= 20;
        } else if (this.levelBoss == 10) {
            this.hp = this.hpFull * 100;
            this.kiNow *= 20;
        } else if (this.levelBoss == 2) {
            this.hp = this.hpFull * 200;
            this.kiNow *= 100;
        } else {
            this.hp = this.hpFull;
        }
    }

    public void addHp(int add) {
        this.hp += add;
    }


    public void addCharId(int charId) {
        if (!chars.contains(charId)) {
            chars.add(charId);
        }
    }
    public int getSaoDenByMob(){
        if(id == 108){
            return 7;
        }
        if(id == 109){
            return 6;
        }
        if(id == 110){
            return 5;
        }
        if(id == 111){
            return 4;
        }
        if(id == 112){
            return 3;
        }
        if(id == 113){
            return 2;
        }
        if(id == 114){
            return 1;
        }
        return 0;
    }
    public static int getMobBySaoDen(int id){
        if(id == 7){
            return 108;
        }
        if(id == 6){
            return 109;
        }
        if(id == 5){
            return 110;
        }
        if(id == 4){
            return 111;
        }
        if(id == 3){
            return 112;
        }
        if(id == 2){
            return 113;
        }
        if(id == 1){
            return 114;
        }
        return 0;
    }

    public org.json.simple.JSONObject toJSON() {
        org.json.simple.JSONObject json = new org.json.simple.JSONObject();
        json.put("id", id);
        json.put("levelBoss", levelBoss);
        json.put("status", status);
        json.put("x", x);
        json.put("y", y);
        json.put("paintMiniMap", isPaint);
        json.put("hpFull", hpFull);
        json.put("level", level);
        return json;
    }
}
