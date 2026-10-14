package core.mchien.main2;

import java.util.Vector;

public final class VDTT_mq extends VDTT_jr {
   private VDTT_ht P;
   private VDTT_ba Q;
   private VDTT_ba R;
   public Item[] O = new Item[16];

   public VDTT_mq(VDTT_p var1) {
      super(var1, Caption.zQ);
      this.Q = this.a(this.q / 2 - 35, this.r - 33, Caption.bi, this, 5002, -8);
      this.a(this.Q, 0);
      this.R = this.a(6, this.r - 50, Caption.lh, this, 2002, -8);
      this.a(this.R, 0);
      this.P = new VDTT_ht((byte)1, 7, this.f() + 3, 128, 128, 32, VDTT_jb.c(this.O.length, 4), 4);
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         this.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         int var4;
         VDTT_mq var8;
         switch(var1.b) {
         case 2002:
            var8 = this;
            Vector var10 = new Vector();
            int var5;
            int var6;
            VDTT_ir var11;
            VDTT_il var12;
            VDTT_il var13;
            if ((var11 = VDTT_cw.v().S()).b()) {
               for(var4 = 0; var4 < var11.p.size(); ++var4) {
                  if ((var13 = (VDTT_il)var11.p.elementAt(var4)).a()) {
                     var6 = var13.b();
                     var10.add(var6);
                  }
               }
            } else if ((var12 = VDTT_cw.v().T()) != null) {
               var5 = var12.b();
               var10.add(var5);
            }

            for(var4 = 0; var4 < VDTT_ek.m().aP.length; ++var4) {
               if (VDTT_ek.m().aP[var4] != null && var10.contains(VDTT_ek.m().aP[var4].c)) {
                  var8.b(VDTT_ek.m().aP[var4]);
               }
            }

            boolean var10000;
            if (var11.b()) {
               var4 = 0;

               while(true) {
                  if (var4 >= var11.p.size()) {
                     var10000 = true;
                     return;
                  }

                  if ((var13 = (VDTT_il)var11.p.elementAt(var4)).a()) {
                     var6 = 0;

                     for(var2 = 0; var2 < var8.O.length; ++var2) {
                        if (var8.O[var2] != null && var8.O[var2].c == var13.b()) {
                           var6 += var8.O[var2].M();
                        }
                     }

                     if (var6 < var13.i) {
                        break;
                     }
                  }

                  ++var4;
               }
            } else if ((var12 = VDTT_cw.v().T()) != null) {
               var5 = 0;

               for(var6 = 0; var6 < var8.O.length; ++var6) {
                  if (var8.O[var6] != null && var8.O[var6].c == var12.b() && (var5 += var8.O[var6].M()) >= var12.i) {
                     var10000 = true;
                     return;
                  }
               }
            }

            var10000 = false;
            break;
         case 5001:
            this.k = a(var1, this, this.O[var1.j.k]);
            return;
         case 5002:
            var8 = this;

            try {
               Message var9 = new Message((byte)10);
               var3 = 0;

               for(var4 = 0; var4 < var8.O.length; ++var4) {
                  if (var8.O[var4] != null) {
                     ++var3;
                  }
               }

               var9.a(var3);

               for(var4 = 0; var4 < var8.O.length; ++var4) {
                  if (var8.O[var4] != null) {
                     var9.b(var8.O[var4].f);
                  }
               }

               var9.l();
            } catch (Exception var7) {
               VDTT_jb.a(var7);
               return;
            }
         }
      }

   }

   private void b(Item var1) {
      try {
         for(int var2 = 0; var2 < this.O.length; ++var2) {
            if (this.O[var2] == null) {
               this.O[var2] = var1;
               break;
            }
         }

         VDTT_ek.m().aP[var1.f] = null;
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      super.b(var1);
      if (super.a.b == 0) {
         this.a(var1, this.P);

         int var2;
         for(var2 = 0; var2 < this.P.i; ++var2) {
            for(int var3 = 0; var3 < this.P.P; ++var3) {
               if (this.P.b(var2)) {
                  b(var1, var3 * this.P.h, var2 * this.P.h, this.O[var2 * this.P.P + var3], var2 * this.P.P + var3 == this.P.k);
               }
            }
         }

         this.a(var1);
         this.a(var1, this.objX + 4, this.objY + this.f());
         byte var7 = 10;
         int var10003 = this.P.q + 10;
         var2 = var7 + 15;
         VDTT_dg.b(VDTT_dg.d, var1, Caption.jM, var10003, 25, 0, -1, -16777216);
         VDTT_ir var8 = VDTT_cw.v().S();
         if (VDTT_cw.v().bs >= var8.p.size()) {
            for(int var9 = 0; var9 < var8.p.size(); ++var9) {
               VDTT_il var10;
               if ((var10 = (VDTT_il)var8.p.elementAt(var9)).a()) {
                  int var6 = var10.b();
                  VDTT_dg var10000 = VDTT_dg.d;
                  String var10002 = "- " + var10.i + " " + DataCenter.d().O[var6].b;
                  var10003 = this.P.q + 15;
                  var2 += 15;
                  VDTT_dg.b(var10000, var1, var10002, var10003, var2, 0, -1, -16777216);
               }
            }

            return;
         }

         VDTT_il var4;
         if ((var4 = VDTT_cw.v().T()) != null) {
            int var5 = var4.b();
            VDTT_dg.b(VDTT_dg.d, var1, "- " + var4.i + " " + DataCenter.d().O[var5].b, this.P.q + 15, 40, 0, -1, -16777216);
         }
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         this.P.a();
      }

      DataCenter.d();
      if (!DataCenter.b() && this.I.b.lastElement().equals(this)) {
         if (VDTT_cw.v().br == 1 && VDTT_cw.v().bs == 1) {
            this.g(378);
         } else if (VDTT_cw.v().br == 2 && VDTT_cw.v().bs == 1) {
            this.g(194);
         } else if (VDTT_cw.v().br == 3 && VDTT_cw.v().bs == 1) {
            this.g(379);
         } else {
            if (VDTT_cw.v().br == 13 && VDTT_cw.v().bs == 2) {
               boolean var1 = true;
               var1 = true;
               int var10001;
               if (super.a.b != 0) {
                  var10001 = this.objX + 70;
                  DataCenter.d().aA.a(var10001, this.objY + 10);
                  DataCenter.d().aA.b = true;
                  return;
               }

               int var10002;
               if (this.h(194) > 0) {
                  var10001 = this.objX + this.q / 2;
                  var10002 = this.objY + this.r;
                  DataCenter.d().aA.a(var10001, var10002 - 20);
               } else {
                  var10001 = this.objX + 35;
                  var10002 = this.objY + this.r;
                  DataCenter.d().aA.a(var10001, var10002 - 40);
               }

               DataCenter.d().aA.b = true;
            } else {
               if (VDTT_cw.v().br == 15 && VDTT_cw.v().bs == 1) {
                  this.g(382);
                  return;
               }

               if (VDTT_cw.v().br == 16 && VDTT_cw.v().bs == 1) {
                  this.g(195);
                  return;
               }

               if (VDTT_cw.v().br == 19) {
                  switch(VDTT_cw.v().bs) {
                  case 1:
                     this.g(383);
                     return;
                  case 4:
                     this.g(384);
                  }
               }
            }

         }
      }
   }

   private void g(int var1) {
      int var10001;
      if (super.a.b == 0) {
         int var10002;
         if (this.h(var1) > 0) {
            var10001 = this.objX + this.q / 2;
            var10002 = this.objY + this.r;
            DataCenter.d().aA.a(var10001, var10002 - 20);
         } else {
            var10001 = this.objX + 35;
            var10002 = this.objY + this.r;
            DataCenter.d().aA.a(var10001, var10002 - 40);
         }

         DataCenter.d().aA.b = true;
      } else {
         var10001 = this.objX + 70;
         DataCenter.d().aA.a(var10001, this.objY + 10);
         DataCenter.d().aA.b = true;
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
