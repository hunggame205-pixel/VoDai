package core.mchien.main2;

import java.util.Vector;

public final class VDTT_mh extends VDTT_ar {
   private VDTT_gh a;
   private VDTT_hs[] b;
   private int c = 1005;
   private int d;
   private VDTT_ia[] N;

   public VDTT_mh(VDTT_hz var1, VDTT_p var2, int var3) {
      this.I = var2;
      this.a(300, 215);
      var1 = DataCenter.d().aC;
      this.N = new VDTT_ia[DataCenter.d().ag.length + 1];
      this.N[0] = new VDTT_ia();
      this.N[0].a = Caption.mS;
      Vector var11 = new Vector();

      int var5;
      String[] var12;
      try {
         var12 = VDTT_da.h("arr_server").split(":");
         Vector var4 = new Vector();

         for(var5 = 0; var5 < DataCenter.d().ag.length; ++var5) {
            for(int var6 = 0; var6 < DataCenter.d().ag[var5].b.length; ++var6) {
               VDTT_hz var7;
               if ((var7 = DataCenter.d().ag[var5].b[var6]).c.toLowerCase().equals(var12[0].toLowerCase()) && var7.d == Integer.parseInt(var12[1])) {
                  VDTT_hz var17;
                  (var17 = var7.a()).g = var7.g = Caption.AH[0];
                  a(var11, var17);
               } else {
                  for(int var8 = 0; var8 < Caption.AH.length; ++var8) {
                     if (var7.g.toUpperCase().equals(Caption.AH[var8])) {
                        var7 = var7.a();
                        var4.add(var7);
                        break;
                     }
                  }
               }
            }
         }

         if (DataCenter.d().ah != null) {
            var4.add(DataCenter.d().ah);
         }

         for(var5 = 0; var5 < var4.size(); ++var5) {
            a(var11, (VDTT_hz)var4.get(var5));
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }

      if (DataCenter.d().aC != null) {
         VDTT_hz var13 = DataCenter.d().aC.a();
         a(var11, var13);
      }

      DataCenter.d().aC = var1;
      this.N[0].b = new VDTT_hz[var11.size()];

      for(var3 = 0; var3 < var11.size(); ++var3) {
         this.N[0].b[var3] = (VDTT_hz)var11.get(var3);
      }

      for(var3 = 0; var3 < DataCenter.d().ag.length; ++var3) {
         VDTT_ia var14 = DataCenter.d().ag[DataCenter.d().ag.length - 1 - var3];
         this.N[var3 + 1] = new VDTT_ia();
         this.N[var3 + 1].a = var14.a;
         this.N[var3 + 1].b = new VDTT_hz[var14.b.length];

         for(var5 = 0; var5 < var14.b.length; ++var5) {
            this.N[var3 + 1].b[var5] = var14.b[var14.b.length - 1 - var5];
         }
      }

      var12 = new String[this.N.length];

      for(int var15 = 0; var15 < this.N.length; ++var15) {
         var12[var15] = this.N[var15].a;
      }

      VDTT_hp var16;
      (var16 = new VDTT_hp(1001)).c = var12;
      this.a = new VDTT_gh(var16, this.q, 1, this.f() - 3, 87, this.h() + 6, 33, this);
      this.b = new VDTT_hs[this.a.b.c.length];

      for(var5 = 0; var5 < this.N.length; ++var5) {
         VDTT_gh var10;
         this.b[var5] = new VDTT_hs((byte)1, (var10 = this.a).objX + var10.q + 8, this.f() + 10, this.q - 110, 162, 27, this.N[var5].b.length);
      }

      this.w();
   }

   private static void a(Vector var0, VDTT_hz var1) {
      for(int var2 = 0; var2 < var0.size(); ++var2) {
         if (((VDTT_hz)var0.get(var2)).c.equals(var1.c) && ((VDTT_hz)var0.get(var2)).d == var1.d) {
            return;
         }
      }

      var0.add(var1);
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.g, (byte)2, this.K);
      boolean var2 = true;
      Graphics var3 = var1;
      VDTT_gh var10 = this.a;
      int var4 = var1.e;
      int var5 = var1.f;
      var10.a(var1, var10.e.objX + var10.objX, var10.e.objY + var10.objY);
      if (!var10.c.a && var10.b.c.length * var10.a.h <= var10.r - 20) {
         var10.a.b(var1, var10.e.objX + var10.objX, var10.e.objY + var10.objY, var10.a.q + 6, var10.a.r);
      } else {
         var10.a.a(var1, var10.e.objX + var10.objX, var10.e.objY + var10.objY, var10.a.q + 6, var10.a.r);
      }

      for(int var6 = 0; var6 < var10.b.c.length; ++var6) {
         if (var10.a.b(var6) && !var10.h[var6]) {
            int var7 = var6 * var10.a.h + var10.a.h / 2;
            if (var6 == var10.b.b) {
               var3.c(-7812062);
               var10.a(var3, 2, var6 * var10.a.h + 2, var10.a.q - 4, var10.a.h - 4, 7, 3, 4, 1, 1);
               var3.f();
               var10.a(var3, 2, var6 * var10.a.h + 2, var10.a.q - 4, var10.a.h - 4, 0, 3, 4, 1, 1);
            } else {
               var10.a(var3, 2, var6 * var10.a.h + 2, var10.a.q - 4, var10.a.h - 4, 7, 3, 4, 1, 1);
            }

            int var8 = var10.f[var6].length >= 2 ? -5 : 0;

            for(int var9 = 0; var9 < var10.f[var6].length; ++var9) {
               if (var6 == var10.b.b) {
                  VDTT_dg.a((VDTT_dg)VDTT_dg.e, var3, var10.f[var6][var9], var10.a.q / 2, var7 + var8 + var9 * 10 - 1, 2, -2560, 0);
               } else if (var10.a.l == var6) {
                  VDTT_dg.a((VDTT_dg)VDTT_dg.e, var3, var10.f[var6][var9], var10.a.q / 2 + 1, var7 + var8 + var9 * 10 - 1 + 1, 2, -2560, 0);
               } else {
                  VDTT_dg.a((VDTT_dg)VDTT_dg.e, var3, var10.f[var6][var9], var10.a.q / 2, var7 + var8 + var9 * 10 - 1, 2, -1, 0);
               }
            }

            if (var10.g[var6]) {
               VDTT_dc.a(var3, 713, 0, var10.c.a(var6) - 8, var7 - 4, 0);
            }
         }
      }

      if (var10.c.a || var10.b.c.length * var10.a.h > var10.r - 20) {
         var10.a(var3, 0, 0);
         var3.d(0, 0, DataCenter.d().n, DataCenter.d().o);
      }

      var10.a(var3, var4, var5);
      this.a.a(var1, this.objX, this.objY);
      this.a(var1, this.b[this.a.b.b]);

      for(int var11 = 0; var11 < this.b[this.a.b.b].i; ++var11) {
         if (var11 == this.b[this.a.b.b].k) {
            var1.c(-48128);
         }

         this.a(var1, 0, var11 * this.b[this.a.b.b].h, this.b[this.a.b.b].q, this.b[this.a.b.b].h - 1, 46, 22, 23, 1, 1);
         if (var11 == this.b[this.a.b.b].k) {
            var1.f();
         }

         String var12 = this.N[this.a.b.b].b[var11].b();
         if (var11 == this.b[this.a.b.b].l) {
            VDTT_dg.a(VDTT_dg.d, var1, var12, 16, 1 + var11 * this.b[this.a.b.b].h + this.b[this.a.b.b].h / 2, 0, -1);
         } else {
            VDTT_dg.a(VDTT_dg.d, var1, var12, 15, var11 * this.b[this.a.b.b].h + this.b[this.a.b.b].h / 2, 0, -1);
         }

         for(int var13 = 0; var13 < Caption.AH.length; ++var13) {
            if (this.N[this.a.b.b].b[var11].g.toUpperCase().equals(Caption.AH[var13])) {
               var4 = -1;
               switch(var13) {
               case 0:
                  var4 = -16711681;
                  break;
               case 1:
                  var4 = -2560;
                  break;
               case 2:
                  var4 = -3407617;
               }

               VDTT_dg.d(VDTT_dg.d, var1, this.N[this.a.b.b].b[var11].g, this.b[this.a.b.b].q - 10, var11 * this.b[this.a.b.b].h + this.b[this.a.b.b].h / 2, 1, var4, -10275328);
               break;
            }
         }
      }

      this.a(var1);
   }

