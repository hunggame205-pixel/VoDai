package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ld extends VDTT_ar {
   private VDTT_cb a;
   private VDTT_mz b;

   public VDTT_ld(VDTT_p var1, VDTT_mz var2) {
      this.e = 2;
      this.I = var1;
      this.b = var2;
      this.K = false;
      this.a(180, 137);
      this.a = new VDTT_cb(10, 45, 100, "", this, 0, 2, 0);
      byte var3 = 9;
      this.a.l = var3;
      this.a(this.a);
      this.a(26, this.r - 35, Caption.i, this, 1001, -8);
      this.a(this.q - 86, this.r - 35, Caption.D, this, 1002, -8);
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.cb, 10, 30, 0, -1, -16777216);
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
         boolean var10000;
         if (this.a.h() <= 0) {
            DataCenter.d().ai.c(Caption.go, -65536);
            var10000 = false;
         } else if (this.a.h() > VDTT_ek.m().ak) {
            DataCenter.d().ai.c(Caption.gp, -65536);
            var10000 = false;
         } else {
            VDTT_ek var4 = VDTT_ek.m();
            var4.ak -= this.a.h();
            VDTT_mz var5 = this.b;
            var2 = this.a.h();
            var5.Q += var2;
            var10000 = true;
         }

         if (!var10000) {
            break;
         }
      case 1002:
         this.k();
      }

   }
}
