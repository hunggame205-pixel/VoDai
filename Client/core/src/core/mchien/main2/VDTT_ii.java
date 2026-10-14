package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ii {

    public int a = -1;
    public int b;
    public VDTT_if c;
    public VDTT_ic d;
    public VDTT_ek e;
    public VDTT_n f;
    public boolean g;
    public VDTT_er h;
    private int k;
    private boolean l;
    public boolean i;
    private int m;
    private int n;
    private XYEntity o;
    private XYEntity p;
    public VDTT_ic j;

    public VDTT_ii(VDTT_ic var1, VDTT_ek var2, VDTT_n var3) {
        this.d = var1;
        this.c = (VDTT_if) DataCenter.d().D.get(var1.d);
        this.e = var2;
        VDTT_ek var4;
        if (var3 instanceof VDTT_ek && (var4 = (VDTT_ek) var3).bU != null) {
            var3 = var4.bU;
        }

        this.f = (VDTT_n) var3;
        if (var2.p() && var1.l() && VDTT_cw.v().bg != null) {
            var2.bd.clear();
            this.o = XYEntity.e(var2.objX, var2.objY);
            this.p = XYEntity.e(VDTT_cw.v().bg.objX, VDTT_cw.v().bg.objY);
            this.n = VDTT_jb.a(this.o.objX, this.o.objY, this.p.objX, this.p.objY);
        }

        if (var2.U() != null) {
            this.b = 1;
        } else {
            this.b = 0;
        }

        try {
            // System.out.println(var1.e()+" "+var1.i);
            if (var2.p() && (var1.e() || var1.i >= 100)) {//đây nè 1 là type skill  or range >=100 sẽ gửi lên sv luôn, còn k nó sẽ đợi animation
                VDTT_ic var6 = var1;
                Object var5 = var3;
                var4 = var2;

                try {
                    if (var4.p()) {
                        if (var5 != null) {
                            if (var5 instanceof VDTT_ek) {
                                VDTT_dn.a().c(var6.b, ((VDTT_n) var5).b);
                            } else {
                                VDTT_dn.a().b(var6.b, ((VDTT_n) var5).b);
                            }
                        } else if (var6.e()) {
                            VDTT_dn.a().b((int) var6.b, (int) -1);
                        }
                    }

                } catch (Exception var7) {
                    VDTT_jb.a(var7);
                }
            }
        } catch (Exception var8) {
            var8.printStackTrace();
        }

        if (var3 != null && var3.equals(VDTT_ek.m())) {
            VDTT_ac.b().a(((VDTT_ek) var3).av, var1.d, false);
        } else if (var2.equals(VDTT_ek.m())) {
            VDTT_ac.b().a(VDTT_ek.m().av, var1.d, true);
        }

        if (this.c == null) {
            return;
        }
        for (int var9 = 0; var9 < this.c.e[0].length; ++var9) {
            if (this.c.e[0][var9].b > 0) {
                (new VDTT_hi(this.c.e[0][var9].b, 0, 0)).q();
            }

            if (this.c.e[0][var9].e > 0) {
                (new VDTT_er(this.c.e[0][var9].e, 0, 0, var2, 0, 0, false, new Vector(), new Vector())).q();
            }
        }

        if (this.c.b > 0) {
            (new VDTT_hi(this.c.b, 0, 0)).q();
        }

        if (this.c.c > 0) {
            (new VDTT_er(this.c.c, 0, 0, var2, 0, 0, false, new Vector(), new Vector())).q();
        }

    }

    public final void a(Vector var1, Vector var2) {
        if (c == null) {
            this.e.a(this.f, this.d);
            this.e.aV = null;
            this.e.j();
            return;
        }
        VDTT_ii var4;
        try {
            VDTT_ek var10000;
            if (this.d.l() && this.e.p()) {
                VDTT_ek.m().S();
                XYEntity var3 = VDTT_jb.b(this.o, this.p, this.m * 15);
                VDTT_ek.m().objX = var3.objX;
                VDTT_ek.m().objY = var3.objY;
                this.e.a(this.p);
                ++this.m;
                if (VDTT_jb.a((XYEntity) this.e, (XYEntity) this.p) < 30) {
                    this.a = this.c.e[this.b].length;
                    if (this.j != null) {
                        var10000 = VDTT_ek.m();
                        var4 = null;
                        var10000.aV = var4;
                        VDTT_ek.m().a(this.j, VDTT_cw.v().bg, false);
                        return;
                    }
                }
            }

            if (this.f != null && this.f.h()) {
                this.a = this.c.e[this.b].length;
            }

            if (this.h != null && this.h.p()) {
                if (this.h.n()) {
                    this.a();
                }
            } else {
                this.e.a((XYEntity) this.f);
            }

            ++this.a;
            if (this.a >= this.c.e[this.b].length && this.h != null) {
                if (!this.h.n()) {
                    this.a = this.c.e[this.b].length - 1;
                } else if (this.e.p() && this.h.m().a == 20) {
                    this.e.a(this.f, this.d);
                }
            }

            if (this.e.p() && this.h != null && this.h.p() && this.h.n() && this.h.K < 2) {
                this.h.K = 2;
                this.e.a(this.f, this.d);
            }

            VDTT_ek var12;
            if (this.a < this.c.e[this.b].length) {
                short var14 = this.c.e[this.b][this.a].a;
                this.e.K = (short) var14;
                int var16;
                if (this.i) {
                    var16 = this.e.K + 1;
                    this.e.K = (short) var16;
                }

                try {
                    if (this.e.p() && (this.a == 16 && this.d.d == 11 || this.a == 16 && this.d.d == 9)) {
                        this.e.a(this.f, this.d);
                    }
                } catch (Exception var9) {
                }

                try {
                    if (this.e.p() && this.a == 10 && this.d.j()) {
                        this.e.a(this.f, this.d);
                    }
                } catch (Exception var7) {
                }

                if (this.d.d == 11 && this.a == 15) {
                    this.e.a(this.f);
                }

                if (this.d.d == 9 && this.a == 16 && this.e.objY > this.f.objY) {
                    VDTT_n var18 = this.f;
                    var12 = this.e;
                    VDTT_gk var5;
                    if (!(var18 instanceof VDTT_gk) || (var5 = (VDTT_gk) var18).k != 213) {
                        var12.aY = new VDTT_ee(var12.aZ, var18);
                        VDTT_cw.v().au.add(new VDTT_hi(337, var12.objX, var12.objY, 1));
                        if (var12.p()) {
                            VDTT_cw.v().cE = var18;
                            VDTT_cw.v().cF = 100;
                        }
                    }
                }

                short[] var19 = new short[]{59, 66, 74, 83, 114, 121, 129, 138};
                if (this.h != null && this.h.m().a != 20) {
                    for (var16 = 0; var16 < 8; ++var16) {
                        if (this.e.K >= var19[var16] && this.e.K < var19[var16] + 7) {
                            if (this.h.n >= 25 && this.h.n < 155) {
                                var14 = var19[var16];
                                this.e.K = (short) var14;
                                break;
                            }

                            if (this.h.n >= 205 && this.h.n < 335) {
                                var14 = (short) (var19[var16] + 6);
                                this.e.K = (short) var14;
                                break;
                            }

                            if (this.h.n >= 165 && this.h.n < 175 || this.h.n >= 15 && this.h.n < 25) {
                                var14 = (short) (var19[var16] + 2);
                                this.e.K = (short) var14;
                                break;
                            }

                            if (this.h.n >= 155 && this.h.n < 165 || this.h.n >= 5 && this.h.n < 15) {
                                var14 = (short) (var19[var16] + 1);
                                this.e.K = (short) var14;
                                break;
                            }

                            if ((this.h.n < 345 || this.h.n >= 355) && (this.h.n < 185 || this.h.n >= 195)) {
                                if ((this.h.n < 335 || this.h.n >= 345) && (this.h.n < 195 || this.h.n >= 205)) {
                                    var14 = (short) (var19[var16] + 3);
                                    this.e.K = (short) var14;
                                    break;
                                }

                                var14 = (short) (var19[var16] + 5);
                                this.e.K = (short) var14;
                                break;
                            }

                            var14 = (short) (var19[var16] + 4);
                            this.e.K = (short) var14;
                            break;
                        }
                    }
                }

                if (this.d.d == 11 && this.a == 15) {
                    this.e.a(this.f);
                }

                var19 = new short[]{59, 66, 74, 83, 114, 121, 129, 138};
                if (this.h != null) {
                    for (var16 = 0; var16 < 8; ++var16) {
                        if (this.e.K >= var19[var16] && this.e.K < var19[var16] + 7) {
                            if (this.h.n >= 25 && this.h.n < 155) {
                                var14 = var19[var16];
                                this.e.K = (short) var14;
                                break;
                            }

                            if (this.h.n >= 205 && this.h.n < 335) {
                                var14 = (short) (var19[var16] + 6);
                                this.e.K = (short) var14;
                                break;
                            }

                            if (this.h.n >= 165 && this.h.n < 175 || this.h.n >= 15 && this.h.n < 25) {
                                var14 = (short) (var19[var16] + 2);
                                this.e.K = (short) var14;
                                break;
                            }

                            if ((this.h.n < 155 || this.h.n >= 165) && (this.h.n < 5 || this.h.n >= 15)) {
                                if (this.h.n >= 345 && this.h.n < 355 || this.h.n >= 185 && this.h.n < 195) {
                                    var14 = (short) (var19[var16] + 4);
                                    this.e.K = (short) var14;
                                    break;
                                }

                                if ((this.h.n < 335 || this.h.n >= 345) && (this.h.n < 195 || this.h.n >= 205)) {
                                    var14 = (short) (var19[var16] + 3);
                                    this.e.K = (short) var14;
                                    break;
                                }

                                var14 = (short) (var19[var16] + 5);
                                this.e.K = (short) var14;
                                break;
                            }

                            var14 = (short) (var19[var16] + 1);
                            this.e.K = (short) var14;
                            break;
                        }
                    }
                }

                int var17;
                int var20;
                if (this.c.e[this.b][this.a].b > 0) {
                    if (this.e.p() && !this.e.bO && (this.d.d == 11 || this.d.d == 5) && VDTT_cw.v().c instanceof VDTT_cw) {
                        VDTT_cw.v().cN = 15;
                    }

                    var20 = this.c.e[this.b][this.a].c;
                    var16 = this.c.e[this.b][this.a].d;
                    if ((var17 = this.c.e[this.b][this.a].b) == 376 && this.d.e == 2) {
                        var17 = 12;
                    }

                    if (var17 == 394 && this.d.k()) {
                        if (this.e.m == 5) {
                            var17 = 480 + this.e.aB;
                        } else if (this.e.m == 4) {
                            switch (this.e.aB) {
                                case 0:
                                case 1:
                                case 2:
                                    var17 = 464;
                                    break;
                                case 3:
                                    var17 = 463;
                                    break;
                                case 4:
                                    var17 = 465;
                                    break;
                                case 5:
                                    var17 = 466;
                            }
                        } else if (this.e.m == 3) {
                            switch (this.e.aB) {
                                case 0:
                                    var17 = 403;
                                    break;
                                case 1:
                                    var17 = 460;
                                    break;
                                case 2:
                                    var17 = 461;
                                    break;
                                case 3:
                                    var17 = 476;
                                    break;
                                case 4:
                                    var17 = 477;
                                    break;
                                case 5:
                                    var17 = 462;
                            }
                        } else if (this.e.aB == 2 && this.e.m == 2) {
                            var17 = 395;
                        } else if ((this.e.aB == 3 || this.e.aB == 4) && this.e.m == 2) {
                            var17 = 400;
                        } else if (this.e.aB == 5 && this.e.m == 1) {
                            var17 = 401;
                        } else {
                            var17 += this.e.aB;
                        }
                    }

                    if (this.e.bv != null) {
                        if (var17 == 427) {
                            var17 = 431;
                        } else if (var17 == 430) {
                            var17 = 436;
                        } else if (var17 == 428) {
                            var17 = 437;
                        } else if (this.e.bv.a == 86 && this.d.d == 18) {
                            var20 = (int) ((float) var20 + (float) var20 * 5.4F / 10.0F);
                            var16 = (int) ((float) var16 + (float) var16 * 5.4F / 10.0F);
                        } else {
                            var20 = (int) ((float) var20 + (float) var20 * 4.6F / 10.0F);
                            var16 = (int) ((float) var16 + (float) var16 * 4.6F / 10.0F);
                        }
                    } else if (this.e.ae()) {
                        var20 = (int) ((float) var20 + (float) var20 * 1.8F / 10.0F);
                        var16 = (int) ((float) var16 + (float) var16 * 1.8F / 10.0F);
                        if (var17 == 427) {
                            var20 += 2;
                            var16 -= 4;
                        }
                    }

                    VDTT_hi var21;
                    if (this.e.aF == 3) {
                        (var21 = new VDTT_hi(var17, this.e.objX - var20, this.e.objY + var16)).p = true;
                    } else {
                        var21 = new VDTT_hi(var17, this.e.objX + var20, this.e.objY + var16);
                    }

                    if (this.d.d >= 30 && this.d.d <= 36 && this.e.ad()) {
                        var21.M = 95;
                    }

                    var2.add(var21);
                }

                short var10001 = this.c.e[this.b][this.a].e;
                VDTT_es var22 = DataCenter.d().B[var10001];
                if (this.c.e[this.b][this.a].e > 0 && (this.f != null || var22.a == 15 || var22.a == 23)) {
                    this.g = true;
                    var20 = this.c.e[this.b][this.a].f;
                    var16 = this.c.e[this.b][this.a].g;
                    if (this.e.bv != null) {
                        var20 = (int) ((float) var20 + (float) var20 * 3.5F / 10.0F);
                        var16 = (int) ((float) var16 + (float) var16 * 3.5F / 10.0F);
                    }

                    if (this.e.aF == 3) {
                        var17 = this.e.objX - var20;
                        var20 = this.e.objY + var16;
                    } else {
                        var17 = this.e.objX + var20;
                        var20 = this.e.objY + var16;
                    }

                    var16 = this.c.d;
                    if (this.f == null) {
                        this.f = new VDTT_fb(var17, var20);
                    }

                    VDTT_ek var6;
                    label353:
                    {
                        (var6 = new VDTT_ek()).bw = this.e.bw;
                        var6.bv = this.e.bv;
                        var6.bq = this.e.bq;
                        var6.W = this.e.W;
                        var6.av = this.e.av;
                        var6.m = this.e.m;
                        var6.ag = var6.ai = 1;
                        var6.aR = (Item[]) this.e.aR.clone();
                        var6.d = this.e.d;
                        var6.aF = this.e.aF;
                        var6.e = 7;
                        var10001 = this.c.e[this.b][this.a].e;
                        if (DataCenter.d().B[var10001].a != 21) {
                            var10001 = this.c.e[this.b][this.a].e;
                            if (DataCenter.d().B[var10001].a != 24) {
                                break label353;
                            }
                        }

                        var6 = this.e;
                    }

                    VDTT_er var11;
                    if (var16 != 2 && var16 != 3) {
                        var11 = new VDTT_er(this.c.e[this.b][this.a].e, var17, var20, this.f, this.c.b, var16, false, var1, var2, var6, this.e, this.k);
                        this.k = var11.m;
                        var1.add(var11);
                    } else {
                        var16 -= 2;
                        if (VDTT_jb.b()) {
                            var11 = new VDTT_er(this.c.e[this.b][this.a].e, var17, var20, this.f, -1, var16, false, var1, var2, var6, this.e, this.k);
                            this.k = var11.m;
                            var1.add(var11);
                        } else {
                            var11 = new VDTT_er(this.c.e[this.b][this.a].e, var17, var20, this.f, this.c.b, var16, false, var1, var2, var6, this.e, this.k);
                            this.k = var11.m;
                            var1.add(var11);
                        }
                    }

                    if (var11.p() || var11.m().a == 20) {
                        this.h = var11;
                    }
                }

                return;
            }

            var4 = null;
            this.e.aV = var4;
            if (this.e.aW.size() > 0) {
                var10000 = this.e;
                var4 = (VDTT_ii) this.e.aW.remove(0);
                var10000.aV = var4;
                this.e.e = 3;
            } else if (this.e.p()) {
                if ((var12 = this.e).aV != null) {
                    var12.e = 3;
                    var12.G();
                } else {
                    var12.e = 0;
                }
            } else {
                this.e.e = 0;
            }

            if (this.f != null) {
                if (this.c.b > 0 && !this.g) {
                    VDTT_hi var13 = new VDTT_hi(this.c.b, this.f.objX, this.f.objY);
                    if (this.c.d == 1) {
                        var13 = new VDTT_hi(this.c.b, this.f.k(), this.f.l());
                    }

                    if (this.d.d >= 30 && this.d.d <= 36 && this.e.ad()) {
                        var13.M = 95;
                    }

                    var2.add(var13);
                }

                if (this.c.c > 0) {
                    VDTT_er var15 = new VDTT_er(this.c.c, this.f.objX, this.f.objY, this.f, -1, 0, false, var1, var2);
                    var1.add(var15);
                }
            }

            this.a();

            try {
                if (this.e.p() && !this.d.i() && !this.d.j() && this.d.d != 58 && (this.h == null || !this.h.p() || this.h.K == 1)) {
                    if (this.h != null) {
                        this.h.K = 2;
                    }

                    this.e.a(this.f, this.d);
                }
            } catch (Exception var8) {
            }
        } catch (Exception var10) {
            //var10.printStackTrace();
            var4 = null;
            this.e.aV = var4;
            this.e.j();
        }

    }

    private void a() {
        if (!this.l) {
            if (this.f != null) {
                this.l = true;
                VDTT_gk var1 = null;
                if (this.f instanceof VDTT_gk) {
                    if ((var1 = (VDTT_gk) this.f).p().p == 7) {
                        new VDTT_er(13, var1.k(), var1.l(), var1, -1, 0, false, VDTT_cw.v().as, VDTT_cw.v().au);
                    } else {
                        this.f.a((XYEntity) this.e);
                    }

                    if (var1.p().p == 7 || !var1.o()) {
                        int var2 = 2;
                        if (var1.p().p == 7) {
                            if (VDTT_jb.a((int) 10) == 0) {
                                var2 = VDTT_jb.a(5, 15);
                            } else {
                                var2 = VDTT_jb.a(1, 5);
                            }
                        }

                        if (this.f.objX < this.e.objX) {
                            var1.av = -var2;
                        } else {
                            var1.av = var2;
                        }

                        if (this.f.objY < this.e.objY) {
                            var1.aw = -1;
                        } else {
                            var1.aw = 1;
                        }
                    }
                }

                if (this.f.e != 3 && !this.d.e()) {
                    this.f.i();
                    if (this.g && var1 != null && var1.aB == 0) {
                        var1.aB = 1;
                    }
                }
            }

        }
    }
}
