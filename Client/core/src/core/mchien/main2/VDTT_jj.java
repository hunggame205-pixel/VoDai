package core.mchien.main2;

import java.util.Vector;

public final class VDTT_jj extends VDTT_ar {
   public VDTT_ms a;
   private VDTT_ca b;

   public VDTT_jj(VDTT_p var1, VDTT_ms var2) {
      this.e = 2;
      this.I = var1;
      this.K = false;
      this.a = var2;
      this.a(180, 112);
      this.b = this.a(10, 40, 100, "", this, 0);
      this.a(26, this.r - 35, Caption.i, this, 1001, -8);
      this.a(this.q - 86, this.r - 35, Caption.D, this, 1002, -8);
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.cJ, 10, 25, 0, -1, -16777216);
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
      switch(var1.b) {
      case 1001:
         VDTT_jj var5 = this;

         try {
            if (var5.b.i().trim().length() != 0) {
               VDTT_cw.v();
               VDTT_cw.h(var5.b.i());
            }
            break;
         } catch (Exception var4) {
            VDTT_jb.a(var4);
            return;
         }
      case 1002:
         this.k();
      }

   }
}
