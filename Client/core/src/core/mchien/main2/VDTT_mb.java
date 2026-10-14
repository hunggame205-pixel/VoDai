package core.mchien.main2;

import java.util.Vector;

public final class VDTT_mb extends VDTT_ar {
   private String[] N;
   private Vector O;
   private VDTT_hs P;
   private int Q;
   private int[] R;
   public VDTT_n a;
   public int b = -1;
   public int c = -1;
   private String[] S;
   private boolean T;
   private VDTT_ba U;
   private int V = 70;
   public boolean d;

   private void a(VDTT_p var1, String var2, String[] var3) {
      this.I = var1;
      this.K = false;
      this.S = new String[var3.length];

      int var7;
      for(var7 = 0; var7 < var3.length; ++var7) {
         this.S[var7] = "";
      }

      Vector var8 = new Vector();

      int var4;
      String var6;
      for(var4 = 0; var4 < var3.length; ++var4) {
         if (var3[var4].length() > 0) {
            String[] var5;
            var6 = (var5 = VDTT_jb.a(var3[var4], "#"))[0];
            if (var5.length > 2) {
               var6 = var5[0] + var5[2];
               this.S[var4] = var5[1];
            }

            if (VDTT_di.b(var6) == null && !this.w()) {
               var8.addElement(":-chat" + var6);
            } else {
               var8.addElement(var6);
            }
         }
      }

      this.N = new String[var8.size()];

      for(var4 = 0; var4 < var8.size(); ++var4) {
         this.N[var4] = (String)var8.elementAt(var4);
      }

      this.R = new int[this.N.length];

      for(var4 = 0; var4 < this.R.length; ++var4) {
         int[] var10002 = this.R;
         var10002[var4] = var10002[var4];
      }

      int var9;
      for(var9 = 0; var9 < var3.length; ++var9) {
         if (!(var6 = VDTT_jb.a(var3[var9], ",")[0]).contains("#") && (var4 = VDTT_dg.c(VDTT_dg.d, var6) + 50) > this.q) {
            this.a(var4, this.r);
         }
      }

      if (this.q < 230) {
         this.q = 230;
      }

      if (var2.length() > 0) {
         this.O = VDTT_dg.a(VDTT_dg.d, var2, this.q - 18);
      } else {
         this.O = new Vector();
      }

      var9 = var3.length + this.O.size();
      int var10 = this.O.size();
      if (!this.w()) {
         this.a(230, 200);
         if (var9 >= 11) {
            var10 = 0;
            this.O.size();
            this.T = true;
         }

         var7 = var9 - var10;
         this.j();
         this.a(this.q);
         if (this.T) {
            this.P = new VDTT_hs((byte)1, 15, this.f() + var10 * 14 + 8, this.q - 20, 17 * (var7 - 1), 17, var3.length);
         } else {
            this.P = new VDTT_hs((byte)1, 15, this.f() + var10 * 14 + 8, this.q - 20, 17 * var7, 17, var3.length);
         }

         this.U = this.a(this.q - 70, this.r - 29, Caption.O, this, 1000, -8);
         this.U.b(this.T);
      } else {
         if ((var9 = var3.length) > 5) {
            this.T = true;
            var7 = 5 * this.V + this.V / 2;
         } else {
            var7 = var9 * this.V;
         }

         this.a(this.q, 40);
         this.P = new VDTT_hs((byte)0, (this.q - var7) / 2, this.f() + var10 * 14 + 8, var7, this.V, this.V, var3.length);
         this.j();
      }

      VDTT_ac.b().w();
   }

   private boolean w() {
      return this.c >= 0 && DataCenter.l() || this.d;
   }

   public VDTT_mb(VDTT_p var1, String var2, String[] var3, int[] var4) {
      this.a(var1, var2, var3);
      this.R = new int[this.N.length];

      for(int var5 = 0; var5 < this.R.length; ++var5) {
         this.R[var5] = var4[var5];
      }

   }

