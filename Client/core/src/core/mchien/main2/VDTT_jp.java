package core.mchien.main2;

import java.util.Vector;

public final class VDTT_jp extends VDTT_jr {
   private int am = 32;
   private int an = 0;
   private int ao = -1;
   private int ap = 4;
   private VDTT_jq[] aq = new VDTT_jq[]{new VDTT_jq(this, 0, 0), new VDTT_jq(this, 1, 0), new VDTT_jq(this, 2, 0), new VDTT_jq(this, 3, 0), new VDTT_jq(this, 4, 0), new VDTT_jq(this, 5, 0), new VDTT_jq(this, 6, 0), new VDTT_jq(this, 6, 1), new VDTT_jq(this, 6, 2), new VDTT_jq(this, 6, 3), new VDTT_jq(this, 6, 4), new VDTT_jq(this, 6, 5), new VDTT_jq(this, 5, 5), new VDTT_jq(this, 4, 5), new VDTT_jq(this, 3, 5), new VDTT_jq(this, 2, 5), new VDTT_jq(this, 1, 5), new VDTT_jq(this, 0, 5), new VDTT_jq(this, 0, 4), new VDTT_jq(this, 0, 3), new VDTT_jq(this, 0, 2), new VDTT_jq(this, 0, 1)};
   private Item[] ar = new Item[22];
   private int as;
   private int at;
   private int au = 0;
   private int av = 0;
   private int aw = 10;
   private boolean ax = false;
   private boolean ay;
   private boolean az;
   private VDTT_bu[] aA = new VDTT_bu[4];
   private VDTT_ba aB;
   private VDTT_ba aC;
   private VDTT_ba aD;
   private VDTT_ho aE;
   public int O = -1;
   public int P = -1;
   public int Q;
   public int R;
   public VDTT_ek S;
   private int[] aF = new int[]{1486, 1487, 1488, 1489, 1490, 1491, 1492, 1493};
   private VDTT_ev aG = new VDTT_ev(366, 0, 0, -1);
   private VDTT_ev aH = new VDTT_ev(365, 0, 0, -1);
   public int T;
   public Item[] U;
   public Item V;
   private VDTT_ht aI;
   public VDTT_ba W;
   public int X = 10;
   private VDTT_jq[] aJ = new VDTT_jq[]{new VDTT_jq(this, 0, 0), new VDTT_jq(this, 1, 0), new VDTT_jq(this, 2, 0), new VDTT_jq(this, 3, 0), new VDTT_jq(this, 4, 0), new VDTT_jq(this, 5, 0), new VDTT_jq(this, 5, 1), new VDTT_jq(this, 5, 2), new VDTT_jq(this, 5, 3), new VDTT_jq(this, 5, 4), new VDTT_jq(this, 5, 5), new VDTT_jq(this, 4, 5), new VDTT_jq(this, 3, 5), new VDTT_jq(this, 2, 5), new VDTT_jq(this, 1, 5), new VDTT_jq(this, 0, 5), new VDTT_jq(this, 0, 4), new VDTT_jq(this, 0, 3), new VDTT_jq(this, 0, 2), new VDTT_jq(this, 0, 1)};
   private int aK = -1;
   public boolean Y;
   public boolean Z;
   public boolean aa;
   private long aL = 0L;
   private int aM = 160;

