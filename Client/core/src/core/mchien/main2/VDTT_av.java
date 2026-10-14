package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import java.util.Vector;

final class VDTT_av implements Runnable {
   // $FF: synthetic field
   final VDTT_au a;

   VDTT_av(VDTT_au var1) {
      this.a = var1;
   }

   public final void run() {
      try {
         if (Gdx.app.getType() != ApplicationType.iOS) {
            Vector var1 = new Vector();
            int var2 = 0;

            short[] var3;
            while(VDTT_au.b(this.a)) {
               try {
                  if (VDTT_cw.v().da == 0L) {
                     VDTT_au.a(this.a, false);
                     break;
                  }

                  var3 = new short[4000];
                  VDTT_au.a(this.a).read(var3, 0, 4000);
                  var1.add(var3);
                  var2 += 4000;
               } catch (Exception var6) {
               }
            }

            var3 = new short[var2];
            var2 = 0;

            for(int var4 = 0; var4 < var1.size(); ++var4) {
               for(int var5 = 0; var5 < ((short[])var1.get(var4)).length; ++var5) {
                  var3[var2] = ((short[])var1.get(var4))[var5];
                  ++var2;
               }
            }

            VDTT_au.a(this.a, var3, true);
            return;
         }

         //todo fix record tại đây
//         VDTT_au.a(this.a).read(new VDTT_aw(this));
      } catch (Exception var7) {
      }

   }
}
