package core.mchien.main2;

import java.util.Vector;

public class VDTT_ka extends VDTT_jr {
   private int O = 32;
   private VDTT_ht[][] P;
   protected VDTT_iq U;
   public int V;

   public VDTT_ka(VDTT_p var1, String[] var2) {
      super(var1, var2);
      VDTT_hp var3;
      (var3 = new VDTT_hp(500)).c = Caption.Am;
      this.U = new VDTT_iq(var3, this);
      this.P = new VDTT_ht[Caption.yu.length][];
      this.P[0] = new VDTT_ht[2];
      this.P[0][0] = new VDTT_ht((byte)1, 49, this.f() + 40, this.O, this.O * 5, this.O, 5, 1);
      this.P[0][1] = new VDTT_ht((byte)1, 221, this.f() + 40, this.O, this.O * 5, this.O, 5, 1);
      this.P[1] = new VDTT_ht[1];
      this.P[1][0] = new VDTT_ht((byte)1, 70, this.f() + 40 + this.O * 4, this.O * 5, this.O, this.O, this.O, 1, 5);
      if (DataCenter.l()) {
         this.N[1] = true;
      }

   }

   public void a_() {
      super.a_();
   }

   public void b(Graphics var1) {
      try {
         super.b(var1);
         if (super.a.b == 1) {
            this.U.a(var1);
            this.U.a(var1, this.objX, this.objY);
            Graphics var2;
            VDTT_ek var3;
            VDTT_ka var10;
            switch(this.U.h()) {
            case 0:
               var2 = var1;
               var10 = this;

               try {
                  var3 = VDTT_ek.m();
                  Item var4 = null;

                  int var5;
                  String var12;
                  for(var5 = 0; var5 < var10.P[var10.U.h()][0].i; ++var5) {
                     var12 = Caption.yh[var5];
                     switch(var5) {
                     case 0:
                        var4 = var3.aR[2];
                        break;
                     case 1:
                        if (var3.av == 4) {
                           var12 = Caption.yh[5];
                        }

                        var4 = var3.aR[4];
                        break;
                     case 2:
                        var4 = var3.aR[6];
                        break;
                     case 3:
                        var4 = var3.aR[8];
                        break;
                     case 4:
                        var4 = var3.aR[14];
                     }

                     short var11 = var10.P[var10.U.h()][0].objX;
                     a(var2, var11, var10.P[var10.U.h()][0].objY + var5 * var10.P[var10.U.h()][0].h, var4, var5 == var10.P[var10.U.h()][0].k, var12);
                     if (!var10.al && !var10.ak.contains(var4)) {
                        VDTT_aa.a(var2, -23, 0, var11 + 1, var10.P[var10.U.h()][0].objY + var5 * var10.P[var10.U.h()][0].h + 1, 27, (int)27);
                     }
                  }

                  for(var5 = 0; var5 < var10.P[var10.U.h()][1].i; ++var5) {
                     var12 = Caption.yh[var5];
                     switch(var5) {
                     case 0:
                        var4 = var3.aS[2];
                        break;
                     case 1:
                        if (var3.av == 4) {
                           var12 = Caption.yh[5];
                        }

                        var4 = var3.aS[4];
                        break;
                     case 2:
                        var4 = var3.aS[6];
                        break;
                     case 3:
                        var4 = var3.aS[8];
                        break;
                     case 4:
                        var4 = var3.aS[14];
                     }

                     a(var2, var10.P[var10.U.h()][1].objX, var10.P[var10.U.h()][1].objY + var5 * var10.P[var10.U.h()][1].h, var4, var5 == var10.P[var10.U.h()][1].k, var12);
                     if (!var10.al && !var10.ak.contains(var4)) {
                        VDTT_aa.a(var2, -23, 0, var10.P[var10.U.h()][1].objX + 1, var10.P[var10.U.h()][1].objY + var5 * var10.P[var10.U.h()][1].h + 1, 27, (int)27);
                     }
                  }

                  VDTT_ek.m().a(var2, var10.q / 2, 170, var3.a(var3.aR), DataCenter.d().h / 4 % 6, var3.L, false, false);
                  VDTT_ek.m().b(var2, var10.q / 2, 115);
                  break;
               } catch (Exception var8) {
                  VDTT_jb.a(var8);
                  return;
               }
            case 1:
               var2 = var1;
               var10 = this;
               var3 = VDTT_ek.m();
               Item var6 = null;

               for(int var7 = 0; var7 < var10.P[var10.U.h()][0].P; ++var7) {
                  switch(var7) {
                  case 0:
                     var6 = var3.aR[0];
                     break;
                  case 1:
                     var6 = var3.aR[3];
                     break;
                  case 2:
                     var6 = var3.aR[7];
                     break;
                  case 3:
                     var6 = var3.aR[5];
                     break;
                  case 4:
                     var6 = var3.aR[9];
                  }

                  a(var2, var10.P[var10.U.h()][0].objX + var7 * var10.P[var10.U.h()][0].h, var10.P[var10.U.h()][0].objY, var6, var7 == var10.P[var10.U.h()][0].k, Caption.BQ[var7]);
                  if (!var10.al && !var10.ak.contains(var6)) {
                     VDTT_aa.a(var2, -23, 0, var10.P[var10.U.h()][0].objX + var7 * var10.P[var10.U.h()][0].h + 1, var10.P[var10.U.h()][0].objY + 1, 27, (int)27);
                  }
               }
            }
         }

      } catch (Exception var9) {
         VDTT_jb.a(var9);
      }
   }

