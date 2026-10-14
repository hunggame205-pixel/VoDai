package core.mchien.main2;

import java.io.IOException;

public final class VDTT_fa {
   public int a;
   public String b = "";
   public String c = "";
   public String d = "";
   public Item e;
   public int f;
   public int g;
   public int h;
   public int i;
   public long j;
   public boolean k;
   public int l;

   public final void a(Message var1)throws IOException{
      this.a = var1.f();
      this.k = var1.c();
      this.b = var1.b.c();
      this.c = var1.b.c();
      this.d = var1.b.c();
      this.f = var1.i();
      this.g = var1.i();
      this.h = var1.i();
      this.i = var1.i();
      this.j = var1.h();
      this.l = var1.i();
      if (this.h > 0 && this.j == (long)this.h) {
         this.j = 0L;
      }

      Item var2;
      (var2 = new Item()).a(var1);
      if (var2.c >= 0) {
         this.e = var2;
      }

   }

   private long b() {
      if (this.f > 0) {
         return (long)this.f;
      } else if (this.g > 0) {
         return (long)this.g;
      } else if (this.h > 0) {
         return (long)this.h;
      } else if (this.i > 0) {
         return (long)this.i;
      } else {
         return this.j > 0L ? this.j : 0L;
      }
   }

   public final boolean a() {
      return this.e != null || this.b() > 0L;
   }
}
