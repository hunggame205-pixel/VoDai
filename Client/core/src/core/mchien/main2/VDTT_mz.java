package core.mchien.main2;

import java.util.Vector;

public final class VDTT_mz extends VDTT_jr {
   private VDTT_ht X;
   private VDTT_ht Y;
   private VDTT_ba Z;
   private VDTT_ba aa;
   private VDTT_ba am;
   public int O = 0;
   public int P = 0;
   public int Q = 0;
   public int R = 0;
   private int an = 32;
   public Item[] S = new Item[12];
   public Item[] T = new Item[12];
   public String U = "";
   public long V = VDTT_jb.a() + 6000L;
   public int W;

   public VDTT_mz(VDTT_p var1, String var2) {
      super(var1, new String[]{Caption.bZ});
      this.U = var2;
      this.Z = this.a(this.q / 2 - 29, this.r - 31, Caption.cd, this, 1001, -8);
      this.aa = this.a(this.ag.objX - 17, this.ag.objY, Caption.ca, this, 1002, -8);
      this.X = new VDTT_ht((byte)1, 13, this.f() + 22, this.an * 4, this.an * 3, this.an, VDTT_jb.c(this.S.length, 4), 4);
      this.Y = new VDTT_ht((byte)1, this.q + 3 - 13 - 4 * this.an, this.f() + 22, this.an * 4, this.an * 3, this.an, VDTT_jb.c(this.T.length, 4), 4);
      this.am = this.a(this.X.objX + this.X.q - 19, this.X.objY + this.X.r + 7, "", this, 1002, 52);
      this.a(this.am, 0);
      this.a(this.Z, 0);
      this.a(this.aa, this.w());
      this.f(0);
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 1001:
            VDTT_mz var6 = this;

            try {
               if (var6.O == 0) {
                  var6.O = 1;
                  Vector var8 = new Vector();

                  int var4;
                  for(var4 = 0; var4 < var6.S.length; ++var4) {
                     if (var6.S[var4] != null) {
                        var8.add(var6.S[var4]);
                     }
                  }

                  Message var7;
                  (var7 = new Message((byte)82)).c(var6.Q);
                  var7.a(var8.size());

                  for(var4 = 0; var4 < var8.size(); ++var4) {
                     var7.b(((Item)var8.elementAt(var4)).f);
                  }

                  var7.l();
                  if (var6.O == var6.P) {
                     var6.V = VDTT_jb.a() + 5999L;
                  }

                  return;
               }

               if (var6.O == 1 && var6.P > 0 && var6.V < VDTT_jb.a() + 999L) {
                  var6.O = 2;
                  (new Message((byte)81)).l();
               }
               break;
            } catch (Exception var5) {
               VDTT_jb.a(var5);
               return;
            }
         case 1002:
            if (this.O == 0 && this.Q > 0) {
               VDTT_ek var10000 = VDTT_ek.m();
               var10000.ak += this.Q;
               this.Q = 0;
            }

            return;
         case 5001:
            this.W = 1;
            this.k = a(var1, this, this.S[var1.j.k]);
            return;
         case 5002:
            this.W = 2;
            this.k = a(var1, this, this.T[var1.j.k]);
         }

