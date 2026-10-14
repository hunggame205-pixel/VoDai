package core.mchien.main2;

import java.util.Vector;

public final class VDTT_lb extends VDTT_ka {
   public Item[] O = new Item[2];
   public Item[] P = new Item[1];
   private VDTT_ht[] X = new VDTT_ht[3];
   private VDTT_ba Y;
   public int Q;
   public int[] R = new int[2];
   public VDTT_hi S;
   private VDTT_bu[] Z = new VDTT_bu[2];
   private VDTT_ho aa;
   private int am = 150;
   private int an = 20;
   public int T;
   public int W;

   public VDTT_lb(VDTT_p var1) {
      super(var1, new String[]{Caption.tt, Caption.P});
      this.X[0] = new VDTT_ht((byte)1, 64, this.f() + 20, 30, 30, 30, 1, 1);
      this.X[1] = new VDTT_ht((byte)1, 134, this.f() + 20, 30, 30, 30, 1, 1);
      this.X[2] = new VDTT_ht((byte)1, 204, this.f() + 20, 32, 32, 32, 1, 1);
      this.Y = this.a(this.q - 70, this.r - 33, Caption.tt, this, 0, -8);
      this.a(this.Y, 0);
      this.aa = new VDTT_ho(200, 0);
      this.Z[0] = this.a(104, this.f() + 70, Caption.tz, this, this.aa);
      this.Z[1] = this.a(104, this.f() + 90, Caption.tA, this, this.aa);
      this.a(this.Z[0], 0);
      this.a(this.Z[1], 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         Item var3;
         if (var1[var2] != null && (!(var3 = var1[var2]).ai() && !var3.x() ? var3.y() && var3.s >= 14 && var3.strOptions.length() > 0 : false)) {
            this.ak.add(var1[var2]);
         }
      }

   }

   private void C() {
      for(int var1 = 0; var1 < this.P.length; ++var1) {
         if (this.P[var1] != null) {
            int var10001 = this.P[var1].f;
            VDTT_ek.m().aP[var10001] = this.P[var1];
            this.P[var1] = null;
         }
      }

   }

   private static void a(Vector var0, VDTT_gz var1) {
      for(int var2 = 0; var2 < var0.size(); ++var2) {
         if (((VDTT_gz)var0.get(var2)).b[0] == var1.b[0]) {
            ((VDTT_gz)var0.get(var2)).d(var1.b[1]);
            return;
         }
      }

      var0.add(var1);
   }

   private void a(Item var1, Item var2) {
      this.O[1] = var1.b();
      Vector var8 = new Vector();
      Vector var3 = new Vector();
      VDTT_gz[] var4 = this.O[1].L();
      VDTT_gz var5 = null;

      for(int var6 = 0; var6 < var4.length; ++var6) {
         if (var4[var6].b[0] == 370) {
            (var5 = var4[var6]).c(var5.b[1] + 1);
         }

         if (var4[var6].a().c == 18) {
            var3.add(var4[var6]);
         } else {
            var8.add(var4[var6]);
         }
      }

      if (var3.size() == 0) {
         var5 = new VDTT_gz("370,1,-1");
         var3.add(var5);
      }

      var4 = var2.L();
      Vector var10 = new Vector();

      int var9;
      for(var9 = 0; var9 < DataCenter.d().P.length; ++var9) {
         if (DataCenter.d().P[var9].c == 18) {
            var10.add(DataCenter.d().P[var9]);
         }
      }

      for(var9 = 0; var9 < var4.length; ++var9) {
         if (var4[var9].b[0] == 370) {
            var5.c(var5.b[1] + var4[var9].b[1]);
         }

         if (var4[var9].a().c == 17) {
            for(int var7 = 0; var7 < var10.size(); ++var7) {
               if (((VDTT_hb)var10.get(var7)).b.equals(var4[var9].a().b)) {
                  a(var3, new VDTT_gz(((VDTT_hb)var10.get(var7)).a + "," + var4[var9].b[1] + ",-1"));
                  break;
               }
            }
         } else if (var4[var9].a().c == 18) {
            a(var3, var4[var9]);
         }
      }

      var8.addAll(var3);
      this.O[1].strOptions = Item.a(var8);
   }

