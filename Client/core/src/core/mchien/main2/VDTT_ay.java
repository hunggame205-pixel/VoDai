package core.mchien.main2;

import core.mchien.listener.VoiceRecordCallback;

final class VDTT_ay implements VoiceRecordCallback {
   // $FF: synthetic field
   final VDTT_ax a;

   VDTT_ay(VDTT_ax var1) {
      this.a = var1;
   }

   public final void a(short[] var1) {
      if (var1 != null) {
         (new Thread(new VDTT_az(this, var1))).start();
      }

   }
}
