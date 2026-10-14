package core.mchien.main2;

public final class VDTT_ib extends VDTT_n {
   public boolean k;
   public boolean l;
   private VDTT_n m;

   public VDTT_ib(boolean var1, int var2, int var3, VDTT_n var4) {
      this.f(var2, var3);
      this.k = var1;
      this.m = var4;
   }

   public final int a() {
      return 0;
   }

   public final int b() {
      return 0;
   }

   public final int c() {
      return 0;
   }

   public final int d() {
      return 0;
   }

   public final void a(Graphics var1) {
      if (!VDTT_jb.e() && (VDTT_cw.v().ai != 67 || this.objY >= 300)) {
         VDTT_ek var2;
         if (!(this.m instanceof VDTT_ek) || ((var2 = (VDTT_ek)this.m).p() || !var2.V) && !var2.ab() && !var2.af()) {
            XYEntity var5;
            if (!this.l && (var5 = VDTT_ek.b(this.objX, this.objY)) != null) {
               this.objY = var5.objY;
            }

            var1.d((int)((1.0F - ((float)this.objY - (float)this.m.objY) / 120.0F) * 100.0F));
            int var6 = VDTT_hc.a;
            int var3 = VDTT_hc.b;
            if (this.m instanceof VDTT_gx) {
               VDTT_gx var4;
               if ((var4 = (VDTT_gx)this.m).o()) {
                  return;
               }

               var6 = var4.m().g;
               var3 = var4.m().h;
               if (var4.k == 48) {
                  return;
               }
            } else if (this.m instanceof VDTT_gk) {
               VDTT_gk var7;
               var6 = (var7 = (VDTT_gk)this.m).p().j;
               var3 = var7.p().g;
            } else if (this.m instanceof VDTT_ek) {
               VDTT_ek var8;
               if ((var8 = (VDTT_ek)this.m).ah()) {
                  return;
               }

               if (var8.bv != null) {
                  var6 = 207;
                  var3 = 79;
               } else if (var8.ae()) {
                  var6 = 208;
                  var3 = 92;
               }
            }

            VDTT_aa.a(var1, var6, 0, this.objX, this.objY + 0, var3, Graphics.s(), 3);
            var1.l = 1.0F;
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
      return 4;
   }
}
