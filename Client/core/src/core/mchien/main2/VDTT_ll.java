package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ll extends VDTT_am {
   boolean a;
   int b;
   public int c;
   public int d;
   public boolean N;
   private String O;
   private int P;
   private long Q;

   public VDTT_ll(VDTT_p var1) {
      this.I = var1;
      this.d((DataCenter.d().n - 240) / 14 * 14 + 192, 26);
      this.f(DataCenter.d().n / 2 - this.q / 2, DataCenter.d().o - 35);
      this.c = 0;
      this.d = 120;
      this.P = VDTT_jb.a(Caption.Bt.length);
      this.y();
   }

   public final void f(int var1) {
      if (var1 < 100) {
         var1 = 100;
      }

      this.d = var1;
   }

   private void y() {
      if (System.currentTimeMillis() - this.Q > 3000L) {
         this.Q = System.currentTimeMillis();
         ++this.P;
         if (this.P > Caption.Bt.length - 1) {
            this.P = 0;
         }

         this.O = Caption.Bt[this.P];
      }

   }

   public final void w() {
      ++this.c;
      if (this.c > this.d * 99 / 100) {
         this.c = this.d * 99 / 100;
      }

   }

   public final void b(Graphics var1) {
      var1.o();
      VDTT_cw.e(var1);
   }

   public final int x() {
      return this.c * 100 / this.d;
   }

   public final void a_() {
      this.y();
      if (this.c < this.d / 2) {
         ++this.c;
      }

      if (this.c >= this.d) {
         if (this.I instanceof VDTT_cw) {
            ((VDTT_cw)this.I).aB = null;
         }

      } else {
         if (this.N) {
            this.c += this.d / 10;
         }

         if (this.c > this.d) {
            this.c = this.d;
         }

      }
   }

   public final Vector g() {
      return new Vector();
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }
}
