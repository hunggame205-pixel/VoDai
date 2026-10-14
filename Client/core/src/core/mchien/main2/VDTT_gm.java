package core.mchien.main2;

public final class VDTT_gm extends XYEntity {
   public short a;
   public short b;
   public byte c = 1;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i;
   public boolean j;
   public boolean k;
   public boolean l;
   public boolean m;
   public short n;
   public short o;
   int p;

   public VDTT_gm(short var1, short var2, short var3, short var4) {
      this.objX = var1;
      this.objY = var2;
      this.a = var3;
      this.b = var4;
      this.c = (byte)VDTT_ek.m().J;
   }

   public VDTT_gm(short var1, short var2, int var3) {
      this.objX = var1;
      this.objY = var2;
      this.a = (short)var3;
      this.b = (short)var3;
      this.c = (byte)var3;
   }

   public final void a(int var1, int var2) {
      this.d = this.objY;
      this.e = this.f = 0;
      this.e = 0;
      ++this.g;
      this.h = var1;
      this.i = var2;
   }

   public final boolean a() {
      return this.g == 1;
   }

   public final boolean b() {
      return this.g == 2;
   }
}
