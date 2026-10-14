package core.mchien.main2;

import java.util.Collections;
import java.util.Vector;

public final class VDTT_kj extends VDTT_ar {
   private VDTT_ca a;
   private VDTT_lm b;
   private Vector c;
   private VDTT_hs d;
   private int N = 0;

   public VDTT_kj(VDTT_p var1, VDTT_lm var2) {
      this.e = 2;
      this.I = var1;
      this.b = var2;
      this.K = false;
      this.a(180, 202);
      this.a = new VDTT_ca(10, 20, 115, Caption.as, this, 0, 0);
      this.a(this.a);
      this.a(this.a.objX + this.a.q + 7, this.a.objY + 1, Caption.km, this, 1002, -8).d(40, 20);
      this.c = new Vector();

      for(int var4 = 0; var4 < VDTT_cw.v().aa.size(); ++var4) {
         VDTT_fj var3;
         if ((var3 = (VDTT_fj)VDTT_cw.v().aa.elementAt(var4)).d) {
            this.c.add(var3);
         }
      }

      if (VDTT_cw.v().ab.size() != 0 && this.c.size() != 0) {
         Collections.sort(this.c, new VDTT_kk(this));
      }

      this.d = new VDTT_hs((byte)1, 10, this.f() + 18, super.q - 8 - 12, 147, 21, this.c.size());
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.bH, 10, 10, 0, -1, -16777216);

      try {
         this.a(var1, this.d);

         for(int var3 = 0; var3 < this.d.i; ++var3) {
            if (this.d.b(var3)) {
               VDTT_fj var2 = (VDTT_fj)this.c.elementAt(var3);
               if (var3 == this.d.k) {
                  VDTT_dc.a(var1, 0, var3 * this.d.h, this.d.q, this.d.h - 1);
               }

               if (var2.d) {
                  VDTT_dc.a(var1, 302, 0, 5, 6 + var3 * this.d.h, 20);
               } else if (var2.b == 1) {
                  VDTT_dc.a(var1, 304, 0, 5, 6 + var3 * this.d.h, 20);
               } else {
                  VDTT_dc.a(var1, 303, 0, 5, 6 + var3 * this.d.h, 20);
               }

               if (var3 == this.d.l) {
                  VDTT_dg.b(VDTT_dg.d, var1, var2.c + (var2.b == 2 ? Caption.gZ : ""), 20, 9 + var3 * this.d.h, 0, -3089954, -16777216);
               } else {
                  VDTT_dg.b(VDTT_dg.d, var1, var2.c + (var2.b == 2 ? Caption.gZ : ""), 19, 10 + var3 * this.d.h, 0, -3089954, -16777216);
               }
            }
         }

         this.a(var1);
      } catch (Exception var4) {
      }

      this.d.a(var1, -15, -8, -16777216);
   }

   public final void a_() {
      try {
         this.d.a();
         if (this.N != this.a.i().length()) {
            VDTT_kj var1 = this;
            String var2;
            if ((var2 = this.a.i().toLowerCase().trim()) != null && !var2.trim().equals("")) {
               for(int var3 = 0; var3 < var1.c.size(); ++var3) {
                  if (((VDTT_fj)var1.c.get(var3)).c.toLowerCase().contains(var2)) {
                     var1.d.k = var3;
                     var1.d.a(var3);
                     break;
                  }
               }
            }

            this.N = this.a.i().length();
         }

      } catch (Exception var4) {
      }
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.d.a(1003, this));
      var1.addElement(new VDTT_hl(0, 0, 0, this.q, this.r, this.J, this));
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      String var5;
      switch(var1.b) {
      case 1001:
         return;
      case 1002:
         VDTT_kj var4 = this;
         if ((var5 = this.a.i().toLowerCase().trim()) != null && !var5.trim().equals("")) {
            var3 = this.d.k + 1;

            while(true) {
               if (var3 >= var4.c.size()) {
                  return;
               }

               if (((VDTT_fj)var4.c.get(var3)).c.toLowerCase().contains(var5)) {
                  var4.d.k = var3;
                  var4.d.a(var3);
                  break;
               }

               ++var3;
            }
         }
         break;
      case 1003:
         if (var1.j.k >= 0) {
            VDTT_lm var10000 = this.b;
            var5 = ((VDTT_fj)this.c.elementAt(this.d.k)).c;
            var10000.R.a(var5);
            this.k();
         }
      }

   }

   // $FF: synthetic method
   static int a(VDTT_kj var0, String var1) {
      String var2 = var1;

      for(int var3 = 0; var3 < VDTT_cw.v().ab.size(); ++var3) {
         if (((String)VDTT_cw.v().ab.get(var3)).equals(var2)) {
            return var3;
         }
      }

      return -1;
   }
}
