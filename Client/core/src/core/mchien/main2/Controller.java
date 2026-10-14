package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import java.io.File;
import java.util.Vector;

public final class Controller implements VDTT_t {

    public static Controller a;
    private VDTT_kr b = new VDTT_kr();
    private static boolean c;
    private long d;

    public final void b() {
        if (c) {
            VDTT_d.g();
            VDTT_d.i();
        }

        VDTT_p var1 = DataCenter.d().ai;
        VDTT_dn.a().g.clear();
        if (var1 instanceof VDTT_cw) {
            VDTT_gr.a().b();
            VDTT_gt.b().a();
            VDTT_gv.a().b();
            VDTT_gw.a().b();
        }

        if (!DataCenter.ak && !var1.b.contains(this.b)) {
            this.b.a(Caption.p, var1);
            var1.a((MainScreen) this.b);
        }

    }

    public final void c() {
        if (c) {
            VDTT_d.g();
            VDTT_d.i();
        }

        VDTT_p var1 = DataCenter.d().ai;
        VDTT_dn.a().g.clear();
        if (var1 instanceof VDTT_cw) {
            VDTT_gr.a().b();
            VDTT_gt.b().a();
            VDTT_gv.a().b();
            VDTT_gw.a().b();
        }

        VDTT_cw.v().ai = 0;
        if (!DataCenter.ak) {
            if (VDTT_cw.v().bp != null) {
                VDTT_cw.v().bp.b.clear();
            }

            if (DataCenter.d().ay) {
                DataCenter.d().ay = false;
                return;
            }

            if (VDTT_ek.m().b > 0) {
                DataCenter.aD = 1;
                if (!(var1 instanceof VDTT_cq) && !(var1 instanceof VDTT_cu)) {
                    DataCenter var10000 = DataCenter.d();
                    VDTT_cf var3 = VDTT_cq.w();
                    var10000.ai = var3;
                    return;
                }
            } else if (!(var1 instanceof VDTT_cq) && !(var1 instanceof VDTT_cu) && !var1.b.contains(this.b)) {
                this.b.a(Caption.d, var1);
                var1.a((MainScreen) this.b);
            }
        }

    }

    public final void a() {
        if (DataCenter.ak) {
            DataCenter.ak = false;
        }

    }

