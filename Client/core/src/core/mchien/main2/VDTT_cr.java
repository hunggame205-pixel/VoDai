package core.mchien.main2;

final class VDTT_cr implements Runnable {
   // $FF: synthetic field
   final VDTT_cq a;

   VDTT_cr(VDTT_cq var1) {
      this.a = var1;
   }

   public final void run() {
      String var1 = VDTT_cq.y().J.i();
      DataCenter.d();
      if (DataCenter.c(var1)) {
         DataCenter.d().r();
      } else {
         DataCenter.d().a = DataCenter.d().aC.c;
         DataCenter.d().b = DataCenter.d().aC.d;
      }

      Message var8 = null;
      boolean var5 = false;

      label70: {
         try {
            var5 = true;
            (var8 = Message.c((byte)-127)).a(VDTT_cq.a(this.a).i());
            var8.a(VDTT_cq.b(this.a).i());
            var8.c(DataCenter.d().u);
            var8.c(DataCenter.d().v);
            var8.a(VDTT_cq.c(this.a));
            var8.k();
            var5 = false;
            break label70;
         } catch (Exception var6) {
            VDTT_jb.a(var6);
            var5 = false;
         } finally {
            if (var5) {
               if (var8 != null) {
                  var8.b();
               }

            }
         }

         if (var8 != null) {
            var8.b();
            return;
         }

         return;
      }

      var8.b();
   }
}
