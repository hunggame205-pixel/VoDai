package core.mchien.main2;

import java.util.Vector;

public final class VDTT_kc extends VDTT_ar {
   public static byte[] a;
   private static VDTT_bd[] b;

   public VDTT_kc(int var1, VDTT_p var2) {
      this.e = 2;
      this.I = var2;
      this.K = false;
      this.a(240, 196);
      VDTT_ba var4;
      (var4 = this.a(Caption.u, 2001)).f(var4.objX, var4.objY - 5);
      b = new VDTT_bd[14];

      for(var1 = 0; var1 < 7; ++var1) {
         switch(var1) {
         case 3:
            b[4 + var1] = this.a(135, 25 + var1 * 18, Caption.zr[var1], 4 + var1);
            b[var1] = this.a(20, 25 + var1 * 18, Caption.zr[4 + var1], var1);
            break;
         case 4:
         case 5:
         case 6:
            b[var1 * 2] = this.a(20, 44 + var1 * 18, Caption.zr[var1 * 2], var1 * 2);
            if (var1 * 2 + 1 != 11 && var1 * 2 + 1 != 13) {
               b[var1 * 2 + 1] = this.a(135, 44 + var1 * 18, Caption.zr[var1 * 2 + 1], var1 * 2 + 1);
            } else {
               b[var1 * 2 + 1] = this.a(135, 44 + (var1 - 1) * 18, Caption.zr[var1 * 2 + 1], var1 * 2 + 1);
            }

            VDTT_bd var10000;
            boolean var3;
            if (var1 * 2 + 1 == 9) {
               var10000 = b[var1 * 2 + 1];
               var3 = true;
               var10000.d = var3;
            } else if (var1 * 2 == 12) {
               var10000 = b[var1 * 2];
               var3 = true;
               var10000.d = var3;
            }
            break;
         default:
            b[var1] = this.a(20, 25 + var1 * 18, Caption.zr[var1], var1);
            b[4 + var1] = this.a(135, 25 + var1 * 18, Caption.zr[4 + var1], 4 + var1);
         }
      }

      w();
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      VDTT_dg.a(VDTT_dg.d, var1, Caption.s, 20, 15, 0, -1);
      VDTT_dg.a(VDTT_dg.d, var1, Caption.sO, 20, 105, 0, -1);
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 2001:
         VDTT_eq.a().a(8, true);
         VDTT_eq.a().a(16, false);
         VDTT_eq.a().a(23, false);
         VDTT_eq.a().a(24, false);
         x();
         A();
      default:
      }
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      if (var1 < 8) {
         VDTT_bc.m[var1] = (byte)(b[var1].m ? var1 : -1);
      } else if (var1 == 8) {
         VDTT_eq.a().a(8, b[var1].m);
      } else if (var1 == 10) {
         VDTT_eq.a().a(24, b[var1].m);
      } else if (var1 == 12) {
         VDTT_eq.a().a(23, b[var1].m);
      } else if (var1 == 9) {
         VDTT_eq.a().a(16, b[var1].m);
      } else if (var1 == 11) {
         VDTT_eq.a().a(1, b[var1].m);
         MenuConfig.K().x();
         VDTT_ac.b().c(b[var1].m);
      } else if (var1 == 13) {
         VDTT_eq.a().a(0, b[var1].m);
         MenuConfig.K().x();
         VDTT_ac.b().b(b[var1].m);
      }

      z();
      A();
   }

   public static void w() {
      try {
         x();
         byte[] var0;
         if ((var0 = VDTT_da.d("chanels")) != null && var0.length == VDTT_bc.m.length) {
            for(int var1 = 0; var1 < var0.length; ++var1) {
               VDTT_bc.m[var1] = var0[var1];
            }
         }
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }

      z();
   }

   private static void x() {
      a = new byte[]{0, 1, 6, 9, 3, 4, 5, 2};
      VDTT_bc.m = new byte[]{0, 1, 2, -1, -1, -1, -1, -1};
      z();
   }

   private static void z() {
      try {
         if (b != null) {
            VDTT_bd var10000;
            boolean var2;
            for(int var0 = 0; var0 < VDTT_bc.m.length; ++var0) {
               if (b[var0] != null) {
                  var10000 = b[var0];
                  var2 = VDTT_bc.m[var0] >= 0;
                  var10000.m = var2;
               }
            }

            var10000 = b[8];
            var2 = VDTT_eq.a().a(8);
            var10000.m = var2;
            var10000 = b[10];
            var2 = VDTT_eq.a().a(24);
            var10000.m = var2;
            var10000 = b[12];
            var2 = VDTT_eq.a().a(23);
            var10000.m = var2;
            var10000 = b[9];
            var2 = VDTT_eq.a().a(16);
            var10000.m = var2;
            var10000 = b[11];
            var2 = VDTT_eq.a().a(1);
            var10000.m = var2;
            var10000 = b[13];
            var2 = VDTT_eq.a().a(0);
            var10000.m = var2;
         }

      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }

   private static void A() {
      VDTT_da.a("chanels", VDTT_bc.m);
   }

   public final void a_() {
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(new VDTT_hl(0, 0, 0, this.q, this.r, this.J, this));
      return var1;
   }
}
