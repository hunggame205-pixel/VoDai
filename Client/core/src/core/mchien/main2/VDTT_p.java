package core.mchien.main2;

import java.util.Vector;

public abstract class VDTT_p extends MainScreen {
   public static Vector a = new Vector();
   public Vector b = new Vector();
   public MainScreen c;
   private long d;

   public VDTT_p() {
      this.e = 0;
      this.f(0, 0);
      this.d(DataCenter.d().n, DataCenter.d().o);
      this.a((MainScreen)this);
   }

   public final MainScreen d() {
      return this.c;
   }

   public final void a(MainScreen var1) {
      if (!(this.c instanceof VDTT_ky)) {
         if (this instanceof VDTT_cw) {
            ((VDTT_cw)this).I();
         }

         if (var1 instanceof MenuConfig) {
            ((MenuConfig)var1).a(var1.q);
         }

         int var2;
         for(var2 = 0; var2 < this.f.size(); ++var2) {
            if (this.f.get(var2) instanceof VDTT_ba) {
               VDTT_ba var3;
               (var3 = (VDTT_ba)this.f.get(var2)).N = false;
               if (var3.p != null) {
                  var3.p.b = -1;
               }

               if (this.f.get(var2) instanceof VDTT_bb) {
                  ((VDTT_bb)this.f.get(var2)).r();
               }
            }
         }

         if (!this.b.contains(var1)) {
            if (this.c != null && this.c.e == 5) {
               ((VDTT_am)this.c).d();
               this.a(5);
            }

            if (var1.e != 0) {
               this.a(var1.e);
            }

            this.b.addElement(var1);
            this.f();

            for(var2 = 0; var2 < this.b.size(); ++var2) {
               MainScreen var5;
               for(int var4 = (var5 = (MainScreen)this.b.get(var2)).f.size() - 1; var4 >= 0; --var4) {
                  if (var5.f.get(var4) instanceof VDTT_an) {
                     var5.f.remove(var4);
                  }
               }
            }

         }
      }
   }

   private void b(MainScreen var1) {
      var1.n = 0;
      this.b.removeElement(var1);
      this.f();
   }

   public final void a(VDTT_v var1) {
      VDTT_bh var2;
      (var2 = new VDTT_bh(Caption.ax, this, 0)).N = var1;
      var2.f.removeElementAt(var2.f.size() - 1);
      var2.b(Caption.i, 10004);
      var2.c(Caption.ay, 10005);
      VDTT_ca var10000 = var2.a(74, 75, 50, "", 0);
      byte var3 = 4;
      var10000.l = var3;
      this.a((MainScreen)var2);
   }

   public final void a(String var1, int var2, VDTT_z var3) {
      VDTT_bh var4;
      (var4 = new VDTT_bh(var1, this, 0)).O = var3;
      var4.f.removeElementAt(var4.f.size() - 1);
      var4.b(Caption.bi, var2);
      var4.c(Caption.D, 10003);
      this.a((MainScreen)var4);
   }

   public final void a(String var1, int var2, int var3, VDTT_z var4) {
      VDTT_bh var5;
      (var5 = new VDTT_bh(var1, this, 0)).O = var4;
      var5.f.clear();
      var5.b(Caption.bi, var2);
      var5.c(Caption.D, var3);
      this.a((MainScreen)var5);
   }

   public final void a(String var1, String var2, int var3, int var4, VDTT_z var5) {
      VDTT_bh var6;
      (var6 = new VDTT_bh(var1, this, 0)).P = var2;
      var6.O = var5;
      var6.f.removeElementAt(var6.f.size() - 1);
      var6.b(Caption.bi, var3);
      var6.c(Caption.D, var4);
      this.a((MainScreen)var6);
   }

   public final VDTT_bh b(String var1) {
      VDTT_bh var2 = new VDTT_bh(var1, this, 0);
      this.a((MainScreen)var2);
      return var2;
   }

   public final void a(String var1, int var2) {
      VDTT_bh var3;
      (var3 = new VDTT_bh(var1, this, 3)).c = var2;
      var3.f.clear();
      var3.a(Caption.sl, 10010);
      this.a((MainScreen)var3);
   }

   public final void e() {
      this.a(5);
      this.a(4);
      this.a(3);
      this.a(2);
      this.a(1);
   }

