package core.mchien.main2;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import java.util.Vector;

public final class VDTT_bd extends VDTT_m {
   public String l;
   private int J;
   public boolean m;
   private short K = 8;
   public boolean n;
   public boolean I;

   public VDTT_bd(int var1, int var2, String var3, MainScreen var4, int var5) {
      this.l = var3;
      this.a = var4;
      this.J = var5;
      this.f(var1, var2);
      this.c(false);
   }

   public final void a(String var1) {
      this.l = var1;
      this.c(this.I);
   }

   private void c(boolean var1) {
      this.I = var1;
      if (this.a instanceof VDTT_bj) {
         if (var1) {
            this.d(20 + Graphics.a(5, this.l) / DataCenter.d().r, 16);
         } else {
            this.d(20 + Graphics.a(0, this.l) / DataCenter.d().r, 16);
         }
      } else if (var1) {
         this.d(20 + VDTT_dg.b(VDTT_dg.b, this.l), 16);
      } else {
         this.d(20 + VDTT_dg.b(VDTT_dg.d, this.l), 16);
      }
   }

   public final void a(boolean var1) {
      this.c = var1;
   }

   public final void b(boolean var1) {
      this.d = var1;
   }

   public final void a_() {
   }

   public final void b(Graphics var1) {
      if (!this.d) {
         short var2 = this.K;
         if (this.d()) {
            var1.e(30);
         } else if (this.c) {
            var1.p();
         }

         VDTT_dc.a(var1, var2, 0, 0, 0, 20);
         if (this.d()) {
            var1.h();
         } else if (this.c) {
            var1.r();
         }

         BitmapFont var3;
         if (this.I) {
            var3 = Graphics.a(5);
         } else {
            var3 = Graphics.a(0);
         }

         if (this.d()) {
            VDTT_dg.a((BitmapFont)var3, var1, this.l, 21, 8, 0, -1, -16777216);
         } else if (this.c) {
            VDTT_dg.a((BitmapFont)var3, var1, this.l, 20, 7, 0, -4868683, -16777216);
         } else {
            VDTT_dg.a((BitmapFont)var3, var1, this.l, 20, 7, 0, -1, -16777216);
         }

         if (this.m) {
            if (this.c) {
               var1.p();
            }

            VDTT_dc.a(var1, 9, 0, 2, 3, 20);
            if (this.c) {
               var1.r();
            }
         }

      }
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (!this.c && !this.d) {
         this.m = !this.m;
         this.a.a(var1.b, this.m, this);
         VDTT_ac.b().n();
      }
   }

   public final Vector g() {
      Vector var1 = new Vector();
      if (!this.c && !this.d) {
         var1.addElement(new VDTT_hl(this.J, 0, 0, this.q, this.r, (VDTT_hs)null, this));
      }

      return var1;
   }

   private boolean d() {
      if (!this.c && !this.d) {
         return this.n ? true : this.e(0);
      } else {
         return false;
      }
   }
}
