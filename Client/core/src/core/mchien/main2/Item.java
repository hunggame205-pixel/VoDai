package core.mchien.main2;

import java.io.IOException;
import java.util.Comparator;
import java.util.Vector;

public final class Item implements Cloneable {

    public static final Comparator a = new VDTT_fr();
    public int b;
    public int c;
    public int d;
    public int e = -1;
    public int f;
    public byte g;
    public long h = -1L;
    public String strOptions = "";
    public String j = "";
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public byte s;
    public boolean t;
    private VDTT_ev x;
    public VDTT_ev u;
    public VDTT_ev v;
    public int w;

    public int yadd = 0;
    public boolean isItemWon;
    public float sizeeff = 1;
    public int countEff = 15;

    public final Item a() {
        try {
            Item var1;
            (var1 = (Item) super.clone()).u = null;
            var1.x = null;
            return var1;
        } catch (Exception var2) {
            VDTT_jb.a(var2);
            return null;
        }
    }

    public final Item b() {
        try {
            Item var1 = (Item) super.clone();
            if (this.u != null) {
                var1.u = this.u.o();
            }

            if (this.x != null) {
                var1.x = this.x.o();
            }

            return var1;
        } catch (Exception var2) {
            return null;
        }
    }

    public Item() {
    }

    public Item(int var1) {
        this.c = var1;
    }

    public Item(int var1, boolean var2) {
        this.c = (short) var1;
        this.t = var2;
    }

    public Item(int var1, boolean var2, int var3) {
        this.c = (short) var1;
        this.t = true;
        this.d = var3;
    }

