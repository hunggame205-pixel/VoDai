package core.mchien.main2;

import java.util.Comparator;
import java.util.Vector;

public final class VDTT_iu {
   public int a;
   public String b;
   public String c;
   public Vector d;
   public int e;
   public static final Comparator f = new VDTT_iv();

   public VDTT_iu(int var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public VDTT_iu(int var1, String var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.e = var3;
   }

   public VDTT_iu(int var1, String var2, Vector var3) {
      this.a = 1;
      this.b = var2;
      this.d = var3;
   }
}
