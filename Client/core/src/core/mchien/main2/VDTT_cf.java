package core.mchien.main2;

import java.util.Collections;
import java.util.Vector;

public class VDTT_cf extends VDTT_p {
   private final String J;
   private VDTT_dx[] K;
   private static Vector L = new Vector();
   public static Vector d = new Vector();
   private static int M;
   private static int N;
   private static int O;
   private static int P;
   private static int Q;
   private static int R;
   private static VDTT_n S;
   private static boolean T;
   protected int I = 800;
   private boolean U = false;
   private static boolean V;

   public VDTT_cf() {
      VDTT_d.f();
      VDTT_dc.c(459);
      this.K = new VDTT_dx[100];

      for(int var2 = 0; var2 < this.K.length; ++var2) {
         int var1 = var2 % 3 == 0 ? 443 : (var2 % 3 == 1 ? 444 : 445);
         this.K[var2] = new VDTT_dx(var1, VDTT_jb.a(1, 3), 0, 9, var2, this.K.length, DataCenter.d().n, DataCenter.d().o + DataCenter.d().o % DataCenter.d().r, false);
      }

      this.J = VDTT_jb.e(DataCenter.d().v);
      if (d.size() <= 0) {
         VDTT_de var17 = null;

         try {
            if ((var17 = VDTT_da.a("arr_map_30")) == null) {
               return;
            }

            VDTT_de var18 = var17;
            VDTT_ja[] var3 = new VDTT_ja[var17.a.readUnsignedShort()];
            Vector var6 = new Vector();

            short var4;
            short var5;
            VDTT_fz var7;
            int var9;
            int var10;
            int var11;
            VDTT_fz[] var23;
            for(short var8 = 0; var8 < var3.length; ++var8) {
               var6.removeAllElements();
               var3[var8] = new VDTT_ja();
               var3[var8].a = var18.a.readShort();
               var3[var8].b = var18.a.readShort();
               var3[var8].c = var18.a.readByte();
               var3[var8].d = var18.a.readShort();
               var3[var8].e = var18.a.readShort();
               var4 = var18.a();

               for(var9 = 0; var9 < var4; ++var9) {
                  var5 = var18.a();

                  for(var10 = 0; var10 < var5; ++var10) {
                     (var7 = new VDTT_fz()).d = new XYEntity[var18.a.readByte() / 2];

                     for(var11 = 0; var11 < var7.d.length; ++var11) {
                        var7.d[var11] = new XYEntity();
                        var7.d[var11].f(var18.a.readShort(), var18.a.readShort());
                        if (var11 == 0) {
                           var7.e = var7.g = var7.d[var11].objX;
                           var7.f = var7.h = var7.d[var11].objY;
                        } else {
                           if (var7.d[var11].objX < var7.e) {
                              var7.e = var7.d[var11].objX;
                           }

                           if (var7.d[var11].objX > var7.g) {
                              var7.g = var7.d[var11].objX;
                           }

                           if (var7.d[var11].objY < var7.f) {
                              var7.f = var7.d[var11].objY;
                           }

                           if (var7.d[var11].objY > var7.h) {
                              var7.h = var7.d[var11].objY;
                           }
                        }
                     }

                     var6.addElement(var7);
                  }
               }

               if (var6.size() > 0) {
                  var23 = new VDTT_fz[var6.size()];

                  for(var9 = 0; var9 < var6.size(); ++var9) {
                     var23[var9] = (VDTT_fz)var6.elementAt(var9);
                  }

                  var3[var8].f = new VDTT_fn(var23);
               }
            }

            VDTT_cw.v().S = var3;
            VDTT_fo[] var32 = new VDTT_fo[var18.a.readUnsignedShort()];

            int var21;
            for(var9 = 0; var9 < var32.length; ++var9) {
               var6.removeAllElements();
               var32[var9] = new VDTT_fo();
               var32[var9].a = var18.a.readShort();
               var32[var9].b = var18.a.readShort();
               var32[var9].c = new VDTT_iz[var18.a()];

               for(var10 = 0; var10 < var32[var9].c.length; ++var10) {
                  var32[var9].c[var10] = new VDTT_iz(var18.a.readShort());
                  var32[var9].c[var10].objX = var32[var9].c[var10].m = var18.a.readShort();
                  var32[var9].c[var10].objY = var32[var9].c[var10].n = var18.a.readShort();
                  var32[var9].c[var10].k = var18.a.readByte();
                  if (var32[var9].c[var10].m().f != null) {
                     for(var11 = 0; var11 < var32[var9].c[var10].m().f.a.size(); ++var11) {
                        var7 = ((VDTT_fz)var32[var9].c[var10].m().f.a.get(var11)).a();
                        if (var32[var9].c[var10].k == 7) {
                           var7.d = VDTT_jb.a(var7.d);
                        }

                        for(var21 = 0; var21 < var7.d.length; ++var21) {
                           XYEntity var10000 = var7.d[var21];
                           var10000.objX += var32[var9].c[var10].objX;
                           var10000 = var7.d[var21];
                           var10000.objY += var32[var9].c[var10].objY;
                           if (var21 == 0) {
                              var7.e = var7.g = var7.d[var21].objX;
                              var7.f = var7.h = var7.d[var21].objY;
                           } else {
                              if (var7.d[var21].objX < var7.e) {
                                 var7.e = var7.d[var21].objX;
                              }

                              if (var7.d[var21].objX > var7.g) {
                                 var7.g = var7.d[var21].objX;
                              }

                              if (var7.d[var21].objY < var7.f) {
                                 var7.f = var7.d[var21].objY;
                              }

                              if (var7.d[var21].objY > var7.h) {
                                 var7.h = var7.d[var21].objY;
                              }
                           }
                        }

                        var6.addElement(var7);
                     }
                  }
               }

               var4 = var18.a();

               for(var10 = 0; var10 < var4; ++var10) {
                  var5 = var18.a();

                  for(var11 = 0; var11 < var5; ++var11) {
                     (var7 = new VDTT_fz()).d = new XYEntity[var18.a.readByte() / 2];

                     for(var21 = 0; var21 < var7.d.length; ++var21) {
                        var7.d[var21] = new XYEntity();
                        var7.d[var21].f(var18.a.readShort(), var18.a.readShort());
                        if (var21 == 0) {
                           var7.e = var7.g = var7.d[var21].objX;
                           var7.f = var7.h = var7.d[var21].objY;
                        } else {
                           if (var7.d[var21].objX < var7.e) {
                              var7.e = var7.d[var21].objX;
                           }

                           if (var7.d[var21].objX > var7.g) {
                              var7.g = var7.d[var21].objX;
                           }

                           if (var7.d[var21].objY < var7.f) {
                              var7.f = var7.d[var21].objY;
                           }

                           if (var7.d[var21].objY > var7.h) {
                              var7.h = var7.d[var21].objY;
                           }
                        }
                     }

                     var6.addElement(var7);
                  }
               }

               if (var6.size() > 0) {
                  var23 = new VDTT_fz[var6.size()];

                  for(var10 = 0; var10 < var6.size(); ++var10) {
                     var23[var10] = (VDTT_fz)var6.elementAt(var10);
                  }

                  var32[var9].d = new VDTT_fn(var23);
               }
            }

            new Vector();
            M = var17.a.readShort();
            N = var17.a.readShort();
            VDTT_fz[] var19;
            (var19 = new VDTT_fz[var17.a() + 6])[var19.length - 1] = b(-50, -50, 120, 65);
            var19[var19.length - 2] = b(M - 100, -50, M + 50, 100);
            var19[var19.length - 3] = b(-50, -50, M + 50, 15);
            var19[var19.length - 4] = b(-50, -50, 15, N + 50);
            var19[var19.length - 5] = b(-50, N - 15, M + 50, N + 50);
            var19[var19.length - 6] = b(M - 15, -50, M + 50, N + 50);

            for(var21 = 0; var21 < var19.length - 6; ++var21) {
               var19[var21] = new VDTT_fz();
               var19[var21].d = new XYEntity[var17.a()];

               for(int var25 = 0; var25 < var19[var21].d.length; ++var25) {
                  var19[var21].d[var25] = new XYEntity();
                  var19[var21].d[var25].f(var17.a.readShort(), var17.a.readShort());
                  if (var25 == 0) {
                     var19[var21].e = var19[var21].g = var19[var21].d[var25].objX;
                     var19[var21].f = var19[var21].h = var19[var21].d[var25].objY;
                  } else {
                     if (var19[var21].d[var25].objX < var19[var21].e) {
                        var19[var21].e = var19[var21].d[var25].objX;
                     }

                     if (var19[var21].d[var25].objX > var19[var21].g) {
                        var19[var21].g = var19[var21].d[var25].objX;
                     }

                     if (var19[var21].d[var25].objY < var19[var21].f) {
                        var19[var21].f = var19[var21].d[var25].objY;
                     }

                     if (var19[var21].d[var25].objY > var19[var21].h) {
                        var19[var21].h = var19[var21].d[var25].objY;
                     }
                  }
               }
            }

            new VDTT_fn(var19);
            VDTT_fy[] var27 = new VDTT_fy[var17.a.readShort()];
            Vector var20 = new Vector();
            Vector var24 = new Vector();
            int var26 = 0;

            while(true) {
               int var29;
               if (var26 >= var27.length) {
                  var5 = var17.a.readShort();

                  for(var29 = 0; var29 < var5; ++var29) {
                     var17.a.readShort();
                  }

                  d.clear();
                  var5 = var17.a.readShort();
                  Short var30 = null;
                  var21 = 0;
                  Vector var28 = new Vector();

                  for(int var31 = 0; var31 < var5; ++var31) {
                     if (var21 == 0) {
                        var30 = (short) var17.a.readShort();
                        var21 = var17.a.readShort();
                     }

                     VDTT_iz var22 = new VDTT_iz(var30);
                     var22.objX = var22.m = var17.a.readShort();
                     var22.objY = var22.n = var17.a.readShort();
                     var22.k = var17.a.readByte();
                     if (var22.m().e >= 0 && var22.m().d >= 6 && var22.m().d != 11) {
                        var28.add(var22);
                        if (var22.m().d != 9 && var22.m().d == 10) {
                        }
                     } else {
                        d.add(var22);
                     }

                     if (var21 > 0) {
                        --var21;
                     }
                  }

                  if (S == null) {
                     S = new VDTT_fb(DataCenter.d().n / 2, N);
                  }
                  break;
               }

               var27[var26] = new VDTT_fy();
               var27[var26].a = var17.a.readBoolean();
               if (var27[var26].a) {
                  var24.add(var27[var26]);
               } else {
                  var20.add(var27[var26]);
               }

               var27[var26].d = new XYEntity[var17.a.readShort()];

               for(var29 = 0; var29 < var27[var26].d.length; ++var29) {
                  var27[var26].d[var29] = new XYEntity();
                  var27[var26].d[var29].f(var17.a.readShort(), var17.a.readShort());
               }

               ++var26;
            }
         } catch (Exception var15) {
            return;
         } finally {
            if (var17 != null) {
               var17.d();
            }

         }

      }
   }

