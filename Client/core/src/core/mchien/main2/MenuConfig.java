package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Input.Keys;
import java.util.Vector;

public final class MenuConfig extends VDTT_ar {

    public VDTT_bd[][] Setting;
    private VDTT_bf[] X;
    private VDTT_bf[] Y;
    private static VDTT_hp[] ConfigHelp;
    private VDTT_bu[][] aa;
    private VDTT_ho[] ab;
    private int ac;
    private int ad;
    private VDTT_iq ae;
    public byte[] configClient;
    private String[][] af = new String[3][];
    private static MenuConfig ag;
    public short c = -1;
    public static int d = -1;
    public static int N = -1;
    public static int O = -1;
    public static boolean P;
    public static boolean Q;
    public static boolean R;
    public static boolean S;
    private VDTT_bd ah;
    private VDTT_bd ai;
    private VDTT_bd aj;
    private VDTT_bd aj2;
    private VDTT_bd ak;
    private VDTT_bd al;
    private VDTT_bd am;
    private VDTT_bd an;
    private VDTT_bd an2;
    private VDTT_bd ao;
    public int T;
    public int saiH;
    private VDTT_hs ap;
    private VDTT_hs[] aq;
    private VDTT_ba[] ar;
    public VDTT_ca V;
    private short[] as;
    private VDTT_ba at;
    private boolean au;
    private int av = -1;
    private Vector aw = new Vector();
    public boolean W;