   public VDTT_mb(VDTT_p var1, String var2, String[] var3, int[] var4, boolean var5) {
      this.d = true;
      this.a(var1, var2, var3);
      this.R = new int[this.N.length];

      for(int var6 = 0; var6 < this.R.length; ++var6) {
         this.R[var6] = var4[var6];
      }

   }

   public VDTT_mb(VDTT_p var1, String var2, String[] var3, int[] var4, VDTT_n var5) {
      this.a(var1, var2, var3);
      this.a = var5;
      this.R = new int[this.N.length];

      for(int var6 = 0; var6 < this.R.length; ++var6) {
         this.R[var6] = var4[var6];
      }

   }

   public VDTT_mb(VDTT_p var1, String var2, String[] var3, int var4) {
      this.c = var4;
      this.a(var1, var2, var3);
   }

   private VDTT_mb(VDTT_p var1, String var2, String[] var3, int var4, int var5) {
      this.b = var5;
      this.c = var4;
      this.a(var1, var2, var3);
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      if (!this.w()) {
         this.a(var1, this.objX, this.objY, this.q, this.r, "", (byte)2, this.K);
      }

      int var2;
      int var6;
      if (!this.w()) {
         var2 = this.f() + 10;
         if (this.T) {
            var2 = 15;
         }

         for(var6 = 0; var6 < this.O.size(); ++var6) {
            VDTT_dg.d(VDTT_dg.d, var1, (String)this.O.elementAt(var6), 10, var2 + var6 * 14, 0, -1, -16777216);
         }

         this.a(var1, this.P);

         for(var6 = 0; var6 < this.N.length; ++var6) {
            if (this.P.b(var6)) {
               if (var6 == this.P.k) {
                  VDTT_aa.a(var1, -7, 0, 20, var6 * this.P.h, this.P.q - 25, (int)this.P.h);
               }

               String var7 = VDTT_jb.a(this.N[var6], ",")[0];
               if (var6 == this.P.l) {
                  VDTT_dg.d(VDTT_dg.d, var1, var7, 1, 8 + var6 * this.P.h, 0, -1, -16777216);
               } else {
                  VDTT_dg.d(VDTT_dg.d, var1, var7, 0, 7 + var6 * this.P.h, 0, -1, -16777216);
               }
            }
         }

         this.a(var1);
      } else {
         this.a(var1, this.P);

         for(var2 = 0; var2 < this.N.length; ++var2) {
            if (this.P.b(var2)) {
               this.a(var1, 3 + var2 * this.P.h, 3, this.P.h - 6, this.P.h - 6, 61, 22, 23, 1, 1);
               String var3 = VDTT_jb.a(this.N[var2], ",")[0];
               Vector var4 = VDTT_dg.a(VDTT_dg.d, var3, this.V - 12);
               var6 = (this.P.h - var4.size() * 12) / 2;

               for(int var5 = 0; var5 < var4.size(); ++var5) {
                  if (var2 == this.P.l) {
                     VDTT_dg.d(VDTT_dg.d, var1, (String)var4.get(var5), var2 * this.P.h + this.P.h / 2, 6 + var6 + var5 * 12, 2, -1, -16777216);
                  } else {
                     VDTT_dg.d(VDTT_dg.d, var1, (String)var4.get(var5), var2 * this.P.h + this.P.h / 2, 6 + var6 + var5 * 12, 2, -1, -16777216);
                  }
               }
            }
         }

         this.a(var1);
      }
   }

