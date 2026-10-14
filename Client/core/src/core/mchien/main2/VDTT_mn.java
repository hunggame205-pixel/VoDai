package core.mchien.main2;

import java.util.Vector;

public final class VDTT_mn extends VDTT_ka {
   public Item[] O = new Item[16];
   private VDTT_ht[] W;
   private VDTT_ba X;
   public boolean P;
   public VDTT_hi Q;
   private int Y;
   public VDTT_bf R;
   public Vector S = new Vector();
   public int[] T = new int[2];
   private String Z = "";

   public VDTT_mn(VDTT_p var1) {
      super(var1, new String[]{Caption.yU[5], Caption.P});
      this.ac = new Item[2];
      this.W = new VDTT_ht[3];
      this.W[0] = new VDTT_ht((byte)1, 14, this.f() + 20, 30, 30, 30, 1, 1);
      this.W[1] = new VDTT_ht((byte)1, 104, this.f() + 20, 30, 30, 30, 1, 1);
      this.W[2] = new VDTT_ht((byte)1, 162, this.f() + 20, 128, 128, 32, 4, 4);
      this.X = this.a(this.q - 70, this.r - 33, Caption.B, this, 0, -8);
      this.a(this.X, 0);
      VDTT_hp var3 = new VDTT_hp(1004, new String[]{""});
      this.R = this.a(14, this.f() + 178, 100, var3.c.length, var3, this, 1);
      this.R.b(true);
      this.R.a(0);
      this.a(this.R, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].C()) {
            this.ak.add(var1[var2]);
         }
      }

   }

   public final void f(int var1) {
      super.f(var1);
      if (this.P) {
         this.P = false;

         for(var1 = 0; var1 < this.ab.length; ++var1) {
            this.ac[var1] = null;
         }
      }

   }

   private void C() {
      int var1;
      for(var1 = 0; var1 < this.O.length; ++var1) {
         this.O[var1] = null;
      }

      this.Y = 0;
      this.Z = this.ac[0].strOptions;
      this.ac[1] = this.ac[0].a();
      VDTT_gz[] var11;
      if ((var11 = this.ac[1].L()) != null) {
         Vector var2 = new Vector();
         Vector var3 = new Vector();

         int var4;
         VDTT_gz var5;
         for(var4 = 0; var4 < var11.length; ++var4) {
            if ((var5 = var11[var4]).m()) {
               var3.add(var5);
            }
         }

         VDTT_gz var13 = null;
         var5 = null;
         VDTT_gz var6 = null;
         int var7;
         int var8;
         VDTT_gz var9;
         if (this.R.n.b == 0) {
            var2.addAll(this.S);

            for(var7 = 0; var7 < var11.length; ++var7) {
               VDTT_gz var17;
               if ((var17 = var11[var7]).k()) {
                  var17.c(0);
                  var3.add(var17);
               } else if (!var17.l()) {
                  var3.add(var17);
               }
            }
         } else {
            var2.add((VDTT_gz)this.S.get(this.R.n.b - 1));
            var7 = 0;

            for(var8 = 0; var8 < var11.length; ++var8) {
               if ((var9 = var11[var8]).a().a == 349) {
                  var13 = var9;
               } else if (var9.a().a == 350) {
                  var5 = var9;
               } else if (var9.a().a == 298) {
                  var6 = var9;
               }

               if (var9.l()) {
                  ++var7;
                  if (var7 != this.R.n.b) {
                     var3.add(var9);
                  } else if (var9.a().c == 17) {
                     var13.c(var13.b[1] - 1);
                  } else if (var9.j()) {
                     var5.c(var5.b[1] - 1);
                  } else if (var9.a().c == 8) {
                     var6.c(var6.b[1] - 1);
                  }
               } else if (!var3.contains(var9)) {
                  var3.add(var9);
               }
            }
         }

         for(var7 = 0; var7 < var11.length; ++var7) {
            if (((var13 = var11[var7]).b[0] == 370 || var13.a().c == 18) && !var3.contains(var11[var7])) {
               var3.add(var11[var7]);
            }
         }

         Vector var18 = new Vector();

         for(var8 = 0; var8 < var2.size(); ++var8) {
            if ((var1 = (var9 = (VDTT_gz)var2.get(var8)).h()) >= 0) {
               if (var9.a().c != 17 && !var9.j()) {
                  if (var9.a().c == 8) {
                     var4 = var9.b[3];
                     int var15 = 0;

                     for(int var16 = 0; var16 <= var4; ++var16) {
                        var15 += DataCenter.d().ar[var16];
                     }

                     var18.add(new Item(var1, true, var15));
                  }
               } else {
                  Item var14;
                  (var14 = new Item(var1, true)).strOptions = var9.g();
                  var18.add(var14);
               }
            }
         }

         this.ac[1].strOptions = Item.a(var3);
         var8 = 0;

         for(int var19 = 0; var19 < var18.size(); ++var19) {
            Item var12;
            if ((var12 = (Item)var18.get(var19)).getItemTemplate().f == 32) {
               this.Y += var12.M();
            } else {
               var8 += var12.M();
            }

            if (var19 >= this.O.length) {
               break;
            }

            this.O[var19] = var12;
         }

         this.Y = this.Y / 200 + var8;
      }

   }

   public final void a_() {
      super.a_();
      int var1;
      if (super.a.b == 0) {
         label54: {
            if (!this.P) {
               if (this.ac[0] != null) {
                  if (this.ac[1] == null || !this.Z.equals(this.ac[0].strOptions)) {
                     this.C();
                  }
                  break label54;
               }

               for(var1 = 0; var1 < this.O.length; ++var1) {
                  this.O[var1] = null;
               }

               this.Y = 0;
               this.ac[1] = null;
            }

            this.R.b(true);
         }

         for(var1 = 0; var1 < this.W.length; ++var1) {
            this.W[var1].a();
         }
      }

      if (this.Q != null) {
         this.Q.o();
         if (this.Q.p()) {
            this.Q = null;
         }
      }

      for(var1 = 0; var1 < this.T.length; ++var1) {
         if (this.T[var1] > 0) {
            int var10002 = this.T[var1]--;
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
         if (this.T[1] == 0 || this.T[1] % 12 > 5) {
            VDTT_dg.b(VDTT_dg.d, var1, Caption.ee, 14, this.f() + 11, 0, -10831436, -16777216);
         }

         a(var1, this.W[0].objX, this.W[0].objY, this.ac[0], this.W[0].k >= 0, Caption.bD);
         a(var1, this.W[1].objX, this.W[1].objY, this.ac[1], this.W[1].k >= 0, Caption.Q);
         VDTT_dc.a(var1, 95, 0, 65 - DataCenter.d().h / 3 % 3, this.f() + 25, 20);
         if (this.P) {
            if (this.T[0] == 0 || this.T[0] % 12 > 5) {
               VDTT_dg.b(VDTT_dg.d, var1, Caption.ps, this.R.objX, this.f() + 70, 0, -2560, -16777216);
            }
         } else if (this.ac[0] != null && (this.T[0] == 0 || this.T[0] % 12 > 5)) {
            if (VDTT_ek.m().an < this.Y) {
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.qN, VDTT_jb.c(this.Y)), this.R.objX, this.f() + 70, 0, -65536, -16777216);
            } else {
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.qN, VDTT_jb.c(this.Y)), this.R.objX, this.f() + 70, 0, -30976, -16777216);
            }
         }

         this.a(var1, this.W[2]);

         for(int var2 = 0; var2 < this.W[2].i; ++var2) {
            for(int var3 = 0; var3 < this.W[2].P; ++var3) {
               b(var1, var3 * this.W[2].h, var2 * this.W[2].h, this.O[var2 * this.W[2].P + var3], var2 * this.W[2].i + var3 == this.W[2].k, "");
            }
         }

         this.a(var1);
         if (this.Q != null) {
            this.Q.b(var1, this.W[1].objX + this.W[1].h / 2, this.W[1].objY + this.W[1].h / 2);
            return;
         }
      } else {
         this.B();
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
            this.ad = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.ac[0]);
            if (this.ac[0] == null) {
               this.f(2);
               DataCenter.d().ai.c(Caption.nV, -1);
               return;
            }
            break;
         case 1002:
            this.ad = 10;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.ac[1]);
            return;
         case 1003:
            try {
               this.ad = 10;
               this.a(var1.j, var1.j.k);
               this.k = a(var1, this, this.O[var1.j.k]);
               return;
            } catch (Exception var5) {
               return;
            }
         case 2001:
            this.a(false);
         }
      }

   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      super.perform(var1, var2, var3);
      if (var1 == 1004) {
         this.C();
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
         if (!this.P && VDTT_ek.m().an >= this.Y) {
            if (this.ac[0] == null) {
               this.T[1] = 50;
            } else if (this.ac[0] == null) {
               DataCenter.d().ai.c(Caption.ee, -65536);
            } else if (var1) {
               DataCenter.d().ai.a(VDTT_jb.b(Caption.jT, this.R.f().toLowerCase()) + VDTT_jb.b(Caption.ke, VDTT_jb.c(this.Y)), 2001, this);
            } else {
               Message var4;
               (var4 = new Message((byte)-47)).a(this.ac[0].w);
               var4.b(this.ac[0].f);
               var4.a(this.R.n.b);
               var4.l();
            }
         } else {
            this.T[0] = 50;
         }
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }
}
