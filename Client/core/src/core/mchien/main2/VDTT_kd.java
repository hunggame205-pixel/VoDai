package core.mchien.main2;

import java.util.Vector;

public class VDTT_kd extends VDTT_aq {
   public VDTT_ca O;
   public VDTT_iq P;
   public VDTT_bg Q;
   public VDTT_bd R;
   public VDTT_bc[] S;
   private static int T = 0;
   private final VDTT_ba U;
   private boolean V;

   public VDTT_kd(VDTT_p var1, int var2, String[] var3) {
      super(var1);
      VDTT_cw.v().bq = this;
      this.K = false;
      this.a(300);
      VDTT_hp var6;
      (var6 = new VDTT_hp(5000)).c = new String[var3.length + 1];

      for(int var4 = 0; var4 < var3.length; ++var4) {
         var6.c[var4] = var3[var4];
      }

      var6.c[var6.c.length - 1] = Caption.r;
      if (var6.c.length <= 3) {
         this.a(var6, 170, 88, var6.c.length);
      } else {
         this.a(var6, 170, 66, var6.c.length);
      }

      this.P = new VDTT_iq(new VDTT_hp(5005, Caption.ys), this);
      this.P.f(this.P.objX, this.r - 55);
      this.O = this.a(72, this.r - 30, this.q - 165, "", this, 5002, 0);
      byte var7 = 80;
      this.O.l = var7;
      this.O.r = 20;
      this.O.U = true;
      this.a(this.O, this.w());
      this.Q = a(10, this.r - 29, 9, this, 6001);
      this.Q.n.b = var2;
      this.a(this.Q);
      this.a(this.Q, this.w());
      VDTT_ba var10 = this.a(this.q - 88, this.r - 27, "", this, 5002, 33);
      this.a(var10, this.w());
      var10 = this.a(52, this.r - 27, "", this, 5003, 38);
      if (VDTT_jb.c() > VDTT_cw.v().ah) {
         VDTT_cw.v().cI = -1;
         VDTT_cw.v().cJ = "";
      }

      this.a(var10, this.w());
      this.U = this.a(this.q - 68, this.r - 27, "", this, 5555, 90);
      this.a(this.U, this.w());
      var10 = this.a(32, this.r - 27, "", this, 5006, -24);
      this.a(var10, this.w());
      var10 = this.a(this.q - 28, this.r - 27, "", this, 5004, 39);
      this.a(var10, this.w());
      this.R = this.a(this.q - 48, this.r - 27, "", this, 6002);
      VDTT_bd var10000 = this.R;
      boolean var8 = VDTT_cw.v().bF;
      var10000.m = var8;
      this.a(this.R, this.w());
      this.S = new VDTT_bc[6];
      this.S[0] = new VDTT_bc(6, this.f() + 6, super.q - 8 - 7, 144, this, (byte)0, 5006, 16);
      this.S[1] = new VDTT_bc(6, this.f() + 6, super.q - 8 - 7, 144, this, (byte)1, 5006, 16);
      this.S[2] = new VDTT_bc(6, this.f() + 6, super.q - 8 - 7, 144, this, (byte)2, 5006, 16);
      this.S[3] = new VDTT_bc(6, this.f() + 6, super.q - 8 - 7, 144, this, (byte)3, 5006, 16);
      this.S[4] = new VDTT_bc(6, this.f() + 6, super.q - 8 - 7, 144, this, (byte)4, 5006, 16);
      this.S[5] = new VDTT_bc(6, this.f() + 6, super.q - 8 - 7, 144, this, (byte)5, 5006, 16);

      for(int var9 = 0; var9 < this.S.length; ++var9) {
         this.a(this.S[var9]);
      }

      try {
         if (this.R.m) {
            this.V = true;
         }

      } catch (Exception var5) {
      }
   }

   public void b(int var1, Object var2) {
   }

   public void b(Graphics var1) {
      super.b(var1);
      if (super.a.b == this.w()) {
         this.P.a(var1);
      }

      if (this.V) {
         this.V = false;

         for(int var3 = 0; var3 < this.S.length; ++var3) {
            this.S[var3].h();
         }
      }

   }

   public Vector g() {
      Vector var1 = super.g();
      if (this.w() <= 0) {
         var1.removeElementAt(0);
      }

      if (super.a.b == this.w()) {
         var1.addElement(this.P.f());
      }

      return var1;
   }

