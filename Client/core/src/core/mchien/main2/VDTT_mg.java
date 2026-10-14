package core.mchien.main2;

import java.util.Iterator;
import java.util.Vector;

public final class VDTT_mg extends VDTT_am {
   private Vector S;
   private VDTT_ik[] T = new VDTT_ik[2];
   private VDTT_mf[] U = new VDTT_mf[2];
   private int V = -1;
   private int W;
   private int X;
   private int Y;
   private VDTT_ba Z;
   private VDTT_ba aa;
   private VDTT_ba ab;
   private boolean ac;
   int a;
   int b;
   int c;
   int d;
   private boolean ad;
   public boolean N;
   public int O;
   public int P;
   public int Q;
   public boolean R;

   public VDTT_mg(VDTT_p var1, Vector var2, int var3) {
      this.I = var1;
      this.S = var2;
      this.K = false;
      this.Y = var3;
      this.d(DataCenter.d().n, DataCenter.d().o);
      int var4 = 0;
      Iterator var5 = var2.iterator();

      while(var5.hasNext()) {
         VDTT_hq var6;
         if ((var6 = (VDTT_hq)var5.next()).c.size() > var4) {
            var4 = var6.c.size();
         }
      }

      this.d = (var4 + 1) * 12 + 6;
      this.a = 10;
      this.b = DataCenter.d().o - this.d - 20;
      this.c = this.q - 2 * this.a;
      if (this.c > 400) {
         this.c = 400;
         this.a = DataCenter.d().n / 2 - this.c / 2;
      }

      if (this.d < 50) {
         this.d = 50;
      }

      this.U[0] = new VDTT_mf();
      this.U[0].d(this.c, this.d);
      this.U[0].f(this.a, this.r);
      this.T[0] = new VDTT_ik(this.U[0], (byte)1, this.r - this.d - 20);
      this.T[0].b = 100;
      this.U[1] = new VDTT_mf();
      this.U[1].d(80, 16);
      this.U[1].f(this.a + 40, this.r - 20);
      this.T[1] = new VDTT_ik(this.U[1], (byte)1, this.r - this.d - 40);
      this.T[1].b = 100;
      this.Z = this.a(this.q / 2 - 33, this.r - 28 - VDTT_d.g().l() / 2, Caption.jF, this, 202, 15);
      this.aa = this.a(this.q / 2 - 30 - 25, this.r - 28 - VDTT_d.g().l() / 2, Caption.jG, this, 201, 15);
      this.ab = this.a(this.q / 2 + 30 - 25, this.r - 28 - VDTT_d.g().l() / 2, Caption.jH, this, 200, 15);
      this.Z.d(66, this.Z.r);
      this.aa.d(50, this.aa.r);
      this.ab.d(50, this.aa.r);
   }

