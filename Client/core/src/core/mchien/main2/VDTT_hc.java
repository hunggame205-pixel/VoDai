package core.mchien.main2;

public final class VDTT_hc {
   public static int a;
   public static int b;
   public int c;
   public int d;
   public int e;
   public int f = 0;
   public boolean g;
   public VDTT_hf[] h;

   public final VDTT_hc a() {
      VDTT_hc var1 = new VDTT_hc();
      return this.a(var1);
   }

   public final VDTT_hc a(VDTT_hc var1) {
      var1.c = this.c;
      var1.d = this.d;
      var1.f = this.f;
      var1.h = this.h;
      var1.g = this.g;
      return var1;
   }

   public final boolean b() {
      return this.d == 6;
   }

   public final boolean c() {
      return this.d == 11;
   }

   public final boolean d() {
      return this.d == 1;
   }

   // $FF: synthetic method
   public final Object clone() {
      return this.a();
   }
}
