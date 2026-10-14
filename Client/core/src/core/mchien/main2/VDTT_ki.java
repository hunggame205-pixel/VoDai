package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ki extends VDTT_kd {
   public Item[] T;
   public int U;
   public int V;
   public Vector W = new Vector();
   public Vector X = new Vector();
   public Vector Y = new Vector();
   public Vector Z = new Vector();
   public Vector aa = new Vector();
   public String ab;
   public VDTT_gj ac;
   private VDTT_hs[][] ak;
   private VDTT_ht al;
   private VDTT_iq am;
   private int an;
   public VDTT_ht ad;
   public VDTT_hs[] ae;
   public VDTT_ba[] af;
   private String ao;
   private String ap;
   private int aq;
   private int ar;
   private int as;
   private int at;
   private long au;
   private String[] av;
   private int aw;
   private int ax;
   private int ay;
   private int az;
   private Vector aA;
   private VDTT_bd aB;
   private VDTT_bd aC;
   private VDTT_bd aD;
   private int aE;
   private String aF;
   private int aG;
   private VDTT_iu[] aH;
   private VDTT_ba aI;
   private VDTT_ba aJ;
   private VDTT_ba aK;
   private VDTT_ba aL;
   private VDTT_ba aM;
   private VDTT_ba aN;
   private VDTT_ba aO;
   private VDTT_ba aP;
   private Vector aQ;
   private boolean aR;
   private boolean aS;
   private boolean aT;
   public int ag;
   public int ah;
   private int aU;
   private int aV;
   private int aW;
   private XYEntity[] aX;
   public int ai;
   public int aj;
   private static int aY;

   public VDTT_ki(VDTT_p var1, Message var2) {
      super(var1, 3, Caption.zh);
      this.ao = Caption.md;
      this.ap = "";
      this.av = new String[0];
      this.aA = new Vector();
      this.aQ = new Vector();
      this.ag = 93;
      this.ah = 50;
      this.aU = -1;
      this.aV = -1;
      this.aW = 14;
      this.I = var1;
      this.K = false;
      this.a(299, 220);
      VDTT_hp var8;
      (var8 = new VDTT_hp(1001)).c = Caption.zh;
      this.ac = new VDTT_gj(var8, this.q, 1, this.f() - 3, 87, this.h() + 6, 33, this);
      this.ac.h = true;
      this.aB = this.a(this.ac.objX + 11, this.f() + this.h() - 21, Caption.gX, 100);
      VDTT_bd var10000 = this.aB;
      boolean var4 = VDTT_da.g("clan" + VDTT_ek.m().b);
      var10000.m = var4;
      this.ac.a((VDTT_m)this.aB, 1);
      this.a(this.aB, 0);
      this.aC = this.a(this.ac.objX + 102, this.f() + this.h() - 21, Caption.qs, 101);
      var4 = true;
      this.aC.m = var4;
      var4 = true;
      this.aC.d = var4;
      this.ac.a((VDTT_m)this.aC, 1);
      this.a(this.aC, 0);
      this.aD = this.a(this.ac.objX + 102, this.f() + this.h() - 21, Caption.wB, 102);
      var10000 = this.aD;
      var4 = VDTT_eq.a().a(32);
      var10000.m = var4;
      this.ac.a((VDTT_m)this.aD, 1);
      this.a(this.aD, 0);
      this.aI = this.a(this.q - 57, this.r - 30, Caption.eR, this, 61, -8);
      this.ac.a((VDTT_m)this.aI, 0);
      this.a(this.aI, 0);
      this.aJ = this.a(this.q - 110, this.r - 30, Caption.eS, this, 62, -8);
      this.ac.a((VDTT_m)this.aJ, 0);
      this.a(this.aJ, 0);
      this.aK = this.a(this.q - 163, this.r - 30, Caption.eT, this, 60, -8);
      this.ac.a((VDTT_m)this.aK, 0);
      this.a(this.aK, 0);
      this.aL = this.a(this.q - 216, this.r - 30, Caption.eU, this, 63, -8);
      this.ac.a((VDTT_m)this.aL, 0);
      this.a(this.aL, 0);
      this.aN = this.a(this.q - 110, this.r - 30, Caption.eB, this, 64, -8);
      this.ac.a((VDTT_m)this.aN, 0);
      this.a(this.aN, 0);
      this.aO = this.a(this.q - 110, this.r - 30, Caption.ve, this, 66, -8);
      this.ac.a((VDTT_m)this.aO, 0);
      this.a(this.aO, 0);
      this.aP = this.a(this.q - 110, this.r - 30, Caption.L, this, 66, -8);
      this.ac.a((VDTT_m)this.aP, 0);
      this.a(this.aP, 0);
      this.aQ.add(this.aL);
      this.aQ.add(this.aJ);
      this.aQ.add(this.aI);
      this.aQ.add(this.aN);
      this.aQ.add(this.aK);
      this.aQ.add(this.aO);
      this.aQ.add(this.aP);
      this.ak = new VDTT_hs[var8.c.length][];
      this.aM = new VDTT_ba(this.q - 98, this.r - 69, 0, 0, Caption.nt, this, 3001, 7);
      this.aM.d(50, 20);
      this.ac.a((VDTT_m)this.aM, 2);
      this.aX = new XYEntity[this.aW];
      int var9 = this.aW % 4;
      int var3 = (this.aW - 4) / 4;
      byte var10 = 0;
      byte var5 = 0;
      switch(this.aW) {
      case 10:
         var10 = 83;
         var5 = 80;
      case 11:
      case 13:
      default:
         break;
      case 12:
         var10 = 83;
         var5 = 54;
         break;
      case 14:
         var10 = 62;
         var5 = 54;
      }

      byte var6 = 0;
      this.aX[0] = XYEntity.e(0, 0);
      int var11 = var6 + 1;

      int var7;
      for(var7 = 0; var7 < var3 + var9 / 2; ++var7) {
         this.aX[var11] = XYEntity.e(var11 * var10, 0);
         ++var11;
      }

      this.aX[var11] = XYEntity.e((var3 + var9 / 2 + 1) * var10, 0);
      ++var11;

      for(var7 = 0; var7 < var3; ++var7) {
         this.aX[var11] = XYEntity.e((var3 + var9 / 2 + 1) * var10, (var7 + 1) * var5);
         ++var11;
      }

      this.aX[var11] = XYEntity.e((var3 + var9 / 2 + 1) * var10, (var3 + 1) * var5);
      ++var11;

      for(var7 = var3 - 1 + var9 / 2; var7 >= 0; --var7) {
         this.aX[var11] = XYEntity.e((var7 + 1) * var10, (var3 + 1) * var5);
         ++var11;
      }

      this.aX[var11] = XYEntity.e(0, (var3 + 1) * var5);
      ++var11;

      for(var7 = var3 - 1; var7 >= 0; --var7) {
         this.aX[var11] = XYEntity.e(0, (var7 + 1) * var5);
         ++var11;
      }

      this.am = new VDTT_iq(new VDTT_hp(200, Caption.zZ), this);
      this.a(this.aJ, 0);
      this.a(var2);
      this.ac.a(VDTT_cw.v().cw);
      this.f(aY);
   }

   private int D() {
      return 500 + this.aq * 100;
   }

   public final void a(Message var1) {
      try {
         this.W.clear();
         this.aA.clear();
         this.Y.clear();
         this.Z.clear();
         this.aa.clear();
         this.ao = var1.b.c();
         this.ap = var1.b.c();
         this.au = var1.h();
         this.aq = var1.f();
         this.ar = var1.i();
         this.as = var1.i();
         this.at = var1.i();
         this.U = var1.i();
         this.av = VDTT_dg.b(VDTT_dg.d, var1.b.c(), this.q - 30);
         this.aw = var1.readByte();
         this.ax = var1.f();
         this.ay = var1.i();
         this.az = var1.f();
         this.aS = var1.c();
         this.aT = var1.c();
         this.ai = var1.readByte();
         this.aj = var1.readByte();
         short var2 = var1.f();

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            VDTT_el var4;
            (var4 = new VDTT_el()).i = var1.readByte();
            var4.b = var1.readByte();
            byte var6 = var1.readByte();
            var4.c = var6;
            var4.d = var1.f();
            var4.a = var1.b.c();
            var4.j = var1.i();
            var4.k = var1.i();
            var4.l = var1.c();
            var4.m = var1.c();
            this.W.addElement(var4);
            if (var4.a.toLowerCase().equals(VDTT_ek.m().aD.toLowerCase())) {
               this.V = var4.i;
            }
         }

         var2 = var1.f();

         for(var3 = 0; var3 < var2; ++var3) {
            String var8 = "- " + var1.j();
            this.aA.addAll(VDTT_dg.a(VDTT_dg.d, var8, super.q - 8 - 36));
         }

         var2 = var1.f();

         for(var3 = 0; var3 < var2; ++var3) {
            Item var9;
            (var9 = new Item()).a(var1);
            this.Y.add(var9);
         }

         var2 = var1.b.a();

         for(var3 = 0; var3 < var2; ++var3) {
            this.Z.add(Integer.valueOf(var1.readByte()));
            this.aa.add(var1.i());
         }
      } catch (Exception var7) {
      }

      this.an = 14;
      this.ak[0] = new VDTT_hs[3];
      this.ak[0][0] = new VDTT_hs((byte)1, this.ac.objX + 7, this.ac.objY + 7 + 34, super.q - 8 - 15, this.an * 10, this.an, 10);
      this.ak[0][1] = new VDTT_hs((byte)1, this.ac.objX + 7, this.ac.objY + 7 + 34, super.q - 8 - 15, this.an * 10, this.an, this.av.length);
      this.ak[0][2] = new VDTT_hs((byte)1, 4, this.ac.objY + 7 + 34, super.q - 8, this.an * 11, this.an, this.aA.size());
      this.E();
      this.an = 26;
      this.F();
      this.al = new VDTT_ht((byte)1, this.ac.objX + 6, this.ac.objY + 7 + 31, 288, 160, 32, VDTT_jb.c(this.Y.size() < 45 ? 45 : this.Y.size(), 9), 9);
      this.aF = Caption.ej;
      this.aE = -7812062;
      if (this.V == 5) {
         this.aF = Caption.ek;
         this.aE = -2560;
      } else if (this.V == 4) {
         this.aF = Caption.el;
         this.aE = -3407617;
      } else {
         if (this.V == 4) {
            this.aF = Caption.em;
            this.aE = -48128;
         }

      }
   }

   private void E() {
      this.X.clear();
      if (this.aB.m) {
         for(int var1 = 0; var1 < this.W.size(); ++var1) {
            VDTT_el var2;
            if ((var2 = (VDTT_el)this.W.elementAt(var1)).l) {
               this.X.add(var2);
            }
         }
      } else {
         this.X.addAll(this.W);
      }

      VDTT_da.a("clan" + VDTT_ek.m().b, this.aB.m);
      this.ak[1] = new VDTT_hs[1];
      if (!this.aC.m) {
         this.an = 50;
         this.ak[1][0] = new VDTT_hs((byte)1, this.ac.objX + 10, this.ac.objY + 7 + 3, super.q - 8 - 14, this.an * 3, this.an, this.X.size());
      } else {
         this.an = 30;
         this.ak[1][0] = new VDTT_hs((byte)1, this.ac.objX + 10, this.ac.objY + 7 + 3, super.q - 8 - 14, this.an * 6, this.an, this.X.size());
      }
   }

   public final void a(Item var1) {
      this.I.a((MainScreen)(new VDTT_jv(this.I, var1, (byte)0, this)));
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (super.a.b < this.w()) {
         if (this.ad != null && this.ac.b.b == 0 && this.am.h() == 4) {
            if (var1.b >= 3000) {
               this.aU = var1.b - 3000;
               this.k = c(this, var1, this.T[this.aU]);
               return;
            }

            if (var1.b >= 2000) {
               this.aV = var1.b - 2000;
               this.a(this.T[this.aV]);
               return;
            }
         } else if (var1.b >= 1011 && var1.b < 1011 + this.aX.length) {
            this.aG = var1.b - 1011;
            this.F();
            return;
         }

         int var4;
         VDTT_ki var18;
         VDTT_ie var20;
         Message var22;
         switch(var1.b) {
         case 60:
            VDTT_cw.v().a((MainScreen)(new VDTT_mu(this.I)));
            return;
         case 61:
            VDTT_cw.v().a((MainScreen)(new VDTT_kz(this.I)));
            return;
         case 62:
            VDTT_cw.v().a((MainScreen)(new VDTT_me(this.I, this.U)));
            return;
         case 63:
            this.a(true);
            return;
         case 64:
            DataCenter.d().ai.a(Caption.vh, 2005, this);
            return;
         case 66:
            try {
               if (VDTT_cw.v().C().d == 8) {
                  DataCenter.d().ai.c(Caption.vg + VDTT_cw.v().C().b, -1);
                  return;
               }

               Message.c((byte)-10).l();
               return;
            } catch (Exception var15) {
               break;
            }
         case 200:
            if (var1.j.k >= 0) {
               var3 = var1.j.k;
               var18 = this;

               try {
                  var18.am.a(var3);
                  if (!var18.aR && var3 == 4) {
                     var18.aR = true;
                     VDTT_cw.v().Y.clear();
                     VDTT_cw.v();
                     VDTT_cw.o(41);
                  }
               } catch (Exception var14) {
                  return;
               }
            }
            break;
         case 1001:
            if (var1.j.k >= 0) {
               VDTT_cw.v().cw = (byte)var1.j.k;
               this.ac.a(var1.j.k);
               return;
            }
            break;
         case 1004:
            var4 = var3 - 72;
            Vector var17 = new Vector();
            if (this.V == 5) {
               var17.addElement(new VDTT_iu(60, Caption.eR));
               var17.addElement(new VDTT_iu(61, Caption.eS));
               var17.addElement(new VDTT_iu(62, Caption.eT));
            } else if (this.V == 4) {
               var17.addElement(new VDTT_iu(60, Caption.eR));
               var17.addElement(new VDTT_iu(62, Caption.eT));
               var17.addElement(new VDTT_iu(63, Caption.eU));
            } else {
               var17.addElement(new VDTT_iu(62, Caption.eT));
               var17.addElement(new VDTT_iu(63, Caption.eU));
            }

            if (var17.size() > 0) {
               String[] var24 = new String[var17.size()];
               short[] var25 = new short[var17.size()];

               for(int var26 = 0; var26 < var17.size(); ++var26) {
                  VDTT_iu var8 = (VDTT_iu)var17.elementAt(var26);
                  var24[var26] = var8.b;
                  var25[var26] = (short)var8.a;
               }

               if (var17.size() == 2) {
                  var4 += 15;
               }

               this.k = a(this, var2 + 5, var4, new VDTT_hp(0, var25, var24));
            }

            return;
         case 1010:
            if (var1.j.k >= 0) {
               int var16 = var3;
               var3 = var1.j.k;
               Vector var5 = new Vector();
               VDTT_el var6 = this.g(var3);
               String var7 = "";
               if (!var6.a.equals(VDTT_ek.m().aD)) {
                  if (this.V == 5) {
                     if (var6.i > 0) {
                        var5.addElement(new VDTT_iu(55, Caption.eJ));
                     } else {
                        var5.addElement(new VDTT_iu(65, Caption.qm));
                        var5.addElement(new VDTT_iu(56, Caption.eK));
                        var5.addElement(new VDTT_iu(57, Caption.eL));
                     }

                     var5.addElement(new VDTT_iu(58, Caption.eM));
                     var5.addElement(new VDTT_iu(59, Caption.eN));
                  } else if (this.V == 4 && var6.i <= 3) {
                     if (var6.i > 0) {
                        var5.addElement(new VDTT_iu(55, Caption.eJ));
                     } else {
                        var5.addElement(new VDTT_iu(57, Caption.eL));
                     }

                     var5.addElement(new VDTT_iu(58, Caption.eM));
                  }

                  if (this.V > 0 && this.V > var6.i) {
                     if (var6.m) {
                        var5.addElement(new VDTT_iu(64, Caption.eO));
                     } else {
                        var5.addElement(new VDTT_iu(64, Caption.eP));
                     }
                  }

                  var7 = a(var5, var6.a);
               }

               this.a(var5, var7, var3, var2, var16);
               return;
            }
            break;
         case 1100:
            return;
         case 2001:
            var18 = this;

            try {
               if (var18.ab != null) {
                  Message var23;
                  (var23 = Message.c((byte)-97)).a(var18.ab);
                  var23.l();
               }
               break;
            } catch (Exception var13) {
               return;
            }
         case 2002:
            this.a(false);
            return;
         case 2003:
            var18 = this;

            try {
               var20 = DataCenter.d().R[var18.aG];
               (var22 = Message.c((byte)-68)).a(var20.a);
               var22.l();
               break;
            } catch (Exception var12) {
               return;
            }
         case 2004:
            boolean var21 = true;
            var18 = this;

            try {
               (var22 = Message.c((byte)-99)).a(var18.ab);
               var22.a((int)5);
               var22.l();
               break;
            } catch (Exception var11) {
               return;
            }
         case 2005:
            try {
               Message.c((byte)-12).l();
               break;
            } catch (Exception var10) {
               return;
            }
         case 3001:
            var18 = this;

            try {
               if (var18.V == 5) {
                  var20 = DataCenter.d().R[var18.aG];
                  if (var18.U < var20.g) {
                     DataCenter.d().ai.c(Caption.nu, -65536);
                  } else if (var18.aq < var20.d) {
                     DataCenter.d().ai.c(Caption.nw, -65536);
                  } else {
                     DataCenter.d().ai.a(VDTT_jb.b(Caption.nv, VDTT_jb.c(var20.g)), 2003, var18);
                  }
               }
               break;
            } catch (Exception var9) {
               return;
            }
         case 5001:
            var4 = var1.j.k;
            VDTT_hs var19 = var1.j;
            this.al.k = -1;
            var19.k = var4;
            if (var1.j.k >= 0 && var1.j.k < this.Y.size()) {
               this.k = a(var1, this, (Item)this.Y.get(var1.j.k));
               return;
            }
         }
      }

   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      super.perform(var1, var2, var3);
      if (super.a.b < this.w()) {
         this.c(var1, var2);
         VDTT_ki var9;
         VDTT_hp var11;
         VDTT_el var12;
         switch(var1) {
         case 54:
            var11 = (VDTT_hp)var2;
            var9 = this;

            try {
               var12 = var9.g(var11.a);
               VDTT_cw.v().i(var12.a);
               break;
            } catch (Exception var8) {
               VDTT_jb.a(var8);
               return;
            }
         case 55:
            this.a((VDTT_hp)var2, 0);
            return;
         case 56:
            this.a((VDTT_hp)var2, 4);
            return;
         case 57:
            this.a((VDTT_hp)var2, 3);
            return;
         case 58:
            var11 = (VDTT_hp)var2;
            var9 = this;

            try {
               var12 = var9.g(var11.a);
               var9.ab = var12.a;
               DataCenter.d().ai.a(Caption.eH + var9.ab + Caption.eI, 2001, var9);
               break;
            } catch (Exception var7) {
               return;
            }
         case 59:
            var11 = (VDTT_hp)var2;
            var9 = this;

            try {
               var12 = var9.g(var11.a);
               VDTT_cw.v().a((MainScreen)(new VDTT_lx(var9.I, var12.a)));
               break;
            } catch (Exception var6) {
               return;
            }
         case 64:
            var11 = (VDTT_hp)var2;
            var9 = this;

            try {
               var12 = var9.g(var11.a);
               Message var10;
               (var10 = Message.c((byte)-91)).a(var12.a);
               var10.l();
               break;
            } catch (Exception var5) {
               return;
            }
         case 65:
            var11 = (VDTT_hp)var2;
            var9 = this;

            try {
               var12 = var9.g(var11.a);
               var9.ab = var12.a;
               DataCenter.d().ai.a(VDTT_jb.b(Caption.qn, var9.ab), 2004, var9);
               break;
            } catch (Exception var4) {
               return;
            }
         case 100:
         case 101:
            this.E();
            return;
         case 102:
            VDTT_eq.a().a(32, this.aD.m);
         }
      }

   }

   private void a(boolean var1) {
      try {
         if (var1) {
            DataCenter.d().ai.a(Caption.eG, 2002, this);
         } else {
            Message.c((byte)-96).l();
         }
      } catch (Exception var2) {
      }
   }

   private void a(VDTT_hp var1, int var2) {
      try {
         VDTT_el var5 = this.g(var1.a);
         Message var3;
         (var3 = Message.c((byte)-99)).a(var5.a);
         var3.a(var2);
         var3.l();
      } catch (Exception var4) {
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b < this.w()) {
         int var2;
         int var3;
         int var4;
         switch(this.ac.b.b) {
         case 0:
            var1.addElement(this.am.f());
            if (this.am.h() == 4) {
               if (this.ad != null) {
                  for(var4 = 0; var4 < this.af.length; ++var4) {
                     var2 = this.ad.objX + this.af[var4].objX;
                     var3 = this.ad.objY + this.af[var4].objY - this.ad.f;
                     if (VDTT_jb.a(this.ad.objX, this.ad.objY, this.ad.objX + this.ad.q, this.ad.objY + this.ad.r, var2, var3) && VDTT_jb.a(this.ad.objX, this.ad.objY, this.ad.objX + this.ad.q, this.ad.objY + this.ad.r, var2 + this.af[var4].q, var3 + this.af[var4].r)) {
                        this.ae[var4].objX = (short)var2;
                        this.ae[var4].objY = (short)var3;
                        if (this.V == 5 || this.T[var4].d() == -32) {
                           var1.addElement(new VDTT_hl(2000 + var4, this.ae[var4].objX, this.ae[var4].objY, this.ae[var4].objX + this.ae[var4].q, this.ae[var4].objY + this.ae[var4].r, this.ae[var4], this));
                        }

                        var1.addElement(new VDTT_hl(3000 + var4, var2 - 35, var3 - 9, var2 - 35 + 28, var3 - 9 + 28, this.ad, this));
                     }
                  }

                  var1.addElement(new VDTT_hl(1002, this.ad.objX, this.ad.objY, this.ad.objX + this.ad.q, this.ad.objY + this.ad.r, this.ad, this));
               }
            } else if (this.am.h() == 3) {
               var1.addElement(this.al.a(5001, this));
            } else {
               var1.addElement(this.ak[0][this.am.h()].a(1003, this));
            }
            break;
         case 1:
            var1.addElement(this.ak[this.ac.b.b][0].a(1010, this));
            break;
         case 2:
            var1.addElement(this.ak[2][0].a(1100, this));
            var2 = this.ac.objX + 9;
            var3 = this.ac.objY + 7 + 5;

            for(var4 = 0; var4 < this.aX.length; ++var4) {
               var1.add(new VDTT_hl(1011 + var4, var2 + this.aX[var4].objX, var3 + this.aX[var4].objY, var2 + this.aX[var4].objX + 28, var3 + this.aX[var4].objY + 28, (VDTT_hs)null, this));
            }
         }
      }

      return var1;
   }

   public final void b(Graphics var1) {
      super.b(var1);
      if (super.a.b < this.w()) {
         switch(this.ac.b.b) {
         case 0:
            Graphics var2 = var1;
            VDTT_ki var10 = this;
            this.am.a(var1);
            int var3;
            int var5;
            int var6;
            switch(this.am.h()) {
            case 0:
               this.a(var1, this.ak[0][this.am.h()]);
               VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, Caption.eX + this.ao, 6, 7 + 0 * this.ak[0][this.am.h()].h, 0, -1, 0);
               if (this.ax > 0) {
                  VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, VDTT_jb.b(Caption.um, VDTT_jb.g((long)this.ay * 1000L)), this.q - 25, 7 + 0 * this.ak[0][this.am.h()].h, 1, -1, 0);
                  VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, VDTT_jb.a(Caption.id, (long)(this.ax - 724)), this.q - 50, 7 + 1 * this.ak[0][this.am.h()].h, 1, -1, 0);
                  VDTT_dc.a(var1, this.ax + 12, 0, this.q - 44, 12 + 0 * this.ak[0][this.am.h()].h, 0);
               }

               if ((var3 = this.as) == 0) {
                  var3 = 1;
               }

               VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, Caption.eZ + this.aq + ", " + Caption.fa + VDTT_jb.c(this.ar) + "/" + VDTT_jb.c(this.as) + " (" + this.ar * 100 / var3 + "%)", 6, 7 + 1 * this.ak[0][this.am.h()].h, 0, -1, 0);
               String var11 = Caption.eV + VDTT_jb.c(this.at) + "/" + VDTT_jb.c(this.D());
               VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, var11, 6, 7 + 2 * this.ak[0][this.am.h()].h, 0, -1, 0);
               if (VDTT_ek.m().bh != null) {
                  var5 = this.D();
                  if (this.at >= var5) {
                     VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, "(" + Caption.fc + ")", VDTT_dg.b(VDTT_dg.d, var11) + 10, 6 + 2 * this.ak[0][this.am.h()].h, 0, -2560, 0);
                  } else {
                     VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, "(" + Caption.fb + ")", VDTT_dg.b(VDTT_dg.d, var11) + 10, 6 + 2 * this.ak[0][this.am.h()].h, 0, -48128, 0);
                  }
               }

               VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, Caption.fd + this.W.size() + "/" + (20 + this.aq), 6, 7 + 3 * this.ak[0][this.am.h()].h, 0, -1, 0);
               VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, Caption.fe + VDTT_jb.c(this.U) + Caption.fh, 6, 7 + 4 * this.ak[0][this.am.h()].h, 0, -1, 0);
               VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, Caption.sp + this.aF, 6, 7 + 5 * this.ak[0][this.am.h()].h, 0, -1, 0);
               if (VDTT_ek.m().bh != null) {
                  VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, Caption.fg + VDTT_jb.e(this.au), 6, 7 + 6 * this.ak[0][this.am.h()].h, 0, -1, 0);
               } else {
                  VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, Caption.fg, 6, 7 + 6 * this.ak[0][this.am.h()].h, 0, -1, 0);
               }

               VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, Caption.up + this.az, 6, 7 + 7 * this.ak[0][this.am.h()].h, 0, -1, 0);
               VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, VDTT_jb.a(Caption.uZ, (long)this.aw), 6, 7 + 8 * this.ak[0][this.am.h()].h, 0, -1, 0);
               if (this.aT) {
                  VDTT_dg.d(VDTT_dg.d, var1, Caption.vf, 6, 7 + 9 * this.ak[0][this.am.h()].h, 0, -7812062, 0);
               } else if (this.ai >= 0 && this.aj >= 0) {
                  VDTT_dg.d(VDTT_dg.d, var1, Caption.ff + this.ai + " " + Caption.lj + this.aj + " " + Caption.lk, 6, 7 + 9 * this.ak[0][this.am.h()].h, 0, -1, 0);
               } else {
                  VDTT_dg.d(VDTT_dg.d, var1, Caption.vd, 6, 7 + 9 * this.ak[0][this.am.h()].h, 0, -1, 0);
               }

               this.a((Graphics)var1);
               this.ak[0][this.am.h()].a(var1, this);
               return;
            case 1:
               this.a(var1, this.ak[0][this.am.h()]);

               for(var5 = 0; var5 < var10.av.length; ++var5) {
                  VDTT_dg.a((VDTT_dg)VDTT_dg.d, var2, var10.av[var5], 6, 7 + var5 * var10.ak[0][var10.am.h()].h, 0, -1, 0);
               }

               var10.a((Graphics)var2);
               var10.ak[0][var10.am.h()].a(var2, var10);
               return;
            case 2:
               this.a(var1, this.ak[0][this.am.h()]);

               for(var5 = 0; var5 < var10.aA.size(); ++var5) {
                  var6 = var5 * var10.ak[0][var10.am.h()].h;
                  if (var10.ak[0][var10.am.h()].c(var6)) {
                     VDTT_dg.a(var2, (String)var10.aA.get(var5), 7, 5 + var6, 0, -1);
                  }
               }

               var10.a((Graphics)var2);
               var10.ak[0][var10.am.h()].a(var2, var10);
               return;
            case 3:
               this.a(var1, this.al);

               for(var5 = 0; var5 < var10.al.i; ++var5) {
                  for(var6 = 0; var6 < var10.al.P; ++var6) {
                     if (var10.al.b(var5)) {
                        if (var5 * var10.al.P + var6 < var10.Y.size()) {
                           b(var2, var6 * var10.al.h, var5 * var10.al.h, (Item)var10.Y.get(var5 * var10.al.P + var6), var5 * var10.al.P + var6 == var10.al.k);
                        } else {
                           b(var2, var6 * var10.al.h, var5 * var10.al.h, (Item)null, var5 * var10.al.P + var6 == var10.al.k);
                        }
                     }
                  }
               }

               var10.a((Graphics)var2);
               VDTT_dg.b(VDTT_dg.b, var2, Caption.su, var10.q / 2, var10.al.objY + var10.al.r + 4, 2, -1, -10275328);
               var10.al.b(var2, var10);
               return;
            case 4:
               if (this.ad != null) {
                  this.a(var1, this.ad);
                  var5 = 0;

                  for(int var8 = 0; var8 < var10.ad.i; ++var8) {
                     int var4 = var8 * var10.ah;

                     for(int var9 = 0; var9 < var10.ad.P; ++var9) {
                        var3 = var9 * var10.ag;
                        if (var10.ad.b(var8)) {
                           var10.a(var2, var3, var4, var10.ag - 3, 47, -11, 22, 23, 1, 1);
                           b(var2, var3 + 5, var4 + 5, var10.T[var5], var10.aU == var5);
                           var6 = var2.e;
                           int var7 = var2.f;
                           VDTT_dg.a((VDTT_dg)VDTT_dg.b, var2, VDTT_jb.a(var10.T[var5].getItemTemplate().b, 24), var3 + 5, var4 + 39, 0, -1, -10275328);
                           var10.a(var2, var6 + var10.af[var5].objX, var7 + var10.af[var5].objY);
                           VDTT_dg.a((VDTT_dg)VDTT_dg.b, var2, Caption.aI + " " + VDTT_jb.c(var10.T[var5].c()), 0, -6, 0, -1, -11184811);
                           if (var10.T[var5].d() == -32) {
                              var10.af[var5].b(var10.T[var5].d());
                           }

                           var10.af[var5].b(var2);
                           var10.a(var2, var6, var7);
                        }

                        ++var5;
                        if (var5 >= var10.af.length) {
                           break;
                        }
                     }

                     if (var5 >= var10.af.length) {
                        break;
                     }
                  }

                  var10.a((Graphics)var2);
                  var10.ad.b(var2, var10);
               }
            default:
               return;
            }
         case 1:
            this.f(var1);
            return;
         case 2:
            this.g(var1);
         }
      }

   }

   private void f(Graphics var1) {
      this.a(var1, this.ak[1][0]);

      for(int var2 = 0; var2 < this.X.size(); ++var2) {
         VDTT_el var3 = (VDTT_el)this.X.get(var2);
         this.a(var1, 1, var2 * this.ak[1][0].h, this.ak[1][0].q - 2, this.ak[1][0].h - 2, 46, 22, 23, 1, 1);
         if (var2 == this.ak[this.ac.b.b][0].k) {
            VDTT_dc.a(var1, 2, var2 * this.ak[this.ac.b.b][0].h + 1, this.ak[this.ac.b.b][0].q - 4, this.ak[this.ac.b.b][0].h - 4);
         }

         VDTT_dg var10000;
         StringBuilder var10002;
         int var4;
         int var5;
         String var6;
         if (!this.aC.m) {
            VDTT_aa.a(var1, 92, 0, 22, var2 * this.ak[this.ac.b.b][0].h + 24, 86, (byte)3);
            VDTT_aa.a(var1, var3.a(), 0, 22, var2 * this.ak[this.ac.b.b][0].h + 24, 83, (byte)3);
            if (var3.l) {
               VDTT_dc.a(var1, 302, 0, 5, var2 * this.ak[this.ac.b.b][0].h + 32, 20);
            } else {
               VDTT_dc.a(var1, 304, 0, 5, var2 * this.ak[this.ac.b.b][0].h + 32, 20);
            }

            if (var3.m) {
               VDTT_dc.a(var1, 455, 0, this.ak[this.ac.b.b][0].q - 10, var2 * this.ak[this.ac.b.b][0].h + 36, 3);
            }

            var4 = 46;
            var5 = var2 * this.ak[this.ac.b.b][0].h + 8;
            if (var2 == this.ak[this.ac.b.b][0].l && !var3.a.equals(VDTT_ek.m().aD)) {
               ++var4;
               ++var5;
            }

            var6 = "";
            if (var3.i == 5) {
               var6 = " (" + Caption.ek + ")";
            } else if (var3.i == 4) {
               var6 = " (" + Caption.el + ")";
            } else if (var3.i == 3) {
               var6 = " (" + Caption.em + ")";
            }

            VDTT_dg.a(VDTT_dg.d, var1, Caption.zd[3] + " " + var3.a + var6, var4, var5, 0, -1);
            var10000 = VDTT_dg.d;
            var10002 = (new StringBuilder()).append(Caption.zd[4]).append(" ");
            DataCenter.d();
            VDTT_dg.a(var10000, var1, var10002.append(DataCenter.c(var3.c)).append(", ").append(Caption.zd[5]).append(" ").append(var3.d).toString(), var4, var5 + 10, 0, -1);
            VDTT_dg.a(VDTT_dg.d, var1, Caption.eV + " " + VDTT_jb.c(var3.k), var4, var5 + 20, 0, -1);
            VDTT_dg.a(VDTT_dg.d, var1, Caption.eW + " " + VDTT_jb.c(var3.j), var4, var5 + 30, 0, -1);
         } else {
            VDTT_aa.a(var1, var3.a(), 0, 10, var2 * this.ak[this.ac.b.b][0].h + 8, 60, (byte)3);
            if (var3.l) {
               VDTT_dc.a(var1, 302, 0, 10, var2 * this.ak[this.ac.b.b][0].h + 20, 3);
            } else {
               VDTT_dc.a(var1, 304, 0, 10, var2 * this.ak[this.ac.b.b][0].h + 20, 3);
            }

            if (var3.m) {
               VDTT_dc.a(var1, 455, 0, this.ak[this.ac.b.b][0].q - 10, var2 * this.ak[this.ac.b.b][0].h + 17, 3);
            }

            var4 = 19;
            var5 = var2 * this.ak[this.ac.b.b][0].h + 8;
            if (var2 == this.ak[this.ac.b.b][0].l && !var3.a.equals(VDTT_ek.m().aD)) {
               ++var4;
               ++var5;
            }

            var6 = "";
            if (var3.i == 5) {
               var6 = " (" + Caption.ek + ")";
            } else if (var3.i == 4) {
               var6 = " (" + Caption.el + ")";
            } else if (var3.i == 3) {
               var6 = " (" + Caption.em + ")";
            }

            var10000 = VDTT_dg.d;
            var10002 = (new StringBuilder()).append(Caption.zd[3]).append(" ").append(var3.a).append(var6).append(" ").append(Caption.zd[4]).append(" ");
            DataCenter.d();
            VDTT_dg.a(var10000, var1, var10002.append(DataCenter.c(var3.c)).append(", ").append(Caption.zd[5]).append(" ").append(var3.d).toString(), var4, var5, 0, -1);
            VDTT_dg.a(VDTT_dg.d, var1, Caption.eV + " " + VDTT_jb.c(var3.k) + " " + Caption.eW + " " + VDTT_jb.c(var3.j), var4, var5 + 11, 0, -1);
         }
      }

      this.a((Graphics)var1);
      this.ak[1][0].b(var1, this);
   }

   private void F() {
      if (this.aG >= 0 && this.aG < DataCenter.d().R.length) {
         this.a(this.aG, this.Z.contains(DataCenter.d().R[this.aG].a));
         this.ak[2] = new VDTT_hs[1];
         this.ak[2][0] = new VDTT_hs((byte)1, this.ac.objX + 42, this.ac.objY + 7 + 42, super.q - 8 - 138, 113, 14, this.aH.length);
      }

   }

   private void g(Graphics var1) {
      if (VDTT_ek.m().bh != null) {
         VDTT_aa.a(var1, 79, 0, 20, this.f() + 22, super.q - 8 - 32, (int)3);
         VDTT_aa.a(var1, 79, 0, 20, this.f() + this.h() - 25, super.q - 8 - 32, (int)3);
         VDTT_aa.a(var1, 79, 90, 24, this.f() + 22, 3, (int)(this.h() - 45));
         VDTT_aa.a(var1, 79, 90, 4 + (super.q - 8) - 23, this.f() + 22, 3, (int)(this.h() - 45));
         int var2 = this.ac.objX + 9;
         int var3 = this.ac.objY + 7 + 5;

         int var4;
         for(var4 = 0; var4 < this.aX.length; ++var4) {
            var1.f(-16742145);
            b(var1, var2 + this.aX[var4].objX, var3 + this.aX[var4].objY, (Item)null, this.aG == var4);
            if (var4 >= DataCenter.d().R.length) {
               VDTT_dc.a(var1, 460, 0, var2 + this.aX[var4].objX + 2, var3 + this.aX[var4].objY + 2, 20);
               if (VDTT_eq.a().d()) {
                  VDTT_dc.a(var1, 647, 0, var2 + this.aX[var4].objX + 2, var3 + this.aX[var4].objY + 2, 20);
               }
            } else {
               VDTT_ie var10000 = DataCenter.d().R[var4];
               int var10002 = var2 + this.aX[var4].objX + 2;
               int var8 = var3 + this.aX[var4].objY + 2;
               int var7 = var10002;
               VDTT_ie var5 = var10000;
               if (VDTT_eq.a().d()) {
                  VDTT_dc.a(var1, var5.f, 0, var7, var8, 20);
                  VDTT_dc.a(var1, 647, 0, var7, var8, 20);
               } else {
                  VDTT_dc.a(var1, 646, 0, var7, var8, 20);
                  VDTT_dc.a(var1, var5.f, 0, var7, var8, 20);
               }
            }
         }

         this.a(var1, this.ak[2][0].objX - 1, this.ak[2][0].objY - 1, this.ak[2][0].q + 60, this.ak[2][0].r + 8, -8492991, 22, 23, 1, 1);
         this.a(var1, this.ak[2][0]);
         if (this.aG >= DataCenter.d().R.length) {
            VDTT_dg.a(VDTT_dg.e, var1, Caption.iJ, this.ak[2][0].q / 2, this.ak[2][0].r / 2 - 7, 2, -2560, 3, 0);
         } else {
            for(var2 = 0; var2 < this.aH.length; ++var2) {
               var4 = var2 * this.ak[2][0].h;
               if (this.ak[2][0].c(var4)) {
                  if (this.aH[var2].a == 0) {
                     VDTT_dg.d(VDTT_dg.e, var1, this.aH[var2].b, 5, var4 + 1 + this.ak[2][0].h / 2, 0, -1, -16777216);
                  } else {
                     VDTT_dg.d(VDTT_dg.d, var1, this.aH[var2].b, 5, var4 + 1 + this.ak[2][0].h / 2, 0, -1, -16777216);
                  }
               }
            }
         }

         this.a((Graphics)var1);
         this.ak[2][0].a(var1, this, 0);
      }
   }

   public final void a_() {
      super.a_();
      if (super.a.b < this.w()) {
         this.aN.a(this.aS);
         String var2;
         if (this.aS) {
            var2 = Caption.se;
            this.aN.l = var2;
         } else {
            var2 = Caption.eB;
            this.aN.l = var2;
         }

         int var1;
         for(var1 = 0; var1 < this.aQ.size(); ++var1) {
            ((VDTT_ba)this.aQ.get(var1)).b(true);
         }

         this.ac.a();
         this.al.a();

         int var3;
         for(var1 = 0; var1 < this.ak.length; ++var1) {
            if (this.ak[var1] != null) {
               for(var3 = 0; var3 < this.ak[var1].length; ++var3) {
                  if (this.ak[var1][var3] != null) {
                     this.ak[var1][var3].a();
                  }
               }
            }
         }

         if (this.ac.b.b == 0) {
            if (VDTT_ek.m().bh != null) {
               if (this.am.h() <= 1) {
                  this.aI.b(false);
                  this.aL.b(false);
                  this.aN.b(false);
                  this.aP.b(!this.aT);
                  if (this.V == 5) {
                     this.aK.b(false);
                     this.aO.b(false);
                     this.aJ.b(false);
                     this.aL.b(true);
                  } else if (this.V == 4) {
                     this.aK.b(false);
                     this.aO.b(false);
                  }

                  if (this.aT) {
                     this.aO.b(true);
                  }
               }

               if (this.ad != null) {
                  this.ad.a();

                  for(var1 = 0; var1 < this.af.length; ++var1) {
                     VDTT_ba var10000;
                     boolean var10001;
                     label87: {
                        this.af[var1].a_();
                        this.ae[var1].a();
                        this.T[var1].p = this.T[var1].o;
                        if (this.T[var1].d() == -32) {
                           var10000 = this.af[var1];
                        } else {
                           var10000 = this.af[var1];
                           if (this.V != 5) {
                              var10001 = true;
                              break label87;
                           }
                        }

                        var10001 = false;
                     }

                     var10000.a(var10001);
                     if (this.ae[var1].l != -1) {
                        this.af[var1].N = true;
                     } else {
                        this.af[var1].N = false;
                     }
                  }
               }
            }

            var1 = 0;

            for(var3 = 0; var3 < this.aQ.size(); ++var3) {
               if (!((VDTT_ba)this.aQ.get(var3)).d) {
                  ++var1;
                  ((VDTT_ba)this.aQ.get(var3)).d(50, ((VDTT_ba)this.aQ.get(var3)).r);
                  ((VDTT_ba)this.aQ.get(var3)).f(this.q - 8 - var1 * 53, ((VDTT_ba)this.aQ.get(var3)).objY);
               }
            }

            this.am.e();
            return;
         }

         if (this.ac.b.b == 2) {
            if (this.aG >= 0 && this.aG < DataCenter.d().R.length) {
               this.aM.b(false);
               this.aM.I = 7;
               if (this.Z.contains(DataCenter.d().R[this.aG].a)) {
                  this.aM.a(true);
                  var2 = Caption.qD;
                  this.aM.l = var2;
                  this.aM.I = 9;
               } else {
                  if (this.V == 5) {
                     this.aM.a(false);
                     var2 = Caption.nt;
                     this.aM.l = var2;
                     return;
                  }

                  this.aM.a(true);
                  var2 = Caption.iJ;
                  this.aM.l = var2;
               }
            } else {
               this.aM.b(true);
            }
         }
      }

   }

   private VDTT_el g(int var1) {
      VDTT_el var2 = null;
      if (var1 >= 0) {
         if (this.ac.b.b == 1) {
            var2 = (VDTT_el)this.X.elementAt(var1);
         } else {
            var2 = (VDTT_el)this.W.elementAt(var1);
         }
      }

      return var2;
   }

   public final void f(int var1) {
      super.f(var1);
      aY = var1;
      if (this.ac != null) {
         this.ac.b();
         if (var1 < this.w()) {
            this.ac.a(var1);
            if (super.a.b < this.w() && this.ac.b.b != super.a.b) {
               this.f(this.ac.b.b);
            }
         }

         if (super.a.b == this.w()) {
            super.P.a(2);
            this.z();
         }
      }

   }

   public final int B() {
      return super.a.b;
   }

   public final int C() {
      return this.am.h();
   }

   private String a(int var1, boolean var2) {
      VDTT_ie var3 = DataCenter.d().R[var1];
      Vector var4;
      (var4 = new Vector()).addElement("c#moc" + var3.b);
      if (var3.c != null && var3.c.length() > 0) {
         var4.addElement(var3.c);
      }

      if (!var2) {
         if (DataCenter.d().R[var1].g > 0) {
            var4.addElement("c#yellow" + Caption.aI + " " + VDTT_jb.c(DataCenter.d().R[var1].g) + " " + Caption.bw);
         }

         if (var3.h > 0) {
            var4.addElement("c#orange" + Caption.gt + DataCenter.d().R[var1].b());
         }
      } else if ((var1 = this.h(var1)) > 0) {
         var4.addElement("c#orange" + Caption.oy + VDTT_jb.g((long)var1 * 1000L));
      }

      var4.addElement("c#green" + Caption.dL);
      this.a(var4, var3);
      Vector var6 = new Vector();

      String var7;
      int var9;
      for(var9 = 0; var9 < var4.size(); ++var9) {
         var7 = String.valueOf(var4.elementAt(var9));
         int var5;
         Vector var8;
         if (var9 == 0) {
            var8 = VDTT_dg.a(VDTT_dg.e, var7, 180);

            for(var5 = 0; var5 < var8.size(); ++var5) {
               var6.add(new VDTT_iu(0, (String)var8.elementAt(var5)));
            }
         } else {
            var8 = VDTT_dg.a(VDTT_dg.d, var7, 180);

            for(var5 = 0; var5 < var8.size(); ++var5) {
               var6.add(new VDTT_iu(1, (String)var8.elementAt(var5)));
            }
         }
      }

      var7 = "";
      this.aH = new VDTT_iu[var6.size()];

      for(var9 = 0; var9 < var6.size(); ++var9) {
         this.aH[var9] = (VDTT_iu)var6.elementAt(var9);
         var7 = var7 + this.aH[var9].b;
         if (var9 < this.aH.length - 1) {
            var7 = var7 + "\r\n";
         }
      }

      return var7;
   }

   private void a(Vector var1, VDTT_ie var2) {
      if (this.aq >= var2.d) {
         var1.addElement("c#white" + Caption.un + var2.d);
      } else {
         var1.addElement("c#red" + Caption.un + var2.d);
      }

      VDTT_gz[] var7;
      int var3 = (var7 = var2.a()).length;

      for(int var4 = 0; var4 < var3; ++var4) {
         VDTT_gz var5;
         String var6 = (var5 = var7[var4]).a(0);
         if (var5.a().c == 55) {
            var6 = var5.d();
         }

         if (var6 != null && var6.length() > 0) {
            var1.addElement(var6);
         }
      }

   }

   public final void d() {
      try {
         if (VDTT_cw.v().T() != null && VDTT_cw.v().T().a == 44) {
            VDTT_cw.v();
            VDTT_cw.o(93);
         }
      } catch (Exception var1) {
      }

      super.d();
   }

   private int h(int var1) {
      for(int var2 = 0; var2 < this.Z.size(); ++var2) {
         if ((Integer)this.Z.get(var2) == var1) {
            return (Integer)this.aa.get(var2);
         }
      }

      return 0;
   }
}
