package core.mchien.main2;

import java.util.Vector;

public final class VDTT_fn {
   public Vector a = new Vector();

   public VDTT_fn(VDTT_fz[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.a.add(var1[var2]);
      }

   }

   public final boolean a(int var1, int var2) {
      for(int var3 = 0; var3 < this.a.size(); ++var3) {
         if (((VDTT_fz)this.a.get(var3)).a(var1, var2)) {
            return true;
         }
      }

      return false;
   }

   public final XYEntity a(XYEntity var1, XYEntity var2) {
      for(int var4 = 0; var4 < this.a.size(); ++var4) {
         XYEntity var3;
         if ((var3 = ((VDTT_fz)this.a.get(var4)).a(var1, var2)) != null) {
            return var3;
         }
      }

      return null;
   }

   public final XYEntity b(int var1, int var2) {
      if (!this.a(var1, var2)) {
         return XYEntity.e(var1, var2);
      } else {
         for(int var3 = 1; var3 < 1000; ++var3) {
            if (!this.a(var1 + var3, var2)) {
               return XYEntity.e(var1 + var3, var2);
            }

            if (!this.a(var1, var2 + var3)) {
               return XYEntity.e(var1, var2 + var3);
            }

            if (!this.a(var1 - var3, var2)) {
               return XYEntity.e(var1 - var3, var2);
            }

            if (!this.a(var1, var2 - var3)) {
               return XYEntity.e(var1, var2 - var3);
            }

            if (!this.a(var1 + var3, var2 + var3)) {
               return XYEntity.e(var1 + var3, var2 + var3);
            }

            if (!this.a(var1 - var3, var2 + var3)) {
               return XYEntity.e(var1 - var3, var2 + var3);
            }

            if (!this.a(var1 + var3, var2 - var3)) {
               return XYEntity.e(var1 + var3, var2 - var3);
            }

            if (!this.a(var1 - var3, var2 - var3)) {
               return XYEntity.e(var1 - var3, var2 - var3);
            }
         }

         return XYEntity.e(var1, var2);
      }
   }

   public static XYEntity c(int paramInt1, int paramInt2) {
    try {
      if (paramInt1 > (VDTT_cw.v()).aj - 17)
        paramInt1 = (VDTT_cw.v()).aj - 17; 
      if (paramInt1 < 16)
        paramInt1 = 16; 
      XYEntity vDTT_ai1;
      XYEntity vDTT_ai2 = XYEntity.e((vDTT_ai1 = XYEntity.e(paramInt1, paramInt2)).objX, (VDTT_cw.v()).ak + 10);
      for (byte b = 0; b < (VDTT_cw.v()).W.size(); b++) {
        XYEntity vDTT_ai;
        if ((((VDTT_fz)(VDTT_cw.v()).W.get(b)).d[0]).objY >= vDTT_ai1.objY && (vDTT_ai = ((VDTT_fz)(VDTT_cw.v()).W.get(b)).a(vDTT_ai1, vDTT_ai2)) != null)
          return vDTT_ai; 
      } 
    } catch (Exception exception) {}
    return null;
  }

   public static XYEntity[] d(int var0, int var1) {
      if (var0 > VDTT_cw.v().aj - 17) {
         var0 = VDTT_cw.v().aj - 17;
      }

      if (var0 < 16) {
         var0 = 16;
      }

      XYEntity var2 = XYEntity.e(var0, var1 - 5);
      XYEntity var4 = XYEntity.e(var0, var1 + VDTT_cw.v().ak);

      for(var1 = 0; var1 < VDTT_cw.v().dP.size(); ++var1) {
         try {
            if (((VDTT_fz)VDTT_cw.v().dP.get(var1)).d[0].objY >= var2.objY && VDTT_jb.a(((VDTT_fz)VDTT_cw.v().dP.get(var1)).d[0], ((VDTT_fz)VDTT_cw.v().dP.get(var1)).d[1], var2, var4) != null) {
               return ((VDTT_fz)VDTT_cw.v().dP.get(var1)).d;
            }
         } catch (Exception var3) {
         }
      }

      return null;
   }

   public static XYEntity[] a(int var0, int var1, int var2, int var3) {
      if (var0 > VDTT_cw.v().aj - 17) {
         var0 = VDTT_cw.v().aj - 17;
      }

      if (var0 < 16) {
         var0 = 16;
      }

      if (var2 > VDTT_cw.v().aj - 17) {
         var2 = VDTT_cw.v().aj - 17;
      }

      if (var2 < 16) {
         var2 = 16;
      }

      XYEntity var6 = XYEntity.e(var0, var1);
      XYEntity var5 = XYEntity.e(var2, var3);

      for(var2 = 0; var2 < VDTT_cw.v().dP.size(); ++var2) {
         try {
            if (((VDTT_fz)VDTT_cw.v().dP.get(var2)).d[0].objY >= var6.objY && VDTT_jb.a(((VDTT_fz)VDTT_cw.v().dP.get(var2)).d[0], ((VDTT_fz)VDTT_cw.v().dP.get(var2)).d[1], var6, var5) != null) {
               return ((VDTT_fz)VDTT_cw.v().dP.get(var2)).d;
            }
         } catch (Exception var4) {
         }
      }

      return null;
   }
}
