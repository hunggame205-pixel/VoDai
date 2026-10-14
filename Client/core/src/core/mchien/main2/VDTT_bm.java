package core.mchien.main2;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Blending;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Vector;

public final class VDTT_bm extends VDTT_ae {
   public Vector a = new Vector();
   public Vector b;
   private boolean e = true;
   private boolean f = false;
   private boolean g;
   private VDTT_ik h;
   private VDTT_ik i;
   private VDTT_ik j;
   private VDTT_ik k;
   private short l;
   private short m;
   private MainScreen n;
   private byte o;
   private byte p;
   private byte I;
   private int J;
   private int K;
   private int L;
   private int M;
   private int N;
   private int O;
   private boolean P;
   public boolean c;
   private boolean Q;
   public VDTT_v d;
   private int R;

   public VDTT_bm(MainScreen var1, byte var2, int var3) {
      this.h = new VDTT_ik(this, (byte)2, this.q);
      this.i = new VDTT_ik(this, (byte)3, this.r);
      this.R = 0;
      this.n = var1;
      this.o = var2;
      this.p = (byte)var3;
   }

   public VDTT_bm(MainScreen var1, byte var2) {
      this.h = new VDTT_ik(this, (byte)2, this.q);
      this.i = new VDTT_ik(this, (byte)3, this.r);
      this.R = 0;
      this.n = var1;
      this.o = 2;
   }

   public final void a(VDTT_m var1) {
      var1.e = this;
      this.a.remove(var1);
      this.h();
   }

   public final void b(VDTT_m var1) {
      var1.e = this;
      this.a.insertElementAt(var1, 0);
      this.h();
   }

   public final void a(Vector var1) {
      for(int var3 = 0; var3 < var1.size(); ++var3) {
         VDTT_m var2;
         (var2 = (VDTT_m)var1.elementAt(var3)).e = this;
         this.a.addElement(var2);
      }

      this.h();
   }

   private void h() {
      this.objX = this.objY = this.q = this.r = 0;

      VDTT_m var1;
      int var2;
      for(var2 = 0; var2 < this.a.size(); ++var2) {
         var1 = (VDTT_m)this.a.elementAt(var2);
         if (var2 == 0) {
            this.objX = var1.objX;
            this.objY = var1.objY;
         } else {
            if (var1.objX < this.objX) {
               this.objX = var1.objX;
            }

            if (var1.objY < this.objY) {
               this.objY = var1.objY;
            }
         }
      }

      for(var2 = 0; var2 < this.a.size(); ++var2) {
         if ((var1 = (VDTT_m)this.a.elementAt(var2)).objX + var1.q - this.objX > this.q) {
            this.q = (short)(var1.objX + var1.q - this.objX);
         }

         if (var1.objY + var1.r - this.objY > this.r) {
            this.r = (short)(var1.objY + var1.r - this.objY);
         }
      }

      this.h.a(this.q);
      this.i.a(this.r);
      this.l = this.q;
      this.m = this.r;
      if (this.I == 2) {
         this.a(false);
      } else if (this.I == 1) {
         this.a(true);
      } else if (this.e) {
         this.h.a(this.q);
         this.i.a(this.r);
      } else {
         this.q = this.r = 0;
         this.h.a(this.q);
         this.i.a(this.r);
      }
   }

   public final VDTT_m a() {
      return this.a.size() > 0 ? (VDTT_m)this.a.lastElement() : null;
   }

   public final void c(VDTT_m var1) {
      Object var2 = this.a.lastElement();
      this.a.removeElement(var1);
      this.a.addElement(var1);
      if (!var1.equals(var2)) {
         this.a.removeElement(var2);
         this.a.addElement(var2);
      }

   }

