package core.mchien.main2;

import java.util.Vector;

public final class VDTT_bc extends VDTT_m {
   public static VDTT_ej[] l = new VDTT_ej[6];
   public static byte[] m = new byte[9];
   public Vector n = new Vector();
   public Vector I = new Vector();
   private Vector N = new Vector();
   public VDTT_hs J;
   private VDTT_hs O;
   private byte P;
   private int Q;
   private int R;
   public static String K = "";
   public static VDTT_iu L;
   public int M = 16;
   private int S = -1;
   private int T;

   public VDTT_bc(int var1, int var2, int var3, int var4, MainScreen var5, byte var6, int var7, int var8) {
      this.a = var5;
      this.P = var6;
      this.Q = var7;
      this.M = VDTT_jb.n(16);
      this.f(var1, var2);
      this.d(var3, var4);
      if (var6 == 1) {
         if (VDTT_eq.a().b(29) == 2) {
            this.O = new VDTT_hs((byte)1, -97, 30, 90, var4 - 30, 15, this.I.size());
         } else {
            this.O = new VDTT_hs((byte)1, var3 + 9, 30, 90, var4 - 30, 15, this.I.size());
         }
      } else {
         this.O = new VDTT_hs((byte)1, 0, 0, 0, var4, var8, this.I.size());
      }

      this.J = new VDTT_hs((byte)1, 0, 0, var3, var4, var8, this.n.size());
      VDTT_kc.w();
   }

   public static void a(int var0, String var1, String var2, VDTT_ft var3) {
      boolean var6 = false;

      try {
         for(int var4 = 0; var4 < m.length; ++var4) {
            if (m[var4] != -1 && VDTT_kc.a[m[var4]] == 1) {
               VDTT_em var7;
               (var7 = new VDTT_em(m[1], var1, var2)).f = var3;
               l[0].a(var7);
               var6 = true;
               break;
            }
         }
      } catch (Exception var5) {
         VDTT_jb.a(var5);
      }

      VDTT_cw.v().c(var6);
   }

   public static void a(int var0, String var1, String var2) {
      boolean var3 = false;

      try {
         for(int var4 = 0; var4 < m.length; ++var4) {
            if (m[var4] != -1 && VDTT_kc.a[m[var4]] == var0) {
               l[0].a(new VDTT_em(var0, var1, var2));
               var3 = true;
               break;
            }
         }

         switch(var0) {
         case 2:
            l[4].a(new VDTT_em(2, var1, var2));
            break;
         case 3:
            l[2].a(new VDTT_em(3, var1, var2));
            break;
         case 4:
            l[3].a(new VDTT_em(4, var1, var2));
         case 5:
         case 6:
         case 7:
         case 8:
         default:
            break;
         case 9:
            l[5].a(new VDTT_em(9, var1, var2));
         }
      } catch (Exception var5) {
      }

      VDTT_cw.v().c(var3);
   }

   public static void a(int var0, String var1, String var2, String var3) {
      boolean var6 = false;

      try {
         for(int var4 = 0; var4 < m.length; ++var4) {
            if (m[var4] != -1 && VDTT_kc.a[m[var4]] == 5) {
               l[0].a(new VDTT_em(5, var1, var2, var3));
               var6 = true;
               break;
            }
         }

         l[1].a.addElement(new VDTT_em(5, var1, var2, var3));
      } catch (Exception var5) {
         VDTT_jb.a(var5);
      }

      VDTT_cw.v().c(var6);
   }

