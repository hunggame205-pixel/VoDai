package core.mchien.main2;

import java.io.IOException;
import java.util.Vector;

public final class SelectCharScreen extends VDTT_p {
   public static String d = "";
   private VDTT_ca I;
   private Vector J = new Vector();
   private Vector K = new Vector();
   private int L;
   private int M;
   private int N;
   private int O;
   private Vector P = new Vector();
   private Vector Q = new Vector();
   private Vector R = new Vector();
   private Vector S = new Vector();
   private boolean T;
   private long U;
   private VDTT_ba V;
   private VDTT_ba W;
   private VDTT_ba X;
   private VDTT_ba Y;
   private VDTT_ba Z;
   private int aa;
   private int ab;
   private long ac;
   private VDTT_ae ad;
   private String[] ae = null;
   private VDTT_cj af;
   private int ag = -1;
   private int ah = -1;
   private int ai = -1;
   private VDTT_ev aj = new VDTT_ev(460, 0, 0, 1);
   private VDTT_ev[] ak = new VDTT_ev[]{new VDTT_ev(533, 0, 0, -1), new VDTT_ev(534, 0, 0, -1), new VDTT_ev(532, 0, 0, -1), new VDTT_ev(537, 0, 0, -1), new VDTT_ev(603, 0, 0, -1), new VDTT_ev(625, 0, 0, -1)};
   private int al = 0;
   private boolean am;
   private static byte an = 29;
   private static byte ao = 90;
   private VDTT_ic[] ap = new VDTT_ic[3];
   private boolean aq;

   public SelectCharScreen() {
      this.d(DataCenter.d().n, DataCenter.d().o);
      this.W = this.a(5, DataCenter.d().o - 23, "", this, 4000, 15);
      this.W.d(58, 20);
      this.V = this.a(DataCenter.d().n - this.W.q - 5, this.W.objY, "", this, 2008, -8);
      this.V.d(this.W.q, this.W.r);
      this.X = this.a(DataCenter.d().n / 2 - 28, this.W.objY, Caption.aa, this, 2009, -8);
      this.X.d(this.W.q, this.W.r);
      this.I = this.a(DataCenter.d().n / 2 - 60, this.r - 46, 122, Caption.as, this, 0);
      byte var4 = 12;
      this.I.l = var4;
      this.aa = DataCenter.d().n / 2 - 85;
      this.Z = this.a(this.aa, DataCenter.d().o - 110, "", this, 2005, -91);
      short var6 = -360;
      this.Z.K = var6;
      this.ab = DataCenter.d().n / 2 + 62;
      this.Y = this.a(this.ab, DataCenter.d().o - 110, "", this, 2006, -91);
      this.Q.clear();

      int var1;
      for(var1 = 0; var1 < w().length; ++var1) {
         VDTT_cj var2;
         VDTT_cj var10000 = var2 = new VDTT_cj(this, (VDTT_ci)null);
         VDTT_ek var7 = new VDTT_ek();
         var10000.a = var7;
         var2.a.av = (byte)(var1 + 1);
         var2.a.aD = w()[var1];
         var2.a.m = (byte)var1;
         var2.a.ag = var2.a.ai = 1;
         var2.a.e = 0;
         this.Q.add(var2);
      }

      VDTT_cw.v().d(VDTT_d.g().a.e(), VDTT_d.g().a.f());
      VDTT_cw.v().K();
      VDTT_cm.L = true;
      VDTT_d.g();
      this.ad = new VDTT_ae();
      this.ad.d(110, 58);
      if ((var1 = DataCenter.d().o / 2 - 108) < 10) {
         var1 = 10;
      }

      this.ad.f(DataCenter.d().n / 2 - this.ad.q / 2 + 14, var1);
      this.S = new Vector();
      this.S.addElement(new VDTT_ck(this, DataCenter.d().n / 2, DataCenter.d().o - 70, 1));
      this.S.addElement(new VDTT_ck(this, DataCenter.d().n / 2, DataCenter.d().o - 70, 2));
      this.S.addElement(new VDTT_ck(this, DataCenter.d().n / 2, DataCenter.d().o - 70, 3));
      this.S.addElement(new VDTT_ck(this, DataCenter.d().n / 2, DataCenter.d().o - 70, 4));

      for(int var5 = 0; var5 < this.S.size(); ++var5) {
         for(var1 = 0; var1 < 20; ++var1) {
            ((VDTT_ck)this.S.get(var5)).a();
         }
      }

   }

