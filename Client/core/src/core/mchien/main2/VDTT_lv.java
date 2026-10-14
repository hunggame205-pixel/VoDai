package core.mchien.main2;

import java.util.Vector;

public final class VDTT_lv extends VDTT_ar {
   private VDTT_hs[][] a = new VDTT_hs[3][];
   private VDTT_ba[] b = new VDTT_ba[3];
   private Item[] c = new Item[9];
   private int d = -1;

   public VDTT_lv(VDTT_p var1, Message var2) {
      this.I = var1;
      this.e = 2;
      this.a(279, 200);
      this.a(this.q - 50, this.r - 23, "", this, 1000, 671);
      this.J = new VDTT_hv((byte)0, 0, 0, this.q, this.r, 1, 1);
      this.J.N = this;

      int var3;
      for(var3 = 0; var3 < this.a.length; ++var3) {
         this.a[var3] = new VDTT_hs[3];
         int var7 = 50 * var3 + 55;
         this.b[var3] = this.a(122, var7 + 4, Caption.lh, this, 2002, 7);
         this.b[var3].a(true);
         VDTT_ba var10000 = this.b[var3];
         String var5 = Caption.fb;
         var10000.l = var5;
         if (VDTT_cw.v().ag >= 200 || var3 == 1 && VDTT_cw.v().ag >= 100 || var3 == 0 && VDTT_cw.v().ag > 0) {
            this.b[var3].I = 9;
            var10000 = this.b[var3];
            var5 = Caption.se;
            var10000.l = var5;
         }

         this.b[var3].d(70, this.b[var3].r);

         for(int var4 = 0; var4 < this.a[var3].length; ++var4) {
            this.a[var3][var4] = new VDTT_hs((byte)1, 20 + var4 * 34, var7, 30, 30, 1, 1);
         }
      }

      try {
         for(var3 = 0; var3 < this.c.length; ++var3) {
            this.c[var3] = new Item();
            this.c[var3].a(var2);
            switch(var3) {
            case 6:
               this.c[var3].s = 8;
               break;
            case 7:
               this.c[var3].s = 12;
               break;
            case 8:
               this.c[var3].s = 14;
            }
         }

      } catch (Exception var6) {
      }
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      this.d = -1;
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 300:
         this.d = (Integer)var1.k;
         Item var4;
         (var4 = this.c[this.d].a()).s = 0;
         var2 = this.d / 3;
         var3 = this.d % 3;
         this.k = a(this, this.a[var2][var3].objX + 32, this.a[var2][var3].objY, 30, var4);
         return;
      case 1000:
         this.k();
         VDTT_cw.v();
         VDTT_cw.W();
      default:
      }
   }

   public final Vector g() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         for(int var3 = 0; var3 < this.a[var2].length; ++var3) {
            var1.addElement(this.a[var2][var3].a(300, this, var2 * this.a.length + var3));
         }
      }

      var1.addElement(this.J.a(-9999, this));
      return var1;
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.xA, (byte)2, this.K);

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if (var2 == 0) {
            VDTT_dg.a(VDTT_dg.g[2], var1, Caption.BY[var2], this.a[var2][0].objX, this.a[var2][0].objY - 12, 0, -1, 4, 0);
         } else if (var2 == 1) {
            VDTT_dg.a(VDTT_dg.g[2], var1, Caption.BY[var2], this.a[var2][0].objX, this.a[var2][0].objY - 12, 0, -48128, 3, 0);
         } else {
            VDTT_dg.a(VDTT_dg.g[2], var1, Caption.BY[var2], this.a[var2][0].objX, this.a[var2][0].objY - 12, 0, -16711681, 2, 1);
         }

         for(int var3 = 0; var3 < this.a[var2].length; ++var3) {
            b(var1, this.a[var2][var3].objX, this.a[var2][var3].objY, this.c[var2 * 3 + var3], this.d == 3 * var2 + var3);
         }
      }

   }

   public final void a_() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         for(int var2 = 0; var2 < this.a[var1].length; ++var2) {
            this.a[var1][var2].a();
         }
      }

   }
}
