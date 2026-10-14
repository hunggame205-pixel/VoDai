package core.mchien.main2;

import java.util.Vector;

public final class VDTT_km extends VDTT_ka {
   public Item[] O = new Item[3];
   private VDTT_ht[] S = new VDTT_ht[3];
   private VDTT_ba T;
   public int P;
   private int W;
   public boolean Q;
   public VDTT_hi R;

   public VDTT_km(VDTT_p var1) {
      super(var1, new String[]{Caption.bC, Caption.P});
      this.S[0] = new VDTT_ht((byte)1, 94, this.f() + 20, 30, 30, 30, 1, 1);
      this.S[1] = new VDTT_ht((byte)1, 174, this.f() + 20, 30, 30, 30, 1, 1);
      this.S[2] = new VDTT_ht((byte)1, 134, this.f() + 65, 30, 30, 30, 1, 1);
      this.T = this.a(this.q - 70, this.r - 33, Caption.bC, this, 0, -8);
      this.a(this.T, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].E()) {
            this.ak.add(var1[var2]);
         }
      }

   }

   public final void a_() {
      try {
         super.a_();
         if (super.a.b == 0) {
            for(int var1 = 0; var1 < this.S.length; ++var1) {
               this.S[var1].a();
            }
         } else {
            this.B();
         }

         if (this.R != null) {
            this.R.o();
            if (this.R.p()) {
               this.R = null;
            }
         }

         if (this.W > 0) {
            --this.W;
         }

      } catch (Exception var2) {
         VDTT_jb.a(var2);
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
            VDTT_dg.b(VDTT_dg.d, var1, Caption.fu, 4 + (super.q - 8) / 2, this.f() + 11, 2, -10831436, -16777216);
            a(var1, this.S[0].objX, this.S[0].objY, this.O[0], this.S[0].k >= 0, Caption.bD);
            a(var1, this.S[1].objX, this.S[1].objY, this.O[1], this.S[1].k >= 0, Caption.bD);
            a(var1, this.S[2].objX, this.S[2].objY, this.O[2], this.S[2].k >= 0, Caption.bS);
            VDTT_dc.a(var1, 95, 0, 142 - DataCenter.d().h / 3 % 3, this.f() + 25, 20);
            if (this.O[0] != null) {
               VDTT_dg.b(VDTT_dg.d, var1, "(" + this.O[0].ah() + ")", 108, this.f() + 60, 33, -1, -16777216);
            }

            if (this.O[1] != null) {
               VDTT_dg.b(VDTT_dg.d, var1, "(" + this.O[1].ah() + ")", 188, this.f() + 60, 33, -1, -16777216);
            }

            if (this.Q && (this.W > 0 && DataCenter.d().h % 12 > 6 || this.W == 0)) {
               VDTT_dg.d(VDTT_dg.d, var1, VDTT_jb.b(Caption.fm, Caption.bC.toLowerCase()), this.q / 2, this.f() + 108, 2, -2560, -16777216);
            }

            if (this.R != null) {
               this.R.b(var1, this.S[1].objX + this.S[1].h / 2, this.S[1].objY + this.S[1].h / 2);
            }
         }

      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.S.length; ++var2) {
            var1.addElement(this.S[var2].a(1001 + var2, this));
         }
      }

      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         this.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 0:
            this.a(true);
            return;
         case 1001:
            this.P = 1;
            this.a(var1.j, var1.j.k);
            if (this.O[0] == null) {
               this.k = b(Caption.fq, this, var1.j.objX + 32, var1.j.objY, 100);
               return;
            }

            this.k = a(var1, this, this.O[0]);
            return;
         case 1002:
            this.P = 2;
            this.a(var1.j, var1.j.k);
            if (this.O[1] == null) {
               this.k = b(Caption.fr, this, var1.j.objX + 32, var1.j.objY, 100);
               return;
            }

            this.k = a(var1, this, this.O[1]);
            return;
         case 1003:
            this.P = 3;
            this.a(var1.j, var1.j.k);
            if (this.O[2] == null) {
               this.k = b(Caption.fs, this, var1.j.objX + 32, var1.j.objY, 100);
               return;
            }

            this.k = a(var1, this, this.O[2]);
            return;
         case 2001:
            this.a(false);
         }
      }

   }

   private void a(VDTT_hs var1, int var2) {
      for(int var3 = 0; var3 < this.S.length; ++var3) {
         this.S[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void f(int var1) {
      super.f(var1);
      if (this.Q) {
         this.Q = false;

         for(var1 = 0; var1 < this.O.length; ++var1) {
            this.O[var1] = null;
         }
      }

   }

   public final void d() {
      super.d();

      for(int var1 = 0; var1 < this.O.length; ++var1) {
         if (this.O[var1] != null) {
            VDTT_ek.m().i(this.O[var1].w)[this.O[var1].f] = this.O[var1];
            this.O[var1] = null;
         }
      }

   }

   private void a(boolean var1) {
      try {
         if (this.Q) {
            this.W = 50;
         } else if (this.O[0] != null && this.O[1] != null && this.O[2] != null) {
            if (this.O[0].getItemTemplate().f != this.O[1].getItemTemplate().f) {
               DataCenter.d().ai.c(Caption.fv, -65536);
            } else if (this.O[0].s > 14 && this.O[2].c != 158) {
               DataCenter.d().ai.c(Caption.fx, -65536);
            } else if (this.O[0].s > 10 && this.O[2].c != 158 && this.O[2].c != 157) {
               DataCenter.d().ai.c(Caption.fy, -65536);
            } else {
               Message var3;
               (var3 = Message.c((byte)18)).a(this.O[0].w);
               var3.b(this.O[0].f);
               var3.a(this.O[1].w);
               var3.b(this.O[1].f);
               var3.b(this.O[2].f);
               var3.l();
            }
         } else {
            DataCenter.d().ai.c(Caption.fu, -65536);
         }
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }
}
