package com.vdtt.map;

import com.vdtt.clan.Member;
import com.vdtt.effect.Effect;
import com.vdtt.item.Item;
import com.vdtt.map.item.ItemMap;
import com.vdtt.map.zones.Zone;
import com.vdtt.mob.Mob;
import com.vdtt.mob.MobManager;
import com.vdtt.mob.MobNew;
import com.vdtt.model.Char;
import com.vdtt.model.Pet;
import com.vdtt.network.Message;
import com.vdtt.util.Log;
import com.vdtt.util.VDTTUtlis;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

public class MapService {
    private Zone zone;

    public MapService(Zone zone) {
        this.zone = zone;
    }

    public void sendMessage(Message ms) {
        List<Char> chars = zone.getChars();
        for (Char pl : chars) {
            try {
                if (pl != null && !pl.isBot && !pl.user.isCleaned && !pl.isCleaned)
                    pl.getService().sendMessage(ms);
            } catch (Exception e) {

            }
        }
    }

    public void playerRemove(int id) {
        try {
            Message m = new Message((byte) -101);
            m.writer().writeInt(id);
            sendMessage(m);
            m.cleanup();
        } catch (Exception e) {

        }
    }

    public void playerAdd(Char p) {
        try {
            Message m = new Message((byte) -102);
            DataOutputStream dos = m.writer();
            dos.writeInt(p.id);
            p.writeData(dos, m);
            sendMessage(m);
            m.cleanup();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateHPMob(int id, int hp, int hpFull, byte levelBoss) {
        try {
            Message m = new Message((byte) -55);
            m.writer().writeShort(id);
            m.writer().writeInt(hpFull);
            m.writer().writeInt(hp);
            m.writer().writeByte(levelBoss);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void addMob(Mob mob) {
        try {
            Message m = new Message((byte) 1);
            mob.write(m);
            sendMessage(m);
            m.cleanup();
        } catch (Exception e) {
            Log.error(e);
        }
    }

    public void recoveryMonster(Mob mob) {
        try {
            Message m = new Message((byte) 57);
            DataOutputStream dos = m.writer();
            dos.writeShort(mob.idEntity);
            dos.writeShort(mob.level);
            dos.writeInt(mob.hp);
            dos.writeInt(mob.hpFull);
            dos.writeByte(mob.levelBoss);
            dos.writeByte(mob.getStatus());
            dos.flush();
            sendMessage(m);
            m.cleanup();
        } catch (Exception e) {
            Log.error(e);
        }
    }

    public void updateMobDie(Mob mob) {
        try {
            Message m = new Message((byte) -37);
            m.writer().writeByte(mob.idEntity);
            m.writer().writeByte(mob.level);
            m.writer().writeInt(mob.hp);
            m.writer().writeInt(mob.hpFull);
            m.writer().writeByte(mob.levelBoss);
            m.writer().writeByte(mob.getStatus());
            sendMessage(m);
            m.cleanup();
        } catch (Exception e) {
            Log.error(e);
        }
    }

    public void mobMove(int id, short x, short y) {
        try {
            Message m = new Message((byte) -1);
            DataOutputStream dos = m.writer();
            dos.writeShort(id);
            dos.writeShort(x);
            dos.writeShort(y);
            dos.flush();
            sendMessage(m);
            m.cleanup();
        } catch (Exception e) {

        }
    }

    public void removeMonster(Mob mob) {
        try {
            Message m = new Message((byte) 0);
            m.writer().writeShort(mob.idEntity);
            sendMessage(m);
            m.cleanup();
        } catch (Exception e) {
            Log.error(e);
        }
    }

    public void npcAttackPlayer(Mob mob, Char p) {
        try {
            Message m = new Message((byte) 56);
            m.writer().writeShort(mob.idEntity);
            m.writer().writeInt(p.id);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void npcAttackPlayer(Mob mob, Char p, int mp, int hp, boolean isCrit) {
        try {
            Message m = new Message((byte) 55);
            m.writer().writeInt(p.id);
            m.writer().writeInt(mp);
            m.writer().writeInt(hp);
            m.writer().writeBoolean(isCrit);
            m.writer().writeShort(p.x);
            m.writer().writeShort(p.y);
            m.writeUTF(mob.getTemplate().name);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void updateHP(Char pl) {
        try {
            Message m = new Message((byte) 71);
            m.writer().writeInt(pl.id);
            m.writer().writeInt(pl.maxHP);
            m.writer().writeInt(pl.hp);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void updateMP(Char pl) {
        try {
            Message m = new Message((byte) 69);
            m.writer().writeInt(pl.id);
            m.writer().writeInt(pl.maxMP);
            m.writer().writeInt(pl.mp);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void updateStatus(Char player) {
        try {
            Message m = new Message((byte) 33);
            m.writer().writeInt(player.id);
            m.writer().writeByte(player.l);
            m.writer().writeInt(9999);//an?
            m.writer().writeShort(player.speed);
            m.writer().writeByte(0);
            sendMessage(m);
            m.cleanup();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void playerRemoveEffect(Char player, Effect eff) {
        try {
            Message m = new Message((byte) 51);
            m.writer().writeInt(player.id);
            m.writer().writeShort(eff.template.id);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }

    }

    public void test(Char pl) {
        try {
            Message m2 = new Message((byte) -15);
            m2.writer().writeInt(pl.id);
            m2.writer().writeByte(0);
            sendMessage(m2);
            Message m = new Message((byte) -123);
            m.writer().writeByte(9);
            m.writer().writeByte(1);
            m.writer().writeInt(pl.id);
            m.writer().writeByte(0);
            sendMessage(m);
        } catch (IOException e) {

        }
    }

    public void playerAddEffect(Char p, Effect eff) {
        try {
            Message m = new Message((byte) 50);
            m.writer().writeInt(p.id);
            eff.write(m);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void petAttackMob(int id, int idMob, int idSkill, int mp) {
        try {
            Message m = new Message((byte) -92);
            m.writer().writeInt(id);
            m.writer().writeShort(idSkill);
            m.writer().writeShort(idMob);
            m.writer().writeShort(mp);
            sendMessage(m);
            m.cleanup();
        } catch (Exception e) {

        }
    }

    public void petAttackChar(int id, int idChar, int idSkill, int mp) {
        try {
            Message m = new Message((byte) -91);
            m.writer().writeInt(id);
            m.writer().writeShort(idSkill);
            m.writer().writeInt(idChar);
            m.writer().writeShort(mp);
            sendMessage(m);
            m.cleanup();
        } catch (Exception e) {

        }
    }

    public void updateItemBody(Char p) {
        try {
            Message m = new Message((byte) -99);
            m.writer().writeInt(p.id);
            p.writeItemBody(m);
            sendMessage(m);
            m.cleanup();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pickItem(Char pl, int itemMapId, Item item) {
        try {
            try {
                Message m = new Message((byte) 59);
                m.writer().writeShort(itemMapId);
                m.writer().writeInt(pl.id);
                item.write(m);
                sendMessage(m);
                m.cleanup();
            } catch (Exception e) {

            }
        } catch (Exception e) {

        }
    }

    public void removeItem(short itemID) {
        try {
            Message ms = new Message((byte) 58);
            DataOutputStream ds = ms.writer();
            ds.writeShort(itemID);
            ds.flush();
            sendMessage(ms);
        } catch (Exception ex) {
            Log.error("removeitem err: " + ex.getMessage(), ex);
        }
    }

    public void addItemMap(ItemMap itemMap, Char pl) {
        try {
            Message m = new Message((byte) 111);
            DataOutputStream ds = m.writer();
            ds.writeInt(pl.id);
            ds.writeInt(itemMap.getOwnerID());
            ds.writeShort(itemMap.getId());
            ds.writeShort(itemMap.getX());
            ds.writeShort(itemMap.getY());
            itemMap.getItem().write(m);
            ds.flush();
            sendMessage(m);
            m.cleanup();
        } catch (IOException ex) {
            Log.error("add item err: " + ex.getMessage(), ex);
        }
    }
    public void addItemMap(ItemMap itemMap) {
        try {
            Message m = new Message((byte) -19);
            DataOutputStream ds = m.writer();
            ds.writeInt(itemMap.getOwnerID());
            ds.writeShort(itemMap.getId());
            ds.writeShort(itemMap.getX());
            ds.writeShort(itemMap.getY());
            itemMap.getItem().write(m);
            ds.flush();
            sendMessage(m);
            m.cleanup();
        } catch (IOException ex) {
            Log.error("add item err: " + ex.getMessage(), ex);
        }
    }

    public void updateMove(int id, short x, short y) {
        try {
            int[] byteArray = VDTTUtlis.getXYFake(x, y, zone.template.maxX);
            Message m = new Message((byte) 123);
            DataOutputStream dos = m.writer();
            dos.writeInt(id);
            dos.writeByte(byteArray[0]);
            dos.writeByte(byteArray[1]);
            dos.writeByte(byteArray[2]);
            dos.flush();
            sendMessage(m);
            m.cleanup();
        } catch (Exception e) {

        }
    }

    public void changePk(Char pl) {
        try {
            Message m = new Message((byte) -15);
            m.writer().writeInt(pl.id);
            m.writer().writeByte(pl.typePK);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void setSkillPaint_2(int idAttack, short idSkill, int idAnDame) {
        try {
            Message m = new Message((byte) 20);
            m.writer().writeInt(idAttack);
            m.writer().writeShort(idSkill);
            m.writer().writeInt(idAnDame);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void meLive(Char player) {
        try {
            Message m = new Message((byte) 49);
            m.writer().writeInt(player.id);
            m.writer().writeInt(player.hp);
            m.writer().writeInt(player.mp);
            m.writer().writeInt(player.maxHP);
            m.writer().writeInt(player.maxMP);
            sendMessage(m);
            m.cleanup();
        } catch (Exception e) {

        }
    }

    public void attackCharacter(int id, int mp, int hp, boolean isCrit, String nameAttack, short x, short y) {
        try {
            Message m = new Message((byte) 55);
            m.writer().writeInt(id);
            m.writer().writeInt(mp);
            m.writer().writeInt(hp);
            m.writer().writeBoolean(isCrit);
            m.writer().writeShort(x);
            m.writer().writeShort(y);
            m.writeUTF(nameAttack);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void sendInfoVuTru(Char pl) {
        try {
            Message m = new Message((byte) -88);
            if (pl.clan != null) {
                m.writer().writeInt(pl.id);
                m.writeUTF(pl.clan.getName());
                m.writeUTF(pl.clan.getMainName());
                Member member = pl.clan.getMemberByName(pl.name);
                if (member != null) {
                    m.writer().writeByte(member.getType());
                } else {
                    m.writer().writeByte(0);
                }
                m.writer().writeShort(1);
            } else {
                m.writer().writeInt(pl.id);
                m.writeUTF("");
            }
            sendMessage(m);
            m.cleanup();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updatePet(int id, byte type, int hp, int hpMax, int mp, int mpMax) {
        try {
            Message m = new Message((byte) -123);
            m.writer().writeByte(7);
            m.writer().writeInt(id);
            m.writer().writeByte(type);
            m.writer().writeInt(hpMax);
            m.writer().writeInt(hp);
            m.writer().writeInt(mpMax);
            m.writer().writeInt(mp);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void updatePostion(int id, short x, short y) {
        try {
            Message m = new Message((byte) 102);
            m.writer().writeInt(id);
            m.writer().writeShort(x);
            m.writer().writeShort(y);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void addEffectMob(Mob mob, Effect eff) {
        try {
            Message m = new Message((byte) 15);
            m.writer().writeShort(mob.idEntity);
            eff.write(m);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void removeEffectMob(int idEntity, short id) {
        try {
            Message m = new Message((byte) 16);
            m.writer().writeShort(idEntity);
            m.writer().writeShort(id);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void testAccept(int id, int id1) {
        try {
            Message m = new Message((byte) 31);
            m.writer().writeInt(id);
            m.writer().writeByte(1);
            m.writer().writeInt(id1);
            m.writer().writeByte(1);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void testEnd(int id, int id1, int num) {
        try {
            Message m = new Message((byte) 29);
            m.writer().writeByte(num);
            m.writer().writeInt(id);
            m.writer().writeInt(id1);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void addCuuSat(int id, int id1) {
        try {
            Message m = new Message((byte) 19);
            m.writer().writeInt(id);
            m.writer().writeInt(id1);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void clearCuuSat(int id, boolean var) {
        try {
            Message m = new Message((byte) 18);
            m.writer().writeInt(id);
            m.writer().writeBoolean(var);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void mobChat(int id, String s) {
        try {
            Message m = new Message((byte) -12);
            m.writer().writeShort(id);
            m.writeUTF(s);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void chat(String name, String str) {
        try {
            Message m = new Message((byte) 21);
            m.writeUTF(name);
            m.writeUTF(str);
            sendMessage(m);
            m.cleanup();
        } catch (IOException e) {

        }
    }

    public void sendTimeInMap(int time, byte round, long timeStart) {
        try {
            Message m = new Message((byte) -123);
            m.writer().writeByte(-80);
            m.writer().writeLong(timeStart);
            m.writer().writeInt(time);
            m.writer().writeBoolean(false);
            m.writer().writeByte(round);
            sendMessage(m);
        } catch (IOException e) {

        }
    }

    public void khanDai(int id) {
        try {
            Message m = new Message((byte) -123);
            m.writer().writeByte(-14);
            m.writer().writeInt(id);
            sendMessage(m);
        } catch (IOException e) {

        }
    }
    public void mountAttackMob(short mobId,int playerId,short frameStart,short frameEnd,byte tick){
        try {
            Message m = new Message((byte) -123);
            m.writer().writeByte(-120);
            m.writer().writeByte(1);//0 char 1 mob
            m.writer().writeShort(mobId);
            m.writer().writeShort(playerId);
            m.writer().writeShort(frameStart);
            m.writer().writeShort(frameEnd);
            m.writer().writeByte(tick);
            sendMessage(m);
        } catch (IOException e) {

        }
    }
    public void sendPet(Char pl){
        try {
            Message m = new Message((byte) -123);
            m.writer().writeByte(-117);
            m.writer().writeShort(pl.id);
            if(pl.mount[0]!=null) {
                MobNew mob = MobManager.getInstance().getMobNew(pl.mount[0].id);
                if(mob!= null) {
                    m.writer().writeBoolean(true);
                    m.writer().writeInt(mob.dxMove);
                    m.writer().writeInt(mob.dyMove);
                    m.writer().writeInt(mob.dxStand);
                    m.writer().writeInt(mob.dyStand);
                    m.writer().writeInt(mob.frameStartMove);
                    m.writer().writeInt(mob.frameEndMove);
                    m.writer().writeInt(mob.frameStartStand);
                    m.writer().writeInt(mob.frameEndStand);
                    m.writer().writeBoolean(mob.isBong);
                }else {
                    m.writer().writeBoolean(false);
                }
            }else {
                m.writer().writeBoolean(false);
            }
            sendMessage(m);
        } catch (IOException e) {

        }
    }
}
