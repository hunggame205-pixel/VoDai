package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;

import java.io.IOException;
import java.io.Reader;
import java.util.Hashtable;
import java.util.Objects;
import java.util.Vector;

public final class DataCenter {

    public String a = "180.93.120.92";
    public int b = 7105;
    public String c = "";
    public int d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public String s = "abcdefg";
    public int t = 0;
    public int u = 33;
    public int v = 43;
    public float w = 1.0F;
    public VDTT_gf[] x;
    public VDTT_hc[] y;
    public VDTT_he[] z;
    public VDTT_hd[] A;
    public VDTT_es[] B;
    public VDTT_ew[] C;
    public Hashtable D;
    public VDTT_hk[] E;
    public VDTT_gy[] F;
    public VDTT_gl[] G;
    public VDTT_ge[] H;
    public VDTT_du[] I;
    public VDTT_is[] J;
    public VDTT_ir[] K;
    public ClassCharTemplate[] ClassCharTemplates;
    public CharTemplate[] CharactersTemplate;
    public Conflict[] ConflictCharacterTemplate;
    public VDTT_fu[] O;
    public VDTT_hb[] P;
    public VDTT_ij[] Q;
    public VDTT_ie[] R;
    public VDTT_ey[] S;
    public VDTT_ic[] T;
    public VDTT_fv[] U;
    public short[][] V;
    public int[][] W;
    public byte[][] X;
    public Vector Y = new Vector();
    public Vector Z = new Vector();
    public Vector aa = new Vector();
    public Hashtable ab = new Hashtable();
    public Hashtable ac = new Hashtable();
    public Hashtable ad = new Hashtable();
    public Hashtable ae = new Hashtable();
    public Hashtable af = new Hashtable();
    public VDTT_ia[] ag;
    public VDTT_hz ah;
    private static DataCenter aT = null;
    public VDTT_p ai;
    public static boolean aj = false;
    public static boolean ak;
    public static boolean al;
    private boolean aU = true;
    public int[] am;
    public int[] an;
    public int[] ao;
    public int[] ap;
    public int[] aq;
    public int[] ar;
    public long[] as;
    public long[] at;
    public long[] au;
    public long[] av;
    public String[][] aw = new String[2][];
    public long[] ax;
    public boolean ay;
    public boolean az = false;
    public VDTT_fp aA;
    public final int aB = 17;
    public VDTT_hz aC;
    public static int aD;
    public int aE;
    public int aF;
    public String linkResources = "http://180.93.120.92/Data/";
    public String linkCheckData;
    public String aI;
    public String linkCheckAPK;
    public String linkCheckIOS;
    public String linkCheckPC;
    public String Img_Zoom;
    public String aN;
    public boolean aO;
    public boolean aP;
    public boolean aQ;
    public static Vector aR = new Vector();
    public static Vector aS = new Vector();

    public DataCenter() {
        this.linkCheckData = this.linkResources + "new/";
        this.aI = this.linkResources;
        this.linkCheckAPK = this.linkCheckData + "checkandroid.txt";
        this.linkCheckIOS = this.linkCheckData + "checkios.txt";
        this.linkCheckPC = this.linkCheckData + "checkpc.txt";
        this.Img_Zoom = "img/zoom";
        this.aN = "img/zoom";
    }

    public static boolean a() {
        return d().aO;
    }

    public static boolean b() {
        if (VDTT_cw.v().br == 14 && VDTT_cw.v().bs <= 1) {
            return false;
        } else {
            int var10000 = VDTT_cw.v().br;
            Objects.requireNonNull(d());
            return var10000 > 17 || VDTT_ek.m().F() || VDTT_ek.m().bD;
        }
    }

    public final void c() {
        if (!l()) {
            this.aQ = false;
        }
    }

    public static DataCenter d() {
        if (aT == null) {
            aT = new DataCenter();
        }

        return aT;
    }

    public final void a(int var1, int var2, int var3) {
        this.m = 0;
        if (Gdx.app.getType() == ApplicationType.Android) {
            this.t = 0;
        } else if (Gdx.app.getType() == ApplicationType.iOS) {
            this.t = 1;
        } else {
            this.t = 2;
        }

        this.n = var2;
        this.o = var3;
        if (VDTT_eq.a().b(40) != 2) {
            VDTT_eq.a().a(40, 2);
            VDTT_da.a(true);
        }

        VDTT_cm var4 = new VDTT_cm();
        this.ai = var4;
        this.c();
        if (this.aA == null) {
            this.aA = new VDTT_fp();
        }

    }

    public final void a(boolean var1) {
        d().aO = false;
        (new Thread(new VDTT_dk(this, var1))).start();
    }

