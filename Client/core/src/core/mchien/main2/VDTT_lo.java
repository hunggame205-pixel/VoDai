package core.mchien.main2;

import java.util.Collections;
import java.util.Vector;

public final class VDTT_lo extends VDTT_aq {
   private static VDTT_v R;
   public VDTT_hi O;
   private String[] S;
   private VDTT_hs[] T;
   public VDTT_je[] P;
   private VDTT_ht U;
   public int Q;
   private int V;
   private int W = -1;
   private int X = -1;
   private int Y;
   private VDTT_bf Z;
   private int aa = -1;
   private int ab = 0;
   private int ac = 6;
   private String[] ad;
   private static int ae;
   private Vector af;
   private int ag;
   private int ah;
   private int ai;
   private VDTT_ev aj;

   public VDTT_lo(VDTT_p var1) {
      super(var1);
      this.ad = Caption.Bs;
      this.aj = new VDTT_ev(0, 0, 0, -1);
      this.a(320);
      this.K = false;
      this.ag = VDTT_cw.v().am;
      if (VDTT_cw.v().C().d == 4) {
         this.ag *= 2;
      }

      if (DataCenter.d().H[VDTT_cw.v().ai].b.length() <= 13) {
         this.S = new String[]{DataCenter.d().H[VDTT_cw.v().ai].b};
      } else {
         this.S = VDTT_dg.a(DataCenter.d().H[VDTT_cw.v().ai].b, 2);
      }

      this.T = new VDTT_hw[4];
      VDTT_hp var7;
      (var7 = new VDTT_hp(-1000)).c = Caption.yd;
      this.a(var7, 255, 88, 4);
      this.P = new VDTT_je[9];

      for(int var2 = 0; var2 < this.P.length; ++var2) {
         this.P[var2] = new VDTT_je(0);
      }

      this.z();
      Vector var8 = new Vector();
      boolean var4 = false;

      for(int var5 = 0; var5 < VDTT_cw.v().aq.size(); ++var5) {
         VDTT_gx var3;
         String var6;
         if ((var3 = (VDTT_gx)VDTT_cw.v().aq.get(var5)).m().k.length() > 0) {
            var6 = var3.m().j + " (" + var3.m().k + ")";
         } else {
            var6 = var3.m().j;
         }

         if (var3.k == 48) {
            if (!var4) {
               var4 = true;
               var8.add(new VDTT_iu(var3.k, var6, 0));
            }
         } else {
            var8.add(new VDTT_iu(var3.k, var6, 0));
         }
      }

      for(int var13 = 0; var13 < VDTT_cw.v().ap.size(); ++var13) {
         VDTT_gk var12;
         if ((var12 = (VDTT_gk)VDTT_cw.v().ap.elementAt(var13)).U) {
            var8.add(new VDTT_iu(var12.k, var12.p().k, 1));
         }
      }

      this.af = var8;
      var8.insertElementAt(new VDTT_iu(-1, Caption.pX), 0);
      short[] var14 = new short[var8.size()];
      String[] var10 = new String[var8.size()];

      int var11;
      for(var11 = 0; var11 < var8.size(); ++var11) {
         var14[var11] = (short)((VDTT_iu)var8.get(var11)).a;
         var10[var11] = ((VDTT_iu)var8.get(var11)).b;
      }

      if ((var11 = var14.length) > 7) {
         var11 = 7;
      }

      VDTT_hp var9 = new VDTT_hp(-2000, var14, var10);
      this.Z = this.a(this.U.objX + 1, this.U.objY - 10, this.U.q - 4, var11, var9, this, 0);
      var9.b = 0;
      this.a(this.Z, 0);
      var7.b = -1;
      VDTT_cw.v();
      this.ab = VDTT_cw.f(VDTT_cw.v().ai);
      if (DataCenter.l()) {
         this.N[0] = true;
         this.N[1] = true;
         ae = 2;
      }

      this.f(ae);
      (new Message((byte)-6)).l();
      VDTT_ac.b().w();
   }

   public final void z() {
      this.U = new VDTT_ht((byte)1, 4 + (super.q - 8 - 84) / 2, this.f() + 54, 96, 96, 32, VDTT_jb.c(this.P.length, 3), 3);
      this.U.a(VDTT_cw.v().al / 3);
   }

