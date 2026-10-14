package core.mchien.main2;

import java.util.Vector;

public final class VDTT_ir {
   public int a;
   public String b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public String h;
   public String i;
   public String j;
   public int k;
   public int l;
   public int m;
   public int n;
   public String o;
   public Vector p = new Vector();

   public final Item a() {
      try {
         if (this.o != null && this.o.length() > 0) {
            String[] var1 = this.o.split("@");
            Item var2;
            (var2 = new Item()).c = Short.parseShort(var1[0]);
            var2.t = Boolean.parseBoolean(var1[1]);
            var2.h = Long.parseLong(var1[2]);
            var2.c(Integer.parseInt(var1[3]));
            var2.g = Byte.parseByte(var1[4]);
            var2.s = Byte.parseByte(var1[5]);
            if (var1.length > 6) {
               var2.strOptions = var1[6];
               if (var2.getItemTemplate().e != 2 && var2.getItemTemplate().e != VDTT_ek.m().au) {
                  for(int var3 = 0; var3 < DataCenter.d().O.length; ++var3) {
                     VDTT_fu var5;
                     if ((var5 = DataCenter.d().O[var3]).e == VDTT_ek.m().au && var5.f == var2.getItemTemplate().f && var5.i == var2.getItemTemplate().i) {
                        var2.c = var5.a;
                        break;
                     }
                  }
               }

               if (var2.getItemTemplate().f == 13) {
                  var2.g = VDTT_ek.m().aw;
                  switch(var2.g) {
                  case 1:
                     var2.strOptions = "54,0,500;62,0,500";
                     break;
                  case 2:
                     var2.strOptions = "55,0,500;58,0,500";
                     break;
                  case 3:
                     var2.strOptions = "56,0,500;59,0,500";
                     break;
                  case 4:
                     var2.strOptions = "57,0,500;60,0,500";
                     break;
                  case 5:
                     var2.strOptions = "53,0,500;61,0,500";
                  }
               }
            }

            return var2;
         }
      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }

      return null;
   }

   public final boolean b() {
      return VDTT_cw.v().bs >= this.p.size();
   }
}
