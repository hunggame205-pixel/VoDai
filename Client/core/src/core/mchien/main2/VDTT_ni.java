package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ni extends VDTT_jr {
   public Item O;
   public Item[] P = new Item[20];
   private VDTT_ht[] T = new VDTT_ht[2];
   private VDTT_ba U;
   private VDTT_ba V;
   private long W = 0L;
   private int X = 0;
   private int Y = 0;
   private VDTT_bu[] Z = new VDTT_bu[2];
   private VDTT_ho aa;
   public int[] Q = new int[2];
   public VDTT_hi R;
   public VDTT_bf S;

   public VDTT_ni(VDTT_p var1) {
      super(var1, new String[]{Caption.yU[0]});
      this.T[0] = new VDTT_ht((byte)1, 193, this.f() + 19, 30, 30, 30, 1, 1);
      this.T[1] = new VDTT_ht((byte)1, 14, this.f() + 19, 128, 160, 32, 5, 4);
      this.U = this.a(this.q - 70, this.r - 33, Caption.bF, this, 0, -8);
      this.a(this.U, 0);
      this.V = this.a(109, this.r - 33, Caption.lh, this, 2002, -8);
      this.a(this.V, 0);
      VDTT_hp var3;
      int var2 = (var3 = new VDTT_hp(2000, Caption.zC)).c.length;
      this.S = this.a(14, this.r - 32, 90, var2, var3, this, 1);
      this.S.a(VDTT_eq.a().b(7));
      this.a(this.S, 0);
      this.aa = new VDTT_ho(0, 1);
      this.Z[0] = this.a(149, this.f() + 58, Caption.bP, this, this.aa);
      this.Z[1] = this.a(149, this.f() + 78, Caption.bQ, this, this.aa);
      this.a(this.Z[0], 0);
      this.a(this.Z[1], 0);
      if (MenuConfig.Q) {
         MenuConfig.Q = false;
         this.C();
      }

   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].p()) {
            this.ak.add(var1[var2]);
         }
      }

   }

   private void C() {
      if (this.O != null) {
         this.i(this.O.f);
      }

      this.O = null;
      int var1 = this.S.n.b;
      int var2 = 0;
      boolean var3 = this.aa.b != 0;

      for(int var4 = 0; var4 < VDTT_ek.m().aP.length && var2 < this.P.length; ++var4) {
         if (VDTT_ek.m().aP[var4] != null && VDTT_ek.m().aP[var4].t == var3 && VDTT_ek.m().aP[var4].p() && VDTT_ek.m().aP[var4].getItemTemplate().a <= var1) {
            this.b(VDTT_ek.m().aP[var4]);
            ++var2;
         }
      }

      this.a_();
   }

   private void b(Item var1) {
      try {
         for(int var2 = 0; var2 < this.P.length; ++var2) {
            if (this.P[var2] == null) {
               this.P[var2] = var1;
               break;
            }
         }

         VDTT_ek.m().aP[var1.f] = null;
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }

   public final void f(int var1) {
      super.f(var1);
      if (var1 == 1) {
         if (this.O != null) {
            this.i(this.O.f);
         }

         this.O = null;
      }

   }

   public final void a_() {
      try {
         super.a_();
         int var1;
         if (super.a.b == 0) {
            this.X = this.Y = 0;
            this.W = 0L;

            for(var1 = 0; var1 < this.P.length; ++var1) {
               if (this.P[var1] != null) {
                  ++this.Y;
                  Item var10003 = this.P[var1];
                  this.W += DataCenter.d().as[var10003.c];
               }
            }

            if (this.W > 0L) {
               for(this.X = DataCenter.d().as.length - 1; this.X >= 0 && this.W <= DataCenter.d().as[this.X]; --this.X) {
               }
            }

            for(var1 = 0; var1 < this.T.length; ++var1) {
               this.T[var1].a();
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

         for(var1 = 0; var1 < this.Q.length; ++var1) {
            if (this.Q[var1] > 0) {
               int var10002 = this.Q[var1]--;
            }
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
            if (this.Q[1] == 0 || this.Q[1] % 12 > 5) {
               VDTT_dg.b(VDTT_dg.d, var1, Caption.bE, 14, this.f() + 11, 0, -10831436, -16777216);
            }

            b(var1, this.T[0].objX, this.T[0].objY, this.O, this.T[0].k >= 0, Caption.Q);
            VDTT_dc.a(var1, 95, 0, 158 - DataCenter.d().h / 3 % 3, this.f() + 25, 20);
            if (this.W > 0L && this.Y > 1) {
               if (this.X + 1 >= DataCenter.d().as.length) {
                  if (this.Q[0] == 0 || this.Q[0] % 10 > 5) {
                     VDTT_dg.b(VDTT_dg.d, var1, Caption.bM, 149, this.f() + 108, 0, -6488, -16777216);
                  }
               } else {
                  VDTT_dg.b(VDTT_dg.d, var1, Caption.bK + " " + (this.X + 2), 149, this.f() + 108, 0, -1, -16777216);
                  VDTT_dg.b(VDTT_dg.d, var1, Caption.bt + " " + this.W * 100L / DataCenter.d().as[this.X + 1] + "%", 149, this.f() + 124, 0, -1, -16777216);
                  if (this.aa.b == 0) {
                     VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.pj, VDTT_jb.c(DataCenter.d().an[this.X + 1] / 3)), 149, this.f() + 140, 0, -1, -16777216);
                  } else {
                     VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.bv, VDTT_jb.c(DataCenter.d().an[this.X + 1])), 149, this.f() + 140, 0, -1, -16777216);
                  }
               }
            }

            this.a(var1, this.T[1]);
            int var2 = 0;

            for(int var3 = 0; var3 < this.T[1].i; ++var3) {
               for(int var4 = 0; var4 < this.T[1].P; ++var4) {
                  b(var1, var4 * this.T[1].h, var3 * this.T[1].h, this.P[var3 * this.T[1].P + var4], var2 == this.T[1].k, "");
                  ++var2;
               }
            }

            this.a(var1);
            if (this.R != null) {
               this.R.b(var1, this.T[0].objX + this.T[0].h / 2, this.T[0].objY + this.T[0].h / 2);
            }
         }

      } catch (Exception var5) {
         VDTT_jb.a(var5);
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

   public final void perform(int var1, Object var2, VDTT_z var3) {
      if (var1 == 2000) {
         VDTT_eq.a().a(7, this.S.n.b);
      }

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
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.O);
            if (this.O == null) {
               this.f(1);
               DataCenter.d().ai.c(Caption.nR, -1);
               return;
            }
            break;
         case 1002:
            try {
               this.a(var1.j, var1.j.k);
               this.k = a(var1, this, this.P[var1.j.k]);
               return;
            } catch (Exception var5) {
               return;
            }
         case 2001:
            this.a(false);
            return;
         case 2002:
            this.C();
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

      for(int var1 = 0; var1 < this.P.length; ++var1) {
         if (this.P[var1] != null) {
            int var10001 = this.P[var1].f;
            VDTT_ek.m().aP[var10001] = this.P[var1];
            this.P[var1] = null;
         }
      }

   }

   private void a(boolean var1) {
      try {
         if (this.Y < 2) {
            this.Q[1] = 50;
         } else if (this.X + 1 >= DataCenter.d().as.length) {
            this.Q[0] = 50;
         } else {
            boolean var2 = false;
            int var3;
            if (this.aa.b == 0) {
               for(var3 = 0; var3 < this.P.length; ++var3) {
                  if (this.P[var3] != null && this.P[var3].t) {
                     var2 = true;
                     break;
                  }
               }
            } else {
               for(var3 = 0; var3 < this.P.length; ++var3) {
                  if (this.P[var3] != null && !this.P[var3].t) {
                     var2 = true;
                     break;
                  }
               }
            }

            if (var1 && var2) {
               DataCenter.d().ai.a(Caption.bO, 2001, this);
            } else {
               Message var7;
               (var7 = new Message((byte)108)).a(this.aa.b != 0);
               int var5 = 0;

               int var6;
               for(var6 = 0; var6 < this.P.length; ++var6) {
                  if (this.P[var6] != null) {
                     ++var5;
                  }
               }

               var7.a(var5);

               for(var6 = 0; var6 < this.P.length; ++var6) {
                  if (this.P[var6] != null) {
                     var7.b(this.P[var6].f);
                  }
               }

               var7.l();
            }
         }
      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }
   }
}
