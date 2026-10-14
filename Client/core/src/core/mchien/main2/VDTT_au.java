package core.mchien.main2;

import com.badlogic.gdx.audio.AudioRecorder;
import com.badlogic.gdx.utils.Disposable;
import core.mchien.listener.VoiceRecordCallback;
import core.mchien.listener.VoiceRecordPermission;
import java.io.IOException;
import java.util.Arrays;

public final class VDTT_au implements Disposable {
   private final int f = 8000;
   AudioRecorder a;
   public static long b;
   public static String c = "";
   private int g;
   public boolean d;
   private static VDTT_au h;
   private static int i;
   VoiceRecordCallback e;

   public static boolean a() {
      if (i == 0) {
         boolean var0;
         if (var0 = VDTT_d.g().h.b()) {
            i = 1;
         } else {
            i = 2;
         }

         return var0;
      } else {
         return i == 1;
      }
   }

   public static VDTT_au b() {
      if (h == null) {
         h = new VDTT_au();
      }

      return h;
   }

   public final void c() {
      boolean var1 = false;
      boolean var6 = false;

      label107: {
         label102: {
            try {
               var6 = true;
               if (VDTT_cw.v().da <= 0L) {
                  var6 = false;
                  break label102;
               }

               if (VDTT_jb.a() - VDTT_cw.v().da >= 1000L) {
                  var1 = true;
                  this.g = (int)((VDTT_jb.a() - VDTT_cw.v().da) / 1000L) + 2;
                  this.d();
                  var6 = false;
                  break label102;
               }

               if (c.length() > 0) {
                  if (VDTT_d.g().h.b()) {
                     VDTT_cw.v().c(Caption.sN, -1);
                     var6 = false;
                  } else {
                     var6 = false;
                  }
               } else {
                  var6 = false;
               }
            } catch (Exception var7) {
               var6 = false;
               break label107;
            } finally {
               if (var6) {
                  if (!var1) {
                     this.g = 0;
                     this.d();
                  }

                  VDTT_cw.v().da = 0L;
                  VDTT_gr.a().c = true;
               }
            }

            this.g = 0;
            this.d();
            VDTT_cw.v().da = 0L;
            VDTT_gr.a().c = true;
            return;
         }

         if (!var1) {
            this.g = 0;
            this.d();
         }

         VDTT_cw.v().da = 0L;
         VDTT_gr.a().c = true;
         return;
      }

      if (!var1) {
         this.g = 0;
         this.d();
      }

      VDTT_cw.v().da = 0L;
      VDTT_gr.a().c = true;
   }

   public final void dispose() {
      try {
         h = null;
         if (this.a != null) {
            this.a.dispose();
         }

      } catch (Exception var1) {
      }
   }

   private void d() {
      try {
         this.d = false;
         if (this.a != null) {
            //todo fix record tại đây
//            this.a.stop();
         } else {
            this.dispose();
         }
      } catch (Exception var1) {
      }
   }

   public static void a(boolean var0, String var1) {
      c = var1;
      b = VDTT_jb.a();
      a(var0);
   }

   public static void a(boolean var0) {
      if (h != null) {
         h.dispose();
      }

      b().b(var0);
   }

   private void b(boolean var1) {
      if (VDTT_cw.v().da != 0L) {
         try {
            VDTT_d.g().h.a((VoiceRecordPermission)(new VDTT_ax(this, var1)));
         } catch (Exception var3) {
            VDTT_cw.v().c(Caption.sP, -65536);
            this.dispose();
         }
      }
   }

   // $FF: synthetic method
   static void a(VDTT_au var0, short[] var1, boolean var2) {
      var2 = var2;
      var1 = var1;
      var0 = var0;

      try {
         if (var2) {
            var0.d = false;
            var1 = Arrays.copyOf(var1, 8000 * var0.g);
            if (var0.e != null) {
               var0.e.a(var1);
               return;
            }
         }

         var0.dispose();
      } catch (Exception var3) {
      }
   }

   // $FF: synthetic method
   static AudioRecorder a(VDTT_au var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static boolean b(VDTT_au var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static boolean a(VDTT_au var0, boolean var1) {
      return var0.d = false;
   }

   // $FF: synthetic method
   static int c(VDTT_au var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static void b(VDTT_au var0, boolean var1)throws IOException{
      boolean var2 = var1;
      Message var3;
      (var3 = Message.c((byte)-29)).a(var2);
      var3.l();
   }
}
