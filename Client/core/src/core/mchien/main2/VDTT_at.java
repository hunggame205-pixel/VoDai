package core.mchien.main2;

public final class VDTT_at implements Runnable {
   // $FF: synthetic field
   final VDTT_as a;

   public VDTT_at(VDTT_as var1) {
      this.a = var1;
   }

   public final void run() {
      if (VDTT_as.a(this.a) != null) {
         try {
            VDTT_as.b(this.a).setVolume(1.0F);
            VDTT_as.a(true);
            VDTT_as.b(this.a).writeSamples(VDTT_as.a(this.a), 0, VDTT_as.a(this.a).length);
            this.a.dispose();
            return;
         } catch (Exception var1) {
         }
      }

   }
}
