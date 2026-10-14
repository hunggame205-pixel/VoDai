package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import java.util.Vector;

public class VDTT_bh extends VDTT_am {
   public String[] a;
   public String b;
   private byte R;
   public int c;
   public int d;
   public VDTT_v N;
   public VDTT_z O;
   public String P;
   public byte Q;

   public VDTT_bh(String var1, VDTT_p var2, int var3) {
      this.P = Caption.h;
      var2.b((VDTT_m)var2.k);
      if (var2.c != null) {
         var2.c.b((VDTT_m)var2.c.k);
      }

      this.e = 4;
      this.I = var2;
      this.R = (byte)var3;
      this.b = var1;
      short var6 = 205;
      this.a(205, 140);
      if (var3 == 3) {
         this.d = (int)(VDTT_jb.a() / 1000L);
         this.a = VDTT_dg.b(VDTT_dg.d, VDTT_jb.b(var1, "" + this.c), this.q - 30);
      } else {
         this.a = VDTT_dg.b(VDTT_dg.d, var1, this.q - 30);
      }

      if (this.a.length >= 10) {
         var6 = 240;
         this.a(240, 140);
         if (var3 == 3) {
            this.d = (int)(VDTT_jb.a() / 1000L);
            this.a = VDTT_dg.b(VDTT_dg.d, VDTT_jb.b(var1, "" + this.c), this.q - 30);
         } else {
            this.a = VDTT_dg.b(VDTT_dg.d, var1, this.q - 30);
         }
      }

      if (this.a.length >= 7) {
         int var5 = this.a.length + 1;
         this.a(var6, var5 * 20);
      }

      this.a(Caption.i, -7);
   }

   public final void a_() {
      if (this.R == 3) {
         int var1;
         if ((var1 = (int)((long)this.c - (VDTT_jb.a() / 1000L - (long)this.d))) < -1) {
            this.k();
         }

         if (var1 < 0) {
            var1 = 0;
         }

         this.a = VDTT_dg.b(VDTT_dg.d, VDTT_jb.b(this.b, "" + var1), this.q - 20);
      }

      DataCenter.d();
      if (!DataCenter.b() && VDTT_cw.v().br == 10 && VDTT_cw.v().bs == 1) {
         int var10001 = this.objX + this.q / 2 - 40;
         int var10002 = this.objY + this.r;
         DataCenter.d().aA.a(var10001, var10002 - 23);
         DataCenter.d().aA.b = true;
      }

   }

   public void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, this.P, (byte)2, true);
      this.a(var1, this.objX + 4, this.objY + this.f());
      if (this.N != null) {
         var1.a(this.N, 0, 0, this.N.c, this.N.d, 0, (float)(this.q / 2), 23.0F, 3);

         for(int var5 = 0; var5 < this.a.length; ++var5) {
            VDTT_dg.d(VDTT_dg.d, var1, this.a[var5], 10, this.h() / 2 + 25 + var5 * 12 - this.a.length * 6, 0, -1, -16777216);
         }

      } else {
         boolean var2 = true;

         int var3;
         for(var3 = 0; var3 < this.f.size(); ++var3) {
            if (this.f.get(var3) instanceof VDTT_ba && !((VDTT_ba)this.f.get(var3)).d) {
               var2 = false;
               break;
            }
         }

         if (this.R == 1 || this.b.equals(Caption.m) || var2 && this.a.length == 1) {
            for(var3 = 0; var3 < this.a.length; ++var3) {
               VDTT_dg.a(VDTT_dg.d, var1, this.a[var3], (super.q - 8) / 2, this.h() / 2 - 4 + var3 * 12 - this.a.length * 6, 2, -2560, 2, 1, 2, 0);
            }

         } else if (this.R == 2) {
            for(var3 = 0; var3 < this.a.length; ++var3) {
               VDTT_dg.d(VDTT_dg.d, var1, this.a[var3], 15, this.h() / 2 - 4 + var3 * 12 - this.a.length * 6, 0, -1, -16777216);
            }

         } else {
            for(var3 = 0; var3 < this.a.length; ++var3) {
               VDTT_dg.d(VDTT_dg.d, var1, this.a[var3], (super.q - 8) / 2, this.h() / 2 - 4 + var3 * 12 - this.a.length * 6, 2, -1, -16777216);
            }

         }
      }
   }

   public void a(VDTT_hl var1, int var2, int var3) {
      if (var1.b >= 2000 && var1.b <= 3000) {
         this.k();
         this.O.a(var1, var2, var3);
      } else {
         switch(var1.b) {
         case 10000:
            this.k();
            return;
         case 10001:
            this.k();
            return;
         case 10002:
            VDTT_bh var7 = this;

            try {
               if (var7.Q == -126) {
                  //todo open web
//                  Gdx.net.openURI("https://vodaitoithuong.vn/");
                  VDTT_d.g();
                  VDTT_d.i();
               } else {
                  Message.d(var7.Q).l();
               }
            } catch (Exception var6) {
               VDTT_jb.a(var6);
            }

            this.k();
            return;
         case 10003:
            this.k();
            if (this.I.c instanceof VDTT_ar) {
               ((VDTT_ar)this.I.c).a(var1, var2, var3);
               return;
            }
            break;
         case 10004:
            this.a((byte)-128);
            return;
         case 10005:
            this.a((byte)-127);
            return;
         case 10006:
            try {
               Message.d((byte)-122).l();
               if (DataCenter.d().ai instanceof VDTT_cq) {
                  ((VDTT_cq)DataCenter.d().ai).A();
               }
            } catch (Exception var5) {
               VDTT_jb.a(var5);
            }

            this.k();
            return;
         case 10007:
            if (this.I instanceof VDTT_cq) {
               ((VDTT_cq)this.I).A();
            } else if (this.I instanceof VDTT_cu) {
               VDTT_cu.v();
            }

            this.k();
            return;
         case 10008:
            this.k();
            if (VDTT_dn.a().c()) {
               DataCenter.d().ay = true;
               VDTT_dn.a().b();
               return;
            }
            break;
         case 10009:
            this.k();
            return;
         case 10010:
            this.k();
            DataCenter.aD = 0;
            return;
         case 10011:
            this.k();
            VDTT_mx var4 = new VDTT_mx(VDTT_cw.v());
            VDTT_cw.v().a((MainScreen)var4);
            VDTT_mx.O = 3;
            var4.f(3);
            var4.A();
            return;
         case 20000:
            this.I.b(Caption.m).f.clear();
            VDTT_cm.K = true;
            VDTT_d.g().f = 50;
            return;
         case 30000:
            System.exit(0);
            return;
         default:
            super.a(var1, var2, var3);
         }

      }
   }

   public final Vector g() {
      return super.g();
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final VDTT_ca w() {
      VDTT_ca var1 = null;

      for(int var2 = 0; var2 < this.f.size(); ++var2) {
         if (this.f.get(var2) instanceof VDTT_ca) {
            var1 = (VDTT_ca)this.f.get(var2);
            break;
         }
      }

      return var1;
   }

   private void a(byte var1) {
      try {
         String var2 = "";
         VDTT_ca var3;
         if ((var3 = this.w()) != null) {
            var2 = var3.i();
            var3.a("");
         }

         Message var5;
         (var5 = Message.a(var1)).a(var2);
         var5.l();
      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }
   }
}
