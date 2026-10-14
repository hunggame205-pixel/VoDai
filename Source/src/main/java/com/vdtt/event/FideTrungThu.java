package com.vdtt.event;

import com.vdtt.item.Item;
import com.vdtt.map.Map;
import com.vdtt.map.item.ItemMap;
import com.vdtt.map.item.ItemMapFactory;
import com.vdtt.map.zones.Zone;
import com.vdtt.mob.Mob;
import com.vdtt.model.Char;
import com.vdtt.model.RandomItem;
import com.vdtt.server.Server;
import com.vdtt.server.VDTT;
import com.vdtt.util.Log;
import com.vdtt.util.TimeUtils;
import com.vdtt.util.VDTTUtlis;

import java.util.Calendar;

public class FideTrungThu extends Thread {
    public Char pl;
    public Zone zone;
    public boolean isStop = false;
    String[] chats = {"Tùng dinh dinh cắc tùng dinh dinh",
            "Trung Thu rộn ràng, chúc bạn nhận được thật nhiều phần thưởng!",
            "Đèn ông sao với đèn cá chép.",
            "Em rước đèn này đến cung trăng",
            "Tết Trung Thu rước đèn đi chơi"
    };
    private long lastTime, lastTimeDropItem, lastTimeChat, lastTimeMove;


    public FideTrungThu() {
        Char c = new Char();
        c.id = 999999;
        c.name = "Em Bé";
        c.exp = 999999;
        c.idCharSys = 0;
        c.sys = 1;
        c.body = new Item[16];
        c.body2 = new Item[16];
        c.bag = new Item[16];
        c.box = new Item[16];
        c.body[14] = new Item(1051);
        c.x = 1180;
        c.y = 430;
        c.hp= c.maxHP = 999999;
        c.mp= c.maxMP = 999999;
        c.isBot = true;
        pl = c;
        this.lastTime = this.lastTimeDropItem = this.lastTimeMove = System.currentTimeMillis();
    }

    public void run() {
        try {
            Calendar cal = Calendar.getInstance();
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            while (hour < 21) {
                long now = System.currentTimeMillis();
                cal = Calendar.getInstance();
                hour = cal.get(Calendar.HOUR_OF_DAY);
                if (TimeUtils.canDoWithTime(lastTime, 60000)) {
                    lastTime = now;
                    zone.getService().chat("Em Bé", "Ta đi khu khác phát tiếp đây, tạm biệt");
                    Map map = zone.map;
                    Zone z = map.rand();
                    zone.removeChar(pl);
                    zone.getService().playerRemove(pl.id);
                    zone = z;
                    zone.getService().playerAdd(pl);
                    zone.addChar(pl);
                    Log.debug( "Change zone to " + zone.id);
                    continue;
                }
                if (TimeUtils.canDoWithTime(lastTimeDropItem, 10000)) {
                    lastTimeDropItem = now;
                    int q = VDTTUtlis.nextInt(1, 2);
                    for (int i = 0; i < q; i++) {
                        ItemMap item = ItemMapFactory.getInstance().builder()
                                .id(zone.numberDropItem++)
                                .x((short) (772+VDTTUtlis.nextInt(816)))
                                .y(pl.y)
                                .build();
                        item.setItem(new Item(RandomItem.EM_BE_PHAT_QUA.next()));
                        item.setOwnerID(-1);
                        zone.addItemMap(item);
                        zone.getService().addItemMap(item,pl);
                    }
                }
                if (TimeUtils.canDoWithTime(lastTimeChat, 5000)) {
                    lastTimeChat = now;
                    zone.getService().chat("Em Bé", (String) VDTTUtlis.randomObject(chats));
                }
                if (TimeUtils.canDoWithTime(lastTimeMove, 2000)) {
                    lastTimeMove = now;
                    short preX = pl.x;
                    short preY = pl.y;
                    preX += VDTTUtlis.nextInt(-1000, 1000);
                    if (VDTTUtlis.nextBoolean()) {
                        preY -= 50;
                    }
                    zone.getService().updateMove(pl.id, preX, preY);
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
