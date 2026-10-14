package core.mchien.main2;

final class VDTT_fm {
   double a;
   double b;
   double c;
   double d;
   private double j;
   private double k;
   double e;
   private double l;
   private double m;
   int f;
   boolean g;
   int h;
   // $FF: synthetic field
   final VDTT_fl i;

   public VDTT_fm(VDTT_fl var1, double var2) {
      this.i = var1;
      this.l = 2.0D;
      this.e = var2;
      this.m = var2 / 360.0D;
      if (VDTT_jb.b()) {
         this.b(VDTT_jb.a(DataCenter.d().n), VDTT_jb.b() ? -VDTT_fl.a(var1) : DataCenter.d().o + VDTT_fl.a(var1));
      } else {
         this.b(VDTT_jb.b() ? -VDTT_fl.a(var1) : DataCenter.d().n + VDTT_fl.a(var1), VDTT_jb.a(DataCenter.d().o));
      }
   }

   public final void a(int var1, int var2) {
      this.c = (double)var1;
      this.d = (double)var2;
   }

   public final void b(int var1, int var2) {
      this.a = (double)var1;
      this.b = (double)var2;
      if (this.j == 0.0D) {
         this.j = (double)var1;
         this.k = (double)var2;
      }

   }

   public final boolean a() {
      if (VDTT_jb.b((int)(this.c - this.a)) <= 0 && VDTT_jb.b((int)(this.d - this.b)) <= 0) {
         this.f = 1;
      }

      return this.f == 0;
   }

   public final void b() {
      if (this.a()) {
         this.a += (this.c - this.a) / 3.0D;
         this.b += (this.d - this.b) / 3.0D;
      } else {
         if (this.f == 2) {
            if (VDTT_fl.b(this.i) > 50) {
               this.l = 0.05000000074505806D;
            } else {
               this.l = 0.019999999552965164D;
            }

            this.a = (double)this.i.objX + (double)VDTT_fl.b(this.i) * Math.cos(this.e);
            this.b = (double)this.i.objY + (double)VDTT_fl.b(this.i) * Math.sin(this.e);
            this.m += this.l;
            if (this.m > 1.0D) {
               this.m = 0.0D;
            }

            this.e = this.m * 2.0D * 3.141592653589793D;
         }

      }
   }
}
