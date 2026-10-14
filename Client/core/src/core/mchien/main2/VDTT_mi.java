package core.mchien.main2;

final class VDTT_mi implements Runnable {
   // $FF: synthetic field
   final VDTT_mh a;

   VDTT_mi(VDTT_mh var1) {
      this.a = var1;
   }

   public final void run() {
      VDTT_ia var1 = VDTT_mh.a(this.a)[VDTT_mh.b(this.a).b.b];

      for(int var2 = 0; var2 < var1.b.length; ++var2) {
         VDTT_hz var3;
         if (VDTT_jb.b((var3 = var1.b[var2]).c, var3.d)) {
            var3.f = Caption.nJ;
         } else {
            var3.f = Caption.nI;
         }
      }

   }
}
