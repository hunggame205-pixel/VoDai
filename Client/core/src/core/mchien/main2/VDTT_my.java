package core.mchien.main2;

import java.util.Vector;

public final class VDTT_my extends VDTT_ar {
   public VDTT_iy[] a = new VDTT_iy[0];
   private VDTT_iq b;
   private VDTT_hs c;
   private VDTT_bf d;

   public VDTT_my(VDTT_p var1) {
      this.I = var1;
      this.a(316, 213);
      this.K = false;
      if (VDTT_cw.v().C().d == 16) {
         this.b = new VDTT_iq(new VDTT_hp(1001, Caption.AP), 3, this.f(), super.q - 8 + 2, 23, 60, this);
      } else {
         this.b = new VDTT_iq(new VDTT_hp(1001, Caption.zT), 3, this.f(), super.q - 8 + 2, 23, 60, this);
      }

      this.d = this.a(173, this.b.i() + 4, 80, Caption.yl.length, new VDTT_hp(1002, Caption.yl), this, 0);
      this.w();
      this.f(0);
   }

   public final void w() {
      this.c = new VDTT_hs((byte)1, 4, this.b.i() + 28, super.q - 8, 126, 18, this.a.length);
   }

   private void f(int var1) {
      this.a = new VDTT_iy[0];
      this.w();
      this.b.a(var1);
      switch(var1) {
      case 0:
         this.d.d = false;
         break;
      default:
         this.d.d = true;
      }

      this.d.d = true;
      this.x();
      if (var1 > 3) {
         this.b.a.a(this.b.b.c.length);
      } else {
         this.b.a.a(0);
      }
   }

   private void x() {
      try {
         Message var1;
         (var1 = new Message((byte)-22)).a(this.b.h());
         var1.a(this.d.n.b);
         var1.l();
      } catch (Exception var3) {
         VDTT_jb.a(var3);
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
         this.x();
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
      this.a(var1, 0, -28, this.c.q, 28, -11, 55, 56);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.cL, 20, -15, 2, -6488, -10275328);
      int var2;
      VDTT_iy var3;
      if (this.b.h() == 5) {
         VDTT_dg.b(VDTT_dg.e, var1, Caption.cM, 70, -15, 2, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.kC, 130, -15, 2, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.ej, 204, -15, 2, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.ek, 274, -15, 2, -6488, -10275328);
         this.a(var1, this.c);

         for(var2 = 0; var2 < this.c.i; ++var2) {
            if (this.c.b(var2)) {
               var3 = this.a[var2];
               VDTT_dg.b(VDTT_dg.d, var1, "" + (var2 + 1), 20, 8 + var2 * this.c.h, 2, -3604601, -16777216);
               VDTT_dg.b(VDTT_dg.d, var1, var3.g, 70, 8 + var2 * this.c.h, 2, -3604601, -16777216);
               VDTT_dg.b(VDTT_dg.d, var1, var3.a(), 130, 8 + var2 * this.c.h, 2, -3604601, -16777216);
               VDTT_dg.b(VDTT_dg.d, var1, var3.e + "/" + var3.f, 208, 8 + var2 * this.c.h, 2, -3604601, -16777216);
               VDTT_dg.b(VDTT_dg.d, var1, var3.b, 274, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            }
         }

         this.a(var1);
         this.c.a(var1, this);
      } else {
         VDTT_dg.b(VDTT_dg.e, var1, Caption.kD, 70, -15, 2, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.kE, 130, -15, 2, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.kJ, 204, -15, 2, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.kK, 274, -15, 2, -6488, -10275328);
         this.a(var1, this.c);

         for(var2 = 0; var2 < this.c.i; ++var2) {
            if (this.c.b(var2)) {
               var3 = this.a[var2];
               VDTT_dg.b(VDTT_dg.d, var1, "" + (var2 + 1), 20, 8 + var2 * this.c.h, 2, -3604601, -16777216);
               VDTT_dg.b(VDTT_dg.d, var1, var3.b, 70, 8 + var2 * this.c.h, 2, -3604601, -16777216);
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(var3.e), 130, 8 + var2 * this.c.h, 2, -3604601, -16777216);
               VDTT_dg var10000 = VDTT_dg.d;
               DataCenter.d();
               VDTT_dg.b(var10000, var1, DataCenter.c(var3.f), 208, 8 + var2 * this.c.h, 2, -3604601, -16777216);
               VDTT_dg.b(VDTT_dg.d, var1, var3.g, 274, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            }
         }

         this.a(var1);
         this.c.a(var1, this);
      }
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         if (var1.j.k >= 0) {
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
