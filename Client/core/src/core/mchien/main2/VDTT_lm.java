package core.mchien.main2;

import java.util.Vector;

public class VDTT_lm extends VDTT_jr {
   public final VDTT_ba O;
   public VDTT_ca P;
   public VDTT_ca Q;
   public VDTT_ca R;
   public VDTT_cb S;
   private VDTT_hs U;
   public Item T;
   private boolean V;

   public VDTT_lm(VDTT_p var1, String[] var2) {
      super(var1, var2);
      this.K = false;
      this.a(299, 212);
      VDTT_hp var8;
      (var8 = new VDTT_hp(-1000)).c = new String[3];

      int var3;
      for(var3 = 0; var3 <= 0; ++var3) {
         var8.c[0] = var2[0];
      }

      var8.c[1] = Caption.J;
      var8.c[2] = Caption.y;
      this.a(var8, 210, 88, 3);
      this.Q = this.a(65, this.f() + 5, 204, "", this, 0);
      byte var9 = 26;
      this.Q.l = var9;
      this.Q.b(Caption.hE);
      this.Q.d(204, 21);
      this.a(this.Q, this.w() - 1);
      this.R = this.a(65, this.f() + 30, 204, "", this, 0);
      var9 = 26;
      this.R.l = var9;
      this.R.a("");
      this.R.b(Caption.hq);
      this.R.d(204, 21);
      this.a(this.R, this.w() - 1);
      this.P = this.b(65, this.f() + 55, 204, Caption.hk, this, 3);
      this.a(this.P, this.w() - 1);
      this.a(this.ah, this.w());
      this.a(this.ag, this.w());
      this.S = new VDTT_cb(65, this.P.objY + this.P.r + 3, 92, "", this, 0, 2, 0);
      this.S.a("");
      this.a(this.S, this.w() - 1);
      VDTT_ba var12 = this.a(this.q - 90, this.r - 33, Caption.D, this, 0, -8);
      this.a(var12, this.w() - 1);
      var12 = this.a(this.q - 156, this.r - 33, Caption.hl, this, 1, -8);
      this.a(var12, this.w() - 1);
      this.O = this.a(this.R.objX + this.R.q + 5, this.R.objY + 1, Caption.bI, this, 2, -8);
      this.O.d(34, 20);
      this.a(this.O, this.w() - 1);
      this.U = new VDTT_hs((byte)1, 239, this.P.objY + this.P.r + 3, 28, 28, 28, 1);
      VDTT_cw.v().ab = new Vector();
      VDTT_de var10 = null;

      try {
         if ((var10 = VDTT_da.a("mail_name_caches" + VDTT_ek.m().b)) != null) {
            short var11 = var10.a.readShort();

            for(var3 = 0; var3 < var11; ++var3) {
               VDTT_cw.v().ab.add(VDTT_jb.e(var10.c()));
            }
         }
      } catch (Exception var6) {
         VDTT_jb.a(var6);
      } finally {
         if (var10 != null) {
            var10.d();
         }

      }

      this.O.b(VDTT_cw.v().ab.isEmpty());
   }

   public void b(int var1, Object var2) {
   }

   public void a_() {
      super.a_();
      if (super.a.b == this.w() - 1) {
         this.U.a();
      }

   }

   public void b(Graphics var1) {
      if (this.w() <= 0) {
         this.a(var1, this.objX, this.objY, this.q, this.r, Caption.y, (byte)2, this.K);
      } else {
         super.b(var1);
      }

      if (super.a.b == this.w() - 1) {
         VDTT_dg.b(VDTT_dg.d, var1, Caption.he, 60, this.f() + 14, 1, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.d, var1, Caption.hm, 60, this.f() + 39, 1, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.d, var1, Caption.cC, 60, this.f() + 63, 1, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.d, var1, Caption.hg, 60, this.f() + 114, 1, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.d, var1, Caption.hn, 233, this.f() + 114, 1, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.d, var1, Caption.ho, 60, this.f() + 153, 1, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.d, var1, "10", 65, this.f() + 153, 0, -3089954, -16777216);
         a(var1, 65, this.f() + 153, "10", (byte)0);
         if (this.S.h() > 0) {
            VDTT_dg.b(VDTT_dg.d, var1, "1%", 65, this.f() + 170, 0, -3089954, -16777216);
            a(var1, 65, this.f() + 170, "1%", (byte)0);
         }

         a(var1, this.U.objX, this.U.objY, this.T, this.V);
      }

   }

