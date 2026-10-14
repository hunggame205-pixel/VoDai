package core.mchien.main2;

import java.util.Vector;

public final class VDTT_nf extends VDTT_ka {
   public Item[] O = new Item[3];
   public Item[] P = new Item[20];
   private VDTT_ht[] X = new VDTT_ht[4];
   private VDTT_ba Y;
   private VDTT_ba Z;
   public int Q;
   private long aa = 0L;
   private long am = 0L;
   private long an = 0L;
   private long ao = 0L;
   private int ap = 0;
   private boolean aq = false;
   private boolean ar;
   public int[] R = new int[2];
   public int S = 0;
   public VDTT_hi T;
   public VDTT_bf W;
   private Vector as;
   private String at = "";

   public VDTT_nf(VDTT_p var1) {
      super(var1, new String[]{Caption.yU[1], Caption.P});
      this.X[0] = new VDTT_ht((byte)1, 162, this.f() + 20, 30, 30, 30, 1, 1);
      this.X[1] = new VDTT_ht((byte)1, 242, this.f() + 20, 30, 30, 30, 1, 1);
      this.X[2] = new VDTT_ht((byte)1, 202, this.f() + 65, 30, 30, 30, 1, 1);
      this.X[3] = new VDTT_ht((byte)1, 14, this.f() + 20, 128, 160, 32, 5, 4);
      this.Y = this.a(this.q - 70, this.r - 33, Caption.yU[1], this, 0, -8);
      this.a(this.Y, 0);
      this.Z = this.a(109, this.r - 33, Caption.lh, this, 2002, -8);
      this.a(this.Z, 0);
      VDTT_hp var3;
      int var2 = (var3 = new VDTT_hp(2000, Caption.Ce)).c.length;
      this.W = this.a(14, this.r - 32, 90, var2, var3, this, 1);
      this.W.a(VDTT_eq.a().b(7));
      this.a(this.W, 0);
   }

