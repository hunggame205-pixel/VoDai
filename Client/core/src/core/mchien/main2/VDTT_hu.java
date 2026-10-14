package core.mchien.main2;

public final class VDTT_hu extends VDTT_hs {
   private VDTT_bb O;
   private short P;
   private short Q;
   public int N;

   public VDTT_hu(byte var1, int var2, int var3, int var4, int var5, int var6, int var7, VDTT_bb var8) {
      super((byte)0, var2, var3, var4, var5, 1, 1);
      this.P = this.objX;
      this.Q = this.objY;
      this.O = var8;
   }

   public final void f() {
      this.objX = this.P;
      this.objY = this.Q;
   }

   public final void a(int var1, int var2) {
      if (VDTT_eq.a().b(12) == 2 && !this.O.ab) {
         this.O.ab = true;
         int var3 = this.O.objX + this.O.Z / 2;
         int var4 = this.O.objY + this.O.aa / 2;
         this.O.i();
         this.O.f(var3 + var1 - this.O.q / 2, var4 + var2 - this.O.r / 2);
         VDTT_dm var10000 = this.O.p;
         int var10001 = this.O.q / 2;
         var3 = this.O.r / 2;
         var2 = var10001;
         VDTT_dm var5 = var10000;
         var10000.c = var2;
         var5.d = var3;
         this.b(0, 0);
         VDTT_cw.v().a(this.O.objX + this.O.q / 2 + DataCenter.d().i, this.O.objY + this.O.r / 2 + DataCenter.d().j, false);
      } else {
         this.b(var1 - this.O.q / 2, var2 - this.O.r / 2);
      }
   }

   public final void b(int var1, int var2) {
      this.objX = (short)(this.P + var1);
      this.objY = (short)(this.Q + var2);
      if (this.objX < 10 - this.O.objX) {
         this.objX = (short)(10 - this.O.objX);
      }

      if (this.objX > DataCenter.d().n - this.O.objX - 10) {
         this.objX = (short)(DataCenter.d().n - this.O.objX - 10);
      }

      if (this.objY < 10 - this.O.objY) {
         this.objY = (short)(10 - this.O.objY);
      }

      if (this.objY > DataCenter.d().o - this.O.objY - 10) {
         this.objY = (short)(DataCenter.d().o - this.O.objY - 10);
      }

      var1 = VDTT_bb.R / 2;
      if (this.objX > this.P + var1) {
         this.objX = (short)(this.P + var1);
      }

      if (this.objY < this.Q - var1) {
         this.objY = (short)(this.Q - var1);
      }

      XYEntity var4 = XYEntity.e(this.O.T + this.O.q / 2, this.O.U + this.O.r / 2);
      var2 = this.objX - var4.objX;
      int var3 = var4.objY - this.objY;
      if (VDTT_jb.a(this.objX, this.objY, var4.objX, var4.objY) > 33) {
         if ((var2 = VDTT_er.b(var2, var3)) > 270) {
            var2 -= 270;
            var1 = VDTT_er.T[90 - var2] * 33 / 1000;
            var2 = VDTT_er.T[var2] * 33 / 1000;
            if (VDTT_eq.a().b(12) == 1) {
               this.O.T = (short)(this.objX - var1 - this.O.q / 2);
               this.O.U = (short)(this.objY - var2 - this.O.r / 2);
            } else {
               this.objX = (short)(this.O.T + var1 + this.O.q / 2);
               this.objY = (short)(this.O.U + var2 + this.O.r / 2);
            }
         } else if (var2 > 180) {
            var2 -= 180;
            var1 = VDTT_er.T[var2] * 33 / 1000;
            var2 = VDTT_er.T[90 - var2] * 33 / 1000;
            if (VDTT_eq.a().b(12) == 1) {
               this.O.T = (short)(this.objX + var1 - this.O.q / 2);
               this.O.U = (short)(this.objY - var2 - this.O.r / 2);
            } else {
               this.objX = (short)(this.O.T - var1 + this.O.q / 2);
               this.objY = (short)(this.O.U + var2 + this.O.r / 2);
            }
         } else if (var2 > 90) {
            var2 -= 90;
            var1 = VDTT_er.T[90 - var2] * 33 / 1000;
            var2 = VDTT_er.T[var2] * 33 / 1000;
            if (VDTT_eq.a().b(12) == 1) {
               this.O.T = (short)(this.objX + var1 - this.O.q / 2);
               this.O.U = (short)(this.objY + var2 - this.O.r / 2);
            } else {
               this.objX = (short)(this.O.T - var1 + this.O.q / 2);
               this.objY = (short)(this.O.U - var2 + this.O.r / 2);
            }
         } else {
            var1 = VDTT_er.T[var2] * 33 / 1000;
            var2 = VDTT_er.T[90 - var2] * 33 / 1000;
            if (VDTT_eq.a().b(12) == 1) {
               this.O.T = (short)(this.objX - var1 - this.O.q / 2);
               this.O.U = (short)(this.objY + var2 - this.O.r / 2);
            } else {
               this.objX = (short)(this.O.T + var1 + this.O.q / 2);
               this.objY = (short)(this.O.U - var2 + this.O.r / 2);
            }
         }

         this.O.W.f(this.O.T, this.O.U);
      }

      var4 = XYEntity.e(this.O.T + this.O.q / 2, this.O.U + this.O.r / 2);
      var2 = this.objX - var4.objX;
      var3 = var4.objY - this.objY;
      this.N = VDTT_er.b(var2, var3);
   }

   public final void c(int var1, int var2) {
      super.c(var1, var2);
      this.e();
      if (!VDTT_jb.a(0, 0, this.q, this.r, var1, var2)) {
         this.k = -1;
         this.l = -1;
      } else if (this.m != this.j) {
         this.k = -1;
      } else if (this.n == 1 && this.h != 0 && this.l < this.i && this.l == (this.f + var2) / this.h || this.n == 0 && this.h != 0 && this.l < this.i && this.l == (this.f + var1) / this.h) {
         this.k = this.l;
      }

      if (this.k >= 0) {
         VDTT_ac.b().n();
      }

   }
}
