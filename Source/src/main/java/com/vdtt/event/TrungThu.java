package com.vdtt.event;

import com.vdtt.data.CMDMenu;
import com.vdtt.event.eventpoint.EventPoint;
import com.vdtt.item.Item;
import com.vdtt.map.zones.Zone;
import com.vdtt.model.Char;
import com.vdtt.model.Menu;

import java.util.Calendar;

public class TrungThu extends Event{
    public static final String TOP_MAKE_CAKE = "make_cake";
    public static final String TOP_KILL_BOSS = "kill_boss";

    private static final int BANH_DAU_XANH = 0;
    private static final int BANH_THAP_CAM = 1;

    public TrungThu() {
        setId(Event.TRUNG_THU);
        endTime.set(2025, Calendar.NOVEMBER, 15, 23, 59, 59);
        itemsThrownFromMonsters.add(5, 537);
        itemsThrownFromMonsters.add(5, 538);
        itemsThrownFromMonsters.add(2, 539);
        itemsThrownFromMonsters.add(2, 542);
//        itemsThrownFromMonsters.add(100, -1);
        keyEventPoint.add(EventPoint.DIEM_TIEU_XAI);
        keyEventPoint.add(TOP_MAKE_CAKE);
        keyEventPoint.add(TOP_KILL_BOSS);

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


        itemsRecFromGoldItem.add(0.05, 555);//caitrang
        itemsRecFromGoldItem.add(0.05, 298);
        itemsRecFromGoldItem.add(0.05, 431);
        itemsRecFromGoldItem.add(0.05, 519);
        itemsRecFromGoldItem.add(0.5, 1050);
        itemsRecFromGoldItem.add(0.5, 1051);

        itemsRecFromGoldItem.add(1, 284);//thoi trang
        itemsRecFromGoldItem.add(1, 309);
        itemsRecFromGoldItem.add(1, 848);
        itemsRecFromGoldItem.add(1, 972);
        itemsRecFromGoldItem.add(1, 989);
        itemsRecFromGoldItem.add(1, 896);
        itemsRecFromGoldItem.add(1, 897);
        itemsRecFromGoldItem.add(1, 898);
        itemsRecFromGoldItem.add(1, 136);//thoitrang detu


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

        itemsRecFromGoldItem.add(50, 546);//long den
        itemsRecFromGoldItem.add(8, 940);//đuôi khỉ
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
            case BANH_DAU_XANH:
                makeDauXanh(p, amount);
                break;
            case BANH_THAP_CAM:
                makeThapCam(p, amount);
                break;
        }
    }

    private void makeThapCam(Char p, int amount) {
        int[][] itemRequires = new int[][]{{537, 10}, {538, 10}, {539, 10}, {542, 10}};
        int itemIdReceive = 545;
        makeEventItem(p, amount, itemRequires, 15, 0, 0, itemIdReceive);
    }

    private void makeDauXanh(Char p, int amount) {
        int[][] itemRequires = new int[][]{{537, 10}, {538, 10}, {542, 10}};
        int itemIdReceive = 544;
        makeEventItem(p, amount, itemRequires, 0, 150000, 0, itemIdReceive);
    }

    @Override
    public void menu(Char p, int idNpc) {
        p.menus.clear();
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Làm bánh đậu xanh", () -> {
            p.menus.clear();
            p.menus.add(new Menu(CMDMenu.EXECUTE, "1 cái", () -> {
                action(p, BANH_DAU_XANH, 1);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "10 cái", () -> {
                action(p, BANH_DAU_XANH, 10);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "100 cái", () -> {
                action(p, BANH_DAU_XANH, 100);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "Hướng dẫn", () -> {
                p.getService().sendTextNPC("Để làm 1 bánh đậu xanh, bạn cần 10 bột gạo, 10 đậu xanh và 10 đường và 150.000 Ballz","");
            }));
            p.getService().openUIMenu(idNpc);
        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Làm bánh thập cẩm", () -> {
            p.menus.clear();
            p.menus.add(new Menu(CMDMenu.EXECUTE, "1 cái", () -> {
                action(p, BANH_THAP_CAM, 1);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "10 cái", () -> {
                action(p, BANH_THAP_CAM, 10);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "100 cái", () -> {
                action(p, BANH_THAP_CAM, 100);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "Hướng dẫn", () -> {
                p.getService().sendTextNPC("Để làm 1 bánh thập cẩm, bạn cần 10 bột gạo, 10 đậu xanh, 10 đường và 10 trứng muối và 15 Zeni","");
            }));
            p.getService().openUIMenu(idNpc);
        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Đổi lồng đèn", () -> {
            p.menus.clear();
            p.menus.add(new Menu(CMDMenu.EXECUTE, "20 Đá linh hồn (100 Lồng Đèn)", () -> {
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                int index = p.getIndexItemByIdInBag(546);
                if (index == -1) {
                    p.serverDialog("Bạn không có lồng đèn");
                    return;
                }
                if(p.bag[index].getQuantity() < 100){
                    p.serverDialog("Bạn còn thiếu " + (100 - p.bag[index].getQuantity()) + " lồng đèn");
                    return;
                }
                p.removeItem(index, 100,true);
                Item da = new Item(353);
                da.setLock(false);
                da.setQuantity(20);
                p.addItemToBag(da);
                p.getService().addItem(da);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "1 Đá 10 (100 Lồng Đèn)", () -> {
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                int index = p.getIndexItemByIdInBag(546);
                if (index == -1) {
                    p.serverDialog("Bạn không có lồng đèn");
                    return;
                }
                if(p.bag[index].getQuantity() < 100){
                    p.serverDialog("Bạn còn thiếu " + (100 - p.bag[index].getQuantity()) + " lồng đèn");
                    return;
                }
                p.removeItem(index, 100,true);
                Item da = new Item(9);
                da.setLock(false);
                da.setQuantity(1);
                p.addItemToBag(da);
                p.getService().addItem(da);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "Cải trang Broly (2500 Lồng Đèn)", () -> {
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                int index = p.getIndexItemByIdInBag(546);
                if (index == -1) {
                    p.serverDialog("Bạn không có lồng đèn");
                    return;
                }
                if(p.bag[index].getQuantity() < 2500){
                    p.serverDialog("Bạn còn thiếu " + (2500 - p.bag[index].getQuantity()) + " lồng đèn");
                    return;
                }
                p.removeItem(index, 2500,true);
                Item item = new Item(460);
                item.setLock(false);
                item.strOption="376,12,-1;379,12,-1;377,12,-1;327,62,62";
                item.setQuantity(1);
                p.addItemToBag(item);
                p.getService().addItem(item);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "1 Thẻ đệ (500 Lồng Đèn)", () -> {
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                int index = p.getIndexItemByIdInBag(546);
                if (index == -1) {
                    p.serverDialog("Bạn không có lồng đèn");
                    return;
                }
                if(p.bag[index].getQuantity() < 500){
                    p.serverDialog("Bạn còn thiếu " + (500 - p.bag[index].getQuantity()) + " lồng đèn");
                    return;
                }
                p.removeItem(index, 500,true);
                Item item = new Item(891);
                item.setLock(false);
                item.setQuantity(1);
                p.addItemToBag(item);
                p.getService().addItem(item);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "Sách 8 sao (1000 Lồng Đèn)", () -> {
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                int index = p.getIndexItemByIdInBag(546);
                if (index == -1) {
                    p.serverDialog("Bạn không có lồng đèn");
                    return;
                }
                if(p.bag[index].getQuantity() < 1000){
                    p.serverDialog("Bạn còn thiếu " + (1000 - p.bag[index].getQuantity()) + " lồng đèn");
                    return;
                }
                p.removeItem(index, 1000,true);
                Item item = new Item(1100);
                item.setLock(false);
                item.setQuantity(1);
                p.addItemToBag(item);
                p.getService().addItem(item);
            }));

            p.menus.add(new Menu(CMDMenu.EXECUTE, "Sách chiến đấu (150 Lồng Đèn)", () -> {
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                int index = p.getIndexItemByIdInBag(546);
                if (index == -1) {
                    p.serverDialog("Bạn không có lồng đèn");
                    return;
                }
                if(p.bag[index].getQuantity() < 150){
                    p.serverDialog("Bạn còn thiếu " + (150 - p.bag[index].getQuantity()) + " lồng đèn");
                    return;
                }
                p.removeItem(index, 150,true);
                Item item = new Item(435);
                item.setLock(false);
                item.setQuantity(1);
                p.addItemToBag(item);
                p.getService().addItem(item);
            }));

            p.menus.add(new Menu(CMDMenu.EXECUTE, "Thời trang SSJ5 (10.000 Lồng Đèn)", () -> {
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                int index = p.getIndexItemByIdInBag(546);
                if (index == -1) {
                    p.serverDialog("Bạn không có lồng đèn");
                    return;
                }
                if(p.bag[index].getQuantity() < 10000){
                    p.serverDialog("Bạn còn thiếu " + (10000 - p.bag[index].getQuantity()) + " lồng đèn");
                    return;
                }
                p.removeItem(index, 10000,true);
                Item item = new Item(918);
                item.setLock(false);
                item.strOption="0,3000;1,3000;2,350;5,350;258,350;151,350;167,350;297,50";
                item.setQuantity(1);
                p.addItemToBag(item);
                p.getService().addItem(item);
            }));

            p.getService().openUIMenu(idNpc);
        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Kiểm tra điểm Event", () -> {
            p.serverDialog("Bạn có " + p.getEventPoint().getPoint(TOP_MAKE_CAKE) + " điểm mở bánh và " + p.getEventPoint().getPoint(TOP_KILL_BOSS) + " điểm săn boss");
        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Bảng xếp hạng mở bánh", () -> {
            viewTop(p, TOP_MAKE_CAKE, "Bảng xếp hạng mở bánh", "%d. %s có %s điểm mở bánh");
        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Bảng xếp hạng săn Boss", () -> {
            viewTop(p, TOP_KILL_BOSS, "Bảng xếp hạng săn Boss", "%d. %s có %s điểm săn boss");
        }));
    }

    @Override
    public void initMap(Zone zone) {

    }
    @Override
    public void useItem(Char p, Item item) {
        switch (item.id) {
            case 544:
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                useEventItem(p, item.id, itemsRecFromGoldItem);
                p.getEventPoint().addPoint(TOP_MAKE_CAKE, 1);
                break;
            case 545:
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                useEventItem(p, item.id, itemsRecFromGoldItem);
                p.getEventPoint().addPoint(TOP_MAKE_CAKE, 2);
                break;
        }
    }
}
