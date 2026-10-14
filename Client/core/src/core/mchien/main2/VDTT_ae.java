package core.mchien.main2;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import java.util.Vector;

public class VDTT_ae extends XYEntity {

    public short q;
    public short r;
    private int a;
    private String b;
    private boolean c;
    public boolean s;
    public boolean t;
    public boolean u;
    public static Object v = new Object();
    public static Object w = new Object();
    public static Object x = new Object();
    public static Vector y = new Vector();
    public static Vector z = new Vector();
    public static Vector A = new Vector();
    public static boolean B;
    public static boolean C;

    public static void t() {
        if (!C) {
            a();
        }

        if (y.size() > 0) {
            synchronized (v) {
                v.notify();
            }
        }

        if (z.size() > 0) {
            synchronized (w) {
                w.notify();
            }
        }
    }

    private static void a() {
        C = true;
        (new Thread(new VDTT_af())).start();
        (new Thread(new VDTT_ag())).start();
        (new Thread(new VDTT_ah())).start();
    }

    public static void a(VDTT_en var0) {
        try {
            VDTT_v var1;
            if (var0.g && !VDTT_da.e(var0.e)) {
                var1 = null;
            } else {
                var1 = VDTT_da.i(var0.e);
            }

            if (var1 != null && !var1.b()) {
                if (var1.c == DataCenter.d().r && var1.d == DataCenter.d().r) {
                    VDTT_ed var2;
                    if (var0.e.contains("char") && ((var2 = (VDTT_ed) DataCenter.d().ae.get(var0.a)).d * DataCenter.d().r != var1.c || var2.e * DataCenter.d().r != var1.d)) {
                        c(var0);
                        return;
                    }

                    if (var0.e.contains("client") && ((var2 = (VDTT_ed) DataCenter.d().ad.get(var0.a)).d * DataCenter.d().r != var1.c || var2.e * DataCenter.d().r != var1.d)) {
                        c(var0);
                        return;
                    }
                }

                var0.h.put(var0.a, var1);
            } else {
                c(var0);
            }
        } catch (Exception var4) {
        }
    }

    private static void c(VDTT_en var0) {
        A.add(var0);
    }

    public static void b(VDTT_en var0) {
        try {
            StringBuilder var10000 = (new StringBuilder()).append(DataCenter.d().linkResources).append(DataCenter.d().Img_Zoom);
            DataCenter.d();
            String var1 = var10000.append(DataCenter.a(var0.d) + 1).append("/").append(var0.d).toString();
            if (var0.g) {
                var1 = DataCenter.d().linkResources + DataCenter.d().Img_Zoom + DataCenter.d().r + "/" + var0.d;
            }

            byte[] var3;
            if ((var3 = VDTT_da.b(var1)) != null) {
                VDTT_da.a(var0.e, var3);
                if (var0.h.get(var0.a) != null) {
                    VDTT_v var4 = VDTT_da.a(VDTT_jb.a(var3));
                    var0.h.put(var0.a, var4);
                }
            }

        } catch (Exception var2) {
//       var2.printStackTrace();
        }
    }

    public void d(int var1, int var2) {
        this.q = (short) var1;
        this.r = (short) var2;
    }

