package core.mchien.main2;

import java.util.Vector;

public final class VDTT_bw extends VDTT_m {
   public VDTT_hs l;
   public VDTT_iu[] m;
   public Vector n = new Vector();
   private boolean L;
   private boolean M;
   public static VDTT_v I;
   private boolean N;
   private String O = "";
   private int P;
   private int Q;
   public static int J = -1;
   public boolean[] K = new boolean[7];

   public VDTT_bw(int var1, int var2, int var3, int var4, MainScreen var5) {
      this.f(var1, var2);
      this.d(110, 70);
      this.a = var5;
      this.l = new VDTT_hs((byte)1, 0, 2, 110, 70, 11, 0, true);
      this.d();
   }

   public final void c(boolean var1) {
      VDTT_cw.v().r(VDTT_cw.v().cH);
      VDTT_eq.a().a(13, var1);
      this.d();
   }

   public final void a(int var1) {
      this.l.a(var1);
   }

   public final void d() {
      this.n.clear();
      Vector var1 = new Vector();
      Vector var2 = new Vector();
      Vector var3 = new Vector();
      Vector var4 = new Vector();
      Vector var5 = new Vector();
      Vector var6 = new Vector();
      Vector var7 = new Vector();
      this.O = Caption.jN;
      if (VDTT_cw.v().br < DataCenter.d().K.length) {
         VDTT_ir var8 = DataCenter.d().K[VDTT_cw.v().br];
         String var9 = "c#cyan" + this.O + "c#white" + var8.b;
         var1.addElement(var9);
         VDTT_gy var12 = DataCenter.d().F[var8.d];
         if (VDTT_cw.v().bs < 0) {
            var1.addElement("c#white" + Caption.jO + "c#task" + var12.j + "c#white" + Caption.jQ);
            this.n.addElement(new VDTT_dy(var8.d, -1, -1, var8.e, var8.f, var8.g));
         } else if (VDTT_ek.m().w() < var8.c) {
            var1.addElement("c#red" + Caption.jR + DataCenter.d().a(var8.c));
            this.n.addElement(new VDTT_dy(-1, -1, -1, Integer.MIN_VALUE, 0, 0));
         } else if (VDTT_cw.v().bs >= var8.p.size()) {
            var1.addElement("c#white" + Caption.uD + "c#task" + Caption.uE + "c#white" + Caption.uF);
            this.n.addElement(new VDTT_dy(-32768, -1, -1, var8.e, var8.f, var8.g));
         } else {
            VDTT_il var10;
            if ((var10 = (VDTT_il)var8.p.elementAt(VDTT_cw.v().bs)).b.length() > 0) {
               this.n.addElement(new VDTT_dy(var10.d, var10.b(), var10.e, var10.f, var10.g, var10.h));
               if (var10.i <= 1) {
                  var1.addElement("c#blue" + "- c#task" + var10.b);
               } else {
                  var1.addElement("c#blue" + "- c#task" + var10.b + " " + VDTT_cw.v().bt + "/" + var10.i);
               }
            }

            if (VDTT_cw.v().br == 18) {
               var1.add("c#white" + Caption.ww);
            }
         }
      }

      this.O = Caption.mE;
      this.c(var2);
      this.d(var3);
      this.e(var4);
      this.f(var5);
      this.g(var6);
      this.h(var7);
      Vector var11 = new Vector();
      if (var1.size() > 0) {
         var11.addAll(this.b(var1));
         this.K[0] = true;
      }

      if (var2.size() > 0) {
         var11.addAll(this.b(var2));
         this.K[1] = true;
      }

      if (var3.size() > 0) {
         var11.addAll(this.b(var3));
         this.K[1] = true;
      }

      if (var4.size() > 0) {
         var11.addAll(this.b(var4));
         this.K[3] = true;
      }

      if (var5.size() > 0) {
         var11.addAll(this.b(var5));
         this.K[4] = true;
      }

      if (var6.size() > 0) {
         var11.addAll(this.b(var6));
         this.K[5] = true;
      }

      if (var7.size() > 0) {
         var11.addAll(this.b(var7));
         this.K[6] = true;
      }

      if (var11.size() == 0) {
         var11.add(new VDTT_iu(1, Caption.jP));
      }

      this.m = new VDTT_iu[var11.size()];

      for(int var13 = 0; var13 < var11.size(); ++var13) {
         this.m[var13] = (VDTT_iu)var11.elementAt(var13);
      }

      this.l.a(this.l.g, this.l.h, this.m.length);
      this.N = false;
   }

