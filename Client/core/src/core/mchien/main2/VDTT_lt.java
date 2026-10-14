package core.mchien.main2;

import java.util.Collections;
import java.util.Vector;

public final class VDTT_lt extends VDTT_ka {
   public Item[] O = new Item[2];
   public Item[] P = new Item[2];
   private VDTT_ht[] W = new VDTT_ht[3];
   private VDTT_ba X;
   public int Q;
   public int[] R = new int[3];
   public VDTT_hi S;
   public VDTT_bf T;
   private Vector Y;
   private int[] Z;
   private int aa = 0;
   private boolean am;

   public VDTT_lt(VDTT_p var1) {
      super(var1, new String[]{Caption.yU[4], Caption.P});
      this.W[0] = new VDTT_ht((byte)1, 94, this.f() + 20, 30, 30, 30, 1, 1);
      this.W[1] = new VDTT_ht((byte)1, 174, this.f() + 20, 30, 30, 30, 1, 1);
      this.W[2] = new VDTT_ht((byte)1, 118, this.f() + 60, 64, 32, 32, 1, 2);
      this.X = this.a(this.q - 70, this.r - 33, Caption.ec, this, 0, -8);
      this.a(this.X, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].A()) {
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

   public final void a_() {
      super.a_();
      int var14;
      if (super.a.b == 0) {
         this.O[1] = null;
         this.Z = null;
         this.aa = 0;
         if (this.O[0] != null && this.P[0] != null) {
            int var5;
            VDTT_gz var6;
            Vector var16;
            if (this.P[0].getItemTemplate().f == 35) {
               this.O[1] = this.O[0].b();
               byte var12 = this.O[1].s;
               this.O[1].a(0);
               VDTT_gz[] var13;
               if ((var13 = this.O[1].L()) != null && this.P[0].strOptions.length() > 0) {
                  var16 = new Vector();
                  boolean var19 = false;

                  for(var5 = 0; var5 < var13.length; ++var5) {
                     var6 = var13[var5];
                     var16.add(var6);
                     if (var6.b[0] == 349 && var6.b[1] < var6.f()) {
                        var6.c(var6.b[1] + 1);
                        var16.add(this.P[0].L()[0]);
                        var19 = true;
                     }
                  }

                  if (var19) {
                     this.O[1].strOptions = Item.a(var16);
                     this.O[1].a(var12);
                  } else {
                     this.O[1] = null;
                  }
               } else {
                  this.O[1] = null;
               }
            } else if (this.P[0].getItemTemplate().f == 36) {
               this.O[1] = this.O[0].b();
               VDTT_gz[] var10;
               if ((var10 = this.O[1].L()) != null && this.P[0].strOptions.length() > 0) {
                  Vector var11 = new Vector();
                  var16 = new Vector();
                  int var18 = -1;

                  for(var5 = 0; var5 < var10.length; ++var5) {
                     if ((var6 = var10[var5]).j()) {
                        if (var6.a().c == this.P[0].L()[0].a().c) {
                           var18 = -1;
                           break;
                        }

                        var16.add(var6);
                     } else {
                        var11.add(var6);
                     }

                     if (var6.b[0] == 350 && var6.b[1] < var6.f()) {
                        var18 = var5;
                     }
                  }

                  if (var18 < 0) {
                     this.O[1] = null;
                  } else {
                     var10[var18].c(var10[var18].b[1] + 1);
                     var16.add(this.P[0].L()[0]);
                     Collections.sort(var16, VDTT_gz.a);

                     for(var5 = 0; var5 < var16.size(); ++var5) {
                        var11.insertElementAt((VDTT_gz)var16.get(var5), var18 + 1);
                     }

                     this.O[1].strOptions = Item.a(var11);
                  }
               } else {
                  this.O[1] = null;
               }
            } else {
               boolean var1 = true;
               int var2 = -1;

               int var3;
               for(var3 = 0; var3 < this.P.length; ++var3) {
                  if (this.P[var3] != null) {
                     if (var2 == -1) {
                        var2 = this.P[var3].c;
                     } else if (var2 != this.P[var3].c) {
                        var1 = false;
                        break;
                     }

                     this.aa += this.P[var3].M();
                  }
               }

               this.O[1] = this.O[0].b();
               var16 = new Vector();
               VDTT_gz var4;
               if ((var4 = this.O[1].a(var16, var2)) != null) {
                  if (var4.a(this.O[1].u())) {
                     var1 = false;
                  }
               } else {
                  var5 = 0;
                  var6 = null;
                  VDTT_gz[] var17 = this.O[1].L();
                  Vector var7 = new Vector();
                  int var8;
                  if (var17 != null) {
                     for(var8 = 0; var8 < var17.length; ++var8) {
                        var7.add(var17[var8]);
                        if (var17[var8].b[0] == 298) {
                           var6 = var17[var8];
                           var5 = var17[var8].f();
                        }
                     }
                  }

                  if (var16.size() >= var5) {
                     var1 = false;
                  } else if (var2 >= 0) {
                     var7.insertElementAt(VDTT_gz.g(var2), var7.indexOf(var6) + 1);
                     var8 = 0;

                     for(var3 = 0; var3 < var7.size(); ++var3) {
                        if (((VDTT_gz)var7.get(var3)).a().c == 8) {
                           ++var8;
                        }
                     }

                     var6.c(var8);
                     this.O[1].strOptions = Item.a(var7);
                  }
               }

               if (this.aa > 0) {
                  this.Z = this.O[1].a(this.aa, var2);
               } else {
                  this.Z = null;
               }

               if (!var1 || this.Z == null || this.Z[1] == this.Z[2]) {
                  this.O[1] = null;
               }
            }
         }

         for(var14 = 0; var14 < this.W.length; ++var14) {
            this.W[var14].a();
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

      for(var14 = 0; var14 < this.R.length; ++var14) {
         if (this.R[var14] > 0) {
            int var10002 = this.R[var14]--;
         }
      }

      DataCenter.d();
      if (!DataCenter.b() && VDTT_cw.v().br == 5) {
         int[] var15;
         int var10001;
         if (VDTT_cw.v().bs == 11) {
            if (this.O[0] != null && this.O[0].V() > 0) {
               this.y();
               return;
            }

            if (this.O[0] == null) {
               if (super.a.b != 1) {
                  var10001 = this.objX + 145;
                  DataCenter.d().aA.a(var10001, this.objY + 14);
                  DataCenter.d().aA.b = true;
                  return;
               }

               if (this.k == null) {
                  if (this.U.h() != 0) {
                     var10001 = this.objX + 90;
                     DataCenter.d().aA.a(var10001, this.objY + 47);
                     DataCenter.d().aA.b = true;
                     return;
                  }

                  var10001 = this.objX + 65;
                  DataCenter.d().aA.a(var10001, this.objY + 80);
                  DataCenter.d().aA.b = true;
                  return;
               }
            } else if (this.P[0] == null) {
               if (super.a.b != 2) {
                  var10001 = this.objX + 240;
                  DataCenter.d().aA.a(var10001, this.objY + 14);
                  DataCenter.d().aA.b = true;
                  return;
               }

               if (this.k == null) {
                  if ((var15 = this.D()) != null) {
                     var10001 = this.objX + var15[0] + 20;
                     DataCenter.d().aA.a(var10001, this.objY + 50 + var15[1] + 15);
                     DataCenter.d().aA.b = true;
                  }

                  return;
               }
            } else {
               if (super.a.b != 0) {
                  var10001 = this.objX + 80;
                  DataCenter.d().aA.a(var10001, this.objY + 14);
                  DataCenter.d().aA.b = true;
                  return;
               }

               if (this.k == null) {
                  DataCenter.d().aA.a(this.objX + this.X.objX + 25 + VDTT_d.g().l(), this.objY + this.X.objY + 14);
                  DataCenter.d().aA.b = true;
                  return;
               }
            }
         } else if (VDTT_cw.v().bs == 12) {
            if (this.O[0] != null && this.O[0].X() > 0) {
               this.y();
               return;
            }

            if (this.O[0] == null) {
               if (super.a.b != 1) {
                  var10001 = this.objX + 145;
                  DataCenter.d().aA.a(var10001, this.objY + 14);
                  DataCenter.d().aA.b = true;
                  return;
               }

               if (this.k == null) {
                  if (this.U.h() != 0) {
                     var10001 = this.objX + 90;
                     DataCenter.d().aA.a(var10001, this.objY + 47);
                     DataCenter.d().aA.b = true;
                     return;
                  }

                  var10001 = this.objX + 65;
                  DataCenter.d().aA.a(var10001, this.objY + 80);
                  DataCenter.d().aA.b = true;
                  return;
               }
            } else if (this.P[0] == null) {
               if (super.a.b != 2) {
                  var10001 = this.objX + 240;
                  DataCenter.d().aA.a(var10001, this.objY + 14);
                  DataCenter.d().aA.b = true;
                  return;
               }

               if (this.k == null) {
                  if ((var15 = this.E()) != null) {
                     var10001 = this.objX + var15[0] + 20;
                     DataCenter.d().aA.a(var10001, this.objY + 50 + var15[1] + 15);
                     DataCenter.d().aA.b = true;
                  }

                  return;
               }
            } else {
               if (super.a.b != 0) {
                  var10001 = this.objX + 80;
                  DataCenter.d().aA.a(var10001, this.objY + 14);
                  DataCenter.d().aA.b = true;
                  return;
               }

               if (this.k == null) {
                  DataCenter.d().aA.a(this.objX + this.X.objX + 25 + VDTT_d.g().l(), this.objY + this.X.objY + 14);
                  DataCenter.d().aA.b = true;
                  return;
               }
            }
         } else if (VDTT_cw.v().bs == 13) {
            this.y();
         }
      }

   }

   private int[] D() {
      if (this.aj.length == 0) {
         return null;
      } else {
         int[] var1 = null;

         for(int var2 = 0; var2 < this.aj.length; ++var2) {
            if (this.aj[var2].getItemTemplate().f == 35) {
               var1 = new int[]{var2 % 9 * 32, var2 / 9 * 32};
               break;
            }
         }

         return var1;
      }
   }

   private int[] E() {
      if (this.aj.length == 0) {
         return null;
      } else {
         int[] var1 = null;

         for(int var2 = 0; var2 < this.aj.length; ++var2) {
            if (this.aj[var2].getItemTemplate().f == 36) {
               var1 = new int[]{var2 % 9 * 32, var2 / 9 * 32};
               break;
            }
         }

         return var1;
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
            VDTT_dg.b(VDTT_dg.d, var1, Caption.cO, this.q / 2, this.f() + 11, 2, -10831436, -16777216);
         }

         a(var1, this.W[0].objX, this.W[0].objY, this.O[0], this.W[0].k >= 0, Caption.bD);
         a(var1, this.W[1].objX, this.W[1].objY, this.O[1], this.W[1].k >= 0, Caption.Q);
         VDTT_dc.a(var1, 95, 0, 142 - DataCenter.d().h / 3 % 3, this.f() + 25, 20);
         int var2 = this.f() + 98;
         int var4;
         int var6;
         if (this.R[2] > 0) {
            this.am = true;
            if (this.R[2] % 12 > 5) {
               VDTT_dg.b(VDTT_dg.d, var1, Caption.lz, 92, var2, 0, -2560, -16777216);
            }
         } else if (this.O[0] != null && this.P[0] != null && (this.R[0] == 0 || this.R[0] % 12 > 5)) {
            if (this.P[0].getItemTemplate().f != 35) {
               if (this.P[0].getItemTemplate().f == 36) {
                  if ((var6 = this.O[0].W()) > 0) {
                     VDTT_dg.b(VDTT_dg.d, var1, "- " + VDTT_jb.b(Caption.ib, "" + var6), 92, var2, 0, -6488, -16777216);
                  } else {
                     VDTT_dg.b(VDTT_dg.d, var1, Caption.tr, 92, var2, 0, -6488, -16777216);
                  }
               } else if (this.P[0].getItemTemplate().f == 32) {
                  if (this.Z != null) {
                     if ((var4 = this.O[0].Y()) > 0) {
                        VDTT_dg.b(VDTT_dg.d, var1, "- " + VDTT_jb.b(Caption.ic, "" + var4), 92, var2, 0, -6488, -16777216);
                     } else {
                        VDTT_dg.b(VDTT_dg.d, var1, Caption.iC, 92, var2, 0, -6488, -16777216);
                     }

                     String var10002;
                     VDTT_dg var7;
                     if (this.Z[1] >= 16) {
                        var7 = VDTT_dg.d;
                        var10002 = "- " + DataCenter.d().O[this.Z[0]].b + " " + Caption.nh;
                        var2 += 14;
                        VDTT_dg.b(var7, var1, var10002, 92, var2, 0, -2560, -16777216);
                     } else if (this.Z[1] == this.Z[2]) {
                        var7 = VDTT_dg.d;
                        var10002 = "- " + Caption.ec + " " + DataCenter.d().O[this.Z[0]].b;
                        var2 += 14;
                        VDTT_dg.b(var7, var1, var10002, 92, var2, 0, -65536, -16777216);
                        var7 = VDTT_dg.d;
                        var10002 = "- " + Caption.aw + this.Z[1] + Caption.tu + (this.Z[1] + 1);
                        var2 += 14;
                        VDTT_dg.b(var7, var1, var10002, 92, var2, 0, -65536, -16777216);
                        var7 = VDTT_dg.d;
                        StringBuilder var8 = (new StringBuilder("- ")).append(Caption.ni).append(" ");
                        int var10004 = this.Z[1];
                        var10002 = var8.append(VDTT_jb.c(DataCenter.d().ar[var10004 + 1])).append(" ").append(Caption.nj).toString();
                        var2 += 14;
                        VDTT_dg.b(var7, var1, var10002, 92, var2, 0, -65536, -16777216);
                     } else {
                        var7 = VDTT_dg.d;
                        var10002 = "- " + Caption.ec + " " + DataCenter.d().O[this.Z[0]].b;
                        var2 += 14;
                        VDTT_dg.b(var7, var1, var10002, 92, var2, 0, -1, -16777216);
                        var7 = VDTT_dg.d;
                        var10002 = "- " + Caption.aw + this.Z[1] + Caption.tu + this.Z[2];
                        var2 += 14;
                        VDTT_dg.b(var7, var1, var10002, 92, var2, 0, -1, -16777216);
                        var7 = VDTT_dg.d;
                        var10002 = "- " + Caption.ni + " " + VDTT_jb.c(this.Z[3]) + " " + Caption.nj;
                        var2 += 14;
                        VDTT_dg.b(var7, var1, var10002, 92, var2, 0, -1, -16777216);
                        if (this.aa > this.Z[3]) {
                           var7 = VDTT_dg.d;
                           var10002 = "- " + Caption.nk;
                           var2 += 14;
                           VDTT_dg.b(var7, var1, var10002, 92, var2, 0, -30976, -16777216);
                        }
                     }

                     if (this.Z[2] >= 17) {
                        var7 = VDTT_dg.d;
                        var10002 = "- " + Caption.qo;
                        var2 += 14;
                        VDTT_dg.b(var7, var1, var10002, 92, var2, 0, -2560, -16777216);
                     }
                  } else if ((var6 = this.O[0].Y()) > 0) {
                     VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.tv, var6 + "/" + var6), 92, var2, 0, -6488, -16777216);
                  } else {
                     VDTT_dg.b(VDTT_dg.d, var1, Caption.iC, 92, var2, 0, -6488, -16777216);
                  }
               }
            } else {
               int var10000;
               label116: {
                  VDTT_gz[] var3;
                  if ((var3 = this.O[0].L()) != null) {
                     for(var4 = 0; var4 < var3.length; ++var4) {
                        if (var3[var4].b[0] == 349) {
                           var10000 = var3[var4].f();
                           break label116;
                        }
                     }
                  }

                  var10000 = 0;
               }

               var6 = var10000;
               if (var10000 > 0) {
                  VDTT_dg.b(VDTT_dg.d, var1, "- " + VDTT_jb.b(Caption.ia, "" + var6), 92, var2, 0, -6488, -16777216);
               } else {
                  VDTT_dg.b(VDTT_dg.d, var1, Caption.tq, 92, var2, 0, -6488, -16777216);
               }
            }
         }

         this.a(var1, this.W[2]);
         var6 = 0;

         for(var4 = 0; var4 <= 0; ++var4) {
            for(var2 = 0; var2 < this.W[2].P; ++var2) {
               b(var1, var2 * this.W[2].h, var4 * this.W[2].h, this.P[var4 * this.W[2].P + var2], var6 == this.W[2].k, Caption.ta);
               ++var6;
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

   public final void f(int var1) {
      super.f(var1);
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         this.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         VDTT_lt var11;
         switch(var1.b) {
         case 0:
            var11 = this;

            try {
               if (var11.O[0] != null && var11.P[0] != null) {
                  byte var14 = 16;
                  if (var11.O[0].U()) {
                     var14 = 17;
                  }

                  if (var11.O[1] == null) {
                     var11.R[0] = 50;
                  } else if (var11.Z == null || var11.Z[1] < var14 && var11.Z[1] != var11.Z[2]) {
                     Message var15;
                     (var15 = new Message((byte)-46)).a(var11.O[0].w);
                     var15.b(var11.O[0].f);
                     var15.b(var11.P[0].f);
                     if (var11.P[1] != null) {
                        var15.b(var11.P[1].f);
                     }

                     var15.l();
                  } else {
                     var11.R[0] = 50;
                  }
               } else {
                  var11.R[1] = 50;
               }
               break;
            } catch (Exception var10) {
               VDTT_jb.a(var10);
               return;
            }
         case 1001:
            this.Q = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.O[0]);
            if (this.O[0] == null) {
               byte var12 = 2;
               super.f(var12);
               DataCenter.d().ai.c(Caption.nS, -1);
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

               this.k = b(Caption.tb, this, var1.j.objX + 32, var1.j.objY, 100);
               break;
            } catch (Exception var8) {
               return;
            }
         case 2001:
            try {
               Message.c((byte)-69).l();
               break;
            } catch (Exception var7) {
               return;
            }
         case 2002:
            var11 = this;
            this.C();
            short var13 = ((VDTT_fu)this.Y.get(this.T.n.b)).a;

            for(var3 = 0; var3 < VDTT_ek.m().aP.length; ++var3) {
               if (VDTT_ek.m().aP[var3] != null && VDTT_ek.m().aP[var3].c == var13) {
                  Item var5 = VDTT_ek.m().aP[var3];
                  VDTT_lt var4 = var11;

                  try {
                     for(int var6 = 0; var6 < var4.P.length; ++var6) {
                        if (var4.P[var6] == null) {
                           var4.P[var6] = var5;
                           break;
                        }
                     }

                     VDTT_ek.m().aP[var5.f] = null;
                  } catch (Exception var9) {
                     VDTT_jb.a(var9);
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

      this.C();
   }
}
