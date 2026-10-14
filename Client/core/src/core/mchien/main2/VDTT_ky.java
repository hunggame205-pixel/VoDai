package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ky extends VDTT_ar {
   private VDTT_ba[] b;
   private VDTT_mf c;
   private Vector d;
   private int N;
   public VDTT_fl a;
   private String[] O;
   private String P;
   private boolean Q;
   private int R = -1;
   private int S;

   public VDTT_ky(VDTT_p var1, String[] var2, String var3) {
      this.I = var1;
      this.O = var2;
      this.P = var3;
      this.j();
      this.a = new VDTT_fl();
      VDTT_ac var4;
      if (!(var4 = VDTT_ac.b()).a) {
         var4.a(68, 1.0F);
      }

   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a.L = this.S;
      this.a.a(var1);
      if (this.a.m()) {
         this.c.a(var1);

         for(int var2 = 0; var2 < this.d.size(); ++var2) {
            VDTT_dg.b(VDTT_dg.d, var1, (String)this.d.get(var2), this.c.objX + this.c.q / 2, this.c.objY + var2 * 12 + 18, 2, -2560, -10275328);
         }
      }

   }

   public final void a_() {
      this.a.n();
      if (this.a.m() && !this.Q) {
         this.Q = true;
         VDTT_ky var1 = this;
         this.a(DataCenter.d().n, VDTT_jb.n(48));
         this.a(3, this.objX, DataCenter.d().o - this.r, 10);
         this.b = new VDTT_ba[this.O.length];

         int var2;
         int var5;
         for(var2 = 0; var2 < var1.O.length; ++var2) {
            String var3 = "";
            String[] var4 = VDTT_dg.c(VDTT_dg.d, var1.O[var2], 60);

            for(var5 = 0; var5 < var4.length; ++var5) {
               var3 = var3 + var4[var5];
               if (var5 < var4.length - 1) {
                  var3 = var3 + "\n";
               }
            }

            var1.b[var2] = var1.a(0, 11, var3, var1, 100 + var2, -36);
         }

         DataCenter.d();
         int var11;
         if (var1.b.length <= 5) {
            var11 = DataCenter.d().n / 2 - 70 * var1.b.length / 2;
         } else {
            var11 = DataCenter.d().n / 2 - 140;
         }

         int var13;
         for(var13 = 0; var13 < var1.b.length; ++var13) {
            if (var1.b.length <= 5) {
               var1.b[var13].f(var11 + 70 * var13, var1.r / 2 - VDTT_jb.n(13));
            } else {
               var1.b[var13].d(var1.b[var13].q, 17);
               if (var13 >= 4) {
                  var1.b[var13].f(var11 + 70 * (var13 - 4), var1.r / 2);
               } else {
                  var1.b[var13].f(var11 + 70 * var13, var1.r / 2 - VDTT_jb.n(22));
               }
            }
         }

         var13 = 20;
         var2 = var1.q - 40;
         var1.d = VDTT_dg.a(VDTT_dg.d, var1.P, var2);
         var1.N = (var1.d.size() + 1) * 12 + 6;
         if (var1.N < 40) {
            var1.N = 40;
         }

         var5 = -var1.N + 5;
         if (var1.b.length > 5) {
            var5 -= 8;
         }

         if (var2 > 400) {
            var2 = 400;
            var13 = DataCenter.d().n / 2 - 200;
         }

         var1.c = new VDTT_mf();
         var1.c.d(var2, var1.N);
         var1.c.f(var13, var5);
         var1.j();
      }

      try {
         int var8;
         for(var8 = 0; var8 < VDTT_cw.v().au.size(); ++var8) {
            VDTT_hi var10;
            if ((var10 = (VDTT_hi)VDTT_cw.v().au.get(var8)).k == 449) {
               this.S = 1;
               break;
            }

            if (var10.k == 450) {
               this.S = 2;
               break;
            }

            if (var10.k == 478) {
               this.S = 3;
               break;
            }

            if (var10.k == 479) {
               this.S = 4;
               break;
            }
         }

         for(var8 = 0; var8 < VDTT_cw.v().at.size(); ++var8) {
            VDTT_ev var12;
            if ((var12 = (VDTT_ev)VDTT_cw.v().at.get(var8)).k == 591) {
               this.S = 1;
               break;
            }

            if (var12.k == 592) {
               this.S = 2;
               break;
            }

            if (var12.k == 619) {
               this.S = 3;
               break;
            }

            if (var12.k == 621) {
               this.S = 4;
               break;
            }
         }
      } catch (Exception var7) {
      }

      if (this.a.q()) {
         try {
            Message var9;
            if (this.S == 4) {
               var9 = Message.c((byte)26);
            } else if (this.S == 3) {
               var9 = Message.c((byte)24);
            } else if (this.S == 2) {
               var9 = Message.c((byte)10);
            } else if (this.S == 1) {
               var9 = Message.c((byte)5);
            } else {
               var9 = Message.c((byte)4);
            }

            var9.a(this.R);
            var9.l();
            this.k();
            return;
         } catch (Exception var6) {
         }
      }

   }

   public final void d() {
      super.d();
   }

   public final Vector g() {
      Vector var1 = new Vector();
      DataCenter.d().aA.b();
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (this.l == null) {
         if (var1.b >= 100 && var1.b < 108) {
            this.R = var1.b - 100;
            this.a(3, this.objX, DataCenter.d().o + 20 + this.N + 5);
            this.a.K = true;
            VDTT_ac var4;
            if (!(var4 = VDTT_ac.b()).a) {
               var4.a(69, 1.0F);
            }
         }

      }
   }
}
