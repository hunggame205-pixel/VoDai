package core.mchien.main2;

import java.util.Vector;

public final class VDTT_nh extends VDTT_ka {
   public Item O;
   private VDTT_ht[] W;
   private VDTT_ba X;
   public int P = 0;
   public int Q = 0;
   public int R;
   public VDTT_hi S;
   public boolean T;

   public VDTT_nh(VDTT_p var1) {
      super(var1, new String[]{Caption.cD, Caption.P});
      this.ab = new Item[2];
      this.W = new VDTT_ht[2];
      this.W[0] = new VDTT_ht((byte)1, 124, this.f() + 20, 30, 30, 30, 1, 1);
      this.W[1] = new VDTT_ht((byte)1, 14, this.f() + 20, 64, 32, 32, 1, 2);
      this.X = this.a(this.q - 70, this.r - 33, Caption.la, this, 0, -8);
      this.a(this.X, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].n()) {
            this.ak.add(var1[var2]);
         }
      }

   }

   public final void f(int var1) {
      super.f(var1);
      if (this.T) {
         this.T = false;
         this.O = null;
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         this.P = 0;
         this.Q = 0;
         if (this.ab[0] != null) {
            this.O = this.ab[0].b();
            VDTT_gz[] var1 = this.O.L();
            Vector var2 = new Vector();
            int var3 = 0;

            for(int var4 = 0; var4 < var1.length; ++var4) {
               if (var1[var4].b[0] == 128) {
                  var3 = var1[var4].f() + 2000;
                  var1[var4].e(var3);
               }

               var2.add(var1[var4]);
            }

            switch(var3) {
            case 4000:
               this.P = 1000;
               this.Q = 100000;
               var2.add(new VDTT_gz("26,5,5"));
               break;
            case 6000:
               this.P = 2000;
               this.Q = 200000;
               var2.add(new VDTT_gz("273,50,50"));
               break;
            case 8000:
               this.P = 3000;
               this.Q = 300000;
               var2.add(new VDTT_gz("28,100,100"));
               break;
            case 10000:
               this.P = 4000;
               this.Q = 400000;
               var2.add(new VDTT_gz("274,200,200"));
               break;
            case 12000:
               this.P = 6000;
               this.Q = 600000;
               var2.add(new VDTT_gz("275,3,3"));
               break;
            case 14000:
               this.P = 8000;
               this.Q = 800000;
               var2.add(new VDTT_gz((this.O.getItemTemplate().g == 5 ? 35 : 35 + this.O.getItemTemplate().g) + ",250,250"));
               break;
            case 16000:
               this.P = 10000;
               this.Q = 1000000;
               var2.add(new VDTT_gz("276,500,500"));
            }

            this.O.strOptions = Item.a(var2);
         } else if (!this.T) {
            this.O = null;
         }
      } else {
         this.B();
      }

      if (this.S != null) {
         this.S.o();
         if (this.S.p()) {
            this.S = null;
         }
      }

      if (this.R > 0) {
         --this.R;
      }

   }

   public final void b(Graphics var1) {
      if (this.w() <= 0) {
         this.a(var1, this.objX, this.objY, this.q, this.r, Caption.y, (byte)2, this.K);
      } else {
         super.b(var1);
      }

      if (super.a.b == 0) {
         VDTT_dg.b(VDTT_dg.d, var1, Caption.lb, 14, this.f() + 11, 0, -10831436, -16777216);
         a(var1, this.W[0].objX, this.W[0].objY, this.O, this.W[0].k >= 0, Caption.ap);
         VDTT_dc.a(var1, 95, 0, 92 - DataCenter.d().h / 3 % 3, this.f() + 25, 20);
         if (!this.T) {
            if (this.O != null) {
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.pj, VDTT_jb.c(this.Q)), 14, this.f() + 65, 0, -1, -16777216);
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.ld, VDTT_jb.c(this.P)), 14, this.f() + 80, 0, -1, -16777216);
            }
         } else if (this.R > 0 && DataCenter.d().h % 12 > 6 || this.R == 0) {
            VDTT_dg.b(VDTT_dg.d, var1, Caption.lc, 14, this.f() + 80, 0, -2560, -16777216);
         }

         VDTT_dg.b(VDTT_dg.d, var1, Caption.le, 14, this.f() + 95, 0, -16742145, -16777216);
         VDTT_dg.b(VDTT_dg.d, var1, Caption.AZ[0], 14, this.f() + 110, 0, -16742145, -16777216);
         VDTT_dg.b(VDTT_dg.d, var1, Caption.AZ[1], 14, this.f() + 125, 0, -16742145, -16777216);
         this.a(var1, this.W[1]);

         for(int var2 = 0; var2 < this.W[1].i; ++var2) {
            for(int var3 = 0; var3 < this.W[1].P; ++var3) {
               if (var3 % 2 == 0) {
                  b(var1, var3 * this.W[1].h, var2 * this.W[1].h, this.ab[var2 * this.W[1].P + var3], var2 * this.W[1].i + var3 == this.W[1].k, Caption.bc);
               } else {
                  b(var1, var3 * this.W[1].h, var2 * this.W[1].h, this.ab[var2 * this.W[1].P + var3], var2 * this.W[1].i + var3 == this.W[1].k, Caption.lf);
               }
            }
         }

         this.a(var1);
         if (this.S != null) {
            this.S.b(var1, this.W[0].objX + this.W[0].h / 2, this.W[0].objY + this.W[0].h / 2);
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.W.length; ++var2) {
            var1.addElement(this.W[var2].a(1001 + var2, this));
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
            this.ad = 0;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.O);
            return;
         case 1002:
            this.ad = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.ab[var1.j.k]);
            return;
         case 2001:
            this.a(false);
         }
      }

   }

   private void a(VDTT_hs var1, int var2) {
      for(int var3 = 0; var3 < this.W.length; ++var3) {
         this.W[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void d() {
      super.d();
   }

   private void a(boolean var1) {
      try {
         if (this.T) {
            this.R = 50;
         } else {
            int var2 = 0;

            for(int var3 = 0; var3 < this.ab.length; ++var3) {
               if (this.ab[var3] != null) {
                  ++var2;
               }
            }

            if (var2 < 2) {
               DataCenter.d().ai.c(Caption.lb, -65536);
            } else if (var1) {
               DataCenter.d().ai.a(Caption.lg, 2001, this);
            } else {
               Message var6;
               (var6 = new Message((byte)-96)).a(var2);

               for(int var5 = 0; var5 < this.ab.length; ++var5) {
                  if (this.ab[var5] != null) {
                     var6.a(this.ab[var5].w);
                     var6.b(this.ab[var5].f);
                  }
               }

               var6.l();
            }
         }
      } catch (Exception var4) {
      }
   }
}
