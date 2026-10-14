package core.mchien.main2;

import java.util.Vector;

public final class VDTT_jz extends VDTT_ka {
   private VDTT_ht Q;
   private VDTT_ba R;
   public Item[] O = new Item[16];
   public byte P;

   public VDTT_jz(VDTT_p var1, String[] var2, byte var3) {
      super(var1, var2);
      this.P = var3;
      this.R = this.a(this.q / 2 - 35, this.r - 33, Caption.bi, this, 5002, -8);
      this.a(this.R, 0);
      this.Q = new VDTT_ht((byte)1, 7, this.f() + 3, 128, 128, 32, VDTT_jb.c(this.O.length, 4), 4);
   }

   public final void a(Item[] var1) {
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         this.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 5001:
            try {
               this.k = a(var1, this, this.O[var1.j.k]);
               return;
            } catch (Exception var5) {
               return;
            }
         case 5002:
            VDTT_jz var7 = this;

            try {
               Message var8 = null;
               if (var7.P == 78) {
                  var8 = new Message((byte)-20);
               } else if (var7.P == 106) {
                  var8 = new Message((byte)-34);
               }

               var3 = 0;

               int var4;
               for(var4 = 0; var4 < var7.O.length; ++var4) {
                  if (var7.O[var4] != null) {
                     ++var3;
                  }
               }

               var8.a(var3);

               for(var4 = 0; var4 < var7.O.length; ++var4) {
                  if (var7.O[var4] != null) {
                     var8.a(var7.O[var4].w);
                     var8.b(var7.O[var4].f);
                  }
               }

               var8.l();
               return;
            } catch (Exception var6) {
               VDTT_jb.a(var6);
            }
         }
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      super.b(var1);
      if (super.a.b == 0) {
         this.a(var1, this.Q);

         int var2;
         int var3;
         for(var2 = 0; var2 < this.Q.i; ++var2) {
            for(var3 = 0; var3 < this.Q.P; ++var3) {
               if (this.Q.b(var2)) {
                  b(var1, var3 * this.Q.h, var2 * this.Q.h, this.O[var2 * this.Q.P + var3], var2 * this.Q.P + var3 == this.Q.k);
               }
            }
         }

         this.a(var1);
         this.a(var1, this.objX + 4, this.objY + this.f());
         var2 = 11;
         if (this.P == 78) {
            var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;

            for(int var7 = 0; var7 < this.O.length; ++var7) {
               if (this.O[var7] != null) {
                  if (this.O[var7].Q()) {
                     var3 += 400;
                  }

                  if (this.O[var7].P()) {
                     var4 += 400;
                  }

                  if (this.O[var7].R()) {
                     var5 += 400;
                  }

                  if (this.O[var7].S()) {
                     var6 += 400;
                  }
               }
            }

            VDTT_dg.b(VDTT_dg.d, var1, Caption.lO, this.Q.q + 10, 11, 0, -1, -16777216);
            VDTT_dg var10000;
            String var10002;
            int var10003;
            if (var3 > 0) {
               var10000 = VDTT_dg.d;
               var10002 = "- " + VDTT_jb.c(var3) + " " + DataCenter.d().O[353].b + " " + Caption.pS;
               var10003 = this.Q.q + 10;
               var2 += 15;
               VDTT_dg.b(var10000, var1, var10002, var10003, 26, 0, -1, -16777216);
            }

            if (var4 > 0) {
               var10000 = VDTT_dg.d;
               var10002 = "- " + VDTT_jb.c(var4) + " " + DataCenter.d().O[565].b + " " + Caption.pS;
               var10003 = this.Q.q + 10;
               var2 += 15;
               VDTT_dg.b(var10000, var1, var10002, var10003, var2, 0, -1, -16777216);
            }

            if (var5 > 0) {
               var10000 = VDTT_dg.d;
               var10002 = "- " + VDTT_jb.c(var5) + " " + DataCenter.d().O[563].b + " " + Caption.pS;
               var10003 = this.Q.q + 10;
               var2 += 15;
               VDTT_dg.b(var10000, var1, var10002, var10003, var2, 0, -1, -16777216);
            }

            if (var6 > 0) {
               var10000 = VDTT_dg.d;
               var10002 = "- " + VDTT_jb.c(var6) + " " + DataCenter.d().O[567].b + " " + Caption.pS;
               var10003 = this.Q.q + 10;
               var2 += 15;
               VDTT_dg.b(var10000, var1, var10002, var10003, var2, 0, -1, -16777216);
            }

            return;
         }

         if (this.P == 106) {
            VDTT_dg.b(VDTT_dg.d, var1, Caption.si, this.Q.q + 10, 11, 0, -1, -16777216);
         }
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         this.Q.a();
      } else {
         this.B();
      }
   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         var1.addElement(this.Q.a(5001, this));
      }

      return var1;
   }

   public final void d() {
      super.d();

      for(int var1 = 0; var1 < this.O.length; ++var1) {
         if (this.O[var1] != null) {
            VDTT_ek.m().i(this.O[var1].w)[this.O[var1].f] = this.O[var1];
            this.O[var1] = null;
         }
      }

   }
}
