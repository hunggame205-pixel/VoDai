package core.mchien.main2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class VDTT_cz implements Runnable {
   // $FF: synthetic field
   final String a;
   // $FF: synthetic field
   final VDTT_cw b;

   VDTT_cz(VDTT_cw var1, String var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void run() {
      try {
         byte[] var1;
         if ((var1 = VDTT_jb.k(this.a)) != null) {
            short[] var2 = new short[var1.length / 2];
            ByteBuffer.wrap(var1).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(var2);
            VDTT_as var4 = new VDTT_as(var2);
            (new Thread(new VDTT_at(var4))).start();
         }

      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }
}
