package core.mchien.main2;

import java.util.Collections;
import java.util.Vector;

public final class VDTT_ms extends VDTT_kd {
   private static int ae;
   private final VDTT_ba af;
   private final VDTT_ba ag;
   public VDTT_ba T;
   public VDTT_ba U;
   public VDTT_ba V;
   public VDTT_bd W;
   public VDTT_bd X;
   public VDTT_bd Y;
   public Vector Z = new Vector();
   public Vector aa = new Vector();
   public Vector ab = new Vector();
   public Vector ac = new Vector();
   private VDTT_hs[][] ah;
   private VDTT_iq ai;
   private String[] aj;
   private boolean ak;
   private boolean al;
   private VDTT_bd am;
   private VDTT_bd an;
   private VDTT_bd[][] ao;
   private VDTT_hs[][] ap;
   private int aq;
   private Vector ar;
   private int as;
   public static int ad;

   public VDTT_ms(VDTT_p var1) {
      super(var1, 4, Caption.zO);
      this.aj = Caption.zS;
      this.ak = true;
      this.as = 28;
      this.I = var1;
      this.K = false;
      this.a(300, 220);
      this.ai = new VDTT_iq(new VDTT_hp(1001, this.aj), this);
      this.ai.c = this.h() - 12;
      int var3 = super.q - 8 - 57;
      int var2 = this.f() + this.h() - 25;
      this.T = this.a(var3, var2, Caption.zd[2], this, 101, 15);
      this.T.d(54, 20);
      this.U = this.a(this.T.objX - 57, this.T.objY, Caption.kj, this, 102, 15);
      this.U.d(this.T.q, this.T.r);
      this.W = this.a(10, this.f() + this.h() - 21, Caption.kk, this, 104);
      this.X = this.a(80, this.f() + this.h() - 21, Caption.kl, this, 105);
      VDTT_bd var10000 = this.X;
      boolean var5 = VDTT_cw.v().ca;
      var10000.m = var5;
      this.Y = this.a(10, this.f() + this.h() - 21, Caption.dz, this, 106);
      var10000 = this.Y;
      var5 = VDTT_eq.a().a(38);
      var10000.m = var5;
      VDTT_ba var4;
      (var4 = this.a(this.T.objX, this.T.objY, Caption.km, this, 103, 15)).d(this.T.q, this.T.r);
      this.ai.a(this.T, 0);
      this.ai.a(this.U, 0);
      this.ai.a(this.W, 0);
      this.ai.a(this.X, 0);
      this.ai.a(this.Y, 1);
      this.ai.a(var4, 1);
      this.ah = new VDTT_hs[3][];
      this.ah[0] = new VDTT_hs[3];
      var5 = false;
      this.ai.a(super.b[0]);
      this.D();
      this.V = this.a(this.T.objX - 114, this.T.objY, Caption.sC, this, 1002, 7);
      this.V.d(this.T.q, this.T.r);
      this.a(this.V, 1);
      this.ag = this.a(this.T.objX, this.T.objY, Caption.hv, this, 1004, 7);
      this.ag.d(this.T.q, this.T.r);
      this.a(this.ag, 1);
      this.a(this.ag, 2);
      this.af = this.a(this.T.objX - 57, this.T.objY, Caption.qS, this, 1005, 7);
      this.af.d(this.T.q, this.T.r);
      this.a(this.af, 1);
      this.am = this.a(this.W.objX, this.W.objY, Caption.gX, 100);
      var10000 = this.am;
      var5 = VDTT_da.g("friend" + VDTT_ek.m().b);
      var10000.m = var5;
      this.a(this.am, 1);
      this.an = this.a(this.W.objX, this.W.objY, Caption.gX, 101);
      var10000 = this.an;
      var5 = VDTT_da.g("enermy" + VDTT_ek.m().b);
      var10000.m = var5;
      this.a(this.an, 2);
      this.ao = new VDTT_bd[2][];
      this.ap = new VDTT_hs[2][];
      this.ah[1] = new VDTT_hs[1];
      this.ah[2] = new VDTT_hs[1];
      this.B();
      this.C();
      this.f(ad);
      (new Message((byte)43)).l();
   }

