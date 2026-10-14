package core.mchien.main2;

public final class VDTT_ee {
   public VDTT_ic a;
   public VDTT_n b;
   public int c;
   public static int d = 20;

   public VDTT_ee(VDTT_ic var1, VDTT_n var2) {
      this.a = var1;
      this.b = var2;
      this.c = d;
   }

   public final boolean a() {
      --this.c;
      return this.c <= 0;
   }
}
