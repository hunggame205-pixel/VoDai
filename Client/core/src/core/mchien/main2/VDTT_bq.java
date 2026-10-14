package core.mchien.main2;

import java.util.Vector;

public final class VDTT_bq extends VDTT_am {
   private VDTT_hs a;
   private byte b;
   private VDTT_hp c;
   private int d;
   private VDTT_hl N;
   private boolean O;

   public VDTT_bq(VDTT_hp var1, VDTT_p var2, byte var3, boolean var4) {
      this.I = var2;
      this.c = var1;
      this.b = 0;
      this.O = true;
      this.a(200, 200);
      this.a = new VDTT_hs((byte)1, 3, 29, this.q - 6, this.r - 62, 35, var1.c.length);
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.j, this.b, this.K);
      this.a(var1, this.a);

      for(int var2 = 0; var2 < this.c.c.length; ++var2) {
         if (var2 == this.a.k) {
            var1.f(7173754);
            var1.c(0, 2 + var2 * this.a.h, this.a.q, this.a.h - 2);
         }

         if (this.b == 2) {
            if (var2 == this.a.l) {
               VDTT_dg.a(VDTT_dg.d, var1, this.c.c[var2], 1 + this.q / 2, 1 + var2 * this.a.h + this.a.h / 2, 2, -1);
            } else {
               VDTT_dg.a(VDTT_dg.d, var1, this.c.c[var2], this.q / 2, var2 * this.a.h + this.a.h / 2, 2, -1);
            }
         } else if (this.b == 0) {
            if (var2 == this.a.l) {
               VDTT_dg.a(VDTT_dg.d, var1, this.c.c[var2], 21, 1 + var2 * this.a.h + this.a.h / 2, 0, -1);
            } else {
               VDTT_dg.a(VDTT_dg.d, var1, this.c.c[var2], 20, var2 * this.a.h + this.a.h / 2, 0, -1);
            }
         }

         var1.f(1585983);
         var1.c(15, var2 * this.a.h + this.a.h, this.a.q - 30, 1);
         var1.f(7173754);
         var1.c(15, var2 * this.a.h + this.a.h + 1, this.a.q - 30, 1);
      }

      this.a(var1);
   }

   public final void a_() {
      this.a.a();
      if (this.d > 0) {
         --this.d;
         if (this.d == 0) {
            this.c.b = this.N.j.k;
            if (this.O) {
               this.I.a(-7, this, this);
               this.I.a(this.c.a, this.c, this);
            }

            this.N = null;
         }
      }

   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (this.d <= 0) {
         try {
            switch(var1.b) {
            case -1001:
               if (var1.j.k >= 0) {
                  this.d = 4;
                  this.N = var1;
                  return;
               }
               break;
            case -1000:
               this.I.a(-7, this, this);
               this.I.a(this.c.a, this.c, this);
               return;
            default:
               super.a(var1, var2, var3);
            }

         } catch (Exception var4) {
         }
      }
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(new VDTT_hl(-1001, this.a.objX, this.a.objY, this.a.objX + this.a.q, this.a.objY + this.a.r, this.a, this));
      return var1;
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }
}
