package core.mchien.main2;

import java.util.Vector;

public final class VDTT_gj extends VDTT_ae {
   public VDTT_hs a;
   public VDTT_hp b;
   public VDTT_gg c;
   private Vector[] i;
   public MainScreen d;
   private int j;
   public String[][] e;
   public boolean[] f;
   public boolean[] g;
   public boolean h;

   public VDTT_gj(VDTT_hp var1, int var2, int var3, int var4, int var5, int var6, int var7, MainScreen var8) {
      boolean var9 = false;
      var9 = true;
      byte var15 = 87;
      byte var12 = 1;
      VDTT_hp var11 = var1;
      VDTT_gj var10 = this;
      this.f(var12, var4);
      this.d(var15, var6);
      this.j = var2;
      this.d = var8;
      this.b = var1;
      if (var1.c.length * 31 > var6 - 20) {
         var7 = (var6 - 20) / 31 * 31;
      } else {
         var7 = var1.c.length * 31;
      }

      this.a = new VDTT_hs((byte)1, var8.q - 4, 10, var15 - 40, var7, 31, var1.c.length);
      byte var13 = -1;
      this.a.I = var13;
      this.c = new VDTT_gg(0, 0, 0, 16, (byte)0, var1.c.length);
      this.i = new Vector[var1.c.length];
      this.e = new String[var1.c.length][];
      this.f = new boolean[var1.c.length];
      this.g = new boolean[var1.c.length];

      for(var3 = 0; var3 < var10.i.length; ++var3) {
         var10.i[var3] = new Vector();
         String[] var14;
         if ((var14 = var11.c[var3].trim().split(" ")).length >= 3 && !var11.c[var3].contains("\n")) {
            var10.e[var3] = new String[2];
            StringBuilder var10000;
            String[] var10002;
            if (var14.length >= 4) {
               var10.e[var3][0] = var14[0] + " " + var14[1];
               var10.e[var3][1] = "";

               for(var5 = 2; var5 < var14.length; ++var5) {
                  var10000 = new StringBuilder();
                  var10002 = var10.e[var3];
                  var10002[1] = var10000.append(var10002[1]).append(var14[var5]).append(" ").toString();
               }

               var10.e[var3][1] = var10.e[var3][1].trim();
            } else {
               var10.e[var3][0] = var14[0];
               var10.e[var3][1] = "";

               for(var5 = 1; var5 < var14.length; ++var5) {
                  var10000 = new StringBuilder();
                  var10002 = var10.e[var3];
                  var10002[1] = var10000.append(var10002[1]).append(var14[var5]).append(" ").toString();
               }

               var10.e[var3][1] = var10.e[var3][1].trim();
            }
         } else {
            var10.e[var3] = VDTT_dg.b(VDTT_dg.e, var11.c[var3], var15 - 10);
         }
      }

   }

   public final void a() {
      this.a.a();
      this.c.a();
   }

   public final void a(int var1) {
      if (!this.g[var1]) {
         this.b.b = var1;

         for(var1 = 0; var1 < this.i.length; ++var1) {
            for(int var2 = 0; var2 < this.i[var1].size(); ++var2) {
               this.d.f.removeElement(this.i[var1].elementAt(var2));
            }
         }

         for(var1 = 0; var1 < this.i[this.b.b].size(); ++var1) {
            this.d.f.addElement(this.i[this.b.b].elementAt(var1));
         }

         for(var1 = 0; var1 < this.d.f.size(); ++var1) {
            if (this.d.f.get(var1) instanceof VDTT_an) {
               this.d.f.remove(var1);
               return;
            }
         }

      }
   }

   public final void a(VDTT_m var1, int var2) {
      this.i[var2].addElement(var1);
   }

   public final void a(Vector var1, int var2) {
      for(int var3 = 0; var3 < var1.size(); ++var3) {
         this.i[var2].addElement((VDTT_m)var1.elementAt(var3));
      }

   }

   public final void b() {
      for(int var1 = 0; var1 < this.i.length; ++var1) {
         for(int var2 = 0; var2 < this.i[var1].size(); ++var2) {
            this.d.f.removeElement(this.i[var1].elementAt(var2));
         }
      }

   }
}
