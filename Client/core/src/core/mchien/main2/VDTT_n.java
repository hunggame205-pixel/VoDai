package core.mchien.main2;

import java.util.Comparator;
import java.util.Vector;

public abstract class VDTT_n extends VDTT_ae {
   public int a = 10;
   public int b;
   public short c;
   public byte d;
   public byte e;
   public byte f;
   public boolean g;
   public boolean h;
   public Vector i = new Vector();
   public static final Comparator j = new VDTT_o();

   public abstract int a();

   public abstract int b();

   public abstract int c();

   public abstract int d();

   public abstract void a(Graphics var1);

   public abstract void b(Graphics var1);

   public abstract int e();

   public abstract String f();

   public abstract String g();

   public final boolean h() {
      return this.e == 4 || this.e == 5 || this.e == 8 || this.e == 6;
   }

   public void a(XYEntity var1) {
      if (var1 != null) {
         if (this.objX < var1.objX) {
            this.d = 2;
         } else {
            this.d = 3;
         }
      }
   }

   public void i() {
      if (this.e != 4 && this.e != 5 || this.e != 8 && this.e != 6) {
         this.c = 0;
         this.e = 1;
      }

   }

   public void j() {
   }

   public final int k() {
      return this.a() + (this.b() - this.a()) / 2;
   }

   public final int l() {
      return this.c() + (this.d() - this.c()) / 2;
   }

   public final boolean a(int var1, int var2) {
      VDTT_ek var3;
      if ((var3 = (VDTT_ek)this).aX == null && var3.p() && (!MenuConfig.K().W || VDTT_cw.v().bg == null)) {
         return !VDTT_cw.v().U.a(var1, var2);
      } else {
         return true;
      }
   }
}
