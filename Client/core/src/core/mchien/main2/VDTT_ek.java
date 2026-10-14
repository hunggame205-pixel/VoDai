package core.mchien.main2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Vector;

public final class VDTT_ek extends VDTT_n {

    public static int k = 0;
    private static VDTT_ek bY;
    public String l;
    public byte m;
    public byte n;
    public byte o;
    public byte p;
    public byte I;
    public short J;
    public short K;
    public short L;
    public short M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;
    public int aa;
    public int ab = -1;
    public int ac;
    public int ad;
    public VDTT_gm ae;
    public VDTT_gm af;
    public int ag;
    public int ah;
    public int ai;
    public int aj;
    public int ak;
    public int al;
    public int am;
    public int an;
    public int ao;
    public int ap;
    public int aq;
    public int ar;
    public int as;
    public int at;
    public byte au;
    public byte av;
    public byte aw;
    public byte ax = -1;
    public byte ay = -1;
    public byte az;
    public byte aA;
    public byte aB;
    public long aC;
    public String aD;
    public byte aE;
    public byte aF;
    public int aG;
    public int aH;
    public short aI;
    public short aJ;
    public int aK;
    public short aL;
    public short aM;
    public short aN;
    public short aO;
    public Item[] aP;
    public Item[] aQ;
    public Item[] aR = new Item[16];
    public Item[] aS = new Item[16];
    public Item[] aT = new Item[10];
    public Item[] aU = new Item[6];
    public Item[] itemPet = new Item[4];
    public VDTT_ii aV;
    public Vector aW = new Vector();
    public VDTT_ih aX;
    public VDTT_ee aY;
    public VDTT_ic aZ;
    public VDTT_hi ba;
    public Vector bb;
    public Vector bc;
    public Vector bd;
    public Vector be;
    public Vector bf;
    public VDTT_ix[] bg;
    public VDTT_eo bh;
    public VDTT_hr bi;
    public long bj;
    public VDTT_gk bk;
    public VDTT_gk bl;
    public int bm;
    public int bn;
    public int bo;
    public int bp;
    public int bq;
    public boolean br;
    public boolean bs;
    public boolean bt;
    public boolean bu;
    public VDTT_ez bv;
    public VDTT_ez bw;
    public VDTT_ez bx;
    public VDTT_ez by;
    public VDTT_ez bz;
    public VDTT_ez bA;
    public VDTT_ez bB;
    public Vector bC;
    public boolean bD;
    public boolean bE;
    public int bF;
    public int bG;
    public boolean bH;
    private int bZ;
    private int ca;
    private int cb;
    private int cc;
    private int cd;
    private int ce;
    private int cf;
    private int cg;
    public short bI;
    public short bJ;
    private long ch;
    private VDTT_ez ci;
    private boolean cj;
    private boolean ck;
    private VDTT_ev cl;
    private VDTT_ev cm;
    private int cn;
    private byte co;
    private Vector cp;
    private long cq;
    private long cr;
    private int cs;
    public int bK;
    public int bL;
    public int bM;
    private int ct;
    private int cu;
    private VDTT_dy cv;
    public boolean bN;
    public boolean bO;
    public boolean bP;
    public boolean bQ;
    public boolean bR;
    public int bS;
    public int bT;
    public VDTT_ek bU;
    public VDTT_ek bV;
    private int cw;
    private int cx;
    private int cy;
    private int cz;
    private int cA;
    private int cB;
    private int cC;
    private static int[] cD = new int[]{-10, -10, -10, -10, -10, -8, -5, -5, -3, -2, -2, -1, -1, -1, -1, -1};
    public int bW;
    public int bX;
    private long cE;
    private short lastX;
    private short lastY;
    public boolean isHidePet;

    public VDTT_ek() {
        this.ba = new VDTT_hi(83, this.objX, this.objY, -1);
        this.bb = new Vector();
        this.bc = new Vector();
        this.bd = new Vector();
        this.be = new Vector();
        this.bf = new Vector();
        this.bg = new VDTT_ix[0];
        this.bj = 0L;
        this.bp = -1;
        this.bC = new Vector();
        this.bF = 0;
        this.bG = 0;
        this.cb = -1;
        this.cc = -1;
        this.cf = 0;
        this.bI = -1;
        this.bJ = -1;
        this.ch = 0L;
        this.cl = new VDTT_ev(383, 0, 0, -1);
        this.cm = new VDTT_ev(442, 0, 0, -1);
        this.cn = 0;
        this.cp = new Vector();
        this.cs = 0;
        this.bW = -1;
        this.bX = 0;
        this.d(30, 48);
        this.aF = 3;
    }

    public VDTT_ek(int var1) {
        this.ba = new VDTT_hi(83, this.objX, this.objY, -1);
        this.bb = new Vector();
        this.bc = new Vector();
        this.bd = new Vector();
        this.be = new Vector();
        this.bf = new Vector();
        this.bg = new VDTT_ix[0];
        this.bj = 0L;
        this.bp = -1;
        this.bC = new Vector();
        this.bF = 0;
        this.bG = 0;
        this.cb = -1;
        this.cc = -1;
        this.cf = 0;
        this.bI = -1;
        this.bJ = -1;
        this.ch = 0L;
        this.cl = new VDTT_ev(383, 0, 0, -1);
        this.cm = new VDTT_ev(442, 0, 0, -1);
        this.cn = 0;
        this.cp = new Vector();
        this.cs = 0;
        this.bW = -1;
        this.bX = 0;
        this.d(30, 48);
        this.b = var1;
    }

    public static VDTT_ek m() {
        if (bY == null) {
            bY = new VDTT_ek();
        }

        return bY;
    }

    private static void a(Vector var0, int var1) {
        try {
            for (int var5 = 0; var5 < var0.size() - 1; ++var5) {
                VDTT_hc var2 = (VDTT_hc) var0.elementAt(var5);

                for (int var6 = var5 + 1; var6 < var0.size(); ++var6) {
                    VDTT_hc var3 = (VDTT_hc) var0.elementAt(var6);
                    VDTT_hc var4;
                    if (var2.h[var1].c > var3.h[var1].c) {
                        var4 = var3;
                        var3 = var2;
                        var2 = var4;
                        var0.setElementAt(var4, var5);
                        var0.setElementAt(var3, var6);
                    } else if (var2.h[var1].c == var3.h[var1].c && var3.c != 51 && var3.c != 588 && var3.c != 589) {
                        if (var2.c != 51 && var2.c != 588 && var2.c != 589) {
                            if (var2.h[var1].e < var3.h[var1].e) {
                                var4 = var3;
                                var3 = var2;
                                var2 = var4;
                                var0.setElementAt(var4, var5);
                                var0.setElementAt(var3, var6);
                            } else if (var2.h[var1].e == var3.h[var1].e && var2.h[var1].d < var3.h[var1].d) {
                                var4 = var3;
                                var3 = var2;
                                var2 = var4;
                                var0.setElementAt(var4, var5);
                                var0.setElementAt(var3, var6);
                            }
                        } else if (var3.c != 29) {
                            var4 = var3;
                            var3 = var2;
                            var2 = var4;
                            var0.setElementAt(var4, var5);
                            var0.setElementAt(var3, var6);
                        }
                    }
                }
            }

        } catch (Exception var7) {
        }
    }

    public static XYEntity b(int var0, int var1) {
        return a(var0, var1, (int) 1);
    }

    private static XYEntity a(int var0, int var1, int var2) {
        try {
            if (var0 < 16) {
                var0 = 16;
            } else if (var0 > VDTT_cw.v().aj - 16) {
                var0 = VDTT_cw.v().aj - 16;
            }

            VDTT_cw.v();
            XYEntity var4;
            if ((var4 = VDTT_fn.c(var0, var1)) != null && VDTT_jb.b(var1 - var4.objY) > var2) {
                return var4;
            }
        } catch (Exception var3) {
        }

        return null;
    }

    private int aj() {
        if (this.aR[12] != null) {
            return this.aR[12].c == 535 ? 11 : this.aR[12].c - 123;
        } else {
            return 0;
        }
    }

    public final void n() {
        this.o();
        m().j();
    }

    public final void o() {
        this.cp.clear();
        this.bd.clear();
    }

    public final void a(Message var1) throws IOException {
        this.bb.clear();
        this.aP = null;
        this.aQ = null;
        this.aR = new Item[16];
        this.aS = new Item[16];
        this.aT = new Item[10];
        this.e = var1.readByte();
        this.aD = var1.b.c();
        this.m = var1.readByte();
        this.au = var1.readByte();
        this.av = var1.readByte();
        this.o = var1.readByte();
        this.n = var1.readByte();
        this.J = (short) (var1.f() / 100);
        this.ag = var1.i();
        this.ai = var1.i();
        this.ah = var1.i();
        this.aj = var1.i();
        this.aC = var1.h();
        this.objX = this.aI = var1.f();
        this.objY = this.aJ = var1.f();
        this.cw = this.objY;
        this.I = var1.readByte();
        this.d(var1);
        a(var1, this.aR);
        if (this.e == 4) {
            this.az();
        }

        byte var2 = var1.readByte();

        for (int var3 = 0; var3 < var2; ++var3) {
            VDTT_ez var4 = new VDTT_ez(var1.f(), var1.i(), var1.h(), var1.i(), this);
            this.a(var4);
        }

        this.e(var1);
        this.ay = (byte) (var1.readByte() + 1);
        this.az = var1.readByte();
        this.bq = var1.readByte();
        this.aD();
        byte var5;
        if ((var5 = var1.readByte()) > 0) {
            VDTT_cw.v().a(0, this, var5);
        }

        this.br = var1.c();
    }

    public final void b(Message var1) throws IOException {
        VDTT_cw.v().dJ = false;
        VDTT_cw.v().bx = VDTT_cw.v().bz = VDTT_cw.v().bA = VDTT_cw.v().by = VDTT_cw.v().bB = VDTT_cw.v().bC = VDTT_cw.v().bD = null;
        VDTT_cw var10000 = VDTT_cw.v();
        byte var2 = 0;
        var10000.de = var2;
        this.bb.clear();
        this.l = var1.b.c();
        this.b = var1.i();
        this.aD = var1.b.c();
        this.au = var1.readByte();
        this.m = var1.readByte();
        this.aw = var1.readByte();
        this.av = var1.readByte();
        this.o = var1.readByte();
        this.n = var1.readByte();
        this.ao = var1.i();
        this.J = (short) (var1.f() / 100);
        this.ag = var1.i();
        this.ai = var1.i();
        this.ah = var1.i();
        this.aj = var1.i();
        this.aC = var1.h();
        this.ak = var1.i();
        this.al = var1.i();
        this.an = var1.i();
        this.am = var1.i();
        VDTT_cw.v().br = var1.f();
        VDTT_cw.v().bs = var1.readByte();
        VDTT_cw.v().bt = var1.g();
        VDTT_cw.v().ag = var1.i();
        VDTT_cw.v().ah = var1.i();
        VDTT_cw.v().R();
        int var7 = this.j(var1.f());
        this.aP = new Item[var7];
        Item[] var3 = this.aT;
        Message var8 = var1;

        for (int var4 = 0; var4 < var3.length; ++var4) {
            var3[var4] = null;
        }

        byte var12 = var1.readByte();

        for (int var6 = 0; var6 < var12; ++var6) {
            Item var5;
            (var5 = new Item()).c = var8.f();
            var5.t = var8.c();
            var5.f = var8.readByte();
            var3[var5.f] = var5;
        }

        a(var1, this.aR);
        a(var1, this.aS);
        b(var1, this.aP);
        if (this.aR[10] != null) {
            this.ax = 50;
        }

        this.bb.clear();
        byte var9 = var1.readByte();

        int var10;
        for (var10 = 0; var10 < var9; ++var10) {
            VDTT_ez var13 = new VDTT_ez(var1.f(), var1.i(), var1.h(), var1.i(), this);
            this.a(var13);
        }

        VDTT_cw.v().Z.clear();
        short var11 = var1.f();

        for (var10 = 0; var10 < var11; ++var10) {
            VDTT_fa var14;
            (var14 = new VDTT_fa()).a(var1);
            VDTT_cw.v().Z.add(var14);
        }

        VDTT_cw.v().aa.clear();
        var11 = var1.f();

        for (var10 = 0; var10 < var11; ++var10) {
            VDTT_fj var15;
            (var15 = new VDTT_fj()).c = var1.b.c();
            var15.b = var1.readByte();
            var15.d = var1.c();
            VDTT_cw.v().aa.add(var15);
        }

        VDTT_cw.v().O();
        VDTT_cw.v().ac.clear();
        var11 = var1.f();

        for (var10 = 0; var10 < var11; ++var10) {
            VDTT_fc var16;
            (var16 = new VDTT_fc()).b = var1.b.c();
            var16.c = var1.c();
            VDTT_cw.v().ac.add(var16);
        }

        this.c(var1);
        this.d(var1);
        this.e(var1);
        this.ay = (byte) (var1.readByte() + 1);
        VDTT_cw.v().dj = var1.i();
        this.az = var1.readByte();
        this.bq = var1.readByte();
        VDTT_cw.v().cV = var1.readByte();
        VDTT_cw.v().cW = var1.i();
        VDTT_cw.v().cX = var1.i();
        VDTT_cw.v().cY = var1.i();
        VDTT_cw.v().dl = var1.h();
        VDTT_cw.v().cZ = var1.readByte();
        this.as = var1.i();
        this.aq = var1.i();
        this.at = var1.i();
        this.ar = var1.i();
        this.ap = var1.readByte();
        this.aA = var1.readByte();
        this.aB = var1.readByte();
        VDTT_cw.v().ab();
        this.bf.clear();
        this.bc.clear();
        this.o();
        this.be.clear();
        var8 = null;
        this.aV = null;
        this.bV = null;
    }

    public final void c(Message var1) throws IOException {
        VDTT_cw.v().ce = var1.h();
        this.bI = var1.f();
        this.aZ = DataCenter.d().T[1].a();
        short var2 = var1.f();//do tk này
        Vector var3 = new Vector();
        short var4 = var1.f();

        int var5;
        VDTT_ic var7;
        for (var5 = 0; var5 < var4; ++var5) {
            short var6 = var1.f();
            (var7 = DataCenter.d().T[var6].a()).b = var5;
            var7.n = var1.h();
            if (var7.b(m())) {
                var3.add(var7);
            }

            if (30 == var7.d) {
                this.aZ = var7;
            }
        }

        for (var5 = 0; var5 < VDTT_cw.v().ad.length; ++var5) {
            VDTT_cw.v().ad[var5] = null;
        }

        VDTT_cw.v().ae = new VDTT_ic[var3.size()];

        for (var5 = 0; var5 < VDTT_cw.v().ae.length; ++var5) {
            var7 = (VDTT_ic) var3.get(var5);
            VDTT_cw.v().ae[var5] = (VDTT_ic) var3.get(var5);
            if (var7.e < var7.b().f) {
                VDTT_ic[] var10000;
                if (VDTT_cw.v().ae[var5].d == 30) {
                    var10000 = VDTT_cw.v().ad;
                    VDTT_cw.v();
                    var10000[0] = VDTT_cw.j(var7.d, var7.e + 1);
                } else if (VDTT_cw.v().ae[var5].d == 54 && m().w() < 19) {
                    var10000 = VDTT_cw.v().ad;
                    VDTT_cw.v();
                    var10000[1] = VDTT_cw.j(var7.d, var7.e + 1);
                } else if (VDTT_cw.v().ae[var5].d == 53 && m().w() < 19) {
                    var10000 = VDTT_cw.v().ad;
                    VDTT_cw.v();
                    var10000[2] = VDTT_cw.j(var7.d, var7.e + 1);
                }
            }
        }

        Arrays.sort(VDTT_cw.v().ae, VDTT_ic.a);
    }

    public VDTT_ic getSkillWithId(int id) {
        for (int i = 0; i < VDTT_cw.v().ae.length; i++) {
            if (VDTT_cw.v().ae[i].d == id) {
                return VDTT_cw.v().ae[i];
            }
        }
        return null;
    }

