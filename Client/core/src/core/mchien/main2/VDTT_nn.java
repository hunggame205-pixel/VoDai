package core.mchien.main2;

import java.util.Vector;

public final class VDTT_nn extends VDTT_ar {
   public int a;
   public int b;
   public int c;
   public long d;
   public String N;
   public MainScreen O;

   public VDTT_nn(VDTT_p var1, int var2, String var3, int var4) {
      this.I = var1;
      this.N = var3;
      this.c = var4;
      this.O = this.I.c;
      this.d(160, 14);
      this.f(DataCenter.d().n / 2 - 75, DataCenter.d().o - 30);
      this.K = false;
      this.b = var2;
      this.d = VDTT_jb.a();
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY);
      int var2 = this.a * 100 / this.b;
      int var3 = this.q - 2;
      int var4 = this.r - 2;
      int var5 = var2 * var3 / 100;
      var1.f(-16777216);
      var1.c(1, 1, var3 + 2, var4 + 2);
      var1.c(-16711681);
      this.a(var1, 0, 0, var3 + 4, var4 + 4, -3, 3, 4, 1, 1);
      var1.f();
      VDTT_aa.a(var1, 93, 0, 2, 2, var5, (int)var4);
      VDTT_dg.b(VDTT_dg.b, var1, this.N + ": " + var2 + "%", this.q / 2, this.r / 2, 2, -6488, -10275328);
   }

   public final void a_() {
      this.a = (int)(VDTT_jb.a() - this.d);
      if (this.a > this.b) {
         this.a = this.b;
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).add(new VDTT_hl(1000, -this.objX, -this.objY, DataCenter.d().n - this.objX, DataCenter.d().o - this.objY, (VDTT_hs)null, this));
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);

      try {
         MenuConfig.K().a(false);
         (new Message((byte)7)).l();
      } catch (Exception var4) {
      }
   }
}
