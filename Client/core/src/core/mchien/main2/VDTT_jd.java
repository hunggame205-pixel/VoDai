package core.mchien.main2;

public final class VDTT_jd extends VDTT_ar {
   private String[] a;

   public VDTT_jd(String var1, VDTT_p var2) {
      this.e = 1;
      this.a(230, 150);
      this.I = var2;
      this.a = VDTT_dg.b(VDTT_dg.d, var1, 200);
      this.a(Caption.i, -7);
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 100:
         this.k();
      default:
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.h, (byte)2, this.K);

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         VDTT_dg.d(VDTT_dg.d, var1, this.a[var2], 14, this.h() / 2 + 20 + var2 * 12 - this.a.length * 6, 0, -1, -16777216);
      }

   }

   public final void a_() {
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }
}
