package core.mchien.main2;

import java.util.Vector;

public abstract class MainScreen extends VDTT_z {
   public byte e;
   public Vector f = new Vector();
   public VDTT_z g;
   public VDTT_z h;
   public VDTT_z i;
   public VDTT_hs j;
   public VDTT_an k;
   public VDTT_ik l;
   public static boolean m;
   public int n;

   public static String a(Vector var0, String var1) {
      if (!VDTT_cw.v().l(var1)) {
         var0.addElement(new VDTT_iu(4001, Caption.N));
      }

      var0.addElement(new VDTT_iu(4002, Caption.J));
      var0.addElement(new VDTT_iu(4003, Caption.cT));
      var0.addElement(new VDTT_iu(4004, Caption.dR));
      return var1;
   }

   public final void a(Vector var1, String var2, int var3, int var4, int var5) {
      if (var1.size() > 0) {
         String[] var6 = new String[var1.size()];
         short[] var7 = new short[var1.size()];
         String[] var8 = new String[var1.size()];

         for(int var9 = 0; var9 < var1.size(); ++var9) {
            VDTT_iu var10 = (VDTT_iu)var1.elementAt(var9);
            var6[var9] = var10.b;
            var8[var9] = var10.c;
            var7[var9] = (short)var10.a;
         }

         this.k = a(this, var4 + 25, var5, new VDTT_hp(var3, var7, var6, var2));
      }

   }

   public final void a(String var1, int var2, int var3, int var4) {
      Vector var5 = new Vector();
      if (!VDTT_cw.v().l(var1)) {
         var5.addElement(new VDTT_iu(4001, Caption.N));
      }

      var5.addElement(new VDTT_iu(4002, Caption.J));
      var5.addElement(new VDTT_iu(4003, Caption.cT));
      var5.addElement(new VDTT_iu(4004, Caption.dR));
      this.a(var5, var1, var2, var3, var4);
   }

   public final void a(int var1, int var2, int var3) {
      short var4 = this.objX;
      short var5 = this.objY;
      this.f(var2, var3);
      switch(var1) {
      case 0:
      case 1:
         this.l = new VDTT_ik(this, (byte)0, this.objX);
         this.objX = var4;
         return;
      case 2:
      case 3:
         this.l = new VDTT_ik(this, (byte)1, this.objY);
         this.objY = var5;
      default:
      }
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this.f(var2, var3);
      switch(var1) {
      case 0:
         this.l = new VDTT_ik(this, (byte)0, var2 + var4, var2);
         this.objX = (short)(-DataCenter.d().n);
         break;
      case 1:
         this.l = new VDTT_ik(this, (byte)0, var2 - var4, var2);
         this.objX = (short)DataCenter.d().n;
         break;
      case 2:
         this.l = new VDTT_ik(this, (byte)1, var3 + var4, var3);
         this.objY = (short)(-DataCenter.d().o);
         break;
      case 3:
         this.l = new VDTT_ik(this, (byte)1, var3 - var4, var3);
         this.objY = (short)DataCenter.d().o;
      }

      this.l.b = 100;
   }

   public final void b(int var1) {
      switch((byte)VDTT_jb.a((int)4)) {
      case 0:
         this.l = new VDTT_ik(this, (byte)0, this.objX);
         this.objX = 1000;
         break;
      case 1:
         this.l = new VDTT_ik(this, (byte)0, this.objX);
         this.objX = -1000;
         break;
      case 2:
         this.l = new VDTT_ik(this, (byte)1, this.objY);
         this.objY = 1000;
         break;
      case 3:
         this.l = new VDTT_ik(this, (byte)1, this.objY);
         this.objY = -1000;
      }

      this.l.b = 100;
   }

   public final void d(int var1, int var2) {
      super.d(var1, var2);
   }

   public final boolean a(char paramChar) {
    try {
      for (byte b = 0; b < this.f.size(); b++) {
        try {
          VDTT_m vDTT_m;
          if ((vDTT_m = (VDTT_m)this.f.elementAt(b)).b && vDTT_m instanceof VDTT_ca) {
            vDTT_m.o.a(paramChar);
            return true;
          } 
        } catch (Exception exception) {}
      } 
    } catch (Exception exception) {}
    return false;
  }

