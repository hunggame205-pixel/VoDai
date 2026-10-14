package core.mchien.main2;

import java.util.Vector;

public final class VDTT_hi extends VDTT_n {
   public short k;
   public byte l = -1;
   public byte m = -1;
   public Vector n = new Vector();
   public int o = 0;
   public boolean p;
   public boolean I;
   public boolean J;
   public boolean K;
   public int L;
   public int M;

   public final VDTT_hk m() {
      return DataCenter.d().E[this.k];
   }

   public VDTT_hi(int var1, int var2, int var3) {
      this.a(var1, var2, var3, 1);
      VDTT_ac var4;
      if (var1 == 114 && !(var4 = VDTT_ac.b()).a) {
         var4.a(65);
      }

   }

   public VDTT_hi(int var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4);
   }

   private void a(short var1) {
      this.k = var1;
      if (var1 == 51) {
         VDTT_cw.v().cN = 20;
      }

   }

   private void a(int var1, int var2, int var3, int var4) {
      this.l = (byte)var4;
      this.a((short)var1);
      this.f(var2, var3);
      switch(var1) {
      case 350:
         this.M = 104;
         break;
      case 482:
         this.M = -19;
         break;
      case 483:
         this.M = -50;
         break;
      case 485:
         this.M = 147;
      }

      this.q();
   }

   public final int a() {
      return this.objX - this.q / 2;
   }

   public final int b() {
      return this.objX + this.q / 2;
   }

   public final int c() {
      return this.objY - this.r / 2;
   }

   public final int d() {
      return this.objY + this.r / 2;
   }

   public final void a(short var1, short var2) {
      for(int var3 = 0; var3 < this.n.size(); ++var3) {
         VDTT_ev var4;
         (var4 = (VDTT_ev)this.n.get(var3)).objX = (short)(var4.objX - this.objX + var1);
         var4.objY = (short)(var4.objY - this.objY + var2);
      }

      this.objX = var1;
      this.objY = var2;
   }

   public final void n() {
      ++this.m;
      if (this.o > 0 && this.m >= this.o) {
         this.m = 0;
         if (this.l > 0) {
            --this.l;
         }
      }

      VDTT_ev var1;
      int var2;
      for(var2 = 0; var2 < this.m().b.length; ++var2) {
         if (this.p) {
            var1 = new VDTT_ev(this.m().b[var2].a, this.objX - this.m().b[var2].c, this.objY + this.m().b[var2].d);
         } else {
            var1 = new VDTT_ev(this.m().b[var2].a, this.objX + this.m().b[var2].c, this.objY + this.m().b[var2].d);
         }

         var1.p = this.K;
         var1.o = this.p;
         if (this.M != 0) {
            var1.I = this.M;
         }

         if (this.m == this.m().b[var2].b) {
            this.n.addElement(var1);
         }

         if (this.m().b[var2].b + var1.p().b.length > this.o) {
            this.o = this.m().b[var2].b + var1.p().b.length;
         }
      }

      if (this.I) {
         for(var2 = this.n.size() - 1; var2 >= 0; --var2) {
            (var1 = (VDTT_ev)this.n.elementAt(var2)).n();
            if (this.M != 0) {
               var1.I = this.M;
            }

            if (var1.q()) {
               this.n.removeElement(var1);
            }
         }

      } else {
         if (this.l != 0) {
            VDTT_cw.v().at.addAll(this.n);
         }

         this.n.clear();
      }
   }

   public final void o() {
      ++this.m;
      if (this.o > 0 && this.l == -1 && this.m >= this.o) {
         this.m = 0;
      }

      VDTT_ev var1;
      int var2;
      for(var2 = 0; var2 < this.m().b.length; ++var2) {
         if (this.p) {
            var1 = new VDTT_ev(this.m().b[var2].a, this.objX - this.m().b[var2].c, this.objY + this.m().b[var2].d);
         } else {
            var1 = new VDTT_ev(this.m().b[var2].a, this.objX + this.m().b[var2].c, this.objY + this.m().b[var2].d);
         }

         var1.p = this.K;
         var1.o = this.p;
         if (this.m == this.m().b[var2].b) {
            this.n.addElement(var1);
         }

         if (this.m().b[var2].b + var1.p().b.length > this.o) {
            this.o = this.m().b[var2].b + var1.p().b.length;
         }
      }

      for(var2 = this.n.size() - 1; var2 >= 0; --var2) {
         (var1 = (VDTT_ev)this.n.elementAt(var2)).n();
         if (var1.q()) {
            this.n.removeElement(var1);
         }
      }

      if (this.m >= this.o) {
         this.m = -1;
         if (this.l > 0) {
            --this.l;
         }
      }

   }

   public final void a(VDTT_n var1) {
      short var2 = (short)(var1.objX + this.L);
      short var3 = var1.objY;
      if (this.J) {
         var2 = (short)(var1.k() + this.L);
         var3 = (short)var1.l();
         if (this.k == 442) {
            if (var1.d == 3) {
               var2 = (short)(var2 - 5);
               this.p = false;
            } else {
               var2 = (short)(var2 + 5);
               this.p = true;
            }
         }
      }

      if (this.k == 453 && var1 instanceof VDTT_ek && !var1.h()) {
         var3 = (short)(var3 + DataCenter.d().h / 5 % 2);
      }

      if (this.k == 112 || this.k == 113) {
         var3 = (short)(var3 - (var1.r + 14));
         VDTT_gx var4;
         if (var1 instanceof VDTT_gx && (var4 = (VDTT_gx)var1).m().k.length() > 0) {
            var3 = (short)(var3 - 10);
         }
      }

      int var7 = var2 - this.objX;
      int var5 = var3 - this.objY;
      this.objX = var2;
      this.objY = var3;
      ++this.m;
      if (this.o > 0 && this.l == -1 && this.m >= this.o) {
         this.m = 0;
      }

      VDTT_ev var6;
      int var8;
      for(var8 = this.n.size() - 1; var8 >= 0; --var8) {
         VDTT_ev var10000 = var6 = (VDTT_ev)this.n.elementAt(var8);
         var10000.objX = (short)(var10000.objX + var7);
         var6.objY = (short)(var6.objY + var5);
         var6.n();
         if (var6.q()) {
            this.n.removeElement(var6);
         }
      }

      for(var8 = 0; var8 < this.m().b.length; ++var8) {
         if (this.p) {
            var6 = new VDTT_ev(this.m().b[var8].a, this.objX - this.m().b[var8].c, this.objY + this.m().b[var8].d);
         } else {
            var6 = new VDTT_ev(this.m().b[var8].a, this.objX + this.m().b[var8].c, this.objY + this.m().b[var8].d);
         }

         var6.p = this.K;
         var6.o = this.p;
         if (this.m().b[var8].a == 167) {
            var6.J = var1.r * 100 / 85 + 15;
            var6.o = this.p;
         }

         if (this.m == this.m().b[var8].b) {
            this.n.addElement(var6);
         }

         if (this.m().b[var8].b + var6.p().b.length > this.o) {
            this.o = this.m().b[var8].b + var6.p().b.length;
         }
      }

      for(var8 = this.n.size() - 1; var8 >= 0; --var8) {
         this.n.elementAt(var8);
         VDTT_cw.v().a((VDTT_n)this.n.elementAt(var8));
      }

      VDTT_cw.v().Q();
      if (this.m >= this.o) {
         this.m = -1;
         if (this.l > 0) {
            --this.l;
         }
      }

   }

   public final boolean p() {
      return this.l == 0;
   }

   public final void a(Graphics var1) {
      if (!this.p()) {
         for(int var3 = 0; var3 < this.n.size(); ++var3) {
            ((VDTT_ev)this.n.elementAt(var3)).a(var1);
         }

      }
   }

   public final void b(Graphics var1, int var2, int var3) {
      if (!this.p()) {
         for(int var5 = 0; var5 < this.n.size(); ++var5) {
            ((VDTT_ev)this.n.elementAt(var5)).b(var1, var2, var3);
         }

      }
   }

   public final String f() {
      return null;
   }

   public final String g() {
      return null;
   }

   public final void b(Graphics var1) {
   }

   public final int e() {
      return this.m().a;
   }

   public final void q() {
      try {
         for(int var1 = 0; var1 < this.m().b.length; ++var1) {
            if (this.m().b[var1].a > 0) {
               (new VDTT_ev(this.m().b[var1].a, 0, 0)).s();
            }
         }

      } catch (Exception var3) {
      }
   }
}
