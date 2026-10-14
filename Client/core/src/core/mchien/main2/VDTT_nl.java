package core.mchien.main2;

import java.util.Vector;

public final class VDTT_nl extends VDTT_ar {
   public Item[] a;
   public Item b;
   private VDTT_ht c;
   private VDTT_ba d;
   private VDTT_nm[] N = new VDTT_nm[]{new VDTT_nm(this, 0, 0), new VDTT_nm(this, 1, 0), new VDTT_nm(this, 2, 0), new VDTT_nm(this, 3, 0), new VDTT_nm(this, 4, 0), new VDTT_nm(this, 5, 0), new VDTT_nm(this, 5, 1), new VDTT_nm(this, 5, 2), new VDTT_nm(this, 5, 3), new VDTT_nm(this, 5, 4), new VDTT_nm(this, 5, 5), new VDTT_nm(this, 4, 5), new VDTT_nm(this, 3, 5), new VDTT_nm(this, 2, 5), new VDTT_nm(this, 1, 5), new VDTT_nm(this, 0, 5), new VDTT_nm(this, 0, 4), new VDTT_nm(this, 0, 3), new VDTT_nm(this, 0, 2), new VDTT_nm(this, 0, 1)};
   private int O;
   private int P;
   private int Q = 32;
   private int R = -1;
   private boolean S;
   private boolean T;
   private boolean U;
   private long V = 0L;
   private int W = 160;

   public VDTT_nl(VDTT_p var1, Message var2) {
      try {
         this.I = var1;
         this.a(202, 230);
         this.K = false;
         this.a = new Item[var2.f()];

         for(int var3 = 0; var3 < this.a.length; ++var3) {
            Item var5;
            (var5 = new Item()).a(var2);
            var5.f = var3;
            this.a[var5.f] = var5;
         }

         this.O = 6;
         this.P = this.f() + 2;
         this.c = new VDTT_ht((byte)1, 6, this.f() + 2, 192, 192, 32, 6, 6);
         this.d = this.a(this.q / 2 - 30, this.c.objY + this.c.r - 32 - 55, Caption.ss, this, 100, 15);
         this.d.d(60, this.d.r);
         this.j();
         this.a(this.q - 14, -7, "", this, 1206, 6);
      } catch (Exception var4) {
      }
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.sr, (byte)2, this.K);
      VDTT_aa.a(var1, 61, 0, 36, 61, 130, (int)130);

      for(int var2 = 0; var2 < this.N.length; ++var2) {
         VDTT_nm var3 = this.N[var2];
         b(var1, this.O + var3.a * this.Q, this.P + var3.b * this.Q, this.a[var2], var2 == this.R);
      }

      if (this.S || this.b != null) {
         Graphics var10000;
         int var10001;
         int var10002;
         Item var10003;
         boolean var10004;
         label28: {
            if (this.S) {
               var10000 = var1;
               var10001 = this.q / 2 - 14;
               var10002 = this.r / 2 - 14;
               var10003 = this.b;
            } else {
               var10000 = var1;
               var10001 = this.q / 2 - 14;
               var10002 = this.r / 2 - 14;
               var10003 = this.b;
               if (this.R == -2) {
                  var10004 = true;
                  break label28;
               }
            }

            var10004 = false;
         }

         b(var10000, var10001, var10002, var10003, var10004);
         if (DataCenter.d().h % 10 > 5 && !this.S) {
            var1.c(-2560);
            VDTT_dc.a(var1, 40, 0, this.q / 2 - 15, this.r / 2 - 15, 0);
            var1.f();
         }
      }

      VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, "- " + Caption.aO + " " + VDTT_jb.c(VDTT_ek.m().f(this.W)) + " " + DataCenter.d().O[this.W].b, this.c.objX + 35, this.c.objY + 138, 0, -6488, -10275328);
      VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, "- " + VDTT_jb.b(Caption.st, DataCenter.d().O[this.W].b), this.c.objX + 35, this.c.objY + 150, 0, -6488, -10275328);
   }

   public final void a_() {
      if (this.U) {
         this.S = false;
         this.T = false;
         this.b = null;
      } else {
         if (this.S && this.T && VDTT_jb.a() > this.V) {
            this.T = false;
            w();
         }

         if ((this.S || this.b != null) && this.S && DataCenter.d().h % 2 == 0) {
            Vector var1 = new Vector();

            for(int var2 = 0; var2 < this.a.length; ++var2) {
               var1.add(this.a[var2]);
            }

            Item var4 = (Item)var1.lastElement();
            var1.remove(var4);
            var1.insertElementAt(var4, 0);
            Item[] var5 = new Item[this.a.length];

            for(int var3 = 0; var3 < this.a.length; ++var3) {
               var5[var3] = (Item)var1.get(var3);
            }

            this.a = var5;
            this.b = this.a[VDTT_jb.a(this.a.length)];
         }

      }
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.R = -2;
      if (var1.b >= 3000 && var1.b < 4000) {
         this.R = var1.b - 3000;
         if (!this.S && this.R >= 0) {
            this.k = b(this, var1, this.a[this.R]);
            VDTT_ac.b().n();
         }

      } else {
         switch(var1.b) {
         case 100:
            int var4 = VDTT_jb.a(this.a.length);
            if (VDTT_ek.m().D() > 0 && VDTT_ek.m().f(this.W) >= 40) {
               this.S = true;
               this.T = true;
               this.V = VDTT_jb.a() + (long)VDTT_jb.a(4000, 8000);
               boolean var5 = true;
               this.d.a(true);
               return;
            }

            w();
            break;
         case 1000:
            if (!this.S && this.b != null) {
               this.k = c(this, var1, this.b);
               VDTT_ac.b().n();
               return;
            }
            break;
         case 1206:
            if (!this.S) {
               this.k();
            }
         }

      }
   }

   public final Vector g() {
      Vector var1 = super.g();

      int var2;
      for(var2 = 0; var2 < this.N.length; ++var2) {
         VDTT_nm var3 = this.N[var2];
         var1.add(new VDTT_hl(3000 + var2, this.O + var3.a * this.Q, this.P + var3.b * this.Q, this.O + var3.a * this.Q + this.Q - 3, this.P + var3.b * this.Q + this.Q - 3, (VDTT_hs)null, this));
      }

      var2 = this.q / 2 - 14;
      int var4 = this.r / 2 - 14;
      var1.add(new VDTT_hl(1000, var2, var4, var2 + 28, var4 + 28, (VDTT_hs)null, this));
      return var1;
   }

   private static void w() {
      try {
         Message.c((byte)-35).l();
      } catch (Exception var1) {
         VDTT_jb.a(var1);
      }
   }
}
