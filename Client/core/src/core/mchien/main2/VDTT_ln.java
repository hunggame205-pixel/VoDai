package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ln extends VDTT_lm {
   private VDTT_hs U;
   private VDTT_hs[] V;
   private VDTT_bd[] W;
   private VDTT_bd X;
   private boolean Y = true;

   public VDTT_ln(VDTT_p var1) {
      super(var1, new String[]{Caption.I});
      this.I = var1;
      this.a(320, 222);
      this.K = false;
      this.X = this.a(12, this.f() + 10, Caption.hu, 1000);
      this.a(this.X, 0);
      Vector var4 = new Vector();
      VDTT_ba var2 = this.a(0, 0, Caption.qu, this, 1004, 7);
      var4.add(var2);
      var2 = this.a(0, 0, Caption.hv, this, 1001, 7);
      var4.add(var2);
      var2 = this.a(0, 0, Caption.hw, this, 1002, 7);
      var4.add(var2);

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         ((VDTT_ba)var4.get(var5)).d(60, 20);
         ((VDTT_ba)var4.get(var5)).f(super.q - 8 - 2 - (var5 + 1) * (((VDTT_ba)var4.get(var5)).q + 3), this.f() + 7);
         this.a((VDTT_m)var4.get(var5), 0);
      }

      this.D();
      this.f(0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && !var1[var2].t) {
            this.ak.add(var1[var2]);
         }
      }

   }

   public final void D() {
      this.U = new VDTT_hs((byte)1, this.X.objX, this.X.objY + 20, super.q - 8 - this.X.objX - 5, 150, 30, VDTT_cw.v().Z.size());
      this.W = new VDTT_bd[VDTT_cw.v().Z.size()];
      this.V = new VDTT_hs[VDTT_cw.v().Z.size()];

      for(int var1 = 0; var1 < VDTT_cw.v().Z.size(); ++var1) {
         this.W[var1] = new VDTT_bd(0, 7 + var1 * this.U.h, "", this, 0);
         this.V[var1] = new VDTT_hx((byte)1, 0, 0, this.W[var1].q, this.W[var1].r, this.W[var1].r, 1, this.U);
      }

   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      if (super.a.b == 0) {
         switch(var1) {
         case 1000:
            var1 = 0;

            for(int var5 = 0; var5 < this.W.length; ++var5) {
               if (this.W[var5].m) {
                  ++var1;
               }
            }

            boolean var6 = var1 != this.W.length;
            this.X.m = var6;

            for(var1 = 0; var1 < this.W.length; ++var1) {
               this.W[var1].m = var6;
            }
         }
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      try {
         if (this.Y) {
            super.b(var1);
         } else {
            this.a(var1, this.objX, this.objY, this.q, this.r, Caption.I, (byte)2, this.K);
         }

         if (super.a.b == 0) {
            this.a(var1, this.U);

            for(int var4 = 0; var4 < this.W.length; ++var4) {
               try {
                  VDTT_fa var2 = (VDTT_fa)VDTT_cw.v().Z.elementAt(var4);
                  if (this.U.b(var4)) {
                     label45: {
                        this.a(var1, 22, var4 * this.U.h, this.U.q - 22, this.U.h - 1, 46, 22, 23, 1, 1);
                        if (var4 == this.U.k) {
                           VDTT_dc.a(var1, 23, var4 * this.U.h + 1, this.U.q - 22 - 2, this.U.h - 1 - 2);
                        } else if (var4 == this.U.l) {
                           VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, var2.c, 56, 8 + var4 * this.U.h, 0, -1, -10275328);
                           break label45;
                        }

                        VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, var2.c, 55, 7 + var4 * this.U.h, 0, -1, -10275328);
                     }

                     if (var2.k) {
                        VDTT_dc.a(var1, 418, 0, 40, var4 * this.U.h + this.U.h / 2 - 1, 3);
                     } else {
                        VDTT_dc.a(var1, 83, 0, 40, var4 * this.U.h + this.U.h / 2 - 1, 3);
                     }

                     VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, var2.b, 55, 20 + var4 * this.U.h, 0, -22360, -10275328);
                     VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.hy + VDTT_jb.g((int)((long)var2.l - VDTT_jb.a() / 1000L)), this.U.q - 6, 20 + var4 * this.U.h, 1, -6488, -10275328);
                     if (var2.a()) {
                        VDTT_dg.b(VDTT_dg.d, var1, Caption.hz, this.U.q - 8, 8 + var4 * this.U.h, 1, -2560, -10275328);
                     }

                     int var7 = var1.e;
                     int var3 = var1.f;
                     this.a(var1, var7 + this.W[var4].objX, var3 + this.W[var4].objY);
                     this.W[var4].b(var1);
                     this.a(var1, var7, var3);
                  }
               } catch (Exception var5) {
               }
            }

            this.a((Graphics)var1);
            VDTT_dg.a(VDTT_dg.c, var1, Caption.pH + VDTT_cw.v().Z.size() + " " + Caption.pL, 12, this.r - 14, 0, -1);
            this.U.b(var1, this);
         }

      } catch (Exception var6) {
         VDTT_jb.a(var6);
      }
   }

   public final void a_() {
      try {
         super.a_();
         if (super.a.b == 0) {
            this.U.a();

            for(int var1 = 0; var1 < this.W.length; ++var1) {
               this.W[var1].a_();
               this.V[var1].a();
               if (this.V[var1].l != -1) {
                  this.W[var1].n = true;
               } else {
                  this.W[var1].n = false;
               }
            }
         } else if (super.a.b == this.w()) {
            this.B();
         }
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }

      if (VDTT_cw.v().br == 5 && VDTT_cw.v().bs == 7) {
         this.y();
      }

   }

   public final Vector g() {
      Vector var1 = super.g();

      try {
         if (!this.Y) {
            var1.removeElementAt(0);
         }

         if (super.a.b == 0) {
            for(int var4 = 0; var4 < this.V.length; ++var4) {
               int var2 = this.U.objX + this.W[var4].objX;
               int var3 = this.U.objY + this.W[var4].objY - this.U.f;
               if (VDTT_jb.a(this.U.objX, this.U.objY, this.U.objX + this.U.q, this.U.objY + this.U.r, var2, var3) && VDTT_jb.a(this.U.objX, this.U.objY, this.U.objX + this.U.q, this.U.objY + this.U.r, var2 + this.W[var4].q, var3 + this.W[var4].r)) {
                  this.V[var4].objX = (short)var2;
                  this.V[var4].objY = (short)var3;
                  var1.addElement(this.V[var4].a(8000 + var4, this));
               }
            }

            var1.addElement(this.U.a(1005, this));
         }
      } catch (Exception var5) {
         VDTT_jb.a(var5);
      }

      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         int var4;
         boolean var12;
         VDTT_bd var10000;
         if (var1.b >= 8000 && var1.b < 9000) {
            var2 = var1.b - 8000;
            var10000 = this.W[var2];
            var12 = !this.W[var2].m;
            var10000.m = var12;
            var2 = 0;

            for(var4 = 0; var4 < this.W.length; ++var4) {
               if (this.W[var4].m) {
                  ++var2;
               }
            }

            if (var2 == this.W.length) {
               var12 = true;
               this.X.m = var12;
            } else {
               var12 = false;
               this.X.m = var12;
            }
         }

         VDTT_ln var10;
         VDTT_fa var16;
         switch(var1.b) {
         case 1001:
            this.a(true);
            return;
         case 1002:
            var10 = this;
            var12 = true;
            this.X.m = var12;

            for(var3 = 0; var3 < var10.W.length; ++var3) {
               var10000 = var10.W[var3];
               var12 = true;
               var10000.m = var12;
            }

            var10.a(true);
            return;
         case 1003:
            this.a((VDTT_fa)null);
            return;
         case 1004:
            if (VDTT_cw.v().Z.size() > 0) {
               this.I.a(Caption.tX, 2003, this);
               return;
            }

            DataCenter.d().ai.c(Caption.hD, -65536);
            break;
         case 1005:
            if (var1.j.k >= 0) {
               var3 = var3;
               var2 = var1.j.k;
               var10 = this;

               try {
                  var16 = (VDTT_fa)VDTT_cw.v().Z.elementAt(var2);
                  int var10002 = var10.q - 8 - 100;
                  int var10003 = var3 - 100;
                  boolean var14 = false;
                  int var5 = var10003;
                  var4 = var10002;
                  VDTT_ln var15 = var10;
                  VDTT_bp var17;
                  if ((var17 = new VDTT_bp(var4, var5, 0, var10, var16)).objX > DataCenter.d().n - var17.q - var10.objX) {
                     var17.objX = (short)(DataCenter.d().n - var17.q - var10.objX);
                  }

                  if (var17.objX < -var10.objX) {
                     var17.objX = (short)(-var10.objX);
                  }

                  if (var17.objY > DataCenter.d().o - var17.r - var10.objY) {
                     var17.objY = (short)(DataCenter.d().o - var17.r - var10.objY);
                  }

                  for(var5 = var10.f.size() - 1; var5 >= 0; --var5) {
                     VDTT_m var6;
                     if ((var6 = (VDTT_m)var15.f.get(var5)) instanceof VDTT_bp) {
                        var15.b(var6);
                     }
                  }

                  var15.a(var17);
                  var10.k = var17;
                  if (var10.k.objX + var10.k.q > DataCenter.d().n) {
                     var10.k.objX = (short)(DataCenter.d().n - var10.k.q);
                  }

                  if (var10.k.objY + var10.k.r > DataCenter.d().o) {
                     var10.k.objY = (short)(DataCenter.d().o - var10.k.r);
                  }

                  if (var10.k.objY < 0) {
                     var10.k.objY = 0;
                  }

                  if (!var16.k) {
                     var16.k = true;
                     Message var11;
                     (var11 = new Message((byte)96)).b(var16.a);
                     var11.l();
                  }
               } catch (Exception var7) {
                  VDTT_jb.a(var7);
                  return;
               }
            }
            break;
         case 2001:
            this.a(false);
            return;
         case 2002:
            var12 = false;
            Vector var13 = new Vector();

            for(int var9 = 0; var9 < VDTT_cw.v().Z.size(); ++var9) {
               if ((var16 = (VDTT_fa)VDTT_cw.v().Z.elementAt(var9)).k && !var16.a()) {
                  var13.add(var16);
               }
            }

            if (var13.size() > 0) {
               c(var13);
               return;
            }

            DataCenter.d().ai.c(Caption.hB, -65536);
            break;
         case 2003:
            try {
               Message.c((byte)-50).l();
               return;
            } catch (Exception var8) {
            }
         }
      }

   }

   public final void a(VDTT_fa var1) {
      this.Y = true;
      this.f(this.w() - 1);
      if (var1 != null) {
         this.R.a(var1.b);
         if (!var1.c.contains("Re: ")) {
            this.Q.a("Re: " + var1.c);
         }
      }

   }

   private void a(boolean var1) {
      Vector var2 = new Vector();
      int var4 = 0;

      for(int var5 = 0; var5 < VDTT_cw.v().Z.size(); ++var5) {
         VDTT_fa var3 = (VDTT_fa)VDTT_cw.v().Z.elementAt(var5);
         if (this.W[var5].m) {
            if (!var3.a()) {
               var2.add(var3);
            } else {
               ++var4;
            }
         }
      }

      if (var2.size() <= 0) {
         if (var4 > 0) {
            DataCenter.d().ai.c(Caption.hA, -65536);
         } else {
            DataCenter.d().ai.c(Caption.hB, -65536);
         }
      } else if (var1) {
         DataCenter.d().ai.a(Caption.hi, 2001, this);
      } else {
         c(var2);
      }
   }

   public final void d() {
      super.d();
   }

   public static void c(Vector var0) {
      try {
         Message var1;
         (var1 = new Message((byte)88)).b(var0.size());

         for(int var3 = 0; var3 < var0.size(); ++var3) {
            VDTT_fa var2 = (VDTT_fa)var0.elementAt(var3);
            var1.b(var2.a);
         }

         var1.l();
      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }
   }

   public final void a(String var1) {
      this.a((VDTT_fa)null);
      this.R.a(var1);
   }
}
