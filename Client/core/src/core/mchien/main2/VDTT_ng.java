package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ng extends VDTT_ka {
   public Item[] O = new Item[2];
   public Item[] P = new Item[6];
   private VDTT_ht[] W = new VDTT_ht[2];
   private VDTT_bu[] X = new VDTT_bu[2];
   private VDTT_ba Y;
   private VDTT_ba Z;
   public int Q;
   private VDTT_ho aa;
   public int R = 0;
   public VDTT_hi S;
   public VDTT_bf T;

   public VDTT_ng(VDTT_p var1) {
      super(var1, new String[]{Caption.qM, Caption.P});
      this.W[0] = new VDTT_ht((byte)1, 124, this.f() + 20, 30, 30, 30, 1, 1);
      this.W[1] = new VDTT_ht((byte)1, 14, this.f() + 20, 64, 96, 32, 3, 2);
      this.Y = this.a(this.q - 70, this.r - 33, Caption.bG, this, 0, -8);
      this.a(this.Y, 0);
      this.Z = this.a(139, this.r - 33, Caption.lh, this, 2002, -8);
      this.a(this.Z, 0);
      VDTT_hp var3 = new VDTT_hp(2000, Caption.Al);
      this.T = this.a(14, this.r - 32, 120, var3.c.length, var3, this, 1);
      this.T.a(0);
      this.a(this.T, 0);
      this.aa = new VDTT_ho(0);
      this.X[0] = this.a(89, this.f() + 77, "", this, this.aa);
      this.X[1] = this.a(89, this.f() + 97, "", this, this.aa);
      VDTT_bu var10000 = this.X[0];
      boolean var4 = true;
      var10000.d = var4;
      var10000 = this.X[1];
      var4 = true;
      var10000.d = var4;
      this.a(this.X[0], 0);
      this.a(this.X[1], 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].G()) {
            this.ak.add(var1[var2]);
         }
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         int var1 = 0;

         int var2;
         for(var2 = 0; var2 < this.P.length; ++var2) {
            if (this.P[var2] != null) {
               var1 += this.P[var2].M();
            }
         }

         VDTT_bu var10000;
         boolean var5;
         if (this.O[0] != null) {
            VDTT_gz[] var6 = this.O[0].L();

            for(int var3 = 0; var3 < this.X.length; ++var3) {
               var10000 = this.X[var3];
               var5 = false;
               var10000.d = var5;
               if (this.X[var3].l) {
                  this.X[var3].a(var6[var3].b(var1));
               } else {
                  this.X[var3].a(var6[var3].b(0));
               }
            }
         } else {
            for(var2 = 0; var2 < this.X.length; ++var2) {
               var10000 = this.X[var2];
               var5 = true;
               var10000.d = var5;
            }
         }

         for(var2 = 0; var2 < this.W.length; ++var2) {
            this.W[var2].a();
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
         VDTT_dg.b(VDTT_dg.d, var1, Caption.bx, 14, this.f() + 11, 0, -10831436, -16777216);
         if (this.O[0] != null) {
            VDTT_dg.b(VDTT_dg.d, var1, Caption.by, 89, this.f() + 65, 0, -10831436, -16777216);
         }

         a(var1, this.W[0].objX, this.W[0].objY, this.O[0], this.W[0].k >= 0, Caption.bd);
         VDTT_dc.a(var1, 95, 0, 92 - DataCenter.d().h / 3 % 3, this.f() + 25, 20);
         if (this.R > 0 && this.R % 14 > 2) {
            VDTT_dg.b(VDTT_dg.d, var1, Caption.kX, 89, this.f() + 125, 0, -2560, -16777216);
         }

         this.a(var1, this.W[1]);
         int var2 = 0;

         for(int var3 = 0; var3 < this.W[1].i; ++var3) {
            for(int var4 = 0; var4 < this.W[1].P; ++var4) {
               b(var1, var4 * this.W[1].h, var3 * this.W[1].h, this.P[var3 * this.W[1].P + var4], var2 == this.W[1].k, "");
               ++var2;
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
         this.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 0:
            VDTT_ng var8 = this;

            try {
               var2 = 0;

               for(var3 = 0; var3 < var8.P.length; ++var3) {
                  if (var8.P[var3] != null) {
                     ++var2;
                  }
               }

               if (var8.O[0] != null && var2 != 0) {
                  VDTT_gz var9;
                  if ((var9 = var8.O[0].L()[var8.aa.b]).b[1] >= var9.f()) {
                     DataCenter.d().ai.c(Caption.kZ, -2560);
                  } else {
                     Message var10;
                     (var10 = new Message((byte)106)).a(var8.aa.b);
                     var10.a(var8.O[0].w);
                     var10.b(var8.O[0].f);
                     var10.a(var2);

                     for(var2 = 0; var2 < var8.P.length; ++var2) {
                        if (var8.P[var2] != null) {
                           var10.b(var8.P[var2].f);
                        }
                     }

                     var10.l();
                  }
               } else {
                  DataCenter.d().ai.c(Caption.kY, -65536);
               }
               break;
            } catch (Exception var6) {
               VDTT_jb.a(var6);
               return;
            }
         case 1001:
            this.Q = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.O[0]);
            if (this.O[0] == null) {
               this.f(2);
               DataCenter.d().ai.c(Caption.nT, -1);
               return;
            }
            break;
         case 1002:
            try {
               this.Q = 2;
               this.a(var1.j, var1.j.k);
               this.k = a(var1, this, this.P[var1.j.k]);
               return;
            } catch (Exception var5) {
               return;
            }
         case 2002:
            boolean var7 = this.T.n.b == 0;

            for(var2 = 0; var2 < VDTT_ek.m().aP.length; ++var2) {
               if (VDTT_ek.m().aP[var2] != null && VDTT_ek.m().aP[var2].c == 160 && VDTT_ek.m().aP[var2].t == var7) {
                  for(var3 = 0; var3 < this.P.length; ++var3) {
                     if (this.P[var3] == null) {
                        this.P[var3] = VDTT_ek.m().aP[var2];
                        VDTT_ek.m().aP[var2] = null;
                        break;
                     }
                  }
               }
            }
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