   public final void b() {
      boolean var1 = this.h.a();
      boolean var2 = this.i.a();
      if (var1 && !this.i.b() || var2 && !this.h.b()) {
         this.a(this.I == 1);
      }

      VDTT_m var7;
      if (this.j != null && this.k != null && !this.c() && !this.d() && (var7 = this.a()) != null && !var7.e(0)) {
         short var9 = var7.objX;
         short var3 = var7.objY;
         this.j.a();
         this.k.a();
         int var10 = var7.objX - var9;
         int var11 = var7.objY - var3;
         VDTT_m var4 = var7;
         var11 = var11;
         var10 = var10;
         VDTT_bm var8 = this;

         for(int var6 = 0; var6 < var8.a.size(); ++var6) {
            VDTT_m var5;
            if (!(var5 = (VDTT_m)var8.a.elementAt(var6)).equals(var4)) {
               var5.f(var5.objX + var10, var5.objY + var11);
            }
         }

         var8.h();
         if (!this.j.b() && !this.k.b()) {
            this.j = null;
            this.k = null;
            if (this.P) {
               this.f();
            }
         }
      }

   }

   private void b(boolean var1) {
      for(int var3 = 0; var3 < this.a.size(); ++var3) {
         VDTT_m var2;
         if (!(var2 = (VDTT_m)this.a.elementAt(var3)).equals(this.a())) {
            var2.b(var1);
         }
      }

   }

