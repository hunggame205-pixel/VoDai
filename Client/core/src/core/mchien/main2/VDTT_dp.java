package core.mchien.main2;

final class VDTT_dp implements Runnable {
   // $FF: synthetic field
   final VDTT_dn a;

   VDTT_dp(VDTT_dn var1) {
      this.a = var1;
   }

   public final void run() {
      try {
         synchronized(this.a.i) {
            try {
               this.a.i.wait(20000L);
            } catch (Exception var3) {
            }
         }

         if (this.a.c) {
            this.a.b();
         }

      } catch (Exception var5) {
         Thread.currentThread().interrupt();
      }
   }
}
