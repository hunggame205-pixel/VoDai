package core.mchien.main2;

import java.util.Vector;

public abstract class VDTT_am extends MainScreen {
   public VDTT_p I;
   public VDTT_hv J;
   public boolean K;
   public boolean L;
   protected VDTT_ba M;
   private VDTT_ba[] a;
   private static boolean b;
   private long c;
   private VDTT_ba d;
   private VDTT_ba N;

   public VDTT_am() {
      this.e = 3;
   }

   public int f() {
      return 29;
   }

   public final int h() {
      return !this.K ? this.r - 33 : this.r - 64;
   }

   public final void a(int var1, int var2) {
      this.L = false;
      if (!this.s && var2 < 240) {
         this.d(var1, var2);
         VDTT_ar var4 = null;
         if (this.I.c instanceof VDTT_ar) {
            var4 = (VDTT_ar)this.I.c;
         }

         if (var4 != null && var4.s) {
            this.f(var4.objX + var4.q / 2 - this.q / 2, var4.objY + 11 + var4.r / 2 - this.r / 2);
         } else {
            this.f(DataCenter.d().n / 2 - this.q / 2, DataCenter.d().o / 2 - this.r / 2);
         }
      } else {
         this.a(var1);
      }

      if (this.M == null) {
         this.M = this.w();
      }

      if (this.e == 2) {
         this.M.b(52);
         this.M.f(var1 - 17, 3);
      } else if (this.s) {
         this.M.b(52);
         this.M.f(var1 - 17, 3);
      } else {
         this.M.b(-26);
         this.M.f(var1 - 20, 0);
      }
   }

   public final void a(int var1) {
      this.L = false;
      int var2 = 0;
      if (this.u) {
         var2 = (DataCenter.d().o - this.r) / 2;
      } else {
         int var3 = DataCenter.d().o;
         this.s = true;
         if (var3 >= 270 && !this.u) {
            if (VDTT_eq.a().b(29) == 0 && var3 > 240) {
               var3 = 240;
            }

            this.t = true;
            if (var1 < 250) {
               var1 = 250;
            }
         }

         if (var3 > 240 && !this.u) {
            var3 = 240;
         }

         this.d(var1, var3);
      }

      if (this.M == null) {
         this.M = this.w();
      }

      if (this.e == 2) {
         this.M.b(52);
         this.M.f(var1 - 17, 3);
      } else if (this.s && !this.u) {
         this.M.b(52);
         this.M.f(var1 - 17, 3);
      } else {
         this.M.b(-26);
         this.M.f(var1 - 20, 0);
      }

      this.i();
      if (VDTT_eq.a().b(29) == 0) {
         this.f(DataCenter.d().n / 2 - this.q / 2, DataCenter.d().o / 2 - this.r / 2);
      } else if (VDTT_eq.a().b(29) == 1) {
         this.f(-var1, var2);
         this.a(0, VDTT_d.g().m, this.objY);
      } else {
         if (VDTT_eq.a().b(29) == 2) {
            this.f(DataCenter.d().n - VDTT_d.g().m, var2);
            this.a(0, DataCenter.d().n - var1 - VDTT_d.g().m, this.objY);
         }

      }
   }

