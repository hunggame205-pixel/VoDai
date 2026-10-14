package core.mchien.main2;

import java.util.Vector;

public final class VDTT_lz extends VDTT_ar {
   private VDTT_ca a;
   private boolean b;
   private boolean c;
   private int d;

   public VDTT_lz(VDTT_p var1, Message var2) {
      try {
         this.b = var2.c();
         this.c = var2.c();
         this.d = var2.i();
         this.e = 2;
         this.I = var1;
         this.a(240, 160);
         this.a = this.a(62, 5 + 75, 150, "", this, 1);
         VDTT_ba var5;
         if (this.b) {
            var5 = this.c(Caption.qA, 1002);
            if (this.c) {
               var5.a(true);
            }
         } else {
            var5 = this.c(Caption.qB, 1003);
         }

         var5.f(this.q / 2 - var5.q / 2, var5.objY);
         (var5 = this.b(Caption.qC, 1004)).f(var5.objX - 30, var5.objY);
         var5.a(!this.b);
         if (this.c && this.b) {
            String var3 = Caption.qD;
            var5.l = var3;
            var5.a(true);
         }

         (var5 = this.c(Caption.qE, 1005)).f(var5.objX + 30, var5.objY);
         var5.a(!this.b);
      } catch (Exception var4) {
      }
   }

   public final void a(int var1, Object var2) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final int f() {
      return 5;
   }

   public final void b(Graphics var1) {
      this.e(var1);
      if (this.d > 0) {
         VDTT_dg.b(VDTT_dg.d, var1, Caption.qG + VDTT_jb.e((long)this.d * 1000L), 12, 5 + 16, 20, -2560, -10275328);
      }

      VDTT_dg.b(VDTT_dg.d, var1, Caption.qz, 12, 5 + 32, 20, -1, -10275328);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.qH, 12, 5 + 48, 20, -1, -10275328);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.qI, 12, 5 + 64, 20, -1, -10275328);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.qx, 12, 5 + 86, 20, -1, -10275328);
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
         return;
      case 1002:
         DataCenter.d().ai.a(Caption.qJ, 2012, this);
         return;
      case 1003:
         DataCenter.d().ai.a(Caption.qK, 2013, this);
         return;
      case 1004:
         this.f(2);
         return;
      case 1005:
         DataCenter.d().ai.a(Caption.qL, 2015, this);
         return;
      case 2012:
         this.f(0);
         return;
      case 2013:
         this.f(1);
         return;
      case 2015:
         this.f(3);
      default:
      }
   }

   private void f(int var1) {
      try {
         Message var2;
         (var2 = Message.c((byte)-49)).a(var1);
         var2.a(this.a.i());
         var2.l();
      } catch (Exception var3) {
      }
   }
}
