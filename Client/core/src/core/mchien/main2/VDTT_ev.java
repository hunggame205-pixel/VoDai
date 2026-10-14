package core.mchien.main2;

public class VDTT_ev extends VDTT_n {
   public short k;
   protected byte l = -1;
   protected byte m = -1;
   protected byte n = 0;
   public boolean o;
   public boolean p;
   public int I;
   public int J = 100;

   public final VDTT_ev o() {
      VDTT_ev var1;
      (var1 = new VDTT_ev(this.k, this.objX, this.objY, this.l)).n = this.n;
      var1.o = this.o;
      var1.m = this.m;
      var1.I = this.I;
      return var1;
   }

   public final VDTT_ew p() {
      return DataCenter.d().C != null && this.k < DataCenter.d().C.length ? DataCenter.d().C[this.k] : null;
   }

   public VDTT_ev(int var1, int var2, int var3) {
      this.l = 1;
      this.k = (short)var1;
      this.f(var2, var3);
      this.s();
   }

   public VDTT_ev(int var1, int var2, int var3, int var4) {
      this.l = (byte)var4;
      this.k = (short)var1;
      this.f(var2, var3);
      this.s();
   }

   public int a() {
      return this.objX - this.q / 2;
   }

   public int b() {
      return this.objX + this.q / 2;
   }

   public int c() {
      return this.objY - this.r / 2;
   }

   public int d() {
      return this.objY + this.r / 2;
   }

   public boolean q() {
      return this.l == 0;
   }

   public void n() {
      this.n = (byte)(this.n + 30);
      if (this.n >= 90) {
         this.n = 0;
      }

      ++this.m;
      if (this.p() != null && this.m >= this.p().b.length) {
         this.m = 0;
         if (this.l > 0) {
            --this.l;
         }
      }

   }

   public void a(Graphics var1) {
      if (!this.r() || !(VDTT_cw.v().c instanceof VDTT_ky) || ((VDTT_ky)VDTT_cw.v().c).a.m()) {
         this.b(var1, 0, 0);
         VDTT_v var2;
         if (this.k == 560) {
            if ((var2 = VDTT_dc.e(406)) != null) {
               var1.a(var2, 0, 0, 6 * DataCenter.d().r, 14 * DataCenter.d().r, (int)(System.currentTimeMillis() / 100L % 360L), (float)(this.objX - 4 + 1), (float)(this.objY - 7 + 4), (float)(6 * DataCenter.d().r), (float)(14 * DataCenter.d().r), (float)(3 * DataCenter.d().r), (float)(3 * DataCenter.d().r), 0);
            }

         } else {
            if (this.k == 566 && (var2 = VDTT_dc.e(999)) != null) {
               var1.a(var2, 0, 0, 4 * DataCenter.d().r, 7 * DataCenter.d().r, (int)(System.currentTimeMillis() / 10L % 360L), (float)(this.objX - 2), (float)(this.objY - 3 + 1), (float)(4 * DataCenter.d().r), (float)(7 * DataCenter.d().r), (float)(2 * DataCenter.d().r), (float)(2 * DataCenter.d().r), 0);
            }

         }
      }
   }

   public final void b(Graphics var1, int var2, int var3) {
      try {
         if (!VDTT_eq.a().a(11) || this.k == VDTT_cw.v().bm.k) {
            if (!this.q() && this.p() != null && this.m >= 0 && this.m < this.p().b.length) {
               boolean var5 = true;
               var1.j = var5;
               short var4 = 0;
               if (this.k == 464 || this.k == 465) {
                  var1.c(179.0F);
               }

               if (this.k == 473 || this.k == 488 || this.k == 489 || this.k == 508 || this.k == 504) {
                  var4 = 300;
               }

               short var8;
               if ((var8 = this.p().b[this.m].a) > 0 && VDTT_dc.d(var8).equals(VDTT_dc.a)) {
                  this.s();
               }

               if (this.k == 167) {
                  VDTT_dc.a(var1, var8, 0, var2 + this.objX, var2 + this.objY, this.J, Graphics.s(), 33);
               } else {
                  short[] var7;
                  if (this.I != 0) {
                     var1.c((float)this.I);
                     if (this.o) {
                        var7 = VDTT_dc.b(var1, var8, VDTT_jb.a(this.o != this.p().b[this.m].e, this.p().b[this.m].b), var2 + this.objX - this.p().b[this.m].c, var3 + this.objY + this.p().b[this.m].d + var4, 3);
                     } else {
                        var7 = VDTT_dc.b(var1, var8, VDTT_jb.a(this.o != this.p().b[this.m].e, this.p().b[this.m].b), var2 + this.objX + this.p().b[this.m].c, var3 + this.objY + this.p().b[this.m].d + var4, 3);
                     }

                     var1.r();
                  } else if (this.o) {
                     var7 = VDTT_dc.b(var1, var8, VDTT_jb.a(this.o != this.p().b[this.m].e, this.p().b[this.m].b), var2 + this.objX - this.p().b[this.m].c, var3 + this.objY + this.p().b[this.m].d + var4, 3);
                  } else {
                     var7 = VDTT_dc.b(var1, var8, VDTT_jb.a(this.o != this.p().b[this.m].e, this.p().b[this.m].b), var2 + this.objX + this.p().b[this.m].c, var3 + this.objY + this.p().b[this.m].d + var4, 3);
                  }

                  if (this.k == 464 || this.k == 465) {
                     var1.r();
                  }

                  var5 = false;
                  var1.j = var5;
                  this.q = var7[0];
                  this.r = var7[1];
               }
            }
         }
      } catch (Exception var6) {
         VDTT_jb.a(var6);
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
      return this.p ? 3 : this.p().a;
   }

   public final boolean r() {
      return this.k == 441 || this.k == 591 || this.k == 592 || this.k == 619 || this.k == 621;
   }

   public final void s() {
      try {
         for(int var1 = 0; var1 < this.p().b.length; ++var1) {
            if (this.p().b[var1].a > 0) {
               VDTT_dc.d(this.p().b[var1].a);
            }
         }

      } catch (Exception var2) {
      }
   }

   // $FF: synthetic method
   public final XYEntity u() {
      return this.o();
   }

   // $FF: synthetic method
   public Object clone() {
      return this.o();
   }
}
