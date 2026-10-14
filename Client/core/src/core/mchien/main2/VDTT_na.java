package core.mchien.main2;

import java.util.Vector;

public final class VDTT_na extends VDTT_ka {
   public Item[] O = new Item[2];
   public Item[] P = new Item[5];
   private VDTT_ht[] W = new VDTT_ht[3];
   private VDTT_ba X;
   public int Q;
   public int R = 0;
   public VDTT_hi S;
   public boolean T;
   private String Y;

   public VDTT_na(VDTT_p var1) {
      super(var1, new String[]{Caption.qf, Caption.P});
      this.W[0] = new VDTT_ht((byte)1, 124, this.f() + 20, 30, 30, 30, 1, 1);
      this.W[1] = new VDTT_ht((byte)1, 14, this.f() + 20, 64, 96, 32, 3, 2);
      this.W[2] = new VDTT_ht((byte)1, 204, this.f() + 20, 30, 30, 30, 1, 1);
      this.X = this.a(this.q - 70, this.r - 33, Caption.bG, this, 0, -8);
      this.a(this.X, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].I()) {
            this.ak.add(var1[var2]);
         }
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         if (!this.T) {
            this.O[1] = null;
         }

         for(int var1 = 0; var1 < this.W.length; ++var1) {
            this.W[var1].a();
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

   public final void f(int var1) {
      super.f(var1);
      if (var1 != 0 && this.T) {
         this.T = false;
      }

   }

   public final void b(Graphics var1) {
      if (this.w() <= 0) {
         this.a(var1, this.objX, this.objY, this.q, this.r, Caption.y, (byte)2, this.K);
      } else {
         super.b(var1);
      }

      if (super.a.b == 0) {
         if (this.R > 0) {
            if (this.R % 14 > 2) {
               VDTT_dg.b(VDTT_dg.d, var1, Caption.lZ, 14, this.f() + 11, 0, -2560, -16777216);
            }
         } else {
            VDTT_dg.b(VDTT_dg.d, var1, Caption.lD, 14, this.f() + 11, 0, -6488, -16777216);
         }

         VDTT_dg.d(VDTT_dg.d, var1, Caption.lB, 89, this.f() + 95, 0, -6488, -16777216);
         VDTT_dg.d(VDTT_dg.d, var1, Caption.vo + DataCenter.d().O[354].b, 99, this.f() + 110, 0, -1, -16777216);
         VDTT_dg.d(VDTT_dg.d, var1, Caption.vo + DataCenter.d().O[562].b, 99, this.f() + 125, 0, -1, -16777216);
         VDTT_dg.d(VDTT_dg.d, var1, Caption.vo + DataCenter.d().O[564].b, 99, this.f() + 140, 0, -1, -16777216);
         VDTT_dg.d(VDTT_dg.d, var1, Caption.vo + DataCenter.d().O[566].b, 99, this.f() + 155, 0, -1, -16777216);
         VDTT_dg.d(VDTT_dg.d, var1, Caption.vo + DataCenter.d().O[353].b, 99, this.f() + 170, 0, -1, -16777216);
         VDTT_dg.b(VDTT_dg.d, var1, Caption.qh, 89, this.f() + 80, 0, -6488, -16777216);
         VDTT_dg.b(VDTT_dg.d, var1, "-" + VDTT_jb.b(Caption.mz, VDTT_jb.c(2500)), 89, this.f() + 65, 0, -6488, -16777216);
         a(var1, this.W[0].objX, this.W[0].objY, this.O[0], this.W[0].k >= 0, Caption.bD);
         a(var1, this.W[2].objX, this.W[0].objY, this.O[1], this.W[2].k >= 0, Caption.Q);
         VDTT_dc.a(var1, 95, 0, 170 - DataCenter.d().h / 3 % 3, this.f() + 25, 20);
         this.a(var1, this.W[1]);
         int var2 = 0;

         for(int var3 = 0; var3 < this.W[1].i; ++var3) {
            for(int var4 = 0; var4 < this.W[1].P; ++var4) {
               if (var2 < this.P.length) {
                  b(var1, var4 * this.W[1].h, var3 * this.W[1].h, this.P[var3 * this.W[1].P + var4], var2 == this.W[1].k, "");
               }

               ++var2;
            }
         }

         this.a(var1);
         if (this.S != null) {
            this.S.b(var1, this.W[2].objX + this.W[2].h / 2, this.W[2].objY + this.W[2].h / 2);
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
         this.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 0:
            VDTT_na var6 = this;

            try {
               var2 = 0;

               for(var3 = 0; var3 < var6.P.length; ++var3) {
                  if (var6.P[var3] != null) {
                     ++var2;
                  }
               }

               if (var6.O[0] != null && var2 != 0) {
                  Message var7;
                  (var7 = new Message((byte)-35)).a(var6.O[0].w);
                  var7.b(var6.O[0].f);
                  var7.a(var2);

                  for(var2 = 0; var2 < var6.P.length; ++var2) {
                     if (var6.P[var2] != null) {
                        var7.b(var6.P[var2].f);
                     }
                  }

                  var7.l();
               } else {
                  DataCenter.d().ai.c(VDTT_jb.b(Caption.lD, var6.Y), -65536);
               }
               break;
            } catch (Exception var5) {
               VDTT_jb.a(var5);
               return;
            }
         case 1001:
            this.Q = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.O[0]);
            return;
         case 1002:
            if (var1.j.k >= 0 && var1.j.k < this.P.length) {
               this.Q = 2;
               this.a(var1.j, var1.j.k);
               this.k = a(var1, this, this.P[var1.j.k]);
               return;
            }
            break;
         case 1003:
            this.Q = 3;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.O[1]);
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
      if (this.O[0] != null) {
         VDTT_ek.m().i(this.O[0].w)[this.O[0].f] = this.O[0];
         this.O[0] = null;
      }

      for(int var1 = 0; var1 < this.P.length; ++var1) {
         if (this.P[var1] != null) {
            int var10001 = this.P[var1].f;
            VDTT_ek.m().aP[var10001] = this.P[var1];
            this.P[var1] = null;
         }
      }

   }
}
