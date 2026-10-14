package core.mchien.main2;

import java.util.Hashtable;
import java.util.Vector;

public final class VDTT_ly extends VDTT_aq {
   private final VDTT_ba Y;
   private final VDTT_ba Z;
   private VDTT_ht[][] aa;
   private VDTT_hs[][][] ab;
   public VDTT_ba[][][] O;
   private VDTT_iq[] ac;
   public VDTT_hh[][][] P;
   private int ad = 50;
   private int ae = 76;
   private int af;
   private int ag;
   private int ah;
   private int ai;
   private int aj;
   private int ak;
   private int al;
   private boolean[] am = new boolean[4];
   private int an;
   private int ao;
   private int ap;
   private int aq;
   private int ar;
   public int Q;
   private int as;
   public int R;
   private int at;
   private VDTT_ba[] au = new VDTT_ba[4];
   private long av;
   private long aw;
   private long ax;
   private long ay;
   private long az;
   private boolean aA;
   private boolean aB;
   private final XYEntity[] aC;
   public int S = 0;
   public int T = 50;
   public int U = -1;
   public int V = 0;
   public int W = 0;
   public int X = 0;
   private int aD;
   private final Item[][] aE;
   private int aF = -1;

   public VDTT_ly(VDTT_p var1, Message var2) {
      super(var1);
      VDTT_hp var11;
      (var11 = new VDTT_hp(5000)).c = new String[]{Caption.mL, Caption.nZ, Caption.oc, Caption.xF};
      this.aa = new VDTT_ht[var11.c.length][];
      this.ab = new VDTT_hs[var11.c.length][][];
      this.O = new VDTT_ba[var11.c.length][][];
      this.ac = new VDTT_iq[var11.c.length];
      this.P = new VDTT_hh[var11.c.length][][];
      this.a(310);
      this.a(var11, 170, 70, 5);
      String[][] var3 = new String[][]{Caption.Ao, Caption.As, Caption.Au, Caption.Av};

      int var4;
      for(var4 = 0; var4 < this.O.length; ++var4) {
         (var11 = new VDTT_hp(1001)).c = var3[var4];
         this.ac[var4] = new VDTT_iq(var11, this);
         (new VDTT_hp(1001)).c = var3[var4];
         this.aa[var4] = new VDTT_ht[this.ac[var4].j()];
         this.ab[var4] = new VDTT_hs[this.ac[var4].j()][];
         this.O[var4] = new VDTT_ba[this.ac[var4].j()][];
         this.P[var4] = new VDTT_hh[this.ac[var4].j()][];
      }

      this.a(var2);

      int var12;
      int var15;
      for(var4 = 0; var4 < this.P.length; ++var4) {
         for(var12 = 0; var12 < this.P[var4].length; ++var12) {
            int var5 = var12;
            var15 = var4;
            VDTT_ly var13 = this;
            this.ah = -1;
            this.O[var4][var12] = new VDTT_ba[this.P[var4][var12].length];
            this.ab[var4][var12] = new VDTT_hs[this.P[var4][var12].length];
            this.aa[var4][var12] = new VDTT_ht((byte)1, 14, this.f() + 34, this.ad * 5, this.ae * 2, this.ae, VDTT_jb.c(this.P[var4][var12].length, 5), 5);
            this.af = 0;
            this.ag = 0;
            int var6 = 0;

            for(int var7 = 0; var7 < var13.aa[var15][var5].i; ++var7) {
               var13.ag = var7 * var13.ae;

               for(int var8 = 0; var8 < var13.aa[var15][var5].P; ++var8) {
                  var13.af = var8 * var13.ad;
                  var13.O[var15][var5][var6] = new VDTT_ba(var13.af + 6, var13.ag + var13.ae - 28, 0, 0, Caption.mM, var13, 1100, 7);
                  var13.O[var15][var5][var6].d(35, 20);
                  var13.ab[var15][var5][var6] = new VDTT_hx((byte)1, 0, 0, var13.O[var15][var5][var7].q, var13.O[var15][var5][var7].r, var13.O[var15][var5][var7].r, 1, var13.aa[var15][var5]);
                  VDTT_hs var10000 = var13.ab[var15][var5][var6];
                  byte var10 = 1;
                  var10000.I = var10;
                  ++var6;
                  if (var6 >= var13.O[var15][var5].length) {
                     break;
                  }
               }

               if (var6 >= var13.O[var15][var5].length) {
                  break;
               }
            }
         }
      }

      this.ab[3] = new VDTT_hs[1][3];

      int var14;
      for(var12 = 0; var12 < this.ab[3].length; ++var12) {
         for(var14 = 0; var14 < this.ab[3][var12].length; ++var14) {
            this.ab[3][var12][var14] = new VDTT_hs((byte)1, 87 + var14 * 34, 195, 30, 30, 1, 1);
         }
      }

      this.aE = new Item[1][4];
      this.aE[0][0] = new Item(164);
      this.aE[0][0].t = true;
      this.aE[0][1] = new Item(428);
      this.aE[0][1].t = true;
      this.aE[0][2] = new Item(159);
      this.aE[0][2].t = true;
      this.aE[0][3] = new Item(163);
      this.aE[0][3].t = true;
      this.aE[0][3].c(300000);

      for(var12 = 0; var12 < this.au.length; ++var12) {
         this.au[var12] = this.a(this.q - 74, this.r - 35, Caption.od, this, 1200 + var12, 7);
         this.au[var12].d(60, 22);
         this.a(this.au[var12], 2);
         this.ac[2].a(this.au[var12], var12);
      }

      this.aC = new XYEntity[8];
      var12 = 360 / this.aC.length;
      var14 = 0;

      for(var15 = 360; var15 > 0; var15 -= var12) {
         if (var14 < this.aC.length - 1) {
            this.aC[var14] = XYEntity.e(var15 - var12 + 1, var15);
         } else {
            this.aC[var14] = XYEntity.e(var15 - var12, var15);
         }

         ++var14;
      }

      this.Y = this.a(this.ac[super.a.b].objX + this.ac[super.a.b].q / 2 - 26, this.ac[super.a.b].objY + (this.r - this.ac[super.a.b].objY) / 2 - 35 + 8, "", this, 1205, 738);
      this.a(this.Y, 1);
      this.ac[1].a(this.Y, 1);
      this.Z = new VDTT_ba(21, this.h() - 12, 0, 0, Caption.cq, this, 1027, -17);
      this.Z.d(60, this.Z.r);
      this.ac[1].a(this.Z, 1);
      this.N[3] = true;
      this.f(0);
   }

