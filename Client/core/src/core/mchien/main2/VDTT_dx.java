package core.mchien.main2;

public final class VDTT_dx extends VDTT_n {
   public VDTT_ev k;
   private byte p;
   public byte l;
   public byte m;
   public byte n;
   public byte o;
   private int I;
   private int J;
   private int K;
   private int L;
   private int M;
   private int N;
   private int O;
   private int P;
   private int Q;
   private boolean R;
   private boolean S;
   private boolean T;

   public VDTT_dx(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, (short)0, (short)0);
   }

   public VDTT_dx(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, short var10, short var11) {
      this.a(var1, var2, 0, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   private void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, short var10, short var11) {
      this.k = new VDTT_ev(var1, VDTT_jb.a(var7), VDTT_jb.a(var8), -1);
      this.K = var10;
      this.L = var11;
      this.l = (byte)var2;
      this.m = (byte)var3;
      this.p = (byte)var4;
      this.I = var7;
      this.J = var8;
      this.M = var6;
      this.R = var9;
      if (var4 == 12) {
         this.k.objX = (short)(var5 * var10 - var10 / 2);
         this.k.objY = (short)(var8 - var11 / 2);
      } else if (var4 != 3 && var4 != 4) {
         if (var4 == 7) {
            this.k.objX = (short)(VDTT_cw.v().aj / 2);
            this.k.objY = (short)(var5 * var11);
         }
      } else {
         this.k.objX = (short)(var5 * var10 - var10 / 2);
         this.k.objY = (short)(var8 + 1);
         this.J = this.k.objY;
      }

      this.a(true);
      if (var4 == 3 || var4 == 4 || var4 == 9 || var4 == 10) {
         for(var1 = 0; var1 < 1000 && !this.T; ++var1) {
            this.m();
         }
      }

   }

   private void a(boolean var1) {
      VDTT_ev var10000;
      boolean var10001;
      VDTT_dx var2;
      switch(this.p) {
      case 0:
         this.n = (byte)VDTT_jb.a(1, this.l);
         this.o = 0;
         if (!var1) {
            this.k.f(this.I + VDTT_jb.a(50, 150), VDTT_jb.a(this.J));
         } else {
            this.k.f(VDTT_jb.a(this.I), VDTT_jb.a(this.J));
         }

         if (this.R) {
            this.k.objY = (short)(this.J + VDTT_jb.a((int)50) - 25);
            return;
         }

         return;
      case 1:
         this.S = VDTT_jb.b();
         this.n = (byte)VDTT_jb.a(1, this.l);
         this.o = 0;
         if (this.S) {
            if (!var1) {
               this.k.f(-VDTT_jb.a(50, 150), VDTT_jb.a(this.J));
            } else {
               this.k.f(VDTT_jb.a(this.I), VDTT_jb.a(this.J));
            }

            this.k.o = false;
         } else {
            this.k.o = true;
            if (!var1) {
               this.k.f(this.I + VDTT_jb.a(50, 150), VDTT_jb.a(this.J));
            } else {
               this.k.f(VDTT_jb.a(this.I), VDTT_jb.a(this.J));
            }
         }

         if (this.R) {
            this.k.objY = (short)(this.J + VDTT_jb.a((int)50) - 25);
            return;
         }

         return;
      case 2:
         this.S = true;
         this.k.o = false;
         this.n = (byte)VDTT_jb.a(1, this.l);
         this.o = 0;
         if (!var1) {
            this.k.f(-VDTT_jb.a(50, 150), VDTT_jb.a(this.J));
         } else {
            this.k.f(VDTT_jb.a(this.I), VDTT_jb.a(this.J));
         }

         if (this.R) {
            this.k.objY = (short)(this.J + VDTT_jb.a((int)50) - 25);
            return;
         }

         return;
      case 3:
         this.n = this.l;
         this.o = 0;
         if (!var1) {
            var10000 = this.k;
            var10000.objX += (short)(this.M * this.K - this.n);
            return;
         }

         return;
      case 4:
         this.n = this.l;
         this.o = 0;
         if (!var1) {
            var10000 = this.k;
            var10000.objX -= (short)(this.M * this.K - this.n);
         }

         var2 = this;
         var10001 = VDTT_jb.b();
         break;
      case 5:
         this.n = (byte)VDTT_jb.a(1, this.l);
         this.o = (byte)VDTT_jb.a(1, this.m);
         if (!var1) {
            this.k.f(VDTT_jb.a(this.I), 0);
            return;
         } else {
            this.k.f(VDTT_jb.a(this.I), VDTT_jb.a(this.J));
            return;
         }
      case 6:
         this.n = (byte)VDTT_jb.a(1, this.l);
         this.o = (byte)(this.m + VDTT_jb.a(1, 5));
         if (!var1) {
            this.k.f(VDTT_jb.a(this.I), 0);
            return;
         }

         this.k.f(VDTT_jb.a(this.I), VDTT_jb.a(this.J));
         return;
      case 7:
         this.n = 0;
         this.o = this.m;
         if (!var1) {
            var10000 = this.k;
            var10000.objY -= (short)(this.M * this.L - this.o);
            return;
         }

         return;
      case 8:
         this.n = (byte)VDTT_jb.a(1, this.l);
         this.o = (byte)(this.m + VDTT_jb.a(0, 2));
         if (!var1) {
            this.k.f(VDTT_jb.a(this.I), 0);
            return;
         }

         this.k.f(VDTT_jb.a(this.I), VDTT_jb.a(this.J));
         return;
      case 9:
         this.n = (byte)VDTT_jb.a(1, this.l);
         this.o = (byte)(-VDTT_jb.a(1, 3));
         this.k.f(VDTT_jb.a(this.I), this.J);
         this.S = VDTT_jb.a((int)2) == 0;
         return;
      case 10:
         this.n = (byte)VDTT_jb.a(-2, 2);
         this.o = (byte)(-VDTT_jb.a(4, 7));
         this.k.f(VDTT_jb.a(this.I), VDTT_jb.a(0, this.J * 3 / 2));
         var2 = this;
         var10001 = VDTT_jb.a((int)2) == 0;
         break;
      case 11:
         this.n = (byte)VDTT_jb.a(0, 1);
         this.o = (byte)VDTT_jb.a(1, 3);
         if (!var1) {
            this.k.f(VDTT_jb.a(this.I), 0);
            return;
         }

         this.k.f(VDTT_jb.a(this.I), VDTT_jb.a(this.J));
         return;
      case 12:
         this.n = this.l;
         this.o = 0;
         if (!var1) {
            var10000 = this.k;
            var10000.objX += (short)(this.M * this.K - this.n);
            return;
         }

         return;
      default:
         return;
      }

      var2.S = var10001;
   }

   public final int a() {
      return this.p != 3 && this.p != 4 && this.p != 12 ? this.k.a() : this.k.objX - this.K;
   }

   public final int c() {
      return this.p == 7 ? this.k.objY - this.L : this.k.c();
   }

   public final int b() {
      return this.p != 3 && this.p != 4 && this.p != 12 ? this.k.b() : this.k.objX + this.K;
   }

   public final int d() {
      return this.p == 7 ? this.k.objY + this.L : this.k.d();
   }

   public final void m() {
      this.k.n();
      if (!this.S && (this.k.b() < -this.K || this.k.c() > this.J) || this.S && (this.k.a() > this.I + this.K || this.k.c() > this.J) || (this.p == 9 || this.p == 10) && this.k.d() < 0) {
         this.a(false);
         this.T = true;
      } else {
         VDTT_ev var10000;
         if (this.S) {
            var10000 = this.k;
            var10000.objX = (short)(var10000.objX + this.n);
            var10000 = this.k;
            var10000.objY = (short)(var10000.objY + this.o);
         } else {
            var10000 = this.k;
            var10000.objX = (short)(var10000.objX - this.n);
            var10000 = this.k;
            var10000.objY = (short)(var10000.objY + this.o);
         }
      }
   }

   public final void a(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      if (this.P != 0 || this.Q != 0) {
         var1.d(this.N, this.O, this.P, this.Q);
      }

      this.k.a(var1);
      if (this.P != 0 || this.Q != 0) {
         var1.a(-var1.e, -var1.f);
         var1.a(0, 0);
         var1.d(0, 0, DataCenter.d().n, DataCenter.d().o);
         var1.a(var2, var3);
      }

   }

   public final void b(Graphics var1) {
   }

   public final String f() {
      return null;
   }

   public final String g() {
      return null;
   }

   public final int e() {
      return this.k.p().a;
   }
}
