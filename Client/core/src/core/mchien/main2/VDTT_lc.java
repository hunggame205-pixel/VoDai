package core.mchien.main2;

import java.math.BigInteger;
import java.util.Vector;

public final class VDTT_lc extends VDTT_ar {
   private VDTT_ca[] a;
   private int b;
   private int c;
   private int d;
   private boolean N;
   private boolean O;
   private String P;
   private String[] Q = new String[]{"90", "91", "92", "93", "94", "95"};
   private VDTT_dg[] R;

   public VDTT_lc(VDTT_p var1) {
      this.R = new VDTT_dg[]{VDTT_dg.g[0], VDTT_dg.g[1], VDTT_dg.g[2]};

      try {
         this.I = var1;
         this.a(320, 220);
         this.a = new VDTT_ca[6];
         this.a[0] = this.a(40, 45, 100, "client", 2);
         this.a[1] = this.a(40, 70, 100, "char", 2);
         this.a[2] = this.a(40, 120, 100, "hue color num", 0);
         this.a[3] = this.a(40, 145, 100, "hue color string", 0);
         this.a[4] = this.a(40, 95, 100, "font name", 0);
         this.a[5] = this.a(150, 145, 100, "font name", 0);
         VDTT_ca var10000 = this.a[3];
         byte var2 = 6;
         var10000.l = var2;
         this.a[4].a("");
         this.a[3].a("");
         this.a(160, 45, "", this, 2001, 58);
         this.a(160, 70, "", this, 2002, 58);
         this.a(160, 120, "", this, 2003, 58);
         this.a(180, 45, "", this, 2004, 57);
         this.a(180, 70, "", this, 2005, 57);
         this.a(180, 120, "", this, 2006, 57);
      } catch (Exception var3) {
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      try {
         int var5;
         switch(var1.b) {
         case 2001:
            var5 = Integer.parseInt(this.a[0].i());
            --var5;
            this.a[0].a(var5);
            break;
         case 2002:
            var5 = Integer.parseInt(this.a[1].i());
            --var5;
            this.a[1].a(var5);
            break;
         case 2003:
            var5 = Integer.parseInt(this.a[2].i());
            --var5;
            this.a[2].a(var5);
            break;
         case 2004:
            var5 = Integer.parseInt(this.a[0].i());
            ++var5;
            this.a[0].a(var5);
            break;
         case 2005:
            var5 = Integer.parseInt(this.a[1].i());
            ++var5;
            this.a[1].a(var5);
            break;
         case 2006:
            var5 = Integer.parseInt(this.a[2].i());
            ++var5;
            this.a[2].a(var5);
         default:
            return;
         }
      } catch (Exception var4) {
      }

   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, "", (byte)20, this.K);
      if (this.P != null && this.P.length() > 0) {
         try {
            int var2 = -1;
            VDTT_dg var3 = null;

            for(int var4 = 0; var4 < this.Q.length; ++var4) {
               if (this.Q[var4].toLowerCase().startsWith(this.P.toLowerCase())) {
                  var2 = var4;
                  var3 = VDTT_dg.g[var4];
                  break;
               }
            }

            if (var2 >= 0) {
               VDTT_dg.d(VDTT_dg.d, var1, "drawRun", 60, 207, 2, -1, -16777216);
               VDTT_dg.d(VDTT_dg.d, var1, "drawLight", 130, 207, 2, -1, -16777216);
               VDTT_dg.d(VDTT_dg.d, var1, "drawBorderBitmap", 200, 207, 2, -1, -16777216);
               VDTT_dg.c(var3, var1, "Xin chào", 30, 190, this.c, this.d, 2);
               VDTT_dg.c(var3, var1, "Xin chào", 100, 190, this.c, this.d, 3);
               VDTT_dg.b(var3, var1, "Xin chào", 170, 190, 0, -2560, -16742145);
            }

         } catch (Exception var5) {
         }
      } else {
         if (this.c != 0) {
            if (this.c <= 180 && this.c >= -180 && !this.O) {
               var1.c((float)this.c);
            } else {
               var1.c(this.c);
            }
         }

         if (this.b > 0) {
            if (this.N) {
               VDTT_dc.b(var1, this.b, 0, 40, 160, 20);
            } else {
               VDTT_dc.a(var1, this.b, 0, 40, 160, 20);
            }
         }

         if (this.c != 0) {
            var1.f();
            var1.r();
         }

      }
   }

   public final void a_() {
      this.b = -1;
      this.N = this.O = false;

      try {
         this.b = Integer.parseInt(this.a[0].i());
      } catch (Exception var4) {
      }

      if (this.b == -1) {
         try {
            this.b = Integer.parseInt(this.a[1].i());
            this.N = true;
         } catch (NumberFormatException var3) {
         }
      }

      this.c = -1;
      String var1 = this.a[3].i();

      BigInteger var6;
      try {
         if (var1 != null && !var1.trim().isEmpty()) {
            this.O = true;
            var6 = new BigInteger("FF" + var1, 16);
            this.c = var6.intValue();
         } else {
            this.c = Integer.parseInt(this.a[2].i());
         }
      } catch (NumberFormatException var5) {
      }

      this.d = -1;
      var1 = this.a[5].i();

      try {
         if (var1 != null && !var1.trim().isEmpty()) {
            var6 = new BigInteger("FF" + var1, 16);
            this.d = var6.intValue();
         }
      } catch (NumberFormatException var2) {
      }

      this.P = this.a[4].i().toString().trim();
   }

   public final Vector g() {
      return super.g();
   }
}
