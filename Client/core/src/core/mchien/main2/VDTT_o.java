package core.mchien.main2;

import java.util.Comparator;

final class VDTT_o implements Comparator {
   // $FF: synthetic method
   public final int compare(Object var1, Object var2) {
      VDTT_n var10000 = (VDTT_n)var1;
      VDTT_n var5 = (VDTT_n)var2;
      VDTT_n var3 = var10000;
      if (!(var10000 instanceof VDTT_gk) || ((VDTT_gk)var3).k != VDTT_cw.v().cx || var5 instanceof VDTT_gk && ((VDTT_gk)var5).k == VDTT_cw.v().cx) {
         if (!(var5 instanceof VDTT_gk) || ((VDTT_gk)var5).k != VDTT_cw.v().cx || var3 instanceof VDTT_gk && ((VDTT_gk)var3).k == VDTT_cw.v().cx) {
            int var4 = VDTT_jb.a(VDTT_ek.m().objX, VDTT_ek.m().objY, var3.objX, var3.objY);
            int var6 = VDTT_jb.a(VDTT_ek.m().objX, VDTT_ek.m().objY, var5.objX, var5.objY);
            return var4 - var6;
         } else {
            return 1;
         }
      } else {
         return -1;
      }
   }
}