   public void a_() {
      if (this.U) {
         this.I -= 30;
      } else {
         this.I += 30;
      }

      if (this.I > 1500) {
         this.U = true;
         this.I = 1500;
      } else if (this.I < 800) {
         this.U = false;
         this.I = 800;
      }

      try {
         if (VDTT_d.o) {
            VDTT_d.o = false;
            Graphics.a();
         }

         if (S != null) {
            if (T) {
               ++S.objX;
               if (S.objX >= M - DataCenter.d().n / 2) {
                  T = false;
               }
            } else {
               --S.objX;
               if (S.objX <= DataCenter.d().n / 2) {
                  T = true;
               }
            }
         }

         L.clear();

         VDTT_iz var1;
         int var2;
         for(var2 = 0; var2 < d.size(); ++var2) {
            (var1 = (VDTT_iz)d.get(var2)).n();
            if (VDTT_jb.a(var1.a() - 50, var1.c() - 50, var1.b() + 50, var1.objY + 50, O, P, Q, R)) {
               L.addElement(var1);
            }
         }

         try {
            int var7 = S.objX - DataCenter.d().n / 2;
            var2 = S.objY - DataCenter.d().o / 2 - S.r / 2 - DataCenter.d().o / 8;
            int var3 = S.objX + DataCenter.d().n / 2;
            int var4 = S.objY + DataCenter.d().o / 2 - S.r / 2 - DataCenter.d().o / 8;
            if (var7 < 0) {
               var3 = DataCenter.d().n;
            }

            if (var2 < 0) {
               var2 = 0;
               var4 = DataCenter.d().o;
            }

            if (var3 > M) {
               DataCenter.d();
            }

            if (var4 > N) {
               var2 = (short)(N - DataCenter.d().o);
            }

            if (V) {
               if ((O -= 3) <= 0) {
                  O = 0;
                  V = false;
               }
            } else if ((O += 3) >= 2400) {
               V = true;
            }

            P = var2;
            Q = O + DataCenter.d().n;
            R = P + DataCenter.d().o;

            for(var2 = 0; var2 < d.size(); ++var2) {
               VDTT_iz var9 = (VDTT_iz)d.get(var2);
               var3 = O;
               var1 = var9;
               short var8 = var9.m;
               if (var1.m().c != 7 && (var1.m().c != 6 || var1.m().d != -1)) {
                  if (var1.m().c == 8) {
                     var8 = (short)(var1.m + var3 * 10 / 13);
                  } else if (var1.m().c == 9) {
                     var8 = (short)(var1.m + var3 * 20 / 22);
                  } else if (var1.m().c == 10) {
                     var8 = (short)(var1.m + var3 * 10 / 12);
                  }
               } else {
                  var8 = (short)(var1.m + var3 * 20 / 23);
               }

               if (var1.o != null) {
                  if (var1.m().d == 2) {
                     var8 = (short)(var1.m + var3 * 20 / 23);
                  } else if (var1.m().d == 3) {
                     var8 = (short)(var1.m + var3 * 10 / 13);
                  } else if (var1.m().d == 4) {
                     var8 = (short)(var1.m + var3 * 20 / 22);
                  } else if (var1.m().d == 5 || var1.o.k == 11) {
                     var8 = (short)(var1.m + var3 * 10 / 12);
                  }

                  var1.o.a(var8, var1.objY);
               }

               if (var1.p != null) {
                  if (var1.m().d == 2) {
                     var8 = (short)(var1.m + var3 * 20 / 23);
                     var1.p.b(var8, var1.objY);
                  } else if (var1.m().d == 3) {
                     var8 = (short)(var1.m + var3 * 10 / 13);
                     var1.p.b(var8, var1.objY);
                  } else if (var1.m().d == 4) {
                     var8 = (short)(var1.m + var3 * 20 / 22);
                     var1.p.b(var8, var1.objY);
                  } else if (var1.m().d == 5) {
                     var8 = (short)(var1.m + var3 * 10 / 12);
                     var1.p.b(var8, var1.objY);
                  }

                  var1.p.r();
                  var1.q = var1.p.q;
                  var1.r = var1.p.r;
                  var1.f(var1.p.objX, var1.p.objY);
               }

               var1.objX = var8;
            }
         } catch (Exception var5) {
         }

         Collections.sort(L, XYEntity.E);
      } catch (Exception var6) {
         VDTT_jb.a(var6);
      }
   }

