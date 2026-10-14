package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.audio.AudioDevice;
import com.badlogic.gdx.utils.Disposable;

public final class VDTT_as implements Disposable {
   private final int a = 8000;
   private final AudioDevice b;
   private final short[] c;
   private static VDTT_as d;
   private static boolean e;

   public VDTT_as(short[] var1) {
      d = this;
      this.b = Gdx.audio.newAudioDevice(8000, true);
      this.c = var1;
   }

   public static VDTT_as a() {
      return d;
   }

   public static boolean b() {
      //todo fix record tại đây
      return e;
//      return Gdx.app.getType() == ApplicationType.iOS ? d.b.isPlaying() : e;
   }

   public final void dispose() {
      try {
         if (Gdx.app.getType() != ApplicationType.iOS) {
            e = false;
            if (this.b != null) {
               this.b.dispose();
            }
         }

      } catch (Exception var1) {
      }
   }

   // $FF: synthetic method
   static short[] a(VDTT_as var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static AudioDevice b(VDTT_as var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static boolean a(boolean var0) {
      e = true;
      return true;
   }
}
