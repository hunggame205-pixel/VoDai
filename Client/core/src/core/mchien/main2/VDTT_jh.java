package core.mchien.main2;

public final class VDTT_jh extends VDTT_ar {
   public VDTT_jh(VDTT_p var1) {
      this.I = var1;
      this.a(232, 110);
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.xO, (byte)2, this.K);

      for(int var2 = 0; var2 < Caption.Cb.length; ++var2) {
         VDTT_dg.a(VDTT_dg.d, var1, Caption.Cb[var2], 7, this.f() + 8 + var2 * 12, 0, -1);
      }

   }

   public final void a_() {
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void d() {
      super.d();
      VDTT_il var1;
      if ((var1 = VDTT_cw.v().T()) != null && var1.a == 43) {
         VDTT_cw.v();
         VDTT_cw.o(92);
      }

   }
}
