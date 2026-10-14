package core.mchien.main2;

import java.util.Vector;

public final class VDTT_lq extends VDTT_jr {
   public Item O;
   public int P;
   public int Q;
   public Item[][] R;
   public VDTT_hn[] S;
   public VDTT_ba T;
   public long U = -1L;
   public long V = -1L;
   public VDTT_ft[] W;
   private VDTT_hs au;
   private VDTT_hs av;
   private VDTT_hs aw;
   private VDTT_hs[] ax;
   private VDTT_hs[] ay;
   private VDTT_hs[] az;
   private VDTT_ba[] aA;
   private VDTT_ba[] aB;
   private VDTT_ba[] aC;
   private VDTT_hs aD;
   public int X = -1;
   private VDTT_iq aE;
   public VDTT_iq Y;
   private int[] aF = new int[]{10, 20, 30, 60, 100};
   private VDTT_bf[] aG = new VDTT_bf[2];
   public VDTT_cb Z;
   private VDTT_ho aH;
   private VDTT_ft aI;
   private VDTT_ba aJ;
   private VDTT_ba aK;
   public VDTT_ht[] aa;
   public VDTT_hs[][] am;
   public VDTT_ba[][] an;
   public int ao = 102;
   public int ap = 50;
   private int aL;
   public int aq = 75;
   private int aM = -1;
   private int aN = -1;
   public boolean[] ar;
   private int aO = -1;
   private boolean aP;
   private int aQ = 0;
   public boolean as = false;
   public int at;

