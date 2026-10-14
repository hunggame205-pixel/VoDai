package core.mchien.main2;

public final class VDTT_mf extends VDTT_ae {
   int a = 16;
   int b = 16;
   int c = 16;
   int d = 16;

   public final void a(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      var1.a(this.objX, this.objY);
      VDTT_aa.a(var1, -30, 0, this.c, this.d, this.q - this.c * 2, (int)(this.r - this.d * 2));
      VDTT_aa.a(var1, 108, 0, this.a, 0, this.q - this.a * 2, (int)this.b);
      VDTT_aa.a(var1, 108, 180, this.a, this.r - this.b, this.q - this.a * 2, (int)this.b);
      VDTT_aa.a(var1, 108, -90, 0, this.a, this.b, (int)(this.r - this.a * 2));
      VDTT_aa.a(var1, 108, 90, this.q - this.b, this.a, this.b, (int)(this.r - this.a * 2));
      VDTT_dc.a(var1, 106, 0, 0, 0, 20);
      VDTT_dc.a(var1, 107, -90, this.q, 0, 24);
      VDTT_dc.a(var1, 107, 0, 0, this.r, 36);
      VDTT_dc.a(var1, 106, 180, this.q, this.r, 40);
      this.a(var1, var2, var3);
   }
}
