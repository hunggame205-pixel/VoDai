package com.vdtt.admin;

import com.vdtt.data.CMDInputDialog;
import com.vdtt.data.CMDMenu;
import com.vdtt.data.DataCenter;
import com.vdtt.data.SQLStatement;
import com.vdtt.db.DbManager;
import com.vdtt.effect.Effect;
import com.vdtt.event.FideTrungThu;
import com.vdtt.item.Item;
import com.vdtt.item.ItemOption;
import com.vdtt.map.GiaiDauSucManh;
import com.vdtt.map.Map;
import com.vdtt.map.MapManager;
import com.vdtt.map.VoDaiSucManh;
import com.vdtt.map.item.ItemMap;
import com.vdtt.map.item.ItemMapFactory;
import com.vdtt.map.world.*;
import com.vdtt.mob.Mob;
import com.vdtt.model.Char;
import com.vdtt.model.InputDialog;
import com.vdtt.model.Menu;
import com.vdtt.model.User;
import com.vdtt.network.Message;
import com.vdtt.server.Server;
import com.vdtt.server.ServerManager;
import com.vdtt.server.SpawnBossManager;
import com.vdtt.server.VDTT;
import com.vdtt.skill.Skill;
import com.vdtt.skill.SkillFactory;
import com.vdtt.util.Log;
import com.vdtt.util.VDTTUtlis;
import org.json.simple.JSONArray;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdminService {

    private static final AdminService instance = new AdminService();

    public static AdminService getInstance() {
        return instance;
    }


    public void openUIAdmin(Char p, int npcid) {
        p.menus.clear();
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Đi tới", () -> {

        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Thông tin", () -> {
            showServerInfo(p);
        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Bảo trì", () -> {
            VDTTUtlis.setTimeout(() -> {
                Server.maintance();
                System.exit(0);
            }, 0);
        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Lưu dữ liệu", () -> {
            VDTTUtlis.setTimeout(() -> {
                Server.saveAll();
                p.serverDialog("Đã lưu dữ liệu!");
            }, 0);
        }));
        p.menus.add(new Menu(CMDMenu.EXECUTE, "Kick User", () -> {
            InputDialog input = new InputDialog(CMDInputDialog.EXECUTE, "Nhập username", () -> {
                try {
                    String name = p.getInput().getText();
                    if(name.isEmpty()) {
                        p.serverDialog("Tên không được để trống!");
                        return;
                    }
                    User user = ServerManager.findUserByUsername(name);
                    if(user == null) {
                        p.serverDialog("Không tìm thấy người chơi!");
                        return;
                    }
                    if(!user.isCleaned){
                        user.session.closeMessage();
                    }
                } catch (Exception e) {
                    Log.error("err: " + e.getMessage(), e);
                }
            });
            p.setInput(input);
            p.getService().showInputDialog();
        }));
        p.getService().openUIMenu(npcid);
    }
    public void chat(Char p,String str){
        try {
            if (p.user.isAdmin) {
if (p.user.isAdmin && str.equalsIgnoreCase("admin")) {
    openUIAdmin(p, 0);
    return;
}

if (str.startsWith("admin ")) {
    String[] arr = str.split(" ");
    if (arr.length < 2) {
        p.serverDialog("Dùng: admin <số>");
        return;
    }

    int select;
    try {
        select = Integer.parseInt(arr[1]);
    } catch (Exception e) {
        p.serverDialog("Số không hợp lệ");
        return;
    }

    switch (select) {
        case 1:
            // Võ đài sức mạnh
            VoDaiSucManh.initDauTruong();
            p.serverDialog("Đã mở Võ Đài Sức Mạnh");
            break;

        case 2:
            // Giải đấu sức mạnh
            GiaiDauSucManh.initDauTruong();
            p.serverDialog("Đã mở Giải Đấu Sức Mạnh");
            break;

        case 3:
            // Spawn boss (dùng y nguyên code cũ)
            SpawnBossManager.getInstance().spawnRandom(SpawnBossManager.FIDE);
            SpawnBossManager.getInstance().spawnRandom(SpawnBossManager.TUONG_LAI);
            SpawnBossManager.getInstance().spawnRandom(SpawnBossManager.VAMPA);
            SpawnBossManager.getInstance().spawnRandom(SpawnBossManager.NAMEC);
            SpawnBossManager.getInstance().spawnRandom(SpawnBossManager.YARDAT);
            SpawnBossManager.getInstance().spawnRandom(SpawnBossManager.ZAMASU);
            SpawnBossManager.getInstance().spawnRandom(SpawnBossManager.HOANG_MAC);
            p.serverDialog("Đã spawn boss");
            break;

        case 4:
            // Buff vật phẩm (ví dụ)
            Item item = new Item(872);
            item.setQuantity(1);
            p.addItemToBag(item);
            p.getService().addItem(item);
            p.serverDialog("Đã buff vật phẩm");
            break;

        default:
            p.serverDialog("Lựa chọn không tồn tại");
    }
    return;
}

                if (str.startsWith("map ")) {
                    String arr[] = str.split(" ");
                    int mapid = Integer.parseInt(arr[1]);
                    MapManager.getInstance().joinZone(p, mapid, 0, 1);
                } else if (str.contains("vd")) {
                    VoDaiSucManh.initDauTruong();
                } else if (str.equals("gdsm")) {
                    GiaiDauSucManh.initDauTruong();
                } else if (str.contains("capcha")) {
                    p.getService().sendCaptcha();
                } else if (str.contains("saoden")) {
                    MapManager.getInstance().saoDen = new SaoDen();
                } else if (str.contains("doanhtrai")) {
                    DoanhTrai doanhTrai = new DoanhTrai(p.level());
                    p.addWorld(doanhTrai);
                    doanhTrai.joinMap(p);
                } else if (str.startsWith("join")) {
                    MapManager.getInstance().GDSM.join(p, 0);
                } else if (str.equals("nro")) {
//                    for (int i = 0; i < 7; i++) {
//                        Item item = new Item(901 + i);
//                        item.setQuantity(1);
//                        item.setLock(true);
//                        p.addItemToBag(item);
//                        p.getService().addItem(item);
//                    }
                } else if (str.contains("point")) {
                    p.body[10].updateSucManh(100000);
                    p.getService().updateItemBody(p.body[10]);
    //                } else if (str.contains("add")) {
    //                    xy[identity][0] = x;
    //                    xy[identity][1] = y;
    //                    identity++;
    //                } else if (str.contains("show")) {
    //                    StringBuilder result = new StringBuilder();
    //                    for (int i = 0; i < xy.length; i++) {
    //                        result.append("{").append(xy[i][0]).append(",").append(xy[i][1]).append("}");
    //                        if (i < xy.length - 1) {
    //                            result.append(","); // Thêm dấu phẩy giữa các tọa độ, không thêm ở cuối
    //                        }
    //                    }
    //                    System.out.println(result.toString());
                } else if (str.startsWith("eff")) {
                    short idEff = Short.parseShort(str.split(" ")[1]);
                    Effect eff = new Effect(idEff, 500000, 10);
                    p.getEm().setEffect(eff);
                } else if (str.contains("check")) {
                    p.getService().serverDialog("X " + p.x + " Y" + p.y);
                } else if (str.startsWith("noel")) {
                    GiaiCuuNoel noel = new GiaiCuuNoel();
                    p.addWorld(noel);
                    noel.joinZone(p);
                } else if (str.startsWith("i")) {
                    String arr[] = str.split(" ");
                    short id = Short.parseShort(arr[1]);
                    short quantity = Short.parseShort(arr[2]);
                    Item item = new Item(id);
                    item.setQuantity(quantity);
                    p.addItemToBag(item);
                    p.getService().addItem(item);
                } else if (str.startsWith("skill ")) {
                    String arr[] = str.split(" ");
                    short id = Short.parseShort(arr[1]);
                    Skill skill = SkillFactory.getInstance().getSkill(id, 1);
                    p.addSkill(skill);
                    p.getService().updateSkill();
                } else if (str.startsWith("sm")) {
                    String arr[] = str.split(" ");
                    long var = Long.parseLong(arr[1]);
                    p.KI += var;
                    p.exp += var;
                    p.getService().showKI();
                    p.getService().showKI(p);
                } else if (str.contains("clear")) {
                    p.bag = new Item[p.numberCellBag];
                    p.getService().updateIndexBag();
                } else if (str.contains("resetskill")) {
                    p.skills.clear();
                    p.skills = SkillFactory.getInstance().getSkillByClass(p.sys);
                    p.getService().updateSkill();
                } else if (str.contains("itemm")) {
                    Item item = new Item(2, true, 1);
                    ItemMap itemMap = new ItemMap((short) 1);
                    itemMap.setItem(item);
                    itemMap.setX(p.x);
                    itemMap.setY(p.y);
                    itemMap.setOwnerID(p.id);
                    p.zone.addItemMap(itemMap);
                    p.zone.getService().addItemMap(itemMap, p);
                } else if (str.startsWith("setlv")) {
                    String arr[] = str.split(" ");
                    int lv = Integer.parseInt(arr[1]);
                    p.exp = DataCenter.gI().getLevel(lv);
                    p.getService().showKI();
                    p.getService().showKI(p);
                } else if (str.contains("zoom")) {
                    TimeZoom timeZoom = new TimeZoom(p.level(), (byte) 0);
                    timeZoom.joinZone(p);
                    p.addWorld(timeZoom);
                } else if (str.contains("sizemob")) {
                    p.serverDialog("Size mob: " + p.zone.getMonsters().size());
                } else if (str.contains("boss")) {
                    SpawnBossManager.getInstance().spawnRandom(SpawnBossManager.FIDE);
                    SpawnBossManager.getInstance().spawnRandom(SpawnBossManager.TUONG_LAI);
                    SpawnBossManager.getInstance().spawnRandom(SpawnBossManager.VAMPA);
                    SpawnBossManager.getInstance().spawnRandom(SpawnBossManager.NAMEC);
                    SpawnBossManager.getInstance().spawnRandom(SpawnBossManager.YARDAT);
                    SpawnBossManager.getInstance().spawnRandom(SpawnBossManager.ZAMASU);
                    SpawnBossManager.getInstance().spawnRandom(SpawnBossManager.HOANG_MAC);
                } else if (str.contains("detu")) {
                    Item item = new Item(872);
                    Vector<ItemOption> options = new Vector<>();
                    options.add(new ItemOption(285, 100, 40));
                    options.add(new ItemOption(407, 0, 1));
                    options.add(new ItemOption(0, 200));
                    options.add(new ItemOption(152, 10));
                    options.add(new ItemOption(327, 50, 1));
                    options.add(new ItemOption(327, 53, 1));
                    options.add(new ItemOption(327, 54, 1));
                    options.add(new ItemOption(327, 30, 1));
                    options.add(new ItemOption(327, 3, -1));
                    options.add(new ItemOption(327, -1, 1));
                    options.add(new ItemOption(327, -1, 1));
                    options.add(new ItemOption(327, -1, 1));
                    options.add(new ItemOption(327, -1, 1));
                    options.add(new ItemOption(327, -1, 1));
                    options.add(new ItemOption(327, -1, 1));
                    options.add(new ItemOption(327, -1, 1));
                    options.add(new ItemOption(327, -1, 1));
                    options.add(new ItemOption(327, -1, 1));
                    item.strOption = Item.creatOption(options);
                    p.addItemToBag(item);
                    p.getService().addItem(item);
                } else if (str.contains("mailz")) {
                    p.serverDialog("size" + DbManager.getInstance().getMail(p.name).size());
                } else if (str.startsWith("upsm")) {
                    long var = Long.parseLong(str.split(" ")[1]);
                    p.pet.addEXP(var);
                } else if (str.contains("nguctu")) {
                    NgucTuThuThach ngucTu = new NgucTuThuThach();
                    p.addWorld(ngucTu);
                    ngucTu.join(p);
                } else if (str.startsWith("addmob")) {
                    short id = Short.parseShort(str.split(" ")[1]);
                    Mob mob = p.zone.createBoss(id, 1000, (short) 10, p.x, p.y, 1000);
                    mob.zone = p.zone;
                    p.zone.addMob(mob);
                } else if (str.startsWith("gui")) {
                    byte type = Byte.parseByte(str.split(" ")[1]);
                //    Log.debug("type: " + type);
                    Message m = new Message((byte) 122);
                    m.writer().writeByte(type);
                    m.writeUTF("test");
                    m.writer().writeShort(4);
                    p.getService().sendMessage(m);
                    m.cleanup();
                } else if (str.equals("save")) {
                    JSONArray mob = new JSONArray();
                    for (Mob m : p.zone.monsters) {
                        mob.add(m.toJSON());
                    }
                    FileWriter file = new FileWriter(p.zone.map.id+".json");
                    file.write(mob.toJSONString());
                    file.flush();
                } else if (str.contains("hell")) {
                    Hell hell = new Hell(p.getTypeSucManh());
                    p.addWorld(hell);
                    hell.joinZone(p);
                } else if (str.contains("maxplayer")) {
                    p.serverDialog("Max player: " + p.zone.map.getMaxPlayer(p.zone));
                } else if (str.startsWith("uoc")) {
                    int id = Integer.parseInt(str.split(" ")[1]);
                    Message m = new Message((byte) -45);
                    m.writer().writeShort(id);
                    m.writer().writeShort(p.x);
                    m.writer().writeShort(p.y);
                    m.writer().writeByte(-24);
                    p.getService().sendMessage(m);
                }
            }
        } catch (IOException e) {
            Log.error("chat admin err: " + e.getMessage(), e);
        }
    }

    private void showServerInfo(Char p) {
        long total, free, used;
        double mb = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime();
        total = runtime.totalMemory();
        free = runtime.freeMemory();
        used = total - free;
        StringBuilder sb = new StringBuilder();
        sb.append("- Số người đang online: ").append(ServerManager.getNumberOnline()).append("\n");
        sb.append("- Memory usage (JVM): ")
                .append(String.format("%.1f/%.1f MB (%d%%)", used / mb, total / mb, (used * 100 / total))).append("\n");
        p.getService().serverDialog(sb.toString());
    }
}
