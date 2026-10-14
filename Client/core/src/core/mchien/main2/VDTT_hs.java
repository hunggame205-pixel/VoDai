package core.mchien.main2;

public class VDTT_hs extends VDTT_ae {
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i;
   public int j;
   public int k = -1;
   public int l = -1;
   public int m = -1;
   public byte n;
   public boolean o;
   public boolean p;
   public int I = 1;
   private int N;
   private int O;
   public int J = 1343692834;
   private long P;
   public int K;
   public int L;
   public int M;

   public VDTT_hs(byte var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.n = var1;
      this.f(var2, var3);
      this.d(var4, var5);
      this.a(1, var6, var7);
      this.M = var5 - 20;
   }

   public VDTT_hs(byte var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      this.n = 1;
      this.f(0, 2);
      this.d(110, var5);
      this.a(1, 11, 0);
      this.s = true;
      this.M = var5 - 6;
   }

   public void a(int var1, int var2, int var3) {
      this.g = var1;
      if (this.n == 1) {
         this.h = var2;
         this.i = var3;
         if (this.r < var3 * var2) {
            this.d = -(var2 * this.g);
            this.e = var3 * var2 - this.r;
            if (this.e % var2 != 0) {
               this.e = this.e / var2 * var2 + var2;
            }

            this.e += var2 * this.g;
         } else {
            this.d = 0;
            this.e = var3 * var2 - this.r;
         }

         if (this.e < 0) {
            this.e = 0;
         }

      } else {
         if (this.n == 0) {
            this.g(var2, var3);
         }

      }
   }

