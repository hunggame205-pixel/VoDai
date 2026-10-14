package core.mchien.vn.system;

import com.badlogic.gdx.Input.TextInputListener;
import core.mchien.listener.DialogTextListener;

public class DialogText {
   private static DialogTextListener a;

   public static void a(DialogTextListener var0) {
      a = var0;
   }

   public static void a(TextInputListener var0, String var1, String var2, String var3) {
      a.a(var0, var1, var2, var3);
   }

   public static void a(String var0, String var1) {
      a.b(var0, var1);
   }

   public static boolean a(boolean var0) {
      return false;
   }
}
