package com.vdtt.model;

import com.vdtt.item.Item;
import com.vdtt.mail.Mail;
import com.vdtt.util.Log;
import com.vdtt.util.VDTTUtlis;
import lombok.Getter;

import java.util.concurrent.TimeUnit;

@Getter
public class DeathMatch {
    private Char player1;
    private Char player2;
    private int damage1;
    private int damage2;
    private Char winner;
    private Char loser;
    public boolean isFinish;
    public String name1;
    public String name2;

    public DeathMatch(Char player1, Char player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.damage1 = 0;
        this.damage2 = 0;
        this.winner = null;
        this.loser = null;
        this.isFinish = false;
        this.name1 = player1 == null ? "" : player1.name;
        this.name2 = player2 == null ? "" : player2.name;

        // Kiểm tra nếu một trong hai người chơi là null
        if (player1 == null && player2 != null) {
            winner = player2;
            isFinish = true;
        } else if (player2 == null && player1 != null) {
            winner = player1;
            isFinish = true;
        }
    }

    public synchronized void updateDamage(Char player, int damage) {
        if (isFinish) {
            Log.debug("Match is already finished.");
            return;
        }
        if (player == player1) {
            damage1 += damage;
        } else if (player == player2) {
            damage2 += damage;
        } else {
            Log.debug("Player not in this match.");
        }
    }

    public synchronized void out(Char player) {
        if (isFinish) {
            Log.debug("Match is already finished.");
            return;
        }
        if (player == player1) {
            winner = player2;
            loser = player1;
        } else if (player == player2) {
            winner = player1;
            loser = player2;
        } else {
            return;
        }
        isFinish = true;
    }

    public synchronized void setWinner() {
        if (isFinish) return;  // Bỏ qua nếu trận đấu đã kết thúc
        if (damage1 > damage2) {
            winner = player1;
            loser = player2;
        } else if (damage2 > damage1) {
            winner = player2;
            loser = player1;
        } else {
            if (player1 == null && player2 != null) {
                winner = player2;
            } else if (player2 == null && player1 != null) {
                winner = player1;
            } else {
                if (VDTTUtlis.nextInt(10) < 5) {
                    winner = player1;
                    loser = player2;
                } else {
                    winner = player2;
                    loser = player1;
                }
            }
        }
        isFinish = true;
    }

    public void resetMatch() {
        this.damage1 = 0;
        this.damage2 = 0;
        this.winner = null;
        this.loser = null;
        this.player1 = null;
        this.player2 = null;
        this.isFinish = false;
    }

    public void revive() {
        if (player1 != null) {
            if(player1.isDead){
                player1.wakeUpFromDead();
            }else {
                player1.addHp(player1.maxHP);
                player1.addMp(player1.maxMP);
            }
        }
        if (player2 != null) {
            if(player2.isDead){
                player2.wakeUpFromDead();
            }else {
                player2.addHp(player2.maxHP);
                player2.addMp(player2.maxMP);
            }
        }
    }
    public byte getType(){
        if(isFinish){
            if(winner == player1){
                return 1;
            }
            if(winner == player2){
                return 2;
            }
        }
        return 0;
    }
    public void sendQua(int round){
        Mail mail = new Mail();
        mail.setTitle("Thư từ hệ thống");
        mail.setContent("Thưởng võ đài vũ trụ");
        mail.setTime((int) ((System.currentTimeMillis() + TimeUnit.DAYS.toMillis(3)) / 1000));
        mail.setSender("Hệ thống");
        if (round == 3) {
            mail.setCoin(5000000);
            Item item = new Item(177);
            item.setQuantity(1);
            item.isLock = true;
            mail.setItem(item);
        } else if (round == 4) {
            mail.setCoin(7000000);
            Item item = new Item(177);
            item.isLock = true;
            mail.setItem(item);
        } else if (round == 5) {
            mail.setCoin(10000000);
            Item item = new Item(930);
            item.setQuantity(50);
            item.setLock(true);
            mail.setItem(item);
        } else if (round == 6) {
            mail.setCoin(20000000);
            Item item = new Item(930);
            item.isLock = true;
            item.setQuantity(50);
            mail.setItem(item);
        }
        if(player1!= null){
            Mail mail1 = mail.clone();
            if(mail.getItem() != null){
                mail1.setItem(mail.getItem().clone());
            }
            mail1.id = player1.mailManager.getID();
            player1.mailManager.addMail(mail1);
        }
        if(player2!= null){
            Mail mail2 = mail.clone();
            if(mail.getItem() != null){
                mail2.setItem(mail.getItem().clone());
            }
            mail2.id = player2.mailManager.getID();
            player2.mailManager.addMail(mail2);
        }
    }
}

