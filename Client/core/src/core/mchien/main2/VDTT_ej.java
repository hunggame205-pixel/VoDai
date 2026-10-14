package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ej {
   public Vector a = new Vector();
   public boolean b;

   public final void a(VDTT_em var1) {
      this.b = true;
      if (this.a.size() > 100) {
         this.a.remove(0);
      }

      this.a.addElement(var1);
   }
}
