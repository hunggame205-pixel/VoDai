package core.mchien.main2;

import java.util.Vector;

public final class VDTT_bj extends VDTT_am {
   public VDTT_z a;
   private VDTT_bd[] b;
   private boolean[] c;

   public final void b(Graphics var1) {
      var1.f(-11184811);
      var1.c(2, 19, this.q - 3, this.r - 29);
      var1.f(-10275328);
      var1.b(6, 23, this.q - 12, this.r - 38);
      this.a(var1, this.objX + 4, this.objY + this.f());
      if (this.b.length > 1) {
         VDTT_dg.a(var1, Caption.vA, this.q / 2, 15, 2, -1);
      } else {
         VDTT_dg.a(var1, Caption.vE, this.q / 2, 15, 2, -1);
      }
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (var1.b >= 2000 && var1.b <= 3000) {
         for(int var4 = 0; var4 < this.b.length; ++var4) {
            if (this.b[var4] != null) {
               this.c[var4] = this.b[var4].m;
            }
         }

         VDTT_da.a("download_full", true);
         this.k();
         this.a.a(var1, var2, var3);
      }
   }

   public final Vector g() {
      return super.g();
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void a_() {
   }
}
