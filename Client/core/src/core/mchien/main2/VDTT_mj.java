package core.mchien.main2;

import java.util.Vector;

public final class VDTT_mj extends VDTT_jr {
   private VDTT_iq Q;
   public Item[][] O;
   private VDTT_ht[] R;
   private VDTT_hs[][] S;
   private VDTT_ba[][] T;
   private int U = 102;
   private int V = 50;
   private int W = -1;
   private int X = -1;
   private String[] Y;
   public byte P;
   private byte[] Z;
   private boolean[] aa;

   public VDTT_mj(VDTT_p var1, byte var2, String var3, int var4) {
      super(var1, new String[]{var3});
      this.a(323);
      this.P = var2;
      switch(var2) {
      case 0:
      case 1:
         this.Y = Caption.yL;
         this.Z = new byte[]{0, 1};
         break;
      case 2:
      case 3:
         this.Y = Caption.yL;
         this.Z = new byte[]{2, 3};
         break;
      case 4:
      case 5:
         this.Y = Caption.yL;
         this.Z = new byte[]{4, 5};
      case 6:
      case 7:
      case 31:
      default:
         break;
      case 8:
      case 20:
         if (var4 < 0) {
            this.Y = Caption.zP;
            var4 = 0;
         } else {
            this.Y = Caption.yK;
         }

         this.Z = new byte[]{var2, var2, var2, var2, var2};
         break;
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
         this.Y = Caption.yK;
         this.Z = new byte[]{var2, var2, var2, var2, var2};
         break;
      case 18:
         this.Y = new String[]{Caption.tZ};
         this.Z = new byte[]{var2};
         break;
      case 19:
      case 30:
      case 35:
      case 37:
      case 38:
         this.Y = Caption.yJ;
         this.Z = new byte[]{37, 38, 19, 30, 35};
         break;
      case 32:
         this.Y = new String[]{Caption.ub};
         this.Z = new byte[]{var2};
         break;
      case 33:
         this.Y = new String[]{Caption.uc};
         this.Z = new byte[]{var2};
         break;
      case 34:
         this.Y = new String[]{Caption.bb};
         this.Z = new byte[]{var2};
         break;
      case 36:
         this.Y = new String[]{Caption.ua};
         this.Z = new byte[]{var2};
      }

      this.I = var1;
      this.K = false;
      this.Q = new VDTT_iq(new VDTT_hp(1001, this.Y), this);
      this.aa = new boolean[this.Y.length];
      this.O = new Item[this.Y.length][];
      this.T = new VDTT_ba[this.Y.length][];
      this.S = new VDTT_hs[this.Y.length][];
      this.R = new VDTT_ht[this.Y.length];
      this.Q.a(var4);
      this.g(this.Q.h());
      this.C();
   }

   public final void g(int var1) {
      if (this.O[this.Q.h()] == null) {
         this.aa[var1] = false;
         this.O[var1] = new Item[VDTT_cw.v().Y.size()];
         int var2;
         int var3;
         int var4;
         int var5;
         int var6;
         if (!DataCenter.l()) {
            this.R[var1] = new VDTT_ht((byte)1, 10, this.f() + 15 + 22, this.U * 3, this.V * 3, this.V, VDTT_jb.c(this.O[var1].length, 3), 3);
            this.T[var1] = new VDTT_ba[this.O[var1].length];
            this.S[var1] = new VDTT_hs[this.O[var1].length];
            var4 = 0;

            for(var5 = 0; var5 < this.R[var1].i; ++var5) {
               var3 = var5 * this.V;

               for(var6 = 0; var6 < this.R[var1].P; ++var6) {
                  var2 = var6 * this.U;
                  this.O[var1][var4] = (Item)VDTT_cw.v().Y.elementAt(var4);
                  this.T[var1][var4] = new VDTT_ba(var2 + 40, var3 + 14, 0, 0, "", this, 1000, this.O[var1][var4].d());
                  this.S[var1][var4] = new VDTT_hx((byte)1, 0, 0, this.T[var1][var5].q, this.T[var1][var5].r, this.T[var1][var5].r, 1, this.R[var1]);
                  ++var4;
                  if (var4 >= this.T[var1].length) {
                     break;
                  }
               }

               if (var4 >= this.T[var1].length) {
                  break;
               }
            }

            return;
         }

         this.U *= 3;
         this.V = 40;
         this.R[var1] = new VDTT_ht((byte)1, 10, this.f() + 15 + 7, this.U, this.V * 4, this.V, this.O[var1].length, 1);
         this.T[var1] = new VDTT_ba[this.O[var1].length];
         this.S[var1] = new VDTT_hs[this.O[var1].length];
         var4 = 0;

         for(var5 = 0; var5 < this.R[var1].i; ++var5) {
            var3 = var5 * this.V;

            for(var6 = 0; var6 < this.R[var1].P; ++var6) {
               var2 = var6 * this.U;
               this.O[var1][var4] = (Item)VDTT_cw.v().Y.elementAt(var4);
               this.T[var1][var4] = new VDTT_ba(var2 + this.U - 60, var3 + 8, 0, 0, "", this, 1000, this.O[var1][var4].d());
               this.S[var1][var4] = new VDTT_hx((byte)1, 0, 5, this.T[var1][var5].q, this.T[var1][var5].r, this.T[var1][var5].r, 1, this.R[var1]);
               ++var4;
               if (var4 >= this.T[var1].length) {
                  break;
               }
            }

            if (var4 >= this.T[var1].length) {
               break;
            }
         }
      }

   }

