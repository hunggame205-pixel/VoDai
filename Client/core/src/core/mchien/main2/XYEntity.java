package core.mchien.main2;

import java.util.Comparator;

public class XYEntity {
   public static final Comparator D = new VDTT_aj();
   public static final Comparator E = new VDTT_ak();
   public static final Comparator F = new VDTT_al();
   public short objX;
   public short objY;

   public static XYEntity e(int var0, int var1) {
      XYEntity var2;
      (var2 = new XYEntity()).f(var0, var1);
      return var2;
   }

   public final void f(int var1, int var2) {
      this.objX = (short)var1;
      this.objY = (short)var2;
   }

   public static XYEntity c(String var0) {
      String[] var2 = var0.split("_");
      XYEntity var1;
      (var1 = new XYEntity()).f(Integer.parseInt(var2[0]), Integer.parseInt(var2[1]));
      return var1;
   }

   public XYEntity u() {
      return e(this.objX, this.objY);
   }

   // $FF: synthetic method
   public Object clone() {
      return this.u();
   }
}
