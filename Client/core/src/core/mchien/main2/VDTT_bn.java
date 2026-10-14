package core.mchien.main2;

import java.util.Vector;

public final class VDTT_bn extends VDTT_an {

    public VDTT_bo l;
    private int L;
    VDTT_ba[] m;
    VDTT_hs[] n;
    private VDTT_hs M;
    public Item I;
    private VDTT_ft N;
    private Vector O = new Vector();
    private boolean P;
    private int Q = -1;
    private VDTT_ba R;
    public boolean J;
    public static String K = null;

    public VDTT_bn(int var1, int var2, int var3, MainScreen var4, Item var5) {
        this.a(var1, var2, 1044, var4, var5);
    }

    public VDTT_bn(int var1, int var2, int var3, MainScreen var4, VDTT_ft var5) {
        this.N = var5;
        this.a(var1, var2, 1044, var4, var5.e);
    }

    public final void d() {
        this.O.clear();
        this.a(this.objX, this.objY, this.L, this.a, this.I);
    }

    private void a(int var1, int var2, int var3, MainScreen var4, Item var5) {
        Vector var6 = new Vector();
        if (var5 != null) {
            try {
                this.L = var3;
                this.a = var4;
                this.I = var5;
                this.f(var1, var2);
                this.d(250, 142);
                Vector var10;
                (var10 = new Vector()).add(new VDTT_ba(0, 3, 0, 0, "", var4, 100, 52));
                if (var4 instanceof VDTT_jr) {
                    VDTT_jr var12;
                    if ((var12 = (VDTT_jr) var4).x() == var12.w()) {
                        this.a(var10, var4, var12);
                    } else if (var12.x() == 0 && var12.ad > 0 && var12.ad < 5) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 164, 15));
                    }
                }