   public final void b(Graphics var1) {
      if (!(this.I instanceof VDTT_cg)) {
         this.U[0].a(var1);
         int var2 = this.U[0].objX - 10;
         short var3 = this.U[0].q;
         if (this.V >= 0 && this.S != null && this.S.size() > 0 && this.V < this.S.size()) {
            VDTT_hq var4;
            if ((var4 = (VDTT_hq)this.S.elementAt(this.V)).d == 0) {
               this.U[1].objX = (short)(this.U[0].objX + 40);
            } else {
               this.U[1].objX = (short)(this.U[0].objX + this.U[0].q - 40 - this.U[1].q);
            }

            VDTT_mf var5 = this.U[1];
            int var7 = var1.e;
            int var8 = var1.f;
            var1.a(var5.objX, var5.objY);
            VDTT_dc.a(var1, 104, 0, 16, 0, (var5.q - 32) * DataCenter.d().r, var5.r * DataCenter.d().r, 8, 0, 8, 16, 20);
            VDTT_dc.a(var1, 104, 0, 0, 0, 20);
            VDTT_dc.a(var1, 105, 0, var5.q, var5.r, 40);
            var5.a(var1, var7, var8);
            VDTT_dg.b(VDTT_dg.d, var1, var4.e, this.U[1].objX + this.U[1].q / 2, this.U[1].objY + 7, 2, -2560, -10275328);
            int var12 = this.U[0].objY + 12;
            int var6 = this.r - 20 - VDTT_d.g().m / 2;
            String var11;
            if (var4.d == 2) {
               var2 = var3 / 2;

               for(var7 = 0; var7 < var4.c.size(); ++var7) {
                  var11 = var4.c.elementAt(var7).toString();
                  if (var7 == this.X) {
                     VDTT_dg.d(VDTT_dg.d, var1, var11.substring(0, this.W), var2, var12 + var7 * 12, 2, -1, -10275328);
                  } else if (var7 < this.X) {
                     VDTT_dg.d(VDTT_dg.d, var1, var11, var2, var12 + var7 * 12, 2, -1, -10275328);
                  }
               }

               return;
            }

            boolean var9;
            int var10;
            VDTT_fh var13;
            if (var4.d == 0) {
               if (var4.a != null) {
                  VDTT_ek.m().a(var1, var2 + 30, var6, var4.a, 0, 0, false);
               } else if (var4.b != null) {
                  var9 = true;
                  var1.j = var9;
                  var13 = var4.b;

                  for(var10 = 0; var10 < var13.a.length; ++var10) {
                     VDTT_dc.b(var1, var13.a[var10].a, var13.a[var10].a(true), var2 + 30 - var13.a[var10].c, var6 + var13.a[var10].d, 33);
                  }

                  var9 = false;
                  var1.j = var9;
               }

               var2 += 60;

               for(var7 = 0; var7 < var4.c.size(); ++var7) {
                  var11 = var4.c.elementAt(var7).toString();
                  if (var7 == this.X) {
                     VDTT_dg.d(VDTT_dg.d, var1, var11.substring(0, this.W), var2, var12 + var7 * 12, 0, -1, -10275328);
                  } else if (var7 < this.X) {
                     VDTT_dg.d(VDTT_dg.d, var1, var11, var2, var12 + var7 * 12, 0, -1, -10275328);
                  }
               }

               return;
            }

            if (var4.d == 1) {
               var2 += var3;
               if (var4.a != null) {
                  VDTT_ek.m().a(var1, var2 - 10, var6, var4.a, 6, 0, true);
               } else if (var4.b != null) {
                  var9 = true;
                  var1.j = var9;
                  var13 = var4.b;

                  for(var10 = 0; var10 < var13.a.length; ++var10) {
                     if (var13.a[var10].e) {
                        VDTT_dc.b(var1, var13.a[var10].a, var13.a[var10].a(false), var2 - 10 + var13.a[var10].c, var6 + var13.a[var10].d, 33);
                     } else {
                        VDTT_dc.b(var1, var13.a[var10].a, var13.a[var10].a(false), var2 - 10 + var13.a[var10].c, var6 + var13.a[var10].d, 33);
                     }
                  }

                  var9 = false;
                  var1.j = var9;
               }

               for(var7 = 0; var7 < var4.c.size(); ++var7) {
                  var11 = var4.c.elementAt(var7).toString();
                  if (var7 == this.X) {
                     VDTT_dg.d(VDTT_dg.d, var1, var11.substring(0, this.W), var2 - 40, var12 + var7 * 12, 1, -1, -10275328);
                  } else if (var7 < this.X) {
                     VDTT_dg.d(VDTT_dg.d, var1, var11, var2 - 40, var12 + var7 * 12, 1, -1, -10275328);
                  }
               }
            }
         }

      }
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(new VDTT_hl(1000, 0, 0, this.q, this.r, (VDTT_hs)null, this));
      return var1;
   }

