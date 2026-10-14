package core.mchien.main2;

import java.util.Vector;

public final class VDTT_gg extends XYEntity {
   public boolean a;
   public Vector b = new Vector();
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h = 5;
   private int i;

   public VDTT_gg(int var1, int var2, int var3, int var4, byte var5, int var6) {
      for(var1 = 0; var1 < var6; ++var1) {
         this.b.addElement(new VDTT_ae());
      }

      this.f(0, 0);
      this.g = var3;
      this.e = var5;
      this.c = var4;
      this.b();
   }

   private void b() {
      this.d = 0;
      this.f = 0;
      this.a = true;
      this.i = 0;

      for(int var2 = 0; var2 < this.b.size(); ++var2) {
         VDTT_ae var1 = (VDTT_ae)this.b.elementAt(var2);
         switch(this.e) {
         case 0:
            var1.f(this.objX - this.g, this.objY + var2 * (var1.r + this.h));
            break;
         case 1:
            var1.f(this.objX + this.g, this.objY + var2 * (var1.r + this.h));
            break;
         case 2:
         case 4:
            var1.f(this.objX - this.g, this.objY);
            break;
         case 3:
         case 5:
            var1.f(this.objX + this.g, this.objY);
         case 6:
         default:
            break;
         case 7:
            var1.f(this.objX + var2 * (var1.q + this.h), this.objY - this.g);
            break;
         case 8:
            var1.f(this.objX + var2 * (var1.q + this.h), this.objY + this.g);
         }
      }

   }

   public final int a(int var1) {
      return ((VDTT_ae)this.b.elementAt(var1)).objX;
   }

   public final int b(int var1) {
      return ((VDTT_ae)this.b.elementAt(var1)).objY;
   }

   public final void a() {
      if (this.a) {
         this.d += this.c;
         ++this.i;
         VDTT_ae var2;
         if (this.i > 100) {
            for(int var1 = 0; var1 < this.b.size(); ++var1) {
               (var2 = (VDTT_ae)this.b.elementAt(var1)).objX = this.objX;
               var2.objY = this.objY;
            }

            this.d = 0;
            this.f = this.b.size();
            this.a = false;
         }

         VDTT_ae var10000;
         int var3;
         VDTT_ae var4;
         switch(this.e) {
         case 0:
            var10000 = var2 = (VDTT_ae)this.b.elementAt(this.f);
            var10000.objX = (short)(var10000.objX + this.d);
            if (var2.objX >= this.objX) {
               var2.objX = this.objX;
               this.d = 0;
               ++this.f;
               if (this.f >= this.b.size()) {
                  this.a = false;
               }
            }

            return;
         case 1:
            var10000 = var2 = (VDTT_ae)this.b.elementAt(this.f);
            var10000.objX = (short)(var10000.objX - this.d);
            if (var2.objX <= this.objX) {
               var2.objX = this.objX;
               this.d = 0;
               ++this.f;
               if (this.f >= this.b.size()) {
                  this.a = false;
               }
            }

            return;
         case 2:
         case 5:
            var2 = (VDTT_ae)this.b.elementAt(this.f);
            var3 = this.objX;
            if (this.f > 0) {
               var3 = (var4 = (VDTT_ae)this.b.elementAt(this.f - 1)).objX - var4.q - this.h;
            }

            var2.objX = (short)(var2.objX + this.d);
            if (var2.objX >= var3) {
               var2.objX = (short)var3;
               this.d = 0;
               ++this.f;
               if (this.f >= this.b.size()) {
                  this.a = false;
               }
            }

            return;
         case 3:
         case 4:
            var2 = (VDTT_ae)this.b.elementAt(this.f);
            var3 = this.objX;
            if (this.f > 0) {
               var3 = (var4 = (VDTT_ae)this.b.elementAt(this.f - 1)).objX + var4.q + this.h;
            }

            var2.objX = (short)(var2.objX - this.d);
            if (var2.objX <= var3) {
               var2.objX = (short)var3;
               this.d = 0;
               ++this.f;
               if (this.f >= this.b.size()) {
                  this.a = false;
               }
            }

            return;
         case 6:
         default:
            break;
         case 7:
            var10000 = var2 = (VDTT_ae)this.b.elementAt(this.f);
            var10000.objY = (short)(var10000.objY + this.d);
            if (var2.objY >= this.objY) {
               var2.objY = this.objY;
               this.d = 0;
               ++this.f;
               if (this.f >= this.b.size()) {
                  this.a = false;
               }
            }

            return;
         case 8:
            var10000 = var2 = (VDTT_ae)this.b.elementAt(this.f);
            var10000.objY = (short)(var10000.objY - this.d);
            if (var2.objY <= this.objY) {
               var2.objY = this.objY;
               this.d = 0;
               ++this.f;
               if (this.f >= this.b.size()) {
                  this.a = false;
               }
            }
         }
      }

   }
}