   private static String[] w() {
      return DataCenter.l() ? Caption.BL : Caption.yD;
   }

   public final void readListChar(Message var1)throws IOException{
      byte var2 = var1.b.a.readByte();
      this.P.clear();
      this.R.clear();

      try {
         for(int var3 = 0; var3 < var2; ++var3) {
            VDTT_cj var4;
            VDTT_cj var10000 = var4 = new VDTT_cj(this, (VDTT_ci)null);
            VDTT_ek var6 = new VDTT_ek(var1.b.a.readInt());
            var10000.a = var6;
            var4.a.a(var1);
            var4.a.objY = 0;
            var4.a.ag = var4.a.ai = 1;
            var4.a.e = 0;
            this.R.add(var4);
            this.P.add(var4);
         }
      } catch (Exception var7) {
      }

      this.M = 0;
      if (var2 > 0) {
         this.h(this.M);
         VDTT_ac.b().d(this.T);
      }

      if (this.R.isEmpty()) {
         this.a(true);
      }

   }

   public final void j() {
   }

   public final void k() {
      this.a(false);
   }

   private void g(int var1) {
      this.ah = 0;
      this.O = this.N = var1;
      this.R = this.Q;
      this.ae = VDTT_dg.b(VDTT_dg.d, w()[var1], this.ad.q + 10);
      VDTT_cj var5;
      if (this.R != null && this.R.size() > 0 && this.T && (var5 = (VDTT_cj)this.R.elementAt(var1)) != null && var5.a != null) {
         switch(var5.a.av) {
         case 1:
            this.ap[0] = DataCenter.d().T[699].a();
            this.ap[1] = DataCenter.d().T[713].a();
            this.ap[2] = DataCenter.d().T[743].a();
            break;
         case 2:
            this.ap[0] = DataCenter.d().T[755].a();
            this.ap[1] = DataCenter.d().T[770].a();
            this.ap[2] = DataCenter.d().T[777].a();
            break;
         case 3:
            this.ap[0] = DataCenter.d().T[811].a();
            this.ap[1] = DataCenter.d().T[825].a();
            this.ap[2] = DataCenter.d().T[844].a();
            break;
         case 4:
            this.ap[0] = DataCenter.d().T[867].a();
            this.ap[1] = DataCenter.d().T[878].a();
            this.ap[2] = DataCenter.d().T[911].a();
            break;
         case 5:
            this.ap[0] = DataCenter.d().T[867].a();
            this.ap[1] = DataCenter.d().T[926].a();
            this.ap[2] = DataCenter.d().T[911].a();
         }

         if (DataCenter.l()) {
            for(int var2 = 0; var2 < this.ap.length; ++var2) {
               this.ap[var2] = DataCenter.d().T[854].a();
            }
         }

         boolean var6 = true;
         if (var5.e != null) {
            Object var4 = null;
            var5.e.m.aV = (VDTT_ii)var4;
            var5.e.m.bf.clear();
            var5.e.n.clear();
            var5.e.J.clear();
            var5.e = null;
         }

         this.ah = 0;
         this.ac = 0L;
         var5.f = 1;
         var5.e = new VDTT_bv(-this.objX, -this.objY, this.q, this.r, this, this.ap[1].a(), var5.a);
         var5.e.a(DataCenter.d().n / 2, DataCenter.d().o - 61);
      }

   }

