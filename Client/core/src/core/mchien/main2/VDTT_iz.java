package core.mchien.main2;

public final class VDTT_iz extends VDTT_n {
   public byte k;
   public short l;
   public short m;
   public short n;
   public VDTT_hi o;
   public VDTT_gk p;
   public int I;
   private int J;

   public final VDTT_ja m() {
      try {
         return VDTT_cw.v().S == null ? null : VDTT_cw.v().S[this.l];
      } catch (Exception var1) {
         return null;
      }
   }

   public VDTT_iz(int var1) {
      this.l = (short)var1;
      this.I = this.m().c;
   }

   public final int a() {
      return this.objX - this.m().a / 2;
   }

   public final int b() {
      return this.objX + this.m().a / 2;
   }

   public final int c() {
      return this.objY - this.m().b;
   }

   public final int d() {
      return this.objY;
   }

   public final void n() {
      try {
         if (this.m().e >= 0) {
            if (this.o == null) {
               this.o = new VDTT_hi(this.m().e, this.objX, this.objY, -1);
               this.o.p = this.k == 7;
               this.o.I = true;
            }
         } else if (this.m().e < -1) {
            if (this.p == null) {
               this.p = new VDTT_gk(-this.m().e);
               this.p.V = 1;
               this.p.au = false;
               this.p.c(this.objX, this.objY);
               this.d(this.p.p().d, this.p.p().e);
               this.p.o = this.p.p().q;
               this.p.d = (byte)(VDTT_jb.b() ? 2 : 3);
            } else {
               this.f(this.p.objX, this.p.objY);
            }
         }

         if (this.o != null) {
            if (this.J > 0) {
               --this.J;
               return;
            }

            this.o.n();
            if (this.o.m == 0 && this.m().d == 11 && this.J == 0 && VDTT_jb.a((int)10) != 0) {
               this.J = VDTT_jb.a(10, 250);
            }

            this.q = this.o.q;
            this.r = this.o.r;
            if (this.o.p()) {
               this.o = null;
            }
         }

      } catch (Exception var1) {
      }
   }

   public final void a(Graphics var1) {
      DataCenter.o();
      if (!DataCenter.l() || this.I == 10 || this.I == 5 || this.I == 7) {
         long var2 = System.currentTimeMillis();
         boolean var4 = false;
         if (VDTT_cw.v().dE > var2 && DataCenter.d().ai instanceof VDTT_cw) {
            if (this.m().c > 5) {
               return;
            }

            var1.a(0.3F, 0.0F);
         } else if (VDTT_cw.v().C().d == 15 && VDTT_cw.v().cr == 52) {
            var1.a(0.04F, 0.0F);
            var4 = true;
         }

         if (this.J <= 0) {
            if (this.p != null) {
               this.p.a(var1);
            } else if (this.o != null) {
               if (this.o.k == 408) {
                  if (this.m < 200 && DataCenter.d().i < 0) {
                     this.o.b(var1, DataCenter.d().n + 150, 0);
                     this.o.b(var1, DataCenter.d().n + 300, 0);
                  }

                  if (DataCenter.d().j < 0) {
                     this.o.b(var1, -100, 0);
                  } else {
                     this.o.b(var1, 0, 0);
                  }
               } else {
                  this.o.a(var1);
               }
            } else if (VDTT_cw.v().C().d == 15 && this.l == 394) {
               if (VDTT_cw.v().cr == 140) {
                  VDTT_dc.a(var1, 397, VDTT_jb.a(this.k), this.objX, this.objY, this.m().a, this.m().b, 33);
               } else if (VDTT_cw.v().cr >= 111) {
                  VDTT_dc.a(var1, 398, VDTT_jb.a(this.k), this.objX, this.objY, this.m().a, this.m().b, 33);
               } else if (VDTT_cw.v().cr >= 91) {
                  VDTT_dc.a(var1, 397, VDTT_jb.a(this.k), this.objX, this.objY, this.m().a, this.m().b, 33);
               } else if (VDTT_cw.v().cr >= 71) {
                  VDTT_dc.a(var1, 396, VDTT_jb.a(this.k), this.objX, this.objY, this.m().a, this.m().b, 33);
               } else if (VDTT_cw.v().cr >= 51) {
                  if (VDTT_cw.v().cr != 52) {
                     var1.c(-50.0F);
                  }

                  VDTT_dc.a(var1, 395, VDTT_jb.a(this.k), this.objX, this.objY, this.m().a, this.m().b, 33);
               } else if (VDTT_cw.v().cr >= 31) {
                  VDTT_dc.a(var1, 395, VDTT_jb.a(this.k), this.objX, this.objY, this.m().a, this.m().b, 33);
               } else {
                  VDTT_dc.a(var1, this.l, VDTT_jb.a(this.k), this.objX, this.objY, this.m().a, this.m().b, 33);
               }
            } else {
               int var5 = this.m().a;
               int var6 = this.m().b;
               int var7 = this.objX;
               short var8 = this.objY;
               if (this.I > 5 && this.l != 329) {
                  if (DataCenter.d().j < 0) {
                     var6 -= DataCenter.d().j;
                  }

                  if (DataCenter.d().i < 0 && VDTT_cw.v().ai != 9 && VDTT_cw.v().ai != 10 && VDTT_cw.v().ai != 13) {
                     var5 *= 2;
                     if (VDTT_cw.v().ai == 67) {
                        var7 -= 100;
                     }
                  }
               }

               if (this.I == 5 && DataCenter.d().i < 0) {
                  if (VDTT_cw.v().ai == 83) {
                     VDTT_dc.a(var1, this.l, -360, -var7, var8, var5, var6, 33);
                  } else if (VDTT_cw.v().ai != 56 && VDTT_cw.v().ai != 9 && VDTT_cw.v().ai != 10 && VDTT_cw.v().ai != 13 && (this.l == 240 || VDTT_cw.v().ai < 47 || VDTT_cw.v().ai > 50)) {
                     var5 = DataCenter.d().n * 2;
                     if (this.l == 240) {
                        var5 -= 246;
                     }

                     VDTT_dc.a(var1, this.l, VDTT_jb.a(this.k), var7 + DataCenter.d().i / 2, var8, var5, var6, 36);
                     return;
                  }
               }

               if (this.l == 11 && this.m < 800) {
                  VDTT_dc.a(var1, this.l, -360, var7, var8, var5, var6, 33);
               } else {
                  VDTT_dc.a(var1, this.l, VDTT_jb.a(this.k), var7, var8, var5, var6, 33);
               }

               if (VDTT_cw.v().ai >= 106 && VDTT_cw.v().ai <= 111) {
                  VDTT_dc.a(var1, this.l, -180, var7, var8 - var6, var5, var6, 33);
               }
            }

            if (VDTT_cw.v().dE > var2 || VDTT_cw.v().C().d == 15 && VDTT_cw.v().cr > 20 || var4) {
               var1.r();
            }

            DataCenter.o();
         }
      }
   }

   public final String f() {
      return null;
   }

   public final String g() {
      return null;
   }

   public final void b(Graphics var1) {
   }

   public final int e() {
      return this.I;
   }
}
