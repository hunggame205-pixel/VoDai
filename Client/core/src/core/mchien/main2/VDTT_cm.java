package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import java.util.Vector;

public final class VDTT_cm extends VDTT_cf {
   public VDTT_lk J;
   private String N;
   public static boolean K;
   public static boolean L;
   private Vector O = new Vector();
   private long P = 0L;
   public boolean[] M = new boolean[3];
   private boolean Q = true;
   private static boolean R = false;
   private boolean S;

   public VDTT_cm() {
      Graphics.e();
      this.N = VDTT_jb.e(DataCenter.d().v);
      boolean var1 = VDTT_da.g("arr_savemap");
      VDTT_da.j("arr_savemap" + VDTT_aa.a());
      DataCenter.d().a(var1);
   }

   private static boolean a(Vector var0, int var1, String[] var2) {
      VDTT_en var3 = new VDTT_en();

      try {
         String[] var12 = var2[var1].split(";");
         var3.a = Short.parseShort(var12[0]);
         var3.d = var12[1].trim();
         var3.e = var12[2].trim();
         long var6 = (long)VDTT_da.f("arr_check_" + var3.a);
         var3.c = var6;
         long var9 = 1L;
         var3.b = var9;
         if (!var3.d.contains("jasr.dll") && !var3.d.contains("vdtt.exe") && !var3.d.contains("core.jar") && !var3.d.contains("gdx.jar")) {
            if (var3.a()) {
               var9 = (long)Integer.parseInt(var12[3].trim());
               var3.b = var9;
            } else {
               DataCenter.d();
               var9 = (long)Integer.parseInt(var12[3 + DataCenter.a(var3.d)].trim());
               var3.b = var9;
            }
         } else {
            var3.f = true;
            var9 = var3.c;
            var3.b = var9;
         }
      } catch (Exception var11) {
      }

      var0.add(var3);
      return true;
   }

   private void v() {
      VDTT_bi var1;
      (var1 = new VDTT_bi(Caption.AY, this, 0, 2112)).a = this;
      var1.a(Caption.fG);
      var1.w();
      this.a(var1);
   }

   private void w() {
      for(int var1 = 0; var1 < this.O.size(); ++var1) {
         if (!((VDTT_en)this.O.get(var1)).f) {
            return;
         }
      }

      this.y();
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (var1.b == 2112) {
         this.Q = true;
         DataCenter.d().a(false);
         if (VDTT_jb.b < 120000) {
            VDTT_jb.b += 20000;
            return;
         }
      } else if (var1.b == 2111) {
         this.x();
      }

   }

   private void x() {
      this.J = new VDTT_lk(this);
      long var1 = this.P;
      this.J.a.f((int)(var1 / 1024L));
      VDTT_dn.a().j = 0;

      for(int var3 = 0; var3 < this.O.size(); ++var3) {
         VDTT_en var2;
         if (!(var2 = (VDTT_en)this.O.get(var3)).f) {
            if (var2.b() && !this.M[1] || var2.c() && !this.M[2]) {
               var2.f = true;
               this.w();
            } else if (var2.a()) {
               (new Thread(new VDTT_cn(this, var2))).start();
            } else {
               (new Thread(new VDTT_co(this, var2))).start();
            }
         }
      }

   }

   private void y() {
      this.S = true;
      if (this.J != null) {
         this.J.a(true);
      }

   }

   public final void a_() {
      super.a_();
      if (this.J != null) {
         if (!this.S) {
            if (this.b.size() == 1 && !this.Q) {
               VDTT_ll var10000 = this.J.a;
               int var2 = VDTT_dn.a().j / 1024;
               VDTT_ll var1 = var10000;
               if (var10000.c < var2) {
                  var1.c = var2;
               } else {
                  var1.c += var1.d / 10000;
               }

               if (var1.c > var1.d * 99 / 100) {
                  var1.c = var1.d * 99 / 100;
               }
            }
         } else {
            this.J.a_();
         }
      }

      if (this.Q) {
         DataCenter.d();
         if (DataCenter.a()) {
            this.Q = false;
            (new Thread(new VDTT_cp(this))).start();
         }
      }

   }