   public void a() {
      try {
         if (this.h == 0) {
            this.h = 1;
         }

         if (this.j < this.d / this.h) {
            this.j = this.d / this.h;
         }

         if (this.j > this.e / this.h) {
            this.j = this.e / this.h;
         }

         this.c = this.j * this.h;
         if (this.c < this.d) {
            this.c = this.d;
         }

         if (this.c > this.e) {
            this.c = this.e;
         }

         if (this.f != this.c) {
            this.a = this.c - this.f << 2;
            this.b += this.a;
            this.f += this.b >> 4;
            this.b &= 15;
            this.P = System.currentTimeMillis();
         }

      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public void a(int var1, int var2) {
      this.k = -1;
      this.e();
      this.m = this.j;
      if (this.n == 1 && this.h != 0) {
         this.l = (this.f + var2) / this.h;
      } else {
         if (this.n == 0 && this.h != 0) {
            this.l = (this.f + var1) / this.h;
         }

      }
   }

   public void b(int var1, int var2) {
      this.p = true;
      if (this.h > 30) {
         int var3;
         if ((var3 = this.h) > 55) {
            var3 = 55;
         }

         int var4;
         if ((var4 = 30 - (var3 - 30) / 2) <= 0) {
            var4 = 1;
         }

         var1 = var1 * var3 / var4;
         var2 = var2 * var3 / var4;
      }

      if (this.n == 1 && this.h != 0) {
         this.j = this.m - var2 / this.h;
      } else {
         if (this.n == 0 && this.h != 0) {
            this.j = this.m - var1 / this.h;
         }

      }
   }

   public void c(int var1, int var2) {
      this.p = false;
      this.e();
      if (this.m != this.j) {
         this.k = -1;
      } else if (this.n == 1 && this.h != 0 && this.l < this.i && this.l == (this.f + var2) / this.h || this.n == 0 && this.h != 0 && this.l < this.i && this.l == (this.f + var1) / this.h) {
         this.k = this.l;
      }

      this.b();
   }

   protected final void b() {
      if (this.k >= 0) {
         switch(this.I) {
         case -2:
            VDTT_ac.b().o();
            return;
         case -1:
            VDTT_ac.b().y();
            return;
         case 0:
         default:
            break;
         case 1:
            VDTT_ac.b().n();
         }
      }

   }

   public boolean c() {
      if (this.m != this.j) {
         this.m = this.l = -1;
         return true;
      } else {
         this.m = this.l = -1;
         return false;
      }
   }

   public final void d() {
      this.e();
      this.k = -1;
      this.l = -1;
   }

   public final void a(int var1) {
      try {
         this.j = var1;
         this.e();
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public void e() {
      try {
         if (this.j > this.e / this.h - 1) {
            this.j = this.e / this.h - 1;
         }

         if (this.j < 0) {
            this.j = 0;
         }

      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public final void g(int var1, int var2) {
      this.h = var1;
      this.i = var2;
      if (this.q < var2 * var1) {
         this.d = -(var1 * this.g);
         this.e = var2 * var1 - this.q;
         if (this.e % var1 != 0) {
            this.e = this.e / var1 * var1 + var1;
         }

         this.e += var1 * this.g;
      } else {
         this.d = 0;
         this.e = var2 * var1 - this.q;
      }

      if (this.e < 0) {
         this.e = 0;
      }

   }

   public void a(Graphics var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2 + this.objX, var3 + this.objY);
      var1.d(0, 0, var4, var5);
      if (this.n == 1) {
         var1.a(0, -this.f);
      } else {
         if (this.n == 0) {
            var1.a(-this.f, 0);
         }

      }
   }

   public final void b(Graphics var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2 + this.objX, var3 + this.objY);
   }

   public final VDTT_hl a(int var1, VDTT_z var2) {
      return new VDTT_hl(var1, this.objX, this.objY, this.objX + this.q, this.objY + this.r, this, var2);
   }

   public final VDTT_hl a(int var1, VDTT_z var2, Object var3) {
      return new VDTT_hl(var1, this.objX, this.objY, this.objX + this.q, this.objY + this.r, this, var2, var3);
   }

   public final VDTT_hl a(int var1, int var2, int var3, VDTT_z var4) {
      return new VDTT_hl(var1, this.objX + var2, this.objY + var3, this.objX + var2 + this.q, this.objY + var3 + this.r, this, var4);
   }

   public final boolean b(int var1) {
      int var2;
      if (this.n == 1) {
         var2 = this.r / this.h;
      } else {
         var2 = this.q / this.h;
      }

      return -1 + this.j <= var1 && var1 <= 1 + this.j + var2;
   }

   public final boolean c(int var1) {
      return this.f - this.h <= var1 && var1 <= this.f + this.h + this.r;
   }

   public final void a(Graphics var1) {
      if (this.n == 1 && this.i * this.h > this.r) {
         float var2;
         if ((var2 = (float)this.f / (float)(this.e - this.h)) < 0.0F) {
            var2 = 0.0F;
         }

         if (var2 > 1.0F - (float)this.h / (float)this.M) {
            var2 = 1.0F - (float)this.h / (float)this.M;
         }

         int var4;
         if ((var4 = (int)(var2 * (float)this.M)) < 0) {
            var4 = 0;
         }

         int var3;
         if ((var3 = (int)(100.0F - (float)(System.currentTimeMillis() - this.P) / 1000.0F * 100.0F)) < 30) {
            var3 = 30;
         }

         var1.d(var3);
         var1.f(this.J);
         var1.c(this.objX + this.q + 10 + this.N, this.objY + 20 + this.O, 2, this.M);
         var1.l = 1.0F;
         var1.f(16418833);
         var1.c(this.objX + this.q + 10 + this.N, this.objY + var4 + 20 + this.O, 2, this.h);
      }

   }

   public final void a(Graphics var1, VDTT_am var2) {
      int var3 = var1.e;
      int var4 = var1.f;
      short var5 = var2.objX;
      short var6 = var2.objY;
      var2.a(var1, 0, 0);
      if (this.k >= 0) {
         VDTT_dc.a(var1, var5 + 7, var6 + this.k * this.h + this.objY - this.f, var2.q - 14, this.h);
      }

      this.b(var1, var2);
      this.a(var1, var3, var4);
   }

   public final void b(Graphics var1, VDTT_am var2) {
      int var3 = var1.e;
      int var4 = var1.f;
      if (this.n == 1 && this.i * this.h > this.r) {
         short var5 = var2.objX;
         short var6 = var2.objY;
         var2.a(var1, 0, 0);
         float var7;
         if ((var7 = (float)this.f / (float)(this.e - this.h)) < 0.0F) {
            var7 = 0.0F;
         }

         if (var7 > 1.0F - (float)this.h / (float)this.M) {
            var7 = 1.0F - (float)this.h / (float)this.M;
         }

         int var9;
         if ((var9 = (int)(var7 * (float)this.M)) < 0) {
            var9 = 0;
         }

         int var8;
         if ((var8 = (int)(100.0F - (float)(System.currentTimeMillis() - this.P) / 1000.0F * 100.0F)) < 30) {
            var8 = 30;
         }

         var1.d(var8);
         var1.f(this.J);
         var1.c(var5 + var2.q - 5, var6 + this.objY + this.f() + this.O, 2, this.M);
         var1.f(16418833);
         var1.l = 1.0F;
         var1.c(var5 + var2.q - 5, var6 + this.objY + var9 + this.f() + this.O, 2, this.h);
         this.a(var1, var3, var4);
      }

   }

   private int f() {
      return this.s ? 3 : 10;
   }

   public final void a(Graphics var1, VDTT_ae var2, int var3) {
      this.a(var1, var2, var3, true);
   }

   public final void a(Graphics var1, VDTT_ae var2, int var3, boolean var4) {
      if (var2 instanceof VDTT_m && ((VDTT_m)var2).a instanceof VDTT_ar) {
         this.N = ((VDTT_m)var2).a.objX;
         this.O = ((VDTT_m)var2).a.objY;
      }

      if (this.n == 1 && this.i * this.h > this.r) {
         int var5 = var1.e;
         int var6 = var1.f;
         short var7 = var2.objX;
         short var8 = var2.objY;
         var2.a(var1, 0, 0);
         float var10;
         if ((var10 = (float)this.f / (float)(this.e - this.h)) < 0.0F) {
            var10 = 0.0F;
         }

         if (var10 > 1.0F - (float)this.h / (float)this.M) {
            var10 = 1.0F - (float)this.h / (float)this.M;
         }

         int var11;
         if ((var11 = (int)(var10 * (float)this.M)) < 0) {
            var11 = 0;
         }

         int var9;
         if ((var9 = (int)(100.0F - (float)(System.currentTimeMillis() - this.P) / 1000.0F * 100.0F)) < 30) {
            var9 = 30;
         }

         this.K = this.objX + this.q - 5 + var3 + this.N;
         this.L = this.objY + this.f() + this.O;
         if (var4) {
            var1.d(var9);
            var1.f(this.J);
            var1.c(var7 + this.objX + this.q - 5 + var3 + this.N, var8 + this.objY + this.f() + this.O, 2, this.M);
            var1.l = 1.0F;
         }

         var1.f(16418833);
         var1.c(var7 + this.objX + this.q - 5 + var3 + this.N, var8 + this.objY + var11 + this.f() + this.O, 2, this.h);
         this.a(var1, var5, var6);
      }

   }

   public final void a(Graphics var1, int var2, int var3, int var4) {
      this.N = var2;
      this.O = var3;
      this.J = var4;
      this.a(var1);
   }
}
