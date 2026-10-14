package core.mchien.main2;

final class VDTT_lp implements Runnable {
   // $FF: synthetic field
   final String a;
   // $FF: synthetic field
   final VDTT_lo b;

   VDTT_lp(VDTT_lo var1, String var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void run() {
      String var1 = "mapsmall/" + VDTT_cw.v().ai + ".png";
      StringBuilder var10000 = (new StringBuilder()).append(DataCenter.d().linkResources).append(DataCenter.d().Img_Zoom);
      DataCenter.d();
      byte[] var2;
      if ((var2 = VDTT_da.b(var10000.append(DataCenter.a(var1) + 1).append("/").append(var1).toString())) != null) {
         VDTT_da.a(this.a, var2);
         VDTT_lo.a(VDTT_v.b(VDTT_jb.a(var2)));
      }

   }
}