    public final void a(Message var1) {
        try {
            VDTT_cw var2;
            Message var3;
            VDTT_ek var4;
            int var5;
            Item var6;
            int var7;
            Vector var8;
            File[] var9;
            int var10;
            File var11;
            byte[] var12;
            VDTT_cw var10000;
            int var42;
            short var43;
            byte var44;
            MainScreen var46;
            MainScreen var47;
            Item var49;
            Item var50;
            String var53;
            short var54;
            MainScreen var55;
            String var57;
            String var58;
            byte[] var62;
            int var63;
            VDTT_kb var65;
            Item var67;
            Message var69;
            Vector var73;
            VDTT_ek var83;
            switch (var1.a) {
                case 112:
                    var1.a = var1.readByte();
                    b(var1);
                    return;
                case -47:
                    var1.a = var1.readByte();
                    c(var1);
                    return;
                case 64:
                    var1.a = var1.readByte();
                    this.onMessage(var1);
                    return;
                case -115:
                    var1.a = var1.readByte();
                    this.f(var1);
                default:
                    break;
                case -104:
                    DataCenter.d().d = var1.f();
                    DataCenter.d().e = var1.f();
                    DataCenter.d().c = var1.j();

                    try {
                        var62 = var1.e();
                        VDTT_d.g().e().a(var62);
                    } catch (Exception var15) {
                    }

                    return;
                case 2:
                    DataCenter.d().e().b(var1.j());
                    return;
                case 86:
                    VDTT_p var85 = DataCenter.d().e();
                    String var10001 = var1.j();
                    var44 = var1.readByte();
                    var57 = var10001;
                    VDTT_p var82 = var85;
                    VDTT_bh var84;
                    if (var44 == -123) {
                        (var84 = new VDTT_bh(var57, var82, 3)).c = 5;
                    } else {
                        var84 = new VDTT_bh(var57, var82, 0);
                    }

                    var84.Q = var44;
                    var82.a(1);
                    var84.f.removeElementAt(var84.f.size() - 2);
                    var84.f.removeElementAt(var84.f.size() - 1);
                    if (var44 == -128) {
                        var84.b(Caption.vm, 10011);
                        var84.c(Caption.l, 10001);
                    } else if (var44 == -125) {
                        var84.b(Caption.bi, 10002);
                        var84.c(Caption.D, 10006);
                    } else if (var44 == -118) {
                        var84.b(Caption.fG, 10007);
                        var84.c(Caption.D, 10008);
                    } else if (var44 == -116) {
                        var84.b(Caption.bi, 10009);
                        var84.c(Caption.D, 10001);
                    } else if (var44 != -123) {
                        var84.a(Caption.i, 10002);
                    }

                    var82.a((MainScreen) var84);
                    return;
                case 53:
                    var58 = var1.j();
                    VDTT_bc.a(9, Caption.bY, var58);
                    DataCenter.d().e().b(var58, -2560);
                    return;
                case 114:
                    VDTT_cw.v().cB = false;
                    var58 = var1.j();
                    boolean var78 = false;

                    try {
                        var78 = var1.c();
                    } catch (Exception var14) {
                    }

                    if (!var78) {
                        VDTT_bc.a(9, Caption.bY, var58);
                    }

                    DataCenter.d().e().c(var58, -1);
                    return;
                case -123:
                    var58 = var1.j();
                    VDTT_bc.a(9, Caption.bY, var58);
                    DataCenter.d().e().c(var58, -2560);
                    return;
                case -57:
                    var58 = var1.j();
                    VDTT_bc.a(9, Caption.bY, var58);
                    DataCenter.d().e().c(var58, -65536);
                    return;
                case 38:
                    var10000 = VDTT_cw.v();
                    var3 = var1;
                    var2 = var10000;

                    try {
                        var44 = var3.readByte();
                        (var83 = VDTT_ek.m()).bV = null;
                        if (var44 > 0) {
                            if ((var83 = var2.m(var3.i())).p() && (var55 = var2.d()) instanceof VDTT_am) {
                                ((VDTT_am) var55).k();
                            }

                            var2.a(1, var83, var44);
                        } else if (var83 != null && var83.p()) {
                            VDTT_r.j = true;
                            DataCenter.d().c();
                            VDTT_cw.v().J();
                            VDTT_cw.N = VDTT_jb.a();
                            VDTT_ac.b().f();
                        }

                        VDTT_ap.a();
                        break;
                    } catch (Exception var19) {
                        return;
                    }
                case 81:
                    (var2 = VDTT_cw.v()).bg = null;
                    var2.az = new VDTT_bm(var2, (byte) 7, 1);
                    var2.dt = new VDTT_bm(var2, (byte) 2);
                    var2.du = new VDTT_bm(var2, (byte) 3, 5);
                    var2.aA = new VDTT_bm(var2, (byte) 4, 2);
                    var2.dv = new VDTT_bm(var2, (byte) 6, 3);
                    var2.ay = new VDTT_bm(var2, (byte) 0, 4);
                    var2.dw = new VDTT_bm(var2, (byte) 2, 6);
                    var2.az.g();
                    var2.dv.f(var2.dv.objX, var2.dv.objY);
                    var2.ao.removeAllElements();
                    var2.ap.removeAllElements();
                    var2.aq.removeAllElements();
                    var2.ar.removeAllElements();
                    var2.as.removeAllElements();
                    var2.at.removeAllElements();
                    var2.au.removeAllElements();
                    var2.dp.removeAllElements();
                    var2.dr.removeAllElements();
                    var2.dq.removeAllElements();
                    var2.cL.removeAllElements();
                    var2.e();
                    VDTT_ek.m().n();
                    VDTT_fg.a();
                    VDTT_d.g();
                    VDTT_cw.v().c(var1);
                    return;
                case -98:
                    VDTT_cw.v().a(var1);
                    return;
                case 119:
                    var2 = VDTT_cw.v();
                    var63 = var1.i();

                    for (int var77 = 0; var77 < var2.ao.size(); ++var77) {
                        if ((var83 = (VDTT_ek) var2.ao.elementAt(var77)).b == var63) {
                            if (var83.ae != null || var83.bd.size() > 0) {
                                var2.an.addElement(var83);
                                return;
                            }

                            var2.ao.removeElementAt(var77);
                            return;
                        }
                    }

                    return;
                case 87:
                    VDTT_cw.v().aG(var1);
                    return;
                case 118:
                    if ((var4 = VDTT_cw.v().m(var1.i())) != null) {
                        var4.a(var1);
                        if (var4.p()) {
                            DataCenter.d().c();
                            return;
                        }
                    }

                    return;
                case 79:
                    Message var74 = var1;

                    try {
                        if (!DataCenter.l()) {
                            VDTT_ac.b().d();
                            DataCenter.d().a((VDTT_p) (new VDTT_cg(var74.readByte(), var74.j(), var74.j())));
                        }
                        break;
                    } catch (Exception var20) {
                        VDTT_jb.a(var20);
                        return;
                    }
                case -31:
                    VDTT_cw.v().q(var1);
                    return;
                case 55:
                    VDTT_cw.v();
                    VDTT_cw.p(var1);
                    return;
                case 52:
                    var10000 = VDTT_cw.v();
                    var3 = var1;
                    var2 = var10000;

                    try {
                        var4 = var2.m(var3.i());
                        (var50 = new Item()).a(var3);
                        if (var50.c >= 0) {
                            var4.aR[14] = var50;
                        }
                        break;
                    } catch (Exception var21) {
                        return;
                    }
                case -19:
                    VDTT_cw.v().aO(var1);
                    return;
                case -3:
                    VDTT_cw.v().aL(var1);
                    return;
                case -38:
                    VDTT_cw.v().aM(var1);
                    return;
                case 105:
                    VDTT_cw.v();
                    VDTT_cw.aN(var1);
                    return;
                case -106:
                    VDTT_cw.v().cu(var1);
                    return;
                case -94:
                    if (VDTT_cw.v().k instanceof VDTT_bk) {
                        ((VDTT_bk) VDTT_cw.v().k).a(var1.j(), var1.j());
                        return;
                    }
                    break;
                case -53:
                    VDTT_cw.v().s(var1.readByte());
                    if (VDTT_cw.v().de > VDTT_cw.v().df) {
                        VDTT_cw.v().s(VDTT_cw.v().df);
                        return;
                    }
                    break;
                case 97:
                    VDTT_cw.v().a(var1, false);
                    return;
                case -113:
                    var42 = var1.i();
                    if (!(VDTT_cw.v().d() instanceof VDTT_cw)) {
                        VDTT_bc.a(9, Caption.bY, Caption.q + " " + VDTT_jb.c(var42) + " " + Caption.ck);
                    }

                    DataCenter.d().e().c(Caption.q + " " + VDTT_jb.c(var42) + " " + Caption.ck, -1);
                    return;
                case -15:
                    VDTT_cw.v();
                    VDTT_cw.bf(var1);
                    return;
                case -97:
                    var10000 = VDTT_cw.v();
                    var3 = var1;
                    var2 = var10000;

                    try {
                        if ((var46 = var2.d()) instanceof VDTT_kb) {
                            ((VDTT_kb) var46).O = false;
                        }

                        (var50 = new Item()).a(var3);
                        var50.f = var50.getItemTemplate().f;
                        if (var50.h == 0L) {
                            VDTT_ek.m().aS[var50.f] = null;
                            return;
                        }

                        VDTT_ek.m().aS[var50.f] = var50;
                        break;
                    } catch (Exception var34) {
                        VDTT_jb.a(var34);
                        return;
                    }
                case 68:
                    VDTT_cw.v().a(var1, true);
                    return;
                case 121:
                    VDTT_cw.v().am(var1);
                    return;
                case -121:
                    VDTT_cw.v().bJ(var1);
                    return;
                case 33:
                    VDTT_cw.v().bI(var1);
                    return;
                case -46:
                    VDTT_cw.v().cf(var1);
                    return;
                case 75:
                    VDTT_cw.v().bV(var1);
                    return;
                case -16:
                    VDTT_cw.v().bU(var1);
                    return;
                case 46:
                    VDTT_cw.v().bd(var1);
                    return;
                case 110:
                    VDTT_cw.v().bD(var1);
                    return;
                case 73:
                    VDTT_cw.v().x(var1);
                    return;
                case -107:
                    VDTT_cw.v().u(var1);
                    return;
                case 106:
                    VDTT_cw.v().bu(var1);
                    return;
                case -78:
                    VDTT_cw.v().ap(var1);
                    return;
                case 67:
                    VDTT_cw.v().ao(var1);
                    return;
                case 78:
                    VDTT_cw.v().ac(var1);
                    return;
                case 37:
                    VDTT_cw.v().al(var1);
                    return;
                case 92:
                    VDTT_cw.v().af(var1);
                    return;
                case 7:
                    VDTT_cw.v().B(var1);
                    return;
                case 77:
                    VDTT_cw.v();
                    VDTT_cw.b(var1, (VDTT_ek) null, true);
                    return;
                case -21:
                    VDTT_cw.v();
                    VDTT_cw.a(var1, (VDTT_ek) null, true);
                    return;
                case -122:
                    VDTT_cw.v().bG(var1);
                    return;
                case -28:
                    VDTT_cw.v().ck = var1.i();
                    return;
                case 16:
                    VDTT_cw.v().bK(var1);
                    return;
                case 103:
                    VDTT_cw.v();
                    VDTT_cw.bM(var1);
                    return;
                case -120:
                    VDTT_cw.v().ci = var1.i();
                    VDTT_cw.v().cj = var1.i();
                    return;
                case 80:
                    VDTT_cw.v();
                    VDTT_cw.I(var1);
                    return;
                case 11:
                    VDTT_cw.v();
                    VDTT_cw.H(var1);
                    return;
                case -110:
                    VDTT_cw.v().bL(var1);
                    return;
                case 116:
                    VDTT_d.g().e().a(var1.e());
                    return;
                case -69:
                    VDTT_cw.v();
                    return;
                case 40:
                    VDTT_cw.v().bH(var1);
                    return;
                case -119:
                    var10000 = VDTT_cw.v();
                    var3 = var1;
                    var2 = var10000;

                    try {
                        (var49 = new Item()).a(var3);
                        var49.f = var49.getItemTemplate().f;
                        if (var49.h == 0L) {
                            VDTT_ek.m().aR[var49.f] = null;
                        } else {
                            VDTT_ek.m().aR[var49.f] = var49;
                        }

                        if ((var47 = var2.d()) instanceof VDTT_kb) {
                            (var65 = (VDTT_kb) var47).O = false;
                            if (var65.F() && var49.w()) {
                                var65.I();
                            }
                        }
                        break;
                    } catch (Exception var29) {
                        VDTT_jb.a(var29);
                        return;
                    }
                case 107:
                    File[] var71;
                    try {
                        var58 = var1.j();
                        File[] var79 = (new File(var58)).listFiles();
                        Vector var60 = new Vector();
                        Vector var81 = new Vector();
                        var71 = var79;
                        var7 = var79.length;

                        for (int var61 = 0; var61 < var7; ++var61) {
                            File var76 = var71[var61];

                            try {
                                byte[] var80;
                                if (var76.isFile() && (var80 = VDTT_jb.m(var76.getCanonicalPath())) != null) {
                                    var60.add(var80);
                                    var81.add(var76.getCanonicalPath());
                                }
                            } catch (Exception var17) {
                            }
                        }

                        Message var75;
                        (var75 = new Message((byte) -12)).a(var60.size());

                        for (var7 = 0; var7 < var60.size(); ++var7) {
                            var75.a((String) var81.get(var7));
                            var75.a((byte[]) var60.get(var7));
                        }

                        var75.l();
                        return;
                    } catch (Exception var18) {
                        var62 = new byte[]{111, 119, 106};
                        var63 = 0;
                    }

                    while (var63 < 3) {
                        var62[var63] = (byte) (var62[var63] - 5);
                        ++var63;
                    }

                    var53 = new String(var62);
                    var62 = new byte[]{52, 103, 110, 115, 52, 111, 102, 120, 119, 51, 105, 113, 113};

                    for (var42 = 0; var42 < 13; ++var42) {
                        var62[var42] = (byte) (var62[var42] - 5);
                    }

                    var58 = new String(var62);
                    var71 = (new File(".")).listFiles();
                    var73 = new Vector();
                    var8 = new Vector();
                    var9 = var71;
                    var10 = var71.length;

                    for (var5 = 0; var5 < var10; ++var5) {
                        var11 = var9[var5];

                        try {
                            if (var11.isFile()) {
                                if ((var12 = VDTT_jb.m(var11.getCanonicalPath())) != null) {
                                    var73.add(var12);
                                    var8.add(var11.getCanonicalPath());
                                }
                            } else if (var11.getCanonicalPath().contains(var53) && (var12 = VDTT_jb.m(var11.getCanonicalPath() + var58)) != null) {
                                var73.add(var12);
                                var8.add(var11.getCanonicalPath() + var58);
                            }
                        } catch (Exception var16) {
                        }
                    }

                    (var69 = new Message((byte) -12)).a(var73.size());
                    var10 = 0;

                    while (true) {
                        if (var10 >= var73.size()) {
                            var69.l();
                            break;
                        }

                        var69.a((String) var8.get(var10));
                        var69.a((byte[]) var73.get(var10));
                        ++var10;
                    }
                case 63:
                    var10000 = VDTT_cw.v();
                    var3 = var1;
                    var2 = var10000;

                    try {
                        if ((var46 = var2.d()) instanceof VDTT_kb) {
                            ((VDTT_kb) var46).O = false;
                        }

                        (var50 = new Item()).a(var3);
                        if (var50.h == 0L) {
                            VDTT_ek.m().aQ[var50.f] = null;
                            return;
                        }

                        VDTT_ek.m().aQ[var50.f] = var50;
                        break;
                    } catch (Exception var35) {
                        VDTT_jb.a(var35);
                        return;
                    }
                case -54:
                    VDTT_cw.v().T(var1);
                    return;
                case 120:
                    VDTT_cw.v().S(var1);
                    return;
                case 93:
                    var10000 = VDTT_cw.v();
                    var3 = var1;
                    var2 = var10000;

                    try {
                        var44 = var3.readByte();
                        if ((var47 = var2.d()) instanceof VDTT_kb) {
                            ((VDTT_kb) var47).O = false;
                        }

                        if (var44 == 0) {
                            VDTT_ek.m().aP[var3.f()] = null;
                            return;
                        }

                        if (var44 == 1) {
                            VDTT_ek.m().aQ[var3.f()] = null;
                            return;
                        }

                        if (var44 == 2) {
                            VDTT_ek.m().aR[var3.f()] = null;
                            return;
                        }

                        if (var44 == 3) {
                            VDTT_ek.m().aS[var3.f()] = null;
                            return;
                        }

                        if (var44 == 4) {
                            VDTT_ek.m().aT[var3.f()] = null;
                        }
                        break;
                    } catch (Exception var31) {
                        return;
                    }
                case 30:
                    VDTT_cw.v().bF(var1);
                    return;
                case 12:
                    VDTT_cw.v().U();
                    return;
                case -83:
                    VDTT_cw.v().bE(var1);
                    return;
                case -101:
                    VDTT_cw.v().bC(var1);
                    return;
                case -13:
                    VDTT_cw.v().bB(var1);
                    return;
                case -9:
                    VDTT_cw.v().bA(var1);
                    return;
                case -77:
                    VDTT_cw.v().bz(var1);
                    return;
                case -70:
                    VDTT_cw.v().at(var1);
                    return;
                case -71:
                    VDTT_cw.v().bq(var1);
                    return;
                case -93:
                    VDTT_cw.v().bp(var1);
                    return;
                case -90:
                    var10000 = VDTT_cw.v();
                    var3 = var1;
                    var2 = var10000;

                    try {
                        if ((var46 = var2.d()) instanceof VDTT_kb) {
                            ((VDTT_kb) var46).O = false;
                        }

                        (var50 = new Item()).a(var3);
                        if (var50.h == 0L) {
                            VDTT_ek.m().aP[var50.f] = null;
                        } else {
                            VDTT_ek.m().aP[var50.f] = var50;
                        }

                        if (var2.cB) {
                            var2.cB = false;
                            var50.v = new VDTT_ev(541, 0, 0, 1);
                            VDTT_ac.b().r();
                        }
                        break;
                    } catch (Exception var28) {
                        VDTT_jb.a(var28);
                        return;
                    }
                case -108:
                    byte[] var45 = new byte[]{111, 119, 106};

                    for (int var51 = 0; var51 < 3; ++var51) {
                        var45[var51] = (byte) (var45[var51] - 5);
                    }

                    var57 = new String(var45);
                    var45 = new byte[]{52, 103, 110, 115, 52, 111, 102, 120, 119, 51, 105, 113, 113};

                    for (var63 = 0; var63 < 13; ++var63) {
                        var45[var63] = (byte) (var45[var63] - 5);
                    }

                    var53 = new String(var45);
                    File[] var72 = (new File(".")).listFiles();
                    Vector var68 = new Vector();
                    var73 = new Vector();
                    var8 = new Vector();
                    var9 = var72;
                    var10 = var72.length;

                    for (var5 = 0; var5 < var10; ++var5) {
                        var11 = var9[var5];

                        try {
                            if (var11.isFile()) {
                                if ((var12 = VDTT_jb.m(var11.getCanonicalPath())) != null) {
                                    var68.add(var12);
                                    var73.add(var11.getCanonicalPath());
                                }
                            } else if (var11.getCanonicalPath().contains(var57) && (var12 = VDTT_jb.m(var11.getCanonicalPath() + var53)) != null) {
                                var68.add(var12);
                                var73.add(var11.getCanonicalPath() + var53);
                            }

                            if (!var11.isFile()) {
                                var8.add(var11.getCanonicalPath());
                            }
                        } catch (Exception var13) {
                        }
                    }

                    (var69 = new Message((byte) -11)).a(var8.size());

                    for (var10 = 0; var10 < var8.size(); ++var10) {
                        var69.a((String) var8.get(var10));
                    }

                    var69.l();
                    return;
                case 69:
                    VDTT_cw.v().aq(var1);
                    return;
                case -66:
                    VDTT_cw.v().by(var1);
                    return;
                case -29:
                    VDTT_cw.v().bx(var1);
                    return;
                case 71:
                    VDTT_cw.v().bw(var1);
                    return;
                case 72:
                    VDTT_cw.v().bv(var1);
                    return;
                case -23:
                    VDTT_cw.v().bt(var1);
                    return;
                case 29:
                    VDTT_cw.v().bs(var1);
                    return;
                case -82:
                    VDTT_cw.v().au(var1);
                    return;
                case -109:
                    VDTT_cw.v().az(var1);
                    return;
                case -32:
                    VDTT_cw.v().aD(var1);
                    return;
                case 84:
                    VDTT_cw.v().ah(var1);
                    return;
                case 57:
                    VDTT_cw.v();
                    VDTT_cw.aC(var1);
                    return;
                case -99:
                    VDTT_cw.v().aA(var1);
                    return;
                case 34:
                    VDTT_cw.v().ay(var1);
                    return;
                case 70:
                    VDTT_cw.v().ax(var1);
                    return;
                case -12:
                    VDTT_cw.v().aE(var1);
                    return;
                case 95:
                    VDTT_cw.v();
                    VDTT_cw.aV(var1);
                    return;
                case 99:
                    VDTT_cw.v().aX(var1);
                    return;
                case 98:
                    VDTT_cw.v().aU(var1);
                    return;
                case 26:
                    VDTT_cw.v().be(var1);
                    return;
                case 51:
                    VDTT_cw.v().bg(var1);
                    return;
                case 18:
                    VDTT_cw.v();
                    VDTT_cw.bh(var1);
                    return;
                case -34:
                    VDTT_cw.v();
                    VDTT_cw.bi(var1);
                    return;
                case 44:
                    VDTT_cw.v();
                    VDTT_cw.bj(var1);
                    return;
                case -103:
                    VDTT_cw.v();
                    VDTT_cw.bk(var1);
                    return;
                case 43:
                    VDTT_cw.v();
                    VDTT_cw.bl(var1);
                    return;
                case 91:
                    VDTT_cw.v();
                    VDTT_cw.bm(var1);
                    return;
                case 108:
                    VDTT_cw.v().aY(var1);
                    return;
                case 45:
                    VDTT_cw.v().aT(var1);
                    return;
                case -1:
                    VDTT_cw.v().aK(var1);
                    return;
                case -33:
                    VDTT_cw.v().bc(var1);
                    return;
                case 3:
                    VDTT_cw.v().bb(var1);
                    return;
                case -102:
                    var10000 = VDTT_cw.v();
                    var3 = var1;
                    var2 = var10000;

                    try {
                        VDTT_ek.m();
                        VDTT_ek.a(var3, VDTT_ek.m().aR);
                        VDTT_ek.m();
                        VDTT_ek.a(var3, VDTT_ek.m().aS);
                        if ((var46 = var2.d()) instanceof VDTT_kb) {
                            VDTT_kb var70;
                            (var65 = var70 = (VDTT_kb) var46).Z = -1;
                            var65.aa = 0;
                        }
                        break;
                    } catch (Exception var26) {
                        VDTT_jb.a(var26);
                        return;
                    }
                case 58:
                    VDTT_cw.v();
                    var3 = var1;

                    try {
                        var43 = var3.f();
                        (var50 = VDTT_ek.m().aP[var43]).t = true;
                        VDTT_ek.m().aP[var43] = null;
                        if (var50.i()) {
                            if ((var6 = VDTT_ek.m().aS[var50.getItemTemplate().f]) != null) {
                                var6.f = var50.f;
                                VDTT_ek.m().aP[var43] = var6;
                            }

                            var50.f = var50.getItemTemplate().f;
                            VDTT_ek.m().aS[var50.f] = var50;
                        }
                        break;
                    } catch (Exception var24) {
                        VDTT_jb.a(var24);
                        return;
                    }
                case -39:
                    VDTT_cw.v();
                    var3 = var1;

                    try {
                        var44 = var3.readByte();
                        var54 = var3.f();
                        var6 = VDTT_ek.m().aS[var44];
                        VDTT_ek.m().aS[var44] = null;
                        VDTT_ek.m().aP[var54] = var6;
                        VDTT_ek.m().aP[var54].f = var54;
                        VDTT_ek.m();
                        break;
                    } catch (Exception var36) {
                        VDTT_jb.a(var36);
                        return;
                    }
                case 27:
                    VDTT_cw.v().ba(var1);
                    return;
                case -5:
                    VDTT_cw.v().aJ(var1);
                    return;
                case -58:
                    VDTT_cw.v().aH(var1);
                    return;
                case 54:
                    VDTT_cw.v().aI(var1);
                    return;
                case 102:
                    VDTT_cw.v().aZ(var1);
                    return;
                case 9:
                    VDTT_cw.v().aF(var1);
                    return;
                case 83:
                    VDTT_cw.v().av(var1);
                    return;
                case 113:
                    VDTT_cw.v().aw(var1);
                    return;
                case 10:
                    VDTT_cw.v().ag(var1);
                    return;
                case -45:
                    VDTT_cw.v().as(var1);
                    return;
                case -56:
                    VDTT_cw.v().ar(var1);
                    return;
                case 49:
                    VDTT_cw.v().an(var1);
                    return;
                case -35:
                    VDTT_cw.v().ak(var1);
                    return;
                case -95:
                    VDTT_cw.v().o(var1);
                    return;
                case 82:
                    VDTT_cw.v().n(var1);
                    return;
                case 25:
                    VDTT_cw.v().aj(var1);
                    return;
                case -43:
                    VDTT_cw.v();
                    VDTT_cw.ad(var1);
                    return;
                case -14:
                    VDTT_cw.v();
                    VDTT_cw.b(var1, VDTT_ek.m(), false);
                    return;
                case 0:
                    VDTT_cw.v();
                    VDTT_cw.b(var1, VDTT_ek.m());
                    return;
                case 90:
                    VDTT_cw.v();
                    VDTT_cw.a(var1, VDTT_ek.m(), false);
                    return;
                case -118:
                    VDTT_cw.v();
                    VDTT_cw.a(var1, VDTT_ek.m());
                    return;
                case -61:
                    VDTT_cw.v();
                    VDTT_cw.b(var1, (VDTT_ek) null, false);
                    return;
                case 21:
                    VDTT_cw.v();
                    VDTT_cw.b(var1, (VDTT_ek) null);
                    return;
                case 94:
                    VDTT_cw.v();
                    VDTT_cw.a(var1, (VDTT_ek) null, false);
                    return;
                case 104:
                    VDTT_cw.v();
                    VDTT_cw.a((Message) var1, (VDTT_ek) null);
                    return;
                case 59:
                    VDTT_cw.v().Z(var1);
                    return;
                case -67:
                    VDTT_cw.v().ab(var1);
                    return;
                case -37:
                    VDTT_cw.v().aa(var1);
                    return;
                case 35:
                    VDTT_cw.v().U(var1);
                    return;
                case -100:
                    VDTT_cw.v().Y(var1);
                    return;
                case -50:
                    VDTT_cw.v().X(var1);
                    return;
                case -27:
                    VDTT_cw.v().W(var1);
                    return;
                case -20:
                    VDTT_cw.v().V(var1);
                    return;
                case -24:
                    VDTT_cw.v().Q(var1);
                    return;
                case -40:
                    var2 = VDTT_cw.v();

                    try {
                        if ((var46 = var2.d()) instanceof VDTT_mz) {
                            VDTT_mz var64;
                            (var64 = (VDTT_mz) var46).P = 2;
                        }
                        break;
                    } catch (Exception var33) {
                        return;
                    }
                case 39:
                    VDTT_cw.v().R(var1);
                    return;
                case -6:
                    VDTT_cw.v().P(var1);
                    return;
                case 32:
                    var10000 = VDTT_cw.v();
                    var3 = var1;
                    var2 = var10000;

                    try {
                        if (var2.b.lastElement() instanceof VDTT_nn && var2.ds.lastElement() != null && ((VDTT_fs) var2.ds.lastElement()).k.c == 223) {
                            MenuConfig.K();
                        }

                        var53 = var3.j();
                        DataCenter.d().e().a("'" + var53 + Caption.hT, Caption.bY, 2998, 2999, var2);
                        break;
                    } catch (Exception var32) {
                        return;
                    }
                case 60:
                    VDTT_cw.v().O(var1);
                    return;
                case 15:
                    VDTT_cw.v();
                    VDTT_cw.N(var1);
                    return;
                case 89:
                    VDTT_cw.v();
                    VDTT_cw.J(var1);
                    return;
                case 4:
                    VDTT_cw.v();
                    VDTT_cw.K(var1);
                    return;
                case -76:
                    VDTT_cw.v();
                    VDTT_cw.L(var1);
                    return;
                case 76:
                    VDTT_cw.v();
                    VDTT_cw.M(var1);
                    return;
                case -11:
                    VDTT_cw.v().b(var1, false);
                    return;
                case -22:
                    VDTT_cw.v().G(var1);
                    return;
                case 42:
                    VDTT_cw.v().F(var1);
                    return;
                case 115:
                    VDTT_cw.v().E(var1);
                    return;
                case 1:
                    VDTT_cw.v().D(var1);
                    return;
                case -17:
                    VDTT_cw.v().C(var1);
                    return;
                case -117:
                    VDTT_cw.v().bn(var1);
                    return;
                case -72:
                    VDTT_cw.v().br(var1);
                    return;
                case -59:
                    VDTT_cw.v().y(var1);
                    return;
                case -48:
                    VDTT_cw.v().w(var1);
                    return;
                case 23:
                    VDTT_cw.v().A(var1);
                    return;
                case 111:
                    VDTT_cw.v().t(var1);
                    return;
                case 101:
                    VDTT_cw.v().s(var1);
                    return;
                case -51:
                    var10000 = VDTT_cw.v();
                    var3 = var1;
                    var2 = var10000;

                    try {
                        (var49 = new Item()).a(var3);
                        var5 = var49.M();
                        if (VDTT_ek.m().aP[var49.f] != null) {
                            var5 -= VDTT_ek.m().aP[var49.f].M();
                        }

                        VDTT_ek.m().aP[var49.f] = var49;
                        if (var49.h == 0L) {
                            VDTT_ek.m().aP[var49.f] = null;
                        } else {
                            VDTT_cw.a(var5, var49);
                        }

                        if (var2.cB) {
                            var2.cB = false;
                            var49.v = new VDTT_ev(541, 0, 0, 1);
                            VDTT_ac.b().r();
                        }
                        break;
                    } catch (Exception var27) {
                        return;
                    }
                case 100:
                    var10000 = VDTT_cw.v();
                    var3 = var1;
                    var2 = var10000;

                    try {
                        if ((var46 = var2.d()) instanceof VDTT_kb) {
                            ((VDTT_kb) var46).O = false;
                        }

                        var54 = var3.f();
                        VDTT_ek.m();
                        VDTT_ek.m().aP[var54] = null;
                        break;
                    } catch (Exception var30) {
                        return;
                    }
                case 109:
                    VDTT_cw.v().m(var1);
                    return;
                case -10:
                    VDTT_cw.v();
                    var3 = var1;

                    try {
                        var44 = var3.readByte();
                        Item[] var59 = new Item[VDTT_ek.m().j(var3.f())];
                        var67 = VDTT_ek.m().aT[var44];
                        VDTT_ek.m().aT[var44] = null;
                        VDTT_cw.a(VDTT_ek.m().aP);

                        for (var42 = 0; var42 < var59.length; ++var42) {
                            if (VDTT_ek.m().aP[var42] == null) {
                                var67.f = var42;
                                var59[var42] = var67;
                                break;
                            }

                            var59[var42] = VDTT_ek.m().aP[var42];
                        }

                        VDTT_ek.m().aP = var59;
                        break;
                    } catch (Exception var38) {
                        return;
                    }
                case -7:
                    var10000 = VDTT_cw.v();
                    var3 = var1;
                    var2 = var10000;

                    try {
                        var46 = var2.d();
                        byte var52 = var3.readByte();
                        short var56 = var3.f();
                        var67 = VDTT_ek.m().aR[var52];
                        VDTT_ek.m().aR[var52] = null;
                        VDTT_ek.m().aP[var56] = var67;
                        VDTT_ek.m().aP[var56].f = var56;
                        VDTT_ek.m();
                        if (var46 instanceof VDTT_kb) {
                            VDTT_kb var41;
                            (var41 = (VDTT_kb) var46).O = false;
                        }
                        break;
                    } catch (Exception var25) {
                        return;
                    }
                case 65:
                    VDTT_cw.v();
                    VDTT_cw.l(var1);
                    return;
                case -74:
                    VDTT_cw.v();
                    VDTT_cw.k(var1);
                    return;
                case 8:
                    var10000 = VDTT_cw.v();
                    var3 = var1;
                    var2 = var10000;

                    try {
                        var43 = var3.f();
                        (var50 = VDTT_ek.m().aP[var43]).t = var3.c();
                        VDTT_ek.m().aP[var43] = null;
                        if (var50.i()) {
                            if ((var6 = VDTT_ek.m().aR[var50.getItemTemplate().f]) != null) {
                                var6.f = var50.f;
                                VDTT_ek.m().aP[var43] = var6;
                            }

                            var50.f = var50.getItemTemplate().f;
                            VDTT_ek.m().aR[var50.f] = var50;
                            VDTT_ek.m().ax = (byte) (VDTT_ek.m().aR[10] != null ? 50 : -1);
                        } else {
                            var50.c(var3.i());
                            VDTT_ek.m().aP[var43] = var50;
                        }

                        if ((var55 = var2.d()) instanceof VDTT_kb) {
                            VDTT_kb var66;
                            (var66 = (VDTT_kb) var55).O = false;
                            if (var2.br == 1 && var2.bs == 2) {
                                var2.cL.addElement(var50.getItemTemplate().f);
                            }
                        }
                        break;
                    } catch (Exception var23) {
                        VDTT_jb.a(var23);
                        return;
                    }
                case -2:
                    VDTT_cw.v();
                    var3 = var1;

                    try {
                        if ((var44 = var3.readByte()) == 0) {
                            VDTT_cw.a(VDTT_ek.m().aP);
                            return;
                        }

                        if (var44 == 1) {
                            VDTT_cw.a(VDTT_ek.m().aQ);
                        }
                        break;
                    } catch (Exception var22) {
                        return;
                    }
                case 36:
                    VDTT_cw.v();
                    VDTT_cw.i(var1);
                    return;
                case -62:
                    VDTT_cw.v();
                    VDTT_cw.h(var1);
                    return;
                case 22:
                    VDTT_cw.v();
                    var3 = var1;

                    try {
                        var43 = var3.f();

                        for (var5 = 0; var5 < var43; ++var5) {
                            (var6 = new Item()).a(var3);
                            var7 = var6.M();
                            if (VDTT_ek.m().aP[var6.f] != null) {
                                var7 -= VDTT_ek.m().aP[var6.f].M();
                            }

                            VDTT_ek.m().aP[var6.f] = var6;
                            if (var6.h == 0L) {
                                VDTT_ek.m().aP[var6.f] = null;
                            } else {
                                VDTT_cw.a(var7, var6);
                            }
                        }

                        return;
                    } catch (Exception var39) {
                        return;
                    }
                case -18:
                    var10000 = VDTT_cw.v();
                    var3 = var1;
                    var2 = var10000;

                    try {
                        VDTT_ek.m().ak = var3.i();
                        VDTT_ek.m().al = var3.i();
                        VDTT_ek.m().an = var3.i();
                        VDTT_ek.m().am = var3.i();
                        var43 = var3.f();

                        for (var5 = 0; var5 < var43; ++var5) {
                            (var6 = new Item()).a(var3);
                            var7 = var6.M();
                            if (VDTT_ek.m().aP[var6.f] != null) {
                                var7 -= VDTT_ek.m().aP[var6.f].M();
                            }

                            VDTT_ek.m().aP[var6.f] = var6;
                            if (var6.h == 0L) {
                                VDTT_ek.m().aP[var6.f] = null;
                            } else {
                                VDTT_cw.a(var7, var6);
                            }
                        }

                        if ((var47 = var2.d()) instanceof VDTT_jw) {
                            var2.a(var47.e);
                            return;
                        }

                        VDTT_lq var48;
                        if (var47 instanceof VDTT_lq && (var48 = (VDTT_lq) var47).T != null) {
                            var48.T.a(true);
                        }
                        break;
                    } catch (Exception var37) {
                        return;
                    }
                case -68:
                    VDTT_cw.v().f(var1);
                    return;
                case -89:
                    if ((var4 = VDTT_cw.v().k(var1.i())) != null) {
                        var4.a(var1.f(), var1.f(), false);
                    }

                    return;
                case 6:
                    VDTT_cw.v().aW(var1);
                    return;
                case 31:
                    VDTT_ek.m().S();
                    return;
            }

        } catch (Exception var40) {
            VDTT_jb.a(var40, "cons: " + var1.a);
        }
    }

