package com.vdtt.model;

import com.vdtt.ability.AbilityFromEquip;
import com.vdtt.data.DataCenter;
import com.vdtt.effect.Effect;
import com.vdtt.effect.EffectManager;
import com.vdtt.item.Item;
import com.vdtt.item.ItemManager;
import com.vdtt.item.ItemOption;
import com.vdtt.mob.Mob;
import com.vdtt.network.Message;
import com.vdtt.network.Service;
import com.vdtt.server.Config;
import com.vdtt.server.ServerManager;
import com.vdtt.skill.Skill;
import com.vdtt.skill.SkillFactory;
import com.vdtt.util.Log;
import com.vdtt.util.VDTTUtlis;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.IntStream;

public class Pet extends Char {
    public Skill[] skillPet = new Skill[14];
    public int level;
    public byte typePet;
    public Char player;

    public Pet(int id, Item item, Item[] body, Item[] body2, Service service, EffectManager effectManager) {
        this.id = id;
        this.body = body;
        this.body2 = body2;
        skills = new Vector<>();
        sys = 2;
        loadSkill(item);
        setEm(effectManager);
        setAbility();
        setService(service);
    }

    @Override
    public void setAbility() {
        try {
            int length = ItemManager.getInstance().getOptionSize();
            options = new int[length];
            haveOptions = new boolean[length];
            for (int i = 3; i <= 11; i += 2) {
                Item equip = body[i];
                if (equip != null) {
                    if (!equip.isExpired() && equip.strOption != null && !equip.strOption.isEmpty()) {
                        for (ItemOption o : equip.getItemOption()) {
                            int optionID = o.getItemOptionTemplate().id;
                            options[optionID] += o.getParam();
                            haveOptions[optionID] = true;
                        }
                    }

                }
            }
            if (body[15] != null) {
                Item equip = body[15];
                if (!equip.isExpired() && equip.strOption != null && !equip.strOption.isEmpty()) {
                    for (ItemOption o : equip.getItemOption()) {
                        int optionID = o.getItemOptionTemplate().id;
                        options[optionID] += o.getParam() * options[433] / 100;
                    }
                }
            }
            for (int i = 2; i <= 8; i += 2) {
                Item equip = body[i];
                if (equip != null) {
                    if (!equip.isExpired() && equip.strOption != null && !equip.strOption.isEmpty()) {
                        for (ItemOption o : equip.getItemOption()) {
                            int optionID = o.getItemOptionTemplate().id;
                            if ((o.getItemOptionTemplate().type >= 3 && o.getItemOptionTemplate().type <= 7) ||
                                    (o.getItemOptionTemplate().type == 19 || o.getItemOptionTemplate().type == 11 || o.getItemOptionTemplate().type == 12)) {
                                if ((o.getItemOptionTemplate().type == 19 && equip.upgrade >= 2)
                                        || (o.getItemOptionTemplate().type == 3 && equip.upgrade >= 4)
                                        || (o.getItemOptionTemplate().type == 11 && equip.upgrade >= 6)
                                        || (o.getItemOptionTemplate().type == 4 && equip.upgrade >= 8)
                                        || (o.getItemOptionTemplate().type == 12 && equip.upgrade >= 10)
                                        || (o.getItemOptionTemplate().type == 5 && equip.upgrade >= 12)
                                        || (o.getItemOptionTemplate().type == 6 && equip.upgrade >= 14)
                                        || (o.getItemOptionTemplate().type == 7 && equip.upgrade >= 16)) {
                                    switch (i) {
                                        case 2:
                                            options[optionID] += o.getParam() * options[408] / 100;
                                            break;
                                        case 4:
                                            options[optionID] += o.getParam() * options[409] / 100;
                                            break;
                                        case 6:
                                            options[optionID] += o.getParam() * options[410] / 100;
                                            break;
                                        case 8:
                                            options[optionID] += o.getParam() * options[411] / 100;
                                            break;
                                    }
                                    haveOptions[optionID] = true;
                                }
                            } else {
                                switch (i) {
                                    case 2:
                                        options[optionID] += o.getParam() * options[408] / 100;
                                        break;
                                    case 4:
                                        options[optionID] += o.getParam() * options[409] / 100;
                                        break;
                                    case 6:
                                        options[optionID] += o.getParam() * options[410] / 100;
                                        break;
                                    case 8:
                                        options[optionID] += o.getParam() * options[411] / 100;
                                        break;
                                }
                                haveOptions[optionID] = true;
                            }
                        }
                    }
                }
            }
            for (Skill skill : skillPet) {
                if (skill != null && (skill.getSkillTemplate().type == 5 || skill.getSkillTemplate().id == 30) && skill.level > 0) {
                    if (skill.m != null && !skill.m.isEmpty()) {
                        for (ItemOption o : skill.getItemOption()) {
                            int optionID = o.getItemOptionTemplate().id;
                            options[optionID] += o.getParam();
                        }
                    }
                }
                if (skill != null && getEm().findByTypePet((byte) 77) != null) {
                    switch (skill.isSkillTemplate) {
                        case 3:
                        case 8:
                        case 15:
                        case 21:
                        case 24:
                        case 96:
                            if (skill.m != null && !skill.m.isEmpty()) {
                                for (ItemOption o : skill.getItemOption()) {
                                    int optionID = o.getItemOptionTemplate().id;
                                    options[optionID] += o.getParam();
                                }
                            }
                            break;
                    }
                }
                if (skill != null) {
                    if (getEm().findByIDPet(85) != null && skill.isSkillTemplate == 2) {
                        if (skill.m != null && !skill.m.isEmpty()) {
                            for (ItemOption o : skill.getItemOption()) {
                                int optionID = o.getItemOptionTemplate().id;
                                options[optionID] += o.getParam();
                            }
                        }
                    }
                    if (getEm().findByIDPet(111) != null && skill.isSkillTemplate == 10) {
                        if (skill.m != null && !skill.m.isEmpty()) {
                            for (ItemOption o : skill.getItemOption()) {
                                int optionID = o.getItemOptionTemplate().id;
                                options[optionID] += o.getParam();
                            }
                        }
                    }
                    if (getEm().findByIDPet(113) != null && skill.isSkillTemplate == 17) {
                        if (skill.m != null && !skill.m.isEmpty()) {
                            for (ItemOption o : skill.getItemOption()) {
                                int optionID = o.getItemOptionTemplate().id;
                                options[optionID] += o.getParam();
                            }
                        }
                    }
                    if (getEm().findByIDPet(85) != null && skill.isSkillTemplate == 2) {
                        if (skill.m != null && !skill.m.isEmpty()) {
                            for (ItemOption o : skill.getItemOption()) {
                                int optionID = o.getItemOptionTemplate().id;
                                options[optionID] += o.getParam();
                            }
                        }
                    }
                }
            }
            if (selectSkill != null && selectSkill.isSkillTemplate != 30) {
                Skill skill = selectSkill;
                if (skill.getItemOption() != null && skill.getItemOption().length > 0) {
                    for (ItemOption o : skill.getItemOption()) {
                        int optionID = o.getItemOptionTemplate().id;
                        options[optionID] += o.getParam();
                    }
                }
            }
            int dameDefaut = options[314] + options[380];
            int hpDefaut = options[319] + options[376];
            int mpDefaut = options[318] + options[381];
            short exactlyDefaut = (short) ((short) options[316] + options[377]);
            short missDefaut = (short) ((short) options[315] + options[378]);
            short criticalDefaut = (short) ((short) options[317] + options[379]);
            hpDefaut += hpDefaut * (options[32] + options[354] + options[79] + options[119]) / 100;
            maxHP = options[335] + options[360] + options[29] + options[202] + options[175] + options[192] + options[0] + options[106] + options[18] + (hpDefaut * 32);
            mpDefaut += mpDefaut * (options[33] + options[355] + options[80] + options[120]) / 100;
            maxMP = options[336] + options[361] + options[419] + options[1] + options[107] + options[19] + options[30] + (mpDefaut * 30);
            dameDefaut += dameDefaut * (options[414] + options[425] + options[34] + options[358] + options[47] + options[122] + options[254]) / 100;
            damage = (int) (options[2] + options[31] + options[78] + options[146] + options[199] + options[208] + options[276] + options[277] + options[341] + options[366] + (dameDefaut * 2.6));
            exactly = (short) (options[20] + options[65] + options[167] + options[205] + options[287] + options[339] + options[352] + options[364] + (exactlyDefaut * 3));
            miss = (short) (options[64] + options[151] + options[161] + options[204] + options[278] + options[337] + options[351] + options[362] + options[4] + (missDefaut * 3));
            crit = (short) (options[5] + options[15] + options[28] + options[63] + options[144] + options[166] + options[203] + options[338] + options[363] + (criticalDefaut * 2.5));
            switch (sys) {
                case 1://goku
                    damage += 33;
                    maxHP += 520;
                    maxMP += 300;
                    exactly += 32;
                    miss += 30;
                    crit += 24;
                    break;
                case 2://cadic
                    damage += 36;
                    maxHP += 480;
                    maxMP += 250;
                    exactly += 24;
                    miss += 24;
                    crit += 30;
                    break;
                case 3://gohan
                    damage += 33;
                    maxHP += 560;
                    maxMP += 350;
                    exactly += 36;
                    miss += 27;
                    crit += 21;
                    break;
                case 4://picolo
                    damage += 28;
                    maxHP += 600;
                    maxMP += 400;
                    exactly += 28;
                    miss += 21;
                    crit += 27;
                    break;
                case 5://Frieza
                    damage += 33;
                    maxHP += 520;
                    maxMP += 300;
                    exactly += 32;
                    miss += 30;
                    crit += 24;
                    break;
            }
            armor = (short) (options[12] + options[40] + options[81] + options[121] + options[152] + options[201] + options[258] + options[273] + options[340] + options[365]);
            reduceDame = (short) (IntStream.of(13, 173, 206, 274, 279, 322, 359).map(i -> options[i]).sum());
            reduceCrit = (short) (IntStream.of(345, 404).map(i -> options[i]).sum());
            reduceSuyGiam = (short) (IntStream.of(288).map(i -> options[i]).sum());
            reduceChiuDon = (short) (IntStream.of(291).map(i -> options[i]).sum());
            reduceStun = (short) (IntStream.of(292).map(i -> options[i]).sum());
            suyGiam = (short) (IntStream.of(48, 68, 123, 168, 259).map(i -> options[i]).sum());
            chiuDon = (short) (IntStream.of(51, 71, 126, 171, 262).map(i -> options[i]).sum());
            stun = (short) (IntStream.of(52, 72, 127, 172, 263).map(i -> options[i]).sum());
            randomDame = (short) (IntStream.of(297).map(i -> options[i]).sum());
            speed = (short) (600 + (IntStream.of(17, 91, 118, 150, 346).map(i -> options[i]).sum()));
            counterDame = (short) (IntStream.of(16).map(i -> options[i]).sum());
            counterDame += counterDame * (options[162] + options[424] + options[67]) / 100;
            skipMiss = (short) (IntStream.of(4, 147, 160, 356, 422).map(i -> options[i]).sum());
            armorPenetration = (short) (IntStream.of(145, 149, 197, 275, 357, 421).map(i -> options[i]).sum());
            criticalHitPower = (short) (IntStream.of(41, 95, 398).map(i -> options[i]).sum());
            reduceCritHitPower = (short) (IntStream.of(42, 43, 44, 45, 46, 174, 353).map(i -> options[i]).sum());
            increaseXu = (short) (IntStream.of(344, 369, 375).map(i -> options[i]).sum());
            increaseKI = (short) (IntStream.of(66, 267, 343, 368).map(i -> options[i]).sum());
            increaseExtra = (short) (IntStream.of(45).map(i -> options[i]).sum());
            damegeMonster = (short) (IntStream.of(207, 342, 367).map(i -> options[i]).sum());
            if (getEm().findByIDPet(206) != null) {
                int param = getEm().findByIDPet(206).getParam();
                damage += param;
                crit += param;
            }
            if (crit > 5000) {
                damage += crit - 5000;
                crit = 5000;
            }
            if (hp > maxHP) {
                hp = maxHP;
            }
            if (mp > maxMP) {
                mp = maxMP;
            }
            if (getEm().findByIDPet(207) != null) {
                damage += getEm().findByIDPet(207).getParam();
            }
        } catch (Exception e) {
            Log.error(e);
        }
    }

