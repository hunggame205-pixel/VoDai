package core.mchien.main2;

public final class VDTT_hd {
   public short[][] a = new short[2][];

   public static short a(int var0, byte var1, boolean var2) {
      int var4 = var1;
      short[] var3 = DataCenter.d().A[var0].a[0];
      if (var2 && var3.length > DataCenter.d().CharactersTemplate.length) {
         return var3[var3.length - 1];
      } else {
         if (var4 >= var3.length) {
            var4 = var3.length - 1;
         }

         return var3[var4];
      }
   }
}
