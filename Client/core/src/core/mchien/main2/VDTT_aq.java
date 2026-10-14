package core.mchien.main2;

import java.util.Vector;

public abstract class VDTT_aq extends VDTT_ar {
   public VDTT_hp a;
   private VDTT_hs O;
   protected Vector[] b;
   public int c = 5;
   public boolean[] d;
   public boolean[] N;

   public VDTT_aq(VDTT_p var1) {
      this.I = var1;
      this.a(DataCenter.d().n - 20, DataCenter.d().o - 20);
   }

   public final void a(VDTT_hp var1, int var2, int var3, int var4) {
      while((var3 + this.c) * var1.c.length > this.q - 24) {
         var3 -= 2;
      }

      if ((var2 = var1.c.length) > var4) {
         var2 = var4;
      }

      this.a = var1;

      for(var4 = 0; var4 < var1.c.length; ++var4) {
         String[] var10002 = var1.c;
         var10002[var4] = var10002[var4].replaceAll("\n", " ");
      }

      this.O = new VDTT_hs((byte)0, 15, 5, var3 * var2, 23, var3, var1.c.length);
      byte var5 = -2;
      this.O.I = var5;
      this.b = new Vector[var1.c.length];
      this.d = new boolean[var1.c.length];
      this.N = new boolean[var1.c.length];

      for(var4 = 0; var4 < this.b.length; ++var4) {
         this.b[var4] = new Vector();
      }

   }

   public final int w() {
      return this.a.c.length - 1;
   }

   public final void a(VDTT_m var1, int var2) {
      this.b[var2].addElement(var1);
   }

   public void a_() {
      this.O.a();
   }

   private void a(Graphics var1, int var2, int var3, int var4, String var5, boolean var6, int var7) {
      VDTT_aa.a(var1, var4, 0, var2, 3, var3 - this.c, (int)19);
      if (var6) {
         VDTT_dg.a((VDTT_dg)VDTT_dg.f, var1, var5, var2 + (var3 - this.c) / 2 + 1, 12, 2, var7, 0);
      } else {
         VDTT_dg.a((VDTT_dg)VDTT_dg.f, var1, var5, var2 + (var3 - this.c) / 2, 11, 2, var7, 0);
      }
   }

   public void b(Graphics var1) {
      if (this.w() <= 0) {
         this.a(var1, this.objX, this.objY, this.q, this.r, this.a.c[0], (byte)2, this.K);
      } else {
         this.a(var1, this.objX, this.objY, this.q, this.r, "", (byte)20, this.K);
      }

      if (this.w() > 0) {
         this.a(var1, this.O);

         for(int var2 = 0; var2 < this.a.c.length; ++var2) {
            if (!this.N[var2]) {
               if (var2 == this.a.b) {
                  this.a(var1, var2 * this.O.h, this.O.h, 78, this.a.c[var2], var2 == this.O.l, -1);
               } else {
                  this.a(var1, var2 * this.O.h, this.O.h, 76, this.a.c[var2], var2 == this.O.l, -8158590);
               }

               if (this.d[var2]) {
                  VDTT_dc.a(var1, 713, 0, (var2 + 1) * this.O.h - this.c - 4, 2, 0);
               }
            }
         }

         this.a(var1);
      }

   }

   public Vector g() {
      Vector var1;
      (var1 = new Vector()).addElement(this.O.a(-9997, this));
      super.b(var1);
      return var1;
   }

   public void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);

      try {
         switch(var1.b) {
         case -9997:
            if (var1.j.k >= 0 && this.a.b != var1.j.k && !this.N[var1.j.k]) {
               this.f(var1.j.k);
               return;
            }
            break;
         default:
            super.a(var1, var2, var3);
         }

      } catch (Exception var4) {
      }
   }

   public final int x() {
      return this.a.b;
   }

   public void f(int var1) {
      this.a.b = var1;

      for(var1 = 0; var1 < this.b.length; ++var1) {
         for(int var2 = 0; var2 < this.b[var1].size(); ++var2) {
            this.f.removeElement(this.b[var1].elementAt(var2));
         }
      }

      for(var1 = 0; var1 < this.b[this.a.b].size(); ++var1) {
         this.f.addElement(this.b[this.a.b].elementAt(var1));
      }

      for(var1 = 0; var1 < this.f.size(); ++var1) {
         if (this.f.get(var1) instanceof VDTT_an) {
            this.f.remove(var1);
            return;
         }
      }

   }
}
