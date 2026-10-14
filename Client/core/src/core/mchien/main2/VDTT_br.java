package core.mchien.main2;

import java.util.Vector;

public final class VDTT_br extends VDTT_an {
   private VDTT_hp l;
   private VDTT_hs m;
   private int n;
   private String[] I;
   private String[][] J;
   private int K = 8;

   public VDTT_br(int var1, int var2, MainScreen var3, VDTT_hp var4) {
      this.a = var3;
      this.l = var4;
      this.f(var1, var2);
      this.I = new String[var4.c.length];
      this.J = new String[var4.c.length][];

      for(var1 = 0; var1 < var4.c.length; ++var1) {
         String[] var5 = VDTT_jb.a(var4.c[var1], ",");
         this.I[var1] = var5[0];
         if (var5.length > 1) {
            this.J[var1] = new String[var5.length - 1];

            for(int var6 = 1; var6 < var5.length; ++var6) {
               this.J[var1][var6 - 1] = var5[var6];
            }
         }
      }

      this.d();
   }

   private void d() {
      int var1;
      if ((var1 = this.I.length) > this.K) {
         var1 = this.K;
      }

      this.d(110, 10 + var1 * 18);

      for(int var2 = 0; var2 < this.I.length; ++var2) {
         int var3;
         if ((var3 = VDTT_dg.c(VDTT_dg.d, this.I[var2]) + 20) > this.q) {
            this.q = (short)var3;
         }
      }

      this.m = new VDTT_hs((byte)1, 5, 5, this.q - 10, var1 * 18, 18, this.I.length);
   }

   public final void b(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      this.c(var1);
      this.a(var1, this.m);

      for(int var4 = 0; var4 < this.m.i; ++var4) {
         if (this.m.k == var4) {
            VDTT_dc.a(var1, -1, var4 * this.m.h, this.m.q + 2, this.m.h);
            VDTT_dg.d(VDTT_dg.d, var1, this.I[var4], 5, 7 + var4 * this.m.h, 0, -279002, -16777216);
         } else if (this.m.l == var4) {
            VDTT_dc.a(var1, 0, var4 * this.m.h, this.m.q, this.m.h - 1);
            VDTT_dg.d(VDTT_dg.d, var1, this.I[var4], 6, 8 + var4 * this.m.h, 0, -6488, -16777216);
         } else {
            VDTT_dg.d(VDTT_dg.d, var1, this.I[var4], 5, 7 + var4 * this.m.h, 0, -6488, -16777216);
         }
      }

      this.a(var1);
      this.a(var1, var2, var3);
      this.m.a(var1, this, 0);
   }

   public final void a_() {
      this.m.a();
      if (this.n > 0) {
         if (this.n == 1) {
            this.a.b((VDTT_m)this);
            return;
         }

         --this.n;
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).addElement(this.m.a(this.l.a, this.a));
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (var1.j.k >= 0) {
         if (this.l.e == -1 && this.J[var1.j.k] != null && this.J[var1.j.k].length > 0) {
            this.l.e = var1.j.k;
            this.I = this.J[var1.j.k];
            var1.j.k = -1;
            this.d();
            return;
         }

         if (this.l.e == -1) {
            var1.b = this.l.d[var1.j.k];
         } else {
            var1.b = this.l.d[this.l.e];
            this.l.e = var1.j.k;
         }

         this.a.perform(var1.b, this.l, this.a);
         this.n = 4;
      }

   }
}
