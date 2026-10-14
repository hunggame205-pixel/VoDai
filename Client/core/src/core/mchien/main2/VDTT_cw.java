package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.PixmapIO;
import com.badlogic.gdx.graphics.Pixmap.Blending;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.ScreenUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Objects;
import java.util.Vector;

public final class VDTT_cw extends VDTT_p {

    public static boolean d;
    public static String I = "";
    public static String J = "";
    public static String K = "";
    public static int L;
    public static int M;
    public static long N;
    public static short[][] O;
    public static int P;
    private static VDTT_cw dR = null;
    private static VDTT_v dS;
    private static VDTT_v dT;
    private static short[][] dU = new short[][]{{649, 222}, {443, 223}, {612, 223}, {684, 223}, {405, 224}, {370, 226}, {719, 226}, {336, 228}, {754, 231}, {296, 232}, {788, 235}, {261, 237}, {823, 240}, {226, 243}, {859, 245}, {892, 250}, {189, 251}, {925, 257}, {153, 259}, {954, 264}, {117, 268}, {991, 276}, {85, 279}, {1020, 294}, {57, 299}, {1033, 316}, {45, 329}, {1021, 333}};
    private static short[][] dV = new short[][]{{309, 206}, {390, 206}, {473, 206}, {553, 206}, {630, 206}, {711, 206}, {781, 206}, {855, 206}, {820, 263}, {746, 263}, {669, 263}, {425, 263}, {346, 263}, {260, 263}, {193, 324}, {294, 324}, {379, 324}, {435, 324}, {646, 324}, {711, 324}, {785, 324}, {880, 324}, {819, 175}, {744, 175}, {654, 175}, {447, 175}, {351, 175}, {266, 175}, {231, 206}};
    private final int dW = 30;
    public Vector Q = new Vector();
    public Vector R = new Vector();
    public VDTT_ja[] S;
    public VDTT_fo[] T;
    public VDTT_fn U;
    public Vector V = new Vector();
    public Vector W = new Vector();
    public Vector X = new Vector();
    public Vector Y = new Vector();
    public Vector Z;
    public Vector aa;
    public Vector ab;
    public Vector ac;
    public VDTT_ic[] ad = new VDTT_ic[3];
    public VDTT_ic[] ae;
    public long af;
    public int ag;
    public int ah;
    public short ai;
    public short aj;
    public short ak;
    public short al;
    public short am = 4;
    public Vector an = new Vector();
    public Vector ao = new Vector();
    public Vector ap = new Vector();
    public Vector aq = new Vector();
    public Vector ar = new Vector();
    public Vector as;
    public Vector at;
    public Vector au;
    public Vector av;
    public Vector aw = new Vector();
    public Vector ax = new Vector();
    public VDTT_bm ay;
    public VDTT_bm az;
    public VDTT_bm aA;
    public VDTT_ll aB;
    public int aC;
    public VDTT_bb aD;
    public VDTT_ba[] aE = new VDTT_ba[4];
    public VDTT_ba aF;
    public VDTT_ba aG;
    public VDTT_ba aH;
    public VDTT_ba aI;
    public VDTT_ba aJ;
    public VDTT_ba aK;
    public VDTT_ba aL;
    public VDTT_ba aM;
    public VDTT_ba aN;
    public VDTT_ba aO;
    public VDTT_ca aP;
    public VDTT_bg aQ;
    public VDTT_bc aR;
    public VDTT_bw aS;
    public VDTT_bx aT;
    public boolean aU;
    public boolean aV;
    public boolean aW;
    public boolean aX;
    public boolean aY;
    public boolean aZ;
    public int ba = 33;
    public int bb = 40;
    public int bc;
    public int bd;
    public int be = 2;
    public int bf = 1;
    public VDTT_n bg;
    public VDTT_n bh;
    public VDTT_ft[] bi;
    public VDTT_ft[] bj;
    public VDTT_eb bk = new VDTT_eb();
    public Vector bl = new Vector();
    public VDTT_ev bm = new VDTT_ev(208, 0, 0, -1);
    public VDTT_ev bn = new VDTT_ev(0, 0, 0, -1);
    public VDTT_ic bo;
    public VDTT_it bp = new VDTT_it();
    public VDTT_kd bq;
    public int br;
    public int bs;
    public int bt;
    public int bu = -1;
    public VDTT_dy bv;
    public VDTT_dy bw;
    public VDTT_im bx;
    public VDTT_im by;
    public VDTT_im bz;
    public VDTT_im bA;
    public VDTT_im bB;
    public VDTT_im bC;
    public VDTT_im bD;
    public boolean bE;
    public boolean bF;
    public boolean bG;
    public Vector bH;
    public int bI;
    public int bJ;
    public int bK;
    public int bL;
    public int bM = 1000;
    public int bN;
    public int bO;
    public int bP = 0;
    public long bQ;
    public int bR;
    public int bS;
    public int bT;
    public int bU;
    public int bV;
    public int bW;
    public int bX = Integer.MIN_VALUE;
    public boolean bY;
    public boolean bZ;
    public boolean ca;
    public boolean cb;
    public boolean cc;
    public long cd;
    public long ce;
    public short cf;
    public short cg;
    public int ch;
    public int ci;
    public int cj;
    public int ck;
    public String cl = "";
    public boolean cm;
    public boolean cn = true;
    public boolean co;
    public byte cp;
    public byte cq;
    public byte cr;
    public byte cs;
    public Vector ct = new Vector();
    public byte cu;
    public byte cv;
    public byte cw;
    public int cx = -1;
    public boolean cy;
    public VDTT_gk cz;
    public boolean cA;
    public boolean cB;
    public int cC;
    public int cD;
    public VDTT_n cE;
    public int cF;
    public boolean cG;
    public int cH;
    public int cI = -1;
    public String cJ = "";
    public Vector cK;
    public Vector cL = new Vector();
    public int cM = 0;
    public int cN = 0;
    public boolean cO;
    public VDTT_ba cP;
    public VDTT_ba cQ;
    public VDTT_ba cR;
    public VDTT_ba cS;
    public VDTT_ba cT;
    public Vector cU;
    public int cV;
    public int cW;
    public int cX;
    public int cY;
    public int cZ;
    public long da;
    public short[] db;
    public int dc = 50;
    public int dd = 0;
    public int de;
    public int df = 30;
    public Vector dg = new Vector();
    public int dh = -1;
    public int di = -1;
    public int dj;
    public int dk;
    public long dl;
    public long dm;
    public VDTT_dz dn = new VDTT_dz();
    protected long do_renamed = 0L;
    public Vector dp;
    public Vector dq;
    private Vector dX;
    public Vector dr;
    public Vector ds;
    private Vector dY;
    public VDTT_bm dt;
    public VDTT_bm du;
    public VDTT_bm dv;
    public VDTT_bm dw;
    private VDTT_ba[] dZ = new VDTT_ba[4];
    public VDTT_ba dx;
    private VDTT_ba ea;
    private VDTT_ba eb;
    private int ec;
    private int ed;
    private int ee;
    private int ef;
    private int eg;
    private int eh;
    private int ei = Integer.MIN_VALUE;
    private int ej = 0;
    private Vector ek = new Vector();
    private Vector el = new Vector();
    private Vector em = new Vector();
    public VDTT_ba dy;
    public VDTT_ba dz;
    public VDTT_ba dA;
    public VDTT_ba dB;
    public VDTT_ba dC;
    private long en;
    private long lastTimeDelItem;
    private int eo;
    private long ep;
    public boolean dD;
    private int eq = 0;
    private boolean er;
    private long es;
    private int et = 5;
    private int eu = 1;
    private long ev;
    public long dE;
    public long dF;
    private VDTT_eg ew;
    public String dG;
    private int ex;
    private long ey;
    public Item dH;
    private boolean ez;
    private int[][] eA;
    public VDTT_ic dI;
    private int eB = 1;
    public boolean dJ = false;
    public static boolean dK;
    public static Hashtable dL;
    public long dM;
    public static int dN = 120;
    public Hashtable dO = new Hashtable();
    public Vector dP = new Vector();
    public Vector dQ = new Vector();

    public VDTT_cw() {
        this.ar = new Vector();
        this.as = new Vector();
        this.at = new Vector();
        this.au = new Vector();
        this.av = new Vector();
        this.dp = new Vector();
        this.dq = new Vector();
        this.dX = new Vector();
        this.Z = new Vector();
        this.aa = new Vector();
        this.ac = new Vector();
        this.dr = new Vector();
        this.bH = new Vector();
        this.ds = new Vector();
        this.cU = new Vector();
        this.bi = new VDTT_ft[0];
        this.bj = new VDTT_ft[0];
        int[] var1 = new int[]{223, 177, 189, 276, 156, 157, 158, 166, 168, 185, 186, 162, 169, 170, 301, 159, 281, 182, 183, 184, 300, 161, 277, 285, 265, 274, 267, 266, 307};
        this.dY = new Vector();

        for (int var2 = 0; var2 < 29; ++var2) {
            this.dY.add(var1[var2]);
        }

        this.cK = new Vector();
    }

    public static VDTT_cw v() {
        if (dR == null) {
            dR = new VDTT_cw();
        }

        return dR;
    }

    public static VDTT_cw w() {
        return dR;
    }

    public static int f(int var0) {
        int var1 = 0;

        for (int var2 = 0; var2 < DataCenter.d().x.length; ++var2) {
            for (int var3 = 0; var3 < DataCenter.d().x[var2].b.length; ++var3) {
                if (DataCenter.d().x[var2].b[var3].a == var0) {
                    var1 = var2;
                    break;
                }
            }
        }

        if (var1 >= Caption.Bs.length) {
            var1 = 0;
        }

        return var1;
    }

    public static void e(Graphics var0) {
        if (dT != null) {
            var0.a(dT, 0, 0, dT.c, dT.d, 0, 0.0F, 0.0F, (float) (DataCenter.d().n * DataCenter.d().r), (float) (DataCenter.d().o * DataCenter.d().r), 0);
        }

    }

    public static XYEntity g(int var0, int var1) {
        try {
            v();
            XYEntity var3;
            if ((var3 = VDTT_fn.c(var0, var1)) != null && VDTT_jb.b(var1 - var3.objY) > 1) {
                return var3;
            }
        } catch (Exception var2) {
        }

        return null;
    }

    private void a(VDTT_de var1) throws IOException {
        this.S = new VDTT_ja[var1.a.readUnsignedShort()];
        Vector var4 = new Vector();

        short var2;
        short var3;
        VDTT_fz var5;
        int var7;
        int var8;
        int var9;
        VDTT_fz[] var11;
        for (short var6 = 0; var6 < this.S.length; ++var6) {
            var4.removeAllElements();
            this.S[var6] = new VDTT_ja();
            this.S[var6].a = var1.a.readShort();
            this.S[var6].b = var1.a.readShort();
            this.S[var6].c = var1.a.readByte();
            this.S[var6].d = var1.a.readShort();
            this.S[var6].e = var1.a.readShort();
            var2 = var1.a();

            for (var7 = 0; var7 < var2; ++var7) {
                var3 = var1.a();

                for (var8 = 0; var8 < var3; ++var8) {
                    (var5 = new VDTT_fz()).d = new XYEntity[var1.a.readByte() / 2];

                    for (var9 = 0; var9 < var5.d.length; ++var9) {
                        var5.d[var9] = new XYEntity();
                        var5.d[var9].f(var1.a.readShort(), var1.a.readShort());
                        if (var9 == 0) {
                            var5.e = var5.g = var5.d[var9].objX;
                            var5.f = var5.h = var5.d[var9].objY;
                        } else {
                            if (var5.d[var9].objX < var5.e) {
                                var5.e = var5.d[var9].objX;
                            }

                            if (var5.d[var9].objX > var5.g) {
                                var5.g = var5.d[var9].objX;
                            }

                            if (var5.d[var9].objY < var5.f) {
                                var5.f = var5.d[var9].objY;
                            }

                            if (var5.d[var9].objY > var5.h) {
                                var5.h = var5.d[var9].objY;
                            }
                        }
                    }

                    var4.addElement(var5);
                }
            }

            if (var4.size() > 0) {
                var11 = new VDTT_fz[var4.size()];

                for (var7 = 0; var7 < var4.size(); ++var7) {
                    var11[var7] = (VDTT_fz) var4.elementAt(var7);
                }

                this.S[var6].f = new VDTT_fn(var11);
            }
        }

        this.T = new VDTT_fo[var1.a.readUnsignedShort()];

        for (int var12 = 0; var12 < this.T.length; ++var12) {
            var4.removeAllElements();
            this.T[var12] = new VDTT_fo();
            this.T[var12].a = var1.a.readShort();
            this.T[var12].b = var1.a.readShort();
            this.T[var12].c = new VDTT_iz[var1.a()];

            for (var7 = 0; var7 < this.T[var12].c.length; ++var7) {
                this.T[var12].c[var7] = new VDTT_iz(var1.a.readShort());
                this.T[var12].c[var7].objX = this.T[var12].c[var7].m = var1.a.readShort();
                this.T[var12].c[var7].objY = this.T[var12].c[var7].n = var1.a.readShort();
                this.T[var12].c[var7].k = var1.a.readByte();
                if (this.T[var12].c[var7].m().f != null) {
                    for (var8 = 0; var8 < this.T[var12].c[var7].m().f.a.size(); ++var8) {
                        var5 = ((VDTT_fz) this.T[var12].c[var7].m().f.a.get(var8)).a();
                        if (this.T[var12].c[var7].k == 7) {
                            var5.d = VDTT_jb.a(var5.d);
                        }

                        for (var9 = 0; var9 < var5.d.length; ++var9) {
                            XYEntity var10000 = var5.d[var9];
                            var10000.objX += this.T[var12].c[var7].objX;
                            var10000 = var5.d[var9];
                            var10000.objY += this.T[var12].c[var7].objY;
                            if (var9 == 0) {
                                var5.e = var5.g = var5.d[var9].objX;
                                var5.f = var5.h = var5.d[var9].objY;
                            } else {
                                if (var5.d[var9].objX < var5.e) {
                                    var5.e = var5.d[var9].objX;
                                }

                                if (var5.d[var9].objX > var5.g) {
                                    var5.g = var5.d[var9].objX;
                                }

                                if (var5.d[var9].objY < var5.f) {
                                    var5.f = var5.d[var9].objY;
                                }

                                if (var5.d[var9].objY > var5.h) {
                                    var5.h = var5.d[var9].objY;
                                }
                            }
                        }

                        var4.addElement(var5);
                    }
                }
            }

            var2 = var1.a();

            for (var7 = 0; var7 < var2; ++var7) {
                var3 = var1.a();

                for (var8 = 0; var8 < var3; ++var8) {
                    (var5 = new VDTT_fz()).d = new XYEntity[var1.a.readByte() / 2];

                    for (var9 = 0; var9 < var5.d.length; ++var9) {
                        var5.d[var9] = new XYEntity();
                        var5.d[var9].f(var1.a.readShort(), var1.a.readShort());
                        if (var9 == 0) {
                            var5.e = var5.g = var5.d[var9].objX;
                            var5.f = var5.h = var5.d[var9].objY;
                        } else {
                            if (var5.d[var9].objX < var5.e) {
                                var5.e = var5.d[var9].objX;
                            }

                            if (var5.d[var9].objX > var5.g) {
                                var5.g = var5.d[var9].objX;
                            }

                            if (var5.d[var9].objY < var5.f) {
                                var5.f = var5.d[var9].objY;
                            }

                            if (var5.d[var9].objY > var5.h) {
                                var5.h = var5.d[var9].objY;
                            }
                        }
                    }

                    var4.addElement(var5);
                }
            }

            if (var4.size() > 0) {
                var11 = new VDTT_fz[var4.size()];

                for (var7 = 0; var7 < var4.size(); ++var7) {
                    var11[var7] = (VDTT_fz) var4.elementAt(var7);
                }

                this.T[var12].d = new VDTT_fn(var11);
            }
        }

    }

    public final void x() {
        this.af = VDTT_jb.a();
        VDTT_de var1 = null;

        try {
            m = true;
            this.bG = false;
            VDTT_ac.b().c();
            if ((var1 = VDTT_da.a("arr_map_" + this.ai)) != null) {
                this.cM = 0;
                this.a(var1);
                new Vector();
                this.aj = var1.a.readShort();
                this.ak = var1.a.readShort();
                VDTT_fz[] var2;
                (var2 = new VDTT_fz[var1.a() + 4])[var2.length - 1] = b(-50, -50, this.aj + 50, 50);
                var2[var2.length - 2] = b(-50, -50, 15, this.ak + 50);
                var2[var2.length - 3] = b(-50, this.ak - 15, this.aj + 50, this.ak + 50);
                var2[var2.length - 4] = b(this.aj - 15, -50, this.aj + 50, this.ak + 50);

                int var3;
                for (var3 = 0; var3 < var2.length - 4; ++var3) {
                    var2[var3] = new VDTT_fz();
                    var2[var3].d = new XYEntity[var1.a()];

                    for (int var4 = 0; var4 < var2[var3].d.length; ++var4) {
                        var2[var3].d[var4] = new XYEntity();
                        var2[var3].d[var4].f(var1.a.readShort(), var1.a.readShort());
                        if (var4 == 0) {
                            var2[var3].e = var2[var3].g = var2[var3].d[var4].objX;
                            var2[var3].f = var2[var3].h = var2[var3].d[var4].objY;
                        } else {
                            if (var2[var3].d[var4].objX < var2[var3].e) {
                                var2[var3].e = var2[var3].d[var4].objX;
                            }

                            if (var2[var3].d[var4].objX > var2[var3].g) {
                                var2[var3].g = var2[var3].d[var4].objX;
                            }

                            if (var2[var3].d[var4].objY < var2[var3].f) {
                                var2[var3].f = var2[var3].d[var4].objY;
                            }

                            if (var2[var3].d[var4].objY > var2[var3].h) {
                                var2[var3].h = var2[var3].d[var4].objY;
                            }
                        }
                    }
                }

                this.U = new VDTT_fn(var2);
                VDTT_fy[] var29 = new VDTT_fy[var1.a.readShort()];
                Vector var30 = new Vector();
                Vector var26 = new Vector();

                int var5;
                int var6;
                for (var5 = 0; var5 < var29.length; ++var5) {
                    var29[var5] = new VDTT_fy();
                    var29[var5].a = var1.a.readBoolean();
                    if (var29[var5].a) {
                        var26.add(var29[var5]);
                    } else {
                        var30.add(var29[var5]);
                    }

                    var29[var5].d = new XYEntity[var1.a.readShort()];

                    for (var6 = 0; var6 < var29[var5].d.length; ++var6) {
                        var29[var5].d[var6] = new XYEntity();
                        var29[var5].d[var6].f(var1.a.readShort(), var1.a.readShort());
                    }
                }

                this.dO.clear();
                this.dP.clear();
                this.dQ.clear();

                VDTT_fy var32;
                for (var5 = 0; var5 < var26.size(); ++var5) {
                    if ((var32 = (VDTT_fy) var26.get(var5)).d.length > 2) {
                        v().U.a.add(new VDTT_fz(var32.d));

                        try {
                            for (var3 = 0; var3 < var32.d.length; ++var3) {
                                if (var32.d[var3].objY != var32.d[var3 + 1].objY) {
                                    if (var32.d[var3].objY < var32.d[var3 + 1].objY) {
                                        this.dQ.add(new VDTT_fz(new XYEntity[]{var32.d[var3], var32.d[var3 + 1]}));
                                    } else {
                                        this.dQ.add(new VDTT_fz(new XYEntity[]{var32.d[var3 + 1], var32.d[var3]}));
                                    }

                                    ++var3;
                                }
                            }
                        } catch (Exception var23) {
                        }
                    } else {
                        for (var3 = 0; var3 < var32.d.length; ++var3) {
                            XYEntity var7 = var32.d[var3];
                            if (v().U.a(var7.objX, var7.objY)) {
                                XYEntity var8 = v().U.b(var7.objX, var7.objY);
                                var32.d[var3].objX = var8.objX;
                                var32.d[var3].objY = var8.objY;
                            }
                        }
                    }
                }

                var29 = new VDTT_fy[var30.size()];

                for (var5 = 0; var5 < var30.size(); ++var5) {
                    var29[var5] = (VDTT_fy) var30.get(var5);
                    if (VDTT_jb.b(var29[var5].d[0].objY - var29[var5].d[1].objY) > dN) {
                        if (var29[var5].d[0].objY > var29[var5].d[1].objY) {
                            this.a(var29[var5].d[1], var29[var5].d[0], true, this.dO);
                        } else {
                            this.a(var29[var5].d[0], var29[var5].d[1], true, this.dO);
                        }
                    } else {
                        this.a(var29[var5].d[0], var29[var5].d[1], true, this.dO);
                        this.a(var29[var5].d[1], var29[var5].d[0], true, this.dO);
                    }
                }

                Iterator var33 = this.dO.keySet().iterator();

                while (var33.hasNext()) {
                    String var34 = (String) var33.next();
                    ((VDTT_gq) this.dO.get(var34)).b = new Vector();
                    ((VDTT_gq) this.dO.get(var34)).c = new Vector();
                    ((VDTT_gq) this.dO.get(var34)).d = new Vector();
                    ((VDTT_gq) this.dO.get(var34)).e = new Vector();
                    ((VDTT_gq) this.dO.get(var34)).f = new Vector();
                    ((VDTT_gq) this.dO.get(var34)).e.addAll(((VDTT_gq) this.dO.get(var34)).a);
                    ((VDTT_gq) this.dO.get(var34)).f.addAll(((VDTT_gq) this.dO.get(var34)).a);
                    Collections.sort(((VDTT_gq) this.dO.get(var34)).e);
                    Collections.sort(((VDTT_gq) this.dO.get(var34)).f, Collections.reverseOrder());

                    for (var3 = ((VDTT_gq) this.dO.get(var34)).a.size() - 1; var3 >= 0; --var3) {
                        ((VDTT_gq) this.dO.get(var34)).b.add((String) ((VDTT_gq) this.dO.get(var34)).a.get(var3));
                    }

                    ((VDTT_gq) this.dO.get(var34)).c.addAll(((VDTT_gq) this.dO.get(var34)).a);
                    String var35;
                    if (((VDTT_gq) this.dO.get(var34)).c.size() > 0) {
                        var35 = (String) ((VDTT_gq) this.dO.get(var34)).c.get(0);
                        ((VDTT_gq) this.dO.get(var34)).c.removeElementAt(0);
                        ((VDTT_gq) this.dO.get(var34)).c.add(var35);
                    }

                    ((VDTT_gq) this.dO.get(var34)).d.addAll(((VDTT_gq) this.dO.get(var34)).b);
                    if (((VDTT_gq) this.dO.get(var34)).d.size() > 0) {
                        var35 = (String) ((VDTT_gq) this.dO.get(var34)).d.get(0);
                        ((VDTT_gq) this.dO.get(var34)).d.removeElementAt(0);
                        ((VDTT_gq) this.dO.get(var34)).d.add(var35);
                    }
                }

                this.W.clear();

                for (var5 = 0; var5 < var26.size(); ++var5) {
                    var32 = (VDTT_fy) var26.get(var5);

                    try {
                        for (var3 = 0; var3 < var32.d.length; var3 += 2) {
                            VDTT_fz var36;
                            (var36 = new VDTT_fz()).d = new XYEntity[2];
                            var36.d[0] = var32.d[var3];
                            var36.d[1] = var32.d[var3 + 1];
                            if (var36.d[0].objY == var36.d[1].objY && var36.d[0].objY < this.ak - 20) {
                                this.W.add(var36);
                            }
                        }
                    } catch (Exception var22) {
                    }
                }

                Collections.sort(this.dQ, VDTT_fz.c);
                Collections.sort(this.dP, VDTT_fz.b);
                Collections.sort(this.W, VDTT_fz.b);
                short var38 = var1.a.readShort();

                for (var6 = 0; var6 < var38; ++var6) {
                    var1.a.readShort();
                }

                this.Q.clear();
                var38 = var1.a.readShort();
                Short var39 = null;
                int var37 = 0;
                Vector var40 = new Vector();
                int var27 = 0;
                VDTT_iz var31 = null;

                int var9;
                VDTT_iz var41;
                for (var9 = 0; var9 < var38; ++var9) {
                    if (var37 == 0) {
                        var39 = (short) var1.a.readShort();
                        var37 = var1.a.readShort();
                    }
                    var41 = new VDTT_iz(var39);
                    var41.objX = var41.m = var1.a.readShort();
                    var41.objY = var41.n = var1.a.readShort();
                    var41.k = var1.a.readByte();
                    if (var41.m().e >= 0 && var41.m().d >= 6 && var41.m().d != 11) {
                        var40.add(var41);
                        if (var41.m().d == 9 || var41.m().d == 10) {
                            var31 = var41;
                            ++var27;
                        }
                    } else {
                        this.Q.addElement(var41);
                    }

                    if (var37 > 0) {
                        --var37;
                    }
                }

                this.bG = true;
                dL = VDTT_dc.f;
                VDTT_dc.f = new Hashtable();

                for (var9 = 0; var9 < this.ap.size(); ++var9) {
                    ((VDTT_gk) this.ap.get(var9)).m();
                }

                for (var9 = 0; var9 < this.aq.size(); ++var9) {
                    ((VDTT_gx) this.aq.get(var9)).n();
                }

                this.ek.clear();
                this.el.clear();
                short var42;
                label852:
                switch (this.C().c) {
                    case 1:
                        var5 = 0;

                        while (true) {
                            if (var5 >= 30) {
                                break label852;
                            }

                            var42 = 577;
                            if (var5 % 4 == 0) {
                                var42 = 578;
                            } else if (var5 % 5 == 0) {
                                var42 = 579;
                            }

                            this.el.add(new VDTT_dx(var42, 5, 5, 5, var5, 30, this.aj, this.ak, false));
                            ++var5;
                        }
                    case 2:
                        var5 = 0;

                        while (true) {
                            if (var5 >= 25) {
                                break label852;
                            }

                            var42 = 580;
                            if (var5 % 4 == 0) {
                                var42 = 581;
                            } else if (var5 % 5 == 0) {
                                var42 = 582;
                            }

                            this.el.add(new VDTT_dx(var42, 4, 4, 5, var5, 25, this.aj, this.ak, false));
                            ++var5;
                        }
                    case 3:
                        var5 = 0;

                        while (true) {
                            if (var5 >= 200) {
                                break label852;
                            }

                            byte var43 = 28;
                            if (var5 % 2 == 0) {
                                var43 = 29;
                            } else if (var5 % 3 == 0) {
                                var43 = 30;
                            }

                            this.el.add(new VDTT_dx(var43, 2, 2, 8, var5, 200, this.aj, this.ak, false));
                            ++var5;
                        }
                    case 4:
                        var42 = 0;
                        var5 = 0;

                        while (true) {
                            if (var5 >= 60) {
                                break label852;
                            }

                            if (var5 % 2 == 0) {
                                var42 = 191;
                            } else if (var5 % 3 == 0) {
                                var42 = 192;
                            }

                            this.el.add(new VDTT_dx(var42, 4, 1, 8, var5, 60, this.aj, this.ak, false));
                            ++var5;
                        }
                    case 5:
                        var5 = 0;

                        while (true) {
                            if (var5 >= 150) {
                                break label852;
                            }

                            if (var5 % 8 == 0) {
                                var3 = VDTT_jb.b() ? 12 : 14;
                                this.el.add(new VDTT_dx(var3, 0, 3, 11, var5, 150, this.aj, this.ak, false));
                            } else {
                                var3 = VDTT_jb.b() ? 11 : 13;
                                this.el.add(new VDTT_dx(var3, 0, 3, 11, var5, 150, this.aj, this.ak, false));
                            }

                            ++var5;
                        }
                    case 6:
                        var5 = 0;

                        while (true) {
                            if (var5 >= 100) {
                                break label852;
                            }

                            if (var5 % 8 == 0) {
                                this.el.add(new VDTT_dx(14, 0, 3, 11, var5, 100, this.aj, this.ak, false));
                            } else {
                                this.el.add(new VDTT_dx(13, 0, 3, 11, var5, 100, this.aj, this.ak, false));
                            }

                            ++var5;
                        }
                    case 7:
                        for (var5 = 0; var5 < 80; ++var5) {
                            if (var5 % 8 == 0) {
                                this.el.add(new VDTT_dx(12, 0, 3, 11, var5, 80, this.aj, this.ak, false));
                            } else {
                                this.el.add(new VDTT_dx(11, 0, 3, 11, var5, 80, this.aj, this.ak, false));
                            }
                        }
                    case 8:
                    default:
                        break;
                    case 9:
                        for (var5 = 0; var5 < 100; ++var5) {
                            var42 = 443;
                            if (var5 % 2 == 0) {
                                var42 = 444;
                            } else if (var5 % 3 == 0) {
                                var42 = 445;
                            }

                            this.el.add(new VDTT_dx(var42, VDTT_jb.a(1, 3), 0, 9, var5, 100, this.aj, this.ak, false));
                        }
                }

                if (var40.size() > 0) {
                    if (var31 != null) {
                        var41 = new VDTT_iz(var31.l);
                        var41.objX = var41.m = (short) (var31.objX + var31.m().a);
                        var41.objY = var41.n = var31.objY;
                        var41.k = var31.k;
                        var40.add(var41);
                        (var41 = new VDTT_iz(var31.l)).objX = var41.m = (short) (var31.objX + var31.m().a * 2);
                        var41.objY = var41.n = var31.objY;
                        var41.k = var31.k;
                        var40.add(var41);
                        (var41 = new VDTT_iz(var31.l)).objX = var41.m = (short) (var31.objX + var31.m().a * 3);
                        var41.objY = var41.n = var31.objY;
                        var41.k = var31.k;
                        var40.add(var41);
                    }

                    Collections.sort(var40, XYEntity.F);

                    for (var9 = 0; var9 < var40.size(); ++var9) {
                        if (((VDTT_iz) var40.get(var9)).m().d == 10) {
                            this.ek.add(new VDTT_dx(DataCenter.d().E[((VDTT_iz) var40.get(var9)).m().e].b[0].a, 1, 0, 4, var9, var27 + 3, this.aj, ((VDTT_iz) var40.get(var9)).objY, true, ((VDTT_iz) var40.get(var9)).m().a, ((VDTT_iz) var40.get(var9)).m().b));
                        } else if (((VDTT_iz) var40.get(var9)).m().d == 9) {
                            this.ek.add(new VDTT_dx(DataCenter.d().E[((VDTT_iz) var40.get(var9)).m().e].b[0].a, 1, 0, 3, var9, var27 + 3, this.aj, ((VDTT_iz) var40.get(var9)).objY, true, ((VDTT_iz) var40.get(var9)).m().a, ((VDTT_iz) var40.get(var9)).m().b));
                        } else if (((VDTT_iz) var40.get(var9)).m().d == 8) {
                            this.ek.add(new VDTT_dx(DataCenter.d().E[((VDTT_iz) var40.get(var9)).m().e].b[0].a, 3, 0, 2, var9, 0, this.aj, ((VDTT_iz) var40.get(var9)).objY, true));
                        } else if (((VDTT_iz) var40.get(var9)).m().d == 7) {
                            this.ek.add(new VDTT_dx(DataCenter.d().E[((VDTT_iz) var40.get(var9)).m().e].b[0].a, 3, 0, 0, var9, 0, this.aj, ((VDTT_iz) var40.get(var9)).objY, true));
                        } else if (((VDTT_iz) var40.get(var9)).m().d == 6) {
                            this.ek.add(new VDTT_dx(DataCenter.d().E[((VDTT_iz) var40.get(var9)).m().e].b[0].a, 3, 0, 1, var9, 0, this.aj, ((VDTT_iz) var40.get(var9)).objY, true));
                        }
                    }
                }

                if (this.ai == 67) {
                    for (var9 = 0; var9 < 25; ++var9) {
                        this.ek.add(new VDTT_dx(4, 2, 0, 12, var9, 25, this.aj, this.ak + 30, false, (short) 112, (short) 10));
                    }
                }

                this.er = false;
                this.em.clear();
                this.cN = 0;
                this.z();
                this.cb = false;
                if (this.aB == null) {
                    this.aB = new VDTT_ll(this);
                }

                this.aB.N = true;
                m = false;
                this.cq = 1;
                this.dG = null;
                this.o.b();
                VDTT_ac var10000 = VDTT_ac.b();
                boolean var28 = false;
                var10000.f = var28;
                if (v().C().d != 19) {
                    this.aw.clear();
                }

                return;
            }
        } catch (Exception var24) {
            try {
                Message.e((byte) 4).l();
            } catch (Exception var21) {
            }

            return;
        } finally {
            try {
                if (var1 != null) {
                    var1.d();
                }
            } catch (Exception var20) {
            }

        }

    }

    public final void y() {
        if (this.aB != null) {
            this.aB.w();
        }

    }

    public final void z() {
        try {
            this.az.a.removeAllElements();
            this.dt.a.removeAllElements();
            this.du.a.removeAllElements();
            this.aA.a.removeAllElements();
            this.dv.a.removeAllElements();
            this.cU.removeAllElements();
            super.f.removeAllElements();
            this.e();
            int var1 = 0;
            if (this.aS != null) {
                var1 = this.aS.l.j;
            }

            byte var2 = 30;
            if (DataCenter.d().o <= 300) {
                var2 = 40;
            }

            this.aS = new VDTT_bw(VDTT_d.g().l(), DataCenter.d().o / 2 - var2, 110, 70, this);
            this.aS.a(var1);
            this.aT = new VDTT_bx(VDTT_d.g().l(), this.aS.objY, 110, 70, this);
            this.aA.d = null;
            this.az.d = null;
            if (!DataCenter.l()) {
                this.az.b((VDTT_m) (this.dB = this.a(this.aS.objX, this.aS.objY - 14, "", this, 1101, 715)));
            } else {
                this.az.b((VDTT_m) (this.dB = this.a(this.aS.objX + 1, this.aS.objY - 18, "", this, 1101, 715)));
                this.dB.d(30, 18);
            }

            this.dB.b(DataCenter.o());
            this.az.b((VDTT_m) (this.dC = this.a(this.aS.objX + 16, this.aS.objY - 14, Caption.L, this, 1102, 684)));
            this.az.b((VDTT_m) (this.dx = this.a(this.aS.objX + 54, this.aS.objY - 14, Caption.Aj[9], this, 3010, 684)));
            if (this.cH != 0 && this.cH != 1) {
                if (this.cH == 2) {
                    this.a((VDTT_m) this.aT);
                    this.az.b((VDTT_m) this.aT);
                }
            } else {
                this.a((VDTT_m) this.aS);
                this.az.b((VDTT_m) this.aS);
            }

            this.c(this.az.a());
            this.e(VDTT_eq.a().a(17));
            this.ah();
            this.aP = this.a(-200, -200, 140, "", this, 1083, 0);
            var2 = 80;
            this.aP.l = var2;
            this.aP.b(true);
            this.aP.U = this.aP.V = true;
            this.eb = this.a(0, 0, "", this, 7000, -16);
            if (DataCenter.l()) {
                this.eb.d = true;
            }

            this.aE[0] = this.a(0, 0, Caption.Ay[0], this, 7001, 722);
            this.aE[1] = this.a(0, 0, Caption.Ay[1], this, 7002, 723);
            this.aE[2] = this.a(0, 0, Caption.Ay[2], this, 7003, 724);
            this.aE[3] = this.a(0, 0, Caption.Ay[3], this, 7005, 725);
            this.ea = this.a(0, this.r - 186, "", this, 1040, 712);
            short var8 = -270;
            this.ea.K = var8;
            this.dZ[0] = this.a(18, this.r - 186, "", this, 1049, 373);
            this.dZ[1] = this.a(70, this.r - 186, "", this, 1050, 374);
            this.dZ[2] = this.a(82, this.r - 186 + 84, "", this, 1043, 38);
            this.dZ[3] = this.a(101, this.r - 186 + 84, "", this, 1042, 33);
            this.A();
            this.aQ = a(2, this.r - 184 + 80, 4, this, 1047);
            this.t(0);
            this.t(VDTT_eq.a().b(4));
            if (VDTT_eq.a().a(6)) {
                this.bF = true;
            } else {
                this.bF = false;
            }

            if (!DataCenter.l()) {
                this.cP = this.a(DataCenter.d().n - (VDTT_d.g().m > 0 ? VDTT_jb.n(83) : VDTT_jb.n(15)), 1, "", this, 1100, 715);
                this.cP.d(VDTT_jb.n(14), VDTT_jb.n(14));
                var2 = 90;
                this.cP.K = var2;
                this.aA.b((VDTT_m) this.cP);
                int[] var9 = new int[]{1067, 1037, 1033, 1032, 1063, 6009, 1060, 1035, 1036, 1069};
                int[] var3 = new int[]{740, 672, 688, 689, 690, 741, 94, 674, 673, 677};
                if (DataCenter.q()) {
                    var9 = new int[]{1063, 1035};
                    var3 = new int[]{690, 674};
                }

                int var4;
                VDTT_ba var7;
                for (var4 = 0; var4 < var9.length; ++var4) {
                    var7 = this.a(0, 0, "", this, var9[var4], var3[var4]);
                    if (var9[var4] == 6009) {
                        this.dz = var7;
                    } else if (var9[var4] == 1037) {
                        this.dA = var7;
                    } else if (var9[var4] == 1060) {
                        this.aN = var7;
                    }

                    this.cU.addElement(var7);
                }

                var4 = VDTT_jb.n(24);
                int var11 = DataCenter.q() ? 1 : 5;
                int var10 = DataCenter.d().n - VDTT_jb.n(var11 * 25 + VDTT_d.g().m());

                for (int var5 = 0; var5 < v().cU.size(); ++var5) {
                    var7 = (VDTT_ba) v().cU.get(var5);
                    if (var5 >= var11) {
                        var7.f(var10 + (var5 - var11) * VDTT_jb.n(24), var4 + VDTT_jb.n(24));
                    } else {
                        var7.f(var10 + var5 * VDTT_jb.n(24), var4);
                    }

                    this.aA.b((VDTT_m) var7);
                }

                this.aA.b();
                this.c(this.aA.a());
                this.d(VDTT_eq.a().a(18));
            }

        } catch (Exception var6) {
            VDTT_jb.a(var6);
        }
    }

    private void ah() {
        for (int var1 = 0; var1 < this.dt.a.size(); ++var1) {
            this.b((VDTT_m) ((VDTT_m) this.dt.a.elementAt(var1)));
        }

        this.dt.a.removeAllElements();
        int var10002;
        short var10003;
        if (VDTT_eq.a().d()) {
            var10002 = VDTT_jb.n(DataCenter.l() ? 35 : 50 + VDTT_d.g().l() / 2);
            var10003 = this.r;
            MenuConfig.K();
            this.aD = this.a(var10002, var10003 - VDTT_jb.n(85 + MenuConfig.C()), "", this, 1011, 20, 19);
        } else {
            var10002 = VDTT_jb.n(35 + VDTT_d.g().l() / 2);
            var10003 = this.r;
            MenuConfig.K();
            this.aD = this.a(var10002, var10003 - VDTT_jb.n(85 + MenuConfig.C()), "", this, 1011, 20, 19);
        }

        DataCenter.o();
        this.aD.j();
        this.dt.b((VDTT_m) this.aD);
        this.c(this.dt.a());
    }

    private void d(boolean var1) {
        VDTT_eq.a().a(18, var1);
        this.aA.a(!VDTT_eq.a().a(18));
        VDTT_ba var10000;
        if (var1) {
            this.aA.f();
            var10000 = (VDTT_ba) this.aA.a();
            byte var3 = 90;
            var10000.K = var3;
        } else {
            this.aA.e();
            var10000 = (VDTT_ba) this.aA.a();
            short var2 = 270;
            var10000.K = var2;
        }
    }

    private void e(boolean var1) {
        DataCenter.o();
        VDTT_eq.a().a(17, var1);
        this.az.a(!VDTT_eq.a().a(17));
        VDTT_ba var10000;
        if (var1) {
            this.az.f();
            var10000 = (VDTT_ba) this.az.a();
            byte var3 = 0;
            var10000.K = var3;
        } else {
            this.az.e();
            var10000 = (VDTT_ba) this.az.a();
            short var2 = 180;
            var10000.K = var2;
        }
    }

    private void f(boolean var1) {
        this.ay.a(var1);

        for (int var2 = 0; var2 < this.aE.length; ++var2) {
            this.aE[var2].b(!var1);
        }

        if (VDTT_ek.m().bh == null || VDTT_ek.m().bh.d == 0) {
            this.aE[3].b(true);
        }

    }

    private void t(int var1) {
        this.aC = 2;
        this.aA.a.clear();
        this.ay.a.clear();
        this.dv.a.clear();
        this.b((VDTT_m) this.ea);
        this.I();

        for (var1 = 0; var1 < this.dZ.length; ++var1) {
            this.b((VDTT_m) this.dZ[var1]);
        }

        this.b((VDTT_m) this.aQ);
        this.eb.f(VDTT_jb.n(101 + VDTT_d.g().m / 2), 0);
        this.aE[0].f(this.eb.objX + VDTT_jb.n(9), VDTT_jb.n(22));
        this.aE[1].f(this.eb.objX + VDTT_jb.n(9), VDTT_jb.n(38));
        this.aE[2].f(this.eb.objX + VDTT_jb.n(9), VDTT_jb.n(54));
        this.aE[3].f(this.eb.objX + VDTT_jb.n(9), VDTT_jb.n(70));
        this.ay.b((VDTT_m) this.eb);
        this.ay.b((VDTT_m) this.aE[0]);
        this.ay.b((VDTT_m) this.aE[1]);
        this.ay.b((VDTT_m) this.aE[2]);
        this.ay.b((VDTT_m) this.aE[3]);
        this.f(false);
        this.ea.f(this.q - 16, 0);
        short var3 = this.ea.objX;
        short var2 = this.ea.objY;
        this.dZ[0].f(var3 - 70, var2);
        this.dZ[1].f(var3 - 18, var2);
        this.dZ[2].f(var3 + 82 - 106, var2 + 84);
        this.dZ[3].f(var3 + 101, var2 + 84);
        this.aP.f(var3 + 20, var2 + 82 - 1);
        this.aQ.f(var3 + 2, var2 + 80);
        this.ea.b(true);
        this.dZ[1].b(true);
        this.dZ[0].b(true);
        this.aC = 2;
        String var4 = v().C().b;
        String var5 = "";
        if (!var4.trim().equals("") && !(var5 = VDTT_dg.b(VDTT_dg.b, var4, 43)[0].toString()).equals(var4)) {
            var5 = var5 + " ...";
        }

        this.dZ[0].l = var5;
    }

    public final void A() {
        try {
            if (this.aR == null) {
                this.aR = new VDTT_bc(VDTT_jb.n(84 + VDTT_d.g().m / 2), DataCenter.d().o - 18, DataCenter.d().n - VDTT_jb.n(168 + VDTT_d.g().m), VDTT_jb.n(16), this, (byte) 0, 1048, 12);
            }

            if (this.du != null) {
                int var1;
                for (var1 = 0; var1 < this.du.a.size(); ++var1) {
                    this.b((VDTT_m) ((VDTT_m) this.du.a.get(var1)));
                }

                this.du.a.clear();
                this.cU.clear();
                this.ah();
                VDTT_bm var10000;
                int var10003;
                int var10004;
                if (!DataCenter.l()) {
                    if (DataCenter.d().r >= 2) {
                        var10000 = this.du;
                        var10003 = 7 + VDTT_d.g().l() / 2;
                        var10004 = DataCenter.d().o;
                        MenuConfig.K();
                        var10000.b((VDTT_m) (this.cR = this.a(var10003, var10004 - VDTT_jb.n(24 + MenuConfig.C() + 25), "", this, 7006, 256)));
                        var10000 = this.du;
                        var10003 = 7 + VDTT_d.g().l() / 2;
                        var10004 = DataCenter.d().o;
                        MenuConfig.K();
                        var10000.b((VDTT_m) (this.cS = this.a(var10003, var10004 - VDTT_jb.n(24 + MenuConfig.C() + 50), "", this, 7007, 256)));
                    } else {
                        var10000 = this.du;
                        var10003 = 7 + VDTT_d.g().l() / 2;
                        var10004 = DataCenter.d().o;
                        MenuConfig.K();
                        var10000.b((VDTT_m) (this.cS = this.a(var10003, var10004 - VDTT_jb.n(24 + MenuConfig.C() + 25), "", this, 7007, 256)));
                    }
                }

                if (this.V()) {
                    this.cQ = this.a(108, 20, "", this, 1103, 566);
                    this.cQ.b(true);
                    this.du.b((VDTT_m) this.cQ);
                }

                this.cT = null;
                if (v().ai == 83 && Gdx.app.getType() == ApplicationType.Desktop) {
                    this.cT = this.a(108, 20, "", this, 1104, 89);
                    this.cT.b(true);
                    this.du.b((VDTT_m) this.cT);
                }

                Vector var2 = new Vector();
                Vector var3 = new Vector();
                short[] var12 = this.B();
                this.db = var12;
                var1 = -1;

                int var4;
                for (var4 = 0; var4 < this.db.length; ++var4) {
                    if (this.db[var4] >= 0) {
                        short var10001 = this.db[var4];
                        if (DataCenter.d().Q[var10001].i == 1) {
                            var1 = var4;
                            break;
                        }
                    }
                }

                this.bl.clear();
                this.dI = null;

                for (var4 = 0; var4 < v().ae.length; ++var4) {
                    if (v().ae[var4].e > 0 && v().ae[var4].d()) {
                        if (v().ae[var4].l()) {
                            this.dI = v().ae[var4];
                        } else {
                            v().bl.addElement(v().ae[var4]);
                            if (var1 != -1 && v().ae[var4].b().i == 1) {
                                this.a(var1, v().ae[var4].d);
                            }
                        }
                    }
                }

                Collections.sort(v().bl, VDTT_ic.a);
                Vector var15 = new Vector();
                var1 = 0;
                int var5 = 0;

                while (true) {
                    int var7;
                    if (var5 >= v().db.length) {
                        int var16;
                        if (var1 >= this.bl.size()) {
                            Arrays.fill(this.db, (short) -1);

                            for (var5 = 0; var5 < this.bl.size(); ++var5) {
                                this.a(var5, ((VDTT_ic) this.bl.get(var5)).d);
                            }
                        } else {
                            for (var5 = 0; var5 < this.bl.size() && var15.size() < 7; ++var5) {
                                if (!var15.contains(((VDTT_ic) this.bl.get(var5)).d)) {
                                    for (var16 = 0; var16 < v().db.length; ++var16) {
                                        if (v().db[var16] == -1) {
                                            this.a(var16, ((VDTT_ic) this.bl.get(var5)).d);
                                            var15.add(((VDTT_ic) this.bl.get(var5)).d);
                                            break;
                                        }
                                    }
                                }
                            }
                        }

                        VDTT_da.a("arr_skill_" + VDTT_ek.m().b, this.db);

                        VDTT_ba var14;
                        for (var5 = 0; var5 < this.db.length; ++var5) {
                            if (this.db[var5] != -1) {
                                for (var16 = 0; var16 < this.bl.size(); ++var16) {
                                    VDTT_ic var18;
                                    if ((var18 = (VDTT_ic) this.bl.get(var16)).d == this.db[var5] && !var18.l()) {
                                        (var14 = this.a(0, 0, "", this, 1021 + var5, 81)).a(var18.a(VDTT_ek.m()));
                                        var3.add(var14);
                                        if (var18.d == 30) {
                                            var14.a(100);
                                        }

                                        var2.addElement(var14);
                                        break;
                                    }
                                }
                            }
                        }

                        this.du.a(var3);
                        var10000 = this.du;
                        var10003 = VDTT_jb.n(4 + VDTT_d.g().m / 2);
                        var10004 = DataCenter.d().o;
                        MenuConfig.K();
                        var10000.b((VDTT_m) (this.aL = this.a(var10003, var10004 - VDTT_jb.n(16 + MenuConfig.C()), Caption.sD, this, 1012, 82)));
                        this.aL.b(DataCenter.l());
                        if (DataCenter.l()) {
                            var10000 = this.du;
                            var10003 = VDTT_jb.n(4 + VDTT_d.g().m / 2);
                            var10004 = DataCenter.d().o;
                            MenuConfig.K();
                            var10000.b((VDTT_m) (this.aM = this.a(var10003, var10004 - VDTT_jb.n(16 + MenuConfig.C()), "MENU", this, 1013, -107)));
                            this.aM.b(DataCenter.o());
                        }

                        this.du.b((VDTT_m) (this.aG = this.a(this.aL.objX + VDTT_jb.n(40), this.aL.objY, Caption.xG, this, 1086, 82)));
                        this.aG.b(DataCenter.l());
                        var10000 = this.du;
                        var10003 = this.aL.objX + VDTT_jb.n(80);
                        short var21 = this.aL.objY;
                        DataCenter.d();
                        var10000.b((VDTT_m) (this.dy = this.a(var10003, var21, "Chat", this, 1083, DataCenter.n() ? -107 : 73)));
                        var10000 = this.du;
                        var10003 = DataCenter.d().n - VDTT_jb.n(40 + VDTT_d.g().m / 2);
                        var21 = this.aL.objY;
                        String var10005 = Caption.xH;
                        DataCenter.d();
                        var10000.b((VDTT_m) (this.aK = this.a(var10003, var21, var10005, this, 1082, DataCenter.n() ? -107 : 82)));
                        var10000 = this.du;
                        var10003 = this.aK.objX - VDTT_jb.n(40);
                        var21 = this.aL.objY;
                        DataCenter.d();
                        var10000.b((VDTT_m) (this.aF = this.a(var10003, var21, "Auto", this, 1085, DataCenter.n() ? -107 : -15)));
                        this.aF.b(DataCenter.o());
                        VDTT_jb.n(96 + VDTT_d.g().m / 2);
                        var16 = this.aL.objY - VDTT_jb.n(32);
                        DataCenter.o();
                        var7 = var2.size();
                        int var13;
                        switch (VDTT_eq.a().b(27)) {
                            case 1:
                                var1 = this.aD.h() + VDTT_jb.n(16);
                                break;
                            case 2:
                                var1 = DataCenter.d().n - VDTT_jb.n(96 + VDTT_d.g().m / 2) - VDTT_jb.n(32) - (var7 - 1) * VDTT_jb.n(32);
                                break;
                            default:
                                if ((var1 = DataCenter.d().n / 2 - var7 * VDTT_jb.n(16) - VDTT_jb.n(12)) < this.aD.h()) {
                                    int var20 = this.aD.h();
                                    VDTT_d var17 = VDTT_d.g();
                                    var1 = var20 + VDTT_jb.n(VDTT_l.b() ? 20 : 36);
                                }

                                var5 = DataCenter.d().n - VDTT_jb.n(96 + VDTT_d.g().m / 2) - VDTT_jb.n(32);
                                if ((var13 = var1 + (var7 - 1) * VDTT_jb.n(32) - var5) > 0) {
                                    var1 -= var13;
                                }
                        }

                        var13 = 0;
                        this.eA = new int[][]{{this.q - VDTT_jb.n(34 + VDTT_d.g().m()), this.aL.objY - VDTT_jb.n(93)}, {this.q - VDTT_jb.n(65 + VDTT_d.g().m()), this.aL.objY - VDTT_jb.n(86)}, {this.q - VDTT_jb.n(87 + VDTT_d.g().m()), this.aL.objY - VDTT_jb.n(62)}, {this.q - VDTT_jb.n(87 + VDTT_d.g().m() + 32), this.aL.objY - VDTT_jb.n(62)}, {this.q - VDTT_jb.n(100 + VDTT_d.g().m()), this.aL.objY - VDTT_jb.n(93)}, {this.q - VDTT_jb.n(71 + VDTT_d.g().m()), this.aL.objY - VDTT_jb.n(117)}, {this.q - VDTT_jb.n(37 + VDTT_d.g().m()), this.aL.objY - VDTT_jb.n(123)}};
                        DataCenter.o();
                        DataCenter.o();

                        for (var4 = 0; var4 < var7; ++var4) {
                            if (((VDTT_ba) var2.get(var4)).I == 100) {
                                ((VDTT_ba) var2.get(var4)).f(DataCenter.d().n - VDTT_jb.n(58 + VDTT_d.g().m / 2), this.aL.objY - VDTT_jb.n(56) + 0);
                                DataCenter.o();
                            } else {
                                if (VDTT_eq.a().d()) {
                                    ((VDTT_ba) var2.get(var4)).f(this.eA[var13][0], this.eA[var13][1] + 0);
                                } else {
                                    var5 = var1 + (var7 - 1 - var13) * VDTT_jb.n(32);
                                    ((VDTT_ba) var2.get(var4)).f(var5, var16);
                                }

                                ++var13;
                            }
                        }

                        this.aO = null;
                        if (VDTT_eq.a().d()) {
                            if (!DataCenter.l() && var7 < 6) {
                                var13 = 7 - var7;

                                for (var4 = 0; var4 < var13; ++var4) {
                                    int var19 = this.eA[var7 - 1 + var4][0];
                                    int var10002 = this.eA[var7 - 1 + var4][1] + 0;
                                    DataCenter.o();
                                    var14 = this.a(var19, var10002, "", this, -9991, 81);
                                    this.du.b((VDTT_m) var14);
                                }
                            }

                            if (this.dI != null) {
                                this.aO = this.a(this.eA[6][0], this.eA[6][1], "", this, 1028, 81);
                                this.aO.a(this.dI.a(VDTT_ek.m()));
                                this.du.b((VDTT_m) this.aO);
                            }
                        } else if (this.dI != null) {
                            this.aO = this.a(this.q - VDTT_jb.n(34 + VDTT_d.g().m()), this.aL.objY - VDTT_jb.n(125), "", this, 1027, 81);
                            this.aO.a(this.dI.a(VDTT_ek.m()));
                            this.du.b((VDTT_m) this.aO);
                        }

                        var5 = DataCenter.d().n - VDTT_jb.n(96 + VDTT_d.g().m / 2) - VDTT_jb.n(32);
                        this.aI = this.a(var5 + VDTT_jb.n(32), var16, "", this, 1080, -13);
                        this.du.b((VDTT_m) this.aI);
                        if (VDTT_eq.a().d()) {
                            this.aH = this.a(this.aI.objX - VDTT_jb.n(32), this.aI.objY, "", this, 1084, 557);
                        } else {
                            this.aH = this.a(this.q - VDTT_jb.n(34 + VDTT_d.g().m()), this.aL.objY - VDTT_jb.n(93), "", this, 1084, 557);
                        }

                        this.du.b((VDTT_m) this.aH);
                        this.du.b = var2;
                        this.du.b((VDTT_m) this.aR);
                        break;
                    }

                    if (v().db[var5] != -1) {
                        boolean var6 = false;

                        for (var7 = 0; var7 < this.bl.size(); ++var7) {
                            if (((VDTT_ic) this.bl.get(var7)).d == this.db[var5]) {
                                var6 = true;
                                break;
                            }
                        }

                        if (!var6) {
                            v().db[var5] = -1;
                        }
                    }

                    if (v().db[var5] != -1) {
                        var15.add(v().db[var5]);
                        var1 = var5;
                    }

                    ++var5;
                }
            }

            this.a(VDTT_da.f("shortcutItem"), false);
            return;
        } catch (Exception var10) {
        } finally {
            this.b((VDTT_m) this.aR);
            this.a((VDTT_m) this.aR);
        }

    }

    public final VDTT_ic g(int var1) {
        for (int var3 = 0; var3 < this.ae.length; ++var3) {
            VDTT_ic var2;
            if ((var2 = this.ae[var3]).b().a == var1) {
                return var2;
            }
        }

        return null;
    }

    public final short[] B() {
        try {
            if (this.db == null) {
                short[] var1 = new short[7];
                this.db = var1;

                for (int var5 = 0; var5 < this.db.length; ++var5) {
                    this.db[var5] = -1;
                }

                VDTT_de var6;
                if ((var6 = VDTT_da.a("arr_skill_" + VDTT_ek.m().b)) != null) {
                    for (int var2 = 0; var2 < this.db.length; ++var2) {
                        this.db[var2] = var6.a.readShort();
                    }
                }
            }
        } catch (Exception var4) {
        }

        return this.db;
    }

    private void a(int var1, short var2) {
        short[] var4 = this.B();
        this.db = var4;

        for (int var3 = 0; var3 < this.db.length; ++var3) {
            if (this.db[var3] == var2) {
                return;
            }
        }

        this.db[var1] = var2;
    }

    public final VDTT_ge C() {
        return DataCenter.d().H[this.ai];
    }

    public final boolean D() {
        if (!d && this.aB == null) {
            if (this.bE) {
                this.bE = false;
                this.e(this.C().b + "\n" + Caption.hF + this.al, -2560);
            }

            return true;
        } else {
            return false;
        }
    }

    public final void a(boolean var1) {
        this.er = true;
        this.es = System.currentTimeMillis();
        this.cN = 35;
        int var4 = this.aj / 20;
        int[] var2 = new int[]{573, 574, 49};

        for (int var3 = 0; var3 < var4; ++var3) {
            this.em.add(new VDTT_dx(VDTT_jb.a(var2), 4, VDTT_jb.a(1, 4), 10, var3, var4, this.aj, this.ak, false));
        }

        VDTT_ac var5;
        if (!(var5 = VDTT_ac.b()).a) {
            var5.a(63);
        }

    }

    public final void j() {
        try {
            if (VDTT_ek.m().aY == null) {
                Object var1 = VDTT_ek.m();
                if (this.ew != null) {
                    var1 = this.ew;
                }

                int var3;
                if (VDTT_ek.m().bD) {
                    for (var3 = 0; var3 < this.cK.size(); ++var3) {
                        VDTT_hg var2;
                        if ((var2 = (VDTT_hg) this.cK.elementAt(var3)).l.p()) {
                            var1 = var2;
                            break;
                        }
                    }
                }

                int var8 = DataCenter.d().n;
                var3 = DataCenter.d().o;
                if (VDTT_eq.a().b()) {
                    var8 = var8 * DataCenter.d().r / (DataCenter.d().r - 1);
                    var3 = var3 * DataCenter.d().r / (DataCenter.d().r - 1);
                }

                int var4 = ((VDTT_n) var1).objX - var8 / 2;
                int var5 = ((VDTT_n) var1).objY - var3 / 2 - ((VDTT_n) var1).r / 2 - var3 / 8;
                int var6 = ((VDTT_n) var1).objX + var8 / 2;
                int var9 = ((VDTT_n) var1).objY + var3 / 2 - ((VDTT_n) var1).r / 2 - var3 / 8;
                if (this.cN > 0 || this.er) {
                    if (!this.er) {
                        --this.cN;
                    }

                    var4 -= VDTT_jb.a(this.cN);
                    var5 -= VDTT_jb.a(this.cN);
                    var6 += VDTT_jb.a(this.cN);
                    var9 += VDTT_jb.a(this.cN);
                }

                if (var4 < 0) {
                    var4 = 0;
                    var6 = var8;
                }

                if (var5 < 0) {
                    var5 = 0;
                    var9 = var3;
                }

                if (var6 > this.aj) {
                    var4 = (short) (this.aj - var8);
                }

                if (var9 > this.ak) {
                    var5 = (short) (this.ak - var3);
                }

                DataCenter var10000;
                if (DataCenter.d().i != var4) {
                    this.ec = var4 - DataCenter.d().i << 2;
                    this.ed += this.ec;
                    var10000 = DataCenter.d();
                    var10000.i += this.ed >> 4;
                    this.ed &= 15;
                }

                if (DataCenter.d().j != var5) {
                    this.ee = var5 - DataCenter.d().j << 2;
                    this.ef += this.ee;
                    var10000 = DataCenter.d();
                    var10000.j += this.ef >> 4;
                    this.ef &= 15;
                }

                DataCenter.d().k = DataCenter.d().i + var8;
                DataCenter.d().l = DataCenter.d().j + var3;

                for (var8 = 0; var8 < this.Q.size(); ++var8) {
                    VDTT_iz var11;
                    short var10 = (var11 = (VDTT_iz) this.Q.get(var8)).m;
                    if (var11.m().c == 7 || var11.m().c == 6 && var11.m().d == -1) {
                        var10 = (short) (var11.m + DataCenter.d().i * 20 / 23);
                    } else if (var11.m().c == 8) {
                        var10 = (short) (var11.m + DataCenter.d().i * 10 / 13);
                    } else if (var11.m().c == 9) {
                        var10 = (short) (var11.m + DataCenter.d().i * 20 / 22);
                    } else if (var11.m().c == 10) {
                        var10 = (short) (var11.m + DataCenter.d().i * 10 / 12);
                    }

                    if (var11.o != null) {
                        if (var11.m().d == 2) {
                            var10 = (short) (var11.m + DataCenter.d().i * 20 / 23);
                        } else if (var11.m().d == 3) {
                            var10 = (short) (var11.m + DataCenter.d().i * 10 / 13);
                        } else if (var11.m().d == 4) {
                            var10 = (short) (var11.m + DataCenter.d().i * 20 / 22);
                        } else if (var11.m().d == 5 || var11.m().d == 11) {
                            var10 = (short) (var11.m + DataCenter.d().i * 10 / 12);
                        }

                        var11.o.a(var10, var11.objY);
                    }

                    if (var11.p != null) {
                        if (var11.m().d == 2) {
                            var10 = (short) (var11.m + DataCenter.d().i * 20 / 23);
                            var11.p.b(var10, var11.objY);
                        } else if (var11.m().d == 3) {
                            var10 = (short) (var11.m + DataCenter.d().i * 10 / 13);
                            var11.p.b(var10, var11.objY);
                        } else if (var11.m().d == 4) {
                            var10 = (short) (var11.m + DataCenter.d().i * 20 / 22);
                            var11.p.b(var10, var11.objY);
                        } else if (var11.m().d == 5) {
                            var10 = (short) (var11.m + DataCenter.d().i * 10 / 12);
                            var11.p.b(var10, var11.objY);
                        }

                        var11.p.r();
                        var11.q = var11.p.q;
                        var11.r = var11.p.r;
                        var11.f(var11.p.objX, var11.p.objY);
                    }

                    var11.objX = var10;
                }

            }
        } catch (Exception var7) {
        }
    }

    public final void k() {
        if (Gdx.app.getType() == ApplicationType.Desktop && !this.aP.d && this.aP.objX != -200 && this.aP.objY != -200) {
            this.aP.f(-200, -200);
            this.aP.b(true);
        } else {
            this.E();
        }
    }

    public final void E() {
        this.a(Caption.so, 20000, this);
    }

    public static void F() {
        VDTT_df var0 = null;
        boolean var5 = false;

        label60:
        {
            try {
                var5 = true;
                Message.c((byte) -7).l();
                var0 = new VDTT_df();
                String[] var1 = VDTT_cq.y().x();
                var0.a(VDTT_jb.d(var1[0]));
                var0.a(VDTT_jb.d(var1[1]));
                var0.a(VDTT_jb.d(VDTT_ek.m().aD));
                var0.a(DataCenter.d().a);
                var0.b(DataCenter.d().b);
                var0.c(MenuConfig.d);
                var0.c(MenuConfig.N);
                var0.c(MenuConfig.O);
                var0.b(0);
                byte[] var2 = var0.a.toByteArray();
                VDTT_da.a("arr_reset", var2);
                VDTT_da.a("arr_reset_" + VDTT_jb.n(var1[0]), var2);
                var5 = false;
                break label60;
            } catch (Exception var6) {
                VDTT_jb.a(var6);
                var5 = false;
            } finally {
                if (var5) {
                    if (var0 != null) {
                        var0.a();
                    }

                }
            }

            if (var0 != null) {
                var0.a();
                return;
            }

            return;
        }

        var0.a();
    }

    public final void a_() {
        System.currentTimeMillis();
        if (this.aD != null && this.f.contains(this.aD)) {
            this.f.remove(this.aD);
            this.f.insertElementAt(this.aD, 0);
        }

        if (this.D()) {
            this.co = false;
        } else {
            this.co = true;
        }

        if (VDTT_ek.m().bD) {
            VDTT_ek.m().S();
        }

        if (this.ej > 0) {
            --this.ej;
            if (this.ej == 0) {
                v().cm = false;
                VDTT_ek.m().S();
            }
        }

        try {
            if (VDTT_jb.a() / 1000L - (long) this.bN > 300L && !DataCenter.l()) {
                this.bN = (int) (VDTT_jb.a() / 1000L);
                (new Message((byte) -97)).l();
            }

            if (this.bM < 1000) {
                --this.bM;
                if (this.bM < 0) {
                    this.bM = 1000;
                }
            }

            this.al();
            if (this.aB != null) {
                this.U();

                try {
                    this.aB.a_();
                    if (DataCenter.d().h % 2 == 0 && this.aB.c < 90) {
                        this.aB.w();
                    }
                } catch (Exception var7) {
                }

                if (!this.bG) {
                    return;
                }
            }

            label720:
            {
                if (VDTT_eq.a().a(19) && MenuConfig.K().z() && Gdx.app.getType() == ApplicationType.Desktop) {
                    if (VDTT_eq.a().b(21) <= 1) {
                        if (VDTT_eq.a().b(21) > 0) {
                            if (!this.dD) {
                                F();
                                this.dD = true;
                            }
                        } else {
                            this.ep = 0L;
                        }
                        break label720;
                    }

                    if (this.ep == 0L) {
                        this.ep = System.currentTimeMillis();
                    }

                    if (System.currentTimeMillis() - this.ep <= VDTT_jb.c) {
                        break label720;
                    }

                    VDTT_d.g().a(true);
                }

                this.ep = 0L;
            }

            if (this.bO > 0) {
                --this.bO;
                if (this.bO == 0) {
                    this.U();
                }
            }

            if (DataCenter.aD == 2) {
                DataCenter.aD = 0;
                if (MenuConfig.d >= 0) {
                    this.cA = true;
                }
            }

            if (this.D() && this.bw != null && (v().ai == this.bw.d || v().ai == 86 && (this.bw.a == 59 || this.bw.d == 56 || this.bw.d == 87 || this.bw.d >= 0 && DataCenter.d().H[this.bw.d].e == 0))) {
                this.bv = this.bw;
                this.bw = null;
            }

            if (v().da > 0L && this.b.size() == 1) {
                VDTT_au.b().c();
            }

            if (v().ai != 47 && v().ai != 48) {
                O = dV;
            } else {
                O = dU;
            }

            P = 0;
            this.dp.removeAllElements();
            this.dr.removeAllElements();
            this.dq.removeAllElements();
            if (this.bg != null && (this.bg instanceof VDTT_gk && !((VDTT_gk) this.bg).v() || this.bg instanceof VDTT_fs && ((VDTT_fs) this.bg).k.c == 224 || !this.ar.contains(this.bg) && !this.ao.contains(this.bg) && !this.aq.contains(this.bg) && !this.ap.contains(this.bg))) {
                this.bg = null;
            }

            int var2;
            if (!this.bZ) {
                for (var2 = 0; var2 < v().av.size(); ++var2) {
                    VDTT_fx var3;
                    if ((var3 = (VDTT_fx) v().av.elementAt(var2)) != null && VDTT_jb.a(var3.a() - 60, var3.c() - 60, var3.b() + 60, var3.d() + 60, DataCenter.d().i, DataCenter.d().j, DataCenter.d().k, DataCenter.d().l)) {
                        this.dp.addElement(var3);
                    }
                }
            }

            boolean var13 = false;
            this.eo = -1;
            int var15;
            if (this.bP < 2) {
                try {
                    for (var15 = 0; var15 < v().Q.size(); ++var15) {
                        VDTT_iz var1;
                        if ((var1 = (VDTT_iz) v().Q.elementAt(var15)) != null) {
                            var1.n();
                            if (VDTT_jb.a(var1.a(), var1.c(), var1.b(), var1.d(), DataCenter.d().i, DataCenter.d().j, DataCenter.d().k, DataCenter.d().l)) {
                                this.dp.addElement(var1);
                                switch (var1.m().e) {
                                    case 2:
                                        if (VDTT_jb.a(VDTT_ek.m().a(), VDTT_ek.m().c(), VDTT_ek.m().b(), VDTT_ek.m().d(), var1.a(), var1.c(), var1.b(), var1.d()) && !var13) {
                                            var13 = true;
                                        }
                                        break;
                                    case 5:
                                        this.eo = var1.m().e;
                                        break;
                                    default:
                                        if (var1.p != null && !var13) {
                                            switch (var1.p.k) {
                                                case 13:
                                                case 208:
                                                    if (this.eo == -1) {
                                                        this.eo = var1.p.k;
                                                    }
                                            }
                                        }
                                }
                            }
                        }
                    }

                    VDTT_ac.b().a(var13);
                } catch (Exception var8) {
                }
            }

            VDTT_ek var19 = VDTT_ek.m();
            VDTT_gk var11;
            if (!Graphics.i2()) {
                move();
            }

            this.dp.addElement(var19);
            if (var19.e != 6 && var19.aa == 0 && !var19.E()) {
                this.dp.addElement(new VDTT_ib(var19.g, var19.aI, var19.aJ, var19));
                if (var19.bl != null && !var19.isHidePet) {

                    this.dp.addElement(new VDTT_ib(var19.bl.g, var19.bl.Q, var19.bl.R, var19.bl));
                }

                if (var19.bV != null && !var19.bD) {
                    this.dp.addElement(new VDTT_ib(var19.bV.g, var19.bV.aI, var19.bV.aJ, var19.bV));
                }
            }

            int var21 = 0;
            byte var32 = 30;
            if (v().C().d == 19 || v().C().d == 20) {
                var32 = 100;
            }

            int var17;
            for (var17 = 0; var17 < this.ao.size(); ++var17) {
                (var19 = (VDTT_ek) this.ao.elementAt(var17)).B();
                if (VDTT_jb.a(var19.a(), var19.c(), var19.b(), var19.d(), DataCenter.d().i, DataCenter.d().j, DataCenter.d().k, DataCenter.d().l) || var19.af()) {
                    var19.h = false;
                    ++var21;
                    if (var21 > var32 && !var19.equals(this.bg) && !var19.equals(VDTT_ek.m())) {
                        var19.h = true;
                    }

                    this.dp.addElement(var19);
                    if (var19.e != 6 && var19.aa == 0 && !var19.E()) {
                        this.dp.addElement(new VDTT_ib(var19.g, var19.aI, var19.aJ, var19));
                        if (var19.bV != null && !var19.bD) {
                            this.dp.addElement(new VDTT_ib(var19.bV.g, var19.bV.aI, var19.bV.aJ, var19.bV));
                        }
                    }

                    if (!var19.af()) {
                        this.dr.add(var19);
                    }
                }
            }

            for (var17 = this.an.size() - 1; var17 >= 0; --var17) {
                var19 = (VDTT_ek) this.an.elementAt(var17);
                if (!this.ao.contains(var19)) {
                    this.an.removeElementAt(var17);
                } else if (var19.ae == null && var19.bd.size() == 0) {
                    this.an.removeElementAt(var17);
                    this.ao.remove(var19);
                }
            }

            if (this.C().a != 46) {
                for (var17 = this.aw.size() - 1; var17 >= 0; --var17) {
                    var19 = (VDTT_ek) this.aw.get(var17);
                    if (!this.dp.contains(var19) && !var19.bO) {
                        this.dp.add(var19);
                        this.dp.addElement(new VDTT_ib(var19.g, var19.aI, var19.aJ, var19));
                    }
                }
            }

            if (this.aB == null) {
                for (var17 = this.cK.size() - 1; var17 >= 0; --var17) {
                    VDTT_hg var22;
                    VDTT_hg var23;
                    if ((var23 = var22 = (VDTT_hg) this.cK.elementAt(var17)).m && var23.l.p()) {
                        var23.l.bD = false;
                        if (var23.k == 1) {
                            VDTT_r.j = true;
                            DataCenter.d().c();
                            v().J();
                            N = VDTT_jb.a();
                            VDTT_ac.b().f();
                            (new Message((byte) -61)).l();
                        }
                    }

                    if (var23.m) {
                        var23.l.bE = false;
                    }

                    if (var23.m) {
                        this.cK.remove(var22);
                    } else {
                        var22.m();
                    }
                }
            }

            this.cy = false;
            this.cz = null;
            if (this.bP < 2) {
                var2 = 0;

                label1013:
                while (true) {
                    if (var2 >= this.ap.size()) {
                        for (var15 = 0; var15 < this.aq.size(); ++var15) {
                            VDTT_gx var24;
                            (var24 = (VDTT_gx) this.aq.elementAt(var15)).p();
                            if (VDTT_jb.a(var24.a(), var24.c(), var24.b(), var24.objY + var24.r, DataCenter.d().i, DataCenter.d().j, DataCenter.d().k, DataCenter.d().l)) {
                                this.dp.addElement(var24);
                                if (var24.e != 6) {
                                    if (var24.r()) {
                                        this.dp.addElement(new VDTT_ib(var24.g, var24.objX, var24.objY - 1, var24));
                                    } else {
                                        this.dp.addElement(new VDTT_ib(var24.g, var24.objX, var24.objY, var24));
                                    }
                                }

                                if (var24.e != 4 && var24.e != 6 && var24.e != 5) {
                                    this.dr.add(var24);
                                }
                            }
                        }

                        var21 = this.ar.size() - 1;

                        while (true) {
                            if (var21 < 0) {
                                break label1013;
                            }

                            VDTT_fs var27;
                            (var27 = (VDTT_fs) this.ar.elementAt(var21)).m();
                            if (VDTT_jb.a(var27.a(), var27.c(), var27.b(), var27.d(), DataCenter.d().i, DataCenter.d().j, DataCenter.d().k, DataCenter.d().l)) {
                                this.dp.addElement(var27);
                                if (var27.k.c != 224) {
                                    this.dr.add(var27);
                                }
                            }

                            --var21;
                        }
                    }

                    (var11 = (VDTT_gk) this.ap.elementAt(var2)).r();
                    if (var11.ao != null && var11.ao.equals(VDTT_ek.m().aD)) {
                        this.cz = var11;
                    }

                    label1186:
                    {
                        if (VDTT_jb.a(var11.a(), var11.c(), var11.b(), var11.q(), DataCenter.d().i, DataCenter.d().j, DataCenter.d().k, DataCenter.d().l)) {
                            this.dp.addElement(var11);
                            if (var11.e != 4 && var11.e != 6) {
                                if (var11.Q == var11.objX && var11.R == var11.objY) {
                                    this.dp.addElement(new VDTT_ib(var11.g, var11.Q, var11.R - 1, var11));
                                } else {
                                    this.dp.addElement(new VDTT_ib(var11.g, var11.Q, var11.R, var11));
                                }
                            }

                            if (var11.h()) {
                                break label1186;
                            }

                            this.dr.add(var11);
                        }

                        for (var15 = 0; var15 < var11.i.size(); ++var15) {
                            VDTT_jc var25;
                            (var25 = (VDTT_jc) var11.i.elementAt(var15)).m();
                            this.dp.addElement(var25);
                        }
                    }

                    ++var2;
                }
            }

            if ((v().ai == 47 || v().ai == 48) && DataCenter.d().h % 10 == 0 && VDTT_jb.a((int) 10) == 0) {
                this.as.add(new VDTT_er(78, DataCenter.d().n + VDTT_jb.a(DataCenter.d().n), VDTT_jb.a((int) this.r), new VDTT_fb(-VDTT_jb.a(DataCenter.d().n), VDTT_jb.a((int) this.r)), -1, -1, false, this.as, new Vector()));
            }

            for (var15 = this.as.size() - 1; var15 >= 0; --var15) {
                VDTT_er var26;
                (var26 = (VDTT_er) this.as.elementAt(var15)).o();
                if (var26.n()) {
                    if (var26.O != null && var26.O.p() && var26.k == 68) {
                        try {
                            Message.c((byte) -20).l();
                        } catch (Exception var6) {
                        }
                    }

                    this.as.removeElement(var26);
                } else if (VDTT_jb.a(var26.a(), var26.c(), var26.b(), var26.d(), DataCenter.d().i, DataCenter.d().j, DataCenter.d().k, DataCenter.d().l)) {
                    this.dp.addElement(var26);
                }
            }

            for (var21 = this.au.size() - 1; var21 >= 0; --var21) {
                VDTT_hi var29;
                if ((var29 = (VDTT_hi) this.au.elementAt(var21)) != null) {
                    var29.n();
                    if (var29.p()) {
                        this.au.removeElement(var29);
                    } else if (VDTT_jb.a(var29.a() - 50, var29.c() - 50, var29.b() + 50, var29.d() + 50, DataCenter.d().i, DataCenter.d().j, DataCenter.d().k, DataCenter.d().l)) {
                        this.dp.addElement(var29);
                    }
                }
            }

            for (var17 = this.at.size() - 1; var17 >= 0; --var17) {
                VDTT_ev var28;
                (var28 = (VDTT_ev) this.at.elementAt(var17)).n();
                if (var28.q()) {
                    this.at.removeElement(var28);
                } else if (VDTT_jb.a(var28.a() - 50, var28.c() - 50, var28.b() + 50, var28.d() + 50, DataCenter.d().i, DataCenter.d().j, DataCenter.d().k, DataCenter.d().l)) {
                    this.dp.addElement(var28);
                }
            }

            if (this.ew != null) {
                this.ew.m();
            }

            if (!this.bn.q()) {
                this.dp.addElement(this.bn);
            } else {
                this.bn.I = 0;
            }

            this.bm.n();
            this.bn.n();
            if (this.bI > 0) {
                --this.bI;
            }

            if (this.bJ > 0) {
                --this.bJ;
            }

            if (this.bK > 0) {
                --this.bK;
            }

            if (this.bL > 0) {
                --this.bL;
            }

            if (!Graphics.i2()) {
                auto();
            }

            for (var17 = 0; var17 < this.ek.size(); ++var17) {
                ((VDTT_dx) this.ek.get(var17)).m();
                this.dp.add(this.ek.get(var17));
            }

            for (var17 = 0; var17 < this.el.size(); ++var17) {
                ((VDTT_dx) this.el.get(var17)).m();
                if (VDTT_jb.a(((VDTT_dx) this.el.get(var17)).a() - 50, ((VDTT_dx) this.el.get(var17)).c() - 50, ((VDTT_dx) this.el.get(var17)).b() + 50, ((VDTT_dx) this.el.get(var17)).d() + 50, DataCenter.d().i, DataCenter.d().j, DataCenter.d().k, DataCenter.d().l)) {
                    this.dp.add(this.el.get(var17));
                }
            }

            for (var17 = 0; var17 < this.em.size(); ++var17) {
                ((VDTT_dx) this.em.get(var17)).m();
                if (VDTT_jb.a(((VDTT_dx) this.em.get(var17)).a() - 50, ((VDTT_dx) this.em.get(var17)).c() - 50, ((VDTT_dx) this.em.get(var17)).b() + 50, ((VDTT_dx) this.em.get(var17)).d() + 50, DataCenter.d().i, DataCenter.d().j, DataCenter.d().k, DataCenter.d().l)) {
                    this.dp.add(this.em.get(var17));
                }
            }

            this.Q();
            VDTT_fg.b();
            if (this.aA != null) {
                this.aA.b();
                if (this.dz != null) {
                    DataCenter.p();
                    boolean var31 = !this.dz.d;
                    this.dz.b(v().ag >= 200 || !this.aA.c() || this.aA.d());
                    if (var31 && this.dz.d) {
                        this.aA.g();
                    }
                }
            }

            if (this.dv != null) {
                this.dv.b();
            }

            if (this.az != null) {
                DataCenter.d();
                DataCenter.o();
                this.az.b();
                if (!this.cG && this.aS != null) {
                    this.cG = true;
                    if (VDTT_eq.a().a(13)) {
                        this.cH = 1;
                    }

                    this.aS.f();
                    this.aS.c(VDTT_eq.a().a(13));
                }

                if (!this.az.d() && this.dC != null) {
                    DataCenter.o();
                    if (!DataCenter.l()) {
                        this.dC.b(!this.az.c());
                        this.dx.b(!this.az.c());
                        this.dC.b = this.cH < 2;
                        this.dx.b = this.cH == 2;
                    } else {
                        this.dC.b(true);
                        this.dx.b(true);
                    }
                }
            }

            if (this.dt != null) {
                this.dt.b();
            }

            if (this.du != null) {
                this.du.b();
            }

            if (this.cF > 0) {
                --this.cF;
                this.bg = this.cE;
            } else if (this.aW && this.bg != null) {
                this.ao();
            } else {
                this.ap();
            }

            this.aU = false;

            for (var2 = 0; var2 < this.Z.size(); ++var2) {
                if (!((VDTT_fa) this.Z.elementAt(var2)).k) {
                    this.aU = true;
                    break;
                }
            }

            if (this.cm && (VDTT_ek.m().objX >= v().aj || VDTT_ek.m().objX <= 0) || this.ai == 56 && VDTT_ek.m().objX < 70 && VDTT_ek.m().objY > 484 || this.ai == 48 && VDTT_ek.m().objX < 75 && VDTT_ek.m().objY > 500 || this.ai == 48 && VDTT_ek.m().objX > 990 && VDTT_ek.m().objY > 500 || this.ai == 50 && VDTT_ek.m().objX < 140 && VDTT_ek.m().objY > 534 || this.ai == 50 && VDTT_ek.m().objX > 930 && VDTT_ek.m().objY > 534 || this.ai == 58 && VDTT_ek.m().objX > 264 && VDTT_ek.m().objX <= 324 && VDTT_ek.m().objY < 60) {
                VDTT_ek.m().W();
                this.ak();
                return;
            }

            if (this.co) {
                this.co = false;
                VDTT_ac.b().v();
            }

            if (this.er) {
                this.er = System.currentTimeMillis() - this.es < (long) ((this.et + 2) * 1000);
                if (!this.er) {
                    this.em.clear();
                    this.cN = 0;
                }
            }

            this.dG = null;
            this.bh = null;
            if (v().C().d == 21) {
                for (var2 = 0; var2 < this.ap.size(); ++var2) {
                    if ((var11 = (VDTT_gk) this.ap.get(var2)).e != 4 && var11.e != 6 && var11.e != 5 && var11.n > 0) {
                        this.dG = Caption.km + " " + var11.p().k;
                        this.bh = var11;
                        break;
                    }
                }

                if (this.dG == null) {
                    if (VDTT_ek.m().h(132) != null) {
                        this.dG = VDTT_ek.m().aD + Caption.wQ;
                    } else {
                        for (var2 = 0; var2 < this.ao.size(); ++var2) {
                            if ((var19 = (VDTT_ek) this.ao.get(var2)).h(132) != null) {
                                this.dG = var19.aD + Caption.wQ;
                                this.bh = var19;
                                break;
                            }
                        }
                    }
                }
            }

            this.ai();
            if (this.cQ != null) {
                this.cQ.b(false);
                this.cQ.f(DataCenter.d().n - VDTT_jb.n(25 + VDTT_d.g().m() / 2), this.aA.c() ? 75 : 28);
            }

            if (this.cT != null) {
                this.cT.b(false);
                this.cT.f(DataCenter.d().n - VDTT_jb.n(25 + VDTT_d.g().m() / 2), this.aA.c() ? 75 : 28);
            }
        } catch (Exception var9) {
            VDTT_jb.a(var9);
        }

        this.aj();
        this.av();
    }

    public void move() {
        VDTT_ek var19 = VDTT_ek.m();
        VDTT_gk var11;
        int var2;
        if (this.D()) {
            VDTT_cw var4 = this;
            int var5;
            if (this.bv != null) {
                if (VDTT_ek.m().ah()) {
                    this.bv = null;
                } else if (this.ai == this.bv.d) {
                    label927:
                    {
                        if (this.bv.a >= 0) {
                            for (var5 = 0; var5 < v().aq.size(); ++var5) {
                                VDTT_gx var10;
                                if ((var10 = (VDTT_gx) v().aq.elementAt(var5)).k == var4.bv.a) {
                                    var4.bv.e = var10.objX;
                                    var4.bv.f = var10.objY;
                                    if (VDTT_jb.b(VDTT_ek.m().objX, VDTT_ek.m().objY, var10.objX, var10.objY) <= var4.ba) {
                                        if (var10.e == 6) {
                                            VDTT_il var16;
                                            if ((var16 = v().T()) != null && var16.a == 5 && var16.d == var10.k && VDTT_jb.a((XYEntity) var10, (XYEntity) VDTT_ek.m()) < 100) {
                                                v();
                                                l(var10.b, 0);
                                            }
                                        } else {
                                            var4.bg = var10;
                                            VDTT_ek.m().S();
                                            if (VDTT_jb.b(VDTT_ek.m().objX, var10.objX) < 20) {
                                                if (var10.objX >= VDTT_ek.m().objX) {
                                                    VDTT_ek.m().objX = (short) (var10.objX - 20);
                                                } else {
                                                    VDTT_ek.m().objX = (short) (var10.objX + 20);
                                                }
                                            }

                                            var4.ao();
                                            if (var4.bv != null && var4.bv.a == 101) {
                                                if (var4.bv.h == 60) {
                                                    var4.bv.d = var4.bv.h;
                                                    var4.bv.a = var4.bv.i;
                                                    var4.bv.h = -1;
                                                    var4.bv.i = -1;
                                                    var4.bv.e = var4.bv.f = 0;
                                                    l(var4.bg.b, 0);
                                                    break label927;
                                                }

                                                if (var4.bv.h == 69) {
                                                    var4.bv.d = var4.bv.h;
                                                    var4.bv.a = var4.bv.i;
                                                    var4.bv.h = -1;
                                                    var4.bv.i = -1;
                                                    var4.bv.e = var4.bv.f = 0;
                                                    l(var4.bg.b, 1);
                                                    break label927;
                                                }

                                                if (var4.bv.h == 85) {
                                                    var4.bv.d = var4.bv.h;
                                                    var4.bv.a = var4.bv.i;
                                                    var4.bv.h = -1;
                                                    var4.bv.i = -1;
                                                    var4.bv.e = var4.bv.f = 0;
                                                    l(var4.bg.b, 2);
                                                    break label927;
                                                }

                                                if (var4.bv.h == 59) {
                                                    var4.bv.d = var4.bv.h;
                                                    var4.bv.a = var4.bv.i;
                                                    var4.bv.h = -1;
                                                    var4.bv.i = -1;
                                                    var4.bv.e = var4.bv.f = 0;
                                                    l(var4.bg.b, 3);
                                                    break label927;
                                                }

                                                if (var4.bv.h == 68) {
                                                    var4.bv.d = var4.bv.h;
                                                    var4.bv.a = var4.bv.i;
                                                    var4.bv.h = -1;
                                                    var4.bv.i = -1;
                                                    var4.bv.e = var4.bv.f = 0;
                                                    l(var4.bg.b, 4);
                                                    break label927;
                                                }
                                            }
                                        }

                                        var4.bv = null;
                                    }
                                    break;
                                }
                            }
                        }

                        if (var4.bv != null) {
                            if (var4.bv.e <= 0 && var4.bv.f <= 0 && !v().V()) {
                                for (var5 = 0; var5 < var4.ap.size(); ++var5) {
                                    if ((var11 = (VDTT_gk) var4.ap.get(var5)).k == var4.bv.c) {
                                        var4.bv.e = var11.objX;
                                        var4.bv.f = var11.objY;
                                        if (var11.U) {
                                            break;
                                        }
                                    }
                                }
                            }

                            if ((var4.bv.e != 0 || var4.bv.f != 0) && VDTT_jb.a(VDTT_ek.m().objX, VDTT_ek.m().objY, var4.bv.e, var4.bv.f) >= 10) {
                                if (!VDTT_ek.m().Z() && VDTT_ek.m().ae == null && VDTT_ek.m().bd.size() == 0 && VDTT_fe.c().size() == 0) {
                                    VDTT_ek.m().c(var4.bv.e, var4.bv.f);
                                }
                            } else {
                                if (MenuConfig.K().F()) {
                                    MenuConfig.K().a(true);
                                } else if (var4.bv.c >= 0) {
                                    for (var5 = 0; var5 < var4.ap.size(); ++var5) {
                                        if ((var11 = (VDTT_gk) var4.ap.get(var5)).k == var4.bv.c) {
                                            var4.cx = var11.k;
                                            var4.bg = null;
                                            if (var11.p().p < 9 || var11.p().p > 11) {
                                                if (var4.bv.b >= 0) {
                                                    MenuConfig.K().b(true);
                                                }

                                                MenuConfig.K().a(true);
                                            }

                                            var4.cx = var11.k;
                                            if (var11.p().p == 13 || var11.p().p == 7) {
                                                var4.bg = var11;
                                            }
                                            break;
                                        }
                                    }
                                }

                                var4.bv = null;
                            }
                        }
                    }
                } else if (this.V()) {
                    this.bv = null;
                } else {
                    if (this.bv.g == null) {
                        this.bv.g = this.a(DataCenter.h(), this.ai, this.bv.d, true);
                        if (this.bv.g.size() == 0) {
                            this.bv.g = null;
                            if (MenuConfig.K().N() && this.ai != this.bv.d) {
                                --this.cD;
                                if (this.cD == 0 && VDTT_ek.m().ac()) {
                                    a(this.bv);
                                    this.cC = 100;
                                }
                            } else {
                                this.bv = null;
                            }
                        }
                    }

                    if (this.bv != null && this.bv.g != null) {
                        VDTT_fx var12;
                        if (!VDTT_ek.m().Z() && !VDTT_fe.e()) {
                            for (var5 = 0; var5 < var4.bv.g.size(); ++var5) {
                                if ((var12 = (VDTT_fx) var4.bv.g.elementAt(var5)).k == var4.ai) {
                                    if (var12.L != 0) {
                                        VDTT_ek.m().c(var12.objX, var12.L);
                                    } else {
                                        XYEntity var18;
                                        if ((var18 = VDTT_ek.b(var12.objX, var12.objY)) != null) {
                                            var12.L = var18.objY;
                                            if (VDTT_jb.b(var12.L - var12.objY) > 70) {
                                                var12.L = var12.objY;
                                            } else {
                                                for (var2 = 0; var2 < 10 && v().U.a(var12.objX, var12.L); ++var2) {
                                                    --var12.L;
                                                }
                                            }

                                            VDTT_ek.m().c(var12.objX, var12.L);
                                        } else {
                                            VDTT_ek.m().c(var12.objX, var12.objY);
                                        }
                                    }
                                    break;
                                }
                            }
                        } else {
                            for (var5 = 0; var5 < var4.bv.g.size(); ++var5) {
                                if ((var12 = (VDTT_fx) var4.bv.g.elementAt(var5)).k == var4.ai && VDTT_ek.m().objX == var12.objX && (VDTT_ek.m().objY == var12.objY || VDTT_ek.m().objY == var12.L)) {
                                    var4.h(var12.objX, var12.objY);
                                    break;
                                }
                            }
                        }
                    }
                }
            }

            var19.B();
            XYEntity var20;
            if ((var20 = VDTT_ek.b(var19.objX, var19.objY)) != null && VDTT_jb.b(var19.objY - var20.objY) < 3) {
                var19.objY = var20.objY;

                for (var5 = 0; var5 < 10 && v().U.a(var19.objX, var19.objY); ++var5) {
                    --var19.objY;
                }
            }

            if (VDTT_ek.m().aV != null && VDTT_ek.m().aV.d.d == 19) {
                this.s(this.df);
            }

            if (this.C().d != 20 && !VDTT_ek.m().ab()) {
                boolean var30 = false;
                long var14;
                if ((var19.aG == 2 || var20 != null && !var19.q()) && this.de > 0 && (var14 = System.currentTimeMillis()) - this.ev > 1000L) {
                    this.ev = var14;
                    var30 = true;
                }

                if (!var30 && this.de < 30 && var20 == null && (var14 = System.currentTimeMillis()) - this.ev > 10000L) {
                    this.ev = var14;
                }
            } else {
                this.s(this.df);
            }
        }
    }

    public void auto() {
        this.ar();//
        this.at();
        this.as();
        this.AutoDonRac();
        this.aq();
    }

    private void ai() {
        int var10001;
        if ((this.br != 14 && this.br != 9 || this.bs != 1 || this.cQ == null || !this.V()) && !this.ez) {
            if (this.b.size() <= 0 || !(this.b.lastElement() instanceof VDTT_nn) && this.aB == null && (!(this.b.lastElement() instanceof VDTT_am) || this.b.lastElement() instanceof VDTT_gi)) {
                DataCenter.d();
                if (!DataCenter.b()) {
                    if (this.br == 14 && this.V() && !VDTT_ek.m().h()) {
                        if (!MenuConfig.K().W) {
                            var10001 = this.aF.objX + 14;
                            DataCenter.d().aA.b(var10001, this.aF.objY + 7);
                        } else {
                            DataCenter.d().aA.b = false;
                        }
                    } else if (this.br == 0 && this.bs == 2 && this.b.lastElement().equals(this)) {
                        var10001 = this.aI.objX + 12;
                        DataCenter.d().aA.b(var10001, this.aI.objY + 12);
                    } else if ((this.br == 1 && (this.bs == 0 || this.bs == 1) || this.br == 5 && this.bs == 14) && this.b.lastElement().equals(this)) {
                        DataCenter.d().aA.b(10 + VDTT_d.g().l() / 2, 10);
                    } else {
                        if (this.br == 5 && this.b.lastElement().equals(this)) {
                            if (this.bs == 0) {
                                if (v().aA.c()) {
                                    DataCenter.d().aA.b(DataCenter.d().n - VDTT_jb.n(22), VDTT_jb.n(37));
                                    return;
                                }

                                DataCenter.d().aA.b(DataCenter.d().n - VDTT_jb.n(7), VDTT_jb.n(7));
                                return;
                            }

                            if (this.bs == 3) {
                                DataCenter.d().aA.b(VDTT_d.g().l() + 10, 10);
                                return;
                            }
                        } else {
                            if (this.br == 3 && this.bs == 0 && v().bs < 9 && this.b.lastElement().equals(this)) {
                                var10001 = this.aG.objX + 14;
                                DataCenter.d().aA.b(var10001, this.aG.objY + 7);
                                return;
                            }

                            if (this.br == 10 && v().bs == 1 && this.ai != 87 && this.ai != 57 && this.b.lastElement().equals(this)) {
                                DataCenter.d().aA.b(DataCenter.d().n - 40, 7);
                                return;
                            }

                            if (this.br == 17 && this.b.lastElement().equals(this) && this.bs <= 0) {
                                if (!this.aA.c()) {
                                    DataCenter.d().aA.b(DataCenter.d().n - VDTT_jb.n(7), VDTT_jb.n(7));
                                    return;
                                }

                                DataCenter.d().aA.b(DataCenter.d().n - VDTT_jb.n(22), VDTT_jb.n(60));
                            }
                        }

                    }
                }
            } else {
                DataCenter.d().aA.b = false;
            }
        } else {
            MainScreen var1;
            if ((var1 = super.c) instanceof VDTT_bh) {
                VDTT_bh var3;
                if ((var3 = (VDTT_bh) var1).b.equals(Caption.tY)) {
                    var10001 = var3.objX + 65;
                    int var10002 = var3.objY + var3.r;
                    DataCenter.d().aA.b(var10001, var10002 - 20);
                }

            } else if (this.b.lastElement() instanceof VDTT_cw) {
                this.ez = true;
                var10001 = this.cQ.objX + 7;
                DataCenter.d().aA.b(var10001, this.cQ.objY + 7);
            } else {
                DataCenter.d().aA.b = false;
            }
        }
    }

    private void aj() {
        if (DataCenter.d().ai instanceof VDTT_cw) {
            int var2;
            if (this.eo >= 0) {
                VDTT_ac var10000 = VDTT_ac.b();
                var2 = this.eo;
                VDTT_ac var1 = var10000;

                try {
                    if (!var1.a) {
                        boolean var3 = var1.d != var2;
                        var1.d = var2;
                        if (!var3) {
                            var1.l();
                        } else {
                            boolean var8 = VDTT_eq.a().a(0);
                            var1 = var1;

                            try {
                                var1.j();
                                if (var8) {
                                    byte var9 = -1;
                                    switch (var1.d) {
                                        case 3:
                                        default:
                                            break;
                                        case 5:
                                            var9 = 2;
                                            break;
                                        case 13:
                                            var9 = 16;
                                    }

                                    if (var9 >= 0) {
                                        byte[] var10 = VDTT_jb.b(VDTT_jb.h("music/" + var9).readBytes());
                                        VDTT_da.a("music" + var9 + ".mp3", var10);
                                        var1.b = Gdx.audio.newMusic(VDTT_jb.i(VDTT_da.a + "/music" + var9 + ".mp3"));
                                    }

                                    var1.l();
                                }
                            } catch (Exception var4) {
                                VDTT_jb.a(var4);
                            }
                        }
                    }
                } catch (Exception var5) {
                    VDTT_jb.a(var5);
                }
            } else {
                VDTT_ac.b().f();
            }

            VDTT_ac.b().b(this.ai);
            short var6 = -1;
            VDTT_gk var11;
            switch (this.ai) {
                case 57:
                case 65:
                case 71:
                case 75:
                case 83:
                    for (var2 = 0; var2 < this.dp.size(); ++var2) {
                        if (this.dp.get(var2) instanceof VDTT_gk && ((var11 = (VDTT_gk) this.dp.get(var2)).k == 160 || var11.k == 166 || var11.k == 169 || var11.k == 153 || var11.k == 152)) {
                            var6 = var11.k;
                            break;
                        }
                    }

                    if (var6 > 0) {
                        VDTT_ac.b();
                    }
                case 58:
                case 59:
                case 60:
                case 61:
                case 64:
                case 67:
                case 68:
                case 70:
                case 72:
                case 73:
                case 74:
                case 76:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                default:
                    return;
                case 62:
                case 63:
                case 66:
                    boolean var7 = false;

                    for (var2 = 0; var2 < this.dp.size(); ++var2) {
                        if (this.dp.get(var2) instanceof VDTT_gk && ((var11 = (VDTT_gk) this.dp.get(var2)).k == 159 || var11.k == 168 || var11.k == 161)) {
                            var7 = true;
                            break;
                        }
                    }

                    if (var7) {
                        VDTT_ac.b().m();
                        return;
                    }

                    VDTT_ac.b().e();
                    return;
                case 69:
                    if (VDTT_ek.m().objY >= 500) {
                        VDTT_ac.b().m();
                        return;
                    }

                    VDTT_ac.b().e();
                    return;
                case 77:
                    if (VDTT_ek.m().objY >= 600) {
                        VDTT_ac.b().m();
                    } else {
                        VDTT_ac.b().e();
                    }
            }
        }
    }

    private void ak() {
        try {
            if (!VDTT_ek.m().bE) {
                long var1 = VDTT_jb.a();
                this.i();
                if (!d && var1 - N >= 500L) {
                    d = true;
                    N = var1;
                    (new Message((byte) 127)).l();
                }
            }
        } catch (Exception var3) {
        }
    }

    private void a(Vector var1, Vector var2, int var3) {
        Vector var4 = new Vector();

        for (int var5 = var1.size() - 3; var5 >= 0; --var5) {
            VDTT_fx var6 = (VDTT_fx) var1.elementAt(var5);
            var4.clear();
            var4.addAll(var2);
            Vector var8;
            if ((var8 = this.a(var4, var6.k, var3, false)).size() > 0 && var8.size() < var1.size() - var5) {
                for (int var7 = var1.size() - 1; var7 >= var5; --var7) {
                    var1.removeElementAt(var7);
                }

                var1.addAll(var8);
                var5 = var1.size() - 2;
            }
        }

    }

    private Vector a(Vector var1, int var2, int var3, boolean var4) {
        Vector var5;
        (var5 = new Vector()).addAll(var1);
        Vector var6 = new Vector();

        while (true) {
            Vector var7 = new Vector();
            if (!this.a(var2, var3, var1, var7)) {
                var1 = new Vector();

                for (var2 = 0; var2 < var6.size(); ++var2) {
                    var7 = (Vector) var6.elementAt(var2);
                    if (var4) {
                        this.a(var7, var5, var3);
                    }

                    if (var1.size() == 0 || var7.size() < var1.size()) {
                        var1 = var7;
                    }
                }

                return var1;
            }

            var6.add(var7);
            var1.remove(L);
        }
    }

    public final int G() {
        try {
            return VDTT_ek.m().e(this.bX).f;
        } catch (Exception var2) {
            VDTT_jb.a(var2);
            return -1;
        }
    }

    private void al() {
        this.bS = this.bV = this.bW = this.bT = this.bU = this.dd = 0;
        this.cc = false;
        this.dH = null;
        Item var1 = null;
        this.dg.clear();

        try {
            System.currentTimeMillis();

            for (int var3 = 0; var3 < VDTT_ek.m().aP.length; ++var3) {
                Item var2;
                if ((var2 = VDTT_ek.m().aP[var3]) != null) {
                    if (Item.d(var2.c)) {
                        this.cc = true;
                    }

                    if (var2.c >= 165 && var2.c <= 168) {
                        var1 = var2;
                        if (this.bX < 0 || this.bX >= DataCenter.d().O.length) {
                            this.a(var2.c, true);
                            this.al();
                            break;
                        }
                    }

                    if (Item.d(var2.c)) {
                        this.dH = var2;
                        if (this.bX >= 165 && this.bX <= 168) {
                            this.a(var2.c, true);
                            this.al();
                            break;
                        }

                        if (VDTT_ek.m().F() && !Item.d(this.bX)) {
                            this.a(var2.c, false);
                            this.al();
                            break;
                        }
                    }

                    if (!var2.aj() && var2.c != 826) {
                        if (var2.getItemTemplate().f == 23) {
                            this.bV += var2.M();
                        } else if (var2.getItemTemplate().f == 24) {
                            this.dd += var2.M();
                        }
                    } else {
                        this.bS += var2.M();
                    }

                    if (var2.c == this.bX) {
                        this.bW += var2.M();
                    } else if (var2.c == 160) {
                        this.bT += var2.M();
                    } else if (var2.c == 711) {
                        this.bU += var2.M();
                    }

                    if (var2.getItemTemplate().f == 24) {
                        this.dg.add(var2);
                    }
                }
            }
        } catch (Exception var5) {
        }

        if (this.bW == 0 && Item.d(this.bX)) {
            if (this.dH != null) {
                this.a(this.dH.c, true);
                this.al();
                return;
            }

            if (var1 != null) {
                this.a(var1.c, true);
                this.al();
                return;
            }
        } else if (!VDTT_ek.m().F() && Item.d(this.ei) && !Item.d(this.bX)) {
            this.a(this.ei, false);
        }

    }

    private boolean a(int var1, int var2, Vector var3, Vector var4) {
        if (var1 == var2) {
            return true;
        } else {
            for (int var5 = 0; var5 < var3.size(); ++var5) {
                short[] var6;
                Vector var7;
                VDTT_fx var8;
                if ((var6 = (short[]) var3.elementAt(var5))[0] == var1) {
                    (var7 = new Vector()).addAll(var3);
                    var7.remove(var5);
                    if (this.a(var6[5], var2, var7, var4)) {
                        L = var5;
                        (var8 = new VDTT_fx(0, 0)).a(var6[0], var6[5], var6[1], var6[2], var6[3], var6[4]);
                        var4.insertElementAt(var8, 0);
                        return true;
                    }
                } else if (var6[5] == var1) {
                    (var7 = new Vector()).addAll(var3);
                    var7.remove(var5);
                    if (this.a(var6[0], var2, var7, var4)) {
                        L = var5;
                        (var8 = new VDTT_fx(0, 0)).a(var6[5], var6[0], var6[6], var6[7], var6[8], var6[9]);
                        var4.insertElementAt(var8, 0);
                        return true;
                    }
                }
            }

            return false;
        }
    }

    private void am() {
        if (VDTT_jb.a() >= this.dM) {
            if (!this.az()) {
                boolean var2 = true;
                this.aV = var2;
                Collections.sort(this.dr, VDTT_n.j);
                if (this.dr.size() <= 0) {
                    this.bg = null;
                } else {
                    int var1 = this.dr.size();
                    int var5 = -1;
                    if (this.bg != null) {
                        var5 = this.dr.indexOf(this.bg);
                    }

                    int var3 = 0;

                    while (true) {
                        if (var3 >= var1) {
                            return;
                        }

                        ++var5;
                        if (var5 >= this.dr.size()) {
                            var5 = 0;
                        }

                        VDTT_n var4;
                        if ((!((var4 = (VDTT_n) this.dr.elementAt(var5)) instanceof VDTT_gk) || ((VDTT_gk) var4).v()) && (!(var4 instanceof VDTT_ek) || !((VDTT_ek) var4).af())) {
                            this.bg = var4;
                            break;
                        }

                        ++var3;
                    }
                }

            }
        }
    }

    private void an() {
        if (this.dI != null && this.dI.a(VDTT_ek.m(), false) && VDTT_ek.m().aV == null) {//
            VDTT_ic var1 = this.bo;
            this.a(this.dI, false);
            if (VDTT_ek.m().aV != null) {
                VDTT_ek.m().aV.j = var1;
            }
        } else {
            if (this.bg instanceof VDTT_gk) {
                int var6 = VDTT_jb.b(VDTT_ek.m().objX, VDTT_ek.m().objY, this.bg.objX, this.bg.objY);
                if (VDTT_eq.a().a(41) && var6 > 100) {
                    VDTT_ek.m().objX = this.bg.objX;
                    VDTT_ek.m().objY = this.bg.objY;
                    this.g(true);
                    return;
                }
            }
            if (VDTT_ek.m().ae == null || VDTT_ek.m().ae.objX != this.bg.objX || VDTT_ek.m().ae.objY != this.bg.objY) {
                VDTT_ek.m().ae = new VDTT_gm(this.bg.objX, this.bg.objY, VDTT_ek.m().J);
            }
        }
    }

    private void g(boolean var1) {
        int var6 = VDTT_jb.b(VDTT_ek.m().objX, VDTT_ek.m().objY, this.bg.objX, this.bg.objY);
        if (this.a((XYEntity) this.bg)) {
            this.aW = false;
            this.bg = null;
        } else {
            if (!(this.bg instanceof VDTT_gk)) {
                if (this.bg instanceof VDTT_ek) {
                    VDTT_ek var11 = (VDTT_ek) this.bg;
                    if (this.a(var11) && v().bo != null) {
                        if (var6 <= v().bo.i && var6 <= v().bo.j) {
                            if (!MenuConfig.K().W || !VDTT_eq.a().a(35) || v().V()) {//
                                if (v().bo.d == 9) {
                                    if (VDTT_ek.m().U() == null) {
                                        VDTT_ek.m().a(true, dN);
                                        return;
                                    }

                                    if (VDTT_ek.m().ae == null || !VDTT_ek.m().ae.a() || MenuConfig.K().W) {
                                        this.aW = false;
                                        VDTT_ek.m().S();
                                        VDTT_ek.m().W();
                                        VDTT_ek.m().a(v().bo, this.bg, true);
                                        return;
                                    }
                                } else {//if (!VDTT_ek.m().q() || VDTT_ek.m().r())
                                    this.aW = false;
                                    VDTT_ek.m().S();
                                    VDTT_ek.m().W();
                                    VDTT_ek.m().a(v().bo, this.bg, true);
                                    return;
                                }
                            }
                        } else if (!MenuConfig.K().W || !VDTT_eq.a().a(35) || v().V()) {//
                            this.an();
                        }

                        return;
                    }
                }

                int var13 = this.ba;
                if (this.bg instanceof VDTT_fs) {
                    var13 = this.bb;
                }

                if (var6 <= var13) {
                    this.aW = false;
                    VDTT_ek.m().S();
                    VDTT_ek.m().W();
                    if (this.bg instanceof VDTT_gx) {
                        if (!MenuConfig.K().W && !this.o.a[5] && !this.o.a[15]) {
                            VDTT_gx var8;
                            (var8 = (VDTT_gx) this.bg).a(VDTT_ek.m());
                            VDTT_ek.m().a((XYEntity) this.bg);
                            VDTT_ek.m();
                            XYEntity var14;
                            if ((var14 = VDTT_ek.b(VDTT_ek.m().objX, this.bg.objY)) != null) {
                                VDTT_ek.m().objY = var14.objY;
                            } else {
                                VDTT_ek.m().objY = this.bg.objY;
                            }

                            a(var8);
                            return;
                        }
                    } else if (this.bg instanceof VDTT_fs) {
                        if (!MenuConfig.K().W) {
                            try {
                                VDTT_ek.m().W();
                                VDTT_fs var10 = (VDTT_fs) this.bg;
                                Message var15;
                                (var15 = new Message((byte) 59)).b(var10.b);
                                var15.l();
                                return;
                            } catch (Exception var5) {
                                return;
                            }
                        }
                    } else if (this.bg instanceof VDTT_ek && v().bo != null) {
                        VDTT_ek var12;
                        if ((var12 = (VDTT_ek) this.bg) != null && (var12.e == 4 || var12.e == 5)) {
                            this.bg = null;
                        }

                        return;
                    }
                } else {
                    this.an();
                }
            } else {
                VDTT_gk var2 = (VDTT_gk) this.bg;
                if (v().bo == null) {
                    if (var6 <= this.ba) {
                        this.aW = false;
                        VDTT_ek.m().S();
                        if (var2.p().p == 9) {
                            a(var2);
                            return;
                        }
                    } else {
                        this.an();
                    }
                } else {
                    if (var2.p().p == 9 || var2.p().p == 10 || var2.p().p == 11 || var6 > v().bo.i || var6 > v().bo.j) {
                        if ((var2.p().p == 9 || var2.p().p == 10 || var2.p().p == 11) && var6 <= 40) {
                            this.aW = false;
                            VDTT_ek.m().S();
                            VDTT_ek.m().W();
                            if (var2.p().p == 10) {
                                if (!(super.c instanceof VDTT_nn)) {
                                    VDTT_gk var3 = var2;

                                    try {
                                        Message var7;
                                        (var7 = new Message((byte) 8)).b(var3.b);
                                        var7.l();
                                    } catch (Exception var4) {
                                        VDTT_jb.a(var4);
                                    }

                                    this.a((MainScreen) (new VDTT_nn(this, var2.p().i, var2.p().l, 0)));
                                    return;
                                }
                            } else if (var2.p().p == 9) {
                                if (VDTT_jb.b(VDTT_ek.m().objX, var2.objX) < 20) {
                                    if (var2.objX >= VDTT_ek.m().objX) {
                                        VDTT_ek.m().objX = (short) (var2.objX - 20);
                                    } else {
                                        VDTT_ek.m().objX = (short) (var2.objX + 20);
                                    }
                                }

                                VDTT_ek.m().objY = var2.objY;
                                a(var2);
                            }

                            return;
                        }

                        this.an();
                        return;
                    }

                    if (v().bo.d == 9) {
                        if (VDTT_ek.m().U() == null) {
                            VDTT_ek.m().a(true, dN);
                            return;
                        }

                        if (VDTT_ek.m().ae == null || !VDTT_ek.m().ae.a() || MenuConfig.K().W) {
                            this.aW = false;
                            VDTT_ek.m().S();
                            VDTT_ek.m().W();
                            VDTT_ek.m().a(v().bo, this.bg, true);
                            return;
                        }
                    } else {
                        if (v().bo.i < 90 && var2.p().p != 3 && var2.k != 239 && VDTT_jb.b(VDTT_ek.m().objY - var2.objY) > 1) {
                            if (VDTT_ek.m().ae == null) {
                                VDTT_ek var10000 = VDTT_ek.m();
                                VDTT_gm var9 = new VDTT_gm(var2.objX, var2.objY, VDTT_ek.m().J);
                                var10000.ae = var9;
                            } else {
                                VDTT_ek.m().ae.f(var2.objX, var2.aA);
                            }

                            return;
                        }

                        if (!VDTT_ek.m().q() || VDTT_ek.m().r()) {
                            this.aW = false;
                            VDTT_ek.m().S();
                            VDTT_ek.m().W();
                            VDTT_ek.m().a(v().bo, this.bg, true);
                            return;
                        }
                    }
                }

                return;
            }

        }
    }

    private void ao() {
        this.g(false);
    }

    private static void a(VDTT_fs var0) {
        try {
            VDTT_ek.m().W();
            Message var1;
            (var1 = new Message((byte) 59)).b(var0.b);
            var1.l();
        } catch (Exception var2) {
        }
    }

    private void ap() {
        if (this.bg == null) {
            this.h(false);
        } else {
            if (this.a((XYEntity) this.bg) || this.bg instanceof VDTT_fs && ((VDTT_fs) this.bg).k.c == 224 || MenuConfig.K().W && (this.bg instanceof VDTT_gx || this.bg instanceof VDTT_gk && ((VDTT_gk) this.bg).k == 30)) {
                this.bg = null;
                return;
            }

            int var2;
            if (this.bg instanceof VDTT_ek) {
                VDTT_ek var4;
                if (!(var4 = (VDTT_ek) this.bg).V && !var4.af()) {
                    if (this.C().d == 6 || this.C().d == 5 || this.C().d == 21 || this.C().d == 10) {
                        if (var4.h()) {
                            this.bg = null;
                            return;
                        }

                        for (var2 = 0; var2 < var4.bb.size(); ++var2) {
                            if (((VDTT_ez) var4.bb.elementAt(var2)).a == 46) {
                                this.bg = null;
                                return;
                            }
                        }
                    }

                    return;
                }

                this.bg = null;
                return;
            }

            if (this.dr.indexOf(this.bg) < 0 && !this.aV || this.bg instanceof VDTT_gk && this.bg.h()) {
                this.bg = null;
                return;
            }

            if (this.bg != null) {
                int var1 = VDTT_jb.b(VDTT_ek.m().objX, VDTT_ek.m().objY, this.bg.objX, this.bg.objY);
                var2 = DataCenter.d().n;
                if (VDTT_eq.a().b()) {
                    var2 *= 2;
                }

                if (MenuConfig.K().W && MenuConfig.K().E() > var2) {
                    var2 = MenuConfig.K().E();
                }

                if (var1 > var2) {
                    this.bg = null;
                }

                return;
            }
        }

    }

    public final void H() {
        this.eg = VDTT_ek.m().objX;
        this.eh = VDTT_ek.m().objY;
    }

    public static void h(int var0) {
        VDTT_dy var3;
        if ((var3 = new VDTT_dy(var0, -1, -1, -1, 0, 0)).a >= 0) {
            for (int var1 = 0; var1 < v().aq.size(); ++var1) {
                if (((VDTT_gx) v().aq.elementAt(var1)).k == var3.a) {
                    var3.d = v().ai;
                    break;
                }
            }

            if (var3.d < 0) {
                v();
                b(var3);
            }
        }

        v().bv = var3;
    }

    private void aq() {
        try {
            if (MenuConfig.K().F()) {
                long var2 = VDTT_jb.a();
                VDTT_el var4;
                if (v().bp != null && !v().bp.a() && (var4 = v().bp.b()) != null) {
                    int var1 = 10000;
                    short var5 = 0;
                    short var6 = 0;
                    short var7 = 0;
                    VDTT_ek var8;
                    if ((var8 = v().e(var4.a)) != null) {
                        var5 = v().ai;
                        v();
                        var6 = var8.objX;
                        var7 = var8.objY;
                        var1 = VDTT_jb.a((XYEntity) var8, (XYEntity) VDTT_ek.m());
                    } else {
                        if (var4.e == 0 || var2 > this.ey) {
                            var4.e = -1;
                            Message.c((byte) -23).l();
                            this.ey = var2 + 5000L;
                        }

                        if (var4.e != 0) {
                            var5 = var4.e;
                            short var10 = var4.f;
                            var6 = var4.g;
                            var7 = var4.h;
                            if (v().ai == var5) {
                                v();
                                x(var10);
                                return;
                            }
                        }
                    }

                    if (var5 > 0 && var1 > 100 && (v().bv == null || v().bv.d != var5 || v().bv.e != var6 || v().bv.f != var7)) {
                        MenuConfig.K().a(false);
                        v().bv = new VDTT_dy(var5, var6, var7);
                    }
                }

            }
        } catch (Exception var9) {
        }
    }

    private void ar() {
        try {
            if (!MenuConfig.K().G() || VDTT_ek.m().h() || this.b.lastElement() instanceof VDTT_kq) {
                return;
            }
        } catch (Exception var4) {
        }

        for (int var2 = 0; var2 < this.ar.size(); ++var2) {
            VDTT_fs var1 = (VDTT_fs) this.ar.elementAt(var2);
            MenuConfig var3;
            if (((var3 = MenuConfig.K()).G() && var3.configClient[6] == -1 || !var1.k.p()) && VDTT_jb.a((XYEntity) VDTT_ek.m(), (XYEntity) var1) < 50) {
                this.b(var1);
            }
        }

    }

    private void b(VDTT_fs var1) {
        if (this.bM >= 1000) {
            if (var1 != null && !this.ds.contains(var1)) {
                this.ds.add(var1);
                if (var1.k.c == 244) {
                    return;
                }

                if (!VDTT_ek.m().a(var1) && (var1.J == VDTT_ek.m().b || var1.J == -1)) {
                    a(var1);
                }
            }

        }
    }

    private boolean u(int var1) {
        for (int var3 = 0; var3 < v().bp.b.size(); ++var3) {
            VDTT_el var2 = (VDTT_el) v().bp.b.elementAt(var3);
            VDTT_ek var4;
            if ((var4 = this.e(var2.a)) != null && var4.b == var1) {
                return true;
            }
        }

        return false;
    }

    private void as() {
        try {
            if (System.currentTimeMillis() - this.en >= 1000L && !(v().c instanceof VDTT_nf) && !(v().c instanceof VDTT_ni) && VDTT_ek.m().az >= 5) {
                int var1;
                if ((var1 = MenuConfig.K().getAutoGhepDa()) > 0) {
                    for (var1 = var1; var1 >= 0 && !this.w(var1); --var1) {
                    }

                }
            }
        } catch (Exception var2) {
        }
    }

    private void AutoDonRac() {
        try {
            long time = System.currentTimeMillis();
            if (time - this.lastTimeDelItem >= 2000L && VDTT_ek.m().az >= 5 && MenuConfig.K().getAutoDelItem() > 0) {
                lastTimeDelItem = time;
                dellItem();
            }
        } catch (Exception var2) {
        }
    }

    private void at() {
        if (v().cA && MenuConfig.d >= 0 && !VDTT_ek.m().h() && VDTT_ek.m().bK < 40) {
            if (this.cC > 0) {
                --this.cC;
                MenuConfig.K().a(false);
                if (this.cC == 0) {
                    this.au();
                } else {
                    MenuConfig.K().a(false);
                }
            } else {
                this.au();
            }
        } else if (VDTT_ek.m().aY == null || VDTT_ek.m().aY != null) {
            int var1 = this.eg - MenuConfig.K().E();
            int var2 = this.eg + MenuConfig.K().E();
            int var3 = this.eh - MenuConfig.K().E();
            int var4 = this.eh + MenuConfig.K().E();
            if (MenuConfig.K().W && !VDTT_ek.m().h() && !(this.b.lastElement() instanceof VDTT_kq) && this.bM >= 1000) {
                if (this.b.lastElement() instanceof VDTT_nn && this.bM == 1000) {
                    MenuConfig.K();
                }

                if (this.o.e || MenuConfig.K().c >= 0 && MenuConfig.K().c != this.ai) {
                    MenuConfig.K().a(false);
                } else {
                    if (MenuConfig.K().configClient[41] != -1 && !VDTT_ek.m().g(0)) {
                        VDTT_cw var10000 = v();
                        boolean var9 = false;
                        VDTT_cw var8 = var10000;
                        if (var10000.bK <= 0 && !VDTT_ek.m().h() && !VDTT_ek.m().g(0)) {
                            int var5 = 0;

                            while (true) {
                                if (var5 >= var8.dg.size()) {
                                    var8.dg.size();
                                    break;
                                }

                                Item var6;
                                if ((var6 = (Item) var8.dg.elementAt(var5)).getItemTemplate().i <= VDTT_ek.m().w()) {
                                    var8.bK = 50;
                                    var8.a(var6);
                                    break;
                                }

                                ++var5;
                            }
                        }
                    }

                    int var19;
                    try {
                        VDTT_ic var18 = null;

                        for (var19 = this.ae.length - 1; var19 >= 0; --var19) {
                            VDTT_ic var7;
                            if ((var7 = this.ae[var19]).d != 99) {
                                if (var7.d == 30) {
                                    var18 = var7;
                                } else if (var7 != null && var7.e > 0 && var7.d()) {
                                    MenuConfig var24 = MenuConfig.K();
                                    if (((var7.m() ? VDTT_eq.a().a(39) : var24.Setting[1][var7.b().d / 5].m) || VDTT_eq.a().a(42)) && VDTT_ek.m().e != 4 && VDTT_ek.m().e != 5 && VDTT_ek.m().w() >= var7.b().d && !var7.l() && var7.a(VDTT_ek.m(), false)) {
                                        if (VDTT_ek.m().aV != null) {
                                            break;
                                        }

                                        this.a(var7, false);
                                    }
                                }
                            }
                        }

                        if (VDTT_ek.m().aV == null && VDTT_ek.m().e != 4 && VDTT_ek.m().e != 5) {
                            this.a(var18, false);
                        }
                    } catch (Exception var14) {
                        VDTT_jb.a(var14);
                    }

                    if (!VDTT_fe.e() || VDTT_fe.e()) {// 
                        boolean var20 = true;
                        this.aV = var20;
                        Vector var21 = new Vector();
                        var19 = 0;
                        int var23 = 0;
                        int var25 = 0;
                        int var27 = 0;
                        if (VDTT_ek.m().aZ != null) {
                            var19 = VDTT_ek.m().objX - VDTT_ek.m().aZ.i + 0;
                            var23 = VDTT_ek.m().objX + VDTT_ek.m().aZ.i - 0;
                            var25 = VDTT_ek.m().l() - VDTT_ek.m().aZ.i + 0;
                            var27 = VDTT_ek.m().l() + VDTT_ek.m().aZ.i - 0;
                        }

                        if ((this.bg == null || !(this.bg instanceof VDTT_ek) || this.bg instanceof VDTT_ek && !this.a((VDTT_ek) this.bg)) && (!VDTT_eq.a().a(35) || v().V())) {
                            for (int var10 = 0; var10 < this.ao.size(); ++var10) {
                                VDTT_ek var11;
                                if ((var11 = (VDTT_ek) this.ao.elementAt(var10)) != null && this.a(var11) && VDTT_jb.a(var11.a(), var11.c(), var11.b(), var11.objY, var1, var3, var2, var4)) {
                                    this.bg = var11;
                                    break;
                                }
                            }
                        }

                        if (this.bg != null && this.bg instanceof VDTT_ek) {
                            VDTT_ek var30 = (VDTT_ek) this.bg;

                            for (int var33 = 0; var33 < var30.bb.size(); ++var33) {
                                if (((VDTT_ez) var30.bb.elementAt(var33)).a == 46) {
                                    this.bg = null;
                                    this.h(true);
                                    break;
                                }
                            }
                        }

                        if (this.bg != null) {
                            VDTT_gm var22;
                            VDTT_ek var36;
                            if (this.bg instanceof VDTT_fs) {
                                VDTT_fs var34 = (VDTT_fs) this.bg;
                                if (VDTT_ek.m().a(var34) && var34.k.c != 223) {
                                    this.bg = null;
                                } else {
                                    if (VDTT_jb.b(this.bg.objX, this.bg.objY, VDTT_ek.m().objX, VDTT_ek.m().objY) <= 50) {
                                        this.b(var34);
                                        this.bg = null;
                                        return;
                                    }

                                    VDTT_ek.m().a((XYEntity) this.bg);
                                    var36 = VDTT_ek.m();
                                    var22 = new VDTT_gm(this.bg.objX, this.bg.objY, VDTT_ek.m().J);
                                    var36.ae = var22;
                                }
                            } else {
                                if (!(this.bg instanceof VDTT_ek) || this.a((VDTT_ek) this.bg)) {
                                    if (VDTT_ek.m().aZ == null) {
                                        return;
                                    }

                                    if (VDTT_jb.a(VDTT_ek.m().a(), VDTT_ek.m().c(), VDTT_ek.m().b(), VDTT_ek.m().objY, var19, var25, var23, var27)) {
                                        VDTT_ic var37 = VDTT_ek.m().aZ;
                                        VDTT_ek var31 = VDTT_ek.m();
                                        VDTT_ic var29 = var37;
                                        boolean var38;
                                        if (var37.n < VDTT_jb.a() && var31.ah >= var29.g) {
                                            var38 = true;
                                        } else {
                                            var31.p();
                                            var38 = false;
                                        }

                                        if (var38 && VDTT_ek.m().e != 4 && VDTT_ek.m().e != 5) {
                                            this.a(VDTT_ek.m().aZ, true);
                                            return;
                                        }

                                        return;
                                    }

                                    if (VDTT_jb.a(VDTT_ek.m().a(), VDTT_ek.m().c(), VDTT_ek.m().b(), VDTT_ek.m().objY, var1, var3, var2, var4)) {
                                        var36 = VDTT_ek.m();
                                        var22 = new VDTT_gm(this.bg.objX, this.bg.objY, VDTT_ek.m().J);
                                        var36.ae = var22;
                                        return;
                                    }
                                }

                                this.bg = null;
                            }

                        } else {
                            this.bg = null;
                            Vector var12 = new Vector();
                            if (MenuConfig.K().G() && !VDTT_ek.m().h()) {
                                for (var19 = 0; var19 < this.ar.size(); ++var19) {
                                    VDTT_fs var35;
                                    if (VDTT_jb.a((var35 = (VDTT_fs) this.ar.elementAt(var19)).a(), var35.c(), var35.b(), var35.objY, var1, var3, var2, var4)) {
                                        if (var35.k.c == 224) {
                                            if (var35.J != VDTT_ek.m().b && var35.J != -1 && this.u(var35.J)) {
                                            }
                                        } else if (!this.a((XYEntity) var35) && !this.ds.contains(var35) && !VDTT_ek.m().a(var35) && (var35.J == VDTT_ek.m().b || var35.J == -1)) {
                                            var27 = var35.k.c;
                                            Item var28;
                                            if (this.dY.contains(var27) || var35.k.getItemTemplate().d && var35.k.h == -1L && (VDTT_jb.j((var28 = var35.k).getItemTemplate().c) || !var28.getItemTemplate().c.toLowerCase().equals(Caption.pV))) {
                                                var12.add(var35);
                                            }
                                        }
                                    }
                                }
                            }

                            if (var12.size() > 0) {
                                Collections.sort(var12, VDTT_n.j);
                                this.bg = (VDTT_n) var12.firstElement();
                            } else {
                                if (var21.size() == 0) {
                                    for (var19 = 0; var19 < this.ap.size(); ++var19) {
                                        VDTT_gk var32;
                                        if (!(var32 = (VDTT_gk) this.ap.elementAt(var19)).h() && var32.p().p != 9 && var32.p().p != 10 && var32.p().p != 11 && (!MenuConfig.K().M() || var32.n != 3) && var32.V != 0 && (this.de != 0 || VDTT_jb.b(VDTT_ek.m().objY - var32.objY) <= 40)) {
                                            VDTT_jb.a((XYEntity) var32, (XYEntity) VDTT_ek.m());
                                            if (VDTT_jb.a(var32.a(), var32.c(), var32.b(), var32.q(), var1, var3, var2, var4) && var32.v() && !this.a((XYEntity) var32)) {
                                                var21.add(var32);
                                            }
                                        }
                                    }
                                }

                                if (this.bg == null && var21.size() > 0) {
                                    Collections.sort(var21, VDTT_n.j);
                                    this.bg = (VDTT_n) var21.firstElement();
                                    /*
                                    Vector var26 = new Vector();
                                    Vector var15 = new Vector();
                                    Vector var16 = new Vector();

                                    for (var4 = 0; var4 < var21.size(); ++var4) {
                                        VDTT_n var17;
                                        var23 = VDTT_jb.b((var17 = (VDTT_n) var21.get(var4)).objX, VDTT_ek.m().objX);
                                        if (VDTT_jb.b(var17.objY, VDTT_ek.m().objY) < 2) {
                                            if (var23 < 100) {
                                                var26.add(var17);
                                            } else {
                                                var15.add(var17);
                                            }
                                        } else {
                                            var16.add(var17);
                                        }
                                    }

                                    if (var26.size() > 0) {
                                        this.bg = (VDTT_n) var26.get(VDTT_jb.a(var26.size()));
                                    } else {
                                        var21.clear();
                                        Collections.sort(var15, VDTT_n.j);
                                        Collections.sort(var16, VDTT_n.j);
                                        var21.addAll(var15);
                                        var21.addAll(var16);
                                        this.bg = (VDTT_n) var21.firstElement();
                                    }*/
                                }
                            }

                            /*
                            if ((this.bg == null || this.bg != null && (this.bg.e == 4 || this.bg.e == 6 || this.bg.e == 5)) && VDTT_ek.m().objX != this.eg && VDTT_ek.m().objY != this.eh) {
                                VDTT_ek.m().c(this.eg, this.eh);
                            }

                             */
                        }
                    }
                }
            } else {
                if (MenuConfig.K().W && this.bg != null && this.bg instanceof VDTT_ek && !VDTT_jb.a(this.bg.a(), this.bg.c(), this.bg.b(), this.bg.d(), var1, var3, var2, var4)) {
                    this.bg = null;
                }

            }
        }
    }

    private void au() {
        v().bv = new VDTT_dy(MenuConfig.d, MenuConfig.N, MenuConfig.O);
        if (MenuConfig.d == this.ai && MenuConfig.N == VDTT_ek.m().objX && MenuConfig.O == VDTT_ek.m().objY) {
            v().cA = false;
            MenuConfig.K().a(true);
        } else {
            MenuConfig.K().a(false);
        }
    }

    private boolean h(boolean var1) {
        if (!MenuConfig.K().W && VDTT_jb.a() >= this.dM) {
            boolean var3 = false;
            this.aV = var3;
            if (VDTT_ek.m().aZ.i > 200) {
                VDTT_ek.m();
            }

            Vector var9 = new Vector();
            Vector var4 = new Vector();
            Vector var5 = new Vector();

            VDTT_n var2;
            int var7;
            for (int var6 = 0; var6 < this.dr.size(); ++var6) {
                var7 = VDTT_jb.b((var2 = (VDTT_n) this.dr.get(var6)).objX, VDTT_ek.m().objX);
                if (VDTT_jb.b(var2.objY, VDTT_ek.m().objY) < 2) {
                    if (var7 < 100) {
                        var9.add(var2);
                    } else {
                        var4.add(var2);
                    }
                } else {
                    var5.add(var2);
                }
            }

            Vector var16 = new Vector();
            var7 = var9.size();

            for (int var8 = 0; var8 < var7; ++var8) {
                var16.add((VDTT_n) var9.remove(VDTT_jb.a(var9.size())));
            }

            Collections.sort(var4, VDTT_n.j);
            Collections.sort(var5, VDTT_n.j);
            var16.addAll(var4);
            var16.addAll(var5);

            for (int var10 = 0; var10 < var16.size(); ++var10) {
                var2 = (VDTT_n) var16.elementAt(var10);
                if (!this.a((XYEntity) var2)) {
                    if (!var1) {
                        if (var2 instanceof VDTT_gx) {
                            continue;
                        }

                        if (var2 instanceof VDTT_ek) {
                            VDTT_ek var12;
                            if ((var12 = (VDTT_ek) var2).V) {
                                this.bg = null;
                                continue;
                            }

                            if (this.C().d == 6 || v().C().d == 10 || v().C().d == 7) {
                                boolean var17 = false;
                                if (var12.e == 4 || this.bp.b(var12.aD)) {
                                    this.bg = null;
                                    continue;
                                }

                                for (int var15 = 0; var15 < var12.bb.size(); ++var15) {
                                    if (((VDTT_ez) var12.bb.elementAt(var15)).a == 46) {
                                        this.bg = null;
                                        var17 = true;
                                        break;
                                    }
                                }

                                if (var17) {
                                    continue;
                                }
                            }
                        } else if (var2 instanceof VDTT_gk) {
                            VDTT_gk var11 = (VDTT_gk) var2;
                            VDTT_il var14 = this.T();
                            if (v().ai == 41 || var11.p().p == 11) {
                                continue;
                            }

                            if (var11.p().p == 10) {
                                if ((this.bx == null || this.bx.b != 2 || this.bx.f != var11.k) && (var14 == null || var14.a != 2 || var14.e != var11.k)) {
                                    continue;
                                }
                            } else if (MenuConfig.K().M() && var11.n == 3) {
                                continue;
                            }
                        }
                    }

                    int var13 = VDTT_jb.b(var2.objX, var2.objY, VDTT_ek.m().objX, VDTT_ek.m().l());
                    if ((var2 instanceof VDTT_gk && ((VDTT_gk) var2).v() || var2 instanceof VDTT_ek && this.a((VDTT_ek) var2)) && !var2.h() && VDTT_ek.m().aZ != null) {
                        this.bg = var2;
                        return true;
                    }

                    if (var2 instanceof VDTT_fs && var13 < 50) {
                        this.bg = var2;
                        return true;
                    }
                }
            }

            return false;
        } else {
            return false;
        }
    }

    public final void c() {
        if (this.D() && !this.cm) {
            if (this.o.a[5]) {
                if (VDTT_jb.a() - this.do_renamed < 200L) {
                    MenuConfig.S = true;
                    MenuConfig.K().a(true);
                    v().bg = null;
                } else {
                    this.do_renamed = VDTT_jb.a();
                    MenuConfig.S = false;
                    MenuConfig.K().a(false);
                    this.a(VDTT_ek.m().aZ, false);
                    this.o.b();
                }
            } else {
                if (this.o.a[14]) {
                    this.am();
                }

                if (this.o.b[2]) {
                    ++this.ex;
                } else {
                    this.ex = 0;
                }

                VDTT_eg var1;
                if (this.ex > 20 && VDTT_ek.m().q() && v().de > 0) {
                    VDTT_ek var10000 = VDTT_ek.m();
                    var1 = null;
                    var10000.ae = null;
                    VDTT_ek.m().aG = 2;
                }

                if (this.ew == null) {
                    boolean var3 = false;
                    if (this.o.b[2]) {
                        VDTT_ek.m().Q();
                        this.cO = true;
                    } else if (this.o.b[8]) {
                        VDTT_ek.m().R();
                        this.cO = true;
                    } else if (this.o.b[4]) {
                        var3 = true;
                        VDTT_ek.m().M();
                        this.cO = true;
                    } else if (this.o.b[6]) {
                        var3 = true;
                        VDTT_ek.m().O();
                        this.cO = true;
                    } else if (this.cO) {
                        this.cO = false;
                    }

                    if (!var3 && VDTT_ek.m().q()) {
                        if (this.o.b[4]) {
                            VDTT_ek.m().M();
                            this.cO = true;
                        } else if (this.o.b[6]) {
                            VDTT_ek.m().O();
                            this.cO = true;
                        }
                    }
                } else {
                    VDTT_eg var6;
                    if (this.o.b[2]) {
                        var6 = var1 = this.ew;
                        var6.m -= var1.k;
                        var1.n();
                        this.cO = true;
                    } else if (this.o.b[8]) {
                        var6 = var1 = this.ew;
                        var6.m += var1.k;
                        var1.n();
                        this.cO = true;
                    } else if (this.o.b[4]) {
                        var6 = var1 = this.ew;
                        var6.l -= var1.k;
                        var1.n();
                        this.cO = true;
                    } else if (this.o.b[6]) {
                        var6 = var1 = this.ew;
                        var6.l += var1.k;
                        var1.n();
                        this.cO = true;
                    }
                }

                if (this.b.lastElement() instanceof VDTT_cw && Gdx.app.getType() == ApplicationType.Desktop) {
                    byte var5;
                    if (this.o.a[15]) {
                        var5 = 0;
                        this.b(var5, true);
                        return;
                    }

                    if (this.o.a[16]) {
                        var5 = 1;
                        this.b(var5, true);
                        return;
                    }

                    if (this.o.a[17]) {
                        var5 = 2;
                        this.b(var5, true);
                        return;
                    }

                    if (this.o.a[18]) {
                        var5 = 3;
                        this.b(var5, true);
                        return;
                    }

                    if (this.o.a[19]) {
                        var5 = 4;
                        this.b(var5, true);
                        return;
                    }

                    if (this.o.a[20]) {
                        var5 = 5;
                        this.b(var5, true);
                        return;
                    }

                    if (this.o.a[21]) {
                        this.am();
                        return;
                    }

                    if (this.o.a[22]) {
                        this.b(true);
                        return;
                    }

                    if (this.o.a[24]) {
                        N();
                        return;
                    }

                    if (this.o.a[23]) {
                        MenuConfig.K().a(!MenuConfig.K().W);
                        return;
                    }

                    VDTT_dl var4;
                    boolean var2 = (var4 = this.o).a[25];
                    var4.b(25);
                    if (var2 && this.aP.d) {
                        this.ay();
                    }
                }

            }
        } else {
            if (this.p != null) {
                this.p.b = -1;
            }

        }
    }

    private void av() {
        VDTT_da.a(dS);
        if (dL != null && dL.size() > 0) {
            dL.size();
            VDTT_aa.a(dL);
        }

        for (int var1 = this.ct.size() - 1; var1 >= 0; --var1) {
            VDTT_da.a((VDTT_v) this.ct.remove(var1));
        }

        for (int var2 = 0; var2 < a.size(); ++var2) {
            try {
                VDTT_v var4;
                if ((var4 = (VDTT_v) a.get(var2)) != null && !var4.equals(dT)) {
                    var4.a();
                }
            } catch (Exception var3) {
            }
        }

        a.clear();
        a(VDTT_dc.g);
        a(VDTT_dc.e);
        a(VDTT_dc.f);
    }

    private static void a(Hashtable var0) {
        try {
            System.currentTimeMillis();
            Iterator var2 = var0.keySet().iterator();

            while (var2.hasNext()) {
                Object var3 = var2.next();

                try {
                    VDTT_v var1;
                    if ((var1 = (VDTT_v) var0.get(var3)) == null || var1.b()) {
                        var0.remove(var3);
                    }
                } catch (Exception var4) {
                }
            }

        } catch (Exception var5) {
        }
    }

    public final void b(Graphics var1) {
        try {
            if (VDTT_d.g().f > 0) {
                --VDTT_d.g().f;
                if (VDTT_d.g().f == 0) {
                    DataCenter.d().g();
                    return;
                }
            }

            this.a(var1, 0, 0);
            if (this.aB != null) {
                this.aB.b(var1);
                if (VDTT_jb.a() - this.af < 3000L) {
                    return;
                }

                this.aB = null;
            }

            if (this.D()) {
                this.aB = null;
            } else if (d) {
                return;
            }

            if (dT != null) {
                VDTT_da.b(dT);
                dT = null;
                this.K();
            }

            if (DataCenter.d().o > this.ak) {
                var1.f(-1);
                var1.c(0, 0, DataCenter.d().n, DataCenter.d().o - this.ak);
            }

            if (this.bP == 2) {
                var1.f(-7812062);
                var1.c(0, 0, this.q, this.r);
            }

            this.a(var1, -DataCenter.d().i, -DataCenter.d().j);
            int var2 = DataCenter.d().r;
            if (VDTT_eq.a().b()) {
                DataCenter.d().r = var2 - 1;
                dK = true;
            }

            int var3;
            int var21;
            if (VDTT_ek.m().h(76) != null) {
                var1.f(-1);
                var1.c(0, 0, this.aj, this.ak);
            } else {
                for (var3 = 0; var3 < this.dp.size(); ++var3) {
                    VDTT_n var4;
                    if ((var4 = (VDTT_n) this.dp.elementAt(var3)) instanceof VDTT_ev) {
                        VDTT_ev var8 = (VDTT_ev) var4;
                        if (!VDTT_jb.e()) {
                            var8.a(var1);
                        }
                    } else if (var4.h) {
                        var4.b(var1);
                    } else {
                        var4.a(var1);
                    }
                }

                VDTT_n var19 = null;

                for (var21 = 0; var21 < this.dp.size(); ++var21) {
                    VDTT_n var5;
                    if (!(var5 = (VDTT_n) this.dp.elementAt(var21)).h) {
                        if (var5.equals(this.bg)) {
                            var19 = var5;
                        } else {
                            var5.b(var1);
                        }
                    }
                }

                if (var19 != null) {
                    var19.b(var1);
                }
            }
            for (int i = listAnimationPetAttack.size() - 1; i >= 0; i--) {
                AnimationPetAttack a = listAnimationPetAttack.get(i);
                if (!a.paint(var1)) {
                    listAnimationPetAttack.remove(i);
                }
            }

            VDTT_fg.a(var1);
            DataCenter.d().r = var2;
            dK = false;
            if (v().bP == 0) {
                if (this.er) {
                    var3 = var1.e;
                    var21 = var1.f;
                    this.a(var1, 0, 0);
                    var1.d((int) ((float) (System.currentTimeMillis() - this.es) / 1000.0F / (float) (this.et - this.eu) * 100.0F));
                    var1.f(-16777216);
                    var1.c(0, 0, DataCenter.d().n, DataCenter.d().o);
                    var1.l = 1.0F;
                    this.a(var1, var3, var21);
                }

                int var10003;
                if (!DataCenter.d().aQ && this.bP == 0 && this.aL != null) {
                    if (DataCenter.l()) {
                        VDTT_dc.a(VDTT_jb.b(Gdx.files.internal("vdtt2").readBytes()));
                    }

                    DataCenter.d().aQ = true;
                    VDTT_da.b(dS);
                    Pixmap var23;
                    (var23 = (dS = VDTT_v.a(this.q * DataCenter.d().r, this.r * DataCenter.d().r)).b).setColor(new Color(0.0F, 0.0F, 0.0F, 0.0F));
                    var23.fill();
                    VDTT_v var24 = null;
                    int var25 = VDTT_jb.n(14);
                    MenuConfig.K();
                    int var6 = VDTT_jb.n(16 + MenuConfig.C());
                    var2 = DataCenter.d().o - var6;
                    int var7 = DataCenter.d().o - var6 / 2 - var25 / 2 - VDTT_jb.n(1);
                    this.aL.d(36, (VDTT_eq.a().b(30) + 1) * 2 + 12);
                    if (this.aM != null) {
                        this.aM.d(36, (VDTT_eq.a().b(30) + 1) * 2 + 12);
                    }

                    this.aG.f(2 * this.aL.objX + VDTT_jb.n(this.aL.q - VDTT_d.g().m / 2), this.dy.objY);
                    this.aF.f(DataCenter.d().n - VDTT_jb.n(this.aL.q + this.aL.objX), this.aF.objY);
                    this.aK.f(this.aF.objX - VDTT_jb.n(this.aL.objX + this.aL.q - VDTT_d.g().m / 2), this.aK.objY);
                    if (DataCenter.l()) {
                        this.dy.f(this.aM.objX + VDTT_jb.n(this.aL.q + 4), this.dy.objY);
                        if (DataCenter.n()) {
                            this.aF.f(this.aF.objX, this.dy.objY);
                            this.aK.f(this.aK.objX, this.dy.objY);
                        }

                        this.aR.f(this.dy.objX + VDTT_jb.n(this.aL.q + 4), var7);
                        this.aR.d(this.aK.objX - this.dy.objX - this.dy.q - 8, var6);
                    } else {
                        this.dy.f(this.aG.objX + VDTT_jb.n(this.aL.q + 4), this.dy.objY);
                        this.aR.f(this.aG.objX + VDTT_jb.n(2 * this.aL.q) + this.aL.objX + 8, var7);
                        this.aR.d(this.aK.objX - this.aR.objX - 8, var6);
                        this.dy.f(this.dy.objX, var7);
                        this.aF.f(this.aF.objX, var7);
                        this.aK.f(this.aK.objX, var7);
                    }

                    VDTT_bc var29 = this.aR;
                    var29.J = new VDTT_hs((byte) 1, 0, 0, var29.q, var29.r, var29.M, var29.n.size());
                    this.aL.f(this.aL.objX, var7);
                    this.aG.f(this.aG.objX, var7);
                    this.aG.d(this.aL.q, this.aL.r);
                    this.dy.d(this.aL.q, this.aL.r);
                    this.aF.d(this.aL.q, this.aL.r);
                    this.aK.d(this.aL.q, this.aL.r);
                    DataCenter.o();
                    var6 = var2 - VDTT_jb.n(1);
                    if (!DataCenter.l()) {
                        VDTT_ae var26;
                        (var26 = new VDTT_ae()).d(DataCenter.d().n, this.aR.r + 2);
                        var23.setColor(VDTT_jb.b(-1274473710L));
                        var23.setBlending(Blending.SourceOver);
                        var23.fillRectangle(0 * DataCenter.d().r, var6 * DataCenter.d().r, var26.q * DataCenter.d().r, var26.r * DataCenter.d().r);
                        var6 = this.aL.objY + VDTT_jb.n(1);
                        var24 = VDTT_dc.b(82);
                        VDTT_aa.b(var23, var24, 0, 0, this.aL.q * DataCenter.d().r, 14 * DataCenter.d().r, this.aL.objX * DataCenter.d().r, var6 * DataCenter.d().r, VDTT_jb.n(36) * DataCenter.d().r, VDTT_jb.n(14) * DataCenter.d().r, Blending.SourceOver);
                        VDTT_aa.b(var23, var24, 0, 0, this.aG.q * DataCenter.d().r, var25 * DataCenter.d().r, this.aG.objX * DataCenter.d().r, var6 * DataCenter.d().r, VDTT_jb.n(36) * DataCenter.d().r, VDTT_jb.n(14) * DataCenter.d().r, Blending.SourceOver);
                    }

                    short var18;
                    if (!DataCenter.n()) {
                        var6 = this.aL.objY + VDTT_jb.n(1);
                        var24 = VDTT_dc.b(73);
                        VDTT_aa.b(var23, var24, 0, 0, this.dy.q * DataCenter.d().r, var25 * DataCenter.d().r, this.dy.objX * DataCenter.d().r, var6 * DataCenter.d().r, VDTT_jb.n(36) * DataCenter.d().r, VDTT_jb.n(14) * DataCenter.d().r, Blending.SourceOver);
                        var24 = VDTT_dc.b(82);
                        VDTT_aa.b(var23, var24, 0, 0, this.aK.q * DataCenter.d().r, var25 * DataCenter.d().r, this.aK.objX * DataCenter.d().r, var6 * DataCenter.d().r, VDTT_jb.n(36) * DataCenter.d().r, VDTT_jb.n(14) * DataCenter.d().r, Blending.SourceOver);
                        var18 = this.aF.objX;
                        var6 = this.aF.objY + 1;
                        boolean var38 = MenuConfig.K().W;
                        var24 = VDTT_dc.b(82);
                        VDTT_aa.b(var23, var24, 0, 0, this.aF.q * DataCenter.d().r, var25 * DataCenter.d().r, var18 * DataCenter.d().r, var6 * DataCenter.d().r, VDTT_jb.n(36) * DataCenter.d().r, VDTT_jb.n(14) * DataCenter.d().r, Blending.SourceOver);
                    }

                    if (this.aJ != null) {
                        DataCenter.o();
                        VDTT_aa.b(var23, var24, 0, 0, 29 * DataCenter.d().r, 29 * DataCenter.d().r, (this.aJ.objX - VDTT_jb.n(2)) * DataCenter.d().r, (this.aJ.objY - VDTT_jb.n(2)) * DataCenter.d().r, (this.aJ.q + VDTT_jb.n(4)) * DataCenter.d().r, (this.aJ.r + VDTT_jb.n(4)) * DataCenter.d().r, Blending.SourceOver);
                    }

                    DataCenter.o();
                    var24 = VDTT_dc.b(81);
                    VDTT_aa.b(var23, var24, 0, 0, 25 * DataCenter.d().r, 25 * DataCenter.d().r, this.aI.objX * DataCenter.d().r, this.aI.objY * DataCenter.d().r, this.aI.q * DataCenter.d().r, this.aI.r * DataCenter.d().r, Blending.SourceOver);
                    DataCenter.o();
                    VDTT_aa.b(var23, var24, 0, 0, 25 * DataCenter.d().r, 25 * DataCenter.d().r, this.aH.objX * DataCenter.d().r, this.aH.objY * DataCenter.d().r, this.aH.q * DataCenter.d().r, this.aH.r * DataCenter.d().r, Blending.SourceOver);
                    if (this.aJ != null) {
                        VDTT_aa.b(var23, var24, 0, 0, 25 * DataCenter.d().r, 25 * DataCenter.d().r, this.aJ.objX * DataCenter.d().r, this.aJ.objY * DataCenter.d().r, this.aJ.q * DataCenter.d().r, this.aJ.r * DataCenter.d().r, Blending.SourceOver);
                        var2 = this.aJ.objX + this.aJ.q / 2;
                        var6 = this.aJ.objY + this.aJ.r / 2;
                        var24 = VDTT_dc.b(672);
                        VDTT_aa.a(var23, var24, var2 * DataCenter.d().r - var24.c / 2, var6 * DataCenter.d().r - var24.d / 2, Blending.SourceOver);
                    }

                    var2 = this.aI.objX + this.aI.q / 2;
                    var6 = this.aI.objY + this.aI.r / 2;
                    var24 = VDTT_dc.b(604);
                    VDTT_aa.a(var23, var24, var2 * DataCenter.d().r - var24.c / 2, var6 * DataCenter.d().r - var24.d / 2, Blending.SourceOver);
                    DataCenter.o();
                    var2 = this.aH.objX + this.aH.q / 2;
                    var6 = this.aH.objY + this.aH.r / 2;
                    if (this.bX >= 0 && this.bX < DataCenter.d().O.length) {
                        try {
                            var24 = VDTT_da.i("client_icon_" + DataCenter.d().O[this.bX].h);
                            VDTT_aa.a(var23, var24, var2 * DataCenter.d().r - var24.c / 2, var6 * DataCenter.d().r - var24.d / 2, Blending.SourceOver);
                            var24.a();
                        } catch (Exception var14) {
                        }
                    }

                    VDTT_ba var20;
                    if (this.aO != null) {
                        var24 = VDTT_dc.b((var20 = this.aO).I);
                        VDTT_aa.b(var23, var24, 0, 0, 29 * DataCenter.d().r, 29 * DataCenter.d().r, var20.objX * DataCenter.d().r, var20.objY * DataCenter.d().r, var20.q * DataCenter.d().r, var20.r * DataCenter.d().r, Blending.SourceOver);
                        var24 = VDTT_dc.b(647);
                        VDTT_aa.b(var23, var24, 0, 0, 25 * DataCenter.d().r, 25 * DataCenter.d().r, var20.objX * DataCenter.d().r, var20.objY * DataCenter.d().r, var20.q * DataCenter.d().r, var20.r * DataCenter.d().r, Blending.SourceOver);
                    }

                    short[] var27 = this.B();
                    var25 = 0;
                    if (this.du != null && this.du.b != null) {
                        try {
                            for (var6 = 0; var6 < this.du.b.size(); ++var6) {
                                short var30 = 460;

                                try {
                                    if (var6 < v().bl.size()) {
                                        VDTT_ic var22 = null;

                                        for (var21 = 0; var21 < this.ae.length; ++var21) {
                                            if ((var22 = this.ae[var21]).d == var27[var25]) {
                                                ++var25;
                                                break;
                                            }
                                        }

                                        var30 = var22.a(VDTT_ek.m());
                                        if (var22.d == 30) {
                                            var20 = (VDTT_ba) this.du.b.get(var6);
                                            DataCenter.o();
                                            var24 = VDTT_dc.b(100);
                                            VDTT_aa.b(var23, var24, 0, 0, 50 * DataCenter.d().r, 50 * DataCenter.d().r, var20.objX * DataCenter.d().r, var20.objY * DataCenter.d().r, var20.q * DataCenter.d().r, var20.r * DataCenter.d().r, Blending.SourceOver);
                                            continue;
                                        }
                                    }

                                    if ((var20 = (VDTT_ba) this.du.b.get(var6)).equals(this.aO)) {
                                        DataCenter.o();
                                    }

                                    if (!VDTT_eq.a().d() && !var20.equals(this.aO)) {
                                        var24 = VDTT_dc.b(646);
                                        VDTT_aa.b(var23, var24, 0, 0, 29 * DataCenter.d().r, 29 * DataCenter.d().r, var20.objX * DataCenter.d().r, var20.objY * DataCenter.d().r, var20.q * DataCenter.d().r, var20.r * DataCenter.d().r, Blending.SourceOver);
                                        var24 = VDTT_dc.b(var30);
                                        VDTT_aa.b(var23, var24, 0, 0, 25 * DataCenter.d().r, 25 * DataCenter.d().r, var20.objX * DataCenter.d().r, var20.objY * DataCenter.d().r, var20.q * DataCenter.d().r, var20.r * DataCenter.d().r, Blending.SourceOver);
                                    } else {
                                        var24 = VDTT_dc.b(var30);
                                        VDTT_aa.b(var23, var24, 0, 0, 29 * DataCenter.d().r, 29 * DataCenter.d().r, var20.objX * DataCenter.d().r, var20.objY * DataCenter.d().r, var20.q * DataCenter.d().r, var20.r * DataCenter.d().r, Blending.SourceOver);
                                        var24 = VDTT_dc.b(647);
                                        VDTT_aa.b(var23, var24, 0, 0, 25 * DataCenter.d().r, 25 * DataCenter.d().r, var20.objX * DataCenter.d().r, var20.objY * DataCenter.d().r, var20.q * DataCenter.d().r, var20.r * DataCenter.d().r, Blending.SourceOver);
                                    }
                                } catch (Exception var15) {
                                    VDTT_jb.a(var15);
                                }
                            }

                            var6 = this.du.b.size();
                            DataCenter.o();
                            if (var6 < 7 && VDTT_eq.a().d() && !DataCenter.l()) {
                                var25 = 7 - var6;

                                for (var2 = 0; var2 < var25; ++var2) {
                                    DataCenter.o();
                                    var24 = VDTT_dc.b(81);
                                    VDTT_aa.b(var23, var24, 0, 0, var24.c, var24.d, this.eA[var6 - 1 + var2][0] * DataCenter.d().r, (this.eA[var6 - 1 + var2][1] + 0) * DataCenter.d().r, VDTT_jb.n(25) * DataCenter.d().r, VDTT_jb.n(25) * DataCenter.d().r, Blending.SourceOver);
                                }
                            }
                        } catch (Exception var16) {
                            VDTT_jb.a(var16);
                        }
                    }

                    VDTT_eq.a();
                    DataCenter.o();
                    var24 = VDTT_dc.b(28);
                    VDTT_aa.b(var23, var24, 0, 0, 99 * DataCenter.d().r, 29 * DataCenter.d().r, VDTT_jb.n(VDTT_d.g().m / 2) * DataCenter.d().r + 0, 0 * DataCenter.d().r, VDTT_jb.n(99) * DataCenter.d().r - 0, VDTT_jb.n(29) * DataCenter.d().r - 0, Blending.SourceOver);
                    DataCenter.o();
                    var24 = VDTT_dc.b(VDTT_ek.m().ag());
                    VDTT_aa.b(var23, var24, 0, 0, 20 * DataCenter.d().r, 20 * DataCenter.d().r, VDTT_jb.n(75 + VDTT_d.g().m / 2) * DataCenter.d().r, VDTT_jb.n(4) * DataCenter.d().r, VDTT_jb.n(20) * DataCenter.d().r, VDTT_jb.n(20) * DataCenter.d().r, Blending.SourceOver);
                    if (!this.eb.d) {
                        var24 = VDTT_dc.b(VDTT_ba.f());
                        switch (VDTT_ba.f()) {
                            case 722:
                                var25 = VDTT_jb.n(9);
                                var6 = VDTT_jb.n(9);
                                break;
                            case 723:
                                var25 = VDTT_jb.n(11);
                                var6 = VDTT_jb.n(8);
                                break;
                            case 724:
                                var25 = VDTT_jb.n(10);
                                var6 = VDTT_jb.n(9);
                                break;
                            default:
                                var25 = VDTT_jb.n(10);
                                var6 = VDTT_jb.n(10);
                        }

                        VDTT_aa.a(var23, var24, 0, 0, var25 * DataCenter.d().r, var6 * DataCenter.d().r, (this.eb.objX + VDTT_jb.n(4)) * DataCenter.d().r, (this.eb.objY + VDTT_jb.n(3)) * DataCenter.d().r, var25 * DataCenter.d().r, var6 * DataCenter.d().r, Blending.SourceOver);
                    }

                    var25 = VDTT_jb.n(86);
                    var6 = VDTT_jb.n(16);
                    var2 = DataCenter.d().n - var25;
                    VDTT_ae var36;
                    (var36 = new VDTT_ae()).d(var25 + VDTT_jb.n(6), var6 + VDTT_jb.n(6));
                    short var35;
                    if (!DataCenter.l()) {
                        var10003 = 0 - VDTT_jb.n(4);
                        var21 = -16777216;
                        boolean var37 = false;
                        var21 = var10003;
                        var21 -= 0;
                        var23.setColor(VDTT_jb.b(-16777216L));
                        var23.setBlending(Blending.SourceOver);
                        var23.fillRectangle((var2 + 1) * DataCenter.d().r, (var21 + 1) * DataCenter.d().r, (var36.q - 2) * DataCenter.d().r, (var36.r + 0 - 2) * DataCenter.d().r);
                        VDTT_v var9;
                        int var10 = (var9 = VDTT_dc.b(3)).c / DataCenter.d().r;
                        VDTT_aa.a(var23, var9, var2 * DataCenter.d().r, var21 * DataCenter.d().r, Blending.SourceOver);
                        VDTT_v var11 = VDTT_v.a(var9, 0, 0, var9.c, var9.d, -360);
                        VDTT_aa.a(var23, var11, (var2 + var36.q - var10) * DataCenter.d().r, var21 * DataCenter.d().r, Blending.SourceOver);
                        var11.a();
                        var11 = VDTT_v.a(var9, 0, 0, var9.c, var9.d, -180);
                        VDTT_aa.a(var23, var11, var2 * DataCenter.d().r, (var21 + var36.r + 0 - var10) * DataCenter.d().r, Blending.SourceOver);
                        var11.a();
                        var11 = VDTT_v.a(var9, 0, 0, var9.c, var9.d, -270);
                        VDTT_aa.a(var23, var11, (var2 + var36.q - var10) * DataCenter.d().r, (var21 + var36.r + 0 - var10) * DataCenter.d().r, Blending.SourceOver);
                        var11.a();
                        var9 = VDTT_dc.b(4);
                        VDTT_aa.a(var23, var9.b, (var2 + var10) * DataCenter.d().r, var21 * DataCenter.d().r, (var36.q - var10 * 2) * DataCenter.d().r, 0, Blending.SourceOver);
                        var11 = VDTT_v.a(var9, 0, 0, var9.c, var9.d, 180);
                        VDTT_aa.a(var23, var11.b, (var2 + var10) * DataCenter.d().r, (var21 + var36.r + 0 - var9.c / DataCenter.d().r) * DataCenter.d().r, (var36.q - var10 * 2) * DataCenter.d().r, 0, Blending.SourceOver);
                        var11.a();
                        var11 = VDTT_v.a(var9, 0, 0, var9.c, var9.d, 270);
                        VDTT_aa.a(var23, var11.b, var2 * DataCenter.d().r, (var21 + var10) * DataCenter.d().r, 0, (var36.r + 0 - var10 * 2) * DataCenter.d().r, Blending.SourceOver);
                        var11.a();
                        var11 = VDTT_v.a(var9, 0, 0, var9.c, var9.d, 90);
                        VDTT_aa.a(var23, var11.b, (var2 + var36.q - var9.c / DataCenter.d().r) * DataCenter.d().r, (var21 + var10) * DataCenter.d().r, 0, (var36.r + 0 - var10 * 2) * DataCenter.d().r, Blending.SourceOver);
                        var11.a();
                        var24 = VDTT_dc.b(643);
                        VDTT_aa.a(var23, var24, (var2 + VDTT_jb.n(2)) * DataCenter.d().r, 0 * DataCenter.d().r, 0, 0, VDTT_jb.n(84) * DataCenter.d().r, var6 * DataCenter.d().r, Blending.SourceOver);
                        var24 = VDTT_dc.b(715);
                        VDTT_v var32;
                        if (this.aA.c()) {
                            var32 = VDTT_v.a(var24, 0, 0, var24.c, var24.d, 90);
                        } else {
                            var32 = VDTT_v.a(var24, 0, 0, var24.c, var24.d, 270);
                        }

                        VDTT_aa.b(var23, var32, 0, 0, 14 * DataCenter.d().r, 14 * DataCenter.d().r, this.cP.objX * DataCenter.d().r, this.cP.objY * DataCenter.d().r, VDTT_jb.n(14) * DataCenter.d().r, VDTT_jb.n(14) * DataCenter.d().r, Blending.SourceOver);
                        if (this.cQ != null && v().V()) {
                            var24 = VDTT_dc.b(this.cQ.I);
                            VDTT_aa.a(var23, var24, 0, 0, 18 * DataCenter.d().r, 18 * DataCenter.d().r, this.cQ.objX * DataCenter.d().r, this.cQ.objY * DataCenter.d().r, this.cQ.q * DataCenter.d().r, this.cQ.r * DataCenter.d().r, Blending.SourceOver);
                        }

                        if (this.cT != null) {
                            var24 = VDTT_dc.b(this.cT.I);
                            VDTT_aa.b(var23, var24, 0, 0, 18 * DataCenter.d().r, 18 * DataCenter.d().r, this.cT.objX * DataCenter.d().r, this.cT.objY * DataCenter.d().r, VDTT_jb.n(18) * DataCenter.d().r, VDTT_jb.n(18) * DataCenter.d().r, Blending.SourceOver);
                        }

                        DataCenter.o();
                        var18 = this.dB.objX;
                        var35 = this.dB.objY;
                        var24 = VDTT_dc.b(715);
                        if (this.az.c()) {
                            VDTT_aa.b(var23, var24, 0, 0, 14 * DataCenter.d().r, 14 * DataCenter.d().r, var18 * DataCenter.d().r, var35 * DataCenter.d().r, 14 * DataCenter.d().r, 14 * DataCenter.d().r, Blending.SourceOver);
                        } else {
                            var32 = VDTT_v.a(var24, 0, 0, var24.c, var24.d, 180);
                            VDTT_aa.b(var23, var32, 0, 0, 14 * DataCenter.d().r, 14 * DataCenter.d().r, var18 * DataCenter.d().r, var35 * DataCenter.d().r, 14 * DataCenter.d().r, 14 * DataCenter.d().r, Blending.SourceOver);
                        }
                    }

                    if (this.cR != null) {
                        var24 = VDTT_dc.b(256);
                        VDTT_aa.a(dS, var24, this.cR.objX * DataCenter.d().r, this.cR.objY * DataCenter.d().r, VDTT_jb.n(100), 20);
                    }

                    if (this.cS != null) {
                        var24 = VDTT_dc.b(256);
                        VDTT_aa.a(dS, var24, this.cS.objX * DataCenter.d().r, this.cS.objY * DataCenter.d().r, VDTT_jb.n(100), 20);
                    }

                    if (VDTT_eq.a().b(12) == 0) {
                        var24 = VDTT_dc.b(20);
                        VDTT_aa.a(var23, var24, 0, 0, 60 * DataCenter.d().r, 60 * DataCenter.d().r, this.aD.objX * DataCenter.d().r, this.aD.objY * DataCenter.d().r, this.aD.q * DataCenter.d().r, this.aD.r * DataCenter.d().r, Blending.SourceOver);
                    }

                    if (this.az.c() && !this.az.d()) {
                        var18 = this.aS.objX;
                        var35 = this.aS.objY;
                        if (VDTT_bw.I != null && (this.cH == 0 || this.cH == 1)) {
                            VDTT_aa.a(var23, VDTT_bw.I.b, var18 * DataCenter.d().r, var35 * DataCenter.d().r, VDTT_bw.I.c, VDTT_bw.I.d, Blending.SourceOver);
                        } else if (VDTT_bx.l != null && this.cH == 2) {
                            VDTT_aa.a(var23, VDTT_bx.l.b, var18 * DataCenter.d().r, var35 * DataCenter.d().r, VDTT_bx.l.c, VDTT_bx.l.d, Blending.SourceOver);
                        }
                    }
                }

                if (this.b.size() > 0 && this.b.lastElement().equals(this) || this.b.size() == 2 && this.b.lastElement() instanceof VDTT_x) {
                    var3 = var1.e;
                    var21 = var1.f;
                    this.a(var1, 0, 0);
                    var1.a(dS, 0, 0);
                    String var10002;
                    int var10004;
                    VDTT_dg var39;
                    if (VDTT_ae.B) {
                        var39 = VDTT_dg.e;
                        var10002 = Caption.uM;
                        var10003 = DataCenter.d().n / 2;
                        var10004 = DataCenter.d().o;
                        MenuConfig.K();
                        VDTT_dg.a(var39, var1, var10002, var10003, var10004 - VDTT_jb.n(60 + MenuConfig.C()), 2, -2560, 2, 1);
                    } else if (!this.ac() && !VDTT_ek.m().ah()) {
                        if (this.cy) {
                            var39 = VDTT_dg.d;
                            var10002 = Caption.pf;
                            var10003 = DataCenter.d().n / 2;
                            var10004 = DataCenter.d().o;
                            MenuConfig.K();
                            VDTT_dg.a(var39, var1, var10002, var10003, var10004 - VDTT_jb.n(60 + MenuConfig.C()), 2, -32576, 4, 1);
                        } else if (!DataCenter.l()) {
                            if (VDTT_ek.m().F()) {
                                var39 = VDTT_dg.d;
                                var10002 = Caption.U;
                                var10003 = DataCenter.d().n / 2;
                                var10004 = DataCenter.d().o;
                                MenuConfig.K();
                                VDTT_dg.a(var39, var1, var10002, var10003, var10004 - VDTT_jb.n(60 + MenuConfig.C()), 2, -16711681, 4, 1);
                            } else if (MenuConfig.K().W) {
                                var39 = VDTT_dg.d;
                                var10002 = Caption.T;
                                var10003 = DataCenter.d().n / 2;
                                var10004 = DataCenter.d().o;
                                MenuConfig.K();
                                VDTT_dg.a(var39, var1, var10002, var10003, var10004 - VDTT_jb.n(60 + MenuConfig.C()), 2, -16711808, 4, 1);
                            }
                        }
                    }

                    Graphics var34 = var1;
                    VDTT_cw var33 = this;

                    try {
                        String var28 = Caption.tU + VDTT_ek.m().A();
                        short var40;
                        if (VDTT_ek.m().bV != null) {
                            var28 = var28 + "c#cyan" + Caption.wW + VDTT_jb.c(VDTT_ek.m().y());
                            var39 = VDTT_dg.b;
                            var40 = var33.r;
                            MenuConfig.K();
                            VDTT_dg.d(var39, var34, var28, 5, var40 - VDTT_jb.n(21 + MenuConfig.C()), 0, -2560, -10275328);
                        } else {
                            DataCenter.o();
                            var39 = VDTT_dg.b;
                            var40 = var33.r;
                            MenuConfig.K();
                            VDTT_dg.b(var39, var34, var28, 5, var40 - VDTT_jb.n(21 + MenuConfig.C()), 0, -2560, -10275328);
                        }
                    } catch (Exception var13) {
                        VDTT_jb.a(var13);
                    }

                    this.a(var1, var3, var21);
                    this.dt.a(var1);
                    this.ay.a(var1);
                    DataCenter.d();
                    DataCenter.o();
                    this.az.a(var1);
                    this.du.a(var1);
                    this.dw.a(var1);
                    if (!DataCenter.l()) {
                        this.aA.a(var1);
                    }

                    this.dv.a(var1);
                }
            }

        } catch (Exception var17) {
            VDTT_jb.a(var17);
        }
    }

    public final Vector g() {
        Vector var1 = new Vector();

        try {
            DataCenter.o();
            var1.addElement(new VDTT_hl(1001, VDTT_jb.n(VDTT_d.g().m / 2), 0, VDTT_jb.n(99 + VDTT_d.g().m / 2), VDTT_jb.n(29), (VDTT_hs) null, this));
            int var2;
            if (this.bg != null && !(this.bg instanceof VDTT_fs) && (!(this.bg instanceof VDTT_gk) || !((VDTT_gk) this.bg).w()) && (!(this.bg instanceof VDTT_gx) || !((VDTT_gx) this.bg).s())) {
                var2 = DataCenter.d().n - VDTT_jb.n(186);
                if (DataCenter.l()) {
                    var2 = DataCenter.d().n - VDTT_jb.n(99);
                }

                var1.addElement(new VDTT_hl(1002, var2, 0, var2 + VDTT_jb.n(100), 0 + VDTT_jb.n(28), (VDTT_hs) null, this));
            }

            int var3;
            for (var3 = 0; var3 < VDTT_ek.m().bb.size(); ++var3) {
                VDTT_ez var6;
                if ((var6 = (VDTT_ez) VDTT_ek.m().bb.elementAt(var3)).a != 131) {
                    var1.addElement(new VDTT_hl(6000 + var3, VDTT_jb.n(var6.objX - 2 + VDTT_d.g().m / 2), VDTT_jb.n(var6.objY - 2), VDTT_jb.n(var6.objX + VDTT_d.g().m / 2) + 15, VDTT_jb.n(var6.objY) + 15, (VDTT_hs) null, this));
                }
            }

            if (!DataCenter.l()) {
                var3 = VDTT_jb.n(84);
                var2 = DataCenter.d().n - var3;
                var1.addElement(new VDTT_hl(9002, var2 - 2, 0, var2 + var3, 18, (VDTT_hs) null, this));
            }

            if (v().C().d == 21 && this.bh != null) {
                var1.addElement(new VDTT_hl(9004, VDTT_jb.n(101 + VDTT_d.g().m / 2) + 3, 16, VDTT_jb.n(101 + VDTT_d.g().m / 2) + 3 + VDTT_dg.b(VDTT_dg.c, this.dG), 30, (VDTT_hs) null, this));
            }

            var1.addElement(new VDTT_hl(9000, 0, 0, DataCenter.d().n, DataCenter.d().o, (VDTT_hs) null, this));
        } catch (Exception var5) {
        }

        return var1;
    }

    public final void i(int var1) {
        this.cm = true;
        this.ej = var1;
    }

    public final void h(int var1, int var2) {
        if (!this.cm) {
            VDTT_ek var10000;
            VDTT_gm var3;
            if (var1 >= DataCenter.d().n - 200) {
                this.cp = 2;
                if (VDTT_ek.m().J < 300) {
                    this.i(100);
                } else {
                    this.i(50);
                }

                var10000 = VDTT_ek.m();
                var3 = new VDTT_gm((short) (v().aj + 20), VDTT_ek.m().objY, VDTT_ek.m().J);
                var10000.ae = var3;
            } else if (var1 <= 200) {
                this.cp = 3;
                if (VDTT_ek.m().J < 300) {
                    this.i(100);
                } else {
                    this.i(50);
                }

                var10000 = VDTT_ek.m();
                var3 = new VDTT_gm((short) -20, VDTT_ek.m().objY, VDTT_ek.m().J);
                var10000.ae = var3;
            } else {
                VDTT_ek.m().W();
                this.ak();
            }
        }
    }

    public final void a(int var1, int var2) {
        super.a(var1, var2);
        if (this.b.lastElement() instanceof VDTT_kb) {
            VDTT_kb var10000 = (VDTT_kb) this.b.lastElement();
            int var3 = var2;
            var2 = var1;
            VDTT_kb var4 = var10000;
            var10000.aA = VDTT_jb.a(var4.q / 2 - var4.V.q / 2, 170 - var4.V.r, var4.q / 2 - var4.V.q / 2 + var4.V.q, 170, var2, var3);
        }

    }

    public final void b(int var1, int var2) {
        super.b(var1, var2);
        if (this.b.lastElement() instanceof VDTT_kb) {
            ((VDTT_kb) this.b.lastElement()).aB = 0;
        }

    }

    public final void c(int var1, int var2) {
        super.c(var1, var2);
        if (this.b.lastElement() instanceof VDTT_kb) {
            VDTT_kb var10000 = (VDTT_kb) this.b.lastElement();
            var2 = var1;
            VDTT_kb var3 = var10000;
            if (var10000.aA) {
                if (var3.aB == 0) {
                    var3.aB = var2;
                    return;
                }

                if (VDTT_jb.b(var2 - var3.aB) > 10) {
                    var3.aD = (byte) (var3.aB < var2 ? 2 : 3);
                }
            }
        }

    }

    public final void a(VDTT_hl var1, int var2, int var3) {
        if (this.D() && !this.cm) {
            this.f(false);
            int var4;
            int var5;
            VDTT_ek var16;
            if (var1.b >= 2000 && var1.b < 6000) {
                try {
                    Message var19;
                    switch (var1.b) {
                        case 2003:
                            DataCenter.o();
                            MenuConfig.K().a(false);
                            if (this.ai != 86) {
                                v();
                                h(49);
                                v().bw = v().bv;
                                v();
                                q(86);
                                return;
                            }

                            v();
                            h(49);
                            return;
                        case 2100:
                            VDTT_bw var21 = this.aS;
                            VDTT_eq.a().a(13, !VDTT_eq.a().a(13));
                            VDTT_ac.b().n();
                            var21.d();
                            return;
                        case 2200:
                            try {
                                Message.c((byte) -18).l();
                                break;
                            } catch (Exception var8) {
                                return;
                            }
                        case 2890:
                            (var19 = Message.c((byte) -3)).a(I);
                            var19.l();
                            return;
                        case 2891:
                            (var19 = Message.c((byte) -4)).a(I);
                            var19.l();
                            return;
                        case 2985:
                            (var19 = Message.c((byte) -100)).a(I);
                            var19.l();
                            return;
                        case 2986:
                            (var19 = Message.c((byte) -102)).a(I);
                            var19.l();
                            return;
                        case 2987:
                            (var19 = Message.c((byte) -101)).a(I);
                            var19.l();
                            return;
                        case 2988:
                            (var19 = Message.c((byte) -103)).a(I);
                            var19.l();
                            return;
                        case 2989:
                            (var19 = new Message((byte) -90)).a(I);
                            var19.l();
                            return;
                        case 2990:
                            (var19 = new Message((byte) -91)).a(I);
                            var19.l();
                            return;
                        case 2991:
                            VDTT_d.g();
                            VDTT_d.i();
                            return;
                        case 2992:
                            (var19 = new Message((byte) 30)).a(I);
                            var19.l();
                            return;
                        case 2993:
                            (var19 = new Message((byte) 31)).a(I);
                            var19.l();
                            return;
                        case 2994:
                            (var19 = new Message((byte) 40)).a(I);
                            var19.l();
                            return;
                        case 2995:
                            (var19 = new Message((byte) 41)).a(I);
                            var19.l();
                            return;
                        case 2996:
                            (var19 = new Message((byte) 38)).a(I);
                            var19.l();
                            return;
                        case 2997:
                            (var19 = new Message((byte) 39)).a(I);
                            var19.l();
                            return;
                        case 2998:
                            (new Message((byte) 85)).l();
                            return;
                        case 2999:
                            (new Message((byte) 84)).l();
                            return;
                        default:
                            if (this.az()) {
                                return;
                            }

                            if (var1.k != null) {
                                this.bg = (VDTT_n) var1.k;
                                if (var1.k instanceof VDTT_ek) {
                                    if (this.ai != 41) {
                                        this.aw();
                                        return;
                                    }

                                    if ((var16 = (VDTT_ek) var1.k).e == 4 || var16.e == 6 || this.bp.b(var16.aD)) {
                                        this.bg = null;
                                        return;
                                    }

                                    var16.bG = 5;
                                    this.aw();
                                } else {
                                    boolean var20;
                                    if (var1.k instanceof VDTT_gx) {
                                        MenuConfig.K().a(false);
                                        var20 = true;
                                        this.aV = var20;
                                        this.aW = true;
                                        this.g(false);
                                        return;
                                    }

                                    if (var1.k instanceof VDTT_gk && ((VDTT_gk) var1.k).v()) {
                                        if (MenuConfig.K().W && ((VDTT_gk) this.bg).n()) {
                                            this.bg = null;
                                            this.bo = null;
                                            return;
                                        }

                                        this.bo = null;
                                        var20 = true;
                                        this.aV = var20;
                                        this.aW = true;
                                        this.g(false);
                                        return;
                                    }

                                    if (var1.k instanceof VDTT_fs) {
                                        MenuConfig.K().a(false);
                                        var20 = true;
                                        this.aV = var20;
                                        this.aW = true;
                                        this.g(false);
                                        return;
                                    }

                                    if (var1.k instanceof VDTT_fx && !this.bZ && VDTT_ek.m().e == 0) {
                                        VDTT_fx var17;
                                        if (VDTT_jb.b((var17 = (VDTT_fx) var1.k).J, var17.K, VDTT_ek.m().objX, VDTT_ek.m().objY) > 80 && VDTT_jb.b(var17.objX, var17.objY, VDTT_ek.m().objX, VDTT_ek.m().objY) > 80) {
                                            this.k(var17.objX, var17.objY);
                                            return;
                                        }

                                        var17.I = 5;
                                        this.h(var2, var3);
                                        return;
                                    }
                                }
                            }
                    }

                    return;
                } catch (Exception var9) {
                    VDTT_jb.a(var9);
                }
            } else if (var1.b >= 6000 && var1.b < 7000) {
                var4 = var1.b - 6000;
                VDTT_ez var15 = (VDTT_ez) VDTT_ek.m().bb.elementAt(var4);
                VDTT_ac.b().n();
                int var10002 = var15.objX - 2;
                int var10003 = var15.objY + 16;
                boolean var12 = true;
                int var10 = var10003;
                var5 = var10002;
                VDTT_bk var6;
                if ((var6 = new VDTT_bk(var5, var10, this, var15)).objX > DataCenter.d().n - var6.q - super.objX) {
                    var6.objX = (short) (DataCenter.d().n - var6.q - super.objX);
                }

                if (var6.objX < var5 - 100) {
                    var6.objX = (short) (var5 - (var6.q + 200 + 3));
                }

                if (var6.objX < -super.objX) {
                    var6.objX = (short) (-super.objX);
                }

                if (var6.objY > DataCenter.d().o - var6.r - super.objY) {
                    var6.objY = (short) (DataCenter.d().o - var6.r - super.objY);
                }

                this.a(var6);
                this.k = var6;
                return;
            }

            switch (var1.b) {
                case 1000:
                default:
                    break;
                case 1001:
                    if (DataCenter.n()) {
                        this.a((MainScreen) (new VDTT_kb(this, VDTT_ek.m(), v().ae, 0)));
                    } else {
                        this.a((MainScreen) (new VDTT_kb(this, VDTT_ek.m(), v().ae)));
                    }

                    VDTT_ac.b().w();
                    break;
                case 1002:
                    this.bv = null;
                    if (this.bg != null) {
                        VDTT_ac.b().o();
                        if (this.bg instanceof VDTT_gx) {
                            this.a((VDTT_ic) null, false);
                        } else if (this.bg instanceof VDTT_ek) {
                            var16 = (VDTT_ek) this.bg;
                            Vector var11 = new Vector();
                            if (this.bp != null && !this.bp.c()) {
                                if (this.bp.a() && !this.bp.a(var16.aD)) {
                                    var11.addElement(new VDTT_iu(50, Caption.ex));
                                }
                            } else {
                                var11.addElement(new VDTT_iu(50, Caption.cj));
                            }

                            var11.addElement(new VDTT_iu(54, Caption.bZ));
                            if (VDTT_ek.m().o == 0 && var16.o == 0 && VDTT_ek.m().ab == -1 && !var16.N) {
                                var11.addElement(new VDTT_iu(52, Caption.hH));
                            }

                            if (VDTT_ek.m().o != 1 && VDTT_ek.m().ab == -1 && !var16.N) {
                                var11.addElement(new VDTT_iu(58, Caption.hI));
                            }

                            if (VDTT_ek.m().bh == null && var16.bh != null && var16.bh.c >= 3) {
                                var11.addElement(new VDTT_iu(60, Caption.hJ));
                            }

                            if (VDTT_ek.m().bh != null && VDTT_ek.m().bh.c >= 3 && var16.bh == null) {
                                var11.addElement(new VDTT_iu(61, Caption.hK));
                            }

                            a((Vector) var11, (String) var16.aD);
                            String[] var13 = new String[var11.size()];
                            int[] var14 = new int[var11.size()];

                            for (int var7 = 0; var7 < var11.size(); ++var7) {
                                VDTT_iu var18 = (VDTT_iu) var11.elementAt(var7);
                                var13[var7] = var18.b;
                                var14[var7] = var18.a;
                            }

                            this.a((MainScreen) (new VDTT_mb(this, var16.aD + Caption.me, var13, var14, var16)));
                        } else if (this.bg instanceof VDTT_gk) {
                            var4 = DataCenter.d().n - VDTT_jb.n(186);
                            var5 = VDTT_jb.n(29);
                            this.k = a(this, var4, var5, 200, (VDTT_gk) this.bg);
                        }
                    }
                    break;
                case 9000:
                    if (Gdx.app.getType() == ApplicationType.Desktop && !this.aP.d && this.aP.objX != -200 && this.aP.objY != -200) {
                        this.aP.f(-200, -200);
                        this.aP.b(true);
                    } else {
                        if (VDTT_eq.a().b()) {
                            var2 = var2 * DataCenter.d().r / (DataCenter.d().r - 1);
                            var3 = var3 * DataCenter.d().r / (DataCenter.d().r - 1);
                        }

                        var4 = var2 + DataCenter.d().i;
                        var5 = var3 + DataCenter.d().j;
                        if (var4 < 16) {
                            var4 = 16;
                        }

                        if (var4 > this.aj - 17) {
                            var4 = this.aj - 17;
                        }

                        this.a(var4, var5, true);
                    }
                    break;
                case 9002:
                    this.a((MainScreen) (new VDTT_lo(this)));
                    break;
                case 9004:
                    VDTT_ek.m().c(this.bh.objX, this.bh.objY);
            }

            this.o.b();
        }
    }

    public final void a(int var1, int var2, boolean var3) {
        if (!VDTT_ek.m().q() && !VDTT_ek.m().ah()) {
            int var4;
            boolean var6;
            for (var4 = 0; var4 < this.aq.size(); ++var4) {
                VDTT_gx var5;
                if (!(var5 = (VDTT_gx) this.aq.get(var4)).h() && VDTT_jb.a(var5.a(), var5.c(), var5.b(), var5.d(), var1, var2)) {
                    this.bg = var5;
                    var5.p = 5;
                    MenuConfig.K().a(false);
                    var6 = true;
                    this.aV = var6;
                    this.aW = true;
                    this.g(false);
                    return;
                }
            }

            for (var4 = this.dp.size() - 1; var4 >= 0; --var4) {
                VDTT_n var7;
                if (!(var7 = (VDTT_n) this.dp.elementAt(var4)).h() && !var7.equals(VDTT_ek.m()) && (var7 instanceof VDTT_ek || var7 instanceof VDTT_gx || var7 instanceof VDTT_gk && ((VDTT_gk) var7).v() || var7 instanceof VDTT_fs || var7 instanceof VDTT_fx) && VDTT_jb.a(var7.a(), var7.c(), var7.b(), var7.d(), var1, var2)) {
                    this.bg = var7;
                    if (!(var7 instanceof VDTT_ek)) {
                        if (var7 instanceof VDTT_gx) {
                            MenuConfig.K().a(false);
                            var6 = true;
                            this.aV = var6;
                            this.aW = true;
                            this.g(false);
                            return;
                        }

                        if (var7 instanceof VDTT_gk) {
                            if (MenuConfig.K().W && ((VDTT_gk) this.bg).n()) {
                                this.bg = null;
                                this.bo = null;
                                return;
                            }

                            this.bo = null;
                            var6 = true;
                            this.aV = var6;
                            this.aW = true;
                            this.g(false);
                            if (VDTT_ek.m().ag > 0) {
                                MenuConfig.K().a(true);
                                ((VDTT_gk) this.bg).aC = 5;
                                return;
                            }

                            MenuConfig.K().a(false);
                            return;
                        }

                        if (var7 instanceof VDTT_fs) {
                            MenuConfig.K().a(false);
                            var6 = true;
                            this.aV = var6;
                            this.aW = true;
                            this.g(false);
                            return;
                        }

                        if (var7 instanceof VDTT_fx && !this.bZ && VDTT_ek.m().e == 0) {
                            if (this.aa()) {
                                v().a((MainScreen) (new VDTT_kq(v())));
                                return;
                            }

                            VDTT_fx var9;
                            if (VDTT_jb.b((var9 = (VDTT_fx) var7).J, var9.K, VDTT_ek.m().objX, VDTT_ek.m().objY) > 80 && VDTT_jb.b(var9.objX, var9.objY, VDTT_ek.m().objX, VDTT_ek.m().objY) > 80) {
                                this.k(var9.objX, var9.objY);
                                return;
                            }

                            var9.I = 5;
                            this.h(var1, var2);
                            VDTT_ac.b().o();
                            return;
                        }

                        return;
                    }

                    VDTT_ek var8;
                    if (!(var8 = (VDTT_ek) var7).af()) {
                        if (this.ai == 41) {
                            if (var8.e == 4 || var8.e == 6 || this.bp.b(var8.aD)) {
                                this.bg = null;
                                return;
                            }

                            var8.bG = 5;
                        }

                        this.aw();
                        return;
                    }

                    this.bg = null;
                }
            }

            if (var3) {
                if (this.aa()) {
                    v().a((MainScreen) (new VDTT_kq(v())));
                    return;
                }

                this.bn = VDTT_bt.m().b(var1, var2);
                this.bn.I = 0;
                if (v().U.a(var1, var2)) {
                    this.bn.I = -80;
                } else {
                    this.k(var1, var2);
                }

                this.I();
            }

        }
    }

    private void aw() {
        this.bo = null;
        boolean var2 = true;
        this.aV = var2;
        this.aW = true;
        this.g(false);
        if (System.currentTimeMillis() - this.dF < 300L) {
            if (VDTT_ek.m().ag <= 0) {
                this.dF = Long.MIN_VALUE;
                MenuConfig.K().a(false);
                return;
            }

            MenuConfig.K().a(false);
            if (VDTT_eq.a().a(35)) {
                this.b(0, false);
            }

            MenuConfig.K().a(true);
        }

        this.dF = System.currentTimeMillis();
    }

    public final void I() {
        this.b((VDTT_m) this.aP);
    }

    private void k(int var1, int var2) {
        if (this.ew != null) {
            this.ew.b(var1, var2);
        } else {
            if (VDTT_ek.m().K >= 30 && VDTT_ek.m().K <= 35) {
                VDTT_ek.m().bT = 5;
            }

            this.aD.j();
            MenuConfig.O();
            this.aW = false;
            this.bv = null;
            MenuConfig.K().a(false);
            VDTT_ek.m().J();
            VDTT_ek.m().c(var1, var2);
            MenuConfig.K().a(false);
            this.cf = VDTT_ek.m().objX;
            this.cg = VDTT_ek.m().objY;
            this.cd = VDTT_jb.a();
            this.bM = 1000;
            this.cA = false;
        }
    }

    public final void perform(int var1, Object var2, VDTT_z var3) {
        if (this.D() && !this.cm) {
            if (var1 != 7000) {
                this.f(false);
            }

            if (var1 >= 1021 && var1 < 1029) {
                if (this.aa()) {
                    v().a((MainScreen) (new VDTT_kq(v())));
                } else {
                    this.bv = null;
                    var1 -= 1021;
                    this.b(var1, true);
                }
            } else if (!this.aa() || var1 != 1080 && var1 != 1081 && var1 != 1084 && var1 != 1085 && var1 != 1086 && var1 != 1087 && var1 != 1088 && var1 != 1037 && var1 != 1020) {
                String var7;
                switch (var1) {
                    case 1000:
                    case 1001:
                    case 1002:
                    case 1003:
                    case 1004:
                    case 1010:
                    case 1025:
                    case 1026:
                    case 1031:
                    case 1040:
                    case 1041:
                    case 1049:
                    default:
                        break;
                    case 1012:
                        this.E();
                        break;
                    case 1013:
                        this.a((MainScreen) (new VDTT_mb(this, "", Caption.Ca, new int[]{805, 800, 801, 802, 200, 803, 804}, true)));
                        break;
                    case 1020:
                        if (this.aa()) {
                            v().a((MainScreen) (new VDTT_kq(v())));
                        } else {
                            if (MenuConfig.S) {
                                MenuConfig.S = false;
                            } else {
                                MenuConfig.K().a(false);
                            }

                            this.a(VDTT_ek.m().aZ, false);
                        }
                        break;
                    case 1030:
                        VDTT_eq.a().a(5, this.dv.c);
                        break;
                    case 1032:
                        this.a((MainScreen) (new VDTT_ln(this)));
                        break;
                    case 1033:
                        o(88);
                        break;
                    case 1034:
                        o(6);
                        break;
                    case 1035:
                        this.a((MainScreen) (new VDTT_lq(this)));
                        break;
                    case 1036:
                        this.ad();
                        break;
                    case 1037:
                        if (VDTT_ek.m().az < 5) {
                            DataCenter.d().ai.c(Caption.uR, -1);
                        } else {
                            var7 = Caption.mJ.toLowerCase();
                            if (v().dj >= 0) {
                                var7 = VDTT_jb.e((long) v().dj * 1000L);
                            }

                            String var13 = VDTT_jb.b(Caption.oR, var7);
                            String[] var14 = Caption.Aq;
                            this.a((MainScreen) (new VDTT_mb(this, var13, var14, new int[]{1, 201, 206})));
                        }
                        break;
                    case 1042:
                        this.a(this.aP);
                        break;
                    case 1043:
                        if (VDTT_jb.c() > v().ah) {
                            this.c(Caption.sq, -1);
                        } else {
                            this.k = new VDTT_bl(var3.objX - 44, var3.objY - 88, 1044, this);
                            this.a((VDTT_m) this.k);
                        }
                        break;
                    case 1044:
                        this.aP.d(var2.toString());
                        this.c(this.aP);
                        break;
                    case 1045:
                        this.a((MainScreen) (new VDTT_kc(1046, this)));
                        break;
                    case 1046:
                        VDTT_jb.b("1046");
                        break;
                    case 1047:
                        this.c(this.aP);
                        break;
                    case 1048:
                        VDTT_jb.b("1048");
                        break;
                    case 1050:
                        if (this.aC == 0) {
                            this.t(1);
                        } else if (this.aC == 1) {
                            this.t(2);
                        } else if (this.aC == 2) {
                            this.t(0);
                            this.aS.d();
                        }

                        VDTT_eq.a().a(4, this.aC);
                        break;
                    case 1057:
                        v();
                        o(6);
                        break;
                    case 1060:
                        this.ax();
                        break;
                    case 1061:
                        this.a((MainScreen) (new VDTT_kb(this, VDTT_ek.m(), v().ae)));
                        break;
                    case 1062:
                        this.a((MainScreen) (new VDTT_lj(this, 0)));
                        break;
                    case 1063:
                        o(111);
                        break;
                    case 1064:
                        if (this.C().d == 6) {
                            this.a((MainScreen) (new VDTT_jm(this)));
                        } else {
                            this.a((MainScreen) (new VDTT_mx(this)));
                        }
                        break;
                    case 1065:
                        this.a((MainScreen) (new VDTT_ms(this)));
                        break;
                    case 1067:
                        v();
                        o(86);
                        break;
                    case 1068:
                        String[] var9 = Caption.zB;
                        if (DataCenter.aj) {
                            var9 = new String[Caption.zB.length - 1];
                            int var11 = 0;

                            for (int var12 = 0; var12 < Caption.zB.length; ++var12) {
                                if (var12 != 2) {
                                    var9[var11] = Caption.zB[var12];
                                    ++var11;
                                }
                            }

                            this.a((MainScreen) (new VDTT_mb(this, "", var9, new int[]{903, 900, 901, 905, 902})));
                        } else {
                            this.a((MainScreen) (new VDTT_mb(this, "", var9, new int[]{903, 900, 901, 905, 902})));
                        }
                        break;
                    case 1069:
                        o(54);
                        break;
                    case 1070:
                        VDTT_ek.m().m = Byte.valueOf(var2.toString());
                        break;
                    case 1080:
                    case 1081:
                        this.b(true);
                        break;
                    case 1082:
                        this.am();
                        break;
                    case 1083:
                        this.ay();
                        break;
                    case 1084:
                        if (VDTT_ek.m().F() && Item.d(this.bX)) {
                            a(v().bv);
                        } else {
                            Item var8;
                            if ((var8 = VDTT_ek.m().e(this.bX)) != null) {
                                this.a(var8);
                            }
                        }
                        break;
                    case 1085:
                        MenuConfig.K().a(!MenuConfig.K().W);
                        break;
                    case 1086:
                        this.ae();
                        break;
                    case 1100:
                        this.d(!this.aA.c());
                        DataCenter.d().c();
                        break;
                    case 1101:
                        if (!DataCenter.l()) {
                            this.dC.b(false);
                            this.dx.b(false);
                        }

                        this.e(!this.az.c());
                        DataCenter.d().c();
                        break;
                    case 1102:
                        if (this.dC.b) {
                            v();
                            o(72);
                        }

                        this.r(0);
                        break;
                    case 1103:
                        this.a(Caption.tY, 2200, this);
                        break;
                    case 1104:
                        VDTT_d var6 = VDTT_d.g();

                        try {
                            var7 = VDTT_aa.a(String.format("screenshot_%d.png", System.currentTimeMillis()));
                            byte[] var10 = ScreenUtils.getFrameBufferPixels(0, 0, Gdx.graphics.getBackBufferWidth(), Gdx.graphics.getBackBufferHeight(), true);
                            Pixmap var4 = new Pixmap(Gdx.graphics.getBackBufferWidth(), Gdx.graphics.getBackBufferHeight(), Format.RGBA8888);
                            BufferUtils.copy(var10, 0, var4.getPixels(), var10.length);
                            PixmapIO.writePNG(VDTT_jb.i(var7), var4);
                            var4.dispose();
                            var6.h.a(var7, new VDTT_j(var6));
                        } catch (Exception var5) {
                        }
                        break;
                    case 3000:
                        this.r(0);
                        break;
                    case 3001:
                        VDTT_bw.J = 0;
                        this.r(1);
                        break;
                    case 3002:
                        VDTT_bw.J = 1;
                        this.r(1);
                        break;
                    case 3003:
                        VDTT_bw.J = 2;
                        this.r(1);
                        break;
                    case 3004:
                        v();
                        o(72);
                        VDTT_ac.b().w();
                        break;
                    case 3010:
                        if (this.dx.b) {
                            this.a((MainScreen) (new VDTT_ms(this)));
                        }

                        this.r(2);
                        break;
                    case 6004:
                        h(VDTT_bc.L.b);
                        break;
                    case 6005:
                        g(VDTT_bc.L.b);
                        break;
                    case 6006:
                        VDTT_bc.K = VDTT_bc.L.b;
                        this.a((String) VDTT_bc.L.b, (VDTT_kd) (new VDTT_ke(v(), 5)));
                        break;
                    case 6007:
                        this.i(VDTT_bc.L.b);
                        break;
                    case 6008:
                        f(VDTT_bc.L.b);
                        break;
                    case 6009:
                        o(89);
                        break;
                    case 7000:
                        this.f(!this.ay.c());
                        break;
                    case 7001:
                        y(0);
                        break;
                    case 7002:
                        y(2);
                        break;
                    case 7003:
                        y(3);
                        break;
                    case 7004:
                        this.ax();
                        break;
                    case 7005:
                        y(4);
                        break;
                    case 7006:
                        VDTT_dg.b();
                        VDTT_eq.a().a(15, !VDTT_eq.a().a(15));
                        break;
                    case 7007:
                        VDTT_l.a = 0L;
                }

                this.o.b();
            } else {
                v().a((MainScreen) (new VDTT_kq(v())));
            }
        }
    }

    private void ax() {
        this.a((MainScreen) (new VDTT_js(this)));
    }

    private void ay() {
        VDTT_ca var10000;
        int var10001;
        int var10002;
        if (VDTT_eq.a().b(9) == 0) {
            this.aP.a("");
            this.aP.b(false);
            var10000 = this.aP;
            var10001 = DataCenter.d().n / 2 - this.aP.q / 2;
            var10002 = DataCenter.d().o;
            MenuConfig.K();
            var10000.f(var10001, var10002 - VDTT_jb.n(127 + MenuConfig.C()));
        } else if (VDTT_eq.a().b(9) == 2) {
            this.aP.a("");
            this.aP.b(false);
            var10000 = this.aP;
            var10001 = DataCenter.d().n / 2 - this.aP.q / 2;
            var10002 = DataCenter.d().o;
            MenuConfig.K();
            var10000.f(var10001, var10002 - VDTT_jb.n(75 + MenuConfig.C()));
            boolean var2 = true;
            this.aP.b = var2;
            this.a((VDTT_m) this.aP);
        }

        VDTT_aa.a(this.aP, this.aP.i(), Caption.hk, this.aP.l, this.aP.m, false);
    }

    private void b(int var1, boolean var2) {
        try {
            if (!VDTT_ek.m().h() && (this.bg == null || !(this.bg instanceof VDTT_ek) || !this.bg.h())) {
                short[] var3 = this.B();
                VDTT_ic var4 = null;
                Iterator var5;
                if (var1 == 0 && VDTT_eq.a().a(31)) {
                    var5 = this.bl.iterator();

                    while (var5.hasNext()) {
                        if ((var4 = (VDTT_ic) var5.next()).d >= 31 && var4.d <= 36 && VDTT_ek.m().ah >= var4.g) {
                            this.a(var4, false);
                            if (VDTT_ek.m().aV != null && var2) {
                                MenuConfig.K().a(false);
                                return;
                            }
                        }
                    }
                }

                if (var1 == 7 && this.aO != null) {
                    for (int var8 = 0; var8 < v().ae.length; ++var8) {
                        if (v().ae[var8].e > 0 && v().ae[var8].l()) {
                            var4 = v().ae[var8];
                            break;
                        }
                    }
                } else {
                    label141:
                    {
                        var5 = this.bl.iterator();

                        VDTT_ic var6;
                        do {
                            if (!var5.hasNext()) {
                                break label141;
                            }

                            var6 = (VDTT_ic) var5.next();
                        } while (var3[var1] != var6.d);

                        var4 = var6;
                    }
                }

                if (var4 != null) {
                    if (VDTT_ek.m().aV == null || VDTT_ek.m().aV.d.b().a != var4.b().a) {
                        if (!var4.e() && this.bg != null && !(this.bg instanceof VDTT_gk)) {
                            if (this.bg instanceof VDTT_ek && this.a((VDTT_ek) this.bg)) {
                                var4.o = true;
                                if (VDTT_ek.m().ah < var4.g) {
                                    DataCenter.d().ai.c(VDTT_jb.b(Caption.mB, var4.b().b), -65536);
                                }

                                this.a(var4, false);
                                if (var1 == 0 && var2) {
                                    MenuConfig.K().a(false);
                                }
                            }
                        } else {
                            var4.o = true;
                            if (VDTT_ek.m().ah < var4.g) {
                                DataCenter.d().ai.c(VDTT_jb.b(Caption.mB, var4.b().b), -65536);
                            }

                            this.a(var4, false);
                            if (var1 == 0 && var2) {
                                MenuConfig.K().a(false);
                                return;
                            }
                        }

                    }
                }
            }
        } catch (Exception var7) {
            VDTT_jb.a(var7);
        }
    }

    public static void a(VDTT_dy var0) {
        try {
            Message var1;
            (var1 = Message.c((byte) -48)).b(var0.d);
            var1.b(var0.a);
            if (var0.b >= 0) {
                var1.b(var0.b);
            } else {
                var1.b(var0.c);
            }

            var1.b(var0.e);
            var1.b(var0.f);
            var1.l();
            VDTT_ek.m().S();
            v().bv = null;
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void a(int var1, boolean var2) {
        try {
            if (var2) {
                this.ei = var1;
                VDTT_da.b("shortcutItem", var1);
            } else if (this.bX < 0 || this.bX >= DataCenter.d().O.length) {
                this.ei = this.bX;
            }

            this.bX = var1;
            DataCenter.d().c();
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public final void a(int var1, short var2, short var3, short var4, boolean var5) {
        try {
            int var6 = v().aj / 255;
            if (v().aj % 255 != 0) {
                ++var6;
            }

            var3 = (short) (var3 + var2 % var6 * 255);
            var4 = (short) (var4 + var2 / var6 * 255);
            VDTT_ek var8;
            if ((var8 = this.k(var1)) != null) {
                var8.a(var3, var4, var5);
            }

        } catch (Exception var7) {
        }
    }

    public final void a(Message var1) throws IOException {
        VDTT_ek var2;
        (var2 = new VDTT_ek(var1.b.a.readInt())).a(var1);

        int var3;
        for (var3 = 0; var3 < this.ao.size(); ++var3) {
            if (((VDTT_ek) this.ao.elementAt(var3)).b == var2.b) {
                this.ao.removeElementAt(var3);
                break;
            }
        }

        for (var3 = this.aw.size() - 1; var3 >= 0; --var3) {
            if (((VDTT_ek) this.aw.get(var3)).aD.equals(var2.aD)) {
                this.aw.remove(var3);
                break;
            }
        }

        if (var2.b != VDTT_ek.m().b) {
            this.ao.addElement(var2);
        }
    }

    public final void J() {
        this.af = VDTT_jb.a();
        if (this.aB == null) {
            this.aB = new VDTT_ll(this);
        }

        DataCenter var10000 = DataCenter.d();
        VDTT_cw var2 = v();
        var10000.ai = var2;
    }

    public final void K() {
        (new Thread(new VDTT_cx(this))).start();
    }

    public static void a(String var0) {
        try {
            Message var1;
            (var1 = new Message((byte) 21)).a(var0);
            var1.l();
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void a(VDTT_ca var1) {
        try {
            String var2;
            if ((var2 = var1.i()).trim().equals("test")) {
                listAnimationPetAttack.add(new AnimationPetAttack(VDTT_cw.v().bg, VDTT_ek.m(), 580, 663, 2));
            } else if ((var2 = var1.i()).trim().equals("uicoloruicolor")) {
                this.a((MainScreen) (new VDTT_lc(this)));
            } else {
                if (this.cJ.length() > 0) {
                    var2 = this.cJ + var2;
                }

                if (var2.length() > 0) {
                    if (var2.startsWith("/") && var2.contains(": ")) {
                        this.aQ.a((byte) 5);
                        if (this.bq != null) {
                            this.bq.Q.a((byte) 5);
                        }
                    }

                    var1.a("");
                    byte var6 = this.aQ.j();
                    if (this.bq != null) {
                        switch (var6 = this.bq.Q.j()) {
                            case 0:
                                this.cv = 0;
                                this.bq.P.a(0);
                                break;
                            case 1:
                                this.cv = 1;
                                this.bq.P.a(0);
                                break;
                            case 2:
                                this.bq.P.a(4);
                                break;
                            case 3:
                                this.bq.P.a(2);
                                break;
                            case 4:
                                this.bq.P.a(3);
                                break;
                            case 5:
                                this.bq.P.a(1);
                                break;
                            case 6:
                                this.cv = 6;
                                this.bq.P.a(0);
                                break;
                            case 7:
                                this.cv = 7;
                                this.bq.P.a(0);
                                break;
                            case 8:
                                this.cv = 8;
                                this.bq.P.a(0);
                                break;
                            case 9:
                                this.bq.P.a(0);
                        }
                    }

                    Message var3 = null;
                    switch (var6) {
                        case 0:
                            var3 = new Message((byte) 21);
                            break;
                        case 1:
                            (var3 = new Message((byte) 22)).a(false);
                            break;
                        case 2:
                            var3 = new Message((byte) 24);
                            break;
                        case 3:
                            var3 = new Message((byte) 25);
                            break;
                        case 4:
                            var3 = new Message((byte) 26);
                            break;
                        case 5:
                            var3 = new Message((byte) 28);

                            try {
                                K = (K = var2.split(": ")[0]).replaceAll("/", "");
                            } catch (Exception var4) {
                                K = "";
                            }
                            break;
                        case 6:
                            this.aQ.n.b = var6;
                            var3 = new Message((byte) -59);
                            break;
                        case 7:
                            (var3 = new Message((byte) 22)).a(true);
                            break;
                        case 8:
                            var3 = new Message((byte) 23);
                            break;
                        case 9:
                            var3 = new Message((byte) 27);
                    }

                    var3.a(var2);
                    var3.l();
                }

            }
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public final void b(int var1, Object var2) {
        if (this.D()) {
            switch (var1) {
                case 1011:
                    MenuConfig.O();
                    if (VDTT_ek.m().q() && !VDTT_ek.m().ab()) {
                        if (!this.o.b[4] && !this.o.b[6]) {
                            if (VDTT_ek.m().ae.i == 40 && this.de > 0) {
                                VDTT_ek var10000 = VDTT_ek.m();
                                var2 = null;
                                var10000.ae = (VDTT_gm) var2;
                                this.o.b();
                                VDTT_ek.m().aG = 2;
                                return;
                            }

                            if (this.aD.S.N >= 75 && this.aD.S.N <= 90 && VDTT_ek.m().r() && this.de > 0) {
                                if (!VDTT_ek.m().P()) {
                                    this.o.b();
                                    return;
                                }

                                VDTT_ek.m().ae.g = 0;
                                VDTT_ek.m().aG = 2;
                                return;
                            }

                            if (this.aD.S.N >= 90 && this.aD.S.N <= 105 && VDTT_ek.m().r() && this.de > 0) {
                                if (!VDTT_ek.m().N()) {
                                    this.o.b();
                                    return;
                                }

                                VDTT_ek.m().ae.g = 0;
                                VDTT_ek.m().aG = 2;
                                return;
                            }

                            if (this.aD.S.N < 90 | this.aD.S.N >= 270) {
                                VDTT_ek.m().O();
                                return;
                            }

                            VDTT_ek.m().M();
                            return;
                        }

                        return;
                    } else if (VDTT_ek.m().aG == 2) {
                        if (this.aD.S.N >= 15 && this.aD.S.N <= 345) {
                            if (this.aD.S.N > 75 && this.aD.S.N < 115) {
                                if (!VDTT_ek.m().Q()) {
                                    this.o.b();
                                    return;
                                }
                            } else if (this.aD.S.N > 165 && this.aD.S.N < 195) {
                                if (!VDTT_ek.m().M()) {
                                    this.o.b();
                                    return;
                                }
                            } else if (this.aD.S.N > 255 && this.aD.S.N < 285) {
                                if (!VDTT_ek.m().R()) {
                                    this.o.b();
                                    return;
                                }
                            } else if (this.aD.S.N >= 15 && this.aD.S.N <= 75) {
                                if (!VDTT_ek.m().P()) {
                                    this.o.b();
                                    return;
                                }
                            } else if (this.aD.S.N >= 115 && this.aD.S.N <= 165) {
                                if (!VDTT_ek.m().N()) {
                                    this.o.b();
                                    return;
                                }
                            } else {
                                VDTT_ek var3;
                                short var4;
                                if (this.aD.S.N >= 195 && this.aD.S.N <= 255) {
                                    var3 = VDTT_ek.m();
                                    var4 = v().C().d == 20 ? 10 : var3.J;
                                    if (!var3.a(var3.objX - var4, var3.objY + var4, (byte) 3)) {
                                        this.o.b();
                                        return;
                                    }
                                } else if (this.aD.S.N >= 285 && this.aD.S.N <= 345) {
                                    var3 = VDTT_ek.m();
                                    var4 = v().C().d == 20 ? 10 : var3.J;
                                    if (!var3.a(var3.objX + var4, var3.objY + var4, (byte) 2)) {
                                        this.o.b();
                                        return;
                                    }
                                }
                            }
                        } else if (!VDTT_ek.m().O()) {
                            this.o.b();
                            return;
                        }
                    } else if (this.aD.S.N >= 35 && this.aD.S.N < 145) {
                        VDTT_ek.m().Q();
                        return;
                    } else if (this.aD.S.N >= 145 && this.aD.S.N < 260) {
                        VDTT_ek.m().M();
                        return;
                    } else if (this.aD.S.N >= 260 && this.aD.S.N < 280) {
                        VDTT_ek.m().R();
                        return;
                    } else {
                        VDTT_ek.m().O();
                    }
                default:
            }
        }
    }

    public final void r() {
        try {
            this.aD.j();
        } catch (Exception var1) {
        }
    }

    public final void b(Message var1) throws IOException {
        Vector var2 = new Vector();
        short var3 = var1.b.a.readShort();

        for (int var4 = 0; var4 < var3; ++var4) {
            VDTT_fs var5;
            (var5 = new VDTT_fs()).J = var1.b.a.readInt();
            var5.b = var1.b.a.readShort();
            var5.objX = var5.l = var1.b.a.readShort();
            var5.objY = var5.m = var1.b.a.readShort();
            var5.k = new Item();
            var5.k.a(var1);
            var2.addElement(var5);
        }

        this.ar.clear();
        this.ar.addAll(var2);
    }

    public final void c(Message var1) {
        try {
            VDTT_ek.m().T();
            VDTT_ek.m().ab = -1;
            this.al = var1.b.a.readShort();
            this.ai = var1.b.a.readShort();
            VDTT_ek.m().objX = VDTT_eu.a = var1.b.a.readShort();
            VDTT_ek.m().objY = VDTT_eu.b = var1.b.a.readShort();
            this.ar.clear();
            this.ao.clear();
            this.ap.clear();
            this.aq.clear();
            this.av.clear();
            this.ds.clear();
            short var2 = var1.b.a.readShort();

            int var3;
            for (var3 = 0; var3 < var2; ++var3) {
                VDTT_fs var4;
                (var4 = new VDTT_fs()).J = var1.b.a.readInt();
                var4.b = var1.b.a.readShort();
                var4.objX = var4.l = var1.b.a.readShort();
                var4.objY = var4.m = var1.b.a.readShort();
                var4.k = new Item();
                var4.k.a(var1);
                if (var4.k.c != 811 || var4.J == VDTT_ek.m().b) {
                    this.ar.addElement(var4);
                }
            }

            var2 = var1.b.a();

            for (var3 = 0; var3 < var2; ++var3) {
                this.a(var1);
            }

            var2 = var1.b.a.readShort();

            short var8;
            for (var8 = 0; var8 < var2; ++var8) {
                VDTT_gk var9;
                (var9 = new VDTT_gk(0)).a(var1);
                this.ap.addElement(var9);
            }

            var2 = var1.b.a.readShort();

            for (var8 = 0; var8 < var2; ++var8) {
                VDTT_gx var10;
                (var10 = new VDTT_gx(var1.b.a.readByte(), var1.b.a.readShort(), var1.b.a.readShort(), var1.b.a.readShort())).b = var8;
                this.aq.addElement(var10);
            }

            for (int var11 = 0; var11 < DataCenter.d().V.length; ++var11) {
                VDTT_fx var12;
                if (DataCenter.d().V[var11][0] == this.ai) {
                    (var12 = new VDTT_fx(0, 0)).a(DataCenter.d().V[var11][0], DataCenter.d().V[var11][5], DataCenter.d().V[var11][1], DataCenter.d().V[var11][2], DataCenter.d().V[var11][3], DataCenter.d().V[var11][4], DataCenter.d().V[var11][10], DataCenter.d().V[var11][11]);
                    this.av.addElement(var12);
                } else if (DataCenter.d().V[var11][5] == this.ai) {
                    (var12 = new VDTT_fx(0, 0)).a(DataCenter.d().V[var11][5], DataCenter.d().V[var11][0], DataCenter.d().V[var11][6], DataCenter.d().V[var11][7], DataCenter.d().V[var11][8], DataCenter.d().V[var11][9], DataCenter.d().V[var11][12], DataCenter.d().V[var11][13]);
                    this.av.addElement(var12);
                }
            }

            this.x();
            this.R();
            this.L();
            VDTT_ek.m().o = var1.b.a.readByte();
            if (this.V()) {
                this.bQ = var1.b.a.readLong();
                this.bR = var1.b.a.readInt();
                this.bY = var1.b.a.readBoolean();
                if (this.C().d != 19 && this.C().d != 20 && this.C().d != 15) {
                    if (v().C().d == 8) {
                        v().cr = var1.b.a.readByte();
                        if (v().cr > 3) {
                            v().a(true);
                        }
                    }
                } else {
                    this.cr = var1.b.a.readByte();
                }
            }

            this.bZ = var1.b.a.readBoolean();
            if (this.cp != 0) {
                VDTT_ek.m().aF = VDTT_ek.m().d = this.cp;
            } else {
                VDTT_ek.m().aF = VDTT_ek.m().d = 2;
            }

            byte var13;
            if ((var13 = var1.b.a.readByte()) > 0) {
                MainScreen var7;
                if ((var7 = super.c) instanceof VDTT_am) {
                    ((VDTT_am) var7).k();
                }

                this.a(0, VDTT_ek.m(), var13);
            }

            VDTT_ek.m().br = var1.b.a.readBoolean();
            this.ez = false;
        } catch (Exception var6) {
            VDTT_jb.a(var6);
        }
    }

    public final void L() {
        this.h();
        d = false;
        this.cm = false;
        this.ej = 0;
    }

    public final void d(Message var1) throws IOException {
        this.cZ = var1.b.a.readByte();
        MainScreen var2;
        if ((var2 = super.c) instanceof VDTT_lz) {
            ((VDTT_lz) var2).k();
        }

    }

    public final void e(Message var1) throws IOException {
        int var4 = var1.b.a.readInt();

        for (int var3 = 0; var3 < this.ao.size(); ++var3) {
            VDTT_ek var2;
            if ((var2 = (VDTT_ek) this.ao.elementAt(var3)).b == var4) {
                if (!this.aw.contains(var2)) {
                    this.aw.add(var2);
                }

                return;
            }
        }

    }

    private static VDTT_fz b(int var0, int var1, int var2, int var3) {
        VDTT_fz var4;
        (var4 = new VDTT_fz()).d = new XYEntity[5];
        var4.d[0] = XYEntity.e(var0, var1);
        var4.d[1] = XYEntity.e(var2, var1);
        var4.d[2] = XYEntity.e(var2, var3);
        var4.d[3] = XYEntity.e(var0, var3);
        var4.d[4] = XYEntity.e(var0, var1);
        return var4;
    }

    public final VDTT_gk j(int var1) {
        for (int var3 = 0; var3 < this.ap.size(); ++var3) {
            VDTT_gk var2;
            if ((var2 = (VDTT_gk) this.ap.elementAt(var3)).b == var1) {
                return var2;
            }
        }

        return null;
    }

    private boolean az() {
        VDTT_ek var1;
        return this.bg != null && this.bg instanceof VDTT_ek && (var1 = (VDTT_ek) this.bg).b == VDTT_ek.m().ab && this.k(var1.b) != null;
    }

    public final VDTT_ek d(String var1) {
        if (VDTT_ek.m().aD.equals(var1)) {
            return VDTT_ek.m();
        } else {
            for (int var3 = 0; var3 < this.ao.size(); ++var3) {
                VDTT_ek var2;
                if ((var2 = (VDTT_ek) this.ao.elementAt(var3)).aD.equals(var1)) {
                    return var2;
                }
            }

            return null;
        }
    }

    public final VDTT_ek k(int var1) {
        for (int var3 = 0; var3 < this.ao.size(); ++var3) {
            VDTT_ek var2;
            if ((var2 = (VDTT_ek) this.ao.elementAt(var3)).b == var1) {
                return var2;
            }
        }

        return null;
    }

    public final VDTT_ek findChar(int var1) {
        if (VDTT_ek.m().b == var1) {
            return VDTT_ek.m();
        }
        for (int var3 = 0; var3 < this.ao.size(); ++var3) {
            VDTT_ek var2;
            if ((var2 = (VDTT_ek) this.ao.elementAt(var3)).b == var1) {
                return var2;
            }
        }

        return null;
    }

    public final VDTT_gx l(int var1) {
        for (int var2 = 0; var2 < this.aq.size(); ++var2) {
            VDTT_gx var3;
            if ((var3 = (VDTT_gx) this.aq.elementAt(var2)).k == var1) {
                return var3;
            }
        }

        return null;
    }

    public final VDTT_ek m(int var1) {
        return var1 == VDTT_ek.m().b ? VDTT_ek.m() : this.k(var1);
    }

    public final VDTT_ek e(String var1) {
        for (int var3 = 0; var3 < this.ao.size(); ++var3) {
            VDTT_ek var2;
            if ((var2 = (VDTT_ek) this.ao.elementAt(var3)).aD.equals(var1)) {
                return var2;
            }
        }

        return null;
    }

    public static void a(VDTT_gx var0) {
        try {
            VDTT_ek.m().W();
            Message var1;
            (var1 = new Message((byte) 54)).b(var0.b);
            var1.l();
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void M() {
        String var1 = Caption.hL;
        String[] var2 = Caption.zA;
        this.a((MainScreen) (new VDTT_mb(this, var1, var2, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15})));
    }

    public final void f(Message var1) {
        try {
            byte var2;
            int var4;
            MainScreen var17;
            VDTT_p var18;
            Message var23;
            VDTT_cw var28;
            Message var32;
            switch (var2 = var1.b.a.readByte()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                    this.a(var2, var1);
                case 31:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 92:
                case 93:
                case 98:
                case 109:
                case 110:
                default:
                    break;
                case 50:
                    var23 = var1;
                    var28 = this;

                    try {
                        VDTT_ek.m().aQ = new Item[var23.b.a.readShort()];
                        VDTT_ek.m();
                        VDTT_ek.b(var23, VDTT_ek.m().aQ);
                        var28.a((MainScreen) (new VDTT_ju(var28)));
                        break;
                    } catch (Exception var8) {
                        VDTT_jb.a(var8);
                        return;
                    }
                case 51:
                    this.a((MainScreen) (new VDTT_le(this, Caption.hN, 0, 100)));
                    return;
                case 52:
                    this.a((MainScreen) (new VDTT_le(this, Caption.hO, 2, 101)));
                    return;
                case 53:
                    this.a((MainScreen) (new VDTT_lh(this)));
                    return;
                case 54:
                    var28 = this;
                    VDTT_ki var30 = null;

                    for (var4 = 0; var4 < var28.b.size(); ++var4) {
                        if (var28.b.get(var4) instanceof VDTT_ki) {
                            var30 = (VDTT_ki) var28.b.get(var4);
                            break;
                        }
                    }

                    if (var30 == null) {
                        var28.a((MainScreen) (new VDTT_ki(var28, var1)));
                        return;
                    }

                    for (var4 = var28.b.size() - 1; var4 >= 0; --var4) {
                        if (!var28.b.get(var4).equals(var30) && var28.b.get(var4) instanceof VDTT_ar) {
                            var28.b.remove(var4);
                        }
                    }

                    var30.a(var1);
                    var28.f();
                    break;
                case 55:
                    this.a((MainScreen) (new VDTT_le(this, Caption.hM, 0, 102)));
                    return;
                case 56:
                case 111:
                    if (DataCenter.l()) {
                        this.a((MainScreen) (new VDTT_jh(this)));
                    } else {
                        this.a((MainScreen) (new VDTT_ji(this, var1)));
                    }

                    return;
                case 57:
                    var28 = this;
                    VDTT_kw var25 = null;

                    for (var4 = 0; var4 < var28.b.size(); ++var4) {
                        if (var28.b.get(var4) instanceof VDTT_kw) {
                            var25 = (VDTT_kw) var28.b.get(var4);
                            break;
                        }
                    }

                    if (var25 == null) {
                        var28.a((MainScreen) (new VDTT_kw(var28, var1)));
                        return;
                    }

                    for (var4 = var28.b.size() - 1; var4 >= 0; --var4) {
                        if (!var28.b.get(var4).equals(var25) && var28.b.get(var4) instanceof VDTT_ar) {
                            var28.b.remove(var4);
                        }
                    }

                    var25.a(var1);
                    var28.f();
                    break;
                case 58:
                    var32 = var1;

                    try {
                        (var18 = DataCenter.d().ai).h();
                        var18.a((MainScreen) (new VDTT_mt(var18, var32)));
                        break;
                    } catch (Exception var13) {
                        return;
                    }
                case 59:
                    var23 = var1;
                    var28 = this;

                    try {
                        String var21 = var23.j();
                        var28.a((MainScreen) (new VDTT_mz(var28, var21)));
                        break;
                    } catch (Exception var9) {
                        return;
                    }
                case 60:
                    this.a((MainScreen) (new VDTT_jz(this, new String[]{Caption.ms, Caption.P}, var2)));
                    return;
                case 61:
                    this.a((MainScreen) (new VDTT_jz(this, new String[]{Caption.ms, Caption.P}, var2)));
                    return;
                case 62:
                    this.a((MainScreen) (new VDTT_jz(this, new String[]{Caption.ms, Caption.P}, var2)));
                    return;
                case 63:
                    this.a((MainScreen) (new VDTT_jz(this, new String[]{Caption.ms, Caption.P}, var2)));
                    return;
                case 64:
                    this.a((MainScreen) (new VDTT_nb(this)));
                    return;
                case 65:
                    this.a((MainScreen) (new VDTT_na(this)));
                    return;
                case 66:
                    this.a((MainScreen) (new VDTT_nd(this)));
                    return;
                case 67:
                    this.a((MainScreen) (new VDTT_nc(this)));
                    return;
                case 68:
                    this.a((MainScreen) (new VDTT_jz(this, new String[]{Caption.mt, Caption.P}, var2)));
                    return;
                case 69:
                    this.a((MainScreen) (new VDTT_jz(this, new String[]{Caption.mt, Caption.P}, var2)));
                    return;
                case 70:
                    this.a((MainScreen) (new VDTT_jz(this, new String[]{Caption.mt, Caption.P}, var2)));
                    return;
                case 71:
                    this.a((MainScreen) (new VDTT_jz(this, new String[]{Caption.mt, Caption.P}, var2)));
                    return;
                case 72:
                    MainScreen var20;
                    if (!((var20 = super.c) instanceof VDTT_mr)) {
                        this.a((MainScreen) (new VDTT_mr(v(), var1)));
                        return;
                    }

                    VDTT_mr var31;
                    (var31 = (VDTT_mr) var20).a(var1);
                    break;
                case 73:
                    var32 = var1;

                    try {
                        (var18 = DataCenter.d().ai).h();
                        VDTT_le var29;
                        (var29 = new VDTT_le(var18, var32.j(), 0, 300)).a = var32.b.a.readShort();
                        var18.a((MainScreen) var29);
                        break;
                    } catch (Exception var12) {
                        return;
                    }
                case 74:
                    this.a((MainScreen) (new VDTT_kt(this, var1)));
                    return;
                case 75:
                    this.a((MainScreen) (new VDTT_ks(this)));
                    return;
                case 76:
                    this.a((MainScreen) (new VDTT_nh(this)));
                    return;
                case 77:
                    if (Gdx.app.getType() != ApplicationType.Android && Gdx.app.getType() != ApplicationType.iOS) {
                        break;
                    }

                    VDTT_d.g();
                    (new StringBuilder()).append(DataCenter.d().aE);
                    (new StringBuilder()).append(DataCenter.d().aF);
                    new VDTT_cy(this);
                    VDTT_d.g();
                    (new StringBuilder()).append(DataCenter.d().aE);
                    (new StringBuilder()).append(DataCenter.d().aC.b);
                    (new StringBuilder()).append(DataCenter.d().aF);
                    VDTT_ek.m();
                    (new StringBuilder()).append(VDTT_ek.m().w());
                    return;
                case 78:
                    this.a((MainScreen) (new VDTT_jz(this, Caption.zL, var2)));
                    return;
                case 79:
                    this.a((MainScreen) (new VDTT_kf(this)));
                    return;
                case 80:
                    var28 = this;

                    try {
                        var28.a((MainScreen) (new VDTT_mq(var28)));
                        break;
                    } catch (Exception var10) {
                        VDTT_jb.a(var10);
                        return;
                    }
                case 81:
                    this.a((MainScreen) (new VDTT_ni(this)));
                    return;
                case 82:
                    this.a((MainScreen) (new VDTT_nf(this)));
                    return;
                case 83:
                    this.a((MainScreen) (new VDTT_ng(this)));
                    return;
                case 84:
                    this.a((MainScreen) (new VDTT_mo(this)));
                    return;
                case 85:
                    this.a((MainScreen) (new VDTT_km(this)));
                    return;
                case 86:
                    var23 = var1;
                    var28 = this;

                    try {
                        byte var16 = 0;
                        if (var23.b.a.readBoolean()) {
                            var16 = var23.b.a.readByte();
                            var28.bk.a = var23.b.a.readByte();
                            var28.bk.b = var23.b.a.readByte();
                            var28.bk.c = var23.b.a.readByte();
                            var28.bk.d = var23.b.a.readBoolean();
                        } else {
                            var28.bk = new VDTT_eb();
                        }

                        VDTT_jp var27;
                        (var27 = new VDTT_jp(var28)).g(var16);
                        var28.a((MainScreen) var27);
                        break;
                    } catch (Exception var7) {
                        VDTT_jb.a(var7);
                        return;
                    }
                case 87:
                    this.a((MainScreen) (new VDTT_lt(this)));
                    return;
                case 88:
                    this.a((MainScreen) (new VDTT_ly(this, var1)));
                    return;
                case 89:
                    this.a((MainScreen) (new VDTT_lv(this, var1)));
                    return;
                case 90:
                    this.a((MainScreen) (new VDTT_mn(this)));
                    return;
                case 91:
                    this.a((MainScreen) (new VDTT_kh(this, var1)));
                    return;
                case 94:
                    this.a((MainScreen) (new VDTT_kv(this)));
                    return;
                case 95:
                    this.a((MainScreen) (new VDTT_mm(this)));
                    return;
                case 96:
                    var28 = this;

                    try {
                        var28.a((MainScreen) (new VDTT_li(var28)));
                        break;
                    } catch (Exception var11) {
                        VDTT_jb.a(var11);
                        return;
                    }
                case 97:
                    this.a((MainScreen) (new VDTT_lz(v(), var1)));
                    return;
                case 99:
                    this.a((MainScreen) (new VDTT_ko(v())));
                    return;
                case 100:
                    this.a((MainScreen) (new VDTT_ne(v())));
                    return;
                case 101:
                    this.a((MainScreen) (new VDTT_kn(this)));
                    return;
                case 102:
                    this.a((MainScreen) (new VDTT_kp(v())));
                    return;
                case 103:
                    this.a((MainScreen) (new VDTT_md(v())));
                    return;
                case 104:
                    this.a((MainScreen) (new VDTT_ku(v())));
                    return;
                case 105:
                    this.a((MainScreen) (new VDTT_jk(this)));
                    return;
                case 106:
                    this.a((MainScreen) (new VDTT_jz(this, new String[]{Caption.sh, Caption.P}, var2)));
                    return;
                case 107:
                    var28 = v();

                    try {
                        MainScreen var22;
                        if ((var22 = var28.c) instanceof VDTT_ar) {
                            ((VDTT_ar) var22).v();
                        }
                    } catch (Exception var6) {
                        VDTT_jb.a(var6);
                    }

                    this.a((MainScreen) (new VDTT_nl(this, var1)));
                    return;
                case 108:
                    VDTT_lb var26;
                    (var26 = new VDTT_lb(this)).W = var1.b.a.readByte();
                    this.a((MainScreen) var26);
                    return;
                case 112:
                    if ((var17 = super.c) instanceof VDTT_la) {
                        VDTT_la var24;
                        (var24 = (VDTT_la) var17).a = var1.b.a.readByte();
                        return;
                    }
                    break;
                case 113:
                    if ((var17 = super.c) instanceof VDTT_ji) {
                        VDTT_ji var19;
                        VDTT_ji var10000 = var19 = (VDTT_ji) var17;
                        byte var3 = var1.b.a.readByte();
                        var19 = var10000;
                        var10000.f(2);
                        var19.S = var3;
                        String[] var15 = VDTT_jb.a(VDTT_ji.Q[1][var19.S], "\\n");
                        var19.P.clear();

                        for (var4 = 0; var4 < var15.length; ++var4) {
                            var19.P.addAll(VDTT_dg.a(VDTT_dg.d, var15[var4], var19.q - 8 - 35));
                        }

                        if (var19.T != null && var19.T[var19.S] != null) {
                            var19.O[2][1] = new VDTT_hs((byte) 1, 13, var19.f() + 45, var19.q - 8 - 18, 120, 15, var19.P.size());
                        } else {
                            var19.O[2][1] = new VDTT_hs((byte) 1, 13, var19.f() + 45, var19.q - 8 - 18, 150, 15, var19.P.size());
                        }

                        var19.R = true;
                    }

                    return;
                case 114:
                    this.a((MainScreen) (new VDTT_kt2(this, var1)));
                    return;
            }

        } catch (Exception var14) {
            VDTT_jb.a(var14);
        }
    }

    private void a(byte var1, Message var2) {
        try {
            this.Y.clear();
            short var3;
            Item[][] var5 = new Item[var3 = var2.b.a.readShort()][3];
            boolean[] var6 = new boolean[var3];
            byte var7 = 0;
            boolean var8 = false;

            Item var4;
            for (int var9 = 0; var9 < var3; ++var9) {
                (var4 = new Item()).b = var2.b.a.readShort();
                var4.c = var2.b.a.readShort();
                var4.t = var2.b.a.readBoolean();
                var4.h = var2.b.a.readLong();
                var4.strOptions = var2.b.c();
                var4.o = var2.b.a.readInt();
                var4.m = var2.b.a.readInt();
                var4.n = var2.b.a.readInt();
                var4.l = var2.b.a.readInt();
                var4.k = var2.b.a.readInt();
                var4.r = var2.b.a.readInt();
                this.Y.add(var4);
                if (var1 == 39) {
                    var6[var9] = var2.b.a.readBoolean();

                    for (int var10 = 0; var10 < var5[var9].length; ++var10) {
                        var5[var9][var10] = new Item();
                        var5[var9][var10].a(var2);
                    }
                } else if (var1 == 40) {
                    var4.q = var2.b.a.readInt();
                    var4.e = var2.b.a.readInt();
                    if (var4.e > 1) {
                        var4.c(var4.e);
                    }
                }
            }

            long var33 = -1L;
            long var11 = -1L;
            if (var1 == 40) {
                var33 = var2.b.a.readLong();
                var11 = var2.b.a.readLong();
                var8 = var2.b.a.readBoolean();
                var7 = var2.b.a.readByte();
            }

            byte var23 = 0;
            String var24 = "";
            int var14;
            int var30;
            switch (var1) {
                case 0:
                    var24 = Caption.yG[0];
                    break;
                case 1:
                    var24 = Caption.yG[0];
                    var23 = 1;
                    break;
                case 2:
                    var24 = Caption.yH[0];
                    break;
                case 3:
                    var24 = Caption.yH[0];
                    var23 = 1;
                    break;
                case 4:
                    var24 = Caption.yI[0];
                    break;
                case 5:
                    var24 = Caption.yI[0];
                    var23 = 1;
                case 6:
                case 31:
                default:
                    break;
                case 7:
                    var23 = 1;
                    break;
                case 8:
                case 20:
                    var24 = Caption.aE;
                    break;
                case 9:
                case 21:
                    var24 = Caption.aQ;
                    break;
                case 10:
                case 22:
                    var24 = Caption.aR;
                    break;
                case 11:
                case 23:
                    var24 = Caption.aS;
                    break;
                case 12:
                case 24:
                    var24 = Caption.aT;
                    break;
                case 13:
                case 25:
                    var24 = Caption.aU;
                    break;
                case 14:
                case 26:
                    var24 = Caption.aW;
                    break;
                case 15:
                case 27:
                    var24 = Caption.aX;
                    break;
                case 16:
                case 28:
                    var24 = Caption.aY;
                    break;
                case 17:
                case 29:
                    var24 = Caption.aZ;
                    break;
                case 18:
                    var24 = Caption.bU;
                    break;
                case 19:
                    var24 = Caption.aH;
                    var23 = 2;
                    break;
                case 30:
                    var24 = Caption.aH;
                    var23 = 3;
                    break;
                case 32:
                case 33:
                case 34:
                case 36:
                    var24 = Caption.bb;
                    break;
                case 35:
                    var24 = Caption.aH;
                    var23 = 4;
                    break;
                case 37:
                    var24 = Caption.aH;
                    var23 = 0;
                    break;
                case 38:
                    var24 = Caption.aH;
                    var23 = 1;
                    break;
                case 39:
                    var23 = 2;
                    break;
                case 40:
                    var23 = 3;
                    break;
                case 41:
                    VDTT_ki var25;
                    if (super.c instanceof VDTT_ki && (var25 = (VDTT_ki) super.c).T == null) {
                        var25.T = new Item[v().Y.size()];
                        var25.ad = new VDTT_ht((byte) 1, 12, var25.ac.objY + 7 + 34, var25.ag * 3, var25.ah * 3, var25.ah, VDTT_jb.c(var25.T.length, 3), 3);
                        var25.af = new VDTT_ba[var25.T.length];
                        var25.ae = new VDTT_hs[var25.T.length];
                        int var13 = 0;

                        for (var14 = 0; var14 < var25.ad.i; ++var14) {
                            var30 = var14 * var25.ah;

                            for (int var15 = 0; var15 < var25.ad.P; ++var15) {
                                int var28 = var15 * var25.ag;
                                var25.T[var13] = (Item) v().Y.elementAt(var13);
                                var25.af[var13] = new VDTT_ba(var28 + 40, var30 + 14, 0, 0, "", var25, 1000, -25);
                                var25.ae[var13] = new VDTT_hx((byte) 1, 0, 0, var25.af[var14].q, var25.af[var14].r, var25.af[var14].r, 1, var25.ad);
                                ++var13;
                                if (var13 >= var25.af.length) {
                                    break;
                                }
                            }

                            if (var13 >= var25.af.length) {
                                break;
                            }
                        }
                    }

                    return;
            }

            MainScreen var26 = super.c;
            if (var1 != 6 && var1 != 7 && var1 != 39 && var1 != 40) {
                VDTT_mj var35;
                if (var26 instanceof VDTT_mj) {
                    (var35 = (VDTT_mj) var26).g(var23);
                } else {
                    var35 = new VDTT_mj(this, var1, var24, var23);
                    this.a((MainScreen) var35);
                }

                if (MenuConfig.P) {
                    MenuConfig.P = false;
                    int var22;
                    if ((var22 = VDTT_ek.m().D()) > 3) {
                        var22 = 3;
                    } else if (var22 <= 0) {
                        var22 = 1;
                    }

                    int var32 = VDTT_ek.m().w() / 5 * 5;
                    int var36 = 0;

                    while (true) {
                        if (var36 >= this.Y.size()) {
                            return;
                        }

                        if ((var4 = (Item) this.Y.get(var36)).getItemTemplate().f == 24 && var4.getItemTemplate().i == var32) {
                            (var2 = new Message((byte) 121)).b(var4.b);
                            var2.b(var22);
                            var2.l();
                            break;
                        }

                        ++var36;
                    }
                } else if (MenuConfig.R) {
                    MenuConfig.R = false;
                    this.bO = 10;
                }

                return;
            } else {
                VDTT_lq var34;
                if (var26 instanceof VDTT_lq) {
                    var34 = (VDTT_lq) var26;
                } else {
                    var34 = new VDTT_lq(this);
                    this.a((MainScreen) var34);
                }

                boolean[] var37 = var6;
                Item[][] var31 = var5;
                byte var29 = var23;
                VDTT_lq var27 = var34;
                if (var34.R[var34.Y.h()] == null) {
                    var34.ar[var23] = false;
                    var34.R[var23] = new Item[v().Y.size()];
                    var14 = var34.ap;
                    byte var38 = 3;
                    if (var23 == 3) {
                        var38 = 2;
                        var14 = 75;
                    }

                    if (DataCenter.l()) {
                        var34.aa[var23] = new VDTT_ht((byte) 1, 10, var34.f() + 15 + 8, var34.ao, var14 * var38, var14, var34.R[var23].length, 1);
                    } else {
                        var34.aa[var23] = new VDTT_ht((byte) 1, 10, var34.f() + 15 + 22, var34.ao * 3, var14 * var38, var14, VDTT_jb.c(var34.R[var23].length, 3), 3);
                    }

                    var34.an[var23] = new VDTT_ba[var34.R[var23].length];
                    var34.am[var23] = new VDTT_hs[var34.R[var23].length];
                    int var18 = 0;

                    int var16;
                    int var17;
                    int var20;
                    for (int var19 = 0; var19 < var27.aa[var29].i; ++var19) {
                        var17 = var19 * var14;

                        for (var20 = 0; var20 < var27.aa[var29].P; ++var20) {
                            var16 = var20 * var27.ao;
                            var27.R[var29][var18] = (Item) v().Y.elementAt(var18);
                            if (var29 == 3) {
                                var27.an[var29][var18] = new VDTT_ba(var16 + 38, var17 + 47, 0, 0, "", var27, 1000, var27.R[var29][var18].d());
                                var27.am[var29][var18] = new VDTT_hx((byte) 1, 0, 0, var27.an[var29][var19].q, var27.an[var29][var19].r, var27.an[var29][var19].r, 1, var27.aa[var29]);
                            } else if (DataCenter.l()) {
                                var27.an[var29][var18] = new VDTT_ba(var16 + var27.ao - 60, var17 + 14, 0, 0, "", var27, 1000, var27.R[var29][var18].d());
                                var27.am[var29][var18] = new VDTT_hx((byte) 1, 0, 0, var27.an[var29][var19].q, var27.an[var29][var19].r, var27.an[var29][var19].r, 1, var27.aa[var29]);
                            } else {
                                var27.an[var29][var18] = new VDTT_ba(var16 + 40, var17 + 14, 0, 0, "", var27, 1000, var27.R[var29][var18].d());
                                var27.am[var29][var18] = new VDTT_hx((byte) 1, 0, 0, var27.an[var29][var19].q, var27.an[var29][var19].r, var27.an[var29][var19].r, 1, var27.aa[var29]);
                            }

                            ++var18;
                            if (var18 >= var27.an[var29].length) {
                                break;
                            }
                        }

                        if (var18 >= var27.an[var29].length) {
                            break;
                        }
                    }

                    if (var29 == 2) {
                        VDTT_hn[] var39 = new VDTT_hn[var27.R[var29].length];

                        for (var20 = 0; var20 < var31.length; ++var20) {
                            var39[var20] = new VDTT_hn(Caption.uq + (var20 + 1), var31[var20], var37[var20]);
                        }

                        var27.S = var39;
                        var27.ar[var29] = false;
                        var27.aa[var29] = new VDTT_ht((byte) 1, 10, var27.f() + 15 + 22, var27.ao * 3, var14 * var38, var27.aq, VDTT_jb.c(var39.length, 3), 3);
                        var27.am[var29] = new VDTT_hs[var39.length];
                        var18 = 0;

                        for (var20 = 0; var20 < var27.aa[var29].i; ++var20) {
                            var17 = var20 * var27.aq;

                            for (var30 = 0; var30 < var27.aa[var29].P; ++var30) {
                                var16 = var30 * var27.ao;
                                var27.R[var29][var18] = (Item) v().Y.elementAt(var18);
                                var27.an[var29][var18] = new VDTT_ba(var16 + 51, var17 + 48, 0, 0, "", var27, 1000, var27.R[var29][var18].d());
                                var27.an[var29][var18].a(var39[var18].c);
                                var27.am[var29][var18] = new VDTT_hx((byte) 1, 0, 0, var27.an[var29][var20].q, var27.an[var29][var20].r, var27.an[var29][var20].r, 1, var27.aa[var29]);
                                ++var18;
                                if (var18 >= var27.an[var29].length) {
                                    break;
                                }
                            }

                            if (var18 >= var27.an[var29].length) {
                                break;
                            }
                        }
                    }
                }

                if (var1 == 40) {
                    var34.U = var33;
                    var34.V = var11;
                    var34.as = var8;
                    var34.at = var7;
                    var34.f(2);
                    var34.Y.a(var23);
                    var34.G();
                }
            }
        } catch (Exception var21) {
            VDTT_jb.a(var21);
        }

    }

    public static void n(int var0) {
        try {
            Message var1;
            (var1 = new Message((byte) 117)).a(var0);
            var1.l();
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public static void a(Item var0, boolean var1) {
        try {
            Message var3;
            (var3 = new Message((byte) 119)).b(var0.f);
            var3.a(false);
            var3.l();
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public static void g(Message var0) {
        try {
            String var3;
            if ((var3 = var0.b.c()) != null && var3.length() > 0) {
                if (Gdx.app.getType() == ApplicationType.Android) {
                    VDTT_d.g();
                    var3 = null;
                } else if (Gdx.app.getType() == ApplicationType.iOS) {
                    VDTT_d.g();
                }

                try {
                    Gdx.net.openURI(var3);
                } catch (Exception var1) {
                    VDTT_jb.a(var1);
                }
            }

            Message.c((byte) 21).l();
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public static void o(int var0) {
        try {
            Message var1;
            (var1 = new Message((byte) 122)).a(var0);
            var1.l();
        } catch (Exception var2) {
        }
    }

    public static void i(int var0, int var1) {
        try {
            Message var2;
            (var2 = new Message((byte) 122)).a(var0);
            var2.a(var1);
            var2.l();
        } catch (Exception var3) {
        }
    }

    public static void h(Message var0) {
        try {
            VDTT_ek.m().b(var0.b.a.readInt(), false, true);
            VDTT_ek.m().a(var0.b.a.readInt(), false, true);
            VDTT_ek.m().aP[var0.b.a.readShort()] = null;
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public static void i(Message var0) {
        try {
            short var1 = var0.b.a.readShort();
            int var2 = var0.b.a.readInt();
            VDTT_ek.m().aP[var1].c(var2);
            VDTT_ek.m().aP[var1].f = var1;
            short var6 = var0.b.a.readShort();
            int var5 = var0.b.a.readInt();
            VDTT_ek.m().aP[var6] = VDTT_ek.m().aP[var1].a();
            VDTT_ek.m().aP[var6].c(var5);
            VDTT_ek.m().aP[var6].f = var6;
        } catch (Exception var4) {
        }
    }

    public final void j(Message var1) {
        try {
            Item[] var4 = new Item[VDTT_ek.m().j(var1.b.a.readShort())];

            for (int var2 = 0; var2 < VDTT_ek.m().aP.length; ++var2) {
                var4[var2] = VDTT_ek.m().aP[var2];
            }

            VDTT_ek.m().aP = var4;
            MainScreen var5;
            if ((var5 = super.c) instanceof VDTT_jr) {
                ((VDTT_jr) var5).A();
            }

        } catch (Exception var3) {
        }
    }

    public static void k(Message var0) {
        try {
            short var1 = var0.b.a.readShort();
            short var4 = var0.b.a.readShort();
            Item var2 = VDTT_ek.m().aP[var1];
            VDTT_ek.m().aP[var1] = null;
            if (VDTT_ek.m().aQ[var4] == null) {
                VDTT_ek.m().aQ[var4] = var2;
                VDTT_ek.m().aQ[var4].f = var4;
                return;
            }

            VDTT_ek.m().aQ[var4].c(VDTT_ek.m().aQ[var4].M() + var2.M());
        } catch (Exception var3) {
        }

    }

    public static void l(Message var0) {
        try {
            short var1 = var0.b.a.readShort();
            short var4 = var0.b.a.readShort();
            Item var2 = VDTT_ek.m().aQ[var1];
            VDTT_ek.m().aQ[var1] = null;
            if (VDTT_ek.m().aP[var4] == null) {
                VDTT_ek.m().aP[var4] = var2;
                VDTT_ek.m().aP[var4].f = var4;
                return;
            }

            VDTT_ek.m().aP[var4].c(VDTT_ek.m().aP[var4].M() + var2.M());
        } catch (Exception var3) {
        }

    }

    public static void N() {
        try {
            Message var0;
            (var0 = new Message((byte) 35)).a((int) 4);
            var0.l();
        } catch (Exception var1) {
            VDTT_jb.a(var1);
        }
    }

    public final void m(Message var1) {
        try {
            VDTT_ek var2 = this.m(var1.b.a.readInt());
            VDTT_fs var3;
            (var3 = new VDTT_fs()).J = var1.b.a.readInt();
            var3.b = var1.b.a.readShort();
            var3.a(var1.b.a.readShort(), var1.b.a.readShort(), var2.k(), var2.l());
            var3.k = new Item();
            var3.k.a(var1);
            this.ar.addElement(var3);
            VDTT_ac var6;
            if (!(var6 = VDTT_ac.b()).a) {
                var6.a(10);
            }

        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public final void n(Message var1) {
        try {
            short var2 = var1.b.a.readShort();
            VDTT_cw var4 = this;
            int var5 = 0;

            VDTT_fs var10000;
            while (true) {
                if (var5 >= var4.ar.size()) {
                    var10000 = null;
                    break;
                }

                VDTT_fs var3;
                if ((var3 = (VDTT_fs) var4.ar.elementAt(var5)).b == var2) {
                    var10000 = var3;
                    break;
                }

                ++var5;
            }

            VDTT_fs var8 = var10000;
            if (var10000 != null) {
                var8.p = true;
                VDTT_ek var9;
                if ((var9 = this.m(var1.b.a.readInt())).b == VDTT_ek.m().b) {
                    Item var10;
                    (var10 = new Item()).a(var1);
                    int var7 = var10.M();
                    if (var9.aP[var10.f] != null) {
                        var7 -= var9.aP[var10.f].M();
                    }

                    var9.aP[var10.f] = var10;
                    a(var7, var10);
                    VDTT_ac var11;
                    if (!(var11 = VDTT_ac.b()).a) {
                        var11.a(11);
                    }
                }

                var8.I = 20;
                var8.a(var9.k(), var9.l(), var8.objX, var8.objY);
            }

        } catch (Exception var6) {
            VDTT_jb.a(var6);
        }
    }

    public final void o(Message var1) {
        try {
            short var5 = var1.b.a.readShort();
            int var2 = 0;

            while (true) {
                if (var2 >= this.ar.size()) {
                    return;
                }

                if (((VDTT_fs) this.ar.elementAt(var2)).b == var5) {
                    this.ar.remove(var2);
                    break;
                }

                ++var2;
            }
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }

    }

    public static void p(Message var0) {
        try {
            int var1;
            for (var1 = 0; var1 < VDTT_ek.m().aP.length; ++var1) {
                VDTT_ek.m().aP[var1] = null;
            }

            for (var1 = 0; var1 < VDTT_ek.m().aR.length; ++var1) {
                VDTT_ek.m().aR[var1] = null;
            }

            for (var1 = 0; var1 < VDTT_ek.m().aS.length; ++var1) {
                VDTT_ek.m().aS[var1] = null;
            }

            VDTT_ek.m().ak = var0.b.a.readInt();
            short var6 = var0.b.a.readShort();

            for (int var2 = 0; var2 < var6; ++var2) {
                Item var3;
                (var3 = new Item()).a(var0);
                VDTT_ek.m().aP[var3.f] = var3;
            }

            VDTT_ek.m();
            VDTT_ek.a(var0, VDTT_ek.m().aR);
            VDTT_ek.m();
            VDTT_ek.a(var0, VDTT_ek.m().aS);
            MainScreen var5;
            if ((var5 = v().c) instanceof VDTT_jr) {
                ((VDTT_jr) var5).A();
            }

        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void q(Message var1) {
        try {
            byte var2 = var1.b.a.readByte();

            for (int var3 = 0; var3 < var2; ++var3) {
                byte var4 = var1.b.a.readByte();
                VDTT_ek.m().i(var4)[var1.b.a.readShort()] = null;
            }

            Item var8;
            (var8 = new Item()).a(var1);
            var8.w = var1.b.a.readByte();
            if (var8.w == 2 || var8.w == 3) {
                var8.f = var8.getItemTemplate().f;
            }

            VDTT_ek.m().i(var8.w)[var8.f] = var8;
            MainScreen var9;
            if ((var9 = super.c) instanceof VDTT_nh) {
                VDTT_nh var6;
                (var6 = (VDTT_nh) var9).T = true;
                var6.S = new VDTT_hi(114, 0, 0, 1);

                for (int var7 = 0; var7 < var6.ab.length; ++var7) {
                    var6.ab[var7] = null;
                }

                var6.O = var8;
            }

        } catch (Exception var5) {
        }
    }

    public final void r(Message var1) {
        try {
            byte var2 = var1.b.a.readByte();

            for (int var3 = 0; var3 < var2; ++var3) {
                byte var4 = var1.b.a.readByte();
                VDTT_ek.m().i(var4)[var1.b.a.readShort()] = null;
            }

            Item var8;
            (var8 = new Item()).a(var1);
            var8.w = var1.b.a.readByte();
            if (var8.w == 2 || var8.w == 3) {
                var8.f = var8.getItemTemplate().f;
            }

            VDTT_ek.m().i(var8.w)[var8.f] = var8;
            MainScreen var9;
            if ((var9 = super.c) instanceof VDTT_jk) {
                VDTT_jk var6;
                (var6 = (VDTT_jk) var9).T = true;
                var6.S = new VDTT_hi(114, 0, 0, 1);

                for (int var7 = 0; var7 < var6.ab.length; ++var7) {
                    var6.ab[var7] = null;
                }

                var6.O = var8;
            }

        } catch (Exception var5) {
        }
    }

    public final void s(Message var1) {
        try {
            VDTT_ek.m().a(var1.b.a.readInt(), false, false);
            VDTT_ek.m().b(var1.b.a.readInt(), false, false);
            byte var2 = var1.b.a.readByte();

            for (int var3 = 0; var3 < var2; ++var3) {
                VDTT_ek.m().aP[var1.b.a.readShort()] = null;
            }

            Item var9;
            (var9 = new Item()).a(var1);
            VDTT_ek.m().aP[var9.f] = var9;
            MainScreen var6;
            if (!((var6 = super.c) instanceof VDTT_ni)) {
                DataCenter.d().ai.c(Caption.pA + " " + var9.getItemTemplate().b, -2560);
                return;
            }

            VDTT_ni var7;
            (var7 = (VDTT_ni) var6).R = new VDTT_hi(114, 0, 0, 1);

            for (int var8 = 0; var8 < var7.P.length; ++var8) {
                var7.P[var8] = null;
            }

            var7.O = var9;
        } catch (Exception var5) {
        }

    }

    public final void t(Message var1) {
        try {
            boolean var2 = var1.b.a.readBoolean();
            boolean var3 = var1.b.a.readBoolean();
            VDTT_ek.m().a(var1.b.a.readInt(), false, false);
            VDTT_ek.m().b(var1.b.a.readInt(), false, false);
            byte var4 = var1.b.a.readByte();
            int var10;
            if (!var3) {
                for (var10 = 0; var10 < var4; ++var10) {
                    VDTT_ek.m().aP[var1.b.a.readShort()] = null;
                }
            } else {
                for (var10 = 0; var10 < var4; ++var10) {
                    var1.b.a.readShort();
                }

                MainScreen var11;
                if ((var11 = super.c) instanceof VDTT_nf) {
                    VDTT_nf var12;
                    (var12 = (VDTT_nf) var11).C();
                }
            }

            short var13;
            if ((var13 = var1.b.a.readShort()) >= 0) {
                VDTT_ek.m().aP[var13] = null;
            }

            Item var14;
            (var14 = new Item()).a(var1);
            var14.w = var1.b.a.readByte();
            if (var14.w == 2 || var14.w == 3) {
                var14.f = var14.getItemTemplate().f;
            }

            VDTT_ek.m().i(var14.w)[var14.f] = var14;
            MainScreen var7;
            if ((var7 = super.c) instanceof VDTT_nf) {
                VDTT_nf var8;
                (var8 = (VDTT_nf) var7).R[0] = 100;
                var8.T = new VDTT_hi(114, 0, 0);
                if (var2) {
                    var8.S = 1;
                } else {
                    var8.S = 2;
                }

                int var9;
                for (var9 = 0; var9 < var8.P.length; ++var9) {
                    var8.P[var9] = null;
                }

                for (var9 = 0; var9 < var8.O.length; ++var9) {
                    var8.O[var9] = null;
                }

                var8.O[0] = var14;
                VDTT_ek.m().i(var14.w)[var14.f] = null;
            }

        } catch (Exception var6) {
        }
    }

    public final void u(Message var1) {
        try {
            VDTT_ek.m().aP[var1.b.a.readShort()] = null;
            Item var2;
            (var2 = new Item()).a(var1);
            var2.w = var1.b.a.readByte();

            try {
                VDTT_ek.m().aP[var1.b.a.readShort()] = null;
            } catch (Exception var4) {
            }

            if (var2.w == 2 || var2.w == 3) {
                var2.f = var2.getItemTemplate().f;
            }

            VDTT_ek.m().i(var2.w)[var2.f] = var2;
            MainScreen var6;
            if ((var6 = super.c) instanceof VDTT_lt) {
                VDTT_lt var7;
                (var7 = (VDTT_lt) var6).R[2] = 50;
                var7.S = new VDTT_hi(114, 0, 0);

                int var3;
                for (var3 = 0; var3 < var7.P.length; ++var3) {
                    var7.P[var3] = null;
                }

                for (var3 = 0; var3 < var7.O.length; ++var3) {
                    var7.O[var3] = null;
                }

                var7.O[0] = var2;
                VDTT_ek.m().i(var2.w)[var2.f] = null;
            }

        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public final void v(Message var1) {
        try {
            VDTT_lb var6;
            if (!var1.b.a.readBoolean()) {
                MainScreen var7;
                if ((var7 = super.c) instanceof VDTT_lb) {
                    (var6 = (VDTT_lb) var7).T = 2;
                    var6.R[0] = 50;
                    var6.S = new VDTT_hi(114, 0, 0);
                }

            } else {
                Item var2;
                (var2 = new Item()).a(var1);
                var2.w = var1.b.a.readByte();
                if (var2.w == 2 || var2.w == 3) {
                    var2.f = var2.getItemTemplate().f;
                }

                VDTT_ek.m().i(var2.w)[var2.f] = null;
                (var2 = new Item()).a(var1);
                var2.w = var1.b.a.readByte();
                if (var2.w == 2 || var2.w == 3) {
                    var2.f = var2.getItemTemplate().f;
                }

                VDTT_ek.m().i(var2.w)[var2.f] = var2;
                MainScreen var5;
                if ((var5 = super.c) instanceof VDTT_lb) {
                    (var6 = (VDTT_lb) var5).T = 1;
                    var6.R[0] = 50;
                    var6.S = new VDTT_hi(114, 0, 0);

                    int var3;
                    for (var3 = 0; var3 < var6.P.length; ++var3) {
                        var6.P[var3] = null;
                    }

                    for (var3 = 0; var3 < var6.O.length; ++var3) {
                        var6.O[var3] = null;
                    }

                    var6.O[1] = var2;
                }

            }
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void w(Message var1) {
        try {
            Item var2;
            (var2 = new Item()).a(var1);
            var2.w = var1.b.a.readByte();
            if (var2.w == 2 || var2.w == 3) {
                var2.f = var2.getItemTemplate().f;
            }

            VDTT_ek.m().i(var2.w)[var2.f] = var2;
            MainScreen var5;
            if ((var5 = super.c) instanceof VDTT_mo) {
                VDTT_mo var6;
                (var6 = (VDTT_mo) var5).R = true;
                var6.S = new VDTT_hi(114, 0, 0);

                int var3;
                for (var3 = 0; var3 < var6.P.length; ++var3) {
                    var6.P[var3] = null;
                }

                for (var3 = 0; var3 < var6.O.length; ++var3) {
                    var6.O[var3] = null;
                }

                var6.O[1] = var2;
            }

        } catch (Exception var4) {
        }
    }

    public final void x(Message var1) {
        try {
            Item var2;
            (var2 = new Item()).a(var1);
            var2.w = var1.b.a.readByte();
            if (var2.w == 2 || var2.w == 3) {
                var2.f = var2.getItemTemplate().f;
            }

            VDTT_ek.m().i(var2.w)[var2.f] = var2;
            MainScreen var5;
            if ((var5 = super.c) instanceof VDTT_mn) {
                VDTT_mn var6;
                (var6 = (VDTT_mn) var5).P = true;
                var6.T[0] = 50;
                var6.Q = new VDTT_hi(114, 0, 0);

                int var3;
                for (var3 = 0; var3 < var6.O.length; ++var3) {
                    var6.O[var3] = null;
                }

                for (var3 = 0; var3 < var6.ac.length; ++var3) {
                    var6.ac[var3] = null;
                }

                var6.ac[1] = var2;
            }

        } catch (Exception var4) {
        }
    }

    public final void y(Message var1) {
        try {
            Item var2;
            (var2 = new Item()).a(var1);
            var2.w = var1.b.a.readByte();
            if (var2.w == 2 || var2.w == 3) {
                var2.f = var2.getItemTemplate().f;
            }

            VDTT_ek.m().i(var2.w)[var2.f] = var2;
            Item var3;
            (var3 = new Item()).a(var1);
            var3.w = var1.b.a.readByte();
            if (var3.w == 2 || var3.w == 3) {
                var3.f = var3.getItemTemplate().f;
            }

            VDTT_ek.m().i(var3.w)[var3.f] = var3;
            VDTT_ek.m().aP[var1.b.a.readShort()] = null;
            MainScreen var6;
            if ((var6 = super.c) instanceof VDTT_km) {
                VDTT_km var7;
                (var7 = (VDTT_km) var6).Q = true;
                var7.R = new VDTT_hi(114, 0, 0);

                for (int var4 = 0; var4 < var7.O.length; ++var4) {
                    var7.O[var4] = null;
                }

                var7.O[0] = var2;
                var7.O[1] = var3;
            }

        } catch (Exception var5) {
        }
    }

    public final void z(Message var1) {
        try {
            Item var2;
            (var2 = new Item()).a(var1);
            var2.w = var1.b.a.readByte();
            if (var2.w == 2 || var2.w == 3) {
                var2.f = var2.getItemTemplate().f;
            }

            VDTT_ek.m().i(var2.w)[var2.f] = var2;
            Item var3;
            (var3 = new Item()).a(var1);
            var3.w = var1.b.a.readByte();
            if (var3.w == 2 || var3.w == 3) {
                var3.f = var3.getItemTemplate().f;
            }

            VDTT_ek.m().i(var3.w)[var3.f] = var3;
            VDTT_ek.m().aP[var1.b.a.readShort()] = null;
            MainScreen var6;
            if ((var6 = super.c) instanceof VDTT_kn) {
                VDTT_kn var7;
                (var7 = (VDTT_kn) var6).O = true;
                var7.P = new VDTT_hi(114, 0, 0);

                for (int var4 = 0; var4 < var7.ab.length; ++var4) {
                    var7.ab[var4] = null;
                }

                var7.ab[0] = var2;
                var7.ab[1] = var3;
            }

        } catch (Exception var5) {
        }
    }

    public final void A(Message var1) {
        try {
            Item var2;
            (var2 = new Item()).a(var1);
            var2.w = var1.b.a.readByte();
            if (var2.w == 2 || var2.w == 3) {
                var2.f = var2.getItemTemplate().f;
            }

            VDTT_ek.m().i(var2.w)[var2.f] = var2;
            byte var3 = var1.b.a.readByte();

            for (int var4 = 0; var4 < var3; ++var4) {
                VDTT_ek.m().aP[var1.b.a.readShort()] = null;
            }

            MainScreen var9;
            if ((var9 = super.c) instanceof VDTT_ng) {
                VDTT_ng var7;
                (var7 = (VDTT_ng) var9).R = 100;
                var7.S = new VDTT_hi(114, 0, 0);

                for (int var8 = 0; var8 < var7.P.length; ++var8) {
                    var7.P[var8] = null;
                }

                var7.O[0] = var2;
                VDTT_ek.m().i(var2.w)[var2.f] = null;
            }

        } catch (Exception var6) {
        }
    }

    public final void B(Message var1) {
        try {
            Item var2;
            (var2 = new Item()).a(var1);
            var2.w = var1.b.a.readByte();
            if (var2.w == 2 || var2.w == 3) {
                var2.f = var2.getItemTemplate().f;
            }

            VDTT_ek.m().i(var2.w)[var2.f] = var2;
            byte var3 = var1.b.a.readByte();

            for (int var4 = 0; var4 < var3; ++var4) {
                VDTT_ek.m().aP[var1.b.a.readShort()] = null;
            }

            int var11;
            MainScreen var12;
            if ((var12 = super.c) instanceof VDTT_nb) {
                VDTT_nb var7;
                (var7 = (VDTT_nb) var12).S = new VDTT_hi(114, 0, 0);
                var7.R = 200;
                var7.T = true;

                for (var11 = 0; var11 < var7.P.length; ++var11) {
                    var7.P[var11] = null;
                }

                var7.O[0] = null;
                var7.O[1] = var2;
            } else if (var12 instanceof VDTT_na) {
                VDTT_na var8;
                (var8 = (VDTT_na) var12).S = new VDTT_hi(114, 0, 0);
                var8.R = 200;
                var8.T = true;

                for (var11 = 0; var11 < var8.P.length; ++var11) {
                    var8.P[var11] = null;
                }

                var8.O[0] = null;
                var8.O[1] = var2;
            } else {
                if (!(var12 instanceof VDTT_nd)) {
                    if (var12 instanceof VDTT_nc) {
                        VDTT_nc var10;
                        (var10 = (VDTT_nc) var12).S = new VDTT_hi(114, 0, 0);
                        var10.R = 200;
                        var10.T = true;

                        for (var11 = 0; var11 < var10.P.length; ++var11) {
                            var10.P[var11] = null;
                        }

                        var10.O[0] = null;
                        var10.O[1] = var2;
                    }

                    return;
                }

                VDTT_nd var9;
                (var9 = (VDTT_nd) var12).S = new VDTT_hi(114, 0, 0);
                var9.R = 200;
                var9.T = true;

                for (var11 = 0; var11 < var9.P.length; ++var11) {
                    var9.P[var11] = null;
                }

                var9.O[0] = null;
                var9.O[1] = var2;
            }
        } catch (Exception var6) {
        }

    }

    public final void C(Message var1) {
        try {
            int var2 = v().bj.length;
            short var3 = var1.b.a.readShort();
            v().bj = new VDTT_ft[var1.b.a.readShort()];

            int var4;
            for (var4 = 0; var4 < v().bj.length; ++var4) {
                v().bj[var4] = new VDTT_ft();
                v().bj[var4].a = var1.b.a.readLong();
                v().bj[var4].b = var1.b.c();
                v().bj[var4].c = var1.b.a.readInt();
                v().bj[var4].d = var1.b.a.readInt();
                v().bj[var4].e = new Item();
                v().bj[var4].e.a(var1);
            }

            var4 = 0;

            while (true) {
                if (var4 >= this.b.size()) {
                    return;
                }

                if (this.b.get(var4) instanceof VDTT_lq) {
                    VDTT_lq var7 = (VDTT_lq) this.b.get(var4);
                    if (v().bj.length > 0) {
                        var7.P = var3;
                    } else if (var2 != v().bj.length) {
                        var7.P = var3;
                    }

                    var7.E();
                    break;
                }

                ++var4;
            }
        } catch (Exception var6) {
        }

    }

    public final void D(Message var1) {
        try {
            v().bi = new VDTT_ft[var1.b.a.readShort()];

            int var2;
            for (var2 = 0; var2 < v().bi.length; ++var2) {
                v().bi[var2] = new VDTT_ft();
                v().bi[var2].a = var1.b.a.readLong();
                v().bi[var2].b = VDTT_ek.m().aD;
                v().bi[var2].c = var1.b.a.readInt();
                v().bi[var2].d = var1.b.a.readInt();
                v().bi[var2].e = new Item();
                v().bi[var2].e.a(var1);
            }

            var2 = 0;

            while (true) {
                if (var2 >= this.b.size()) {
                    return;
                }

                if (this.b.get(var2) instanceof VDTT_lq) {
                    ((VDTT_lq) this.b.get(var2)).F();
                    break;
                }

                ++var2;
            }
        } catch (Exception var4) {
        }

    }

    public final void E(Message var1) {
        try {
            VDTT_ek.m().b(var1.b.a.readInt(), false, true);
            VDTT_ek.m().aP[var1.b.a.readShort()] = null;
            MainScreen var4;
            if ((var4 = super.c) instanceof VDTT_lq) {
                VDTT_lq var5;
                (var5 = var5 = (VDTT_lq) var4).O = null;
                var5.Z.a("");
                DataCenter.d().ai.c(Caption.hR, -2560);
            }
        } catch (Exception var3) {
        }
    }

    public final void F(Message var1) {
        try {
            VDTT_ek.m().a(var1.b.a.readInt(), false, true);
            int var3 = 0;

            while (true) {
                if (var3 >= this.b.size()) {
                    return;
                }

                if (this.b.get(var3) instanceof VDTT_lq) {
                    VDTT_lq var4;
                    (var4 = (VDTT_lq) this.b.get(var3)).D();
                    var4.C();
                    break;
                }

                ++var3;
            }
        } catch (Exception var2) {
        }

    }

    public final void G(Message var1) {
        try {
            v().Z.clear();
            short var2 = var1.b.a.readShort();

            for (int var3 = 0; var3 < var2; ++var3) {
                VDTT_fa var4;
                (var4 = new VDTT_fa()).a(var1);
                v().Z.add(var4);
            }

            MainScreen var6;
            if ((var6 = super.c) instanceof VDTT_ln) {
                VDTT_ln var7;
                (var7 = (VDTT_ln) var6).D();
            }

        } catch (Exception var5) {
        }
    }

    public static void H(Message var0) {
        try {
            VDTT_ek.m().c(var0.b.a.readInt(), false, false);
            VDTT_ek.m().a(var0.b.a.readInt(), false, true);
            VDTT_ek.m().b(var0.b.a.readInt(), false, false);
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public static void I(Message var0) {
        try {
            VDTT_ek.m().c(var0.b.a.readInt(), false, false);
            VDTT_ek.m().a(var0.b.a.readInt(), false, false);
            VDTT_ek.m().b(var0.b.a.readInt(), false, true);
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public static void J(Message var0) {
        try {
            VDTT_ek.m().a(var0.b.a.readInt(), var0.b.a.readBoolean(), true);
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public static void K(Message var0) {
        try {
            VDTT_ek.m().b(var0.b.a.readInt(), var0.b.a.readBoolean(), true);
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public static void L(Message var0) {
        try {
            VDTT_ek.m().c(var0.b.a.readInt(), var0.b.a.readBoolean(), true);
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public static void M(Message var0) {
        try {
            VDTT_ek.m();
            int var10001 = var0.b.a.readInt();
            boolean var10002 = var0.b.a.readBoolean();
            boolean var4 = true;
            boolean var2 = var10002;
            int var1 = var10001;
            String var5;
            if (var1 - VDTT_ek.m().am > 0) {
                var5 = Caption.q + " " + VDTT_jb.c(var1 - VDTT_ek.m().am) + " " + Caption.yP[1];
                if (VDTT_ek.V()) {
                    VDTT_bc.a(9, Caption.bY, var5);
                }

                if (var2) {
                    DataCenter.d().ai.c(var5, -1);
                }

                VDTT_fg.a("+" + VDTT_jb.c(var1 - VDTT_ek.m().am), VDTT_ek.m(), VDTT_ek.m().aK, 10);
            } else if (var1 - VDTT_ek.m().am < 0) {
                var5 = Caption.dw + " " + VDTT_jb.c(-(var1 - VDTT_ek.m().am)) + " " + Caption.yP[1];
                if (VDTT_ek.V()) {
                    VDTT_bc.a(9, Caption.bY, var5);
                }

                if (var2) {
                    DataCenter.d().ai.c(var5, -1);
                }

                VDTT_fg.a(VDTT_jb.c(var1 - VDTT_ek.m().am), VDTT_ek.m(), VDTT_ek.m().aK, 10);
            }

            VDTT_ek.m().am = var1;
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public final void a(Message var1, boolean var2) {
        try {
            this.ce = var1.b.a.readLong();
            this.b(var1, var2);
        } catch (Exception var4) {
        }
    }

    public final void b(Message var1, boolean var2) {
        try {
            long var3 = var1.b.a.readLong();
            VDTT_ek var5 = VDTT_ek.m();

            try {
                var5 = this.m(var1.b.a.readInt());
            } catch (Exception var7) {
            }

            int var9 = var5.w();
            var5.a(var3, var2);
            if (var5.w() != var9 && var5.p()) {
                this.aS.d();
                v().A();
                if (VDTT_d.g().g != null) {
                    VDTT_d.g();
                    (new StringBuilder()).append(DataCenter.d().aE);
                    (new StringBuilder()).append(DataCenter.d().aC.b);
                    (new StringBuilder()).append(DataCenter.d().aF);
                    (new StringBuilder()).append(var5.w());
                }
            }

        } catch (Exception var8) {
        }
    }

    public static void N(Message var0) {
        try {
            VDTT_cw var10000 = v();
            short var1 = var0.b.a.readShort();
            VDTT_cw var5 = var10000;
            int var3 = 0;

            VDTT_fa var7;
            while (true) {
                if (var3 >= var5.Z.size()) {
                    var7 = null;
                    break;
                }

                VDTT_fa var2;
                if ((var2 = (VDTT_fa) var5.Z.get(var3)).a == var1) {
                    var7 = var2;
                    break;
                }

                ++var3;
            }

            VDTT_fa var6 = var7;
            var7.e = null;
            var6.f = 0;
            var6.g = 0;
            var6.h = 0;
            var6.i = 0;
            var6.j = 0L;
            if (v().c.k != null && v().c.k instanceof VDTT_bp) {
                ((VDTT_bp) v().c.k).d();
            }

        } catch (Exception var4) {
        }
    }

    public static void a(Item[] var0) {
        try {
            Vector var1 = new Vector();

            for (int var2 = 0; var2 < var0.length; ++var2) {
                if (var0[var2] != null) {
                    var1.add(var0[var2]);
                }

                var0[var2] = null;
            }

            for (int var4 = 0; var4 < var1.size(); ++var4) {
                Item var7;
                if ((var7 = (Item) var1.get(var4)).getItemTemplate().d) {
                    for (int var5 = var1.size() - 1; var5 > var4; --var5) {
                        Item var3;
                        if ((var3 = (Item) var1.get(var5)).c == var7.c && var3.t == var7.t && var3.h == var7.h) {
                            var7.c(var7.M() + var3.M());
                            var1.remove(var5);
                        }
                    }
                }
            }

            for (short var8 = 0; var8 < var1.size(); var0[var8].f = var8++) {
                var0[var8] = (Item) var1.get(var8);
            }

        } catch (Exception var6) {
        }
    }

    public final void O(Message var1) {
        try {
            VDTT_ek.m().a(var1.b.a.readInt(), false, false);
            VDTT_ek.m().b(var1.b.a.readInt(), false, true);
            short var6;
            if ((var6 = var1.b.a.readShort()) >= 0) {
                VDTT_ek.m().aP[var6] = null;
            }

            MainScreen var7;
            if ((var7 = super.c) instanceof VDTT_lm) {
                VDTT_lm var8;
                VDTT_lm var2 = var8 = (VDTT_lm) var7;

                try {
                    String var3;
                    if ((var3 = var2.R.i().trim()).length() > 0) {
                        v().ab.remove(var3);
                        v().ab.insertElementAt(var3, 0);

                        for (int var9 = v().ab.size() - 1; var9 > 10; --var9) {
                            v().ab.removeElementAt(var9);
                        }
                    }
                } catch (Exception var4) {
                    VDTT_jb.a(var4);
                }

                var2.O.b(v().ab.size() == 0);
                VDTT_lm.C();
                var8.R.a("");
                var8.Q.a("");
                var8.P.a("");
                var8.S.a("");
                var8.T = null;
            }

            DataCenter.d().ai.c(Caption.hS, -2560);
        } catch (Exception var5) {
        }
    }

    public final void P(Message var1) {
        try {
            MainScreen var2;
            if ((var2 = super.c) instanceof VDTT_mz) {
                VDTT_mz var4;
                (var4 = (VDTT_mz) var2).k();
            }

            VDTT_ek.m().ak = var1.b.a.readInt();
            VDTT_ek.m();
            VDTT_ek.b(var1, VDTT_ek.m().aP);
        } catch (Exception var3) {
        }
    }

    public final void Q(Message var1) {
        try {
            MainScreen var2;
            if ((var2 = super.c) instanceof VDTT_mz) {
                VDTT_mz var6;
                (var6 = (VDTT_mz) var2).k();
            }

            VDTT_ek.m().a(var1.b.a.readInt(), false, true);
            short var7 = var1.b.a.readShort();

            int var3;
            for (var3 = 0; var3 < VDTT_ek.m().aP.length; ++var3) {
                VDTT_ek.m().aP[var3] = null;
            }

            for (var3 = 0; var3 < var7; ++var3) {
                Item var4;
                (var4 = new Item()).a(var1);
                VDTT_ek.m().aP[var4.f] = var4;
            }

            DataCenter.d().ai.c(Caption.hU, -2560);
        } catch (Exception var5) {
        }
    }

    public final void R(Message var1) {
        try {
            MainScreen var2;
            if ((var2 = super.c) instanceof VDTT_mz) {
                VDTT_mz var6;
                (var6 = (VDTT_mz) var2).P = 1;
                var6.R = var1.b.a.readInt();
                byte var3 = var1.b.a.readByte();

                for (int var4 = 0; var4 < var3; ++var4) {
                    var6.T[var4] = new Item();
                    var6.T[var4].a(var1);
                }

                if (var6.O == var6.P) {
                    var6.V = VDTT_jb.a() + 5999L;
                }
            }

        } catch (Exception var5) {
        }
    }

    public final void S(Message var1) {
        try {
            VDTT_fc var2;
            (var2 = new VDTT_fc()).b = var1.b.c();
            var2.c = var1.b.a.readBoolean();
            v().ac.add(var2);
            MainScreen var5;
            if ((var5 = super.c) instanceof VDTT_ms) {
                ((VDTT_ms) var5).C();
            }

        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void T(Message var1) {
        try {
            String var5 = var1.b.c();

            for (int var3 = 0; var3 < v().ac.size(); ++var3) {
                VDTT_fc var2;
                if ((var2 = (VDTT_fc) v().ac.elementAt(var3)).b.equals(var5)) {
                    v().ac.remove(var2);
                    break;
                }
            }

            MainScreen var6;
            if ((var6 = super.c) instanceof VDTT_ms) {
                ((VDTT_ms) var6).C();
            }

        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void U(Message var1) {
        try {
            String var2 = var1.b.c();

            for (int var4 = 0; var4 < v().ac.size(); ++var4) {
                VDTT_fc var3;
                if ((var3 = (VDTT_fc) v().ac.elementAt(var4)).b.equals(var2)) {
                    var3.c = var1.b.a.readBoolean();
                    break;
                }
            }

            MainScreen var6;
            if ((var6 = super.c) instanceof VDTT_ms) {
                ((VDTT_ms) var6).C();
            }

        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public final void V(Message var1) {
        try {
            VDTT_fj var2;
            (var2 = new VDTT_fj()).c = var1.b.c();
            var2.b = var1.b.a.readByte();
            var2.d = var1.b.a.readBoolean();
            v().aa.add(var2);
            this.O();
            MainScreen var5;
            if (!((var5 = super.c) instanceof VDTT_jj)) {
                if (var5 instanceof VDTT_ms) {
                    ((VDTT_ms) var5).B();
                }

                return;
            }

            VDTT_jj var6;
            (var6 = (VDTT_jj) var5).k();
            var6.a.B();
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }

    }

    public final void W(Message var1) {
        try {
            String var2 = var1.b.c();

            for (int var4 = 0; var4 < v().aa.size(); ++var4) {
                VDTT_fj var3;
                if ((var3 = (VDTT_fj) v().aa.get(var4)).c.equals(var2)) {
                    var3.b = var1.b.a.readByte();
                    var3.d = var1.b.a.readBoolean();
                    break;
                }
            }

            MainScreen var7;
            if ((var7 = super.c) instanceof VDTT_jj) {
                VDTT_jj var6;
                (var6 = (VDTT_jj) var7).k();
                var6.a.B();
            } else if (var7 instanceof VDTT_ms) {
                ((VDTT_ms) var7).B();
            }

            this.O();
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public final void O() {
        this.aZ = false;

        for (int var1 = 0; var1 < this.aa.size(); ++var1) {
            if (((VDTT_fj) this.aa.get(var1)).b == 2) {
                this.aZ = true;
                return;
            }
        }

    }

    public final void X(Message var1) {
        try {
            VDTT_fj var2;
            (var2 = new VDTT_fj()).c = var1.b.c();
            var2.b = var1.b.a.readByte();
            v().aa.add(var2);
            this.O();
            DataCenter.d().ai.c(var2.c + Caption.hV, -2560);
            MainScreen var5;
            if ((var5 = v().c) instanceof VDTT_ms) {
                ((VDTT_ms) var5).B();
            }

        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void Y(Message var1) {
        try {
            String var5 = var1.b.c();

            for (int var3 = 0; var3 < v().aa.size(); ++var3) {
                VDTT_fj var2;
                if ((var2 = (VDTT_fj) v().aa.get(var3)).c.equals(var5)) {
                    v().aa.remove(var2);
                    break;
                }
            }

            MainScreen var7;
            if ((var7 = v().c) instanceof VDTT_ms) {
                VDTT_ms var6;
                (var6 = (VDTT_ms) var7).B();
            }

            this.O();
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void Z(Message var1) {
        try {
            this.bk.a = var1.b.a.readByte();
            this.bk.b = var1.b.a.readByte();
            this.bk.c = var1.b.a.readByte();
            this.bk.d = var1.b.a.readBoolean();
            short var2 = var1.b.a.readShort();

            for (int var3 = 0; var3 < var2; ++var3) {
                Item var4;
                (var4 = new Item()).a(var1);
                if (var4.h == 0L) {
                    VDTT_ek.m().aP[var4.f] = null;
                } else {
                    VDTT_ek.m().aP[var4.f] = var4;
                }
            }

            MainScreen var6;
            if ((var6 = v().c) instanceof VDTT_jp) {
                VDTT_jp var7;
                (var7 = (VDTT_jp) var6).h(this.bk.b);
            }

        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public final void aa(Message var1) {
        try {
            this.bk.b = this.bk.c = this.bk.a = -1;
            this.bk.d = false;
            MainScreen var3;
            if ((var3 = v().c) instanceof VDTT_jp) {
                VDTT_jp var4 = (VDTT_jp) var3;
                var4.O = var4.P = -1;
            }

        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void ab(Message var1) {
        try {
            this.bk.a = var1.b.a.readByte();
            this.bk.b = var1.b.a.readByte();
            this.bk.c = var1.b.a.readByte();
            this.bk.d = var1.b.a.readBoolean();
            MainScreen var4;
            if ((var4 = v().c) instanceof VDTT_jp) {
                VDTT_jp var5;
                (var5 = (VDTT_jp) var4).h(this.bk.b);
            }

        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    private void a(VDTT_ic var1, boolean var2) {
        if (!this.ac() && !VDTT_ek.m().ah() && !VDTT_ek.m().bP && !VDTT_ek.m().bR) {
            this.bv = null;
            if (VDTT_ek.m().h()) {
                VDTT_ek.m().H();
            } else {
                this.aW = false;
                if (!VDTT_ek.m().L()) {
                    if (var1 == null) {
                        if (this.bg != null) {
                            this.aW = true;
                            this.bo = var1;
                            this.g(false);
                        }

                    } else {
                        VDTT_ek var10000;
                        Object var4;
                        if (var1.e()) {
                            var10000 = VDTT_ek.m();
                            var4 = null;
                            var10000.aV = (VDTT_ii) var4;
                            VDTT_ek.m().n();
                            VDTT_ek.m().a(var1, (VDTT_n) null, true);
                        } else if (var1.b().g == 6) {
                            this.c(Caption.hW, -1);
                        } else if (this.bg != null) {
                            this.aW = true;
                            this.bo = var1;
                            if (var1.i()) {
                                var10000 = VDTT_ek.m();
                                var4 = null;
                                var10000.aV = (VDTT_ii) var4;
                                VDTT_ek.m().n();
                            }

                            this.g(var2);
                        } else {
                            this.h(false);
                        }
                    }
                }
            }
        }
    }

    public static void a(Message var0, VDTT_ek var1) {
        try {
            if (var1 == null) {
                var1 = v().k(var0.b.a.readInt());
            }

            var1.ai = var0.b.a.readInt();
            var1.ag = var0.b.a.readInt();
        } catch (Exception var3) {
        }
    }

    public final void ac(Message var1) {
        try {
            VDTT_ek var2 = this.m(var1.b.a.readInt());
            int var5 = var1.b.a.readInt();
            var2.aq = var5;
            if (var2.bV != null) {
                var2.bV.ag = var5;
            }
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public static void a(Message var0, VDTT_ek var1, boolean var2) {
        try {
            byte var3 = 3;
            if (var1 == null) {
                var1 = v().k(var0.b.a.readInt());
                var3 = 0;
            }

            if (var1 != null) {
                int var6;
                if (var2) {
                    var6 = var0.b.a.readShort();
                } else {
                    var6 = var0.b.a.readInt();
                }

                if (var6 < var1.ag && var1.ag <= var1.ai) {
                    VDTT_fg.a(VDTT_jb.c(var1.ag - var6), var1, var1.r + 28, var3);
                }

                var1.ag = var6;
                if (var1.ag <= 0) {
                    var1.aL = var0.b.a.readShort();
                    var1.aM = var0.b.a.readShort();
                    var1.a(var0.b.c());
                }

            }
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public static void b(Message var0, VDTT_ek var1) {
        try {
            if (var1 == null) {
                var1 = v().k(var0.b.a.readInt());
            }

            if (var1 != null) {
                var1.aj = var0.b.a.readInt();
                var1.ah = var0.b.a.readInt();
            }
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public static void b(Message var0, VDTT_ek var1, boolean var2) {
        try {
            if (var1 == null) {
                var1 = v().k(var0.b.a.readInt());
            }

            if (var1 != null) {
                if (var2) {
                    var1.ah = var0.b.a.readShort();
                    return;
                }

                var1.ah = var0.b.a.readInt();
            }

        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public static void ad(Message var0) {
        try {
            MainScreen var1;
            if ((var1 = v().c) instanceof VDTT_kb) {
                VDTT_kb var7;
                VDTT_kb var10000 = var7 = (VDTT_kb) var1;
                Message var8 = var0;
                VDTT_kb var6 = var10000;

                try {
                    VDTT_ek.m().bq = var8.b.a.readByte();
                    int[] var2;
                    (var2 = new int[21])[0] = var8.b.a.readInt();
                    var2[1] = var8.b.a.readInt();
                    var2[2] = var8.b.a.readShort();
                    var2[3] = var8.b.a.readShort();
                    var2[4] = var8.b.a.readShort();
                    var2[5] = var8.b.a.readShort();
                    var2[6] = var8.b.a.readShort();
                    var2[7] = var8.b.a.readShort();
                    var2[8] = var8.b.a.readShort();
                    var2[9] = var8.b.a.readShort();
                    var2[10] = var8.b.a.readShort();
                    var2[11] = var8.b.a.readShort();
                    var2[12] = var8.b.a.readShort();
                    var2[13] = var8.b.a.readShort();
                    var2[14] = var8.b.a.readShort();
                    var2[15] = var8.b.a.readShort();
                    var2[16] = var8.b.a.readShort();
                    var2[17] = var8.b.a.readShort();
                    var2[18] = var8.b.a.readShort();
                    var2[19] = var8.b.a.readShort();
                    var2[20] = var8.b.a.readShort();
                    var6.O = true;
                    var6.g(var6.am);
                    String var9 = "";

                    int var3;
                    for (var3 = 0; var3 < Caption.yy.length; ++var3) {
                        if (var3 == 0) {
                            var9 = var9 + Caption.yy[var3] + ": " + var2[var3] * 90 / 100 + " - " + var2[var3];
                        } else {
                            var9 = var9 + Caption.yy[var3] + ": " + var2[var3] + (var3 != 16 && var3 != 17 && var3 != 18 && var3 != 19 && var3 != 20 ? "" : "%");
                        }

                        if (var3 < Caption.yy.length - 1) {
                            var9 = var9 + "\n";
                        }
                    }

                    var6.av[2] = var9.split("\n");
                    var6.ao[0][2] = new VDTT_hs((byte) 1, var6.ap.objX + 5, var6.f() + 34, var6.q - 8 - 12, (var6.r - 70) / 15 * 15, 15, var6.av[2].length);

                    for (var3 = 0; var3 < var6.aw.length; ++var3) {
                        if (var3 == var6.aw.length - 1) {
                            var6.aw[var3] = new VDTT_ba(var6.ao[0][2].objX + var6.ao[0][2].q - 35, (var6.ao[0][2].i - 1) * var6.ao[0][2].h, 0, 0, Caption.qt, var6, 1031 + var3, -17);
                            var6.ax[var3] = new VDTT_hs((byte) 1, var6.ao[0][2].objX + var6.ao[0][2].q - 35, (var6.ao[0][2].i - 1) * var6.ao[0][2].h, 50, 15, 15, 1);
                        } else if (var3 == var6.aw.length - 2) {
                            var6.aw[var3] = new VDTT_ba(var6.ao[0][2].objX + var6.ao[0][2].q - 35, (var6.ao[0][2].i - 2) * var6.ao[0][2].h, 0, 0, Caption.qt, var6, 1031 + var3, -31);
                            var6.ax[var3] = new VDTT_hs((byte) 1, var6.ao[0][2].objX + var6.ao[0][2].q - 35, (var6.ao[0][2].i - 1) * var6.ao[0][2].h, 50, 15, 15, 1);
                        } else if (var3 >= 5) {
                            var6.aw[var3] = new VDTT_ba(var6.ao[0][2].objX + var6.ao[0][2].q - 35, (6 + var3) * var6.ao[0][2].h, 0, 0, Caption.qt, var6, 1031 + var3, -31);
                            var6.ax[var3] = new VDTT_hs((byte) 1, var6.ao[0][2].objX + var6.ao[0][2].q - 35, (6 + var3) * var6.ao[0][2].h, 50, 15, 15, 1);
                        } else {
                            var6.aw[var3] = new VDTT_ba(var6.ao[0][2].objX + var6.ao[0][2].q - 35, (6 + var3) * var6.ao[0][2].h, 0, 0, Caption.qt, var6, 1031 + var3, -17);
                            var6.ax[var3] = new VDTT_hs((byte) 1, var6.ao[0][2].objX + var6.ao[0][2].q - 35, (6 + var3) * var6.ao[0][2].h, 50, 15, 15, 1);
                        }
                    }

                    return;
                } catch (Exception var4) {
                    VDTT_jb.a(var4);
                }
            }

        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public static void readPet(Message var0) {
        try {
            MainScreen var1;
            if ((var1 = v().c) instanceof VDTT_kb) {
                VDTT_kb var7;
                VDTT_kb var10000 = var7 = (VDTT_kb) var1;
                Message var8 = var0;
                VDTT_kb var6 = var10000;
                try {
                    var6.exp = var8.b.a.readInt();
                    var6.expMax = var8.b.a.readInt();
                    var6.frameStart = var8.b.a.readInt();
                    var6.frameEnd = var8.b.a.readInt();
                    var6.tickSpeed = var8.b.a.readInt();
                    VDTT_ek.readItemPet(var8, var6.V.itemPet);
                    int size = var8.b.a.readByte();
                    var6.skillPet = new VDTT_ic[4];
                    for (int i = 0; i < size; i++) {
                        var6.skillPet[i] = VDTT_ek.m().getSkillWithId(var8.b.a.readShort());
                    }
                    var6.dxPet = var8.b.a.readInt();
                    var6.dyPet = var8.b.a.readInt();
                    for (int i = var6.frameStart; i <= var6.frameEnd; i++) {
                        VDTT_dc.d(10000 + i);
                    }
                } catch (Exception ex) {

                }
            }
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public static void ae(Message var0) {
        try {
            MainScreen var1;
            if ((var1 = v().c) instanceof VDTT_kb) {
                VDTT_kb var7;
                VDTT_kb var10000 = var7 = (VDTT_kb) var1;
                Message var8 = var0;
                VDTT_kb var6 = var10000;
                long[] var2 = new long[10];

                try {
                    var6.V.ai = var8.b.a.readInt();
                    var6.V.ag = var8.b.a.readInt();
                    var6.V.aj = var8.b.a.readInt();
                    var6.V.ah = var8.b.a.readInt();
                    var6.V.n = var8.b.a.readByte();
                    var2[0] = (long) var8.b.a.readShort();
                    var2[1] = (long) var8.b.a.readShort();
                    var2[2] = (long) var8.b.a.readByte();
                    var2[3] = (long) var8.b.a.readInt();
                    var2[4] = (long) var8.b.a.readShort();
                    var2[5] = (long) var8.b.a.readShort();
                    var2[6] = (long) var8.b.a.readInt();
                    var2[7] = (long) var8.b.a.readInt();
                    var2[8] = (long) var8.b.a.readShort();
                    var2[9] = (long) var8.b.a.readInt();

                } catch (Exception var4) {
                }
                try {
                    var6.exp = var8.b.a.readInt();
                    var6.expMax = var8.b.a.readInt();
                    var6.frameStart = var8.b.a.readInt();
                    var6.frameEnd = var8.b.a.readInt();
                    var6.tickSpeed = var8.b.a.readInt();
                    VDTT_ek.readItemPet(var8, var6.V.itemPet);
                    int size = var8.b.a.readByte();
                    var6.skillPet = new VDTT_ic[4];
                    for (int i = 0; i < size; i++) {
                        var6.skillPet[i] = VDTT_ek.m().getSkillWithId(var8.b.a.readShort());
                    }
                    var6.dxPet = var8.b.a.readInt();
                    var6.dyPet = var8.b.a.readInt();
                    for (int i = var6.frameStart; i <= var6.frameEnd; i++) {
                        VDTT_dc.d(10000 + i);
                    }
                } catch (Exception ex) {

                }
                String var9 = "";
                var9 = var9 + Caption.zd[3] + " " + var6.V.aD + "\n";
                var9 = var9 + Caption.E + ": " + var6.V.ai() + "\n";
                StringBuilder var11 = (new StringBuilder()).append(var9).append(Caption.tU).append(var6.V.A());
                DataCenter.d();
                var9 = var11.append(DataCenter.b(var6.V.w())).append("\n").toString();
                var9 = var9 + Caption.ef + var6.V.n + "\n";
                var9 = var9 + Caption.dU + var6.V.ag + "/" + var6.V.ai + "\n";
                var9 = var9 + Caption.dV + var6.V.ah + "/" + var6.V.aj + "\n";
                if (var6.V.bh != null) {
                    var9 = var9 + Caption.ei + var6.V.bh.a + "\n";
                    String var3 = Caption.ej;
                    if (var6.V.bh.c == 5) {
                        var3 = Caption.ek;
                    } else if (var6.V.bh.c == 4) {
                        var3 = Caption.el;
                    } else if (var6.V.bh.c == 3) {
                        var3 = Caption.em;
                    }

                    var9 = var9 + Caption.en + var3 + "\n";
                } else {
                    var9 = var9 + Caption.eo + "\n";
                }

                int var10;
                for (var10 = 0; var10 < Caption.yA.length; ++var10) {
                    if (var10 != 0 && var10 != 1) {
                        if (var10 == 2) {
                            var9 = var9 + Caption.yA[var10] + ": " + VDTT_jb.c(var2[var10]) + "%";
                        } else {
                            var9 = var9 + Caption.yA[var10] + ": " + VDTT_jb.c(var2[var10]);
                        }
                    } else if (var2[var10] % 10L == 0L) {
                        var9 = var9 + Caption.yA[var10] + ": " + var2[var10] / 10L + "%";
                    } else {
                        var9 = var9 + Caption.yA[var10] + ": " + (float) var2[var10] / 10.0F + "%";
                    }

                    if (var10 == 1 && var2[var10] < 0L) {
                        var9 = var9 + Caption.wF;
                    }

                    if (var10 < Caption.yA.length - 1) {
                        var9 = var9 + "\n";
                    }
                }

                var6.av[1] = var9.split("\n");
                var6.ao[0][1] = new VDTT_hs((byte) 1, var6.ap.objX + 5, var6.f() + 34, var6.q - 8 - 12, (var6.r - 70) / 15 * 15, 15, var6.av[1].length);

                for (var10 = 0; var10 < var6.ay.length; ++var10) {
                    if (var10 == var6.ay.length - 1) {
                        var6.ay[var10] = new VDTT_ba(var6.ao[0][1].objX + var6.ao[0][1].q - 35, (var6.ao[0][1].i - 1) * var6.ao[0][1].h, 0, 0, Caption.qt, var6, 1031 + var10, -17);
                        var6.ax[var10] = new VDTT_hs((byte) 1, var6.ao[0][2].objX + var6.ao[0][1].q - 35, (var6.ao[0][1].i - 1) * var6.ao[0][2].h, 50, 15, 15, 1);
                    } else if (var10 == var6.ay.length - 2) {
                        var6.ay[var10] = new VDTT_ba(var6.ao[0][1].objX + var6.ao[0][1].q - 35, (var6.ao[0][1].i - 2) * var6.ao[0][2].h, 0, 0, Caption.qt, var6, 1031 + var10, -17);
                        var6.az[var10] = new VDTT_hs((byte) 1, var6.ao[0][2].objX + var6.ao[0][1].q - 35, (var6.ao[0][1].i - 1) * var6.ao[0][2].h, 50, 15, 15, 1);
                    }
                }
            }

        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public final void a(int var1, short var2, short var3) {
        try {
            VDTT_ek var7 = this.m(var1);
            VDTT_ic var8;
            if ((var8 = DataCenter.d().T[var2].a()) != null) {
                if (var8.i()) {
                    var7.o();
                }

                VDTT_gk var9;
                if ((var9 = this.j(var3)) != null) {
                    var9.Z = var7;
                }

                if (var7.b != VDTT_ek.m().b) {
                    if (var7.bd.size() > 0) {
                        VDTT_gm var5 = (VDTT_gm) var7.bd.lastElement();
                        var7.ae = var5;
                        var7.af = var7.ae;
                        var7.bd.clear();
                    } else {
                        var7.af = var7.ae;
                    }

                    var7.a(var8, var9, false);
                    if (this.bp != null && this.bp.a(var7)) {
                        this.bp.a = var9;
                    }
                }

            }
        } catch (Exception var6) {
            VDTT_jb.a(var6);
        }
    }

    public static void p(int var0) {
        try {
            Item var1;
            if ((var1 = VDTT_ek.m().aR[0]) != null) {
                VDTT_gz[] var2 = var1.L();
                VDTT_gz var3 = null;
                VDTT_gz var4 = null;

                for (int var5 = 0; var5 < var2.length; ++var5) {
                    if (var2[var5].b[0] == 285) {
                        var3 = var2[var5];
                    } else if (var2[var5].b[0] == 407) {
                        var4 = var2[var5];
                        break;
                    }
                }

                var4.c(var4.b[1] + (var0 - var3.b[1]));
                var3.c(var0);
                var1.strOptions = Item.a(var2);
            }

        } catch (Exception var7) {
        }
    }

    public final void af(Message var1) {
        try {
            this.j(var1.b.a.readShort()).V = var1.b.a.readInt();
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public final void ag(Message var1) {
        try {
            VDTT_gk var2 = this.j(var1.b.a.readShort());
            int var3 = var1.b.a.readInt();
            boolean var4 = false;

            try {
                var4 = var1.b.a.readBoolean();
            } catch (Exception var6) {
            }

            a(var2, var3, var4);
        } catch (Exception var7) {
            VDTT_jb.a(var7);
        }
    }

    public final void ah(Message var1) {
        try {
            VDTT_gk var2 = this.j(var1.b.a.readByte());
            short var3 = var1.b.a.readShort();
            boolean var4 = false;

            try {
                var4 = var1.b.a.readBoolean();
            } catch (Exception var6) {
            }

            a(var2, var3, var4);
        } catch (Exception var7) {
            VDTT_jb.a(var7);
        }
    }

    private static void a(VDTT_gk var0, int var1, boolean var2) {
        if (var0 != null) {
            if (var1 == var0.V) {
                if (var0.p().p != 8) {
                    VDTT_fg.a("", var0, var0.r + 10, 2);
                }
            } else if (var0.V - var1 > 0) {
                if (var2) {
                    VDTT_fg.a(VDTT_jb.c(var0.V - var1), var0, var0.r + 10, 1);
                } else {
                    VDTT_fg.a(VDTT_jb.c(VDTT_jb.b(var0.V - var1)), var0, var0.r + 10, 0);
                }
            }

            if (var0.V > 0) {
                var0.V = var1;
                return;
            }

            if (var0.V <= 0) {
                var0.e = 4;
            }
        }

    }

    public final void ai(Message var1) {
        try {
            VDTT_fs var2;
            (var2 = new VDTT_fs()).J = var1.b.a.readInt();
            var2.b = var1.b.a.readShort();
            var2.objX = var2.l = var1.b.a.readShort();
            var2.objY = var2.m = var1.b.a.readShort();
            var2.k = new Item();
            var2.k.a(var1);
            this.ar.addElement(var2);
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void aj(Message var1) {
        try {
            this.j(var1.b.a.readShort());
            VDTT_fs var2;
            (var2 = new VDTT_fs()).J = var1.b.a.readInt();
            var2.b = var1.b.a.readShort();
            var2.objX = var2.l = var1.b.a.readShort();
            var2.objY = var2.m = var1.b.a.readShort();
            var2.k = new Item();
            var2.k.a(var1);
            v().ar.addElement(var2);
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void ak(Message var1) {
        try {
            VDTT_gk var2;
            (var2 = this.j(var1.b.a.readShort())).ab.clear();
            var2.c(var2.I, var2.J);
            var2.at = true;
            var2.X = var1.b.a.readShort();
            var2.V = var1.b.a.readInt();
            var2.W = var1.b.a.readInt();
            var2.n = var1.b.a.readByte();
            var2.e = var1.b.a.readByte();
            if (var2.e == 0) {
                var2.aa = 10;
                v().at.addElement(new VDTT_ev(541, var2.objX, var2.l()));
            }

        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void al(Message var1) {
        try {
            VDTT_gk var2;
            (var2 = this.j(var1.b.a.readByte())).ab.clear();
            var2.c(var2.I, var2.J);
            var2.at = true;
            var2.X = var1.b.a.readByte();
            var2.V = var1.b.a.readShort();
            var2.W = var1.b.a.readShort();
            var2.n = var1.b.a.readByte();
            var2.e = var1.b.a.readByte();
            if (var2.e == 0) {
                var2.aa = 10;
                v().at.addElement(new VDTT_ev(541, var2.objX, var2.l()));
            }

        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void am(Message var1) {
        try {
            VDTT_gk var2;
            (var2 = this.j(var1.b.a.readShort())).V = var1.b.a.readInt();
            var2.W = var1.b.a.readInt();
            var2.n = var1.b.a.readByte();
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void an(Message var1) {
        try {
            VDTT_gk var2 = this.j(var1.b.a.readShort());
            VDTT_ek var5 = this.m(var1.b.a.readInt());
            var2.a((VDTT_n) var5);
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void ao(Message var1) {
        try {
            VDTT_ek var2 = this.m(var1.b.a.readInt());
            VDTT_gk var6 = this.j(var1.b.a.readShort());

            for (int var3 = 0; var3 < var2.bb.size(); ++var3) {
                VDTT_ez var4;
                if ((var4 = (VDTT_ez) var2.bb.get(var3)).h != null) {
                    var4.h.a((VDTT_n) var6);
                }
            }

        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public final void ap(Message var1) {
        try {
            VDTT_ek var2 = this.m(var1.b.a.readInt());
            VDTT_ek var6 = this.m(var1.b.a.readInt());

            for (int var3 = 0; var3 < var2.bb.size(); ++var3) {
                VDTT_ez var4;
                if ((var4 = (VDTT_ez) var2.bb.get(var3)).h != null) {
                    var4.h.a((VDTT_n) var6);
                }
            }

        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public final void aq(Message var1) {
        try {
            VDTT_gk var2 = this.j(var1.b.a.readShort());
            VDTT_gk var5 = this.j(var1.b.a.readShort());
            var2.a((VDTT_n) var5);
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void ar(Message var1) {
        try {
            VDTT_ek var2;
            if ((var2 = this.m(var1.b.a.readInt())) == null) {
                return;
            }

            int var3 = var1.b.a.readInt();
            int var4 = var1.b.a.readInt();
            boolean var5 = var1.b.a.readBoolean();
            if (var4 <= var2.ag) {
                if (var4 == var2.ag) {
                    VDTT_fg.a("", var2, var2.r + 10, 5);
                } else if (var5) {
                    VDTT_fg.a(VDTT_jb.c(var2.ag - var4), var2, var2.r + 10, 4);
                } else {
                    VDTT_fg.a(VDTT_jb.c(var2.ag - var4), var2, var2.r + 10, 3);
                }
            }

            var2.ag = var4;
            var2.ah = var3;
            if (var2.ag > 0) {
                var2.i();
                return;
            }

            var2.ag = 0;
            var2.aL = var1.b.a.readShort();
            var2.aM = var1.b.a.readShort();
            var2.a(var1.b.c());
        } catch (Exception var6) {
            VDTT_jb.a(var6);
        }

    }

    public final void as(Message var1) {
        try {
            short var2 = var1.b.a.readShort();
            String[] var5 = VDTT_jb.a(var1.b.c(), ";");
            this.a((MainScreen) (new VDTT_mb(this, Caption.mo + " " + VDTT_ek.m().aD, var5, var2)));
            if (MenuConfig.P) {
                if (((VDTT_gx) v().aq.get(var2)).k == 99) {
                    l(var2, 1);
                    return;
                }

                MenuConfig.P = false;
            } else {
                MenuConfig.K();
                if (MenuConfig.R) {
                    if (((VDTT_gx) v().aq.get(var2)).k == 99) {
                        l(var2, 1);
                        return;
                    }

                    MenuConfig.R = false;
                } else if (MenuConfig.Q) {
                    if (((VDTT_gx) v().aq.get(var2)).k != 28) {
                        MenuConfig.Q = false;
                        return;
                    }

                    l(var2, 0);
                }
            }

        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void at(Message var1) {
        try {
            MainScreen var2;
            if ((var2 = v().c) instanceof VDTT_mb) {
                ((VDTT_mb) var2).k();
            }

            String var7 = var1.b.c();
            String var5;
            String[] var6;
            if ((var5 = var1.b.c()).length() > 0) {
                var6 = VDTT_jb.a(var5, ";");
            } else {
                var6 = new String[0];
            }

            this.a((MainScreen) (new VDTT_mb(this, var7, var6, -4)));
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void au(Message var1) {
        try {
            MainScreen var2;
            if ((var2 = v().c) instanceof VDTT_mb) {
                ((VDTT_mb) var2).k();
            }

            String var6 = var1.b.c();
            String[] var5 = VDTT_jb.a(var1.b.c(), ";");
            this.a((MainScreen) (new VDTT_mb(this, var6, var5, -2)));
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void a(Item var1) {
        try {
            if (super.c instanceof VDTT_jr && var1 != null && var1.ak()) {
                this.cB = true;
            }

            Message var2;
            (var2 = new Message((byte) 116)).b(var1.f);
            var2.l();
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public static int P() {
        int var0 = 0;

        try {
            int var1 = 0;

            for (int var2 = 0; var2 < VDTT_ek.m().aP.length; ++var2) {
                if (VDTT_ek.m().aP[var2] != null) {
                    if (VDTT_ek.m().aP[var2].c == 176) {
                        var1 += VDTT_ek.m().aP[var2].M();
                    }

                    if (VDTT_ek.m().aP[var2].c == 160 && !VDTT_ek.m().aP[var2].t) {
                        VDTT_ek.m();
                    }
                }
            }

            if (var1 >= 2) {
                ++var0;
            }
        } catch (Exception var3) {
        }

        return var0;
    }

    private static Item v(int n) {
        try {
            new Vector();
            for (int i = 0; i < VDTT_ek.m().aP.length; ++i) {
                if (VDTT_ek.m().aP[i] == null || VDTT_ek.m().aP[i].c != n) {
                    continue;
                }
                return VDTT_ek.m().aP[i];
            }
        } catch (Exception exception) {
        }
        return null;
    }

    public final void b(boolean var1) {
        if (VDTT_ek.m().h()) {
            if (var1) {
                VDTT_ek.m().H();
            }

        } else {
            if (this.bI <= 0 && !VDTT_ek.m().h()) {
                VDTT_ek.m();
                if (VDTT_ek.Y()) {
                    Item var2;
                    Item var3;
                    if ((var2 = v(724)) == null && (var3 = v(826)) != null && var3.M() > 0) {
                        this.a(var3);
                        var1 = false;
                    }

                    if (var2 != null) {
                        this.bI = 50;
                        this.a(var2);
                        if (VDTT_ek.m().ag < VDTT_ek.m().ai) {
                            VDTT_ac.b().q();
                            return;
                        }
                    } else if (var1) {
                        DataCenter.o();
                        DataCenter.d().ai.a(Caption.uV, 2003, this);
                    }

                    return;
                }
            }

        }
    }

    public final void av(Message var1) {
        try {
            VDTT_ek var2;
            if ((var2 = this.m(var1.b.a.readInt())) != null) {
                short var3 = var1.b.a.readShort();
                VDTT_ey var4 = DataCenter.d().S[var3];
                VDTT_ez var10 = new VDTT_ez(var3, var1.b.a.readInt(), var1.b.a.readLong(), var1.b.a.readInt(), var2);

                try {
                    var10.i = var1.b.a.readBoolean();
                } catch (Exception var6) {
                }

                int var9;
                for (var9 = 0; var9 < var2.bb.size(); ++var9) {
                    VDTT_ez var5;
                    if ((var5 = (VDTT_ez) var2.bb.elementAt(var9)).c().d == var4.d && var5.i == var10.i) {
                        var2.bb.remove(var9);
                        break;
                    }
                }

                var2.a(var10);
                if (var10.c().d == 6) {
                    this.bI = 0;
                }

                if (var10.c().d == 7) {
                    this.bJ = 0;
                }

                if (var10.c().d == 0) {
                    this.bK = 0;
                }

                if (var10.a == 59) {
                    var2.objY = (short) (var2.objY - 20);
                }

                VDTT_ac var12;
                if (var2.p() && var2.bz == null && var10.a >= 122 && var10.a <= 130 && !(var12 = VDTT_ac.b()).a) {
                    var12.a(66);
                }

                if (var10.a == 131) {
                    var2.bU = new VDTT_ek();
                    var2.bU.b = var2.b;
                    var2.bU.f(var2.objX, var2.objY);

                    try {
                        for (var9 = 0; var9 < this.ao.size(); ++var9) {
                            VDTT_ek var13;
                            if ((var13 = (VDTT_ek) this.ao.get(var9)).aV != null && var13.aV.f.equals(var2)) {
                                var13.aV.f = var2.bU;
                                if (var13.aV.h != null) {
                                    VDTT_ek var11 = var2.bU;
                                    var13.aV.h.l = var11;
                                }
                            }
                        }

                        return;
                    } catch (Exception var7) {
                    }
                }

            }
        } catch (Exception var8) {
            VDTT_jb.a(var8);
        }
    }

    public final void aw(Message var1) {
        try {
            VDTT_ek var2;
            if ((var2 = this.m(var1.b.a.readInt())) == null) {
                return;
            }

            short var6 = var1.b.a.readShort();
            int var4 = 0;

            while (true) {
                if (var4 >= var2.bb.size()) {
                    return;
                }

                if (((VDTT_ez) var2.bb.elementAt(var4)).a == var6) {
                    var2.bb.remove(var4);
                    break;
                }

                ++var4;
            }
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }

    }

    public final void ax(Message var1) {
        try {
            VDTT_gk var2 = this.j(var1.b.a.readShort());
            short var3 = var1.b.a.readShort();
            VDTT_ey var5 = DataCenter.d().S[var3];

            for (int var6 = 0; var6 < var2.ab.size(); ++var6) {
                if (((VDTT_ez) var2.ab.elementAt(var6)).c().d == var5.d) {
                    var2.ab.remove(var6);
                    break;
                }
            }

            VDTT_ez var4 = new VDTT_ez(var3, var1.b.a.readInt(), var1.b.a.readLong(), var1.b.a.readInt(), var2);
            var2.ab.add(var4);
        } catch (Exception var7) {
            VDTT_jb.a(var7);
        }
    }

    public final void ay(Message var1) {
        try {
            VDTT_gk var2 = this.j(var1.b.a.readShort());
            if (v().k != null && v().k instanceof VDTT_bs) {
                VDTT_bs var3;
                (var3 = (VDTT_bs) v().k).m = var1.b.a.readInt();
                var3.l = var1.b.a.readShort();
                var3.a(var2);
            }

        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public final void az(Message var1) {
        try {
            this.j(var1.b.a.readShort()).e = 4;
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void aA(Message var1) {
        try {
            byte var8 = var1.b.a.readByte();
            VDTT_ir var2 = this.S();
            Vector var3 = new Vector();
            String[] var9;
            if (var8 == -1) {
                var9 = VDTT_jb.a(var2.h, "\\n");
            } else if (var8 == -2) {
                var9 = VDTT_jb.a(var2.i, "\\n");
            } else {
                var9 = VDTT_jb.a(((VDTT_il) var2.p.elementAt(var8)).j, "\\n");
            }

            for (int var5 = 0; var5 < var9.length; ++var5) {
                String var4;
                String[] var6;
                if ((var6 = var9[var5].split("@")).length == 1) {
                    var4 = var9[var5].replaceAll("#", VDTT_ek.m().aD).replaceAll("\\$", VDTT_ek.m().ai()).replaceAll("\\*", Caption.Ad[VDTT_ek.m().au]).replaceAll("\\&", Caption.Ae[VDTT_ek.m().au]).replaceAll("\\^", Caption.Af[VDTT_ek.m().au]).replaceAll("\\%", Caption.Ag[VDTT_ek.m().au]).replaceAll("\\~", Caption.Ah[VDTT_ek.m().au]).replaceAll("\\_", Caption.Ai[0]);
                    var3.addElement(new VDTT_hq(VDTT_ek.m().be, var4, (byte) 1, VDTT_ek.m().aD));
                } else {
                    var4 = (var4 = var6[1]).replaceAll("#", VDTT_ek.m().aD).replaceAll("\\$", VDTT_ek.m().ai()).replaceAll("\\*", Caption.Ad[VDTT_ek.m().au]).replaceAll("\\&", Caption.Ae[VDTT_ek.m().au]).replaceAll("\\^", Caption.Af[VDTT_ek.m().au]).replaceAll("\\%", Caption.Ag[VDTT_ek.m().au]).replaceAll("\\~", Caption.Ah[VDTT_ek.m().au]).replaceAll("\\_", Caption.Ai[0]);
                    VDTT_gx var10 = new VDTT_gx((byte) 0, Short.parseShort(var6[0]), 0, 0);
                    var3.addElement(new VDTT_hq(var10.m().b[0], var4, (byte) 0, var10.m().j));
                }
            }

            this.a((MainScreen) (new VDTT_mg(this, var3, var8)));
        } catch (Exception var7) {
            VDTT_jb.a(var7);
        }
    }

    public final void aB(Message var1) {
        try {
            Vector var2 = new Vector();
            String[] var3 = VDTT_jb.a(var1.j(), "\\n");

            for (int var5 = 0; var5 < var3.length; ++var5) {
                String var4;
                String[] var6;
                if ((var6 = var3[var5].split("@")).length == 1) {
                    var4 = var3[var5].replaceAll("#", VDTT_ek.m().aD).replaceAll("\\$", VDTT_ek.m().ai()).replaceAll("\\*", Caption.Ad[VDTT_ek.m().au]).replaceAll("\\&", Caption.Ae[VDTT_ek.m().au]).replaceAll("\\^", Caption.Af[VDTT_ek.m().au]).replaceAll("\\%", Caption.Ag[VDTT_ek.m().au]).replaceAll("\\~", Caption.Ah[VDTT_ek.m().au]).replaceAll("\\_", Caption.Ai[0]);
                    var2.addElement(new VDTT_hq(VDTT_ek.m().be, var4, (byte) 1, VDTT_ek.m().aD));
                } else {
                    var4 = (var4 = var6[1]).replaceAll("#", VDTT_ek.m().aD).replaceAll("\\$", VDTT_ek.m().ai()).replaceAll("\\*", Caption.Ad[VDTT_ek.m().au]).replaceAll("\\&", Caption.Ae[VDTT_ek.m().au]).replaceAll("\\^", Caption.Af[VDTT_ek.m().au]).replaceAll("\\%", Caption.Ag[VDTT_ek.m().au]).replaceAll("\\~", Caption.Ah[VDTT_ek.m().au]).replaceAll("\\_", Caption.Ai[0]);
                    VDTT_gx var9 = new VDTT_gx((byte) 0, Short.parseShort(var6[0]), 0, 0);
                    var2.addElement(new VDTT_hq(var9.m().b[0], var4, (byte) 0, var9.m().j));
                }
            }

            VDTT_mg var8;
            (var8 = new VDTT_mg(this, var2, -1)).O = var1.b.a.readShort();
            var8.P = var1.b.a.readByte();
            var8.Q = var1.b.a.readByte();
            var8.N = true;
            this.a((MainScreen) var8);
        } catch (Exception var7) {
            VDTT_jb.a(var7);
        }
    }

    public static void aC(Message var0) {
        try {
            MainScreen var1;
            if ((var1 = v().c) instanceof VDTT_mq) {
                ((VDTT_mq) var1).k();
            } else if (var1 instanceof VDTT_jz) {
                ((VDTT_jz) var1).k();
            }

            byte var5 = var0.b.a.readByte();

            for (int var2 = 0; var2 < var5; ++var2) {
                VDTT_ek.m().aP[var0.b.a.readShort()] = null;
            }

        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void aD(Message var1) {
        try {
            VDTT_ek var4;
            (var4 = this.m(var1.b.a.readInt())).bp = -1;
            this.bM = 1000;
            if (var4.p()) {
                for (int var5 = v().b.size() - 1; var5 >= 0; --var5) {
                    MainScreen var2;
                    if ((var2 = (MainScreen) v().b.get(var5)) instanceof VDTT_nn) {
                        VDTT_nn var6;
                        (var6 = (VDTT_nn) var2).k();
                    }
                }

                v().f();
            }

        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public final void aE(Message var1) {
        try {
            VDTT_gk var2 = this.j(var1.b.a.readShort());
            short var6 = var1.b.a.readShort();
            int var4 = 0;

            while (true) {
                if (var4 >= var2.ab.size()) {
                    return;
                }

                if (((VDTT_ez) var2.ab.elementAt(var4)).a == var6) {
                    var2.ab.remove(var4);
                    break;
                }

                ++var4;
            }
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }

    }

    public final void aF(Message var1) {
        try {
            VDTT_ek var2;
            (var2 = this.m(var1.b.a.readInt())).ag = var1.b.a.readInt();
            var2.ah = var1.b.a.readInt();
            var2.ai = var1.b.a.readInt();
            var2.aj = var1.b.a.readInt();
            var2.X();
            if (var2.p()) {
                v().dJ = false;
                VDTT_ac var10000 = VDTT_ac.b();
                float var5 = 1.0F;
                VDTT_ac var6 = var10000;
                if (!var10000.a) {
                    var6.a(53, 1.0F);
                }
            }

            MainScreen var7;
            if ((var7 = v().c) instanceof VDTT_kq) {
                ((VDTT_kq) var7).k();
            }

            if (VDTT_ek.m().bH) {
                MenuConfig.K().a(VDTT_ek.m().bH);
                VDTT_ek.m().bH = false;
            }

        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void aG(Message var1) {
        try {
            VDTT_ek var2 = this.k(var1.b.a.readInt());
            VDTT_ek.a(var1, var2.aR);
            var2.bk = null;
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public static void f(String var0) {
        try {
            Message var1;
            (var1 = new Message((byte) 41)).a(var0);
            var1.l();
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public static void g(String var0) {
        try {
            VDTT_ln var1;
            (var1 = new VDTT_ln(v())).a(var0);
            v().a((MainScreen) var1);
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public static void h(String var0) {
        try {
            Message var1;
            (var1 = new Message((byte) 79)).a(var0);
            var1.l();
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void i(String var1) {
        try {
            if (VDTT_ek.m().aD.equals(var1)) {
                this.a((MainScreen) (new VDTT_kb(this, VDTT_ek.m(), v().ae)));
            } else {
                Message var2;
                (var2 = new Message((byte) 34)).a(var1);
                var2.l();
            }
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public static void j(String var0) {
        try {
            Message var1;
            (var1 = new Message((byte) 39)).a(var0);
            var1.l();
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void k(String var1) {
        try {
            if (this.b.lastElement() instanceof VDTT_nn && this.ds.lastElement() != null && ((VDTT_fs) this.ds.lastElement()).k.c == 223) {
                MenuConfig.K();
            }

            Message var2;
            (var2 = new Message((byte) 86)).a(var1);
            var2.l();
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public final void aH(Message var1) {
        try {
            this.bp.b.clear();
            this.bp.c = var1.b.a.readBoolean();
            short var2 = var1.b.a();

            for (int var3 = 0; var3 < var2; ++var3) {
                VDTT_el var4;
                (var4 = new VDTT_el()).b = var1.b.a.readByte();
                byte var6 = var1.b.a.readByte();
                var4.c = var6;
                var4.d = var1.b.a.readShort();
                var4.a = var1.b.c();
                this.bp.b.addElement(var4);
            }

            MainScreen var8;
            if ((var8 = super.c) instanceof VDTT_ms) {
                VDTT_ms var9;
                (var9 = (VDTT_ms) var8).D();
            }

        } catch (Exception var7) {
            VDTT_jb.a(var7);
        }
    }

    public final void aI(Message var1) {
        try {
            this.bp.b.clear();
            this.bp.c = false;
            MainScreen var3;
            if ((var3 = super.c) instanceof VDTT_ms) {
                VDTT_ms var4;
                (var4 = (VDTT_ms) var3).D();
            }

        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void aJ(Message var1) {
        try {
            if (this.b.lastElement() instanceof VDTT_nn && this.ds.lastElement() != null && ((VDTT_fs) this.ds.lastElement()).k.c == 223) {
                MenuConfig.K();
            }

            I = var1.b.c();
            if (!VDTT_eq.a().a(38)) {
                DataCenter.d().ai.a(I + Caption.ih, Caption.bY, 2997, 2996, this);
                return;
            }

            DataCenter.d().ai.c(VDTT_jb.b(Caption.es, I), -2560);
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }

    }

    public final void aK(Message var1) {
        try {
            if (this.b.lastElement() instanceof VDTT_nn && this.ds.lastElement() != null && ((VDTT_fs) this.ds.lastElement()).k.c == 223) {
                MenuConfig.K();
            }

            I = var1.b.c();
            DataCenter.d().ai.a(I + Caption.ii, Caption.bY, 2993, 2992, this);
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void aL(Message var1) {
        try {
            long var2 = var1.b.a.readLong();
            long var4 = var1.b.a.readLong();
            long var6 = var1.b.a.readLong();
            String var9 = Caption.ij + VDTT_jb.i((int) (var2 / 1000L));
            var9 = var9 + Caption.ik + VDTT_jb.i((int) (var4 / 1000L));
            if (var2 > var4) {
                var9 = var9 + Caption.im;
            } else {
                var9 = var9 + Caption.il + VDTT_jb.c(var6);
            }

            this.cl = var9;
        } catch (Exception var8) {
            VDTT_jb.a(var8);
        }
    }

    public final void aM(Message var1) {
        try {
            VDTT_ek var2;
            if ((var2 = this.m(var1.b.a.readInt())) != null) {
                var2.d(var1);
            }

        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public static void aN(Message var0) {
        try {
            short var1 = var0.b.a.readShort();
            long var2 = var0.b.a.readLong();
            int var5 = 0;

            while (true) {
                if (var5 >= v().ae.length) {
                    return;
                }

                if (v().ae[var5].c == var1) {
                    v().ae[var5].n = var2;
                    break;
                }

                ++var5;
            }
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }

    }

    public final void aO(Message var1) {
        try {
            I = var1.b.c();
            DataCenter.d().ai.a(I + Caption.in, Caption.bY, 2989, 2990, this);
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void aP(Message var1) {
        try {
            if (!VDTT_eq.a().a(32)) {
                I = var1.b.c();
                short var2 = var1.b.a.readShort();
                int var5 = var1.b.a.readInt();
                DataCenter.d().ai.a(I + Caption.uo + DataCenter.d().a((int) var2) + Caption.ip + VDTT_jb.c(var5) + Caption.mr, Caption.bY, 2987, 2988, this);
            }
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void aQ(Message var1) {
        try {
            if (this.b.lastElement() instanceof VDTT_nn && this.ds.lastElement() != null && ((VDTT_fs) this.ds.lastElement()).k.c == 223) {
                MenuConfig.K();
            }

            I = var1.b.c();
            String var2 = var1.b.c();
            byte var6 = var1.b.a.readByte();
            String var3 = "";
            if (var6 == 5) {
                var3 = Caption.ek;
            } else if (var6 == 4) {
                var3 = Caption.el;
            } else if (var6 == 3) {
                var3 = Caption.em;
            }

            DataCenter.d().ai.a(I + Caption.iq + var3 + Caption.ir + var2 + Caption.is, Caption.bY, 2985, 2986, this);
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public final void aR(Message var1) {
        try {
            VDTT_ek var2;
            if ((var2 = this.m(var1.b.a.readInt())) != null) {
                var2.bN = var1.b.a.readBoolean();
            }
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public final void aS(Message var1) {
        try {
            if (this.b.lastElement() instanceof VDTT_nn && this.ds.lastElement() != null && ((VDTT_fs) this.ds.lastElement()).k.c == 223) {
                MenuConfig.K();
            }

            I = var1.b.c();
            DataCenter.d().ai.a(I + Caption.vL, Caption.bY, 2890, 2891, this);
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void aT(Message var1) {
        try {
            VDTT_ek var2;
            (var2 = this.m(var1.b.a.readInt())).o = var1.b.a.readByte();
            VDTT_ek var3;
            (var3 = this.m(var1.b.a.readInt())).o = var1.b.a.readByte();
            boolean var5;
            if (var2.b != VDTT_ek.m().b) {
                if (var3.b == VDTT_ek.m().b) {
                    var3.ab = var2.b;
                    DataCenter.d().ai.c(var2.aD + Caption.it, -2560);
                    this.bg = var2;
                    var5 = true;
                    this.aV = var5;
                }

                return;
            }

            var2.ab = var3.b;
            DataCenter.d().ai.c(var3.aD + Caption.it, -2560);
            this.bg = var3;
            var5 = true;
            this.aV = var5;
        } catch (Exception var6) {
            VDTT_jb.a(var6);
        }

    }

    public final void aU(Message var1) {
        try {
            VDTT_ek var2 = this.m(var1.b.a.readInt());
            VDTT_ek var6 = this.m(var1.b.a.readInt());
            String var3;
            boolean var7;
            if (var2.b != VDTT_ek.m().b) {
                if (var6.b == VDTT_ek.m().b) {
                    var2.N = true;
                    var3 = var2.aD + Caption.iv;
                    VDTT_bc.a(9, Caption.bY, var3);
                    DataCenter.d().ai.c(var3, -2560);
                    if (!MenuConfig.K().W || !VDTT_eq.a().a(35) || v().V()) {
                        this.bg = var2;
                        var7 = true;
                        this.aV = var7;
                    }
                }

                return;
            }

            var2.ab = var6.b;
            var3 = Caption.iu + var6.aD + ".";
            VDTT_bc.a(9, Caption.bY, var3);
            DataCenter.d().ai.c(var3, -2560);
            if (!MenuConfig.K().W || !VDTT_eq.a().a(35) || v().V()) {
                this.bg = var6;
                var7 = true;
                this.aV = var7;
            }
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }

    }

    public static void aV(Message var0) {
        try {
            short var4 = var0.b.a.readShort();
            int var1 = 0;

            while (true) {
                if (var1 >= v().bl.size()) {
                    return;
                }

                VDTT_ic var2;
                if ((var2 = (VDTT_ic) v().bl.elementAt(var1)).c == var4) {
                    var2.f();
                    break;
                }

                ++var1;
            }
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }

    }

    public final void aW(Message var1) {
        try {
            VDTT_ek.m().c(var1);
            if (DataCenter.d().ai instanceof VDTT_cw) {
                v().A();
            }

            DataCenter.d().c();
            MainScreen var3;
            if ((var3 = super.c) instanceof VDTT_kb) {
                VDTT_kb var4;
                (var4 = (VDTT_kb) var3).a(v().ae);
                var4.H();
            }

        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void aX(Message var1) {
        try {
            VDTT_ek var2 = this.m(var1.b.a.readInt());
            boolean var5 = var1.b.a.readBoolean();
            String var6;
            if (var2.b == VDTT_ek.m().b) {
                var2.ab = -1;
                if (var5) {
                    var6 = Caption.iw;
                    VDTT_bc.a(9, Caption.bY, var6);
                    this.c(var6, -2560);
                    return;
                }
            } else {
                var2.N = false;
                if (var5) {
                    var6 = var2.aD + Caption.ix;
                    VDTT_bc.a(9, Caption.bY, var6);
                    this.c(var6, -2560);
                }
            }

        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void aY(Message var1) {
        try {
            byte var2 = var1.b.a.readByte();
            VDTT_ek var3 = this.m(var1.b.a.readInt());
            VDTT_ek var6 = this.m(var1.b.a.readInt());
            String var4 = "";
            if (var2 == 1) {
                var3.p = var6.p = var2;
                if (var3 != null && var6 != null) {
                    var4 = var3.aD + Caption.iy + var6.aD + Caption.iz;
                }
            } else if (var2 == 2) {
                var3.p = 2;
                var6.p = 3;
                if (var3 != null && var6 != null) {
                    var4 = var3.aD + Caption.iA + var6.aD + ".";
                }
            } else if (var2 == 3) {
                var3.p = 3;
                var6.p = 2;
                if (var3 != null && var6 != null) {
                    var4 = var6.aD + Caption.iA + var3.aD + ".";
                }
            }

            if (var3 != null) {
                var3.Z = VDTT_jb.c() + 5;
                var3.o = 0;
                var3.ab = -1;
            }

            if (var6 != null) {
                var6.Z = VDTT_jb.c() + 5;
                var6.o = 0;
                var6.ab = -1;
            }

            if (var3 != null && var6 != null) {
                VDTT_bc.a(0, Caption.bY, var4);
            }

        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public final void aZ(Message var1) {
        try {
            MainScreen var2;
            if ((var2 = super.c) instanceof VDTT_ms) {
                VDTT_ms var10;
                (var10 = (VDTT_ms) var2).Z.clear();
                byte var3 = var1.b.a.readByte();

                for (int var4 = 0; var4 < var3; ++var4) {
                    VDTT_it var5;
                    (var5 = new VDTT_it()).c = var1.b.a.readBoolean();
                    var5.d = var1.b.a.readByte();
                    VDTT_el var6;
                    (var6 = new VDTT_el()).b = var1.b.a.readByte();
                    byte var8 = var1.b.a.readByte();
                    var6.c = var8;
                    var6.d = var1.b.a.readShort();
                    var6.a = var1.b.c();
                    var5.b.addElement(var6);
                    var10.Z.addElement(var5);
                }

                var10.D();
            }

        } catch (Exception var9) {
        }
    }

    public final boolean l(String var1) {
        for (int var3 = 0; var3 < this.aa.size(); ++var3) {
            VDTT_fj var2;
            if ((var2 = (VDTT_fj) this.aa.elementAt(var3)).b != 2 && var2.c.equals(var1)) {
                return true;
            }
        }

        return false;
    }

    public final void ba(Message var1) {
        try {
            I = var1.b.c();
            if (v().bp == null || !v().bp.a() || !v().ca) {
                DataCenter.d().ai.a(I + Caption.iB, Caption.bY, 2995, 2994, this);
                return;
            }

            (var1 = new Message((byte) 41)).a(I);
            var1.l();
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }

    }

    public final void bb(Message var1) {
        try {
            VDTT_ek var2;
            (var2 = new VDTT_ek()).aD = var1.b.c();
            var2.aC = var1.b.a.readLong();
            var2.m = var1.b.a.readByte();
            var2.aw = var1.b.a.readByte();
            var2.av = var1.b.a.readByte();
            var2.au = var1.b.a.readByte();
            VDTT_ek.a(var1, var2.aR);
            VDTT_ek.a(var1, var2.aS);
            VDTT_ic[] var3 = new VDTT_ic[var1.b.a.readShort()];

            for (int var4 = 0; var4 < var3.length; ++var4) {
                short var5 = var1.b.a.readShort();
                VDTT_ic var11 = DataCenter.d().T[var5].a();
                var3[var4] = var11;
            }

            var2.d(var1);
            var2.e(var1);
            var2.ay = (byte) (var1.b.a.readByte() + 1);
            var2.bq = var1.b.a.readByte();
            var2.B();
            boolean var10 = var1.b.a.readBoolean();
            var2.br = var1.b.a.readBoolean();
            var2.aA = var1.b.a.readByte();
            Arrays.sort(var3, VDTT_ic.a);
            VDTT_kb var9;
            VDTT_kb var12;
            (var9 = var12 = new VDTT_kb(this, var2, var3)).X.m = var10;
            var9.ar.b(true);
            var9.aq.b(true);
            var9.as.b(true);
            this.a((MainScreen) var12);
        } catch (Exception var8) {
            VDTT_jb.a(var8);
        }
    }

    public final void bc(Message var1) {
        try {
            VDTT_ek var2;
            (var2 = this.m(var1.b.a.readInt())).n = var1.b.a.readByte();
            var2.ao = var1.b.a.readInt();
            var2.J = (short) (var1.b.a.readShort() / 100);
            var2.I = var1.b.a.readByte();
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void bd(Message var1) {
        try {
            VDTT_ek.m().ac = var1.b.a.readByte();
            v().ag = var1.b.a.readInt();
            if (this.aS != null) {
                this.aS.d();
            }

        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public final void be(Message var1) {
        try {
            String var2 = var1.b.c();
            String var5 = var1.b.c();
            VDTT_bc.a(0, var2, var5);
            VDTT_ek var6;
            if ((var6 = this.d(var2)) != null) {
                var6.bi = new VDTT_hr(var5);
            }

        } catch (Exception var4) {
        }
    }

    public static void bf(Message var0) {
        try {
            String var1 = var0.b.c();
            String var4 = var0.b.c();
            var4 = ":-loa" + var4;
            if (var1.toLowerCase().equals(Caption.cl.toLowerCase())) {
                DataCenter.d();
                VDTT_p.d("c#yellow" + var4, -7812062);
            } else {
                DataCenter.d();
                VDTT_p.d(var1 + ": c#white" + var4, -7812062);
            }

            VDTT_bc.a(6, var1, var4);
        } catch (Exception var3) {
        }
    }

    public final void bg(Message var1) {
        try {
            byte var2 = var1.b.a.readByte();
            String var3 = var1.b.c();
            String var4 = var1.b.c();

            VDTT_ft var5;
            try {
                (var5 = new VDTT_ft()).a = var1.b.a.readLong();
                var5.c = var1.b.a.readInt();
                var5.e = new Item();
                var5.e.a(var1);
                this.bH.addElement(var5);
            } catch (Exception var7) {
                var5 = null;
            }

            if (var2 > 0) {
                if (var2 == 1) {
                    var4 = ":-loa" + var4;
                }

                if (var3.toLowerCase().equals(Caption.cl.toLowerCase())) {
                    DataCenter.d();
                    VDTT_p.d("c#yellow" + var4, -7812062);
                } else {
                    DataCenter.d();
                    VDTT_p.d(var3 + ": c#white" + var4, -7812062);
                }
            }

            VDTT_bc.a(1, var3, var4, (VDTT_ft) var5);
        } catch (Exception var8) {
        }
    }

    public static void bh(Message var0) {
        try {
            String var1 = var0.b.c();
            String var4 = var0.b.c();
            VDTT_bc.a(8, var1, var4);
        } catch (Exception var3) {
        }
    }

    public static void bi(Message var0) {
        try {
            String var1 = var0.b.c();
            String var4 = var0.b.c();
            VDTT_bc.a(2, var1, var4);
        } catch (Exception var3) {
        }
    }

    public static void bj(Message var0) {
        try {
            String var1 = var0.b.c();
            String var4 = var0.b.c();
            VDTT_bc.a(3, var1, var4);
        } catch (Exception var3) {
        }
    }

    public static void bk(Message var0) {
        try {
            String var1 = var0.b.c();
            String var4 = var0.b.c();
            VDTT_bc.a(4, var1, var4);
        } catch (Exception var3) {
        }
    }

    public static void bl(Message var0) {
        try {
            String var1 = var0.b.c();
            String var4 = var0.b.c();
            VDTT_bc.a(9, var1, var4);
        } catch (Exception var3) {
        }
    }

    public static void bm(Message var0) {
        try {
            String var1 = var0.b.c();
            String var2 = var0.b.c();
            String var3 = "";

            try {
                var3 = var0.b.c();
            } catch (Exception var5) {
                K = "";
                VDTT_bc.K = "";
            }

            if (var3.length() > 0 && K.length() > 0 && (var3.equals(K) || var1.equals(K))) {
                VDTT_bc.K = K;
            }

            VDTT_bc.a(5, var1, var2, (String) var3);
        } catch (Exception var6) {
        }
    }

    public final void c(boolean var1) {
        try {
            if (var1) {
                this.aR.d();
            }

            this.aQ.n.b = this.aQ.j();
            if (this.bq != null) {
                this.bq.z();
            }

        } catch (Exception var2) {
        }
    }

    public final boolean a(VDTT_ek var1) {
        if (!var1.h() && !VDTT_ek.m().h() && var1.ag > 0 && VDTT_ek.m().ag > 0 && !var1.ah() && !VDTT_ek.m().ah()) {
            boolean var2 = this.V();
            if (VDTT_ek.m().ab == var1.b) {
                return true;
            } else {
                int var3;
                VDTT_ez var4;
                for (var3 = 0; var3 < VDTT_ek.m().bb.size(); ++var3) {
                    if ((var4 = (VDTT_ez) VDTT_ek.m().bb.elementAt(var3)).a == 46 || !var2 && var4.a == 66) {
                        return false;
                    }
                }

                for (var3 = 0; var3 < var1.bb.size(); ++var3) {
                    if ((var4 = (VDTT_ez) var1.bb.elementAt(var3)).a == 46 || !var2 && var4.a == 66) {
                        return false;
                    }
                }

                if (!var1.N && VDTT_ek.m().ab != var1.b) {
                    if (this.bp != null && this.bp.b(var1.aD)) {
                        return false;
                    } else if ((var1.o != 2 && var1.o != 4 || VDTT_ek.m().o != 2 && VDTT_ek.m().o != 4) && var1.o != 3 && VDTT_ek.m().o != 3) {
                        return false;
                    } else if (v().C().d != 6 && v().C().d != 7 && v().C().d != 19 && v().C().d != 10) {
                        if ((var1.bh == null || VDTT_ek.m().bh == null || !var1.bh.a.equals(VDTT_ek.m().bh.a) && (var1.o != 4 || var1.o != VDTT_ek.m().o || var1.bh.d != VDTT_ek.m().bh.d)) && VDTT_ek.m().av != 0 && var1.av != 0 && VDTT_ek.m().w() >= 10 && var1.w() >= 10 && (VDTT_jb.b(VDTT_ek.m().w() - var1.w()) <= 10 || v().C().d == 21 || v().C().d == 5 || v().C().d == 24)) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        } else {
            return false;
        }
    }

    public final void a(VDTT_n var1) {
        this.dp.add(var1);
    }

    public final void Q() {
        try {
            Collections.sort(this.dp, XYEntity.F);
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public static void a(String var0, MainScreen var1) {
        try {
            if (!(var1 instanceof VDTT_kd)) {
                VDTT_bc.K = var0;
                VDTT_ke var4 = new VDTT_ke(v(), 5);
                v().a((String) var0, (VDTT_kd) var4);
                return;
            }

            VDTT_kd var3;
            (var3 = (VDTT_kd) var1).A();
            var3.f(var3.w());
            v().a(var0, var3);
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }

    }

    public final void a(String var1, VDTT_kd var2) {
        try {
            VDTT_bc.K = var1;
            var2.P.a(1);
            var2.z();
            MainScreen var3;
            if ((var3 = super.c) != null && !var3.equals(var2)) {
                v().a((MainScreen) var2);
            }

            var2.O.a((VDTT_hl) (new VDTT_hl(-1001, 0, 0, 0, 0, (VDTT_hs) null, (VDTT_z) null)), var2.O.q, 0);
            var2.O.a("/" + var1 + ": ");
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void bn(Message var1) {
        try {
            VDTT_n var2 = this.bg;
            VDTT_ek var3;
            if ((var3 = this.m(var1.b.a.readInt())) != null) {
                short var4 = var1.b.a.readShort();
                short var7 = var1.b.a.readShort();
                var3.a(var4, var7);
                if (var3.p()) {
                    if (var3.aV != null && var3.aV.d.d == 9) {
                        var3.aY = null;
                    }

                    this.L();
                }

                this.bg = var2;
            }
        } catch (Exception var6) {
            VDTT_jb.a(var6);
        }
    }

    public final void bo(Message var1) {
        try {
            VDTT_ek var2;
            if ((var2 = this.m(var1.b.a.readInt())) != null) {
                var2.bq = var1.b.a.readByte();
            }
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public final void R() {
        try {
            VDTT_gx var2;
            for (int var1 = 0; var1 < this.aq.size(); ++var1) {
                for (int var3 = (var2 = (VDTT_gx) this.aq.elementAt(var1)).m.size() - 1; var3 >= 0; --var3) {
                    VDTT_hi var4;
                    if ((var4 = (VDTT_hi) var2.m.get(var3)).k == 112 || var4.k == 113) {
                        var2.m.remove(var4);
                    }
                }
            }

            VDTT_ir var6;
            if ((var6 = this.S()) != null) {
                if (this.bs < 0) {
                    if ((var2 = this.l(var6.d)) != null) {
                        var2.m.addElement(new VDTT_hi(112, 0, 0, -1));
                        return;
                    }
                } else if (this.bs >= var6.p.size()) {
                    if ((var2 = this.l(var6.d)) != null) {
                        var2.m.addElement(new VDTT_hi(113, 0, 0, -1));
                        return;
                    }
                } else {
                    VDTT_il var7;
                    if ((var7 = this.T()) != null && var7.d > 0 && (var2 = this.l(var7.d)) != null) {
                        var2.m.addElement(new VDTT_hi(112, 0, 0, -1));
                    }
                }
            }

        } catch (Exception var5) {
        }
    }

    public final void bp(Message var1) {
        try {
            byte var2 = var1.b.a.readByte();
            byte var3 = var1.b.a.readByte();
            VDTT_im var4;
            switch (var2) {
                case 0:
                    if (var3 < 0) {
                        this.bx = null;
                    } else {
                        if (this.bx == null) {
                            VDTT_fg.a(Caption.sa, VDTT_ek.m(), VDTT_ek.m().r + 20, 14, -48128, -3089954);
                        }

                        (var4 = new VDTT_im(var2)).b = var3;
                        var4.c = var1.b.a.readShort();
                        var4.d = var1.b.a.readShort();
                        var4.e = var1.b.a.readShort();
                        var4.f = var1.b.a.readShort();
                        var4.g = var1.b.a.readShort();
                        var4.h = var1.b.a.readShort();
                        var4.i = var1.b.a.readShort();
                        var4.j = var1.b.a.readShort();
                        var4.k = var1.b.c();
                        var4.l = var1.b.c();
                        var4.m = var1.b.c();
                        this.bx = var4;
                        if (var4.a()) {
                            VDTT_fg.a(Caption.jF, VDTT_ek.m(), VDTT_ek.m().r + 20, 14);
                        }
                    }

                    if (this.bx != null) {
                        VDTT_bw.J = var2;
                        this.aS.c(true);
                    }
                    break;
                case 1:
                    if (var3 < 0) {
                        this.by = null;
                    } else {
                        if (this.by == null) {
                            VDTT_fg.a(Caption.sa, VDTT_ek.m(), VDTT_ek.m().r + 20, 14, -48128, -3089954);
                        }

                        (var4 = new VDTT_im(var2)).b = var3;
                        var4.c = var1.b.a.readByte();
                        var4.f = var1.b.a.readShort();
                        var4.g = var1.b.a.readShort();
                        var4.h = var1.b.a.readShort();
                        var4.i = var1.b.a.readShort();
                        var4.m = var1.b.c();
                        this.by = var4;
                        if (var4.a()) {
                            VDTT_fg.a(Caption.jF, VDTT_ek.m(), VDTT_ek.m().r + 20, 14);
                        }
                    }

                    if (this.by != null) {
                        VDTT_bw.J = var2;
                        this.aS.c(true);
                    }
                    break;
                case 2:
                    if (var3 < 0) {
                        this.bB = null;
                    } else {
                        if (this.bB == null) {
                            VDTT_fg.a(Caption.sa, VDTT_ek.m(), VDTT_ek.m().r + 20, 14, -48128, -3089954);
                        }

                        (var4 = new VDTT_im(var3)).c = var1.b.a.readByte();
                        var4.j = var1.b.a.readByte();
                        this.bB = var4;
                        if (var4.a()) {
                            VDTT_fg.a(Caption.jF, VDTT_ek.m(), VDTT_ek.m().r + 20, 14);
                        }
                    }

                    if (this.bB != null) {
                        VDTT_bw.J = var2;
                        this.aS.c(true);
                    }
                    break;
                case 3:
                    if (var3 < 0) {
                        this.bz = null;
                    } else {
                        if (this.bz == null) {
                            VDTT_fg.a(Caption.sa, VDTT_ek.m(), VDTT_ek.m().r + 20, 14, -48128, -3089954);
                        }

                        (var4 = new VDTT_im(var3)).c = var1.b.a();
                        var4.j = var1.b.a();
                        this.bz = var4;
                        if (var4.a()) {
                            VDTT_fg.a(Caption.jF, VDTT_ek.m(), VDTT_ek.m().r + 20, 14);
                        }
                    }

                    if (this.bz != null) {
                        VDTT_bw.J = var2;
                        this.aS.c(true);
                    }
                    break;
                case 4:
                    if (var3 < 0) {
                        this.bA = null;
                    } else {
                        if (this.bA == null) {
                            VDTT_fg.a(Caption.sa, VDTT_ek.m(), VDTT_ek.m().r + 20, 14, -48128, -3089954);
                        }

                        (var4 = new VDTT_im(var3)).c = var1.b.a();
                        var4.j = var1.b.a();
                        this.bA = var4;
                        if (var4.a()) {
                            VDTT_fg.a(Caption.jF, VDTT_ek.m(), VDTT_ek.m().r + 20, 14);
                        }
                    }

                    if (this.bA != null) {
                        VDTT_bw.J = var2;
                        this.aS.c(true);
                    }
                case 5:
                default:
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    if (var3 < 0) {
                        this.bC = null;
                    } else {
                        if (this.bC == null) {
                            VDTT_fg.a(Caption.sa, VDTT_ek.m(), VDTT_ek.m().r + 20, 14, -48128, -3089954);
                        }

                        (var4 = new VDTT_im(var3)).b = var3;
                        var4.c = var1.b.a();
                        var4.j = var1.b.a();
                        this.bC = var4;
                        if (var4.a()) {
                            VDTT_fg.a(Caption.jF, VDTT_ek.m(), VDTT_ek.m().r + 20, 14);
                        }
                    }

                    if (this.bC != null) {
                        VDTT_bw.J = var2;
                        this.aS.c(true);
                    }
                    break;
                case 11:
                    if (var3 < 0) {
                        this.bD = null;
                    } else {
                        if (this.bA == null) {
                            VDTT_fg.a(Caption.sa, VDTT_ek.m(), VDTT_ek.m().r + 20, 14, -48128, -3089954);
                        }

                        (var4 = new VDTT_im(var3)).j = var1.b.a.readByte();
                        var4.c = var1.b.a.readByte();
                        var4.e = var1.b.a.readShort();
                        var4.d = var1.b.a.readShort();
                        var4.g = -1;
                        var4.b = var3;
                        this.bD = var4;
                        if (var4.a()) {
                            VDTT_fg.a(Caption.jF, VDTT_ek.m(), VDTT_ek.m().r + 20, 14);
                        }
                    }

                    if (this.bD != null) {
                        VDTT_bw.J = var2;
                        this.aS.c(true);
                    }
            }

            this.aS.d();
        } catch (Exception var6) {
        }
    }

    public final void bq(Message var1) {
        try {
            if (super.c instanceof VDTT_lo) {
                VDTT_lo var10000 = (VDTT_lo) super.c;
                Message var2 = var1;
                VDTT_lo var9 = var10000;

                try {
                    short var3 = var2.b.a();
                    v().al = var2.b.a();
                    var9.Q = var2.b.a();
                    VDTT_je[] var10 = new VDTT_je[var3];

                    for (int var4 = 0; var4 < var10.length; ++var4) {
                        var10[var4] = new VDTT_je(0);
                    }

                    short var11 = var2.b.a();

                    for (int var5 = 0; var5 < var11; ++var5) {
                        var10[var2.b.a()].a = var2.b.a();
                    }

                    var9.P = var10;
                    var9.z();
                    return;
                } catch (Exception var7) {
                    VDTT_jb.a(var7);
                }
            }

        } catch (Exception var8) {
        }
    }

    public final void br(Message var1) {
        try {
            VDTT_bw.J = 5;
            this.aS.c(false);
            int var2 = this.bs;
            this.br = var1.b.a.readShort();
            this.bs = var1.b.a.readByte();
            this.bt = var1.b.a.readUnsignedShort();
            this.R();
            if (var2 != this.bs) {
                VDTT_ir var5;
                VDTT_ac var6;
                if ((var5 = this.S()) != null && this.bs >= var5.p.size()) {
                    if (DataCenter.d().ai instanceof VDTT_cw && !(var6 = VDTT_ac.b()).a) {
                        var6.a(22);
                    }

                    VDTT_fg.a(Caption.jF, VDTT_ek.m(), VDTT_ek.m().r + 20, 14);
                    if (this.br == 3) {
                        MenuConfig.K().a(false);
                        this.bg = null;
                    }
                } else if (this.bs == 0) {
                    if (DataCenter.d().ai instanceof VDTT_cw && !(var6 = VDTT_ac.b()).a) {
                        var6.a(21);
                    }

                    VDTT_fg.a(Caption.uG, VDTT_ek.m(), VDTT_ek.m().r + 20, 14, -48128, -3089954);
                } else {
                    if (DataCenter.d().ai instanceof VDTT_cw && !(var6 = VDTT_ac.b()).a) {
                        var6.a(9);
                    }

                    VDTT_ek.m().bf.addElement(new VDTT_hi(105, 0, 0, 2));
                }
            }

            MainScreen var7;
            if ((var7 = super.c) instanceof VDTT_mr) {
                VDTT_mr var8;
                (var8 = (VDTT_mr) var7).w();
                var8.x();
            }

            this.aS.d();
            if (VDTT_d.g().g != null) {
                int var10000 = this.br;
                Objects.requireNonNull(DataCenter.d());
                if (var10000 == 17 && this.bs == -1) {
                    VDTT_d.g();
                    (new StringBuilder()).append(DataCenter.d().aE);
                    DataCenter.d();
                }
            }

        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final VDTT_ir S() {
        try {
            if (this.br < DataCenter.d().K.length) {
                return DataCenter.d().K[v().br];
            }
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }

        return null;
    }

    public final VDTT_il T() {
        try {
            VDTT_ir var1;
            if ((var1 = this.S()) != null && VDTT_ek.m().w() >= var1.c && v().bs >= 0 && v().bs < var1.p.size()) {
                return (VDTT_il) var1.p.elementAt(v().bs);
            }
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }

        return null;
    }

    private static void a(VDTT_gk var0) {
        try {
            Message var1;
            (var1 = new Message((byte) -8)).b(var0.b);
            var1.l();
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void a(VDTT_dy var1, boolean var2) {
        VDTT_ek.m().T();
        VDTT_il var3 = v().T();
        this.S();
        if (var2) {
            var3 = null;
        }

        if (var3 != null) {
            if (var3.a == 22) {
                this.c(Caption.iE, -2560);
            } else if (var3.a == 60) {
                this.c(Caption.uI, -2560);
            } else if (var3.a == 10) {
                if (var3.f != this.ai) {
                    this.c(Caption.iF, -1);
                } else {
                    this.c(Caption.iG, -1);
                }
            } else if (this.br <= 14 || VDTT_eq.a().a(13) || var3.a != 47 && (var3.a != 0 && var3.a != 51 || var3.e <= 0 || DataCenter.d().G[var3.e].r != 5)) {
                v().bv = var1;
            } else {
                this.c(Caption.uH, -2560);
            }
        } else {
            v().bv = var1;
        }

        if (v().V()) {
            if (this.br == 14) {
                MenuConfig.K().a(true);
            } else {
                this.c(Caption.uJ, -2560);
            }
        } else if (var1.d == 67 && VDTT_ek.m().w() < 15) {
            this.c(VDTT_jb.b(Caption.uK, DataCenter.d().a((int) 15)), -1);
        } else {
            if (var1.d > 0 && f(var1.d) != f(this.ai) && this.ai != 87) {
                if (VDTT_ek.m().ac()) {
                    a(var1);
                    return;
                }

                if (this.ai != 87) {
                    q(87);
                    return;
                }
            } else if (var1.d > 0 && v().ai != var1.d) {
                VDTT_ge var4 = DataCenter.d().H[var1.d];
                if (VDTT_ek.m().ac() && (var1.d == 84 || var1.d == 19)) {
                    var1.d = 56;
                    a(var1);
                    return;
                }

                if (!var4.a()) {
                    if (var1.b()) {
                        q(var1.d);
                        return;
                    }

                    if (this.br < 19 && v().ai != 57 && v().ai != 62 && v().ai != 66 && v().ai != 61 && (var1.d == 57 || var1.d == 62 || var1.d == 66 || var1.d == 61)) {
                        v().bv.a = 42;
                        v().bv.d = 87;
                        if (v().ai != 86 && v().ai != 87) {
                            v().bw = v().bv;
                            v();
                            q(86);
                            return;
                        }
                    } else {
                        if (v().ai == 87 && var4.e != 0) {
                            this.c(VDTT_jb.b(Caption.uC, Caption.BN[var4.e]) + " " + Caption.Bv[var4.e], -2560);
                            return;
                        }

                        if (var4.a == 56 && v().C().e != 0) {
                            q(86);
                            return;
                        }

                        if (v().ai == 56 && var4.e != 0) {
                            this.c(Caption.iD + " " + Caption.Bv[var4.e], -2560);
                            return;
                        }

                        if (var4.e != v().C().e) {
                            if (var4.e == 0) {
                                q(86);
                                return;
                            }

                            if (var4.a != 56) {
                                this.c(Caption.iD + " " + Caption.Bv[var4.e], -2560);
                            }
                        }
                    }
                }
            }

        }
    }

    public static void q(int var0) {
        for (int var1 = 0; var1 < VDTT_ek.m().aP.length; ++var1) {
            Item var2;
            if ((var2 = VDTT_ek.m().aP[var1]) != null && var2.c == 168) {
                try {
                    Message var4;
                    (var4 = new Message((byte) -25)).b(var2.f);
                    switch (var0) {
                        case 56:
                            var4.a((int) 2);
                            break;
                        case 67:
                            var4.a((int) 1);
                            break;
                        case 86:
                            var4.a((int) 0);
                            break;
                        case 87:
                            var4.a((int) 3);
                    }

                    var4.a((int) 0);
                    var4.l();
                    VDTT_ek.m().S();
                    v().bv = null;
                    return;
                } catch (Exception var3) {
                    return;
                }
            }
        }

    }

    public final void bs(Message var1) {
        try {
            VDTT_ek var2 = VDTT_ek.m();
            VDTT_nn var3 = new VDTT_nn(this, var1.b.a.readInt(), var1.j(), var1.b.a.readByte());

            try {
                (var2 = this.m(var1.b.a.readInt())).bp = var1.b.a.readShort();
            } catch (Exception var5) {
            }

            if (var2.p()) {
                this.a((MainScreen) var3);
            }

        } catch (Exception var6) {
            VDTT_jb.a(var6);
        }
    }

    public final void bt(Message var1) {
        try {
            int var2 = var1.b.a.readInt();
            short var3;
            VDTT_hi var9;
            if ((var3 = var1.b.a.readShort()) == 440) {
                try {
                    MainScreen var10;
                    if ((var10 = super.c) instanceof VDTT_ky) {
                        ((VDTT_ky) var10).k();
                    }

                    int var8;
                    for (var8 = this.au.size() - 1; var8 >= 0; --var8) {
                        VDTT_hi var4;
                        if ((var4 = var9 = (VDTT_hi) this.au.get(var8)).k == 441 || var4.k == 449 || var4.k == 450 || var4.k == 478 || var4.k == 479) {
                            this.au.remove(var9);
                        }
                    }

                    for (var8 = this.at.size() - 1; var8 >= 0; --var8) {
                        VDTT_ev var11;
                        if ((var11 = (VDTT_ev) this.at.get(var8)).r()) {
                            this.at.remove(var11);
                        }
                    }
                } catch (Exception var5) {
                }

                if (var2 < 0) {
                    this.dE = 0L;
                } else {
                    this.dE = System.currentTimeMillis() + 180000L;
                    this.m(var2);
                }
            } else {
                VDTT_ek var7;
                if ((var7 = this.m(var2)) != null) {
                    if (var3 == 447) {
                        var9 = new VDTT_hi(var3, var7.k(), var7.l());
                    } else {
                        var9 = new VDTT_hi(var3, 0, 0);
                    }

                    var7.bf.addElement(var9);
                    if (var7.p() && var9.k == 142) {
                        this.dm = VDTT_jb.a();
                    }

                }
            }
        } catch (Exception var6) {
            VDTT_jb.a(var6);
        }
    }

    public final void bu(Message var1) {
        try {
            VDTT_hi var4 = new VDTT_hi(var1.b.a.readShort(), var1.b.a.readShort(), var1.b.a.readShort(), var1.b.a.readByte());
            this.au.addElement(var4);
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public final void bv(Message var1) {
        try {
            VDTT_gx var2 = (VDTT_gx) this.aq.elementAt(var1.b.a.readShort());
            byte var5 = var1.b.a.readByte();
            if (var2.e == 9 && var5 == 0) {
                var2.objY = var2.o;
            }

            var2.e = var5;
            var2.n();
            if (var2.e == 6 && v().bg != null && v().bg.equals(var2)) {
                v().bg = null;
            }

        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void bw(Message var1) {
        try {
            VDTT_gk var2;
            (var2 = new VDTT_gk(0)).a(var1);
            var2.c(var2.objX, var2.objY);
            var2.d = 3;
            var2.at = true;
            if (var2.k == 236) {
                var2.as = 60;
            }

            this.ap.addElement(var2);
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public final void bx(Message var1) {
        try {
            short var5 = var1.b.a.readShort();

            for (int var3 = 0; var3 < this.ap.size(); ++var3) {
                if (((VDTT_gk) this.ap.elementAt(var3)).b == var5) {
                    this.ap.remove(var3);
                }
            }

        } catch (Exception var4) {
        }
    }

    public final void by(Message var1) {
        try {
            VDTT_gk var2;
            if ((var2 = this.j(var1.b.a.readShort())) != null) {
                if (var2.o <= 0) {
                    var2.o = 1;
                }

                var2.e = 2;
                var2.K = var1.b.a.readShort();
                var2.L = var1.b.a.readShort();
                XYEntity var5;
                if ((var5 = VDTT_ek.b(var2.K, var2.L)) != null) {
                    var2.K = var5.objX;
                    var2.L = var5.objY;
                }

            }
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void bz(Message var1) {
        try {
            VDTT_gk var2;
            (var2 = this.j(var1.b.a.readShort())).e = var1.b.a.readByte();
            var2.c(var1.b.a.readShort(), var1.b.a.readShort());
            var2.at = true;
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void bA(Message var1) {
        try {
            MainScreen var2;
            if ((var2 = super.c) instanceof VDTT_kf) {
                VDTT_kf var5;
                (var5 = (VDTT_kf) var2).P = var1.b.a.readByte();
                var5.Q = var5.T = var1.b.a.readByte();
                var5.R = var5.U = var1.b.a.readByte();
                var5.S = var5.V = var1.b.a.readByte();
                if (var5.S == 1) {
                    switch (var5.Q) {
                        case 1:
                            var5.a = 324;
                            return;
                        case 2:
                            var5.a = 252;
                            return;
                        case 3:
                            var5.a = 180;
                            return;
                        case 4:
                            var5.a = 108;
                            return;
                        case 5:
                            var5.a = 36;
                    }
                }
            }

        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void bB(Message var1) {
        try {
            this.j(var1.b.a.readByte()).e = 4;
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void bC(Message var1) {
        try {
            VDTT_gk var10000 = this.j(var1.b.a.readShort());
            String var2 = var1.b.c();
            var10000.ap = new VDTT_hr(var2);
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public final void bD(Message var1) {
        try {
            short var3 = var1.b.a.readShort();
            VDTT_gx var10000 = (VDTT_gx) this.aq.elementAt(var3);
            String var5 = var1.b.c();
            var10000.n = new VDTT_hr(var5);
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void bE(Message var1) {
        try {
            int var2 = var1.b.a.readInt();
            short var3 = var1.b.a.readShort();
            short var7 = var1.b.a.readShort();

            for (int var4 = 0; var4 < this.ar.size(); ++var4) {
                VDTT_fs var5;
                if ((var5 = (VDTT_fs) this.ar.elementAt(var4)).b == var3) {
                    var5.J = var2;
                    var5.k.c = var7;
                    this.ds.remove(var5);
                    break;
                }
            }

            if (var7 == 224) {
                this.bM = 1000;
                if (this.b.lastElement() instanceof VDTT_nn) {
                    this.b.remove(this.b.lastElement());
                }
            }

        } catch (Exception var6) {
            VDTT_jb.a(var6);
        }
    }

    public final void bF(Message var1) {
        try {
            VDTT_ek var2;
            if ((var2 = this.m(var1.b.a.readInt())) != null) {
                byte var3 = var2.o;
                var2.o = var1.b.a.readByte();
                if (var2.p() && var2.o != var3) {
                    DataCenter.d().c();
                }

            }
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public final void U() {
        try {
            MainScreen var1;
            if ((var1 = super.c) instanceof VDTT_ar) {
                ((VDTT_ar) var1).k();
            }

        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void bG(Message var1) {
        try {
            this.a((MainScreen) (new VDTT_nk(this, var1)));
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void bH(Message var1) {
        try {
            boolean var2 = var1.b.a.readBoolean();
            VDTT_iy[] var3 = new VDTT_iy[var1.b.a()];

            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4] = new VDTT_iy();
                var3[var4].a = var1.b.a.readByte();
                var3[var4].b = var1.b.c();
                var3[var4].d = var1.b.a.readLong();
                var3[var4].e = var1.b.a.readLong();
                var3[var4].f = var1.b.a.readByte();
                var3[var4].g = var1.b.c();
            }

            MainScreen var10;
            if ((var10 = super.c) instanceof VDTT_mx) {
                VDTT_mx var7;
                (var7 = (VDTT_mx) var10).P = var2;
                var7.Q = var3;
                var7.z();
            } else {
                if (!(var10 instanceof VDTT_my)) {
                    if (var10 instanceof VDTT_jm) {
                        VDTT_jm var9;
                        (var9 = (VDTT_jm) var10).a = var3;
                        var9.w();
                    }

                    return;
                }

                VDTT_my var8;
                (var8 = (VDTT_my) var10).a = var3;
                var8.w();
            }
        } catch (Exception var6) {
            VDTT_jb.a(var6);
        }

    }

    public final void bI(Message var1) {
        try {
            var1.b.a.readBoolean();
            VDTT_iy[] var2 = new VDTT_iy[var1.b.a()];

            for (int var3 = 0; var3 < var2.length; ++var3) {
                var2[var3] = new VDTT_iy();
                var2[var3].a = var1.b.a.readByte();
                var2[var3].b = var1.b.c();
                var2[var3].d = var1.b.a.readLong();
                var2[var3].e = var1.b.a.readLong();
                var2[var3].f = var1.b.a.readByte();
                var2[var3].g = var1.b.c();
            }

            VDTT_jm var6;
            (var6 = new VDTT_jm(this)).a = var2;
            var6.w();
            this.a((MainScreen) var6);
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public final void bJ(Message var1) {
        try {
            var1.b.a.readBoolean();
            VDTT_iy[] var2 = new VDTT_iy[var1.b.a()];

            for (int var3 = 0; var3 < var2.length; ++var3) {
                var2[var3] = new VDTT_iy();
                var2[var3].a = var1.b.a.readByte();
                var2[var3].b = var1.b.c();
                var2[var3].d = var1.b.a.readLong();
                var2[var3].e = var1.b.a.readLong();
                var2[var3].f = var1.b.a.readByte();
                var2[var3].g = var1.b.c();
            }

            VDTT_mp var6;
            (var6 = new VDTT_mp(this)).a = var2;
            var6.w();
            this.a((MainScreen) var6);
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public final void bK(Message var1) {
        try {
            MainScreen var2;
            VDTT_iy[] var3;
            int var4;
            if (!((var2 = super.c) instanceof VDTT_mx)) {
                if (var2 instanceof VDTT_jl) {
                    VDTT_jl var8 = (VDTT_jl) var2;
                    var1.b.a.readBoolean();
                    var3 = new VDTT_iy[var1.b.a()];

                    for (var4 = 0; var4 < var3.length; ++var4) {
                        var3[var4] = new VDTT_iy();
                        var3[var4].a = var4 + 1;
                        var3[var4].b = var1.j();
                        var3[var4].c = var1.b.a.readInt();
                        var3[var4].h = var1.b.a.readInt() + "%";
                        var3[var4].e = (long) var1.b.a.readInt();
                        var3[var4].f = var1.b.a.readInt();
                        var3[var4].g = var1.j();
                    }

                    var8.a = var3;
                    var8.w();
                }

                return;
            }

            VDTT_mx var7;
            (var7 = (VDTT_mx) var2).P = var1.b.a.readBoolean();
            var3 = new VDTT_iy[var1.b.a()];

            for (var4 = 0; var4 < var3.length; ++var4) {
                var3[var4] = new VDTT_iy();
                var3[var4].a = var4 + 1;
                var3[var4].b = var1.b.c();
                var3[var4].c = var1.b.a.readInt();
                var3[var4].h = var1.b.a.readInt() + "%";
                var3[var4].e = (long) var1.b.a.readInt();
                var3[var4].f = var1.b.a.readInt();
                var3[var4].g = var1.j();
            }

            var7.Q = var3;
            var7.z();
        } catch (Exception var6) {
            VDTT_jb.a(var6);
        }

    }

    public final void bL(Message var1) {
        try {
            Item var2 = VDTT_ek.m().aP[var1.b.a.readShort()];
            MainScreen var3;
            if (!((var3 = super.c) instanceof VDTT_jr)) {
                if (var3 instanceof VDTT_cw) {
                    String[] var6 = VDTT_jb.a(var1.b.c(), ";");
                    this.a((MainScreen) (new VDTT_mb(this, "", var6, 30000)));
                }

                return;
            }

            VDTT_jr var5;
            (var5 = (VDTT_jr) var3).a(var2, var1.b.c());
        } catch (Exception var4) {
        }

    }

    public static void bM(Message var0) {
        try {
            short var1 = var0.b.a.readShort();

            for (int var2 = 0; var2 < var1; ++var2) {
                Item var3;
                (var3 = new Item()).a(var0);
                if (var3.h == 0L) {
                    VDTT_ek.m().aP[var3.f] = null;
                } else {
                    VDTT_ek.m().aP[var3.f] = var3;
                }
            }

        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    private static void l(int var0, int var1) {
        try {
            Message var2;
            (var2 = new Message((byte) 53)).b(var0);
            var2.a(var1);
            var2.l();
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    private XYEntity a(XYEntity var1, XYEntity var2) {
        for (int var3 = 0; var3 < this.U.a.size(); ++var3) {
            XYEntity var4;
            if ((var4 = ((VDTT_fz) this.U.a.get(var3)).a(var1, var2)) != null) {
                return var4;
            }
        }

        return null;
    }

    private boolean a(XYEntity var1) {
        if (!v().V()) {
            return false;
        } else if (var1 == null) {
            return false;
        } else if (var1 instanceof VDTT_ek) {
            return false;
        } else {
            XYEntity var2;
            (var2 = new XYEntity()).f(var1.objX, var1.objY - 2);
            return this.a((XYEntity) VDTT_ek.m(), (XYEntity) var2) != null;
        }
    }

    public final boolean V() {
        try {
            return this.C().a();
        } catch (Exception var1) {
            return false;
        }
    }

    public final void bN(Message var1) {
        try {
            VDTT_ek var2 = this.m(var1.b.a.readInt());
            int var3 = 0;
            if (var2.p() && super.c instanceof VDTT_kb) {
                var3 = var2.bg.length;
            }

            var2.e(var1);
            var2.ay = (byte) (var1.b.a.readByte() + 1);
            if (var2.p() && super.c instanceof VDTT_kb && var3 != var2.bg.length) {
                ((VDTT_kb) super.c).C();
            }

        } catch (Exception var5) {
        }
    }

    public final void bO(Message var1) {
        try {
            this.dj = var1.b.a.readInt();
            VDTT_ek.m().az = var1.b.a.readByte();
            MenuConfig.L();
            this.X();
        } catch (Exception var3) {
        }
    }

    public static void bP(Message object) {
        try {
            Object object2 = VDTT_cw.v();
            MainScreen vDTT_y = ((VDTT_p) object2).c;
            if (vDTT_y instanceof VDTT_ly) {
                short s = object.b.a.readShort();
                vDTT_y = (VDTT_ly) vDTT_y;
                for (int i = 0; i < ((VDTT_ly) vDTT_y).P.length; ++i) {
                    for (int j = 0; j < ((VDTT_ly) vDTT_y).P[i].length; ++j) {
                        for (int k = 0; k < ((VDTT_ly) vDTT_y).P[i][j].length; ++k) {
                            if (((VDTT_ly) vDTT_y).P[i][j][k].a != s) {
                                continue;
                            }
                            ((VDTT_ly) vDTT_y).P[i][j][k].e = 2;
                            ((VDTT_ly) vDTT_y).z();
                            return;
                        }
                    }
                }
            }
            return;
        } catch (Exception exception) {
            Exception exception2 = exception;
            VDTT_jb.a(exception);
            return;
        }
    }

    public static void bQ(Message var0) {
        try {
            MainScreen var1;
            if ((var1 = v().c) instanceof VDTT_ly) {
                VDTT_ly var3;
                (var3 = (VDTT_ly) var1).a(var0);
            }

        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public static void bR(Message var0) {
        try {
            MainScreen var1;
            if ((var1 = v().c) instanceof VDTT_ly) {
                VDTT_ly var7;
                VDTT_ly var10000 = var7 = (VDTT_ly) var1;
                Message var2 = var0;
                VDTT_ly var6 = var10000;

                try {
                    var6.Q = var2.b.a.readShort();
                    var6.U = var2.b.a.readByte();
                    var6.R = var2.b.a.readInt();
                } catch (Exception var4) {
                }

                var7.z();
            }

        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public final void bS(Message var1) {
        try {
            this.aY = var1.b.a.readBoolean();
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public static void W() {
        try {
            if (Gdx.app.getType() == ApplicationType.Android) {
                Message.c((byte) -115).l();
                return;
            }

            //todo open web payment
//         Gdx.net.openURI("https://vngates.com/pay");
        } catch (Exception var1) {
            VDTT_jb.a(var1);
        }

    }

    public static void b(VDTT_dy var0) {
        switch (var0.a) {
            case 21:
            case 22:
            case 28:
            case 49:
            case 50:
            case 51:
            case 52:
            case 92:
                var0.d = 86;
                return;
            case 40:
                var0.d = 87;
            default:
                return;
            case 59:
                var0.d = 56;
                return;
            case 102:
                var0.d = 67;
        }
    }

    public final void bT(Message var1) {
        try {
            MainScreen var2;
            if ((var2 = super.c) instanceof VDTT_jw) {
                ((VDTT_jw) var2).k();
                var2 = super.c;
            }

            if (var2 instanceof VDTT_lq) {
                VDTT_lq var4;
                (var4 = (VDTT_lq) var2).as = var1.b.a.readBoolean();
            }

        } catch (Exception var3) {
        }
    }

    public final void bU(Message var1) {
        try {
            byte var2 = var1.b.a.readByte();
            Item var3 = null;

            for (int var4 = 0; var4 < var2; ++var4) {
                byte var5 = var1.b.a.readByte();
                if (var4 != 0) {
                    if (var5 == 2) {
                        VDTT_ek.m().aR[var1.b.a.readShort()] = null;
                    } else if (var5 == 3) {
                        VDTT_ek.m().aS[var1.b.a.readShort()] = null;
                    } else {
                        VDTT_ek.m().aP[var1.b.a.readShort()] = null;
                    }
                } else {
                    (var3 = new Item()).a(var1);
                    var3.w = var5;
                    if (var5 == 2 || var5 == 3) {
                        var3.f = var3.getItemTemplate().f;
                    }

                    VDTT_ek.m().i(var3.w)[var3.f] = var3;
                }
            }

            MainScreen var8;
            if ((var8 = super.c) instanceof VDTT_kv) {
                VDTT_kv var9;
                (var9 = (VDTT_kv) var8).T = true;
                var9.X[0] = 50;
                var9.R = new VDTT_hi(114, 0, 0);

                int var7;
                for (var7 = 0; var7 < var9.P.length; ++var7) {
                    var9.P[var7] = null;
                }

                for (var7 = 0; var7 < var9.O.length; ++var7) {
                    var9.O[var7] = null;
                }

                var9.O[0] = var3;
                var9.S = var3;
            }

        } catch (Exception var6) {
        }
    }

    public final void bV(Message var1) {
        try {
            byte var2;
            if ((var2 = var1.b.a.readByte()) == 2) {
                VDTT_ek.m().aR[var1.b.a.readShort()] = null;
            } else if (var2 == 3) {
                VDTT_ek.m().aS[var1.b.a.readShort()] = null;
            } else {
                VDTT_ek.m().aP[var1.b.a.readShort()] = null;
            }

            Item var7;
            (var7 = new Item()).a(var1);
            var7.f = -1;
            MainScreen var5;
            if ((var5 = super.c) instanceof VDTT_mm) {
                VDTT_mm var6;
                (var6 = (VDTT_mm) var5).T = true;
                var6.S = new VDTT_hi(114, 0, 0);

                int var3;
                for (var3 = 0; var3 < var6.P.length; ++var3) {
                    var6.P[var3] = null;
                }

                for (var3 = 0; var3 < var6.O.length; ++var3) {
                    var6.O[var3] = null;
                }

                var6.Q = null;
                var6.O[0] = var7;
            }

        } catch (Exception var4) {
        }
    }

    public final void bW(Message var1) {
        try {
            byte var2 = var1.b.a.readByte();
            short var3 = var1.b.a.readShort();
            Item var4;
            (var4 = new Item()).a(var1);
            var4.w = var2;
            v().cY = var1.b.a.readInt();
            if (var2 == 2) {
                VDTT_ek.m().aR[var3] = var4;
                var4.f = var4.getItemTemplate().f;
            } else if (var2 == 3) {
                VDTT_ek.m().aS[var3] = var4;
                var4.f = var4.getItemTemplate().f;
            } else {
                VDTT_ek.m().aP[var3] = var4;
            }

            MainScreen var7;
            if ((var7 = super.c) instanceof VDTT_jx) {
                VDTT_jx var8;
                (var8 = (VDTT_jx) var7).d = new VDTT_hi(114, 0, 0);
                int var10 = 0;

                while (true) {
                    if (var10 >= var8.a.length) {
                        var8.P = var4;
                        var8.Q = true;
                        var8.k();
                        break;
                    }

                    var8.a[var10] = null;
                    ++var10;
                }
            }

            if ((var7 = super.c) instanceof VDTT_kb) {
                VDTT_kb var9;
                VDTT_kb var11 = var9 = (VDTT_kb) var7;
                if (var2 == 2) {
                    var11.aE = new VDTT_hi(114, 32, 107);
                    return;
                }

                if (var2 == 3) {
                    var11.aE = new VDTT_hi(114, 118, 107);
                }
            }

        } catch (Exception var6) {
        }
    }

    public final void bX(Message var1) {
        try {
            byte var2 = var1.b.a.readByte();
            short var3 = var1.b.a.readShort();
            Item var4;
            (var4 = new Item()).a(var1);
            var4.w = var2;
            boolean var7 = var1.b.a.readBoolean();
            if (var2 == 2) {
                VDTT_ek.m().aR[var3] = var4;
                var4.f = var4.getItemTemplate().f;
            } else if (var2 == 3) {
                VDTT_ek.m().aS[var3] = var4;
                var4.f = var4.getItemTemplate().f;
            } else {
                VDTT_ek.m().aP[var3] = var4;
            }

            MainScreen var8;
            if ((var8 = super.c) instanceof VDTT_kp) {
                VDTT_kp var9;
                (var9 = (VDTT_kp) var8).P = new VDTT_hi(114, 0, 0);

                for (int var10 = 0; var10 < var9.ab.length; ++var10) {
                    var9.ab[var10] = null;
                }

                var9.Q = var4;
                var9.R = true;
                var9.S = var7;
                var9.O[2] = 50;
            }

        } catch (Exception var6) {
        }
    }

    public final void bY(Message var1) {
        try {
            byte var2 = var1.b.a.readByte();
            short var3 = var1.b.a.readShort();
            Item var4;
            (var4 = new Item()).a(var1);
            var4.w = var2;
            if (var2 == 2) {
                VDTT_ek.m().aR[var3] = var4;
                var4.f = var4.getItemTemplate().f;
            } else if (var2 == 3) {
                VDTT_ek.m().aS[var3] = var4;
                var4.f = var4.getItemTemplate().f;
            } else {
                VDTT_ek.m().aP[var3] = var4;
            }

            MainScreen var6;
            if ((var6 = super.c) instanceof VDTT_ku) {
                VDTT_ku var7;
                (var7 = (VDTT_ku) var6).P = new VDTT_hi(114, 0, 0);

                for (int var8 = 0; var8 < var7.ab.length; ++var8) {
                    var7.ab[var8] = null;
                }

                (var7 = var7).Q = var4;
                var7.R = true;
            }

        } catch (Exception var5) {
        }
    }

    public final void bZ(Message var1) {
        try {
            var1.b.a.readByte();
            (new Item(0)).a(var1);
        } catch (Exception var3) {
        }
    }

    public static void ca(Message var0) {
        try {
            MainScreen var1;
            if ((var1 = DataCenter.d().ai.c) instanceof VDTT_jp) {
                VDTT_jp var2;
                VDTT_jp var7;
                (var2 = var7 = (VDTT_jp) var1).aa = true;
                var2.Y = false;
                var2.Z = false;
                var2.W.a(false);
                short var10001 = var0.b.a.readShort();
                int var10002 = var0.b.a.readInt();
                byte var3 = var0.b.a.readByte();
                int var8 = var10002;
                short var6 = var10001;
                var2 = var7;
                var7.X = var3;

                for (int var9 = 0; var9 < var2.U.length; ++var9) {
                    if (var2.U[var9].c == var6 && var2.U[var9].d == var8) {
                        var2.aa = false;
                        var2.V = var2.U[var9];
                        return;
                    }
                }
            }

        } catch (Exception var5) {
        }
    }

    public final void cb(Message var1) {
        try {
            byte var2 = var1.b.a.readByte();
            short var3 = var1.b.a.readShort();
            Item var4;
            (var4 = new Item()).a(var1);
            var4.w = var2;
            if (var2 == 2) {
                VDTT_ek.m().aR[var3] = var4;
                var4.f = var4.getItemTemplate().f;
            } else if (var2 == 3) {
                VDTT_ek.m().aS[var3] = var4;
                var4.f = var4.getItemTemplate().f;
            } else {
                VDTT_ek.m().aP[var3] = var4;
            }

            MainScreen var6;
            if ((var6 = super.c) instanceof VDTT_md) {
                VDTT_md var7;
                (var7 = (VDTT_md) var6).P = new VDTT_hi(114, 0, 0);

                for (int var8 = 0; var8 < var7.ab.length; ++var8) {
                    var7.ab[var8] = null;
                }

                (var7 = var7).Q = var4;
                var7.R = true;
            }

        } catch (Exception var5) {
        }
    }

    public final void cc(Message var1) {
        try {
            byte var2 = var1.b.a.readByte();

            for (int var3 = 0; var3 < var2; ++var3) {
                VDTT_ek.m().aP[var1.b.a.readShort()] = null;
            }

            byte var9 = var1.b.a.readByte();
            Item var8;
            (var8 = new Item()).a(var1);
            VDTT_ek.m().aP[var8.f] = var8;
            MainScreen var6;
            if ((var6 = super.c) instanceof VDTT_ko) {
                VDTT_ko var7;
                (var7 = (VDTT_ko) var6).O = new VDTT_hi(114, 0, 0, 1);

                for (int var4 = 0; var4 < var7.ab.length; ++var4) {
                    var7.ab[var4] = null;
                }

                var7.Q = var9;
                var7.P = var8;
            }

        } catch (Exception var5) {
        }
    }

    public final void cd(Message var1) {
        try {
            byte var2 = var1.b.a.readByte();

            for (int var3 = 0; var3 < var2; ++var3) {
                VDTT_ek.m().aP[var1.b.a.readShort()] = null;
            }

            Item var9;
            (var9 = new Item()).a(var1);
            VDTT_ek.m().aP[var9.f] = var9;
            MainScreen var6;
            if ((var6 = super.c) instanceof VDTT_ks) {
                VDTT_ks var7;
                (var7 = (VDTT_ks) var6).O = new VDTT_hi(114, 0, 0, 1);

                for (int var8 = 0; var8 < var7.ab.length; ++var8) {
                    var7.ab[var8] = null;
                }

                var7.Q = 0;
                var7.P = var9;
            }

        } catch (Exception var5) {
        }
    }

    public final void ce(Message var1) {
        try {
            boolean var2 = var1.b.a.readBoolean();
            VDTT_ek.m().ak = var1.b.a.readInt();
            byte var3 = var1.b.a.readByte();

            for (int var4 = 0; var4 < var3; ++var4) {
                VDTT_ek.m().aP[var1.b.a.readShort()] = null;
            }

            Item var10;
            (var10 = new Item()).a(var1);
            var10.w = var1.b.a.readByte();
            if (var10.w == 2 || var10.w == 3) {
                var10.f = var10.getItemTemplate().f;
            }

            VDTT_ek.m().i(var10.w)[var10.f] = var10;
            MainScreen var7;
            if ((var7 = super.c) instanceof VDTT_ne) {
                VDTT_ne var8;
                (var8 = (VDTT_ne) var7).P = new VDTT_hi(114, 0, 0, 1);

                int var9;
                for (var9 = 0; var9 < var8.ab.length; ++var9) {
                    var8.ab[var9] = null;
                }

                for (var9 = 0; var9 < var8.ac.length; ++var9) {
                    var8.ac[var9] = null;
                }

                if (var2) {
                    var8.O = 1;
                } else {
                    var8.O = 2;
                }

                var8.ac[1] = var10;
            }

        } catch (Exception var6) {
        }
    }

    public final void cf(Message var1) {
        try {
            Item[] var2 = new Item[var1.b.a.readByte()];

            int var3;
            for (var3 = 0; var3 < var2.length; ++var3) {
                var2[var3] = new Item();
                var2[var3].a(var1);
            }

            MainScreen var10;
            if ((var10 = super.c) instanceof VDTT_mm) {
                VDTT_mm var7;
                (var7 = (VDTT_mm) var10).Q = var2;
                var7 = var7;
                Vector var8 = new Vector();

                try {
                    for (var3 = 1; var3 < var7.Q.length; ++var3) {
                        var8.add(var3 + ". " + var7.Q[var3].getItemTemplate().b);
                    }
                } catch (Exception var5) {
                }

                String[] var11;
                (var11 = new String[var8.size() + 1])[0] = Caption.ru;

                int var4;
                for (var4 = 0; var4 < var8.size(); ++var4) {
                    var11[var4 + 1] = (String) var8.get(var4);
                }

                if ((var4 = var11.length) > 8) {
                    var4 = 8;
                }

                VDTT_hp var9 = new VDTT_hp(1004, var11);
                var7.W.a(var9, var4);
            }

        } catch (Exception var6) {
        }
    }

    public final void cg(Message var1) {
        try {
            Item var2;
            (var2 = new Item()).a(var1);
            int var5 = var1.b.a.readInt();
            MainScreen var3;
            if ((var3 = super.c) instanceof VDTT_kv) {
                VDTT_kv var7;
                VDTT_kv var10000 = var7 = (VDTT_kv) var3;
                int var8 = var5;
                VDTT_kv var6 = var10000;
                var10000.W = var8;
                var6.O[0] = var2;
                var6.S = var2.a();
            }

        } catch (Exception var4) {
        }
    }

    public final void ch(Message var1) {
        try {
            Item var2;
            (var2 = new Item()).a(var1);
            MainScreen var4;
            if ((var4 = super.c) instanceof VDTT_jx) {
                VDTT_jx var5;
                (var5 = var5 = (VDTT_jx) var4).P = var2.a();
                var5.k = VDTT_jx.a(var5.b[1].a(1002, var5), var5, var5.P);
            }

        } catch (Exception var3) {
        }
    }

    public final void ci(Message var1) {
        try {
            if (!VDTT_ac.b().a) {
                int var2 = var1.b.a.readInt();
                boolean var3;
                if ((!(var3 = var1.b.a.readBoolean()) || !VDTT_eq.a().a(23)) && (var3 || !VDTT_eq.a().a(24)) && (var2 != VDTT_ek.m().b || !VDTT_eq.a().a(8))) {
                    String var5 = var1.b.c();
                    (new Thread(new VDTT_cz(this, var5))).start();
                }
            }
        } catch (Exception var4) {
        }
    }

    public final void r(int var1) {
        try {
            if (this.aS != null && this.aT != null) {
                this.cH = var1;
                VDTT_eq.a().a(13, var1);
                this.az.a((VDTT_m) this.aS);
                this.b((VDTT_m) this.aS);
                this.az.a((VDTT_m) this.aT);
                this.b((VDTT_m) this.aT);
                this.dC.b = this.dx.b = false;
                switch (var1) {
                    case 0:
                    case 1:
                        this.a((VDTT_m) this.aS);
                        this.az.b((VDTT_m) this.aS);
                        this.dC.b = true;
                        break;
                    case 2:
                        this.a((VDTT_m) this.aT);
                        this.az.b((VDTT_m) this.aT);
                        this.dx.b = true;
                }

                this.aS.d();
                DataCenter.d().c();
            }

        } catch (Exception var2) {
        }
    }

    public final void X() {
        this.A();
        DataCenter.d().c();
    }

    public static void a(int var0, Item var1) {
        if (var1.c < 269 || var1.c > 273) {
            if (var1.c == 826) {
                VDTT_bc.a(9, Caption.bY, Caption.q + " " + var1.getItemTemplate().b);
                DataCenter.d().ai.c(Caption.q + " " + var1.getItemTemplate().b, -1);
                return;
            }

            if (var1.c >= 792 && var1.c <= 798) {
                VDTT_bc.a(9, Caption.bY, Caption.q + " " + Caption.tw + " " + var1.getItemTemplate().b);
                DataCenter.d().ai.c(Caption.q + " " + Caption.tw + " " + var1.getItemTemplate().b, -1);
                return;
            }

            if (var0 > 0) {
                VDTT_bc.a(9, Caption.bY, Caption.q + " " + VDTT_jb.c(var0) + " " + var1.getItemTemplate().b);
                DataCenter.d().ai.c(Caption.q + " " + VDTT_jb.c(var0) + " " + var1.getItemTemplate().b, -1);
            }
        }

    }

    private void dellItem() {
        int count = MenuConfig.K().getAutoDelItem();
        if (count <= 0) {
            return;
        }

        for (int i = VDTT_ek.m().aP.length - 1; i >= 0; i--) {
            Item item = VDTT_ek.m().aP[i];
            if (item == null || item.c < 0 || item.getItemTemplate() == null) {
                continue;
            }
            switch (item.getItemTemplate().f) {
                case 2:
                case 4:
                case 6:
                case 8:
                    String[] ops = item.strOptions.split(";");
                    if (ops.length < count) {
                        VDTT_cw.a(item, false);
                    }
                    break;
            }
        }
    }

    private boolean w(int var1) {
        if (MenuConfig.K().getAutoGhepDa() == 0) {
            return false;
        } else {
            Vector vItem = new Vector();

            int var3;
            for (var3 = 0; var3 < VDTT_ek.m().aP.length; ++var3) {
                if (VDTT_ek.m().aP[var3] != null && VDTT_ek.m().aP[var3].p() && VDTT_ek.m().aP[var3].c <= var1) {
                    vItem.add(VDTT_ek.m().aP[var3]);
                }
            }

            Collections.sort(vItem, Item.a);
            var3 = vItem.size() > 16 ? 16 : vItem.size();
            int var4 = 0;
            Vector var6 = new Vector();

            for (int var7 = 0; var7 < var3; ++var7) {
                Item var5 = (Item) vItem.get(var7);
                var6.add(var5);
                if ((float) ((long) ((var4 = (int) ((long) var4 + DataCenter.d().as[var5.c])) * 100) / DataCenter.d().as[var1 + 1]) >= (float) this.dc) {
                    if (DataCenter.d().an[var1 + 1] > VDTT_ek.m().al) {
                        MenuConfig var10000 = MenuConfig.K();
                        boolean var10 = true;
                        var10 = true;
                        MenuConfig var11 = var10000;
                        var10000.configClient[7] = -1;
                        var11.I();
                        DataCenter.d().ai.c(Caption.pB, -48128);
                        return false;
                    }

                    try {
                        this.en = VDTT_jb.a();
                        Message var9;
                        (var9 = new Message((byte) 108)).a(true);
                        var9.a(var6.size());

                        for (int var12 = 0; var12 < var6.size(); ++var12) {
                            var9.b(((Item) var6.get(var12)).f);
                        }

                        var9.l();
                    } catch (Exception var8) {
                    }

                    return true;
                }
            }

            return false;
        }
    }

    private static void x(int var0) {
        try {
            if (var0 != v().al) {
                d = true;
                Message var1;
                (var1 = new Message((byte) -7)).a(var0);
                var1.l();
            }
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    private static void y(int var0) {
        try {
            Message var1;
            (var1 = new Message((byte) -15)).a(var0);
            var1.l();
        } catch (Exception var2) {
        }
    }

    public final void cj(Message var1) {
        try {
            MainScreen var2;
            if ((var2 = super.c) instanceof VDTT_jp) {
                Item[] var3 = new Item[var1.b.a.readShort()];

                for (int var5 = 0; var5 < var3.length; ++var5) {
                    Item var4;
                    (var4 = new Item()).a(var1);
                    var4.f = var5;
                    var3[var4.f] = var4;
                }

                VDTT_jp var10000 = (VDTT_jp) var2;
                byte var9 = var1.b.a.readByte();
                VDTT_jp var7 = var10000;
                var10000.U = var3;
                var7.X = var9;
            }

        } catch (Exception var6) {
        }
    }

    private boolean aA() {
        return this.C().d == 10 || this.C().d == 5 || this.C().d == 19 || this.C().d == 20 || this.C().d == 21 || this.C().d == 15 || this.C().d == 24;
    }

    public final void Y() {
        if (!this.aA()) {
            (new Message((byte) 49)).l();
            VDTT_ek.m().bH = MenuConfig.K().H();
        }
    }

    public final void Z() {
        if (!this.aA()) {
            (new Message((byte) 48)).l();
        }
    }

    public final boolean aa() {
        return VDTT_ek.m().h() && !this.aA();
    }

    public final void ab() {
        for (int var1 = 0; var1 < VDTT_ek.m().bb.size(); ++var1) {
            VDTT_ez var2;
            if ((var2 = (VDTT_ez) VDTT_ek.m().bb.get(var1)).a == 118) {
                VDTT_ek.m().bb.remove(var2);
                break;
            }
        }

        if (this.dl > 0L) {
            VDTT_ez var3 = new VDTT_ez(118, 0, VDTT_jb.a(), (int) this.dl, VDTT_ek.m());
            VDTT_ek.m().bb.add(var3);
        }

    }

    public final boolean ac() {
        return this.C().d == 20 || this.C().a == 46;
    }

    public final void ck(Message var1) {
        try {
            MainScreen var2;
            VDTT_mw var8;
            if ((var2 = super.c) instanceof VDTT_mw) {
                var8 = (VDTT_mw) var2;
            } else {
                var8 = new VDTT_mw(this);
            }

            var8.T = var1.b.a.readByte();
            var8.R = VDTT_jb.a();
            var8.Q = var1.b.a.readInt();
            int var4;
            if (var8.T <= 2) {
                VDTT_iy[] var9 = new VDTT_iy[var1.b.a()];

                for (var4 = 0; var4 < var9.length; ++var4) {
                    var9[var4] = new VDTT_iy();
                    var9[var4].b = var1.b.c();
                    var9[var4].d = var1.b.a.readLong();
                    var9[var4].e = (long) var1.b.a.readShort();
                    var9[var4].g = var1.b.c();
                }

                var8.U = var9;
                var8.P = new VDTT_hs((byte) 1, 4, var8.O.i() + 30, var8.q - 8, 144, 18, var8.U.length);
                return;
            }

            var8.V.clear();
            byte var3 = var1.b.a.readByte();

            for (var4 = 0; var4 < var3; ++var4) {
                VDTT_gc var5;
                (var5 = new VDTT_gc()).a = var1.b.c();
                var5.c = var1.b.a.readShort();
                var5.b = var1.b.c();
                var5.d = var1.b.a.readShort();
                var5.e = var1.b.a.readByte();
                var8.V.add(var5);
            }

            var8.P = new VDTT_hs((byte) 1, 4, var8.O.i() + 30, var8.q - 8, 144, 18, var8.V.size());
        } catch (Exception var7) {
        }

    }

    public final void ad() {
        switch (v().C().d) {
            case 6:
                this.a((MainScreen) (new VDTT_jm(this)));
                return;
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 17:
            default:
                this.a((MainScreen) (new VDTT_mx(this)));
                return;
            case 10:
            case 16:
                this.a((MainScreen) (new VDTT_my(this)));
                return;
            case 18:
                this.a((MainScreen) (new VDTT_jl(this)));
                return;
            case 19:
            case 20:
                if (v().C().a == 46) {
                    this.a((MainScreen) (new VDTT_mx(this)));
                } else {
                    this.a((MainScreen) (new VDTT_mw(this)));
                }
        }
    }

    public final void ae() {
        MenuConfig var1;
        (var1 = MenuConfig.K()).J();
        var1.f(M);
        var1.T = 0;
        var1.a(var1.q, var1.r);
        this.a((MainScreen) var1);
        v().ds.clear();
    }

    public static VDTT_ic j(int var0, int var1) {
        for (int var2 = 0; var2 < DataCenter.d().T.length; ++var2) {
            if (DataCenter.d().T[var2].d == var0 && DataCenter.d().T[var2].e == var1) {
                return DataCenter.d().T[var2];
            }
        }

        return null;
    }

    public static boolean af() {
        for (int var0 = 0; var0 < v().ad.length; ++var0) {
            VDTT_ic var1;
            if ((var1 = v().ad[var0]) != null && var1.f <= VDTT_ek.m().w() && var1.l <= v().ce) {
                return true;
            }
        }

        return false;
    }

    public final void a(int var1, VDTT_ek var2, int var3) {
        for (int var4 = 0; var4 < this.cK.size(); ++var4) {
            if (((VDTT_hg) this.cK.get(var4)).l.equals(var2)) {
                return;
            }
        }

        this.cK.add(new VDTT_hg(var1, var2, var3));
    }

    public final void cl(Message var1) {
        try {
            MainScreen var2;
            if ((var2 = v().c) instanceof VDTT_mb) {
                ((VDTT_mb) var2).k();
            }

            byte var4 = var1.b.a.readByte();
            String var5 = VDTT_jb.b(Caption.we, DataCenter.d().a((int) var4));
            this.a((MainScreen) (new VDTT_mb(this, var5, new String[0], -4)));
        } catch (Exception var3) {
        }
    }

    public static void cm(Message var0) {
        try {
            byte var3 = var0.b.a.readByte();
            String var4 = VDTT_jb.b(Caption.we, DataCenter.d().a((int) var3));
            DataCenter.d().ai.c(var4, -1);
        } catch (Exception var2) {
        }
    }

    public final void cn(Message var1) {
        try {
            String[] var2 = new String[var1.b.a.readByte()];

            for (int var3 = 0; var3 < var2.length; ++var3) {
                var2[var3] = var1.b.c();
            }

            VDTT_ky var6 = new VDTT_ky(this, var2, Caption.wI);
            this.a((MainScreen) var6);
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public final void co(Message var1) {
        try {
            MainScreen var2;
            if ((var2 = super.c) instanceof VDTT_kb) {
                VDTT_kb var6;
                (var6 = (VDTT_kb) var2).aF[0] = var1.b.a.readInt();
                var6.aF[1] = var1.b.a.readInt();
                var6.aF[2] = var1.b.a.readInt();
                var6.aF[3] = var1.b.a.readInt();
                var6.aF[4] = var1.b.a.readInt();
                var6.aF[5] = var1.b.a.readInt();
                var6.aF[6] = var1.b.a.readShort();
                var6.aF[7] = var1.b.a.readShort();
                var6.aF[8] = var1.b.a.readShort();
                var6.aF[9] = var1.b.a.readShort();
                var6.aF[10] = var1.b.a.readShort();
                var6.aF[11] = var1.b.a.readShort();
                var6.aF[12] = var1.b.a.readShort();
                var6.aF[13] = var1.b.a.readShort();
                var6.aF[14] = var1.b.a.readShort();
                var6.aF[15] = var1.b.a.readShort();
                var6.aF[16] = var1.b.a.readShort();
                var6.aF[17] = var1.b.a.readShort();
                var6.aF[18] = var1.b.a.readShort();
                var6.aF[19] = var1.b.a.readShort();
                var6.aF[20] = var1.b.a.readShort();
                var6.aF[21] = var1.b.a.readShort();
                var6.aF[22] = var1.b.a.readShort();
                var6.aF[23] = var1.b.a.readShort();
                var6.aF[24] = var1.b.a.readShort();

                try {
                    var6.aC = var1.b.a.readInt();
                    if (var6.V.p()) {
                        var6.V.ap = var1.b.a.readByte();
                        var6.j(var6.V.ap);
                    }
                } catch (Exception var4) {
                }

                var6.I();
            }

        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    public final void cp(Message var1) {
        try {
            VDTT_ek var2;
            if ((var2 = this.m(var1.b.a.readInt())) != null) {
                var2.ap = var1.b.a.readByte();
                var2.as = var1.b.a.readInt();
                var2.aq = var1.b.a.readInt();
                var2.at = var1.b.a.readInt();
                var2.ar = var1.b.a.readInt();
                MainScreen var5;
                if ((var5 = super.c) instanceof VDTT_kb) {
                    VDTT_kb var6;
                    if ((var6 = (VDTT_kb) var5).V.b != var2.b) {
                        return;
                    }

                    var6.aF[0] = var2.as;
                    var6.aF[1] = var2.aq;
                    var6.aF[2] = var2.at;
                    var6.aF[3] = var2.ar;
                    var6.j(var2.ap);
                    var6.I();
                }
            }

        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void cq(Message var1) {
        try {
            this.ax.clear();
            Vector var2 = new Vector();
            byte var3 = var1.b.a.readByte();

            int var4;
            for (var4 = 0; var4 < var3; ++var4) {
                int var5 = var1.b.a.readInt();
                VDTT_ek var6;
                if ((var6 = this.m(var5)) != null) {
                    var2.add(var6);
                    if (var1.b.a.readByte() == 0) {
                        this.ax.add(var6);
                    }
                } else {
                    Message var7;
                    (var7 = Message.c((byte) 9)).c(var5);
                    var7.l();
                }
            }

            if (v().C().d == 20 && this.C().a != 46) {
                for (var4 = 0; var4 < this.ao.size(); ++var4) {
                    VDTT_ek var9;
                    if ((var9 = (VDTT_ek) this.ao.get(var4)).b != VDTT_ek.m().b && !var2.contains(var9) && !this.aw.contains(var9)) {
                        this.aw.add(var9);
                    }
                }
            }

        } catch (Exception var8) {
            VDTT_jb.a(var8);
        }
    }

    public final void ag() {
        try {
            for (int var1 = this.b.size() - 1; var1 >= 0; --var1) {
                if (this.b.get(var1) instanceof VDTT_am) {
                    ((VDTT_am) this.b.get(var1)).k();
                } else if (!(this.b.get(var1) instanceof VDTT_p)) {
                    this.b.remove(var1);
                }
            }

        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void a(XYEntity var1, XYEntity var2, boolean var3, Hashtable var4) {
        if (!var3 || var1.objX == var2.objX || var1.objY == var2.objY || this.U.a(var1, var2) == null) {
            String var5 = var1.objX + "_" + var1.objY;
            String var6 = var2.objX + "_" + var2.objY;
            if (!var5.equals(var6)) {
                VDTT_gq var7;
                if ((var7 = (VDTT_gq) var4.get(var5)) == null) {
                    var7 = new VDTT_gq();
                }

                if (!var7.a.contains(var6)) {
                    var7.a.add(var6);
                    if (var3 && var1.objY == var2.objY) {
                        this.dP.add(new VDTT_fz(new XYEntity[]{var1, var2}));
                    }
                }

                var4.put(var5, var7);
            }
        }
    }

    public final void cr(Message var1) {
        try {
            VDTT_ek.m().aB = var1.b.a.readByte();
            MainScreen var3;
            if ((var3 = super.c) instanceof VDTT_kb) {
                VDTT_kb var4;
                (var4 = (VDTT_kb) var3).G();
            }

        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final boolean a(VDTT_ba var1) {
        return this.du != null && this.du.b.contains(var1) && var1.I != 100;
    }

    public static void cs(Message var0) {
        try {
            VDTT_bn.K = var0.b.c();
        } catch (Exception var1) {
        }
    }

    public final void ct(Message var1) {
        try {
            this.cs = var1.b.a.readByte();
            MainScreen var3;
            if (this.cs == 0 && (var3 = super.c) instanceof VDTT_mg) {
                VDTT_mg var4;
                (var4 = (VDTT_mg) var3).R = true;
            }

        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void s(int var1) {
        this.de = var1;
    }

    public final void cu(Message var1) {
        try {
            byte var2;
            if ((var2 = var1.b.a.readByte()) == 10) {
                for (int var11 = 0; var11 < 200; ++var11) {
                    short var14 = var1.b.a.readShort();
                    String var12 = var1.b.c();
                    DataCenter.d().P[var14].b = var12;
                }
            } else {
                String[] var3 = new String[var1.b.a()];

                for (int var4 = 0; var4 < var3.length; ++var4) {
                    var3[var4] = var1.b.c();
                }

                MainScreen var13 = super.c;
                switch (var2) {
                    case 0:
                        if (var13 instanceof VDTT_kb) {
                            VDTT_kb var7;
                            VDTT_kb var10;
                            a((var7 = var10 = (VDTT_kb) var13).W[var7.am].h(), var3);
                            if (var10.ap.b.b != 1) {
                                var10.g(var10.am);
                                return;
                            }

                            var10.h(var10.an);
                        }
                    case 1:
                    default:
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        if (var13.k instanceof VDTT_bn) {
                            VDTT_bn var9;
                            a((var9 = (VDTT_bn) var13.k).I.L(), var3);
                            var9.d();
                            return;
                        }

                        if (var13.k instanceof VDTT_bo) {
                            VDTT_bo var8;
                            a((var8 = (VDTT_bo) var13.k).l.I.L(), var3);
                            var8.l.d();
                        }
                }

                return;
            }
        } catch (Exception var6) {
        }

    }

    private static void a(VDTT_gz[] var0, String[] var1) {
        if (var0.length == var1.length) {
            for (int var2 = 0; var2 < var0.length; ++var2) {
                var0[var2].a().b = var1[var2];
            }
        }

    }

    public Vector<AnimationPetAttack> listAnimationPetAttack = new Vector<AnimationPetAttack>();

    // $FF: synthetic method
    static VDTT_v b(VDTT_v var0) {
        dT = var0;
        return var0;
    }

    void readAnimationPetAttack(Message var1) {
        try {
            byte type = var1.readByte();
            int idTarget = var1.b.a.readShort();
            int idPlayer = var1.b.a.readShort();
            int frameStart = var1.b.a.readShort();
            int frameEnd = var1.b.a.readShort();
            int tick = var1.b.a.readByte();
            VDTT_n target = type == 0 ? this.k(idTarget) : this.j(idTarget);
            if (target == null || target.h()) {
                System.out.println("target null or die");
                return;
            }
            VDTT_ek player = this.findChar(idPlayer);
            if (player == null) {
                System.out.println("run");
                return;
            }
            listAnimationPetAttack.add(new AnimationPetAttack(target, player, frameStart, frameEnd, tick));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void readMobPetChar(Message var1) {
        try {
            int idPlayer = var1.b.a.readShort();
            VDTT_ek player = this.findChar(idPlayer);
            if (player == null) {
                System.out.println("run");
                return;
            }
            player.bl = null;
            player.isShowPet = var1.b.a.readBoolean();
            if (player.isShowPet) {
                player.dxMove = var1.b.a.readInt();
                player.dyMove = var1.b.a.readInt();
                player.dxStand = var1.b.a.readInt();
                player.dyStand = var1.b.a.readInt();
                player.frameStartMove = var1.b.a.readInt();
                player.frameEndMove = var1.b.a.readInt();
                player.frameStartStand = var1.b.a.readInt();
                player.frameEndStand = var1.b.a.readInt();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static class AnimationPetAttack {

        public int frameStart = 580;
        public int frameEnd = 663;
        public int tickSpeed = 2;
        public VDTT_n target = null;
        public int countTick = 0;
        public XYEntity master = null;
        public VDTT_ek master_char = null;

        public AnimationPetAttack(VDTT_n target, VDTT_ek master, int frameStart, int frameEnd, int tickSpeed) {
            this.target = target;
            this.master = (XYEntity) master.clone();
            this.master_char = master;
            this.frameStart = frameStart;
            this.frameEnd = frameEnd;
            this.tickSpeed = tickSpeed;
        }

        public boolean paint(Graphics paint) {
            countTick++;
            if (target == null || master == null) {
                return false;
            }
            int frame = frameStart + countTick / tickSpeed;// % (frameEnd - frameStart);
            if (frame > frameEnd) {
                master_char.isHidePet = false;
                return false;
            }
            master_char.isHidePet = true;
            if (master.objX < target.objX) {
                VDTT_dc.b(paint, 10000 + frame, -360, target.objX + 10, target.objY - 50, 3);
            } else {
                VDTT_dc.b(paint, 10000 + frame, 0, target.objX - 10, target.objY - 50, 3);
            }
            return true;
        }
        /*
                //                    int frame = 580 + DataCenter.d().h / 2 % (663 - 580);
//                    //int frame = 400 + DataCenter.d().h / 2 % (480 - 400);
//                    //338 + DataCenter.d().h / 3 % 241;
//                    if (VDTT_ek.m().objX < this.objX) {
//
//                        VDTT_dc.b(var1, 32000 + frame, -360, this.objX + 10, this.objY - 50, 3);
//
//                    } else {
//                        VDTT_dc.b(var1, 32000 + frame, 0, this.objX - 10, this.objY - 50, 3);
//                    }
         */
    }
}
