package core.mchien.main2;

import java.util.Vector;

public final class VDTT_jl extends VDTT_ar {
   public VDTT_iy[] a = new VDTT_iy[0];
   private VDTT_iq b;
   private VDTT_hs c;
   private static int d;

   public VDTT_jl(VDTT_p var1) {
      this.I = var1;
      this.a(316, 213);
      this.K = false;
      this.b = new VDTT_iq(new VDTT_hp(1001, Caption.zI), this);
      this.w();
      this.f(d);
   }

   public final void w() {
      this.c = new VDTT_hs((byte)1, 4, this.b.i() + 28, super.q - 8, 126, 18, this.a.length);
   }

   private void f(int var1) {
      this.b.a(var1);
      this.x();
   }

   private void x() {
      try {
         Message var1;
         (var1 = new Message((byte)-22)).a(this.b.h());
         var1.a((int)0);
         var1.l();
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public final void a_() {
      this.b.e();
      this.c.a();
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      this.c(var1, var2);
      switch(var1) {
      case 1002:
         this.w();
      default:
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.b.f());
      var1.addElement(this.c.a(1003, this));
      return var1;
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.cK, (byte)2, this.K);
      this.b.a(var1);
      this.b(var1, this.c);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.cL, 20, -15, 2, -6488, -10275328);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.ek, 95, -15, 2, -6488, -10275328);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.qd, 170, -15, 2, -6488, -10275328);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.M, 245, -15, 2, -6488, -10275328);
      this.a(var1, this.c);

      for(int var2 = 0; var2 < this.c.i; ++var2) {
         if (this.c.b(var2)) {
            if (var2 == this.c.k) {
               var1.f(13136426);
               var1.c(0, var2 * this.c.h, this.c.q, this.c.h);
            }

            VDTT_iy var3 = this.a[var2];
            VDTT_dg.b(VDTT_dg.d, var1, "" + (var2 + 1), 20, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, var3.b, 95, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(var3.e), 170, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, var3.g, 245, 8 + var2 * this.c.h, 2, -3604601, -16777216);
         }
      }

      this.a(var1);
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         if (var1.j.k >= 0) {
            d = var1.j.k;
            this.f(var1.j.k);
            return;
         }
         break;
      case 1003:
         if (var1.j.k >= 0) {
            this.a(this.a[var1.j.k].b, var1.j.k, var2, var3);
         }
      }

   }
}
