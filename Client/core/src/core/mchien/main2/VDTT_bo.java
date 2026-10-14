package core.mchien.main2;

import java.util.Vector;

public final class VDTT_bo extends VDTT_an {
   public VDTT_bn l;
   private int n;
   private int I;
   private int J = 157;
   private int K = 50;
   public boolean m;
   private VDTT_ba[] L = new VDTT_ba[5];
   private VDTT_hs[] M = new VDTT_hs[3];
   private static Item N;
   private static long O;
   private static long P;
   private boolean Q;

   public VDTT_bo(int var1, int var2, VDTT_bn var3) {
      this.l = var3;
      this.l.l = this;
      this.d(var3.q, var3.r);
      this.a = var3.a;
      this.n = var1;
      this.I = var2;
      VDTT_bn var7 = var3;
      var2 = 0;

      VDTT_ba var10000;
      while(true) {
         if (var2 >= var7.m.length) {
            var10000 = null;
            break;
         }

         if (var7.m[var2].l.equals(Caption.bI) || var7.m[var2].l.equals(Caption.bm) && (var7.m.length > 2 || var7.a instanceof VDTT_ju) || var7.m[var2].l.equals(Caption.bn) && (var7.m.length > 2 || var7.a instanceof VDTT_ju)) {
            var10000 = var7.m[var2];
            break;
         }

         ++var2;
      }

      VDTT_ba var8 = var10000;
      P = System.currentTimeMillis();
      Item var9 = var3.I;
      if (var8 != null) {
         if (var9.h != -1L) {
            this.K += 15;
         }

         if (!var9.i() && var9.strOptions.length() > 0) {
            this.J += 20;
            this.K += 18;
         }

         MainScreen var4;
         VDTT_gz[] var10;
         if (((var4 = VDTT_cw.v().c) instanceof VDTT_kp || var4 instanceof VDTT_lt || var4 instanceof VDTT_mn) && (var10 = var9.L()) != null) {
            for(int var5 = 0; var5 < var10.length; ++var5) {
               if (var10[var5].b[0] == 298) {
                  this.K += 16;
               }
            }
         }

         int var11 = VDTT_dg.b(VDTT_dg.f, var9.getItemTemplate().b + " (+" + var9.s + ")");
         if (this.J < var11 + 32) {
            this.J = var11 + 32;
         }

         while(this.n + this.J > this.a.q) {
            this.n -= 32;
         }

         if (this.I + this.K + 8 > DataCenter.d().o) {
            this.I = DataCenter.d().o - this.K - 8;
         }

         this.L[0] = new VDTT_ba(this.J - 17, 3, 0, 0, "", this.a, 100, 52);
         this.L[1] = new VDTT_ba(8, this.K - 27, 50, 0, var8.l, this.a, var8.m, 15);
         this.L[2] = new VDTT_ba(58, this.K - 27, 50, 0, Caption.qt, this.a, 101, 15);
         VDTT_ba var13;
         if ((var13 = var3.i()) == null) {
            var13 = var3.j();
         }

         if (var13 != null) {
            this.L[3] = new VDTT_ba(108, this.K - 27, 50, 0, var13.l, this.a, var13.m, 15);
         }

         for(var1 = 1; var1 < this.L.length; ++var1) {
            if (this.L[var1] != null) {
               this.L[var1].d(45, 20);
            }
         }

         this.M = a(this.L);
         if (var9.equals(N) && P - O < 1000L) {
            this.Q = true;
            this.a.k = null;
            this.a(this.M[2].a(this.L[1].m, this), 0, 0);
            return;
         }

         N = var9;
         O = P;
      } else {
         this.m = true;
         if (var9.equals(N) && P - O < 1000L) {
            this.Q = true;
            this.a.k = null;
            VDTT_ba var12;
            if ((var12 = var3.h()) != null) {
               this.a(var3.n[0].a(var12.m, this), 0, 0);
            }

            return;
         }
      }

      N = var9;
      O = P;
   }

   public final void b(Graphics var1) {
      if (this.Q) {
         this.d();
         this.a.k = null;
      } else if (System.currentTimeMillis() - P >= 100L) {
         int var2 = var1.e;
         int var3 = var1.f;
         if (this.m) {
            this.l.b(var1);
         } else {
            this.a(var1, 0, 0, this.J, this.K, 61, 22, 23, 1, 1);
            this.l.b(var1, 8, 10);
            Item var4 = this.l.I;
            int var5 = 0;
            if (!var4.i() && var4.strOptions.length() > 0) {
               ++var5;
            }

            if (var4.h != -1L) {
               ++var5;
            }

            MainScreen var6 = VDTT_cw.v().c;
            boolean var7 = false;
            VDTT_gz[] var9;
            if ((var6 instanceof VDTT_kp || var6 instanceof VDTT_lt || var6 instanceof VDTT_mn) && (var9 = var4.L()) != null) {
               for(int var10 = 0; var10 < var9.length; ++var10) {
                  if (var9[var10].b[0] == 298) {
                     ++var5;
                     var7 = true;
                  }
               }
            }

            if (var5 > 0) {
               this.l.a(var1, var5, var7);
            }

            this.a(var1, this.L, var2, var3);
         }
      }
   }

