package core.mchien.main2;

import java.util.Vector;

public final class VDTT_bz extends VDTT_an {
   private VDTT_ba[] m = new VDTT_ba[1];
   private VDTT_hs[] n;
   private VDTT_hs I;
   public String[] l;

   public VDTT_bz(int var1, int var2, int var3, MainScreen var4, String var5) {
      this.a = var4;
      this.f(var1, var2);
      this.l = VDTT_dg.b(VDTT_dg.d, var5, var3 - 28);
      int var10000 = this.l.length > 10 ? 10 : this.l.length;
      var1 = var10000;
      if ((var2 = var10000 * 13 + 10) < 100) {
         var2 = 100;
      }

      this.d(var3, var2);
      this.m[0] = new VDTT_ba(var3 - 17, 3, 0, 0, "", var4, 2001, 52);
      this.n = a(this.m);
      this.I = new VDTT_hs((byte)1, 0, 5, var3, var1 * 13, 13, this.l.length);
   }

   public final void b(Graphics var1) {
      this.c(var1);
      int var2 = var1.e;
      int var3 = var1.f;
      this.a(var1, this.I);

      for(int var4 = 0; var4 < this.l.length; ++var4) {
         VDTT_dg.b(VDTT_dg.d, var1, this.l[var4], 8, var4 * this.I.h + 5, 0, -1, -16777216);
      }

      this.a(var1);
      this.a(var1, this.m, var2, var3);
      this.a(var1, var2, var3);
      this.I.a(var1, this, 0);
   }

   public final void a_() {
      this.I.a();
      a(this.m, this.n);
   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).addElement(this.n[0].a(this.m[0].m, this));
      var1.add(this.I.a(2000, this));
      var1.add(new VDTT_hl(2000, 0, 0, this.q, this.r, this.I, this));
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      switch(var1.b) {
      case 2000:
         return;
      case 2001:
         this.a.b((VDTT_m)this);
      default:
      }
   }
}