   public final void a_() {
      super.a_();
      this.U.a();
      this.aj.n();
      DataCenter.d();
      if (!DataCenter.b() && VDTT_cw.v().br == 10 && VDTT_cw.v().bs == 1 && VDTT_cw.v().ai != 87 && VDTT_cw.v().ai != 57 && !this.n() && !VDTT_ek.m().F()) {
         if (this.ad[this.ab] != null && this.ad[this.ab].toLowerCase().equals(Caption.Bs[1].toLowerCase())) {
            if (super.a.b != 2) {
               DataCenter.d().aA.a(this.objX + this.q - 145, this.objY + 13);
               DataCenter.d().aA.b = true;
            } else if (this.k == null) {
               DataCenter.d().aA.a(this.objX + 4 + this.ah, this.objY + this.f() + 80);
               DataCenter.d().aA.b = true;
            }
         } else if (super.a.b != this.w()) {
            DataCenter.d().aA.a(this.objX + this.q - 85, this.objY + 13);
            DataCenter.d().aA.b = true;
         } else {
            DataCenter.d().aA.a(this.objX + 4 + this.ah, this.objY + this.f() + this.ai);
            DataCenter.d().aA.b = true;
         }
      }

      if (this.Z != null) {
         this.Z.b(VDTT_cw.v().V());
      }

      if (this.T[super.a.b] != null) {
         if (super.a.b == 0 && VDTT_ek.m().Z() && this.V == 0 && (this.p == null || this.p.b < 0)) {
            this.T[0].j = VDTT_ek.m().objX / this.ag - this.T[0].q / 2;
            ((VDTT_hw)this.T[0]).Q = VDTT_ek.m().objY / this.ag - this.T[0].r / 2;
         }

         this.Z.f(this.T[0].objX - 1, this.T[0].objY - 24);
         this.T[super.a.b].a();
      }

      if (this.V > 0) {
         --this.V;
         if (super.a.b != 0 && super.a.b != 2) {
            if (super.a.b == 3 && this.V == 0) {
               this.ab = this.X;
               this.X = -1;
               this.f(1);
            }
         } else if (this.V == 0) {
            this.W = -1;
            this.k();
         }
      }

      if (this.O != null) {
         this.O.o();
         if (this.O.p()) {
            this.O = null;
         }
      }

   }

