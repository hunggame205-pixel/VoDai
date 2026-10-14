package core.mchien.main2;

public final class VDTT_ct extends VDTT_ca {
   // $FF: synthetic field
   final VDTT_cq X;

   public VDTT_ct(VDTT_cq var1, int var2, int var3, int var4, String var5, MainScreen var6, int var7, int var8) {
      super(var2, var3, 122, var5, var6, -11, 0);
      this.X = var1;
   }

   public final void j() {
      VDTT_cq var10000 = this.X;
      String var2 = VDTT_cq.a(this.X).i();
      VDTT_cq var1 = var10000;

      for(int var3 = 0; var3 < var1.L.size(); ++var3) {
         String[] var4;
         if ((var4 = (String[])var1.L.elementAt(var3))[0].equals(var2)) {
            var1.K.a(var4[1]);
            return;
         }
      }

   }
}