   public final void d() {
      this.I.clear();
      this.n.clear();
      this.S = -1;
      this.N.clear();
      Vector var3 = new Vector();

      VDTT_em var1;
      int var4;
      int var8;
      for(var4 = 0; var4 < l[this.P].a.size(); ++var4) {
         String var2 = "";
         switch((var1 = (VDTT_em)l[this.P].a.elementAt(var4)).a) {
         case 0:
            if (var1.b.equals(VDTT_ek.m().aD)) {
               var2 = var2 + ":-lc c#ME" + var1.b + ": c#white";
            } else {
               var2 = var2 + ":-lc c#LC" + var1.b + ": c#white";
            }
            break;
         case 1:
            String var5 = ":-tg";
            String var6 = "c#TG";
            if (var1.d.startsWith(":-loa")) {
               var5 = ":-tt";
               var6 = "c#TT";
            }

            if (var1.b.equals(VDTT_ek.m().aD)) {
               var2 = var2 + var5 + " c#ME" + var1.b + ": c#white";
            } else if (var1.b.equals(Caption.ep)) {
               var2 = var2 + var5 + " c#yellow" + var1.b + ": c#white";
            } else {
               var2 = var2 + var5 + " " + var6 + var1.b + ": c#white";
            }
            break;
         case 2:
            if (var1.b.equals(VDTT_ek.m().aD)) {
               var2 = var2 + ":-mp c#ME" + var1.b + ": c#white";
            } else {
               var2 = var2 + ":-mp c#MP" + var1.b + ": c#white";
            }
            break;
         case 3:
            if (var1.b.equals(VDTT_ek.m().aD)) {
               var2 = var2 + ":-b c#ME" + var1.b + ": c#white";
            } else {
               var2 = var2 + ":-b c#BG" + var1.b + ": c#white";
            }
            break;
         case 4:
            if (var1.b.equals(VDTT_ek.m().aD)) {
               var2 = var2 + ":-n c#ME" + var1.b + ": c#white";
            } else {
               var2 = var2 + ":-n c#NM" + var1.b + ": c#white";
            }
            break;
         case 5:
            if (var1.b.equals(VDTT_ek.m().aD)) {
               var2 = var2 + ":-r c#ME" + var1.b + ": c#white";
            } else {
               var2 = var2 + ":-r c#RG" + var1.b + ": c#white";
            }
            break;
         case 6:
            if (var1.b.equals(VDTT_ek.m().aD)) {
               var2 = var2 + ":-sv c#ME" + var1.b + ": c#white";
            } else if (var1.b.equals(Caption.ep)) {
               var2 = var2 + ":-sv c#yellow" + var1.b + ": c#white";
            } else {
               var2 = var2 + ":-sv c#SV" + var1.b + ": c#white";
            }
         case 7:
         default:
            break;
         case 8:
            if (var1.b.equals(VDTT_ek.m().aD)) {
               var2 = var2 + ":-tt c#ME" + var1.b + ": c#white";
            } else {
               var2 = var2 + ":-tt c#TT" + var1.b + ": c#white";
            }
            break;
         case 9:
            if (var1.b.equals(VDTT_ek.m().aD)) {
               var2 = var2 + ":-ht c#ME" + var1.b + ": c#white";
            } else {
               var2 = var2 + ":-ht c#HT" + var1.b + ": c#white";
            }
         }

         var2 = var2 + var1.d;
         if (this.P != 1 || K.length() <= 0 || K.equals(var1.c) || K.equals(var1.b)) {
            Vector var7;
            if (!(this.a instanceof VDTT_kd)) {
               (var7 = new Vector()).add(var2);
               this.S = this.n.size();
               this.T = 0;
            } else {
               var7 = VDTT_dg.a(VDTT_dg.d, var2, this.J.q - 15);
            }

            VDTT_jb.a(this.n, var7);

            for(var8 = 0; var8 < var7.size(); ++var8) {
               if (((String)var7.elementAt(var8)).contains("c#item")) {
                  this.N.addElement(var1.f);
               }
            }
         }

         if (this.P == 1) {
            if (K.equals(Caption.eq) || var1.c.equals(K) || var1.b.equals(K)) {
               var1.e = true;
            }
         } else {
            var1.e = true;
         }

         if (var1.c.length() > 0) {
            if (!var3.contains(var1.c) && !var1.c.equals(VDTT_ek.m().aD)) {
               var3.addElement(var1.c);
               this.I.addElement(new VDTT_iu(0, var1.c));
            }

            if (!var3.contains(var1.b) && !var1.b.equals(VDTT_ek.m().aD)) {
               var3.addElement(var1.b);
               this.I.addElement(new VDTT_iu(0, var1.b));
            }
         }
      }

      this.O.a(this.O.g, this.O.h, this.I.size());
      this.J.a(this.J.g, this.J.h, this.n.size());

      for(var4 = 0; var4 < this.I.size(); ++var4) {
         VDTT_iu var9 = (VDTT_iu)this.I.elementAt(var4);
         var8 = 0;

         for(int var10 = 0; var10 < l[this.P].a.size(); ++var10) {
            if (!(var1 = (VDTT_em)l[this.P].a.elementAt(var10)).e && (var10 == 0 && var1.c.length() == 0 || var1.b.equals(var9.b) || var1.c.equals(var9.b))) {
               ++var8;
            }
         }

         var9.a = var8;
      }

   }

