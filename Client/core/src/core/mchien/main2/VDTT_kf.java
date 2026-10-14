package core.mchien.main2;

import java.util.Vector;

public final class VDTT_kf extends VDTT_ar {
   private int W;
   private int X;
   private VDTT_kg[] Y = new VDTT_kg[]{new VDTT_kg(this, 0, 72), new VDTT_kg(this, 73, 144), new VDTT_kg(this, 145, 216), new VDTT_kg(this, 217, 288), new VDTT_kg(this, 289, 360)};
   public int a = 0;
   public int b = 50;
   public int c;
   public int d = 0;
   public int N = 0;
   public int O = 32;
   private boolean Z;
   private Item[] aa = new Item[8];
   private VDTT_ht[] ab = new VDTT_ht[2];
   private VDTT_ba ac;
   public int P;
   public int Q;
   public int R;
   public int S;
   public int T;
   public int U;
   public int V;

   public VDTT_kf(VDTT_p var1) {
      this.e = 1;
      this.I = var1;
      this.K = false;
      this.a(250, 230);
      this.W = 84;
      this.X = this.f() + 75;
      this.ac = this.a(this.q / 2 - 30, this.r - 36, Caption.zb[1], this, 1001, -8);
      this.ab[0] = new VDTT_ht((byte)1, 14, this.f() + 22, this.O, 4 * this.O, this.O, 4, 1);
      this.ab[1] = new VDTT_ht((byte)1, super.q - 8 - 7 - this.O, this.f() + 22, this.O, 4 * this.O, this.O, 4, 1);
      (new Message((byte)-10)).l();
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.ab[0].a(5001, this));
      var1.addElement(this.ab[1].a(5002, this));
      return var1;
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         if (this.S < 2) {
            this.Z = true;
            this.b = 50;
            this.a = 0;
            this.c = -1;
            this.N = VDTT_jb.a(5, 50);
            this.ab[0].k = this.ab[1].k = -1;
         }

         return;
      case 5001:
         this.ab[1].k = -1;
         if (var1.j.k >= 0) {
            this.k = a(var1, this, this.aa[this.ab[0].k]);
            return;
         }
         break;
      case 5002:
         this.ab[0].k = -1;
         if (var1.j.k >= 0) {
            this.k = a(var1, this, this.aa[this.ab[1].k + 4]);
         }
      }

   }

   public final void a_() {
      if (this.Z) {
         this.ac.a(true);
         ++this.d;
         this.a += this.b;
         if (this.a >= 360) {
            this.a = 0;
         }

         if (this.d % 4 == 0 && this.c >= 0) {
            this.b -= 5;
            if (this.b < 5) {
               this.b = 5;
               VDTT_kg var1 = this.Y[this.c];
               if (this.a - this.N >= var1.a && this.a <= var1.b) {
                  this.Z = false;
               }

               return;
            }
         }
      } else {
         this.Q = this.T;
         this.R = this.U;
         this.S = this.V;
         this.ac.a(false);
         String var2;
         if (this.S == 1) {
            var2 = Caption.eA;
            this.ac.l = var2;
         } else if (this.S == 0) {
            var2 = Caption.dh;
            this.ac.l = var2;
            if (this.P == 0) {
               this.ac.a(true);
            }
         } else if (this.S == 2) {
            var2 = Caption.eB;
            this.ac.l = var2;
         }

         Vector var3 = new Vector();
         if (this.R > 0) {
            var3.add(new Item(164, true, this.R));
         }

         if (this.R > 1) {
            var3.add(new Item(364, true));
            var3.add(new Item(265, true));
            var3.add(new Item(4, true));
         }

         if (this.R > 2) {
            var3.add(new Item(217, false));
         }

         if (this.R > 3) {
            var3.add(new Item(218, false));
         }

         if (this.R > 4) {
            var3.add(new Item(219, false));
         }

         if (this.R > 5) {
            var3.add(new Item(7, false));
         }

         for(int var4 = 0; var4 < this.aa.length; ++var4) {
            if (var4 >= var3.size()) {
               this.aa[var4] = null;
            } else {
               this.aa[var4] = (Item)var3.elementAt(var4);
            }
         }
      }

   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.zb[0], (byte)2);
      boolean var3 = true;
      var1.j = var3;
      VDTT_dc.a(var1, 306, this.a, 4 + (super.q - 8) / 2, this.f() + 85, 3);
      var3 = false;
      var1.j = var3;
      VDTT_dc.a(var1, 301, 0, 4 + (super.q - 8) / 2, this.f() + 88, 33);
      VDTT_dg.a(VDTT_dg.d, var1, Caption.eC + this.P, 15, this.r - 40, 0, -1);
      if (this.S > 0) {
         VDTT_dg.a(VDTT_dg.d, var1, Caption.eD + DataCenter.d().ConflictCharacterTemplate[this.Q].name, 15, this.r - 28, 0, -1);
         VDTT_dg.a(VDTT_dg.d, var1, Caption.eE + this.R, 15, this.r - 16, 0, -1);
      }

      this.a(var1, this.ab[0]);

      int var2;
      for(var2 = 0; var2 < this.ab[0].i; ++var2) {
         b(var1, 2, 1 + var2 * this.ab[0].h, this.aa[var2], var2 == this.ab[0].k, Caption.F);
      }

      this.a(var1);
      this.a(var1, this.ab[1]);

      for(var2 = 0; var2 < this.ab[1].i; ++var2) {
         b(var1, 2, 1 + var2 * this.ab[1].h, this.aa[var2 + 4], var2 == this.ab[1].k, Caption.F);
      }

      this.a(var1);
      this.a(var1, this.objX + 4, this.objY + this.f());
   }
}
