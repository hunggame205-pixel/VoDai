package core.mchien.main2;

import java.util.Vector;

public final class VDTT_gi extends VDTT_ar {
   private boolean a;
   private VDTT_ba[] b;

   public final void perform(int var1, Object var2, VDTT_z var3) {
      VDTT_ac.b().w();
      switch(var1) {
      case 508:
         VDTT_cw.v();
         VDTT_cw.o(72);
         return;
      case 509:
         this.I.a((MainScreen)(new VDTT_lj(VDTT_cw.v(), 0)));
         return;
      case 510:
         this.I.a((MainScreen)(new VDTT_ms(VDTT_cw.v())));
         return;
      case 511:
         VDTT_cw.v();
         VDTT_cw.o(54);
         return;
      case 512:
         this.I.a((MainScreen)(new VDTT_kx(this.I)));
         return;
      case 513:
         MenuConfig var4;
         (var4 = MenuConfig.K()).J();
         var4.T = 0;
         var4.a(var4.q, var4.r);
         this.I.a((MainScreen)var4);
         VDTT_cw.v().ds.clear();
         return;
      case 514:
         this.I.a(Caption.so, 2004, this);
         return;
      case 515:
         this.I.a((MainScreen)(new VDTT_lw(this.I)));
      default:
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      VDTT_dc.b(var1, -6, -6, 0, 0, this.q, this.r * 2);
   }

   public final void a_() {
      if (this.a && this.l == null) {
         this.k();
      }

      int var10001;
      int var10002;
      if (VDTT_cw.v().br == 3 && VDTT_cw.v().bs == 0) {
         var10001 = this.objX + this.b[9].objX + 10;
         var10002 = this.objY + this.b[9].objY;
         DataCenter.d().aA.a(var10001, var10002 + 10);
         DataCenter.d().aA.b = true;
      } else if (VDTT_cw.v().br == 5 && VDTT_cw.v().bs < 9) {
         DataCenter.d().aA.a(this.objX + this.b[VDTT_cw.v().bs].objX + 10, this.objY + this.b[VDTT_cw.v().bs].objY + 10);
         DataCenter.d().aA.b = true;
      } else if (VDTT_cw.v().br == 17 && VDTT_cw.v().bs == 0) {
         var10001 = this.objX + this.b[3].objX + 10;
         var10002 = this.objY + this.b[3].objY;
         DataCenter.d().aA.a(var10001, var10002 + 10);
         DataCenter.d().aA.b = true;
      } else {
         DataCenter.d().aA.b = false;
      }
   }

   public final Vector g() {
      Vector var1 = new Vector();
      if (!DataCenter.d().aA.b()) {
         var1.add(new VDTT_hl(1100, 0, 0, this.q, this.r, (VDTT_hs)null, this));
         var1.add(new VDTT_hl(1102, -DataCenter.d().n * 2, -DataCenter.d().o * 2, DataCenter.d().n * 2, DataCenter.d().o * 2, (VDTT_hs)null, this));
      }

      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (this.l == null) {
         if (var1.b > 1000 && var1.b < 1100) {
            this.I.perform(var1.b, (Object)null, this.I);
            VDTT_ac.b().w();
         } else {
            switch(var1.b) {
            case 508:
               VDTT_cw.v();
               VDTT_cw.o(72);
               VDTT_ac.b().w();
               return;
            case 509:
               this.I.a((MainScreen)(new VDTT_lj(VDTT_cw.v(), 0)));
               VDTT_ac.b().w();
               return;
            case 510:
               this.I.a((MainScreen)(new VDTT_ms(VDTT_cw.v())));
               VDTT_ac.b().w();
               return;
            case 511:
               VDTT_cw.v();
               VDTT_cw.o(54);
               VDTT_ac.b().w();
               return;
            case 512:
               this.I.a((MainScreen)(new VDTT_kx(this.I)));
               return;
            case 513:
               VDTT_cw.v().ae();
               VDTT_ac.b().w();
               return;
            case 514:
               this.I.a(Caption.so, 2003, this);
               return;
            case 515:
               this.I.a(Caption.jB, 2004, this);
               return;
            case 1102:
               this.w();
               return;
            case 2003:
               this.k();
               this.I.b(Caption.m).f.clear();
               VDTT_cm.K = true;
               VDTT_d.g().f = 50;
               return;
            case 2004:
               VDTT_d.g();
               VDTT_d.i();
            default:
            }
         }
      }
   }

   public final void w() {
      this.a = true;
      this.a(3, this.objX, DataCenter.d().o + 20);
      VDTT_ac.b().w();
   }
}
