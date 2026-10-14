package core.mchien.main2;

import java.util.Vector;

public final class VDTT_bx extends VDTT_m {
   public static VDTT_v l;
   private boolean m;

   public VDTT_bx(int var1, int var2, int var3, int var4, MainScreen var5) {
      this.f(var1, var2);
      this.d(110, 70);
      this.a = var5;
      this.m = false;
   }

   public final void b(Graphics var1) {
      try {
         this.a(var1, 0, 0, this.q, this.r, 46, 22, 23, 1, 1);
         if (!VDTT_cw.v().az.c()) {
            return;
         }

         if (VDTT_cw.v().bp != null && VDTT_cw.v().bp.b.size() != 0) {
            for(int var4 = 0; var4 < VDTT_cw.v().bp.b.size() && var4 < 6; ++var4) {
               VDTT_el var2 = (VDTT_el)VDTT_cw.v().bp.b.get(var4);
               VDTT_ek var3;
               if ((var3 = VDTT_cw.v().d(var2.a)) != null) {
                  var3.a(var1, 20, 71 + var4 * 11, 50, 4, false);
               }

               VDTT_aa.a(var1, var2.a(), 0, 3, 2 + var4 * 11, 60);
               if (var4 == 0) {
                  VDTT_dg.e(VDTT_dg.b, var1, "c#yellow" + var2.a, 20, 10 + var4 * 11, 0, -1, -10275328);
               } else {
                  VDTT_dg.e(VDTT_dg.b, var1, var2.a, 20, 10 + var4 * 11, 0, -1, -10275328);
               }
            }

            return;
         }

         VDTT_dg.e(VDTT_dg.c, var1, Caption.sz + " (0)", this.objX + 4, 6, 0, -6488, 0);
      } catch (Exception var5) {
      }

   }

   public final void a_() {
      if (VDTT_jb.a(this.objX, this.objY, this.objX + this.q, this.objY + this.r, DataCenter.d().aA.c, DataCenter.d().aA.d)) {
         DataCenter.d().aA.b = false;
      }

   }

   public final Vector g() {
      Vector var1 = new Vector();
      if (!VDTT_cw.v().az.c()) {
         return var1;
      } else {
         var1.addElement(new VDTT_hl(4000, 0, 0, this.q, this.r, (VDTT_hs)null, this));
         return var1;
      }
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      switch(var1.b) {
      case 4000:
         VDTT_ms.ad = 0;
         VDTT_cw.v().a((MainScreen)(new VDTT_ms(VDTT_cw.v())));
         VDTT_ac.b().o();
         VDTT_ac.b().w();
      default:
      }
   }

   public final void r() {
      super.r();
   }
}
