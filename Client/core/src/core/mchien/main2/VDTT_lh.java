package core.mchien.main2;

import java.util.Vector;

public final class VDTT_lh extends VDTT_ar {
   private VDTT_ca a;
   private VDTT_ca b;

   public VDTT_lh(VDTT_p var1) {
      this.e = 2;
      this.I = var1;
      this.K = false;
      this.a(200, 120);
      this.a = this.a(60, 40, 100, "", this, 0, 0);
      byte var2 = 12;
      this.a.l = var2;
      this.b = this.a(60, 65, 100, "", this, 0, 0);
      var2 = 3;
      this.b.l = var2;
      this.b.b(true);
      this.a(Caption.bi, 100);
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.gV, (byte)2, true);
      VDTT_dg.d(VDTT_dg.d, var1, Caption.gW, 10, this.f() + 20, 0, -1, -16777216);
   }

   public final void a_() {
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(new VDTT_hl(0, 0, 0, this.q, this.r, this.J, this));
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);

      try {
         switch(var1.b) {
         case 100:
            Message var5;
            (var5 = Message.c((byte)-106)).a(this.a.i());
            var5.a(this.b.i());
            var5.l();
         default:
         }
      } catch (Exception var4) {
      }
   }
}
