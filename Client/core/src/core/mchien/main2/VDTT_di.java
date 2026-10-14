package core.mchien.main2;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import java.util.Hashtable;
import java.util.Vector;

public final class VDTT_di {
   byte a;
   byte b;
   private byte j;
   byte c;
   private String k = "";
   private byte[] l = new byte[0];
   public Vector d = new Vector();
   public Hashtable e = new Hashtable();
   Hashtable f = new Hashtable();
   public Hashtable g = new Hashtable();
   public Hashtable h = new Hashtable();
   int i = 1000;

   public VDTT_di(int var1) {
      this.a = (byte)var1;
      this.k = "";
   }

   public final boolean a() {
      try {
         this.k = "";
         VDTT_aa.a(this.e);
         VDTT_aa.a(this.f);
         this.d.clear();
         this.b();
         return true;
      } catch (Exception var2) {
         VDTT_jb.a(var2);
         return false;
      }
   }

   public final void b() {
      this.c = (byte)(Graphics.b(this.a, "Ấ") * 2);
   }

   public final int a(String var1) {
      if (this.g.get(var1) != null) {
         return (Integer)this.g.get(var1);
      } else {
         int var2 = 0;
         String var4 = var1;

         int var3;
         for(var3 = 0; var3 < var4.length(); ++var3) {
            int[] var5;
            if ((var5 = d(var4.substring(var3))) != null) {
               VDTT_in var6 = VDTT_in.g[var5[0]];
               var2 += var6.a * DataCenter.d().r + this.b;
               var4 = var4.substring(0, var5[1]) + var4.substring(var5[1] + var6.d.length());
               var3 = -1;
            }
         }

         var3 = Graphics.a(this.a, var4);
         var2 += var3;
         if (var1.length() > 1) {
            var2 -= this.b;
         }

         if (this.g.size() > this.i) {
            this.g.clear();
         }

         if (var3 > 0) {
            this.g.put(var1, var2);
         }

         return var2;
      }
   }

   public final void a(BitmapFont var1, int var2, int var3, Graphics var4, String var5, int var6, int var7, int var8) {
      var4.a(this.a, var1, var5, (float)var6, (float)var7, var8, var2, 0.0F);
   }

   public final int a(VDTT_dg var1, BitmapFont var2, int var3, int var4, Graphics var5, String var6, int var7, int var8, int var9) {
      if (e(var6)) {
         return -1;
      } else {
         VDTT_ef var11 = var1.a(var6, var3, var2);
         var3 = -1;
         float var13 = 0.0F;
         float var14 = var11.b;
         if (var9 == 2) {
            var14 = -var14 / 2.0F;
         } else if (var9 == 1) {
            var14 = -var14;
         } else {
            var14 = 0.0F;
         }

         for(var9 = 0; var9 < var11.c.size(); ++var9) {
            VDTT_io var12;
            if ((var12 = (VDTT_io)var11.c.get(var9)).c > 0) {
               if (var12.c == 752) {
                  VDTT_dc.a(var5, 752 + DataCenter.d().h % 24 / 6, 0, var7 + (int)((var13 + var14) / (float)DataCenter.d().r) + DataCenter.d().r / 2, var8, 6);
               } else {
                  VDTT_dc.a(var5, var12.c, 0, var7 + (int)((var13 + var14) / (float)DataCenter.d().r) + DataCenter.d().r / 2, var8, 6);
               }
            } else {
               var5.a(this.a, var2, var12.a, (float)var7, (float)var8, 0, var12.b, var13 + var14);
               if (var12.b == -16320832 || var12.b == -358383 || var12.b == -7812045 || var12.b == -2559) {
                  var5.f(var12.b);
                  int var10 = var7 + (int)((var13 + var14) / (float)DataCenter.d().r) - 1;
                  var5.a(var10, var8 + 4, var10 + (int)var12.d / DataCenter.d().r, var8 + 5);
               }
            }

            var13 += var12.d;
            var3 = var12.b;
         }

         return var3;
      }
   }

   public static VDTT_in b(String var0) {
      var0 = var0.toLowerCase();

      for(int var2 = 0; var2 < VDTT_in.g.length; ++var2) {
         VDTT_in var1 = VDTT_in.g[var2];
         if (var0.startsWith(var1.d)) {
            return var1;
         }
      }

      return null;
   }

