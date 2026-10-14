package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ce extends VDTT_an {
   private VDTT_hs m;
   public String[] l;

   public VDTT_ce(int var1, int var2, MainScreen var3, String var4) {
      this.a = var3;
      this.f(var1, var2);
      this.l = VDTT_dg.b(VDTT_dg.d, var4, 106);
      var1 = this.l.length > 8 ? 8 : this.l.length;
      this.d(120, (this.l.length > 8 ? 8 : this.l.length) * 13 + 10);
      this.m = new VDTT_hs((byte)1, 0, 5, this.q, var1 * 13, 13, this.l.length);
   }

   public final void b(Graphics var1) {
      var1.c(-3330239);
      this.a(var1, 0, 0, this.q, this.r, -12, 380, -12);
      var1.f();
      this.a(var1, this.m);

      for(int var2 = 0; var2 < this.l.length; ++var2) {
         VDTT_dg.d(VDTT_dg.d, var1, this.l[var2], 8, var2 * this.m.h + 5, 0, -3089954, 0);
      }

      this.a(var1);
   }

   public final void a_() {
      this.m.a();
   }

   public final Vector g() {
      return new Vector();
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
   }
}