   public final void f(int var1) {
      super.f(var1);
      if (this.Q != null && super.a.b == 0) {
         this.Q.a(this.Q.h());
         this.C();
      }

   }

   private void C() {
      this.W = this.X = -1;
      this.P = this.Z[this.Q.h()];
      if (this.O[this.Q.h()] == null) {
         this.aa[this.Q.h()] = true;
         switch(this.P) {
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
            VDTT_cw.v();
            VDTT_cw.i(this.P, this.Q.h() + 1);
            return;
         case 18:
         case 19:
         default:
            VDTT_cw.v();
            VDTT_cw.o(this.P);
         }
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      super.b(var1);
      if (super.a.b == 0) {
         if (!DataCenter.l()) {
            this.Q.a(var1);
         }

         if (this.aa[this.Q.h()]) {
            return;
         }

         if (this.O[this.Q.h()].length == 0) {
            VDTT_dg.a(VDTT_dg.e, var1, Caption.vO, this.q / 2, this.r / 2 + 10, 2, -2560, 2, 1);
            return;
         }

         if (this.P == 38) {
            VDTT_dg.a(var1, Caption.xx, 4 + (super.q - 8) / 2, this.r - 16, 2, -2560);
         }

         this.a(var1, this.R[this.Q.h()]);
         int var4 = 0;

         for(int var7 = 0; var7 < this.R[this.Q.h()].i; ++var7) {
            int var3 = var7 * this.V;

            for(int var8 = 0; var8 < this.R[this.Q.h()].P; ++var8) {
               int var2 = var8 * this.U;
               if (this.R[this.Q.h()].b(var7)) {
                  var1.c(-2965602);
                  this.a(var1, var2, var3, this.U - 2, this.V - 2, 61, 55, 56);
                  var1.f();
                  b(var1, var2 + 5, var3 + 5, this.O[this.Q.h()][var4], this.W == var4);
                  int var5 = var1.e;
                  int var6 = var1.f;
                  if (DataCenter.l()) {
                     VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, VDTT_jb.a(this.O[this.Q.h()][var4].getItemTemplate().b, 28), var2 + 40, var3 + 11, 0, -6488, -10275328);
                     VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.aI + " " + VDTT_jb.c(this.O[this.Q.h()][var4].c()), var2 + 40, var3 + 23, 0, -1, -11184811);
                     this.a(var1, var5 + this.T[this.Q.h()][var4].objX, var6 + this.T[this.Q.h()][var4].objY);
                  } else {
                     VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, VDTT_jb.a(this.O[this.Q.h()][var4].getItemTemplate().b, 28), var2 + 5, var3 + 39, 0, -6488, -10275328);
                     this.a(var1, var5 + this.T[this.Q.h()][var4].objX, var6 + this.T[this.Q.h()][var4].objY);
                     VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.aI + " " + VDTT_jb.c(this.O[this.Q.h()][var4].c()), 0, -6, 0, -1, -11184811);
                  }

                  this.T[this.Q.h()][var4].b(var1);
                  this.a(var1, var5, var6);
               }

               ++var4;
               if (var4 >= this.T[this.Q.h()].length) {
                  break;
               }
            }

