package core.mchien.main2;

import java.util.Vector;

public final class VDTT_kp extends VDTT_ka {
   private VDTT_ht[] T;
   private VDTT_ba W;
   public int[] O = new int[3];
   public VDTT_hi P;
   public Item Q;
   public boolean R;
   private int X;
   private int Y;
   private String Z = "";
   private VDTT_gz aa;
   public boolean S;
   private VDTT_bu[] am = new VDTT_bu[3];
   private VDTT_ho an;

   public VDTT_kp(VDTT_p var1) {
      super(var1, new String[]{Caption.rv, Caption.P});
      this.ab = new Item[1];
      this.T = new VDTT_ht[2];
      this.T[0] = new VDTT_ht((byte)1, 14, this.f() + 20, 30, 30, 30, 1, 1);
      this.T[1] = new VDTT_ht((byte)1, 104, this.f() + 20, 30, 30, 30, 1, 1);
      this.W = this.a(this.q - 70, this.r - 33, Caption.rx, this, 300, -8);
      this.a(this.W, 0);
      this.an = new VDTT_ho(200, 0);
      this.am[0] = this.a(14, this.f() + 94, Caption.tf, this, this.an);
      this.am[1] = this.a(14, this.f() + 112, Caption.tg, this, this.an);
      this.am[2] = this.a(14, this.f() + 130, Caption.th, this, this.an);
      VDTT_ho var10000 = this.an;
      boolean var5 = true;
      VDTT_ho var6 = var10000;
      var10000.b = 2;

      for(int var3 = 0; var3 < var6.c.size(); ++var3) {
         VDTT_bu var2 = (VDTT_bu)var6.c.elementAt(var3);
         boolean var4;
         if (var3 == 2) {
            var4 = true;
            var2.l = var4;
         } else {
            var4 = false;
            var2.l = var4;
         }
      }

      this.a(this.am[0], 0);
      this.a(this.am[1], 0);
      this.a(this.am[2], 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].ab()) {
            this.ak.add(var1[var2]);
         }
      }

   }

   public final void a_() {
      super.a_();
      int var12;
      if (super.a.b == 0) {
         VDTT_kp var1 = this;

         for(int var2 = 0; var2 < var1.am.length; ++var2) {
            VDTT_bu var10000 = var1.am[var2];
            boolean var3 = true;
            var10000.d = var3;
         }

         if (var1.ab[0] == null) {
            if (!var1.R) {
               var1.Q = null;
            }
         } else if (var1.Q == null || !var1.Z.equals(var1.ab[0].strOptions)) {
            var1.Z = var1.ab[0].strOptions;
            var1.Q = var1.ab[0].a();
            VDTT_gz[] var13 = var1.Q.L();
            var1.aa = null;
            short var14 = 349;
            byte var4 = 4;
            byte var5 = 3;
            switch(var1.an.b) {
            case 1:
               var14 = 350;
               var4 = 7;
               var5 = 6;
               break;
            case 2:
               var14 = 298;
               var4 = 5;
               var5 = 4;
            }

            var1.X = var1.Y = 0;
            VDTT_gz var6 = null;
            VDTT_gz var7 = null;
            Vector var8 = new Vector();
            int var9;
            if (var13 != null) {
               for(var9 = 0; var9 < var13.length; ++var9) {
                  if (var13[var9].b[0] == 349) {
                     var7 = var13[var9];
                  }

                  if (var13[var9].b[0] == var14) {
                     var1.aa = var13[var9];
                  }

                  VDTT_gz var10;
                  if ((var10 = var13[var9]).b[0] == 159 || var10.b[0] == 165 || var10.b[0] == 163 || var10.b[0] == 164 || var10.b[0] == 148) {
                     var6 = var13[var9];
                  } else {
                     var8.add(var13[var9]);
                  }
               }
            }

            if (var1.aa == null) {
               var1.aa = new VDTT_gz(var14 + ",0,1");
               if (var1.an.b == 0) {
                  var8.insertElementAt(var1.aa, 0);
               } else if (var1.an.b == 1) {
                  if (var7 == null) {
                     var8.insertElementAt(var1.aa, 0);
                  } else {
                     for(int var15 = var9 = var8.indexOf(var7); var15 < var13.length; ++var15) {
                        if (var13[var15].a().c == 17) {
                           var9 = var15;
                        }
                     }

                     ++var9;
                     var8.insertElementAt(var1.aa, var9);
                  }
               } else if (var1.an.b == 2) {
                  var8.add(var1.aa);
               }
            } else if (var1.aa.f() < var4) {
               var1.aa.e(var1.aa.f() + 1);
            } else {
               var1.aa = null;
            }

            if (var1.aa.f() < var5) {
               var1.X = 250000;
            } else {
               var1.Y = 250000;
            }

            if (var6 != null) {
               var8.add(var6);
            }

            var1.Q.strOptions = Item.a(var8);
         }

         for(var12 = 0; var12 < this.T.length; ++var12) {
            this.T[var12].a();
         }
      } else {
         this.B();
      }

      if (this.P != null) {
         this.P.o();
         if (this.P.p()) {
            this.P = null;
         }
      }

      for(var12 = 0; var12 < this.O.length; ++var12) {
         if (this.O[var12] > 0) {
            int var10002 = this.O[var12]--;
         }
      }

      String var16;
      if (this.R) {
         var16 = Caption.rG;
         this.W.l = var16;
      } else {
         var16 = Caption.rx;
         this.W.l = var16;
      }

      if (VDTT_cw.v().br == 5) {
         int var10001;
         if (VDTT_cw.v().bs == 9) {
            if (this.ab[0] == null) {
               if (super.a.b != 1) {
                  var10001 = this.objX + 145;
                  DataCenter.d().aA.a(var10001, this.objY + 14);
               } else if (this.k == null) {
                  if (this.U.h() != 0) {
                     var10001 = this.objX + 90;
                     DataCenter.d().aA.a(var10001, this.objY + 47);
                     DataCenter.d().aA.b = true;
                  } else {
                     var10001 = this.objX + 65;
                     DataCenter.d().aA.a(var10001, this.objY + 80);
                     DataCenter.d().aA.b = true;
                  }
               }
            } else if (super.a.b != 0) {
               var10001 = this.objX + 80;
               DataCenter.d().aA.a(var10001, this.objY + 14);
            } else if (!this.am[0].l) {
               DataCenter.d().aA.a(this.objX + this.am[0].objX + 25 + VDTT_d.g().l(), this.objY + this.am[0].objY + 9);
            } else {
               DataCenter.d().aA.a(this.objX + this.W.objX + 25 + VDTT_d.g().l(), this.objY + this.W.objY + 14);
            }

            DataCenter.d().aA.b = true;
            return;
         }

         if (VDTT_cw.v().bs == 10) {
            if (this.ab[0] == null) {
               if (super.a.b != 1) {
                  var10001 = this.objX + 145;
                  DataCenter.d().aA.a(var10001, this.objY + 14);
               } else if (this.k == null) {
                  if (this.U.h() != 0) {
                     var10001 = this.objX + 90;
                     DataCenter.d().aA.a(var10001, this.objY + 47);
                     DataCenter.d().aA.b = true;
                  } else {
                     var10001 = this.objX + 65;
                     DataCenter.d().aA.a(var10001, this.objY + 80);
                     DataCenter.d().aA.b = true;
                  }
               }
            } else if (super.a.b != 0) {
               var10001 = this.objX + 80;
               DataCenter.d().aA.a(var10001, this.objY + 14);
            } else if (!this.am[1].l) {
               DataCenter.d().aA.a(this.objX + this.am[1].objX + 25 + VDTT_d.g().l(), this.objY + this.am[1].objY + 9);
            } else {
               DataCenter.d().aA.a(this.objX + this.W.objX + 25 + VDTT_d.g().l(), this.objY + this.W.objY + 14);
            }

            DataCenter.d().aA.b = true;
            return;
         }

         if (VDTT_cw.v().bs == 11) {
            this.y();
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
         if (this.O[1] == 0 || this.O[1] % 12 > 5) {
            VDTT_dg.b(VDTT_dg.d, var1, Caption.rw, 14, this.f() + 11, 0, -10831436, -16777216);
         }

         if (this.R) {
            if (this.O[2] % 12 > 5 || this.O[2] == 0) {
               VDTT_dg.b(VDTT_dg.d, var1, Caption.rA, this.T[0].objX, this.T[0].objY + 50, 0, -2560, -16777216);
            }
         } else if (this.Q != null && (this.O[0] == 0 || this.O[0] % 12 > 5)) {
            if (this.aa != null) {
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.ry, "" + this.aa.f()), this.T[0].objX, this.T[0].objY + 45, 0, -1, -16777216);
            } else {
               switch(this.an.b) {
               case 0:
                  VDTT_dg.b(VDTT_dg.d, var1, Caption.ti, this.T[0].objX, this.T[0].objY + 50, 0, -2560, -16777216);
                  break;
               case 1:
                  VDTT_dg.b(VDTT_dg.d, var1, Caption.tj, this.T[0].objX, this.T[0].objY + 50, 0, -2560, -16777216);
                  break;
               case 2:
                  VDTT_dg.b(VDTT_dg.d, var1, Caption.tk, this.T[0].objX, this.T[0].objY + 50, 0, -2560, -16777216);
               }
            }

            int var2 = -1;
            if (VDTT_ek.m().ak < this.Y || VDTT_ek.m().al < this.X) {
               var2 = -65536;
            }

            if (this.Y > 0) {
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.pj, VDTT_jb.c(this.Y)), this.T[0].objX, this.T[0].objY + 60, 0, var2, -16777216);
            } else if (this.X > 0) {
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.bv, VDTT_jb.c(this.X)), this.T[0].objX, this.T[0].objY + 60, 0, var2, -16777216);
            }
         }

         VDTT_dc.a(var1, 95, 0, 65 - DataCenter.d().h / 3 % 3, this.f() + 25, 20);
         a(var1, this.T[0].objX, this.T[0].objY, this.ab[0], this.T[0].k >= 0, Caption.bD);
         a(var1, this.T[1].objX, this.T[1].objY, this.Q, this.T[1].k >= 0, Caption.qt);
         if (this.P != null) {
            this.P.b(var1, this.T[1].objX + this.T[1].h / 2, this.T[1].objY + this.T[1].h / 2);
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
         case 300:
            this.a(true);
            return;
         case 1001:
            this.ad = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.ab[0]);
            if (this.ab[0] == null) {
               this.f(1);
               DataCenter.d().ai.c(Caption.rw, -1);
               return;
            }
            break;
         case 1002:
            this.ad = 10;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.Q);
            return;
         case 2001:
            this.a(false);
         }
      }

   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      try {
         super.perform(var1, var2, var3);
         if (var1 == 200) {
            this.Q = null;
            this.O[0] = 0;
         }

      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }
   }

   private void a(VDTT_hs var1, int var2) {
      for(int var3 = 0; var3 < this.T.length; ++var3) {
         this.T[var3].k = -1;
      }

      var1.k = var2;
   }

   private void a(boolean var1) {
      try {
         if (this.Q == null) {
            this.O[1] = 50;
         } else if (this.R) {
            VDTT_ek.m().i(this.Q.w)[this.Q.f] = null;
            this.ab[0] = this.Q;
            this.R = false;
            this.Q = null;
         } else if (this.aa != null && VDTT_ek.m().ak >= this.Y && VDTT_ek.m().al >= this.X) {
            if (this.Q == null) {
               DataCenter.d().ai.c(Caption.rw, -65536);
            } else {
               Message var3;
               (var3 = Message.c((byte)-42)).a(this.ab[0].w);
               var3.b(this.ab[0].f);
               var3.a(this.an.b);
               var3.l();
            }
         } else {
            this.O[0] = 50;
         }
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public final void f(int var1) {
      super.f(var1);
      if (this.R) {
         this.R = false;
         this.Q = null;
      }

   }
}
