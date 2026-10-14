package core.mchien.main2;

import java.util.Vector;

public final class VDTT_gx extends VDTT_n {
   public short k;
   public byte l;
   public Vector m = new Vector();
   public VDTT_hr n;
   public short o;
   private VDTT_hi I = new VDTT_hi(112, 0, 0, -1);
   private VDTT_hi J = new VDTT_hi(113, 0, 0, -1);
   public int p;

   public VDTT_gx(byte var1, int var2, int var3, int var4) {
      try {
         this.e = var1;
         this.k = (short)var2;
         this.f(var3, var4);
         this.d(this.m().d, this.m().e);
         if (VDTT_jb.a((int)2) == 0) {
            this.d = 3;
         } else {
            this.d = 2;
         }

         if (!this.o()) {
            this.c = (short)VDTT_jb.a(this.m().a[0].length);
            return;
         }

         this.c = (short)VDTT_jb.a(this.m().a[0].length);
      } catch (Exception var5) {
      }

   }

   public final VDTT_gy m() {
      if (this.o()) {
         VDTT_cw.v();
         VDTT_gy var2;
         if (x() == 0) {
            short var1 = this.k;
            if (VDTT_cw.v().cV > 15) {
               var1 = 52;
            } else if (VDTT_cw.v().cV > 10) {
               var1 = 51;
            } else if (VDTT_cw.v().cV > 5) {
               var1 = 50;
            }

            var2 = DataCenter.d().F[var1];
         } else {
            short var3 = 106;
            if (VDTT_cw.v().cV > 15) {
               var3 = 151;
            } else if (VDTT_cw.v().cV > 10) {
               var3 = 131;
            } else if (VDTT_cw.v().cV > 5) {
               var3 = 116;
            }

            var2 = DataCenter.d().F[var3 + x() - 1];
         }

         this.d(var2.d, var2.e);
         return var2;
      } else {
         return DataCenter.d().F[this.k];
      }
   }

   public final void n() {
      XYEntity var1;
      if (this.e != 6 && (var1 = VDTT_ek.b(this.objX, this.objY)) != null) {
         this.objY = var1.objY;
      }

      if (this.k == 48) {
         this.f(this.objX, this.objY - 3);
         this.d(40, 22);
      } else {
         this.f(this.objX, this.objY);
      }

      this.o = this.objY;
   }

   public final int a() {
      return this.objX - this.q / 2;
   }

   public final int b() {
      return this.objX + this.q / 2;
   }

   public final int c() {
      if (this.k == 48) {
         return this.objY - this.r - 26;
      } else {
         return this.w() && VDTT_cw.v().ai == 87 && this.objY > 330 ? 330 : this.objY - this.r;
      }
   }

   public final int d() {
      if (this.k == 48) {
         return this.objY - 26;
      } else {
         return this.w() && VDTT_cw.v().ai == 87 && this.objY > 380 ? 380 : this.objY;
      }
   }

   public final boolean o() {
      return this.k >= 49 && this.k <= 52;
   }

