package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Input.TextInputListener;
import com.badlogic.gdx.utils.StringBuilder;

final class VDTT_ab implements TextInputListener {
   // $FF: synthetic field
   final VDTT_ca a;

   VDTT_ab(VDTT_ca var1) {
      this.a = var1;
   }

   public final void input(String var1) {
      VDTT_aa.a(false);
      if (Gdx.app.getType() == ApplicationType.Android && !var1.equals(this.a.i())) {
         StringBuilder var4 = new StringBuilder();

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            int var3 = -1;
            int var2 = -1;

            int var6;
            for(var6 = 0; var6 < VDTT_aa.b().length; ++var6) {
               if (var1.charAt(var5) == VDTT_aa.b()[var6]) {
                  var2 = var6;
                  break;
               }
            }

            try {
               if (var2 >= 0) {
                  for(var6 = 0; var6 < VDTT_aa.c().length; ++var6) {
                     if (var1.charAt(var5 + 1) == VDTT_aa.c()[var6]) {
                        var3 = var6;
                     }
                  }
               }

               if (var2 != -1 && var3 != -1) {
                  var4.append(VDTT_aa.d()[var2][var3]);
                  ++var5;
               } else {
                  var4.append(var1.charAt(var5));
               }
            } catch (Exception var8) {
               var4.append(var1.charAt(var1.length() - 1));
            }
         }

         var1 = var4.toString();
      }

      this.a.a(var1);
      if (this.a.V) {
         VDTT_cw.v();
         VDTT_ca var9 = this.a;

         try {
            if ((var1 = var9.i()).length() > 0) {
               var9.a("");
               VDTT_cw.a(var1);
            }

            return;
         } catch (Exception var7) {
            VDTT_jb.a(var7);
         }
      }

   }

   public final void canceled() {
      VDTT_aa.a(false);
   }
}
