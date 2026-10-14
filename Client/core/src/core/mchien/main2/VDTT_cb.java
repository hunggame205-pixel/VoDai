package core.mchien.main2;

public final class VDTT_cb extends VDTT_ca {
   private byte X;
   private String Y = "";

   public VDTT_cb(int var1, int var2, int var3, String var4, MainScreen var5, int var6, int var7, int var8) {
      super(var1, var2, var3, var4, var5, 0, 2);
      this.l = 8;
      this.X = 0;
      this.O = new VDTT_hw((byte)0, 5, 2, this.q - 10 - 22, this.r - 4, this.q, 0);
   }

   public final void c() {
      super.c();
      this.Y = VDTT_jb.c(this.h());
   }

   public final void b(Graphics var1) {
      VDTT_aa.a(var1, 305, 0, 0, 2, this.q, (int)(this.r * 2 - 6));
      super.b(var1);
      if (!(this.a instanceof VDTT_x)) {
         this.a(var1, this.a.objX + this.objX, this.a.objY + this.objY);
         if (this.X == 2) {
            VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(this.h()) + " " + Caption.yP[0], 5, 29, 0, -2560, -16777216);
         } else if (this.X == 3) {
            VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(this.h()) + " " + Caption.yP[1], 5, 29, 0, -2560, -16777216);
         } else if (this.X == 0) {
            VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(this.h()) + " " + Caption.yP[2], 5, 29, 0, -3089954, -16777216);
         } else {
            if (this.X == 1) {
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(this.h()) + " " + Caption.yP[3], 5, 29, 0, -3089954, -16777216);
            }

         }
      }
   }
}
