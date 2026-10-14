package core.mchien.main2;

public final class VDTT_bt extends VDTT_ev {
   private final float K = 0.7F;
   private final float L = 1.0F;
   private float M = 0.7F;
   private int N;
   private boolean O = false;
   private VDTT_v P;
   private VDTT_v Q;
   private static VDTT_bt R;

   private VDTT_bt() {
      super(0, 0, 0);
   }

   public static VDTT_bt m() {
      if (R == null) {
         R = new VDTT_bt();
      }

      return R;
   }

   public final VDTT_bt b(int var1, int var2) {
      this.f(var1, var2);
      this.l = 3;
      return R;
   }

   public final void a(Graphics var1) {
      if (!this.q()) {
         this.Q = VDTT_dc.c(856);
         this.P = VDTT_dc.c(855);
         if (this.Q != null && this.P != null) {
            if (this.I != 0) {
               var1.c((float)this.I);
               this.N = 0;
               this.n();
            }

            var1.a(this.P, 0, 0, this.P.c, this.P.d, 0, (float)(this.objX - 3), (float)(this.objY - 3), (float)(6 * DataCenter.d().r), (float)(6 * DataCenter.d().r), 0);
            boolean var3 = true;
            var1.j = var3;
            var1.a(this.Q, 0, 0, this.Q.c, this.Q.d, this.N, (float)(this.objX - (int)(28.0F * this.M)), (float)(this.objY - (int)(28.0F * this.M)), (float)((int)(56.0F * this.M * (float)DataCenter.d().r)), (float)((int)(56.0F * this.M * (float)DataCenter.d().r)), 0.0F, 0.0F, 0);
            var3 = false;
            var1.j = var3;
            if (this.I != 0) {
               var1.r();
            }
         }

      }
   }

   public final void n() {
      if (!this.q()) {
         this.N += 15;
         if (this.N > 360) {
            this.N = 0;
         }

         if (this.O && this.M <= 0.7F || !this.O && this.M >= 1.0F) {
            --this.l;
            this.O = !this.O;
         }

         if (!this.O) {
            this.M = (float)((double)this.M + 0.03D);
         } else {
            this.M = (float)((double)this.M - 0.03D);
         }
      }
   }
}
