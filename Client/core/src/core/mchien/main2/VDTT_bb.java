package core.mchien.main2;

import java.util.Map;
import java.util.Vector;

public final class VDTT_bb extends VDTT_ba {
   public static int R = 300;
   public VDTT_hu S;
   private short ac;
   public short T;
   public short U;
   public VDTT_ik V;
   public VDTT_ae W;
   public int X;
   public int Y;
   public int Z;
   public int aa;
   public boolean ab;

   public VDTT_bb(int var1, int var2, int var3, int var4, String var5, MainScreen var6, int var7, int var8, int var9) {
      super(var1, var2, 0, 0, var5, var6, var7, var8);
      this.X = this.objX;
      this.Y = this.objY;
      this.Z = this.q;
      this.aa = this.r;
      this.ac = (short)var9;
      this.S = new VDTT_hu((byte)0, this.q / 2, this.r / 2, this.q, this.r, 1, 1, this);
      this.W = new VDTT_ae();
      this.W.d(this.q, this.r);
   }

   public final int h() {
      return this.X + this.Z / 2;
   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).addElement(new VDTT_hl(this.m, 0, 0, this.q, this.r, this.S, this));
      return var1;
   }

   public final void r() {
      super.r();
      this.ab = false;
      this.j();
      if (VDTT_ek.b(VDTT_ek.m().objX, VDTT_ek.m().objY) == null && DataCenter.d().ai.c instanceof Map) {
         VDTT_ac.b().c(0.7F);
      }

   }

   public final void i() {
      this.d(this.Z, this.aa);
      this.f(this.X, this.Y);
   }

   public final void j() {
      if (VDTT_eq.a().b(12) == 2) {
         int var10001 = R;
         this.d(var10001, var10001);
         this.f(0, DataCenter.d().o - this.r - 0);
      } else {
         this.i();
      }

      this.T = 0;
      this.U = 0;
      this.W.f(0, 0);
      if (this.S != null) {
         this.S.f();
      }

   }

   public final void a_() {
      super.a_();
      if (this.V != null) {
         this.V.a();
      }

   }

   public final void b(Graphics var1) {
      short var2 = this.I;
      short var3 = this.ac;
      VDTT_eq.a();
      if (!this.d()) {
         var1.d(60);
      } else {
         var1.d(90);
      }

      if (VDTT_eq.a().b(12) == 0) {
         if (this.e(0)) {
            DataCenter.o();
            VDTT_aa.b(var1, var3, this.K, this.S.objX - 15, this.S.objY - 15, 30, 30);
         }
      } else if (VDTT_eq.a().b(12) == 1 || this.ab) {
         VDTT_aa.b(var1, var2, this.K, this.W.objX, this.W.objY, this.W.q, this.W.r);
         DataCenter.o();
         VDTT_aa.b(var1, var3, this.K, this.S.objX - 15, this.S.objY - 15, 30, 30);
      }

      var1.l = 1.0F;
   }
}
