package core.mchien.main2;

import java.util.Vector;

public final class VDTT_mr extends VDTT_ar {
   private VDTT_iq d;
   private VDTT_hs[] N;
   private VDTT_hs[] O;
   private VDTT_iu[][] P;
   private Item Q = null;
   private VDTT_ba R;
   private VDTT_ba[] S;
   public Vector a = new Vector();
   public Vector b = new Vector();
   public int[] c;

   public final void a(Message var1) {
      try {
         this.c = new int[DataCenter.d().I.length];

         for(int var2 = 0; var2 < this.c.length; ++var2) {
            switch(var2) {
            case 7:
            case 14:
            case 16:
            case 18:
               this.c[var2] = var1.f();
               break;
            default:
               this.c[var2] = var1.readByte();
            }
         }
      } catch (Exception var3) {
      }

      this.z();
   }

   public VDTT_mr(VDTT_p var1, Message var2) {
      this.I = var1;
      this.K = false;
      this.a(300);
      this.d = new VDTT_iq(new VDTT_hp(1001, Caption.zR), this);
      this.d.c = this.h() - 12;
      this.N = new VDTT_hs[3];
      this.N[0] = new VDTT_hs((byte)1, 11, this.f() + 40, super.q - 8 - 15, 1, 15, 0);
      this.N[1] = new VDTT_hs((byte)1, 11, this.f() + 40, super.q - 8 - 15, 1, 15, 0);
      this.N[2] = new VDTT_hs((byte)1, 11, this.f() + 40, super.q - 8 - 15, 1, 15, 0);
      this.P = new VDTT_iu[3][];
      this.R = this.a(this.q - 84, this.r - 36, Caption.jX, this, 1012, 15);
      this.d.a(this.R, 0);
      this.S = new VDTT_ba[DataCenter.d().I.length];
      this.O = new VDTT_hs[DataCenter.d().I.length];

      int var4;
      for(var4 = 0; var4 < DataCenter.d().I.length; ++var4) {
         this.S[var4] = new VDTT_ba(0, 0, 65, 20, Caption.eB, this, 0, -8);
      }

      this.w();
      this.x();
      this.a(var2);
      var4 = (this.h() - 50) / 15;
      this.N[2] = new VDTT_hs((byte)1, 11, this.f() + 40, super.q - 8 - 15, var4 * 15, 15, this.P[2].length);
      this.d.a(VDTT_cw.v().cu);
   }

