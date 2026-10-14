package core.mchien.main2;

import java.util.Vector;

public final class VDTT_gw extends VDTT_ae {
   public Vector a = new Vector();
   public VDTT_iw b;
   private String[] c;
   private int d;
   private static VDTT_gw e;

   public static VDTT_gw a() {
      if (e == null) {
         e = new VDTT_gw();
      }

      VDTT_gw var10000 = e;
      var10000.f(var10000.objX, 10);
      return e;
   }

   public final void b() {
      this.b = null;
      this.a.clear();
   }

   public final void a(Graphics var1) {
      try {
         int var2 = var1.e;
         int var3 = var1.f;
         this.a(var1, this.objX, this.objY);
         if (this.b != null) {
            this.a(var1, -10, -8, this.q + 20, this.r + 16, -11, 55, 56, 1, 1);

            for(int var4 = 0; var4 < this.c.length; ++var4) {
               VDTT_dg.a(this.b.b, var1, this.c[var4], this.q / 2, -1 + this.r / 2 + VDTT_dg.a(this.b.b) / 2 + var4 * VDTT_dg.a(this.b.b) - this.c.length * VDTT_dg.a(this.b.b) / 2, 2, this.b.d);
            }
         }

         this.a(var1, var2, var3);
      } catch (Exception var5) {
         VDTT_jb.a(var5);
      }
   }

   public void c() {
      this.d = 0;
      this.b = (VDTT_iw)this.a.firstElement();
      this.q = (short)VDTT_dg.b(this.b.b, this.b.a);
      if (this.q > DataCenter.d().n - 200) {
         this.q = (short)(DataCenter.d().n - 200);
      }

      this.c = VDTT_dg.b(this.b.b, this.b.a, this.q);
      this.b.c = this.c.length * 50;
      if (this.b.c < 80) {
         this.b.c = 80;
      }

      this.r = (short)(this.c.length * VDTT_dg.a(this.b.b));
      this.f(DataCenter.d().n / 2 - this.q / 2, DataCenter.d().o - this.r - 24);
   }

   public final void d() {
      try {
         if (this.b == null && this.a.size() > 0) {
            this.c();
         }

         if (this.b != null) {
            ++this.d;
            if (this.d == this.b.c) {
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
