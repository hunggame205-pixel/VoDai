package core.mchien.main2;

import java.util.Vector;

public final class VDTT_bk extends VDTT_an {
   private VDTT_hs l;
   private VDTT_ez m;
   private VDTT_iu[] n;
   private long I;
   private static Vector J;

   public VDTT_bk(int var1, int var2, MainScreen var3, VDTT_ez var4) {
      this.a = var3;
      this.m = var4;
      this.f(var1, var2);
      this.I = VDTT_jb.a();
      this.d();
   }

   private void d() {
      Vector var1 = new Vector();
      String var2 = "c#yellow" + this.m.c().b;
      if (this.m.i) {
         var2 = var2 + Caption.wZ;
      }

      var1.addElement(var2);
      if (!J.contains(this.m.a) && this.m.e >= 0) {
         var1.addElement("c#white" + Caption.zg[0]);
         var1.addElement("c#white" + Caption.zg[1]);
      }

      if (this.m.c().c.length() > 0) {
         var1.addElement("c#white" + this.m.b());
      }

      for(int var8 = 0; var8 < this.m.g.size(); ++var8) {
         var1.addElement("c#white" + ((VDTT_ez)this.m.g.get(var8)).b());
      }

      this.d(150, 62);
      Vector var10 = new Vector();

      int var4;
      for(var4 = 0; var4 < var1.size(); ++var4) {
         String var3 = String.valueOf(var1.elementAt(var4));
         if (var4 == 0) {
            Vector var13 = VDTT_dg.a(VDTT_dg.e, var3, this.q - 20);

            for(int var11 = 0; var11 < var13.size(); ++var11) {
               var10.add(new VDTT_iu(0, (String)var13.elementAt(var11)));
            }
         } else {
            byte var5 = 1;
            if (!J.contains(this.m.a) && this.m.e >= 0) {
               if (var4 == 1) {
                  var5 = 2;
               } else if (var4 == 2) {
                  var5 = 3;
                  if (this.m.a == 118) {
                     continue;
                  }
               }
            }

            Vector var9 = VDTT_dg.a(VDTT_dg.d, var3, this.q - 20);

            for(int var6 = 0; var6 < var9.size(); ++var6) {
               var10.add(new VDTT_iu(var5, (String)var9.elementAt(var6)));
            }
         }
      }

      this.n = new VDTT_iu[var10.size()];

      for(var4 = 0; var4 < var10.size(); ++var4) {
         this.n[var4] = (VDTT_iu)var10.elementAt(var4);
      }

      if (this.n.length < 4) {
         this.d(150, 49);
      }

      this.l = new VDTT_hs((byte)1, 0, 5, this.q, this.r - 10, 13, this.n.length);
      if (this.m.c().b.length() == 0) {
         try {
            Message var12;
            (var12 = new Message((byte)-67)).b(this.m.a);
            var12.l();
            return;
         } catch (Exception var7) {
         }
      }

   }

   public final void b(Graphics var1) {
      this.e(var1);
      this.a(var1, this.l);

      for(int var2 = 0; var2 < this.n.length; ++var2) {
         if (this.n[var2].a == 0) {
            VDTT_dg.d(VDTT_dg.e, var1, this.n[var2].b, 6, 5 + var2 * this.l.h, 0, -1, -16777216);
         } else if (this.n[var2].a == 2) {
            VDTT_dg.d(VDTT_dg.d, var1, this.n[var2].b + " " + VDTT_jb.i(this.m.e / 1000), 6, 5 + var2 * this.l.h, 0, -1, -16777216);
         } else if (this.n[var2].a == 3) {
            VDTT_ez var3;
            VDTT_dg.d(VDTT_dg.d, var1, this.n[var2].b + " " + VDTT_jb.i(((var3 = this.m).e - (int)(VDTT_jb.a() - var3.d)) / 1000), 6, 5 + var2 * this.l.h, 0, -1, -16777216);
         } else if (this.m.a == 113) {
            VDTT_dg.d(VDTT_dg.d, var1, this.m.b(), 6, 5 + var2 * this.l.h, 0, -1, -16777216);
         } else {
            VDTT_dg.d(VDTT_dg.d, var1, this.n[var2].b, 6, 5 + var2 * this.l.h, 0, -1, -16777216);
         }
      }

      this.a(var1);
   }

   public final void a_() {
      this.l.a();
      if (VDTT_jb.a() - this.I >= 5000L) {
         this.a.b((VDTT_m)this);
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).addElement(new VDTT_hl(1001, this.l.objX, this.l.objY, this.l.objX + this.l.q, this.l.objY + this.l.r, this.l, this));
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      this.I = VDTT_jb.a();
   }

   public final void a(String var1, String var2) {
      this.m.c().b = var1;
      this.m.c().c = var2;
      this.d();
   }

   static {
      (J = new Vector()).add(37);
      J.add(67);
      J.add(68);
      J.add(69);
      J.add(70);
      J.add(71);
      J.add(72);
   }
}
