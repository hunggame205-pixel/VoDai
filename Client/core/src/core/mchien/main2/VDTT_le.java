package core.mchien.main2;

import java.util.Vector;

public final class VDTT_le extends VDTT_ar {
   private VDTT_ca b;
   private String[] c;
   public int a;

   public VDTT_le(VDTT_p var1, String var2, int var3, int var4) {
      this.e = 2;
      this.I = var1;
      this.K = false;
      this.a(180, 120);
      this.b = this.a(20, 52, 120, "", this, 0, var3);
      this.a(this.b);
      this.c = VDTT_dg.b(VDTT_dg.d, var2, this.q - 20);
      this.a(Caption.bi, var4);
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);

      for(int var2 = 0; var2 < this.c.length; ++var2) {
         VDTT_dg.d(VDTT_dg.d, var1, this.c[var2], (super.q - 8) / 2, this.h() / 2 + var2 * 12 - this.c.length * 6, 2, -1, -16777216);
      }

   }

   public final void a_() {
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(new VDTT_hl(0, 0, 0, this.q, this.r, this.J, this));
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      VDTT_le var8;
      Message var9;
      switch(var1.b) {
      case 100:
         var8 = this;

         try {
            (var9 = new Message((byte)-93)).a(var8.b.i());
            var9.l();
            var8.k();
            break;
         } catch (Exception var6) {
            return;
         }
      case 101:
         var8 = this;

         try {
            (var9 = new Message((byte)-92)).c(var8.b.h());
            var9.l();
            var8.k();
            break;
         } catch (Exception var5) {
            return;
         }
      case 102:
         var8 = this;

         try {
            (var9 = Message.c((byte)-92)).a(var8.b.i());
            var9.l();
            var8.k();
            break;
         } catch (Exception var4) {
            return;
         }
      case 300:
         var8 = this;

         try {
            (var9 = new Message((byte)-33)).a(var8.b.i());
            var9.b(var8.a);
            var9.l();
            return;
         } catch (Exception var7) {
         }
      }

   }
}
