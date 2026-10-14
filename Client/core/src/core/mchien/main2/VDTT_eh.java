package core.mchien.main2;

public final class VDTT_eh extends VDTT_bh {
   private byte R;
   private String S;
   private VDTT_ca T;

    public VDTT_eh(String var1, VDTT_p var2, int var3) {
        super(var1, var2, var3);
    }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, this.P, (byte)2, this.K);
      this.a(var1, 6, 33, this.q - 12, this.r - 48, -11, 55, 56);
      VDTT_v var10001 = this.N;
      int var10002 = this.q / 2;
      int var10003 = this.f() + 25;
      boolean var2 = true;
      int var5 = var10003;
      int var4 = var10002;
      VDTT_v var3 = var10001;
      if (var3 != null) {
         var1.a(var3, 0, 0, var3.c, var3.d, 0, (float)var4, (float)var5, 3);
      }

      this.a(var1, this.objX + 4, this.objY + this.f());
      VDTT_dg.d(VDTT_dg.d, var1, this.b, this.T.objX - 10, this.T.objY - 16, 1, -1, -16777216);
      VDTT_dg.d(VDTT_dg.d, var1, VDTT_jb.b(Caption.qQ, this.S), this.q / 2, this.T.objY + 4, 2, -2560, -16777216);
      VDTT_dg.d(VDTT_dg.d, var1, Caption.qP, this.q / 2, this.T.objY + 16, 2, -2560, -16777216);
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (var1.b == 190) {
         VDTT_eh var5 = this;

         try {
            String var7 = "";
            VDTT_ca var8;
            if ((var8 = var5.w()) != null) {
               var7 = var8.i();
               var8.a("");
            }

            Message var6;
            (var6 = Message.c(var5.R)).a(var7);
            var6.l();
            return;
         } catch (Exception var4) {
            VDTT_jb.a(var4);
         }
      }

   }
}