   public final void b(Graphics var1) {
      super.b(var1);
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var7;
      if (this.aa != -1) {
         VDTT_da.b(R);
         int var8;
         if (this.aa != 0) {
            if (this.aa == 2) {
               this.A();
            } else if (this.aa == 3) {
               VDTT_lo var6 = this;
               var7 = this.q;
               var8 = this.r - this.h();

               try {
                  if ((R = (VDTT_v)VDTT_dc.h.get((short)var6.ac)) == null) {
                     R = VDTT_da.i("mapmini_" + var6.ac);
                  }

                  VDTT_da.a(R);
                  var7 = VDTT_dc.a(R);
                  var8 = VDTT_dc.b(R);
               } catch (Exception var13) {
               }

               if (this.T[3] == null) {
                  this.T[3] = new VDTT_hw((byte)2, 14, this.f() + 10, super.q - 8 - 20, this.h() - 19, var7, var8);
               }
            }
         } else {
            var7 = VDTT_cw.v().aj / this.ag;
            var8 = VDTT_cw.v().ak / this.ag;
            if (!VDTT_eq.a().a(19)) {
               String var9 = "mapsmall_" + VDTT_cw.v().ai;
               if (VDTT_cw.v().ai != 2 && VDTT_cw.v().ai != 4 && VDTT_cw.v().ai != 6 && VDTT_cw.v().ai != 8) {
                  if (VDTT_cw.v().ai != 44 && VDTT_cw.v().ai != 45 && VDTT_cw.v().ai != 46) {
                     if (VDTT_cw.v().ai != 47 && VDTT_cw.v().ai != 48) {
                        if (VDTT_cw.v().ai == 49 || VDTT_cw.v().ai == 50) {
                           var9 = "mapsmall_49";
                        }
                     } else {
                        var9 = "mapsmall_47";
                     }
                  } else {
                     var9 = "mapsmall_44";
                  }
               } else {
                  var9 = "mapsmall_2";
               }

               if ((R = VDTT_da.i(var9)) == null) {
                  if (VDTT_cw.v().ai != 89) {
                     this.a(var9);
                  }
               } else {
                  VDTT_da.a(R);
                  var7 = VDTT_dc.a(R);
                  var8 = VDTT_dc.b(R);
               }
            }

            if (this.T[0] == null) {
               int var16 = super.q - 8 - 20;
               int var10 = this.h() - 42;
               int var11 = this.f() + 33;
               if (var16 > var7) {
                  var16 = var7;
               }

               if (var10 > var8) {
                  var11 += (var10 - var8) / 2;
                  var10 = var8;
               }

               int var12 = (this.q - var16) / 2;
               this.T[0] = new VDTT_hw((byte)2, var12, var11, var16, var10, var7, var8);
               this.T[0].j = VDTT_ek.m().objX / this.ag - this.T[0].q / 2;
               ((VDTT_hw)this.T[0]).Q = VDTT_ek.m().objY / this.ag - this.T[0].r / 2;
            }
         }

         this.aa = -1;
      }

      if (R != null && this.T[super.a.b] != null) {
         this.a(var1, this.objX + this.T[super.a.b].objX, this.objY + this.T[super.a.b].objY);
         var2 = this.T[super.a.b].f;
         var3 = ((VDTT_hw)this.T[super.a.b]).N;
         if (var2 < 0) {
            var2 = 0;
         }

         if (var3 < 0) {
            var3 = 0;
         }

         var4 = var2 + this.T[super.a.b].q;
         var5 = var3 + this.T[super.a.b].r;
         if (var4 > VDTT_dc.a(R)) {
            var2 = (var4 = VDTT_dc.a(R)) - this.T[super.a.b].q;
         }

         if (var5 > VDTT_dc.b(R)) {
            var3 = (var5 = VDTT_dc.b(R)) - this.T[super.a.b].r;
         }

         int var14 = (var4 - var2) * DataCenter.d().r;
         var7 = (var5 - var3) * DataCenter.d().r;
         if (this.T[super.a.b].q * DataCenter.d().r > R.c) {
            var2 = 0;
            var14 = R.c;
         }

         if (this.T[super.a.b].r * DataCenter.d().r > R.d) {
            var3 = 0;
            var7 = R.d;
         }

         if (super.a.b == 0 && VDTT_cw.v().C().d == 15 && VDTT_cw.v().cr > 20) {
            var1.c((float)(VDTT_cw.v().cr / 20 * 30));
            var1.a(R, var2, var3, var14, var7, 0, 0.0F, 0.0F, 0);
            if (VDTT_cw.v().cr > 80) {
               for(var14 = 0; var14 < VDTT_cw.v().Q.size(); ++var14) {
                  VDTT_iz var15;
                  if ((var15 = (VDTT_iz)VDTT_cw.v().Q.get(var14)).l == 328) {
                     VDTT_dc.a(var1, var15.l, 0, var15.objX / this.ag, var15.objY / this.ag, var15.m().a / this.ag, var15.m().b / this.ag, 33);
                     break;
                  }
               }
            }

            var1.r();
         } else {
            var1.a(R, var2, var3, var14, var7, 0, 0.0F, 0.0F, 0);
         }

         this.a(var1, this.objX, this.objY);
         this.a(var1, this.T[super.a.b].objX - 1, this.T[super.a.b].objY - 1, this.T[super.a.b].q + 2, this.T[super.a.b].r + 2, 0, 22, 23, 1, 1);
      }

      switch(super.a.b) {
      case 0:
         this.a(var1, var2, var3, var4, var5);
         return;
      case 1:
         this.f(var1);
         return;
      case 2:
         VDTT_dg.b(VDTT_dg.e, var1, this.ad[this.ab], this.q / 2, this.T[super.a.b].objY - 12, 2, -1118703, -10275328);
         this.a(var1, this.T[super.a.b]);
         this.b(var1, var2, var3, var4, var5);
         if (this.O != null) {
            this.O.a(var1);
         }

         this.a((Graphics)var1);
         return;
      case 3:
         this.a(var1, this.T[super.a.b]);
         this.c(var1, var2, var3, var4, var5);
         if (this.O != null) {
            this.O.a(var1);
         }

         this.a((Graphics)var1);
      default:
      }
   }

   private void f(Graphics var1) {
      this.a(var1, this.U);
      int var2 = 0;

      for(int var3 = 0; var3 < this.U.i; ++var3) {
         for(int var4 = 0; var4 < this.U.P; ++var4) {
            if (this.U.b(var3)) {
               int var10003 = 1 + var4 * this.U.h;
               int var10004 = 1 + var3 * this.U.h;
               boolean var10 = var2 == this.U.k;
               int var9 = var10004;
               int var8 = var10003;
               if (var2 == VDTT_cw.v().al) {
                  var1.c(-9942667);
               }

               VDTT_dc.a(var1, 53, 0, var8, var9, 0);
               var1.f();
               if (var10) {
                  VDTT_dc.a(var1, 40, 0, var8 - 1, var9 - 1, 0);
               }

               VDTT_je var12 = this.P[var2];
               int var11 = -1;
               if (var12.a == 1) {
                  var11 = -2560;
               } else if (var12.a == 2) {
                  var11 = -65536;
               }

               VDTT_dg.b(VDTT_dg.e, var1, "" + var2, var8 + this.U.h / 2 - 1, var9 + this.U.h / 2 - 2, 2, var11, -16777216);
            }

            ++var2;
         }
      }

      this.a((Graphics)var1);
      this.U.a(var1, -10, -10, 0);
      VDTT_dg.d(VDTT_dg.d, var1, Caption.mH, this.q / 2, this.r - 15, 2, -1, -10275328);
      VDTT_dg.d(VDTT_dg.d, var1, Caption.xU + ": " + VDTT_cw.v().al, this.q / 2, this.r - 15 - 12, 2, -6488, -10275328);
   }

