package core.mchien.main2;

import java.util.Comparator;

public final class VDTT_gz {
   public static final Comparator a = new VDTT_ha();
   public int[] b;

   public VDTT_gz(String var1) {
      String[] var3 = VDTT_jb.a(var1, ",");
      this.b = new int[var3.length];

      for(int var2 = 0; var2 < var3.length; ++var2) {
         this.b[var2] = Integer.parseInt(var3[var2]);
      }

   }

   public final VDTT_hb a() {
      return DataCenter.d().P[this.b[0]];
   }

   public final String[] b() {
      if (this.a().a != 344 && this.a().a != 369 && this.a().a != 375 && this.a().a != 267 && this.a().a != 343 && this.a().a != 368 && this.a().a != 412) {
         return null;
      } else {
         String var1 = "" + (float)this.b[1] / 10.0F;
         if (this.b[1] % 10 == 0) {
            var1 = "" + this.b[1] / 10;
         }

         String var2 = "" + (float)this.f() / 10.0F;
         if (this.f() % 10 == 0) {
            var2 = "" + this.f() / 10;
         }

         return new String[]{var1, var2};
      }
   }

   public final String a(int var1) {
      if (this.b[0] == 310) {
         return VDTT_jb.b(DataCenter.d().P[this.b[0]].b, DataCenter.d().Q[this.b[1]].b);
      } else if (this.a().c == 54) {
         return VDTT_jb.b(DataCenter.d().P[this.b[0]].b, VDTT_jb.j(this.b[1]));
      } else if (this.a().c == 52) {
         String var5 = VDTT_jb.b(DataCenter.d().P[this.b[0]].b, "" + this.b[1]);

         for(int var3 = 0; var3 < DataCenter.d().Q.length; ++var3) {
            if (DataCenter.d().Q[var3].e == var1 && DataCenter.d().Q[var3].d == this.a().d) {
               String var4 = DataCenter.d().Q[var3].b;
               return var5.replaceAll("@", var4);
            }
         }

         return null;
      } else if (this.a().a == 98) {
         return VDTT_jb.b(DataCenter.d().P[this.b[0]].b, "" + (float)this.b[1] / 100.0F);
      } else {
         String[] var2;
         return (var2 = this.b()) != null ? VDTT_jb.b(DataCenter.d().P[this.b[0]].b, var2[0]) : VDTT_jb.b(DataCenter.d().P[this.b[0]].b, "" + this.b[1]);
      }
   }

   public final String c() {
      if (this.b[1] == -1) {
         return Caption.wR;
      } else {
         return this.f() == -1 ? VDTT_jb.b(DataCenter.d().P[this.b[0]].b, DataCenter.d().Q[this.b[1]].b + Caption.wS) : VDTT_jb.b(DataCenter.d().P[this.b[0]].b, DataCenter.d().Q[this.b[1]].b + Caption.io + this.f());
      }
   }

   public final String d() {
      String[] var1;
      if ((var1 = this.b()) != null) {
         return this.b[1] >= 0 && this.f() >= 0 && this.b[1] != this.f() && this.b[0] == 412 ? VDTT_jb.b(DataCenter.d().P[this.b[0]].b, "(" + var1[0] + "-" + var1[1] + ")") : VDTT_jb.b(DataCenter.d().P[this.b[0]].b, var1[0]);
      } else if (this.b[0] == 481) {
         String var10000 = DataCenter.d().P[this.b[0]].b;
         DataCenter.d();
         return VDTT_jb.b(var10000, DataCenter.c(this.b[1]));
      } else if (this.b[0] == 464) {
         short var3 = 50;
         if (this.f() == 469) {
            var3 = 600;
         }

         int var4 = (this.b[1] + var3) / (var3 * 4);
         return VDTT_jb.b(VDTT_jb.a(DataCenter.d().P[this.b[0]].b, (long)var4), (long)(var4 + 1));
      } else if (this.b[0] >= 465 && this.b[0] <= 468) {
         return VDTT_jb.b(DataCenter.d().P[this.b[0]].b, VDTT_jb.b(DataCenter.d().P[this.f()].b, VDTT_jb.c(this.b[1])));
      } else if (this.b[0] == 436 && this.b[1] > 0) {
         return VDTT_jb.b(DataCenter.d().P[this.b[0]].b, DataCenter.d().O[this.b[1]].b.replaceAll(Caption.bb, "").trim());
      } else if (this.b[0] == 427 && this.b[1] > 0) {
         return Caption.xk + " " + DataCenter.d().O[this.b[1]].b;
      } else if (this.a().c == 55) {
         return VDTT_jb.b(DataCenter.d().P[this.b[0]].b, DataCenter.d().Q[this.b[1]].b);
      } else if (this.b[1] >= 0 && this.f() >= 0 && this.b[1] != this.f()) {
         return VDTT_jb.b(DataCenter.d().P[this.b[0]].b, "(" + this.b[1] + "-" + this.f() + ")");
      } else if (this.b[1] >= 0) {
         return VDTT_jb.b(DataCenter.d().P[this.b[0]].b, "" + this.b[1]);
      } else {
         return this.f() >= 0 ? VDTT_jb.b(DataCenter.d().P[this.b[0]].b, "" + this.f()) : "";
      }
   }

