package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import core.mchien.listener.SaveScreenShotListener;

public final class VDTT_j implements SaveScreenShotListener {
   // $FF: synthetic field
   final VDTT_d a;

   public VDTT_j(VDTT_d var1) {
      this.a = var1;
   }

   public final void a() {
      String var1 = Gdx.app.getType() == ApplicationType.Android ? Caption.vG : (Gdx.app.getType() == ApplicationType.iOS ? Caption.vF : Caption.vH);
      VDTT_gt.b().a(var1, VDTT_dg.d, -2560);
   }

   public final void b() {
      VDTT_gt.b().a(Caption.vI, VDTT_dg.d, -65536);
   }
}
