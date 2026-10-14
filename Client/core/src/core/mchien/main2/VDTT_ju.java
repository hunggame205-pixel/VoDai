package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ju extends VDTT_jr {
   private VDTT_hs[] O = new VDTT_hs[3];
   private VDTT_ht P;
   private VDTT_ba Q;
   private VDTT_ba R;

   public VDTT_ju(VDTT_p var1) {
      super(var1, new String[]{Caption.bp});
      this.Q = this.a(this.q - 52, this.r - 28, Caption.C, this, 0, -8);
      this.Q.d(45, this.Q.r);
      this.a(this.Q, 0);
      this.R = this.a(this.q - 100, this.r - 28, Caption.mb, this, 5007, -8);
      this.R.d(45, this.R.r);
      this.a(this.R, 0);
      if (DataCenter.l()) {
         this.ah.b(true);
         this.R.b(true);
         this.Q.b(true);
         this.O[0] = new VDTT_hs((byte)0, 12, this.f() + 8, 78, 18, 78, 1);
         this.O[1] = new VDTT_hs((byte)0, 12, this.f() + 16 + 18, 78, 18, 78, 1);
         this.O[2] = new VDTT_hs((byte)0, 12, this.f() + 24 + 36, 78, 18, 78, 1);
         this.P = new VDTT_ht((byte)1, 97, this.f() + 8, 192, 192, 32, VDTT_jb.c(this.aj.length, 6), 6);
      } else {
         this.O[0] = new VDTT_hs((byte)0, 103, this.f() + 3, 93, 18, 93, 1);
         this.O[1] = new VDTT_hs((byte)0, 7, this.f() + 3, 93, 18, 93, 1);
         this.O[2] = new VDTT_hs((byte)0, 199, this.f() + 3, 93, 18, 93, 1);
         this.P = new VDTT_ht((byte)1, 7, this.f() + 24, 288, 160, 32, VDTT_jb.c(VDTT_ek.m().aQ.length, 9), 9);
      }

      VDTT_ac.b().w();
   }

   private void a(VDTT_hs var1, int var2) {
      this.P.k = -1;
      var1.k = var2;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 0:
            VDTT_cw.v();
            VDTT_cw.n(1);
            return;
         case 2000:
            try {
               Message.c((byte)-82).l();
               break;
            } catch (Exception var4) {
               return;
            }
         case 5001:
            if (var1.j.k >= 0 && var1.j.k < VDTT_ek.m().aQ.length) {
               this.k = a(var1, this, VDTT_ek.m().aQ[var1.j.k]);
               return;
            }
            break;
         case 5002:
            this.k = a(var1, this, (Item)null);
            return;
         case 5003:
            this.a(var1.j, var1.j.k);
            if (var1.j.k >= 0) {
               this.k = b(Caption.yL[0], this, var1.j.objX + 30, var1.j.objY, 30);
            }

            this.k.q = 60;
            return;
         case 5004:
            this.a(var1.j, var1.j.k);
            this.k = b(Caption.yS[0], this, var1.j.objX + 30, var1.j.objY, 30);
            this.k.q = 60;
            return;
         case 5005:
            this.a(var1.j, var1.j.k);
            this.k = b(Caption.yL[1], this, var1.j.objX + 30, var1.j.objY, 30);
            this.k.q = 60;
            return;
         case 5006:
            this.a(var1.j, var1.j.k);
            this.k = b(Caption.yS[1], this, var1.j.objX + 30, var1.j.objY, 30);
            this.k.q = 60;
            return;
         case 5007:
            DataCenter.d().ai.a(Caption.mf, 2000, this);
         }
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      super.b(var1);
      if (super.a.b == 0) {
         int var2 = var1.e;
         int var3 = var1.f;
         this.a(var1, this.P);

         int var4;
         int var5;
         for(var4 = 0; var4 < this.P.i; ++var4) {
            for(var5 = 0; var5 < this.P.P; ++var5) {
               if (this.P.b(var4)) {
                  int var10001 = var5 * this.P.h;
                  int var10002 = var4 * this.P.h;
                  int var10004 = var4 * this.P.P;
                  b(var1, var10001, var10002, VDTT_ek.m().aQ[var10004 + var5], var4 * this.P.P + var5 == this.P.k);
               }
            }
         }

         this.a(var1);
         this.P.b(var1, this);
         this.a(var1, this.objX + 4, this.objY + this.f());
         var4 = 0;

         for(var5 = 0; var5 < VDTT_ek.m().aQ.length; ++var5) {
            if (VDTT_ek.m().aQ[var5] != null) {
               ++var4;
            }
         }

         if (!DataCenter.l()) {
            VDTT_dg.b(VDTT_dg.d, var1, Caption.bq + " " + var4 + "/" + VDTT_ek.m().aQ.length, 6, this.Q.objY - 19, 0, -1, -16777216);
         }

         for(var5 = 0; var5 < this.O.length; ++var5) {
            this.a(var1, this.objX + this.O[var5].objX, this.objY + this.O[var5].objY);
            this.a(var1, 0, 0, this.O[var5].q, this.O[var5].r, 46, 22, 23, 1, 1, 180);
            switch(var5) {
            case 0:
               a(var1, 0, 10, "", (byte)0);
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(VDTT_ek.m().ak), 30, 9, 20, -3089954, -16777216);
               break;
            case 1:
               a(var1, 0, 8, "", (byte)2);
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(VDTT_ek.m().an), 30, 9, 20, -2560, -16777216);
               break;
            case 2:
               a(var1, 0, 10, "", (byte)1);
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(VDTT_ek.m().al), 30, 9, 20, -3089954, -16777216);
               break;
            case 3:
               a(var1, 0, 8, "", (byte)3);
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(VDTT_ek.m().am), 30, 9, 20, -2560, -16777216);
            }
         }

         this.a(var1, var2, var3);
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         this.P.a();
      }

      if (VDTT_cw.v().br == 0) {
         if (VDTT_cw.v().bs != 0) {
            if (VDTT_cw.v().bs == 1) {
               this.y();
            }
         } else {
            boolean var2 = true;
            int var4 = 0;

            int[] var10000;
            while(true) {
               if (var4 >= VDTT_ek.m().aQ.length) {
                  var10000 = null;
                  break;
               }

               if (VDTT_ek.m().aQ[var4] != null && VDTT_ek.m().aQ[var4].c == 168) {
                  var10000 = new int[]{var4 % 9 * 32, var4 / 9 * 32};
                  break;
               }

               ++var4;
            }

            int[] var5 = var10000;
            if (var10000 == null) {
               return;
            }

            int var10001;
            if (super.a.b != 0) {
               var10001 = this.objX + 65;
               DataCenter.d().aA.a(var10001, this.objY + 15);
               DataCenter.d().aA.b = true;
            } else {
               if (this.k != null) {
                  if (this.k instanceof VDTT_bo && !((VDTT_bo)this.k).m) {
                     var10001 = this.objX + var5[0] + 45;
                     DataCenter.d().aA.a(var10001, this.objY + 25 + var5[1] + 90);
                     DataCenter.d().aA.b = true;
                  }

                  return;
               }

               var10001 = this.objX + var5[0] + 15;
               DataCenter.d().aA.a(var10001, this.objY + 25 + var5[1] + 35);
               DataCenter.d().aA.b = true;
            }
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         var1.addElement(this.P.a(5001, this));

         for(int var2 = 0; var2 < this.O.length; ++var2) {
            var1.addElement(this.O[var2].a(5003 + var2, this));
         }
      }

      return var1;
   }

   public final int C() {
      return super.a.b;
   }
}
