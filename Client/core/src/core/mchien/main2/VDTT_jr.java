package core.mchien.main2;

import java.util.Vector;

public class VDTT_jr extends VDTT_aq {
   public Item[] ab;
   public Item[] ac;
   public int ad;
   protected VDTT_hs[] ae = new VDTT_hs[3];
   protected VDTT_ht[] af = new VDTT_ht[1];
   private int O;
   public VDTT_ba ag;
   public VDTT_ba ah;
   public VDTT_bd ai;
   public Item[] aj;
   private String[] P;
   public Vector ak = new Vector();
   public boolean al;

   public VDTT_jr(VDTT_p var1, String[] var2) {
      super(var1);
      this.P = var2;

      int var3;
      try {
         int var6 = 0;

         for(var3 = 0; var3 < VDTT_ek.m().aP.length; ++var3) {
            if (VDTT_ek.m().aP[var3] != null) {
               ++var6;
               var6 += VDTT_ek.m().aP[var3].strOptions.length();
            }
         }

         for(var3 = 0; var3 < VDTT_ek.m().aR.length; ++var3) {
            if (VDTT_ek.m().aR[var3] != null) {
               ++var6;
               var6 += VDTT_ek.m().aR[var3].strOptions.length();
            }
         }

         for(var3 = 0; var3 < VDTT_ek.m().aS.length; ++var3) {
            if (VDTT_ek.m().aS[var3] != null) {
               ++var6;
               var6 += VDTT_ek.m().aS[var3].strOptions.length();
            }
         }

         Message var9;
         (var9 = new Message((byte)-56)).b(var6);
         var9.l();
      } catch (Exception var5) {
      }

      try {
         this.aj = VDTT_ek.m().aP;
         this.K = false;
         this.a(299);
         VDTT_hp var7 = new VDTT_hp(-1000);
         if (var2 == null) {
            var7.c = new String[]{Caption.y};
         } else if (this.C()) {
            var7.c = var2;
         } else {
            var7.c = new String[var2.length + 1];

            for(var3 = 0; var3 < var2.length; ++var3) {
               var7.c[var3] = var2[var3];
            }

            var7.c[var2.length] = Caption.y;
         }

         if (var7.c.length <= 3) {
            this.a(var7, 170, 92, var7.c.length);
         } else {
            this.a(var7, 170, 66, var7.c.length);
         }

         if (!this.C()) {
            if (this.ag == null) {
               this.ag = this.a(this.q - 52, this.r - 28, Caption.C, this, 0, -8);
               this.ag.d(45, this.ag.r);
               this.a(this.ag, this.w());
            }

            if (this.ai == null) {
               this.ai = this.a(85, this.ag.objY + 3, Caption.xE, 1093);
               this.a(this.ai, this.w());
            }

            if (this.ah == null) {
               this.ah = this.a(this.q - 100, this.r - 28, Caption.qv, this, 5000, -28);
               this.ah.d(45, this.ag.r);
               this.a(this.ah, this.w());
            }

            this.A();
            this.ae[0] = new VDTT_hs((byte)0, 103, this.f() + 3, 93, 18, 93, 1);
            this.ae[1] = new VDTT_hs((byte)0, 7, this.f() + 3, 93, 18, 93, 1);
            this.ae[2] = new VDTT_hs((byte)0, 199, this.f() + 3, 93, 18, 93, 1);
            if (!(this instanceof VDTT_lq) && !(this instanceof VDTT_jp)) {
               this.f(var7.b);
            }
         }

         if (DataCenter.l()) {
            this.ah.b(true);
            this.ag.b(true);
            boolean var8 = true;
            this.ai.d = var8;
            this.ae[0] = new VDTT_hs((byte)0, 12, this.f() + 8, 78, 18, 78, 1);
            this.ae[1] = new VDTT_hs((byte)0, 12, this.f() + 16 + 18, 78, 18, 78, 1);
            this.ae[2] = new VDTT_hs((byte)0, 12, this.f() + 24 + 36, 78, 18, 78, 1);
         }

      } catch (Exception var4) {
      }
   }