    public final void a(Graphics var1) {
        if (this.c == 160) {
            this.t = true;
        }

        if (VDTT_ek.m().av == 1) {
            if (this.c == 830) {
                this.getItemTemplate().h = 772;
            } else if (this.c == 831) {
                this.getItemTemplate().h = 329;
            } else if (this.c == 832) {
                this.getItemTemplate().h = 798;
            } else if (this.c == 835) {
                this.getItemTemplate().h = 771;
            }
        } else if (VDTT_ek.m().av == 2) {
            if (this.c == 830) {
                this.getItemTemplate().h = 779;
            } else if (this.c == 831) {
                this.getItemTemplate().h = 330;
            } else if (this.c == 832) {
                this.getItemTemplate().h = 804;
            } else if (this.c == 835) {
                this.getItemTemplate().h = 778;
            }
        } else if (VDTT_ek.m().av == 3) {
            if (this.c == 830) {
                this.getItemTemplate().h = 786;
            } else if (this.c == 831) {
                this.getItemTemplate().h = 340;
            } else if (this.c == 832) {
                this.getItemTemplate().h = 810;
            } else if (this.c == 835) {
                this.getItemTemplate().h = 785;
            }
        } else if (VDTT_ek.m().av == 4) {
            if (this.c == 830) {
                this.getItemTemplate().h = 793;
            } else if (this.c == 831) {
                this.getItemTemplate().h = 327;
            } else if (this.c == 832) {
                this.getItemTemplate().h = 816;
            } else if (this.c == 835) {
                this.getItemTemplate().h = 792;
            }
        }

        short var2 = this.an();
        if (this.c == 435 && this.s == 15) {
            var2 = 998;
        }

        if (this.strOptions != null && this.strOptions.startsWith("436,") && !DataCenter.l()) {
            var2 = DataCenter.d().O[this.L()[0].b[1]].h;
            VDTT_aa.a(var1, var2, 0, 0, 0, 80, (byte) 3);
        } else {
            if (this.getItemTemplate() != null) {
                switch (this.c) {
                    case 295:
                        this.s = 6;
                        break;
                    case 296:
                        this.s = 8;
                        break;
                    case 297:
                        this.s = 10;
                }
            }

            if (isItemWon) {
                s = 16;
            }
            if (this.u != null) {
                this.u.n();
                this.u.a(var1);
            }

            if (this.getItemTemplate() != null) {
                if (isItemWon) {
                    if (countEff > 10) {
                        sizeeff -= 0.05f;
                    } else if (countEff > 5) {
                        sizeeff += 0.1f;
                    } else if (countEff > 0) {
                        sizeeff -= 0.1f;
                        if (sizeeff < 1) {
                            sizeeff = 1;
                        }
                    }

                    countEff--;
                    if (countEff <= -75) {
                        countEff = 15;
                    }
                    if (this.c == 655 && DataCenter.d().h % 100 == VDTT_jb.a(0, 20)) {
                        VDTT_dc.a2(var1, var2, 0, VDTT_jb.a(-1, 1), VDTT_jb.a(-1, 1), 3, sizeeff);
                    } else if (this.c == 9) {
                        VDTT_dc.a2(var1, var2 + DataCenter.d().h / 7 % 4, 0, 0, 0, 3, sizeeff);
                    } else if (this.getItemTemplate().f == 10) {
                        int[] var3 = new int[]{-2, -159, -5, -20, 0, 25, 70, 71, -112, -107, -71, -60};
                        var1.c((float) var3[this.getItemTemplate().i - 10]);
                        VDTT_dc.a2(var1, var2, 0, 0, 0, 3, sizeeff);
                        var1.r();
                    } else if (this.getItemTemplate().f == 100 && this.getItemTemplate().b.startsWith(Caption.vq)) {
                        if (VDTT_eq.a().d()) {
                            VDTT_dc.a2(var1, var2, 0, 0, 0, 3, sizeeff);
                            VDTT_dc.a2(var1, 647, 0, 0, 0, 3, sizeeff);
                        } else {
                            VDTT_dc.a2(var1, 646, 0, 0, 0, 3, sizeeff);
                            VDTT_dc.a2(var1, var2, 0, 0, 0, 3, sizeeff);
                        }
                    } else {
                        VDTT_dc.a2(var1, var2, 0, 0, 0, 3, sizeeff);
                    }
                } else {
                    if (this.c == 655 && DataCenter.d().h % 100 == VDTT_jb.a(0, 20)) {
                        VDTT_dc.a(var1, var2, 0, VDTT_jb.a(-1, 1), VDTT_jb.a(-1, 1), 3);
                    } else if (this.c == 9) {
                        VDTT_dc.a(var1, var2 + DataCenter.d().h / 7 % 4, 0, 0, 0, 3);
                    } else if (this.getItemTemplate().f == 10) {
                        int[] var3 = new int[]{-2, -159, -5, -20, 0, 25, 70, 71, -112, -107, -71, -60};
                        var1.c((float) var3[this.getItemTemplate().i - 10]);
                        VDTT_dc.a(var1, var2, 0, 0, 0, 3);
                        var1.r();
                    } else if (this.getItemTemplate().f == 100 && this.getItemTemplate().b.startsWith(Caption.vq)) {
                        if (VDTT_eq.a().d()) {
                            VDTT_dc.a(var1, var2, 0, 0, 0, 3);
                            VDTT_dc.a(var1, 647, 0, 0, 0, 3);
                        } else {
                            VDTT_dc.a(var1, 646, 0, 0, 0, 3);
                            VDTT_dc.a(var1, var2, 0, 0, 0, 3);
                        }
                    } else {
                        VDTT_dc.a(var1, var2, 0, 0, 0, 3);
                    }
                }
            }

            this.ar();
            if (this.x != null) {
                this.x.n();
                this.x.a(var1);
            }

        }
    }

