package core.mchien.main2;

import static com.badlogic.gdx.Gdx.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Blending;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Iterator;
import core.mchien.vn.system.DialogText;

public final class VDTT_aa {
   private static final int[] c = new int[]{768, 769, 771, 777, 803};
   private static final char[] d = new char[]{'a', 'ă', 'â', 'e', 'ê', 'i', 'y', 'o', 'ô', 'ơ', 'u', 'ư'};
   private static final char[][] e = new char[][]{{'à', 'á', 'ã', 'ả', 'ạ'}, {'ằ', 'ắ', 'ẵ', 'ẳ', 'ặ'}, {'ầ', 'ấ', 'ẫ', 'ẩ', 'ậ'}, {'è', 'é', 'ẽ', 'ẻ', 'ẹ'}, {'ề', 'ế', 'ễ', 'ể', 'ệ'}, {'ì', 'í', 'ĩ', 'ỉ', 'ị'}, {'ỳ', 'ý', 'ỹ', 'ỷ', 'ỵ'}, {'ò', 'ó', 'õ', 'ỏ', 'ọ'}, {'ồ', 'ố', 'ỗ', 'ổ', 'ộ'}, {'ờ', 'ớ', 'ỡ', 'ở', 'ợ'}, {'ù', 'ú', 'ũ', 'ủ', 'ụ'}, {'ừ', 'ứ', 'ữ', 'ử', 'ự'}};
   public static VDTT_x a;
   private static boolean f;
   private static Object g = new Object();
   public static boolean b;

   public static String a() {
      return "";
   }

   public static String a(String var0) {
      var0 = b(var0);
      return VDTT_da.a + var0;
   }

   public static String b(String var0) {
      if (var0.startsWith("char_icon_")) {
         var0 = "ca" + var0.substring(10);
      } else if (var0.startsWith("client_icon_")) {
         var0 = "ci" + var0.substring(12);
      } else if (var0.startsWith("mapmini_")) {
         var0 = "mi" + var0.substring(8);
      } else if (var0.startsWith("mapsmall_")) {
         var0 = "ms" + var0.substring(9);
      } else if (var0.startsWith("tree_")) {
         var0 = "tr" + var0.substring(5);
      } else if (var0.startsWith("arr_check_")) {
         var0 = "ar" + var0.substring(10);
      } else if (var0.startsWith("arr_acc")) {
         var0 = "aa" + var0.substring(7);
      } else if (var0.startsWith("arr_binary")) {
         var0 = "ab" + var0.substring(10);
      } else if (var0.startsWith("arr_config")) {
         var0 = "ac" + var0.substring(10);
      } else if (var0.startsWith("arr_data_game")) {
         var0 = "gad" + var0.substring(13);
      } else if (var0.startsWith("arr_map_")) {
         var0 = "am" + var0.substring(8);
      } else if (var0.startsWith("arr_server")) {
         var0 = "as" + var0.substring(10);
      } else if (var0.startsWith("arr_auto")) {
         var0 = "at" + var0.substring(8);
      } else if (var0.startsWith("arr_skill_")) {
         var0 = "al" + var0.substring(10);
      } else if (var0.startsWith("shortcutItem")) {
         var0 = "st" + var0.substring(12);
      }

      return var0;
   }

   public static VDTT_v a(VDTT_v var0, int var1, int var2) {
      try {
         VDTT_v var3;
         a((var3 = VDTT_v.a(var1, var2)).b, var0, 0, 0, var0.c, var0.d, 0, 0, var1, var2, Blending.None);
         VDTT_v var9 = var3;
         return var9;
      } catch (Exception var7) {
      } finally {
         var0.a();
      }

      return null;
   }

   public static void a(Graphics var0, VDTT_v var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, boolean var14) {
      var6 = var4;
      var4 = DataCenter.d().r;
      if (var14) {
         DataCenter.d();
         var4 = DataCenter.j();
      }

      var6 *= var4;
      var7 = var5 * var4;
      var0.a(var1, var2, var3, var6, var7, var8, (float)var9, (float)var10, (float)var11, (float)var12, var13);
   }

