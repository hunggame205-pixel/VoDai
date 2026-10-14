package core.mchien.main2;

import java.util.Vector;

public final class VDTT_jv extends VDTT_ar {
   private VDTT_ca b;
   private Item c;
   private byte d;
   private VDTT_ht N;
   private int O;
   private boolean P = true;
   private String Q = "";
   private int R = 0;
   public byte a;
   private VDTT_ki S;

   public VDTT_jv(VDTT_p var1, Item var2, byte var3, VDTT_ki var4) {
      this.S = var4;
      this.a = 0;
      this.e = 2;
      this.I = var1;
      this.c = var2;
      this.K = false;
      if (var2.m > 0) {
         this.d = 2;
      } else if (var2.n > 0) {
         this.d = 3;
      } else if (var2.k > 0) {
         this.d = 0;
      } else if (var2.l > 0) {
         this.d = 1;
      } else if (var2.p > 0) {
         this.d = 7;
      } else if (var2.o > 0) {
         this.d = 4;
      }

      this.a(220, 168);
      this.b = this.a(54, 5 + 38, 60, "", this, 2);
      byte var5 = 4;
      this.b.l = var5;
      boolean var6 = true;
      this.b.S = 1;
      short var7 = 999;
      this.b.T = var7;
      this.b.a("1");
      VDTT_ba var8 = this.a(119, 5 + 41, "", this, 1001, 58);
      VDTT_ba var9 = this.a(140, 5 + 41, "", this, 1002, 57);
      VDTT_ba var10;
      (var10 = this.a(Caption.i, 1003)).b(-8);
      var10.f(var10.objX - 26, var10.objY);
      (var10 = this.a(Caption.D, -7)).b(-8);
      var10.f(var10.objX + 40, var10.objY);
      this.N = new VDTT_ht((byte)1, 9, 9, 30, 30, 30, 1, 1);
      if (var2.c == 820) {
         var8.b(true);
         var9.b(true);
         this.b.a(true);
      }

   }

   public final void a(int var1, Object var2) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final int f() {
      return 5;
   }

   public final void b(Graphics var1) {
      this.e(var1);
      b(var1, this.N.objX, this.N.objY, this.c, false);
      VDTT_dg.b(VDTT_dg.d, var1, this.c.getItemTemplate().b, 44, 5 + 10, 0, -1, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.aI, 44, 5 + 25, 0, -10831436, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(this.c.c()), 64, 5 + 25, 0, -1, -16777216);
      a(var1, 64, 5 + 25, VDTT_jb.c(this.c.c()), this.d);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.aM, 9, 5 + 50, 0, -10831436, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.aN, 9, 5 + 70, 0, -10831436, -16777216);
      a(var1, 54, 5 + 70, VDTT_jb.c(this.O), this.d);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.aO, 9, 5 + 90, 0, -10831436, -16777216);
      if (this.c.k > 0) {
         VDTT_dg.b(VDTT_dg.d, var1, Caption.sv, 9, 5 + 105, 0, -6488, -16777216);
      } else if (this.c.p > 0) {
         VDTT_dg.b(VDTT_dg.d, var1, Caption.vs, 9, 5 + 105, 0, -6488, -16777216);
      }

      if (this.c.m <= 0 && this.c.n <= 0) {
         VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(this.O), 54, 5 + 70, 0, -3089954, -16777216);
         VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(this.Q), 54, 5 + 90, 0, -3089954, -16777216);
      } else {
         VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(this.O), 54, 5 + 70, 0, -2560, -16777216);
         VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(this.Q), 54, 5 + 90, 0, -2560, -16777216);
      }

      a(var1, 54, 5 + 90, this.Q, this.d);
      if (!this.P && (this.R == 0 || this.R % 10 > 5)) {
         VDTT_dg.b(VDTT_dg.d, var1, Caption.bf + " " + this.c.f(), 9, 5 + 118, 0, -65536, -16777216);
      }

   }

   public final void a_() {
      this.P = true;
      this.O = this.b.h() * this.c.c();
      if (this.O < 0) {
         this.b.a(0);
      } else {
         if (this.c.m > 0) {
            this.Q = VDTT_jb.c(VDTT_ek.m().an);
            if (VDTT_ek.m().an < this.O) {
               this.P = false;
            }
         } else if (this.c.n > 0) {
            this.Q = VDTT_jb.c(VDTT_ek.m().am);
            if (VDTT_ek.m().am < this.O) {
               this.P = false;
            }
         } else if (this.c.k > 0) {
            this.Q = VDTT_jb.c(this.S.U);
            if (this.S.U < this.O) {
               this.P = false;
            }
         } else if (this.c.l > 0) {
            this.Q = VDTT_jb.c(VDTT_ek.m().al);
            if (VDTT_ek.m().al < this.O) {
               this.P = false;
            }
         } else if (this.c.p > 0) {
            this.Q = "" + VDTT_cw.v().bU;
            if (VDTT_cw.v().bU < this.O) {
               this.P = false;
            }
         } else if (this.c.o > 0) {
            this.Q = "" + VDTT_cw.v().bT;
            if (VDTT_cw.v().bT < this.O) {
               this.P = false;
            }
         }

         if (this.R > 0) {
            --this.R;
         }

         DataCenter.d();
         if (!DataCenter.b() && VDTT_cw.v().br == 3 && VDTT_cw.v().bs == 0) {
            int var10001;
            if (this.O >= 3) {
               var10001 = this.objX + 75;
               DataCenter.d().aA.a(var10001, this.objY + 140);
            } else {
               var10001 = this.objX + 150;
               DataCenter.d().aA.a(var10001, this.objY + 48);
            }

            DataCenter.d().aA.b = true;
         }

      }
   }

   public final Vector g() {
      if (this.J != null) {
         this.J.q = 0;
      }

      Vector var1;
      (var1 = super.g()).addElement(this.N.a(1000, this));
      var1.addElement(new VDTT_hl(0, 0, 0, this.q, this.r, this.J, this));
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1000:
         this.k = a(this, var1, this.c);
         return;
      case 1001:
         this.b.a(this.b.h() - 1);
         if (this.b.h() < this.b.S) {
            this.b.a(this.b.S);
            return;
         }
         break;
      case 1002:
         this.b.a(this.b.h() + 1);
         return;
      case 1003:
         if (this.O <= 0) {
            return;
         }

         if (!this.P) {
            this.R = 50;
            return;
         }

         VDTT_jv var5 = this;

         try {
            Message var6;
            (var6 = Message.c((byte)-34)).b(var5.c.b);
            var6.b(var5.b.h());
            var6.l();
            return;
         } catch (Exception var4) {
            VDTT_jb.a(var4);
         }
      }

   }
}