    void ar() {
        if (this.x == null) {
            this.x = new VDTT_ev(0, 0, 0, -1);
            this.u = new VDTT_ev(0, 0, 0, -1);
            if (this.s >= 4) {
                this.x.k = 365;
                this.u.k = 366;
                if (this.s >= 4 && this.s <= 5) {
                    this.x.I = 0;
                    this.u.I = 0;
                } else if (this.s >= 6 && this.s <= 7) {
                    this.x.I = 25;
                    this.u.I = 25;
                } else if (this.s >= 8 && this.s <= 9) {
                    this.x.I = -112;
                    this.u.I = -112;
                } else if (this.s >= 10 && this.s <= 11) {
                    this.x.I = -107;
                    this.u.I = -107;
                } else if (this.s >= 12 && this.s <= 13) {
                    this.x.I = -160;
                    this.u.I = -160;
                } else if (this.s == 14) {
                    this.x.I = -71;
                    this.u.I = -71;
                } else if (this.s == 15) {
                    this.x.I = 70;
                    this.u.I = 70;
                } else if (this.s >= 16) {
                    this.x.I = 65;
                    this.u.I = 65;
                }
            }

            int var1 = VDTT_jb.a((int) 36);

            int var2;
            for (var2 = 0; var2 < var1; ++var2) {
                this.x.n();
            }

            var1 = VDTT_jb.a((int) 36);

            for (var2 = 0; var2 < var1; ++var2) {
                this.u.n();
            }
        }

        if (this.s >= 4) {
            this.x.k = 365;
            this.u.k = 366;
            if (this.s >= 4 && this.s <= 5) {
                this.x.I = 0;
                this.u.I = 0;
                return;
            }

            if (this.s >= 6 && this.s <= 7) {
                this.x.I = 25;
                this.u.I = 25;
                return;
            }

            if (this.s >= 8 && this.s <= 9) {
                this.x.I = -112;
                this.u.I = -112;
                return;
            }

            if (this.s >= 10 && this.s <= 11) {
                this.x.I = -107;
                this.u.I = -107;
                return;
            }

            if (this.s >= 12 && this.s <= 13) {
                this.x.I = -160;
                this.u.I = -160;
                return;
            }

            if (this.s == 14) {
                this.x.I = -71;
                this.u.I = -71;
                return;
            }

            if (this.s == 15) {
                this.x.I = 70;
                this.u.I = 70;
                return;
            }

            if (this.s >= 16) {
                this.x.I = 65;
                this.u.I = 65;
                return;
            }
        } else {
            this.x = null;
            this.u = null;
        }

    }

    public final int c() {
        if (this.m > 0) {
            return this.m;
        } else if (this.n > 0) {
            return this.n;
        } else if (this.k > 0) {
            return this.k;
        } else if (this.l > 0) {
            return this.l;
        } else {
            return this.o > 0 ? this.o : 0;
        }
    }

    public final int d() {
        if (this.m > 0) {
            return -3;
        } else if (this.n > 0) {
            return -4;
        } else if (this.k > 0) {
            return -5;
        } else if (this.l > 0) {
            return -6;
        } else if (this.p > 0) {
            return -32;
        } else {
            return this.o > 0 ? -9 : 0;
        }
    }

    public final String e() {
        if (this.m > 0) {
            return VDTT_jb.c(this.m) + " " + Caption.yP[0];
        } else if (this.n > 0) {
            return VDTT_jb.c(this.n) + " " + Caption.yP[1];
        } else if (this.k > 0) {
            return VDTT_jb.c(this.k) + " " + Caption.yP[2];
        } else if (this.l > 0) {
            return VDTT_jb.c(this.l) + " " + Caption.yP[3];
        } else if (this.p > 0) {
            return VDTT_jb.c(this.p) + " " + Caption.yP[5];
        } else {
            return this.o > 0 ? VDTT_jb.c(this.o) + " " + Caption.yP[4] : "";
        }
    }

    public final String f() {
        if (this.m > 0) {
            return Caption.yP[0];
        } else if (this.n > 0) {
            return Caption.yP[1];
        } else if (this.k > 0) {
            return Caption.yP[2];
        } else if (this.l > 0) {
            return Caption.yP[3];
        } else if (this.p > 0) {
            return Caption.yP[5];
        } else {
            return this.o > 0 ? Caption.yP[4] : "";
        }
    }

    public final String g() {
        VDTT_gz[] var1 = this.L();
        int var2 = 0;
        if (this.i() && var1 != null) {
            var2 = 0 + var1.length;
        }

        if (this.getItemTemplate().f == 34) {
            var2 = 100000;
        }

        if (this.c == 185) {
            var2 = 50000;
        }

        if (this.c == 186) {
            var2 = 100000;
        } else if (this.c == 187) {
            var2 = 200000;
        }

        return this.i() && !this.t ? VDTT_jb.c(var2) + Caption.fh : VDTT_jb.c(var2) + Caption.da;
    }