   public static void a(Graphics var0, VDTT_v var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      a(var0, var1, 0, 0, var4, 25, 0, 0, 0, 2, 2, var9, var10, 20, false);
   }

   public static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      VDTT_dc.a(var0, var1, var2, var3, var4, var5 * DataCenter.d().r, var6 * DataCenter.d().r, 0, 0, 0, 0, 20);
   }

   public static void b(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      VDTT_dc.a(var0, var1, var2, var3, var4, var5 * DataCenter.d().r, var6 * DataCenter.d().r, 0, 0, 0, 0, 20);
   }

   public static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      VDTT_dc.a(var0, var1, var2, var3, var4, var5, 20);
   }

   public static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      VDTT_dc.a(var0, var1, var2, var3, var4, var5, var6);
   }

   public static int[] b(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      return VDTT_dc.c(var0, var1, var2, var3, var4, var5 * DataCenter.d().r, 0, 0, 0, 0, 0, 20);
   }

   public static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      VDTT_dc.a(var0, var1, 0, var3, var4, var5, var6, 3);
   }

   public static void c(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      VDTT_dc.a(var0, 208, 0, var3, var4, 90, Graphics.s(), 20);
   }

   public static void c(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      VDTT_dc.a(var0, var1, var2, var3, var4, var5, Graphics.s(), 33);
   }

   public static void a(VDTT_ca var0, String var1, String var2, int var3, int var4, boolean var5) {
      if (VDTT_eq.a().b(9) == 1) {
         if (!f) {
            f = true;
//            DialogText.a(new VDTT_ab(var0), var2, var1, "");
            input.getTextInput(new VDTT_ab(var0),var2,var1,"");
         }
      } else {
         if (VDTT_eq.a().b(9) == 0) {
            if (DataCenter.d().ai.c instanceof VDTT_x) {
               return;
            }

            a = new VDTT_x(DataCenter.d().ai, var0, false, true);
            DataCenter.d().ai.a((MainScreen)a);
            f = false;
         }

      }
   }

   public static void a(VDTT_ca var0, String var1, String var2, int var3, int var4) {
      a = new VDTT_x(DataCenter.d().ai, var0, false, false);
      DataCenter.d().ai.a((MainScreen)a);
   }

   /** Doc het stream thanh mang byte (khong dung available() - sai khi asset nam trong file .exe/.jar). */
   private static byte[] readAll(InputStream var0) {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         byte[] var2 = new byte[8192];

         int var3;
         while((var3 = var0.read(var2)) != -1) {
            if (var3 > 0) {
               var1.write(var2, 0, var3);
            }
         }

         var0.close();
         byte[] var4 = var1.toByteArray();
         var1.close();
         return var4;
      } catch (Exception var5) {
         VDTT_jb.a(var5);
         return null;
      }
   }

   public static VDTT_v c(String var0) {
      VDTT_de var1 = null;
      boolean var8 = false;

      VDTT_v var15;
      label101: {
         try {
            var8 = true;
            DataCenter.d();
            if (!DataCenter.t() && DataCenter.k()) {
               var15 = VDTT_v.b(VDTT_jb.a(Gdx.files.internal("main").readBytes()));
               return var15;
            }

            var0 = ("/" + var0).substring(1);
            VDTT_de var14;
            byte[] var2 = readAll(VDTT_jb.h(var0).read());
            if (var2 == null) {
               var8 = false;
               return null;
            }

            var14 = var1 = new VDTT_de(var2);
            var15 = VDTT_v.a(VDTT_jb.a(var2));
            VDTT_p.a.add(var15);
            var15 = var15;
            var8 = false;
            break label101;
         } catch (Exception var12) {
            var8 = false;
         } finally {
            if (var8) {
               try {
                  if (var1 != null) {
                     var1.d();
                  }
               } catch (Exception var10) {
                  VDTT_jb.a(var10);
               }

            }
         }

         try {
            if (var1 != null) {
               var1.d();
            }
         } catch (Exception var9) {
            VDTT_jb.a(var9);
         }

         return null;
      }

      try {
         var1.d();
      } catch (Exception var11) {
         VDTT_jb.a(var11);
      }

      return var15;
   }

   public static void a(Hashtable var0) {
      try {
         Iterator var2 = var0.keySet().iterator();

         while(var2.hasNext()) {
            Object var1 = var2.next();

            try {
               VDTT_v var5;
               if ((var5 = (VDTT_v)var0.get(var1)) != null) {
                  var5.a();
               }
            } catch (Exception var3) {
            }
         }

         var0.clear();
      } catch (Exception var4) {
      }
   }

   public static void a(VDTT_v var0, int var1, int var2, int var3) {
      if (var0 != null && var0.b != null) {
         if (!b) {
            synchronized(g) {
               var0.b.setBlending(Blending.None);
               var0.b.drawPixel(var1, var2, var3);
            }
         } else {
            var0.b.drawPixel(var1, var2, var3);
         }

      }
   }

   public static void a(VDTT_v var0, VDTT_v var1, int var2, int var3, int var4, int var5) {
      if (var1 != null && var0 != null) {
         Pixmap var6;
         if ((var6 = var1.b) != null && !var6.isDisposed()) {
            int var7 = var6.getWidth();
            int var8 = var6.getHeight();
            int var9 = (int)((float)var7 * (float)var4 / 100.0F);
            var4 = (int)((float)var8 * (float)var4 / 100.0F);
            if (0 + var7 > var6.getWidth()) {
               var7 = var6.getWidth() - 0;
            }

            if (0 + var8 > var6.getHeight()) {
               var8 = var6.getHeight() - 0;
            }

            if ((var5 & 2) != 0) {
               var3 -= var9 / 2;
            } else if ((var5 & 32) != 0) {
               var3 -= var4;
            }

            if ((var5 & 8) != 0) {
               var2 -= var9;
            } else if ((var5 & 1) != 0) {
               var2 -= var4 / 2;
            }

            a(var0.b, var1, 0, 0, var7, var8, var2, var3, var9, var4, Blending.SourceOver);
         }
      }
   }

   public static void a(Pixmap var0, VDTT_v var1, int var2, int var3, Blending var4) {
      if (var0 != null && !var0.isDisposed() && var1 != null) {
         Pixmap var7;
         if ((var7 = var1.b) != null && !var7.isDisposed()) {
            if (!b) {
               synchronized(g) {
                  var0.setBlending(var4);
                  var0.drawPixmap(var7, var2, var3, 0, 0, var7.getWidth(), var7.getHeight());
               }
            } else {
               var0.drawPixmap(var7, var2, var3, 0, 0, var7.getWidth(), var7.getHeight());
            }

         }
      }
   }

   public static void a(Pixmap var0, VDTT_v var1, int var2, int var3, int var4, int var5, int var6, int var7, Blending var8) {
      if (var0 != null && !var0.isDisposed() && var1 != null) {
         Pixmap var11;
         if ((var11 = var1.b) != null && !var11.isDisposed()) {
            if (var4 + var6 > var11.getWidth()) {
               var6 = var11.getWidth() - var4;
            }

            if (var5 + var7 > var11.getHeight()) {
               var7 = var11.getHeight() - var5;
            }

            if (!b) {
               synchronized(g) {
                  var0.setBlending(var8);
                  var0.drawPixmap(var11, var2, var3, var4, var5, var6, var7);
               }
            } else {
               var0.drawPixmap(var11, var2, var3, var4, var5, var6, var7);
            }

         }
      }
   }

   public static void a(Pixmap var0, VDTT_v var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Blending var10) {
      if (var0 != null && !var0.isDisposed() && var1 != null) {
         Pixmap var12;
         if ((var12 = var1.b) != null && !var12.isDisposed()) {
            if (0 + var4 > var12.getWidth()) {
               var4 = var12.getWidth() - 0;
            }

            if (0 + var5 > var12.getHeight()) {
               var5 = var12.getHeight() - 0;
            }

            if (!b) {
               synchronized(g) {
                  var0.setBlending(var10);
                  var0.drawPixmap(var12, 0, 0, var4, var5, var6, var7, var8, var9);
               }
            } else {
               var0.drawPixmap(var12, 0, 0, var4, var5, var6, var7, var8, var9);
            }

         }
      }
   }

   public static void b(Pixmap var0, VDTT_v var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Blending var10) {
      if (var0 != null && !var0.isDisposed() && var1 != null) {
         Pixmap var12;
         if ((var12 = var1.b) != null && !var12.isDisposed()) {
            if (0 + var4 > var12.getWidth()) {
               var4 = var12.getWidth() - 0;
            }

            if (0 + var5 > var12.getHeight()) {
               var5 = var12.getHeight() - 0;
            }

            if (!b) {
               synchronized(g) {
                  var0.setBlending(var10);
                  var0.drawPixmap(var12, 0, 0, var4, var5, var6, var7, var8, var9);
               }
            } else {
               var0.drawPixmap(var12, 0, 0, var4, var5, var6, var7, var8, var9);
            }

         }
      }
   }

   public static void a(Pixmap var0, Pixmap var1, int var2, int var3, int var4, int var5, Blending var6) {
      if (var0 != null && !var0.isDisposed() && var1 != null && !var1.isDisposed()) {
         if (!b) {
            synchronized(g) {
               var0.setBlending(var6);
               int var9;
               if (var4 == 0) {
                  for(var9 = var3; var9 < var5 + var3; var9 += var1.getHeight()) {
                     if (var9 + var1.getHeight() >= var5 + var3) {
                        var9 = var5 + var3 - var1.getHeight();
                        var0.drawPixmap(var1, var2, var9);
                        break;
                     }

                     var0.drawPixmap(var1, var2, var9);
                  }
               } else {
                  for(var9 = var2; var9 < var4 + var2; var9 += var1.getWidth()) {
                     if (var9 + var1.getWidth() >= var4 + var2) {
                        var9 = var4 + var2 - var1.getWidth();
                        var0.drawPixmap(var1, var9, var3);
                        break;
                     }

                     var0.drawPixmap(var1, var9, var3);
                  }
               }
            }
         } else {
            int var7;
            if (var4 == 0) {
               var7 = var3;

               while(true) {
                  if (var7 >= var5 + var3) {
                     return;
                  }

                  if (var7 + var1.getHeight() >= var5 + var3) {
                     var7 = var5 + var3 - var1.getHeight();
                     var0.drawPixmap(var1, var2, var7);
                     break;
                  }

                  var0.drawPixmap(var1, var2, var7);
                  var7 += var1.getHeight();
               }
            } else {
               for(var7 = var2; var7 < var4 + var2; var7 += var1.getWidth()) {
                  if (var7 + var1.getWidth() >= var4 + var2) {
                     var7 = var4 + var2 - var1.getWidth();
                     var0.drawPixmap(var1, var7, var3);
                     return;
                  }

                  var0.drawPixmap(var1, var7, var3);
               }
            }
         }

      }
   }

   public static String a(String var0, String var1) {
      return var1 == "" ? VDTT_da.a + var0 : VDTT_da.a + var0 + "." + var1;
   }

   // $FF: synthetic method
   static boolean a(boolean var0) {
      f = false;
      return false;
   }

   // $FF: synthetic method
   static char[] b() {
      return d;
   }

   // $FF: synthetic method
   static int[] c() {
      return c;
   }

   // $FF: synthetic method
   static char[][] d() {
      return e;
   }
}
