package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.Base64Coder;
import com.badlogic.gdx.utils.StringBuilder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;
import java.util.zip.Inflater;
import java.util.zip.ZipInputStream;

public final class VDTT_jb {
   private static Random d = new Random();
   private static Hashtable e = new Hashtable();
   public static long a;
   public static int b = 30000;
   public static long c = 3600000L;

   public static long a() {
      return System.currentTimeMillis() + a;
   }

   public static void a(String var0) {
   }

   public static void b(String var0) {
   }

   public static void a(Exception var0) {
      var0.printStackTrace();
   }

   public static void a(Exception var0, String var1) {
      var0.printStackTrace();
   }

   public static void a(long var0) {
      try {
         Thread.sleep(var0);
      } catch (Exception var2) {
      }
   }

   public static int a(int var0) {
      return var0 <= 0 ? 0 : d.nextInt(var0);
   }

   public static int a(int var0, int var1) {
      return var1 == var0 && var1 == 0 ? 0 : var0 + a(var1 - var0 + 1);
   }

   public static boolean b() {
      return d.nextInt(2) != 0;
   }

   public static int a(int[] var0) {
      return var0[a((int)3)];
   }

   public static Color b(long var0) {
      float var2 = (float)((var0 & 4278190080L) >> 24);
      float var3 = (float)((var0 & 16711680L) >> 16);
      float var4 = (float)((var0 & 65280L) >> 8);
      float var5 = (float)(var0 & 255L);
      return new Color(var3 / 255.0F, var4 / 255.0F, var5 / 255.0F, var2 / 255.0F);
   }