   public final short f() {
      short var1 = 0;

      for(int var3 = 0; var3 < l[this.P].a.size(); ++var3) {
         if (!((VDTT_em)l[this.P].a.elementAt(var3)).e) {
            ++var1;
         }
      }

      return var1;
   }

   public final void b(Graphics var1) {
      try {
         if (!this.d) {
            int var2 = var1.e;
            int var3 = var1.f;
            int var4 = -1;
            if (this.R > 0) {
               --this.R;
            }

            int var8;
            String var16;
            int var18;
            int var10003;
            int var19;
            int var20;
            if (!(this.a instanceof VDTT_kd)) {
               try {
                  var10003 = this.J.q - 2;
                  int var9 = this.J.r;
                  var8 = var10003;
                  VDTT_hs var7 = this.J;
                  Graphics var6 = var1;
                  VDTT_bc var5 = this;

                  try {
                     var5.f = var6.e;
                     var5.g = var6.f;
                     var5.h = var6.k();
                     var5.i = var6.l();
                     var5.j = var6.h;
                     var5.k = var6.i;
                     if (var8 > var5.j) {
                        var8 = var5.j;
                     }

                     if (var9 > var5.k) {
                        var9 = var5.k;
                     }

                     var7.a(var6, var5.a(), var5.b(), var8, var9);
                  } catch (Exception var13) {
                  }

                  for(var18 = 0; var18 < this.n.size(); ++var18) {
                     var16 = (String)this.n.elementAt(var18);
                     if (this.R == 0 && var16.contains("c#select")) {
                        var16 = var16.replaceAll("c#select", "");
                        this.n.set(var18, var16);
                     }
                  }

                  if ((var18 = this.n.size() - 1) < 0) {
                     var18 = 0;
                  }

                  for(var20 = var18; var20 < this.n.size(); ++var20) {
                     var16 = (String)this.n.elementAt(var20);
                     var8 = this.q / 2;
                     if (var20 == this.S) {
                        if (this.T > 160) {
                           var4 = VDTT_dg.d(VDTT_dg.d, var1, var16, 0 - (this.T - 160), this.M / 2, 0, var4, -16777216);
                        } else {
                           var4 = VDTT_dg.d(VDTT_dg.d, var1, var16, 0, this.M / 2, 0, var4, -16777216);
                        }
                     } else {
                        var4 = VDTT_dg.d(VDTT_dg.d, var1, var16, var8, this.M / 2, 2, var4, -16777216);
                     }
                  }

                  this.a(var1);
                  this.a(var1, var2, var3);
                  var19 = 1;

                  boolean var10000;
                  label180:
                  while(true) {
                     if (var19 >= l.length) {
                        var10000 = false;
                        break;
                     }

                     for(var18 = 0; var18 < l[var19].a.size(); ++var18) {
                        VDTT_em var21;
                        if (!(var21 = (VDTT_em)l[var19].a.elementAt(var18)).e && var21.a == 5) {
                           var10000 = true;
                           break label180;
                        }
                     }

                     ++var19;
                  }

                  if (var10000) {
                     VDTT_dc.a(var1, 713, 0, -2, -2, 3);
                  }
               } catch (Exception var14) {
               }
            } else {
               this.a(var1, this.J);

               for(var18 = 0; var18 < this.n.size(); ++var18) {
                  var16 = (String)this.n.elementAt(var18);
                  if (this.J.b(var18)) {
                     var4 = VDTT_dg.d(VDTT_dg.d, var1, var16, 5, 8 + var18 * 16, 20, var4, -16777216);
                  }

                  if (this.R == 0 && var16.contains("c#select")) {
                     var16 = var16.replaceAll("c#select", "");
                     this.n.set(var18, var16);
                  }
               }

               this.a(var1);
               this.a(var1, var2, var3);
               this.J.a(var1, -8, -10, -16313837);
            }

            if (this.P == 1) {
               this.a(var1, var2, var3);
               if (this.I.size() > 0) {
                  if (VDTT_eq.a().b(29) == 2) {
                     VDTT_aa.a(var1, 14, -360, this.O.objX + 2, this.O.objY - 1, this.O.q + 1, (int)(this.O.r + 4));
                     int var10002 = this.O.objX + 1;
                     var10003 = this.O.objY - 3;
                     int var10005 = this.O.r + 8;
                     boolean var17 = true;
                     var17 = true;
                     var17 = false;
                     var17 = true;
                     var17 = true;
                     var17 = true;
                     var17 = false;
                     var4 = var10005;
                     short var24 = this.O.q;
                     var8 = var10003;
                     var20 = var10002;
                     int var10 = var1.e;
                     int var11 = var1.f;
                     var1.a(var20, var8);
                     var20 = VDTT_dc.c(3).c / DataCenter.d().r;
                     if (VDTT_dc.a(4)) {
                        var8 = var20;
                     } else {
                        var8 = VDTT_dc.c(4).c / DataCenter.d().r;
                     }

                     VDTT_aa.a(var1, 0, 90, 0, 1, var24 - 0, (int)(var4 - 2));
                     VDTT_aa.a(var1, 4, 0, var20, 0, var24 - var20 + 1, (int)var8);
                     VDTT_aa.a(var1, 4, 180, var20, var4 - var8, var24 - var20 + 1, (int)var8);
                     VDTT_aa.a(var1, 4, -90, 0, var20, var8, (int)(var4 - var20 * 2));
                     VDTT_dc.a(var1, 3, 0, var8, 0, 24);
                     VDTT_dc.a(var1, 3, 270, var8, var4, 40);
                     this.a(var1, var10, var11);
                  } else {
                     VDTT_aa.a(var1, 14, 0, this.O.objX - 2, this.O.objY - 1, this.O.q + 1, (int)(this.O.r + 4));
                     this.a(var1, this.O.objX - 1, this.O.objY - 3, this.O.q, this.O.r + 8, 0, 3, 4, 4, 0, 1, 90);
                  }
               }

               this.a(var1, this.O);

               for(var18 = 0; var18 < this.I.size(); ++var18) {
                  if (this.O.b(var18)) {
                     VDTT_iu var23;
                     String var22 = (var23 = (VDTT_iu)this.I.elementAt(var18)).b;
                     var8 = 5;
                     var19 = 8 + var18 * 16;
                     if (var18 == this.O.l && !this.O.o) {
                        ++var8;
                        ++var19;
                     }

                     if (VDTT_eq.a().b(29) == 2) {
                        if (var22.equals(K)) {
                           VDTT_dg.b(VDTT_dg.d, var1, var22 + (var23.a > 0 ? " (" + var23.a + ")" : ""), var8 - 1 + 20, var19 - 1, 0, -2560, -10275328);
                        } else {
                           VDTT_dg.b(VDTT_dg.d, var1, var22 + (var23.a > 0 ? " (" + var23.a + ")" : ""), var8 - 1 + 20, var19 - 1, 0, -6488, -10275328);
                        }

                        if (var18 == this.O.l && this.O.o) {
                           var1.e(30);
                           VDTT_dc.a(var1, 52, 0, 20, 8 + var18 * 16 + 1, 10);
                           var1.h();
                        } else {
                           VDTT_dc.a(var1, 52, 0, 20, 8 + var18 * 16, 10);
                        }
                     } else {
                        if (var22.equals(K)) {
                           VDTT_dg.b(VDTT_dg.d, var1, var22 + (var23.a > 0 ? " (" + var23.a + ")" : ""), var8 - 1 + this.O.q - 30, var19 - 1, 1, -2560, -10275328);
                        } else {
                           VDTT_dg.b(VDTT_dg.d, var1, var22 + (var23.a > 0 ? " (" + var23.a + ")" : ""), var8 - 1 + this.O.q - 30, var19 - 1, 1, -6488, -10275328);
                        }

                        if (var18 == this.O.l && this.O.o) {
                           var1.e(30);
                           VDTT_dc.a(var1, 52, 0, this.O.q - 5 + 1, 8 + var18 * 16 + 1, 10);
                           var1.h();
                        } else {
                           VDTT_dc.a(var1, 52, 0, this.O.q - 5, 8 + var18 * 16, 10);
                        }
                     }
                  }
               }

               this.a(var1);
               this.a(var1, var2, var3);
               this.J.a(var1, -8, -10, -16313837);
            }

         }
      } catch (Exception var15) {
         VDTT_jb.a(var15);
      }
   }

