package core.mchien.main2;

import java.util.Vector;

public final class VDTT_la extends VDTT_ar {
   private VDTT_ho b;
   public int a;

   public VDTT_la(VDTT_p var1, int var2) {
      this.e = 2;
      this.I = var1;
      this.a(186, 180);
      this.f(this.objX, this.objY + 20);
      this.b = new VDTT_ho(1000, var2);
      this.a(20, 25, Caption.vu, this, this.b);
      this.a(20, 45, Caption.vv, this, this.b);
      this.a(20, 65, Caption.vw, this, this.b);
      this.a(20, 85, Caption.vy, this, this.b);
      this.a(20, 105, Caption.xY, this, this.b);
      this.a(20, 125, Caption.xZ, this, this.b);
      this.j();
      this.a(Caption.l, 1007);
   }

   public final void a(int var1, Object var2) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      try {
         switch(var1) {
         case 1000:
            this.w();
         default:
         }
      } catch (Exception var4) {
      }
   }

   public final void b(Graphics var1) {
      this.e(var1);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.vx, 20, 12, 0, -1, -16777216);
   }

   public final void a_() {
   }

   public final Vector g() {
      if (this.J != null) {
         this.J.q = 0;
      }

      Vector var1;
      (var1 = super.g()).addElement(new VDTT_hl(0, 0, 0, this.q, this.r, this.J, this));
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1006:
         this.w();
      default:
         return;
      case 1007:
         this.k();
      }
   }

   private void w() {
      try {
         int var1 = this.b.b;
         Message var2;
         (var2 = Message.c((byte)-58)).a(var1);
         var2.l();
      } catch (Exception var3) {
      }

      this.k();
   }
}
