package core.mchien.main2;

public final class VDTT_em {
   public int a;
   public String b;
   public String c = "";
   public String d;
   public boolean e;
   public VDTT_ft f;

   public VDTT_em(int var1, String var2, String var3) {
      this.a = var1;
      this.b = var2;
      this.d = var3;
      if (var1 == 0 || var1 == 9 || var2.equals(VDTT_ek.m().aD)) {
         this.e = true;
      }

   }

   public VDTT_em(int var1, String var2, String var3, String var4) {
      this.a = var1;
      this.b = var2;
      this.d = var3;
      this.c = var4;
      if (var1 == 0 || var1 == 9 || var4.length() == 0 || var2.equals(VDTT_ek.m().aD)) {
         this.e = true;
      }

   }
}