    private void a(VDTT_de vDTT_de) throws IOException {
        VDTT_de vDTT_de2 = vDTT_de;
        int n = vDTT_de2.a.readShort();
        this.Y.clear();
        for (int i = 0; i < n; ++i) {
            short s;
            int n2;
            vDTT_de2 = vDTT_de;
            short s2 = vDTT_de2.a.readShort();
            vDTT_de2 = vDTT_de;
            short s3 = vDTT_de2.a.readShort();
            vDTT_de2 = vDTT_de;
            short s4 = vDTT_de2.a.readShort();
            vDTT_de2 = vDTT_de;
            byte by = vDTT_de2.a.readByte();
            vDTT_de2 = vDTT_de;
            byte by2 = vDTT_de2.a.readByte();
            vDTT_de2 = vDTT_de;
            short[][] sArrayArray = new short[vDTT_de2.a.readByte()][];
            for (n2 = 0; n2 < sArrayArray.length; ++n2) {
                vDTT_de2 = vDTT_de;
                sArrayArray[n2] = new short[vDTT_de2.a.readShort()];
                s = 0;
                for (int j = 0; j < sArrayArray[n2].length; ++j) {
                    short s5 = vDTT_de.a();
                    sArrayArray[n2][j] = s5;
                    s = s5;
                }
                if (n2 == 5 && sArrayArray[n2].length > 1) {
                    sArrayArray[n2] = new short[]{(short) (sArrayArray[n2][0] * 256 + sArrayArray[n2][1])};
                }
                if (n2 != 1 || sArrayArray[n2].length > 1) {
                    continue;
                }
                sArrayArray[n2] = new short[]{s, s, s, s, s, s, s, s};
            }
            vDTT_de2 = vDTT_de;
            VDTT_fh[] vDTT_fhArray = new VDTT_fh[vDTT_de2.a.readByte()];
            for (n2 = 0; n2 < vDTT_fhArray.length; ++n2) {
                vDTT_fhArray[n2] = new VDTT_fh();
                vDTT_de2 = vDTT_de;
                vDTT_fhArray[n2].a = new VDTT_fi[vDTT_de2.a.readByte()];
                for (s = 0; s < vDTT_fhArray[n2].a.length; ++s) {
                    vDTT_fhArray[n2].a[s] = new VDTT_fi();
                    vDTT_de2 = vDTT_de;
                    vDTT_fhArray[n2].a[s].a = vDTT_de2.a.readShort();
                    DataCenter.a(vDTT_fhArray[n2].a[s].a);
                    if (!this.Y.contains(vDTT_fhArray[n2].a[s].a)) {
                        this.Y.add(vDTT_fhArray[n2].a[s].a);
                    }
                    vDTT_de2 = vDTT_de;
                    vDTT_fhArray[n2].a[s].e = vDTT_de2.a.readBoolean();
                    vDTT_de2 = vDTT_de;
                    vDTT_fhArray[n2].a[s].b = vDTT_de2.a.readShort();
                    vDTT_de2 = vDTT_de;
                    vDTT_fhArray[n2].a[s].c = vDTT_de2.a.readShort();
                    vDTT_de2 = vDTT_de;
                    vDTT_fhArray[n2].a[s].d = vDTT_de2.a.readShort();
                }
            }
            for (n2 = 0; n2 < this.F.length; ++n2) {
                if (this.F[n2].f != i) {
                    continue;
                }
                this.F[n2].d = s2;
                this.F[n2].e = s3;
                this.F[n2].g = s4;
                this.F[n2].h = by;
                this.F[n2].b = vDTT_fhArray;
                this.F[n2].a = sArrayArray;
                this.F[n2].e = (short) (this.F[n2].e + by2);
            }
            block8:
            for (n2 = 0; n2 < this.G.length; ++n2) {
                if (this.G[n2].f != i) {
                    continue;
                }
                this.G[n2].d = s2;
                this.G[n2].e = (short) (s3 - 3);
                this.G[n2].j = s4;
                this.G[n2].g = by;
                this.G[n2].e = (short) (this.G[n2].e + by2);
                this.G[n2].b = vDTT_fhArray;
                this.G[n2].a = sArrayArray;
                VDTT_gl vDTT_gl = this.G[n2];
                try {
                    for (int j = 0; j < vDTT_gl.a[3].length; ++j) {
                        for (int k = 0; k < vDTT_gl.b[vDTT_gl.a[3][j]].a.length; ++k) {
                            if (vDTT_gl.b[vDTT_gl.a[3][j]].a[k].a != 0) {
                                continue;
                            }
                            vDTT_gl.s = vDTT_gl.b[vDTT_gl.a[3][j]].a[k];
                            continue block8;
                        }
                    }
                    continue;
                } catch (Exception exception) {
                }
            }
        }
    }

    private void b(VDTT_de var1) throws IOException {
        short var2 = var1.a.readShort();
        this.aa.clear();

        for (int var3 = 0; var3 < var2; ++var3) {
            this.aa.add(var1.c());
        }

        this.aa.clear();
    }

    private void c(VDTT_de var1) throws IOException {
        VDTT_gf[] var2 = new VDTT_gf[var1.a()];

        for (int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = new VDTT_gf();
            var2[var3].a = var1.a.readByte();
            var2[var3].b = new VDTT_gd[var1.a()];

            for (int var4 = 0; var4 < var2[var3].b.length; ++var4) {
                var2[var3].b[var4] = new VDTT_gd();
                var2[var3].b[var4].a = var1.a.readShort();
                var2[var3].b[var4].b = var1.a.readShort();
                var2[var3].b[var4].c = var1.a.readShort();
                var2[var3].b[var4].d = var1.a.readByte();
            }
        }

        this.x = var2;
    }

    private void d(VDTT_de var1) throws IOException {
        byte[][] var2 = new byte[var1.a.readByte()][];

        for (int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = new byte[var1.a.readByte()];

            for (int var4 = 0; var4 < var2[var3].length; ++var4) {
                var2[var3][var4] = var1.a.readByte();
            }
        }

        if (this.X == null || this.X.length == 0) {
            this.X = var2;
        }

    }

