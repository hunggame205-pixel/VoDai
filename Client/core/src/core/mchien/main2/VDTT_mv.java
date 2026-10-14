package core.mchien.main2;

import java.util.Vector;

public final class VDTT_mv extends VDTT_ar {
   private VDTT_bf a;
   private VDTT_bf b;
   private VDTT_ki c;

   public VDTT_mv(VDTT_p var1) {
      this.c = (VDTT_ki)var1.c;
      this.e = 2;
      this.I = var1;
      this.K = false;
      this.a(220, 110);
      this.a(Caption.bi, 100);
      short[] var4 = new short[24];
      String[] var2 = new String[24];

      short var3;
      for(var3 = 0; var3 < 24; var4[var3] = var3++) {
         var2[var3] = "" + var3;
      }

      this.a = this.a(24, 40, 50, 5, new VDTT_hp(100, var4, var2), this, 0);
      if (this.c.ai >= 0) {
         this.a.a(this.c.ai);
      }

      var4 = new short[12];
      var2 = new String[12];

      for(var3 = 0; var3 < 12; ++var3) {
         var4[var3] = (short)(var3 * 5);
         var2[var3] = "" + var4[var3];
      }

      this.b = this.a(114, 40, 50, 5, new VDTT_hp(101, var4, var2), this, 0);
      if (this.c.aj >= 0) {
         this.b.a(this.c.aj / 5);
      }

   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.va, 10, 20, 0, -1, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.vb, this.a.objX + this.a.q + 5, this.b.objY + 8, 0, -1, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.vc, this.b.objX + this.b.q + 5, this.b.objY + 8, 0, -1, -16777216);
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

      try {
         switch(var1.b) {
         case 100:
            VDTT_mv var6 = this;

            try {
               Message var7;
               (var7 = Message.c((byte)-9)).a(var6.a.n.b);
               var7.a(var6.b.n.b);
               var7.l();
            } catch (Exception var4) {
            }

            this.k();
         default:
         }
      } catch (Exception var5) {
      }
   }
}