   private Vector b(Vector var1) {
      Vector var2 = new Vector();

      int var4;
      for(var4 = 0; var4 < var1.size(); ++var4) {
         String var3;
         (var3 = Caption.a(String.valueOf(var1.elementAt(var4)))).contains("c#task");
         Vector var5 = new Vector();
         if (!var3.contains(Caption.jN) && !var3.contains(Caption.mE)) {
            var5 = VDTT_dg.a(VDTT_dg.b, var3, this.l.q - 8);
         } else {
            var5.add(var3);
         }

         for(int var6 = 0; var6 < var5.size(); ++var6) {
            (var3 = (String)var5.elementAt(var6)).contains("c#task");
            var2.add(new VDTT_iu(1, var3));
            if (var2.size() >= 3) {
               return var2;
            }
         }
      }

      if (var2.size() > 0) {
         for(var4 = var2.size(); var4 < 3; ++var4) {
            var2.add(new VDTT_iu(1, ""));
         }
      }

      return var2;
   }

   private boolean c(Vector var1) {
      if (VDTT_ek.m().ac > 0) {
         var1.addElement("c#yellow" + this.O + "c#white" + Caption.jS + (60 - VDTT_ek.m().ac) + "/10");
         if (VDTT_cw.v().bx == null) {
            var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.d().F[102].j + "c#white" + Caption.jQ);
            this.n.addElement(new VDTT_dy(102, -1, -1, 67, 0, 0));
         } else {
            String var2 = VDTT_cw.v().bx.m;
            if (VDTT_cw.v().bx.j > 1) {
               var2 = var2 + " " + VDTT_cw.v().bx.c + "/" + VDTT_cw.v().bx.j;
               if (VDTT_cw.v().bx.b == 12) {
                  var2 = var2 + "c#white (" + DataCenter.d().H[VDTT_cw.v().bx.g].b + ")";
               }
            }

            if (VDTT_cw.v().bx.a()) {
               var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.d().F[102].j + "c#white" + Caption.jU);
               this.n.addElement(new VDTT_dy(102, -1, -1, 67, 0, 0));
            } else {
               var1.addElement("c#blue" + "  - c#task" + var2);
               this.n.addElement(new VDTT_dy(VDTT_cw.v().bx.e, VDTT_cw.v().bx.d, VDTT_cw.v().bx.f, VDTT_cw.v().bx.g, VDTT_cw.v().bx.h, VDTT_cw.v().bx.i));
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean d(Vector var1) {
      if (VDTT_cw.v().bB != null) {
         var1.addElement("c#yellow" + this.O + "c#white" + Caption.ns);
         String var2 = "";
         if (VDTT_cw.v().bB.a == 0) {
            var2 = Caption.vY;
            if (VDTT_cw.v().bB.j > 1) {
               var2 = var2 + " " + VDTT_cw.v().bB.c + "/" + VDTT_cw.v().bB.j;
            }

            var2 = var2 + Caption.wt;
         } else if (VDTT_cw.v().bB.a == 1) {
            var2 = Caption.vZ;
            if (VDTT_cw.v().bB.j > 1) {
               var2 = var2 + " " + VDTT_cw.v().bB.c + "/" + VDTT_cw.v().bB.j;
            }

            var2 = var2 + Caption.wu;
         } else if (VDTT_cw.v().bB.a == 2) {
            var2 = Caption.wa;
            if (VDTT_cw.v().bB.j > 1) {
               var2 = var2 + " " + VDTT_cw.v().bB.c + "/" + VDTT_cw.v().bB.j;
            }

            var2 = var2 + Caption.wv;
         }

         if (VDTT_cw.v().bB.a()) {
            var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.d().F[60].j + "c#white" + Caption.jU);
            this.n.addElement(new VDTT_dy(60, -1, -1, 56, 0, 0));
         } else {
            var1.addElement("c#green" + "  - c#task" + var2);
            this.n.addElement(new VDTT_dy(-1, -1, -1, -2, 0, 0));
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean e(Vector var1) {
      if (VDTT_cw.v().bz != null) {
         var1.addElement("c#yellow" + this.O + "c#white" + Caption.wi);
         String var2 = Caption.wk + " " + VDTT_cw.v().bz.c + "/" + VDTT_cw.v().bz.j;
         if (VDTT_cw.v().bz.a()) {
            var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.d().F[38].j + "c#white" + Caption.jU);
            this.n.addElement(new VDTT_dy(38, -1, -1, 55, 0, 0));
         } else {
            var1.addElement("c#green" + "  - c#task" + var2);
            byte var3 = 55;
            short var4 = 163;
            if (VDTT_ek.m().w() >= 28) {
               var3 = 63;
               var4 = 167;
            } else if (VDTT_ek.m().w() >= 26) {
               var3 = 65;
               var4 = 166;
            } else if (VDTT_ek.m().w() >= 24) {
               var3 = 64;
               var4 = 165;
            }

            this.n.addElement(new VDTT_dy(-1, -1, var4, var3, 0, 0));
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean f(Vector var1) {
      if (VDTT_cw.v().bA != null) {
         var1.addElement("c#yellow" + this.O + "c#white" + Caption.wj);
         String var2 = Caption.wl + " " + VDTT_cw.v().bA.c + "/" + VDTT_cw.v().bA.j;
         if (VDTT_cw.v().bA.a()) {
            var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.d().F[36].j + "c#white" + Caption.jU);
            this.n.addElement(new VDTT_dy(36, -1, -1, 88, 0, 0));
         } else {
            var1.addElement("c#green" + "  - c#task" + var2);
            this.n.addElement(new VDTT_dy(-1, -1, -1, -2, 0, 0));
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean g(Vector var1) {
      if (VDTT_cw.v().bC != null) {
         var1.addElement("c#yellow" + this.O + "c#white" + Caption.wE);
         String var2 = "";
         switch(VDTT_cw.v().bC.b) {
         case 6:
            var2 = Caption.BO[0];
            break;
         case 7:
            var2 = Caption.BO[1];
            break;
         case 8:
            var2 = Caption.BO[2];
            break;
         case 9:
            var2 = Caption.BO[3];
            break;
         case 10:
            var2 = Caption.BO[4];
         }

         var2 = var2 + " " + VDTT_cw.v().bC.c + "/" + VDTT_cw.v().bC.j;
         if (VDTT_cw.v().bC.a()) {
            var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.d().F[23].j + "c#white" + Caption.jU);
            this.n.addElement(new VDTT_dy(23, -1, -1, 58, 0, 0));
         } else {
            var1.addElement("c#green" + "  - c#task" + var2);
            this.n.addElement(new VDTT_dy(-1, -1, -1, -2, 0, 0));
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean h(Vector var1) {
      if (VDTT_cw.v().bD != null) {
         String var2 = "";
         var1.addElement("c#yellow" + this.O + "c#white" + Caption.xo);
         if (VDTT_cw.v().bD.e >= 0) {
            var2 = Caption.km;
            if (VDTT_cw.v().bD.b == 66) {
               var2 = var2 + Caption.xV + "c#task" + DataCenter.d().F[VDTT_cw.v().bD.e].j;
            } else {
               var2 = var2 + " c#task" + DataCenter.d().F[VDTT_cw.v().bD.e].j + Caption.ji;
            }
         } else if (VDTT_cw.v().bD.d >= 0) {
            var2 = Caption.km;
            var2 = var2 + " c#task" + DataCenter.d().O[VDTT_cw.v().bD.d].b + Caption.xp;
         }

         if (VDTT_cw.v().bD.a()) {
            var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.d().F[76].j + "c#white" + Caption.jU);
            this.n.addElement(new VDTT_dy(76, -1, -1, 86, 0, 0));
         } else {
            var1.addElement("c#green" + "  - c#task" + var2);
            this.n.addElement(new VDTT_dy(-1, -1, -1, -2, 0, 0));
         }

         return true;
      } else {
         return false;
      }
   }

   public final void b(Graphics var1) {
      try {
         this.a(var1, 0, 0, this.q, this.r, 46, 22, 23, 1, 1);
         if (VDTT_cw.v().az.c()) {
            this.a(var1, this.l);

            for(int var2 = 0; var2 < this.m.length; ++var2) {
               if (this.l.l != -1 && this.l.b(var2)) {
                  VDTT_dg.e(VDTT_dg.b, var1, this.m[var2].b, 4, var2 * this.l.h + this.l.h / 2, 0, -1, -10275328);
               }

               if (var2 >= this.l.j && var2 < this.l.j + 6) {
                  VDTT_dg.e(VDTT_dg.b, var1, this.m[var2].b, 4, var2 * this.l.h + this.l.h / 2, 0, -1, -10275328);
               }
            }

            this.a(var1);
            this.l.a(var1, this, 3, false);
         }
      } catch (Exception var3) {
      }
   }

   public final void a_() {
      if (this.l != null) {
         this.l.a();
         if (this.l.l == -1) {
            int var1 = this.l.j;
            if (this.l.j % 3 != 0) {
               var1 = this.l.j / 3 * 3;
               if (this.l.j > this.P) {
                  var1 += 3;
               }
            }

            this.a(var1);
         }

         if (J >= 0) {
            String[] var4 = new String[]{Caption.jS, "", Caption.ns, Caption.wi, Caption.wj, Caption.jN, Caption.wE, Caption.wE, Caption.wE, Caption.wE, Caption.wE, Caption.xo};

            for(int var2 = 0; var2 < this.m.length; ++var2) {
               if (this.m[var2].b.contains(var4[J])) {
                  this.a(var2);
                  break;
               }
            }

            J = -1;
         }

         if (this.l.l == -1) {
            this.P = this.l.j;
         }

         if (this.l.p) {
            this.Q = 5;
         } else if (this.Q > 0) {
            --this.Q;
         }
      }

      if (VDTT_cw.v().az.c()) {
         DataCenter.d();
         if (!DataCenter.b()) {
            VDTT_p var5;
            if ((var5 = (VDTT_p)this.a).b.size() > 0 && var5.b.lastElement().equals(VDTT_cw.v()) || var5.b.size() == 2 && var5.b.lastElement() instanceof VDTT_x) {
               this.K[0] = true;
               if (VDTT_cw.v().ai == 51 || this.l.j >= 3) {
                  DataCenter.d().aA.b = false;
                  return;
               }

               int var10001;
               if (!VDTT_cw.v().V()) {
                  var10001 = this.objX + 40;
                  DataCenter.d().aA.a(var10001, this.objY + 15);
                  DataCenter.d().aA.b = true;
               }

               VDTT_il var6 = VDTT_cw.v().T();
               VDTT_ir var3 = VDTT_cw.v().S();
               if (VDTT_cw.v().bs != 0 || VDTT_ek.m().w() >= var3.c) {
                  switch(VDTT_cw.v().br) {
                  case 1:
                     var10001 = this.objX + 40;
                     DataCenter.d().aA.a(var10001, this.objY + 15);
                     DataCenter.d().aA.b = true;
                     break;
                  case 2:
                  case 3:
                     switch(VDTT_cw.v().bs) {
                     case 0:
                        if ((var6 == null || VDTT_ek.m().objX != var6.g || VDTT_ek.m().objY != var6.h) && VDTT_cw.v().bt <= 0) {
                           this.L = false;
                        } else {
                           this.L = true;
                        }
                        break;
                     case 1:
                        this.L = false;
                        var10001 = this.objX + 40;
                        DataCenter.d().aA.a(var10001, this.objY + 15);
                        DataCenter.d().aA.b = true;
                     }
                  case 4:
                  case 5:
                  case 6:
                  case 7:
                  case 8:
                  default:
                     break;
                  case 9:
                     var10001 = this.objX + 50;
                     DataCenter.d().aA.a(var10001, this.objY + 15);
                     DataCenter.d().aA.b = true;
                  }

                  if (!this.M && VDTT_cw.v().aC == 1) {
                     var10001 = this.objX + 30;
                     DataCenter.d().aA.a(var10001, this.objY + 10);
                     DataCenter.d().aA.b = true;
                     return;
                  }

                  if (VDTT_cw.v().aC != 1 && !this.L) {
                     return;
                  }
               }

               DataCenter.d().aA.b = false;
            }

            return;
         }
      }

      DataCenter.d().aA.b = false;
   }

   public final Vector g() {
      Vector var1 = new Vector();
      if (!VDTT_cw.v().az.c()) {
         return var1;
      } else {
         if (this.n.size() != 0) {
            var1.addElement(new VDTT_hl(4000, 0, 0, this.q, this.r, this.l, this));
         }

         return var1;
      }
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      switch(var1.b) {
      case 4000:
         if (VDTT_ek.m().bE) {
            return;
         }

         if (var1.j.k >= 0 && this.Q == 0) {
            MenuConfig.K().a(false);
            this.b(var1.j.k / 3);
            return;
         }
         break;
      case 4002:
         DataCenter.d().ai.b(Caption.sb);
      }

   }

   public final boolean f() {
      try {
         if (J == 0) {
            J = 1;
            this.d();
            new Vector();
            J = 2;
            this.d();
            if (!this.d(new Vector())) {
               J = 0;
               return true;
            }
         } else {
            if (J != 1) {
               if (J == 2) {
                  J = 0;
                  return true;
               }

               return true;
            }

            J = 2;
            this.d();
            if (!this.d(new Vector())) {
               J = 0;
               return true;
            }
         }
      } catch (Exception var1) {
      }

      return false;
   }

   public final void r() {
      super.r();
      this.p.b = -1;
   }

   private VDTT_dy b(int var1) {
      VDTT_dy var2 = null;

      try {
         if (VDTT_ek.m().h()) {
            return null;
         }

         VDTT_dy var3;
         if (VDTT_cw.v().cz != null) {
            var3 = new VDTT_dy(VDTT_cw.v().ai, VDTT_cw.v().cz.objX, VDTT_cw.v().cz.objY);
         } else {
            if ((var3 = (VDTT_dy)this.n.elementAt(var1)).a == -32768) {
               Message.c((byte)-11).l();
               return null;
            }

            if (var3.d == Integer.MIN_VALUE) {
               if (VDTT_ek.m().w() >= 20 && VDTT_ek.m().w() < 29) {
                  DataCenter.d().ai.b(Caption.wn);
               } else if (VDTT_ek.m().w() >= 30 && VDTT_ek.m().w() < 39) {
                  DataCenter.d().ai.b(Caption.wo);
               } else if (VDTT_ek.m().w() >= 15) {
                  DataCenter.d().ai.b(Caption.wp);
               } else {
                  DataCenter.d().ai.b(Caption.sb);
               }

               return null;
            }

            if (var3.a >= 0) {
               if (VDTT_cw.v().l(var3.a) != null) {
                  var3.d = VDTT_cw.v().ai;
               }

               if (var3.d < 0) {
                  VDTT_cw.v();
                  VDTT_cw.b(var3);
               }
            }
         }

         var2 = var3.a();
         VDTT_cw.v().a(var2, var1 == 0 && this.K[0]);
      } catch (Exception var5) {
         VDTT_jb.a(var5);
      }

      return var2;
   }
}
