package com.vdtt.model;

import com.vdtt.item.Item;
import com.vdtt.item.ItemManager;
import com.vdtt.item.ItemTemplate;
import com.vdtt.util.Log;
import com.vdtt.util.RandomCollection;

import java.util.ArrayList;
import java.util.List;

public class RandomItem {
    public static final RandomCollection<Integer> VONG_QUAY_PHUC_LOI = new RandomCollection<>();
    public static final RandomCollection<Integer> ITEM_EQUIP = new RandomCollection<>();
    public static final RandomCollection<Integer> SAO_PHA_LE = new RandomCollection<>();
    public static final RandomCollection<Integer> ITEM_NGUC_TU = new RandomCollection<>();
    public static final RandomCollection<Integer> ITEM_THU_LINH = new RandomCollection<>();
    public static final RandomCollection<Integer> BOSS = new RandomCollection<>();
    public static final RandomCollection<Integer> BOSS_HELL = new RandomCollection<>();
    public static final RandomCollection<Integer> MORO_CON = new RandomCollection<>();
    public static final RandomCollection<Integer> MORO_BOSS = new RandomCollection<>();
    public static final RandomCollection<Integer> CELL_CON = new RandomCollection<>();

    public static final RandomCollection<Integer> CELL_MAX = new RandomCollection<>();
    public static final RandomCollection<Integer> DOANH_TRAI = new RandomCollection<>();
    public static final RandomCollection<Integer> THO_DAI_CA = new RandomCollection<>();
    public static final RandomCollection<Integer> GIAI_CUU_NOEL = new RandomCollection<>();

    public static final RandomCollection<Integer> BOSS_TDST = new RandomCollection<>();

    public static final RandomCollection<Integer> DOANH_TRAI_VIP = new RandomCollection<>();
    public static final RandomCollection<Integer> EM_BE_PHAT_QUA = new RandomCollection<>();

    public static final RandomCollection<Item> TUI_MU_NHO = new RandomCollection<>();
    public static final RandomCollection<Item> TUI_MU_LON = new RandomCollection<>();
    public static final RandomCollection<Item> TVM_NEW = new RandomCollection<>();
    public static final RandomCollection<Item> TVM_NEW_2 = new RandomCollection<>();

    public static final RandomCollection<Integer> NAMEC_BOSS = new RandomCollection<>();

    public static final RandomCollection<Integer> NAMEC_NORMAL = new RandomCollection<>();


    public static void init() {
        VONG_QUAY_PHUC_LOI.add(10,0);
        VONG_QUAY_PHUC_LOI.add(30,1);
        VONG_QUAY_PHUC_LOI.add(3,2);
        VONG_QUAY_PHUC_LOI.add(3,3);
        VONG_QUAY_PHUC_LOI.add(3,4);
        VONG_QUAY_PHUC_LOI.add(3,5);
        VONG_QUAY_PHUC_LOI.add(2,6);
        VONG_QUAY_PHUC_LOI.add(1,7);
        VONG_QUAY_PHUC_LOI.add(1,8);
        List<ItemTemplate>listEquip = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            for (int j = 1; j < 6; j++) {
                listEquip.addAll(ItemManager.getInstance().createSet(j, i));
            }
        }
        for (int i = 0; i < listEquip.size(); i++) {
            ItemTemplate itemTemplate = listEquip.get(i);
            if(!itemTemplate.name.startsWith("Kích hoạt")
                    &&!itemTemplate.name.contains("Cẩm Tú")
                    &&!itemTemplate.name.contains("Khâm La")
                    &&!itemTemplate.name.contains("Hiệp Nghĩa")
                    &&!itemTemplate.name.contains("Hạo Thiên"))
                ITEM_EQUIP.add(10, (int) itemTemplate.id);
        }
        NAMEC_NORMAL.add(10, 4);
        NAMEC_NORMAL.add(10, 5);
        NAMEC_NORMAL.add(10, 838);
        NAMEC_NORMAL.add(5, 822);
        NAMEC_NORMAL.add(10, 930);
        NAMEC_NORMAL.add(15, 547);
        NAMEC_NORMAL.add(10, 164);
        NAMEC_NORMAL.add(5, 1194);
        NAMEC_NORMAL.add(20, 1224);
        NAMEC_NORMAL.add(20, 1225);
        NAMEC_NORMAL.add(20, 1226);


        NAMEC_BOSS.add(8, 7);
        NAMEC_BOSS.add(1, 8);
        NAMEC_BOSS.add(10, 838);
        NAMEC_BOSS.add(10, 930);
        NAMEC_BOSS.add(15, 547);
        NAMEC_BOSS.add(10, 164);
        NAMEC_BOSS.add(5, 1194);
        NAMEC_BOSS.add(2, 1195);
        NAMEC_BOSS.add(10, 1224);
        NAMEC_BOSS.add(10, 1225);
        NAMEC_BOSS.add(10, 1226);

