package com.vdtt.event;

import com.vdtt.data.CMDMenu;
import com.vdtt.event.eventpoint.EventPoint;
import com.vdtt.item.Item;
import com.vdtt.map.world.Hell;
import com.vdtt.map.world.SummerEvent;
import com.vdtt.map.zones.Zone;
import com.vdtt.model.Char;
import com.vdtt.model.Menu;

import java.util.Calendar;
import java.util.List;

public class SumMer extends Event {
    public static final String TOP_MAKE_VAI_CAKE = "chung_cake";
    public static final String TOP_KILL_CELL = "kill_cell";
    private static final int MAKE_WATER_MELON_CAKE = 0;
    private static final int MAKE_DUA_CAKE = 1;

    public SumMer() {
        setId(Event.SUMMER);
        endTime.set(2025, Calendar.JANUARY, 15, 23, 59, 59);
        itemsThrownFromMonsters.add(5, 966);
        itemsThrownFromMonsters.add(5, 967);
        itemsThrownFromMonsters.add(2, 968);
        itemsThrownFromMonsters.add(2, 969);
        itemsThrownFromMonsters.add(2, 970);
        keyEventPoint.add(EventPoint.DIEM_TIEU_XAI);
        keyEventPoint.add(TOP_KILL_CELL);
        keyEventPoint.add(TOP_MAKE_VAI_CAKE);
        itemsRecFromGoldItem.add(40, 4);
        itemsRecFromGoldItem.add(30, 5);
        itemsRecFromGoldItem.add(20, 6);
        itemsRecFromGoldItem.add(5, 7);
        itemsRecFromGoldItem.add(1, 8);
        itemsRecFromGoldItem.add(0.05, 9);

        itemsRecFromGoldItem.add(40, 277);
        itemsRecFromGoldItem.add(5, 161);
        itemsRecFromGoldItem.add(10, 186);
        itemsRecFromGoldItem.add(0.5, 823);
        itemsRecFromGoldItem.add(10, 895);
        itemsRecFromGoldItem.add(2, 158);
        itemsRecFromGoldItem.add(0.5, 827);
        itemsRecFromGoldItem.add(0.5, 828);
        itemsRecFromGoldItem.add(1, 437);

        itemsRecFromGoldItem.add(3, 177);
        itemsRecFromGoldItem.add(1, 682);
        itemsRecFromGoldItem.add(0.1, 435);
        itemsRecFromGoldItem.add(3, 712);
        itemsRecFromGoldItem.add(20, 822);

        itemsRecFromGoldItem.add(40, 562);//tb than linh
        itemsRecFromGoldItem.add(40, 564);
        itemsRecFromGoldItem.add(40, 566);
        itemsRecFromGoldItem.add(40, 354);
        itemsRecFromGoldItem.add(0.1, 936);
        itemsRecFromGoldItem.add(0.1, 295);
        itemsRecFromGoldItem.add(0.08, 296);
        itemsRecFromGoldItem.add(0.05, 297);

        itemsRecFromGoldItem.add(0.01, 891);


        itemsRecFromGoldItem.add(1.5, 374);//cai trang
        itemsRecFromGoldItem.add(0.1, 555);
        itemsRecFromGoldItem.add(0.1, 298);
        itemsRecFromGoldItem.add(0.1, 431);
        itemsRecFromGoldItem.add(0.1, 519);

        itemsRecFromGoldItem.add(1, 284);//thoi trang
        itemsRecFromGoldItem.add(1, 309);
        itemsRecFromGoldItem.add(1, 848);
        itemsRecFromGoldItem.add(1, 972);
        itemsRecFromGoldItem.add(1, 989);

        itemsRecFromGoldItem.add(2, 706);//thuoc
        itemsRecFromGoldItem.add(2, 705);
        itemsRecFromGoldItem.add(2, 704);

        itemsRecFromGoldItem.add(10, 701);
        itemsRecFromGoldItem.add(10, 702);
        itemsRecFromGoldItem.add(10, 703);

        itemsRecFromGoldItem.add(20, 358);
        itemsRecFromGoldItem.add(20, 359);
        itemsRecFromGoldItem.add(20, 360);
        itemsRecFromGoldItem.add(5, 938);//ki can dau van
    }

    @Override
    public void initStore() {

    }

    @Override
    public void action(Char p, int type, int amount) {
        if (isEnded()) {
            p.serverMessage("Sự kiện đã kết thúc");
            return;
        }
        switch (type) {
            case MAKE_WATER_MELON_CAKE:
                makeWaterMelonCake(p, amount);
                break;
            case MAKE_DUA_CAKE:
                makeDuaCake(p, amount);
                break;
        }
    }

    private void makeWaterMelonCake(Char p, int amount) {
        int[][] itemRequires = new int[][]{{966, 5}, {967, 5}, {968, 5}, {969, 5}};
        int itemIdReceive = 964;
        makeEventItem(p, amount, itemRequires, 0, 75000, 0, itemIdReceive);
    }