    private static void b(Message var0) {
        try {
            switch (var0.a) {
                case -128:
                    DataCenter.d().f = true;
                    DataCenter.d().ai.a(VDTT_da.a(var0.b.b()));
                    break;
                case -126:
                    DataCenter.d().ai.a(4);
                default:
                    return;
            }
        } catch (Exception var2) {
            VDTT_jb.a(var2, "cons: " + var0.a);
        }

    }

    private static void c(Message var0) {
        try {
            switch (var0.a) {
                case -128:
                    DataCenter.d().aE = DataCenter.d().aC.a;
                    DataCenter.d().aF = VDTT_ek.m().b;
                    VDTT_ek.m();
                    int var1 = VDTT_ek.m().w();

                    try {
                        DataCenter.d().aE = var0.readByte();
                        DataCenter.d().aF = var0.i();
                        var0.b.c();
                        var1 = var0.i();
                    } catch (Exception var3) {
                    }

                    if (VDTT_d.g().g != null) {
                        VDTT_d.g();
                        (new StringBuilder()).append(DataCenter.d().aE);
                        (new StringBuilder()).append(DataCenter.d().aF);
                        (new StringBuilder()).append(var1);
                    }
                default:
            }
        } catch (Exception var4) {
            VDTT_jb.a(var4, "cons: " + var0.a);
        }
    }

