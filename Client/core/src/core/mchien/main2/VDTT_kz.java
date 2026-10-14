package core.mchien.main2;

import java.util.Vector;

public final class VDTT_kz extends VDTT_ar {
   private VDTT_cb a;

   public VDTT_kz(VDTT_p var1) {
      this.e = 2;
      this.I = var1;
      this.K = false;
      this.a(220, 125);
      this.a = new VDTT_cb(85, 40, 100, "", this, 0, 2, 0);
      byte var2 = 12;
      this.a.l = var2;
      this.a(this.a);
      this.a(Caption.bi, 100);
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.ge + VDTT_jb.c(VDTT_ek.m().ak) + Caption.fh, 30, 28, 0, -1, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.gf, 30, 50, 0, -1, -16777216);
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
            VDTT_kz var6 = this;

            try {
               Message var7;
               (var7 = Message.c((byte)-95)).c(var6.a.h());
               var7.l();
               break;
            } catch (Exception var4) {
               DataCenter.d().ai.c(Caption.gg, -1);
            }
         default:
            return;
         }
      } catch (Exception var5) {
      }

   }
}
