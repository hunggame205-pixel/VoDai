package core.mchien.main2;

import java.util.Vector;

public final class VDTT_bl extends VDTT_an {
   private int l;
   private int m = 20;
   private VDTT_ht n;
   private int I;
   private int J = 35;

   public VDTT_bl(int var1, int var2, int var3, MainScreen var4) {
      this.l = var3;
      this.a = var4;
      this.f(var1, var2);
      this.d(100, 80);
      this.n = new VDTT_ht((byte)1, 0, 0, this.q, this.r, this.m, VDTT_jb.c(this.J, 5), 5);
   }

   public final void b(Graphics var1) {
      this.a(var1, -6, -6, this.q + 12, this.r + 12, 61, 22, 23, 1, 1);
      this.a(var1, this.n);
      int var2 = 0;
      int var3 = 0;

      for(int var4 = 0; var4 < this.J; ++var4) {
         if (this.n.c(var3)) {
            if (var4 == this.n.N) {
               VDTT_dc.a(var1, VDTT_in.g[var4].c, 0, var2 + 2 + 1, var3 + 16 + 1, 36);
            } else {
               VDTT_dc.a(var1, VDTT_in.g[var4].c, 0, var2 + 2, var3 + 16, 36);
            }
         }

         var2 += 20;
         if (var2 > this.q - 20) {
            var2 = 0;
            var3 += 20;
         }
      }

      this.a(var1);
   }

   public final void a_() {
      this.n.a();
      if (this.I > 0) {
         --this.I;
         if (this.I == 0) {
            this.a.a(this.l, VDTT_in.g[this.n.k].d, this);
            this.a.b((VDTT_m)this);
         }
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).addElement(new VDTT_hl(-1002, this.n.objX, this.n.objY, this.n.objX + this.n.q, this.n.objY + this.n.r, this.n, this));
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (this.I <= 0) {
         if (this.n.k >= 0 && this.n.k < this.J) {
            this.I = 4;
         }

      }
   }
}
