package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class VDTT_kt2 extends VDTT_ar {

    public Item[] a;
    public Item[] a2;
    private VDTT_ht b;
    private VDTT_ba c;
    private VDTT_ba c2;
    private VDTT_ba c3;
    private VDTT_ba d;
//    private VDTT_ba d_new;
//    private VDTT_ba d_new3;
//    private VDTT_ba d_new4;

    private int P;

    private int select = -1;
    private int countWin;
    private int idVe;
    private int idBg;

    public VDTT_kt2(VDTT_p var1, Message var2) {
        try {
            this.I = var1;
            this.a((int) (400 / 1.2), (int) (240 / 1.2));
            this.K = false;
            if (var2 == null) {
                this.a = new Item[6 * 4];
                this.a2 = new Item[6 * 4];
                for (int var3 = 0; var3 < this.a.length; ++var3) {
                    Item var5;
                    var5 = new Item(var3);
                    var5.f = var3;
                    this.a[var5.f] = var5;
                    this.a2[var5.f] = (Item) var5.clone();

                }
            } else {
                this.a = new Item[var2.f()];
                this.a2 = new Item[a.length];

                for (int var3 = 0; var3 < this.a.length; ++var3) {
                    Item var5;
                    (var5 = new Item()).a(var2);
                    var5.f = var3;
                    this.a[var5.f] = var5;
                    this.a2[var5.f] = (Item) var5.clone();
                }
                try {
                    idVe = var2.i();
                    idBg = var2.i();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            this.d = this.a(this.q / 2 + (this.q / 10) - 50, this.r - 29, "Quay 1 lần", this, 100, -8);

            this.c = this.a(this.q / 2 + (this.q / 10) + 50 - 30, this.r - 29, "Quay 5 lần", this, 101, -8);

            this.c2 = this.a(this.q / 2 - 65, this.r - 45, "Quay 5 lần", this, 101, -8);
            this.c3 = this.a(this.q / 2 + 5, this.r - 45, "Đóng", this, 102, -8);
            this.M.d = false;
            set(false);
        } catch (Exception var4) {
            var4.printStackTrace();
        }
    }

    public void set(boolean b) {
        this.M.N = b;
        this.c.d = b;
        this.d.d = b;

        this.c2.d = !b;
        this.c3.d = !b;

    }

    public int[] data_won = null;

    public void b(int[] data, int[] data2) {
        data_won = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            data_won[i] = getIndexByIdAndAmount(data[i], data2[i]);
            this.a2[data_won[i]].isItemWon = true;
        }
        win = true;
    }

    private int getIndexByIdAndAmount(int N, int O) {
        for (int i = 0; i < this.a.length; i++) {
            if (this.a[i].c == N && this.a[i].M() == O) {
                return i;
            }
        }
        return -1;
    }

    public final void perform(int var1, Object var2, VDTT_z var3) {
    }

    public final void b(int var1, Object var2) {

    }

    public boolean win = false;

    public final void b(Graphics var1) {
        VDTT_v var4 = VDTT_dc.c(idBg);
        if (var4 != null) {
            float x = (float) (q * DataCenter.d().r);
            float y = (float) (r * DataCenter.d().r);
            var1.a(var4, 0, 0, var4.c, var4.d, 0,
                    this.q / DataCenter.d().r - (x / (DataCenter.d().r * DataCenter.d().r)),
                    (this.r / DataCenter.d().r) - (y / (DataCenter.d().r * DataCenter.d().r)),
                    (float) x,
                    (float) y,
                    0);
        }

        int size = this.q / 10;

        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                a2(var1, (this.q / 2) - size, this.r / 2 - ((this.r / 10) * 2), this.a[i], select == count, 1123);
            } else if (i == 1) {
                a2(var1, (this.q / 2), this.r / 2 - ((this.r / 10) * 2), this.a[i], select == count, 0);
            } else {
                a2(var1, (this.q / 2) + ((i - 1) * size), this.r / 2 - ((this.r / 10) * 2), this.a[i], select == count, 0);
            }
            count++;
        }
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                a2(var1, (this.q / 2) - size, this.r / 2 - ((this.r / 10)) + 15, this.a[5 + i], select == count, 0);
            } else if (i == 1) {
                a2(var1, (this.q / 2), this.r / 2 - ((this.r / 10)) + 15, this.a[5 + i], select == count, 0);
            } else {
                a2(var1, (this.q / 2) + ((i - 1) * size), this.r / 2 - ((this.r / 10)) + 15, this.a[5 + i], select == count, 0);
            }
            count++;
        }
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                a2(var1, (this.q / 2) - size, this.r / 2 - ((this.r / 10)) + 15 + 35, this.a[10 + i], select == count, 0);
            } else if (i == 1) {
                a2(var1, (this.q / 2), this.r / 2 - ((this.r / 10)) + 15 + 35, this.a[10 + i], select == count, 0);
            } else {
                a2(var1, (this.q / 2) + ((i - 1) * size), this.r / 2 - ((this.r / 10)) + 15 + 35, this.a[10 + i], select == count, 0);
            }
            count++;
        }
        set(win);
        if (win) {
            if (countWin > 0) {
                countWin -= 5;
            } else if (countWin < 0) {
                countWin += 5;
            }
            var1.a(var1, -39, 0, -1000, -1000, DataCenter.d().n * 100, DataCenter.d().o * 100);
            var4 = (VDTT_v) VDTT_dc.c(1130);
            if (var4 != null) {
                float x = (float) (q * DataCenter.d().r);
                float y = (float) (r * DataCenter.d().r);

                var1.d(100 - countWin);
                var1.a(var4, 0, 0, var4.c, var4.d, 0,
                        this.q / DataCenter.d().r - (x / (DataCenter.d().r * DataCenter.d().r)),
                        -30,
                        (float) x,
                        (float) y,
                        0);

            }
            if (data_won.length == 1) {
                a(var1, (q / 2) - 15, (int) (r / 1.7), this.a2[data_won[0]], false, 0);
            } else {
                a(var1, (q / 2) - 15, (int) (r / 1.7), this.a2[data_won[0]], false, 0);
                a(var1, (q / 2) - 15 - 36, (int) (r / 1.7), this.a2[data_won[1]], false, 0);
                a(var1, (q / 2) - 15 - 36 - 36, (int) (r / 1.7), this.a2[data_won[2]], false, 0);
                a(var1, (q / 2) - 15 + 36, (int) (r / 1.7), this.a2[data_won[3]], false, 0);
                a(var1, (q / 2) - 15 + 36 + 36, (int) (r / 1.7), this.a2[data_won[4]], false, 0);
            }
            var1.g();
        } else {
            countWin = 100;
//            if (new Random().nextInt(2) == 0) {
//                countWin = -countWin;
//            }
        }
