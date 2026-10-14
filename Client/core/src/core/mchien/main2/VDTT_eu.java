package core.mchien.main2;

public final class VDTT_eu {
   public static short a;
   public static short b;
   public static Message c = null;

   public static void a(boolean var0) {
      try {
         if (VDTT_ek.m().objY < 30) {
            VDTT_ek.m().objY = 30;
         }

         if (!VDTT_cw.d && VDTT_ek.m().aY == null) {
            if (VDTT_ek.m().aX == null && !VDTT_cw.v().cm && VDTT_jb.a() - VDTT_cw.N >= 500L) {
               int var3 = VDTT_ek.m().objX - a;
               int var1 = VDTT_ek.m().objY - b;
               if ((var3 == 0 || var1 == 0) && var3 <= 127 && var3 >= -128 && var1 <= 127 && var1 >= -128) {
                  if (var3 != 0) {
                     a = VDTT_ek.m().objX;
                     b = VDTT_ek.m().objY;
                     if (VDTT_ek.m().e != 2 && VDTT_ek.m().e != 7) {
                        VDTT_dn.a().c(var3);
                     } else {
                        VDTT_dn.a().a(var3);
                     }

                  } else {
                     if (var1 != 0) {
                        a = VDTT_ek.m().objX;
                        b = VDTT_ek.m().objY;
                        if (VDTT_ek.m().e != 2 && VDTT_ek.m().e != 7) {
                           VDTT_dn.a().d(var1);
                           return;
                        }

                        VDTT_dn.a().b(var1);
                     }

                  }
               } else {
                  a = VDTT_ek.m().objX;
                  b = VDTT_ek.m().objY;
                  if (VDTT_ek.m().e != 2 && VDTT_ek.m().e != 7) {
                     VDTT_dn.a().b(a, b);
                  } else {
                     VDTT_dn.a().a(a, b);
                  }
               }
            }
         } else {
            a = VDTT_ek.m().objX;
            b = VDTT_ek.m().objY;
         }
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }
}
