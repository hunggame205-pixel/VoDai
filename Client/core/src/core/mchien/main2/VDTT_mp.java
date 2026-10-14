package core.mchien.main2;

import java.util.Vector;

public final class VDTT_mp extends VDTT_ar {
   public VDTT_iy[] a = new VDTT_iy[0];
   public VDTT_iy[] b = new VDTT_iy[0];
   private VDTT_iq c;
   private VDTT_hs[][] d;
   private static int N;
   private VDTT_hm O;
   private Item P;
   private Vector Q = new Vector();
   private int R;

   public VDTT_mp(VDTT_p var1) {
      this.I = var1;
      this.a(316, 213);
      this.K = false;
      this.c = new VDTT_iq(new VDTT_hp(1001, Caption.AM), 4, this.f(), super.q - 8, 23, 76, this);
      this.w();
      this.f(N);
   }

   public final void w() {
      this.b = this.a;
      this.d = new VDTT_hs[2][];
      this.d[0] = new VDTT_hs[1];
      this.d[0][0] = new VDTT_hs((byte)1, 4, this.c.i() + 28, super.q - 8, 126, 18, this.b.length);
   }

   private void x() {
      if (this.O == null) {
         try {
            Message.c((byte)-55).l();
         } catch (Exception var2) {
            VDTT_jb.a(var2);
         }
      }
   }

   public final void a(Message var1) {
      try {
         VDTT_hm var2;
         (var2 = new VDTT_hm()).a[0] = var1.b.c();
         var2.a[1] = var1.b.c();
         var2.b = var1.h();
         var2.c = var1.h();
         var2.d = new String[var1.readByte()];
         Vector var3 = new Vector();

         for(int var4 = 0; var4 < var2.d.length; ++var4) {
            var2.d[var4] = var1.j().trim();
            Item var5;
            (var5 = new Item()).a(var1);
            if (var4 == 0) {
               var2.e.add(var2.d[var4]);
               var2.f.add(var3);
            } else if (!var2.e.contains(var2.d[var4])) {
               var2.e.add(var2.d[var4]);
               var3 = new Vector();
               var2.f.add(var3);
            }

            ((Vector)var2.f.get(var2.e.indexOf(var2.d[var4]))).add(var5);
         }

         this.O = var2;
         String[] var9 = VDTT_jb.a(var2.a[1], "\\n");
         this.Q.clear();
         String var10;
         if ((var10 = var2.a()).length() > 0) {
            this.Q.add("c#yellow" + var10);
         }

         int var7;
         for(var7 = 0; var7 < var9.length; ++var7) {
            this.Q.addAll(VDTT_dg.a(VDTT_dg.d, var9[var7], super.q - 8 - 35));
         }

         this.Q.add("c#blue" + Caption.kh);
         this.R = this.Q.size();

         for(var7 = 0; var7 < var2.e.size(); ++var7) {
            this.Q.add("c#cyan" + "- " + (String)var2.e.get(var7));
            this.Q.add("");
            this.Q.add("");
         }

         VDTT_hs[] var8;
         (var8 = new VDTT_hs[1])[0] = new VDTT_hs((byte)1, 13, this.f() + 35, super.q - 8 - 18, 135, 15, this.Q.size());
         this.d[1] = var8;
      } catch (Exception var6) {
      }
   }

   private void f(int var1) {
      this.c.a(var1);
      if (var1 == 0) {
         this.z();
      }

      this.x();
   }

