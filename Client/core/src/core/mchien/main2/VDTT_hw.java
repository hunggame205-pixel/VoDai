package core.mchien.main2;

public final class VDTT_hw extends VDTT_hs {
   private int U;
   private int V;
   private int W;
   private int X;
   private int Y;
   public int N;
   public int O;
   public int P;
   public int Q;
   public int R = -1;
   public int S = -1;
   public int T = -1;

   public VDTT_hw(byte var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.a(0, var6, var7);
   }

   public final void a(int var1, int var2, int var3) {
      this.g = var1;
      if (this.n == 1) {
         this.g(0, 0);
         this.h(1, var3);
      } else if (this.n == 0) {
         this.g(1, var2);
         this.h(0, 0);
      } else {
         if (this.n == 2) {
            this.g(1, var2);
            this.h(1, var3);
         }

      }
   }

   public final void a() {
      try {
         super.a();
         if (this.Q < this.X / this.O) {
            this.Q = this.X / this.O;
         }

         if (this.Q > this.Y / this.O) {
            this.Q = this.Y / this.O;
         }

         this.W = this.Q * this.O;
         if (this.W < this.X) {
            this.W = this.X;
         }

         if (this.W > this.Y) {
            this.W = this.Y;
         }

         if (this.N != this.W) {
            this.U = this.W - this.N << 2;
            this.V += this.U;
            this.N += this.V >> 4;
            this.V &= 15;
         }

      } catch (Exception var1) {
      }
   }

   public final void a(int var1, int var2) {
      this.k = this.R = -1;
      this.e();
      this.m = this.j;
      this.T = this.Q;
      if (this.h != 0) {
         this.l = (this.f + var1) / this.h;
      }

      if (this.O != 0) {
         this.S = (this.V + var2) / this.O;
      }

   }

   public final void b(int var1, int var2) {
      if (this.h != 0) {
         this.j = this.m - var1 / this.h;
      }

      if (this.O != 0) {
         this.Q = this.T - var2 / this.O;
      }

   }

   public final void c(int var1, int var2) {
      this.e();
      if (!VDTT_jb.a(0, 0, this.q, this.r, var1, var2)) {
         this.k = this.l = -1;
         this.R = this.S = -1;
      } else if (this.m == this.j && this.T == this.Q) {
         if (this.h != 0 && this.l < this.i && this.l == (this.f + var1) / this.h || this.O != 0 && this.S < this.P && this.S == (this.N + var2) / this.O) {
            this.k = this.l;
            this.R = this.S;
         }
      } else {
         this.k = this.R = -1;
      }

      if (this.k >= 0 && this.R >= 0) {
         VDTT_ac.b().n();
      }

   }

   public final boolean c() {
      if (this.m == this.j && this.T == this.Q) {
         this.m = this.l = -1;
         this.T = this.S = -1;
         return false;
      } else {
         this.m = this.l = -1;
         this.T = this.S = -1;
         return true;
      }
   }

   public final void e() {
      try {
         super.e();
         if (this.Q < 0) {
            this.Q = 0;
         }

         if (this.Q > this.Y / this.O - 1) {
            this.Q = this.Y / this.O - 1;
         }

      } catch (Exception var1) {
      }
   }

   private void h(int var1, int var2) {
      this.O = var1;
      this.P = var2;
      if (this.r < var2 * var1) {
         this.X = -(var1 * this.g);
         this.Y = var2 * var1 - this.r;
         if (this.Y % var1 != 0) {
            this.Y = this.Y / var1 * var1 + var1;
         }

         this.Y += var1 * this.g;
      } else {
         this.X = 0;
         this.Y = var2 * var1 - this.r;
      }

      if (this.Y < 0) {
         this.Y = 0;
      }

   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5) {
      super.a(var1, var2, var3, var4, var5);
      if (this.n == 2) {
         var1.a(-this.f, -this.N);
      }

   }
}
