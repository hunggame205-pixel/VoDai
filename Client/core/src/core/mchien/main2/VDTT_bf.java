package core.mchien.main2;

import java.util.Vector;

public class VDTT_bf extends VDTT_m {
   private boolean S;
   public int l;
   public VDTT_hs m;
   public VDTT_hp n;
   public int I;
   public int J;
   public int K;
   public int L;
   public int M = 20;
   public String[] N;
   public boolean O;
   public boolean P;
   private short T = 12;
   public int Q = -1;
   public int R;

   public VDTT_bf(int var1, int var2, int var3, int var4, VDTT_hp var5, MainScreen var6, int var7, boolean var8) {
      this.f(var1, var2);
      this.a = var6;
      this.l = var3;
      this.S = var8;
      this.K = var7;
      this.a(var5, var4);
   }

   public final void a(VDTT_hp var1, int var2) {
      this.L = var2;
      this.J = var2 * this.M + this.M + 1;
      this.n = var1;
      this.N = new String[var1.c.length];

      int var3;
      for(var3 = 0; var3 < var1.c.length; ++var3) {
         if ((var2 = VDTT_dg.c(VDTT_dg.d, var1.c[var3])) + 30 > this.I) {
            this.I = var2 + 30;
         }

         if (var2 > this.l - 30) {
            this.N[var3] = VDTT_dg.b(VDTT_dg.d, var1.c[var3], this.l - 30)[0].toString() + "...";
         } else {
            this.N[var3] = var1.c[var3];
         }
      }

      if (this.I < this.l) {
         this.I = this.l;
      }

      this.h();
      if (this.m != null) {
         var3 = this.m.k;
         this.d(this.I, this.J);
         if (this.K == 0) {
            this.m = new VDTT_hs((byte)1, 0, 21, this.q, this.r - this.M - 1, this.M, var1.c.length);
         } else if (this.K == 1) {
            this.m = new VDTT_hs((byte)1, 0, 21 - this.r, this.q, this.r - this.M - 1, this.M, var1.c.length);
         }

         var1.b = var3;
         if (var1.c.length > 0 && (var1.b >= var1.c.length || var1.b < 0)) {
            var1.b = 0;
         }

         this.m.a(var1.b);
         this.m.k = var1.b;
      }

   }

   public final short d() {
      return this.n.d[this.n.b];
   }

   public final String f() {
      return this.n.c[this.n.b];
   }

   public final void a(int var1) {
      this.n.b = var1;
   }

   public void b(Graphics var1) {
      if (!this.d) {
         short var2 = this.T;
         this.a(var1, 0, 0, this.i() - 18, 20, 46, 22, 23, 1, 1);
         if (this.e(0)) {
            var1.e(30);
         }

         if (this.K == 0) {
            VDTT_dc.a(var1, var2, 0, this.i(), 2, 24);
         } else if (this.K == 1) {
            VDTT_dc.a(var1, var2, 180, this.i(), 2, 24);
         }

         var1.h();
         String var4;
         if (this.n.b >= 0 && this.n.b < this.n.c.length) {
            var4 = this.N[this.n.b].trim().replaceAll(":-space", "");
            if (this.P) {
               var4 = this.n.b + 1 + ". " + var4;
            }

            if (this.c) {
               VDTT_dg.d(VDTT_dg.d, var1, var4, 5, 9, 0, -3089954, 0);
            } else {
               VDTT_dg.d(VDTT_dg.d, var1, var4, 5, 9, 0, -1, -16777216);
            }
         }

         if (this.O) {
            VDTT_dc.a(var1, this.m.objX, this.m.objY, this.m.q, this.m.r, -8492991, 22, 23, 1, 1, 90);
            this.a(var1, this.m);

            for(int var3 = 0; var3 < this.n.c.length; ++var3) {
               if (this.m.b(var3)) {
                  if (var3 == this.m.k) {
                     VDTT_dc.a(var1, 1, var3 * this.m.h + 1, this.m.q - 2, this.m.h - 2);
                  }

                  var4 = this.n.c[var3];
                  if (this.P) {
                     var4 = var3 + 1 + ". " + var4;
                  }

                  if (var3 == this.m.l) {
                     VDTT_dg.d(VDTT_dg.d, var1, var4, 6, 1 + var3 * this.m.h + this.m.h / 2, 0, -1, -11184811);
                  } else {
                     VDTT_dg.d(VDTT_dg.d, var1, var4, 5, var3 * this.m.h + this.m.h / 2, 0, -1, -11184811);
                  }
               }
            }

            this.a(var1);
            this.m.a(var1, this, 0);
         }

      }
   }

   public final void a_() {
      if (!this.c) {
         if (this.O) {
            this.m.a();
         }

         if (this.R > 0) {
            --this.R;
            if (this.R == 0 && this.m.k >= 0) {
               this.n.b = this.m.k;
               this.h();
               if (this.S) {
                  this.a.a(this.n.a, this.n, this);
               }
            }
         }

      }
   }

   public final void h() {
      this.O = false;
      this.d(this.i(), 20);
   }

   public final int i() {
      return this.I > this.l ? this.l : this.I;
   }

   public void a(VDTT_hl var1, int var2, int var3) {
      if (!this.c && !this.d) {
         if (this.R <= 0) {
            try {
               switch(var1.b) {
               case -1002:
                  if (var1.j.k >= 0) {
                     this.R = 4;
                  }

                  VDTT_ac.b().n();
               default:
                  return;
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
                  VDTT_ac.b().n();
               }
            } catch (Exception var4) {
            }

         }
      }
   }

   public final Vector g() {
      if (!this.c && !this.d) {
         Vector var1 = new Vector();
         if (!this.O) {
            var1.addElement(new VDTT_hl(-1000, 0, 0, this.i(), 20, (VDTT_hs)null, this));
         } else {
            var1.addElement(new VDTT_hl(-1001, 0, 0, this.i(), 20, (VDTT_hs)null, this));
            var1.addElement(new VDTT_hl(-1002, this.m.objX, this.m.objY, this.m.objX + this.m.q, this.m.objY + this.m.r, this.m, this));
         }

         return var1;
      } else {
         return null;
      }
   }
}