   private static int[] d(String var0) {
      var0 = var0.toLowerCase();

      for(int var2 = 0; var2 < VDTT_in.g.length; ++var2) {
         VDTT_in var1 = VDTT_in.g[var2];
         int var3;
         if ((var3 = var0.indexOf(var1.d)) >= 0) {
            return new int[]{var2, var3};
         }
      }

      return null;
   }

   public static VDTT_in c(String var0) {
      var0 = var0.toLowerCase();
      VDTT_in var1 = null;

      for(int var2 = 0; var2 < VDTT_in.g.length; ++var2) {
         int var3;
         if ((var3 = var0.indexOf(VDTT_in.g[var2].d)) >= 0 && (var1 == null || var3 < var0.indexOf(var1.d))) {
            var1 = VDTT_in.g[var2];
         }
      }

      return var1;
   }

   public final Vector a(String var1, int var2) {
      var1 = var1.replaceAll("\\n", " \n ");
      String var3 = "";

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         if (var1.charAt(var4) == '\\' && var4 + 1 < var1.length() && var1.charAt(var4 + 1) == 'n') {
            var3 = var3 + " \n ";
            ++var4;
         } else {
            var3 = var3 + var1.charAt(var4);
         }
      }

      var2 *= DataCenter.d().r;
      Vector var14 = new Vector();
      String[] var13 = VDTT_jb.a(var3, " ");
      Vector var5 = new Vector();

      int var6;
      int var9;
      for(var6 = 0; var6 < var13.length; ++var6) {
         String var7 = var13[var6];
         if (this.a(var7) < var2) {
            var5.add(var7);
         } else {
            String var8 = "";

            for(var9 = 0; var9 < var7.length(); ++var9) {
               var8 = var8 + var7.charAt(var9);
               if (this.a(var8) >= var2) {
                  if (var8.length() > 1) {
                     var5.add(var8.substring(0, var8.length() - 1));
                     var8 = "" + var7.charAt(var9);
                  } else {
                     var5.add(var8);
                     var8 = "";
                  }
               }
            }

            if (var8.length() > 0) {
               var5.add(var8);
            }
         }
      }

      var13 = new String[var5.size()];
      var1 = "";

      for(var6 = 0; var6 < var5.size(); ++var6) {
         var13[var6] = (String)var5.get(var6);
         var1 = var1 + (String)var5.get(var6);
         if (var6 < var5.size() - 1) {
            var1 = var1 + " ";
         }
      }

      VDTT_in var16 = null;
      int var19 = 0;
      var9 = 0;
      int var15 = 0;
      boolean var10 = false;

      for(int var11 = 0; var11 < var13.length; ++var11) {
         if (var13[var11].equals("\n") || var15 + this.a(var13[var11]) > var2) {
            if (var10) {
               var14.addElement(var1.substring(var9, var19).trim());
               var10 = false;
            } else {
               var14.addElement(VDTT_jb.f(var1.substring(var9, var19)));
            }

            var9 = var19;
            var15 = 0;
            if (var16 != null) {
               if (var13[var11].equals("\n")) {
                  var1 = var1.substring(0, var19) + var1.substring(var19, var19 + 1) + var16.d + var1.substring(var19 + 2, var1.length());
               } else {
                  var1 = var1.substring(0, var19) + var16.d + var1.substring(var19, var1.length());
               }

               var13 = VDTT_jb.a(var1, " ");
               var16 = null;
            }

            if (var13[var11].startsWith("\n")) {
               var10 = true;
            }
         }

         for(int var12 = 0; var12 < var13[var11].length(); ++var12) {
            VDTT_in var17;
            if ((var17 = b(var1.substring(var19))) == null) {
               int[] var18;
               if ((var18 = d(var1.substring(var19).split("\n")[0])) != null) {
                  var16 = VDTT_in.g[var18[0]];
               }

               var6 = var19 + var13[var11].length() - var12;
               var15 += this.a(var1.substring(var19, var6) + " ");
               var19 = var6;
               break;
            }

            var15 += var17.a * DataCenter.d().r + this.b;
            var12 += var17.d.length() - 1;
            var19 += var17.d.length() - 1;
            if (var17.a <= 0) {
               var16 = var17;
            }

            ++var19;
         }

         var15 += this.j + this.b;
         ++var19;
         if (var11 == var13.length - 1) {
            var14.addElement(VDTT_jb.f(var1.substring(var9, var1.length())));
         }
      }

      return var14;
   }

   private static boolean e(String var0) {
      return var0 == null || var0.length() == 0;
   }
}