   public final void a_() {
      super.a_();
      int var1;
      if (super.a.b == 0) {
         VDTT_bu var10000;
         boolean var3;
         if (this.T == 0) {
            this.O[1] = null;
            if (this.O[0] != null && this.P[0] != null && this.O[0].getItemTemplate().f == this.P[0].getItemTemplate().f) {
               for(var1 = 0; var1 < this.Z.length; ++var1) {
                  var10000 = this.Z[var1];
                  var3 = false;
                  var10000.d = var3;
               }

               if (this.aa.a() == 0) {
                  this.a(this.O[0], this.P[0]);
               } else {
                  this.a(this.P[0], this.O[0]);
               }
            } else {
               for(var1 = 0; var1 < this.Z.length; ++var1) {
                  var10000 = this.Z[var1];
                  var3 = true;
                  var10000.d = var3;
               }
            }
         }

         String var4 = Caption.tt;
         this.Y.l = var4;
         if (this.T > 0) {
            var4 = Caption.tI;
            this.Y.l = var4;

            for(var1 = 0; var1 < this.Z.length; ++var1) {
               var10000 = this.Z[var1];
               var3 = true;
               var10000.d = var3;
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

      for(var1 = 0; var1 < this.R.length; ++var1) {
         if (this.R[var1] > 0) {
            int var10002 = this.R[var1]--;
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
         if (this.R[1] == 0 || this.R[1] % 12 > 5) {
            VDTT_dg.b(VDTT_dg.d, var1, Caption.tx, this.q / 2, this.f() + 11, 2, -10831436, -16777216);
         }

         a(var1, this.X[0].objX, this.X[0].objY, this.O[0], this.X[0].k >= 0, Caption.bD);
         a(var1, this.X[1].objX, this.X[1].objY, this.O[1], this.X[1].k >= 0, Caption.Q);
         b(var1, this.X[2].objX, this.X[2].objY, this.P[0], this.X[2].k >= 0, Caption.bD);
         VDTT_dg.b(VDTT_dg.b, var1, Caption.vk, this.X[0].objX + 15, this.X[0].objY + 37, 2, -1, -16777216);
         VDTT_dg.b(VDTT_dg.b, var1, Caption.vl, this.X[2].objX + 15, this.X[2].objY + 37, 2, -1, -16777216);
         if (this.S != null) {
            this.S.b(var1, this.X[1].objX + this.X[1].h / 2, this.X[1].objY + this.X[1].h / 2);
         }

         VDTT_dc.a(var1, 95, 0, 103 + DataCenter.d().h / 3 % 3, this.f() + 25, 20);
         VDTT_dc.a(var1, 95, -360, 174 - DataCenter.d().h / 3 % 3, this.f() + 25, 20);
         int var2 = this.f() + 98;
         if (this.R[0] == 0 || this.R[0] % 12 > 5) {
            int var3 = VDTT_ek.m().f(829);
            if (this.T > 0) {
               if (this.T == 1) {
                  VDTT_dg.b(VDTT_dg.d, var1, Caption.tG, this.q / 2, var2, 2, -2560, -16777216);
               } else {
                  VDTT_dg.b(VDTT_dg.d, var1, Caption.tH, this.q / 2, var2, 2, -1, -16777216);
               }
            } else if (this.O[1] != null) {
               if (var3 < this.am) {
                  VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.np, VDTT_jb.c(this.am)) + VDTT_jb.b(Caption.lN, VDTT_jb.c(var3)), this.Z[0].objX - 30, this.Z[1].objY + 26, 0, -65536, -16777216);
               } else {
                  VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.np, VDTT_jb.c(this.am)) + VDTT_jb.b(Caption.lN, VDTT_jb.c(var3)), this.Z[0].objX - 30, this.Z[1].objY + 26, 0, -6488, -16777216);
               }
            } else {
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.np, VDTT_jb.c(this.am)) + VDTT_jb.b(Caption.lN, VDTT_jb.c(var3)), this.Z[0].objX - 30, this.Z[1].objY + 26, 0, -6488, -16777216);
            }
         }

         VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.tB, VDTT_jb.c(this.an)), this.Z[0].objX - 30, this.Z[1].objY + 40, 0, -6488, -16777216);
         VDTT_dg.b(VDTT_dg.d, var1, Caption.tC, this.Z[0].objX - 30, this.Z[1].objY + 54, 0, -6488, -16777216);
         VDTT_dg.b(VDTT_dg.d, var1, Caption.vj, this.Z[0].objX - 30, this.Z[1].objY + 68, 0, -6488, -16777216);
         VDTT_dg.b(VDTT_dg.d, var1, Caption.tD, this.Z[0].objX - 30, this.Z[1].objY + 82, 0, -6488, -16777216);
         VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.a(Caption.xn, (long)(this.W + 1)), this.Z[0].objX - 30, this.Z[1].objY + 96, 0, -6488, -16777216);
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.X.length; ++var2) {
            var1.addElement(this.X[var2].a(1001 + var2, this));
         }
      }

      return var1;
   }

   public final void f(int var1) {
      super.f(var1);
      this.T = 0;
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
               DataCenter.d().ai.c(Caption.ty, -1);
               return;
            }
            break;
         case 1002:
            this.Q = 2;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.O[1]);
            return;
         case 1003:
            try {
               this.Q = 3;
               this.a(var1.j, var1.j.k);
               if (this.P[var1.j.k] != null) {
                  this.k = a(var1, this, this.P[var1.j.k]);
                  return;
               }

               this.f(2);
               DataCenter.d().ai.c(Caption.ty, -1);
            } catch (Exception var5) {
            }
            break;
         case 2001:
            this.a(false);
            return;
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
      if (this.O[0] != null) {
         VDTT_ek.m().i(this.O[0].w)[this.O[0].f] = this.O[0];
         this.O[0] = null;
      }

      this.C();
   }

   private void a(boolean var1) {
      try {
         if (this.T > 0) {
            this.T = 0;
         } else if (this.O[1] == null) {
            this.R[1] = 50;
         } else if (VDTT_ek.m().f(829) < this.am) {
            this.R[0] = 50;
         } else if (!var1) {
            Message var7 = Message.c((byte)-25);
            if (this.aa.a() == 0) {
               var7.a(this.O[0].w);
               var7.b(this.O[0].f);
               var7.a(this.P[0].w);
               var7.b(this.P[0].f);
            } else {
               var7.a(this.P[0].w);
               var7.b(this.P[0].f);
               var7.a(this.O[0].w);
               var7.b(this.O[0].f);
            }

            var7.l();
         } else {
            Item var5;
            if (this.aa.a() == 0) {
               var5 = this.P[0];
            } else {
               var5 = this.O[0];
            }

            VDTT_gz[] var6 = var5.L();

            for(int var2 = 0; var2 < var6.length; ++var2) {
               if ((var6[var2].b[0] == 298 || var6[var2].b[0] == 350) && var6[var2].b[1] > 0) {
                  DataCenter.d().ai.a(VDTT_jb.b(Caption.tE, VDTT_jb.c(this.am)), 2001, this);
                  return;
               }
            }

            DataCenter.d().ai.a(VDTT_jb.b(Caption.tE, VDTT_jb.c(this.am)), 2001, this);
         }
      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }
   }
}