   public final void a_() {
      this.O.a();
      this.J.a();
      if (this.S >= 0) {
         this.T += 2;
      }

   }

   public final Vector g() {
      Vector var1 = new Vector();

      try {
         if (this.d) {
            return var1;
         }

         if (!(this.a instanceof VDTT_kd)) {
            var1.add(new VDTT_hl(5011, 0, 0, this.q, this.r, (VDTT_hs)null, this));
            return var1;
         }

         int var2;
         for(var2 = 0; var2 < this.I.size(); ++var2) {
            if (this.O.b(var2)) {
               VDTT_iu var3 = (VDTT_iu)this.I.elementAt(var2);
               VDTT_hl var4 = new VDTT_hl(5009, this.O.objX + this.O.q - 20, this.O.objY + var2 * 16 - this.O.f, this.O.objX + this.O.q, this.O.objY + var2 * 16 + 16 - this.O.f, this.O, this, new VDTT_iu(0, var3.b));
               if (VDTT_eq.a().b(29) == 2) {
                  var4 = new VDTT_hl(5009, this.O.objX + 5, this.O.objY + var2 * 16 - this.O.f, this.O.objX + 21, this.O.objY + var2 * 16 + 16 - this.O.f, this.O, this, new VDTT_iu(0, var3.b));
               }

               if (VDTT_jb.a(this.O.objX, this.O.objY, this.O.objX + this.O.q, this.O.objY + this.O.r, var4.a(), var4.b())) {
                  var1.addElement(var4);
               }
            }
         }

         var2 = -1;

         for(int var6 = 0; var6 < this.n.size(); ++var6) {
            String var7;
            VDTT_in var8;
            VDTT_hl var10;
            String[] var13;
            if ((var7 = (String)this.n.elementAt(var6)).contains(":-") && (var13 = var7.split(": ")).length > 0 && (var13 = (var7 = var13[0]).split(" c#")).length > 1) {
               var8 = VDTT_di.b(var7 = "c#" + var13[1]);
               if (!(var7 = var7.substring(var8.d.length(), var7.length())).equals(Caption.er) && !var7.equals(Caption.ep) && !var7.equals(Caption.h) && !var7.equals(VDTT_ek.m().aD)) {
                  var10 = new VDTT_hl(5008, 20, var6 * 16 - this.J.f, 23 + VDTT_dg.b(VDTT_dg.d, var7), var6 * 16 + 16 - this.J.f, this.J, this, new VDTT_iu(0, var7));
                  if (this.J.b(var6) && VDTT_jb.a(this.J.objX, this.J.objY, this.J.objX + this.J.q, this.J.objY + this.J.r, var10.a(), var10.b())) {
                     var1.addElement(var10);
                  }
               }
            }

            boolean var5 = (var7 = (String)this.n.elementAt(var6)).contains(Caption.wH);
            if (var7.contains("c#item")) {
               ++var2;
               var13 = var7.split("c#item");
               int var11 = this.J.objX + 3 + VDTT_dg.c(VDTT_dg.d, var13[0]);
               int var12 = this.J.objY + var6 * this.J.h - this.J.f;
               if ((var8 = VDTT_di.c(var7 = var13[1])) != null) {
                  var7 = var7.split(var8.d)[0];
               }

               if (var5) {
                  var10 = new VDTT_hl(5010, var11, var12, var11 + VDTT_dg.c(VDTT_dg.d, var7) + 2, var12 + this.J.h, this.J, this, new VDTT_iu(var2, var7));
               } else {
                  var10 = new VDTT_hl(5012, var11, var12, var11 + VDTT_dg.c(VDTT_dg.d, var7) + 2, var12 + this.J.h, this.J, this, new VDTT_iu(var2, var7));
               }

               if (this.J.b(var6) && VDTT_jb.a(this.J.objX, this.J.objY, this.J.objX + this.J.q, this.J.objY + this.J.r, var10.a(), var10.b())) {
                  var1.addElement(var10);
               }
            }
         }

         if (this.I.size() > 0) {
            var1.addElement(this.O.a(5007, this));
         }

         var1.addElement(this.J.a(this.Q, this));
      } catch (Exception var9) {
      }

      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (!this.d) {
         int var4;
         VDTT_iu var5;
         Vector var6;
         int var10001;
         int var10002;
         switch(var1.b) {
         case 2001:
            String var9 = K;
            VDTT_bc var8 = this;

            for(var3 = 0; var3 < var8.I.size() && !((VDTT_iu)var8.I.elementAt(var3)).b.equals(var9); ++var3) {
            }

            --var3;
            if (var3 < 0) {
               var3 = 0;
            }

            for(var4 = l[var8.P].a.size() - 1; var4 >= 0; --var4) {
               VDTT_em var10;
               if ((var10 = (VDTT_em)l[var8.P].a.elementAt(var4)).b.equals(var9) || var10.c.equals(var9)) {
                  l[var8.P].a.remove(var10);
               }
            }

            var8.a(var3);
            return;
         case 5007:
            if (var1.j.k >= 0) {
               this.a(var1.j.k);
               return;
            }
            break;
         case 5008:
            if (var1.j.k >= 0) {
               var10001 = this.objX + var2;
               var10002 = this.objY + var3;
               var5 = (VDTT_iu)var1.k;
               var4 = var1.j.k;
               var3 = var10002;
               var2 = var10001;
               String var11 = ((String)this.n.elementAt(var4)).replaceAll(var5.b, "c#select" + var5.b);
               this.n.set(var4, var11);
               this.R = 6;
               L = var5;
               var6 = new Vector();
               if (VDTT_cw.v().bp != null && !VDTT_cw.v().bp.c()) {
                  if (VDTT_cw.v().bp.a() && !VDTT_cw.v().bp.a(var5.b)) {
                     var6.addElement(new VDTT_iu(6008, Caption.ex));
                  }
               } else {
                  var6.addElement(new VDTT_iu(6008, Caption.ew));
               }

               MainScreen.a(var6, var5.b);
               this.a.a(var6, var5.b, var4, var2, var3);
               return;
            }
            break;
         case 5009:
            this.a(((VDTT_iu)var1.k).b);
            DataCenter.d().ai.a(Caption.et + ((VDTT_iu)var1.k).b + Caption.eu, 2001, this);
            return;
         case 5010:
            if (var1.j.k >= 0) {
               this.a(this.objX + var2, this.objY + var3, (VDTT_iu)var1.k);
               return;
            }
            break;
         case 5011:
            VDTT_ac.b().n();
            VDTT_ac.b().w();
            VDTT_cw var7;
            if ((var7 = VDTT_cw.v()).D()) {
               var7.a((MainScreen)(new VDTT_ke(var7, var7.aQ.j())));
            }

            return;
         case 5012:
            if (var1.j.k >= 0) {
               var10001 = this.objX + var2;
               var10002 = this.objY + var3;
               var5 = (VDTT_iu)var1.k;
               var4 = var1.j.k;
               var3 = var10002;
               var2 = var10001;
               (var6 = new Vector()).addElement(new VDTT_iu(4004, Caption.dR));
               this.a.a(var6, var5.b, var4, var2, var3);
            }
         }

      }
   }

