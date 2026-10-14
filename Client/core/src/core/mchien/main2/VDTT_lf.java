package core.mchien.main2;

public final class VDTT_lf extends VDTT_ar {
   private VDTT_bu a;
   private VDTT_bu b;
   private VDTT_ho c;

   public VDTT_lf(VDTT_p var1) {
      this.I = var1;
      this.a(180, 100);
      this.c = new VDTT_ho(1000, VDTT_eq.a().b(9));
      this.a = this.a(15, 40, Caption.cE, this, this.c);
      this.b = this.a(15, 65, Caption.cF, this, this.c);
   }

   public final void b(int var1, Object var2) {
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      if (var1 == 1000) {
         VDTT_eq.a().a(9, this.c.b == 0);
      }

   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.zz[1], (byte)2, false);
   }

   public final void a_() {
   }
}
