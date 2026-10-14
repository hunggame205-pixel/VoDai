package core.mchien.main2;

public abstract class VDTT_ar extends VDTT_am {
   public VDTT_ar() {
      this.e = 1;
   }

   public final void e(Graphics var1) {
      this.a(var1, 0, 0, this.q, this.r, 61, 22, 23, 1, 1);
   }

   public void d() {
      super.d();
      if ((this instanceof VDTT_jr || this instanceof VDTT_kd || this instanceof MenuConfig || this instanceof VDTT_ki || this instanceof VDTT_mr || this instanceof VDTT_mx || this instanceof VDTT_ly || this instanceof VDTT_ji || this instanceof VDTT_mb) && !this.L) {
         VDTT_ac.b().w();

         try {
            VDTT_il var1;
            if ((var1 = VDTT_cw.v().T()) != null && var1.a == 43 && (VDTT_cw.v().br == 1 && this instanceof VDTT_kb || VDTT_cw.v().br == 3 && VDTT_cw.v().bs == 0 && this instanceof MenuConfig || VDTT_cw.v().br == 5 && (VDTT_cw.v().bs == 0 && (this instanceof VDTT_ji || this instanceof VDTT_jh) || VDTT_cw.v().bs == 3 && this instanceof VDTT_kb))) {
               VDTT_cw.v();
               VDTT_cw.o(92);
            }

            return;
         } catch (Exception var2) {
         }
      }

   }

   public final void c() {
      super.c();
      if (this.o.a[24]) {
         VDTT_cw.v();
         VDTT_cw.N();
      }

   }

   protected final void y() {
      if (this.M != null) {
         int var10001 = this.objX + this.M.objX + 5;
         int var10002 = this.objY + this.M.objY;
         DataCenter.d().aA.b(var10001, var10002 + 5);
      }

   }
}