   public VDTT_jp(VDTT_p var1) {
      super(var1, Caption.Aw);
      this.a(350, 230);
      this.K = false;
      this.as = 11;
      this.at = this.f() + 9;
      this.aC = this.a(4 + (super.q - 8) - 108, this.f() + this.h() - 29, Caption.za[4], this, 1002, 15);
      this.aC.d(48, 20);
      this.a(this.aC, 0);
      this.R = -1;
      this.aD = this.a(4 + (super.q - 8) - 57, this.f() + this.h() - 29, Caption.za[5], this, 1003, 15);
      this.aD.d(48, 20);
      this.a(this.aD, 0);
      this.aB = this.a(4 + (super.q - 8) - 88, this.f() + this.h() - 55, Caption.za[2], this, 1001, -8);
      this.a(this.aB, 0);
      this.aE = new VDTT_ho(0);
      this.aA[0] = this.a(this.as + 7 * this.am + 16, this.at + 56, "2 " + Caption.za[3], this, this.aE);
      this.aA[1] = this.a(this.as + 7 * this.am + 16, this.at + 74, "10 " + Caption.za[3], this, this.aE);
      this.aA[2] = this.a(this.as + 7 * this.am + 16, this.at + 92, "50 " + Caption.za[3], this, this.aE);
      this.aA[3] = this.a(this.as + 7 * this.am + 16, this.at + 110, "100 " + Caption.za[3], this, this.aE);
      this.a(this.aA[0], 0);
      this.a(this.aA[1], 0);
      this.a(this.aA[2], 0);
      this.a(this.aA[3], 0);
      this.aA[0].a(false);
      this.aA[1].a(false);
      this.aA[2].a(false);
      this.aA[3].a(false);
      this.aB.a(false);
      this.aC.a(true);
      this.aD.a(true);
      if (VDTT_cw.v().bk.a >= 0 || VDTT_cw.v().bk.d) {
         this.ay = true;
         this.ao = VDTT_cw.v().bk.b;
      }

      this.S = VDTT_ek.m();
      this.ar[0] = new Item(670);
      this.ar[1] = new Item(678);
      this.ar[2] = new Item(676);
      this.ar[3] = new Item(682);
      this.ar[4] = new Item(671);
      this.ar[5] = new Item(676);
      this.ar[6] = new Item(675);
      this.ar[7] = new Item(673);
      this.ar[8] = new Item(679);
      this.ar[9] = new Item(670);
      this.ar[10] = new Item(677);
      this.ar[11] = new Item(673);
      this.ar[12] = new Item(681);
      this.ar[13] = new Item(679);
      this.ar[14] = new Item(177);
      this.ar[15] = new Item(674);
      this.ar[16] = new Item(679);
      this.ar[17] = new Item(672);
      this.ar[18] = new Item(670);
      this.ar[19] = new Item(676);
      this.ar[20] = new Item(673);
      this.ar[21] = new Item(680);
      this.aI = new VDTT_ht((byte)1, 6, this.f() + 2, 192, 192, 32, 6, 6);
      this.W = this.a(this.q / 2 - 30, this.aI.objY + this.aI.r - 32 - 55, Caption.ss, this, 100, 15);
      this.W.d(60, this.W.r);
      this.a(this.W, 1);
      this.N[1] = true;
      this.N[2] = true;
      this.f(0);
   }

   public final void f(int var1) {
      super.f(var1);
      this.R = -1;
      VDTT_cw.v().bf = var1;
      this.T = 0;
      if (var1 == 1) {
         try {
            Message.c((byte)-21).l();
            return;
         } catch (Exception var2) {
         }
      }

   }

   private void C() {
      VDTT_cw.v();
      int var1 = VDTT_cw.P();

      for(int var2 = 0; var2 < this.d.length - 1; ++var2) {
         this.d[var2] = false;
      }

      if (var1 == 1 || var1 == 3) {
         this.d[0] = true;
      }

      if (var1 == 2 || var1 == 3) {
         this.d[1] = true;
      }

   }

   public final void g(int var1) {
      this.aE.b = var1;

      VDTT_bu var10000;
      boolean var4;
      for(int var2 = 0; var2 < this.aA.length; ++var2) {
         var10000 = this.aA[var1];
         var4 = false;
         var10000.l = var4;
      }

      var10000 = this.aA[var1];
      var4 = true;
      var10000.l = var4;
   }