   private void h(int var1) {
      this.ai = an + 5;
      this.M = this.O = var1;
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      if (this.ag < 0) {
         switch(var1) {
         case 2005:
            VDTT_ac.b().n();
            this.ah = 0;
            this.ac = 0L;
            if (this.T) {
               --this.N;
               if (this.N < 0) {
                  this.N = this.R.size() - 1;
               }

               this.g(this.N);
            } else {
               --this.M;
               if (this.M < 0) {
                  this.M = this.R.size() - 1;
               }

               this.h(this.M);
            }

            ((VDTT_cj)this.R.get(this.O)).a.aF = 3;
            VDTT_ac.b().d(this.T);
            return;
         case 2006:
            VDTT_ac.b().n();
            this.ah = 0;
            this.ac = 0L;
            if (this.T) {
               ++this.N;
               if (this.N >= this.R.size()) {
                  this.N = 0;
               }

               this.g(this.N);
            } else {
               ++this.M;
               if (this.M >= this.R.size()) {
                  this.M = 0;
               }

               this.h(this.M);
            }

            ((VDTT_cj)this.R.get(this.O)).a.aF = 2;
            ((VDTT_cj)this.R.get(this.O)).d = 0L;
            VDTT_ac.b().d(this.T);
            return;
         case 2008:
            if (this.T) {
               this.v();
               return;
            } else {
               if (this.P.size() > 0) {
                  this.x();
                  return;
               }

               this.ah = 0;
               this.ac = 0L;
               this.ag = this.ai = -1;
               this.T = true;
               this.g(VDTT_jb.a(this.Q.size()));
               VDTT_ac.b().d(this.T);
               VDTT_ac.b().p();
               return;
            }
         case 2009:
            this.x();
            return;
         case 4000:
            this.a(false);
            return;
         default:
         }
      }
   }