            if (var4 >= this.T[this.Q.h()].length) {
               break;
            }
         }

         this.a(var1);
         this.R[this.Q.h()].b(var1, this);
      }

   }

   public final void a_() {
      if (!DataCenter.l()) {
         super.a_();
      }

      if (super.a.b == 0) {
         this.Q.e();
         if (this.aa[this.Q.h()]) {
            return;
         }

         this.R[this.Q.h()].a();

         for(int var1 = 0; var1 < this.T[this.Q.h()].length; ++var1) {
            this.T[this.Q.h()][var1].a_();
            this.S[this.Q.h()][var1].a();
            if (this.S[this.Q.h()][var1].l != -1) {
               this.T[this.Q.h()][var1].N = true;
            } else {
               this.T[this.Q.h()][var1].N = false;
            }
         }

         if (VDTT_cw.v().br == 3 && (this.P == 4 || this.P == 5)) {
            if (VDTT_cw.v().bs == 0) {
               int var10001 = this.objX + 80;
               DataCenter.d().aA.a(var10001, this.objY + 80);
               DataCenter.d().aA.b = true;
               return;
            }

            if (VDTT_cw.v().bs == 1) {
               DataCenter.d().aA.a(this.objX + this.q - 10, this.objY + 10);
               DataCenter.d().aA.b = true;
            }
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         if (this.aa[this.Q.h()]) {
            var1.addElement(this.Q.f());
            return var1;
         } else {
            for(int var4 = 0; var4 < this.T[this.Q.h()].length; ++var4) {
               int var2 = this.R[this.Q.h()].objX + this.T[this.Q.h()][var4].objX;
               int var3 = this.R[this.Q.h()].objY + this.T[this.Q.h()][var4].objY - this.R[this.Q.h()].f;
               if (VDTT_jb.a(this.R[this.Q.h()].objX, this.R[this.Q.h()].objY, this.R[this.Q.h()].objX + this.R[this.Q.h()].q, this.R[this.Q.h()].objY + this.R[this.Q.h()].r, var2, var3) && VDTT_jb.a(this.R[this.Q.h()].objX, this.R[this.Q.h()].objY, this.R[this.Q.h()].objX + this.R[this.Q.h()].q, this.R[this.Q.h()].objY + this.R[this.Q.h()].r, var2 + this.T[this.Q.h()][var4].q, var3 + this.T[this.Q.h()][var4].r)) {
                  this.S[this.Q.h()][var4].objX = (short)var2;
                  this.S[this.Q.h()][var4].objY = (short)var3;
                  var1.addElement(new VDTT_hl(2000 + var4, this.S[this.Q.h()][var4].objX, this.S[this.Q.h()][var4].objY, this.S[this.Q.h()][var4].objX + this.S[this.Q.h()][var4].q, this.S[this.Q.h()][var4].objY + this.S[this.Q.h()][var4].r, this.S[this.Q.h()][var4], this));
                  if (DataCenter.l()) {
                     var2 = this.R[this.Q.h()].objX + 40;
                     var1.addElement(new VDTT_hl(3000 + var4, var2 - 35, var3 - 3, var2 - 35 + 28, var3 - 3 + 28, this.R[this.Q.h()], this));
                  } else {
                     var1.addElement(new VDTT_hl(3000 + var4, var2 - 35, var3 - 9, var2 - 35 + 28, var3 - 9 + 28, this.R[this.Q.h()], this));
                  }
               }
            }

            if (!DataCenter.l()) {
               var1.addElement(this.Q.f());
            }

            var1.addElement(new VDTT_hl(1002, this.R[this.Q.h()].objX, this.R[this.Q.h()].objY, this.R[this.Q.h()].objX + this.R[this.Q.h()].q, this.R[this.Q.h()].objY + this.R[this.Q.h()].r, this.R[this.Q.h()], this));
            return var1;
         }
      } else {
         return var1;
      }
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      try {
         super.a(var1, var2, var3);
         if (super.a.b == 0) {
            this.W = this.X = -1;
            if (!this.aa[this.Q.h()]) {
               if (var1.b >= 3000) {
                  this.W = var1.b - 3000;
                  this.k = c(this, var1, this.O[this.Q.h()][this.W]);
               } else if (var1.b >= 2000) {
                  this.X = var1.b - 2000;
                  this.I.a((MainScreen)(new VDTT_jw(this.I, this.O[this.Q.h()][this.X], this.P)));
               }
            }

            switch(var1.b) {
            case 1001:
               if (var1.j.k >= 0) {
                  this.Q.a(var1.j.k);
                  this.C();
               }
            }
         }

      } catch (Exception var4) {
      }
   }
}
