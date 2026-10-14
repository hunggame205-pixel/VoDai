package core.mchien.main2;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public final class VDTT_dg {
   public byte a = -1;
   public static VDTT_dg b;
   public static VDTT_dg c;
   public static VDTT_dg d;
   public static VDTT_dg e;
   public static VDTT_dg f;
   public static VDTT_dg[] g = new VDTT_dg[8];
   public static VDTT_di[] h = new VDTT_di[13];
   public static VDTT_dg[] i = new VDTT_dg[13];
   public static String j = " 0123456789+-*='\"\\/_?.,ˋˊ~ˀ:;|<>[]{}!@#$%^&()aáàảãạâấầẩẫậăắằẳẵặbcdđeéèẻẽẹêếềểễệfghiíìỉĩịjklmnoóòỏõọôốồổỗộơớờởỡợpqrstuúùủũụưứừửữựvxyýỳỷỹỵzwAÁÀẢÃẠÂẤẦẨẪẬĂẮẰẲẴẶBCDĐEÉÈẺẼẸÊẾỀỂỄỆFGHIÍÌỈĨỊJKLMNOÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢPQRSTUÚÙỦŨỤƯỨỪỬỮỰVXYÝỲỶỸỴZW";
   public Hashtable k = new Hashtable();
   public static Hashtable l = new Hashtable();

   private VDTT_dg(byte var1) {
   }

   private VDTT_di c() {
      if (this.a >= 0 && this.a < h.length) {
         return h[this.a];
      } else {
         return h.length > 0 ? h[0] : h[this.a];
      }
   }

   public static void a() {
      try {
         for(byte var0 = 0; var0 < h.length; ++var0) {
            if (h[var0].a()) {
               i[var0].a = var0;
            } else {
               i[var0].a = -1;
            }
         }

      } catch (Exception var1) {
      }
   }

   public static int a(VDTT_dg var0) {
      return var0.c().c / DataCenter.d().r;
   }

   public static int a(VDTT_dg var0, String var1) {
      int var10000;
      VDTT_di var4;
      if ((var4 = var0.c()).h.get(var1) != null) {
         var10000 = (Integer)var4.h.get(var1);
      } else {
         int var3 = Graphics.a(var4.a, var1);
         int var2 = 0 + var3;
         if (var1.length() > 1) {
            var2 -= var4.b;
         }

         if (var4.h.size() > var4.i) {
            var4.h.clear();
         }

         if (var3 > 0) {
            var4.h.put(var1, var2);
         }

         var10000 = var2;
      }

      return var10000 / DataCenter.d().r;
   }

   public static int b(VDTT_dg var0, String var1) {
      return var0.c().a(var1) / DataCenter.d().r;
   }

   public static int c(VDTT_dg var0, String var1) {
      return var0.c().a(var1) / DataCenter.d().r;
   }

   public static int a(VDTT_dg var0, String[] var1) {
      int var2 = 0;

      for(int var4 = 0; var4 < var1.length; ++var4) {
         int var3;
         if ((var3 = c(var0, var1[var4])) > var2) {
            var2 = var3;
         }
      }

      return var2;
   }

   public static Vector a(VDTT_dg var0, String var1, int var2) {
      return var0.c().a(var1, var2);
   }

   public static String[] b(VDTT_dg var0, String var1, int var2) {
      Vector var3;
      String[] var4 = new String[(var3 = var0.c().a(var1, var2)).size()];
      var3.copyInto(var4);
      return var4;
   }

   public static String[] c(VDTT_dg var0, String var1, int var2) {
      Vector var3;
      String[] var4 = new String[(var3 = var0.c().a(var1, 60)).size()];

      for(var2 = 0; var2 < var4.length; ++var2) {
         var4[var2] = (String)var3.get(var2);
      }

      return var4;
   }

   public static void a(VDTT_dg var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      if (!d()) {
         var0.c().a(Graphics.a(var0.a), var6, var7, var1, var2, var3, var4, var5);
      }
   }

   public static void a(VDTT_dg var0, Graphics var1, String var2, int var3, int var4, int var5, int var6) {
      if (!d()) {
         var0.c().a(Graphics.a(var0.a), var6, 0, var1, var2, var3, var4, var5);
      }
   }

   public static void b(VDTT_dg var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      if (!d()) {
         var0.c().a(Graphics.a(var0.a), var6, var7, var1, var2, var3, var4, var5);
      }
   }

   public static void a(BitmapFont var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      if (!d()) {
         h[0].a(var0, var6, var7, var1, var2, var3, var4, var5);
      }
   }

   public static void c(VDTT_dg var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      if (!d()) {
         byte var8 = 1;
         byte var9 = 0;
         switch(var7) {
         case 2:
            var7 = 0;
            var9 = 10;
            break;
         case 3:
            var7 = 1;
            var9 = 10;
            break;
         case 4:
            var7 = 0;
            var9 = 1;
            break;
         case 5:
            var7 = 1;
            var9 = 1;
            break;
         case 6:
            var7 = 0;
            var9 = 2;
            break;
         case 7:
            var7 = 1;
            var9 = 2;
            break;
         case 8:
            var7 = 0;
            var8 = 2;
            break;
         case 9:
            var7 = 1;
            var8 = 2;
            break;
         case 10:
            var7 = 0;
            var8 = 3;
            break;
         case 11:
            var7 = 1;
            var8 = 3;
            break;
         case 12:
            var7 = 0;
            var9 = 1;
            var8 = 2;
            break;
         case 13:
            var7 = 1;
            var9 = 1;
            var8 = 2;
            break;
         case 98:
            a(var0, var1, var2, var3, var4, 2, var5, var6, 0, 20);
            return;
         }

         byte var10 = 4;
         if (var7 == 1) {
            if (var2.length() > 15) {
               var10 = 2;
            } else if (var2.length() > 10) {
               var10 = 3;
            }
         } else if (var2.length() > 18) {
            var10 = 2;
         } else if (var2.length() > 12) {
            var10 = 3;
         }

         a(var0, var1, var2, var3, var4, 2, var5, var10, var9, var7, var8, var6);
      }
   }

   public static void a(VDTT_dg var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (!d()) {
         a(var0, var1, var2, var3, var4, var5, var6, var7, var8, 0, 1, 0);
      }
   }

   public static void a(VDTT_dg var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      a(var0, var1, var2, var3, var4, var5, var6, 2, var8, var9, var10, 0);
   }

   private static void a(VDTT_dg var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (!d()) {
         var7 = a(var2, var7, var9);
         BitmapFont var12 = Graphics.a(var0.a);
         Vector var13 = new Vector();

         for(int var14 = 0; var14 < var10; ++var14) {
            if (var9 == 0) {
               var13.add(var7 - var14);
            } else {
               var13.add(var7 + var14);
            }
         }

         String var20 = var0.a + "#" + var2;
         VDTT_dh var18 = (VDTT_dh)l.get(var20);
         var3 = var3;
         if (var5 == 2) {
            if (var18 == null) {
               var3 -= b(var0, var2) / 2;
            } else {
               var3 -= var18.c / 2;
            }
         }

         var5 = 0;
         var9 = var8;
         boolean var19 = false;
         if (var6 >= -180 && var6 <= 180 && var6 != 0 && var6 != -1) {
            var1.c((float)var6);
            var19 = true;
         }

         for(int var15 = 0; var15 < var2.length(); ++var15) {
            String var16 = var2.substring(var15, var15 + 1);
            if (var13.indexOf(var15) < 0) {
               if (!var19 && var6 != 0) {
                  var1.a(var0.a, var12, var16, (float)(var3 + var5), (float)var4, 0, var6, 0.0F);
               } else {
                  var1.a(var0.a, var12, var16, (float)(var3 + var5), (float)var4, 0, -1, 0.0F);
               }
            } else {
               if (var8 == 10) {
                  var9 = -1;
                  switch(DataCenter.d().r) {
                  case 1:
                     var12.getData().setScale(0.33F, 0.33F);
                     break;
                  case 2:
                     var12.getData().setScale(0.66F, 0.66F);
                     break;
                  case 3:
                     var12.getData().setScale(0.99F, 0.99F);
                     break;
                  case 4:
                     var12.getData().setScale(1.32F, 1.32F);
                  }
               }

               if (var19) {
                  if (var11 >= -180 && var11 <= 180 && var11 != 0 && var11 != -1) {
                     var1.c((float)var11);
                     var1.a(var0.a, var12, var16, (float)(var3 + var5), (float)(var4 + var9), 0, -1, 0.0F);
                  } else {
                     var1.r();
                     if (var11 == 0) {
                        var1.a(var0.a, var12, var16, (float)(var3 + var5), (float)(var4 + var9), 0, -1, 0.0F);
                     } else {
                        var1.a(var0.a, var12, var16, (float)(var3 + var5), (float)(var4 + var9), 0, var11, 0.0F);
                     }

                     var1.c((float)var6);
                  }
               } else if (var11 == 0) {
                  var1.a(var0.a, var12, var16, (float)(var3 + var5), (float)(var4 + var9), 0, -1, 0.0F);
               } else {
                  var1.a(var0.a, var12, var16, (float)(var3 + var5), (float)(var4 + var9), 0, var11, 0.0F);
               }

               if (var8 == 10) {
                  var12 = Graphics.a(var0.a);
               }
            }

            var5 += b(var0, var16);
            if (var0.a == 0) {
               ++var5;
            }
         }

         if (var19) {
            var1.r();
         }

         if (var18 == null) {
            var18 = new VDTT_dh(var0.a, var20, var5);
         }

         if (l.size() > 500) {
            l.clear();
         }

         l.put(var18.b, var18);
      }
   }

   public static void a(Graphics var0, String var1, int var2, int var3, int var4, int var5) {
      if (!d()) {
         var0.a(0, Graphics.a(0), var1, (float)var2, (float)var3, var4, var5, 0.0F);
      }
   }

   public static int d(VDTT_dg var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      return d() ? 0 : var0.c().a(var0, Graphics.a(var0.a), var6, var7, var1, var2, var3, var4, var5);
   }

   public static int e(VDTT_dg var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      return d() ? 0 : var0.c().a(var0, Graphics.b(75), var6, var7, var1, var2, var3, var4, var5);
   }

   public static void b(VDTT_dg var0, Graphics var1, String var2, int var3, int var4, int var5, int var6) {
      a(var0, var1, var2, var3, var4, 2, -1, var6, 0, 20);
   }

   private static void a(VDTT_dg var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (!d()) {
         if (VDTT_jb.b(DataCenter.d().h % 20) >= 10) {
            var0.c().a(Graphics.a(var0.a), var6, 0, var1, var2, var3, var4, 2);
         } else {
            var0.c().a(Graphics.a(var0.a), var7, 0, var1, var2, var3, var4, 2);
         }
      }
   }

   private static int a(String var0, int var1, int var2) {
      int var4 = var0.length();
      if (var2 == 10 || var2 == 1) {
         ++var4;
      }

      if (var1 == 0) {
         var1 = 1;
      }

      int var3 = DataCenter.d().h / var1 % var4;
      switch(var2) {
      case 1:
      case 99:
         var3 = DataCenter.d().h / var1 % (var4 * 2) % var4;
         if (DataCenter.d().h / var1 % (var4 * 2) >= var4) {
            var3 = var4 - 1 - var3;
         }
      default:
         return var3;
      }
   }

   public static String[] a(String var0, int var1) {
      Vector var6 = new Vector();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         if (var0.charAt(var2) == ' ') {
            var6.addElement(var0.substring(0, var2).trim());
            var0 = var0.substring(var2);
            var2 = 0;
         }
      }

      var6.addElement(var0.trim());
      String[] var7 = new String[2];
      int var5 = 0;
      int var3 = 0;

      for(int var4 = 0; var4 < var6.size(); ++var4) {
         if (var7[var5] == null) {
            var7[var5] = "";
         }

         var7[var5] = var7[var5] + var6.elementAt(var4).toString() + " ";
         ++var3;
         if (var3 == var6.size() / 2) {
            var7[var5] = var7[var5].trim();
            var3 = 0;
            ++var5;
            if (var5 >= 2) {
               var5 = 1;
               var7[1] = var7[1] + " ";
            }
         }
      }

      return var7;
   }

   private static boolean d() {
      try {
         if (Graphics.i()) {
            return true;
         }
      } catch (Exception var0) {
      }

      return false;
   }

   public final VDTT_ef a(String var1, int var2, BitmapFont var3) {
      String var4 = var2 + "_" + var1;
      VDTT_ef var5;
      if ((var5 = (VDTT_ef)this.k.get(var4)) == null) {
         (var5 = new VDTT_ef()).a = var4;
         var5.b = 0.0F;
         String var6 = var1.toLowerCase();

         for(int var8 = 0; var8 < var6.length() - 1 && var5.c.size() <= 10; ++var8) {
            for(int var7 = 2; var7 <= 8; ++var7) {
               int var9;
               if ((var9 = var8 + var7) > var1.length()) {
                  var9 = var1.length();
               }

               VDTT_in var13;
               if ((var13 = (VDTT_in)VDTT_in.h.get(var6.substring(var8, var9))) != null) {
                  String var11 = var13.d;
                  String var10;
                  VDTT_io var14;
                  if ((var10 = var1.substring(0, var8)).length() > 0) {
                     var14 = new VDTT_io(this.a, var3, var10, var2);
                     var5.b += var14.d;
                     var5.c.add(var14);
                  }

                  if (var13.c > 0) {
                     var14 = new VDTT_io(var13.c, var13.a);
                     var5.b += var14.d;
                     var5.c.add(var14);
                  } else {
                     var2 = var13.b;
                  }

                  var1 = var1.substring(var8 + var11.length(), var1.length());
                  var6 = var6.substring(var8 + var13.d.length(), var6.length());
                  var8 = -1;
                  break;
               }
            }
         }

         if (var1.length() > 0) {
            VDTT_io var12 = new VDTT_io(this.a, var3, var1.substring(0, var1.length()), var2);
            var5.b += var12.d;
            var5.c.add(var12);
         }

         if (this.k.size() > 100) {
            this.k.clear();
         }

         this.k.put(var4, var5);
      }

      return var5;
   }

   public static void b() {
      l.clear();

      for(int var0 = 0; var0 < i.length; ++var0) {
         try {
            i[var0].k.clear();
            VDTT_di var1 = i[var0].c();

            try {
               Iterator var2 = var1.f.keySet().iterator();

               while(var2.hasNext()) {
                  String var3 = (String)var2.next();
                  ((VDTT_v)var1.f.get(var3)).a();
               }

               var1.f.clear();
               var1.g.clear();
               var1.h.clear();
            } catch (Exception var4) {
            }
         } catch (Exception var5) {
         }
      }

   }

   static {
      for(int var0 = 0; var0 < i.length; ++var0) {
         i[var0] = new VDTT_dg((byte)-1);
         switch(var0) {
         case 0:
            d = i[var0];
            break;
         case 1:
            e = i[var0];
            break;
         case 2:
            f = i[var0];
            break;
         case 3:
            b = i[var0];
            break;
         case 4:
            c = i[var0];
            break;
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
            g[var0 - 5] = i[var0];
         }

         h[var0] = new VDTT_di(var0);
      }

   }
}