   public final void a(int var1) {
      while(true) {
         try {
            for(int var3 = this.b.size() - 1; var3 >= 0; --var3) {
               MainScreen var2;
               if ((var2 = (MainScreen)this.b.elementAt(var3)).e == var1) {
                  var2.n = 0;
                  this.b.removeElementAt(var3);
               }
            }

            this.f();
            return;
         } catch (Exception var4) {
//            this = this;
         }
      }
   }

   public final void f() {
      a((Vector)this.b);
      this.c = (MainScreen)this.b.lastElement();
   }

   public void a(int var1, int var2) {
      MainScreen var10000 = this.c;
      int var3 = var2;
      var2 = var1;
      MainScreen var11 = var10000;
      if (var10000.p != null) {
         var11.p.e = XYEntity.e(var1, var3);
      }

      VDTT_m var4 = null;
      boolean var8 = false;

      label348: {
         label349: {
            label350: {
               try {
                  var8 = true;

                  int var5;
                  for(var5 = var11.f.size() - 1; var5 >= 0; --var5) {
                     (var4 = (VDTT_m)var11.f.elementAt(var5)).b = false;
                  }

                  var5 = var11.f.size() - 1;

                  while(true) {
                     if (var5 < 0) {
                        if (var11.p == null) {
                           var8 = false;
                           break label349;
                        }

                        if (var11.p.a(var2 - var11.objX, var3 - var11.objY) < 0) {
                           var8 = false;
                           break label349;
                        }

                        var8 = false;
                        break label350;
                     }

                     if ((var4 = (VDTT_m)var11.f.elementAt(var5)).p != null && var4.p.a(var2 - var4.objX, var3 - var4.objY) >= 0) {
                        var11.c(var4);
                        var8 = false;
                        break;
                     }

                     --var5;
                  }
               } catch (Exception var9) {
                  var8 = false;
                  break label348;
               } finally {
                  if (var8) {
                     if (var11.k != null && (var4 == null || !var11.k.equals(var4))) {
                        var11.b((VDTT_m)var11.k);
                     }

                     if (var11.h != null && (var4 == null || !var11.h.equals(var4))) {
                        var11.p();
                     }

                     if (var11.j != null) {
                        var11.j.d();
                     }

                     var11.h = null;
                     var11.i = null;
                     var11.g = null;
                     var11.j = null;
                  }
               }

               if (var11.k != null && (var4 == null || !var11.k.equals(var4))) {
                  var11.b((VDTT_m)var11.k);
               }

               if (var11.h != null && (var4 == null || !var11.h.equals(var4))) {
                  var11.p();
               }

               if (var11.j != null) {
                  var11.j.d();
               }

               var11.h = null;
               var11.i = null;
               var11.g = null;
               var11.j = null;
               return;
            }

            if (var11.k != null && (var4 == null || !var11.k.equals(var4))) {
               var11.b((VDTT_m)var11.k);
            }

            if (var11.h != null && (var4 == null || !var11.h.equals(var4))) {
               var11.p();
            }

            if (var11.j != null) {
               var11.j.d();
            }

            var11.h = null;
            var11.i = null;
            var11.g = null;
            var11.j = null;
            return;
         }

         var4 = null;
         if (var11.k != null) {
            var11.b((VDTT_m)var11.k);
         }

         if (var11.h != null) {
            var11.p();
         }

         if (var11.j != null) {
            var11.j.d();
         }

         var11.h = null;
         var11.i = null;
         var11.g = null;
         var11.j = null;
         return;
      }

      if (var11.k != null && (var4 == null || !var11.k.equals(var4))) {
         var11.b((VDTT_m)var11.k);
      }

      if (var11.h != null && (var4 == null || !var11.h.equals(var4))) {
         var11.p();
      }

      if (var11.j != null) {
         var11.j.d();
      }

      var11.h = null;
      var11.i = null;
      var11.g = null;
      var11.j = null;
   }

