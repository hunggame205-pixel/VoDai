package core.mchien.main2;

import java.util.Vector;

public final class VDTT_mx extends VDTT_aq {
   private static int[] R = new int[3];
   public static int O;
   public boolean P = true;
   public VDTT_iy[] Q = new VDTT_iy[0];
   private VDTT_iq S;
   private VDTT_hs T;
   private VDTT_bf U;
   private Vector V = new Vector();
   private VDTT_hm[] W;
   private boolean X;
   private int Y;
   private VDTT_hs[] Z = new VDTT_hs[3];
   private int aa;
   private Item ab = null;

   public VDTT_mx(VDTT_p var1) {
      super(var1);
      this.Z[0] = new VDTT_hs((byte)1, 13, this.f() + 8, super.q - 8 - 18, 162, 27, 0);
      this.Z[1] = new VDTT_hs((byte)1, 13, this.f() + 45, super.q - 8 - 18, 120, 15, 0);
      this.Z[2] = new VDTT_hs((byte)1, 13, this.f() + 8, super.q - 8 - 18, 27, 27, 1);
      VDTT_hp var2;
      (var2 = new VDTT_hp(5000)).c = Caption.Ar;
      this.a(315);
      this.a(var2, 170, 72, 4);
      this.K = false;
      this.U = this.a(173, 64, 80, Caption.yl.length, new VDTT_hp(1002, Caption.yl), this, 0);
      this.a(this.U, 0);
      this.f(O);
   }

   public final void z() {
      this.T = new VDTT_hs((byte)1, 4, this.S.i() + 30, super.q - 8, 144, 18, this.Q.length);
   }

   public final void a(Message var1) {
      try {
         if (this.W == null) {
            this.W = new VDTT_hm[var1.readByte()];

            for(int var2 = 0; var2 < this.W.length; ++var2) {
               this.W[var2] = new VDTT_hm();
               this.W[var2].a[0] = var1.b.c();
               this.W[var2].a[1] = var1.b.c();
               this.W[var2].b = var1.h();
               this.W[var2].c = var1.h();
               this.W[var2].d = new String[var1.readByte()];
               Vector var3 = new Vector();

               for(int var4 = 0; var4 < this.W[var2].d.length; ++var4) {
                  this.W[var2].d[var4] = var1.j().trim();
                  Item var5;
                  (var5 = new Item()).a(var1);
                  if (var4 == 0) {
                     this.W[var2].e.add(this.W[var2].d[var4]);
                     this.W[var2].f.add(var3);
                  } else if (!this.W[var2].e.contains(this.W[var2].d[var4])) {
                     this.W[var2].e.add(this.W[var2].d[var4]);
                     var3 = new Vector();
                     this.W[var2].f.add(var3);
                  }

                  ((Vector)this.W[var2].f.get(this.W[var2].e.indexOf(this.W[var2].d[var4]))).add(var5);
               }
            }

            VDTT_hs[] var7;
            (var7 = new VDTT_hs[3])[0] = new VDTT_hs((byte)1, 13, this.f() + 8, super.q - 8 - 18, 189, 27, this.W.length);
            var7[1] = new VDTT_hs((byte)1, 13, this.f() + 45, super.q - 8 - 18, 120, 15, 0);
            var7[2] = new VDTT_hs((byte)1, 13, this.f() + 8, super.q - 8 - 18, 27, 27, 1);
            this.Z = var7;
         }

      } catch (Exception var6) {
      }
   }

   public final void f(int var1) {
      super.f(var1);
      if (super.a.b == 3) {
         this.A();
      } else {
         O = var1;
         switch(var1) {
         case 0:
            this.S = new VDTT_iq(new VDTT_hp(1001, Caption.yq), this);
            this.S.e[1] = true;
            this.S.a();
            break;
         case 1:
            this.S = new VDTT_iq(new VDTT_hp(1001, Caption.zs), this);
            this.S.e[1] = true;
            this.S.e[3] = true;
            this.S.a();
            break;
         case 2:
            this.S = new VDTT_iq(new VDTT_hp(1001, Caption.zt), this);
            this.S.e[0] = true;
            this.S.a();
         }

         this.g(R[var1]);
      }
   }

   private void g(int var1) {
      this.Q = new VDTT_iy[0];
      this.z();
      this.S.a(var1);
      this.B();
      if (var1 > 3) {
         this.S.a.a(this.S.b.c.length);
      } else {
         this.S.a.a(0);
      }
   }

