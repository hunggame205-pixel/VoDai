package core.mchien.main2;

import java.util.Vector;

public final class VDTT_lg extends VDTT_ar {
   private final VDTT_bd b;
   private VDTT_v c;
   private int d;
   private VDTT_ba N;
   private VDTT_ba O;
   private int P;
   private int Q;
   boolean a;

   public VDTT_lg(VDTT_p var1) {
      this.e = 2;
      this.I = var1;
      this.K = false;
      this.a(320, 185);
      this.w();
      this.P = 170;
      this.N = this.a(this.P, this.r - 21, "", this, 2006, -92);
      short var2 = -360;
      this.N.K = var2;
      this.a(this.N);
      this.Q = 255;
      this.O = this.a(this.Q, this.r - 21, "", this, 2007, -92);
      this.a(this.O);
      this.b = this.a(4, this.r - 20, Caption.wJ, this, 2008);
      if (VDTT_eq.a().b(34) == -1) {
         VDTT_eq.a().a(34, true);
         boolean var3 = true;
         this.b.m = var3;
         this.a = true;
      }

      this.M.f(this.M.objX + 10, -9);
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      switch(var1) {
      case 2008:
         VDTT_eq.a().a(34, this.b.m);
         this.a = true;
      default:
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      this.a(var1, 0, 0);
      var1.f(0);
      var1.d(30);
      var1.c(0, 0, DataCenter.d().n, DataCenter.d().o);
      var1.l = 1.0F;
      this.a(var1, var2, var3);
      if (this.c != null && this.c.c > 1) {
         var1.a(this.c, 0, 0, this.c.c, this.c.d, 0, 0.0F, 0.0F, (float)(this.q * DataCenter.d().r), (float)((this.r - 25) * DataCenter.d().r), 20);
      } else {
         this.w();
      }

      var1.f(-8492991);
      var1.c(0, this.r - 25, this.q, 25);
   }

   private void w() {
      try {
         this.c = VDTT_dc.c(41 + this.d);
      } catch (Exception var1) {
      }
   }

   public final void a_() {
      this.N.f(this.P - DataCenter.d().h / 3 % 3, this.N.objY);
      this.O.f(this.Q + DataCenter.d().h / 3 % 3, this.O.objY);
   }

   public final Vector g() {
      return super.g();
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 2006:
         --this.d;
         if (this.d < 0) {
            this.d = 2;
         }

         this.w();
         return;
      case 2007:
         ++this.d;
         if (this.d > 2) {
            this.d = 0;
         }

         this.w();
      default:
      }
   }

   public final void d() {
      super.d();
      this.c = null;
      if (this.a) {
         VDTT_cw.v().z();
         DataCenter.d().c();
      }

   }
}
