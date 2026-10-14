package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ls extends VDTT_ar {
   private boolean a;
   private VDTT_hs b;
   private VDTT_hp c;
   private int d;
   private String N;
   private VDTT_v O;
   private int P = -1;

   public VDTT_ls(VDTT_p var1, VDTT_hp var2, int var3) {
      this.I = var1;
      this.c = var2;
      this.d = 0;
      int var4 = DataCenter.d().o - 120;
      byte var6 = 55;
      if (var4 < 147) {
         var4 = 147;
         var6 = 30;
      }

      this.d(170, var4);
      this.a(2, DataCenter.d().n - this.q, var6, 20);
      if ((var4 = var2.c.length) > 10) {
         var4 = 10;
      }

      int var5 = this.r / 32;
      if (var4 < var5 && this.r > var4 * 32 + 20) {
         this.r = (short)(var4 * 32 + 20);
         this.d(this.q, this.r);
      }

      this.b = new VDTT_hs((byte)1, this.q / 2 - 68, 10, 130, var5 * 32, 32, var4);
      this.e = 2;
      this.N = VDTT_jb.e(DataCenter.d().v);
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      VDTT_dc.a(var1, 374, 0, 50, 3, 33);
      VDTT_dc.a(var1, 374, 0, this.q - 50, 3, 33);
      this.b(var1, -3, 0, this.q, this.r, -28, 371, 372, 373, 3, 3, 90);
      this.b(var1, 27, this.r + 5, this.q - 30, 53, -28, 371, 372, 373, 3, 3, 90);

      int var2;
      for(var2 = 1; var2 < this.r / 20; ++var2) {
         VDTT_dc.a(var1, 375, 0, 3, var2 * 20, 3);
         VDTT_dc.a(var1, 375, 0, this.q - 8, var2 * 20, 3);
      }

      for(var2 = 1; var2 < this.q / 20; ++var2) {
         VDTT_dc.a(var1, 375, 0, var2 * 20, this.r - 3, 3);
      }

      for(var2 = 1; var2 < 4; ++var2) {
         VDTT_dc.a(var1, 375, 0, 33, this.r + 13 + var2 * 10, 3);
         VDTT_dc.a(var1, 375, 0, this.q - 7, this.r + 13 + var2 * 10, 3);
      }

      var1.a(this.O, 45, this.r + 15);
      VDTT_dg.a((VDTT_dg)VDTT_dg.e, var1, Caption.mR, 85, this.r + 22, 0, -2560, -10275328);
      VDTT_dg.a((VDTT_dg)VDTT_dg.e, var1, Caption.mi + this.N, 85, this.r + 37, 0, -2560, -10275328);
      this.a(var1, this.b);
      var2 = var1.f;

      for(int var3 = 0; var3 < this.c.c.length; ++var3) {
         VDTT_dc.a(var1, 376, 0, 22, var3 * this.b.h + 7, 24);
         if (var3 == this.b.l) {
            var1.e(30);
            VDTT_dc.a(var1, 306, 0, 22, var3 * this.b.h, 20);
            var1.h();
            VDTT_dg.a((VDTT_dg)VDTT_dg.f, var1, this.c.c[var3], this.q / 2 - 10 + 1, this.b.h / 2 + var3 * this.b.h - 3 + 1, 2, -6488, -10275328);
         } else {
            VDTT_dc.a(var1, 306, 0, 22, var3 * this.b.h, 20);
            VDTT_dg.a((VDTT_dg)VDTT_dg.f, var1, this.c.c[var3], this.q / 2 - 10, this.b.h / 2 + var3 * this.b.h - 3, 2, -6488, -10275328);
         }

         if (var3 == 1 && this.d == 1 && VDTT_cw.v().aZ) {
            VDTT_dc.a(var1, 713, 0, this.q / 2 + 50, this.b.h / 2 + var3 * this.b.h - 2, 20);
         }

         int var10001;
         int var10002;
         if (this.c.d[var3] == 12 && VDTT_cw.v().br == 0 && VDTT_cw.v().bs == 1 && !this.n()) {
            var10001 = this.q / 2 + 20;
            var10002 = var2 + this.b.h / 2 + var3 * this.b.h;
            DataCenter.d().aA.a(var10001, var10002 + 1);
            DataCenter.d().aA.b = true;
         } else if (this.c.d[var3] == 10 && VDTT_cw.v().br == 14 && VDTT_cw.v().bs == 0 && !this.n()) {
            var10001 = this.q / 2 + 20;
            var10002 = var2 + this.b.h / 2 + var3 * this.b.h;
            DataCenter.d().aA.a(var10001, var10002 + 1);
            DataCenter.d().aA.b = true;
         }
      }

      this.a(var1);
      this.b.b(var1, this);
   }

   public final void a_() {
      if (this.a && this.l == null) {
         this.k();
         if (this.P >= 0) {
            this.f(this.P);
            this.P = -1;
         }
      }

      this.b.a();
   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).add(this.b.a(1100, this));
      var1.add(new VDTT_hl(1101, 0, 0, this.q, this.r, (VDTT_hs)null, this));
      var1.add(new VDTT_hl(1101, 30, this.r + 5, this.q, this.r + 5 + 53, (VDTT_hs)null, this));
      var1.add(new VDTT_hl(1102, -DataCenter.d().n * 2, -DataCenter.d().o * 2, DataCenter.d().n * 2, DataCenter.d().o * 2, (VDTT_hs)null, this));
      return var1;
   }

   public final void d() {
      if (this.O != null) {
         this.O.a();
      }

      super.d();
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (this.l == null) {
         switch(var1.b) {
         case 1100:
            this.P = this.b.k;
            this.w();
            return;
         case 1102:
            this.w();
            return;
         case 1103:
            this.a = true;
            this.f(-this.q, 0);
            VDTT_cw.v().a((MainScreen)(new VDTT_kb(VDTT_cw.v(), VDTT_ek.m(), VDTT_cw.v().ae)));
            VDTT_ac.b().o();
            return;
         case 2001:
            VDTT_da.a(true);
            return;
         case 2002:
            VDTT_d.g();
            VDTT_d.i();
            return;
         case 2003:
            VDTT_d.g().j();
            VDTT_cf var4;
            (var4 = VDTT_cq.v()).b(1000);
            DataCenter.d().ai = var4;
         default:
         }
      }
   }

   private void w() {
      this.a = true;
      this.a(2, this.objX, -this.r - 60);
      VDTT_ac.b().w();
   }

   private boolean f(int var1) {
      try {
         switch(this.c.d[var1]) {
         case 0:
            this.I.a((MainScreen)(new VDTT_lr(this.I)));
            return true;
         case 1:
            this.I.a(Caption.cs, 2001, this);
            return true;
         case 2:
            this.I.a((MainScreen)(new VDTT_lr(this.I)));
            return true;
         case 3:
            try {
               Message.c((byte)-121).l();
            } catch (Exception var3) {
               VDTT_jb.a(var3);
            }

            return true;
         case 4:
            try {
               Message.c((byte)-71).l();
            } catch (Exception var2) {
               VDTT_jb.a(var2);
            }

            return true;
         case 5:
            this.I.a(Caption.nB, 2003, this);
            return true;
         case 6:
            this.I.a(Caption.jB, 2002, this);
            return true;
         case 7:
            VDTT_cw.v();
            VDTT_cw.o(72);
            return true;
         case 8:
            this.I.a((MainScreen)(new VDTT_lj(VDTT_cw.v(), 0)));
            return true;
         case 9:
            this.I.a((MainScreen)(new VDTT_ms(VDTT_cw.v())));
            return true;
         case 10:
            VDTT_cw.v();
            VDTT_cw.o(54);
            return true;
         case 11:
            this.I.a((MainScreen)(new VDTT_kx(this.I)));
            return true;
         case 12:
            MenuConfig var5;
            (var5 = MenuConfig.K()).J();
            var5.T = 0;
            var5.a(var5.q, var5.r);
            this.I.a((MainScreen)var5);
            VDTT_cw.v().ds.clear();
            return true;
         case 13:
            this.I.b(Caption.m).f.clear();
            VDTT_cm.K = true;
            VDTT_d.g().f = 50;
            return true;
         case 14:
            this.I.a((MainScreen)(new VDTT_lw(this.I)));
            return true;
         }
      } catch (Exception var4) {
      }

      return false;
   }
}