   public final void B() {
      this.ab.clear();
      if (this.am.m) {
         for(int var2 = 0; var2 < VDTT_cw.v().aa.size(); ++var2) {
            VDTT_fj var1;
            if ((var1 = (VDTT_fj)VDTT_cw.v().aa.elementAt(var2)).d) {
               this.ab.add(var1);
            }
         }
      } else {
         this.ab.addAll(VDTT_cw.v().aa);
      }

      Collections.sort(this.ab, VDTT_fj.a);
      this.aq = 21;
      this.ah[1][0] = new VDTT_hs((byte)1, 7, this.f() + 5, super.q - 8 - 6, this.aq * 8, this.aq, this.ab.size());
      this.ao[0] = new VDTT_bd[VDTT_cw.v().aa.size()];
      this.ap[0] = new VDTT_hs[VDTT_cw.v().aa.size()];

      for(int var3 = 0; var3 < VDTT_cw.v().aa.size(); ++var3) {
         this.ao[0][var3] = new VDTT_bd(3, 2 + var3 * this.ah[1][0].h, "", this, 0);
         this.ap[0][var3] = new VDTT_hx((byte)1, 0, 0, this.ao[0][var3].q, this.ao[0][var3].r, this.ao[0][var3].r, 1, this.ah[1][0]);
      }

   }

   public final void C() {
      this.ac.clear();
      if (this.an.m) {
         for(int var2 = 0; var2 < VDTT_cw.v().ac.size(); ++var2) {
            VDTT_fc var1;
            if ((var1 = (VDTT_fc)VDTT_cw.v().ac.elementAt(var2)).c) {
               this.ac.add(var1);
            }
         }
      } else {
         this.ac.addAll(VDTT_cw.v().ac);
      }

      Collections.sort(this.ac, VDTT_fc.a);
      this.aq = 21;
      this.ah[2][0] = new VDTT_hs((byte)1, 7, this.f() + 5, super.q - 8 - 6, this.aq * 8, this.aq, this.ac.size());
      this.ao[1] = new VDTT_bd[VDTT_cw.v().ac.size()];
      this.ap[1] = new VDTT_hs[VDTT_cw.v().ac.size()];

      for(int var3 = 0; var3 < VDTT_cw.v().ac.size(); ++var3) {
         this.ao[1][var3] = new VDTT_bd(3, 2 + var3 * this.ah[2][0].h, "", this, 0);
         this.ap[1][var3] = new VDTT_hx((byte)1, 0, 0, this.ao[1][var3].q, this.ao[1][var3].r, this.ao[1][var3].r, 1, this.ah[2][0]);
      }

   }

   private void E() {
      this.ah[0][0] = new VDTT_hs((byte)1, 8, this.f() + 35, this.q - 18, this.as * 5, this.as, VDTT_cw.v().bp.b.size());
      VDTT_bd var10000 = this.W;
      boolean var2 = VDTT_cw.v().bp.c;
      var10000.m = var2;
   }

   private void F() {
      this.ah[0][1] = new VDTT_hs((byte)1, 8, this.f() + 35, this.q - 18, this.as * 5, this.as, this.Z.size());
   }

   private void G() {
      this.aa.clear();
      this.aa.add(VDTT_ek.m());
      this.aa.addAll(VDTT_cw.v().ao);
      this.ah[0][2] = new VDTT_hs((byte)1, 8, this.f() + 35, super.q - 8 - 10, this.as * 5, this.as, this.aa.size());
   }

   public final void D() {
      this.E();
      this.F();
      this.G();
      if (this.al && this.Z.size() == 0) {
         this.I.c(Caption.cz, -1);
         this.al = false;
      }

   }

   private void H() {
      int var1 = 0;
      int var2 = super.a.b == 1 ? 0 : 1;

      for(int var3 = 0; var3 < this.ao[var2].length; ++var3) {
         if (this.ao[var2][var3].m) {
            this.g(var3);
            ++var1;
         }
      }

      if (var1 == 0) {
         DataCenter.d().ai.c(Caption.qa, -65536);
      }

   }