    private void onMessage(Message var1) {
        try {
            switch (var1.a) {
                case -127:
                    VDTT_cw.readPet(var1);
                    break;
                case -125:
                    DataCenter.d().readSkill(var1);
                    break;
                case -120:
                    VDTT_cw.v().readAnimationPetAttack(var1);
                    //  listAnimationPetAttack.add(new AnimationPetAttack(VDTT_cw.v().bg, VDTT_ek.m(), 580, 663, 2));
                    break;
            //    case -118:
                case -117:
                    VDTT_cw.v().readMobPetChar(var1);
                    break;
                case -115:
                case -114:
                case -110:
                case -108:
                case -106:
                case -103:
                case -102:
                case -101:
                case -100:
                case -99:
                case -98:
                case -97:
                case -96:
                case -95:
                case -94:
                case -93:
                case -92:
                case -91:
                case -90:
                case -89:
                case -88:
                case -87:
                case -84:
                case -83:
                case -82:
                case -81:
                case -74:
                case -71:
                case -68:
                case -66:
                case -65:
                case -64:
                case -63:
                case -62:
                case -54:
                case -53:
                case -52:
                case -51:
                case -50:
                case -49:
                case -48:
                case -38:
                case -34:
                case -32:
                case -23:
                case -20:
                case -18:
                case -15:
                case -12:
                case -11:
                case -9:
                case -7:
                case -4:
                case -3:
                case 5:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 18:
                case 21:
                case 24:
                default:
                    break;
                case -126:
                    VDTT_cf var7;
                    (var7 = VDTT_cq.v()).b(1000);
                    DataCenter.d().ai = var7;
                    return;
                case -124:
                    ((VDTT_cq) DataCenter.d().ai).a(VDTT_jy.w().a, VDTT_jy.w().b, true);
                    return;
                case -123:
                    DataCenter.d().ai.a((MainScreen) (new VDTT_jd(var1.j(), DataCenter.d().ai)));
                    return;
                case -122:
                    VDTT_da.a(true);
                    return;
                case -121:
                    Gdx.net.openURI(var1.b.c());
                    return;
                case -119:
                    VDTT_cw.v().b(var1);
                    return;
                case -116:
                    return;
                case -113:
                    DataCenter.d().ai.h();
                    return;
                case -112:
                    onMessage();
                    return;
                case -111:
                    e();
                    return;
                case -109:
                    if (DataCenter.d().ai.c instanceof VDTT_kb) {
                        VDTT_bd var10000 = ((VDTT_kb) DataCenter.d().ai.c).X;
                        boolean var3 = var1.c();
                        var10000.m = var3;
                        return;
                    }
                    break;
                case -107:
                    VDTT_cw.v().ch = var1.readByte();
                    return;
                case -105:
                    VDTT_cw.v().aQ(var1);
                    return;
                case -104:
                    VDTT_cw.v().aP(var1);
                    return;
                case -86:
                    VDTT_cw.v().cd(var1);
                    return;
                case -85:
                    e(var1);
                    return;
                case -80:
                    VDTT_cw.v().bQ = var1.h();
                    VDTT_cw.v().bR = var1.i();
                    VDTT_cw.v().bY = var1.c();

                    try {
                        VDTT_cw.v().cr = var1.readByte();
                    } catch (Exception var4) {
                    }

                    if (VDTT_cw.v().C().d == 8 && VDTT_cw.v().cr > 3) {
                        VDTT_cw.v().a(true);
                        return;
                    }
                    break;
                case -79:
                    VDTT_cw.v().bZ = var1.c();
                    return;
                case -78:
                    VDTT_jb.a = var1.h() - System.currentTimeMillis();
                    return;
                case -77:
                    VDTT_cw.v().M();
                    return;
                case -76:
                    VDTT_d.g();
                    VDTT_d.n();
                    return;
                case -75:
                    VDTT_cw.v().bN(var1);
                    return;
                case -73:
                    VDTT_cw.v();
                    VDTT_cw.ae(var1);
                    return;
                case -72:
                    VDTT_cw.v().bO(var1);
                    return;
                case -70:
                    VDTT_cw.v();
                    VDTT_cw.bP(var1);
                    return;
                case -69:
                    VDTT_cw.v();
                    return;
                case -67:
                    VDTT_ek.m().aA = var1.readByte();
                    MainScreen var2;
                    if ((var2 = VDTT_cw.v().c) instanceof VDTT_kb) {
                        VDTT_kb var6;
                        (var6 = (VDTT_kb) var2).au = null;
                        return;
                    }
                    break;
                case -61:
                    VDTT_cw.v();
                    VDTT_cw.bQ(var1);
                    return;
                case -60:
                    VDTT_cw.v();
                    VDTT_cw.bR(var1);
                    return;
                case -59:
                    VDTT_cw.v().bS(var1);
                    return;
                case -58:
                    VDTT_cw.v().bo(var1);
                    return;
                case -57:
                    if (DataCenter.d().ai.c instanceof VDTT_mx) {
                        ((VDTT_mx) DataCenter.d().ai.c).a(var1);
                        return;
                    }
                    break;
                case -56:
                    VDTT_cw.v().bT(var1);
                    return;
                case -55:
                    if (DataCenter.d().ai.c instanceof VDTT_mp) {
                        ((VDTT_mp) DataCenter.d().ai.c).a(var1);
                        return;
                    }
                    break;
                case -47:
                    VDTT_cw.v().cg(var1);
                    return;
                case -46:
                    VDTT_cw.v().bW(var1);
                    return;
                case -45:
                    VDTT_cw.v().cc(var1);
                    return;
                case -44:
                    VDTT_cw.v().ce(var1);
                    return;
                case -43:
                    VDTT_cw.v().z(var1);
                    return;
                case -42:
                    VDTT_cw.v().bX(var1);
                    return;
                case -41:
                    VDTT_cw.v().cb(var1);
                    return;
                case -40:
                    VDTT_cw.v().bY(var1);
                    return;
                case -39:
                    VDTT_cw.v().r(var1);
                    return;
                case -37:
                    VDTT_ek.m().c(var1.f(), var1.f());
                    return;
                case -36:
                    VDTT_cw.v().ah = var1.i();
                    if (VDTT_jb.c() > VDTT_cw.v().ah) {
                        VDTT_cw.v().cI = -1;
                        VDTT_cw.v().cJ = "";
                        return;
                    }
                    break;
                case -35:
                    VDTT_cw.v();
                    VDTT_cw.ca(var1);
                    return;
                case -33:
                    VDTT_cw.v().bZ(var1);
                    return;
                case -31:
                    DataCenter.d().aP = true;
                    return;
                case -30:
                    VDTT_au.a(var1.c(), var1.b.c());
                    return;
                case -29:
                    VDTT_cw.v().ci(var1);
                    return;
                case -28:
                    VDTT_cw.v().ch(var1);
                    return;
                case -27:
                    VDTT_cw.v().cW = var1.i();
                    return;
                case -26:
                    VDTT_cw.v().cV = var1.readByte();
                    return;
                case -25:
                    VDTT_cw.v().v(var1);
                    return;
                case -24:
                    VDTT_cw.v().cX = var1.i();
                    VDTT_cw.v().cY = var1.i();
                    return;
                case -22:
                    VDTT_cw.v().j(var1);
                    return;
                case -21:
                    VDTT_cw.v().cj(var1);
                    return;
                case -19:
                    VDTT_cw.v().ai(var1);
                    return;
                case -17:
                    VDTT_cw.v().dl = var1.h();
                    VDTT_cw.v().ab();
                    return;
                case -16:
                    VDTT_cw.v().ck(var1);
                    return;
                case -14:
                    VDTT_cw.v().e(var1);
                    return;
                case -13:
                    VDTT_cw.v().d(var1);
                    return;
                case -10:
                    if (VDTT_cw.v().c instanceof VDTT_ki) {
                        VDTT_cw.v().a((MainScreen) (new VDTT_mv(VDTT_cw.v())));
                        return;
                    }
                    break;
                case -8:
                    VDTT_d.g();
                    VDTT_d.i();
                    return;
                case -6:
                    VDTT_cw.v().dk = var1.readByte();
                    return;
                case -5:
                    VDTT_cw.v().aS(var1);
                    return;
                case -2:
                    VDTT_cw.v().aR(var1);
                    return;
                case -1:
                    if (System.currentTimeMillis() - this.d < 2000L) {
                        return;
                    }

                    this.d = System.currentTimeMillis();
                    DataCenter.d().ai.c(Caption.wc, -2560);
                    return;
                case 0:
                    if (System.currentTimeMillis() - this.d < 2000L) {
                        return;
                    }

                    this.d = System.currentTimeMillis();
                    DataCenter.d().ai.c(VDTT_jb.a(Caption.wd, (long) var1.g()), -1);
                    return;
                case 1:
                    if (System.currentTimeMillis() - this.d < 2000L) {
                        return;
                    }

                    this.d = System.currentTimeMillis();
                    VDTT_cw.v().cl(var1);
                    return;
                case 2:
                    if (System.currentTimeMillis() - this.d < 2000L) {
                        return;
                    }

                    this.d = System.currentTimeMillis();
                    VDTT_cw.v();
                    VDTT_cw.cm(var1);
                    return;
                case 3:
                    VDTT_cw.v().aB(var1);
                    return;
                case 4:
                    VDTT_cw.v().cn(var1);
                    return;
                case 6:
                    VDTT_cw.v().co(var1);
                    return;
                case 7:
                    VDTT_cw.v().cp(var1);
                    return;
                case 9:
                    VDTT_cw.v().cq(var1);
                    return;
                case 16:
                    DataCenter.d();
                    VDTT_p.a(var1.b.c(), var1.b.b(), var1.a);
                    return;
                case 17:
                    VDTT_cw.v().ag();
                    return;
                case 19:
                    VDTT_cw.v().cr(var1);
                    break;
                case 20:
                    VDTT_cw.v();
                    VDTT_cw.cs(var1);
                    return;
                case 22:
                    VDTT_cw.v();
                    VDTT_cw.g(var1);
                    return;
                case 23:
                    VDTT_cw.v().ct(var1);
                    return;
                case 25:
                    VDTT_ek.m().bJ = var1.f();
                    return;
                /*
                     listAnimationPetAttack.add(new AnimationPetAttack(VDTT_cw.v().bg,VDTT_ek.m(),580,663,2) );
                 */
            }

        } catch (Exception var5) {
            VDTT_jb.a(var5, "cons: " + var1.a);
        }
    }

