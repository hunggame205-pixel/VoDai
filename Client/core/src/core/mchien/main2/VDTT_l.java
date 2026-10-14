package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import java.util.Iterator;

public final class VDTT_l extends VDTT_r {
   public static long a = System.currentTimeMillis();
   private XYEntity l = new XYEntity();
   private boolean m;

   public final void a(char var1) {
      try {
         if (!g()) {
            if (DataCenter.d().ai != null) {
               VDTT_p var10000 = DataCenter.d().ai;
               char var2 = var1;
               VDTT_p var4 = var10000;
               if (!var10000.c.a(var2)) {
                  var4.c.o.a(var2);
               }
            }

         }
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }

   public final void a(int var1) {
      try {
         if (!g()) {
            if (DataCenter.d().ai != null) {
               VDTT_p var10000 = DataCenter.d().ai;
               int var2 = var1;
               VDTT_p var4 = var10000;
               if (!var10000.c.c(var2)) {
                  var4.c.o.a(var2);
               }
            }

         }
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }

   public final void b(int var1) {
      try {
         if (!g()) {
            if (DataCenter.d().ai != null) {
               VDTT_p var10000 = DataCenter.d().ai;
               int var2 = var1;
               VDTT_p var4 = var10000;
               if (!var10000.c.d(var2)) {
                  var4.c.o.b(var2);
               }
            }

         }
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }

   public final void a() {
      try {
         if (DataCenter.d().ai != null) {
            VDTT_p var1 = DataCenter.d().ai;

            try {
               if (System.currentTimeMillis() - a > 900000L && !VDTT_ek.m().h()) {
                  if (!Graphics.p) {
                     VDTT_cw.v().cq = 2;
                  }

                  Graphics.p = true;
               } else {
                  if (Graphics.p) {
                     VDTT_cw.v().cq = 2;
                  }

                  Graphics.p = false;
               }

               VDTT_gr.a().d();
               VDTT_gt var2;
               (var2 = VDTT_gt.b()).d(DataCenter.d().n - 200, 70);
               var2.f(DataCenter.d().n / 2 - var2.q / 2, DataCenter.d().o - 120);
               if (var2.c.size() > 0 && System.currentTimeMillis() - var2.e > 150L && var2.a.size() < 10) {
                  var2.e = System.currentTimeMillis();
                  var2.a.add((VDTT_gu)var2.c.firstElement());
                  var2.c.remove(var2.c.firstElement());
               }

               var2.d = 25 - var2.c.size() / 2;
               if (var2.d < 2) {
                  var2.d = 2;
               }

               (var2 = var2).b.clear();
               Iterator var3 = var2.a.iterator();

               while(var3.hasNext()) {
                  VDTT_gu var4;
                  if ((var4 = (VDTT_gu)var3.next()).a.length() > 100) {
                     var2.d += 5;
                  }

                  if (var2.d > 30) {
                     var2.d = 30;
                  }

                  int var6 = var2.d;
                  if (var4.f > 0) {
                     --var4.f;
                     if (VDTT_gt.a(var4.g).size() > 5) {
                        --var4.f;
                     }
                  } else {
                     var4.d -= var4.d / var6;
                     if (var4.d / var6 == 0 && var4.d > 0) {
                        var4.d -= VDTT_gt.a(var4.g).size() > 5 ? 2 : 1;
                     }

                     var4.e = 100;
                     if (var4.d <= var4.g.r / 3) {
                        var4.e = (int)((float)var4.d / ((float)var4.g.r / 3.0F) * 100.0F);
                     }
                  }

                  if (var4.d <= 0) {
                     var2.b.add(var4);
                  }
               }

               var2.a.removeAll(var2.b);
               VDTT_gv.a().d();
               VDTT_gw.a().d();
               var1.j();

               for(int var10 = 0; var10 < var1.b.size(); ++var10) {
                  MainScreen var9 = (MainScreen)var1.b.elementAt(var10);
                  var9.l();
                  var9.m();
                  var9.o();
               }

               if (!(var1.c instanceof VDTT_x) && VDTT_aa.a != null) {
                  VDTT_aa.a.k();
               }

               return;
            } catch (Exception var7) {
               VDTT_jb.a(var7);
            }
         }

      } catch (Exception var8) {
         VDTT_jb.a(var8);
      }
   }

   public final void a(Graphics var1) {
      try {
         if (DataCenter.d().ai != null) {
            Graphics var2 = var1;
            VDTT_p var6 = DataCenter.d().ai;

            try {
               for(int var3 = 0; var3 < var6.b.size(); ++var3) {
                  ((MainScreen)var6.b.elementAt(var3)).c(var2);
               }

               if (!(var6 instanceof VDTT_cw)) {
                  if (!(var6 instanceof VDTT_cg)) {
                     VDTT_gr.a().a(var2);
                     VDTT_gt.b().a(var2);
                     VDTT_gv.a().a(var2);
                  }

                  return;
               }

               if (!VDTT_cw.v().D()) {
                  return;
               }

               VDTT_gr.a().a(var2);
               VDTT_gt.b().a(var2);
               VDTT_gv.a().a(var2);
               VDTT_gw.a().a(var2);
            } catch (Exception var4) {
               VDTT_jb.a(var4);
            }
         }

      } catch (Exception var5) {
         VDTT_jb.a(var5);
      }
   }

   public final void a(int var1, int var2) {
      try {
         if (!g()) {
            if (DataCenter.d().ai != null) {
               DataCenter.d().ai.c(var1, var2);
            }

         }
      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }
   }

   public final void b(int var1, int var2) {
      try {
         if (!g()) {
            if (this.m) {
               this.c(this.l.objX, this.l.objY);
            }

            this.m = true;
            this.l.f(var1, var2);
            if (DataCenter.d().ai != null) {
               DataCenter.d().ai.a(var1, var2);
            }

         }
      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }
   }

   public final void c(int var1, int var2) {
      try {
         if (!g()) {
            this.m = false;
            if (DataCenter.d().ai != null) {
               DataCenter.d().ai.b(var1, var2);
            }

         }
      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }
   }

   public static boolean b() {
      return Gdx.graphics.getWidth() <= 800;
   }

   public final void resume() {
      super.resume();
      a = System.currentTimeMillis();
   }

   private static boolean g() {
      a = System.currentTimeMillis();
      return Graphics.p;
   }
}