   public Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 1) {
         var1.addElement(this.U.f());
         int var2;
         switch(this.U.h()) {
         case 0:
            if (this.P[this.U.h()] != null) {
               for(var2 = 0; var2 < this.P[this.U.h()].length; ++var2) {
                  if (this.P[this.U.h()][var2] != null) {
                     var1.addElement(this.P[this.U.h()][var2].a(1010 + var2, this));
                  }
               }
            }
         case 1:
            if (this.P[this.U.h()] != null) {
               for(var2 = 0; var2 < this.P[this.U.h()].length; ++var2) {
                  if (this.P[this.U.h()][var2] != null) {
                     var1.addElement(this.P[this.U.h()][var2].a(1020 + var2, this));
                  }
               }
            }
         }
      }

      return var1;
   }

   public void a(VDTT_hl var1, int var2, int var3) {
      try {
         super.a(var1, var2, var3);
         if (super.a.b == 1) {
            Item var5 = null;
            switch(var1.b) {
            case 500:
               if (var1.j.k >= 0) {
                  this.U.a(var1.j.k);
               }
               break;
            case 1010:
               this.V = 0;
               this.a(var1.j, var1.j.k);
               switch(var1.j.k) {
               case 0:
                  var5 = VDTT_ek.m().aR[2];
                  break;
               case 1:
                  var5 = VDTT_ek.m().aR[4];
                  break;
               case 2:
                  var5 = VDTT_ek.m().aR[6];
                  break;
               case 3:
                  var5 = VDTT_ek.m().aR[8];
                  break;
               case 4:
                  var5 = VDTT_ek.m().aR[14];
               }

               if (!this.al && !this.ak.contains(var5)) {
                  break;
               }

               this.k = a(var1, this, var5);
               return;
            case 1011:
               this.V = 1;
               this.a(var1.j, var1.j.k);
               switch(var1.j.k) {
               case 0:
                  var5 = VDTT_ek.m().aS[2];
                  break;
               case 1:
                  var5 = VDTT_ek.m().aS[4];
                  break;
               case 2:
                  var5 = VDTT_ek.m().aS[6];
                  break;
               case 3:
                  var5 = VDTT_ek.m().aS[8];
                  break;
               case 4:
                  var5 = VDTT_ek.m().aS[14];
               }

               if (!this.al && !this.ak.contains(var5)) {
                  break;
               }

               this.k = a(var1, this, var5);
               return;
            case 1020:
               this.V = 3;
               this.a(var1.j, var1.j.k);
               switch(var1.j.k) {
               case 0:
                  var5 = VDTT_ek.m().aR[0];
                  break;
               case 1:
                  var5 = VDTT_ek.m().aR[3];
                  break;
               case 2:
                  var5 = VDTT_ek.m().aR[7];
                  break;
               case 3:
                  var5 = VDTT_ek.m().aR[5];
                  break;
               case 4:
                  var5 = VDTT_ek.m().aR[9];
               }

               if (this.al || this.ak.contains(var5)) {
                  this.k = a(var1, this, var5);
                  return;
               }
            }
         }

      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }
   }

   private void a(VDTT_hs var1, int var2) {
      for(int var3 = 0; var3 < this.P.length; ++var3) {
         if (this.P[var3] != null) {
            for(int var4 = 0; var4 < this.P[var3].length; ++var4) {
               if (this.P[var3][var4] != null) {
                  this.P[var3][var4].k = -1;
               }
            }
         }
      }

      var1.k = var2;
   }

   public final Item[] a(Item var1) {
      Item[] var2 = VDTT_ek.m().aP;
      if (super.a.b == 1) {
         if (this.U.h() == 0 && this.V != 0) {
            var2 = VDTT_ek.m().aS;
            var1.w = 3;
         } else {
            var2 = VDTT_ek.m().aR;
            var1.w = 2;
         }

         for(int var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null) {
               var2[var3].f = var1.getItemTemplate().f;
            }
         }
      } else if (super.a.b == this.w()) {
         var1.w = 0;
      }

      return var2;
   }

   public final int z() {
      return super.a.b == 1 ? 0 : super.z();
   }
}
