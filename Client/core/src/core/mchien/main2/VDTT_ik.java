package core.mchien.main2;

public final class VDTT_ik {
   private VDTT_ae c;
   private byte d;
   private byte e;
   private int f;
   private int g;
   private int h;
   private int i;
   public boolean a;
   public int b;

   public VDTT_ik(VDTT_ae var1, byte var2, int var3) {
      this.c = var1;
      this.d = var2;
      this.f = this.g = var3;
   }

   public VDTT_ik(VDTT_ae var1, byte var2, int var3, int var4) {
      this.c = var1;
      this.d = var2;
      this.f = var3;
      this.g = var4;
   }

   public final boolean a() {
      if (this.b > 0) {
         --this.b;
         if (this.b == 0) {
            this.e = 0;
            return true;
         }
      }

      VDTT_ae var10000;
      switch(this.d) {
      case 0:
         if (this.c.objX != this.f) {
            this.h = this.f - this.c.objX << 2;
            this.i += this.h;
            var10000 = this.c;
            var10000.objX = (short)(var10000.objX + (this.i >> 4));
            this.i &= 15;
            this.e = 1;
            if (DataCenter.l()) {
               this.c.objX = (short)this.f;
            }
         } else if (this.g != 0 && this.g != this.f) {
            this.f = this.g;
         } else if (this.e > 0) {
            this.e = 2;
         }
         break;
      case 1:
         if (this.c.objY != this.f) {
            this.h = this.f - this.c.objY << 2;
            this.i += this.h;
            var10000 = this.c;
            var10000.objY = (short)(var10000.objY + (this.i >> 4));
            this.i &= 15;
            this.e = 1;
            if (DataCenter.l()) {
               this.c.objY = (short)this.f;
            }
         } else if (this.g != 0 && this.g != this.f) {
            this.f = this.g;
         } else if (this.e > 0) {
            this.e = 2;
         }
         break;
      case 2:
         if (this.c.q != this.f) {
            this.h = this.f - this.c.q << 2;
            this.i += this.h;
            var10000 = this.c;
            var10000.q = (short)(var10000.q + (this.i >> 4));
            this.i &= 15;
            this.e = 1;
            if (DataCenter.l()) {
               this.c.q = (short)this.f;
            }
         } else if (this.e > 0) {
            this.e = 2;
         }
         break;
      case 3:
         if (this.c.r != this.f) {
            this.h = this.f - this.c.r << 2;
            this.i += this.h;
            var10000 = this.c;
            var10000.r = (short)(var10000.r + (this.i >> 4));
            this.i &= 15;
            this.e = 1;
            if (DataCenter.l()) {
               this.c.r = (short)this.f;
            }
         } else if (this.e > 0) {
            this.e = 2;
         }
      }

      if (this.e == 2) {
         this.e = 0;
         return true;
      } else {
         return false;
      }
   }

   public final void a(int var1) {
      this.h = this.i = 0;
      this.e = 0;
      this.f = this.g = var1;
   }

   public final boolean b() {
      switch(this.d) {
      case 0:
         if (this.c.objX != this.f) {
            return true;
         }
         break;
      case 1:
         if (this.c.objY != this.f) {
            return true;
         }
         break;
      case 2:
         if (this.c.q != this.f) {
            return true;
         }
         break;
      case 3:
         if (this.c.r != this.f) {
            return true;
         }
      }

      return this.e == 1;
   }
}
