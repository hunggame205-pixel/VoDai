package core.mchien.main2;

import java.util.Comparator;

public class VDTT_fz {
   public static final Comparator b = new VDTT_ga();
   public static final Comparator c = new VDTT_gb();
   public XYEntity[] d;
   public short e;
   public short f;
   public short g;
   public short h;

   public VDTT_fz() {
   }

   public VDTT_fz(XYEntity[] var1) {
      this.d = var1;
   }

   public final VDTT_fz a() {
      VDTT_fz var1;
      (var1 = new VDTT_fz()).e = this.e;
      var1.f = this.f;
      var1.g = this.g;
      var1.h = this.h;
      var1.d = new XYEntity[this.d.length];

      for(int var2 = 0; var2 < this.d.length; ++var2) {
         var1.d[var2] = new XYEntity();
         var1.d[var2].f(this.d[var2].objX, this.d[var2].objY);
      }

      return var1;
   }

   public final XYEntity a(XYEntity var1, XYEntity var2) {
      for(int var4 = 0; var4 < this.d.length - 1; ++var4) {
         XYEntity var3;
         if ((var3 = VDTT_jb.a(var1, var2, this.d[var4], this.d[var4 + 1])) != null) {
            return var3;
         }
      }

      return null;
   }

   public final boolean a(int var1, int var2) {
      return a(var1, var2, this.d);
   }

   private static boolean a(int var0, int var1, XYEntity[] var2) {
      boolean var5 = false;
      int var3 = 0;

      for(int var4 = var2.length - 1; var3 < var2.length; var4 = var3++) {
         if ((var2[var3].objY <= var1 && var1 < var2[var4].objY || var2[var4].objY <= var1 && var1 < var2[var3].objY) && var0 < (var2[var4].objX - var2[var3].objX) * (var1 - var2[var3].objY) / (var2[var4].objY - var2[var3].objY) + var2[var3].objX) {
            var5 = !var5;
         }
      }

      return var5;
   }

   // $FF: synthetic method
   public Object clone() {
      return this.a();
   }
}