    public final VDTT_fu getItemTemplate() {
        try {
            if (this.c >= 0) {
                return DataCenter.d().O[this.c];
            }
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }

        return null;
    }

    public final boolean i() {
        if (this.ai()) {
            return false;
        } else {
            for (int var1 = 0; var1 < DataCenter.d().U.length; ++var1) {
                if (DataCenter.d().U[var1].a == this.getItemTemplate().f) {
                    return true;
                }
            }

            return false;
        }
    }

    public final boolean j() {
        return this.getItemTemplate().f == 1 && !this.ai();
    }

    public final boolean k() {
        return this.getItemTemplate().f == 0 || this.getItemTemplate().f == 2 || this.getItemTemplate().f == 4 || this.getItemTemplate().f == 6 || this.getItemTemplate().f == 8;
    }

    public final boolean l() {
        return this.getItemTemplate().f == 3 || this.getItemTemplate().f == 5 || this.getItemTemplate().f == 7 || this.getItemTemplate().f == 9;
    }

    public final boolean m() {
        return this.getItemTemplate().f == 12;
    }

    public final boolean n() {
        return this.as() || this.c == 310;
    }

    private boolean as() {
        try {
            VDTT_gz[] arrayOfVDTT_gz;
            if ((getItemTemplate()).f == 11 && (arrayOfVDTT_gz = L()) != null) {
                for (byte b = 0; b < arrayOfVDTT_gz.length; b++) {
                    VDTT_gz vDTT_gz;
                    if ((vDTT_gz = arrayOfVDTT_gz[b]).b[0] == 128 && (vDTT_gz = arrayOfVDTT_gz[b]).b[1] == arrayOfVDTT_gz[b].f() && arrayOfVDTT_gz[b].f() < 16000) {
                        return true;
                    }
                }
            }
        } catch (Exception exception) {
        }
        return false;
    }

    public final boolean o() {
        return this.at() || this.c == 685;
    }

