package core.mchien.main2;

import java.util.Vector;

public final class VDTT_no extends VDTT_am {
   public int a;
   public int b;
   public long c;
   public static Message d;
   private VDTT_ev N;
   private boolean O;

   public VDTT_no(VDTT_p var1) {
      var1.b((VDTT_m)var1.k);
      if (var1.c != null) {
         var1.c.b((VDTT_m)var1.c.k);
      }

      this.e = 4;
      this.I = var1;
      this.a(200, 20);
      this.f(this.objX, DataCenter.d().o - 30);
      this.j();
      this.a = 0;
      this.c = VDTT_jb.a();
      this.N = new VDTT_ev(19, DataCenter.d().n / 2, DataCenter.d().o / 2, -1);
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      if (VDTT_jb.a() - this.c > 2500L) {
         if (!this.O) {
            this.b += 8;
            if (this.b == 360) {
               this.O = true;
            }
         } else {
            this.b -= 16;
            if (this.b == 40) {
               this.O = false;
            }
         }

         var1.o();
         var1.d(70);
         var1.f(0);
         var1.c(0, 0, DataCenter.d().n, DataCenter.d().o);
         boolean var3 = true;
         var1.j = var3;
         VDTT_dc.a(var1, 459, this.b, DataCenter.d().n / 2, DataCenter.d().o / 2, 3);
         var3 = false;
         var1.j = var3;
         VDTT_dg.a(VDTT_dg.b, var1, Caption.jA, DataCenter.d().n / 2, DataCenter.d().o / 2, 2, -48128, 2, 1, 2, 1);
         var1.l = 1.0F;
      }

   }

   public final void a_() {
      if (VDTT_jb.a() - this.c > 15000L) {
         this.I.h();
      }
   }

   public final Vector g() {
      return new Vector();
   }
}