   public final void a(Item[] var1) {
      int var2;
      for(var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].t()) {
            this.ak.add(var1[var2]);
         }
      }

      this.as = new Vector();

      for(var2 = 0; var2 < VDTT_ek.m().aP.length; ++var2) {
         if (VDTT_ek.m().aP[var2] != null && VDTT_ek.m().aP[var2].getItemTemplate().f == 21) {
            this.as.add(VDTT_ek.m().aP[var2]);
         }
      }

   }

   public final void a_() {
      int var1;
      try {
         super.a_();
         if (super.a.b == 0) {
            this.D();

            for(var1 = 0; var1 < this.X.length; ++var1) {
               this.X[var1].a();
            }
         } else {
            this.B();
         }

         if (this.T != null) {
            this.T.o();
            if (this.T.p()) {
               this.T = null;
            }
         }
      } catch (Exception var6) {
      }

      int var10002;
      for(var1 = 0; var1 < this.R.length; ++var1) {
         if (this.R[var1] > 0) {
            var10002 = this.R[var1]--;
         }
      }

      DataCenter.d();
      if (!DataCenter.b() && VDTT_cw.v().br == 5) {
         if (VDTT_cw.v().bs == 1) {
            int var10001;
            if (super.a.b == 0) {
               if (this.O[0] == null) {
                  var10001 = this.objX + 150;
                  DataCenter.d().aA.a(var10001, this.objY + 15);
               } else if (this.an < 100L) {
                  if (this.as.size() > 0) {
                     var10001 = this.objX + 255;
                     DataCenter.d().aA.a(var10001, this.objY + 10);
                  } else {
                     DataCenter.d().aA.a(this.objX + this.q - 5, this.objY);
                  }
               } else {
                  var10001 = this.objX + 255;
                  var10002 = this.objY + this.r;
                  DataCenter.d().aA.a(var10001, var10002 - 20);
               }
            } else if (super.a.b == 1) {
               if (this.O[0] == null) {
                  if (this.k == null) {
                     var10001 = this.objX + 65;
                     DataCenter.d().aA.a(var10001, this.objY + 75);
                  }
               } else if (this.an < 100L) {
                  var10001 = this.objX + 235;
                  DataCenter.d().aA.a(var10001, this.objY + 15);
               } else {
                  var10001 = this.objX + 85;
                  DataCenter.d().aA.a(var10001, this.objY + 15);
               }
            } else {
               VDTT_ek var2 = VDTT_ek.m();
               int var3 = VDTT_ek.m().aR.length - 1;

               Item var10000;
               while(true) {
                  if (var3 < 0) {
                     var10000 = null;
                     break;
                  }

                  if (var2.aR[var3] != null && var2.aR[var3].getItemTemplate().f == 2) {
                     var10000 = var2.aR[var3];
                     break;
                  }

                  --var3;
               }

               if (var10000 != null && this.O[0] == null) {
                  var10001 = this.objX + 180;
                  DataCenter.d().aA.a(var10001, this.objY + 10);
               } else if (this.k == null) {
                  label167: {
                     VDTT_nf var7 = this;
                     var3 = this.aj.length - 1;

                     int[] var10;
                     while(true) {
                        if (var3 < 0) {
                           var10 = null;
                           break;
                        }

                        if (var7.aj[var3] != null && var7.aj[var3].getItemTemplate().f == 1 && var7.aj[var3].g == VDTT_ek.m().aw && var7.aj[var3].s == 0) {
                           var10 = new int[]{var3 % 9 * 32, var3 / 9 * 32};
                           break;
                        }

                        --var3;
                     }

                     int[] var8 = var10;
                     if (this.O[0] == null) {
                        var10001 = this.objX + var8[0] + 20;
                        DataCenter.d().aA.a(var10001, this.objY + 30 + var8[1] + 35);
                     } else {
                        if (this.k != null) {
                           break label167;
                        }

                        var7 = this;
                        if (this.as.size() == 0) {
                           var10 = null;
                        } else {
                           Item var9 = (Item)this.as.elementAt(0);
                           int[] var4 = null;

                           for(int var5 = 0; var5 < var7.aj.length; ++var5) {
                              if (var7.aj[var5].equals(var9)) {
                                 var4 = new int[]{var5 % 9 * 32, var5 / 9 * 32};
                                 var7.as.removeElementAt(0);
                                 break;
                              }
                           }

                           var10 = var4;
                        }

                        var8 = var10;
                        this.D();
                        if (var8 == null && this.an < 100L) {
                           DataCenter.d().aA.a(this.objX + this.q - 5, this.objY);
                           if (!this.ar) {
                              VDTT_gt.b().a(Caption.oQ, VDTT_dg.d, -2560);
                              this.ar = true;
                           }
                           break label167;
                        }

                        if (this.an < 100L) {
                           var10001 = this.objX + var8[0] + 15;
                           DataCenter.d().aA.a(var10001, this.objY + 25 + var8[1] + 35);
                        } else {
                           var10001 = this.objX + 65;
                           DataCenter.d().aA.a(var10001, this.objY + 10);
                        }
                     }

                     DataCenter.d().aA.b = true;
                  }
               }
            }

            DataCenter.d().aA.b = true;
            return;
         }

         this.y();
      }

   }

   private void D() {
      this.aq = true;
      this.ap = 0;
      this.aa = this.am = this.an = 0L;

      int var1;
      for(var1 = 0; var1 < this.P.length; ++var1) {
         if (this.P[var1] != null) {
            Item var10003 = this.P[var1];
            this.aa += DataCenter.d().as[var10003.c];
         }
      }

      if (this.O[0] != null) {
         if (this.O[1] == null || !this.at.equals(this.O[0].strOptions)) {
            this.at = this.O[0].strOptions;
            this.O[1] = this.O[0].a();
            this.O[1].t = true;
            if ((var1 = this.O[1].s + 1) > 15) {
               var1 = 15;
            }

            this.O[1].a(var1);
         }

         if (this.O[0].j() && this.O[1].s <= 15) {
            this.ap = DataCenter.d().ao[this.O[1].s];
            this.am = DataCenter.d().at[this.O[1].s];
         } else if (this.O[0].k() && this.O[1].s <= 15) {
            this.ap = DataCenter.d().ap[this.O[1].s];
            this.am = DataCenter.d().au[this.O[1].s];
         } else if (this.O[0].l() && this.O[1].s <= 15) {
            this.ap = DataCenter.d().aq[this.O[1].s];
            this.am = DataCenter.d().av[this.O[1].s];
         }

         if (VDTT_ek.m().al < this.ap) {
            this.aq = false;
         }

         if (this.am > 0L) {
            this.an = this.aa * 100L / this.am;
         }

         this.ao = (long)(80 + this.O[0].s);
         if (this.ao > 100L) {
            this.ao = 100L;
         }

         if (!this.O[0].v()) {
            this.O[1] = null;
            this.aq = false;
            return;
         }
      } else {
         this.O[1] = null;
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
            if (this.R[1] == 0 || this.R[1] % 12 > 5) {
               VDTT_dg.b(VDTT_dg.d, var1, Caption.bs, 14, this.f() + 11, 0, -10831436, -16777216);
            }

            a(var1, this.X[0].objX, this.X[0].objY, this.O[0], this.X[0].k >= 0, Caption.bD);
            a(var1, this.X[1].objX, this.X[1].objY, this.O[1], this.X[1].k >= 0, Caption.Q);
            a(var1, this.X[2].objX, this.X[2].objY, this.O[2], this.X[2].k >= 0, Caption.bL);
            VDTT_dc.a(var1, 95, 0, 210 - DataCenter.d().h / 3 % 3, this.f() + 25, 20);
            if (this.O[0] != null) {
               VDTT_dg.b(VDTT_dg.d, var1, "(" + this.O[0].ah() + ")", 177, this.f() + 60, 2, -1, -16777216);
               if (this.O[1] != null) {
                  VDTT_dg.b(VDTT_dg.d, var1, "(" + this.O[1].ah() + ")", 257, this.f() + 60, 2, -1, -16777216);
               }

               if (!this.aq) {
                  if (this.R[0] == 0 || this.R[0] % 10 > 5) {
                     if (this.O[0].v()) {
                        VDTT_dg.b(VDTT_dg.d, var1, Caption.kM + VDTT_jb.c(this.ap) + Caption.kL, 149, this.f() + 108, 0, -65536, -16777216);
                     } else {
                        VDTT_dg.d(VDTT_dg.d, var1, Caption.kN, 149, this.f() + 108, 0, -2560, -16777216);
                     }
                  }
               } else if (this.R[0] > 0) {
                  if (this.R[0] % 14 > 7) {
                     if (this.S == 1) {
                        VDTT_dg.d(VDTT_dg.d, var1, Caption.kO, 149, this.f() + 108, 0, -2560, -16777216);
                        VDTT_dg.d(VDTT_dg.d, var1, Caption.kP, 149, this.f() + 124, 0, -2560, -16777216);
                     } else if (this.S == 2) {
                        VDTT_dg.d(VDTT_dg.d, var1, Caption.kQ, 149, this.f() + 108, 0, -1, -16777216);
                        VDTT_dg.d(VDTT_dg.d, var1, Caption.kR, 149, this.f() + 124, 0, -1, -16777216);
                     } else if (this.S == 3) {
                        VDTT_dg.d(VDTT_dg.d, var1, Caption.kQ, 149, this.f() + 108, 0, -1, -16777216);
                        VDTT_dg.d(VDTT_dg.d, var1, Caption.kS, 149, this.f() + 124, 0, -1, -16777216);
                     }
                  }
               } else if (this.O[0].v()) {
                  VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.bv, VDTT_jb.c(this.ap)), 149, this.f() + 108, 0, -1, -16777216);
                  VDTT_dg.b(VDTT_dg.d, var1, Caption.bt + " " + (this.an > this.ao ? this.ao : this.an) + " %", 149, this.f() + 124, 0, -1, -16777216);
                  VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.rn, "" + this.ao), 149, this.f() + 140, 0, -6488, -16777216);
               } else {
                  VDTT_dg.d(VDTT_dg.d, var1, Caption.kN, 149, this.f() + 108, 0, -2560, -16777216);
               }
            }

            this.a(var1, this.X[3]);

            for(int var2 = 0; var2 < this.X[3].i; ++var2) {
               for(int var3 = 0; var3 < this.X[3].P; ++var3) {
                  b(var1, var3 * this.X[3].h, var2 * this.X[3].h, this.P[var2 * this.X[3].P + var3], var2 * this.X[3].P + var3 == this.X[3].k, "");
               }
            }

            this.a(var1);
            if (this.T != null) {
               this.T.b(var1, this.X[0].objX + this.X[0].h / 2, this.X[0].objY + this.X[0].h / 2);
            }
         }

      } catch (Exception var4) {
         VDTT_jb.a(var4);
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
            if (this.O[0] == null) {
               this.f(2);
               DataCenter.d().ai.c(Caption.nK, -1);
               return;
            }

            this.k = a(var1, this, this.O[0]);
            return;
         case 1002:
            this.Q = 2;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.O[1]);
            return;
         case 1003:
            this.Q = 3;
            this.a(var1.j, var1.j.k);
            if (this.O[2] == null) {
               int var10003 = var1.j.objX - 124;
               this.k = b(DataCenter.d().O[823].c, this, var10003, var1.j.objY, 100);
               return;
            }

            this.k = a(var1, this, this.O[2]);
            return;
         case 1004:
            try {
               this.Q = 4;
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
            VDTT_nf var6 = this;
            var2 = this.W.n.b;
            var3 = 0;

            for(int var4 = 0; var4 < VDTT_ek.m().aP.length && var3 < 20; ++var4) {
               if (VDTT_ek.m().aP[var4] != null && VDTT_ek.m().aP[var4].p() && VDTT_ek.m().aP[var4].getItemTemplate().a <= var2) {
                  var6.b(VDTT_ek.m().aP[var4]);
                  ++var3;
               }
            }

            var6.a_();
         }
      }

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

   private void a(VDTT_hs var1, int var2) {
      for(int var3 = 0; var3 < this.X.length; ++var3) {
         this.X[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void f(int var1) {
      super.f(var1);
      if (this.O != null && this.O[0] != null && !this.O[0].v()) {
         VDTT_ek.m().i(this.O[0].w)[this.O[0].f] = this.O[0];
         this.O[0] = null;
      }

   }

   public final void d() {
      super.d();
      this.ar = false;
      if (this.O[0] != null) {
         VDTT_ek.m().i(this.O[0].w)[this.O[0].f] = this.O[0];
         this.O[0] = null;
      }

      if (this.O[2] != null) {
         VDTT_ek.m().aP[this.O[2].f] = this.O[2];
         this.O[2] = null;
      }

      this.C();
   }

   public final void C() {
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
         if (!this.aq) {
            this.R[0] = 50;
         } else if (this.O[0] == null) {
            this.R[1] = 50;
         } else if (this.an < 10L) {
            DataCenter.d().ai.c(Caption.kU, -65536);
         } else {
            if (var1) {
               if (this.an > 120L && this.O[0].s > 4) {
                  DataCenter.d().ai.a(Caption.kV, 2001, this);
                  return;
               }

               if (this.ap > VDTT_ek.m().al) {
                  DataCenter.d().ai.a(Caption.kW, 2001, this);
                  return;
               }
            }

            Message var5;
            (var5 = new Message((byte)107)).a(this.O[0].w);
            var5.b(this.O[0].f);
            if (this.O[2] != null) {
               var5.b(this.O[2].f);
            } else {
               var5.b((int)-1);
            }

            int var2 = 0;

            int var3;
            for(var3 = 0; var3 < this.P.length; ++var3) {
               if (this.P[var3] != null) {
                  ++var2;
               }
            }

            var5.a(var2);

            for(var3 = 0; var3 < this.P.length; ++var3) {
               if (this.P[var3] != null) {
                  var5.b(this.P[var3].f);
               }
            }

            var5.l();
         }
      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }
   }
}
