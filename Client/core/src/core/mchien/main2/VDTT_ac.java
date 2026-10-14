package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

public final class VDTT_ac {
   private static VDTT_ac g;
   public boolean a = false;
   private Sound[] h = new Sound[74];
   private Music i;
   private Music j;
   public Music b;
   Music c;
   private int k = Integer.MIN_VALUE;
   public int d = -1;
   boolean e;
   private boolean l;
   public boolean f;

   public VDTT_ac() {
      this.a();
   }

   public final void a() {
      this.b(VDTT_eq.a().a(0));
      this.c(VDTT_eq.a().a(1));
   }

   public static VDTT_ac b() {
      if (g == null) {
         g = new VDTT_ac();
      }

      return g;
   }

   public final void a(boolean var1) {
      this.f = var1;
   }

   public final void c() {
      try {
         this.l = false;

         for(int var1 = 0; var1 < this.h.length; ++var1) {
            if (this.h[var1] != null) {
               this.h[var1].pause();
            }
         }

         this.d();
         this.e();
         this.f();
         if (this.c != null) {
            this.c.setVolume(0.0F);
         }

      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public final void d() {
      if (this.i != null) {
         this.i.pause();
      }

   }

   public final void e() {
      if (this.j != null && !this.l) {
         this.j.pause();
         this.e = false;
         this.l = true;
      }

   }

   public final void f() {
      if (this.b != null) {
         this.b.pause();
      }

   }

   public void a(int var1) {
      try {
         if (VDTT_eq.a().a(0)) {
            if (this.h[var1] == null) {
               int var3 = var1;
               VDTT_ac var2 = this;

               try {
                  VDTT_d.g();
                  byte[] var4 = VDTT_jb.b(VDTT_jb.h("sound/" + var3).readBytes());
                  VDTT_da.a("sound_temp_" + var3, var4, "mp3");
                  var2.h[var3] = Gdx.audio.newSound(VDTT_jb.i(VDTT_da.a + "sound_temp_" + var3 + ".mp3"));
               } catch (Exception var5) {
               }
            }

            this.h[var1].setVolume(this.h[var1].play(), g());
         }
      } catch (Exception var6) {
      }
   }

   public void a(int var1, float var2) {
      try {
         this.a(var1);
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }

   static float g() {
      if (VDTT_as.a() != null) {
         VDTT_as.a();
         if (VDTT_as.b()) {
            return 0.4F;
         }
      }

      return 1.0F;
   }

   private static float g(float var0) {
      if (VDTT_as.a() != null) {
         VDTT_as.a();
         if (VDTT_as.b()) {
            return 0.4F * var0;
         }
      }

      return var0;
   }

   void h() {
      try {
         for(int var1 = 0; var1 < this.h.length; ++var1) {
            if (this.h[var1] != null) {
               this.h[var1].dispose();
               this.h[var1] = null;
            }
         }

      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   void i() {
      try {
         if (this.i != null) {
            this.i.dispose();
            this.i = null;
         }

         if (this.j != null) {
            this.j.dispose();
            this.j = null;
         }

         this.j();
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public void j() {
      try {
         if (this.b != null) {
            this.b.dispose();
            this.b = null;
         }

      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public final void b(int var1) {
      try {
         if (!this.a) {
            boolean var2 = this.k != var1;
            this.k = var1;
            if (!var2) {
               this.k();
               this.e = this.l = false;
            } else {
               this.c(VDTT_eq.a().a(1));
            }
         }
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }

   public final void b(boolean var1) {
      if (!DataCenter.n()) {
         try {
            VDTT_eq.a().a(0, var1);
            this.h();
            if (var1) {
               byte[] var6;
               if (Gdx.app.getType() == ApplicationType.iOS) {
                  try {
                     var6 = VDTT_jb.b(VDTT_da.d("music_35"));
                     VDTT_da.a("music_temp_35.mp3", var6);
                     this.c = Gdx.audio.newMusic(VDTT_jb.i(VDTT_da.a + "/music_temp_35.mp3"));
                  } catch (Exception var4) {
                     VDTT_jb.a(var4);
                     return;
                  }
               } else {
                  var6 = VDTT_jb.b(VDTT_jb.h("music/35").readBytes());
                  VDTT_da.a("music35.mp3", var6);
                  this.c = Gdx.audio.newMusic(VDTT_jb.i(VDTT_da.a + "/music35.mp3"));
                  int var2 = 0;

                  while(true) {
                     if (var2 >= this.h.length) {
                        VDTT_da.k("sound");
                        break;
                     }

                     try {
                        var6 = VDTT_jb.b(VDTT_jb.h("sound/" + var2).readBytes());
                        VDTT_da.a("sound" + var2 + ".mp3", var6);
                        this.h[var2] = Gdx.audio.newSound(VDTT_jb.i(VDTT_da.a + "/sound" + var2 + ".mp3"));
                     } catch (Exception var3) {
                     }

                     ++var2;
                  }
               }
            }

         } catch (Exception var5) {
            VDTT_jb.a(var5);
         }
      }
   }

   public final void c(boolean var1) {
      try {
         if (!DataCenter.n()) {
            VDTT_eq.a().a(1, var1);
            this.d = -1;
            this.i();
            if (var1) {
               byte var4;
               switch(this.k) {
               case -1:
                  var4 = 0;
                  break;
               case 0:
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
               case 8:
               case 9:
               case 10:
               case 11:
               case 12:
               case 13:
               case 14:
               case 15:
               case 20:
               case 21:
               case 22:
               case 23:
               case 24:
               case 25:
               case 26:
               case 27:
               case 28:
               case 29:
               case 30:
               case 31:
               case 32:
               case 33:
               case 34:
               case 35:
               case 36:
               case 37:
               case 38:
               case 39:
               case 40:
               case 41:
               case 42:
               case 43:
               case 44:
               case 45:
               case 46:
               case 51:
               case 52:
               case 58:
               default:
                  return;
               case 16:
               case 17:
               case 18:
               case 19:
                  var4 = 29;
                  break;
               case 47:
               case 48:
               case 49:
               case 50:
                  var4 = 31;
                  break;
               case 53:
               case 67:
                  var4 = 32;
                  break;
               case 54:
                  var4 = 33;
                  break;
               case 55:
                  var4 = 14;
                  break;
               case 56:
                  var4 = 30;
                  break;
               case 57:
               case 75:
               case 82:
               case 83:
                  var4 = 9;
                  break;
               case 59:
                  var4 = 12;
                  break;
               case 60:
                  var4 = 10;
                  break;
               case 61:
                  var4 = 17;
                  break;
               case 62:
                  var4 = 5;
                  break;
               case 63:
                  var4 = 5;
                  break;
               case 64:
               case 74:
                  var4 = 4;
                  break;
               case 65:
               case 76:
                  var4 = 7;
                  break;
               case 66:
                  var4 = 10;
                  break;
               case 68:
                  var4 = 8;
                  break;
               case 69:
                  var4 = 6;
                  break;
               case 70:
                  var4 = 19;
                  break;
               case 71:
               case 84:
                  var4 = 18;
                  break;
               case 72:
                  var4 = 19;
                  break;
               case 73:
               case 88:
                  var4 = 15;
                  break;
               case 77:
                  var4 = 4;
                  break;
               case 78:
                  var4 = 16;
                  break;
               case 79:
               case 87:
                  var4 = 17;
                  break;
               case 80:
               case 81:
                  var4 = 13;
                  break;
               case 85:
                  var4 = 1;
                  break;
               case 86:
                  if (DataCenter.d().H[this.k].c == 3) {
                     var4 = 36;
                  } else {
                     var4 = 34;
                  }
               }

               byte[] var2;
               if (Gdx.app.getType() == ApplicationType.iOS) {
                  if (var4 >= 0) {
                     var2 = VDTT_jb.b(VDTT_da.d("music_" + var4));
                     VDTT_da.a("music_temp_" + var4 + ".mp3", var2);
                     this.i = Gdx.audio.newMusic(VDTT_jb.i(VDTT_da.a + "/music_temp_" + var4 + ".mp3"));
                  }
               } else {
                  if (var4 >= 0) {
                     var2 = VDTT_jb.b(VDTT_jb.h("music/" + var4).readBytes());
                     VDTT_da.a("music" + var4 + ".mp3", var2);
                     this.i = Gdx.audio.newMusic(VDTT_jb.i(VDTT_da.a + "/music" + var4 + ".mp3"));
                  }

                  VDTT_da.k("music");
               }

               this.k();
            }

         }
      } catch (Exception var3) {
         VDTT_jb.a(var3);
      }
   }

   public final void k() {
      if (!this.a) {
         try {
            if (this.i != null) {
               this.i.setVolume(g(0.7F));
               this.i.setLooping(true);
               this.i.play();
            }

         } catch (Exception var2) {
            VDTT_jb.a(var2);
         }
      }
   }

   public final void l() {
      if (!this.a) {
         try {
            if (this.b != null && !this.e) {
               this.b.setVolume(g());
               this.b.setLooping(true);
               this.b.play();
               this.e = true;
               this.l = false;
            }

         } catch (Exception var2) {
            VDTT_jb.a(var2);
         }
      }
   }

   public final void m() {
      if (!this.a) {
         try {
            if (this.j != null && !this.e) {
               if (this.k == 69) {
                  this.j.setVolume(g());
               } else {
                  this.j.setVolume(g(0.6F));
               }

               this.j.setLooping(true);
               this.j.play();
               this.e = true;
               this.l = false;
            }

         } catch (Exception var2) {
            VDTT_jb.a(var2);
         }
      }
   }

   public final void n() {
      if (!this.a) {
         this.a(16);
      }
   }

   public final void a(int var1, int var2, boolean var3) {
      if (!this.a) {
         byte var5;
         switch(var2) {
         case 0:
            var5 = 26;
            break;
         case 1:
         case 7:
         case 13:
         case 16:
         case 19:
         case 25:
         case 30:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 56:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 68:
         case 69:
         case 70:
         case 72:
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
         case 88:
         case 89:
         case 90:
         case 91:
         case 92:
         case 93:
         case 94:
         case 97:
         default:
            var5 = 8;
            break;
         case 2:
            var5 = 34;
            break;
         case 3:
         case 95:
            var5 = 35;
            break;
         case 4:
            var5 = 43;
            break;
         case 5:
            var5 = 29;
            break;
         case 6:
         case 98:
            var5 = 23;
            break;
         case 8:
         case 39:
         case 96:
            var5 = 41;
            break;
         case 9:
         case 26:
            var5 = 4;
            break;
         case 10:
         case 15:
         case 21:
         case 24:
         case 40:
         case 41:
         case 46:
         case 47:
         case 48:
            var5 = 50;
            break;
         case 11:
            var5 = 42;
            break;
         case 12:
            var5 = 44;
            break;
         case 14:
            var5 = 46;
            break;
         case 17:
            var5 = 45;
            break;
         case 18:
            var5 = 47;
            break;
         case 20:
            var5 = 48;
            break;
         case 22:
            var5 = 49;
            break;
         case 23:
            var5 = 52;
            break;
         case 27:
         case 44:
            var5 = 59;
            break;
         case 28:
         case 71:
            var5 = 27;
            break;
         case 29:
            var5 = 1;
            break;
         case 31:
         case 34:
            var5 = 32;
            break;
         case 32:
         case 35:
         case 36:
            var5 = 31;
            break;
         case 33:
            var5 = 33;
            break;
         case 37:
            var5 = 57;
            break;
         case 38:
            var5 = 58;
            break;
         case 42:
            var5 = 24;
            break;
         case 43:
            var5 = 60;
            break;
         case 45:
            var5 = 28;
            break;
         case 49:
            var5 = 51;
            break;
         case 55:
            var5 = 54;
            break;
         case 57:
            var5 = 55;
            break;
         case 58:
         case 87:
            var5 = 61;
            break;
         case 59:
            var5 = 56;
            break;
         case 99:
         case 100:
            var5 = 73;
            break;
         case 101:
            var5 = 72;
         }

         try {
            if (!var3) {
               this.a(var5, 0.3F);
               return;
            }

            this.a(var5);
         } catch (Exception var4) {
            VDTT_jb.a(var4);
         }

      }
   }

   public final void o() {
      if (!this.a) {
         this.a(0);
      }
   }

   public final void p() {
      if (!this.a) {
         this.a(12);
      }
   }

   public final void q() {
      if (!this.a) {
         this.a(2);
      }
   }

   public final void r() {
      if (!this.a) {
         this.a(62);
      }
   }

   public final void a(float var1) {
      if (!this.a) {
         b().v();
         if (VDTT_ek.m().bv != null) {
            this.a(64, 0.7F);
         } else if (VDTT_ek.m().aw == 5) {
            this.a(70, 0.4F);
         } else {
            this.a(3, 0.7F);
         }
      }
   }

   public final void s() {
      if (!this.a) {
         this.a(67, 0.2F);
      }
   }

   public final void a(float var1, boolean var2) {
      if (!this.a) {
         if (var2) {
            this.a(71, 0.2F);
         } else {
            this.a(13, 0.2F);
         }
      }
   }

   public final void b(float var1) {
      if (!this.a) {
         this.a(20, 0.5F);
      }
   }

   public final void t() {
      if (!this.a && !DataCenter.l()) {
         this.a(37);
      }
   }

   public final void d(boolean var1) {
      if (!this.a && !DataCenter.l()) {
         this.u();
         if (!var1) {
            this.a(36);
         }

      }
   }

   public final void u() {
      if (!this.a) {
         try {
            if (this.h[36] != null) {
               this.h[36].stop();
            }

         } catch (Exception var2) {
            VDTT_jb.a(var2);
         }
      }
   }

   public final void c(float var1) {
      if (!this.a) {
         b().v();
         if (VDTT_ek.m().bv != null) {
            this.a(64, 0.7F);
         } else {
            this.a(17, 0.7F);
         }
      }
   }

   public final void d(float var1) {
      if (!this.a) {
         if (this.h[38] != null) {
            this.h[38].stop();
         }

         this.a(40, var1);
      }
   }

   public final void e(float var1) {
      if (!this.a) {
         this.a(38, var1);
      }
   }

   public final void f(float var1) {
      if (!this.a) {
         this.a(39, var1);
      }
   }

   public final void v() {
      if (!this.a) {
         try {
            if (this.h[13] != null) {
               this.h[13].stop();
            }

            if (this.h[71] != null) {
               this.h[71].stop();
            }

         } catch (Exception var2) {
            VDTT_jb.a(var2);
         }
      }
   }

   public final void w() {
      if (!this.a) {
         try {
            if (this.h[5] != null) {
               this.h[5].stop();
            }

            this.a(5);
         } catch (Exception var2) {
            VDTT_jb.a(var2);
         }
      }
   }

   public final void x() {
      if (!this.a) {
         this.a(18);
      }
   }

   public final void y() {
      if (!this.a) {
         this.a(19);
      }
   }

   public final void z() {
      if (!this.a) {
         this.a(7);
      }
   }

   public final void A() {
      if (!this.a) {
         try {
            if (this.c != null) {
               this.c.setVolume(g());
               this.c.setLooping(true);
               this.c.play();
            }

         } catch (Exception var2) {
            VDTT_jb.a(var2);
         }
      }
   }

   public final void B() {
      try {
         if (this.c != null) {
            this.c.stop();
         }

      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }
}