   private void a(int var1, int var2, VDTT_iu var3) {
      try {
         VDTT_ft var4 = (VDTT_ft)this.N.elementAt(var3.a);
         MainScreen var10000 = this.a;
         boolean var7 = false;
         MainScreen var8 = this.a;
         VDTT_bo var10001;
         if (var4 == null) {
            var10001 = null;
         } else {
            VDTT_bn var12;
            if ((var12 = new VDTT_bn(var1, var2, 1044, var8, var4)).objX > DataCenter.d().n - var12.q - var8.objX) {
               var12.objX = (short)(DataCenter.d().n - var12.q - var8.objX);
            }

            if (var12.objX < var1 - 0) {
               var12.objX = (short)(var1 - (var12.q + 3));
            }

            if (var12.objX < -var8.objX) {
               var12.objX = (short)(-var8.objX);
            }

            if (var12.objY > DataCenter.d().o - var12.r - var8.objY) {
               var12.objY = (short)(DataCenter.d().o - var12.r - var8.objY);
            }

            VDTT_bo var10 = new VDTT_bo(var1 - 32, var2 + 32, var12);
            var8.a(var10);
            var10001 = var10;
         }

         var10000.k = var10001;
         var2 = -1;
         int var11 = 0;

         while(true) {
            if (var11 >= this.n.size()) {
               return;
            }

            String var9;
            if ((var9 = (String)this.n.elementAt(var11)).contains("c#item")) {
               ++var2;
               if (var2 == var3.a) {
                  this.R = 6;
                  var9 = var9.replaceAll(var3.b, "c#select" + var3.b);
                  this.n.set(var11, var9);
                  break;
               }
            }

            ++var11;
         }
      } catch (Exception var6) {
         VDTT_jb.a(var6);
      }

   }

   public final void h() {
      this.J.j = this.J.i;
      this.J.e();
      VDTT_hs var1;
      (var1 = this.J).c = var1.j * var1.h;
      if (var1.c < var1.d) {
         var1.c = var1.d;
      }

      if (var1.c > var1.e) {
         var1.c = var1.e;
      }

      var1.f = var1.c;
   }

   private void a(int var1) {
      try {
         K = ((VDTT_iu)this.I.elementAt(var1)).b;
      } catch (Exception var3) {
         K = "";
      }

      this.d();
      if (this.a instanceof VDTT_kd) {
         VDTT_kd var4;
         (var4 = (VDTT_kd)this.a).P.b.d[var4.P.h()] = this.f();
         if (var4.R.m) {
            this.h();
         }
      }

   }

   public final void a(String var1) {
      K = var1;
      this.d();
      if (this.a instanceof VDTT_kd) {
         VDTT_kd var3;
         (var3 = (VDTT_kd)this.a).P.b.d[var3.P.h()] = this.f();
         if (var3.R.m) {
            this.h();
         }
      }

   }

   static {
      for(int var0 = 0; var0 < l.length; ++var0) {
         l[var0] = new VDTT_ej();
      }

   }
}
