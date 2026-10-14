package core.mchien.main2;

final class VDTT_ck {
   public double a;
   public double b;
   int c;
   private int f;
   private int g;
   private float h;
   private double i;
   private double j;
   int d;
   // $FF: synthetic field
   final SelectCharScreen e;

   public VDTT_ck(SelectCharScreen var1, int var2, int var3, int var4) {
      this.e = var1;
      this.c = 1000;
      this.h = 200.0F;
      this.i = 0.0D;
      this.j = 500.0D;
      this.f = var2;
      this.g = var3;
      this.d = var4;
      switch(var4) {
      case 1:
         this.j = 1000.0D;
         this.h = 200.0F;
         return;
      case 2:
         this.j = 800.0D;
         this.h = 240.0F;
         return;
      case 3:
         this.j = 700.0D;
         this.h = 180.0F;
         return;
      case 4:
         this.j = 900.0D;
         this.h = 220.0F;
      default:
      }
   }

   public final void a() {
      this.a = (double)this.f + (double)this.h * Math.cos(this.i);
      this.b = (double)this.g + (double)this.h * Math.sin(this.i);
      ++this.c;
      double var1 = (double)this.c % this.j / this.j;
      this.i = var1 * 2.0D * 3.141592653589793D;
   }
}