   public final void w() {
      this.a.clear();
      this.R.d = true;
      Vector var1 = new Vector();
      Vector var2 = new Vector();
      int var5;
      if (VDTT_cw.v().br >= DataCenter.d().K.length) {
         var2.addElement("c#white" + Caption.jY);
      } else {
         VDTT_ir var3 = DataCenter.d().K[VDTT_cw.v().br];
         var2.addElement("c#yellow" + Caption.jZ + "c#white" + var3.b);
         DataCenter.d();
         if (VDTT_cw.v().bs < 0) {
            this.a.addElement(new VDTT_dy(var3.d, -1, -1, var3.e, var3.f, var3.g));
         } else {
            if (VDTT_ek.m().w() < var3.c) {
               var2.addElement("c#red" + Caption.kb + DataCenter.d().a(var3.c));
            }

            for(var5 = 0; var5 < var3.p.size(); ++var5) {
               VDTT_il var6;
               String var7 = (var6 = (VDTT_il)var3.p.elementAt(var5)).b;
               if (var6.i <= 1) {
                  if (VDTT_cw.v().bs == var5) {
                     var2.addElement("c#green" + "  - c#task" + var7);
                     this.a.addElement(new VDTT_dy(var6.d, var6.b(), var6.e, var6.f, var6.g, var6.h));
                  } else {
                     var2.addElement("c#white" + "  - " + var7);
                  }
               } else if (VDTT_ek.m().w() >= var3.c) {
                  if (VDTT_cw.v().bs == var5) {
                     var2.addElement("c#green" + "  - c#task" + var6.b + " " + VDTT_cw.v().bt + "/" + var6.i);
                     this.a.addElement(new VDTT_dy(var6.d, var6.b(), var6.e, var6.f, var6.g, var6.h));
                  } else if (VDTT_cw.v().bs > var5) {
                     var2.addElement("c#white" + "  - " + var6.b + " " + var6.i + "/" + var6.i);
                  } else {
                     var2.addElement("c#white" + "  - " + var6.b + " 0/" + var6.i);
                  }
               } else {
                  var2.addElement("c#white" + "  - " + var6.b + " 0/" + var6.i);
               }
            }

            if (VDTT_cw.v().br == 18 && !var3.b()) {
               var2.add(Caption.ww);
            }

            if (VDTT_cw.v().bs >= var3.p.size()) {
               var2.addElement("c#white" + Caption.uD + "c#task" + Caption.uE + "c#white" + Caption.uF);
               this.a.addElement(new VDTT_dy(-32768, -1, -1, var3.e, var3.f, var3.g));
            } else if (var3.j.length() > 0) {
               var2.addElement("c#white" + var3.j);
            }

            if (VDTT_cw.v().br < DataCenter.d().K.length && VDTT_cw.v().bs >= 0) {
               Item var12;
               if (var3.k > 0) {
                  (var12 = new Item(190)).c(var3.k);
                  var12.t = true;
                  var1.add(var12);
               }

               if (var3.l > 0) {
                  (var12 = new Item(192)).c(var3.l);
                  var12.t = true;
                  var1.add(var12);
               }

               if (var3.m > 0) {
                  (var12 = new Item(191)).c(var3.m);
                  var1.add(var12);
               }

               if (var3.n > 0) {
                  (var12 = new Item(163)).c(var3.n);
                  var12.t = true;
                  var1.add(var12);
               }

               if ((var12 = var3.a()) != null) {
                  var1.add(var12);
               }

               if (var1.size() > 0) {
                  var2.addElement("c#blue" + Caption.kh + "\n===\n");
               }
            }
         }
      }

      Vector var10 = new Vector();
      var5 = -1;

      int var13;
      for(var13 = 0; var13 < var2.size(); ++var13) {
         String var4;
         if ((var4 = String.valueOf(var2.elementAt(var13))).contains("c#task")) {
            ++var5;
         }

         Vector var14 = VDTT_dg.a(VDTT_dg.d, var4, this.N[0].q - 20);
         int var8 = 0;

         for(int var9 = 0; var9 < var14.size(); ++var9) {
            if ((var4 = (String)var14.elementAt(var9)).contains("c#task")) {
               ++var8;
            }

            if (var4.contains("===")) {
               var10.add(new VDTT_iu(1, "", var1));
            } else {
               var10.add(new VDTT_iu(1, var4));
            }
         }

         if (var8 > 1) {
            VDTT_dy var15 = (VDTT_dy)this.a.elementAt(var5);

            for(int var11 = 1; var11 < var8; ++var11) {
               this.a.insertElementAt(var15, var5);
               ++var5;
            }
         }
      }

      this.P[0] = new VDTT_iu[var10.size()];

      for(var13 = 0; var13 < var10.size(); ++var13) {
         this.P[0][var13] = (VDTT_iu)var10.elementAt(var13);
      }

      var13 = (this.h() - 50) / 15;
      this.N[0] = new VDTT_hs((byte)1, 11, this.f() + 40, super.q - 8 - 15, var13 * 15, 15, this.P[0].length);
   }