   protected final void i() {
      int[] var1 = new int[]{5657, 5658, 5659, 5660, 5656};
      int[] var2 = new int[]{5651, 5652, 5653, 5654, 5655};
      int[] var3 = new int[]{674, 675, 676, 677, 673};
      int[] var4 = new int[]{687, 688, 689, 690, 680};
      if (this.a == null) {
         this.a = new VDTT_ba[10];
         if (DataCenter.d().o < 300) {
            this.N = this.a(0, 0, "", this, 9999, 287);
            this.d = this.a(0, 0, "", this, 9999, 287);
            short var6 = -360;
            this.d.K = var6;
         }
      }

      int var5;
      for(var5 = 0; var5 < 5; ++var5) {
         if (this.a[var5] == null) {
            this.a[var5] = this.a(0, 0, Caption.Br[var5], this, var1[var5], var3[var5]);
            this.a[var5 + 5] = this.a(0, 0, Caption.Br[var5 + 5], this, var2[var5], var4[var5]);
         }
      }

      var5 = this.q / 6;
      int var7 = (DataCenter.d().o - this.r) / 3 + 2;
      int var8;
      if (DataCenter.d().o >= 300) {
         for(var8 = 0; var8 < 5; ++var8) {
            this.a[var8].f(var5 + var8 * var5 - 13, this.r - 20 + var7);
            this.a[var8 + 5].f(var5 + var8 * var5 - 13, this.r - 20 + var7 + var7);
         }
      } else {
         var7 = (DataCenter.d().o - this.r) / 2 + 3;

         for(var8 = 0; var8 < 5; ++var8) {
            if (b) {
               this.a[var8 + 5].f(VDTT_jb.n(this.q % var5) + var5 + var8 * var5 - 13, this.r - 20 + var7);
               this.a[var8].f(-100, -100);
            } else {
               this.a[var8 + 5].f(-100, -100);
               this.a[var8].f(VDTT_jb.n(this.q % var5) + var5 + var8 * var5 - 13, this.r - 20 + var7);
            }
         }
      }

      boolean var9 = !this.t || VDTT_eq.a().b(29) <= 0;
      if (this.d != null) {
         this.d.f(11, !b ? this.a[0].objY + VDTT_jb.n(8) : this.a[6].objY + VDTT_jb.n(8));
         this.d.b(var9);
      }

      if (this.N != null) {
         this.N.f(this.q - 27, !b ? this.a[0].objY + VDTT_jb.n(8) : this.a[6].objY + VDTT_jb.n(8));
         this.N.b(var9);
      }

      for(var7 = 0; var7 < this.a.length; ++var7) {
         this.a[var7].b(var9);
      }

   }

   public final void j() {
      this.b(this.M);
      this.M = null;
   }

   private VDTT_ba w() {
      if (this.e == 2) {
         return this.a(this.q - 17, 3, "", this, -7, 52);
      } else {
         return this.s ? this.a(this.q - 5, 5, "", this, -7, 49) : this.a(this.q - 5, 5, "", this, -7, -26);
      }
   }

   public final VDTT_ba a(String var1, int var2) {
      return this.a(this.q / 2 - 37, this.r - 29, var1, this, var2, 7);
   }

   public final VDTT_ba b(String var1, int var2) {
      return this.a(this.q / 2 - 65, this.r - 29, var1, this, var2, -8);
   }

   public final VDTT_ba c(String var1, int var2) {
      return this.a(this.q / 2 + 5, this.r - 29, var1, this, var2, -8);
   }

   public final VDTT_ca a(int var1, int var2, int var3, String var4, int var5) {
      return this.a(var1, var2, var3, var4, this, var5);
   }

   public final VDTT_bd a(int var1, int var2, String var3, int var4) {
      return this.a(var1, var2, var3, this, var4);
   }

   public void c() {
   }

   private void x() {
      this.s = this.u = this.L = this.t = false;
      this.k();
   }

