package core.mchien.main2;

import java.util.Vector;

public final class VDTT_mw extends VDTT_aq {
   public VDTT_iq O;
   public VDTT_hs P;
   private Vector X = new Vector();
   private VDTT_hm[] Y;
   private boolean Z;
   private int aa;
   private VDTT_hs[] ab = new VDTT_hs[3];
   private int ac;
   private Item ad = null;
   public int Q;
   public long R;
   public String S = "";
   public int T;
   private String[] ae = new String[]{""};
   public VDTT_iy[] U = new VDTT_iy[0];
   public Vector V = new Vector();
   public int W;

   public VDTT_mw(VDTT_p var1) {
      super(var1);
      this.ab[0] = new VDTT_hs((byte)1, 13, this.f() + 8, super.q - 8 - 18, 162, 27, 0);
      this.ab[1] = new VDTT_hs((byte)1, 13, this.f() + 45, super.q - 8 - 18, 120, 15, 0);
      this.ab[2] = new VDTT_hs((byte)1, 13, this.f() + 8, super.q - 8 - 18, 27, 27, 1);
      VDTT_hp var2 = new VDTT_hp(5000);
      if (VDTT_cw.v().ai != 47 && VDTT_cw.v().ai != 48) {
         var2.c = new String[]{Caption.ul};
      } else {
         var2.c = new String[]{Caption.ud};
      }

      this.a(315);
      this.a(var2, 170, 72, 4);
      this.K = false;
      this.O = new VDTT_iq(new VDTT_hp(1001, this.ae), this);
      this.P = new VDTT_hs((byte)1, 4, this.O.i() + 30, super.q - 8, 144, 18, 0);
      this.f(0);
      z();
   }

   public final void f(int var1) {
      super.f(var1);
   }

   private static void z() {
      try {
         Message var0;
         (var0 = new Message((byte)-22)).a((int)0);
         var0.a((int)0);
         var0.l();
      } catch (Exception var1) {
         VDTT_jb.a(var1);
      }
   }

   public final void a_() {
      this.O.e();
      this.P.a();
      int var1;
      if ((var1 = this.Q - (int)((VDTT_jb.a() - this.R) / 1000L)) < 0) {
         var1 = 0;
      }

      String var2 = "";
      if (this.T >= 2 && this.T <= 6) {
         if (this.T == 2) {
            var2 = VDTT_jb.b(Caption.uf, VDTT_jb.i(var1));
         } else if (this.T == 3) {
            var2 = VDTT_jb.b(Caption.ug, VDTT_jb.i(var1));
         } else if (this.T == 4) {
            var2 = VDTT_jb.b(Caption.uh, VDTT_jb.i(var1));
         } else if (this.T == 5) {
            var2 = VDTT_jb.b(Caption.ui, VDTT_jb.i(var1));
         } else if (this.T == 6) {
            var2 = VDTT_jb.b(Caption.uj, VDTT_jb.i(var1));
         }
      } else {
         var2 = Caption.gk + VDTT_jb.i(var1);
      }

      this.ae[0] = VDTT_jb.b(var2, VDTT_jb.g(var1));

      for(var1 = 0; var1 < this.ab.length; ++var1) {
         if (this.ab[var1] != null) {
            this.ab[var1].a();
         }
      }

   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      this.c(var1, var2);
      switch(var1) {
      case 1002:
         z();
         return;
      case 2005:
         try {
            Message var5;
            (var5 = Message.c((byte)-15)).a(((VDTT_hp)var2).a);
            var5.l();
            return;
         } catch (Exception var4) {
         }
      default:
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 3) {
         if (!this.Z) {
            var1.addElement(this.ab[0].a(9980, this));
         } else {
            var1.addElement(this.ab[2].a(9981, this));
            var1.addElement(new VDTT_hl(1030, this.ab[2].objX, this.ab[2].objY - 12, this.ab[2].objX + this.ab[2].q, this.ab[1].objY, this.ab[1], this));
            var1.addElement(new VDTT_hl(1030, this.ab[1].objX, this.ab[1].objY + this.ab[1].r, this.ab[1].objX + this.ab[1].q, this.ab[1].objY + this.ab[1].r + 20, this.ab[1], this));
            Vector var2 = new Vector();

            int var3;
            for(var3 = 0; var3 < this.Y[this.aa].f.size(); ++var3) {
               for(int var4 = 0; var4 < ((Vector)this.Y[this.aa].f.get(var3)).size(); ++var4) {
                  Item var5 = (Item)((Vector)this.Y[this.aa].f.get(var3)).get(var4);
                  int var6 = this.ab[1].objX + 4 + var4 * 35;
                  int var7 = this.ab[1].objY - this.ab[1].f + (this.ac + var3 * 3) * this.ab[1].h + 15;
                  if (this.ab[1].b(this.ac + var3 * 3 + 3)) {
                     VDTT_hl var8 = new VDTT_hl(6000, var6, var7, var6 + 28, var7 + 28, this.ab[1], this, var5);
                     var2.add(var8);
                  }
               }
            }

            for(var3 = var2.size() - 1; var3 >= 0; --var3) {
               if (((VDTT_hl)var2.get(var3)).d >= this.ab[1].objY + this.ab[1].r) {
                  var2.remove(var3);
               }
            }

            var1.addAll(var2);
            var1.add(this.ab[1].a(1030, this));
         }
      } else {
         var1.addElement(this.O.f());
         var1.addElement(this.P.a(1003, this));
      }

      return var1;
   }

