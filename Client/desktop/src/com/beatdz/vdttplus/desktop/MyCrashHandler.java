package com.beatdz.vdttplus.desktop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import core.mchien.vn.boot.GameM;

public class MyCrashHandler implements Thread.UncaughtExceptionHandler {
    final DesktopLauncher desktopLauncher;

    public MyCrashHandler(DesktopLauncher var1) {
        this.desktopLauncher = var1;
    }

    public void uncaughtException(Thread var1, Throwable var2) {
        var2.printStackTrace();
        if (!(var2 instanceof IncompatibleClassChangeError)) {
            StringWriter var4;
            (var4 = new StringWriter()).append("Max memory: ").append(String.valueOf(Runtime.getRuntime().maxMemory())).append("\n");
            var4.append("Total memory: ").append(String.valueOf(Runtime.getRuntime().totalMemory())).append("\n");
            var4.append("Free memory: ").append(String.valueOf(Runtime.getRuntime().freeMemory())).append("\n");
            var4.append("Used memory: ").append(String.valueOf(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())).append("\n");
            var2.printStackTrace(new PrintWriter(var4));
            saveFile("support\\crash" + System.currentTimeMillis() + ".log", var4.toString());
            if (!var2.getMessage().contains("OpenGL") && !var2.getMessage().contains("no uniform with name")) {
                if (var2.getMessage().contains("java.lang.OutOfMemoryError")) {
                    GameM.s();
                    GameM.b();
                }

            } else {
                try {
                    System.getenv("PROCESSOR_ARCHITECTURE");
                    System.getenv("PROCESSOR_ARCHITEW6432");
                    String var5 = "32";
                    File var6;
                    if (!(var6 = new File("jre\\bin\\opengl32.dll")).exists()) {
                        copy(new File("support\\x" + var5 + "\\opengl32.dll"), var6);
                        this.desktopLauncher.a();
                        return;
                    }
                } catch (Exception var3) {
                }

                this.desktopLauncher.b("Thông Báo", "Vui lòng cập nhật trình điều khiển (driver) cho máy tính của bạn và thử lại mở lại game.\nThân ái!");
            }
        }
    }

    private static void saveFile(String var0, String var1) {
        try {
            FileOutputStream var6;
            (var6 = new FileOutputStream(var0)).write(var1.getBytes());
            var6.close();
        } catch (Exception var4) {
        } finally {

        }
    }

    private static void copy(File var0, File var1)throws IOException {
        FileInputStream var2 = null;
        FileOutputStream var3 = null;

        try {
            var2 = new FileInputStream(var0);
            var3 = new FileOutputStream(var1);
            byte[] var6 = new byte[1024];

            int var7;
            while((var7 = var2.read(var6)) > 0) {
                var3.write(var6, 0, var7);
            }
        } finally {
            var2.close();
            var3.close();
        }

    }
}

