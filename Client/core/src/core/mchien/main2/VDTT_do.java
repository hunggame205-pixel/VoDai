package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import java.io.DataInputStream;

final class VDTT_do implements Runnable {
   // $FF: synthetic field
   final String a;
   // $FF: synthetic field
   final int b;
   // $FF: synthetic field
   final VDTT_dn c;

   VDTT_do(VDTT_dn var1, String var2, int var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public final void run() {
      try {
         VDTT_dn var10000 = this.c;
         VDTT_dt var2 = new VDTT_dt(this.a, this.b);
         var10000.d = var2;
         var10000 = this.c;
         VDTT_df var6 = new VDTT_df(this.c.d.a());
         var10000.e = var6;
         var10000 = this.c;
         VDTT_dt var1;
         (var1 = this.c.d).b = var1.a.getInputStream();
         VDTT_de var8 = new VDTT_de(new DataInputStream(var1.b));
         var10000.f = var8;
         if (!this.c.b) {
            this.c.b();
            return;
         }

         while(this.c.p == null || !this.c.p.isAlive() || this.c.q == null || !this.c.q.isAlive()) {
            VDTT_jb.a(100L);
         }

         VDTT_jb.a(100L);
         boolean var9 = false;
         this.c.c = false;
         synchronized(this.c.i) {
            this.c.i.notify();
         }

         VDTT_d.g();
         if (Gdx.files.isExternalStorageAvailable()) {
            if (Gdx.app.getType() != ApplicationType.Desktop) {
               VDTT_dn.a(this.c, Gdx.files.getExternalStoragePath());
            } else {
               String var5;
               if ((var5 = VDTT_da.h("arr_binary")) == null || var5.length() == 0) {
                  var5 = VDTT_jb.d(15);
                  VDTT_da.a("arr_binary", var5);
               }

               VDTT_dn.a(this.c, Gdx.files.getExternalStoragePath() + Gdx.files.getLocalStoragePath() + var5);
            }
         } else {
            VDTT_dn.a(this.c, Gdx.files.getLocalStoragePath());
         }

         var10000 = this.c;
         DataCenter var7 = DataCenter.d();
         Message var10;
         (var10 = new Message((byte)-113)).a(var7.m);
         var10.a(var7.t);
         var10.b(var7.n);
         var10.b(var7.o);
         var10.a(var7.p);
         var10.a((int)VDTT_eq.a().b(2));
         var10.a(var7.r);
         var10000.a(var10);
         this.c.m.a();
      } catch (Exception var4) {
         this.c.b();
         Thread.currentThread().interrupt();
      }

   }
}