   public Vector g() {
      Vector var1 = super.g();
      if (this.w() <= 0) {
         var1.removeElementAt(0);
      }

      if (super.a.b == this.w() - 1) {
         var1.add(this.U.a(2000, this));
         var1.addElement(new VDTT_hl(2002, 35, 188, 95, 215, (VDTT_hs)null, this));
         var1.add(new VDTT_hl(2001, -this.objX, -this.objY, DataCenter.d().n * 2, DataCenter.d().o + this.objY * 2, (VDTT_hs)null, this));
      }

      return var1;
   }

   public void a(VDTT_hl var1, int var2, int var3) {
      this.V = false;
      if (super.a.b == this.w() && var1.b == 0) {
         this.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == this.w() - 1) {
         switch(var1.b) {
         case 0:
            this.k();
            return;
         case 1:
            VDTT_lm var8 = this;

            try {
               var2 = var8.S.h();
               if (VDTT_ek.m().ak < var2 + 10) {
                  DataCenter.d().ai.c(VDTT_jb.b(Caption.hr, VDTT_jb.c(VDTT_ek.m().ak - 10)), -65536);
               } else {
                  String var9;
                  if ((var9 = var8.Q.i().trim()) == null || var9.equals("")) {
                     var9 = Caption.hj;
                  }

                  String var4 = var8.R.i().trim();
                  String var5 = var8.P.i().trim();
                  if (var9.length() <= 0) {
                     DataCenter.d().ai.c(Caption.hs, -65536);
                  } else if (var4.length() <= 0) {
                     DataCenter.d().ai.c(Caption.ht, -65536);
                  } else {
                     Message var6;
                     (var6 = new Message((byte)87)).a(var4);
                     var6.a(var9);
                     var6.a(var5);
                     var6.c(var2);
                     if (var8.T == null) {
                        var6.b((int)-1);
                     } else {
                        var6.b(var8.T.f);
                     }

                     var6.l();
                  }
               }
               break;
            } catch (Exception var7) {
               VDTT_jb.a(var7);
               return;
            }
         case 2:
            this.I.a((MainScreen)(new VDTT_kj(this.I, this)));
            return;
         case 2000:
            this.V = true;
            if (this.T == null) {
               this.k = b(Caption.hp, this, this.U.objX + 32, this.U.objY, 32);
               return;
            }

            this.k = c(this, var1, this.T);
            return;
         case 2002:
            this.k = b(VDTT_jb.b(Caption.pv, VDTT_jb.c(10)), this, var2 + 10, var3, 10);
         }
      }

   }

   public void d() {
      super.d();
      if (this.T != null) {
         VDTT_ek.m().aP[this.T.f] = this.T;
         this.T = null;
      }

   }

   public static void C() {
      VDTT_df var0 = null;
      boolean var4 = false;

      label76: {
         try {
            var4 = true;
            (var0 = new VDTT_df()).b(VDTT_cw.v().ab.size());

            for(int var1 = 0; var1 < VDTT_cw.v().ab.size(); ++var1) {
               var0.a(VDTT_jb.d((String)VDTT_cw.v().ab.elementAt(var1)));
            }

            var0.b("mail_name_caches" + VDTT_ek.m().b);
            var4 = false;
            break label76;
         } catch (Exception var5) {
            VDTT_jb.a(var5);
            var4 = false;
         } finally {
            if (var4) {
               if (var0 != null) {
                  var0.a();
               }

            }
         }

         if (var0 != null) {
            var0.a();
            return;
         }

         return;
      }

      var0.a();
   }
}
