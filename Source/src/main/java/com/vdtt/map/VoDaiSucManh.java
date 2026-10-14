package com.vdtt.map;

import com.vdtt.effect.Effect;
import com.vdtt.event.Event;
import com.vdtt.item.Item;
import com.vdtt.model.Char;
import com.vdtt.model.DeathMatch;
import com.vdtt.network.Message;
import com.vdtt.server.GlobalService;
import com.vdtt.util.Log;
import com.vdtt.util.VDTTUtlis;
import com.vdtt.map.zones.Zone;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class VoDaiSucManh {
    private static final int SPECTATOR_Y = 565;
    private static final int MIN_X = 100;
    private static final int MAX_X = 600;
    private static final int MAP_ID = 50;
    private static final int RETURN_MAP = 86;
    private static final byte MAX_ZONES = 9;
    private static final byte MAX_UPGRADE = 18;
    private static final int REGISTRATION_TIME = 10; // minutes
    private static final int MATCH_TIME = 3; // minutes

    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final List<Zone> zones;
    private final List<Char> members;
    private final List<DeathMatch> currentMatches;

    public int round;
    private long timeStart;
    private int time;

    public VoDaiSucManh() {
        this.members = new ArrayList<>();
        this.currentMatches = new ArrayList<>();
        this.zones = initializeZones();
        this.timeStart = System.currentTimeMillis();
        this.time = (int) TimeUnit.MINUTES.toMillis(REGISTRATION_TIME);
        this.round = 1;
    }

    private List<Zone> initializeZones() {
        List<Zone> zoneList = new ArrayList<>();
        Map map = MapManager.getInstance().find(MAP_ID);
        for (byte i = 0; i < MAX_ZONES; i++) {
            zoneList.add(new Zone(i, map.mapTemplate, map));
        }
        return zoneList;
    }

    public void join(Char p, int zoneId) {
        zoneId = validateZoneId(zoneId);
        if (round == 1) {
            zones.get(zoneId).join(p, 0);
            if (!members.contains(p)) {
                addMember(p);
            }
        } else {
            p.setTypePk((byte) 0);
            zones.get(zoneId).joinNotChangeMap(p, 49);
        }
        p.getService().sendTimeInMap(time, (byte) round, timeStart);
    }

    public void changeZone(Char p, int zoneId) {
        zoneId = validateZoneId(zoneId);
        if (round > 1) {
            if (round < 3 && members.contains(p)) {
                zones.get(zoneId).join(p, 0);
            } else {
                p.setXY(VDTTUtlis.nextInt(MIN_X, MAX_X), SPECTATOR_Y);
                zones.get(zoneId).joinNotChangeMap(p, 49);
            }
        } else {
            zones.get(zoneId).join(p, 0);
        }
        p.getService().sendTimeInMap(time, (byte) round, timeStart);
    }

    private int validateZoneId(int zoneId) {
        return (zoneId < 0 || zoneId >= zones.size()) ?
                VDTTUtlis.nextInt(0, zones.size() - 2) : zoneId;
    }

    public void addMember(Char p) {
        lock.writeLock().lock();
        try {
            members.add(p);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void removeMember(Char p) {
        lock.writeLock().lock();
        try {
            members.remove(p);
        } finally {
            lock.writeLock().unlock();
        }
    }

    private void startTournament() {
        lock.writeLock().lock();
        try {
            round = 2;
            timeStart = System.currentTimeMillis();
            updateMembersForRound();
        } finally {
            lock.writeLock().unlock();
        }
    }

    private void updateMembersForRound() {
        Iterator<Char> iterator = members.iterator();
        while (iterator.hasNext()) {
            Char p = iterator.next();
            if (isValidParticipant(p)) {
                p.setTypePk((byte) 2);
                p.getService().sendTimeInMap(time, (byte) round, timeStart);
            } else {
                iterator.remove();
            }
        }
    }

    private boolean isValidParticipant(Char p) {
        return p != null && !p.isCleaned;
    }

    public List<Char> getMembers() {
        lock.readLock().lock();
        try {
            return new ArrayList<>(members);
        } finally {
            lock.readLock().unlock();
        }
    }

    public List<DeathMatch> getCurrentMatches() {
        lock.readLock().lock();
        try {
            return new ArrayList<>(currentMatches);
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
                List<DeathMatch> deathMatches = getCurrentMatches();
                ms.writer().writeByte(deathMatches.size());
                for (DeathMatch match : deathMatches) {
                    writeMatchInfo(ms, match);
                }
            } else {
                writeMemberInfo(ms);
            }
        } catch (Exception e) {
            Log.error("Error writing tournament info", e);
        }
    }

    private void writeMatchInfo(Message ms, DeathMatch match) throws Exception {
        writePlayerInfo(ms, match.getPlayer1());
        writePlayerInfo(ms, match.getPlayer2());
        ms.writer().writeByte(match.getType());
    }

    private void writePlayerInfo(Message ms, Char player) throws Exception {
        if (player != null) {
            ms.writeUTF(player.name);
            ms.writer().writeShort(player.pointTournament);
        } else {
            ms.writeUTF("");
            ms.writer().writeShort(0);
        }
    }

    private void writeMemberInfo(Message ms) throws Exception {
        List<Char> chars = getMembers();
        Collections.sort(chars, Comparator.comparing(Char::getPointTournament).reversed());
        ms.writer().writeByte(chars.size());
        for (Char p : chars) {
            if (isValidParticipant(p)) {
                ms.writeUTF(p.name);
                ms.writer().writeLong(p.exp);
                ms.writer().writeShort(p.pointTournament);
                ms.writeUTF(p.clan != null ? p.clan.name : "");
            }
        }
    }

    private void startEliminationRound() {
        lock.writeLock().lock();
        try {
            prepareEliminationRound();
            createMatches(16); // Start with top 16
            returnSpectatorsToArea();
            assignMatchesToZones();
            sendTimeAllCharInMap();
        } finally {
            lock.writeLock().unlock();
        }
    }

    private void prepareEliminationRound() {
        round = 3;
        timeStart = System.currentTimeMillis();
        time = (int) TimeUnit.MINUTES.toMillis(MATCH_TIME);
        Collections.sort(members, Comparator.comparing(Char::getPointTournament).reversed());
        currentMatches.clear();
    }

    private void createMatches(int maxParticipants) {
        List<Char> qualifiedPlayers = new ArrayList<>();
        for (int i = 0; i < maxParticipants && i < members.size(); i += 2) {
            Char p1 = members.get(i);
            Char p2 = i + 1 < members.size() ? members.get(i + 1) : null;

            DeathMatch match = createMatch(p1, p2);
            currentMatches.add(match);

            if (p1 != null) qualifiedPlayers.add(p1);
            if (p2 != null) qualifiedPlayers.add(p2);
        }
        members.removeAll(qualifiedPlayers);
    }

    private DeathMatch createMatch(Char p1, Char p2) {
        DeathMatch match = new DeathMatch(p1, p2);
        setupPlayerForMatch(p1, match);
        setupPlayerForMatch(p2, match);
        return match;
    }

    private void setupPlayerForMatch(Char player, DeathMatch match) {
        if (player != null) {
            Effect eff = new Effect(46, 10000, 0);
            player.getEm().setEffect(eff);
            player.deathMatch = match;
        }
    }

    private void assignMatchesToZones() {
        int zoneIndex = 0;
        for (DeathMatch match : currentMatches) {
            if (match.isFinish) {
                if (match.getWinner() != null) {
                    zones.get(zoneIndex).join(match.getWinner(), 0);
                    announceWinner(match.getWinner());
                }
            } else {
                match.revive();
                if (match.getPlayer1() != null) zones.get(zoneIndex).join(match.getPlayer1(), 0);
                if (match.getPlayer2() != null) zones.get(zoneIndex).join(match.getPlayer2(), 0);
            }
            zoneIndex++;
        }
    }

    private void returnSpectatorsToArea() {
        for (Char pl : members) {
            if (isValidParticipant(pl)) {
                pl.setTypePk((byte) 0);
                pl.setXY(VDTTUtlis.nextInt(MIN_X, MAX_X), SPECTATOR_Y);
                pl.zone.joinNotChangeMap(pl, 49);
            }
        }
    }

    public void sendTimeAllCharInMap() {
        for (Zone z : zones) {
            if (z != null && !z.isClosed()) {
                z.getService().sendTimeInMap(time, (byte) round, timeStart);
            }
        }
    }

    private void processNextRound() {
        lock.writeLock().lock();
        try {
            round++;
            timeStart = System.currentTimeMillis();
            time = (int) TimeUnit.MINUTES.toMillis(MATCH_TIME);

            List<Char> winners = new ArrayList<>();
            processCurrentMatches(winners);

            createNextRoundMatches(winners);
            assignMatchesToZones();
            sendTimeAllCharInMap();
        } catch (Exception e) {
            Log.error("Error processing next round", e);
        } finally {
            lock.writeLock().unlock();
        }
    }

    private void createNextRoundMatches(List<Char> winners) {
        currentMatches.clear();
        for (int i = 0; i < winners.size(); i += 2) {
            Char p1 = winners.get(i);
            Char p2 = i + 1 < winners.size() ? winners.get(i + 1) : null;
            currentMatches.add(createMatch(p1, p2));
        }
    }

    private void processCurrentMatches(List<Char> winners) {
        for (DeathMatch match : currentMatches) {
            if (!match.isFinish) {
                match.setWinner();
            }
            processMatchResults(match, winners);
            match.sendQua(round);
        }
    }

    private void processMatchResults(DeathMatch match, List<Char> winners) {
        Char winner = match.getWinner();
        if (winner != null) {
            winner.deathMatch = null;
            winners.add(winner);
            announceWinner(winner);
        }

        Char loser = match.getLoser();
        if (loser != null) {
            loser.deathMatch = null;
            returnPlayerToSpectatorArea(loser);
        }
    }

    private void returnPlayerToSpectatorArea(Char player) {
        if (isValidParticipant(player)) {
            player.setTypePk((byte) 0);
            player.setXY(VDTTUtlis.nextInt(MIN_X, MAX_X), SPECTATOR_Y);
            player.zone.joinNotChangeMap(player, 49);
        }
    }

    private void announceWinner(Char winner) {
        GlobalService.getInstance().chat("Hệ thống",
                String.format("c#item%sc#white đã chiến thắng tại khu vực %d",
                        winner.name, winner.zone.id), (byte) 1);
    }

    public void sendItemToWinner(Char pl) {
        try {
            if(pl.getSlotNull() > 2){
                // Add ninja sword
                Item ninjaSword = new Item(353);
                ninjaSword.setLock(true);
                ninjaSword.setQuantity(20);
                pl.addItemToBag(ninjaSword);
                pl.getService().addItem(ninjaSword);

                // Add coins
                pl.addCoin(20000000, true);

                // Add blessing scroll
                Item blessingScroll = new Item(177);
                blessingScroll.isLock = true;
                blessingScroll.setQuantity(5);
                pl.addItemToBag(blessingScroll);

                // Add time-limited item
                Item timeItem = new Item(447);
                timeItem.setLock(true);
                timeItem.setQuantity(1);
                timeItem.expire = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(1);
                pl.addItemToBag(timeItem);
            }

            // Event rewards
            if(Event.isNoel() && pl.getSlotNull() > 0){
                Item eventItem = new Item(930);
                eventItem.setLock(true);
                eventItem.setQuantity(250);
                pl.addItemToBag(eventItem);
                pl.getService().addItem(eventItem);
            }
        } catch (Exception e) {
            Log.error("Error sending winner items", e);
        }
    }

    public void sendItemToAQuan(Char pl) {
        try {
            // Second place rewards can be added here
            // Currently no items configured for runner-up
        } catch (Exception e) {
            Log.error("Error sending runner-up items", e);
        }
    }

    private void endTournament() {
        lock.writeLock().lock();
        try {
            if (currentMatches.size() == 1) {
                processFinalMatch(currentMatches.get(0));
            }
            closeAllZones();
        } finally {
            lock.writeLock().unlock();
            MapManager.getInstance().VDSM = null;
            clean();
        }
    }

    private void processFinalMatch(DeathMatch finalMatch) {
        try {
            if (!finalMatch.isFinish) {
                finalMatch.setWinner();
            }

            Char winner = finalMatch.getWinner();
            Char runner = finalMatch.getLoser();

            if (winner != null) {
                winner.deathMatch = null;
                sendItemToWinner(winner);
                announceChampion(winner.name);
            }

            if (runner != null) {
                runner.deathMatch = null;
                sendItemToAQuan(runner);
                announceRunnerUp(runner.name);
            }

            finalMatch.sendQua(round);
        } catch (Exception e) {
            Log.error("Error processing final match", e);
        }
    }

    private void closeAllZones() {
        Map map = MapManager.getInstance().find(MAP_ID);
        for (Zone zone : zones) {
            if (zone != null && !zone.isClosed()) {
                List<Char> chars = zone.getChars();
                for (Char p : chars) {
                    try {
                        if (isValidParticipant(p)) {
                            p.setTypePk((byte) 0);
                            p.changeMap(RETURN_MAP);
                        }
                    } catch (Exception e) {
                        Log.error("Error returning player to map", e);
                    }
                }
                zone.close();
                map.removeZone(zone);
            }
        }
    }

    private void announceChampion(String name) {
        GlobalService.getInstance().chat("Hệ thống",
                String.format("Chúc mừng chiến binh c#item%sc#white đã vô địch giải đấu lần này", name),
                (byte) 1);
    }

    private void announceRunnerUp(String name) {
        GlobalService.getInstance().chat("Hệ thống",
                String.format("Chúc mừng chiến binh c#item%sc#white đã về nhì giải đấu lần này", name),
                (byte) 1);
    }

    public void clean() {
        members.clear();
        currentMatches.clear();
        zones.clear();
    }

    public static void initDauTruong() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    if (MapManager.getInstance().GDSM != null) {
                        return;
                    }

                    VoDaiSucManh tournament = new VoDaiSucManh();
                    MapManager.getInstance().VDSM = tournament;

                    // Round 1: Registration and initial phase - 10 minutes
                    Thread.sleep(TimeUnit.MINUTES.toMillis(REGISTRATION_TIME));
                    tournament.startTournament();

                    // Round 2: Qualifying round - 10 minutes
                    Thread.sleep(TimeUnit.MINUTES.toMillis(REGISTRATION_TIME));
                    tournament.startEliminationRound();

                    // Rounds 3-6: Elimination rounds - 3 minutes each
                    for (int i = 0; i < 4; i++) {
                        Thread.sleep(TimeUnit.MINUTES.toMillis(MATCH_TIME));
                        tournament.processNextRound();
                    }

                    // End tournament
                    Thread.sleep(TimeUnit.MINUTES.toMillis(MATCH_TIME));
                    tournament.endTournament();

                } catch (InterruptedException ex) {
                    Log.error("Tournament interrupted", ex);
                    Thread.currentThread().interrupt();
                } catch (Exception e) {
                    Log.error("Error running tournament", e);
                }
            }
        }, 0, 1 * 24 * 60 * 60, TimeUnit.SECONDS);
    }
}