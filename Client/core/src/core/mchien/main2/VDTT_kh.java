package core.mchien.main2;

import java.util.Vector;

public final class VDTT_kh extends VDTT_ar {
   public VDTT_ba[] a;
   public VDTT_iy[] b = new VDTT_iy[0];
   private VDTT_hs c;
   private VDTT_hs[] d;
   private VDTT_ba N;

   public VDTT_kh(VDTT_p var1, Message var2) {
      try {
         this.I = var1;
         this.a(315);
         this.K = false;
         this.b = new VDTT_iy[var2.f()];

         for(int var5 = 0; var5 < this.b.length; ++var5) {
            this.b[var5] = new VDTT_iy();
            this.b[var5].a = var5 + 1;
            this.b[var5].b = var2.b.c();
            this.b[var5].c = var2.i();
            this.b[var5].h = var2.i() + "%";
            this.b[var5].e = (long)var2.i();
            this.b[var5].f = var2.i();
            this.b[var5].g = var2.j();
         }

         this.N = this.a(5, this.r - 26, Caption.wf, this, 100, 15);
         this.w();
      } catch (Exception var4) {
      }
   }

   private void w() {
      this.c = new VDTT_hs((byte)1, 4, this.f() + 32, super.q - 8, 154, 22, this.b.length);
      this.a = new VDTT_ba[this.b.length];
      this.d = new VDTT_hs[this.b.length];

      for(int var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1] = new VDTT_ba(261, var1 * this.c.h + 2, 0, 0, Caption.nE, this, 3000 + var1, 15);
         this.a[var1].d(37, 18);
         this.d[var1] = new VDTT_hx((byte)1, this.a[var1].objX, this.a[var1].objY, this.a[var1].q, this.a[var1].r, this.a[var1].r, 1, this.c);
      }

   }

   public final void a_() {
      this.c.a();

      for(int var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1].a_();
         this.a[var1].a_();
         if (this.d[var1].l != -1) {
            this.a[var1].N = true;
         } else {
            this.a[var1].N = false;
         }
      }

      String var2;
      if (VDTT_ek.m().e(301) != null) {
         var2 = Caption.wg;
         this.N.l = var2;
      } else {
         var2 = Caption.wf;
         this.N.l = var2;
      }

      if (VDTT_cw.v().br == 5 && VDTT_cw.v().bs == 3) {
         this.y();
      }

      if (VDTT_ek.m().bh != null) {
         this.k();
         VDTT_cw.v();
         VDTT_cw.o(54);
      }

   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      this.c(var1, var2);
   }

   public final void b(int var1, Object var2) {
   }

   public final Vector g() {
      Vector var1 = super.g();

      for(int var4 = 0; var4 < this.a.length; ++var4) {
         int var2 = this.c.objX + this.a[var4].objX;
         int var3 = this.c.objY + this.a[var4].objY - this.c.f;
         if (VDTT_jb.a(this.c.objX, this.c.objY, this.c.objX + this.c.q, this.c.objY + this.c.r, var2, var3) && VDTT_jb.a(this.c.objX, this.c.objY, this.c.objX + this.c.q, this.c.objY + this.c.r, var2 + this.a[var4].q, var3 + this.a[var4].r)) {
            this.d[var4].objX = (short)var2;
            this.d[var4].objY = (short)var3;
            var1.addElement(new VDTT_hl(3000 + var4, this.d[var4].objX, this.d[var4].objY, this.d[var4].objX + this.d[var4].q, this.d[var4].objY + this.d[var4].r, this.d[var4], this));
         }
      }

      var1.addElement(this.c.a(1003, this));
      return var1;
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.hZ, (byte)2, this.K);
      this.b(var1, this.c);
      this.a(var1, 8, -24, this.c.q - 16, 21, -11, 22, 23, 1, 1);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.cM, 36, -15, 2, -6488, -10275328);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.kC, 90, -15, 2, -6488, -10275328);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.ej, 158, -15, 2, -6488, -10275328);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.ek, 224, -15, 2, -6488, -10275328);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.nD, 279, -15, 2, -6488, -10275328);
      this.a(var1, this.c);
      int var2 = var1.e;
      int var3 = var1.f;

      for(int var4 = 0; var4 < this.c.i; ++var4) {
         if (this.c.b(var4)) {
            if (var4 == this.c.k) {
               VDTT_dc.a(var1, 3, var4 * this.c.h, this.c.q - 6, this.c.h);
            }

            VDTT_iy var5 = this.b[var4];
            VDTT_dg.b(VDTT_dg.d, var1, var5.g, 36, 10 + var4 * this.c.h, 2, -3604601, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, var5.c + "+" + var5.h, 90, 10 + var4 * this.c.h, 2, -3604601, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, var5.e + "/" + var5.f, 158, 10 + var4 * this.c.h, 2, -3604601, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, var5.b, 224, 10 + var4 * this.c.h, 2, -3604601, -16777216);
            this.a(var1, var2 + this.a[var4].objX, var3 + this.a[var4].objY);
            this.a[var4].b(var1);
            this.a(var1, var2, var3);
         }
      }

      this.a(var1);
      this.c.b(var1, this);
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (var1.b >= 3000 & var1.b < 4000) {
         try {
            VDTT_ac.b().n();
            Message var6;
            (var6 = Message.c((byte)-92)).a(this.b[var1.b - 3000].g);
            var6.l();
            this.k();
            return;
         } catch (Exception var5) {
         }
      }

      switch(var1.b) {
      case 100:
         Item var4;
         if ((var4 = VDTT_ek.m().e(301)) != null) {
            VDTT_cw.v().a(var4);
            return;
         }

         (var4 = new Item(301)).b = 8;
         var4.m = 350;
         this.I.a((MainScreen)(new VDTT_jw(this.I, var4, (byte)40)));
         break;
      case 1001:
         return;
      case 1003:
         if (var1.j.k >= 0) {
            this.a(this.b[var1.j.k].b, var1.j.k, var2, var3);
            return;
         }
      }

   }

   public final void d() {
      try {
         VDTT_il var1;
         if ((var1 = VDTT_cw.v().T()) != null) {
            if (var1.a == 43 && VDTT_cw.v().br == 5 && VDTT_cw.v().bs == 3) {
               VDTT_cw.v();
               VDTT_cw.o(92);
            } else if (var1.a == 44) {
               VDTT_cw.v();
               VDTT_cw.o(93);
            }
         }
      } catch (Exception var2) {
      }

      super.d();
   }
}