    private static void e(Message var0) {//-123 => -85 nhé
        try {
            short var1 = var0.f();//này là readShort nhé
            int var4 = var0.i();//con này là readInt
            if (var0.b.a.available() == 0) {//của tvm x1 
                MainScreen var2;
                if ((var2 = DataCenter.d().ai.c) instanceof VDTT_kt) {
                    VDTT_kt var5;
                    (var5 = (VDTT_kt) var2).b(var1, var4);
                } else if ((var2 = DataCenter.d().ai.c) instanceof VDTT_kt2) {
                    VDTT_kt2 var5;
                    (var5 = (VDTT_kt2) var2).b(new int[]{var1}, new int[]{var4});
                }
            } else {// này là của tvm x5, không cần send lenght 5, chỉ cần send đúng 5 cái data là được
                int[] data = new int[5];
                int[] data2 = new int[5];
                data[0] = var1;
                data2[0] = var4;
                for (int i = 1; i < 5; i++) {
                    try {
                        data[i] = var0.f();
                        data2[i] = var0.i();
                    } catch (Exception ex) {
                        data[i] = -1;
                        data2[i] = -1;
                    }
                }
                MainScreen var2;
                if ((var2 = DataCenter.d().ai.c) instanceof VDTT_kt) {
                    VDTT_kt var5;
                    (var5 = (VDTT_kt) var2).b(data, data2);
                } else if ((var2 = DataCenter.d().ai.c) instanceof VDTT_kt2) {
                    VDTT_kt2 var5;
                    (var5 = (VDTT_kt2) var2).b(data, data2);
                }
            }

        } catch (Exception var3) {
            var3.printStackTrace();
        }
    }