   public void c() {
   }

   protected static void b(Graphics var0, int var1, int var2) {
      if (!DataCenter.l()) {
         int var3;
         VDTT_v var4;
         if (VDTT_d.e.size() < 20) {
            if ((var3 = DataCenter.d().h / 2 % 17) > 8) {
               var3 = 16 - var3;
            }

            var4 = (VDTT_v)VDTT_d.e.get(8 + var3);
         } else {
            if ((var3 = DataCenter.d().h / 2 % 28) > 14) {
               var3 = 28 - var3;
            }

            var4 = (VDTT_v)VDTT_d.e.get(8 + var3);
         }

         if (var4 != null) {
            var0.a(var4, 0, 0, var4.c, var4.d, 0, (float)(var1 + 6), (float)(var2 + 15), (float)(var4.c / 4 * DataCenter.d().r), (float)(var4.d / 4 * DataCenter.d().r), 33);
         }

      }
   }

   public void b(Graphics var1) {
      try {
         if (VDTT_d.g().f > 0) {
            --VDTT_d.g().f;
            if (VDTT_d.g().f == 0) {
               DataCenter.d().g();
               return;
            }
         }

         if (!DataCenter.l() && !(this instanceof VDTT_cm) && !(this instanceof VDTT_cq) && !(this instanceof VDTT_cu)) {
            this.a(var1, -O, -P);

            for(int var5 = 0; var5 < L.size(); ++var5) {
               ((VDTT_iz)L.get(var5)).a(var1);
            }

            this.a(var1, 0, 0);
            return;
         }

         VDTT_v var2 = (VDTT_v)VDTT_d.e.get(0);
         var1.a(var2, 0, 0, var2.c, var2.d, 0, 0.0F, 0.0F, (float)(DataCenter.d().n * DataCenter.d().r), (float)(DataCenter.d().o * DataCenter.d().r), 0);
      } catch (Exception var4) {
      }

   }

   public Vector g() {
      return new Vector();
   }

   public void b(int var1, Object var2) {
   }

   public void a(VDTT_hl var1, int var2, int var3) {
      if (var1.b == 2002) {
         VDTT_d.g();
         VDTT_d.i();
      }

   }

   public void perform(int var1, Object var2, VDTT_z var3) {
   }

   private static VDTT_fz b(int var0, int var1, int var2, int var3) {
      VDTT_fz var4;
      (var4 = new VDTT_fz()).d = new XYEntity[5];
      var4.d[0] = XYEntity.e(var0, var1);
      var4.d[1] = XYEntity.e(var2, var1);
      var4.d[2] = XYEntity.e(var2, var3);
      var4.d[3] = XYEntity.e(var0, var3);
      var4.d[4] = XYEntity.e(var0, var1);
      return var4;
   }

   public void j() {
   }

   public void k() {
      this.a(Caption.jB, 2002, this);
   }
}
