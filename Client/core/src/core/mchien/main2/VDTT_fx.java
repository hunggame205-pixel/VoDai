package core.mchien.main2;

public final class VDTT_fx extends VDTT_n {
   public short k;
   public short l;
   public short m;
   public short n;
   public short o;
   public short p;
   public int I;
   private String[] M = null;
   public int J = 0;
   public int K = 0;
   public int L;

   public VDTT_fx(int var1, int var2) {
      this.f(0, 0);
   }

   public final void a(short var1, short var2, short var3, short var4, short var5, short var6, short var7, short var8) {
      this.k = var1;
      this.l = var2;
      this.m = (short)(var3 - 5);
      this.n = (short)(var4 - 5);
      this.o = (short)(var5 + 5);
      this.p = (short)(var6 + 5);
      this.f(var3 + (var5 - var3) / 2, var6);
      String var9;
      if ((var9 = DataCenter.d().H[var2].b).length() <= 11) {
         this.M = new String[]{var9};
      } else {
         this.M = VDTT_dg.a(var9, 2);
      }

      this.J = var7;
      this.K = var8;
   }

   public final void a(short var1, short var2, short var3, short var4, short var5, short var6) {
      this.k = var1;
      this.l = var2;
      this.m = var3;
      this.n = var4;
      this.o = var5;
      this.p = var6;
      this.f(var3 + (var5 - var3) / 2, var4 + (var6 - var4) / 2);
   }

   public final void a(Graphics var1) {
      XYEntity var2;
      if ((var2 = VDTT_ek.b(this.objX, this.objY)) != null && (this.k != 58 || this.objY >= 80)) {
         this.objY = var2.objY;
      }

      int var6 = this.objX - 3;
      if (this.I > 0) {
         if (this.I % 2 == 0) {
            var1.a(1.2F, 0.5F);
         }

         --this.I;
      }

      if (this.k != 48 && this.k != 50) {
         String var4;
         int var5;
         if (this.k == 56) {
            var6 = this.objX - 30;
            int var3 = this.objY - 78;
            var4 = "";

            for(var5 = 0; var5 < this.M.length; ++var5) {
               var4 = var4 + this.M[var5];
               if (var5 < this.M.length - 1) {
                  var4 = var4 + " ";
               }
            }

            VDTT_aa.a(var1, -5, 0, var6 - 45, var3, 85, (int)20);
            VDTT_dg.b(VDTT_dg.d, var1, var4, var6, var3 + 10, 2, -6488, -11184811);
         } else if (this.k == 58 && this.objY < 80) {
            var6 = this.objX - 5;
            var4 = "";

            for(var5 = 0; var5 < this.M.length; ++var5) {
               var4 = var4 + this.M[var5];
               if (var5 < this.M.length - 1) {
                  var4 = var4 + " ";
               }
            }

            VDTT_aa.a(var1, -5, 0, 248, 0, 90, (int)30);
            VDTT_dg.b(VDTT_dg.d, var1, var4, var6 + 5, 12, 2, -6488, -11184811);
         } else {
            if (this.objX < 300) {
               var6 = this.objX + 4;
               VDTT_dc.a(var1, 29, -360, this.objX + 5, this.objY, 33);
            } else {
               VDTT_dc.a(var1, 29, 0, this.objX, this.objY, 33);
            }

            if (this.M.length > 1) {
               VDTT_dg.b(VDTT_dg.d, var1, this.M[0], var6 + 2, this.objY - 48, 2, -6488, -11184811);
               VDTT_dg.b(VDTT_dg.d, var1, this.M[1], var6 + 2, this.objY - 38, 2, -6488, -11184811);
            } else {
               VDTT_dg.b(VDTT_dg.d, var1, this.M[0], var6 + 2, this.objY - 43, 2, -6488, -11184811);
            }
         }

         var1.r();
      }
   }

   public final int a() {
      return this.objX - 28;
   }

   public final int b() {
      return this.objX + 32;
   }

   public final int c() {
      return this.objY - 54;
   }

   public final int d() {
      return this.objY - 31;
   }

   public final void b(Graphics var1) {
   }

   public final String f() {
      return null;
   }

   public final String g() {
      return null;
   }

   public final int e() {
      return this.objY < 100 ? 3 : 4;
   }
}
