package com.vdtt.model;

import com.vdtt.item.Item;
import com.vdtt.mail.Mail;
import com.vdtt.party.Group;
import com.vdtt.server.GlobalService;
import com.vdtt.util.Log;
import com.vdtt.util.VDTTUtlis;
import lombok.Getter;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Getter
public class MatchUp {
    private Group team1;
    private Group team2;
    private int damage1;
    private int damage2;
    private Group winner;
    private Group loser;
    public boolean isFinish;
    public String name1;
    public String name2;
    public int zoneId;

    public MatchUp(Group team1, Group team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.damage1 = 0;
        this.damage2 = 0;
        this.winner = null;
        this.loser = null;
        this.isFinish = false;
        this.name1 = team1 == null ? "" : team1.getName();
        this.name2 = team2 == null ? "" : team2.getName();

        if (team1 == null && team2 != null) {
            winner = team2;
            isFinish = true;
            return;
        } else if (team2 == null && team1 != null) {
            winner = team1;
            isFinish = true;
            return;
        }
        int size1 = team1.getCharsInMap(48).size();
        int size2 = team2.getCharsInMap(48).size();
        if(size1 == 0 || size2 == 0) {
            winner = size1 == 0 ? team2 : team1;
            isFinish = true;
        }
    }

    public synchronized void updateDamage(Group team, int damage) {
        if (isFinish) {
            Log.debug("Match is already finished.");
            return;
        }
        if (team == team1) {
            damage1 += damage;
        } else if (team == team2) {
            damage2 += damage;
        } else {
            Log.debug("Player not in this match.");
        }
    }
    public synchronized void out(Group team) {
        if (isFinish) {
            Log.debug("Match is already finished.");
            return;
        }
        if (team == team1) {
            int size = team1.getCharsInMap(48).size();
            if(size == 0) {
                winner = team2;
                isFinish = true;
                GlobalService.getInstance().chat("Hệ thống", "c#item" + getWinner().getName() + "c#white đã chiến thắng tại khu vực " + getZoneId(), (byte) 1);
                return;
            }
        } else if (team == team2) {
            int size = team2.getCharsInMap(48).size();
            if(size == 0) {
                winner = team1;
                isFinish = true;
                GlobalService.getInstance().chat("Hệ thống", "c#item" + getWinner().getName() + "c#white đã chiến thắng tại khu vực " + getZoneId(), (byte) 1);
                return;
            }
        } else {
            Log.debug("Player not in this match.");
        }
        isFinish = true;
    }
    public synchronized void setWinner(){
        if (isFinish) {
            Log.debug("Match is already finished.");
            return;
        }
        if (damage1 > damage2) {
            winner = team1;
            loser = team2;
        } else if (damage1 < damage2) {
            winner = team2;
            loser = team1;
        } else {
            int size1 = team1.getCharsInMap(48).size();
            int size2 = team2.getCharsInMap(48).size();
            if(size1 ==0||size1 < size2){
                winner = team2;
                loser = team1;
            } else if (size2 == 0 || size2 < size1) {
                winner = team1;
                loser = team2;
            } else {
                if (VDTTUtlis.nextInt(10) < 5) {
                    winner = team1;
                    loser = team2;
                } else {
                    winner = team2;
                    loser = team1;
                }

            }
        }
        isFinish = true;
    }
    public void sendQua(int round){
        try {
            if(team1!= null) {
                List<Char> chars = team1.getChars();
                for (Char _char : chars) {
                    try {
                        if (_char != null && !_char.isCleaned) {
                            Mail mail = new Mail();
                            mail.setTitle("Thư từ hệ thống");
                            mail.setContent("Thưởng giải đấu sức mạnh");
                            mail.setTime((int) ((System.currentTimeMillis() + TimeUnit.DAYS.toMillis(3)) / 1000));
                            mail.setSender("Hệ thống");
                            if (round == 3) {
                                mail.setCoin(5000000);
                                Item item = new Item(177);
                                item.isLock = true;
                                mail.setItem(item);
                            } else if (round == 4) {
                                mail.setCoin(10000000);
                                Item item = new Item(177);
                                item.isLock = true;
                                mail.setItem(item);
                            } else if (round == 5) {
                                Item item = new Item(1174);
                                item.setQuantity(2);
                                item.setLock(true);
                                mail.setItem(item);
                                Mail mail1 = mail.clone();
                                Item tui = new Item(1151);
                                tui.setQuantity(2);
                                tui.setLock(true);
                                mail1.setItem(tui);
                                mail1.id = _char.mailManager.getID();
                                _char.mailManager.addMail(mail1);
                            }
                            mail.id = _char.mailManager.getID();
                            _char.mailManager.addMail(mail);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            if(team2 == null){
                return;
            }
            List<Char> chars = team2.getChars();
            for(Char _char : chars){
                try {
                    if(_char!= null &&!_char.isCleaned){
                        Mail mail = new Mail();
                        mail.setTitle("Thư từ hệ thống");
                        mail.setContent("Thưởng giải đấu sức mạnh");
                        mail.setTime((int) ((System.currentTimeMillis() + TimeUnit.DAYS.toMillis(3)) / 1000));
                        mail.setSender("Hệ thống");
                        if (round == 3) {
                            mail.setCoin(5000000);
                            Item item = new Item(177);
                            item.isLock = true;
                            mail.setItem(item);
                        } else if (round == 4) {
                            mail.setCoin(10000000);
                            Item item = new Item(177);
                            item.isLock = true;
                            mail.setItem(item);
                        } else if(round == 5){
                            Item item = new Item(1174);
                            item.setQuantity(2);
                            item.setLock(true);
                            mail.setItem(item);
                            Mail mail1 =mail.clone();
                            Item tui = new Item(1151);
                            tui.setQuantity(2);
                            tui.setLock(true);
                            mail1.setItem(tui);
                            mail1.id = _char.mailManager.getID();
                            _char.mailManager.addMail(mail1);
                        }
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
    public void resetMatch() {
        this.damage1 = 0;
        this.damage2 = 0;
        this.winner = null;
        this.loser = null;
        this.isFinish = false;
    }
    public void revive(){
        List<Char> chars1 = team1.getCharsInMap(48);
        List<Char> chars2 = team2.getCharsInMap(48);
        for(Char _char : chars1){
            if(_char!= null &&!_char.isCleaned){
                if(_char.isDead){
                    _char.wakeUpFromDead();
                }else {
                    _char.addHp(_char.maxHP);
                    _char.addMp(_char.maxMP);
                }
            }
        }
        for(Char _char : chars2){
            if(_char!= null &&!_char.isCleaned){
                if(_char.isDead){
                    _char.wakeUpFromDead();
                }else {
                    _char.addHp(_char.maxHP);
                    _char.addMp(_char.maxMP);
                }
            }
        }
    }

    public int getType() {
        if (isFinish) {
            if (winner == team1) {
                return 1;
            }
            if (winner == team2) {
                return 2;
            }
        }
        return 0;
    }
}
