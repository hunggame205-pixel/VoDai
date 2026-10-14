package core.mchien.main2;

public final class VDTT_kr extends VDTT_am {
   private String[] c;
   public String a;
   public String b;

   public VDTT_kr() {
      this.b = Caption.h;
   }

   public final void a(String var1, VDTT_p var2) {
      var2.b((VDTT_m)var2.k);
      if (var2.c != null) {
         var2.c.b((VDTT_m)var2.c.k);
      }

      var2.e();
      this.e = 4;
      this.I = var2;
      this.a = var1;
      this.a(200, 140);
      this.f.clear();
      this.c = var1.split("\n");
      this.b(Caption.fG, 1001);
      this.c(Caption.fH, 1002);
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, this.b, (byte)2, this.K);
      this.a(var1, this.objX + 4, this.objY + this.f());

      for(int var2 = 0; var2 < this.c.length; ++var2) {
         VDTT_dg.a(var1, this.c[var2], (super.q - 8) / 2, this.h() / 2 - 6 + var2 * 12 - this.c.length * 6, 2, -1);
      }

   }

   public final void a_() {
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         this.k();
         VDTT_cm.K = VDTT_cm.L;
         DataCenter var10000 = DataCenter.d();
         VDTT_cf var4 = VDTT_cq.v();
         var10000.ai = var4;
         return;
      case 1002:
         this.k();
         VDTT_d.g();
         VDTT_d.i();
      default:
      }
   }
}
