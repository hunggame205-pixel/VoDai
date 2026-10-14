package core.mchien.main2;

import java.util.Arrays;

final class VDTT_dq implements Runnable {
   // $FF: synthetic field
   final VDTT_dn a;

   VDTT_dq(VDTT_dn var1) {
      this.a = var1;
   }

   public final void run() {
      int var2 = 0;

      while(this.a.b) {
         try {
            boolean var1 = false;
            this.a.n = false;

            while(this.a.g.size() > 0) {
               byte[] var8 = (byte[])this.a.g.firstElement();
               this.a.g.removeElement(var8);

               try {
        //          System.out.println(Arrays.toString(var8));
                  this.a.e.a(var8);
                  this.a.e.b.flush();
                  VDTT_dn var10000 = this.a;
                  var10000.k += var8.length;
                  var2 = 0;
               } catch (Exception var6) {
                  ++var2;
                  Thread.sleep(2000L);
               }
            }

            if (var2 == 15) {
               this.a.b();
               Thread.currentThread().interrupt();
               return;
            }

            synchronized(this.a.h) {
               try {
                  this.a.h.wait(3600000L);
               } catch (Exception var4) {
                  VDTT_jb.a(var4);
               }
            }
         } catch (Exception var7) {
            this.a.b();
            Thread.currentThread().interrupt();
         }
      }

   }
}
