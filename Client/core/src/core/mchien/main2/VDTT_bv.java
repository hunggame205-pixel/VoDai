package core.mchien.main2;

import java.util.Collections;
import java.util.Vector;

public final class VDTT_bv extends VDTT_an {
   public static VDTT_bv l;
   public VDTT_ek m;
   public Vector n = new Vector();
   public Vector I = new Vector();
   public Vector J = new Vector();
   public Vector K = new Vector();
   private VDTT_hs[] M;
   private VDTT_ba[] N = new VDTT_ba[3];
   private VDTT_ic O;
   private VDTT_gk P;
   private int Q;
   private int R;
   public static VDTT_ev L;

   public VDTT_bv(int var1, int var2, int var3, int var4, MainScreen var5, VDTT_ic var6, VDTT_ek var7) {
      l = this;
      this.a = var5;
      var1 = -var5.objX;
      var2 = -var5.objY;
      var3 = DataCenter.d().n - VDTT_d.g().m;
      var4 = DataCenter.d().o;
      this.f(var1, var2);
      this.d(var3, var4);
      this.m = new VDTT_ek(Integer.MIN_VALUE);
      this.m.aR = var7.aR;
      this.m.m = var7.m;
      this.m.av = var7.av;
      this.m.bq = var7.bq;
      this.m.ai = this.m.ag = 1;
      this.m.bb.addAll(var7.bb);
      this.P = new VDTT_gk(213);
      this.P.d = 3;
      this.P.W = this.P.V = 1;
      this.m.f(var3 / 2 - 100, var4 / 2 + 50);
      this.P.c(this.m.objX + 200, this.m.objY);
      this.O = var6;
      this.N[0] = new VDTT_ba(var3 - 17 - VDTT_d.g().m / 2, 3, 0, 0, "", var5, 2001, 52);
      this.N[1] = new VDTT_ba(var3 / 2 - 38, var4 - 28, 0, 0, Caption.qt, var5, 2002, 7);
      this.N[2] = new VDTT_ba(var3 / 2 + 8, var4 - 28, 0, 0, Caption.l, var5, 2001, 7);
      this.N[1].d(40, 23);
      this.N[2].d(40, 23);
      this.M = a(this.N);
      if (this.a instanceof SelectCharScreen && L == null && !DataCenter.l()) {
         L = new VDTT_ev(460, 0, 0, 2);
      }

   }

   public final void a(int var1, int var2) {
      this.m.f(var1, var2);
      this.P.c(this.m.objX + 200, this.m.objY);
      this.P.k = 1;
   }

   private void a(VDTT_ic var1) {
      VDTT_ek var10000 = this.m;
      VDTT_ii var3 = new VDTT_ii(var1, this.m, this.P);
      var10000.aV = var3;
      VDTT_ac.b().a(this.m.av, var1.d, true);
   }

   public final void b(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      int var4;
      if (this.a instanceof SelectCharScreen) {
         for(var4 = 0; var4 < this.K.size(); ++var4) {
            if (!DataCenter.l() || !(this.K.get(var4) instanceof VDTT_gk)) {
               ((VDTT_n)this.K.get(var4)).a(var1);
            }
         }

      } else {
         this.c(var1);

         for(var4 = 0; var4 < this.K.size(); ++var4) {
            ((VDTT_n)this.K.get(var4)).a(var1);
         }

         this.a(var1, this.N, var2, var3);
      }
   }

   public final void a_() {
      ++this.R;
      a(this.N, this.M);
      this.K.clear();
      this.m.B();
      if (this.a instanceof SelectCharScreen) {
         this.P.e = 0;
      }

      this.P.r();
      if (this.m.aV != null) {
         this.m.aV.a(this.J, this.n);
      } else if (this.a instanceof SelectCharScreen && this.Q < 2 && this.R > 20 && this.O.k()) {
         ++this.Q;
         this.a(this.O);
         this.m.aV.a = 8;
         this.m.aV.a(this.J, this.n);
      }

      int var2;
      for(var2 = this.n.size() - 1; var2 >= 0; --var2) {
         VDTT_hi var1;
         if ((var1 = (VDTT_hi)this.n.elementAt(var2)) != null) {
            VDTT_hi var3 = var1;
            ++var1.m;
            if (var1.o > 0 && var1.m >= var1.o) {
               var1.m = 0;
               if (var1.l > 0) {
                  --var1.l;
               }
            }

            VDTT_ev var4;
            int var5;
            for(var5 = 0; var5 < var3.m().b.length; ++var5) {
               if (var3.p) {
                  var4 = new VDTT_ev(var3.m().b[var5].a, var3.objX - var3.m().b[var5].c, var3.objY + var3.m().b[var5].d);
               } else {
                  var4 = new VDTT_ev(var3.m().b[var5].a, var3.objX + var3.m().b[var5].c, var3.objY + var3.m().b[var5].d);
               }

               var4.p = var3.K;
               var4.o = var3.p;
               if (var3.M != 0) {
                  var4.I = var3.M;
               }

               if (var3.m == var3.m().b[var5].b) {
                  var3.n.addElement(var4);
               }

               if (var3.m().b[var5].b + var4.p().b.length > var3.o) {
                  var3.o = var3.m().b[var5].b + var4.p().b.length;
               }
            }

            if (var3.I) {
               for(var5 = var3.n.size() - 1; var5 >= 0; --var5) {
                  (var4 = (VDTT_ev)var3.n.elementAt(var5)).n();
                  if (var4.q()) {
                     var3.n.removeElement(var4);
                  }
               }
            } else {
               if (var3.l != 0) {
                  l.I.addAll(var3.n);
               }

               var3.n.clear();
            }

            if (!(this.a instanceof SelectCharScreen) && this.O.d >= 30 && this.O.d <= 36 && VDTT_ek.m().ad()) {
               var1.M = 95;
            }

            if (var1.p()) {
               this.n.removeElement(var1);
            }
         }
      }

      for(int var6 = 0; var6 < this.I.size(); ++var6) {
         VDTT_ev var8 = (VDTT_ev)this.I.get(var6);
         if (!(this.a instanceof SelectCharScreen) && this.O.d >= 30 && this.O.d <= 36 && VDTT_ek.m().ad()) {
            var8.I = 95;
         }

         if (var8 != null) {
            var8.n();
         }

         if (var8.q()) {
            this.I.remove(var8);
         }
      }

      for(var2 = this.J.size() - 1; var2 >= 0; --var2) {
         VDTT_er var7;
         (var7 = (VDTT_er)this.J.elementAt(var2)).o();
         if (var7.n()) {
            this.J.removeElement(var7);
         }
      }

      this.K.add(this.m);
      if (!(this.a instanceof SelectCharScreen)) {
         this.K.add(this.P);
      }

      this.K.addAll(this.I);
      this.K.addAll(this.n);
      this.K.addAll(this.J);
      Collections.sort(this.K, XYEntity.F);
   }

   public final Vector g() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < this.N.length; ++var2) {
         if (this.N[var2] != null && !this.N[var2].d && !this.N[var2].c) {
            var1.addElement(this.M[var2].a(this.N[var2].m, this));
         }
      }

      var1.addElement(new VDTT_hl(3000, 0, 0, DataCenter.d().n, DataCenter.d().o, (VDTT_hs)null, this));
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      switch(var1.b) {
      case 2000:
         return;
      case 2001:
         this.a.b((VDTT_m)this);
         l = null;
         return;
      case 2002:
         if (this.m.aV == null) {
            this.a(this.O);
         }
      default:
      }
   }
}
