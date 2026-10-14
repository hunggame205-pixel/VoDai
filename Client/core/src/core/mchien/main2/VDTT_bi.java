package core.mchien.main2;

import java.util.Vector;

public final class VDTT_bi extends VDTT_am {
   private byte d;
   public VDTT_z a;
   public String b;
   public byte c;
   private String[] N;
   private VDTT_ba O;
   private long P;

   public VDTT_bi(String[] var1, VDTT_p var2, int var3, int var4) {
      this.b = Caption.h;
      var2.b((VDTT_m)var2.k);
      if (var2.c != null) {
         var2.c.b((VDTT_m)var2.c.k);
      }

      this.e = 4;
      this.I = var2;
      this.N = var1;
      this.d = 0;
      this.a(200, 140);
      this.O = this.a(Caption.i, 2112);
      this.j();
   }

   public final void w() {
      this.P = System.currentTimeMillis() + 3500L;
   }

   public final void a(String var1) {
      this.O.l = var1;
   }

   public final void b(Graphics var1) {
      var1.f(-11184811);
      var1.c(2, 19, this.q - 3, this.r - 29);
      var1.f(-10275328);
      var1.b(6, 23, this.q - 12, this.r - 38);
      this.a(var1, this.objX + 4, this.objY + this.f());

      for(int var2 = 0; var2 < this.N.length; ++var2) {
         VDTT_dg.a(var1, this.N[var2], this.q / 2, this.h() / 2 + var2 * 12 - this.N.length * 6, 2, -1);
      }

   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (var1.b >= 2000 && var1.b <= 3000) {
         this.k();
         this.a.a(var1, var2, var3);
      } else {
         switch(var1.b) {
         case 10000:
            this.k();
            return;
         case 10001:
            this.k();
            return;
         case 10002:
            VDTT_bi var7 = this;

            try {
               Message.d(var7.c).l();
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

   private VDTT_ca x() {
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
         if ((var3 = this.x()) != null) {
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

   public final void a_() {
      if (this.P > 0L) {
         try {
            int var1;
            if ((var1 = (int)(this.P - System.currentTimeMillis())) < 0) {
               var1 = 0;
               if (this.O.m == 2112) {
                  this.k();
                  this.a.a((VDTT_hl)((VDTT_hl)this.O.g().get(0)), this.objX, this.objY);
                  return;
               }
            }

            VDTT_ba var10000 = this.O;
            String var2 = Caption.fG + " (" + var1 / 1000 + ")";
            var10000.l = var2;
            return;
         } catch (Exception var3) {
         }
      }

   }
}
