package core.mchien.main2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Hashtable;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class VDTT_dc {

    public static VDTT_v a = VDTT_v.a(1, 1);
    public static Hashtable b = new Hashtable();
    public static Hashtable c = new Hashtable();
    public static Hashtable d = new Hashtable();
    public static Hashtable e = new Hashtable();
    public static Hashtable f = new Hashtable();
    public static Hashtable g = new Hashtable();
    public static Hashtable h = new Hashtable();
    public static Vector i = new Vector();

    public static boolean a(int var0) {
        return var0 <= -2;
    }

    public static VDTT_v b(int var0) {

        VDTT_v var1 = null;
        String var2 = "client";
        if (DataCenter.l()) {
            var1 = (VDTT_v) e.get((short) var0);
        }

        if ((var1 == null || var1.b()) && (var1 = VDTT_da.i(var2 + "_icon_" + var0)) != null) {
            VDTT_p.a.add(var1);
        }

        if (var1 == null || var1.b()) {
            String var10001 = var2;
            Hashtable var3 = e;
            String var4 = var10001;
            a(var0, var4, var3, false);
            var1 = a;
        }

        return var1;
    }

    public static VDTT_v c(int var0) {

        VDTT_v var1;
        if ((var1 = (VDTT_v) e.get((short) var0)) == null || var1.b()) {
            Hashtable var2 = e;
            String var3 = "client";
            a(var0, var3, var2, false);
            var1 = a;
        }

        return var1;
    }

    public static VDTT_v d(int var0) {

        VDTT_v var1;
        if ((var1 = (VDTT_v) g.get((short) var0)) == null || var1.b()) {
            Hashtable var2 = g;
            String var3 = "char";
            a(var0, var3, var2, false);
            var1 = a;
        }

        return var1;
    }

    public static VDTT_v e(int var0) {

        VDTT_v var1;
        if ((var1 = (VDTT_v) g.get((short) var0)) == null || var1.b()) {
            a(var0, "char", g, true);
            var1 = a;
        }

        return var1;
    }

    public static short[] a2(Graphics var0, int var1, int var2, int var3, int var4, int var5, float size) {
        if (var1 == 713) {
            if (DataCenter.d().h % 24 < 12) {
                VDTT_aa.a(var0, var1, var2, var3 + 4, var4 + 4, 100, (byte) 3);
            } else {
                VDTT_aa.a(var0, 454, var2, var3 + 4, var4 + 4, 100, (byte) 3);
            }

            return new short[]{0, 0};
        } else if (a(var1)) {
            var0.a(var0, var1, var2, var3, var4, 20 * DataCenter.d().r, 20 * DataCenter.d().r);
            return new short[]{20, 20};
        } else {
            return a2(var0, var1, var2, var3, var4, 0, 0, var5, "client", e, (byte) 0, b, DataCenter.d().ab, size);
        }
    }

    public static short[] a(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
        if (var1 == 713) {
            if (DataCenter.d().h % 24 < 12) {
                VDTT_aa.a(var0, var1, var2, var3 + 4, var4 + 4, 100, (byte) 3);
            } else {
                VDTT_aa.a(var0, 454, var2, var3 + 4, var4 + 4, 100, (byte) 3);
            }

            return new short[]{0, 0};
        } else if (a(var1)) {
            var0.a(var0, var1, var2, var3, var4, 20 * DataCenter.d().r, 20 * DataCenter.d().r);
            return new short[]{20, 20};
        } else {
            return a(var0, var1, var2, var3, var4, 0, 0, var5, "client", e, (byte) 0, b, DataCenter.d().ab);
        }
    }

    public static short[] a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        try {
            Short var11 = (short) var1;
            VDTT_v var12;
            if ((var12 = (VDTT_v) f.get(var11)) != null && !var12.b()) {
                var0.a(var12, 0, 0, var12.c, var12.d, var2, (float) (var3 - var5 / 2), (float) (var4 - var6), (float) (var5 * DataCenter.d().r), (float) (var6 * DataCenter.d().r), 20);
            } else {
                int var10000 = var1;
                Hashtable var10 = f;
                String var9 = "tree";
                a(var10000, var9, var10, false);
            }

            return new short[]{(short) var12.c, (short) var12.d};
        } catch (Exception var8) {
            return new short[]{0, 0};
        }
    }

    public static short[] b(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
        if (var1 == 981) {
            var1 += DataCenter.d().h / 5 % 6;
            if (VDTT_cw.v().ai >= 49 && VDTT_cw.v().ai <= 50 && var4 < 350) {
                return new short[]{0, 0};
            }
        }

        if (var1 >= 6677 && var1 <= 6686) {
            var1 = 6677 + DataCenter.d().h / 3 % 10;
        } else if (var1 >= 9423 && var1 <= 9434) {
            var1 = 9423 + DataCenter.d().h / 3 % 12;
        } else if (var1 >= 9518 && var1 <= 9535) {
            var1 = 9518 + DataCenter.d().h / 2 % 18;
        } else if (var1 >= 8918 && var1 <= 8923) {
            var1 = 8918 + DataCenter.d().h / 3 % 6;
        } else if (var1 >= 8930 && var1 <= 8934) {
            if ((var1 = DataCenter.d().h / 4 % 100) > 4) {
                return new short[]{0, 0};
            }

            var1 += 8930;
        }

        return a(var0, var1, var2, var3, var4, 0, 0, var5, "char", g, (byte) 2, d, DataCenter.d().ac);
    }

    private static short[] a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, String var8, Hashtable var9, byte var10, Hashtable var11, Hashtable var12) {
        try {
            Short var16 = (short) var1;
            if (var1 >= 32000) {
                if (var9.get(var1) == null) {
                    var9.put(var16, VDTT_d.e2.get(var1 - 32000));
                }
            }
            VDTT_v var17;
            if ((var17 = (VDTT_v) var9.get(var16)) != null && !var17.b()) {
                if (var0 != null && var17 != null && (var17.c > 1 || var17.d > 1)) {
                    String var14 = var8;
                    byte var18 = -1;
                    switch (var14.hashCode()) {
                        case -1357712437:
                            if (var14.equals("client")) {
                                var18 = 2;
                            }
                            break;
                        case 3052374:
                            if (var14.equals("char")) {
                                var18 = 1;
                            }
                            break;
                        case 3568542:
                            if (var14.equals("tree")) {
                                var18 = 0;
                            }
                    }

                    switch (var18) {
                        case 0:
                            var0.a(var17, 0, 0, var17.c, var17.d, var2, (float) var3, (float) var4, 20);
                            break;
                        case 1:
                            VDTT_ed var15;
                            if ((var15 = (VDTT_ed) var12.get(var16)) == null) {
                                var15 = (VDTT_ed) DataCenter.d().ae.get(var16);
                            }
                            if (var15 == null) {
                                var15 = new VDTT_ed();
                                var15.d = (short) ((short) (var17.c / 4) * 2.5);
                                var15.e = (short) ((short) (var17.d / 4) * 2.5);
                            }

                            var5 = var15.d * DataCenter.d().r;
                            var1 = var15.e * DataCenter.d().r;
                            if (var0.j && var2 < 0) {
                                var0.a(var17, 0, 0, var17.c, var17.d, var2, (float) var3, (float) var4, (float) var5, (float) var1, 0.0F, 0.0F, var7);
                            } else {
                                var0.a(var17, 0, 0, var17.c, var17.d, var2, (float) var3, (float) var4, (float) var5, (float) var1, var7);
                            }
                            break;
                        case 2:
                            boolean var19;
                            if (!VDTT_cw.dK) {
                                var19 = true;
                                var0.k = var19;
                                var0.a(var17, 0, 0, var17.c, var17.d, var2, (float) var3, (float) var4, (float) var17.c, (float) var17.d, var7);
                                var19 = false;
                                var0.k = var19;
                            } else {
                                var5 = var17.c * DataCenter.d().r / DataCenter.d().p;
                                var1 = var17.d * DataCenter.d().r / DataCenter.d().p;
                                var19 = true;
                                var0.k = var19;
                                var0.a(var17, 0, 0, var17.c, var17.d, var2, (float) var3, (float) var4, (float) var5, (float) var1, var7);
                                var19 = false;
                                var0.k = var19;
                            }
                    }

                    return new short[]{(short) var17.c, (short) var17.d};
                }
            } else {
                a(var1, var8, var9, false);
            }
        } catch (Exception var13) {
            var13.printStackTrace();
        }

        return new short[]{0, 0};
    }

    private static short[] a2(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, String var8, Hashtable var9, byte var10, Hashtable var11, Hashtable var12, float size) {
        try {
            Short var16 = (short) var1;
            VDTT_v var17;
            if ((var17 = (VDTT_v) var9.get(var16)) != null && !var17.b()) {
                if (var0 != null && var17 != null && (var17.c > 1 || var17.d > 1)) {
                    String var14 = var8;
                    byte var18 = -1;
                    switch (var14.hashCode()) {
                        case -1357712437:
                            if (var14.equals("client")) {
                                var18 = 2;
                            }
                            break;
                        case 3052374:
                            if (var14.equals("char")) {
                                var18 = 1;
                            }
                            break;
                        case 3568542:
                            if (var14.equals("tree")) {
                                var18 = 0;
                            }
                    }

                    switch (var18) {
                        case 0:
                            var0.a(var17, 0, 0, var17.c, var17.d, var2, (float) var3, (float) var4, 20);
                            break;
                        case 1:
                            VDTT_ed var15;
                            if ((var15 = (VDTT_ed) var12.get(var16)) == null) {
                                var15 = (VDTT_ed) DataCenter.d().ae.get(var16);
                            }

                            var5 = var15.d * DataCenter.d().r;
                            var1 = var15.e * DataCenter.d().r;
                            if (var0.j && var2 < 0) {
                                var0.a(var17, 0, 0, var17.c, var17.d, var2, (float) var3, (float) var4, (float) var5, (float) var1, 0.0F, 0.0F, var7);
                            } else {
                                var0.a(var17, 0, 0, var17.c, var17.d, var2, (float) var3, (float) var4, (float) var5, (float) var1, var7);
                            }
                            break;
                        case 2:
                            boolean var19;
                            if (!VDTT_cw.dK) {
                                var19 = true;
                                var0.k = var19;
                                var0.a(var17, 0, 0, var17.c, var17.d, var2, (float) var3, (float) var4, (float) var17.c * size, (float) var17.d * size, var7);
                                var19 = false;
                                var0.k = var19;
                            } else {
                                var5 = var17.c * DataCenter.d().r / DataCenter.d().p;
                                var1 = var17.d * DataCenter.d().r / DataCenter.d().p;
                                var19 = true;
                                var0.k = var19;
                                var0.a(var17, 0, 0, var17.c, var17.d, var2, (float) var3, (float) var4, (float) var5, (float) var1, var7);
                                var19 = false;
                                var0.k = var19;
                            }
                    }

                    return new short[]{(short) var17.c, (short) var17.d};
                }
            } else {
                a(var1, var8, var9, false);
            }
        } catch (Exception var13) {
        }

        return new short[]{0, 0};
    }

    public static short[] a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        Graphics var10000 = var0;
        Hashtable var10008 = e;
        Hashtable var10010 = b;
        Hashtable var10 = DataCenter.d().ab;
        Hashtable var9 = var10010;
        boolean var11 = false;
        Hashtable var8 = var10008;
        String var7 = "client";
        return a(var10000, var1, var2, var3, var4, var5, 1.0F, var6, var7, var8, (byte) 0, var9, var10);
    }

    public static short[] a(Graphics var0, int var1, int var2, int var3, int var4, int var5, float var6, int var7) {
        return a(var0, var1, var2, var3, var4, var5, var6, var7, "char", g, (byte) 2, d, DataCenter.d().ac);
    }

    public static short[] a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        if (a(var1)) {
            var0.a(var0, var1, 0, var3, var4, var5, var6);
            return new short[]{20, 20};
        } else {
            return a(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, "client", e, (byte) 0, b, DataCenter.d().ab);
        }
    }

    public static short[] b(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        if (a(var1)) {
            var0.a(var0, var1, 0, var3, var4, var5, var6);
            return new short[]{20, 20};
        } else {
            DataCenter.d();
            var7 = var7 * DataCenter.j() / DataCenter.d().r;
            DataCenter.d();
            var8 = var8 * DataCenter.j() / DataCenter.d().r;
            return a(var0, var1, 0, var3, var4, var5, var6, var7, var8, 20, 20, 0, "char", g, (byte) 2, d, DataCenter.d().ac);
        }
    }

    private static short[] a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, String var12, Hashtable var13, byte var14, Hashtable var15, Hashtable var16) {
        try {
            Short var19 = (short) var1;
            Object var20;
            if ((var20 = var13.get(var19)) != null) {
                VDTT_v var18 = (VDTT_v) var20;
                if (var1 > 0) {
                    Graphics var10000;
                    VDTT_v var10001;
                    int var10002;
                    int var10003;
                    int var10004;
                    int var10005;
                    label53:
                    {
                        if (var1 != 101 && var1 != 102) {
                            var1 = DataCenter.d().r;
                            if (var12.equals("char")) {
                                DataCenter.d();
                                var1 = DataCenter.j();
                            }

                            var10000 = var0;
                            var10001 = var18;
                            var10002 = var7;
                            var10003 = var8;
                            var10004 = var9 == 0 ? var18.c / var1 : var9;
                            if (var10 == 0) {
                                var10005 = var18.d / var1;
                                break label53;
                            }
                        } else {
                            var10000 = var0;
                            var10001 = var18;
                            var10002 = var7;
                            var10003 = var8;
                            var10004 = var9;
                        }

                        var10005 = var10;
                    }

                    VDTT_aa.a(var10000, var10001, var10002, var10003, var10004, var10005, 0, 0, var2, var3, var4, var5, var6, var11, var12.equals("char"));
                }

                return new short[]{(short) var18.c, (short) var18.d};
            }

            a(var1, var12, var13, false);
        } catch (Exception var17) {
        }

        return new short[]{0, 0};
    }

    private static short[] a(Graphics var0, int var1, int var2, int var3, int var4, int var5, float var6, int var7, String var8, Hashtable var9, byte var10, Hashtable var11, Hashtable var12) {
        try {
            Short var16 = (short) var1;
            Object var17;
            if ((var17 = var9.get(var16)) != null) {
                VDTT_v var15 = (VDTT_v) var17;
                if (var1 > 0) {
                    boolean var14 = true;
                    var0.j = var14;
                    var1 = DataCenter.d().r;
                    if (var8.equals("char")) {
                        DataCenter.d();
                        var1 = DataCenter.j();
                    }

                    VDTT_aa.a(var0, var15, 0, 0, var15.c / var1, var15.d / var1, 0, 0, var2, var3, var4, (int) ((float) (var15.c * var5 / 100) * var6), (int) ((float) (var15.d * var5 / 100) * var6), var7, var8.equals("char"));
                    var14 = false;
                    var0.j = var14;
                }

                return new short[]{(short) var15.c, (short) var15.d};
            }

            a(var1, var8, var9, false);
        } catch (Exception var13) {
        }

        return new short[]{0, 0};
    }

    private static void a(int var0, String var1, Hashtable var2, boolean var3) {
        VDTT_v var4 = a;
        
        var2.put((short) var0, var4);
        if (!VDTT_eq.a().a(19) || !(DataCenter.d().ai instanceof VDTT_cw) || !var1.toLowerCase().contains("char") && !var1.toLowerCase().contains("tree")) {
            if (var0 > 0) {
                VDTT_en var5;
                (var5 = new VDTT_en()).h = var2;
                var5.g = var3;
                var5.a = (short) var0;
                var5.d = "icon" + var1.substring(0, 1).toUpperCase() + var1.substring(1, var1.length()) + "/" + var0 + ".png";
                if (var1.toLowerCase().contains("tree")) {
                    var5.e = var1 + "_" + var0;
                } else {
                    var5.e = var1 + "_icon_" + var0;
                }

                if (VDTT_jb.b()) {
                    VDTT_ae.z.add(var5);
                } else {
                    VDTT_ae.y.add(var5);
                }
            }

            VDTT_ae.t();
        }

    }

    public static void a() {
        VDTT_aa.a(b);
        VDTT_aa.a(e);
        VDTT_aa.a(d);
        VDTT_aa.a(g);
        VDTT_aa.a(c);
        VDTT_aa.a(f);
    }

    public static int a(VDTT_v var0) {
        return var0 == null ? 0 : var0.c / DataCenter.d().r;
    }

    public static int b(VDTT_v var0) {
        return var0 == null ? 0 : var0.d / DataCenter.d().r;
    }

    public static void b(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 == 14) {
            a(var0, 46, 0, 1, var4 + 1, (var5 - 2) * DataCenter.d().r, (var6 - 2) * DataCenter.d().r, 0, 0, 0, 0, 20);
        }

        var3 = 0;
        VDTT_v var7;
        if ((var7 = c(var1)) != null) {
            var3 = var7.c / DataCenter.d().r;
        }

        VDTT_aa.a(var0, var2, 0, 0 + var3, var4, var5 - var3 * 2, (int) var6);
        if (var1 != var2) {
            a(var0, var1, 0, 0, var4, 20);
            a(var0, var1, -360, 0 + var5, var4, 24);
        }

    }

    public static void c(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        var1 = 0;
        VDTT_v var7;
        if ((var7 = c(47)) != null) {
            var1 = var7.c / DataCenter.d().r;
        }

        VDTT_aa.a(var0, 48, 0, var3 + var1, -1, var5 - var1, (int) 29);
        a(var0, 47, 0, var3, -1, 20);
    }

    public static void d(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        if (c(47) != null) {
            DataCenter.d();
        }

        VDTT_aa.a(var0, 48, 0, var3, -1, var5, (int) 29);
    }

    public static void e(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        var1 = 0;
        VDTT_v var7;
        if ((var7 = c(47)) != null) {
            var1 = var7.c / DataCenter.d().r;
        }

        VDTT_aa.a(var0, 48, 0, var3, -1, var5 - var1, (int) 29);
        a(var0, 47, -360, var3 + var5, -1, 24);
    }

    public static void a(Graphics var0, int var1, int var2, int var3, int var4) {
        VDTT_aa.a(var0, -13, 0, var1, var2, var3, (int) var4);
    }

    public static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        var5 = var0.e;
        var6 = var0.f;
        var0.a(var1, var2);
        var1 = c(22).c / DataCenter.d().r;
        if (a(23)) {
            var2 = var1;
        } else {
            var2 = c(23).c / DataCenter.d().r;
        }

        VDTT_aa.a(var0, -8492991, 90, 1, 1, var3 - 2, (int) (var4 - 2));
        VDTT_aa.a(var0, 23, 0, var1, 0, var3 - var1 * 2, (int) var2);
        VDTT_aa.a(var0, 23, 180, var1, var4 - var2, var3 - var1 * 2, (int) var2);
        VDTT_aa.a(var0, 23, -90, 0, var1, var2, (int) (var4 - var1 * 2));
        VDTT_aa.a(var0, 23, 90, var3 - var2, var1, var2, (int) (var4 - var1 * 2));
        a(var0, 22, 0, 0, 0, 20);
        a(var0, 22, -360, var3, 0, 24);
        a(var0, 22, -180, 0, var4, 36);
        a(var0, 22, 180, var3, var4, 40);
        var0.a(-var0.e, -var0.f);
        var0.a(var5, var6);
    }

    public static int[] c(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        return b(var0, var1, var2, var3, var4, var5, 0, 0, 0, 0, 0, 20, "char", g, (byte) 2, d, DataCenter.d().ac);
    }

    private static int[] b(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, String var12, Hashtable var13, byte var14, Hashtable var15, Hashtable var16) {
        try {
            Short var19 = (short) var1;
            Object var20;
            if ((var20 = var13.get(var19)) != null) {
                VDTT_v var18 = (VDTT_v) var20;
                int var10004 = var9 == 0 ? var18.c : var9;
                int var10005 = var10 == 0 ? var18.d : var10;
                float var10007 = (float) var3;
                float var10008 = (float) var4;
                float var10009 = (float) var5;
                int var10010 = var18.d;
                DataCenter.d();
                return var0.b(var18, var7, var8, var10004, var10005, var2, var10007, var10008, var10009, (float) (var10010 / DataCenter.j() * DataCenter.d().r), var11);
            }

            a(var1, var12, var13, true);
        } catch (Exception var17) {
        }

        return null;
    }

    public static void a(byte[] var0) {
        ZipInputStream var1 = null;
        boolean var11 = false;

        label139:
        {
            try {
                var11 = true;
                var1 = new ZipInputStream(new ByteArrayInputStream(var0));

                ZipEntry var18;
                while ((var18 = var1.getNextEntry()) != null) {
                    try {
                        ByteArrayOutputStream var2 = new ByteArrayOutputStream();
                        byte[] var3 = new byte[524288];

                        int var4;
                        while ((var4 = var1.read(var3)) != -1) {
                            var2.write(var3, 0, var4);
                        }

                        var2.flush();
                        String var19 = var18.getName();
                        var3 = var2.toByteArray();
                        VDTT_v var20;
                        if (var19.startsWith("iconClient__")) {
                            var20 = VDTT_aa.a(var20 = VDTT_v.b(var3), var20.c * DataCenter.d().r / 4, var20.d * DataCenter.d().r / 4);
                            e.put(Short.parseShort(var19.replace("iconClient__", "").replace(".png", "")), var20);
                        } else if (var19.startsWith("iconChar__")) {
                            var20 = VDTT_aa.a(var20 = VDTT_v.b(var3), var20.c * DataCenter.d().r / 4, var20.d * DataCenter.d().r / 4);
                            g.put(Short.parseShort(var19.replace("iconChar__", "").replace(".png", "")), var20);
                        } else if (var19.startsWith("iconTree__")) {
                            var20 = VDTT_v.b(var3);
                            f.put(Short.parseShort(var19.replace("iconTree__", "").replace(".png", "")), var20);
                        } else if (var19.startsWith("mapmini__")) {
                            var20 = VDTT_aa.a(var20 = VDTT_v.b(var3), var20.c * DataCenter.d().r / 4, var20.d * DataCenter.d().r / 4);
                            h.put(Short.parseShort(var19.replace("mapmini__", "").replace(".png", "")), var20);
                        }

                        var2.close();
                    } catch (Exception var15) {
                    }
                }

                var11 = false;
                break label139;
            } catch (Exception var16) {
                var11 = false;
            } finally {
                if (var11) {
                    try {
                        if (var1 != null) {
                            var1.close();
                        }
                    } catch (Exception var12) {
                    }

                }
            }

            try {
                if (var1 != null) {
                    var1.close();
                }

                return;
            } catch (Exception var13) {
                return;
            }
        }

        try {
            var1.close();
        } catch (Exception var14) {
        }
    }
}
