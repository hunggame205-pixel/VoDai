package core.mchien.main2;

import com.badlogic.gdx.files.FileHandle;

public final class mFileHandle {
   public FileHandle a;
   public mFileHandle(){

   }

   public final byte[] a(int var1) {
      return this.a != null && this.a.exists() ? this.a.readBytes() : null;
   }

   public final int a() {
      return this.a != null && this.a.exists() ? (int)this.a.length() : 0;
   }

   public final void a(int var1, byte[] var2, int var3, int var4) {
      try{
         this.a.writeBytes(var2, false);
      }catch (Exception e){
         e.printStackTrace();
      }
   }

   public final void a(byte[] var1, int var2, int var3) {
      try{
         this.a.writeBytes(var1, false);
      }catch (Exception e){
         e.printStackTrace();
      }
   }

   public static mFileHandle a(String var0, boolean var1) {
      try {
         mFileHandle var3;
         (var3 = new mFileHandle()).a = VDTT_jb.i(var0);

//         FileHandle parentDirectory = var3.a.parent();
//         if (!parentDirectory.exists()) {
//            parentDirectory.mkdirs();
//         }
//         if (!var3.a.exists()) {
//            // Nếu chưa tồn tại, tạo file bằng cách ghi nội dung rỗng vào nó
//            var3.a.writeString("", false); // false để ghi đè nếu file đã tồn tại
//         }

         return var3;
      } catch (Exception var2) {
         return null;
      }
   }

   public static mFileHandle b(String var0, boolean var1) {
      try {
         mFileHandle var3;
         (var3 = new mFileHandle()).a = VDTT_jb.h(var0);

//         FileHandle parentDirectory = var3.a.parent();
//         if (!parentDirectory.exists()) {
//            parentDirectory.mkdirs();
//         }
//         if (!var3.a.exists()) {
//            // Nếu chưa tồn tại, tạo file bằng cách ghi nội dung rỗng vào nó
//            var3.a.writeString("", false); // false để ghi đè nếu file đã tồn tại
//         }

         return var3;
      } catch (Exception var2) {
         return null;
      }
   }
}