    public void a(Graphics var1, int var2, int var3) {
        var1.a(-var1.e, -var1.f);
        var1.a(var2, var3);
    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5, String var6, byte var7) {
        this.a(var1, var2, var3, var4, var5, var6, (byte) 2, false);
        var2 = var1.e;
        var3 = var1.f;
        this.a(var1, var2, var3);
    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5, String var6, byte var7, boolean var8) {
        int var9 = var5;
        if (this.s) {
            var5 = DataCenter.d().o;
            if (VDTT_eq.a().b(29) == 0 && var5 > 240) {
                var5 = 240;
            }
        }

        this.b = var6;
        this.a = var7;
        this.c = var8;
        this.a(var1, var2, var3);

        try {
            if (!this.s) {
                this.a(var1, 0, 0, var4, var5, 61, 3, 4, 1, 1);
            } else {
                this.a(var1, 0, 0, var4, var5, -7304835, 3, 4, 1, 1);
            }

            VDTT_aa.a(var1, VDTT_dc.c(643), 0, 0, var4 - 4, 25, 0, 2, 2, (var4 - 4) * DataCenter.d().r, 25 * DataCenter.d().r, 20);
            if (var7 == 2) {
                VDTT_dg.a((VDTT_dg) VDTT_dg.f, var1, var6, var4 / 2, 14, 2, -19945, 0);
            } else if (var7 == 0) {
                VDTT_dg.a((VDTT_dg) VDTT_dg.f, var1, var6, 10, 14, 0, -19945, 0);
            }
        } catch (Exception var10) {
            var1.f(-8044263);
            var1.c(0, 0, var4, var5);
            var1.f(-10275328);
            var1.c(1, 1, var4 - 2, var5 - 2);
            var1.f(-4101081);
            var1.c(2, 2, var4 - 4, var5 - 4);
            var1.f(-2200046);
            var1.c(2, 2, var4 - 4, 25);
            var1.f(-199529);
            var1.c(2, 26, var4 - 4, 1);
            if (!var8) {
                VDTT_dc.a(var1, 24, 0, -1, -1, 0);
            }

            var1.f();
        }

        if (this.t) {
            this.a(var1, 7, 32, var4 - 14, var9 - 38, 61, 55, 56);
            if (VDTT_eq.a().b(29) > 0) {
                this.a(var1, 7, var9, var4 - 14, var5 - var9 - 7, -11, 55, 56);
            }

            if (var5 > 270) {
                var1.c(-2965602);
                this.a(var1, 10, var9 + 3, var4 - 14 - 6, var5 - var9 - 7 - 6, 61, 55, 56);
                var1.f();
                return;
            }
        } else if (this.s) {
            VDTT_ae var10000;
            Graphics var10001;
            byte var10002;
            byte var10003;
            int var10004;
            int var10005;
            if (VDTT_eq.a().b(29) > 0) {
                var10000 = this;
                var10001 = var1;
                var10002 = 7;
                var10003 = 32;
                var10004 = var4 - 14;
                var10005 = DataCenter.d().o - 39;
            } else {
                var10000 = this;
                var10001 = var1;
                var10002 = 7;
                var10003 = 32;
                var10004 = var4 - 14;
                var10005 = var5 > 200 ? 200 : var5;
            }

            var10000.a(var10001, var10002, var10003, var10004, var10005, 61, 55, 56);
        }

    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        if (var6 == -11 && var7 == 22 && var8 == 23 && var9 == 1) {
            var1.c(-2965602);
            this.a(var1, var2, var3, var4, var5, 61, 55, 56, var9, 1, 0);
            var1.f();
        } else if (var6 == 61 && var7 == 22 && var8 == 23 && var9 == 1) {
            var1.c(-2965602);
            this.a(var1, var2, var3, var4, var5, 61, 22, 23, 1, 1, 0);
            var1.f();
        } else {
            this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, 1, 0);
        }
    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        this.b(var1, var2, var3, var4, var5, var6, var7, var8, var8, var9, var10, var11);
    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
        boolean var13 = false;
        if (var6 == 61) {
            var6 = -11;
            var13 = true;
        } else if (var6 == 46) {
            var6 = -8492991;
        }

        var8 = var1.e;
        var9 = var1.f;
        var1.a(var2, var3);
        var2 = VDTT_dc.c(3).c / DataCenter.d().r;
        if (VDTT_dc.a(4)) {
            var3 = var2;
        } else {
            var3 = VDTT_dc.c(4).c / DataCenter.d().r;
        }

        if (var6 == 643) {
            VDTT_dc.a(var1, var6, -360, 0, 1, 0, 0, 0, 0, var4 - 0, var5 - 2, 20);
        } else {
            VDTT_aa.a(var1, var6, var12, 0, 1, var4 - 0, (int) (var5 - 2));
        }

        VDTT_aa.a(var1, 4, 0, 0, 0, var4 - var2 * 2 + var2, (int) var3);
        VDTT_aa.a(var1, 4, 180, 0, var5 - var3, var4 - var2 * 2 + var2, (int) var3);
        VDTT_aa.a(var1, 4, 90, var4 - var3, var2, var3, (int) (var5 - var2 * 2));
        VDTT_dc.a(var1, 3, -360, var4, 0, 24);
        VDTT_dc.a(var1, 3, 180, var4, var5, 40);
        if (var13) {
            VDTT_aa.a(var1, 61, 0, (var4 - var5) / 2 + 5, 5, var5 - 10, (int) (var5 - 10));
        }

