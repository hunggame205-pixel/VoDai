package core.mchien.main2;

import java.util.Vector;

public final class VDTT_kn extends VDTT_ka {
   private VDTT_ht[] Q;
   private VDTT_ba R;
   private int S;
   public boolean O;
   public VDTT_hi P;

   public VDTT_kn(VDTT_p var1) {
      super(var1, new String[]{Caption.rm, Caption.P});
      this.ab = new Item[3];
      this.Q = new VDTT_ht[3];
      this.Q[0] = new VDTT_ht((byte)1, 94, this.f() + 20, 30, 30, 30, 1, 1);
      this.Q[1] = new VDTT_ht((byte)1, 174, this.f() + 20, 30, 30, 30, 1, 1);
      this.Q[2] = new VDTT_ht((byte)1, 134, this.f() + 65, 30, 30, 30, 1, 1);
      this.R = this.a(this.q - 70, this.r - 33, Caption.rm, this, 0, -8);
      this.a(this.R, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].D()) {
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
         } else {
            this.B();
         }

         if (this.P != null) {
            this.P.o();
            if (this.P.p()) {
               this.P = null;
            }
         }

         if (this.S > 0) {
            --this.S;
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
            VDTT_dg.b(VDTT_dg.d, var1, Caption.rl, 4 + (super.q - 8) / 2, this.f() + 11, 2, -10831436, -16777216);
            a(var1, this.Q[0].objX, this.Q[0].objY, this.ab[0], this.Q[0].k >= 0, Caption.pI);
            a(var1, this.Q[1].objX, this.Q[1].objY, this.ab[1], this.Q[1].k >= 0, Caption.pI);
            a(var1, this.Q[2].objX, this.Q[2].objY, this.ab[2], this.Q[2].k >= 0, Caption.bS);
            VDTT_dc.a(var1, 95, 0, 142 - DataCenter.d().h / 3 % 3, this.f() + 25, 20);
            if (this.ab[0] != null) {
               VDTT_dg.b(VDTT_dg.d, var1, "(" + this.ab[0].ah() + ")", 108, this.f() + 60, 33, -1, -16777216);
            }

            if (this.ab[1] != null) {
               VDTT_dg.b(VDTT_dg.d, var1, "(" + this.ab[1].ah() + ")", 188, this.f() + 60, 33, -1, -16777216);
            }

            if (this.O && (this.S > 0 && DataCenter.d().h % 12 > 6 || this.S == 0)) {
               VDTT_dg.d(VDTT_dg.d, var1, VDTT_jb.b(Caption.fm, Caption.rm.toLowerCase()), this.q / 2, this.f() + 108, 2, -2560, -16777216);
            }

            if (this.P != null) {
               this.P.b(var1, this.Q[1].objX + this.Q[1].h / 2, this.Q[1].objY + this.Q[1].h / 2);
            }
         }

      } catch (Exception var3) {
         VDTT_jb.a(var3);
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
            this.a(true);
            return;
         case 1001:
            this.ad = 1;
            this.a(var1.j, var1.j.k);
            if (this.ab[0] == null) {
               this.k = b(Caption.rp, this, var1.j.objX + 32, var1.j.objY, 100);
               return;
            }

            this.k = a(var1, this, this.ab[0]);
            return;
         case 1002:
            this.ad = 2;
            this.a(var1.j, var1.j.k);
            if (this.ab[1] == null) {
               this.k = b(Caption.rq, this, var1.j.objX + 32, var1.j.objY, 100);
               return;
            }

            this.k = a(var1, this, this.ab[1]);
            return;
         case 1003:
            this.ad = 3;
            this.a(var1.j, var1.j.k);
            if (this.ab[2] == null) {
               this.k = b(Caption.ro, this, var1.j.objX + 32, var1.j.objY, 100);
               return;
            }

            this.k = a(var1, this, this.ab[2]);
            return;
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
      if (this.O) {
         this.O = false;

         for(var1 = 0; var1 < this.ab.length; ++var1) {
            this.ab[var1] = null;
         }
      }

   }

   public final void d() {
      super.d();
   }

   private void a(boolean var1) {
      try {
         if (this.O) {
            this.S = 50;
         } else if (this.ab[0] != null && this.ab[1] != null && this.ab[2] != null) {
            if (this.ab[0].getItemTemplate().f != this.ab[1].getItemTemplate().f) {
               DataCenter.d().ai.c(Caption.fv, -65536);
            } else if (var1) {
               DataCenter.d().ai.a(Caption.pI + " " + VDTT_jb.b(Caption.fz, Caption.rm.toLowerCase()), 2001, this);
            } else {
               Message var3;
               (var3 = Message.c((byte)-43)).a(this.ab[0].w);
               var3.b(this.ab[0].f);
               var3.a(this.ab[1].w);
               var3.b(this.ab[1].f);
               var3.b(this.ab[2].f);
               var3.l();
            }
         } else {
            DataCenter.d().ai.c(Caption.rl, -65536);
         }
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }
}