   public final void a(Message var1) {
      try {
         Hashtable var2 = new Hashtable();
         this.ai = var1.i();
         this.aj = var1.readByte();
         this.ak = var1.i();
         this.al = var1.i();
         this.az = var1.h();
         this.an = var1.f();
         this.ao = var1.f();
         this.ap = var1.f();
         this.ar = var1.readByte();

         for(int var3 = 0; var3 < this.am.length; ++var3) {
            this.am[var3] = var1.c();
         }

         this.ax = var1.h();
         this.ay = var1.h();
         this.ac[0].e[3] = true;
         this.ac[0].e[4] = true;
         long var9 = VDTT_jb.a();
         if ((this.ax > var9 || var9 >= this.ay) && (this.ax != -1L || this.ay != -1L)) {
            this.ac[1].e[3] = true;
         }

         if ((this.av > var9 || var9 >= this.aw) && (this.av != -1L || this.aw != -1L)) {
            this.ac[1].e[2] = true;
         }

         this.at = var1.i();
         this.as = this.Q = var1.f();
         short var10 = var1.f();

         int var4;
         Vector var6;
         for(var4 = 0; var4 < var10; ++var4) {
            VDTT_hh var5;
            (var5 = new VDTT_hh()).a = var1.f();
            var5.b = var1.j();
            var5.c = var1.f();
            var5.d = new Item();
            var5.d.a(var1);
            var5.e = var1.readByte();
            if ((var6 = (Vector)var2.get(var5.c)) == null) {
               var6 = new Vector();
            }

            var6.add(var5);
            var2.put(var5.c, var6);
         }

         for(var4 = 0; var4 < this.P.length; ++var4) {
            for(int var11 = 0; var11 < this.P[var4].length; ++var11) {
               var6 = null;
               switch(var4) {
               case 0:
                  if (var11 == 0) {
                     var6 = (Vector)var2.get(0);
                  } else if (var11 == 1) {
                     var6 = (Vector)var2.get(1);
                  } else if (var11 == 2) {
                     var6 = (Vector)var2.get(2);
                  }
                  break;
               case 1:
                  if (var11 == 0) {
                     var6 = (Vector)var2.get(5);
                  } else if (var11 == 3) {
                     var6 = (Vector)var2.get(21);
                  } else if (var11 == 2) {
                     var6 = (Vector)var2.get(19);
                  }
                  break;
               case 2:
                  if (var11 == 0) {
                     var6 = (Vector)var2.get(15);
                  } else if (var11 == 1) {
                     var6 = (Vector)var2.get(16);
                  } else if (var11 == 2) {
                     var6 = (Vector)var2.get(17);
                  } else if (var11 == 3) {
                     var6 = (Vector)var2.get(3);
                  }
               }

               if (var6 == null) {
                  var6 = new Vector();
               }

               this.P[var4][var11] = new VDTT_hh[var6.size()];

               for(int var8 = 0; var8 < this.P[var4][var11].length; ++var8) {
                  this.P[var4][var11][var8] = (VDTT_hh)var6.get(var8);
               }
            }
         }

         for(var4 = 0; var4 < this.ac.length; ++var4) {
            this.ac[var4].a();
         }
      } catch (Exception var7) {
      }

      this.z();
   }