    private void makeDuaCake(Char p, int amount) {
        int[][] itemRequires = new int[][]{{966, 5}, {967, 5}, {968, 5}, {970, 5}};
        int itemIdReceive = 965;
        makeEventItem(p, amount, itemRequires, 10, 0, 0, itemIdReceive);
    }

    @Override
    public void menu(Char p, int idNpc) {
        p.menus.clear();
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Làm kem dưa hấu", () -> {
            p.menus.clear();
            p.menus.add(new Menu(CMDMenu.EXECUTE, "1 cây", () -> {
                action(p, MAKE_WATER_MELON_CAKE, 1);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "10 cây", () -> {
                action(p, MAKE_WATER_MELON_CAKE, 10);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "100 cây", () -> {
                action(p, MAKE_WATER_MELON_CAKE, 100);
            }));
            p.getService().openUIMenu(idNpc);
        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Làm kem dừa", () -> {
            p.menus.clear();
            p.menus.add(new Menu(CMDMenu.EXECUTE, "1 cây", () -> {
                action(p, MAKE_DUA_CAKE, 1);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "10 cây", () -> {
                action(p, MAKE_DUA_CAKE, 10);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "100 cây", () -> {
                action(p, MAKE_DUA_CAKE, 100);
            }));
            p.getService().openUIMenu(idNpc);
        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Bảng xếp hạng kem", () -> {
            viewTop(p, TOP_MAKE_VAI_CAKE, "Bảng xếp hạng ăn kem", "%d. %s có %s điểm ăn kem");
        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Bảng xếp hạng săn Cell", () -> {
            viewTop(p, TOP_KILL_CELL, "Bảng xếp hạng săn Cell", "%d. %s có %s điểm săn Cell");
        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Phong ấn phù thủy(200 Zeni)", () -> {
            SummerEvent old = SummerEvent.findEventById(p.id);
            if (old != null && !old.isClosed()) {
                p.addWorld(old);
                old.joinZone(p);
                return;
            }
            if (p.zeni < 200) {
                p.serverMessage("Bạn không đủ Zeni");
                return;
            }
            if (p.getGroup() == null) {
                p.addZeni(-200, true);
                SummerEvent event = new SummerEvent();
                p.addWorld(event);
                event.joinZone(p);
                SummerEvent.addEvent(event);
            } else {
                if (p.getGroup().getIndexById(p.id) != 0) {
                    p.serverDialog("Phải là trưởng nhóm mới có thể mở phó bản");
                } else {
                    List<Char> chars = p.getGroup().getCharsInZone(p.zone.map.id, p.zone.id);
                    if (chars.size() < p.getGroup().getNumberMember()) {
                        p.serverDialog("Vui lòng tập hợp đủ thành viên trước khi tham gia");
                        return;
                    }
                    for (Char _char : chars) {
                        if (_char != null && !_char.isCleaned && _char != p && !_char.isDead) {
                            if (_char.zeni < 200) {
                                p.serverDialog("Chiến binh " + _char.name + " không có đủ 200 zeni");
                                return;
                            }
                        }
                    }
                    SummerEvent event = new SummerEvent();
                    SummerEvent.addEvent(event);
                    for (Char _char : chars) {
                        try {
                            if (_char != null && !_char.isCleaned && !_char.isDead) {
                                _char.addZeni(-200, true);
                                _char.addWorld(event);
                                event.joinZone(_char);
                            }
                        } catch (Exception e) {

                        }
                    }
                }
            }
        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Săn Cell MAX", () -> {
            if (p.clan == null) {
                p.serverDialog("Bạn phải có vũ trụ mới có thể tham gia");
                return;
            }
            p.joinZone(44, 0, 1);
        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Kiểm tra điểm Event", () -> {
            p.serverDialog("Bạn có " + p.getEventPoint().getPoint(TOP_MAKE_VAI_CAKE) + " điểm ăn kem và " + p.getEventPoint().getPoint(TOP_KILL_CELL) + " điểm săn Cell");
        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Quà điểm event", () -> {
            p.menus.clear();
            p.menus.add(new Menu(CMDMenu.EXECUTE, "Điểm kem", () -> {
                p.menus.clear();
                p.menus.add(new Menu(CMDMenu.EXECUTE, "20.000 Điểm", () -> {
                    if(p.getEventPoint().getPoint(TOP_MAKE_VAI_CAKE)<20000){
                        p.serverDialog("Bạn không đủ điểm");
                        return;
                    }
                    if (p.moc1) {
                        p.serverDialog("Bạn đã nhận quà rồi");
                        return;
                    }
                    if(p.getSlotNull() == 0){
                        p.warningBagFull();
                        return;
                    }
                    p.moc1= true;
                    Item item = new Item(936);
                    item.setLock(false);
                    item.setQuantity(20);
                    p.addItemToBag(item);
                    p.getService().addItem(item);
                }));
                p.menus.add(new Menu(CMDMenu.EXECUTE, "40.000 Điểm", () -> {
                    if(p.getEventPoint().getPoint(TOP_MAKE_VAI_CAKE)<40000){
                        p.serverDialog("Bạn không đủ điểm");
                        return;
                    }
                    if (p.moc2) {
                        p.serverDialog("Bạn đã nhận quà rồi");
                        return;
                    }
                    if(p.getSlotNull() == 0){
                        p.warningBagFull();
                        return;
                    }
                    p.moc2= true;
                    Item item = new Item(460);
                    item.setLock(false);
                    item.strOption="376,12,-1;379,12,-1;377,12,-1;327,62,62";
                    item.setQuantity(1);
                    Item item2 = new Item(1100);
                    item2.setLock(false);
                    item2.setQuantity(1);
                    p.addItemToBag(item);
                    p.addItemToBag(item2);
                    p.getService().addItem(item);
                    p.getService().addItem(item2);
                }));
                p.menus.add(new Menu(CMDMenu.EXECUTE, "80.000 Điểm", () -> {
                    if(p.getEventPoint().getPoint(TOP_MAKE_VAI_CAKE)<80000){
                        p.serverDialog("Bạn không đủ điểm");
                        return;
                    }
                    if (p.moc3) {
                        p.serverDialog("Bạn đã nhận quà rồi");
                        return;
                    }
                    if(p.getSlotNull() == 0){
                        p.warningBagFull();
                        return;
                    }
                    p.moc3= true;
                    Item item = new Item(918);
                    item.setLock(false);
                    item.strOption="0,3000;1,3000;2,350;5,350;258,350;151,350;167,350;297,50";
                    item.setQuantity(1);
                    p.addItemToBag(item);
                    p.getService().addItem(item);
                }));
                p.getService().openUIMenu(idNpc);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "Điểm Cell", () -> {
                p.menus.clear();
                p.menus.add(new Menu(CMDMenu.EXECUTE, "10.000 Điểm", () -> {
                    if(p.getEventPoint().getPoint(TOP_KILL_CELL)<10000){
                        p.serverDialog("Bạn không đủ điểm");
                        return;
                    }
                    if (p.moc4) {
                        p.serverDialog("Bạn đã nhận quà rồi");
                        return;
                    }
                    if(p.getSlotNull() == 0){
                        p.warningBagFull();
                        return;
                    }
                    p.moc4= true;
                    Item item = new Item(936);
                    item.setLock(false);
                    item.setQuantity(20);
                    p.addItemToBag(item);
                    p.getService().addItem(item);
                }));
                p.menus.add(new Menu(CMDMenu.EXECUTE, "20.000 Điểm", () -> {
                    if(p.getEventPoint().getPoint(TOP_KILL_CELL)<20000){
                        p.serverDialog("Bạn không đủ điểm");
                        return;
                    }
                    if (p.moc5) {
                        p.serverDialog("Bạn đã nhận quà rồi");
                        return;
                    }
                    if(p.getSlotNull() == 0){
                        p.warningBagFull();
                        return;
                    }
                    p.moc5= true;
                    Item item = new Item(460);
                    item.setLock(false);
                    item.strOption="376,12,-1;379,12,-1;377,12,-1;327,62,62";
                    item.setQuantity(1);
                    Item item2 = new Item(1100);
                    item2.setLock(false);
                    item2.setQuantity(1);
                    p.addItemToBag(item);
                    p.addItemToBag(item2);
                    p.getService().addItem(item);
                    p.getService().addItem(item2);
                }));
                p.menus.add(new Menu(CMDMenu.EXECUTE, "40.000 Điểm", () -> {
                    if(p.getEventPoint().getPoint(TOP_KILL_CELL)<40000){
                        p.serverDialog("Bạn không đủ điểm");
                        return;
                    }
                    if(p.getSlotNull() == 0){
                        p.warningBagFull();
                        return;
                    }
                    if (p.moc6) {
                        p.serverDialog("Bạn đã nhận quà rồi");
                        return;
                    }
                    p.moc6= true;
                    Item item = new Item(918);
                    item.setLock(false);
                    item.strOption="0,3000;1,3000;2,350;5,350;258,350;151,350;167,350;297,50";
                    item.setQuantity(1);
                    p.addItemToBag(item);
                    p.getService().addItem(item);
                }));
                p.getService().openUIMenu(idNpc);
            }));
            p.getService().openUIMenu(idNpc);
        }));
    }

    @Override
    public void initMap(Zone zone) {

    }

    @Override
    public void useItem(Char p, Item item) {
        switch (item.id) {
            case 964:
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                useEventItem(p, item.id, itemsRecFromGoldItem);
                p.getEventPoint().addPoint(SumMer.TOP_MAKE_VAI_CAKE, 1);
                break;
            case 965:
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                useEventItem(p, item.id, itemsRecFromGoldItem);
                p.getEventPoint().addPoint(SumMer.TOP_MAKE_VAI_CAKE, 2);
                break;
        }
    }
}
