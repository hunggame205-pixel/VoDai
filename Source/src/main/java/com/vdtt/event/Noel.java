package com.vdtt.event;

import com.vdtt.data.CMDMenu;
import com.vdtt.event.eventpoint.EventPoint;
import com.vdtt.item.Item;
import com.vdtt.map.world.GiaiCuuNoel;
import com.vdtt.map.world.SummerEvent;
import com.vdtt.map.zones.Zone;
import com.vdtt.model.Char;
import com.vdtt.model.Menu;
import com.vdtt.model.RandomItem;
import com.vdtt.server.GlobalService;
import com.vdtt.util.VDTTUtlis;

import java.util.Calendar;
import java.util.List;

public class Noel extends Event{

    public static final String TOP_NOEL = "top_noel";

    private static final int QUA_NOEL_NHO = 0;
    private static final int QUA_NOEL_LON = 1;

    public Noel() {
        setId(Event.NOEL);
        endTime.set(2026, Calendar.DECEMBER, 31, 23, 59, 59);
        itemsThrownFromMonsters.add(99,-1);
        keyEventPoint.add(TOP_NOEL);
        keyEventPoint.add(EventPoint.DIEM_TIEU_XAI);

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
            case QUA_NOEL_NHO:
                makeNoelNho(p, amount);
                break;
            case QUA_NOEL_LON:
                makeNoelLon(p, amount);
                break;
        }
    }

    private void makeNoelNho(Char p, int amount) {
        int[][] itemRequires = new int[][]{{547, 5}};
        int itemIdReceive = 576;
        makeEventItem(p, amount, itemRequires, 0, 250000, 0, itemIdReceive);
    }
    private void makeNoelLon(Char p, int amount) {
        int[][] itemRequires = new int[][]{{547, 10}};
        int itemIdReceive = 577;
        makeEventItem(p, amount, itemRequires, 50, 0, 0, itemIdReceive);
    }
    @Override
    public void useItem(Char p, Item item) {
        switch (item.id) {
            case 576:
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                p.addCoin(VDTTUtlis.nextInt(50000,100000),true);
                p.removeItem(item.index,1,true);
                Item it = RandomItem.TUI_MU_NHO.next().clone();
                it.initExpire();
                p.addItemToBag(it);
                p.getService().addItem(it);
                p.getEventPoint().addPoint(TOP_NOEL, 1);
                if (p.itemIsAlert(it.id)) {
                    GlobalService.getInstance().chat("Hệ thống", "Chúc mừng c#item" + p.name + "c#white đã nhận được " + it.getTemplate().name + " từ "+item.template.name, (byte) 1);
                }
                break;
            case 577:
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                p.addCoin(VDTTUtlis.nextInt(100000,200000),true);
                p.removeItem(item.index,1,true);
                Item it2 = RandomItem.TUI_MU_LON.next().clone();
                it2.initExpire();
                p.addItemToBag(it2);
                p.getService().addItem(it2);
                p.getEventPoint().addPoint(TOP_NOEL, 2);
                if (p.itemIsAlert(it2.id)) {
                    GlobalService.getInstance().chat("Hệ thống", "Chúc mừng c#item" + p.name + "c#white đã nhận được " + it2.getTemplate().name + " từ "+item.template.name, (byte) 1);
                }
                break;
        }
    }

    @Override
    public void menu(Char p, int idNpc) {
        if (isEnded()) {
            p.serverMessage("Sự kiện đã kết thúc");
            return;
        }
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Làm Quà giáng sinh nhỏ", () -> {
            p.menus.clear();
            p.menus.add(new Menu(CMDMenu.EXECUTE, "1 cái", () -> {
                action(p, QUA_NOEL_NHO, 1);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "10 cái", () -> {
                action(p, QUA_NOEL_NHO, 10);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "100 cái", () -> {
                action(p, QUA_NOEL_NHO, 100);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "Hướng dẫn", () -> {
                p.getService().sendTextNPC("Để làm 1 Quà giáng sinh nhỏ, bạn cần 5 hộp đồ chơi và 250.000 Ballz","");
            }));
            p.getService().openUIMenu(idNpc);
        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Làm Quà giáng sinh lớn", () -> {
            p.menus.clear();
            p.menus.add(new Menu(CMDMenu.EXECUTE, "1 cái", () -> {
                action(p, QUA_NOEL_LON, 1);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "10 cái", () -> {
                action(p, QUA_NOEL_LON, 10);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "100 cái", () -> {
                action(p, QUA_NOEL_LON, 100);
            }));
            p.menus.add(new Menu(CMDMenu.EXECUTE, "Hướng dẫn", () -> {
                p.getService().sendTextNPC("Để làm 1 Quà giáng sinh lớn, bạn cần 10 hộp đồ chơi và 50 Zeni","");
            }));
            p.getService().openUIMenu(idNpc);
        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Đổi ngọc rồng Noel", () -> {
            p.menus.clear();

            // Ngọc rồng 1 sao
            p.menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng 1 sao", () -> {
                if (p.ballZ < 10000 || !p.removeItems(930, 100)) {
                    p.getService().sendTextNPC("Cần 10.000 Ballz, 100 bông tuyết đổi được ngọc rồng 1 sao", "");
                    return;
                }
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                p.addBallz(-10000, true);
                addDragonBall(p, 1210);
            }));

            // Ngọc rồng 2 sao
            p.menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng 2 sao", () -> {
                if (p.ballZ < 20000 || !p.removeItems(930, 200)) {
                    p.getService().sendTextNPC("Cần 20.000 Ballz, 200 bông tuyết đổi được ngọc rồng 2 sao", "");
                    return;
                }
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                p.addBallz(-20000, true);
                addDragonBall(p, 1211);
            }));

            // Ngọc rồng 3 sao
            p.menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng 3 sao", () -> {
                if (p.ballZ < 30000 || !p.removeItems(930, 300)) {
                    p.getService().sendTextNPC("Cần 30.000 Ballz, 300 bông tuyết đổi được ngọc rồng 3 sao", "");
                    return;
                }
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                p.addBallz(-30000, true);
                addDragonBall(p, 1212);
            }));

            // Ngọc rồng 4 sao
            p.menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng 4 sao", () -> {
                if (p.ballZ < 40000 || !p.removeItems(930, 400)) {
                    p.getService().sendTextNPC("Cần 40.000 Ballz, 400 bông tuyết đổi được ngọc rồng 4 sao", "");
                    return;
                }
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                p.addBallz(-40000, true);
                addDragonBall(p, 1213);
            }));

            // Ngọc rồng 5 sao
            p.menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng 5 sao", () -> {
                if (p.ballZ < 50000 || !p.removeItems(930, 500)) {
                    p.getService().sendTextNPC("Cần 50.000 Ballz, 500 bông tuyết đổi được ngọc rồng 5 sao", "");
                    return;
                }
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                p.addBallz(-50000, true);
                addDragonBall(p, 1214);
            }));

            // Ngọc rồng 6 sao
            p.menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng 6 sao", () -> {
                if (p.ballZ < 60000 || !p.removeItems(930, 600)) {
                    p.getService().sendTextNPC("Cần 60.000 Ballz, 600 bông tuyết đổi được ngọc rồng 6 sao", "");
                    return;
                }
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                p.addBallz(-60000, true);
                addDragonBall(p, 1215);
            }));

            // Ngọc rồng 7 sao
            p.menus.add(new Menu(CMDMenu.EXECUTE, "Ngọc rồng 7 sao", () -> {
                if (p.ballZ < 70000 || !p.removeItems(930, 700)) {
                    p.getService().sendTextNPC("Cần 70.000 Ballz, 700 bông tuyết đổi được ngọc rồng 7 sao", "");
                    return;
                }
                if (p.getSlotNull() == 0) {
                    p.warningBagFull();
                    return;
                }
                p.addBallz(-70000, true);
                addDragonBall(p, 1216);
            }));
            p.getService().openUIMenu(idNpc);
        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Giải cứu ông già Noel (200 Zeni)", () -> {
            GiaiCuuNoel old = GiaiCuuNoel.get(p.id);
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
                p.serverDialog("Bạn cần gia nhập nhóm để tham gia phó bản");
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
                    GiaiCuuNoel event = new GiaiCuuNoel();
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
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Bảng xếp hạng Noel", () -> {
            viewTop(p, TOP_NOEL, "Bảng xếp hạng Noel", "%d. %s có %s điểm ");
        }));
    }

    @Override
    public void initMap(Zone zone) {

    }
    private void addDragonBall(Char p, int itemId) {
        Item item = new Item(itemId);
        item.setLock(true);
        p.addItemToBag(item);
        p.getService().addItem(item);
        p.getService().updateIndexBag();
    }
}
