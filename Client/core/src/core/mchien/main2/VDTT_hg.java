package core.mchien.main2;

public final class VDTT_hg extends VDTT_n {
   private int n = 40;
   public int k;
   private int o;
   public VDTT_ek l;
   private int p;
   private int I;
   private int J;
   private VDTT_hi K;
   private VDTT_hi L;
   private VDTT_hi M;
   private VDTT_hi N;
   public boolean m;
   private int O;
   private int P;
   private boolean Q;
   private boolean R;
   private boolean S;
   private int T = 200;

   public VDTT_hg(int var1, VDTT_ek var2, int var3) {
      var2.bE = true;
      this.k = var1;
      this.o = var3;
      this.l = var2;
      var2.S();
      this.f(var2.objX, -50);
      this.e = 2;
      this.d = 0;
      XYEntity var4;
      if ((var4 = VDTT_ek.b(var2.objX, var2.objY)) != null && var1 == 1) {
         this.I = this.J = var4.objY - 1;
      } else {
         this.I = this.J = var2.objY - 1;
      }

      this.O = this.n;
      switch(var3) {
      case 1:
         this.P = 22;
         this.K = new VDTT_hi(369, 0, 0, -1);
         this.L = new VDTT_hi(369, 0, 0, -1);
         this.M = new VDTT_hi(370, 0, 0, -1);
         break;
      case 2:
         this.P = 26;
         this.K = new VDTT_hi(367, 0, 0, -1);
         this.L = new VDTT_hi(367, 0, 0, -1);
         this.M = new VDTT_hi(368, 0, 0, -1);
         break;
      case 3:
         this.P = 28;
         this.K = new VDTT_hi(363, 0, 0, -1);
         this.L = new VDTT_hi(373, 0, 0, -1);
         this.M = new VDTT_hi(364, 0, 0, -1);
         break;
      case 4:
         this.P = 20;
         this.K = new VDTT_hi(361, 0, 0, -1);
         this.L = new VDTT_hi(361, 0, 0, -1);
         this.M = new VDTT_hi(362, 0, 0, -1);
         break;
      case 5:
         this.P = 24;
         this.K = new VDTT_hi(371, 0, 0, -1);
         this.L = new VDTT_hi(371, 0, 0, -1);
         this.M = new VDTT_hi(372, 0, 0, -1);
         break;
      case 6:
         this.P = 18;
         this.K = new VDTT_hi(365, 0, 0, -1);
         this.L = new VDTT_hi(365, 0, 0, -1);
         this.M = new VDTT_hi(366, 0, 0, -1);
         break;
      case 7:
         this.P = 26;
         this.K = new VDTT_hi(359, 0, 0, -1);
         this.L = new VDTT_hi(359, 0, 0, -1);
         this.M = new VDTT_hi(360, 0, 0, -1);
      }

      this.K.K = this.L.K = this.M.K = true;
      if (var2.p()) {
         MenuConfig.K().a(false);
         VDTT_cw.v().i(500);
      }

   }

   public final int a() {
      return this.objX - this.q / 2;
   }

   public final int b() {
      return this.objX + this.q / 2;
   }

   public final int c() {
      return this.objY - this.r / 2;
   }

   public final int d() {
      return this.objY + this.r / 2;
   }

   public final void m() {
      --this.T;
      if (this.T < 0) {
         this.m = true;
      }

      switch(this.e) {
      case 0:
         this.d = 1;
         if (this.k == 0) {
            --this.O;
            if (this.O == this.n - 10) {
               this.l.bD = false;
               if (this.l.p()) {
                  VDTT_cw.v().L();
               }
            }

            if (this.O == 0) {
               this.e = 2;
            }
         } else if (VDTT_cw.v().ai == 67 || this.l.objY == 288 || this.l.objX == this.objX - 25 && this.l.objY == this.objY + 1) {
            --this.O;
            if (this.O == this.n - 30) {
               this.l.bD = true;
            }

            if (this.O == 0) {
               this.e = 2;
            }
         } else {
            if (this.O > this.n - 11) {
               --this.O;
            }

            if (this.O == this.n - 10) {
               this.l.a((short)(this.objX - 25), (short)(this.objY + 1), true);
            }
         }
         break;
      case 2:
         switch(this.d) {
         case 0:
            this.p = this.I - this.objY >> 2;
            if (this.p > this.P) {
               this.p = this.P;
            }

            this.objY = (short)(this.objY + this.p);
            if (this.objY > this.I) {
               this.objY = (short)this.I;
            }

            if (this.k == 0) {
               this.l.bD = true;
            }

            if (this.p == 0) {
               if (this.l.p()) {
                  switch(this.o) {
                  case 1:
                     VDTT_cw.v().cN = 25;
                     break;
                  case 2:
                     VDTT_cw.v().cN = 15;
                     break;
                  case 3:
                     VDTT_cw.v().cN = 20;
                     break;
                  case 4:
                     VDTT_cw.v().cN = 25;
                     break;
                  case 5:
                     VDTT_cw.v().cN = 35;
                  case 6:
                  default:
                     break;
                  case 7:
                     VDTT_cw.v().cN = 15;
                  }
               }

               this.e = 0;
               this.f(this.objX, this.I);
               this.O = this.n;
               this.I = -100;
            }
            break;
         case 1:
            this.p = this.I - this.objY >> 2;
            if (this.p < -this.P) {
               this.p = -this.P;
            }

            this.objY = (short)(this.objY + this.p);
            if (this.p == 0) {
               this.e = 6;
               this.m = true;
            }
         }
      }

      if (this.objY != this.J) {
         if (this.d == 1) {
            if (!this.Q) {
               this.Q = true;
               if (this.l.p()) {
                  VDTT_ac.b().f(1.0F);
               } else if (this.n()) {
                  VDTT_ac.b().f(0.5F);
               }
            }

            this.K.a((VDTT_n)this);
         } else {
            if (!this.R) {
               this.R = true;
               if (this.l.p()) {
                  VDTT_ac.b().e(1.0F);
               } else if (this.n()) {
                  VDTT_ac.b().e(0.5F);
               }
            }

            this.L.a((VDTT_n)this);
         }

         this.N = null;
      } else {
         if (!this.S) {
            this.S = true;
            if (this.l.p()) {
               VDTT_ac.b().d(1.0F);
            } else if (this.n()) {
               VDTT_ac.b().d(0.5F);
            }
         }

         this.M.a((VDTT_n)this);
         if (this.N == null) {
            if (this.o != 3 || VDTT_cw.v().ai == 67 && this.J < 300) {
               this.N = new VDTT_hi(358, this.objX, this.J, 1);
            } else {
               this.N = new VDTT_hi(439, this.objX, this.J, 1);
            }
         }

         if (!this.N.p()) {
            this.N.n();
         }

      }
   }

   private boolean n() {
      return VDTT_cw.v().cK.size() > 0 && ((VDTT_hg)VDTT_cw.v().cK.firstElement()).equals(this);
   }

   public final void a(Graphics var1) {
   }

   public final void b(Graphics var1) {
   }

   public final int e() {
      return 6;
   }

   public final String f() {
      return null;
   }

   public final String g() {
      return null;
   }
}
