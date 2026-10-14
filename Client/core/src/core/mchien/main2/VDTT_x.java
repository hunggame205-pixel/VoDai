package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import java.util.Vector;

public final class VDTT_x extends VDTT_am {
   private boolean N;
   private boolean O;
   private boolean P;
   private boolean Q;
   private VDTT_ca R;
   private int S;
   private int T;
   private VDTT_ba[] U;
   private int V = -1;
   private int W = -1;
   private int X = 0;
   private int Y = 0;
   private int Z = 0;
   private int aa;
   private int ab;
   private int ac;
   private VDTT_dg ad;
   public String a = "";
   private char[][] ae = new char[2][];
   private char[][] af = new char[6][];
   private MainScreen ag;
   private short ah;
   private short ai;
   private short aj;
   private short ak;
   public VDTT_u b;
   private static VDTT_v al;
   private int am;
   public boolean c;
   private long an;
   public boolean d;

   public VDTT_x(VDTT_p var1, VDTT_ca var2, boolean var3, boolean var4) {
      try {
         this.c = false;
         this.K = false;
         this.e = 5;
         this.I = var1;
         this.O = DataCenter.d().n > 400;
         this.R = var2;
         this.w();
         this.P = var2.m == 2;
         this.X = this.P ? 1 : 0;
         this.ad = VDTT_dg.f;
         if (var2.b() + var2.r > this.objY) {
            this.S = this.objY - var2.b() - var2.r - 1;
         }

         if (!var4) {
            this.S = 0;
         }

         this.f(this.S);
         this.ah = var2.objX;
         this.ai = var2.objY;
         this.aj = (short)var2.a();
         this.ak = (short)var2.b();
         this.ag = var2.a;
         this.ag.b((VDTT_m)var2);
         this.R = var2;
         var2.a = this;
         var2.objX = (short)(this.ab + this.aj - this.ab);
         if (this.ai + var2.r > this.objY) {
            var2.objY = (short)(-var2.r);
         } else {
            var2.objY = (short)(-(DataCenter.d().o - this.r - this.ak));
         }

         this.a(var2);
         if (this.ag instanceof VDTT_u) {
            VDTT_u var6 = (VDTT_u)this.ag;
            this.b = var6;
            this.b.a(var2);
         }

         var2.a.l = null;
      } catch (Exception var5) {
         VDTT_jb.a(var5);
      }
   }

