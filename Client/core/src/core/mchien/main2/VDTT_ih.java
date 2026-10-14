package core.mchien.main2;

public final class VDTT_ih {
   public VDTT_ek a;
   public VDTT_n b;
   public VDTT_ic c;

   public final boolean a() {
      VDTT_ek var10000;
      if (VDTT_jb.b(this.a.objX, this.a.objY, this.b.objX, this.b.objY) <= 50) {
         this.a.j();
         this.a.e = 3;
         this.a.a((XYEntity)this.b);
         var10000 = this.a;
         VDTT_ii var3 = new VDTT_ii(this.c, this.a, this.b);
         var10000.aV = var3;
         this.a.ax = -1;
         return false;
      } else {
         this.a.e = 2;
         if (this.a.ae == null) {
            var10000 = this.a;
            VDTT_gm var2 = new VDTT_gm(this.b.objX, this.b.objY, 1);
            var10000.ae = var2;
         }

         this.a.ae.objX = this.b.objX;
         this.a.ae.objY = this.b.objY;
         VDTT_jb.b(this.a.objX, this.b.objX);
         VDTT_jb.b(this.a.objY, this.b.objY);
         return true;
      }
   }
}
