package core.mchien.main2;

import java.util.Vector;

public final class VDTT_be extends VDTT_an {
   private int l = 6010;
   private int m = 20;
   private VDTT_ht n;
   private int I;
   private int[] J;
   private String[] K;

   public VDTT_be(int var1, int var2, int var3, MainScreen var4) {
      this.a = var4;
      this.f(var1, var2);
      this.d(80, 80);
      this.J = new int[]{-1, -16742145, -16777216, -7812062, -2560, -48128, -3407617, -9942667, -16711681, -11184811, -3089954, -65536, -11393019, -10831436, -223233, -3842196};
      this.K = new String[]{"c#white", "c#blue", "c#black", "c#green", "c#yellow", "c#orange", "c#pink", "c#purple", "c#cyan", "c#grey", "c#silver", "c#red", "c#brown", "c#5ab9b4", "c#fc97ff", "c#55f6c"};
      this.n = new VDTT_ht((byte)1, 0, 0, this.q, this.r, this.m, VDTT_jb.c(this.J.length, 4), 4);
   }

   public final void b(Graphics var1) {
      this.a(var1, -4, -4, this.q + 9, this.r + 9, 61, 22, 23, 1, 1);
      this.a(var1, this.n);
      int var2 = 0;
      int var3 = 0;

      for(int var4 = 0; var4 < this.J.length; ++var4) {
         if (this.n.c(var3)) {
            var1.f(4721926);
            var1.c(var2 + 1, var3 + 1, 20, 20);
            var1.f(this.J[var4]);
            if (var4 == this.n.N) {
               var1.c(var2 + 4, var3 + 4, 13, 13);
               var1.f(-1);
               var1.b(var2 + 1, var3 + 1, 18, 18);
            } else {
               var1.c(var2 + 3, var3 + 3, 15, 15);
               var1.f(-11184811);
               var1.b(var2 + 1, var3 + 1, 18, 18);
            }

            var1.f();
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
            VDTT_cw.v().cI = this.J[this.n.k];
            VDTT_cw.v().cJ = this.K[this.n.k];
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
         if (this.n.k >= 0 && this.n.k < this.m) {
            this.I = 4;
         }

      }
   }
}
