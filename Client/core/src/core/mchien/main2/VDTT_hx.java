package core.mchien.main2;

public final class VDTT_hx extends VDTT_hs {
   private VDTT_hs N;

   public VDTT_hx(byte var1, int var2, int var3, int var4, int var5, int var6, int var7, VDTT_hs var8) {
      super((byte)1, var2, var3, var4, var5, var6, 1);
      this.N = var8;
   }

   public final void a() {
      super.a();
   }

   public final void a(int var1, int var2) {
      super.a(var1, var2);
      this.N.a(var1, var2);
   }

   public final void b(int var1, int var2) {
      super.b(var1, var2);
      this.N.b(var1, var2);
      this.l = -1;
   }

   public final void c(int var1, int var2) {
      super.a(var1, var2);
      this.N.a(var1, var2);
      this.l = -1;
   }
}