    private void e(VDTT_de var1) throws IOException {
        VDTT_hc.a = var1.a.readShort();
        VDTT_hc.b = var1.a.readShort();
        short var2 = var1.a();
        aR.clear();
        VDTT_hc[] var3 = new VDTT_hc[var1.a.readShort()];

        int var4;
        int var5;
        int var6;
        for (var4 = 0; var4 < var3.length; ++var4) {
            var3[var4] = new VDTT_hc();
            var3[var4].c = var4;
            var3[var4].d = var3[var4].e = var1.a.readByte();
            var5 = var3[var4].d;
            if (var3[var4].d == 9) {
                var3[var4].d = 1;
            } else if (var3[var4].d == 12) {
                var3[var4].d = 1;
                var3[var4].g = true;
            }

            var3[var4].h = new VDTT_hf[var2];

            for (var6 = 0; var6 < var2; ++var6) {
                var3[var4].h[var6] = new VDTT_hf(var1.a.readShort());
                if (var3[var4].h[var6].a != 0) {
                    var3[var4].h[var6].c = var1.a.readByte();
                    var3[var4].h[var6].b = var1.a.readShort();
                    var3[var4].h[var6].d = var1.a.readShort();
                    var3[var4].h[var6].e = var1.a.readShort();
                    var3[var4].h[var6].f = var1.a.readBoolean();
                    a(var3[var4].h[var6].a);
                    if (var5 == 12 && !aR.contains(var3[var4].h[var6].a)) {
                        aR.add(var3[var4].h[var6].a);
                    }
                }
            }
        }

        this.y = var3;
        VDTT_he[] var13 = new VDTT_he[var1.a.readShort()];

        for (var5 = 0; var5 < var13.length; ++var5) {
            var13[var5] = new VDTT_he();
            var13[var5].a = var5;
            byte var10 = var1.a.readByte();
            var13[var5].b = new short[var10];

            for (var6 = 0; var6 < var10; ++var6) {
                var13[var5].b[var6] = var1.a.readShort();
            }

            var10 = var1.a.readByte();
            var13[var5].c = new short[var10];

            for (var6 = 0; var6 < var10; ++var6) {
                var13[var5].c[var6] = var1.a.readShort();
            }
        }

        this.z = var13;
        VDTT_hd[] var14 = new VDTT_hd[var1.a.readShort()];

        for (int var11 = 0; var11 < var14.length; ++var11) {
            var14[var11] = new VDTT_hd();
            String[] var12;
            String[] var15 = (var12 = var1.c().split(";"))[0].split(",");
            var14[var11].a[0] = new short[var15.length];

            for (var4 = 0; var4 < var15.length; ++var4) {
                try {
                    var14[var11].a[0][var4] = Short.parseShort(var15[var4]);
                } catch (Exception var8) {
                    var14[var11].a[0][var4] = 0;
                }
            }

            if (var12.length > 1) {
                var15 = var12[1].split(",");
                var14[var11].a[1] = new short[var15.length];

                for (var4 = 0; var4 < var15.length; ++var4) {
                    try {
                        var14[var11].a[1][var4] = Short.parseShort(var15[var4]);
                    } catch (Exception var9) {
                        var14[var11].a[1][var4] = 0;
                    }
                }
            }

            var1.c();
            var1.c();
        }

        this.A = var14;
    }

    private void f(VDTT_de var1) throws IOException {
        VDTT_es[] var2 = new VDTT_es[var1.a.readShort()];

        for (int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = new VDTT_es();
            var2[var3].a = var1.a.readByte();
            var2[var3].b = var1.a.readByte();
            var2[var3].c = var1.a.readByte();
            var2[var3].d = var1.a.readByte();
            var2[var3].e = var1.a.readShort();
            var2[var3].j = var1.a.readBoolean();
            var2[var3].k = var1.a.readBoolean();
            var2[var3].f = var1.a.readShort();
            var2[var3].g = var1.a.readShort();
            var2[var3].h = var1.a.readShort();
            var2[var3].i = var1.a.readShort();
            if (var2[var3].i < 25) {
                var2[var3].i = 25;
            }

            var2[var3].l = new short[var1.a.readByte()][];
            String var4 = "";

            int var5;
            int var6;
            for (var5 = 0; var5 < var2[var3].l.length; ++var5) {
                var2[var3].l[var5] = new short[var1.a.readByte()];

                for (var6 = 0; var6 < var2[var3].l[var5].length; ++var6) {
                    var2[var3].l[var5][var6] = var1.a.readShort();
                    var4 = var4 + var2[var3].l[var5][var6] + ", ";
                }

                var4 = var4 + "; ";
            }

            var2[var3].m = new short[var1.a.readByte()][];

            for (var5 = 0; var5 < var2[var3].m.length; ++var5) {
                var2[var3].m[var5] = new short[var1.a.readByte()];

                for (var6 = 0; var6 < var2[var3].m[var5].length; ++var6) {
                    var2[var3].m[var5][var6] = var1.a.readShort();
                }
            }
        }

        if (this.B == null || this.B.length == 0) {
            this.B = var2;
        }

    }

    private void g(VDTT_de var1) throws IOException {
        Vector var2 = new Vector();
        VDTT_ew[] var3 = new VDTT_ew[var1.a.readShort()];

        for (int var4 = 0; var4 < var3.length; ++var4) {
            var3[var4] = new VDTT_ew();
            var3[var4].a = var1.a.readByte();
            var3[var4].b = new VDTT_ex[var1.a()];

            for (int var5 = 0; var5 < var3[var4].b.length; ++var5) {
                var3[var4].b[var5] = new VDTT_ex();
                var3[var4].b[var5].a = var1.a.readShort();
                if (!var2.contains(var3[var4].b[var5].a)) {
                    var2.add(var3[var4].b[var5].a);
                }

                a(var3[var4].b[var5].a);
                var3[var4].b[var5].b = var1.a.readShort();
                var3[var4].b[var5].c = var1.a.readShort();
                var3[var4].b[var5].d = var1.a.readShort();
                var3[var4].b[var5].e = var1.a.readBoolean();
            }
        }

        if (this.C == null || this.C.length == 0) {
            this.C = var3;
            this.Z.clear();
            this.Z.addAll(var2);
        }

    }

