package core.mchien.main2;

public final class VDTT_lw extends VDTT_ar {
   private VDTT_ca a;
   private int b;
   private int c;

   public VDTT_lw(VDTT_p var1) {
      this.I = var1;
      this.a(210, 120);
      this.a = this.a(88, 44, 100, "", this, 0);
      byte var2 = 30;
      this.a.l = var2;
      this.a.a("");
      this.a(this.q / 2 - 35, this.r - 28, Caption.i, this, 1001, 15);
   }

   public final void b(int var1, Object var2) {
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         VDTT_lw var5 = this;

         try {
            Message var6;
            (var6 = Message.c((byte)-110)).a(var5.a.i());
            var6.l();
            return;
         } catch (Exception var4) {
         }
      default:
      }
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.gc, (byte)2, false);
      this.b = 68;
      this.c = 35;
      VDTT_dg.a(VDTT_dg.d, var1, Caption.gd, 15, this.c + 20, 0, -1);
   }

   public final void a_() {
   }
}
