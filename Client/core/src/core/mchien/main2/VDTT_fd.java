package core.mchien.main2;

import java.util.Comparator;

final class VDTT_fd implements Comparator {
   // $FF: synthetic method
   public final int compare(Object var1, Object var2) {
      VDTT_fc var10000 = (VDTT_fc)var1;
      VDTT_fc var4 = (VDTT_fc)var2;
      VDTT_fc var3 = var10000;
      if (var4.c == var3.c) {
         return var4.b.compareTo(var3.b);
      } else {
         return var4.c ? 1 : -1;
      }
   }
}