   public void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (super.a.b == this.w()) {
         switch(var1.b) {
         case 5000:
            return;
         case 5001:
            return;
         case 5002:
            VDTT_cw.v().a(this.O);
            return;
         case 5003:
            if (VDTT_jb.c() > VDTT_cw.v().ah) {
               this.I.c(Caption.sq, -1);
               return;
            }

            this.k = new VDTT_bl(var1.a.objX, var1.a.objY - 88, 6003, this);
            this.a(this.k);
            return;
         case 5004:
            this.I.a((MainScreen)(new VDTT_kc(5001, this.I)));
            return;
         case 5005:
            if (var1.j.k >= 0) {
               this.P.a(var1.j.k);
               this.B();
               if (this.P.h() == 1) {
                  VDTT_bc var5 = this.S[this.P.h()];
                  int var4 = 0;

                  while(true) {
                     if (var4 >= var5.I.size()) {
                        if (var5.I.size() > 0) {
                           VDTT_bc.K = ((VDTT_iu)var5.I.firstElement()).b;
                           var5.a(VDTT_bc.K);
                        }
                        break;
                     }

                     if (((VDTT_iu)var5.I.elementAt(var4)).b.equals(VDTT_bc.K)) {
                        break;
                     }

                     ++var4;
                  }
               }

               if (this.R.m) {
                  this.S[var1.j.k].h();
                  return;
               }
            }
            break;
         case 5006:
            if (VDTT_jb.c() > VDTT_cw.v().ah) {
               VDTT_cw.v().cI = -1;
               VDTT_cw.v().cJ = "";
               this.I.c(Caption.sq, -1);
               return;
            }

            this.k = new VDTT_be(var1.a.objX, var1.a.objY - 88, 6010, this);
            this.a(this.k);
            return;
         case 5555:
            VDTT_au.b().c();
         }
      }

   }

   public void perform(int var1, Object var2, VDTT_z var3) {
      if (super.a.b == this.w()) {
         if (var1 != 6002 && var1 != 6009) {
            this.c(this.O);
         }

         this.c(var1, var2);
         switch(var1) {
         case 6001:
            if (this.P.h() != 0 || this.Q.n.b != 1 && this.Q.n.b != 7 && this.Q.n.b != 6 && this.Q.n.b != 0 && this.Q.n.b != 8) {
               break;
            }

            VDTT_cw.v().cv = (byte)this.Q.n.b;
            return;
         case 6002:
            VDTT_eq.a().a(6, this.R.m);
            if (this.R.m) {
               this.S[this.P.h()].h();
               this.I.c(Caption.w, -1);
            } else {
               this.I.c(Caption.x, -1);
            }

            VDTT_cw.v().bF = this.R.m;
            return;
         case 6003:
            this.O.d(var2.toString());
            return;
         case 6004:
         case 6005:
         case 6006:
         default:
            break;
         case 6007:
            VDTT_cw.v().i(VDTT_bc.L.b);
            return;
         case 6008:
            try {
               VDTT_cw.v();
               VDTT_cw.f(VDTT_bc.L.b);
               return;
            } catch (Exception var4) {
               VDTT_jb.a(var4);
            }
         }
      }

   }

   public void a_() {
      super.a_();

      for(int var1 = 0; var1 < this.S.length; ++var1) {
         this.S[var1].d = true;
         this.S[var1].a_();
      }

      if (super.a.b == this.w()) {
         this.P.e();
         this.S[this.P.h()].d = false;
      }

   }

   public void d() {
      super.d();
      VDTT_cw.v().bq = null;
   }

   private void B() {
      this.S[this.P.h()].d();
      this.P.b.d = new short[this.P.b.c.length];
      this.C();

      try {
         if (this.R.m && VDTT_bc.l[this.P.h()].b) {
            VDTT_bc.l[this.P.h()].b = false;
            this.S[this.P.h()].h();
         }
      } catch (Exception var2) {
      }

      if (this.P.h() == 0) {
         this.Q.a(VDTT_cw.v().cv);
      } else {
         this.g(this.P.h());
      }

      T = this.P.h();
   }

   private void C() {
      for(int var1 = 0; var1 < this.P.b.c.length; ++var1) {
         this.P.b.d[var1] = this.S[var1].f();
      }

   }

   private void g(int var1) {
      if (var1 == 1) {
         this.Q.a((byte)5);
      } else if (var1 == 2) {
         this.Q.a((byte)3);
      } else if (var1 == 3) {
         this.Q.a((byte)4);
      } else {
         if (var1 == 4) {
            this.Q.a((byte)2);
         }

      }
   }

   public final void z() {
      VDTT_an var1 = this.k;
      this.P.a(this.P.h());
      this.B();
      if (var1 != null) {
         this.a(var1);
         this.k = var1;
      }

   }

   public void f(int var1) {
      super.f(var1);
      if (super.a.b == this.w()) {
         this.P.a(T);
         this.B();
      }

   }

   public final void A() {
      this.J = null;
      this.P.d();
   }
}
