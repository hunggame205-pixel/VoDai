package core.mchien.main2;

import java.util.Vector;

public final class VDTT_dy implements Cloneable {
   public int a = -1;
   public int b = -1;
   public int c = -1;
   public int d = -1;
   public int e;
   public int f;
   public Vector g;
   public int h = -1;
   public int i = -1;
   public int j = 0;

   public final VDTT_dy a() {
      try {
         return (VDTT_dy)super.clone();
      } catch (Exception var2) {
         VDTT_jb.a(var2);
         return null;
      }
   }

   public VDTT_dy(int var1, int var2, int var3) {
      this.h = var1;
      this.d = var1;
      this.e = var2;
      this.f = var3;
   }

   public VDTT_dy(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.h = var4;
      this.d = var4;
      this.b = var2;
      this.a = var1;
      this.c = var3;
      this.e = var5;
      this.f = var6;
   }

   public VDTT_dy(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.h = var4;
      this.d = var4;
      this.b = var2;
      this.a = var1;
      this.c = var3;
      this.e = var5;
      this.f = var6;
      this.j = var7;
   }

   public final boolean b() {
      return this.d == 86 || this.d == 67 || this.d == 87 || this.d == 56 && VDTT_cw.v().br >= 9;
   }

   // $FF: synthetic method
   public final Object clone() {
      return this.a();
   }
}