   public final void a(Graphics var1) {
      int var3 = var1.e;
      int var4 = var1.f;
      if (this.h.b() || this.i.b()) {
         switch(this.o) {
         case 0:
            this.a(var1, this.objX, this.objY, this.q, this.r);
            break;
         case 1:
            this.a(var1, this.objX + this.l - this.q, this.objY, this.q, this.r);
            break;
         case 2:
            this.a(var1, this.objX, this.objY + this.m - this.r, this.q, this.r);
            break;
         case 3:
            this.a(var1, this.objX + this.l - this.q, this.objY + this.m - this.r, this.q, this.r);
            break;
         case 4:
            this.a(var1, this.objX, this.objY, this.l, this.r);
            break;
         case 5:
            this.a(var1, this.objX, this.objY + this.m - this.r, this.l, this.r);
            break;
         case 6:
            this.a(var1, this.objX + this.l - this.q, this.objY, this.q, this.m);
            break;
         case 7:
            this.a(var1, this.objX, this.objY, this.q, this.m);
         }
      }

      VDTT_m var2;
      int var5;
      int var6;
      if (this.f && (this.q > 0 || this.objY > 0) || this.e) {
         this.a(var1, this.objX + DataCenter.d().ai.objX, this.objY + DataCenter.d().ai.objY);
         switch(this.p) {
         case 1:
            if (!DataCenter.l()) {
               if (this.d == null) {
                  var6 = VDTT_jb.n(74);
                  this.d = VDTT_v.a(var6 * DataCenter.d().r, VDTT_jb.n(14) * DataCenter.d().r);
                  Pixmap var15;
                  (var15 = this.d.b).setColor(new Color(0.0F, 0.0F, 0.0F, 0.0F));
                  var15.fill();
                  VDTT_v var7 = VDTT_dc.b(7);
                  VDTT_aa.a(var15, var7, 0, 0, var7.c, var7.d, 0, 0, 36 * DataCenter.d().r, 14 * DataCenter.d().r, Blending.None);
                  VDTT_aa.a(var15, var7, 0, 0, var7.c, var7.d, 38 * DataCenter.d().r, 0, 36 * DataCenter.d().r, 14 * DataCenter.d().r, Blending.None);
                  VDTT_da.a(this.d);
               }

               var1.a(this.d, 16, 0);
               if (VDTT_cw.v().dC.d()) {
                  VDTT_dg.e(VDTT_dg.b, var1, VDTT_cw.v().dC.l, 34, 8, 2, VDTT_cw.v().cH < 2 ? -2560 : -1, -10275328);
               } else {
                  VDTT_dg.e(VDTT_dg.b, var1, VDTT_cw.v().dC.l, 34, 7, 2, VDTT_cw.v().cH < 2 ? -2560 : -1, -10275328);
               }

               if (VDTT_cw.v().dx.d()) {
                  VDTT_dg.e(VDTT_dg.b, var1, VDTT_cw.v().dx.l, 72, 8, 2, VDTT_cw.v().cH == 2 ? -2560 : -1, -10275328);
               } else {
                  VDTT_dg.e(VDTT_dg.b, var1, VDTT_cw.v().dx.l, 72, 7, 2, VDTT_cw.v().cH == 2 ? -2560 : -1, -10275328);
               }
            }
            break;
         case 2:
            this.b(var1);
         }

         for(var5 = 0; var5 < this.a.size() - 1; ++var5) {
            var2 = (VDTT_m)this.a.elementAt(var5);
            this.a(var1, var2.a(), var2.b());
            var2.b(var1);
         }

         this.a(var1, this.objX + DataCenter.d().ai.objX, this.objY + DataCenter.d().ai.objY);
         switch(this.p) {
         case 1:
            if (!this.h.b() && !this.i.b()) {
               if (this.Q) {
                  this.Q = false;
                  DataCenter.d().c();
               }
            } else {
               this.Q = true;
            }
         case 2:
         case 3:
         case 4:
         default:
            break;
         case 5:
            this.d(var1);
            break;
         case 6:
            e(var1);
         }
      }

      switch(this.p) {
      case 4:
         if (this.o == 0) {
            this.a(var1, 0, 0);
            c(var1);
            Graphics var14 = var1;
            VDTT_bm var11 = this;

            int var12;
            try {
               label327: {
                  DataCenter.o();
                  if (VDTT_cw.v().bg == null) {
                     var11.R = 5;
                  } else if (var11.R > 0) {
                     --var11.R;
                     break label327;
                  }

                  VDTT_eq.a();
                  if (VDTT_cw.v().bg != null) {
                     var12 = VDTT_jb.n(21);
                     var6 = DataCenter.d().n - VDTT_jb.n(186) - var12;
                     if (DataCenter.l()) {
                        var6 = DataCenter.d().n - VDTT_jb.n(99) - var12;
                     }

                     if (VDTT_cw.v().bg instanceof VDTT_ek) {
                        VDTT_ek var18 = (VDTT_ek)VDTT_cw.v().bg;
                        VDTT_aa.a(var14, 28, 0, var6 + var12, 0, VDTT_jb.n(100));
                        VDTT_aa.a(var14, 30, 0, var6 + VDTT_jb.n(45), 0 + VDTT_jb.n(4), VDTT_jb.n(var18.a(47)), (int)VDTT_jb.n(8));
                        VDTT_aa.a(var14, 31, 0, var6 + VDTT_jb.n(45), 0 + VDTT_jb.n(16), VDTT_jb.n(var18.c(47)), (int)VDTT_jb.n(8));
                        VDTT_aa.a(var14, 32, 0, var6 + VDTT_jb.n(34), 0 + VDTT_jb.n(4), VDTT_jb.n(3) + 0, (int)VDTT_jb.n(18));
                        VDTT_dg.b(VDTT_dg.b, var14, VDTT_cw.v().bg.f(), var6 + VDTT_jb.n(69), 0 + VDTT_jb.n(8), 2, -6488, -10275328);
                        VDTT_dg.b(VDTT_dg.b, var14, VDTT_cw.v().bg.g(), var6 + VDTT_jb.n(69), 0 + VDTT_jb.n(20), 2, -6488, -10275328);
                        VDTT_aa.a(var14, var18.ag(), 0, var6 + VDTT_jb.n(96), 0 + VDTT_jb.n(4), VDTT_jb.n(100));
                     } else {
                        VDTT_ed var8;
                        int var9;
                        VDTT_fi var13;
                        if (VDTT_cw.v().bg instanceof VDTT_gx) {
                           VDTT_gx var17;
                           if (!(var17 = (VDTT_gx)VDTT_cw.v().bg).v()) {
                              VDTT_aa.a(var14, 28, 0, var6 + var12, 0, VDTT_jb.n(100));
                              VDTT_aa.a(var14, 30, 0, var6 + VDTT_jb.n(45), 0 + VDTT_jb.n(4), VDTT_jb.n(47), (int)VDTT_jb.n(8));
                              VDTT_aa.a(var14, 31, 0, var6 + VDTT_jb.n(45), 0 + VDTT_jb.n(16), VDTT_jb.n(47), (int)VDTT_jb.n(8));
                              VDTT_aa.a(var14, 32, 0, var6 + VDTT_jb.n(34), 0 + VDTT_jb.n(4), VDTT_jb.n(3) + 0, (int)VDTT_jb.n(18));
                              VDTT_dg.b(VDTT_dg.b, var14, VDTT_cw.v().bg.f(), var6 + VDTT_jb.n(69), 0 + VDTT_jb.n(8), 2, -6488, -10275328);
                              VDTT_dg.a((BitmapFont) Graphics.b(80), var14, VDTT_cw.v().bg.g(), var6 + VDTT_jb.n(69), 0 + VDTT_jb.n(20), 2, -6488, -10275328);
                              if (!DataCenter.l() && (var13 = var17.q()) != null) {
                                 var8 = (VDTT_ed)DataCenter.d().ae.get(var13.a);
                                 var9 = DataCenter.d().r;
                                 VDTT_eq.a();
                                 VDTT_dc.b(var14, var13.a, 0, var6 + VDTT_jb.n(96), 0 + VDTT_jb.n(4), 20 * var9, 20 * var9, var8.d / 2 - 10 - var13.c, var8.e - var13.d - 20, 20, 20, 0);
                              }
                           }
                        } else {
                           VDTT_gk var16;
                           if (VDTT_cw.v().bg instanceof VDTT_gk && !(var16 = (VDTT_gk)VDTT_cw.v().bg).w()) {
                              VDTT_aa.a(var14, 28, 0, var6 + var12, 0, VDTT_jb.n(100));
                              VDTT_aa.a(var14, 30, 0, var6 + VDTT_jb.n(45), 0 + VDTT_jb.n(4), VDTT_jb.n(var16.a(47)), (int)VDTT_jb.n(8));
                              VDTT_aa.a(var14, 31, 0, var6 + VDTT_jb.n(45), 0 + VDTT_jb.n(16), VDTT_jb.n(47), (int)VDTT_jb.n(8));
                              VDTT_aa.a(var14, 32, 0, var6 + VDTT_jb.n(34), 0 + VDTT_jb.n(4), VDTT_jb.n(3) + 0, (int)VDTT_jb.n(18));
                              if (DataCenter.d().h / 12 % 2 == 0 && var16.n > 0) {
                                 VDTT_aa.a(var14, 45, 0, var6 + VDTT_jb.n(21), 0 + VDTT_jb.n(12), VDTT_jb.n(100));
                              }

                              VDTT_dg.b(VDTT_dg.b, var14, VDTT_cw.v().bg.f(), var6 + VDTT_jb.n(69), 0 + VDTT_jb.n(8), 2, -6488, -10275328);
                              VDTT_dg.a((BitmapFont) Graphics.b(80), var14, VDTT_cw.v().bg.g(), var6 + VDTT_jb.n(69), 0 + VDTT_jb.n(20), 2, -6488, -10275328);
                              if (!DataCenter.l() && (var13 = var16.s()) != null) {
                                 var8 = (VDTT_ed)DataCenter.d().ae.get(var13.a);
                                 var9 = DataCenter.d().r;
                                 VDTT_eq.a();
                                 if (var16.n == 11) {
                                    var14.c(180.0F);
                                 } else if (var16.n == 2) {
                                    var14.c(150.0F);
                                 } else if (var16.n == 1) {
                                    var14.c(120.0F);
                                 } else if (var16.n == 10) {
                                    var14.c(90.0F);
                                 } else if (var16.n == 9) {
                                    var14.c(60.0F);
                                 }

                                 VDTT_dc.b(var14, var13.a, 0, var6 + VDTT_jb.n(96), 0 + VDTT_jb.n(4), 20 * var9, 20 * var9, var8.d / 2 - 10 - var13.c, var8.e - var13.d - 20, 20, 20, 0);
                                 if (var16.n == 11 || var16.n == 2 || var16.n == 1 || var16.n == 10 || var16.n == 9) {
                                    var14.r();
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            } catch (Exception var10) {
            }

            var5 = 5 + VDTT_d.g().l();
            var12 = 48;
            if (DataCenter.d().o <= 270) {
               var12 -= 15;
            }

            if (VDTT_cw.v().V() && VDTT_cw.v().bR != 0) {
               if (VDTT_cw.v().bY) {
                  VDTT_dg.b(VDTT_dg.c, var1, Caption.gh + VDTT_jb.h((int)((VDTT_jb.a() - VDTT_cw.v().bQ) / 1000L)), var5, var12 + 15, 0, -1, -16777216);
               } else {
                  var6 = (int)(((long)VDTT_cw.v().bR - (VDTT_jb.a() - VDTT_cw.v().bQ)) / 1000L);
                  if (VDTT_cw.v().C().d != 19 && VDTT_cw.v().C().d != 20) {
                     if (VDTT_cw.v().C().d == 8) {
                        if (VDTT_cw.v().cr <= 0 && VDTT_cw.v().ai == 9) {
                           VDTT_dg.b(VDTT_dg.c, var1, Caption.gk + VDTT_jb.i(var6), var5, var12 + 15, 0, -1, -16777216);
                        } else {
                           VDTT_dg.b(VDTT_dg.c, var1, Caption.gl + VDTT_jb.i(var6), var5, var12 + 15, 0, -1, -16777216);
                        }
                     } else if (VDTT_cw.v().C().d != 6 && VDTT_cw.v().C().d != 10) {
                        if (var6 > 0) {
                           VDTT_dg.b(VDTT_dg.c, var1, Caption.gl + VDTT_jb.i(var6), var5, var12 + 15, 0, -1, -16777216);
                        }
                     } else {
                        VDTT_dg.b(VDTT_dg.c, var1, Caption.gk + VDTT_jb.i(var6), var5, var12 + 15, 0, -1, -16777216);
                     }
                  } else if (VDTT_cw.v().cr >= 2 && VDTT_cw.v().cr <= 6) {
                     if (VDTT_cw.v().cr == 2) {
                        VDTT_dg.b(VDTT_dg.c, var1, VDTT_jb.b(Caption.uf, VDTT_jb.i(var6)), var5, var12 + 15, 0, -1, -16777216);
                     } else if (VDTT_cw.v().cr == 3) {
                        VDTT_dg.b(VDTT_dg.c, var1, VDTT_jb.b(Caption.ug, VDTT_jb.i(var6)), var5, var12 + 15, 0, -1, -16777216);
                     } else if (VDTT_cw.v().cr == 4) {
                        VDTT_dg.b(VDTT_dg.c, var1, VDTT_jb.b(Caption.uh, VDTT_jb.i(var6)), var5, var12 + 15, 0, -1, -16777216);
                     } else if (VDTT_cw.v().cr == 5) {
                        VDTT_dg.b(VDTT_dg.c, var1, VDTT_jb.b(Caption.ui, VDTT_jb.i(var6)), var5, var12 + 15, 0, -1, -16777216);
                     } else if (VDTT_cw.v().cr == 6) {
                        VDTT_dg.b(VDTT_dg.c, var1, VDTT_jb.b(Caption.uj, VDTT_jb.i(var6)), var5, var12 + 15, 0, -1, -16777216);
                     }
                  } else {
                     VDTT_dg.b(VDTT_dg.c, var1, Caption.gk + VDTT_jb.i(var6), var5, var12 + 15, 0, -1, -16777216);
                  }

                  if (VDTT_cw.v().C().d == 21 && VDTT_cw.v().dG != null) {
                     VDTT_dg.d(VDTT_dg.c, var1, "c#item" + VDTT_cw.v().dG, VDTT_jb.n(101 + VDTT_d.g().m / 2) + 3, 21, 0, -2560, -16777216);
                  }
               }

               if (VDTT_cw.v().C().d == 10 || VDTT_cw.v().C().d == 16) {
                  VDTT_dg.b(VDTT_dg.c, var1, Caption.gj + VDTT_jb.c(VDTT_cw.v().ck), var5, var12 + 25, 0, -1, -16777216);
               }

               if (VDTT_cw.v().C().d != 17 && VDTT_cw.v().C().d != 4 && VDTT_cw.v().C().d != 8) {
                  if (VDTT_cw.v().C().d == 6) {
                     VDTT_dg.b(VDTT_dg.c, var1, Caption.gi + VDTT_jb.c(VDTT_cw.v().ci), var5, var12 + 25, 0, -1, -16777216);
                  }
               } else {
                  VDTT_dg.b(VDTT_dg.c, var1, Caption.gi + VDTT_jb.c(VDTT_cw.v().ck), var5, var12 + 25, 0, -1, -16777216);
               }
            }

            var6 = var12 - 15;
            if (VDTT_cw.v().C().d != 21) {
               VDTT_dv var19 = VDTT_ji.z();
               if (VDTT_ek.m().av > 0 && var19 != null) {
                  String var20 = var19.d + Caption.ls + VDTT_jb.h(VDTT_jb.m(var19.c));
                  if (DataCenter.d().h % 16 >= 10) {
                     VDTT_dg.b(VDTT_dg.c, var1, var20, var5, var6 + 20, 0, -2560, -16777216);
                  } else {
                     VDTT_dg.b(VDTT_dg.c, var1, var20, var5, var6 + 20, 0, -1, -16777216);
                  }
               }
            }

            if (this.e) {
               if (VDTT_cw.v().aE[3].d) {
                  VDTT_cw.v().a(var1, VDTT_cw.v().aE[0].objX - VDTT_jb.n(5), VDTT_cw.v().aE[0].objY - VDTT_jb.n(5), VDTT_jb.n(67), VDTT_jb.n(57), -11, 22, 23, 1, 1);
               } else {
                  VDTT_cw.v().a(var1, VDTT_cw.v().aE[0].objX - VDTT_jb.n(5), VDTT_cw.v().aE[0].objY - VDTT_jb.n(5), VDTT_jb.n(67), VDTT_jb.n(73), -11, 22, 23, 1, 1);
               }

               this.a(var1, VDTT_cw.v().aE[0].a(), VDTT_cw.v().aE[0].b());
               VDTT_cw.v().aE[0].b(var1);
               this.a(var1, VDTT_cw.v().aE[1].a(), VDTT_cw.v().aE[1].b());
               VDTT_cw.v().aE[1].b(var1);
               this.a(var1, VDTT_cw.v().aE[2].a(), VDTT_cw.v().aE[2].b());
               VDTT_cw.v().aE[2].b(var1);
               this.a(var1, VDTT_cw.v().aE[2].a(), VDTT_cw.v().aE[3].b());
               VDTT_cw.v().aE[3].b(var1);
            }
         }
      default:
         if (this.h.b() || this.i.b()) {
            this.a(var1, this.J, this.K);
            var1.d(this.L, this.M, this.N, this.O);
         }

         if ((var2 = this.a()) != null) {
            this.a(var1, var2.a(), var2.b());
            var2.b(var1);
         }

         this.a(var1, var3, var4);
      }
   }

   private void b(Graphics var1) {
      if (this.d == null) {
         int var2 = VDTT_jb.n(175);
         this.d = VDTT_v.a(var2 * DataCenter.d().r, VDTT_jb.n(75) * DataCenter.d().r);

         for(int var4 = 0; var4 < this.a.size(); ++var4) {
            VDTT_ba var3;
            if (this.a.get(var4) instanceof VDTT_ba && !(var3 = (VDTT_ba)this.a.get(var4)).equals(VDTT_cw.v().cP)) {
               if (var3.equals(VDTT_cw.v().dz)) {
                  if (VDTT_cw.v().ag >= 200) {
                     continue;
                  }

                  DataCenter.p();
               }

               VDTT_v var5 = VDTT_dc.b(var3.I);
               VDTT_aa.a(this.d, var5, (var3.objX - this.objX + var3.q / 2) * DataCenter.d().r, (var3.objY - this.objY + var3.r / 2) * DataCenter.d().r, VDTT_jb.n(100), 3);
            }
         }

         VDTT_da.a(this.d);
      }

      var1.a(this.d, 0, 0);
   }

   public final boolean c() {
      if (this.I > 0) {
         return this.I == 1;
      } else {
         return this.e;
      }
   }

   public final boolean d() {
      return this.h.b() || this.i.b() || this.I > 0 || this.g;
   }

   public final void e() {
      this.f = true;
      if (!this.h.b() && !this.i.b()) {
         this.l = this.q;
         this.m = this.r;
         this.I = 2;
         this.h.a(0);
         this.i.a(0);
      } else {
         this.a(false);
         this.q = this.r = 0;
         this.h.a(this.q);
         this.i.a(this.r);
      }
   }

   public final void f() {
      this.f = true;
      if (!this.h.b() && !this.i.b()) {
         this.I = 1;
         this.h.a(this.l);
         this.i.a(this.m);
      } else {
         this.a(true);
         this.q = this.l;
         this.r = this.m;
         this.h.a(this.l);
         this.i.a(this.m);
      }
   }

   public final void a(boolean var1) {
      this.e = var1;
      this.b(!var1);
      this.I = 0;
      this.f = false;
      if (var1) {
         this.q = this.l;
         this.r = this.m;
         this.h.a(this.q);
         this.i.a(this.r);
      } else {
         this.q = this.r = 0;
         this.h.a(this.q);
         this.i.a(this.r);
      }
   }

   private void a(Graphics var1, int var2, int var3, int var4, int var5) {
      this.J = var1.e;
      this.K = var1.f;
      this.L = var1.k();
      this.M = var1.l();
      this.N = var1.h;
      this.O = var1.i;
      if (var4 > this.N) {
         var4 = this.N;
      }

      if (var5 > this.O) {
         var5 = this.O;
      }

      this.a(var1, var2, var3);
      var1.d(0, 0, var4, var5);
   }

   private static void c(Graphics var0) {
      try {
         if (!DataCenter.l()) {
            if (VDTT_d.g().m > 0) {
               VDTT_eq.a();
               VDTT_dg var10000 = VDTT_dg.b;
               String var10002 = VDTT_cw.v().C().b;
               int var10003 = VDTT_cw.v().cP.objX + 17;
               VDTT_eq.a();
               VDTT_dg.a((VDTT_dg)var10000, var0, var10002, var10003, 7, 0, -6488, -10275328);
            } else {
               VDTT_eq.a();
               VDTT_dg.a((VDTT_dg)VDTT_dg.b, var0, VDTT_cw.v().C().b, DataCenter.d().n - 50, 7, 2, -6488, -10275328);
            }
         }

         long var1 = VDTT_ek.m().aC;

         int var3;
         for(var3 = 0; var3 < DataCenter.d().ax.length && var1 >= DataCenter.d().ax[var3]; ++var3) {
            var1 -= DataCenter.d().ax[var3];
         }

         DataCenter.d();
         int var7 = VDTT_jb.n(24 + VDTT_d.g().m / 2);
         int var2 = VDTT_jb.n(4);
         var3 = VDTT_jb.n(47);
         int var4 = VDTT_jb.n(8);
         int var5;
         if ((var5 = VDTT_ek.m().a(var3)) > 0) {
            VDTT_aa.a(var0, 30, 0, var7, var2, var5, (int)var4);
         }

         if ((var5 = VDTT_ek.m().c(var3)) > 0) {
            VDTT_aa.a(var0, 31, 0, var7, var2 + VDTT_jb.n(12), var5, (int)var4);
         }

         VDTT_eq.a();
         VDTT_ek.m();
         if ((var5 = VDTT_ek.b(VDTT_jb.n(18))) > 0) {
            DataCenter.o();
            VDTT_aa.a(var0, -12, 0, VDTT_jb.n(13 + VDTT_d.g().m / 2) + 0, var2 + (VDTT_jb.n(18) - var5), VDTT_jb.n(3) + 0, (int)var5);
         }

         VDTT_dg.b(VDTT_dg.b, var0, VDTT_jb.c(VDTT_ek.m().ag), var7 + var3 / 2, var2 + VDTT_jb.n(4), 2, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.b, var0, VDTT_jb.c(VDTT_ek.m().ah), var7 + var3 / 2, var2 + VDTT_jb.n(16), 2, -6488, -10275328);
         VDTT_cw.v();
         if (VDTT_cw.af() && DataCenter.d().h / 12 % 2 == 0 && !DataCenter.l()) {
            VDTT_aa.a(var0, 45, 0, VDTT_jb.n(VDTT_d.g().m / 2), VDTT_jb.n(12), VDTT_jb.n(100));
         }

         if (VDTT_dn.a > 0) {
            VDTT_dg.a((VDTT_dg)VDTT_dg.e, var0, Caption.uN, DataCenter.d().n / 2, DataCenter.d().o / 2, 2, -16711681, -10275328);
         }

      } catch (Exception var6) {
         VDTT_jb.a(var6);
      }
   }

   private void d(Graphics var1) {
      var1.o();
      Vector var2;
      if ((var2 = this.b) != null) {
         VDTT_ic var3 = null;

         for(int var4 = 0; var4 < var2.size(); ++var4) {
            VDTT_m var5;
            short var6 = (var5 = (VDTT_m)var2.elementAt(var4)).q;
            this.a(var1, var5.a(), var5.b());
            if (var4 < VDTT_cw.v().bl.size() && !var5.d) {
               Iterator var7 = VDTT_cw.v().bl.iterator();

               while(var7.hasNext()) {
                  VDTT_ic var8;
                  if ((var8 = (VDTT_ic)var7.next()).d == VDTT_cw.v().db[var4]) {
                     var3 = var8;
                     break;
                  }
               }

               this.a(var1, var3, var5, var6);
            }
         }
      }

      this.a(var1, this.objX + DataCenter.d().ai.objX, this.objY + DataCenter.d().ai.objY);
      if (VDTT_cw.v().aO != null) {
         VDTT_ba var9;
         short var10 = (var9 = VDTT_cw.v().aO).q;
         this.a(var1, var9.a(), var9.b());

         for(int var11 = 0; var11 < VDTT_cw.v().ae.length; ++var11) {
            if (VDTT_cw.v().ae[var11].e > 0 && VDTT_cw.v().ae[var11].l()) {
               this.a(var1, VDTT_cw.v().ae[var11], var9, var10);
               break;
            }
         }

         this.a(var1, this.objX + DataCenter.d().ai.objX, this.objY + DataCenter.d().ai.objY);
      }

   }

   private void a(Graphics var1, VDTT_ic var2, VDTT_m var3, int var4) {
      float var5 = var2.a(var4);
      if (var2.d != 30) {
         if (var5 <= (float)var4 && var5 > 0.0F) {
            if (!VDTT_eq.a().d() && !var2.l()) {
               VDTT_dc.a(var1, 101, 0, 0, VDTT_jb.n(var4), VDTT_jb.n(var4) * DataCenter.d().r, VDTT_jb.n((int)var5) * DataCenter.d().r, 0, var4 - (int)var5, var4, (int)var5, 36);
            } else {
               var1.c(-2560);
               VDTT_dc.a(var1, 64, 0, 0, VDTT_jb.n(var4), VDTT_jb.n(var4) * DataCenter.d().r, VDTT_jb.n((int)var5) * DataCenter.d().r, 0, var4 - (int)var5, var4, (int)var5, 36);
               var1.f();
            }
         }

         if (var2.g() > 0.0F) {
            if (var2.g() / 1000.0F > 10.0F) {
               VDTT_dg.b(VDTT_dg.b, var1, VDTT_jb.c((long)var2.g() / 1000L), var3.q / 2, var3.r / 2, 2, -1, -16777216);
               return;
            }

            VDTT_dg.b(VDTT_dg.b, var1, String.valueOf(a(var2.g() / 1000.0F, 2)), var3.q / 2, var3.r / 2, 2, -1, -16777216);
         }
      }

   }

   private static BigDecimal a(float var0, int var1) {
      return (new BigDecimal(Float.toString(var0))).setScale(2, 4);
   }

   private static void e(Graphics var0) {
      int var1 = 122;

      for(int var3 = 0; var3 < VDTT_ek.m().bb.size(); ++var3) {
         VDTT_ez var2;
         if ((var2 = (VDTT_ez)VDTT_ek.m().bb.elementAt(var3)).a != 131) {
            VDTT_ey var10004 = var2.c();
            VDTT_ek var5 = VDTT_ek.m();
            VDTT_ey var4 = var10004;
            var2.a(var0, var1, 1, var10004.a >= 87 && var4.a <= 92 ? (DataCenter.l() ? (short)(725 + var5.av - 1) : (var5.m == 4 ? (short)(var4.a - 87 + 897) : (var5.m == 5 ? (short)(var4.a - 87 + 1048) : (short)(var4.e + var4.a - 87 + var5.m * 6)))) : var4.e, false);
            var2.f(var1, 1);
            var1 += 18;
         }
      }

      VDTT_cw.v();
      VDTT_cw.v();
   }

   public final void g() {
      this.d = null;
   }
}
