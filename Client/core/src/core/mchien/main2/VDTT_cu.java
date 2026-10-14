package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import java.util.Vector;

public final class VDTT_cu extends VDTT_cf {
   private VDTT_v J;
   private VDTT_ba K;
   private VDTT_ba L;
   private VDTT_ba M;
   private int N;
   private int O;
   private int P = 0;
   private int Q;
   private int R;
   private static VDTT_cu S;
   private long T;
   private final VDTT_ba U;

   public VDTT_cu() {
      S = this;
      this.N = this.q / 2;
      this.O = this.r / 2;
      this.Q = this.N - 25;
      this.R = this.O;
      this.K = this.a(this.N - 60, this.R + 10, "", this, 1004, -10);
      this.L = this.a(this.K.objX + this.K.q + 5, this.K.objY + 2, "", this, 1004, 12);
      if (DataCenter.l()) {
         this.K.b(true);
         this.L.b(true);
         this.M = this.a(this.N - 67, this.R, Caption.aa, this, 1001, 7);
         this.M.d(134, 28);
         this.U = this.a(this.M.objX, this.M.objY + this.M.r + 8, Caption.Ax[5], this, 1008, -29);
         this.U.d(65, this.U.r);
         if (Gdx.app.getType() == ApplicationType.Android) {
            this.U.d(134, this.U.r);
         } else if (Gdx.app.getType() == ApplicationType.iOS) {
            this.a(this.M.objX + this.U.q + 4, this.M.objY + this.M.r + 8, Caption.Ax[8], this, 1013, -29).d(65, this.U.r);
         }
      } else {
         this.M = this.a(this.N - 40, this.R + 50, Caption.aa, this, 1001, 7);
         this.a(this.q - VDTT_jb.n(40 + VDTT_d.g().m / 2), this.r - VDTT_jb.n(30), Caption.Ax[1], this, 1011, 681);
         this.a(this.q - VDTT_jb.n(40 + VDTT_d.g().m / 2), this.r - VDTT_jb.n(60), Caption.Ax[2], this, 1007, 680);
         this.a(this.q - VDTT_jb.n(40 + VDTT_d.g().m / 2), this.r - VDTT_jb.n(90), Caption.Ax[8], this, 1013, -52);
         this.U = this.a(this.q - VDTT_jb.n(40 + VDTT_d.g().m / 2), this.r - VDTT_jb.n(120), Caption.Ax[5], this, 1008, -679);
      }

      DataCenter.d().i();
   }

   public final void j() {
   }

   public final void a_() {
      super.a_();
      VDTT_ba var10000 = this.K;
      String var2 = DataCenter.d().aC.b();
      var10000.l = var2;
      if (DataCenter.aj) {
         this.L.b(true);
         this.K.a(true);
         this.K.f(this.N - this.K.q / 2, this.K.objY);
      }

      long var1 = System.currentTimeMillis();
      if (DataCenter.aD > 0 && !DataCenter.d().aP) {
         if (var1 - this.T > 15000L) {
            this.T = var1;
            v();
            return;
         }

         if (((var1 - this.T) / 1000L + 2L) % 5L == 0L) {
            this.a(Caption.qw, (int)(16L - (var1 - this.T) / 1000L));
         }
      }

   }

   public final void c() {
   }

   public final void b(Graphics var1) {
      if (VDTT_d.g().f > 0) {
         --VDTT_d.g().f;
         if (VDTT_d.g().f == 0) {
            DataCenter.d().g();
            return;
         }
      }

      super.b(var1);
      var1.a(this.objX, this.objY);
      b(var1, this.M.objX + this.M.q / 2 - 10, this.O);
      if (!DataCenter.l()) {
         VDTT_dg.a(var1, Caption.fL + VDTT_jb.e(DataCenter.d().v), this.q - 8 - VDTT_d.g().m / 2, 8, 1, -1);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.mV, this.M.objX + this.M.q / 2, this.K.objY - 12, 2, -2560, -16742145);
      }

      VDTT_ac.b().b(-1);
      if (VDTT_ae.B) {
         VDTT_dg.a(VDTT_dg.e, var1, Caption.uM, DataCenter.d().n / 2, DataCenter.d().o - VDTT_jb.n(45), 2, -2560, 2, 1);
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (this.J != null) {
         var1.add(new VDTT_hl(2004, 5, this.r - 80, 5 + this.J.c / 4, this.r - 80 + this.J.d / 4, (VDTT_hs)null, this));
      }

      var1.add(new VDTT_hl(2000, 0, 0, this.q, this.r, (VDTT_hs)null, this));
      return var1;
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      if (var1 != 1010) {
         this.P = -1;
      }

      switch(var1) {
      case 1001:
         DataCenter.d().aP = false;
         if (VDTT_d.g().i != null) {
            try {
               for(var1 = 0; var1 < 10; ++var1) {
                  if (VDTT_dn.a().c()) {
                     VDTT_jb.a(100L);
                  }
               }

               if (!VDTT_dn.a().c()) {
                  DataCenter.d().a = DataCenter.d().aC.c;
                  DataCenter.d().b = DataCenter.d().aC.d;
                  VDTT_dn.a();
               }
            } catch (Exception var5) {
            }

            v();
            return;
         }

         VDTT_d.g().k();
         break;
      case 1002:
         short[] var7;
         if (DataCenter.aj) {
            var7 = new short[]{1, 2, 5};
         } else {
            var7 = new short[]{1, 2, 3, 4, 5};
         }

         String[] var8 = new String[var7.length];

         for(int var9 = 0; var9 < var8.length; ++var9) {
            var8[var9] = Caption.Aj[var7[var9]];
         }

         this.a(new VDTT_ls(this, new VDTT_hp(0, var7, var8), 0));
         return;
      case 1003:
      default:
         break;
      case 1004:
         this.a(new VDTT_mh(DataCenter.d().aC, this, 1005));
         return;
      case 1005:
         if (VDTT_dn.a().c()) {
            DataCenter.d().ay = true;
            VDTT_dn.a().b();
         }

         DataCenter.d().a((VDTT_hz)var2);
         return;
      case 1006:
         this.a(new VDTT_jy(this));
         return;
      case 1007:
         this.a(new VDTT_lr(this));
         return;
      case 1008:
         this.a(Caption.so, 2003, this);
         return;
      case 1009:
         try {
            Message.c((byte)-121).k();
            break;
         } catch (Exception var4) {
            VDTT_jb.a(var4);
            return;
         }
      case 1010:
         if (this.P > 0) {
            this.P = -1;
            return;
         }

         this.P = 1;
         return;
      case 1011:
         DataCenter.d().ai.a(Caption.cs, 2001, this);
         return;
      case 1012:
         this.a(new VDTT_lf(this));
         return;
      case 1013:
         VDTT_d var6 = VDTT_d.g();
         VDTT_d.g();
         new VDTT_k(var6);
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 2000:
         this.P = -1;
         return;
      case 2001:
         VDTT_da.a(true);
         return;
      case 2003:
         VDTT_d.g().j();
         return;
      case 2004:
         DataCenter.d().ai.a(Caption.xQ, 2005, this);
         return;
      case 2005:
         VDTT_da.a("arr_s_game.bin", "0");
         VDTT_d.g().h.a();
      case 2002:
      default:
      }
   }

   public static void v() {
      DataCenter.d().ai.i();
      (new Thread(new VDTT_cv())).start();
   }
}