         return;
      } else if (super.a.b == this.w()) {
         switch(var1.b) {
         case 1002:
            this.I.a((MainScreen)(new VDTT_ld(this.I, this)));
         }
      }

   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && !var1[var2].t) {
            this.ak.add(var1[var2]);
         }
      }

   }

   public final void f(int var1) {
      super.f(var1);
      this.b(this.aa);
      if (var1 == this.w()) {
         if (this.O == 0) {
            this.a(this.aa);
         }

         this.b(this.ag);
         this.b(this.ah);
      }

   }

   public final void d() {
      super.d();

      for(int var1 = 0; var1 < this.S.length; ++var1) {
         if (this.S[var1] != null) {
            int var10001 = this.S[var1].f;
            VDTT_ek.m().aP[var10001] = this.S[var1];
            this.S[var1] = null;
         }
      }

      try {
         (new Message((byte)83)).l();
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      super.b(var1);
      if (super.a.b == 0) {
         this.a(var1, this.X);

         int var2;
         int var3;
         for(var2 = 0; var2 < this.X.i; ++var2) {
            for(var3 = 0; var3 < this.X.P; ++var3) {
               b(var1, var3 * this.X.h, var2 * this.X.h, this.S[var2 * this.X.P + var3], var2 * this.X.P + var3 == this.X.k);
               if (this.O > 0) {
                  VDTT_aa.a(var1, -13, 0, var3 * this.X.h + 2, var2 * this.X.h + 2, 25, (int)25);
               }
            }
         }

         this.a(var1);
         this.a(var1, this.Y);

         for(var2 = 0; var2 < this.Y.i; ++var2) {
            for(var3 = 0; var3 < this.Y.P; ++var3) {
               b(var1, var3 * this.Y.h, var2 * this.Y.h, this.T[var2 * this.Y.P + var3], var2 * this.Y.P + var3 == this.Y.k);
               if (this.P > 0) {
                  VDTT_aa.a(var1, -13, 0, var3 * this.Y.h + 2, var2 * this.Y.h + 2, 25, (int)25);
               }
            }
         }

         this.a(var1);
         short var5 = this.X.objX;
         var3 = this.X.objY + this.X.r + 5;
         int var10003 = var5 + this.X.q / 2;
         int var10004 = var3 - this.X.r - 15;
         VDTT_dg.b(VDTT_dg.d, var1, VDTT_ek.m().aD, var10003, var10004, 2, -1, -16777216);
         this.a(var1, var5, var3, this.X.q - 3, 18, 46, 22, 23, 1, 1, 180);
         a(var1, var5 + 2, var3 + 9, "", (byte)0);

         int var4;
         for(var4 = 0; var4 < 3; ++var4) {
            VDTT_dc.a(var1, 10, 0, var5 + 24 + var4 * 30, var3 + 44, 6);
            if (this.O >= var4) {
               VDTT_dc.a(var1, 11, 0, var5 + 28 + var4 * 30, var3 + 44, 6);
            }
         }

         VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(this.Q), var5 + 30, var3 + 9, 20, -3089954, -16777216);
         if (this.Q > 0) {
            VDTT_dg.b(VDTT_dg.d, var1, Caption.ho + " 1%", var5 + 2, var3 + 27, 0, -3089954, -16777216);
            a(var1, var5 + 2, var3 + 27, Caption.ho + " 1%", (byte)0);
         }

         var5 = this.Y.objX;
         var3 = this.Y.objY + this.Y.r + 5;
         VDTT_dg.b(VDTT_dg.d, var1, this.U, var5 + this.Y.q / 2, var3 - this.Y.r - 15, 2, -1, -16777216);
         this.a(var1, var5, var3, this.Y.q - 3, 18, 46, 22, 23, 1, 1, 180);
         a(var1, var5 + 2, var3 + 9, "", (byte)0);

         for(var4 = 0; var4 < 3; ++var4) {
            VDTT_dc.a(var1, 10, 0, var5 + 24 + var4 * 30, var3 + 44, 6);
            if (this.P >= var4) {
               VDTT_dc.a(var1, 11, 0, var5 + 28 + var4 * 30, var3 + 44, 6);
            }
         }

         VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.c(this.R), var5 + 30, var3 + 9, 20, -3089954, -16777216);
         if (this.R > 0) {
            VDTT_dg.b(VDTT_dg.d, var1, Caption.ho + " 1%", var5 + 2, var3 + 27, 0, -3089954, -16777216);
            a(var1, var5 + 2, var3 + 27, Caption.ho + " 1%", (byte)0);
         }
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         if (this.O > 0) {
            this.b(this.am);
            this.b(this.aa);
         }

         this.X.a();
         this.Y.a();
      } else {
         this.B();
      }

      if (this.O > 0 && this.P > 0) {
         long var1 = VDTT_jb.a();
         String var2;
         if (this.V > var1 + 1000L) {
            VDTT_ba var10000 = this.Z;
            var2 = VDTT_jb.b(Caption.ce, "" + (this.V - var1) / 1000L);
            var10000.l = var2;
            this.Z.a(true);
         } else {
            var2 = Caption.bi;
            this.Z.l = var2;
            this.Z.a(false);
         }
      } else if (this.O > 0) {
         this.Z.a(true);
      }

      if (this.O >= 2) {
         this.Z.c = true;
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         var1.addElement(this.X.a(5001, this));
         var1.addElement(this.Y.a(5002, this));
      }

      return var1;
   }

   public final int C() {
      return super.a.b;
   }
}
