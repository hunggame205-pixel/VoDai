package core.mchien.main2;

import java.util.Hashtable;
import java.util.Vector;

public final class VDTT_fe {
   private static int a;
   private static int b;
   private static int c;
   private static int d;
   private static int e;
   private static int f;
   private static Vector g = new Vector();
   private static Object h = new Object();
   private static boolean i;
   private static int j = 0;
   private static int k = 0;

   public static void a() {
      i = true;
      g.removeAllElements();

      try {
         (new Thread(new VDTT_ff())).start();
      } catch (Exception var1) {
         VDTT_jb.a(var1);
      }
   }

   public static void b() {
      i = false;
      g.clear();
      m();
   }

   private static void m() {
      synchronized(h) {
         h.notify();
      }
   }

   public static void a(int var0, int var1, int var2) {
      if (k != 2) {
         a = var0;
         b = var1;
         c = var2;
         i = true;
         g.clear();
         d = VDTT_cw.v().ai;
         e = VDTT_ek.m().objX;
         f = VDTT_ek.m().objY;
         j = 0;
         if (VDTT_cw.v().U.a(b, c)) {
            XYEntity var3;
            b = (var3 = VDTT_cw.v().U.b(b, c)).objX;
            c = var3.objY;
         }

         if (VDTT_cw.v().de > 0) {
            g.add(XYEntity.e(e, f));
            g.add(XYEntity.e(b, c));
            i = false;
         } else {
            m();
         }
      }
   }

   public static Vector c() {
      return g;
   }

   public static void d() {
      if (g.size() > 0 && VDTT_ek.m().ae == null) {
         g.removeElementAt(0);
         if (g.size() > 0) {
            XYEntity var0;
            if ((var0 = (XYEntity)g.firstElement()).objX > VDTT_cw.v().aj - 17) {
               var0.objX = (short)(VDTT_cw.v().aj - 17);
            }

            if (var0.objX < 16) {
               var0.objX = 16;
            }

            short var1 = VDTT_ek.m().objX;
            short var2 = var0.objX;
            if (var1 > var2) {
               var1 = var0.objX;
               var2 = VDTT_ek.m().objX;
            }

            VDTT_gm var3 = new VDTT_gm(var0.objX, var0.objY, VDTT_ek.m().J, VDTT_ek.m().J);
            short var5;
            if (VDTT_cw.v().de > 0) {
               VDTT_cw var10000 = VDTT_cw.v();
               short var10001 = VDTT_ek.m().objX;
               short var8 = var0.objY;
               short var7 = var0.objX;
               short var6 = VDTT_ek.m().objY;
               var5 = var10001;
               VDTT_cw var4 = var10000;
               XYEntity var10 = XYEntity.e(var5, var6);
               XYEntity var13 = XYEntity.e(var7, var8);
               int var14 = 0;

               boolean var15;
               label92:
               while(true) {
                  if (var14 >= var4.dQ.size()) {
                     for(var14 = 0; var14 < var4.dP.size(); ++var14) {
                        if (VDTT_jb.a(var10, var13, ((VDTT_fz)var4.dP.get(var14)).d[0], ((VDTT_fz)var4.dP.get(var14)).d[1]) != null) {
                           var15 = true;
                           break label92;
                        }
                     }

                     var15 = false;
                     break;
                  }

                  if (VDTT_jb.a(var10, var13, ((VDTT_fz)var4.dQ.get(var14)).d[0], ((VDTT_fz)var4.dQ.get(var14)).d[1]) != null) {
                     var15 = true;
                     break;
                  }

                  ++var14;
               }

               if (var15) {
                  short var9 = VDTT_cw.v().ak;

                  for(int var12 = 0; var12 < VDTT_cw.v().dQ.size(); ++var12) {
                     if (var1 <= ((VDTT_fz)VDTT_cw.v().dQ.get(var12)).d[0].objX && ((VDTT_fz)VDTT_cw.v().dQ.get(var12)).d[0].objX <= var2 && ((VDTT_fz)VDTT_cw.v().dQ.get(var12)).d[0].objY < var9) {
                        var9 = ((VDTT_fz)VDTT_cw.v().dQ.get(var12)).d[0].objY;
                     }
                  }

                  --var9;
                  if (VDTT_ek.m().objY <= var9) {
                     if (VDTT_ek.m().objX != var0.objX) {
                        var3 = new VDTT_gm(var0.objX, VDTT_ek.m().objY, VDTT_ek.m().J, VDTT_ek.m().J);
                     }
                  } else {
                     var3 = new VDTT_gm(VDTT_ek.m().objX, var9, VDTT_ek.m().J, VDTT_ek.m().J);
                  }

                  g.insertElementAt(var0, 0);
               }
            }

            VDTT_ek.m().ae = var3;
            VDTT_ek.m().a(VDTT_ek.m().ae);
            int var11 = VDTT_ek.m().objY - var0.objY;
            if (VDTT_cw.v().de == 0 && VDTT_jb.b(var11) > 2) {
               if (g.size() > 1) {
                  if (((XYEntity)g.get(1)).objX < VDTT_ek.m().ae.objX) {
                     --VDTT_ek.m().ae.objX;
                  } else {
                     ++VDTT_ek.m().ae.objX;
                  }
               }

               var5 = VDTT_ek.m().ae.objX;
               var1 = VDTT_ek.m().ae.objY;
               if (VDTT_jb.b(VDTT_ek.m().ae.objX - VDTT_ek.m().objX) < 5) {
                  if (var11 >= 0) {
                     VDTT_ek.m().a(true, var11);
                     VDTT_ek.m().ae.n = var5;
                     VDTT_ek.m().ae.objY = var0.objY;
                     VDTT_ek.m().ae.j = true;
                     return;
                  }
               } else {
                  if (var11 < 0) {
                     VDTT_ek.m().a(true, VDTT_cw.dN);
                     VDTT_ek.m().ae.j = true;
                     VDTT_ek.m().ae.n = var5;
                     VDTT_ek.m().ae.o = var1;
                     return;
                  }

                  VDTT_ek.m().a(true, VDTT_cw.dN);
                  VDTT_ek.m().ae.n = var5;
               }
            }
         }
      }

   }