   public final void a_() {
      try {
         this.P.a();
         DataCenter.d();
         if (!DataCenter.b() && this.I.b.lastElement().equals(this)) {
            int var2 = -1;
            VDTT_il var3;
            if ((var3 = VDTT_cw.v().T()) != null) {
               var2 = var3.d;
            }

            VDTT_ir var4;
            if (var2 == -1 && (var4 = VDTT_cw.v().S()) != null) {
               var2 = var4.d;
            }

            int var10001;
            VDTT_gx var31;
            if ((var31 = VDTT_cw.v().l(var2)) != null && VDTT_jb.a(VDTT_ek.m().objX, VDTT_ek.m().objY, var31.objX, var31.objY) < 40) {
               if (VDTT_cw.v().br == 5 && VDTT_cw.v().bs == 1) {
                  var10001 = this.objX + 60;
                  DataCenter.d().aA.b(var10001, this.objY + 60);
               } else if (VDTT_cw.v().br == 5 && VDTT_cw.v().bs == 2) {
                  if (this.b == -1) {
                     var10001 = this.objX + 90;
                     DataCenter.d().aA.b(var10001, this.objY + 109);
                  } else {
                     var10001 = this.objX + 60;
                     DataCenter.d().aA.b(var10001, this.objY + 45);
                  }
               } else if (VDTT_cw.v().br == 14) {
                  if (this.b == -1) {
                     var10001 = this.objX + 60;
                     DataCenter.d().aA.b(var10001, this.objY + 75);
                  } else {
                     var10001 = this.objX + 60;
                     DataCenter.d().aA.b(var10001, this.objY + 45);
                  }
               } else if (this.O.isEmpty() && VDTT_cw.v().br != 14) {
                  var10001 = this.objX + 60;
                  DataCenter.d().aA.b(var10001, this.objY + 45);
               } else {
                  var10001 = this.objX + 60;
                  DataCenter.d().aA.b(var10001, this.objY + 60);
               }
            } else if (VDTT_cw.v().bg != null && VDTT_cw.v().bg instanceof VDTT_gx && var3 != null && ((VDTT_gx)VDTT_cw.v().bg).k == 42) {
               VDTT_cw.v();
               int var10000 = VDTT_cw.f(var3.f);
               VDTT_cw.v();
               if (var10000 != VDTT_cw.f(VDTT_cw.v().ai)) {
                  var10001 = this.objX + 60;
                  DataCenter.d().aA.b(var10001, this.objY + 60);
               }
            }
         }

         if (this.Q > 0) {
            --this.Q;
            if (this.Q == 0 && this.P.k >= 0 && this.P.k < this.N.length) {
               Message var36;
               if (this.c >= 0) {
                  this.k();
                  if (this.b >= 0) {
                     if (this.c == 30000) {
                        (var36 = new Message((byte)-25)).b(VDTT_cw.v().G());
                        var36.a(this.b);
                        var36.a(this.P.k);
                        var36.l();
                        if (VDTT_ek.m().aP[VDTT_cw.v().G()] != null && VDTT_ek.m().aP[VDTT_cw.v().G()].af()) {
                           VDTT_ek.m().S();
                           VDTT_cw.v().bv = null;
                        }

                        return;
                     }

                     (var36 = new Message((byte)53)).b(this.c);
                     var36.a(this.b);
                     var36.a(this.P.k);
                     var36.l();
                  } else {
                     String[] var38;
                     if ((var38 = VDTT_jb.a(this.N[this.P.k], ",")).length < 2) {
                        Message var37;
                        if (this.c != 30000) {
                           (var37 = new Message((byte)53)).b(this.c);
                           var37.a(this.P.k);
                           var37.l();
                           return;
                        }

                        (var37 = new Message((byte)-25)).b(VDTT_cw.v().G());
                        var37.a(this.P.k);
                        var37.l();
                        if (VDTT_ek.m().aP[VDTT_cw.v().G()] != null && VDTT_ek.m().aP[VDTT_cw.v().G()].af()) {
                           VDTT_ek.m().S();
                           VDTT_cw.v().bv = null;
                        }
                     } else {
                        String[] var35 = new String[var38.length - 1];

                        for(int var33 = 0; var33 < var35.length; ++var33) {
                           var35[var33] = var38[var33 + 1];
                        }

                        VDTT_cw.v().a((MainScreen)(new VDTT_mb(this.I, this.S[this.P.k], var35, this.c, this.P.k)));
                     }
                  }

                  return;
               }

               if (this.c == -2) {
                  (var36 = new Message((byte)5)).a(this.P.k);
                  var36.l();
                  return;
               }

               if (this.c == -3 || this.c == -4) {
                  (var36 = new Message((byte)53)).b(this.c);
                  var36.a(this.P.k);
                  var36.l();
                  return;
               }

               this.k();
               VDTT_mb var1;
               Message var29;
               VDTT_ek var30;
               switch(this.R[this.P.k]) {
               case 0:
                  var1 = this;

                  try {
                     if (f(3)) {
                        var1.I.a((MainScreen)(new VDTT_mb(var1.I, "", Caption.yG, new int[]{100, 101})));
                     }
                     break;
                  } catch (Exception var5) {
                     VDTT_jb.a(var5);
                     return;
                  }
               case 1:
                  VDTT_cw.v();
                  VDTT_cw.o(37);
                  return;
               case 2:
                  var1 = this;

                  try {
                     var1.I.a((MainScreen)(new VDTT_mb(var1.I, "", Caption.yI, new int[]{104, 105})));
                     break;
                  } catch (Exception var26) {
                     VDTT_jb.a(var26);
                     return;
                  }
               case 3:
                  var1 = this;

                  try {
                     if (f(1)) {
                        var1.I.a((MainScreen)(new VDTT_mb(var1.I, "", Caption.yJ, new int[]{106, 107, 127})));
                     }
                     break;
                  } catch (Exception var6) {
                     VDTT_jb.a(var6);
                     return;
                  }
               case 4:
                  var1 = this;

                  try {
                     var1.I.a((MainScreen)(new VDTT_mb(var1.I, Caption.aD, Caption.yK, new int[]{108, 109, 110, 111, 112})));
                     break;
                  } catch (Exception var25) {
                     VDTT_jb.a(var25);
                     return;
                  }
               case 5:
                  var1 = this;

                  try {
                     var1.I.a((MainScreen)(new VDTT_mb(var1.I, Caption.S, Caption.yQ, new int[]{113, 114, 115, 116, 117})));
                     break;
                  } catch (Exception var24) {
                     VDTT_jb.a(var24);
                     return;
                  }
               case 6:
                  var1 = this;

                  try {
                     var1.I.a((MainScreen)(new VDTT_mb(var1.I, Caption.be, Caption.yR, new int[]{118, 119, 120, 121})));
                     break;
                  } catch (Exception var23) {
                     VDTT_jb.a(var23);
                     return;
                  }
               case 7:
                  A();
                  return;
               case 8:
                  VDTT_cw.v();
                  VDTT_cw.i(8, 0);
                  return;
               case 9:
                  A();
                  return;
               case 10:
                  this.B();
                  return;
               case 11:
                  try {
                     VDTT_cw.v();
                     VDTT_cw.o(86);
                     break;
                  } catch (Exception var22) {
                     VDTT_jb.a(var22);
                     return;
                  }
               case 12:
                  this.x();
                  return;
               case 13:
                  this.z();
                  return;
               case 14:
                  var1 = this;

                  try {
                     var1.I.a((MainScreen)(new VDTT_kf(var1.I)));
                     break;
                  } catch (Exception var21) {
                     VDTT_jb.a(var21);
                     return;
                  }
               case 15:
                  var1 = this;

                  try {
                     var1.I.a((MainScreen)(new VDTT_mx(var1.I)));
                     break;
                  } catch (Exception var20) {
                     VDTT_jb.a(var20);
                     return;
                  }
               case 16:
                  for(int var32 = 0; var32 < VDTT_cw.v().aq.size(); ++var32) {
                     VDTT_gx var34;
                     if ((var34 = (VDTT_gx)VDTT_cw.v().aq.get(var32)).k == 59) {
                        VDTT_cw.v();
                        VDTT_cw.a(var34);
                        return;
                     }
                  }

                  return;
               case 50:
                  var1 = this;

                  try {
                     var30 = (VDTT_ek)var1.a;
                     VDTT_cw.v();
                     VDTT_cw.f(var30.aD);
                     break;
                  } catch (Exception var19) {
                     VDTT_jb.a(var19);
                     return;
                  }
               case 52:
                  var1 = this;

                  try {
                     var30 = (VDTT_ek)var1.a;
                     (var29 = new Message((byte)32)).a(var30.aD);
                     var29.l();
                     break;
                  } catch (Exception var18) {
                     VDTT_jb.a(var18);
                     return;
                  }
               case 54:
                  var1 = this;

                  try {
                     var30 = (VDTT_ek)var1.a;
                     VDTT_cw.v().k(var30.aD);
                     break;
                  } catch (Exception var17) {
                     VDTT_jb.a(var17);
                     return;
                  }
               case 58:
                  var1 = this;

                  try {
                     var30 = (VDTT_ek)var1.a;
                     (var29 = new Message((byte)19)).a(var30.aD);
                     var29.l();
                     break;
                  } catch (Exception var16) {
                     VDTT_jb.a(var16);
                     return;
                  }
               case 60:
                  var1 = this;

                  try {
                     var30 = (VDTT_ek)var1.a;
                     (var29 = Message.c((byte)-104)).a(var30.aD);
                     var29.l();
                     break;
                  } catch (Exception var11) {
                     VDTT_jb.a(var11);
                     return;
                  }
               case 61:
                  var1 = this;

                  try {
                     var30 = (VDTT_ek)var1.a;
                     (var29 = Message.c((byte)-105)).a(var30.aD);
                     var29.l();
                     break;
                  } catch (Exception var10) {
                     VDTT_jb.a(var10);
                     return;
                  }
               case 63:
                  var1 = this;

                  try {
                     var30 = (VDTT_ek)var1.a;
                     (var29 = Message.c((byte)-5)).a(var30.aD);
                     var29.l();
                     break;
                  } catch (Exception var9) {
                     VDTT_jb.a(var9);
                     return;
                  }
               case 100:
                  VDTT_cw.v();
                  VDTT_cw.o(0);
                  return;
               case 101:
                  VDTT_cw.v();
                  VDTT_cw.o(1);
                  return;
               case 102:
                  VDTT_cw.v();
                  VDTT_cw.o(2);
                  return;
               case 103:
                  VDTT_cw.v();
                  VDTT_cw.o(3);
                  return;
               case 104:
                  VDTT_cw.v();
                  VDTT_cw.o(4);
                  return;
               case 105:
                  VDTT_cw.v();
                  VDTT_cw.o(5);
                  return;
               case 106:
                  VDTT_cw.v();
                  VDTT_cw.o(18);
                  return;
               case 107:
                  VDTT_cw.v();
                  VDTT_cw.o(19);
                  return;
               case 108:
                  VDTT_cw.v();
                  VDTT_cw.i(8, 1);
                  return;
               case 109:
                  VDTT_cw.v();
                  VDTT_cw.i(8, 2);
                  return;
               case 110:
                  VDTT_cw.v();
                  VDTT_cw.i(8, 3);
                  return;
               case 111:
                  VDTT_cw.v();
                  VDTT_cw.i(8, 4);
                  return;
               case 112:
                  VDTT_cw.v();
                  VDTT_cw.i(8, 5);
                  return;
               case 113:
                  VDTT_cw.v();
                  VDTT_cw.i(9, VDTT_ek.m().aw);
                  return;
               case 114:
                  VDTT_cw.v();
                  VDTT_cw.i(10, VDTT_ek.m().aw);
                  return;
               case 115:
                  VDTT_cw.v();
                  VDTT_cw.i(11, VDTT_ek.m().aw);
                  return;
               case 116:
                  VDTT_cw.v();
                  VDTT_cw.i(12, VDTT_ek.m().aw);
                  return;
               case 117:
                  VDTT_cw.v();
                  VDTT_cw.i(13, VDTT_ek.m().aw);
                  return;
               case 118:
                  VDTT_cw.v();
                  VDTT_cw.i(14, VDTT_ek.m().aw);
                  return;
               case 119:
                  VDTT_cw.v();
                  VDTT_cw.i(15, VDTT_ek.m().aw);
                  return;
               case 120:
                  VDTT_cw.v();
                  VDTT_cw.i(16, VDTT_ek.m().aw);
                  return;
               case 121:
                  VDTT_cw.v();
                  VDTT_cw.i(17, VDTT_ek.m().aw);
                  return;
               case 122:
                  VDTT_cw.v();
                  VDTT_cw.o(81);
                  return;
               case 123:
                  VDTT_cw.v();
                  VDTT_cw.o(82);
                  return;
               case 124:
                  VDTT_cw.v();
                  VDTT_cw.o(83);
                  return;
               case 125:
                  VDTT_cw.v();
                  VDTT_cw.o(108);
                  return;
               case 126:
                  VDTT_cw.v();
                  VDTT_cw.o(102);
                  return;
               case 127:
                  VDTT_cw.v();
                  VDTT_cw.o(30);
                  return;
               case 200:
                  VDTT_cw.v().a((MainScreen)(new VDTT_js(VDTT_cw.v())));
                  return;
               case 201:
                  try {
                     if (f(4)) {
                        VDTT_cw.v();
                        VDTT_cw.o(50);
                     }
                     break;
                  } catch (Exception var7) {
                     VDTT_jb.a(var7);
                     return;
                  }
               case 202:
                  VDTT_cw.v();
                  VDTT_cw.o(87);
                  return;
               case 203:
                  VDTT_cw.v();
                  VDTT_cw.o(90);
                  return;
               case 204:
                  VDTT_cw.v();
                  VDTT_cw.o(94);
                  return;
               case 205:
                  VDTT_cw.v();
                  VDTT_cw.o(95);
                  return;
               case 206:
                  this.B();
                  return;
               case 207:
                  VDTT_cw.v();
                  VDTT_cw.o(85);
                  return;
               case 208:
                  VDTT_cw.v();
                  VDTT_cw.o(84);
                  return;
               case 209:
                  VDTT_cw.v();
                  VDTT_cw.o(101);
                  return;
               case 301:
                  VDTT_cw.v();
                  VDTT_cw.o(102);
                  return;
               case 302:
                  VDTT_cw.v();
                  VDTT_cw.o(87);
                  return;
               case 303:
                  VDTT_cw.v();
                  VDTT_cw.o(90);
                  return;
               case 401:
                  VDTT_cw.v();
                  VDTT_cw.o(94);
                  return;
               case 402:
                  VDTT_cw.v();
                  VDTT_cw.o(98);
                  return;
               case 501:
                  VDTT_cw.v();
                  VDTT_cw.o(99);
                  return;
               case 502:
                  VDTT_cw.v();
                  VDTT_cw.o(100);
                  return;
               case 503:
                  VDTT_cw.v();
                  VDTT_cw.o(101);
                  return;
               case 504:
                  VDTT_cw.v();
                  VDTT_cw.o(103);
                  return;
               case 601:
                  this.z();
                  return;
               case 602:
                  this.x();
                  return;
               case 603:
                  var1 = this;

                  try {
                     var1.I.a((MainScreen)(new VDTT_jz(var1.I, Caption.Bq, (byte)106)));
                     break;
                  } catch (Exception var8) {
                     VDTT_jb.a(var8);
                     return;
                  }
               case 800:
                  VDTT_cw.v().a((MainScreen)(new VDTT_lq(VDTT_cw.v())));
                  return;
               case 801:
                  VDTT_cw.v().a((MainScreen)(new VDTT_lo(VDTT_cw.v())));
                  return;
               case 802:
                  VDTT_cw.v().a((MainScreen)(new VDTT_jh(VDTT_cw.v())));
                  return;
               case 803:
                  VDTT_cw.v().ae();
                  return;
               case 804:
                  VDTT_cw.v().E();
                  return;
               case 805:
                  VDTT_cw.v().a((MainScreen)(new VDTT_kb(VDTT_cw.v(), VDTT_ek.m(), VDTT_cw.v().ae, 2)));
                  return;
               case 900:
                  this.I.a((MainScreen)(new VDTT_lr(this.I)));
                  return;
               case 901:
                  VDTT_cw.v().b((String) Caption.m).f.clear();
                  VDTT_cm.K = true;
                  VDTT_d.g().f = 50;
                  return;
               case 902:
                  DataCenter.d().ai.a(Caption.jB, 2991, DataCenter.d().ai);
                  return;
               case 903:
                  VDTT_cw.v();
                  VDTT_cw.o(56);
                  return;
               case 904:
                  this.I.a((MainScreen)(new VDTT_kx(this.I)));
                  return;
               case 905:
                  this.I.a((MainScreen)(new VDTT_lf(this.I)));
                  break;
               case 4001:
                  var30 = (VDTT_ek)this.a;
                  VDTT_cw.v();
                  VDTT_cw.h(var30.aD);
                  return;
               case 4002:
                  var1 = this;

                  try {
                     var30 = (VDTT_ek)var1.a;
                     VDTT_cw.v();
                     VDTT_cw.g(var30.aD);
                     break;
                  } catch (Exception var15) {
                     VDTT_jb.a(var15);
                     return;
                  }
               case 4003:
                  var1 = this;

                  try {
                     VDTT_bc.K = (var30 = (VDTT_ek)var1.a).aD;
                     VDTT_ke var28 = new VDTT_ke(VDTT_cw.v(), 5);
                     VDTT_cw.v().a((String)var30.aD, (VDTT_kd)var28);
                     break;
                  } catch (Exception var14) {
                     VDTT_jb.a(var14);
                     return;
                  }
               case 4004:
                  var1 = this;

                  try {
                     var30 = (VDTT_ek)var1.a;
                     VDTT_cw.v().i(var30.aD);
                     break;
                  } catch (Exception var13) {
                     VDTT_jb.a(var13);
                     return;
                  }
               case 4005:
                  try {
                     VDTT_cw.v();
                  } catch (Exception var12) {
                     VDTT_jb.a(var12);
                     return;
                  }
               }
            }
         }

      } catch (Exception var27) {
         VDTT_jb.a(var27);
      }
   }