        SAO_PHA_LE.add(4, 406);
        SAO_PHA_LE.add(10, 407);
        SAO_PHA_LE.add(10, 408);
        SAO_PHA_LE.add(10, 409);
        SAO_PHA_LE.add(10, 410);
        SAO_PHA_LE.add(10, 411);
        SAO_PHA_LE.add(10, 412);
        SAO_PHA_LE.add(10, 413);
        SAO_PHA_LE.add(40,2);
        SAO_PHA_LE.add(30,3);
        SAO_PHA_LE.add(20,4);
        SAO_PHA_LE.add(5,164);
        SAO_PHA_LE.add(1,547);

        ITEM_THU_LINH.add(4, 406);
        ITEM_THU_LINH.add(10, 407);
        ITEM_THU_LINH.add(10, 408);
        ITEM_THU_LINH.add(10, 409);
        ITEM_THU_LINH.add(10, 410);
        ITEM_THU_LINH.add(10, 411);
        ITEM_THU_LINH.add(10, 412);
        ITEM_THU_LINH.add(10, 413);
        ITEM_THU_LINH.add(40,1);
        ITEM_THU_LINH.add(30,2);
        ITEM_THU_LINH.add(20,3);
        ITEM_THU_LINH.add(5,930);
        ITEM_THU_LINH.add(30,838);
        ITEM_THU_LINH.add(30,160);
        ITEM_THU_LINH.add(50,547);

        BOSS.add(8, 406);
        BOSS.add(8, 407);
        BOSS.add(8, 408);
        BOSS.add(8, 409);
        BOSS.add(8, 410);
        BOSS.add(8, 411);
        BOSS.add(8, 412);
        BOSS.add(8, 413);
//        BOSS.add(15,813);
//        BOSS.add(15,814);
        BOSS.add(60,838);
        BOSS.add(10,5);
        BOSS.add(10,6);
        BOSS.add(3,7);
        BOSS.add(0.5,8);
        BOSS.add(10,160);
        BOSS.add(10,164);
        BOSS.add(3,822);
        BOSS.add(50,547);
        BOSS.add(20,930);



        BOSS_HELL.add(40,838);
        BOSS_HELL.add(5,6);
        BOSS_HELL.add(3,7);
//        BOSS_HELL.add(0.1,8);
        BOSS_HELL.add(10,164);
        BOSS_HELL.add(7,822);


        ITEM_NGUC_TU.add(10,160);
        ITEM_NGUC_TU.add(10,838);
        ITEM_NGUC_TU.add(10,817);
        ITEM_NGUC_TU.add(15,5);
        ITEM_NGUC_TU.add(10,164);
        ITEM_NGUC_TU.add(3,822);

        MORO_CON.add(80, -1);
        MORO_CON.add(20, 434);
        MORO_CON.add(1, 7);
        MORO_CON.add(5, 822);
        MORO_CON.add(10, 562);//tb than linh
        MORO_CON.add(10, 564);
        MORO_CON.add(10, 566);
        MORO_CON.add(10, 354);

        MORO_BOSS.add(25, 434);
        MORO_BOSS.add(5, 822);
        MORO_BOSS.add(0.5, 8);
        MORO_BOSS.add(20, 562);//tb than linh
        MORO_BOSS.add(20, 564);
        MORO_BOSS.add(20, 566);
        MORO_BOSS.add(20, 354);


        CELL_CON.add(40, 4);
        CELL_CON.add(30, 5);
        CELL_CON.add(20, 6);
        CELL_CON.add(5, 7);
        CELL_CON.add(1, 8);
        CELL_CON.add(0.05, 9);
        CELL_CON.add(40, 277);
        CELL_CON.add(5, 161);
        CELL_CON.add(10, 186);
        CELL_CON.add(0.5, 823);
        CELL_CON.add(10, 895);
        CELL_CON.add(2, 158);
        CELL_CON.add(0.5, 827);
        CELL_CON.add(0.5, 828);
        CELL_CON.add(1, 437);
        CELL_CON.add(3, 177);
        CELL_CON.add(1, 682);
        CELL_CON.add(0.1, 435);
        CELL_CON.add(3, 712);
        CELL_CON.add(20, 822);
        CELL_CON.add(40, 562);//tb than linh
        CELL_CON.add(40, 564);
        CELL_CON.add(40, 566);
        CELL_CON.add(40, 354);
        CELL_CON.add(0.1, 936);
        CELL_CON.add(0.5, 295);
        CELL_CON.add(0.2, 296);
        CELL_CON.add(0.05, 297);
        CELL_CON.add(0.01, 891);
        CELL_CON.add(1.5, 374);//cai trang
        CELL_CON.add(0.2, 555);
        CELL_CON.add(0.1, 298);
        CELL_CON.add(0.1, 431);
        CELL_CON.add(0.08, 519);
        CELL_CON.add(1.6, 284);//thoi trang
        CELL_CON.add(1.5, 309);
        CELL_CON.add(1.5, 848);
        CELL_CON.add(1.5, 972);
        CELL_CON.add(1.5, 989);
        CELL_CON.add(2, 706);//thuoc
        CELL_CON.add(2, 705);
        CELL_CON.add(2, 704);
        CELL_CON.add(10, 701);
        CELL_CON.add(10, 702);
        CELL_CON.add(10, 703);
        CELL_CON.add(20, 358);
        CELL_CON.add(20, 359);
        CELL_CON.add(20, 360);


