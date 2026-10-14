package core.mchien.main2;

import java.util.Collections;
import java.util.Vector;

public final class VDTT_lj extends VDTT_kd {
   private String[] W;
   private VDTT_iq X;
   private VDTT_hs[] Y;
   private VDTT_hs[][] Z;
   private Vector aa;
   private boolean ab;
   public Vector T;
   public Vector U;
   public Vector V;
   private VDTT_bd ac;
   private VDTT_bd ad;
   private static int ae;
   private VDTT_bd[][] af;
   private int ag;

   public VDTT_lj(VDTT_p var1, int var2) {
      super(var1, 4, new String[]{Caption.K});
      this.W = Caption.Bw;
      this.ab = true;
      this.T = new Vector();
      this.U = new Vector();
      this.V = new Vector();
      this.I = var1;
      this.K = false;
      this.a(300, 220);
      this.X = new VDTT_iq(new VDTT_hp(1001, this.W), 10, this.f() + 6, super.q - 8 - 12, 23, 33, this);
      this.X.c = this.h() - 12;
      this.ac = this.a(34, this.f() + this.h() - 20, Caption.gX, 100);
      VDTT_ba var3;
      (var3 = this.a(this.q - 68, this.f() + this.h() - 23, Caption.hv, this, 1004, 7)).d(60, 20);
      this.X.a(var3, 0);
      this.X.a(var3, 1);
      (var3 = this.a(this.q - 132, this.f() + this.h() - 23, Caption.qS, this, 1005, 7)).d(60, 20);
      this.X.a(var3, 0);
      VDTT_bd var10000 = this.ac;
      boolean var4 = VDTT_da.g("friend" + VDTT_ek.m().b);
      var10000.m = var4;
      this.X.a(this.ac, 0);
      this.ad = this.a(9, this.f() + this.h() - 20, Caption.gX, 100);
      var10000 = this.ad;
      var4 = VDTT_da.g("enermy" + VDTT_ek.m().b);
      var10000.m = var4;
      this.X.a(this.ad, 1);
      this.X.a(this.a(9, this.f() + this.h() - 22, "", this, 1002, 65), 0);
      this.af = new VDTT_bd[2][];
      this.Z = new VDTT_hs[2][];
      this.Y = new VDTT_hs[3];
      this.B();
      this.C();
      this.V.clear();
      this.V.add(VDTT_ek.m());
      this.V.addAll(VDTT_cw.v().ao);
      this.Y[2] = new VDTT_hs((byte)1, 8, this.f() + 30, super.q - 8 - 8, 126, 42, this.V.size());
      var4 = false;
      this.X.a(super.b[0]);
      this.f(0);
   }

   private void B() {
      this.T.clear();
      if (this.ac.m) {
         for(int var2 = 0; var2 < VDTT_cw.v().aa.size(); ++var2) {
            VDTT_fj var1;
            if ((var1 = (VDTT_fj)VDTT_cw.v().aa.elementAt(var2)).d) {
               this.T.add(var1);
            }
         }
      } else {
         this.T.addAll(VDTT_cw.v().aa);
      }

      VDTT_da.a("friend" + VDTT_ek.m().b, this.ac.m);
      Collections.sort(this.T, VDTT_fj.a);
      this.ag = 21;
      this.Y[0] = new VDTT_hs((byte)1, 8, this.f() + 30, super.q - 8 - 8, this.ag * 6, this.ag, this.T.size());
      this.af[0] = new VDTT_bd[VDTT_cw.v().aa.size()];
      this.Z[0] = new VDTT_hs[VDTT_cw.v().aa.size()];

      for(int var3 = 0; var3 < VDTT_cw.v().aa.size(); ++var3) {
         this.af[0][var3] = new VDTT_bd(2, 2 + var3 * this.Y[0].h, "", this, 0);
         this.Z[0][var3] = new VDTT_hx((byte)1, 0, 0, this.af[0][var3].q, this.af[0][var3].r, this.af[0][var3].r, 1, this.Y[0]);
      }

   }

   private void C() {
      this.U.clear();
      if (this.ad.m) {
         for(int var2 = 0; var2 < VDTT_cw.v().ac.size(); ++var2) {
            VDTT_fc var1;
            if ((var1 = (VDTT_fc)VDTT_cw.v().ac.elementAt(var2)).c) {
               this.U.add(var1);
            }
         }
      } else {
         this.U.addAll(VDTT_cw.v().ac);
      }

      VDTT_da.a("enermy" + VDTT_ek.m().b, this.ad.m);
      Collections.sort(this.U, VDTT_fc.a);
      this.ag = 21;
      this.Y[1] = new VDTT_hs((byte)1, 8, this.f() + 30, super.q - 8 - 8, this.ag * 6, this.ag, this.U.size());
      this.af[1] = new VDTT_bd[VDTT_cw.v().ac.size()];
      this.Z[1] = new VDTT_hs[VDTT_cw.v().ac.size()];

      for(int var3 = 0; var3 < VDTT_cw.v().ac.size(); ++var3) {
         this.af[1][var3] = new VDTT_bd(2, 2 + var3 * this.Y[1].h, "", this, 0);
         this.Z[1][var3] = new VDTT_hx((byte)1, 0, 0, this.af[1][var3].q, this.af[1][var3].r, this.af[1][var3].r, 1, this.Y[1]);
      }

   }

