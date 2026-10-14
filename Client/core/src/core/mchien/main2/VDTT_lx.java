package core.mchien.main2;

import java.util.Vector;

public final class VDTT_lx extends VDTT_ar {
   private VDTT_cb a;
   private String b;

   public VDTT_lx(VDTT_p var1, String var2) {
      this.b = var2;
      this.e = 2;
      this.I = var1;
      this.K = false;
      this.a(220, 125);
      this.a = new VDTT_cb(85, 50, 100, "", this, 0, 2, 0);
      byte var3 = 12;
      this.a.l = var3;
      this.a(this.a);
      this.a(Caption.bi, 100);
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.jx, 80, 20, 1, -1, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, this.b, 85, 20, 0, -1, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.ho, 80, 38, 1, -1, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, "1%", 85, 38, 0, -3089954, -16777216);
      a(var1, 85, 38, "1%", (byte)0);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.jy, 80, 56, 1, -1, -16777216);
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
            VDTT_lx var6 = this;

            try {
               Message var7;
               (var7 = Message.c((byte)-98)).a(var6.b);
               var7.c(var6.a.h());
               var7.l();
               break;
            } catch (Exception var4) {
               DataCenter.d().ai.c(Caption.jz, -1);
            }
         default:
            return;
         }
      } catch (Exception var5) {
      }

   }
}