   public void b(int var1, int var2) {
      int var3 = var2;
      var2 = var1;
      MainScreen var10 = this.c;

      try {
         if (var10.p != null) {
            var10.p.f = XYEntity.e(var2, var3);
         }

         boolean var5 = false;
         var10.o.e = var5;

         VDTT_hl var12;
         for(int var11 = var10.f.size() - 1; var11 >= 0; --var11) {
            VDTT_m var4;
            if ((var4 = (VDTT_m)var10.f.elementAt(var11)).p != null && var4.p.b >= 0) {
               var12 = var4.p.b(var2 - var4.objX, var3 - var4.objY);
               if (!(var4 instanceof VDTT_ce)) {
                  if (var12 != null && (var12.j == null || !var12.j.c())) {
                     var4.a(var12, var2 - var4.a(), var3 - var4.b());
                  }

                  if (var4 instanceof VDTT_bf && ((VDTT_bf)var4).O) {
                     var10.h = var4;
                  } else if (var4 instanceof VDTT_ca) {
                     var10.i = var4;
                  }

                  var4.r();
                  return;
               }

               var10.a(var12, var2 - var10.objX, var3 - var10.objY);
               return;
            }
         }

         if (var10.p != null && var10.p.b >= 0) {
            if ((var12 = var10.p.b(var2 - var10.objX, var3 - var10.objY)) != null && (var12.j == null || !var12.j.c())) {
               var10.a(var12, var2 - var10.objX, var3 - var10.objY);
            }

         } else {
            var10.r();
         }
      } catch (Exception var8) {
         VDTT_jb.a(var8);
      } finally {
         if (var10.j != null) {
            var10.j.d();
         }

         var10.g = null;
         var10.j = null;
      }
   }

   public void c(int var1, int var2) {
      int var3 = var2;
      var2 = var1;
      MainScreen var7 = this.c;

      try {
         if (var7.g != null) {
            var7.g.p.a(var7.j, var2 - var7.g.objX, var3 - var7.g.objY);
         } else {
            VDTT_hl var8;
            for(int var5 = var7.f.size() - 1; var5 >= 0; --var5) {
               VDTT_z var4;
               if ((var4 = (VDTT_z)var7.f.elementAt(var5)).p != null && var4.p.b >= 0) {
                  if ((var8 = var4.p.c(var2 - var4.objX, var3 - var4.objY)) != null && var8.j != null) {
                     var7.g = var4;
                     var7.j = var8.j;
                  }

                  return;
               }
            }

            if (var7.p != null && var7.p.b >= 0) {
               if ((var8 = var7.p.c(var2 - var7.objX, var3 - var7.objY)) != null && var8.j != null) {
                  var7.g = var7;
                  var7.j = var8.j;
               }

            }
         }
      } catch (Exception var6) {
         VDTT_jb.a(var6);
      }
   }

   public final void a(int var1, Object var2, VDTT_z var3) {
      try {
         switch(var1) {
         case -11:
            this.q();
            break;
         case -10:
         case -9:
         default:
            this.perform(var1, var2, var3);
            return;
         case -8:
            VDTT_hp var5 = (VDTT_hp)var2;
            this.a((MainScreen)(new VDTT_bq(var5, this, (byte)0, true)));
            break;
         case -7:
            this.b((MainScreen)var2);
            break;
         case -6:
            this.a(1);
            break;
         case -5:
            this.a(2);
            break;
         case -4:
            this.a(3);
            break;
         case -3:
            this.a(4);
            break;
         case -2:
            this.a(5);
            break;
         case -1:
            this.e();
         }
      } catch (Exception var4) {
      }

   }

   public final void a(int var1, Object var2) {
      this.b(var1, var2);
   }

   public Vector g() {
      return null;
   }