   public void a(VDTT_hl var1, int var2, int var3) {
      if (this.t) {
         switch(var1.b) {
         case 5651:
            this.x();
            VDTT_cw.v();
            VDTT_cw.o(86);
            VDTT_ac.b().w();
            break;
         case 5652:
            this.x();
            VDTT_cw.v();
            VDTT_cw.o(88);
            VDTT_ac.b().w();
            break;
         case 5653:
            this.x();
            VDTT_cw.v().a((MainScreen)(new VDTT_ln(VDTT_cw.v())));
            VDTT_ac.b().w();
            break;
         case 5654:
            this.x();
            VDTT_cw.v();
            VDTT_cw.o(111);
            VDTT_ac.b().w();
            break;
         case 5655:
            this.x();
            VDTT_cw.v().ae();
            VDTT_ac.b().w();
            break;
         case 5656:
            this.x();
            VDTT_cw.v().ad();
            VDTT_ac.b().w();
            break;
         case 5657:
            this.x();
            VDTT_cw.v().a((MainScreen)(new VDTT_lq(VDTT_cw.v())));
            VDTT_ac.b().w();
            break;
         case 5658:
            this.x();
            VDTT_cw.v();
            VDTT_cw.o(72);
            VDTT_ac.b().w();
            break;
         case 5659:
            this.x();
            this.I.a((MainScreen)(new VDTT_ms(VDTT_cw.v())));
            VDTT_ac.b().w();
            break;
         case 5660:
            this.x();
            VDTT_cw.v();
            VDTT_cw.o(54);
            VDTT_ac.b().w();
            break;
         case 9999:
            if (System.currentTimeMillis() - this.c >= 300L) {
               this.c = System.currentTimeMillis();
               b = !b;
               this.i();
            }

            VDTT_ac.b().n();
         }
      }

      if (var1.b == -9996 && !this.L) {
         if (DataCenter.d().aA.b() && (VDTT_cw.v().br == 5 && VDTT_cw.v().bs < 9 || this instanceof MenuConfig && VDTT_cw.v().br == 3 && VDTT_cw.v().bs == 0)) {
            return;
         }

         this.k();
         this.d();
      }

   }

   public final void c(int var1, Object var2) {
      VDTT_hp var3;
      switch(var1) {
      case 4001:
         VDTT_cw.v();
         VDTT_cw.h((var3 = (VDTT_hp)var2).f);
         return;
      case 4002:
         VDTT_cw.v();
         VDTT_cw.g((var3 = (VDTT_hp)var2).f);
         return;
      case 4003:
         VDTT_cw.v();
         VDTT_cw.a((String)(var3 = (VDTT_hp)var2).f, (MainScreen)this);
         return;
      case 4004:
         VDTT_cw.v().i((var3 = (VDTT_hp)var2).f);
         return;
      case 4005:
         VDTT_cw.v();
      default:
      }
   }

   public Vector g() {
      if (this.n > 0) {
         --this.n;
         if (this.n == 0) {
            this.L = false;
            this.I.a(this.e);
         }
      }

      Vector var1 = new Vector();
      if (this.u) {
         var1.addElement(new VDTT_hl(-9996, 0, -DataCenter.d().o, DataCenter.d().n, 0, (VDTT_hs)null, this));
         var1.addElement(new VDTT_hl(-9996, 0, this.r, DataCenter.d().n, this.r + DataCenter.d().o, (VDTT_hs)null, this));
         var1.addElement(new VDTT_hl(-9996, this.q, 0, DataCenter.d().n, DataCenter.d().o * 2, (VDTT_hs)null, this));
         if (this.L && this.l == null) {
            this.L = false;
            this.I.a(this.e);
         }
      } else if (!this.s) {
         if (this.J == null) {
            this.J = new VDTT_hv((byte)0, 0, 0, this.q, 28, 1, 1);
            this.J.N = this;
         }

         if (this.e != 2) {
            var1.addElement(new VDTT_hl(-9999, 0, 0, this.J.q, this.J.r, this.J, this));
            if (this.K) {
               var1.addElement(new VDTT_hl(-9999, 0, this.r - 32, this.J.q, this.r, this.J, this));
            }
         }
      } else {
         if (VDTT_eq.a().b(29) == 1) {
            var1.addElement(new VDTT_hl(-9996, this.q, 0, DataCenter.d().n, DataCenter.d().o, (VDTT_hs)null, this));
         } else if (VDTT_eq.a().b(29) == 2) {
            var1.addElement(new VDTT_hl(-9996, -DataCenter.d().n, 0, 0, DataCenter.d().o, (VDTT_hs)null, this));
         } else {
            if (this.J == null) {
               this.J = new VDTT_hv((byte)0, 0, 0, this.q, 28, 1, 1);
               this.J.N = this;
            }

            var1.addElement(new VDTT_hl(-9999, 0, 0, this.J.q, this.J.r, this.J, this));
         }

         if (this.L && this.l == null) {
            this.L = false;
            this.I.a(this.e);
         }
      }

      return var1;
   }

