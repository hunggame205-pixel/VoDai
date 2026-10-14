package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import core.mchien.listener.LoginCallback;
import java.util.Vector;

public final class VDTT_cq extends VDTT_cf implements LoginCallback {
   public VDTT_ct J;
   public VDTT_ca K;
   private VDTT_ba M;
   private VDTT_ba N;
   private int O;
   private int P;
   private int Q = 0;
   private int R;
   private int S;
   Vector L;
   private Vector T;
   private static VDTT_cq U;
   private long V;
   private VDTT_cs W;
   private int X;
   private int Y;
   private VDTT_ba Z;
   private VDTT_ba aa;
   private int ab;
   private boolean ac;
   private static String[] ad;

   public static VDTT_cf v() {
      if (VDTT_dn.a().c()) {
         VDTT_dn.a().b();
      }

      return w();
   }

   public static VDTT_cf w() {
      //todo fix screenlogin
//      return (VDTT_cf)(Gdx.app.getType() == ApplicationType.Desktop ? new VDTT_cq() : new VDTT_cu());
      return new VDTT_cq();
   }

   VDTT_cq() {
      U = this;
      this.O = this.q / 2;
      this.P = this.r / 2;
      this.R = this.O - 60;
      this.S = this.P - 20;
      if (DataCenter.d().o <= 240) {
         this.ab = -10;
      }

      this.S += this.ab;
      this.J = new VDTT_ct(this, this.R, this.P - 27 + 25 + this.ab, 122, Caption.yf[1], this, -11, 0);
      this.a((VDTT_m)this.J);
      byte var1 = 50;
      this.J.l = var1;
      this.K = this.a(this.R, this.P - 27 + 50 + this.ab, 122, Caption.yg[1], this, 1);
      var1 = 50;
      this.K.l = var1;
      VDTT_cq var10 = this;
      this.L = new Vector();
      VDTT_de var2 = null;

      try {
         if ((var2 = VDTT_da.a("arr_acc")) != null) {
            short var3 = var2.a.readShort();

            for(int var4 = 0; var4 < var3; ++var4) {
               String[] var5;
               (var5 = new String[2])[0] = VDTT_jb.e(var2.c());
               var5[1] = VDTT_jb.e(var2.c());
               var10.L.add(var5);
            }
         }
      } catch (Exception var8) {
         VDTT_jb.a(var8);
      } finally {
         if (var2 != null) {
            var2.d();
         }

      }

      if (ad != null) {
         this.a(this.J.objX + this.J.q + 2, this.J.objY + 3, "", this, 1013, 12);
         this.a(ad);
      } else if (this.L.size() > 0) {
         this.a(this.J.objX + this.J.q + 2, this.J.objY + 3, "", this, 1013, 12);
         this.a(this.x());
      }

      if (!VDTT_jb.j(VDTT_d.g().k) && !VDTT_jb.j(VDTT_d.g().l)) {
         this.J.a(VDTT_d.g().k);
         this.K.a(VDTT_d.g().l);
         VDTT_d var10000 = VDTT_d.g();
         String var11 = "";
         var10000.k = var11;
         var10000 = VDTT_d.g();
         var11 = "";
         var10000.l = var11;
      }

      this.Z = this.a(this.J.objX + 10, this.P - 25 + 80 + this.ab, Caption.aa, this, 1001, 7);
      this.Z.d(90, this.Z.r);
      this.Z.f(this.J.objX + this.J.q / 2 - this.Z.q / 2, this.Z.objY);
      this.M = this.a(this.R, this.P - 25 - 2 + this.ab, "", this, 1004, -10);
      this.M.d(this.M.q + 20, this.M.r);
      this.N = this.a(this.M.objX + this.M.q + 2, this.P - 25 + 1 + this.ab, "", this, 1004, 12);
      this.aa = this.a(this.J.objX + 26, this.Z.objY + 25, Caption.qc, this, 2002, -29);
      this.aa.d(90, this.aa.r);
      this.aa.f(this.J.objX + this.J.q / 2 - this.aa.q / 2, this.aa.objY);
      this.a(this.q - VDTT_jb.n(40 + VDTT_d.g().m / 2), this.r - VDTT_jb.n(30), Caption.Ax[1], this, 1011, 681);
      this.a(this.q - VDTT_jb.n(40 + VDTT_d.g().m / 2), this.r - VDTT_jb.n(60), Caption.Ax[2], this, 1007, 680);
      DataCenter.d().i();
      this.B();
   }

