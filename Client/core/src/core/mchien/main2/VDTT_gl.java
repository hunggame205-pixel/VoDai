package core.mchien.main2;

public final class VDTT_gl {
   public short[][] a;
   public VDTT_fh[] b;
   public short c;
   public short d;
   public short e;
   public short f;
   public short g;
   public short h;
   public short i;
   public short j;
   public String k;
   public String l;
   public int[] m;
   public int[] n;
   public short o;
   public byte p;
   public byte q;
   public byte r;
   public VDTT_fi s;

   public VDTT_gl(int var1) {
      this.c = (short)var1;
   }

   public final void a(String var1, String var2) {
      try {
         String[] var5 = VDTT_jb.a(var1, ",");
         this.m = new int[var5.length];

         int var3;
         for(var3 = 0; var3 < var5.length; ++var3) {
            this.m[var3] = Integer.parseInt(var5[var3]);
         }

         var5 = VDTT_jb.a(var2, ",");
         this.n = new int[var5.length];

         for(var3 = 0; var3 < var5.length; ++var3) {
            this.n[var3] = Integer.parseInt(var5[var3]);
         }

      } catch (Exception var4) {
      }
   }
}
