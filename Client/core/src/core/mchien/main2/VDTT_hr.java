package core.mchien.main2;

public final class VDTT_hr extends VDTT_ae {
   private long a;
   private String[] b;
   private boolean c;
   private int d = 8;

   public VDTT_hr(String var1) {
      this.d(80, 20);
      boolean var2 = true;

      int var4;
      while(var2) {
         try {
            String var3 = var1.toLowerCase();
            var2 = false;
            var4 = 0;

            for(int var5 = 0; var5 < VDTT_in.g.length; ++var5) {
               int var6;
               if ((var6 = var3.indexOf(VDTT_in.g[var5].d)) >= 0) {
                  this.c = true;
                  ++var4;
                  if (var4 > 4) {
                     var6 = var1.toLowerCase().indexOf(VDTT_in.g[var5].d);
                     var1 = var1.substring(0, var6) + var1.substring(var6 + VDTT_in.g[var5].d.length(), var1.length());
                     var2 = true;
                     break;
                  }

                  var3 = var3.substring(0, var6) + var3.substring(var6 + VDTT_in.g[var5].d.length(), var3.length());
                  var5 = -1;
               }
            }
         } catch (Exception var7) {
            break;
         }
      }

      this.a = VDTT_jb.a();
      this.b = VDTT_dg.b(VDTT_dg.d, var1, this.q - 10);
      if ((var4 = VDTT_dg.a(VDTT_dg.b, this.b)) + 10 < this.q) {
         this.q = (short)(var4 + 10);
      }

      if (this.q < 0) {
         this.q = 0;
      }

      this.r = (short)(this.b.length * this.d + this.d);
      if (this.b.length * this.d + this.d > 20) {
         this.r = (short)(this.b.length * this.d + this.d);
      }

      if (this.c) {
         this.r = (short)(this.r + 5);
         this.q = (short)(this.q + 30);
      } else {
         this.q = (short)(this.q + 20);
      }

      if (this.q < 40) {
         this.q = 40;
      }

      if (this.r < 20) {
         this.r = 20;
      }

   }

   public final boolean a(int var1, int var2) {
      this.objX = (short)(var1 - this.q / 2);
      this.objY = (short)(var2 - this.r - 7);
      return VDTT_jb.a() - this.a > 10000L;
   }

   public final void a(Graphics var1) {
      int var2 = this.objX;
      int var3 = this.objY;
      int var4 = this.q;
      short var5 = this.r;
      int var6 = this.d;
      int var8;
      if (VDTT_cw.dK) {
         var1.f(-8492991);
         var2 -= 20;
         var3 -= 20;
         var4 += 40;
         var8 = var5 + 10;
         var1.c(var2, var3, var4, var8);
         var1.c(-8492991);
         VDTT_dc.a(var1, 381, 0, var2 + var4 / 2 + 3, var3 + var8 + 7, 33);
         var1.f();
         var6 += 2;
      } else {
         var1.c(-8492991);
         this.a(var1, var2, var3, var4, var5, -12, 380, -12);
         VDTT_dc.a(var1, 381, 0, var2 + var4 / 2 + 3, var3 + var5 + 7, 33);
         var1.f();
      }

      var3 = var3;
      if (this.c) {
         var3 += 2;
      }

      var8 = -1;

      for(int var7 = 0; var7 < this.b.length; ++var7) {
         var8 = VDTT_dg.d(VDTT_dg.c, var1, this.b[var7], var2 + var4 / 2, var3 + var6 + var7 * var6, 2, var8, 0);
      }

   }
}
