package core.mchien.main2;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;

public final class VDTT_ao extends SpriteBatch {
   ShaderProgram a;
   protected int b;
   protected int c;
   private float d;
   private float e;

   public final void a(int var1) {
      this.end();
      this.begin();
      this.a.setUniformf(this.b, this.d + (float)var1 / 100.0F);
      this.a.setUniformf(this.c, this.e);
   }

   public final void a() {
      this.end();
      this.begin();
      this.a.setUniformf(this.b, this.d);
      this.a.setUniformf(this.c, this.e);
   }
}
