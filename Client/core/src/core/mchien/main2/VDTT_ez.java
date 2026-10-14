package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ez extends XYEntity {
   public int a;
   public int b;
   public int c;
   public long d;
   public int e;
   public VDTT_hi f;
   public Vector g = new Vector();
   public VDTT_gk h;
   private int l;
   public boolean i;
   public int j;
   public int k;

   public VDTT_ez(int var1, int var2, long var3, int var5, VDTT_n var6) {
      this.a = var1;
      this.b = this.c = var2;
      this.d = var3;
      this.e = var5;
      VDTT_ey var7;
      if (this.c().f > 0 && this.c().d != 138 && this.c().d != 167 && this.c().d != 81 && this.c().d != 160 && this.c().d != 165 && (var7 = this.c()).d != 128 && var7.d != 132 && var7.d != 128 && var7.d != 153 && var7.d != 172 && var7.d != 173 && this.c().d != 76 && this.c().d != 77 && this.c().d != 90 && !this.e() && !this.f()) {
         this.f = new VDTT_hi(this.c().f, var6.objX, var6.objY, -1);
      } else {
         this.j = this.c().f;
      }
   }

   public final boolean a() {
      switch(this.a) {
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 35:
      case 36:
      case 38:
      case 55:
      case 73:
      case 76:
      case 78:
      case 79:
      case 80:
      case 81:
      case 82:
      case 103:
      case 104:
      case 105:
      case 109:
      case 132:
      case 146:
      case 154:
      case 160:
      case 176:
      case 177:
      case 186:
      case 199:
      case 208:
         return true;
      default:
         return false;
      }
   }

   public final String b() {
      if (this.a == 113) {
         int var1;
         if ((var1 = (int)((long)this.c - (VDTT_jb.a() - this.d) / 200L)) <= 0) {
            var1 = 1;
         }

         return VDTT_jb.a(this.c().c, (long)var1);
      } else {
         return this.a == 67 ? VDTT_jb.b(this.c().c, VDTT_jb.i(this.b)) : VDTT_jb.b(this.c().c, "" + this.b);
      }
   }

   public final void a(VDTT_n var1) {
      if (this.f != null) {
         this.f.a(var1);
      }

      if (this.a == 57 || this.a == 62) {
         VDTT_ek var2 = (VDTT_ek)var1;
         if (this.h == null) {
            switch(this.a) {
            case 57:
               this.h = new VDTT_gk(217);
               break;
            case 62:
               this.h = new VDTT_gk(219);
               break;
            case 64:
               this.h = new VDTT_gk(220);
            }

            this.h.V = 1;
            this.h.c(this.objX, this.objY);
            this.h.o = this.h.p().q;
            this.h.d = var2.aF;
            this.h.objX = (short)(var2.objX + (var2.aF == 3 ? 35 : -35));
            this.h.objY = this.objY;
            this.h.ad = 14;
         }

         short var3 = this.h.objX;
         this.h.r();
         this.h.I = (short)var1.k();
         this.h.J = (short)var1.l();
         VDTT_gk var10002 = this.h;
         var10002.d = (byte)(var3 > var10002.objX ? 3 : 2);
         if (var2.V) {
            if (var2.p()) {
               this.h.ar = 1;
            } else {
               this.h.ar = 2;
            }
         } else {
            this.h.ar = 0;
         }

         VDTT_iz var4 = new VDTT_iz(0);
         if (this.h.p().p == 4) {
            this.h.d = var2.aF;
            this.h.objX = (short)(var2.objX + (var2.aF == 3 ? 35 : -35));
         }

         var4.f(this.h.objX, this.h.objY);
         var4.p = this.h;
         VDTT_cw.v().a((VDTT_n)var4);
      }

   }

   public final VDTT_ey c() {
      return DataCenter.d().S[this.a];
   }

   public final VDTT_ez a(int var1) {
      if (this.a == var1) {
         return this;
      } else {
         for(int var2 = 0; var2 < this.g.size(); ++var2) {
            if (((VDTT_ez)this.g.get(var2)).a == var1) {
               return (VDTT_ez)this.g.get(var2);
            }
         }

         return null;
      }
   }

   public final void a(Graphics var1, int var2, int var3, int var4, boolean var5) {
      try {
         if (DataCenter.l()) {
            return;
         }

         if (this.c().a == 42) {
            if (this.b >= 200) {
               var4 = 501;
            } else if (this.b >= 100) {
               var4 = 564;
            } else if (this.b >= 75) {
               var4 = 563;
            }
         }

         if (var5) {
            this.l = var2;
         } else {
            this.l = VDTT_jb.n(var2 + VDTT_d.g().m / 2);
         }

         var2 = 0;
         if (this.a == 145 && VDTT_ek.m().aR[10] != null) {
            var2 = (new int[]{-2, -159, -5, -20, 0, 25, 70, 71, -112, -107, -71, -60})[VDTT_ek.m().aR[10].getItemTemplate().i - 10];
         }

         if (var2 != 0) {
            var1.c((float)var2);
            VDTT_dc.a(var1, var4, 0, this.l, var3, 20);
            var1.r();
         } else {
            VDTT_dc.a(var1, var4, 0, this.l, var3, 20);
         }

         var2 = this.e - (int)(VDTT_jb.a() - this.d);
         if ((var4 = this.e / 4) == 0) {
            var4 = 1;
         }

         if (this.e == -1 || VDTT_cw.dK) {
            return;
         }

         if (var2 > var4 * 3) {
            if ((var2 = (var2 - var4 * 3) * 14 / var4) > 14) {
               var2 = 14;
            }

            VDTT_dc.a(var1, 315, -360, this.l, var3, 20);
            if (var2 > 0) {
               VDTT_dc.a(var1, 315, -270, this.l + (14 - var2), var3, var2 * DataCenter.d().r, 1 * DataCenter.d().r, 0, 0, 1, var2, 20);
            }

            VDTT_dc.a(var1, 315, 90, this.l, var3 + 13, 20);
            VDTT_dc.a(var1, 315, 0, this.l + 13, var3, 20);
         } else {
            if (var2 > var4 * 2) {
               if ((var2 = (var2 - var4 * 2) * 14 / var4) > 14) {
                  var2 = 14;
               }

               VDTT_dc.a(var1, 315, -360, this.l, var3, 20);
               VDTT_dc.a(var1, 315, 90, this.l, var3 + 13, 20);
               if (var2 > 0) {
                  VDTT_dc.a(var1, 315, 0, this.l + 13, var3 + (14 - var2), 1 * DataCenter.d().r, var2 * DataCenter.d().r, 0, 14 - var2, 1, var2, 20);
                  return;
               }
            } else if (var2 > var4) {
               if ((var2 = (var2 - var4) * 14 / var4) > 14) {
                  var2 = 14;
               }

               VDTT_dc.a(var1, 315, -360, this.l, var3, 20);
               if (var2 > 0) {
                  VDTT_dc.a(var1, 315, 90, this.l, var3 + 13, var2 * DataCenter.d().r, 1 * DataCenter.d().r, 0, 14 - var2, 1, var2, 20);
                  return;
               }
            } else {
               if ((var2 = var2 * 14 / var4) > 14) {
                  var2 = 14;
               }

               if (var2 > 0) {
                  VDTT_dc.a(var1, 315, -360, this.l, var3, 1 * DataCenter.d().r, var2 * DataCenter.d().r, 0, 0, 1, var2, 20);
               }
            }

            return;
         }
      } catch (Exception var6) {
         VDTT_jb.a(var6);
      }

   }

   public final int d() {
      return (int)(VDTT_jb.a() - this.d);
   }

   public final boolean e() {
      switch(this.c().d) {
      case 92:
      case 93:
      case 94:
      case 95:
      case 101:
      case 102:
      case 103:
      case 117:
      case 118:
      case 152:
         return true;
      default:
         return false;
      }
   }

   public final boolean a(VDTT_ek var1) {
      return this.a == 102 || this.c().d == 117 || this.a == 172 || this.a >= 87 && this.a <= 92 && (this.j == 9 || this.j == 10) && var1.m == 4 || this.j == 20 && var1.m == 3 || this.j == 10 && var1.m == 1 || (this.j == 8 || this.j == 11 || this.j == 20) && var1.m == 5;
   }

   public final boolean f() {
      return this.c().d == 78 || this.c().d == 159 || this.c().d == 166 || this.c().d == 168 || this.c().d == 169;
   }

   public final boolean g() {
      return this.a == 153 || this.c().d == 129 || this.c().d == 161;
   }
}
