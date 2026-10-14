package core.mchien.main2;

import com.badlogic.gdx.Input.Keys;

final class VDTT_jo implements VDTT_u {
   // $FF: synthetic field
   final VDTT_hl a;
   // $FF: synthetic field
   final MenuConfig b;

   VDTT_jo(MenuConfig var1, VDTT_hl var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void a(VDTT_ca var1) {
   }

   public final void b(VDTT_ca var1) {
      MenuConfig.a(this.b, -1);
      if (var1.i().trim() != "") {
         char var2;
         if ((var2 = var1.i().toUpperCase().charAt(0)) < 'A' || var2 > 'Z') {
            VDTT_gt.b().a(Caption.pw, VDTT_dg.d, -2560);
            return;
         }

         short var5 = (short)Keys.valueOf(var1.i().toUpperCase());
         String var4 = var1.i().toUpperCase();

         for(int var3 = 0; var3 < MenuConfig.a(this.b).length; ++var3) {
            if (var3 != this.a.b && MenuConfig.a(this.b)[var3] == var5) {
               VDTT_gt.b().a(VDTT_jb.b(Caption.uA, var4), VDTT_dg.d, -65536);
               return;
            }
         }

         MenuConfig.a(this.b)[this.a.b] = var5;
         MenuConfig.b(this.b)[this.a.b].l = var4;
         MenuConfig.c(this.b);
         MenuConfig.d(this.b);
         VDTT_w.a();
         MenuConfig.a(this.b, -1);
      }

   }
}
