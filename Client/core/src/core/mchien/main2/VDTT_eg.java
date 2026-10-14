package core.mchien.main2;

public final class VDTT_eg extends VDTT_n {
   public int k;
   public int l;
   public int m;

   public final int a() {
      return this.objX - this.q / 2;
   }

   public final int b() {
      return this.objX + this.q / 2;
   }

   public final int c() {
      return this.objY - this.r / 2;
   }

   public final int d() {
      return this.objY + this.r / 2;
   }

   public final void m() {
      int var1 = this.objX - this.l;
      int var2 = this.objY - this.m;
      if (VDTT_jb.b(var1) > this.k) {
         this.objX = (short)(this.objX + (var1 < 0 ? this.k : -this.k));
      }

      if (VDTT_jb.b(var2) > this.k) {
         this.objY = (short)(this.objY + (var2 < 0 ? this.k : -this.k));
      }

   }

   public final void a(Graphics var1) {
   }

   public final void b(Graphics var1) {
   }

   public final int e() {
      return 0;
   }

   public final String f() {
      return null;
   }

   public final String g() {
      return null;
   }

   public final void b(int var1, int var2) {
      this.l = var2;
      this.m = var2;
   }

   public void n() {
      if (this.l <= 16) {
         this.l = 16;
      } else if (this.l >= VDTT_cw.v().aj - 16) {
         this.l = (short)(VDTT_cw.v().aj - 16);
      }

      if (this.m <= 16) {
         this.m = 16;
      } else {
         if (this.m >= VDTT_cw.v().ak - 16) {
            this.m = (short)(VDTT_cw.v().ak - 16);
         }

      }
   }
}
