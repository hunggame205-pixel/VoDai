package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Net.Protocol;
import com.badlogic.gdx.net.Socket;
import com.badlogic.gdx.net.SocketHints;
import java.io.DataOutputStream;
import java.io.InputStream;

public final class VDTT_dt {
   public Socket a;
   InputStream b;

   public VDTT_dt(String var1, int var2) {
      try {
         SocketHints var3;
         (var3 = new SocketHints()).connectTimeout = 20000;
         var3.keepAlive = true;
         this.a = Gdx.net.newClientSocket(Protocol.TCP, var1, var2, var3);
      } catch (Exception var4) {
         VDTT_jb.a(var4);
      }
   }

   public final DataOutputStream a() {
      return new DataOutputStream(this.a.getOutputStream());
   }

   public final void b() {
      try {
         if (this.b != null) {
            this.b.close();
         }

         if (this.a != null) {
            this.a.dispose();
         }

      } catch (Exception var1) {
      }
   }
}
