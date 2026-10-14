package core.mchien.main2;

import java.util.Comparator;

public final class VDTT_ic implements Cloneable {
   public static final Comparator a = new VDTT_id();
   public int b;
   public short c;
   public short d;
   public byte e;
   public short f;
   public short g;
   public int h;
   public short i;
   public short j;
   public byte k;
   public long l;
   public String m;
   public long n;
   public boolean o;
   public boolean p;

   public final VDTT_ic a() {
      try {
         return (VDTT_ic)super.clone();
      } catch (Exception var2) {
         VDTT_jb.a(var2);
         return null;
      }
   }

   public final VDTT_ij b() {
      return DataCenter.d().Q[this.d];
   }

   public final boolean c() {
      return this.b().g == 5;
   }

   public final boolean d() {
      return this.b().g < 5 || this.b().g == 6;
   }

   public final boolean e() {
      return this.b().g == 1;
   }

   public final boolean a(VDTT_ek var1, boolean var2) {
      if (var1.p()) {
         if (this.n < VDTT_jb.a() && var1.ah >= this.g) {
            if (this.l()) {
               if (VDTT_cw.v().de == 0) {
                  if (var2) {
                     DataCenter.d().ai.c(Caption.xN, -1);
                  }

                  return false;
               }

               if (VDTT_cw.v().bg == null) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public final void f() {
      if (this.d >= 30 && this.d <= 36 && VDTT_ek.m().ad()) {
         this.n = VDTT_jb.a() + (long)(this.h * 80 / 100);
      } else {
         this.n = VDTT_jb.a() + (long)this.h;
      }
   }

   public final float g() {
      return (float)(this.n - VDTT_jb.a());
   }

   public final VDTT_gz[] h() {
      if (this.m != null && this.m.length() > 0) {
         String[] var1;
         VDTT_gz[] var2 = new VDTT_gz[(var1 = VDTT_jb.a(this.m, ";")).length];

         for(int var3 = 0; var3 < var1.length; ++var3) {
            var2[var3] = new VDTT_gz(var1[var3]);
         }

         return var2;
      } else {
         return null;
      }
   }

   public final float a(int var1) {
      float var2 = (float)((int)(this.n - VDTT_jb.a()));
      float var3 = (float)(this.h / var1);
      return !(var2 <= 0.0F) && var3 != 0.0F ? var2 / var3 : (float)(var1 + 1);
   }

   public final boolean i() {
      return this.d == 11 || this.d == 9;
   }

   public final boolean j() {
      return this.d == 5;
   }

   public final short a(VDTT_ek var1) {
      if (DataCenter.l()) {
         if (this.b().a >= 30 && this.b().a <= 36) {
            return (short)(this.b().h - 12);
         }

         if (this.b().d == 5) {
            return (short)(730 + VDTT_ek.m().av - 1);
         }

         if (this.b().d == 10) {
            return 390;
         }

         if (this.b().d == 30) {
            return 391;
         }

         if (this.b().d == 40) {
            return 392;
         }

         if (this.b().d == 50) {
            return 393;
         }

         if (this.b().d == 1 && this.b().f == 1) {
            return 366;
         }

         if (this.l()) {
            return 81;
         }
      }

      if (this.b().a >= 30 && this.b().a <= 36) {
         if (var1.m == 4) {
            return (short)(this.b().h - 419);
         } else {
            return var1.m == 5 ? (short)(this.b().h + 298) : (short)(this.b().h + var1.m * 7);
         }
      } else if (this.k()) {
         return this.e > 0 ? (short)(this.b().h + this.e - 1) : (short)(this.b().h + this.e);
      } else {
         return this.b().h;
      }
   }

   public final boolean k() {
      return this.d == 3 || this.d == 8 || this.d == 15 || this.d == 21 || this.d == 24 || this.d == 96;
   }

   public final void a(Graphics var1, VDTT_ek var2, int var3, int var4) {
      if (!VDTT_eq.a().d() && !this.l()) {
         VDTT_dc.a(var1, 646, 0, var3, var4, 20);
         VDTT_dc.a(var1, this.a(var2), 0, var3, var4, 20);
      } else {
         VDTT_dc.a(var1, this.a(var2), 0, var3, var4, 20);
         VDTT_dc.a(var1, 647, 0, var3, var4, 20);
      }
   }

   public final boolean l() {
      return this.d == 1 || this.d == 7 || this.d == 13 || this.d == 19 || this.d == 25 || this.d == 97;
   }

   public final boolean b(VDTT_ek var1) {
      return this.b().i == 0 || var1.bI == this.b().a || var1.bJ == this.b().a;
   }

   public final boolean m() {
      return this.d >= 84 && this.d <= 86;
   }

   // $FF: synthetic method
   public final Object clone() {
      return this.a();
   }
}
