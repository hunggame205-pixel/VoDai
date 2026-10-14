package core.mchien.main2;

public final class VDTT_hz {
   public short a;
   public String b;
   public String c;
   public short d;
   public short e;
   public String f = "";
   public String g = "";
   public boolean h;

   public final VDTT_hz a() {
      VDTT_hz var1;
      (var1 = new VDTT_hz()).a = this.a;
      var1.b = this.b;
      var1.c = this.c;
      var1.d = this.d;
      var1.e = this.e;
      var1.f = this.f;
      var1.g = this.g;
      return var1;
   }

   public final String b() {
      String var1 = this.b.trim();
      if (this.f.length() > 0) {
         var1 = var1 + " (" + this.f + ")";
      }

      return var1;
   }

   // $FF: synthetic method
   public final Object clone() {
      return this.a();
   }
}
