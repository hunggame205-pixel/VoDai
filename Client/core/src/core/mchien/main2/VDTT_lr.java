package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import java.io.File;
import java.util.Vector;

public final class VDTT_lr extends VDTT_ar {
   private VDTT_bd a;
   private VDTT_bd b;
   private VDTT_bd c;
   private VDTT_bd d;
   private VDTT_bd N;
   private VDTT_ho O;
   private VDTT_ho P;
   private VDTT_iq Q;
   private int R = 2;
   private VDTT_bu[] S;
   private VDTT_ho T;
   private int U;
   private VDTT_bf[] V;

   public VDTT_lr(VDTT_p var1) {
      this.I = var1;
      this.a(280, 224);
      VDTT_hp var4;
      if (Gdx.app.getType() == ApplicationType.Desktop) {
         var4 = new VDTT_hp(2000, Caption.AE);
      } else {
         String[] var5 = new String[]{Caption.AE[0], Caption.AE[1]};
         var4 = new VDTT_hp(2000, var5);
      }

      this.Q = new VDTT_iq(var4, 4, this.f(), super.q - 8, 23, 60, this);
      this.a = this.a(15, 63, Caption.co, 1001);
      VDTT_bd var10000 = this.a;
      boolean var3 = VDTT_eq.a().a(1);
      var10000.m = var3;
      this.b = this.a(15, 83, Caption.cp, 1002);
      var10000 = this.b;
      var3 = VDTT_eq.a().a(0);
      var10000.m = var3;
      this.c = this.a(140, 63, Caption.cH, 1004);
      var10000 = this.c;
      var3 = VDTT_eq.a().a(11);
      var10000.m = var3;
      this.N = this.a(140, 83, Caption.ds, 1007);
      var10000 = this.N;
      var3 = VDTT_eq.a().a(36);
      var10000.m = var3;
      this.V = new VDTT_bf[2];
      var4 = new VDTT_hp(600, Caption.Bj);
      VDTT_bf[] var10 = this.V;
      VDTT_d var2 = VDTT_d.g();
      var10[0] = this.a(140, 108, 105, VDTT_l.b() ? 4 : 6, var4, this, 0);
      this.V[0].a(VDTT_eq.a().b(25));
      var4 = new VDTT_hp(1000, new String[]{Caption.cE, Caption.cF});
      if (Gdx.app.getType() == ApplicationType.Desktop) {
         var4 = new VDTT_hp(1000, new String[]{Caption.cE, Caption.cF, Caption.pG});
      }

      this.V[1] = this.a(15, 108, 105, var4.c.length, var4, this, 0);
      this.V[1].a(VDTT_eq.a().b(9));
      this.O = new VDTT_ho(1005, 1);
      this.P = new VDTT_ho(1006, VDTT_eq.a().b(20));
      short[] var6;
      byte var8;
      if ((var6 = VDTT_jb.h())[0] == 400 && var6[1] == 240) {
         var8 = 0;
         this.O.b = var8;
      } else if (var6[0] == 800 && var6[1] == 480) {
         var8 = 1;
         this.O.b = var8;
      } else if (var6[0] == 960 && var6[1] == 640) {
         var8 = 2;
         this.O.b = var8;
      } else if (var6[0] == 1024 && var6[1] == 600) {
         var8 = 3;
         this.O.b = var8;
      } else if (var6[0] == 1200 && var6[1] == 720) {
         var8 = 4;
         this.O.b = var8;
      }

      if (Gdx.app.getType() == ApplicationType.Desktop) {
         this.Q.a(this.a(15, 78, Caption.AF[0], this, this.O), 2);
         this.Q.a(this.a(15, 100, Caption.AF[1], this, this.O), 2);
         this.Q.a(this.a(15, 122, Caption.AF[2], this, this.O), 2);
         this.Q.a(this.a(15, 144, Caption.AF[3], this, this.O), 2);
         this.Q.a(this.a(15, 166, Caption.AF[4], this, this.O), 2);
      }

      this.R = this.O.b;
      this.T = new VDTT_ho(100);
      this.U = VDTT_eq.a().b(2);
      int var9 = this.U;
      this.T.b = var9;
      switch(DataCenter.d().p) {
      case 1:
         this.S = new VDTT_bu[1];
         this.S[0] = this.a(15, 90, Caption.jo, this, this.T);
         break;
      case 2:
         this.S = new VDTT_bu[3];
         this.S[0] = this.a(15, 115, Caption.jp, this, this.T);
         this.S[1] = this.a(15, 140, Caption.jo, this, this.T);
         this.S[2] = this.a(15, 90, Caption.jq, this, this.T);
         break;
      case 3:
         this.S = new VDTT_bu[4];
         this.S[0] = this.a(15, 115, Caption.jq, this, this.T);
         this.S[1] = this.a(15, 140, Caption.jp, this, this.T);
         this.S[2] = this.a(15, 165, Caption.jo, this, this.T);
         this.S[3] = this.a(15, 90, Caption.jr, this, this.T);
         break;
      case 4:
      case 5:
      case 6:
         this.S = new VDTT_bu[3];
         this.S[0] = this.a(15, 90, Caption.jq, this, this.T);
         this.S[1] = this.a(15, 115, Caption.jp, this, this.T);
         this.S[2] = this.a(15, 140, Caption.jo, this, this.T);
      }

      int var7;
      if (this.T.b <= 0 || this.T.b >= this.S.length) {
         var8 = 0;
         this.T.b = var8;
         this.U = 0;
         VDTT_eq.a().a(2, this.U);

         VDTT_bu var11;
         for(var7 = 0; var7 < this.S.length; ++var7) {
            var11 = this.S[var7];
            var3 = false;
            var11.l = var3;
         }

         var11 = this.S[this.T.b];
         var3 = true;
         var11.l = var3;
      }

      for(var7 = 0; var7 < this.S.length; ++var7) {
         this.Q.a(this.S[var7], 1);
      }

      this.Q.a(this.a, 0);
      this.Q.a(this.b, 0);
      this.Q.a(this.c, 0);
      this.Q.a(this.N, 0);
      this.Q.a(this.V[0], 0);
      this.Q.a(this.V[1], 0);
      this.Q.a(0);
   }

