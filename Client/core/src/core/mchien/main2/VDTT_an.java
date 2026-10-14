package core.mchien.main2;

public abstract class VDTT_an extends VDTT_m {
   public static VDTT_hs[] a(VDTT_ba[] var0) {
      VDTT_hs[] var1 = new VDTT_hs[var0.length];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var0[var2] != null) {
            var1[var2] = new VDTT_hs((byte)1, var0[var2].objX, var0[var2].objY, var0[var2].q, var0[var2].r, var0[var2].r, 1);
         }
      }

      return var1;
   }

   public final void a(Graphics var1, VDTT_ba[] var2, int var3, int var4) {
      for(int var5 = 0; var5 < var2.length; ++var5) {
         if (var2[var5] != null) {
            this.a(var1, var3, var4);
            var1.a(var2[var5].objX, var2[var5].objY);
            var2[var5].b(var1);
         }
      }

   }

   public static void a(VDTT_ba[] var0, VDTT_hs[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var0[var2] != null) {
            var1[var2].a();
            if (var1[var2].l != -1) {
               var0[var2].N = true;
            } else {
               var0[var2].N = false;
            }
         }
      }

   }

   public final void c(Graphics var1) {
      this.a(var1, 0, 0, this.q, this.r, 61, 22, 23, 1, 1);
   }

   public final void e(Graphics var1) {
      this.a(var1, 0, 0, this.q, this.r, -11, 22, 23, 1, 1);
   }
}
