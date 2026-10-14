package core.mchien.main2;

import java.util.Vector;

public final class VDTT_jt extends VDTT_ar {
   private VDTT_cb a;
   private VDTT_bf b;
   private int[] c = new int[]{10, 50, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

   public VDTT_jt(VDTT_p var1) {
      this.e = 2;
      this.I = var1;
      this.K = false;
      this.a(260, 200);
      String[] var4 = new String[this.c.length];

      for(int var2 = 0; var2 < var4.length; ++var2) {
         var4[var2] = this.c[var2] + " " + Caption.mW;
      }

      VDTT_hp var5 = new VDTT_hp(0, var4);
      this.a = new VDTT_cb(90, 25, 100, "", this, 0, 2, 0);
      byte var3 = 6;
      this.a.l = var3;
      boolean var6 = true;
      this.a.S = 1;
      int var7 = 999999;
      this.a.T = var7;
      this.a(this.a);
      this.b = this.a(90, 70, 100, 5, var5, this, 0);
      this.a(Caption.bi, 100);
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      VDTT_dg.d(VDTT_dg.d, var1, Caption.cV, 9, this.f() - 15, 0, -1, -16777216);
      VDTT_dg.d(VDTT_dg.d, var1, Caption.cW, 84, this.f() + 5, 1, -1, -16777216);
      VDTT_dg.d(VDTT_dg.d, var1, Caption.cX, 84, this.f() + 50, 1, -1, -16777216);
      VDTT_dg.d(VDTT_dg.d, var1, Caption.cY, 84, this.f() + 70, 1, -1, -16777216);
      VDTT_dg.d(VDTT_dg.d, var1, Caption.rV, 94, this.f() + 70, 0, -1, -16777216);
      VDTT_dg.d(VDTT_dg.d, var1, Caption.cZ, 84, this.f() + 90, 1, -1, -16777216);
      VDTT_dg.d(VDTT_dg.d, var1, VDTT_jb.c(VDTT_ek.m().ak) + Caption.fh, 94, this.f() + 90, 0, -1, -16777216);
      VDTT_dg.d(VDTT_dg.d, var1, Caption.db, 84, this.f() + 110, 1, -1, -16777216);
      VDTT_dg.d(VDTT_dg.d, var1, Caption.dc + VDTT_jb.c((long)this.a.h() * (long)this.c[this.b.n.b]) + Caption.fh, 94, this.f() + 110, 0, -1, -16777216);
      VDTT_dg.d(VDTT_dg.d, var1, Caption.dd + VDTT_jb.c(this.c[this.b.n.b]) + Caption.de, 94, this.f() + 125, 0, -1, -16777216);
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
      switch(var1.b) {
      case 100:
         VDTT_jt var5 = this;

         try {
            Message var6;
            (var6 = Message.c((byte)-89)).c(var5.a.h());
            var6.c(var5.b.n.b);
            var6.l();
            return;
         } catch (Exception var4) {
         }
      default:
      }
   }
}
