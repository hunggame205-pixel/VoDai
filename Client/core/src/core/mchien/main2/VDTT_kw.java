package core.mchien.main2;

import java.util.Vector;

public final class VDTT_kw extends VDTT_ar {
   private VDTT_hs a;
   private Vector b = new Vector();
   private VDTT_ba c;
   private VDTT_ba d;
   private VDTT_ba[] N;
   private VDTT_hs[] O;

   public VDTT_kw(VDTT_p var1, Message var2) {
      this.e = 1;
      this.I = var1;
      this.K = false;
      this.a(316);
      this.c = this.a(4 + (super.q - 8) - 137, this.f() + this.h() - 25, Caption.fT, this, 100, 15);
      this.c.d(64, this.c.r);
      this.d = this.a(4 + (super.q - 8) - 69, this.f() + this.h() - 25, Caption.fV, this, 102, 15);
      this.d.d(64, this.d.r);
      this.a(var2);
   }

   public final void a(Message var1) {
      try {
         this.b.clear();
         boolean var2 = var1.c();
         this.c.c = var2;
         this.d.c = !var2;
         byte var7 = var1.readByte();

         for(int var3 = 0; var3 < var7; ++var3) {
            VDTT_ec var4;
            (var4 = new VDTT_ec()).a = var1.b.c();
            var4.b = var1.i();
            var4.c = var1.i();
            var4.d = var1.i();
            this.b.add(var4);
         }
      } catch (Exception var6) {
      }

      this.a = new VDTT_hs((byte)1, 4, this.f() + 34, super.q - 8, 144, 24, this.b.size());
      this.N = new VDTT_ba[this.b.size()];
      this.O = new VDTT_hs[this.b.size()];

      for(int var8 = 0; var8 < this.N.length; ++var8) {
         this.N[var8] = new VDTT_ba(this.q - 46, var8 * 24, 0, 0, "", this, 1000, -5);
         this.N[var8].d(26, 20);
         this.O[var8] = new VDTT_hx((byte)1, 0, 0, this.N[var8].q, this.N[var8].r, this.N[var8].r, 1, this.a);
      }

   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.fW, (byte)2, this.K);
      this.a(var1, 12, 37, this.a.q - 16, 21, -11, 22, 23, 1, 1);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.fX, 29, this.f() + 17, 2, -10831436, -16777216);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.fY, 79, this.f() + 17, 2, -10831436, -16777216);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.fZ, 159, this.f() + 17, 2, -10831436, -16777216);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.ga, 234, this.f() + 17, 2, -10831436, -16777216);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.aL, 286, this.f() + 17, 2, -10831436, -16777216);
      this.a(var1, this.a);

      for(int var2 = 0; var2 < this.b.size(); ++var2) {
         VDTT_ec var3 = (VDTT_ec)this.b.get(var2);
         int var4 = 10 + var2 * 24;
         VDTT_dg.d(VDTT_dg.d, var1, "" + (var2 + 1), 24, var4, 2, -1, -16777216);
         VDTT_dg.d(VDTT_dg.d, var1, var3.a, 74, var4, 2, -1, -16777216);
         VDTT_dg.d(VDTT_dg.d, var1, VDTT_jb.c(var3.b), 154, var4, 2, -1, -16777216);
         VDTT_dg.d(VDTT_dg.d, var1, VDTT_jb.c(var3.c) + Caption.fh, 229, var4, 2, -1, -16777216);
         int var5 = var1.e;
         var4 = var1.f;
         if (this.N != null && this.N.length > 0) {
            this.a(var1, var5 + this.N[var2].objX, var4 + this.N[var2].objY);
            this.N[var2].b(var1);
            this.a(var1, var5, var4);
         }
      }

      this.a(var1);
      this.a.b(var1, this);
   }

   public final void a_() {
      this.a.a();
      VDTT_hs[] var2 = this.O;
      VDTT_ba[] var1 = this.N;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         if (var1[var3] != null) {
            var2[var3].a();
            if (var2[var3].l != -1) {
               var1[var3].N = true;
            } else {
               var1[var3].N = false;
            }
         }
      }

   }

   public final Vector g() {
      Vector var1;
      Vector var10000 = var1 = super.g();
      boolean var2 = true;
      VDTT_hs var5 = this.a;
      VDTT_hs[] var4 = this.O;
      VDTT_ba[] var3 = this.N;
      VDTT_kw var10 = this;
      Vector var6 = new Vector();

      for(int var9 = 0; var9 < var3.length; ++var9) {
         int var7 = var5.objX + var3[var9].objX;
         int var8 = var5.objY + var3[var9].objY - var5.f;
         if (VDTT_jb.a(var5.objX, var5.objY, var5.objX + var5.q, var5.objY + var5.r, var7, var8) && VDTT_jb.a(var5.objX, var5.objY, var5.objX + var5.q, var5.objY + var5.r, var7 + var3[var9].q, var8 + var3[var9].r)) {
            var4[var9].objX = (short)var7;
            var4[var9].objY = (short)var8;
            var6.addElement(new VDTT_hl(3000 + var9, var4[var9].objX, var4[var9].objY, var4[var9].objX + var4[var9].q, var4[var9].objY + var4[var9].r, var4[var9], var10));
         }
      }

      var10000.addAll(var6);
      var1.addElement(this.a.a(1003, this));
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (var1.b >= 3000 & var1.b < 4000) {
         int var5 = var1.b - 3000;
         this.I.a((MainScreen)(new VDTT_lu(this.I, (VDTT_ec)this.b.get(var5))));
         VDTT_ac.b().n();
      } else {
         switch(var1.b) {
         case 100:
            this.I.a((MainScreen)(new VDTT_jt(this.I)));
            return;
         case 102:
            try {
               Message.c((byte)-87).l();
               return;
            } catch (Exception var4) {
            }
         default:
         }
      }
   }
}
