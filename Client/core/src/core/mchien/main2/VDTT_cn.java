package core.mchien.main2;

final class VDTT_cn implements Runnable {
   // $FF: synthetic field
   final VDTT_en a;
   // $FF: synthetic field
   final VDTT_cm b;

   VDTT_cn(VDTT_cm var1, VDTT_en var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void run() {
      try {
         byte[] var1;
         if ((var1 = VDTT_da.c(DataCenter.d().linkCheckData + this.a.d)) == null) {
            VDTT_cm.a(this.b);
         } else {
            if (!VDTT_da.g("arr_savemap")) {
               VDTT_da.a(this.a.e, var1);
            }

            VDTT_da.b("arr_check_" + this.a.a, var1.length);
            DataCenter.d().b(true);
            this.a.f = true;
            VDTT_cm.b(this.b);
         }
      } catch (Exception var3) {
         VDTT_jb.a(var3);
         DataCenter var10000 = DataCenter.d();
         VDTT_cm var2 = new VDTT_cm();
         var10000.ai = var2;
      }
   }
}
