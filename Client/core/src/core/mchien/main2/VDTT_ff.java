package core.mchien.main2;

import java.util.Hashtable;
import java.util.Vector;

final class VDTT_ff implements Runnable {
   public final void run() {
      while(true) {
         while(true) {
            try {
               while(true) {
                  synchronized(VDTT_fe.f()) {
                     try {
                        VDTT_fe.a(1);
                        VDTT_fe.f().wait(1000000000L);
                     } catch (Exception var13) {
                        VDTT_jb.a(var13);
                     }
                  }

                  if (VDTT_fe.g()) {
                     try {
                        VDTT_fe.a(2);
                        VDTT_ek.b(VDTT_fe.h(), VDTT_fe.i());
                        XYEntity var1;
                        if ((var1 = VDTT_ek.b(VDTT_fe.j(), VDTT_fe.k())) != null) {
                           VDTT_fe.b(var1.objX);
                           VDTT_fe.c(var1.objY);
                        }

                        VDTT_cw.v();
                        XYEntity[] var2 = VDTT_fn.d(VDTT_fe.h(), VDTT_fe.i());
                        VDTT_cw.v();
                        XYEntity[] var3 = VDTT_fn.d(VDTT_fe.j(), VDTT_fe.k());
                        if (VDTT_jb.a(var2, var3)) {
                           VDTT_fe.l().add(XYEntity.e(VDTT_fe.h(), VDTT_fe.i()));
                           VDTT_fe.l().add(XYEntity.e(VDTT_fe.j(), VDTT_fe.k()));
                           VDTT_fe.a(false);
                        } else {
                           VDTT_cw.v();
                           XYEntity[] var18 = VDTT_fn.a(VDTT_fe.h(), VDTT_fe.i() - 2, VDTT_fe.h(), VDTT_fe.i() + 2);
                           Hashtable var19 = (Hashtable)VDTT_cw.v().dO.clone();
                           XYEntity var23;
                           if (var18 != null) {
                              var23 = var18[0].u();
                              var1 = var18[1].u();
                              VDTT_fe.d(var23.objY);
                              VDTT_cw.v().a(XYEntity.e(VDTT_fe.h(), VDTT_fe.i()), var23, false, var19);
                              VDTT_cw.v().a(XYEntity.e(VDTT_fe.h(), VDTT_fe.i()), var1, false, var19);
                           }

                           VDTT_cw.v();
                           if ((var18 = VDTT_fn.a(VDTT_fe.j(), VDTT_fe.k() - 2, VDTT_fe.j(), VDTT_fe.k() + 2)) != null) {
                              var23 = var18[0].u();
                              var1 = var18[1].u();
                              VDTT_fe.c(var23.objY);
                              VDTT_cw.v().a(var23, XYEntity.e(VDTT_fe.j(), VDTT_fe.k()), false, var19);
                              VDTT_cw.v().a(var1, XYEntity.e(VDTT_fe.j(), VDTT_fe.k()), false, var19);
                           }

                           String var25 = VDTT_fe.h() + "_" + VDTT_fe.i();
                           String var20 = VDTT_fe.j() + "_" + VDTT_fe.k();
                           VDTT_fe.a(0);
                           VDTT_gp var4 = new VDTT_gp((VDTT_cw.v().aj + VDTT_cw.v().ak) * 3, "", new Vector());

                           for(int var5 = 0; var5 < 100; ++var5) {
                              VDTT_fe.a(var4, var25, var20, 6, Integer.MAX_VALUE, var19);
                              if (var5 > 50 && var4.a.size() > 0) {
                                 break;
                              }
                           }

                           VDTT_fe.a(var4, var25, var20, 0, Integer.MAX_VALUE, var19);
                           VDTT_fe.a(var4, var25, var20, 1, Integer.MAX_VALUE, var19);
                           VDTT_fe.a(var4, var25, var20, 2, Integer.MAX_VALUE, var19);
                           VDTT_fe.a(var4, var25, var20, 3, Integer.MAX_VALUE, var19);
                           VDTT_fe.a(var4, var25, var20, 4, Integer.MAX_VALUE, var19);
                           VDTT_fe.a(var4, var25, var20, 5, Integer.MAX_VALUE, var19);
                           if (var4.a.size() > 0) {
                              Vector var28;
                              (var28 = new Vector()).add(XYEntity.e(VDTT_fe.h(), VDTT_fe.i()));

                              int var22;
                              for(var22 = 0; var22 < var4.a.size(); ++var22) {
                                 var28.add(XYEntity.c((String)var4.a.get(var22)));
                              }

                              XYEntity var21;
                              for(var22 = 1; var22 < var28.size() - 1; ++var22) {
                                 var21 = (XYEntity)var28.get(var22 - 1);
                                 var23 = (XYEntity)var28.get(var22);
                                 VDTT_cw.v();
                                 var2 = VDTT_fn.a(var21.objX, var21.objY - 2, var21.objX, var21.objY + 2);
                                 VDTT_cw.v();
                                 XYEntity[] var26 = VDTT_fn.a(var23.objX, var23.objY - 2, var23.objX, var23.objY + 2);
                                 if (VDTT_jb.a(var2, var26)) {
                                    boolean var6 = false;

                                    for(int var7 = var28.size() - 1; var7 > var22; --var7) {
                                       var23 = (XYEntity)var28.get(var7);
                                       VDTT_cw.v();
                                       var26 = VDTT_fn.a(var23.objX, var23.objY - 2, var23.objX, var23.objY + 2);
                                       if (var6) {
                                          var28.remove(var23);
                                          var22 = 0;
                                       } else if (VDTT_jb.a(var2, var26)) {
                                          var6 = true;
                                       }
                                    }
                                 }
                              }

                              for(var22 = 0; var22 < var28.size() - 1; ++var22) {
                                 var21 = (XYEntity)var28.get(var22);
                                 VDTT_cw.v();
                                 var3 = VDTT_fn.a(var21.objX, var21.objY - 2, var21.objX, var21.objY + 2);
                                 boolean var24 = false;

                                 for(int var27 = var28.size() - 1; var27 > var22; --var27) {
                                    XYEntity var29 = (XYEntity)var28.get(var27);
                                    VDTT_cw.v();
                                    XYEntity[] var30 = VDTT_fn.a(var29.objX, var29.objY - 2, var29.objX, var29.objY + 2);
                                    if (var24) {
                                       var28.remove(var29);
                                       var22 = 0;
                                    } else if (VDTT_jb.a(var3, var30)) {
                                       var24 = true;
                                    }
                                 }
                              }

                              VDTT_fe.l().addAll(var28);
                           }
                        }
                     } catch (Exception var15) {
                     } finally {
                        VDTT_fe.a(false);
                     }
                  }
               }
            } catch (Exception var17) {
            }
         }
      }
   }
}
