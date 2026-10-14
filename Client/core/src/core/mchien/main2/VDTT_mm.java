package core.mchien.main2;

import java.util.Vector;

public final class VDTT_mm extends VDTT_ka {
   public Item[] O = new Item[1];
   public Item[] P = new Item[25];
   public Item[] Q;
   private VDTT_ht[] X = new VDTT_ht[3];
   private VDTT_ba Y;
   public int R;
   public VDTT_hi S;
   public boolean T;
   public VDTT_bf W;

   public VDTT_mm(VDTT_p var1) {
      super(var1, new String[]{Caption.xq, Caption.P});
      this.X[0] = new VDTT_ht((byte)1, 222, this.f() + 20, 30, 30, 30, 1, 1);
      this.X[1] = new VDTT_ht((byte)1, 242, this.f() + 20, 30, 30, 30, 1, 1);
      this.X[2] = new VDTT_ht((byte)0, 14, this.f() + 20, 160, 160, 32, 5, 5);
      this.Y = this.a(this.q - 70, this.r - 33, Caption.B, this, 0, -8);
      this.a(this.Y, 0);
      VDTT_hp var3 = new VDTT_hp(1000, new String[]{Caption.ru});
      this.W = this.a(13, this.f() + this.h() - 26, 150, var3.c.length, var3, this, 1);
      this.a(this.W, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].s()) {
            this.ak.add(var1[var2]);
         }
      }

   }

   public final void f(int var1) {
      super.f(var1);
      if (this.T) {
         this.T = false;
         this.O[0] = null;
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         this.W.b(true);

         int var1;
         for(var1 = 0; var1 < this.P.length; ++var1) {
            this.P[var1] = null;
         }

         if (!this.T) {
            if (this.O[0] == null) {
               this.Q = null;
            } else {
               this.W.b(false);
               if (this.Q != null) {
                  for(var1 = 0; var1 < this.Q.length; ++var1) {
                     this.P[var1] = this.Q[var1];
                  }
               } else {
                  this.P[0] = new Item(this.O[0].c);
                  VDTT_gz[] var5;
                  if ((var5 = this.O[0].L()) != null) {
                     label80:
                     for(int var2 = 0; var2 < var5.length; ++var2) {
                        if (var5[var2].a().c == 14) {
                           for(int var3 = 0; var3 < this.P.length; ++var3) {
                              if (this.P[var3] == null) {
                                 int var4 = 0;

                                 while(true) {
                                    if (var4 >= DataCenter.d().O.length) {
                                       continue label80;
                                    }

                                    if (DataCenter.d().O[var4].b.trim().toLowerCase().equals(var5[var2].a().b.trim().toLowerCase())) {
                                       this.P[var3] = new Item(DataCenter.d().O[var4].a);
                                       this.P[var3].am();
                                       continue label80;
                                    }

                                    ++var4;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         for(var1 = 0; var1 < this.X.length; ++var1) {
            this.X[var1].a();
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
         VDTT_dg.b(VDTT_dg.d, var1, Caption.po, 14, this.f() + 11, 0, -10831436, -16777216);
         VDTT_dc.a(var1, 95, -360, this.X[0].objX - 40 - DataCenter.d().h / 3 % 3, this.f() + 25, 20);
         if (this.T) {
            if (DataCenter.d().h % 20 > 12) {
               VDTT_dg.b(VDTT_dg.d, var1, Caption.ps, 179, this.f() + 108, 0, -2560, -16777216);
            }
         } else {
            VDTT_dg.b(VDTT_dg.d, var1, Caption.xv, 172, this.f() + 68, 0, -1, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, Caption.pt, 172, this.f() + 82, 0, -1, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, Caption.xu, 172, this.f() + 96, 0, -2560, -16777216);
         }

         a(var1, this.X[0].objX, this.X[0].objY, this.O[0], this.X[0].k >= 0, Caption.bb);
         this.a(var1, this.X[2]);

         for(int var2 = 0; var2 < this.X[2].i; ++var2) {
            for(int var3 = 0; var3 < this.X[2].P; ++var3) {
               if (this.P[var2 * this.X[2].P + var3] != null) {
                  this.P[var2 * this.X[2].P + var3].am();
               }

               b(var1, var3 * this.X[2].h, var2 * this.X[2].h, this.P[var2 * this.X[2].P + var3], var2 * this.X[2].i + var3 == this.X[2].k, "");
            }
         }

         this.a(var1);
         if (this.S != null) {
            this.S.b(var1, this.X[0].objX + this.X[0].h / 2, this.X[0].objY + this.X[0].h / 2);
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.X.length; ++var2) {
            if (var2 != 1) {
               var1.addElement(this.X[var2].a(1001 + var2, this));
            }
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
            if (this.O[0] == null) {
               this.f(2);
               DataCenter.d().ai.c(Caption.pq, -1);
               return;
            }

            this.R = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.O[0]);
            return;
         case 1002:
            this.R = 0;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.O[1]);
            return;
         case 1003:
            try {
               this.R = 0;
               this.a(var1.j, var1.j.k);
               var2 = var1.j.k / 4;
               var3 = var1.j.k % 4;
               this.k = b(var1, this, this.P[var2 * 4 + var3]);
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
      for(int var3 = 0; var3 < this.X.length; ++var3) {
         this.X[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void d() {
      super.d();

      for(int var1 = 0; var1 < this.O.length; ++var1) {
         if (this.O[var1] != null && this.O[var1].f >= 0) {
            VDTT_ek.m().i(this.O[var1].w)[this.O[var1].f] = this.O[var1];
            this.O[var1] = null;
         }
      }

   }

   private void a(boolean var1) {
      try {
         if (this.O[0] != null && this.O[0].s > 0) {
            if (var1) {
               DataCenter.d().ai.a(Caption.pp, 2001, this);
            } else {
               Message var4;
               (var4 = new Message((byte)-51)).a(this.O[0].w);
               var4.b(this.O[0].f);
               var4.a(this.W.n.b);
               var4.l();
            }
         } else {
            DataCenter.d().ai.c(Caption.po, -65536);
         }
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }

   public final void C() {
      try {
         Message var1;
         (var1 = new Message((byte)-52)).a(this.O[0].w);
         var1.b(this.O[0].f);
         var1.l();
      } catch (Exception var2) {
      }
   }
}
