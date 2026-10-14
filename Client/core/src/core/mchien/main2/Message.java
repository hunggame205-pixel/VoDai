package core.mchien.main2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;

public final class Message implements Cloneable {
   public byte a;
   public VDTT_de b = null;
   private VDTT_df c = null;

   public static Message a(byte var0)throws IOException {
      Message var1;
      (var1 = new Message((byte)-125)).a((int)var0);
      return var1;
   }

   public static Message b(byte var0)throws IOException {
      Message var1;
      (var1 = new Message((byte)-124)).a((int)-128);
      return var1;
   }

   public static Message c(byte var0)throws IOException {
      Message var1;
      (var1 = new Message((byte)-123)).a((int)var0);
      return var1;
   }

   public static Message d(byte var0)throws IOException {
      Message var1;
      (var1 = new Message((byte)-122)).a((int)var0);
      return var1;
   }

   public static Message e(byte var0)throws IOException {
      Message var1;
      (var1 = new Message((byte)-111)).a((int)4);
      return var1;
   }

   public Message(byte var1) {
      this.a = var1;
      this.c = new VDTT_df();
   }

   public Message(byte var1, byte[] var2) {
      this.a = var1;
      this.b = new VDTT_de(var2);
   }

   public final byte[] a() {
      byte[] var10;
      try {
         if (this.c == null) {
            return null;
         }

         this.c.b.flush();
         byte[] var1 = this.c.a.toByteArray();
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         int var3 = var1.length;
         if (var1.length > 99) {
            Deflater var4;
            (var4 = new Deflater()).setLevel(9);
            var4.setInput(var1);
            var4.finish();
            var2.write(var1, 0, 4);
            byte[] var5 = new byte[1024];

            while(!var4.finished()) {
               var2.write(var5, 0, var4.deflate(var5));
            }

            var4.end();
            if ((var10 = var2.toByteArray()).length > 32767) {
               var3 = var10.length - 4;
               var2.reset();
               var2.write(new byte[]{-128, this.a});
               var2.write(var10);
               (var10 = var2.toByteArray())[2] = (byte)(var3 >> 24 & 255);
               var10[3] = (byte)(var3 >> 16 & 255);
               var10[4] = (byte)(var3 >> 8 & 255);
               var10[5] = (byte)(var3 & 255);
            } else if (var10.length >= var1.length) {
               var2.reset();
               var2.write(new byte[]{this.a, (byte)(var3 >> 8), (byte)var3});
               var2.write(var1);
               var10 = var2.toByteArray();
            } else {
               var3 = var10.length - 4;
               var10[0] = -80;
               var10[1] = this.a;
               var10[2] = (byte)(var3 >> 8 & 255);
               var10[3] = (byte)(var3 & 255);
            }
         } else {
            var2.write(new byte[]{this.a, (byte)(var3 >> 8), (byte)var3});
            var2.write(var1);
            var10 = var2.toByteArray();
         }

         var2.close();
         var10 = var10;
      } catch (Exception var8) {
         VDTT_jb.a(var8);
         return null;
      } finally {
         this.b();
      }

      return var10;
   }

   public final void b() {
      if (this.b != null) {
         this.b.d();
      }

      if (this.c != null) {
         this.c.a();
      }

   }

   public final boolean c()throws IOException{
      return this.b.a.readBoolean();
   }

   public final byte readByte()throws IOException {
      return this.b.a.readByte();
   }

   public final byte[] e()throws IOException {
      return this.b.b();
   }

   public final short f()throws IOException {
      return this.b.a.readShort();
   }

   public final int g()throws IOException {
      return this.b.a.readUnsignedShort();
   }

   public final long h()throws IOException {
      return this.b.a.readLong();
   }

   public final int i()throws IOException {
      return this.b.a.readInt();
   }

   public final String j()throws IOException {
      return this.b.c();
   }

   public final void a(boolean var1)throws IOException {
      this.c.a(var1);
   }

   public final void a(int var1)throws IOException {
      this.c.a(var1);
   }

   public final void a(byte[] var1)throws IOException {
      VDTT_df var10000 = this.c;
      byte[] var2 = var1;
      VDTT_df var3 = var10000;
      var10000.b.writeInt(var2.length);
      var3.b.write(var2);
   }

   public final void b(int var1)throws IOException {
      this.c.b(var1);
   }

   public final void c(int var1)throws IOException {
      this.c.c(var1);
   }

   public final void a(long var1)throws IOException {
      this.c.a(var1);
   }

   public final void a(String var1)throws IOException {
      this.c.a(var1);
   }

   public final void k() {
      try {
         VDTT_dn.d();
         DataCenter.d().f();
         int var1 = 20;

         while(var1 > 0 && !VDTT_dn.a().c()) {
            --var1;
            VDTT_jb.a(500L);
         }

         if (var1 == 0) {
            VDTT_dn.a().b();
            this.b();
            return;
         }
      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }

      VDTT_dn.a().a(this);
      this.b();
   }

   public final void l() {
      if (VDTT_dn.a().c()) {
         VDTT_dn.a().a(this);
      }

      this.b();
   }
}