   public final void a_() {
      int var1 = 0;
      this.ad = false;

      for(int var2 = 0; var2 < this.U.length; ++var2) {
         this.T[var2].a();
         if (this.T[var2].b()) {
            ++var1;
            this.ad = true;
         }
      }

      if (this.V >= this.S.size() && var1 == 0) {
         this.k();
      } else if (var1 <= 1 && this.V < 0) {
         this.V = 0;
      }

      String var9;
      if (this.V >= 0 && this.V < this.S.size() && !this.ad) {
         VDTT_hq var8 = (VDTT_hq)this.S.elementAt(this.V);
         if (this.X < var8.c.size()) {
            this.W += 3;
            String var3 = var8.c.elementAt(this.X).toString();
            if (this.W >= var3.length()) {
               this.W = 0;
               ++this.X;
               this.ac = this.X == var8.c.size();
            } else {
               this.ac = false;
               var9 = var3.substring(0, this.W + 10 > var3.length() ? var3.length() : this.W + 10);
               int[] var10 = null;

               while(true) {
                  int var5 = var10 == null ? 0 : var10[0] + var10[1];
                  String var4 = var9.toLowerCase();
                  String var6 = "";

                  int var7;
                  for(var7 = 0; var7 < var5; ++var7) {
                     var6 = var6 + " ";
                  }

                  var6 = var6 + var4.substring(var5, var4.length());
                  var7 = 0;

                  int[] var10000;
                  while(true) {
                     if (var7 >= VDTT_in.g.length) {
                        var10000 = null;
                        break;
                     }

                     if (var6.indexOf(VDTT_in.g[var7].d) != -1) {
                        var10000 = new int[]{var6.indexOf(VDTT_in.g[var7].d), VDTT_in.g[var7].d.length()};
                        break;
                     }

                     ++var7;
                  }

                  int[] var11 = var10000;
                  if (var10000 == null) {
                     if (var10 != null && var10[0] + var10[1] > this.W) {
                        this.W = var10[0] + var10[1];
                     }
                     break;
                  }

                  var10 = var11;
               }
            }
         }
      }

      boolean var12 = var1 > 0;
      this.Z.d = this.aa.d = this.ab.d = true;
      if (!var12 && this.V == this.S.size() - 1) {
         VDTT_hq var13 = (VDTT_hq)this.S.elementAt(this.V);
         if (this.X == var13.c.size()) {
            if (this.Y == -1) {
               this.aa.d = this.ab.d = false;
            } else if (this.Y == -2) {
               this.Z.d = false;
            }
         }
      }

      DataCenter.d().aA.b = false;
      if (this.N) {
         if (!this.aa.d || !this.ab.d || !this.Z.d) {
            if (this.O == -1) {
               this.aa.b(true);
               this.ab.b(true);
               this.Z.b(false);
               var9 = Caption.O;
               this.Z.l = var9;
               return;
            }

            this.aa.b(false);
            this.ab.b(false);
            this.Z.b(true);
            return;
         }
      } else {
         int var10001;
         if (this.I instanceof VDTT_cg) {
            if (((VDTT_cg)this.I).d == 0 && this.V < 5 && this.ac) {
               var10001 = this.q - 100;
               DataCenter.d().aA.a(var10001, this.r - 30 - VDTT_d.g().m / 2);
               DataCenter.d().aA.b = true;
            }

            return;
         }

         if (this.I instanceof VDTT_cw && this.I.b.lastElement().equals(this)) {
            DataCenter.d();
            if (!DataCenter.b()) {
               if (!this.Z.d) {
                  var10001 = this.q / 2;
                  DataCenter.d().aA.a(var10001, this.r - 15 - VDTT_d.g().m / 2);
                  DataCenter.d().aA.b = true;
               }

               if (!this.aa.d) {
                  var10001 = this.q / 2 - 30;
                  DataCenter.d().aA.a(var10001, this.r - 15 - VDTT_d.g().m / 2);
                  DataCenter.d().aA.b = true;
               }
            }
         }
      }

   }

   public final void k() {
      super.k();
      if (this.R) {
         VDTT_ek.m().bf.addElement(new VDTT_hi(105, 0, 0, 2));
      }

   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (VDTT_cw.v().br == 0) {
         this.k();
      } else {
         switch(var1.b) {
         case 200:
            this.V = this.S.size();
            this.W = this.X = 0;
            if (this.V >= this.S.size()) {
               this.T[0] = new VDTT_ik(this.U[0], (byte)1, this.r + 20);
               this.T[0].b = 100;
               this.T[1] = new VDTT_ik(this.U[1], (byte)1, this.r);
               this.T[1].b = 100;
               return;
            }
            break;
         case 201:
            this.k();
            VDTT_mg var8 = this;

            try {
               if (var8.N) {
                  Message var9;
                  (var9 = new Message((byte)53)).b(var8.O);
                  var9.a(var8.P);
                  var9.a(var8.Q);
                  var9.l();
                  return;
               }

               (new Message((byte)11)).l();
               break;
            } catch (Exception var4) {
               return;
            }
         case 202:
            this.k();
            if (!this.N) {
               (new Message((byte)10)).l();
            }

            return;
         case 1000:
            try {
               boolean var6 = true;
               VDTT_hq var7 = (VDTT_hq)this.S.elementAt(this.V);
               if (this.X < var7.c.size() - 1) {
                  var6 = false;
                  this.ac = true;
               } else if (this.X == var7.c.size() - 1) {
                  String var10 = var7.c.elementAt(this.X).toString();
                  if (this.W < var10.length() - 1) {
                     var6 = false;
                     this.ac = true;
                  }
               }

               if (var6) {
                  if (this.V >= this.S.size() - 1 && (this.Y == -1 || this.Y == -2)) {
                     return;
                  }

                  ++this.V;
                  this.W = this.X = 0;
                  if (this.V >= this.S.size()) {
                     this.T[0] = new VDTT_ik(this.U[0], (byte)1, this.r + 20);
                     this.T[1] = new VDTT_ik(this.U[1], (byte)1, this.r);
                     return;
                  }
               } else {
                  this.W = 0;
                  this.X = var7.c.size();
               }

               return;
            } catch (Exception var5) {
            }
         }

      }
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void d() {
      super.d();
      VDTT_ir var1;
      if ((var1 = VDTT_cw.v().S()) != null && this.Y >= 0 && this.Y < var1.p.size() && ((VDTT_il)var1.p.elementAt(this.Y)).a == 5) {
         (new Message((byte)12)).l();
      }

   }
}
