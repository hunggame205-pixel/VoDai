package core.mchien.main2;

import java.util.Comparator;

final class VDTT_fr implements Comparator {
   // $FF: synthetic method
   public final int compare(Object var1, Object var2) {
      Item var10000 = (Item)var1;
      Item var4 = (Item)var2;
      Item var3 = var10000;
      if (var4.getItemTemplate().i == var3.getItemTemplate().i) {
         if (var4.t == var3.t) {
            return var3.f - var4.f;
         } else {
            return var3.t ? -1 : 1;
         }
      } else {
         return var4.getItemTemplate().i - var3.getItemTemplate().i;
      }
   }
}
