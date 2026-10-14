package core.mchien.main2;

final class VDTT_dr extends Thread {
   // $FF: synthetic field
   final VDTT_dn a;

   VDTT_dr(VDTT_dn var1) {
      this.a = var1;
   }

   public final void run() {
      while(this.a.b) {
         try {
            if (this.a.f != null) {
               boolean var1 = false;
               this.a.o = false;
               VDTT_dn.a(this.a, this.a.f, false);
            } else {
               VDTT_jb.a(500L);
            }
         } catch (Exception var2) {
            this.a.b();
            Thread.currentThread().interrupt();
         }
      }

   }
}