   public final void a_() {
      super.a_();
      if (VDTT_cw.v().br == 5 && VDTT_cw.v().bs == 5) {
         this.y();
      }

      if (this.aa) {
         this.Y = false;
         this.Z = false;
         this.V = null;
      } else {
         if (this.Y && this.Z && VDTT_jb.a() > this.aL) {
            this.Z = false;
            this.D();
         }

         if ((this.Y || this.V != null) && this.Y && DataCenter.d().h % 2 == 0) {
            Vector var1 = new Vector();

            for(int var2 = 0; var2 < this.U.length; ++var2) {
               var1.add(this.U[var2]);
            }

            Item var5 = (Item)var1.lastElement();
            var1.remove(var5);
            var1.insertElementAt(var5, 0);
            Item[] var6 = new Item[this.U.length];

            for(int var3 = 0; var3 < this.U.length; ++var3) {
               var6[var3] = (Item)var1.get(var3);
            }

            this.U = var6;
            this.V = this.U[VDTT_jb.a(this.U.length)];
         }
      }

      this.C();

      VDTT_bu var10000;
      boolean var7;
      for(int var4 = 0; var4 < this.aA.length; ++var4) {
         var10000 = this.aA[var4];
         var7 = false;
         var10000.l = var7;
      }

      var10000 = this.aA[this.aE.b];
      var7 = true;
      var10000.l = var7;
      if (this.ax) {
         VDTT_ac.b().A();
         this.Q = 0;
         if (this.O == -2) {
            this.O = this.P = -1;
         }

         if (this.az && this.ao == this.aw) {
            this.ay = true;
            this.ax = false;
            VDTT_ac.b().B();
         }

         ++this.au;
         if (this.au > this.an) {
            this.au = 0;
            ++this.av;
            if (this.av >= (this.an < 2 ? VDTT_jb.a(30, 45) : (this.an < 4 ? 5 : (this.an < 5 ? 3 : 2)))) {
               this.av = 0;
               ++this.an;
               if (this.an >= 6) {
                  this.an = 7;
                  this.az = true;
               }
            }

            ++this.ao;
            if (this.ao >= this.aq.length) {
               this.ao = 0;
            }

            --this.ap;
            if (this.ap < 0) {
               this.ap = 0;
            }
         }

      } else {
         if (this.Q < 3) {
            ++this.Q;
         } else if (VDTT_cw.v().bk != null && VDTT_cw.v().bk.a >= 0) {
            this.O = VDTT_cw.v().bk.a;
            this.P = VDTT_cw.v().bk.c;
         } else if (this.O >= 0) {
            this.O = this.P = -2;
         }

         String var8;
         if (VDTT_cw.v().bk.d) {
            var8 = Caption.df;
            this.aB.l = var8;
            this.aB.a(false);
            this.aC.a(true);
            this.aD.a(true);
            this.aA[0].a(true);
            this.aA[1].a(true);
            this.aA[2].a(true);
            this.aA[3].a(true);
         } else if (VDTT_cw.v().bk.a >= 6) {
            var8 = Caption.dg;
            this.aB.l = var8;
            this.aB.a(true);
            this.aC.a(false);
            this.aD.a(false);
            this.aA[0].a(true);
            this.aA[1].a(true);
            this.aA[2].a(true);
            this.aA[3].a(true);
         } else if (VDTT_cw.v().bk.a < 0) {
            var8 = Caption.dh;
            this.aB.l = var8;
            this.aB.a(false);
            this.aC.a(true);
            this.aD.a(true);
            this.aA[0].a(false);
            this.aA[1].a(false);
            this.aA[2].a(false);
            this.aA[3].a(false);
         } else {
            var8 = Caption.di;
            this.aB.l = var8;
            this.aB.a(false);
            this.aC.a(false);
            this.aD.a(false);
            this.aA[0].a(true);
            this.aA[1].a(true);
            this.aA[2].a(true);
            this.aA[3].a(true);
         }
      }
   }

