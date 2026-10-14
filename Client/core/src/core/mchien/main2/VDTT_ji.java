package core.mchien.main2;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public final class VDTT_ji extends VDTT_aq {
   private static Vector U = new Vector();
   private static VDTT_dv V;
   private static VDTT_dv W;
   private static VDTT_dv X;
   private static VDTT_dv Y;
   public VDTT_hs[][] O;
   private VDTT_hs[] Z;
   private VDTT_hs aa;
   private int ab;
   private int ac;
   private int ad;
   private int ae;
   private int af;
   private int ag;
   private Vector ah = new Vector();
   public Vector P = new Vector();
   private Vector ai = new Vector();
   public static String[][] Q;
   public boolean R;
   private boolean aj;
   public int S;
   private VDTT_ba ak;
   private VDTT_iq al;
   private VDTT_fh am;
   private String[][] an;
   private Vector ao;
   private int ap;
   private int[] aq = new int[]{49, 61, 28, 92, 22, 21, 102, 59, 98, 32};
   public Item[][] T;
   private VDTT_hs[][] ar;
   private Item as;

   public VDTT_ji(VDTT_p var1, Message var2) {
      super(var1);

      try {
         this.a(348);
         VDTT_hp var8;
         (var8 = new VDTT_hp(5000)).c = Caption.Ap;
         this.a(var8, 170, 80, 4);
         this.K = false;
         this.ab = VDTT_jb.f();
         this.al = new VDTT_iq(new VDTT_hp(1001, Caption.An), this);
         this.ac = (this.q - 20) / 6;
         this.ad = this.h() - 30;
         this.ae = 35;
         this.af = 6;
         this.ag = this.f() + 2;
         this.O = new VDTT_hs[3][];
         this.O[0] = new VDTT_hs[1];
         this.O[0][0] = new VDTT_hs((byte)0, this.af, this.ag, this.ac * 7, 18, this.ac, 7);

         String[] var5;
         int var9;
         VDTT_dv var10000;
         for(var9 = 0; var9 < 7; ++var9) {
            for(Iterator var4 = g(var9).iterator(); var4.hasNext(); var10000.g = var5) {
               VDTT_dv var3;
               var10000 = var3 = (VDTT_dv)var4.next();
               var5 = VDTT_dg.b(VDTT_dg.b, var3.d, this.ac - 12);
            }
         }

         Collections.sort(U, VDTT_dv.h);
         this.B();

         try {
            String[] var10 = VDTT_jb.a(var2.j(), "\\n");
            this.ah.clear();

            for(int var12 = 0; var12 < var10.length; ++var12) {
               this.ah.addAll(VDTT_dg.a(VDTT_dg.d, var10[var12], super.q - 8 - 46));
            }
         } catch (Exception var6) {
         }

         this.O[1] = new VDTT_hs[1];
         this.O[1][0] = new VDTT_hs((byte)1, 13, this.f() + 11, super.q - 8 - 18, 182, 14, this.ah.size());
         this.O[2] = new VDTT_hs[3];
         this.O[2][0] = new VDTT_hs((byte)1, 13, this.f() + 11, super.q - 8 - 18, 189, 27, Q[0].length);
         this.O[2][1] = new VDTT_hs((byte)1, 13, this.f() + 45, super.q - 8 - 18, 120, 15, 0);
         this.O[2][2] = new VDTT_hs((byte)1, 13, this.f() + 11, super.q - 8 - 18, 27, 27, 1);
         this.A();
         VDTT_cw.v().cn = z() == null;
         this.ak = this.a(this.q - 72, this.r - 30, Caption.nz, this, 1011, -8);
         this.a(this.ak, 3);
         this.ao = new Vector();

         for(var9 = 0; var9 < this.aq.length; ++var9) {
            if (this.aq[var9] == 61) {
               this.ao.addElement(new VDTT_iu(this.aq[var9], String.format("%s", Caption.xK)));
            } else {
               int var10001 = this.aq[var9];
               String var11;
               Vector var13;
               int var10003;
               Object[] var10005;
               int var10009;
               if ((var11 = DataCenter.d().F[var10001].k) != null && !var11.isEmpty()) {
                  var13 = this.ao;
                  var10003 = this.aq[var9];
                  var10005 = new Object[2];
                  var10009 = this.aq[var9];
                  var10005[0] = DataCenter.d().F[var10009].j;
                  var10005[1] = var11;
                  var13.addElement(new VDTT_iu(var10003, String.format("%s (%s)", var10005)));
               } else {
                  var13 = this.ao;
                  var10003 = this.aq[var9];
                  var10005 = new Object[1];
                  var10009 = this.aq[var9];
                  var10005[0] = DataCenter.d().F[var10009].j;
                  var13.addElement(new VDTT_iu(var10003, String.format("%s", var10005)));
               }
            }
         }

         this.an = new String[this.aq.length][];
         this.an[0] = Caption.Bz;
         this.an[1] = Caption.Cc;
         this.an[2] = Caption.Bx;
         this.an[3] = Caption.By;
         this.an[4] = Caption.BA;
         this.an[5] = Caption.BB;
         this.an[6] = Caption.BC;
         this.an[7] = Caption.BE;
         this.an[8] = Caption.BG;
         this.an[9] = Caption.BH;
         this.Z = new VDTT_hs[3];
         this.Z[0] = new VDTT_hs((byte)1, 13, this.f() + 11, super.q - 8 - 18, 189, 27, this.ao.size());
         this.Z[1] = new VDTT_hs((byte)1, 13, this.f() + 11, super.q - 8 - 18, 27, 27, 1);
         this.f(0);
         this.al.a(this.ab);
      } catch (Exception var7) {
         VDTT_jb.a(var7);
      }
   }

   public final void f(int var1) {
      super.f(var1);
   }

   private void A() {
      if (!DataCenter.l()) {
         int[][] var1 = new int[Q[0].length][];
         boolean[][] var2 = new boolean[Q[0].length][];
         var1[4] = new int[]{566, 160, 191, 4, 404, 818};
         var2[4] = new boolean[]{false, true, false, false, false, false};
         var1[5] = new int[]{163, 697, 813, 164};
         var2[5] = new boolean[]{true, true, false, false};
         var1[6] = new int[]{562, 838, 163, 697, 814, 164};
         var2[6] = new boolean[]{false, true, true, true, false, false};
         var1[7] = new int[]{191, 4, 817, 816, 164};
         var2[7] = new boolean[]{false, false, false, false, false};
         var1[8] = new int[]{5, 163, 697, 815, 164, 853};
         var2[8] = new boolean[]{false, true, true, false, false, false};
         var1[9] = new int[]{5, 163, 697, 815, 164, 853};
         var2[9] = new boolean[]{false, true, true, false, false, false};
         var1[10] = new int[]{4, 711};
         var2[10] = new boolean[]{true, true};
         var1[12] = new int[]{891, 189, 931, 191};
         var2[12] = new boolean[]{true, true, true, false};
         var1[14] = new int[]{354, 4, 838, 910};
         var2[14] = new boolean[]{false, false, true, true};
         var1[15] = new int[]{734, 745, 756, 767};
         var2[15] = new boolean[]{true, true, true, true};
         var1[17] = new int[]{829, 163, 160, 177};
         var2[17] = new boolean[]{true, true, true, true};
         var1[18] = new int[]{5, 163, 697, 815, 164, 853};
         var2[18] = new boolean[]{false, true, true, false, false, true};
         var1[19] = new int[]{353, 564, 4, 406, 938, 771};
         var2[19] = new boolean[]{false, false, false, false, true, false};
         var1[20] = new int[]{1058, 1063, 1068, 1073, 6};
         var2[20] = new boolean[]{false, true, false, true, true};
         var1[21] = new int[]{909, 177, 922};
         var2[21] = new boolean[]{true, true, false};
         this.T = new Item[var1.length][];
         this.ar = new VDTT_hs[var1.length][];

         for(int var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] != null) {
               this.T[var3] = new Item[var1[var3].length];
               this.ar[var3] = new VDTT_hs[var1[var3].length];

               for(int var4 = 0; var4 < var1[var3].length; ++var4) {
                  this.T[var3][var4] = new Item(var1[var3][var4], var2[var3][var4]);
                  this.ar[var3][var4] = new VDTT_hs((byte)1, 75 + var4 * 35, this.f() + this.r - 68, 28, 28, 1, 1);
               }
            }
         }

      }
   }

   public static VDTT_dv z() {
      Vector var1 = g(VDTT_jb.f());

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         VDTT_dv var0;
         if ((var0 = (VDTT_dv)var1.get(var2)).a()) {
            return var0;
         }
      }

      return null;
   }

   private static Vector g(int var0) {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < U.size(); ++var2) {
         if (((VDTT_dv)U.get(var2)).a == var0) {
            var1.add((VDTT_dv)U.get(var2));
         }
      }

      return var1;
   }

   public final Vector g() {
      Vector var1 = super.g();
      int var2;
      switch(super.a.b) {
      case 0:
         var1.addElement(this.al.f());
         break;
      case 1:
         for(var2 = 0; var2 < this.O[super.a.b].length; ++var2) {
            var1.addElement(this.O[super.a.b][var2].a(1030, this));
         }

         return var1;
      case 2:
         if (!this.R) {
            var1.addElement(this.O[super.a.b][0].a(9980, this));
         } else {
            var1.addElement(this.O[super.a.b][2].a(9981, this));
            var1.addElement(this.O[super.a.b][1].a(1030, this));
         }

         if (this.ar != null && this.ar[this.S] != null && this.R) {
            for(var2 = 0; var2 < this.ar[this.S].length; ++var2) {
               if (this.ar[this.S][var2] != null) {
                  var1.addElement(this.ar[this.S][var2].a(3000, this, this.T[this.S][var2]));
               }
            }
         }
         break;
      case 3:
         if (!this.aj) {
            var1.addElement(this.Z[0].a(9982, this));
         } else {
            var1.addElement(this.Z[1].a(9983, this));
            if (this.Z[2] != null) {
               var1.addElement(this.Z[2].a(9984, this));
            }
         }
      }

      return var1;
   }

   public final void b(Graphics var1) {
      super.b(var1);
      switch(super.a.b) {
      case 0:
         this.al.a(var1);
         Graphics var2 = var1;
         VDTT_ji var10 = this;
         Vector var4 = g(this.ab);
         int var6 = 0;
         VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, Caption.wr, 5 + this.aa.objX, this.aa.objY - this.aa.h * 2 + VDTT_dg.a(VDTT_dg.d) / 2, 0, -1, -16777216);
         VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, Caption.ws, 5 + this.aa.objX, this.aa.objY - this.aa.h + VDTT_dg.a(VDTT_dg.d) / 2, 0, -1, -16777216);
         if (var4.size() > 0) {
            this.a(var1, this.aa);

            for(int var7 = 0; var7 < var10.aa.i; ++var7) {
               if (var6 < var4.size()) {
                  VDTT_dv var5 = (VDTT_dv)var4.get(var6);
                  if (var10.aa.b(var7)) {
                     try {
                        short var3 = -1;
                        if (var5.a() && var5.a == VDTT_jb.f()) {
                           var3 = -2560;
                        }

                        VDTT_dg.a((VDTT_dg)VDTT_dg.d, var2, "- " + var5.d + Caption.wq + VDTT_jb.l(var5.b) + " - " + VDTT_jb.l(var5.c), 5, var7 * var10.aa.h + VDTT_dg.a(VDTT_dg.d) / 2, 0, var3, -16777216);
                     } catch (Exception var9) {
                     }
                  }
               }

               ++var6;
            }

            var10.a(var2);
         }

         return;
      case 1:
         this.f(var1);
         return;
      case 2:
         this.g(var1);
         return;
      case 3:
         this.h(var1);
      default:
      }
   }

   private void f(Graphics var1) {
      this.a(var1, this.O[super.a.b][0]);

      for(int var2 = 0; var2 < this.O[super.a.b][0].i; ++var2) {
         if (this.O[super.a.b][0].b(var2)) {
            VDTT_dg.a(var1, (String)this.ah.get(var2), 5, var2 * this.O[super.a.b][0].h + 6, 0, -1);
         }
      }

      this.a(var1);
      this.O[super.a.b][0].a(var1, this);
   }

   private void g(Graphics var1) {
      int var2;
      int var3;
      if (!this.R) {
         this.a(var1, this.O[super.a.b][0]);

         for(var2 = 0; var2 < this.O[super.a.b][0].i; ++var2) {
            if (this.O[super.a.b][0].b(var2)) {
               this.a(var1, 0, var2 * this.O[super.a.b][0].h, this.O[super.a.b][0].q, 26, 46, 22, 23, 1, 1);
               if (Q[0][var2].equals(Caption.wK)) {
                  VDTT_dc.a(var1, 638, 0, 15, var2 * this.O[super.a.b][0].h + 13, 3);
               } else {
                  VDTT_dc.a(var1, 395, 0, 15, var2 * this.O[super.a.b][0].h + 13, 3);
               }

               if (this.O[super.a.b][0].l == var2) {
                  VDTT_dg.d(VDTT_dg.d, var1, Q[0][var2], 26, 13 + var2 * this.O[super.a.b][0].h, 0, -1, 0);
               } else {
                  VDTT_dg.d(VDTT_dg.d, var1, Q[0][var2], 26, 12 + var2 * this.O[super.a.b][0].h, 0, -1, 0);
               }

               if (this.T != null && this.T[var2] != null) {
                  for(var3 = 0; var3 < this.T[var2].length; ++var3) {
                     if (this.T[var2][var3] != null) {
                        VDTT_aa.a(var1, 53, 0, this.O[super.a.b][0].q - this.T[var2].length * 25 + var3 * 25, 1 + var2 * this.O[super.a.b][0].h, 24, (int)24);
                        VDTT_aa.a(var1, this.T[var2][var3].an(), 0, this.O[super.a.b][0].q - this.T[var2].length * 25 + var3 * 25 + 12, var2 * this.O[super.a.b][0].h + 12, 95, (byte)3);
                        if (this.T[var2][var3].t) {
                           VDTT_aa.a(var1, 44, 0, this.O[super.a.b][0].q - this.T[var2].length * 25 + var3 * 25 + 2, var2 * this.O[super.a.b][0].h + 2, 80);
                        }
                     }
                  }
               }
            }
         }

         this.a(var1);
         this.O[super.a.b][0].b(var1, this);
      } else {
         this.a(var1, this.O[super.a.b][2]);
         this.a(var1, 0, 0 * this.O[super.a.b][2].h, this.O[super.a.b][2].q, 26, 46, 22, 23, 1, 1);
         if (this.O[super.a.b][2].l == 0) {
            VDTT_dg.d(VDTT_dg.d, var1, Q[0][this.S], 26, 13, 0, -1, 0);
            var1.e(30);
            VDTT_dc.a(var1, 398, 0, this.O[super.a.b][2].q - 21, 5, 20);
            var1.h();
         } else {
            VDTT_dg.d(VDTT_dg.d, var1, Q[0][this.S], 26, 12, 0, -1, 0);
            VDTT_dc.a(var1, 398, 0, this.O[super.a.b][2].q - 22, 4, 20);
         }

         if (Q[0][this.S].equals(Caption.wK)) {
            VDTT_dc.a(var1, 638, 0, 15, 13, 3);
            this.a(var1);
            VDTT_dc.a(var1, 41, 0, this.q / 2, this.r / 2 + 30, 3);
         } else {
            VDTT_dc.a(var1, 396, 0, 15, 13, 3);
            this.a(var1);
            this.a(var1, this.O[super.a.b][1]);
            var2 = 0;

            for(var3 = 0; var3 < this.O[super.a.b][1].i; ++var3) {
               String var4 = (String)this.P.get(var3);
               VDTT_dg.d(VDTT_dg.d, var1, var4, 2, 6 + var3 * this.O[super.a.b][1].h, 0, -1, 0);
               if (this.S == 0) {
                  if (var4.contains("-space:-space:-space:-space")) {
                     ++var2;
                     switch(var2) {
                     case 1:
                        VDTT_dc.a(var1, 1, 3 + var3 * this.O[super.a.b][1].h, 30, 7, -8492991, 22, 23, 1, 1, 90);
                        VDTT_aa.a(var1, 32, 0, 2, 4 + var3 * this.O[super.a.b][1].h, 28, (int)5);
                        break;
                     case 2:
                        var1.f(-65536);
                        var1.c(2, 4 + var3 * this.O[super.a.b][1].h, 28, 5);
                        var1.f(-16777216);
                        var1.b(2, 4 + var3 * this.O[super.a.b][1].h, 28, 5);
                        break;
                     case 3:
                        var1.f(-9942667);
                        var1.c(2, 4 + var3 * this.O[super.a.b][1].h, 28, 5);
                        var1.f(-16777216);
                        var1.b(2, 4 + var3 * this.O[super.a.b][1].h, 28, 5);
                        break;
                     case 4:
                        var1.f(-16711681);
                        var1.c(2, 4 + var3 * this.O[super.a.b][1].h, 28, 5);
                        var1.f(-16777216);
                        var1.b(2, 4 + var3 * this.O[super.a.b][1].h, 28, 5);
                     }
                  }
               } else if (this.S == 2 && var4.contains("-space:-space")) {
                  ++var2;
                  switch(var2) {
                  case 1:
                     VDTT_dc.a(var1, 751, 0, 4, 1 + var3 * this.O[super.a.b][1].h, 0);
                     break;
                  case 2:
                     VDTT_dc.a(var1, 750, 0, 4, 1 + var3 * this.O[super.a.b][1].h, 0);
                     break;
                  case 3:
                     VDTT_dc.a(var1, 749, 0, 4, 1 + var3 * this.O[super.a.b][1].h, 0);
                  }
               }
            }

            this.a(var1);
            this.O[super.a.b][1].a(var1, this);
            if (this.T != null && this.T.length > 0 && this.T[this.S] != null) {
               VDTT_dg.a(var1, Caption.oo, 16, this.f() + this.r - 52, 0, -1);

               for(var3 = 0; var3 < this.T[this.S].length; ++var3) {
                  if (this.T[this.S][var3] != null) {
                     b(var1, 75 + var3 * 35, this.f() + this.r - 68, this.T[this.S][var3], this.as != null && this.as.equals(this.T[this.S][var3]));
                  }
               }
            }

         }
      }
   }

   private void h(Graphics var1) {
      int var2;
      if (!this.aj) {
         this.a(var1, this.Z[0]);

         for(var2 = 0; var2 < this.Z[0].i; ++var2) {
            if (this.Z[0].b(var2)) {
               this.a(var1, 0, var2 * this.Z[0].h, this.Z[0].q, 26, 46, 22, 23, 1, 1);
               if (this.aq[var2] == 61) {
                  VDTT_dc.a(var1, 897, 0, 15, var2 * this.Z[0].h + 13, 3);
               } else {
                  VDTT_dc.a(var1, 395, 0, 15, var2 * this.Z[0].h + 13, 3);
               }

               if (this.Z[0].l == var2) {
                  VDTT_dg.a(var1, ((VDTT_iu)this.ao.get(var2)).b, 26, 13 + var2 * this.Z[0].h, 0, -1);
               } else {
                  VDTT_dg.a(var1, ((VDTT_iu)this.ao.get(var2)).b, 26, 12 + var2 * this.Z[0].h, 0, -1);
               }
            }
         }

         this.a(var1);
         this.Z[0].b(var1, this);
      } else {
         this.a(var1, this.Z[1]);
         this.a(var1, 0, 0 * this.Z[1].h, this.Z[1].q, 26, 46, 22, 23, 1, 1);
         if (this.Z[1].l == 0) {
            if (this.aq[this.ap] == 61) {
               VDTT_dg.a(var1, Caption.xL, 26, 13, 0, -1);
            } else {
               VDTT_dg.a(var1, ((VDTT_iu)this.ao.get(this.ap)).b, 26, 13, 0, -1);
            }

            var1.e(30);
            VDTT_dc.a(var1, 398, 0, this.Z[1].q - 21, 5, 20);
            var1.h();
         } else {
            if (this.aq[this.ap] == 61) {
               VDTT_dg.a(var1, Caption.xL, 26, 12, 0, -1);
            } else {
               VDTT_dg.d(VDTT_dg.d, var1, ((VDTT_iu)this.ao.get(this.ap)).b, 26, 12, 0, -1, 0);
            }

            VDTT_dc.a(var1, 398, 0, this.Z[1].q - 22, 4, 20);
         }

         if (this.aq[this.ap] == 61) {
            VDTT_dc.a(var1, 897, 0, 15, 13, 3);
         } else {
            VDTT_dc.a(var1, 396, 0, 15, 13, 3);
         }

         this.a(var1);
         boolean var3 = true;
         var1.j = var3;

         for(var2 = 0; var2 < this.am.a.length; ++var2) {
            byte var4 = 0;
            if (this.ap == 0) {
               if (VDTT_cw.v().cV > 15) {
                  var4 = 40;
               } else if (VDTT_cw.v().cV > 10) {
                  var4 = 20;
               }
            }

            VDTT_dc.b(var1, this.am.a[var2].a, this.am.a[var2].a(false), this.q / 2 + this.am.a[var2].c + 90, this.f() + 122 + this.am.a[var2].d + var4, 33);
         }

         var3 = false;
         var1.j = var3;
         this.a(var1, this.Z[2]);

         for(var2 = 0; var2 < this.Z[2].i; ++var2) {
            if (var2 < 2) {
               VDTT_dg.a(var1, (String)this.ai.get(var2), 7, 7 + var2 * this.Z[2].h, 0, -1);
            } else {
               VDTT_dg.a(var1, "-  " + (String)this.ai.get(var2), 7, 7 + var2 * this.Z[2].h, 0, -1);
            }
         }

         this.a(var1);
         this.Z[2].a(var1);
      }
   }

   public final void a_() {
      this.al.e();

      int var1;
      int var2;
      for(var1 = 0; var1 < this.O.length; ++var1) {
         for(var2 = 0; var2 < this.O[var1].length; ++var2) {
            if (this.O[var1][var2] != null) {
               this.O[var1][var2].a();
            }
         }
      }

      if (this.Z != null) {
         for(var1 = 0; var1 < this.Z.length; ++var1) {
            if (this.Z[var1] != null) {
               this.Z[var1].a();
            }
         }
      }

      if (this.ar != null) {
         for(var1 = 0; var1 < this.ar.length; ++var1) {
            if (this.ar[var1] != null) {
               for(var2 = 0; var2 < this.ar[var1].length; ++var2) {
                  if (this.ar[var1][var2] != null) {
                     this.ar[var1][var2].a();
                  }
               }
            }
         }
      }

      if (this.aa != null) {
         this.aa.a();
      }

      if (this.aj && this.ap < 9) {
         this.ak.b(false);
      } else {
         this.ak.b(true);
      }

      if (VDTT_cw.v().br == 5 && VDTT_cw.v().bs == 0) {
         this.y();
      }

   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      Vector var4 = g(this.ab);
      String[] var9;
      switch(var1.b) {
      case 1001:
         if (var1.j.k >= 0) {
            this.al.a(var1.j.k);
            this.ab = var1.j.k;
            this.B();
            return;
         }
         break;
      case 1010:
         if (this.aa.k >= 0 && this.aa.k < var4.size()) {
            if (VDTT_ek.m().av <= 0) {
               this.k = a(Caption.nA, this, var2, var3, 180);
               return;
            }

            switch(((VDTT_dv)var4.get(this.aa.k)).e) {
            case 54:
               this.k = a(Caption.nx, this, var2, var3, 150);
               break;
            case 57:
               boolean var11 = true;
               (var4 = new Vector()).addElement(new VDTT_iu(2001, Caption.AA[0]));
               var4.addElement(new VDTT_iu(2002, Caption.AA[1]));
               var4.addElement(new VDTT_iu(2003, Caption.AA[2]));
               var4.addElement(new VDTT_iu(2004, Caption.AA[3]));
               var4.addElement(new VDTT_iu(2005, Caption.AA[4]));
               if (var4.size() > 0) {
                  String[] var5 = new String[var4.size()];
                  short[] var6 = new short[var4.size()];

                  for(int var7 = 0; var7 < var4.size(); ++var7) {
                     VDTT_iu var8 = (VDTT_iu)var4.elementAt(var7);
                     var5[var7] = var8.b;
                     var6[var7] = (short)var8.a;
                  }

                  this.k = a(this, var2, var3, new VDTT_hp(3000, var6, var5));
               }
               break;
            default:
               this.k = a(Caption.uz, this, var2, var3, 150);
               return;
            }
         }
         break;
      case 1011:
         if (this.aq[this.ap] == 61) {
            VDTT_cw.v();
            if (VDTT_cw.f(VDTT_cw.v().ai) != 1) {
               DataCenter.d().ai.c(Caption.xM, -2560);
               return;
            }
         }

         VDTT_cw.v();
         VDTT_cw.h(this.aq[this.ap]);
         if (VDTT_cw.v().bv.a == 98) {
            if (VDTT_cw.v().ai != 54) {
               if (VDTT_cw.v().cc) {
                  DataCenter.d().ai.c(Caption.xy, -2560);
                  return;
               }

               VDTT_cw.v().bv.a = 40;
               VDTT_cw.v();
               VDTT_cw.h(40);
            }

            if (VDTT_cw.v().ai != 86 && VDTT_cw.v().ai != 87 && VDTT_cw.v().ai != 54) {
               VDTT_cw.v().bw = VDTT_cw.v().bv;
               VDTT_cw.v();
               VDTT_cw.q(86);
            }
         } else if (VDTT_cw.v().bv.a == 32) {
            if (VDTT_cw.v().ai != 53) {
               if (VDTT_cw.v().cc) {
                  DataCenter.d().ai.c(Caption.xz, -2560);
                  return;
               }

               VDTT_cw.v().bv.a = 40;
               VDTT_cw.v();
               VDTT_cw.h(40);
            }

            if (VDTT_cw.v().ai != 86 && VDTT_cw.v().ai != 87 && VDTT_cw.v().ai != 53) {
               VDTT_cw.v().bw = VDTT_cw.v().bv;
               VDTT_cw.v();
               VDTT_cw.q(86);
            }
         } else if (VDTT_cw.v().bv.a == 59) {
            if (VDTT_cw.v().ai != 56 && VDTT_cw.v().ai != 58 && VDTT_cw.v().ai != 86) {
               VDTT_cw.v().bw = VDTT_cw.v().bv;
               VDTT_cw.v();
               VDTT_cw.q(86);
            }
         } else if (VDTT_cw.v().ai != VDTT_cw.v().bv.d) {
            VDTT_cw.v().bw = VDTT_cw.v().bv;
            VDTT_cw.v();
            VDTT_cw.q(VDTT_cw.v().bw.d);
         }

         this.k();
         return;
      case 2001:
         VDTT_dv var10;
         if ((var10 = (VDTT_dv)var4.get(this.aa.k)).e >= 0) {
            VDTT_cw.v().bv = new VDTT_dy(var10.f, -1, -1, var10.e, 0, 0);
         } else if (var10.f >= 0) {
            if (var10.f == 4) {
               if (!V.a()) {
                  VDTT_cw.v().c(Caption.nL, -1);
                  return;
               }

               VDTT_cw.v();
               VDTT_cw.h(var10.f);
            } else {
               VDTT_cw.v();
               VDTT_cw.h(var10.f);
            }
         }

         this.k();
      case 2006:
      default:
         break;
      case 3000:
         this.as = (Item)var1.k;
         this.k = c(this, var1, this.as);
         VDTT_ac.b().n();
         return;
      case 9980:
         if (var1.j.k >= 0) {
            this.S = var1.j.k;
            var9 = VDTT_jb.a(Q[1][this.S], "\\n");
            this.P.clear();

            for(var2 = 0; var2 < var9.length; ++var2) {
               this.P.addAll(VDTT_dg.a(VDTT_dg.d, var9[var2], super.q - 8 - 35));
            }

            if (this.T != null && this.T[this.S] != null) {
               this.O[2][1] = new VDTT_hs((byte)1, 13, this.f() + 45, super.q - 8 - 18, 120, 15, this.P.size());
            } else {
               this.O[2][1] = new VDTT_hs((byte)1, 13, this.f() + 45, super.q - 8 - 18, 150, 15, this.P.size());
            }

            this.R = true;
            return;
         }
         break;
      case 9981:
         this.R = false;
         return;
      case 9982:
         if (var1.j.k >= 0) {
            this.ap = var1.j.k;
            var9 = this.an[this.ap];
            this.ai.clear();
            if (var9 != null) {
               for(var2 = 0; var2 < var9.length; ++var2) {
                  this.ai.addAll(VDTT_dg.a(VDTT_dg.d, var9[var2], super.q - 8 - 160));
               }

               this.Z[2] = new VDTT_hs((byte)1, 20, this.f() + 45, super.q - 8 - 150, 135, 15, this.ai.size());
            } else {
               this.Z[2] = null;
            }

            VDTT_gx var12 = new VDTT_gx((byte)0, this.aq[this.ap], 0, 0);
            this.am = var12.m().b[0];
            this.aj = true;
            return;
         }
         break;
      case 9983:
         this.aj = false;
         return;
      }

   }

   private void B() {
      this.aa = new VDTT_hs((byte)1, 9, this.f() + 77, super.q - 8 - 10, 90, 15, g(this.ab).size());
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      switch(var1) {
      case 2001:
         b(57, 1286, 239);
         this.k();
         return;
      case 2002:
         b(65, 525, 766);
         this.k();
         return;
      case 2003:
         b(87, 199, 309);
         this.k();
         return;
      case 2004:
         b(79, 519, 268);
         this.k();
         return;
      case 2005:
         b(76, 192, 522);
         this.k();
      default:
      }
   }

   public final void b(int var1, Object var2) {
   }

   private static void b(int var0, int var1, int var2) {
      if (!W.a() && !X.a() && !Y.a()) {
         VDTT_cw.v().c(Caption.nN, -1);
      } else if (VDTT_cw.v().ai == var0) {
         VDTT_cw.v().c(Caption.nO, -2560);
      } else {
         VDTT_cw.v().bv = new VDTT_dy(var0, var1, var2);
      }
   }

   static {
      for(int var0 = 0; var0 < 7; ++var0) {
         if (var0 < 6) {
            if (var0 % 2 == 0) {
               U.add(new VDTT_dv(var0, Caption.AC[3], 75600, 76200, -1, 32));
               U.add(new VDTT_dv(var0, Caption.AC[6], 68400, 69000, -1, 32));
            } else {
               U.add(new VDTT_dv(var0, Caption.AC[4], 75600, 76200, -1, 32));
               U.add(new VDTT_dv(var0, Caption.AC[5], 70500, 71999, -1, 32));
            }
         }

         if (var0 == 6) {
            U.add(new VDTT_dv(var0, Caption.AC[7], 75600, 76200, -1, 32));
         }
      }

      Collections.sort(U, VDTT_dv.h);
   }
}