   public final boolean c(int paramInt) {
    try {
      for (byte b = 0; b < this.f.size(); b++) {
        try {
          VDTT_m vDTT_m;
          if ((vDTT_m = (VDTT_m)this.f.elementAt(b)).b && vDTT_m instanceof VDTT_ca) {
            vDTT_m.o.a(paramInt);
            return true;
          } 
        } catch (Exception exception) {}
      } 
    } catch (Exception exception) {}
    return false;
  }
  
  public final boolean d(int paramInt) {
    try {
      for (byte b = 0; b < this.f.size(); b++) {
        try {
          VDTT_m vDTT_m;
          if ((vDTT_m = (VDTT_m)this.f.elementAt(b)).b && vDTT_m instanceof VDTT_ca) {
            vDTT_m.o.b(paramInt);
            return true;
          } 
        } catch (Exception exception) {}
      } 
    } catch (Exception exception) {}
    return false;
  }

   public final void l() {
      try {
         for(int var1 = 0; var1 < this.f.size(); ++var1) {
            try {
               ((VDTT_m)this.f.elementAt(var1)).s();
            } catch (Exception var2) {
            }
         }

         this.s();
      } catch (Exception var3) {
      }
   }

   public final void m() {
      try {
         this.d();

         for(int var1 = 0; var1 < this.f.size(); ++var1) {
            try {
               ((VDTT_m)this.f.elementAt(var1)).a_();
            } catch (Exception var2) {
            }
         }

         this.a_();
      } catch (Exception var3) {
      }
   }

   private void d() {
      if (this.l != null) {
         if (this.l.a()) {
            this.l = null;
            return;
         }

         if (this.l.a && this.l.a()) {
            this.l = null;
         }
      }

   }

   protected final boolean n() {
      return this.l != null && this.l.b();
   }

   public final void o() {
      try {
         for(int var2 = 0; var2 < this.f.size(); ++var2) {
            try {
               VDTT_m var1;
               (var1 = (VDTT_m)this.f.elementAt(var2)).c();
               var1.o.a();
            } catch (Exception var3) {
            }
         }

         this.c();
         this.o.a();
      } catch (Exception var4) {
      }
   }

   public final void c(Graphics var1) {
      this.d(var1);
      if (!m) {
         try {
            for(int var3 = 0; var3 < this.f.size(); ++var3) {
               VDTT_m var2;
               if ((var2 = (VDTT_m)this.f.elementAt(var3)).e == null && !(var2.a instanceof VDTT_x)) {
                  var2.d(var1);
               }
            }

         } catch (Exception var4) {
            VDTT_jb.a(var4);
         }
      }
   }

   public static VDTT_bg a(int var0, int var1, int var2, MainScreen var3, int var4) {
      VDTT_hp var6;
      (var6 = new VDTT_hp(var4)).c = Caption.yr;
      var6.d = new short[9];

      for(int var5 = 0; var5 < var6.d.length; ++var5) {
         var6.d[var5] = (short)(873 + var5);
         switch(var5) {
         case 0:
            var6.d[var5] = 873;
            break;
         case 1:
            var6.d[var5] = 874;
            break;
         case 2:
            var6.d[var5] = 876;
            break;
         case 3:
            var6.d[var5] = 877;
            break;
         case 4:
            var6.d[var5] = 878;
            break;
         case 5:
            var6.d[var5] = 879;
            break;
         case 6:
            var6.d[var5] = 881;
            break;
         case 7:
            var6.d[var5] = 875;
         }
      }

      return new VDTT_bg(var0, var1, 100, 20, var2, var6, var3, true);
   }

   public final VDTT_ba a(int var1, int var2, String var3, MainScreen var4, int var5, int var6) {
      VDTT_ba var7 = new VDTT_ba(var1, var2, 0, 0, var3, var4, var5, var6);
      this.a(var7);
      return var7;
   }

   public final VDTT_bb a(int var1, int var2, String var3, MainScreen var4, int var5, int var6, int var7) {
      VDTT_bb var8 = new VDTT_bb(var1, var2, 0, 0, var3, var4, 1011, 20, 19);
      this.a(var8);
      return var8;
   }

   public final VDTT_ca a(int var1, int var2, int var3, String var4, MainScreen var5, int var6, int var7) {
      VDTT_ca var8 = new VDTT_ca(var1, var2, var3, var4, var5, var6, var7);
      this.a(var8);
      return var8;
   }

