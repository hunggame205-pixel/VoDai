package core.mchien.main2;

public final class VDTT_jy extends VDTT_ar {
   private VDTT_ca c;
   private VDTT_ca d;
   private VDTT_ca N;
   private int O;
   private int P;
   public String a;
   public String b;
   private static VDTT_jy Q;

   public VDTT_jy(VDTT_p var1) {
      this.I = var1;
      Q = this;
      this.a(210, 147);
      this.O = 68;
      this.P = 35;
      this.c = this.a(74, 34, 124, "", this, 0);
      byte var2 = 16;
      this.c.l = var2;
      this.d = this.a(74, 60, 124, "", this, 1);
      this.N = this.a(74, 86, 124, "", this, 1);
      this.a(Caption.i, 1002);
   }

   public static VDTT_jy w() {
      return Q;
   }

   public final void b(int var1, Object var2) {
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1002:
         this.I.i();
         VDTT_jy var8 = this;
         this.I.i();
         this.a = this.c.i();
         this.b = this.N.i();
         VDTT_cq.z();
         Message var9 = null;

         try {
            VDTT_no.d = var8.x();
            (var9 = var8.x()).l();
            return;
         } catch (Exception var6) {
            VDTT_jb.a(var6);
         } finally {
            if (var9 != null) {
               var9.b();
            }

         }

         return;
      default:
      }
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.aA, (byte)2, true);
      VDTT_dg.a(VDTT_dg.d, var1, Caption.yf[0], 15, this.P + 10, 0, -1);
      VDTT_dg.a(VDTT_dg.d, var1, Caption.aB, 15, this.P + 25 + 10, 0, -1);
      VDTT_dg.a(VDTT_dg.d, var1, Caption.aC, 15, this.P + 50 + 10, 0, -1);
   }

   public final void a_() {
   }

   private Message x() {
      Message var1 = null;

      try {
         (var1 = Message.c((byte)-124)).a(this.a);
         var1.a(this.d.i());
         var1.a(this.b);
         var1.c(DataCenter.d().u);
         var1.c(DataCenter.d().v);
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }

      return var1;
   }
}
