package core.mchien.main2;

import java.util.Collections;
import java.util.Vector;

public final class VDTT_mk extends VDTT_ar {
   private int a;
   private int b;
   private int c = -1;
   private VDTT_ek d;
   private VDTT_hs N;
   private VDTT_ic O;
   private VDTT_ar P;

   public VDTT_mk(VDTT_p var1, VDTT_ar var2, VDTT_ek var3, VDTT_ic var4) {
      this.e = 2;
      this.I = var1;
      this.d = var3;
      this.K = false;
      this.O = var4;
      this.P = var2;
      this.a(200, 118);
      this.a(this.q / 2 - 35, this.r - 25, Caption.bI, this, 1002, -8);
      this.a = this.q / 2 + 64 + 2;
      this.b = 50;
      VDTT_cw.v();
      this.N = new VDTT_hs((byte)0, this.q / 2 - 96, this.b, 192, 28, 32, 6);
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.sT, 10, 25, 0, -1, -16777216);
      int var3 = VDTT_cw.v().bl.size();
      VDTT_cw.v();
      if (var3 > 7) {
         var3 = 7;
      }

      for(int var4 = 0; var4 < var3; ++var4) {
         for(int var5 = 0; var5 < VDTT_cw.v().bl.size(); ++var5) {
            VDTT_ic var2;
            if ((var2 = (VDTT_ic)VDTT_cw.v().bl.get(var5)).d == VDTT_cw.v().B()[var4] && var4 > 0) {
               int var6 = var4 - 1;
               VDTT_dg.b(VDTT_dg.f, var1, "" + var4, this.a - 32 * var6 + 16, this.b - 8, 2, -8847903, 0);
               b(var1, this.a - 32 * var6, this.b, (Item)null, this.c == var4);
               var2.a(var1, this.d, this.a - 32 * var6 + 2, this.b + 2);
               if (var2.d == 30) {
                  VDTT_aa.a(var1, -39, 0, this.a - 32 * var6 + 1, this.b + 1, 26, (int)26);
               }
            }
         }
      }

   }

   public final void a_() {
      this.N.a();
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.N.a(3000, this));
      var1.addElement(new VDTT_hl(0, 0, 0, this.q, this.r, this.J, this));
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1002:
         VDTT_mk var7 = this;
         if (this.c > 0) {
            var2 = -1;

            for(var3 = 0; var3 < VDTT_cw.v().B().length; ++var3) {
               if (var7.O.d == VDTT_cw.v().db[var3]) {
                  var2 = var3;
                  break;
               }
            }

            if (var2 > 0) {
               short var8 = VDTT_cw.v().db[var7.c];

               for(int var5 = 0; var5 < VDTT_cw.v().bl.size(); ++var5) {
                  if (((VDTT_ic)VDTT_cw.v().bl.elementAt(var5)).d == var8) {
                     VDTT_cw.v().db[var2] = var8;
                     VDTT_cw.v().db[var7.c] = var7.O.d;
                     Collections.swap(VDTT_cw.v().bl, var2, var7.c);
                     break;
                  }
               }
            } else {
               VDTT_cw.v().db[var7.c] = var7.O.d;

               for(int var4 = 0; var4 < VDTT_cw.v().bl.size(); ++var4) {
                  if (((VDTT_ic)VDTT_cw.v().bl.elementAt(var4)).d == var7.O.d) {
                     Collections.swap(VDTT_cw.v().bl, var4, var7.c);
                     break;
                  }
               }
            }

            VDTT_cw.v().X();
         }

         this.k();
         return;
      case 3000:
         VDTT_cw.v();
         int var6;
         if ((var6 = 6 - var1.j.k) > 0) {
            this.c = var6;
         }
      default:
      }
   }
}