   public final void A() {
      if (this.W == null) {
         try {
            Message.c((byte)-57).l();
         } catch (Exception var2) {
            VDTT_jb.a(var2);
         }
      }
   }

   private void B() {
      try {
         Message var1 = new Message((byte)-22);
         switch(super.a.b) {
         case 0:
            var1.a(this.S.h());
            break;
         case 1:
            var1.a(this.S.h() + 6);
            break;
         case 2:
            var1.a(this.S.h() + 20);
         }

         var1.a(this.U.n.b);
         var1.l();
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }

   public final void a_() {
      if (this.S != null) {
         this.S.e();
         if (this.U != null) {
            this.U.d = true;
            if (super.a.b == 0 && this.S.h() == 0) {
               this.U.d = false;
            }
         }
      }

      this.T.a();

      for(int var1 = 0; var1 < this.Z.length; ++var1) {
         if (this.Z[var1] != null) {
            this.Z[var1].a();
         }
      }

      if (VDTT_cw.v().br == 5 && VDTT_cw.v().bs == 4) {
         this.y();
      }

   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      this.c(var1, var2);
      switch(var1) {
      case 1002:
         this.B();
      default:
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 3) {
         if (!this.X) {
            var1.addElement(this.Z[0].a(9980, this));
         } else {
            var1.addElement(this.Z[2].a(9981, this));
            var1.addElement(new VDTT_hl(1030, this.Z[2].objX, this.Z[2].objY - 12, this.Z[2].objX + this.Z[2].q, this.Z[1].objY, this.Z[1], this));
            var1.addElement(new VDTT_hl(1030, this.Z[1].objX, this.Z[1].objY + this.Z[1].r, this.Z[1].objX + this.Z[1].q, this.Z[1].objY + this.Z[1].r + 20, this.Z[1], this));
            Vector var2 = new Vector();

            int var3;
            for(var3 = 0; var3 < this.W[this.Y].f.size(); ++var3) {
               for(int var4 = 0; var4 < ((Vector)this.W[this.Y].f.get(var3)).size(); ++var4) {
                  Item var5 = (Item)((Vector)this.W[this.Y].f.get(var3)).get(var4);
                  int var6 = this.Z[1].objX + 4 + var4 * 35;
                  int var7 = this.Z[1].objY - this.Z[1].f + (this.aa + var3 * 3) * this.Z[1].h + 15;
                  if (this.Z[1].b(this.aa + var3 * 3 + 3)) {
                     VDTT_hl var8 = new VDTT_hl(6000, var6, var7, var6 + 28, var7 + 28, this.Z[1], this, var5);
                     var2.add(var8);
                  }
               }
            }

            for(var3 = var2.size() - 1; var3 >= 0; --var3) {
               if (((VDTT_hl)var2.get(var3)).d >= this.Z[1].objY + this.Z[1].r) {
                  var2.remove(var3);
               }
            }

            var1.addAll(var2);
            var1.add(this.Z[1].a(1030, this));
         }
      } else {
         if (super.a.b != 1) {
            var1.addElement(this.S.f());
         }

         if (this.P) {
            var1.addElement(this.T.a(1003, this));
         }
      }

      return var1;
   }

   public final void b(Graphics var1) {
      super.b(var1);
      Graphics var2;
      int var3;
      VDTT_mx var11;
      if (super.a.b == 3) {
         var2 = var1;
         var11 = this;

         try {
            int var12;
            if (var11.X) {
               var11.a(var2, var11.Z[2]);
               var11.a(var2, 0, 0 * var11.Z[2].h, var11.Z[2].q, 26, 46, 22, 23, 1, 1);
               if (var11.Z[2].l == 0) {
                  VDTT_dg.a(var2, var11.W[var11.Y].a[0], 26, 13, 0, -1);
                  var2.e(30);
                  VDTT_dc.a(var2, 398, 0, var11.Z[2].q - 21, 5, 20);
                  var2.h();
               } else {
                  VDTT_dg.a(var2, var11.W[var11.Y].a[0], 26, 12, 0, -1);
                  VDTT_dc.a(var2, 398, 0, var11.Z[2].q - 22, 4, 20);
               }

               VDTT_dc.a(var2, 396, 0, 15, 0 * var11.Z[2].h + 13, 3);
               var11.a(var2);
               var11.a(var2, var11.Z[1]);

               for(var3 = 0; var3 < var11.Z[1].i; ++var3) {
                  VDTT_dg.d(VDTT_dg.d, var2, (String)var11.V.get(var3), 2, 6 + var3 * var11.Z[1].h, 0, -1, -16777216);
               }

               for(var3 = 0; var3 < var11.W[var11.Y].f.size(); ++var3) {
                  for(var12 = 0; var12 < ((Vector)var11.W[var11.Y].f.get(var3)).size(); ++var12) {
                     Item var13 = (Item)((Vector)var11.W[var11.Y].f.get(var3)).get(var12);
                     b(var2, 4 + var12 * 35, (var11.aa + var3 * 3) * var11.Z[1].h + 15, var13, var11.ab != null && var11.ab.equals(var13));
                  }
               }

               var11.a(var2);
               var11.Z[1].b(var2, var11);
               return;
            }

            var11.a(var2, var11.Z[0]);

            for(var3 = 0; var3 < var11.Z[0].i; ++var3) {
               if (var11.Z[0].b(var3)) {
                  var11.a(var2, 0, var3 * var11.Z[0].h, var11.Z[0].q, 26, 46, 22, 23, 1, 1);
                  VDTT_dc.a(var2, 395, 0, 15, var3 * var11.Z[0].h + 13, 3);
                  var12 = var11.Z[0].l == var3 ? 13 + var3 * var11.Z[0].h : 12 + var3 * var11.Z[0].h;
                  VDTT_dg.a(var2, var11.W[var3].a[0], 26, var12, 0, -1);
                  VDTT_dg var10000 = VDTT_dg.d;
                  VDTT_hm var5 = var11.W[var3];
                  long var8 = VDTT_jb.a();
                  VDTT_dg.d(var10000, var2, var5.b != -1L && var8 < var5.b ? Caption.oL : (var5.c != -1L && var8 >= var5.c ? Caption.oM : (var5.b != -1L && var5.b <= var8 && var5.c != -1L && var8 < var5.c ? Caption.oN : "")), var11.q - 35, var12, 1, -1, -16777216);
               }
            }

            var11.a(var2);
            var11.Z[0].b(var2, var11);
         } catch (Exception var10) {
         }

         return;
      } else {
         if (super.a.b == 1) {
            VDTT_dg.a(VDTT_dg.e, var1, Caption.nX, this.q / 2, this.r / 2 + 10, 2, -2560, 3, 0);
            return;
         }

         this.S.a(var1);
         if (!this.P) {
            VDTT_dg.a(VDTT_dg.e, var1, Caption.nX, this.q / 2, this.r / 2 + 10, 2, -2560, 3, 0);
            return;
         }

         this.b(var1, this.T);
         var1.c(-2965602);
         this.a(var1, 8, -24, this.T.q - 16, 21, 61, 55, 56);
         var1.f();
         VDTT_dg.b(VDTT_dg.e, var1, Caption.cL, 24, -15, 2, -6488, -10275328);
         switch(super.a.b) {
         case 0:
            var2 = var1;
            var11 = this;
            VDTT_iy var4;
            if (this.S.h() != 4) {
               VDTT_dg.b(VDTT_dg.e, var1, Caption.kD, 70, -15, 2, -6488, -10275328);
               switch(this.S.h()) {
               case 0:
                  VDTT_dg.b(VDTT_dg.e, var1, Caption.tW, 140, -15, 2, -6488, -10275328);
                  break;
               case 1:
                  VDTT_dg.b(VDTT_dg.e, var1, Caption.yq[1], 140, -15, 2, -6488, -10275328);
                  break;
               case 2:
                  VDTT_dg.b(VDTT_dg.e, var1, Caption.kG, 140, -15, 2, -6488, -10275328);
                  break;
                  //sửa text top nạp
               case 3:
                  VDTT_dg.b(VDTT_dg.e, var1, "Zeni", 140, -15, 2, -6488, -10275328);
               }

               VDTT_dg.b(VDTT_dg.e, var1, Caption.kJ, 208, -15, 2, -6488, -10275328);
               VDTT_dg.b(VDTT_dg.e, var1, Caption.kK, 268, -15, 2, -6488, -10275328);
               this.a(var1, this.T);

               for(var3 = 0; var3 < var11.T.i; ++var3) {
                  if (var11.T.b(var3)) {
                     var4 = var11.Q[var3];
                     VDTT_dg.b(VDTT_dg.d, var2, "" + (var3 + 1), 22, 8 + var3 * var11.T.h, 2, -1, -16777216);
                     VDTT_dg.b(VDTT_dg.d, var2, var4.b, 70, 8 + var3 * var11.T.h, 2, -1, -16777216);
                     if (var11.S.h() == 0) {
                        VDTT_dg.b(VDTT_dg.d, var2, var4.a(), 140, 8 + var3 * var11.T.h, 2, -1, -16777216);
                     } else {
                        VDTT_dg.b(VDTT_dg.d, var2, VDTT_jb.c(var4.e), 140, 8 + var3 * var11.T.h, 2, -1, -16777216);
                     }

                     VDTT_dg.b(VDTT_dg.d, var2, var4.b(), 208, 8 + var3 * var11.T.h, 2, -1, -16777216);
                     VDTT_dg.b(VDTT_dg.d, var2, var4.g, 268, 8 + var3 * var11.T.h, 2, -1, -16777216);
                  }
               }

               var11.a(var2);
               var11.T.a(var2, var11);
               return;
            }

            VDTT_dg.b(VDTT_dg.e, var1, Caption.cM, 70, -15, 2, -6488, -10275328);
            VDTT_dg.b(VDTT_dg.e, var1, Caption.kC, 140, -15, 2, -6488, -10275328);
            VDTT_dg.b(VDTT_dg.e, var1, Caption.ej, 208, -15, 2, -6488, -10275328);
            VDTT_dg.b(VDTT_dg.e, var1, Caption.ek, 268, -15, 2, -6488, -10275328);
            this.a(var1, this.T);

            for(var3 = 0; var3 < var11.T.i; ++var3) {
               if (var11.T.b(var3)) {
                  if (var3 == var11.T.k) {
                     VDTT_dc.a(var2, 3, var3 * var11.T.h, var11.T.q - 6, var11.T.h);
                  }

                  var4 = var11.Q[var3];
                  VDTT_dg.b(VDTT_dg.d, var2, "" + (var3 + 1), 22, 8 + var3 * var11.T.h, 2, -1, -16777216);
                  VDTT_dg.b(VDTT_dg.d, var2, var4.g, 70, 8 + var3 * var11.T.h, 2, -1, -16777216);
                  VDTT_dg.b(VDTT_dg.d, var2, "" + var4.c, 140, 8 + var3 * var11.T.h, 2, -1, -16777216);
                  VDTT_dg.b(VDTT_dg.d, var2, var4.e + "/" + var4.f, 208, 8 + var3 * var11.T.h, 2, -1, -16777216);
                  VDTT_dg.b(VDTT_dg.d, var2, var4.b, 268, 8 + var3 * var11.T.h, 2, -1, -16777216);
               }
            }

            var11.a(var2);
            var11.T.b(var2, var11);
            break;
         case 1:
            this.f(var1);
            return;
         case 2:
            this.g(var1);
         }
      }

   }

   private void f(Graphics var1) {
      VDTT_dg.b(VDTT_dg.e, var1, Caption.kD, 70, -15, 2, -6488, -10275328);
      switch(this.S.h()) {
      case 0:
         VDTT_dg.b(VDTT_dg.e, var1, Caption.tW, 140, -15, 2, -6488, -10275328);
         break;
      case 1:
         VDTT_dg.b(VDTT_dg.e, var1, Caption.kI, 140, -15, 2, -6488, -10275328);
         break;
      case 2:
         VDTT_dg.b(VDTT_dg.e, var1, Caption.kG, 140, -15, 2, -6488, -10275328);
         break;
      case 3:
         VDTT_dg.b(VDTT_dg.e, var1, Caption.zs[3], 140, -15, 2, -6488, -10275328);
      }

      VDTT_dg.b(VDTT_dg.e, var1, Caption.kJ, 208, -15, 2, -6488, -10275328);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.kK, 268, -15, 2, -6488, -10275328);
      this.a(var1, this.T);

      for(int var2 = 0; var2 < this.T.i; ++var2) {
         if (this.T.b(var2)) {
            VDTT_iy var3 = this.Q[var2];
            VDTT_dg.b(VDTT_dg.d, var1, "" + (var2 + 1), 22, 8 + var2 * this.T.h, 2, -1, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, var3.b, 70, 8 + var2 * this.T.h, 2, -1, -16777216);
            if (this.S.h() == 0) {
               VDTT_dg.b(VDTT_dg.d, var1, var3.a(), 140, 8 + var2 * this.T.h, 2, -1, -16777216);
            } else {
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(var3.e), 140, 8 + var2 * this.T.h, 2, -1, -16777216);
            }

            VDTT_dg.b(VDTT_dg.d, var1, var3.b(), 208, 8 + var2 * this.T.h, 2, -1, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, var3.g, 268, 8 + var2 * this.T.h, 2, -1, -16777216);
         }
      }

