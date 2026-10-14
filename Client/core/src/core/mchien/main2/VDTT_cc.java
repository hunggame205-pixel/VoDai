package core.mchien.main2;

import java.util.Vector;

public final class VDTT_cc extends VDTT_an {
   private VDTT_hs l;
   private VDTT_hs m;
   private Vector n;
   private VDTT_ba I;
   private String J;

   public VDTT_cc(int var1, int var2, MainScreen var3, String var4, String var5) {
      this.J = var5;
      this.d(240, 155);
      this.f(DataCenter.d().n / 2 - this.q / 2 - var3.objX, DataCenter.d().o / 2 - this.r / 2 - var3.objY);
      this.a = var3;
      this.I = new VDTT_ba(this.q - 19, 5, 0, 0, "", var3, 1001, 52);
      this.n = new Vector();
      this.l = new VDTT_hs((byte)1, 5, 30, this.q - 10, 120, 12, this.n.size());
      this.m = new VDTT_hs((byte)1, this.I.objX, this.I.objY, this.I.q, this.I.r, this.I.r, 1);
      (new Thread(new VDTT_cd(this, var4))).start();
   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).addElement(new VDTT_hl(1000, this.l.objX, this.l.objY, this.l.objX + this.l.q, this.l.objY + this.l.r, this.l, this));
      var1.addElement(new VDTT_hl(1001, this.m.objX, this.m.objY, this.m.objX + this.m.q, this.m.objY + this.m.r, this.m, this));
      var1.addElement(new VDTT_hl(1000, 0, 0, this.q, this.r, (VDTT_hs)null, this));
      return var1;
   }

   public final void b(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      this.c(var1);
      var1.f(16577687);
      var1.a(3, 25, this.q - 3, 1);
      VDTT_dg.b(VDTT_dg.f, var1, this.J, this.q / 2, 13, 2, -2560, -16777216);
      this.a(var1, this.l);

      for(int var4 = 0; var4 < this.n.size(); ++var4) {
         if (this.l.b(var4)) {
            VDTT_dg.a(VDTT_dg.d, var1, this.n.elementAt(var4).toString(), 5, 6 + var4 * 12, 0, -1);
         }
      }

      this.a(var1);
      this.a(var1, var2, var3);
      var1.a(this.I.objX, this.I.objY);
      this.I.b(var1);
      this.a(var1, var2, var3);
   }

   public final void a_() {
      this.l.a();
      this.m.a();
      if (this.m.l != -1) {
         this.I.N = true;
      } else {
         this.I.N = false;
      }
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      switch(var1.b) {
      case 1000:
         return;
      case 1001:
         this.a.b((VDTT_m)this);
      default:
      }
   }

   // $FF: synthetic method
   static Vector a(VDTT_cc var0) {
      return var0.n;
   }

   // $FF: synthetic method
   static VDTT_hs a(VDTT_cc var0, VDTT_hs var1) {
      return var0.l = var1;
   }

   // $FF: synthetic method
   static VDTT_hs b(VDTT_cc var0, VDTT_hs var1) {
      return var0.m = var1;
   }

   // $FF: synthetic method
   static VDTT_ba b(VDTT_cc var0) {
      return var0.I;
   }
}