   public final void a_() {
      if (this.m) {
         this.f(this.l.objX, this.l.objY);
         this.l.a_();
      } else {
         this.f(this.n, this.I);
         a(this.L, this.M);
      }

      DataCenter.d();
      if (!DataCenter.b() && this.a.k.equals(this)) {
         VDTT_il var2 = VDTT_cw.v().T();
         int var3 = this.a.objX + this.objX + VDTT_d.g().l() / 2;
         int var4 = this.a.objY + this.objY;
         switch(VDTT_cw.v().br) {
         case 0:
            if (VDTT_cw.v().bs == 0 && this.l.I.c == 168 || VDTT_cw.v().bs == 2 && this.l.I.c == 724) {
               this.a(var3, var4);
               return;
            }
            break;
         case 1:
            if (this.a instanceof VDTT_kb && (VDTT_cw.v().bs == 1 || VDTT_cw.v().bs == 2) && (this.l.I.c == 824 || this.l.I.c >= 771 && this.l.I.c <= 790 || this.l.I.y())) {
               this.a(var3, var4);
               return;
            }
            break;
         case 2:
            if (this.a instanceof VDTT_mq && VDTT_cw.v().bs == 1 && this.l.I.c == 194) {
               this.a(var3, var4);
               return;
            }
            break;
         case 3:
            if (this.a instanceof VDTT_mq && VDTT_cw.v().bs == 1 && this.l.I.c == 379) {
               this.a(var3, var4);
               return;
            }
         case 4:
         case 7:
         default:
            break;
         case 5:
            if (VDTT_cw.v().bs == 1 && this.a instanceof VDTT_nf) {
               if (this.l.I.i()) {
                  if (this.l.I.L() != null) {
                     this.a(var3, var4);
                  } else {
                     this.a(var3, var4);
                  }
               } else {
                  this.a(var3, var4 - 8);
               }

               DataCenter.d().aA.b = true;
               return;
            }
            break;
         case 6:
            if (VDTT_cw.v().bs >= 0 && this.l.I.c == 380 && var2 != null && VDTT_ek.m().objX == var2.g && VDTT_ek.m().objY == var2.h) {
               DataCenter.d().aA.a(var3 - 35, var4 - 12);
               DataCenter.d().aA.b = true;
               return;
            }
            break;
         case 8:
            if (VDTT_cw.v().bs >= 0 && this.l.I.c == 381 && var2 != null && VDTT_ek.m().objX == var2.g && VDTT_ek.m().objY == var2.h) {
               DataCenter.d().aA.a(var3 - 35, var4 - 12);
               DataCenter.d().aA.b = true;
               return;
            }

            Item var6 = VDTT_ek.m().C();
            if (VDTT_cw.v().bs == 7 && var6 != null && this.l.I.c == var6.c) {
               DataCenter.d().aA.a(var3 - 35, var4 - 12);
               DataCenter.d().aA.b = true;
            }

            return;
         case 9:
            if (VDTT_cw.v().bs == 10 && this.a instanceof VDTT_nf) {
               label113: {
                  if (((VDTT_nf)this.a).a.b == ((VDTT_nf)this.a).w()) {
                     if (this.l.I.getItemTemplate().f != 1 && this.l.I.getItemTemplate().f != 21) {
                        break label113;
                     }

                     VDTT_bn var10001 = this.l;
                     if (VDTT_cw.v().bX != var10001.I.c) {
                        if (this.l.I.T()) {
                           if (this.l.I.t) {
                              DataCenter.d().aA.a(var3 - 70, var4 - 12);
                           } else {
                              DataCenter.d().aA.a(var3 - 105, var4 - 12);
                           }
                           break label113;
                        }

                        if (!this.l.I.t) {
                           DataCenter.d().aA.a(var3 - 70, var4 - 12);
                           break label113;
                        }
                     }
                  }

                  DataCenter.d().aA.a(var3 - 35, var4 - 12);
               }

               DataCenter.d().aA.b = true;
               return;
            }
            break;
         case 10:
            if (VDTT_cw.v().bs == 5 && this.a instanceof VDTT_mq) {
               DataCenter.d().aA.a(var3 - 70, var4 - 12);
               DataCenter.d().aA.b = true;
            }
         }
      }

   }

   private void a(int var1, int var2) {
      if (this.m) {
         var1 = this.a.objX + this.objX + this.q;
         var2 = this.a.objY + this.objY + this.r;
         DataCenter.d().aA.a(var1 - 35, var2 - 12);
         DataCenter.d().aA.b = true;
      } else {
         if (this.l.I.getItemTemplate().f != 35 && this.l.I.getItemTemplate().f != 36 && this.l.I.getItemTemplate().f != 32) {
            DataCenter.d().aA.a(var1 + 28, var2 + 35);
         } else {
            DataCenter.d().aA.a(var1 + 28, var2 + 65);
         }

         DataCenter.d().aA.b = true;
      }
   }

   public final Vector g() {
      Vector var1 = new Vector();
      if (this.m) {
         return this.l.g();
      } else {
         for(int var2 = 0; var2 < this.M.length; ++var2) {
            if (this.L[var2] != null) {
               var1.addElement(this.M[var2].a(this.L[var2].m, this));
            }
         }

         var1.addElement(new VDTT_hl(1011, 0, 0, this.J, this.K, (VDTT_hs)null, this));
         return var1;
      }
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (this.m) {
         this.l.a(var1, var2, var3);
      } else {
         switch(var1.b) {
         case 100:
            this.d();
            return;
         case 101:
            this.m = true;
            return;
         case 1011:
            return;
         default:
            this.d();
            this.l.a(var1, var2, var3);
         }
      }
   }

   private void d() {
      this.a.b((VDTT_m)this);
   }
}