    public MenuConfig() {
        try {
            ag = this;
            this.J();
            this.I = VDTT_cw.v();
            this.a(260);
            this.K = false;
            this.ac = 17;
            this.ad = this.f() + 9 + 30;
            this.saiH = 21;
            String[] var1;
            int var2;
            if (Gdx.app.getType() == ApplicationType.Desktop) {
                var1 = Caption.zp;
            } else {
                var1 = new String[Caption.zp.length - 1];

                for (var2 = 0; var2 < var1.length; ++var2) {
                    var1[var2] = Caption.zp[var2];
                }
            }

            this.ae = new VDTT_iq(new VDTT_hp(2000, var1), this);
            this.Setting = new VDTT_bd[4][];
            this.aa = new VDTT_bu[3][];
            this.ab = new VDTT_ho[3];
            this.Setting[0] = new VDTT_bd[Caption.txtConfigs.length];

            int var5;
            boolean var6;
            VDTT_bd var10000;
            for (var2 = 0; var2 < this.Setting[0].length; ++var2) {
                var5 = var2;
                if (var2 <= 1) {
                    var5 = var2 + 1;
                }

                switch (var2) {
                    case 7:
                        this.Setting[0][var2] = this.a(this.ac, this.ad + 6 * this.saiH, Caption.txtConfigs[var2], this, 300 + var2);
                        break;
                    case 8:
                        this.Setting[0][var2] = this.a(132, this.ad + 3 * this.saiH, Caption.txtConfigs[var2], this, 300 + var2);
                        break;
                    case 9:
                        this.Setting[0][var2] = this.a(this.ac, this.ad + 7 * this.saiH, Caption.txtConfigs[var2], this, 300 + var2);
//                  this.Setting[0][var2] = this.a(this.ac, this.ad + 5 * this.U, VDTT_ei.txtConfigs[var2], this, 300 + var2);
                        if (VDTT_ek.m().az < 5) {
                            this.Setting[0][var2].d = true;
                        }
                        break;
                    case 10:
                        this.Setting[0][var2] = this.a(132, this.ad + 3 * this.saiH, Caption.txtConfigs[var2], this, 300 + var2);
                        this.Setting[0][var2].d = true;
                        break;
                    case 11:
                        this.Setting[0][var2] = this.a(132, this.ad + 5 * this.saiH, Caption.txtConfigs[var2], this, 300 + var2);
                        break;
                    case 12:
                        this.Setting[0][var2] = this.a(this.ac, this.ad + 5 * this.saiH, Caption.txtConfigs[var2], this, 300 + var2);
                        break;
                    default:
                        if (var2 > 3) {
                            var5 = var2 - 1;
                            this.Setting[0][var2] = this.a(this.ac, this.ad + var5 * this.saiH, Caption.txtConfigs[var2], this, 300 + var2);
                            if (var2 == 6) {
                                this.Setting[0][var2].f(132, this.Setting[0][5].objY);
                            }
                        } else {
                            this.Setting[0][var2] = this.a(this.ac, this.ad + var5 * this.saiH, Caption.txtConfigs[var2], this, 300 + var2);
                        }
                }

                this.ae.a(this.Setting[0][var2], 0);
            }

            var10000 = this.Setting[0][3];
            var6 = true;
            var10000.d = var6;
            var10000 = this.Setting[0][2];
            var6 = true;
            var10000.d = var6;
            var10000 = this.Setting[0][7];
            var6 = VDTT_ek.m().az < 5;
            var10000.d = var6;
            this.Setting[1] = new VDTT_bd[13];

            for (var2 = 0; var2 < this.Setting[1].length; ++var2) {
                this.Setting[1][var2] = this.a(this.ac - 3, this.ad + 120 + 20 + var2 * this.saiH, "", this, 200 + var2);
                var10000 = this.Setting[1][var2];
                var6 = this.configClient[20 + var2] >= 0;
                var10000.m = var6;
                this.ae.a(this.Setting[1][var2], 1);
            }

            this.al = this.a(this.ac, this.ad - 3, Caption.oi, 1007);
            var10000 = this.al;
            var6 = VDTT_eq.a().a(35);
            var10000.m = var6;
            this.ae.a(this.al, 1);
            this.am = this.a(138, this.ad - 3, Caption.wx, 1006);
            var10000 = this.am;
            var6 = VDTT_eq.a().a(31);
            var10000.m = var6;
            this.ae.a(this.am, 1);
            this.an = this.a(this.ac, this.ad - 3 + 22, Caption.yb, 1013);
            var10000 = this.an;
            var6 = VDTT_eq.a().a(39);
            var10000.m = var6;
            this.ae.a(this.an, 1);

            this.an2 = this.a(144, this.ad - 3 + 22, "Dùng all skill", 1014);
            var10000 = this.an2;
            var6 = VDTT_eq.a().a(40);
            var10000.m = var6;
            this.ae.a(this.an2, 1);

            (ConfigHelp = new VDTT_hp[7])[0] = new VDTT_hp(400, new String[]{"5%", "10%", "15%", "20%", "25%", "30%", "35%", "40%", "45%", "50%", "55%", "60%", "65%", "70%", "75%", "80%", "85%", "90%", "95%"});
            ConfigHelp[1] = new VDTT_hp(401, new String[]{"5%", "10%", "15%", "20%", "25%", "30%", "35%", "40%", "45%", "50%", "55%", "60%", "65%", "70%", "75%", "80%", "85%", "90%", "95%"});
            ConfigHelp[2] = new VDTT_hp(402, Caption.AJ);
            ConfigHelp[3] = new VDTT_hp(403, Caption.AI);
            ConfigHelp[4] = new VDTT_hp(404, Caption.AI);
            ConfigHelp[5] = new VDTT_hp(405, Caption.AL);
            ConfigHelp[6] = new VDTT_hp(406, Caption.txtSetDonRac);
            this.X = new VDTT_bf[ConfigHelp.length];

            for (var5 = 0; var5 < this.X.length; ++var5) {
                if (var5 == 0) {
                    this.X[var5] = this.a(super.q - 8 - 120, this.ad + var5 * this.saiH - 1 + this.saiH, 55, 5, ConfigHelp[var5], this, 0);
                } else if (var5 == 1) {
                    this.X[var5] = this.a(super.q - 8 - 120, this.ad + this.saiH - 1 + this.saiH, 55, 5, ConfigHelp[var5], this, 0);
                } else if (var5 == 2) {
                    this.X[var5] = this.a(super.q - 8 - 180, this.ad + var5 * this.saiH - 1 - 2 * this.saiH, 55, 5, ConfigHelp[var5], this, 0);
                } else if (var5 == 3) {
                    this.X[var5] = this.a(129, this.ad - 1 + this.saiH, 125, 5, ConfigHelp[var5], this, 0);
                } else if (var5 == 4) {
                    this.X[var5] = this.a(129, this.ad + this.saiH - 1 + this.saiH, 125, 5, ConfigHelp[var5], this, 0);
                } else if (var5 == 5) {
                    this.X[var5] = this.a(129, this.ad + this.saiH * 6 - 3, 115, 5, ConfigHelp[var5], this, 1);
                } else if (var5 == 6) {
                    this.X[var5] = this.a(129, this.ad + this.saiH * 7 - 3, 115, 5, ConfigHelp[var5], this, 1);
                    if (VDTT_ek.m().az < 5) {
                        this.X[var5].d = true;
                    }
                }

                this.ae.a(this.X[var5], 0);
            }

            this.X[2].b(DataCenter.n());
            this.X[3].b(true);
            this.X[4].b(true);
            this.ah = this.a(this.ac, this.ad, Caption.co, 1001);
            var10000 = this.ah;
            var6 = VDTT_eq.a().a(1);
            var10000.m = var6;
            this.ae.a(this.ah, 2);
            this.ai = this.a(this.ac, this.ad + 20, Caption.cp, 1002);
            var10000 = this.ai;
            var6 = VDTT_eq.a().a(0);
            var10000.m = var6;
            this.ae.a(this.ai, 2);
            this.ak = this.a(135, this.ad, Caption.cH, 1004);
            var10000 = this.ak;
            var6 = VDTT_eq.a().a(11);
            var10000.m = var6;
            this.ae.a(this.ak, 2);
            var5 = this.I instanceof VDTT_cw ? 20 : 0;
            this.Y = new VDTT_bf[8];
            VDTT_hp var8 = new VDTT_hp(1000, new String[]{Caption.cE, Caption.cF});
            if (Gdx.app.getType() == ApplicationType.Desktop) {
                var8 = new VDTT_hp(1000, new String[]{Caption.cE, Caption.cF, Caption.pG});
            }

            this.Y[2] = this.a(this.ac, this.ad + 45 + var5 + 25, 105, var8.c.length, var8, this, 0);
            this.Y[2].a(VDTT_eq.a().b(9));
            this.ae.a(this.Y[2], 2);
            int var3;
            if (this.I instanceof VDTT_cw) {
                this.aj = this.a(135, this.ad + 20, Caption.cG, 1003);
                var10000 = this.aj;
                var6 = VDTT_eq.a().a(10);
                var10000.m = var6;
                this.ae.a(this.aj, 2);
                this.aj2 = this.a(135, this.ad + 20 + 20, "Áp sát/Tele quái", 1003 + 2907);
                var10000 = this.aj2;
                var6 = VDTT_eq.a().a(41);
                var10000.m = var6;
                this.ae.a(this.aj2, 2);
                this.ad += 20;
                this.ao = this.a(this.ac, this.ad + 20, Caption.ds, 1011);
                var10000 = this.ao;
                var6 = VDTT_eq.a().a(36);
                var10000.m = var6;
                this.ae.a(this.ao, 2);
                var8 = new VDTT_hp(600, Caption.Bj);
                this.Y[0] = this.a(135, this.ad + 20 + 25, 105, 4, var8, this, 0);
                this.Y[0].a(VDTT_eq.a().b(25));
                this.ae.a(this.Y[0], 2);
                var8 = new VDTT_hp(1005, Caption.BD);
                this.Y[3] = this.a(135, this.ad + 45 + 25, 105, var8.c.length, var8, this, 0);
                this.Y[3].a(VDTT_eq.a().b(12));
                this.ae.a(this.Y[3], 2);
                var8 = new VDTT_hp(1012, Caption.BZ);
                this.Y[7] = this.a(this.ac, this.ad + 70 + 25, 105, var8.c.length, var8, this, 0);
                this.Y[7].a(VDTT_eq.a().b(37));
                this.ae.a(this.Y[7], 2);
                byte var10;
                if (Gdx.app.getType() == ApplicationType.Desktop) {
                    var1 = Caption.Bi;
                    var10 = 3;
                } else {
                    var1 = new String[2];

                    for (var3 = 0; var3 < 2; ++var3) {
                        var1[var3] = Caption.Bi[var3];
                    }

                    var10 = 2;
                }

                VDTT_hp var7 = new VDTT_hp(700, var1);
                this.Y[1] = this.a(this.ac, this.ad + 20 + 25, 105, var10, var7, this, 0);
                this.Y[1].a(VDTT_eq.a().b(21));
                this.ae.a(this.Y[1], 2);
                var8 = new VDTT_hp(1008, Caption.zv);
                VDTT_bf[] var12 = this.Y;
                int var10004 = this.ad + 45;
                VDTT_d var9 = VDTT_d.g();
                var12[4] = this.a(135, var10004, 105, VDTT_l.b() ? 3 : var8.c.length, var8, this, 1);
                this.Y[4].a(VDTT_eq.a().b(29));
                this.ae.a(this.Y[4], 2);
                this.Y[4].b(true);
                var8 = new VDTT_hp(1010, Caption.zD);
                this.Y[5] = this.a(135, this.ad + 45, 105, 3, var8, this, 0);
                this.Y[5].a(VDTT_eq.a().b(27));
                this.ae.a(this.Y[5], 2);
                this.Y[5].b(true);
                var8 = new VDTT_hp(1009, Caption.zx);
                this.Y[6] = this.a(135, this.ad + 45, 105, DataCenter.d().o < 300 ? 4 : 5, var8, this, 0);
                this.Y[6].a(VDTT_eq.a().b(30));
                this.ae.a(this.Y[6], 2);
                this.Y[6].b(true);
            }

            if (Gdx.app.getType() == ApplicationType.Desktop) {
                this.saiH = 24;
                this.V = this.a(-200, -200, 100, "", this, 1083, 0);
                byte var11 = 1;
                this.V.l = var11;
                this.V.b(true);
                var6 = true;
                this.V.W = true;
                this.aq = new VDTT_hs[Caption.AK.length];
                this.ap = new VDTT_hs((byte) 1, 9, this.f() + 45, this.q - 10, this.saiH * 5, this.saiH, Caption.AK.length);
                this.ar = new VDTT_ba[this.ap.i];
                this.as = VDTT_da.a();
                this.P();
                this.at = this.a(this.q / 2 - 30, this.r - 38, Caption.u, this, 5000, -8);
                this.ae.a(this.at, 3);
            }

            this.Q();
            this.w();
            if (DataCenter.l()) {
                this.ae.f = true;
                if (this.Setting != null) {
                    for (var5 = 0; var5 < this.Setting.length; ++var5) {
                        if (this.Setting[var5] != null) {
                            for (var3 = 2; var3 < this.Setting[var5].length; ++var3) {
                                this.Setting[var5][var3].d = true;
                            }
                        }
                    }
                }
            }

        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    public final void w() {
        this.f(VDTT_cw.M);
    }

    public final void x() {
        VDTT_bd var10000 = this.ah;
        boolean var2 = VDTT_eq.a().a(1);
        var10000.m = var2;
        var10000 = this.ai;
        var2 = VDTT_eq.a().a(0);
        var10000.m = var2;
    }

    public void f(int var1) {
        if (var1 == 2) {
            this.x();
        }

        this.ae.a(var1);
        if (this.ae.h() == 1) {
            this.aw.clear();

            boolean var8;
            for (var1 = 0; var1 < this.Setting[1].length; ++var1) {
                VDTT_bd var10000 = this.Setting[1][var1];
                var8 = true;
                var10000.d = var8;
            }

            Vector var9 = new Vector();

            for (int var2 = 0; var2 < VDTT_cw.v().ae.length; ++var2) {
                if (VDTT_cw.v().ae[var2].e > 0 && VDTT_cw.v().ae[var2].b().d > 0 && !VDTT_cw.v().ae[var2].c() && VDTT_cw.v().ae[var2].d != 30 && VDTT_cw.v().ae[var2].d != 84) {
                    var9.add(VDTT_cw.v().ae[var2]);
                }
            }

            VDTT_bd var3 = null;

            int var5;
            VDTT_bd var10;
            for (int var4 = 0; var4 < this.Setting[1].length; ++var4) {
                var10 = this.Setting[1][var4];

                for (var5 = 0; var5 < var9.size(); ++var5) {
                    VDTT_ic var6;
                    int var7;
                    if (!(var6 = (VDTT_ic) var9.get(var5)).m() && (var7 = var6.b().d / 5) == var4) {
                        if (var6.b().i == 1) {
                            var3 = var10;
                        }

                        var10.a(var6.b().b);
                        var8 = false;
                        var10.d = var8;
                        var8 = this.configClient[20 + var7] != -1;
                        var10.m = var8;
                        this.aw.add(var10);
                        var9.remove(var5);
                        break;
                    }
                }
            }

            if (var3 != null) {
                this.aw.remove(var3);
                this.aw.add(var3);
            }

            for (int var12 = 0; var12 < this.aw.size(); ++var12) {
                var10 = (VDTT_bd) this.aw.get(var12);
                short var11;
                if (var12 > 5) {
                    var11 = 144;
                    var5 = this.f() + 80 + (var12 - 6) * 20;
                } else {
                    var11 = 17;
                    var5 = this.f() + 80 + var12 * 20;
                }

                var10.f(var11, var5);
            }

            if (this.aw.size() > 0) {
                this.am.f(144, this.am.objY);
            }
        }

    }

    private void P() {
        for (int var1 = 0; var1 < this.ap.i; ++var1) {
            switch (this.as[var1]) {
                case 19:
                    this.ar[var1] = new VDTT_ba(this.q - 30 - 80, var1 * this.ap.h, 0, 0, "", this, 1000, -19);
                    break;
                case 20:
                    this.ar[var1] = new VDTT_ba(this.q - 30 - 80, var1 * this.ap.h, 0, 0, "", this, 1000, -20);
                    break;
                case 21:
                    this.ar[var1] = new VDTT_ba(this.q - 30 - 80, var1 * this.ap.h, 0, 0, "", this, 1000, -21);
                    break;
                case 22:
                    this.ar[var1] = new VDTT_ba(this.q - 30 - 80, var1 * this.ap.h, 0, 0, "", this, 1000, -22);
                    break;
                default:
                    if (var1 > 3 && var1 < 10) {
                        this.ar[var1] = new VDTT_ba(this.q - 30 - 80, (4 + (9 - var1)) * this.ap.h, 0, 0, Keys.toString(this.as[var1]), this, 1000, -23);
                    } else {
                        this.ar[var1] = new VDTT_ba(this.q - 30 - 80, var1 * this.ap.h, 0, 0, Keys.toString(this.as[var1]), this, 1000, -23);
                    }
            }

            this.ar[var1].d(30, this.saiH - 4);
            this.aq[var1] = new VDTT_hx((byte) 1, 0, 0, this.ar[var1].q, this.ar[var1].r, this.ar[var1].r, 1, this.ap);
        }

    }

    private void Q() {
        VDTT_bd var10000;
        int i;
        boolean isShow;
        for (i = 0; i < this.Setting[0].length; ++i) {
            if (i == 10) {
                var10000 = this.Setting[0][i];
                isShow = this.configClient[40] != -1;
                var10000.m = isShow;
            } else if (i == 11) {
                var10000 = this.Setting[0][i];
                isShow = this.configClient[41] != -1;
                var10000.m = isShow;
            } else if (i == 12) {
                var10000 = this.Setting[0][i];
                isShow = this.configClient[42] != -1;
                var10000.m = isShow;
            } else {
                var10000 = this.Setting[0][i];
                isShow = this.configClient[i] != -1;
                var10000.m = isShow;
            }
        }

        var10000 = this.Setting[0][6];
        isShow = !this.Setting[0][5].m;
        var10000.c = isShow;

        for (i = 0; i < this.X.length; ++i) {
            byte var2;
            if ((var2 = this.configClient[i + 10]) < 0) {
                var2 = 0;
            }

            this.X[i].a(var2);
        }

    }

    public final boolean z() {
        return this.W;
    }

    public final void a(boolean var1) {
        boolean var2 = this.W != var1;
        VDTT_cw.v().cx = -1;
        VDTT_cw.v().dD = false;
        this.W = var1;
        if (var1) {
            this.c = VDTT_cw.v().ai;
            d = VDTT_cw.v().ai;
            N = VDTT_ek.m().objX;
            O = VDTT_ek.m().objY;
            VDTT_cw.v().H();
            this.I();
        } else {
            this.c = -1;
        }

        VDTT_cw.v().ds.clear();
        if (var2) {
            DataCenter.d().c();
        }

    }

    public final int getBuffHP() {
        if (this.configClient[0] == -1) {
            return 0;
        } else {
            if (this.configClient[10] < 0 || this.configClient[10] >= ConfigHelp[0].c.length) {
                this.configClient[10] = 0;
            }

            return Integer.parseInt(ConfigHelp[0].c[this.configClient[10]].replaceAll("%", ""));
        }
    }

    public final int B() {
        if (this.configClient[1] == -1) {
            return 0;
        } else {
            if (this.configClient[11] < 0 || this.configClient[11] >= ConfigHelp[1].c.length) {
                this.configClient[11] = 0;
            }

            return Integer.parseInt(ConfigHelp[1].c[this.configClient[11]].replaceAll("%", ""));
        }
    }

    public static int C() {
        return VDTT_eq.a().b(30) * VDTT_jb.n(2);
    }

    public final int getAutoGhepDa() {
        return this.configClient[7] == -1 ? 0 : this.configClient[15] + 1;
    }

    public int getAutoDelItem() {
        return this.configClient[9] == -1 ? 0 : this.configClient[16] + 1;
    }

    public final int E() {
        if (!this.W) {
            return 0;
        } else {
            if (this.configClient[12] < 0 || this.configClient[12] >= ConfigHelp[2].c.length) {
                this.configClient[12] = 0;
            }

            return this.configClient[12] == ConfigHelp[2].c.length - 1 ? 100000 : Integer.parseInt(ConfigHelp[2].c[this.configClient[12]].replaceAll("%", ""));
        }
    }

    public final boolean F() {
        return this.configClient[42] == 0;
    }

    public final boolean G() {
        return this.configClient[5] != -1;
    }

    public final boolean H() {
        if (DataCenter.d().ai != null) {
            for (int var1 = 0; var1 < DataCenter.d().ai.b.size(); ++var1) {
                if (DataCenter.d().ai.b.get(var1) instanceof VDTT_eh) {
                    return false;
                }
            }
        }

        if (VDTT_cw.v().C().d == 13) {
            return true;
        } else {
            return this.configClient[4] != -1;
        }
    }

    public void I() {
        VDTT_da.a("arr_auto" + VDTT_ek.m().b, this.configClient);
    }

    public final void J() {
        this.configClient = VDTT_da.d("arr_auto" + VDTT_ek.m().b);
        if (this.configClient == null || this.configClient.length < 50) {
            this.configClient = new byte[50];

            for (int var1 = 0; var1 < this.configClient.length; ++var1) {
                this.configClient[var1] = -1;
                if (var1 == 5) {
                    this.configClient[var1] = 0;
                }

                if (var1 != 10 && var1 != 11) {
                    if (var1 == 12) {
                        this.configClient[var1] = 5;
                    } else if (var1 == 15) {
                        this.configClient[var1] = 0;
                    } else if (var1 >= 10 && var1 <= 16) {
                        this.configClient[var1] = 0;
                    } else if (var1 == 17) {
                        this.configClient[var1] = 0;
                    } else if (var1 == 19) {
                        this.configClient[var1] = 0;
                    } else if (var1 >= 20 && var1 < 32) {
                        this.configClient[var1] = 0;
                    }
                } else {
                    this.configClient[var1] = 5;
                }
            }
        }

    }

    public final void a(VDTT_hl var1, int var2, int var3) {
        super.a(var1, var2, var3);
        if (var1.b >= 4000 && var1.b < 5000) {
            var1.b -= 4000;
            this.av = var1.b;
            this.V.a("");
            this.V.b(false);
            this.V.f((super.q - 8) / 2 - this.V.q / 2, DataCenter.d().o - 122);
            VDTT_aa.a(this.V, "", "", this.V.l, this.V.m);
            VDTT_x var10000 = VDTT_aa.a;
            VDTT_jo var4 = new VDTT_jo(this, var1);
            var10000.b = var4;
        } else {
            switch (var1.b) {
                case 2000:
                    if (var1.j.k >= 0) {
                        this.f(var1.j.k);
                        return;
                    }
                    break;
                case 5000:
                    this.as = new short[]{19, 20, 21, 22, 53, 48, 46, 33, 51, 45, 29, 47, 32, 34, 62};
                    this.P();
                    VDTT_w.a(this.as);
                    this.R();
            }

        }
    }

    private void R() {
        VDTT_df var1 = null;
        boolean var5 = false;

        label76:
        {
            try {
                var5 = true;
                var1 = new VDTT_df();

                for (int var2 = 0; var2 < this.as.length; ++var2) {
                    var1.b(this.as[var2]);
                }

                VDTT_da.a("arr_keys", var1.a.toByteArray());
                var5 = false;
                break label76;
            } catch (Exception var6) {
                VDTT_jb.a(var6);
                var5 = false;
            } finally {
                if (var5) {
                    if (var1 != null) {
                        var1.a();
                    }

                }
            }

            if (var1 != null) {
                var1.a();
                return;
            }

            return;
        }

        var1.a();
    }

    public static MenuConfig K() {
        if (ag == null) {
            L();
        }

        return ag;
    }

    public static void L() {
        ag = new MenuConfig();
    }

    public final void perform(int var1, Object var2, VDTT_z var3) {
        try {
            if (var1 != 100 || VDTT_cw.v().br == 5 && (VDTT_cw.v().br != 5 || DataCenter.d().aA.b())) {
                if (var1 >= 200 && var1 < 212) {
                    var1 -= 200;
                    this.configClient[20 + var1] = (byte) (this.Setting[1][var1].m ? var1 : -1);
                } else if (var1 >= 300 && var1 < 400) {
                    var1 -= 300;
                    if (var1 == 10) {
                        this.configClient[40] = (byte) (this.Setting[0][var1].m ? 0 : -1);
                    } else if (var1 == 11) {
                        this.configClient[41] = (byte) (this.Setting[0][var1].m ? 0 : -1);
                    } else if (var1 == 12) {
                        this.configClient[42] = (byte) (this.Setting[0][var1].m ? 0 : -1);
                    } else {
                        this.configClient[var1] = (byte) (this.Setting[0][var1].m ? 0 : -1);
                    }

                    if (var1 == 2) {
                        this.a(this.Setting[0][var1].m);
                    }

                    if (var1 == 7 && this.Setting[0][var1].m) {
                        DataCenter.d().ai.c(Caption.pC, -2560);
                    }

                    if (var1 == 9 && this.Setting[0][var1].m) {
                        DataCenter.d().ai.c(Caption.pD, -2560);
                    }

                    VDTT_bd var10000;
                    boolean var7;
                    if (var1 == 8 && this.Setting[0][var1].m) {
                        var10000 = this.Setting[0][4];
                        var7 = false;
                        var10000.m = var7;
                        this.configClient[4] = -1;
                    }

                    if (var1 == 4 && this.Setting[0][var1].m) {
                        var10000 = this.Setting[0][8];
                        var7 = false;
                        var10000.m = var7;
                        this.configClient[8] = -1;
                    }

                    if (var1 == 5) {
                        var10000 = this.Setting[0][6];
                        var7 = !this.Setting[0][5].m;
                        var10000.c = var7;
                    }
                } else if (var1 >= 400 && var1 < 500) {
                    var1 -= 400;
                    this.configClient[var1 + 10] = (byte) this.X[var1].n.b;
                } else if (var1 < 500 || var1 >= 600) {
                    if (var1 == 600) {
                        if (this.Y[0].n.b == VDTT_eq.a().b(25)) {
                            return;
                        }

                        VDTT_eq.a().a(25, this.Y[0].n.b);
                        Graphics.d();
                    } else if (var1 == 700) {
                        if (!this.g(this.Y[1].n.b)) {
                            return;
                        }
                    } else if (var1 < 800 || var1 >= 804) {
                        switch (var1) {
                            case 1000:
                                VDTT_eq.a().a(9, this.Y[2].n.b);
                                break;
                            case 1001:
                                VDTT_ac.b().c(this.ah.m);
                                break;
                            case 1002:
                                VDTT_ac.b().b(this.ai.m);
                                break;
                            case 1003:
                                VDTT_eq.a().a(10, this.aj.m);
                                break;
                            case 1003 + 2907:
                                VDTT_eq.a().a(41, this.aj2.m);
                                break;
                            case 1004:
                                VDTT_eq.a().a(11, this.ak.m);
                                break;
                            case 1005:
                                VDTT_eq.a().a(12, this.Y[3].n.b);
                                DataCenter.d().c();
                                VDTT_cw.v().aD.j();
                                break;
                            case 1006:
                                VDTT_eq.a().a(31, this.am.m);
                                break;
                            case 1007:
                                VDTT_eq.a().a(35, this.al.m);
                                break;
                            case 1008:
                                if (VDTT_eq.a().b(29) != this.Y[4].n.b) {
                                    VDTT_eq.a().a(29, this.Y[4].n.b);
                                    this.v();
                                    this.i();
                                    VDTT_cw.v().ae();
                                    VDTT_ac.b().w();
                                }
                                break;
                            case 1009:
                                VDTT_eq.a().a(30, this.Y[6].n.b);
                                VDTT_cw.v().X();
                                break;
                            case 1010:
                                VDTT_eq.a().a(27, this.Y[5].n.b);
                                VDTT_cw.v().X();
                                break;
                            case 1011:
                                VDTT_eq.a().a(28, this.ao.m);
                                break;
                            case 1012:
                                VDTT_eq.a().a(37, this.Y[7].n.b);
                                DataCenter.d().c();
                                VDTT_cw.v().A();
                                break;
                            case 1013:
                                VDTT_eq.a().a(39, this.an.m);
                                break;
                            case 1014:
                                VDTT_eq.a().a(42, this.an2.m);
                        }
                    }
                }

                if (this.ae.h() == 0 || this.ae.h() == 1) {
                    this.I();
                }

            } else {
                try {
                    Message var6;
                    (var6 = new Message((byte) -15)).a(this.ab[2].a() == 0 ? 0 : this.ab[2].a() + 1);
                    var6.l();
                } catch (Exception var4) {
                }

                this.k();
            }
        } catch (Exception var5) {
        }
    }

    public final void b(boolean var1) {
        this.configClient[5] = (byte) (var1 ? 0 : -1);
        VDTT_bd var10000 = this.Setting[0][5];
        boolean var2 = this.G();
        var10000.m = var2;
        var10000 = this.Setting[0][6];
        var2 = !this.G();
        var10000.c = var2;
        this.I();
    }

    public final boolean M() {
        if (VDTT_cw.v().V()) {
            return false;
        } else {
            return this.W && this.configClient[40] == 0;
        }
    }

    public final boolean N() {
        return this.configClient[8] == 0;
    }

    public final void b(int var1, Object var2) {
    }

    public final Vector g() {
        Vector var1;
        (var1 = super.g()).addElement(this.ae.f());
        if (this.ae.h() == 3) {
            for (int var4 = 0; var4 < this.ar.length; ++var4) {
                int var2 = this.ap.objX + this.ar[var4].objX;
                int var3 = this.ap.objY + this.ar[var4].objY - this.ap.f;
                if (VDTT_jb.a(this.ap.objX, this.ap.objY, this.ap.objX + this.ap.q, this.ap.objY + this.ap.r, var2, var3) && VDTT_jb.a(this.ap.objX, this.ap.objY, this.ap.objX + this.ap.q, this.ap.objY + this.ap.r, var2 + this.ar[var4].q, var3 + this.ar[var4].r)) {
                    this.aq[var4].objX = (short) var2;
                    this.aq[var4].objY = (short) var3;
                    var1.addElement(new VDTT_hl(4000 + var4, this.aq[var4].objX, this.aq[var4].objY, this.aq[var4].objX + this.aq[var4].q, this.aq[var4].objY + this.aq[var4].r, this.aq[var4], this));
                }
            }

            var1.addElement(new VDTT_hl(1002, this.ap.objX, this.ap.objY, this.ap.objX + this.ap.q, this.ap.objY + this.ap.r, this.ap, this));
        }

        return var1;
    }

    public final void b(Graphics var1) {
        this.a(var1, this.objX, this.objY, this.q, this.r, Caption.cg, (byte) 2, this.K);
        this.ae.a(var1);
        switch (this.ae.h()) {
            case 0:
                if (!DataCenter.n()) {
                    VDTT_dg.b(VDTT_dg.d, var1, Caption.txtConfigs[2], this.Setting[0][0].objX, this.Setting[0][0].objY - this.saiH + 10, 0, -1, -16777216);
                    return;
                }
                break;
            case 1:
                return;
            case 2:
                return;
            case 3:
                Graphics var2 = var1;
                MenuConfig var6 = this;
                this.a(var1, 14, this.f() + 36, super.q - 8 - 20, this.h() - 44, 0, 22, 23, 1, 1);
                this.a(var1, this.ap);
                int var3 = var1.e;
                int var4 = var1.f;

                for (int var5 = 0; var5 < var6.ap.i; ++var5) {
                    VDTT_dg.b(VDTT_dg.d, var2, Caption.AK[var5], 50, var5 * var6.ap.h + 10, 0, -1, -16777216);
                    var6.a(var2, var3 + var6.ar[var5].objX, var4 + var6.ar[var5].objY);
                    var6.ar[var5].b = var5 == var6.av;
                    var6.ar[var5].b(var2);
                    var6.a(var2, var3, var4);
                }

                var6.a(var2);
                var6.ap.b(var2, var6);
        }

    }

    public final void a_() {
        if (!this.au) {
            this.au = true;
            this.Q();
        }

        this.ae.e();
        VDTT_cw.M = this.ae.h();
        if (this.ap != null) {
            this.ap.a();
        }

        VDTT_bd var10000 = this.Setting[0][7];
        boolean var1 = VDTT_ek.m().az < 5;
        var10000.d = var1;
        this.X[5].b(VDTT_ek.m().az < 5);
        var10000 = this.Setting[0][8];
        var1 = VDTT_cw.v().dH == null;
        var10000.d = var1;
        DataCenter.d();
        if (!DataCenter.b() && !this.n()) {
            if (VDTT_cw.v().br == 3 && VDTT_cw.v().bs == 0) {
                if (this.Setting[0][0].m && this.Setting[0][1].m) {
                    this.y();
                    return;
                }

                int var10001;
                if (this.ae.h() != 0) {
                    var10001 = this.objX + 40;
                    DataCenter.d().aA.a(var10001, this.objY + 42);
                    DataCenter.d().aA.b = true;
                    return;
                }

                if (this.T == 0) {
                    this.T = 1;
                }

                MenuConfig var2 = this;
                int var3 = 0;

                boolean var4;
                while (true) {
                    if (var3 >= var2.X.length) {
                        var4 = false;
                        break;
                    }

                    if (var2.X[var3].O) {
                        var4 = true;
                        break;
                    }

                    ++var3;
                }

                if (!var4) {
                    int var10002;
                    if (!this.Setting[0][0].m) {
                        var10001 = this.objX + this.Setting[0][0].objX + 5;
                        var10002 = this.objY + this.Setting[0][0].objY;
                        DataCenter.d().aA.a(var10001, var10002 + 5);
                        DataCenter.d().aA.b = true;
                        return;
                    }

                    if (!this.Setting[0][1].m) {
                        var10001 = this.objX + this.Setting[0][1].objX + 5;
                        var10002 = this.objY + this.Setting[0][1].objY;
                        DataCenter.d().aA.a(var10001, var10002 + 5);
                        DataCenter.d().aA.b = true;
                        return;
                    }
                }
            } else if (VDTT_cw.v().br == 5 && VDTT_cw.v().bs == 9) {
                this.y();
            }

        }
    }

    public final void d() {
        this.au = false;
        super.d();
    }

    public static void O() {
        R = false;
        Q = false;
        P = false;
    }

    private boolean g(int var1) {
        try {
            this.Y[1].a(var1);
            if (this.Y[1].n.b == VDTT_eq.a().b(21)) {
                return false;
            } else {
                VDTT_eq.a().a(21, this.Y[1].n.b);
                VDTT_eq.a().a(19, this.Y[1].n.b > 0);
                VDTT_cw.v().dD = false;
                VDTT_cw.v().cq = 2;
                return true;
            }
        } catch (Exception var2) {
            return false;
        }
    }

    // $FF: synthetic method
    static int a(MenuConfig var0, int var1) {
        return var0.av = -1;
    }

    // $FF: synthetic method
    static short[] a(MenuConfig var0) {
        return var0.as;
    }

    // $FF: synthetic method
    static VDTT_ba[] b(MenuConfig var0) {
        return var0.ar;
    }

    // $FF: synthetic method
    static void c(MenuConfig var0) {
        var0.P();
    }

    // $FF: synthetic method
    static void d(MenuConfig var0) {
        var0.R();
    }
}
