package com.vdtt.map;

import com.vdtt.effect.Effect;
import com.vdtt.item.Item;
import com.vdtt.mail.Mail;
import com.vdtt.map.zones.Zone;
import com.vdtt.model.Char;
import com.vdtt.model.DeathMatch;
import com.vdtt.model.MatchUp;
import com.vdtt.network.Message;
import com.vdtt.party.Group;
import com.vdtt.server.GlobalService;
import com.vdtt.util.Log;
import com.vdtt.util.VDTTUtlis;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class GiaiDauSucManh {
    public int round = 0;
    public ArrayList<Group> members;
    public ArrayList<MatchUp> matchUps;
    public long timeStart;
    public int time;
    public List<Zone> zones;
    public ReadWriteLock lock = new ReentrantReadWriteLock();

    public GiaiDauSucManh() {
        members = new ArrayList<>();
        matchUps = new ArrayList<>();
        timeStart = System.currentTimeMillis();
        zones = new ArrayList<>();
        Map map = MapManager.getInstance().find(48);
        for (int i = 0; i < 9; i++) {
            Zone z = new Zone((byte) i, map.mapTemplate, map);
            zones.add(z);
        }
        time = (int) TimeUnit.MINUTES.toMillis(10);
        round = 1;
    }

    public void join(Char p, int zoneId) {
        if (zoneId < 0 || zoneId >= zones.size()) {
            zoneId = VDTTUtlis.nextInt(0, 7);
        }
        if (round > 1) {
            p.setTypePk((byte) 0);
            zones.get(zoneId).joinNotChangeMap(p, 47);
        } else {
            if(p.getGroup() == null){
                p.getService().serverDialog("Cần tổ đội để tham gia giải đấu sức mạnh");
                return;
            }
            zones.get(zoneId).join(p, 0);
            if (!members.contains(p.getGroup())) {
                addMember(p.getGroup());
            }
        }
        p.getService().sendTimeInMap(time, (byte) round, timeStart);
    }

    public void addMember(Group g) {
        lock.writeLock().lock();
        try {
            members.add(g);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void removeMember(Group g) {
        lock.writeLock().lock();
        try {
            members.remove(g);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void changeZone(Char p, int zoneId) {
        if (zoneId < 0 || zoneId >= zones.size()) {
            zoneId = VDTTUtlis.nextInt(0, 7);
        }
        if (round > 1) {
            if (round < 3 && members.contains(p.getGroup())) {
                zones.get(zoneId).join(p, 0);
            } else {
                p.setXY(VDTTUtlis.nextInt(100, 600), 565);
                zones.get(zoneId).joinNotChangeMap(p, 47);
            }
        } else {
            zones.get(zoneId).join(p, 0);
        }
        p.getService().sendTimeInMap(time, (byte) round, timeStart);
    }

    private void start() {
        lock.writeLock().lock();
        try {
            round = 2;
            timeStart = System.currentTimeMillis();
            Iterator<Group> iterator = members.iterator();
            while (iterator.hasNext()) {
                Group g = iterator.next();
                List<Char> chars = g.getCharsInMap(48);
                if (chars.size() == 0) {
                    iterator.remove();
                } else {
                    for (Char p : chars) {
                        if (p != null && !p.isCleaned) {
                            p.setTypePk((byte) 2);
                            p.getService().sendTimeInMap(time, (byte) round, timeStart);
                        }
                    }
                }
            }
        } finally {
            lock.writeLock().unlock();
        }
    }
    public List<Group> getMembers() {
        lock.readLock().lock();
        try {
            return new ArrayList<>(members);
        } finally {
            lock.readLock().unlock();
        }
    }
    public List<MatchUp>getMatchUps(){
        lock.readLock().lock();
        try {
            return new ArrayList<>(matchUps);
        } finally {
            lock.readLock().unlock();
        }
    }
    public int getTime() {
        return (int) ((time + timeStart - System.currentTimeMillis()) / 1000);
    }

    public void write(Message ms) {
        try {
            ms.writer().writeByte(round);
            ms.writer().writeInt(getTime());
            if (round > 2) {
                List<MatchUp> matchUps = getMatchUps();
                ms.writer().writeByte(matchUps.size());
                for (int i = 0; i < matchUps.size(); i++) {
                    Group team1 = matchUps.get(i).getTeam1();
                    Group team2 = matchUps.get(i).getTeam2();
                    if (team1 != null) {
                        ms.writeUTF(team1.getName());
                        ms.writer().writeShort(team1.getPoint());
                    } else {
                        ms.writeUTF("");
                        ms.writer().writeShort(0);
                    }
                    if (team2 != null) {
                        ms.writeUTF(team2.getName());
                        ms.writer().writeShort(team2.getPoint());
                    } else {
                        ms.writeUTF("");
                        ms.writer().writeShort(0);
                    }
                    ms.writer().writeByte(matchUps.get(i).getType());
                }
            } else {
                List<Group>teams = getMembers();
                Collections.sort(teams, Comparator.comparing(Group::getPoint).reversed());
                ms.writer().writeByte(teams.size());
                for (Group g : teams) {
                    Char p = g.getMemberGroup().get(0).getChar();
                    ms.writeUTF(g.getName());
                    ms.writer().writeLong(p!=null?p.exp:0);
                    ms.writer().writeShort(g.getPoint());
                    if(p!= null&&p.clan!= null){
                        ms.writeUTF(p.clan.name);
                    }else {
                        ms.writeUTF("");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void roundOf16() {
        lock.writeLock().lock();
        try {
            round = 3;
            timeStart = System.currentTimeMillis();
            time = (int) TimeUnit.MINUTES.toMillis(3);
            List<Group> win = getMembers();
            Collections.sort(members, Comparator.comparing(Group::getPoint).reversed());
            for (int i = 0; i < 16; i += 2) {
                if (i >= members.size()) {
                    break;
                }
                Group team1 = members.get(i);
                Group team2 = i+1<members.size()?members.get(i+1):null;
                MatchUp match = new MatchUp(team1, team2);
                matchUps.add(match);
            }
            members.removeAll(win);
            returnToSpectatorArea();
            setZonePK();
            sendTimeAllCharInMap();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            lock.writeLock().unlock();
        }
    }

    public void sendTimeAllCharInMap() {
        for (Zone z : zones) {
            if (z != null && !z.isClosed())
                z.getService().sendTimeInMap(time, (byte) round, timeStart);
        }
    }
    private void returnToSpectatorArea() {
        for (Group gr: members){
            List<Char> chars = gr.getCharsInMap(48);
            for (Char p : chars) {
                if (p != null && !p.isCleaned) {
                    p.setTypePk((byte) 0);
                    p.zone.joinNotChangeMap(p, 47);
                }
            }
        }
    }
    private void setZonePK() {
        int i = 0;
        for (MatchUp match:matchUps){
            try {
                match.zoneId = i;
                if(match.isFinish){
                    if(match.getWinner()!=null){
                        Group g = match.getWinner();
                        List<Char> chars = g.getCharsInMap(48);
                        for (Char p : chars) {
                            if (p != null && !p.isCleaned) {
                                Effect eff = new Effect(46, 10000, 0);
                                p.getEm().setEffect(eff);
                                p.matchUp = match;
                                p.setTypePk((byte) 2);
                                zones.get(i).join(p, 0);
                            }
                        }
                        GlobalService.getInstance().chat("Hệ thống", "c#item" + match.getWinner().getName() + "c#white đã chiến thắng tại khu vực " + match.getZoneId(), (byte) 1);
                    }
                }else {
                    match.revive();
                    List<Char> chars1 = match.getTeam1().getCharsInMap(48);
                    List<Char> chars2 = match.getTeam2().getCharsInMap(48);
                    for (Char _char : chars1) {
                        if (_char != null && !_char.isCleaned) {
                            Effect eff = new Effect(46, 10000, 0);
                            _char.getEm().setEffect(eff);
                            _char.matchUp = match;
                            _char.setTypePk((byte) 2);
                            zones.get(i).join(_char, 0);
                        }
                    }
                    for (Char _char : chars2) {
                        if (_char != null && !_char.isCleaned) {
                            Effect eff = new Effect(46, 10000, 0);
                            _char.getEm().setEffect(eff);
                            _char.matchUp = match;
                            _char.setTypePk((byte) 2);
                            zones.get(i).join(_char, 0);
                        }
                    }
                }
                i++;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private void nextRound() {
        lock.writeLock().lock();
        try {
            round++;
            timeStart = System.currentTimeMillis();
            time = (int) TimeUnit.MINUTES.toMillis(3);
            List<Group> win = new ArrayList<>();
            List<Group> lose = new ArrayList<>();
            for (MatchUp match:matchUps){
                match.sendQua(round);
                if(match.isFinish()){
                    if(match.getWinner()!=null){
                        win.add(match.getWinner());
                    }
                    if(match.getLoser()!=null){
                        lose.add(match.getLoser());
                    }
                }else {
                    match.setWinner();
                    if(match.getWinner()!= null){
                        win.add(match.getWinner());
                        GlobalService.getInstance().chat("Hệ thống", "c#item" + match.getWinner().getName() + "c#white đã chiến thắng tại khu vực " + match.getZoneId(), (byte) 1);
                    }
                    if(match.getLoser()!= null){
                        lose.add(match.getLoser());
                    }
                }
            }
            for (Group g:lose){
                List<Char> chars = g.getCharsInMap(48);
                for (Char p : chars) {
                    if (p != null && !p.isCleaned) {
                        p.matchUp = null;
                        p.setTypePk((byte) 0);
                        p.zone.joinNotChangeMap(p, 47);
                    }
                }
            }
            ArrayList<MatchUp>newMatchUps = new ArrayList<>();
            for (int i = 0; i < win.size(); i += 2) {
                Group team1 = win.get(i);
                Group team2 = i+1>=win.size()?null:win.get(i+1);
                MatchUp match = new MatchUp(team1, team2);
                newMatchUps.add(match);
            }
            matchUps = newMatchUps;
            setZonePK();
            sendTimeAllCharInMap();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.writeLock().unlock();
        }
    }

    public void sendItemToWinner(Group group) {
        try {
            List<Char>chars = group.getChars();
            for (Char _char : chars) {
                try {
                    if (_char != null && !_char.isCleaned) {
                        Mail mail = new Mail();
                        mail.setTitle("Thư từ hệ thống");
                        mail.setContent("Thưởng vô địch giải đấu sức mạnh");
                        mail.setTime((int) ((System.currentTimeMillis() + TimeUnit.DAYS.toMillis(3)) / 1000));
                        mail.setSender("Hệ thống");
                        Item item = new Item(1174);
                        item.setQuantity(5);
                        item.setLock(true);
                        mail.setItem(item);
                        Mail mail1 =mail.clone();
                        Item tui = new Item(1151);
                        tui.setQuantity(5);
                        tui.setLock(true);
                        mail1.setItem(tui);
                        mail1.id = _char.mailManager.getID();
                        _char.mailManager.addMail(mail1);
                        mail.id = _char.mailManager.getID();
                        _char.mailManager.addMail(mail);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void end() {
        lock.writeLock().lock();
        try {
            if (matchUps.size() == 1) {
                try {
                    MatchUp match = matchUps.get(0);
                    if (!match.isFinish) {
                        match.setWinner();
                        if (match.getWinner() != null) {
                            sendItemToWinner(match.getWinner());
                            GlobalService.getInstance().chat("Hệ thống", "Chúc mừng chiến binh c#item" + match.getWinner().getName() + "c#white đã vô địch giải đấu lần này", (byte) 1);
                        }
                    } else {
                        if (match.getWinner() != null) {
                            sendItemToWinner(match.getWinner());
                            GlobalService.getInstance().chat("Hệ thống", "Chúc mừng chiến binh c#item" + match.getWinner().getName() + "c#white đã vô địch giải đấu lần này", (byte) 1);
                        }
                    }
                } catch (Exception e) {
                    Log.error("Loi phat qua vo dich ", e);
                }
            }
            Map map = MapManager.getInstance().find(48);
            for (Zone z : zones) {
                if (z != null && !z.isClosed()) {
                    List<Char> chars = z.getChars();
                    for (Char p : chars) {
                        try {
                            if (p != null && !p.isCleaned) {
                                p.matchUp = null;
                                p.setTypePk((byte) 0);
                                p.changeMap(86);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    z.close();
                    map.removeZone(z);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
            MapManager.getInstance().GDSM = null;
            clean();
        }
    }

    public void clean() {
        members.clear();
        matchUps.clear();
        zones.clear();
    }

    public static void initDauTruong() { //hàm này chỉ có load thời gian thôi để e kiếm hàm event
        Runnable runnable = new Runnable() {
            public void run() {
                try {
                    if(MapManager.getInstance().VDSM!=null){
                        return;
                    }
                    GiaiDauSucManh dauTruong= MapManager.getInstance().GDSM = new GiaiDauSucManh();
                    Thread.sleep(0);
                    dauTruong.start();
                    Thread.sleep(0);
                    dauTruong.roundOf16();
                    Thread.sleep(180000);
                    dauTruong.nextRound();// round 4
                    Thread.sleep(180000);
                    dauTruong.nextRound(); // round 2
                    Thread.sleep(180000);
                    dauTruong.nextRound(); // round 1
                    Thread.sleep(180000);
                    dauTruong.end();
                } catch (InterruptedException ex) {

                }
            }
        };
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(runnable, 0, 1 * 24 * 60 * 60, TimeUnit.SECONDS);
    }

}