    private boolean at() {
        try {
            if ((getItemTemplate()).f == 13) {
                VDTT_gz[] arrayOfVDTT_gz = L();
                byte b = 0;
                if (arrayOfVDTT_gz != null) {
                    for (byte b1 = 0; b1 < arrayOfVDTT_gz.length; b1++) {
                        VDTT_gz vDTT_gz;
                        if ((vDTT_gz = arrayOfVDTT_gz[b1]).b[0] >= 53 && (vDTT_gz = arrayOfVDTT_gz[b1]).b[0] <= 62 && (vDTT_gz = arrayOfVDTT_gz[b1]).b[1] == arrayOfVDTT_gz[b1].f() && arrayOfVDTT_gz[b1].f() < 16000 && ++b == 2) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception exception) {
        }
        return false;
    }

    public final boolean p() {
        return this.getItemTemplate().f == 21;
    }

    public final boolean q() {
        return this.getItemTemplate().f == 14 && this.getItemTemplate().i <= VDTT_ek.m().w();
    }

    public final boolean r() {
        VDTT_gz[] var1;
        if (this.getItemTemplate().f == 14 && (var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].a().c == 14) {
                    return true;
                }
            }
        }

        return false;
    }

    public final boolean s() {
        return this.getItemTemplate().f == 14 && this.h == -1L && this.s > 0;
    }

    public final boolean t() {
        return this.p() || this.v() || this.c == 162 || this.c == 823;
    }

    public final boolean u() {
        VDTT_gz[] var1;
        if (this.getItemTemplate().i >= 50 && (var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].b[0] == 159 || var1[var2].b[0] == 163 || var1[var2].b[0] == 164 || var1[var2].b[0] == 165) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean au() {
        if (!this.ai() && !this.x()) {
            if (!this.y()) {
                return false;
            } else if (this.c != 609 && this.c != 624 && this.c != 639 && this.c != 654) {
                VDTT_gz[] var1;
                if ((var1 = this.L()) != null) {
                    for (int var2 = 0; var2 < var1.length; ++var2) {
                        if (var1[var2].n()) {
                            return true;
                        }
                    }
                }

                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public final boolean v() {
        if (!this.ai() && !this.w()) {
            return this.getItemTemplate().f >= 0 && this.getItemTemplate().f <= 9 && (this.s < 14 || this.au() && this.s < 15);
        } else {
            return false;
        }
    }

    public final boolean w() {
        return this.getItemTemplate().f == 0;
    }

    public final boolean x() {
        return this.getItemTemplate().f == 0 || this.getItemTemplate().f == 3 || this.getItemTemplate().f == 5 || this.getItemTemplate().f == 7 || this.getItemTemplate().f == 9 || this.getItemTemplate().f == 11;
    }

    public final boolean y() {
        return this.k() || this.l() || this.j();
    }

    public final boolean z() {
        return this.c >= 1037 && this.c <= 1044;
    }

    public final boolean A() {
        if (this.z()) {
            return false;
        } else {
            return this.getItemTemplate().f == 35 || this.getItemTemplate().f == 36 || this.getItemTemplate().f == 32 || this.az();
        }
    }

    public final boolean B() {
        if (!this.ai() && !this.x()) {
            return this.getItemTemplate().f >= 0 && this.getItemTemplate().f <= 9 && this.s > 0;
        } else {
            return false;
        }
    }

    public final boolean C() {
        if (!this.ai() && !this.x()) {
            if (!this.y()) {
                return false;
            } else {
                VDTT_gz[] var1;
                if ((var1 = this.L()) != null) {
                    for (int var2 = 0; var2 < var1.length; ++var2) {
                        if (var1[var2].l()) {
                            return true;
                        }
                    }
                }

                return false;
            }
        } else {
            return false;
        }
    }

    public final boolean D() {
        return this.getItemTemplate().f == 12 || this.c == 684;
    }

    public final boolean E() {
        if (!this.ai() && !this.x()) {
            return this.getItemTemplate().f >= 0 && this.getItemTemplate().f <= 9 || this.getItemTemplate().f == 25;
        } else {
            return false;
        }
    }

    public final boolean F() {
        return this.getItemTemplate().f == 12 && this.s < 16 || this.c == 683;
    }

    public final boolean G() {
        if (this.c == 160) {
            return true;
        } else {
            VDTT_gz[] var1;
            if (this.getItemTemplate().f == 13 && (var1 = this.L()) != null) {
                int var2 = 0;

                for (int var3 = 0; var3 < var1.length; ++var3) {
                    if (var1[var3].b[0] >= 53 && var1[var3].b[0] <= 62 && var1[var3].b[1] == var1[var3].f()) {
                        ++var2;
                        if (var2 == 2) {
                            return false;
                        }
                    }
                }

                return true;
            } else {
                return false;
            }
        }
    }

    public final boolean H() {
        return this.getItemTemplate().f == 1 && this.getItemTemplate().i >= 50 && this.ay() || this.c == 353;
    }

    private boolean av() {
        return this.getItemTemplate().f == 6 || this.getItemTemplate().f == 5 || this.getItemTemplate().f == 9;
    }

    private boolean aw() {
        return this.getItemTemplate().f == 0 || this.getItemTemplate().f == 4 || this.getItemTemplate().f == 3;
    }

    private boolean ax() {
        if (!this.ai() && !this.x()) {
            if (!this.y()) {
                return false;
            } else if ((this.c < 923 || this.c > 926) && !this.au()) {
                VDTT_gz[] var1;
                if ((var1 = this.L()) != null) {
                    for (int var2 = 0; var2 < var1.length; ++var2) {
                        if (var1[var2].m()) {
                            return true;
                        }
                    }
                }

                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public final boolean I() {
        if (!this.ai() && !this.x()) {
            return this.ax() && !this.au() || this.c == 353 || this.c == 354 || this.c == 562 || this.c == 564 || this.c == 566;
        } else {
            return false;
        }
    }

    public final boolean J() {
        return this.av() && this.getItemTemplate().i >= 50 && this.ay() || this.c == 563;
    }

    public final boolean K() {
        return this.aw() && this.getItemTemplate().i >= 50 && this.ay() || this.c == 567;
    }

    public final void a(int var1) {
        VDTT_gz[] var2;
        if ((var2 = this.L()) != null) {
            int var3;
            int var4;
            int[] var5;
            if (var1 >= this.s) {
                for (var3 = this.s + 1; var3 <= var1; ++var3) {
                    for (var4 = 0; var4 < var2.length; ++var4) {
                        if (var2[var4].a().c != 8) {
                            var5 = var2[var4].a().a();
                            if (var3 <= var5.length) {
                                var2[var4].d(var5[var3 - 1]);
                            }
                        }
                    }
                }
            } else {
                for (var3 = this.s; var3 > var1; --var3) {
                    for (var4 = 0; var4 < var2.length; ++var4) {
                        if (var2[var4].a().c != 8) {
                            var5 = var2[var4].a().a();
                            if (var3 <= var5.length) {
                                var2[var4].d(-var5[var3 - 1]);
                            }
                        }
                    }
                }
            }
        }

        this.s = (byte) var1;
        this.strOptions = a(var2);
    }

    public final VDTT_gz[] L() {
        if (this.strOptions != null && this.strOptions.length() > 0) {
            String[] var1;
            VDTT_gz[] var2 = new VDTT_gz[(var1 = VDTT_jb.a(this.strOptions, ";")).length];

            for (int var3 = 0; var3 < var1.length; ++var3) {
                var2[var3] = new VDTT_gz(var1[var3]);
            }

            return var2;
        } else {
            return null;
        }
    }

    public static String a(Vector var0) {
        VDTT_gz[] var1 = new VDTT_gz[var0.size()];

        for (int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = (VDTT_gz) var0.get(var2);
        }

        return a(var1);
    }

    public static String a(VDTT_gz[] var0) {
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

    public static String b(int var0) {
        if (var0 >= 1000000000) {
            return VDTT_jb.c(var0 / 1000000) + "M";
        } else {
            return var0 >= 1000000 ? VDTT_jb.c(var0 / 1000) + "K" : VDTT_jb.c(var0);
        }
    }

    public final int M() {
        if (this.c == 190) {
            return this.d / 10;
        } else if (this.c == 826) {
            return this.d <= 0 ? 0 : this.d - 1;
        } else {
            return this.d <= 0 ? 1 : this.d;
        }
    }

    public final void c(int var1) {
        if (var1 <= 0) {
            this.d = 1;
        }

        this.d = var1;
    }

    public final String N() {
        if (this.h >= 2592000000L) {
            return this.h / 2592000000L + " " + Caption.yT[0];
        } else if (this.h >= 604800000L) {
            return this.h / 604800000L + " " + Caption.yT[1];
        } else if (this.h >= 86400000L) {
            return this.h / 86400000L + " " + Caption.yT[2];
        } else if (this.h >= 3600000L) {
            return this.h / 3600000L + " " + Caption.yT[3];
        } else {
            return this.h >= 60000L ? this.h / 60000L + " " + Caption.yT[4] : this.h / 1000L + " " + Caption.yT[5];
        }
    }

    public final String O() {
        return this.h == -1L ? Caption.mJ : VDTT_jb.g(this.h);
    }

    public final void a(Message var1) throws IOException {
        this.c = var1.f();
        if (this.c >= 0) {
            this.t = var1.c();
            this.h = var1.h();
            if (!this.i() && !this.ai()) {
                this.c(var1.i());
            } else {
                this.g = var1.readByte();
                this.s = var1.readByte();
                this.strOptions = var1.b.c();
                this.j = var1.b.c();
            }

            if (this.aA()) {
                this.strOptions = var1.b.c();
            }

            this.f = var1.f();
        }
    }

    public final boolean P() {
        VDTT_gz[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].b[0] == 159) {
                    return true;
                }
            }
        }

        return false;
    }

    public final boolean Q() {
        VDTT_gz[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].b[0] == 165) {
                    return true;
                }
            }
        }

        return false;
    }

    public final boolean R() {
        VDTT_gz[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].b[0] == 163) {
                    return true;
                }
            }
        }

        return false;
    }

