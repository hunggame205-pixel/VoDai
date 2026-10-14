package core.mchien.main2;

import java.util.Comparator;

final class VDTT_fk implements Comparator {
   // $FF: synthetic method
   public final int compare(Object var1, Object var2) {
      VDTT_fj var10000 = (VDTT_fj)var1;
      VDTT_fj var4 = (VDTT_fj)var2;
      VDTT_fj var3 = var10000;
      if (var4.b == var3.b) {
         if (var4.d == var3.d) {
            return var4.c.compareTo(var3.c);
         } else {
            return var4.d ? 1 : -1;
         }
      } else {
         return var4.b - var3.b;
      }
   }
}