                if (var4 instanceof VDTT_mj) {
                    VDTT_mj var54;
                    if ((var54 = (VDTT_mj) var4).x() == 0) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 0, 0, Caption.aL, var4, 101, 15));
                    } else if (var54.z() == 0) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 0, 0, Caption.Ban, var4, 103, 15));
                    }
                } else if (var4 instanceof VDTT_kb) {
                    VDTT_kb var53;
                    if ((var53 = (VDTT_kb) var4).D() == 0 && var53.E() == 0 && (var5.i() || var5.getItemTemplate().f >= 17 && var5.getItemTemplate().f <= 20) && var53.V.p()) {//
                        if (var53.Y == 0) {

                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bk, var4, 105, 15));
                            if (var5.getItemTemplate().f == 10) {
                                if (var5.al()) {
                                    var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bG, var4, 170, 15));
                                } else {
                                    var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.tN, var4, 170, 15));
                                }

                                var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.xg, var4, 171, 15));
                            }

                            if (var5.r()) {
                                var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.tK, var4, 168, 15));
                            }
                        } else if (var53.Y == 1) {
                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bk, var4, 128, 15));
                            if (var5.r()) {
                                var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.tK, var4, 169, 15));
                            }
                        }
                    }

                    if (var53.D() == 1 && var5.i() && var53.V.p()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bk, var4, 105, 15));
                    }
                } else if (var4 instanceof VDTT_ju) {
                    VDTT_ju var52;
                    if ((var52 = (VDTT_ju) var4).C() == 0) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 107, 15));
                    } else if (var52.z() == 0) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bm, var4, 106, 15));
                    }
                } else if (var4 instanceof VDTT_mz) {
                    VDTT_mz var51;
                    if ((var51 = (VDTT_mz) var4).O == 0) {
                        if (var51.C() == 0) {
                            if (var51.W == 1) {
                                var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 126, 15));
                            }
                        } else if (var51.z() == 0 && !var5.t) {
                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 125, 15));
                        }
                    }
                } else if (var4 instanceof VDTT_ni) {
                    VDTT_ni var50;
                    if ((var50 = (VDTT_ni) var4).x() == 0) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 111, 15));
                    } else if (var50.z() == 0 && var5.p()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 110, 15));
                    }
                } else if (var4 instanceof VDTT_nf) {
                    VDTT_nf var49;
                    if ((var49 = (VDTT_nf) var4).x() == 0) {
                        if (var49.Q == 1 || var49.Q == 3 || var49.Q == 4) {
                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 113, 15));
                        }
                    } else if (var49.z() == 0 && var5.t()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 112, 15));
                    }
                } else if (var4 instanceof VDTT_mo) {
                    VDTT_mo var48;
                    if ((var48 = (VDTT_mo) var4).x() == 0) {
                        if (var48.Q == 1) {
                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 115, 15));
                        }
                    } else if (var48.z() == 0 && var5.B()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 114, 15));
                    }
                } else if (var4 instanceof VDTT_km) {
                    VDTT_km var47;
                    if ((var47 = (VDTT_km) var4).x() == 0) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 117, 15));
                    } else if (var47.z() == 0 && var5.E()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 116, 15));
                    }
                } else if (var4 instanceof VDTT_ng) {
                    VDTT_ng var46;
                    if ((var46 = (VDTT_ng) var4).x() == 0) {
                        if (var46.Q == 1 || var46.Q == 2) {
                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 119, 15));
                        }
                    } else if (var46.z() == 0 && var5.G()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 118, 15));
                    }
                } else if (var4 instanceof VDTT_lb) {
                    VDTT_lb var45;
                    if ((var45 = (VDTT_lb) var4).x() == 0) {
                        if (var45.Q == 1 || var45.Q == 3) {
                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 167, 15));
                        }
                    } else if (var45.z() == 0 && var5.y() && var5.s >= 14) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 166, 15));
                    }
                } else if (var4 instanceof VDTT_lt) {
                    VDTT_lt var44;
                    if ((var44 = (VDTT_lt) var4).x() == 0) {
                        if (var44.Q == 1 || var44.Q == 3) {
                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 146, 15));
                        }
                    } else if (var44.z() == 0 && var5.A()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 145, 15));
                    }
                } else if (var4 instanceof VDTT_nb) {
                    VDTT_nb var43;
                    if ((var43 = (VDTT_nb) var4).x() == 0) {
                        if (var43.Q == 1 || var43.Q == 2) {
                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 144, 15));
                        }
                    } else if (var43.z() == 0 && var5.H()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 143, 15));
                    }
                } else if (var4 instanceof VDTT_na) {
                    VDTT_na var42;
                    if ((var42 = (VDTT_na) var4).x() == 0) {
                        if (var42.Q == 1 || var42.Q == 2) {
                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 158, 15));
                        }
                    } else if (var42.z() == 0 && var5.I()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 157, 15));
                    }
                } else if (var4 instanceof VDTT_nd) {
                    VDTT_nd var41;
                    if ((var41 = (VDTT_nd) var4).x() == 0) {
                        if (var41.Q == 1 || var41.Q == 2) {
                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 160, 15));
                        }
                    } else if (var41.z() == 0 && var5.J()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 159, 15));
                    }
                } else if (var4 instanceof VDTT_nc) {
                    VDTT_nc var40;
                    if ((var40 = (VDTT_nc) var4).x() == 0) {
                        if (var40.Q == 1 || var40.Q == 2) {
                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 162, 15));
                        }
                    } else if (var40.z() == 0 && var5.K()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 161, 15));
                    }
                } else if (var4 instanceof VDTT_lq) {
                    VDTT_lq var39;
                    if ((var39 = (VDTT_lq) var4).x() < 2) {
                        if (var39.Q != 1 && var39.Q != 2) {
                            if (var39.Q == 3) {
                                var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 121, 15));
                            }
                        } else {
                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.aL, var4, 122, 15));
                            if (var39.x() == 1) {
                                var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.gr, var4, 132, 15));
                            }
                        }
                    } else if (var39.x() == 2) {
                        VDTT_lq var15;
                        if (!(var15 = (VDTT_lq) var4).I()) {
                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 0, 0, Caption.aL, var4, 101, 15));
                        }
                    } else if (var39.x() == var39.w() && var39.z() == 0 && var5.ac()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 120, 15));
                    }
                } else if (var4 instanceof VDTT_ln) {
                    VDTT_ln var38;
                    if ((var38 = (VDTT_ln) var4).x() == 1) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 124, 15));
                    } else if (var38.x() == var38.w() && var38.z() == 0 && !var5.t) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 123, 15));
                    }
                } else if (var4 instanceof VDTT_mq) {
                    VDTT_mq var37;
                    if ((var37 = (VDTT_mq) var4).x() == 0) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 130, 15));
                    } else if (var37.z() == 0) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 129, 15));
                    }
                } else if (var4 instanceof VDTT_li) {
                    VDTT_li var36;
                    if ((var36 = (VDTT_li) var4).x() == 0) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 156, 15));
                    } else if (var36.z() == 0) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 155, 15));
                    }
                } else if (var4 instanceof VDTT_jz) {
                    VDTT_jz var35;
                    if ((var35 = (VDTT_jz) var4).x() == 0) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 136, 15));
                    } else if ((var35.P == 61 || var35.P == 69) && var35.z() == 0 && var5.P() || (var35.P == 60 || var35.P == 68) && var35.z() == 0 && var5.Q() || (var35.P == 62 || var35.P == 71) && var35.z() == 0 && var5.R() || (var35.P == 63 || var35.P == 70) && var35.z() == 0 && var5.S()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 135, 15));
                    }
                } else if (var4 instanceof VDTT_kv) {
                    VDTT_kv var13;
                    if ((var13 = (VDTT_kv) var4).x() == 0) {
                        if (var13.Q == 0) {
                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 151, 15));
                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.u, var4, 152, 15));
                        }
                    } else if (var13.z() == 0 && var5.q()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 150, 15));
                    }
                } else if (var4 instanceof VDTT_mm) {
                    VDTT_mm var14;
                    if ((var14 = (VDTT_mm) var4).x() == 0) {
                        if (var14.R == 1) {
                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bn, var4, 154, 15));
                        }
                    } else if (var14.z() == 0 && var5.s()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 153, 15));
                    }
                } else if (var4 instanceof VDTT_ne) {
                    VDTT_ne var16;
                    if ((var16 = (VDTT_ne) var4).x() != 0 && var16.z() == 0 && var5.F()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 163, 15));
                    }
                } else if (var4 instanceof VDTT_ko) {
                    VDTT_ko var19;
                    if ((var19 = (VDTT_ko) var4).x() != 0 && var19.z() == 0 && var5.c == 683) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 163, 15));
                    }
                } else if (var4 instanceof VDTT_ks) {
                    VDTT_ks var21;
                    if ((var21 = (VDTT_ks) var4).x() != 0 && var21.z() == 0 && var5.c == 310) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 163, 15));
                    }
                } else if (var4 instanceof VDTT_kn) {
                    VDTT_kn var23;
                    if ((var23 = (VDTT_kn) var4).x() != 0 && var23.z() == 0 && var5.D()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 165, 15));
                    }
                } else if (var4 instanceof VDTT_kp) {
                    VDTT_kp var26;
                    if ((var26 = (VDTT_kp) var4).x() != 0 && var26.z() == 0 && var5.ab()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 163, 15));
                    }
                } else if (var4 instanceof VDTT_mn) {
                    VDTT_mn var29;
                    if ((var29 = (VDTT_mn) var4).x() != 0 && var29.z() == 0 && var5.C()) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 163, 15));
                    }
                } else if (var4 instanceof VDTT_md) {
                    VDTT_md var30;
                    if ((var30 = (VDTT_md) var4).x() != 0 && var30.z() == 0 && var5.getItemTemplate().f == 12 && var5.h != -1L) {
                        var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 163, 15));
                    }
                } else if (!(var4 instanceof VDTT_ku)) {
                    if (var4 instanceof VDTT_ki) {
                        VDTT_ki var31;
                        if ((var31 = (VDTT_ki) var4).V == 5 && var31.B() == 0) {
                            if (var31.C() == 4) {
                                var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.aL, var4, 141, 15));
                            } else if (var31.C() == 3 && var5.c != 160) {
                                var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.gs, var4, 140, 15));
                            }
                        }
                    } else if (var4 instanceof VDTT_nh) {
                        VDTT_nh var33;
                        if ((var33 = (VDTT_nh) var4).x() != 0 && var33.z() == 0 && var5.n()) {
                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 138, 15));
                        }
                    } else {
                        VDTT_jk var34;
                        if (var4 instanceof VDTT_jk && (var34 = (VDTT_jk) var4).x() != 0 && var34.z() == 0 && var5.o()) {
                            var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.bI, var4, 139, 15));
                        }
                    }
                }

                if (this.N != null) {
                    var10.add(new VDTT_ba(this.q - 51, this.r - 26, 100, 0, Caption.aL, var4, 134, 15));
                }

                if (var10.size() > 6 && this.R != null) {
                    var10.remove(this.R);
                }

                this.m = new VDTT_ba[var10.size()];

                for (var2 = 0; var2 < var10.size(); ++var2) {
                    this.m[var2] = (VDTT_ba) var10.elementAt(var2);
                    if (var2 > 0) {
                        this.m[var2].d(42, 22);
                        this.m[var2].f(this.q - 3 - 47 * var2, this.r - 26);
                    }
                }

                if (var4 instanceof VDTT_jw || this.m.length <= 1 && !var5.i()) {
                    this.d(220, 120);
                }

                this.m[0].f(this.q - 17, 3);
                this.n = a(this.m);
                if (var5.i() || var5.s > 0) {
                    this.O.addElement(new VDTT_fw("", -1, -16777216));
                }

                String var55;
                if (var5.h >= 0L) {
                    var55 = Caption.gt;
                    if (var5.c == 655) {
                        var55 = Caption.qP;
                    }

                    VDTT_jr var20;
                    if (var4 instanceof VDTT_mj) {
                        if ((var20 = (VDTT_jr) var4).x() == 0) {
                            this.O.addElement(new VDTT_fw(var55 + var5.N(), -2560, -16777216));
                        } else {
                            this.O.addElement(new VDTT_fw(var55 + var5.O(), -2560, -16777216));
                        }
                    } else if (var4 instanceof VDTT_lq) {
                        if ((var20 = (VDTT_jr) var4).x() == 2) {
                            this.O.addElement(new VDTT_fw(var55 + var5.N(), -2560, -16777216));
                        } else {
                            this.O.addElement(new VDTT_fw(var55 + var5.O(), -2560, -16777216));
                        }
                    } else if (!(var4 instanceof VDTT_jw) && !(var4 instanceof VDTT_jv) && !(var4 instanceof VDTT_lv) && !(var4 instanceof VDTT_ly) && !(var4 instanceof VDTT_mx) && !(var4 instanceof VDTT_mr) && !(var4 instanceof VDTT_my) && !(var4 instanceof VDTT_mp)) {
                        if (var4 instanceof VDTT_ki) {
                            VDTT_ki var17;
                            if ((var17 = (VDTT_ki) var4).C() == 4) {
                                this.O.addElement(new VDTT_fw(var55 + var5.N(), -2560, -16777216));
                            } else {
                                this.O.addElement(new VDTT_fw(var55 + var5.O(), -2560, -16777216));
                            }
                        } else {
                            this.O.addElement(new VDTT_fw(var55 + var5.O(), -2560, -16777216));
                        }
                    } else {
                        this.O.addElement(new VDTT_fw(var55 + var5.N(), -2560, -16777216));
                    }
                }

                if (var5.getItemTemplate().g > 0 && var5.getItemTemplate().g - 1 != VDTT_ek.m().m) {
                    Vector var10000 = this.O;
                    StringBuilder var10003 = (new StringBuilder()).append(Caption.gu);
                    DataCenter.d();
                    var10000.addElement(new VDTT_fw(var10003.append(DataCenter.c(var5.getItemTemplate().g - 1)).toString(), -65536, -16777216));
                }

                if (var5.getItemTemplate().i > 1 && !var5.aa()) {
                    if (VDTT_ek.m().w() < var5.getItemTemplate().i) {
                        this.O.addElement(new VDTT_fw(Caption.bu + DataCenter.d().a((int) var5.getItemTemplate().i), -65536, -16777216));
                    } else {
                        this.O.addElement(new VDTT_fw(Caption.bu + DataCenter.d().a((int) var5.getItemTemplate().i), -1, -16777216));
                    }
                }

                if (var5.getItemTemplate().j > 0) {
                    if (VDTT_ek.m().ao < var5.getItemTemplate().j) {
                        this.O.addElement(new VDTT_fw(Caption.gx + var5.getItemTemplate().j, -65536, -16777216));
                    } else {
                        this.O.addElement(new VDTT_fw(Caption.gx + var5.getItemTemplate().j, -1, -16777216));
                    }
                }

                if (var5.getItemTemplate().e < 2 && var5.getItemTemplate().e != VDTT_ek.m().au) {
                    this.O.addElement(new VDTT_fw(Caption.gy + Caption.yO[var5.getItemTemplate().e], -65536, -16777216));
                }

                if (!var5.aa()) {
                    if (var5.t) {
                        this.O.addElement(new VDTT_fw(Caption.gA, -1, -16777216));
                    } else {
                        this.O.addElement(new VDTT_fw(Caption.gB, -1, -16777216));
                    }

                    if (var5.getItemTemplate().d && var5.h == -1L) {
                        this.O.addElement(new VDTT_fw(Caption.gE, -1, -16777216));
                    } else if (!var5.i()) {
                        this.O.addElement(new VDTT_fw(Caption.qU, -9942667, -16777216));
                    }
                }

                if (var5.r > 0) {
                    var55 = "";
                    boolean var11;
                    if (var4 instanceof VDTT_jw) {
                        VDTT_jw var24 = (VDTT_jw) var4;
                        var11 = true;
                        switch (var24.a) {
                            case 18:
                                var55 = Caption.lF;
                                break;
                            case 32:
                                var55 = Caption.lH;
                                break;
                            case 33:
                                var55 = Caption.lI;
                                break;
                            case 35:
                                var55 = Caption.xa;
                                break;
                            case 36:
                                var55 = Caption.lG;
                                break;
                            case 38:
                                var55 = Caption.lJ;
                                break;
                            default:
                                var11 = false;
                        }

                        if (var11) {
                            this.O.addElement(new VDTT_fw(VDTT_jb.b(var55, VDTT_jb.c(var5.r)), -16711681, -16777216));
                        }
                    } else if (var4 instanceof VDTT_mj) {
                        VDTT_mj var27 = (VDTT_mj) var4;
                        var11 = true;
                        switch (var27.P) {
                            case 18:
                                var55 = Caption.lF;
                                break;
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
                            case 31:
                            case 34:
                            case 37:
                            default:
                                var11 = false;
                                break;
                            case 30:
                                var55 = Caption.xR;
                                break;
                            case 32:
                                var55 = Caption.lH;
                                break;
                            case 33:
                                var55 = Caption.lI;
                                break;
                            case 35:
                                var55 = Caption.xa;
                                break;
                            case 36:
                                var55 = Caption.lG;
                                break;
                            case 38:
                                var55 = Caption.lJ;
                        }

                        if (var11) {
                            this.O.addElement(new VDTT_fw(VDTT_jb.b(var55, VDTT_jb.c(var5.r)), -16711681, -16777216));
                        }
                    }
                }

                if (this.N != null) {
                    this.O.addElement(new VDTT_fw(Caption.gF + VDTT_jb.c(this.N.c), -2560, -16777216));
                } else if (var5.c() > 0) {
                    this.O.addElement(new VDTT_fw(Caption.gF + VDTT_jb.c(var5.e()), -16711681, -16777216));
                } else {
                    this.O.addElement(new VDTT_fw(Caption.gG + var5.g(), -16711681, -16777216));
                }

                if (var5.getItemTemplate().c.length() > 0) {
                    String[] var56;
                    if (var5.getItemTemplate().f == 34) {
                        var56 = VDTT_dg.b(VDTT_dg.d, Caption.nP + " " + var5.getItemTemplate().b, this.q - 50);
                    } else {
                        var56 = VDTT_dg.b(VDTT_dg.d, var5.getItemTemplate().c, this.q - 50);
                    }

                    for (var3 = 0; var3 < var56.length; ++var3) {
                        this.O.addElement(new VDTT_fw(var56[var3], -1, -16777216));
                    }
                }

                if (var5.getItemTemplate().f == 15) {
                    this.O.addElement(new VDTT_fw(Caption.vD, -16751509, -16777216));
                }

                if (var5.j.length() > 0) {
                    this.O.addElement(new VDTT_fw(Caption.sx + " " + var5.j, -13139234, -16777216));
                }

                boolean var57 = false;
                Item var32 = VDTT_ek.m().aR[2];
                Item var18 = VDTT_ek.m().aR[4];
                Item var22 = VDTT_ek.m().aR[6];
                Item var7 = VDTT_ek.m().aR[8];
                if (var32 != null && var18 != null && var22 != null && var7 != null && (var32.c == 923 || var32.c == 609) && (var18.c == 924 || var18.c == 624) && (var22.c == 925 || var22.c == 639) && (var7.c == 926 || var7.c == 654)) {
                    for (var1 = 0; var1 < VDTT_ek.m().aR.length; ++var1) {
                        if (VDTT_ek.m().aR[var1] != null && VDTT_ek.m().aR[var1].equals(var5)) {
                            var57 = true;
                            break;
                        }
                    }
                }

                VDTT_gz[] var25 = var5.L();
                this.a(var25, var6, var57);
                if (var5.c == 295 || var5.c == 296 || var5.c == 297 || var5.c == 771 || var5.c == 776 || var5.c == 781 || var5.c == 786 || var5.c == 1002) {
                    try {
                        Message var28;
                        (var28 = Message.c((byte) 20)).b(var5.c);
                        var28.l();
                        return;
                    } catch (Exception var8) {
                    }
                }

            } catch (Exception var9) {
                VDTT_jb.a(var9);
            }
        }
    }

    public final void f() {
        this.P = true;
        if (this.I.getItemTemplate().f == 100) {
            this.d(220, 120);
        } else {
            this.d(250, 120);
        }

        this.M = new VDTT_hs((byte) 1, 4, 4, this.q - 22, 105, 15, 1 + this.O.size());
    }

    public final void b(Graphics var1) {
        int var2 = var1.e;
        int var3 = var1.f;
        this.c(var1);
        this.a(var1, this.M);
        if (this.N != null) {
            b(var1, this.q - 58, 3, this.N.e, false);
        } else if (this.J) {
            b(var1, this.q - 58, 3, this.I, false);
        }

        this.b(var1, 5, 7);
        if (this.I.i() || this.I.s > 0) {
            int var4 = 7;
            if (this.I.s >= 14) {
                var4 = this.I.s - 7;
            }

            for (int var5 = 0; var5 < var4; ++var5) {
                VDTT_dc.a(var1, 440, 0, 6 + var5 * 20, 22, 6);
                if (this.I.s > 0) {
                    if (this.I.s >= 15) {
                        if (var5 == this.Q) {
                            VDTT_dc.a(var1, 420, 0, 6 + var5 * 20, 22, 6);
                        } else {
                            VDTT_dc.a(var1, 440, 0, 6 + var5 * 20 + 1, 23, 6);
                            var1.c(180.0F);
                            VDTT_dc.a(var1, 432 + DataCenter.d().h / 8 % 4, 0, 6 + var5 * 20, 22, 6);
                            var1.r();
                        }
                    } else {
                        if (this.I.s >= 2 && this.I.s / 2 > var5) {
                            if (var5 == this.Q) {
                                VDTT_dc.a(var1, 420, 0, 6 + var5 * 20, 22, 6);
                            } else if (this.I.s >= 14) {
                                VDTT_dc.a(var1, 432 + DataCenter.d().h / 8 % 4, 0, 6 + var5 * 20, 22, 6);
                            } else if (this.I.s >= 12) {
                                VDTT_dc.a(var1, 430, 0, 6 + var5 * 20, 22, 6);
                            } else if (this.I.s >= 10) {
                                VDTT_dc.a(var1, 428, 0, 6 + var5 * 20, 22, 6);
                            } else if (this.I.s >= 8) {
                                VDTT_dc.a(var1, 426, 0, 6 + var5 * 20, 22, 6);
                            } else if (this.I.s >= 6) {
                                VDTT_dc.a(var1, 424, 0, 6 + var5 * 20, 22, 6);
                            } else if (this.I.s >= 4) {
                                VDTT_dc.a(var1, 422, 0, 6 + var5 * 20, 22, 6);
                            } else {
                                VDTT_dc.a(var1, 420, 0, 6 + var5 * 20, 22, 6);
                            }
                        }

                        if (this.I.s % 2 > 0 && this.I.s / 2 == var5) {
                            if (var5 == this.Q) {
                                VDTT_dc.a(var1, 421, 0, 6 + var5 * 20, 22, 6);
                            } else if (this.I.s >= 16) {
                                VDTT_dc.a(var1, 433, 0, 6 + var5 * 20, 22, 6);
                            } else if (this.I.s >= 14) {
                                VDTT_dc.a(var1, 433, 0, 6 + var5 * 20, 22, 6);
                            } else if (this.I.s >= 12) {
                                VDTT_dc.a(var1, 431, 0, 6 + var5 * 20, 22, 6);
                            } else if (this.I.s >= 10) {
                                VDTT_dc.a(var1, 429, 0, 6 + var5 * 20, 22, 6);
                            } else if (this.I.s >= 8) {
                                VDTT_dc.a(var1, 427, 0, 6 + var5 * 20, 22, 6);
                            } else if (this.I.s >= 6) {
                                VDTT_dc.a(var1, 425, 0, 6 + var5 * 20, 22, 6);
                            } else if (this.I.s >= 4) {
                                VDTT_dc.a(var1, 423, 0, 6 + var5 * 20, 22, 6);
                            } else {
                                VDTT_dc.a(var1, 421, 0, 6 + var5 * 20, 22, 6);
                            }
                        }
                    }
                }
            }
        }

        this.a(var1, 0, false);
        VDTT_gz var6;
        if (this.I.getItemTemplate().f == 99 && this.I.strOptions != null && this.I.strOptions.length() > 0 && (var6 = this.I.L()[0]).b != null && var6.b.length > 4) {
            VDTT_dc.a(var1, var6.b[4], 0, 40, (this.O.size() - 2) * this.M.h, 0);
        }

        this.a(var1);
        this.a(var1, var2, var3);
        this.M.a(var1);
        this.a(var1, this.m, var2, var3);
    }

    public final void a(Graphics var1, int var2, boolean var3) {
        int var5 = this.M.h + 8;
        if (var2 > 0) {
            var5 = this.M.h + 12;
        }

        int var6 = 0;

        for (int var7 = 0; var7 < this.O.size(); ++var7) {
            if (this.M.b(var7)) {
                VDTT_fw var4 = (VDTT_fw) this.O.elementAt(var7);
                if (var2 > 0) {
                    if (var4.b == -1 || var4.a.startsWith(Caption.iL + " ") || var4.a.contains(Caption.qU)) {
                        continue;
                    }

                    if (var6 >= var2) {
                        return;
                    }
                }

                if (var3 && var4.a.toLowerCase().startsWith(Caption.uX) || !var3) {
                    ++var6;
                    if (var4.d) {
                        VDTT_dg.d(VDTT_dg.e, var1, var4.a, 5, var5, 0, var4.b, var4.c);
                    } else {
                        VDTT_dg.d(VDTT_dg.d, var1, var4.a, 5, var5, 0, var4.b, var4.c);
                    }

                    if (var3) {
                        var5 += this.M.h;
                    }
                }
            }

            if (!var3) {
                var5 += this.M.h;
            }
        }

    }

    private void a(Vector var1, MainScreen var2, VDTT_jr var3) {
        if (this.I.getItemTemplate().i <= VDTT_ek.m().w() && (this.I.getItemTemplate().e == 2 || this.I.getItemTemplate().e == VDTT_ek.m().au)) {
            if (var3.z() == 0) {
                if (!this.I.m() || VDTT_ek.m().ao >= this.I.getItemTemplate().j) {
                    if (this.I.T()) {
                        if (this.I.getItemTemplate().f == 99 && (this.I.strOptions == null || this.I.strOptions.length() == 0)) {
                            var1.add(new VDTT_ba(this.q - 51, this.r - 26, 0, 0, Caption.gM, var2, 131, 15));
                        } else if (this.I.z()) {
                            var1.add(new VDTT_ba(this.q - 51, this.r - 26, 0, 0, Caption.xS, var2, 174, 15));
                        } else if (!this.I.i() || !(var2 instanceof VDTT_ka)) {
                            var1.add(new VDTT_ba(this.q - 51, this.r - 26, 0, 0, Caption.z, var2, 104, 15));
                        }
                    }

                    label100:
                    {
                        if (!this.I.y()) {
                            byte var10000 = this.I.getItemTemplate().f;
                            VDTT_cw.v();
                            if (var10000 != 14) {
                                var10000 = this.I.getItemTemplate().f;
                                VDTT_cw.v();
                                if (var10000 != 15) {
                                    var10000 = this.I.getItemTemplate().f;
                                    VDTT_cw.v();
                                    if (var10000 != 10) {
                                        break label100;
                                    }
                                }
                            }
                        }

                        if (!this.I.x() && !(var2 instanceof VDTT_ka)) {
                            var1.add(new VDTT_ba(this.q - 51, this.r - 26, 0, 0, Caption.gN, var2, 127, 15));
                        }
                    }

                    if ((this.I.c == 923 || this.I.c == 609) && VDTT_ek.m().aR[2] != null || (this.I.c == 924 || this.I.c == 624) && VDTT_ek.m().aR[4] != null || (this.I.c == 925 || this.I.c == 639) && VDTT_ek.m().aR[6] != null || (this.I.c == 926 || this.I.c == 654) && VDTT_ek.m().aR[8] != null) {
                        var1.add(new VDTT_ba(this.q - 51, this.r - 26, 0, 0, Caption.hC, var2, 173, 15));
                    }
                }
            } else if (var3.z() == 1) {
                var1.add(new VDTT_ba(this.q - 51, this.r - 26, 105, 0, Caption.bm, var2, 108, 15));
            }
        }

        if (!this.I.t) {
            var1.add(new VDTT_ba(this.q - 51, this.r - 26, 0, 0, Caption.A, var2, 109, 15));
        }

        if (this.I.M() >= 2 && this.I.c != 826) {
            var1.add(new VDTT_ba(this.q - 51, this.r - 26, 0, 0, Caption.B, var2, 102, 15));
        }

        if (this.I.T() && this.I.c != VDTT_cw.v().bX) {
            var1.add(this.R = new VDTT_ba(this.q - 51, this.r - 26, 0, 0, Caption.cy, var2, 137, 15));
        }

        if (this.I.c == 910 && this.I.t) {
            var1.add(new VDTT_ba(this.q - 51, this.r - 26, 0, 0, Caption.qC, var2, 172, 15));
        }

    }

    public final void a_() {
        if (this.P) {
            for (int var1 = 1; var1 < this.m.length; ++var1) {
                this.m[var1].b(true);
            }
        }

        a(this.m, this.n);
        this.M.a();
        if (DataCenter.d().h % 5 == 0) {
            if (this.I.s >= 8 && this.I.s <= 11 || this.I.s >= 12 && this.I.s <= 16) {
                ++this.Q;
                if (this.Q > this.I.s / 2) {
                    this.Q = 0;
                }
            } else if (this.I.s >= 17) {
                ++this.Q;
                if (this.Q > this.I.s - 8) {
                    this.Q = 0;
                }
            }
        }

        if (K != null) {
            Item var5;
            (var5 = new Item()).strOptions = K;
            this.a(var5.L(), new Vector(), true);
            K = null;
        }

        DataCenter.d();
        if (!DataCenter.b() && (!(this.a instanceof VDTT_aq) || ((VDTT_aq) this.a).a.b != 0) && this.a.k.equals(this)) {
            VDTT_il var2 = VDTT_cw.v().T();
            int var3 = this.a.objX + this.objX + this.q + VDTT_d.g().l() / 2;
            int var4 = this.a.objY + this.objY + this.r;
            switch (VDTT_cw.v().br) {
                case 1:
                    if (VDTT_cw.v().bs == 1 && this.I.c == 378) {
                        DataCenter.d().aA.a(var3 - 70, var4 - 12);
                        DataCenter.d().aA.b = true;
                        return;
                    }
                case 2:
                case 3:
                case 5:
                case 7:
                default:
                    break;
                case 4:
                    if (VDTT_cw.v().bs == 0) {
                        DataCenter.d().aA.a(var3 - 70, var4 - 12);
                        DataCenter.d().aA.b = true;
                        return;
                    }
                    break;
                case 6:
                    if (VDTT_cw.v().bs >= 0 && this.I.c == 380 && var2 != null && VDTT_ek.m().objX == var2.g && VDTT_ek.m().objY == var2.h) {
                        DataCenter.d().aA.a(var3 - 35, var4 - 12);
                        DataCenter.d().aA.b = true;
                        return;
                    }
                    break;
                case 8:
                    Item var6 = VDTT_ek.m().C();
                    if (VDTT_cw.v().bs == 9 && var6 != null && this.I.c == var6.c) {
                        DataCenter.d().aA.a(var3 - 35, var4 - 12);
                        DataCenter.d().aA.b = true;
                        return;
                    }
                    break;
                case 9:
                    if (VDTT_cw.v().bs == 10 && this.a instanceof VDTT_nf) {
                        label88:
                        {
                            if (((VDTT_nf) this.a).a.b == ((VDTT_nf) this.a).w()) {
                                if (this.I.getItemTemplate().f != 1 && this.I.getItemTemplate().f != 21) {
                                    break label88;
                                }

                                if (VDTT_cw.v().bX != this.I.c) {
                                    if (this.I.T()) {
                                        if (this.I.t) {
                                            DataCenter.d().aA.a(var3 - 70, var4 - 12);
                                        } else {
                                            DataCenter.d().aA.a(var3 - 105, var4 - 12);
                                        }
                                        break label88;
                                    }

                                    if (!this.I.t) {
                                        DataCenter.d().aA.a(var3 - 70, var4 - 12);
                                        break label88;
                                    }
                                }
                            }

                            DataCenter.d().aA.a(var3 - 35, var4 - 12);
                        }

                        DataCenter.d().aA.b = true;
                        return;
                    }
                    break;
                case 10:
                    if (VDTT_cw.v().bs == 5 && this.a instanceof VDTT_mq) {
                        DataCenter.d().aA.a(var3 - 70, var4 - 12);
                        DataCenter.d().aA.b = true;
                        return;
                    }
                    break;
                case 11:
                    if (this.a instanceof VDTT_kb) {
                        DataCenter.d().aA.a(var3 - 35, var4 - 12);
                        DataCenter.d().aA.b = true;
                    }
            }
        }

    }

    public final Vector g() {
        Vector var1 = new Vector();
        if (this.P) {
            var1.addElement(this.n[0].a(this.m[0].m, this));
        } else {
            for (int var2 = 0; var2 < this.n.length; ++var2) {
                var1.addElement(this.n[var2].a(this.m[var2].m, this));
            }
        }

        var1.addElement(new VDTT_hl(1010, this.M.objX, this.M.objY, this.M.objX + this.M.q, this.M.objY + this.M.r, this.M, this));
        var1.addElement(new VDTT_hl(1011, 0, 0, this.q, this.r, this.M, this));
        return var1;
    }

    public final void a(VDTT_hl var1, int var2, int var3) {
        Message var4;
        VDTT_bn var28;
        Message var30;
        Item[] var37;
        VDTT_lq var40;
        boolean var41;
        VDTT_ln var48;
        VDTT_lq var50;
        VDTT_jr var53;
        VDTT_lq var54;
        switch (var1.b) {
            case 100:
                this.n();
                break;
            case 101:
                this.n();
                if (this.a instanceof VDTT_mj) {
                    (var53 = (VDTT_jr) this.a).I.a((MainScreen) (new VDTT_jw(var53.I, this.I, ((VDTT_mj) this.a).P)));
                } else if (this.a instanceof VDTT_lq) {
                    if ((var50 = (VDTT_lq) this.a).a.b == 3) {
                        var50.I.a((MainScreen) (new VDTT_jw(var50.I, this.I, (byte) 40)));
                    } else {
                        var50.I.a((MainScreen) (new VDTT_jw(var50.I, this.I, (byte) 6)));
                    }
                }
                break;
            case 102:
                this.n();
                (var53 = (VDTT_jr) this.a).I.a((MainScreen) (new VDTT_ml(var53.I, this.I)));
                break;
            case 103:
                this.n();
                if (this.I.s > 9 && this.I.y()) {
                    DataCenter.d().ai.c(Caption.bg, -65536);
                } else {
                    VDTT_jr var49;
                    if (this.a instanceof VDTT_jr && (var49 = (VDTT_jr) this.a).ai != null && var49.ai.m) {
                        VDTT_cw.v();
                        VDTT_cw.a(this.I, false);
                    } else {
                        DataCenter.d().ai.a(Caption.AcceptSellItem, 2000, this);
                    }
                }
                break;
            case 104:
                this.n();
                this.l();
                break;
            case 105:
                this.n();
                var28 = this;

                try {
                    (var30 = new Message((byte) 113)).a((int) var28.I.getItemTemplate().f);
                    var30.l();
                } catch (Exception var27) {
                    VDTT_jb.a(var27);
                }
                break;
            case 106:
                this.n();
                var28 = this;

                try {
                    (var30 = new Message((byte) 115)).b(var28.I.f);
                    var30.l();
                } catch (Exception var26) {
                    VDTT_jb.a(var26);
                }
                break;
            case 107:
                this.n();
                var28 = this;

                try {
                    (var30 = new Message((byte) 114)).b(var28.I.f);
                    var30.l();
                } catch (Exception var25) {
                    VDTT_jb.a(var25);
                }
                break;
            case 108:
                this.n();
                var28 = this;

                try {
                    (var30 = new Message((byte) 112)).a(var28.I.f);
                    var30.l();
                } catch (Exception var24) {
                    VDTT_jb.a(var24);
                }
                break;
            case 109:
                this.n();
                Item var46;
                if ((var46 = this.I).c >= 5 && var46.c <= 11 || var46.c == 231 || var46.c == 176 || var46.c == 160 || var46.c == 161 || var46.c == 169 || var46.c == 170 || var46.c == 156 || var46.c == 157 || var46.c == 158 || var46.c == 159 || var46.c == 162 || var46.c == 823 || var46.c == 166 || var46.c == 168 || var46.c == 182 || var46.c == 183 || var46.c == 184 || var46.c == 177) {
                    DataCenter.d().ai.a(Caption.gO + this.I.getItemTemplate().b + Caption.eu, 2005, this);
                } else {
                    this.m();
                }
                break;
            case 110:
                this.n();
                this.N();
                break;
            case 111:
                this.n();
                this.O();
                break;
            case 112:
                this.n();
                this.x();
                break;
            case 113:
                this.n();
                this.y();
                break;
            case 114:
                this.n();
                var28 = this;

                try {
                    VDTT_mo var52;
                    var37 = (var52 = (VDTT_mo) var28.a).a(var28.I);
                    a(var52.O[0]);
                    var52.O[0] = var28.I;
                    var37[var28.I.f] = null;
                } catch (Exception var23) {
                    VDTT_jb.a(var23);
                }
                break;
            case 115:
                this.n();
                this.z();
                break;
            case 116:
                this.n();
                var28 = this;

                try {
                    VDTT_km var51;
                    var37 = (var51 = (VDTT_km) var28.a).a(var28.I);
                    if (var28.I.getItemTemplate().f == 25) {
                        a(var51.O[2]);
                        var51.O[2] = var28.I;
                        var37[var28.I.f] = null;
                    } else if (var28.I.s > 0) {
                        a(var51.O[0]);
                        var51.O[0] = var28.I;
                        var37[var28.I.f] = null;
                    } else {
                        a(var51.O[1]);
                        var51.O[1] = var28.I;
                        var37[var28.I.f] = null;
                    }
                } catch (Exception var22) {
                    VDTT_jb.a(var22);
                }
                break;
            case 117:
                this.n();
                this.A();
                break;
            case 118:
                this.n();
                this.D();
                break;
            case 119:
                this.n();
                this.E();
                break;
            case 120:
                this.n();
                var28 = this;

                try {
                    if ((var50 = (VDTT_lq) var28.a).O != null) {
                        VDTT_ek.m().aP[var50.O.f] = var50.O;
                    }

                    var50.O = var28.I;
                    VDTT_ek.m().aP[var28.I.f] = null;
                    var41 = true;
                    var50.f(1);
                } catch (Exception var21) {
                    VDTT_jb.a(var21);
                }
                break;
            case 121:
                this.n();
                var50 = (VDTT_lq) this.a;
                VDTT_ek.m().aP[var50.O.f] = var50.O;
                var50.O = null;
                break;
            case 122:
                this.n();
                var54 = (VDTT_lq) this.a;
                var41 = true;
                var40 = var54;
                var54.b(true, var40.W[var40.X]);
                break;
            case 123:
                this.n();
                var28 = this;

                try {
                    if ((var48 = (VDTT_ln) var28.a).T != null) {
                        VDTT_ek.m().aP[var48.T.f] = var48.T;
                    }

                    var48.T = var28.I;
                    VDTT_ek.m().aP[var28.I.f] = null;
                } catch (Exception var20) {
                    VDTT_jb.a(var20);
                }
                break;
            case 124:
                this.n();
                var48 = (VDTT_ln) this.a;
                VDTT_ek.m().aP[var48.T.f] = var48.T;
                var48.T = null;
                break;
            case 125:
                this.n();
                this.P();
                break;
            case 126:
                this.n();
                this.Q();
                break;
            case 127:
                this.n();
                if (this.I.i() && !this.I.t) {
                    DataCenter.d().ai.a(Caption.ch, 2002, this);
                } else {
                    this.R();
                }
                break;
            case 128:
                this.n();
                var28 = this;

                try {
                    (var30 = new Message((byte) 37)).a((int) var28.I.getItemTemplate().f);
                    var30.l();
                } catch (Exception var19) {
                    VDTT_jb.a(var19);
                }
                break;
            case 129:
                this.n();
                this.S();
                break;
            case 130:
                this.n();
                this.U();
                break;
            case 131:
                this.n();
                var28 = this;

                try {
                    (var30 = new Message((byte) -3)).b(var28.I.f);
                    var30.l();
                } catch (Exception var18) {
                    VDTT_jb.a(var18);
                }
                break;
            case 132:
                this.n();
                var54 = (VDTT_lq) this.a;
                var41 = true;
                var40 = var54;
                var54.a(true, var40.W[var40.X]);
                break;
            case 134:
                this.n();
                DataCenter.d().ai.a(Caption.gQ + VDTT_jb.c(this.N.c) + Caption.eu, Caption.bY, 2003, 2004, this);
                break;
            case 135:
                this.n();
                this.T();
                break;
            case 136:
                this.n();
                this.V();
                break;
            case 137:
                this.n();
                VDTT_cw.v().a(this.I.c, true);
                break;
            case 138:
                this.n();
                this.B();
                break;
            case 139:
                this.n();
                this.C();
                break;
            case 140:
                this.n();
                var28 = this;

                try {
                    VDTT_ki var47 = (VDTT_ki) var28.a;
                    (var4 = Message.c((byte) -90)).b(var47.Y.indexOf(var28.I));
                    var4.l();
                } catch (Exception var17) {
                }
                break;
            case 141:
                this.n();
                var28 = this;

                try {
                    ((VDTT_ki) var28.a).a(var28.I);
                } catch (Exception var16) {
                }
                break;
            case 143:
                this.n();
                this.F();
                break;
            case 144:
                this.n();
                this.G();
                break;
            case 145:
                this.n();
                this.X();
                break;
            case 146:
                this.n();
                this.Y();
                break;
            case 149:
                this.n();
                this.l();
                break;
            case 150:
                this.n();
                this.o();
                break;
            case 151:
                this.n();
                this.p();
                break;
            case 152:
                this.n();
                VDTT_kv var45;
                (var45 = (VDTT_kv) this.a).b(this.I);
                var45.C();
                break;
            case 153:
                this.n();
                var28 = this;

                try {
                    VDTT_mm var44;
                    var37 = (var44 = (VDTT_mm) var28.a).a(var28.I);
                    a(var44.O[0]);
                    var44.O[0] = var28.I;
                    var44.C();
                    var37[var28.I.f] = null;
                } catch (Exception var15) {
                    VDTT_jb.a(var15);
                }
                break;
            case 154:
                this.n();
                this.q();
                break;
            case 155:
                this.n();
                this.Z();
                break;
            case 156:
                this.n();
                this.aa();
                break;
            case 157:
                this.n();
                this.H();
                break;
            case 158:
                this.n();
                this.I();
                break;
            case 159:
                this.n();
                this.J();
                break;
            case 160:
                this.n();
                this.K();
                break;
            case 161:
                this.n();
                this.L();
                break;
            case 162:
                this.n();
                this.M();
                break;
            case 163:
                this.n();
                this.v();
                break;
            case 164:
                this.n();
                this.w();
                break;
            case 165:
                this.n();
                var28 = this;

                try {
                    VDTT_kn var43;
                    var37 = (var43 = (VDTT_kn) var28.a).a(var28.I);
                    if (var28.I.c == 684) {
                        a(var43.ab[2]);
                        var43.ab[2] = var28.I;
                        var37[var28.I.f] = null;
                    } else if (var28.I.s > 0) {
                        a(var43.ab[0]);
                        var43.ab[0] = var28.I;
                    } else {
                        a(var43.ab[1]);
                        var43.ab[1] = var28.I;
                    }

                    var37[var28.I.f] = null;
                } catch (Exception var14) {
                    VDTT_jb.a(var14);
                }
                break;
            case 166:
                this.n();
                var28 = this;

                try {
                    VDTT_lb var42;
                    var37 = (var42 = (VDTT_lb) var28.a).a(var28.I);
                    if (var28.I.y() && var28.I.s >= 14) {
                        if (var42.O[0] == null) {
                            var42.O[0] = var28.I;
                        } else if (var42.P[0] == null) {
                            var42.P[0] = var28.I;
                        } else {
                            VDTT_ek.m().i(var42.P[0].w)[var42.P[0].f] = var42.P[0];
                            var42.P[0] = var28.I;
                        }
                    }

                    var37[var28.I.f] = null;
                } catch (Exception var13) {
                    VDTT_jb.a(var13);
                }
                break;
            case 167:
                this.n();
                this.W();
                break;
            case 168:
                this.I.w = 2;
                VDTT_cw.v().a((MainScreen) (new VDTT_jx(VDTT_cw.v(), this.I)));
                break;
            case 169:
                this.I.w = 3;
                VDTT_cw.v().a((MainScreen) (new VDTT_jx(VDTT_cw.v(), this.I)));
                break;
            case 170:
                this.n();
                if (!this.I.al()) {
                    if (this.I.c == 189) {
                        DataCenter.d().ai.a(VDTT_jb.b(Caption.xj, VDTT_jb.k(250)), 2007, this);
                        return;
                    }

                    DataCenter.d().ai.a(VDTT_jb.b(Caption.xj, VDTT_jb.k(500)), 2007, this);
                    return;
                }

                VDTT_gz[] var38 = this.I.L();

                for (var3 = 0; var3 < var38.length; ++var3) {
                    if (var38[var3].b[0] == 413 && var38[var3].b[1] != var38[var3].f()) {
                        DataCenter.d().ai.c(Caption.xd, -65536);
                        return;
                    }
                }

                short var35 = 0;
                switch (this.I.c) {
                    case 189:
                        var35 = 150;
                        break;
                    case 276:
                        var35 = 300;
                        break;
                    case 306:
                        var35 = 450;
                        break;
                    case 476:
                        var35 = 600;
                        break;
                    case 477:
                        var35 = 800;
                        break;
                    case 478:
                        var35 = 1000;
                        break;
                    case 479:
                        var35 = 1200;
                        break;
                    case 480:
                        var35 = 1400;
                        break;
                    case 481:
                        var35 = 1600;
                        break;
                    case 482:
                        var35 = 1800;
                        break;
                    case 483:
                        var35 = 2000;
                        break;
                    case 484:
                        DataCenter.d().ai.c(Caption.xf, -2560);
                        return;
                }

                DataCenter.d().ai.a(VDTT_jb.b(Caption.xe, VDTT_jb.k(var35)), 2007, this);
                break;
            case 171:
                this.n();

                try {
                    Message.c((byte) 12).l();
                } catch (Exception var12) {
                }
                break;
            case 172:
                this.n();
                var2 = this.I.M() / 70;
                if (this.I.M() % 70 != 0) {
                    ++var2;
                }

                DataCenter.d().ai.a(Caption.qC + " " + this.I.M() + " " + this.I.getItemTemplate().b.toLowerCase() + " " + VDTT_jb.b(Caption.xh, VDTT_jb.c(var2)), 2001, this);
                break;
            case 173:
                this.n();
                DataCenter.d().ai.a(Caption.xi, 2008, this);
                break;
            case 174:
                String var29 = "";
                VDTT_gz var31 = this.I.L()[0];

                for (int var34 = 0; var34 < VDTT_ek.m().aR.length; ++var34) {
                    Item var5;
                    if ((var5 = VDTT_ek.m().aR[var34]) != null && (var5.getItemTemplate().f == 2 || var5.getItemTemplate().f == 4 || var5.getItemTemplate().f == 6 || var5.getItemTemplate().f == 8)) {
                        VDTT_gz[] var6 = var5.L();
                        String var7 = "";

                        for (int var8 = 0; var8 < var6.length; ++var8) {
                            if (var6[var8].a().c == var31.a().c) {
                                var7 = var7 + Caption.xT + " " + var6[var8].d() + ",";
                            }
                        }

                        if (var7.endsWith(",")) {
                            var7 = var7.substring(0, var7.length() - 1);
                        }

                        if (var7.length() > 0) {
                            var29 = var29 + Caption.xT + " " + var5.getItemTemplate().b + "," + var7 + ";";
                        }
                    }
                }

                if (var29.endsWith(";")) {
                    var29 = var29.substring(0, var29.length() - 1);
                }

                if (var29.length() > 0) {
                    VDTT_cw var10000 = VDTT_cw.v();
                    Item var32 = this.I;
                    MainScreen var33;
                    if ((var33 = var10000.c) instanceof VDTT_jr) {
                        VDTT_jr var39;
                        (var39 = (VDTT_jr) var33).a(var32, var29);
                    }
                } else {
                    this.n();
                    DataCenter.d().ai.c(this.I.getItemTemplate().c, -1);
                }
                break;
            case 2000:
                VDTT_cw.v();
                VDTT_cw.a(this.I, false);
                break;
            case 2001:
                VDTT_cw.v().a(this.I);
                break;
            case 2002:
                this.R();
                break;
            case 2003:
                var28 = this;

                try {
                    (var30 = new Message((byte) 98)).a(var28.N.a);
                    var30.l();
                } catch (Exception var11) {
                    VDTT_jb.a(var11);
                }
            case 2004:
            default:
                break;
            case 2005:
                this.m();
                break;
            case 2006:
                this.k();
                break;
            case 2007:
                try {
                    Message.c((byte) 11).l();
                } catch (Exception var10) {
                }
                break;
            case 2008:
                try {
                    (var4 = new Message((byte) 104)).b(this.I.f);
                    var4.l();
                } catch (Exception var9) {
                }
        }

        if (var1.b == 1010 || var1.b == 1011) {
            ;
        }
    }

    private void k() {
        if (!VDTT_cw.v().ac()) {
            MenuConfig.K().b(false);

            try {
                Message var1;
                (var1 = new Message((byte) 111)).b(this.I.f);
                var1.l();
            } catch (Exception var2) {
                VDTT_jb.a(var2);
            }
        }
    }

    public final void b(Graphics var1, int var2, int var3) {
        if (this.I.s > 0) {
            String var4 = this.I.getItemTemplate().b + " (" + this.I.ah() + ")";
            if (this.I.s >= 15) {
                VDTT_dg.a(VDTT_dg.f, var1, var4, var2 + 1, var3 + 1, 0, -16777216, 2, 1, 2, 1);
                VDTT_dg.a(VDTT_dg.f, var1, var4, var2, var3, 0, a(this.I.s), 2, 1, 2, 1);
            } else if (this.I.s == 14) {
                VDTT_dg.a(VDTT_dg.f, var1, var4, var2 + 1, var3, 0, -10026109, 2, 1, 0, 1);
                VDTT_dg.a(VDTT_dg.f, var1, var4, var2, var3, 0, a(this.I.s), 2, 0, 2, 1);
            } else if (this.I.s >= 12) {
                VDTT_dg.a(VDTT_dg.f, var1, var4, var2 + 1, var3, 0, -16702647, 2, 1, 0, 1);
                VDTT_dg.a(VDTT_dg.f, var1, var4, var2, var3, 0, a(this.I.s), 3, 0);
            } else {
                if (this.I.s < 8) {
                    VDTT_dg.b(VDTT_dg.f, var1, var4, var2, var3, 0, a(this.I.s), 0);
                    return;
                }

                VDTT_dg.a(VDTT_dg.f, var1, var4, var2, var3, 0, a(this.I.s), 3, 0);
            }
        } else {
            if (this.I.c == 826 && this.I.t) {
                VDTT_dg.b(VDTT_dg.f, var1, VDTT_jb.b(Caption.vP, VDTT_jb.c(this.I.M())), var2, var3, 0, -1, -16777216);
                return;
            }

            if (this.I.ae()) {
                VDTT_dg.b(VDTT_dg.f, var1, VDTT_jb.c(this.I.M()) + " " + this.I.getItemTemplate().b, var2, var3, 0, -1, -16777216);
                return;
            }

            VDTT_dg.b(VDTT_dg.f, var1, this.I.getItemTemplate().b, var2, var3, 0, -1, -16777216);
        }

    }

    private static int a(int var0) {
        if (var0 >= 15) {
            return -8323328;
        } else if (var0 >= 14) {
            return -2531077;
        } else if (var0 >= 12) {
            return -10901507;
        } else if (var0 >= 10) {
            return -59610;
        } else if (var0 >= 8) {
            return -130396;
        } else if (var0 >= 6) {
            return -1909717;
        } else {
            return var0 >= 4 ? -286419 : -1;
        }
    }

    private static String a(int var0, int var1) {
        try {
            switch (var0) {
                case 0:
                    return Caption.yN[3] + " (" + Caption.yK[var1 - 1] + "), " + Caption.yN[4] + " (" + Caption.yK[var1 - 1] + ")";
                case 1:
                    return Caption.aJ + " (" + Caption.yK[var1 - 1] + ") " + Caption.aP + " (" + Caption.yK[var1 - 1] + ")";
                case 2:
                    return Caption.yN[7] + " (" + Caption.yK[var1 - 1] + "), " + Caption.yN[8] + " (" + Caption.yK[var1 - 1] + ")";
                case 3:
                    return Caption.yN[0] + " (" + Caption.yK[var1 - 1] + "), " + Caption.yN[4] + " (" + Caption.yK[var1 - 1] + ")";
                case 4:
                    return Caption.yN[0] + " (" + Caption.yK[var1 - 1] + "), " + Caption.yN[3] + " (" + Caption.yK[var1 - 1] + ")";
                case 5:
                    return Caption.yN[6] + " (" + Caption.yK[var1 - 1] + "), " + Caption.yN[9] + " (" + Caption.yK[var1 - 1] + ")";
                case 6:
                    return Caption.yN[5] + " (" + Caption.yK[var1 - 1] + "), " + Caption.yN[9] + " (" + Caption.yK[var1 - 1] + ")";
                case 7:
                    return Caption.yN[2] + " (" + Caption.yK[var1 - 1] + "), " + Caption.yN[8] + " (" + Caption.yK[var1 - 1] + ")";
                case 8:
                    return Caption.yN[2] + " (" + Caption.yK[var1 - 1] + "), " + Caption.yN[7] + " (" + Caption.yK[var1 - 1] + ")";
                case 9:
                    return Caption.yN[6] + " (" + Caption.yK[var1 - 1] + "), " + Caption.yN[5] + " (" + Caption.yK[var1 - 1] + ")";
            }
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }

        return "";
    }

    private void l() {
        if (this.I.ad()) {
            VDTT_jr var8;
            (var8 = (VDTT_jr) this.a).I.a((MainScreen) (new VDTT_nj(var8.I, this.I)));
        } else if (this.I.i() && !this.I.t) {
            DataCenter.d().ai.a(Caption.bl, 2001, this);
        } else {
            if (this.I.getItemTemplate().f == 37) {
                Item var1;
                if ((var1 = VDTT_ek.m().aR[13]) == null) {
                    DataCenter.d().ai.c(Caption.xW, -1);
                    return;
                }

                short var2 = 0;
                switch (this.I.c) {
                    case 1058:
                    case 1059:
                    case 1060:
                    case 1061:
                    case 1062:
                        var2 = 465;
                        break;
                    case 1063:
                    case 1064:
                    case 1065:
                    case 1066:
                    case 1067:
                        var2 = 466;
                        break;
                    case 1068:
                    case 1069:
                    case 1070:
                    case 1071:
                    case 1072:
                        var2 = 467;
                        break;
                    case 1073:
                    case 1074:
                    case 1075:
                    case 1076:
                    case 1077:
                        var2 = 468;
                }

                VDTT_gz var3 = this.I.L()[0];
                VDTT_gz[] var7 = var1.L();
                VDTT_gz var4 = null;
                if (var7 != null) {
                    for (int var5 = 0; var5 < var7.length; ++var5) {
                        if (var7[var5].b[0] == var2) {
                            var4 = var7[var5];
                            break;
                        }
                    }
                }

                if (var4 == null || var3.b[0] == var4.f()) {
                    VDTT_cw.v().a(this.I);
                    return;
                }

                String var9 = this.I.getItemTemplate().b.split(":")[0];
                DataCenter.d().ai.a(var9 + VDTT_jb.b(Caption.xX, var9), 2001, this);
            } else {
                VDTT_cw.v().a(this.I);
            }

        }
    }

    private void m() {
        if (!MenuConfig.K().G()) {
            this.k();
        } else {
            DataCenter.d().ai.a(Caption.mT, 2006, 2004, this);
        }
    }

    private void n() {
        this.a.b((VDTT_m) this);
        if (this.l != null) {
            this.a.b((VDTT_m) this.l);
        }

    }

    private void o() {
        try {
            VDTT_kv var1;
            Item[] var2 = (var1 = (VDTT_kv) this.a).a(this.I);
            int var3 = 0;

            for (int var4 = 0; var4 < var1.P.length; ++var4) {
                if (var1.P[var4] != null) {
                    ++var3;
                    if (var1.P[var4].c == this.I.c) {
                        DataCenter.d().ai.c(this.I.getItemTemplate().b + " " + Caption.pr, -65536);
                        return;
                    }
                }
            }

            boolean var7 = false;

            int var5;
            for (var5 = 0; var5 < var1.P.length; ++var5) {
                if (var1.P[var5] == null) {
                    var7 = true;
                    break;
                }
            }

            if (var7 && var3 < 22) {
                for (var5 = 0; var5 < var1.P.length; ++var5) {
                    if (var1.P[var5] == null) {
                        var1.P[var5] = this.I;
                        break;
                    }
                }

                var1.b(var1.O[0]);
                var1.C();
                var2[this.I.f] = null;
            } else {
                DataCenter.d().ai.c(Caption.qp, -65536);
            }
        } catch (Exception var6) {
            VDTT_jb.a(var6);
        }
    }

    private void p() {
        VDTT_kv var1;
        Item[] var2 = (var1 = (VDTT_kv) this.a).P;

        for (int var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null && var2[var3].equals(this.I)) {
                VDTT_ek.m().i(this.I.w)[this.I.f] = this.I;
                var2[var3] = null;
                break;
            }
        }

        var1.b(var1.S);
        var1.C();
    }

    private void q() {
        Item[] var1 = ((VDTT_mm) this.a).O;

        for (int var2 = 0; var2 < var1.length; ++var2) {
            if (var1[var2] != null && var1[var2].equals(this.I)) {
                VDTT_ek.m().i(this.I.w)[this.I.f] = this.I;
                var1[var2] = null;
                return;
            }
        }

    }

    private void v() {
        try {
            Item[] var1;
            VDTT_jr var2;
            int var4;
            if (this.a instanceof VDTT_ne && this.I.getItemTemplate().f == 12 || this.a instanceof VDTT_mn && this.I.C()) {
                var1 = (var2 = (VDTT_jr) this.a).a(this.I);
                a(var2.ac[0]);
                var2.ac[0] = this.I;
            } else {
                var1 = (var2 = (VDTT_jr) this.a).a(this.I);
                if (this.I.i()) {
                    a(var2.ab[0]);
                    var2.ab[0] = this.I;
                } else {
                    boolean var3 = false;
                    var4 = 0;

                    while (true) {
                        if (var4 < var2.ab.length) {
                            if (var2.ab[var4] != null) {
                                ++var4;
                                continue;
                            }

                            var2.ab[var4] = this.I;
                            var3 = true;
                        }

                        if (!var3) {
                            DataCenter.d().ai.c(Caption.gR, -65536);
                            return;
                        }
                        break;
                    }
                }
            }

            var1[this.I.f] = null;
            if (this.a instanceof VDTT_jx) {
                ((VDTT_jx) this.a).w();
            } else {
                if (this.a instanceof VDTT_mn) {
                    VDTT_mn var6;
                    if ((var6 = (VDTT_mn) this.a).ac[0] != null) {
                        var6.S.clear();
                        Item var7;
                        (var7 = var6.ac[0].a()).a(0);
                        VDTT_gz[] var8 = var7.L();
                        Vector var10 = new Vector();

                        for (var4 = 0; var4 < var8.length; ++var4) {
                            if (var8[var4].l()) {
                                var6.S.add(var8[var4]);
                                var10.add(DataCenter.d().O[var8[var4].h()].b);
                            }
                        }

                        String[] var12;
                        (var12 = new String[var10.size() + 1])[0] = Caption.ru;

                        int var9;
                        for (var9 = 0; var9 < var10.size(); ++var9) {
                            var12[var9 + 1] = (String) var10.get(var9);
                        }

                        if ((var9 = var12.length) > 8) {
                            var9 = 8;
                        }

                        VDTT_hp var11 = new VDTT_hp(1004, var12);
                        var6.R.a(var11, var9);
                        var6.R.a(0);
                        var6.R.b(false);
                        return;
                    }

                    var6.R.b(true);
                }

                return;
            }
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }

    }

    private void w() {
        try {
            VDTT_jr var1;
            Item[] var2;
            int var3;
            if ((var2 = (var1 = (VDTT_jr) this.a).ab) != null) {
                for (var3 = 0; var3 < var2.length; ++var3) {
                    if (var2[var3] != null && var2[var3].equals(this.I)) {
                        VDTT_ek.m().i(this.I.w)[this.I.f] = this.I;
                        var2[var3] = null;
                        break;
                    }
                }
            }

            if (this.a instanceof VDTT_ne || this.a instanceof VDTT_mn) {
                var2 = var1.ac;

                for (var3 = 0; var3 < var2.length; ++var3) {
                    if (var2[var3] != null && var2[var3].equals(this.I)) {
                        VDTT_ek.m().i(this.I.w)[this.I.f] = this.I;
                        var2[var3] = null;
                        return;
                    }
                }
            }

        } catch (Exception var4) {
        }
    }

    private void x() {
        try {
            VDTT_nf var1;
            Item[] var2 = (var1 = (VDTT_nf) this.a).a(this.I);
            boolean var3 = false;
            if (this.I.c != 162 && this.I.c != 823) {
                if (this.I.i()) {
                    a(var1.O[0]);
                    var1.O[0] = this.I;
                } else {
                    for (int var4 = 0; var4 < var1.P.length; ++var4) {
                        if (var1.P[var4] == null) {
                            var1.P[var4] = this.I;
                            var3 = true;
                            break;
                        }
                    }

                    if (!var3) {
                        DataCenter.d().ai.c(Caption.bJ, -65536);
                        return;
                    }
                }
            } else {
                a(var1.O[2]);
                var1.O[2] = this.I;
            }

            var2[this.I.f] = null;
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    private void y() {
        VDTT_nf var1;
        Item[] var2 = (var1 = (VDTT_nf) this.a).O;

        int var3;
        for (var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null && var2[var3].equals(this.I)) {
                VDTT_ek.m().i(this.I.w)[this.I.f] = this.I;
                var2[var3] = null;
                break;
            }
        }

        var2 = var1.P;

        for (var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null && var2[var3].equals(this.I)) {
                VDTT_ek.m().aP[this.I.f] = this.I;
                var2[var3] = null;
                return;
            }
        }

    }

    private void z() {
        Item[] var1 = ((VDTT_mo) this.a).O;

        for (int var2 = 0; var2 < var1.length; ++var2) {
            if (var1[var2] != null && var1[var2].equals(this.I)) {
                VDTT_ek.m().i(this.I.w)[this.I.f] = this.I;
                var1[var2] = null;
                return;
            }
        }

    }

    private void A() {
        Item[] var1 = ((VDTT_km) this.a).O;

        for (int var2 = 0; var2 < var1.length; ++var2) {
            if (var1[var2] != null && var1[var2].equals(this.I)) {
                VDTT_ek.m().i(this.I.w)[this.I.f] = this.I;
                var1[var2] = null;
                return;
            }
        }

    }

    private void B() {
        try {
            boolean var1 = false;
            VDTT_nh var2;
            Item[] var3 = (var2 = (VDTT_nh) this.a).a(this.I);
            if (this.I.getItemTemplate().f == 11) {
                a(var2.ab[0]);
                var2.ab[0] = this.I;
                var3[this.I.f] = null;
            } else if (this.I.c == 310) {
                a(var2.ab[1]);
                var2.ab[1] = this.I;
                var3[this.I.f] = null;
            } else {
                int var4;
                for (var4 = 0; var4 < var2.ab.length; ++var4) {
                    if (var2.ab[var4] != null && var2.ab[var4].c == this.I.c) {
                        var3[var2.ab[var4].f] = var2.ab[var4];
                        var2.ab[var4] = this.I;
                        var3[this.I.f] = null;
                        return;
                    }
                }

                for (var4 = 0; var4 < var2.ab.length; ++var4) {
                    if (var2.ab[var4] == null) {
                        var2.ab[var4] = this.I;
                        var1 = true;
                        break;
                    }
                }

                if (!var1) {
                    DataCenter.d().ai.c(Caption.gP, -65536);
                } else {
                    var3[this.I.f] = null;
                }
            }
        } catch (Exception var5) {
        }
    }

    private void C() {
        try {
            boolean var1 = false;
            VDTT_jk var2;
            Item[] var3 = (var2 = (VDTT_jk) this.a).a(this.I);
            if (this.I.getItemTemplate().f == 13) {
                a(var2.ab[0]);
                var2.ab[0] = this.I;
                var3[this.I.f] = null;
            } else if (this.I.c == 685) {
                a(var2.ab[1]);
                var2.ab[1] = this.I;
                var3[this.I.f] = null;
            } else {
                int var4;
                for (var4 = 0; var4 < var2.ab.length; ++var4) {
                    if (var2.ab[var4] != null && var2.ab[var4].c == this.I.c) {
                        var3[var2.ab[var4].f] = var2.ab[var4];
                        var2.ab[var4] = this.I;
                        var3[this.I.f] = null;
                        return;
                    }
                }

                for (var4 = 0; var4 < var2.ab.length; ++var4) {
                    if (var2.ab[var4] == null) {
                        var2.ab[var4] = this.I;
                        var1 = true;
                        break;
                    }
                }

                if (!var1) {
                    DataCenter.d().ai.c(Caption.gP, -65536);
                } else {
                    var3[this.I.f] = null;
                }
            }
        } catch (Exception var5) {
        }
    }

    private void D() {
        try {
            VDTT_ng var1;
            Item[] var2 = (var1 = (VDTT_ng) this.a).a(this.I);
            if (this.I.getItemTemplate().f == 13) {
                a(var1.O[0]);
                var1.O[0] = this.I;
                var2[this.I.f] = null;
            } else {
                boolean var3 = false;

                for (int var4 = 0; var4 < var1.P.length; ++var4) {
                    if (var1.P[var4] == null) {
                        var1.P[var4] = this.I;
                        var3 = true;
                        break;
                    }
                }

                if (!var3) {
                    DataCenter.d().ai.c(Caption.bT, -65536);
                    return;
                }
            }

            var2[this.I.f] = null;
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    private void E() {
        VDTT_ng var1;
        Item[] var2 = (var1 = (VDTT_ng) this.a).O;

        int var3;
        for (var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null && var2[var3].equals(this.I)) {
                VDTT_ek.m().i(this.I.w)[this.I.f] = this.I;
                var2[var3] = null;
                break;
            }
        }

        var2 = var1.P;

        for (var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null && var2[var3].equals(this.I)) {
                VDTT_ek.m().aP[this.I.f] = this.I;
                var2[var3] = null;
                return;
            }
        }

    }

    private void F() {
        try {
            VDTT_nb var1;
            Item[] var2 = (var1 = (VDTT_nb) this.a).a(this.I);
            if (this.I.i()) {
                a(var1.O[0]);
                var1.O[0] = this.I;
            } else {
                boolean var3 = false;

                for (int var4 = 0; var4 < var1.P.length; ++var4) {
                    if (var1.P[var4] == null) {
                        var1.P[var4] = this.I;
                        var3 = true;
                        break;
                    }
                }

                if (!var3) {
                    DataCenter.d().ai.c(Caption.qi, -65536);
                    return;
                }
            }

            var2[this.I.f] = null;
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    private void G() {
        VDTT_nb var1;
        Item[] var2 = (var1 = (VDTT_nb) this.a).O;

        int var3;
        for (var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null && var2[var3].equals(this.I)) {
                VDTT_ek.m().i(this.I.w)[this.I.f] = this.I;
                var2[var3] = null;
                break;
            }
        }

        var2 = var1.P;

        for (var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null && var2[var3].equals(this.I)) {
                VDTT_ek.m().aP[this.I.f] = this.I;
                var2[var3] = null;
                return;
            }
        }

    }

    private void H() {
        try {
            VDTT_na var1;
            Item[] var2 = (var1 = (VDTT_na) this.a).a(this.I);
            if (this.I.i()) {
                a(var1.O[0]);
                var1.O[0] = this.I;
            } else {
                boolean var3 = false;

                for (int var4 = 0; var4 < var1.P.length; ++var4) {
                    if (var1.P[var4] == null) {
                        var1.P[var4] = this.I;
                        var3 = true;
                        break;
                    }
                }

                if (!var3) {
                    DataCenter.d().ai.c(Caption.qi, -65536);
                    return;
                }
            }

            var2[this.I.f] = null;
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    private void I() {
        VDTT_na var1;
        Item[] var2 = (var1 = (VDTT_na) this.a).O;

        int var3;
        for (var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null && var2[var3].equals(this.I)) {
                VDTT_ek.m().i(this.I.w)[this.I.f] = this.I;
                var2[var3] = null;
                break;
            }
        }

        var2 = var1.P;

        for (var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null && var2[var3].equals(this.I)) {
                VDTT_ek.m().aP[this.I.f] = this.I;
                var2[var3] = null;
                return;
            }
        }

    }

    private void J() {
        try {
            VDTT_nd var1;
            Item[] var2 = (var1 = (VDTT_nd) this.a).a(this.I);
            if (this.I.i()) {
                a(var1.O[0]);
                var1.O[0] = this.I;
            } else {
                boolean var3 = false;

                for (int var4 = 0; var4 < var1.P.length; ++var4) {
                    if (var1.P[var4] == null) {
                        var1.P[var4] = this.I;
                        var3 = true;
                        break;
                    }
                }

                if (!var3) {
                    DataCenter.d().ai.c(Caption.qi, -65536);
                    return;
                }
            }

            var2[this.I.f] = null;
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    private void K() {
        VDTT_nd var1;
        Item[] var2 = (var1 = (VDTT_nd) this.a).O;

        int var3;
        for (var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null && var2[var3].equals(this.I)) {
                VDTT_ek.m().i(this.I.w)[this.I.f] = this.I;
                var2[var3] = null;
                break;
            }
        }

        var2 = var1.P;

        for (var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null && var2[var3].equals(this.I)) {
                VDTT_ek.m().aP[this.I.f] = this.I;
                var2[var3] = null;
                return;
            }
        }

    }

    private void L() {
        try {
            VDTT_nc var1;
            Item[] var2 = (var1 = (VDTT_nc) this.a).a(this.I);
            if (this.I.i()) {
                a(var1.O[0]);
                var1.O[0] = this.I;
            } else {
                boolean var3 = false;

                for (int var4 = 0; var4 < var1.P.length; ++var4) {
                    if (var1.P[var4] == null) {
                        var1.P[var4] = this.I;
                        var3 = true;
                        break;
                    }
                }

                if (!var3) {
                    DataCenter.d().ai.c(Caption.qi, -65536);
                    return;
                }
            }

            var2[this.I.f] = null;
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    private void M() {
        VDTT_nc var1;
        Item[] var2 = (var1 = (VDTT_nc) this.a).O;

        int var3;
        for (var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null && var2[var3].equals(this.I)) {
                VDTT_ek.m().i(this.I.w)[this.I.f] = this.I;
                var2[var3] = null;
                break;
            }
        }

        var2 = var1.P;

        for (var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null && var2[var3].equals(this.I)) {
                VDTT_ek.m().aP[this.I.f] = this.I;
                var2[var3] = null;
                return;
            }
        }

    }

    private void N() {
        try {
            boolean var1 = false;
            VDTT_ni var2 = (VDTT_ni) this.a;

            for (int var3 = 0; var3 < var2.P.length; ++var3) {
                if (var2.P[var3] == null) {
                    var2.P[var3] = this.I;
                    var1 = true;
                    break;
                }
            }

            if (!var1) {
                DataCenter.d().ai.c(Caption.bJ, -65536);
            } else {
                VDTT_ek.m().aP[this.I.f] = null;
            }
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    private void O() {
        VDTT_ni var1;
        if ((var1 = (VDTT_ni) this.a).O != null && this.I.equals(var1.O)) {
            var1.i(this.I.f);
            var1.O = null;
        } else {
            Item[] var3 = var1.P;

            for (int var2 = 0; var2 < var3.length; ++var2) {
                if (var3[var2] != null && var3[var2].equals(this.I)) {
                    VDTT_ek.m().aP[this.I.f] = this.I;
                    var3[var2] = null;
                    return;
                }
            }

        }
    }

    private void P() {
        try {
            boolean var1 = false;
            VDTT_mz var2 = (VDTT_mz) this.a;

            for (int var3 = 0; var3 < var2.S.length; ++var3) {
                if (var2.S[var3] == null) {
                    var2.S[var3] = this.I;
                    var1 = true;
                    break;
                }
            }

            if (!var1) {
                DataCenter.d().ai.c(Caption.cc, -65536);
            } else {
                VDTT_ek.m().aP[this.I.f] = null;
            }
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    private void Q() {
        Item[] var1 = ((VDTT_mz) this.a).S;

        for (int var2 = 0; var2 < var1.length; ++var2) {
            if (var1[var2] != null && var1[var2].equals(this.I)) {
                VDTT_ek.m().aP[this.I.f] = this.I;
                var1[var2] = null;
                return;
            }
        }

    }

    private void R() {
        try {
            Message var1;
            (var1 = new Message((byte) 36)).b(this.I.f);
            var1.l();
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    private void S() {
        try {
            boolean var1 = false;
            VDTT_mq var2 = (VDTT_mq) this.a;

            for (int var3 = 0; var3 < var2.O.length; ++var3) {
                if (var2.O[var3] == null) {
                    var2.O[var3] = this.I;
                    var1 = true;
                    break;
                }
            }

            if (!var1) {
                DataCenter.d().ai.c(Caption.gR, -65536);
            } else {
                VDTT_ek.m().aP[this.I.f] = null;
            }
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    private void T() {
        try {
            boolean var1 = false;
            VDTT_jz var2;
            Item[] var3 = (var2 = (VDTT_jz) this.a).a(this.I);
            if (var2.P != 68 && var2.P != 69 && var2.P != 70 && var2.P != 71) {
                for (int var4 = 0; var4 < var2.O.length; ++var4) {
                    if (var2.O[var4] == null) {
                        var2.O[var4] = this.I;
                        var1 = true;
                        break;
                    }
                }

                if (!var1) {
                    DataCenter.d().ai.c(Caption.gR, -65536);
                    return;
                }
            } else {
                a(var2.O[0]);
                var2.O[0] = this.I;
            }

            var3[this.I.f] = null;
        } catch (Exception var5) {
            VDTT_jb.a(var5);
        }
    }

    private void U() {
        try {
            Item[] var1 = ((VDTT_mq) this.a).O;
            int var2 = 0;

            while (true) {
                if (var2 >= var1.length) {
                    return;
                }

                if (var1[var2] != null && var1[var2].equals(this.I)) {
                    VDTT_ek.m().aP[this.I.f] = this.I;
                    var1[var2] = null;
                    break;
                }

                ++var2;
            }
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }

    }

    private void V() {
        try {
            Item[] var1 = ((VDTT_jz) this.a).O;
            int var2 = 0;

            while (true) {
                if (var2 >= var1.length) {
                    return;
                }

                if (var1[var2] != null && var1[var2].equals(this.I)) {
                    VDTT_ek.m().i(this.I.w)[this.I.f] = this.I;
                    var1[var2] = null;
                    break;
                }

                ++var2;
            }
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }

    }

    private void W() {
        VDTT_lb var1;
        Item[] var2 = (var1 = (VDTT_lb) this.a).O;

        int var3;
        for (var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null && var2[var3].equals(this.I)) {
                VDTT_ek.m().i(this.I.w)[this.I.f] = this.I;
                var2[var3] = null;
                break;
            }
        }

        var2 = var1.P;

        for (var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null && var2[var3].equals(this.I)) {
                VDTT_ek.m().i(this.I.w)[this.I.f] = this.I;
                var2[var3] = null;
                return;
            }
        }

    }

    private void X() {
        try {
            VDTT_lt var1;
            Item[] var2 = (var1 = (VDTT_lt) this.a).a(this.I);
            if (this.I.y()) {
                a(var1.O[0]);
                var1.O[0] = this.I;
            } else {
                int var3;
                if (this.I.getItemTemplate().f == 32 && var1.P[0] != null && var1.P[0].c == this.I.c && var1.P[0].t != this.I.t) {
                    for (var3 = 0; var3 < var1.P.length; ++var3) {
                        if (var1.P[var3] == null) {
                            var1.P[var3] = this.I;
                            break;
                        }
                    }
                } else {
                    for (var3 = 0; var3 < var1.P.length; ++var3) {
                        if (var1.P[var3] != null) {
                            int var10001 = var1.P[var3].f;
                            VDTT_ek.m().aP[var10001] = var1.P[var3];
                            var1.P[var3] = null;
                        }
                    }

                    var1.P[0] = this.I;
                }
            }

            var2[this.I.f] = null;
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    private void Y() {
        VDTT_lt var1;
        Item[] var2 = (var1 = (VDTT_lt) this.a).O;

        int var3;
        for (var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null && var2[var3].equals(this.I)) {
                VDTT_ek.m().i(this.I.w)[this.I.f] = this.I;
                var2[var3] = null;
                break;
            }
        }

        for (var3 = 0; var3 < var1.P.length; ++var3) {
            if (var1.P[var3] != null) {
                int var10001 = var1.P[var3].f;
                VDTT_ek.m().aP[var10001] = var1.P[var3];
                var1.P[var3] = null;
            }
        }

    }

    private void Z() {
        try {
            boolean var1 = false;
            VDTT_li var2 = (VDTT_li) this.a;

            for (int var3 = 0; var3 < var2.O.length; ++var3) {
                if (var2.O[var3] == null) {
                    var2.O[var3] = this.I;
                    var1 = true;
                    break;
                }
            }

            if (!var1) {
                DataCenter.d().ai.c(Caption.gR, -65536);
            } else {
                VDTT_ek.m().aP[this.I.f] = null;
            }
        } catch (Exception var4) {
            VDTT_jb.a(var4);
        }
    }

    private void aa() {
        try {
            Item[] var1 = ((VDTT_li) this.a).O;
            int var2 = 0;

            while (true) {
                if (var2 >= var1.length) {
                    return;
                }

                if (var1[var2] != null && var1[var2].equals(this.I)) {
                    VDTT_ek.m().aP[this.I.f] = this.I;
                    var1[var2] = null;
                    break;
                }

                ++var2;
            }
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }

    }

    public final VDTT_ba h() {
        for (int var1 = 0; var1 < this.m.length; ++var1) {
            if (this.m[var1].l.equals(Caption.bI) || this.m[var1].l.equals(Caption.bm) || this.m[var1].l.equals(Caption.bn)) {
                return this.m[var1];
            }
        }

        return null;
    }

    public final VDTT_ba i() {
        for (int var1 = 0; var1 < this.m.length; ++var1) {
            if (this.m[var1].l.equals(Caption.u) || this.m[var1].l.equals(Caption.B)) {
                return this.m[var1];
            }
        }

        return null;
    }

    public final VDTT_ba j() {
        for (int var1 = 0; var1 < this.m.length; ++var1) {
            if (this.m[var1].l.equals(Caption.z)) {
                return this.m[var1];
            }
        }

        return null;
    }

    private static void a(Item var0) {
        if (var0 != null) {
            VDTT_ek.m().i(var0.w)[var0.f] = var0;
        }

    }

    private void a(VDTT_gz[] var1, Vector var2, boolean var3) {
        if (var1 != null) {
            boolean var4 = false;
            int var5 = 1;

            for (int var6 = 0; var6 < var1.length && !(this.a instanceof VDTT_kt); ++var6) {
                if (var1[var6].a().b.length() == 0) {
                    try {
                        Message var12 = new Message((byte) -68);
                        if (this.N != null) {
                            var12.a((int) 6);
                            var12.a(this.N.a);
                        } else if (this.a instanceof VDTT_lq && this.I.equals(((VDTT_lq) this.a).H().e)) {
                            var12.a((int) 6);
                            var12.a(((VDTT_lq) this.a).H().a);
                        } else if (this.a instanceof VDTT_ln && this.a.k instanceof VDTT_bp && this.I.equals(((VDTT_bp) this.a.k).l.e)) {
                            var12.a((int) 8);
                            var12.b(((VDTT_bp) this.a.k).l.a);
                        } else if (this.I.c() > 0) {
                            var12.a((int) 7);
                            var12.b(this.I.b);
                        } else {
                            VDTT_bn var14 = this;
                            int var15 = 0;

                            byte var17;
                            label261:
                            while (true) {
                                if (var15 >= VDTT_ek.m().aR.length) {
                                    for (var15 = 0; var15 < VDTT_ek.m().aS.length; ++var15) {
                                        if (VDTT_ek.m().aS[var15] != null && VDTT_ek.m().aS[var15].equals(var14.I)) {
                                            var17 = 5;
                                            break label261;
                                        }
                                    }

                                    for (var15 = 0; var15 < VDTT_ek.m().aP.length; ++var15) {
                                        if (VDTT_ek.m().aP[var15] != null && VDTT_ek.m().aP[var15].equals(var14.I)) {
                                            var17 = 2;
                                            break label261;
                                        }
                                    }

                                    if (VDTT_ek.m().aQ != null) {
                                        for (var15 = 0; var15 < VDTT_ek.m().aQ.length; ++var15) {
                                            if (VDTT_ek.m().aQ[var15] != null && VDTT_ek.m().aQ[var15].equals(var14.I)) {
                                                var17 = 3;
                                                break label261;
                                            }
                                        }
                                    }

                                    var17 = 9;
                                    break;
                                }

                                if (VDTT_ek.m().aR[var15] != null && VDTT_ek.m().aR[var15].equals(var14.I)) {
                                    var17 = 4;
                                    break;
                                }

                                ++var15;
                            }

                            byte var13 = var17;
                            var12.a((int) var13);
                            if (var13 == 9) {
                                var12.b(this.I.c);
                            } else {
                                var12.b(this.I.f);
                            }
                        }

                        var12.l();
                    } catch (Exception var11) {
                    }
                    break;
                }

                if (var1[var6].j()) {
                    if ((var1[var6].a().c != 19 || this.I.s < 2) && (var1[var6].a().c != 3 || this.I.s < 4) && (var1[var6].a().c != 11 || this.I.s < 6) && (var1[var6].a().c != 4 || this.I.s < 8) && (var1[var6].a().c != 12 || this.I.s < 10) && (var1[var6].a().c != 5 || this.I.s < 12) && (var1[var6].a().c != 6 || this.I.s < 14) && (var1[var6].a().c != 7 || this.I.s < 15) && (var1[var6].a().c != 10 || this.I.s < 17)) {
                        this.O.addElement(new VDTT_fw(var1[var6].d(), -7631732, -16777216));
                    } else {
                        this.O.addElement(new VDTT_fw(var1[var6].d(), -29436, -16777216));
                    }
                } else if (var1[var6].a().c == 2) {
                    if (!var4) {
                        var4 = true;
                        this.O.addElement(new VDTT_fw(Caption.gJ + a(this.I.getItemTemplate().f, this.I.g), -4654333, -11184811));
                    }

                    if (var3) {
                        this.O.addElement(new VDTT_fw(var1[var6].d(), -1, -16777216));
                    } else {
                        this.O.addElement(new VDTT_fw(var1[var6].d(), -7631732, -16777216));
                    }
                } else if (var1[var6].a().c == 8) {
                    this.O.addElement(new VDTT_fw("(" + DataCenter.d().O[var1[var6].h()].b + " " + Caption.ed + " " + var1[var6].i() + ") " + var1[var6].d(), -49561, -16777216));
                } else {
                    VDTT_gz var7;
                    Vector var10000;
                    if (var1[var6].a().c == 17) {
                        var10000 = this.O;

                        VDTT_gz var18 = var1[var6];
                        byte var8 = this.I.s;
                        var7 = var18;
                        String[] var9;
                        String var19;
                        if (var18.b[1] >= 0 && var7.f() >= 0 && var7.b[1] != var7.f()) {
                            var19 = (var9 = var7.b()) != null ? VDTT_jb.b(DataCenter.d().P[var7.b[0]].b, "(" + var9[0] + "-" + var9[1] + ")") : VDTT_jb.b(DataCenter.d().P[var7.b[0]].b, "(" + var7.b[1] + "-" + var7.f() + ")");
                        } else if (var7.b[1] >= 0) {
                            Item var10;
                            String var16;
                            if ((var9 = var7.b()) != null) {
                                var16 = VDTT_jb.b(DataCenter.d().P[var7.b[0]].b, var9[0]);
                                if (var8 > 0) {
                                    (var10 = new Item(314)).s = var8;
                                    var10.strOptions = var7.g();
                                    var10.a(0);
                                    if ((var7 = var10.L()[0]).b[1] % 10 == 0) {
                                        var16 = var16 + " (" + Caption.tJ + " +" + var7.b[1] / 10 + "%)";
                                    } else {
                                        var16 = var16 + " (" + Caption.tJ + " +" + (float) var7.b[1] / 10.0F + "%)";
                                    }
                                }
                            } else {
                                var16 = VDTT_jb.b(DataCenter.d().P[var7.b[0]].b, "" + var7.b[1]);
                                if (var8 > 0) {
                                    (var10 = new Item(314)).s = var8;
                                    var10.strOptions = var7.g();
                                    var10.a(0);
                                    var7 = var10.L()[0];
                                    var16 = var16 + " (" + Caption.tJ + " +" + var7.b[1] + ")";
                                }
                            }

                            var19 = var16;
                        } else {
                            var19 = var7.f() >= 0 ? VDTT_jb.b(DataCenter.d().P[var7.b[0]].b, "" + var7.f()) : "";
                        }

                        VDTT_fw var10001 = new VDTT_fw(var19, -6488, -16777216);
                        var10000.addElement(var10001);
                    } else if (var1[var6].a().c == 14) {
                        this.O.addElement(new VDTT_fw(var5 + ". " + var1[var6].d(), -16742145, -16777216));
                        ++var5;
                    } else if (var1[var6].a().c == 18) {
                        var2.addElement(new VDTT_fw(var1[var6].d(), -16711681, -16777216));
                    } else if (var1[var6].a().c != 55 && var1[var6].a().a != 399 && var1[var6].a().a != 400 && var1[var6].a().a != 403 && var1[var6].a().a != 427) {
                        if (var1[var6].a().a >= 53 && var1[var6].a().a <= 62) {
                            this.O.addElement(new VDTT_fw(var1[var6].e(), -6488, -16777216));
                        } else if (var1[var6].a().a == 128) {
                            this.O.addElement(new VDTT_fw(var1[var6].e(), -2560, -16777216));
                        } else if (var1[var6].a().a == 285) {
                            var7 = var1[var6];
                            this.O.addElement(new VDTT_fw(VDTT_jb.b(DataCenter.d().P[var7.b[0]].b, VDTT_jb.c(var7.b[1]) + " / " + DataCenter.d().a(var7.f())), -2560, -16777216));
                        } else if (var1[var6].a().a == 413) {
                            this.O.addElement(new VDTT_fw(var1[var6].e(), -2560, -16777216));
                        } else if (var1[var6].a().a == 407) {
                            this.O.addElement(new VDTT_fw(var1[var6].e(), -6488, -16777216));
                        } else if (var1[var6].k()) {
                            this.O.addElement(new VDTT_fw(var1[var6].e(), -4654333, -16777216));
                        } else if (var1[var6].a().a == 370) {
                            var2.addElement(new VDTT_fw(var1[var6].e(), -4654333, -16777216));
                        } else if (var1[var6].a().a == 293) {
                            if (this.I.h != -1L && this.I.h - System.currentTimeMillis() < 864000000L) {
                                this.O.addElement(new VDTT_fw(var1[var6].d(), -7631732, -16777216));
                            } else {
                                this.O.addElement(new VDTT_fw(var1[var6].d(), -7812062, -16777216));
                            }
                        } else if (var1[var6].a().a == 294) {
                            if (this.I.h != -1L && this.I.h - System.currentTimeMillis() < 2592000000L) {
                                this.O.addElement(new VDTT_fw(var1[var6].d(), -7631732, -16777216));
                            } else {
                                this.O.addElement(new VDTT_fw(var1[var6].d(), -7812062, -16777216));
                            }
                        } else if (var1[var6].a().a == 469 || var1[var6].a().a >= 465 && var1[var6].a().a <= 468 && var1[var6].f() == 469) {
                            this.O.addElement(new VDTT_fw(var1[var6].d(), -16532489, -16777216));
                        } else if (var1[var6].a().a != 470 && (var1[var6].a().a < 465 || var1[var6].a().a > 468 || var1[var6].f() != 470)) {
                            if (var1[var6].a().a == 471 || var1[var6].a().a >= 465 && var1[var6].a().a <= 468 && var1[var6].f() == 471) {
                                this.O.addElement(new VDTT_fw(var1[var6].d(), -6085890, -16777216));
                            } else if (var1[var6].a().a == 472 || var1[var6].a().a >= 465 && var1[var6].a().a <= 468 && var1[var6].f() == 472) {
                                this.O.addElement(new VDTT_fw(var1[var6].d(), -14953132, -16777216));
                            } else if (var1[var6].a().a != 473 && (var1[var6].a().a < 465 || var1[var6].a().a > 468 || var1[var6].f() != 473)) {
                                if (var1[var6].a().a >= 481 && var1[var6].a().a <= 485) {
                                    this.O.addElement(new VDTT_fw(var1[var6].d(), -16712913, -16777216));
                                } else if (var1[var6].b[0] == 105) {
                                    var10000 = this.O;
                                    StringBuilder var10003 = (new StringBuilder()).append(Caption.gK).append("c#yellow");
                                    int[] var10005 = var1[var6].b;
                                    var10000.addElement(new VDTT_fw(var10003.append(DataCenter.d().H[var10005[1]].b).toString(), -1, -16777216));
                                    this.O.addElement(new VDTT_fw(Caption.gL, -1, -16777216));
                                } else if (var1[var6].b[0] == 148) {
                                    if (var1[var6].b[1] == 1) {
                                        this.O.addElement(new VDTT_fw("Trang bị chiến binh", -14066190, -16777216));
                                    } else if (var1[var6].b[1] == 2) {
                                        this.O.addElement(new VDTT_fw("Trang bị siêu cấp", -196483, -16777216));
                                    }
                                } else if (var1[var6].b[0] == 159) {
                                    this.O.addElement(new VDTT_fw(var1[var6].d(), -196483, -16777216));
                                } else if (var1[var6].b[0] == 163) {
                                    this.O.addElement(new VDTT_fw(var1[var6].d(), -48128, -16777216));
                                } else if (var1[var6].b[0] == 164) {
                                    this.O.addElement(new VDTT_fw(var1[var6].d(), -4588032, -16777216));
                                } else if (var1[var6].b[0] == 165) {
                                    this.O.addElement(new VDTT_fw(var1[var6].d(), -16712186, -16777216));
                                } else {
                                    this.O.addElement(new VDTT_fw(var1[var6].d(), -6488, -16777216));
                                }
                            } else {
                                this.O.addElement(new VDTT_fw(var1[var6].d(), -243953, -16777216));
                            }
                        } else {
                            this.O.addElement(new VDTT_fw(var1[var6].d(), -1788155, -16777216));
                        }
                    } else if (var1[var6].a().c == 55 && this.I.x()) {
                        if (var1[var6].b[1] >= 0 && var1[var6].f() >= 0) {
                            this.O.addElement(new VDTT_fw(var1[var6].c(), -623877, -16777216));
                        } else {
                            this.O.addElement(new VDTT_fw(var1[var6].c(), -7631732, -16777216));
                        }
                    } else {
                        this.O.addElement(new VDTT_fw(var1[var6].d(), -623877, -16777216));
                    }
                }
            }
        }

        this.O.addAll(var2);
        if (this.I.getItemTemplate().f == 99 && this.I.strOptions.length() > 0) {
            this.O.addElement(new VDTT_fw("", -6488, -16777216));
            this.O.addElement(new VDTT_fw("", -6488, -16777216));
        }

        this.M = new VDTT_hs((byte) 1, 4, 4, this.q - 22, 105, 15, 1 + this.O.size());
    }
}
