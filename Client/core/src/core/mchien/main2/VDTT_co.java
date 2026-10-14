package core.mchien.main2;

final class VDTT_co implements Runnable {
   // $FF: synthetic field
   final VDTT_en a;
   // $FF: synthetic field
   final VDTT_cm b;

   VDTT_co(VDTT_cm var1, VDTT_en var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void run() {
      try {
         StringBuilder var4 = (new StringBuilder()).append(DataCenter.d().linkResources).append(DataCenter.d().Img_Zoom);
         DataCenter.d();
         byte[] var1;
         if ((var1 = VDTT_da.c(var4.append(DataCenter.a(this.a.d) + 1).append("/").append(this.a.d).toString())) == null) {
            VDTT_cm.a(this.b);
         } else {
            VDTT_da.a(var1, false);
            if (this.a.d.contains("font")) {
               VDTT_dg.a();
            }

            VDTT_da.b("arr_check_" + this.a.a, var1.length);
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
