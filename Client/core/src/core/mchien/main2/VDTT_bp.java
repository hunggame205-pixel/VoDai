package core.mchien.main2;

import java.util.Vector;

public final class VDTT_bp extends VDTT_an {
   private int m;
   public VDTT_fa l;
   private VDTT_ba[] n;
   private VDTT_hs[] I;
   private VDTT_hs J;
   private VDTT_hs K;
   private String[] L;

   public VDTT_bp(int var1, int var2, int var3, MainScreen var4, VDTT_fa var5) {
      this.m = var3;
      this.a = var4;
      this.l = var5;
      this.f(var1, var2);
      if (var5.a()) {
         var1 = 0;
         if (var5.f > 0) {
            var1 += 15;
         }

         if (var5.g > 0) {
            var1 += 15;
         }

         if (var5.h > 0) {
            var1 += 15;
         }

         if (var5.i > 0) {
            var1 += 15;
         }

         if (var5.j > 0L) {
            var1 += 15;
         }

         if (var1 < 15) {
            var1 = 15;
         }

         this.d(230, 160 + var1);
      } else {
         this.d(230, 165);
      }

      this.n = new VDTT_ba[4];
      this.n[0] = new VDTT_ba(this.q - 53, this.r - 26, 0, 0, Caption.G, var4, 1000, 7);
      this.n[0].d(49, 22);
      this.n[1] = new VDTT_ba(this.q - 17, 3, 0, 0, "", var4, 1001, 52);
      this.n[2] = new VDTT_ba(this.q - 104, this.r - 26, 0, 0, Caption.H, var4, 1002, 7);
      this.n[2].d(49, 22);
      if (var5.a()) {
         this.n[3] = new VDTT_ba(8, 148, 0, 0, Caption.cm, var4, 1003, 7);
         this.n[3].d(41, 18);
      }

      this.I = a(this.n);
      this.L = VDTT_dg.b(VDTT_dg.d, var5.d, this.q - 18);
      this.J = new VDTT_hs((byte)1, 2, 40, this.q - 4, 84, 14, this.L.length);
      this.K = new VDTT_hs((byte)1, 54, 137, 28, 28, 28, 1);
   }

   public final void b(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      this.c(var1);
      VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, Caption.he, 50, 12, 1, -6488, -10275328);
      VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, this.l.c, 55, 12, 0, -1, -10275328);
      VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, Caption.hf, 50, 26, 1, -6488, -10275328);
      VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, this.l.b, 55, 26, 0, -22360, -10275328);
      int var4;
      if (this.l.a()) {
         VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, Caption.hg, 8, 140, 0, -10831436, 0);
         var4 = 125;
         VDTT_dg var10000;
         String var10002;
         if (this.l.f > 0) {
            var10000 = VDTT_dg.d;
            var10002 = VDTT_jb.c(this.l.f);
            var4 += 15;
            VDTT_dg.a((VDTT_dg)var10000, var1, var10002, 90, 140, 0, -1, 0);
            a(var1, 90, 140, VDTT_jb.c(this.l.f), (byte)0);
         }

         if (this.l.g > 0) {
            var10000 = VDTT_dg.d;
            var10002 = VDTT_jb.c(this.l.g);
            var4 += 15;
            VDTT_dg.a((VDTT_dg)var10000, var1, var10002, 90, var4, 0, -1, 0);
            a(var1, 90, var4, VDTT_jb.c(this.l.g), (byte)1);
         }

         if (this.l.h > 0) {
            var10000 = VDTT_dg.d;
            var10002 = VDTT_jb.c(this.l.h);
            var4 += 15;
            VDTT_dg.a((VDTT_dg)var10000, var1, var10002, 90, var4, 0, -1, 0);
            a(var1, 90, var4 - 2, VDTT_jb.c(this.l.h), (byte)2);
         }

         if (this.l.i > 0) {
            var10000 = VDTT_dg.d;
            var10002 = VDTT_jb.c(this.l.i);
            var4 += 15;
            VDTT_dg.a((VDTT_dg)var10000, var1, var10002, 90, var4, 0, -1, 0);
            a(var1, 90, var4 - 2, VDTT_jb.c(this.l.i), (byte)3);
         }

         if (this.l.j > 0L) {
            var10000 = VDTT_dg.d;
            var10002 = VDTT_jb.c(this.l.j / 10L);
            var4 += 15;
            VDTT_dg.a((VDTT_dg)var10000, var1, var10002, 90, var4, 0, -1, 0);
            a(var1, 90, var4 - 2, VDTT_jb.c(this.l.j / 10L), (byte)6);
         }

         a(var1, this.K.objX, this.K.objY, this.l.e, false);
      }

      var1.c(-8492991);
      this.a(var1, 2, this.J.objY - 5, this.q - 4, this.J.r + 10, -12, 380, -12);
      var1.f();
      this.a(var1, this.J);

      for(var4 = 0; var4 < this.L.length; ++var4) {
         if (this.J.b(var4)) {
            VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, this.L[var4], 10, 7 + var4 * this.J.h, 0, -3089954, 0);
         }
      }

      this.a(var1);
      this.a(var1, var2, var3);
      this.a(var1, this.n, var2, var3);
   }

   public final void a_() {
      this.J.a();
      this.K.a();
      if (!this.l.a()) {
         this.n[3] = null;
      }

      a(this.n, this.I);
   }

   public final Vector g() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < this.I.length; ++var2) {
         if (this.I[var2] != null && this.n[var2] != null) {
            var1.addElement(this.I[var2].a(this.n[var2].m, this));
         }
      }

      var1.addElement(this.J.a(1010, this));
      var1.addElement(this.K.a(1011, this));
      var1.addElement(new VDTT_hl(1500, 0, 0, this.q, this.r, (VDTT_hs)null, this));
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      switch(var1.b) {
      case 1000:
         this.d();
         ((VDTT_ln)this.a).a(this.l);
         return;
      case 1001:
         this.d();
         return;
      case 1002:
         this.d();
         this.c(true);
         return;
      case 1003:
         this.d();
         VDTT_bp var5 = this;

         try {
            if (var5.l.a()) {
               Message var6;
               (var6 = new Message((byte)95)).b(var5.l.a);
               var6.l();
            }
            break;
         } catch (Exception var4) {
            return;
         }
      case 1011:
         this.a.k = a(this.a, this.objX - 137, this.objY + 15, 28, this.l.e);
         return;
      case 2002:
         this.c(false);
      }

   }

   private void c(boolean var1) {
      try {
         if (this.l.a()) {
            DataCenter.d().ai.c(Caption.hh, -65536);
         } else if (var1) {
            DataCenter.d().ai.a(Caption.hi, 2002, this);
         } else {
            Vector var3;
            (var3 = new Vector()).add(this.l);
            VDTT_ln.c(var3);
         }
      } catch (Exception var2) {
      }
   }

   public final void d() {
      this.a.b((VDTT_m)this);
   }
}