   public final void b(int var1, Object var2) {
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      boolean var9;
      switch(var1.b) {
      case 2000:
         if (var1.j.k >= 0) {
            this.Q.a(var1.j.k);
            return;
         }
         break;
      case 2001:
         var9 = !this.d.m;
         this.d.m = var9;

         try {
            File var7 = new File(System.getProperty("user.dir") + "/jre/bin/opengl32.dll");
            File var11 = new File(System.getProperty("user.dir") + "/jre/bin/opengl32.backup");
            boolean var10 = false;
            if (this.d.m) {
               if (var7.exists()) {
                  var10 = var7.renameTo(var11);
               }
            } else if (var11.exists()) {
               var10 = var11.renameTo(var7);
            }

            if (var10) {
               VDTT_eq.a().a(20, this.d.m);
               VDTT_d.g().a(false);
            }

            return;
         } catch (Exception var5) {
            VDTT_jb.a(var5);
            return;
         }
      case 2002:
         VDTT_bu var12;
         for(int var6 = 0; var6 < this.S.length; ++var6) {
            var12 = this.S[var6];
            var9 = false;
            var12.l = var9;
         }

         VDTT_eq.a().a(2, this.U);
         var12 = this.S[VDTT_eq.a().b(2)];
         var9 = true;
         var12.l = var9;
         VDTT_dg.b();
         VDTT_da.a(true);
         return;
      case 2003:
         this.U = this.T.b;
         return;
      case 2004:
         return;
      case 2005:
         return;
      case 2006:
      default:
         break;
      case 2007:
         VDTT_ho var10000 = this.P;
         byte var8 = VDTT_eq.a().b(20);
         var10000.b = var8;
      }

   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      VDTT_bu var10000;
      boolean var5;
      switch(var1) {
      case 100:
         if (this.T.b != this.U) {
            var1 = this.U;
            this.U = this.T.b;

            for(int var16 = 0; var16 < this.S.length; ++var16) {
               var10000 = this.S[var16];
               var5 = false;
               var10000.l = var5;
            }

            var10000 = this.S[VDTT_eq.a().b(2)];
            var5 = true;
            var10000.l = var5;
            this.T.b = var1;
            DataCenter.d().ai.a(Caption.jt, 2002, 2003, this);
            return;
         }
         break;
      case 102:
         return;
      case 600:
         VDTT_eq.a().a(25, this.V[0].n.b);
         Graphics.d();
         break;
      case 1000:
         VDTT_eq.a().a(9, this.V[1].n.b);
         return;
      case 1001:
         VDTT_ac.b().c(this.a.m);
         return;
      case 1002:
         VDTT_ac.b().b(this.b.m);
         return;
      case 1004:
         VDTT_eq.a().a(11, this.c.m);
         return;
      case 1005:
         VDTT_lr var13 = this;
         if (this.R != this.O.b) {
            boolean var15;
            if (var15 = this.R == 0) {
               try {
                  var13.U = 1;
                  VDTT_eq.a().a(2, var13.U);

                  for(int var17 = 0; var17 < var13.S.length; ++var17) {
                     var10000 = var13.S[var17];
                     var5 = false;
                     var10000.l = var5;
                  }

                  var10000 = var13.S[VDTT_eq.a().b(2)];
                  var5 = true;
                  var10000.l = var5;
               } catch (Exception var12) {
               }
            }

            var13.R = var13.O.b;
            short[] var18 = new short[]{1024, 600};
            switch(var13.O.a()) {
            case 0:
               var18 = new short[]{400, 240};
               var15 = true;
               break;
            case 1:
               var18 = new short[]{800, 480};
               break;
            case 2:
               var18 = new short[]{960, 640};
               break;
            case 3:
               var18 = new short[]{1024, 600};
               break;
            case 4:
               var18 = new short[]{1200, 720};
            }

            if (var15) {
               VDTT_dg.b();
               VDTT_da.a(true);
            }

            VDTT_df var14 = null;
            boolean var9 = false;

            label186: {
               label185: {
                  try {
                     var9 = true;
                     (var14 = new VDTT_df()).b(var18[0]);
                     var14.b(var18[1]);
                     VDTT_jb.a("arr_sc", var14.a.toByteArray());
                     var9 = false;
                     break label185;
                  } catch (Exception var10) {
                     var9 = false;
                  } finally {
                     if (var9) {
                        if (var14 != null) {
                           var14.a();
                        }

                     }
                  }

                  if (var14 != null) {
                     var14.a();
                  }
                  break label186;
               }

               var14.a();
            }

            Gdx.graphics.setWindowedMode(var18[0], var18[1]);
            if (Gdx.app.getType() == ApplicationType.Desktop) {
               VDTT_d.g().a(false);
            }

            VDTT_d.g().d();
            if (VDTT_cw.w() != null) {
               VDTT_cw.v().aR = null;
            }
         }

         return;
      case 1006:
         var5 = !this.d.m;
         this.d.m = var5;
         this.I.a(Caption.rs, 2001, this);
         return;
      case 1007:
         VDTT_eq.a().a(28, this.N.m);
         return;
      }

   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.zz[3], (byte)2);
      this.Q.a(var1);
      switch(this.Q.h()) {
      case 1:
         VDTT_dg.b(VDTT_dg.d, var1, Caption.jv, this.S[0].objX, 62, 0, -1, -16777216);
         VDTT_dg.b(VDTT_dg.d, var1, Caption.jw, this.S[0].objX, 75, 0, -1, -16777216);
         return;
      case 2:
         String[] var10002 = Caption.AF;
         VDTT_dg.b(VDTT_dg.d, var1, var10002[var10002.length - 1], 14, 65, 0, -1, -16777216);
      default:
      }
   }

   public final void a_() {
      if (this.Q != null) {
         this.Q.e();
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.Q.f());
      return var1;
   }
}