   public static boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      return (var4 <= var0 && var0 <= var6 || var4 <= var2 && var2 <= var6 || var0 <= var4 && var2 >= var6) && (var5 <= var1 && var1 <= var7 || var5 <= var3 && var3 <= var7 || var1 <= var5 && var3 >= var7) || (var0 <= var4 && var4 <= var2 || var0 <= var6 && var6 <= var2 || var4 <= var0 && var6 >= var2) && (var1 <= var5 && var5 <= var3 || var1 <= var7 && var7 <= var3 || var5 <= var1 && var7 >= var3);
   }

   public static boolean a(int var0, int var1, int var2, int var3, int var4, int var5) {
      return var0 <= var4 && var4 <= var2 && var1 <= var5 && var5 <= var3;
   }

   public static short a(boolean var0, short var1) {
      if (var0) {
         return var1 % 360 == 0 ? -360 : (short)(-(var1 % 360));
      } else {
         return var1;
      }
   }

   public static short a(byte var0) {
      switch(var0) {
      case 0:
         return 0;
      case 1:
         return -180;
      case 2:
         return -90;
      case 3:
         return -270;
      case 4:
         return 180;
      case 5:
         return 90;
      case 6:
         return 270;
      case 7:
         return -360;
      default:
         return 0;
      }
   }

   public static int b(int var0) {
      return var0 > 0 ? var0 : -var0;
   }

   public static XYEntity[] a(XYEntity[] var0) {
      XYEntity[] var1 = new XYEntity[var0.length];
      int var2 = 0;

      for(int var3 = var1.length - 1; var3 >= 0; --var3) {
         var1[var2] = new XYEntity();
         var1[var2].objX = (short)(-var0[var3].objX);
         var1[var2].objY = var0[var3].objY;
         ++var2;
      }

      return var1;
   }

   public static int b(int var0, int var1) {
      return b(var0 - var1);
   }

   public static int a(int var0, int var1, int var2, int var3) {
      return (int)Math.sqrt((double)(b((var0 - var2) * (var0 - var2)) + b((var1 - var3) * (var1 - var3))));
   }

   private static double a(double var0, double var2, double var4, double var6) {
      return Math.sqrt(Math.abs((var0 - var4) * (var0 - var4)) + Math.abs((var2 - var6) * (var2 - var6)));
   }

   public static int a(XYEntity var0, XYEntity var1) {
      return b(var0.objX, var0.objY, var1.objX, var1.objY);
   }

   public static int b(int var0, int var1, int var2, int var3) {
      var0 = b(var0 - var2);
      var1 = b(var1 - var3);
      return var0 > var1 ? var0 : var1;
   }

   public static void a(Vector var0, Vector var1) {
      for(int var2 = 0; var2 < var1.size(); ++var2) {
         var0.addElement(var1.elementAt(var2));
      }

   }

   public static String c(String var0) {
      try {
         Long.parseLong(var0);
      } catch (Exception var4) {
         return var0;
      }

      String var1 = "";
      String var2 = "";
      if (var0.charAt(0) == '-') {
         var2 = "-";
         var0 = var0.substring(1);
      }

      for(int var3 = var0.length() - 1; var3 >= 0; --var3) {
         if ((var0.length() - 1 - var3) % 3 == 0 && var0.length() - 1 - var3 > 0) {
            var1 = var0.charAt(var3) + "." + var1;
         } else {
            var1 = var0.charAt(var3) + var1;
         }
      }

      return var2 + var1;
   }

   public static String c(long var0) {
      return c(String.valueOf(var0));
   }

   public static String c(int var0) {
      return c(String.valueOf(var0));
   }

   public static String[] a(String var0, String var1) {
      Vector var2 = new Vector();

      for(int var3 = var0.indexOf(var1); var3 >= 0; var3 = (var0 = var0.substring(var3 + var1.length())).indexOf(var1)) {
         var2.addElement(var0.substring(0, var3));
      }

      var2.addElement(var0);
      String[] var4 = new String[var2.size()];
      var2.copyInto(var4);
      return var4;
   }

   public static int c(int var0, int var1) {
      return var0 / var1 + (var0 % var1 != 0 ? 1 : 0);
   }

   public static String b(String var0, String var1) {
      return var0.replaceAll("#", var1);
   }

   public static String a(String var0, long var1) {
      return var0.replaceAll("#", "" + var1);
   }

   public static String b(String var0, long var1) {
      return var0.replaceAll("@", "" + var1);
   }

   public static String d(String var0) {
      try {
         String var1 = VDTT_d.b;
         var0 = Base64Coder.encodeString(var0);
         byte[] var4 = (var1 + var0).getBytes("UTF-8");

         for(int var2 = 0; var2 < var4.length; ++var2) {
            var4[var2] = (byte)(var4[var2] + var1.length());
         }

         return Base64Coder.encodeLines(var4).replaceAll("\n", "#");
      } catch (Exception var3) {
         return null;
      }
   }

   public static String e(String var0) {
      try {
         String var1 = VDTT_d.b;
         byte[] var4 = Base64Coder.decodeLines(var0.replaceAll("#", "\n"));

         for(int var2 = 0; var2 < var4.length; ++var2) {
            var4[var2] = (byte)(var4[var2] - var1.length());
         }

         return Base64Coder.decodeString((new String(var4, "UTF-8")).replaceAll(var1, "")).replaceAll("#", "\n");
      } catch (Exception var3) {
         return null;
      }
   }

   public static String d(int var0) {
      String var3 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
      StringBuilder var1 = new StringBuilder(15);

      for(int var2 = 0; var2 < 15; ++var2) {
         var1.append(var3.charAt(a(var3.length())));
      }

      return var1.toString();
   }

   private static boolean a(int var0, int var1, XYEntity var2, XYEntity var3) {
      return (var3.objX > var2.objX && var2.objX <= var0 && var0 <= var3.objX || var2.objX >= var3.objX && var2.objX >= var0 && var0 >= var3.objX) && (var3.objY > var2.objY && var2.objY <= var1 && var1 <= var3.objY || var2.objY >= var3.objY && var2.objY >= var1 && var1 >= var3.objY);
   }

   public static XYEntity a(XYEntity var0, XYEntity var1, XYEntity var2, XYEntity var3) {
      double var9 = (double)var0.objX;
      double var11 = (double)var1.objX;
      double var13 = (double)var2.objX;
      double var15 = (double)var3.objX;
      double var17 = (double)var0.objY;
      double var19 = (double)var1.objY;
      double var21 = (double)var2.objY;
      double var23 = (double)var3.objY;
      XYEntity var10000;
      double var25;
      if ((var25 = (var9 - var11) * (var21 - var23) - (var17 - var19) * (var13 - var15)) == 0.0D) {
         var10000 = null;
      } else {
         double var27 = ((var13 - var15) * (var9 * var19 - var17 * var11) - (var9 - var11) * (var13 * var23 - var21 * var15)) / var25;
         double var29 = ((var21 - var23) * (var9 * var19 - var17 * var11) - (var17 - var19) * (var13 * var23 - var21 * var15)) / var25;
         var10000 = XYEntity.e((int)var27, (int)var29);
      }

      XYEntity var4 = var10000;
      return var10000 != null && a(var4.objX, var4.objY, var0, var1) && a(var4.objX, var4.objY, var2, var3) ? var4 : null;
   }

   public static String e(int var0) {
      String var1 = String.valueOf(var0);
      if (var0 < 99) {
         var1 = "0" + var1;
      }

      StringBuilder var3 = new StringBuilder();

      for(int var2 = 0; var2 < var1.length(); ++var2) {
         if (var2 == 0) {
            var3.append(var1.charAt(var2));
         } else {
            var3.append("." + var1.charAt(var2));
         }
      }

      return var3.toString();
   }

   public static String f(int var0) {
      int var1 = 0;
      if (var0 > 60) {
         var1 = var0 / 60;
         var0 %= 60;
      }

      int var2 = 0;
      if (var1 > 60) {
         var2 = var1 / 60;
         var1 %= 60;
      }

      int var3 = 0;
      if (var2 > 24) {
         var3 = var2 / 24;
         var2 %= 24;
      }

      String var4 = "";
      if (var3 > 0) {
         var4 = var4 + var3;
         var4 = var4 + "d";
         var4 = var4 + var2 + "h";
      } else if (var2 > 0) {
         var4 = var4 + var2;
         var4 = var4 + "h";
         var4 = var4 + var1 + "'";
      } else {
         if (var1 > 9) {
            var4 = var4 + var1;
         } else {
            var4 = var4 + "0" + var1;
         }

         var4 = var4 + ":";
         if (var0 > 9) {
            var4 = var4 + var0;
         } else {
            var4 = var4 + "0" + var0;
         }
      }

      return var4;
   }

   public static String g(int var0) {
      int var1 = 0;
      if (var0 > 60) {
         var1 = var0 / 60;
         var0 %= 60;
      }

      int var2 = 0;
      if (var1 > 60) {
         var2 = var1 / 60;
         var1 %= 60;
      }

      int var3 = 0;
      if (var2 > 24) {
         var3 = var2 / 24;
         var2 %= 24;
      }

      String var4 = "";
      if (var3 > 0) {
         var4 = var4 + var3;
         var4 = var4 + " " + Caption.li;
         var4 = var4 + var2 + " " + Caption.lj;
      } else if (var2 > 0) {
         var4 = var4 + var2;
         var4 = var4 + " " + Caption.ll;
         var4 = var4 + var1 + " " + Caption.lk;
      } else {
         if (var1 > 9) {
            var4 = var4 + var1;
         } else {
            var4 = var4 + "0" + var1;
         }

         var4 = var4 + ":";
         if (var0 > 9) {
            var4 = var4 + var0;
         } else {
            var4 = var4 + "0" + var0;
         }
      }

      return var4;
   }

   public static int c() {
      return (int)((System.currentTimeMillis() + a) / 1000L);
   }

   public static String h(int var0) {
      int var2;
      if (var0 >= 3600) {
         int var1 = var0 / 3600;
         if ((var2 = var0 % 3600) > 60) {
            var2 /= 60;
         }

         return var2 == 0 ? var1 + ":00" : var1 + ":" + (var2 < 10 ? "0" + var2 : var2);
      } else if (var0 >= 60) {
         var2 = var0 / 60;
         return (var0 %= 60) == 0 ? var2 + ":00" : var2 + ":" + (var0 < 10 ? "0" + var0 : var0);
      } else if (var0 >= 0) {
         var0 %= 60;
         return "00:" + (var0 < 10 ? "0" + var0 : var0);
      } else {
         return "0";
      }
   }

   public static String i(int var0) {
      int var2;
      int var3;
      if (var0 > 86400) {
         int var1 = var0 / 86400;
         var2 = (var0 %= 86400) / 3600;
         if ((var3 = var0 % 3600) > 60) {
            var3 /= 60;
         }

         return var3 == 0 ? var1 + Caption.lm + var2 + " " + Caption.ll : var1 + Caption.lm + var2 + " " + Caption.ll + " " + var3 + " " + Caption.lk;
      } else if (var0 >= 3600) {
         var2 = var0 / 3600;
         if ((var3 = var0 % 3600) > 60) {
            var3 /= 60;
         }

         return var3 == 0 ? var2 + " " + Caption.ll : var2 + " " + Caption.ll + " " + var3 + " " + Caption.lk;
      } else if (var0 >= 60) {
         var3 = var0 / 60;
         return (var0 %= 60) == 0 ? var3 + " " + Caption.lk : var3 + " " + Caption.lk + " " + var0 + " " + Caption.ln;
      } else if (var0 >= 0) {
         var0 %= 60;
         return var0 + " " + Caption.ln;
      } else {
         return "0 " + Caption.ln;
      }
   }

   public static String f(String var0) {
      int var1;
      for(var1 = var0.length() - 1; var1 >= 0 && Character.isWhitespace(var0.charAt(var1)); --var1) {
      }

      return var0.substring(0, var1 + 1);
   }

   public static String j(int var0) {
      return var0 % 1000 == 0 ? c(String.valueOf(var0 /= 1000)) : "" + (float)var0 / 1000.0F;
   }

   public static byte[] a(byte[] var0) {
      try {
         if (var0 != null) {
            int var1;
            if ((var1 = var0.length) <= 320) {
               byte[] var2 = new byte[var1];

               int var3;
               for(var3 = 0; var3 < var1; ++var3) {
                  var2[var1 - 1 - var3] = var0[var3];
               }

               for(var3 = 0; var3 < var1; ++var3) {
                  var0[var3] = var2[var3];
               }
//            } else if (Gdx.app.getType() == ApplicationType.Android) {
//               var0 = VDTT_d.g().h.a(var0, 160, var1);
            } else {
               int var9 = var1;
               boolean var7 = true;
               byte[] var8 = var0;
               byte[] var10 = new byte[]{-116, -105, 79, -108, -39, -88, -61, -93, -91, 5, 83, 66, -113, 100, 64, 81, -115, 54, -50, 52, 76, 4, 85, 107, 70, 53, 4, -109, 77, 42, 85, -24, -109, 23, 43, -59, 60, 78, 25, 26, 27, 25, -20, -55, -70, 83, 56, -19, -107, -77, 81, -57, -27, -10, -64, -74, 106, -55, 117, 34, 66, -112, 43, 38, 54, -90, -89, -25, 100, -79, -38, -107, -9, 49, 86, -114, 98, 101, -35, 25, -52, 41, 117, 37, 116, 32, 72, -113, 86, 90, 88, -22, -42, 19, 32, -2, -39, -56, -43, -97, -44, 70, -21, 73, -68, -47, 116, 85, -84, -98, 51, 75, -12, -67, -81, 52, -34, -42, 115, 10, 93, -65, -46, 14, -50, -57, 56, -106, -111, 50, 107, -47, -48, -14, -96, -88, 109, -34, -6, 83, -101, 1, -98, 85, -45, 2, -46, 6, -89, 76, -13, -117, -110, -55, -10, -61, -114, -96, -58, -64, 112};

               int var5;
               for(var5 = 0; var5 < 160; ++var5) {
                  byte var4 = var8[var5];
                  var8[var5] = (byte)(var8[var9 - 160 + var5] + var10[var5]);
                  var8[var9 - 160 + var5] = (byte)(var4 - var10[var5]);
               }

               for(var5 = 160; var5 < var9 - 160; ++var5) {
                  var8[var5] = (byte)(-var8[var5]);
               }

               var0 = var8;
            }
         }
      } catch (Exception var6) {
      }

      return var0;
   }

   public static byte[] b(byte[] var0) {
      try {
         if (var0 != null) {
            int var1;
            byte var5;
            if ((var5 = (byte)(var1 = var0.length)) == 0) {
               var5 = 100;
            }

            byte[] var2 = new byte[var0.length];

            for(int var3 = 0; var3 < var0.length; ++var3) {
               var2[var3] = (byte)(var0[var3] - var5);
            }

            return var2;
         }
      } catch (Exception var4) {
      }

      return null;
   }

   public static FileHandle g(String var0) {
      return h(var0);
   }

   public static FileHandle h(String var0) {
      String var1;
      FileHandle var2;
      label28: {
         var1 = "internal" + var0;
         DataCenter.d();
         if (DataCenter.t()) {
            DataCenter.d();
            if (DataCenter.k()) {
               if (e.get(var1) != null) {
                  return (FileHandle)e.get(var1);
               }

               var2 = i(VDTT_aa.a(var0.replace("/", "_"), ""));
               break label28;
            }
         }

         VDTT_d.g();
         if (!var0.contains("/")) {
            DataCenter.d();
            if (!DataCenter.k()) {
               var0 = "resource/" + var0;
            }
         }

         if (e.get(var1) != null) {
            return (FileHandle)e.get(var1);
         }

         var2 = Gdx.files.internal(var0);
      }

      e.put(var1, var2);
      return var2;
   }

   public static FileHandle i(String var0) {
      if (!var0.startsWith(VDTT_da.a)) {
         var0 = VDTT_aa.a(var0) + var0;
      }

      String var1 = "external" + var0;
      if (e.get(var1) != null) {
         return (FileHandle)e.get(var1);
      } else {
         FileHandle var2 = Gdx.files.external(var0);
         e.put(var1, var2);
         return var2;
      }
   }

   public static void d() {
      try {
         VDTT_lk.N = true;
         VDTT_dc.a();
         VDTT_d.g().d();
         VDTT_dn.a();
      } catch (Exception var0) {
      }
   }

   public static boolean e() {
      return DataCenter.d().ai.c instanceof VDTT_mg;
   }

   public static String k(int var0) {
      return var0 < 10 ? "0" + var0 : "" + var0;
   }

   public static String d(long var0) {
      Calendar var2;
      (var2 = Calendar.getInstance()).setTime(new Date(var0));
      Calendar var5 = var2;
      int var1 = var2.get(1);
      String var7 = k(var2.get(2) + 1);
      String var3 = k(var5.get(5));
      String var4 = k(var5.get(11));
      String var6 = k(var5.get(12));
      return var1 + "-" + var7 + "-" + var3 + " " + var4 + ":" + var6;
   }

   public static String e(long var0) {
      Calendar var2;
      (var2 = Calendar.getInstance()).setTime(new Date(var0));
      Calendar var6 = var2;
      int var1 = var2.get(1);
      String var8 = k(var2.get(2) + 1);
      String var3 = k(var6.get(5));
      String var4 = k(var6.get(11));
      String var5 = k(var6.get(12));
      String var7 = k(var6.get(13));
      return var1 + "-" + var8 + "-" + var3 + " " + var4 + ":" + var5 + ":" + var7;
   }

   public static String l(int var0) {
      Calendar var1;
      (var1 = Calendar.getInstance()).setTime(new Date(946573200129L + (long)var0 * 1000L));
      return k(var1.get(11)) + ":" + k(var1.get(12));
   }

   public static boolean d(int var0, int var1) {
      Calendar var2;
      (var2 = Calendar.getInstance()).setTimeInMillis(System.currentTimeMillis() + a);
      var2.set(11, 0);
      var2.set(12, 0);
      var2.set(13, 0);
      var2.setTimeInMillis(var2.getTimeInMillis() + (long)var0 * 1000L);
      Calendar var6;
      (var6 = Calendar.getInstance()).setTimeInMillis(System.currentTimeMillis() + a);
      var6.set(11, 0);
      var6.set(12, 0);
      var6.set(13, 0);
      var6.setTimeInMillis(var6.getTimeInMillis() + (long)var1 * 1000L);
      long var4 = System.currentTimeMillis() + a;
      return var2.getTimeInMillis() <= var4 && var4 <= var6.getTimeInMillis();
   }

   public static int m(int var0) {
      Calendar var1;
      (var1 = Calendar.getInstance()).setTimeInMillis(System.currentTimeMillis() + a);
      var1.set(11, 0);
      var1.set(12, 0);
      var1.set(13, 0);
      var1.setTimeInMillis(var1.getTimeInMillis() + (long)var0 * 1000L);
      long var2 = System.currentTimeMillis() + a;
      return (int)(var1.getTimeInMillis() - var2) / 1000;
   }

   public static String f(long var0) {
      if (var0 >= 2592000000L) {
         return var0 / 2592000000L + " " + Caption.yT[0];
      } else if (var0 >= 604800000L) {
         return var0 / 604800000L + " " + Caption.yT[1];
      } else if (var0 >= 86400000L) {
         return var0 / 86400000L + " " + Caption.yT[2];
      } else if (var0 >= 3600000L) {
         return var0 / 3600000L + " " + Caption.yT[3];
      } else {
         return var0 >= 60000L ? var0 / 60000L + " " + Caption.yT[4] : var0 / 1000L + " " + Caption.yT[5];
      }
   }

   public static String g(long var0) {
      Calendar var2;
      (var2 = Calendar.getInstance()).setTime(new Date(var0));
      String var5 = k(var2.get(11));
      String var1 = k(var2.get(12));
      String var3 = k(var2.get(5));
      String var4 = k(var2.get(2) + 1);
      int var6 = var2.get(1);
      return var3 + "/" + var4 + "/" + var6 + " " + var5 + "h" + var1 + "'";
   }

   public static void a(Graphics var0, int var1, int var2) {
      var0.f(8732953);
      var0.b(0, 0, var1 - 1, var2 - 1);
      var0.f(6501888);
      var0.b(1, 1, var1 - 2 - 1, var2 - 2 - 1);
   }

   public static String a(String var0, int var1) {
      return (var0 = var0.substring(0, 1).toUpperCase() + var0.substring(1, var0.length()).toLowerCase()).length() > var1 ? var0.substring(0, var1) + "..." : var0;
   }

   public static boolean j(String var0) {
      return var0 == null || var0.equals("");
   }

   public static VDTT_fb a(XYEntity var0, XYEntity var1, int var2) {
      if ((var2 %= 360) < 0) {
         var2 += 360;
      }

      VDTT_fb var3 = new VDTT_fb(0, 0);
      double var4 = a((double)var0.objX, (double)var0.objY, (double)var1.objX, (double)var1.objY);
      int var6 = (int)Math.toDegrees(Math.asin(((double)var0.objX - (double)var1.objX) / var4));
      var3.objX = (short)((int)((double)var0.objX - var4 * Math.sin(Math.toRadians((double)var6))));
      var3.objY = (short)((int)((double)var0.objY - var4 * Math.cos(Math.toRadians((double)var6))));
      int var7 = var1.objX - var3.objX;
      int var8 = var1.objY - var3.objY;
      var2 = (var6 + var2) % 360;
      var3.objX = (short)((int)((double)(var7 + var0.objX) - var4 * Math.sin(Math.toRadians((double)var2))));
      var3.objY = (short)((int)((double)(var8 + var0.objY) - var4 * Math.cos(Math.toRadians((double)var2))));
      return var3;
   }

   public static XYEntity a(XYEntity var0, XYEntity var1, double var2) {
      double var4 = a((double)var0.objX, (double)var0.objY, (double)var1.objX, (double)var1.objY) / var2;
      int var7 = (int)((double)var0.objX + (double)(var1.objX - var0.objX) / var4);
      int var6 = (int)((double)var0.objY + (double)(var1.objY - var0.objY) / var4);
      return XYEntity.e(var7, var6);
   }

   public static int f() {
      Calendar var0;
      (var0 = Calendar.getInstance()).setTimeInMillis(System.currentTimeMillis() + a);
      byte var1 = 0;
      switch(var0.get(7)) {
      case 1:
         var1 = 6;
         break;
      case 2:
         var1 = 0;
         break;
      case 3:
         var1 = 1;
         break;
      case 4:
         var1 = 2;
         break;
      case 5:
         var1 = 3;
         break;
      case 6:
         var1 = 4;
         break;
      case 7:
         var1 = 5;
      }

      return var1;
   }

   public static boolean b(String var0, int var1) {
      return a((String)var0, var1, 1);
   }

   private static boolean a(String var0, int var1, int var2) {
      while(true) {
         Socket var3 = null;

         label82: {
            try {
               var3 = new Socket();
               InetSocketAddress var4 = new InetSocketAddress(var0, var1 + 1);
               var3.connect(var4, 1000 * var2);
               var3.setSoTimeout(1000 * var2);
               if (!var3.isConnected()) {
                  break label82;
               }
            } catch (Exception var12) {
               break label82;
            } finally {
               try {
                  var3.close();
               } catch (Exception var11) {
               }

            }

            return true;
         }

         if (var2 >= 5) {
            return false;
         }

         ++var2;
         var1 = var1;
         var0 = var0;
      }
   }

   public static boolean g() {
      return true;
   }

   public static boolean a(byte[] var0, String var1) {
      try {
         Socket var2 = null;
         InputStream var3 = null;
         OutputStream var4 = null;
         DataInputStream var5 = null;
         boolean var10 = false;

         label167: {
            label174: {
               try {
                  var10 = true;
                  var2 = new Socket();
                  InetSocketAddress var6 = new InetSocketAddress(DataCenter.d().c, DataCenter.d().d);
                  var2.connect(var6, 3000);
                  var3 = var2.getInputStream();
                  var5 = new DataInputStream(var3);
                  var4 = var2.getOutputStream();
                  byte[] var14 = var1.getBytes("UTF-8");
                  var4.write(new byte[]{(byte)var14.length});
                  var4.write(var14);
                  int var15 = var0.length;
                  var4.write(new byte[]{(byte)(var15 >>> 24), (byte)(var15 >>> 16), (byte)(var15 >>> 8), (byte)var15});
                  var4.write(var0);
                  var4.flush();
                  if (var5.readByte() != 1) {
                     var10 = false;
                     break label167;
                  }

                  var10 = false;
                  break label174;
               } catch (Exception var11) {
                  var10 = false;
               } finally {
                  if (var10) {
                     if (var3 != null) {
                        var3.close();
                     }

                     if (var5 != null) {
                        var5.close();
                     }

                     if (var4 != null) {
                        var4.close();
                     }

                     if (var2 != null) {
                        var2.close();
                     }

                  }
               }

               if (var3 != null) {
                  var3.close();
               }

               if (var5 != null) {
                  var5.close();
               }

               if (var4 != null) {
                  var4.close();
               }

               if (var2 != null) {
                  var2.close();
               }

               return false;
            }

            if (var3 != null) {
               var3.close();
            }

            var5.close();
            if (var4 != null) {
               var4.close();
            }

            var2.close();
            return true;
         }

         if (var3 != null) {
            var3.close();
         }

         var5.close();
         if (var4 != null) {
            var4.close();
         }

         var2.close();
      } catch (Exception var13) {
      }

      return false;
   }

   public static byte[] k(String var0) {
      try {
         Socket var1 = null;
         InputStream var2 = null;
         OutputStream var3 = null;
         DataInputStream var4 = null;
         boolean var12 = false;

         label174: {
            byte[] var18;
            try {
               var12 = true;
               var1 = new Socket();
               InetSocketAddress var5 = new InetSocketAddress(DataCenter.d().c, DataCenter.d().e);
               var1.connect(var5, 3000);
               var2 = var1.getInputStream();
               var4 = new DataInputStream(var2);
               var3 = var1.getOutputStream();
               byte[] var16 = var0.getBytes("UTF-8");
               var3.write(new byte[]{(byte)var16.length});
               var3.write(var16);
               var3.flush();
               int var17;
               var16 = new byte[var17 = var4.readInt()];
               int var6 = 0;

               while(true) {
                  if (var17 <= 0) {
                     var18 = var16;
                     var12 = false;
                     break;
                  }

                  int var7;
                  if (var17 - 3072 <= 0) {
                     var7 = var17;
                  } else {
                     var7 = 3072;
                  }

                  int var8;
                  if ((var8 = var4.available()) == 0) {
                     a(1L);
                  } else {
                     if (var7 > var8) {
                        var7 = var8;
                     }

                     var4.read(var16, var6, var7);
                     var6 += var7;
                     var17 -= var7;
                  }
               }
            } catch (Exception var13) {
               var12 = false;
               break label174;
            } finally {
               if (var12) {
                  if (var2 != null) {
                     var2.close();
                  }

                  if (var4 != null) {
                     var4.close();
                  }

                  if (var3 != null) {
                     var3.close();
                  }

                  if (var1 != null) {
                     var1.close();
                  }

               }
            }

            if (var2 != null) {
               var2.close();
            }

            var4.close();
            if (var3 != null) {
               var3.close();
            }

            var1.close();
            return var18;
         }

         if (var2 != null) {
            var2.close();
         }

         if (var4 != null) {
            var4.close();
         }

         if (var3 != null) {
            var3.close();
         }

         if (var1 != null) {
            var1.close();
         }
      } catch (Exception var15) {
      }

      return null;
   }

   public static int b(int... paramVarArgs) {
    try {
      int i = 0;
      int j;
      for (j = 0; j < 7; j++)
        i += paramVarArgs[j]; 
      j = a(1, i);
      i = 0;
      for (byte b = 0; b < 7; b++) {
        if ((i += paramVarArgs[b]) >= j)
          return b; 
      } 
    } catch (Exception exception) {}
    return -1;
  }

   public static String l(String var0) {
      StringBuilder var1 = new StringBuilder();

      try {
         MessageDigest var2;
         (var2 = MessageDigest.getInstance("MD5")).update(var0.getBytes("UTF8"));
         byte[] var4 = var2.digest();

         for(int var5 = 0; var5 < var4.length; ++var5) {
            if ((var4[var5] & 255) < 16) {
               var1.append("0");
            }

            var1.append(Long.toString((long)(var4[var5] & 255), 16));
         }
      } catch (Exception var3) {
      }

      return var1.toString();
   }

   public static short[] h() {
      VDTT_de var0 = null;
      boolean var5 = false;

      short[] var9;
      label86: {
         try {
            var5 = true;
            String var1 = System.getProperty("user.home");
            String var2 = var1 + "\\" + VDTT_da.a.replace("/", "\\") + "arr_sc" + VDTT_aa.a();
            if (l(var1).equals("2b2a24bfad7173caf1e2bdd213db02de")) {
               var2 = var1 + "/" + VDTT_da.a + "arr_sc" + VDTT_aa.a();
            }

            byte[] var8;
            if ((var8 = m(var2)) == null) {
               var5 = false;
               return new short[]{1024, 600};
            }

            var0 = new VDTT_de(var8);
            var9 = new short[]{var0.a.readShort(), var0.a.readShort()};
            var5 = false;
            break label86;
         } catch (Exception var6) {
            var5 = false;
         } finally {
            if (var5) {
               if (var0 != null) {
                  var0.d();
               }

            }
         }

         if (var0 != null) {
            var0.d();
         }

         return new short[]{1024, 600};
      }

      var0.d();
      return var9;
   }

   public static void a(String var0, byte[] var1) {
      var0 = System.getProperty("user.home") + "/" + VDTT_da.a + var0;

      try {
         FileOutputStream var6;
         (var6 = new FileOutputStream(var0)).write(var1);
         var6.close();
      } catch (Exception var4) {
      } finally {
         ;
      }
   }

   public static void b(String var0, byte[] var1) {
      try {
         FileOutputStream var6;
         (var6 = new FileOutputStream(var0)).write(var1);
         var6.close();
      } catch (Exception var4) {
      } finally {
         ;
      }
   }

   public static byte[] m(String var0) {
      FileInputStream var1 = null;
      boolean var7 = false;

      label95: {
         byte[] var14;
         try {
            var7 = true;
            File var13;
            if (!(var13 = new File(var0)).exists()) {
               return null;
            }

            var1 = new FileInputStream(var13);
            var14 = new byte[(int)var13.length()];
            var1.read(var14, 0, var14.length);
            var14 = var14;
            var7 = false;
         } catch (Exception var11) {
            var7 = false;
            break label95;
         } finally {
            if (var7) {
               try {
                  if (var1 != null) {
                     var1.close();
                  }
               } catch (Exception var8) {
               }

            }
         }

         try {
            var1.close();
         } catch (Exception var10) {
         }

         return var14;
      }

      try {
         if (var1 != null) {
            var1.close();
         }
      } catch (Exception var9) {
      }

      return null;
   }

   public static int n(int var0) {
      float var1 = (float)var0;
      VDTT_eq.a();
      return (int)var1;
   }

   public static float a(float var0) {
      VDTT_eq.a();
      return var0;
   }

   public static byte[] c(byte[] var0) {
      Inflater var2;
      (var2 = new Inflater()).setInput(var0);
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      byte[] var3 = new byte[4096];

      try {
         while(!var2.finished()) {
            int var4 = var2.inflate(var3);
            var1.write(var3, 0, var4);
         }

         byte[] var13 = var1.toByteArray();
         return var13;
      } catch (Exception var11) {
      } finally {
         try {
            var1.close();
         } catch (Exception var10) {
         }

      }

      return var0;
   }

   public static boolean a(XYEntity[] var0, XYEntity[] var1) {
      if (var0 != null && var1 != null) {
         return var0[0].equals(var1[0]) && var0[1].equals(var1[1]);
      } else {
         return false;
      }
   }

   public static XYEntity b(XYEntity var0, XYEntity var1, int var2) {
      double var3 = (double)(var1.objX - var0.objX);
      double var5 = (double)(var1.objY - var0.objY);
      double var7 = (double)(var0.objX - var0.objX);
      double var9 = (double)(var0.objY - var0.objY);
      double var11 = var3 * var3 + var5 * var5;
      double var13 = var3 * var7 + var5 * var9;
      double var15 = var7 * var7 + var9 * var9 - (double)(var2 * var2);
      double var17 = var13 / var11;
      double var19 = var15 / var11;
      double var21;
      if ((var21 = var17 * var17 - var19) < 0.0D) {
         return null;
      } else {
         double var23 = Math.sqrt(var21);
         double var25 = -var17 + var23;
         double var27 = -var17 - var23;
         XYEntity var29;
         if (a((var29 = XYEntity.e((int)((double)var0.objX - var3 * var25), (int)((double)var0.objY - var5 * var25))).objX, var29.objY, var0, var1)) {
            return var29;
         } else {
            return var21 == 0.0D ? null : XYEntity.e((int)((double)var0.objX - var3 * var27), (int)((double)var0.objY - var5 * var27));
         }
      }
   }

   public static String n(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         StringBuilder var1 = new StringBuilder();

         for(int var2 = 0; var2 < var0.length(); ++var2) {
            var1.append(Graphics.o.indexOf(var0.charAt(var2)));
         }

         return var1.toString();
      } else {
         return null;
      }
   }

   public static byte[] d(byte[] var0) {
      byte[] var1 = null;
      ZipInputStream var2 = null;
      boolean var11 = false;

      label127: {
         try {
            var11 = true;
            var2 = new ZipInputStream(new ByteArrayInputStream(var0));

            while(var2.getNextEntry() != null) {
               try {
                  ByteArrayOutputStream var18 = new ByteArrayOutputStream();
                  byte[] var3 = new byte[524288];

                  int var4;
                  while((var4 = var2.read(var3)) != -1) {
                     var18.write(var3, 0, var4);
                  }

                  var18.flush();
                  var1 = var18.toByteArray();
                  var18.close();
               } catch (Exception var15) {
               }
            }

            var11 = false;
            break label127;
         } catch (Exception var16) {
            var11 = false;
         } finally {
            if (var11) {
               try {
                  if (var2 != null) {
                     var2.close();
                  }
               } catch (Exception var12) {
               }

            }
         }

         try {
            if (var2 != null) {
               var2.close();
               return var1;
            }
         } catch (Exception var13) {
         }

         return var1;
      }

      try {
         var2.close();
      } catch (Exception var14) {
      }

      return var1;
   }
}
