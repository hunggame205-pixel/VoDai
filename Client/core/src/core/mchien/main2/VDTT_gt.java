package core.mchien.main2;

import java.util.Vector;

public final class VDTT_gt extends VDTT_ae {
   private static VDTT_gt f;
   public Vector a;
   public Vector b;
   public Vector c;
   public int d;
   public long e;

   public VDTT_gt() {
      this.d(DataCenter.d().n - 200, 70);
      this.f(DataCenter.d().n / 2 - this.q / 2, DataCenter.d().o - 120);
      this.a = new Vector();
      this.b = new Vector();
      this.c = new Vector();
   }

   public final void a() {
      this.a.clear();
      this.b.clear();
      this.c.clear();
   }

   public static VDTT_gt b() {
      if (f == null) {
         f = new VDTT_gt();
      }

      return f;
   }

   public final void a(Graphics var1) {
      try {
         int var2 = var1.e;
         int var3 = var1.f;
         this.a(var1, this.objX, this.objY);

         for(int var5 = 0; var5 < this.a.size(); ++var5) {
            VDTT_gu var4 = (VDTT_gu)this.a.elementAt(var5);
            var1.d(var4.e);
            if (var4.a.length() > 100) {
               for(int var6 = var4.a.length() / 2; var6 >= 0; --var6) {
                  if (var4.a.substring(var6 - 1, var6).equals(" ")) {
                     VDTT_dg.a(var4.b, var1, var4.a.substring(0, var6), this.q / 2, var4.d, 2, var4.c);
                     String var10004 = var4.a;
                     VDTT_dg.a(var4.b, var1, var10004.substring(var6, var10004.length()), this.q / 2, var4.d + 10, 2, var4.c);
                     break;
                  }
               }
            } else {
               VDTT_dg.a(var4.b, var1, var4.a, this.q / 2, var4.d, 2, var4.c);
            }

            var1.l = 1.0F;
         }

         this.a(var1, var2, var3);
      } catch (Exception var7) {
      }
   }

   public final boolean a(String var1) {
      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         if (((VDTT_gu)this.a.get(var2)).a.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public final void a(String var1, VDTT_dg var2, int var3) {
      if (System.currentTimeMillis() - this.e < 100L) {
         if (this.c.size() > 100) {
            this.c.remove(0);
         }

         this.c.add(new VDTT_gu(this, var1, var2, var3));
      } else {
         this.e = System.currentTimeMillis();
         if (this.a.size() == 0) {
            this.a.add(new VDTT_gu(this, var1, var2, var3));
         } else {
            VDTT_gu var4;
            if ((var4 = (VDTT_gu)this.a.lastElement()).d >= this.r) {
               this.a.add(new VDTT_gu(this, var1, var2, var3, var4.d - 15));
            } else {
               this.a.add(new VDTT_gu(this, var1, var2, var3));
            }
         }
      }
   }

   // $FF: synthetic method
   public static Vector a(VDTT_gt var0) {
      return var0.a;
   }
}
