package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ks extends VDTT_jr {
   private VDTT_ht[] R;
   private VDTT_ba S;
   public VDTT_hi O;
   public Item P;
   public int Q = -1;

   public VDTT_ks(VDTT_p var1) {
      super(var1, Caption.zN);
      this.ab = new Item[16];
      this.ac = new Item[1];
      this.R = new VDTT_ht[2];
      this.R[0] = new VDTT_ht((byte)1, 202, this.f() + 20, 30, 30, 30, 1, 1);
      this.R[1] = new VDTT_ht((byte)0, 14, this.f() + 20, 128, 128, 32, 4, 4);
      this.S = this.a(this.q - 70, this.r - 33, Caption.bi, this, 0, -8);
      this.a(this.S, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].c == 310) {
            this.ak.add(var1[var2]);
         }
      }

   }

   public final void f(int var1) {
      super.f(var1);
      this.Q = -1;
      this.P = null;
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
         VDTT_dg.b(VDTT_dg.d, var1, Caption.qW, 14, this.f() + 11, 0, -10831436, -16777216);
         VDTT_dc.a(var1, 95, 0, 164 - DataCenter.d().h / 3 % 3, this.f() + 25, 20);
         if (this.Q >= 0) {
            if (DataCenter.d().h % 20 > 12) {
               VDTT_dg.b(VDTT_dg.d, var1, Caption.rk + " " + this.P.getItemTemplate().b, this.R[0].objX - 50, this.f() + 90, 0, -2560, -16777216);
            }
         } else {
            VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.pj, VDTT_jb.c(100000)), this.R[0].objX - 40, this.f() + 60, 0, -1, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, Caption.fI, this.R[0].objX - 40, this.f() + 75, 0, -1, -16777216);
         }

         a(var1, this.R[0].objX, this.R[0].objY, this.P, this.R[0].k >= 0, Caption.Q);
         this.a(var1, this.R[1]);

         for(int var2 = 0; var2 < this.R[1].i; ++var2) {
            for(int var3 = 0; var3 < this.R[1].P; ++var3) {
               b(var1, var3 * this.R[1].h, var2 * this.R[1].h, this.ab[var2 * this.R[1].P + var3], var2 * this.R[1].i + var3 == this.R[1].k, "");
            }
         }

         this.a(var1);
         if (this.O != null) {
            this.O.b(var1, this.R[0].objX + this.R[0].h / 2, this.R[0].objY + this.R[0].h / 2);
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
            this.a(var1.j, var1.j.k);
            this.ad = 10;
            this.k = a(var1, this, this.P);
            return;
         case 1002:
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
            DataCenter.d().ai.c(Caption.qW, -65536);
         } else {
            Message var6;
            (var6 = Message.c((byte)-86)).a(var5.size());

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
