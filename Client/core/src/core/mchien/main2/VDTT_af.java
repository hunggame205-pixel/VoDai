package core.mchien.main2;

final class VDTT_af implements Runnable {
   public final void run() {
      while(true) {
         try {
            while(true) {
               synchronized(VDTT_ae.v) {
                  try {
                     VDTT_ae.v.wait(3600000L);
                  } catch (Exception var4) {
                     VDTT_jb.a(var4);
                  }
               }

               while(VDTT_ae.y.size() > 0) {
                  VDTT_ae.a((VDTT_en)VDTT_ae.y.remove(0));
               }

               synchronized(VDTT_ae.x) {
                  VDTT_ae.x.notify();
               }
            }
         } catch (Exception var6) {
            VDTT_jb.a(var6);
         }
      }
   }
}
