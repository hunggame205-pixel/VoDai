package com.vdtt.item;

import com.vdtt.data.DataCenter;
import com.vdtt.network.Message;
import com.vdtt.util.ParseData;
import com.vdtt.util.VDTTUtlis;
import lombok.Getter;
import lombok.Setter;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Getter
@Setter
public class Item implements Cloneable {
    public int id;
    public int index;
    protected int quantity;
    public long expire;
    public byte sys;
    public boolean isLock;
    public byte upgrade;
    public String strOption;
    public String nameCreate;
    public ItemTemplate template;
    protected long updatedAt;
    protected long createdAt;
    public String optionGhepCaiTrang = "";
    public boolean isBug;
    public List<Integer> skills = new ArrayList<>();

    public Item(int id) {
        this.id = id;
        this.init();
        this.quantity = 1;
        this.upgrade = 0;
        this.sys = 0;
        this.strOption = "";
        this.isLock = false;
        this.expire = -1;
        this.nameCreate = "";
        if (this.id >= 1155 && this.id <= 1157) {
            setOptionVuKhiMount();
        }
        if (this.id >= 1158 && this.id <= 1160) {
            setOptionTrangBiMount();
        }
        if (this.id >= 1161 && this.id <= 1163) {
            setOptionPhuKienMount();
        }
        if (this.id >= 1164 && this.id <= 1166) {
            setOptionVuKhiMountCaoCap();
        }
        if (this.id >= 1167 && this.id <= 1169) {
            setOptionTrangBiMountCaoCap();
        }
        if (this.id >= 1170 && this.id <= 1172) {
            setOptionPhuKienMountCaoCap();
        }
        if (this.id == 1180) {// Thỏ ngọc
            strOption = "413,0,10000;2,200,-1;5,100,-1;258,200,-1;278,300,-1;0,1000,-1";
        }
        if (this.id == 1152) {// ấu long cổ
            strOption = "413,0,10000;2,400,-1;5,200,-1;258,400,-1;278,500,-1;0,1500,-1";
        }

        if (this.id == 1184) {// phb
            strOption = "413,0,10000;2,400,-1;5,200,-1;258,400,-1;278,500,-1;0,1500,-1";
        }

        if (this.id == 1187) {// tuần lộc
            strOption = "413,0,10000;2,400,-1;5,200,-1;258,400,-1;278,500,-1;0,1500,-1";
        }
        if (this.id == 430  ){
            strOption = "215,95,0;0,1000,-1;1,500,-1;2,500,-1";
        }
        if (this.id == 1176) {// gà con
            strOption = "413,0,10000;2,50,-1;5,20,-1;258,50,-1;278,80,-1;0,200,-1";
        }
        if (this.id == 1177) {// gà con
            this.upgrade = 6;
            strOption = "413,0,70000;2,200,-1;5,170,-1;258,200,-1;278,380,-1;0,800,-1";
        }
        if (this.id == 1178) {// gà con
            this.upgrade = 12;
            strOption = "413,0,130000;2,350,-1;5,320,-1;258,350,-1;278,530,-1;0,1400,-1";
        }
        if (this.id == 1178) {// gà con
            this.upgrade = 12;
            strOption = "413,0,130000;2,350,-1;5,320,-1;258,350,-1;278,530,-1;0,1400,-1";
        }


        if (this.id == 1181) {// gà con hung dữ
            strOption = "413,0,10000;2,50,-1;5,20,-1;258,50,-1;278,80,-1;0,200,-1";
        }
        if (this.id == 1182) {
            this.upgrade = 6;
            strOption = "413,0,70000;2,200,-1;5,170,-1;258,200,-1;278,380,-1;0,800,-1";
        }
        if (this.id == 1183) {
            this.upgrade = 12;
            strOption = "413,0,130000;2,350,-1;5,320,-1;258,350,-1;278,530,-1;0,1400,-1";
        }
    }

    public Item() {
    }

    public Item(int var1, boolean var2) {
        this.id = (short) var1;
        this.init();
        this.isLock = var2;
    }

    public Item(int var1, boolean var2, int var3) {
        this.id = (short) var1;
        this.init();
        this.isLock = var2;
        this.quantity = var3;
    }

    public void saveHeader(JSONObject obj) {
        obj.put("id", this.id);
        obj.put("expire", this.expire);
        obj.put("updated_at", this.updatedAt);
        obj.put("created_at", this.createdAt);
    }

    public void loadHeader(ParseData parse) {
        this.id = parse.getInt("id");
        this.expire = parse.getLong("expire");
        this.createdAt = this.updatedAt = System.currentTimeMillis();

    }

    public JSONObject toJSONObject() {
        JSONObject obj = new JSONObject();
        saveHeader(obj);
        obj.put("isLock", this.isLock);
        obj.put("index", this.index);
        if (this.isTrangBi() || this.ai()) {
            obj.put("sys", this.sys);
            obj.put("upgrade", this.upgrade);
            obj.put("strOption", this.strOption);
        } else if (this.strOption != null && !this.strOption.isEmpty()) {
            obj.put("strOption", strOption);
        }
        if (this.optionGhepCaiTrang != null && !this.optionGhepCaiTrang.isEmpty()) {
            obj.put("optionGhepCaiTrang", optionGhepCaiTrang);
        }
        if (this.template.isXepChong) {
            obj.put("quantity", this.quantity);
        }
        return obj;
    }

//    public JSONObject toJSONObject() {
//        JSONObject obj = new JSONObject();
//        obj.put("id", this.id);
//        obj.put("index", this.index);
//        obj.put("quantity", this.quantity);
//        obj.put("expire", this.expire);
//        obj.put("sys", this.sys);
//        obj.put("isLock", this.isLock);
//        obj.put("upgrade", this.upgrade);
//        obj.put("strOption", this.strOption);
//        obj.put("nameCreate", this.nameCreate);
//        obj.put("optionGhepCaiTrang", this.optionGhepCaiTrang);
//        return obj;
//    }

    public Item(JSONObject obj) {
        ParseData parse = new ParseData(obj);
        loadHeader(parse);
        init();
        this.nameCreate = "";
        this.strOption = "";
        try {
            this.index = parse.getInt("index");
        } catch (Exception e) {

        }
        this.isLock = parse.getBoolean("isLock");

        if (this.isTrangBi() || this.ai()) {
            this.sys = parse.getByte("sys");
            this.upgrade = parse.getByte("upgrade");
            this.strOption = parse.getString("strOption");
        } else if (parse.containsKey("strOption")) {
            this.strOption = parse.getString("strOption");
        } else {
            this.upgrade = 0;
        }
        if (parse.containsKey("optionGhepCaiTrang")) {
            this.optionGhepCaiTrang = parse.getString("optionGhepCaiTrang");
        }
        if (this.template.isXepChong) {
            if (parse.containsKey("quantity")) {
                this.quantity = parse.getInt("quantity");
            } else {
                this.quantity = 1;
            }
        } else {
            this.quantity = 1;
        }
        init();
        if (id >= 1025 && id <= 1036) {
            this.setLock(true);
        }
//        if ((id == 833 || (id >= 799 && id <= 805)) && quantity > 1) {
//            isBug = true;
//        }
        if (id == 160) {
            this.isLock = true;
        }
        if (template.type == 17) {
            loadSKill();
        }
        checkBugOption();
    }

