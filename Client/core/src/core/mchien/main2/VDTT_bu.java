package core.mchien.main2;

import java.util.Vector;

public final class VDTT_bu extends VDTT_m {
   private String n;
   public boolean l;
   private VDTT_ho I;
   private short J = 10;
   public boolean m;

   public VDTT_bu(int var1, int var2, String var3, MainScreen var4, VDTT_ho var5) {
      this.n = var3;
      this.a = var4;
      this.I = var5;
      if (var5.c.size() == var5.b) {
         this.l = true;
      }

      var5.c.addElement(this);
      this.f(var1, var2);
      this.d(18 + VDTT_dg.b(VDTT_dg.d, var3), 16);
   }

   public final void b(boolean var1) {
      this.d = var1;
   }

   public final void a(String var1) {
      this.n = var1;
      this.d(18 + VDTT_dg.b(VDTT_dg.d, var1), 16);
   }

   public final void a_() {
   }

   public final void b(Graphics var1) {
      if (!this.d) {
         short var2 = this.J;
         if (!this.c && this.e(0)) {
            var1.e(30);
         }

         VDTT_dc.a(var1, var2, 0, 0, 0, 20);
         var1.h();
         if (!this.c && !this.d ? (this.m ? true : this.e(0)) : false) {
            VDTT_dg.b(VDTT_dg.d, var1, this.n, 21, 8, 0, -1, -16777216);
         } else if (this.c) {
            VDTT_dg.b(VDTT_dg.d, var1, this.n, 20, 7, 0, -3089954, -16777216);
         } else {
            VDTT_dg.b(VDTT_dg.d, var1, this.n, 20, 7, 0, -1, -16777216);
         }

         if (this.l) {
            VDTT_dc.a(var1, 11, 0, 4, 4, 20);
         }

      }
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (!this.c && !this.d) {
         for(var3 = 0; var3 < this.I.c.size(); ++var3) {
            VDTT_bu var4;
            (var4 = (VDTT_bu)this.I.c.elementAt(var3)).l = false;
            if (var4.equals(this)) {
               this.I.b = var3;
            }
         }

         this.l = true;
         this.a.a(var1.b, this.I, this);
         VDTT_ac.b().n();
      }
   }

   public final Vector g() {
      Vector var1 = new Vector();
      if (!this.c && !this.d) {
         var1.addElement(new VDTT_hl(this.I.a, 0, 0, this.q, this.r, (VDTT_hs)null, this));
      }

      return var1;
   }
}
