package core.mchien.main2;

import java.util.Vector;

public final class VDTT_nk extends VDTT_ar {
   public Vector a = new Vector();
   private VDTT_iq b;
   private VDTT_hs c;
   private int d;
   private long N;
   private String O;
   private int P;

   public VDTT_nk(VDTT_p var1, Message var2) {
      try {
         this.I = var1;
         this.a(316, 213);
         this.K = false;
         this.N = VDTT_jb.a();
         this.d = var2.i();
         this.O = var2.j();
         byte var6 = var2.readByte();

         for(int var3 = 0; var3 < var6; ++var3) {
            VDTT_gc var4;
            (var4 = new VDTT_gc()).a = var2.j();
            var4.b = var2.j();
            var4.e = var2.readByte();
            this.a.add(var4);
         }

         this.b = new VDTT_iq(new VDTT_hp(1001, new String[]{this.O}), this);
         this.c = new VDTT_hs((byte)1, 4, this.b.i() + 28, super.q - 8, 108, 18, this.a.size());
         boolean var7 = false;
         this.b.a(0);
      } catch (Exception var5) {
      }
   }

   public final void a_() {
      this.b.e();
      this.c.a();
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      VDTT_nk var8;
      VDTT_hp var11;
      VDTT_gc var12;
      String var13;
      switch(var1) {
      case 1002:
         return;
      case 2002:
         var11 = (VDTT_hp)var2;
         var8 = this;

         try {
            var12 = (VDTT_gc)var8.a.get(var11.a);
            var13 = "";
            if (var8.P >= 70 && var8.P <= 150) {
               var13 = var12.a;
            } else if (var8.P >= 180 && var8.P <= 260) {
               var13 = var12.b;
            }

            VDTT_cw.v().i(var13);
            break;
         } catch (Exception var6) {
            return;
         }
      case 2003:
         var11 = (VDTT_hp)var2;
         var8 = this;

         try {
            var12 = (VDTT_gc)var8.a.get(var11.a);
            var13 = "";
            if (var8.P >= 70 && var8.P <= 150) {
               var13 = var12.a;
            } else if (var8.P >= 180 && var8.P <= 260) {
               var13 = var12.b;
            }

            VDTT_cw.v();
            VDTT_cw.h(var13);
            break;
         } catch (Exception var5) {
            return;
         }
      case 2004:
         var11 = (VDTT_hp)var2;
         var8 = this;

         try {
            var12 = (VDTT_gc)var8.a.get(var11.a);
            var13 = "";
            if (var8.P >= 70 && var8.P <= 150) {
               var13 = var12.a;
            } else if (var8.P >= 180 && var8.P <= 260) {
               var13 = var12.b;
            }

            VDTT_bc.K = var13;
            VDTT_ke var9 = new VDTT_ke(VDTT_cw.v(), 5);
            VDTT_cw.v().a((String)var13, (VDTT_kd)var9);
            break;
         } catch (Exception var4) {
            return;
         }
      case 2005:
         var1 = ((VDTT_hp)var2).a;

         try {
            if (var1 == VDTT_cw.v().al) {
               return;
            }

            VDTT_cw.d = true;
            Message var10;
            (var10 = new Message((byte)-7)).a(var1);
            var10.l();
            return;
         } catch (Exception var7) {
            VDTT_jb.a(var7);
         }
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.b.f());
      var1.addElement(this.c.a(1003, this));
      return var1;
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.cK, (byte)2, this.K);
      this.b.a(var1);
      this.b(var1, this.c);
      this.a(var1, 8, -24, this.c.q - 16, 21, -11, 55, 56);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.lo, 40, -15, 2, -10831436, -16777216);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.kD, 110, -15, 2, -10831436, -16777216);
      VDTT_dg.b(VDTT_dg.e, var1, Caption.kD, 210, -15, 2, -10831436, -16777216);
      this.a(var1, this.c);

      int var2;
      for(var2 = 0; var2 < this.c.i; ++var2) {
         if (this.c.b(var2)) {
            VDTT_gc var3 = (VDTT_gc)this.a.get(var2);
            if (var2 == this.c.k) {
               VDTT_dc.a(var1, 3, var2 * this.c.h, this.c.q - 6, this.c.h);
            }

            VDTT_dg.b(VDTT_dg.d, var1, "" + (var2 + 1), 40, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, var3.a, 110, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, var3.b, 210, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            if (var3.e == 1) {
               VDTT_dg.b(VDTT_dg.d, var1, Caption.lp, 160, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            } else if (var3.e == 2) {
               VDTT_dg.b(VDTT_dg.d, var1, Caption.lq, 160, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            } else {
               VDTT_dg.b(VDTT_dg.d, var1, "VS", 160, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            }
         }
      }

      this.a(var1);
      var2 = this.d - (int)((VDTT_jb.a() - this.N) / 1000L);
      VDTT_dg.b(VDTT_dg.d, var1, Caption.lr + this.O + Caption.ls + VDTT_jb.g(var2), this.q / 2, this.r - 18, 2, -1, -16777216);
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         return;
      case 1003:
         if (var1.j.k >= 0) {
            int var4 = var3;
            var3 = var2;
            var2 = var1.j.k;
            this.P = var3;
            if (var3 >= 70 && var3 <= 150 || var3 >= 180 && var3 <= 260) {
               Vector var5;
               (var5 = new Vector()).addElement(new VDTT_iu(2002, Caption.cR));
               var5.addElement(new VDTT_iu(2003, Caption.cS));
               var5.addElement(new VDTT_iu(2004, Caption.cT));
               var5.addElement(new VDTT_iu(2005, Caption.pM));
               if (var5.size() > 0) {
                  String[] var6 = new String[var5.size()];
                  short[] var7 = new short[var5.size()];

                  for(int var8 = 0; var8 < var5.size(); ++var8) {
                     VDTT_iu var9 = (VDTT_iu)var5.elementAt(var8);
                     var6[var8] = var9.b;
                     var7[var8] = (short)var9.a;
                  }

                  this.k = a(this, var3 + 25, var4, new VDTT_hp(var2, var7, var6));
               }
            }
         }
      default:
      }
   }
}
