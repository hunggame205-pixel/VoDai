package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ml extends VDTT_ar {
   private VDTT_ca a;
   private Item b;

   public VDTT_ml(VDTT_p var1, Item var2) {
      this.e = 2;
      this.I = var1;
      this.b = var2;
      this.K = false;
      this.a(190, 120);
      this.a = this.a(54, 5 + 38, 60, "", this, 2);
      boolean var3 = true;
      this.a.S = 1;
      this.a.a("1");
      VDTT_ca var10000 = this.a;
      int var5 = var2.M() - 1;
      var10000.T = var5;
      this.a(this.a);
      this.a(119, 5 + 41, "", this, 1001, 58);
      this.a(140, 5 + 41, "", this, 1002, 57);
      this.a(161, 5 + 41, "", this, 1003, 59);
      VDTT_ba var4;
      (var4 = this.a(Caption.i, 1004)).b(-8);
      var4.f(var4.objX - 27, var4.objY);
      (var4 = this.a(Caption.D, -7)).b(-8);
      var4.f(var4.objX + 40, var4.objY);
   }

   public final void a(int var1, Object var2) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final int f() {
      return 5;
   }

   public final void b(Graphics var1) {
      this.e(var1);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.jI, 9, 5 + 15, 0, -1, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.aM, 9, 5 + 50, 0, -10831436, -16777216);
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
      case 1001:
         int var6;
         if ((var6 = this.a.h() - 1) <= 0) {
            var6 = 1;
         }

         this.a.a(var6);
         return;
      case 1002:
         this.a.a(this.a.h() + 1);
         return;
      case 1003:
         this.a.a(this.a.T);
         return;
      case 1004:
         this.k();
         VDTT_ml var5 = this;

         try {
            Message var7;
            (var7 = new Message((byte)118)).b(var5.b.f);
            var7.c(var5.a.h());
            var7.l();
            return;
         } catch (Exception var4) {
            VDTT_jb.a(var4);
         }
      default:
      }
   }
}
