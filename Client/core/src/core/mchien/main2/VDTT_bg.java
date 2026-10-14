package core.mchien.main2;

public final class VDTT_bg extends VDTT_bf {
   public VDTT_bg(int var1, int var2, int var3, int var4, int var5, VDTT_hp var6, MainScreen var7, boolean var8) {
      super(var1, var2, 20, var5, var6, var7, 1, true);
      this.N = new String[var6.c.length];
      this.f(var1, var2);
      this.I = 100;
      this.J = var5 * this.M;

      for(var1 = 0; var1 < this.N.length; ++var1) {
         this.N[var1] = "";
         VDTT_dg.b(VDTT_dg.d, var6.c[var1]);
      }

   }

   public final void b(Graphics var1) {
      if (this.n.b < 0 || this.n.b >= this.n.d.length) {
         this.n.b = 0;
      }

      short var2 = this.n.d[this.n.b];
      if (this.e(0)) {
         var1.e(30);
      }

      VDTT_dc.a(var1, var2, 0, this.i() - 2, 2, 24);
      var1.h();
      if (this.O) {
         VDTT_dc.a(var1, this.m.objX, this.m.objY, this.m.q, this.m.r, -8492991, 22, 23, 1, 1, 90);

         int var5;
         for(var5 = 0; var5 < this.m.q - 40; var5 += 40) {
            if (this.K == 0) {
               VDTT_aa.a(var1, 46, var5 / 40 % 2 == 0 ? 90 : -270, 3 + var5, 24, 34, (int)(this.m.r - 6));
            } else if (this.K == 1) {
               VDTT_aa.a(var1, 46, var5 / 40 % 2 == 0 ? 90 : -270, 3 + var5, -this.m.r + 3, 34, (int)(this.m.r - 6));
            }
         }

         this.a(var1, this.m);
         byte var6 = 0;

         try {
            for(var5 = 0; var5 < this.n.c.length; ++var5) {
               if (this.m.b(var5)) {
                  if (var5 == this.m.k) {
                     VDTT_dc.a(var1, 1, var5 * this.m.h + 1, this.m.q - 2, this.m.h - 2);
                  }

                  if (var5 == this.m.l) {
                     VDTT_dc.a(var1, this.n.d[var5], 0, 11, 1 + var5 * this.m.h + this.m.h / 2, 3);
                     VDTT_dg.b(VDTT_dg.d, var1, this.n.c[var5], 26, 0 + var5 * this.m.h + this.m.h / 2, 0, -1, -11184811);
                     if (var5 == 7) {
                        VDTT_dc.a(var1, 752 + DataCenter.d().h / 10 % 4, 0, this.m.q - 3, 1 + var5 * this.m.h + this.m.h / 2 - 3 + 1, 10);
                     }
                  } else {
                     VDTT_dc.a(var1, this.n.d[var5], 0, 10, var5 * this.m.h + this.m.h / 2, 3);
                     VDTT_dg.b(VDTT_dg.d, var1, this.n.c[var5], 25, -1 + var5 * this.m.h + this.m.h / 2, 0, -1, -11184811);
                     if (var5 == 7) {
                        VDTT_dc.a(var1, 752 + DataCenter.d().h / 10 % 4, 0, this.m.q - 3, 1 + var5 * this.m.h + this.m.h / 2 - 3, 10);
                     }
                  }
               }
            }
         } catch (Exception var4) {
            VDTT_jb.b("loiiii: " + this.n.d.length + ", " + this.n.c.length + ", iii: " + var6);
            VDTT_jb.a(var4);
         }

         this.a(var1);
         this.m.a(var1, this, 0);
      }

   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (this.R <= 0) {
         super.a(var1, var2, var3);

         try {
            switch(var1.b) {
            case -1002:
               if (var1.j.k >= 0) {
                  this.R = 4;
                  if (this.m.k == 6) {
                     VDTT_cw.v().c(Caption.qr, -48094);
                  } else if (this.m.k == 7) {
                     VDTT_cw.v().c(Caption.pg, -16711681);
                  }
               }
               break;
            case -1001:
               this.h();
               break;
            case -1000:
               this.O = true;
               this.d(this.I, this.J);
               if (this.m == null) {
                  if (this.K == 0) {
                     this.m = new VDTT_hs((byte)1, 0, 21, this.q, this.r - this.M, this.M, this.n.c.length);
                  } else if (this.K == 1) {
                     this.m = new VDTT_hs((byte)1, 0, 21 - this.r, this.q, this.r - this.M, this.M, this.n.c.length);
                  }
               }

               if (this.m.j < 0 || this.m.j >= this.n.c.length || this.m.j > this.n.b + this.L / 2 + 1 || this.m.j < this.n.b - (this.L / 2 + 1)) {
                  this.m.a(this.n.b);
               }

               this.m.k = this.n.b;
            }

            VDTT_ac.b().n();
         } catch (Exception var4) {
         }
      }
   }

   public final void a(byte var1) {
      this.n.b = var1;
   }

   public final byte j() {
      return (byte)this.n.b;
   }
}
