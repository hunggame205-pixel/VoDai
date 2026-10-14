package core.mchien.main2;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Pixmap.Blending;
import com.badlogic.gdx.graphics.Pixmap.Format;

public final class VDTT_v {
   Texture a;
   public Pixmap b;
   public int c;
   public int d;
   public long e = System.currentTimeMillis();
   public static int f = 0;
   public static int g = 0;

   public static VDTT_v a(byte[] var0) {
      try {
         VDTT_v var1;
         (var1 = new VDTT_v()).b = new Pixmap(var0, 0, var0.length);
         var1.e();
         return var1;
      } catch (Exception var2) {
       //  VDTT_jb.a(var2);
         return null;
      }
   }

   public static VDTT_v b(byte[] var0) {
      try {
         VDTT_v var1;
         (var1 = new VDTT_v()).b = new Pixmap(var0, 0, var0.length);
         var1.e();
         VDTT_r.i.add(var1);
         ++f;
         return var1;
      } catch (Exception var2) {
       //  VDTT_jb.a(var2);
         return null;
      }
   }

   public static VDTT_v a(int var0, int var1) {
      try {
         VDTT_v var2;
         (var2 = new VDTT_v()).b = new Pixmap(var0, var1, Format.RGBA8888);
         var2.e();
         ++f;
         return var2;
      } catch (Exception var3) {
         VDTT_jb.a(var3);
         return null;
      }
   }

   public final void a() {
      try {
         if (!this.equals(VDTT_dc.a)) {
            if (this.b != null) {
               this.b.dispose();
               this.b = null;
               --f;
            }

            if (this.a != null) {
               VDTT_r.h.add(this.a);
               this.a = null;
            }

         }
      } catch (Exception var1) {
      }
   }

   public final boolean b() {
      return this.a == null && this.b == null;
   }

   private void e() {
      this.c = this.b.getWidth();
      this.d = this.b.getHeight();
   }

   public final Texture c() {
      try {
         this.d();
         this.e = System.currentTimeMillis();
         return this.a;
      } catch (Exception var1) {
         return null;
      }
   }

   public static void a(Texture var0) {
      try {
         var0.dispose();
         --g;
      } catch (Exception var1) {
      }
   }

   public final boolean d() {
      try {
         if (this.equals(VDTT_dc.a)) {
            return false;
         }

         if (this.b != null) {
            if (this.a == null) {
               this.a = new Texture(this.b);
               this.e = System.currentTimeMillis();
               ++g;
            }

            this.b.dispose();
            this.b = null;
            --f;
            return true;
         }
      } catch (Exception var1) {
      }

      return false;
   }

   public static VDTT_v a(VDTT_v var0, int var1, int var2, int var3, int var4, int var5) {
      var1 = 0;
      var2 = 0;
      VDTT_v var6 = null;

      try {
         if (var5 == 0) {
            VDTT_aa.a((var6 = a(var3, var4)).b, var0, 0, 0, 0, 0, var3, var4, Blending.None);
            VDTT_v var13 = var6;
            return var13;
         }

         int var7;
         if (var5 == -360) {
            var6 = a(var3, var4);

            for(var5 = 0; var5 < var4; ++var5) {
               for(var7 = var3 - 1; var7 >= 0; --var7) {
                  VDTT_aa.a(var6, var1, var2, var0.b.getPixel(0 + var7, 0 + var5));
                  ++var1;
               }

               var1 = 0;
               ++var2;
            }
         } else if (var5 == -180) {
            var6 = a(var3, var4);

            for(var5 = 0; var5 < var4; ++var5) {
               for(var7 = 0; var7 < var3; ++var7) {
                  VDTT_aa.a(var6, var1, var2, var0.b.getPixel(0 + var7, 0 + var4 - 1 - var5));
                  ++var1;
               }

               var1 = 0;
               ++var2;
            }
         } else if (var5 == 180) {
            var6 = a(var3, var4);

            for(var5 = 0; var5 < var4; ++var5) {
               for(var7 = 0; var7 < var3; ++var7) {
                  VDTT_aa.a(var6, var1, var2, var0.b.getPixel(0 + var3 - 1 - var7, 0 + var4 - 1 - var5));
                  ++var1;
               }

               var1 = 0;
               ++var2;
            }
         } else if (var5 == 270) {
            var6 = a(var4, var3);

            for(var5 = 0; var5 < var3; ++var5) {
               for(var7 = 0; var7 < var4; ++var7) {
                  VDTT_aa.a(var6, var1, var2, var0.b.getPixel(0 + var3 - 1 - var5, 0 + var7));
                  ++var1;
               }

               var1 = 0;
               ++var2;
            }
         } else if (var5 == -270) {
            var6 = a(var4, var3);

            for(var5 = 0; var5 < var3; ++var5) {
               for(var7 = 0; var7 < var4; ++var7) {
                  VDTT_aa.a(var6, var1, var2, var0.b.getPixel(0 + var3 - 1 - var5, 0 + var4 - 1 - var7));
                  ++var1;
               }

               var1 = 0;
               ++var2;
            }
         } else if (var5 == 90) {
            var6 = a(var4, var3);

            for(var5 = 0; var5 < var3; ++var5) {
               for(var7 = 0; var7 < var4; ++var7) {
                  VDTT_aa.a(var6, var1, var2, var0.b.getPixel(0 + var5, 0 + var4 - 1 - var7));
                  ++var1;
               }

               var1 = 0;
               ++var2;
            }
         } else if (var5 == -270) {
            var6 = a(var4, var3);

            for(var5 = 0; var5 < var3; ++var5) {
               for(var7 = 0; var7 < var4; ++var7) {
                  VDTT_aa.a(var6, var1, var2, var0.b.getPixel(0 + var5, 0 + var4 - 1 - var7));
                  ++var1;
               }

               var1 = 0;
               ++var2;
            }
         } else if (var5 == -90) {
            var6 = a(var4, var3);

            for(var5 = 0; var5 < var3; ++var5) {
               for(var7 = 0; var7 < var4; ++var7) {
                  VDTT_aa.a(var6, var1, var2, var0.b.getPixel(0 + var5, 0 + var7));
                  ++var1;
               }

               var1 = 0;
               ++var2;
            }
         }
      } catch (Exception var11) {
      } finally {
         if (var6 != null) {
            VDTT_r.i.add(var6);
         }

      }

      return var6;
   }
}
