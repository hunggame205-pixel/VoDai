package core.mchien.main2;

import java.util.Vector;

public final class VDTT_li extends VDTT_jr {
   private VDTT_ht P;
   private VDTT_ba Q;
   public Item[] O = new Item[16];

   public VDTT_li(VDTT_p var1) {
      super(var1, Caption.AQ);
      this.Q = this.a(this.q / 2 - 35, this.r - 33, Caption.bi, this, 5002, -8);
      this.a(this.Q, 0);
      this.P = new VDTT_ht((byte)1, 7, this.f() + 3, 128, 128, 32, VDTT_jb.c(this.O.length, 4), 4);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         Item var3;
         if ((var3 = var1[var2]) != null && (var3.c == 171 || var3.c == 172 || var3.c == 173 || var3.c == 355 || var3.c == 356 || var3.c == 357 || var3.c == 358 || var3.c == 359 || var3.c == 360 || var3.c == 361 || var3.c == 362 || var3.c == 363)) {
            this.ak.add(var1[var2]);
         }
      }

   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         this.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 5001:
            this.k = a(var1, this, this.O[var1.j.k]);
            return;
         case 5002:
            VDTT_li var6 = this;

            try {
               Message var7 = Message.c((byte)-53);
               var3 = 0;

               int var4;
               for(var4 = 0; var4 < var6.O.length; ++var4) {
                  if (var6.O[var4] != null) {
                     ++var3;
                  }
               }

               var7.a(var3);

               for(var4 = 0; var4 < var6.O.length; ++var4) {
                  if (var6.O[var4] != null) {
                     var7.b(var6.O[var4].f);
                  }
               }

               var7.l();
               return;
            } catch (Exception var5) {
               VDTT_jb.a(var5);
            }
         }
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      super.b(var1);
      if (super.a.b == 0) {
         VDTT_dg.b(VDTT_dg.d, var1, Caption.pN, 144, this.f() + 20, 0, -1, -16777216);
         VDTT_dg.b(VDTT_dg.d, var1, Caption.pO, 144, this.f() + 36, 0, -1, -16777216);
         VDTT_dg.b(VDTT_dg.d, var1, Caption.pP, 144, this.f() + 52, 0, -1, -16777216);
         VDTT_dg.b(VDTT_dg.d, var1, Caption.pQ, 144, this.f() + 68, 0, -1, -16777216);
         this.a(var1, this.P);

         for(int var2 = 0; var2 < this.P.i; ++var2) {
            for(int var3 = 0; var3 < this.P.P; ++var3) {
               if (this.P.b(var2)) {
                  b(var1, var3 * this.P.h, var2 * this.P.h, this.O[var2 * this.P.P + var3], var2 * this.P.P + var3 == this.P.k);
               }
            }
         }

         this.a(var1);
         this.a(var1, this.objX + 4, this.objY + this.f());
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         this.P.a();
      } else {
         this.B();
      }

      DataCenter.d();
      if (!DataCenter.b() && this.I.b.lastElement().equals(this)) {
         if (VDTT_cw.v().br == 1 && VDTT_cw.v().bs == 1) {
            this.g(378);
            return;
         }

         if (VDTT_cw.v().br == 2 && VDTT_cw.v().bs == 1) {
            this.g(194);
            return;
         }

         if (VDTT_cw.v().br == 3 && VDTT_cw.v().bs == 4) {
            this.g(379);
            return;
         }

         if (VDTT_cw.v().br == 6 && VDTT_cw.v().bs == 3) {
            this.g(201);
            return;
         }

         boolean var1;
         int var10001;
         int var10002;
         if (VDTT_cw.v().br == 7 && VDTT_cw.v().bs == 3) {
            var1 = true;
            var1 = true;
            if (super.a.b != 0) {
               if (this.k == null) {
                  int[] var2;
                  if (VDTT_ek.m().f(207) > 0) {
                     if ((var2 = VDTT_ek.m().d(207)) != null) {
                        var10001 = this.objX + var2[0] + 15;
                        DataCenter.d().aA.a(var10001, this.objY + 25 + var2[1] + 15);
                     }
                  } else if (VDTT_ek.m().f(208) > 0) {
                     if ((var2 = VDTT_ek.m().d(208)) != null) {
                        var10001 = this.objX + var2[0] + 15;
                        DataCenter.d().aA.a(var10001, this.objY + 25 + var2[1] + 15);
                     }
                  } else {
                     var10001 = this.objX + 70;
                     DataCenter.d().aA.a(var10001, this.objY + 10);
                  }

                  DataCenter.d().aA.b = true;
               }

               return;
            }

            if (this.h(207) > 0) {
               var10001 = this.objX + this.q / 2;
               var10002 = this.objY + this.r;
               DataCenter.d().aA.a(var10001, var10002 - 20);
            } else {
               var10001 = this.objX + 160;
               DataCenter.d().aA.a(var10001, this.objY + 10);
            }

            DataCenter.d().aA.b = true;
         } else {
            if (VDTT_cw.v().br == 10 && VDTT_cw.v().bs == 5) {
               this.g(381);
               return;
            }

            if (VDTT_cw.v().br == 11 && VDTT_cw.v().bs == 5) {
               var1 = true;
               if (super.a.b == 0) {
                  if (this.h(382) == 0) {
                     var10001 = this.objX + 40;
                     var10002 = this.objY + this.r;
                     DataCenter.d().aA.a(var10001, var10002 - 35);
                  } else {
                     var10001 = this.objX + this.q / 2;
                     var10002 = this.objY + this.r;
                     DataCenter.d().aA.a(var10001, var10002 - 20);
                  }

                  DataCenter.d().aA.b = true;
                  return;
               }

               var10001 = this.objX + 70;
               DataCenter.d().aA.a(var10001, this.objY + 10);
               DataCenter.d().aA.b = true;
            }
         }
      }

   }

   private void g(int var1) {
      int var10001;
      if (super.a.b == 0) {
         if (this.h(var1) > 0) {
            var10001 = this.objX + this.q / 2;
            int var10002 = this.objY + this.r;
            DataCenter.d().aA.a(var10001, var10002 - 20);
         } else {
            var10001 = this.objX + 160;
            DataCenter.d().aA.a(var10001, this.objY + 10);
         }

         DataCenter.d().aA.b = true;
      } else {
         if (this.k == null) {
            if (VDTT_ek.m().f(var1) > 0) {
               int[] var3;
               if ((var3 = VDTT_ek.m().d(var1)) != null) {
                  var10001 = this.objX + var3[0] + 15;
                  DataCenter.d().aA.a(var10001, this.objY + 25 + var3[1] + 15);
               }
            } else {
               var10001 = this.objX + 70;
               DataCenter.d().aA.a(var10001, this.objY + 10);
            }

            DataCenter.d().aA.b = true;
         }

      }
   }

   private int h(int var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < this.O.length; ++var3) {
         if (this.O[var3] != null && this.O[var3].c == var1) {
            var2 += this.O[var3].M();
         }
      }

      return var2;
   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         var1.addElement(this.P.a(5001, this));
      }

      return var1;
   }

   public final void d() {
      super.d();

      for(int var1 = 0; var1 < this.O.length; ++var1) {
         if (this.O[var1] != null) {
            int var10001 = this.O[var1].f;
            VDTT_ek.m().aP[var10001] = this.O[var1];
            this.O[var1] = null;
         }
      }

   }
}