   private void a(Graphics var1, int var2, int var3, int var4, int var5) {
      if (DataCenter.l()) {
         VDTT_dg.b(VDTT_dg.d, var1, DataCenter.d().H[VDTT_cw.v().ai].b + Caption.hF + VDTT_cw.v().al, this.Z.objX + 90, this.T[super.a.b].objY - 12, 0, -1118703, -10275328);
      } else {
         VDTT_dg.b(VDTT_dg.d, var1, DataCenter.d().H[VDTT_cw.v().ai].b + Caption.hF + VDTT_cw.v().al, this.T[super.a.b].objX + this.T[super.a.b].q, this.T[super.a.b].objY - 12, 1, -1118703, -10275328);
      }

      var1.a(3, this.f() + 30);
      VDTT_dg.b(VDTT_dg.d, var1, "XY: " + VDTT_ek.m().objX + ", " + VDTT_ek.m().objY, 10, this.h() - 40, 0, -6488, -10275328);
      this.a(var1, this.a(), this.b());
      this.a(var1, this.T[super.a.b]);
      this.Y = -1;

      VDTT_gx var10;
      for(var5 = 0; var5 < VDTT_cw.v().aq.size(); ++var5) {
         var2 = (var10 = (VDTT_gx)VDTT_cw.v().aq.elementAt(var5)).objX / this.ag;
         var3 = var10.objY / this.ag;
         if (var10.k == 48) {
            var1.c(-350348);
         } else {
            var1.c(-2560);
         }

         VDTT_dc.a(var1, 37, 0, var2, var3, 3);
      }

      Vector var13 = new Vector();

      int var6;
      VDTT_gn var7;
      for(var6 = 0; var6 < VDTT_cw.v().aq.size(); ++var6) {
         var10 = (VDTT_gx)VDTT_cw.v().aq.elementAt(var6);
         (var7 = new VDTT_gn()).d = var10.objX / this.ag;
         var7.e = var10.objY / this.ag;
         var7.b = var10.m().j;
         var7.c = var10.m().k;
         var7.a = var10.k;
         var7.f = VDTT_dg.b(VDTT_dg.b, var7.b);
         var7.g = VDTT_dg.a(VDTT_dg.b) - 1;
         if (var10.k != 48) {
            var13.add(var7);
         }
      }

      Collections.sort(var13, VDTT_gn.h);

      for(var6 = 0; var6 < var13.size(); ++var6) {
         var7 = (VDTT_gn)var13.elementAt(var6);

         for(var4 = var6 + 1; var4 < var13.size() - 1; ++var4) {
            VDTT_gn var8 = (VDTT_gn)var13.elementAt(var4);
            if (var7.d - var7.f / 2 < var8.d + var8.f / 2 && var7.d + var7.f / 2 > var8.d - var8.f / 2 && var7.e < var8.e + var8.g && var7.g + var7.e > var8.e) {
               var8.e = var7.e - 6;
            }
         }
      }

      if (VDTT_cw.v().C().a != 87) {
         for(var6 = 0; var6 < var13.size(); ++var6) {
            var7 = (VDTT_gn)var13.elementAt(var6);
            var4 = VDTT_dg.b(VDTT_dg.b, var7.b);
            if (var7.d - var4 / 2 < 3) {
               var7.d = 3 + var4 / 2;
            }

            if (var7.d + var4 / 2 + 3 > VDTT_cw.v().aj / this.ag) {
               var7.d = VDTT_cw.v().aj / this.ag - 3 - var4 / 2;
            }

            if (!DataCenter.aj && VDTT_cw.v().C().d != 9) {
               if (var7.c.length() > 0) {
                  VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, var7.c, var7.d, var7.e - 14, 2, -16711681, -16777216);
               }

               VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, var7.b, var7.d, var7.e - 7, 2, -2560, -16777216);
            }
         }
      }

      var1.c(-16647317);

      for(var4 = 0; var4 < VDTT_cw.v().ap.size(); ++var4) {
         VDTT_gk var18;
         if ((var18 = (VDTT_gk)VDTT_cw.v().ap.elementAt(var4)).U) {
            var2 = var18.I / this.ag;
            var3 = var18.J / this.ag;
            VDTT_dc.a(var1, 37, 0, var2, var3, 3);
            VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, var18.p().k, var2, var3 - 7, 2, -16647317, -13553359);
         }
      }

      var1.c(-48128);
      if (!VDTT_cw.v().bZ && VDTT_cw.v().C().d != 5 && VDTT_cw.v().C().d != 6 && VDTT_cw.v().C().d != 19 && VDTT_cw.v().C().d != 20) {
         for(var5 = 0; var5 < VDTT_cw.v().av.size(); ++var5) {
            VDTT_fx var9;
            VDTT_fx var14;
            if ((var9 = var14 = (VDTT_fx)VDTT_cw.v().av.elementAt(var5)).p >= 0 || var9.o >= 0) {
               short var11 = var14.objX;
               short var12 = var14.objY;
               XYEntity var19;
               if ((var19 = VDTT_cw.g(var11, var12)) != null) {
                  var11 = var19.objX;
                  var12 = var19.objY;
               }

               if ((var6 = (var12 - 24) / this.ag) < 60) {
                  var12 = 10;
                  VDTT_aa.a(var1, 95, -270, (var11 - 20) / this.ag, 10, 40);
               } else if (var6 > (VDTT_cw.v().ak - 20) / this.ag) {
                  var6 = (VDTT_cw.v().ak - 68) / this.ag;
                  if (VDTT_cw.v().ai == 56 || VDTT_cw.v().ai == 48) {
                     VDTT_aa.a(var1, 95, -90, (var11 - 48) / this.ag, var6 - 2, 40);
                  }
               } else if (var11 > VDTT_cw.v().aj / 2) {
                  VDTT_aa.a(var1, 95, 0, (var11 - 40) / this.ag, var6, 40);
               } else {
                  VDTT_aa.a(var1, 95, -360, (var11 - 20) / this.ag, var6, 40);
               }

               var2 = var11 / this.ag;
               if ((var3 = (var12 - 48) / this.ag) > VDTT_cw.v().ak / this.ag - 5) {
                  var3 = VDTT_cw.v().ak / this.ag - 5;
               }

               String var16 = DataCenter.d().H[var14.l].b;
               if (var2 - VDTT_dg.b(VDTT_dg.d, var16) / 2 < 5) {
                  var2 = 5 + VDTT_dg.b(VDTT_dg.d, var16) / 2;
               }

               if (var2 > VDTT_cw.v().aj / this.ag - VDTT_dg.b(VDTT_dg.d, var16) / 2 - 5) {
                  var2 = VDTT_cw.v().aj / this.ag - VDTT_dg.b(VDTT_dg.d, var16) / 2 - 5;
               }

               if (var3 < 12) {
                  var3 += 12;
               }

               if (VDTT_cw.v().ai != 56 && VDTT_cw.v().ai != 48) {
                  VDTT_dg.a((VDTT_dg)VDTT_dg.c, var1, var16, var2, var3, 2, -48128, -16777216);
               } else {
                  VDTT_dg.a((VDTT_dg)VDTT_dg.c, var1, var16, var2 - 4, var3, 2, -48128, -16777216);
               }
            }
         }
      }

      var1.c(-16711681);
      VDTT_ek var17;
      if (VDTT_cw.v().bp != null) {
         for(var6 = 0; var6 < VDTT_cw.v().bp.b.size(); ++var6) {
            VDTT_el var15 = (VDTT_el)VDTT_cw.v().bp.b.elementAt(var6);
            if ((var17 = VDTT_cw.v().e(var15.a)) != null && !var17.aD.equals(VDTT_ek.m().aD)) {
               var2 = var17.objX / this.ag;
               var3 = var17.objY / this.ag;
               VDTT_dc.a(var1, 37, 0, var2, var3, 3);
               VDTT_dg.b(VDTT_dg.b, var1, var17.aD, var2, var3 - 7, 2, -16711681, -13553359);
            }
         }
      }

      var1.c(-3407617);

      for(var6 = 0; var6 < VDTT_cw.v().ao.size(); ++var6) {
         if ((var17 = (VDTT_ek)VDTT_cw.v().ao.get(var6)) != null && VDTT_cw.v().a(var17)) {
            var2 = var17.objX / this.ag;
            var3 = var17.objY / this.ag;
            VDTT_dc.a(var1, 37, 0, var2, var3, 3);
            VDTT_dg.b(VDTT_dg.b, var1, var17.aD, var2, var3 - 7, 2, -3407617, -13553359);
         }
      }

      var2 = VDTT_ek.m().objX / this.ag;
      var3 = VDTT_ek.m().objY / this.ag;
      if (DataCenter.d().h % 30 < 10) {
         var1.c(-1);
      } else {
         var1.c(-14443265);
      }

      VDTT_dc.a(var1, 37, 0, var2, var3, 3);
      var1.f();
      var1.f(-16742145);
      if (this.O != null) {
         this.O.a(var1);
      }

      if (!this.aj.q()) {
         this.aj.a(var1);
      }

      this.a((Graphics)var1);
   }

   private void b(Graphics var1, int var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < DataCenter.d().x[this.ab].b.length; ++var6) {
         if (DataCenter.d().x[this.ab].b[var6].a >= 0 && DataCenter.d().x[this.ab].b[var6].a < DataCenter.d().H.length && var2 - 50 <= DataCenter.d().x[this.ab].b[var6].b && DataCenter.d().x[this.ab].b[var6].b <= var4 + 50 && var3 - 14 <= DataCenter.d().x[this.ab].b[var6].c && DataCenter.d().x[this.ab].b[var6].c <= var5 + 14) {
            int var7 = DataCenter.d().x[this.ab].b[var6].b;
            String var8 = DataCenter.d().H[DataCenter.d().x[this.ab].b[var6].a].b;
            int var9;
            if ((var9 = VDTT_dg.b(VDTT_dg.d, var8)) < 40) {
               var9 = 40;
            }

            if (var7 < 2 + var9 / 2) {
               var7 = 2 + var9 / 2;
            }

            if (var7 > this.T[super.a.b].q - var9 / 2 - 2) {
               var7 = this.T[super.a.b].q - var9 / 2 - 2;
            }

            int var10 = DataCenter.d().x[this.ab].b[var6].c + 6;
            var1.d(90);
            if (DataCenter.l()) {
               this.a(var1, var7 - var9 / 2 - 1, var10 - 15, var9 + 2, 25, -11184811, 22, 23, 1, 1);
               this.a(var1, var7 - var9 / 2 - 1, var10 - 15, var9 + 2, 25, -11184811, 22, 23, 1, 1);
            } else {
               this.a(var1, var7 - var9 / 2 - 1, var10 - 7, var9 + 2, 13, -8492991, 22, 23, 1, 1);
            }

            var1.l = 1.0F;
            if (this.V > 0 && this.W == var6) {
               ++var7;
               ++var10;
            }

            if (DataCenter.d().x[this.ab].b[var6].a == VDTT_cw.v().ai) {
               VDTT_dg.b(VDTT_dg.b, var1, var8, var7, var10 - 1, 2, -6488, -10275328);
               if (DataCenter.d().h % 30 < 15) {
                  VDTT_dg.b(VDTT_dg.b, var1, var8, var7, var10 - 1, 2, -48128, -10275328);
               }
            } else {
               VDTT_dg.b(VDTT_dg.b, var1, var8, var7, var10 - 1, 2, -6488, -10275328);
            }

            if (VDTT_cw.v().br == 10 && DataCenter.d().x[this.ab].b[var6].a == 87) {
               this.ah = var7;
               this.ai = var10 - 1;
            }
         }
      }

   }

   private void c(Graphics var1, int var2, int var3, int var4, int var5) {
      for(var2 = 0; var2 < DataCenter.d().x[this.ac].b.length; ++var2) {
         var3 = DataCenter.d().x[this.ac].b[var2].b;
         String var7 = this.ad[var2];
         var5 = VDTT_dg.b(VDTT_dg.d, var7);
         if (var3 < 2 + var5 / 2) {
            var3 = 2 + var5 / 2;
         }

         if (var3 > this.T[super.a.b].q - var5 / 2 - 2) {
            var3 = this.T[super.a.b].q - var5 / 2 - 2;
         }

         int var6 = DataCenter.d().x[this.ac].b[var2].c - 1;
         this.a(var1, var3 - var5 / 2 - 1, 22 + var6 - 6, var5 + 2, 13, -8492991, 22, 23, 1, 1);
         if (this.V > 0 && this.X == var2) {
            VDTT_dg.b(VDTT_dg.b, var1, var7, var3, 22 + var6, 2, -48128, -10275328);
         } else {
            VDTT_dg.b(VDTT_dg.b, var1, var7, var3, 22 + var6, 2, -6488, -10275328);
         }

         if (VDTT_cw.v().br == 10 && var7.toLowerCase().equals(Caption.Bs[1].toLowerCase())) {
            this.ah = var3 + 8;
            this.ai = 22 + var6;
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 1) {
         var1.addElement(this.U.a(5001, this));
      } else if ((super.a.b == 2 || super.a.b == 3) && this.T[super.a.b] != null) {
         byte var2 = 22;
         int var3 = this.ab;
         if (super.a.b == 3) {
            var2 = 40;
            var3 = this.ac;
         }

         if (var3 >= DataCenter.d().x.length) {
            var3 = 0;
         }

         for(int var4 = 0; var4 < DataCenter.d().x[var3].b.length; ++var4) {
            if (DataCenter.d().x[var3].b[var4].a >= 0 && DataCenter.d().x[var3].b[var4].a < DataCenter.d().H.length) {
               int var5 = DataCenter.d().x[var3].b[var4].b + this.T[super.a.b].objX - var2 / 2;
               int var6 = DataCenter.d().x[var3].b[var4].c + this.T[super.a.b].objY - var2 / 2;
               int var7 = var5 + var2;
               int var8 = var6 + var2;
               if (VDTT_jb.a(var5, var6, var7, var8, 4, this.f(), 4 + (super.q - 8), this.f() + this.h())) {
                  if (var5 < 4) {
                     var5 = 4;
                  }

                  if (var6 < this.f()) {
                     var6 = this.f();
                  }

                  if (var7 > 4 + (super.q - 8)) {
                     var7 = 4 + (super.q - 8);
                  }

                  if (var8 > this.f() + this.h()) {
                     var8 = this.f() + this.h();
                  }

                  var1.addElement(new VDTT_hl(4000 + var4, var5, var6, var7, var8, this.T[super.a.b], this));
                  String var10;
                  if (super.a.b == 2) {
                     var10 = DataCenter.d().H[DataCenter.d().x[var3].b[var4].a].b;
                     var6 = DataCenter.d().x[var3].b[var4].c + this.T[super.a.b].objY;
                  } else {
                     var10 = this.ad[var4];
                     var6 = var8 - 4;
                  }

                  if ((var7 = VDTT_dg.b(VDTT_dg.d, var10)) < 40 && super.a.b == 2) {
                     var7 = 40;
                  }

                  var7 += var5 = DataCenter.d().x[var3].b[var4].b + this.T[super.a.b].objX - var7 / 2;
                  var8 = var6 + 11;
                  if (var5 < 4) {
                     var5 = 4;
                  }

                  if (var6 < this.f()) {
                     var6 = this.f();
                  }

                  if (var7 > 4 + (super.q - 8)) {
                     var7 = 4 + (super.q - 8);
                  }

                  if (var8 > this.f() + this.h()) {
                     var8 = this.f() + this.h();
                  }

                  var1.addElement(new VDTT_hl(4000 + var4, var5, var6, var7, var8, this.T[super.a.b], this));
               }
            }
         }
      }

      if (this.T[super.a.b] != null) {
         var1.addElement(new VDTT_hl(-1001, this.T[super.a.b].objX, this.T[super.a.b].objY, this.T[super.a.b].objX + this.T[super.a.b].q, this.T[super.a.b].objY + this.T[super.a.b].r, this.T[super.a.b], this));
      }

      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      try {
         super.a(var1, var2, var3);
         if (var1.j != null && var1.j instanceof VDTT_hw) {
            VDTT_hw var4 = (VDTT_hw)var1.j;
            var2 = var2 - var1.j.objX + var4.f;
            var3 = var3 - var1.j.objY + var4.N;
            this.aj = VDTT_bt.m().b(var2, var3);
            this.O = new VDTT_hi(146, var2, var3, 1);
            if (super.a.b == 0) {
               this.V = 10;
               VDTT_cw.v().bv = null;
               MenuConfig.K().a(false);
               VDTT_ek.m().j();
               VDTT_ek.m().S();
               int var10001 = var2 * this.ag;
               int var10002 = var3 * this.ag;
               if (VDTT_cw.v().U.a(var10001, var10002)) {
                  this.V = 0;
                  this.aj.I = -80;
               } else {
                  VDTT_ek.m().c(var2 * this.ag, var3 * this.ag);
               }
            }
         }

         int var8;
         if (var1.b >= 4000 && super.a.b != 1) {
            int var13 = var1.b - 4000;
            if (super.a.b == 3) {
               this.O = null;
               this.X = -1;
               this.ab = var13;
               this.f(2);
            } else {
               if (DataCenter.d().x[this.ab].b != null && var1.b >= 4000 && var1.b < 4000 + DataCenter.d().x[this.ab].b.length && DataCenter.d().x[this.ab].b[var13].a != VDTT_cw.v().ai) {
                  this.V = 10;
                  this.W = var13;
                  VDTT_cw.v().bv = null;
                  MenuConfig.K().a(false);
                  VDTT_ek.m().j();
                  VDTT_dy var10 = new VDTT_dy(DataCenter.d().x[this.ab].b[this.W].a, 0, 0);
                  Item var11 = null;

                  for(var8 = 0; var8 < VDTT_ek.m().aP.length; ++var8) {
                     if (VDTT_ek.m().aP[var8] != null) {
                        if (Item.d(VDTT_ek.m().aP[var8].c)) {
                           this.k();
                           VDTT_cw.v();
                           VDTT_cw.a(var10);
                           return;
                        }

                        if (VDTT_ek.m().aP[var8].c == 168) {
                           var11 = VDTT_ek.m().aP[var8];
                        }
                     }
                  }

                  if (var11 != null && var10.b()) {
                     this.k();
                     VDTT_cw.v();
                     VDTT_cw.q(var10.d);
                     return;
                  }

                  boolean var10000;
                  label106: {
                     VDTT_dy var9 = var10;
                     VDTT_cw.v();
                     if ((var13 = VDTT_cw.f(VDTT_cw.v().ai)) >= 0) {
                        for(int var5 = 0; var5 < DataCenter.d().x[var13].b.length; ++var5) {
                           if (DataCenter.d().x[var13].b[var5].a == var9.d) {
                              var10000 = true;
                              break label106;
                           }
                        }
                     }

                     var10000 = false;
                  }

                  if (!var10000) {
                     if (var11 == null) {
                        this.V = this.W = -1;
                        VDTT_cw.v().c(Caption.sI, -2560);
                        return;
                     }

                     this.V = -1;
                     if (VDTT_cw.v().ai == 87) {
                        this.k();
                        VDTT_cw.v().c(Caption.uU, -1);
                     }

                     DataCenter.d().ai.a(Caption.uT, 2002, this);
                     return;
                  }

                  this.k();
                  VDTT_cw.v().bv = var10;
                  if (VDTT_cw.v().ai == 67) {
                     VDTT_cw.v().bw = VDTT_cw.v().bv;
                     VDTT_cw.v();
                     VDTT_cw.q(86);
                  }
               }

            }
         } else {
            switch(var1.b) {
            case -1001:
               return;
            case 2001:
               this.k();
               VDTT_cw.v().bv = new VDTT_dy(87, 0, 0);
               VDTT_cw.v().bw = VDTT_cw.v().bv;
               VDTT_cw.v();
               VDTT_cw.q(86);
               return;
            case 2002:
               this.k();
               VDTT_cw.v();
               VDTT_cw.q(87);
               break;
            case 5001:
               if (var1.j.k >= 0) {
                  var8 = var1.j.k;

                  try {
                     if (var8 != VDTT_cw.v().al) {
                        VDTT_cw.d = true;
                        Message var12;
                        (var12 = new Message((byte)-7)).a(var8);
                        var12.l();
                     }
                  } catch (Exception var6) {
                     VDTT_jb.a(var6);
                     return;
                  }
               }
            }

         }
      } catch (Exception var7) {
      }
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      if (var1 == -2000 && this.Z.n.b > 0) {
         VDTT_iu var7;
         if ((var7 = (VDTT_iu)this.af.get(this.Z.n.b)).e != 0) {
            for(int var11 = 0; var11 < VDTT_cw.v().ap.size(); ++var11) {
               VDTT_gk var9;
               if ((var9 = (VDTT_gk)VDTT_cw.v().ap.elementAt(var11)).U && var9.k == var7.a) {
                  VDTT_ek.m().c(var9.objX, var9.objY);
                  break;
               }
            }
         } else if (var7.a != 48) {
            VDTT_cw.v();
            VDTT_cw.h(this.Z.n.d[this.Z.n.b]);
         } else {
            int var8 = 100000;
            VDTT_gx var10 = null;

            for(int var4 = 0; var4 < VDTT_cw.v().aq.size(); ++var4) {
               VDTT_gx var5;
               int var6;
               if ((var5 = (VDTT_gx)VDTT_cw.v().aq.get(var4)).k == var7.a && (var6 = VDTT_jb.a((XYEntity)var5, (XYEntity)VDTT_ek.m())) < var8) {
                  var8 = var6;
                  var10 = var5;
               }
            }

            if (var10 != null) {
               VDTT_ek.m().c(var10.objX, var10.objY);
            }
         }

         this.k();
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void f(int var1) {
      if (super.a.b == var1) {
         super.f(var1);
      } else {
         super.f(var1);
         this.aa = var1;
         ae = var1;
      }
   }

   private void a(String var1) {
      try {
         (new Thread(new VDTT_lp(this, var1))).start();
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   private void A() {
      int var1 = this.q;
      int var2 = this.r - this.h();

      try {
         if ((R = (VDTT_v)VDTT_dc.h.get((short)DataCenter.d().x[this.ab].a)) == null) {
            R = VDTT_da.i("mapmini_" + DataCenter.d().x[this.ab].a);
         }

         VDTT_da.a(R);
         var1 = VDTT_dc.a(R);
         var2 = VDTT_dc.b(R);
      } catch (Exception var4) {
      }

      if (this.T[2] == null) {
         this.T[2] = new VDTT_hw((byte)2, 14, this.f() + 33, super.q - 8 - 20, this.h() - 42, var1, var2);
         this.T[2].j = var1 / 2;
         ((VDTT_hw)this.T[2]).Q = var2 / 2;

         for(var1 = 0; var1 < DataCenter.d().x[this.ab].b.length; ++var1) {
            if (DataCenter.d().x[this.ab].b[var1].a == VDTT_cw.v().ai) {
               this.T[2].j = DataCenter.d().x[this.ab].b[var1].b - this.T[2].q / 2;
               ((VDTT_hw)this.T[2]).Q = DataCenter.d().x[this.ab].b[var1].c - this.T[2].r / 2;
               return;
            }
         }
      }

   }

   public final void d() {
      if (R != null) {
         R.a();
         R = null;
      }

      if (!this.L) {
         VDTT_ac.b().w();
      }

   }

   // $FF: synthetic method
   static VDTT_v a(VDTT_v var0) {
      R = var0;
      return var0;
   }
}