   private void D() {
      try {
         this.aK = -1;
         Message.c((byte)-35).l();
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   private void a(boolean var1) {
      this.aB.a(true);
      this.aC.a(true);
      this.aD.a(true);
      this.aA[0].a(true);
      this.aA[1].a(true);
      this.aA[2].a(true);
      this.aA[3].a(true);
   }

   public final void h(int var1) {
      VDTT_cw.v();
      this.ax = true;
      this.ay = this.az = false;
      this.aw = var1;
      this.an = this.av = this.au = 0;
      this.ap = 4;
      this.a(true);
   }

   public final Vector g() {
      Vector var1 = super.g();
      int var2;
      VDTT_jq var3;
      if (super.a.b == 0) {
         for(var2 = 0; var2 < this.aq.length; ++var2) {
            var3 = this.aq[var2];
            var1.add(new VDTT_hl(3000 + var2, this.as + var3.a * this.am, this.at + var3.b * this.am, this.as + var3.a * this.am + this.am, this.at + var3.b * this.am + this.am, (VDTT_hs)null, this));
         }
      } else if (super.a.b == 1) {
         for(var2 = 0; var2 < this.aJ.length; ++var2) {
            var3 = this.aJ[var2];
            var1.add(new VDTT_hl(4000 + var2, this.as + var3.a * this.am, this.at + var3.b * this.am, this.as + var3.a * this.am + this.am - 3, this.at + var3.b * this.am + this.am - 3, (VDTT_hs)null, this));
         }

         var2 = this.q / 2 - 14;
         int var4 = this.r / 2 - 18;
         var1.add(new VDTT_hl(1000, var2, var4, var2 + 28, var4 + 28, (VDTT_hs)null, this));
      }

      return var1;
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.Aw[0], (byte)2, this.K);
      switch(super.a.b) {
      case 0:
         Graphics var2 = var1;
         VDTT_jp var6 = this;
         this.as = 11;
         this.at = this.f() + 9;
         VDTT_aa.a(var1, 61, 0, 53, 61, 130, (int)130);
         int var3 = 0;

         for(; var3 < var6.aq.length; ++var3) {
            VDTT_jq var4 = var6.aq[var3];
            if (var6.ao == var3) {
               if (DataCenter.d().h % 2 == 0) {
                  var6.aG.n();
                  var6.aG.I = -71;
               }

               var6.aH.n();
               var6.ar[var3].u = var6.aG;
            } else {
               var6.ar[var3].u = null;
            }

            b(var2, var6.as + var4.a * var6.am, var6.at + var4.b * var6.am, var6.ar[var3], false);
            if (var6.ao == var3) {
               var2.c((float)var6.aG.I);
               var6.aH.b(var2, var6.as + var4.a * var6.am - 1 + 16, var6.at + var4.b * var6.am - 1 + 16);
               var2.r();
            }
         }

         if (var6.R >= 0) {
            VDTT_jq var7 = var6.aq[var6.R];
            VDTT_dc.a(var2, 40, 0, var6.as + var7.a * var6.am - 1, var6.at + var7.b * var6.am - 1, 0);
         }

         if (!var6.ax && VDTT_cw.v().bk != null && VDTT_cw.v().bk.d) {
            if (DataCenter.d().h % 10 > 5) {
               VDTT_dg.b(VDTT_dg.d, var2, Caption.dj, var6.as + 110, var6.at + 38, 2, -1, -16777216);
            } else {
               VDTT_dg.b(VDTT_dg.d, var2, Caption.dj, var6.as + 110, var6.at + 38, 2, -2560, -16777216);
            }
         } else if (var6.O >= 0) {
            String var8 = "";
            if (var6.O < 2 && var6.P != 3) {
               var8 = Caption.dk;
            }

            if (var6.P == 0) {
               var8 = var8 + " " + VDTT_jb.c(DataCenter.d().W[var6.P][var6.O]) + Caption.dl + VDTT_jb.c(DataCenter.d().W[4][var6.O]) + Caption.dm;
            } else if (var6.P == 1) {
               var8 = var8 + " " + VDTT_jb.c(DataCenter.d().W[var6.P][var6.O]) + Caption.dn + VDTT_jb.c(DataCenter.d().W[4][var6.O]) + Caption.dm;
            } else if (var6.P == 2) {
               var8 = var8 + " " + VDTT_jb.c(DataCenter.d().W[var6.P][var6.O]) + Caption.do_renamed + VDTT_jb.c(DataCenter.d().W[4][var6.O]) + Caption.dm;
            } else if (var6.P == 3) {
               var8 = var8 + " " + VDTT_jb.c(DataCenter.d().W[var6.P][var6.O]) + Caption.dp + VDTT_jb.c(DataCenter.d().W[4][var6.O]) + Caption.dm;
            }

            VDTT_dg.b(VDTT_dg.d, var2, var8, var6.as + 110, var6.at + 40, 2, -1, -16777216);
            var6.a(var2, var6.as + 35, var6.at + 45 + var6.O * 16, 151, 17, 0, 22, 23, 1, 1);
         } else if (var6.O == -2) {
            VDTT_dg.b(VDTT_dg.d, var2, Caption.dr, var6.as + 110, var6.at + 38, 2, -1, -16777216);
         }

         for(var3 = 1; var3 <= 7; ++var3) {
            for(int var9 = 0; var9 < var3; ++var9) {
               short var5 = 420;
               switch(var3) {
               case 2:
                  var5 = 422;
                  break;
               case 3:
                  var5 = 424;
                  break;
               case 4:
                  var5 = 426;
                  break;
               case 5:
                  var5 = 428;
                  break;
               case 6:
                  var5 = 430;
                  break;
               case 7:
                  var5 = 435;
               }

               VDTT_aa.a(var2, var5, 0, var6.as + 119 + var9 * 15 - var3 * 15 / 2, var6.at + 37 + var3 * 16, 85, (byte)3);
            }
         }

         VDTT_dg.b(VDTT_dg.d, var2, Caption.za[8], var6.as + var6.am + 3, var6.at + var6.am + 5, 0, -1, -16777216);
         VDTT_dg.b(VDTT_dg.d, var2, Caption.za[0], var6.as + 7 * var6.am + 13, var6.at + 5, 0, -1, -16777216);
         var6.a(var2, var6.as + 7 * var6.am + 13 + 2, var6.at + 35 - 21, 88, 21, -11, 22, 23, 1, 1);
         VDTT_aa.a(var2, 228, 0, var6.as + 7 * var6.am + 18, var6.at + 17, 80);
         VDTT_dg.b(VDTT_dg.d, var2, VDTT_jb.c(VDTT_ek.m().f(176)), var6.as + 7 * var6.am + 43, var6.at + 24, 0, -1, -16777216);
         VDTT_dg.b(VDTT_dg.d, var2, Caption.za[1], var6.as + 7 * var6.am + 13, var6.at + 44, 0, -1, -16777216);
         return;
      case 1:
         this.f(var1);
      default:
      }
   }

   private void f(Graphics var1) {
      try {
         this.as = this.q / 2 - 96;
         VDTT_aa.a(var1, 61, 0, 36, 61, 130, (int)130);

         int var2;
         for(var2 = 0; var2 < this.aJ.length; ++var2) {
            VDTT_jq var3 = this.aJ[var2];
            b(var1, this.as + var3.a * this.am, this.at + var3.b * this.am, this.U[var2], var2 == this.aK);
         }

         if (this.Y || this.V != null) {
            Graphics var10000;
            int var10001;
            int var10002;
            Item var10003;
            boolean var10004;
            label37: {
               if (this.Y) {
                  var10000 = var1;
                  var10001 = this.q / 2 - 14;
                  var10002 = this.r / 2 - 18;
                  var10003 = this.V;
               } else {
                  var10000 = var1;
                  var10001 = this.q / 2 - 14;
                  var10002 = this.r / 2 - 18;
                  var10003 = this.V;
                  if (this.aK == -2) {
                     var10004 = true;
                     break label37;
                  }
               }

               var10004 = false;
            }

            b(var10000, var10001, var10002, var10003, var10004);
            if (DataCenter.d().h % 10 > 5 && !this.Y) {
               var1.c(-2560);
               VDTT_dc.a(var1, 40, 0, this.q / 2 - 15, this.r / 2 - 19, 0);
               var1.f();
            }
         }

         if ((var2 = VDTT_ek.m().f(this.aM)) < 50) {
            VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, "- " + Caption.aO + " " + VDTT_jb.c(var2) + " " + DataCenter.d().O[this.aM].b, this.as + this.aI.objX + 35, this.aI.objY + 133, 0, -65536, -10275328);
         } else {
            VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, "- " + Caption.aO + " " + VDTT_jb.c(var2) + " " + DataCenter.d().O[this.aM].b, this.as + this.aI.objX + 35, this.aI.objY + 133, 0, -6488, -10275328);
         }

         VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, "- " + VDTT_jb.b(Caption.st, DataCenter.d().O[this.aM].b), this.as + this.aI.objX + 35, this.aI.objY + 144, 0, -6488, -10275328);
         VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, VDTT_jb.a(Caption.vV, (long)this.X), this.as + this.aI.objX + 35, this.aI.objY + 155, 0, -16711681, -10275328);
      } catch (Exception var4) {
      }
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (!this.ax && !this.Y) {
         super.a(var1, var2, var3);
         this.R = -1;
         if (super.a.b == 0 && var1.b >= 3000 && var1.b < 4000) {
            this.R = var1.b - 3000;
            if (this.R >= 0) {
               Item var9 = this.ar[this.R];
               this.k = VDTT_ae.a(this, var1.e, var1.d, 32, (Item)var9);
               VDTT_ac.b().n();
            }

         } else if (var1.b >= 4000 && var1.b < 5000) {
            this.aK = var1.b - 4000;
            if (!this.Y && this.aK >= 0) {
               this.k = b(this, var1, this.U[this.aK]);
               VDTT_ac.b().n();
            }

         } else {
            switch(super.a.b) {
            case 0:
               Message var8;
               switch(var1.b) {
               case 1001:
                  VDTT_jp var7 = this;

                  try {
                     if (VDTT_cw.v().bk.d) {
                        (new Message((byte)74)).l();
                        return;
                     }

                     (var8 = new Message((byte)72)).a(var7.aE.b);
                     var8.l();
                     break;
                  } catch (Exception var5) {
                     VDTT_jb.a(var5);
                     return;
                  }
               case 1002:
                  try {
                     (var8 = new Message((byte)74)).a((int)0);
                     var8.l();
                     break;
                  } catch (Exception var4) {
                     VDTT_jb.a(var4);
                     return;
                  }
               case 1003:
                  try {
                     (var8 = new Message((byte)74)).a((int)1);
                     var8.l();
                     return;
                  } catch (Exception var6) {
                     VDTT_jb.a(var6);
                  }
               }

               return;
            case 1:
               switch(var1.b) {
               case 100:
                  if (this.X == 0 || VDTT_cw.v().br < 15) {
                     this.D();
                     return;
                  }

                  this.aK = -1;
                  var2 = VDTT_jb.a(this.U.length);
                  if (VDTT_ek.m().D() > 0 && VDTT_ek.m().f(this.aM) >= 40) {
                     this.Y = true;
                     this.Z = true;
                     this.aa = false;
                     this.aL = VDTT_jb.a() + (long)VDTT_jb.a(4000, 8000);
                     this.W.a(true);
                     return;
                  }

                  this.D();
                  break;
               case 1000:
                  if (!this.Y && this.V != null) {
                     this.k = c(this, var1, this.V);
                     VDTT_ac.b().n();
                     return;
                  }
                  break;
               case 1206:
                  if (!this.Y) {
                     this.k();
                  }
               }
            }

         }
      }
   }

   public final void d() {
      super.d();
      this.ax = false;
      VDTT_ac.b().B();
   }
}
