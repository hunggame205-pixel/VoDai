package core.mchien.main2;

import java.util.Comparator;

final class VDTT_kk implements Comparator {
   // $FF: synthetic field
   final VDTT_kj a;

   VDTT_kk(VDTT_kj var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public final int compare(Object var1, Object var2) {
      VDTT_fj var10001 = (VDTT_fj)var1;
      VDTT_fj var3 = (VDTT_fj)var2;
      VDTT_fj var4 = var10001;
      return VDTT_kj.a(this.a, var4.c) - VDTT_kj.a(this.a, var3.c);
   }
}
