package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import core.mchien.listener.VoiceRecordPermission;

final class VDTT_ax implements VoiceRecordPermission {
   // $FF: synthetic field
   final boolean a;
   // $FF: synthetic field
   final VDTT_au b;

   VDTT_ax(VDTT_au var1, boolean var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void a() {
      VDTT_au var10000 = VDTT_au.b();
      VDTT_ay var2 = new VDTT_ay(this);
      VDTT_au var1 = var10000;
      if (!var10000.d) {
         var1.a = Gdx.audio.newAudioRecorder(8000, true);
         var1.e = var2;
         var1.d = true;
         (new Thread(new VDTT_av(var1))).start();
      }

   }
}
