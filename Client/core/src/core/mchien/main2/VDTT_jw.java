package core.mchien.main2;

import java.util.Vector;

public final class VDTT_jw extends VDTT_ar {
   private VDTT_ca c;
   private Item d;
   private byte N;
   private VDTT_ht O;
   private int P;
   private boolean Q = true;
   private String R = "";
   private int S = 0;
   public byte a;
   public boolean b;

   public VDTT_jw(VDTT_p var1, Item var2, byte var3) {
      this.a = var3;
      this.e = 2;
      this.I = var1;
      this.d = var2;
      this.K = false;
      if (var2.m > 0) {
         this.N = 2;
      } else if (var2.n > 0) {
         this.N = 3;
      } else if (var2.k > 0) {
         this.N = 0;
      } else if (var2.l > 0) {
         this.N = 1;
      } else if (var2.o > 0) {
         this.N = 4;
      }

      this.a(220, 155);
      this.c = this.a(54, 5 + 38, 60, "", this, 2);
      byte var6 = 4;
      this.c.l = var6;
      boolean var7 = true;
      this.c.S = 1;
      short var8 = 999;
      this.c.T = var8;
      this.c.a("1");
      this.a(this.c);
      VDTT_ba var9 = this.a(119, 5 + 41, "", this, 1001, 58);
      VDTT_ba var4 = this.a(140, 5 + 41, "", this, 1002, 57);
      VDTT_ba var5;
      (var5 = this.a(Caption.i, 1003)).b(-8);
      var5.f(var5.objX - 26, var5.objY);
      (var5 = this.a(Caption.D, -7)).b(-8);
      var5.f(var5.objX + 40, var5.objY);
      this.O = new VDTT_ht((byte)1, 9, 9, 30, 30, 30, 1, 1);
      if (var3 == 40 && var2.e > 0 && var2.b >= 196 && var2.b <= 200) {
         int var10 = var2.e;
         this.c.T = var10;
      } else {
         if (var3 == 40 || var3 == 38 || var3 == 18 || var3 == 36 || var3 == 32 || var3 == 33 || var3 == 34 || var2.c == 826) {
            var9.b(true);
            var4.b(true);
            this.c.a(true);
         }

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
      b(var1, this.O.objX, this.O.objY, this.d, this.b);
      VDTT_dg.b(VDTT_dg.d, var1, this.d.getItemTemplate().b, 44, 5 + 10, 0, -1, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.aI, 44, 5 + 25, 0, -10831436, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(this.d.c()), 64, 5 + 25, 0, -1, -16777216);
      a(var1, 64, 5 + 25, VDTT_jb.c(this.d.c()), this.N);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.aM, 9, 5 + 50, 0, -10831436, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.aN, 9, 5 + 70, 0, -10831436, -16777216);
      a(var1, 54, 5 + 70, VDTT_jb.c(this.P), this.N);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.aO, 9, 5 + 90, 0, -10831436, -16777216);
      if (this.d.m <= 0 && this.d.n <= 0) {
         VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(this.P), 54, 5 + 70, 0, -3089954, -16777216);
         VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(this.R), 54, 5 + 90, 0, -3089954, -16777216);
      } else {
         VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(this.P), 54, 5 + 70, 0, -2560, -16777216);
         VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(this.R), 54, 5 + 90, 0, -2560, -16777216);
      }

      a(var1, 54, 5 + 90, VDTT_jb.c(this.R), this.N);
      if (!this.Q && (this.S == 0 || this.S % 10 > 5)) {
         VDTT_dg.b(VDTT_dg.d, var1, Caption.bf + " " + this.d.f(), 9, 5 + 108, 0, -65536, -16777216);
      }

   }

   public final void a_() {
      this.Q = true;
      this.P = this.c.h() * this.d.c();
      if (this.P < 0) {
         this.c.a(0);
      } else {
         if (this.d.m > 0) {
            this.R = VDTT_jb.c(VDTT_ek.m().an);
            if (VDTT_ek.m().an < this.P) {
               this.Q = false;
            }
         } else if (this.d.n > 0) {
            this.R = VDTT_jb.c(VDTT_ek.m().am);
            if (VDTT_ek.m().am < this.P) {
               this.Q = false;
            }
         } else if (this.d.k > 0) {
            this.R = VDTT_jb.c(VDTT_ek.m().ak);
            if (VDTT_ek.m().ak < this.P) {
               this.Q = false;
            }
         } else if (this.d.l > 0) {
            this.R = VDTT_jb.c(VDTT_ek.m().al);
            if (VDTT_ek.m().al < this.P) {
               this.Q = false;
            }
         } else if (this.d.o > 0) {
            this.R = "" + VDTT_cw.v().bT;
            if (VDTT_cw.v().bT < this.P) {
               this.Q = false;
            }
         }

         if (this.S > 0) {
            --this.S;
         }

         DataCenter.d();
         if (!DataCenter.b() && VDTT_cw.v().br == 3 && VDTT_cw.v().bs == 0) {
            int var10001;
            if (this.P >= 3) {
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
      (var1 = super.g()).addElement(this.O.a(1000, this));
      var1.addElement(new VDTT_hl(0, 0, 0, this.q, this.r, this.J, this));
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.b = false;
      switch(var1.b) {
      case 1000:
         this.b = true;
         this.k = a(this, var1, this.d);
         return;
      case 1001:
         this.c.a(this.c.h() - 1);
         if (this.c.h() < this.c.S) {
            this.c.a(this.c.S);
            return;
         }
         break;
      case 1002:
         this.c.a(this.c.h() + 1);
         return;
      case 1003:
         if (this.P <= 0) {
            return;
         }

         if (!this.Q) {
            this.S = 50;
            return;
         }

         VDTT_jw var5 = this;

         try {
            Message var6;
            (var6 = new Message((byte)121)).b(var5.d.b);
            var6.b(var5.c.h());
            var6.l();
            return;
         } catch (Exception var4) {
            VDTT_jb.a(var4);
         }
      }

   }
}
