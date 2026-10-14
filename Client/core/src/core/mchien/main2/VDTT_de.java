package core.mchien.main2;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class VDTT_de {
   public DataInputStream a = null;

   public VDTT_de(DataInputStream var1) {
      this.a = var1;
   }

   public VDTT_de(InputStream var1) {
      this.a = new DataInputStream(var1);
   }

   public VDTT_de(byte[] var1) {
      this.a = new DataInputStream(new ByteArrayInputStream(var1));
   }

   public final short a()throws IOException{
      return (short)this.a.readUnsignedByte();
   }

   public final byte[] a(byte[] var1, int var2, int var3)throws IOException {
      this.a.read(var1, var2, var3);
      return var1;
   }

   public final byte[] b()throws IOException {
      byte[] var1 = new byte[this.a.readInt()];
      this.a.read(var1);
      return var1;
   }

   public final String c()throws IOException {
      short var1;
      if ((var1 = (short)this.a.readUnsignedByte()) == 0) {
         return this.a.readUTF();
      } else {
         String var2 = "";

         for(int var3 = 0; var3 < var1; ++var3) {
            var2 = var2 + VDTT_dg.j.charAt(this.a.readUnsignedByte());
         }

         return var2;
      }
   }

   public final void d() {
      try {
         if (this.a != null) {
            this.a.close();
         }

      } catch (Exception var1) {
      }
   }
}
