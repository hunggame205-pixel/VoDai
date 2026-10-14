package core.mchien.main2;

public final class VDTT_hv extends VDTT_hs {
   public VDTT_am N;

   public VDTT_hv(byte var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super((byte)0, 0, 0, var4, var5, 1, 1);
   }

   public final void b(int var1, int var2) {
      var1 += this.N.objX;
      var2 += this.N.objY;
      if (var1 < 50 - this.N.q) {
         var1 = 50 - this.N.q;
      }

      if (var1 > DataCenter.d().n - 50) {
         var1 = DataCenter.d().n - 50;
      }

      if (var2 < 50 - this.N.r) {
         var2 = 50 - this.N.r;
      }

      if (var2 > DataCenter.d().o - 50) {
         var2 = DataCenter.d().o - 50;
      }

      this.N.f(var1, var2);
      if (!this.N.K && this.N.objY < -10) {
         this.N.objY = -10;
      }

   }
}
