package core.mchien.main2;

public final class VDTT_jc extends VDTT_n {
   public int k;
   public int l;

   public final void a(Graphics var1) {
      var1.d(this.k);
      VDTT_dc.b(var1, this.l, 0, this.objX, this.objY, 3);
      var1.l = 1.0F;
   }

   public final int a() {
      return 0;
   }

   public final int b() {
      return 0;
   }

   public final int c() {
      return 0;
   }

   public final int d() {
      return 0;
   }

   public final void m() {
      if (this.k > 0) {
         if (VDTT_jb.a() % 2L == 1L) {
            this.k -= 2;
            return;
         }
      } else {
         this.i.remove(this);
      }

   }

   public final String f() {
      return null;
   }

   public final String g() {
      return null;
   }

   public final void b(Graphics var1) {
   }

   public final int e() {
      return 4;
   }
}
