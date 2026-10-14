package core.mchien.main2;

import java.util.Vector;

public final class VDTT_md extends VDTT_ka {
   private VDTT_ht[] S;
   private VDTT_ba T;
   public int O = 0;
   public VDTT_hi P;
   public Item Q;
   public boolean R;

   public VDTT_md(VDTT_p var1) {
      super(var1, new String[]{Caption.rD, Caption.P});
      this.ab = new Item[1];
      this.S = new VDTT_ht[2];
      this.S[0] = new VDTT_ht((byte)1, 14, this.f() + 20, 30, 30, 30, 1, 1);
      this.S[1] = new VDTT_ht((byte)1, 104, this.f() + 20, 30, 30, 30, 1, 1);
      this.T = this.a(this.q - 70, this.r - 33, Caption.rF, this, 300, -8);
      this.a(this.T, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].getItemTemplate().f == 12 && var1[var2].h != -1L) {
            this.ak.add(var1[var2]);
         }
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         if (this.ab[0] != null) {
            if (this.Q == null) {
               this.Q = this.ab[0].b();
               this.Q.h = VDTT_jb.a() + 1864000000L;
            }
         } else if (!this.R) {
            this.Q = null;
         }

         for(int var1 = 0; var1 < this.S.length; ++var1) {
            this.S[var1].a();
         }
      } else {
         this.B();
      }

      if (this.P != null) {
         this.P.o();
         if (this.P.p()) {
            this.P = null;
         }
      }

      if (this.O > 0) {
         --this.O;
      }

   }

   public final void b(Graphics var1) {
      if (this.w() <= 0) {
         this.a(var1, this.objX, this.objY, this.q, this.r, Caption.y, (byte)2, this.K);
      } else {
         super.b(var1);
      }

      if (super.a.b == 0) {
         VDTT_dg.b(VDTT_dg.d, var1, Caption.rE, 14, this.f() + 11, 0, -10831436, -16777216);
         if (!this.R) {
            if (this.Q != null) {
               short var2 = 550;
               if (this.Q.c == 125) {
                  var2 = 650;
               } else if (this.Q.c == 126) {
                  var2 = 750;
               }

               long var3;
               if ((var3 = this.ab[0].h) < VDTT_jb.a()) {
                  var3 = VDTT_jb.a();
               }

               int var7;
               if ((var7 = (int)((VDTT_jb.a() + 864000000L - var3) / (long)(864000000 / var2))) <= 0) {
                  var7 = 1;
               }

               if (var7 > var2) {
                  var7 = var2;
               }

               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.bv, VDTT_jb.c(200000)), this.S[0].objX, this.S[0].objY + 60, 0, -1, -16777216);
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.rH, VDTT_jb.c(var7)), this.S[0].objX, this.S[0].objY + 75, 0, -1, -16777216);
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.rJ, VDTT_jb.c(VDTT_ek.m().f(160))), this.S[0].objX, this.S[0].objY + 90, 0, -1, -16777216);
            }
         } else if (this.O > 0 && DataCenter.d().h % 12 > 6 || this.O == 0) {
            VDTT_dg.b(VDTT_dg.d, var1, Caption.rI, this.S[0].objX, this.S[0].objY + 50, 0, -2560, -16777216);
         }

         VDTT_dc.a(var1, 95, 0, 65 - DataCenter.d().h / 3 % 3, this.f() + 25, 20);
         a(var1, this.S[0].objX, this.S[0].objY, this.ab[0], this.S[0].k >= 0, Caption.pI);
         a(var1, this.S[1].objX, this.S[1].objY, this.Q, this.S[1].k >= 0, Caption.qt);
         if (this.P != null) {
            this.P.b(var1, this.S[1].objX + this.S[1].h / 2, this.S[1].objY + this.S[1].h / 2);
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.S.length; ++var2) {
            var1.addElement(this.S[var2].a(1001 + var2, this));
         }
      }

      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         this.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 300:
            this.a(false);
            return;
         case 1001:
            this.ad = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.ab[0]);
            if (this.ab[0] == null) {
               this.f(2);
               DataCenter.d().ai.c(Caption.rE, -1);
               return;
            }
            break;
         case 1002:
            this.ad = 10;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.Q);
            return;
         case 2001:
            this.a(false);
         }
      }

   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      try {
         super.perform(var1, var2, var3);
         if (var1 == 200) {
            this.Q = null;
         }

      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }
   }

   private void a(VDTT_hs var1, int var2) {
      for(int var3 = 0; var3 < this.S.length; ++var3) {
         this.S[var3].k = -1;
      }

      var1.k = var2;
   }

   private void a(boolean var1) {
      try {
         if (this.R) {
            this.O = 50;
         } else if (this.Q == null) {
            DataCenter.d().ai.c(Caption.rE, -65536);
         } else {
            Message var3;
            (var3 = Message.c((byte)-41)).a(this.ab[0].w);
            var3.b(this.ab[0].f);
            var3.l();
         }
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public final void f(int var1) {
      super.f(var1);
      if (this.R) {
         this.R = false;
         this.Q = null;
      }

   }
}