   private void z() {
      try {
         Message var1;
         (var1 = new Message((byte)-54)).a(this.c.h());
         var1.a((int)0);
         var1.l();
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public final void a_() {
      this.c.e();

      for(int var1 = 0; var1 < this.d.length; ++var1) {
         if (this.d[var1] != null) {
            for(int var2 = 0; var2 < this.d[var1].length; ++var2) {
               if (this.d[var1][var2] != null) {
                  this.d[var1][var2].a();
               }
            }
         }
      }

   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      this.c(var1, var2);
      switch(var1) {
      case 1002:
         this.w();
      default:
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.c.f());
      switch(this.c.h()) {
      case 0:
         var1.addElement(this.d[0][0].a(1003, this));
         break;
      case 1:
         for(int var2 = 0; var2 < this.O.f.size(); ++var2) {
            for(int var3 = 0; var3 < ((Vector)this.O.f.get(var2)).size(); ++var3) {
               Item var4 = (Item)((Vector)this.O.f.get(var2)).get(var3);
               int var5 = this.d[this.c.h()][0].objX + 4 + var3 * 35;
               int var6 = this.d[this.c.h()][0].objY - this.d[this.c.h()][0].f + (this.R + var2 * 3) * this.d[this.c.h()][0].h + 15;
               if (this.d[1][0].b(this.R + var2 * 3 + 3)) {
                  VDTT_hl var7 = new VDTT_hl(6000, var5, var6, var5 + 28, var6 + 28, this.d[this.c.h()][0], this, var4);
                  var1.addElement(var7);
               }
            }
         }

         var1.addElement(this.d[1][0].a(1030, this));
      }

      return var1;
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.cK, (byte)2, this.K);
      this.c.a(var1);
      switch(this.c.h()) {
      case 0:
         Graphics var2 = var1;
         VDTT_mp var5 = this;
         this.b(var1, this.d[this.c.h()][0]);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.cL, 20, -15, 2, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.cM, 70, -15, 2, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.pz, 130, -15, 2, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.kJ, 195, -15, 2, -6488, -10275328);
         VDTT_dg.b(VDTT_dg.e, var1, Caption.kK, 260, -15, 2, -6488, -10275328);
         this.a(var1, this.d[this.c.h()][0]);

         for(int var3 = 0; var3 < var5.d[var5.c.h()][0].i; ++var3) {
            if (var5.d[var5.c.h()][0].b(var3)) {
               VDTT_iy var4 = var5.b[var3];
               VDTT_dg.b(VDTT_dg.d, var2, "" + (var3 + 1), 20, 8 + var3 * var5.d[var5.c.h()][0].h, 2, -3604601, -16777216);
               VDTT_dg.b(VDTT_dg.d, var2, var4.b, 70, 8 + var3 * var5.d[var5.c.h()][0].h, 2, -3604601, -16777216);
               VDTT_dg.b(VDTT_dg.d, var2, VDTT_jb.c(var4.e), 130, 8 + var3 * var5.d[var5.c.h()][0].h, 2, -3604601, -16777216);
               VDTT_dg var10000 = VDTT_dg.d;
               DataCenter.d();
               VDTT_dg.b(var10000, var2, DataCenter.c(var4.f), 195, 8 + var3 * var5.d[var5.c.h()][0].h, 2, -3604601, -16777216);
               VDTT_dg.b(VDTT_dg.d, var2, var4.g, 260, 8 + var3 * var5.d[var5.c.h()][0].h, 2, -3604601, -16777216);
            }
         }

         var5.a(var2);
         var5.d[var5.c.h()][0].a(var2, var5);
         return;
      case 1:
         this.f(var1);
      default:
      }
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         if (var1.j.k >= 0) {
            N = var1.j.k;
            this.f(var1.j.k);
            return;
         }
         break;
      case 1003:
         if (var1.j.k >= 0) {
            this.a(this.b[var1.j.k].b, var1.j.k, var2, var3);
            return;
         }
         break;
      case 6000:
         this.P = (Item)var1.k;
         this.k = c(this, var1, this.P);
      }

   }

   private void f(Graphics var1) {
      try {
         this.a(var1, this.d[this.c.h()][0]);

         int var2;
         for(var2 = 0; var2 < this.d[this.c.h()][0].i; ++var2) {
            VDTT_dg.a(var1, (String)this.Q.get(var2), 2, 6 + var2 * this.d[this.c.h()][0].h, 0, -1);
         }

         for(var2 = 0; var2 < this.O.f.size(); ++var2) {
            for(int var3 = 0; var3 < ((Vector)this.O.f.get(var2)).size(); ++var3) {
               Item var4 = (Item)((Vector)this.O.f.get(var2)).get(var3);
               b(var1, 4 + var3 * 35, (this.R + var2 * 3) * this.d[this.c.h()][0].h + 15, var4, this.P != null && this.P.equals(var4));
            }
         }

         this.a(var1);
         this.d[this.c.h()][0].b(var1, this);
      } catch (Exception var5) {
      }
   }
}