    public final boolean S() {
        VDTT_gz[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].b[0] == 164) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean ay() {
        VDTT_gz[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].b[0] == 148) {
                    return true;
                }
            }
        }

        return false;
    }

    public final boolean T() {
        if (this.z()) {
            return true;
        } else {
            return this.getItemTemplate().f != 21 && this.getItemTemplate().f != 32 && this.getItemTemplate().f != 35 && this.getItemTemplate().f != 36 && this.getItemTemplate().f != 98 && this.getItemTemplate().f != 25 && this.c != 162 && this.c != 823 && this.c != 176;
        }
    }

    public final VDTT_gz a(Vector var1, int var2) {
        var2 = VDTT_gz.f(var2);
        VDTT_gz[] var3 = this.L();
        VDTT_gz var4 = null;
        if (var3 != null) {
            for (int var5 = 0; var5 < var3.length; ++var5) {
                if (var3[var5].a().c == 8) {
                    var1.add(var3[var5]);
                    if (var3[var5].b[0] == var2) {
                        var4 = var3[var5];
                    }
                }
            }
        }

        return var4;
    }

    public final int[] a(int var1, int var2) {
        VDTT_gz[] var3;
        if ((var3 = this.L()) == null) {
            return null;
        } else {
            int var4 = VDTT_gz.f(var2);
            int[] var5 = null;
            boolean var6 = this.U();

            for (int var7 = 0; var7 < var3.length; ++var7) {
                if (var3[var7].a().c == 8 && var3[var7].b[0] == var4) {
                    int var8 = var3[var7].i();
                    (var5 = new int[4])[0] = var2;
                    var5[1] = var8;
                    var5[2] = var8;
                    int[] var9 = var3[var7].a().a();

                    for (int var10 = var8 + 1; var10 <= var9.length; ++var10) {
                        if (var1 >= DataCenter.d().ar[var10]) {
                            if (var6) {
                                if (var10 > 17) {
                                    continue;
                                }
                            } else if (var10 > 16) {
                                continue;
                            }

                            var5[1] = var8;
                            var5[2] = var10;
                            var5[3] += DataCenter.d().ar[var10];
                            var1 -= DataCenter.d().ar[var10];
                            var3[var7].d(var9[var10 - 1]);
                            var3[var7].b[3] = var10;
                        }
                    }
                }
            }

            this.strOptions = a(var3);
            return var5;
        }
    }

    public final boolean U() {
        VDTT_gz[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].b[0] == 165 || var1[var2].b[0] == 164 || var1[var2].b[0] == 163 || var1[var2].b[0] == 159) {
                    return true;
                }
            }
        }

        return false;
    }

    public final int V() {
        VDTT_gz[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].b[0] == 349) {
                    return var1[var2].b[1];
                }
            }
        }

        return 0;
    }

    public final int W() {
        VDTT_gz[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].b[0] == 350) {
                    return var1[var2].f();
                }
            }
        }

        return 0;
    }

    public final int X() {
        VDTT_gz[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].b[0] == 350) {
                    return var1[var2].b[1];
                }
            }
        }

        return 0;
    }

    public final int Y() {
        VDTT_gz[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].b[0] == 298) {
                    return var1[var2].f();
                }
            }
        }

        return 0;
    }

    public final boolean Z() {
        long var1 = VDTT_jb.a();
        return this.h != -1L && this.h < var1;
    }

    public final boolean aa() {
        return this.c >= 670 && this.c <= 681;
    }

    public final boolean ab() {
        if (!this.ai() && !this.x()) {
            if (!this.y()) {
                return false;
            } else {
                VDTT_gz[] var1;
                if ((var1 = this.L()) != null) {
                    int var2 = 0;

                    for (int var3 = 0; var3 < var1.length; ++var3) {
                        if (var1[var3].b[0] == 298 && var1[var3].f() >= 5) {
                            ++var2;
                        }
                    }

                    if (var2 >= 3) {
                        return false;
                    }
                }

                return true;
            }
        } else {
            return false;
        }
    }

    private boolean az() {
        VDTT_gz[] var1;
        if (this.y() && (var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].k()) {
                    return true;
                }
            }
        }

        return false;
    }

    public final boolean ac() {
        return !this.t;
    }

    public final boolean ad() {
        return this.d > 1 && this.getItemTemplate().f != 24 && this.c != 499 && this.c != 500 && this.c != 927 && this.c != 952 && this.c != 938 && this.c != 1047 && this.c != 1130 && (this.c < 901 || this.c > 907) && !this.getItemTemplate().c.toLowerCase().contains(Caption.rS.toLowerCase()) && !this.getItemTemplate().c.contains("1.000");
    }

    public final boolean ae() {
        return this.getItemTemplate().d && this.d > 1;
    }

    public final boolean af() {
        return this.c == 168 || d(this.c);
    }

    public static boolean d(int var0) {
        if (var0 == 569 || var0 >= 716 && var0 <= 720) {
            return VDTT_ek.m().w() >= DataCenter.d().O[var0].i;
        } else {
            return false;
        }
    }

    public final boolean ag() {
        return this.c == 430 || this.c == 377 || this.c == 520 || this.c == 525 || this.c == 922 || this.c == 960;
    }

    public final String ah() {
        if (this.s > 14) {
            return 7 + this.s - 14 + Caption.sY;
        } else {
            return this.s % 2 == 0 ? this.s / 2 + Caption.sY : this.s / 2 + Caption.sZ;
        }
    }

    private boolean aA() {
        return this.getItemTemplate().f == 99 || this.getItemTemplate().f == 35 || this.getItemTemplate().f == 36 || this.getItemTemplate().f == 37;
    }

    public final boolean ai() {
        return (this.c >= 799 && this.c <= 806)||(this.getItemTemplate().f >= 17 && this.getItemTemplate().f <= 20);
    }

    public final boolean aj() {
        return this.c == 724;
    }

    public final boolean ak() {
        return this.getItemTemplate().b.toLowerCase().startsWith(Caption.uW);
    }

    public final boolean al() {
        VDTT_gz[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].b[0] == 413) {
                    return true;
                }
            }
        }

        return false;
    }

    public final void am() {
        this.t = this.c == 529 || this.c == 461 || this.c == 466 || this.c == 959 || this.c >= 1025 && this.c <= 1036;
    }

    public final short an() {
        if (DataCenter.l()) {
            label91:
            {
                if (this.getItemTemplate().f == 0) {
                    return (short) (68 + this.getItemTemplate().g - 1);
                }

                if (this.getItemTemplate().f != 2 && this.getItemTemplate().f != 3) {
                    if (this.getItemTemplate().f != 6 && this.getItemTemplate().f != 7) {
                        if (this.getItemTemplate().f == 11) {
                            return 450;
                        }

                        if (this.getItemTemplate().f == 15) {
                            return 449;
                        }

                        if (this.getItemTemplate().f == 14) {
                            return 451;
                        }

                        if ((this.c < 771 || this.c > 790) && this.c != 1002) {
                            if (this.c >= 727 && this.c <= 770 || this.c >= 1008 && this.c <= 1018) {
                                switch (this.getItemTemplate().i) {
                                    case 5:
                                        return (short) (730 + this.getItemTemplate().g - 1);
                                    case 10:
                                        return 390;
                                    case 15:
                                        return 760;
                                    case 20:
                                        return 759;
                                    case 25:
                                        return 761;
                                    case 30:
                                        return 391;
                                    case 35:
                                        return 762;
                                    case 40:
                                        return 392;
                                    case 45:
                                        return 763;
                                    case 50:
                                        return 393;
                                    case 55:
                                        return 764;
                                }
                            }
                            break label91;
                        }

                        return 102;
                    }

                    return 736;
                }

                return 735;
            }
        }

        if (this.ap()) {
            switch (this.c) {
                case 871:
                    return 848;
                case 872:
                    return 985;
                case 873:
                    return 986;
                case 874:
                    return 987;
                case 1111:
                    return 1066;
                default:
                    return 859;
            }
        } else {
            return this.getItemTemplate().h;
        }
    }

    public final boolean ao() {
        return this.c == 309 || this.c == 1089;
    }

    public final boolean ap() {
        return this.strOptions.contains(";481,");
    }

    public final int aq() {
        return this.ap() ? 135 : this.getItemTemplate().a();
    }

    // $FF: synthetic method
    public final Object clone() {
        return this.a();
    }
}
