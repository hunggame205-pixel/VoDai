package core.mchien.main2;

public final class VDTT_dm {
   public VDTT_hl[] a;
   public short b = -1;
   public int c;
   public int d;
   public XYEntity e;
   public XYEntity f;
   private int g = 5;

   public final short a(int var1, int var2) {
      this.b = -1;
      this.c = var1;
      this.d = var2;

      for(short var3 = 0; var3 < this.a.length; ++var3) {
         if (this.a[var3] != null) {
            if (VDTT_jb.a(this.a[var3].c, this.a[var3].d, this.a[var3].e, this.a[var3].f, var1, var2)) {
               this.b = var3;
               this.a[var3].i = VDTT_jb.a();
               if (this.a[var3].j != null) {
                  if (this.a[var3].c() == this.a[var3].j.q && this.a[var3].d() == this.a[var3].j.r) {
                     this.a[var3].j.a(var1 - this.a[var3].c, var2 - this.a[var3].d);
                     this.a[var3].j.o = false;
                  } else {
                     this.a[var3].j.a(var1 - (this.a[var3].c - this.a[var3].g), var2 - (this.a[var3].d - this.a[var3].h));
                     this.a[var3].j.o = true;
                  }
               }
               break;
            }

            this.a[var3].i = 0L;
         }
      }

      return this.b;
   }

   public final VDTT_hl b(int var1, int var2) {
      VDTT_hl var3 = null;

      try {
         if (this.a[this.b] != null) {
            if (this.a[this.b].j != null) {
               if (this.a[this.b].c() == this.a[this.b].j.q && this.a[this.b].d() == this.a[this.b].j.r) {
                  this.a[this.b].j.c(var1 - this.a[this.b].c, var2 - this.a[this.b].d);
               } else {
                  this.a[this.b].j.c(var1 - (this.a[this.b].c - this.a[this.b].g), var2 - (this.a[this.b].d - this.a[this.b].h));
               }
            }

            if (VDTT_jb.a(this.a[this.b].c, this.a[this.b].d, this.a[this.b].e, this.a[this.b].f, var1, var2)) {
               var3 = this.a[this.b];
            }

            this.a[this.b].i = 0L;
         }

         this.b = -1;
      } catch (Exception var4) {
      }

      return var3;
   }

   public final VDTT_hl c(int var1, int var2) {
      VDTT_hl var3 = null;

      try {
         if (this.a[this.b] != null && (VDTT_jb.b(var1 - this.c) >= this.g || VDTT_jb.b(var2 - this.d) >= this.g)) {
            var3 = this.a[this.b];
            if (this.a[this.b].j != null) {
               this.a[this.b].j.b(var1 - this.c, var2 - this.d);
            }
         }
      } catch (Exception var4) {
      }

      return var3;
   }

   public final void a(VDTT_hs var1, int var2, int var3) {
      try {
         if (var1 == null) {
            if (this.a[this.b] != null && this.a[this.b].j != null) {
               this.a[this.b].j.b(var2 - this.c, var3 - this.d);
            }

            return;
         }

         var1.b(var2 - this.c, var3 - this.d);
      } catch (Exception var4) {
      }

   }

   public final boolean a(int var1) {
      return this.b == var1 && VDTT_jb.a() - this.a[var1].i >= 100L;
   }
}
