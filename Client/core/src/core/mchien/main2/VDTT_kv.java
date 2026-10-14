package core.mchien.main2;

import java.util.Vector;

public final class VDTT_kv extends VDTT_ka {
   public Item[] O = new Item[1];
   public Item[] P = new Item[25];
   private VDTT_ht[] Y = new VDTT_ht[3];
   private VDTT_ba Z;
   public int Q;
   public VDTT_hi R;
   public Item S;
   public boolean T;
   public int W;
   public int[] X = new int[2];

   public VDTT_kv(VDTT_p var1) {
      super(var1, new String[]{Caption.yU[6], Caption.P});
      this.Y[0] = new VDTT_ht((byte)1, 222, this.f() + 20, 30, 30, 30, 1, 1);
      this.Y[1] = new VDTT_ht((byte)1, 242, this.f() + 20, 30, 30, 30, 1, 1);
      this.Y[2] = new VDTT_ht((byte)0, 14, this.f() + 20, 160, 160, 32, 5, 5);
      this.Z = this.a(this.q - 70, this.r - 33, Caption.bF, this, 0, -8);
      this.a(this.Z, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].q()) {
            this.ak.add(var1[var2]);
         }
      }

   }

   public final void f(int var1) {
      super.f(var1);
      if (this.T) {
         this.T = false;
         this.S = null;
      }

   }

   public final void a_() {
      super.a_();
      int var1;
      if (super.a.b == 0) {
         for(var1 = 0; var1 < this.Y.length; ++var1) {
            this.Y[var1].a();
         }
      } else {
         this.B();
      }

      if (this.R != null) {
         this.R.o();
         if (this.R.p()) {
            this.R = null;
         }
      }

      for(var1 = 0; var1 < this.X.length; ++var1) {
         if (this.X[var1] > 0) {
            int var10002 = this.X[var1]--;
         }
      }

   }

   public final void b(Graphics var1) {
      if (this.w() <= 0) {
         this.a(var1, this.objX, this.objY, this.q, this.r, Caption.y, (byte)2, this.K);
      } else {
         super.b(var1);
      }

      if (super.a.b == 0) {
         if (this.X[1] == 0 || this.X[1] % 12 > 5) {
            VDTT_dg.b(VDTT_dg.d, var1, Caption.ph, 14, this.f() + 11, 0, -10831436, -16777216);
         }

         VDTT_dc.a(var1, 95, 0, this.Y[0].objX - 35 - DataCenter.d().h / 3 % 3, this.f() + 25, 20);
         if (this.T) {
            if (this.X[0] == 0 || this.X[0] % 12 > 5) {
               VDTT_dg.b(VDTT_dg.d, var1, Caption.pl, 179, this.f() + 108, 0, -2560, -16777216);
            }
         } else if (this.S != null && this.W > 0 && (this.X[0] == 0 || this.X[0] % 12 > 5)) {
            if (VDTT_ek.m().ak < this.W) {
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.pj, VDTT_jb.c(this.W)), 179, this.f() + 108, 0, -65536, -16777216);
            } else {
               VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.pj, VDTT_jb.c(this.W)), 179, this.f() + 108, 0, -3089954, -16777216);
            }
         }

         VDTT_dg.b(VDTT_dg.b, var1, Caption.pm, this.Y[2].objX, this.f() + 185, 0, -6488, -16777216);
         VDTT_dg.b(VDTT_dg.b, var1, Caption.xt, this.Y[2].objX, this.f() + 196, 0, -6488, -16777216);
         a(var1, this.Y[0].objX, this.Y[0].objY, this.S, this.Y[0].k >= 0, Caption.Q);
         this.a(var1, this.Y[2]);

         for(int var2 = 0; var2 < this.Y[2].i; ++var2) {
            for(int var3 = 0; var3 < this.Y[2].P; ++var3) {
               b(var1, var3 * this.Y[2].h, var2 * this.Y[2].h, this.P[var2 * this.Y[2].P + var3], var2 * this.Y[2].i + var3 == this.Y[2].k, "");
            }
         }

         this.a(var1);
         if (this.R != null) {
            this.R.b(var1, this.Y[0].objX + this.Y[0].h / 2, this.Y[0].objY + this.Y[0].h / 2);
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.Y.length; ++var2) {
            if (var2 != 1) {
               var1.addElement(this.Y[var2].a(1001 + var2, this));
            }
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
         case 0:
            this.a(false);
            return;
         case 1001:
            if (this.O[0] == null) {
               this.f(2);
               DataCenter.d().ai.c(Caption.ph, -1);
               return;
            }

            this.Q = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.S);
            return;
         case 1002:
            this.Q = 0;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.O[1]);
            return;
         case 1003:
            try {
               this.Q = 0;
               this.a(var1.j, var1.j.k);
               var2 = var1.j.k / 4;
               var3 = var1.j.k % 4;
               this.k = b(var1, this, this.P[var2 * 4 + var3]);
               return;
            } catch (Exception var5) {
               return;
            }
         case 2001:
            this.a(false);
         }
      }

   }

   private void a(VDTT_hs var1, int var2) {
      for(int var3 = 0; var3 < this.Y.length; ++var3) {
         this.Y[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void d() {
      super.d();

      for(int var1 = 0; var1 < this.P.length; ++var1) {
         if (this.P[var1] != null) {
            VDTT_ek.m().i(this.P[var1].w)[this.P[var1].f] = this.P[var1];
            this.P[var1] = null;
         }
      }

   }

   private void a(boolean var1) {
      try {
         if (!this.T && VDTT_ek.m().ak >= this.W) {
            if (this.O[0] != null && this.W > 0) {
               if (this.S == null) {
                  DataCenter.d().ai.c(Caption.ph, -65536);
               } else {
                  Vector var5 = new Vector();

                  for(int var2 = 0; var2 < this.P.length; ++var2) {
                     if (this.P[var2] != null) {
                        if (this.P[var2].c == this.S.c) {
                           var5.insertElementAt(this.P[var2], 0);
                        } else {
                           var5.add(this.P[var2]);
                        }
                     }
                  }

                  if (var5.size() < 2) {
                     DataCenter.d().ai.c(Caption.ph, -65536);
                  } else {
                     Message var6;
                     (var6 = new Message((byte)-50)).a(var5.size());

                     for(int var3 = 0; var3 < var5.size(); ++var3) {
                        var6.a(((Item)var5.get(var3)).w);
                        var6.b(((Item)var5.get(var3)).f);
                     }

                     var6.l();
                  }
               }
            } else {
               this.X[1] = 50;
            }
         } else {
            this.X[0] = 50;
         }
      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }
   }

   public final void b(Item var1) {
      this.O[0] = var1;
      if (this.O[0] == null) {
         this.S = null;
         this.W = 0;
      } else {
         this.S = this.O[0].a();
         this.S.s = 0;
         Vector var11 = new Vector();
         Vector var2 = new Vector();
         long var4 = -1L;

         for(int var3 = 0; var3 < this.P.length; ++var3) {
            if (this.P[var3] != null) {
               if (this.P[var3].h > var4) {
                  var4 = this.P[var3].h;
               }

               VDTT_gz[] var6;
               if ((var6 = this.P[var3].L()) != null) {
                  int var7;
                  if (!this.P[var3].equals(this.O[0])) {
                     for(var7 = 0; var7 < DataCenter.d().P.length; ++var7) {
                        if (DataCenter.d().P[var7].b.trim().toLowerCase().equals(this.P[var3].getItemTemplate().b.trim().toLowerCase())) {
                           var2.add(new VDTT_gz(DataCenter.d().P[var7].a + ",0,0"));
                           break;
                        }
                     }
                  }

                  for(var7 = 0; var7 < var6.length; ++var7) {
                     boolean var8 = true;

                     for(int var9 = 0; var9 < var11.size(); ++var9) {
                        if (((VDTT_gz)var11.get(var9)).b[0] == var6[var7].b[0]) {
                           ((VDTT_gz)var11.get(var9)).c(((VDTT_gz)var11.get(var9)).b[1] + var6[var7].b[1]);
                           var8 = false;
                           break;
                        }
                     }

                     if (var8) {
                        var11.add(var6[var7]);
                     }
                  }
               }
            }
         }

         var11.addAll(var2);
         this.S.strOptions = Item.a(var11);
         this.S.t = true;
         this.S.h = var4;
      }
   }

   public final void C() {
      try {
         Vector var1 = new Vector();

         for(int var2 = 0; var2 < this.P.length; ++var2) {
            if (this.P[var2] != null) {
               if (this.S != null && this.P[var2].c == this.S.c) {
                  var1.insertElementAt(this.P[var2], 0);
               } else {
                  var1.add(this.P[var2]);
               }
            }
         }

         if (var1.size() <= 0) {
            this.S = null;
            this.W = 0;
            return;
         }

         Message var5;
         (var5 = Message.c((byte)-47)).a(var1.size());

         for(int var3 = 0; var3 < var1.size(); ++var3) {
            var5.a(((Item)var1.get(var3)).w);
            var5.b(((Item)var1.get(var3)).f);
         }

         var5.l();
      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }

   }
}