    private void h(VDTT_de var1) throws IOException {
        Hashtable var2 = new Hashtable();
        short var3 = var1.a.readShort();

        for (int var4 = 0; var4 < var3; ++var4) {
            VDTT_if var5;
            (var5 = new VDTT_if()).a = var1.a.readShort();
            var5.b = var1.a.readShort();
            var5.c = var1.a.readShort();
            var5.d = var1.a.readByte();
            var5.e = new VDTT_ig[var1.a()][];

            for (int var6 = 0; var6 < var5.e.length; ++var6) {
                var5.e[var6] = new VDTT_ig[var1.a()];

                for (int var7 = 0; var7 < var5.e[var6].length; ++var7) {
                    var5.e[var6][var7] = new VDTT_ig();
                    var5.e[var6][var7].a = var1.a();
                    var5.e[var6][var7].b = var1.a.readShort();
                    var5.e[var6][var7].c = var1.a.readShort();
                    var5.e[var6][var7].d = var1.a.readShort();
                    var5.e[var6][var7].e = var1.a.readShort();
                    var5.e[var6][var7].f = var1.a.readShort();
                    var5.e[var6][var7].g = var1.a.readShort();
                }
            }

            var2.put(var5.a, var5);
        }

        if (this.D == null || this.D.size() == 0) {
            this.D = var2;
        }

    }

    private void i(VDTT_de var1) throws IOException {
        VDTT_hk[] var2 = new VDTT_hk[var1.a.readShort()];

        for (int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = new VDTT_hk();
            var2[var3].a = var1.a.readByte();
            var2[var3].b = new VDTT_hj[var1.a()];

            for (int var4 = 0; var4 < var2[var3].b.length; ++var4) {
                var2[var3].b[var4] = new VDTT_hj();
                var2[var3].b[var4].a = var1.a.readShort();
                var2[var3].b[var4].b = var1.a.readByte();
                var2[var3].b[var4].c = var1.a.readShort();
                var2[var3].b[var4].d = var1.a.readShort();
            }
        }

        if (this.E == null || this.E.length == 0) {
            this.E = var2;
        }

    }

    private void j(VDTT_de var1) throws IOException {
        short[][] var2 = new short[var1.a.readShort()][14];

        for (int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3][0] = var1.a.readShort();
            var2[var3][1] = var1.a.readShort();
            var2[var3][2] = var1.a.readShort();
            var2[var3][3] = var1.a.readShort();
            var2[var3][4] = var1.a.readShort();
            var2[var3][10] = var1.a.readShort();
            var2[var3][11] = var1.a.readShort();
            var2[var3][5] = var1.a.readShort();
            var2[var3][6] = var1.a.readShort();
            var2[var3][7] = var1.a.readShort();
            var2[var3][8] = var1.a.readShort();
            var2[var3][9] = var1.a.readShort();
            var2[var3][12] = var1.a.readShort();
            var2[var3][13] = var1.a.readShort();
        }

