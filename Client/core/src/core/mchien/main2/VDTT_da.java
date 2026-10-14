package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class VDTT_da {
   public static String a = "vdtt/";
   private static boolean b;
   private static byte[] c = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 2, 0, 0, 0, 2, 8, 6, 0, 0, 0, 114, -74, 13, 36, 0, 0, 0, 11, 73, 68, 65, 84, 120, 94, 99, 96, 64, 7, 0, 0, 18, 0, 1, 11, -69, 36, -100, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};

   public static VDTT_de a(String var0) {
      byte[] var1;
      return (var1 = b(var0, true)) != null ? new VDTT_de(var1) : null;
   }

   public static short[] a() {
      VDTT_de var0 = null;

      short[] var1;
      try {
         if ((var0 = a("arr_keys")) == null) {
            return new short[]{19, 20, 21, 22, 53, 48, 46, 33, 51, 45, 29, 47, 32, 34, 62};
         }

         var1 = new short[]{var0.a.readShort(), var0.a.readShort(), var0.a.readShort(), var0.a.readShort(), var0.a.readShort(), var0.a.readShort(), var0.a.readShort(), var0.a.readShort(), var0.a.readShort(), var0.a.readShort(), var0.a.readShort(), var0.a.readShort(), var0.a.readShort(), var0.a.readShort(), var0.a.readShort()};
      } catch (Exception var4) {
         VDTT_jb.a(var4);
         return new short[]{19, 20, 21, 22, 53, 48, 46, 33, 51, 45, 29, 47, 32, 34, 62};
      } finally {
         if (var0 != null) {
            var0.d();
         }

      }

      return var1;
   }

   public static byte[] b(String var0) {
      return a(var0, (ByteArrayOutputStream)null, (byte[])null, new int[1], new int[1], 20, true);
   }

   public static byte[] c(String var0) {
      return a(var0, (ByteArrayOutputStream)null, (byte[])null, new int[1], new int[1], 20, true);
   }

   private static byte[] a(String var0, ByteArrayOutputStream var1, byte[] var2, int[] var3, int[] var4, int var5, boolean var6) {
      while(true) {
         if (DataCenter.aj) {
            var5 = 1;
         }
System.out.println(var0);
         
         int var10002 = var4[0]++;
         HttpURLConnection var7 = null;
         BufferedInputStream var8 = null;
         byte[] var9 = null;
         boolean var20 = false;

         label268: {
            try {
               var20 = true;
               (var7 = (HttpURLConnection)(new URL(var0)).openConnection()).setConnectTimeout(VDTT_jb.b);
               var7.setReadTimeout(VDTT_jb.b * 2);
               if (var3[0] > 0) {
                  var7.setRequestProperty("Range", "bytes=" + var3[0] + "-");
               }

               var8 = new BufferedInputStream(var7.getInputStream());
               if (var1 == null) {
                  var1 = new ByteArrayOutputStream();
               }

               byte[] var10;
               int var11;
               for(var10 = new byte[524288]; (var11 = var8.read(var10)) != -1; var3[0] += var11) {
                  if (var6) {
                     VDTT_dn var10000 = VDTT_dn.a();
                     var10000.j += var11;
                     var10000 = VDTT_dn.a();
                     var10000.l += var11;
                  }

                  var1.write(var10, 0, var11);
               }

               var1.flush();
               if (var2 == null) {
                  var9 = var1.toByteArray();
               } else {
                  var10 = var1.toByteArray();
                  var9 = new byte[var2.length + var10.length];
                  System.arraycopy(var2, 0, var9, 0, var2.length);
                  System.arraycopy(var10, 0, var9, var2.length, var10.length);
               }

               var1.close();
               var20 = false;
               break label268;
            } catch (Exception var27) {
               var20 = false;
            } finally {
               if (var20) {
                  try {
                     if (var8 != null) {
                        var8.close();
                     }
                  } catch (Exception var22) {
                     VDTT_jb.a(var22);
                  }

                  try {
                     if (var1 != null) {
                        var1.close();
                     }
                  } catch (Exception var21) {
                     VDTT_jb.a(var21);
                  }

                  if (var7 != null) {
                     var7.disconnect();
                  }

                  if (var1 == null) {
                     VDTT_jb.g();
                     if (var4[0] > var5) {
                        return null;
                     }

                     var5 = var5;
                     var4 = var4;
                     var3 = var3;
                     var2 = var2;
                     var1 = var1;
                     var0 = var0;
                     continue;
                  }

               }
            }

            try {
               if (var8 != null) {
                  var8.close();
               }
            } catch (Exception var24) {
               VDTT_jb.a(var24);
            }

            try {
               if (var1 != null) {
                  var1.close();
               }
            } catch (Exception var23) {
               VDTT_jb.a(var23);
            }

            if (var7 != null) {
               var7.disconnect();
            }

            if (var1 == null) {
               VDTT_jb.g();
               if (var4[0] > var5) {
                  return null;
               }

               var5 = var5;
               var4 = var4;
               var3 = var3;
               var2 = var2;
               var1 = var1;
               var0 = var0;
               continue;
            }

            return var9;
         }

         try {
            var8.close();
         } catch (Exception var26) {
            VDTT_jb.a(var26);
         }

         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (Exception var25) {
            VDTT_jb.a(var25);
         }

         if (var7 != null) {
            var7.disconnect();
         }

         if (var1 != null) {
            return var9;
         }

         VDTT_jb.g();
         if (var4[0] > var5) {
            return null;
         }

         var5 = var5;
         var4 = var4;
         var3 = var3;
         var2 = var2;
         var1 = var1;
         var0 = var0;
      }
   }

   public static String a(String var0, int var1) {
      while(true) {
         HttpURLConnection var2 = null;
         BufferedReader var3 = null;
         String var4 = "";
         boolean var11 = false;

         label147: {
            label148: {
               try {
                  var11 = true;
                  (var2 = (HttpURLConnection)(new URL(var0)).openConnection()).setConnectTimeout(VDTT_jb.b);
                  var2.setReadTimeout(VDTT_jb.b * 2);

                  String var5;
                  for(var3 = new BufferedReader(new InputStreamReader(var2.getInputStream(), "UTF-8")); (var5 = var3.readLine()) != null; var4 = var4 + var5 + "\r\n") {
                  }

                  var11 = false;
                  break label148;
               } catch (Exception var15) {
                  if (var1 < 0) {
                     var15.printStackTrace();
                     var11 = false;
                  } else {
                     var11 = false;
                  }
               } finally {
                  if (var11) {
                     try {
                        if (var3 != null) {
                           var3.close();
                        }
                     } catch (Exception var12) {
                        VDTT_jb.a(var12);
                     }

                     if (var2 != null) {
                        var2.disconnect();
                     }

                  }
               }

               try {
                  if (var3 != null) {
                     var3.close();
                  }
               } catch (Exception var13) {
                  VDTT_jb.a(var13);
               }

               if (var2 != null) {
                  var2.disconnect();
               }
               break label147;
            }

            try {
               var3.close();
            } catch (Exception var14) {
               VDTT_jb.a(var14);
            }

            if (var2 != null) {
               var2.disconnect();
            }
         }

         if (var4.length() != 0) {
            return var4;
         }

         VDTT_jb.a(50L);
         --var1;
         if (var1 < 0) {
            return null;
         }

         var0 = var0;
      }
   }

   public static byte[] d(String var0) {
      return b(var0, true);
   }

   public static boolean e(String var0) {
      mFileHandle var1 = null;
      boolean var8 = false;

      label127: {
         label128: {
            try {
               var8 = true;
               if ((var1 = mFileHandle.a(VDTT_aa.a(var0), false)) != null) {
                  if (var1.a(1) != null) {
                     var8 = false;
                     break label127;
                  }

                  var8 = false;
               } else {
                  var8 = false;
               }
               break label128;
            } catch (Exception var13) {
               VDTT_jb.a(var13);
               var8 = false;
            } finally {
               if (var8) {
                  try {
                     if (var1 != null) {
                        var1.a = null;
                     }
                  } catch (Exception var9) {
                     VDTT_jb.a(var9);
                  }

               }
            }

            try {
               if (var1 != null) {
                  var1.a = null;
                  return false;
               }
            } catch (Exception var11) {
               VDTT_jb.a(var11);
            }

            return false;
         }

         try {
            if (var1 != null) {
               var1.a = null;
               return false;
            }
         } catch (Exception var12) {
            VDTT_jb.a(var12);
         }

         return false;
      }

      try {
         if (var1 != null) {
            var1.a = null;
         }
      } catch (Exception var10) {
         VDTT_jb.a(var10);
      }

      return true;
   }

   private static byte[] b(String var0, boolean var1) {
      if (!VDTT_eq.c() || !var0.contains("tree_") && !var0.contains("char_") && !var0.contains("mapsmall_")) {
         mFileHandle var19 = null;
         byte[] results = null;
         boolean var11 = false;

         label225: {
            try {
               int var3;
               try {
                  var11 = true;
                  if (DataCenter.aj && var0.contains("arr_data_game")) {
                     DataCenter.d();
                     if (DataCenter.k()) {
                        byte[] var20 = VDTT_jb.c(VDTT_jb.d(Gdx.files.internal("vdtt1").readBytes()));
                        return var20;
                     }
                  }

                  if ((results = (var19 = mFileHandle.a(VDTT_aa.a(var0), false)).a(1)) != null) {
                     if (var0.equals("arr_check_0")) {
                        try {
                           var3 = Integer.parseInt(new String(results, "UTF-8"));
                           b(var0, var3);
                           DataCenter.d().a(true);
                           var11 = false;
                        } catch (Exception var16) {
                           var11 = false;
                        }
                     } else if (var0.equals("arr_data_game")) {
                        results = VDTT_jb.c(results);
                        var11 = false;
                     } else if (!var0.contains("mapmini") && !var0.startsWith("mapsmall_") && !var0.startsWith("mapscale_") && !var0.contains("char_") && !var0.contains("client_") && !var0.contains("tree_") && !var0.contains("font_")) {
                        var11 = false;
                     } else {
                        results = VDTT_jb.a(results);
                        var11 = false;
                     }
                  } else {
                     var11 = false;
                  }
                  break label225;
               } catch (Exception var17) {
                  if (var0.equals("arr_check_0")) {
                     if ((results = (var19 = mFileHandle.b("data/" + var0 + VDTT_aa.a(), false)).a(1)) != null) {
                        try {
                           var3 = Integer.parseInt(new String(results, "UTF-8"));
                           b(var0, var3);
                           DataCenter.d().a(true);
                           var11 = false;
                        } catch (Exception var14) {
                           var11 = false;
                        }
                     } else {
                        var11 = false;
                     }
                  } else {
                     var11 = false;
                  }
               }
            } finally {
               if (var11) {
                  try {
                     if (var19 != null) {
                        var19.a = null;
                     }
                  } catch (Exception var12) {
                     VDTT_jb.a(var12);
                  }

               }
            }

            try {
               if (var19 != null) {
                  var19.a = null;
                  return results;
               }
            } catch (Exception var13) {
               VDTT_jb.a(var13);
            }

            return results;
         }

         try {
            if (var19 != null) {
               var19.a = null;
            }
         } catch (Exception var15) {
            VDTT_jb.a(var15);
         }

         return results;
      } else {
         return c;
      }
   }

   public static int f(String var0) {
      try {
         return Integer.parseInt(h(var0));
      } catch (Exception var1) {
         return Integer.MIN_VALUE;
      }
   }

   public static boolean g(String var0) {
      byte[] var1= b(var0, true);
      if (var1 == null || var1.length < 1) {
         return false;
      } else {
         return var1[0] != 0;
      }
   }

   public static String h(String var0) {
      Object var1 = null;

      try {
         byte[] var3;
         return (var3 = b(var0, true)) == null ? null : new String(var3, "UTF-8");
      } catch (Exception var2) {
         VDTT_jb.a(var2);
         return new String((byte[])var1);
      }
   }

   private static boolean l(String var0) {
      return !var0.contains("arr_map_") && !var0.contains("arr_data_game") && VDTT_dz.a > 0 && VDTT_eq.c();
   }

   public static void a(String var0, short[] var1) {
      if (!l(var0)) {
         mFileHandle var2 = null;
         boolean var10 = false;

         label108: {
            try {
               var10 = true;
               VDTT_df var3 = new VDTT_df();

               for(int var4 = 0; var4 < var1.length; ++var4) {
                  var3.b(var1[var4]);
               }

               byte[] var16 = var3.a.toByteArray();
               var3.a();
               if ((var2 = mFileHandle.a(VDTT_aa.a(var0), true)).a() > 0) {
                  var2.a(1, var16, 0, var16.length);
                  var10 = false;
               } else {
                  var2.a(var16, 0, var16.length);
                  var10 = false;
               }
               break label108;
            } catch (Exception var14) {
               var10 = false;
            } finally {
               if (var10) {
                  try {
                     if (var2 != null) {
                        var2.a = null;
                     }
                  } catch (Exception var11) {
                     VDTT_jb.a(var11);
                  }

               }
            }

            try {
               if (var2 != null) {
                  var2.a = null;
               }

               return;
            } catch (Exception var12) {
               VDTT_jb.a(var12);
               return;
            }
         }

         try {
            if (var2 != null) {
               var2.a = null;
            }

         } catch (Exception var13) {
            VDTT_jb.a(var13);
         }
      }
   }

   public static void a(String var0, byte[] var1) {
      if (!l(var0)) {
         mFileHandle var2 = null;
         boolean var8 = false;

         label91: {
            try {
               var8 = true;
               if ((var2 = mFileHandle.a(VDTT_aa.a(var0), true)).a() > 0) {
                  var2.a(1, var1, 0, var1.length);
                  var8 = false;
               } else {
                  var2.a(var1, 0, var1.length);
                  var8 = false;
               }
               break label91;
            } catch (Exception var12) {
               var8 = false;
            } finally {
               if (var8) {
                  try {
                     if (var2 != null) {
                        var2.a = null;
                     }
                  } catch (Exception var10) {
                     VDTT_jb.a(var10);
                  }

               }
            }

            try {
               if (var2 != null) {
                  var2.a = null;
               }

               return;
            } catch (Exception var9) {
               VDTT_jb.a(var9);
               return;
            }
         }

         try {
            if (var2 != null) {
               var2.a = null;
            }

         } catch (Exception var11) {
            VDTT_jb.a(var11);
         }
      }
   }

   public static void a(String var0, String var1) {
      try {
         a(var0, var1.getBytes("UTF-8"));
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public static void b(String var0, int var1) {
      try {
         a(var0, String.valueOf(var1).getBytes("UTF-8"));
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public static void a(String var0, boolean var1) {
      try {
         a(var0, new byte[]{(byte)(var1 ? 1 : 0)});
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public static VDTT_v i(String var0) {
      try {
         byte[] var1;
         if ((var1 = b(var0, true)) == null) {
            return null;
         } else {
            VDTT_v var3;
            if (var0.startsWith("client")) {
               var3 = VDTT_v.a(var1);
            } else {
               var3 = VDTT_v.b(var1);
            }

            if (var3 != null) {
               VDTT_cw.v().ct.add(var3);
            }

            return var3;
         }
      } catch (Exception var2) {
         return null;
      }
   }

   public static VDTT_v a(byte[] var0) {
      try {
         VDTT_v var2;
         if ((var2 = VDTT_v.b(var0)) != null) {
            VDTT_cw.v().ct.add(var2);
         }

         return var2;
      } catch (Exception var1) {
         VDTT_jb.a(var1);
         return null;
      }
   }

   public static void a(VDTT_v var0) {
      if (var0 != null) {
         var0.d();
      }

   }

   public static void b(VDTT_v var0) {
      if (var0 != null) {
         var0.a();
      }

   }

   public static void j(String var0) {
      try {
         VDTT_jb.i(var0).delete();
      } catch (Exception var1) {
         VDTT_jb.a(var1);
      }
   }

   public static void k(String var0) {
      try {
         FileHandle[] var1;
         int var2 = (var1 = VDTT_jb.i("").list()).length;

         for(int var3 = 0; var3 < var2; ++var3) {
            FileHandle var4;
            if ((var4 = var1[var3]).name().startsWith(var0)) {
               var4.delete();
            }
         }

      } catch (Exception var5) {
         VDTT_jb.a(var5);
      }
   }

   public static void a(boolean var0) {
      try {
         FileHandle[] var1;
         int var2 = (var1 = VDTT_jb.i("").list()).length;

         for(int var3 = 0; var3 < var2; ++var3) {
            FileHandle var4 = var1[var3];

            try {
               if (!var4.name().startsWith(VDTT_aa.b("arr_acc")) && !var4.name().startsWith(VDTT_aa.b("arr_config")) && !var4.name().startsWith(VDTT_aa.b("arr_full")) && !var4.name().startsWith(VDTT_aa.b("arr_sc")) && !var4.name().startsWith(VDTT_aa.b("arr_auto")) && !var4.name().startsWith(VDTT_aa.b("arr_server"))) {
                  var4.delete();
               }
            } catch (Exception var5) {
            }
         }

         DataCenter.d().q = 0;
         VDTT_cm.K = false;
      } catch (Exception var6) {
         VDTT_jb.a(var6);
      }

      if (var0) {
         DataCenter var10000 = DataCenter.d();
         VDTT_cl var7 = new VDTT_cl();
         var10000.ai = var7;
      }

   }

   public static void a(byte[] var0, boolean var1) {
      ZipInputStream var20 = null;
      boolean var11 = false;

      label131: {
         try {
            var11 = true;
            var20 = new ZipInputStream(new ByteArrayInputStream(var0));

            ZipEntry var18;
            while((var18 = var20.getNextEntry()) != null) {
               try {
                  ByteArrayOutputStream var2 = new ByteArrayOutputStream();
                  byte[] var3 = new byte[524288];

                  int var4;
                  while((var4 = var20.read(var3)) != -1) {
                     var2.write(var3, 0, var4);
                  }

                  var2.flush();
                  String var19;
                  if (!(var19 = var18.getName().replaceAll("bitmapC", "c").replaceAll("iconTreeZip", "tree").replaceAll("iconTree", "tree").replaceAll("iconCharZip", "char_icon").replaceAll("iconChar", "char_icon").replaceAll("iconClient", "client_icon").replaceAll("/", "_").replaceAll(".png", "").replaceAll(VDTT_aa.a(), "")).contains("music")) {
                     var19.contains("sound");
                  }

                  if ((var3 = var2.toByteArray()).length > 0) {
                     a(var19, var3);
                  }

                  var2.close();
               } catch (Exception var15) {
               }
            }

            var11 = false;
            break label131;
         } catch (Exception var16) {
            var11 = false;
         } finally {
            if (var11) {
               try {
                  if (var20 != null) {
                     var20.close();
                  }
               } catch (Exception var13) {
               }

            }
         }

         try {
            if (var20 != null) {
               var20.close();
            }

            return;
         } catch (Exception var12) {
            return;
         }
      }

      try {
         var20.close();
      } catch (Exception var14) {
      }
   }

   public static void b(boolean var0) {
      if (DataCenter.k()) {
         if (var0 && !b) {
            b = true;
            VDTT_dc.a(VDTT_jb.b(Gdx.files.internal("vdtt2").readBytes()));
         } else {
            DataCenter.d();
            if (!DataCenter.t()) {
               a(false);
               b(a(DataCenter.d().linkResources + "download/ios_assets_full.zip", (ByteArrayOutputStream)null, (byte[])null, new int[1], new int[1], 4, false));
               Gdx.app.postRunnable(new VDTT_db());
            }

         }
      }
   }

   private static void b(byte[] var0) {
      ZipInputStream var1 = null;
      boolean var11 = false;

      label122: {
         try {
            var11 = true;
            var1 = new ZipInputStream(new ByteArrayInputStream(var0));

            ZipEntry var18;
            while((var18 = var1.getNextEntry()) != null) {
               try {
                  ByteArrayOutputStream var2 = new ByteArrayOutputStream();
                  byte[] var3 = new byte[524288];

                  int var4;
                  while((var4 = var1.read(var3)) != -1) {
                     var2.write(var3, 0, var4);
                  }

                  var2.flush();
                  String var19 = var18.getName().replaceAll("/", "_");
                  if ((var3 = var2.toByteArray()).length > 0) {
                     a(var19, var3, "");
                  }

                  var2.close();
               } catch (Exception var15) {
               }
            }

            var11 = false;
            break label122;
         } catch (Exception var16) {
            var11 = false;
         } finally {
            if (var11) {
               try {
                  if (var1 != null) {
                     var1.close();
                  }
               } catch (Exception var13) {
               }

            }
         }

         try {
            if (var1 != null) {
               var1.close();
            }

            return;
         } catch (Exception var12) {
            return;
         }
      }

      try {
         var1.close();
      } catch (Exception var14) {
      }
   }

   public static void a(String var0, byte[] var1, String var2) {
      if (!l(var0)) {
         mFileHandle var3 = null;
         boolean var9 = false;

         label86: {
            try {
               var9 = true;
               (var3 = mFileHandle.a(VDTT_aa.a(var0, var2), true)).a(var1, 0, var1.length);
               var9 = false;
               break label86;
            } catch (Exception var13) {
               VDTT_jb.a(var13);
               var9 = false;
            } finally {
               if (var9) {
                  try {
                     if (var3 != null) {
                        var3.a = null;
                     }
                  } catch (Exception var11) {
                     VDTT_jb.a(var11);
                  }

               }
            }

            try {
               if (var3 != null) {
                  var3.a = null;
               }

               return;
            } catch (Exception var10) {
               VDTT_jb.a(var10);
               return;
            }
         }

         try {
            if (var3 != null) {
               var3.a = null;
            }

         } catch (Exception var12) {
            VDTT_jb.a(var12);
         }
      }
   }
}