        this.a(var1, var8, var9);
    }

    public final void b(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
        boolean var13 = false;
        if (var6 == 61) {
            var6 = -11;
            var13 = true;
        } else if (var6 == 46) {
            var6 = -8492991;
        }

        int var14 = VDTT_dc.c(var7).c / DataCenter.d().r;
        int var15;
        if (VDTT_dc.a(var8)) {
            var15 = var14;
        } else {
            var15 = VDTT_dc.c(var8).c / DataCenter.d().r;
        }

        if (var14 != 0 && var15 != 0) {
            int var16 = var1.e;
            int var17 = var1.f;
            var1.a(var2, var3);
            if (var6 == 643) {
                VDTT_dc.a(var1, var6, -360, var10, var11, 0, 0, 0, 0, var4 - var10 * 2, var5 - var11 * 2, 20);
            } else {
                VDTT_aa.a(var1, var6, var12, var10, var11, var4 - var10 * 2, var5 - var11 * 2);
            }

            VDTT_aa.a(var1, var8, 0, var14, 0, var4 - var14 * 2, (int) var15);
            VDTT_aa.a(var1, var8, 180, var14, var5 - var15, var4 - var14 * 2, (int) var15);
            VDTT_aa.a(var1, var9, -90, 0, var14, var15, (int) (var5 - var14 * 2));
            VDTT_aa.a(var1, var9, 90, var4 - var15, var14, var15, (int) (var5 - var14 * 2));
            VDTT_dc.a(var1, var7, 0, 0, 0, 20);
            VDTT_dc.a(var1, var7, -360, var4, 0, 24);
            VDTT_dc.a(var1, var7, -180, 0, var5, 36);
            VDTT_dc.a(var1, var7, 180, var4, var5, 40);
            if (var13) {
                var2 = var4 - 10;
                if (var4 > var5) {
                    var2 = var5 - 10;
                }

                VDTT_aa.a(var1, 61, 0, var4 / 2 - var2 / 2, var5 / 2 - var2 / 2, var2, (int) var2);
            }

            this.a(var1, var16, var17);
        }
    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        this.a(var1, var2, var3, var4, var5, var6, var7, var8, 3, 1);
    }

    public static void a(Graphics var0, int var1, int var2, String var3, byte var4) {
        var1 = var1 + VDTT_dg.b(VDTT_dg.d, var3) + 5;
        switch (var4) {
            case 0:
                VDTT_dc.a(var0, 35, 0, var1, var2 - 8, 0);
                break;
            case 1:
                VDTT_dc.a(var0, 66, 0, var1, var2 - 8, 0);
                break;
            case 2:
            case 3:
                VDTT_dc.a(var0, 25, 0, var1 + 1, var2 - 5, 0);
                break;
            case 4:
            case 5:
                VDTT_dc.a(var0, 234, 0, var1 - 3, var2 - 6, 0);
                break;
            case 6:
                VDTT_dc.a(var0, 377, 0, var1 + 1, var2 - 6, 0);
                break;
            case 7:
                VDTT_dc.a(var0, 36, 0, var1, var2 - 8, 0);
        }

        switch (var4) {
            case 3:
                VDTT_dc.a(var0, 44, 0, var1 + 10, var2, 0);
                return;
            case 5:
                VDTT_dc.a(var0, 44, 0, var1 + 8, var2 - 2, 0);
            default:
        }
    }

    public static void a(Graphics var0, int var1, int var2, Item var3, boolean var4, int var5) {
        a(var0, var1, var2, var3, var4, true, var5, (String) null);
    }

    public static void a2(Graphics var0, int var1, int var2, Item var3, boolean var4, int var5) {
        a2(var0, var1, var2, var3, var4, true, var5, (String) null);
       
    }

    public static void a(Graphics var0, int var1, int var2, Item var3, boolean var4, String var5) {
        a(var0, var1, var2, var3, var4, true, -1, var5);
    }

    public static void a(Graphics var0, int var1, int var2, Item var3, boolean var4) {
        a(var0, var1, var2, var3, var4, true, -1, (String) null);
    }

    public static void b(Graphics var0, int var1, int var2, Item var3, boolean var4) {
        a(var0, var1, var2, var3, var4, false, -1, (String) null);
    }

    public static void b(Graphics var0, int var1, int var2, Item var3, boolean var4, String var5) {
        a(var0, var1, var2, var3, var4, false, -1, var5);
    }

    private static void a(Graphics var0, int var1, int var2, Item var3, boolean var4, boolean var5, int var6, String var7) {
        VDTT_dc.a(var0, 53, 0, var1, var2, 0);

        if (var6 >= 0 && var3 == null) {
            VDTT_dc.a(var0, var6, 0, var1 + 14, var2 + 14, 3);
        }

        if (var3 == null && var7 != null) {
            String[] var8;
            if ((var8 = VDTT_jb.a(var7, " ")).length > 2) {
                VDTT_dg.a((VDTT_dg) VDTT_dg.b, var0, var8[0], var1 + 14, var2 + 7, 2, -1, -10275328);
                VDTT_dg.a((VDTT_dg) VDTT_dg.b, var0, var8[1], var1 + 14, var2 + 14, 2, -1, -10275328);
                VDTT_dg.a((VDTT_dg) VDTT_dg.b, var0, var8[2], var1 + 14, var2 + 21, 2, -1, -10275328);
            } else if (var8.length > 1) {
                VDTT_dg.a((VDTT_dg) VDTT_dg.b, var0, var8[0], var1 + 14, var2 + 10, 2, -1, -10275328);
                VDTT_dg.a((VDTT_dg) VDTT_dg.b, var0, var8[1], var1 + 14, var2 + 18, 2, -1, -10275328);
            } else {
                VDTT_dg.a((VDTT_dg) VDTT_dg.b, var0, var8[0], var1 + 14, var2 + 14, 2, -1, -10275328);
            }
        }

        int var9 = var0.e;
        var6 = var0.f;
        if (var3 != null) {
            var0.a(-var0.e + var9 + var1 + 14, -var0.f + var6 + var2 + 15);
            var3.a(var0);
        }

        var0.a(-var0.e + var9, -var0.f + var6);
        if (var3 != null) {
            if (var3.M() > 1 || var3.c == 826 && var3.t) {
                VDTT_dg.a((BitmapFont) Graphics.b(72), var0, Item.b(var3.M()), var1 + 26, var2 + 23, 1, -1, -10275328);
            }

            if (var3.t) {
                VDTT_aa.a(var0, 44, 0, var1 + 2, var2 + 2, 6, (int) 7);
            }

            if (var3.getItemTemplate().f == 11) {
                VDTT_dc.a(var0, 685, 0, var1 + 9, var2 + 2, 0);
            }
        }

        if (var4) {
            // var0.c(-500);
            VDTT_dc.a(var0, 40, 0, var1 - 1, var2 - 1, 0);
            //  var0.f();
        }

    }
 private static void a2(Graphics var0, int var1, int var2, Item var3, boolean var4, boolean var5, int var6, String var7) {
        VDTT_dc.a(var0, 53, 0, var1, var2, 0);

        if (var6 >= 0 && var3 == null) {
            VDTT_dc.a(var0, var6, 0, var1 + 14, var2 + 14, 3);
        }

        if (var3 == null && var7 != null) {
            String[] var8;
            if ((var8 = VDTT_jb.a(var7, " ")).length > 2) {
                VDTT_dg.a((VDTT_dg) VDTT_dg.b, var0, var8[0], var1 + 14, var2 + 7, 2, -1, -10275328);
                VDTT_dg.a((VDTT_dg) VDTT_dg.b, var0, var8[1], var1 + 14, var2 + 14, 2, -1, -10275328);
                VDTT_dg.a((VDTT_dg) VDTT_dg.b, var0, var8[2], var1 + 14, var2 + 21, 2, -1, -10275328);
            } else if (var8.length > 1) {
                VDTT_dg.a((VDTT_dg) VDTT_dg.b, var0, var8[0], var1 + 14, var2 + 10, 2, -1, -10275328);
                VDTT_dg.a((VDTT_dg) VDTT_dg.b, var0, var8[1], var1 + 14, var2 + 18, 2, -1, -10275328);
            } else {
                VDTT_dg.a((VDTT_dg) VDTT_dg.b, var0, var8[0], var1 + 14, var2 + 14, 2, -1, -10275328);
            }
        }

        int var9 = var0.e;
        var6 = var0.f;
        if (var3 != null) {
            var0.a(-var0.e + var9 + var1 + 14, -var0.f + var6 + var2 + 15);
            var3.a(var0);
        }

        var0.a(-var0.e + var9, -var0.f + var6);
        if (var3 != null) {
            if (var3.M() > 1 || var3.c == 826 && var3.t) {
                VDTT_dg.a((BitmapFont) Graphics.b(72), var0, Item.b(var3.M()), var1 + 26, var2 + 23, 1, -1, -10275328);
            }

            if (var3.t) {
                VDTT_aa.a(var0, 44, 0, var1 + 2, var2 + 2, 6, (int) 7);
            }

            if (var3.getItemTemplate().f == 11) {
                VDTT_dc.a(var0, 685, 0, var1 + 9, var2 + 2, 0);
            }
        } VDTT_dc.a(var0, 1123, 0, var1 - 1, var2 - 2, 0);

        if (var4) {
            // var0.c(-500);
            VDTT_dc.a(var0, 40, 0, var1 - 1, var2 - 1, 0);
            //  var0.f();
        }

    }

    public static VDTT_bs a(MainScreen var0, int var1, int var2, int var3, VDTT_gk var4) {
        VDTT_bs var5;
        if ((var5 = new VDTT_bs(var1, var2, var0, var4)).objX > DataCenter.d().n - var5.q - var0.objX) {
            var5.objX = (short) (DataCenter.d().n - var5.q - var0.objX);
        }

        if (var5.objX < var1 - 100) {
            var5.objX = (short) (var1 - (var5.q + 200 + 3));
        }

        if (var5.objX < -var0.objX) {
            var5.objX = (short) (-var0.objX);
        }

        if (var5.objY > DataCenter.d().o - var5.r - var0.objY) {
            var5.objY = (short) (DataCenter.d().o - var5.r - var0.objY);
        }

        var0.a(var5);
        return var5;
    }

    public static VDTT_bz a(String var0, MainScreen var1, int var2, int var3, int var4) {
        VDTT_bz var5;
        if ((var5 = new VDTT_bz(var2, var3, var4, var1, var0)).objX > DataCenter.d().n - var5.q - var1.objX) {
            var5.objX = (short) (DataCenter.d().n - var5.q - var1.objX);
        }

        if (var5.objX < var2) {
            var5.objX = (short) (var2 - (var5.q + 3));
        }

        if (var5.objX < -var1.objX) {
            var5.objX = (short) (-var1.objX);
        }

        if (var5.objY > DataCenter.d().o - var5.r - var1.objY) {
            var5.objY = (short) (DataCenter.d().o - var5.r - var1.objY);
        }

        var1.a(var5);
        return var5;
    }

    public static VDTT_cc a(String var0, String var1, MainScreen var2, int var3, int var4) {
        VDTT_cc var5 = new VDTT_cc(var3, var4, var2, var0, var1);
        var2.a(var5);
        return var5;
    }

    public static VDTT_ce b(String var0, MainScreen var1, int var2, int var3, int var4) {
        VDTT_ce var5;
        if ((var5 = new VDTT_ce(var2, var3, var1, var0)).objX > DataCenter.d().n - var5.q - var1.objX) {
            var5.objX = (short) (DataCenter.d().n - var5.q - var1.objX);
        }

        if (var5.objX < var2 - var4 / 2) {
            var5.objX = (short) (var2 - (var5.q + var4 + 3));
        }

        if (var5.objX < -var1.objX) {
            var5.objX = (short) (-var1.objX);
        }

        if (var5.objY > DataCenter.d().o - var5.r - var1.objY) {
            var5.objY = (short) (DataCenter.d().o - var5.r - var1.objY);
        }

        var1.a(var5);
        return var5;
    }

    public static VDTT_br a(MainScreen var0, int var1, int var2, VDTT_hp var3) {
        VDTT_br var4;
        if ((var4 = new VDTT_br(var1, var2, var0, var3)).objX > DataCenter.d().n - var4.q - var0.objX) {
            var4.objX = (short) (DataCenter.d().n - var4.q - var0.objX);
        }

        if (var4.objX < -var0.objX) {
            var4.objX = (short) (-var0.objX);
        }

        if (var4.objY > DataCenter.d().o - var4.r - var0.objY) {
            var4.objY = (short) (DataCenter.d().o - var4.r - var0.objY);
        }

        var0.a(var4);
        return var4;
    }

    public static VDTT_bv a(VDTT_ic var0, MainScreen var1, int var2, int var3, int var4, int var5, VDTT_ek var6) {
        VDTT_bv var7 = new VDTT_bv(-28, -10, var4, var5, var1, var0, var6);
        var1.a(var7);
        return var7;
    }

    public static VDTT_bo a(MainScreen var0, VDTT_hl var1, Item var2) {
        return a(var0, var1.e + 2, var1.d, 32, (Item) var2);
    }

    public static VDTT_bo b(MainScreen var0, VDTT_hl var1, Item var2) {
        return a(var0, var1.e + 3, var1.d, 32, (Item) var2);
    }

    public static VDTT_bo c(MainScreen var0, VDTT_hl var1, Item var2) {
        return a(var0, var1.e + 4, var1.d, 32, (Item) var2);
    }

    public static VDTT_bo a(MainScreen var0, int var1, int var2, int var3, Item var4) {
        if (var4 == null) {
            return null;
        } else {
            VDTT_bn var6;
            if ((var6 = new VDTT_bn(var1, var2, 1044, var0, var4)).objX > DataCenter.d().n - var6.q - var0.objX) {
                var6.objX = (short) (var1 - var3 - 3 - var6.q);
            } else if (var6.objX < var1 - var3 / 2) {
                var6.objX = (short) (var1 - (var6.q + 3));
            }

            if (var6.objX < -var0.objX) {
                var6.objX = (short) (-var0.objX);
            }

            if (var6.objY > DataCenter.d().o - var6.r - var0.objY) {
                var6.objY = (short) (DataCenter.d().o - var6.r - var0.objY);
            }

            VDTT_bo var5 = new VDTT_bo(var1 - 32, var2 + 32, var6);
            var0.a(var5);
            return var5;
        }
    }

    public static VDTT_bo a(VDTT_hl var0, MainScreen var1, Item var2) {
        if (var2 == null) {
            return null;
        } else {
            VDTT_ht var5;
            if ((var5 = (VDTT_ht) var0.j).k >= 0 && var5.k < var5.i * var5.P) {
                var5.e();
                int var3 = var5.k % var5.P;
                int var4 = var5.k / var5.P - (var5.j >= 0 ? var5.j : 0);
                if (var5.n == 0) {
                    var3 = var5.k % var5.i - (var5.j >= 0 ? var5.j : 0);
                    var4 = var5.k / var5.i;
                }

                var3 = var3 * var5.h + var5.h + var5.objX;
                var4 = var4 * var5.h + var5.objY;
                return a(var1, var3, var4, var5.h, var2);
            } else {
                return null;
            }
        }
    }

    public static VDTT_bo b(VDTT_hl var0, MainScreen var1, Item var2) {
        if (var2 == null) {
            return null;
        } else {
            VDTT_ht var5;
            if ((var5 = (VDTT_ht) var0.j).k >= 0) {
                var5.e();
                int var3 = var5.k % var5.P;
                int var4 = var5.k / var5.P - (var5.j >= 0 ? var5.j : 0);
                if (var5.n == 0) {
                    var3 = var5.k % var5.i - (var5.j >= 0 ? var5.j : 0);
                    var4 = var5.k / var5.i;
                }

                var3 = var3 * var5.h + var5.h + var5.objX;
                var4 = var4 * var5.h + var5.objY;
                return a(var1, var3, var4, var5.h, var2);
            } else {
                return null;
            }
        }
    }

    static {
        a();
    }
}
