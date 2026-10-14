package core.mchien.main2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class VDTT_az implements Runnable {
   // $FF: synthetic field
   final short[] a;
   // $FF: synthetic field
   final VDTT_ay b;

   VDTT_az(VDTT_ay var1, short[] var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void run() {
      try {
         if (VDTT_au.c.length() != 0 && VDTT_au.c(this.b.a.b) != 0) {
            byte[] var1;
            ByteBuffer.wrap(var1 = new byte[this.a.length * 2]).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().put(this.a);
            if (VDTT_jb.a(var1, VDTT_au.c)) {
               VDTT_au.b(this.b.a.b, this.b.a.a);
            } else {
               VDTT_jb.a(1000L);
               if (VDTT_jb.a(var1, VDTT_au.c)) {
                  VDTT_au.b(this.b.a.b, this.b.a.a);
               }
            }

            VDTT_au.c = "";
            return;
         }
      } catch (Exception var4) {
         return;
      } finally {
         this.b.a.b.dispose();
      }

   }
}
