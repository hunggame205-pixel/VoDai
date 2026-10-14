package core.mchien.main2;

import java.util.Vector;

public final class VDTT_jm extends VDTT_ar {
   public VDTT_iy[] a = new VDTT_iy[0];
   public VDTT_iy[] b = new VDTT_iy[0];
   private VDTT_iq c;
   private VDTT_hs d;
   private VDTT_bf N;
   private static int O;

   public VDTT_jm(VDTT_p var1) {
      this.I = var1;
      this.a(316, 213);
      this.K = false;
      this.c = new VDTT_iq(new VDTT_hp(1001, Caption.zI), 4, this.f(), super.q - 8, 23, 76, this);
      this.N = this.a(225, this.c.i() + 4, 80, 3, new VDTT_hp(1002, Caption.zJ), this, 0);
      this.w();
      this.f(O);
   }

   public final void w() {
      if (this.N.n.b == 0) {
         this.b = this.a;
      } else {
         Vector var1;
         int var2;
         if (this.N.n.b == 1) {
            var1 = new Vector();

            for(var2 = 0; var2 < this.a.length; ++var2) {
               if (this.a[var2].f == 6) {
                  var1.add(this.a[var2]);
               }
            }

            this.b = new VDTT_iy[var1.size()];

            for(var2 = 0; var2 < this.b.length; ++var2) {
               this.b[var2] = (VDTT_iy)var1.get(var2);
            }
         } else if (this.N.n.b == 2) {
            var1 = new Vector();

            for(var2 = 0; var2 < this.a.length; ++var2) {
               if (this.a[var2].f == 7) {
                  var1.add(this.a[var2]);
               }
            }

            this.b = new VDTT_iy[var1.size()];

            for(var2 = 0; var2 < this.b.length; ++var2) {
               this.b[var2] = (VDTT_iy)var1.get(var2);
            }
         }
      }

      this.d = new VDTT_hs((byte)1, 4, this.c.i() + 28, super.q - 8, 126, 18, this.b.length);
   }

   private void f(int var1) {
      this.c.a(var1);
      switch(var1) {
      case 0:
         this.N.d = false;
         break;
      default:
         this.N.d = true;
      }

      this.x();
   }

   private void x() {
      try {
         Message var1;
         (var1 = new Message((byte)-53)).a(this.c.h());
         var1.a(this.N.n.b);
         var1.l();
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }

   public final void a_() {
      this.c.e();
      this.d.a();
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      this.c(var1, var2);
      switch(var1) {
      case 1002:
         this.w();
      default:
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.c.f());
      var1.addElement(this.d.a(1003, this));
      return var1;
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.cK, (byte)2, this.K);
      this.c.a(var1);
      this.b(var1, this.d);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.cL, 20, -15, 2, -6488, -10275328);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.cM, 70, -15, 2, -6488, -10275328);
      if (this.c.h() == 0) {
         VDTT_dg.b(VDTT_dg.e, var1, Caption.cN, 130, -15, 2, -6488, -10275328);
      }

      VDTT_dg.b(VDTT_dg.e, var1, Caption.M, 190, -15, 2, -6488, -10275328);
      this.a(var1, this.d);

      for(int var2 = 0; var2 < this.d.i; ++var2) {
         if (this.d.b(var2)) {
            if (var2 == this.d.k) {
               var1.f(13136426);
               var1.c(0, var2 * this.d.h, this.d.q, this.d.h);
            }

            VDTT_iy var3 = this.b[var2];
            VDTT_dg.b(VDTT_dg.d, var1, "" + (var2 + 1), 20, 8 + var2 * this.d.h, 2, -3604601, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, var3.b, 70, 8 + var2 * this.d.h, 2, -3604601, -16777216);
            if (this.c.h() == 0) {
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(var3.e), 130, 8 + var2 * this.d.h, 2, -3604601, -16777216);
            }

            VDTT_dg.b(VDTT_dg.d, var1, var3.g, 190, 8 + var2 * this.d.h, 2, -3604601, -16777216);
            if (var3.f == 6) {
               VDTT_dg.b(VDTT_dg.d, var1, Caption.cP, 255, 8 + var2 * this.d.h, 2, -3604601, -16777216);
            } else if (var3.f == 7) {
               VDTT_dg.b(VDTT_dg.d, var1, Caption.cQ, 255, 8 + var2 * this.d.h, 2, -3604601, -16777216);
            }
         }
      }

      this.a(var1);
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         if (var1.j.k >= 0) {
            O = var1.j.k;
            this.f(var1.j.k);
            return;
         }
         break;
      case 1003:
         if (var1.j.k >= 0) {
            this.a(this.b[var1.j.k].b, var1.j.k, var2, var3);
         }
      }

   }
}
