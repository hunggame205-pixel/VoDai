package core.mchien.main2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class VDTT_kt extends VDTT_ar {

    public Item[] a;
    private VDTT_ht b;
    private VDTT_ba c;
    private VDTT_ba d;
    private VDTT_ba d_new;
    private VDTT_ba d_new3;
    private VDTT_ba d_new4;
    private int N = -1;
    private int O = 0;
    private int P;
    private int Q = -1;
    private long R;

 //   public int[] Y = new int[100];
 //   public boolean[] B = new boolean[100];
  //  public ArrayList<Item> listItem = new ArrayList<Item>();
   // private long open;
   // private int sleepMain;

    public VDTT_kt(VDTT_p var1, Message var2) {
        try {
            this.I = var1;
            this.a(208, 200);
            this.K = false;
            this.d = this.a(this.q / 2 -65, this.r - 29, Caption.fG, this, 101, -8);//this.b(Caption.fG, 101);
            this.c = this.a(this.q / 2 +5, this.r - 29, Caption.pJ, this, 100, -8);//this.b(Caption.fG, 101);
            //this.d_new = this.a(this.q / 2 + 35, this.r - 29, Caption.pJ + "(x5)", this, 102, -8);//this.c(Caption.pJ, 100);
          //  this.d_new3 = this.a(this.q / 2 - 65, this.r - 60, "Đóng", this, 103, -8);//this.b(Caption.fG, 101);
           // this.d_new4 = this.a(this.q / 2 + 5, this.r - 60, Caption.pJ + "(x5)", this, 102, -8);//this.b(Caption.fG, 101);
            this.d.a(true);

            if (var2 == null) {
                this.a = new Item[6 * 4];
                for (int var3 = 0; var3 < this.a.length; ++var3) {
                    Item var5;
                    var5 = new Item(var3);
                    var5.f = var3;
                    this.a[var5.f] = var5;
                 //   listItem.add(var5);
                }
            } else {
                this.a = new Item[var2.f()];

                for (int var3 = 0; var3 < this.a.length; ++var3) {
                    Item var5;
                    (var5 = new Item()).a(var2);
                    var5.f = var3;
                    this.a[var5.f] = var5;
                 //   listItem.add((Item) var5.clone());
                }
            }
            /*
            for (int i = 0; i < slots.length; i++) {
                slots[i] = new Slot((ArrayList<Item>) listItem.clone());
            }
            for (int i = 0; i < Y.length; i++) {
                Y[i] = i * 30;
            }
            set(false);
            open = System.currentTimeMillis() + 100;*/
            this.b = new VDTT_ht((byte) 1, 9, this.f() + 5, 192, 128, 32, 6, 4);
        } catch (Exception var4) {
            var4.printStackTrace();
        }
    }

    public void set(boolean b) {
        this.c.a(b);
        this.M.N = b;
        this.d_new.a(b);
        this.d_new3.b(!b);
        this.d_new4.b(!b);

    }

    public final void b(int var1, int var2) {
        this.N = var1;
        this.O = var2;
        this.c.a(true);
        this.d.a(false);
    }

    public final void perform(int var1, Object var2, VDTT_z var3) {
    }

    public final void b(int var1, Object var2) {

    }
//    public Slot[] slots = new Slot[5];
//    public int indexMain = 0;
//
//    private void paintSlot(Graphics var1, int x, int y, int indexslot) {
//        int t = DataCenter.d().h;
//        if (slots[indexslot].countQuay == -1) {
//            slots[indexslot].countQuay = sleepMain;
//        }
//
//        if (slots[indexslot].saveTick != -1) {
//            t = slots[indexslot].saveTick;
//        }
//
//        int tick = t * (slots[indexslot].countQuay > 0 ? slots[indexslot].countQuay : 1) % 100000;
//        for (int i = 0; i < 100000; i++) {
//            int xPaint = x + 5 + (indexslot * 32);
//            int yPaint = 30 + ((y - 30 - (i * 30)) + tick);
//            if (yPaint >= y - 120 && yPaint <= y + 120) {
//                Item item = (Item) slots[indexslot].list.get(i % slots[indexslot].list.size()).b();
//                if (slots[indexslot].saveTick != -1 && yPaint == y + 20) {
//                    if (slots[indexslot].itemWon != null) {
//                        item = slots[indexslot].itemWon;
//                    }
//                }
//
//                a(var1, xPaint, yPaint, item, item.f == slots[indexslot].index && !item.isItemWon, 0);
//                if (yPaint >= y + 20 && yPaint <= y + 50 && slots[indexslot].index != -1 && item.f == slots[indexslot].index && System.currentTimeMillis() - slots[indexslot].open >= 0 && indexMain == indexslot) {//
//                    if (slots[indexslot].saveTick == -1) {
//                        slots[indexslot].saveTick = 85 - (yPaint - tick);
//                        slots[indexslot].countQuay = 1;
//                        t = slots[indexslot].saveTick;
//                        tick = t * (slots[indexslot].countQuay > 0 ? slots[indexslot].countQuay : 1) % 100000;
//                        indexMain++;
//                        item.s = 16;
//                        item.isItemWon = true;
//                        item.countEff = 15;
//                        item.ar();
//                        slots[indexslot].itemWon = item;
//                        if (indexMain < slots.length) {
//                            slots[indexMain].open = System.currentTimeMillis() + 300L;
//                        }
//                        for (int i1 = 0; i1 < slots.length; i1++) {
//                            if (slots[i1].itemWon != null) {
//                                slots[i1].itemWon.countEff = -75;
//                            }
//                        }
//                        if (indexMain == slots.length) {
//                            d_new4.a(false);
//                            d_new3.a(false);
//                        }
//                    }
//                }
//
//            }
//
//        }
//    }

    void b(int[] data, int[] data2) {
//        for (int i = 0; i < slots.length && i < data.length; i++) {
//            slots[i].index = getIndexByIdAndAmount(data[i], data2[i]);
//        }
    }
//
//    private int getIndexByIdAndAmount(int N, int O) {
//        for (int i = 0; i < this.a.length; i++) {
//            if (this.a[i].c == N && this.a[i].M() == O) {
//                return i;
//            }
//        }
//        return -1;
//    }

//    public static class Slot {
//
//        public Item itemWon;
//        private int saveTick = -1;
//        public int countQuay = -1;
//        public ArrayList<Item> list;
//        public int index = -1;
//        private long open;
//
//        private Slot(ArrayList<Item> clone) {
//
//            Collections.shuffle(clone);
//            list = clone;
//            //  index = new Random().nextInt(clone.size());
//            index = -1;
//        }
//    }
//
//    public boolean xoay = false;

    public final void b(Graphics var1) {
        this.a(var1, this.objX, this.objY, this.q, this.r, Caption.fM, (byte) 2, this.K);
        this.a(var1, this.b);
        int var2 = 0;
        boolean var3 = false;

        for (int var4 = 0; var4 < this.b.P; ++var4) {
            for (int var5 = 0; var5 < this.b.i; ++var5) {
                if (var2 < this.a.length) {
                    a(var1, var5 * this.b.h, var4 * this.b.h, this.a[var2], var4 * this.b.i + var5 == this.b.k, 0);
                } else {
                    a(var1, var5 * this.b.h, var4 * this.b.h, (Item) null, var4 * this.b.i + var5 == this.b.k, 0);
                }

                if (!var3 && this.a[var2].c == this.N && this.a[var2].M() == this.O && DataCenter.d().h % 10 > 5) {
                    var3 = true;
                    var1.f(-2560);
                    var1.b(var5 * this.b.h, var4 * this.b.h, 28, 28);
                }

                ++var2;
            }
        }

        this.a(var1);
        if (this.P > 0) {
            if (this.Q == -1) {
                this.Q = this.a[0].getItemTemplate().h;
            }

            this.Q = this.a[VDTT_jb.a(this.a.length)].getItemTemplate().h;
            this.a(var1, this.q / 2 - 40, this.r / 2 - 40, 80, 80, -11, 22, 23, 1, 1);
            a(var1, this.q / 2 - 16, this.r / 2 - 16, (Item) null, false, this.Q);

        }
//
//        if (xoay) {
//            int sizeX = 208 - 40;
//            int sizeY = 60 + 10;
//            int x = (this.q / 2) - sizeX / 2;
//            int y = (this.r / 2) - sizeY / 2;
//            set(true);
//            var1.a(var1, -39, 0, -1000, -1000, DataCenter.d().n * 100, DataCenter.d().o * 100);
//            this.a(var1, x, y, sizeX, sizeY, 61, 3, 4, 1, 1);
//            if (indexMain < slots.length) {
//                VDTT_dg.c(VDTT_dg.i[5], var1, "Đang quay xin vui lòng chờ".toUpperCase(), (this.q / 2), (this.r / 2) - 50, -1, -16711681, 9);
//            } else {
//                VDTT_dg.c(VDTT_dg.i[5], var1, "Bạn nhận được các phần thưởng sau".toUpperCase(), (this.q / 2), (this.r / 2) - 50, -1, -16711681, 98);
//            }
//            var1.d(x, y + 2, 312, sizeY - 4);
//            for (int i = 0; i < slots.length; i++) {
//                paintSlot(var1, x, y, i);
//            }
//            var1.d(0, 0, DataCenter.d().n, DataCenter.d().o);
//        }

        /*
        for (int i = listItem.size() - 1; i >= 0; i--) {
            Item item = listItem.get(i);
            int xPaint = x + 5;
            int yPaint = (y - (i * 30)) + tick;
            a(var1, xPaint, yPaint, (Item) null, false, item.getItemTemplate().h);

        }*/
        //      a(var1, x + 5, y + (sizeY / 4) , (Item) null, false, this.Q);
//        this.Q = this.a[VDTT_jb.a(this.a.length)].getItemTemplate().h;
//        int sizeX = DataCenter.d().n - 185;
//        int sizeY = 50;
//        int x = (DataCenter.d().n / 2) - sizeX / 2;
//        int y = (DataCenter.d().o / 2) - sizeY / 2;
//        this.a(var1, x, y, sizeX, sizeY, -11, 22, 23, 1, 1);
//        var1.d(0, 0, x + (5 + (320)), y + 50);
//        for (int i = 0; i < 10; i++) {
//            a(var1, x + 5 + (32 * i), y + (sizeY / 4), (Item) null, false, this.Q);
//        }
//
//        //}
//        var1.d(0, 0, DataCenter.d().n, DataCenter.d().o);
    }

    public final void a_() {
        if (this.P > 0 && (System.currentTimeMillis() - this.R) / 1000L > (long) this.P) {
            this.P = 0;
            try {
                Message.c((byte) -85).l();
                return;
            } catch (Exception var2) {
            }
        }

    }

    public final void a(VDTT_hl var1, int var2, int var3) {
        super.a(var1, var2, var3);
        if (this.P <= 0) {
            switch (var1.b) {
                case 100:
                    if (VDTT_ek.m().e(936) == null) {
                        DataCenter.d().ai.c(Caption.ya, -65536);
                        return;
                    }

                    this.R = System.currentTimeMillis();
                    this.P = VDTT_jb.a(2, 4);
                    break;
                case 101:
                case 103:
                 //   xoay = false;
                    this.N = -1;
                    this.O = 0;
                    this.c.a(false);
                    this.d.a(true);
                    break;
                case 102:
//                    if (VDTT_ek.m().e(936) == null) {
//                        DataCenter.d().ai.c(Caption.ya, -65536);
//                        return;
//                    }
//                    sleepMain = 5 + new Random().nextInt(5);
//                    d_new4.a(true);
//                    d_new3.a(true);
//                    for (int i = 0; i < slots.length; i++) {
//                        slots[i] = new Slot((ArrayList<Item>) listItem.clone());
//                    }
//                    indexMain = 0;
//                    xoay = true;
//                    set(xoay);
//                    Message msg;
//                    try {
//                        msg = Message.c((byte) -85);
//                        msg.a(5);
//                        msg.l();
//                    } catch (Exception ex) {
//                        
//                    }
                    break;
                case 5001:
                    int var4 = var1.j.k;
                    VDTT_hs var7 = var1.j;
                    this.b.k = -1;
                    var7.k = var4;
                    if (var1.j.k >= 0) {
                        Item var8 = this.a[var1.j.k];
                        VDTT_bo var10001;
                        VDTT_ht var6;
                        if (var8 != null && (var6 = (VDTT_ht) var1.j).k >= 0 && var6.k < var6.i * var6.P) {
                            var6.e();
                            var2 = var6.k % var6.i;
                            int var5 = var6.k / var6.i - (var6.j >= 0 ? var6.j : 0);
                            if (var6.n == 0) {
                                var2 = var6.k % var6.i - (var6.j >= 0 ? var6.j : 0);
                                var5 = var6.k / var6.i;
                            }

                            var2 = var2 * var6.h + var6.h + var6.objX;
                            var5 = var5 * var6.h + var6.objY;
                            var10001 = VDTT_ae.a(this, var2, var5, var6.h, (Item) var8);
                        } else {
                            var10001 = null;
                        }

                        this.k = var10001;
                        return;
                    }
            }

        }
    }

    public final Vector g() {
        Vector var1;
        var1 = super.g();
            var1.addElement(this.b.a(5001, this));
        return var1;
    }
}