   private void x() {
      try {
         if (f(1)) {
            VDTT_cw.v();
            VDTT_cw.o(57);
         }
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   private static boolean f(int var0) {
      if (VDTT_ek.m().az < var0) {
         switch(var0) {
         case 1:
         case 2:
            DataCenter.d().ai.c(VDTT_jb.b(Caption.nY, Caption.ov), -1);
            break;
         case 3:
         case 4:
            DataCenter.d().ai.c(VDTT_jb.b(Caption.nY, Caption.ow), -1);
            break;
         case 5:
            DataCenter.d().ai.c(VDTT_jb.b(Caption.nY, Caption.ox), -1);
         }

         return false;
      } else {
         return true;
      }
   }

   public final Vector g() {
      Vector var1 = super.g();
      if (this.w()) {
         (var1 = new Vector()).addElement(this.P.a(1001, this));
         var1.addElement(new VDTT_hl(0, -this.objX, -this.objY, DataCenter.d().n, DataCenter.d().o, (VDTT_hs)null, this));
      } else {
         var1.addElement(this.P.a(1001, this));
      }

      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1000:
         this.k();
         return;
      case 1001:
         if (var1.j.k >= 0) {
            this.Q = 3;
            return;
         }
         break;
      default:
         if (this.w()) {
            this.k();
         }
      }

   }

   private void z() {
      try {
         if (f(1)) {
            this.I.a((MainScreen)(new VDTT_jz(this.I, Caption.zL, (byte)78)));
         }
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   private static void A() {
      try {
         VDTT_cw.v();
         VDTT_cw.o(50);
      } catch (Exception var1) {
         VDTT_jb.a(var1);
      }
   }

   private void B() {
      try {
         if (f(5)) {
            this.I.a((MainScreen)(new VDTT_mb(this.I, "", Caption.yU, new int[]{122, 123, 125, 126, 202, 203, 204, 205, 207, 208, 209})));
         }
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }
}