   private void w() {
      if (this.O) {
         this.d(DataCenter.d().n, 145);
         this.f(0, DataCenter.d().o - this.r);
         this.Z = 25;
      } else {
         this.d(DataCenter.d().n, 120);
         this.f(0, DataCenter.d().o - this.r);
         this.Z = 20;
      }

      this.Y = (DataCenter.d().n - 32) / 11;
      this.aa = 2;
      this.ab = DataCenter.d().n / 2 - 6 * (this.Y + this.aa) + (this.Y + this.aa) / 2;
      this.ac = 5;
      this.U = new VDTT_ba[46];

      int var1;
      for(var1 = 0; var1 < 10; ++var1) {
         this.U[var1] = this.a(this.ab + (this.Y + this.aa) / 2 + var1 * (this.Y + this.aa), this.ac, "", this, 1000 + var1, -1);
         this.U[var1].d(this.Y, this.Z);
      }

      for(var1 = 0; var1 < 11; ++var1) {
         this.U[10 + var1] = this.a(this.ab + var1 * (this.Y + this.aa), this.ac + this.Z + this.aa, "", this, 1010 + var1, -1);
         this.U[10 + var1].d(this.Y, this.Z);
      }

      for(var1 = 0; var1 < 10; ++var1) {
         this.U[21 + var1] = this.a(this.ab + (this.Y + this.aa) / 2 + var1 * (this.Y + this.aa), this.ac + 2 * (this.Z + this.aa), "", this, 1021 + var1, -1);
         this.U[21 + var1].d(this.Y, this.Z);
      }

      this.U[31] = this.a(this.ab, this.ac + 3 * (this.Z + this.aa), "", this, 1031, -1);
      this.U[31].d(this.U[22].objX + this.U[22].q / 2 - this.ab - this.aa, this.Z);

      for(var1 = 0; var1 < 7; ++var1) {
         this.U[32 + var1] = this.a(this.ab + this.U[31].q + this.aa + var1 * (this.Y + this.aa), this.ac + 3 * (this.Z + this.aa), "", this, 1032 + var1, -1);
         this.U[32 + var1].d(this.Y, this.Z);
      }

      this.U[39] = this.a(this.U[38].objX + this.U[38].q + this.aa, this.ac + 3 * (this.Z + this.aa), "", this, 1039, -1);
      this.U[39].d(this.U[22].objX + this.U[22].q / 2 - this.ab, this.Z);
      this.U[40] = this.a(this.ab, this.ac + 4 * (this.Z + this.aa), "", this, 1040, -1);
      this.U[40].d(this.U[22].objX + this.U[22].q / 2 - this.ab - this.aa, this.Z);
      this.U[41] = this.a(this.U[40].objX + this.U[40].q + this.aa, this.ac + 4 * (this.Z + this.aa), "", this, 1041, -1);
      this.U[41].d(this.Y, this.Z);
      this.U[42] = this.a(this.U[41].objX + this.U[41].q + this.aa, this.ac + 4 * (this.Z + this.aa), "", this, 1042, -1);
      this.U[42].d(this.U[36].objX + this.U[36].q + this.Y + this.aa - this.U[34].objX, this.Z);
      this.U[43] = this.a(this.U[42].objX + this.U[42].q + this.aa, this.ac + 4 * (this.Z + this.aa), "", this, 1043, -1);
      this.U[43].d(this.Y, this.Z);
      this.U[44] = this.a(this.U[43].objX + this.U[43].q + this.aa, this.ac + 4 * (this.Z + this.aa), "", this, 1044, -1);
      this.U[44].d(this.Y, this.Z);
      this.U[45] = this.a(this.U[44].objX + this.U[44].q + this.aa, this.ac + 4 * (this.Z + this.aa), "", this, 1045, -1);
      this.U[45].d(this.U[22].objX + this.U[22].q / 2 - this.ab, this.Z);
      this.ae[0] = new char[]{'ă', 'â', 'ê', 'ô', 'ˋ', 'ˊ', '~', 'ˀ', '.', 'đ', 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'ư', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'ơ', ' ', 'z', 'x', 'c', 'v', 'b', 'n', 'm', ' ', ' ', '@', ' ', ',', '.', ' '};
      this.ae[1] = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '@', '#', '$', '%', '&', '-', '+', '(', ')', '_', '*', '"', '\'', ':', ';', '!', '?', '\\', '/', '{', '}', ' ', '~', '[', ']', '=', '<', '>', '|', ' ', ' ', '_', ' ', ',', '.', ' '};
      this.af[0] = new char[]{'a', 'ă', 'â', 'o', 'ơ', 'ô', 'ê', 'e', 'ư', 'u', 'i', 'y', 'A', 'Ă', 'Â', 'O', 'Ơ', 'Ô', 'Ê', 'E', 'Ư', 'U', 'I', 'Y'};
      this.af[1] = new char[]{'á', 'ắ', 'ấ', 'ó', 'ớ', 'ố', 'ế', 'é', 'ứ', 'ú', 'í', 'ý', 'Á', 'Ắ', 'Ấ', 'Ó', 'Ớ', 'Ố', 'Ế', 'É', 'Ứ', 'Ú', 'Í', 'Ý'};
      this.af[2] = new char[]{'ả', 'ẳ', 'ẩ', 'ỏ', 'ở', 'ổ', 'ể', 'ẻ', 'ử', 'ủ', 'ỉ', 'ỷ', 'Ả', 'Ẳ', 'Ẩ', 'Ỏ', 'Ở', 'Ổ', 'Ể', 'Ẻ', 'Ử', 'Ủ', 'Ỉ', 'Ỷ'};
      this.af[3] = new char[]{'ã', 'ẵ', 'ẫ', 'õ', 'ỡ', 'ỗ', 'ễ', 'ẽ', 'ữ', 'ũ', 'ĩ', 'ỹ', 'Ã', 'Ẵ', 'Ẫ', 'Õ', 'Ỡ', 'Ỗ', 'Ễ', 'Ẽ', 'Ữ', 'Ũ', 'Ĩ', 'Ỹ'};
      this.af[4] = new char[]{'à', 'ằ', 'ầ', 'ò', 'ờ', 'ồ', 'ề', 'è', 'ừ', 'ù', 'ì', 'ỳ', 'À', 'Ằ', 'Ầ', 'Ò', 'Ờ', 'Ồ', 'Ề', 'È', 'Ừ', 'Ù', 'Ì', 'Ỳ'};
      this.af[5] = new char[]{'ạ', 'ặ', 'ậ', 'ọ', 'ợ', 'ộ', 'ệ', 'ẹ', 'ự', 'ụ', 'ị', 'ỵ', 'Ạ', 'Ặ', 'Ậ', 'Ọ', 'Ợ', 'Ộ', 'Ệ', 'Ẹ', 'Ự', 'Ụ', 'Ị', 'Ỵ'};
   }

   public final void d() {
      if (this.V == -2) {
         VDTT_cw.v().a(this.R);
      }

      this.f(-this.S);
      this.R.a = this.ag;
      this.R.objX = this.ah;
      this.R.objY = this.ai;
      if (this.R.m == 2) {
         this.R.a(String.valueOf(this.R.h()));
      }

      this.b(this.R);
      this.ag.a(this.R);
      if (this.b != null) {
         this.b.b(this.R);
      } else {
         if (this.R.S != Integer.MIN_VALUE && this.R.h() < this.R.S) {
            this.R.a("" + this.R.S);
         }

         if (this.R.T != Integer.MAX_VALUE && this.R.h() > this.R.T) {
            this.R.a("" + this.R.T);
         }
      }

      if (al != null) {
         al.a();
         al = null;
      }

      this.R.b = false;
      VDTT_ca var1 = this.R;
      if (VDTT_cw.v().aP != null && VDTT_cw.v().aP.equals(var1)) {
         var1.f(-200, -200);
         var1.b(true);
      }

      if (MenuConfig.K().V != null && MenuConfig.K().V.equals(var1)) {
         var1.f(-200, -200);
         var1.b(true);
      }

      VDTT_aa.a = null;
      if (this.c) {
         Gdx.input.setOnscreenKeyboardVisible(false);
      }

   }

   private void f(int var1) {
      for(int var3 = 0; var3 < this.I.b.size(); ++var3) {
         MainScreen var2;
         if (!((var2 = (MainScreen)this.I.b.elementAt(var3)) instanceof VDTT_x) && !(var2 instanceof VDTT_cw)) {
            var2.f(var2.objX, var2.objY + var1);
         }
      }

   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.W = var1.b;
      if (this.W != 5000 && this.W != 1045) {
         if (this.c) {
            this.k();
         } else {
            this.W -= 1000;
            if (this.W == 39) {
               if (!this.d) {
                  this.V = 8;
               }

               this.d = false;
            } else {
               this.V = this.ae[this.X][this.W];
               if (!this.P || this.V >= 48 && this.V <= 57) {
                  if (this.X == 0 && this.N) {
                     this.V = String.valueOf(this.ae[0][this.W]).toUpperCase().charAt(0);
                  }

                  if (this.W == 31) {
                     if (this.X == 0) {
                        this.N = !this.N;
                        this.am = 0;
                     }

                     this.V = -1;
                  } else if (this.W == 40 && !this.P) {
                     this.X = this.X == 0 ? 1 : 0;
                     this.am = 0;
                     this.w();
                     this.V = -1;
                  } else if (this.W == 41) {
                     if (this.R.U && this.X == 0) {
                        if (VDTT_jb.c() > VDTT_cw.v().ah) {
                           this.I.c(Caption.sq, -1);
                        } else {
                           this.k = new VDTT_bl(var1.a.objX - 44, var1.a.objY - 88, 8001, this);
                           this.a(this.k);
                        }
                     } else {
                        String var4 = this.R.i();
                        if ((var4 = var4 + ".com").length() <= this.R.l) {
                           this.R.a(var4);
                        }
                     }

                     this.V = -1;
                  }
               } else {
                  this.V = -1;
               }
            }
         }
      } else {
         this.V = -1;
         if (this.W == 1045 && this.R.U) {
            this.V = -2;
         }

         this.k();
      }
   }

   public final void a(int var1, Object var2) {
      long var3 = VDTT_jb.a();
      if (this.an == 0L) {
         this.an = var3;
      } else {
         if (var3 - this.an > 100L) {
            switch(var1) {
            case 1039:
               this.d = true;
               this.an = 0L;
               this.R.o.a((int)8);
               return;
            default:
               this.an = 0L;
            }
         }

      }
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      if (!this.c) {
         if (var1 == 8001) {
            this.R.d(var2.toString());
            this.c(this.R);
         }

      }
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      try {
         int var3;
         for(var3 = 0; var3 < this.f.size(); ++var3) {
            VDTT_m var2;
            if (!((var2 = (VDTT_m)this.f.elementAt(var3)) instanceof VDTT_bl)) {
               var2.d(var1);
            }
         }

         if (!this.c) {
            var1.f(-10205144);
            var1.c(0, 0, this.q, this.r);

            for(int var4 = 0; var4 < this.U.length; ++var4) {
               var3 = 0;
               var1.f(1066371711);
               var1.c(this.U[var4].objX, this.U[var4].objY, this.U[var4].q, this.U[var4].r);
               var1.f(10695177);
               var1.b(this.U[var4].objX, this.U[var4].objY, this.U[var4].q, this.U[var4].r);
               String var7 = String.valueOf(this.ae[this.X][var4]);
               if (var4 == 31) {
                  if (this.P) {
                     var1.c(-11184811);
                  }

                  VDTT_dc.a(var1, 98, 0, this.U[var4].objX + this.U[var4].q / 2, this.U[var4].objY + this.U[var4].r / 2 + (this.U[var4].e(0) ? 1 : 0), 3);
                  if (this.P) {
                     var1.f();
                  }
               } else if (var4 == 39) {
                  VDTT_dc.a(var1, 99, 0, this.U[var4].objX + this.U[var4].q / 2, this.U[var4].objY + this.U[var4].r / 2 + (this.U[var4].e(0) ? 1 : 0), 3);
               } else {
                  if (var4 == 40) {
                     var7 = this.X == 0 ? "?123" : "ABC";
                  } else {
                     label134: {
                        String var10000;
                        if (var4 == 41) {
                           if (this.R.U && this.X == 0) {
                              VDTT_dc.a(var1, 38, 0, this.U[var4].objX + this.U[var4].q / 2 + 1, this.U[var4].objY + this.U[var4].r / 2, 3);
                              continue;
                           }

                           var10000 = ".com";
                        } else {
                           if (var4 != 45) {
                              break label134;
                           }

                           var10000 = this.R.U ? Caption.gS : Caption.gT;
                        }

                        var7 = var10000;
                     }
                  }

                  if (this.N) {
                     var7 = var7.toUpperCase();
                  }

                  if (this.U[var4].e(0)) {
                     ++var3;
                  }

                  int var5 = -1;
                  if (this.P && var4 >= 10 && var4 != 45) {
                     var5 = -11184811;
                  }

                  if (var7.equals("ˀ")) {
                     VDTT_dg.a((BitmapFont) Graphics.b(), var1, "?", this.U[var4].objX + this.U[var4].q / 2, this.U[var4].objY + this.U[var4].r / 2 + 1 + var3 - 1, 2, var5, 0);
                     var1.f(-7370113);
                     var1.c(this.U[var4].objX - 3 + this.U[var4].q / 2, this.U[var4].objY + this.U[var4].r / 2 + 1 + var3 - 4 + 5, 6, 3);
                  } else if (var7.equals("ˊ")) {
                     VDTT_dg.a((BitmapFont) Graphics.b(), var1, "/", this.U[var4].objX + this.U[var4].q / 2, this.U[var4].objY + this.U[var4].r / 2 + 1 + var3 - 1, 2, var5, 0);
                     var1.f(-7370113);
                     var1.c(this.U[var4].objX - 3 + this.U[var4].q / 2, this.U[var4].objY + this.U[var4].r / 2 + 1 + var3 - 4 + 3, 6, 5);
                  } else if (var7.equals("ˋ")) {
                     VDTT_dg.a((BitmapFont) Graphics.b(), var1, "\\", this.U[var4].objX + this.U[var4].q / 2, this.U[var4].objY + this.U[var4].r / 2 + 1 + var3 - 1, 2, var5, 0);
                     var1.f(-7370113);
                     var1.c(this.U[var4].objX - 3 + this.U[var4].q / 2, this.U[var4].objY + this.U[var4].r / 2 + 1 + var3 - 4 + 3, 6, 5);
                  } else {
                     VDTT_dg.a((VDTT_dg)this.ad, var1, var7, this.U[var4].objX + this.U[var4].q / 2, this.U[var4].objY + this.U[var4].r / 2 + 1 + var3, 2, var5, 0);
                  }

                  if (this.U[var4].e(0) && this.U[var4].e(0) && (!this.P && var4 != 40 && var4 != 42 && var4 != 45 || this.P && var4 < 10)) {
                     var1.f(10695177);
                     var1.c(this.U[var4].objX, this.U[var4].objY - this.U[var4].r - 2, this.U[var4].q, this.U[var4].r);
                     var1.f(10695177);
                     var1.b(this.U[var4].objX, this.U[var4].objY - this.U[var4].r - 2, this.U[var4].q, this.U[var4].r);
                     if (var7.equals("ˀ")) {
                        VDTT_dg.a((BitmapFont) Graphics.b(), var1, "?", this.U[var4].objX + this.U[var4].q / 2, this.U[var4].objY + this.U[var4].r / 2 - this.U[var4].r - 2 - 2, 2, var5, 0);
                        var1.c(this.U[var4].objX - 3 + this.U[var4].q / 2, this.U[var4].objY + this.U[var4].r / 2 - this.U[var4].r - 2 - 4 + 5, 6, 3);
                     } else if (var7.equals("ˊ")) {
                        VDTT_dg.a((BitmapFont) Graphics.b(), var1, "/", this.U[var4].objX + this.U[var4].q / 2, this.U[var4].objY + this.U[var4].r / 2 - this.U[var4].r - 2 - 2, 2, var5, 0);
                        var1.c(this.U[var4].objX - 3 + this.U[var4].q / 2, this.U[var4].objY + this.U[var4].r / 2 - this.U[var4].r - 2 - 4 + 3, 6, 5);
                     } else if (var7.equals("ˋ")) {
                        VDTT_dg.a((BitmapFont) Graphics.b(), var1, "\\", this.U[var4].objX + this.U[var4].q / 2, this.U[var4].objY + this.U[var4].r / 2 - this.U[var4].r - 2 - 2, 2, var5, 0);
                        var1.c(this.U[var4].objX - 3 + this.U[var4].q / 2, this.U[var4].objY + this.U[var4].r / 2 - this.U[var4].r - 2 - 4 + 3, 6, 5);
                     } else {
                        VDTT_dg.a((VDTT_dg)VDTT_dg.f, var1, var7, this.U[var4].objX + this.U[var4].q / 2, this.U[var4].objY + this.U[var4].r / 2 - this.U[var4].r - 2, 2, -1, 0);
                     }
                  }
               }
            }

            if (this.k != null) {
               this.a(var1, this.k.a(), this.k.b());
               this.k.b(var1);
            }

         }
      } catch (Exception var6) {
         VDTT_jb.a(var6);
      }
   }

   public final void a_() {
      String var1;
      if ((var1 = this.R.i()).length() >= this.R.l) {
         if (!this.R.W || this.V == -1) {
            return;
         }

         this.R.a("");
         var1 = "";
      }

      if (this.V >= 0) {
         if (this.V >= 32) {
            VDTT_ca var3 = this.R;
            String var2 = var1;
            VDTT_x var12 = this;
            if (this.V >= 0) {
               this.a = "";
               this.T = 0;
               int var5;
               if (var1.length() > 0) {
                  int var4;
                  for(var5 = (var4 = var3.d()) + var3.J - 1; var5 >= 0; --var5) {
                     if (var2.charAt(var5) == ' ') {
                        this.T = var5 + 1 - var4;
                        break;
                     }
                  }

                  this.a = var2.substring(var4 + this.T, var4 + var3.J);
               }

               if (this.X == 0 && this.a.length() > 0) {
                  boolean var14 = false;
                  var5 = 0;
                  int var6 = -1;
                  int var7 = 0;
                  boolean var8 = false;
                  int var9 = 0;

                  while(true) {
                     int var10;
                     int var11;
                     if (var9 >= var12.a.length()) {
                        if (var12.X != 0 || var12.V != var12.ae[0][4] && var12.V != var12.ae[0][5] && var12.V != var12.ae[0][6] && var12.V != var12.ae[0][7] && (var12.W == 44 || var12.V != var12.ae[0][8])) {
                           if (var5 >= 2 && var12.V != 32 && var12.V != 46 && var12.V != 44 && var7 > 0) {
                              label268:
                              for(var9 = 0; var9 < var12.a.length(); ++var9) {
                                 for(var10 = 0; var10 < var12.af.length; ++var10) {
                                    for(var11 = 0; var11 < var12.af[var10].length; ++var11) {
                                       if (var12.a.charAt(var9) == var12.af[var10][var11]) {
                                          if (var9 == var6) {
                                             var12.a = var12.a.replace(var12.a.charAt(var9), var12.af[var7][var11]);
                                             break label268;
                                          }

                                          var12.a = var12.a.replace(var12.a.charAt(var9), var12.af[0][var11]);
                                          var14 = true;
                                       }
                                    }
                                 }
                              }
                           }

                           if (var14) {
                              var3.a(var12.a + (char)var12.V, var12.T, var3.J + 1);
                           } else {
                              if (var12.V == 32 && !var12.Q && var2.endsWith(".")) {
                                 var12.Q = true;
                                 var12.N = true;
                              } else if (var12.Q && var12.V != 32) {
                                 var12.Q = var12.N = false;
                              }

                              var12.a = var12.a + (char)var12.V;
                              var3.a("" + (char)var12.V, var3.J, var3.J + 1);
                           }
                        } else {
                           if (var5 == 1 || var5 == 2 && var6 == var12.a.length() - 1) {
                              label222:
                              for(var9 = 0; var9 < var12.a.length(); ++var9) {
                                 for(var10 = 0; var10 < var12.af.length; ++var10) {
                                    for(var11 = 0; var11 < var12.af[var10].length; ++var11) {
                                       if (var12.a.charAt(var9) == var12.af[var10][var11]) {
                                          if (var12.V == var12.ae[0][4]) {
                                             var12.a = var12.a.replace(var12.a.charAt(var9), var12.af[4][var11]);
                                          } else if (var12.V == var12.ae[0][5]) {
                                             var12.a = var12.a.replace(var12.a.charAt(var9), var12.af[1][var11]);
                                          } else if (var12.V == var12.ae[0][6]) {
                                             var12.a = var12.a.replace(var12.a.charAt(var9), var12.af[3][var11]);
                                          } else if (var12.V == var12.ae[0][7]) {
                                             var12.a = var12.a.replace(var12.a.charAt(var9), var12.af[2][var11]);
                                          } else if (var12.V == var12.ae[0][8]) {
                                             var12.a = var12.a.replace(var12.a.charAt(var9), var12.af[5][var11]);
                                          }

                                          var14 = true;
                                          break label222;
                                       }
                                    }
                                 }
                              }
                           } else {
                              int var13 = 0;

                              label207:
                              for(var9 = 0; var9 < var12.a.length(); ++var9) {
                                 for(var10 = 0; var10 < var12.af.length; ++var10) {
                                    for(var11 = 0; var11 < var12.af[var10].length; ++var11) {
                                       if (var12.a.charAt(var9) == var12.af[var10][var11]) {
                                          if (var5 == 2 && var13 > var5 - 2 && var6 == var9 || var5 == 3 && var13 > 0 && !var8 || var5 == 3 && var13 > 1 && var8) {
                                             if (var12.V == var12.ae[0][4]) {
                                                var12.a = var12.a.replace(var12.a.charAt(var9), var12.af[4][var11]);
                                             } else if (var12.V == var12.ae[0][5]) {
                                                var12.a = var12.a.replace(var12.a.charAt(var9), var12.af[1][var11]);
                                             } else if (var12.V == var12.ae[0][6]) {
                                                var12.a = var12.a.replace(var12.a.charAt(var9), var12.af[3][var11]);
                                             } else if (var12.V == var12.ae[0][7]) {
                                                var12.a = var12.a.replace(var12.a.charAt(var9), var12.af[2][var11]);
                                             } else if (var12.V == var12.ae[0][8]) {
                                                var12.a = var12.a.replace(var12.a.charAt(var9), var12.af[5][var11]);
                                             }

                                             var14 = true;
                                             break label207;
                                          }

                                          ++var13;
                                       }
                                    }
                                 }
                              }
                           }

                           if (!var14) {
                              break;
                           }

                           var3.a(var12.a, var12.T, var3.J);
                        }

                        var12.V = -1;
                        break;
                     }

                     for(var10 = 0; var10 < var12.af.length; ++var10) {
                        for(var11 = 0; var11 < var12.af[var10].length; ++var11) {
                           if (var12.a.charAt(var9) == var12.af[var10][var11]) {
                              ++var5;
                              if (var12.af[var10][var11] == 'y' || var12.af[var10][var11] == 'Y') {
                                 var8 = true;
                              }

                              if (var10 > 0) {
                                 var7 = var10;
                              }

                              var6 = var9;
                           }
                        }
                     }

                     ++var9;
                  }
               } else {
                  if (this.X == 0 && (this.W < 4 || this.W > 8) || this.X == 1) {
                     if (this.V == 32 && !this.Q && var2.endsWith(".")) {
                        this.Q = true;
                        this.N = true;
                     } else if (this.Q && this.V != 32) {
                        this.Q = this.N = false;
                     }

                     var3.a("" + (char)this.V, var3.J, var3.J + 1);
                  }

                  this.V = -1;
               }
            }
         } else {
            this.R.o.a(this.V);
         }

         this.V = -1;
      }

      this.R.b = true;
      if (this.c) {
         Gdx.input.setOnscreenKeyboardVisible(true);
      }

   }

   public final Vector g() {
      Vector var1 = new Vector();
      if (this.c) {
         var1.add(new VDTT_hl(5000, 0, -DataCenter.d().o, DataCenter.d().n, DataCenter.d().o * 2, (VDTT_hs)null, this));
      } else {
         var1.add(new VDTT_hl(5000, 0, -this.objY, DataCenter.d().n, DataCenter.d().o - DataCenter.d().o, (VDTT_hs)null, this));
      }

      return var1;
   }
}
