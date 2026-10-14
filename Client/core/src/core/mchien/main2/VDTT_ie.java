package core.mchien.main2;

public final class VDTT_ie {
   public int a;
   public String b;
   public String c;
   public int d;
   public String e;
   public int f;
   public int g;
   public int h;

   public final VDTT_gz[] a() {
      if (this.e != null && this.e.length() > 0) {
         String[] var1;
         VDTT_gz[] var2 = new VDTT_gz[(var1 = VDTT_jb.a(this.e, ";")).length];

         for(int var3 = 0; var3 < var1.length; ++var3) {
            var2[var3] = new VDTT_gz(var1[var3]);
         }

         return var2;
      } else {
         return null;
      }
   }

   public final String b() {
      return VDTT_jb.f((long)this.h * 1000L);
   }
}