   private void a(String[] var1) {
      if (var1 == null) {
         this.J.a("");
         this.K.a("");
      } else {
         if (this.L.remove(var1)) {
            this.L.add(var1);
         }

         this.J.a(var1[0]);
         this.K.a(var1[1]);
      }
   }

   public final String[] x() {
      if (ad != null) {
         return ad;
      } else {
         if (!VDTT_jb.j(VDTT_d.g().k) && !VDTT_jb.j(VDTT_d.g().l)) {
            ad = new String[]{VDTT_d.g().k, VDTT_d.g().l};
         } else if (!this.L.isEmpty()) {
            ad = (String[])this.L.lastElement();
         } else {
            ad = new String[]{this.J.i().trim(), this.K.i().trim()};
         }

         return ad;
      }
   }

   public static VDTT_cq y() {
      return U;
   }

   public final void j() {
   }

   public final void a_() {
      super.a_();
      if (this.Y > 0) {
         --this.Y;
         if (this.Y == 0) {
            this.B();
         }
      }

      VDTT_ba var10000 = this.M;
      String var2 = DataCenter.d().aC.b();
      var10000.l = var2;
      long var1 = System.currentTimeMillis();
      if (!DataCenter.d().aP && !DataCenter.d().f) {
         if (this.W != null) {
            if (var1 - this.V > 5000L) {
               this.V = var1;
               VDTT_ek.m().aD = this.W.c;
               DataCenter.aD = 1;
               MenuConfig.d = this.W.d;
               MenuConfig.N = this.W.e;
               MenuConfig.O = this.W.f;
               this.J.a(this.W.a);
               this.K.a(this.W.b);
               this.A();
               this.b((String) Caption.sk);
               ++this.X;
               if (this.X > 10) {
                  this.W = null;
                  return;
               }
            }
         } else if (DataCenter.aD > 0) {
            if (var1 - this.V > 15000L) {
               this.V = var1;
               this.A();
               return;
            }

            if (((var1 - this.V) / 1000L + 2L) % 5L == 0L) {
               this.a(Caption.qw, (int)(16L - (var1 - this.V) / 1000L));
            }
         }
      }

   }

   public final void k() {
      this.a(Caption.jB, 2002, this);
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
      //b(var1, this.J.objX + this.J.q / 2 - 15, this.P - 25 + this.ab / 2);
      if (DataCenter.aj && !VDTT_d.h()) {
         this.M.b(true);
         this.N.b(true);
      } else {
         VDTT_dg.b(VDTT_dg.e, var1, Caption.yg[2], this.J.objX - 10, this.S + VDTT_dg.a(VDTT_dg.e) / 2 - 3, 1, -6488, -10275328);
      }

      VDTT_dg.b(VDTT_dg.e, var1, Caption.yf[0], this.J.objX - 10, this.S + VDTT_dg.a(VDTT_dg.e) / 2 - 3 + 25, 1, -6488, -10275328);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.yg[0], this.J.objX - 10, this.S + 25 + VDTT_dg.a(VDTT_dg.e) / 2 - 3 + 25, 1, -6488, -10275328);
      if (!DataCenter.l()) {
         VDTT_dg.a(var1, Caption.fL + VDTT_jb.e(DataCenter.d().v), this.q - 8 - VDTT_d.g().m / 2, 8, 1, -1);
      }

      if (this.Q == 2) {
         for(int var2 = 0; var2 < this.T.size(); ++var2) {
            VDTT_ba var3;
            if ((var3 = (VDTT_ba)this.T.elementAt(var2)).d()) {
               VDTT_dg.b(VDTT_dg.d, var1, Caption.zz[var2], var3.objX - 4, var3.objY + 9, 1, -6488, -10275328);
            } else {
               VDTT_dg.b(VDTT_dg.d, var1, Caption.zz[var2], var3.objX - 5, var3.objY + 8, 1, -6488, -10275328);
            }
         }
      }

      VDTT_ac.b().b(-1);
      if (VDTT_ae.B) {
         VDTT_dg.a(VDTT_dg.e, var1, Caption.uM, DataCenter.d().n / 2, DataCenter.d().o - VDTT_jb.n(45), 2, -2560, 2, 1);
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).add(new VDTT_hl(2000, 0, 0, this.q, this.r, (VDTT_hs)null, this));
      return var1;
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      if (var1 != 1010) {
         this.Q = -1;
      }