   public final void d() {
      super.d();
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      super.perform(var1, var2, var3);
      if (super.a.b == 0) {
         this.c(var1, var2);
         VDTT_lj var6;
         VDTT_hp var7;
         switch(var1) {
         case 100:
            this.B();
            this.C();
            return;
         case 2001:
            var7 = (VDTT_hp)var2;
            var6 = this;

            try {
               Message var8;
               if (var6.X.h() != 0) {
                  if (var6.X.h() == 1) {
                     (var8 = new Message((byte)-18)).a(var6.h(var7.a));
                     var8.l();
                  }
                  break;
               }

               (var8 = new Message((byte)76)).a(var6.h(var7.a));
               var8.l();
            } catch (Exception var5) {
               VDTT_jb.a(var5);
            }

            return;
         case 2005:
            var7 = (VDTT_hp)var2;
            var6 = this;

            try {
               VDTT_cw.v();
               VDTT_cw.f(var6.h(var7.a));
               break;
            } catch (Exception var4) {
               VDTT_jb.a(var4);
               return;
            }
         case 2007:
            return;
         case 2008:
            var7 = (VDTT_hp)var2;
            VDTT_cw.v();
            this.h(var7.a);
         }
      }

   }

   private void D() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.af[this.X.h()].length; ++var2) {
         if (this.af[this.X.h()][var2].m) {
            this.g(var2);
            ++var1;
         }
      }

      if (var1 == 0) {
         DataCenter.d().ai.c(Caption.qa, -65536);
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      if (this.ab) {
         super.b(var1);
      } else {
         this.a(var1, this.objX, this.objY, this.q, this.r, Caption.K, (byte)2, this.K);
      }

      if (super.a.b == 0) {
         try {
            this.X.a(var1);
            this.a(var1, this.objX + 4, this.objY + this.f() + 22);
            this.a(var1, this.Y[this.X.h()]);

            for(int var2 = 0; var2 < this.Y[this.X.h()].i; ++var2) {
               if (this.Y[this.X.h()].b(var2)) {
                  if (var2 == this.Y[this.X.h()].k && this.X.h() != 2) {
                     VDTT_dc.a(var1, 0, var2 * this.Y[this.X.h()].h, this.Y[this.X.h()].q, this.Y[this.X.h()].h - 1);
                  }

                  int var8;
                  int var14;
                  switch(this.X.h()) {
                  case 0:
                     VDTT_fj var13 = (VDTT_fj)this.aa.elementAt(var2);
                     int var5 = var2;
                     Graphics var4 = var1;
                     VDTT_lj var3 = this;

                     try {
                        if (var13.d) {
                           VDTT_dc.a(var4, 302, 0, 22, 6 + var5 * var3.Y[var3.X.h()].h, 20);
                        } else if (var13.b == 1) {
                           VDTT_dc.a(var4, 304, 0, 22, 6 + var5 * var3.Y[var3.X.h()].h, 20);
                        } else {
                           VDTT_dc.a(var4, 303, 0, 22, 6 + var5 * var3.Y[var3.X.h()].h, 20);
                        }

                        if (var5 == var3.Y[var3.X.h()].l) {
                           VDTT_dg.b(VDTT_dg.d, var4, var13.c + (var13.b == 2 ? Caption.gZ : ""), 35, 10 + var5 * var3.Y[var3.X.h()].h, 0, -3089954, -16777216);
                        } else {
                           VDTT_dg.b(VDTT_dg.d, var4, var13.c + (var13.b == 2 ? Caption.gZ : ""), 34, 11 + var5 * var3.Y[var3.X.h()].h, 0, -3089954, -16777216);
                        }

                        var14 = var4.e;
                        var8 = var4.f;
                        var3.a(var4, var14 + var3.af[var3.X.h()][var5].objX, var8 + var3.af[var3.X.h()][var5].objY);
                        var3.af[var3.X.h()][var5].b(var4);
                        var3.a(var4, var14, var8);
                     } catch (Exception var10) {
                        VDTT_jb.a(var10);
                     }
                     break;
                  case 1:
                     VDTT_fc var12 = (VDTT_fc)this.aa.elementAt(var2);
                     if (var12.c) {
                        VDTT_dc.a(var1, 302, 0, 22, 6 + var2 * this.Y[this.X.h()].h, 20);
                     } else {
                        VDTT_dc.a(var1, 304, 0, 22, 6 + var2 * this.Y[this.X.h()].h, 20);
                     }

                     if (var2 == this.Y[this.X.h()].l) {
                        VDTT_dg.b(VDTT_dg.d, var1, var12.b, 35, 10 + var2 * this.Y[this.X.h()].h, 0, -1, -16777216);
                     } else {
                        VDTT_dg.b(VDTT_dg.d, var1, var12.b, 34, 11 + var2 * this.Y[this.X.h()].h, 0, -1, -16777216);
                     }

                     var14 = var1.e;
                     var8 = var1.f;
                     this.a(var1, var14 + this.af[this.X.h()][var2].objX, var8 + this.af[this.X.h()][var2].objY);
                     this.af[this.X.h()][var2].b(var1);
                     this.a(var1, var14, var8);
                     break;
                  case 2:
                     VDTT_ek var10003 = (VDTT_ek)this.aa.elementAt(var2);
                     boolean var7 = var2 == this.Y[this.X.h()].k;
                     VDTT_ek var6 = var10003;
                     this.a(var1, 0, var2 * this.Y[this.X.h()].h, this.Y[this.X.h()].q, 40, 46, 22, 23, 1, 1);
                     if (var7) {
                        VDTT_dc.a(var1, 1, var2 * this.Y[this.X.h()].h + 1, this.Y[this.X.h()].q - 2, 38);
                     }

                     VDTT_aa.a(var1, var6.ag(), 0, 10, var2 * this.Y[this.X.h()].h + 5, 83);
                     var8 = var2 == this.Y[this.X.h()].k ? -2560 : -1;
                     var14 = 46;
                     int var9 = var2 * this.Y[this.X.h()].h + 10;
                     if (var2 == this.Y[this.X.h()].l && !var6.aD.equals(VDTT_ek.m().aD)) {
                        ++var14;
                        ++var9;
                     }

                     VDTT_dg.a(VDTT_dg.d, var1, Caption.zd[3] + " " + var6.aD, var14, var9, 0, var8);
                     VDTT_dg.a(VDTT_dg.d, var1, Caption.zd[5] + " " + var6.w(), var14, var9 + 10, 0, var8);
                     VDTT_dg.a(VDTT_dg.d, var1, Caption.zd[4] + " " + var6.ai(), var14, var9 + 20, 0, var8);
                  }
               }
            }
         } catch (Exception var11) {
         }

         this.a(var1);
         this.a(var1, this.objX + 4, this.objY + this.f());
         switch(this.X.h()) {
         case 0:
            VDTT_dg.a(VDTT_dg.d, var1, Caption.pH + this.aa.size(), 112, this.h() - 13, 0, -1);
            this.Y[this.X.h()].b(var1, this);
            return;
         case 1:
            VDTT_dg.a(VDTT_dg.d, var1, Caption.pH + this.aa.size(), 97, this.h() - 13, 0, -1);
            this.Y[this.X.h()].b(var1, this);
            return;
         case 2:
            VDTT_dg.a(VDTT_dg.d, var1, Caption.gY + this.V.size(), 10, this.h() - 10, 0, -1);
         }
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         this.X.e();

         for(int var1 = 0; var1 < this.Y.length; ++var1) {
            this.Y[this.X.h()].a();
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (!this.ab) {
         var1.removeElementAt(0);
      }

      if (super.a.b == 0) {
         if (this.X.h() < 2) {
            for(int var4 = 0; var4 < this.Z[this.X.h()].length; ++var4) {
               int var2 = this.Y[this.X.h()].objX + this.af[this.X.h()][var4].objX;
               int var3 = this.Y[this.X.h()].objY + this.af[this.X.h()][var4].objY - this.Y[this.X.h()].f;
               if (VDTT_jb.a(this.Y[this.X.h()].objX, this.Y[this.X.h()].objY, this.Y[this.X.h()].objX + this.Y[this.X.h()].q, this.Y[this.X.h()].objY + this.Y[this.X.h()].r, var2, var3) && VDTT_jb.a(this.Y[this.X.h()].objX, this.Y[this.X.h()].objY, this.Y[this.X.h()].objX + this.Y[this.X.h()].q, this.Y[this.X.h()].objY + this.Y[this.X.h()].r, var2 + this.af[this.X.h()][var4].q, var3 + this.af[this.X.h()][var4].r)) {
                  this.Z[this.X.h()][var4].objX = (short)var2;
                  this.Z[this.X.h()][var4].objY = (short)var3;
                  var1.addElement(this.Z[this.X.h()][var4].a(8000 + var4, this));
               }
            }
         }

         var1.addElement(this.X.f());
         var1.addElement(this.Y[this.X.h()].a(1003, this));
      }

      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (var1.b >= 8000 && var1.b < 9000) {
         int var8 = var1.b - 8000;
         VDTT_bd var10000 = this.af[this.X.h()][var8];
         boolean var9 = !this.af[this.X.h()][var8].m;
         var10000.m = var9;
      } else {
         if (super.a.b == 0) {
            switch(var1.b) {
            case 1001:
               if (var1.j.k >= 0) {
                  ae = var1.j.k;
                  this.X.a(var1.j.k);
                  this.F();
                  return;
               }
               break;
            case 1002:
               return;
            case 1003:
               if (var1.j.k >= 0) {
                  int var4 = var3;
                  var3 = var2;
                  var2 = var1.j.k;
                  Vector var5 = new Vector();
                  String var6 = "";
                  if (this.X.h() == 0) {
                     VDTT_fj var7;
                     if ((var7 = (VDTT_fj)this.T.elementAt(var2)).b == 2) {
                        var5.addElement(new VDTT_iu(2000, Caption.ha));
                        var5.addElement(new VDTT_iu(2001, Caption.hb));
                     }

                     if (var7.b < 2) {
                        var5.addElement(new VDTT_iu(2001, Caption.hc));
                     }

                     if (VDTT_cw.v().bp != null && !VDTT_cw.v().bp.c()) {
                        if (VDTT_cw.v().bp.a() && !VDTT_cw.v().bp.a(var7.c)) {
                           var5.addElement(new VDTT_iu(2005, Caption.ex));
                        }
                     } else {
                        var5.addElement(new VDTT_iu(2005, Caption.ew));
                     }

                     var6 = a(var5, var7.c);
                  } else if (this.X.h() == 1) {
                     VDTT_fc var10 = (VDTT_fc)this.aa.elementAt(var2);
                     var5.addElement(new VDTT_iu(2001, Caption.hd));
                     if (VDTT_cw.v().bp != null && !VDTT_cw.v().bp.c()) {
                        if (VDTT_cw.v().bp.a() && !VDTT_cw.v().bp.a(var10.b)) {
                           var5.addElement(new VDTT_iu(2005, Caption.ex));
                        }
                     } else {
                        var5.addElement(new VDTT_iu(2005, Caption.cj));
                     }

                     var6 = a(var5, var10.b);
                  } else {
                     VDTT_ek var11;
                     if (this.X.h() == 2 && !(var11 = (VDTT_ek)this.aa.elementAt(var2)).equals(VDTT_ek.m())) {
                        if (VDTT_cw.v().bp != null && !VDTT_cw.v().bp.c()) {
                           if (VDTT_cw.v().bp.a() && !VDTT_cw.v().bp.a(var11.aD)) {
                              var5.addElement(new VDTT_iu(2005, Caption.ex));
                           }
                        } else {
                           var5.addElement(new VDTT_iu(2005, Caption.cj));
                        }

                        var6 = a(var5, var11.aD);
                     }
                  }

                  this.a(var5, var6, var2, var3, var4);
                  return;
               }
               break;
            case 1004:
               this.D();
               return;
            case 1005:
               this.E();
            }
         }

      }
   }

   private void E() {
      int var1 = 0;

      for(int var3 = 0; var3 < this.T.size(); ++var3) {
         if (((VDTT_fj)this.T.get(var3)).b == 2) {
            this.g(var3);
            ++var1;
         }
      }

      DataCenter.d().ai.c(VDTT_jb.b(Caption.qT, String.valueOf(var1)), -1);
   }

   public final void f(int var1) {
      super.f(var1);
      if (this.X != null && super.a.b == 0) {
         this.X.a(ae);
         this.F();
      }

   }

   private void F() {
      if (this.X != null) {
         switch(this.X.h()) {
         case 0:
            this.aa = this.T;
            return;
         case 1:
            this.aa = this.U;
            return;
         case 2:
            this.aa = this.V;
         }
      }

   }

   private void g(int var1) {
      try {
         Message var2;
         if (this.X.h() != 0) {
            if (this.X.h() == 1) {
               (var2 = new Message((byte)-18)).a(this.h(var1));
               var2.l();
            }

            return;
         }

         (var2 = new Message((byte)76)).a(this.h(var1));
         var2.l();
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }

   }

   private String h(int var1) {
      try {
         if (this.X.h() == 0) {
            return ((VDTT_fj)this.aa.elementAt(var1)).c;
         }

         if (this.X.h() == 1) {
            return ((VDTT_fc)this.aa.elementAt(var1)).b;
         }

         if (this.X.h() == 2) {
            return ((VDTT_ek)this.V.elementAt(var1)).aD;
         }
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }

      return "";
   }
}
