package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ne extends VDTT_ka {
   private VDTT_ht[] Q;
   private VDTT_ba R;
   private int S = 50000;
   public int O = 0;
   public VDTT_hi P;
   private String T = "";

   public VDTT_ne(VDTT_p var1) {
      super(var1, new String[]{Caption.rd, Caption.P});
      this.ab = new Item[16];
      this.ac = new Item[2];
      this.Q = new VDTT_ht[4];
      this.Q[0] = new VDTT_ht((byte)1, 162, this.f() + 20, 30, 30, 30, 1, 1);
      this.Q[1] = new VDTT_ht((byte)1, 242, this.f() + 20, 30, 30, 30, 1, 1);
      this.Q[2] = new VDTT_ht((byte)1, 202, this.f() + 65, 30, 30, 30, 1, 1);
      this.Q[3] = new VDTT_ht((byte)1, 14, this.f() + 20, 128, 128, 32, 4, 4);
      this.R = this.a(this.q - 70, this.r - 33, Caption.bG, this, 0, -8);
      this.a(this.R, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].F()) {
            this.ak.add(var1[var2]);
         }
      }

   }

   public final void a_() {
      try {
         super.a_();
         if (super.a.b == 0) {
            for(int var1 = 0; var1 < this.Q.length; ++var1) {
               this.Q[var1].a();
            }

            if (this.ac[0] != null && this.ac[0].F()) {
               if (this.ac[1] == null || !this.T.equals(this.ac[0].strOptions)) {
                  this.T = this.ac[0].strOptions;
                  this.ac[1] = this.ac[0].a();
                  this.ac[1].t = true;
                  int var2;
                  if ((var2 = this.ac[1].s + 1) > 16) {
                     var2 = 16;
                  }

                  this.ac[1].a(var2);
               }
            } else if (this.O == 0) {
               this.ac[1] = null;
            }
         } else {
            this.B();
         }

         if (this.P != null) {
            this.P.o();
            if (this.P.p()) {
               this.P = null;
            }
         }

      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }

   public final void b(Graphics var1) {
      try {
         if (this.w() <= 0) {
            this.a(var1, this.objX, this.objY, this.q, this.r, Caption.y, (byte)2, this.K);
         } else {
            super.b(var1);
         }

         if (super.a.b == 0) {
            VDTT_dg.b(VDTT_dg.d, var1, Caption.re, 14, this.f() + 11, 0, -10831436, -16777216);
            a(var1, this.Q[0].objX, this.Q[0].objY, this.ac[0], this.Q[0].k >= 0, Caption.pI);
            a(var1, this.Q[1].objX, this.Q[1].objY, this.ac[1], this.Q[1].k >= 0, Caption.Q);
            VDTT_dc.a(var1, 95, 0, 210 - DataCenter.d().h / 3 % 3, this.f() + 25, 20);
            if (this.ac[1] != null) {
               VDTT_dg.b(VDTT_dg.d, var1, "(" + this.ac[1].ah() + ")", 256, this.f() + 60, 33, -1, -16777216);
            }

            if (this.O == 1) {
               if (DataCenter.d().h % 20 > 12) {
                  VDTT_dg.d(VDTT_dg.d, var1, Caption.kX, 149, this.f() + 108, 0, -2560, -16777216);
               }
            } else if (this.O == 2) {
               if (DataCenter.d().h % 20 > 12) {
                  VDTT_dg.d(VDTT_dg.d, var1, Caption.rj, 149, this.f() + 108, 0, -1, -16777216);
               }
            } else if (this.ac[0] != null) {
               VDTT_dg.b(VDTT_dg.d, var1, "(" + this.ac[0].ah() + ")", 176, this.f() + 60, 33, -1, -16777216);
               if (this.ac[0].F()) {
                  VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.pj, VDTT_jb.c(this.ac[1].s * this.S)), 147, this.f() + 95, 0, -1, -16777216);
                  VDTT_dg.b(VDTT_dg.d, var1, Caption.qV, 147, this.f() + 110, 0, -1, -16777216);
                  VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.rh, "" + (64 - this.ac[0].s * 2)), 147, this.f() + 125, 0, -1, -16777216);
                  VDTT_dg.b(VDTT_dg.d, var1, Caption.ri, 147, this.f() + 140, 0, -6488, -16777216);
               } else {
                  VDTT_dg.d(VDTT_dg.d, var1, Caption.rg, 149, this.f() + 108, 0, -2560, -16777216);
               }
            }

            this.a(var1, this.Q[3]);

            for(int var2 = 0; var2 < this.Q[3].i; ++var2) {
               for(int var3 = 0; var3 < this.Q[3].P; ++var3) {
                  b(var1, var3 * this.Q[3].h, var2 * this.Q[3].h, this.ab[var2 * this.Q[3].P + var3], var2 * this.Q[3].i + var3 == this.Q[3].k, "");
               }
            }

            this.a(var1);
            if (this.P != null) {
               this.P.b(var1, this.Q[1].objX + this.Q[1].h / 2, this.Q[1].objY + this.Q[1].h / 2);
            }
         }

      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }
   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.Q.length; ++var2) {
            var1.addElement(this.Q[var2].a(1001 + var2, this));
         }
      }

      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         super.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 0:
            this.a(false);
            return;
         case 1001:
            this.ad = 1;
            this.a(var1.j, var1.j.k);
            if (this.ac[0] == null) {
               this.f(2);
               DataCenter.d().ai.c(Caption.rf, -1);
               return;
            }

            this.k = a(var1, this, this.ac[0]);
            return;
         case 1002:
            this.ad = 10;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.ac[1]);
            return;
         case 1004:
            try {
               this.ad = 2;
               this.a(var1.j, var1.j.k);
               this.k = a(var1, this, this.ab[var1.j.k]);
               return;
            } catch (Exception var5) {
               return;
            }
         case 2001:
            this.a(false);
         }
      }

   }

   private void a(VDTT_hs var1, int var2) {
      for(int var3 = 0; var3 < this.Q.length; ++var3) {
         this.Q[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void f(int var1) {
      super.f(var1);
      this.O = 0;
   }

   public final void d() {
      super.d();
   }

   private void a(boolean var1) {
      try {
         int var4 = 0;

         for(int var2 = 0; var2 < this.ab.length; ++var2) {
            if (this.ab[var2] != null) {
               ++var4;
            }
         }

         if (this.ac[0] != null && var4 != 0) {
            Message var5;
            (var5 = Message.c((byte)-44)).a(this.ac[0].w);
            var5.b(this.ac[0].f);
            var5.a(var4);

            for(var4 = 0; var4 < this.ab.length; ++var4) {
               if (this.ab[var4] != null) {
                  var5.b(this.ab[var4].f);
               }
            }

            var5.l();
         } else {
            DataCenter.d().ai.c(Caption.re, -65536);
         }
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }
}
