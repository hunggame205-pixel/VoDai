package core.mchien.main2;

import java.util.Vector;

public abstract class VDTT_z extends VDTT_ae {
   public VDTT_dl o = new VDTT_dl();
   public VDTT_dm p;

   public abstract void b(Graphics var1);

   public abstract void a_();

   public abstract void c();

   public abstract Vector g();

   public abstract void a(VDTT_hl var1, int var2, int var3);

   public void r() {
   }

   public int a() {
      return this.objX;
   }

   public int b() {
      return this.objY;
   }

   public final void s() {
      try {
         if (this.p == null) {
            this.p = new VDTT_dm();
         }

         Vector var1;
         if ((var1 = this.g()) == null) {
            this.p.a = new VDTT_hl[0];
         } else {
            this.p.a = new VDTT_hl[var1.size()];
            if (!(this instanceof VDTT_m)) {
               for(int var5 = 0; var5 < var1.size(); ++var5) {
                  this.p.a[var5] = (VDTT_hl)var1.elementAt(var5);
               }

               return;
            }

            VDTT_m var2 = (VDTT_m)this;

            for(int var3 = 0; var3 < var1.size(); ++var3) {
               this.p.a[var3] = (VDTT_hl)var1.elementAt(var3);
               VDTT_hl var10000 = this.p.a[var3];
               var10000.c += var2.a.objX;
               var10000 = this.p.a[var3];
               var10000.e += var2.a.objX;
               var10000 = this.p.a[var3];
               var10000.d += var2.a.objY;
               var10000 = this.p.a[var3];
               var10000.f += var2.a.objY;
            }
         }
      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }

   }

   public final boolean e(int var1) {
      return this.p != null && this.p.a(0);
   }

   public final void d(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      this.a(var1, this.a(), this.b());
      this.b(var1);
      this.a(var1, var2, var3);
   }

   public final void a(Graphics var1, int var2, int var3) {
      var1.a(-var1.e, -var1.f);
      var1.a(var2, var3);
   }

   public void a(Graphics var1) {
      this.a((Graphics)var1, 0, 0);
      var1.d(0, 0, DataCenter.d().n, DataCenter.d().o);
      var1.a(this.a(), this.b());
   }

   public void a(Graphics var1, VDTT_hs var2) {
      var2.a(var1, this.a(), this.b(), var2.q, var2.r);
   }

   public final void b(Graphics var1, VDTT_hs var2) {
      var2.b(var1, this.a(), this.b(), var2.q, var2.r);
   }

   public static void a(Vector var0) {
      try {
         for(int var4 = 0; var4 < var0.size() - 1; ++var4) {
            MainScreen var1 = (MainScreen)var0.elementAt(var4);

            for(int var5 = var4 + 1; var5 < var0.size(); ++var5) {
               MainScreen var2;
               if ((var2 = (MainScreen)var0.elementAt(var5)).e < var1.e) {
                  MainScreen var3 = var2;
                  var2 = var1;
                  var1 = var3;
                  var0.setElementAt(var3, var4);
                  var0.setElementAt(var2, var5);
               }
            }
         }

      } catch (Exception var6) {
      }
   }
}