   public final void b(Vector var1) {
      if (this.n > 0) {
         --this.n;
         if (this.n == 0) {
            this.L = false;
            this.I.a(this.e);
         }
      }

      if (this.u) {
         var1.addElement(new VDTT_hl(-9996, 0, -DataCenter.d().o, DataCenter.d().n, 0, (VDTT_hs)null, this));
         var1.addElement(new VDTT_hl(-9996, 0, this.r, DataCenter.d().n, this.r + DataCenter.d().o, (VDTT_hs)null, this));
         var1.addElement(new VDTT_hl(-9996, this.q, 0, DataCenter.d().n, DataCenter.d().o * 2, (VDTT_hs)null, this));
         if (this.L && this.l == null) {
            this.L = false;
            this.I.a(this.e);
            return;
         }
      } else if (!this.s) {
         if (this.J == null) {
            this.J = new VDTT_hv((byte)0, 0, 0, this.q, 28, 1, 1);
            this.J.N = this;
         }

         var1.addElement(new VDTT_hl(-9999, 0, 0, this.J.q, this.J.r, this.J, this));
         if (this.K) {
            var1.addElement(new VDTT_hl(-9999, 0, this.r - 32, this.J.q, this.r, this.J, this));
            return;
         }
      } else {
         if (VDTT_eq.a().b(29) == 0) {
            if (this.J == null) {
               this.J = new VDTT_hv((byte)0, 0, 0, this.q, 28, 1, 1);
               this.J.N = this;
            }

            var1.addElement(new VDTT_hl(-9999, 0, 0, this.J.q, this.J.r, this.J, this));
         }

         if (VDTT_eq.a().b(29) == 1) {
            var1.addElement(new VDTT_hl(-9996, this.q, 0, DataCenter.d().n, DataCenter.d().o, (VDTT_hs)null, this));
         } else if (VDTT_eq.a().b(29) == 2) {
            var1.addElement(new VDTT_hl(-9996, -DataCenter.d().n, 0, 0, DataCenter.d().o, (VDTT_hs)null, this));
         }

         if (this.L && this.l == null) {
            this.L = false;
            this.I.a(this.e);
         }
      }

   }

   public final void a(int var1, Object var2, VDTT_z var3) {
      if (var3 instanceof VDTT_m) {
         VDTT_m var4 = (VDTT_m)var3;
         switch(var1) {
         case -11:
            this.q();
            return;
         case -10:
            VDTT_d.g();
            VDTT_d.i();
            return;
         case -9:
            if (DataCenter.d().ai instanceof VDTT_cq) {
               this.k();
               return;
            }

            VDTT_cf var5;
            (var5 = VDTT_cq.v()).b(1000);
            DataCenter.d().ai = var5;
            return;
         case -8:
         case -6:
         case -5:
         case -4:
         case -3:
         case -1:
            this.I.a(var1, var2, var3);
            return;
         case -7:
            this.k();
            return;
         case -2:
         default:
            if (var2 == null) {
               var4.a.a(new VDTT_hl(var1, 0, 0, 0, 0, (VDTT_hs)null, var3), 0, 0);
               return;
            }

            var4.a.perform(var1, var2, var3);
         }
      }

   }

   public void a(int var1, Object var2) {
   }

   public void k() {
      this.d();
      if (!this.s && !this.u) {
         this.I.a(this.e);
      } else {
         if (VDTT_eq.a().b(29) == 1) {
            this.a(0, -this.q, this.objY);
         } else if (VDTT_eq.a().b(29) == 2) {
            this.a(0, DataCenter.d().n, this.objY);
         }

         this.L = true;
         if (this.l != null) {
            this.l.a = true;
         }

         this.n = 50;
      }
   }

   public final void v() {
      this.d();
      this.I.a(this.e);
   }

   public void d() {
   }
}