   public final void p() {
      try {
         if (this.e == 9) {
            this.objY = (short)(this.objY - 30);
            if (this.objY < -5000) {
               this.e = 0;
               this.objY = this.o;
            }
         }

         if (this.m().l <= 0) {
            this.m().l = 100;
         }

         if (this.m().m <= 0) {
            this.m().m = 100;
         }

         if (this.e != 6) {
            if (this.n != null && this.n.a(this.k(), this.objY - this.r + 2)) {
               this.n = null;
            }

            ++this.c;
            if (this.c >= this.m().a[this.e].length) {
               this.c = 0;
            }

            this.l = (byte)this.m().a[this.e][this.c];
            if (this.k == 38) {
               this.m.clear();
               if (VDTT_ek.m().w() >= 20 && VDTT_ek.m().w() < 30) {
                  if (VDTT_cw.v().bz != null && VDTT_cw.v().bz.a()) {
                     this.m.add(this.J);
                  } else if (VDTT_cw.v().bz == null) {
                     this.m.add(this.I);
                  }
               }
            } else if (this.k == 36) {
               this.m.clear();
               if (VDTT_ek.m().w() >= 30 && VDTT_ek.m().w() < 40) {
                  if (VDTT_cw.v().bA != null && VDTT_cw.v().bA.a()) {
                     this.m.add(this.J);
                  } else if (VDTT_cw.v().bA == null) {
                     this.m.add(this.I);
                  }
               }
            } else if (this.k == 23) {
               this.m.clear();
               if (VDTT_ek.m().w() >= 10) {
                  if (VDTT_cw.v().bC != null && VDTT_cw.v().bC.a()) {
                     this.m.add(this.J);
                  } else if (VDTT_cw.v().bA == null) {
                     this.m.add(this.I);
                  }
               }
            } else if (this.k == 60) {
               this.m.clear();
               byte var4 = 0;
               if (VDTT_ek.m().av == 1) {
                  var4 = 8;
               } else if (VDTT_ek.m().av == 2) {
                  var4 = 3;
               } else if (VDTT_ek.m().av == 3) {
                  var4 = 15;
               } else if (VDTT_ek.m().av == 4) {
                  var4 = 21;
               }

               VDTT_ic var2;
               if ((var2 = VDTT_cw.v().g(var4)) != null && var2.f >= 5 && var2.f < 70) {
                  if (VDTT_cw.v().bB != null && VDTT_cw.v().bB.a()) {
                     this.m.add(this.J);
                  } else if (VDTT_cw.v().bB == null) {
                     this.m.add(this.I);
                  }
               }
            } else if (this.k == 61 && VDTT_cw.v().cs <= 8) {
               if (VDTT_cw.v().cs == -1) {
                  if (!this.m.contains(this.I)) {
                     this.m.add(this.I);
                  }
               } else {
                  VDTT_ez var1;
                  if ((var1 = VDTT_ek.m().h(162)) != null) {
                     if (var1.b < 8) {
                        if (!this.m.contains(this.I)) {
                           this.m.add(this.I);
                        }
                     } else if (var1.b == 8 && !this.m.contains(this.J)) {
                        this.m.remove(this.I);
                        this.m.add(this.J);
                     }
                  }
               }
            }

            for(int var6 = this.m.size() - 1; var6 >= 0; --var6) {
               VDTT_hi var5;
               (var5 = (VDTT_hi)this.m.elementAt(var6)).a((VDTT_n)this);
               if (var5.p()) {
                  this.m.removeElement(var5);
               }
            }

            if (this.k > 2) {
               if (this.d == 2) {
                  this.g = true;
                  return;
               }

               this.g = false;
            }

         }
      } catch (Exception var3) {
      }
   }

   public final void a(Graphics var1) {
      try {
         if (this.e != 6) {
            if (!VDTT_jb.e()) {
               if (this.p > 0) {
                  if (this.p % 2 == 0) {
                     var1.a(1.2F, 0.5F);
                  }

                  --this.p;
               }

               int var2 = this.objY;
               if (this.k == 48) {
                  VDTT_dc.a(var1, 5, 0, this.objX, var2, 33);
                  VDTT_dg.b(VDTT_dg.d, var1, Caption.sH + " " + VDTT_cw.v().al, this.objX, var2 - 38, 2, -6488, -10275328);
               } else {
                  if (this.o()) {
                     var2 -= 3;
                     short var3 = this.m().g;
                     short var4 = this.m().h;
                     VDTT_aa.a(var1, var3, 0, this.objX, var2, var4, Graphics.s(), 3);
                  }

                  VDTT_fh var7 = this.m().b[this.l];
                  if (this.v()) {
                     this.g = false;
                  }

                  boolean var5 = true;
                  var1.j = var5;

                  for(int var8 = 0; var8 < var7.a.length; ++var8) {
                     if (this.g) {
                        VDTT_dc.b(var1, var7.a[var8].a, var7.a[var8].a(this.g), this.objX - var7.a[var8].c, var2 + var7.a[var8].d, 33);
                     } else {
                        VDTT_dc.b(var1, var7.a[var8].a, var7.a[var8].a(this.g), this.objX + var7.a[var8].c, var2 + var7.a[var8].d, 33);
                     }
                  }

                  var5 = false;
                  var1.j = var5;
                  var1.r();
               }
            }
         }
      } catch (Exception var6) {
      }
   }

