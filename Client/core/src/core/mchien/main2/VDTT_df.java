package core.mchien.main2;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class VDTT_df {
   public ByteArrayOutputStream a = null;
   public DataOutputStream b = null;

   public VDTT_df(DataOutputStream var1) {
      this.b = var1;
   }

   public VDTT_df() {
      this.a = new ByteArrayOutputStream();
      this.b = new DataOutputStream(this.a);
   }

   public final void a(boolean var1)throws IOException {
      this.b.writeBoolean(var1);
   }

   public final void a(int var1)throws IOException {
      this.b.writeByte(var1);
   }

   public final void a(byte[] var1)throws IOException {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.b.writeByte(var1[var2]);
      }

   }

   public final void b(int var1)throws IOException {
      this.b.writeShort(var1);
   }

   public final void c(int var1)throws IOException {
      this.b.writeInt(var1);
   }

   public final void a(long var1)throws IOException {
      this.b.writeLong(var1);
   }

   public final void a(String var1)throws IOException {
      if (var1.length() > 0 && var1.length() <= 255) {
         this.b.writeByte(var1.length());

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            int var2;
            if ((var2 = VDTT_dg.j.indexOf(var1.charAt(var3))) < 0) {
               var2 = 0;
            }

            this.b.writeByte(var2);
         }

      } else {
         this.b.writeByte(0);
         this.b.writeUTF(var1);
      }
   }

   public final void a() {
      try {
         if (this.b != null) {
            this.b.close();
         }

         if (this.a != null) {
            this.a.close();
         }

      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public final void b(String var1) {
      try {
         VDTT_da.a(var1, this.a.toByteArray());
         if (this.b != null) {
            this.b.close();
            this.b = null;
         }

         if (this.a != null) {
            this.a.close();
            this.a = null;
         }

      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }
}
