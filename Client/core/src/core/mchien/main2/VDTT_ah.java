package core.mchien.main2;

final class VDTT_ah implements Runnable {
   public final void run() {
      while(true) {
         try {
            synchronized(VDTT_ae.x) {
               try {
                  VDTT_ae.x.wait(3600000L);
               } catch (Exception var3) {
                  VDTT_jb.a(var3);
               }
            }

            while(VDTT_ae.A.size() > 0) {
               VDTT_ae.b((VDTT_en)VDTT_ae.A.remove(0));
            }
         } catch (Exception var5) {
            VDTT_jb.a(var5);
         }
      }
   }
}
