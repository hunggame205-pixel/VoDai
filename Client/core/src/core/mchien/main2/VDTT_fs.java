package core.mchien.main2;

public final class VDTT_fs extends VDTT_n {
   public Item k;
   public short l;
   public short m;
   public short n;
   public short o;
   public boolean p;
   private byte K = 70;
   private int[] L = new int[]{41, 42, 43};
   private int M = 0;
   public int I = 0;
   public int J;

   public VDTT_fs() {
      this.d(25, 25);
      this.r = 17;
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this.l = (short)var1;
      this.m = (short)var2;
      this.f(var3, var4);
      var1 = VDTT_jb.b(var1 - var3);
      var2 = VDTT_jb.b(var2 - var4);
      this.n = (short)(var1 / 6);
      this.o = (short)(var2 / 6);
      if (this.n <= 0) {
         this.n = 1;
      }

      if (this.o <= 0) {
         this.o = 1;
      }

   }

   public final int a() {
      return this.objX - this.q / 2;
   }

   public final int b() {
      return this.objX + this.q / 2;
   }

   public final int c() {
      return this.objY - this.r;
   }

   public final int d() {
      return this.objY;
   }

   public final void m() {
      if (this.I > 0) {
         --this.I;
         if (this.I == 1) {
            VDTT_cw.v().ar.remove(this);
         }
      }

      if (this.objX != this.l) {
         if (VDTT_jb.b(this.objX - this.l) < this.n) {
            this.objX = this.l;
         } else if (this.objX > this.l) {
            this.objX -= this.n;
         } else {
            this.objX += this.n;
         }
      }

      if (this.objY != this.m) {
         if (VDTT_jb.b(this.objY - this.m) < this.o) {
            this.objY = this.m;
         } else if (this.objY > this.m) {
            this.objY -= this.o;
         } else {
            this.objY += this.o;
         }
      }

      if (this.p) {
         if (this.objX == this.l && this.objY == this.m) {
            VDTT_cw.v().ar.remove(this);
         } else {
            this.K = (byte)(this.K + 5);
            if (this.K > 100) {
               this.K = 100;
            }
         }
      }

      if (this.k != null && this.k.getItemTemplate().a == 224 && DataCenter.d().h % 3 == 0) {
         ++this.M;
         if (this.M >= this.L.length) {
            this.M = 0;
         }
      }

   }

   public final void a(Graphics var1) {
      if (this.k.c == 725 || this.k.c == 726) {
         this.K = 80;
      }

      VDTT_aa.a(var1, this.k.an(), 0, this.objX, this.objY, this.K, (byte)33);
      if (this.k.getItemTemplate().a == 224) {
         VDTT_dc.a(var1, this.L[this.M], 0, this.objX, this.objY, 33);
      }

   }

   public final String f() {
      return null;
   }

   public final String g() {
      return null;
   }

   public final void b(Graphics var1) {
      if (VDTT_cw.v().bg != null && VDTT_cw.v().bg.equals(this)) {
         VDTT_dg.b(VDTT_dg.d, var1, this.k.getItemTemplate().b, this.objX, this.objY - this.r - 8, 2, -271475, -10275328);
         int var10002 = this.objY - this.r;
         VDTT_cw.v().bm.f(this.objX, var10002 - 20);
         VDTT_cw.v().bm.a(var1);
      }

   }

   public final int e() {
      return 3;
   }
}
