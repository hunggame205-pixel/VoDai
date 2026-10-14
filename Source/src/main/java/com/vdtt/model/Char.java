package com.vdtt.model;

import com.google.gson.Gson;
import com.vdtt.ability.AbilityFromEquip;
import com.vdtt.admin.AdminService;
import com.vdtt.clan.Clan;
import com.vdtt.clan.ClanDAO;
import com.vdtt.clan.Member;
import com.vdtt.data.*;
import com.vdtt.db.DbManager;
import com.vdtt.effect.Effect;
import com.vdtt.effect.EffectManager;
import com.vdtt.effect.EffectTemplateManager;
import com.vdtt.event.Event;
import com.vdtt.event.eventpoint.EventPoint;
import com.vdtt.item.*;
import com.vdtt.mail.Mail;
import com.vdtt.mail.MailManager;
import com.vdtt.map.*;
import com.vdtt.map.Map;
import com.vdtt.map.item.ItemMap;
import com.vdtt.map.world.*;
import com.vdtt.mob.Mob;
import com.vdtt.network.Message;
import com.vdtt.network.Service;
import com.vdtt.npc.Npc;
import com.vdtt.party.Group;
import com.vdtt.party.MemberGroup;
import com.vdtt.reward.DailyReward;
import com.vdtt.reward.RewardManager;
import com.vdtt.server.*;
import com.vdtt.skill.Skill;
import com.vdtt.skill.SkillClan;
import com.vdtt.skill.SkillFactory;
import com.vdtt.stall.Stall;
import com.vdtt.stall.StallManager;
import com.vdtt.store.ItemStore;
import com.vdtt.store.Store;
import com.vdtt.store.StoreManager;
import com.vdtt.task.Task;
import com.vdtt.task.TaskFactory;
import com.vdtt.task.TaskOrder;
import com.vdtt.task.TaskTemplate;
import com.vdtt.util.Log;
import com.vdtt.util.ParseData;
import com.vdtt.util.RandomCollection;
import com.vdtt.util.VDTTUtlis;
import lombok.Getter;
import lombok.Setter;
import com.vdtt.map.zones.Zone;
import org.apache.commons.lang3.time.DateUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Char extends Entity {
    public static ExecutorService threadPool = Executors.newFixedThreadPool(500);
    public int id;
    public User user;
    public String name;
    public byte gender;
    public byte idCharSys;
    public byte sys;
    public long exp;
    public byte status;
    public short speed = 600;
    public int hp, maxHP;
    public int mp, maxMP;
    public byte m, l;
    public byte lvPK;
    public int damage;
    public Item[] bag, box, body, body2, extend, mount;
    public List<DanhHieu> danhHieu;
    public byte rank;
    public int timeTienIch = (int) (System.currentTimeMillis() / 1000);
    public byte selectDanhhieu;
    public byte bp;
    public Vector<Skill> skills;
    public short numberCellBag, numberCellBox;
    public int zeni, ballZ, coin, kimCuong;
    public HashMap<String, Friend> friends, enemies;
    public byte sachChienDau;
    public boolean isCleaned;
    public int idTask;
    public int mocNap;
    public int typePK;
    public int typeSelectOutChar;
    public int damegeMonster;
    public short exactly, crit, miss, armor;
    public short reduceDame, reduceCrit, reduceSuyGiam, reduceChiuDon, reduceStun;
    public short suyGiam, chiuDon, stun, randomDame;
    public short counterDame, skipMiss, armorPenetration, criticalHitPower;
    public short reduceCritHitPower;
    public short increaseXu, increaseKI;
    public short increaseExtra = 10;
    public int pointPhamChat, pointEnthusiastic, pointEnthusiasticWeek,
            pointUpgrageStar, pointUpgrageStarWeek, pointKame, pointSuper;
    public int zeniLock;
    public int[] options;
    public boolean[] haveOptions;
    public int[] optionsSupportSkill;
    public long lastLoginTime;
    public short countVongQuay;
    public boolean isLuongLongNhatThe;
    public boolean isSocola;
    public boolean isBot;
    public byte percentDameBoss;
    @Setter
    private Service service;
    public Zone zone;
    public short mapId = 86;
    public boolean isDead;
    public long KI;
    public Lock lock = new ReentrantLock();
    public Lock lockItem = new ReentrantLock();
    @Setter
    private AbilityFromEquip abilityStrategy;
    protected boolean saving;
    @Getter
    @Setter
    private boolean isLoadFinish;
    private long lastLogoutTime;
    @Getter
    public ArrayList<Menu> menus = new ArrayList<>();
    @Getter
    public short subMenuId;
    public byte levelBean;
    public int timeReciveBean;
    private long timeUseBean;
    public Item sach;
    @Getter
    @Setter
    protected EffectManager em;
    public boolean isSuperSayan;
    public byte maxBean = 24;
    public byte nhanMocNap;
    public MailManager mailManager;
    public long timeUpgradeBean;
    public List<Reward> rewardList = new ArrayList<>();
    public int timeOnline;
    public byte ngayOnline;
    public long totalTimeOnline;
    public short totalTA;
    public short totalTL;
    public short totalSQ;
    public boolean packTinhAnh;
    public boolean packThuLinh;
    public boolean packSieuQuai;
    public boolean packOnline;
    public byte totalKiNang;
    public int napNgay;
    public byte countTui1;
    public byte countTui2;
    public byte countTui3;
    @Getter
    private Group group;
    public Invite invite;
    private List<World> worlds;// danh sách world đang tham gia
    public long timeZoom;
    public short taskId = 0;
    public Task taskMain;
    private int countQuaSinhLuc;
    public ChatGlobal chatGlobal;
    @Getter
    @Setter
    private QuaySo quaySo;
    public ItemQuaySo itemQuaySo;
    public List<Item> itemTVM = new ArrayList<>();
    public boolean isDCTT;
    public boolean resetRewarNap;
    public Clan clan;
    public long timeOutClan;
    public Pet pet;
    public Trade trade;
    public Trader myTrade;
    public Trader partnerTrade;
    private boolean taskPet;
    public int pointHell;
    @Getter
    @Setter
    private InputDialog input;
    public boolean lockEXP;
    private int countTuiDo;
    private byte countHell = 1;
    private byte countTheHell;
    public long timeGiapLuyenTap;
    public byte countTaskQuyLao = 60;
    public TaskOrder taskOrders;
    public short answer;
    public Skill selectSkill;
    public byte countDead;
    public long timeNgucTu;
    public byte countNgucTu = 2;
    public byte countUseItemNgucTu;
    public byte countAddPointNgucTu;
    public long timeRaoBan;
    public byte countTaskFailed;
    public long timeHoiSuc;
    @Setter
    private EventPoint eventPoint;
    public int testCharId;
    public boolean isTest;
    private int killCharId;
    private boolean isCuuSat;
    public int timeChangeCaiTrang;
    public int timeReloadCaiTrang;
    public boolean moc1;
    public boolean moc2;
    public boolean moc3;
    public boolean moc4;
    public boolean moc5;
    public boolean moc6;
    public boolean online;
    public Archievement archievement;
    @Getter
    public int pointTournament;
    public DeathMatch deathMatch;
    public MatchUp matchUp;
    public boolean isMoc1;
    public boolean isMoc2;
    public boolean isMoc3;
    public boolean isMoc4;
    public boolean isMoc5;
    public boolean isMoc6;
    public boolean isMoc7;
    private HashMap<Short, Long> timeSkill;
    public byte countDoanhTrai = 2;
    public int idDoanhTrai = -1;
    public long timeChangeZone;
    public String captcha;
    public int mapCaptcha;
    public int zoneCaptcha;
    private long timeUsePet;
    public byte typeTVM;
    public int buffSucManh;
    public byte countJoinNgucTu2 = 2;
    public boolean isNewBie;
    public boolean isAuto;
    public byte activated = 1;
    public int vnd;

    public Char() {
        hp = mp = 1;
        this.em = new EffectManager(this);
        this.mailManager = new MailManager(this);
        invite = new Invite();
        this.worlds = new ArrayList<>();
        this.chatGlobal = new ChatGlobal(this);
        this.quaySo = new QuaySo();
        this.danhHieu = new ArrayList<>();
        this.friends = new HashMap<>();
        this.archievement = new Archievement();
        this.timeSkill = new HashMap<>();
        this.mount = new Item[4];
    }

    public EventPoint getEventPoint() {
        return eventPoint;
    }

    public Service getService() {
        return this.service;
    }

    public void requestChangeMap() {
        if (this.isDead) {
            return;
        }
        zone.requestChangeMap(this);
    }

    public void preLoad() {
        try {
            for (int i = bag.length - 1; i >= 0; i--) {
                Item item = bag[i];
                if (item != null) {
                    if (item.isExpired()) {
                        bag[i] = null;
                    }
                }
            }
            for (int i = body.length - 1; i >= 0; i--) {
                Item item = body[i];
                if (item != null) {
                    if (item.isExpired()) {
                        body[i] = null;
                    }
                }
            }
            for (int i = body2.length - 1; i >= 0; i--) {
                Item item = body2[i];
                if (item != null) {
                    if (item.isExpired()) {
                        body2[i] = null;
                    }
                }
            }
            for (int i = box.length - 1; i >= 0; i--) {
                Item item = box[i];
                if (item != null) {
                    if (item.isExpired()) {
                        box[i] = null;
                    }
                }
            }
            getService().updateItemBodyChange();
            getService().updateIndexBag();
            setAbility();
            if (!resetRewarNap) {
                resetRewarNap = true;
                Reward rw2 = findReward(5);
                if (rw2 != null) {
                    rw2.list.clear();
                }
            }

            if (mocNap >= 1 && nhanMocNap == 0) {
                nhanMocNap = 1;
                for (int i = 0; i < 3; i++) {
                    Item item = RewardManager.gI().find(477 + i).item;
                    Mail mail = new Mail();
                    if (mailManager.size() == 0) {
                        mail.id = mailManager.size();
                    } else {
                        mail.id = mailManager.getID();
                    }
                    mail.title = "Nạp lần đầu";
                    mail.content = "Quà nạp lần đầu";
                    mail.sender = "Hệ thống";
                    mail.time = (int) ((System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7)) / 1000);
                    mail.item = item.clone();
                    if (mail.item.expire > 0) {
                        mail.item.expire += System.currentTimeMillis();
                    }
                    mailManager.addMail(mail);
                }
            }
            if (mocNap >= 1000 && nhanMocNap == 1) {
                nhanMocNap = 2;
                for (int i = 3; i < 6; i++) {
                    Item item = RewardManager.gI().find(477 + i).item;
                    Mail mail = new Mail();
                    if (mailManager.size() == 0) {
                        mail.id = mailManager.size();
                    } else {
                        mail.id = mailManager.getID();
                    }
                    mail.title = "Nạp lần đầu";
                    mail.content = "Quà nạp lần đầu";
                    mail.sender = "Hệ thống";
                    mail.time = (int) ((System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7)) / 1000);
                    mail.item = item.clone();
                    if (mail.item.expire > 0) {
                        mail.item.expire += System.currentTimeMillis();
                    }
                    mailManager.addMail(mail);
                }
            }
            if (mocNap >= 2000 && nhanMocNap == 2) {
                nhanMocNap = 3;
                for (int i = 6; i < 9; i++) {
                    Item item = RewardManager.gI().find(477 + i).item;
                    Mail mail = new Mail();
                    if (mailManager.size() == 0) {
                        mail.id = mailManager.size();
                    } else {
                        mail.id = mailManager.getID();
                    }
                    mail.title = "Nạp lần đầu";
                    mail.content = "Quà nạp lần đầu";
                    mail.sender = "Hệ thống";
                    mail.time = (int) ((System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7)) / 1000);
                    mail.item = item.clone();
                    if (mail.item.expire > 0) {
                        mail.item.expire += System.currentTimeMillis();
                    }
                    mailManager.addMail(mail);
                }
            }
            if (increaseExtra < 10) {
                increaseExtra = 10;
            }
            getService().sendTaskQuyLao();
            if (taskOrders != null) {
                getService().updateTaskOrder(taskOrders);
            }
            if (clan != null) {
                Member mem = clan.getMemberByName(name);
                if (mem != null) {
                    mem.setOnline(true);
                    mem.setChar(this);
                }
            }
            if (idDoanhTrai > -1) {
                DoanhTrai doanhTrai = DoanhTrai.getDoanhTrai(idDoanhTrai);
                if (doanhTrai == null || doanhTrai.isClosed()) {
                    idDoanhTrai = -1;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAbility() {
        try {
            if (abilityStrategy != null) {
                abilityStrategy.setAbility(this);
                if (zone != null) {
                    zone.getService().updateHP(this);
                    zone.getService().updateStatus(this);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void takingTask() {
        try {
            if (taskMain == null) {
                getService().sendTaskStep(-1);
                updateTaskLevelUp();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getTaskNpcId() {
        try {
            if (taskMain != null) {
                if (taskMain.index > taskMain.vStep.size() - 1 || taskMain.index < 0) {
                    return taskMain.template.npcid;
                } else {
                    return taskMain.vStep.get(taskMain.index).npcId;
                }

            } else {
                if (taskId >= DataCenter.gI().TaskTemplate.length) {
                    return -1;
                }
                return DataCenter.gI().TaskTemplate[taskId].npcid;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int getIdItemTask(int mobId) {
        try {
            if (taskMain != null) {
                if (taskMain.index < 0 || taskMain.index > taskMain.vStep.size() - 1)
                    return -1;
                int idMob = taskMain.vStep.get(taskMain.index).mobId;
                int itemId = taskMain.vStep.get(taskMain.index).itemId;
                if (mobId == idMob) {
                    return itemId;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public void acceptTask() {
        try {
            if (taskMain == null) {
                TaskTemplate template = Task.getTaskTemplate(taskId);
                if (template == null) {
                    return;
                }
                taskMain = TaskFactory.getInstance().createTask(taskId, (byte) 0, (short) 0);
                getService().sendTaskInfo();
            }
            taskNext();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateTaskLevelUp() {
        // if (taskMain != null && taskMain.index == 0 &&
        // taskMain.template.getLeveRequire() > 0
        // && this.level >= taskMain.template.getLeveRequire()) {
        // taskNext();
        // }
    }

    public void updateTaskPickItem(Item item) {
        if (taskMain != null) {
            if (taskMain.index < 0 || taskMain.index > taskMain.vStep.size() - 1)
                return;
            int itemId = taskMain.vStep.get(taskMain.index).itemId;
            if (item.id == itemId) {
                updateTaskCount(1);
            }
        }
    }

    public void updateTaskKillMonster(Mob mob) {
        try {
            if (taskMain != null) {
                if (taskMain.index < 0 || taskMain.index > taskMain.vStep.size() - 1)
                    return;
                int modId = taskMain.vStep.get(taskMain.index).mobId;
                if (mob.id == modId && getIdItemTask(mob.id) == -1) {
                    updateTaskCount(1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getItemStepTask() {
        try {
            if (taskMain != null) {
                if (taskMain.index < 0 || taskMain.index > taskMain.vStep.size() - 1)
                    return -1;
                return taskMain.vStep.get(taskMain.index).itemId;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public void updateTaskCount(int count) {
        if (taskMain != null) {
            try {
                taskMain.count += count;
                getService().updateTaskCount(taskMain.count);
                if (taskMain.count >= taskMain.vStep.get(taskMain.index).require) {
                    taskNext();
                }
            } catch (Exception ex) {
                Log.error("err: " + ex.getMessage(), ex);
            }
        }
    }

    public void taskNext() {
        try {
            if (taskMain != null) {
                taskMain.index++;
                taskMain.count = 0;
                getService().sendTaskInfo();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateTask() {
        try {
            if (taskMain != null) {
                RewardTask();
                taskMain = null;
                taskId++;
                if (taskId < DataCenter.gI().TaskTemplate.length)
                    taskMain = TaskFactory.getInstance().createTask(taskId, (byte) 0, (short) 0);
                else
                    taskMain = null;
                getService().sendTaskInfo();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void RewardTask() {
        try {
            TaskTemplate taskTemplate = taskMain.template;
            addEXP(taskTemplate.getExt());
            addCoin(taskTemplate.getXu(), true);
            if (taskTemplate.strItem != null && taskTemplate.strItem.length() > 0) {
                String[] var1 = taskTemplate.strItem.split("@");
                Item var2;
                var2 = new Item(Short.parseShort(var1[0]));
                var2.isLock = Boolean.parseBoolean(var1[1]);
                var2.expire = Long.parseLong(var1[2]);
                var2.setQuantity(Integer.parseInt(var1[3]));
                // var2. = Byte.parseByte(var1[4]);
                var2.upgrade = Byte.parseByte(var1[5]);
                // if (var1.length > 6) {
                // var2.strOption = var1[6];
                // if (var2.getTemplate().gioiTinh != 2) {
                // for (int var3 = 0; var3 < ItemManager.getInstance().itemTemplates.size();
                // ++var3) {
                // ItemTemplate var5;
                // if ((var5 = ItemManager.getInstance().itemTemplates.get(var3)).type ==
                // var2.getTemplate().type && var5.levelNeed == var2.getTemplate().levelNeed) {
                // var2.id = var5.id;
                // break;
                // }
                // }
                // }
                // }
                if (var2.id == 832) {
                    Skill skill = null;
                    switch (sys) {
                        case 1:
                            skill = SkillFactory.getInstance().getSkill(8, 0);
                            break;
                        case 2:
                            skill = SkillFactory.getInstance().getSkill(3, 0);
                            break;
                        case 3:
                            skill = SkillFactory.getInstance().getSkill(15, 0);
                            break;
                        case 4:
                            skill = SkillFactory.getInstance().getSkill(21, 0);
                            break;
                        case 5:
                            skill = SkillFactory.getInstance().getSkill(24, 0);
                            break;

                    }
                    if (skill != null) {
                        totalKiNang++;
                        addSkill(skill);
                    }
                } else if (var2.id == 831) {
                    Skill skill = null;
                    switch (sys) {
                        case 1:
                            skill = SkillFactory.getInstance().getSkill(6, 0);
                            break;
                        case 2:
                            skill = SkillFactory.getInstance().getSkill(0, 0);
                            break;
                        case 3:
                            skill = SkillFactory.getInstance().getSkill(12, 0);
                            break;
                        case 4:
                            skill = SkillFactory.getInstance().getSkill(18, 0);
                            break;
                        case 5:
                            skill = SkillFactory.getInstance().getSkill(27, 0);
                            break;

                    }
                    if (skill != null) {
                        totalKiNang++;
                        addSkill(skill);
                    }
                } else if (var2.id == 830) {
                    Skill skill = SkillFactory.getInstance().getSkill(31, 0);
                    if (skill != null) {
                        totalKiNang++;
                        addSkill(skill);
                    }
                } else {
                    if (var2.getTemplate().isXepChong) {
                        if (var2.getQuantity() <= 0) {
                            var2.setQuantity(1);
                        }
                        addItemToBag(var2);
                        getService().addItem(var2);
                    } else {
                        for (int i = 0; i < var2.getQuantity(); i++) {
                            Item item = var2.clone();
                            item.setQuantity(1);
                            addItemToBag(item);
                            getService().addItem(item);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void changeMap(int id) {
        try {
            int zoneId = VDTTUtlis.randomZoneId(id);
            this.mapId = (short) id;
            if (zoneId == -1) {
                service.serverDialog("Không tìm thấy nơi này!");
                return;
            }
            outZone();
            joinZone(id, zoneId, -1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addWorld(World world) {
        synchronized (worlds) {
            if (worlds.stream().noneMatch(w -> w.getType() == world.getType())) {
                worlds.add(world);
                Log.debug("add worldType: " + world.getType());
            }
        }
    }

    public void removeWorld(byte type) {
        synchronized (worlds) {
            worlds.removeIf((t) -> t.getType() == type);
            Log.debug("remove worldType: " + type);
        }
    }

    public World findWorld(byte type) {
        synchronized (worlds) {
            for (World world : worlds) {
                if (world.getType() == type) {
                    return world;
                }
            }
            return null;
        }
    }

    public Reward findReward(int type) {
        for (Reward reward : rewardList) {
            if (reward.type == type) {
                return reward;
            }
        }
        return null;
    }

    public void outZone() {
        if (trade != null) {
            trade.closeUITrade();
        }
        if (zone != null) {
            if (zone.map.isVoDai()) {
                if (deathMatch != null) {
                    deathMatch.out(this);
                }
                VoDaiSucManh dauTruong = MapManager.getInstance().VDSM;
                if (dauTruong != null) {
                    dauTruong.removeMember(this);
                }
            }
            if (this.group != null) {
                if (zone.map.isGDSM()) {
                    if (matchUp != null) {
                        matchUp.out(group);
                        matchUp = null;
                    }
                    GiaiDauSucManh gdsm = MapManager.getInstance().GDSM;
                    if (gdsm != null) {
                        gdsm.removeMember(group);
                    }
                }
            }
            zone.out(this);
        }
        if (isTest && testCharId != 0) {
            Char player = zone.findCharById(testCharId);
            if (player != null) {
                testEnd(1, player);
            }
        }
        if (isCuuSat) {
            clearCuuSat(false);
        }
        if (this.group != null && this.group.memberGroups.size() <= 1) {
            outParty();
        }
    }

    public void checkSaoDen() {
        try {
            if (zone.map.isSaoDen()) {
                Effect eff = getEm().findByID(132);
                if (eff != null) {
                    getEm().remove(eff);
                    getService().playerRemoveEffect(eff);
                    Mob mob = zone.monsters.get(0);
                    if (mob != null) {
                        Mob mob1 = mob.clone();
                        mob1.idEntity = zone.monsters.size();
                        mob1.hp = mob1.hpFull;
                        mob1.zone = zone;
                        mob1.isDead = false;
                        zone.addMob(mob1);
                        GlobalService.getInstance().chat("Hệ thống",
                                mob.getTemplate().name + " đã xuất hiện tại " + zone.template.name + " khu " + zone.id,
                                (byte) 1);
                    }
                    List<Char> chars = zone.getChars();
                    for (Char c : chars) {
                        try {
                            if (c != null && !c.isCleaned) {
                                c.setTypePk((byte) 0);
                            }
                        } catch (Exception e) {

                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeMemberFromWorld(Zone pre, Zone now) {
        List<Byte> worldTypes = new ArrayList<>();
        synchronized (worlds) {
            worlds.forEach((t) -> {
                if (t.leaveWorld(pre, now)) {
                    t.removeMember(this);
                    worldTypes.add(t.getType());
                }
            });
        }
        try {
            if (worldTypes.isEmpty()) {
                return;
            }
            worldTypes.forEach((t) -> {
                removeWorld(t);
            });
        } catch (Exception e) {

        }
    }

    public void addMemberForWorld(Zone pre, Zone now) {
        synchronized (worlds) {
            worlds.forEach((t) -> {
                if (t != null && !t.isClosed() && t.enterWorld(pre, now)) {
                    t.addMember(this);
                }
            });
        }
    }

    public void joinZone(int map, int zoneId, int typeTau) {
        if (taskId == 10) {
            switch (taskMain.index) {
                case 1:
                    if (map == 57) {
                        updateTaskCount(1);
                    }
                    break;
                case 2:
                    if (map == 62) {
                        updateTaskCount(1);
                    }
                    break;
            }
        } else if (taskId == 19 && taskMain.index > 0) {
            switch (taskMain.index) {
                case 1:
                    if (map == taskMain.vStep.get(taskMain.index).mapId) {
                        updateTaskCount(1);
                    }
                    break;
                case 2:
                    if (map == taskMain.vStep.get(taskMain.index).mapId) {
                        updateTaskCount(1);
                    }
                    break;
                case 3:
                    if (map == taskMain.vStep.get(taskMain.index).mapId) {
                        updateTaskCount(1);
                    }
                    break;
            }
        } else if (taskId == 25 && taskMain.index > 0) {
            switch (taskMain.index) {
                case 1:
                    if (map == taskMain.vStep.get(taskMain.index).mapId) {
                        updateTaskCount(1);
                    }
                    break;
                case 2:
                    if (map == taskMain.vStep.get(taskMain.index).mapId) {
                        updateTaskCount(1);
                    }
                    break;
                case 3:
                    if (map == taskMain.vStep.get(taskMain.index).mapId) {
                        updateTaskCount(1);
                    }
                    break;
                case 4:
                    if (map == taskMain.vStep.get(taskMain.index).mapId) {
                        updateTaskCount(1);
                    }
                    break;
            }
        } else if (taskId == 31 && taskMain.index > 0) {
            switch (taskMain.index) {
                case 1:
                    if (map == taskMain.vStep.get(taskMain.index).mapId) {
                        updateTaskCount(1);
                    }
                    break;
                case 2:
                    if (map == taskMain.vStep.get(taskMain.index).mapId) {
                        updateTaskCount(1);
                    }
                    break;
                case 3:
                    if (map == taskMain.vStep.get(taskMain.index).mapId) {
                        updateTaskCount(1);
                    }
                    break;
                case 4:
                    if (map == taskMain.vStep.get(taskMain.index).mapId) {
                        updateTaskCount(1);
                    }
                    break;
            }
        } else if (taskId == 37 && taskMain.index > 0) {
            switch (taskMain.index) {
                case 1:
                    if (map == taskMain.vStep.get(taskMain.index).mapId) {
                        updateTaskCount(1);
                    }
                    break;
                case 2:
                    if (map == taskMain.vStep.get(taskMain.index).mapId) {
                        updateTaskCount(1);
                    }
                    break;
                case 3:
                    if (map == taskMain.vStep.get(taskMain.index).mapId) {
                        updateTaskCount(1);
                    }
                    break;
                case 4:
                    if (map == taskMain.vStep.get(taskMain.index).mapId) {
                        updateTaskCount(1);
                    }
                    break;
            }
        }
        MapManager.getInstance().joinZone(this, map, zoneId, typeTau);
    }

    public void writeData(DataOutputStream dos, Message m) {
        try {
            dos.writeByte(status);
            m.writeUTF(name);
            dos.writeByte(idCharSys);
            dos.writeByte(gender);
            dos.writeByte(sys);
            dos.writeByte(0);
            dos.writeByte(lvPK);
            dos.writeShort(speed);
            dos.writeInt(hp);
            dos.writeInt(maxHP);
            dos.writeInt(mp);
            dos.writeInt(maxMP);
            dos.writeLong(exp);
            dos.writeShort(x);
            dos.writeShort(y);
            dos.writeByte(0);
            m.writeUTF("");
            writeItemBody(m);
            dos.writeByte(0);
            showDanhHieu(m);
            dos.writeByte(rank);// rank
            writeTypeSelectOutChar(m);

            writeTypeMoveMap(m, 0);
            dos.writeBoolean(false);
        } catch (Exception e) {

        }
    }

    public void writeTypeSelectOutChar(Message message) throws Exception {
        message.writer().writeByte(0);
    }

    public void writeTypeMoveMap(Message message, int tau) throws Exception {
        message.writer().writeByte(tau);
    }

    public void chatGlobal(Message ms) {
        if (chatGlobal != null) {
            chatGlobal.read(ms);
            chatGlobal.wordFilter();
            chatGlobal.send();
        }
    }

    public void chatPublic(Message mss) {
        try {
            String str = mss.readUTF();
            if (str.startsWith("quatang")) {
                try {
                    String arr[] = str.split(" ");
                    String code = arr[1];
                    GiftCode.getInstance().use(this, code);
                } catch (Exception e) {
                    getService().serverDialog("Nhập sai cu pháp rồi");
                }
            }
            if (user.isAdmin) {
                AdminService.getInstance().chat(this, str);
            }
            zone.getService().chat(this.name, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void questionAndAnswer() {
        subMenuId = CMDMenu.QUY_LAO;
        short questId = (short) VDTTUtlis.nextInt(0, DataCenter.questions.length - 1);
        String question = DataCenter.questions[questId];
        String[] parts = question.split(";");
        String questionText = parts[0];
        String[] options = parts[1].split(",");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < options.length; i++) {
            sb.append(options[i]);
            if (i < options.length - 1) {
                sb.append(";");
            }
        }
        String concatenatedOptions = sb.toString();
        answer = (short) Integer.parseInt(question.split("#")[1]);
        Log.debug(answer);
        getService().sendTextNPC(questionText, concatenatedOptions);
    }

    public void pickItem(Message ms) {
        lockItem.lock();
        try {
            if (isDead) {
                return;
            }
            if (trade != null) {
                warningTrade();
                return;
            }
            short itemMapId = ms.reader().readShort();
            ItemMap itemMap = zone.findItemMapById(itemMapId);
            if (itemMap != null) {
                itemMap.lock.lock();
                try {
                    if (itemMap.isPickedUp()) {
                        return;
                    }
                    int distance = VDTTUtlis.getRange(this.x, this.y, itemMap.getX(), itemMap.getY());
                    if (distance < 150) {
                        Item item = itemMap.getItem();
                        if (item == null) {
                            return;
                        }

                        int ownerID = itemMap.getOwnerID();
                        if (ownerID == -1 || this.id == ownerID || itemMap.isCanPickup()) {
                            if (ownerID != -1 && this.id != ownerID) {
                                service.serverMessage("Vật phẩm của người khác");
                                return;
                            }
                            int index2 = -1;
                            int requireItemID = itemMap.getRequireItemID();

                            if (item.template.id != 163) {
                                int num = getSlotNull();
                                if (item.template.isXepChong) {
                                    int index = getIndexItemByIdInBag(item.id, item.isLock);
                                    if (index == -1 && num == 0) {
                                        warningBagFull();
                                        return;
                                    }
                                } else {
                                    if (num == 0) {
                                        warningBagFull();
                                        return;
                                    }
                                }
                                if (requireItemID != -1 && index2 != -1) {
                                    removeItem(index2, 1, true);
                                }
                                if (item.id == getItemStepTask()) {
                                    updateTaskCount(1);
                                }

                                itemMap.setPickedUp(true);

                                // if (isTask) {
                                // item.isLock = true;
                                // }
                                if (item.getTemplate().type == 37) {
                                    item.setOptionKichHoat();
                                }
                                addItemToBag(item);

                            } else {
                                itemMap.setPickedUp(true);
                                long sum = (long) this.coin + (long) item.getQuantity();
                                if (sum > Integer.MAX_VALUE) {
                                    this.coin = Integer.MAX_VALUE;
                                } else {
                                    addCoin(item.getQuantity(), true);
                                }
                            }
                            zone.getService().pickItem(this, itemMapId, item);
                            zone.removeItem(itemMap);
                        } else {
                            getService().serverMessage("Vật phẩm của người khác");
                        }
                    }
                } finally {
                    itemMap.lock.unlock();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lockItem.unlock();
        }
    }

    public void learnSkill(Message mss) {
        try {
            short idskill = mss.reader().readShort();
            Skill skill = findSkillWithIdSkillTemplate(idskill);
            if (skill != null) {
                Skill skillNext = SkillFactory.getInstance().getSkill(skill.isSkillTemplate, skill.level + 1);
                if (skillNext != null) {
                    if (KI < skillNext.kiUpgrade) {
                        service.serverDialog("Không đủ KI");
                        return;
                    }
                    if (level() < skillNext.levelNeed) {
                        service.serverDialog("Không đủ level");
                        return;
                    }
                    if (taskId == 1 && taskMain != null && taskMain.index == 0) {
                        updateTaskCount(1);

                    }
                    if (taskId == 5 && taskMain != null && taskMain.index == 3) {
                        updateTaskCount(1);
                    }
                    KI -= skillNext.kiUpgrade;
                    int index = this.skills.indexOf(skill);
                    this.skills.set(index, skillNext);
                    service.showKI();
                    service.updateSkill();
                    setAbility();
                    service.updateHPFull();
                    service.updateMPFull();
                    getService().updateSkillNoCoolDown();
                } else {
                    service.serverDialog("Không tìm thấy skill next");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Skill findSkillWithIdSkillTemplate(short idSkillTemplate) {
        for (Skill skill : skills) {
            if (skill != null && skill.isSkillTemplate == idSkillTemplate) {
                return skill;
            }
        }
        return null;
    }

    public void getInfo2(Message ms) {
        try {
            String name = ms.readUTF();
            if (this.name.contains(name)) {
                this.service.showInfo2(this);
            } else {
                Char pl = ServerManager.findCharByName(name);
                if (pl != null) {
                    service.showInfo2(pl);
                } else {
                    this.service.serverDialog("Không tìm thấy người chơi");
                }
            }
        } catch (Exception e) {

        }
    }

    public void showDanhHieu(Message m) throws Exception {
        try {
            m.writer().writeByte(danhHieu.size());// size danh hieu
            for (int i = 0; i < danhHieu.size(); i++) {
                DanhHieu dh = danhHieu.get(i);
                if (dh != null) {
                    m.writeUTF(dh.title);
                    m.writer().writeInt(dh.time);
                }
            }
            m.writer().writeByte(selectDanhhieu);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showDame(Message mss) {
        try {
            String name = mss.readUTF();
            if (this.name.contains(name)) {
                this.service.showDame(this);
            } else {
                Char pl = ServerManager.findCharByName(name);
                if (pl != null) {
                    this.service.showDame(pl);
                } else {
                    this.service.serverDialog("Không tìm thấy người chơi");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean addItemToBag(Item item) {
        try {
            if (item == null) {
                return false;
            }
            if (item.getQuantity() <= 0) {
                item.setQuantity(1);
            }
            if (item.id == 160) {
                item.isLock = true;
            }
            if (item.getTemplate().isXepChong) {
                for (int i = 0; i < bag.length; i++) {
                    if (bag[i] != null && bag[i].id == item.id && item.expire == bag[i].expire
                            && item.isLock == bag[i].isLock) {
                        item.setQuantity(bag[i].getQuantity() + item.getQuantity());
                        if (item.id == 724) {
                            if (item.getQuantity() > maxBean) {
                                item.setQuantity(maxBean);
                            }
                        }
                        item.index = (short) i;
                        bag[i] = item;
                        return true;
                    }
                }
                for (int i = 0; i < bag.length; i++) {
                    if (bag[i] == null) {
                        if (item.id == 724) {
                            if (item.getQuantity() > maxBean) {
                                item.setQuantity(maxBean);
                            }
                        }
                        item.index = (short) i;
                        bag[i] = item;
                        return true;
                    }
                }
            } else {
                for (int i = 0; i < bag.length; i++) {
                    if (bag[i] == null) {
                        item.index = (short) i;
                        bag[i] = item;
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void removeItem(int index, int quantity, boolean isUpdate) {
        try {
            if (bag[index] != null) {
                bag[index].reduce(quantity);
                if (!bag[index].has()) {
                    bag[index] = null;
                    if (isUpdate) {
                        getService().removeItem((byte) 0, index);
                    }
                } else if (isUpdate) {
                    getService().useItem(bag[index]);
                }
            }
        } catch (Exception ex) {
            Log.error("remove item: " + ex.getMessage(), ex);
        }
    }

    public int getIndexItemByIdInBag(int id, boolean isLock) {
        try {
            for (Item item : this.bag) {
                if (item != null && item.id == id && item.isLock == isLock) {
                    return item.index;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int getIndexItemByIdInBag(int id) {
        for (Item item : this.bag) {
            if (item != null && item.id == id) {
                return item.index;
            }
        }
        return -1;
    }

    public List<Item> getListItemByID(int... ids) {
        List<Item> list = new ArrayList<>();
        for (Item item : this.bag) {
            for (int id : ids) {
                if (item != null && item.id == id) {
                    list.add(item);
                    break;
                }
            }
        }
        return list;
    }

    public void attackMob(int indexSkill, int idMob) {
        try {
            if (this.isDead) {
                return;
            }
            if (indexSkill < 0 || indexSkill >= skills.size()) {
        //        Log.debug("Skill not found");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Skill skill = this.skills.get(indexSkill);
            if (skill.isCoolDown() || skill.getSkillTemplate().type == 5) {
       //         Log.debug("Skill is cool down");
                return;
            }
            if (isSkillMount(skill.isSkillTemplate)) {
                return;
            }
            if (skill.isSkillTemplate == 2 || skill.isSkillTemplate == 17 || skill.isSkillTemplate == 102) {
                useSkill(indexSkill);
                return;
            }
            if (skill.getSkillTemplate().i > 0) {
                if (timeSkill.get(skill.id) != null) {
                    if (timeSkill.get(skill.id) > System.currentTimeMillis()) {
                        return;
                    }
                }
                timeSkill.put(skill.id, System.currentTimeMillis() + skill.coolDown);
            }
            Mob mob = zone.findMoLivebByID(idMob);
            if (mob == null) {
                return;
            }
            if (mob.hp > 0) {
                int add = 100;
                if (skill.isSkillTemplate == 11) {
                    isDCTT = true;
                    add = 300;
                }
                if (Math.abs(x - mob.x) <= skill.rangeNgang + mob.getTemplate().speedMove + add
                        && Math.abs(y - mob.y) <= skill.rangeDoc + mob.getTemplate().speedMove + add) {
                    skill.timeCoolDown = currentTimeMillis;
                    if (getEm().statusWithID(189) || getEm().statusWithID(136)) {
                        if (skill.getSkillTemplate().name.contains("Đá")
                                || skill.getSkillTemplate().name.contains("Đấm")) {
                            skill.timeCoolDown -= skill.coolDown * 20 / 100;
                        }
                    }
                    if (skill.isSkillTemplate == 5 || skill.isSkillTemplate == 22 || skill.isSkillTemplate == 87) {
                        int num = skill.isSkillTemplate == 5 ? skill.getItemOption()[0].getParam()
                                : skill.isSkillTemplate == 22 ? 6 : 2;
                        for (int i = 0; i < num; i++) {
                            attackMonster(mob, skill);
                            try {
                                Thread.sleep(300);
                            } catch (InterruptedException e) {

                            }
                        }
                    } else {
                        attackMonster(mob, skill);
                    }
                    addMp(-skill.mpUsing);
                    if (pet != null) {
                        pet.attackMonster(mob);
                    }
                } else {
                    zone.getService().updatePostion(id, this.x, this.y);
                    service.serverMessage("Khoảng cách quá xa");
                    Log.debug(mob.x + " " + mob.y);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean bossEvent(Mob mob) {
        if (mob.id == 77 && (zone.map.id == 55 || zone.map.id == 57 || zone.map.id == 88 || zone.map.id == 77
                || zone.map.id == 81)) {
            return true;
        }
        return false;
    }

    public void attackMonster(Mob mob, Skill skill) {
        if (this.isDead) {
            return;
        }
        mob.lock.lock();
        try {
            if (!mob.isDead) {
                if (mob.hp > 0) {
                    selectSkill = skill;
                    setAbility();
                    if (taskId == 30 && taskMain.index == 0 && mob.id == 201) {
                        updateTaskCount(1);
                    }
                    if (taskId == 36 && taskMain.index == 0 && mob.id == 202) {
                        updateTaskCount(1);
                    }
                    if (bossEvent(mob)) {
                        int index = getIndexItemByIdInBag(990);
                        if (index == -1) {
                            serverMessage("Cần vé sự kiện mới có thể tấn công boss");
                            return;
                        }
                    }
                    int countDame = damage + damegeMonster;
                    int dame2 = countDame * 90 / 100;
                    int dameHit = VDTTUtlis.nextInt(dame2, countDame);
                    int preHP = mob.hp;
                    if (taskId == 3 && taskMain != null && taskMain.index == 1 && mob.id == 239) {
                        updateTaskCount(1);
                    }
                    boolean isCrit = false;
                    if (VDTTUtlis.nextInt(100) < (crit / 100)) {
                        isCrit = true;
                        dameHit += dameHit * (criticalHitPower + 50) / 100;
                    }

                    if (skill.isSkillTemplate == 6 && isDCTT) {
                        isDCTT = false;
                        dameHit *= 2;
                    }
                    boolean isChiuDon = VDTTUtlis.nextInt(0, 200) < chiuDon;
                    boolean isSuyGiam = VDTTUtlis.nextInt(0, 200) < suyGiam;
                    boolean isStun = VDTTUtlis.nextInt(0, 200) < stun;
                    if (isChiuDon) {
                        if (!mob.isEffect((short) 11)) {
                            Effect eff = new Effect(11, 3000, 0);
                            mob.effects.put(eff.template.id, eff);
                            zone.getService().addEffectMob(mob, eff);
                        }
                    }
                    if (isSuyGiam) {
                        if (!mob.isEffect((short) 8)) {
                            Effect eff = new Effect(8, 3000, 0);
                            mob.effects.put(eff.template.id, eff);
                            zone.getService().addEffectMob(mob, eff);
                        }
                    }
                    if (isStun) {
                        if (!mob.isEffect((short) 12)) {
                            Effect eff = new Effect(12, 3000, 0);
                            mob.effects.put(eff.template.id, eff);
                            zone.getService().addEffectMob(mob, eff);
                        }
                    }
                    if (skill.isSkillTemplate == 26) {
                        Effect eff = new Effect(55, options[417], options[254]);
                        mob.effects.put(eff.template.id, eff);
                        zone.getService().addEffectMob(mob, eff);
                    }
                    if (skill.isSkillTemplate == 29) {
                        Effect eff = new Effect(161, options[447], 0);
                        mob.effects.put(eff.template.id, eff);
                        zone.getService().addEffectMob(mob, eff);
                    }
                    if (skill.isSkillTemplate == 20) {
                        Effect eff = new Effect(160, options[446], 0);
                        mob.effects.put(eff.template.id, eff);
                        zone.getService().addEffectMob(mob, eff);
                    }
                    if (mob.isEffect((short) 8)) {
                        dameHit += dameHit * 50 / 100;
                    }
                    if (mob.isEffect((short) 11)) {
                        dameHit *= 2;
                    }
                    int isAttackBoss = Math.abs(mob.getTemplate().timeThuHoach - level());
                    if (mob.levelBoss == 7 && isAttackBoss > 8 && mob.id != 296 && mob.id != 134
                            && !zone.map.isDoanhTrai() && !zone.map.isNgucTuThuThach() && zone.map.id != 83 && !zone.map.isNamec()) {
                        dameHit = 1;
                    }
                    if (zone.map.isNamec()) {
                        isAttackBoss = Math.abs(mob.level - level());
                        if (mob.levelBoss == 7 && isAttackBoss > 20) {
                            dameHit = 1;
                        }
                    }
                    if (mob.id == 273) {
                        if (taskPet) {
                            dameHit = 1000;
                        } else {
                            dameHit = 0;
                            MapManager.getInstance().joinZone(this, 86, 0, 1);
                            serverMessage("Bạn chưa nhận nhiệm vụ đệ tử nên không thể tấn công boss");
                        }
                    }
                    if (mob.id == 221 && taskOrders != null && taskOrders.taskId == TaskOrder.TASK_DI_CHUYEN_DA) {
                        if (!taskOrders.isComplete()) {
                            taskOrders.updateTask(1);
                            getService().updateTaskOrder(taskOrders);
                        }
                    }
                    if (skill.isSkillTemplate == 22) {
                        Effect eff = new Effect(36, options[323] * 6, 0);
                        mob.effects.put(eff.template.id, eff);
                        zone.getService().addEffectMob(mob, eff);
                    }
                    if (skill.isSkillTemplate == 83) {
                        dameHit = 1000;
                        addHp(1000);
                    }
                    if (skill.isSkillTemplate == 89) {
                        Effect eff = new Effect(76, 5000, 0);
                        mob.effects.put(eff.template.id, eff);
                        zone.getService().addEffectMob(mob, eff);
                    }
                    if (skill.isSkillTemplate == 43) {
                        Effect eff = new Effect(76, 5000, 300);
                        mob.effects.put(eff.template.id, eff);
                        zone.getService().addEffectMob(mob, eff);
                        dameHit = 1;
                    }
                    int countMoro = 0;
                    if (skill.isSkillTemplate == 88) {
                        Effect eff = new Effect(138, 90000, 0);
                        mob.effects.put(eff.template.id, eff);
                        zone.getService().addEffectMob(mob, eff);
                        dameHit = 250;
                        countMoro++;
                    }
                    if (skill.isSkillTemplate == 108) {
                        Effect effect = new Effect(214, 20000, 2000);
                        getEm().setEffect(effect);
                    }
                    if (mob.isEffect((short) 55)) {
                        dameHit += dameHit * VDTTUtlis.nextInt(10, 25) / 100;
                    }
                    if (skill.isSkillTemplate == 18 || skill.isSkillTemplate == 14 || skill.isSkillTemplate == 43
                            || skill.isSkillTemplate == 88 || getEm().findByID(158) != null) {
                        if (skill.maxTarget > 1 || getEm().findByID(158) != null) {
                            try {
                                int target = skill.maxTarget;
                                if (getEm().findByID(158) != null) {
                                    target += 1;
                                }
                                int i = 1;
                                List<Mob> mobs = zone.getLivingMonsters();
                                for (Mob mob1 : mobs) {
                                    if (mob1.idEntity == mob.idEntity) {
                                        continue;
                                    }
                                    if ((Math.abs(x - mob1.x) <= skill.rangeNgang + mob1.getTemplate().speedMove + 200
                                            && Math.abs(y - mob1.y) <= skill.rangeDoc + mob1.getTemplate().speedMove
                                            + 200
                                            && i < target) || (skill.isSkillTemplate == 14 && i < target)) {
                                        try {
                                            i++;
                                            if (skill.isSkillTemplate == 43) {
                                                Effect eff = new Effect(76, 5000, 300);
                                                mob1.effects.put(eff.template.id, eff);
                                                zone.getService().addEffectMob(mob1, eff);
                                            }
                                            if (skill.isSkillTemplate == 88) {
                                                Effect eff = new Effect(138, 90000, 0);
                                                mob1.effects.put(eff.template.id, eff);
                                                zone.getService().addEffectMob(mob1, eff);
                                                countMoro++;
                                            }
                                            if (mob1 != null && !mob1.isDead) {
                                                mob1.addHp(-dameHit);
                                                if (mob1.hp <= 0) {
                                                    mob1.die();
                                                }
                                                if (mob1.isDead) {
                                                    mob1.dead(this, false);
                                                } else {
                                                    if (mob1.id != 0) {
                                                        mob1.addCharId(this.id);
                                                    }
                                                }
                                                zone.sendAttackMob(mob1.idEntity, mob1.hp, isCrit);
                                            }
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                Log.error("skill lan: " + e.getMessage(), e);
                            }
                        }
                    }
                    if (skill.isSkillTemplate == 88) {
                        Effect eff1 = new Effect(137, 90000, 100 * countMoro);
                        Effect eff2 = new Effect(139, 90000, 250 * countMoro);
                        getEm().setEffect(eff1);
                        getEm().setEffect(eff2);
                    }
                    if (skill.isSkillTemplate == 101) {
                        Effect eff1 = new Effect(207, 15000, options[494]);
                        Effect eff2 = new Effect(208, 15000, options[494]);
                        getEm().setEffect(eff1);
                        mob.effects.put((short) 208, eff2);
                    }
                    if (percentDameBoss > 0 && mob.levelBoss >= 6) {
                        dameHit += dameHit * percentDameBoss / 100;
                    }
                    if (mob.id == 134 && dameHit > 10000) {
                        if (getEm().statusWithID(147)) {
                            dameHit = 15000;
                        } else if (getEm().statusWithID(151)) {
                            dameHit = 30000;
                        } else {
                            dameHit = 10000;
                        }
                    }
                    if (mob.levelBoss == 6 || mob.levelBoss == 7) {
                        int hpFull = mob.hpFull
                                * (mob.levelBoss == 1 ? 40 : mob.levelBoss == 2 ? 200 : mob.levelBoss == 10 ? 100 : 1);
                        float percent = ((float) mob.hp / hpFull * 100);
                        if (percent < 10) {
                            int kiAdd = dameHit / 100;
                            kiAdd = Math.min(kiAdd, mob.kiNow);
                            mob.kiNow = Math.max(0, mob.kiNow - kiAdd);
                            kiAdd *= 2;
                            kiAdd += kiAdd * (increaseKI / 10) / 100;
                            addEXP(kiAdd);
                            if (pet != null) {
                                pet.addEXP(kiAdd);
                            }
                            if (this.getGroup() != null) {
                                long expGroup = kiAdd / 5;
                                List<Char> chars = this.getGroup().getCharsInZone(zone.map.id, zone.id);
                                for (Char _char : chars) {
                                    if (_char != null && !_char.isCleaned && _char != this && !_char.isDead) {
                                        _char.addEXP(expGroup);
                                    }
                                }
                            }
                            if (mob.kiNow <= 0) {
                                mob.kiNow = 0;
                                mob.isDead = true;
                                mob.addHp(-mob.hp);
                            }
                            if (mob.isDead) {
                                mob.dead(this, false);
                            } else {
                                if (mob.id != 0) {
                                    mob.addCharId(this.id);
                                }
                            }
                            zone.sendAttackMob(mob.idEntity, mob.hp - dameHit, isCrit);
                            zone.getService().updateHPMob(mob.idEntity, mob.hpFull, mob.hp, (byte) mob.levelBoss);
                            zone.setSkillPaint_1(mob, this, skill.id);
                            return;
                        }
                    }
                    mob.addHp(-dameHit);
                    if (mob.hp < 0) {
                        mob.hp = 0;
                        if (mob.id == 239 || mob.id == 213 || mob.id == 154 || mob.id == 221) {
                            mob.hp = mob.hpFull;
                        }

                    }
                    if (mob.id == 239) {
                        addHp(-(hp / 5));
                    }
                    int nextHP = mob.hp;
                    int hp = preHP - nextHP;
                    if (mob.hp <= 0) {
                        mob.die();
                    }
                    if (hp > 0 && mob.id != 154 && !mob.isDead) {
                        if (VDTTUtlis.nextInt(10) < 3) {
                            float percent = (float) hp / (mob.hpFull * (mob.levelBoss == 1 ? 40
                                    : mob.levelBoss == 2 ? 200 : mob.levelBoss == 10 ? 100 : 1)) * 100;
                            int kiAdd = (int) (mob.kiNow * percent / 100);
                            kiAdd = Math.min(kiAdd, mob.kiNow);
                            mob.kiNow = Math.max(0, mob.kiNow - kiAdd);
                            kiAdd *= 2;
                            kiAdd += kiAdd * (increaseKI / 10) / 100;
                            byte isAddKi = (byte) Math.abs(mob.getTemplate().timeThuHoach - level());
                            if (isAddKi > 8 && !zone.map.isWorld() && mob.id != 273 && !zone.isWorld && !bossEvent(mob)
                                    && mob.id != 296 && !zone.map.isSaoDen() && mob.id != 134) { // không được nhận ki
                                service.notifyNoUpKi();
                            } else {
                                addEXP(kiAdd);
                                if (pet != null) {
                                    pet.addEXP(kiAdd);
                                }
                                if (this.getGroup() != null) {
                                    long expGroup = kiAdd / 5;
                                    List<Char> chars = this.getGroup().getCharsInZone(zone.map.id, zone.id);
                                    for (Char _char : chars) {
                                        if (_char != null && !_char.isCleaned && _char != this && !_char.isDead) {
                                            _char.addEXP(expGroup);
                                        }
                                    }
                                }
                            }
                        }

                    }
                    if (mob.isDead) {
                        mob.dead(this, false);
                    } else {
                        if (mob.id != 0) {
                            mob.addCharId(this.id);
                        }
                    }
                    zone.sendAttackMob(mob.idEntity, mob.hp, isCrit);
                    zone.setSkillPaint_1(mob, this, skill.id);
                }
            }
        } catch (Exception E) {
            E.printStackTrace();
        } finally {
            mob.lock.unlock();
            selectSkill = null;
            setAbility();
        }
    }

    public void addEXP(long ki) {
        try {
            if (ki < 0) {
                ki = 0;
            }
            Effect effect = em.findByID(42);
            if (effect != null) {
                ki += ki * effect.getParam() / 100;
            }
            if (zone.map.isTrainZone()) {
                ki *= 2;
            }
            ki *= Config.getInstance().getExpRate();
            if (!lockEXP) {
                exp += ki;
            }
            
            if (exp >= 200000000000l) {
                exp = 200000000000l;
            }
            KI += ki / 10;
            // getService().showKI();
            getService().showKI(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int level() {
        long var1 = this.exp;

        int var3;
        for (var3 = 0; var3 < DataCenter.gI().expTemp.length && var1 >= DataCenter.gI().expTemp[var3]; ++var3) {
            var1 -= DataCenter.gI().expTemp[var3];
        }

        return var3;
    }

    public synchronized void addSkill(Skill skill) {
        if (skill != null) {
            skills.add(skill);
            Collections.sort(skills, SkillFactory.a);
            service.updateSkill();
        }
    }

    public void useSkill(int indexSkill) {
        try {
    //        Log.debug("use skill: " + indexSkill);
            if (indexSkill < 0 || indexSkill >= skills.size()) {
                return;
            }
            Skill skill = skills.get(indexSkill);
     //       Log.debug("use skill: " + skill.id + " level: " + skill.level + " mp: " + skill.mpUsing);
            if (skill != null) {
                if (skill.isCoolDown()) {
                    getService().serverMessage("Kỹ năng đang hồi");
                    return;
                }
                if (mp < skill.mpUsing) {
                    getService().serverMessage("Không đủ MP");
                    return;
                }
                if (timeSkill.get(skill.id) != null) {
                    if (timeSkill.get(skill.id) > System.currentTimeMillis()) {
                        return;
                    }
                }
                timeSkill.put(skill.id, System.currentTimeMillis() + skill.coolDown);
                switch (skill.isSkillTemplate) {
                    case 3:
                    case 8:
                    case 15:
                    case 21:
                    case 24:
                    case 96:
                        ItemOption[] itemOptions = skill.getItemOption();
                        if (itemOptions != null && itemOptions.length > 2) {
                            int param = itemOptions[1].getParam();
                            Effect effect = new Effect(86 + skill.level, 90000 + (30000 * skill.level), param);
                            em.setEffect(effect);
                        }
                        break;
                    case 23:
                        itemOptions = skill.getItemOption();
                        addHp(maxHP * itemOptions[0].getParam() / 100);
                        if (getGroup() != null) {
                            List<Char> chars = getGroup().getCharsInZone(zone.map.id, zone.id);
                            if (chars != null && !chars.isEmpty()) {
                                for (Char _char : chars) {
                                    if (_char != null && !_char.isCleaned && _char != this && !_char.isDead) {
                                        _char.addHp(_char.maxHP * itemOptions[1].getParam() / 100);
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        itemOptions = skill.getItemOption();
                        if (itemOptions != null && itemOptions.length > 2) {
                            int time = itemOptions[2].getParam();
                            int param = itemOptions[0].getParam();
                            Effect effect = new Effect(85, time, param);
                            em.setEffect(effect);
                        }
                        break;
                    case 17:
                        itemOptions = skill.getItemOption();
                        if (itemOptions != null && itemOptions.length > 0) {
                            int param = itemOptions[0].getParam();
                            Effect effect = new Effect(113, 15000, param);
                            em.setEffect(effect);
                        }
                        break;
                    case 10:
                        itemOptions = skill.getItemOption();
                        if (itemOptions != null && itemOptions.length > 2) {
                            int time = itemOptions[2].getParam();
                            int param = itemOptions[0].getParam();
                            Effect effect = new Effect(111, time, param);
                            em.setEffect(effect);
                            addHp(-(itemOptions[1].getParam() * maxHP / 100));
                            if (hp <= 0) {
                                startDie();
                            }
                        }
                        break;
                    case 39:
                        Effect effect = new Effect(99, 60000, 0);
                        em.setEffect(effect);
                        break;
                    case 40:
                        effect = new Effect(100, 60000, 0);
                        em.setEffect(effect);
                        break;
                    case 41:
                        effect = new Effect(101, 60000, 0);
                        em.setEffect(effect);
                        break;
                    case 46:
                        effect = new Effect(106, 30000, 0);
                        em.setEffect(effect);
                        break;
                    case 47:
                        effect = new Effect(107, 30000, skill.getItemOption()[1].getParam());
                        em.setEffect(effect);
                        break;
                    case 48:
                        effect = new Effect(108, 5000, 0);
                        em.setEffect(effect);
                        break;
                    case 55:
                        effect = new Effect(102, 60000, skill.getItemOption()[1].getParam());
                        em.setEffect(effect);
                        break;
                    case 93:
                        effect = new Effect(171 + skill.level, 30000, 0);
                        em.setEffect(effect);
                        break;
                    case 69:
                        effect = new Effect(149, 130000, 6);
                        getEm().setEffect(effect);
                        break;
                    case 102:
                        effect = new Effect(209, skill.getItemOption()[4].getParam(), 0);
                        getEm().setEffect(effect);
                        break;
                    case 62:
                        itemOptions = skill.getItemOption();
                        if (itemOptions != null && itemOptions.length > 0) {
                            int time = itemOptions[0].getParam() * 1000;
                            if (skill.level == 2) {
                                effect = new Effect(189, time, 0);
                            } else {
                                effect = new Effect(136, time, 0);
                            }
                            em.setEffect(effect);
                        }
                        break;
                    case 82:
                        itemOptions = skill.getItemOption();
                        if (itemOptions != null && itemOptions.length > 1) {
                            int time = itemOptions[0].getParam();
                            int param = itemOptions[1].getParam() / 10;
                            effect = new Effect(59, time, param);
                            Effect effect1 = new Effect(60, time, param);
                            em.setEffect(effect);
                            em.setEffect(effect1);
                        }
                        break;
                    case 95:
                        effect = new Effect(205, 30000, 0);
                        em.setEffect(effect);
                        break;
                    case 109:
                        effect = new Effect(217, 30000, 0);
                        em.setEffect(effect);
                        break;
                    case 110:
                        effect = new Effect(218, 30000, 0);
                        em.setEffect(effect);
                        break;
                    case 111:
                        effect = new Effect(219, 30000, 0);
                        em.setEffect(effect);
                        break;
                    case 112:
                        effect = new Effect(220, 30000, 0);
                        em.setEffect(effect);
                        break;
                    case 113:
                        effect = new Effect(221, 30000, 0);
                        em.setEffect(effect);
                        break;
                    case 114:
                        effect = new Effect(222, 30000, 0);
                        em.setEffect(effect);
                        break;
                }
                addMp(-skill.mpUsing);
                skill.timeCoolDown = System.currentTimeMillis();
                setAbility();
                getService().updateHPFull();
                getService().updateMPFull();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateEveryHalfSecond() {
        try {
            int hpBuff = 0;
            int mpBuff = 0;
            try {
                hpBuff = IntStream.of(26, 136, 143, 200, 256, 295, 347).map(i -> options[i]).sum();
                mpBuff = IntStream.of(27, 137, 257, 286, 256, 296, 348, 402).map(i -> options[i]).sum();
            } catch (Exception e) {

            }

            if (em != null) {
                em.update();
                List<Effect> effects = em.filter(e -> {
                    int id = e.template.id;
                    int type = e.template.type;
                    if ((id >= 85 && id <= 130) || (id >= 172 && id <= 175)) {
                        return false;
                    }
                    return true;
                });
                if (!effects.isEmpty()) {
                    for (Effect eff : effects) {
                        if (eff.template.type == 0 || eff.template.id == 167) {
                            hpBuff += eff.getParam();
                            mpBuff += eff.getParam();
                        }
                    }
                }
                if (getEm().statusWithID(9)) {
                    addHp(-(maxHP / 100));
                }
            }
            if (hpBuff > 0 && !isDead) {
                addHp(hpBuff);
                getService().updateHP();
            }
            if (mpBuff > 0 && !isDead) {
                addMp(mpBuff);
                getService().updateMP();
            }
            if (pet != null && !pet.isDead) {
                int buffHpPet = 0;
                try {
                    buffHpPet = IntStream.of(26, 136, 143, 200, 256, 295, 347).map(i -> pet.options[i]).sum();
                } catch (Exception e) {
                }

                if (buffHpPet > 0) {
                    pet.addHp(buffHpPet);
                }
                if (mpBuff > 0) {
                    pet.addMp(mpBuff);
                }
            }
            if (timeUpgradeBean > 0 && timeUpgradeBean < System.currentTimeMillis()) {
                timeUpgradeBean = 0;
                levelBean++;
                getService().sendLevelBean();
            }
            if (haveOptions[476] && hp < (maxHP / 5) && timeHoiSuc < System.currentTimeMillis()) {
                timeHoiSuc = System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(3);
                addHp(maxHP);
            }
            if (isAuto) {
                if (pet != null && !pet.isDead) {
                    Mob mob = zone.findNearestMob(this.x, this.y);
                    if (mob != null) {
                        pet.attackMonster(mob);
                    }
                }
            }
            if (zone.map.isNamec() && lvPK > 0) {
                joinZone(86, 0, 0);
                serverDialog("Trên người có điểm pk nên bạn đã bị đá khỏi map");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Log.debug("update every half second");
    }

    public void updateEverySecond() {
        if (invite != null) {
            invite.update();
        }
    }

    public void updateEveryFiveSecond() {
        if (zone.map.isNgucTu()) {
            if (isDead) {
                wakeUpFromDead();
            }
            if (timeNgucTu < System.currentTimeMillis()) {
                joinZone(54, 0, 0);
            }
        }
        if (zone.map.isSaoDen()) {
            if (isDead) {
                wakeUpFromDead();
            }
        }
        if (zone.map.isVoDai() || zone.map.isGDSM()) {
            if (isDead) {
                if (MapManager.getInstance().VDSM != null && MapManager.getInstance().VDSM.round < 3) {
                    wakeUpFromDead();
                }
            }
        }
        // Log.debug("update every five second");
    }

    public void updateEveryMinute() {
        try {
            timeOnline += 60064;
            totalTimeOnline += 60000;
            if (timeZoom < System.currentTimeMillis() && zone.map.isTrainZone()) {
                World world = findWorld(World.TIME_ZOOM);
                if (world != null) {
                    removeWorld(World.TIME_ZOOM);
                }
                joinZone(56, 0, -1);
            }
            if (body[12] != null) {
                timeGiapLuyenTap += 60000;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int getNumBean() {
        int var0 = 5 + levelBean;
        int var1;
        if ((var1 = (int) ((System.currentTimeMillis() / 1000 - timeReciveBean) / 60)) > var0) {
            var1 = var0;
        }

        return var1;
    }

    public void useItem(Message ms) {
        lockItem.lock();
        try {
            if (isDead) {
                return;
            }
            if (trade != null) {
                warningTrade();
                return;
            }
            short indexUI = ms.reader().readShort();
            if (indexUI >= 0 && indexUI <= numberCellBag) {
                Item item = bag[indexUI];
                if (item != null && item.has()) {
           //         Log.debug("use item: " + item.id + " type: " + item.getTemplate().type);
                    if (this.level() < item.getTemplate().levelNeed) {
                        return;
                    }
                    if (item.isExpired()) {
                        removeItem(item.index, 1, true);
                        return;
                    }
                    if ((item.getTemplate().gioiTinh == 0 || item.getTemplate().gioiTinh == 1)
                            && item.getTemplate().gioiTinh != this.gender) {
                        return;
                    }
                    if (item.isTrangBi()) {
                        useEquipment(item);
                    } else if (item.template.type >= 17 && item.template.type <= 20) {
                        useItemMount(item);
                    } else if (item.getTemplate().type == 34) {
                        useItemTitle(item);
                    } else if (item.getTemplate().type == 99) {

                    } else if (item.getTemplate().type == 100) {
                        useItemType100(item);
                    } else if (item.isTauBay()) {
                        menuItem(item);
                    } else if (item.getTemplate().type == 24) {
                        useItemEffect(item);
                    } else if (item.getTemplate().type == 29) {
                        useItemType29(item);
                    } else if (item.getTemplate().type == 28) {
                        useItemType28(item);
                    } else if (item.getTemplate().type == 1) {
                        useItemType1(item);
                    } else if (item.getTemplate().type == 37) {
                        useItemTypeKichHoat(item);
                    } else if (item.getTemplate().type == 98) {
                        useItemType98(item);
                    }
                    if (item.id == 724) {
                        if (timeUseBean > System.currentTimeMillis()) {
                            return;
                        }
                        if (taskId == 0 && taskMain != null && taskMain.index == 2) {
                            updateTaskCount(1);
                        }
                        if (getEm().findByID(160) != null) {
                            serverDialog("Đang bị nội thương không thể sử dụng dậu");
                            return;
                        }
                        if (sys == 6) {
                            Skill skill = findSkillWithIdSkillTemplate((short) 100);
                            if (skill != null && !skill.isCoolDown() && skill.level > 0 && !getEm().statusWithID(206)) {
                                skill.timeCoolDown = System.currentTimeMillis();
                                int hpHoi = maxHP - hp;
                                int param = 1000 + (100 * skill.level) + hpHoi * 20 / 100;
                                ItemOption[] options = skill.getItemOption();
                                if (options != null) {
                                    Effect eff = new Effect(206, options[0].getParam(), param);
                                    getEm().setEffect(eff);
                                }
                            }
                        }
                        timeUseBean = System.currentTimeMillis() + 30000;
                        removeItem(item.index, 1, true);
                        addHp(maxHP);
                        addMp(maxMP);
                        if (pet != null && !pet.isDead && pet.typePet == 1) {
                            Skill skill = pet.findSkill((short) 100);
                            if (skill != null && !skill.isCoolDown() && skill.level > 0 && getEm().findByIDPet(206) == null) {
                                skill.timeCoolDown = System.currentTimeMillis();
                                int hpHoi = pet.maxHP - pet.hp;
                                int param = 1000 + (100 * skill.level) + hpHoi * 40 / 100;
                                ItemOption[] options = skill.getItemOption();
                                if (options != null) {
                                    Effect eff = new Effect(206, options[0].getParam(), param, true);
                                    getEm().setEffect(eff);
                                    pet.setAbility();
                                }
                            }
                            pet.addHp(pet.maxHP);
                            pet.addMp(pet.maxMP);
                            zone.getService().updatePet(id, (byte) 1, pet.hp, pet.maxHP, pet.mp, pet.maxMP);
                        }
                        getService().sendTimeItem((short) 142);
                    }
                    getService().updateIndexBag();
                } else {
                    Log.debug("item null");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lockItem.unlock();
        }
    }

    private void useItemMount(Item item) {
        int index = item.getTemplate().type - 17;
        int indexUI = item.index;
        if (mount[index] != null) {
            Item it = mount[index].clone();
            it.index = indexUI;
            it.isLock = true;
            item.isLock = true;
            mount[index] = item;
            bag[indexUI] = it;
        } else {
            item.setLock(true);
            mount[index] = item;
            bag[indexUI] = null;
        }
        getService().useItem(item);
        getService().sendInfoMount(this);
        setAbility();
        if (index == 0) {
            if (bag[indexUI] != null) {
                try {
                    for (int idSkill : bag[indexUI].skills) {
                        Skill skill = findSkillWithIdSkillTemplate((short) idSkill);
                        if (skill != null) {
                            skills.remove(skill);
                        }
                    }
                } catch (Exception e) {

                }
            }
            try {
                for (int idSkill : item.skills) {
                    if (findSkillWithIdSkillTemplate((short) idSkill) != null)
                        continue;
                    Skill skill = SkillFactory.getInstance().getSkill(idSkill, 1);
                    if (skill != null) {
                        addSkill(skill);
                    }
                }
            } catch (Exception e) {
                Log.error("use item mount: " + e.getMessage(), e);
            }
            getService().updateSkill();
            zone.getService().sendPet(this);
        }
    }

    private void useItemType98(Item item) {
        switch (item.id) {
            case 910:
                if (!item.isLock) {
                    return;
                }
                int price = item.getQuantity() / 70;
                if (item.getQuantity() % 70 != 0) {
                    price++;
                }
                if (price < 0) {
                    return;
                }
                if (zeni < price) {
                    serverMessage("Không đủ zeni");
                    return;
                }
                addZeni(-price, true);
                item.setLock(false);
                getService().useItem(item);
                break;
        }
    }

    private void useItemTypeKichHoat(Item item) {
        if (item.strOption == null || item.strOption.isEmpty()) {
            return;
        }

        int type = 0;
        if (item.id >= 1058 && item.id <= 1062) {
            type = 465;
        } else if (item.id >= 1063 && item.id <= 1067) {
            type = 466;
        } else if (item.id >= 1068 && item.id <= 1072) {
            type = 467;
        } else if (item.id >= 1073 && item.id <= 1077) {
            type = 468;
        }

        if (body[13] == null) {
            serverDialog("Không có trang bị kích hoạt trên người !!!");
            return;
        }

        ItemOption[] options = item.getItemOption();
        if (options != null && options.length > 0) {
            if (body[13].addPointTrangBiKichhoat(options[0], type)) {
                removeItem(item.index, 1, true);
                getService().updateItemBodyChange();
                zone.getService().updateItemBody(this);
                setAbility();
            } else {
                serverMessage("Điểm kích hoạt không phù hợp với trang bị hoặc đã max điểm");
            }
        }
        body[13].checkKichHoatSucManh();
        setAbility();
        getService().updateItemBodyChange();
        zone.getService().updateItemBody(this);
    }

    private void useItemType1(Item item) {
        try {
            switch (item.id) {
                case 799:
                    getService().showMenuItem(item.index, StringMenu.ONE_STAR, "");
                    break;
                case 800:
                    getService().showMenuItem(item.index, StringMenu.TWO_STAR, "");
                    break;
                case 801:
                    getService().showMenuItem(item.index, StringMenu.THREE_STAR, "");
                    break;
                case 802:
                    getService().showMenuItem(item.index, StringMenu.FOUR_STAR, "");
                    break;
                case 803:
                    getService().showMenuItem(item.index, StringMenu.FIVE_STAR, "");
                    break;
                case 804:
                    getService().showMenuItem(item.index, StringMenu.SIX_STAR, "");
                    break;
                case 805:
                    getService().showMenuItem(item.index, StringMenu.SEVEN_STAR, "");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void useItemType28(Item item) {
        try {
            switch (item.id) {
                case 185:
                    if (countTui1 >= 36) {
                        serverDialog("Đã tới giới hạn sử dụng túi");
                        return;
                    }
                    removeItem(item.index, 1, true);
                    countTui1++;
                    numberCellBag += 1;
                    updateAddSlotBag();
                    break;
                case 186:
                    if (countTui2 >= 18) {
                        serverDialog("Đã tới giới hạn sử dụng túi");
                        return;
                    }
                    removeItem(item.index, 1, true);
                    countTui2++;
                    numberCellBag += 2;
                    updateAddSlotBag();
                    break;
                case 187:
                    if (countTui3 >= 9) {
                        serverDialog("Đã tới giới hạn sử dụng túi");
                        return;
                    }
                    removeItem(item.index, 1, true);
                    countTui3++;
                    numberCellBag += 3;
                    updateAddSlotBag();
                    break;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateAddSlotBag() {
        Item[] item = new Item[numberCellBag];
        for (int i = 0; i < bag.length; i++) {
            item[i] = bag[i];
        }
        bag = item;
        getService().updateSlotBag();
        getService().updateIndexBag();
    }

    private void useItemType29(Item item) {
        try {
            // Map item ID to effect param (power level)
            int effectParam = switch (item.id) {
                case 159 -> 50;
                case 281 -> 75;
                case 347 -> 100;
                case 712 -> 200;
                default -> 0;
            };

            if (effectParam == 0) {
                return;
            }

            Effect currentEffect = em.findByID((byte) 42);
            long duration = TimeUnit.HOURS.toMillis(5);

            if (currentEffect != null) {
                // Check if trying to use weaker ginseng
                if (currentEffect.getParam() > effectParam) {
                    getService().serverMessage("Bạn đang sử dụng loại nhân sâm cao cấp hơn");
                    return;
                }

                // If new ginseng is stronger, replace effect
                if (currentEffect.getParam() < effectParam) {
                    em.removeEffect(currentEffect);
                    Effect newEffect = new Effect(42, duration, effectParam);
                    em.setEffect(newEffect);
                } else {
                    // Same strength, just extend duration
                    currentEffect.addTime(duration);
                    zone.getService().playerAddEffect(this, currentEffect);
                }
            } else {
                // No existing effect, create new one
                Effect newEffect = new Effect(42, duration, effectParam);
                em.setEffect(newEffect);
            }

            removeItem(item.index, 1, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void useItemEffect(Item item) {
        try {
            removeItem(item.index, 1, true);
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(item.getTemplate().detail);

            // Lưu các số tìm được vào mảng
            int[] numbers = new int[2];
            int index = 0;

            while (matcher.find()) {
                // Chuyển đổi chuỗi số thành số nguyên và lưu vào mảng
                numbers[index] = Integer.parseInt(matcher.group());
                index++;
            }
            int idEffect = EffectTemplateManager.getInstance().getList().stream()
                    .filter(e -> e != null && e.name.toLowerCase().equals(item.getTemplate().name.toLowerCase()))
                    .findFirst().get().id;
            long time = TimeUnit.MINUTES.toMillis(numbers[1]);
            Effect eff = em.findByID(idEffect);
            if (eff != null) {
                eff.addTime(time);
                zone.getService().playerAddEffect(this, eff);
            } else {
                Effect effect = new Effect(idEffect, time, numbers[0]);
                em.setEffect(effect);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void menuItem(Item item) {
        switch (item.id) {
            case 168:
                service.showMenuItem(item.index, StringMenu.ITEM_168, "");
                break;
            case 569:
            case 716:
            case 717:
            case 718:
            case 719:
            case 720:
                service.showMenuItem(item.index, StringMenu.MENU_TAU_VIP, "");
                break;
        }
    }

    private void useItemTitle(Item item) {
        try {
            removeItem(item.index, 1, true);
            DanhHieu dh = new DanhHieu();
            dh.title = item.getTemplate().name.split("Danh hiệu ")[1];
            dh.a();
            dh.time = (int) (item.getExpire() / 1000);
            danhHieu.add(dh);
            service.updateTitle();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reloadIndexItem() {
        for (int i = 0; i < bag.length; i++) {
            if (bag[i] != null) {
                bag[i].index = i;
            }
        }
        getService().updateIndexBag();
    }

    private void useEquipment(Item item) {
        try {
            byte indexUI = (byte) item.index;
            byte index = item.getTemplate().type;
            if (indexUI < 0) {
                reloadIndexItem();
                return;
            }
            if (index == 0) {
                if (timeUsePet > System.currentTimeMillis()) {
                    serverDialog("Có thể mặc sau " + (((timeUsePet - System.currentTimeMillis()) / 1000)) + " giây");
                    return;
                }
                timeUsePet = System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(5);
            }
            if (item.getTemplate().typeChar == sys || item.getTemplate().typeChar == 0) {
                if (item.getTemplate().type == 3 || item.getTemplate().type == 5 || item.getTemplate().type == 5
                        || item.getTemplate().type == 7) {
                    if (body[0] == null) {
                        getService().serverDialog("Không thể mặc đồ khi chưa có đệ tử");
                        return;
                    }
                }
                if (index == 13) {
                    if (item.strOption.isEmpty() || item.strOption == "") {
                        int idOption = VDTTUtlis.nextInt(469, 473);
                        String input = String.format("465,0,%d;467,0,%d;468,0,%d;466,0,%d", idOption, idOption,
                                idOption, idOption);
                        item.strOption = input;
                        getService().updateItem(item);
                    }
                }
                if (body[index] != null) {
                    Item it = body[index].clone();
                    it.index = indexUI;
                    it.isLock = true;
                    item.isLock = true;
                    body[index] = item;
                    bag[indexUI] = it;
                } else {
                    item.setLock(true);
                    body[index] = item;
                    bag[indexUI] = null;
                }
                if (index == 0) {
                    pet = new Pet(id, body[0], body, body2, getService(), getEm());
                    pet.player = this;
                    pet.zone = zone;
                    pet.setAbility();
                }
                if (item.getTemplate().type == 3 || item.getTemplate().type == 5 || item.getTemplate().type == 7
                        || item.getTemplate().type == 9 || item.getTemplate().type == 11) {
                    if (pet != null)
                        pet.setAbility();
                }
                if (item.getTemplate().type == 12) {
                    Effect eff = getEm().findByID(150);
                    if (eff != null) {
                        timeGiapLuyenTap = eff.getTimeRemaining();
                        getEm().removeEffect(eff);
                        zone.getService().playerRemoveEffect(this, eff);
                    }
                }
            } else {
                getService().serverMessage("Trang bị không phù hợp với nhân vật");
                return;
            }
         //   Log.debug("use equipment: " + item.id + " to body: " + index);
            getService().useItem(item);
            setAbility();
            if (item.getTemplate().type == 14) {
                if (options[327] > 0) {
                    reloadSkillCaiTrang();
                } else {
                    int indexSkillWithCT = findIndexSkillWithCT();
                    if (indexSkillWithCT != -1) {
                        skills.remove(indexSkillWithCT);
                        getService().updateSkill();
                    }

                }
            }
            getService().updateMPFull();
            getService().updateHPFull();
            getService().showInfo2(this);
            zone.getService().updateItemBody(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void reloadSkillCaiTrang() {
        Skill skill = SkillFactory.getInstance().getSkill(options[327], 1);
        if (skill != null) {
            int indexSkillWithCT = findIndexSkillWithCT();
            if (indexSkillWithCT != -1) {
                skills.remove(indexSkillWithCT);
            }
            addSkill(skill);
            getService().updateSkillCaiTrang();
            getService().updateSkill();
        }
    }

    private void applyEffect(int idEff, int itemId, long duration, int paramValue) {
        Effect buff = getEm().findByID(idEff);
        int index = getIndexItemByIdInBag(itemId);
        if (index == -1) {
            return;
        }
        if (buff != null) {
            if (buff.getParam() < paramValue) {
                getEm().removeEffect(buff);
                Effect effect = new Effect(idEff, TimeUnit.MINUTES.toMillis(duration), paramValue);
                getEm().setEffect(effect);
            } else if (buff.getParam() == paramValue) {
                buff.addTime(TimeUnit.MINUTES.toMillis(duration));
                zone.getService().playerAddEffect(this, buff);
            } else {
                getService().serverMessage("Bạn đang sử dụng thuốc cao cấp hơn");
                return;
            }
        } else {
            Effect effect = new Effect(idEff, TimeUnit.MINUTES.toMillis(duration), paramValue);
            getEm().setEffect(effect);
        }
        removeItem(index, 1, true);
        setAbility();
        getService().updateHPFull();
        getService().updateMPFull();
    }

    private void useItemType100(Item item) {
        try {
            if (item.isTauBay()) {
                menuItem(item);
                return;
            }
            if (Event.isEvent()) {
                Event.getEvent().useItem(this, item);
            }
            switch (item.id) {
                case 266:
                    if (lvPK == 0) {
                        serverDialog("Không thể sử dụng khi không có điểm pk");
                        return;
                    }
                    removeItem(item.index, 1, true);
                    lvPK = (byte) Math.max(0, lvPK - 5);
                    getService().serverMessage("Điểm pk hiên tại: " + lvPK);
                    break;
                case 1234:
                    Calendar calendar = Calendar.getInstance();
                    int hour = calendar.get(Calendar.HOUR_OF_DAY);
                    if (hour >= 10 && hour < 22) {
                        removeItem(item.index, 1, true);
                        joinZone(120, 0, 0);
                        if (lvPK > 0) {
                            joinZone(86, 0, 0);
                            serverDialog("Trên người có điểm pk không thể vào map");
                        }
                    } else {
                        serverDialog("Map chỉ mở cửa từ 10h - 22h");
                    }
                    break;
                case 1194:
                    if (mount[0] == null) {
                        serverDialog("Chưa có pet nên không thể sử dụng");
                        return;
                    }
                    Item it1 = mount[0];
                    if (it1.isMaxSucManh()) {
                        serverDialog("Đã max kinh nghiệm. Cần tiến hoá đơn để tăng cấp");
                        return;
                    }
                    it1.updateEXPPet(100);
                    removeItem(item.index, 1, true);
                    getService().sendInfoMount(this);
                    break;
                case 1195:
                    if (mount[0] == null) {
                        serverDialog("Chưa có pet nên không thể sử dụng");
                        return;
                    }
                    it1 = mount[0];
                    if (!it1.isMaxSucManh()) {
                        serverDialog("Chưa max kinh nghiệm. Không thể tiến hoá");
                        return;
                    }
                    if (it1.getUpgrade() == 16) {
                        serverDialog("Đã tới giới hạn tiến hoá");
                        return;
                    }
                    removeItem(item.index, 1, true);
                    it1.upgradeItem(it1.getUpgrade() + 1);
                    it1.resetEXPMount();
                    if (it1.getUpgrade() == 6 || it1.getUpgrade() == 12) {
                        it1.id = (short) (it1.id + 1);
                        it1.init();
                    }
                    getService().sendInfoMount(this);
                    break;
                case 1103:
                    Effect noel = getEm().findByID(178);
                    if (noel != null) {
                        if (noel.getTimeRemaining() >= TimeUnit.DAYS.toMillis(7)) {
                            serverDialog("Đã tới giới hạn sử dụng");
                            return;
                        }
                        noel.addTime(TimeUnit.DAYS.toMillis(1));
                        zone.getService().playerAddEffect(this, noel);
                    } else {
                        Effect effect = new Effect(178, TimeUnit.DAYS.toMillis(1), 0);
                        getEm().setEffect(effect);
                    }
                    removeItem(item.index, 1, true);
                    break;
                case 1104:
                    removeItem(item.index, 1, true);
                    Effect noel2 = getEm().findByID(194);
                    if (noel2 != null) {
                        noel2.addTime(TimeUnit.DAYS.toMillis(1));
                        zone.getService().playerAddEffect(this, noel2);
                    } else {
                        Effect effect = new Effect(194, TimeUnit.DAYS.toMillis(1), 50);
                        getEm().setEffect(effect);
                    }
                    break;
                case 1221:
                    removeItem(item.index, 1, true);
                    Effect flash = getEm().findByID(215);
                    if (flash != null) {
                        flash.addTime(TimeUnit.DAYS.toMillis(7));
                        zone.getService().playerAddEffect(this, flash);
                    } else {
                        Effect effect = new Effect(215, TimeUnit.DAYS.toMillis(7), 0);
                        getEm().setEffect(effect);
                    }
                    break;
                case 1223:
                    removeItem(item.index, 1, true);
                    Effect flash2 = getEm().findByID(216);
                    if (flash2 != null) {
                        flash2.addTime(TimeUnit.DAYS.toMillis(7));
                        zone.getService().playerAddEffect(this, flash2);
                    } else {
                        Effect effect = new Effect(216, TimeUnit.DAYS.toMillis(7), 0);
                        getEm().setEffect(effect);
                    }
                    break;
                case 1101:
                    if (getSlotNull() < 1) {
                        warningBagFull();
                        return;
                    }
                    removeItem(item.index, 1, true);
                    Item sach2 = new Item(435);
                    sach2.setLock(true);
                    addItemToBag(sach2);
                    getService().addItem(sach2);
                    break;
                case 1173:
                case 1190:
                case 1191:
                case 1192:
                case 1233:
                    if (mount[0] == null) {
                        serverMessage("Chưa có pet nên không thể sử dụng");
                        return;
                    }
                    Item pet1 = mount[0];
                    int skillId = item.getSkillByItem();
                    int skillIdPet = pet1.getSkillPet();
                    if (skillId == -1 || skillIdPet == -1) {
                        serverMessage("Kỹ năng không tồn tại");
                        return;
                    }
                    if (skillId != skillIdPet) {
                        serverMessage("Kỹ năng không phù hợp");
                        return;
                    }
                    if (pet1.isSkill(skillId)) {
                        serverMessage("Pet đã có skill này");
                        return;
                    }
                    removeItem(item.index, 1, true);
                    pet1.addSkill(skillId);
               //     Log.debug("add skill pet: " + skillId);
                    Skill skillPet = SkillFactory.getInstance().getSkill(skillId, 1);
                    if (skillPet != null) {
                        addSkill(skillPet);
                    }
                    getService().sendInfoMount(this);
                    serverDialog("Đã học kỹ năng");
                    break;
                case 1198:
                    if (getSlotNull() < 1) {
                        warningBagFull();
                        return;
                    }
                    removeItem(item.index, 1, true);
                    if (VDTTUtlis.nextInt(10) < 5) {
                        Item ga = new Item(1176);
                        ga.setLock(true);
                        addItemToBag(ga);
                        getService().addItem(ga);
                    } else {
                        Item ga = new Item(1181);
                        ga.setLock(true);
                        addItemToBag(ga);
                        getService().addItem(ga);
                    }
                    break;
                case 1197:
                    if (getSlotNull() < 1) {
                        warningBagFull();
                        return;
                    }
                    removeItem(item.index, 1, true);
                    Item tl = new Item(1187);
                    tl.setLock(true);
                    addItemToBag(tl);
                    getService().addItem(tl);
                    break;
                case 1150:
                    if (getSlotNull() < 1) {
                        warningBagFull();
                        return;
                    }
                    removeItem(item.index, 1, true);
                    Item item3 = RandomItem.TUI_MU_LON.next().clone();
                    item3.setLock(item.isLock());
                    addCoin(VDTTUtlis.nextInt(200000, 500000), true);
                    item3.initExpire();
                    addItemToBag(item3);
                    getService().addItem(item3);
                    if (itemIsAlert(item3.id)) {
                        GlobalService.getInstance().chat("Hệ thống", "Chúc mừng c#item" + name + "c#white đã nhận được " + item3.getTemplate().name + " từ Hộp mù lớn", (byte) 1);
                    }
                    break;
                case 1151:
                    if (getSlotNull() < 1) {
                        warningBagFull();
                        return;
                    }
                    removeItem(item.index, 1, true);
                    Item item2 = RandomItem.TUI_MU_NHO.next().clone();
                    item2.setLock(item.isLock());
                    addCoin(VDTTUtlis.nextInt(50000, 150000), true);
                    item2.initExpire();
                    addItemToBag(item2);
                    getService().addItem(item2);
                    if (itemIsAlert(item2.id)) {
                        GlobalService.getInstance().chat("Hệ thống", "Chúc mừng c#item" + name + "c#white đã nhận được " + item2.getTemplate().name + " từ Túi mù nhỏ", (byte) 1);
                    }
                    break;
                case 1078:
                    int countUse = ServerManager.countUseItemDT.merge(this.id, 1, Integer::sum);
                    if (countUse >= 5) {
                        serverDialog("Đã tới giới hạn sử dụng");
                        return;
                    }
                    removeItem(item.index, 1, true);
                    countDoanhTrai++;
                    serverMessage("Tăng thêm 1 lần doanh trại");
                    break;
                case 1107:
                    if (pet == null)
                        return;
                    removeItem(item.index, 1, true);
                    pet.resetKI();
                    pet.setAbility();
                    getService().updateItemBodyChange();
                    zone.getService().updateItemBody(this);
                    break;
                case 1217:
                    if (pet == null)
                        return;
                    removeItem(item.index, 1, true);
                    pet.resetKI();
                    pet.resetSkill();
                    pet.setAbility();
                    getService().updateItemBodyChange();
                    zone.getService().updateItemBody(this);
                    break;
                case 938:
                    if (body[10] == null) {
                        return;
                    }
                    if (!body[10].optionSucManh()) {
                        serverMessage("Chưa kích hoạt sức mạnh");
                        return;
                    }
                    if (body[10].isMaxSucManh()) {
                        serverMessage("Đã max sức mạnh");
                        return;
                    }
                    removeItem(item.index, 1, true);
                    body[10].updateSucManh(100);
                    getService().updateItemBodyChange();
                    zone.getService().updateItemBody(this);
                    break;
                case 358:
                    applyEffect(39, 358, 5, 3000);
                    break;
                case 359:
                    applyEffect(40, item.id, 5, 300);
                    break;
                case 360:
                    applyEffect(41, item.id, 5, 900);
                    break;
                case 701:
                    applyEffect(39, 701, 5, 4000);
                    break;
                case 702:
                    applyEffect(40, item.id, 5, 400);
                    break;
                case 703:
                    applyEffect(41, item.id, 5, 1200);
                    break;
                case 704:
                    applyEffect(39, 704, 5, 5000);
                    break;
                case 705:
                    applyEffect(40, item.id, 5, 500);
                    break;
                case 706:
                    applyEffect(41, item.id, 5, 1500);
                    break;
                case 437:
                    changeName();
                    break;
                case 937:
                    removeItem(item.index, 1, true);
                    totalTimeOnline = 0;
                    totalSQ = 0;
                    totalTL = 0;
                    totalTA = 0;
                    Reward rw2 = findReward(3);
                    if (rw2 != null) {
                        rw2.list.clear();
                    }
                    Reward rw = findReward(15);
                    if (rw != null) {
                        rw.list.clear();
                    }
                    Reward rw3 = findReward(16);
                    if (rw3 != null) {
                        rw3.list.clear();
                    }
                    Reward rw4 = findReward(17);
                    if (rw4 != null) {
                        rw4.list.clear();
                    }
                    serverDialog("Đã reset thành công");
                    break;
                case 434:
                    if (ballZ < 200000) {
                        serverMessage("Không đủ ballz");
                        return;
                    }
                    if (getSlotNull() == 0) {
                        warningBagFull();
                        return;
                    }
                    if (!removeItems(434, 1000)) {
                        serverMessage("Số lượng không đủ");
                        return;
                    }
                    addBallz(-200000, true);
                    Item sachcd = new Item(435);
                    sachcd.setLock(true);
                    addItemToBag(sachcd);
                    getService().addItem(sachcd);
                    break;
                case 942:
                    if (body[0] == null) {
                        return;
                    }
                    removeItem(item.index, 1, true);
                    body[0].addThoiTrangPet(idCharSys);
                    getService().updateItemBodyChange();
                    zone.getService().updateItemBody(this);
                    setAbility();
                    break;
                case 1102:
                    if (body[0] == null) {
                        return;
                    }
                    removeItem(item.index, 1, true);
                    body[0].addThoiTrangPetForEver(idCharSys);
                    getService().updateItemBodyChange();
                    zone.getService().updateItemBody(this);
                    setAbility();
                    break;
                case 1196:
                    if (item.getQuantity() < 1000) {
                        serverMessage("Số lượng không đủ");
                        return;
                    }
                    if (getSlotNull() == 0) {
                        warningBagFull();
                        return;
                    }
                    removeItem(item.index, 1000, true);
                    Item trungtuanloc = new Item(1197);
                    trungtuanloc.setLock(true);
                    addItemToBag(trungtuanloc);
                    getService().addItem(trungtuanloc);
                    break;
                case 1175:
                    if (item.getQuantity() < 1000) {
                        serverMessage("Số lượng không đủ");
                        return;
                    }
                    if (getSlotNull() == 0) {
                        warningBagFull();
                        return;
                    }
                    removeItem(item.index, 1000, true);
                    Item bardock = new Item(1141);
                    bardock.setLock(true);
                    bardock.strOption = "327,102,0;197,10;0,1000;64,500";
                    addItemToBag(bardock);
                    getService().addItem(bardock);
                    break;
                case 808:
                    service.showMenuItem(item.index, StringMenu.CAPSULE_PHI_THUYEN, "");
                    break;
                case 819:
                    if (countUseItemNgucTu >= 2) {
                        serverDialog("Đã tới giới hạn sử dụng");
                        return;
                    }
                    removeItem(item.index, 1, true);
                    countUseItemNgucTu++;
                    countNgucTu++;
                    serverMessage("Số lượt ngục tù còn lại là " + countNgucTu);
                    break;
                case 834:
                    if (countTheHell >= 2) {
                        serverDialog("Đã tới giới hạn sử dụng");
                        return;
                    }
                    removeItem(item.index, 1, true);
                    countTheHell++;
                    countHell++;
                    serverMessage("Số lượt địa ngục còn lại là " + countHell);
                    break;
                case 697:
                    if (getSlotNull() == 0) {
                        warningBagFull();
                        return;
                    }
                    removeItem(item.index, 1, true);
                    int[] percents = {40, 40, 19, 1};
                    byte[] types = {4, 5, 6, 7};
                    int index = VDTTUtlis.randomWithRate(percents, 100);
                    byte type = types[index];
                    Item da = new Item(type);
                    da.setLock(true);
                    addItemToBag(da);
                    getService().addItem(da);
                    break;
                case 839:
                    if (getSlotNull() == 0) {
                        warningBagFull();
                        return;
                    }
                    if (RuntimeServer.gI().timeStart > 0) {
                        getService().serverDialog("Rồng thần đang bận rồi ông cháu tý gọi lại sau nhé");
                        return;
                    }
                    for (int i = 1; i < 7; i++) {
                        index = getIndexItemByIdInBag(839 + i, true);
                        if (index == -1) {
                            serverDialog("Cần ngọc rồng " + (i + 1) + " sao");
                            return;
                        }
                    }
                    RuntimeServer.gI().uocRongALL(this, (byte) 1);
                    break;
                case 840:
                case 841:
                case 842:
                case 843:
                case 844:
                case 845:
                    break;
                case 1210:
                    if (getSlotNull() == 0) {
                        warningBagFull();
                        return;
                    }
                    if (RuntimeServer.gI().timeStart > 0) {
                        getService().serverDialog("Rồng thần đang bận rồi ông cháu tý gọi lại sau nhé");
                        return;
                    }
                    for (int i = 1; i < 7; i++) {
                        index = getIndexItemByIdInBag(1210 + i, true);
                        if (index == -1) {
                            serverDialog("Cần ngọc rồng noel " + (i + 1) + " sao");
                            return;
                        }
                    }
                    RuntimeServer.gI().uocRongALL(this, (byte) 3);
                    break;
                case 1211:
                case 1212:
                case 1213:
                case 1214:
                case 1215:
                case 1216:
                    break;
                case 901:
                    if (getSlotNull() == 0) {
                        warningBagFull();
                        return;
                    }
                    if (RuntimeServer.gI().timeStart > 0) {
                        getService().serverDialog("Rồng thần đang bận rồi ông cháu tý gọi lại sau nhé");
                        return;
                    }
                    for (int i = 1; i < 7; i++) {
                        index = getIndexItemByIdInBag(901 + i);
                        if (index == -1) {
                            serverDialog("Cần ngọc rồng namec " + (i + 1) + " sao");
                            return;
                        }
                    }
                    RuntimeServer.gI().uocRongALL(this, (byte) 4);
                    break;
                case 902:
                case 903:
                case 904:
                case 905:
                case 906:
                case 907:
                    break;
                case 917:
                    if (getSlotNull() == 0) {
                        warningBagFull();
                        return;
                    }
                    if (RuntimeServer.gI().timeStart > 0) {
                        getService().serverDialog("Rồng thần đang bận rồi ông cháu tý gọi lại sau nhé");
                        return;
                    }
                    for (int i = 1; i < 7; i++) {
                        index = getIndexItemByIdInBag(910 + i, true);
                        if (index == -1) {
                            serverDialog("Cần ngọc rồng đen" + (i + 1) + " sao");
                            return;
                        }
                    }
                    RuntimeServer.gI().uocRongALL(this, (byte) 2);
                    break;
                case 912:
                case 913:
                case 914:
                case 915:
                case 916:
                case 911:
                    break;
                case 997:
                    removeItem(item.index, 1, true);
                    int idEffect = 144;
                    long time = TimeUnit.MINUTES.toMillis(30);
                    Effect eff = em.findByID(idEffect);
                    if (eff != null) {
                        eff.addTime(time);
                        zone.getService().playerAddEffect(this, eff);
                    } else {
                        Effect effect = new Effect(idEffect, time, 0);
                        em.setEffect(effect);
                    }
                    break;
                case 895:
                    removeItem(item.index, 1, true);
                    idEffect = 142;
                    time = TimeUnit.HOURS.toMillis(5);
                    eff = em.findByID(idEffect);
                    if (eff != null) {
                        eff.addTime(time);
                        zone.getService().playerAddEffect(this, eff);
                    } else {
                        Effect effect = new Effect(idEffect, time, 80);
                        em.setEffect(effect);
                    }
                    break;
                case 234:
                    removeItem(item.index, 1, true);
                    idEffect = 167;
                    time = TimeUnit.MINUTES.toMillis(30);
                    eff = em.findByID(idEffect);
                    if (eff != null) {
                        eff.addTime(time);
                        zone.getService().playerAddEffect(this, eff);
                    } else {
                        Effect effect = new Effect(idEffect, time, 15);
                        em.setEffect(effect);
                    }
                    break;
                case 1086:
                    removeItem(item.index, 1, true);
                    idEffect = 185;
                    time = TimeUnit.DAYS.toMillis(15);
                    eff = em.findByID(idEffect);
                    if (eff != null) {
                        eff.addTime(time);
                        zone.getService().playerAddEffect(this, eff);
                    } else {
                        Effect effect = new Effect(idEffect, time, 15);
                        em.setEffect(effect);
                    }
                    break;
                case 1218:
                    removeItem(item.index, 1, true);
                    idEffect = 213;
                    time = TimeUnit.HOURS.toMillis(1);
                    eff = em.findByID(idEffect);
                    if (eff != null) {
                        eff.addTime(time);
                        zone.getService().playerAddEffect(this, eff);
                    } else {
                        Effect effect = new Effect(idEffect, time, 200);
                        em.setEffect(effect);
                    }
                    break;
                case 1227:
                case 1228:
                case 1229:
                case 1230:
                case 1231:
                case 1232:
                    if (mount[0] == null) {
                        serverMessage("Chưa có pet nên không thể sử dụng");
                        return;
                    }
                    pet1 = mount[0];
                    if (pet1.getUpgrade() < 6) {
                        serverMessage("Cần thú cưng 3 sao trở lên");
                        return;
                    }
                    if (pet1.skills.size() > 2) {
                        serverMessage("Pet đã học đủ kỹ năng");
                        return;
                    }
                    skillId = item.getSkillByItem();
                    skillIdPet = pet1.getSkillPet2();
                    if (skillId == -1 || skillIdPet == -1) {
                        serverMessage("Kỹ năng không tồn tại");
                        return;
                    }
                    if (skillId != skillIdPet) {
                        serverMessage("Kỹ năng không phù hợp");
                        return;
                    }
                    if (pet1.isSkill(skillId)) {
                        serverMessage("Pet đã có skill này");
                        return;
                    }
                    removeItem(item.index, 1, true);
                    pet1.addSkill(skillId);
              //      Log.debug("add skill pet: " + skillId);
                    skillPet = SkillFactory.getInstance().getSkill(skillId, 1);
                    if (skillPet != null) {
                        addSkill(skillPet);
                    }
                    getService().sendInfoMount(this);
                    serverDialog("Đã học kỹ năng");
                    break;
                case 428:
                    removeItem(item.index, 1, true);
                    Item phale = new Item(VDTTUtlis.nextInt(406, 413));
                    phale.setLock(true);
                    phale.setQuantity(20);
                    addItemToBag(phale);
                    getService().addItem(phale);
                    break;
                case 891:
                    removeItem(item.index, 1, true);
                    int itemid = 0;
                    switch (sys) {
                        case 1:
                            itemid = 871;
                            break;
                        case 2:
                            itemid = 872;
                            break;
                        case 3:
                            itemid = 873;
                            break;
                        case 4:
                            itemid = 874;
                            break;
                        case 5:
                            itemid = 1003;
                            break;
                        case 6:
                            itemid = 1111;
                            break;
                    }
                    Item detu = new Item(itemid);
                    detu.setLock(true);
                    Vector<ItemOption> options = new Vector<>();
                    options.add(new ItemOption(285, 100, 40));
                    options.add(new ItemOption(407, 0, 1));
                    options.add(new ItemOption(0, VDTTUtlis.nextInt(100, 400)));
                    options.add(new ItemOption(152, VDTTUtlis.nextInt(50, 200)));
                    options.add(new ItemOption(327, VDTTUtlis.nextInt(50, 52), 1));
                    options.add(new ItemOption(327, 53, 1));
                    options.add(new ItemOption(327, 54, 1));
                    options.add(new ItemOption(327, 30, 1));
                    options.add(new ItemOption(327, -1, -1));
                    options.add(new ItemOption(327, -1, -1));
                    options.add(new ItemOption(327, -1, -1));
                    options.add(new ItemOption(327, -1, -1));
                    options.add(new ItemOption(327, -1, -1));
                    options.add(new ItemOption(327, -1, -1));
                    options.add(new ItemOption(327, -1, -1));
                    options.add(new ItemOption(327, -1, -1));
                    options.add(new ItemOption(327, -1, -1));
                    options.add(new ItemOption(327, -1, -1));
                    detu.strOption = Item.creatOption(options);
                    addItemToBag(detu);
                    getService().addItem(detu);
                    break;
                case 908:
//                    if (!Event.isTrungThu()) {
//                        return;
//                    }
                    removeItem(item.index, 1, true);
                    idEffect = 147;
                    time = TimeUnit.MINUTES.toMillis(10);
                    eff = em.findByID(idEffect);
                    if (eff != null) {
                        eff.addTime(time);
                        zone.getService().playerAddEffect(this, eff);
                    } else {
                        Effect effect = new Effect(idEffect, time, 0);
                        em.setEffect(effect);
                    }
                    break;
                case 940:
//                    if (!Event.isTrungThu()) {
//                        return;
//                    }
                    removeItem(item.index, 1, true);
                    idEffect = 151;
                    time = TimeUnit.MINUTES.toMillis(10);
                    eff = em.findByID(idEffect);
                    if (eff != null) {
                        eff.addTime(time);
                        zone.getService().playerAddEffect(this, eff);
                    } else {
                        Effect effect = new Effect(idEffect, time, 0);
                        em.setEffect(effect);
                    }
                    break;
                case 799:
                    getService().showMenuItem(item.index, StringMenu.ONE_STAR, "");
                    break;
                case 800:
                    getService().showMenuItem(item.index, StringMenu.TWO_STAR, "");
                    break;
                case 801:
                    getService().showMenuItem(item.index, StringMenu.THREE_STAR, "");
                    break;
                case 802:
                    getService().showMenuItem(item.index, StringMenu.FOUR_STAR, "");
                    break;
                case 803:
                    getService().showMenuItem(item.index, StringMenu.FIVE_STAR, "");
                    break;
                case 804:
                    getService().showMenuItem(item.index, StringMenu.SIX_STAR, "");
                    break;
                case 805:
                    getService().showMenuItem(item.index, StringMenu.SEVEN_STAR, "");
                    break;
                case 833:
                    getService().showMenuItem(item.index, StringMenu.CAPSULE_TRANG, "");
                    break;
                case 1045:
                    if (getSlotNull() == 0) {
                        return;
                    }
                    if (RuntimeServer.gI().timeStart > 0) {
                        getService().serverDialog("Rồng thần đang bận rồi ông cháu tý gọi lại sau nhé");
                        return;
                    }
                    int nro2 = getIndexItemByIdInBag(1046, true);
                    if (nro2 == -1) {
                        getService().serverDialog("Cần ngọc rồng Cerealian 2 sao");
                        return;
                    }
                    RuntimeServer.gI().uocRongALL(this, (byte) 0);
                    break;
                case 1046:
                    break;
                case 301:
                    getService().openGUI(53);
                    break;
                case 164:
                    if (getSlotNull() < 1) {
                        warningBagFull();
                        return;
                    }
                    removeItem(item.index, 1, true);
                    if (countTuiDo < 5) {
                        countTuiDo++;
                        int[] itemId = new int[]{160, 163, 191};
                        int[] percent = new int[]{20, 70, 10};
                        int idItem = itemId[VDTTUtlis.randomWithRate(percent, 100)];
                        if (idItem == 160) {
                            int quantity = VDTTUtlis.nextInt(1, 100);
                            Item it = new Item(idItem);
                            it.setQuantity(quantity);
                            it.setLock(true);
                            addItemToBag(it);
                            getService().addItem(it);
                        } else if (idItem == 163) {
                            addCoin(VDTTUtlis.nextInt(10000, 500000), true);
                        } else if (idItem == 191) {
                            addBallz(VDTTUtlis.nextInt(100, 50000), true);
                        }
                    } else {
                        addBallz(50, true);
                    }
                    break;
                case 295:
                    if (getSlotNull() < 4) {
                        return;
                    }
                    removeItem(item.index, 1, true);
                    List<ItemTemplate> setTamThu = ItemManager.getInstance().createSet((sys == 6 ? 1 : 4), sys);
                    int id = setTamThu.get(VDTTUtlis.nextInt(0, setTamThu.size() - 1)).id;
                    Item it = new Item(id);
                    it.createOptionRandom(4, 7);
                    it.setQuantity(1);
                    it.setLock(true);
                    it.upgradeItem(6);
                    addItemToBag(it);
                    getService().addItem(it);
                    break;
                case 296:
                    if (getSlotNull() < 4) {
                        return;
                    }
                    removeItem(item.index, 1, true);
                    setTamThu = ItemManager.getInstance().createSet((sys == 6 ? 1 : 4), sys);
                    id = setTamThu.get(VDTTUtlis.nextInt(0, setTamThu.size() - 1)).id;
                    it = new Item(id);
                    it.createOptionRandom(4, 7);
                    it.setQuantity(1);
                    it.setLock(true);
                    it.upgradeItem(8);
                    addItemToBag(it);
                    getService().addItem(it);
                    break;
                case 297:
                    if (getSlotNull() < 4) {
                        return;
                    }
                    removeItem(item.index, 1, true);
                    setTamThu = ItemManager.getInstance().createSet((sys == 6 ? 1 : 4), sys);
                    id = setTamThu.get(VDTTUtlis.nextInt(0, setTamThu.size() - 1)).id;
                    it = new Item(id);
                    it.createOptionRandom(4, 7);
                    it.setQuantity(1);
                    it.setLock(true);
                    it.upgradeItem(10);
                    addItemToBag(it);
                    getService().addItem(it);
                    break;
                case 1142:
                    if (getSlotNull() < 4) {
                        return;
                    }
                    removeItem(item.index, 1, true);
                    setTamThu = ItemManager.getInstance().createSet((sys == 6 ? 1 : 4), sys);
                    id = setTamThu.get(VDTTUtlis.nextInt(0, setTamThu.size() - 1)).id;
                    it = new Item(id);
                    it.createOptionRandom(4, 7);
                    it.setQuantity(1);
                    it.setLock(true);
                    it.upgradeItem(12);
                    addItemToBag(it);
                    getService().addItem(it);
                    break;
                case 1100:
                    if (sachChienDau < 14) {
                        getService().serverMessage("Chưa đủ cấp để sử dụng");
                        return;
                    }
                    if (sachChienDau >= 15) {
                        return;
                    }
                    removeItem(item.index, 1, true);
                    sachChienDau++;
                    sach.upgradeItem(15);
                    sach.strOption += ";486,5,-1";
                    getService().sendSachChienDau();
                    setAbility();
                    getService().updateHPFull();
                    getService().updateMPFull();
                    break;
                case 817:
                    if (countQuaSinhLuc >= 10) {
                        return;
                    }
                    if (lockEXP) {
                        return;
                    }
                    removeItem(item.index, 1, true);
                    countQuaSinhLuc++;
                    long expAdd = DataCenter.gI().getLevel(level()) / 1000;
                    this.exp += expAdd;
                    this.KI += expAdd / 10;
                    getService().showKI();
                    getService().showKI(this);
                    break;
                case 813:
                case 814:
                case 815:
                case 816:
                    removeItem(item.index, 1, true);
                    pointKame += (item.id - 812);
                    serverMessage("Bạn nhận được " + (item.id - 812) + " điểm  Kame");
                    break;
                case 818:
                    removeItem(item.index, 1, true);
                    pointKame += 5;
                    serverMessage("Bạn nhận được 5 điểm  Kame");
                    break;
                case 170:
                    removeItem(item.index, 1, true);
                    List<Skill> skills1 = new ArrayList<>();
                    synchronized (skills) {
                        for (Skill skill : skills) {
                            if (skill.getSkillTemplate().i == 0) {
                                Skill skill1 = SkillFactory.getInstance().getSkill(skill.isSkillTemplate, 0);
                                if (skill.isSkillTemplate == 1 || skill.isSkillTemplate == 7
                                        || skill.isSkillTemplate == 13 || skill.isSkillTemplate == 19
                                        || skill.isSkillTemplate == 25 || skill.isSkillTemplate == 30) {
                                    skill1 = SkillFactory.getInstance().getSkill(skill.isSkillTemplate, 1);
                                }
                                skills1.add(skill1);
                            }
                        }
                    }
                    skills.clear();
                    skills.addAll(skills1);
                    KI = exp / 10;
                    service.updateSkill();
                    service.showKI();
                    break;
                case 1020:
                case 1021:
                case 1024:
                case 1023:
                case 1022:
                case 1122:
                case 1123:
                case 1124:
                case 1125:
                case 1126:
                case 1129:
                    String[] str = item.getTemplate().name.split("Kỹ năng ");
                    String kyNang = str[1];
                    id = SkillFactory.getInstance().getIdSkillByName(kyNang);
                    if (id != -1) {
                        Skill old = findSkillWithIdSkillTemplate((short) id);
                        if (old != null) {
                            if (old.level == 0) {
                                id = SkillFactory.getInstance().getIdSkillByName(kyNang, sys);
                                Skill skill = SkillFactory.getInstance().getSkill(id, 1);
                                removeItem(item.index, 1, true);
                                if (skill != null) {
                                    totalKiNang++;
                                    int indexSkill = this.skills.indexOf(old);
                                    this.skills.set(indexSkill, skill);
                                    service.showKI();
                                    service.updateSkill();
                                    setAbility();
                                    return;
                                }
                            } else {
                                serverDialog("Kỹ năng đã học");
                                return;
                            }
                        }

                    }
                    id = SkillFactory.getInstance().getIdSkillByName(kyNang, sys);
                    if (id != -1) {
                        Skill old = findSkillWithIdSkillTemplate((short) id);
                        if (old != null) {
                            serverDialog("Kỹ năng đã học");
                            return;
                        }
                        removeItem(item.index, 1, true);
                        Skill skill = SkillFactory.getInstance().getSkill(id, 1, sys);
                        addSkill(skill);
                        Collections.sort(skills, SkillFactory.a);
                        getService().updateSkill();
                        totalKiNang++;
                    }
                    break;
                case 1116:
                case 1117:
                case 1118:
                case 1119:
                case 1120:
                case 1121:
                case 728:
                case 729:
                case 735:
                case 730:
                case 736:
                case 731:
                case 737:
                case 732:
                case 1009:
                case 1010:
                case 1016:
                case 1011:
                case 1017:
                case 1012:
                case 1018:
                case 1013:
                case 750:
                case 751:
                case 757:
                case 752:
                case 758:
                case 753:
                case 759:
                case 754:
                case 739:
                case 740:
                case 746:
                case 741:
                case 747:
                case 742:
                case 748:
                case 743:
                case 761:
                case 762:
                case 768:
                case 763:
                case 769:
                case 764:
                case 770:
                case 765:
                    str = item.getTemplate().name.split("Kỹ năng ");
                    kyNang = str[1];
                    id = SkillFactory.getInstance().getIdSkillByName(kyNang);
                    if (id != -1) {
                        Skill old = findSkillWithIdSkillTemplate((short) id);
                        if (old != null) {
                            serverDialog("Kỹ năng đã học");
                            return;
                        }

                    }
                    removeItem(item.index, 1, true);
                    if (id != -1) {
                        Skill skill = SkillFactory.getInstance().getSkill(id, 0);
                        addSkill(skill);
                        Collections.sort(skills, SkillFactory.a);
                        getService().updateSkill();
                        totalKiNang++;
                    }
                    break;
                case 710:
                    if (timeTienIch == -1) {
                        serverMessage("Tiện ích đã được kích hoạt vĩnh viễn không cần kích hoạt thêm");
                        return;
                    }
                    removeItem(item.index, 1, true);
                    rank = 10;
                    if (timeTienIch < System.currentTimeMillis() / 1000) {
                        timeTienIch = (int) (System.currentTimeMillis() / 1000
                                + (int) (TimeUnit.DAYS.toMillis(7) / 1000));
                    } else
                        timeTienIch += (int) (TimeUnit.DAYS.toMillis(7) / 1000);
                    service.updateTienIch();
                    getService().serverMessage("Tiện ích đã được kích hoạt. Hạn sử dụng tới "
                            + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date((long) timeTienIch * 1000L)));
                    break;
                case 827:
                    removeItem(item.index, 1, true);
                    rank = 10;
                    timeTienIch = -1;
                    service.updateTienIch();
                    getService().serverMessage("Tiện ích đã được kích hoạt vĩnh viễn");
                    break;
                case 277:
                    if (getSlotNull() < 3) {
                        warningBagFull();
                        return;
                    }
                    removeItem(item.index, 1, true);
                    List<Item> items = new ArrayList<>();
                    for (int i = 0; i < 3; i++) {
                        Item item1 = new Item(4 + i);
                        item1.isLock = true;
                        addItemToBag(item1);
                        items.add(item1);
                        getService().addItem(item1);
                    }
                    break;
                case 161:
                    if (getSlotNull() < 1) {
                        warningBagFull();
                        return;
                    }
                    removeItem(item.index, 1, true);
                    Item diamond = new Item(160);
                    diamond.setQuantity(100);
                    diamond.isLock = true;
                    addItemToBag(diamond);
                    getService().addItem(diamond);
                    break;
                case 177:
                    if (getSlotNull() < 1) {
                        warningBagFull();
                        return;
                    }
                    removeItem(item.index, 1, true);
                    int percent = VDTTUtlis.nextInt(1, 1000);
                    if (percent <= 10) {
                        Item item1 = new Item(9);
                        item1.setLock(true);
                        addItemToBag(item1);
                        getService().addItem(item1);
                    } else if (percent <= 100) {
                        Item item1 = new Item(8);
                        item1.setLock(true);
                        addItemToBag(item1);
                        getService().addItem(item1);
                    } else {
                        Item item1 = new Item(7);
                        item1.setLock(true);
                        addItemToBag(item1);
                        getService().addItem(item1);
                    }
                    break;
                case 822:
                    removeItem(item.index, 1, true);
                    addCoin(500000, true);
                    break;
                case 771:
                case 781:
                case 786:
                case 776:
                case 1002:
                case 1110:
                    if (getSlotNull() < 4) {
                        warningBagFull();
                        return;
                    }
                    removeItem(item.index, 1, true);
                    if (taskId == 1 && taskMain != null && taskMain.index == 1) {
                        updateTaskCount(1);
                    }
                    setTamThu = ItemManager.getInstance().createSet(1, sys);
                    for (ItemTemplate itemTemplate : setTamThu) {
                        Item item1 = new Item(itemTemplate.id);
                        item1.createOptionRandom(4, 7);
                        item1.setQuantity(1);
                        item1.isLock = true;
                        addItemToBag(item1);
                        getService().addItem(item1);
                    }
                    break;
                case 824:
                    if (getSlotNull() < 4) {
                        warningBagFull();
                        return;
                    }
                    removeItem(item.index, 1, true);
                    if (taskId == 1 && taskMain != null && taskMain.index == 1) {
                        updateTaskCount(1);
                    }
                    setTamThu = ItemManager.getInstance().createSet(1, sys);
                    for (ItemTemplate itemTemplate : setTamThu) {
                        Item item1 = new Item(itemTemplate.id);
                        item1.strOption = "335,150;336,150;341,50;342,50;350,1;348,10;51,35;359,75;30,75;353,30";
                        // item1.createOptionRandom(0, 7);
                        item1.setQuantity(1);
                        item1.isLock = true;
                        addItemToBag(item1);
                        getService().addItem(item1);
                    }
                    break;
                case 435:
                    if (sachChienDau >= 14) {
                        return;
                    }
                    removeItem(item.index, 1, true);
                    sachChienDau++;
                    sach = new Item(435);
                    sach.strOption = "207,0,-1;208,0,-1";
                    sach.upgradeItem(sachChienDau);
                    getService().sendSachChienDau();
                    setAbility();
                    getService().updateHPFull();
                    getService().updateMPFull();
                    break;
                case 821:
                    removeItem(item.index, 1, true);
                    addBallz(50000, true);
                    break;
                case 1019:
                    removeItem(item.index, 1, true);
                    addZeni(10, true);
                    break;
                case 996:
                    if (maxBean > 54) {
                        return;
                    }
                    removeItem(item.index, 1, true);
                    maxBean++;
                    break;
                case 828:
                    service.showMenuItem(item.index, StringMenu.CAPSULE_PHI_THUYEN, "");
                    break;
                case 682:
                    if (getSlotNull() == 0) {
                        warningBagFull();
                        return;
                    }
                    removeItem(item.index, 1, true);
                    int rand = VDTTUtlis.nextInt(1, 1000);
                    int itemId = 0;
                    if (rand <= 25) {
                        itemId = 9;
                    } else {
                        itemId = 8;
                    }
                    Item item1 = new Item(itemId);
                    item1.setLock(true);
                    addItemToBag(item1);
                    getService().addItem(item1);
                    break;
                case 570:
                    Effect old = getEm().findByID(202);
                    if (old != null) {
                        long time6day = TimeUnit.DAYS.toMillis(6);
                        if (old.getTimeRemaining() > time6day) {
                            serverMessage("Không thể sử dụng thêm");
                            return;
                        }
                        removeItem(item.index, 1, true);
                        old.addTime(TimeUnit.DAYS.toMillis(1));
                        zone.getService().playerAddEffect(this, old);
                    } else {
                        Effect mu = new Effect(202, TimeUnit.DAYS.toMillis(1), 0);
                        getEm().setEffect(mu);
                        removeItem(item.index, 1, true);
                    }
                    break;
                case 1208:
                    if (mount[0] == null) {
                        serverDialog("Không tìm thấy thú cưng");
                        return;
                    }
                    it = mount[0];
                    int level = it.getUpgrade();
                    int numEXP = it.getEXP();
                    // Tính tổng EXP tích lũy qua các level
                    int totalEXP = numEXP;
                    for (int i = 0; i < level; i++) {
                        totalEXP += 10000 + (10000 * i);
                    }
                    if (totalEXP == 0) {
                        serverDialog("Thú chưa có exp không thể phục hồi");
                        return;
                    }
                    removeItem(item.index, 1, true);
                    // Reset level về 0
                    it.upgradeItem(0);
                    // Xử lý id thú cưng
                    if (level >= 6) {
                        it.id -= 1;
                    }
                    if (level >= 12) {
                        it.id -= 1;
                    }
                    // Tính số lượng đan hoàn trả (80%)
                    int quantity = (totalEXP / 100) * 80 / 100;
                    // Reset thú cưng
                    it.resetEXP();
                    it.init();
                    // Tạo và thêm đan vào túi
                    Item dan = new Item(1194);
                    dan.setLock(true);
                    dan.setQuantity(quantity);
                    addItemToBag(dan);
                    getService().addItem(dan);
                    serverDialog("Phục hồi thú cưng thành công");
                    getService().sendInfoMount(this);
                    zone.getService().sendPet(this);
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Item getItemInBag(int id) {
        for (Item item : bag) {
            if (item != null && item.id == id) {
                return item;
            }
        }
        return null;
    }

    public void itemBodyToBag(Message ms) {
        try {
            if (trade != null) {
                warningTrade();
                return;
            }
            byte indexUI = ms.reader().readByte();
            if (indexUI >= 17) {
                itemMountToBag(indexUI);
                return;
            }
            Item item = body[indexUI];
            if (item != null) {
                if (item.getTemplate().type == 0) {
                    if (body[3] != null || body[5] != null || body[7] != null || body[9] != null || body[11] != null) {
                        getService().serverDialog("Không thể tháo đệ tử khi đang mang trang bị");
                        return;
                    }
                }
                if (item.getTemplate().type == 3 || item.getTemplate().type == 5 || item.getTemplate().type == 5
                        || item.getTemplate().type == 7) {
                    if (pet != null) {
                        pet.setAbility();
                    }
                }
                for (int i = 0; i < numberCellBag; i++) {
                    if (bag[i] == null) {
                        item.setLock(true);
                        item.index = i;
                        bag[i] = item;
                        body[indexUI] = null;
                        getService().itemBodyToBag(indexUI, i);
                        if (item.isExpired()) {
                            removeItem(i, 1, true);
                        }
                        if (item.getTemplate().type == 14) {
                            int index = findIndexSkillWithCT();
                            if (index != -1) {
                                skills.remove(index);
                                getService().updateSkill();
                            }
                        }
                        if (item.getTemplate().type == 12) {
                            if (item.id == 345) {
                                Effect eff = new Effect(150, timeGiapLuyenTap, 0);
                                getEm().setEffect(eff);
                                timeGiapLuyenTap = 0;
                            } else if (item.id == 1090) {
                                Effect eff = new Effect(150, timeGiapLuyenTap, 1);
                                getEm().setEffect(eff);
                                timeGiapLuyenTap = 0;
                            }
                        }
                        setAbility();
                        getService().updateHP();
                        getService().updateMP();
                        zone.getService().updateItemBody(this);
                        if (item.getTemplate().type == 0) {
                            pet = null;
                        }
                        return;
                    }
                }
                warningBagFull();
                return;
            } else {
                Log.debug("item null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void itemMountToBag(byte indexUI) {
        try {
            Item item = mount[indexUI - 17];
            if (item != null) {
                if (item.template.type == 17) {
                    if (mount[1] != null || mount[2] != null || mount[3] != null) {
                        getService().serverDialog("Không thể tháo thú khi đang mang trang bị");
                        return;
                    }
                }
                for (int i = 0; i < numberCellBag; i++) {
                    if (bag[i] == null) {
                        item.setLock(true);
                        item.index = i;
                        bag[i] = item;
                        mount[indexUI - 17] = null;
                        getService().sendInfoMount(this);
                        if (item.isExpired()) {
                            removeItem(i, 1, true);
                        }
                        getService().updateIndexBag();
                        setAbility();
                        getService().updateMPFull();
                        getService().updateHPFull();
                        if (item.template.type == 17) {
                            for (int idSkill : item.skills) {
                                Skill skill = findSkillWithIdSkillTemplate((short) idSkill);
                                if (skill != null) {
                                    skills.remove(skill);
                                }
                            }
                            zone.getService().sendPet(this);
                        }
                        getService().updateSkill();
                        return;
                    }
                }
                warningBagFull();
                return;
            } else {
                Log.debug("item null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Item[] checkBag(int var1) {
        switch (var1) {
            case 0:
                return bag;
            case 1:
                return box;
            case 2:
                return body;
            case 3:
                return body2;
            case 4:
                return extend;
            case 5:
                return mount;
            default:
                return null;
        }
    }

    public void upgradeItem(Message ms) {
        lockItem.lock();
        try {
            if (trade != null) {
                warningTrade();
                return;
            }
            byte type = ms.reader().readByte();
            short equipIndex = ms.reader().readShort();
            int indexBua = ms.reader().readShort();
            byte size = ms.reader().readByte();
            Item item = checkBag(type)[equipIndex];
            if (item == null) {
                return;
            }
            if ((!item.isTypeClothe() && !item.isTypePet() && !item.isTypeWeapon())) {
                serverDialog("Vật phẩm không thể nâng cấp");
                return;
            }
            if (item.upgrade >= 15) {
                serverDialog("Trang bị đã đạt cấp tối đa");
                return;
            }
            int numberCrystal = 0;
            Vector<Item> crystals = new Vector<>();
            boolean[] list = new boolean[numberCellBag];
            while (ms.reader().available() > 0) {
                short index = ms.reader().readShort();
                if (index < 0 || index >= numberCellBag) {
                    continue;
                }
                if (!list[index]) {
                    list[index] = true;
                    if (bag[index] != null && (bag[index].id <= 11 || bag[index].template.type == 28)
                            && bag[index].getQuantity() == 1) {
                        numberCrystal++;
                        crystals.add(bag[index]);
                    }
                }

            }
            if (crystals.size() > 20) {
                return;
            }
            if (numberCrystal == 0) {
                serverDialog("Hãy chọn đá nâng cấp!");
                return;
            }
            long temp = 0;
            int percent = 0;
            int price = 0;
            for (int i = 0; i < crystals.size(); i++) {
                Item itm = crystals.get(i);
                if (itm != null && itm.template.type == 21) {
                    temp += DataCenter.gI().as[itm.id];
                }
            }
            if (item.isTypePet()) {
                price = (int) (DataCenter.gI().aq[item.upgrade + 1]);
                percent = (int) DataCenter.gI().av[item.upgrade + 1];
            }
            if (item.isTypeClothe()) {
                price = (int) (DataCenter.gI().ap[item.upgrade + 1]);
                percent = (int) DataCenter.gI().au[item.upgrade + 1];
            }
            if (item.isTypeWeapon()) {
                price = (int) (DataCenter.gI().ao[item.upgrade + 1]);
                percent = (int) DataCenter.gI().at[item.upgrade + 1];
            }
            percent = (int) (temp * 100 / percent);
            int maxPercent = item.getUpgrade() + 80;
            if (percent > maxPercent) {
                percent = maxPercent;
            }
            if (this.coin < price) {
                serverDialog("Không đủ xu");
                return;
            }

            boolean isBaoHiem = indexBua != -1;

            int rand = VDTTUtlis.nextInt(0, 100);
            boolean isUpgrade = false;
            if (isBaoHiem) {
                removeItem(indexBua, 1, true);
            }
            if (rand < percent) {
                if (taskId == 5 && taskMain != null && taskMain.index == 1) {
                    updateTaskCount(1);
                }
                addCoin(-price, true);
                removeByUpgrade(price, crystals);
                isUpgrade = true;
                item.isLock = true;
                item.upgradeItem(item.getUpgrade() + 1);
                if (item.getUpgrade() >= 10) {
                    int level = item.getUpgrade() % 2 == 0 ? item.getUpgrade() / 2 : item.getUpgrade() / 2 + 1;
                    GlobalService.getInstance()
                            .chat("Hệ thống",
                                    "Chiến binh c#item" + name + "c#white vừa ép sao thành công "
                                            + item.getTemplate().name + " lên " + level + " , thật khủng khiếp",
                                    (byte) 0);
                }
            } else {
                if (!isBaoHiem || (percent < maxPercent && isBaoHiem)) {
                    addCoin(-price, true);
                    removeByUpgrade(price, crystals);
                    if (item.getUpgrade() >= 10) {
                        int level = (item.getUpgrade() + 1) % 2 == 0 ? item.getUpgrade() / 2
                                : item.getUpgrade() / 2 + 1;
                        GlobalService.getInstance().chat("Hệ thống",
                                "Chiến binh c#item" + name + "c#white vừa nâng cấp thất bại " + item.getTemplate().name
                                        + " lên " + level + " , thật đen đủi mà còn không dùng bảo hiểm",
                                (byte) 0);
                    }
                }
                if (isBaoHiem) {
                    if (item.getUpgrade() >= 10) {
                        int level = (item.getUpgrade() + 1) % 2 == 0 ? item.getUpgrade() / 2
                                : item.getUpgrade() / 2 + 1;
                        GlobalService.getInstance().chat("Hệ thống",
                                "Chiến binh c#item" + name + "c#white vừa nâng cấp thất bại " + item.getTemplate().name
                                        + " lên " + level + " , thật may mắn là có dùng bảo hiểm",
                                (byte) 0);
                    }
                }
            }
            getService().upgrade(isUpgrade, isBaoHiem, crystals, item, (short) indexBua, type);
            getService().updateIndexBag();
        } catch (Exception ex) {
            Log.error("upgrade item err: " + ex.getMessage(), ex);
        } finally {
            lockItem.unlock();
        }

    }

    private void removeByUpgrade(int coin, Vector<Item> crystals) {
        for (int i = 0; i < crystals.size(); i++) {
            Item itm = crystals.get(i);
            if (itm != null && itm.template.type == 21) {
                removeItem(itm.index, itm.getQuantity(), false);
            }
        }
    }

    public void warningBagFull() {
        getService().warningMessage("Túi đồ đầy");
    }

    public void showKIChar(Message mss) {
        try {
            String name = mss.readUTF();
            if (this.name.contains(name)) {
                this.service.showKI(this);
            } else {
                Char pl = ServerManager.findCharByName(name);
                if (pl != null) {
                    this.service.showKI(pl);
                } else {
                    this.service.serverDialog("Không tìm thấy người chơi");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void changeZone(Message ms) {
        try {
            if (isDead) {
                serverMessage("Không thể chuyển khu vực khi chết");
                return;
            }
            if (timeChangeZone > System.currentTimeMillis()) {
                zone.join(this, 0);
                serverMessage("Chờ 10 giây sau mới chuyển khu vực");
                return;
            }
            timeChangeZone = System.currentTimeMillis() + 10000;
            byte zoneId = ms.reader().readByte();
            Map map = zone.map;
            List<Zone> zones = map.getZones();
//
            if (zone.map.isWorld() || zone.isWorld) {
                zone.join(this, -1);
                serverMessage("Không thể chuyển khu vực");
                return;
            }
            if (zoneId < 0 || zoneId >= zones.size()) {
                return;
            }
            if (zone.map.isSaoDen()) {
                SaoDen saoDen = MapManager.getInstance().saoDen;
                if (saoDen != null) {
                    if (zones.get(zoneId).getNumberChar() >= map.getMaxPlayer(zones.get(zoneId))) {
                        zone.join(this, -1);
                        getService().serverDialog("Khu vực đã đầy!");
                        return;
                    }
                    outZone();
                    saoDen.joinZone(this, zoneId);
                    if (zone.getLivingMonsters().size() == 0) {
                        setTypePk((byte) 3);
                    } else
                        setTypePk((byte) 0);
                    return;
                }
            }
            if (zones.get(zoneId).findBossInZone()) {
                if (clan == null || this.activated == 1) {
                    MapManager.getInstance().joinZone(this, 86, zoneId, 0);
                    service.serverMessage("Bạn phải tham gia vũ trụ hoặc MTV để tham gia tiêu diệt boss");
                    return;
                }
            }
            if (zones.get(zoneId).checkBossInZone()) {
                mapCaptcha = zone.map.id;
                zoneCaptcha = zoneId;
                zone.join(this, 0);
                getService().sendCaptcha();
                return;
            }
            if (zones.get(zoneId).getNumberChar() >= map.getMaxPlayer(zones.get(zoneId))) {
                zone.join(this, -1);
                getService().serverDialog("Khu vực đã đầy!");
                return;
            }
            if (map.isVoDai()) {
                VoDaiSucManh dauTruong = MapManager.getInstance().VDSM;
                if (dauTruong != null) {
                    if (dauTruong.round < 3) {
                        dauTruong.changeZone(this, zoneId);
                    } else {
                        if (deathMatch != null) {
                            zone.join(this, 0);
                        } else {
                            zone.joinNotChangeMap(this, 49);
                        }
                        getService().serverDialog("Đang diễn ra trận đấu không thể chuyển khu vực");
                        return;
                    }
                    return;
                }
            }
            if (map.isGDSM()) {
                GiaiDauSucManh gdsm = MapManager.getInstance().GDSM;
                if (gdsm != null) {
                    if (gdsm.round < 3) {
                        gdsm.changeZone(this, zoneId);
                    } else {
                        if (matchUp != null) {
                            zone.join(this, 0);
                        } else {
                            zone.joinNotChangeMap(this, 47);
                        }
                        getService().serverDialog("Đang diễn ra trận đấu không thể chuyển khu vực");
                        return;
                    }
                    return;
                }
            }
            outZone();
            joinZone(this.mapId, zoneId, -1);
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public void addClanPoint(int point) {
        if (this.clan != null) {
            Member mem = this.clan.getMemberByName(this.name);
            if (mem != null) {
                mem.addPointClanWeek(point);
                mem.addPointClan(point);
                this.clan.addExp(point);
                this.serverMessage("Bạn nhận được " + point + " điểm cống hiến vũ trụ.");
            }
        }
    }

    public void loadDisplay() {
        try {
            PreparedStatement ps = DbManager.getInstance().getConnection(DbManager.LOAD_CHAR).prepareStatement(
                    "SELECT `players`.`id`,`players`.`name`, `players`.`gender`, `players`.`class`, `players`.`last_logout_time`, `players`.`body`, `players`.`online`,`data` FROM `players` WHERE `players`.`user_id` = ? AND `server_id` = ?");
            ps.setInt(1, user.id);
            ps.setInt(2, Config.getInstance().getServerID());
            ResultSet rs = ps.executeQuery();
            try {
                if (rs.next()) {
                    loadDisplay(rs);
                }
            } finally {
                rs.close();
                ps.close();
            }
        } catch (Exception ex) {
            Log.error("load display err: " + ex.getMessage(), ex);
        }
    }

    public void loadDisplay(ResultSet rs) {
        try {
            this.id = rs.getInt("id");
            this.name = rs.getString("name");
            this.online = rs.getBoolean("online");
            gender = rs.getByte("gender");
            idCharSys = rs.getByte("class");
            sys = (byte) (idCharSys + 1);
            body = new Item[16];
            JSONArray jArr = (JSONArray) JSONValue.parse(rs.getString("body"));
            if (jArr != null) {
                int len = jArr.size();
                for (int i = 0; i < len; i++) {
                    JSONObject obj = (JSONObject) jArr.get(i);
                    Item item = new Item(obj);
                    item.index = item.getTemplate().type;
                    body[item.index] = item;
                }
            }
            JSONObject json = (JSONObject) JSONValue.parse(rs.getString("data"));
            ParseData parse = new ParseData(json);
            exp = parse.getLong("exp");
        } catch (SQLException ex) {
            Log.error("load display err: " + ex.getMessage(), ex);
        }
    }

    public void warningTrade() {
        getService().serverMessage("Không thể thực hiện khi đang giao dịch.");
        getService().tradeCancel();
        cleanTrade();
    }

    public void close() {
        try {
            if (isLoadFinish()) {
                if (VDTT.isStop) {
                    if (zone.map.isNgucTu()) {
                        countNgucTu += 1;
                    }
                    if (zone.map.isHell()) {
                        countHell += 1;
                    }
                }
                if (trade != null) {
                    trade.closeUITrade();
                }
                // if (arenaT != null) {
                // arenaT.setWin(false);
                // }
                if (worlds != null) {
                    synchronized (worlds) {
                        worlds.forEach((t) -> {
                            if (!t.isClosed()) {
                                t.removeMember(this);
                            }
                        });
                    }
                }
                if (this.group != null) {
                    outParty();
                }
                if (zone != null) {
                    if (zone.map.isSaoDen()) {
                        checkSaoDen();
                    }
                }
                // if (zone.tilemap.isDauTruong()) {
                // TalentShow tls = MapManager.getInstance().talentShow;
                // tls.removePlayer(this);
                // }
            }
            if (this.clan != null) {
                Member mem = this.clan.getMemberByName(name);
                if (mem != null) {
                    mem.setOnline(false);
                    mem.setChar(null);
                }
                // clan.getClanService().requestClanMember();
            }

            try {

            } catch (Exception e) {
                Log.error(e.getMessage(), e);
            }
        } catch (Exception e) {
            Log.error("err: " + e.getMessage(), e);
        }
    }

    public void cleanTrade() {
        this.trade = null;
        this.myTrade = null;
        this.partnerTrade = null;
    }

    public void cleanUp() {
        this.isCleaned = true;
        this.friends = null;
    }

    public void saveData() {
        if (isLoadFinish() && !saving) {
            try {
                saving = true;
                this.lastLogoutTime = System.currentTimeMillis();
                JSONArray bags = new JSONArray();
                for (int i = 0; i < this.numberCellBag; i++) {
                    try {
                        if (this.bag[i] != null) {
                            bags.add(this.bag[i].toJSONObject());

                        }
                    } catch (Exception e) {
                    }
                }
                JSONArray mounts = new JSONArray();
                for (int i = 0; i < this.mount.length; i++) {
                    try {
                        if (this.mount[i] != null) {
                            mounts.add(this.mount[i].toJSONObject());
                        }
                    } catch (Exception e) {

                    }
                }
                JSONArray boxs = new JSONArray();
                for (int i = 0; i < this.numberCellBox; i++) {
                    try {
                        if (this.box[i] != null) {
                            this.box[i].index = i;
                            boxs.add(this.box[i].toJSONObject());
                        }
                    } catch (Exception e) {
                    }
                }
                JSONArray body = new JSONArray();
                for (int i = 0; i < 16; i++) {
                    try {
                        if (this.body[i] != null) {
                            body.add(this.body[i].toJSONObject());
                        }
                    } catch (Exception e) {
                    }
                }
                JSONArray body2 = new JSONArray();
                for (int i = 0; i < 16; i++) {
                    try {
                        if (this.body2[i] != null) {
                            body2.add(this.body2[i].toJSONObject());
                        }
                    } catch (Exception e) {
                    }
                }
                JSONArray skill = new JSONArray();
                if (this.skills != null) {
                    try {
                        for (Skill s : this.skills) {
                            skill.add(s.toJSONObject());
                        }
                    } catch (Exception e) {
                    }
                }
                JSONArray friends = new JSONArray();
                if (this.friends != null) {
                    Friend[] fr = getFriends();
                    for (Friend friend : fr) {
                        friends.add(friend.toJSONObject());
                    }
                }
                JSONArray title = new JSONArray();
                JSONArray effects = em.toJSONArray();
                JSONArray mail = mailManager.toJson();
                if (this.danhHieu != null) {
                    try {
                        for (DanhHieu danhHieu : this.danhHieu) {
                            if (danhHieu != null) {
                                title.add(danhHieu.toJSONObject());
                            }
                        }
                    } catch (Exception e) {

                    }
                }
                JSONArray rewards = new JSONArray();
                for (Reward rw : this.rewardList) {
                    rewards.add(rw.toJson());
                }
                JSONObject data = new JSONObject();
                data.put("exp", this.exp);
                data.put("pointPhamChat", this.pointPhamChat);
                data.put("pointEnthusiastic", this.pointEnthusiastic);
                data.put("pointEnthusiasticWeek", this.pointEnthusiasticWeek);
                data.put("pointUpgrageStar", this.pointUpgrageStar);
                data.put("pointUpgrageStarWeek", this.pointUpgrageStarWeek);
                data.put("pointKame", this.pointKame);
                data.put("pointSuper", this.pointSuper);
                data.put("lvPK", this.lvPK);
                data.put("speed", this.speed);
                data.put("levelBean", this.levelBean);
                data.put("timeReciveBean", this.timeReciveBean);
                data.put("zeniLock", this.zeniLock);
                data.put("sachChienDau", this.sachChienDau);
                data.put("timeTienIch", this.timeTienIch);
                data.put("rank", this.rank);
                data.put("nhanMocNap", this.nhanMocNap);
                data.put("mocNap", this.mocNap);
                data.put("timeUpgradeBean", this.timeUpgradeBean);
                data.put("totalTimeOnline", this.totalTimeOnline);
                data.put("timeOnline", this.timeOnline);
                data.put("totalKiNang", this.totalKiNang);
                data.put("maxBean", this.maxBean);
                data.put("totalTA", this.totalTA);
                data.put("totalTL", this.totalTL);
                data.put("totalSQ", this.totalSQ);
                data.put("ngayOnline", this.ngayOnline);
                data.put("napNgay", this.napNgay);
                data.put("packOnline", this.packOnline);
                data.put("packTinhAnh", this.packTinhAnh);
                data.put("packThuLinh", this.packThuLinh);
                data.put("packSieuQuai", this.packSieuQuai);
                data.put("countVongQuay", this.countVongQuay);
                data.put("countTui1", this.countTui1);
                data.put("countTui2", this.countTui2);
                data.put("countTui3", this.countTui3);
                data.put("timeZoom", this.timeZoom);
                data.put("countQuaSinhLuc", this.countQuaSinhLuc);
                data.put("taskPet", this.taskPet);
                data.put("pointHell", this.pointHell);
                data.put("increaseExtra", this.increaseExtra);
                data.put("lockEXP", this.lockEXP);
                data.put("countTuiDo", this.countTuiDo);
                data.put("countHell", this.countHell);
                data.put("countTheHell", this.countTheHell);
                data.put("timeGiapLuyenTap", this.timeGiapLuyenTap);
                data.put("countTaskQuyLao", this.countTaskQuyLao);
                data.put("countNgucTu", this.countNgucTu);
                data.put("countUseItemNgucTu", this.countUseItemNgucTu);
                data.put("timeChangeCaiTrang", this.timeChangeCaiTrang);
                data.put("moc1", this.moc1);
                data.put("moc2", this.moc2);
                data.put("moc3", this.moc3);
                data.put("moc4", this.moc4);
                data.put("moc5", this.moc5);
                data.put("moc6", this.moc6);
                data.put("isMoc1", this.isMoc1);
                data.put("isMoc2", this.isMoc2);
                data.put("isMoc3", this.isMoc3);
                data.put("isMoc4", this.isMoc4);
                data.put("isMoc5", this.isMoc5);
                data.put("isMoc6", this.isMoc6);
                data.put("isMoc7", this.isMoc7);
                data.put("idDoanhTrai", this.idDoanhTrai);
                data.put("countDoanhTrai", this.countDoanhTrai);
                data.put("countJoinNgucTu2", this.countJoinNgucTu2);
                data.put("vnd", this.vnd);
                TaskOrder task1 = this.taskOrders;
                if (task1 != null) {
                    JSONObject obj = new JSONObject();
                    obj.put("taskId", task1.taskId);
                    obj.put("count", task1.count);
                    obj.put("maxCount", task1.maxCount);
                    obj.put("killId", task1.killId);
                    obj.put("mapId", task1.mapId);
                    obj.put("failed", task1.failed);
                    data.put("taskOrder", obj);
                }
                if (itemQuaySo != null) {
                    JSONObject obj = new JSONObject();
                    obj.put("id", itemQuaySo.getId());
                    obj.put("quantity", itemQuaySo.getQuantity());
                    obj.put("iditem", itemQuaySo.getIdItem());
                    obj.put("type", itemQuaySo.getType());
                    data.put("itemQuaySo", obj);
                }
                if (sach != null) {
                    data.put("sach", sach.toJSONObject());
                }
                data.put("archievement", this.archievement.toJson());
                data.put("isClearCT", this.resetRewarNap);
                data.put("timeOutClan", this.timeOutClan);
                JSONArray map = new JSONArray();
                map.add(this.mapId);
                map.add(this.x);
                map.add(this.y);
                String task = "";
                if (this.taskMain != null) {
                    JSONObject t = new JSONObject();
                    t.put("id", this.taskMain.taskId);
                    t.put("index", this.taskMain.index);
                    t.put("count", this.taskMain.count);
                    task = t.toJSONString();
                }
                String jBag = bags.toJSONString();
                String jBox = boxs.toJSONString();
                String jBody = body.toJSONString();
                String jBody2 = body2.toJSONString();
                String jSkill = skill.toJSONString();
                String jTitle = title.toJSONString();
                String jData = data.toJSONString();
                String jMap = map.toJSONString();
                Connection conn = DbManager.getInstance().getConnection(DbManager.SAVE_DATA);
                PreparedStatement stmt = conn.prepareStatement(
                        "UPDATE `players` SET `zeni` = ?,`ballz` = ?,`coin` = ?,`kimCuong` = ?,`KI` = ?,`numberCellBag` = ?,`numberCellBox` = ?, `data` = ?, `bag` = ?, `box` = ?, `body` = ?, `body2` = ?, `skill` = ?, `title` = ?, `map` = ?,`effect` = ?,`mail` = ?,`rewards` = ?,`task` = ?,`taskId` = ?,`friends` = ?,`online` = ?, `last_logout_time` = ?, `mount` = ?, `activated` = ? WHERE `id` = ?;");
                try {
                    stmt.setLong(1, this.zeni);
                    stmt.setInt(2, this.ballZ);
                    stmt.setInt(3, this.coin);
                    stmt.setInt(4, this.kimCuong);
                    stmt.setLong(5, this.KI);
                    stmt.setShort(6, this.numberCellBag);
                    stmt.setShort(7, this.numberCellBox);
                    stmt.setString(8, jData);
                    stmt.setString(9, jBag);
                    stmt.setString(10, jBox);
                    stmt.setString(11, jBody);
                    stmt.setString(12, jBody2);
                    stmt.setString(13, jSkill);
                    stmt.setString(14, jTitle);
                    stmt.setString(15, jMap);
                    stmt.setString(16, effects.toJSONString());
                    stmt.setString(17, mail.toJSONString());
                    stmt.setString(18, rewards.toJSONString());
                    stmt.setString(19, task);
                    stmt.setShort(20, this.taskId);
                    stmt.setString(21, friends.toJSONString());
                    stmt.setInt(22, 0);
                    stmt.setLong(23, this.lastLogoutTime);
                    stmt.setString(24, mounts.toJSONString());
                    stmt.setByte(25, this.activated);
                    stmt.setInt(26, this.id);
                    stmt.executeUpdate();
                } finally {
                    stmt.close();
                }
                if (Event.getEvent() != null) {
                    updateEventPoint();
                }
                Log.debug("save data " + this.name + " time: " + this.lastLogoutTime);
            } catch (Exception e) {
                Log.error("saveData charName: " + this.name + " ex: " + e.getMessage(), e);
            } finally {
                saving = false;
            }
        }
    }

    public boolean load() {
        String query = "SELECT * FROM `players` WHERE `user_id` = ? AND `server_id` = ?;";
        try {
            Connection conn = DbManager.getInstance().login();
            try (PreparedStatement stmt = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY)) {
                stmt.setInt(1, user.id);
                stmt.setInt(2, Config.getInstance().getServerID());
                try (ResultSet data = stmt.executeQuery()) {
                    if (!data.next()) {
                        return false;
                    }
                    this.id = data.getInt("id");
                    this.name = data.getString("name");
                    gender = data.getByte("gender");
                    idCharSys = data.getByte("class");
                    sys = (byte) (idCharSys + 1);
                    ballZ = data.getInt("ballz");
                    zeni = data.getInt("zeni");
                    coin = data.getInt("coin");
                    if (ballZ < 0) {
                        ballZ = 0;
                    }
                    kimCuong = data.getInt("kimcuong");
                    numberCellBag = data.getShort("numberCellBag");
                    numberCellBox = data.getShort("numberCellBox");
                    KI = data.getLong("KI");
                    bag = new Item[numberCellBag];
                    activated = data.getByte("activated");
                    int clan = data.getInt("clan");
                    if (clan != 0) {
                        Optional<Clan> g = Clan.getClanDAO().get(clan);
                        if (g != null && g.isPresent()) {
                            this.clan = g.get();
                            Member mem = this.clan.getMemberByName(this.name);
                            if (mem == null) {
                                this.clan = null;
                            }
                        }
                        if (this.activated == 1 && this.clan != null) {
                            Member mem = this.clan.getMemberByName(this.name);
                            if (mem != null) {
                                this.timeOutClan = System.currentTimeMillis() + TimeUnit.HOURS.toMillis(24);
                                this.clan.memberDAO.delete(mem);
                                this.clan = null;
                            }
                        }
                    }

                    JSONArray jArr = (JSONArray) JSONValue.parse(data.getString("bag"));
                    int len = 0;
                    if (jArr != null) {
                        len = jArr.size();
                        for (int i = 0; i < len; i++) {
                            JSONObject obj = (JSONObject) jArr.get(i);
                            Item item = new Item(obj);
                            item.index = i;
                            if (item.isBug) {
                                DbManager.getInstance().banuntil_account(user.username, 9999);
                                user.session.closeMessage();
                            }
                            bag[i] = item;
                        }
                    }
                    box = new Item[numberCellBox];
                    try {
                        jArr = (JSONArray) JSONValue.parse(data.getString("box"));
                        if (jArr != null) {
                            len = jArr.size();
                            for (int i = 0; i < len; i++) {
                                JSONObject obj = (JSONObject) jArr.get(i);
                                Item item = new Item(obj);
                                item.index = i;
                                if (item.isBug) {
                                    DbManager.getInstance().banuntil_account(user.username, 9999);
                                    user.session.closeMessage();
                                }
                                box[i] = item;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    body = new Item[16];
                    jArr = (JSONArray) JSONValue.parse(data.getString("body"));
                    if (jArr != null) {
                        len = jArr.size();
                        for (int i = 0; i < len; i++) {
                            JSONObject obj = (JSONObject) jArr.get(i);
                            Item item = new Item(obj);
                            item.index = item.getTemplate().type;
                            body[item.index] = item;
                        }
                    }
                    body2 = new Item[16];
                    jArr = (JSONArray) JSONValue.parse(data.getString("body2"));
                    if (jArr != null) {
                        len = jArr.size();
                        for (int i = 0; i < len; i++) {
                            JSONObject obj = (JSONObject) jArr.get(i);
                            Item item = new Item(obj);
                            item.index = item.getTemplate().type;
                            body2[item.index] = item;
                        }
                    }
                    mount = new Item[4];
                    if (data.getString("mount") != null) {
                        jArr = (JSONArray) JSONValue.parse(data.getString("mount"));
                        if (jArr != null) {
                            len = jArr.size();
                            for (int i = 0; i < len; i++) {
                                JSONObject obj = (JSONObject) jArr.get(i);
                                Item item = new Item(obj);
                                item.index = item.getTemplate().type - 17;
                                mount[item.index] = item;
                            }
                        }
                    }
                    JSONArray effects = (JSONArray) JSONValue.parse(data.getString("effect"));
                    int size2 = effects.size();
                    for (int i = 0; i < size2; i++) {
                        try {
                            JSONObject obj = (JSONObject) effects.get(i);
                            int id = Integer.parseInt(obj.get("id").toString());
                            int param = Integer.parseInt(obj.get("param").toString());
                            long startAt = 0;
                            long endAt = 0;
                            long timeLength = 0;
                            if (obj.containsKey("timeStart")) {
                                int timeStart = Integer.parseInt(obj.get("timeStart").toString());
                                int timeLength2 = Integer.parseInt(obj.get("timeLength").toString());
                                startAt = System.currentTimeMillis();
                                endAt = startAt + ((timeLength2 - timeStart) * 1000);

                            } else {
                                timeLength = Long.parseLong(obj.get("time_length").toString());

                                startAt = Long.parseLong(obj.get("start_at").toString());
                                endAt = Long.parseLong(obj.get("end_at").toString());

                                long timeRemaining = timeLength;
                                endAt = System.currentTimeMillis() + timeRemaining;
                                startAt = System.currentTimeMillis();
                            }
                            if (System.currentTimeMillis() < endAt) {
                                Effect effect = getEm().findByID(id);
                                if (effect != null) {
                                    continue;
                                }
                                Effect eff = new Effect(id, startAt, endAt, param);
                                em.effect(eff, true);
                                em.add(eff);
                            }
                        } catch (Exception e) {
                            Log.error("err: " + e.getMessage(), e);
                        }
                    }
                    JSONArray friends = (JSONArray) JSONValue.parse(data.getString("friends"));
                    int size = friends.size();
                    this.friends = new HashMap<>();
                    for (int i = 0; i < size; i++) {
                        Friend fr = new Friend((JSONObject) friends.get(i));
                        this.friends.put(fr.name, fr);
                    }
                    JSONArray mail = (JSONArray) JSONValue.parse(data.getString("mail"));
                    if (mail != null) {
                        size2 = mail.size();
                        for (int i = 0; i < size2; i++) {
                            try {
                                JSONObject obj = (JSONObject) mail.get(i);
                                Mail mail1 = new Mail(obj);
                                if (mail1.time > (System.currentTimeMillis() / 1000)) {
                                    mailManager.add(mail1);
                                }
                            } catch (Exception e) {
                                Log.error("err: " + e.getMessage(), e);
                            }
                        }
                    }
                    skills = new Vector();
                    jArr = (JSONArray) JSONValue.parse(data.getString("skill"));
                    List<Integer> ids = new ArrayList<>();
                    if (jArr != null) {
                        len = jArr.size();
                        for (int i = 0; i < len; i++) {
                            JSONObject obj = (JSONObject) jArr.get(i);
                            int skillId = Integer.parseInt(obj.get("id").toString());
                            if (ids.contains(skillId))
                                continue;
                            ids.add(skillId);
                            int level = Integer.parseInt(obj.get("level").toString());
                            Skill skill = SkillFactory.getInstance().getSkillById(skillId, level);
                            if (skill.isSkillTemplate == 1 || skill.isSkillTemplate == 7 || skill.isSkillTemplate == 13
                                    || skill.isSkillTemplate == 19 || skill.isSkillTemplate == 25 || skill.isSkillTemplate == 97) {
                                skill = SkillFactory.getInstance().getSkill(skill.isSkillTemplate, 1);
                            }
                            skills.add(skill);
                        }
                        if (skills.size() == 0) {
                            skills = SkillFactory.getInstance().getSkillByClass(sys);
                        }
                    }
                    jArr = (JSONArray) JSONValue.parse(data.getString("rewards"));
                    if (jArr != null) {
                        len = jArr.size();
                        for (int i = 0; i < len; i++) {
                            JSONObject obj = (JSONObject) jArr.get(i);
                            Reward rw = new Reward();
                            rw.fromJson(obj);
                            if (rw != null) {
                                rewardList.add(rw);
                            }
                        }

                    }
                    JSONObject json = (JSONObject) JSONValue.parse(data.getString("data"));
                    ParseData parse = new ParseData(json);
                    exp = parse.getLong("exp");
                    pointPhamChat = parse.getInt("pointPhamChat");
                    pointEnthusiastic = parse.getInt("pointEnthusiastic");
                    pointEnthusiasticWeek = parse.getInt("pointEnthusiasticWeek");
                    pointUpgrageStar = parse.getInt("pointUpgrageStar");
                    pointUpgrageStarWeek = parse.getInt("pointUpgrageStarWeek");
                    pointKame = parse.getInt("pointKame");
                    pointSuper = parse.getInt("pointSuper");
                    if (parse.containsKey("lvPK")) {
                        lvPK = (byte) parse.getInt("lvPK");
                    }
                    if (parse.containsKey("speed")) {
                        speed = (short) parse.getInt("speed");
                    }
                    if (parse.containsKey("levelBean")) {
                        levelBean = (byte) parse.getInt("levelBean");
                    }
                    if (parse.containsKey("timeReciveBean")) {
                        timeReciveBean = parse.getInt("timeReciveBean");
                    }
                    if (parse.containsKey("zeniLock")) {
                        zeniLock = parse.getInt("zeniLock");
                    }
                    if (parse.containsKey("sachChienDau")) {
                        sachChienDau = parse.getByte("sachChienDau");
                    }
                    if (parse.containsKey("timeTienIch")) {
                        timeTienIch = parse.getInt("timeTienIch");
                    }
                    if (parse.containsKey("rank")) {
                        rank = parse.getByte("rank");
                        if (timeTienIch >= 0 && (long) ((long) timeTienIch * 1000) < System.currentTimeMillis()) {
                            rank = 0;
                        }
                    }
                    if (parse.containsKey("nhanMocNap")) {
                        nhanMocNap = parse.getByte("nhanMocNap");
                    }
                    if (parse.containsKey("mocNap")) {
                        mocNap = parse.getInt("mocNap");
                    }
                    if (parse.containsKey("timeUpgradeBean")) {
                        timeUpgradeBean = parse.getLong("timeUpgradeBean");
                    }
                    if (parse.containsKey("totalTimeOnline")) {
                        totalTimeOnline = parse.getLong("totalTimeOnline");
                    }
                    if (parse.containsKey("timeOnline")) {
                        timeOnline = parse.getInt("timeOnline");
                    }
                    if (parse.containsKey("totalKiNang")) {
                        totalKiNang = parse.getByte("totalKiNang");
                    }
                    if (parse.containsKey("maxBean")) {
                        maxBean = parse.getByte("maxBean");
                    }
                    if (parse.containsKey("totalTA")) {
                        totalTA = parse.getShort("totalTA");
                    }
                    if (parse.containsKey("totalTL")) {
                        totalTL = parse.getShort("totalTL");
                    }
                    if (parse.containsKey("totalSQ")) {
                        totalSQ = parse.getShort("totalSQ");
                    }
                    if (parse.containsKey("ngayOnline")) {
                        ngayOnline = parse.getByte("ngayOnline");
                    }
                    if (parse.containsKey("napNgay")) {
                        napNgay = parse.getInt("napNgay");
                    }
                    if (parse.containsKey("packOnline")) {
                        packOnline = parse.getBoolean("packOnline");
                    }
                    if (parse.containsKey("packTinhAnh")) {
                        packTinhAnh = parse.getBoolean("packTinhAnh");
                    }
                    if (parse.containsKey("packThuLinh")) {
                        packThuLinh = parse.getBoolean("packThuLinh");
                    }
                    if (parse.containsKey("packSieuQuai")) {
                        packSieuQuai = parse.getBoolean("packSieuQuai");
                    }
                    if (parse.containsKey("countVongQuay")) {
                        countVongQuay = parse.getShort("countVongQuay");
                    }
                    if (parse.containsKey("countTui1")) {
                        countTui1 = parse.getByte("countTui1");
                    }
                    if (parse.containsKey("countTui2")) {
                        countTui2 = parse.getByte("countTui2");
                    }
                    if (parse.containsKey("countTui3")) {
                        countTui3 = parse.getByte("countTui3");
                    }
                    if (parse.containsKey("timeZoom")) {
                        timeZoom = parse.getLong("timeZoom");
                    }
                    if (parse.containsKey("countQuaSinhLuc")) {
                        countQuaSinhLuc = parse.getShort("countQuaSinhLuc");
                    }
                    if (parse.containsKey("sach")) {
                        JSONObject obj = (JSONObject) JSONValue.parse(parse.getString("sach"));
                        sach = new Item(obj);
                    }
                    if (parse.containsKey("timeOutClan")) {
                        this.timeOutClan = parse.getLong("timeOutClan");
                    }
                    if (parse.containsKey("taskPet")) {
                        taskPet = parse.getBoolean("taskPet");
                    }
                    if (parse.containsKey("pointHell")) {
                        pointHell = parse.getInt("pointHell");
                    }
                    if (parse.containsKey("increaseExtra")) {
                        increaseExtra = parse.getShort("increaseExtra");
                    }
                    if (parse.containsKey("lockEXP")) {
                        lockEXP = parse.getBoolean("lockEXP");
                    }
                    if (parse.containsKey("countTuiDo")) {
                        countTuiDo = parse.getByte("countTuiDo");
                    }
                    if (parse.containsKey("countHell")) {
                        countHell = parse.getByte("countHell");
                    }
                    if (parse.containsKey("countTheHell")) {
                        countTheHell = parse.getByte("countTheHell");
                    }
                    if (parse.containsKey("timeGiapLuyenTap")) {
                        timeGiapLuyenTap = parse.getLong("timeGiapLuyenTap");
                    }
                    if (parse.containsKey("countTaskQuyLao")) {
                        countTaskQuyLao = parse.getByte("countTaskQuyLao");
                    }
                    if (parse.containsKey("countNgucTu")) {
                        countNgucTu = parse.getByte("countNgucTu");
                    }
                    if (parse.containsKey("countUseItemNgucTu")) {
                        countUseItemNgucTu = parse.getByte("countUseItemNgucTu");
                    }
                    if (parse.containsKey("timeChangeCaiTrang")) {
                        timeChangeCaiTrang = parse.getInt("timeChangeCaiTrang");
                    }
                    if (parse.containsKey("moc1")) {
                        moc1 = parse.getBoolean("moc1");
                    }
                    if (parse.containsKey("moc2")) {
                        moc2 = parse.getBoolean("moc2");
                    }
                    if (parse.containsKey("moc3")) {
                        moc3 = parse.getBoolean("moc3");
                    }
                    if (parse.containsKey("moc4")) {
                        moc4 = parse.getBoolean("moc4");
                    }
                    if (parse.containsKey("moc5")) {
                        moc5 = parse.getBoolean("moc5");
                    }
                    if (parse.containsKey("moc6")) {
                        moc6 = parse.getBoolean("moc6");
                    }
                    if (parse.containsKey("isMoc1")) {
                        isMoc1 = parse.getBoolean("isMoc1");
                    }
                    if (parse.containsKey("isMoc2")) {
                        isMoc2 = parse.getBoolean("isMoc2");
                    }
                    if (parse.containsKey("isMoc3")) {
                        isMoc3 = parse.getBoolean("isMoc3");
                    }
                    if (parse.containsKey("isMoc4")) {
                        isMoc4 = parse.getBoolean("isMoc4");
                    }
                    if (parse.containsKey("isMoc5")) {
                        isMoc5 = parse.getBoolean("isMoc5");
                    }
                    if (parse.containsKey("isMoc6")) {
                        isMoc6 = parse.getBoolean("isMoc6");
                    }
                    if (parse.containsKey("isMoc7")) {
                        isMoc7 = parse.getBoolean("isMoc7");
                    }
                    if (parse.containsKey("archievement")) {
                        this.archievement = new Archievement(parse.getParseData("archievement"));
                    }
                    if (parse.containsKey("idDoanhTrai")) {
                        this.idDoanhTrai = parse.getInt("idDoanhTrai");
                    }
                    if (parse.containsKey("countDoanhTrai")) {
                        this.countDoanhTrai = parse.getByte("countDoanhTrai");
                    }
                    if (parse.containsKey("countJoinNgucTu2")) {
                        this.countJoinNgucTu2 = parse.getByte("countJoinNgucTu2");
                    }
                    if (parse.containsKey("vnd")) {
                        this.vnd = parse.getInt("vnd");
                        if (Config.getInstance().getServerID() == 1 && this.vnd == 0) {
                            this.vnd = user.vnd;
                        }
                    }
                    if (parse.containsKey("taskOrder")) {
                        ParseData task = parse.getParseData("taskOrder");
                        if (task != null)
                            this.taskOrders = new TaskOrder(this, task.getByte("taskId"), task.getInt("count"),
                                    task.getInt("maxCount"), task.getInt("killId"), task.getInt("mapId"),
                                    task.getBoolean("failed"));

                    }
                    if (parse.containsKey("isClearCT"))
                        this.resetRewarNap = parse.getBoolean("isClearCT");
                    if (parse.containsKey("itemQuaySo")) {
                        JSONObject obj = (JSONObject) JSONValue.parse(parse.getString("itemQuaySo"));
                        int id = Integer.parseInt(obj.get("id").toString());
                        int quantity = Integer.parseInt(obj.get("quantity").toString());
                        int iditem = Integer.parseInt(obj.get("iditem").toString());
                        byte type = Byte.parseByte(obj.get("type").toString());
                        itemQuaySo = ItemQuaySo.builder().id(id).quantity(quantity).idItem(iditem).type(type).build();
                    }
                    jArr = (JSONArray) JSONValue.parse(data.getString("title"));
                    if (jArr != null) {
                        len = jArr.size();
                        danhHieu = new ArrayList<>();
                        for (int i = 0; i < len; i++) {
                            JSONObject obj = (JSONObject) jArr.get(i);
                            DanhHieu dh = new DanhHieu(obj);
                            if (dh.time != -1 && dh.time < (System.currentTimeMillis() / 1000)) {
                                continue;
                            }
                            danhHieu.add(dh);
                        }
                    }
                    taskId = data.getShort("taskId");
                    String tt = data.getString("task");
                    if (tt != null && !tt.equals("")) {
                        ParseData pd = new ParseData((JSONObject) JSONValue.parse(tt));
                        short taskID = pd.getShort("id");
                        byte taskIndex = pd.getByte("index");
                        short taskCount = pd.getShort("count");
                        TaskTemplate task = Task.getTaskTemplate(taskID);
                        if (task != null) {
                            taskMain = TaskFactory.getInstance().createTask(taskID, taskIndex, taskCount);
                        }
                    }
                    if (taskMain == null && taskId == 0) {
                        taskMain = TaskFactory.getInstance().createTask((short) 0, (byte) 0, (short) 0);
                    }
                    Timestamp timestamp = data.getTimestamp("created_at");
                    LocalDateTime dateTime = null;
                    if (timestamp != null) {
                        dateTime = timestamp.toLocalDateTime();
                        LocalDateTime targetDate = LocalDateTime.of(2024, 12, 15, 20, 0, 0);
                        boolean isAfter = dateTime.isAfter(targetDate);
                        if (isAfter) {
                            isNewBie = true;
                        }
                    }
                    long lastLoginTime = data.getLong("last_login_time");
                    Date now = new Date();
                    Date date = VDTTUtlis.getDate(lastLoginTime);
                    boolean isNewDay = !DateUtils.isSameDay(date, now);
                    if (isNewDay) {
                        resetNewDay();
                    }
                    jArr = (JSONArray) JSONValue.parse(data.getString("map"));
                    if (jArr != null) {
                        mapId = ((Long) jArr.get(0)).shortValue();
                        x = ((Long) jArr.get(1)).shortValue();
                        y = ((Long) jArr.get(2)).shortValue();
                    }
                    setAbilityStrategy(new AbilityFromEquip());
                    if (Event.getEvent() != null) {
                        loadEventPoint();
                    }
                } catch (Exception e) {
                    Log.error("load data char: " + e.getMessage(), e);
                    return false;
                }
            } catch (Exception e) {
                Log.error("load char: " + e.getMessage(), e);
                return false;
            } finally {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public void resetNewDay() {
        this.taskOrders = null;
        this.countTaskQuyLao = 60;
        this.countNgucTu = 2;
        this.countUseItemNgucTu = 0;
        this.timeOnline = 0;
        this.ngayOnline++;
        this.napNgay = 0;
        this.countDoanhTrai = 2;
        this.countQuaSinhLuc = 0;
        this.countTuiDo = 0;
        this.countHell = 1;
        this.countTheHell = 0;
        this.countJoinNgucTu2 = 2;
        if (this.ngayOnline > 7) {
            this.ngayOnline = 1;
            Reward rw = findReward(1);
            if (rw != null) {
                rw.list.clear();
            }
        }
        Reward rw2 = findReward(5);
        if (rw2 != null) {
            rw2.list.clear();
        }
        Reward rw = findReward(0);
        if (rw != null) {
            rw.list.clear();
        }
    }

    public void menu(Message ms) {
        try {
            short npcTemplateId = ms.reader().readShort();
            byte menuId = ms.reader().readByte();
            byte optionId = 0;
            int npcId = 0;
            if (ms.reader().available() > 0)
                optionId = ms.reader().readByte();
            if (npcTemplateId != 0) {
                Npc npc = zone.getNpc(npcTemplateId);
                if (npc == null) {
                    service.serverDialog("Không tìm thấy NPC này");
                    return;
                }
                npcId = npc.id;
            } else {
                if (menus.isEmpty()) {
                    return;
                }
            }

            Menu menuNew = null;
            if (menus.isEmpty()) {
                initMenu(npcId, npcTemplateId);
            }
            if (menus.size() > 0 && menuId < menus.size()) {
                menuNew = menus.get(menuId);
                menus.clear();
            }
            if (menuNew != null) {
                menu(menuNew, npcTemplateId);
            }
     //       Log.debug("menu: " + npcTemplateId + " menuId: " + menuId + " optionId: " + optionId);
        } catch (Exception e) {
            Log.error("err: " + e.getMessage(), e);
        }
    }

    private void menu(Menu menu, int npc) {
        switch (menu.getId()) {
            case CMDMenu.EXECUTE:
                menu.confirm();
                break;
        }
    }

    public void openMenu(Message ms) {
        try {
            if (trade != null) {
                warningTrade();
                return;
            }
            short npcId = ms.reader().readShort();
            Npc npc = zone.getNpc(npcId);
            if (npc == null) {
                service.serverDialog("Không tìm thấy NPC này");
                return;
            }
            initMenu(npc.id, npcId);
            if (menus.size() > 0) {
                getService().openUIMenu(npcId);
            } else {
                getService().menu(npcId);
            }
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    private void initMenu(int npcTemplateId, int identifer) {
        try {
            menus.clear();
         //   Log.debug("init menu: " + npcTemplateId);
            if (npcTemplateId == getTaskNpcId()) {
                if (taskMain == null) {
                    menus.add(new Menu(CMDMenu.EXECUTE, "Nhận nhiệm vụ", () -> {
                        takingTask();
                    }));
                    return;
                }
                if ((taskId == 6 && taskMain.index == 0)
                        || (taskId == 7 && taskMain.index == 0)
                        || (taskId == 8 && (taskMain.index == 0 || taskMain.index == 1))
                        || (taskId == 10 && taskMain.index == 0)
                        || (taskId == 19 && taskMain.index == 0)
                        || (taskId == 25 && taskMain.index == 0)
                        || (taskId == 31 && taskMain.index == 0)
                        || (taskId == 37 && taskMain.index == 0)) {
                    menus.add(new Menu(CMDMenu.EXECUTE, "Nói chuyện", () -> {
                        getService().sendTaskStep(0);
                    }));
                    return;
                }
                if (taskId == 8 && taskMain.index == 2) {
                    menus.add(new Menu(CMDMenu.EXECUTE, "Về nhà thôi", () -> {
                        Mob mob = new Mob();
                        mob.idEntity = zone.getMonsters().size();
                        mob.id = 227;
                        mob.nameCall = name;
                        mob.hp = mob.hpFull = 1000;
                        mob.x = x;
                        mob.y = y;
                        mob.level = level();
                        mob.status = 2;
                        mob.levelBoss = 0;
                        mob.zone = zone;
                        mob.timeRemove = System.currentTimeMillis() + 200000;
                        zone.addMob(mob);
                        long timeStart = System.currentTimeMillis() + 180000;
                        Thread threadSend = new Thread(()/// co the lag
                                -> {
                            int i = 0;
                            try {
                                while (timeStart > System.currentTimeMillis() && !isCleaned) {
                                    try {
                                        Thread.sleep(3000l);
                                    } catch (InterruptedException e) {
                                    }
                                    String[] segments = taskMain.vStep.get(taskMain.index).strItem.split("\\{");
                                    String segment = segments[i].trim().replace("}", "");
                                    if (!segment.isEmpty()) {
                                        String[] xy = segment.split(",");
                                        short x = Short.parseShort(xy[0]);
                                        short y = Short.parseShort(xy[1]);
                                        mob.setXY(x, y);
                                        zone.getService().mobMove(mob.idEntity, x, y);
                                    }
                                    i++;
                                    if (i >= segments.length) {
                                        updateTaskCount(1);
                                        zone.removeMonster(mob);
                                        return;
                                    }
                                }
                                zone.removeMonster(mob);
                            } catch (Exception e) {

                            }
                        });
                        threadSend.start();
                    }));
                    return;
                }
            }
            switch (npcTemplateId) {
                case 62:
                    menus.add(new Menu(CMDMenu.EXECUTE, "Doanh Trại (Còn " + countDoanhTrai + " lượt)", () -> {
                        if (idDoanhTrai > -1) {
                            DoanhTrai doanhTrai = DoanhTrai.getDoanhTrai(idDoanhTrai);
                            if (doanhTrai != null && !doanhTrai.isClosed()) {
                                doanhTrai.joinMap(this);
                            } else
                                idDoanhTrai = -1;
                        }
                        if (getGroup() == null) {
                            serverMessage("Cần tổ đội 3 người trở lên mới có thể tham gia");
                            return;
                        }
                        if (countDoanhTrai == 0) {
                            serverMessage("Hết lượt tham gia");
                            return;
                        }
                        if (body[13] == null) {
                            serverMessage("Cần có trang bị kích hoạt");
                            return;
                        }
                        if (!getGroup().isLeader(this.id)) {
                            serverMessage("Bạn không phải trưởng nhóm");
                            return;
                        }
                        List<Char> players = getGroup().getCharsInZone(zone.map.id, zone.id);
                        if (players.size() < 2) {
                            serverMessage("Cần tổ đội 2 người trở lên mới có thể tham gia");
                            return;
                        }
                        if (players.size() < getGroup().getNumberMember()) {
                            serverMessage("Vui lòng tập hợp đủ thành viên lại");
                            return;
                        }
                        int lv = 0;
                        for (Char player : players) {
                            if (player.body[13] == null) {
                                serverMessage("Chiến binh " + player.name + " chưa trang bị kích hoạt");
                                return;
                            }
                            if (player.countDoanhTrai == 0) {
                                serverMessage("Chiến binh " + player.name + " đã hết lượt tham gia");
                                return;
                            }
                            if (player.idDoanhTrai != -1) {
                                serverMessage("Chiến binh " + player.name + " đang tham gia 1 phó bản khác");
                                return;
                            }
                            if (Math.abs(level() - player.level()) > 8) {
                                serverMessage("Chiến binh " + player.name + " chênh lệch sức mạnh quá lớn");
                                return;
                            }
                            lv += level();
                        }
                        DoanhTrai doanhTrai = new DoanhTrai(lv / players.size());
                        for (Char player : players) {
                            player.idDoanhTrai = doanhTrai.getId();
                            player.countDoanhTrai--;
                            player.addWorld(doanhTrai);
                            doanhTrai.joinMap(player);
                        }
                        DoanhTrai.addDoanhTrai(doanhTrai);
                    }));
                    break;
                case 32:
                    menus.add(new Menu(CMDMenu.EXECUTE, "Võ đài vũ trụ,Tham gia", () -> {
                        // if (true){
                        // getService().sendTextNPC("Võ Đài Vũ Trụ đang nâng cấp", "");
                        // return;
                        // }
                        menus.clear();
                        menus.add(new Menu(CMDMenu.EXECUTE, "Tham gia", () -> {
                            VoDaiSucManh VDSM = MapManager.getInstance().VDSM;
                            if (VDSM == null) {
                                getService().serverDialog("Võ đài sức mạnh chưa mở báo danh");
                                return;
                            }
                            VDSM.join(this, VDTTUtlis.nextInt(0, 8));
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Thưởng tích lũy (đang có 0 điểm)", () -> {

                        }));
                        getService().openUIMenu(identifer);

                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Giải đấu sức mạnh ,Tham gia", () -> {
//                        if (true) {
//                            getService().sendTextNPC("Giải đấu đang nâng cấp", "");
//                            return;
//                        }
                        GiaiDauSucManh gdsm = MapManager.getInstance().GDSM;
                        if (gdsm == null) {
                            getService().serverDialog("Giải đấu sức mạnh chưa mở báo danh");
                            return;
                        }
                        gdsm.join(this, VDTTUtlis.nextInt(0, 8));
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Thưởng tích lũy,Nhận thưởng ", () -> {
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Hướng dẫn", () -> {
                    }));
                    break;
                case 27:
                    menus.add(new Menu(CMDMenu.EXECUTE, "Đổi áo thần linh", () -> {
                        if (getSlotNull() == 0) {
                            warningBagFull();
                            return;
                        }
                        if (zeni < 1500 || !removeItems(354, 1500)) {
                            getService().sendTextNPC(
                                    "Cần 1.500 zeni, 1.500 Đá không gian thì mới có thể đổi được 1 Áo thần linh.", "");
                            return;
                        }
                        addZeni(-1500, true);
                        Item item = new Item(923);
                        item.setLock(true);
                        item.creatItemThan();
                        addItemToBag(item);
                        getService().addItem(item);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Đổi bao tay thần linh", () -> {
                        if (getSlotNull() == 0) {
                            warningBagFull();
                            return;
                        }
                        if (zeni < 1500 || !removeItems(562, 1500)) {
                            getService().sendTextNPC(
                                    "Cần 1.500 zeni, 1.500 Đá thời gian thì mới có thể đổi được 1 Bao tay thần linh.",
                                    "");
                            return;
                        }
                        addZeni(-1500, true);
                        Item item = new Item(924);
                        item.setLock(true);
                        item.creatItemThan();
                        addItemToBag(item);
                        getService().addItem(item);

                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Đổi quần thần linh", () -> {
                        if (getSlotNull() == 0) {
                            warningBagFull();
                            return;
                        }
                        if (zeni < 1500 || !removeItems(564, 1500)) {
                            getService().sendTextNPC(
                                    "Cần 1.500 zeni, 1.500 Đá tâm trí thì mới có thể đổi được 1 Quần thần linh.", "");
                            return;
                        }
                        addZeni(-1500, true);
                        Item item = new Item(925);
                        item.setLock(true);
                        item.creatItemThan();
                        addItemToBag(item);
                        getService().addItem(item);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Đổi giày thần linh", () -> {
                        if (getSlotNull() == 0) {
                            warningBagFull();
                            return;
                        }
                        if (zeni < 1500 || !removeItems(566, 1500)) {
                            getService().sendTextNPC(
                                    "Cần 1.500 zeni, 1.500 Đá sức mạnh thì mới có thể đổi được 1 Giày thần linh.", "");
                            return;
                        }
                        addZeni(-1500, true);
                        Item item = new Item(926);
                        item.setLock(true);
                        item.creatItemThan();
                        addItemToBag(item);
                        getService().addItem(item);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Trang bị thiên sứ", () -> {
                        service.openGUI(65);
                    }));
                    break;
                case 98:
                    menus.add(new Menu(CMDMenu.EXECUTE, "Trận chiến Ngục Tù,Tham gia (còn " + countNgucTu + " lượt)",
                            () -> {
                                if (countNgucTu == 0) {
                                    serverDialog("Hết lượt tham gia");
                                    return;
                                }
                                if (level() < 25) {
                                    serverDialog("Không đủ sức mạnh");
                                    return;
                                }
                                if (clan == null) {
                                    serverDialog("Chưa gia nhập vũ trụ");
                                    return;
                                }
                                countNgucTu--;
                                countAddPointNgucTu = 0;
                                timeNgucTu = System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(50);
                                int level = level();
                                if (level >= 25 && level <= 30) {
                                    joinZone(2, 0, 1);
                                } else if (level >= 31 && level <= 45) {
                                    joinZone(4, 0, 1);
                                } else if (level >= 46 && level <= 55) {
                                    joinZone(6, 0, 1);
                                } else {
                                    joinZone(8, 0, 1);
                                }
                                addPointSuper(2);
                                addPointKame(2);
                                addClanPoint(2);
                            }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Hướng dẫn", () -> {

                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Nhiệm vụ Fu cấp 1,Nhận nhiệm vụ (trừ 1.000 Zeni)", () -> {

                    }));
                    break;
                case 102:
                    if (taskOrders == null) {
                        menus.add(new Menu(CMDMenu.EXECUTE,
                                ":-?Nhiệm vụ học trò quy lão " + (60 - countTaskQuyLao) + "/60", () -> {
                            if (countTaskQuyLao <= 0) {
                                return;
                            }
                            getService().sendTaskQuyLao();
                            int[] percent = new int[]{25, 25, 25, 25};
                            byte[] type = new byte[]{0, 2, 3, 4};
                            int index = VDTTUtlis.randomWithRate(percent, 100);
                            this.taskOrders = TaskFactory.getInstance().createTaskOrder(type[index], this);
                            getService().updateTaskOrder(taskOrders);
                            if (taskOrders.taskId == TaskOrder.TASK_MAI_RUA) {
                                Effect eff = new Effect(117, TimeUnit.MINUTES.toMillis(5), 150);
                                getEm().setEffect(eff);
                                setAbility();
                            }
                        }));
                    } else {
                        if (taskOrders.taskId == TaskOrder.TASK_ANSWER) {
                            menus.add(new Menu(CMDMenu.EXECUTE, ":-?Trả lời câu hỏi", () -> {
                                if (taskOrders.failed) {
                                    return;
                                }
                                questionAndAnswer();
                            }));
                        }
                        menus.add(new Menu(CMDMenu.EXECUTE, ":-!Hoàn thành nhiệm vụ", () -> {
                            if (!taskOrders.isComplete()) {
                                return;
                            }
                            if (getSlotNull() < 3) {
                                serverDialog("Hãy để trống 3 ô trong túi");
                                return;
                            }
                            countTaskFailed = 0;
                            if (countTaskQuyLao == 1 || countTaskQuyLao == 11 || countTaskQuyLao == 21
                                    || countTaskQuyLao == 31 || countTaskQuyLao == 41 || countTaskQuyLao == 51) {
                                if (getSlotNull() < 5) {
                                    serverDialog("Hãy để trống 5 ô trong túi");
                                    return;
                                }
                                addClanPoint(2);
                                Item tuido = new Item(164);
                                tuido.setLock(true);
                                tuido.setQuantity(2);
                                addItemToBag(tuido);
                                getService().addItem(tuido);
                                Item kc = new Item(160);
                                kc.setLock(true);
                                kc.setQuantity(VDTTUtlis.nextInt(5, 10));
                                addItemToBag(kc);
                                getService().addItem(kc);
                            }
                            if (Event.isTrungThu()) {
                                if (countTaskQuyLao % 5 == 0) {
                                    if (getSlotNull() > 0) {
                                        Item duoi = new Item(908);
                                        duoi.setLock(true);
                                        addItemToBag(duoi);
                                        getService().addItem(duoi);
                                    }
                                }
                            }
                            if (Event.isNoel()) {
                                if (getSlotNull() > 0) {
                                    Item item = new Item(930);
                                    item.setLock(true);
                                    item.setQuantity(1);
                                    addItemToBag(item);
                                    getService().addItem(item);
                                }
                            }
                            taskOrders = null;
                            addCoin(100000, true);
                            addPointSuper(1);
                            addPointKame(1);
                            countTuiDo--;
                            Item nts = new Item(838);
                            nts.setQuantity(1);
                            nts.setLock(true);
                            addItemToBag(nts);
                            getService().addItem(nts);
                            Item da = new Item(VDTTUtlis.nextInt(5, 6));
                            da.setQuantity(1);
                            da.setLock(true);
                            addItemToBag(da);
                            getService().addItem(da);
                            countTaskQuyLao--;
                            getService().sendTaskQuyLao();
                            getService().resetTaskQuyLao();
                            if (countTaskQuyLao == 30) {
//                                Item item = new Item(1151);
//                                item.setLock(true);
//                                item.setQuantity(1);
//                                addItemToBag(item);
//                                getService().addItem(item);
                            }
                        }));
                    }
                    menus.add(new Menu(CMDMenu.EXECUTE, "Đổi nhiệm vụ dễ (trừ 30k Ballz)", () -> {
                        if (taskOrders == null) {
                            serverDialog("Chưa nhận nhiệm vụ thì làm sao mà đổi bạn ơi");
                            return;
                        }
                        if (ballZ < 30000) {
                            service.serverDialog("Không đủ ballz");
                            return;
                        }
                        addBallz(-30000, true);
                        int[] percent = new int[]{35, 35, 30};
                        byte[] type = new byte[]{0, 3, 4};
                        int index = VDTTUtlis.randomWithRate(percent, 100);
                        this.taskOrders = TaskFactory.getInstance().createTaskOrder(type[index], this);
                        getService().updateTaskOrder(taskOrders);
                        if (taskOrders.taskId == TaskOrder.TASK_MAI_RUA) {
                            Effect eff = new Effect(117, TimeUnit.MINUTES.toMillis(5), 150);
                            getEm().setEffect(eff);
                            setAbility();
                        }
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Khoá sức mạnh(-50 zeni)", () -> {
                        menus.clear();
                        if (!lockEXP) {
                            menus.add(new Menu(CMDMenu.EXECUTE, "Đồng ý", () -> {
                                if (level() < 30) {
                                    serverDialog("Chưa đủ sức mạnh, cần 239.850 sức mạnh trở lên");
                                    return;
                                }
                                if (zeni < 50) {
                                    service.serverDialog("Không đủ zeni");
                                    return;
                                }
                                addZeni(-50, true);
                                lockEXP = true;
                                serverMessage("Khoá sức mạnh thành công");
                            }));
                        } else {
                            menus.add(new Menu(CMDMenu.EXECUTE, "Mở khoá", () -> {
                                lockEXP = false;
                                serverMessage("Mở khoá sức mạnh thành công");
                            }));
                        }
                        getService().openUIMenu(identifer);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Nhiệm vụ đệ tử", () -> {
                        menus.clear();
                        menus.add(new Menu(CMDMenu.EXECUTE, "Nhận (-100 kim cương)", () -> {
                            if (removeItems(160, 100)) {
                                taskPet = true;
                                service.serverDialog("Nhận nhiệm vụ thành công");
                            } else {
                                service.serverDialog("Không đủ kim cương");
                            }
                        }));
                        getService().openUIMenu(identifer);
                    }));
                    break;
                case 73:
                    if (Event.getEvent() != null) {
                        Event.getEvent().menu(this, identifer);
                    }
                    menus.add(new Menu(CMDMenu.EXECUTE, "Đổi chỉ số Cân Đẩu Vân(100 zeni)", () -> {
                        if (body[10] == null) {
                            serverDialog("Bạn chưa đeo cân đẩu vân");
                            return;
                        }
                        if (body[10].id != 189 && body[10].id != 276) {
                            serverDialog("Chỉ có thể đổi chỉ số cân đẩu vân cấp 1");
                            return;
                        }
                        if (zeni < 100) {
                            serverDialog("Không đủ zeni");
                            return;
                        }
                        addZeni(-100, true);
                        body[10].changeOptionCDV();
                        getService().updateItemBodyChange();
                        zone.getService().updateItemBody(this);
                        serverMessage("Đổi chỉ số cân đẩu vân thành công");
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Thử vận may", () -> {
                        itemTVM = new ArrayList<>(ItemManager.getInstance().itemThuVanMay);
                        Collections.shuffle(itemTVM);
                        getService().openThuVanMay(itemTVM);
                        typeTVM = 0;
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, " Kho báu Thú Cưng", () -> {
                        List<Item> tvm = new ArrayList<>(ItemManager.getInstance().tvmNew);
                        Collections.shuffle(tvm);
                        getService().openKhoBau(tvm, 1174, 1169);
                        typeTVM = 1;
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, " Kho báu Bardock", () -> {
                        List<Item> tvm = new ArrayList<>(ItemManager.getInstance().tvmNew2);
                        Collections.shuffle(tvm);
                        getService().openKhoBau(tvm, 1174, 1133);
                        typeTVM = 2;
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Ngục tù thử thách", () -> {
                        NgucTuThuThach ngucTu = NgucTuThuThach.findNgucTu(this.id);
                        if (ngucTu != null && !ngucTu.isClosed()) {
                            addWorld(ngucTu);
                            ngucTu.join(this);
                            return;
                        }
                        if (countJoinNgucTu2 == 0) {
                            serverDialog("Hết lượt tham gia");
                            return;
                        }
                        countJoinNgucTu2--;
                        NgucTuThuThach ngucTu2 = new NgucTuThuThach();
                        ngucTu2.charId = this.id;
                        addWorld(ngucTu2);
                        ngucTu2.join(this);
                    }));
                    break;
                case 22:
                    if (user.isAdmin) {
                        AdminService.getInstance().openUIAdmin(this, identifer);
                    }
                    menus.add(new Menu(CMDMenu.EXECUTE, "Đổi coin sang Zeni", () -> {
                        InputDialog input = new InputDialog(CMDInputDialog.EXECUTE, "Nhập số coin cần đổi:", () -> {
                            try {
                                int num = this.input.intValue();
                                if (num < 1000 || num % 1000 != 0) {
                                    getService().resetScreen();
                                    serverDialog(
                                            "Số lượng không hợp lệ, Số lượng tối thiểu là 1000 coin và chia hết cho 1000");
                                    return;
                                }
                                if (num > user.coin) {

                                    getService().resetScreen();
                                    serverDialog("Không đủ coin để đổi");
                                    return;
                                }
                                if (!DbManager.getInstance().updateCoin(user.username, num)) {
                                    getService().resetScreen();
                                    serverDialog("Không đủ coin để đổi");
                                    return;
                                }
                                user.coin -= num;
                                this.vnd += num;
                                int zeni = num / 1000 * 50;
                                int old = mocNap;
                                mocNap += zeni;
                                napNgay += zeni;
                                countVongQuay += (short) ((mocNap / 1000) - (old / 1000));
                                Mail mail = createMail("Hệ thống", "Nạp tiền thành công",
                                        "Chúc mừng bạn đã đổi " + VDTTUtlis.getCurrency(num) + " coin thành "
                                                + VDTTUtlis.getCurrency(zeni) + " zeni",
                                        0, 0, zeni, null);
                                mailManager.addMail(mail);
                                getService().resetScreen();
                                serverDialog("Đổi coin thành công, vui lòng kiểm tra thư");
                                VDTTUtlis.writing("loggame/naptien/" + this.name + ".txt",
                                        "Đổi " + VDTTUtlis.getCurrency(num) + " coin thành "
                                                + VDTTUtlis.getCurrency(zeni) + " zeni vào lúc "
                                                + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date())
                                                + " số coin còn lại là :" + VDTTUtlis.getCurrency(user.coin)
                                                + "\n<------------------------------------>\n");
                            } catch (Exception e) {
                                getService().resetScreen();
                                serverDialog("Bạn đã nhập vào không đúng, vui lòng chỉ nhập số không nhập chữ");
                            }
                        });
                        setInput(input);
                        getService().showInputDialog();
                    }));


                    menus.add(new Menu(CMDMenu.EXECUTE, "Mở thành viên nhận quà(20000 Coin)", () -> {
                        if (getSlotNull() < 1) {
                            warningBagFull();
                            return;
                        }
                        if (user.coin < 20000) {
                            serverDialog("Không đủ coin");
                            return;
                        }
                        if (!DbManager.getInstance().updateCoin(user.username, 20000)) {
                            serverDialog("Không đủ coin");
                            return;
                        }
                        user.coin -= 20000;
                        this.activated = 0;
                        serverDialog("Mở thành viên thành công");
                        addCoin(20000000, true);
                        addZeni(100, true);
                        Item item = new Item(160);
                        item.setQuantity(1000);
                        item.setLock(true);

                        addItemToBag(item);
                        getService().addItem(item);



                        
                        if (this.activated == 0) {
                            serverDialog("Bạn đã mở thành viên ");
                            return;
                        }


                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Nhận quà mốc nạp ", () -> {
                        menus.clear();
                        menus.add(new Menu(CMDMenu.EXECUTE, "20.000 Coin", () -> {
                            if (this.vnd < 20000) {
                                service.serverDialog(
                                        "Cần đổi thêm " + (20000 - this.vnd) + " coin sang zeni mới có thể nhận quà");
                                return;
                            }
                            if (isMoc1) {
                                serverMessage("Bạn đã nhận quà mốc này rồi");
                                return;
                            }
                            if (getSlotNull() == 0) {
                                warningBagFull();
                                return;
                            }
                            isMoc1 = true;
                            addCoin(5000000, true);
                            Item item = new Item(7);
                            item.setLock(true);
                            item.setQuantity(3);
                            Item item2 = new Item(161);
                            item2.setLock(true);
                            item2.setQuantity(5);
                            addItemToBag(item);
                            addItemToBag(item2);
                            getService().addItem(item);
                            getService().addItem(item2);

                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "100.000 Coin", () -> {
                            if (this.vnd < 100000) {
                                service.serverDialog(
                                        "Cần đổi thêm " + (100000 - this.vnd) + " coin sang zeni mới có thể nhận quà");
                                return;
                            }
                            if (isMoc2) {
                                serverMessage("Bạn đã nhận quà mốc này rồi");
                                return;
                            }
                            isMoc2 = true;
                            addCoin(10000000, true);
                            Item item = new Item(828);
                            item.setLock(true);
                            item.setQuantity(1);
                            Item item2 = new Item(160);
                            item2.setLock(true);
                            item2.setQuantity(750);
//                            Item item3 = new Item(435); // sach chien dau
//                            item3.setLock(true);
//                            item3.setQuantity(1);
                            addItemToBag(item);
                            addItemToBag(item2);
//                            addItemToBag(item3);
                            getService().addItem(item);
                            getService().addItem(item2);
//                            getService().addItem(item3);

                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "500.000 Coin", () -> {
                            if (this.vnd < 500000) {
                                service.serverDialog(
                                        "Cần đổi thêm " + (500000 - this.vnd) + " coin sang zeni mới có thể nhận quà");
                                return;
                            }
                            if (isMoc3) {
                                serverMessage("Bạn đã nhận quà mốc này rồi");
                                return;
                            }
                            isMoc3 = true;
                            addCoin(15000000, true);
                            Item item = new Item(827);
                            item.setLock(true);
                            item.setQuantity(1);
                            Item item2 = new Item(823);
                            item2.setLock(true);
                            item2.setQuantity(2);
                            Item item3 = new Item(177);
                            item3.setLock(true);
                            item3.setQuantity(5);
                            Item item4 = new Item(435);
                            item4.setLock(true);
                            item4.setQuantity(2);
                            addItemToBag(item);
                            addItemToBag(item2);
                            addItemToBag(item3);
                            addItemToBag(item4);
                            getService().addItem(item);
                            getService().addItem(item2);
                            getService().addItem(item3);
                            getService().addItem(item4);

                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "1 Triệu Coin", () -> {
                            if (this.vnd < 1000000) {
                                service.serverDialog(
                                        "Cần đổi thêm " + (1000000 - this.vnd) + " coin sang zeni mới có thể nhận quà");
                                return;
                            }
                            if (isMoc4) {
                                serverMessage("Bạn đã nhận quà mốc này rồi");
                                return;
                            }
                            isMoc4 = true;
                            addCoin(30000000, true);
//                            addBallz(5000000, true);
                            Item item = new Item(435);
                            item.setLock(true);
                            item.setQuantity(3);
                            Item item2 = new Item(160);
                            item2.setLock(true);
                            item2.setQuantity(5000);
                            Item item3 = new Item(682);
                            item3.setLock(true);
                            item3.setQuantity(7);
                            Item item4 = new Item(823);
                            item4.setLock(true);
                            item4.setQuantity(3);
                            addItemToBag(item);
                            addItemToBag(item2);
                            addItemToBag(item3);
                            addItemToBag(item4);
                            getService().addItem(item);
                            getService().addItem(item2);
                            getService().addItem(item3);
                            getService().addItem(item4);

                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "2 Triệu Coin", () -> {
                            if (this.vnd < 2000000) {
                                service.serverDialog(
                                        "Cần đổi thêm " + (2000000 - this.vnd) + " coin sang zeni mới có thể nhận quà");
                                return;
                            }
                            if (isMoc5) {
                                serverMessage("Bạn đã nhận quà mốc này rồi");
                                return;
                            }
                            isMoc5 = true;
                            addCoin(50000000, true);
//                            addBallz(50000000, true);
                            Item item = new Item(823);
                            item.setLock(true);
                            item.setQuantity(4);
                            Item item2 = new Item(160);
                            item2.setLock(true);
                            item2.setQuantity(10000);
                            Item item3 = new Item(682);
                            item3.setLock(true);
                            item3.setQuantity(15);
                            Item item4 = new Item(829);
                            item4.setLock(true);
                            item4.setQuantity(900);
                            addItemToBag(item);
                            addItemToBag(item2);
                            addItemToBag(item3);
                            addItemToBag(item4);
                            getService().addItem(item);
                            getService().addItem(item2);
                            getService().addItem(item3);
                            getService().addItem(item4);

                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "5 Triệu Coin", () -> {
                            if (this.vnd < 5000000) {
                                service.serverDialog(
                                        "Cần đổi thêm " + (5000000 - this.vnd) + " coin sang zeni mới có thể nhận quà");
                                return;
                            }
                            if (isMoc6) {
                                serverMessage("Bạn đã nhận quà mốc này rồi");
                                return;
                            }
                            isMoc6 = true;
                            addCoin(100000000, true);
                            Item item = new Item(823);
                            item.setLock(true);
                            item.setQuantity(4);
                            Item item2 = new Item(460);
                            item2.strOption = "376,12,-1;379,12,-1;377,12,-1;327,62,62";
                            item2.setLock(true);
                            item2.setQuantity(1);
                            Item item3 = new Item(682);
                            item3.setLock(true);
                            item3.setQuantity(20);
                            Item item4 = new Item(910);
                            item4.setLock(true);
                            item4.setQuantity(30000);
                            addItemToBag(item);
                            addItemToBag(item2);
                            addItemToBag(item3);
                            addItemToBag(item4);
                            getService().addItem(item);
                            getService().addItem(item2);
                            getService().addItem(item3);
                            getService().addItem(item4);

                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "10 Triệu Coin", () -> {
                            if (this.vnd < 10000000) {
                                service.serverDialog(
                                        "Cần đổi thêm " + (10000000 - this.vnd) + " coin sang zeni mới có thể nhận quà");
                                return;
                            }
                            if (isMoc7) {
                                serverMessage("Bạn đã nhận quà mốc này rồi");
                                return;
                            }
                            isMoc7 = true;
                            addCoin(300000000, true);
//                            addBallz(50000000, true);
                            Item item = new Item(823);
                            item.setLock(true);
                            item.setQuantity(5);
                            Item item2 = new Item(682);
                            item2.setLock(true);
                            item2.setQuantity(25);
                            Item item3 = new Item(918);
                            item3.strOption = "0,3000;1,3000;2,350;5,350;258,350;151,350;167,350;297,50";
                            item3.setLock(false);
                            item3.setQuantity(1);
                            Item item4 = new Item(160);
                            item4.setLock(true);
                            item4.setQuantity(25000);
                            addItemToBag(item);
                            addItemToBag(item2);
                            addItemToBag(item3);
                            addItemToBag(item4);
                            getService().addItem(item);
                            getService().addItem(item2);
                            getService().addItem(item3);
                            getService().addItem(item4);
                        }));

                        getService().openUIMenu(identifer);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Kiểm tra coin", () -> {
                        user.coin = DbManager.getInstance().getCoin(user.username);
                        serverDialog("Coin: " + VDTTUtlis.getCurrency(user.coin));
                    }));
//                    if(Config.getInstance().getServerID() == 3) {
                    if (true) return; // tạm tắt nhận quà test bật thì // nó lại
                  menus.add(new Menu(CMDMenu.EXECUTE, "Nhận quà test", () -> {
                        if (getSlotNull() < 30) {
                            serverDialog("Hãy để trống 30 ô trong túi");
                            return;
                        }
//                            if(Config.getInstance().getServerID()!=3) {
//                                serverDialog("Chỉ có thể nhận quà trên server test");
//                                return;
//                            }
                        Item tui1 = new Item(185);
                        tui1.setQuantity(36);
                        tui1.setLock(true);
                        addItemToBag(tui1);
                        getService().addItem(tui1);

                        Item tui2 = new Item(186);
                        tui2.setQuantity(18);
                        tui2.setLock(true);
                        addItemToBag(tui2);
                        getService().addItem(tui2);

                        Item tui3 = new Item(187);
                        tui3.setQuantity(9);
                        tui3.setLock(true);
                        addItemToBag(tui3);
                        getService().addItem(tui3);

                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                Item item = new Item(923 + j);
                                item.setQuantity(1);
                                item.createOptionRandom(4, 7);
                                String str = item.strOption;
                                item.creatItemThan();
                                item.strOption += ";" + str;
                                item.upgradeItem(14);
                                item.setLock(true);
                                addItemToBag(item);
                                getService().addItem(item);
                            }
                        }
                        addCoin(2000000000, true);
                        addBallz(2000000000, true);
                        addZeni(1000000, true);

                        Item ngocki = new Item(1037);
                        ngocki.setQuantity(999);
                        ngocki.setLock(true);
                        ngocki.strOption = "343,50";
                        ngocki.expire = System.currentTimeMillis() + 100060000000L;
                        addItemToBag(ngocki);
                        getService().addItem(ngocki);

                        Item ngoccm = new Item(1037);
                        ngoccm.setQuantity(999);
                        ngoccm.setLock(true);
                        ngoccm.strOption = "338,100";
                        ngoccm.expire = System.currentTimeMillis() + 100060000001L;
                        addItemToBag(ngoccm);
                        getService().addItem(ngoccm);

                        Item ngocne = new Item(1037);
                        ngocne.setQuantity(999);
                        ngocne.setLock(true);
                        ngocne.strOption = "337,100";
                        ngocne.expire = System.currentTimeMillis() + 100060000002L;
                        addItemToBag(ngocne);
                        getService().addItem(ngocne);

//                        Item ldlq = new Item(1037);
//                        ldlq.setQuantity(999);
//                        ldlq.setLock(true);
//                        ldlq.strOption = "342,100";
//                        ldlq.expire = System.currentTimeMillis() + 100060000002L;
//                        addItemToBag(ldlq);
//                        getService().addItem(ldlq);
//
//                        Item tancong = new Item(1037);
//                        tancong.setQuantity(999);
//                        tancong.setLock(true);
//                        tancong.strOption = "341,100";
//                        tancong.expire = System.currentTimeMillis() + 100060000002L;
//                        addItemToBag(tancong);
//                        getService().addItem(tancong);

                        Item ngocgiap = new Item(1037);
                        ngocgiap.setQuantity(999);
                        ngocgiap.setLock(true);
                        ngocgiap.strOption = "340,100";
                        ngocgiap.expire = System.currentTimeMillis() + 100060000003L;
                        addItemToBag(ngocgiap);
                        getService().addItem(ngocgiap);

                        Item five = new Item(803);
                        five.setQuantity(999);
                        five.setLock(true);
                        addItemToBag(five);
                        getService().addItem(five);

                        Item six = new Item(804);
                        six.setQuantity(999);
                        six.setLock(true);
                        addItemToBag(six);
                        getService().addItem(six);

                        Item seven = new Item(805);
                        seven.setQuantity(999);
                        seven.setLock(true);
                        addItemToBag(seven);
                        getService().addItem(seven);

                        Item sach = new Item(435);
                        sach.setQuantity(14);
                        sach.setLock(true);
                        addItemToBag(sach);
                        getService().addItem(sach);


                        Item trung = new Item(1198);
                        trung.setQuantity(10);
                        trung.setLock(true);
                        addItemToBag(trung);
                        getService().addItem(trung);


                        Item ta = new Item(1194);
                        ta.setQuantity(29999);
                        ta.setLock(true);
                        addItemToBag(ta);
                        getService().addItem(ta);
                        Item dan = new Item(1195);
                        dan.setQuantity(999);
                        dan.setLock(true);
                        addItemToBag(dan);
                        getService().addItem(dan);
                        Item ve = new Item(936);
                        ve.setQuantity(999);
                        ve.setLock(true);
                        addItemToBag(ve);
                        getService().addItem(ve);
                        Item ruong = new Item(682);
                        ruong.setQuantity(9999);
                        ruong.setLock(true);
                        addItemToBag(ruong);
                        getService().addItem(ruong);
                        Item dong = new Item(822);
                        dong.setQuantity(19999);
                        dong.setLock(true);
                        addItemToBag(dong);
                        getService().addItem(dong);

                        Item caitrang = new Item(1202);
                        caitrang.setQuantity(1);
                        caitrang.setLock(true);
                        caitrang.strOption = "327,108,0;2,500;0,1000;64,500";
                        caitrang.expire = -1;
                        addItemToBag(caitrang);
                        getService().addItem(caitrang);
                    }));
//                    }
                    break;
                case 47:
                    menus.add(new Menu(CMDMenu.EXECUTE, "Rương đồ", () -> {
                        service.openBox();
                    }));
                    break;
                case 49:
                    int numBean = getNumBean();
                    menus.add(new Menu(CMDMenu.EXECUTE, "Thu hoạch " + numBean + "/" + (levelBean + 5), () -> {
                        if (getSlotNull() < 1) {
                            warningBagFull();
                            return;
                        }
                        if (taskId == 0 && taskMain != null && taskMain.index == 1) {
                            updateTaskCount(1);
                        }
                        if (taskId == 6 && taskMain != null && taskMain.index == 1) {
                            updateTaskCount(1);
                        }
                        if (numBean > 0) {
                            Item item = new Item(724);
                            item.isLock = true;
                            item.setQuantity(numBean);
                            addItemToBag(item);
                            getService().addItem(item);
                            timeReciveBean = (int) (System.currentTimeMillis() / 1000);
                            getService().sendTimeReciveBean();
                        } else {
                            service.serverDialog("Đã hết lượt nhận đậu");
                        }
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Thu hoạch nhanh (1 zeni)", () -> {
                        if (zeni < 1) {
                            service.warningMessage("Không đủ zeni");
                            return;
                        }
                        if (getSlotNull() < 1) {
                            warningBagFull();
                            return;
                        }
                        addZeni(-1, true);
                        Item item = new Item(724);
                        item.isLock = true;
                        item.setQuantity(levelBean + 5);
                        addItemToBag(item);
                        getService().addItem(item);
                        timeReciveBean = (int) (System.currentTimeMillis() / 1000);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Thu hoạch thần tốc (10 zeni)", () -> {
                        if (zeni < 10) {
                            service.warningMessage("Không đủ zeni");
                            return;
                        }
                        if (getSlotNull() < 1) {
                            warningBagFull();
                            return;
                        }
                        addZeni(-10, true);
                        Item item = new Item(724);
                        item.isLock = true;
                        item.setQuantity(99);
                        addItemToBag(item);
                        getService().addItem(item);
                        timeReciveBean = (int) (System.currentTimeMillis() / 1000);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Nâng lên cấp " + (levelBean + 2), () -> {
                        if (levelBean >= 12) {
                            service.sendTextNPC("Đã đạt cấp tối đa", "");
                            return;
                        }
                        menus.clear();
                        if (timeUpgradeBean > 0) {
                            menus.add(new Menu(CMDMenu.EXECUTE, "Hủy (Thời gian hoàn thành "
                                    + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date(timeUpgradeBean))
                                    + ")", () -> {
                                int price = Config.getInstance().upgradeLevels[levelBean][1];
                                timeUpgradeBean = 0;
                                addCoin(price, true);
                            }));
                        } else {
                            menus.add(new Menu(CMDMenu.EXECUTE,
                                    "Xác nhận (" + Config.getInstance().upgradeLevels[levelBean][1] + ") xu", () -> {
                                int price = Config.getInstance().upgradeLevels[levelBean][1];
                                if (coin < price) {
                                    service.warningMessage("Không đủ xu");
                                    return;
                                }
                                if (taskId == 5 && taskMain != null && taskMain.index == 2) {
                                    updateTaskCount(1);
                                }
                                timeUpgradeBean = System.currentTimeMillis()
                                        + Config.getInstance().upgradeLevels[levelBean][2];
                                addCoin(-price, true);
                            }));
                            menus.add(new Menu(CMDMenu.EXECUTE, "Hủy", () -> {

                            }));
                        }
                        getService().openUIMenu(identifer);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Nâng nhanh lên cấp " + (levelBean + 2), () -> {
                        if (levelBean >= 12) {
                            service.sendTextNPC("Đã đạt cấp tối đa", "");
                            return;
                        }
                        if (timeUpgradeBean > 0) {
                            service.warningMessage("Đang nâng cấp");
                            return;
                        }
                        menus.clear();
                        menus.add(new Menu(CMDMenu.EXECUTE,
                                "Xác nhận (" + Config.getInstance().upgradeLevels[levelBean][0] + ") zeni", () -> {
                            int price = Config.getInstance().upgradeLevels[levelBean][0];
                            if (zeni < price) {
                                service.warningMessage("Không đủ zeni");
                                return;
                            }
                            addZeni(-price, true);
                            levelBean++;
                            getService().sendLevelBean();
                        }));
                        getService().openUIMenu(identifer);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Hướng dẫn", () -> {
                        getService().sendTextNPC(
                                "Chỉ có thể đem theo tối đa 24 đậu thần. Nếu lượng đậu thu nhập nhiều hơn số đậu giới hạn thì số đậu dư sẽ mất",
                                "");
                    }));
                    break;
                case 92:
                    menus.add(new Menu(CMDMenu.EXECUTE, "Kỹ năng", () -> {
                        requestItem((byte) 37);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Đồ xịn", () -> {
                        requestItem((byte) 38);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Trang phục", () -> {
                        requestItem((byte) 19);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Cải trang", () -> {
                        requestItem((byte) 30);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Thời trang", () -> {
                        requestItem((byte) 35);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Khuyến mãi", () -> {
                        requestItem((byte) 18);
                    }));
                    break;
                case 28:
                    menus.add(new Menu(CMDMenu.EXECUTE, "Ghép đá", () -> {
                        service.openGUI(81);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Ép sao", () -> {
                        service.openGUI(82);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Hợp nhất", () -> {
                        service.hopNhatItem();
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Đục lỗ khảm", () -> {
                        service.openGUI(102);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Khảm pha lê", () -> {
                        service.openGUI(87);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Tách pha lê", () -> {
                        service.openGUI(90);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Ghép cải trang", () -> {
                        service.openGUI(94);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Tách cải trang", () -> {
                        service.openGUI(95);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Dịch chuyển sao", () -> {
                        service.openGUI(85);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Tách đá ép sao", () -> {
                        service.openGUI(84);
                    }));
//                    menus.add(new Menu(CMDMenu.EXECUTE, "Phân giã sách (100 zeni)", () -> {
//                        if (sachChienDau < 14) {
//                            serverDialog("Yêu cầu sách chiến đấu 7 sao trở lên");
//                            return;
//                        }
//                        if (getSlotNull() == 0) {
//                            warningBagFull();
//                            return;
//                        }
//                        if (zeni < 100) {
//                            serverDialog("Không đủ zeni");
//                            return;
//                        }
//                        int index = getIndexItemByIdInBag(435, true);
//                        if (index == -1) {
//                            serverDialog("Không có sách chiến đấu");
//                            return;
//                        }
//                        addZeni(-100, true);
//                        removeItem(index, 1, false);
//                        Item item = new Item(434);
//                        item.setLock(false);
//                        item.setQuantity(1000);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }));
                    break;
                case 21:
                    menus.add(new Menu(CMDMenu.EXECUTE, "Nhận thưởng mỗi tuần", () -> {

                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Đột phá trang bị (Thú cưng)", () -> {
                        menus.clear();
                        menus.add(new Menu(CMDMenu.EXECUTE, "Vũ khí", () -> {
                            if (mount[1] == null) {
                                serverDialog("Vui lòng đeo vũ khí cho thú cưng để nâng cấp");
                                return;
                            }
                            if (mount[1].getUpgrade() >= 16) {
                                serverDialog("Vũ khí đã đạt cấp tối đa");
                                return;
                            }
                            if (mount[1].expire != -1) {
                                serverDialog("Chỉ có thể nâng cấp trang bị vĩnh viễn");
                                return;
                            }
                            Item item = mount[1];
                            int priceTinhThach = 100 * (item.getUpgrade() + 1);
                            int priceCoin = 10000000 * (item.getUpgrade() + 1);
                            if (coin < priceCoin) {
                                serverDialog("Không đủ xu, còn thiếu " + VDTTUtlis.getCurrency(priceCoin - coin) + " xu");
                                return;
                            }
                            if (!removeItems(1224, priceTinhThach)) {
                                serverDialog("Không đủ tinh thạch, cần " + priceTinhThach + " tinh thạch đỏ");
                                return;
                            }
                            addCoin(-priceCoin, true);
                            if (item.isMaxStars()) {
                                Item next = new Item(item.getNextUpgradeId());
                                next.setLock(true);
                                mount[1] = next;
                                serverDialog("Nâng cấp thành công lên " + next.getTemplate().name + " " + next.getUpgrade() + " sao");
                            } else {
                                item.upgradeItemMount();
                                serverDialog("Nâng cấp thành công lên " + item.getTemplate().name + " " + ((float) item.getUpgrade() / 2) + " sao");
                            }
                            getService().updateIndexBag();
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Nón", () -> {
                            if (mount[2] == null) {
                                serverDialog("Vui lòng đeo vũ khí cho thú cưng để nâng cấp");
                                return;
                            }
                            if (mount[2].getUpgrade() >= 16) {
                                serverDialog("Vũ khí đã đạt cấp tối đa");
                                return;
                            }
                            if (mount[2].expire != -1) {
                                serverDialog("Chỉ có thể nâng cấp trang bị vĩnh viễn");
                                return;
                            }
                            Item item = mount[2];
                            int priceTinhThach = 100 * (item.getUpgrade() + 1);
                            int priceCoin = 10000000 * (item.getUpgrade() + 1);
                            if (coin < priceCoin) {
                                serverDialog("Không đủ xu, còn thiếu " + VDTTUtlis.getCurrency(priceCoin - coin) + " xu");
                                return;
                            }
                            if (!removeItems(1225, priceTinhThach)) {
                                serverDialog("Không đủ tinh thạch, cần " + priceTinhThach + " tinh thạch lục");
                                return;
                            }
                            addCoin(-priceCoin, true);
                            if (item.isMaxStars()) {
                                Item next = new Item(item.getNextUpgradeId());
                                next.setLock(true);
                                mount[2] = next;
                                serverDialog("Nâng cấp thành công lên " + next.getTemplate().name + " " + next.getUpgrade() + " sao");
                            } else {
                                item.upgradeItemMount();
                                serverDialog("Nâng cấp thành công lên " + item.getTemplate().name + " " + item.getUpgrade() + " sao");
                            }
                            getService().updateIndexBag();
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Áo", () -> {
                            if (mount[3] == null) {
                                serverDialog("Vui lòng đeo vũ khí cho thú cưng để nâng cấp");
                                return;
                            }
                            if (mount[3].expire != -1) {
                                serverDialog("Chỉ có thể nâng cấp trang bị vĩnh viễn");
                                return;
                            }
                            if (mount[3].getUpgrade() >= 16) {
                                serverDialog("Vũ khí đã đạt cấp tối đa");
                                return;
                            }
                            Item item = mount[3];
                            int priceTinhThach = 100 * (item.getUpgrade() + 1);
                            int priceCoin = 10000000 * (item.getUpgrade() + 1);
                            if (coin < priceCoin) {
                                serverDialog("Không đủ xu, còn thiếu " + VDTTUtlis.getCurrency(priceCoin - coin) + " xu");
                                return;
                            }
                            if (!removeItems(1226, priceTinhThach)) {
                                serverDialog("Không đủ tinh thạch, cần " + priceTinhThach + " tinh thạch lam");
                                return;
                            }
                            addCoin(-priceCoin, true);
                            if (item.isMaxStars()) {
                                Item next = new Item(item.getNextUpgradeId());
                                next.setLock(true);
                                mount[3] = next;
                                serverDialog("Nâng cấp thành công lên " + next.getTemplate().name + " " + next.getUpgrade() + " sao");
                            } else {
                                item.upgradeItemMount();
                                serverDialog("Nâng cấp thành công lên " + item.getTemplate().name + " " + item.getUpgrade() + " sao");
                            }
                            getService().updateIndexBag();
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Hướng dẫn", () -> {
                            getService().sendTextNPC("Mỗi lần nâng cấp tốn 100*(cấp sao * 2 + 1) tinh thạch, và 10m xu *(cấp sao * 2 +1), tỉ lệ thành công 50%", "");
                        }));
                        getService().openUIMenu(identifer);
                    }));
                    break;
                case 40:
                    menus.add(new Menu(CMDMenu.EXECUTE, "Hành tinh ngục tù", () -> {
                        joinZone(54, 0, TypeTau.TAU_TRAI_DAT_VIP);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Hành tinh God", () -> {
                        joinZone(53, 0, TypeTau.TAU_TRAI_DAT_VIP);

                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Hành tinh Sao đen", () -> {
                        if (clan == null) {
                            serverDialog("Cần có vũ trụ để tham gia hoạt động");
                            return;
                        }
                        if (MapManager.getInstance().saoDen == null) {
                            serverDialog("Chưa mở hành tinh sao đen");
                            return;
                        }
                        addWorld(MapManager.getInstance().saoDen);
                        MapManager.getInstance().saoDen.joinZone(this, VDTTUtlis.nextInt(0, 29));
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Nhà tù ngân hà", () -> {

                    }));
                    break;
                case 42:
                    menus.add(new Menu(CMDMenu.EXECUTE, "Hành tinh FIDE", () -> {
                        joinZone(57, 0, TypeTau.TAU_FIDE);
                    }));
                    break;
                case 43:
                    menus.add(new Menu(CMDMenu.EXECUTE, "Hành tinh Tương lai", () -> {
                        joinZone(55, 0, TypeTau.TAU_TUONG_LAI);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Đại chiến MajinBuu", () -> {

                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Truy tìm ngọc rồng namec", () -> {

                    }));
                    break;
                case 44:
                    menus.add(new Menu(CMDMenu.EXECUTE, "Hành tinh Vampa", () -> {
                        joinZone(88, 0, TypeTau.TAU_XAYDA);
                    }));
                    break;
                case 45:
                    menus.add(new Menu(CMDMenu.EXECUTE, "Hành tinh Namec", () -> {
                        joinZone(77, 0, TypeTau.TAU_NAMEC);
                    }));
                    break;
                case 46:
                    menus.add(new Menu(CMDMenu.EXECUTE, "Hành tinh Yardat", () -> {
                        joinZone(81, 0, TypeTau.TAU_YARDRAT);
                    }));
                    break;
                case 61:
                    Effect eff = getEm().findByID(162);
                    if (eff != null) {
                        menus.add(new Menu(CMDMenu.EXECUTE, "Hoàn thành nhiệm vụ", () -> {
                            if (eff.getParam() >= 8) {
                                for (Item it : body) {
                                    if (it != null) {
                                        serverDialog("Cần phải tháo hết trang bị ra mới có thể hoàn thành nhiệm vụ");
                                        return;
                                    }
                                }
                                for (Item it : body2) {
                                    if (it != null) {
                                        serverDialog("Cần phải tháo hết trang bị ra mới có thể hoàn thành nhiệm vụ");
                                        return;
                                    }
                                }
                                if (getSlotNull() < 4) {
                                    serverDialog("Hãy để trống 4 ô trong túi đồ");
                                    return;
                                }
                                getEm().removeEffect(eff);
                                KI = exp / 10;
                                skills = SkillFactory.getInstance().getSkillByClass(5);
                                if (taskId > 3) {
                                    Skill skill = SkillFactory.getInstance().getSkill(24, 0);
                                    skills.add(skill);
                                }
                                if (taskId > 9) {
                                    Skill skill = SkillFactory.getInstance().getSkill(27, 0);
                                    skills.add(skill);
                                }
                                if (taskId > 15) {
                                    Skill skill = SkillFactory.getInstance().getSkill(31, 0);
                                    skills.add(skill);
                                }
                                Item tanthu = new Item(824);
                                tanthu.setLock(true);
                                addItemToBag(tanthu);
                                getService().addItem(tanthu);
                                idCharSys = 4;
                                sys = 5;
                                try {
                                    Connection conn = DbManager.getInstance().getConnection(DbManager.GAME);
                                    PreparedStatement stmt = conn
                                            .prepareStatement(
                                                    "UPDATE `players` SET `class` = ? WHERE `id` = ? LIMIT 1;");
                                    try {
                                        stmt.setInt(1, idCharSys);
                                        stmt.setInt(2, this.id);
                                        stmt.executeUpdate();
                                    } finally {
                                        stmt.close();
                                    }
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                                for (int i = 0; i < 4; i++) {
                                    Item da = new Item(158);
                                    da.setLock(true);
                                    da.setQuantity(1);
                                    addItemToBag(da);
                                    getService().addItem(da);
                                }
                                saveData();
                                user.session.closeMessage();
                            } else {
                                getService().npcTaking("61@Hiện tại đã đánh bại " + eff.getParam()
                                        + "/8 Fide ở địa ngục hoặc 1 Golden Fide thì mới có thể hoàn thành nhiệm vụ.");
                            }
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Hoàn thành nhanh (200 zeni)", () -> {
                            if (zeni < 200) {
                                service.warningMessage("Không đủ zeni");
                                return;
                            }
                            if (eff.getParam() >= 8) {
                                serverDialog("Nhiệm vụ đã hoàn thành");
                                return;
                            }
                            addZeni(-200, true);
                            eff.param = 8;
                            zone.getService().playerAddEffect(this, eff);
                        }));
                    } else {
                        menus.add(new Menu(CMDMenu.EXECUTE, "Nhận nhiệm vụ fide", () -> {
                            getService().npcTaking(StringMenu.TASK_FIDE);
                            Effect effect = new Effect(162, TimeUnit.DAYS.toMillis(10), 0);
                            getEm().setEffect(effect);
                        }));
                    }
                    break;
                case 59:
                    menus.add(new Menu(CMDMenu.EXECUTE, "Phòng thời gian (110 zeni)", () -> {
                        if (timeZoom > System.currentTimeMillis()) {
                            TimeZoom zoom = TimeZoom.getZoom(level(), (byte) 0);
                            if (zoom != null) {
                                zoom.joinZone(this);
                            } else {
                                TimeZoom zoom1 = new TimeZoom(level(), (byte) 0);
                                addWorld(zoom1);
                                zoom1.joinZone(this);
                                TimeZoom.addZoom(zoom1);
                            }
                            return;
                        }
                        if (taskId == 9 && taskMain != null && taskMain.index == 0) {
                            updateTaskCount(1);
                            timeZoom = System.currentTimeMillis() + 120000;
                            TimeZoom zoom1 = new TimeZoom(level(), (byte) 0);
                            addWorld(zoom1);
                            zoom1.joinZone(this);
                            TimeZoom.addZoom(zoom1);
                            Effect effect = new Effect(116, 120000, 0);
                            getEm().setEffect(effect);
                            return;
                        }
//                        if (zeni < 9999999) {
//                            service.warningMessage("Phòng thời gian tạm đóng để đua top diễn ra căng thẳng hơn");
//                            return;
//                        }
                        if (zeni < 110) {
                            service.warningMessage("Không đủ zeni");
                            return;
                        }
                        addZeni(-110, true);
                        timeZoom = System.currentTimeMillis() + TimeUnit.HOURS.toMillis(5);
                        TimeZoom zoom1 = new TimeZoom(level(), (byte) 0);
                        addWorld(zoom1);
                        zoom1.joinZone(this);
                        TimeZoom.addZoom(zoom1);
                        Effect effect = new Effect(116, TimeUnit.HOURS.toMillis(5), 0);
                        getEm().setEffect(effect);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Địa ngục", () -> {
                        // serverDialog("Địa ngục đang chờ update !!!! Nếu nhiệm vụ tới đây thì hãy đi
                        // cày tiếp.");
                        menus.clear();
                        menus.add(new Menu(CMDMenu.EXECUTE, "Tham gia (còn " + countHell + " lượt)", () -> {
                            Hell old = Hell.findHellById(this.id);
                            if (old != null && !old.isClosed()) {
                                addWorld(old);
                                old.joinZone(this);
                                return;
                            }
                            if (countHell < 1) {
                                service.serverDialog("Hết lượt tham gia");
                                return;
                            }
                            if (exp < 17850) {
                                service.serverDialog("Cần ít nhất 17.850 sức mạnh để tham gia");
                                return;
                            }
                            if (getGroup() == null) {
                                countHell--;
                                Hell hell = new Hell(getTypeSucManh());
                                addWorld(hell);
                                hell.joinZone(this);
                                Hell.addHell(hell);
                            } else {
                                if (this.group.getIndexById(this.id) != 0) {
                                    serverDialog("Phải là trưởng nhóm mới có thể mở phó bản");
                                } else {
                                    List<Char> chars = this.getGroup().getCharsInZone(zone.map.id, zone.id);
                                    if (chars.size() < getGroup().getNumberMember()) {
                                        serverDialog("Vui lòng tập hợp đủ thành viên trước khi tham gia");
                                        return;
                                    }
                                    for (Char _char : chars) {
                                        if (_char != null && !_char.isCleaned && _char != this && !_char.isDead) {
                                            if (_char.countHell < 1) {
                                                serverDialog("Người chơi " + _char.name + " không còn lượt tham gia");
                                                return;
                                            }
                                            if (_char.getTypeSucManh() != getTypeSucManh()) {
                                                serverDialog(
                                                        "Người chơi " + _char.name + " chênh lệch sức mạnh quá lớn");
                                                return;
                                            }
                                        }
                                    }
                                    Hell hell = new Hell(getTypeSucManh());
                                    Hell.addHell(hell);
                                    for (Char _char : chars) {
                                        try {
                                            if (_char != null && !_char.isCleaned && !_char.isDead) {
                                                _char.countHell--;
                                                _char.addWorld(hell);
                                                hell.joinZone(_char);
                                            }
                                        } catch (Exception e) {

                                        }
                                    }
                                }
                            }
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Thưởng tích luỹ (" + pointHell + " điểm)", () -> {
                            if (pointHell == 0) {
                                service.serverDialog("Không có điểm thưởng");
                                return;
                            }
                            addCoin(pointHell * 5000, true);
                            addClanPoint(pointHell / 200);
                            if (pointHell > 200) {
                                Item item = new Item(697);
                                item.setQuantity(pointHell / 200);
                                item.setLock(true);
                                addItemToBag(item);
                                getService().addItem(item);
                            }
                            pointHell = 0;
                        }));
                        getService().openUIMenu(identifer);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Phòng thời gian (220 zeni)", () -> {
                        if (timeZoom > System.currentTimeMillis()) {
                            TimeZoom zoom = TimeZoom.getZoom(level(), (byte) 0);
                            if (zoom != null) {
                                zoom.joinZone(this);
                            } else {
                                TimeZoom zoom1 = new TimeZoom(level(), (byte) 0);
                                addWorld(zoom1);
                                zoom1.joinZone(this);
                                TimeZoom.addZoom(zoom1);
                            }
                            return;
                        }
//                        if (zeni < 9999999) {
//                            service.warningMessage("Phòng thời gian tạm đóng để đua top diễn ra căng thẳng hơn");
//                            return;
//                        }
                        if (zeni < 220) {
                            service.warningMessage("Không đủ zeni");
                            return;
                        }
                        addZeni(-220, true);
                        
                        timeZoom = System.currentTimeMillis() + TimeUnit.HOURS.toMillis(10);
                        TimeZoom zoom1 = new TimeZoom(level(), (byte) 0);
                        addWorld(zoom1);
                        zoom1.joinZone(this);
                        TimeZoom.addZoom(zoom1);
                        Effect effect = new Effect(116, TimeUnit.HOURS.toMillis(10), 0);
                        getEm().setEffect(effect);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Hướng dẫn", () -> {

                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Đổi ngọc rồng trái đất", () -> {
                        menus.clear();
                        menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng 1 sao", () -> {
                            if (ballZ < 10000) {
                                getService().sendTextNPC("Cần 20.000 Ballz, 200 ngọc thô sơ đổi được ngọc rồng 2 sao",
                                        "");
                                return;
                            }
                            if (getSlotNull() == 0) {
                                warningBagFull();
                                return;
                            }
                            if (ballZ > 10000 && removeItems(838, 100)) {
                                addBallz(-10000, true);
                                Item item = new Item(839);
                                item.setLock(true);
                                addItemToBag(item);
                                getService().addItem(item);
                            } else {
                                getService().sendTextNPC("Cần 10.000 Ballz, 100 ngọc thô sơ đổi được ngọc rồng 1 sao",
                                        "");
                            }
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng 2 sao", () -> {
                            if (ballZ < 20000) {
                                getService().sendTextNPC("Cần 20.000 Ballz, 200 ngọc thô sơ đổi được ngọc rồng 2 sao",
                                        "");
                                return;
                            }
                            if (getSlotNull() == 0) {
                                warningBagFull();
                                return;
                            }
                            if (removeItems(838, 200)) {
                                addBallz(-20000, true);
                                Item item = new Item(840);
                                item.setLock(true);
                                addItemToBag(item);
                                getService().addItem(item);
                                getService().updateIndexBag();
                            } else {
                                getService().sendTextNPC("Cần 20.000 Ballz, 200 ngọc thô sơ đổi được ngọc rồng 2 sao",
                                        "");
                            }
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng 3 sao", () -> {
                            if (ballZ < 30000) {
                                getService().sendTextNPC("Cần 30.000 Ballz, 300 ngọc thô sơ đổi được ngọc rồng 3 sao",
                                        "");
                                return;
                            }
                            if (getSlotNull() == 0) {
                                warningBagFull();
                                return;
                            }
                            if (removeItems(838, 300) && ballZ > 30000) {
                                addBallz(-30000, true);
                                Item item = new Item(841);
                                item.setLock(true);
                                addItemToBag(item);
                                getService().addItem(item);
                                getService().updateIndexBag();
                            } else {
                                getService().sendTextNPC("Cần 30.000 Ballz, 300 ngọc thô sơ đổi được ngọc rồng 3 sao",
                                        "");
                            }
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng 4 sao", () -> {
                            if (ballZ < 40000) {
                                getService().sendTextNPC("Cần 40.000 Ballz, 400 ngọc thô sơ đổi được ngọc rồng 4 sao",
                                        "");
                                return;
                            }
                            if (getSlotNull() == 0) {
                                warningBagFull();
                                return;
                            }
                            if (removeItems(838, 400) && ballZ > 40000) {
                                addBallz(-20000, true);
                                Item item = new Item(842);
                                item.setLock(true);
                                addItemToBag(item);
                                getService().addItem(item);
                                getService().updateIndexBag();
                            } else {
                                getService().sendTextNPC("Cần 40.000 Ballz, 400 ngọc thô sơ đổi được ngọc rồng 4 sao",
                                        "");
                            }
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng 5 sao", () -> {
                            if (ballZ < 50000) {
                                getService().sendTextNPC("Cần 50.000 Ballz, 500 ngọc thô sơ đổi được ngọc rồng 5 sao",
                                        "");
                                return;
                            }
                            if (getSlotNull() == 0) {
                                warningBagFull();
                                return;
                            }
                            if (removeItems(838, 500) && ballZ > 50000) {
                                addBallz(-50000, true);
                                Item item = new Item(843);
                                item.setLock(true);
                                addItemToBag(item);
                                getService().addItem(item);
                                getService().updateIndexBag();
                            } else {
                                getService().sendTextNPC("Cần 50.000 Ballz, 500 ngọc thô sơ đổi được ngọc rồng 5 sao",
                                        "");
                            }
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng 6 sao", () -> {
                            if (ballZ < 60000) {
                                getService().sendTextNPC("Cần 60.000 Ballz, 600 ngọc thô sơ đổi được ngọc rồng 6 sao",
                                        "");
                                return;
                            }
                            if (getSlotNull() == 0) {
                                warningBagFull();
                                return;
                            }
                            if (removeItems(838, 600) && ballZ > 60000) {
                                addBallz(-60000, true);
                                Item item = new Item(844);
                                item.setLock(true);
                                addItemToBag(item);
                                getService().addItem(item);
                                getService().updateIndexBag();
                            } else {
                                getService().sendTextNPC("Cần 60.000 Ballz, 600 ngọc thô sơ đổi được ngọc rồng 6 sao",
                                        "");
                            }
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng 7 sao", () -> {
                            if (ballZ < 70000) {
                                getService().sendTextNPC("Cần 70.000 Ballz, 700 ngọc thô sơ đổi được ngọc rồng 7 sao",
                                        "");
                                return;
                            }
                            if (getSlotNull() == 0) {
                                warningBagFull();
                                return;
                            }
                            if (removeItems(838, 700) && ballZ > 70000) {
                                addBallz(-70000, true);
                                Item item = new Item(845);
                                item.setLock(true);
                                addItemToBag(item);
                                getService().addItem(item);
                                getService().updateIndexBag();
                            } else {
                                getService().sendTextNPC("Cần 70.000 Ballz, 700 ngọc thô sơ đổi được ngọc rồng 7 sao",
                                        "");
                            }
                        }));
                        getService().openUIMenu(identifer);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Đổi ngọc sao đen", () -> {
                        menus.clear();
                        menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng sao đen 1 sao", () -> {
                            if (getSlotNull() == 0) {
                                warningBagFull();
                                return;
                            }
                            if (ballZ < 1000) {
                                getService().sendTextNPC(
                                        "Cần 1.000 Ballz, 7000 ngọc thô sơ đen đổi được ngọc rồng đen 1 sao", "");
                                return;
                            }
                            if (removeItems(910, 7000) && ballZ > 1000) {
                                addBallz(-1000, true);
                                Item item = new Item(917);
                                item.setLock(true);
                                addItemToBag(item);
                                getService().addItem(item);
                                getService().updateIndexBag();
                            } else {
                                getService().sendTextNPC(
                                        "Cần 1.000 Ballz, 7000 ngọc thô sơ đen đổi được ngọc rồng đen 1 sao", "");
                            }
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng sao đen 2 sao", () -> {
                            if (getSlotNull() == 0) {
                                warningBagFull();
                                return;
                            }
                            if (ballZ < 2000) {
                                getService().sendTextNPC(
                                        "Cần 2.000 Ballz, 6000 ngọc thô sơ đen đổi được ngọc rồng đen 2 sao", "");
                                return;
                            }
                            if (removeItems(910, 6000) && ballZ > 2000) {
                                addBallz(-2000, true);
                                Item item = new Item(916);
                                item.setLock(true);
                                addItemToBag(item);
                                getService().addItem(item);
                                getService().updateIndexBag();
                            } else {
                                getService().sendTextNPC(
                                        "Cần 2.000 Ballz, 6000 ngọc thô sơ đen đổi được ngọc rồng đen 2 sao", "");
                            }
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng sao đen 3 sao", () -> {
                            if (getSlotNull() == 0) {
                                warningBagFull();
                                return;
                            }
                            if (ballZ < 3000) {
                                getService().sendTextNPC(
                                        "Cần 3.000 Ballz, 5000 ngọc thô sơ đen đổi được ngọc rồng đen 3 sao", "");
                                return;
                            }
                            if (removeItems(910, 5000) && ballZ > 3000) {
                                addBallz(-3000, true);
                                Item item = new Item(915);
                                item.setLock(true);
                                addItemToBag(item);
                                getService().addItem(item);
                                getService().updateIndexBag();
                            } else {
                                getService().sendTextNPC(
                                        "Cần 3.000 Ballz, 5000 ngọc thô sơ đen đổi được ngọc rồng đen 3 sao", "");
                            }
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng sao đen 4 sao", () -> {
                            if (getSlotNull() == 0) {
                                warningBagFull();
                                return;
                            }
                            if (ballZ < 4000) {
                                getService().sendTextNPC(
                                        "Cần 4.000 Ballz, 4000 ngọc thô sơ đen đổi được ngọc rồng đen 4 sao", "");
                                return;
                            }
                            if (removeItems(910, 4000) && ballZ > 4000) {
                                addBallz(-4000, true);
                                Item item = new Item(914);
                                item.setLock(true);
                                addItemToBag(item);
                                getService().addItem(item);
                                getService().updateIndexBag();
                            } else {
                                getService().sendTextNPC(
                                        "Cần 4.000 Ballz, 4000 ngọc thô sơ đen đổi được ngọc rồng đen 4 sao", "");
                            }
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng sao đen 5 sao", () -> {
                            if (getSlotNull() == 0) {
                                warningBagFull();
                                return;
                            }
                            if (ballZ < 5000) {
                                getService().sendTextNPC(
                                        "Cần 5.000 Ballz, 3000 ngọc thô sơ đen đổi được ngọc rồng đen 5 sao", "");
                                return;
                            }
                            if (removeItems(910, 3000) && ballZ > 5000) {
                                addBallz(-5000, true);
                                Item item = new Item(913);
                                item.setLock(true);
                                addItemToBag(item);
                                getService().addItem(item);
                                getService().updateIndexBag();
                            } else {
                                getService().sendTextNPC(
                                        "Cần 5.000 Ballz, 3000 ngọc thô sơ đen đổi được ngọc rồng đen 5 sao", "");
                            }
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng sao đen 6 sao", () -> {
                            if (getSlotNull() == 0) {
                                warningBagFull();
                                return;
                            }
                            if (ballZ < 6000) {
                                getService().sendTextNPC(
                                        "Cần 6.000 Ballz, 2000 ngọc thô sơ đen đổi được ngọc rồng đen 6 sao", "");
                                return;
                            }
                            if (removeItems(910, 2000) && ballZ > 6000) {
                                addBallz(-6000, true);
                                Item item = new Item(912);
                                item.setLock(true);
                                addItemToBag(item);
                                getService().addItem(item);
                                getService().updateIndexBag();
                            } else {
                                getService().sendTextNPC(
                                        "Cần 6.000 Ballz, 2000 ngọc thô sơ đen đổi được ngọc rồng đen 6 sao", "");
                            }
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng sao đen 7 sao", () -> {
                            if (getSlotNull() == 0) {
                                warningBagFull();
                                return;
                            }
                            if (ballZ < 7000) {
                                getService().sendTextNPC(
                                        "Cần 7.000 Ballz, 1000 ngọc thô sơ đen đổi được ngọc rồng đen 7 sao", "");
                                return;
                            }
                            if (removeItems(910, 1000) && ballZ > 7000) {
                                addBallz(-7000, true);
                                Item item = new Item(911);
                                item.setLock(true);
                                addItemToBag(item);
                                getService().addItem(item);
                                getService().updateIndexBag();
                            } else {
                                getService().sendTextNPC(
                                        "Cần 7.000 Ballz, 1000 ngọc thô sơ đen đổi được ngọc rồng đen 7 sao", "");
                            }
                        }));
                        getService().openUIMenu(identifer);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Đổi ngọc rồng Cerealian", () -> {
                        menus.clear();
                        menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng Cerealian 1 sao", () -> {
                            if (ballZ < 10000) {
                                getService().sendTextNPC("Cần 10.000 Ballz, 100 ngọc thô sơ", "");
                                return;
                            }
                            if (getSlotNull() == 0) {
                                warningBagFull();
                                return;
                            }
                            if (removeItems(838, 100) && ballZ > 10000) {
                                addBallz(-10000, true);
                                Item item = new Item(1045);
                                item.setLock(true);
                                addItemToBag(item);
                                getService().addItem(item);
                            } else {
                                getService().sendTextNPC("Cần 10.000 Ballz, 100 ngọc thô sơ", "");
                            }
                        }));
                        menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng Cerealian 2 sao", () -> {
                            if (ballZ < 20000) {
                                getService().sendTextNPC("Cần 20.000 Ballz, 200 ngọc thô sơ", "");
                                return;
                            }
                            if (getSlotNull() == 0) {
                                warningBagFull();
                                return;
                            }
                            if (removeItems(838, 200) && ballZ > 20000) {
                                addBallz(-20000, true);
                                Item item = new Item(1046);
                                item.setLock(true);
                                addItemToBag(item);
                                getService().addItem(item);
                            } else {
                                getService().sendTextNPC("Cần 20.000 Ballz, 200 ngọc thô sơ", "");
                            }
                        }));
                        getService().openUIMenu(identifer);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Đổi ngọc rồng Namếc", () -> {

                    }));
                    break;
                case 60:
                    menus.add(new Menu(CMDMenu.EXECUTE, "Nhiệm vụ PôPô cấp", () -> {
                        menus.clear();
                        menus.add(new Menu(CMDMenu.EXECUTE, "Nhận nhiệm vụ(100 kim cương)", () -> {
                            if (kimCuong < 100) {
                                service.warningMessage("Không đủ kim cương");
                                return;
                            }
                        }));
                        getService().openUIMenu(identifer);
                    }));
                    menus.add(new Menu(CMDMenu.EXECUTE, "Hướng dẫn", () -> {
                        service.openGUI(111);
                        service.openGUIPoPo();
                    }));
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Mail createMail(String sender, String title, String content, int ballZ, int coin, int zeni, Item item) {
        Mail mail = new Mail();
        mail.id = mailManager.getID();
        mail.setSender(sender);
        mail.setTitle(title);
        mail.setContent(content);
        mail.setBallz(ballZ);
        mail.setCoin(coin);
        mail.setZeni(zeni);
        if (item != null) {
            mail.setItem(item);
        }
        mail.setTime((int) ((System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7)) / 1000));
        return mail;
    }

    public void writeItemBody(Message m) {
        try {
            List<Item> items = VDTTUtlis.cleanArrayItem(body);
            m.writer().writeByte(items.size());
            for (int i = 0; i < items.size(); i++) {
                Item item = items.get(i);
                if (item != null) {
                    m.writer().writeShort(item.id);
                    m.writer().writeBoolean(item.isLock);
                    m.writer().writeLong(item.expire);
                    m.writer().writeByte(item.sys);
                    m.writer().writeByte(item.upgrade);
                    m.writeUTF(item.strOption);
                    m.writeUTF(item.nameCreate);
                }
            }
        } catch (Exception e) {

        }

    }

    public void writeItemMount(Message m) {
        try {
            List<Item> items = VDTTUtlis.cleanArrayItem(mount);
            m.writer().writeByte(items.size());
            for (int i = 0; i < items.size(); i++) {
                Item item = items.get(i);
                if (item != null) {
                    m.writer().writeShort(item.id);
                    m.writer().writeBoolean(item.isLock);
                    m.writer().writeLong(item.expire);
                    m.writer().writeByte(item.sys);
                    m.writer().writeByte(item.upgrade);
                    m.writer().writeByte(item.template.type - 17);
                    m.writeUTF(item.strOption);
                    m.writeUTF(item.nameCreate);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void writeItemBody2(Message m) {
        try {
            List<Item> items = VDTTUtlis.cleanArrayItem(body2);
            m.writer().writeByte(items.size());
            for (int i = 0; i < items.size(); i++) {
                Item item = items.get(i);
                if (item != null) {
                    m.writer().writeShort(item.id);
                    m.writer().writeBoolean(item.isLock);
                    m.writer().writeLong(item.expire);
                    m.writer().writeByte(item.sys);
                    m.writer().writeByte(item.upgrade);
                    m.writeUTF(item.strOption);
                    m.writeUTF(item.nameCreate);
                }
            }
        } catch (Exception e) {

        }

    }

    public void itemBagToBox(Message ms) {
        try {
            if (trade != null) {
                warningTrade();
                return;
            }
            short indexUI = ms.reader().readShort();
            if (indexUI < 0 || indexUI > this.numberCellBag) {
                return;
            }
            Item item = this.bag[indexUI];
            if (item == null) {
                return;
            }
            if (item.id == 724) {
                service.serverDialog("Không thể chuyển đậu thần vào rương");
                return;
            }
            if (item.isExpired()) {
                removeItem(item.index, 1, true);
                return;
            }
            itemBagToBox(item);
        } catch (Exception ex) {
            Log.error("item bag to box err: " + ex.getMessage(), ex);
            getService().serverDialog(ex.getMessage());
        }
    }

    public int getIndexItemByIdInBox(int id, boolean isLock) {
        for (Item item : this.box) {
            if (item != null && item.id == id && item.isLock == isLock) {
                return item.index;
            }
        }
        return -1;
    }

    public int getQuantityItemById(int id) {
        int number = 0;
        try {
            for (byte i = 0; i < this.bag.length; i++) {
                Item item = this.bag[i];
                if (item != null && item.id == id) {
                    number += item.getQuantity();
                }
            }
        } catch (Exception e) {
        }
        return number;
    }

    public void itemBagToBox(Item item) {
        try {
            int index = getIndexItemByIdInBox(item.id, item.isLock);
            if (index == -1 || !box[index].getTemplate().isXepChong || box[index].hasExpire()
                    || item.isLock != box[index].isLock) {
                for (int i = 0; i < this.numberCellBox; i++) {
                    if (box[i] == null) {
                        int indexM = item.index;
                        item.index = i;
                        box[i] = item;
                        bag[indexM] = null;
                        getService().itemBagToBox(indexM, i);
                        return;
                    }
                }
                serverDialog("Rương đồ không đủ chỗ trống");
                return;
            } else {
                box[index].add(item.getQuantity());
                getService().itemBagToBox(item.index, index);
                bag[item.index] = null;
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void serverDialog(String str) {
        getService().serverDialog(str);
    }

    public void itemBoxToBag(Message ms) {
        try {
            if (trade != null) {
                warningTrade();
                return;
            }
            short indexUI = ms.reader().readShort();
            if (indexUI < 0 || indexUI > this.numberCellBox) {
                return;
            }
            Item item = this.box[indexUI];
            if (item == null) {
                return;
            }
            if (item.isExpired()) {
                box[indexUI] = null;
                return;
            }
            if (taskId == 0 && getItemStepTask() == item.id) {
                updateTaskCount(1);
            }
            itemBoxToBag(item);
        } catch (Exception e) {
            Log.error("item box to bag err: " + e.getMessage(), e);
            getService().serverDialog(e.getMessage());
        }
    }

    public void itemBoxToBag(Item item) {
        try {
            int index = getIndexItemByIdInBag(item.id, item.isLock);
            if (index == -1 || !bag[index].getTemplate().isXepChong || bag[index].hasExpire()
                    || item.isLock != bag[index].isLock) {
                for (int i = 0; i < this.numberCellBag; i++) {
                    if (bag[i] == null) {
                        int indexM = item.index;
                        item.index = i;
                        bag[i] = item;
                        box[indexM] = null;
                        getService().itemBoxToBag(indexM, i);
                        return;
                    }
                }
                warningBagFull();
                return;
            } else {
                bag[index].add(item.getQuantity());
                box[item.index] = null;
                getService().itemBoxToBag(item.index, index);
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void wakeUpFromDead(Message ms) {
        try {
            if (!this.isDead || zone.map.isVoDai()) {
                return;
            }
            if (!zone.map.isTrainZone()) {
                if (!removeDiamond(1)) {
                    getService().serverMessage("Không đủ kim cương");
                    return;
                }
            }
            wakeUpFromDead();
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public void wakeUpFromDead() {
        try {
            if (!this.isDead) {
                return;
            }
            Effect eff = new Effect(46, 10000, 0);
            getEm().setEffect(eff);
            this.isDead = false;
            this.hp = this.maxHP;
            this.mp = this.maxMP;
            zone.getService().meLive(this);
            if (zone.map.isNgucTu() || zone.map.isSaoDen()) {
                countDead++;
                if (countDead >= 5) {
                    countDead = 0;
                    joinZone(54, 0, 1);
                }
            }
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public boolean removeDiamond(int num) {
        kimCuong = getQuantityItemById(160);
        if (kimCuong < num || kimCuong < 1) {
            return false;
        }
        kimCuong -= num;
        removeItems(160, num);
        getService().serverMessage("Bạn bị -" + num + " kim cương");
        return true;
    }

    public void addHp(int number) {
        if (number < 0) {
            if (haveOptions[412]) {
                if (pet != null && !pet.isDead && pet.typePet == 1 && getEm().findByID(144) == null) {
                    int num = number * (options[412] / 10) / 100;
                    pet.addHp(num);
                    zone.getService().updatePet(id, pet.typePet, pet.hp, pet.maxHP, pet.mp, pet.maxMP);
                    if (pet.hp <= 0) {
                        pet.startDie();
                        pet.typePet = 0;
                        zone.getService().updatePet(id, pet.typePet, pet.hp, pet.maxHP, pet.mp, pet.maxMP);
                    }
                    number = number - num;
                }
            }
        }
        this.hp += number;
        if (this.hp > this.maxHP) {
            this.hp = this.maxHP;
        }
        getService().updateHP();
        zone.getService().updateHP(this);
    }

    public void addMp(int number) {
        this.mp += number;
        if (this.mp > this.maxMP) {
            this.mp = this.maxMP;
        }
        getService().updateMP();
        zone.getService().updateMP(this);
    }

    public void startDie() {
        if (trade != null) {
            trade.closeUITrade();
        }
        if (isTest && testCharId != 0) {
            Char player = zone.findCharById(testCharId);
            if (player != null) {
                testEnd(3, player);
            }
        }
        if (isCuuSat) {
            clearCuuSat(true);
        }
        hp = 0;
        isDead = true;
//        if (zone.findBossInZone()) {
//
//        }
//        if (zone.map.isNamec()) {
//            joinZone(86, 0, 0);
//        }

    }

    public void requestItem(byte type) {
        try {
            Store storeData = StoreManager.getInstance().find(type);
            if (storeData != null) {
                storeData.show(this);
            } else {
                getService().showShopNoItem(type);
            }
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public int getSlotNull() {
        int number = 0;
        for (int i = 0; i < this.numberCellBag; i++) {
            if (bag[i] == null) {
                number++;
            }
        }
        return number;
    }

    public void sortItem(Message ms) {
        try {
            if (trade != null) {
                warningTrade();
                return;
            }
            byte type = ms.reader().readByte();
            if (type == 0) {
                sortItemBag();
            } else if (type == 1) {
                sortItemBox();
            }
            getService().sortItem(type);
            getService().updateIndexBag();
        } catch (Exception e) {
            Log.error("err: " + e.getMessage(), e);
        }
    }

    public void sortItemBag() {
        try {
            Item[] var0 = bag;
            Vector var1 = new Vector();

            for (int var2 = 0; var2 < var0.length; ++var2) {
                if (var0[var2] != null) {
                    var1.add(var0[var2]);
                }

                var0[var2] = null;
            }

            for (int var4 = 0; var4 < var1.size(); ++var4) {
                Item var7;
                if ((var7 = (Item) var1.get(var4)).getTemplate().isXepChong) {
                    for (int var5 = var1.size() - 1; var5 > var4; --var5) {
                        Item var3;
                        if ((var3 = (Item) var1.get(var5)).id == var7.id && var3.isLock == var7.isLock
                                && var3.expire == var7.expire) {
                            var7.setQuantity(var7.getQuantity() + var3.getQuantity());
                            var1.remove(var5);
                        }
                    }
                }
            }

            for (short var8 = 0; var8 < var1.size(); var0[var8].index = var8++) {
                var0[var8] = (Item) var1.get(var8);
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }
    }

    public void sortItemBox() {
        try {
            Item[] var0 = box;
            Vector var1 = new Vector();

            for (int var2 = 0; var2 < var0.length; ++var2) {
                if (var0[var2] != null) {
                    var1.add(var0[var2]);
                }

                var0[var2] = null;
            }

            for (int var4 = 0; var4 < var1.size(); ++var4) {
                Item var7;
                if ((var7 = (Item) var1.get(var4)).getTemplate().isXepChong) {
                    for (int var5 = var1.size() - 1; var5 > var4; --var5) {
                        Item var3;
                        if ((var3 = (Item) var1.get(var5)).id == var7.id && var3.isLock == var7.isLock
                                && var3.expire == var7.expire) {
                            var7.setQuantity(var7.getQuantity() + var3.getQuantity());
                            var1.remove(var5);
                        }
                    }
                }
            }

            for (short var8 = 0; var8 < var1.size(); var0[var8].index = var8++) {
                var0[var8] = (Item) var1.get(var8);
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }
    }

    public void buyItem(Message ms) {
        try {
            if (trade != null) {
                warningTrade();
                return;
            }
            short id = ms.reader().readShort();
            int quantity = ms.reader().readShort();
            if (quantity < 1 || quantity > 10000) {
                serverDialog("chỉ có thể mua Số lượng lớn hơn 0 và nhỏ hơn 10000!");
                return;
            }
         //   Log.debug("buy item: " + id + " quantity: " + quantity);
            ItemStore itemBuy = StoreManager.getInstance().findItemStore(id);
            if (itemBuy == null) {
                serverDialog("Không tìm thấy vật phẩm");
                return;
            }
            if (itemBuy.getType() == 38) {
                // if (itemBuy.getRequire() > pointKame) {
                // serverDialog("Không đủ điểm Kame");
                // return;
                // }
            }
            ItemTemplate template = itemBuy.getTemplate();
            List<Item> items1 = itemBuy.items;
            int slotNull = getSlotNull();
            if ((template.isXepChong && slotNull == 0) || (!template.isXepChong && slotNull < quantity)
                    || (items1.size() > 0 && slotNull < items1.size())) {
                warningBagFull();
                return;
            }
            int giaCoin = itemBuy.getCoin() * quantity;
            int giaBallz = itemBuy.getBallz() * quantity;
            int giaKimCuong = itemBuy.getDiamond() * quantity;
            int giaZeni = itemBuy.getZeni() * quantity;
            int giaCoinClan = itemBuy.getCoinClan() * quantity;
            if (giaCoin < 0 || giaBallz < 0 || giaKimCuong < 0 || giaZeni < 0 || giaCoinClan < 0) {
                return;
            }
            if (giaCoin > 0) {
                if (coin < giaCoin) {
                    serverDialog("Không đủ tiền");
                    return;
                }
            } else if (giaBallz > 0) {
                if (ballZ < giaBallz) {
                    serverDialog("Không đủ tiền");
                    return;
                }
            } else if (giaZeni > 0) {
                if (zeni < giaZeni) {
                    serverDialog("Không đủ tiền");
                    return;
                }
            } else if (giaCoinClan > 0) {
                // if (coinClan < giaCoinClan) {
                // serverDialog("Không đủ tiền");
                // return;
                // }
            }

            addBallz(-giaBallz, false);
            addZeni(-giaZeni, false);
            addCoin(-giaCoin, false);
            if (giaKimCuong > 0) {
                if (!removeItems(160, giaKimCuong)) {
                    serverDialog("Không đủ kim cương");
                    return;
                }
            }

            int n = quantity;
            if (itemBuy.getTemplate().isXepChong) {
                n = 1;
            }
            if (itemBuy.getId() == 23) {
                Item it = new Item(838);
                it.setLock(true);
                it.setQuantity(10 * quantity);
                addItemToBag(it);
                getService().addItem(it);
                getService().updateIndexBag();
                return;
            }
            List<Item> items = new ArrayList<>();
            if (itemBuy.items.size() > 0) {
                Reward reward = findReward(itemBuy.getItemID());
                if (reward != null) {
                    serverDialog("Bạn đã mua vật phẩm này rồi");
                    return;
                } else {
                    Reward rw = new Reward();
                    rw.type = (short) itemBuy.getItemID();
                    rewardList.add(rw);
                }
                for (int i = 0; i < items1.size(); i++) {
                    Item item = new Item(items1.get(i).id);
                    item.isLock = items1.get(i).isLock;
                    item.setQuantity(items1.get(i).getQuantity());
                    item.setStrOption(items1.get(i).getStrOption());
                    if (item.expire > 0) {
                        item.expire += System.currentTimeMillis();
                    }
                    if (item.getQuantity() <= 0) {
                        item.setQuantity(1);
                    }
                    item.setUpgrade(items1.get(i).getUpgrade());
                    item.createOption();
                    addItemToBag(item);
                    items.add(item);
                }
            } else {
                for (int i = 0; i < n; i++) {
                    Item item = new Item(itemBuy.getItemID());
                    item.setLock(itemBuy.isLock());
                    item.setStrOption(itemBuy.getStrOptions());
                    if (itemBuy.getExpire() > 0) {
                        item.expire = itemBuy.getExpire() + System.currentTimeMillis();
                    }
                    if (item.getTemplate().isXepChong) {
                        item.setQuantity(quantity);
                    } else {
                        item.setQuantity(1);
                    }
                    if (item.getQuantity() <= 0) {
                        item.setQuantity(1);
                    }
                    item.isLock = itemBuy.isLock();
                    item.createOption();
                    addItemToBag(item);
                    items.add(item);
                }
            }
            getService().buyItem(items);
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public void addBallz(int number, boolean isUpdate) {
        if (trade != null) {
            trade.closeUITrade();
        }
        long l = ((long) ballZ) + ((long) number);
        if (l > Integer.MAX_VALUE) {
            l = Integer.MAX_VALUE;
        }
        this.ballZ = (int) l;
        getService().updateBallz(isUpdate);

    }

    public void addZeni(int number, boolean isUpdate) {
        long l = ((long) zeni) + ((long) number);
        if (l > Integer.MAX_VALUE) {
            l = Integer.MAX_VALUE;
        }
        this.zeni = (int) l;
        getService().updateZeni(isUpdate);

    }

    public void addCoin(int number, boolean isUpdate) {
        long l = ((long) coin) + ((long) number);
        if (l > Integer.MAX_VALUE) {
            l = Integer.MAX_VALUE;
        }
        this.coin = (int) l;
        getService().updateCoin(isUpdate);

    }

    public void addZeniLock(int number, boolean isUpdate) {
        long l = ((long) zeniLock) + ((long) number);
        if (l > Integer.MAX_VALUE) {
            l = Integer.MAX_VALUE;
        }
        this.zeniLock = (int) l;
        getService().updateZeniLock(isUpdate);
    }

    public void returnFromDead(Message ms) {
        try {
            this.isDead = false;
            this.hp = this.maxHP;
            this.mp = this.maxMP;
            countDead = 0;
            zone.getService().meLive(this);
            if (zone.map.isNgucTuThuThach()) {
                zone.join(this, 0);
            } else
                MapManager.getInstance().joinZone(this, 86, 0, -1);
        } catch (Exception e) {
            Log.error("err: " + e.getMessage(), e);
        }
    }

    public int findIndexSkillWithCT() {
        for (int i = 0; i < skills.size(); i++) {
            Skill skill = skills.get(i);
            if (skill.getSkillTemplate().i == 1) {
                return i;
            }
        }
        return -1;
    }

    public void confirmMenuItem(Message ms) {
        try {
            if (trade != null) {
                warningTrade();
                return;
            }
            short index = ms.reader().readShort();
            byte type = ms.reader().readByte();
            byte option = 0;
            try {
                option = ms.reader().readByte();
            } catch (Exception e) {

            }
            if (index < 0 || index >= bag.length) {
                return;
            }
            Item item = bag[index];
            if (item == null || item.getQuantity() < 1) {
                return;
            }
            switch (item.id) {
                case 799:
                    if (getSlotNull() < 1) {
                        warningBagFull();
                        return;
                    }
                    removeItem(index, 1, true);
                    Item one = new Item(1038);
                    one.setLock(true);
                    one.expire = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7);
                    one.setQuantity(1);
                    switch (type) {
                        case 0:
                            one.strOption = "346," + VDTTUtlis.nextInt(50, 100);
                            break;
                        case 1:
                            one.strOption = "347," + VDTTUtlis.nextInt(10, 25);
                            break;
                        case 2:
                            one.strOption = "348," + VDTTUtlis.nextInt(10, 25);
                            break;
                    }
                    addItemToBag(one);
                    getService().addItem(one);
                    break;
                case 800:
                    if (getSlotNull() < 1) {
                        warningBagFull();
                        return;
                    }
                    removeItem(index, 1, true);
                    one = new Item(1039);
                    one.expire = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7);
                    one.setLock(true);
                    one.setQuantity(1);
                    switch (type) {
                        case 0:
                            one.strOption = "17," + VDTTUtlis.nextInt(10, 50);
                            break;
                        case 1:
                            one.strOption = "26," + VDTTUtlis.nextInt(10, 50);
                            break;
                        case 2:
                            one.strOption = "27," + VDTTUtlis.nextInt(10, 50);
                            break;
                        case 3:
                            one.strOption = "48," + VDTTUtlis.nextInt(10, 50);
                            break;
                        case 4:
                            one.strOption = "49," + VDTTUtlis.nextInt(10, 50);
                            break;
                        case 5:
                            one.strOption = "50," + VDTTUtlis.nextInt(10, 50);
                            break;
                        case 6:
                            one.strOption = "51," + VDTTUtlis.nextInt(10, 50);
                            break;
                        case 7:
                            one.strOption = "52," + VDTTUtlis.nextInt(10, 50);
                            break;

                    }
                    addItemToBag(one);
                    getService().addItem(one);
                    break;
                case 801:
                    if (getSlotNull() < 1) {
                        warningBagFull();
                        return;
                    }
                    removeItem(index, 1, true);
                    one = new Item(1040);
                    one.setLock(true);
                    one.setQuantity(1);
                    one.expire = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7);
                    switch (type) {
                        case 0:
                            one.strOption = "273," + VDTTUtlis.nextInt(50, 200);
                            break;
                        case 1:
                            one.strOption = "345," + VDTTUtlis.nextInt(50, 200);
                            break;
                        case 2:
                            one.strOption = "359," + VDTTUtlis.nextInt(50, 200);
                            break;

                    }
                    addItemToBag(one);
                    getService().addItem(one);
                    break;
                case 802:
                    if (getSlotNull() < 1) {
                        warningBagFull();
                        return;
                    }
                    removeItem(index, 1, true);
                    one = new Item(1041);
                    one.setLock(true);
                    one.setQuantity(1);
                    one.expire = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7);
                    switch (type) {
                        case 0:
                            one.strOption = "28," + VDTTUtlis.nextInt(50, 200);
                            break;
                        case 1:
                            one.strOption = "351," + VDTTUtlis.nextInt(50, 200);
                            break;
                        case 2:
                            one.strOption = "352," + VDTTUtlis.nextInt(50, 200);
                            break;

                    }
                    addItemToBag(one);
                    getService().addItem(one);
                    break;
                case 803:
                    if (getSlotNull() < 1) {
                        warningBagFull();
                        return;
                    }
                    removeItem(index, 1, true);
                    one = new Item(1042);
                    one.setLock(true);
                    one.setQuantity(1);
                    one.expire = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7);
                    switch (type) {
                        case 0:
                            one.strOption = "353," + VDTTUtlis.nextInt(20, 40);
                            break;
                        case 1:
                            one.strOption = "354," + VDTTUtlis.nextInt(20, 40);
                            break;
                        case 2:
                            one.strOption = "355," + VDTTUtlis.nextInt(20, 40);
                            break;

                    }
                    addItemToBag(one);
                    getService().addItem(one);
                    break;
                case 804:
                    if (getSlotNull() < 1) {
                        warningBagFull();
                        return;
                    }
                    removeItem(index, 1, true);
                    one = new Item(1043);
                    one.setLock(true);
                    one.setQuantity(1);
                    one.expire = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7);
                    switch (type) {
                        case 0:
                            one.strOption = "356," + VDTTUtlis.nextInt(5, 10);
                            break;
                        case 1:
                            one.strOption = "357," + VDTTUtlis.nextInt(5, 10);
                            break;

                    }
                    addItemToBag(one);
                    getService().addItem(one);
                    break;
                case 805:
                    if (getSlotNull() < 1) {
                        warningBagFull();
                        return;
                    }
                    removeItem(index, 1, true);
                    one = new Item(1044);
                    one.setLock(true);
                    one.setQuantity(1);
                    one.expire = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7);
                    switch (type) {
                        case 0:
                            one.strOption = "34," + VDTTUtlis.nextInt(50, 100);
                            break;
                        case 1:
                            one.strOption = "41," + VDTTUtlis.nextInt(50, 100);
                            break;

                    }
                    addItemToBag(one);
                    getService().addItem(one);
                    break;
                case 1037:
                    ItemOption op = item.getItemOption()[0];
                    if (op == null) {
                        return;
                    }
                    List<Item> items = new ArrayList<>();
                    for (int var34 = 0; var34 < body.length; ++var34) {
                        Item var5;
                        if ((var5 = body[var34]) != null
                                && (var5.getTemplate().type == 2 || var5.getTemplate().type == 4
                                || var5.getTemplate().type == 6 || var5.getTemplate().type == 8)) {
                            ItemOption[] var6 = var5.L();
                            boolean check = false;

                            for (int var8 = 0; var8 < var6.length; ++var8) {
                                if (var6[var8].getItemOptionTemplate().type == op.getItemOptionTemplate().type) {
                                    check = true;
                                    break;
                                }
                            }
                            if (check) {
                                items.add(var5);
                            }
                        }
                    }
                    if (items.size() == 0) {
                        return;
                    }
                    if (type < 0 || type > items.size()) {
                        return;
                    }
                    items.get(type).replaceOption(op, option);
                    getService().updateItemBodyChange();
                    zone.getService().updateItemBody(this);
                    setAbility();
                    removeItem(index, 1, true);
                    break;
                case 1039:
                case 1040:
                case 1041:
                case 1042:
                case 1043:
                case 1044:
                case 1038:
                    op = item.getItemOption()[0];
                    if (op == null) {
                        return;
                    }
                    items = new ArrayList<>();
                    for (int var34 = 0; var34 < body.length; ++var34) {
                        Item var5;
                        if ((var5 = body[var34]) != null
                                && (var5.getTemplate().type == 2 || var5.getTemplate().type == 4
                                || var5.getTemplate().type == 6 || var5.getTemplate().type == 8)) {
                            ItemOption[] var6 = var5.L();
                            boolean check = false;

                            for (int var8 = 0; var8 < var6.length; ++var8) {
                                if (var6[var8].getItemOptionTemplate().type == op.getItemOptionTemplate().type) {
                                    check = true;
                                    break;
                                }
                            }
                            if (check) {
                                items.add(var5);
                            }
                        }
                    }
                    if (items.size() == 0) {
                        return;
                    }
                    if (type < 0 || type > items.size()) {
                        return;
                    }
                    items.get(type).replaceOption(op, option);
                    getService().updateItemBodyChange();
                    zone.getService().updateItemBody(this);
                    setAbility();
                    removeItem(index, 1, true);
                    break;
                case 833:
                    if (getSlotNull() < 1) {
                        warningBagFull();
                        return;
                    }
                    removeItem(index, 1, true);
                    Item it = new Item(1037);
                    it.setLock(true);
                    it.setQuantity(1);
                    it.expire = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7);
                    switch (type) {
                        case 0:
                            it.strOption = "335," + VDTTUtlis.nextInt(150, 400);
                            break;
                        case 1:
                            it.strOption = "336," + VDTTUtlis.nextInt(150, 400);
                            break;
                        case 2:
                            it.strOption = "337," + VDTTUtlis.nextInt(40, 100);
                            break;
                        case 3:
                            it.strOption = "338," + VDTTUtlis.nextInt(40, 100);
                            break;
                        case 4:
                            it.strOption = "339," + VDTTUtlis.nextInt(40, 100);
                            break;
                        case 5:
                            it.strOption = "340," + VDTTUtlis.nextInt(40, 100);
                            break;
                        case 6:
                            it.strOption = "341," + VDTTUtlis.nextInt(20, 50);
                            break;
                        case 7:
                            it.strOption = "342," + VDTTUtlis.nextInt(40, 100);
                            break;
                        case 8:
                            it.strOption = "343," + VDTTUtlis.nextInt(20, 50);
                            break;
                        case 9:
                            it.strOption = "344," + VDTTUtlis.nextInt(20, 50);
                            break;
                    }
                    addItemToBag(it);
                    getService().addItem(it);
                    break;
                case 168:
                    switch (type) {
                        case 0:
                            MapManager.getInstance().joinZone(this, 86, 0, 6);
                            break;
                        case 1:
                            MapManager.getInstance().joinZone(this, 67, 0, 6);
                            break;
                        case 2:
                            MapManager.getInstance().joinZone(this, 56, 0, 6);
                            break;
                        case 3:
                            MapManager.getInstance().joinZone(this, 87, 0, 6);
                            break;
                        case 4:
                            MapManager.getInstance().joinZone(this, 83, 0, 6);
                            break;
                    }
                    break;
                case 569:
                case 716:
                case 717:
                case 718:
                case 719:
                case 720:
                    int typeTau = 0;
                    if (item.id == 569) {
                        typeTau = TypeTau.TAU_TRAI_DAT_VIP;
                    } else if (item.id == 716) {
                        typeTau = TypeTau.TAU_FIDE;
                    } else if (item.id == 717) {
                        typeTau = TypeTau.TAU_TUONG_LAI;
                    } else if (item.id == 718) {
                        typeTau = TypeTau.TAU_XAYDA;
                    } else if (item.id == 719) {
                        typeTau = TypeTau.TAU_NAMEC;
                    } else if (item.id == 720) {
                        typeTau = TypeTau.TAU_YARDRAT;
                    }
                    switch (type) {
                        case 0:
                            int mapId = findMapIdByLevel();
                            if (mapId > 0) {
                                MapManager.getInstance().joinZone(this, mapId, 0, typeTau);
                            }
                            break;
                        case 1:
                            MapManager.getInstance().joinZone(this, 86, 0, typeTau);
                            break;
                        case 2:
                            MapManager.getInstance().joinZone(this, 67, 0, typeTau);
                            break;
                        case 3:
                            MapManager.getInstance().joinZone(this, 56, 0, typeTau);
                            break;
                        case 4:
                            MapManager.getInstance().joinZone(this, 87, 0, typeTau);
                            break;
                        case 5:
                            MapManager.getInstance().joinZone(this, 54, 0, typeTau);
                            break;
                        case 6:
                            MapManager.getInstance().joinZone(this, 53, 0, typeTau);
                            break;
                        case 7:
                            MapManager.getInstance().joinZone(this, 83, 0, typeTau);
                            break;
                    }
                    break;
                case 828:
                case 808:
                    int id = 0;
                    switch (type) {
                        case 0:
                            id = 569;
                            break;
                        case 1:
                            id = 716;
                            break;
                        case 2:
                            id = 717;
                            break;
                        case 3:
                            id = 718;
                            break;
                        case 4:
                            id = 719;
                            break;
                        case 5:
                            id = 720;
                            break;
                    }
                    if (id > 0) {
                        removeItem(index, 1, true);
                        Item item1 = new Item(id);
                        if (item.id == 808) {
                            item1.setExpire(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7));
                        }
                        addItemToBag(item1);
                        getService().addItem(item1);
                    }

            }
      //      Log.debug("confirm menu item: " + item.id + " type: " + type + " option: " + option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int findMapIdByLevel() {
        if (exp >= 120000000000l) {
            return 105;
        }
        for (MapTemplate mapTemplate : MapManager.getInstance().getMapTemplates()) {
            if (mapTemplate.mobList.size() < 1)
                continue;
            for (Mob mob : mapTemplate.mobList) {
                int lv = Math.abs(level() - mob.getTemplate().timeThuHoach);
                if (lv <= 3) {
                    return mapTemplate.id;
                }
            }
        }
        return -1;
    }

    public void showInfoGhepCT(Message ms) {
        lockItem.lock();
        try {
            byte size = ms.reader().readByte();
            int numCT = 0;
            Vector<Item> caiTrang = new Vector<>();
            boolean[][] list = new boolean[4][numberCellBag];

            while (ms.reader().available() > 0) {
                byte type = ms.reader().readByte();
                short index = ms.reader().readShort();
                if (index >= 0 && index < checkBag(type).length && !list[type][index]) {
                    list[type][index] = true;
                    Item item = checkBag(type)[index];
                    if (item != null && item.getTemplate().type == 14) {
                        caiTrang.add(item);
                        numCT++;
                    }
                }
            }

            if (numCT == 0) {
                serverDialog("Hãy chọn cải trang!");
                return;
            }
            if (numCT > 22) {
                serverDialog("Chỉ được chọn 22 cải trang!");
                return;
            }

            Item itemShow = caiTrang.get(0).clone();
            List<ItemOption> options1 = new ArrayList<>();
            List<ItemOption> nameCT = new ArrayList<>();
            List<ItemOption> nameOLD = new ArrayList<>();
            Set<Integer> existingIds = new HashSet<>();

            for (Item item : caiTrang) {
                if (item != null && item.strOption != null && !item.strOption.isEmpty()) {
                    for (ItemOption op : item.getItemOption()) {
                        if (op.getId() == 327 && item.id != itemShow.id) {
                            continue;
                        } else if (op.getItemOptionTemplate().type == 14) {
                            nameOLD.add(op);
                        } else
                            options1.add(op);
                    }
                    if (item.id != itemShow.id) {
                        int id = ItemManager.getInstance().findByName(item.getTemplate().name);
                        if (id > -1) {
                            nameCT.add(new ItemOption(id));
                            existingIds.add(id);
                        }
                    }
                }
            }
            // Check for existing combinations
            List<ItemOption> summedOptions = options1.stream()
                    .collect(Collectors.groupingBy(ItemOption::getId, Collectors.summingInt(ItemOption::getParam)))
                    .entrySet().stream()
                    .map(entry -> new ItemOption(entry.getKey(), entry.getValue()))
                    .sorted((o1, o2) -> (o1.getId() == 327) ? -1 : ((o2.getId() == 327) ? 1 : 0))
                    .collect(Collectors.toList());
            int count = 0;
            for (ItemOption op : nameOLD) {
                count++;
                summedOptions.add(op);
            }
            for (ItemOption op : nameCT) {
                count++;
                summedOptions.add(op);
            }
            int level = count;
            int upgradePoints = (level / 3) * 2 + (level % 3 == 2 ? 1 : 0); // Adding remaining points for incomplete
            // sets
            itemShow.setUpgrade((byte) (upgradePoints));
            itemShow.strOption = Item.creatOption(summedOptions.toArray(new ItemOption[0]));
            getService().showCaiTrangGhep(itemShow, caiTrang.size() - 1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lockItem.unlock();
        }
    }

    public void ghepCaiTrang(Message ms) {
        lockItem.lock();
        try {
            byte size = ms.reader().readByte();
            int numCT = 0;
            Vector<Item> caiTrang = new Vector<>();
            byte[] typeTemp = new byte[size];
            short[] indexArr = new short[size];
            boolean[][] list = new boolean[4][numberCellBag];
            int i = 0;
            int lv = 0;
            while (ms.reader().available() > 0) {
                byte type = ms.reader().readByte();
                short index = ms.reader().readShort();
                if (index >= 0 && index < checkBag(type).length && !list[type][index]) {
                    list[type][index] = true;
                    typeTemp[i] = type;
                    indexArr[i] = index;
                    Item item = checkBag(type)[index];
                    if (item != null && item.getTemplate().type == 14) {
                        if (item.getUpgrade() > 0) {
                            serverDialog("Cải trang đã được ghép!Vui lòng tách hết ra trước khi ghép");
                            return;
                        }
                        caiTrang.add(item);
                        numCT++;
                    }
                    i++;
                }
            }
            if (numCT == 0) {
                serverDialog("Hãy chọn cải trang!");
                return;
            }
            if (numCT > 22) {
                serverDialog("Chỉ được chọn 22 cải trang!");
                return;
            }

            Item itemGhep = caiTrang.get(0);
            if (itemGhep.getUpgrade() > 15) {
                serverDialog("Cải trang đã đạt giới hạn ghép!");
                return;
            }
            int ballzPhi = 20000 * (caiTrang.size() - 1);
            if (ballZ < ballzPhi) {
                serverDialog("Không đủ Ballz!");
                return;
            }
            StringBuilder str = new StringBuilder();
            for (Item item : caiTrang) {
                if (item != null) {
                    if (item.getUpgrade() > 0) {
                        return;
                    }
                    if (item.checkOptionByType(14)) {
                        return;
                    }
                    str.append(item.id).append("@").append(item.strOption).append("&");
                    ++lv;
                }
            }
            str.deleteCharAt(str.length() - 1);
            itemGhep.optionGhepCaiTrang = str.toString();
            Vector var10 = new Vector();
            Vector var2 = new Vector();
            for (int var3 = 0; var3 < caiTrang.size(); ++var3) {
                ItemOption[] var4;
                if (caiTrang.get(var3) != null && (var4 = caiTrang.get(var3).L()) != null) {
                    int var5;
                    if (!caiTrang.get(var3).equals(caiTrang.get(0))) {
                        for (var5 = 0; var5 < DataCenter.gI().itemOptionTemplate.length; ++var5) {
                            if (DataCenter.gI().itemOptionTemplate[var5].text.trim().toLowerCase()
                                    .equals(caiTrang.get(var3).getTemplate().name.trim().toLowerCase())) {
                                var2.add(new ItemOption(DataCenter.gI().itemOptionTemplate[var5].id + ",0,0"));
                                break;
                            }
                        }
                    }
                    for (var5 = 0; var5 < var4.length; ++var5) {
                        boolean var6 = true;

                        for (int var7 = 0; var7 < var10.size(); ++var7) {
                            if (((ItemOption) var10.get(var7)).option[0] == var4[var5].option[0]
                                    && var4[var5].option[0] != 327) {
                                ((ItemOption) var10.get(var7))
                                        .c(((ItemOption) var10.get(var7)).option[1] + var4[var5].option[1]);
                                var6 = false;
                                break;
                            }
                        }
                        if (var4[var5].option[0] == 327 && !caiTrang.get(var3).equals(caiTrang.get(0))) {
                            var6 = false;
                        }

                        if (var6) {
                            var10.add(var4[var5]);
                        }
                    }

                }
            }
            var10.addAll(var2);
            itemGhep.strOption = Item.creatOption(var10);

            for (int j = 1; j < size; j++) {
                checkBag(typeTemp[j])[indexArr[j]] = null;
            }
            itemGhep.isLock = true;
            if (lv > 2)
                lv -= 1;
            int upgradePoints = (lv / 3) * 2 + (lv % 3 == 2 ? 1 : 0); // Adding remaining points for incomplete sets
            addBallz(-ballzPhi, true);
            itemGhep.setUpgrade((byte) (upgradePoints));
            getService().ghepCaiTrang(size, typeTemp, indexArr, itemGhep);
            setAbility();
            getService().updateIndexBag();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lockItem.unlock();
        }
    }

    public void itemBagToBody2(Message mss) {
        lockItem.lock();
        try {
            short indexUI = mss.reader().readShort();
            if (indexUI < 0 || indexUI >= numberCellBag) {
                return;
            }
            Item item = bag[indexUI];
            if (item != null && item.isTrangBi()) {
                byte index = item.getTemplate().type;
                if (item.getTemplate().typeChar == sys || item.getTemplate().typeChar == 0) {
                    if (body2[index] != null) {
                        Item it = body2[index].clone();
                        it.index = indexUI;
                        it.isLock = true;
                        item.isLock = true;
                        body2[index] = item;
                        bag[indexUI] = it;
                    } else {
                        body2[index] = item;
                        bag[indexUI] = null;
                    }
                } else {
                    getService().serverMessage("Trang bị không phù hợp với nhân vật");
                    return;
                }
                Log.debug(increaseExtra);
                setAbility();
                getService().updateMPFull();
                getService().updateHPFull();
                getService().showInfo2(this);
                getService().updateItemBody2(indexUI);
                getService().updateIndexBag();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lockItem.unlock();
        }
    }

    public void itemBody2ToBag(Message ms) {
        lockItem.lock();
        try {
            byte indexUI = ms.reader().readByte();
            Item item = body2[indexUI];
            if (item != null) {
                for (int i = 0; i < numberCellBag; i++) {
                    if (bag[i] == null) {
                        item.isLock = true;
                        item.index = i;
                        bag[i] = item;
                        body2[indexUI] = null;
                        getService().itemBody2ToBag(indexUI, i);
                        if (item.isExpired()) {
                            removeItem(i, 1, true);
                        }
                        setAbility();
                        getService().updateHP();
                        getService().updateMP();
                        return;
                    }
                }
                warningBagFull();
                return;
            } else {
                Log.debug("item null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lockItem.unlock();
        }

    }

    public void itemBodyChange(Message ms) {
        try {
            int indexChangeItemBody = ms.reader().readByte();
            int indexChange = -1;
            if (indexChangeItemBody == 0) {
                indexChange = 2;
            } else if (indexChangeItemBody == 1) {
                indexChange = 4;
            } else if (indexChangeItemBody == 2) {
                indexChange = 6;
            } else if (indexChangeItemBody == 3) {
                indexChange = 8;
            } else if (indexChangeItemBody == 4) {
                indexChange = 14;
            }
            if (indexChange == -1) {
                return;
            }
            if (body[indexChange] == null || body2[indexChange] == null) {
                return;
            }
            Item item1 = body[indexChange].clone();
            Item item2 = body2[indexChange].clone();
            if (item1 != null && item2 != null) {
                body[indexChange] = item2;
                body2[indexChange] = item1;
                setAbility();
                if (item2.getTemplate().type == 14) {
                    if (options[327] > 0) {
                        reloadSkillCaiTrang();
                    } else {
                        int indexSkillWithCT = findIndexSkillWithCT();
                        if (indexSkillWithCT != -1) {
                            skills.remove(indexSkillWithCT);
                            getService().updateSkill();
                        }

                    }
                }
                getService().updateHP();
                getService().updateMP();
                getService().updateItemBodyChange();
                zone.getService().updateItemBody(this);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showCaiTrangTach(Message mss) {
        try {
            byte type = mss.reader().readByte();
            short index = mss.reader().readShort();
            Item item = checkBag(type)[index];
            if (item != null) {
                if (item.getOptionGhepCaiTrang() != null && !item.getOptionGhepCaiTrang().isEmpty()) {
                    String[] itemData = item.getOptionGhepCaiTrang().split("&");
                    List<Item> items = new ArrayList<>();
                    for (String str : itemData) {
                        String[] data = str.split("@");
                        Item item1 = new Item(Integer.parseInt(data[0]));
                        item1.setStrOption(data[1]);
                        items.add(item1);
                    }
                    getService().showCaiTrangTach(items);
                }
            }
        } catch (Exception e) {
            Log.debug("error showCaiTrangTach: " + e.getMessage());
        }
    }

    public void tachCaiTrang(Message ms) {
        lockItem.lock();
        try {
            byte type = ms.reader().readByte();
            short index = ms.reader().readShort();
            byte select = ms.reader().readByte();
            Item item = checkBag(type)[index];
            if (item != null) {
                if (item.getOptionGhepCaiTrang() != null && !item.getOptionGhepCaiTrang().isEmpty()) {
                    String[] itemData = item.getOptionGhepCaiTrang().split("&");
                    List<Item> items = new ArrayList<>();
                    for (String str : itemData) {
                        String[] data = str.split("@");
                        Item item1 = new Item(Integer.parseInt(data[0]));
                        item1.setStrOption(data[1]);
                        if (item1.id >= 1025 && item1.id <= 1036) {
                            item1.setLock(true);
                        }
                        items.add(item1);
                    }
                    if (getSlotNull() < items.size()) {
                        warningBagFull();
                        return;
                    }
                    if (select > 0 && select < items.size()) {
                        serverDialog("Chỉ có thể tách tất cả!");
                        return;
                        // if (zeni < 30) {
                        // getService().serverMessage("Không đủ Zeni!");
                        // return;
                        // }
                        // addZeni(-30, true);
                        // Item item1 = items.get(select);
                        // if (item1 != null) {
                        // Item itemAdd = item1.clone();
                        // addItemToBag(itemAdd);
                        // getService().addItem(itemAdd);
                        // items.remove(item1);
                        // } else {
                        // getService().serverMessage("Không tìm thấy cải trang!");
                        // return;
                        // }
                        // int level = 0;
                        // ItemOption[] opOld = item.getItemOption();
                        // for (int i = opOld.length - 1; i >= 0; i--) {
                        // ItemOption op = opOld[i];
                        // for (ItemOption op1 : item1.getItemOption()) {
                        // if (op.getId() == op1.getId() && op.getId() != 327) {
                        // op.setParam(op.getParam() - op1.getParam());
                        // }
                        // }
                        // if (op.getItemOptionTemplate().type == 14) {
                        // if
                        // (item1.getTemplate().name.toLowerCase().equals(op.getItemOptionTemplate().text.toLowerCase()))
                        // {
                        // opOld[i] = null;
                        // } else {
                        // ++level;
                        // }
                        // }
                        // }
                        // List<ItemOption> options1 = new ArrayList<>();
                        // for (ItemOption op : opOld) {
                        // if (op != null) {
                        // options1.add(op);
                        // }
                        // }
                        // StringBuilder str = new StringBuilder();
                        // for (int i = 0; i < items.size(); i++) {
                        // Item item2 = items.get(i);
                        // if (item2 != null) {
                        // str.append(item2.id).append("@").append(item2.strOption).append("&");
                        // }
                        // }
                        // str.deleteCharAt(str.length() - 1);
                        // int upgradePoints = (level / 3) * 2 + (level % 3 == 2 ? 1 : 0); // Adding
                        // remaining points for incomplete sets
                        // Item itemGhep = items.get(0).clone();
                        // itemGhep.setUpgrade((byte) (upgradePoints));
                        // itemGhep.strOption = Item.creatOption(options1.toArray(new ItemOption[0]));
                        // itemGhep.setOptionGhepCaiTrang(str.toString());
                        // addItemToBag(itemGhep);
                        // getService().addItem(itemGhep);
                        // checkBag(type)[index] = null;
                        // getService().tachCaiTrang(type, index, item1);
                    }
                    if (select == 0) {
                        for (Item item1 : items) {
                            if (addItemToBag(item1)) {
                                if (item1.id == 1207) {
                                    item1.isLock = true;
                                }
                                getService().addItem(item1);
                            }
                        }
                        Item itemClone = items.get(0).clone();
                        checkBag(type)[index] = null;
                        getService().tachCaiTrang(type, index, itemClone);
                        getService().updateIndexBag();
                    }
                    setAbility();
                    getService().updateMPFull();
                    getService().updateMPFull();
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lockItem.unlock();
        }
    }

    public void upPearl(Message ms) {
        lockItem.lock();
        try {
            if (trade != null) {
                warningTrade();
                return;
            }
            Vector<Item> crystals = new Vector<>();
            boolean[] list = new boolean[numberCellBag];
            boolean isCoin = ms.reader().readBoolean();
            int sizeClient = ms.reader().readByte();
            while (ms.reader().available() > 0) {
                int indexItem = ms.reader().readShort();
                if (indexItem < 0 || indexItem >= numberCellBag) {
                    continue;
                }
                if (!list[indexItem]) {
                    list[indexItem] = true;
                    if (bag[indexItem] != null && bag[indexItem].id <= 11) {
                        if (bag[indexItem].id == 9) {
                            serverDialog("Max cấp đá");
                            return;
                        }
                        crystals.add(bag[indexItem]);
                    }
                }
            }
            int size = crystals.size();
            if (size < 2) {
                serverDialog("Chọn ít nhất 2 viên đá");
                return;
            }
            int percent = 0;
            int i = 0;
            for (Item item : crystals) {
                percent += DataCenter.gI().as[item.id];
            }
            if (percent > 0) {
                for (i = DataCenter.gI().as.length - 1; i >= 0; i--) {
                    if (percent > DataCenter.gI().as[i]) {
                        break;
                    }
                }
            }
            if (i >= DataCenter.gI().as.length - 1) {
                i = DataCenter.gI().as.length - 2;
            }
            percent = (int) (percent * 100 / DataCenter.gI().as[i + 1]);
            if (percent < 40) {
                serverDialog("Tỉ lệ trên 40% mới có thể luyện");
                return;
            }
            int id = i + 1;
            int coin = (int) DataCenter.gI().an[id];
            int ballz = (int) (DataCenter.gI().an[id] / 3);
            if (isCoin) {
                if (coin > this.coin) {
                    serverDialog("Không đủ Xu");
                    return;
                }
                addCoin(-coin, true);
            } else {
                if (ballz > this.ballZ) {
                    serverDialog("Không đủ Ballz");
                    return;
                }
                addBallz(-ballz, true);
            }
            for (Item item : crystals) {
                removeItem(item.index, 1, true);
            }
            Item da = null;
            if (VDTTUtlis.nextInt(100) < percent) {
                da = new Item(id);
                da.isLock = true;
            } else {
                da = new Item(id - 1);
                da.isLock = true;
            }
            addItemToBag(da);
            getService().upPearl(crystals, da);
            getService().updateIndexBag();
        } catch (Exception ex) {
            Log.error("luyen da err: " + ex.getMessage(), ex);
        } finally {
            lockItem.unlock();
        }
    }

    public void ducLoKham(Message ms) {
        try {
            byte type = ms.reader().readByte();
            short index = ms.reader().readShort();
            byte slot = ms.reader().readByte();
            Item item = checkBag(type)[index];
            if (item == null) {
                return;
            }
            ItemOption[] options = item.getItemOption();
            if (options == null || options.length == 0) {
                return;
            }
            short var14 = 349;
            byte var4 = 4;
            byte var5 = 3;
            ItemOption var6 = null;
            ItemOption var7 = null;
            ItemOption optionKham = null;
            switch (slot) {
                case 1:
                    var14 = 350;
                    var4 = 7;
                    var5 = 6;
                    break;
                case 2:
                    var14 = 298;
                    var4 = 5;
                    var5 = 4;
            }
            Vector var8 = new Vector();
            int var9;
            if (options != null) {
                for (var9 = 0; var9 < options.length; var9++) {
                    ItemOption op = options[var9];
                    if (op.option[0] == 349) {
                        var7 = op;
                    }

                    if (op.option[0] == var14) {
                        optionKham = op;
                    }

                    ItemOption var10;
                    if ((var10 = op).option[0] == 159 || var10.option[0] == 165 || var10.option[0] == 163
                            || var10.option[0] == 164 || var10.option[0] == 148) {
                        var6 = op;
                    } else {
                        var8.add(op);
                    }
                }

            }
            if (optionKham == null) {
                optionKham = new ItemOption(var14 + ",0,1");
                if (slot == 0) {
                    var8.insertElementAt(optionKham, 0);
                } else if (slot == 1) {
                    if (var7 == null) {
                        var8.insertElementAt(optionKham, 0);
                    } else {
                        for (int var15 = var9 = var8.indexOf(var7); var15 < options.length; ++var15) {
                            if (options[var15].getItemOptionTemplate().type == 17) {
                                var9 = var15;
                            }
                        }

                        ++var9;
                        var8.insertElementAt(optionKham, var9);
                    }
                } else if (slot == 2) {
                    var8.add(optionKham);
                }
            } else if (optionKham.f() < var4) {
                optionKham.e(optionKham.f() + 1);
            } else {
                optionKham = null;
            }
            if (var6 != null) {
                var8.add(var6);
            }
            int coint = 0;
            if (optionKham != null && optionKham.f() < var5) {
                coint = 250000;
            } else {
                coint = 250000;
            }

            if (coin < coint) {
                serverDialog("Không đủ Xu");
                return;
            }
            addCoin(-coint, true);
            item.strOption = Item.creatOption(var8);
            getService().ducLoItem(type, index, item);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void khamNgoc(Message m) {
        lockItem.lock();
        try {
            if (trade != null) {
                warningTrade();
                return;
            }
            byte type = m.reader().readByte();
            short index = m.reader().readShort();
            Vector<Item> ngoc = new Vector<>();
            boolean[] list = new boolean[numberCellBag];
            while (m.reader().available() > 0) {
                int indexNgoc = m.reader().readShort();
                if (!list[indexNgoc]) {
                    list[indexNgoc] = true;
                    if (indexNgoc >= 0 && indexNgoc < numberCellBag) {
                        list[indexNgoc] = true;
                        Item item = bag[indexNgoc];
                        if (item != null) {
                            ngoc.add(item);
                        }
                    }
                }
            }
            Item item = checkBag(type)[index].clone();
            if (item == null || ngoc == null) {
                return;
            }
            ItemOption[] options = item.getItemOption();
            if (options == null || options.length == 0) {
                return;
            }
            int quantity = 0;
            Vector var16;
            ItemOption var6;
            int var5;
            if (ngoc.get(0).getTemplate().type == 35) {

            } else if (ngoc.get(0).getTemplate().type == 36) {

            } else {
                boolean var1 = true;
                int var2 = -1;
                int var3;
                for (var3 = 0; var3 < ngoc.size(); var3++) {
                    if (ngoc.get(var3) != null) {
                        if (var2 == -1) {
                            var2 = ngoc.get(var3).id;
                        } else if (var2 != ngoc.get(var3).id) {
                            var1 = false;
                            break;
                        }
                        quantity += ngoc.get(var3).M();
                    }
                }
                var16 = new Vector();
                ItemOption var4;
                if ((var4 = item.a(var16, var2)) != null) {
                    if (var4.a(item.u())) {
                        var1 = false;
                    }
                } else {
                    var5 = 0;
                    var6 = null;
                    ItemOption[] var17 = item.L();
                    Vector var7 = new Vector();
                    int var8;
                    if (var17 != null) {
                        for (var8 = 0; var8 < var17.length; ++var8) {
                            var7.add(var17[var8]);
                            if (var17[var8].option[0] == 298) {
                                var6 = var17[var8];
                                var5 = var17[var8].f();
                            }
                        }
                    }

                    if (var16.size() >= var5) {
                        var1 = false;
                    } else if (var2 >= 0) {
                        var7.insertElementAt(ItemOption.g(var2), var7.indexOf(var6) + 1);
                        var8 = 0;

                        for (var3 = 0; var3 < var7.size(); ++var3) {
                            if (((ItemOption) var7.get(var3)).getItemOptionTemplate().type == 8) {
                                ++var8;
                            }
                        }

                        var6.c(var8);
                        item.strOption = Item.creatOption(var7);
                    }
                }
                if (!var1) {
                    return;
                }
                if (quantity > 0) {
                    item.a(quantity, var2);
                }
                for (int i = 0; i < ngoc.size(); i++) {
                    removeItem(ngoc.get(i).index, ngoc.get(i).getQuantity(), true);
                }
                checkBag(type)[index] = item;
                getService().khamNgoc(ngoc, item, type);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lockItem.unlock();
        }
    }

    public void tachKham(Message ms) {
        lockItem.lock();
        try {
            byte type = ms.reader().readByte();
            short index = ms.reader().readShort();
            byte select = ms.reader().readByte();
            Item item = checkBag(type)[index];
            if (item == null) {
                return;
            }

            Vector R = new Vector();
            Item[] N = new Item[16];
            List<Item> itemTach = new ArrayList<>();
            int var1;
            for (var1 = 0; var1 < N.length; ++var1) {
                N[var1] = null;
            }
            ItemOption[] var11;
            if ((var11 = item.L()) != null) {
                for (int var4 = 0; var4 < var11.length; ++var4) {
                    if (var11[var4].l()) {
                        R.add(var11[var4]);
                    }
                }
            }
            int zeni = 0;
            if ((var11 = item.L()) != null) {
                Vector var2 = new Vector();
                Vector var3 = new Vector();

                int var4;
                ItemOption var5;
                for (var4 = 0; var4 < var11.length; ++var4) {
                    if ((var5 = var11[var4]).m()) {
                        var3.add(var5);
                    }
                }

                ItemOption var13 = null;
                var5 = null;
                ItemOption var6 = null;
                int var7;
                int var8;
                ItemOption var9;
                if (select == 0) {
                    var2.addAll(R);

                    for (var7 = 0; var7 < var11.length; ++var7) {
                        ItemOption var17;
                        if ((var17 = var11[var7]).k()) {
                            var17.c(0);
                            var3.add(var17);
                        } else if (!var17.l()) {
                            var3.add(var17);
                        }
                    }
                } else {
                    var2.add(R.get(select - 1));
                    var7 = 0;

                    for (var8 = 0; var8 < var11.length; ++var8) {
                        if ((var9 = var11[var8]).getItemOptionTemplate().id == 349) {
                            var13 = var9;
                        } else if (var9.getItemOptionTemplate().id == 350) {
                            var5 = var9;
                        } else if (var9.getItemOptionTemplate().id == 298) {
                            var6 = var9;
                        }

                        if (var9.l()) {
                            ++var7;
                            if (var7 != select) {
                                var3.add(var9);
                            } else if (var9.getItemOptionTemplate().type == 17) {
                                var13.c(var13.option[1] - 1);
                            } else if (var9.j()) {
                                var5.c(var5.option[1] - 1);
                            } else if (var9.getItemOptionTemplate().type == 8) {
                                var6.c(var6.option[1] - 1);
                            }
                        } else if (!var3.contains(var9)) {
                            var3.add(var9);
                        }
                    }
                }

                for (var7 = 0; var7 < var11.length; ++var7) {
                    if (((var13 = var11[var7]).option[0] == 370 || var13.getItemOptionTemplate().type == 18)
                            && !var3.contains(var11[var7])) {
                        var3.add(var11[var7]);
                    }
                }

                Vector var18 = new Vector();

                for (var8 = 0; var8 < var2.size(); ++var8) {
                    if ((var1 = (var9 = (ItemOption) var2.get(var8)).h()) >= 0) {
                        if (var9.getItemOptionTemplate().type != 17 && !var9.j()) {
                            if (var9.getItemOptionTemplate().type == 8) {
                                var4 = var9.option[3];
                                int var15 = 0;

                                for (int var16 = 0; var16 <= var4; ++var16) {
                                    var15 += DataCenter.gI().ar[var16];
                                }
                                var18.add(new Item(var1, true, var15));
                                Item var10 = new Item(var1);
                                var10.setQuantity(var15);
                                itemTach.add(var10);
                            }
                        } else {
                            Item var14;
                            (var14 = new Item(var1, true)).strOption = var9.g();
                            var18.add(var14);
                        }
                    }
                }

                var8 = 0;

                for (int var19 = 0; var19 < var18.size(); ++var19) {
                    Item var12;
                    if ((var12 = (Item) var18.get(var19)).getTemplate().type == 32) {
                        zeni += var12.M();
                    } else {
                        var8 += var12.M();
                    }

                    if (var19 >= N.length) {
                        break;
                    }

                    N[var19] = var12;
                }
                zeni = zeni / 200 + var8;
                if (this.zeni < zeni) {
                    serverDialog("Không đủ Zeni");
                    return;
                }
                if (getSlotNull() < itemTach.size()) {
                    warningBagFull();
                    return;
                }
                addZeni(-zeni, true);
                item.strOption = Item.creatOption(var3);
                for (Item item1 : itemTach) {
                    addItemToBag(item1);
                    getService().addItem(item1);
                }
                getService().tachKham(item, type);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lockItem.unlock();
        }
    }

    public void convertUpgrade(Message ms) {
        lockItem.lock();
        try {
            if (trade != null) {
                warningTrade();
                return;
            }
            byte type = ms.reader().readByte();
            short index = ms.reader().readShort();
            byte _type = ms.reader().readByte();
            short _index = ms.reader().readShort();
            short indexConvert = ms.reader().readShort();
            Item item = checkBag(type)[index];
            Item item2 = checkBag(_type)[_index];
            Item convert = bag[indexConvert];
            if (item == null || item2 == null || convert == null) {
                Log.debug("item null");
                return;
            }
            if (item.getTemplate().type != item2.getTemplate().type) {
                service.serverMessage("Không thể dịch chuyển 2 trang bị khác loại");
                return;
            } else if (item.getUpgrade() > 14 || item2.getUpgrade() > 14) {
                service.serverMessage("Không thể dịch chuyển");
                return;
            }
            if (convert.getTemplate().type == 25) {
                byte upgrade = item.upgrade;
                byte upgrade2 = item2.upgrade;
                item2.upgrade = 0;
                item2.upgradeItem(upgrade);
                item2.isLock = true;
                item.upgradeItem(upgrade2);
                item.isLock = true;
                removeItem(convert.index, convert.getQuantity(), true);
                getService().convertUpgrade(type, item, _type, item2, indexConvert);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lockItem.unlock();
        }
    }

    public void splitItem(Message ms) {
        lockItem.lock();
        try {
            if (trade != null) {
                warningTrade();
                return;
            }
            byte type = ms.reader().readByte();
            short index = ms.reader().readShort();
            Item item = checkBag(type)[index];
            if (item == null) {
                return;
            }
            if (item.getQuantity() < 1) {
                getService().serverMessage("Không thể tách vật phẩm này!");
                return;
            }
            if (!item.isTrangBi()) {
                getService().serverMessage("Vật phẩm không phải trang bị!");
                return;
            }
            Item item1 = item.clone();
            item1.upgradeItem(0);
            long var7 = 0L;
            int var3 = 0;
            int var4;
            List<Item> da = new ArrayList<>();
            if (item.isTypePet()) {
                for (var4 = item.getUpgrade(); var4 > 0; --var4) {
                    var3 += DataCenter.gI().ao[var4];
                    var7 += DataCenter.gI().at[var4];
                }
            } else if (item.isTypeClothe()) {
                for (var4 = item.getUpgrade(); var4 > 0; --var4) {
                    var3 += DataCenter.gI().ap[var4];
                    var7 += DataCenter.gI().au[var4];
                }
            } else if (item.isTypeWeapon()) {
                for (var4 = item.getUpgrade(); var4 > 0; --var4) {
                    var3 += DataCenter.gI().aq[var4];
                    var7 += DataCenter.gI().av[var4];
                }
            }

            ItemOption[] var9;
            if ((var9 = item1.L()) != null) {
                for (int var5 = 0; var5 < var9.length; ++var5) {
                    if (var9[var5].l()) {
                        item1.isLock = true;
                        break;
                    }
                }
            }

            var7 /= 3L;
            Vector var8 = new Vector();

            for (var4 = DataCenter.gI().as.length - 1; var4 >= 0 && var7 > 0L; --var4) {
                if (var7 >= DataCenter.gI().as[var4]) {
                    var7 -= DataCenter.gI().as[var4];
                    Item var6;
                    (var6 = new Item(var4)).id = var4;
                    var6.expire = -1L;
                    var6.isLock = true;
                    var8.add(var6);
                    var4 = DataCenter.gI().as.length;
                    if (var8.size() >= 16) {
                        break;
                    }
                }
            }

            for (var4 = 0; var4 < var8.size(); ++var4) {
                Item item2 = (Item) var8.elementAt(var4);
                da.add(item2);
            }
            if (getSlotNull() < da.size()) {
                warningBagFull();
                return;
            }
            int coin = var3 / 3;
            addCoin(coin, true);
            for (Item item2 : da) {
                addItemToBag(item2);
                getService().addItem(item2);
            }
            checkBag(type)[index] = item1;
            getService().splitItem(type, item1);
            getService().updateIndexBag();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lockItem.unlock();
        }
    }

    public void removeMail(Message ms) {
        try {
            short size = ms.reader().readShort();
            for (int i = 0; i < size; i++) {
                short id = ms.reader().readShort();
                mailManager.removeMail(id);
            }
        } catch (Exception e) {

        }
    }

    public void reciveAllMail() {
        mailManager.reciveAll();
    }

    public void throwItem(Message ms) {
        lockItem.lock();
        try {
            if (isDead) {
                return;
            }
            if (trade != null) {
                warningTrade();
                return;
            }
            short indexUI = ms.reader().readShort();
            if (indexUI < 0 || indexUI >= this.numberCellBag || this.bag[indexUI] == null || this.bag[indexUI].isLock) {
                return;
            }
            Item item = bag[indexUI];
            if (item != null) {
                VDTTUtlis.writing("loggame/dropitem/" + name + ".txt",
                        "Vứt vật phẩm: " + item.getTemplate().name + " số lượng: " + item.getQuantity() + "\n");
                removeItem(indexUI, item.getQuantity(), true);// bo ra dat mat luon vat pham
            }
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        } finally {
            lockItem.unlock();
        }

    }

    public void inputNumberSplit(Message ms) {
        try {
            if (trade != null) {
                warningTrade();
                return;
            }
            short indexItem = ms.reader().readShort();
            int numSplit = ms.reader().readInt();
            if (numSplit < 1) {
                return;
            }
            if (bag[indexItem] != null && bag[indexItem].template.isXepChong) {
                int quantity = bag[indexItem].getQuantity();
                if (numSplit >= quantity) {
                    return;
                }
                for (int i = 0; i < this.numberCellBag; i++) {
                    if (bag[i] == null) {
                        bag[i] = bag[indexItem].clone();
                        bag[i].index = i;
                        bag[i].setQuantity(numSplit);
                        getService().themItem(bag[i]);
                        bag[indexItem].reduce(numSplit);
                        getService().splitItemBag((short) indexItem, bag[indexItem].getQuantity(), (short) i, numSplit);
                        getService().updateIndexBag();
                        return;
                    }
                }
            }
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public void saleItem(Message ms) {
        try {
            if (trade != null) {
                warningTrade();
                return;
            }
            short index = ms.reader().readShort();
            boolean var = ms.reader().readBoolean();
            if (index < 0 || index >= numberCellBag || bag[index] == null) {
                return;
            }
            Item item = bag[index];
            if (item == null) {
                return;
            }
            if (item.id >= 923 && item.id <= 926) {
                return;
            }
            if (item.getUpgrade() > 0) {
                service.serverMessage("Không thể bán trang bị đã nâng cấp");
                return;
            }
            int quantity = item.getQuantity();
            int price = item.getPrice() * quantity;
            if (item.isLock) {
                addCoin(price, true);
            } else {
                addBallz(price, true);
            }
            VDTTUtlis.writing("loggame/saleitem/" + name + ".txt",
                    "Bán vật phẩm: " + item.getTemplate().name + " số lượng: " + item.getQuantity() + "\n");
            removeItem(index, quantity, true);
            getService().saleItem(index);
        } catch (Exception e) {
        }
    }

    public int checkReward(DailyReward reward) {
        Reward rw = findReward(reward.type);
        switch (reward.type) {
            case 0:
                int time = timeOnline / 60064;
                if (reward.require > time) {
                    return 0;
                } else {
                    if (rw != null) {
                        if (rw.list.contains(reward.id)) {
                            return 2;
                        }
                    }
                    return 1;
                }
            case 1:
                if (reward.require > ngayOnline)
                    return 0;
                if (rw != null) {
                    if (rw.list.contains(reward.id)) {
                        return 2;
                    }
                }
                if (reward.id >= 506 && reward.id <= 512) {
                    if (!isNewBie) {
                        return 0;
                    }
                }
                return 1;
            case 2:
                if (reward.require > totalKiNang)
                    return 0;
                if (rw != null) {
                    if (rw.list.contains(reward.id)) {
                        return 2;
                    }
                }
                return 1;
            case 3:
                if (!packSieuQuai)
                    return 0;
                if (reward.require > totalSQ)
                    return 0;
                if (rw != null) {
                    if (rw.list.contains(reward.id)) {
                        return 2;
                    }
                }
                return 1;
            case 5:
                if (reward.require > napNgay)
                    return 0;
                if (rw != null) {
                    if (rw.list.contains(reward.id)) {
                        return 2;
                    }
                }
                return 1;
            case 15:
                if (!packOnline)
                    return 0;
                time = (int) (totalTimeOnline / 60000);
                if (reward.require > time)
                    return 0;
                if (rw != null) {
                    if (rw.list.contains(reward.id)) {
                        return 2;
                    }
                }
                return 1;
            case 16:
                if (!packTinhAnh)
                    return 0;
                if (reward.require > totalTA)
                    return 0;
                if (rw != null) {
                    if (rw.list.contains(reward.id)) {
                        return 2;
                    }
                }
                return 1;
            case 17:
                if (!packThuLinh)
                    return 0;
                if (reward.require > totalTL)
                    return 0;
                if (rw != null) {
                    if (rw.list.contains(reward.id)) {
                        return 2;
                    }
                }
                return 1;
        }
        return 0;
    }

    public void claimedReward(Message ms) {
        try {
            short id = ms.reader().readShort();
            DailyReward dailyReward = RewardManager.gI().find(id);
            if (dailyReward != null) {
                if (checkReward(dailyReward) != 1) {
                    return;
                }
                if (getSlotNull() < 1) {
                    warningBagFull();
                    return;
                }
                Reward reward = findReward(dailyReward.type);
                if (reward != null) {
                    if (reward.list.contains(dailyReward.id))
                        return;
                    reward.list.add(dailyReward.id);
                } else {
                    Reward rw = new Reward();
                    rw.type = (short) dailyReward.type;
                    rw.list.add(dailyReward.id);
                    rewardList.add(rw);
                }
                Item item = dailyReward.item.clone();
                if (item.expire > 0) {
                    item.expire += System.currentTimeMillis();
                }
                if (item.id == 163) {
                    addCoin(item.getQuantity(), true);
                } else if (item.id == 191) {
                    addBallz(item.getQuantity(), true);
                } else {
                    addItemToBag(item);
                    getService().addItem(item);
                }
                getService().updatePhucLoi(id);
            }
        } catch (Exception e) {

        }

    }

    public void drawRewardDaily() {
        if (countVongQuay < 1) {
            service.serverMessage("Không đủ lượt quay");
            return;
        }
        countVongQuay--;
        int id = RandomItem.VONG_QUAY_PHUC_LOI.next();
        long time = System.currentTimeMillis() + 2000;
        getService().drawRewardDaily(id, 0);
        while (time > System.currentTimeMillis()) {

        }
        switch (id) {
            case 0:
                Item item = new Item(23);
                item.setLock(true);
                item.setQuantity(30);
                addItemToBag(item);
                getService().addItem(item);
                break;
            case 1:
                item = new Item(176);
                item.setLock(true);
                item.setQuantity(60);
                addItemToBag(item);
                getService().addItem(item);
                break;
            case 2:
                addBallz(900000, true);
                break;
            case 3:
                addCoin(4000000, true);
                break;
            case 4:
                item = new Item(160);
                item.setLock(true);
                item.setQuantity(600);
                addItemToBag(item);
                getService().addItem(item);
                break;
            case 5:
                item = new Item(160);
                item.setLock(true);
                item.setQuantity(725);
                addItemToBag(item);
                getService().addItem(item);
                break;
            case 6:
                item = new Item(160);
                item.setLock(true);
                item.setQuantity(850);
                addItemToBag(item);
                getService().addItem(item);
                break;
            case 7:
                item = new Item(160);
                item.setLock(true);
                item.setQuantity(1000);
                addItemToBag(item);
                getService().addItem(item);
                break;
        }
    }

    public void buyPackReward(Message ms) {
        try {
            byte id = ms.reader().readByte();
            if (zeni < 200) {
                service.serverMessage("Không đủ Zeni");
                return;
            }
            addZeni(-200, true);
            switch (id) {
                case 0:
                    packOnline = true;
                    break;
                case 1:
                    packTinhAnh = true;
                    break;
                case 2:
                    packThuLinh = true;
                    break;
                case 3:
                    packSieuQuai = true;
                    break;
            }
            getService().reloadRewarDaily();
        } catch (Exception e) {

        }
    }

    public void extendBox() {
        if (trade != null) {
            warningTrade();
            return;
        }
        if (zeni < 90) {
            service.serverMessage("Không đủ Zeni");
            return;
        }
        if (numberCellBox >= 108) {
            serverDialog("Không thể mở rộng thêm");
            return;
        }
        addZeni(-90, true);
        numberCellBox += 9;
        Item[] items = new Item[numberCellBox];
        for (int i = 0; i < box.length; i++) {
            items[i] = box[i];
        }
        box = items;
        getService().openBox();
        getService().serverMessage("Mở rộng thêm 9 ô thành công");
    }

    public void createGroup() {
        try {
            if (this.group != null) {
                serverDialog("Không thể tạo nhóm");
                return;
            }
            Group group = new Group();
            MemberGroup party = new MemberGroup();
            party.charId = this.id;
            party.classId = this.idCharSys;
            party.name = this.name;
            party.setChar(this);
            group.add(party);
            this.group = group;
            this.group.getGroupService().playerInParty();
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public void outParty() {
        if (this.group != null) {
            if (zone.map.isGDSM()) {
                if (matchUp != null) {
                    matchUp.out(group);
                    matchUp = null;
                }
                GiaiDauSucManh gdsm = MapManager.getInstance().GDSM;
                if (gdsm != null) {
                    gdsm.removeMember(group);
                }
            }
            synchronized (group) {
                if (this.group.memberGroups.size() > 1) {
                    int index = this.group.getIndexById(this.id);
                    if (index != -1) {
                        this.group.removeParty(index);
                    }
                }
                this.group = null;
                getService().outParty();
            }
        }
    }

    public void lockParty() {
        try {
            if (this.group != null && this.group.memberGroups.get(0).charId == this.id) {
                this.group.isLock = !this.group.isLock;
            }
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public void openFindParty() {
        if (this.group == null) {
            try {
                HashMap<String, Group> groups = new HashMap<>();
                List<Char> chars = zone.getChars();
                for (Char _char : chars) {
                    if (_char != null && _char.group != null) {
                        groups.put(_char.group.memberGroups.get(0).name, _char.group);
                    }
                }
                getService().openFindParty(groups);
            } catch (Exception ex) {
                Log.error("err: " + ex.getMessage(), ex);
            }
        }
    }

    public void addParty(Message msg) {
        try {
            if (isDead) {
                return;
            }
            String name = msg.readUTF();
            if (this.name.equals(name)) {
                return;
            }
            Char _char = ServerManager.findCharByName(name);
            if (_char != null) {
                if (this.group == null) {
                    createGroup();
                } else {
                    MemberGroup party = this.group.memberGroups.get(0);
                    if (party.charId != this.id) {
                        service.serverMessage("Bạn không phải trưởng nhóm");
                        return;
                    }
                }
                if (_char.group != null) {
                    service.serverMessage("Người này đã gia nhập nhóm khác");
                    return;
                }
                Invite.PlayerInvite p = _char.invite.findCharInvite(Invite.NHOM, this.id);
                Invite.PlayerInvite c = this.invite.findCharInvite(Invite.XIN_VAO_NHOM, _char.id);
                if (c != null) {
                    acceptPleaseParty(name);
                    return;
                }
                if (p != null) {
                    service.serverDialog("Không thể mời vào nhóm liên tục. Vui lòng thử lại sau 30s nữa.");
                    return;
                }
                _char.invite.addCharInvite(Invite.NHOM, this.id, 30);
                _char.getService().partyInvite(this.name);
            } else {
                service.serverMessage("Người này không tồn tại hoặc không online.");
            }
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public void addPartyAccept(Message msg) {
        try {
            if (this.group == null) {
                String name = msg.readUTF();
                Char _char = ServerManager.findCharByName(name);
                if (_char != null) {
                    if (_char.group == null) {
                        service.serverMessage("Nhóm này không còn tồn tại");
                        return;
                    }
                    MemberGroup p = _char.group.memberGroups.get(0);
                    if (p.charId != _char.id) {
                        service.serverMessage("Người này không phải nhóm trưởng");
                        return;
                    }
                    Invite.PlayerInvite c = this.invite.findCharInvite(Invite.NHOM, _char.id);
                    if (c == null) {
                        pleaseInputParty(name);
                        return;
                    }
                    MemberGroup party = new MemberGroup();
                    party.charId = this.id;
                    party.classId = this.idCharSys;
                    party.name = this.name;
                    party.setChar(this);
                    _char.group.add(party);
                    this.group = _char.group;
                    this.group.getGroupService().playerInParty();
                } else {
                    service.serverMessage("Hiện tại người này không online.");
                }
            } else {
                service.serverMessage("Bạn đã gia nhập nhóm khác");
            }
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public void acceptPleaseParty(String name) {
        if (this.group == null) {
            return;
        }
        if (this.group.memberGroups.size() < 6) {
            if (this.group.memberGroups.get(0).charId == this.id) {
                try {
                    Char _char = ServerManager.findCharByName(name);
                    if (_char != null) {
                        if (_char.group == null) {
                            Invite.PlayerInvite c = this.invite.findCharInvite(Invite.XIN_VAO_NHOM, _char.id);
                            if (c == null) {
                                service.serverDialog("Đã hết thời gian chấp nhận yêu cầu tham gia nhóm.");
                                return;
                            }
                            _char.group = this.group;
                            MemberGroup p = new MemberGroup();
                            p.charId = _char.id;
                            p.classId = _char.idCharSys;
                            p.name = _char.name;
                            p.setChar(_char);
                            _char.group.add(p);
                        } else {
                            service.serverDialog("Người này đã gia nhập nhóm khác");
                        }
                    } else {
                        service.serverDialog("Người này không online");
                    }
                } catch (Exception ex) {
                    Log.error("err: " + ex.getMessage(), ex);
                }
            }
        } else {
            service.serverDialog("Nhóm đã đủ thành viên");
        }
    }

    public void pleaseInputParty(String name) {
        try {
            if (this.group != null) {
                return;
            }
            if (this.name.equals(name)) {
                return;
            }
            Char _char = ServerManager.findCharByName(name);
            if (_char != null) {
                if (_char.group != null) {
                    if (_char.group.isLock) {
                        service.serverMessage("Nhóm này đã khóa, không thể xin gia nhập");
                        return;
                    }
                    if (_char.group.memberGroups.size() == 6) {
                        service.serverMessage("Nhóm đã đủ thành viên");
                        return;
                    }
                    if (_char.group.memberGroups.get(0).charId != _char.id) {
                        return;
                    }
                    Invite.PlayerInvite p = _char.invite.findCharInvite(Invite.XIN_VAO_NHOM, this.id);
                    if (p != null) {
                        service.serverMessage("Không thể xin vào nhóm liên tục. Vui lòng thử lại sau 30s nữa.");
                        return;
                    }
                    _char.invite.addCharInvite(Invite.XIN_VAO_NHOM, this.id, 30);
                    _char.getService().pleaseInputParty(this.name);
                } else {
                    service.serverMessage("Nhóm này không tồn tại");
                }
            } else {
                service.serverMessage("Người này không online hoặc không tồn tại");
            }
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public void moveMember(Message ms) {
        try {
            if (this.group != null) {
                if (zone.map.isGDSM() || group.getCharsInMap(48).size() > 0) {
                    serverMessage("Không thể thao tác khi có thành viên đang trong hoạt động");
                    return;
                }
                if (this.group.memberGroups.get(0).charId == this.id) {

                    String name = ms.readUTF();
                    if (this.name.equals(name)) {
                        service.serverMessage("Không thể kick bản thân");
                    }
                    List<MemberGroup> partys = this.group.getMemberGroup();
                    Char _char = null;
                    for (MemberGroup p : partys) {
                        if (p.name.equals(name)) {
                            _char = p.getChar();
                        }
                    }
                    if (_char != null) {
                        _char.outParty();
                        _char.service.serverMessage("Bạn đã bị đuổi khỏi nhóm");
                    }
                    // _char.sendMessage(new Message(83));
                    // this.group.removeParty(index);
                } else {
                    service.serverMessage("Bạn không phải trưởng nhóm");
                }
            }

        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public void changeTeamLeader(Message ms) {
        try {
            if (isDead) {
                return;
            }
            if (this.group != null) {
                if (this.group.memberGroups.get(0).charId == this.id) {
                    String name = ms.readUTF();
                    if (this.name.equals(name)) {
                        service.serverMessage("Không thể nhường cho người này");
                    }
                    int index = this.group.getIndexByName(name);
                    if (index > 0)
                        this.group.changeLeader(index);
                } else {
                    service.serverMessage("Bạn không phải trưởng nhóm");
                }
            }

        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public void checkDoneTask() {
        if (taskMain != null && taskMain.isComplete()) {
            updateTask();
        }
    }

    public void checkInfo(Message mss) {
        try {
            if (isDead) {
                return;
            }
            Char _char = ServerManager.findCharByName(mss.readUTF());
            if (_char != null) {
                if (_char.id == this.id) {
                    return;
                }
                service.xemThongTin(_char);
                _char.service.serverMessage(name + " đã xem thông tin của bạn");
            } else {
                service.serverMessage("Người chơi này không online");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void chatPrivate(Message mss) {
        try {
            String str = mss.readUTF();
            String[] parts = str.split(":"); // Tách chuỗi dựa vào ký tự ':'
            if (parts.length < 2) {
                getService().serverMessage("Nội dung không đúng");
                return;
            }

            // Kiểm tra xem chuỗi có đủ dài để thực hiện substring(1) hay không
            if (parts[0].length() < 2) {
                getService().serverMessage("Tên người nhận không hợp lệ");
                return;
            }

            String name = parts[0].substring(1); // Loại bỏ ký tự '/' đầu tiên và lấy phần còn lại
            Char _char = ServerManager.findCharByName(name);
            if (_char == null || this.name.equals(name)) {
                getService().serverMessage("Đối phương đã offline");
                return;
            }

            _char.getService().chatPrivate(this.name, parts[1], name);
            getService().chatPrivate(this.name, parts[1], name);
        } catch (Exception e) {

        }
    }

    public void setTypePk(byte typePk) {
        this.typePK = typePk;
        if (zone != null) {
            zone.getService().changePk(this);
        }
    }

    public void attackChar(int id, byte index) {
        try {
            Char pl = ServerManager.findCharById(id);
            if (pl != null) {
                if (pl.getEm().statusWithID(46)) {
                    serverMessage("Đối phương đang trong trạng thái bảo hộ");
                    return;
                }
                if (getEm().statusWithID(46)) {
                    serverMessage("Bạn đang trong trạng thái bảo hộ");
                    return;
                }
                if (pet != null && pet.typePet == 1 && !pet.isDead) {
                    pet.attackChar(id);
                }
                Skill selectedSkill = skills.get(index);
          //      Log.debug("selectedSkill: " + selectedSkill.getSkillTemplate().name);
                if (selectedSkill != null) {
                    if (selectedSkill.isCoolDown() || selectedSkill.getSkillTemplate().type == 5) {
                        return;
                    }
                    if (selectedSkill.getSkillTemplate().i > 0) {
                        if (timeSkill.get(selectedSkill.id) != null) {
                            if (timeSkill.get(selectedSkill.id) > System.currentTimeMillis()) {
                                return;
                            }
                        }
                        timeSkill.put(selectedSkill.id, System.currentTimeMillis() + selectedSkill.coolDown);
                    }
                    if (mp < selectedSkill.mpUsing) {
                        getService().serverMessage("Không đủ MP");
                        return;
                    }
                    selectedSkill.timeCoolDown = System.currentTimeMillis();
                    if (getEm().statusWithID(189) || getEm().statusWithID(136)) {
                        if (selectedSkill.getSkillTemplate().name.contains("Đá")
                                || selectedSkill.getSkillTemplate().name.contains("Đấm")) {
                            selectedSkill.timeCoolDown -= selectedSkill.coolDown * 20 / 100;
                        }
                    }
                    addMp(-selectedSkill.mpUsing);
                    int skillTemplateId = selectedSkill.getSkillTemplate().id;

                    zone.getService().setSkillPaint_2(this.id, selectedSkill.id, pl.id);

                    if (skillTemplateId == 5 || skillTemplateId == 22 || skillTemplateId == 87) {
                        int num = skillTemplateId == 5 ? selectedSkill.getItemOption()[0].getParam()
                                : skillTemplateId == 22 ? 6 : 2;
                        for (int i = 0; i < num; i++) {
                            attackChar(pl, selectedSkill);
                            try {
                                Thread.sleep(300);
                            } catch (InterruptedException e) {

                            }
                        }
                    } else {
                        attackChar(pl, selectedSkill);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void attackChar(Char pl, Skill selectedSkill) {
        pl.lock.lock();
        try {
            if (!pl.isDead && !pl.isCleaned) {
                selectSkill = selectedSkill;
                setAbility();
                int damage2 = damage * 90 / 100;
                if (selectedSkill.isSkillTemplate == 26) {
                    Effect eff = new Effect(55, options[417], options[254]);
                    pl.getEm().setEffect(eff);
                }
                if (selectedSkill.isSkillTemplate == 29) {
                    Effect eff = new Effect(161, options[447], 0);
                    pl.getEm().setEffect(eff);

                }
                if (selectedSkill.isSkillTemplate == 20) {
                    Effect eff = new Effect(160, options[446], 0);
                    pl.getEm().setEffect(eff);
                }
                if (selectedSkill.isSkillTemplate == 89) {
                    Effect eff = new Effect(76, 5000, 320);
                    pl.getEm().setEffect(eff);
                }
                if (selectedSkill.isSkillTemplate == 85) {
                    Effect eff = new Effect(197, 5000, 320);
                    pl.getEm().setEffect(eff);
                }
                if (selectedSkill.isSkillTemplate == 101) {
                    Effect eff1 = new Effect(207, 15000, options[494]);
                    Effect eff2 = new Effect(208, 15000, options[494]);
                    getEm().setEffect(eff1);
                    pl.getEm().setEffect(eff2);
                }
                if (selectedSkill.isSkillTemplate == 91) {
                    Effect eff = new Effect(152, 15000, 100);
                    pl.getEm().setEffect(eff);
                }
                if (selectedSkill.isSkillTemplate == 43) {
                    if (body[15] != null && body[15].id == 848) {
                        serverMessage("Đối phương có kính chống thái dương hạ san");
                    } else {
                        Effect eff = new Effect(76, 5000, 300);
                        pl.getEm().setEffect(eff);
                    }
                }

                int dameHit = VDTTUtlis.nextInt(damage2, this.damage);
                dameHit /= 3;
                dameHit -= pl.reduceDame;
                int pois = options[49] + options[69] + options[124] + options[169] - pl.options[289];
                int lamCham = options[50] + options[70] + options[125] + options[170] - pl.options[290];
                boolean isChiuDon = VDTTUtlis.nextInt(0, 1000) < chiuDon - pl.reduceChiuDon;
                boolean isSuyGiam = VDTTUtlis.nextInt(0, 1000) < suyGiam - pl.reduceSuyGiam;
                boolean isStun = VDTTUtlis.nextInt(0, 1000) < stun - pl.reduceStun;
                boolean isPois = VDTTUtlis.nextInt(0, 300) < pois;
                boolean isLamCham = VDTTUtlis.nextInt(0, 300) < lamCham;

                short _crit = (short) (crit - pl.reduceCrit);
                float percentCrit = _crit / 100;
                boolean isCrit = false;
                if (selectedSkill.getSkillTemplate().name.contains("Đá")
                        || selectedSkill.getSkillTemplate().name.contains("Đấm")) {
                    if (getEm().findByID(149) != null) {
                        Effect eff = getEm().findByID(149);
                        percentCrit = 80;
                        eff.param--;
                        if (eff.param <= 0) {
                            getEm().removeEffect(eff);
                            zone.getService().playerRemoveEffect(this, eff);
                        } else {
                            zone.getService().playerAddEffect(this, eff);
                        }
                    }
                }
                if (VDTTUtlis.nextInt(0, 80) < percentCrit) {
                    short _critHit = (short) ((criticalHitPower - pl.reduceCritHitPower));
                    dameHit += dameHit * (50 + _critHit) / 100;
                    isCrit = true;
                }
                if (pl.getEm().findByID(113) != null) {
                    Effect eff = pl.getEm().findByID(113);
                    int percent = dameHit / pl.maxHP * 100;
                    if (percent > eff.param) {
                        em.removeEffect(eff);
                    }
                    dameHit = 0;
                }
                int randMiss = (pl.miss - exactly - (pl.miss * skipMiss / 100)) / 55;
                boolean isMiss = VDTTUtlis.nextInt(0, 80) < randMiss;
                if (isMiss) {
                    dameHit = 0;
                } else {
                    if (isChiuDon) {
                        if (pl.getEm().findByID(11) == null) {
                            Effect eff = new Effect(11, 3000, 0);
                            pl.getEm().setEffect(eff);
                        }
                    }
                    if (isSuyGiam) {
                        if (pl.getEm().findByID(8) == null) {
                            Effect eff = new Effect(8, 3000, 0);
                            pl.getEm().setEffect(eff);
                        }
                    }
                    if (isStun) {
                        if (pl.getEm().findByID(12) == null) {
                            Effect eff = new Effect(12, 3000, 0);
                            pl.getEm().setEffect(eff);
                        }
                    }
                    if (isPois) {
                        if (pl.getEm().findByID(9) == null) {
                            Effect eff = new Effect(9, 3000, 0);
                            pl.getEm().setEffect(eff);
                        }
                    }
                    if (isLamCham) {
                        if (pl.getEm().findByID(10) == null) {
                            Effect eff = new Effect(10, 3000, 0);
                            pl.getEm().setEffect(eff);
                        }
                    }
                    if (pl.getEm().findByID(11) != null) {
                        dameHit *= 2;
                    }
                    if (pl.getEm().findByID(8) != null) {
                        dameHit += dameHit / 2;
                    }
                    if (pl.getEm().statusWithID(55)) {
                        dameHit += dameHit * VDTTUtlis.nextInt(10, 25) / 100;
                    }
                }
                float percentArmor = (pl.armor - pl.armor * armorPenetration / 100) / 50;
                dameHit -= dameHit * percentArmor / 100;
                if (percentArmor > 60) {
                    dameHit -= 500;
                }
                if (dameHit < 0) {
                    dameHit = 0;
                }
                if (selectedSkill.isSkillTemplate == 22) {
                    Effect eff = new Effect(36, options[323], 0);
                    pl.getEm().setEffect(eff);
                    dameHit = options[373];
                }
                if (pl.counterDame > 0) {
                    if (VDTTUtlis.nextInt(0, 100) < pl.counterDame) {
                        addHp(-dameHit);
                        if (hp <= 0) {
                            if (zone.map.isGDSM()) {
                                VoDaiSucManh dauTruong = MapManager.getInstance().VDSM;
                                if (dauTruong != null && dauTruong.round > 1) {
                                    pl.pointTournament += 5;
                                    pl.getService().updatePointTournamen();
                                    if (dauTruong.round > 2) {
                                        if (pl.deathMatch != null) {
                                            pl.deathMatch.out(this);
                                            this.setTypePk((byte) 0);
                                            this.zone.joinNotChangeMap(this, 49);
                                            this.wakeUpFromDead();
                                            GlobalService.getInstance().chat("Hệ thống", "c#item" + pl.name + "c#white đã chiến thắng tại khu vực " + zone.id, (byte) 1);
                                            if (dauTruong.round == 6) {
                                                GlobalService.getInstance().chat("Hệ thống", "Chúc mừng chiến binh c#item" + pl.name + "c#white đã vô địch giải đấu lần này", (byte) 1);
                                            }
                                        }
                                    }
                                }
                            }
                            if (zone.map.isGDSM()) {
                                GiaiDauSucManh gdsm = MapManager.getInstance().GDSM;
                                if (gdsm != null && gdsm.round > 1) {
                                    pl.pointTournament += 5;
                                    if (pl.getGroup() != null) {
                                        pl.getGroup().point += 5;
                                    }
                                    pl.getService().updatePointTournamen();
                                    if (gdsm.round > 2) {
                                        if (pl.matchUp != null) {
                                            if (this.group != null)
                                                pl.matchUp.out(this.group);
                                            this.matchUp = null;
                                            this.setTypePk((byte) 0);
                                            this.zone.joinNotChangeMap(this, 47);
                                            this.wakeUpFromDead();
                                        }
                                    }
                                }
                            }
                            startDie();
                        }
                        dameHit = 0;
                    }
                }
                if (pl.getEm().findByID(109) != null) {
                    Effect eff = pl.getEm().findByID(109);
                    pl.getEm().removeEffect(eff);
                    pl.zone.getService().playerRemoveEffect(pl, eff);
                }
                if (selectedSkill.isSkillTemplate == 37) {
                    Effect eff = new Effect(109, 12000, 0);
                    pl.getEm().setEffect(eff);
                    dameHit = 0;
                }
                if (selectedSkill.isSkillTemplate == 28) {
                    pl.addMp(-(pl.maxMP * options[304] / 100));
                }

                if (selectedSkill.isSkillTemplate == 68) {
                    dameHit = (VDTTUtlis.nextInt(10, 40) - pl.options[487]) * pl.hp / 100;
                }
                if (pl.getEm().findByID(108) != null) {
                    dameHit = 0;
                }
                if (selectedSkill.isSkillTemplate == 4) {
                    dameHit = options[371] * pl.maxHP / 100;
                }
                if (selectedSkill.isSkillTemplate == 83) {
                    dameHit = pl.hp * 8 / 100;
                    addHp(dameHit);
                }
                if (selectedSkill.isSkillTemplate == 108) {
                    dameHit = 20 * pl.hp / 100;
                    Effect effect = new Effect(214, 20000, 2000);
                    getEm().setEffect(effect);
                }
                if (selectedSkill.isSkillTemplate == 56) {
                    int hp_old = this.hp;
                    this.hp = pl.hp;
                    pl.hp = hp_old;
                    if (this.hp > maxHP) {
                        this.hp = maxHP;
                    }
                    if (pl.hp > pl.maxHP) {
                        pl.hp = pl.maxHP;
                    }
                    getService().updateHP();
                    zone.getService().updateHP(this);
                    dameHit = 0;
                }
                if (zone.map.isVoDai()) {
                    if (deathMatch != null) {
                        deathMatch.updateDamage(this, dameHit);
                    }
                }
                if (zone.map.isGDSM()) {
                    if (matchUp != null && this.group != null) {
                        matchUp.updateDamage(this.group, dameHit);
                    }
                }
                pl.hp -= dameHit;
                zone.getService().attackCharacter(pl.id, pl.mp, pl.hp, isCrit, name, pl.x, pl.y);
                if (dameHit > 0) {
                    if (pl.hp <= 0) {
                        if (zone.map.isNgucTu()) {
                            if (countAddPointNgucTu < 5) {
                                countAddPointNgucTu++;
                                addPointSoiNoi(2);
                            }
                        }

                        if (zone.map.isSaoDen()) {
                            Effect saoDen = pl.getEm().findByID(132);
                            if (saoDen != null) {
                                Effect eff = new Effect(132, TimeUnit.MINUTES.toMillis(5), saoDen.getParam());
                                pl.getEm().remove(saoDen);
                                zone.getService().playerRemoveEffect(pl, saoDen);
                                getEm().setEffect(eff);
                            }
                        }
                        pl.startDie();
                        if (isCuuSat) {
                            clearCuuSat(true);
                            lvPK++;
                        }
                        if (typePK == 3) {
                            lvPK++;
                        }
                        if (zone.map.isVoDai()) {
                            VoDaiSucManh dauTruong = MapManager.getInstance().VDSM;
                            if (dauTruong != null && dauTruong.round > 1) {
                                pointTournament += 5;
                                getService().updatePointTournamen();
                            }
                            if (dauTruong.round > 2) {
                                if (deathMatch != null) {
                                    deathMatch.out(pl);
                                    pl.setTypePk((byte) 0);
                                    pl.zone.joinNotChangeMap(pl, 49);
                                    pl.wakeUpFromDead();
                                    GlobalService.getInstance().chat("Hệ thống", "c#item" + this.name + "c#white đã chiến thắng tại khu vực " + zone.id, (byte) 1);
                                }
                            }
                        }
                        if (zone.map.isGDSM()) {
                            GiaiDauSucManh gdsm = MapManager.getInstance().GDSM;
                            if (gdsm != null && gdsm.round > 1) {
                                pointTournament += 5;
                                if (getGroup() != null) {
                                    getGroup().point += 5;
                                }
                                getService().updatePointTournamen();
                            }
                            if (gdsm.round > 2) {
                                if (matchUp != null) {
                                    if (pl.getGroup() != null)
                                        matchUp.out(pl.getGroup());
                                    pl.matchUp = null;
                                    pl.setTypePk((byte) 0);
                                    pl.zone.joinNotChangeMap(pl, 47);
                                    pl.wakeUpFromDead();
                                }
                            }
                        }
                    }
                }
            }
        } finally {
            pl.lock.unlock();
            selectSkill = null;
            setAbility();
        }
    }

    public void addPointSoiNoi(int point) {
        pointEnthusiastic += point;
        pointEnthusiasticWeek += point;
        serverMessage("Bạn đã nhận được " + point + " điểm sôi nổi");
    }

    public boolean removeItems(int id, int quantityNeeded) {
        int indexLock = getIndexItemByIdInBag(id, true);
        int indexNoLock = getIndexItemByIdInBag(id, false);
        if (indexLock == -1 && indexNoLock == -1) {
            return false;
        }
        if (indexLock != -1 && indexNoLock == -1) {
            Item item = bag[indexLock];
            if (item == null) {
                return false;
            }
            if (item.getQuantity() < quantityNeeded) {
                return false;
            }
            removeItem(indexLock, quantityNeeded, true);
            return true;
        } else if (indexLock == -1 && indexNoLock != -1) {
            Item item = bag[indexNoLock];
            if (item == null) {
                return false;
            }
            if (item.getQuantity() < quantityNeeded) {
                return false;
            }
            removeItem(indexNoLock, quantityNeeded, false);
            return true;
        } else if (indexLock != -1 && indexNoLock != -1) {
            Item itemLock = bag[indexLock];
            Item itemNoLock = bag[indexNoLock];
            if (itemLock.getQuantity() + itemNoLock.getQuantity() < quantityNeeded) {
                return false;
            }
            if (itemLock.getQuantity() >= quantityNeeded) {
                removeItem(indexLock, quantityNeeded, true);
                return true;
            } else {
                int quantity = itemLock.getQuantity();
                removeItem(indexLock, itemLock.getQuantity(), true);
                removeItem(indexNoLock, quantityNeeded - quantity, false);
                return true;
            }
        }
        return false;
    }

    public void claimQuaySo(Message mss) {
        lockItem.lock();
        try {
            if (isDead) {
                return;
            }
            if (itemQuaySo == null) {
                return;
            }
            if (getSlotNull() < 1) {
                warningBagFull();
                return;
            }
            boolean isRuong = false;
            int type = -1;
            if (mss.reader().available() == 0) {
                isRuong = true;
            } else {
                type = mss.reader().readByte();
            }
            byte typeQuay = itemQuaySo.getType();
            typeQuay = (byte) (typeQuay == 0 ? 1 : typeQuay == 1 ? 5 : typeQuay == 2 ? 25 : 50);
            int amount = itemQuaySo.getQuantity();
            int itemid = itemQuaySo.getIdItem();
            itemQuaySo = null;
            if (isRuong) {
                amount = typeQuay;
                Item item = new Item(itemid);
                item.setQuantity(amount);
                item.setLock(true);
                addItemToBag(item);
                getService().addItem(item);
            } else {
                if (type == 0) {
                    switch (itemid) {
                        case 0:
                            int num = DataCenter.gI().dataQuaySo[itemid][amount] * typeQuay;
                            addZeni(num, true);
                            break;
                        case 1:
                            num = DataCenter.gI().dataQuaySo[itemid][amount] * typeQuay;
                            addBallz(num, true);
                            break;
                        case 2:
                            num = DataCenter.gI().dataQuaySo[itemid][amount] * typeQuay;
                            addCoin(num, true);
                            break;
                        case 3:
                            num = DataCenter.gI().dataQuaySo[itemid][amount] * typeQuay;
                            Item item = new Item(160);
                            item.setQuantity(num);
                            item.setLock(true);
                            addItemToBag(item);
                            getService().addItem(item);
                            break;
                    }
                } else if (type == 1) {
                    int num = DataCenter.gI().dataQuaySo[4][amount] * typeQuay;
                    Item item = new Item(176);
                    item.setQuantity(num);
                    item.setLock(true);
                    addItemToBag(item);
                    getService().addItem(item);
                }
            }
            VDTTUtlis.writing("loggame/quayso/" + name + ".txt",
                    "Nhận quà quay số: " + amount + " loại: " + type + " id: " + itemid + "\n");
            getService().resetSpin();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lockItem.unlock();
        }
    }

    public void thuVanMay(Message ms) {
        try {
            if (isDead) {
                return;
            }

            int itemId = -1;
            RandomCollection<Item> items = null;

            // Xác định itemId và items dựa trên typeTVM
            switch (typeTVM) {
                case 0:
                    itemId = 936;
                    items = ItemManager.getInstance().itemThuVanMayRandom;
                    break;
                case 1:
                    itemId = 1174;
                    items = RandomItem.TVM_NEW;
                    break;
                case 2:
                    itemId = 1174;
                    items = RandomItem.TVM_NEW_2;
                    break;
            }

            // Kiểm tra điều kiện cơ bản
            if (items == null || itemId == -1 || ms == null || ms.reader() == null) {
                return;
            }

            // Kiểm tra số lượng quay (x1 hoặc x5)
            int itemCount = (ms.reader().available() > 0) ? 5 : 1;
            // Kiểm tra đủ chỗ trong túi
            if (getSlotNull() < itemCount) {
                getService().resetScreen();
                warningBagFull();
                return;
            }
            // Kiểm tra đủ vật phẩm
            if (!removeItems(itemId, itemCount)) {
                getService().resetScreen();
                serverDialog("Không đủ " + itemCount + " " + ItemManager.getInstance().getItemTemplate(itemId).name);
                return;
            }
            // Thực hiện quay
            thuVanMay(items, itemCount);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void thuVanMay(RandomCollection<Item> rd, int count) {
        try {
            // Danh sách id và số lượng item nhận được
            List<Integer> ids = new ArrayList<>();
            List<Integer> quantities = new ArrayList<>();

            for (int i = 0; i < count; i++) {
                Item item = rd.next().clone();
                ids.add(item.getId());
                quantities.add(item.getQuantity());
                addItemToBag(item); // Thêm item vào túi
            }

            // Gửi kết quả quay về client
            getService().thuVanMay(ids, quantities);

        } catch (Exception e) {
            // Ghi log lỗi thay vì in trực tiếp ra console
            e.printStackTrace();
        }
    }


    public void createClan(Message ms) {
        try {
            String nameClan = ms.readUTF().trim();
            int index = getIndexItemByIdInBag(301, true);
            if (index == -1) {
                service.serverMessage("Không có hạt giống vũ trụ");
                return;
            }
            if (nameClan.length() < 4 || nameClan.length() > 12) {
                service.serverMessage("Tên vũ trụ phải từ 4 đến 12 ký tự");
                return;
            }
            if (clan != null) {
                service.serverMessage("Bạn đã có vũ trụ");
                return;
            }
            if (nameClan.equals("")) {
                service.serverMessage("Tên vũ trụ không hợp lệ");
                return;
            }
            Pattern p = Pattern.compile("^[a-zA-Z0-9]+$"); // Cho phép ký tự chữ cái (viết thường hoặc viết hoa) và số
            Matcher m1 = p.matcher(nameClan);
            if (!m1.find()) {
                service.serverMessage("Tên vũ trụ không hợp lệ");
                return;
            }
            ClanDAO clanDAO = Clan.getClanDAO();
            if (clanDAO.checkExist(nameClan)) {
                service.serverMessage("Tên vũ trụ đã tồn tại");
                return;
            }
            removeItem(index, 1, true);
            Clan clan = new Clan();
            clan.setName(nameClan);
            clan.setMainName(this.name);
            clan.setAlert("");
            clan.setLevel((byte) 1);
            clan.setCoin(0);
            clan.setExp(0);
            clan.setCountClan(20);
            clan.setRegDate(new Date());
            clan.setOpenDun((byte) 1);
            this.clan = clan;
            Clan.getClanDAO().save(clan);
            Member mem = Member.builder()
                    .classId(this.idCharSys)
                    .level(level())
                    .type(Clan.TYPE_TOCTRUONG)
                    .name(this.name)
                    .pointClan(0)
                    .pointClanWeek(0)
                    .build();
            mem.setChar(this);
            mem.setOnline(true);
            clan.memberDAO.save(mem);
            service.resetScreen();
            service.serverDialog("Tạo vũ trụ thành công");
            zone.getService().sendInfoVuTru(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clanInvite(Message ms) {
        if (this.clan != null) {
            int typeClan = this.clan.getMemberByName(this.name).getType();
            if (typeClan == Clan.TYPE_TOCTRUONG || typeClan == Clan.TYPE_TOCPHO || typeClan == Clan.TYPE_TRUONGLAO) {
                try {
                    String name = ms.readUTF();
                    Char _char = zone.findCharName(name);
                    if (_char != null) {
                        if (_char == this) {
                            return;
                        }
                        if (_char.clan != null) {
                            return;
                        }
                        if (_char.activated == 1) {
                            serverDialog("Đối phương cần mở thành viên ở bulma");
                            return;
                        }
                        if (clan.getNumberMember() >= clan.getMemberMax()) {
                            serverDialog("Vũ trụ đã có đủ thành viên");
                            return;
                        }
                        if (_char.timeOutClan > System.currentTimeMillis()) {
                            serverMessage("Người này vừa rời vũ trụ, chỉ có thể mời lại sau 24h.");
                            return;
                        }
                        Invite.PlayerInvite p = _char.invite.findCharInvite(Invite.GIA_TOC, this.id);
                        if (p != null) {
                            service.serverDialog("Không thể mời vào vào liên tục. Vui lòng thử lại sau 30s nữa.");
                            return;
                        }
                        _char.invite.addCharInvite(Invite.GIA_TOC, this.id, 30);
                        _char.getService().clanInvite(this.name, typeClan, clan.getName());
                    }
                } catch (Exception ex) {
                    Log.error("err: " + ex.getMessage(), ex);
                }
            } else {
                service.serverDialog("Bạn không có quyền này.");
            }
        } else {
            service.serverDialog("Bạn không có vũ trụ.");
        }
    }

    public void acceptInviteClan(Message ms) {
        try {
            if (clan != null) {
                return;
            }
            if (this.activated == 1) {
                serverDialog("Tính năng cần mở thành viên ở bulma");
                return;
            }
            String nameInvite = ms.readUTF();
            Char _char = zone.findCharName(nameInvite);
            if (_char != null && _char.clan != null) {
                Invite.PlayerInvite c = this.invite.findCharInvite(Invite.GIA_TOC, _char.id);
                if (c == null) {
                    serverDialog("Đã hết thời gian chấp nhận vào vũ trụ.");
                    return;
                }
                if (_char.clan.getNumberMember() >= _char.clan.getMemberMax()) {
                    serverDialog("Vũ trụ đã có đủ thành viên");
                    return;
                }
                Clan clan = _char.clan;
                if (clan.countInvite < 1) {
                    serverDialog("Vũ trụ đã hết lượt tham gia trong ngày.");
                    return;
                }
                List<Member> members = clan.memberDAO.getAll();
                if (members.size() < clan.getMemberMax()) {
                    this.clan = clan;
                    Member mem = Member.builder()
                            .classId(this.idCharSys)
                            .level(this.level())
                            .type(Clan.TYPE_NORMAl)
                            .name(this.name)
                            .pointClan(0)
                            .pointClanWeek(0)
                            .build();
                    mem.setChar(this);
                    mem.setOnline(true);
                    clan.memberDAO.save(mem);
                    zone.getService().sendInfoVuTru(this);
                    clan.countInvite--;
                    service.serverMessage("Bạn đã gia nhập vào vũ trụ " + this.clan.getName());
                } else {
                    serverDialog("Vũ trụ đã đủ thành viên.");
                }
            } else {
                serverDialog("Người mời đã rời khỏi khu vực.");
            }
        } catch (Exception ex) {
            Log.error("accept ivite clan err: " + ex.getMessage(), ex);
        }
    }

    public void declineIntiveClan(Message ms) {
        try {
            String nameIntive = ms.readUTF();
            Char pl = ServerManager.findCharByName(nameIntive);
            if (pl != null) {
                pl.serverDialog("Chiến binh " + name + " đã từ chối lời mời gia nhập vũ trụ của bạn");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void requestJoinClan(Message ms) {
        try {
            String nameRequest = ms.readUTF();
            Char pl = ServerManager.findCharByName(nameRequest);
            if (pl != null) {
                if (pl.clan == null) {
                    return;
                }
                if (this.activated == 1) {
                    serverDialog("Cần mở thành viên ở bulma");
                    return;
                }
                if (pl.clan.countInvite < 1) {
                    serverDialog("Vũ trụ đã hết lượt gia nhập trong ngày");
                    return;
                }
                if (pl.clan.getNumberMember() >= pl.clan.getMemberMax()) {
                    serverDialog("Vũ trụ đã có đủ thành viên");
                    return;
                }
                int type = pl.clan.getMemberByName(pl.name).getType();
                if (type == 3 || type == 4 || type == 5) {
                    pl.getService().requestJoinClan(this);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void acceptRequestJoinClan(Message ms) {
        try {
            if (clan == null) {
                return;
            }
            if (clan.getNumberMember() >= clan.getMemberMax()) {
                serverDialog("Vũ trụ đã có đủ thành viên");
                return;
            }
            if (this.activated == 1) {
                serverDialog("Tính năng này cần mtv ở bulma để sử dụng");
                return;
            }
            String nameJoin = ms.readUTF();
            Char pl = ServerManager.findCharByName(nameJoin);
            if (pl != null) {
                if (pl.clan != null) {
                    return;
                }
                if (pl.activated == 1) {
                    serverDialog("Đối phương chưa mở thành viên");
                    return;
                }
                int typeClan = this.clan.getMemberByName(this.name).getType();
                if (typeClan == Clan.TYPE_TOCTRUONG || typeClan == Clan.TYPE_TOCPHO
                        || typeClan == Clan.TYPE_TRUONGLAO) {
                    List<Member> members = clan.memberDAO.getAll();
                    if (clan.countInvite < 1) {
                        serverDialog("Vũ trụ đã hết lượt tham gia trong ngày.");
                        return;
                    }
                    if (members.size() < clan.getMemberMax()) {
                        pl.clan = clan;
                        Member mem = Member.builder()
                                .classId(pl.idCharSys)
                                .level(pl.level())
                                .type(Clan.TYPE_NORMAl)
                                .name(pl.name)
                                .pointClan(0)
                                .pointClanWeek(0)
                                .build();
                        mem.setChar(pl);
                        mem.setOnline(true);
                        clan.memberDAO.save(mem);
                        clan.countInvite--;
                        pl.zone.getService().sendInfoVuTru(pl);
                        pl.service.serverMessage("Bạn đã gia nhập vào vũ trụ " + this.clan.getName());
                    }
                }
            }
        } catch (Exception e) {

        }
    }

    public void changeClanType(Message ms) {
        try {
            String name_input = ms.readUTF();
            byte type = ms.reader().readByte();
            if (this.clan != null) {
                int cType = clan.getMemberByName(name).getType();
                if (cType == Clan.TYPE_TOCTRUONG) {
                    Member mem = this.clan.getMemberByName(name_input);
                    if (mem != null) {
                        if (type == Clan.TYPE_TOCPHO || type == Clan.TYPE_TRUONGLAO) {
                            if (type == Clan.TYPE_TOCPHO && this.clan.getNumberSameType(type) >= 1) {
                                serverMessage("Chức thiên sứ đã đủ chỗ.");
                                return;
                            }
                            if (type == Clan.TYPE_TRUONGLAO && this.clan.getNumberSameType(type) >= 5) {
                                serverMessage("Chức thần sáng tạo đã đủ chỗ.");
                                return;
                            }

                            mem.setType(type);
                            Connection conn = DbManager.getInstance().getConnection(DbManager.GAME);
                            PreparedStatement stmt = conn
                                    .prepareStatement("UPDATE `clan_member` SET `type` = ? WHERE `id` = ? LIMIT 1;");
                            try {
                                stmt.setInt(1, mem.getType());
                                stmt.setInt(2, mem.getId());
                                stmt.executeUpdate();
                            } finally {
                                stmt.close();
                            }
                            Char _char = ServerManager.findCharByName(name_input);
                            if (_char != null) {
                                _char.zone.getService().sendInfoVuTru(_char);
                            }
                            service.sendInfoVuTru();
                            clan.getClanService().serverMessage(name_input + " được bổ nhiệm làm "
                                    + ((type == Clan.TYPE_TOCPHO) ? "thiên sứ" : "thần sáng tạo"));

                        } else {
                            if (type == 5) {
                                if (clan.getCoin() < 1000000) {
                                    service.serverMessage("Ngân sách không đủ 1 triệu ballz");
                                    return;
                                }
                                clan.addCoin(-1000000);
                                clan.writeLog("Đã nhường chức thần huỷ diệt cho " + mem.getName() + " ngân sách trừ "
                                        + VDTTUtlis.formatMoney(1000000) + " Ballz");
                                Connection conn = DbManager.getInstance().getConnection(1);
                                Member old = this.clan.getMemberByName(this.name);
                                old.setType(Clan.TYPE_NORMAl);
                                PreparedStatement stmt1 = conn
                                        .prepareStatement(
                                                "UPDATE `clan_member` SET `type` = ? WHERE `id` = ? LIMIT 1;");
                                try {
                                    stmt1.setInt(1, old.getType());
                                    stmt1.setInt(2, old.getId());
                                    stmt1.executeUpdate();
                                } finally {
                                    stmt1.close();
                                }
                                clan.setMainName(mem.getName());
                                service.sendInfoVuTru();
                                mem.setType(Clan.TYPE_TOCTRUONG);
                                PreparedStatement stmt = conn
                                        .prepareStatement(
                                                "UPDATE `clan_member` SET `type` = ? WHERE `id` = ? LIMIT 1;");
                                try {
                                    stmt.setInt(1, mem.getType());
                                    stmt.setInt(2, mem.getId());
                                    stmt.executeUpdate();
                                } finally {
                                    stmt.close();
                                }
                                Char _char = ServerManager.findCharByName(name_input);
                                if (_char != null) {
                                    _char.zone.getService().sendInfoVuTru(_char);
                                }
                                zone.getService().sendInfoVuTru(this);
                                service.sendInfoVuTru();
                                service.serverMessage("Nhường chức thần huỷ diệt thành công");
                                return;
                            }
                            int preType = mem.getType();
                            Connection conn = DbManager.getInstance().getConnection(DbManager.GAME);
                            mem.setType(Clan.TYPE_NORMAl);
                            PreparedStatement stmt = conn
                                    .prepareStatement("UPDATE `clan_member` SET `type` = ? WHERE `id` = ? LIMIT 1;");
                            try {
                                stmt.setInt(1, mem.getType());
                                stmt.setInt(2, mem.getId());
                                stmt.executeUpdate();
                            } finally {
                                stmt.close();
                            }
                            Char _char = ServerManager.findCharByName(name_input);
                            if (_char != null) {
                                _char.zone.getService().sendInfoVuTru(this);
                            }
                            service.sendInfoVuTru();
                            clan.getClanService().serverMessage(name_input + " đã bị bãi nhiệm");
                        }
                    } else {
                        serverMessage("Thành viên không tồn tại.");
                    }
                } else {
                    serverMessage("Bạn không phải thần huỷ diệt.");
                }
            } else {
                serverMessage("Bạn không có vũ trụ.");
            }
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public void serverMessage(String str) {
        getService().serverMessage(str);
    }

    public void setTimeDunClan(Message ms) {
        try {
            if (clan == null) {
                return;
            }
            byte hour = ms.reader().readByte();
            byte min = ms.reader().readByte();
            if (hour < 0 || min < 0) {
                return;
            }
            int typeClan = this.clan.getMemberByName(this.name).getType();
            if (typeClan == Clan.TYPE_TOCTRUONG || typeClan == Clan.TYPE_TOCPHO || typeClan == Clan.TYPE_TRUONGLAO) {
                clan.hour = hour;
                clan.min = min;
                service.sendInfoVuTru();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void outClan() {
        if (this.clan != null) {
            Member mem = this.clan.getMemberByName(this.name);
            if (mem != null) {
                int cType = mem.getType();
                if (cType != Clan.TYPE_TOCTRUONG) {
                    try {
                        int coin = 10000;
                        switch (cType) {
                            case Clan.TYPE_TOCPHO:
                                coin = 100000;
                                break;

                            case Clan.TYPE_TRUONGLAO:
                                coin = 50000;
                                break;

                            case Clan.TYPE_UUTU:
                                coin = 20000;
                                break;
                        }
                        if (this.ballZ < coin) {
                            service.serverMessage("Bạn không đủ Ballz.");
                            return;
                        }
                        this.timeOutClan = System.currentTimeMillis() + TimeUnit.HOURS.toMillis(24);
                        addBallz(-coin, true);
                        this.clan.memberDAO.delete(mem);
                        this.clan.getClanService().serverMessage(this.name + " đã rời vũ trụ");
                        this.clan = null;
                        service.resetScreen();
                        zone.getService().sendInfoVuTru(this);
                        service.serverMessage("Bạn đã rời vũ trụ thành công.");
                    } catch (Exception ex) {
                        Log.error("out clan err: " + ex.getMessage(), ex);
                    }
                } else {
                    service.serverMessage("Bạn là thần huỷ diệt  nên không thể rời.");
                }
            }
        } else {
            service.serverMessage("Bạn không trong vũ trụ.");
        }
    }

    public void moveOutClan(Message ms) {
        try {
            String name = ms.readUTF();
            if (name.equals(this.name)) {
                service.serverDialog("Bạn không thể tự trục xuất chính mình.");
                return;
            }
            if (this.clan != null) {
                int cType = this.clan.getMemberByName(this.name).getType();
                if (cType == Clan.TYPE_TOCTRUONG || cType == Clan.TYPE_TOCPHO) {
                    Member mem = this.clan.getMemberByName(name);
                    if (mem == null) {
                        service.serverMessage("Thành viên này không tồn tại.");
                        return;
                    }
                    int memType = mem.getType();
                    if (memType >= cType) {
                        service.serverMessage("Bạn không có quyền trục xuất người này.");
                        return;
                    }
                    if (this.clan.countKick <= 0) {
                        service.serverMessage("Clan đã hết lượt kick vào ngày hôm nay.");
                        return;
                    }

                    int coin = 10000;
                    switch (memType) {

                        case Clan.TYPE_TOCPHO:
                            coin = 100000;
                            break;

                        case Clan.TYPE_TRUONGLAO:
                            coin = 50000;
                            break;

                        case Clan.TYPE_UUTU:
                            coin = 20000;
                            break;
                    }
                    if (this.clan.getCoin() < coin) {
                        service.serverMessage("Ngân quỹ không đủ.");
                        return;
                    }
                    clan.memberDAO.delete(mem);
                    clan.writeLog(this.name + " đã kích người chơi " + name + " ngân sách trừ "
                            + VDTTUtlis.formatMoney(coin) + " Ballz");
                    this.clan.addCoin(-coin);
                    this.clan.countKick--;
                    Char _char = ServerManager.findCharByName(name);
                    if (_char != null) {
                        _char.clan = null;
                        _char.zone.getService().sendInfoVuTru(_char);
                        _char.timeOutClan = System.currentTimeMillis() + TimeUnit.HOURS.toMillis(24);
                    }
                    service.sendInfoVuTru();
                    this.clan.getClanService().serverMessage(this.name + " đã trục xuất " + name + ", ngân quỹ trừ "
                            + coin + " Ballz");
                } else {
                }
            } else {
                service.serverMessage("Bạn không có vũ trụ");
            }
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public void inputCoinClan(Message ms) {
        try {
            if (clan == null) {
                return;
            }
            if (trade != null) {
                warningTrade();
                return;
            }
            if (this.activated == 1) {
                serverDialog("Tính năng này cần mtv ở bulma để sử dụng");
                return;
            }
            int coin = ms.reader().readInt();
            if (coin < 1000 || coin > 100000000) {
                serverDialog("Vui lòng nhập trong khoảng từ 1.000 Ballz đến 100.000.000 Ballz.");
                return;
            }
            if (coin > this.ballZ) {
                serverDialog("Bạn không đủ Ballz.");
                return;
            }

            clan.writeLog(this.name + " đã đóng góp " + VDTTUtlis.formatMoney(coin) + " Ballz vào ngân sách vũ trụ");
            clan.addCoin(coin);
            addBallz(-coin, true);
            service.sendInfoVuTru();
            clan.getClanService()
                    .serverMessage(name + " đóng góp vào ngân quỹ " + VDTTUtlis.getCurrency(coin) + " Ballz");
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public void uocRongCerealian(Message ms) {
        try {
            byte select = ms.reader().readByte();
            int index = getIndexItemByIdInBag(1045, true);
            int index2 = getIndexItemByIdInBag(1046, true);
            if (index == -1 || index2 == -1) {
                return;
            }
            RuntimeServer.gI().resetEffectUoc();
            removeItem(index, 1, true);
            removeItem(index2, 1, true);
            switch (select) {
                case 0:
                    Item item = new Item(833);
                    item.setLock(true);
                    addItemToBag(item);
                    getService().addItem(item);
                    break;
                case 1:
                    item = new Item(799);
                    item.setLock(true);
                    addItemToBag(item);
                    getService().addItem(item);
                    break;
                case 2:
                    item = new Item(800);
                    item.setLock(true);
                    addItemToBag(item);
                    getService().addItem(item);
                    break;
                case 3:
                    item = new Item(801);
                    item.setLock(true);
                    addItemToBag(item);
                    getService().addItem(item);
                    break;
                case 4:
                    item = new Item(802);
                    item.setLock(true);
                    addItemToBag(item);
                    getService().addItem(item);
                    break;
                case 5:
                    item = new Item(803);
                    item.setLock(true);
                    addItemToBag(item);
                    getService().addItem(item);
                    break;
                case 6:
                    item = new Item(804);
                    item.setLock(true);
                    addItemToBag(item);
                    getService().addItem(item);
                    break;
                case 7:
                    item = new Item(805);
                    item.setLock(true);
                    addItemToBag(item);
                    getService().addItem(item);
                    break;
            }
            VDTTUtlis.writing("loggame/uocrong/" + name + ".txt", "Ước rồng 2 bi : " + select + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void learnSkillPet(Message ms) {
        try {
            if (pet == null) {
                return;
            }
            byte index = ms.reader().readByte();
            if (index < 0 || index >= pet.skillPet.length) {
                return;
            }
            byte var8 = 0;
            short var9 = 0;
            switch (index) {
                case 0:
                case 1:
                case 2:
                case 3:
                    break;
                case 4:
                    var9 = 750;
                    var8 = 5;
                    break;
                case 5:
                    var9 = 750;
                    var8 = 10;
                    break;
                case 6:
                    var9 = 100;
                    var8 = 15;
                    break;
                case 7:
                    var9 = 200;
                    var8 = 20;
                    break;
                case 8:
                    var9 = 300;
                    var8 = 25;
                    break;
                case 9:
                    var9 = 750;
                    var8 = 30;
                    break;
                case 10:
                    var9 = 400;
                    var8 = 35;
                    break;
                case 11:
                    var9 = 750;
                    var8 = 40;
                    break;
                case 12:
                    var9 = 500;
                    var8 = 45;
                    break;
                case 13:
                    var9 = 750;
                    var8 = 50;
                    break;
                default:
                    return;
            }

            Skill skill = pet.skillPet[index];
            if (skill == null) {
                if (!removeItems(160, var9)) {
                    getService().warningMessage("Không đủ kim cương");
                    return;
                }
                if (index == 4) {
                    Skill skill1 = null;
                    switch (sys) {
                        case 1:
                            skill1 = SkillFactory.getInstance().getSkill(8, 0);
                            break;
                        case 2:
                            skill1 = SkillFactory.getInstance().getSkill(3, 0);
                            break;
                        case 3:
                            skill1 = SkillFactory.getInstance().getSkill(15, 0);
                            break;
                        case 4:
                            skill1 = SkillFactory.getInstance().getSkill(21, 0);
                            break;
                        case 5:
                            skill1 = SkillFactory.getInstance().getSkill(24, 0);
                            break;
                        case 6:
                            skill1 = SkillFactory.getInstance().getSkill(96, 0);
                            break;

                    }
                    pet.skillPet[index] = skill1;
                } else {
                    List<Skill> skills1 = SkillFactory.getInstance().getSkillByLevelNeed(var8);
                    Skill skill1 = skills1.get(VDTTUtlis.nextInt(0, skills1.size() - 1));
                    pet.skillPet[index] = skill1;
                }
            } else {
                if (skill != null) {
                    Skill skillNext = SkillFactory.getInstance().getSkill(skill.isSkillTemplate, skill.level + 1);
                    if (skillNext != null) {
                        if (pet.KI < skillNext.kiUpgrade) {
                            service.serverDialog("Không đủ KI");
                            return;
                        }
                        pet.KI -= skillNext.kiUpgrade;
                        pet.skillPet[index] = skillNext;
                    }
                }
            }

            pet.updateSkillPet();
            pet.setAbility();
            getService().updateItemBody(body[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final int s() {
        Item var1;
        if ((var1 = this.body[0]) != null) {
            ItemOption[] var4 = var1.L();

            for (int var2 = 0; var2 < var4.length; ++var2) {
                if (var4[var2].option[0] == 285) {
                    return var4[var2].f();
                }
            }
        }

        return 0;
    }

    public void addPointKame(int point) {
        pointKame += point;
        getService().serverMessage("Bạn nhận được " + point + " điểm Kame");
    }

    public void addPointSuper(int point) {
        pointSuper += point;
        getService().serverMessage("Bạn nhận được " + point + " điểm Super");
    }

    public void petManager(Message ms) {
        try {
            int type = ms.reader().readByte();
            Log.debug("type: " + type);
            if (isLuongLongNhatThe) {
                serverDialog("Đang trong trạng thái hợp thể");
                return;
            }
            switch (type) {
                case 0:
                    pet.typePet = 0;
                    pet.startDie();
                    zone.getService().updatePet(id, pet.typePet, pet.hp, pet.maxHP, pet.mp, pet.maxMP);
                    break;
                case 1:
                    pet.typePet = 1;
                    pet.isDead = false;
                    pet.hp = pet.mp = 1;
                    zone.getService().updatePet(id, pet.typePet, pet.hp, pet.maxHP, pet.mp, pet.maxMP);
                    break;
                case 2:
                    isAuto = !isAuto;
                    serverDialog("Tự động đánh: " + (isAuto ? "Bật" : "Tắt"));
                    break;
                case 3:
                    if (pet.isDead || pet.typePet == 0) {
                        serverDialog("Đệ tử phải còn sống và đang theo sau");
                        return;
                    }
                    pet.typePet = 3;
                    zone.getService().updatePet(id, pet.typePet, pet.hp, pet.maxHP, pet.mp, pet.maxMP);
                    Effect effect = new Effect(140, TimeUnit.MINUTES.toMillis(30), 200);
                    getEm().setEffect(effect);
                    break;
                case 5:
                    if (zeni < 150) {
                        serverDialog("Không đủ zeni");
                        return;
                    }
                    if (body[3] != null || body[5] != null || body[7] != null || body[9] != null) {
                        serverDialog("Tháo trang bị trước khi mở khoá đệ tử");
                        return;
                    }
                    if (body[0] == null) {
                        return;
                    }
                    addZeni(-150, true);
                    Item detu = body[0].clone();
                    detu.setLock(false);
                    body[0] = null;
                    pet = null;
                    getService().updateItemBodyChange();
                    zone.getService().updateItemBody(this);
                    getService().resetScreen();
                    addItemToBag(detu);
                    getService().addItem(detu);
                    serverMessage("Mở khoá đệ tử thành công");
                    break;
                case 6:
                    int var2 = s();
                    int var26 = 500000;
                    if (var2 == 57) {
                        var26 = 4000000;
                    } else if (var2 == 55) {
                        var26 = 2000000;
                    } else if (var2 == 50) {
                        var26 = 1000000;
                    }
                    if (ballZ < var26) {
                        getService().serverDialog("Không đủ ballz");
                        return;
                    }
                    if (var2 == 59) {
                        getService().serverDialog("Đã tới giới hạn có thể mở ra");
                        return;
                    }
                    addBallz(-var26, true);
                    if (var2 == 40) {
                        body[0].updateGioiHan(10);
                    } else if (var2 == 50) {
                        body[0].updateGioiHan(5);
                    } else if (var2 == 55) {
                        body[0].updateGioiHan(2);
                    } else if (var2 == 57) {
                        body[0].updateGioiHan(1);
                    }
                    getService().updateItemBody(body[0]);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tradeInvite(Message ms) {
        try {
            if (isDead) {
                return;
            }
            // if (true) {
            // serverDialog("Tính năng đang nâng cấp");
            // return;
            // }
            if (this.activated == 1) {
                serverDialog("Tính năng này cần mtv ở bulma để sử dụng");
                return;
            }
            String nameInvite = ms.readUTF();
            Char _char = zone.findCharName(nameInvite);

            if (_char != null) {
                if (_char == this) {
                    return;
                }
                int distance = VDTTUtlis.getRange(_char.x, _char.y, this.x, this.y);
                if (distance > 100) {
                    serverDialog("Khoảng cách quá xa!");
                    return;
                }
                if (_char.activated == 1) {
                    serverDialog("Đối phương chưa mở thành viên");
                    return;
                }
                if (_char.trade != null) {
                    serverDialog("Người này đang giao dịch với người khác.");
                    return;
                }
                Invite.PlayerInvite p = _char.invite.findCharInvite(Invite.GIAO_DICH, this.id);
                if (p != null) {
                    serverDialog("Không thể mời giao dịch liên tục. Vui lòng thử lại sau 30s nữa.");
                    return;
                }
                _char.invite.addCharInvite(Invite.GIAO_DICH, this.id, 30);
                _char.getService().tradeInvite(name);
                Trade trade = new Trade();
                this.trade = trade;
                _char.trade = trade;

                this.myTrade = trade.traders[0] = new Trader(this);
                _char.myTrade = trade.traders[1] = new Trader(_char);

                this.partnerTrade = _char.myTrade;
                _char.partnerTrade = this.myTrade;

            }
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public void tradeItemLock(Message ms) {
        try {
            if (trade == null || myTrade == null) {
                return;
            }
            int xu = ms.reader().readInt();
            byte itemLength = ms.reader().readByte();
            if (xu > 0 && xu <= this.ballZ) {
                this.myTrade.coinTradeOrder = xu;
            }
            Char partner = partnerTrade.getChar();
            String errFormat = "";
            boolean isMyMissTake = true;
            if (this.ballZ < xu) {
                errFormat = "%s không đủ ballz để giao dịch";
            } else if (xu > 500000000) {
                errFormat = "%s đã giao dịch quá giới hạn 500.000.000 ballz";
            } else if (itemLength > partner.getSlotNull()) {
                isMyMissTake = false;
                errFormat = "%s không đủ chỗ trống trong hành trang";
            } else if ((long) partner.ballZ + (long) xu > Integer.MAX_VALUE) {
                isMyMissTake = false;
                errFormat = "%s đã đạt giới hạn chứa ballz, vui lòng giao dịch ít hơn";
            }

            if (!errFormat.equals("")) {
                tradeClose();
                String partner_name_new = partner.name;
                String name_new = this.name;
                serverMessage(String.format(errFormat, isMyMissTake ? "Bạn" : partner_name_new));
                partner.serverMessage(String.format(errFormat, isMyMissTake ? name_new : "Bạn"));
                return;
            }
            ArrayList<Integer> list = new ArrayList<>();
            this.myTrade.itemTradeOrder = new Vector<>();
            for (int i = 0; i < itemLength; i++) {
                int index = ms.reader().readShort();
                if (index < 0 || index >= this.numberCellBag) {
                    continue;
                }
                if (bag[index] != null) {
                    if (bag[index].template.isBlackListItem()) {
                        tradeClose();
                        serverDialog("Không thể giao dịch vật phẩm này.");
                        return;
                    }
                    if (bag[index].isLock()) {
                        tradeClose();
                        serverDialog("Không thể giao dịch vật phẩm đã khoá.");
                        return;
                    }
                    if (VDTTUtlis.checkExist(list, index)) {
                        continue;
                    }
                    this.myTrade.itemTradeOrder.add(bag[index]);
                    list.add(index);
                }

            }
            trade.tradeItemLock(myTrade);
            myTrade.isLock = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tradeAccept() {
        if (trade == null || myTrade == null) {
            return;
        }
        if (!myTrade.accept && myTrade.isLock) {
            myTrade.accept = true;
            (myTrade == trade.traders[0] ? trade.traders[1] : trade.traders[0]).player.getService().tradeAccept();
        }
        if (trade.traders[0].accept && trade.traders[1].accept) {
            try {
                trade.update();
            } catch (Exception ex) {
                Log.error("err: " + ex.getMessage(), ex);
            }
        }
    }

    public void tradeClose() {
        try {
            if (this.trade != null) {
                trade.closeUITrade();
            } else {
                getService().tradeCancel();
            }
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public byte getTypeSucManh() {
        return (byte) (level() / 10);
    }

    public void uocRongEath(Message ms) {
        try {
            List<Integer> indexItem = new ArrayList<>();
            for (int i = 0; i < 7; i++) {
                int index = getIndexItemByIdInBag(839 + i, true);
                if (index < 0)
                    continue;
                indexItem.add(index);
            }

            if (indexItem.size() < 7) {
                serverDialog("Không đủ 7 viên ngọc rồng");
                RuntimeServer.gI().resetEffectUoc();
                return;
            }
            RuntimeServer.gI().resetEffectUoc();
            for (int index : indexItem) {
                removeItem(index, 1, true);
            }
            byte select = ms.reader().readByte();
            switch (select) {
                case 0:
                    addBallz(10000000, true);
                    break;
                case 1:
                    Item detu = new Item(891);
                    detu.setLock(true);
                    addItemToBag(detu);
                    getService().addItem(detu);
                    break;
                case 2:
                    Item item = new Item(189);
                    item.setLock(false);
                    item.strOption = "0,300,600;1,300,600;2,30,60;5,30,60;167,30,60;258,30,60;414,1,1";
                    item.createOption();
                    addItemToBag(item);
                    getService().addItem(item);
                    break;
                case 3:
                    if (increaseExtra >= 20) {
                        serverDialog("Đã tăng cường tối đa");
                        return;
                    }
                    increaseExtra++;
                    break;
            }
            Date date = new Date(System.currentTimeMillis());
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss dd-MM-yyyy");
            String strDate = formatter.format(date);
            VDTTUtlis.writing("loggame/uocrong/" + name + ".txt",
                    name + " đã ước rồng trái đất lấy "
                            + (select == 0 ? "giàu có"
                            : select == 1 ? " thẻ đệ tử" : select == 2 ? " cân đẩu vân" : " 1% chỉ số phụ")
                            + " vào lúc " + strDate + "\n-----------------\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void uocRongNoel(Message ms) {
        try {
            List<Integer> indexItem = new ArrayList<>();
            for (int i = 0; i < 7; i++) {
                int index = getIndexItemByIdInBag(1210 + i, true);
                if (index < 0)
                    continue;
                indexItem.add(index);
            }

            if (indexItem.size() < 7) {
                serverDialog("Không đủ 7 viên ngọc rồng noel");
                RuntimeServer.gI().resetEffectUoc();
                return;
            }
            RuntimeServer.gI().resetEffectUoc();
            for (int index : indexItem) {
                removeItem(index, 1, true);
            }
            byte select = ms.reader().readByte();
            switch (select) {
                case 0:
                    Item mu = new Item(932);
                    mu.setLock(true);
                    mu.setStrOption("258,100,-1;5,100,-1;174,10,-1");
                    addItemToBag(mu);
                    getService().addItem(mu);
                    break;
                case 1:
                    Item item = new Item(1086);
                    item.setLock(true);
                    addItemToBag(item);
                    getService().addItem(item);
                    break;
                case 2:
                    Item trung = new Item(1198);
                    trung.setLock(true);
                    addItemToBag(trung);
                    getService().addItem(trung);
                    break;
                case 3:
                    Item the = new Item(1217);
                    the.setLock(true);
                    addItemToBag(the);
                    getService().addItem(the);
                    break;
            }
            Date date = new Date(System.currentTimeMillis());
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss dd-MM-yyyy");
            String strDate = formatter.format(date);
            VDTTUtlis.writing("loggame/uocrong/" + name + ".txt",
                    name + " đã ước rồng noel lấy "
                            + StringMenu.Noel[select]
                            + " vào lúc " + strDate + "\n-----------------\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void uocRongNamec(Message ms) {
        try {
            List<Integer> indexItem = new ArrayList<>();
            for (int i = 0; i < 7; i++) {
                int index = getIndexItemByIdInBag(901 + i);
                if (index < 0)
                    continue;
                indexItem.add(index);
            }

            if (indexItem.size() < 7) {
                serverDialog("Không đủ 7 viên ngọc rồng noel");
                RuntimeServer.gI().resetEffectUoc();
                return;
            }
            RuntimeServer.gI().resetEffectUoc();
            for (int index : indexItem) {
                removeItem(index, 1, true);
            }
            byte select = ms.reader().readByte();
            switch (select) {
                case 0:
                    Item mu = new Item(1221);
                    mu.setLock(true);
                    mu.expire = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7);
                    addItemToBag(mu);
                    getService().addItem(mu);
                    break;
                case 1:
                    Item batMan = new Item(1223);
                    batMan.setLock(true);
                    batMan.expire = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7);
                    addItemToBag(batMan);
                    getService().addItem(batMan);
                    break;
                case 2:
                    Item vk = new Item(1155);
                    vk.setLock(true);
                    addItemToBag(vk);
                    getService().addItem(vk);
                    break;
                case 3:
                    Item the = new Item(1158);
                    the.setLock(true);
                    addItemToBag(the);
                    getService().addItem(the);
                    break;
                case 4:
                    Item ao = new Item(1161);
                    ao.setLock(true);
                    addItemToBag(ao);
                    getService().addItem(ao);
                    break;
                case 5:
                    Item dan = new Item(1195);
                    dan.setLock(true);
                    dan.setQuantity(2);
                    addItemToBag(dan);
                    getService().addItem(dan);
                    break;
                case 6:
                    Item exp = new Item(1194);
                    exp.setLock(true);
                    exp.setQuantity(500);
                    addItemToBag(exp);
                    getService().addItem(exp);
                    break;
            }
            Date date = new Date(System.currentTimeMillis());
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss dd-MM-yyyy");
            String strDate = formatter.format(date);
            VDTTUtlis.writing("loggame/uocrong/" + name + ".txt",
                    name + " đã ước rồng namec lấy "
                            + StringMenu.Namec[select]
                            + " vào lúc " + strDate + "\n-----------------\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void input(Message ms) {
        if (trade != null) {
            warningTrade();
            return;
        }
        try {
            String text = ms.readUTF();
            short inputID = ms.reader().readShort();
            InputDialog input = getInput();

            if (input == null && inputID != 1) {
                return;
            }
            if (inputID != input.getId()) {
                return;
            }
            try {
                input.setText(text);
                switch (input.getId()) {
                    case CMDInputDialog.EXECUTE:
                        input.execute();
                        break;
                }
            } finally {
                setInput(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updatePointPB(int point) {
        this.pointHell += point;
        getService().updatePointPB();
    }

    public void submenu(Message mss) {
        try {
            byte select = mss.reader().readByte();
            switch (subMenuId) {
                case CMDMenu.QUY_LAO:
                    if (select == answer && !taskOrders.isComplete()) {
                        taskOrders.updateTask(1);
                        questionAndAnswer();
                        return;
                    }
                    countTaskFailed++;
                    if (countTaskFailed >= 2) {
                        serverMessage("Bạn đã trả lời sai quá 2 lần");
                        taskOrders.setFailed(true);
                    } else {
                        questionAndAnswer();
                        serverMessage("Bạn đã trả lời sai rồi, hãy thử lại");
                        return;
                    }
                    break;
            }
            subMenuId = -1;
            getService().sendMessage(new Message((byte) 5));
        } catch (Exception e) {

        }
    }

    public void learnSkillClan(Message ms) {
        try {
            if (clan == null) {
                return;
            }
            byte index = ms.reader().readByte();
            if (index < 0) {
                return;
            }
            if (index >= 10 && index <= 12) {
                serverMessage("Chưa thể học kỹ năng này");
                return;
            }
            SkillClan skillClan = DataCenter.gI().skillClans[index];
            if (skillClan == null) {
                return;
            }
            if (clan.skillClans.contains(skillClan)) {
                serverMessage("Kĩ năng đã học");
                return;
            }
            if (skillClan.price > this.clan.getCoin()) {
                service.serverMessage("Không đủ Ballz");
                return;
            }
            if (clan.getMemberByName(name).getType() != Clan.TYPE_TOCTRUONG) {
                service.serverMessage("Chỉ thần huỷ diệt mới có thể học kĩ năng vũ trụ");
                return;
            }
            clan.addCoin(-skillClan.price);
            clan.writeLog(name + " đã học kĩ năng " + skillClan.name + " ngân sách trừ "
                    + VDTTUtlis.formatMoney(skillClan.price) + " Ballz");
            clan.skillClans.add(skillClan);
            getService().sendInfoVuTru();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendMail(Message ms) {
        lockItem.lock();
        try {
            String receiver = ms.readUTF();
            String title = ms.readUTF();
            String content = ms.readUTF();
            int ballzSend = ms.reader().readInt();
            int index = ms.reader().readShort();
            // if (true) {
            // serverDialog("Tính năng đang nâng cấp");
            // return;
            // }
            if (this.activated == 1) {
                serverDialog("Tính năng này cần mtv ở Bulma để sử dụng");
                return;
            }
            if (receiver == null || receiver.isEmpty() || receiver.equals(name)) {
                return;
            }

            if (ballzSend < 0) {
                return;
            }

            Char pl = ServerManager.findCharByName(receiver);
            if (pl == null) {
                serverDialog("Người nhận không tồn tại");
                return;
            }

            if (pl == this) {
                serverDialog("Không thể gửi thư cho chính mình");
                return;
            }

            int fee = 10;
            if ((ballzSend + fee) > ballZ) {
                serverDialog("Không đủ Ballz");
                return;
            }

            Item item = null;
            String str = " ";
            if (index >= 0 && index < bag.length) {
                if (bag[index] == null) {
                    serverDialog("Vật phẩm không tồn tại");
                    return;
                }
                if (bag[index].template.isBlackListItem()) {
                    serverDialog("Không thể gửi thư vật phẩm này.");
                    return;
                }
                if (bag[index].isLock) {
                    serverDialog("Không thể gửi thư vật phẩm đã khoá");
                    return;
                }
                item = bag[index].clone();
                str = item.getTemplate().name + " số lượng: " + item.getQuantity();
                removeItem(index, item.getQuantity(), true);
            }
            addBallz(-fee, true);
            addBallz(-ballzSend, true);
            ballzSend -= ballzSend / 100;
            Mail mail = pl.createMail(name, title, content, ballzSend, 0, 0, item);
            pl.mailManager.addMail(mail);
            getService().resetScreen();
            getService().updateIndexBag();
            serverDialog("Thư đã được gửi đến " + receiver);
            Date date = new Date(System.currentTimeMillis());
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss dd-MM-yyyy");
            String strDate = formatter.format(date);
            VDTTUtlis.writing("loggame/guithu/" + name + ".txt", "Người nhận " + receiver + " Gửi đi: " + ballzSend
                    + " Ballz và Item :" + str + " thời gian: " + strDate + "\n");
        } catch (Exception e) {
            Log.error("Lỗi khi gửi thư: " + e.getMessage(), e);
        } finally {
            lockItem.unlock();
        }
    }

    public void openUIStall(Message mss) {
        try {
            byte var = mss.reader().readByte();
            byte type = mss.reader().readByte();
            short index = mss.reader().readShort();
            StallManager.getInstance().openUI(this, var, type, index);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saleItemToStall(Message mss) {
        lockItem.lock();
        try {
            // if (true) {
            // serverDialog("Tính năng đang nâng cấp");
            // return;
            // }
            if (this.activated == 1) {
                serverDialog("Tính năng này cần mtv ở Bulma để sử dụng");
                return;
            }
            if (StallManager.getInstance().getListItemSell(this) > 10) {
                serverDialog("Không thể treo bán quá 10 vật phẩm");
                return;
            }
            short index = mss.reader().readShort();
            byte type = mss.reader().readByte();
            int price = mss.reader().readInt();
            if (index < 0 || index >= bag.length) {
                return;
            }
            if (price < 0) {
                return;
            }
            if (bag[index] == null) {
                serverDialog("Vật phẩm không tồn tại");
                return;
            }
            int time = type == 0 ? 8 : type == 1 ? 16 : type == 2 ? 24 : type == 3 ? 48 : 72;
            Item item = bag[index];
            if (price > 99999999) {
                serverDialog("Giá bán không được quá 99.999.999 Ballz");
                return;
            }
            if (item.isLock) {
                serverDialog("Không thể treo bán vật phẩm đã khoá");
                return;
            }
            int fee = 10;
            if (ballZ < fee) {
                serverDialog("Không đủ phí để treo bán");
                return;
            }
            addBallz(-fee, true);
            bag[index] = null;
            StallManager.getInstance().themItem(this, item, price, (int) TimeUnit.HOURS.toMillis(time));
            getService().sellMarket(index);
            getService().updateIndexBag();
            StallManager.getInstance().openUIMeSell(this);
        } catch (Exception e) {

        } finally {
            lockItem.unlock();
        }
    }

    public void buyItemStall(Message mss) {
        try {
            if (this.activated == 1) {
                serverDialog("Tính năng này cần mtv ở Bulma để sử dụng");
                return;
            }
            long id = mss.reader().readLong();
            StallManager.getInstance().buyItem(this, id);
        } catch (Exception e) {

        }
    }

    public void raoBan(Message mss) {
        try {
            if (timeRaoBan > System.currentTimeMillis()) {
                serverMessage("Vui lòng đợi 15p sau khi rao bán mới có thể rao tiếp");
                return;
            }
            if (ballZ < 500) {
                getService().warningMessage("Không đủ Ballz");
                return;
            }
            addBallz(-500, true);
            timeRaoBan = System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(15);
            long id = mss.reader().readLong();
            Stall item = StallManager.getInstance().find(id);
            if (item != null) {
                GlobalService.getInstance().raoBan(name, "Cần bán c#item" + item.getItem().getTemplate().name
                        + "c#white giá " + VDTTUtlis.formatMoney(item.getPrice()) + " Ballz", (byte) 0, item);
            }
        } catch (Exception e) {
        }

    }

    public void addFriend(Message ms) {
        try {
            String nameInvite = ms.readUTF();
            Char _char = ServerManager.findCharByName(nameInvite);

            if (_char == null) {
                service.serverMessage("Người này không online hoặc không tồn tại!");
                return;
            }
            if (_char == this) {
                return;
            }
            Friend friend = friends.get(nameInvite);
            if (friend != null) {
                service.serverMessage(nameInvite + " đã có trong danh sách bạn bè.");
                return;
            }
            Friend me = _char.friends.get(name);
            if (me != null) {
                me.type = 1;
                friends.put(_char.name, new Friend(_char.name, (byte) 1, true));
                getService().addFriend(nameInvite, 1, true);
                _char.getService().removeFriend(name);
                getService().removeFriend(nameInvite);
                _char.getService().addFriend(name, 1, true);
                return;
            } else {
                friends.put(_char.name, new Friend(_char.name, (byte) 0, false));
            }
            getService().addFriend(nameInvite, 0, false);
            _char.getService().inviteFriend(name, 2);
            serverMessage("Đã gửi lời mời kết bạn đến " + nameInvite);
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public void removeFriend(Message ms) {
        try {
            String nameInvite = ms.readUTF();
            Char _char = ServerManager.findCharByName(nameInvite);
            if (this.friends.get(nameInvite) != null) {
                if (_char != null) {
                    this.friends.remove(nameInvite);
                    getService().removeFriend(nameInvite);
                    if (_char.friends.get(name) != null) {
                        _char.friends.remove(name);
                    }
                    _char.getService().removeFriend(name);
                }
            } else {
                getService().removeFriend(nameInvite);
                if (_char != null) {
                    _char.getService().removeFriend(name);
                    if (_char.friends.get(name) != null) {
                        _char.friends.remove(name);
                    }
                }
            }
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }

    }

    public Friend[] getFriends() {
        if (this.friends == null) {
            return new Friend[0];
        }
        return this.friends.values().toArray(new Friend[this.friends.size()]);
    }

    public void hoanChuyen(Message mss) {
        try {
            short index = mss.reader().readShort();
            Item item = bag[index];
            if (zeni < 150) {
                serverDialog("Không đủ zeni");
                return;
            }
            if (item == null) {
                return;
            }
            if (item.getTemplate().type != 2 && item.getTemplate().type != 4 && item.getTemplate().type != 6
                    && item.getTemplate().type != 8) {
                return;
            }
            if (body[item.getTemplate().type] == null) {
                return;
            }
            if (body[item.getTemplate().type].strOption == null || body[item.getTemplate().type].strOption.isEmpty()) {
                serverDialog("Đồ đang mặc không có chỉ số");
                return;
            }
            if (item.isChiSoGoc()) {
                serverDialog("Không thể hoán chuyển vật phẩm này");
                return;
            }
            int type = item.getTemplate().type;
            if ((item.isTrangBiThienSu() && body[type].isTrangBiThienSu()) || (item.isTrangBiThienSu() && body[type].isTrangBiThienSu())) {
                serverDialog("Không thể hoán chuyển giữa các trang bị thiên sư");
                return;
            }
            if ((item.isTrangBiThienSu() && body[type].isTrangBiThanLinh()) || (item.isTrangBiThanLinh() && body[type].isTrangBiThienSu())) {
                serverDialog("Không thể hoán chuyển giữa các trang bị thiên sứ và thần linh");
                return;
            }
            if ((item.isTrangBiThanLinh() && body[type].isTrangBiThanLinh())) {
                serverDialog("Không thể hoán chuyển giữa các trang bị thần linh");
                return;
            }
            addZeni(-150, true);
            item.strOption += ";" + body[type].strOption;
            item.setUpgrade(body[type].getUpgrade());
            body[type].strOption = "";
            body[type].setUpgrade((byte) 0);
            getService().updateItemBodyChange();
            getService().updateItem(item);
            zone.getService().updateItemBody(this);
            setAbility();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadEventPoint() {
        try {
            Event event = Event.getEvent();
            EventPoint eventPoint = event.findEventPointByPlayerID(this.id);
            if (eventPoint == null) {
                eventPoint = event.createEventPoint();
                eventPoint.setPlayerID(this.id);
                eventPoint.setPlayerName(this.name);

                Gson g = new Gson();
                PreparedStatement ps = DbManager.getInstance().getConnection(DbManager.GAME)
                        .prepareStatement(SQLStatement.INSERT_EVENT_POINT, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, event.getId());
                ps.setInt(2, this.id);
                ps.setString(3, g.toJson(eventPoint.getPoints()));
                ps.setInt(4, Config.getInstance().getServerID());
                ps.executeUpdate();
                ResultSet generatedKeys = ps.getGeneratedKeys();
                if (generatedKeys.next()) {
                    eventPoint.setId(generatedKeys.getInt(1));
                }
                ps.close();
                event.addEventPoint(eventPoint);
            }
            setEventPoint(eventPoint);
        } catch (SQLException ex) {
            Logger.getLogger(Char.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateEventPoint() {
        try {
            EventPoint eventPoint = getEventPoint();
            if (eventPoint != null) {
                Gson g = new Gson();
                PreparedStatement ps = DbManager.getInstance().getConnection(DbManager.GAME)
                        .prepareStatement(SQLStatement.UPDATE_EVENT_POINT);
                ps.setString(1, g.toJson(eventPoint.getPoints()));
                ps.setInt(2, eventPoint.getId());
                ps.executeUpdate();
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Char.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void testInvite(Message msg) {
        try {
            if (zone.map.isVoDai() || zone.map.isGDSM()) {
                return;
            }
            Char _char = this.zone.findCharName(msg.readUTF());
            if (_char == null) {
                serverDialog("Hiện người này không còn trong khu vực này.");
                return;
            }
            Invite.PlayerInvite p = _char.invite.findCharInvite(Invite.TY_THI, this.id);
            if (p != null) {
                serverDialog("Không thể mời tỷ thí liên tục. Vui lòng thử lại sau 30s nữa.");
                return;
            }
            _char.invite.addCharInvite(Invite.TY_THI, this.id, 30);
            if (!_char.isTest) {
                _char.getService().testInvite(this.name);
            } else {
                serverDialog("Hiện tại người này đang tỷ thí với người khác.");
            }
        } catch (Exception e) {
            Log.error("err: " + e.getMessage(), e);
        }
    }

    public void testEnd(int num, Char pl) {
        if (num > 0) {
            this.hp = num;
        }
        pl.testCharId = 0;
        pl.isTest = false;
        zone.getService().testEnd(this.id, pl.id, num);
        this.isTest = false;
        this.testCharId = 0;
    }

    public void testAccept(Message msg) {
        try {

            Char player = zone.findCharName(msg.readUTF());
            if (player == null) {
                serverDialog("Hiện người này không còn trong khu vực này.");
                return;
            }
            if (player.isTest) {
                serverDialog("Hiện tại người này đang tỷ thí với người khác.");
                return;
            }
            Invite.PlayerInvite p = invite.findCharInvite(Invite.TY_THI, player.id);
            if (p != null) {
                player.testCharId = this.id;
                this.testCharId = player.id;
                this.isTest = true;
                player.isTest = true;
                zone.getService().testAccept(this.id, player.id);
            } else {
                serverDialog("Đã hết thời gian để chấp nhận.");
            }
        } catch (Exception e) {
        }
    }

    public void addCuuSat(Message msg) {
        try {
            if (isDead) {
                return;
            }
            if (zone.map.isVoDai() || zone.map.isGDSM()) {
                return;
            }
            if (killCharId == 0) {
                Char player = this.zone.findCharName(msg.readUTF());
                if (player != null && player.zone != null) {
                    this.killCharId = player.id;
                    this.isCuuSat = true;
                    zone.getService().addCuuSat(id, player.id);
                }
            }
        } catch (Exception ex) {
            Log.error("err: " + ex.getMessage(), ex);
        }
    }

    public void clearCuuSat(boolean var) {
        try {
            zone.getService().clearCuuSat(id, var);
            this.killCharId = 0;
            this.isCuuSat = false;
        } catch (Exception e) {
        }
    }

    public void changeName() {
        if (this.clan == null) {
            int index = getIndexItemByIdInBag(437);
            if (index == -1) {
                return;
            }
            if (StallManager.getInstance().getListItemSell(this) > 0) {
                serverDialog(
                        "Không thể thay đổi tên khi đang rao bán vật phẩm.Vui lòng gỡ hết vật phẩm trên chợ trước khi thay đổi tên.");
                return;
            }
            InputDialog input = new InputDialog(CMDInputDialog.EXECUTE, "Tên mới", () -> {
                try {
                    String newname = this.input.getText();
                    if (newname.equals("") || newname.isEmpty()) {
                        service.resetScreen();
                        serverDialog("Tên không được để trống.");
                        return;
                    }
                    Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
                    Matcher m1 = p.matcher(newname);
                    if (!m1.find()) {
                        service.resetScreen();
                        service.serverDialog("Tên nhân vật không được chứa ký tự đặc biệt!");
                        return;
                    }
                    if (newname.length() < 5 || newname.length() > 12) {
                        service.resetScreen();
                        service.serverDialog("Tên tài khoản chỉ cho phép từ 5 đến 12 ký tự!");
                        return;
                    }
                    if (newname.equals("ADMIN") || newname.equals("admin")) {
                        service.resetScreen();
                        serverDialog("không thể sử dụng tên này.");
                        return;
                    }
                    try {

                        PreparedStatement stmt = DbManager.getInstance().getConnection(DbManager.UPDATE)
                                .prepareStatement(SQLStatement.CHECK_NAME, ResultSet.TYPE_SCROLL_SENSITIVE,
                                        ResultSet.CONCUR_READ_ONLY);
                        stmt.setString(1, newname);
                        ResultSet data = stmt.executeQuery();
                        if (data.first()) {
                            service.resetScreen();
                            serverDialog("Tên đã tồn tại, vui lòng chọn một tên khác.");
                            return;
                        }

                        PreparedStatement stmt2 = DbManager.getInstance().getConnection(DbManager.UPDATE)
                                .prepareStatement(SQLStatement.UPDATE_NAME);
                        try {

                            stmt2.setString(1, newname);
                            stmt2.setInt(2, this.id);
                            stmt2.executeUpdate();
                        } finally {
                            stmt2.close();
                        }
                        // Item item = ItemFactory.getInstance().newItem(ItemName.THE_DOI_TEN);
                        removeItem(index, 1, true);
                        serverDialog(String.format("Thay đổi thành công, tên mới của bạn là: %s.", newname));
                        service.serverDialog("Tự Động Thoát Sau 1s.");
                        int TimeSeconds = 3;
                        while (TimeSeconds > 0) {
                            TimeSeconds--;
                            try {
                                Thread.sleep(500L);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Char.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if (!isCleaned) {
                            user.session.closeMessage();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    Log.error("err: " + e.getMessage(), e);
                }
            });
            setInput(input);
            getService().showInputDialog();
        } else {
            serverDialog("Bạn Phải Thoát vũ trụ Trước Khi Tiến Hành Đổi Tên.");
        }
        return;
    }

    public void buyChangeCaiTrang() {
        try {
            if (zeni < 60) {
                serverMessage("Không đủ zeni");
                return;
            }
            addZeni(-60, true);
            if (timeChangeCaiTrang > System.currentTimeMillis() / 1000) {
                timeChangeCaiTrang += TimeUnit.DAYS.toMillis(7) / 1000;
            } else {
                timeChangeCaiTrang = (int) ((System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7)) / 1000);
            }
            getService().updateTimeChangeCaiTrang();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void changeCaiTrang(Message ms) {
        try {
            if (timeReloadCaiTrang > System.currentTimeMillis() / 1000) {
                serverMessage("Đang trong thời gian hồi");
                return;
            }
            byte type = ms.reader().readByte();
            short index = ms.reader().readShort();
            short idItem = ms.reader().readShort();
            short idSkill = ms.reader().readShort();
            if (index != 14) {
                return;
            }
            Item item = checkBag(type)[index];
            if (item == null) {
                return;
            }
            item.id = idItem;
            item.changeSkill(idSkill);
            setAbility();
            reloadSkillCaiTrang();
            timeReloadCaiTrang = (int) ((System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(5)) / 1000);
            getService().updateTimeChangeCaiTrang();
            getService().updateItemBodyChange();
            zone.getService().updateItemBody(this);
            getService().resetScreen();
            getService().resetScreen();
            serverMessage("Thay đổi thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewInfoChangeCaiTrang(Message ms) {
        try {
            Log.debug(ms.reader().readByte());
            Log.debug(ms.reader().readShort());
            Log.debug(ms.reader().readShort());
            Log.debug(ms.reader().readShort());
        } catch (Exception e) {

        }

    }

    public void withDrawCoinClan(Message ms) {
        try {
            if (clan == null) {
                return;
            }
            int type = clan.getMemberByName(name).getType();
            if (type != Clan.TYPE_TOCTRUONG && type != Clan.TYPE_TOCPHO) {
                serverDialog("Chỉ thần huỷ diệt và thần sáng tạo mới có thể rút quỹ");
                return;
            }
            int money = ms.reader().readInt();
            if (money < 0) {
                serverDialog("Số tiền không hợp lệ");
                return;
            }
            if (money > clan.getCoin()) {
                serverDialog("Không đủ tiền trong quỹ");
                return;
            }
            clan.addCoin(-money);
            money -= money / 100;
            addBallz(money, true);
            clan.writeLog(name + " đã rút " + VDTTUtlis.formatMoney(money) + " Ballz từ quỹ");
            getService().resetScreen();
            getService().sendInfoVuTru();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void phatItemClan(Message ms) {
        try {
            if (clan == null) {
                return;
            }
            short index = ms.reader().readShort();
            int type = clan.getMemberByName(name).getType();
            if (type != Clan.TYPE_TOCTRUONG && type != Clan.TYPE_TOCPHO) {
                serverDialog("Chỉ thần huỷ diệt và thần sáng tạo mới có thể phát vật phẩm");
                return;
            }
            if (index < 0 || index >= clan.items.length) {
                return;
            }
            if (clan.items[index] == null) {
                return;
            }
            Item item = clan.items[index].clone();
            clan.items[index] = null;
            List<Member> list = clan.memberDAO.getAll();
            if (list == null) {
                return;
            }
            for (Member member : list) {
                try {
                    if (member.getPointClanWeek() < 100) {
                        continue;
                    }
                    Char pl = ServerManager.findCharByName(member.getName());
                    if (pl != null && !pl.isCleaned) {
                        Mail mail = pl.createMail("Hệ thống", "Phân phát vật phẩm vũ trụ", "Vật phẩm từ vũ trụ", 0, 0,
                                0, item.clone());
                        pl.mailManager.addMail(mail);
                    } else {
                        List<Mail> mailList = DbManager.getInstance().getMail(member.getName());
                        if (mailList == null || mailList.size() >= 120) {
                            continue;
                        }
                        Mail mail = new Mail();
                        if (mailList.isEmpty()) {
                            mail.id = 0;
                        } else {
                            mail.id = mailList.get(mailList.size() - 1).id + 1;
                        }
                        mail.setSender("Hệ thống");
                        mail.setTitle("Phân phát vật phẩm vũ trụ");
                        mail.setContent("Vật phẩm từ vũ trụ");
                        mail.setBallz(0);
                        mail.setCoin(0);
                        mail.setZeni(0);
                        mail.setItem(item.clone());
                        mail.setTime((int) ((System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7)) / 1000));
                        mailList.add(mail);
                        DbManager.getInstance().updateMail(member.getName(), mailList);
                    }
                } catch (Exception e) {
                    Log.error("Loi phat do clan ", e);
                }
            }
            getService().sendInfoVuTru();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void uocRongSaoDen(Message ms) {
        try {
            List<Integer> indexItem = new ArrayList<>();
            for (int i = 0; i < 7; i++) {
                int index = getIndexItemByIdInBag(911 + i, true);
                if (index < 0)
                    continue;
                indexItem.add(index);
            }

            if (indexItem.size() < 7) {
                serverDialog("Không đủ 7 viên ngọc rồng sao đen");
                RuntimeServer.gI().resetEffectUoc();
                return;
            }
            RuntimeServer.gI().resetEffectUoc();
            for (int index : indexItem) {
                removeItem(index, 1, true);
            }
            byte select = ms.reader().readByte();
            switch (select) {
                case 0:
                    Item da = new Item(829);
                    da.setLock(true);
                    da.setQuantity(30);
                    addItemToBag(da);
                    getService().addItem(da);
                    break;
                case 1:
                    addCoin(6000000, true);
                    break;
                case 2:
                    Item kc = new Item(160);
                    kc.setLock(true);
                    kc.setQuantity(500);
                    addItemToBag(kc);
                    getService().addItem(kc);
                    break;
                case 3:
                    Item ruong = new Item(177);
                    ruong.setLock(true);
                    ruong.setQuantity(3);
                    addItemToBag(ruong);
                    getService().addItem(ruong);
                    break;
                case 4:
                    Effect old = getEm().findByID(158);
                    if (old != null) {
                        old.addTime(TimeUnit.DAYS.toMillis(6));
                        zone.getService().playerAddEffect(this, old);
                    } else {
                        Effect effect = new Effect(158, TimeUnit.DAYS.toMillis(6), 0);
                        getEm().setEffect(effect);
                    }
                    break;
            }
            Date date = new Date(System.currentTimeMillis());
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss dd-MM-yyyy");
            String strDate = formatter.format(date);
            VDTTUtlis.writing("loggame/uocrong/" + name + ".txt", name + " đã ước rồng sao đen lấy "
                    + StringMenu.SaoDen[select] + " vào lúc " + strDate + "\n-----------------\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isValidItems(Item item1, Item item2) {
        if (item1 == null || item2 == null)
            return false;
        if (item1.getTemplate().type != item2.getTemplate().type)
            return false;
        if (!item1.isTypeClothe() || !item2.isTypeClothe())
            return false;
        if (item1.strOption.isEmpty() || item2.strOption.isEmpty())
            return false;
        return true;
    }

    private boolean hasRequiredFusionStones(int indexDa) {
        return indexDa != -1 && bag[indexDa].getQuantity() >= 150;
    }

    public void hopNhatItem(Message ms) {
        lockItem.lock();
        try {
            byte type_1 = ms.reader().readByte();
            short index_1 = ms.reader().readShort();
            byte type_2 = ms.reader().readByte();
            short index_2 = ms.reader().readShort();
            Item item1 = checkBag(type_1)[index_1];
            Item item2 = checkBag(type_2)[index_2];

            if (!isValidItems(item1, item2)) {
                serverMessage("Các món đồ không hợp lệ để hợp nhất");
                return;
            }

            if (item1.isKham() || item2.isKham()) {
                serverDialog(
                        "Không thể hợp nhất trang bị đã khảm. Vui lòng tách khảm trước khi hợp nhất tránh việc mất đá khảm");
                return;
            }
            if (item1.isHopNhat() || item2.isHopNhat()) {
                serverDialog("Không thể hợp nhất trang bị đã hợp nhất");
                return;
            }

            int indexDa = getIndexItemByIdInBag(829);
            if (!hasRequiredFusionStones(indexDa)) {
                serverMessage("Không đủ đá hợp nhất cần 150 " + bag[indexDa].getTemplate().name);
                return;
            }
            ItemOption[] itemOptions = item1.getItemOption();
            if (itemOptions == null) {
                return;
            }
            Vector<ItemOption> itemOptions1 = new Vector<>();
            Vector<ItemOption> itemOptions2 = new Vector<>();

            ItemOption var5 = null;
            for (int i = 0; i < itemOptions.length; i++) {
                ItemOption op = itemOptions[i];
                if (op.option[0] == 370) {
                    op.option[1] += 1;
                    var5 = op;
                }
                if (op.getItemOptionTemplate().type == 18) {
                    itemOptions1.add(op);
                } else {
                    itemOptions2.add(op);
                }
            }
            if (itemOptions1.size() == 0) {
                var5 = new ItemOption("370,1,-1");
                itemOptions1.add(var5);
            }
            itemOptions = item2.getItemOption();
            if (itemOptions == null) {
                return;
            }
            Vector var10 = new Vector();
            int var9;
            for (var9 = 0; var9 < DataCenter.gI().itemOptionTemplate.length; ++var9) {
                if (DataCenter.gI().itemOptionTemplate[var9].type == 18) {
                    var10.add(DataCenter.gI().itemOptionTemplate[var9]);
                }
            }

            for (int i = 0; i < itemOptions.length; i++) {
                ItemOption op = itemOptions[i];
                if (op.option[0] == 370) {
                    var5.option[1] += op.option[1];
                }
                if (op.getItemOptionTemplate().type == 17) {
                    for (int var7 = 0; var7 < var10.size(); ++var7) {
                        if (((ItemOptionTemplate) var10.get(var7)).text.equals(op.getItemOptionTemplate().text)) {
                            Item.a(itemOptions1, new ItemOption(
                                    ((ItemOptionTemplate) var10.get(var7)).id + "," + op.option[1] + ",-1"));
                            break;
                        }
                    }
                } else if (op.getItemOptionTemplate().type == 18) {
                    Item.a(itemOptions1, op);
                }
            }
            itemOptions2.addAll(itemOptions1);
            removeItem(indexDa, 150, true);
            boolean isThanhCong = false;
            if (VDTTUtlis.nextInt(0, 100) < 20) {
                item1.strOption = Item.creatOption(itemOptions2);
                checkBag(type_2)[index_2] = null;
                isThanhCong = true;
            }
            getService().updateItemHopNhat(isThanhCong, item2, type_2, item1, type_1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lockItem.unlock();
        }
    }

//    public void claimArchivement(Message ms) {
//        try {
//            byte index = ms.reader().readByte();
//            switch (index) {
//                case 0:
//                    if (archievement.hellArchivement == 100) {
//                        archievement.hellArchivement = 101;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 1:
//                    if (archievement.jailArchivement == 100) {
//                        archievement.jailArchivement = 101;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 2:
//                    if (archievement.jail2Archivement == 100) {
//                        archievement.jail2Archivement = 101;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 3:
//                    if (archievement.timeZoomArchivement == 10) {
//                        archievement.timeZoomArchivement = 11;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 4:
//                    if (archievement.voDaiArchivement == 30) {
//                        archievement.voDaiArchivement = 31;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 5:
//                    if (archievement.giaiDauArchivement == 30) {
//                        archievement.giaiDauArchivement = 31;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 6:
//                    if (archievement.taskQuyLaoArchivement == 100) {
//                        archievement.taskQuyLaoArchivement = 101;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 7:
//                    if (archievement.taskQuyLao2Archivement == 1000) {
//                        archievement.taskQuyLao2Archivement = 1001;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 8:
//                    if (archievement.chatVipArchivement == 35) {
//                        archievement.chatVipArchivement = 36;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 9:
//                    if (archievement.chatArchivementl == 120) {
//                        archievement.chatArchivementl = 121;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 10:
//                    if (archievement.peanutArchivement == 15) {
//                        archievement.peanutArchivement = 16;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 11:
//                    if (archievement.rewardPerWeekArchivement == 10) {
//                        archievement.rewardPerWeekArchivement = 11;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 12:
//                    if (archievement.rewardClanArchivement == 25) {
//                        archievement.rewardClanArchivement = 26;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 13:
//                    if (archievement.sieuQuaiArchivement == 50) {
//                        archievement.sieuQuaiArchivement = 51;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 14:
//                    if (archievement.sieuQuai2Archivement == 500) {
//                        archievement.sieuQuai2Archivement = 501;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 15:
//                    if (archievement.tinhAnhArchivement == 100) {
//                        archievement.tinhAnhArchivement = 101;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 16:
//                    if (archievement.tinhAnh2Archivement == 1000) {
//                        archievement.tinhAnh2Archivement = 1001;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 17:
//                    if (archievement.thuLinhArchivement == 50) {
//                        archievement.thuLinhArchivement = 51;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 18:
//                    if (archievement.thuLinh2Archivement == 500) {
//                        archievement.thuLinh2Archivement = 501;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 19:
//                    if (archievement.killBossArchivement == 10) {
//                        archievement.killBossArchivement = 11;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 20:
//                    if (archievement.killBoss2Archivement == 100) {
//                        archievement.killBoss2Archivement = 101;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 21:
//                    if (archievement.tienIchArchivement == 20) {
//                        archievement.tienIchArchivement = 21;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 22:
//                    if (archievement.capsuleArchivement == 20) {
//                        archievement.capsuleArchivement = 21;
//                        archievement.countArchivement++;
//                        addCoin(100000, true);
//                        Item item = new Item(7);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//                case 23:
//                    if (archievement.countArchivement == 23) {
//                        archievement.countArchivement = 24;
//                        addCoin(5000000, true);
//                        Item item = DataCenter.gI().dataTemplateAchievement[index].a(this);
//                        item.setLock(true);
//                        item.setQuantity(1);
//                        addItemToBag(item);
//                        getService().addItem(item);
//                    }
//                    break;
//            }
//            getService().openUITask();
//        } catch (IOException e) {
//
//        }
//    }

    public void activeCDV(Message ms) {
        try {
            if (body[10] == null) {
                return;
            }
            if (zeni < 250) {
                serverDialog("Không đủ zeni");
                return;
            }
            if (body[10].optionSucManh()) {
                if (body[10].isMaxSucManh()) {
                    int var35 = 0;
                    int itemId = -1;
                    switch (body[10].id) {
                        case 189:
                            var35 = 150;
                            itemId = 276;
                            break;
                        case 276:
                            var35 = 300;
                            itemId = 306;
                            break;
                        case 306:
                            var35 = 450;
                            itemId = 476;
                            break;
                        case 476:
                            var35 = 600;
                            itemId = 477;
                            break;
                        case 477:
                            var35 = 800;
                            itemId = 478;
                            break;
                        case 478:
                            var35 = 1000;
                            itemId = 479;
                            break;
                        case 479:
                            var35 = 1200;
                            itemId = 480;
                            break;
                        case 480:
                            var35 = 1400;
                            itemId = 481;
                            break;
                        case 481:
                            var35 = 1600;
                            itemId = 482;
                            break;
                        case 482:
                            var35 = 1800;
                            itemId = 483;
                            break;
                        case 483:
                            var35 = 2000;
                            itemId = 484;
                            break;
                        case 484:
                            serverDialog("Cân đẩu vẫn đã đạt cấp độ tối đa");
                            return;
                    }
                    if (zeni < var35) {
                        serverDialog("Không đủ zeni");
                        return;
                    }
                    if (itemId == -1) {
                        serverDialog("Không thể nâng cấp cân đẩu");
                        return;
                    }
                    addZeni(-var35, true);
                    Item item = new Item(itemId);
                    item.setLock(true);
                    item.strOption = body[10].strOption;
                    item.upgrade = body[10].upgrade;
                    item.upgradeItem(0);
                    Vector<ItemOption> itemOptions = new Vector<>();
                    ItemOption[] options1 = item.getItemOption();
                    for (ItemOption op : options1) {
                        if (op.getId() == 413) {
                            op.option[1] = 0;
                            op.option[2] += 10000;
                        } else if (op.getId() == 414) {
                            op.option[1] += 1;
                        } else {
                            op.option[1] += op.option[1] * 10 / 100;
                        }
                        itemOptions.add(op);
                    }
                    item.strOption = Item.creatOption(itemOptions);
                    body[10] = item;
                    getService().updateItemBody(body[10]);
                    zone.getService().updateItemBody(this);
                    getService().serverDialog("Nâng cấp cân đẩu thành công");
                }
            } else {
                addZeni(-250, true);
                body[10].strOption = "413,0,30000;" + body[10].strOption;
                getService().updateItemBodyChange();
                zone.getService().updateItemBody(this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateSucManhCDV(int num) {
        if (body[10] == null) {
            return;
        }
        if (!body[10].optionSucManh()) {
            return;
        }
        if (body[10].isMaxSucManh()) {
            return;
        }
        num += num * buffSucManh / 100;
        body[10].updateSucManh(num);
        getService().updateItemBodyChange();
        zone.getService().updateItemBody(this);
    }


    public void verifyCaptcha(Message mss) {
        try {
            String captcha = mss.readUTF();
            if (!this.captcha.equals(captcha)) {
                serverMessage("Mã xác nhận không đúng");
                return;
            }
            getService().resetCaptcha();
            joinZone(mapCaptcha, zoneCaptcha, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateThienSu(Message mss) {
        try {
            byte type = mss.reader().readByte();
            short index = mss.reader().readShort();
            byte size = mss.reader().readByte();
            boolean[] list = new boolean[numberCellBag];
            if (zeni < 2500) {
                serverDialog("Không đủ zeni");
                return;
            }
            Item item = checkBag(type)[index];
            if (item == null || item.id < 923 || item.id > 926) {
                serverDialog("Vật phẩm không hợp lệ");
                return;
            }

            Vector<Item> items = new Vector<>();
            for (int i = 0; i < size; i++) {
                short indexDa = mss.reader().readShort();
                if (!list[indexDa]) {
                    list[indexDa] = true;
                    Item bagItem = bag[indexDa];
                    if (bagItem != null && (bagItem.id == 353 || bagItem.id == 354 || bagItem.id == 562
                            || bagItem.id == 564 || bagItem.id == 566)) {
                        items.add(bagItem);
                    }
                }
            }
            if (items.size() != 5) {
                return;
            }

            int[] requiredIds = {353, 354, 562, 564, 566};
            boolean[] hasRequiredItems = new boolean[requiredIds.length];
            for (Item it : items) {
                for (int i = 0; i < requiredIds.length; i++) {
                    if (it.id == requiredIds[i] && it.getQuantity() >= 500) {
                        hasRequiredItems[i] = true;
                    }
                }
            }
            for (boolean hasItem : hasRequiredItems) {
                if (!hasItem) {
                    serverDialog("Cần 5 loại đá để nâng cấp");
                    return;
                }
            }

            Item thienSu = new Item(Item.getItemThienSu(item.id));
            thienSu.setLock(true);

            Vector<ItemOption> opNew = new Vector<>();
            opNew.add(new ItemOption(487, 15, -1));
            switch (item.id) {
                case 923:
                    opNew.add(new ItemOption(288, 30, -1));
                    break;
                case 924:
                    opNew.add(new ItemOption(291, 30, -1));
                    break;
                case 925:
                    opNew.add(new ItemOption(292, 30, -1));
                    break;
                case 926:
                    opNew.add(new ItemOption(42, 30, -1));
                    break;
            }
            opNew.add(new ItemOption(276, 300, -1));

            Vector<ItemOption> itemOptions = new Vector<>(Arrays.asList(item.getItemOption()));
            if (itemOptions.size() > 4) {
                itemOptions.addAll(4, opNew);
            } else {
                itemOptions.addAll(opNew);
            }

            thienSu.strOption = Item.creatOption(itemOptions);
            thienSu.setUpgrade(item.getUpgrade());

            for (Item it : items) {
                removeItem(it.index, 500, true);
            }
            addZeni(-2500, true);
            checkBag(type)[index] = null;
            getService().updateItemBodyChange();
            zone.getService().updateItemBody(this);
            getService().resetScreen();
            addItemToBag(thienSu);
            getService().addItem(thienSu);
            getService().updateIndexBag();
            serverDialog("Nâng cấp thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addPointKillBoss(int point) {
        if (this.clan != null) {
            Member mem = this.clan.getMemberByName(this.name);
            if (mem != null) {
                this.clan.addPointKillBoss(point);
                this.serverMessage("Bạn nhận được " + point + " điểm săn boss vũ trụ.");
            }
        }
    }

    public void viewZoneAttack(Message mss) {
        try {
            byte zoneId = mss.reader().readByte();
            if (zone.map.isVoDai()) {
                VoDaiSucManh dauTruong = MapManager.getInstance().VDSM;
                if (dauTruong != null) {
                    dauTruong.changeZone(this, zoneId);
                }
            }
            if (zone.map.isGDSM()) {
                GiaiDauSucManh giaiDau = MapManager.getInstance().GDSM;
                if (giaiDau != null) {
                    giaiDau.changeZone(this, zoneId);
                }
            }
        } catch (Exception e) {

        }
    }

    public boolean isSkillMount(int skillId) {
        if (mount[0] == null)
            return false;
        if (mount[0].skills.contains(skillId))
            return true;
        return false;
    }

    public void mountAttack(int indexSkill, int idMob) {
        try {
            if (indexSkill < 0 || indexSkill >= skills.size()) {
                Log.debug("Skill not found");
                return;
            }
            if (mount[0] == null) {
                return;
            }
            Mob mob = zone.findMoLivebByID(idMob);
            if (mob == null) {
                return;
            }
            Item item = mount[0];
            Mount mount1 = MountManager.getInstance().getMount(mount[0].id);
            Skill skill = skills.get(indexSkill);
            if (skill == null || !isSkillMount(skill.isSkillTemplate)) {
                return;
            }
            if (timeSkill.get(skill.id) != null) {
                if (timeSkill.get(skill.id) > System.currentTimeMillis()) {
                    return;
                }
            }
            timeSkill.put(skill.id, System.currentTimeMillis() + skill.coolDown);
            zone.getService().mountAttackMob((short) idMob, this.id, (short) mount1.attackStart, (short) mount1.attackEnd, (byte) mount1.tickAttack);
            int dame = damage + damegeMonster + (item.upgrade * 10 / 100);
            int dame2 = dame * 90 / 100;
            VDTTUtlis.setTimeout(() -> {
                mob.lock.lock();
                try {
                    if (!mob.isDead) {
                        int dameHit = VDTTUtlis.nextInt(dame2, dame);
                        int preHP = mob.hp;
                        mob.addHp(-dameHit);
                        if (mob.hp < 0) {
                            mob.hp = 0;
                            if (mob.id == 239 || mob.id == 213 || mob.id == 154 || mob.id == 221) {
                                mob.hp = mob.hpFull;
                            }

                        }
                        if (mob.id == 239) {
                            addHp(-(hp / 5));
                        }
                        int nextHP = mob.hp;
                        int hp = preHP - nextHP;
                        if (mob.hp <= 0) {
                            mob.die();
                        }
                        if (hp > 0 && mob.id != 154 && !mob.isDead) {
                            if (VDTTUtlis.nextInt(10) < 3) {
                                float percent = (float) hp / (mob.hpFull * (mob.levelBoss == 1 ? 40
                                        : mob.levelBoss == 2 ? 200 : mob.levelBoss == 10 ? 100 : 1)) * 100;
                                int kiAdd = (int) (mob.kiNow * percent / 100);
                                kiAdd = Math.min(kiAdd, mob.kiNow);
                                mob.kiNow = Math.max(0, mob.kiNow - kiAdd);
                                kiAdd *= 2;
                                kiAdd += kiAdd * (increaseKI / 10) / 100;
                                byte isAddKi = (byte) Math.abs(mob.getTemplate().timeThuHoach - level());
                                if (isAddKi > 8 && !zone.map.isWorld() && mob.id != 273 && !zone.isWorld && !bossEvent(mob)
                                        && mob.id != 296 && !zone.map.isSaoDen() && mob.id != 134) { // không được nhận ki
                                    service.notifyNoUpKi();
                                } else {
                                    addEXP(kiAdd);
                                    if (pet != null) {
                                        pet.addEXP(kiAdd);
                                    }
                                    if (this.getGroup() != null) {
                                        long expGroup = kiAdd / 5;
                                        List<Char> chars = this.getGroup().getCharsInZone(zone.map.id, zone.id);
                                        for (Char _char : chars) {
                                            if (_char != null && !_char.isCleaned && _char != this && !_char.isDead) {
                                                _char.addEXP(expGroup);
                                            }
                                        }
                                    }
                                }
                            }

                        }
                        if (mob.isDead) {
                            mob.dead(this, false);
                        } else {
                            if (mob.id != 0) {
                                mob.addCharId(this.id);
                            }
                        }
                        zone.sendAttackMob(mob.idEntity, mob.hp, false);
                    }
                } finally {
                    mob.lock.unlock();
                }
            }, 800);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewInfoMount(Message ms) {
        try {
            String name = ms.readUTF();
            if (this.name.equals(name)) {
                getService().sendInfoMount(this);
            } else {
                Char pl = ServerManager.findCharByName(name);
                if (pl != null && !pl.isCleaned) {
                    getService().sendInfoMount(pl);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean itemIsAlert(int id) {
        if (id == 944 || id == 284 || id == 896 || id == 897 || id == 898 || id == 309 || id == 848 || id == 435 || id == 1174 || id == 891 || id == 8 || id == 1208 || id == 1217 || id == 1050 || id == 1051 || id == 1220) {
            return true;
        }
        return false;
    }
}
