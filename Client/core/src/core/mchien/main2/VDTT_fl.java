package core.mchien.main2;

public final class VDTT_fl extends VDTT_ev {
   private int M = 0;
   private int N;
   private float O;
   private VDTT_fm[] P;
   private int Q = 100;
   private int R = 20;
   public boolean K;
   public int L;

   public VDTT_fl() {
      super(0, DataCenter.d().n / 2, DataCenter.d().o / 2);
      DataCenter.d();
      DataCenter.d();
      this.P = new VDTT_fm[7];
      this.Q = 100;
      short var1 = 663;
      boolean var2 = false;

      int var3;
      for(var3 = 0; var3 < VDTT_cw.v().au.size(); ++var3) {
         VDTT_hi var4;
         if ((var4 = (VDTT_hi)VDTT_cw.v().au.get(var3)).k == 449) {
            var1 = 573;
            break;
         }

         if (var4.k == 450) {
            var1 = 235;
            break;
         }

         if (var4.k == 478) {
            var2 = true;
            var1 = 277;
            break;
         }

         if (var4.k == 479) {
            var1 = 1007;
            break;
         }
      }

      for(var3 = 0; var3 < VDTT_cw.v().at.size(); ++var3) {
         VDTT_ev var5;
         if ((var5 = (VDTT_ev)VDTT_cw.v().at.get(var3)).k == 591) {
            var1 = 573;
            break;
         }

         if (var5.k == 592) {
            var1 = 235;
            break;
         }

         if (var5.k == 619) {
            var2 = true;
            var1 = 277;
            break;
         }

         if (var5.k == 621) {
            var1 = 1007;
            break;
         }
      }

      if (var2) {
         this.P = new VDTT_fm[2];
      }

      for(var3 = 0; var3 < this.P.length; ++var3) {
         this.P[var3] = new VDTT_fm(this, (double)var3 * (360.0D / (double)this.P.length));
         this.P[var3].a(VDTT_jb.a(this.objX - 70, this.objX + 70), VDTT_jb.a(this.objY - 70, this.objY + 70));
         VDTT_fm var10000 = this.P[var3];
         int var6 = var1 + var3;
         var10000.h = var6;
      }

   }

   public final int a() {
      return this.objX;
   }

   public final int b() {
      return this.objX;
   }

   public final int c() {
      return this.objY;
   }

   public final int d() {
      return this.objY;
   }

   public final boolean q() {
      return this.N == 4;
   }

   public final void n() {
      this.O = (float)this.M * 2.0F / 30.0F;
      VDTT_fm var10000;
      boolean var1;
      int var2;
      boolean var3;
      int var5;
      byte var6;
      switch(this.N) {
      case 0:
         var1 = true;

         for(var2 = 0; var2 < this.P.length; ++var2) {
            this.P[var2].b();
            if (!this.P[var2].a()) {
               var1 = false;
            }
         }

         if (var1) {
            this.N = 1;
            this.M = 0;
         }

         return;
      case 1:
         for(var5 = 0; var5 < this.P.length; ++var5) {
            this.P[var5].b();
            var10000 = this.P[var5];
            var3 = this.M % 5 > 2;
            var10000.g = var3;
            this.P[var5].b((int)this.P[var5].a + VDTT_jb.a(-3, 3), (int)this.P[var5].b + VDTT_jb.a(-3, 3));
         }

         this.M += 2;
         if (this.M >= 40) {
            var1 = true;

            for(var2 = 0; var2 < this.P.length; ++var2) {
               this.P[var2].b();
               var10000 = this.P[var2];
               var3 = false;
               var10000.g = var3;
               VDTT_fm var8;
               (var8 = this.P[var2]).c = (double)var8.i.objX + (double)var8.i.Q * Math.cos(var8.e);
               var8.d = (double)var8.i.objY + (double)var8.i.Q * Math.sin(var8.e);
               var8.f = 0;
               if (!this.P[var2].a()) {
                  var1 = false;
               }
            }

            if (var1) {
               this.N = 2;
               this.M = 0;
            }

            return;
         }
         break;
      case 2:
         for(var5 = 0; var5 < this.P.length; ++var5) {
            this.P[var5].b();
            var10000 = this.P[var5];
            var6 = 2;
            var10000.f = var6;
         }

         if (this.Q > 50) {
            this.Q -= 4;
         }

         if (this.Q <= 50) {
            this.M += 2;
         }

         if (this.M > 40) {
            if (this.Q > 0) {
               this.Q -= 2;
               return;
            }

            this.M = 0;
            this.N = 3;
            return;
         }
         break;
      case 3:
         if (this.M < 30) {
            this.M += 2;

            for(var5 = 0; var5 < this.P.length; ++var5) {
               var10000 = this.P[var5];
               var3 = this.M % 5 > 2;
               var10000.g = var3;
            }

            return;
         }

         if (this.K) {
            var1 = true;

            for(var2 = 0; var2 < this.P.length; ++var2) {
               var10000 = this.P[var2];
               var3 = false;
               var10000.g = var3;
               if (this.P[var2].f == 2) {
                  var10000 = this.P[var2];
                  var6 = 0;
                  var10000.f = var6;
                  switch(var2) {
                  case 0:
                     this.P[var2].a(-this.R, -this.R);
                     break;
                  case 1:
                     this.P[var2].a(DataCenter.d().n + this.R, DataCenter.d().o + this.R);
                     break;
                  case 2:
                     this.P[var2].a(DataCenter.d().n + this.R, -this.R);
                     break;
                  case 3:
                     this.P[var2].a(-this.R, DataCenter.d().o / 2);
                     break;
                  case 4:
                     this.P[var2].a(this.R, DataCenter.d().o + this.R);
                     break;
                  case 5:
                     this.P[var2].a(DataCenter.d().n / 2, -this.R);
                     break;
                  case 6:
                     this.P[var2].a(DataCenter.d().n / 2, DataCenter.d().o + this.R);
                  }
               }

               this.P[var2].b();
               short var7;
               if (this.L != 2 && this.L != 4) {
                  var10000 = this.P[var2];
                  var7 = 662;
                  var10000.h = var7;
               } else {
                  var10000 = this.P[var2];
                  var7 = 969;
                  var10000.h = var7;
               }

               if (this.P[var2].f != 1) {
                  var1 = false;
               }
            }

            if (var1) {
               this.N = 4;
            }
         }
      }

   }

   public final boolean m() {
      return this.N == 3 && this.M >= 30 && !this.K;
   }

   public final void a(Graphics var1) {
      for(int var2 = 0; var2 < this.P.length; ++var2) {
         VDTT_fm var3;
         if (!(var3 = this.P[var2]).i.m()) {
            int var5 = var1.e;
            int var6 = var1.f;
            int var7 = var1.k();
            int var8 = var1.l();
            int var9 = var1.h;
            int var10 = var1.i;
            var1.o();
            var1.d(0, 0, DataCenter.d().n, DataCenter.d().o);
            if (var3.g) {
               var1.a(1.2F, 0.5F);
            }

            VDTT_dc.a(var1, var3.h, 0, (int)var3.a, (int)var3.b, 3);
            if (var3.g) {
               var1.r();
            }

            var3.i.a(var1, var5, var6);
            var1.d(var7, var8, var9, var10);
         }
      }

   }

   // $FF: synthetic method
   static int a(VDTT_fl var0) {
      return var0.R;
   }

   // $FF: synthetic method
   static int b(VDTT_fl var0) {
      return var0.Q;
   }
}