   public final void b(Graphics var1) {
      try {
         super.b(var1);
         this.O.a(var1);
         this.b(var1, this.P);
         this.a(var1, 8, -24, this.P.q - 16, 21, -11, 22, 23, 1, 1);
         if (this.T <= 2) {
            this.f(var1);
            return;
         }

         Graphics var2 = var1;
         VDTT_mw var6 = this;
         VDTT_dg.b(VDTT_dg.e, var1, Caption.pz, 40, -15, 2, -10831436, -16777216);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.kD, 100, -15, 2, -10831436, -16777216);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.kD, this.q - 100, -15, 2, -10831436, -16777216);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.pz, this.q - 40, -15, 2, -10831436, -16777216);
         this.a(var1, this.P);

         for(int var3 = 0; var3 < var6.P.i; ++var3) {
            if (var6.P.b(var3)) {
               VDTT_gc var4 = (VDTT_gc)var6.V.get(var3);
               VDTT_dg.b(VDTT_dg.d, var2, "" + var4.c, 40, 8 + var3 * var6.P.h, 2, -3604601, -16777216);
               VDTT_dg.b(VDTT_dg.d, var2, "" + var4.d, var6.q - 40, 8 + var3 * var6.P.h, 2, -3604601, -16777216);
               VDTT_dg.b(VDTT_dg.d, var2, var4.a, 100, 8 + var3 * var6.P.h, 2, -3604601, -16777216);
               VDTT_dg.b(VDTT_dg.d, var2, var4.b, var6.q - 100, 8 + var3 * var6.P.h, 2, -3604601, -16777216);
               if (var4.e == 1) {
                  VDTT_dg.b(VDTT_dg.d, var2, Caption.lp, var6.q / 2, 8 + var3 * var6.P.h, 2, -6488, -16777216);
               } else if (var4.e == 2) {
                  VDTT_dg.b(VDTT_dg.d, var2, Caption.lq, var6.q / 2, 8 + var3 * var6.P.h, 2, -6488, -16777216);
               } else {
                  VDTT_dg.b(VDTT_dg.d, var2, "VS", var6.q / 2, 8 + var3 * var6.P.h, 2, -6488, -16777216);
               }
            }
         }

         var6.a(var2);
         var6.P.a(var2, var6);
      } catch (Exception var5) {
      }

   }

   private void f(Graphics var1) {
      VDTT_dg.b(VDTT_dg.e, var1, Caption.cL, 24, -15, 2, -6488, -10275328);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.ue, 70, -15, 2, -6488, -10275328);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.tW, 140, -15, 2, -6488, -10275328);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.pz, 208, -15, 2, -6488, -10275328);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.kK, 268, -15, 2, -6488, -10275328);
      this.a(var1, this.P);

      for(int var2 = 0; var2 < this.P.i; ++var2) {
         if (this.P.b(var2)) {
            VDTT_iy var3 = this.U[var2];
            VDTT_dg.b(VDTT_dg.d, var1, "" + (var2 + 1), 22, 8 + var2 * this.P.h, 2, -3604601, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, var3.b, 70, 8 + var2 * this.P.h, 2, -3604601, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, var3.a(), 140, 8 + var2 * this.P.h, 2, -3604601, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(var3.e), 208, 8 + var2 * this.P.h, 2, -3604601, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, var3.g, 268, 8 + var2 * this.P.h, 2, -3604601, -16777216);
         }
      }

      this.a(var1);
      this.P.a(var1, this);
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.ad = null;
      switch(var1.b) {
      case 1001:
         return;
      case 1003:
         if (var1.j.k < 0) {
            break;
         }

         if (this.T <= 2) {
            this.a(this.U[var1.j.k].b, var1.j.k, var2, var3);
            return;
         }

         int var4 = var3;
         var3 = var2;
         var2 = var1.j.k;
         this.W = var3;
         Vector var9;
         if ((var3 < 70 || var3 > 150) && (var3 < 180 || var3 > 260)) {
            if (VDTT_cw.v().C().d != 19) {
               (var9 = new Vector()).addElement(new VDTT_iu(2005, Caption.pM));
               this.a(var9, "", var2, var3, var4);
            }

            return;
         }

         VDTT_gc var5 = (VDTT_gc)this.V.get(var2);
         String var6 = "";
         if (var3 >= 70 && var3 <= 150) {
            var6 = var5.a;
         } else if (var3 >= 180 && var3 <= 260) {
            var6 = var5.b;
         }

         var9 = new Vector();
         if (!VDTT_cw.v().l(var6)) {
            var9.addElement(new VDTT_iu(4001, Caption.N));
         }

         var9.addElement(new VDTT_iu(4002, Caption.J));
         var9.addElement(new VDTT_iu(4003, Caption.cT));
         var9.addElement(new VDTT_iu(4004, Caption.dR));
         if (VDTT_cw.v().C().d != 19) {
            var9.addElement(new VDTT_iu(2005, Caption.pM));
         }

         this.a(var9, var6, var2, var3, var4);
         break;
      case 6000:
         this.ad = (Item)var1.k;
         this.k = c(this, var1, this.ad);
         break;
      case 9980:
         if (var1.j.k >= 0) {
            this.aa = var1.j.k;
            String[] var7 = VDTT_jb.a(this.Y[this.aa].a[1], "\\n");
            this.X.clear();
            String var8;
            if ((var8 = this.Y[this.aa].a()).length() > 0) {
               this.X.add("c#yellow" + var8);
            }

            for(var2 = 0; var2 < var7.length; ++var2) {
               this.X.addAll(VDTT_dg.a(VDTT_dg.d, var7[var2], super.q - 8 - 35));
            }

            this.X.add("c#blue" + Caption.kh);
            this.ac = this.X.size();

            for(var2 = 0; var2 < this.Y[this.aa].e.size(); ++var2) {
               this.X.add("c#cyan" + "- " + (String)this.Y[this.aa].e.get(var2));
               this.X.add("");
               this.X.add("");
            }

            this.ab[1] = new VDTT_hs((byte)1, 13, this.f() + 45, super.q - 8 - 18, 150, 15, this.X.size());
            this.Z = true;
            return;
         }
         break;
      case 9981:
         this.Z = false;
         return;
      }

   }
}
