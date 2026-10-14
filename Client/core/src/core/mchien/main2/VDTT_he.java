package core.mchien.main2;

import java.util.Vector;

public final class VDTT_he {
   public int a;
   public short[] b;
   public short[] c;
   public int d = 0;

   public final VDTT_he a(int var1) {
      VDTT_he var2;
      (var2 = new VDTT_he()).a = this.a;
      var2.b = this.b;
      var2.c = this.c;
      var2.d = var1;
      return var2;
   }

   public final void a(Vector var1, boolean var2) {
      try {
         for(int var3 = this.b.length - 1; var3 >= 0; --var3) {
            short var10001 = this.b[var3];
            VDTT_hc var4 = DataCenter.d().y[var10001].a();
            if (!var2 || (var4.c < 325 || var4.c > 330) && (var4.c < 335 || var4.c > 337)) {
               if (this.a == 1053) {
                  var4.f = -77;
               } else if (this.a == 1181) {
                  var4.f = 128;
               } else if (this.a == 1191) {
                  var4.f = -80;
               } else if (this.a == 1049 && var4.c == 1177) {
                  var4.f = 147;
               } else if (this.a == 168 && (var4.c == 1190 || var4.c == 1192)) {
                  var4.f = -19;
               } else if (this.a != 1170 || var4.c != 1190 && var4.c != 1192) {
                  var4.f = this.d;
               } else {
                  var4.f = -50;
               }

               var1.add(var4);
            }
         }

      } catch (Exception var5) {
      }
   }

   public final void a(Vector var1, int var2) {
      try {
         if (this.c.length > 0 && var2 != 2) {
            short var10001 = this.c[var2 - 1];
            VDTT_hc var6 = DataCenter.d().y[var10001].a();

            for(int var3 = 0; var3 < var1.size(); ++var3) {
               if (((VDTT_hc)var1.get(var3)).c == var6.c) {
                  return;
               }
            }

            var1.add(var6);
         }

      } catch (Exception var5) {
      }
   }

   public final void a() {
      try {
         Vector var1 = new Vector();

         int var2;
         for(var2 = this.b.length - 1; var2 >= 0; --var2) {
            short var10001 = this.b[var2];
            VDTT_hc var3;
            short var4;
            if ((var4 = (var3 = DataCenter.d().y[var10001]).h[0].a) == 0) {
               var4 = var3.h[30].a;
            }

            if (var3.h != null && var3.h.length > 0 && DataCenter.aR.contains(var4)) {
               var1.add(this.b[var2]);
            }
         }

         this.b = new short[var1.size()];

         for(var2 = 0; var2 < var1.size(); ++var2) {
            this.b[var2] = (Short)var1.get(var2);
         }

      } catch (Exception var5) {
      }
   }

   public final void b() {
      try {
         Vector var1 = new Vector();

         int var2;
         for(var2 = this.b.length - 1; var2 >= 0; --var2) {
            short var10001 = this.b[var2];
            VDTT_hc var3;
            short var4;
            if ((var4 = (var3 = DataCenter.d().y[var10001]).h[0].a) == 0) {
               var4 = var3.h[30].a;
            }

            if (var3.d != 1 && var3.d != 7 || var3.h != null && var3.h.length > 0 && DataCenter.aR.contains(var4)) {
               var1.add(this.b[var2]);
            }
         }

         this.b = new short[var1.size()];

         for(var2 = 0; var2 < var1.size(); ++var2) {
            this.b[var2] = (Short)var1.get(var2);
         }

      } catch (Exception var5) {
      }
   }

   public final void c() {
      try {
         Vector var1 = new Vector();

         int var2;
         for(var2 = this.b.length - 1; var2 >= 0; --var2) {
            short var10001 = this.b[var2];
            VDTT_hc var3;
            if ((var3 = DataCenter.d().y[var10001]).d != 1 && var3.d != 7) {
               var1.add(this.b[var2]);
            }
         }

         this.b = new short[var1.size()];

         for(var2 = 0; var2 < var1.size(); ++var2) {
            this.b[var2] = (Short)var1.get(var2);
         }

      } catch (Exception var4) {
      }
   }