   public final void x() {
      this.b.clear();
      Vector var1 = new Vector();
      String var2;
      if (VDTT_ek.m().ac > 0) {
         var1.addElement("c#yellow" + Caption.jZ + "c#white" + Caption.jS + (10 - VDTT_ek.m().ac) + "/10");
         if (VDTT_cw.v().bx == null) {
            var1.addElement("c#white" + Caption.ka + "c#task" + DataCenter.d().F[102].j + "c#white" + Caption.kd);
            this.b.addElement(new VDTT_dy(102, -1, -1, 67, 0, 0, 0));
         } else {
            var2 = VDTT_cw.v().bx.m;
            if (VDTT_cw.v().bx.j > 1) {
               var2 = var2 + " " + VDTT_cw.v().bx.c + "/" + VDTT_cw.v().bx.j;
            }

            if (VDTT_cw.v().bx.a()) {
               var1.addElement("c#white" + "  - " + var2);
               var1.addElement("c#white" + Caption.kc + "c#task" + DataCenter.d().F[102].j + "c#white" + Caption.jU);
               this.b.addElement(new VDTT_dy(102, -1, -1, 67, 0, 0, 0));
            } else {
               var1.addElement("c#green" + "  - c#task" + var2);
               if (VDTT_cw.v().bx.g >= 0) {
                  var1.addElement(VDTT_jb.b(Caption.mp, DataCenter.d().H[VDTT_cw.v().bx.g].b));
                  this.b.addElement(new VDTT_dy(VDTT_cw.v().bx.e, VDTT_cw.v().bx.d, VDTT_cw.v().bx.f, VDTT_cw.v().bx.g, VDTT_cw.v().bx.h, VDTT_cw.v().bx.i, 0));
               }
            }
         }
      }

      if (VDTT_cw.v().bB != null) {
         var1.addElement("c#yellow" + Caption.jZ + "c#white" + Caption.ns);
         var2 = "";
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
            this.b.addElement(new VDTT_dy(-1, -1, -1, -1, 0, 0, 2));
         } else {
            var1.addElement("c#green" + "  - c#task" + var2);
            this.b.addElement(new VDTT_dy(-1, -1, -1, -1, 0, 0, 2));
         }
      }