   public final void z() {
      boolean var1 = false;

      for(int var2 = 0; var2 < this.P.length; ++var2) {
         this.d[var2] = false;

         for(int var3 = 0; var3 < this.P[var2].length; ++var3) {
            this.ac[var2].d[var3] = false;
            if (var2 == 1 && var3 == 1 && this.Q > 0) {
               this.ac[var2].d[var3] = true;
               this.d[var2] = true;
               var1 = true;
            }

            for(int var4 = 0; var4 < this.P[var2][var3].length; ++var4) {
               if (this.P[var2][var3][var4].a()) {
                  this.ac[var2].d[var3] = true;
                  this.d[var2] = true;
                  var1 = true;
                  break;
               }
            }

            this.ac[var2].b();
         }
      }

      VDTT_cw.v().aY = var1;
   }

   public final void b(Graphics var1) {
      super.b(var1);
      if (super.a.b != 3) {
         this.ac[super.a.b].a(var1);
      }

      this.ac[super.a.b].a(var1, this.objX, this.objY);
      label61:
      switch(super.a.b) {
      case 0:
         switch(this.ac[super.a.b].h()) {
         case 0:
            VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.mX + this.ai / '\uea60' + " " + Caption.lk, 14, this.r - 14, 0, -1, 0);
            break label61;
         case 1:
            VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.mY + this.aj + " " + Caption.yT[2], 14, this.r - 22, 0, -1, 0);
            VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.mZ, 14, this.r - 14, 0, -1, 0);
            break label61;
         case 2:
            VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.na + this.ar, 14, this.r - 22, 0, -1, 0);
            VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.nq, 14, this.r - 14, 0, -1, 0);
         default:
            break label61;
         }
      case 1:
         switch(this.ac[super.a.b].h()) {
         case 0:
            VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.nc + VDTT_jb.c(this.al) + " " + Caption.mW, 14, this.r - 14, 0, -1, 0);
            VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.nb + VDTT_jb.c(this.ak) + " " + Caption.mW, 14, this.r - 22, 0, -1, 0);
            break label61;
         case 1:
            boolean var5 = true;
            var1.j = var5;
            VDTT_dc.a(var1, 739, this.S, this.ac[super.a.b].objX + this.ac[super.a.b].q / 2, this.ac[super.a.b].objY + (this.r - this.ac[super.a.b].objY) / 2, 3);
            var5 = false;
            var1.j = var5;
            VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, Caption.on + this.Q, this.ac[super.a.b].objX + 10, this.r - 24, 0, -7812062, 0);
            VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, Caption.dq, this.ac[super.a.b].objX + 10, this.r - 12, 0, -1, 0);
            return;
         case 2:
            int[] var4 = new int[]{10, 20, 50, 100, 200, 500, 1000};
            if (this.aA) {
               VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.nc + VDTT_jb.c(this.al) + " " + Caption.mW + Caption.ut + this.aq + "'", 14, this.r - 14, 0, -1, 0);
            } else if (this.aq >= 7) {
               VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.ny, 14, this.r - 14, 0, -1, 0);
            } else {
               VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.nc + VDTT_jb.c(this.al) + " " + Caption.mW + VDTT_jb.b(Caption.us, VDTT_jb.k(var4[this.aq])) + (this.aq + 1) + "'", 14, this.r - 14, 0, -1, 0);
            }

            if (this.aw >= 0L) {
               VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.iW + ": " + VDTT_jb.d(this.av) + " - " + VDTT_jb.d(this.aw), 14, this.r - 22, 0, -2560, 0);
            }
            break label61;
         case 3:
            VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.qq, 14, this.r - 29, 0, -1, 0);
            VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.vN, 14, this.r - 21, 0, -1, 0);
            VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.wA, 14, this.r - 13, 0, -1, 0);
            if (this.ay >= 0L) {
               VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.iW + ": " + VDTT_jb.d(this.ax) + " - " + VDTT_jb.d(this.ay), 14, this.r - 37, 0, -2560, 0);
            }
         default:
            break label61;
         }
      case 2:
         VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.oE, 14, this.r - 22, 0, -1, 0);
         switch(this.ac[super.a.b].h()) {
         case 0:
            VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, VDTT_jb.a(Caption.uu, this.az / 60000L), 14, this.r - 14, 0, -1, 0);
            break label61;
         case 1:
            VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, VDTT_jb.b(Caption.uv, VDTT_jb.c(this.an)), 14, this.r - 14, 0, -1, 0);
            break label61;
         case 2:
            VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, VDTT_jb.b(Caption.uw, VDTT_jb.c(this.ao)), 14, this.r - 14, 0, -1, 0);
            break label61;
         case 3:
            VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, VDTT_jb.b(Caption.ux, VDTT_jb.c(this.ap)), 14, this.r - 14, 0, -1, 0);
         default:
            break label61;
         }
      case 3:
         for(int var2 = 0; var2 < this.ab[super.a.b][this.ac[super.a.b].h()].length; ++var2) {
            b(var1, this.ab[super.a.b][this.ac[super.a.b].h()][var2].objX, this.ab[super.a.b][this.ac[super.a.b].h()][var2].objY, this.aE[this.ac[super.a.b].h()][var2], this.aF == var2);
         }
      }

      this.a(var1, this.aa[super.a.b][this.ac[super.a.b].h()]);
      this.f(var1);
      this.a(var1);
   }

   private void f(Graphics var1) {
      this.af = 0;
      this.ag = 0;
      int var2 = 0;

      for(int var6 = 0; var6 < this.aa[super.a.b][this.ac[super.a.b].h()].i; ++var6) {
         this.ag = var6 * this.ae;

         for(int var7 = 0; var7 < this.aa[super.a.b][this.ac[super.a.b].h()].P; ++var7) {
            this.af = var7 * this.ad;
            if (this.aa[super.a.b][this.ac[super.a.b].h()].b(var6)) {
               VDTT_hh var5 = this.P[super.a.b][this.ac[super.a.b].h()][var2];
               this.a(var1, this.af, this.ag, this.ad - 3, this.ae - 3, -11, 22, 23, 1, 1);
               VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, var5.b, this.af + this.ad / 2, this.ag + 9, 2, -1, -10275328);
               b(var1, this.af + 9, this.ag + 16, var5.d, this.ah == var2);
               int var3 = var1.e;
               int var4 = var1.f;
               this.a(var1, var3 + this.O[super.a.b][this.ac[super.a.b].h()][var2].objX, var4 + this.O[super.a.b][this.ac[super.a.b].h()][var2].objY);
               this.O[super.a.b][this.ac[super.a.b].h()][var2].a(!var5.a());
               VDTT_ba var10000;
               String var9;
               if (var5.e == 2) {
                  this.O[super.a.b][this.ac[super.a.b].h()][var2].I = 9;
                  var10000 = this.O[super.a.b][this.ac[super.a.b].h()][var2];
                  var9 = "";
                  var10000.l = var9;
               } else if (var5.e == 1) {
                  var10000 = this.O[super.a.b][this.ac[super.a.b].h()][var2];
                  var9 = Caption.cm;
                  var10000.l = var9;
               } else if (var5.e == 0) {
                  var10000 = this.O[super.a.b][this.ac[super.a.b].h()][var2];
                  var9 = Caption.ur;
                  var10000.l = var9;
               }

               this.O[super.a.b][this.ac[super.a.b].h()][var2].b(var1);
               this.a(var1, var3, var4);
            }

            ++var2;
            if (var2 >= this.O[super.a.b][this.ac[super.a.b].h()].length) {
               break;
            }
         }

         if (var2 >= this.O[super.a.b][this.ac[super.a.b].h()].length) {
            break;
         }
      }

   }

   private void A() {
      this.ac[super.a.b].a(this.ac[super.a.b].g());
      this.Z.b(super.a.b != 1 || this.ac[super.a.b].h() != 1);
   }

   public final void f(int var1) {
      super.f(var1);
      this.A();
      this.Z.b(super.a.b != 1 || this.ac[super.a.b].h() != 1);
   }

   public final void a_() {
      this.ac[super.a.b].e();
      this.aa[super.a.b][this.ac[super.a.b].h()].a();

      int var1;
      for(var1 = 0; var1 < this.O[super.a.b][this.ac[super.a.b].h()].length; ++var1) {
         this.O[super.a.b][this.ac[super.a.b].h()][var1].a_();
         this.ab[super.a.b][this.ac[super.a.b].h()][var1].a();
         if (this.ab[super.a.b][this.ac[super.a.b].h()][var1].l != -1) {
            this.O[super.a.b][this.ac[super.a.b].h()][var1].N = true;
         } else {
            this.O[super.a.b][this.ac[super.a.b].h()][var1].N = false;
         }
      }

      for(var1 = 0; var1 < this.am.length; ++var1) {
         if (this.am[var1]) {
            this.au[var1].l = Caption.oI;
            this.au[var1].a(true);
            this.au[var1].I = 9;
         }
      }

      if (this.aB) {
         VDTT_ac.b().A();
         ++this.V;
         this.S += this.T;
         if (this.S >= 360) {
            this.S = 0;
         }

         if ((this.V % 5 == 0 || this.aD > 30) && this.U >= 0) {
            this.T -= 5;
            if (this.T < 5) {
               this.T = 5;
               ++this.aD;
               XYEntity var3 = this.aC[this.U];
               if (this.S - this.W >= var3.objX && this.S <= var3.objY) {
                  this.aB = false;
                  if (this.R > 0) {
                     Item var4 = null;
                     switch(this.U) {
                     case 0:
                        var4 = new Item(23, true, 30);
                        break;
                     case 1:
                        var4 = new Item(176, true, 60);
                        break;
                     case 2:
                        var4 = new Item(191, true, 900000);
                        break;
                     case 3:
                        var4 = new Item(163, true, 4000000);
                        break;
                     case 4:
                        var4 = new Item(160, true, 600);
                        break;
                     case 5:
                        var4 = new Item(160, true, 725);
                        break;
                     case 6:
                        var4 = new Item(160, true, 850);
                        break;
                     case 7:
                        var4 = new Item(160, true, 1000);
                     }

                     String var5 = Caption.q + " " + VDTT_jb.c(var4.M()) + " " + var4.getItemTemplate().b;
                     DataCenter.d().ai.c(var5, -2560);
                     this.R = 0;
                  }
               }
            }
         }
      } else {
         VDTT_ac.b().B();
      }

      if (VDTT_cw.v().br == 5 && VDTT_cw.v().bs == 6) {
         this.y();
      }

   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final Vector g() {
      Vector<VDTT_hl> vector = super.g();
      VDTT_ly vDTT_ly;
      if ((vDTT_ly = this).a.b == 3) {
         for (byte b = 0; b < (this.ab[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).length; b++)
            vector.addElement(this.ab[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()][b].a(1004, this, Integer.valueOf(b)));
      } else {
         if ((vDTT_ly = this).a.b != 1 || this.ac[(vDTT_ly = this).a.b].h() != 1)
            for (byte b = 0; b < (this.P[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).length; b++) {
               int i = (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).objX + (this.O[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()][b]).objX;
               int j = (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).objY + (this.O[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()][b]).objY - (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).f;
               if (VDTT_jb.a((this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).objX, (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).objY, (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).objX + (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).q, (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).objY + (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).r, i, j) && VDTT_jb.a((this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).objX, (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).objY, (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).objX + (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).q, (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).objY + (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).r, i + (this.O[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()][b]).q, j + (this.O[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()][b]).r)) {
                  (this.ab[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()][b]).objX = (short)i;
                  (this.ab[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()][b]).objY = (short)j;
                  vector.addElement(new VDTT_hl(2000, (this.ab[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()][b]).objX, (this.ab[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()][b]).objY, (this.ab[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()][b]).objX + (this.ab[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()][b]).q, (this.ab[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()][b]).objY + (this.ab[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()][b]).r, this.ab[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()][b], this, this.P[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()][b]));
                  vector.addElement(new VDTT_hl(3000, i + 3, j - 32, i + 3 + 28, j - 32 + 28, this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()], this, Integer.valueOf(b)));
               }
            }
         vector.addElement(this.ac[(vDTT_ly = this).a.b].f());
         vector.addElement(new VDTT_hl(1002, (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).objX, (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).objY, (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).objX + (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).q, (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).objY + (this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()]).r, this.aa[(vDTT_ly = this).a.b][this.ac[(vDTT_ly = this).a.b].h()], this));
      }
      return vector;
   }

   public final void b(int var1, Object var2) {
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.ah = -1;
      Message var14;
      switch(var1.b) {
      case 1000:
         try {
            Message.c((byte)22).l();
            break;
         } catch (Exception var9) {
            VDTT_jb.a(var9);
            return;
         }
      case 1001:
         if (var1.j.k >= 0) {
            this.ac[super.a.b].a(var1.j.k);
            this.A();
            return;
         }
         break;
      case 1004:
         VDTT_bo var10001;
         label84: {
            this.aF = (Integer)var1.k;
            Item var15 = this.aE[this.ac[super.a.b].h()][this.aF];
            if (var15 != null) {
               if (!(var1.j instanceof VDTT_ht)) {
                  var10001 = VDTT_ae.a(this, var1.e + 2, var1.d, 32, (Item)var15);
                  break label84;
               }

               VDTT_ht var13;
               if ((var13 = (VDTT_ht)var1.j).k >= 0 && var13.k < var13.i * var13.P) {
                  var13.e();
                  int var4 = var13.k % var13.P;
                  int var5 = var13.k / var13.P - (var13.j >= 0 ? var13.j : 0);
                  if (var13.n == 0) {
                     var4 = var13.k % var13.i - (var13.j >= 0 ? var13.j : 0);
                     var5 = var13.k / var13.i;
                  }

                  var4 = var4 * var13.h + var13.h + var13.objX;
                  var5 = var5 * var13.h + var13.objY;
                  var10001 = VDTT_ae.a(this, var4, var5, var13.h, (Item)var15);
                  break label84;
               }
            }

            var10001 = null;
         }

         this.k = var10001;
         VDTT_ac.b().n();
         return;
      case 1027:
         VDTT_ac.b().n();
         this.k = b(Caption.vn, this, this.Z.objX + 10, this.Z.objY, 160);
         return;
      case 1200:
      case 1201:
      case 1202:
      case 1203:
         int var12 = var1.b - 1200;

         try {
            (var14 = Message.c((byte)-63)).a(var12);
            var14.l();
            break;
         } catch (Exception var8) {
            return;
         }
      case 1204:
         this.k = a(Caption.oJ, this, this.ac[super.a.b].q + 45, this.r - 124, 200);
         return;
      case 1205:
         VDTT_ly var11 = this;

         try {
            var11.as = var11.Q;
            if (!var11.aB) {
               if (var11.Q > 0) {
                  var11.aB = true;
                  var11.S = var11.aD = 0;
                  var11.T = VDTT_jb.a(35, 50);
                  var11.W = VDTT_jb.a(1, 30);
                  var11.U = -1;
               }

               Message.c((byte)-60).l();
            }
            break;
         } catch (Exception var7) {
            return;
         }
      case 1206:
         this.k();
         return;
      case 1207:
         this.k = a(Caption.oK, this, this.ac[super.a.b].q + 45, this.r - 160, 220);
         break;
      case 2000:
         VDTT_hh var10 = (VDTT_hh)var1.k;

         try {
            if (var10.a()) {
               (var14 = Message.c((byte)-70)).b(var10.a);
               var14.l();
            }
         } catch (Exception var6) {
         }

         VDTT_ac.b().n();
         return;
      case 3000:
         this.ah = (Integer)var1.k;
         this.k = c(this, var1, this.P[super.a.b][this.ac[super.a.b].h()][this.ah].d);
         return;
      }

   }

   public final void d() {
      super.d();
      this.aB = false;
      VDTT_ac.b().B();
   }
}
