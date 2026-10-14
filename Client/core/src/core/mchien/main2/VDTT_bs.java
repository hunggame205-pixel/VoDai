package core.mchien.main2;

import java.util.Vector;

public final class VDTT_bs extends VDTT_an {
   private VDTT_hs n;
   private VDTT_iu[] I;
   public int l;
   public int m;
   private long J;

   public VDTT_bs(int var1, int var2, MainScreen var3, VDTT_gk var4) {
      this.a = var3;
      this.f(var1, var2);
      this.J = VDTT_jb.a();
      this.a(var4);

      try {
         Message var6;
         (var6 = new Message((byte)13)).b(var4.b);
         var6.l();
      } catch (Exception var5) {
         VDTT_jb.a(var5);
      }
   }

   public final void a(VDTT_gk var1) {
      Vector var2;
      (var2 = new Vector()).addElement("c#yellow" + var1.p().k);
      var2.addElement("c#white" + Caption.ck + ": " + VDTT_jb.c(this.m / 10));
      var2.addElement("c#white" + Caption.yy[0] + ": " + VDTT_jb.c(this.l));
      this.d(116, 50);
      Vector var6 = new Vector();

      int var4;
      for(var4 = 0; var4 < var2.size(); ++var4) {
         String var3 = String.valueOf(var2.elementAt(var4));
         int var5;
         Vector var7;
         if (var4 == 0) {
            var7 = VDTT_dg.a(VDTT_dg.e, var3, this.q - 10);

            for(var5 = 0; var5 < var7.size(); ++var5) {
               var6.add(new VDTT_iu(0, (String)var7.elementAt(var5)));
            }
         } else {
            var7 = VDTT_dg.a(VDTT_dg.d, var3, this.q - 10);

            for(var5 = 0; var5 < var7.size(); ++var5) {
               var6.add(new VDTT_iu(1, (String)var7.elementAt(var5)));
            }
         }
      }

      this.I = new VDTT_iu[var6.size()];

      for(var4 = 0; var4 < var6.size(); ++var4) {
         this.I[var4] = (VDTT_iu)var6.elementAt(var4);
      }

      this.n = new VDTT_hs((byte)1, 0, 5, this.q, this.r - 10, 13, this.I.length);
   }

   public final void b(Graphics var1) {
      this.e(var1);
      this.a(var1, this.n);

      for(int var2 = 0; var2 < this.I.length; ++var2) {
         if (this.I[var2].a == 0) {
            VDTT_dg.d(VDTT_dg.e, var1, this.I[var2].b, 6, 5 + var2 * this.n.h, 0, -1, -16777216);
         } else {
            VDTT_dg.d(VDTT_dg.d, var1, this.I[var2].b, 6, 5 + var2 * this.n.h, 0, -1, -16777216);
         }
      }

      this.a(var1);
   }

   public final void a_() {
      this.n.a();
      if (VDTT_jb.a() - this.J >= 5000L) {
         this.a.b((VDTT_m)this);
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).addElement(new VDTT_hl(1001, this.n.objX, this.n.objY, this.n.objX + this.n.q, this.n.objY + this.n.r, this.n, this));
      var1.addElement(new VDTT_hl(1002, this.n.objX, this.n.objY - 5, this.n.objX + this.n.q, this.n.objY + this.n.r + 5, this.n, this));
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      this.J = VDTT_jb.a();
   }
}