   public final void b(String var1, int var2) {
      this.h();
      VDTT_gr var10000 = VDTT_gr.a();
      int var4 = var2;
      VDTT_dg var3 = VDTT_dg.e;
      String var13 = var1;
      VDTT_gr var12 = var10000;
      if (var10000.a.size() <= 0) {
         if (var3 == null) {
            var3 = VDTT_dg.d;
         }

         int var6 = 0;

         while(true) {
            if (var6 >= var12.a.size()) {
               if (var12.a.size() > 15) {
                  var12.a.removeElementAt(0);
               }

               var12.a.addElement(new VDTT_gs(var12, var13, var3, var4));
               break;
            }

            VDTT_gs var5;
            String var9;
            if ((var5 = (VDTT_gs)var12.a.elementAt(var6)).b.equals(var3) && var5.d == var4 && var5.a != null && var5.a.length() < 80 && var5.a.startsWith(Caption.q) && var13.startsWith(Caption.q)) {
               int var14 = Caption.q.length() + 1;
               int var15 = 0;
               int var16 = 0;
               var9 = var5.a + " ";
               var13 = var13 + " ";

               for(var4 = var14; var4 < var9.length(); ++var4) {
                  try {
                     var15 = Integer.parseInt(VDTT_gr.a(var9.substring(var14, var4), ".", "").trim());
                  } catch (Exception var11) {
                  }

                  if (var9.charAt(var4) == ' ') {
                     break;
                  }
               }

               if (var15 <= 0) {
                  var15 = 1;
               }

               var9 = var9.substring(var4).trim();

               for(var4 = var14; var4 < var13.length(); ++var4) {
                  try {
                     var16 = Integer.parseInt(VDTT_gr.a(var13.substring(var14, var4), ".", "").trim());
                  } catch (Exception var10) {
                  }

                  if (var13.charAt(var4) == ' ') {
                     break;
                  }
               }

               if (var16 <= 0) {
                  var16 = 1;
               }

               if ((var13 = var13.substring(var4).trim()).equals(var9)) {
                  var5.a = Caption.q + " " + VDTT_jb.c(var15 + var16) + " " + var13;
               } else {
                  var5.a = var5.a + ", " + VDTT_jb.c(var16) + " " + var13;
               }

               if (var6 == 0) {
                  var12.c();
               }

               return;
            }

            if (var5.b.equals(var3) && var5.d == var4 && var5.a != null && var5.a.length() < 80) {
               if (var5.a.equals(var13) || var5.a.indexOf(var13) >= 0) {
                  if (var6 == 0) {
                     var12.c();
                  }

                  return;
               }

               if (var5.a.length() >= 8) {
                  String var7 = var13.substring(0, 8);
                  String var8 = var5.a.substring(0, 8);
                  if (var7.equals(var8)) {
                     for(var4 = 7; var4 < var13.length() && var4 < var5.a.length() && var13.charAt(var4) == var5.a.charAt(var4); ++var4) {
                     }

                     var9 = var13.substring(var4, var13.length());
                     var5.a = var5.a + ", " + var9;
                     if (var6 == 0) {
                        var12.c();
                     }

                     return;
                  }
               }
            }

            ++var6;
         }
      }

   }

   public final void c(String var1, int var2) {
      long var3 = System.currentTimeMillis();
      if (!var1.contains(Caption.wD) || var3 - this.d >= 300000L || !VDTT_eq.a().a(10)) {
         if (!var1.contains(Caption.mB.substring(0, Caption.mB.length() - 5)) || !VDTT_gt.b().a(var1)) {
            if (!var1.contains(Caption.bf) || !VDTT_gt.b().a(var1)) {
               this.d = var3;
               this.h();
               VDTT_gt.b().a(var1, VDTT_dg.d, var2);
            }
         }
      }
   }

   public static void d(String var0, int var1) {
      if (!VDTT_eq.a().a(16)) {
         VDTT_gv var10000 = VDTT_gv.a();
         int var3 = -7812062;
         VDTT_dg var2 = VDTT_dg.d;
         String var12 = var0;
         VDTT_gv var11 = var10000;
         if (var10000.a.size() == 0) {
            var11.c = 10;
         }

         if (var2 == null) {
            var2 = VDTT_dg.d;
         }

         for(int var5 = 0; var5 < var11.a.size(); ++var5) {
            VDTT_iw var4;
            String var8;
            if ((var4 = (VDTT_iw)var11.a.elementAt(var5)).b.equals(var2) && var4.d == var3 && var4.a != null && var4.a.length() < 80 && var4.a.startsWith(Caption.q) && var12.startsWith(Caption.q)) {
               int var13 = Caption.q.length() + 1;
               int var14 = 0;
               int var15 = 0;
               var8 = var4.a + " ";
               var12 = var12 + " ";

               for(var3 = var13; var3 < var8.length(); ++var3) {
                  try {
                     var14 = Integer.parseInt(VDTT_gv.a(var8.substring(var13, var3), ".", "").trim());
                  } catch (Exception var10) {
                  }

                  if (var8.charAt(var3) == ' ') {
                     break;
                  }
               }

               if (var14 <= 0) {
                  var14 = 1;
               }

               var8 = var8.substring(var3).trim();

               for(var3 = var13; var3 < var12.length(); ++var3) {
                  try {
                     var15 = Integer.parseInt(VDTT_gv.a(var12.substring(var13, var3), ".", "").trim());
                  } catch (Exception var9) {
                  }

                  if (var12.charAt(var3) == ' ') {
                     break;
                  }
               }

               if (var15 <= 0) {
                  var15 = 1;
               }

               if ((var12 = var12.substring(var3).trim()).equals(var8)) {
                  var4.a = Caption.q + " " + VDTT_jb.c(var14 + var15) + " " + var12;
               } else {
                  var4.a = var4.a + ", " + VDTT_jb.c(var15) + " " + var12;
               }

               if (var5 == 0) {
                  var11.c();
               }

               return;
            }

            if (var4.b.equals(var2) && var4.d == var3 && var4.a != null && var4.a.length() < 80) {
               if (var4.a.equals(var12) || var4.a.indexOf(var12) >= 0) {
                  if (var5 == 0) {
                     var11.c();
                  }

                  return;
               }

               if (var4.a.length() >= 8) {
                  String var6 = var12.substring(0, 8);
                  String var7 = var4.a.substring(0, 8);
                  if (var6.equals(var7)) {
                     for(var3 = 7; var3 < var12.length() && var3 < var4.a.length() && var12.charAt(var3) == var4.a.charAt(var3); ++var3) {
                     }

                     var8 = var12.substring(var3, var12.length());
                     var4.a = var4.a + ", " + var8;
                     if (var5 == 0) {
                        var11.c();
                     }

                     return;
                  }
               }
            }
         }

         if (var11.a.size() > 15) {
            var11.a.removeElementAt(0);
         }

         var11.a.addElement(new VDTT_iw(var12, var2, var3));
      }
   }