   public VDTT_lq(VDTT_p var1) {
      super(var1, Caption.yY);
      this.a(323);
      VDTT_cw.v().bj = new VDTT_ft[0];
      VDTT_cw.v().bi = new VDTT_ft[0];
      this.aE = new VDTT_iq(new VDTT_hp(1001, new String[]{"", ""}), this);
      this.aE.f = true;
      this.aG[0] = new VDTT_bf(18, 60, 85, 7, new VDTT_hp(1000, DataCenter.d().aw[DataCenter.d().m]), this, 0, true);
      this.aE.a(this.aG[0], 0);
      this.aH = new VDTT_ho(1000, VDTT_cw.v().bd);
      this.aE.a(new VDTT_bu(this.aG[0].objX, this.aG[0].objY + 38, Caption.iK, this, this.aH), 0);
      this.aE.a(new VDTT_bu(this.aG[0].objX, this.aG[0].objY + 57, Caption.iL, this, this.aH), 0);
      this.aE.a(new VDTT_bu(this.aG[0].objX, this.aG[0].objY + 76, Caption.iM, this, this.aH), 0);
      this.aE.a(new VDTT_bu(this.aG[0].objX, this.aG[0].objY + 95, Caption.iN, this, this.aH), 0);
      this.aE.a(new VDTT_bu(this.aG[0].objX, this.aG[0].objY + 114, Caption.iO, this, this.aH), 0);
      this.aE.a(new VDTT_bu(this.aG[0].objX, this.aG[0].objY + 133, Caption.py, this, this.aH), 0);
      this.aE.a(new VDTT_bu(this.aG[0].objX, this.aG[0].objY + 152, Caption.rt, this, this.aH), 0);
      VDTT_ba var2;
      VDTT_ba var10000 = var2 = new VDTT_ba(186, this.h() + 10, 0, 0, "", this, 1012, 286);
      short var4 = -360;
      var10000.K = var4;
      this.aE.a(var2, 0);
      this.aJ = new VDTT_ba(161, this.h() + 10, 0, 0, "", this, 1011, 287);
      var4 = -360;
      this.aJ.K = var4;
      this.aE.a(this.aJ, 0);
      this.aE.a(new VDTT_ba(233, this.h() + 10, 0, 0, "", this, 1013, 286), 0);
      this.aE.a(new VDTT_ba(258, this.h() + 10, 0, 0, "", this, 1014, 287), 0);
      this.E();
      this.aD = new VDTT_hs((byte)0, this.aG[0].objX, this.aG[0].objY, 28, 28, 28, 1);
      (var2 = new VDTT_ba(this.aG[0].objX + 35, this.aG[0].objY + 5, 0, 0, Caption.Ban, this, 1010, 15)).d(45, var2.r);
      this.aE.a(var2, 1);
      this.Z = new VDTT_cb(this.aG[0].objX, this.aG[0].objY + 45, 80, "", this, 0, 2, 0);
      this.aE.a(this.Z, 1);
      VDTT_hp var5;
      (var5 = new VDTT_hp(200)).c = Caption.ym;
      var5.b = 0;
      this.aG[1] = new VDTT_bf(this.aG[0].objX, this.aG[0].objY + 105, 80, 5, var5, this, 1, true);
      this.aE.a(this.aG[1], 1);
      this.F();
      boolean var6 = false;
      this.aE.a(super.b[0]);
      if (DataCenter.l()) {
         this.ao *= 3;
      }

      this.aL = 106;
      this.Y = new VDTT_iq(new VDTT_hp(1001, Caption.yX), this);
      if (DataCenter.l()) {
         this.Y.f = true;
      }

      this.R = new Item[this.Y.j()][];
      this.an = new VDTT_ba[this.Y.j()][];
      this.am = new VDTT_hs[this.Y.j()][];
      this.aa = new VDTT_ht[this.Y.j()];
      this.ar = new boolean[this.Y.j()];
      this.aK = this.a(this.q - 54, this.r - 25, "", this, 999, 671);
      this.a(this.aK, 2);
      this.f(VDTT_cw.v().be);
      if (!this.aP) {
         if (super.a.b == 0) {
            this.C();
         } else if (super.a.b == 1) {
            this.D();
         }
      }

      this.aQ = this.q / 2 - 22;
      if (DataCenter.n()) {
         this.N[0] = this.N[1] = true;
      }

   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].ac()) {
            this.ak.add(var1[var2]);
         }
      }

   }

   public final void C() {
      try {
         this.aP = true;
         Message var1;
         (var1 = new Message((byte)101)).a(this.aG[0].n.b);
         var1.a(VDTT_cw.v().bd);
         var1.b(this.P);
         var1.l();
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }

   private void g(int var1) {
      try {
         Message var2;
         (var2 = new Message((byte)101)).a(this.aG[0].n.b);
         var2.a(this.aH.b);
         var2.b(var1);
         var2.l();
      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }
   }

   public final void D() {
      try {
         this.aP = true;
         (new Message((byte)100)).l();
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public final void E() {
      this.au = new VDTT_hs((byte)1, 120, 60, this.q - 132, 150, 30, VDTT_cw.v().bj.length);
      this.aA = new VDTT_ba[VDTT_cw.v().bj.length];
      this.ax = new VDTT_hx[VDTT_cw.v().bj.length];

      for(int var1 = 0; var1 < VDTT_cw.v().bj.length; ++var1) {
         this.aA[var1] = new VDTT_ba(158, 4 + var1 * this.au.h, 0, 0, "", this, 1000, -5);
         this.aA[var1].d(26, 20);
         this.ax[var1] = new VDTT_hx((byte)1, 0, 0, this.aA[var1].q, this.aA[var1].r, this.aA[var1].r, 1, this.au);
      }

      this.J();
   }

   public final void F() {
      this.av = new VDTT_hs((byte)1, 120, 60, this.q - 132, 150, 30, VDTT_cw.v().bi.length);
      this.aB = new VDTT_ba[VDTT_cw.v().bi.length];
      this.ay = new VDTT_hx[VDTT_cw.v().bi.length];

      for(int var1 = 0; var1 < VDTT_cw.v().bi.length; ++var1) {
         this.aB[var1] = new VDTT_ba(158, 4 + var1 * this.av.h, 0, 0, "", this, 1000, -5);
         this.aB[var1].d(26, 20);
         this.ay[var1] = new VDTT_hx((byte)1, 0, 0, this.aB[var1].q, this.aB[var1].r, this.aB[var1].r, 1, this.av);
      }

      this.J();
   }

   public final void a_() {
      try {
         super.a_();
         int var1;
         if (super.a.b < 2) {
            this.aE.e();
            this.aw.a();

            for(var1 = 0; var1 < this.aC.length; ++var1) {
               this.aC[var1].a_();
               this.az[var1].a();
               if (this.az[var1].l != -1) {
                  this.aC[var1].N = true;
               } else {
                  this.aC[var1].N = false;
               }
            }
         } else if (super.a.b == 2) {
            this.Y.e();
            if (this.ar[this.Y.h()]) {
               return;
            }

            if (this.aa[this.Y.h()] != null) {
               this.aa[this.Y.h()].a();
            }

            if (this.an[this.Y.h()] != null) {
               for(var1 = 0; var1 < this.an[this.Y.h()].length; ++var1) {
                  if (this.an[this.Y.h()][var1] != null) {
                     this.an[this.Y.h()][var1].a_();
                     this.am[this.Y.h()][var1].a();
                     if (this.am[this.Y.h()][var1].l != -1) {
                        this.an[this.Y.h()][var1].N = true;
                     } else {
                        this.an[this.Y.h()][var1].N = false;
                     }
                  }
               }
            }
         } else {
            this.B();
         }

         if (VDTT_cw.v().br == 5 && VDTT_cw.v().bs == 0) {
            this.y();
         }

      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public final void b(Graphics var1) {
      try {
         super.b(var1);
         if (super.a.b < 2) {
            this.aE.a(var1);
            if (this.aE.h() == 0) {
               VDTT_dg.b(VDTT_dg.f, var1, "" + (this.P + 1), this.aJ.objX + 56, this.aJ.objY + 5, 2, -1, -16777216);
            }

            this.a(var1, this.aG[0].objX - 6, this.aG[0].objY - 24, 94, this.h() - 14, -11, 22, 23, 1, 1);
            this.f(var1);
            this.a(var1, this.objX, this.objY);
            switch(this.aE.h()) {
            case 0:
               this.a(var1, this.objX + 4, this.objY + this.f());
               VDTT_dg.b(VDTT_dg.d, var1, Caption.iP, this.aG[0].objX, this.aG[0].objY - 40, 0, -6488, -10275328);
               VDTT_dg.b(VDTT_dg.d, var1, Caption.iQ, this.aG[0].objX, this.aG[0].objY, 0, -6488, -10275328);
               break;
            case 1:
               a(var1, this.aD.objX, this.aD.objY, this.O, false);
               this.a(var1, this.objX + 4, this.objY + this.f());
               int var2 = this.aD.objY + 5;
               int var3 = this.aD.objX - 2;
               VDTT_dg.b(VDTT_dg.d, var1, Caption.hn, var3, var2 - 45, 0, -6488, -10275328);
               VDTT_dg.b(VDTT_dg.d, var1, Caption.iR, var3, var2 + 5, 0, -6488, -10275328);
               VDTT_dg.b(VDTT_dg.d, var1, Caption.iS, var3, var2 + 60, 0, -6488, -10275328);
               VDTT_dg.b(VDTT_dg.d, var1, Caption.iT, var3, var2 + 100, 0, -6488, -10275328);
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(this.aF[this.aG[1].n.b]), var3 + 20, var2 + 100, 0, -3089954, -16777216);
               a(var1, var3 + 20, 166, VDTT_jb.c(this.aF[this.aG[1].n.b]), (byte)0);
               VDTT_dg.b(VDTT_dg.d, var1, "1%", var3 + 20, var2 + 117, 0, -3089954, -16777216);
               a(var1, var3 + 20, var2 + 117, "1%", (byte)0);
               this.aD.b(var1, this);
               return;
            default:
               return;
            }
         } else if (super.a.b == 2) {
            this.Y.a(var1);
            this.aK.b(false);
            if (this.ar[this.Y.h()]) {
               return;
            }

            try {
               if (this.Y.h() == 3) {
                  this.h(var1);
               } else {
                  if (this.Y.h() != 2) {
                     this.g(var1);
                     return;
                  }

                  this.i(var1);
               }
            } catch (Exception var5) {
            }
         }

      } catch (Exception var6) {
         VDTT_jb.a(var6);
      }
   }

   private void f(Graphics var1) {
      try {
         this.b(var1, this.aw);
         var1.f(7049372);
         this.a(var1, 0, -24, this.aw.q, 21, -11, 22, 23, 1, 1);
         if (this.aE.h() == 0) {
            VDTT_dg.b(VDTT_dg.e, var1, Caption.iU, 5, -14, 0, -6488, -10275328);
         } else {
            VDTT_dg.b(VDTT_dg.e, var1, Caption.iV, 5, -14, 0, -6488, -10275328);
         }

         VDTT_dg.b(VDTT_dg.e, var1, Caption.iW, 107, -14, 0, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.iX, 161, -14, 0, -6488, -10275328);
         this.a(var1, this.aw);

         for(int var5 = 0; var5 < this.aw.i; ++var5) {
            if (this.aw.b(var5)) {
               this.a(var1, 36, var5 * this.aw.h, this.aw.q - 38, this.aw.h - 1, 46, 22, 23, 1, 1);
               b(var1, 5, var5 * this.aw.h, this.W[var5].e, this.X == var5);
               VDTT_dg.b(VDTT_dg.d, var1, this.W[var5].b, 38, 8 + var5 * this.aw.h, 0, -1, -16777216);
               int var2;
               int var3;
               if (this.W[var5].e.M() > 1) {
                  var2 = this.W[var5].c / this.W[var5].e.M();
                  String var4 = Caption.aI + " " + VDTT_jb.c(this.W[var5].c);
                  var3 = VDTT_dg.b(VDTT_dg.b, var4);
                  VDTT_dg.b(VDTT_dg.b, var1, var4, 38, 23 + var5 * this.aw.h, 0, -3089954, -16777216);
                  VDTT_dg.b(VDTT_dg.b, var1, VDTT_jb.c(var2) + "/1", 56 + var3, 23 + var5 * this.aw.h, 0, -3089954, -16777216);
                  var1.c(-3089954);
                  VDTT_dc.a(var1, 98, 90, 41 + var3, 23 + var5 * this.aw.h, 6);
                  var1.f();
               } else {
                  VDTT_dg.b(VDTT_dg.d, var1, Caption.aI + " " + VDTT_jb.c(this.W[var5].c), 38, 23 + var5 * this.aw.h, 0, -3089954, -16777216);
               }

               if ((var2 = (int)((long)this.W[var5].d - VDTT_jb.a() / 1000L)) >= 60) {
                  VDTT_dg.b(VDTT_dg.c, var1, Caption.bX + " " + VDTT_jb.f(var2), 127, 9 + var5 * this.aw.h, 2, -6488, -10275328);
               } else {
                  VDTT_dg.b(VDTT_dg.c, var1, Caption.yZ[0] + " " + Caption.yZ[1], 127, 9 + var5 * this.aw.h, 2, -6488, -10275328);
               }

               var2 = var1.e;
               var3 = var1.f;
               this.a(var1, var2 + this.aC[var5].objX, var3 + this.aC[var5].objY);
               this.aC[var5].b(var1);
               this.a(var1, var2, var3);
            }
         }

         this.a(var1);
         this.aw.b(var1, this);
      } catch (Exception var6) {
         VDTT_jb.a(var6);
      }
   }

   private void g(Graphics var1) {
      if (this.aa[this.Y.h()] != null) {
         this.a(var1, this.aa[this.Y.h()]);
         int var4 = 0;

         for(int var7 = 0; var7 < this.aa[this.Y.h()].i; ++var7) {
            int var3 = var7 * this.ap;

            for(int var8 = 0; var8 < this.aa[this.Y.h()].P; ++var8) {
               int var2 = var8 * this.ao;
               if (this.aa[this.Y.h()].b(var7)) {
                  this.a(var1, var2, var3, this.ao - 3, 47, -11, 22, 23, 1, 1);
                  b(var1, var2 + 5, var3 + 5, this.R[this.Y.h()][var4], this.X == var4);
                  int var5 = var1.e;
                  int var6 = var1.f;
                  if (!DataCenter.l()) {
                     VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, VDTT_jb.a(this.R[this.Y.h()][var4].getItemTemplate().b, 30), var2 + 5, var3 + 39, 0, -6488, -10275328);
                     this.a(var1, var5 + this.an[this.Y.h()][var4].objX, var6 + this.an[this.Y.h()][var4].objY);
                     VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.aI + " " + VDTT_jb.c(this.R[this.Y.h()][var4].c()), 0, -6, 0, -1, -11184811);
                  } else {
                     VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, VDTT_jb.a(this.R[this.Y.h()][var4].getItemTemplate().b, 30), var2 + 39, var3 + 9, 0, -6488, -10275328);
                     VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.aI + " " + VDTT_jb.c(this.R[this.Y.h()][var4].c()), var2 + 39, var3 + 21, 0, -1, -11184811);
                     this.a(var1, var5 + this.an[this.Y.h()][var4].objX, var6 + this.an[this.Y.h()][var4].objY);
                  }

                  this.an[this.Y.h()][var4].b(var1);
                  this.a(var1, var5, var6);
               }

               ++var4;
               if (var4 >= this.an[this.Y.h()].length) {
                  break;
               }
            }

            if (var4 >= this.an[this.Y.h()].length) {
               break;
            }
         }

         this.a(var1);
         this.aa[this.Y.h()].b(var1, this);
      }
   }

   private void h(Graphics var1) {
      if (this.R[this.Y.h()].length == 0) {
         this.aK.b(true);
         VDTT_dg.a(VDTT_dg.e, var1, Caption.oS, this.q / 2, this.r / 2 + 10, 2, -2560, 2, 1);
      } else {
         if (VDTT_jb.a() >= this.U && VDTT_jb.a() < this.V) {
            String var3 = "";
            String var4 = "";
            if (this.U >= 0L) {
               var3 = Caption.oO + VDTT_jb.e(this.U);
            }

            if (this.V >= 0L) {
               var4 = Caption.oP + VDTT_jb.e(this.V);
            }

            String var2;
            if (this.U >= 0L && this.V >= 0L) {
               var2 = var3 + " - " + var4;
            } else {
               var2 = var3 + var4;
            }

            VDTT_dg.a(var1, var2, this.q / 2 - 22, this.r - 16, 2, -2560);
         } else {
            VDTT_dg.a(var1, Caption.wm, this.q / 2 - 22, this.r - 16, 2, -2560);
         }

         this.a(var1, this.aa[this.Y.h()]);
         int var13 = 0;

         for(int var6 = 0; var6 < this.aa[this.Y.h()].i; ++var6) {
            int var12 = var6 * 75;

            for(int var7 = 0; var7 < this.aa[this.Y.h()].P; ++var7) {
               int var11 = var7 * this.ao;
               if (this.aa[this.Y.h()].b(var6)) {
                  Item var8 = this.R[this.Y.h()][var13];
                  this.a(var1, var11, var12, this.ao - 3, 72, -11, 22, 23, 1, 1);
                  VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.xC + (var8.r + 1), var11 + 5, var12 + 8, 0, -6488, -10275328);
                  VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.yV[0] + VDTT_jb.c(var8.q), var11 + 38, var12 + 19, 0, -1, -10275328);
                  VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.yV[1] + VDTT_jb.c(var8.c()), var11 + 38, var12 + 28, 0, -1, -10275328);
                  if (var8.e == 0) {
                     VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, Caption.yV[3], var11 + 38, var12 + 39, 0, -65536, -11184811);
                  } else if (var8.e > 0) {
                     VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, VDTT_jb.b(Caption.yV[2], "" + var8.e), var11 + 38, var12 + 37, 0, -16711681, -10275328);
                  }

                  b(var1, var11 + 5, var12 + 15, var8, this.X == var13);
                  VDTT_dc.a(var1, 757, 0, var11 + 7, var12 + 45, 20);
                  VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, "-" + (100 - var8.c() * 100 / var8.q) + "%", var11 + 18, var12 + 57, 2, -1, -10275328);
                  var11 = var1.e;
                  int var5 = var1.f;
                  this.a(var1, var11 + this.an[this.Y.h()][var13].objX, var5 + this.an[this.Y.h()][var13].objY);
                  if (var8.r == this.at) {
                     this.an[this.Y.h()][var13].a(this.as);
                  } else {
                     this.an[this.Y.h()][var13].a(true);
                     String var10;
                     VDTT_ba var10000;
                     if (var13 < this.at) {
                        var10000 = this.an[this.Y.h()][var13];
                        var10 = Caption.xD;
                        var10000.l = var10;
                     } else {
                        var10000 = this.an[this.Y.h()][var13];
                        var10 = Caption.iJ;
                        var10000.l = var10;
                     }
                  }

                  if (var8.e == 0) {
                     this.an[this.Y.h()][var13].d = true;
                  } else {
                     this.an[this.Y.h()][var13].b(var1);
                  }

                  this.a(var1, var11, var5);
               }

               ++var13;
               if (var13 >= this.an[this.Y.h()].length) {
                  break;
               }
            }

            if (var13 >= this.an[this.Y.h()].length) {
               break;
            }
         }

         this.a(var1);
         this.aa[this.Y.h()].b(var1, this);
      }
   }

   private void i(Graphics var1) {
      VDTT_dg.a(var1, Caption.wO, this.aQ, this.r - 16, 2, -2560);
      this.a(var1, this.aa[this.Y.h()]);
      int var4 = 0;

      for(int var6 = 0; var6 < this.aa[this.Y.h()].i; ++var6) {
         int var3 = var6 * 75;

         for(int var7 = 0; var7 < this.aa[this.Y.h()].P; ++var7) {
            int var2 = var7 * this.ao;
            if (this.aa[this.Y.h()].b(var6)) {
               this.a(var1, var2, var3, this.ao - 3, 72, -11, 22, 23, 1, 1);
               VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, this.S[var4].a, var2 + 5, var3 + 9, 0, -6488, -10275328);

               int var5;
               for(var5 = 0; var5 < this.S[var4].b.length; ++var5) {
                  b(var1, var2 + 4 + var5 * 31, var3 + 16, this.S[var4].b[var5], this.X == var4 && this.aN == var5);
               }

               VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.sj, var2 + 5, var3 + 53, 0, -1, -11184811);
               VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, VDTT_jb.c(this.R[this.Y.h()][var4].c()) + Caption.de, var2 + 7, var3 + 63, 0, -1, -11184811);
               var2 = var1.e;
               var5 = var1.f;
               this.a(var1, var2 + this.an[this.Y.h()][var4].objX, var5 + this.an[this.Y.h()][var4].objY);
               this.an[this.Y.h()][var4].b(var1);
               this.a(var1, var2, var5);
            }

            ++var4;
            if (var4 >= this.an[this.Y.h()].length) {
               break;
            }
         }

         if (var4 >= this.an[this.Y.h()].length) {
            break;
         }
      }

      this.a(var1);
      this.aa[this.Y.h()].b(var1, this);
   }

   public final Vector g() {
      Vector var1 = super.g();
      int var2;
      int var3;
      int var4;
      if (super.a.b < 2) {
         for(var4 = 0; var4 < this.aC.length; ++var4) {
            var2 = this.aw.objX + this.aC[var4].objX;
            var3 = this.aw.objY + this.aC[var4].objY - this.aw.f;
            if (VDTT_jb.a(this.aw.objX, this.aw.objY, this.aw.objX + this.aw.q, this.aw.objY + this.aw.r, var2, var3) && VDTT_jb.a(this.aw.objX, this.aw.objY, this.aw.objX + this.aw.q, this.aw.objY + this.aw.r, var2 + this.aC[var4].q, var3 + this.aC[var4].r)) {
               this.az[var4].objX = (short)var2;
               this.az[var4].objY = (short)var3;
               var1.addElement(new VDTT_hl(7000 + var4, this.az[var4].objX, this.az[var4].objY, this.az[var4].objX + this.az[var4].q, this.az[var4].objY + this.az[var4].r, this.az[var4], this));
               var1.addElement(new VDTT_hl(8000 + var4, var2 - 153, var3 - 4, var2 - 153 + 28, var3 - 4 + 28, this.aw, this));
            }
         }

         var1.addElement(this.aE.f());
         var1.addElement(this.aw.a(1003, this));
         switch(this.aE.h()) {
         case 1:
            var1.addElement(this.aD.a(1002, this));
            var1.addElement(new VDTT_hl(1004, this.aG[0].objX, this.aG[0].objY + 128, this.aG[0].objX + 60, this.aG[0].objY + 128 + 27, (VDTT_hs)null, this));
         }
      } else if (super.a.b == 2) {
         if (this.ar[this.Y.h()]) {
            var1.addElement(this.Y.f());
            return var1;
         }

         try {
            var4 = 0;
            if (this.an[this.Y.h()] != null) {
               for(int var5 = 0; var5 < this.an[this.Y.h()].length; ++var5) {
                  var2 = this.aa[this.Y.h()].objX + this.an[this.Y.h()][var5].objX;
                  var3 = this.aa[this.Y.h()].objY + this.an[this.Y.h()][var5].objY - this.aa[this.Y.h()].f;
                  if (VDTT_jb.a(this.aa[this.Y.h()].objX, this.aa[this.Y.h()].objY, this.aa[this.Y.h()].objX + this.aa[this.Y.h()].q, this.aa[this.Y.h()].objY + this.aa[this.Y.h()].r, var2, var3) && VDTT_jb.a(this.aa[this.Y.h()].objX, this.aa[this.Y.h()].objY, this.aa[this.Y.h()].objX + this.aa[this.Y.h()].q, this.aa[this.Y.h()].objY + this.aa[this.Y.h()].r, var2 + this.an[this.Y.h()][var5].q, var3 + this.an[this.Y.h()][var5].r)) {
                     this.am[this.Y.h()][var5].objX = (short)var2;
                     this.am[this.Y.h()][var5].objY = (short)var3;
                     if (!this.an[this.Y.h()][var5].c && !this.an[this.Y.h()][var5].d) {
                        var1.addElement(new VDTT_hl(3000 + var5, this.am[this.Y.h()][var5].objX, this.am[this.Y.h()][var5].objY, this.am[this.Y.h()][var5].objX + this.am[this.Y.h()][var5].q, this.am[this.Y.h()][var5].objY + this.am[this.Y.h()][var5].r, this.am[this.Y.h()][var5], this));
                     }

                     if (this.Y.h() == 2) {
                        if (this.S[var4] != null) {
                           for(int var6 = 0; var6 < this.S[var4].b.length; ++var6) {
                              var1.addElement(new VDTT_hl(5000 + var5, var2 - 48 + var6 * 31, var3 - 30, var2 - 48 + var6 * 31 + 28, var3 - 30 + 28, this.aa[this.Y.h()], this, var6));
                           }
                        }
                     } else {
                        if (this.Y.h() == 3) {
                           var2 += 2;
                           var3 -= 23;
                        }

                        if (DataCenter.l()) {
                           var1.addElement(new VDTT_hl(5000 + var5, var2 - 241, var3 - 9, var2 - 241 + 28, var3 - 9 + 28, this.aa[this.Y.h()], this));
                        } else {
                           var1.addElement(new VDTT_hl(5000 + var5, var2 - 35, var3 - 9, var2 - 35 + 28, var3 - 9 + 28, this.aa[this.Y.h()], this));
                        }
                     }
                  }

                  ++var4;
               }
            }

            var1.addElement(this.Y.f());
            if (this.aa[this.Y.h()] != null) {
               var1.addElement(new VDTT_hl(1002, this.aa[this.Y.h()].objX, this.aa[this.Y.h()].objY, this.aa[this.Y.h()].objX + this.aa[this.Y.h()].q, this.aa[this.Y.h()].objY + this.aa[this.Y.h()].r, this.aa[this.Y.h()], this));
            }
         } catch (Exception var7) {
         }
      }

      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         this.d();
      }

      super.a(var1, var2, var3);
      if (this.I.c.equals(this)) {
         if (super.a.b < 2) {
            if (var1.b == 2000) {
               this.b(false, this.W[this.X]);
            }

            this.X = -1;
            if (var1.b >= 7000 && var1.b < 8000) {
               this.Q = 1;
               this.X = var1.b - 7000;
               this.b(true, this.W[this.X]);
            } else if (var1.b >= 8000 && var1.b < 9000) {
               this.Q = 2;
               this.X = var1.b - 8000;
               var2 = this.aw.objX + this.aC[this.X].objX - 161 + 30;
               var3 = this.aw.objY + this.aC[this.X].objY - this.aw.f - 4;
               this.k = c(this, var1, this.W[this.X].e);
            }

            switch(var1.b) {
            case 1001:
               if (var1.j.k >= 0) {
                  this.aE.a(var1.j.k);
                  this.J();
                  return;
               }
               break;
            case 1002:
               this.Q = 3;
               if (this.O == null) {
                  this.f(this.w());
                  DataCenter.d().ai.c(Caption.bW, -1);
               } else {
                  this.k = c(this, var1, this.O);
               }

               return;
            case 1004:
               this.k = b(VDTT_jb.b(Caption.pu, VDTT_jb.c(this.aF[this.aG[1].n.b])), this, var2 + 10, var3, 10);
               return;
            case 1010:
               VDTT_lq var10 = this;

               try {
                  if (var10.O == null) {
                     var10.f(1);
                     DataCenter.d().ai.c(Caption.bW, -1);
                  } else if (var10.Z.h() <= 0) {
                     DataCenter.d().ai.c(Caption.iY, -65536);
                  } else {
                     var2 = var10.aF[var10.aG[1].n.b];
                     if (VDTT_ek.m().ak < var2) {
                        DataCenter.d().ai.c(VDTT_jb.b(Caption.iZ, VDTT_jb.c(var2)), -65536);
                     } else {
                        Message var11;
                        (var11 = new Message((byte)99)).b(var10.O.f);
                        var11.a(var10.aG[1].n.b);
                        var11.c(var10.Z.h());
                        var11.l();
                     }
                  }
                  break;
               } catch (Exception var8) {
                  VDTT_jb.a(var8);
                  return;
               }
            case 1011:
               this.P = 0;
               this.g(0);
               return;
            case 1012:
               if ((var2 = this.P - 1) < 0) {
                  var2 = 0;
               }

               this.g(var2);
               return;
            case 1013:
               this.g(this.P + 1);
               return;
            case 1014:
               this.g(32767);
               return;
            case 2010:
               this.a(false, this.aI);
            }

            return;
         } else if (super.a.b == 2 && var1.b < 10000) {
            this.T = null;
            this.X = this.aM = this.aN = -1;
            if (!this.ar[this.Y.h()]) {
               if (var1.b >= 5000) {
                  this.X = var1.b - 5000;
                  if (this.Y.h() == 2) {
                     try {
                        this.aN = (Integer)var1.k;
                        if (this.aN >= 0) {
                           this.k = c(this, var1, this.S[this.X].b[this.aN]);
                        }
                     } catch (Exception var6) {
                     }
                  } else {
                     try {
                        if (this.X >= 0) {
                           this.k = c(this, var1, this.R[this.Y.h()][this.X]);
                        }
                     } catch (Exception var5) {
                     }
                  }
               } else if (var1.b >= 3000) {
                  this.aO = this.aM = var1.b - 3000;
                  VDTT_ac.b().n();
                  if (this.Y.h() == 2) {
                     DataCenter.d().ai.a(VDTT_jb.b(Caption.vU.replace("@", this.R[this.Y.h()][this.aM].getItemTemplate().b), VDTT_jb.c(this.R[this.Y.h()][this.aM].c()) + Caption.de), 2000, this);
                  } else if (this.Y.h() == 3) {
                     this.I.a((MainScreen)(new VDTT_jw(this.I, this.R[this.Y.h()][this.aM], (byte)40)));
                  } else {
                     this.I.a((MainScreen)(new VDTT_jw(this.I, this.R[this.Y.h()][this.aM], (byte)6)));
                  }
               }
            }

            switch(var1.b) {
            case 998:
               return;
            case 999:
               VDTT_cw.v();
               VDTT_cw.W();
               return;
            case 1000:
               return;
            case 1001:
               if (var1.j.k >= 0) {
                  this.Y.a(var1.j.k);
                  this.G();
                  return;
               }
               break;
            case 1005:
               return;
            case 2000:
               try {
                  Message var9;
                  (var9 = new Message((byte)121)).b(this.R[this.Y.h()][this.aO].b);
                  var9.b((int)1);
                  var9.l();
                  this.T = this.an[this.Y.h()][this.aO];
                  return;
               } catch (Exception var7) {
               }
            }
         }

      }
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      super.perform(var1, var2, var3);
      switch(var1) {
      case 1000:
         this.P = 0;
         VDTT_cw.v().bd = this.aH.b;
         this.C();
      default:
      }
   }

   public final void f(int var1) {
      if (this.aE != null && super.a.b != var1) {
         if (var1 == 0) {
            this.C();
         } else if (var1 == 1) {
            this.D();
         }
      }

      super.f(var1);
      VDTT_cw.v().be = var1;
      if (this.aE != null && super.a.b < 2) {
         this.aE.a(var1);
         this.J();
      }

      if (super.a.b == 2) {
         this.G();
      }

   }

   public void G() {
      this.aO = this.X = this.aM = this.aN = -1;
      this.Y.a(this.Y.g());
      if (this.R[this.Y.h()] == null) {
         this.ar[this.Y.h()] = true;
         switch(this.Y.h()) {
         case 0:
            VDTT_cw.v();
            VDTT_cw.o(6);
            return;
         case 1:
            VDTT_cw.v();
            VDTT_cw.o(7);
            return;
         case 2:
            VDTT_cw.v();
            VDTT_cw.o(39);
            return;
         case 3:
            VDTT_cw.v();
            VDTT_cw.o(40);
         }
      }

   }

   private void J() {
      if (this.aE != null) {
         switch(this.aE.h()) {
         case 0:
            this.W = VDTT_cw.v().bj;
            this.aw = this.au;
            this.az = this.ax;
            this.aC = this.aA;
            break;
         case 1:
            this.W = VDTT_cw.v().bi;
            this.aw = this.av;
            this.az = this.ay;
            this.aC = this.aB;
         }

         if (super.a.b < 2 && this.aE.h() != super.a.b) {
            this.f(this.aE.h());
         }
      }

   }

   public final void a(boolean var1, VDTT_ft var2) {
      try {
         this.aI = var2;
         if (var1) {
            DataCenter.d().ai.a(Caption.ja, 2010, this);
         } else {
            Message var4;
            (var4 = new Message((byte)-19)).a(var2.a);
            var4.l();
         }
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }

   public final void b(boolean var1, VDTT_ft var2) {
      try {
         if (VDTT_ek.m().ak < var2.c) {
            DataCenter.d().ai.c(Caption.jb, -65536);
         } else if (var1) {
            DataCenter.d().ai.a(Caption.jc + var2.e.getItemTemplate().b + Caption.jd + VDTT_jb.c(var2.c) + Caption.je, 2000, this);
         } else {
            Message var4;
            (var4 = new Message((byte)98)).a(var2.a);
            var4.l();
         }
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }

   public final VDTT_ft H() {
      return this.W[this.X];
   }

   public final void d() {
      super.d();
      if (this.O != null) {
         VDTT_ek.m().aP[this.O.f] = this.O;
         this.O = null;
      }

      if (VDTT_cw.v().be == 3) {
         VDTT_cw.v().be = 2;
      }

   }

   public final boolean I() {
      return this.Y.h() == 2;
   }
}