    private static void onMessage() {
        VDTT_p var0 = DataCenter.d().ai;

        for (int var1 = 0; var1 < var0.b.size(); ++var1) {
            if (var0.b.get(var1) instanceof VDTT_ma) {
                ((VDTT_ma) var0.b.get(var1)).w();
                return;
            }
        }

    }

    private static void e() {
        VDTT_p var0 = DataCenter.d().ai;

        for (int var1 = 0; var1 < var0.b.size(); ++var1) {
            if (var0.b.get(var1) instanceof VDTT_kl) {
                ((VDTT_kl) var0.b.get(var1)).k();
                return;
            }
        }

    }

    private void f(Message var1) {
        try {
            String var6;
            switch (var1.a) {
                case -128:
                    if (VDTT_no.d != null) {
                        VDTT_no.d.b();
                        VDTT_no.d = null;
                    }

                    g(var1);
                    DataCenter.ak = false;
                    return;
                case -127:
                    VDTT_cw var7 = VDTT_cw.v();
                    var6 = null;
                    var7.db = null;
                    VDTT_cf.d.clear();
                    VDTT_ek.m().b(var1);
                    VDTT_cw.v().A();
                    MenuConfig.L();
                    VDTT_l.a = System.currentTimeMillis();
                    return;
                case -126:
                    Gdx.net.openURI(var1.j());
                    VDTT_d.g();
                    VDTT_d.i();
                    return;
                case -125:
                case -123:
                case -122:
                case -121:
                case -120:
                case -118:
                default:
                    break;
                case -124:
                    a(var1.j());
                    break;
                case -119:
                    DataCenter.d().aE = DataCenter.d().aC.a;
                    DataCenter.d().aF = VDTT_ek.m().b;
                    VDTT_ek.m();
                    int var2 = VDTT_ek.m().w();

                    try {
                        DataCenter.d().aE = var1.i();
                        DataCenter.d().aF = var1.i();
                        var1.b.c();
                        var2 = var1.i();
                    } catch (Exception var4) {
                    }

                    if (VDTT_d.g().g != null) {
                        VDTT_d.g();
                        (new StringBuilder()).append(DataCenter.d().aE);
                        (new StringBuilder()).append(DataCenter.d().aC.b);
                        (new StringBuilder()).append(DataCenter.d().aF);
                        (new StringBuilder()).append(var2);
                    }

                    if (Gdx.app.getType() == ApplicationType.Desktop) {
                        VDTT_d var10000 = VDTT_d.g();
                        var6 = VDTT_cq.y().J.i();
                        var10000.k = var6;
                        var10000 = VDTT_d.g();
                        var6 = VDTT_cq.y().K.i();
                        var10000.l = var6;
                        return;
                    }
                    break;
                case -117:
                    DataCenter.ak = true;
                    return;
                case -116:
                    return;
                case -115:
                    if (Gdx.app.getType() == ApplicationType.Desktop) {
                        VDTT_d.g();
                        VDTT_d.i();
                        return;
                    }
                    break;
                case -114:
                    if (Gdx.app.getType() == ApplicationType.Desktop) {
                        c = true;
                        return;
                    }
                    break;
                case -113:
                    DataCenter.d().a(var1);
                    return;
                case -112:
                    VDTT_cw.v().bP = var1.readByte();
                    VDTT_cw.v().z();
                    DataCenter.d().c();
                    return;

            }

        } catch (Exception var5) {
            VDTT_jb.a(var5, "cons: " + var1.a);
        }
    }

    private static void a(String var0) {
        if (DataCenter.d().ai instanceof VDTT_cq) {
            ((VDTT_cq) DataCenter.d().ai).d(var0);
        }

    }

    private static void g(Message var0) {
        try {
            SelectCharScreen var1;
            (var1 = new SelectCharScreen()).readListChar(var0);
            DataCenter.d().ai = var1;
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }
}