    private void loadSKill() {
        if (strOption == null || strOption.isEmpty()) {
            return;
        }
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions == null) {
            return;
        }
        for (ItemOption itemOption : itemOptions) {
            if (itemOption.getId() == 327) {
                skills.add(itemOption.getParam());
            }
        }
    }

    private void checkBugOption() {
        try {
            if (strOption == null || strOption.isEmpty()) {
                return;
            }
            if (getTemplate().type == 0) {
                if (strOption.contains("481,6")) {
                    strOption = strOption.replace("481,6", "481,5");
                }
            }
            if (getTemplate().type == 2 || getTemplate().type == 4 || getTemplate().type == 6 || getTemplate().type == 8) {
                int upgrade = this.getUpgrade();
                upgradeItem(0);
                ItemOption[] itemOptions = getItemOption();
                List<Integer> idAdd = new ArrayList<>();
                if (itemOptions != null) {
                    Vector<ItemOption> newOption = new Vector<>();
                    for (ItemOption itemOption : itemOptions) {
                        if (itemOption.getId() == 0) {
                            itemOption.option[0] = 335;
                            itemOption.option[1] = 150;
                        } else if (itemOption.getId() == 1) {
                            itemOption.option[0] = 336;
                            itemOption.option[1] = 150;
                        } else if (itemOption.getId() == 2) {
                            itemOption.option[0] = 341;
                            itemOption.option[1] = 50;
                        } else if (itemOption.getId() == 3) {
                            itemOption.option[0] = 342;
                            itemOption.option[1] = 50;
                        }
                        if (itemOption.getItemOptionTemplate().type != 17) {
                            if (idAdd.contains(itemOption.getId())) {
                                continue;
                            }
                            idAdd.add(itemOption.getId());
                        }

                        newOption.add(itemOption);
                    }
                    strOption = creatOption(newOption);
                    upgradeItem(upgrade);
                }
            }
            if (getTemplate().type == 0) {
                ItemOption[] itemOptions = getItemOption();
                if (itemOptions != null) {
                    Vector<ItemOption> newOption = new Vector<>();
                    for (ItemOption itemOption : itemOptions) {
                        if (itemOption.getId() == 481) {
                            if (itemOption.option[2] < System.currentTimeMillis() / 1000) {
                                continue;
                            }
                        }
                        newOption.add(itemOption);
                    }
                    strOption = creatOption(newOption);
                }
            }
        } catch (Exception e) {

        }
    }

    public void init() {
        this.template = ItemManager.getInstance().getItemTemplate(id);
    }

    public Item clone() {
        try {
            Item var1;
            var1 = (Item) super.clone();
            return var1;
        } catch (Exception var2) {
            return null;
        }
    }

    public void write(Message m) {
        try {
            m.writer().writeShort(id);
            if (this.id >= 0) {
                m.writer().writeBoolean(isLock);
                m.writer().writeLong(expire);
                if (!this.isTrangBi() && !this.ai()) {
                    m.writer().writeInt(quantity);
                } else {
                    m.writer().writeByte(sys);
                    m.writer().writeByte(upgrade);
                    m.writeUTF(strOption);
                    m.writeUTF(nameCreate == null ? "" : nameCreate);
                }
                if (this.aA()) {
                    m.writeUTF(strOption);
                }
                m.writer().writeShort(index);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean aA() {
        return this.getTemplate().type == 99 || this.getTemplate().type == 35 || this.getTemplate().type == 36 || this.getTemplate().type == 37;
    }

    public boolean isTrangBi() {
        if (this.ai()) {
            return false;
        } else {
            for (int var1 = 0; var1 < DataCenter.gI().dataTypeBody.length; ++var1) {
                if (DataCenter.gI().dataTypeBody[var1] == this.getTemplate().type) {
                    return true;
                }
            }

            return false;
        }
    }

    public int getPrice() {
        ItemOption[] var1 = this.L();
        int var2 = 0;
        if (this.isTrangBi() && var1 != null) {
            var2 = 0 + var1.length;
        }

        if (this.getTemplate().type == 34) {
            var2 = 100000;
        }

        if (this.id == 185) {
            var2 = 50000;
        }

        if (this.id == 186) {
            var2 = 100000;
        } else if (this.id == 187) {
            var2 = 200000;
        }
        return var2;
    }

    public boolean ai() {
        return (this.id >= 799 && this.id <= 806) || (this.template.type >= 17 && this.template.type <= 20);
    }

    public boolean hasExpire() {
        return !isForever();
    }

    public boolean isForever() {
        return this.expire == -1;
    }

    public boolean has() {
        return has(1);
    }

    public void add(int amount) {
        this.quantity += amount;
        this.updatedAt = System.currentTimeMillis();
    }

    public boolean has(int amount) {
        return this.quantity >= amount;
    }

    public void reduce(int amount) {
        this.quantity -= amount;
        this.updatedAt = System.currentTimeMillis();
    }

    public boolean isExpired() {
        return this.expire != -1 && this.expire < System.currentTimeMillis();
    }

    public final int M() {
        if (this.id == 190) {
            return this.quantity / 10;
        } else if (this.id == 826) {
            return this.quantity <= 0 ? 0 : this.quantity - 1;
        } else {
            return this.quantity <= 0 ? 1 : this.quantity;
        }
    }

    public boolean replaceOption(ItemOption op) {
        ItemOption[] itemOptions = getItemOption();
        boolean done = false;
        Vector<ItemOption> newOption = new Vector<>();
        for (int i = 0; i < itemOptions.length; i++) {
            if (itemOptions[i].getItemOptionTemplate().type == op.getItemOptionTemplate().type) {
                done = true;
                newOption.add(op);
                continue;
            }
            newOption.add(itemOptions[i]);
        }
        strOption = creatOption(newOption);
        return done;
    }

    public void creatItemOptionTrangBi() {
        List<ItemOptionTemplate> list = ItemManager.getInstance().optionTemplates;
        int id_ChiSoGoc = 349;
        List<ItemOptionTemplate> listChiSoGoc = list.stream().filter(item -> item.type == 17).collect(Collectors.toList());
        int[][] arrayChiSo = new int[][]{
                new int[]{50, 400},
                new int[]{50, 400},
                new int[]{5, 100},
                new int[]{5, 100},
                new int[]{5, 100},
                new int[]{5, 100},
                new int[]{5, 50},
                new int[]{5, 100},
                new int[]{5, 10},
                new int[]{5, 10},
                new int[]{20, 50},};
        int id_KichEpSao = 350;
        List<ItemOptionTemplate> list1sao = list.stream().filter(item -> item.type == 19).collect(Collectors.toList());
        List<ItemOptionTemplate> list2sao = list.stream().filter(item -> item.type == 3).collect(Collectors.toList());
        List<ItemOptionTemplate> list3sao = list.stream().filter(item -> item.type == 11).collect(Collectors.toList());
        List<ItemOptionTemplate> list4sao = list.stream().filter(item -> item.type == 4).collect(Collectors.toList());
        List<ItemOptionTemplate> list5sao = list.stream().filter(item -> item.type == 12).collect(Collectors.toList());
        List<ItemOptionTemplate> list6sao = list.stream().filter(item -> item.type == 5).collect(Collectors.toList());
        List<ItemOptionTemplate> list7sao = list.stream().filter(item -> item.type == 6 && item.id > 39).collect(Collectors.toList());
        List<ItemOptionTemplate> list8sao = list.stream().filter(item -> item.type == 7).collect(Collectors.toList());
        List<ItemOption> itemOptions = new ArrayList<>();
        itemOptions.add(new ItemOption(349, 0));
        for (int i = 0; i < 4; i++) {
            int rand = VDTTUtlis.nextInt(0, listChiSoGoc.size() - 1);
            int id = listChiSoGoc.get(rand).id;
            int value = VDTTUtlis.nextInt(arrayChiSo[rand][0], arrayChiSo[rand][1]);
            itemOptions.add(new ItemOption(id, value));
        }
        itemOptions.add(new ItemOption(350, 0));
        int[][][] arrayEpSao_ = new int[][][]{
                new int[][]{
                        new int[]{50, 100},
                        new int[]{10, 25},
                        new int[]{10, 25},},
                new int[][]{
                        new int[]{10, 50},
                        new int[]{10, 50},
                        new int[]{10, 50},
                        new int[]{10, 50},
                        new int[]{10, 50},
                        new int[]{10, 50},
                        new int[]{10, 50},
                        new int[]{10, 50},
                        new int[]{10, 50},},
                new int[][]{
                        new int[]{50, 200},
                        new int[]{50, 200},
                        new int[]{50, 200},
                        new int[]{50, 200},},
                new int[][]{
                        new int[]{50, 200},
                        new int[]{50, 200},
                        new int[]{50, 200},
                        new int[]{50, 200},
                        new int[]{50, 200},
                        new int[]{50, 200},},
                new int[][]{
                        new int[]{20, 40},
                        new int[]{20, 40},
                        new int[]{20, 40},
                        new int[]{20, 40}
                },
                new int[][]{
                        new int[]{5, 10},
                        new int[]{5, 10},
                        new int[]{5, 10},
                        new int[]{5, 10},
                        new int[]{5, 10},
                        new int[]{5, 10},
                        new int[]{5, 10},
                        new int[]{5, 10},
                        new int[]{5, 10}
                }, new int[][]{
                new int[]{50, 100},
                new int[]{50, 100},
                new int[]{50, 100},
                new int[]{50, 100},
                new int[]{50, 100},
                new int[]{50, 100},
                new int[]{50, 100},
                new int[]{50, 100},
                new int[]{50, 100}
        },
                new int[][]{},
                new int[][]{},
                new int[][]{},
                new int[][]{},
                new int[][]{},
                new int[][]{},
                new int[][]{}

        };
        List[] listArray = new List[]{
                list1sao,
                list2sao,
                list3sao,
                list4sao,
                list5sao,
                list6sao,
                list7sao,};
        ItemOptionTemplate[] arrayEpSao = new ItemOptionTemplate[]{
                list1sao.get(VDTTUtlis.nextInt(0, list1sao.size() - 1)),
                list2sao.get(VDTTUtlis.nextInt(0, list2sao.size() - 1)),
                list3sao.get(VDTTUtlis.nextInt(0, list3sao.size() - 1)),
                list4sao.get(VDTTUtlis.nextInt(0, list4sao.size() - 1)),
                list5sao.get(VDTTUtlis.nextInt(0, list5sao.size() - 1)),
                list6sao.get(VDTTUtlis.nextInt(0, list6sao.size() - 1)),
                list7sao.get(VDTTUtlis.nextInt(0, list7sao.size() - 1))
        };
        for (int i = 0; i < template.levelNeed; i++) {
            int[] array = arrayEpSao_[i][listArray[i].indexOf(arrayEpSao[i])];
            itemOptions.add(new ItemOption(arrayEpSao[i].id, VDTTUtlis.nextInt(array[0], array[1])));
        }
        this.strOption = creatOption(itemOptions.toArray(new ItemOption[0]));
    }

    public void createOptionRandom(int num, int num2) {
        List<ItemOptionTemplate> list = ItemManager.getInstance().optionTemplates;
        int id_ChiSoGoc = 349;
        List<ItemOptionTemplate> listChiSoGoc = list.stream().filter(item -> item.type == 17).collect(Collectors.toList());
        int[][] arrayChiSo = new int[][]{
                new int[]{50, 400},
                new int[]{50, 400},
                new int[]{5, 100},
                new int[]{5, 100},
                new int[]{5, 100},
                new int[]{5, 100},
                new int[]{5, 50},
                new int[]{5, 100},
                new int[]{5, 10},
                new int[]{5, 10},
                new int[]{20, 50},};
        int id_KichEpSao = 350;
        List<ItemOptionTemplate> list1sao = list.stream().filter(item -> item.type == 19).collect(Collectors.toList());
        List<ItemOptionTemplate> list2sao = list.stream().filter(item -> item.type == 3).collect(Collectors.toList());
        List<ItemOptionTemplate> list3sao = list.stream().filter(item -> item.type == 11).collect(Collectors.toList());
        List<ItemOptionTemplate> list4sao = list.stream().filter(item -> item.type == 4).collect(Collectors.toList());
        List<ItemOptionTemplate> list5sao = list.stream().filter(item -> item.type == 12).collect(Collectors.toList());
        List<ItemOptionTemplate> list6sao = list.stream().filter(item -> item.type == 5).collect(Collectors.toList());
        List<ItemOptionTemplate> list7sao = list.stream().filter(item -> item.type == 6 && item.id > 39).collect(Collectors.toList());
        List<ItemOptionTemplate> list8sao = list.stream().filter(item -> item.type == 7).collect(Collectors.toList());
        List<ItemOption> itemOptions = new ArrayList<>();
        itemOptions.add(new ItemOption(349, 0));
        for (int i = 0; i < num; i++) {
            int rand = VDTTUtlis.nextInt(0, listChiSoGoc.size() - 1);
            int id = listChiSoGoc.get(rand).id;
            int value = VDTTUtlis.nextInt(arrayChiSo[rand][0], arrayChiSo[rand][1]);
            itemOptions.add(new ItemOption(id, value));
        }
        itemOptions.add(new ItemOption(350, 0));
        int[][][] arrayEpSao_ = new int[][][]{
                new int[][]{
                        new int[]{50, 100},
                        new int[]{10, 25},
                        new int[]{10, 25},
                        new int[]{10, 25},},
                new int[][]{
                        new int[]{10, 50},
                        new int[]{10, 50},
                        new int[]{10, 50},
                        new int[]{10, 50},
                        new int[]{10, 50},
                        new int[]{10, 50},
                        new int[]{10, 50},
                        new int[]{10, 50},
                        new int[]{10, 50},},
                new int[][]{
                        new int[]{50, 200},
                        new int[]{50, 200},
                        new int[]{50, 200},
                        new int[]{50, 200},},
                new int[][]{
                        new int[]{50, 200},
                        new int[]{50, 200},
                        new int[]{50, 200},
                        new int[]{50, 200},
                        new int[]{50, 200},
                        new int[]{50, 200},},
                new int[][]{
                        new int[]{20, 40},
                        new int[]{20, 40},
                        new int[]{20, 40},
                        new int[]{20, 40}
                },
                new int[][]{
                        new int[]{5, 10},
                        new int[]{5, 10},
                        new int[]{5, 10},
                        new int[]{5, 10},
                        new int[]{5, 10},
                        new int[]{5, 10},
                        new int[]{5, 10},
                        new int[]{5, 10},
                        new int[]{5, 10}
                }, new int[][]{
                new int[]{50, 100},
                new int[]{50, 100},
                new int[]{50, 100},
                new int[]{50, 100},
                new int[]{50, 100},
                new int[]{50, 100},
                new int[]{50, 100},
                new int[]{50, 100},
                new int[]{50, 100}
        },
                new int[][]{},
                new int[][]{},
                new int[][]{},
                new int[][]{},
                new int[][]{},
                new int[][]{},
                new int[][]{}

        };
        List[] listArray = new List[]{
                list1sao,
                list2sao,
                list3sao,
                list4sao,
                list5sao,
                list6sao,
                list7sao,};
        ItemOptionTemplate[] arrayEpSao = new ItemOptionTemplate[]{
                list1sao.get(VDTTUtlis.nextInt(0, list1sao.size() - 1)),
                list2sao.get(VDTTUtlis.nextInt(0, list2sao.size() - 1)),
                list3sao.get(VDTTUtlis.nextInt(0, list3sao.size() - 1)),
                list4sao.get(VDTTUtlis.nextInt(0, list4sao.size() - 1)),
                list5sao.get(VDTTUtlis.nextInt(0, list5sao.size() - 1)),
                list6sao.get(VDTTUtlis.nextInt(0, list6sao.size() - 1)),
                list7sao.get(VDTTUtlis.nextInt(0, list7sao.size() - 1))
        };
        for (int i = 0; i < num2; i++) {
            int[] array = arrayEpSao_[i][listArray[i].indexOf(arrayEpSao[i])];
            itemOptions.add(new ItemOption(arrayEpSao[i].id, VDTTUtlis.nextInt(array[0], array[1])));
        }
        this.strOption = creatOption(itemOptions.toArray(new ItemOption[0]));
    }

    public final boolean isTauBay() {
        return this.id == 168 || d(this.id);
    }
//

    public static boolean d(int var0) {
        if (var0 == 569 || var0 >= 716 && var0 <= 720) {
            return true;
        } else {
            return false;
        }
    }

    public void createOption() {
        try {
            if (getTemplate().type == 0) {
                return;
            }
            // Lấy các ItemOption từ phương thức getItemOption()
            ItemOption[] itemOptions = getItemOption();

            // Kiểm tra null để đảm bảo itemOptions không phải là null
            if (itemOptions == null) {
                // Xử lý trường hợp itemOptions là null, có thể là log hoặc ném ngoại lệ
                return;
            }

            // Tạo một danh sách để lưu trữ các ItemOption đã được xử lý
            List<ItemOption> list = new ArrayList<>();

            // Duyệt qua từng ItemOption trong mảng
            for (ItemOption op : itemOptions) {
                // Nếu chiều dài của mảng option lớn hơn 2
                if (op.option.length > 2) {
                    // Lấy giá trị min và max từ mảng option
                    int min = op.option[1];
                    int max = op.option[2];

                    // Tạo một ItemOption mới với giá trị ngẫu nhiên giữa min và max
                    ItemOption _op = new ItemOption(op.option[0], VDTTUtlis.nextInt(min, max));

                    // Thêm ItemOption mới vào danh sách
                    list.add(_op);
                } else {
                    // Nếu không, thêm ItemOption gốc vào danh sách
                    list.add(op);
                }
            }

            // Chuyển đổi danh sách thành mảng và gán cho strOption
            this.strOption = creatOption(list.toArray(new ItemOption[0]));
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

    public void upgradeItem(int var1) {
        ItemOption[] var2;
        if ((var2 = this.L()) != null) {
            int var3;
            int var4;
            int[] var5;
            if (var1 >= this.upgrade) {
                for (var3 = this.upgrade + 1; var3 <= var1; ++var3) {
                    for (var4 = 0; var4 < var2.length; ++var4) {
                        if (var2[var4].getItemOptionTemplate().type != 8) {
                            var5 = var2[var4].getItemOptionTemplate().getOption();
                            if (var3 <= var5.length) {
                                var2[var4].d(var5[var3 - 1]);
                            }
                        }
                    }
                }
            } else {
                for (var3 = this.upgrade; var3 > var1; --var3) {
                    for (var4 = 0; var4 < var2.length; ++var4) {
                        if (var2[var4].getItemOptionTemplate().type != 8) {
                            var5 = var2[var4].getItemOptionTemplate().getOption();
                            if (var3 <= var5.length) {
                                var2[var4].d(-var5[var3 - 1]);
                            }
                        }
                    }
                }
            }
        }

        this.upgrade = (byte) var1;
        this.strOption = creatOption(var2);
    }

    public final ItemOption[] L() {
        if (this.strOption != null && this.strOption.length() > 0) {
            String[] var1;
            ItemOption[] var2 = new ItemOption[(var1 = VDTTUtlis.a(this.strOption, ";")).length];

            for (int var3 = 0; var3 < var1.length; ++var3) {
                var2[var3] = new ItemOption(var1[var3]);
            }

            return var2;
        } else {
            return null;
        }
    }

    public static String creatOption(ItemOption[] var0) {
        String var1 = "";
        if (var0 != null) {
            for (int var2 = 0; var2 < var0.length; ++var2) {
                var1 = var1 + var0[var2].g();
                if (var2 < var0.length - 1) {
                    var1 = var1 + ";";
                }
            }
        }

        return var1;
    }

    public static String creatOption(Vector var0) {
        ItemOption[] var1 = new ItemOption[var0.size()];

        for (int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = (ItemOption) var0.get(var2);
        }

        return creatOption(var1);
    }

    public final ItemOption a(Vector var1, int var2) {
        var2 = ItemOption.f(var2);
        ItemOption[] var3 = this.L();
        ItemOption var4 = null;
        if (var3 != null) {
            for (int var5 = 0; var5 < var3.length; ++var5) {
                if (var3[var5].getItemOptionTemplate().type == 8) {
                    var1.add(var3[var5]);
                    if (var3[var5].option[0] == var2) {
                        var4 = var3[var5];
                    }
                }
            }
        }

        return var4;
    }

    public final boolean u() {
        ItemOption[] var1;
        if (this.getTemplate().levelNeed >= 50 && (var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].option[0] == 159 || var1[var2].option[0] == 163 || var1[var2].option[0] == 164 || var1[var2].option[0] == 165) {
                    return true;
                }
            }
        }

        return false;
    }

    public final boolean U() {
        ItemOption[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].option[0] == 165 || var1[var2].option[0] == 164 || var1[var2].option[0] == 163 || var1[var2].option[0] == 159) {
                    return true;
                }
            }
        }

        return false;
    }

    public final int[] a(int var1, int var2) {
        ItemOption[] var3;
        if ((var3 = this.L()) == null) {
            return null;
        } else {
            int var4 = ItemOption.f(var2);
            int[] var5 = null;
            boolean var6 = this.U();

            for (int var7 = 0; var7 < var3.length; ++var7) {
                if (var3[var7].getItemOptionTemplate().type == 8 && var3[var7].option[0] == var4) {
                    int var8 = var3[var7].i();
                    (var5 = new int[4])[0] = var2;
                    var5[1] = var8;
                    var5[2] = var8;
                    int[] var9 = var3[var7].getItemOptionTemplate().getOption();

                    for (int var10 = var8 + 1; var10 <= var9.length; ++var10) {
                        if (var1 >= DataCenter.gI().ar[var10]) {
                            if (var6) {
                                if (var10 > 17) {
                                    continue;
                                }
                            } else if (var10 > 16) {
                                continue;
                            }

                            var5[1] = var8;
                            var5[2] = var10;
                            var5[3] += DataCenter.gI().ar[var10];
                            var1 -= DataCenter.gI().ar[var10];
                            var3[var7].d(var9[var10 - 1]);
                            var3[var7].option[3] = var10;
                        }
                    }
                }
            }

            this.strOption = creatOption(var3);
            return var5;
        }
    }

    public boolean isTypeWeapon() {
        return this.getTemplate().type == 1 && !this.ai();
    }

    public boolean isTypeClothe() {
        return this.getTemplate().type == 0 || this.getTemplate().type == 2 || this.getTemplate().type == 4 || this.getTemplate().type == 6 || this.getTemplate().type == 8;
    }

    public boolean isTypePet() {
        return this.getTemplate().type == 3 || this.getTemplate().type == 5 || this.getTemplate().type == 7 || this.getTemplate().type == 9;
    }

    public static void a(Vector var0, ItemOption var1) {
        for (int var2 = 0; var2 < var0.size(); ++var2) {
            if (((ItemOption) var0.get(var2)).option[0] == var1.option[0]) {
                ((ItemOption) var0.get(var2)).d(var1.option[1]);
                return;
            }
        }

        var0.add(var1);
    }

    public boolean isKham() {
        if (this.strOption.isEmpty() || this.strOption == null) {
            return false;
        }
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions != null) {
            for (ItemOption itemOption : itemOptions) {
                if (itemOption.getId() == 298 && itemOption.option[1] > 0) {
                    return true;
                }
            }
        }
        return false;
    }


    public ItemOption[] getItemOption() {
        if (strOption != null && strOption.length() > 0 && !strOption.isEmpty()) {
            String[] var1;
            ItemOption[] itemOption = new ItemOption[(var1 = VDTTUtlis.split(strOption, ";")).length];
            for (int var3 = 0; var3 < var1.length; ++var3) {
                try {
                    itemOption[var3] = new ItemOption(var1[var3]);
                } catch (Exception ex) {

                }
            }
            return itemOption;
        } else {
            return null;
        }
    }

    public boolean checkOptionByType(int i) {
        if (strOption.isEmpty() || strOption == null) {
            return false;
        }
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions != null) {
            for (ItemOption itemOption : itemOptions) {
                if (itemOption.getItemOptionTemplate().type == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addSM(long ki) {
        if (strOption.isEmpty() || strOption == null) {
            return;
        }
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions != null) {
            for (ItemOption itemOption : itemOptions) {
                if (itemOption.getId() == 285) {
                    itemOption.option[1] += ki;
                }
            }
            strOption = creatOption(itemOptions);
        }
    }


    public void addKI(long ki) {
        if (strOption.isEmpty() || strOption == null) {
            return;
        }
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions != null) {
            for (ItemOption itemOption : itemOptions) {
                if (itemOption.getId() == 407) {
                    itemOption.option[1] += ki;
                }
            }
            strOption = creatOption(itemOptions);
        }
    }

    public void updateGioiHan(int var) {
        if (strOption.isEmpty() || strOption == null) {
            return;
        }
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions != null) {
            for (ItemOption itemOption : itemOptions) {
                if (itemOption.getId() == 285) {
                    itemOption.option[2] += var;
                }
            }
            strOption = creatOption(itemOptions);
        }
    }

    public void replaceOption(ItemOption op, int index) {
        if (strOption.isEmpty() || strOption == null) {
            return;
        }
        int update = getUpgrade();
        upgradeItem(0);
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions != null) {
            int var = 0;
            for (int i = 0; i < itemOptions.length; i++) {
                if (itemOptions[i].getItemOptionTemplate().type == op.getItemOptionTemplate().type) {
                    if (var == index) {
                        itemOptions[i] = op;
                        break;
                    }
                    ++var;
                }
            }
            strOption = creatOption(itemOptions);
        }
        upgradeItem(update);
    }

    public void creatItemThan() {
        int[] optionId = new int[]{420, 421, 422, 424};
        Vector<ItemOption> itemOptions = new Vector<>();
        switch (getTemplate().type) {
            case 2:
                itemOptions.add(new ItemOption(63, VDTTUtlis.nextInt(200, 500)));
                itemOptions.add(new ItemOption(419, VDTTUtlis.nextInt(500, 2000)));
                itemOptions.add(new ItemOption(423, VDTTUtlis.nextInt(20, 50)));
                itemOptions.add(new ItemOption(425, VDTTUtlis.nextInt(1, 3)));
                break;
            case 8:
                itemOptions.add(new ItemOption(78, VDTTUtlis.nextInt(200, 500)));
                itemOptions.add(new ItemOption(192, VDTTUtlis.nextInt(1000, 2000)));
                itemOptions.add(new ItemOption(423, VDTTUtlis.nextInt(20, 50)));
                itemOptions.add(new ItemOption(425, VDTTUtlis.nextInt(1, 3)));
                break;
            case 4:
                itemOptions.add(new ItemOption(64, VDTTUtlis.nextInt(200, 500)));
                itemOptions.add(new ItemOption(419, VDTTUtlis.nextInt(500, 2000)));
                itemOptions.add(new ItemOption(423, VDTTUtlis.nextInt(20, 50)));
                itemOptions.add(new ItemOption(425, VDTTUtlis.nextInt(1, 3)));
                break;
            case 6:
                itemOptions.add(new ItemOption(65, VDTTUtlis.nextInt(200, 500)));
                itemOptions.add(new ItemOption(419, VDTTUtlis.nextInt(1000, 2000)));
                itemOptions.add(new ItemOption(423, VDTTUtlis.nextInt(20, 50)));
                itemOptions.add(new ItemOption(425, VDTTUtlis.nextInt(1, 3)));
                break;
        }
        itemOptions.add(new ItemOption(optionId[VDTTUtlis.nextInt(0, optionId.length - 1)], VDTTUtlis.nextInt(1, 3)));
        strOption = creatOption(itemOptions);
    }

    public boolean addPointTrangBiKichhoat(ItemOption op, int type) {
        if (strOption == null || strOption.isEmpty()) {
            return false;
        }

        boolean isAdd = false;
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions == null) {
            return false; // Check if itemOptions is null
        }

        final int MAX_OPTION_VALUE = 50;
        final int SPECIAL_OPTION_ID = 469;
        final int SPECIAL_MAX_OPTION_VALUE = 600;
        for (ItemOption itemOption : itemOptions) {
            if (itemOption.f() == op.getId() && itemOption.getId() == type) {
                if (itemOption.f() != SPECIAL_OPTION_ID && itemOption.option[1] >= MAX_OPTION_VALUE) {
                    return false;
                }
                if (itemOption.f() == SPECIAL_OPTION_ID && itemOption.option[1] >= SPECIAL_MAX_OPTION_VALUE) {
                    return false;
                }
                itemOption.option[1] += op.getParam();
                isAdd = true;
                break;
            }
        }

        if (isAdd) {
            strOption = creatOption(itemOptions);
        }

        return isAdd;
    }


    public boolean isChiSoGoc() {
        if (strOption == null || strOption.isEmpty()) {
            return false;
        }
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions != null) {
            for (ItemOption itemOption : itemOptions) {
                if (itemOption.getId() == 349) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addThoiTrangPet(int type) {
        if (strOption == null || strOption.isEmpty()) {
            return;
        }
        ItemOption[] itemOptions = getItemOption();
        Vector<ItemOption> newOption = new Vector<>();
        if (itemOptions != null) {
            for (int i = 0; i < itemOptions.length; i++) {
                ItemOption op = itemOptions[i];
                newOption.add(op);
                if (op.getId() == 285) {
                    if (itemOptions[i + 1].getId() != 481) {
                        newOption.add(new ItemOption(481, type, (int) ((System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7)) / 1000)));
                    } else if (itemOptions[i + 1].getId() == 481) {
                        if (Integer.MAX_VALUE - itemOptions[i + 1].option[2] > TimeUnit.DAYS.toMillis(7) / 1000) {
                            itemOptions[i + 1].option[2] += (int) (TimeUnit.DAYS.toMillis(7) / 1000);
                        } else {
                            itemOptions[i + 1].option[2] = Integer.MAX_VALUE;
                        }

                    }
                }
            }
            strOption = creatOption(newOption);
        }
    }

    public void addThoiTrangPetForEver(int type) {
        if (strOption == null || strOption.isEmpty()) {
            return;
        }
        ItemOption[] itemOptions = getItemOption();
        Vector<ItemOption> newOption = new Vector<>();
        if (itemOptions != null) {
            for (int i = 0; i < itemOptions.length; i++) {
                ItemOption op = itemOptions[i];
                newOption.add(op);
                if (op.getId() == 285) {
                    if (itemOptions[i + 1].getId() != 481) {
                        newOption.add(new ItemOption(481, type, Integer.MAX_VALUE));
                    } else if (itemOptions[i + 1].getId() == 481) {
                        itemOptions[i + 1].option[2] = Integer.MAX_VALUE;
                    }
                }
            }
            strOption = creatOption(newOption);
        }
    }

    public void initExpire() {
        if (getTemplate().type == 15) {
            expire = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(14);
            this.strOption = "0,2000,3500;2,200,350;5,200,350;167,200,350;297,20,35";
            createOption();
        }

        if (getTemplate().type == 14) {
            if (this.id == 374) {
                this.strOption = "327,89,89;379,8,16;2,100,200;0,1000,2000";
                createOption();
            }
            if (this.id == 555) {
                this.strOption = "327,88,88;379,8,8;2,120,120;0,1200,1200";
                createOption();
            }
            if (this.id == 298) {
                this.strOption = "327,58,58;380,8,8;2,130,130;0,1300,1300";
                createOption();
            }
            if (this.id == 431) {
                this.strOption = "327,48,48;380,8,8;2,140,140;0,1400,1400";
                createOption();
            }
            if (this.id == 519) {
                this.strOption = "327,59,59;380,8,8;2,150,150;0,1500,1500";
                createOption();
            }
            if (this.id == 1050) {
                this.strOption = "379,5,20;2,50,200;0,500,2000";
                createOption();
            }
            if (this.id == 1051) {
                this.strOption = "379,5,20;2,50,200;0,500,2000";
                createOption();
            }
            if (this.id == 1220) {
                this.strOption = "379,10,20;2,100,200;0,1000,2000";
                createOption();
            }
        }
        if (id == 136) {
            int[] optionId = new int[]{513, 514, 515, 519, 520, 525, 526, 523, 943, 941, 961, 962, 1050, 1050};
            int ids = optionId[VDTTUtlis.nextInt(0, optionId.length - 1)];
            strOption = "436," + ids + ",1;433," + VDTTUtlis.nextInt(150, 200) + ",-1";
            expire = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7);
        }
    }

    public void changeOptionCDV() {
        if (strOption == null || strOption.isEmpty()) {
            return;
        }
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions != null) {
            for (ItemOption itemOption : itemOptions) {
                if (itemOption.getId() == 161) {
                    itemOption.option[0] = 167;
                    break;
                }
                if (itemOption.getId() == 167) {
                    itemOption.option[0] = 161;
                    break;
                }
            }
            strOption = creatOption(itemOptions);
        }
    }

    public ItemOption getOptionByIdItem(int idItem) {
        try {
            if (getOptionGhepCaiTrang() != null && !getOptionGhepCaiTrang().isEmpty()) {
                String[] itemData = getOptionGhepCaiTrang().split("&");
                for (String str : itemData) {
                    String[] data = str.split("@");
                    if (data.length >= 2) { // Check array length to avoid ArrayIndexOutOfBoundsException
                        int itemId = Integer.parseInt(data[0]);
                        String strOption = data[1];
                        Item item1 = new Item(itemId);
                        item1.setStrOption(strOption);
                        if (item1.getId() == idItem) {
                            ItemOption[] itemOptions = item1.getItemOption();
                            if (itemOptions != null) {
                                for (ItemOption itemOption : itemOptions) {
                                    if (itemOption.getId() == 327) {
                                        return itemOption;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace(); // Log exception to help with debugging
        } catch (Exception e) {
            e.printStackTrace(); // Log exception to help with debugging
        }
        return null;
    }

    public void changeSkill(short idSkill) {
        if (strOption == null || strOption.isEmpty()) {
            return;
        }
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions == null) {
            return; // Add null check for itemOptions
        }
        boolean isOption327 = false;
        Vector<ItemOption> newOption = new Vector<>();
        for (ItemOption itemOption : itemOptions) {
            if (itemOption.getId() == 327) {
                ItemOption op = getOptionByIdItem(idSkill);
                if (op == null) {
                    return; // If the new option is not found, exit the method
                }
                isOption327 = true;
                newOption.add(op);
            } else {
                newOption.add(itemOption);
            }
        }
        if (!isOption327) {
            ItemOption op = getOptionByIdItem(idSkill);
            if (op == null) {
                return; // If the new option is not found, exit the method
            }
            newOption.add(op);
        }
        strOption = creatOption(newOption);
    }

    public void updateSucManh(int amount) {
        if (strOption == null || strOption.isEmpty()) {
            return;
        }
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions == null) {
            return; // Add null check for itemOptions
        }
        int power = 0;
        Vector<ItemOption> newOption = new Vector<>();
        for (ItemOption itemOption : itemOptions) {
            if (itemOption.getId() == 413) {
                itemOption.option[1] += amount;
                if (itemOption.option[1] >= itemOption.option[2]) {
                    itemOption.option[1] = itemOption.option[2];
                }
                power = itemOption.option[1];
            }
            newOption.add(itemOption);
        }
        strOption = creatOption(newOption);
        upgradeItem(power / 10000);
    }

    public void updateEXPPet(int amount) {
        if (strOption == null || strOption.isEmpty()) {
            return;
        }
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions == null) {
            return; // Add null check for itemOptions
        }
        Vector<ItemOption> newOption = new Vector<>();
        for (ItemOption itemOption : itemOptions) {
            if (itemOption.getId() == 413) {
                itemOption.option[1] += amount;
                if (itemOption.option[1] >= itemOption.option[2]) {
                    itemOption.option[1] = itemOption.option[2];
                }
            }
            newOption.add(itemOption);
        }
        strOption = creatOption(newOption);
    }

    public boolean isMaxSucManh() {
        if (strOption == null || strOption.isEmpty()) {
            return false;
        }
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions == null) {
            return false; // Add null check for itemOptions
        }
        for (ItemOption itemOption : itemOptions) {
            if (itemOption.getId() == 413) {
                if (itemOption.option[1] >= itemOption.option[2]) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public boolean optionSucManh() {
        if (strOption == null || strOption.isEmpty()) {
            return false;
        }
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions == null) {
            return false; // Add null check for itemOptions
        }
        for (ItemOption itemOption : itemOptions) {
            if (itemOption.getId() == 413) {
                return true;
            }
        }
        return false;
    }

    public void setOptionKichHoat() {
        if (getTemplate().type != 37) {
            return;
        }
        int idOption = 469;
        int param = 1;
        if (getTemplate().name.contains("Hp")) {
            param = 12;
            idOption = 469;
        } else if (getTemplate().name.contains("Chí mạng")) {
            idOption = 470;
        } else if (getTemplate().name.contains("Chính xác")) {
            idOption = 471;

        } else if (getTemplate().name.contains("Né tránh")) {
            idOption = 472;

        } else if (getTemplate().name.contains("Giáp")) {
            idOption = 473;

        }
        String input = String.format("%d,%d", idOption, param);
        strOption = input;
    }

    public boolean checkKichHoatSucManh() {
        if (strOption == null || strOption.isEmpty()) {
            return false;
        }
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions == null) {
            return false; // Add null check for itemOptions
        }
        int count = 0;
        ItemOption opKicHoat = null;
        int idActive = 0;
        Vector<ItemOption> newOption = new Vector<>();
        for (ItemOption itemOption : itemOptions) {
            if (itemOption.getId() != 464) {
                if (itemOption.f() != 469) {
                    if (itemOption.getParam() >= 50) {
                        count++;
                    }
                } else {
                    if (itemOption.getParam() >= 600) {
                        count++;
                    }
                }
                idActive = itemOption.f();
                newOption.add(itemOption);
            } else {
                opKicHoat = itemOption;
            }
        }
        if (count >= 4) {
            if (opKicHoat == null) {
                if (idActive == 469) {
                    newOption.add(new ItemOption(464, 2400, idActive));
                } else
                    newOption.add(new ItemOption(464, 200, idActive));
            }
            strOption = creatOption(newOption);
        }
        return count >= 4;
    }

    public static int getItemThienSu(int id) {
        switch (id) {
            case 923:
                return 609;
            case 924:
                return 624;
            case 925:
                return 639;
            case 926:
                return 654;

        }
        return 0;
    }

    public boolean isTrangBiThienSu() {
        return id == 609 || id == 624 || id == 639 || id == 654;
    }

    public boolean isTrangBiThanLinh() {
        return id >= 923 && id <= 926;
    }

    public boolean isHopNhat() {
        if (strOption == null || strOption.isEmpty()) {
            return false;
        }
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions != null) {
            for (ItemOption itemOption : itemOptions) {
                if (itemOption.getId() == 370 && itemOption.option[1] >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSkill(int i) {
        if (strOption == null || strOption.isEmpty()) {
            return false;
        }
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions != null) {
            for (ItemOption itemOption : itemOptions) {
                if (itemOption.getId() == 327 && itemOption.option[1] == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addSkill(int i) {
        if (strOption == null || strOption.isEmpty()) {
            return;
        }
        ItemOption[] itemOptions = getItemOption();
        Vector<ItemOption> newOption = new Vector<>();
        if (itemOptions != null) {
            for (ItemOption itemOption : itemOptions) {
                newOption.add(itemOption);
            }
            newOption.add(new ItemOption(327, i, 1));
            skills.add(i);
            strOption = creatOption(newOption);
        }
    }

    public void setOptionVuKhiMount() {
        int percent = template.id - 1154;
        Vector<ItemOption> newOption = new Vector<>();
        newOption.add(new ItemOption(2, percent * 100, -1));
        newOption.add(new ItemOption(167, percent * 75, -1));
        strOption = creatOption(newOption);
    }

    public void setOptionTrangBiMount() {
        int percent = template.id - 1157;
        Vector<ItemOption> newOption = new Vector<>();
        newOption.add(new ItemOption(258, percent * 50, -1));
        newOption.add(new ItemOption(0, percent * 250, -1));
        strOption = creatOption(newOption);
    }

    public void setOptionPhuKienMount() {
        int percent = template.id - 1160;
        Vector<ItemOption> newOption = new Vector<>();
        newOption.add(new ItemOption(278, percent * 50, -1));
        newOption.add(new ItemOption(0, percent * 250, -1));
        strOption = creatOption(newOption);
    }

    public void setOptionVuKhiMountCaoCap() {
        int percent = template.id - 1164;
        Vector<ItemOption> newOption = new Vector<>();
        newOption.add(new ItemOption(2, percent * 100 + 400, -1));
        newOption.add(new ItemOption(167, percent * 75 + 300, -1));
//        newOption.add(new ItemOption(149, 2 + 4 * percent, -1));
        strOption = creatOption(newOption);
    }

    public void setOptionTrangBiMountCaoCap() {
        int percent = template.id - 1167;
        Vector<ItemOption> newOption = new Vector<>();
        newOption.add(new ItemOption(258, percent * 50 + 200, -1));
        newOption.add(new ItemOption(0, percent * 250 + 1000, -1));
        strOption = creatOption(newOption);
    }

    public void setOptionPhuKienMountCaoCap() {
        int percent = template.id - 1170;
        Vector<ItemOption> newOption = new Vector<>();
        newOption.add(new ItemOption(278, percent * 50 + 400, -1));
        newOption.add(new ItemOption(0, percent * 250 + 1000, -1));
        strOption = creatOption(newOption);
    }

    public ItemOption getOption(int i) {
        if (strOption == null || strOption.isEmpty()) {
            return null;
        }
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions != null) {
            for (ItemOption itemOption : itemOptions) {
                if (itemOption.getId() == i) {
                    return itemOption;
                }
            }
        }
        return null;
    }

    public void resetEXPMount() {
        if (strOption == null || strOption.isEmpty()) {
            return;
        }
        ItemOption[] itemOptions = getItemOption();
        Vector<ItemOption> newOption = new Vector<>();
        if (itemOptions != null) {
            for (ItemOption itemOption : itemOptions) {
                if (itemOption.getId() == 413) {
                    itemOption.option[1] = 0;
                    itemOption.option[2] += 10000;
                }
                newOption.add(itemOption);
            }
            strOption = creatOption(newOption);
        }
    }

    public int getSkillPet() {
        switch (id) {
            case 1152:
            case 1153:
            case 1154:
                return 103;
            case 1176:
            case 1177:
            case 1178:
            case 1181:
            case 1182:
            case 1183:
                return 104;
            case 1184:
            case 1185:
            case 1186:
                return 105;
            case 1187:
            case 1188:
            case 1189:
                return 106;
            case 1236:
            case 1237:
            case 1238:
                return 115;
        }
        return -1;
    }

    public int getSkillPet2() {
        switch (id) {
            case 1152:
            case 1153:
            case 1154:
                return 113;
            case 1176:
            case 1177:
            case 1178:
            case 1181:
            case 1182:
            case 1183:
                return 112;
            case 1236:
            case 1237:
            case 1238:
                return 110;
            case 1184:
            case 1185:
            case 1186:
                return 109;
            case 1187:
            case 1188:
            case 1189:
                return 111;
            case 1203:
            case 1204:
            case 1205:
                return 114;
        }
        return -1;
    }

    public int getSkillByItem() {
        switch (id) {
            case 1173:
                return 103;
            case 1179:
            case 1190:
                return 104;
            case 1191:
                return 105;
            case 1192:
                return 106;
            case 1227:
                return 109;
            case 1228:
                return 110;
            case 1229:
                return 111;
            case 1230:
                return 112;
            case 1231:
                return 113;
            case 1232:
                return 114;
        }
        return -1;
    }

    public int getEXP() {
        if (strOption == null || strOption.isEmpty()) {
            return 0;
        }
        ItemOption[] itemOptions = getItemOption();
        if (itemOptions != null) {
            for (ItemOption itemOption : itemOptions) {
                if (itemOption.getId() == 413) {
                    return itemOption.option[1];
                }
            }
        }
        return 0;
    }

    public void resetEXP() {
        if (strOption == null || strOption.isEmpty()) {
            return;
        }
        ItemOption[] itemOptions = getItemOption();
        Vector<ItemOption> newOption = new Vector<>();
        if (itemOptions != null) {
            for (ItemOption itemOption : itemOptions) {
                if (itemOption.getId() == 413) {
                    itemOption.option[1] = 0;
                    itemOption.option[2] = 10000;
                }
                newOption.add(itemOption);
            }
            strOption = creatOption(newOption);
        }
    }

    /**
     * Check Basic level items (Hammer 1155, Armor 1158, Hat 1161)
     */
    public boolean isBasicLevel() {
        return id == 1155 || id == 1158 || id == 1161;
    }

    /**
     * Check Medium level items (Hammer 1156, Armor 1159, Hat 1162)
     */
    public boolean isMediumLevel() {
        return id == 1156 || id == 1159 || id == 1162;
    }

    /**
     * Check Advanced level items (Hammer 1157, Armor 1160, Hat 1163)
     */
    public boolean isAdvancedLevel() {
        return id == 1157 || id == 1160 || id == 1163;
    }

    /**
     * Check S-Basic level items (S-Hammer 1164, S-Armor 1167, S-Hat 1170)
     */
    public boolean isSBasicLevel() {
        return id == 1164 || id == 1167 || id == 1170;
    }

    /**
     * Check S-Medium level items (S-Hammer 1165, S-Armor 1168, S-Hat 1171)
     */
    public boolean isSMediumLevel() {
        return id == 1165 || id == 1168 || id == 1171;
    }

    /**
     * Check S-Advanced level items (S-Hammer 1166, S-Armor 1169, S-Hat 1172)
     */
    public boolean isSAdvancedLevel() {
        return id == 1166 || id == 1169 || id == 1172;
    }

    public int getMaxStars() {
        if (isBasicLevel()) return 6;
        if (isMediumLevel()) return 8;
        if (isAdvancedLevel()) return 10;
        if (isSBasicLevel()) return 12;
        if (isSMediumLevel()) return 14;
        if (isSAdvancedLevel()) return 16;
        return 0;
    }

    public boolean isMaxStars() {
        return getUpgrade() >= getMaxStars();
    }

    /**
     * Lấy ID của item tiếp theo khi đã max stars
     * Quy luật nâng cấp:
     * - Búa: 1155 -> 1156 -> 1157 -> 1164 -> 1165 -> 1166
     * - Áo: 1158 -> 1159 -> 1160 -> 1167 -> 1168 -> 1169
     * - Nón: 1161 -> 1162 -> 1163 -> 1170 -> 1171 -> 1172
     */
    public int getNextUpgradeId() {
        if (!isMaxStars()) return -1; // Chưa max stars, không thể nâng cấp

        // Búa thường -> Búa S
        if (id == 1157) return 1164; // Búa cao -> Búa S sơ
        if (id == 1160) return 1167; // Áo cao -> Áo S sơ
        if (id == 1163) return 1170; // Nón cao -> Nón S sơ

        // Nâng cấp bình thường +1
        return id + 1;
    }

    public int getOptionDefaut(int param) {
        return (int) (param / (getUpgrade() * 0.1));
    }


    public void upgradeItemMount() {
        if (strOption == null || strOption.isEmpty()) {
            return;
        }
        ItemOption[] itemOptions = getItemOption();
        Vector<ItemOption> newOption = new Vector<>();
        if (itemOptions != null) {
            for (ItemOption itemOption : itemOptions) {
                if (upgrade > 0) {
                    int currentValue = itemOption.option[1];
                    // Tính hệ số tăng mới so với hệ số tăng cũ
                    double oldMultiplier = 1 + (upgrade * 0.1);
                    double newMultiplier = 1 + ((upgrade + 1) * 0.1);
                    itemOption.option[1] = (int) (currentValue * (newMultiplier / oldMultiplier));
                } else
                    itemOption.option[1] += itemOption.option[1] * 10 / 100;
                itemOption.option[2] = -1;
                newOption.add(itemOption);
            }
            strOption = creatOption(newOption);
            upgrade += 1;
        }

    }

}
