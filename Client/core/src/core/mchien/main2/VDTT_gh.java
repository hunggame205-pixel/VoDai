package core.mchien.main2;

import java.util.Vector;

public final class VDTT_gh extends VDTT_ae {
    public VDTT_hs a;
    public VDTT_hp b;
    public VDTT_gg c;
    public Vector[] d;
    public MainScreen e;
    private short i = 307;
    private int j;
    public String[][] f;
    public boolean[] g;
    public boolean[] h;

    public VDTT_gh(VDTT_hp var1, int var2, int var3, int var4, int var5, int var6, int var7, MainScreen var8) {
        boolean var10 = false;
        byte var17 = 33;
        byte var16 = 87;
        byte var13 = 1;
        VDTT_hp var12 = var1;
        VDTT_gh var11 = this;
        this.f(var13, var4);
        this.d(var16, var6);
        this.j = var2;
        this.e = var8;
        this.b = var1;
        if (var1.c.length * var17 > var6 - 20) {
            var7 = (var6 - 20) / var17 * var17;
        } else {
            var7 = var1.c.length * var17;
        }

        this.a = new VDTT_hs((byte)1, 10, 10, var16 - 18, var7, var17, var1.c.length);
        byte var14 = -1;
        this.a.I = var14;
        this.c = new VDTT_gg(0, 0, 0, 16, (byte)0, var1.c.length);
        this.d = new Vector[var1.c.length];
        this.f = new String[var1.c.length][];
        this.g = new boolean[var1.c.length];
        this.h = new boolean[var1.c.length];

        for(var3 = 0; var3 < var11.d.length; ++var3) {
            var11.d[var3] = new Vector();
            String[] var15;
            if ((var15 = var12.c[var3].trim().split(" ")).length >= 3 && !var12.c[var3].contains("\n")) {
                var11.f[var3] = new String[2];
                StringBuilder var10000;
                String[] var10002;
                if (var15.length >= 4) {
                    var11.f[var3][0] = var15[0] + " " + var15[1];
                    var11.f[var3][1] = "";

                    for(var5 = 2; var5 < var15.length; ++var5) {
                        var10000 = new StringBuilder();
                        var10002 = var11.f[var3];
                        var10002[1] = var10000.append(var10002[1]).append(var15[var5]).append(" ").toString();
                    }

                    var11.f[var3][1] = var11.f[var3][1].trim();
                } else {
                    var11.f[var3][0] = var15[0];
                    var11.f[var3][1] = "";

                    for(var5 = 1; var5 < var15.length; ++var5) {
                        var10000 = new StringBuilder();
                        var10002 = var11.f[var3];
                        var10002[1] = var10000.append(var10002[1]).append(var15[var5]).append(" ").toString();
                    }

                    var11.f[var3][1] = var11.f[var3][1].trim();
                }
            } else {
                var11.f[var3] = VDTT_dg.b(VDTT_dg.e, var12.c[var3], var16 - 10);
            }
        }

    }
}
