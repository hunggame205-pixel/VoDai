package core.mchien.main2;

final class VDTT_dk implements Runnable {
   // $FF: synthetic field
   final boolean a;
   // $FF: synthetic field
   final DataCenter b;

   VDTT_dk(DataCenter var1, boolean var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void run() {
      VDTT_dg.a();
      this.b.b(this.a);
   }
}
