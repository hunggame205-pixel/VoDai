package core.mchien.main2;

import java.util.Vector;

public final class VDTT_hq {
   public Vector a;
   public VDTT_fh b;
   public Vector c;
   public byte d;
   public String e;

   public VDTT_hq(Vector var1, String var2, byte var3, String var4) {
      this.e = var4;
      this.a = var1;
      int var5;
      if ((var5 = DataCenter.d().n) > 400) {
         var5 = 400;
      }

      this.c = VDTT_dg.a(VDTT_dg.d, var2, var5 - 72);
      this.d = var3;
   }

   public VDTT_hq(VDTT_fh var1, String var2, byte var3, String var4) {
      this.b = var1;
      this.e = var4;
      int var5;
      if ((var5 = DataCenter.d().n) > 400) {
         var5 = 400;
      }

      this.c = VDTT_dg.a(VDTT_dg.d, var2, var5 - 72);
      this.d = 0;
   }
}
