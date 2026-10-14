package core.mchien.main2;

import java.util.Vector;

public final class VDTT_mt extends VDTT_ar {
   public int a = 0;
   public String[] b;
   private VDTT_hs c;

   public VDTT_mt(VDTT_p var1, Message var2) {
      try {
         this.e = 2;
         this.I = var1;
         this.a(280, 160);
         this.a(Caption.eB, 1000);
         this.a = var2.i();
         this.b = VDTT_dg.b(VDTT_dg.d, Caption.ly, this.q - 35);
         this.c = new VDTT_hs((byte)1, 15, 14, this.q - 35, 112, 14, this.b.length);
      } catch (Exception var3) {
      }
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      this.a(var1, this.c);

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         if (this.c.b(var2)) {
            if (var2 == 0) {
               VDTT_dg.a(VDTT_dg.d, var1, VDTT_jb.b(this.b[var2], VDTT_jb.c(this.a)), 0, 5 + var2 * 14, 0, -1);
            } else {
               VDTT_dg.a(VDTT_dg.d, var1, this.b[var2], 0, 5 + var2 * 14, 0, -1);
            }
         }
      }

      this.a(var1);
   }

   public final void a_() {
      this.c.a();
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1000:
         try {
            Message.c((byte)-83).l();
            return;
         } catch (Exception var4) {
            VDTT_jb.a(var4);
         }
      default:
      }
   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).addElement(this.c.a(1010, this));
      return var1;
   }
}
