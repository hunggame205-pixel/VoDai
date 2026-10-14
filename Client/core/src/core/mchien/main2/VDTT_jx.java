package core.mchien.main2;

import java.util.Vector;

public final class VDTT_jx extends VDTT_ar {
   public Item[] a;
   public VDTT_ht[] b;
   private VDTT_ba R;
   private VDTT_ba S;
   public int c = 0;
   public VDTT_hi d;
   public VDTT_bf N;
   public VDTT_bf O;
   public Item P;
   public boolean Q;
   private String T = "";
   private int U;
   private int V = 60;

   public VDTT_jx(VDTT_p var1, Item var2) {
      this.I = var1;
      this.e = 2;
      this.a(240, 180);
      this.a = new Item[1];
      this.a[0] = var2;
      this.b = new VDTT_ht[2];
      this.b[0] = new VDTT_ht((byte)1, 14, this.f() - 5, 30, 30, 30, 1, 1);
      this.b[1] = new VDTT_ht((byte)1, 104, this.f() - 5, 30, 30, 30, 1, 1);
      this.R = this.a(this.q - 70, this.r - 29, Caption.tK, this, 300, -8);
      this.S = this.a(this.q - 70, this.r - 29, Caption.tN, this, 301, -8);
      VDTT_hp var3 = new VDTT_hp(1003, new String[]{""});
      this.N = this.a(44, this.f() + 35, 180, var3.c.length, var3, this, 0);
      this.N.b(true);
      this.N.a(0);
      this.O = this.a(44, this.f() + 57, 180, var3.c.length, var3, this, 0);
      this.O.b(true);
      this.O.a(0);
      this.w();
   }

   public final void w() {
      if (this.a[0] != null) {
         VDTT_gz[] var1 = this.a[0].L();
         Vector var2;
         (var2 = new Vector()).add(this.a[0].getItemTemplate());

         for(int var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3].a().c == 14) {
               DataCenter.d();
               var2.add(DataCenter.b(var1[var3].a().b));
            }
         }

         Vector var9 = new Vector();
         String[] var7 = new String[var2.size()];
         short[] var4 = new short[var2.size()];

         int var5;
         for(var5 = 0; var5 < var2.size(); ++var5) {
            var7[var5] = ((VDTT_fu)var2.get(var5)).b;
            var4[var5] = ((VDTT_fu)var2.get(var5)).a;
            DataCenter.d();
            VDTT_fu var6;
            if ((var6 = DataCenter.b(var7[var5])) != null && (var6.c.trim().length() == 0 || !var6.c.equals("Cải trang không có kỹ năng"))) {
               var9.add(var6);
            }
         }

         if ((var5 = var7.length) > 5) {
            var5 = 5;
         }

         VDTT_hp var10 = new VDTT_hp(1003, var4, var7);
         this.N.P = true;
         this.N.a(var10, var5);
         this.N.a(0);
         this.N.b(false);
         if (var9.size() != 0) {
            var7 = new String[var9.size()];
            var4 = new short[var9.size()];

            for(int var8 = 0; var8 < var9.size(); ++var8) {
               var7[var8] = Caption.vr + ((VDTT_fu)var9.get(var8)).b;
               var4[var8] = ((VDTT_fu)var9.get(var8)).a;
            }

            if ((var5 = var7.length) > 5) {
               var5 = 5;
            }

            var10 = new VDTT_hp(1003, var4, var7);
            this.O.P = true;
            this.O.a(var10, var5);
            this.O.a(0);
            this.O.b(false);
            return;
         }

