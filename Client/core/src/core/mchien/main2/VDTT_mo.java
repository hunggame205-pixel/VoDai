package core.mchien.main2;

import java.util.Vector;

public final class VDTT_mo extends VDTT_ka {
   public Item[] O = new Item[2];
   public Item[] P = new Item[16];
   private VDTT_ht[] T = new VDTT_ht[3];
   private VDTT_ba W;
   private int X;
   public int Q;
   public boolean R;
   public VDTT_hi S;

   public VDTT_mo(VDTT_p var1) {
      super(var1, new String[]{Caption.xw, Caption.P});
      this.T[0] = new VDTT_ht((byte)1, 162, this.f() + 20, 30, 30, 30, 1, 1);
      this.T[1] = new VDTT_ht((byte)1, 242, this.f() + 20, 30, 30, 30, 1, 1);
      this.T[2] = new VDTT_ht((byte)1, 14, this.f() + 20, 128, 128, 32, 4, 4);
      this.W = this.a(this.q - 70, this.r - 33, Caption.B, this, 0, -8);
      this.a(this.W, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].B()) {
            this.ak.add(var1[var2]);
         }
      }

   }

   public final void f(int var1) {
      super.f(var1);
      if (this.R) {
         this.R = false;
         this.P[1] = null;
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         int var1;
         if (!this.R) {
            for(var1 = 0; var1 < this.P.length; ++var1) {
               this.P[var1] = null;
            }

            if (this.O[0] == null) {
               this.O[1] = null;
            } else {
               this.O[1] = this.O[0].a();
               this.O[1].a(0);
               long var7 = 0L;
               int var3 = 0;
               int var4;
               if (this.O[0].j()) {
                  for(var4 = this.O[0].s; var4 > 0; --var4) {
                     var3 += DataCenter.d().ao[var4];
                     var7 += DataCenter.d().at[var4];
                  }
               } else if (this.O[0].k()) {
                  for(var4 = this.O[0].s; var4 > 0; --var4) {
                     var3 += DataCenter.d().ap[var4];
                     var7 += DataCenter.d().au[var4];
                  }
               } else if (this.O[0].l()) {
                  for(var4 = this.O[0].s; var4 > 0; --var4) {
                     var3 += DataCenter.d().aq[var4];
                     var7 += DataCenter.d().av[var4];
                  }
               }

               VDTT_gz[] var9;
               if ((var9 = this.O[1].L()) != null) {
                  for(int var5 = 0; var5 < var9.length; ++var5) {
                     if (var9[var5].l()) {
                        this.O[1].t = true;
                        break;
                     }
                  }
               }

               var7 /= 3L;
               Vector var8 = new Vector();

               for(var4 = DataCenter.d().as.length - 1; var4 >= 0 && var7 > 0L; --var4) {
                  if (var7 >= DataCenter.d().as[var4]) {
                     var7 -= DataCenter.d().as[var4];
                     Item var6;
                     (var6 = new Item()).c = var4;
                     var6.h = -1L;
                     var6.t = true;
                     var8.add(var6);
                     var4 = DataCenter.d().as.length;
                     if (var8.size() >= 16) {
                        break;
                     }
                  }
               }

               for(var4 = 0; var4 < var8.size() && var4 < this.P.length; ++var4) {
                  this.P[var4] = (Item)var8.elementAt(var4);
               }

               this.X = var3 / 3;
            }
         }

         for(var1 = 0; var1 < this.T.length; ++var1) {
            this.T[var1].a();
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

   }

   public final void b(Graphics var1) {
      if (this.w() <= 0) {
         this.a(var1, this.objX, this.objY, this.q, this.r, Caption.y, (byte)2, this.K);
      } else {
         super.b(var1);
      }

      if (super.a.b == 0) {
         VDTT_dg.b(VDTT_dg.d, var1, Caption.bz, 14, this.f() + 11, 0, -10831436, -16777216);
         a(var1, this.T[0].objX, this.T[0].objY, this.O[0], this.T[0].k >= 0, Caption.bD);
         a(var1, this.T[1].objX, this.T[1].objY, this.O[1], this.T[1].k >= 0, Caption.Q);
         VDTT_dc.a(var1, 95, 0, 210 - DataCenter.d().h / 3 % 3, this.f() + 25, 20);
         VDTT_dg.b(VDTT_dg.d, var1, Caption.yW[0], 14, this.f() + 156, 0, -16711681, -16777216);
         VDTT_dg.b(VDTT_dg.d, var1, Caption.yW[1], 14, this.f() + 170, 0, -16711681, -16777216);
         if (this.O[0] != null) {
            VDTT_dg.b(VDTT_dg.d, var1, Caption.bB + " " + VDTT_jb.c(this.X), 149, this.f() + 108, 0, -1, -16777216);
         }

         this.a(var1, this.T[2]);

         for(int var2 = 0; var2 < this.T[2].i; ++var2) {
            for(int var3 = 0; var3 < this.T[2].P; ++var3) {
               b(var1, var3 * this.T[2].h, var2 * this.T[2].h, this.P[var2 * this.T[2].P + var3], var2 * this.T[2].i + var3 == this.T[2].k, "");
            }
         }

         this.a(var1);
         if (this.S != null) {
            this.S.b(var1, this.T[1].objX + this.T[1].h / 2, this.T[1].objY + this.T[1].h / 2);
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.T.length; ++var2) {
            var1.addElement(this.T[var2].a(1001 + var2, this));
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
            this.Q = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.O[0]);
            if (this.O[0] == null) {
               this.f(2);
               DataCenter.d().ai.c(Caption.nU, -1);
               return;
            }
            break;
         case 1002:
            this.Q = 0;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.O[1]);
            return;
         case 1003:
            try {
               this.Q = 0;
               this.a(var1.j, var1.j.k);
               this.k = a(var1, this, this.P[var1.j.k]);
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
      for(int var3 = 0; var3 < this.T.length; ++var3) {
         this.T[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void d() {
      super.d();
      if (this.O[0] != null) {
         VDTT_ek.m().i(this.O[0].w)[this.O[0].f] = this.O[0];
         this.O[0] = null;
      }

   }

   private void a(boolean var1) {
      try {
         if (this.R) {
            DataCenter.d().ai.c(Caption.jJ, -1);
         } else if (this.O[0] == null) {
            DataCenter.d().ai.c(Caption.jK, -65536);
         } else if (var1) {
            DataCenter.d().ai.a(Caption.jL, 2001, this);
         } else {
            Message var3;
            (var3 = new Message((byte)105)).a(this.O[0].w);
            var3.b(this.O[0].f);
            var3.l();
         }
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }
}
