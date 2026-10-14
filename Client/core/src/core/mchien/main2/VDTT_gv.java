package core.mchien.main2;

import java.util.Vector;

public final class VDTT_gv extends VDTT_ae {
   public Vector a = new Vector();
   public VDTT_iw b;
   private String[] d;
   private boolean[] e;
   private int f;
   private int g;
   public int c;
   private static VDTT_gv h;

   public static VDTT_gv a() {
      if (h == null) {
         h = new VDTT_gv();
      }

      return h;
   }

   public final void b() {
      this.b = null;
      this.a.clear();
   }

   public final void a(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      if (!(VDTT_cw.v().c instanceof VDTT_cw) && !(VDTT_cw.v().c instanceof VDTT_gi)) {
         this.a(var1, this.objX, DataCenter.d().o - this.r);
      } else {
         this.a(var1, this.objX, this.objY - 10);
      }

      if (this.c != 0) {
         VDTT_aa.a(var1, 18, 0, -2, -2, this.c, (int)(this.r + 6));
      }

      if (this.b != null && this.c == this.q) {
         var1.d(0, 0, this.q, this.r);

         for(int var5 = 0; var5 < this.d.length; ++var5) {
            int var4 = var5 * (VDTT_dg.a(this.b.b) + 2) + VDTT_dg.a(this.b.b) / 2 - this.g + 2;
            if (-20 <= var4 && var4 <= 20 + this.r) {
               VDTT_dg.d(this.b.b, var1, this.d[var5], this.q / 2, var4, 2, this.b.d, -16777216);
            }
         }

         this.a(var1, 0, 0);
         var1.d(0, 0, DataCenter.d().n, DataCenter.d().o);
      }

      this.a(var1, var2, var3);
   }

   public void c() {
      this.f = this.g = 0;
      this.b = (VDTT_iw)this.a.firstElement();
      this.q = (short)(DataCenter.d().n - 230);
      Vector var1 = VDTT_dg.a(this.b.b, this.b.a, this.q - 20);
      this.d = new String[var1.size()];
      this.e = new boolean[var1.size()];

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         this.d[var2] = (String)var1.elementAt(var2);
         if (VDTT_di.c(this.d[var2]) != null) {
            this.e[var2] = true;
         }
      }

      this.b.c = this.d.length * 150;
      if (this.b.c < 80) {
         this.b.c = 80;
      }

      this.r = (short)VDTT_dg.a(this.b.b);
      this.r = (short)(this.r + 3);
      this.f((DataCenter.d().n - this.q) / 2, 55);
   }

   public final void d() {
      try {
         if (this.b == null && this.a.size() > 0) {
            this.c();
         }

         if (this.b != null && this.a.size() != 0) {
            this.c += 40;
            if (this.c < this.q) {
               return;
            }

            this.c = this.q;
         } else {
            this.c -= 40;
            if (this.c <= 0) {
               this.c = 0;
            }
         }

         if (this.b != null) {
            ++this.f;
            if (this.f % (this.b.c / this.d.length) == 0) {
               ++this.g;
            } else if (this.g % (VDTT_dg.a(this.b.b) + 2) != 0) {
               ++this.g;
            }

            if (this.g >= (this.d.length - 1) * (VDTT_dg.a(this.b.b) + 2)) {
               this.g = (this.d.length - 1) * (VDTT_dg.a(this.b.b) + 2);
            }

            if (this.f == this.b.c) {
               this.b = null;
               this.a.removeElementAt(0);
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
