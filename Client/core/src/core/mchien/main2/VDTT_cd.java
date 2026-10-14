package core.mchien.main2;

final class VDTT_cd implements Runnable {
   // $FF: synthetic field
   final String a;
   // $FF: synthetic field
   final VDTT_cc b;

   VDTT_cd(VDTT_cc var1, String var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void run() {
      try {
         String[] var1 = this.a.split("\r\n");
         VDTT_cc.a(this.b).clear();

         for(int var2 = 0; var2 < var1.length; ++var2) {
            VDTT_cc.a(this.b).addElement(var1[var2]);
         }

         VDTT_cc.a(this.b, new VDTT_hs((byte)1, 5, 30, this.b.q - 10, 120, 12, VDTT_cc.a(this.b).size()));
         VDTT_cc.b(this.b, new VDTT_hs((byte)1, VDTT_cc.b(this.b).objX, VDTT_cc.b(this.b).objY, VDTT_cc.b(this.b).q, VDTT_cc.b(this.b).r, VDTT_cc.b(this.b).r, 1));
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }
}
