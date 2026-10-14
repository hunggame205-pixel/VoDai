package core.mchien.main2;

public abstract class VDTT_m extends VDTT_z {
   public MainScreen a;
   public boolean b;
   public boolean c;
   public boolean d;
   public VDTT_bm e;
   protected int f;
   protected int g;
   protected int h;
   protected int i;
   protected int j;
   protected int k;

   public final int a() {
      return this.a.objX + this.objX;
   }

   public final int b() {
      return this.a.objY + this.objY;
   }

   public final void a(Graphics var1) {
      this.a(var1, this.f, this.g);
      var1.d(this.h, this.i, this.j, this.k);
      var1.a(this.a(), this.b());
   }

   public final void a(Graphics var1, VDTT_hs var2) {
      try {
         this.f = var1.e;
         this.g = var1.f;
         this.h = var1.k();
         this.i = var1.l();
         this.j = var1.h;
         this.k = var1.i;
         int var3 = var2.q;
         int var4 = var2.r;
         if (var3 > this.j) {
            var3 = this.j;
         }

         if (var4 > this.k) {
            var4 = this.k;
         }

         var2.a(var1, this.a(), this.b(), var3, var4);
      } catch (Exception var5) {
      }
   }

   public void c() {
   }

   public void a(boolean var1) {
      this.c = var1;
   }

   public void b(boolean var1) {
      this.d = var1;
   }
}