   public final void d() {
      try {
         Vector var1 = new Vector();

         int var2;
         for(var2 = this.b.length - 1; var2 >= 0; --var2) {
            short var10001 = this.b[var2];
            VDTT_hc var3;
            if ((var3 = DataCenter.d().y[var10001]).d != 1 && var3.d != 7 || var3.e == 12) {
               var1.add(this.b[var2]);
            }
         }

         this.b = new short[var1.size()];

         for(var2 = 0; var2 < var1.size(); ++var2) {
            this.b[var2] = (Short)var1.get(var2);
         }

      } catch (Exception var4) {
      }
   }

   public final void e() {
      try {
         Vector var1 = new Vector();

         int var2;
         for(var2 = this.b.length - 1; var2 >= 0; --var2) {
            short var10001 = this.b[var2];
            VDTT_hc var3;
            if (((var3 = DataCenter.d().y[var10001]).c < 325 || var3.c > 330) && (var3.c < 335 || var3.c > 337) && var3.d != 8) {
               var1.add(this.b[var2]);
            }
         }

         this.b = new short[var1.size()];

         for(var2 = 0; var2 < var1.size(); ++var2) {
            this.b[var2] = (Short)var1.get(var2);
         }

      } catch (Exception var4) {
      }
   }

   public final boolean f() {
    try {
      for (int i = this.b.length - 1; i >= 0; i--) {
        VDTT_hc vDTT_hc;
        if ((vDTT_hc = (DataCenter.d()).y[this.b[i]]).d == 1 || vDTT_hc.d == 7)
          return true; 
      } 
    } catch (Exception exception) {}
    return false;
  }

   public final void g() {
      try {
         Vector var1 = new Vector();

         int var2;
         for(var2 = this.b.length - 1; var2 >= 0; --var2) {
            short var10001 = this.b[var2];
            VDTT_hc var3;
            if ((var3 = DataCenter.d().y[var10001]).d == 1 || var3.d == 7) {
               var1.add(this.b[var2]);
            }
         }

         this.b = new short[var1.size()];

         for(var2 = 0; var2 < var1.size(); ++var2) {
            this.b[var2] = (Short)var1.get(var2);
         }

      } catch (Exception var4) {
      }
   }

   public final void a(VDTT_ek var1) {
      try {
         Vector var2 = new Vector();

         int var3;
         for(var3 = this.b.length - 1; var3 >= 0; --var3) {
            short var10001 = this.b[var3];
            VDTT_hc var4;
            if ((var4 = DataCenter.d().y[var10001]).d == 1 || var4.d == 7) {
               var2.add(this.b[var3]);
            }
         }

         if (var2.size() != 0) {
            this.b = new short[var2.size()];

            for(var3 = 0; var3 < var2.size(); ++var3) {
               this.b[var3] = (Short)var2.get(var3);
            }

            return;
         }

         this.b = new short[]{VDTT_hd.a(7, var1.m, false)};
      } catch (Exception var5) {
      }

   }

   public final void h() {
      try {
         Vector var1 = new Vector();

         int var2;
         for(var2 = this.b.length - 1; var2 >= 0; --var2) {
            short var10001 = this.b[var2];
            if (DataCenter.d().y[var10001].d == 1) {
               var1.add(this.b[var2]);
            }
         }

         var1.add((short)238);
         var1.add((short)239);
         var1.add((short)241);
         var1.add((short)242);
         this.b = new short[var1.size()];

         for(var2 = 0; var2 < var1.size(); ++var2) {
            this.b[var2] = (Short)var1.get(var2);
         }

      } catch (Exception var4) {
      }
   }
}