   private boolean C() {
      return this instanceof VDTT_mj && DataCenter.l();
   }

   public int z() {
      return this.O;
   }

   public final void A() {
      this.B();
      this.D();
   }

   public final void B() {
      this.ak.clear();
      this.al = false;
      this.a(VDTT_ek.m().aP);
      if (!this.al) {
         this.aj = new Item[VDTT_ek.m().aP.length];

         for(int var1 = 0; var1 < this.ak.size(); ++var1) {
            this.aj[var1] = (Item)this.ak.get(var1);
         }
      }

      this.a(VDTT_ek.m().aR);
      this.a(VDTT_ek.m().aS);
      this.a(VDTT_ek.m().aU);
   }

   public void a(Item[] var1) {
      if (var1.equals(VDTT_ek.m().aP)) {
         this.aj = var1;
         this.al = true;
      }

   }

   private void D() {
      if (!DataCenter.l()) {
         this.af[0] = new VDTT_ht((byte)1, 7, this.f() + 24, 288, 160, 32, VDTT_jb.c(this.aj.length, 9), 9);
      } else {
         this.af[0] = new VDTT_ht((byte)1, 97, this.f() + 8, 192, 192, 32, VDTT_jb.c(this.aj.length, 6), 6);
      }
   }

   public void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (super.a.b == this.w()) {
         switch(var1.b) {
         case 0:
            VDTT_cw.v();
            VDTT_cw.n(0);
            return;
         case 5000:
            VDTT_cw.v();
            VDTT_cw.o(97);
            return;
         case 5001:
            this.O = 0;
            this.a(var1.j, var1.j.k);
            if (var1.j.k >= 0 && this.aj.length > var1.j.k) {
               this.k = a(var1, this, this.aj[var1.j.k]);
               return;
            }
            break;
         case 5002:
            this.O = 1;
            this.a(var1.j, var1.j.k);
            if (var1.j.k >= 0) {
               this.k = a(var1, this, VDTT_ek.m().aT[var1.j.k]);
               return;
            }
            break;
         case 5003:
            this.a(var1.j, var1.j.k);
            if (var1.j.k >= 0) {
               this.k = b(Caption.yL[0], this, var1.j.objX + 30, var1.j.objY, 30);
            }

            this.k.q = 60;
            return;
         case 5004:
            this.a(var1.j, var1.j.k);
            this.k = b("c#yellow" + Caption.yS[0], this, var1.j.objX + 30, var1.j.objY, 30);
            this.k.q = 60;
            return;
         case 5005:
            this.a(var1.j, var1.j.k);
            this.k = b(Caption.yL[1], this, var1.j.objX + 30, var1.j.objY, 30);
            this.k.q = 60;
            return;
         case 5006:
            this.a(var1.j, var1.j.k);
            this.k = b("c#yellow" + Caption.yS[1], this, var1.j.objX + 30, var1.j.objY, 30);
            this.k.q = 60;
         }
      }

   }

   public void perform(int var1, Object var2, VDTT_z var3) {
      try {
         if (var1 >= 30000) {
            VDTT_hp var5 = (VDTT_hp)var2;
            var1 -= 30000;
            Message var6;
            (var6 = new Message((byte)-25)).b(var5.a);
            var6.a(var1);
            var6.a(var5.e);
            var6.l();
            if (VDTT_ek.m().aP[var5.a] != null && VDTT_ek.m().aP[var5.a].af()) {
               VDTT_ek.m().S();
               VDTT_cw.v().bv = null;
            }
         }

      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }
   }

   public void b(int var1, Object var2) {
   }

   public void b(Graphics var1) {
      Vector var6;
      Vector var8;
      int var9;
      if (DataCenter.l() && !this.C()) {
         Graphics var3 = var1;
         VDTT_jr var2 = this;
         this.a(var1, this.objX, this.objY, this.q, this.r, Caption.aZ, (byte)2, this.K);
         if (super.a.b == this.w()) {
            int var4 = var1.e;
            int var5 = var1.f;
            this.a(var1, this.af[0]);
            var6 = new Vector();
            Vector var7 = new Vector();
            var8 = new Vector();
            Vector var10 = new Vector();

            int var11;
            int var12;
            Item var13;
            for(var11 = 0; var11 < var2.af[0].i; ++var11) {
               for(var12 = 0; var12 < var2.af[0].P; ++var12) {
                  var9 = var11 * var2.af[0].P + var12;
                  if ((var13 = var2.aj[var9]) != null) {
                     var6.add(var13);
                  }

                  Item var14;
                  if ((var14 = VDTT_ek.m().aP[var9]) != null) {
                     var7.add(var14);
                  } else {
                     var8.add(var14);
                  }

                  if (var2.af[0].b(var11)) {
                     if (var13 != null && var13.v != null) {
                        if (var13.v.q()) {
                           var13.v = null;
                        } else {
                           var13.v.n();
                           var13.v.f(var12 * var2.af[0].h, var11 * var2.af[0].h);
                           var10.add(var13.v);
                        }
                     }

                     b(var3, var12 * var2.af[0].h, var11 * var2.af[0].h, var13, var9 == var2.af[0].k);
                     if (var9 >= VDTT_ek.m().ad) {
                        VDTT_aa.a(var3, -23, 0, var12 * var2.af[0].h + 1, var11 * var2.af[0].h + 1, 27, (int)27);
                     }
                  }
               }
            }

            if (var7.size() != var6.size()) {
               var7.addAll(var8);
            }

            var7.removeAll(var6);

            for(var11 = 0; var11 < var2.af[0].i; ++var11) {
               for(var12 = 0; var12 < var2.af[0].P; ++var12) {
                  var9 = var11 * var2.af[0].P + var12;
                  if (var2.aj[var9] == null && var7.size() > 0) {
                     var13 = (Item)var7.remove(0);
                     if (var2.af[0].b(var11)) {
                        if (var13 != null && var13.v != null) {
                           if (var13.v.q()) {
                              var13.v = null;
                           } else {
                              var13.v.n();
                              var13.v.f(var12 * var2.af[0].h, var11 * var2.af[0].h);
                              var10.add(var13.v);
                           }
                        }

                        b(var3, var12 * var2.af[0].h, var11 * var2.af[0].h, var13, var9 == var2.af[0].k);
                        VDTT_aa.a(var3, -23, 0, var12 * var2.af[0].h + 1, var11 * var2.af[0].h + 1, 27, (int)27);
                     }
                  }
               }
            }

            for(var11 = 0; var11 < var10.size(); ++var11) {
               ((VDTT_ev)var10.get(var11)).b(var3, 14, 14);
            }

            var2.a((Graphics)var3);
            var2.af[0].b(var3, var2);
            var2.a(var3, var2.objX + 4, var2.objY + var2.f());
            var3.f(5014425);

            for(var12 = 0; var12 < VDTT_ek.m().aP.length; ++var12) {
               VDTT_ek.m();
            }

            for(var12 = 0; var12 < var2.ae.length; ++var12) {
               var2.a(var3, var2.objX + var2.ae[var12].objX, var2.objY + var2.ae[var12].objY);
               var3.c(-2965602);
               var2.a(var3, 0, 0, var2.ae[var12].q, var2.ae[var12].r, 61, 55, 56);
               var3.f();
               switch(var12) {
               case 0:
                  a(var3, 0, 10, "", (byte)0);
                  VDTT_dg.b(VDTT_dg.d, var3, VDTT_jb.c(VDTT_ek.m().ak), 30, 9, 20, -3089954, -16777216);
                  break;
               case 1:
                  a(var3, 0, 8, "", (byte)2);
                  VDTT_dg.b(VDTT_dg.d, var3, VDTT_jb.c(VDTT_ek.m().an), 30, 9, 20, -2560, -16777216);
                  break;
               case 2:
                  a(var3, 0, 10, "", (byte)1);
                  VDTT_dg.b(VDTT_dg.d, var3, VDTT_jb.c(VDTT_ek.m().al), 30, 9, 20, -3089954, -16777216);
                  break;
               case 3:
                  a(var3, 0, 8, "", (byte)3);
                  VDTT_dg.b(VDTT_dg.d, var3, VDTT_jb.c(VDTT_ek.m().am), 30, 9, 20, -2560, -16777216);
               }
            }

            var2.a(var3, var4, var5);
         }
      }

      super.b(var1);
      if (super.a.b == this.w() && !this.C()) {
         int var15 = var1.e;
         int var16 = var1.f;
         this.a(var1, this.af[0]);
         Vector var17 = new Vector();
         Vector var18 = new Vector();
         var6 = new Vector();
         var8 = new Vector();

         int var19;
         int var20;
         Item var21;
         for(var9 = 0; var9 < this.af[0].i; ++var9) {
            for(var20 = 0; var20 < this.af[0].P; ++var20) {
               var19 = var9 * this.af[0].P + var20;
               if ((var21 = this.aj[var19]) != null) {
                  var17.add(var21);
               }

               Item var22;
               if ((var22 = VDTT_ek.m().aP[var19]) != null) {
                  var18.add(var22);
               } else {
                  var6.add(var22);
               }

               if (this.af[0].b(var9)) {
                  if (var21 != null && var21.v != null) {
                     if (var21.v.q()) {
                        var21.v = null;
                     } else {
                        var21.v.n();
                        var21.v.f(var20 * this.af[0].h, var9 * this.af[0].h);
                        var8.add(var21.v);
                     }
                  }

                  b(var1, var20 * this.af[0].h, var9 * this.af[0].h, var21, var19 == this.af[0].k);
                  if (var19 >= VDTT_ek.m().ad) {
                     VDTT_aa.a(var1, -23, 0, var20 * this.af[0].h + 1, var9 * this.af[0].h + 1, 27, (int)27);
                  }
               }
            }
         }

         if (var18.size() != var17.size()) {
            var18.addAll(var6);
         }

         var18.removeAll(var17);

         for(var9 = 0; var9 < this.af[0].i; ++var9) {
            for(var20 = 0; var20 < this.af[0].P; ++var20) {
               var19 = var9 * this.af[0].P + var20;
               if (this.aj[var19] == null && var18.size() > 0) {
                  var21 = (Item)var18.remove(0);
                  if (this.af[0].b(var9)) {
                     if (var21 != null && var21.v != null) {
                        if (var21.v.q()) {
                           var21.v = null;
                        } else {
                           var21.v.n();
                           var21.v.f(var20 * this.af[0].h, var9 * this.af[0].h);
                           var8.add(var21.v);
                        }
                     }

                     b(var1, var20 * this.af[0].h, var9 * this.af[0].h, var21, var19 == this.af[0].k);
                     VDTT_aa.a(var1, -23, 0, var20 * this.af[0].h + 1, var9 * this.af[0].h + 1, 27, (int)27);
                  }
               }
            }
         }

         for(var9 = 0; var9 < var8.size(); ++var9) {
            ((VDTT_ev)var8.get(var9)).b(var1, 14, 14);
         }

         this.a((Graphics)var1);
         this.af[0].b(var1, this);
         this.a(var1, this.objX + 4, this.objY + this.f());
         var1.f(5014425);
         var9 = 0;

         for(var20 = 0; var20 < VDTT_ek.m().aP.length; ++var20) {
            if (VDTT_ek.m().aP[var20] != null) {
               ++var9;
            }
         }

         if (!DataCenter.l()) {
            VDTT_dg.b(VDTT_dg.d, var1, Caption.bq + " " + var9 + "/" + VDTT_ek.m().ad, 3, this.ag.objY - 19, 0, -1, -16777216);
         }

         for(var20 = 0; var20 < this.ae.length; ++var20) {
            this.a(var1, this.objX + this.ae[var20].objX, this.objY + this.ae[var20].objY);
            var1.c(-2965602);
            this.a(var1, 0, 0, this.ae[var20].q, this.ae[var20].r, 61, 55, 56);
            var1.f();
            switch(var20) {
            case 0:
               a(var1, 0, 10, "", (byte)0);
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(VDTT_ek.m().ak), 30, 9, 20, -3089954, -16777216);
               break;
            case 1:
               a(var1, 0, 8, "", (byte)2);
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(VDTT_ek.m().an), 30, 9, 20, -2560, -16777216);
               break;
            case 2:
               a(var1, 0, 10, "", (byte)1);
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(VDTT_ek.m().al), 30, 9, 20, -3089954, -16777216);
               break;
            case 3:
               a(var1, 0, 8, "", (byte)3);
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(VDTT_ek.m().am), 30, 9, 20, -2560, -16777216);
            }
         }

         this.a(var1, var15, var16);
      }

   }

   public void a_() {
      super.a_();
      if (this.af[0].i * this.af[0].P != VDTT_ek.m().aP.length) {
         this.A();
      }

      if (super.a.b == this.w()) {
         for(int var1 = 0; var1 < this.af.length; ++var1) {
            this.af[var1].a();
         }
      }

   }

   public Vector g() {
      Vector var1 = super.g();
      if (this.w() <= 0) {
         var1.removeElementAt(0);
      }

      if (super.a.b == this.w() && !this.C()) {
         var1.addElement(this.af[0].a(5001, this));

         for(int var2 = 0; var2 < this.ae.length; ++var2) {
            var1.addElement(this.ae[var2].a(5003 + var2, this));
         }
      }

      return var1;
   }

   private void a(VDTT_hs var1, int var2) {
      for(int var3 = 0; var3 < this.af.length; ++var3) {
         this.af[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void i(int var1) {
      this.a(this.af[0], var1);
   }

   public final void a(Item var1, String var2) {
      VDTT_hp var3 = new VDTT_hp(var1.f);
      String[] var6 = VDTT_jb.a(var2, ";");
      var3.c = new String[var6.length];
      var3.d = new short[var6.length];

      for(int var4 = 0; var4 < var6.length; ++var4) {
         var3.c[var4] = var6[var4];
         var3.d[var4] = (short)(30000 + var4);
      }

      VDTT_ht var8;
      (var8 = this.af[0]).k = var1.f;
      if (var8.k >= 0 && var8.k < var8.i * var8.P) {
         var8.e();
         int var5 = var8.k % var8.P;
         int var7 = var8.k / var8.P - (var8.j >= 0 ? var8.j : 0);
         if (var8.n == 0) {
            var5 = var8.k % var8.i - (var8.j >= 0 ? var8.j : 0);
            var7 = var8.k / var8.i;
         }

         var5 = var5 * var8.h + var8.h + var8.objX;
         var7 = var7 * var8.h + var8.objY;
         this.k = a(this, var5, var7, var3);
      }

   }

   public void d() {
      super.d();
      if (this.ab != null) {
         for(int var1 = 0; var1 < this.ab.length; ++var1) {
            if (this.ab[var1] != null) {
               VDTT_ek.m().i(this.ab[var1].w)[this.ab[var1].f] = this.ab[var1];
               this.ab[var1] = null;
            }
         }
      }

      if (this.ac != null && this.ac[0] != null && (this instanceof VDTT_ne || this instanceof VDTT_mn)) {
         VDTT_ek.m().i(this.ac[0].w)[this.ac[0].f] = this.ac[0];
         this.ac[0] = null;
      }

   }

   public Item[] a(Item var1) {
      return VDTT_ek.m().aP;
   }
}
