package core.mchien.main2;

public final class VDTT_kq extends VDTT_ar {
   public static VDTT_kq a;

   public VDTT_kq(VDTT_p var1) {
      this.I = var1;
      a = this;
      this.a(240, 170);
      this.K = false;
      this.a(this.a(this.q / 2 - 37, 100, Caption.zj[1], this, 101, 7));
      this.a(this.a(this.q / 2 - 37, 130, Caption.zj[2], this, 102, 7));
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 100:
         this.k();
         return;
      case 101:
         this.k();
         VDTT_cw.v().Z();
         MenuConfig.K().a(false);
         return;
      case 102:
         DataCenter.d().ai.a(Caption.fB, 2003, this);
         return;
      case 2003:
         MenuConfig.K().a(false);
         VDTT_cw.v().Y();
      default:
      }
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.h, (byte)2, this.K);
      if (VDTT_cw.J.length() > 0) {
         VDTT_dg.b(VDTT_dg.d, var1, Caption.fC + VDTT_cw.J + Caption.fD, this.q / 2, 55, 2, -2560, -16777216);
      } else {
         VDTT_dg.b(VDTT_dg.d, var1, Caption.fE, this.q / 2, 55, 2, -2560, -16777216);
      }

      VDTT_dg.b(VDTT_dg.d, var1, Caption.fF, this.q / 2, 68, 2, -2560, -16777216);
   }

   public final void a_() {
   }
}
