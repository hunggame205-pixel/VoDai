package core.mchien.main2;

import java.util.Comparator;

final class VDTT_id implements Comparator {
   // $FF: synthetic method
   public final int compare(Object var1, Object var2) {
      VDTT_ic var10000 = (VDTT_ic)var1;
      VDTT_ic var4 = (VDTT_ic)var2;
      VDTT_ic var3 = var10000;
      if (var10000.b().i == var4.b().i) {
         return var3.b().d == var4.b().d ? var3.b().a - var4.b().a : var3.b().d - var4.b().d;
      } else {
         return var3.b().i - var4.b().i;
      }
   }
}