   public final void b(Graphics var1) {
      super.b(var1);
      if (this.J != null) {
         this.J.b(var1);
      }

      this.a(var1, 0, 0);
      if (this.J != null && this.P > 0L) {
         StringBuilder var10001 = (new StringBuilder()).append(Caption.fK);
         int var2 = VDTT_dn.a().j / 1024;
         VDTT_dg.a(var1, var10001.append(var2 / 1024 + "." + var2 % 1024 / 102 + "MB").toString(), 8 + VDTT_d.g().m / 2, 8, 0, -1);
      } else if (super.c instanceof VDTT_cm) {
         DataCenter.o();
         VDTT_dg.a(var1, Caption.vT, this.q / 2, this.r - 35, 2, -2560);
      }

      if (!DataCenter.l()) {
         VDTT_dg.a(var1, Caption.fL + this.N, this.q - 8 - VDTT_d.g().m / 2, 8, 1, -1);
      }

   }

   // $FF: synthetic method
   static void a(VDTT_cm var0) {
      var0.v();
   }

   // $FF: synthetic method
   static void b(VDTT_cm var0) {
      var0.w();
   }

   // $FF: synthetic method
   static void c(VDTT_cm var0) {
      var0 = var0;

      try {
        
         VDTT_dn.a().j = 0;
         var0.P = 0L;
         Vector var1 = new Vector();
         String var2;
         if (Gdx.app.getType() == ApplicationType.Android) {
            var2 = DataCenter.d().linkCheckAPK;
         } else if (Gdx.app.getType() == ApplicationType.iOS) {
            var2 = DataCenter.d().linkCheckIOS;
         } else {
            var2 = DataCenter.d().linkCheckPC;
         }

         var2 = VDTT_da.a(var2, 20);
         String[] var3 = new String[2];
         if (var2 == null) {
            if (Gdx.app.getType() == ApplicationType.Desktop) {
               (var3 = new String[8])[2] = "1;font.zip;font_zip";
               var3[3] = "2;mapmini.zip;map_mini_zip";
               var3[4] = "3;map.zip;map_zip";
               var3[5] = "4;mapscale.zip;mapscale_zip";
               var3[6] = "5;iconTree.zip;tree_zip";
               var3[7] = "6;iconClient.zip;client_zip";
               var3[8] = "7;iconChar.zip;char_zip";
            }

            var3[0] = DataCenter.d().v + ";" + DataCenter.d().v + ";" + DataCenter.d().v;
            var3[1] = "0;arr_data_game.bin;arr_data_game";
         } else {
            var3 = var2.split("\r\n");
         }

         int var7 = Integer.parseInt(var3[0].split(";")[0]);
         DataCenter var10001 = DataCenter.d();
         boolean var4 = DataCenter.d().v > var7;
         DataCenter var8 = var10001;
         DataCenter.al = true;
         DataCenter.aj = var4;
         if (DataCenter.aj) {
          //  var8.linkResources = "https://cdn.vngates.com:5443/grosadlbmczsa2lkdqw12envasrdlflkagasdsx4a345sdfv34lkl546ddhavvdlkslmbadf234dsalj89nap3qpwqsao/";
            VDTT_d.g();
         } else {
       //   var8.linkResources = "https://goirong.vngates.com/gro/";
         }

         var8.linkCheckData = var8.linkResources + "new/";
         var8.linkCheckPC = var8.linkCheckData + "checkpc.txt";
         var8.linkCheckAPK = var8.linkCheckData + "checkandroid.txt";
         var8.linkCheckIOS = var8.linkCheckData + "checkios.txt";
         VDTT_da.b(var4);
         VDTT_d var9 = VDTT_d.g();
         (new Thread(new VDTT_g(var9))).start();
         boolean var11 = DataCenter.aj;
         if (DataCenter.aj) {
            VDTT_jb.b = 120000;
         }

         var1.clear();
         if (!DataCenter.l()) {
            for(var7 = 1; var7 < var3.length; ++var7) {
               a(var1, var7, var3);
            }
         }

         var0.O = var1;
         if (R) {
            R = false;
            VDTT_d.g().a(false);
         }

         for(int var6 = 0; var6 < var0.O.size(); ++var6) {
            VDTT_en var10;
            if ((var10 = (VDTT_en)var0.O.get(var6)).c != -1L && var10.b != 0L && var10.b != var10.c) {
               var0.P += var10.b;
               if (var10.a()) {
                  DataCenter.d().aO = false;
               }
            } else {
               var10.f = true;
            }
         }

         if (var0.P <= 0L) {
            var0.J = new VDTT_lk(var0);
            var0.y();
            return;
         }

         var0.x();
      } catch (Exception var5) {
         var0.v();
      }

   }
}