        if (this.V == null || this.V.length == 0) {
            this.V = var2;
        }

    }

    private static Hashtable k(VDTT_de var0) throws IOException {
        Hashtable var1 = new Hashtable();
        short var2 = var0.a.readShort();

        for (short var4 = 0; var4 < var2; ++var4) {
            short var3 = var0.a.readShort();

            for (int var5 = 0; var5 < var3; ++var5) {
                var1.put((short) var0.a.readShort(), new VDTT_ed(var4, var0.a(), var0.a(), var0.a.readShort(), var0.a.readShort()));
            }
        }

        return var1;
    }

    private static Hashtable l(VDTT_de var0) throws IOException {
        Hashtable var1 = new Hashtable();
        short var2 = var0.a.readShort();

        for (short var3 = 0; var3 < var2; ++var3) {
            var1.put((short) var0.a.readShort(), new VDTT_ed((short) -1, (short) 0, (short) 0, var0.a.readShort(), var0.a.readShort()));
        }

        return var1;
    }

    private static void m(VDTT_de var0) throws IOException {
        VDTT_ia[] var1 = new VDTT_ia[var0.a.readByte()];

        for (int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = new VDTT_ia();
            var1[var2].a = var0.c();
            var1[var2].b = new VDTT_hz[var0.a.readByte()];

            for (int var3 = 0; var3 < var1[var2].b.length; ++var3) {
                var1[var2].b[var3] = new VDTT_hz();
                var1[var2].b[var3].a = var0.a.readShort();
                var1[var2].b[var3].b = var0.c();
                var1[var2].b[var3].c = var0.c();
                var1[var2].b[var3].d = var0.a.readShort();
                var1[var2].b[var3].e = var0.a.readShort();
            }
        }

    }

    private static void a(short var0) {
        if (!aS.contains(var0)) {
            aS.addElement(var0);
        }

    }

    public final void a(Message var1) {
        try {
            VDTT_hb[] var2 = new VDTT_hb[var1.f()];

            int var3;
            for (var3 = 0; var3 < var2.length; ++var3) {
                var2[var3] = new VDTT_hb(var3);
                var2[var3].b = Caption.a(var1.b.c());
                var2[var3].c = var1.readByte();
                var2[var3].d = var1.readByte();
                var2[var3].e = var1.b.c();
            }

            this.P = var2;
            VDTT_ey[] var11 = new VDTT_ey[var1.f()];

            for (int var9 = 0; var9 < var11.length; ++var9) {
                var11[var9] = new VDTT_ey(var9);
                var11[var9].b = var1.b.c();
                var11[var9].c = var1.b.c();
                var11[var9].d = var1.b.a();
                var11[var9].e = var1.f();
                var11[var9].f = var1.f();
            }

            this.S = var11;
            VDTT_fu[] var10 = new VDTT_fu[var1.f()];

            for (var3 = 0; var3 < var10.length; ++var3) {
                var10[var3] = new VDTT_fu(var3);
                var10[var3].b = Caption.a(var1.b.c());
                var10[var3].c = var1.b.c();
                var10[var3].d = var1.c();
                var10[var3].e = var1.readByte();
                var10[var3].f = var1.readByte();
                var10[var3].g = var1.readByte();
                var10[var3].h = var1.f();
                var10[var3].i = var1.b.a();
                var10[var3].j = var1.g();
                var10[var3].k = var1.f();
                var10[var3].l = var1.f();
            }

            this.O = var10;
            this.d(var1.b);
            this.f(var1.b);
            this.g(var1.b);
            this.h(var1.b);
            this.j(var1.b);
        } catch (Exception var7) {
            VDTT_jb.a(var7);
        } finally {
            if (var1 != null) {
                var1.b();
            }

        }

    }

    public final void b(boolean var1) {
        if (l()) {
            var1 = true;
        }

        VDTT_de var2 = null;

        try {
            if ((var2 = VDTT_da.a("arr_data_game")) == null) {
                return;
            }

            this.CharactersTemplate = new CharTemplate[var2.a.readByte()];

            int var3;
            for (var3 = 0; var3 < this.CharactersTemplate.length; ++var3) {
                this.CharactersTemplate[var3] = new CharTemplate(var3);
                this.CharactersTemplate[var3].type = var2.a.readShort();
                this.CharactersTemplate[var3].name = var2.c();
                if (l()) {
                    this.CharactersTemplate[var3].type = 842;
                }
            }

            this.ConflictCharacterTemplate = new Conflict[var2.a.readByte()];

            for (var3 = 0; var3 < this.ConflictCharacterTemplate.length; ++var3) {
                this.ConflictCharacterTemplate[var3] = new Conflict(var3);
                this.ConflictCharacterTemplate[var3].name = var2.c();
            }

            this.ClassCharTemplates = new ClassCharTemplate[var2.a.readByte()];

            for (var3 = 0; var3 < this.ClassCharTemplates.length; ++var3) {
                this.ClassCharTemplates[var3] = new ClassCharTemplate(var3);
                this.ClassCharTemplates[var3].c = var2.c();
                this.ClassCharTemplates[var3].b = var2.a.readByte();
                this.ClassCharTemplates[var3].d = var2.a.readShort();
            }

            this.I = new VDTT_du[var2.a()];

            for (var3 = 0; var3 < this.I.length; ++var3) {
                this.I[var3] = new VDTT_du();
                this.I[var3].a = var2.a.readByte();
                this.I[var3].b = var2.c();
                this.I[var3].c = var2.a.readInt();
                this.I[var3].d = var2.a.readInt();
                this.I[var3].e = var2.a.readInt();
                this.I[var3].f = var2.a.readInt();
                this.I[var3].g = var2.a.readInt();
                this.I[var3].h = var2.c();
            }

            this.K = new VDTT_ir[var2.a.readShort()];

            int var5;
            for (var3 = 0; var3 < this.K.length; ++var3) {
                this.K[var3] = new VDTT_ir();
                this.K[var3].a = var3;
                this.K[var3].b = Caption.a(var2.c());
                this.K[var3].c = var2.a.readShort();
                this.K[var3].d = var2.a.readShort();
                this.K[var3].e = var2.a.readShort();
                this.K[var3].f = var2.a.readShort();
                this.K[var3].g = var2.a.readShort();
                this.K[var3].h = var2.c();
                this.K[var3].i = var2.c();
                this.K[var3].j = var2.c();
                this.K[var3].k = var2.a.readInt();
                this.K[var3].l = var2.a.readInt();
                this.K[var3].m = var2.a.readInt();
                this.K[var3].n = var2.a.readInt();
                this.K[var3].o = var2.c();
                byte var15 = var2.a.readByte();

                for (var5 = 0; var5 < var15; ++var5) {
                    VDTT_il var6;
                    (var6 = new VDTT_il()).a = var2.a.readByte();
                    var6.b = Caption.a(var2.c());
                    short var8 = var2.a.readShort();
                    var6.c = var8;
                    var6.d = var2.a.readShort();
                    var6.e = var2.a.readShort();
                    var6.f = var2.a.readShort();
                    var6.g = var2.a.readShort();
                    var6.h = var2.a.readShort();
                    var6.i = var2.a.readShort();
                    var6.j = var2.c();
                    var6.k = var2.c();
                    this.K[var3].p.addElement(var6);
                }
            }

            this.J = new VDTT_is[var2.a()];

            for (var3 = 0; var3 < this.J.length; ++var3) {
                this.J[var3] = new VDTT_is();
                this.J[var3].a = var2.a.readByte();
                this.J[var3].b = var2.c();
                this.J[var3].c = var2.a.readShort();
            }

            VDTT_ge[] var23 = new VDTT_ge[var2.a.readShort()];

            for (int var16 = 0; var16 < var23.length; ++var16) {
                var23[var16] = new VDTT_ge(var16);
                var23[var16].b = Caption.a(var2.c());
                var23[var16].c = var2.a();
                var23[var16].d = var2.a.readByte();
                var23[var16].e = var2.a.readByte();
                byte[] var18 = var2.b();
                if (var1) {
                    VDTT_da.a("arr_map_" + var16, var18);
                }
            }

            this.H = var23;
            VDTT_hb[] var17 = new VDTT_hb[var2.a.readShort()];

            for (var5 = 0; var5 < var17.length; ++var5) {
                var17[var5] = new VDTT_hb(var5);
                var17[var5].b = Caption.a(var2.c());
                var17[var5].c = var2.a.readByte();
                var17[var5].d = var2.a.readByte();
                var17[var5].e = var2.c();
            }

            if (this.P == null || this.P.length == 0) {
                this.P = var17;
            }

            VDTT_ey[] var22 = new VDTT_ey[var2.a.readShort()];

            for (int var21 = 0; var21 < var22.length; ++var21) {
                var22[var21] = new VDTT_ey(var21);
                var22[var21].b = var2.c();
                var22[var21].c = var2.c();
                var22[var21].d = var2.a();
                var22[var21].e = var2.a.readShort();
                var22[var21].f = var2.a.readShort();
            }

            if (this.S == null || this.S.length == 0) {
                this.S = var22;
            }

            VDTT_fu[] var24 = new VDTT_fu[var2.a.readShort()];

            for (var3 = 0; var3 < var24.length; ++var3) {
                var24[var3] = new VDTT_fu(var3);
                var24[var3].b = Caption.a(var2.c());
                var24[var3].c = var2.c();
                var24[var3].d = var2.a.readBoolean();
                var24[var3].e = var2.a.readByte();
                var24[var3].f = var2.a.readByte();
                var24[var3].g = var2.a.readByte();
                var24[var3].h = var2.a.readShort();
                var24[var3].i = var2.a();
                var24[var3].j = var2.a.readUnsignedShort();
                var24[var3].k = var2.a.readShort();
                var24[var3].l = var2.a.readShort();
            }

            if (this.O == null || this.O.length == 0) {
                this.O = var24;
            }

            this.G = new VDTT_gl[var2.a.readShort()];

            for (var3 = 0; var3 < this.G.length; ++var3) {
                this.G[var3] = new VDTT_gl(var3);
                this.G[var3].h = var2.a.readShort();
                this.G[var3].k = Caption.a(var2.c());
                this.G[var3].l = Caption.a(var2.c());
                this.G[var3].o = var2.a.readShort();
                this.G[var3].p = var2.a.readByte();
                this.G[var3].q = var2.a.readByte();
                this.G[var3].r = var2.a.readByte();
                this.G[var3].f = var2.a.readShort();
                this.G[var3].i = var2.a.readShort();
                this.G[var3].a(var2.c(), var2.c());
                if (l()) {
                    switch (var3) {
                        case 64:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 173:
                        case 174:
                        case 175:
                        case 176:
                        case 177:
                            this.G[var3].f = 650;
                            break;
                        case 121:
                        case 122:
                            this.G[var3].f = 525;
                            break;
                        case 156:
                            this.G[var3].f = 483;
                            break;
                        case 157:
                            this.G[var3].f = 426;
                            break;
                        case 158:
                        case 159:
                        case 160:
                        case 161:
                        case 162:
                            this.G[var3].f = 679;
                    }
                }
            }

            this.F = new VDTT_gy[var2.a.readShort()];

            for (var3 = 0; var3 < this.F.length; ++var3) {
                this.F[var3] = new VDTT_gy(var3);
                this.F[var3].j = Caption.a(var2.c());
                this.F[var3].k = Caption.a(var2.c());
                this.F[var3].f = var2.a.readShort();
                this.F[var3].l = var2.a.readInt();
                this.F[var3].m = var2.a.readInt();
                this.F[var3].i = var2.a.readShort();
                if (l()) {
                    switch (var3) {
                        case 27:
                        case 61:
                            this.F[var3].f = 412;
                            break;
                        case 62:
                            this.F[var3].f = 700;
                            break;
                        case 92:
                            this.F[var3].f = 699;
                            break;
                        case 98:
                            this.F[var3].f = 411;
                            break;
                        case 102:
                            this.F[var3].f = 649;
                    }
                }
            }

            this.Q = new VDTT_ij[var2.a.readShort()];

            for (var3 = 0; var3 < this.Q.length; ++var3) {
                VDTT_ij skill = new VDTT_ij(var3);
                this.Q[var3] = skill;
                this.Q[var3].b = Caption.a(var2.c().trim());
                this.Q[var3].c = Caption.a(var2.c());
                this.Q[var3].d = var2.a.readShort();
                this.Q[var3].e = var2.a.readByte();
                this.Q[var3].f = var2.a.readByte();
                this.Q[var3].g = var2.a.readByte();
                this.Q[var3].h = var2.a.readShort();
                this.Q[var3].i = var2.a.readShort();
                //  System.out.println(skill);
            }

            this.T = new VDTT_ic[var2.a.readShort()];

            short var25;
            for (var25 = 0; var25 < this.T.length; ++var25) {
                VDTT_ic var19;
                (var19 = new VDTT_ic()).c = var2.a.readShort();
                var19.d = var2.a.readShort();
                var19.e = var2.a.readByte();
                var19.f = var2.a();
                var19.g = var2.a.readShort();
                var19.h = var2.a.readInt();
                var19.i = var2.a.readShort();
                var19.j = var2.a.readShort();
                var19.k = var2.a.readByte();
                var19.l = var2.a.readLong();
                var19.m = var2.c();

                this.T[var19.c] = var19;
            }

            this.R = new VDTT_ie[var2.a()];

            for (var25 = 0; var25 < this.R.length; ++var25) {
                VDTT_ie var20;
                (var20 = new VDTT_ie()).a = var25;
                var20.b = var2.c();
                var20.c = var2.c();
                var20.d = var2.a();
                var20.e = var2.c();
                var20.f = var2.a.readShort();
                var20.g = var2.a.readInt();
                var20.h = var2.a.readInt();
                this.R[var25] = var20;
            }

            this.U = new VDTT_fv[var2.a.readByte()];

            for (var3 = 0; var3 < this.U.length; ++var3) {
                this.U[var3] = new VDTT_fv();
                this.U[var3].a = var2.a.readByte();
            }

            this.ab = k(var2);
            this.ad = l(var2);
            this.ac = k(var2);
            this.ae = l(var2);
            this.c(var2);
            this.d(var2);
            this.e(var2);
            this.f(var2);
            this.g(var2);
            this.i(var2);
            this.h(var2);
            this.j(var2);
            this.a(var2);
            this.b(var2);
            m(var2);
            this.am = n(var2);
            this.an = o(var2);
            this.ao = o(var2);
            this.ap = o(var2);
            this.aq = o(var2);
            this.as = p(var2);
            this.at = p(var2);
            this.au = p(var2);
            this.av = p(var2);
            this.ar = o(var2);
            this.aw[0] = q(var2);
            this.aw[1] = q(var2);
            this.ax = p(var2);
            this.W = new int[var2.a.readByte()][];

            for (var3 = 0; var3 < this.W.length; ++var3) {
                this.W[var3] = o(var2);
            }

            try {
                VDTT_ji.Q = new String[2][var2.a.readByte()];

                for (var3 = 0; var3 < VDTT_ji.Q[0].length; ++var3) {
                    VDTT_ji.Q[0][var3] = var2.c();
                    VDTT_ji.Q[1][var3] = var2.c();
                }
            } catch (Exception var12) {
            }

            this.q = var2.a.readByte();
        } catch (Exception var13) {
            VDTT_d var7 = VDTT_d.g();
            if (!(Gdx.app.getType() == ApplicationType.Android ? var7.p : true)) {
                return;
            }

            byte[] var4;
            if ((var4 = VDTT_da.c(d().linkCheckData + "arr_data_game" + VDTT_aa.a())) != null) {
                VDTT_da.a("arr_data_game", var4);
                this.b(var1);
            }

            VDTT_jb.a(var13);
            return;
        } finally {
            if (var2 != null) {
                var2.d();
            }

            this.aO = true;
        }

    }

    private static int[] n(VDTT_de var0) throws IOException {
        int[] var1 = new int[var0.a.readInt()];

        for (int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = var0.a.readShort();
        }

        return var1;
    }

    private static int[] o(VDTT_de var0) throws IOException {
        int[] var1 = new int[var0.a.readInt()];

        for (int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = var0.a.readInt();
        }

        return var1;
    }

    private static long[] p(VDTT_de var0) throws IOException {
        long[] var1 = new long[var0.a.readInt()];

        for (int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = var0.a.readLong();
        }

        return var1;
    }

    private static String[] q(VDTT_de var0) throws IOException {
        String[] var1 = new String[var0.a.readInt()];

        for (int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = var0.c();
        }

        return var1;
    }

    public final void a(VDTT_p var1) {
        this.ai = var1;
    }

    public final VDTT_p e() {
        return this.ai;
    }

    public final void f() {
        VDTT_dn.a().a(this.a, this.b);
    }

    public final void a(VDTT_hz var1) {
        this.aC = var1;
        VDTT_da.a("arr_server", this.aC.c + ":" + this.aC.d);
        this.a = this.aC.c;
        this.b = this.aC.d;
    }

    public final void g() {
        try {
            d().aP = true;
            VDTT_da.j("arr_reset" + VDTT_aa.a());
            this.ay = true;
            Message.c((byte) -126).l();
            if (Gdx.app.getType() != ApplicationType.Desktop || !(this.ai instanceof VDTT_cu)) {
                this.ai.i();
                return;
            }

            DataCenter var10000 = d();
            VDTT_cf var2 = VDTT_cq.v();
            var10000.ai = var2;
        } catch (Exception var3) {
        }

    }

    public static Vector h() {
        Vector var0 = new Vector();

        for (int var1 = 0; var1 < d().V.length; ++var1) {
            var0.add(d().V[var1]);
        }

        return var0;
    }

    public final void i() {
        try {
            if (DataCenter.d().az) {
                return;
            }
            String[] stringArray = VDTT_da.h("arr_server").split(":");
            for (int i = 0; i < DataCenter.d().ag.length; ++i) {
                for (int j = 0; j < DataCenter.d().ag[i].b.length; ++j) {
                    VDTT_hz vDTT_hz = DataCenter.d().ag[i].b[j];
                    if (!vDTT_hz.c.toLowerCase().equals(stringArray[0].toLowerCase()) || vDTT_hz.d != Integer.parseInt(stringArray[1])) {
                        continue;
                    }
                    this.aC = vDTT_hz;
                    this.u();
                    return;
                }
            }
            return;
        } catch (Exception exception) {
            this.u();
            return;
        }
    }

    private void u() {
        VDTT_da.a("arr_server", this.aC.c + ":" + this.aC.d);
    }

    public static int a(String var0) {
        var0 = var0.toLowerCase();
        byte var1 = VDTT_eq.a().b(2);
        int var2;
        if ((var2 = d().p - 1) > 3) {
            var2 = 3;
        }

        int var3 = var2;
        if (var2 == 0) {
            return 0;
        } else if (var2 != 2 || var1 != 0 && var1 != 3) {
            if (var2 == 3 && var1 == 0) {
                return 2;
            } else {
                if (var0.contains("char")) {
                    if (var2 == 1 && (var1 == 0 || var1 == 2)) {
                        var3 = 0;
                    } else if (var2 == 2 && var1 != 2) {
                        var3 = 1;
                    } else if (var2 == 3 && var1 != 2) {
                        var3 = 2;
                    }
                } else if (var0.contains("tree") && var2 == 1 && var1 == 2) {
                    var3 = 0;
                }

                return var3;
            }
        } else {
            return var0.contains("tree") && var1 == 3 ? 0 : 1;
        }
    }

    public final String a(int var1) {
        long var2 = 0L;

        for (int var4 = 0; var4 < var1; ++var4) {
            var2 += this.ax[var4];
        }

        return VDTT_jb.c(var2 / 10L);
    }

    public static String b(int var0) {
        return Caption.Bu[var0 / 10];
    }

    public static int j() {
        int var0 = d().p;
        int var10000;
        switch (d().p) {
            case 1:
                var10000 = 1;
                break;
            case 2:
                var0 = VDTT_eq.a().b(2) == 1 ? 2 : 1;
                return var0;
            case 3:
                var0 = VDTT_eq.a().b(2) == 2 ? 3 : 2;
                return var0;
            case 4:
            case 5:
            case 6:
                var10000 = VDTT_eq.a().b(2) == 2 ? 4 : 3;
                break;
            default:
                return var0;
        }

        var0 = var10000;
        return var0;
    }

    public static boolean k() {
        VDTT_d.g();
        return Gdx.app.getType() == ApplicationType.iOS;
    }

    public static boolean l() {
        if (k()) {
            VDTT_d.g();
            d();
            return !t();
        } else {
            return false;
        }
    }

    public static boolean m() {
        return aj && Gdx.app.getType() == ApplicationType.Android;
    }

    public static boolean n() {
        return l() && k();
    }

    public static boolean o() {
        return false;
    }

    public static boolean p() {
        return false;
    }

    public static boolean q() {
        return VDTT_ek.m().w() < 20 && l();
    }

    public static VDTT_fu b(String var0) {
        var0 = var0.toLowerCase();

        for (int var1 = 0; var1 < d().O.length; ++var1) {
            if (d().O[var1].b.toLowerCase().equals(var0)) {
                return d().O[var1];
            }
        }

        return null;
    }

    public static boolean c(String var0) {
        String[] var1;
        return var0 != null && (var1 = var0.split("@"))[0] != null && VDTT_jb.l(var1[0]).equals("112246a1a984f3f6a0d2239be249d085");
    }

    public final void r() {
        String[] var1 = VDTT_d.q.split("\\r\\n")[1].split("=");
        this.aC.b = var1[0].trim();
        var1 = var1[1].split(":");
        this.aC.a = Short.parseShort(var1[0].trim());
        d().a = this.aC.c = var1[1].trim();
        d().b = this.aC.d = Short.parseShort(var1[2].trim());
    }

    public final boolean s() {
        if (!this.aU) {
            d();
            if (!k()) {
                return false;
            }
        }

        return true;
    }

    public static String c(int var0) {
        return d().CharactersTemplate[var0].name;
    }

    public static boolean t() {
        return VDTT_jb.i(VDTT_da.a + "tff1").exists();
    }

    public void readSkill(Message var0) {
        try {
            VDTT_de var2 = var0.b;
            this.Q = new VDTT_ij[var2.a.readShort()];
            int var3;
            for (var3 = 0; var3 < this.Q.length; ++var3) {
                VDTT_ij skill = new VDTT_ij(var3);
                this.Q[var3] = skill;
                this.Q[var3].b = Caption.a(var2.c().trim());
                this.Q[var3].c = Caption.a(var2.c());//lỗi heree
                this.Q[var3].d = var2.a.readShort();
                this.Q[var3].e = var2.a.readByte();
                this.Q[var3].f = var2.a.readByte();
                this.Q[var3].g = var2.a.readByte();
                this.Q[var3].h = var2.a.readShort();
                this.Q[var3].i = var2.a.readShort();
            }

            this.T = new VDTT_ic[var2.a.readShort()];

            short var25;
            for (var25 = 0; var25 < this.T.length; ++var25) {
                VDTT_ic var19;
                (var19 = new VDTT_ic()).c = var2.a.readShort();
                var19.d = var2.a.readShort();
                var19.e = var2.a.readByte();
                var19.f = var2.a();
                var19.g = var2.a.readShort();
                var19.h = var2.a.readInt();
                var19.i = var2.a.readShort();
                var19.j = var2.a.readShort();
                var19.k = var2.a.readByte();
                var19.l = var2.a.readLong();
                var19.m = var2.c();
                this.T[var19.c] = var19;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
