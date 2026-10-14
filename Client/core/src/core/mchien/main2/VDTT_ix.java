package core.mchien.main2;

import java.math.BigInteger;

public final class VDTT_ix {
   public String a;
   public int b = -1;
   public int c = -16711681;
   public int d = -1;
   public int e = 0;
   public int f = 0;

   public final void a() {
      this.a = this.a.trim();
      String var1 = (Caption.nQ + " " + this.a).toLowerCase();

      for(int var2 = 0; var2 < DataCenter.d().O.length; ++var2) {
         if (DataCenter.d().O[var2].b.toLowerCase().equals(var1)) {
            this.a(DataCenter.d().O[var2].c);
            return;
         }
      }

   }

   private void a(String var1) {
      try {
         String[] var5;
         if ((var5 = var1.replaceAll(";", ",").split(",")).length <= 1) {
            this.c = Integer.parseInt(var5[0]);
            return;
         }

         this.f = Integer.parseInt(var5[0]);
         if (var5.length > 1) {
            try {
               this.c = Integer.parseInt(var5[1]);
            } catch (Exception var3) {
               this.c = (new BigInteger("FF" + var5[1], 16)).intValue();
            }
         }

         if (var5.length > 1) {
            try {
               this.d = Integer.parseInt(var5[2]);
            } catch (Exception var2) {
               this.d = (new BigInteger("FF" + var5[2], 16)).intValue();
            }
         }

         this.e = Integer.parseInt(var5[3]);
      } catch (Exception var4) {
      }

   }
}
