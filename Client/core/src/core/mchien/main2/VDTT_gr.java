package core.mchien.main2;

import java.util.Vector;

public final class VDTT_gr extends VDTT_ae {
   public Vector a = new Vector();
   public VDTT_gs b;
   private String[] d;
   private int e;
   private int f;
   private static VDTT_gr g;
   public boolean c = false;

   public static VDTT_gr a() {
      if (g == null) {
         g = new VDTT_gr();
      }

      return g;
   }

   public final void b() {
      this.b = null;
      this.a.clear();
   }

   public final void a(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      this.a(var1, this.objX, this.objY);
      if (this.b != null) {
         VDTT_aa.a(var1, 18, 0, -80, -2, this.q + 160, (int)(this.r + 6));
         var1.d(-50, 0, this.q + 100, this.r + 10);

         for(int var5 = 0; var5 < this.d.length; ++var5) {
            int var4 = var5 * (VDTT_dg.a(this.b.b) + 2) + VDTT_dg.a(this.b.b) / 2 - this.f + 2;
            if (-20 <= var4 && var4 <= 20 + this.r) {
               VDTT_dg.a(this.b.b, var1, this.d[var5], this.q / 2, var4, 2, this.b.d, 3, 1);
            }
         }

         this.a(var1, 0, 0);
         var1.d(0, 0, DataCenter.d().n, DataCenter.d().o);
      }

      this.a(var1, var2, var3);
   }

   public void c() {
      this.e = this.f = 0;
      this.b = (VDTT_gs)this.a.firstElement();
      this.q = (short)VDTT_dg.b(this.b.b, this.b.a);
      if (this.q > DataCenter.d().n - 140) {
         this.q = (short)(DataCenter.d().n - 140);
      }

      this.d = new String[]{this.b.a};
      this.r = (short)VDTT_dg.a(this.b.b);
      this.r = (short)(this.r + 3);
      this.f(DataCenter.d().n / 2 - this.q / 2, DataCenter.d().o / 2);
   }

   public final void d() {
      try {
         if (this.c) {
            this.c = false;
            this.a.clear();
            this.b = null;
         } else {
            if (this.b == null && this.a.size() > 0) {
               this.c();
            }

            if (this.b != null) {
               ++this.e;
               if (this.e % (this.b.c / this.d.length) == 0) {
                  ++this.f;
               } else if (this.f % (VDTT_dg.a(this.b.b) + 2) != 0) {
                  ++this.f;
               }

               if (this.f >= (this.d.length - 1) * (VDTT_dg.a(this.b.b) + 2)) {
                  this.f = (this.d.length - 1) * (VDTT_dg.a(this.b.b) + 2);
               }

               if (this.e == this.b.c) {
                  this.b = null;
                  this.a.removeElementAt(0);
               }

            }
         }
      } catch (Exception var1) {
      }
   }

   public static String a(String var0, String var1, String var2) {
      StringBuffer var3;
      int var4;
      for(var3 = new StringBuffer(); (var4 = var0.indexOf(var1)) != -1; var0 = var0.substring(var4 + var1.length())) {
         var3.append(var0.substring(0, var4) + var2);
      }

      var3.append(var0);
      return var3.toString();
   }
}