      switch(var1) {
      case 1001:
         String var7 = this.J.i().trim().toLowerCase();
         String var9 = this.K.i().trim();
         this.a(var7, var9, true);
         this.ac = false;
         DataCenter.d().aP = false;
         this.A();
         return;
      case 1002:
         short[] var5;
         if (DataCenter.aj) {
            var5 = new short[]{1, 2};
         } else {
            var5 = new short[]{1, 2, 3, 4};
         }

         String[] var6 = new String[var5.length];

         for(int var8 = 0; var8 < var6.length; ++var8) {
            var6[var8] = Caption.Aj[var5[var8]];
         }

         this.a((MainScreen)(new VDTT_ls(this, new VDTT_hp(0, var5, var6), 0)));
         return;
      case 1004:
         this.a((MainScreen)(new VDTT_mh(DataCenter.d().aC, this, 1005)));
         return;
      case 1005:
         if (VDTT_dn.a().c()) {
            DataCenter.d().ay = true;
            VDTT_dn.a().b();
         }

         DataCenter.d().a((VDTT_hz)var2);
         return;
      case 1006:
         this.a((MainScreen)(new VDTT_jy(this)));
         return;
      case 1007:
         this.a((MainScreen)(new VDTT_lr(this)));
         return;
      case 1008:
         this.a((MainScreen)(new VDTT_lg(this)));
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
         if (this.Q > 0) {
            this.Q = -1;
            return;
         }

         this.Q = 1;
         return;
      case 1011:
         DataCenter.d().ai.a(Caption.cs, 2001, this);
         return;
      case 1012:
         this.a((MainScreen)(new VDTT_lf(this)));
         return;
      case 1013:
         this.a((MainScreen)(new VDTT_jf(this.L, this, 1014, this.J.i())));
         return;
      case 1014:
         this.a((String[])var2);
         return;
      case 2002:
         this.a((MainScreen) (new VDTT_mc(this)));
         return;
      case 9001:
         VDTT_jb.g();
         VDTT_d.g().g.a((LoginCallback)this);
         return;
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 2000:
         this.Q = -1;
         return;
      case 2001:
         VDTT_da.a(true);
         return;
      case 2002:
         VDTT_d.g();
         VDTT_d.i();
      default:
      }
   }

   private void B() {
    if ((DataCenter.d()).aP)
      return; 
    VDTT_de vDTT_de = null;
    try {
      if ((vDTT_de = VDTT_da.a("arr_reset")) != null) {
        String str = VDTT_jb.e(vDTT_de.c());
        VDTT_cs vDTT_cs1;
        VDTT_cs vDTT_cs6;
        (vDTT_cs6 = vDTT_cs1 = new VDTT_cs(this, null)).a = str;
        str = VDTT_jb.e(vDTT_de.c());
        (vDTT_cs6 = vDTT_cs1).b = str;
        str = VDTT_jb.e(vDTT_de.c());
        (vDTT_cs6 = vDTT_cs1).c = str;
        str = vDTT_de.c();
        (vDTT_cs6 = vDTT_cs1).g = str;
        VDTT_de vDTT_de5;
        short s = (vDTT_de5 = vDTT_de).a.readShort();
        VDTT_cs vDTT_cs5;
        (vDTT_cs5 = vDTT_cs1).h = s;
        VDTT_de vDTT_de4;
        int i = (vDTT_de4 = vDTT_de).a.readInt();
        VDTT_cs vDTT_cs4;
        (vDTT_cs4 = vDTT_cs1).d = i;
        VDTT_de vDTT_de3;
        i = (vDTT_de3 = vDTT_de).a.readInt();
        VDTT_cs vDTT_cs3;
        (vDTT_cs3 = vDTT_cs1).e = i;
        VDTT_de vDTT_de2;
        i = (vDTT_de2 = vDTT_de).a.readInt();
        VDTT_cs vDTT_cs2;
        (vDTT_cs2 = vDTT_cs1).f = i;
        VDTT_de vDTT_de1;
        i = (vDTT_de1 = vDTT_de).a.readShort();
        this.ac = false;
        if (i == 0) {
          VDTT_da.k("arr_reset" + VDTT_aa.a());
          this.W = vDTT_cs1;
          try {
            if ((i = (vDTT_de1 = vDTT_de).a.readShort()) > 0) {
              VDTT_hz vDTT_hz;
              VDTT_cs vDTT_cs;
              (vDTT_hz = new VDTT_hz()).c = (vDTT_cs = vDTT_cs1).g;
              vDTT_hz.d = (vDTT_cs = vDTT_cs1).h;
              vDTT_hz.b = vDTT_de.c();
              DataCenter.d().a(vDTT_hz);
              return;
            } 
          } catch (Exception exception) {}
          try {
            for (i = 0; i < (DataCenter.d()).ag.length; i++) {
              for (byte b = 0; b < ((DataCenter.d()).ag[i]).b.length; b++) {
                VDTT_hz vDTT_hz;
                VDTT_cs vDTT_cs;
                if ((vDTT_hz = ((DataCenter.d()).ag[i]).b[b]).c.toLowerCase().equals((vDTT_cs = vDTT_cs1).g.toLowerCase()) && vDTT_hz.d == (vDTT_cs = vDTT_cs1).h) {
                  DataCenter.d().a(vDTT_hz);
                  return;
                } 
              } 
            } 
          } catch (Exception exception) {}
        } else {
          this.Y = 20;
        } 
      } 
    } catch (Exception exception2) {
      Exception exception1;
      VDTT_jb.a(exception1 = null);
    } finally {
      if (vDTT_de != null)
        vDTT_de.d(); 
    } 
  }

   public final void a(String var1, String var2, boolean var3) {
      try {
         if (var1.length() > 0 && var2.length() > 0) {
            var3 = false;

            for(int var4 = 0; var4 < this.L.size(); ++var4) {
               String[] var5;
               if ((var5 = (String[])this.L.elementAt(var4))[0].equals(var1)) {
                  this.L.removeElementAt(var4);
                  var5[0] = var1;
                  var5[1] = var2;
                  this.L.add(var5);
                  ad = var5;
                  var3 = true;
                  break;
               }
            }

            if (!var3) {
               ad = new String[]{var1, var2};
               this.L.add(ad);
            }
         }
      } catch (Exception var6) {
         VDTT_jb.a(var6);
      }

      this.C();
   }

   private void C() {
      VDTT_df var1 = null;
      boolean var6 = false;

      label76: {
         try {
            var6 = true;
            (var1 = new VDTT_df()).b(this.L.size());

            for(int var2 = 0; var2 < this.L.size(); ++var2) {
               String[] var3 = (String[])this.L.elementAt(var2);
               var1.a(VDTT_jb.d(var3[0]));
               var1.a(VDTT_jb.d(var3[1]));
            }

            var1.b("arr_acc");
            var6 = false;
            break label76;
         } catch (Exception var7) {
            VDTT_jb.a(var7);
            var6 = false;
         } finally {
            if (var6) {
               if (var1 != null) {
                  var1.a();
               }

            }
         }

         if (var1 != null) {
            var1.a();
            return;
         }

         return;
      }

      var1.a();
   }

   public static void z() {
   }

   public final void A() {
      boolean var2;
      if (this.J.i().trim().length() == 0) {
         var2 = true;
         this.J.b = var2;
         DataCenter.d().ai.c(Caption.vp, -1);
      } else if (this.K.i().trim().length() == 0) {
         var2 = true;
         this.K.b = var2;
         DataCenter.d().ai.c(Caption.vp, -1);
      } else {
         this.i();
         (new Thread(new VDTT_cr(this))).start();
      }
   }

   public final void d(String var1) {
      this.J.a(var1);
      VDTT_jb.a(1000L);
      this.K.a("");
   }

   public final void a(String var1, String var2, String var3) {
      VDTT_d.g().i = var3;
      DataCenter var10000 = DataCenter.d();
      VDTT_cf var4 = w();
      var10000.ai = var4;
   }

   public final void a(String var1) {
   }

   // $FF: synthetic method
   static VDTT_ct a(VDTT_cq var0) {
      return var0.J;
   }

   // $FF: synthetic method
   static VDTT_ca b(VDTT_cq var0) {
      return var0.K;
   }

   // $FF: synthetic method
   static boolean c(VDTT_cq var0) {
      return var0.ac;
   }
}