         this.O.b(true);
      } else {
         this.O.b(true);
         this.N.b(true);
      }

   }

   public final void a_() {
      if (VDTT_jb.c() > VDTT_cw.v().cX) {
         this.R.b(true);
         this.S.b(false);
      } else {
         this.R.b(false);
         this.S.b(true);
      }

      if (this.a[0] != null) {
         this.N.b(false);
      } else {
         this.N.b(true);
      }

      for(int var1 = 0; var1 < this.b.length; ++var1) {
         this.b[var1].a();
      }

      if (this.d != null) {
         this.d.o();
         if (this.d.p()) {
            this.d = null;
         }
      }

      if (this.c > 0) {
         --this.c;
      }

   }

   public final void b(Graphics var1) {
      this.e(var1);
      if (this.Q && (this.c > 0 && DataCenter.d().h % 12 > 6 || this.c == 0)) {
         VDTT_dg.b(VDTT_dg.d, var1, Caption.qZ, this.b[0].objX, this.N.objY, 0, -2560, -16777216);
      }

      if (this.a[0] != null) {
         VDTT_dg.b(VDTT_dg.d, var1, Caption.bI, this.b[0].objX - 5, this.N.objY + 9, 0, -10831436, -16777216);
         VDTT_dg.b(VDTT_dg.d, var1, Caption.vq, this.b[0].objX - 5, this.O.objY + 9, 0, -10831436, -16777216);
         int var2 = VDTT_jb.c();
         if (VDTT_cw.v().cX > var2) {
            VDTT_dg.b(VDTT_dg.d, var1, Caption.tP + VDTT_jb.e((long)VDTT_cw.v().cX * 1000L), this.N.objX, this.N.objY + 52, 0, -2560, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, Caption.tQ, this.N.objX, this.N.objY + 66, 0, -30976, -16777216);
            if (VDTT_cw.v().cY > var2) {
               VDTT_dg.b(VDTT_dg.d, var1, Caption.tR + VDTT_jb.f(VDTT_cw.v().cY - var2), this.N.objX, this.N.objY + 80, 0, -30976, -16777216);
            }
         } else {
            VDTT_dg.b(VDTT_dg.d, var1, VDTT_jb.b(Caption.tL, VDTT_jb.c(this.V)), this.N.objX, this.N.objY + 52, 0, -30976, -16777216);
            VDTT_dg.b(VDTT_dg.d, var1, Caption.tM, this.N.objX, this.N.objY + 66, 0, -30976, -16777216);
         }

         try {
            if (this.P == null || !this.T.equals(this.a[0].strOptions)) {
               this.T = this.a[0].strOptions;
               this.P = this.a[0].a();
               String var7 = this.N.N[this.N.n.b].toLowerCase();
               Vector var3 = new Vector();
               VDTT_gz[] var4 = this.P.L();

               int var5;
               for(var5 = 0; var5 < var4.length; ++var5) {
                  if (!var4[var5].a().b.toLowerCase().equals(var7)) {
                     var3.add(var4[var5]);
                  }
               }

               for(var5 = 0; var5 < DataCenter.d().P.length; ++var5) {
                  if (DataCenter.d().P[var5].b.toLowerCase().equals(this.P.getItemTemplate().b.toLowerCase())) {
                     var3.add(new VDTT_gz(DataCenter.d().P[var5].a + ",0,0"));
                  }
               }

               for(var5 = 0; var5 < DataCenter.d().O.length; ++var5) {
                  if (DataCenter.d().O[var5].b.toLowerCase().equals(var7)) {
                     this.P.c = DataCenter.d().O[var5].a;
                     break;
                  }
               }

               this.P.strOptions = Item.a(var3);
            }
         } catch (Exception var6) {
         }
      } else if (!this.Q) {
         this.P = null;
      }

      VDTT_dc.a(var1, 95, 0, 65 - DataCenter.d().h / 3 % 3, this.f(), 20);
      a(var1, this.b[0].objX, this.b[0].objY, this.a[0], this.b[0].k >= 0, Caption.bb);
      a(var1, this.b[1].objX, this.b[1].objY, this.P, this.b[1].k >= 0, Caption.qt);
      if (this.d != null) {
         this.d.b(var1, this.b[1].objX + this.b[1].h / 2, this.b[1].objY + this.b[1].h / 2);
      }

   }

   public final Vector g() {
      Vector var1 = super.g();

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         var1.addElement(this.b[var2].a(1001 + var2, this));
      }

      var1.addElement(new VDTT_hl(0, 0, 0, this.q, this.r, this.J, this));
      return var1;
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 300:
         this.a(false);
         return;
      case 301:
         DataCenter.d().ai.a(VDTT_jb.b(Caption.tO, "" + this.V), 2002, this);
         return;
      case 1001:
         this.U = 1;
         this.a(var1.j, var1.j.k);
         this.k = a(var1, this, this.a[0]);
         if (this.a[0] == null) {
            boolean var7 = true;
            if (this.Q) {
               this.Q = false;
               this.P = null;
            }

            DataCenter.d().ai.c(Caption.po, -1);
            return;
         }
         break;
      case 1002:
         this.U = 10;
         this.a(var1.j, var1.j.k);

         try {
            Message var6;
            (var6 = Message.c((byte)13)).a(this.a[0].w);
            var6.b(this.a[0].f);
            var6.b((int)this.N.d());
            var6.b((int)this.O.d());
            var6.l();
            return;
         } catch (Exception var4) {
            return;
         }
      case 2001:
         this.a(false);
         return;
      case 2002:
         try {
            Message.c((byte)-24).l();
            return;
         } catch (Exception var5) {
         }
      }

   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
      if (var1 == 1003) {
         this.P = null;
      }

   }

   private void a(VDTT_hs var1, int var2) {
      for(int var3 = 0; var3 < this.b.length; ++var3) {
         this.b[var3].k = -1;
      }

      var1.k = var2;
   }

   private void a(boolean var1) {
      try {
         if (this.Q) {
            this.c = 50;
         } else if (this.P == null) {
            DataCenter.d().ai.c(Caption.po, -65536);
         } else {
            Message var3;
            (var3 = Message.c((byte)14)).a(this.a[0].w);
            var3.b(this.a[0].f);
            var3.b((int)this.N.d());
            var3.b((int)this.O.d());
            var3.l();
         }
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public final void b(int var1, Object var2) {
   }
}
