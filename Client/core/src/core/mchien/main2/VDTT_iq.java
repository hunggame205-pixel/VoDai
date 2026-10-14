package core.mchien.main2;

import java.util.Vector;

public final class VDTT_iq extends VDTT_ae {
    public VDTT_hs a;
    public VDTT_hp b;
    private VDTT_gg h;
    private Vector[] i;
    private MainScreen j;
    private short k = 21;
    public int c;
    public boolean[] d;
    public boolean[] e;
    public boolean f;
    public VDTT_iq g;
    private VDTT_ar l;

    public VDTT_iq(VDTT_hp var1, VDTT_ar var2) {
        this.l = var2;
        this.a(var1, 10, var2.f() + 6, var2.q - 8 - 12, 23, 33, var2, false);
        this.c = var2.h() - 12;
    }

    public VDTT_iq(VDTT_hp var1, int var2, int var3, int var4, int var5, int var6, MainScreen var7) {
        this.a(var1, var2, var3, var4, 23, var6, var7, false);
    }

    public final void a() {
        int var1 = this.h();
        Vector var2 = new Vector();

        for (int var3 = 0; var3 < this.e.length; ++var3) {
            if (!this.e[var3]) {
                var2.add(this.b.c[var3]);
            }
        }

        String[] var5 = new String[var2.size()];

        for (int var4 = 0; var4 < var5.length; ++var4) {
            var5[var4] = (String) var2.get(var4);
        }

        this.g = new VDTT_iq(new VDTT_hp(this.b.a, var5), this.l);
        this.g.a(var1);
    }

    public final void b() {
        if (this.g != null) {
            Vector var1 = new Vector();

            int var2;
            for (var2 = 0; var2 < this.e.length; ++var2) {
                if (!this.e[var2]) {
                    var1.add(this.d[var2]);
                }
            }

            this.g.d = new boolean[var1.size()];

            for (var2 = 0; var2 < this.g.d.length; ++var2) {
                this.g.d[var2] = (Boolean) var1.get(var2);
            }

        }
    }

    private void a(VDTT_hp var1, int var2, int var3, int var4, int var5, int var6, MainScreen var7, boolean var8) {
        var6 = var4 / var1.c.length;
        this.f(var2, var3);
        this.d(var4, var5);
        this.j = var7;
        this.b = var1;
        this.a = new VDTT_hs((byte) 0, 0, 2, var4, var5 - 3, var6, var1.c.length);
        byte var9 = -1;
        this.a.I = var9;
        this.h = new VDTT_gg(0, 0, 0, 2, (byte) 7, var1.c.length);
        this.i = new Vector[var1.c.length];

        for (var2 = 0; var2 < this.i.length; ++var2) {
            this.i[var2] = new Vector();
        }

        this.d = new boolean[var1.c.length];
        this.e = new boolean[var1.c.length];
    }

    public final void c() {
        for (int var1 = 0; var1 < this.i.length; ++var1) {
            for (int var2 = 0; var2 < this.i[var1].size(); ++var2) {
                this.j.f.removeElement(this.i[var1].elementAt(var2));
            }
        }

    }

    public final void d() {
        this.h = new VDTT_gg(0, 0, 0, 0, (byte) 7, this.b.c.length);
    }

    public final void e() {
//      while(true) {
        this.a.a();
        this.h.a();
        if (this.g == null) {
            return;
        }
        this.g.e();
        //todo fix ở đây
//         this = this.g;
//      }
    }

    public final VDTT_hl f() {
//      while(this.g != null) {
        //todo fix ở đây
//         this = this.g;
//      }
        if (this.g != null) {
            return this.g.f();
        }
        if (this.f) {
            return this.a.a(this.b.a, -10000, -10000, this.j);
        } else {
            return this.a.a(this.b.a, this.objX, this.objY, this.j);
        }
    }

    public final int g() {
        return this.g != null ? this.g.b.b : this.b.b;
    }

    public final int h() {
        try {
            return this.b.b;
        } catch (Exception var1) {
            return 0;
        }
    }

    public final void a(int var1) {
        if (this.g != null) {
            this.g.b.b = var1;
            String var3 = this.g.b.c[this.g.h()];

            for (int var2 = 0; var2 < this.b.c.length; ++var2) {
                if (var3.equals(this.b.c[var2])) {
                    this.b(var2);
                    return;
                }
            }

        } else {
            this.b(var1);
        }
    }

