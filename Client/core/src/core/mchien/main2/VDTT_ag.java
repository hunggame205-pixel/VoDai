package core.mchien.main2;

final class VDTT_ag implements Runnable {
   public final void run() {
      while(true) {
         try {
            while(true) {
               synchronized(VDTT_ae.w) {
                  try {
                     VDTT_ae.w.wait(3600000L);
                  } catch (Exception var4) {
                     VDTT_jb.a(var4);
                  }
               }

               while(VDTT_ae.z.size() > 0) {
                  VDTT_ae.a((VDTT_en)VDTT_ae.z.remove(0));
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
