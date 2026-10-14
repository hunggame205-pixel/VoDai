package core.mchien.main2;

public final class VDTT_ht extends VDTT_hs {
   public int N = -1;
   public int O;
   public int P;

   public VDTT_ht(byte var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.O = var6;
      this.P = var8;
   }

   public VDTT_ht(byte var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super((byte)1, var2, var3, var4, var5, var6, 1);
      this.O = var7;
      this.P = var9;
   }

   public final void a(int var1, int var2) {
      this.k = -1;
      this.e();
      this.m = this.j;
      if (this.n == 1 && this.h != 0) {
         this.l = (this.f + var2) / this.h;
         this.N = var1 / this.h + (var2 + this.f) / this.h * (this.q / this.h);
      } else {
         if (this.n == 0 && this.h != 0) {
            this.l = (this.f + var1) / this.h;
            this.N = var2 / this.h * this.i + this.l;
         }

      }
   }

   public final void c(int var1, int var2) {
      this.e();
      if (!VDTT_jb.a(0, 0, this.q, this.r, var1, var2)) {
         this.k = -1;
         this.l = -1;
      } else if (this.m != this.j) {
         this.k = -1;
      } else if (this.n == 1 && this.h != 0 && this.l < this.i && this.l == (this.f + var2) / this.h || this.n == 0 && this.h != 0 && this.l < this.i && this.l == (this.f + var1) / this.h) {
         this.k = this.l;
      }

      this.k = this.N;
      int var3 = -1;
      if (this.n == 1 && this.h != 0) {
         var3 = var1 / this.h + (var2 + this.f) / this.h * (this.q / this.h);
      } else if (this.n == 0 && this.h != 0) {
         var3 = var2 / this.h * this.i + this.l;
      }

      if (this.N != var3) {
         this.k = this.N = -1;
      }

      this.b();
   }

   public final void e() {
      try {
         if (this.j < 0) {
            this.j = 0;
         }

         if (this.j > this.e / this.h - 1) {
            this.j = this.e / this.h - 1;
         }

         if (this.n == 1 && this.h != 0 && this.P <= 0) {
            this.j = 0;
         }

      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }
}
