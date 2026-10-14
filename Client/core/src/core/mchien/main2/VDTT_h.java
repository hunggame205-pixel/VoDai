package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import core.mchien.listener.LogoutCallback;

final class VDTT_h implements LogoutCallback {
   // $FF: synthetic field
   final VDTT_d a;

   VDTT_h(VDTT_d var1) {
      this.a = var1;
   }

   public final void a() {
      VDTT_d var10000 = VDTT_d.g();
      VDTT_cf var2 = null;
      var10000.i = null;
      if (Gdx.app.getType() == ApplicationType.Desktop) {
         DataCenter var3 = DataCenter.d();
         var2 = VDTT_cq.w();
         var3.ai = var2;
      } else {
         VDTT_d.g().k();
      }
   }
}
