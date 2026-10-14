package core.mchien.main2;

public final class VDTT_kl extends VDTT_ar {
   private VDTT_ca a;
   private VDTT_ca b;
   private int c;
   private int d;
   private VDTT_bf N;
   private VDTT_hp O;
   private String[] P;
   private int[] Q;

   public VDTT_kl(VDTT_p var1, String[] var2, int[] var3) {
      this.I = var1;
      this.a(210, 190);
      this.Q = new int[var3.length + 1];
      this.P = new String[var2.length + 1];
      this.Q[0] = -1;
      this.P[0] = Caption.fi;

      for(int var4 = 0; var4 < var2.length; ++var4) {
         this.Q[var4 + 1] = var3[var4];
         this.P[var4 + 1] = Caption.fj + var2[var4];
      }

      this.c = 68;
      this.d = 35;
      this.O = new VDTT_hp(2000, this.P);
      this.N = this.a(66, 35, 130, this.O.c.length, this.O, this, 0);
      this.a = this.a(66, 60, 130, "", this, 0);
      this.b = this.b(66, 85, 130, "", this, 4);
      this.a.a("");
      this.b.a("");
      this.a(Caption.i, 1002);
   }

   public final void b(int var1, Object var2) {
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1002:
         try {
            Message var5;
            (var5 = Message.c((byte)-111)).b(this.Q[this.N.n.b]);
            var5.a(this.a.i());
            var5.a(this.b.i());
            var5.l();
            return;
         } catch (Exception var4) {
         }
      default:
      }
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.cB, (byte)2, true);
      VDTT_dg.a(VDTT_dg.d, var1, Caption.fk, 15, this.d + 10, 0, -1);
      VDTT_dg.a(VDTT_dg.d, var1, Caption.cC, 15, this.d + 35 + 20, 0, -1);
      if (this.N.n.b == 0) {
         VDTT_dg.a(VDTT_dg.d, var1, Caption.fl, 15, this.d + 35, 0, -1);
      } else {
         VDTT_dg.a(VDTT_dg.d, var1, Caption.zE[2], 15, this.d + 35, 0, -1);
      }
   }

   public final void a_() {
   }
}