      if (VDTT_cw.v().bz != null) {
         var1.addElement("c#yellow" + Caption.jZ + "c#white" + Caption.wi);
         var2 = Caption.wk + " " + VDTT_cw.v().bz.c + "/" + VDTT_cw.v().bz.j;
         if (VDTT_cw.v().bz.a()) {
            var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.d().F[38].j + "c#white" + Caption.jU);
            this.b.addElement(new VDTT_dy(-1, -1, -1, -1, 0, 0, 3));
         } else {
            var1.addElement("c#green" + "  - c#task" + var2);
            this.b.addElement(new VDTT_dy(38, -1, -1, -1, 0, 0, 3));
         }
      }

      if (VDTT_cw.v().bA != null) {
         var1.addElement("c#yellow" + Caption.jZ + "c#white" + Caption.wi);
         var2 = Caption.wl + " " + VDTT_cw.v().bA.c + "/" + VDTT_cw.v().bA.j;
         if (VDTT_cw.v().bA.a()) {
            var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.d().F[36].j + "c#white" + Caption.jU);
            this.b.addElement(new VDTT_dy(-1, -1, -1, -1, 0, 0, 4));
         } else {
            var1.addElement("c#green" + "  - c#task" + var2);
            this.b.addElement(new VDTT_dy(36, -1, -1, -1, 0, 0, 4));
         }
      }

      String var3;
      if (VDTT_cw.v().bC != null) {
         var1.addElement("c#yellow" + Caption.jZ + "c#white" + Caption.wE);
         var2 = "";
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

         var3 = var2 + " " + VDTT_cw.v().bC.c + "/" + VDTT_cw.v().bC.j;
         if (VDTT_cw.v().bC.a()) {
            var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.d().F[23].j + "c#white" + Caption.jU);
            this.b.addElement(new VDTT_dy(23, -1, -1, -1, 0, 0, VDTT_cw.v().bC.b));
         } else {
            var1.addElement("c#green" + "  - c#task" + var3);
            this.b.addElement(new VDTT_dy(-1, -1, -1, -1, 0, 0, VDTT_cw.v().bC.b));
         }
      }

      Vector var11 = new Vector();
      int var4 = -1;

      int var5;
      for(var5 = 0; var5 < var1.size(); ++var5) {
         if ((var3 = String.valueOf(var1.elementAt(var5))).contains("c#task")) {
            ++var4;
         }

         Vector var6 = VDTT_dg.a(VDTT_dg.d, var3, this.N[1].q - 20);
         int var7 = 0;

         for(int var8 = 0; var8 < var6.size(); ++var8) {
            if ((var3 = (String)var6.elementAt(var8)).contains("c#task")) {
               ++var7;
            }

            var11.add(new VDTT_iu(1, var3));
         }

         if (var7 > 1) {
            VDTT_dy var10 = (VDTT_dy)this.b.elementAt(var4);

            for(int var9 = 1; var9 < var7; ++var9) {
               this.b.insertElementAt(var10, var4);
               ++var4;
            }
         }
      }

      this.P[1] = new VDTT_iu[var11.size()];

      for(var5 = 0; var5 < var11.size(); ++var5) {
         this.P[1][var5] = (VDTT_iu)var11.elementAt(var5);
      }

      var5 = (this.h() - 50) / 15;
      this.N[1] = new VDTT_hs((byte)1, 11, this.f() + 40, super.q - 8 - 15, var5 * 15, 15, this.P[1].length);
   }

   private void z() {
      try {
         Vector var1 = new Vector();
         Vector var2 = new Vector();

         for(int var3 = 0; var3 < DataCenter.d().I.length; ++var3) {
            int var4 = this.c[var3];
            Vector var5 = new Vector();
            Item var6;
            if (DataCenter.d().I[var3].d > 0) {
               (var6 = new Item(190)).c(DataCenter.d().I[var3].d);
               var6.t = true;
               var5.add(var6);
            }

            if (DataCenter.d().I[var3].e > 0) {
               (var6 = new Item(192)).c(DataCenter.d().I[var3].e);
               var6.t = true;
               var5.add(var6);
            }

            if (DataCenter.d().I[var3].f > 0) {
               (var6 = new Item(191)).c(DataCenter.d().I[var3].f);
               var5.add(var6);
            }

            if (DataCenter.d().I[var3].g > 0) {
               (var6 = new Item(163)).c(DataCenter.d().I[var3].g);
               var6.t = true;
               var5.add(var6);
            }

            if ((var6 = DataCenter.d().I[var3].a()) != null) {
               var5.add(var6);
            }

            String var7 = var3 + 1 + ". ";
            if (var3 == DataCenter.d().I.length - 1) {
               var7 = "";
            }

            String var8 = "";
            if (var4 >= DataCenter.d().I[var3].c) {
               var4 = DataCenter.d().I[var3].c;
               var8 = var8 + "c#yellow" + var7 + DataCenter.d().I[var3].b;
            } else {
               var8 = var8 + "c#white" + var7 + DataCenter.d().I[var3].b;
            }

            if (DataCenter.d().I[var3].c > 1) {
               var8 = var8 + " " + var4 + "/" + DataCenter.d().I[var3].c;
            }

            if (var5.size() > 0) {
               var8 = var8 + "\nc#blue" + Caption.kh + "\n===";
               var2.add(var5);
            }

            var1.add(var8);
            String var12;
            VDTT_ba var10000;
            if (this.c[var3] > DataCenter.d().I[var3].c) {
               this.S[var3].I = 9;
               this.S[var3].a(true);
               var10000 = this.S[var3];
               var12 = Caption.se;
               var10000.l = var12;
            } else if (this.c[var3] == DataCenter.d().I[var3].c) {
               this.S[var3].a(false);
               var10000 = this.S[var3];
               var12 = Caption.eB;
               var10000.l = var12;
            } else {
               this.S[var3].a(true);
               var10000 = this.S[var3];
               var12 = Caption.ur;
               var10000.l = var12;
            }

            this.S[var3].d(60, 18);
         }

         Vector var10 = new Vector();

         for(int var13 = 0; var13 < var1.size(); ++var13) {
            String var11 = String.valueOf(var1.elementAt(var13));
            Vector var15 = VDTT_dg.a(VDTT_dg.d, var11, this.N[1].q - 8);

            for(int var17 = 0; var17 < var15.size(); ++var17) {
               if ((var11 = (String)var15.elementAt(var17)).contains("===")) {
                  var10.add(new VDTT_iu(1, "", (Vector)var2.remove(0)));
                  this.S[var13].f(80, var10.size() * 15 - 18);
                  if (this.O[var13] == null) {
                     this.O[var13] = new VDTT_hs((byte)1, 75, var10.size() * 15 - 10, 50, 20, 1, 1);
                  }
               } else {
                  var10.add(new VDTT_iu(1, var11));
               }
            }
         }

         VDTT_iu[] var14 = new VDTT_iu[var10.size()];

         for(int var16 = 0; var16 < var10.size(); ++var16) {
            var14[var16] = (VDTT_iu)var10.elementAt(var16);
         }

         this.P[2] = var14;
      } catch (Exception var9) {
         VDTT_jb.a(var9);
      }
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (var1.b >= 3000 && var1.b < 3010) {
         var2 = var1.b - 3000;
         VDTT_mr var7 = this;

         try {
            Vector var10 = var7.a;
            VDTT_dy var8;
            if (var7.d.h() == 1) {
               VDTT_bw.J = (var8 = (VDTT_dy)var7.b.elementAt(var2)).j;
            } else {
               var8 = (VDTT_dy)var10.elementAt(var2);
            }

            if (var7.d.h() == 0) {
               VDTT_bw.J = 5;
            }

            if (var8.a == -32768) {
               Message.c((byte)-11).l();
            } else {
               VDTT_cw.v().aS.c(var7.d.h() != 0);
               if (var8.a >= 0) {
                  if (VDTT_cw.v().l(var8.a) != null) {
                     var8.d = VDTT_cw.v().ai;
                  }

                  if (var8.d < 0) {
                     VDTT_cw.v();
                     VDTT_cw.b(var8);
                  }
               }

               VDTT_dy var11 = var8.a();
               VDTT_cw.v().a(var11, var7.d.h() == 0);
               var7.k();
            }
         } catch (Exception var4) {
            VDTT_jb.a(var4);
         }
      } else if (var1.b >= 4000 && var1.b < 5000) {
         int var6 = var1.b - 4000;
         if (!this.S[var6].c) {
            var6 = var6;

            try {
               Message var9;
               (var9 = Message.c((byte)-38)).a(var6);
               var9.l();
            } catch (Exception var5) {
               VDTT_jb.a(var5);
            }
         }
      } else {
         this.Q = null;
         switch(var1.b) {
         case 1001:
            if (var1.j.k >= 0) {
               this.d.a(var1.j.k);
               return;
            }
            break;
         case 1012:
            if (VDTT_cw.v().br == 11) {
               A();
               return;
            }

            DataCenter.d().ai.a(Caption.kg, 2001, this);
            return;
         case 2001:
            A();
            return;
         case 5000:
            this.Q = (Item)var1.k;
            this.k = c(this, var1, this.Q);
         }

      }
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.L, (byte)2, this.K);
      this.d.a(var1);
      VDTT_cw.v().cu = (byte)this.d.h();
      VDTT_mr var2;
      Graphics var3;
      int var4;
      int var8;
      switch(this.d.h()) {
      case 0:
         var3 = var1;
         var2 = this;
         this.a(var1, this.N[this.d.h()]);

         for(var4 = 0; var4 < var2.P[var2.d.h()].length; ++var4) {
            if (var2.N[var2.d.h()].b(var4)) {
               VDTT_dg.d(VDTT_dg.d, var3, var2.P[var2.d.h()][var4].b, 6, var4 * var2.N[var2.d.h()].h + var2.N[var2.d.h()].h / 2, 0, -1, -16777216);
               if (var2.P[var2.d.h()][var4].d != null) {
                  for(var8 = 0; var8 < var2.P[var2.d.h()][var4].d.size(); ++var8) {
                     Item var9 = (Item)var2.P[var2.d.h()][var4].d.get(var8);
                     b(var3, 4 + var8 * 35, var4 * var2.N[var2.d.h()].h, var9, var2.Q != null && var2.Q.equals(var9));
                  }
               }
            }
         }

         var2.a(var3);
         var2.N[var2.d.h()].b(var3, var2);
         break;
      case 1:
         var3 = var1;
         var2 = this;
         this.a(var1, this.N[this.d.h()]);

         for(var4 = 0; var4 < var2.P[var2.d.h()].length; ++var4) {
            if (var2.N[var2.d.h()].b(var4)) {
               VDTT_dg.d(VDTT_dg.d, var3, var2.P[var2.d.h()][var4].b, 6, var4 * var2.N[var2.d.h()].h + var2.N[var2.d.h()].h / 2, 0, -1, -16777216);
            }
         }

         var2.a(var3);
         var2.N[var2.d.h()].b(var3, var2);
         break;
      case 2:
         var3 = var1;
         var2 = this;
         this.a(var1, this.N[this.d.h()]);
         int var6 = 0;

         for(int var7 = 0; var7 < var2.P[var2.d.h()].length; ++var7) {
            if (var2.N[var2.d.h()].b(var7)) {
               if (var2.P[var2.d.h()][var7].b.contains("c#blue")) {
                  VDTT_dg.d(VDTT_dg.d, var3, var2.P[var2.d.h()][var7].b, 80, var7 * var2.N[var2.d.h()].h + var2.N[var2.d.h()].h / 2 - 2, 0, -1, -16777216);
               } else {
                  VDTT_dg.d(VDTT_dg.d, var3, var2.P[var2.d.h()][var7].b, 6, var7 * var2.N[var2.d.h()].h + var2.N[var2.d.h()].h / 2, 0, -1, -16777216);
               }

               if (var2.P[var2.d.h()][var7].d != null) {
                  var4 = 0;

                  while(true) {
                     if (var4 >= var2.P[var2.d.h()][var7].d.size()) {
                        var4 = var3.e;
                        var8 = var3.f;
                        var2.a(var3, var4 + var2.S[var6].objX, var8 + var2.S[var6].objY);
                        var2.S[var6].b(var3);
                        var2.a(var3, var4, var8);
                        break;
                     }

                     Item var5 = (Item)var2.P[var2.d.h()][var7].d.get(var4);
                     b(var3, 4 + var4 * 35 + 6, var7 * var2.N[var2.d.h()].h - 14, var5, var2.Q != null && var2.Q.equals(var5));
                     ++var4;
                  }
               }
            }

            if (var2.P[var2.d.h()][var7].d != null) {
               ++var6;
            }
         }

         var2.a(var3);
         var2.N[var2.d.h()].b(var3, var2);
      }

      this.a(var1, this.objX, this.objY);
      var1.o();
   }

   public final void a_() {
      this.d.e();

      int var1;
      for(var1 = 0; var1 < this.N.length; ++var1) {
         this.N[var1].a();
      }

      if (this.d.h() == 2) {
         for(var1 = 0; var1 < this.O.length; ++var1) {
            if (this.O[var1].l != -1) {
               this.S[var1].N = true;
            } else {
               this.S[var1].N = false;
            }
         }
      }

      if (VDTT_cw.v().br == 5 && VDTT_cw.v().bs == 1) {
         this.y();
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.d.f());
      int var4 = -1;

      int var2;
      int var3;
      VDTT_hl var9;
      for(int var5 = 0; var5 < this.P[this.d.h()].length; ++var5) {
         String var6;
         if ((var6 = this.P[this.d.h()][var5].b).contains("c#task")) {
            try {
               ++var4;
               String[] var7 = var6.split("c#task");
               var2 = this.N[this.d.h()].objX + 5 + VDTT_dg.c(VDTT_dg.d, var7[0]);
               var3 = this.N[this.d.h()].objY + var5 * this.N[this.d.h()].h - this.N[this.d.h()].f;
               VDTT_in var8;
               if ((var8 = VDTT_di.c(var6 = var7[1])) != null) {
                  var6 = var6.split(var8.d)[0];
               }

               var9 = new VDTT_hl(3000 + var4, var2, var3, var2 + VDTT_dg.b(VDTT_dg.d, var6), var3 + this.N[this.d.h()].h, this.N[this.d.h()], this, new VDTT_iu(0, var6));
               if (this.N[this.d.h()].b(var5) && VDTT_jb.a(this.N[this.d.h()].objX, this.N[this.d.h()].objY, this.N[this.d.h()].objX + this.N[this.d.h()].q, this.N[this.d.h()].objY + this.N[this.d.h()].r, var9.a(), var9.b())) {
                  var1.addElement(var9);
               }
            } catch (Exception var10) {
            }
         }
      }

      Vector var11 = new Vector();
      int var12;
      if (this.d.h() == 0 && VDTT_cw.v().br < DataCenter.d().K.length && VDTT_cw.v().bs >= 0 || this.d.h() == 2) {
         var1.addElement(new VDTT_hl(1100, this.N[this.d.h()].objX, this.N[this.d.h()].objY - 11, this.N[this.d.h()].objX + this.N[this.d.h()].q, this.N[this.d.h()].objY, this.N[this.d.h()], this));
         var1.addElement(new VDTT_hl(1100, this.N[this.d.h()].objX, this.N[this.d.h()].objY + this.N[this.d.h()].r, this.N[this.d.h()].objX + this.N[this.d.h()].q, this.N[this.d.h()].objY + this.N[this.d.h()].r + 20, this.N[this.d.h()], this));

         for(var12 = 0; var12 < this.P[this.d.h()].length; ++var12) {
            if (this.P[this.d.h()][var12].d != null) {
               ++var4;
               if (this.N[this.d.h()].b(var12)) {
                  var2 = this.N[this.d.h()].objX + 4;
                  var3 = this.N[this.d.h()].objY + var12 * this.N[this.d.h()].h - this.N[this.d.h()].f;
                  if (this.d.h() == 2) {
                     VDTT_hl var14 = new VDTT_hl(4000 + var4, var2 + 16 + 60, var3 - 3, var2 + 16 + 60 + 60, var3 - 3 + 18, this.O[var4], this);
                     var11.addElement(var14);

                     for(int var16 = 0; var16 < this.P[this.d.h()][var12].d.size(); ++var16) {
                        Item var17 = (Item)this.P[this.d.h()][var12].d.get(var16);
                        var14 = new VDTT_hl(5000, var2 + 6, var3 - 14, var2 + 28 + 6, var3 - 14 + 28, this.N[this.d.h()], this, var17);
                        var11.addElement(var14);
                        var2 += 35;
                     }
                  } else {
                     for(int var13 = 0; var13 < this.P[this.d.h()][var12].d.size(); ++var13) {
                        Item var15 = (Item)this.P[this.d.h()][var12].d.get(var13);
                        var9 = new VDTT_hl(5000, var2, var3, var2 + 28, var3 + 28, this.N[this.d.h()], this, var15);
                        var11.addElement(var9);
                        var2 += 35;
                     }
                  }
               }
            }
         }
      }

      for(var12 = var11.size() - 1; var12 >= 0; --var12) {
         if (((VDTT_hl)var11.get(var12)).d >= this.N[this.d.h()].objY + this.N[this.d.h()].r) {
            var11.remove(var12);
         }
      }

      var1.addAll(var11);
      var1.addElement(this.N[this.d.h()].a(1100, this));
      return var1;
   }

   private static void A() {
      try {
         (new Message((byte)9)).l();
      } catch (Exception var1) {
         VDTT_jb.a(var1);
      }
   }
}
