package core.mchien.main2;

public final class VDTT_hb {
   public short a;
   public String b;
   public byte c;
   public byte d;
   public String e;

   public VDTT_hb(int var1) {
      this.a = (short)var1;
   }

   public final int[] a() {
      if (this.e.length() == 0) {
         return new int[0];
      } else {
         String[] var1;
         int[] var2 = new int[(var1 = this.e.split(";")).length];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = Integer.parseInt(var1[var3]);
         }

         return var2;
      }
   }
}
