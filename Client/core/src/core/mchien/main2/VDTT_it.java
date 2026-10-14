package core.mchien.main2;

import java.util.Vector;

public final class VDTT_it {
   public VDTT_n a;
   public Vector b = new Vector();
   public boolean c;
   public int d;

   public final boolean a(VDTT_ek var1) {
      return this.b.size() > 0 && ((VDTT_el)this.b.firstElement()).a.equals(var1.aD);
   }

   public final boolean a() {
      return this.b.size() > 0 && ((VDTT_el)this.b.firstElement()).a.equals(VDTT_ek.m().aD);
   }

   public final VDTT_el b() {
      return this.b.size() > 0 ? (VDTT_el)this.b.firstElement() : null;
   }

   public final boolean a(String var1) {
      if (this.b.size() > 0) {
         for(int var3 = 0; var3 < this.b.size(); ++var3) {
            if (((VDTT_el)this.b.elementAt(var3)).a.equals(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   public final boolean b(String var1) {
      for(int var2 = 0; var2 < this.b.size(); ++var2) {
         if (((VDTT_el)this.b.elementAt(var2)).a.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public final boolean c() {
      return this.b.size() == 0;
   }

   public final boolean d() {
      return this.d >= 6;
   }
}