   private void g(int var1) {
      try {
         Message var2;
         if (super.a.b != 1) {
            if (super.a.b == 2) {
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
         if (super.a.b == 1) {
            return ((VDTT_fj)this.ar.elementAt(var1)).c;
         }

         if (super.a.b == 2) {
            return ((VDTT_fc)this.ar.elementAt(var1)).b;
         }
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }

      return "";
   }

   public final void d() {
      super.d();
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      super.perform(var1, var2, var3);
      if (super.a.b < this.w()) {
         this.c(var1, var2);
         VDTT_ms var13;
         VDTT_hp var14;
         Message var16;
         Message var17;
         VDTT_el var20;
         switch(var1) {
         case 55:
            var14 = (VDTT_hp)var2;
            var13 = this;

            try {
               var20 = var13.i(var14.a);
               VDTT_cw.v();
               VDTT_cw.j(var20.a);
               break;
            } catch (Exception var8) {
               VDTT_jb.a(var8);
               return;
            }
         case 56:
            var14 = (VDTT_hp)var2;
            var13 = this;

            try {
               var20 = var13.i(var14.a);
               (var16 = new Message((byte)46)).a(var20.a);
               var16.l();
               break;
            } catch (Exception var7) {
               VDTT_jb.a(var7);
               return;
            }
         case 57:
            var14 = (VDTT_hp)var2;
            var13 = this;

            try {
               var20 = var13.i(var14.a);
               (var16 = new Message((byte)47)).a(var20.a);
               var16.l();
               break;
            } catch (Exception var6) {
               VDTT_jb.a(var6);
               return;
            }
         case 100:
            VDTT_da.a("friend" + VDTT_ek.m().b, this.am.m);
            this.B();
            return;
         case 101:
            VDTT_da.a("enermy" + VDTT_ek.m().b, this.an.m);
            this.C();
            return;
         case 104:
            try {
               (new Message((byte)42)).l();
               break;
            } catch (Exception var5) {
               VDTT_jb.a(var5);
               return;
            }
         case 105:
            boolean var15 = this.X.m;
            this.X.m = var15;
            VDTT_cw.v().ca = this.X.m;
            return;
         case 106:
            VDTT_eq.a().a(38, this.Y.m);
            return;
         case 2000:
            VDTT_cw.v();
            VDTT_hp var19;
            VDTT_cw.h((var19 = (VDTT_hp)var2).f);
            break;
         case 2001:
            var14 = (VDTT_hp)var2;
            var13 = this;

            try {
               if (var13.a.b == 1) {
                  (var17 = new Message((byte)76)).a(var13.h(var14.a));
                  var17.l();
                  return;
               }

               if (var13.a.b == 2) {
                  (var17 = new Message((byte)-18)).a(var13.h(var14.a));
                  var17.l();
               }
               break;
            } catch (Exception var11) {
               VDTT_jb.a(var11);
               return;
            }
         case 2005:
            var14 = (VDTT_hp)var2;
            var13 = this;

            try {
               if (var13.a.b == 0) {
                  VDTT_ek var18 = (VDTT_ek)var13.aa.elementAt(var14.a);
                  VDTT_cw.v();
                  VDTT_cw.f(var18.aD);
               } else {
                  try {
                     VDTT_cw.v();
                     VDTT_cw.f(var13.h(var14.a));
                  } catch (Exception var9) {
                     VDTT_jb.a(var9);
                     break;
                  }
               }
            } catch (Exception var10) {
               VDTT_jb.a(var10);
            }

            return;
         case 2006:
            VDTT_hp var12 = (VDTT_hp)var2;

            try {
               (var17 = Message.c((byte)15)).a(var12.f);
               var17.l();
            } catch (Exception var4) {
               VDTT_jb.a(var4);
               return;
            }
         }
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (super.a.b < this.w()) {
         if (var1.b >= 8000 && var1.b < 9000) {
            int var10 = var1.b - 8000;
            boolean var11;
            VDTT_bd var10000;
            if (super.a.b == 1) {
               var10000 = this.ao[0][var10];
               var11 = !this.ao[0][var10].m;
               var10000.m = var11;
               return;
            }

            var10000 = this.ao[1][var10];
            var11 = !this.ao[1][var10].m;
            var10000.m = var11;
            return;
         }

         switch(var1.b) {
         case 101:
            if (VDTT_cw.v().bp != null && !VDTT_cw.v().bp.c()) {
               this.ak = true;
               this.A();
               this.f(this.w());
               this.Q.n.b = 4;
               super.P.a(3);
               this.z();
               return;
            }

            try {
               (new Message((byte)41)).l();
               break;
            } catch (Exception var9) {
               VDTT_jb.a(var9);
               return;
            }
         case 102:
            try {
               (new Message((byte)44)).l();
               break;
            } catch (Exception var8) {
               VDTT_jb.a(var8);
               return;
            }
         case 103:
            this.al = true;
            K();
            return;
         case 1001:
            if (var1.j.k >= 0) {
               ae = var1.j.k;
               this.ai.a(var1.j.k);
               this.J();
               return;
            }
            break;
         case 1002:
            this.I.a((MainScreen)(new VDTT_jj(this.I, this)));
            return;
         case 1003:
            if (var1.j.k >= 0) {
               int var4 = var3;
               var3 = var2;
               var2 = var1.j.k;
               Vector var5 = new Vector();
               String var6 = "";
               if (super.a.b == 0) {
                  if (this.ai.h() == 2) {
                     VDTT_ek var7;
                     if (!(var7 = (VDTT_ek)this.aa.elementAt(var2)).equals(VDTT_ek.m())) {
                        if (VDTT_cw.v().bp != null && !VDTT_cw.v().bp.c()) {
                           if (VDTT_cw.v().bp.a() && !VDTT_cw.v().bp.a(var7.aD)) {
                              var5.addElement(new VDTT_iu(2005, Caption.ex));
                           }
                        } else {
                           var5.addElement(new VDTT_iu(2005, Caption.cj));
                        }

                        var6 = a(var5, var7.aD);
                     }
                  } else {
                     VDTT_el var12;
                     if (!(var12 = this.i(var2)).a.equals(VDTT_ek.m().aD)) {
                        if (this.ai.h() == 0 && VDTT_cw.v().bp != null && VDTT_cw.v().bp.a()) {
                           var5.addElement(new VDTT_iu(56, Caption.kt));
                           var5.addElement(new VDTT_iu(57, Caption.ku));
                        }

                        var6 = a(var5, var12.a);
                        VDTT_it var13;
                        if (this.ai.h() == 1 && (VDTT_cw.v().bp == null || VDTT_cw.v().bp.c()) && !(var13 = (VDTT_it)this.Z.elementAt(var2)).d() && !var13.c) {
                           var5.addElement(new VDTT_iu(55, Caption.kv));
                        }
                     }
                  }
               } else if (super.a.b == 1) {
                  VDTT_fj var14;
                  if ((var14 = (VDTT_fj)this.ab.elementAt(var2)).b == 2) {
                     var5.addElement(new VDTT_iu(2000, Caption.ha));
                     var5.addElement(new VDTT_iu(2001, Caption.hb));
                  }

                  if (var14.b < 2) {
                     var5.addElement(new VDTT_iu(2001, Caption.hc));
                  }

                  if (VDTT_cw.v().bp != null && !VDTT_cw.v().bp.c()) {
                     if (VDTT_cw.v().bp.a() && !VDTT_cw.v().bp.a(var14.c)) {
                        var5.addElement(new VDTT_iu(2005, Caption.ex));
                     }
                  } else {
                     var5.addElement(new VDTT_iu(2005, Caption.ew));
                  }

                  var5.addElement(new VDTT_iu(2006, Caption.xl));
                  var6 = a(var5, var14.c);
               } else if (super.a.b == 2) {
                  VDTT_fc var15 = (VDTT_fc)this.ar.elementAt(var2);
                  var5.addElement(new VDTT_iu(2001, Caption.hd));
                  if (VDTT_cw.v().bp != null && !VDTT_cw.v().bp.c()) {
                     if (VDTT_cw.v().bp.a() && !VDTT_cw.v().bp.a(var15.b)) {
                        var5.addElement(new VDTT_iu(2005, Caption.ex));
                     }
                  } else {
                     var5.addElement(new VDTT_iu(2005, Caption.cj));
                  }

                  var6 = a(var5, var15.b);
               }

               this.a(var5, var6, var2, var3, var4);
               return;
            }
            break;
         case 1004:
            this.H();
            return;
         case 1005:
            this.I();
         }
      }

   }

   private void I() {
      int var1 = 0;

      for(int var3 = 0; var3 < this.ab.size(); ++var3) {
         if (((VDTT_fj)this.ab.get(var3)).b == 2) {
            this.g(var3);
            ++var1;
         }
      }

      if (var1 > 0) {
         DataCenter.d().ai.c(VDTT_jb.b(Caption.qT, String.valueOf(var1)), -1);
      }

   }

   public final void f(int var1) {
      super.f(var1);
      ad = var1;
      if (this.ai != null) {
         if (super.a.b == 0) {
            this.ai.a(ae);
            this.J();
            return;
         }

         if (super.a.b == this.w()) {
            super.P.a(3);
            this.z();
            return;
         }

         if (super.a.b == 1) {
            this.ar = this.ab;
            return;
         }

         if (super.a.b == 2) {
            this.ar = this.ac;
         }
      }

   }

   private void J() {
      if (this.ai != null) {
         switch(this.ai.h()) {
         case 1:
            K();
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (!this.ak) {
         var1.removeElementAt(0);
      }

      if (super.a.b == 0) {
         var1.addElement(this.ai.f());
         var1.addElement(this.ah[0][this.ai.h()].a(1003, this));
      } else {
         int var2;
         int var3;
         int var4;
         if (super.a.b == 1) {
            for(var4 = 0; var4 < this.ap[0].length; ++var4) {
               var2 = this.ah[1][0].objX + this.ao[0][var4].objX;
               var3 = this.ah[1][0].objY + this.ao[0][var4].objY - this.ah[1][0].f;
               if (VDTT_jb.a(this.ah[1][0].objX, this.ah[1][0].objY, this.ah[1][0].objX + this.ah[1][0].q, this.ah[1][0].objY + this.ah[1][0].r, var2, var3) && VDTT_jb.a(this.ah[1][0].objX, this.ah[1][0].objY, this.ah[1][0].objX + this.ah[1][0].q, this.ah[1][0].objY + this.ah[1][0].r, var2 + this.ao[0][var4].q, var3 + this.ao[0][var4].r)) {
                  this.ap[0][var4].objX = (short)var2;
                  this.ap[0][var4].objY = (short)var3;
                  var1.addElement(this.ap[0][var4].a(8000 + var4, this));
               }
            }

            var1.addElement(this.ah[1][0].a(1003, this));
         } else if (super.a.b == 2) {
            for(var4 = 0; var4 < this.ap[1].length; ++var4) {
               var2 = this.ah[2][0].objX + this.ao[1][var4].objX;
               var3 = this.ah[2][0].objY + this.ao[1][var4].objY - this.ah[2][0].f;
               if (VDTT_jb.a(this.ah[2][0].objX, this.ah[2][0].objY, this.ah[2][0].objX + this.ah[2][0].q, this.ah[2][0].objY + this.ah[2][0].r, var2, var3) && VDTT_jb.a(this.ah[2][0].objX, this.ah[2][0].objY, this.ah[2][0].objX + this.ah[2][0].q, this.ah[2][0].objY + this.ah[2][0].r, var2 + this.ao[1][var4].q, var3 + this.ao[1][var4].r)) {
                  this.ap[1][var4].objX = (short)var2;
                  this.ap[1][var4].objY = (short)var3;
                  var1.addElement(this.ap[1][var4].a(8000 + var4, this));
               }
            }

            var1.addElement(this.ah[2][0].a(1003, this));
         }
      }

      return var1;
   }

   public final void b(Graphics var1) {
      if (this.ak) {
         super.b(var1);
      } else {
         this.a(var1, this.objX, this.objY, this.q, this.r, Caption.cj, (byte)2, this.K);
      }

      int var2;
      VDTT_ms var3;
      Graphics var4;
      int var5;
      int var8;
      if (super.a.b == 0) {
         this.ai.a(var1);
         this.a(var1, this.objX + 4, this.objY + this.f() + 22);
         this.a(var1, this.ah[0][this.ai.h()]);
         label125:
         switch(this.ai.h()) {
         case 0:
            var4 = var1;
            var3 = this;
            int var12 = 0;

            while(true) {
               if (var12 >= var3.ah[0][var3.ai.h()].i) {
                  break label125;
               }

               if (var3.ah[0][var3.ai.h()].b(var12)) {
                  try {
                     VDTT_el var13 = (VDTT_el)VDTT_cw.v().bp.b.elementAt(var12);
                     var3.a(var4, 2, var12 * var3.ah[0][var3.ai.h()].h, var3.ah[0][var3.ai.h()].q - 2, var3.ah[0][var3.ai.h()].h - 2, 46, 22, 23, 1, 1);
                     if (var12 == var3.ah[0][var3.ai.h()].k) {
                        VDTT_dc.a(var4, 3, 1 + var12 * var3.ah[0][var3.ai.h()].h, var3.ah[0][var3.ai.h()].q - 4, var3.ah[0][var3.ai.h()].h - 3);
                     }

                     var8 = 32;
                     var2 = var12 * var3.ah[0][var3.ai.h()].h + 8;
                     VDTT_aa.a(var4, var13.a(), 0, 5, var2 - 5, 100);
                     var5 = var12 == var3.ah[0][var3.ai.h()].k ? -2560 : -1;
                     if (var12 == var3.ah[0][var3.ai.h()].l && !var13.a.equals(VDTT_ek.m().aD)) {
                        ++var8;
                        ++var2;
                     }

                     VDTT_dg.a(VDTT_dg.d, var4, Caption.zd[3] + " " + var13.a, var8, var2, 0, var5);
                     VDTT_dg var10000 = VDTT_dg.d;
                     StringBuilder var10002 = (new StringBuilder()).append(Caption.zd[5]).append(" ").append(DataCenter.d().a((int)var13.d));
                     DataCenter.d();
                     VDTT_dg.a(var10000, var4, var10002.append(DataCenter.b(var13.d)).toString(), var8, var2 + 10, 0, var5);
                     if (var12 == 0) {
                        VDTT_dg.a(VDTT_dg.d, var4, "(" + Caption.kq + ")", var3.q - 8 - 15, var2 + var3.ah[0][var3.ai.h()].h / 2 - 15, 1, -7812062);
                        if (VDTT_cw.v().bp.c) {
                           VDTT_dc.a(var4, 44, 0, var3.q - 8 - 28, var2 + var3.ah[0][var3.ai.h()].h / 2 - 9, 0);
                        }
                     }
                  } catch (Exception var9) {
                  }
               }

               ++var12;
            }
         case 1:
            this.f(var1);
            break;
         case 2:
            this.g(var1);
         }

         this.a(var1);
         this.a(var1, this.objX + 4, this.objY + this.f());
         if (this.ai.h() == 2) {
            VDTT_dg.a(VDTT_dg.d, var1, Caption.gY + this.aa.size(), 10, this.h() - 10, 0, -1);
         }

         this.ah[0][this.ai.h()].b(var1, this);
      } else {
         int var7;
         if (super.a.b == 1) {
            this.a(var1, this.objX + 4, this.objY + this.f());
            this.a(var1, this.ah[1][0]);

            for(var2 = 0; var2 < this.ah[1][0].i; ++var2) {
               if (this.ah[1][0].b(var2)) {
                  if (var2 == this.ah[1][0].k) {
                     VDTT_dc.a(var1, 0, var2 * this.ah[1][0].h, this.ah[1][0].q, this.ah[1][0].h - 1);
                  }

                  VDTT_fj var11 = (VDTT_fj)this.ar.elementAt(var2);
                  var5 = var2;
                  var4 = var1;
                  var3 = this;

                  try {
                     if (var11.d) {
                        VDTT_dc.a(var4, 302, 0, 24, 6 + var5 * var3.ah[1][0].h, 20);
                     } else if (var11.b == 1) {
                        VDTT_dc.a(var4, 304, 0, 24, 6 + var5 * var3.ah[1][0].h, 20);
                     } else {
                        VDTT_dc.a(var4, 303, 0, 24, 6 + var5 * var3.ah[1][0].h, 20);
                     }

                     if (var5 == var3.ah[1][0].l) {
                        VDTT_dg.b(VDTT_dg.d, var4, var11.c + (var11.b == 2 ? Caption.gZ : ""), 37, 11 + var5 * var3.ah[1][0].h, 0, -3089954, -16777216);
                     } else {
                        VDTT_dg.b(VDTT_dg.d, var4, var11.c + (var11.b == 2 ? Caption.gZ : ""), 36, 10 + var5 * var3.ah[1][0].h, 0, -3089954, -16777216);
                     }

                     var7 = var4.e;
                     var8 = var4.f;
                     var3.a(var4, var7 + var3.ao[0][var5].objX, var8 + var3.ao[0][var5].objY);
                     var3.ao[0][var5].b(var4);
                     var3.a(var4, var7, var8);
                  } catch (Exception var10) {
                     VDTT_jb.a(var10);
                  }
               }
            }

            this.a(var1);
            VDTT_dg.a(VDTT_dg.b, var1, Caption.pH + this.ar.size(), this.W.objX, this.W.objY - 6, 0, -1);
            this.ah[1][0].b(var1, this);
         } else {
            if (super.a.b == 2) {
               this.a(var1, this.objX + 4, this.objY + this.f());
               this.a(var1, this.ah[2][0]);

               for(var2 = 0; var2 < this.ah[2][0].i; ++var2) {
                  if (this.ah[2][0].b(var2)) {
                     if (var2 == this.ah[2][0].k) {
                        VDTT_dc.a(var1, 0, var2 * this.ah[2][0].h, this.ah[2][0].q, this.ah[2][0].h - 1);
                     }

                     VDTT_fc var6 = (VDTT_fc)this.ar.elementAt(var2);
                     if (var6.c) {
                        VDTT_dc.a(var1, 302, 0, 24, 6 + var2 * this.ah[2][0].h, 20);
                     } else {
                        VDTT_dc.a(var1, 304, 0, 24, 6 + var2 * this.ah[2][0].h, 20);
                     }

                     if (var2 == this.ah[2][0].l) {
                        VDTT_dg.b(VDTT_dg.d, var1, var6.b, 37, 11 + var2 * this.ah[2][0].h, 0, -1, -16777216);
                     } else {
                        VDTT_dg.b(VDTT_dg.d, var1, var6.b, 36, 10 + var2 * this.ah[2][0].h, 0, -1, -16777216);
                     }

                     var7 = var1.e;
                     var8 = var1.f;
                     this.a(var1, var7 + this.ao[1][var2].objX, var8 + this.ao[1][var2].objY);
                     this.ao[1][var2].b(var1);
                     this.a(var1, var7, var8);
                  }
               }

               this.a(var1);
               VDTT_dg.a(VDTT_dg.b, var1, Caption.pH + this.ar.size(), this.W.objX, this.W.objY - 6, 0, -1);
               this.ah[2][0].b(var1, this);
            }

         }
      }
   }

   private void f(Graphics var1) {
      for(int var3 = 0; var3 < this.ah[0][this.ai.h()].i; ++var3) {
         if (this.ah[0][this.ai.h()].b(var3)) {
            try {
               VDTT_it var4;
               VDTT_el var5 = (VDTT_el)(var4 = (VDTT_it)this.Z.elementAt(var3)).b.firstElement();
               this.a(var1, 2, var3 * this.ah[0][this.ai.h()].h, this.ah[0][this.ai.h()].q - 2, this.ah[0][this.ai.h()].h - 2, 46, 22, 23, 1, 1);
               if (var3 == this.ah[0][this.ai.h()].k) {
                  VDTT_dc.a(var1, 3, 1 + var3 * this.ah[0][this.ai.h()].h, this.ah[0][this.ai.h()].q - 4, this.ah[0][this.ai.h()].h - 3);
               }

               int var6 = 32;
               int var7 = var3 * this.ah[0][this.ai.h()].h + 8;
               VDTT_aa.a(var1, var5.a(), 0, 5, var7 - 5, 100);
               int var2 = var3 == this.ah[0][this.ai.h()].k ? -2560 : -1;
               if (var3 == this.ah[0][this.ai.h()].l && !var5.a.equals(VDTT_ek.m().aD)) {
                  ++var6;
                  ++var7;
               }

               VDTT_dg.a(VDTT_dg.d, var1, Caption.zd[3] + " " + var5.a, var6, var7, 0, var2);
               if (var4.c) {
                  VDTT_dc.a(var1, 44, 0, super.q - 8 - 28, var7 + this.ah[0][this.ai.h()].h / 2 - 9, 0);
               }

               VDTT_dg var10000 = VDTT_dg.d;
               StringBuilder var10002 = (new StringBuilder()).append(Caption.zd[5]).append(" ").append(DataCenter.d().a((int)var5.d));
               DataCenter.d();
               VDTT_dg.a(var10000, var1, var10002.append(DataCenter.b(var5.d)).toString(), var6, var7 + 10, 0, var2);
               if (var4.d()) {
                  VDTT_dg.a(VDTT_dg.d, var1, Caption.kr, super.q - 8 - 15, var7 + this.ah[0][this.ai.h()].h / 2 - 15, 1, -65536);
               } else {
                  VDTT_dg.a(VDTT_dg.d, var1, "(" + var4.d + Caption.ks, super.q - 8 - 15, var7 + this.ah[0][this.ai.h()].h / 2 - 15, 1, -7812062);
               }
            } catch (Exception var9) {
            }
         }
      }

   }

   private void g(Graphics var1) {
      try {
         for(int var2 = 0; var2 < this.ah[0][this.ai.h()].i; ++var2) {
            if (this.ah[0][this.ai.h()].b(var2)) {
               VDTT_ek var3 = (VDTT_ek)this.aa.get(var2);
               this.a(var1, 2, var2 * this.ah[0][this.ai.h()].h, this.ah[0][this.ai.h()].q - 2, this.ah[0][this.ai.h()].h - 2, 46, 22, 23, 1, 1);
               if (var2 == this.ah[0][this.ai.h()].k) {
                  VDTT_dc.a(var1, 3, 1 + var2 * this.ah[0][this.ai.h()].h, this.ah[0][this.ai.h()].q - 4, this.ah[0][this.ai.h()].h - 3);
               }

               int var4 = 32;
               int var5 = var2 * this.ah[0][this.ai.h()].h + 8;
               VDTT_aa.a(var1, var3.ag(), 0, 5, var5 - 5, 100);
               int var6 = var2 == this.ah[0][this.ai.h()].k ? -2560 : -1;
               if (var2 == this.ah[0][this.ai.h()].l && !var3.aD.equals(VDTT_ek.m().aD)) {
                  ++var4;
                  ++var5;
               }

               VDTT_dg.a(VDTT_dg.d, var1, Caption.zd[3] + " " + var3.aD, var4, var5, 0, var6);
               VDTT_dg var10000 = VDTT_dg.d;
               StringBuilder var10002 = (new StringBuilder()).append(Caption.zd[5]).append(" ").append(DataCenter.d().a(var3.w()));
               DataCenter.d();
               VDTT_dg.a(var10000, var1, var10002.append(DataCenter.b(var3.w())).toString(), var4, var5 + 10, 0, var6);
            }
         }

      } catch (Exception var7) {
      }
   }

   public final void a_() {
      super.a_();
      int var1;
      boolean var5;
      if (super.a.b == 0) {
         this.ai.e();

         for(var1 = 0; var1 < this.ah[0].length; ++var1) {
            this.ah[0][this.ai.h()].a();
         }

         if (VDTT_cw.v().bp != null && !VDTT_cw.v().bp.c()) {
            this.ak = true;
            if (VDTT_cw.v().bp.a()) {
               var5 = false;
               this.W.d = var5;
               var5 = false;
               this.X.d = var5;
            } else {
               var5 = true;
               this.W.d = var5;
               var5 = true;
               this.X.d = var5;
            }
         } else {
            var5 = true;
            this.W.d = var5;
            var5 = true;
            this.X.d = var5;
         }

         String var6;
         if (VDTT_cw.v().bp != null && !VDTT_cw.v().bp.c()) {
            if (VDTT_cw.v().bp.b.size() == 1) {
               var6 = Caption.ko;
               this.U.l = var6;
            } else {
               var6 = Caption.kj;
               this.U.l = var6;
            }

            this.U.b(false);
            var6 = Caption.kp;
            this.T.l = var6;
         } else {
            this.U.b(true);
            var6 = Caption.kn;
            this.T.l = var6;
         }
      } else if (super.a.b == 1) {
         this.ah[1][0].a();
         var1 = 0;

         int var3;
         for(var3 = 0; var3 < this.ab.size(); ++var3) {
            if (((VDTT_fj)this.ab.get(var3)).b == 2) {
               ++var1;
            }
         }

         this.af.a(var1 == 0);
         var1 = 0;

         for(var3 = 0; var3 < this.ao[0].length; ++var3) {
            if (this.ao[0][var3].m) {
               ++var1;
            }
         }

         this.ag.a(var1 == 0);
      } else if (super.a.b == 2) {
         this.ah[2][0].a();
         var1 = 0;

         for(int var2 = 0; var2 < this.ao[1].length; ++var2) {
            if (this.ao[1][var2].m) {
               ++var1;
            }
         }

         this.ag.a(var1 == 0);
      }

      if (VDTT_cw.v().br == 5 && VDTT_cw.v().bs == 2) {
         this.y();
      }

      VDTT_bd var10000 = this.X;
      var5 = VDTT_cw.v().ca;
      var10000.m = var5;
   }

   private VDTT_el i(int var1) {
      VDTT_el var2 = null;
      if (var1 >= 0) {
         if (this.ai.h() == 1) {
            var2 = (VDTT_el)((VDTT_it)this.Z.elementAt(var1)).b.firstElement();
         } else {
            var2 = (VDTT_el)VDTT_cw.v().bp.b.elementAt(var1);
         }
      }

      return var2;
   }

   private static void K() {
      try {
         (new Message((byte)45)).l();
      } catch (Exception var1) {
         VDTT_jb.a(var1);
      }
   }
}