    private void b(int var1) {
        if (var1 < 0 || var1 >= this.e.length || !this.e[var1]) {
            this.b.b = var1;

            for (var1 = 0; var1 < this.i.length; ++var1) {
                for (int var2 = 0; var2 < this.i[var1].size(); ++var2) {
                    this.j.f.removeElement(this.i[var1].elementAt(var2));
                }
            }

            for (var1 = 0; var1 < this.i[this.b.b].size(); ++var1) {
                this.j.f.addElement(this.i[this.b.b].elementAt(var1));
            }

            for (var1 = 0; var1 < this.j.f.size(); ++var1) {
                if (this.j.f.get(var1) instanceof VDTT_an) {
                    this.j.f.remove(var1);
                    return;
                }
            }

        }
    }

    public final void a(Graphics var1) {
        //todo fix ở đây
//        if (this.f)
//            return;
//      while(!this.f) {
        if (this.g == null) {
            boolean var8 = false;
            Graphics var2 = var1;
            VDTT_iq var9 = this;
            if (!this.f) {
                int var3 = var1.e;
                int var4 = var1.f;
                this.a(var1, this.j.objX + this.objX, this.j.objY + this.objY);
                VDTT_dc.b(var1, 87, 88, 0, -1, this.q, 29);
                if (this.a.i < 2) {
                    VDTT_dc.b(var1, 47, 48, 0, -1, this.q, 29);
                } else if (this.h() == 0) {
                    VDTT_dc.c(var1, 47, 48, this.h() * this.a.h, -1, this.a.h, 29);
                } else if (this.h() == this.a.i - 1) {
                    VDTT_dc.e(var1, 47, 48, this.h() * this.a.h, -1, this.q - this.h() * this.a.h, 29);
                } else {
                    VDTT_dc.d(var1, 47, 48, this.h() * this.a.h, -1, this.a.h, 29);
                }

                this.a.b(var1, this.j.objX + this.objX, this.j.objY + this.objY, this.a.q, this.a.r);

                for (int var5 = 0; var5 < var9.a.i; ++var5) {
                    if (var9.a.b(var5) && (var5 < 0 || var5 >= var9.e.length || !var9.e[var5])) {
                        String var6 = var9.b.c[var5];
                        byte var7 = 0;
                        if (var5 == 0) {
                            var7 = 2;
                        }

                        if (var5 == var9.a.i - 1) {
                            var7 = -2;
                        }

                        if (var5 == var9.h()) {
                            VDTT_dg.b(VDTT_dg.e, var2, var6, var7 + var5 * var9.a.h + var9.a.h / 2 - 1, 11 + var9.h.b(var5) - 2, 2, -2560, -11184811);
                        } else if (var5 == var9.a.l) {
                            VDTT_dg.b(VDTT_dg.e, var2, var6, var7 + var5 * var9.a.h + var9.a.h / 2, 12 + var9.h.b(var5) - 2, 2, -1, -11184811);
                        } else {
                            VDTT_dg.b(VDTT_dg.e, var2, var6, var7 + var5 * var9.a.h + var9.a.h / 2 - 1, 11 + var9.h.b(var5) - 2, 2, -1, -11184811);
                        }

                        if (var9.d[var5]) {
                            VDTT_dc.a(var2, 713, 0, var7 + var5 * var9.a.h + var9.a.h / 2 - 2, 11 + var9.h.b(var5) + 5, 0);
                        }

                        if (var9.j instanceof VDTT_kd && var9.b.d != null && var9.b.d[var5] > 0) {
                            int var10 = VDTT_dg.b(VDTT_dg.e, var6);
                            VDTT_dc.a(var2, 713, 0, var7 + var5 * var9.a.h + var9.a.h / 2 - 2 + var10 / 2, 5 + var9.h.b(var5) - 2, 0);
                        }
                    }
                }

                if (var9.h.a || var9.b.c.length * var9.a.h > var9.q - 4) {
                    var9.a(var2, 0, 0);
                    var2.d(0, 0, DataCenter.d().n, DataCenter.d().o);
                }

                var9.a(var2, var3, var4);
            }

            return;
        }
        this.g.a(var1);
        //todo fix ở đây
//         this = this.g;
//      }

    }

    public final void a(VDTT_m var1, int var2) {
        this.i[var2].addElement(var1);
    }

    public final void a(Vector var1) {
        for (int var2 = 0; var2 < this.i.length; ++var2) {
            for (int var3 = 0; var3 < this.i[var2].size(); ++var3) {
                var1.addElement(this.i[var2].elementAt(var3));
            }
        }

    }

    public final int i() {
        return this.objY + this.r;
    }

    public final int j() {
        return this.b.c.length;
    }
}
