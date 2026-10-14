package core.mchien.main2;

import java.util.Vector;

public final class VDTT_lu extends VDTT_ar {
   private VDTT_ca a;
   private VDTT_ht b;
   private VDTT_ec c;

   public VDTT_lu(VDTT_p var1, VDTT_ec var2) {
      this.e = 2;
      this.I = var1;
      this.c = var2;
      this.K = false;
      this.a(240, 200);
      this.a = this.a(69, 5 + 85, 60, "", this, 2);
      int var4 = var2.b / var2.c;
      VDTT_ca var10000 = this.a;
      int var6 = ("" + var4).length();
      var10000.l = var6;
      boolean var7 = true;
      this.a.S = 1;
      this.a.T = var4;
      this.a.a("1");
      this.a(this.a);
      this.a(this.a.objX + 65, this.a.objY + 3, "", this, 1001, 58);
      this.a(this.a.objX + 86, this.a.objY + 3, "", this, 1002, 57);
      this.a(this.a.objX + 107, this.a.objY + 3, "", this, 1004, 59);
      VDTT_ba var5;
      (var5 = this.a(Caption.i, 1003)).b(-8);
      var5.f(var5.objX - 26, var5.objY);
      (var5 = this.a(Caption.D, -7)).b(-8);
      var5.f(var5.objX + 40, var5.objY);
      this.b = new VDTT_ht((byte)1, 9, 9, 30, 30, 30, 1, 1);
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
      VDTT_dg.b(VDTT_dg.d, var1, Caption.fY + ":", 64, 5 + 15, 1, -1, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.fZ + ":", 64, 5 + 35, 1, -1, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.rW, 64, 5 + 55, 1, -1, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.aO, 64, 5 + 75, 1, -1, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.rY, 64, 5 + 95, 1, -1, -16777216);
      VDTT_dg.d(VDTT_dg.d, var1, Caption.db, 64, 5 + 115, 1, -1, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, this.c.a, 69, 5 + 15, 0, -1, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(this.c.b) + Caption.fh + VDTT_jb.b(Caption.rZ, VDTT_jb.c(this.c.b / this.c.c)), 69, 5 + 35, 0, -1, -16777216);
      VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.rX, VDTT_jb.c(this.c.c)), 69, 5 + 55, 0, -1, -16777216);
      VDTT_dg.d(VDTT_dg.d, var1, VDTT_jb.c(VDTT_ek.m().an) + Caption.de, 69, 5 + 75, 0, -1, -16777216);
      VDTT_dg.d(VDTT_dg.d, var1, Caption.dc + VDTT_jb.c(this.a.h()) + Caption.de, 69, 5 + 115, 0, -1, -16777216);
      VDTT_dg.d(VDTT_dg.d, var1, Caption.dd + VDTT_jb.c((long)this.a.h() * (long)this.c.c * 98L / 100L) + Caption.fh, 69, 5 + 130, 0, -1, -16777216);
      VDTT_dg.d(VDTT_dg.d, var1, "- " + Caption.ho + " 2%", 69, 5 + 145, 0, -1, -16777216);
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
         this.a.a(this.a.h() - 1);
         if (this.a.h() < this.a.S) {
            this.a.a(this.a.S);
            return;
         }
         break;
      case 1002:
         this.a.a(this.a.h() + 1);
         return;
      case 1003:
         VDTT_lu var5 = this;

         try {
            Message var6;
            (var6 = Message.c((byte)-88)).a(var5.c.a);
            var6.c(var5.a.h());
            var6.l();
            break;
         } catch (Exception var4) {
            return;
         }
      case 1004:
         this.a.a(this.a.T);
      }

   }
}
