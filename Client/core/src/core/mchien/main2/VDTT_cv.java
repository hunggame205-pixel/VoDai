package core.mchien.main2;

final class VDTT_cv implements Runnable {
   public final void run() {
      Message var1 = null;
      boolean var5 = false;

      label60: {
         try {
            var5 = true;
            (var1 = Message.c((byte)-76)).a(VDTT_d.g().i);
            var1.c(DataCenter.d().u);
            var1.c(DataCenter.d().v);
            var1.k();
            var5 = false;
            break label60;
         } catch (Exception var6) {
            VDTT_jb.a(var6);
            var5 = false;
         } finally {
            if (var5) {
               if (var1 != null) {
                  var1.b();
               }

            }
         }

         if (var1 != null) {
            var1.b();
            return;
         }

         return;
      }

      var1.b();
   }
}