   public final VDTT_ca a(int var1, int var2, int var3, String var4, MainScreen var5, int var6) {
      VDTT_ca var7 = new VDTT_ca(var1, var2, var3, var4, var5, -11, var6);
      this.a(var7);
      return var7;
   }

   public final VDTT_by b(int var1, int var2, int var3, String var4, MainScreen var5, int var6) {
      VDTT_by var7 = new VDTT_by(var1, var2, var3, var4, var5, -11, var6);
      this.a(var7);
      return var7;
   }

   public final VDTT_bd a(int var1, int var2, String var3, MainScreen var4, int var5) {
      VDTT_bd var6 = new VDTT_bd(var1, var2, var3, var4, var5);
      this.a(var6);
      return var6;
   }

   public final VDTT_bu a(int var1, int var2, String var3, MainScreen var4, VDTT_ho var5) {
      VDTT_bu var6 = new VDTT_bu(var1, var2, var3, var4, var5);
      this.a(var6);
      return var6;
   }

   public final VDTT_bf a(int var1, int var2, int var3, int var4, VDTT_hp var5, MainScreen var6, int var7) {
      VDTT_bf var8 = new VDTT_bf(var1, var2, var3, var4, var5, var6, var7, true);
      this.a(var8);
      return var8;
   }

   public final void p() {
      if (this.h != null) {
         ((VDTT_bf)this.h).h();
         this.h = null;
      }

   }

   public final void a(VDTT_m var1) {
      if (var1 != null && !this.f.contains(var1)) {
         for(int var2 = 0; var2 < this.f.size(); ++var2) {
            if (this.f.get(var2) instanceof VDTT_an && !(this.f.get(var2) instanceof VDTT_bp)) {
               this.f.remove(var2);
               break;
            }
         }

         this.f.addElement(var1);
      }
   }

   public final void b(VDTT_m var1) {
      if (var1 != null) {
         this.f.removeElement(var1);
         if (this.k != null && var1.equals(this.k)) {
            this.k = null;
         }

      }
   }

   public final void c(VDTT_m var1) {
      if (var1 != null) {
         this.f.removeElement(var1);
         this.f.addElement(var1);
         var1.b = true;
         if (var1.e != null) {
            var1.e.c(var1);
            var1 = var1.e.a();
            this.f.removeElement(var1);
            this.f.addElement(var1);
         }

      }
   }

   public final void q() {
      VDTT_m var1 = null;

      label29:
      for(int var2 = 0; var2 < this.f.size(); ++var2) {
         if ((var1 = (VDTT_m)this.f.elementAt(var2)).b) {
            var1.b = false;
            b(this.f);
            var2 = this.f.indexOf(var1);

            do {
               ++var2;
               if (var2 >= this.f.size()) {
                  var2 = 0;
               }

               if (this.f.elementAt(var2).equals(var1)) {
                  var1 = null;
                  break label29;
               }
            } while(!(this.f.elementAt(var2) instanceof VDTT_ca));

            var1 = (VDTT_m)this.f.elementAt(var2);
            break;
         }
      }

      this.c(var1);
   }

   private static void b(Vector var0) {
      try {
         for(int var4 = 0; var4 < var0.size() - 1; ++var4) {
            VDTT_m var1 = (VDTT_m)var0.elementAt(var4);

            for(int var5 = var4 + 1; var5 < var0.size(); ++var5) {
               VDTT_m var2;
               VDTT_m var3;
               if ((var2 = (VDTT_m)var0.elementAt(var5)).objY < var1.objY) {
                  var3 = var2;
                  var2 = var1;
                  var1 = var3;
                  var0.setElementAt(var3, var4);
                  var0.setElementAt(var2, var5);
               } else if (var2.objY == var1.objY && var2.objX < var1.objX) {
                  var3 = var2;
                  var2 = var1;
                  var1 = var3;
                  var0.setElementAt(var3, var4);
                  var0.setElementAt(var2, var5);
               }
            }
         }

      } catch (Exception var6) {
      }
   }

   public abstract void a(int var1, Object var2, VDTT_z var3);

   public abstract void a(int var1, Object var2);

   public abstract void perform(int var1, Object var2, VDTT_z var3);

   public abstract void b(int var1, Object var2);
}