   public final String e() {
      return this.b[0] == 349 ? VDTT_jb.b(DataCenter.d().P[this.b[0]].b, "") : VDTT_jb.b(DataCenter.d().P[this.b[0]].b, VDTT_jb.c(this.b[1])).replaceAll("@", VDTT_jb.c(this.f()));
   }

   public final String b(int var1) {
      var1 = var1;
      if (this.b.length > 3) {
         var1 += this.b[3];
      }

      if ((var1 = this.b[1] + var1 / 10) > this.f()) {
         var1 = this.f();
      }

      return VDTT_jb.b(DataCenter.d().P[this.b[0]].b, "" + var1).replaceAll("@", "" + this.f());
   }

   public final int c(int var1) {
      return this.b[1] = var1;
   }

   public final int d(int var1) {
      int[] var10000 = this.b;
      return var10000[1] += var1;
   }

   public final int e(int var1) {
      return this.b[2] = var1;
   }

   public final int f() {
      return this.b.length < 3 ? -1 : this.b[2];
   }

   public final String g() {
      String var1 = "";

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         var1 = var1 + this.b[var2];
         if (var2 < this.b.length - 1) {
            var1 = var1 + ",";
         }
      }

      return var1;
   }

   public final boolean a(boolean var1) {
      try {
         return this.b[3] >= (var1 ? 17 : 16);
      } catch (Exception var2) {
         return false;
      }
   }

   public static int f(int var0) {
      switch(var0) {
      case 406:
         return 199;
      case 407:
         return 200;
      case 408:
         return 201;
      case 409:
         return 202;
      case 410:
         return 203;
      case 411:
         return 204;
      case 412:
         return 205;
      case 413:
         return 206;
      default:
         return -1;
      }
   }

   public final int h() {
      switch(this.a().c) {
      case 3:
         return 793;
      case 4:
         return 795;
      case 5:
         return 797;
      case 6:
         return 798;
      case 7:
      case 8:
      case 9:
      case 10:
      case 13:
      case 14:
      case 15:
      case 16:
      case 18:
      default:
         switch(this.b[0]) {
         case 199:
            return 406;
         case 200:
            return 407;
         case 201:
            return 408;
         case 202:
            return 409;
         case 203:
            return 410;
         case 204:
            return 411;
         case 205:
            return 412;
         case 206:
            return 413;
         default:
            return -1;
         }
      case 11:
         return 794;
      case 12:
         return 796;
      case 17:
         return 791;
      case 19:
         return 792;
      }
   }

   public final int i() {
      try {
         return this.b[3];
      } catch (Exception var1) {
         return 0;
      }
   }

   public static VDTT_gz g(int var0) {
      return new VDTT_gz(f(var0) + ",0,-1,0");
   }

   public final boolean j() {
      return this.a().c == 19 || this.a().c == 3 || this.a().c == 11 || this.a().c == 4 || this.a().c == 12 || this.a().c == 5 || this.a().c == 6 || this.a().c == 7 || this.a().c == 10;
   }

   public final boolean k() {
      return this.a().a == 349 || this.a().a == 350 || this.a().a == 298;
   }

   public final boolean l() {
      return this.a().c == 8;
   }

   public final boolean m() {
      return this.a().c == 2 || this.a().c == 50 || this.n();
   }

   public final boolean n() {
      return this.a().c == 7;
   }
}