//        a2(var1, (q / 2) - 30-36, (int) (r / 2.4), this.a[0], true, 0);
//        a2(var1, (q / 2) - 30, (int) (r / 2.4), this.a[0], true, 0);
//        a2(var1, (q / 2) + 6, (int) (r / 2.4), this.a[1], true, 0);
//        a2(var1, (q / 2) + 6+36, (int) (r / 2.4), this.a[1], true, 0);
        //
//        this.a(var1, this.objX, this.objY, this.q, this.r, Caption.fM, (byte) 2, this.K);
//        this.a(var1, this.b);
//        int var2 = 0;
//        boolean var3 = false;
//
//        for (int var4 = 0; var4 < this.b.P; ++var4) {
//            for (int var5 = 0; var5 < this.b.i; ++var5) {
//                if (var2 < this.a.length) {
//                    a(var1, var5 * this.b.h, var4 * this.b.h, this.a[var2], var4 * this.b.i + var5 == this.b.k, 0);
//                } else {
//                    a(var1, var5 * this.b.h, var4 * this.b.h, (Item) null, var4 * this.b.i + var5 == this.b.k, 0);
//                }
//
//                if (!var3 && this.a[var2].c == this.N && this.a[var2].M() == this.O && DataCenter.d().h % 10 > 5) {
//                    var3 = true;
//                    var1.f(-2560);
//                    var1.b(var5 * this.b.h, var4 * this.b.h, 28, 28);
//                }
//
//                ++var2;
//            }
//        }
//
//        this.a(var1);
//      
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

    }

    public final void a(VDTT_hl var1, int var2, int var3) {
        super.a(var1, var2, var3);
        if (this.P <= 0) {
            if (var1.b >= 5000) {
                int tick = var1.b - 5000;
                select = tick;
                this.k = VDTT_ae.a(this, arrayXY[tick].objX, arrayXY[tick].objY, 0, (Item) a[tick]);
                return;
            }
            switch (var1.b) {
                case 100:
                    if (VDTT_ek.m().e2(idVe) < 0) {
                        DataCenter.d().ai.c(Caption.ya, -65536);
                        return;
                    }
                    Message msg;
                    try {
                        msg = Message.c((byte) -85);
                        msg.l();
                    } catch (Exception ex) {

                    }
                    countWin = 100;
//                    countWin = 100;
//////                    if (new Random().nextInt(2) == 0) {
//////                        countWin = -countWin;
//////                    }
//                    win = true;
//                    data_won = new int[]{0};
//                    this.a2[0].isItemWon = true;
                    break;
                case 101:
                    if (VDTT_ek.m().e2(idVe) < 5) {
                        DataCenter.d().ai.c(Caption.ya, -65536);
                        return;
                    }
                    try {
                        msg = Message.c((byte) -85);
                        msg.a(5);
                        msg.l();
                    } catch (Exception ex) {

                    }
                    countWin = 100;
//                    if (new Random().nextInt(2) == 0) {
//                        countWin = -countWin;
//                    }
//                    win = true;
//                    data_won = new int[]{0, 1, 2, 3, 4};
//                    this.a2[0].isItemWon = true;
//                    this.a2[1].isItemWon = true;
//                    this.a2[2].isItemWon = true;
//                    this.a2[3].isItemWon = true;
//                    this.a2[4].isItemWon = true;
//                    win = true;
                    break;
                case 102:
                    win = false;
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

    public XYEntity[] arrayXY = new XYEntity[50];

    public final Vector g() {
        Vector var1;
        var1 = super.g();
        if (win) {
            return var1;
        }
        int size = this.q / 10;
        int tick = 0;
        for (int i = 0; i < 5; i++) {
            int y = this.r / 2 - ((this.r / 10) * 2);
            int x_temp = 0;
            if (i == 0) {
                x_temp = (this.q / 2) - size;
            } else if (i == 1) {
                x_temp = (this.q / 2);
            } else {
                x_temp = (this.q / 2) + ((i - 1) * size);
            }
            var1.add(new VDTT_hl(5000 + tick, x_temp, y, x_temp + 30, y + 30, (VDTT_hs) null, this));
            arrayXY[tick] = XYEntity.e(x_temp, y);
            tick++;
        }

        for (int i = 0; i < 5; i++) {
            int y = this.r / 2 - ((this.r / 10) * 2) + 35;
            int x_temp = 0;
            if (i == 0) {
                x_temp = (this.q / 2) - size;
            } else if (i == 1) {
                x_temp = (this.q / 2);
            } else {
                x_temp = (this.q / 2) + ((i - 1) * size);
            }
            var1.add(new VDTT_hl(5000 + tick, x_temp, y, x_temp + 30, y + 30, (VDTT_hs) null, this));
            arrayXY[tick] = XYEntity.e(x_temp, y);
            tick++;
        }
        for (int i = 0; i < 5; i++) {
            int y = this.r / 2 - ((this.r / 10) * 2) + 35 + 35;
            int x_temp = 0;
            if (i == 0) {
                x_temp = (this.q / 2) - size;
            } else if (i == 1) {
                x_temp = (this.q / 2);
            } else {
                x_temp = (this.q / 2) + ((i - 1) * size);
            }
            var1.add(new VDTT_hl(5000 + tick, x_temp, y, x_temp + 30, y + 30, (VDTT_hs) null, this));
            arrayXY[tick] = XYEntity.e(x_temp, y);
            tick++;
        }
        return var1;
    }
}