    public Skill findSkill(int id) {
        for (Skill skill : skillPet) {
            if (skill != null && skill.isSkillTemplate == id) {
                return skill;
            }
        }
        return null;
    }

    public void loadSkill(Item item) {
        try {
            ItemOption[] var6 = item.L();
            int var2 = 0;

            for (int var3 = 0; var3 < var6.length; ++var3) {
                if (var6[var3].option[0] == 285) {
                    exp = var6[var3].option[1];
                    level = var6[var3].option[2];
                } else if (var6[var3].option[0] == 407) {
                    KI = var6[var3].option[1];
                }
                if (var6[var3].option[0] == 327) {
                    int var4;
                    if ((var4 = var6[var3].option[1]) >= 0) {
                        int var5;
                        if ((var5 = var6[var3].f()) < 0) {
                            var5 = 0;
                        }
                        skillPet[var2] = SkillFactory.getInstance().getSkill(var4, var5);
                    } else {
                        skillPet[var2] = null;
                    }
                    ++var2;
                    if (var2 >= this.skillPet.length) {
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Skill getSkillNoCoolDown() {
        ArrayList<Skill> skills1 = new ArrayList<>();
        for (Skill skill : skillPet) {
            if (skill != null && skill.level > 0 && skill.getSkillTemplate().type != 5 && !skill.isCoolDown()) {
                skills1.add(skill);
            }
        }
        if (skills1.size() > 0)
            return skills1.get(VDTTUtlis.nextInt(0, skills1.size() - 1));
        else
            return null;
    }

    @Override
    public void addHp(int number) {
        this.hp += number;
        if (this.hp > this.maxHP) {
            this.hp = this.maxHP;
        }
    }

    @Override
    public void addEXP(long ki) {
        try {
            ki /= 10;
            exp += ki;
            if (exp >= (DataCenter.gI().getLevel(s()) / 10)) {
                ki = DataCenter.gI().getLevel(s()) / 10 - exp;
                exp = DataCenter.gI().getLevel(s()) / 10;
            }
            if (ki < 0) {
                ki = 0;
            }
            KI += ki;
            if (body[0] != null) {
                ItemOption[] var2 = body[0].L();
                ItemOption var3 = null;
                ItemOption var4 = null;

                for (int var5 = 0; var5 < var2.length; ++var5) {
                    if (var2[var5].option[0] == 285) {
                        var3 = var2[var5];
                    } else if (var2[var5].option[0] == 407) {
                        var4 = var2[var5];
                        break;
                    }
                }

                var4.c((int) KI);
                var3.c((int) exp);
                body[0].strOption = Item.creatOption(var2);
            }
            getService().addEXPPet((int) exp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addMp(int number) {
        this.mp += number;
        if (this.mp > this.maxMP) {
            this.mp = this.maxMP;
        }
    }

    public void attackMonster(Mob mob) {
        if (this.isDead || typePet != 1) {
            return;
        }
        Skill skill = getSkillNoCoolDown();
        if (skill == null) {
            return;
        }
        if (mp < skill.mpUsing) {
            return;
        }
        skill.timeCoolDown = System.currentTimeMillis();
        addMp(-skill.mpUsing);
        if (isSkillNotFocus(skill)) {
            setAbility();
            return;
        }
        selectSkill = skill;
        setAbility();
        mob.lock.lock();
        try {
            if (!mob.isDead) {
                if (mob.hp > 0) {
                    int countDame = damage + damegeMonster;
                    int dame2 = countDame * 90 / 100;
                    int dameHit = VDTTUtlis.nextInt(dame2, countDame);
                    int preHP = mob.hp;
                    if (taskId == 3 && taskMain != null && taskMain.index == 1 && mob.id == 239) {
                        updateTaskCount(1);
                    }
                    boolean isCrit = false;
                    if (VDTTUtlis.randomCriticalHit(crit)) {
                        isCrit = true;
                        dameHit += dameHit * (criticalHitPower) / 100;
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
                    if (skill.isSkillTemplate == 22) {
                        Effect eff = new Effect(36, options[323] * 6, 0);
                        mob.effects.put(eff.template.id, eff);
                        zone.getService().addEffectMob(mob, eff);
                    }
                    if (skill.isSkillTemplate == 101) {
                        Effect eff1 = new Effect(207, 15000, options[494], true);
                        Effect eff2 = new Effect(208, 15000, options[494]);
                        getEm().setEffect(eff1);
                        mob.effects.put((short) 208, eff2);
                    }
                    if (skill.isSkillTemplate == 5) {
                        dameHit *= skill.getItemOption()[0].getParam();
                    }
                    Effect effect = getEm().findByID(142);
                    if (effect != null) {
                        dameHit += dameHit * 80 / 100;
                    }
                    if (skill.isSkillTemplate == 6 && isDCTT) {
                        isDCTT = false;
                        dameHit *= 2;
                    }
                    if (skill.isSkillTemplate == 14) {
                        if (skill.maxTarget > 1) {
                            try {
                                int target = skill.maxTarget;
                                int i = 1;
                                List<Mob> mobs = zone.getLivingMonsters();
                                for (Mob mob1 : mobs) {
                                    if (mob1.idEntity == mob.idEntity) {
                                        continue;
                                    }
                                    if (skill.isSkillTemplate == 14 && i < target) {
                                        mob1.lock.lock();
                                        try {
                                            i++;
                                            if (mob1 != null && !mob1.isDead) {
                                                mob1.addHp(-dameHit);
                                                if (mob1.hp <= 0) {
                                                    mob1.die();
                                                }
                                                if (mob1.isDead) {
                                                    mob1.dead(player, false);
                                                } else {
                                                    if (mob1.id != 0) {
                                                        mob1.addCharId(this.id);
                                                    }
                                                }
                                                zone.sendAttackMob(mob1.idEntity, mob1.hp, isCrit);
                                            }
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        } finally {
                                            mob1.lock.unlock();
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                Log.error("skill lan: " + e.getMessage(), e);
                            }
                        }
                    }
//                    int isAttackBoss = Math.abs(mob.getTemplate().timeThuHoach - level());
//                    if (mob.levelBoss == 7 && isAttackBoss > 15) {
//                        dameHit = 1;
//                    }
                    if (mob.id == 273) {
                        dameHit = 1;
                    }
                    if (bossEvent(mob)) {
                        dameHit = 1;
                    }
                    if (mob.id == 134 && dameHit > 10000) {
                        dameHit = 10000;
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
                            float percent = (float) hp / (mob.hpFull * (mob.levelBoss == 1 ? 40 : mob.levelBoss == 2 ? 200 : mob.levelBoss == 10 ? 100 : 1)) * 100;
                            int kiAdd = (int) (mob.kiNow * percent / 100);
                            kiAdd = Math.min(kiAdd, mob.kiNow);
                            mob.kiNow = Math.max(0, mob.kiNow - kiAdd);
                            kiAdd *= 2;
                            kiAdd += kiAdd * (increaseKI / 10) / 100;
                            addEXP(kiAdd);
                        }

                    }
                    if (mob.isDead) {
                        mob.dead(player, false);
                    } else {
                        if (mob.id != 0) {
                            mob.addCharId(this.id);
                        }
                    }
                    zone.sendAttackMob(mob.idEntity, mob.hp, isCrit);
                    zone.getService().petAttackMob(id, mob.idEntity, skill.id, mp);
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

    private boolean isSkillNotFocus(Skill skill) {
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
                    Effect effect = new Effect(86 + skill.level, 90000 + (30000 * skill.level), param, true);
                    em.setEffect(effect);
                }
                return true;
            case 2:
                itemOptions = skill.getItemOption();
                if (itemOptions != null && itemOptions.length > 2) {
                    int time = itemOptions[2].getParam();
                    int param = itemOptions[0].getParam();
                    Effect effect = new Effect(85, time, param, true);
                    em.setEffect(effect);
                }
                return true;
            case 17:
                itemOptions = skill.getItemOption();
                if (itemOptions != null && itemOptions.length > 0) {
                    int param = itemOptions[0].getParam();
                    Effect effect = new Effect(113, 15000, param, true);
                    em.setEffect(effect);
                }
                return true;
            case 10:
                itemOptions = skill.getItemOption();
                if (itemOptions != null && itemOptions.length > 2) {
                    int time = itemOptions[2].getParam();
                    int param = itemOptions[0].getParam();
                    Effect effect = new Effect(111, time, param, true);
                    em.setEffect(effect);
                    addHp(-(itemOptions[1].getParam() * maxHP / 100));
                    if (hp <= 0) {
                        startDie();
                        zone.getService().updatePet(id, (byte) 1, hp, maxHP, mp, maxMP);
                        typePet = 0;
                        zone.getService().updatePet(id, typePet, hp, maxHP, mp, maxMP);
                    }
                }
                return true;
        }
        return false;
    }

    public void updateSkillPet() {
        try {
            if (body[0] == null) {
                return;
            }
            ItemOption[] var6 = body[0].L();
            int var2 = 0;

            for (int var3 = 0; var3 < var6.length; ++var3) {
                if (var6[var3].option[0] == 407) {
                    var6[var3].option[1] = (int) KI;
                }
                if (var6[var3].option[0] == 327) {
                    if (skillPet[var2] == null) {
                        var6[var3].option[1] = -1;
                        var6[var3].option[2] = -1;
                    } else {
                        var6[var3].option[1] = skillPet[var2].getSkillTemplate().id;
                        var6[var3].option[2] = skillPet[var2].level;
                    }
                    ++var2;
                    if (var2 >= this.skillPet.length) {
                        break;
                    }
                }
            }
            body[0].strOption = Item.creatOption(var6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void attackChar(int id) {
        try {
            Char pl = ServerManager.findCharById(id);
            if (pl != null) {
                if (this.isDead || typePet != 1) {
                    return;
                }
                Skill skill = getSkillNoCoolDown();
                if (skill == null) {
                    return;
                }
                if (mp < skill.mpUsing) {
                    return;
                }
                skill.timeCoolDown = System.currentTimeMillis();
                addMp(-skill.mpUsing);
                if (isSkillNotFocus(skill)) {
                    setAbility();
                    return;
                }
                zone.getService().petAttackChar(this.id, pl.id, skill.id, mp);
                pl.lock.lock();
                try {
                    if (!pl.isDead && !pl.isCleaned) {
                        selectSkill = skill;
                        setAbility();
                        int damage2 = damage * 90 / 100;
                        if (skill.isSkillTemplate == 26) {
                            Effect eff = new Effect(55, options[417], options[254]);
                            pl.getEm().setEffect(eff);
                        }
                        if (skill.isSkillTemplate == 29) {
                            Effect eff = new Effect(161, options[447], 0);
                            pl.getEm().setEffect(eff);

                        }
                        if (skill.isSkillTemplate == 20) {
                            Effect eff = new Effect(160, options[446], 0);
                            pl.getEm().setEffect(eff);
                        }
                        if (skill.isSkillTemplate == 101) {
                            Effect eff1 = new Effect(207, 15000, options[494], true);
                            Effect eff2 = new Effect(208, 15000, options[494]);
                            getEm().setEffect(eff1);
                            pl.getEm().setEffect(eff2);
                        }

                        int dameHit = VDTTUtlis.nextInt(damage2, this.damage);
                        dameHit -= pl.reduceDame;
                        short _crit = (short) (crit - pl.reduceCrit);
                        float percentCrit = _crit / 100;
                        boolean isCrit = false;
                        if (VDTTUtlis.nextInt(0, 80) < percentCrit) {
                            short _critHit = (short) ((criticalHitPower - pl.reduceCritHitPower) / 100);
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
                        int randMiss = (pl.miss - exactly) / 70;
                        boolean isMiss = VDTTUtlis.nextInt(0, 80) < randMiss;
                        if (isMiss) {
                            dameHit = 0;
                        }
                        boolean isXuyenGiap = VDTTUtlis.nextInt(0, 100) < this.armorPenetration;
                        if (!isXuyenGiap) {
                            float percentArmor = pl.armor / 80;
                            dameHit -= dameHit * percentArmor / 100;
                            if (dameHit < 0) {
                                dameHit = 0;
                            }
                        }
                        if (skill.isSkillTemplate == 22) {
                            Effect eff = new Effect(36, options[323] * 6, 0);
                            pl.getEm().setEffect(eff);
                            dameHit = options[373] * 6;
                        }
                        if (pl.getEm().findByID(109) != null) {
                            Effect eff = pl.getEm().findByID(109);
                            pl.getEm().removeEffect(eff);
                            pl.zone.getService().playerRemoveEffect(pl, eff);
                        }
                        if (pl.getEm().findByID(108) != null) {
                            dameHit = 0;
                        }
                        if (pl.counterDame > 0) {
                            if (VDTTUtlis.nextInt(0, 100) < pl.counterDame) {
                                addHp(-dameHit);
                                dameHit = 0;
                            }
                        }
                        if (skill.isSkillTemplate == 56) {
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
                        if (skill.isSkillTemplate == 37) {
                            Effect eff = new Effect(109, 12000, 0);
                            pl.getEm().setEffect(eff);
                            dameHit = 0;
                        }
                        if (skill.isSkillTemplate == 68) {
                            dameHit = VDTTUtlis.nextInt(10, 90) * pl.hp / 100;
                        }
                        if (pl.getEm().findByID(108) != null) {
                            dameHit = 0;
                        }
                        if (skill.isSkillTemplate == 4) {
                            dameHit = options[371] * pl.maxHP / 100;
                        }
                        if (skill.isSkillTemplate == 83) {
                            dameHit = pl.hp * 8 / 100;
                            addHp(dameHit);
                        }
                        pl.hp -= dameHit;
                        zone.getService().attackCharacter(pl.id, pl.mp, pl.hp, isCrit, "Đệ tử", pl.x, pl.y);
                        if (dameHit > 0) {
                            if (pl.hp <= 0) {
                                pl.startDie();
                            }
                        }
                    }
                } finally {
                    pl.lock.unlock();
                    selectSkill = null;
                    setAbility();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resetKI() {
        Skill[] skills = new Skill[14];
        for (int i = 0; i < 14; i++) {
            Skill skill = skillPet[i];
            if (skill != null) {
                if (skill.isSkillTemplate == 30) {
                    skills[i] = SkillFactory.getInstance().getSkill(30, 1);
                } else
                    skills[i] = SkillFactory.getInstance().getSkill(skill.isSkillTemplate, 0);
            }
        }
        skillPet = skills;
        KI = exp;
        if (body[0] != null) {
            ItemOption[] var2 = body[0].L();
            ItemOption var3 = null;
            ItemOption var4 = null;

            for (int var5 = 0; var5 < var2.length; ++var5) {
                if (var2[var5].option[0] == 285) {
                    var3 = var2[var5];
                } else if (var2[var5].option[0] == 407) {
                    var4 = var2[var5];
                    break;
                }
            }

            var4.c((int) KI);
            var3.c((int) exp);
            body[0].strOption = Item.creatOption(var2);
        }
        updateSkillPet();
    }

    public void resetSkill() {
        if (body[0] != null) {
            ItemOption[] var2 = body[0].L();
            Vector newOptions = new Vector();
            for (int var5 = 0; var5 < var2.length; ++var5) {
                if (var2[var5].option[0] == 327) {
                    newOptions.add(new ItemOption(327, VDTTUtlis.nextInt(50, 52), 1));
                    newOptions.add(new ItemOption(327, 53, 1));
                    newOptions.add(new ItemOption(327, 54, 1));
                    newOptions.add(new ItemOption(327, 30, 1));
                    newOptions.add(new ItemOption(327, -1, -1));
                    newOptions.add(new ItemOption(327, -1, -1));
                    newOptions.add(new ItemOption(327, -1, -1));
                    newOptions.add(new ItemOption(327, -1, -1));
                    newOptions.add(new ItemOption(327, -1, -1));
                    newOptions.add(new ItemOption(327, -1, -1));
                    newOptions.add(new ItemOption(327, -1, -1));
                    newOptions.add(new ItemOption(327, -1, -1));
                    newOptions.add(new ItemOption(327, -1, -1));
                    newOptions.add(new ItemOption(327, -1, -1));
                    break;
                } else {
                    newOptions.add(var2[var5]);
                }
            }
            body[0].strOption = Item.creatOption(newOptions);
            loadSkill(body[0]);
        }
    }
}
