package core.mchien.main2;

public final class VDTT_fp {
   private final int i = 35;
   private final int j = 65;
   public final int a;
   public boolean b;
   public int c;
   public int d;
   private int k;
   private int l;
   private int m;
   public int e;
   public boolean f;
   public int g;
   public float h;

   public VDTT_fp() {
      this.a = DataCenter.d().n;
      this.e = 1;
   }

   public final boolean a() {
      return this.e == 1;
   }

   public final boolean b() {
      return this.b && (DataCenter.d().ai instanceof VDTT_cw || DataCenter.d().ai instanceof VDTT_cg);
   }

   public final void a(int var1, int var2) {
      DataCenter.d();
      if (!DataCenter.b()) {
         if (this.k != var1 + VDTT_cw.v().br + VDTT_cw.v().bs && VDTT_cw.v().br <= 5 && (VDTT_cw.v().br != this.l || VDTT_cw.v().bs != this.m || VDTT_cw.v().br == this.l && VDTT_cw.v().bs == this.m && this.c != var1 && this.d != var2)) {
            this.k = var1 + VDTT_cw.v().br + VDTT_cw.v().bs;
            this.l = VDTT_cw.v().br;
            this.m = VDTT_cw.v().bs;
         }

         this.c = var1;
         this.d = var2;
      }
   }

   public final void b(int var1, int var2) {
      this.a(var1, var2);
      this.b = true;
   }
}
