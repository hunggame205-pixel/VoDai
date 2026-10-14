package core.mchien.main2;

import com.badlogic.gdx.audio.AudioRecorder;

final class VDTT_aw implements AudioRecorder {
   // $FF: synthetic field
   final VDTT_av a;

   VDTT_aw(VDTT_av var1) {
      this.a = var1;
   }

   public final void didFinishRecording(short[] var1, boolean var2) {
      VDTT_au.a(this.a.a, var1, var2);
   }

   @Override
   public void read(short[] samples, int offset, int numSamples) {

   }

   @Override
   public void dispose() {

   }

   
   public void stop() {

   }
//
//   @Override
//   public void read(AudioRecorderDataDelegate audioRecorderDataDelegate) {
//
//   }

//   @Override
//   public void read(AudioRecorderDataDelegate audioRecorderDataDelegate) {
//
//   }


}