   public final void a_() {
      VDTT_gh var1;
      (var1 = this.a).a.a();
      var1.c.a();
      this.b[this.a.b.b].a();
      if (this.d > 0) {
         --this.d;
         if (this.d == 0) {
            this.k();

            for(int var4 = 0; var4 < DataCenter.d().ag.length; ++var4) {
               for(int var2 = 0; var2 < DataCenter.d().ag[var4].b.length; ++var2) {
                  DataCenter.d().ag[var4].b[var2].g = "";
               }
            }

            VDTT_hz var5 = this.N[this.a.b.b].b[this.c];
            this.I.a(1005, var5, this);
         }
      }

   }

   public final Vector g() {
      Vector var1;
      VDTT_gh var2;
      (var1 = super.g()).addElement((var2 = this.a).a.a(var2.b.a, var2.objX, var2.objY, var2.e));
      var1.addElement(this.b[this.a.b.b].a(1002, this));
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (this.d <= 0) {
         super.a(var1, var2, var3);
         switch(var1.b) {
         case 1001:
            if (var1.j.k >= 0) {
               VDTT_gh var10000 = this.a;
               var2 = var1.j.k;
               VDTT_gh var4 = var10000;
               if (!var10000.h[var2]) {
                  var4.b.b = var2;

                  for(var2 = 0; var2 < var4.d.length; ++var2) {
                     for(var3 = 0; var3 < var4.d[var2].size(); ++var3) {
                        var4.e.f.removeElement(var4.d[var2].elementAt(var3));
                     }
                  }

                  for(var2 = 0; var2 < var4.d[var4.b.b].size(); ++var2) {
                     var4.e.f.addElement(var4.d[var4.b.b].elementAt(var2));
                  }

                  for(var2 = 0; var2 < var4.e.f.size(); ++var2) {
                     if (var4.e.f.get(var2) instanceof VDTT_an) {
                        var4.e.f.remove(var2);
                        break;
                     }
                  }
               }

               this.w();
               return;
            }
            break;
         case 1002:
            if (var1.j.k >= 0) {
               this.d = 4;
               this.c = var1.j.k;
            }
         }

      }
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   private void w() {
      (new Thread(new VDTT_mi(this))).start();
   }

   // $FF: synthetic method
   static VDTT_ia[] a(VDTT_mh var0) {
      return var0.N;
   }

   // $FF: synthetic method
   static VDTT_gh b(VDTT_mh var0) {
      return var0.a;
   }
}