   public final VDTT_fi q() {
      try {
         return this.m().b[this.m().a[4][0]].a[0];
      } catch (Exception var1) {
         return null;
      }
   }

   public final String f() {
      return VDTT_jb.c(this.m().l);
   }

   public final String g() {
      return this.m().j;
   }

   public final void b(Graphics var1) {
      if (this.k != 48 && VDTT_cw.v().bP <= 0) {
         if (this.e != 4 && this.e != 6) {
            short var2 = -1;
            if (this.equals(VDTT_cw.v().bg)) {
               var2 = -6488;
            }

            int var3 = this.objY - this.r + 2;
            if (this.k >= 2) {
               if (!DataCenter.aj) {
                  if (this.w()) {
                     var3 -= 10;
                     VDTT_dg.a(var1, this.m().j, this.objX, var3, 2, -2560);
                  } else if (this.o()) {
                     String var10001 = this.m().j + Caption.io + (VDTT_cw.v().cV + 1);
                     var3 -= 10;
                     VDTT_dg.a(var1, var10001, this.objX, var3, 2, var2);
                     int var6 = 5 + VDTT_cw.v().cV;
                     int var4 = x();
                     var10001 = Caption.sX + var4 + "/" + var6;
                     var3 -= 10;
                     VDTT_dg.a(var1, var10001, this.objX, var3, 2, -2560);
                     int var5;
                     if ((var5 = var6 * 60 - (VDTT_jb.c() - VDTT_cw.v().cW)) < 0) {
                        var5 = 0;
                     }

                     if (var4 < var6) {
                        var10001 = VDTT_jb.f(var5);
                        var3 -= 10;
                        VDTT_dg.a(var1, var10001, this.objX, var3, 2, -16711681);
                     }
                  } else {
                     var3 -= 10;
                     VDTT_dg.a(var1, this.m().j, this.objX, var3, 2, var2);
                  }
               }

               if (this.m().k != null && this.m().k.length() > 0) {
                  var3 -= 10;
                  VDTT_dg.a(var1, this.m().k, this.objX, var3, 2, -16712072);
               }
            }

            if (VDTT_cw.v().bg != null && VDTT_cw.v().bg.equals(this) || this.w()) {
               var3 -= 10;
               VDTT_cw.v().bm.f(this.objX, var3);
               VDTT_cw.v().bm.a(var1);
            }

            if (this.n != null) {
               this.n.a(var1);
            }
         }

      }
   }

   public final int e() {
      if (this.k != 48 && !this.o()) {
         if (this.s()) {
            return 6;
         } else {
            return this.r() ? 4 : 3;
         }
      } else {
         return 4;
      }
   }

   public final boolean r() {
      return this.k == 47;
   }

   public final boolean s() {
      return this.k == 48 || this.w();
   }

   private boolean w() {
      return this.k == 40 || this.k == 42 || this.k == 43 || this.k == 44 || this.k == 45 || this.k == 46;
   }

   public final boolean v() {
      return this.o() || this.k == 47 || this.k == 48 || this.w();
   }

   private static int x() {
      int var0 = 5 + VDTT_cw.v().cV;
      int var1;
      if ((var1 = (VDTT_jb.c() - VDTT_cw.v().cW) / 60) > var0) {
         var1 = var0;
      }

      return var1;
   }
}
