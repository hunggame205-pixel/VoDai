package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ko extends VDTT_jr {
   private VDTT_ht[] R;
   private VDTT_ba S;
   public VDTT_hi O;
   public Item P;
   public int Q = -1;

   public VDTT_ko(VDTT_p var1) {
      super(var1, new String[]{Caption.yU[8]});
      this.ab = new Item[4];
      this.ac = new Item[4];
      this.R = new VDTT_ht[5];
      this.R[0] = new VDTT_ht((byte)1, 114, this.f() + 20, 30, 30, 30, 1, 1);
      this.R[1] = new VDTT_ht((byte)1, 156, this.f() + 20, 30, 30, 30, 1, 1);
      this.R[2] = new VDTT_ht((byte)1, 198, this.f() + 20, 30, 30, 30, 1, 1);
      this.R[3] = new VDTT_ht((byte)1, 240, this.f() + 20, 30, 30, 30, 1, 1);
      this.R[4] = new VDTT_ht((byte)0, 14, this.f() + 20, 64, 64, 32, 2, 2);
      this.S = this.a(this.q - 70, this.r - 33, Caption.bF, this, 0, -8);
      this.a(this.S, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].c == 683) {
            this.ak.add(var1[var2]);
         }
      }

   }

   public final void f(int var1) {
      super.f(var1);
      this.Q = -1;
   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         for(int var1 = 0; var1 < this.R.length; ++var1) {
            this.R[var1].a();
         }
      } else {
         this.B();
      }

      if (this.O != null) {
         this.O.o();
         if (this.O.p()) {
            this.O = null;
         }
      }

   }

   public final void b(Graphics var1) {
      if (this.w() <= 0) {
         this.a(var1, this.objX, this.objY, this.q, this.r, Caption.y, (byte)2, this.K);
      } else {
         super.b(var1);
      }

      if (super.a.b == 0) {
         VDTT_dg.b(VDTT_dg.d, var1, Caption.ra, 14, this.f() + 11, 0, -10831436, -16777216);
         VDTT_dc.a(var1, 95, 0, 87 - DataCenter.d().h / 3 % 3, this.f() + 25, 20);
         if (this.Q >= 0) {
            if (DataCenter.d().h % 20 > 12) {
               if (this.Q == 0) {
                  VDTT_dg.b(VDTT_dg.d, var1, Caption.rc, this.R[0].objX, this.f() + 90, 0, -6488, -16777216);
               } else {
                  VDTT_dg.b(VDTT_dg.d, var1, Caption.pl + " " + this.P.getItemTemplate().b, this.R[0].objX, this.f() + 90, 0, -2560, -16777216);
               }
            }
         } else {
            VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.pj, VDTT_jb.c(100000)), this.R[0].objX, this.f() + 60, 0, -1, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, Caption.qV, this.R[0].objX, this.f() + 75, 0, -1, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, Caption.fJ, this.R[0].objX, this.f() + 90, 0, -16742145, -16777216);
         }

         int var2;
         for(var2 = 0; var2 < this.ab.length; ++var2) {
            if (this.Q == var2) {
               a(var1, this.R[var2].objX, this.R[var2].objY, this.P, this.R[var2].k >= 0, Caption.Ba[var2]);
            } else {
               a(var1, this.R[var2].objX, this.R[var2].objY, (Item)null, this.R[var2].k >= 0, Caption.Ba[var2]);
            }
         }

         this.a(var1, this.R[4]);

         for(var2 = 0; var2 < this.R[4].i; ++var2) {
            for(int var3 = 0; var3 < this.R[4].P; ++var3) {
               b(var1, var3 * this.R[4].h, var2 * this.R[4].h, this.ab[var2 * this.R[4].P + var3], var2 * this.R[4].i + var3 == this.R[4].k, "");
            }
         }

         this.a(var1);
         if (this.O != null && this.Q >= 0) {
            this.O.b(var1, this.R[this.Q].objX + this.R[this.Q].h / 2, this.R[this.Q].objY + this.R[this.Q].h / 2);
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.R.length; ++var2) {
            var1.addElement(this.R[var2].a(1001 + var2, this));
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
            this.a(false);
            return;
         case 1001:
         case 1002:
         case 1003:
         case 1004:
            this.a(var1.j, var1.j.k);
            var2 = var1.b - 1001;
            this.ad = var2 + 10;
            if (this.Q == var2 && this.P != null) {
               this.k = a(var1, this, this.P);
               return;
            }

            this.k = b(Caption.Bb[var2], this, this.R[var2].objX, this.R[var2].objY + 32, 250);
            return;
         case 1005:
            try {
               this.ad = 1;
               this.a(var1.j, var1.j.k);
               var2 = var1.j.k / 5;
               var3 = var1.j.k % 5;
               this.k = b(var1, this, this.ab[var2 * 4 + var3]);
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
      for(int var3 = 0; var3 < this.R.length; ++var3) {
         this.R[var3].k = -1;
      }

      var1.k = var2;
   }

   private void a(boolean var1) {
      try {
         Vector var5 = new Vector();

         for(int var2 = 0; var2 < this.ab.length; ++var2) {
            if (this.ab[var2] != null) {
               var5.add(this.ab[var2]);
            }
         }

         if (var5.size() == 0) {
            DataCenter.d().ai.c(Caption.ra, -65536);
         } else {
            Message var6;
            (var6 = Message.c((byte)-45)).a(var5.size());

            for(int var3 = 0; var3 < var5.size(); ++var3) {
               var6.b(((Item)var5.get(var3)).f);
            }

            var6.l();
         }
      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }
   }
}
