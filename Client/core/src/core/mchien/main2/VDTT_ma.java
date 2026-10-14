package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ma extends VDTT_ar {
   private VDTT_ca a;
   private VDTT_ca b;
   private int c;
   private int d;
   private VDTT_bf N;
   private String[] O;
   private int[] P;

   public final void w() {
      this.a.a("");
      this.b.a("");
   }

   public final void b(int var1, Object var2) {
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         this.k = a(Caption.cA, Caption.mc, this, this.q / 2 - 100, this.r / 2 - 75);
         return;
      case 1002:
         this.I.i();
         VDTT_ma var9 = this;
         Message var10 = null;
         boolean var6 = false;

         label79: {
            try {
               var6 = true;
               (var10 = Message.c((byte)-114)).b(var9.P[var9.N.n.b]);
               var10.a(var9.a.i());
               var10.a(var9.b.i());
               var10.l();
               var6 = false;
               break label79;
            } catch (Exception var7) {
               var6 = false;
            } finally {
               if (var6) {
                  if (var10 != null) {
                     var10.b();
                  }

               }
            }

            if (var10 == null) {
               return;
            }

            var10.b();
            break;
         }

         var10.b();
         break;
      case 1003:
         this.I.a((MainScreen)(new VDTT_kl(this.I, this.O, this.P)));
         return;
      case 1004:
         VDTT_cw.v();
         VDTT_cw.o(58);
      }

   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.cw, (byte)2, false);
      this.c = 68;
      this.d = 35;
      VDTT_dg.a(VDTT_dg.d, var1, Caption.zE[0], 15, this.d + 10, 0, -1);
      VDTT_dg.a(VDTT_dg.d, var1, Caption.zE[4], 15, this.d + 40, 0, -1);
      VDTT_dg.a(VDTT_dg.d, var1, Caption.zE[1], 15, this.d + 65, 0, -1);
      VDTT_dg.a(VDTT_dg.d, var1, Caption.zE[2], 15, this.d + 90, 0, -1);
      this.c = 10;
      this.d = 130;
      VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.zE[3], this.c + 7, this.d += 14, 0, -2560, -16777216);
      VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.lx, this.c + 7, this.d + 14, 0, -2560, -16777216);
      var1.f(-2560);
      var1.a(this.c + 7, this.d + 4, this.c + 7 + VDTT_dg.b(VDTT_dg.b, Caption.zE[3]), this.d + 4);
      var1.a(this.c + 7, this.d + 18, this.c + 7 + VDTT_dg.b(VDTT_dg.b, Caption.lx), this.d + 18);
      this.c = this.q - 38;
      this.d = 130;
      VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.cB, this.c + 7, this.d += 14, 0, -2560, -16777216);
      var1.f(-2560);
      var1.a(this.c + 7, this.d + 4, this.c + 7 + VDTT_dg.b(VDTT_dg.b, Caption.cB), this.d + 4);
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).remove(var1.size() - 1);
      var1.addElement(new VDTT_hl(1001, 10, 140, 60, 150, (VDTT_hs)null, this));
      var1.addElement(new VDTT_hl(1004, 10, 154, 60, 164, (VDTT_hs)null, this));
      var1.addElement(new VDTT_hl(1003, this.q - 38, 140, this.q - 10, 150, (VDTT_hs)null, this));
      return var1;
   }

   public final void a_() {
   }
}
