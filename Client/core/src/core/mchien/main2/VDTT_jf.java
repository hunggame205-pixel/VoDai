package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public final class VDTT_jf extends VDTT_ar {
   public VDTT_ba[] a;
   private VDTT_hs[] c;
   private int d;
   private VDTT_hs N;
   private Vector O;
   private int P;
   private VDTT_ca Q;
   private VDTT_ba R;
   private boolean S;
   public static final Comparator b = new VDTT_jg();
   private int T = 0;

   public VDTT_jf(Vector var1, VDTT_p var2, int var3, String var4) {
      this.I = var2;
      this.d = 1014;
      this.K = false;
      this.a(220, 200);
      this.O = var1;
      Collections.sort(this.O, b);
      if (Gdx.app.getType() != ApplicationType.Desktop) {
         this.N = new VDTT_hs((byte)1, 10, this.f() + 5, this.q - 18, 156, 26, var1.size());
      } else {
         this.N = new VDTT_hs((byte)1, 10, this.f() + 31, this.q - 18, 130, 26, var1.size());
         this.Q = this.a(10, this.f() + 5, this.q - 58, Caption.vW, this, 0);
         byte var6 = 32;
         this.Q.T = var6;
         this.Q.a(var4);
         this.R = this.a(4 + (super.q - 8) - 39, this.f() + 6, Caption.km, this, 1003, -8);
         this.R.d(35, this.R.r);
      }

      this.a = new VDTT_ba[this.O.size()];
      this.c = new VDTT_hs[this.O.size()];

      for(int var5 = 0; var5 < this.a.length; ++var5) {
         this.a[var5] = new VDTT_ba(this.q - 40, var5 * this.N.h + 4, 0, 0, "", this, 3000 + var5, -27);
         this.c[var5] = new VDTT_hx((byte)1, this.a[var5].objX, this.a[var5].objY, this.a[var5].q, this.a[var5].r, this.a[var5].r, 1, this.N);
      }

   }

   public final void d() {
      super.d();
      if (this.S) {
         this.I.a(1014, this.O.get(this.d), this);
      }

   }

   public final Vector g() {
      Vector var1 = super.g();

      for(int var4 = 0; var4 < this.a.length; ++var4) {
         int var2 = this.N.objX + this.a[var4].objX;
         int var3 = this.N.objY + this.a[var4].objY - this.N.f;
         if (VDTT_jb.a(this.N.objX, this.N.objY, this.N.objX + this.N.q, this.N.objY + this.N.r, var2, var3) && VDTT_jb.a(this.N.objX, this.N.objY, this.N.objX + this.N.q, this.N.objY + this.N.r, var2 + this.a[var4].q, var3 + this.a[var4].r)) {
            this.c[var4].objX = (short)var2;
            this.c[var4].objY = (short)var3;
            var1.addElement(new VDTT_hl(3000 + var4, this.c[var4].objX, this.c[var4].objY, this.c[var4].objX + this.c[var4].q, this.c[var4].objY + this.c[var4].r, this.c[var4], this));
         }
      }

      var1.addElement(this.N.a(1002, this));
      return var1;
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.pU, (byte)2, this.K);
      this.a(var1, this.N);
      int var2 = var1.e;
      int var3 = var1.f;

      for(int var4 = 0; var4 < this.N.i; ++var4) {
         if (this.N.b(var4)) {
            try {
               String[] var5 = (String[])this.O.elementAt(var4);
               this.a(var1, 0, var4 * this.N.h + 1, this.N.q, 24, 46, 22, 23, 1, 1);
               if (this.N.k == var4) {
                  var1.d(30);
                  var1.f(-11184811);
                  var1.c(0, var4 * this.N.h + 1, this.N.q - 1, 23);
                  var1.l = 1.0F;
                  var1.d(50);
                  var1.f(-1);
                  var1.b(0, var4 * this.N.h + 1, this.N.q - 1, 23);
                  var1.l = 1.0F;
               }

               int var6 = 8;
               int var7 = var4 * this.N.h + 12;
               if (var4 == this.N.l) {
                  ++var6;
                  ++var7;
               }

               String[] var8;
               if (!(var8 = VDTT_dg.b(VDTT_dg.d, var5[0], this.N.q - 60))[0].equals(var5[0])) {
                  VDTT_dg.a(VDTT_dg.d, var1, var8[0] + "...", var6, var7, 0, -1);
               } else {
                  VDTT_dg.a(VDTT_dg.d, var1, var8[0], var6, var7, 0, -1);
               }

               this.a(var1, var2 + this.a[var4].objX, var3 + this.a[var4].objY);
               this.a[var4].b(var1);
               this.a(var1, var2, var3);
            } catch (Exception var9) {
            }
         }
      }

      this.a(var1);
      this.N.b(var1, this);
   }

   public final void a_() {
      this.N.a();
      if (this.P > 0) {
         --this.P;
         if (this.P == 0) {
            this.k();
            if (this.d == -1) {
               this.I.a(1014, (Object)null, this);
            } else {
               this.I.a(1014, this.O.get(this.d), this);
            }
         }
      }

      int var1;
      if ((var1 = this.Q.i().length()) != this.T) {
         this.w();
      }

      this.T = var1;

      for(var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1].a_();
         this.a[var1].a_();
         if (this.c[var1].l != -1) {
            this.a[var1].N = true;
         } else {
            this.a[var1].N = false;
         }
      }

   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (this.P <= 0) {
         super.a(var1, var2, var3);
         if (var1.b >= 3000 & var1.b < 4000) {
            this.d = var1.b - 3000;
            String[] var12 = (String[])this.O.get(this.d);
            this.O.remove(var1.b - 3000);
            VDTT_jf var11 = this;
            VDTT_df var13 = null;
            boolean var8 = false;

            label137: {
               label136: {
                  try {
                     var8 = true;
                     (var13 = new VDTT_df()).b(var11.O.size());

                     for(int var4 = 0; var4 < var11.O.size(); ++var4) {
                        String[] var5 = (String[])var11.O.elementAt(var4);
                        var13.a(VDTT_jb.d(var5[0]));
                        var13.a(VDTT_jb.d(var5[1]));
                     }

                     var13.b("arr_acc");
                     var8 = false;
                     break label136;
                  } catch (Exception var9) {
                     VDTT_jb.a(var9);
                     var8 = false;
                  } finally {
                     if (var8) {
                        if (var13 != null) {
                           var13.a();
                        }

                     }
                  }

                  if (var13 != null) {
                     var13.a();
                  }
                  break label137;
               }

               var13.a();
            }

            this.S = false;
            if (this.O.size() == 0) {
               this.P = 4;
               this.d = -1;
            } else {
               if (((VDTT_cq)this.I).J.i().equals(var12[0])) {
                  this.S = true;
                  --this.d;
                  if (this.d < 0) {
                     this.d = 0;
                  }
               }

            }
         } else {
            switch(var1.b) {
            case 1002:
               if (var1.j.k >= 0) {
                  this.P = 4;
                  this.d = var1.j.k;
                  this.S = false;
               }
            case 1003:
               this.w();
            default:
            }
         }
      }
   }

   private void w() {
      String var1 = this.Q.i().trim().toLowerCase();
      int var2 = this.N.k;
      boolean var3 = false;
      ++var2;

      while(var2 < this.O.size()) {
         if (((String[])this.O.get(var2))[0].toLowerCase().contains(var1)) {
            this.N.k = var2;
            this.N.a(var2);
            var3 = true;
            break;
         }

         ++var2;
      }

      if (!var3) {
         for(var2 = 0; var2 < this.O.size(); ++var2) {
            if (((String[])this.O.get(var2))[0].toLowerCase().contains(var1)) {
               this.N.k = var2;
               this.N.a(var2);
               return;
            }
         }
      }

   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }
}