        CELL_MAX.add(50, 434);
        CELL_MAX.add(5, 822);
        CELL_MAX.add(1, 8);
        CELL_MAX.add(3, 1019);
        CELL_MAX.add(40, 562);//tb than linh
        CELL_MAX.add(40, 564);
        CELL_MAX.add(40, 566);
        CELL_MAX.add(40, 354);

        DOANH_TRAI.add(5, 1058);
        DOANH_TRAI.add(5, 1059);
        DOANH_TRAI.add(5, 1060);
        DOANH_TRAI.add(5, 1061);
        DOANH_TRAI.add(5, 1062);
        DOANH_TRAI.add(5, 1063);
        DOANH_TRAI.add(5, 1064);
        DOANH_TRAI.add(5, 1065);
        DOANH_TRAI.add(5, 1066);
        DOANH_TRAI.add(5, 1067);
        DOANH_TRAI.add(5, 1068);
        DOANH_TRAI.add(5, 1069);
        DOANH_TRAI.add(5, 1070);
        DOANH_TRAI.add(5, 1071);
        DOANH_TRAI.add(5, 1072);
        DOANH_TRAI.add(5, 1073);
        DOANH_TRAI.add(5, 1074);
        DOANH_TRAI.add(5, 1075);
        DOANH_TRAI.add(5, 1076);
        DOANH_TRAI.add(5, 1077);
        DOANH_TRAI.add(5, 1078);

        THO_DAI_CA.add(15, 5);
        THO_DAI_CA.add(5, 6);
        THO_DAI_CA.add(2, 7);
        THO_DAI_CA.add(1, 546);
        THO_DAI_CA.add(1, 545);
        THO_DAI_CA.add(1, 544);
        THO_DAI_CA.add(100, 537);
        THO_DAI_CA.add(100, 538);
        THO_DAI_CA.add(100, 539);
        THO_DAI_CA.add(100, 542);

        DOANH_TRAI_VIP.add(1, 546);
        DOANH_TRAI_VIP.add(1, 1106);
        DOANH_TRAI_VIP.add(40, 434);

        EM_BE_PHAT_QUA.add(30, 4);
        EM_BE_PHAT_QUA.add(30, 5);
        EM_BE_PHAT_QUA.add(30, 6);
        EM_BE_PHAT_QUA.add(30, 434);
        EM_BE_PHAT_QUA.add(1, 546);
        EM_BE_PHAT_QUA.add(8, 908);
        EM_BE_PHAT_QUA.add(3, 940);
        EM_BE_PHAT_QUA.add(1, 546);
        EM_BE_PHAT_QUA.add(1, 545);
        EM_BE_PHAT_QUA.add(1, 544);


        GIAI_CUU_NOEL.add(100, 930);
        GIAI_CUU_NOEL.add(60, 547);
        GIAI_CUU_NOEL.add(5, 6);
        GIAI_CUU_NOEL.add(5, 7);
        GIAI_CUU_NOEL.add(0.1, 8);
        GIAI_CUU_NOEL.add(5, 562);//tb than linh
        GIAI_CUU_NOEL.add(5, 564);
        GIAI_CUU_NOEL.add(5, 566);
        GIAI_CUU_NOEL.add(5, 354);
        GIAI_CUU_NOEL.add(1, 576);
        GIAI_CUU_NOEL.add(5, 277);
        GIAI_CUU_NOEL.add(3, 822);

        BOSS_TDST.add(100, 930);
        BOSS_TDST.add(60, 547);
        BOSS_TDST.add(5, 6);
        BOSS_TDST.add(5, 7);
        BOSS_TDST.add(0.2, 8);
        BOSS_TDST.add(5, 562);//tb than linh
        BOSS_TDST.add(5, 564);
        BOSS_TDST.add(5, 566);
        BOSS_TDST.add(5, 354);
        BOSS_TDST.add(1, 576);
        BOSS_TDST.add(3, 821);
        BOSS_TDST.add(3, 177);
        BOSS_TDST.add(2, 1174);


    }
}