    public final boolean p() {
        return m().equals(this);
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

    public final int a(int var1) {
        int var2 = 0;

        try {
            if ((var2 = this.ag * var1 / this.ai) > var1) {
                var2 = var1;
            }
        } catch (Exception var3) {
        }

        if (var2 < 0) {
            var2 = 0;
        }

        return var2;
    }

    public final boolean q() {
        return this.ae != null && this.ae.g > 0;
    }

    public final boolean r() {
        return this.ae != null && this.ae.b();
    }

    public static int b(int var0) {
        int var1 = 0;

        try {
            if ((var1 = VDTT_cw.v().de * var0 / VDTT_cw.v().df) > var0) {
                var1 = var0;
            }
        } catch (Exception var2) {
        }

        if (var1 < 0) {
            var1 = 0;
        }

        return var1;
    }

    public final int c(int var1) {
        int var2 = 0;

        try {
            if ((var2 = this.ah * var1 / this.aj) > var1) {
                var2 = var1;
            }
        } catch (Exception var3) {
        }

        if (var2 < 0) {
            var2 = 0;
        }

        return var2;
    }

    public final int s() {
        Item var1;
        if ((var1 = this.aR[0]) != null) {
            VDTT_gz[] var4 = var1.L();

            for (int var2 = 0; var2 < var4.length; ++var2) {
                if (var4[var2].b[0] == 285) {
                    return var4[var2].f();
                }
            }
        }

        return 0;
    }

    public final int v() {
        Item var1;
        if ((var1 = this.aR[0]) != null) {
            VDTT_gz[] var6 = var1.L();

            for (int var2 = 0; var2 < var6.length; ++var2) {
                if (var6[var2].b[0] == 285) {
                    long var4 = (long) var6[var2].b[1] * 10L;

                    int var7;
                    for (var7 = 0; var7 < DataCenter.d().ax.length && var4 >= DataCenter.d().ax[var7]; ++var7) {
                        var4 -= DataCenter.d().ax[var7];
                    }

                    return var7;
                }
            }
        }

        return 0;
    }

    public final int w() {
        long var1 = this.aC;

        int var3;
        for (var3 = 0; var3 < DataCenter.d().ax.length && var1 >= DataCenter.d().ax[var3]; ++var3) {
            var1 -= DataCenter.d().ax[var3];
        }

        return var3;
    }

    public final String x() {
        Item var1;
        if ((var1 = this.aR[0]) != null) {
            VDTT_gz[] var4 = var1.L();

            for (int var2 = 0; var2 < var4.length; ++var2) {
                if (var4[var2].b[0] == 285) {
                    return VDTT_jb.c(var4[var2].b[1]) + "/" + DataCenter.d().a(var4[var2].f());
                }
            }
        }

        return "0";
    }

    public final int y() {
        Item var1;
        if ((var1 = this.aR[0]) != null) {
            VDTT_gz[] var4 = var1.L();

            for (int var2 = 0; var2 < var4.length; ++var2) {
                if (var4[var2].b[0] == 285) {
                    return var4[var2].b[1];
                }
            }
        }

        return 0;
    }

    public final int z() {
        Item var1;
        if ((var1 = this.aR[0]) != null) {
            VDTT_gz[] var4 = var1.L();

            for (int var2 = 0; var2 < var4.length; ++var2) {
                if (var4[var2].b[0] == 407) {
                    return var4[var2].b[1];
                }
            }
        }

        return 0;
    }

    public final String A() {
        return VDTT_jb.c(this.aC / 10L);
    }

    public static String a(long var0) {
        return VDTT_jb.c(var0 / 10L);
    }

    private void ak() {
        if (this.bD && (this.p() || VDTT_cw.v().bg == null || !VDTT_cw.v().bg.equals(this))) {
            if (!this.bf.contains(this.ba)) {
                this.bf.addElement(this.ba);
            }
        } else {
            this.bf.removeElement(this.ba);
        }

        for (int var1 = this.bf.size() - 1; var1 >= 0; --var1) {
            VDTT_hi var2;
            (var2 = (VDTT_hi) this.bf.elementAt(var1)).a((VDTT_n) this);
            if (var2.p()) {
                this.bf.removeElement(var2);
            }
        }

    }
    public int dxMove = -1;
    public int dyMove = -1;
    public int dxStand = -1;
    public int dyStand = -1;
    public int frameStartMove = -1;
    public int frameEndMove = -1;
    public int frameStartStand = -1;
    public int frameEndStand = -1;
    public boolean isShowPet = false;

    public final void B() {
        VDTT_cw.v().de = VDTT_cw.v().df;
        if (this.p() && !this.h()) {
            if (this.F()) {
                if (this.objX == this.ct && this.objY == this.cu) {
                    ++this.bK;
                    if (this.bK >= 40) {
                        this.cv = VDTT_cw.v().bv;
                        VDTT_cw.v().bv = null;
                        this.j();
                    }
                } else {
                    this.ct = this.objX;
                    this.cu = this.objY;
                    this.bK = 0;
                }
            } else if (this.bK >= 40) {
                ++this.bK;
                if (this.bK > 42) {
                    this.bK = 0;
                    if (this.cv != null) {
                        VDTT_cw.v().bv = this.cv;
                    }
                }
            }
        }

        try {
            if (this.cp.size() > 0 && System.currentTimeMillis() - this.cq > 1000L) {
                this.ax();
            }

            this.an();
            this.bk = null;
            this.aK = this.r + 4;
            if (this.bi != null && this.bi.a(this.k(), this.objY - this.r - 2)) {
                this.bi = null;
            }

            int var1 = VDTT_jb.c();
            if (this.Z < var1) {
                this.p = 0;
            }

            if (this.ag <= 0 && this.e != 4 && this.e != 5) {
                this.az();
            }

            VDTT_iz var2;
            if (!this.h()) {//
                if (this.aV != null) {
                    this.e = 3;
                    this.G();
                } else if (this.ae != null && (this.e == 0 || this.e == 2)) {
                    if (this.ae.objX == this.objX && this.ae.objY == this.objY) {
                        if (!VDTT_cw.v().o.e) {
                            var2 = null;
                            this.ae = null;
                            this.e = 0;
                        } else if (this.e == 0) {
                            var2 = null;
                            this.ae = null;
                        } else {
                            this.e = 2;
                        }
                    } else {
                        this.e = 2;
                    }
                }
            } else {
                var2 = null;
                this.aV = null;
                this.aW.clear();
            }

            if (this.p() && Y()) {
                if (MenuConfig.K().getBuffHP() > 0 && this.ag < (int) ((float) this.ai * ((float) MenuConfig.K().getBuffHP() / 100.0F))) {
                    VDTT_cw.v().b(false);
                } else if (MenuConfig.K().B() > 0 && this.ah < (int) ((float) this.aj * ((float) MenuConfig.K().B() / 100.0F))) {
                    VDTT_cw.v().b(false);
                }
            }

            boolean var12 = false;
            this.O = this.P = this.Q = this.R = this.S = this.T = this.U = this.V = this.W = this.X = this.Y = this.bt = this.bu = this.bP = this.bQ = this.bR = false;
            this.ci = this.bv = this.bw = this.bz = this.bA = this.bx = this.by = this.bB = null;
            this.bX = this.bM = 0;
            this.bC.clear();
            boolean var13 = false;
            VDTT_ez var3 = null;

            VDTT_ez var6;
            for (int var4 = 0; var4 < this.bb.size(); ++var4) {
                VDTT_ez var5;
                if ((var5 = (VDTT_ez) this.bb.elementAt(var4)).i == this.bO) {
                    if (var5.a(51) != null) {
                        this.U = true;
                    }

                    if (var5.a == 132) {
                        var3 = var5;
                    }

                    if ((var6 = var5.a(145)) != null) {
                        this.ci = var6;
                    }

                    if (var5.c().d != 77 && !var5.e()) {
                        if (var5.c().d == 90) {
                            this.bx = var5;
                        } else if (var5.c().d == 139) {
                            this.by = var5;
                        } else if (var5.f()) {
                            this.bC.add(var5);
                        }
                    } else {
                        this.bw = var5;
                        this.W = var5.e();
                        if (var5.c().d == 77 && this.av >= 4) {
                            this.W = true;
                        } else if (var5.a != 90 && var5.a != 91 && var5.a != 92 || this.av != 3 || var5.k != 0 && var5.k <= 3) {
                            if (var5.a == 89 && this.av == 2 && (var5.k == 0 || var5.k == 3)) {
                                this.W = true;
                            }
                        } else {
                            this.W = true;
                        }
                    }

                    if (var5.a >= 122 && var5.a <= 130) {
                        this.bz = var5;
                    }

                    if (var5.g() && this.bM != 910) {
                        this.bM = -var5.j;
                    }

                    switch (var5.a) {
                        case 8:
                            this.O = true;
                            break;
                        case 9:
                            this.P = true;
                            break;
                        case 10:
                            this.Q = true;
                            break;
                        case 11:
                            this.R = true;
                            break;
                        case 12:
                            this.S = true;
                            var12 = true;
                            break;
                        case 35:
                        case 36:
                            var12 = true;
                            break;
                        case 38:
                            var12 = true;
                            this.T = true;
                            if (this.M == -1) {
                                this.M = this.K;
                            }
                            break;
                        case 53:
                            this.V = true;
                            break;
                        case 85:
                        case 86:
                        case 147:
                        case 173:
                        case 174:
                        case 209:
                            this.bv = var5;
                            break;
                        case 109:
                            this.X = true;
                            var12 = true;
                            break;
                        case 113:
                            this.bB = var5;
                            break;
                        case 131:
                            var13 = true;
                            break;
                        case 140:
                            this.bA = var5;
                            break;
                        case 146:
                        case 175:
                        case 197:
                            this.Y = true;
                            var12 = true;
                            break;
                        case 151:
                            this.bv = var5;
                            this.bt = true;
                            break;
                        case 152:
                            this.bP = true;
                            break;
                        case 166:
                            this.bQ = true;
                            var12 = true;
                            break;
                        case 170:
                            this.bR = true;
                            break;
                        case 179:
                        case 180:
                        case 181:
                        case 182:
                        case 183:
                        case 184:
                            this.bX = var5.a;
                            break;
                        case 210:
                            this.bv = var5;
                            this.bu = true;
                    }
                }
            }

            if (var3 != null && VDTT_cw.v().C().d != 21) {
                this.bb.remove(var3);
            }

            if (this.af() && VDTT_cw.v().ai >= 47 && VDTT_cw.v().ai <= 50) {
                this.ci = this.bv = this.bw = this.bz = this.bx = null;
            }

            if (!var13) {
                this.bU = null;
            }

            short var15 = 0;

            int var17;
            for (var17 = 0; var17 < this.bb.size(); ++var17) {
                (var6 = (VDTT_ez) this.bb.elementAt(var17)).a((VDTT_n) this);
                if (var6.a == 84) {
                    var15 = (short) var6.b;
                }
            }
            if (isShowPet) {
                var15 = 125;
            }
            if (var15 > 0) {
                if (this.bl == null) {
                    this.bl = new VDTT_gk(var15);
                    this.bl.V = 1;
                    this.bl.c(this.objX, this.objY);
                    this.bl.o = this.bl.p().q;
                    this.bl.objX = this.objX;
                    this.bl.objY = this.objY;
                    this.bl.isFake = true;
                }
          
                this.bl.dxMove = dxMove;
                this.bl.dyMove = dyMove;
                this.bl.dxStand = dxStand;
                this.bl.dyStand = dyStand;
                this.bl.frameStartMove = frameStartMove;
                this.bl.frameEndMove = frameEndMove;
                this.bl.frameStartStand = frameStartStand;
                this.bl.frameEndStand = frameEndStand;

                this.bl.I = (short) (this.objX);
                this.bl.J = U() != null ? U().objY : this.objY;
                if (DataCenter.d().h % 2 == 0) {
                    if (lastX != objX || lastY != objY) {
                        lastX = objX;
                        lastY = objY;
                        this.bl.K = (short) (this.objX + (this.g ? -35 : 35));
                        this.bl.L = U() != null ? U().objY : this.objY;

                        this.bl.typeFrame = 0;
                    } else {
                        this.bl.typeFrame = 1;
                    }

                }
                this.bl.e = 2;

                if (VDTT_jb.b(this.bl.objX, this.bl.objY, this.bl.K, this.bl.L) > 300) {
                    ++this.bl.o;
                    this.bl.objX = this.objX;
                    this.bl.objY = U() != null ? U().objY : this.objY;
                } else if (VDTT_jb.b(this.bl.objX, this.bl.objY, this.bl.K, this.bl.L) > 100) {
                    ++this.bl.o;
                } else {
                    this.bl.o = this.bl.p().q;
                }
                if (this.bl.typeFrame != 1) {
                    this.bl.o = 1;
                } else {
                    if (VDTT_jb.b(this.bl.objX, this.bl.objY, this.bl.K, this.bl.L) < 40) {
                        this.bl.o = 0;
                    }

                }

                short var18 = this.bl.objX;
                short var21 = this.bl.objY;
                this.bl.r();
                this.bl.Q = this.bl.objX;
                this.bl.R = this.bl.objY;
                if (this.bl.objX == var18 && this.bl.objY == var21) {
                    this.bl.d = this.aF;
                }

                if (!isHidePet) {
                    (var2 = new VDTT_iz(0)).f(this.bl.objX, this.bl.objY);
                    var2.p = this.bl;
                    VDTT_cw.v().a((VDTT_n) var2);
                }
            } else {
                this.bl = null;
            }

            if (this.aR[0] != null && !this.bO && this.ap == 1 && this.bA == null && (VDTT_cw.v().C().d != 20 || !this.p()) && (VDTT_cw.v().C().d != 20 || this.o != 0)) {
                boolean var20 = this.bV == null;
                if (this.bV == null) {
                    this.bV = new VDTT_ek();
                    this.bV.b = -1;
                    this.bV.f(this.objX, this.objY);
                    this.bV.J = this.J;
                    this.bV.objX = (short) (this.objX + (this.g ? -35 : 35));
                    this.bV.objY = this.objY;
                    this.bV.av = this.av;
                    this.bV.m = this.m;
                    this.bV.bO = true;
                }

                int var22 = 0;

                while (true) {
                    if (var22 >= this.aR.length) {
                        this.bV.bb.clear();

                        for (var22 = 0; var22 < this.bb.size(); ++var22) {
                            VDTT_ez var14;
                            if ((var14 = (VDTT_ez) this.bb.get(var22)).i) {
                                this.bV.bb.add(var14);
                            }
                        }

                        this.bV.ai = this.as;
                        this.bV.ag = this.aq;
                        this.bV.aj = this.at;
                        this.bV.ah = this.ar;
                        if (!this.bV.h()) {
                            if (this.bV.aV == null) {
                                var22 = VDTT_jb.b(this.bV.objX, this.bV.objY, this.objX, this.objY);
                                if (this.bV.ae != null && VDTT_jb.b(this.bV.ae.objX, this.bV.ae.objY, this.objX, this.objY) > var22) {
                                    var2 = null;
                                    this.bV.ae = null;
                                }

                                if (var22 > 35) {
                                    if (var22 > 20) {
                                        this.bV.a((short) (this.objX + (this.g ? -35 : 35)), this.objY, false);
                                    } else {
                                        this.bV.a((short) (this.objX + (this.g ? -35 : 35)), this.objY, true);
                                    }
                                } else if (this.U() == null && this.bV.U() != null) {
                                    this.bV.a(this.objX, this.objY, true);
                                } else {
                                    var2 = null;
                                    this.bV.ae = null;
                                    this.bV.bd.clear();
                                    this.bV.e = 0;
                                }
                            }
                        } else if (!var20 && this.bV.ag > 0) {
                            this.bV.X();
                        }

                        this.bV.B();
                        if (!VDTT_jb.e() && !this.bD) {
                            VDTT_cw.v().a((VDTT_n) this.bV);
                        }
                        break;
                    }

                    if (this.aR[var22] != null && this.aR[var22].x()) {
                        this.bV.aR[var22] = this.aR[var22];
                    } else {
                        this.bV.aR[var22] = null;
                    }

                    ++var22;
                }
            } else {
                this.bV = null;
            }

            if (!this.T) {
                this.M = -1;
            }

            if (var12) {
                var3 = null;
                this.ae = null;
                this.o();
            }

            this.a(var12);
            if (this.aa > 0) {
                --this.aa;
            }

            this.be.clear();
            this.be.addAll(this.aa());

            for (var17 = 0; var17 < this.bb.size(); ++var17) {
                if ((var6 = (VDTT_ez) this.bb.elementAt(var17)).j < 0 && !var6.g()) {
                    this.a(this.be, -var6.j, 0);
                }
            }

            this.aB();
            if (DataCenter.d().ai instanceof SelectCharScreen) {
                this.j();
            } else if (!this.p() && this.bd.size() > 0 && this.e != 2 && this.e != 7) {
                this.ao();
            }

            if ((this.ae == null || !this.ae.j) && VDTT_cw.v().de == 0 && this.p() && !this.q() && !this.ah()) {
                short var16 = this.objY;
                XYEntity var23;
                if ((var23 = a(this.objX, var16, (int) 1)) != null) {
                    this.aN = var23.objX;
                    this.aO = var23.objY;
                    if (this.aG == 0) {
                        this.cd = 0;
                    }

                    this.aG = 2;
                    this.e = 7;
                    if (VDTT_cw.v().bv != null && this.ae != null) {
                        var16 = this.ae.objY;
                        if (a(this.ae.objX, var16, (int) 1) != null) {
                            var2 = null;
                            this.ae = null;
                            VDTT_cw.v().bv = null;
                            VDTT_cw.v().c(Caption.wh, -2560);
                        }
                    }
                }
            }

            switch (this.e) {
                case 0:
                    this.W();
                    this.av();
                    this.aI = this.objX;
                    this.aJ = this.objY;
                case 1:
                default:
                    break;
                case 2:
                    if (!var12) {
                        this.ao();
                    } else {
                        this.j();
                    }
                    break;
                case 3:
                    if (!this.p()) {
                        if (this.bd.size() > 0) {
                            this.ae = (VDTT_gm) this.bd.lastElement();
                            this.bd.clear();
                        }

                        if (this.ae != null) {
                            ++this.ae.c;
                        }

                        this.ao();
                        this.e = 3;
                    }

                    this.W();
                    this.aw();
                    this.aI = this.objX;
                    this.aJ = this.objY;
                    break;
                case 4:
                    this.ar();
                    this.aI = this.objX;
                    this.aJ = this.objY;
                    break;
                case 5:
                    this.az();
                    break;
                case 6:
                    this.aI = this.objX;
                    this.aJ = this.objY;
                    break;
                case 7:
                    if (this.q()) {
                        this.ao();
                    } else {
                        this.as();
                    }
            }

            if (this.e != 5) {
                this.cg = 0;
            }

            VDTT_fe.d();
            if (this.d == 2) {
                this.g = true;
            } else {
                this.g = false;
            }

            if (this.aX != null) {
                this.ax = -1;
                if (!this.aX.a()) {
                    this.aX = null;
                    this.W();
                }
            }

            if (this.p() && VDTT_jb.a() - VDTT_cw.v().cd > 5000L && VDTT_cw.v().cf != 0 && VDTT_cw.v().cg != 0 && VDTT_cw.v().cf == this.objX && VDTT_cw.v().cg == this.objY) {
                VDTT_gm var19 = new VDTT_gm(VDTT_cw.v().cf, VDTT_cw.v().cg, this.J);
                this.ae = var19;
                VDTT_cw.v().cf = VDTT_cw.v().cg = 0;
            }

            if (this.aY != null && this.aY.a()) {
                if (this.bO) {
                    VDTT_jb.b();
                    this.a((short) (this.aY.b.objX - 12), this.aY.b.objY);
                }

                this.a(this.aY.a, this.aY.b, false);
                if (this.p()) {
                    VDTT_cw var26 = VDTT_cw.v();
                    var13 = true;
                    var26.aV = var13;
                    VDTT_cw.v().bg = this.aY.b;
                }

                this.aY = null;
            }

            if (!super.a(this.objX, this.objY) && !VDTT_cw.v().cm) {
                VDTT_gm var24 = new VDTT_gm(this.objX, this.objY, this.J);
                this.a(var24, 1, false);
                this.objX = var24.objX;
                this.objY = var24.objY;
            }

            this.ak();
            return;
        } catch (Exception var10) {
        } finally {
            m().W();
        }

    }

    public final int[] d(int var1) {
        for (int var2 = 0; var2 < m().aP.length; ++var2) {
            if (this.aP[var2] != null && this.aP[var2].c == var1) {
                return new int[]{var2 % 9 * 32, var2 / 9 * 32};
            }
        }

        return null;
    }

    public final Item C() {
        for (int var1 = m().aP.length - 1; var1 >= 0; --var1) {
            if (this.aP[var1] != null && this.aP[var1].getItemTemplate().f == 1) {
                return this.aP[var1];
            }
        }

        return null;
    }

    public final boolean a(VDTT_fs var1) {
        for (int var3 = 0; var3 < this.aP.length; ++var3) {
            Item var2;
            if ((var2 = this.aP[var3]) == null || var1 != null && var1.k.c == var2.c && var2.getItemTemplate().d && var2.h == var1.k.h) {
                return false;
            }
        }

        return true;
    }

    public final Item e(int var1) {
        Item var2 = null;

        for (int var3 = 0; var3 < this.aP.length; ++var3) {
            if ((var2 = this.aP[var3]) != null && var2.c == var1) {
                return var2;
            }
        }

        return var2;
    }

    public final int e2(int var1) {
        Item var2 = null;
        int c = 0;

        for (int var3 = 0; var3 < this.aP.length; ++var3) {
            if ((var2 = this.aP[var3]) != null && var2.c == var1) {
                c += var2.M();
            }
        }

        return c;
    }

    public final int D() {
        int var2 = 0;

        for (int var3 = 0; var3 < this.aP.length; ++var3) {
            if (this.aP[var3] == null) {
                ++var2;
            }
        }

        return var2;
    }

    public final boolean E() {
        return this.bD;
    }

    private boolean al() {
        return this.bW > 0;
    }

    public final void a(Graphics var1, int var2, int var3, boolean var4) {
        this.a(var1, var2, var3, 40, 6, var4);
    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5, boolean var6) {
        int var7 = -65536;
        int var8 = this.a(var4 - 2);
        if (var6) {
            var8 = this.c(var4 - 2);
            var7 = -16742145;
        }

        var1.f(-11184811);
        var1.c(var2, var3 - 68, var4, var5);
        var1.f(var7);
        var1.c(var2 + 1, var3 - 67, var8, var5 - 2);
    }

    public final void a(Graphics var1) {
        try {
            if (this.p() || VDTT_cw.v().ai != 86 || this.objY < 440 || this.objY > 442 || this.objX < 1246 || this.objX > 1280 || this.e != 0) {
                if (!this.ah()) {
                    if (!this.al()) {
                        if (this.af()) {
                            this.bS = VDTT_cw.P++;
                            if (this.bS >= VDTT_cw.O.length || VDTT_cw.v().C().a == 46 && this.o == 0) {
                                return;
                            }
                        }

                        if (this.aY == null && !VDTT_jb.e() && !this.bD) {
                            if (this.e != 3 && !this.af()) {
                                byte var2;
                                if (this.bT > 0) {
                                    --this.bT;
                                    var2 = 30;
                                    this.K = (short) var2;
                                } else if (!this.p() && this.K >= 18 && this.K <= 29 && this.cC > 0) {
                                    if (this.cC > 15) {
                                        this.cC = 15;
                                    }

                                    --this.cC;
                                    var2 = 30;
                                    this.K = (short) var2;
                                } else {
                                    label358:
                                    {
                                        if (this.aE == 2) {
                                            this.p();
                                            this.cl.a(var1);
                                        } else if (this.K >= 30 && this.K <= 35) {
                                            ++this.cC;
                                            break label358;
                                        }

                                        this.cC = 0;
                                    }
                                }

                                if (this.K >= 30 && this.K <= 35) {
                                    short var9 = (short) (30 + DataCenter.d().h / 4 % 6);
                                    this.K = (short) var9;
                                    var2 = 20;
                                    if (this.bv != null) {
                                        var2 = 16;
                                    }

                                    if (this.aF == 3) {
                                        this.cm.o = true;
                                        this.cm.f(this.objX + var2, this.objY - 24);
                                    } else {
                                        this.cm.o = false;
                                        this.cm.f(this.objX - var2, this.objY - 24);
                                    }

                                    this.cm.n();
                                    if (this.cC > 15 || !this.p()) {
                                        this.cm.a(var1);
                                    }
                                } else if (!this.p() && this.K >= 12 && this.K <= 17 && (this.ae != null && this.ae.objY < this.objY || this.bd.size() > 0 && ((VDTT_gm) this.bd.get(0)).objY < this.objY)) {
                                    var2 = 18;
                                    this.K = (short) var2;
                                }
                            }

                            if (this.p() || !(DataCenter.d().ai instanceof VDTT_cw) || !VDTT_eq.a().a(11) || VDTT_cw.v().bg != null && VDTT_cw.v().bg.equals(this) || VDTT_cw.v().C().d == 10 && this.o != 0) {
                                label363:
                                {
                                    Graphics var3 = var1;
                                    VDTT_ek var10 = this;
                                    int var4 = this.K;
                                    if (this.e == 2 && this.U() != null && var4 >= 12 && var4 <= 17) {
                                        var4 += 18;
                                    }

                                    if (this.T) {
                                        var4 = this.M;
                                    } else if (this.bL > 0) {
                                        --this.bL;
                                        if (this.bL < 5 && this.aV == null && this.e == 0) {
                                            var4 = 37;
                                        }
                                    }

                                    if (this.bG > 0) {
                                        if (this.bG % 2 == 0) {
                                            var1.a(1.2F, 0.5F);
                                        }

                                        --this.bG;
                                    }

                                    int var5 = 0;
                                    if (this.U) {
                                        int var6 = 0;

                                        while (true) {
                                            if (var6 >= var10.bc.size()) {
                                                if (var5 > 0) {
                                                    var10.bo = 0;
                                                }
                                                break;
                                            }

                                            VDTT_ek var7;
                                            if ((var7 = (VDTT_ek) var10.bc.get(var6)).objX != var10.objX || var7.objY != var10.objY) {
                                                ++var5;
                                                var3.d(80);
                                                var7.a(var3, var7.objX, var7.objY, var10.be, var10.K, var7.L, var10.aF == 3);
                                                var3.l = 1.0F;
                                            }

                                            ++var6;
                                        }
                                    }

                                    if (var10.br) {
                                        var3.c(-649022);
                                    }

                                    if (var10.O) {
                                        var3.c(-7452415);
                                    } else if (var10.P) {
                                        var3.c(-5765899);
                                    } else if (var10.Q) {
                                        var3.c(-14466309);
                                    } else if (var10.R) {
                                        var3.c(-181445);
                                    } else if (var10.S) {
                                        if (var10.h()) {
                                            var4 = 36;
                                        } else {
                                            var4 = 37;
                                        }
                                    }

                                    if (var10.aY != null) {
                                        if (var10.aY.c < VDTT_ee.d - 8) {
                                            VDTT_dc.b(var3, 4336, var10.aF == 3 ? -360 : 0, var10.objX, var10.objY, 33);
                                            break label363;
                                        }

                                        var4 = 2;
                                    }

                                    if (var10.V) {
                                        if (!var10.p()) {
                                            break label363;
                                        }

                                        var3.d(40);
                                    }

                                    var10.a(var3, var10.objX, var10.objY, var10.be, var4, var10.L, var10.aF == 3);
                                    if (var5 == 0 && var10.bo > 0) {
                                        if (var10.aF == 2) {
                                            if (var10.bo < 95) {
                                                var10.a(var3, var10.objX + 40, var10.objY, var10.be, var4, var10.L, var10.aF == 3);
                                            }

                                            if (var10.bo < 90) {
                                                var10.a(var3, var10.objX - 40, var10.objY, var10.be, var4, var10.L, var10.aF == 3);
                                            }
                                        } else {
                                            if (var10.bo < 95) {
                                                var10.a(var3, var10.objX - 40, var10.objY, var10.be, var4, var10.L, var10.aF == 3);
                                            }

                                            if (var10.bo < 90) {
                                                var10.a(var3, var10.objX + 40, var10.objY, var10.be, var4, var10.L, var10.aF == 3);
                                            }
                                        }
                                    }

                                    var3.l = 1.0F;
                                    var3.f();
                                    if (var10.h(146) != null) {
                                        VDTT_dc.b(var3, 5765, 0, var10.objX + 2, var10.objY - 9 + (!var10.h() ? DataCenter.d().h / 5 % 2 : 0), 33);
                                    }
                                }
                            }

                            var1.r();
                        }
                    }
                }
            }
        } catch (Exception var8) {
            VDTT_jb.a(var8);
        }
    }

    public final boolean F() {
        return this.p() && VDTT_cw.v().bv != null;
    }

    public final void a(Graphics var1, int var2, int var3, Vector var4, int var5, int var6, boolean var7) {
        if (this.bQ) {
            VDTT_dc.b(var1, 6319, 0, var2, var3, 33);
        } else if (this.bP) {
            VDTT_dc.a(var1, 437, var7 ? -360 : 0, var2, var3 - 22, 3);
        } else if (this.bR) {
            VDTT_dc.a(var1, 382, var7 ? -360 : 0, var2, var3 - 5, 3);
        } else {
            if (this.X) {
                var5 = 154;
                var7 = true;
            } else if (this.Y && !this.h()) {
                var5 = DataCenter.d().h / 5 % 2;
            }

            if (this.af() && VDTT_cw.v().ai >= 47 && VDTT_cw.v().ai <= 50) {
                if (this.bS >= VDTT_cw.O.length) {
                    return;
                }

                var2 = VDTT_cw.O[this.bS][0];
                var3 = VDTT_cw.O[this.bS][1];
                var7 = var2 > VDTT_cw.v().aj / 2;
                var5 = 6 + DataCenter.d().h / 5 % 6;
                if (VDTT_cw.v().ai >= 49 && VDTT_cw.v().ai <= 50) {
                    var5 = 36;
                }

                var6 = 0;
                if (var7) {
                    VDTT_aa.c(var1, 208, 0, var2 - 15, var3 - 4, 90);
                } else {
                    VDTT_aa.c(var1, 208, 0, var2 - 14, var3 - 4, 90);
                }
            }

            this.a(var1, var2, var3, var4, var5, var6, var7, false);
            if (this.af()) {
                if (VDTT_cw.v().ai >= 47 && VDTT_cw.v().ai <= 48) {
                    this.a(var1, var2, var3 - 56, 2);
                    return;
                }

                if (VDTT_cw.v().ai >= 49 && VDTT_cw.v().ai <= 50) {
                    this.a(var1, var2, var3 - 44, 2);
                }
            }

        }
    }

    public final void a(Graphics var1, int var2, int var3, Vector var4, int var5, int var6, boolean var7, boolean var8) {
        this.a(var1, var2, var3, var4, var5, var6, var7, var8, this.bO, false);
    }

    public final void a(Graphics var1, int var2, int var3, Vector var4, int var5, int var6, boolean var7, boolean var8, boolean var9, boolean var10) {
        if (DataCenter.l() || DataCenter.m()) {
            var4.clear();
            this.bv = null;
            var4.add(DataCenter.d().y[1082].a());
            var4.add(DataCenter.d().y[1174].a());
            var4.add(DataCenter.d().y[1175].a());
        }

        VDTT_ez var11 = this.bv;
        if (var10 && var9) {
            if (this.bV != null) {
                var11 = this.bV.bv;
            } else {
                var11 = null;
            }
        }

        byte var13 = 0;
        byte var14 = 50;
        boolean var15 = false;
        boolean var16 = false;

        int var17;
        VDTT_hc var25;
        for (var17 = 0; var17 < var4.size(); ++var17) {
            if ((var25 = (VDTT_hc) var4.elementAt(var17)).b()) {
                var15 = true;
            }

            if (var25.c == 588) {
                var16 = true;
                switch (var5) {
                    case 12:
                    case 13:
                        var13 = 22;
                        break;
                    case 14:
                        var13 = 23;
                        break;
                    case 15:
                        var13 = 23;
                        break;
                    case 16:
                        var13 = 21;
                        break;
                    case 17:
                        var13 = 21;
                        break;
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                        var14 = 9;
                        break;
                    case 148:
                        var13 = 23;
                        var14 = 12;
                        break;
                    case 149:
                        var13 = 19;
                        var14 = 9;
                }
            }
        }

        if (var15) {
            for (var17 = 0; var17 < var4.size(); ++var17) {
                if ((var25 = (VDTT_hc) var4.elementAt(var17)).c == 5 || var25.c == 44) {
                    var15 = false;
                    break;
                }

                if (var25.c != 72 && var25.c != 78) {
                    if (var25.c != 772 && var25.c != 780 && var25.c != 788) {
                        if (var25.c == 183) {
                            DataCenter.d().y[424].a(var25);
                        } else if (DataCenter.d().z[var25.c].c.length > 3) {
                            DataCenter.d().y[DataCenter.d().z[var25.c].c[3]].a(var25);
                        }
                    } else {
                        DataCenter.d().y[892].a(var25);
                    }
                } else {
                    DataCenter.d().y[425].a(var25);
                }
            }
        }

        a(var4, var5);
        var10 = true;
        var1.j = var10;

        for (var17 = 0; var17 < var4.size(); ++var17) {
            var25 = (VDTT_hc) var4.elementAt(var17);
            boolean var18 = false;
            if ((!var25.b() || var15) && (var25.d != 8 || !var16) && (!var25.g || !this.h())) {
                int var12 = var5;
                int var19 = var25.h[var5].a;
                if (var25.c()) {
                    var12 = var6;
                }

                if (var8 && var25.d == 1) {
                    var1.p();
                } else if (var25.f == -1) {
                    if (DataCenter.aR.contains((short) var19)) {
                        if (var19 >= 1591 && var19 <= 1596) {
                            var19 = 1193 + (var19 - var25.h[0].a);
                        } else {
                            var19 = 820 + (var19 - var25.h[0].a);
                        }
                    } else {
                        var1.q();
                    }
                } else if (var25.f != 0) {
                    if (var25.f >= -180 && var25.f <= 180) {
                        var1.c((float) var25.f);
                    } else {
                        var1.c(var25.f);
                    }
                }

                if (this.bt && var19 >= 5771 && var19 <= 5831) {
                    var19 += 1814;
                } else if (this.bu && var19 >= 5771 && var19 <= 5831) {
                    var18 = true;
                    var19 += 1814;
                    var1.c(-56.0F);
                }

                int var20 = var1.e;
                int var21 = var1.f;
                if (!var15 || var25.d != 10) {
                    if (var25.d == 2 && (var13 != 0 || var14 != 50) && var25.c != 588) {
                        if (var13 == 0) {
                            if (!var7) {
                                var1.d(var2 - var14, var3 + var25.h[var12].e - 36, 50 + var14, 36);
                            } else {
                                var1.d(var2 - 50, var3 + var25.h[var12].e - 36, 50 + var14, 36);
                            }
                        } else if (var7) {
                            var1.d(var2 - var14, var3 + var25.h[var12].e - 36, 50 + var14, var13);
                        } else {
                            var1.d(var2 - 50, var3 + var25.h[var12].e - 36, 50 + var14, var13);
                        }
                    }

                    if (var12 < 6 && this.cj && !var25.c()) {
                        var12 += 6;
                    }

                    if (var11 == null && var25.d == 2 && n(var12)) {
                        if (this.ae()) {
                            var1.d(var2 - 148, var3 + var25.h[var12].e - 200, 159, 200);
                        } else {
                            var1.d(var2 - 150, var3 + var25.h[var12].e - 200, 159, 200);
                        }
                    }

                    if (var25.g) {
                        var19 = var25.h[0].a + DataCenter.d().h / 3 % 6;
                    } else if (var25.d() && var12 >= 38 && !this.X && !this.Y) {
                        if (var19 != var25.h[0].a && var19 != var25.h[1].a && var19 != var25.h[2].a) {
                            if (var19 == var25.h[12].a || var19 == var25.h[13].a || var19 == var25.h[14].a) {
                                var19 = var25.h[DataCenter.d().h / 3 % 3 + 12].a;
                            }
                        } else {
                            var19 = var25.h[DataCenter.d().h / 3 % 3].a;
                        }
                    }

                    if (var12 >= 66 && var12 <= 72 || var12 >= 121 && var12 <= 127) {
                        if (this.aV != null) {
                            if (var25.d == 3) {
                                if (this.aV.d.d == 4) {
                                    var19 += 2;
                                } else if (this.aV.d.d == 44) {
                                    ++var19;
                                }
                            }
                        } else {
                            var12 = 0;
                            var19 = 0;
                        }
                    }

                    if (var15 && var12 != 36 && var12 != 37) {
                        var19 = this.l(var19);
                    }

                    if ((var19 = this.m(var19)) >= 5992 && var19 <= 6005) {
                        var19 = 5992 + DataCenter.d().h / 3 % 14;
                    }

                    if (this.bB == null || !DataCenter.aR.contains((short) var19)) {
                        int var22;
                        byte var23;
                        if (var11 != null && !var25.c() && !var9) {
                            var22 = var11.d();
                            var23 = 0;
                            if (var22 < 800) {
                                if (var25.d == 1 && this.ck) {
                                    if (var25.c == 5) {
                                        var23 = 2;
                                    } else {
                                        var23 = 1;
                                    }
                                }

                                if (this.ck) {
                                    if (var7) {
                                        VDTT_aa.c(var1, var19, VDTT_jb.a(var7 != var25.h[var12].f, var25.h[var12].b), var2 - var25.h[var12].d, var3 + var23 + var25.h[var12].e * 82 / 100, 82, 33);
                                    } else {
                                        VDTT_aa.c(var1, var19, VDTT_jb.a(var7 != var25.h[var12].f, var25.h[var12].b), var2 + var25.h[var12].d, var3 + var23 + var25.h[var12].e * 82 / 100, 82, 33);
                                    }
                                } else if (var7) {
                                    VDTT_dc.b(var1, var19, VDTT_jb.a(var7 != var25.h[var12].f, var25.h[var12].b), var2 - var25.h[var12].d, var3 + var23 + var25.h[var12].e, 33);
                                } else {
                                    VDTT_dc.b(var1, var19, VDTT_jb.a(var7 != var25.h[var12].f, var25.h[var12].b), var2 + var25.h[var12].d, var3 + var23 + var25.h[var12].e, 33);
                                }
                            } else if (var11.e - var22 < 2500) {
                                if (var25.d == 1) {
                                    if (var25.c == 5) {
                                        var23 = 2;
                                    } else {
                                        var23 = 1;
                                    }
                                }

                                var22 = 20 - (var11.e - var22) / 150;
                                int var24;
                                if ((var24 = 100 - var22) < 82 || var22 < 0) {
                                    var24 = 82;
                                }

                                if (var7) {
                                    VDTT_aa.c(var1, var19, VDTT_jb.a(var7 != var25.h[var12].f, var25.h[var12].b), var2 - var25.h[var12].d, var3 + var23 + var25.h[var12].e * var24 / 100, var24, 33);
                                } else {
                                    VDTT_aa.c(var1, var19, VDTT_jb.a(var7 != var25.h[var12].f, var25.h[var12].b), var2 + var25.h[var12].d, var3 + var23 + var25.h[var12].e * var24 / 100, var24, 33);
                                }
                            } else if (var22 < 3000) {
                                if (var25.d == 1) {
                                    if (var25.c == 5) {
                                        var23 = 2;
                                    } else {
                                        var23 = 1;
                                    }
                                }

                                if ((var22 = 82 + var22 / 125) > 104) {
                                    var22 = 104;
                                }

                                if (var7) {
                                    VDTT_aa.c(var1, var19, VDTT_jb.a(var7 != var25.h[var12].f, var25.h[var12].b), var2 - var25.h[var12].d, var3 + var23 + var25.h[var12].e * var22 / 100, var22, 33);
                                } else {
                                    VDTT_aa.c(var1, var19, VDTT_jb.a(var7 != var25.h[var12].f, var25.h[var12].b), var2 + var25.h[var12].d, var3 + var23 + var25.h[var12].e * var22 / 100, var22, 33);
                                }
                            } else if (var7) {
                                VDTT_dc.b(var1, var19, VDTT_jb.a(var7 != var25.h[var12].f, var25.h[var12].b), var2 - var25.h[var12].d, var3 + var25.h[var12].e, 33);
                            } else {
                                VDTT_dc.b(var1, var19, VDTT_jb.a(var7 != var25.h[var12].f, var25.h[var12].b), var2 + var25.h[var12].d, var3 + var25.h[var12].e, 33);
                            }
                        } else {
                            if (var25.c()) {
                                if ((var19 = var25.h[var12].a) >= 7762 && var19 <= 7770) {
                                    if (this.e == 0) {
                                        var19 = 7762 + DataCenter.d().h / 4 % 3;
                                    } else {
                                        var19 = 7765 + DataCenter.d().h / 2 % 6;
                                    }
                                } else if (var19 >= 8164 && var19 <= 8170) {
                                    if (this.e == 0) {
                                        var19 = 8164 + DataCenter.d().h / 6 % 2;
                                    } else {
                                        var19 = 8166 + DataCenter.d().h / 4 % 5;
                                    }
                                }
                            }

                            if (var9) {
                                var22 = 0;
                                var23 = 78;
                                if (var11 != null) {
                                    var23 = 83;
                                } else if (var25.b()) {
                                    var23 = 79;
                                }

                                if (var11 == null) {
                                    if (var25.d == 1 && var12 >= 24 && var12 <= 29) {
                                        var22 = 1 + var12 % 2;
                                    }

                                    if (var25.d == 8 && var12 >= 18 && var12 <= 23) {
                                        var22 = -var12 % 2;
                                    }
                                } else if (var25.d == 1 && (var25.c == 44 && var12 < 18 || var12 < 12)) {
                                    var22 = 1;
                                }

                                if (var12 >= 30 && var12 <= 35) {
                                    var12 = 30;
                                }

                                if (var7) {
                                    VDTT_aa.c(var1, var19, VDTT_jb.a(var7 != var25.h[var12].f, var25.h[var12].b), var2 - var25.h[var12].d, var3 + var22 + var25.h[var12].e * var23 / 100, var23, 33);
                                } else {
                                    VDTT_aa.c(var1, var19, VDTT_jb.a(var7 != var25.h[var12].f, var25.h[var12].b), var2 + var25.h[var12].d, var3 + var22 + var25.h[var12].e * var23 / 100, var23, 33);
                                }
                            } else if (var7) {
                                VDTT_dc.b(var1, var19, VDTT_jb.a(var7 != var25.h[var12].f, var25.h[var12].b), var2 - var25.h[var12].d, var3 + var25.h[var12].e, 33);
                            } else {
                                VDTT_dc.b(var1, var19, VDTT_jb.a(var7 != var25.h[var12].f, var25.h[var12].b), var2 + var25.h[var12].d, var3 + var25.h[var12].e, 33);
                            }
                        }

                        if (var8 && var25.d == 1) {
                            var1.r();
                        } else if (var25.f == -1 && !DataCenter.aR.contains((short) var19)) {
                            var1.r();
                        } else if (var25.f != 0) {
                            if (var25.f >= -180 && var25.f <= 180) {
                                var1.r();
                            } else {
                                var1.f();
                            }
                        } else if (var18) {
                            var1.r();
                        }

                        if (var11 == null && var25.d == 2 && n(var12) || var25.d == 2 && (var13 != 0 || var14 != 50) && var25.c != 588) {
                            var1.a(-var1.e, -var1.f);
                            var1.a(0, 0);
                            var1.d(0, 0, DataCenter.d().n, DataCenter.d().o);
                            var1.a(var20, var21);
                        }
                    }
                }
            }
        }

        var10 = false;
        var1.j = var10;
    }

    private void am() {
        this.e = 7;
        this.aN = this.objX;
        this.aO = this.objY;
        this.aG = 1;
    }

    private void an() {
        if (DataCenter.d().h % 4 == 0) {
            if (this.bc.size() >= 3) {
                this.bc.remove(0);
            }

            VDTT_ek var1;
            (var1 = new VDTT_ek()).av = this.av;
            var1.f(this.objX, this.objY);
            var1.e = this.e;
            var1.d = this.d;
            var1.aF = this.aF;
            short var3 = this.K;
            var1.K = (short) var3;
            var1.be.addAll(this.be);
            this.bc.add(var1);
        }

        if (this.bo > 0) {
            --this.bo;
        }

    }

    private boolean ao() {
        try {
            this.bZ = this.objX;
            this.ca = this.objY;
            int var1 = 0;
            int var2 = 0;
            boolean var5 = false;
            if (this.aR[10] != null && this.ax <= 50) {
                ++this.ax;
            }

            if (this.ae != null) {
                this.a(this.ae);
                int var3;
                int var4;
                if (this.ae.c != 0) {
                    var3 = this.ae.c + this.bd.size();
                    var4 = this.ae.c + this.bd.size();
                } else {
                    var3 = this.ae.a;
                    var4 = this.ae.b;
                }

                if (this.aX != null) {
                    var3 = 11;
                    var4 = 11;
                    var5 = true;
                }

                if (this.p() && VDTT_cw.v().C().d == 20) {
                    var3 = 10;
                    var4 = 10;
                }

                int var6;
                int var7;
                if (this.ae.g > 0) {
                    VDTT_gm var11;
                    if ((var11 = this.ae).p > 0) {
                        --var11.p;
                        this.e = 6;
                        if (var11.p <= 0) {
                            this.e = 7;
                            ++var11.g;
                        }
                    }

                    var6 = 0;
                    if (var11.g > 0) {
                        var11.d = var11.objY;
                        if (MenuConfig.K().W && !var11.k) {
                            var11.g = 0;
                        } else {
                            label395:
                            {
                                if (var11.n != 0) {
                                    if (var11.n > var11.objX) {
                                        var11.objX = (short) (var11.objX + 6);
                                    } else if (var11.n < var11.objX) {
                                        var11.objX = (short) (var11.objX - 6);
                                    }

                                    if (VDTT_jb.b(var11.n - var11.objX) <= 6) {
                                        var11.objX = var11.n;
                                    }
                                }

                                var7 = var11.objX - this.objX;
                                if (var11.a()) {
                                    var11.e = var11.d - this.objY << 2;
                                    var11.f += var11.e;
                                    var6 = var11.f >> 2;
                                    var11.f &= 15;
                                    int var8 = var11.m ? 30 : 10;
                                    if (VDTT_jb.b(var11.h - this.objY) > var11.i) {
                                        var8 = var11.c;
                                    }

                                    if (var6 < -var8) {
                                        var6 = -var8;
                                    }

                                    if (var6 >= 0) {
                                        var6 = -1;
                                    }

                                    if (this.objY + var6 <= var11.d) {
                                        if (var11.j) {
                                            this.objY = var11.objY;
                                            this.objX = var11.objX;
                                            if (var11.o != 0) {
                                                var11.objY = var11.o;
                                                var11.d = var11.objY;
                                                var11.e = var11.f = 0;
                                                var11.e = 0;
                                                ++var11.g;
                                            } else {
                                                var11.g = 0;
                                            }
                                            break label395;
                                        }

                                        var6 = 0;
                                        var11.d = var11.objY;
                                        var11.e = var11.f = 0;
                                        var11.e = 0;
                                        if (!var11.m) {
                                            ++var11.g;
                                        }
                                    }
                                } else if (var11.b()) {
                                    if (var11.o != 0) {
                                        var11.objY = var11.o;
                                    }

                                    if (!var11.l) {
                                        var6 = this.objY + 0;
                                        XYEntity var13;
                                        if ((var13 = a(this.objX, var6, (int) 1)) != null) {
                                            var11.objY = (short) (var13.objY - 1);
                                        }
                                    }

                                    if (var11.m) {
                                        var11.e += 3;
                                    } else {
                                        ++var11.e;
                                    }

                                    var6 = var11.e;
                                    if (this.objY + var6 >= var11.objY) {
                                        var6 = var11.objY - this.objY;
                                        if (!var11.l) {
                                            var11.g = 0;
                                            this.I();//
                                            var11.l = false;
                                            if (var11.m) {
                                                VDTT_cw.v().cN = 35;
                                            }
                                        }
                                    }
                                }

                                int var10001 = this.objX + var7;
                                short var10002 = this.objY;
                                if (VDTT_cw.v().U.a(var10001, var10002 + var6)) {
                                    var7 = 0;
                                }

                                this.objX = (short) (this.objX + var7);
                                if (this.objX <= 16) {
                                    this.objX = 16;
                                } else if (this.objX >= VDTT_cw.v().aj - 16) {
                                    this.objX = (short) (VDTT_cw.v().aj - 16);
                                }

                                this.objY = (short) (this.objY + var6);
                            }
                        }
                    }

                    this.K();
                } else if (this.objX != this.ae.objX && this.objY != this.ae.objY) {
                    var5 = true;
                    var6 = VDTT_jb.b(this.objX, this.ae.objX);
                    var7 = VDTT_jb.b(this.objY, this.ae.objY);
                    if (var6 < var3) {
                        var3 = var6;
                    }

                    if (var7 < var4) {
                        var4 = var7;
                    }

                    if (var6 > var7) {
                        var1 = var3;
                        var2 = var7 / (var6 / var3);
                    } else if (var7 > var6) {
                        var2 = var4;
                        var1 = var6 / (var7 / var4);
                    } else {
                        var1 = var3;
                        var2 = var4;
                    }

                    if (this.ae.objX < this.objX) {
                        var1 = -var1;
                    }

                    if (this.ae.objY < this.objY) {
                        var2 = -var2;
                    }
                } else {
                    if (VDTT_jb.b(this.objX, this.objY, this.ae.objX, this.ae.objY) < 20) {
                        if (this.objY < this.ae.objY) {
                            var2 = var4;
                        } else if (this.objY > this.ae.objY) {
                            var2 = -var4;
                        } else if (this.objX < this.ae.objX) {
                            var1 = var3;
                        } else if (this.objX > this.ae.objX) {
                            var1 = -var3;
                        }
                    } else if (this.objY < this.ae.objY) {
                        var2 = var4;
                    } else if (this.objY > this.ae.objY) {
                        var2 = -var4;
                    } else if (this.objX < this.ae.objX) {
                        var1 = var3;
                    } else if (this.objX > this.ae.objX) {
                        var1 = -var3;
                    }

                    var3 = VDTT_jb.b(this.objX, this.ae.objX);
                    var4 = VDTT_jb.b(this.objY, this.ae.objY);
                    if (var3 < VDTT_jb.b(var1)) {
                        var1 = var1 > 0 ? var3 : -var3;
                    }

                    if (var4 < VDTT_jb.b(var2)) {
                        var2 = var2 > 0 ? var4 : -var4;
                    }
                }
            }

            this.objX = (short) (this.objX + var1);
            this.objY = (short) (this.objY + var2);
            this.aI = this.objX;
            this.aJ = this.objY;
            if (var2 < 0 && var1 == 0) {
                this.aE = 3;
                this.aq();
                if (!this.p()) {
                    this.d = 1;
                }
            } else if (var2 > 0 && (var1 == 0 || !this.p() && this.d == 0 && this.cs < 10)) {
                this.aE = 4;
                if (!this.p()) {
                    this.d = 0;
                }

                if (!this.af() && this.U() == null && !this.ah() && (this.ae == null || this.ae.g == 0)) {
                    this.I();
                }
            } else {
                XYEntity var12;
                if ((var12 = this.U()) == null) {
                    ++this.aH;
                } else {
                    this.aH = 0;
                }

                if (var12 == null && this.aG != 2 && (this.p() || this.aH >= 2 && this.cs < 10)) {
                    this.aE = 2;
                    this.ap();//
                } else {
                    this.aE = 100;
                    this.aq();
                }
            }

            if (this.ae != null && this.objX == this.ae.objX && this.objY == this.ae.objY || this.ae == null && this.bd.size() == 0) {
                Object var10;
                if (this.ae == null && this.bd.size() == 0) {
                    var10 = null;
                    this.ae = (VDTT_gm) var10;
                    this.j();
                } else if (this.ae.g != 1 && this.ae.g != 2) {
                    var10 = null;
                    this.ae = (VDTT_gm) var10;
                    this.j();
                }
            }

            if (this.ae == null && this.bd.size() > 0) {
                VDTT_gm var14 = (VDTT_gm) this.bd.firstElement();
                this.ae = var14;
                if (this.objX == this.ae.objX && this.ae.objY > this.objY) {
                    if (this.co < this.ae.c) {
                        this.co = this.ae.c;
                    }

                    if (VDTT_jb.a((int) 3) < 2) {
                        ++this.co;
                    }

                    this.ae.c = this.co;
                } else {
                    this.co = 0;
                }

                this.bd.removeElement(this.ae);
                this.a(this.ae);
            }

            if (this.aE == 2) {
                this.cl.o = this.d != 3;
                this.cl.f(this.objX + (this.d == 3 ? 5 : -5), this.objY);
                this.cl.n();
            }

            ++this.f;
            if (this.f >= 20) {
                this.f = 0;
            }

            if (!var5 && this.p() && this.objX != VDTT_eu.a && this.objY != VDTT_eu.b) {
                return true;
            }
        } catch (Exception var9) {
        }

        return false;
    }

    void G() {
        if (this.p()) {
            VDTT_cw.v().co = true;
        }

    }

    private void ap() {
        if (!this.ab() && VDTT_jb.a() - this.bj > 300L) {
            this.bj = VDTT_jb.a();
            if (this.p() && this.e == 2) {
                VDTT_ac.b().a(0.7F);
            }
        }

    }

    private void aq() {
        if (VDTT_jb.a() - this.cr > 500L) {
            this.cr = VDTT_jb.a();
            if (!this.ab()) {
                if (this.p()) {
                    if (this.aj() != 0) {
                        VDTT_ac.b().b(0.5F);
                        return;
                    }

                    if (!this.q()) {
                        VDTT_ac.b().a(0.2F, false);
                        return;
                    }
                }
            } else if (!this.q() && this.aC()) {
                if (!this.Z()) {
                    VDTT_ac.b().v();
                    return;
                }

                VDTT_ac.b().a(0.2F, this.aC());
            }
        }

    }

    public final void a(VDTT_gm var1) {
        if (VDTT_jb.b(this.objX - var1.objX) > 1) {
            if (this.objX < var1.objX) {
                this.aF = this.d = 2;
            } else if (this.objX > var1.objX) {
                this.aF = this.d = 3;
            }
        }

        if (!this.p()) {
            int var2 = VDTT_jb.b(var1.objX - this.objX);
            int var3 = VDTT_jb.b(var1.objY - this.objY);
            short var5 = this.objY;
            if (a(this.objX, var5, (int) 1) == null) {
                this.cs = 0;
            } else if (var3 == 0 || var2 != 0 && var2 == var3) {
                ++this.cs;
            }

            if (this.cs < 10) {
                if (this.objY < var1.objY) {
                    this.d = 0;
                    return;
                }

                if (this.objY > var1.objY) {
                    this.d = 1;
                }
            }
        }

    }

    private void a(boolean var1) {
        if (this.e != 0 && !var1) {
            if (this.e == 2) {
                XYEntity var9;
                if ((var9 = this.U()) != null || this.aG == 2 || !this.p() && this.aH < 2) {
                    if (this.d != 1 && this.d != 0) {
                        int var10 = VDTT_jb.b(this.bZ - this.objX);
                        int var11 = VDTT_jb.b(this.ca - this.objY);
                        if (var10 == 0) {
                            this.cC = 0;
                            if (var11 > 0) {
                                this.aE = 3;
                            } else {
                                this.aE = 4;
                            }
                        } else if (var9 == null) {
                            this.aE = 2;
                        } else {
                            this.aE = 5;
                        }
                    } else if (var9 == null) {
                        this.aE = 2;
                    } else {
                        if (this.d == 1) {
                            this.aE = 3;
                        } else {
                            this.aE = 4;
                        }

                        if (!this.p()) {
                            if (VDTT_jb.b(this.bZ - this.objX) != 0) {
                                if (this.cC > 0) {
                                    ++this.cC;
                                } else if (this.bd.size() > 1) {
                                    VDTT_gm var2 = (VDTT_gm) this.bd.get(0);
                                    int var4 = 0;
                                    int var6 = 0;
                                    int var7 = 0;

                                    for (int var8 = 1; var8 < this.bd.size(); ++var8) {
                                        VDTT_gm var3 = (VDTT_gm) this.bd.get(var8);
                                        int var5 = VDTT_jb.b(var2.objY, var3.objY);
                                        if ((var7 = VDTT_jb.b(var2.objX, var3.objX)) == 0) {
                                            break;
                                        }

                                        if (var4 == 0 && var5 > 0) {
                                            var4 = var5;
                                        }

                                        if (var4 > 0 && var4 == var5) {
                                            ++var6;
                                        }

                                        var2 = var3;
                                    }

                                    if (var7 > 0 && var6 >= this.bd.size() - 1) {
                                        this.aE = 5;
                                    }
                                }
                            } else {
                                this.cC = 0;
                            }
                        }
                    }

                    if (this.cA > 0) {
                        --this.cA;
                        this.cC = 0;
                        if (var9 != null) {
                            this.aE = 3;
                        }
                    }

                    if (this.cB > 0) {
                        --this.cB;
                        this.cC = 0;
                        if (var9 != null) {
                            this.aE = 4;
                        }
                    }

                    this.aq();
                } else {
                    this.aE = 2;
                }

                this.K();
            } else if (this.e == 1) {
                this.aE = 7;
                this.K();
            } else if (this.e == 4) {
                this.aE = 6;
                this.K();
            }
        } else {
            if (this.U() != null) {
                this.aE = 3;
                this.aq();
            } else {
                this.aE = 0;
            }

            this.K();
        }

        this.ay();
    }

    private void ar() {
        this.objX = this.aL;
        this.objY = this.aM;
        if (this.p()) {
            VDTT_cw.v().bv = null;
        }

        XYEntity var1;
        if ((var1 = this.U()) != null) {
            this.objX = this.aL = var1.objX;
            this.objY = this.aM = var1.objY;
        } else {
            if (this.p() && !VDTT_cw.v().dJ) {
                if (MenuConfig.K().H() && VDTT_cw.v().C().d != 10 && VDTT_cw.v().C().d != 5 && VDTT_cw.v().C().d != 21 && (VDTT_cw.v().bT > 0 || VDTT_cw.v().C().d == 13)) {
                    VDTT_cw.v().Y();
                    return;
                }

                if (VDTT_cw.v().cA || MenuConfig.K().N() && MenuConfig.K().W && !VDTT_cw.v().V()) {
                    VDTT_cw.v().cA = true;
                    VDTT_cw.v().cC = 100;
                    VDTT_cw.v().cD = 120;
                    VDTT_cw.v().Z();
                    return;
                }
            }

        }
    }

    public final void H() {
        if (!VDTT_cw.v().b.contains(VDTT_kq.a) && VDTT_cw.v().aa() && !MenuConfig.K().N()) {
            VDTT_cw.v().a((MainScreen) (new VDTT_kq(VDTT_cw.v())));
            this.bH = MenuConfig.K().W;
            MenuConfig.K().a(false);
        }

    }

    private void as() {
        this.bZ = this.objX;
        this.ca = this.objY;
        this.aq();
        if (this.aG == 1) {
            this.g(this.aN, this.aO);
            if (this.ae != null || this.bd.size() > 0) {
                this.e = 2;
            }

            this.aE = 3;
        } else if (this.aG == 2) {
            this.objY = (short) (this.objY + this.cd);
            ++this.cd;
            if (this.objY > this.aO) {
                this.objY = this.aO;
            }

            this.aE = 4;
            if (this.objX == this.aN && this.objY == this.aO) {
                this.ap();
                this.aG = 0;
                this.j();
                this.G();
                if (!this.af() && !this.ah() && !this.q()) {
                    this.I();
                }
            }
        }

        this.K();
    }

    public final void I() {
        if (System.currentTimeMillis() - this.cE >= 2000L && !this.at() && !this.equals(this.bV)) {
            this.cE = System.currentTimeMillis();
            VDTT_cw.v().au.add(new VDTT_hi(131, this.objX, this.objY));
        }

        if (this.p()) {
            if (!this.aC()) {
                VDTT_ac.b().c(0.7F);
                return;
            }

            VDTT_ac.b().v();
        }

    }

    private boolean at() {
        for (int var1 = 0; var1 < this.be.size(); ++var1) {
            if (((VDTT_hc) this.be.elementAt(var1)).c()) {
                return true;
            }
        }

        return false;
    }

    public final void J() {
        if (this.aG == 2) {
            this.aN = this.objX;
            this.aO = this.objY;
            this.aG = 0;
            this.j();
            this.G();
        }

    }

    public final void K() {
        try {
            if (!this.h() && this.ae != null) {
                if (this.ae.a()) {
                    this.aE = 3;
                } else if (this.ae.b()) {
                    this.aE = 4;
                }
            }

            ++this.c;
            if (this.ab()) {
                this.aE = 0;
            }

            if (this.c >= DataCenter.d().X[this.aE].length) {
                if (this.h()) {
                    this.c = (short) (DataCenter.d().X[this.aE].length - 1);
                } else {
                    this.c = 0;
                }
            }

            short var2 = this.L = (short) DataCenter.d().X[this.aE][this.c];
            this.K = (short) var2;
        } catch (Exception var3) {
        }
    }

    private void au() {
        try {
            ++this.c;
            if (this.ab()) {
                this.aE = 0;
            }

            if (this.c >= DataCenter.d().X[this.aE].length) {
                this.c = 0;
            }

            this.L = (short) DataCenter.d().X[this.aE][this.c];
        } catch (Exception var1) {
        }
    }

    private void av() {
        this.aE = 0;
        if (this.aC()) {
            VDTT_ac.b().v();
        }

    }

    private void aw() {
        if (this.af != null) {
            VDTT_gm var2 = this.af;
            this.ae = var2;
            if (this.p()) {
                this.af = null;
                this.ao();
                return;
            }

            ++this.ae.c;
            this.af = null;
            this.ao();
        }

        if (this.b != Integer.MIN_VALUE) {
            if (this.aV != null) {
                this.aV.a(VDTT_cw.v().as, VDTT_cw.v().au);
            } else {
                this.j();
            }
        }

        this.au();
    }

    public final void c(int var1, int var2) {
        if (!this.ah()) {
            Object var4 = null;
            this.ae = (VDTT_gm) var4;
            if (VDTT_cw.v().C().d == 10) {
                VDTT_fz var3;
                (var3 = new VDTT_fz()).d = new XYEntity[5];
                var3.d[0] = new XYEntity();
                var3.d[0].f(481, 674);
                var3.d[1] = new XYEntity();
                var3.d[1].f(1029, 395);
                var3.d[2] = new XYEntity();
                var3.d[2].f(1029, 446);
                var3.d[3] = new XYEntity();
                var3.d[3].f(489, 705);
                var3.d[4] = new XYEntity();
                var3.d[4].f(481, 674);
                if (var3.a(var1, var2)) {
                    return;
                }
            }

            if (!this.a(false, false) && this.aY == null) {
                VDTT_fe.a(VDTT_cw.v().ai, var1, var2);
            }
        }
    }

    public final boolean L() {
        return this.aV != null && this.aZ.d == 5;
    }

    public final boolean M() {
        VDTT_fe.b();
        if (this.q()) {
            VDTT_gm var10000 = this.ae;
            var10000.objX = (short) (var10000.objX - 5);
            return false;
        } else {
            short var1 = VDTT_cw.v().C().d == 20 ? 10 : this.J;
            return this.a(this.objX - var1, this.objY, (byte) 3);
        }
    }

    public final boolean N() {
        short var1 = VDTT_cw.v().C().d == 20 ? 10 : this.J;
        return this.a(this.objX - var1, this.objY - var1, (byte) 3);
    }

    public final boolean O() {
        VDTT_fe.b();
        if (this.q()) {
            VDTT_gm var10000 = this.ae;
            var10000.objX = (short) (var10000.objX + 5);
            return false;
        } else {
            short var1 = VDTT_cw.v().C().d == 20 ? 10 : this.J;
            return this.a(this.objX + var1, this.objY, (byte) 2);
        }
    }

    public final boolean P() {
        short var1 = VDTT_cw.v().C().d == 20 ? 10 : this.J;
        return this.a(this.objX + var1, this.objY - var1, (byte) 2);
    }

    public final boolean a(int var1, int var2, byte var3) {
        VDTT_fe.b();
        if (!this.bE && !this.ah()) {
            if (!VDTT_cw.v().bZ && (var1 <= 15 || var1 >= VDTT_cw.v().aj - 15)) {
                for (int var4 = 0; var4 < VDTT_cw.v().av.size(); ++var4) {
                    VDTT_fx var5;
                    if ((var5 = (VDTT_fx) VDTT_cw.v().av.elementAt(var4)) != null && var5.objY - 50 <= this.objY && this.objY <= var5.objY + 5 && VDTT_jb.b(var5.objX, var1) < 300) {
                        VDTT_cw.v().h(this.objX, this.objY);
                        return false;
                    }
                }
            }

            MenuConfig.K().a(false);
            VDTT_cw.v().bv = null;
            VDTT_cw.v().aW = false;
            if (m().h()) {
                m().H();
                return false;
            } else if (this.aV == null && !this.a(false, false) && this.aG != 1 && this.aY == null) {
                m().j();
                if ((var3 == 3 || var3 == 2) && this.aF != var3) {
                    this.aF = var3;
                    return true;
                } else {
                    this.d = var3;
                    this.e = 2;
                    boolean var6 = true;
                    VDTT_cw.v().o.e = var6;
                    VDTT_gm var7;
                    XYEntity var8;
                    if (this.aG == 0 && !this.ab() && (var8 = a(var1, var2, (int) 1)) != null) {
                        for (int var10 = 0; var10 < 10 && VDTT_cw.v().U.a(var8.objX, var8.objY); ++var10) {
                            --var8.objY;
                        }

                        var7 = new VDTT_gm(var8.objX, var8.objY, this.J);
                        this.ae = var7;
                        this.ae.g = 2;
                        return true;
                    } else {
                        VDTT_gm var9 = new VDTT_gm((short) var1, (short) var2, this.J, this.J);
                        var7 = this.b(var9);
                        this.ae = var7;
                        return true;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public final void a(boolean var1, int var2) {
        if (this.ab()) {
            this.am();
        } else {
            this.e = 2;
            if (!this.q()) {
                VDTT_gm var3 = new VDTT_gm(this.objX, (short) (this.objY - var2), this.J, this.J);
                VDTT_gm var4 = this.b(var3);
                this.ae = var4;
                this.ae.a(this.objY, var2);
                this.ae.k = var1;
                VDTT_ac.b().s();
            }
        }
    }

    public final boolean Q() {
        VDTT_fe.b();
        if (!this.bE && !this.ah()) {
            short var1 = VDTT_cw.v().C().d == 20 ? 10 : this.J;
            VDTT_cw.v().bv = null;
            VDTT_cw.v().aW = false;
            MenuConfig.K().a(false);
            this.d = 1;
            if (m().h()) {
                m().H();
                return false;
            } else if (this.aV == null && !this.a(false, false) && this.aY == null) {
                // System.out.println(this.aG);
                if (this.aG == 0) {//
                    short var6 = this.objY;
                    if (a(this.objX, var6, (int) 1) == null) {
                        if (!this.q()) {
                            this.a(false, VDTT_cw.dN);
                        }
                    } else {
                        this.am();
                    }

                    return true;
                } else if (this.aG == 2) {
                    this.e = 2;
                    boolean var3 = true;
                    VDTT_cw.v().o.e = var3;
                    VDTT_gm var4 = new VDTT_gm(this.objX, (short) (this.objY - var1), var1, var1);
                    VDTT_gm var5 = this.b(var4);
                    this.ae = var5;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public final boolean R() {
        VDTT_fe.b();
        if (!this.bE && !this.ah()) {
            short var1 = VDTT_cw.v().C().d == 20 ? 10 : this.J;
            VDTT_cw.v().bv = null;
            VDTT_cw.v().aW = false;
            MenuConfig.K().a(false);
            this.d = 0;
            if (m().h()) {
                m().H();
                return false;
            } else if (this.aV == null && !this.a(false, false) && this.aG != 1 && this.aY == null) {
                m().j();
                if (this.d != 0) {
                    this.d = 0;
                    return true;
                } else {
                    boolean var4;
                    if (this.ab()) {
                        this.e = 2;
                        var4 = true;
                        VDTT_cw.v().o.e = var4;
                        VDTT_gm var5 = new VDTT_gm(this.objX, (short) (this.objY + var1), var1, var1);
                        this.ae = var5;
                        return true;
                    } else {
                        XYEntity var2;
                        if ((var2 = this.U()) != null) {
                            this.e = 2;
                            var4 = true;
                            VDTT_cw.v().o.e = var4;
                            VDTT_gm var3 = new VDTT_gm(this.objX, (short) (this.objY + var1), var1, var1);
                            if (!super.a(var3.objX, var3.objY)) {
                                var3 = new VDTT_gm(var2.objX, var2.objY, var1);
                            }

                            this.ae = var3;
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private void ax() {
        this.bd.addAll(this.cp);
        this.e = 2;
        this.cp.clear();
    }

    public final void a(short var1, short var2, boolean var3) {
        try {
            short var4 = this.J;
            if (!this.p()) {
                int var5 = var2 - this.cw;
                if (this.cz >= 15) {
                    this.cz = 0;
                    this.cA = 10;
                } else if (var5 == cD[this.cz]) {
                    ++this.cz;
                } else {
                    this.cz = 0;
                }

                if (var5 > this.cx) {
                    ++this.cy;
                    this.cx = var5;
                    if (this.cy >= 5) {
                        this.cz = 0;
                        this.cA = 0;
                        this.cB = 10;
                    }
                } else {
                    this.cx = 0;
                    this.cy = 0;
                    if (this.cB > 3) {
                        this.cB = 3;
                    }
                }

                if (this.cA == 0 && this.cB == 0 && this.K >= 30 && this.K <= 35 && a(var1, var2, (int) 1) != null) {
                    this.bT = 5;
                }

                if (this.aV != null && this.aV.d.l()) {
                    var4 = 15;
                }
            }

            VDTT_gm var8 = new VDTT_gm(var1, var2, var4);
            this.cp.addElement(var8);
            this.cq = System.currentTimeMillis();
            if (this.cp.size() > 5 || var3) {
                this.ax();
            }

            this.cw = var2;
        } catch (Exception var7) {
        }
    }

    public final void S() {
        if (this.p()) {
            Object var2 = null;
            this.ae = (VDTT_gm) var2;
            this.o();
            this.j();
            VDTT_fe.b();
        }

    }

    public final void T() {
        VDTT_cw.v().bg = null;
        VDTT_cw.v().aW = false;
        this.S();
    }

    public final void j() {
        if (this.aV != null) {
            this.e = 3;
            this.G();
        } else {
            if (this.ag > 0) {
                this.e = 0;
            }

            Object var2 = null;
            this.ae = (VDTT_gm) var2;
        }
    }

    private void ay() {
        try {
            if (!this.af()) {
                if (!this.Z() && !this.aA() && this.e != 7 && this.e != 4 && this.e != 5 && this.aV == null && this.aY == null && !this.ab() && !VDTT_cw.v().cm && !MenuConfig.K().W && this.p()) {//
                    XYEntity var1;
                    if ((var1 = this.U()) != null) {
                        ++this.cf;
                        if (this.cf > 10 || VDTT_jb.b(this.objY - var1.objY) < 40) {
                            this.cf = 0;
                            this.g(this.objX, var1.objY - 1);
                        }

                        return;
                    }

                    this.aG = 0;
                }

                this.cf = 0;
            }
        } catch (Exception var2) {
        }
    }

    public final XYEntity U() {
        return this.b == Integer.MIN_VALUE ? null : a(this.objX, this.objY, (int) (this.p() ? 1 : 2));
    }

    private void g(int var1, int var2) {
        this.aN = (short) var1;
        this.aO = (short) var2;
        this.aG = 2;
        this.cd = 0;
        this.e = 7;
    }

    public final VDTT_gm b(VDTT_gm var1) {
        if (!super.a(var1.objX, var1.objY)) {
            this.a(var1, 1, false);
        }

        return var1;
    }

    private XYEntity a(XYEntity paramVDTT_ai, int paramInt, boolean paramBoolean) {
        try {
            for (byte b = 1; b < 500; b++) {
                paramInt = paramVDTT_ai.objX + b * 1;
                short s = paramVDTT_ai.objY;
                if (a(paramInt, s)) {
                    paramVDTT_ai.f(paramInt, s);
                    return paramVDTT_ai;
                }
                paramInt = paramVDTT_ai.objX - b * 1;
                s = paramVDTT_ai.objY;
                if (a(paramInt, s)) {
                    paramVDTT_ai.f(paramInt, s);
                    return paramVDTT_ai;
                }
                paramInt = paramVDTT_ai.objX;
                int i = paramVDTT_ai.objY + b * 1;
                if (a(paramInt, i)) {
                    paramVDTT_ai.f(paramInt, i);
                    return paramVDTT_ai;
                }
                paramInt = paramVDTT_ai.objX;
                i = paramVDTT_ai.objY - b * 1;
                if (a(paramInt, i)) {
                    paramVDTT_ai.f(paramInt, i);
                    return paramVDTT_ai;
                }
                paramInt = paramVDTT_ai.objX + b * 1;
                i = paramVDTT_ai.objY - b * 1;
                if (a(paramInt, i)) {
                    paramVDTT_ai.f(paramInt, i);
                    return paramVDTT_ai;
                }
                paramInt = paramVDTT_ai.objX + b * 1;
                i = paramVDTT_ai.objY + b * 1;
                if (a(paramInt, i)) {
                    paramVDTT_ai.f(paramInt, i);
                    return paramVDTT_ai;
                }
                paramInt = paramVDTT_ai.objX - b * 1;
                i = paramVDTT_ai.objY - b * 1;
                if (a(paramInt, i)) {
                    paramVDTT_ai.f(paramInt, i);
                    return paramVDTT_ai;
                }
                paramInt = paramVDTT_ai.objX - b * 1;
                i = paramVDTT_ai.objY + b * 1;
                if (a(paramInt, i)) {
                    paramVDTT_ai.f(paramInt, i);
                    return paramVDTT_ai;
                }
            }
        } catch (Exception exception) {

        } finally {
        }
        return null;
    }

    public final String f() {
        return VDTT_jb.c(this.ag);
    }

    public final String g() {
        return VDTT_jb.c(this.ah);
    }

    public static void a(Message var0, Item[] var1) throws IOException {
        for (int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = null;
        }

        byte var6 = var0.readByte();

        for (int var4 = 0; var4 < var6; ++var4) {
            Item var3;
            (var3 = new Item()).c = var0.f();
            var3.t = var0.c();
            var3.h = var0.h();
            var3.g = var0.readByte();
            var3.s = var0.readByte();
            var3.f = var3.getItemTemplate().f;
            var3.strOptions = var0.b.c();
            var3.j = var0.b.c();
            var1[var3.f] = var3;
        }

    }

    public static void readItemPet(Message var0, Item[] var1) throws IOException {
        for (int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = null;
        }

        byte var6 = var0.readByte();

        for (int var4 = 0; var4 < var6; ++var4) {
            Item var3;
            (var3 = new Item()).c = var0.f();
            var3.t = var0.c();
            var3.h = var0.h();
            var3.g = var0.readByte();
            var3.s = var0.readByte();
            var3.f = var0.readByte();
            var3.strOptions = var0.b.c();
            var3.j = var0.b.c();
            var1[var3.f] = var3;
        }

    }

    public static void b(Message var0, Item[] var1) throws IOException {
        for (int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = null;
        }

        short var6 = var0.f();

        for (int var4 = 0; var4 < var6; ++var4) {
            Item var3;
            (var3 = new Item()).a(var0);

            try {
                var1[var3.f] = var3;
            } catch (Exception var5) {
                VDTT_jb.a(var5);
            }
        }

    }

    public final int f(int var1) {
        int var2 = 0;

        for (int var3 = 0; var3 < this.aP.length; ++var3) {
            if (this.aP[var3] != null && this.aP[var3].c == var1) {
                var2 += this.aP[var3].M();
            }
        }

        return var2;
    }

    public static boolean V() {
        return !(VDTT_cw.v().c instanceof VDTT_mt) && !(VDTT_cw.v().c instanceof VDTT_jp) && !(VDTT_cw.v().c instanceof VDTT_lq);
    }

    public final void a(int var1, boolean var2, boolean var3) {
        String var4;
        if (var1 - m().ak > 0) {
            var4 = Caption.q + " " + VDTT_jb.c(var1 - m().ak) + " " + Caption.yP[2];
            if (V()) {
                VDTT_bc.a(9, Caption.bY, var4);
            }

            if (var2) {
                DataCenter.d().ai.c(var4, -1);
            }

            if (var3) {
                VDTT_fg.a("+" + VDTT_jb.c(var1 - m().ak), m(), m().aK, 7);
            }
        } else if (var1 - m().ak < 0) {
            var4 = Caption.dw + " " + VDTT_jb.c(-(var1 - m().ak)) + " " + Caption.yP[2];
            if (V()) {
                VDTT_bc.a(9, Caption.bY, var4);
            }

            if (var2) {
                DataCenter.d().ai.c(var4, -1);
            }

            if (var3) {
                VDTT_fg.a(VDTT_jb.c(var1 - m().ak), m(), m().aK, 7);
            }
        }

        m().ak = var1;
    }

    public final void b(int var1, boolean var2, boolean var3) {
        String var4;
        if (var1 - m().al > 0) {
            var4 = Caption.q + " " + VDTT_jb.c(var1 - m().al) + " " + Caption.yP[3];
            if (V()) {
                VDTT_bc.a(9, Caption.bY, var4);
            }

            if (var2) {
                DataCenter.d().ai.c(var4, -1);
            }

            if (var3) {
                VDTT_fg.a("+" + VDTT_jb.c(var1 - m().al), m(), m().aK, 8);
            }
        } else if (var1 - m().al < 0) {
            var4 = Caption.dw + " " + VDTT_jb.c(-(var1 - m().al)) + " " + Caption.yP[3];
            if (V()) {
                VDTT_bc.a(9, Caption.bY, var4);
            }

            if (var2) {
                DataCenter.d().ai.c(var4, -1);
            }

            if (var3) {
                VDTT_fg.a(VDTT_jb.c(var1 - m().al), m(), m().aK, 8);
            }
        }

        m().al = var1;
    }

    public final void c(int var1, boolean var2, boolean var3) {
        String var4;
        if (var1 - m().an > 0) {
            var4 = Caption.q + " " + VDTT_jb.c(var1 - m().an) + " " + Caption.yP[0];
            if (V()) {
                VDTT_bc.a(9, Caption.bY, var4);
            }

            if (var2) {
                DataCenter.d().ai.c(var4, -1);
            }

            if (var3) {
                VDTT_fg.a("+" + VDTT_jb.c(var1 - m().an), m(), m().aK, 9);
            }
        } else if (var1 - m().an < 0) {
            var4 = Caption.dw + " " + VDTT_jb.c(-(var1 - m().an)) + " " + Caption.yP[0];
            if (V()) {
                VDTT_bc.a(9, Caption.bY, var4);
            }

            if (var2) {
                DataCenter.d().ai.c(var4, -1);
            }

            if (var3) {
                VDTT_fg.a(VDTT_jb.c(var1 - m().an), m(), m().aK, 9);
            }
        }

        m().an = var1;
    }

    public final void a(long var1, boolean var3) {
        if (this.p()) {
            long var4;
            if ((var4 = var1 / 10L - this.aC / 10L) > 0L) {
                if (!(VDTT_cw.v().c instanceof VDTT_cw)) {
                    VDTT_bc.a(9, Caption.bY, Caption.q + " " + VDTT_jb.c(var4) + " " + Caption.ck);
                }

                VDTT_fg.a("+" + VDTT_jb.c(var4), this, this.aK, 6);
                if (var3) {
                    DataCenter.d().ai.c(Caption.q + " " + VDTT_jb.c(var4) + " " + Caption.ck, -1);
                }
            } else if (var4 < 0L) {
                if (!(VDTT_cw.v().c instanceof VDTT_cw)) {
                    VDTT_bc.a(9, Caption.bY, Caption.dw + " " + VDTT_jb.c(var4) + " " + Caption.ck);
                }

                VDTT_fg.a(VDTT_jb.c(var4), this, this.aK, 6);
            }

            VDTT_cw.v();
        }

        this.aC = var1;
    }

    public final void W() {
        if (this.p() && !this.bO && !VDTT_cw.v().ac() && !m().ah()) {
            VDTT_eu.a(true);
        }

    }

    public final void a(VDTT_ic var1, VDTT_n var2, boolean var3) {
        try {
            if (!this.p() || !m().bE) {
                if (!this.p() && this.ae != null) {
                    this.bd.indexOf(this.ae, 0);
                    Object var4 = null;
                    this.ae = (VDTT_gm) var4;
                }

                boolean var7 = var1.k();
                if (!this.a(true, var7) && (!this.p() || this.e != 3 || var1 != null && var1.o)) {
                    if (var1 != null) {
                        var1.o = false;
                        if (var1.a(this, var3)) {
                            this.j();
                            this.j();
                            this.a((XYEntity) var2);
                            if (!this.a(false, var7)) {
                                if (!this.p() && this.aV != null) {
                                    this.aW.add(new VDTT_ii(var1, this, var2));
                                } else {
                                    this.aV = new VDTT_ii(var1, this, var2);
                                }
                            }
                            if (this.aV.c == null) {
                                try {
                                    ((String) null).charAt(0);
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                }
                            }

                            this.e = 3;
                            this.G();
                            var1.f();
                            this.ax = -1;
                            return;
                        }
                    } else if (this.p()) {
                        DataCenter.d().ai.c(Caption.dx, -2560);
                    }
                }

            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }
    }

    public final void a(VDTT_n var1, VDTT_ic var2) {
        try {
            if (this.p()) {
                if (m().bE) {
                    return;
                }

                this.W();
                if (var1 != null) {
                    if (var1 instanceof VDTT_ek) {
                        VDTT_dn.a().d(var2.b, var1.b);//char
                    } else {
                        VDTT_dn.a().a(var2.b, var1.b);//mob
                    }

                    return;
                }

                VDTT_dn.a().e(var2.b);
            }

        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public final boolean g(int var1) {
        for (var1 = 0; var1 < this.bb.size(); ++var1) {
            if (((VDTT_ez) this.bb.elementAt(var1)).c().d == 0) {
                return true;
            }
        }

        return false;
    }

    public final void a(String var1) {
        VDTT_cw.v().aW = false;
        if (this.p()) {
            VDTT_cw.J = var1;
            VDTT_ac.b().z();
        }

        byte var2 = 0;
        this.K = (short) var2;
        this.ce = 0;
        var1 = null;
        this.ae = null;
        this.o();
        this.ax = -1;
        this.az();
    }

    public final void i() {
        if (this.bU == null) {
            this.bL = 8;
            if (!DataCenter.l() && !DataCenter.aj) {
                VDTT_hi var1;
                (var1 = new VDTT_hi(442, this.k(), this.l(), 1)).J = true;
                this.bf.addElement(var1);
            }

        }
    }

    private void az() {
        this.aL = this.objX;
        this.aM = this.objY;
        this.aI = this.aL;
        this.aJ = this.aM;
        if (this.p() && (!MenuConfig.K().H() || m().am <= 0 && m().an <= 0)) {
            this.H();
        }

        this.c = 0;
        if (!this.af() && this.e != 4) {
            this.bf.addElement(new VDTT_hi(29, this.k(), this.l(), 1));
        }

        this.e = 4;
    }

    public final void X() {
        this.e = 0;
        this.G();
        if (!this.af()) {
            this.bf.addElement(new VDTT_hi(406, this.k(), this.l(), 4));
        }

    }

    public final void a(XYEntity var1) {
        if (!this.a(false, false)) {
            super.a(var1);
            this.aF = this.d;
        }

    }

    private boolean aA() {
        int var1 = 0;

        while (var1 < this.bb.size()) {
            switch (((VDTT_ez) this.bb.elementAt(var1)).a) {
                case 12:
                case 35:
                case 36:
                case 38:
                case 161:
                    return true;
                default:
                    ++var1;
            }
        }

        return false;
    }

    private boolean a(boolean var1, boolean var2) {
        if (!this.h() && (!VDTT_cw.v().cy || !this.p())) {
            for (int var3 = 0; var3 < this.bb.size(); ++var3) {
                switch (((VDTT_ez) this.bb.elementAt(var3)).a) {
                    case 12:
                    case 36:
                    case 38:
                    case 76:
                    case 146:
                    case 166:
                    case 175:
                        if (var1) {
                            return true;
                        }
                        break;
                    case 161:
                        if (!var2) {
                            return true;
                        }
                }
            }

            return false;
        } else {
            return true;
        }
    }

    public static boolean Y() {
        return VDTT_cw.v().dm + 30000L <= VDTT_jb.a();
    }

    public final boolean Z() {
        return this.bd.size() != 0 || this.ae != null || VDTT_fe.e();
    }

    public final Vector aa() {
        return this.a(this.aR);
    }

    public final Vector a(Item[] var1) {
        Vector var2 = new Vector();
        boolean var3 = this.ae();
        if (this.bv == null && this.bx != null) {
            if (var3) {
                this.a(var2, 60, 0);
            } else {
                this.a(var2, this.bx.c().f, 0);
            }
        }

        if (this.bv == null && this.by != null) {
            this.a(var2, this.by.c().f, 0);
        }

        for (int var4 = 0; var4 < this.bC.size(); ++var4) {
            if (this.bw != null && ((VDTT_ez) this.bC.get(var4)).a == 111) {
                if (this.bw.j == 11) {
                    this.a(var2, 61, 0, -1, this.bO);
                } else {
                    this.a(var2, 61, 0);
                }
            } else {
                this.a(var2, ((VDTT_ez) this.bC.get(var4)).j, 0);
            }
        }

        boolean var12 = false;
        VDTT_ez var5;
        if ((var5 = this.k(160)) == null) {
            var5 = this.k(167);
        }

        if (var5 == null) {
            var5 = this.k(138);
        }

        int var6;
        int var7;
        if ((this.bw == null || !this.bw.a(this) && this.bA != null) && (this.bv == null || !this.ck) && !this.aE() && var1[14] != null && var1[14].aq() > 0 && !var1[14].Z()) {
            var6 = var1[14].aq();
            int var8;
            if (this.bA == null || !this.aR[14].ag() && this.aR[14].c != 941) {
                if (!this.aF() && var1[15] != null && var1[15].aq() > 0) {
                    this.a(var2, var1[15].aq(), 0);

                    for (var8 = 0; var8 < var2.size(); ++var8) {
                        ((VDTT_he) var2.get(var8)).c();
                    }

                    this.a(var2, var6, 0);
                    ((VDTT_he) var2.get(var2.size() - 1)).g();
                } else {
                    this.a(var2, var6, 0);
                    if (!((VDTT_he) var2.get(var2.size() - 1)).f()) {
                        this.a(var2, 7, 0);
                    }
                }
            } else {
                var8 = 77;
                if (this.aR[0] != null && this.aR[0].ap()) {
                    var8 = 135;
                }

                if (var5 != null) {
                    var8 = var5.j;
                } else if (this.h(171) != null) {
                    var8 = 120;
                } else if (this.h(163) != null) {
                    var8 = 67;
                }

                this.a(var2, var8, 0);
            }

            if (this.bw != null && !this.bw.a(this) && this.bA != null) {
                this.a(var2, this.bw.j, 0);
                ((VDTT_he) var2.get(var2.size() - 1)).b();
            }
        } else {
            if (!this.W) {
                if (!this.aF() && var1[15] != null && var1[15].aq() > 0) {
                    this.a(var2, var1[15].aq(), 0);
                } else if (var5 != null && !this.aG()) {
                    var6 = var5.j;
                    this.a(var2, var6, 0);
                } else if (this.h(163) != null) {
                    this.a(var2, 67, 0);
                } else if (var1[13] != null && var1[13].aq() > 0 && this.bq != 5) {
                    if ((var6 = var1[13].aq()) == 6 && this.bA != null) {
                        var6 = 87;
                    }

                    this.a(var2, var6, 0);
                } else if (!DataCenter.aj && var1[2] != null && !var1[2].Z() && var1[2].aq() > 0) {
                    if ((var6 = var1[2].aq()) == 6 && this.bA != null) {
                        var6 = 87;
                    }

                    this.a(var2, var6, 0);
                } else if (!this.bO) {
                    this.a(var2, 2, 0);
                }
            }

            if (this.bw != null) {
                this.a(var2, this.bw.j, 0);
                if (this.bw.a(this) && this.bA != null) {
                    VDTT_he var15;
                    (var15 = (VDTT_he) var2.get(var2.size() - 1)).g();
                    var15.b();
                    var7 = 77;
                    if (this.aR[0] != null && this.aR[0].ap()) {
                        var7 = 135;
                    }

                    if (var5 != null) {
                        var7 = var5.j;
                    } else if (this.h(163) != null) {
                        var7 = 67;
                    }

                    this.a(var2, var7, 0);
                } else if (this.bO) {
                    ((VDTT_he) var2.get(var2.size() - 1)).b();
                    this.a(var2, this.aR[0].aq(), 0);
                }
            } else if (this.bO) {
                this.a(var2, this.aR[0].aq(), 0);
            } else {
                this.a(var2, 7, 0);
            }
        }

        if (this.bw != null && this.bv == null && !this.aF() && (this.bX > 0 || this.aR[15] != null && (this.aR[15].c >= 896 && this.aR[15].c <= 899 || this.aR[15].c >= 918 && this.aR[15].c <= 921 || this.aR[15].ao() && this.bA != null || this.aR[15].strOptions.startsWith("427,896") || this.aR[15].strOptions.startsWith("427,897") || this.aR[15].strOptions.startsWith("427,898") || this.aR[15].strOptions.startsWith("427,899") || this.aR[15].strOptions.startsWith("427,918") || this.aR[15].strOptions.startsWith("427,919") || this.aR[15].strOptions.startsWith("427,920") || this.aR[15].strOptions.startsWith("427,921") || this.aR[15].strOptions.startsWith("427,309")))) {
            var2.clear();
            this.a(var2, this.bw.j, 0);
            ((VDTT_he) var2.get(var2.size() - 1)).a();
            if (this.aR[15] != null && this.aR[15].c == 1089 && this.bA != null) {
                this.a(var2, 126, 0);
            } else if (this.aR[15] != null && this.aR[15].c == 918) {
                this.a(var2, 94, 0);
            } else if (this.aR[15] != null && this.aR[15].c == 919) {
                this.a(var2, 95, 0);
            } else if (this.aR[15] != null && this.aR[15].c == 920) {
                this.a(var2, 96, 0);
            } else if (this.aR[15] != null && this.aR[15].c == 921) {
                this.a(var2, 97, 0);
            } else if (this.bX > 0) {
                if (this.bX == 179) {
                    this.a(var2, 88, 0);
                } else if (this.bX == 180) {
                    this.a(var2, 89, 0);
                } else if (this.bX == 181) {
                    this.a(var2, 90, 0);
                } else if (this.bX == 182) {
                    this.a(var2, 94, 0);
                } else if (this.bX == 183) {
                    this.a(var2, 95, 0);
                } else if (this.bX == 184) {
                    this.a(var2, 96, 0);
                }
            } else if (this.aR[15] != null) {
                if (this.aR[15].c == 896) {
                    this.a(var2, 88, 0);
                } else if (this.aR[15].c == 897) {
                    this.a(var2, 89, 0);
                } else if (this.aR[15].c == 898) {
                    this.a(var2, 90, 0);
                } else if (this.aR[15].c == 899) {
                    this.a(var2, 91, 0);
                } else if (this.aR[15].c == 1089 && this.bA != null) {
                    this.a(var2, 126, 0);
                } else if (this.aR[15].c == 309 && this.bA != null) {
                    this.a(var2, 114, 0);
                }
            }

            var12 = true;
        }

        if (this.bp >= 0 && DataCenter.d().O[this.bp].a() > 0) {
            this.a(var2, DataCenter.d().O[this.bp].a(), 0);
        }

        short var18 = -1;
        short var10;
        int var13;
        if (this.bw == null && this.bv == null) {
            VDTT_ez var17;
            if ((var17 = this.k(165)) != null && !var3 && !this.aG() && this.bA == null) {
                for (var13 = 0; var13 < var2.size(); ++var13) {
                    ((VDTT_he) var2.get(var13)).d();
                }

                this.a(var2, var17.j, 0);
            }

            if (var1[14] != null && var1[14].getItemTemplate().b() > 0 && !this.aE()) {
                this.a(var2, var1[14].getItemTemplate().b(), 0);
                if (DataCenter.aj) {
                    VDTT_he var24 = (VDTT_he) var2.get(var2.size() - 1);
                    if (var3) {
                        var24.h();
                        var2.clear();
                        var2.add(var24);
                    } else {
                        var24.g();

                        for (var13 = 0; var13 < var2.size() - 1; ++var13) {
                            ((VDTT_he) var2.get(var13)).c();
                        }
                    }
                }
            } else {
                Item var22;
                if (this.bO && (var22 = this.aR[11]) != null && var22.strOptions != null && var22.strOptions.startsWith("436,")) {
                    VDTT_gz[] var14 = var22.L();
                    VDTT_gz var19;
                    int[] var10001 = (var19 = var14[0]).b;
                    var10 = DataCenter.d().O[var10001[1]].k;
                    var10001 = (var19 = var14[0]).b;
                    if (DataCenter.d().O[var10001[1]].a() > 0) {
                        var10001 = (var19 = var14[0]).b;
                        var10 = DataCenter.d().O[var10001[1]].a();
                    }

                    short[] var16;
                    if ((var16 = DataCenter.d().A[var10].a[0]).length == 1) {
                        if (!var22.ao() || this.bv == null) {
                            var18 = var16[0];
                        }
                    } else if (var16.length > 0) {
                        var2.clear();
                        this.a(var2, var10, 0);
                    }
                }
            }
        }

        VDTT_he var21;
        if (this.bz != null && this.bz.g.size() > 0 && this.bv == null) {
            short var25 = 335;
            if (this.bw != null) {
                for (var13 = var2.size() - 1; var13 >= 0; --var13) {
                    (var21 = (VDTT_he) var2.get(var13)).g();
                    if (var21.b.length == 0) {
                        var2.remove(var13);
                    } else if (var21.b[0] == 240) {
                        (var21 = DataCenter.d().z[585].a(0)).g();
                        var2.set(var13, var21);
                    }
                }
            } else {
                var2.clear();
                (var21 = DataCenter.d().z[((VDTT_ez) this.bz.g.get(0)).b].a(0)).a(this);
                var2.add(var21);
                if (((VDTT_ez) this.bz.g.get(0)).b == 586) {
                    var25 = 337;
                }
            }

            if (this.bw != null && this.bw.a == 102) {
                var25 = 336;
            }

            (var21 = DataCenter.d().z[this.bz.b].a(0)).c();
            var2.add(var21);

            for (var13 = 0; var13 < var2.size(); ++var13) {
                ((VDTT_he) var2.get(var13)).e();
            }

            var21 = DataCenter.d().z[588].a(0);
            var2.add(var21);
            var21 = DataCenter.d().z[589].a(0);
            var2.add(var21);
            var21 = DataCenter.d().z[var25].a(0);
            var2.add(var21);
        } else if (!this.aF()) {
            if (var1[15] != null && var1[15].getItemTemplate().b() > 0) {
                short[] var20;
                if ((var20 = DataCenter.d().A[var1[15].getItemTemplate().b()].a[0]).length == 1) {
                    if (!var1[15].ao() || this.bv == null) {
                        var18 = var20[0];
                    }
                } else if (var20.length > 0) {
                    this.a(var2, var1[15].getItemTemplate().b(), 0);
                }
            } else if (var18 == -1) {
                if (this.h(169) != null) {
                    var18 = 5;
                } else if (this.h(168) != null) {
                    var18 = 1;
                }
            }
        }

        int var11;
        if (this.bA != null && this.bv == null) {
            boolean var26 = var1[15] != null && (var1[15].ao() || var1[15].strOptions.startsWith("427,309"));
            if (!var12) {
                short var23 = 77;
                if (this.aR[0] != null && this.aR[0].ap()) {
                    var23 = 135;
                }

                for (var11 = 0; var11 < var2.size(); ++var11) {
                    (var21 = (VDTT_he) var2.get(var11)).b();
                    var21.c = new short[0];
                }

                if (var26) {
                    if (var1[15].c == 1089 && this.bA != null) {
                        this.a(var2, 126, 0);
                    } else if (var1[15].c == 309 && this.bA != null) {
                        this.a(var2, 114, 0);
                    }
                } else if (var1[14] != null && var1[14].c == 941) {
                    ((VDTT_he) var2.get(var2.size() - 1)).c();
                    this.a(var2, 105, 0);
                } else if ((this.bv == null || !this.ck) && !this.aE() && var1[14] != null && var1[14].aq() > 0 && !var1[14].Z() && var1[14].ag()) {
                    int var10000;
                    switch (var7 = var1[14].aq()) {
                        case 21:
                            var10000 = 83;
                            break;
                        case 30:
                            var10000 = 82;
                            break;
                        case 31:
                            var10000 = 84;
                            break;
                        case 42:
                            var10000 = 81;
                            break;
                        case 98:
                            var10000 = 99;
                            break;
                        case 140:
                            var10000 = 143;
                            break;
                        default:
                            var10000 = var7;
                    }

                    var11 = var10000;
                    this.a(var2, var11, 0);
                } else {
                    var10 = 0;

                    try {
                        var10 = VDTT_hd.a(var23, this.m, this.ae());
                    } catch (Exception var9) {
                    }

                    (var21 = DataCenter.d().z[var10].a(0)).g();
                    var2.add(var21);
                }
            }

            if (!var26) {
                var2.add(DataCenter.d().z[331].a(0));
            }
        }

        Vector var27 = new Vector();

        for (var13 = 0; var13 < var2.size(); ++var13) {
            var11 = (var21 = (VDTT_he) var2.get(var13)).d;
            var21.a(var27, this.bv != null);
            var21.d = var11;
            if (var18 > 0) {
                var21.a(var27, var18);
            }
        }

        return var27;
    }

    private void aB() {
        if (this.ab()) {
            if (this.bM > 0) {
                DataCenter.d().z[this.bM].a(0).a(this.be, false);
                return;
            }

            int var1 = 0;
            if (this.aR[10] != null) {
                var1 = (new int[]{-2, -159, -5, -20, 0, 25, 70, 71, -112, -107, -71, -60})[this.aR[10].getItemTemplate().i - 10];
            }

            DataCenter.d().z[760].a(var1).a(this.be, false);
        }

    }

    public final boolean ab() {
        if (this.h()) {
            return false;
        } else {
            return this.ci != null;
        }
    }

    private boolean aC() {
        if (this.h()) {
            return false;
        } else {
            return this.ci != null && this.ci.a == 145;
        }
    }

    private void a(Vector var1, int var2, int var3) {
        this.a(var1, var2, 0, 0, false);
    }

    public void a(Vector var1, int var2, int var3, boolean var4) {
        this.a(var1, var2, 0, 0, true);
    }

    private void a(Vector var1, int var2, int var3, int var4, boolean var5) {
        var3 = 0;

        try {
            var3 = VDTT_hd.a(var2, this.m, this.ae());
        } catch (Exception var6) {
        }

        this.ck = false;
        VDTT_ez var7 = this.bv;
        if (var5) {
            if (this.bV != null) {
                var7 = this.bV.bv;
            } else {
                var7 = null;
            }
        }

        if (var7 != null) {
            if (var7.d() < 1000) {
                if (DataCenter.d().h % 10 < 5) {
                    this.ck = false;
                } else {
                    var3 = var7.j;
                    this.ck = true;
                }
            } else {
                var3 = var7.j;
            }
        }

        var1.add(DataCenter.d().z[var3].a(var4));
    }

    public final void d(Message var1) {
        try {
            String var2;
            if ((var2 = var1.b.c()).length() > 0) {
                this.bh = new VDTT_eo();
                this.bh.a = var2;
                this.bh.b = var1.b.c();
                this.bh.c = var1.readByte();
                this.bh.d = var1.f();
            } else {
                this.bh = null;
            }

            this.aD();
        } catch (Exception var3) {
        }
    }

    private void aD() {
        this.bm = VDTT_dg.b(VDTT_dg.d, this.aD);
        if (this.bh != null) {
            this.bn = VDTT_dg.b(VDTT_dg.d, this.bh.a);
        } else {
            this.bn = 0;
        }
    }

    public final void b(Graphics var1) {
        try {
            if (!this.ah() && this.aY == null && (this.p() || !this.V) && VDTT_cw.v().bP <= 0 && !this.bD && !this.af()) {
                if (!this.al()) {
                    short var3 = this.objX;
                    byte var4 = -8;
                    if (this.bv != null) {
                        var4 = 8;
                    } else if (this.ae()) {
                        var4 = -2;
                    }

                    byte var5 = var4;
                    short var6 = this.objY;
                    if (this.bD) {
                        var5 = 18;
                    }

                    int var10000;
                    if (this.p()) {
                        var10000 = var6 - var5 - 65;
                    } else {
                        if (!this.h()) {
                            if (this.bO) {
                                var1.f(-16777216);
                                var1.c(var3 - 15, var6 - var5 - 60, 30, 7);
                                var1.f(-65536);
                                var1.c(var3 - 14, var6 - var5 - 59, this.a(28), 2);
                                var1.f(-16742145);
                                var1.c(var3 - 14, var6 - var5 - 59 + 3, this.c(28), 2);
                            } else {
                                var1.f(-16777216);
                                var1.c(var3 - 15, var6 - var5 - 68, 30, 4);
                                if (VDTT_cw.v().a(this)) {
                                    var1.f(-3407617);
                                } else if (VDTT_cw.v().C().d == 20) {
                                    if (VDTT_cw.v().ax.contains(this)) {
                                        var1.f(-16711681);
                                    } else {
                                        var1.f(-3407617);
                                    }
                                } else if (VDTT_cw.v().bp != null && VDTT_cw.v().bp.b(this.aD)) {
                                    var1.f(-16711681);
                                } else if (this.o <= 1 && m().o <= 1) {
                                    var1.f(-65536);
                                } else {
                                    var1.f(-9942667);
                                }

                                var1.c(var3 - 14, var6 - var5 - 67, this.a(28), 2);
                            }
                        }

                        var10000 = var6 - var5 - 70;
                    }

                    int var12 = var10000;
                    var12 = this.a(var1, var3, var12, 2);
                    if (this.o == 2) {
                        VDTT_dc.a(var1, 723, 0, var3 + this.bm / 2 + 3, var12, 6);
                    } else if (this.o == 3) {
                        VDTT_dc.a(var1, 724, 0, var3 + this.bm / 2 + 3, var12, 6);
                    } else if (this.o == 4 && this.bh != null) {
                        VDTT_dc.a(var1, this.bh.d, 0, var3 + this.bm / 2 + 3, var12, 6);
                    }

                    var12 -= this.c(var1, var3, var12);
                    var12 = this.d(var1, var3, var12);
                    var12 = this.e(var1, var3, var12);
                    Vector var14 = new Vector();

                    VDTT_ez var7;
                    int var13;
                    for (var13 = 0; var13 < this.bb.size(); ++var13) {
                        VDTT_ez var8 = var7 = (VDTT_ez) this.bb.elementAt(var13);
                        if (this.p() && var8.a == 154 ? false : var8.a()) {
                            var14.add(var7);
                        }
                    }

                    if (var14.size() > 0) {
                        int var11 = -(var14.size() - 1) * 17 / 2;

                        for (var13 = 0; var13 < var14.size(); ++var13) {
                            short var15 = (var7 = (VDTT_ez) var14.elementAt(var13)).c().e;
                            if (var7.a == 76 && var7.b != 300) {
                                var15 = 545;
                            }

                            var7.a(var1, this.objX + var11 - 7 + var13 * 17, var12 - 7, var15, true);
                        }

                        var12 -= 16;
                    }

                    if (VDTT_cw.v().bg != null && VDTT_cw.v().bg.equals(this)) {
                        VDTT_cw.v().bm.f(this.objX, var12 + 4);
                        VDTT_cw.v().bm.a(var1);
                    }

                    if (this.bi != null) {
                        this.bi.a(var1);
                    }

                }
            }
        } catch (Exception var10) {
            VDTT_jb.a(var10);
        }
    }

    public final void b(Graphics var1, int var2, int var3) {
        try {
            var3 = (var3 = this.a(var1, var2, 115, 2)) - this.c(var1, var2, var3);
            var3 = this.d(var1, var2, var3);
            this.e(var1, var2, var3);
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final boolean ac() {
        for (int var1 = 0; var1 < this.aP.length; ++var1) {
            Item var2;
            if ((var2 = this.aP[var1]) != null && Item.d(var2.c)) {
                return true;
            }
        }

        return false;
    }

    private int a(Graphics var1, int var2, int var3, int var4) {
        short var5 = -1;
        if (this.equals(VDTT_cw.v().bg)) {
            var5 = -6488;
        }

        VDTT_dg.b(VDTT_dg.d, var1, this.aD, var2, var3 - 5, 2, var5, -16777216);
        return var3 - 5;
    }

    private int c(Graphics var1, int var2, int var3) {
        if (this.bh != null) {
            if (this.bh.c >= 3 && this.bh.c <= 5) {
                int[] var4 = new int[]{749, 750, 751};
                VDTT_dc.a(var1, var4[this.bh.c - 3], 0, var2 - this.bn / 2 - 6, var3 - 10, 3);
            }

            VDTT_dg.b(VDTT_dg.d, var1, this.bh.a, var2, var3 - 10, 2, -223233, -16777216);
            return 10;
        } else {
            return 0;
        }
    }

    private int d(Graphics var1, int var2, int var3) {
        if (this.ay != 0 && this.ay >= 0 && this.ay < this.bg.length) {
            if (this.bg[this.ay].a.equals("Kẻ Diệt Thần")) {
                VDTT_dc.b(var1, 9309 + DataCenter.d().h / 3 % 20, 0, var2, var3 - 16, 3);
                return var3 - 18;
            } else if (this.bg[this.ay].a.equals("Đại Sư Thiên Sứ")) {
                VDTT_dc.b(var1, 9329 + DataCenter.d().h / 3 % 17, 0, var2, var3 - 16, 3);
                return var3 - 18;
            } else if (this.bg[this.ay].a.equals("Zeno")) {
                VDTT_dc.b(var1, 9366 + DataCenter.d().h / 3 % 10, 0, var2, var3 - 46, 3);
                return var3 - 48;
            } else if (this.bg[this.ay].a.equals("Siêu Saiyan")) {
                VDTT_dc.b(var1, 9346 + DataCenter.d().h / 3 % 10, 0, var2, var3 - 36, 3);
                return var3 - 38;
            } else if (this.bg[this.ay].a.equals("Ultra Instinct")) {
                VDTT_dc.b(var1, 9356 + DataCenter.d().h / 3 % 10, 0, var2, var3 - 36, 3);
                return var3 - 38;
            } else {
                if (this.bg[this.ay].f >= VDTT_dg.g.length) {
                    this.bg[this.ay].f = 0;
                }

                VDTT_dg.c(VDTT_dg.g[this.bg[this.ay].f], var1, this.bg[this.ay].a.trim(), var2, var3 - 10, this.bg[this.ay].c, this.bg[this.ay].d, this.bg[this.ay].e);
                return var3 - 12;
            }
        } else {
            return var3 + 2;
        }
    }

    private int e(Graphics var1, int var2, int var3) {
        VDTT_hi var4 = null;
        VDTT_hi var5 = null;

        for (int var6 = 0; var6 < this.bf.size(); ++var6) {
            VDTT_hi var7;
            if ((var7 = (VDTT_hi) this.bf.elementAt(var6)).k == 84) {
                var4 = var7;
                break;
            }

            if (var7.k == 85) {
                var5 = var7;
                break;
            }
        }

        if (var5 != null) {
            if (var5.m > 24) {
                VDTT_dg.b(VDTT_dg.g[0], var1, Caption.jF, var2, var3 - 15, -1, -6817632);
            } else if (var5.m > 19) {
                VDTT_dg.b(VDTT_dg.g[0], var1, Caption.jF, var2, var3 - 10, -1, -6817632);
            } else if (var5.m > 14) {
                VDTT_dg.b(VDTT_dg.g[0], var1, Caption.jF, var2, var3 - 5, -1, -6817632);
            }
        } else if (var4 != null) {
            if (var4.m > 24) {
                VDTT_dg.b(VDTT_dg.g[0], var1, Caption.ky + " " + this.w(), var2, var3 - 15, -1, -16711681);
            } else if (var4.m > 19) {
                VDTT_dg.b(VDTT_dg.g[0], var1, Caption.ky + " " + this.w(), var2, var3 - 10, -1, -16711681);
            } else if (var4.m > 14) {
                VDTT_dg.b(VDTT_dg.g[0], var1, Caption.ky + " " + this.w(), var2, var3 - 5, -1, -16711681);
            }
        } else if (this.p != 0) {
            if (this.p == 1) {
                VDTT_dg.b(VDTT_dg.g[1], var1, Caption.kz, var2, var3 - 16, -1, -2560);
            } else if (this.p == 2) {
                VDTT_dg.b(VDTT_dg.g[1], var1, Caption.kA, var2, var3 - 16, -1, -2560);
            } else if (this.p == 3) {
                VDTT_dg.b(VDTT_dg.g[1], var1, Caption.kB, var2, var3 - 16, -1, -2560);
            }
        } else if (this.N) {
            VDTT_dg.a(VDTT_dg.g[1], var1, Caption.ml, var2, var3 - 16, 2, -1, 4, 1);
        } else if (this.o == 1) {
            VDTT_dg.a(VDTT_dg.g[1], var1, Caption.mk, var2, var3 - 16, 2, -1, 4, 1);
        } else if (this.I > 0) {
            VDTT_dg.a(VDTT_dg.g[1], var1, Caption.bZ, var2, var3 - 16, 2, -1, 4, 1);
        }

        return var3 - 16;
    }

    public final int e() {
        return this.af() ? 4 : 3;
    }

    public final void a(short var1, short var2) {
        this.o();
        this.j();
        if (this.p()) {
            this.T();
            VDTT_eu.a = var1;
            VDTT_eu.b = var2;
        }

        this.objX = var1;
        this.objY = var2;
    }

    public final boolean ad() {
        for (int var1 = 0; var1 < this.bb.size(); ++var1) {
            if (((VDTT_ez) this.bb.get(var1)).c().d == 117) {
                return true;
            }
        }

        return false;
    }

    public final VDTT_ez h(int var1) {
        for (int var2 = 0; var2 < this.bb.size(); ++var2) {
            VDTT_ez var3;
            if ((var3 = (VDTT_ez) this.bb.get(var2)).c().a == var1) {
                return var3;
            }
        }

        return null;
    }

    private VDTT_ez k(int var1) {
        for (int var2 = 0; var2 < this.bb.size(); ++var2) {
            VDTT_ez var3;
            if ((var3 = (VDTT_ez) this.bb.get(var2)).c().d == var1) {
                return var3;
            }
        }

        return null;
    }

    public final void a(VDTT_ez var1) {
        for (int var2 = 0; var2 < this.bb.size(); ++var2) {
            VDTT_ez var3;
            if ((var3 = (VDTT_ez) this.bb.get(var2)).c().d == 77 && var3.c().b.contains(var1.c().b) && var3.c().e == var1.c().e && var1.i == var3.i) {
                if (var1.a == 159) {
                    var3.k = var1.b;
                }

                switch (var1.b) {
                    case 1:
                        var3.j = 8;
                        break;
                    case 2:
                        var3.j = 9;
                        break;
                    case 3:
                        var3.j = 10;
                        break;
                    case 4:
                        var3.j = 11;
                        break;
                    case 5:
                        var3.j = 16;
                        break;
                    case 6:
                        var3.j = 20;
                }

                var3.g.add(var1);
                return;
            }

            if (var3.c().b.equals(var1.c().b) && var3.c().e == var1.c().e && var1.i == var3.i) {
                var3.g.add(var1);
                return;
            }
        }

        this.bb.add(var1);
    }

    public final Item[] i(int var1) {
        switch (var1) {
            case 0:
                return this.aP;
            case 1:
                return this.aQ;
            case 2:
                return this.aR;
            case 3:
                return this.aS;
            case 4:
                return this.aT;
            case 5:
                return this.itemPet;
            default:
                return null;
        }
    }

    public final void a(VDTT_n var1) {
        this.aY = new VDTT_ee(this.aZ, var1);
        VDTT_cw.v().au.add(new VDTT_hi(337, this.objX, this.objY, 3));
        if (this.p()) {
            VDTT_cw.v().cE = var1;
            VDTT_cw.v().cF = 100;
        }

    }

    public final int j(int var1) {
        this.ad = var1;
        if (var1 % 9 == 0) {
            var1 = var1 / 9 * 9;
        } else {
            var1 = var1 / 9 * 9 + 9;
        }

        return var1;
    }

    public final boolean ae() {
        if (this.bz == null && this.bA == null) {
            return this.bs || !this.aE() && this.aR[14] != null && this.aR[14].ag() || this.bw != null && this.bw.a(this);
        } else {
            return false;
        }
    }

    public final boolean af() {
        return VDTT_cw.v().ac() && this.o == 0 && !this.bO || VDTT_cw.v().C().d == 19 && VDTT_cw.v().aw.contains(this) || this.ah();
    }

    public final int ag() {
        return DataCenter.d().CharactersTemplate[this.m].type;
    }

    private boolean aE() {
        return this.bq == 1 || this.bq == 3 || this.bq == 4 || this.bq == 5;
    }

    private boolean aF() {
        return this.bq == 2 || this.bq == 3 || this.bq == 5;
    }

    private boolean aG() {
        return this.bq == 4 || this.bq == 5;
    }

    private int l(int var1) {
        if (this.aR[15] != null) {
            switch (var1) {
                case 359:
                    var1 = 309;
                    break;
                case 360:
                    var1 = 310;
            }

            if (this.aR[15].c == 570) {
                switch (var1) {
                    case 309:
                        var1 = 377;
                        break;
                    case 310:
                        var1 = 378;
                }
            } else if (this.aR[15].c == 944) {
                switch (var1) {
                    case 309:
                        var1 = 379;
                        break;
                    case 310:
                        var1 = 380;
                }
            } else if (this.aR[15].c == 963) {
                switch (var1) {
                    case 309:
                        var1 = 6738;
                        break;
                    case 310:
                        var1 = 6739;
                }
            } else if (this.aR[15].c == 972) {
                switch (var1) {
                    case 309:
                        var1 = 6740;
                        break;
                    case 310:
                        var1 = 6741;
                }
            } else if (this.aR[15].c == 989) {
                switch (var1) {
                    case 309:
                        var1 = 3752;
                        break;
                    case 310:
                        var1 = 3753;
                }
            }
        }

        switch (var1) {
            case 309:
            case 359:
            case 6738:
                var1 += DataCenter.d().h / 5 % 2;
                break;
            case 310:
            case 360:
            case 6739:
                var1 -= DataCenter.d().h / 5 % 2;
        }

        return var1;
    }

    private int m(int var1) {
        if (this.bz != null || this.bA != null && this.aR[15] != null && this.aR[15].ao()) {
            switch (var1) {
                case 1902:
                    var1 = 1086;
                    break;
                case 3386:
                    var1 = 1087;
                    break;
                case 4719:
                    var1 = 1088;
            }
        }

        return var1;
    }

    public final boolean ah() {
        return this.bN && this.bz != null;
    }

    private static boolean n(int var0) {
        return var0 == 92 || var0 == 147 || var0 == 151;
    }

    public final void e(Message var1) throws IOException {
        VDTT_ix[] var2;
        (var2 = new VDTT_ix[var1.readByte() + 1])[0] = new VDTT_ix();
        var2[0].a = Caption.mI;

        for (int var3 = 1; var3 < var2.length; ++var3) {
            var2[var3] = new VDTT_ix();
            String var4 = var1.b.c();
            var2[var3].a = var4;
            var2[var3].b = var1.i();
            if (var4.startsWith(" ")) {
                var2[var3].c = var1.i();
            }

            var2[var3].a();
        }

        this.bg = var2;
    }

    public final String ai() {
        return DataCenter.d().CharactersTemplate[this.m].name;
    }
}