   private void a(boolean var1) {
      this.T = var1;
      if (var1) {
         VDTT_ac.b().u();
         VDTT_ac.b().p();
         VDTT_bv.L = null;
         if (DataCenter.l()) {
            this.g(0);
         } else {
            this.g(VDTT_jb.a(this.Q.size()));
         }
      } else {
         this.b(Caption.m).f.clear();
         VDTT_cm.K = true;
         DataCenter.d().aP = true;
         VDTT_d.g().f = 50;
         VDTT_ac.b().u();
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      if (VDTT_d.g().f > 0) {
         --VDTT_d.g().f;
         if (VDTT_d.g().f == 0) {
            DataCenter.d().g();
            return;
         }
      }

      VDTT_v var2;
      try {
         if (!DataCenter.n()) {
            var2 = (VDTT_v)VDTT_d.e.get(1);
            var1.a(var2, 0, 0, var2.c, var2.d, 0, (float)(0 - this.L), 0.0F, (float)(DataCenter.d().n * DataCenter.d().r), (float)(DataCenter.d().o * DataCenter.d().r), 0);
            var1.a(var2, 0, 0, var2.c, var2.d, 0, (float)(DataCenter.d().n - this.L), 0.0F, (float)(DataCenter.d().n * DataCenter.d().r), (float)(DataCenter.d().o * DataCenter.d().r), 0);
         } else {
            var2 = (VDTT_v)VDTT_d.e.get(1);
            var1.a(var2, 0, 0, var2.c, var2.d, 0, 0.0F, 0.0F, (float)(DataCenter.d().n * DataCenter.d().r), (float)(DataCenter.d().o * DataCenter.d().r), 0);
         }
      } catch (Exception var10) {
      }

      int var11;
      for(var11 = 0; var11 < this.K.size(); ++var11) {
         ((VDTT_ev)this.K.get(var11)).a(var1);
      }

      for(var11 = 0; var11 < this.J.size(); ++var11) {
         ((VDTT_er)this.J.get(var11)).a(var1);
      }

      int var3;
      if (!DataCenter.l()) {
         if ((var2 = (VDTT_v)VDTT_d.e.get(2)) != null) {
            if (DataCenter.l()) {
               var1.c(-150.0F);
               var1.a(var2, 0, 0, var2.c, var2.d, 0, (float)(DataCenter.d().n / 2), (float)(DataCenter.d().o + 32), (float)(var2.c * DataCenter.d().r / 4), (float)(var2.d * DataCenter.d().r / 4), 33);
               var1.r();
            } else {
               var1.a(var2, 0, 0, var2.c, var2.d, 0, (float)(DataCenter.d().n / 2), (float)(DataCenter.d().o + 32), (float)(var2.c * DataCenter.d().r / 4), (float)(var2.d * DataCenter.d().r / 4), 33);
            }
         }

         for(var3 = 0; var3 < this.S.size(); ++var3) {
            VDTT_ck var15 = (VDTT_ck)this.S.get(var3);
            Graphics var4 = var1;
            VDTT_ck var13 = var15;

            try {
               VDTT_v var5 = null;
               int var6 = 0;
               int var7 = 0;
               switch(var13.d) {
               case 1:
                  var6 = (var5 = (VDTT_v)VDTT_d.e.get(3)).c / 4;
                  var7 = var5.d / 4;
                  break;
               case 2:
                  var6 = (var5 = (VDTT_v)VDTT_d.e.get(4)).c / 4;
                  var7 = var5.d / 4;
                  break;
               case 3:
                  var6 = (var5 = (VDTT_v)VDTT_d.e.get(5)).c / 4;
                  var7 = var5.d / 4;
                  break;
               case 4:
                  var6 = (var5 = (VDTT_v)VDTT_d.e.get(6)).c / 4;
                  var7 = var5.d / 4;
               }

               var4.a(var5, 0, 0, var5.c, var5.d, 0, (float)((int)var13.a), (float)((int)var13.b), (float)(var6 * DataCenter.d().r), (float)(var7 * DataCenter.d().r), 33);
            } catch (Exception var9) {
            }
         }

         this.aj.a(var1);
      }

      if (this.T || !DataCenter.l()) {
         if (this.O >= 0 && this.O < this.R.size()) {
            var11 = DataCenter.d().n / 2;
            var3 = DataCenter.d().o - 61;
            VDTT_cj var12;
            (var12 = (VDTT_cj)this.R.get(this.O)).a.f(var11, var3);
            this.aj.f(var11, var3 - 30);
            this.ak[var12.a.m].f(var11 - 1, var3);
            if (var12.e != null) {
               var12.e.a(var11, var3);
               if (DataCenter.l()) {
                  this.a(var1, var12.a.objX - 50, var12.a.objY - 60, 100, 70, 61, 22, 23, 1, 1);
               }

               var12.e.b(var1);
            } else {
               if (!var12.c) {
                  var12.c = true;
                  var12.a.a(var1);
                  return;
               }

               if (!DataCenter.l() && (this.ag < -1 || this.ag >= 6)) {
                  if (this.ag < 12 && !this.aj.q()) {
                     this.aj.n();
                     this.aj.a(var1);
                  }
               } else {
                  var12.a.a(var1);
               }

               if (var12.b != null && !var12.b.q() && this.ah > 20 && this.ah < ao && !DataCenter.l()) {
                  var12.b.a(var1);
               }

               if (this.ai >= 5 && this.ai <= an && !DataCenter.l()) {
                  this.ak[var12.a.m].a(var1);
               }
            }

            if (!this.T) {
               VDTT_dg.b(VDTT_dg.d, var1, var12.a.aD, var11, var12.a.objY - 66, 2, -1, -16777216);
               if (var12.a.aC > 0L) {
                  if (var12.a.K == 53) {
                     var12.d += var12.a.aC / 30L;
                     if (var12.d > var12.a.aC) {
                        var12.d = var12.a.aC;
                     }
                  }

                  VDTT_dg.b(VDTT_dg.d, var1, Caption.tW + " " + VDTT_ek.a(var12.d), var11, var12.a.objY - 76, 2, -2560, -16777216);
               }
            } else if (!DataCenter.l()) {
               VDTT_dc.a(var1, 54, 0, this.ad.objX - 38, this.ad.objY - 1, 0);
               var11 = this.ad.objX + 5;
               var3 = this.ad.objY + 8;

               for(int var14 = 0; var14 < this.ae.length; ++var14) {
                  VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, this.ae[var14], var11, var3 + var14 * 10, 0, -4391166, 0);
               }

               if (!DataCenter.l() && (this.ah < ao || this.ah > ao + 60 || DataCenter.d().h % 16 < 8)) {
                  VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.sF + " " + VDTT_jb.c(this.ac), var11, 1 + var3 + this.ae.length * 10, 0, -4391166, 0);
               }
            }
         }

         if (VDTT_ae.B) {
            VDTT_dg.a(VDTT_dg.e, var1, Caption.uM, DataCenter.d().n / 2, DataCenter.d().o - VDTT_jb.n(52), 2, -2560, 2, 1);
         }

         VDTT_ac.b().b(-1);
      }
   }

   public final void c(int var1, int var2) {
      try {
         super.c(var1, var2);
         if (this.am && !this.T) {
            if (this.al == 0) {
               this.al = var1;
            } else {
               VDTT_cj var4;
               if (VDTT_jb.b(var1 - this.al) > 10 && (var4 = (VDTT_cj)this.R.get(this.O)) != null) {
                  var4.a.aF = (byte)(this.al < var1 ? 2 : 3);
               }

            }
         }
      } catch (Exception var3) {
      }
   }

   public final void a(int var1, int var2) {
      super.a(var1, var2);

      try {
         VDTT_cj var3;
         if ((var3 = (VDTT_cj)this.R.get(this.O)) == null || var3.a == null) {
            this.am = false;
            return;
         }

         this.am = VDTT_jb.a(var3.a.a(), var3.a.c(), var3.a.b(), var3.a.objY, var1, var2);
      } catch (Exception var5) {
      }

   }

   public final void b(int var1, int var2) {
      super.b(var1, var2);
      this.al = 0;
   }

   public final void a_() {
      int var10;
      try {
         if (DataCenter.l() && this.P.size() == 1) {
            this.V.b(true);
            this.W.b(true);
            this.X.b(true);
            this.Y.b(true);
            this.Z.b(true);
            this.I.b(true);
            if (!this.aq) {
               this.f(0);
               this.aq = true;
            }

            return;
         }

         long var1 = VDTT_jb.a();
         if (DataCenter.aD > 0 && var1 - this.U > 5000L) {
            this.U = var1;
            if (VDTT_ek.m().aD.length() == 0 && this.R.size() > 0) {
               DataCenter.aD = 2;
               this.f(0);
            } else {
               for(var10 = 0; var10 < this.R.size(); ++var10) {
                  if (((VDTT_cj)this.R.get(var10)).a.aD.toLowerCase().equals(VDTT_ek.m().aD.toLowerCase())) {
                     DataCenter.aD = 2;
                     this.f(var10);
                     break;
                  }
               }
            }
         }
      } catch (Exception var9) {
      }

      ++this.L;
      if (this.L == DataCenter.d().n) {
         this.L = 0;
      }

      for(var10 = 0; var10 < this.S.size(); ++var10) {
         ((VDTT_ck)this.S.get(var10)).a();
      }

      if (!DataCenter.n()) {
         if (DataCenter.d().h % 9 == 0 && VDTT_jb.a((int)2) == 0) {
            this.K.add(new VDTT_ev(VDTT_jb.a(new int[]{502, 505, 506}), VDTT_jb.a(DataCenter.d().n), VDTT_jb.a(DataCenter.d().o)));
         }

         if (DataCenter.d().h % 10 == 0 && VDTT_jb.a((int)3) == 0) {
            this.J.add(new VDTT_er(78, DataCenter.d().n + VDTT_jb.a(DataCenter.d().n), VDTT_jb.a((int)this.r), new VDTT_fb(-VDTT_jb.a(DataCenter.d().n), VDTT_jb.a((int)this.r)), -1, -1, false, this.J, new Vector()));
         }

         for(var10 = this.K.size() - 1; var10 >= 0; --var10) {
            VDTT_ev var2;
            (var2 = (VDTT_ev)this.K.get(var10)).n();
            --var2.objX;
            if (var2.q()) {
               this.K.remove(var2);
            }
         }

         for(var10 = this.J.size() - 1; var10 >= 0; --var10) {
            VDTT_er var11;
            (var11 = (VDTT_er)this.J.get(var10)).o();
            if (var11.n()) {
               this.J.remove(var11);
            }
         }
      }

      this.I.b(!this.T);
      String var4;
      VDTT_ba var10000;
      if (this.T) {
         this.X.b(true);
         var4 = Caption.sE;
         this.W.l = var4;
         var4 = Caption.aq;
         this.V.l = var4;
         if (VDTT_jb.b(this.q / 2 + 2 - this.V.objX) < 50) {
            this.V.objX = (short)(this.q / 2 + 2);
         } else if (this.V.objX < this.q / 2 + 2) {
            var10000 = this.V;
            var10000.objX = (short)(var10000.objX + 50);
         } else if (this.V.objX > this.q / 2 + 2) {
            var10000 = this.V;
            var10000.objX = (short)(var10000.objX - 50);
         }

         if (VDTT_jb.b(this.q / 2 - this.W.q - 2 - this.W.objX) < 50) {
            this.W.objX = (short)(this.q / 2 - this.W.q - 2);
         } else if (this.W.objX < this.q / 2 - this.W.q - 2) {
            var10000 = this.W;
            var10000.objX = (short)(var10000.objX + 50);
         } else if (this.W.objX > this.q / 2 - this.W.q - 2) {
            var10000 = this.W;
            var10000.objX = (short)(var10000.objX - 50);
         }

         if (DataCenter.l()) {
            this.W.b(true);
            this.V.f((short)(DataCenter.d().n / 2 - this.V.q / 2), this.V.objY);
         }
      } else {
         var4 = Caption.sE;
         this.W.l = var4;
         if (this.P.size() > 0) {
            var4 = Caption.aa;
            this.V.l = var4;
            this.X.b(true);
         } else {
            var4 = Caption.V;
            this.V.l = var4;
            this.X.b(this.R.isEmpty());
         }

         int var12 = 5 + VDTT_d.g().m / 2;
         if (VDTT_jb.b(this.q - this.W.q - var12 - this.V.objX - VDTT_d.g().m / 2) < 50) {
            this.V.objX = (short)(this.q - this.W.q - var12);
         } else if (this.V.objX < this.q - this.W.q - var12 - VDTT_d.g().m / 2) {
            var10000 = this.V;
            var10000.objX = (short)(var10000.objX + 50);
         } else if (this.V.objX > this.q - this.W.q - var12 - VDTT_d.g().m / 2) {
            var10000 = this.V;
            var10000.objX = (short)(var10000.objX - 50);
         }

         if (VDTT_jb.b(var12 - this.W.objX) < 50) {
            this.W.objX = (short)var12;
         } else if (this.W.objX < var12) {
            var10000 = this.W;
            var10000.objX = (short)(var10000.objX + 50);
         } else if (this.W.objX > var12) {
            var10000 = this.W;
            var10000.objX = (short)(var10000.objX - 50);
         }

         this.O = this.M;
         this.R = this.P;
      }

      this.Z.f(this.aa - DataCenter.d().h / 3 % 3, this.Z.objY);
      this.Y.f(this.ab + DataCenter.d().h / 3 % 3, this.Y.objY);
      if (!DataCenter.l() && this.R.size() > 1) {
         this.Y.b(false);
         this.Z.b(false);
      } else {
         this.Y.b(true);
         this.Z.b(true);
      }

      for(var10 = 0; var10 < this.ak.length; ++var10) {
         this.ak[var10].n();
         if (DataCenter.d().h % 2 == 0) {
            this.ak[var10].n();
         }
      }

      for(var10 = 0; var10 < this.R.size(); ++var10) {
         VDTT_cj var13;
         if ((var13 = (VDTT_cj)this.R.get(var10)).e != null) {
            try {
               if (var13.equals(var13.g.R.get(var13.g.O))) {
                  var13.e.a_();
               }
            } catch (Exception var8) {
            }
         }

         if (var13.a != null) {
            if (var13.b == null && !DataCenter.l()) {
               var13.b = var13.g.ak[var13.a.m].o();
               var13.b.f(var13.a.objX - 1, var13.a.objY);
            }

            var13.a.K();
            var13.a.objY = (short)(DataCenter.d().o - 61);
            if (DataCenter.d().h % 5 == 0 && var13.g.ah < Integer.MAX_VALUE && (var13.g.ag >= 0 || var13.g.ag < -1)) {
               ++var13.g.ag;
            }

            byte var14;
            if (var13.g.ag >= 0) {
               if (!DataCenter.l()) {
                  var14 = 57;
                  var13.a.K = (short)var14;
                  if (var13.g.ag == 15) {
                     var13.g.f(var13.g.M);
                  }
               } else {
                  var13.g.f(var13.g.M);
               }
            } else if (var13.g.ai >= 0 && !DataCenter.l()) {
               if (DataCenter.d().h % 5 == 0) {
                  --var13.g.ai;
               }

               if (var13.g.ai > an) {
                  var14 = 52;
                  var13.a.K = (short)var14;
               } else if (var13.g.ai > 5) {
                  var14 = 53;
                  var13.a.K = (short)var14;
               } else if (var13.g.ai > 0) {
                  VDTT_ac.b().u();
               }
            } else if (var13.g.T) {
               if (var13.g.ah >= 0) {
                  if (!DataCenter.l()) {
                     short var15;
                     VDTT_ek var18;
                     if (var13.g.ah < 5) {
                        var18 = var13.a;
                        var15 = (short)(DataCenter.d().h / 5 % 6);
                        var18.K = (short)var15;
                     } else if (var13.g.ah < 10) {
                        var14 = 52;
                        var13.a.K = (short)var14;
                     } else if (var13.g.ah < ao) {
                        a(var13.g, (long)VDTT_jb.a(0, 200000000));
                        var14 = 41;
                        var13.a.K = (short)var14;
                     } else {
                        var18 = var13.a;
                        var15 = (short)(6 + DataCenter.d().h / 5 % 6);
                        var18.K = (short)var15;
                        VDTT_ac.b().u();
                     }
                  } else if (var13.g.ah < ao) {
                     a(var13.g, (long)VDTT_jb.a(0, 200000000));
                  }

                  if (DataCenter.d().h % 5 == 0 && var13.g.ah < Integer.MAX_VALUE) {
                     ++var13.g.ah;
                  }
               }
            } else {
               long var6 = 0L;
               var13.g.ac = 0L;
               boolean var16 = false;
               var13.g.ah = 0;
            }

            var13.a.be.clear();
            var13.a.be.addAll(var13.a.aa());
         }

         if (var13.b != null) {
            var13.b.n();
         }
      }

   }

   public final void c() {
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      switch(var1.b) {
      case 3001:
         this.x();
      default:
      }
   }

   public final Vector g() {
      Vector var1 = new Vector();
      if (!this.T) {
         if (this.O >= 0 && this.O < this.R.size()) {
            VDTT_cj var2 = (VDTT_cj)this.R.get(this.O);
            var1.addElement(new VDTT_hl(3001, var2.a.objX - 20, var2.a.objY - 60, var2.a.objX + 20, var2.a.objY, (VDTT_hs)null, this, var2));
         }
      } else if (this.ad != null) {
         DataCenter.l();
      }

      return var1;
   }

   public final void v() {
      Message var1 = null;
      boolean var6 = false;

      label76: {
         try {
            var6 = true;

            String var2;
            for(var2 = this.I.i().trim(); var2.contains("  "); var2 = var2.replaceAll("  ", " ")) {
            }

            this.I.a(var2);
            (var1 = Message.b((byte)-128)).a((int)((VDTT_cj)this.R.get(this.O)).a.m);
            var1.a(var2);
            var1.l();
            this.i();
            var6 = false;
            break label76;
         } catch (Exception var7) {
            VDTT_jb.a(var7);
            var6 = false;
         } finally {
            if (var6) {
               if (var1 != null) {
                  var1.b();
               }

            }
         }

         if (var1 != null) {
            var1.b();
            return;
         }

         return;
      }

      var1.b();
   }

   public final void f(int var1) {
      this.ag = -50;
      Message var2 = null;

      while(true) {
         boolean var5 = false;

         try {
            var5 = true;
            DataCenter.d();
            if (!DataCenter.a()) {
               Thread.sleep(100L);
               continue;
            }

            (var2 = Message.d((byte)-127)).a(var1);
            var2.l();
            this.i();
            var5 = false;
            break;
         } catch (Exception var6) {
            VDTT_jb.a(var6);
            var5 = false;
         } finally {
            if (var5) {
               if (var2 != null) {
                  var2.b();
               }

            }
         }

         if (var2 != null) {
            var2.b();
            return;
         }

         return;
      }

      var2.b();
   }

   private void x() {
      this.af = (VDTT_cj)this.P.get(this.M);
      this.ag = 0;
      VDTT_ac.b().n();
      VDTT_ac.b().t();
   }

   // $FF: synthetic method
   static long a(SelectCharScreen var0, long var1) {
      return var0.ac += var1;
   }
}
