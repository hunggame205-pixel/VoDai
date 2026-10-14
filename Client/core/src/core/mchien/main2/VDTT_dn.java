package core.mchien.main2;

import java.io.IOException;
import java.util.Vector;

public final class VDTT_dn {
   public static int a;
   private long r;
   boolean b;
   boolean c;
   VDTT_dt d;
   VDTT_df e;
   VDTT_de f;
   public Vector g = new Vector();
   Object h = new Object();
   Object i = new Object();
   public int j;
   public int k;
   public int l;
   public VDTT_t m;
   private static VDTT_dn s;
   private short t = -1;
   boolean n;
   boolean o;
   private Thread u;
   private Thread v;
   Thread p;
   Thread q;

   public static VDTT_dn a() {
      if (s == null) {
         s = new VDTT_dn();
      }

      return s;
   }

   public final void a(String var1, int var2) {
      try {
         VDTT_jb.a(var1 + ":" + var2);
         this.n = this.o = true;
         this.r = VDTT_jb.a();
         this.c = this.b = true;
         this.g.removeAllElements();
         this.f();
         this.g();
         this.b(var1, var2);
         this.e();

         for(int var4 = 0; var4 < 50 && this.n && this.o; ++var4) {
            VDTT_jb.a(100L);
         }

      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }

   private void b(String var1, int var2) {
      this.u = new Thread(new VDTT_do(this, var1, var2));
      this.u.start();
   }

   private void e() {
      this.v = new Thread(new VDTT_dp(this));
      this.v.start();
   }

   private void f() {
      this.p = new Thread(new VDTT_dq(this));
      this.p.start();
   }

   public final void a(int var1) {
      try {
         if (a <= 0) {
            VDTT_df var2;
            (var2 = new VDTT_df()).a(125);
            var2.a(var1);
            this.g.add(var2.a.toByteArray());
            synchronized(this.h) {
               this.h.notify();
            }

            var2.a();
         }
      } catch (Exception var4) {
      }
   }

   public final void b(int var1) {
      try {
         if (a <= 0) {
            VDTT_df var2;
            (var2 = new VDTT_df()).a(124);
            var2.a(var1);
            this.g.add(var2.a.toByteArray());
            synchronized(this.h) {
               this.h.notify();
            }

            var2.a();
         }
      } catch (Exception var4) {
      }
   }

   public final void a(short var1, short var2) {
      try {
         if (a <= 0) {
            int var3 = VDTT_cw.v().aj / 255;
            if (VDTT_cw.v().aj % 255 != 0) {
               ++var3;
            }

            VDTT_df var4;
            (var4 = new VDTT_df()).a(123);
            var4.a(var2 / 255 * var3 + var1 / 255);
            var4.a(var1 % 255);
            var4.a(var2 % 255);
            this.g.add(var4.a.toByteArray());
            synchronized(this.h) {
               this.h.notify();
            }

            var4.a();
         }
      } catch (Exception var6) {
      }
   }

   public final void b(short var1, short var2) {
      try {
         if (a <= 0) {
            int var3 = VDTT_cw.v().aj / 255;
            if (VDTT_cw.v().aj % 255 != 0) {
               ++var3;
            }

            VDTT_df var4;
            (var4 = new VDTT_df()).a(-84);
            var4.a(var2 / 255 * var3 + var1 / 255);
            var4.a(var1 % 255);
            var4.a(var2 % 255);
            this.g.add(var4.a.toByteArray());
            synchronized(this.h) {
               this.h.notify();
            }

            var4.a();
         }
      } catch (Exception var6) {
      }
   }

   public final void c(int var1) {
      try {
         if (a <= 0) {
            VDTT_df var2;
            (var2 = new VDTT_df()).a(-82);
            var2.a(var1);
            this.g.add(var2.a.toByteArray());
            synchronized(this.h) {
               this.h.notify();
            }

            var2.a();
         }
      } catch (Exception var4) {
      }
   }

   public final void d(int var1) {
      try {
         if (a <= 0) {
            VDTT_df var2;
            (var2 = new VDTT_df()).a(-83);
            var2.a(var1);
            this.g.add(var2.a.toByteArray());
            synchronized(this.h) {
               this.h.notify();
            }

            var2.a();
         }
      } catch (Exception var4) {
      }
   }

   public final void e(int var1) {
      try {
         VDTT_df var2;
         (var2 = new VDTT_df()).a(61);
         var2.a(var1);
         this.g.add(var2.a.toByteArray());
         synchronized(this.h) {
            this.h.notify();
         }
         var2.a();
      } catch (Exception var4) {
      }
   }

   public final void a(int var1, int var2) {
      try {
         VDTT_df var3 = new VDTT_df();
         if (var2 < 127) {
            var3.a(-65);
            var3.a(var1);
            var3.a(var2);
         } else {
            var3.a(-60);
            var3.a(var1);
            var3.b(var2);
         }

         this.g.add(var3.a.toByteArray());
         synchronized(this.h) {
            this.h.notify();
         }

         var3.a();
         if (((VDTT_gk)VDTT_cw.v().bg).x()) {
            VDTT_cw.v().c(Caption.wz, -16711681);
         }

      } catch (Exception var5) {
      }
   }

   public final void b(int var1, int var2) {
      try {
         System.out.println(var1+" "+var2);
         VDTT_df var3 = new VDTT_df();
         if (var2 < 127) {
            var3.a(-64);
            var3.a(var1);
            var3.a(var2);
         } else {
            var3.a(-87);
            var3.a(var1);
            var3.b(var2);
         }

         this.g.add(var3.a.toByteArray());
         synchronized(this.h) {
            this.h.notify();
         }

         var3.a();
         if (((VDTT_gk)VDTT_cw.v().bg).x()) {
            VDTT_cw.v().c(Caption.wz, -16711681);
         }

      } catch (Exception var5) {var5.printStackTrace();
      }
   }

   public final void c(int var1, int var2) {
      try {
         VDTT_df var3;
         (var3 = new VDTT_df()).a(-81);
         var3.a(var1);
         var3.c(var2);
         this.g.add(var3.a.toByteArray());
         synchronized(this.h) {
            this.h.notify();
         }

         var3.a();
      } catch (Exception var5) {
      }
   }

   public final void d(int var1, int var2) {
      try {
         VDTT_df var3;
         (var3 = new VDTT_df()).a(20);
         var3.a(var1);
         var3.c(var2);
         this.g.add(var3.a.toByteArray());
         synchronized(this.h) {
            this.h.notify();
         }

         var3.a();
      } catch (Exception var5) {
      }
   }

   private void a(VDTT_de var1, boolean var2)throws IOException {
      byte var3 = var1.a.readByte();
      byte var5 = 0;
      short var6 = 0;
      VDTT_cw var9;
      int var13;
      short var15;
      VDTT_cw var10000;
      VDTT_ek var16;
      int var10001;
      short var10002;
      int var18;
      VDTT_ic var19;
      int var21;
      switch(var3) {
      case -128:
         var3 = var1.a.readByte();
         var21 = var1.a.readInt();
         ++this.j;
         break;
      case -92:
         var10000 = VDTT_cw.v();
         var10001 = var1.a.readInt();
         var10002 = var1.a.readShort();
         short var29 = var1.a.readShort();
         var21 = var1.a.readUnsignedShort();
         short var22 = var29;
         var15 = var10002;
         var13 = var10001;
         var9 = var10000;

         try {
            (var16 = var9.m(var13)).ar = var21;
            if (var16.bV == null) {
               return;
            }

            (var16 = var16.bV).ah = var21;
            if ((var19 = DataCenter.d().T[var15].a()) == null) {
               return;
            }

            VDTT_gk var24;
            if ((var24 = var9.j(var22)) != null) {
               var24.Z = var16;
            }

            if (var16.b != VDTT_ek.m().b) {
               if (var16.bd.size() > 0) {
                  VDTT_gm var26 = (VDTT_gm)var16.bd.lastElement();
                  var16.ae = var26;
                  var16.af = var16.ae;
                  var16.bd.clear();
               } else {
                  var16.af = var16.ae;
               }

               var16.a(var19, var24, false);
               if (var9.bp != null && var9.bp.a(var16)) {
                  var9.bp.a = var24;
               }
            }

            if (var19.i()) {
               var16.o();
            }

            return;
         } catch (Exception var12) {
            VDTT_jb.a(var12);
            return;
         }
      case -91:
         var10000 = VDTT_cw.v();
         var10001 = var1.a.readInt();
         var10002 = var1.a.readShort();
         int var10003 = var1.a.readInt();
         var21 = var1.a.readUnsignedShort();
         var18 = var10003;
         var15 = var10002;
         var13 = var10001;
         var9 = var10000;

         try {
            (var16 = var9.m(var13)).ar = var21;
            if (var16.bV == null) {
               return;
            }

            (var16 = var16.bV).ah = var21;
            var19 = DataCenter.d().T[var15].a();
            VDTT_ek var20 = var9.m(var18);
            if (var16.b != VDTT_ek.m().b) {
               var16.a(var19, var20, false);
            }

            return;
         } catch (Exception var11) {
            VDTT_jb.a(var11);
            return;
         }
      case -87:
         VDTT_cw.v().a(var1.a.readInt(), (short)var1.a.readByte(), (short)-1);
         return;
      case -86:
         this.g.clear();
         a().b();
         DataCenter var28 = DataCenter.d();
         VDTT_cf var25 = VDTT_cq.v();
         var28.ai = var25;
         return;
      case -84:
         VDTT_cw.v().a(var1.a.readInt(), var1.a(), var1.a(), var1.a(), true);
         return;
      case -81:
         VDTT_cw.v().a(var1.a.readInt(), var1.a.readShort(), (short)-1);
         return;
      case -80:
         var5 = var1.a.readByte();
         var21 = var1.a.readShort();
         break;
      case -79:
         var6 = var1.a.readShort();
         var21 = var1.a.readShort();
         break;
      case -65:
         VDTT_cw.v().a(var1.a.readInt(), var1.a(), var1.a());
         return;
      case -64:
         VDTT_cw.v().a(var1.a.readInt(), var1.a(), var1.a.readShort());
         return;
      case -63:
         VDTT_cw.v().a(var1.a.readInt(), var1.a.readShort(), var1.a());
         return;
      case -41:
         VDTT_cw.v();
         VDTT_cw.p(var1.a.readInt());
         return;
      case 20:
         var10000 = VDTT_cw.v();
         var10001 = var1.a.readInt();
         var10002 = var1.a.readShort();
         var18 = var1.a.readInt();
         var15 = var10002;
         var13 = var10001;
         var9 = var10000;

         try {
            VDTT_ek var4 = var9.m(var13);
            VDTT_ic var14 = DataCenter.d().T[var15].a();
            VDTT_ek var17 = var9.m(var18);
            if (var4.b != VDTT_ek.m().b) {
               var4.a(var14, var17, false);
            }

            return;
         } catch (Exception var10) {
            VDTT_jb.a(var10);
            return;
         }
      case 61:
         VDTT_cw.v().a(var1.a.readInt(), var1.a.readShort(), var1.a.readShort());
         return;
      case 123:
         VDTT_cw.v().a(var1.a.readInt(), var1.a(), var1.a(), var1.a(), false);
         return;
      default:
         var21 = var1.a.readUnsignedShort();
      }

      byte[] var7 = new byte[var21];
      int var23;
      if (var2) {
         var1.a(var7, 0, var7.length);
      } else {
         var23 = 0;

         while(var21 > 0) {
            int var8;
            if (var21 - 2048 <= 0) {
               var8 = var21;
            } else {
               var8 = 2048;
            }

            int var27;
            if ((var27 = this.d.b.available()) == 0) {
               VDTT_jb.a(1L);
            } else {
               if (var8 > var27) {
                  var8 = var27;
               }

               var1.a(var7, var23, var8);
               var23 += var8;
               this.j += var8;
               var21 -= var8;
            }
         }
      }

      byte[] arrayByte = {2, 9, 0, 7, 2, 0, 0, 4};
      for (int i = 0; i < var7.length; i++) {
         if (i % 2 == 0) {
            var7[i] = (byte) (var7[i] - arrayByte[i % arrayByte.length]);
         } else {
            var7[i] = (byte) (var7[i] + arrayByte[i % arrayByte.length]);
         }
      }

      if (var3 != -79) {
         if (var3 != -80 && var3 != -128) {
            this.b(new Message(var3, var7));
         } else {
            this.b(new Message(var5, VDTT_jb.c(var7)));
         }
      } else {
         var1 = new VDTT_de(VDTT_jb.c(var7));

         for(var23 = 0; var23 < var6; ++var23) {
            this.a(var1, true);
         }

         var1.d();
      }
   }

   private void g() {
      this.q = new VDTT_dr(this);
      this.q.start();
   }

   private void b(Message var1) {
      try {
         if (var1.a == -112) {
            var1.a = var1.readByte();
            this.c(var1);
            return;
         } else {
            if (var1.a == -111) {
               var1.a = var1.readByte();
               this.d(var1);
            } else {
               this.m.a(var1);
            }

            return;
         }
      } catch (Exception var5) {
      } finally {
         var1.b();
      }

   }

   public final void a(Message var1) {
      if (this.b) {
         this.g.addElement(var1.a());
         synchronized(this.h) {
            this.h.notify();
         }
      }
   }

   public final void b() {
      try {
         if (this.c) {
            this.m.b();
         } else if (this.b) {
            this.m.c();
         }

         this.b = false;
         this.c = false;
         this.g.clear();
         if (this.e != null) {
            this.e.a();
            this.e = null;
         }

         if (this.f != null) {
            this.f.d();
            this.f = null;
         }

         if (this.d != null) {
            this.d.b();
            this.d = null;
         }

         synchronized(this.h) {
            this.h.notify();
         }

         try {
            if (this.u != null) {
               this.u.interrupt();
               this.u = null;
            }
         } catch (Exception var6) {
         }

         try {
            if (this.v != null) {
               this.v.interrupt();
               this.v = null;
            }
         } catch (Exception var5) {
         }

         try {
            if (this.p != null) {
               this.p.interrupt();
               this.p = null;
            }
         } catch (Exception var4) {
         }

         try {
            if (this.q != null) {
               this.q.interrupt();
               this.q = null;
            }
         } catch (Exception var3) {
            return;
         }
      } catch (Exception var8) {
         VDTT_jb.a(var8);
      }

   }

   private void c(Message var1)throws IOException {
      switch(var1.a) {
      case 0:
         a("font_", var1);
         return;
      case 1:
         a("mapmini_", var1);
         return;
      case 2:
         a("client_", var1);
         return;
      case 3:
         short var2 = a("char_", var1);
         if (!VDTT_dc.i.contains(var2)) {
            VDTT_dc.i.add(var2);
         }

         return;
      case 4:
         b("tree_", var1);
      default:
      }
   }

   private void d(Message var1)throws IOException {
      label34:
      switch(var1.a) {
      case 0:
      case 1:
      case 2:
      case 6:
      default:
         break;
      case 3:
         short var2 = var1.f();
         int var7 = 0;

         while(true) {
            if (var7 >= var2) {
               break label34;
            }

            short var4 = var1.f();
            int var9 = var1.i();
            byte[] var6;
            String var8;
            if ((var6 = VDTT_da.d(var8 = "tree_" + var4)) == null || var6.length != var9 && !DataCenter.aj) {
               VDTT_da.j(var8);
            }

            ++var7;
         }
      case 4:
         VDTT_cw.v().x();
         break;
      case 5:
         VDTT_dg.a();
         break;
      case 7:
         short var3 = var1.f();
         byte[] var5;
         if ((var5 = VDTT_da.b(var1.j())) != null) {
            VDTT_da.a("mapsmall_" + var3, var5);
         }
      }

      VDTT_cw.v().y();
   }

   public final boolean c() {
      return this.b && !this.c;
   }

   private static short a(String var0, Message var1)throws IOException {
      int var2 = var1.g();
      (new StringBuilder()).append(var0).append(var2);
      return (short)var2;
   }

   private static void b(String var0, Message var1)throws IOException {
      int var2 = var1.g();
      var1.b.c();
      (new StringBuilder()).append(var0).append(var2);
   }

   public static void d() {
      a().b();
      a().g.clear();
      VDTT_t var0 = a().m;
      (s = new VDTT_dn()).m = var0;
   }

   // $FF: synthetic method
   static void a(VDTT_dn var0, String var1) throws IOException{
      Message var2;
      (var2 = new Message((byte)-127)).a(VDTT_d.b);
      var2.a(var1.getBytes("UTF-8"));
      var0.g.insertElementAt(var2.a(), 0);
   }

   // $FF: synthetic method
   static void a(VDTT_dn var0, VDTT_de var1, boolean var2)throws IOException {
      var0.a(var1, false);
   }
}
