package core.mchien.main2;

import java.util.Comparator;

final class VDTT_al implements Comparator {
   // $FF: synthetic method
   public final int compare(Object var1, Object var2) {
      VDTT_n var10000 = (VDTT_n)var1;
      VDTT_n var7 = (VDTT_n)var2;
      VDTT_n var5 = var10000;
      int var3 = var10000.e();
      int var4;
      int var13;
      if ((var4 = var7.e()) != var3) {
         var13 = var4 - var3;
         return var13;
      } else if (var5 instanceof VDTT_ev && ((VDTT_ev)var5).p && !(var7 instanceof VDTT_ev)) {
         return -1;
      } else if (var7 instanceof VDTT_ev && ((VDTT_ev)var7).p && !(var5 instanceof VDTT_ev)) {
         return 1;
      } else {
         if (var5 instanceof VDTT_ev && var7 instanceof VDTT_ev) {
            VDTT_ev var10 = (VDTT_ev)var5;
            VDTT_ev var12 = (VDTT_ev)var7;
            if (var10.p && var12.p) {
               return var12.p().a - var10.p().a;
            }
         } else if (var5 instanceof VDTT_iz && var7 instanceof VDTT_iz) {
            VDTT_iz var9 = (VDTT_iz)var5;
            VDTT_iz var11 = (VDTT_iz)var7;
            if (var9.m().d != var11.m().d) {
               short var6 = var9.m().d;
               short var8 = var11.m().d;
               if (var6 == 0) {
                  var6 = 20;
               }

               if (var8 == 0) {
                  var8 = 20;
               }

               return var6 - var8;
            }

            if (var5.objY == var7.objY) {
               return var7.objX - var5.objX;
            }

            if (var5.objY >= var7.objY) {
               return 1;
            }

            var13 = -1;
            return var13;
         }

         if (var5.objY == var7.objY) {
            return var7.objX - var5.objX;
         } else {
            return var5.objY - var7.objY;
         }
      }
   }
}