      this.a(var1);
      this.T.a(var1, this);
   }

   private void g(Graphics var1) {
      VDTT_dg.b(VDTT_dg.e, var1, Caption.Az[this.S.h()], 140, -15, 2, -6488, -10275328);
      int var2;
      VDTT_iy var3;
      if (this.S.h() == 3) {
         VDTT_dg.b(VDTT_dg.e, var1, Caption.eF, 70, -15, 2, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.kC, 208, -15, 2, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.ek, 268, -15, 2, -6488, -10275328);
         this.a(var1, this.T);

         for(var2 = 0; var2 < this.T.i; ++var2) {
            if (this.T.b(var2)) {
               var3 = this.Q[var2];
               VDTT_dg.b(VDTT_dg.d, var1, "" + (var2 + 1), 22, 8 + var2 * this.T.h, 2, -1, -16777216);
               VDTT_dg.b(VDTT_dg.d, var1, var3.g, 70, 8 + var2 * this.T.h, 2, -1, -16777216);
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(var3.e), 140, 8 + var2 * this.T.h, 2, -1, -16777216);
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(var3.c), 208, 8 + var2 * this.T.h, 2, -1, -16777216);
               VDTT_dg.b(VDTT_dg.d, var1, var3.b, 268, 8 + var2 * this.T.h, 2, -1, -16777216);
            }
         }

         this.a(var1);
         this.T.a(var1, this);
      } else {
         VDTT_dg.b(VDTT_dg.e, var1, Caption.kD, 70, -15, 2, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.kJ, 208, -15, 2, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.kK, 268, -15, 2, -6488, -10275328);
         this.a(var1, this.T);

         for(var2 = 0; var2 < this.T.i; ++var2) {
            if (this.T.b(var2)) {
               var3 = this.Q[var2];
               VDTT_dg.b(VDTT_dg.d, var1, "" + (var2 + 1), 22, 8 + var2 * this.T.h, 2, -1, -16777216);
               VDTT_dg.b(VDTT_dg.d, var1, var3.b, 70, 8 + var2 * this.T.h, 2, -1, -16777216);
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(var3.e), 140, 8 + var2 * this.T.h, 2, -1, -16777216);
               VDTT_dg.b(VDTT_dg.d, var1, var3.b(), 208, 8 + var2 * this.T.h, 2, -1, -16777216);
               VDTT_dg.b(VDTT_dg.d, var1, var3.g, 268, 8 + var2 * this.T.h, 2, -1, -16777216);
            }
         }

         this.a(var1);
         this.T.a(var1, this);
      }
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.ab = null;
      switch(var1.b) {
      case 1001:
         if (var1.j.k >= 0) {
            R[super.a.b] = var1.j.k;
            this.g(var1.j.k);
            return;
         }
         break;
      case 1003:
         if (var1.j.k >= 0) {
            this.a(this.Q[var1.j.k].b, var1.j.k, var2, var3);
            return;
         }
         break;
      case 6000:
         this.ab = (Item)var1.k;
         this.k = c(this, var1, this.ab);
         break;
      case 9980:
         if (var1.j.k >= 0) {
            this.Y = var1.j.k;
            String[] var4 = VDTT_jb.a(this.W[this.Y].a[1], "\\n");
            this.V.clear();
            String var5;
            if ((var5 = this.W[this.Y].a()).length() > 0) {
               this.V.add("c#yellow" + var5);
            }

            for(var2 = 0; var2 < var4.length; ++var2) {
               this.V.addAll(VDTT_dg.a(VDTT_dg.d, var4[var2], super.q - 8 - 35));
            }

            this.V.add("c#blue" + Caption.kh);
            this.aa = this.V.size();

            for(var2 = 0; var2 < this.W[this.Y].e.size(); ++var2) {
               this.V.add("c#cyan" + "- " + (String)this.W[this.Y].e.get(var2));
               this.V.add("");
               this.V.add("");
            }

            this.Z[1] = new VDTT_hs((byte)1, 13, this.f() + 45, super.q - 8 - 18, 150, 15, this.V.size());
            this.X = true;
            return;
         }
         break;
      case 9981:
         this.X = false;
         return;
      }

   }
}
