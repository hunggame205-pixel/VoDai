package core.mchien.main2;

final class VDTT_s implements Runnable {
   // $FF: synthetic field
   final VDTT_r a;

   VDTT_s(VDTT_r var1) {
      this.a = var1;
   }

   public final void run() {
      try {
         while(VDTT_r.a(this.a)) {
            VDTT_r.a(this.a, false);
         }

      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }
}