   public final void e(String var1, int var2) {
      this.h();
      VDTT_gw var10000 = VDTT_gw.a();
      short var4 = -2560;
      VDTT_dg var3 = VDTT_dg.d;
      String var13 = var1;
      VDTT_gw var12 = var10000;
      if (var3 == null) {
         var3 = VDTT_dg.d;
      }

      for(int var6 = 0; var6 < var12.a.size(); ++var6) {
         VDTT_iw var5;
         String var9;
         int var15;
         if ((var5 = (VDTT_iw)var12.a.elementAt(var6)).b.equals(var3) && var5.d == var4 && var5.a != null && var5.a.length() < 80 && var5.a.startsWith(Caption.q) && var13.startsWith(Caption.q)) {
            int var14 = Caption.q.length() + 1;
            int var16 = 0;
            int var17 = 0;
            var9 = var5.a + " ";
            var13 = var13 + " ";

            for(var15 = var14; var15 < var9.length(); ++var15) {
               try {
                  var16 = Integer.parseInt(VDTT_gw.a(var9.substring(var14, var15), ".", "").trim());
               } catch (Exception var11) {
               }

               if (var9.charAt(var15) == ' ') {
                  break;
               }
            }

            if (var16 <= 0) {
               var16 = 1;
            }

            var9 = var9.substring(var15).trim();

            for(var15 = var14; var15 < var13.length(); ++var15) {
               try {
                  var17 = Integer.parseInt(VDTT_gw.a(var13.substring(var14, var15), ".", "").trim());
               } catch (Exception var10) {
               }

               if (var13.charAt(var15) == ' ') {
                  break;
               }
            }

            if (var17 <= 0) {
               var17 = 1;
            }

            if ((var13 = var13.substring(var15).trim()).equals(var9)) {
               var5.a = Caption.q + " " + VDTT_jb.c(var16 + var17) + " " + var13;
            } else {
               var5.a = var5.a + ", " + VDTT_jb.c(var17) + " " + var13;
            }

            if (var6 == 0) {
               var12.c();
            }

            return;
         }

         if (var5.b.equals(var3) && var5.d == var4 && var5.a != null && var5.a.length() < 80) {
            if (var5.a.equals(var13) || var5.a.indexOf(var13) >= 0) {
               if (var6 == 0) {
                  var12.c();
               }

               return;
            }

            if (var5.a.length() >= 8) {
               String var7 = var13.substring(0, 8);
               String var8 = var5.a.substring(0, 8);
               if (var7.equals(var8)) {
                  for(var15 = 7; var15 < var13.length() && var15 < var5.a.length() && var13.charAt(var15) == var5.a.charAt(var15); ++var15) {
                  }

                  var9 = var13.substring(var15, var13.length());
                  var5.a = var5.a + ", " + var9;
                  if (var6 == 0) {
                     var12.c();
                  }

                  return;
               }
            }
         }
      }

      if (var12.a.size() > 15) {
         var12.a.removeElementAt(0);
      }

      var12.a.addElement(new VDTT_iw(var13, var3, var4));
   }

   public final void h() {
      MainScreen var1;
      if ((var1 = this.c) instanceof VDTT_no) {
         this.b(var1);
      }

   }

   public final void i() {
      this.a((MainScreen)(new VDTT_no(this)));
   }

   public abstract void j();

   public abstract void k();

   public static void a(String var0, byte[] var1, byte var2) {
      VDTT_cw.v().dJ = true;
      VDTT_d.g();
      VDTT_d.a(var0);
   }
}
