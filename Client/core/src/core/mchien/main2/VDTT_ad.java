package core.mchien.main2;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.viewport.Viewport;

public final class VDTT_ad extends Viewport {
   private Scaling a;
   private int b;

   public VDTT_ad(Scaling var1, float var2, float var3, Camera var4) {
      this.a = var1;
      this.setWorldSize(var2, var3);
      this.setCamera(var4);
   }

   public final void update(int var1, int var2, boolean var3) {
      Vector2 var4;
      int var5 = Math.round((var4 = this.a.apply(this.getWorldWidth(), this.getWorldHeight(), (float)var1, (float)var2)).x);
      int var6 = Math.round(var4.y);
      var1 = this.getScreenX() + (var1 - var5) / 2;
      var2 = (var2 - var6) / 2;
      if (this.b > 0) {
         var1 = this.b;
      }

      super.setScreenBounds(var1, var2, var5, var6);
      this.apply(var3);
   }

   public final void setScreenBounds(int var1, int var2, int var3, int var4) {
      super.setScreenBounds(var1, var2, var3, var4);
   }
}
