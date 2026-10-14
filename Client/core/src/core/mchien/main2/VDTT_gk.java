package core.mchien.main2;

import java.io.IOException;
import java.util.Vector;

public final class VDTT_gk extends VDTT_n {

    public short k;
    public byte l;
    public byte m;
    public byte n;
    public byte o;
    public byte p = -1;
    public short I;
    public short J;
    public short K;
    public short L;
    public short M;
    public short N = 0;
    public short O = 0;
    public short P = 100;
    public short Q;
    public short R;
    public short S = 0;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public Vector Y = new Vector();
    public VDTT_ek Z;
    public int aa;
    public Vector ab = new Vector();
    public int ac;
    public int ad;
    public int ae;
    public boolean af;
    public boolean ag;
    public boolean ah;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public boolean al;
    public boolean am;
    public boolean an;
    public String ao;
    public VDTT_hr ap;
    public boolean aq = true;
    public int ar;
    public int as;
    public boolean at;
    public boolean au = true;
    public int av;
    public int aw;
    public boolean ax = true;
    public VDTT_ek ay;
    public int az;
    public int aA = Integer.MIN_VALUE;
    public int aB;
    public int aC;
    public boolean isFake;
    public int typeFrame;

    public VDTT_gk(int var1) {
        this.k = (short) var1;
        this.d(this.p().d, this.p().e);
    }

    public final void a(Message var1) throws IOException {
        if (VDTT_jb.b()) {
            this.y();
        }

        this.b = var1.f();
        this.U = var1.c();
        this.ao = var1.b.c();
        this.k = var1.f();
        this.c(var1.f(), var1.f());
        this.d(this.p().d, this.p().e);
        this.X = var1.f();
        this.m = var1.readByte();
        this.e = var1.readByte();
        this.V = var1.i();
        this.W = var1.i();
        this.n = var1.readByte();
        byte var2 = var1.readByte();

        for (int var3 = 0; var3 < var2; ++var3) {
            VDTT_ez var4 = new VDTT_ez(var1.f(), var1.i(), var1.h(), var1.i(), this);
            this.ab.add(var4);
        }

        if (VDTT_jb.b()) {
            this.d = 3;
        } else {
            this.d = 2;
        }

        this.o = this.p().q;
        if (this.e != 4) {
            this.e = 2;
            this.C();
        }

    }

    public final void m() {
        XYEntity var1;
        if (this.p().p != 3 && this.p().p != 13 && this.n != 8 && (var1 = VDTT_ek.b(this.objX, this.objY)) != null) {
            this.objY = var1.objY;
        }

        this.c(this.objX, this.objY);
    }

    public final void b(int var1, int var2) {
        int var3 = var1 - this.I;
        int var4 = var2 - this.J;
        this.I = this.Q = (short) var1;
        this.J = this.R = (short) var2;
        this.objX = (short) (this.objX + var3);
        this.objY = (short) (this.objY + var4);
        this.K = (short) (this.K + var3);
        this.L = (short) (this.L + var4);
    }

    public final void c(int var1, int var2) {
        this.objX = this.I = this.K = this.Q = (short) var1;
        this.objY = this.J = this.L = this.R = (short) var2;
    }

    private void y() {
        if (!this.o() && !this.z()) {
            this.e = 2;
        } else {
            this.e = 0;
        }
    }

    public final boolean n() {
        return this.p().p == 9 || this.p().p == 11;
    }

    public final boolean o() {
        return this.p().p == 2 || this.w() || this.p().p == 8;
    }

    private boolean z() {
        return this.p().p == 11 || this.p().p == 9;
    }

    public final VDTT_gl p() {
        if (VDTT_cw.v().C().d == 15 && VDTT_cw.v().cr > 20) {
            return DataCenter.d().G[242 + VDTT_cw.v().cr / 20];
        } else if (this.n == 8) {
            if (DataCenter.d().G[this.k].p == 3) {
                VDTT_gl var1 = DataCenter.d().G[260 + this.b % 2];
                XYEntity var2;
                if ((var2 = VDTT_ek.b(this.I, this.J)) != null) {
                    this.e = 2;
                    this.objY = this.L = var2.objY;
                }

                return var1;
            } else {
                return DataCenter.d().G[260 + this.b % 2];
            }
        } else {
            return DataCenter.d().G[this.k];
        }
    }

    public final int a() {
        return this.objX - this.q / 2;
    }

    public final int b() {
        return this.objX + this.q / 2;
    }

    public final int c() {
        return this.objY - this.r;
    }

    public final int d() {
        return this.objY;
    }

    public final int q() {
        return this.objY + this.r;
    }

