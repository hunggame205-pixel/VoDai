package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import core.mchien.listener.LoginCallback;

final class VDTT_i implements LoginCallback {
   // $FF: synthetic field
   final VDTT_d a;

   VDTT_i(VDTT_d var1) {
      this.a = var1;
   }

   public final void a(String var1, String var2, String var3) {
      DataCenter.d().ai.h();
      DataCenter.d();
      if (DataCenter.c(var1)) {
         DataCenter.d().r();
      }

      this.a.i = var3;
      if (Gdx.app.getType() == ApplicationType.Desktop) {
         VDTT_cu.v();
      }

   }

   public final void a(String var1) {
      DataCenter.d().ai.h();
      if (var1 != null && !var1.isEmpty()) {
         if (!var1.toLowerCase().contains("json")) {
            DataCenter.d().ai.c(var1, -65536);
            return;
         }

         if (DataCenter.d().ai instanceof VDTT_cw) {
            VDTT_d.g();
            VDTT_d.n();
         }
      }

   }
}