   public static boolean e() {
      return g.size() > 0;
   }

   // $FF: synthetic method
   static Object f() {
      return h;
   }

   // $FF: synthetic method
   static int a(int var0) {
      k = var0;
      return var0;
   }

   // $FF: synthetic method
   static boolean g() {
      return i;
   }

   // $FF: synthetic method
   static int h() {
      return e;
   }

   // $FF: synthetic method
   static int i() {
      return f;
   }

   // $FF: synthetic method
   static int j() {
      return b;
   }

   // $FF: synthetic method
   static int k() {
      return c;
   }

   // $FF: synthetic method
   static int b(int var0) {
      b = var0;
      return var0;
   }

   // $FF: synthetic method
   static int c(int var0) {
      c = var0;
      return var0;
   }

   // $FF: synthetic method
   static Vector l() {
      return g;
   }

   // $FF: synthetic method
   static boolean a(boolean var0) {
      i = false;
      return false;
   }

   // $FF: synthetic method
   static int d(int var0) {
      f = var0;
      return var0;
   }

   // $FF: synthetic method
   static int a(VDTT_gp var0, String var1, String var2, int var3, int var4, Hashtable var5) {
      var4 = Integer.MAX_VALUE;
      var3 = var3;
      var2 = var2;
      var0 = var0;
      var5 = (Hashtable)var5.clone();
      Vector var6;
      (var6 = new Vector()).add(new VDTT_gp(0, var1, new Vector()));
      int var11 = 0;

      while(i && var6.size() > 0) {
         ++var11;
         if (var11 > var4) {
            break;
         }

         VDTT_gp var9;
         Vector var10;
         (var10 = (var9 = (VDTT_gp)var6.remove(var6.size() - 1)).a).add(var9.c);
         if (var10.size() > 100) {
            break;
         }

         XYEntity var7;
         XYEntity var8;
         if (var10.size() > 1) {
            var7 = XYEntity.c((String)var10.get(var10.size() - 1));
            var8 = XYEntity.c((String)var10.get(var10.size() - 2));
            var9.b += VDTT_jb.a(var7.objX, var7.objY, var8.objX, var8.objY);
            if (var9.b > var0.b) {
               continue;
            }
         }

         VDTT_gq var16;
         if ((var16 = (VDTT_gq)var5.remove(var9.c)) != null) {
            Vector var13;
            label59:
            switch(var3) {
            case 1:
               var13 = var16.b;
               break;
            case 2:
               var13 = var16.c;
               break;
            case 3:
               var13 = var16.d;
               break;
            case 4:
               var13 = var16.e;
               break;
            case 5:
               var13 = var16.f;
               break;
            case 6:
               var13 = new Vector();
               Vector var14 = new Vector(var16.a);

               while(true) {
                  if (var14.size() <= 0) {
                     break label59;
                  }

                  var13.add((String)var14.remove(VDTT_jb.a(var14.size())));
               }
            default:
               var13 = var16.a;
            }

            if (var13 == null) {
               var13 = var16.a;
            }

            for(int var12 = var13.size() - 1; var12 >= 0; --var12) {
               String var15;
               if ((var15 = (String)var13.get(var12)).equals(var2)) {
                  var10.add(var2);
                  var7 = XYEntity.c((String)var10.get(var10.size() - 1));
                  var8 = XYEntity.c((String)var10.get(var10.size() - 2));
                  var9.b += VDTT_jb.a(var7.objX, var7.objY, var8.objX, var8.objY);
                  if (var9.b < var0.b) {
                     var0.b = var9.b;
                     var0.a = var9.a;
                  }
               } else if (!var10.contains(var15)) {
                  var6.add(new VDTT_gp(var9.b, var15, new Vector(var10)));
               }
            }
         }
      }

      return var11;
   }
}