    public final void r() {
        if (this.ae > 0) {
            --this.ae;
            if (this.ae == 0) {
                this.M();
            }
        }

        if (this.aB > 1) {
            --this.aB;
            if (this.aB <= 1) {
                this.aB = 0;
            }
        }

        if (this.at) {
            this.at = false;
            this.m();
        }

        if (this.ad > 0) {
            --this.ad;
        }

        if (this.as > 0) {
            --this.as;
        }

        try {
            try {

                if (this.ax && this.e != 4 && this.e != 5 && this.N()) {
                    if (this.objX < this.E() || this.K < this.E()) {
                        this.objX = this.K = this.Q = this.E();
                    }

                    if (this.objX > this.F() || this.K > this.F()) {
                        this.objX = this.K = this.Q = this.F();
                    }

                    if (this.objY < this.G() || this.L < this.G()) {
                        this.objY = this.L = this.R = this.G();
                    }

                    if (this.objY > this.H() || this.L > this.H()) {
                        this.objY = this.L = this.R = this.H();
                    }
                }
            } catch (Exception var4) {
            }

            this.ac = 1;
            this.af = this.ag = this.ah = this.ai = this.aj = this.ak = this.al = this.am = this.an = false;
            if (this.ap != null && this.ap.a(this.k(), this.objY - this.r + 2)) {
                this.ap = null;
            }

            boolean var1 = false;

            int var2;
            for (var2 = 0; var2 < this.ab.size(); ++var2) {
                VDTT_ez var3;
                switch ((var3 = (VDTT_ez) this.ab.elementAt(var2)).a) {
                    case 8:
                        this.af = true;
                        this.ac = 2;
                        break;
                    case 9:
                        this.ag = true;
                        this.ac = 3;
                        break;
                    case 10:
                        this.ah = true;
                        this.ac = 4;
                        break;
                    case 11:
                        this.ai = true;
                        this.ac = 2;
                        break;
                    case 12:
                        var1 = true;
                        this.ak = true;
                        break;
                    case 35:
                    case 36:
                    case 161:
                        var1 = true;
                        break;
                    case 38:
                        var1 = true;
                        this.aj = true;
                        break;
                    case 73:
                        this.ac = 3;
                        break;
                    case 76:
                        this.ac = 2;
                        break;
                    case 109:
                    case 146:
                    case 197:
                        this.al = true;
                        var1 = true;
                        break;
                    case 152:
                        this.am = true;
                        break;
                    case 170:
                        this.an = true;
                }

                var3.a((VDTT_n) this);
            }

            if (this.V <= 0 && !this.h()) {
                this.M();
            }

            if (this.aa > 0) {
                --this.aa;
                if (this.aa == 1) {
                    this.e = 0;
                }
            }

            switch (this.e) {
                case 0:
                    if (this.p().p == 6) {
                        if (VDTT_jb.a((int) 300) == 0) {
                            this.aq = false;
                            this.e = 2;
                            this.c = 0;
                        }
                    } else if (VDTT_jb.a((int) 80) == 0 || this.aq) {
                        this.aq = false;
                        this.y();
                    }
                    break;
                case 1:
                    short var6 = this.objX;
                    short var9 = this.objY;
                    if (this.p().a != null && this.c < this.p().a[1].length - 1) {
                        this.objX = (short) (this.objX + this.av);
                        if (this.p().p == 3) {
                            this.objY = (short) (this.objY + this.aw);
                        }
                    } else if (this.z()) {
                        this.e = 2;
                    } else {
                        this.y();
                    }

                    if (this.p().p == 7) {
                        if (var6 == this.objX) {
                            this.objX = (short) (this.objX + this.av);
                        }

                        if (this.objX < 16) {
                            this.objX = 16;
                        } else if (this.objX > VDTT_cw.v().aj - 16) {
                            this.objX = (short) (VDTT_cw.v().aj - 16);
                        }
                    }

                    if (var6 != this.objX || var9 != this.objY) {
                        this.a(var6, var9);
                    }

                    if (this.p().p == 7) {
                        this.e = 0;
                    }
                    break;
                case 2:
                    //
                    if (!var1 && (this.ac == 0 || DataCenter.d().h % this.ac == 0)) {
                        this.C();
                    }

                    this.Q = this.objX;
                    this.R = this.objY;
                    if (!this.N() && VDTT_ek.b(this.objX, this.objY) != null) {
                        this.e = 7;
                    }
                    break;
                case 3:
                    this.B();
                case 4:
                case 6:
                default:
                    break;
                case 5:
                    this.M();
                    break;
                case 7:
                    if (!var1 && (this.ac == 0 || DataCenter.d().h % this.ac == 0)) {
                        this.C();
                    }

                    this.Q = this.objX;
                    this.R = this.objY;
                    if (VDTT_ek.b(this.objX, this.objY) == null) {
                        this.e = 2;
                    }
            }

            if (this.p().p != 3 && this.p().p != 13 && this.p().p != 4 && this.N() && this.e != 5 && this.e != 4) {
                this.objY = this.J;
                this.R = this.objY;
            }

            if (this.e == 5 || this.e == 4) {
                for (int var10 = this.Y.size() - 1; var10 >= 0; --var10) {
                    VDTT_fs var8;
                    (var8 = (VDTT_fs) this.Y.elementAt(var10)).a(var8.l, var8.m, this.k(), this.l());
                    this.Y.remove(var8);
                    VDTT_cw.v().ar.addElement(var8);
                }
            }

            if (this.e != 5 && this.e != 1 && this.e != 3 && this.p().p != 7 && this.o()) {
                this.objX = this.I;
                this.objY = this.J;
            }

            if (!this.aj && !this.al && (this.ac == 0 || DataCenter.d().h % this.ac == 0)) {
                this.a(var1);
            }

            XYEntity var11;
            if ((var2 = this.I()) > 0) {
                if (this.ay == null) {
                    this.ay = new VDTT_ek();
                    this.ay.ag = this.ay.ai = 1;
                    this.ay.e = 0;
                    switch (this.k) {
                        case 75:
                        case 80:
                        case 201:
                            this.ay.bs = true;
                    }
                }

                var11 = VDTT_ek.b(this.objX, this.objY);
                if (this.ay.aV == null && this.az > 0 && (var11 != null || VDTT_jb.b(this.objY - this.J) > 100) && this.az < 20) {
                    this.az = 0;
                    VDTT_cw.v().at.add(new VDTT_ev(460, this.objX, this.objY - 30, 1));
                    this.ad = 20;
                    if (var11 != null) {
                        this.f(this.objX, var11.objY);
                    }
                }

                this.ay.f(this.objX, this.objY);
                if (this.az > 0 && this.e == 2) {
                    this.ay.e = 0;
                } else {
                    this.ay.e = this.e;
                }

                if (this.ad > 0) {
                    if (this.ad == 10) {
                        VDTT_cw.v().at.add(new VDTT_ev(460, this.objX, this.objY - 30, 1));
                    }
                } else {
                    this.ay.B();
                    this.ay.be.clear();
                    DataCenter.d().z[var2].a(this.ay.be, false);
                }

                if (var11 != null) {
                    this.ay.aE = 3;
                }
            }

            if (this.aA == Integer.MIN_VALUE) {
                this.aA = this.objY;
                if (this.p().p != 3 && this.p().p != 13 && this.p().p != 7 && this.p().p != 8 && this.n == 0) {
                    if ((var11 = VDTT_ek.b(this.objX, this.objY - 5)) != null) {
                        this.aA = var11.objY;
                    }

                    for (int var7 = 0; var7 < 10 && VDTT_cw.v().U.a(this.objX, this.aA); ++var7) {
                        --this.aA;
                    }
                }
            }

        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    private void a(short var1, short var2) {
        if (this.objX < this.I - this.p().o + 1) {
            this.objX = (short) (this.I - this.p().o + 1);
        } else if (this.objY < this.J - this.p().o) {
            this.objY = (short) (this.J - this.p().o);
        } else if (this.objX > this.I + this.p().o - 1) {
            this.objX = (short) (this.I + this.p().o - 1);
        } else if (this.objY > this.J + this.p().o) {
            this.objY = (short) (this.J + this.p().o);
        }

        if (this.p().p != 3 && VDTT_ek.b(this.objX, this.objY) != null || this.ay != null && this.ay.L()) {
            this.objX = var1;
            this.objY = var2;
        }

        this.Q = this.objX;
        this.R = this.objY;
    }

    private void A() {
        if (this.ah) {
            ++this.f;
            if (this.f >= 20) {
                this.f = 0;
            }
        }

    }

    private void B() {
        try {
            if (this.ay == null) {
                if (!this.o() && this.S != 3) {
                    if (this.T) {
                        if (this.S == 0) {
                            this.O = (short) (this.O + 2);
                            this.objX += this.O;
                            if (this.O >= 4) {
                                this.S = 1;
                                return;
                            }
                        } else if (this.S == 1) {
                            this.O = (short) (this.O - 2);
                            this.objX += this.O;
                            if (this.O < -3) {
                                this.S = 2;
                                return;
                            }
                        } else if (this.S == 2) {
                            ++this.O;
                            if (this.objX + this.O < this.M) {
                                this.objX += this.O;
                            } else {
                                this.objX = this.M;
                                this.S = 3;
                            }

                            return;
                        }
                    } else if (this.S == 0) {
                        this.O = (short) (this.O - 2);
                        this.objX += this.O;
                        if (this.O <= -4) {
                            this.S = 1;
                            return;
                        }
                    } else if (this.S == 1) {
                        this.O = (short) (this.O + 2);
                        this.objX += this.O;
                        if (this.O > 4) {
                            this.S = 2;
                            this.O = 0;
                            return;
                        }
                    } else if (this.S == 2) {
                        ++this.O;
                        if (this.objX - this.O > this.M) {
                            this.objX -= this.O;
                            return;
                        }

                        this.objX = this.M;
                        this.S = 3;
                    }
                }

            }
        } catch (Exception var1) {
        }
    }

    public final void a(VDTT_n var1) {
        this.e = 3;
        this.c = 0;
        this.O = this.N = this.S = 0;
        this.M = this.objX;
        this.a((XYEntity) var1);
        int var3;
        int var4;
        int var7;
        int var10;
        if (this.ay == null) {
            if (VDTT_jb.a((XYEntity) this, (XYEntity) var1) > 100) {
                var7 = 0;
                var3 = 0;
                if (this.p().m.length > 0) {
                    var4 = VDTT_jb.a(this.p().m.length);
                    var7 = this.p().m[var4];
                    if (this.p().m.length == this.p().n.length) {
                        var3 = this.p().n[var4];
                    }
                }

                if (var7 == 0) {
                    var7 = 83;
                }

                if (var3 == 0) {
                    var3 = 445;
                }

                var4 = this.k();
                var10 = this.l();
                if (this.p().s != null) {
                    if (this.objX > var1.objX) {
                        var4 = this.objX + this.p().s.c;
                        var10 = this.objY + this.p().s.d;
                    } else {
                        var4 = this.objX - this.p().s.c;
                        var10 = this.objY + this.p().s.d;
                    }
                }

                VDTT_cw.v().as.add(new VDTT_er(var7, var4, var10, var1, var3, 1, false, VDTT_cw.v().as, VDTT_cw.v().au));
            }

            this.T = this.objX > var1.objX;
        } else {
            this.az = 100;
            this.ay.a((XYEntity) var1);
            int[] var2 = new int[]{506, 607, 618, 629, 640, 651, 662};
            var3 = VDTT_jb.b(80, 20, 20, 20, 20, 20, 20);
            var4 = var2[var3];
            if (this.p().m.length > 0 && this.p().m[0] != 0 && VDTT_jb.a((int) 10) == 0) {
                var4 = this.p().m[VDTT_jb.a(this.p().m.length)];

                for (var10 = 0; var10 < DataCenter.d().T.length; ++var10) {
                    if (DataCenter.d().T[var10].d == var4 && DataCenter.d().T[var10].e == 1) {
                        var4 = DataCenter.d().T[var10].c;
                        break;
                    }
                }
            } else if (this.ay.aV == null && (VDTT_jb.a((XYEntity) this, (XYEntity) var1) > 80 || VDTT_jb.b(this.objY - var1.objY) > 20)) {
                VDTT_cw.v().at.add(new VDTT_ev(460, this.objX, this.objY - 30, 1));
                this.ad = 20;
                short var5 = var1.objY;
                short var6 = var1.objX;
                if (VDTT_jb.b()) {
                    var7 = var6 - VDTT_jb.a(20, 35);
                } else {
                    var7 = var6 + VDTT_jb.a(20, 35);
                }

                XYEntity var8;
                if ((var8 = VDTT_ek.b(var7, var5)) != null && VDTT_jb.b(var8.objY, var5) < 40) {
                    var5 = var8.objY;
                }

                this.f(var7, var5);
            }

            if (this.ay.aV == null) {
                this.ay.aZ = DataCenter.d().T[var4].a();
                VDTT_ek var10000 = this.ay;
                VDTT_ii var9 = new VDTT_ii(this.ay.aZ, this.ay, var1);
                var10000.aV = var9;
            }

        }
    }

    private void a(boolean var1) {
        try {
            if (this.d != 2 && this.d != 0 && !this.w()) {
                this.g = false;
            } else {
                this.g = true;
            }

            if (this.e != 4 && this.e != 6) {
                ++this.c;
                if (this.e == 1 || this.e == 5) {
                    if (this.c >= this.p().a[1].length) {
                        this.c = 0;
                    }

                    this.l = (byte) this.p().a[1][this.c];
                    return;
                }

                if (var1 && this.e == 2) {
                    this.c = 0;
                    this.e = 0;
                }

                if (this.p > 0) {
                    if (this.c >= this.p().a[this.p].length) {
                        this.c = 0;
                        this.p = -1;
                        if (this.e == 3) {
                            this.y();
                        }
                    }
                } else if (this.c >= this.p().a[this.e].length) {
                    this.c = 0;
                    if (this.e == 3) {
                        this.y();
                    }
                }

                if (this.e == 3 && this.p().a.length > 4) {
                    if (this.p == -1) {
                        this.p = (byte) (this.e + VDTT_jb.a(this.p().a.length - this.e));
                    }

                    this.l = (byte) this.p().a[this.p][this.c];
                    return;
                }

                this.l = (byte) this.p().a[this.e][this.c];
            }

        } catch (Exception var2) {
        }
    }

    private void C() {
        if (this.az > 0) {
            --this.az;
        } else {
            if (VDTT_jb.b(this.objX - this.I) > this.p().o + 30 && this.N()) {
                this.objX = this.I;
            }

            int var1;
            if ((var1 = VDTT_jb.b(this.objY - this.J)) > this.p().o + 30 && !this.N()) {
                this.objY = this.J;
            }

            if (this.p().p != 3 && this.p().p != 4 && this.p().p != 13 && var1 > 20 && !this.N() && this.n != 8) {
                this.objX = this.I;
                this.objY = this.J;
            }

            if (this.as <= 0) {
                if (this.o()) {
                    this.e = 0;
                } else {
                    if (this.objX == this.K && this.objY == this.L) {
                        try {
                            if (this.p().p == 6) {
                                if (this.c >= this.p().a[this.e].length - 1) {
                                    this.e = 0;
                                }

                                return;
                            }
                        } catch (Exception var4) {
                            this.e = 0;
                            return;
                        }

                        if (this.p().p == 12) {
                            var1 = VDTT_jb.a((int) 15);
                        } else {
                            var1 = VDTT_jb.a((int) 10);
                        }

                        if (this.z()) {
                            var1 = 9;
                        }

                        short var2;
                        short var3;
                        label168:
                        {
                            var2 = this.L;
                            if (this.p().o >= 100 && this.p().p == 3) {
                                if (var1 != 9) {
                                    this.K = (short) (this.I - this.p().o + VDTT_jb.a(this.p().o * 2));
                                    this.L = (short) (this.J - this.p().o + VDTT_jb.a(this.p().o * 2));
                                    break label168;
                                }
                            } else {
                                var3 = this.p().o;
                                if (this.n == 8) {
                                    var3 = 30;
                                }

                                switch (var1) {
                                    case 0:
                                        this.K = (short) (this.I - var3);
                                        this.L = (short) (this.J - var3);
                                        break label168;
                                    case 1:
                                        this.K = this.I;
                                        this.L = (short) (this.J - var3);
                                        break label168;
                                    case 2:
                                        this.K = (short) (this.I + var3);
                                        this.L = (short) (this.J - var3);
                                        break label168;
                                    case 3:
                                        this.K = (short) (this.I - var3);
                                        this.L = this.J;
                                        break label168;
                                    case 4:
                                        this.K = this.I;
                                        this.L = this.J;
                                        break label168;
                                    case 5:
                                        this.K = (short) (this.I + var3);
                                        this.L = this.J;
                                        break label168;
                                    case 6:
                                        this.K = (short) (this.I - var3);
                                        this.L = (short) (this.J + var3);
                                        break label168;
                                    case 7:
                                        this.K = this.I;
                                        this.L = (short) (this.J + var3);
                                        break label168;
                                    case 8:
                                        this.K = (short) (this.I + var3);
                                        this.L = (short) (this.J + var3);
                                        break label168;
                                }
                            }

                            this.e = 0;
                        }

                        if (this.p().p != 3) {
                            this.L = (short) var2;
                            if (this.au) {
                                var3 = this.objX;
                                if (this.K < this.objX) {
                                    do {
                                        if (VDTT_ek.b(var3 = (short) (var3 - 5), this.L) != null) {
                                            var3 = (short) (var3 + 5);
                                            break;
                                        }
                                    } while (var3 > this.K);
                                } else {
                                    do {
                                        if (VDTT_ek.b(var3 = (short) (var3 + 5), this.L) != null) {
                                            var3 = (short) (var3 - 5);
                                            break;
                                        }
                                    } while (var3 < this.K);
                                }

                                this.K = var3;
                            }
                        }
                    } else if (this.p().p == 1 && DataCenter.d().h % 2 == 0 || this.p().p == 5 && DataCenter.d().h % 3 == 0 || this.p().p != 1 && this.p().p != 5) {
                        this.D();
                    }

                    this.A();
                }
            }
        }
    }

    private void D() {
        if (this.objX > this.K) {
            this.objX = (short) (this.objX - this.o);
            if (this.objX < this.K) {
                this.objX = this.K;
            }

            this.d = 3;
        } else if (this.objX < this.K) {
            this.objX = (short) (this.objX + this.o);
            if (this.objX > this.K) {
                this.objX = this.K;
            }

            this.d = 2;
        }

        if (this.objY > this.L) {
            this.objY = (short) (this.objY - this.o);
            if (this.objY < this.L) {
                this.objY = this.L;
                return;
            }
        } else if (this.objY < this.L) {
            this.objY = (short) (this.objY + this.o);
            if (this.objY > this.L) {
                this.objY = this.L;
            }
        }

    }

    public final void i() {
        super.i();
    }

    public int dxMove = -1;
    public int dyMove = -1;
    public int dxStand = -1;
    public int dyStand = -1;
    public int frameStartMove = -1;
    public int frameEndMove = -1;
    public int frameStartStand = -1;
    public int frameEndStand = -1;

    public final void a(Graphics var1) {
        if (!VDTT_jb.e() && this.ar != 2 && this.ad <= 0 && this.aa <= 0 && this.V != 0) {
            if (isFake) {
                if (typeFrame == 1) {
                    VDTT_dc.b(var1, 10000 + (frameStartStand + (DataCenter.d().h % (frameEndStand - frameStartStand))), this.g ? -360 : 0, this.objX + (this.g ? -dxStand : dxStand), this.objY + dyStand, 33);

                } else if (typeFrame == 0) {
                    VDTT_dc.b(var1, 10000 + (frameStartMove + (DataCenter.d().h % (frameEndMove - frameStartMove))), this.g ? -360 : 0, this.objX + (this.g ? -dxMove : dxMove), this.objY + dyMove, 33);
                }
            } else if (this.am) {
                VDTT_dc.a(var1, 437, this.g ? -360 : 0, this.objX, this.objY - 22, 3);
            } else if (this.an) {
                VDTT_dc.a(var1, 382, this.g ? -360 : 0, this.objX, this.objY - 5, 3);
            } else {
                if (this.k == 215 || this.k == 216) {
                    this.g = true;
                }

                if (this.k == 217 || this.k == 218) {
                    this.g = false;
                }

                if (this.e != 4 && this.e != 6 && this.p().b != null) {
                    if (this.ay != null) {
                        if (this.k == 237) {
                            this.ay.bO = true;
                        }

                        if (this.ay.aV != null) {
                            this.g = this.ay.aF != 3;
                        }

                        this.ay.a(var1, this.objX, this.objY, this.ay.be, this.ay.K, this.ay.L, !this.g);
                        return;
                    }

                    if (this.ar == 1) {
                        var1.d(40);
                    }

                    if (this.aC > 0) {
                        if (this.aC % 2 == 0) {
                            var1.a(1.2F, 0.5F);
                        }

                        --this.aC;
                    }

                    if (this.af) {
                        var1.c(-7452415);
                    } else if (this.ag) {
                        var1.c(-14383350);
                    } else if (!this.ah && !this.aj) {
                        if (this.ai) {
                            var1.c(-181445);
                        } else if (this.ak) {
                            this.l = (byte) this.p().a[1][0];
                        }
                    } else {
                        var1.c(-14466309);
                    }

                    VDTT_fh var2 = this.p().b[this.l];
                    boolean var4 = true;
                    var1.j = var4;
                    if (this.n == 11) {
                        var1.c(180.0F);
                    } else if (this.n == 2) {
                        var1.c(150.0F);
                    } else if (this.n == 1) {
                        var1.c(120.0F);
                    } else if (this.n == 10) {
                        var1.c(90.0F);
                    } else if (this.n == 9) {
                        var1.c(60.0F);
                    } else if (DataCenter.l() && (this.k >= 158 && this.k <= 162 || this.k >= 66 && this.k <= 72 || this.k >= 173 && this.k <= 177)) {
                        var1.c((float) (this.k * this.k * this.k % 180));
                    }

                    int var3;
                    for (var3 = 0; var3 < var2.a.length; ++var3) {
                        short var7 = var2.a[var3].a;
                        if (this.k == 237) {
                            if (this.g) {
                                VDTT_aa.c(var1, var7, var2.a[var3].a(this.g), this.objX - var2.a[var3].c * 76 / 100, this.objY + var2.a[var3].d * 76 / 100, 76, 33);
                            } else {
                                VDTT_aa.c(var1, var7, var2.a[var3].a(this.g), this.objX + var2.a[var3].c * 76 / 100, this.objY + var2.a[var3].d * 76 / 100, 76, 33);
                            }
                        } else if (this.g) {
                            VDTT_dc.b(var1, var7, var2.a[var3].a(this.g), this.objX - var2.a[var3].c, this.objY + var2.a[var3].d, 33);
                        } else {
                            VDTT_dc.b(var1, var7, var2.a[var3].a(this.g), this.objX + var2.a[var3].c, this.objY + var2.a[var3].d, 33);
                        }
                    }

                    if (this.n == 11 || this.n == 2 || this.n == 1 || this.n == 10 || this.n == 9 || VDTT_cw.v().bg != null && VDTT_cw.v().bg.equals(this) || DataCenter.l() && (this.k >= 158 && this.k <= 162 || this.k >= 66 && this.k <= 72 || this.k >= 173 && this.k <= 177)) {
                        var1.r();
                    }

                    var4 = false;
                    var1.j = var4;
                    var1.l = 1.0F;
                    var1.f();
                    boolean var5 = true;
                    VDTT_gk var6 = this;
                    var3 = 0;

                    VDTT_ez var10000;
                    while (true) {
                        if (var3 >= var6.ab.size()) {
                            var10000 = null;
                            break;
                        }

                        VDTT_ez var8;
                        if ((var8 = (VDTT_ez) var6.ab.get(var3)).c().a == 146) {
                            var10000 = var8;
                            break;
                        }

                        ++var3;
                    }

                    if (var10000 != null) {
                        VDTT_dc.b(var1, 5765, 0, this.objX + 2, this.objY - 9, 33);
                    }
                }

            }
        }
    }

    private short E() {
        short var1 = this.p().o;
        if (this.n == 8) {
            var1 = 30;
        }

        return (short) (this.I - var1);
    }

    private short F() {
        short var1 = this.p().o;
        if (this.n == 8) {
            var1 = 30;
        }

        return (short) (this.I + var1);
    }

    private short G() {
        return (short) (this.J - this.p().o);
    }

    private short H() {
        return (short) (this.J + this.p().o);
    }

    public final VDTT_fi s() {
        try {
            return this.p().b[this.p().a[4][0]].a[0];
        } catch (Exception var1) {
            return null;
        }
    }

    private int I() {
        try {
            int var1 = 0;

            for (int var2 = 0; var2 < this.p().a[5].length; ++var2) {
                var1 += this.p().a[5][var2];
            }

            return var1;
        } catch (Exception var3) {
            return -1;
        }
    }

    public final String f() {
        return VDTT_jb.c(this.V);
    }

    public final String g() {
        return this.p().k;
    }

    public final int a(int var1) {
        if (this.W == 0) {
            return var1;
        } else {
            long var2 = 0L;

            try {
                if ((var2 = (long) this.V * (long) var1 / (long) this.W) > (long) var1) {
                    var2 = (long) var1;
                }
            } catch (Exception var4) {
            }

            if (var2 < 0L) {
                var2 = 0L;
            }

            return (int) var2;
        }
    }

    private boolean J() {
        return this.k == 101 || this.k == 240;
    }

    private boolean K() {
        return this.k == 102 || this.k == 241;
    }

    public final boolean v() {
        if (!this.h() && (VDTT_cw.v().C().d != 6 || VDTT_cw.v().ch != 1 || !this.J()) && (VDTT_cw.v().C().d != 6 || VDTT_cw.v().ch != 2 || !this.K())) {
            if (this.p().p != 13) {
                return true;
            } else {
                VDTT_il var1;
                return (var1 = VDTT_cw.v().T()) != null && var1.e == this.k || VDTT_cw.v().bx != null && VDTT_cw.v().bx.f == this.k;
            }
        } else {
            return false;
        }
    }

    private boolean L() {
        if (VDTT_cw.v().C().d == 15 && VDTT_cw.v().cr < 70 && (VDTT_cw.v().bp == null || !VDTT_cw.v().bp.a())) {
            return false;
        } else {
            return this.k == 273 || this.n == 7 || VDTT_jb.b(VDTT_ek.m().w() - this.X) <= 8;
        }
    }

    public final void b(Graphics var1) {
        if (!VDTT_jb.e() && this.ar != 2 && this.ad <= 0 && this.aa <= 0 && this.V != 0) {
            int var3 = 25;
            int var4 = this.p().e;
            if (this.k == 237) {
                var4 -= 12;
            } else if (this.n == 8) {
                var4 = this.p().e;
            }

            if (this.e != 4 && this.e != 6 && this.k != 240 && this.k != 241) {
                int var2 = -65536;
                if (!VDTT_cw.v().V() || VDTT_cw.v().C().d == 24) {
                    if (this.x()) {
                        var2 = -16711681;
                    } else if (!this.L()) {
                        var2 = -9942667;
                    }
                }

                int var10004;
                if (this.p().p == 9) {
                    var10004 = this.objY - var4 - 10;
                    VDTT_dg.b(VDTT_dg.d, var1, this.p().k, this.objX, var10004, 2, -1, -16777216);
                } else if (this.p().p == 10) {
                    var3 = 15;
                    if (VDTT_cw.v().bg != null && VDTT_cw.v().bg.equals(this)) {
                        var10004 = this.objY - var4 - 8;
                        VDTT_dg.b(VDTT_dg.d, var1, this.p().k, this.objX, var10004, 2, -16646423, -16777216);
                        var3 = 23;
                    }
                } else if (this.n == 1) {
                    var3 = 35;
                    VDTT_dg.b(VDTT_dg.d, var1, Caption.jf, this.objX, this.objY - var4 - 18, 2, -16742145, -16777216);
                    var1.f(-16777216);
                    var1.c(this.objX - 23, this.objY - var4 - 9, 46, 6);
                    var1.f(var2);
                    var1.c(this.objX - 22, this.objY - var4 - 8, this.a(44), 4);
                } else if (this.n == 2) {
                    var3 = 35;
                    VDTT_dg.b(VDTT_dg.d, var1, Caption.jg, this.objX, this.objY - var4 - 18, 2, -3407617, -16777216);
                    var1.f(-16777216);
                    var1.c(this.objX - 27, this.objY - var4 - 10, 54, 7);
                    var1.f(var2);
                    var1.c(this.objX - 26, this.objY - var4 - 9, this.a(52), 5);
                } else if (this.n == 8) {
                    var3 = 35;
                    var10004 = this.objY - var4 - 18;
                    VDTT_dg.b(VDTT_dg.d, var1, this.p().k, this.objX, var10004, 2, -5113342, -16777216);
                    var1.f(-16777216);
                    var1.c(this.objX - 27, this.objY - var4 - 10, 54, 7);
                    var1.f(var2);
                    var1.c(this.objX - 26, this.objY - var4 - 9, this.a(52), 5);
                } else if (this.n == 9) {
                    var3 = 35;
                    VDTT_dg.b(VDTT_dg.d, var1, Caption.sf, this.objX, this.objY - var4 - 18, 2, -603281, -16777216);
                    var1.f(-16777216);
                    var1.c(this.objX - 27, this.objY - var4 - 10, 54, 7);
                    var1.f(var2);
                    var1.c(this.objX - 26, this.objY - var4 - 9, this.a(52), 5);
                } else if (this.n == 10) {
                    var3 = 35;
                    VDTT_dg.b(VDTT_dg.d, var1, Caption.sg, this.objX, this.objY - var4 - 18, 2, -9439541, -16777216);
                    var1.f(-16777216);
                    var1.c(this.objX - 23, this.objY - var4 - 12, 46, 6);
                    var1.f(var2);
                    var1.c(this.objX - 22, this.objY - var4 - 11, this.a(44), 4);
                } else if (this.n == 11) {
                    var3 = 35;
                    VDTT_dg.b(VDTT_dg.d, var1, Caption.vi, this.objX, this.objY - var4 - 18, 2, -16712436, -16777216);
                    var1.f(-16777216);
                    var1.c(this.objX - 23, this.objY - var4 - 12, 46, 6);
                    var1.f(var2);
                    var1.c(this.objX - 22, this.objY - var4 - 11, this.a(44), 4);
                } else if (this.n == 7) {
                    var3 = 35;
                    var10004 = this.objY - var4 - 19;
                    VDTT_dg.b(VDTT_dg.d, var1, this.p().l, this.objX, var10004, 2, -5113342, -16777216);
                    var1.f(-16777216);
                    var1.c(this.objX - 23, this.objY - var4 - 12, 46, 6);
                    var1.f(var2);
                    var1.c(this.objX - 22, this.objY - var4 - 11, this.a(44), 4);
                } else if (this.n != 3 && this.n != 12) {
                    if (this.n > 0) {
                        var3 = 20;
                        var1.f(-16777216);
                        var1.c(this.objX - 23, this.objY - var4 - 9, 46, 6);
                        var1.f(var2);
                        var1.c(this.objX - 22, this.objY - var4 - 8, this.a(44), 4);
                        if (this.p().l.length() > 0) {
                            var3 = 33;
                            var10004 = this.objY - var4 - 17;
                            VDTT_dg.b(VDTT_dg.d, var1, this.p().l, this.objX, var10004, 2, -7812062, -10275328);
                        }
                    } else if (!this.w()) {
                        var1.f(-16777216);
                        var1.c(this.objX - 15, this.objY - var4 - 8, 30, 4);
                        var1.f(var2);
                        var1.c(this.objX - 14, this.objY - var4 - 7, this.a(28), 2);
                    }
                } else {
                    var3 = 40;
                    var10004 = this.objY - var4 - 32;
                    VDTT_dg.b(VDTT_dg.d, var1, this.p().l, this.objX, var10004, 2, -16712436, -16777216);
                    var10004 = this.objY - var4 - 20;
                    VDTT_dg.b(VDTT_dg.d, var1, this.p().k, this.objX, var10004, 2, -1, -16777216);
                    var1.f(-16777216);
                    var1.c(this.objX - 23, this.objY - var4 - 12, 46, 6);
                    var1.f(var2);
                    var1.c(this.objX - 22, this.objY - var4 - 11, this.a(44), 4);
                }

                if (this.ao != null && this.ao.length() > 0) {
                    var3 = 35;
                    VDTT_cw.v().aX = true;
                    VDTT_dg.b(VDTT_dg.d, var1, this.ao + Caption.ji, this.objX, this.objY - var4 - 18, 2, -2560, -16777216);
                }

                Vector var5 = new Vector();

                int var6;
                VDTT_ez var7;
                for (var6 = 0; var6 < this.ab.size(); ++var6) {
                    if ((var7 = (VDTT_ez) this.ab.elementAt(var6)).a()) {
                        var5.add(var7);
                    }
                }

                if (var5.size() > 0) {
                    var2 = -(var5.size() - 1) * 17 / 2;

                    for (var6 = 0; var6 < var5.size(); ++var6) {
                        if ((var7 = (VDTT_ez) var5.elementAt(var6)).a()) {
                            short var8 = var7.c().e;
                            if (var7.a == 76 && var7.b != 300) {
                                var8 = 545;
                            }

                            var7.a(var1, this.objX + var2 - 7 + var6 * 17, this.objY - var4 - var3 - 5, var8, true);
                        }
                    }

                    var3 += 16;
                }

                if (VDTT_cw.v().bg != null && VDTT_cw.v().bg.equals(this)) {
                    int var10002 = this.objY - var4 - var3;
                    VDTT_cw.v().bm.f(this.objX, var10002 + 6);
                    VDTT_cw.v().bm.a(var1);

                }

                if (this.ap != null) {
                    this.ap.a(var1);
                }
            }

        }
    }

    public final int e() {
        return this.w() ? 4 : 3;
    }

    public final boolean w() {
        return this.p().p == 10 || this.p().p == 7 || this.p().p == 13 || this.k == 154;
    }

    private void M() {
        if (this.aB != 1) {
            this.aB = 0;
            this.e = 4;
        }

    }

    private boolean N() {
        return this.p().p != 9 && this.p().p != 11 && this.ay == null;
    }

    public final boolean x() {
        return (this.p().r == 5 || this.p().r == 12) && !this.L();
    }
}
