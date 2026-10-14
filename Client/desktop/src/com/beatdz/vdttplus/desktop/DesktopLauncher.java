package com.beatdz.vdttplus.desktop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.Input.TextInputListener;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.GdxRuntimeException;

import core.mchien.listener.AppEventListener;
import core.mchien.listener.DialogTextListener;
import core.mchien.listener.LoginCallback;
import core.mchien.listener.LogoutCallback;
import core.mchien.listener.SDKEventListener;
import core.mchien.listener.SaveScreenShotListener;
import core.mchien.listener.VoiceRecordPermission;
import java.awt.Component;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Port.Info;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import core.mchien.main2.VDTT_c;
import core.mchien.main2.VDTT_da;
import core.mchien.main2.VDTT_jb;
import org.lwjgl.opengl.Display;
import core.mchien.vn.boot.GameM;
import core.mchien.vn.system.DialogText;

public class DesktopLauncher implements AppEventListener, DialogTextListener, SDKEventListener {
    private JDialog b;
    public static String a = "vdtt/";
    private static DesktopLauncher launcher;
    private static Vector d = new Vector();

    public static void main(String[] var0) {
        launcher = new DesktopLauncher();
        Thread.setDefaultUncaughtExceptionHandler(new MyCrashHandler(launcher));
        try {

            Gdx.files = new com.badlogic.gdx.backends.lwjgl.LwjglFiles();
            //Thu muc du lieu nguoi choi: VoDaiPlus/<ten file dang chay>/
            //(chay bang IDE/gradle thi khong co ten file -> dung ten mac dinh)
            String ten = "VoDaiToiThuong";
            try {
                File file = new File(byGetResource(launcher.getClass()));
                if (file.isFile()) {
                    ten = VDTT_jb.a(file.getName(), ".")[0];
                }
            } catch (Exception ex) {
            }
            a = VDTT_da.a = "VoDaiPlus/" + ten + "/";
            //todo xóa file người dùng chèn vào thư mục gốc
            d.clear();
            short[] var10 = d();
            LwjglApplicationConfiguration var11 = new LwjglApplicationConfiguration();
            DialogText.a(launcher);
            var11.width = var10[0];
            var11.height = var10[1];
            var11.addIcon("resource/4.png", FileType.Internal);
            var11.addIcon("resource/5.png", FileType.Internal);
            var11.addIcon("resource/6.png", FileType.Internal);
            var11.title = "Võ Đài Origin";
            var11.resizable = false;    var11.pauseWhenMinimized = false;
            GameM.a().h = launcher;
            GameM.a().g = launcher;
            new mchienApp(GameM.a(), var11);
            Gdx.graphics.setWindowedMode(var10[0], var10[1]);

            try {
                File var12;
                a(var12 = new File("C:\\VDTT"));
                var12.delete();
            } catch (Exception var4) {
//            }
            }
        } catch (Exception var6) {
            throw new GdxRuntimeException(var6);
        }

    }

    static String byGetResource(Class clazz) {
        URL classResource = clazz.getResource(clazz.getSimpleName() + ".class");
        if (classResource == null) {
            throw new RuntimeException("Khong tim thay class: " + clazz.getName());
        }
        String url = classResource.toString();
        try {
            if (url.startsWith("jar:")) {
                url = url.substring(4, url.indexOf("!/"));
            } else if (url.startsWith("file:")) {
                url = url.substring(0, url.length() - clazz.getName().replace('.', '/').length() - 7);
            }
            return Paths.get(new URL(url).toURI()).toString();
        } catch (Exception ex) {
            throw new RuntimeException("Invalid Jar File URL String: " + url, ex);
        }
    }
    private static void a(File var0) {
        try {
            File[] var6;
            int var1 = (var6 = var0.listFiles()).length;

            for(int var2 = 0; var2 < var1; ++var2) {
                File var3 = var6[var2];

                try {
                    if (var3.isDirectory()) {
                        a(var3);
                    }

                    var3.delete();
                } catch (Exception var4) {
                }
            }

        } catch (Exception var5) {
        }
    }

    private static short[] d() {
        DataInputStream var0 = null;
        FileInputStream var1 = null;
        boolean var11 = false;

        short[] var22;
        label136: {
            try {
                var11 = true;
                String var2 = System.getProperty("user.home") + "\\" + a.replace("/", "\\") + "arr_sc";
                File var20;
                if ((var20 = new File(var2)).exists()) {
                    var1 = new FileInputStream(var20);
                    byte[] var21 = new byte[(int)var20.length()];
                    var1.read(var21, 0, var21.length);
                    var0 = new DataInputStream(new ByteArrayInputStream(var21));
                    var22 = new short[]{var0.readShort(), var0.readShort()};
                    var11 = false;
                    break label136;
                }

                var11 = false;
                return new short[]{1024, 600};
            } catch (Exception var18) {
                var11 = false;
            } finally {
                if (var11) {
                    try {
                        if (var0 != null) {
                            var0.close();
                        }
                    } catch (IOException var13) {
                    }

                    try {
                        if (var1 != null) {
                            var1.close();
                        }
                    } catch (Exception var12) {
                    }

                }
            }

            try {
                if (var0 != null) {
                    var0.close();
                }
            } catch (IOException var17) {
            }

            try {
                if (var1 != null) {
                    var1.close();
                }
            } catch (Exception var16) {
            }

            return new short[]{1024, 600};
        }

        try {
            var0.close();
        } catch (IOException var15) {
        }

        try {
            var1.close();
        } catch (Exception var14) {
        }

        return var22;
    }

    public final void a() {
        //todo restart App
//      try {
//         Runtime.getRuntime().exec("C:\\Wetaps\\VDTT\\vdtt.exe");
//      } catch (IOException var1) {
//      }
    }

    private static boolean b(byte[] var0) {
        ZipInputStream var1 = null;
        boolean var11 = false;

        label137: {
            try {
                var11 = true;
                var1 = new ZipInputStream(new ByteArrayInputStream(var0));

                ZipEntry var18;
                while((var18 = var1.getNextEntry()) != null) {
                    try {
                        ByteArrayOutputStream var2 = new ByteArrayOutputStream();
                        byte[] var3 = new byte[524288];

                        int var4;
                        while((var4 = var1.read(var3)) != -1) {
                            var2.write(var3, 0, var4);
                        }

                        var2.flush();
                        String var19 = var18.getName().replaceAll("/", "\\\\");
                        var19 = "C:\\Wetaps\\" + var19;
                        var3 = var2.toByteArray();
                        if (var19.endsWith("\\")) {
                            (new File(var19)).mkdirs();
                        } else {
                            VDTT_jb.b(var19, var3);
                        }

                        var2.close();
                    } catch (Exception var15) {
                    }
                }

                var11 = false;
                break label137;
            } catch (Exception var16) {
                var11 = false;
            } finally {
                if (var11) {
                    try {
                        if (var1 != null) {
                            var1.close();
                        }
                    } catch (Exception var12) {
                    }

                }
            }

            try {
                if (var1 != null) {
                    var1.close();
                    return false;
                }
            } catch (Exception var13) {
            }

            return false;
        }

        try {
            var1.close();
        } catch (Exception var14) {
        }

        return false;
    }

    public final void a(VoiceRecordPermission var1) {
        var1.a();
    }

    public final boolean b() {
        try {
            return AudioSystem.isLineSupported(Info.MICROPHONE);
        } catch (Exception var1) {
            return false;
        }
    }

    public final void a(byte[] var1) {
        (new Thread(new VDTT_c(var1))).start();
    }

    private static boolean a(boolean var0) {
        File[] var7 = (new File("C:\\Wetaps\\VDTT")).listFiles();
        boolean var1 = true;
        int var2 = (var7 = var7).length;

        for(int var3 = 0; var3 < var2; ++var3) {
            File var4 = var7[var3];

            try {
                if (var4.isFile() && !d.contains(var4.getCanonicalPath().toLowerCase()) && !var4.getName().toLowerCase().equals("game.exe") && !var4.delete()) {
                    var1 = false;
                    launcher.b("Thông Báo", "Vui lòng xóa tập tin '" + var4.getCanonicalPath() + "' để tiếp tục trò chơi.");
                    break;
                }
            } catch (Exception var6) {
                var1 = false;

                try {
                    launcher.b("Thông Báo", "Vui lòng xóa tập tin '" + var4.getCanonicalPath() + "' để tiếp tục trò chơi.");
                } catch (Exception var5) {
                }
            }
        }

        if (!var1) {
            System.exit(0);
        }

        return var1;
    }

    public final void a(String var1, SaveScreenShotListener var2) {
        FileHandle var3 = Gdx.files.external(var1);

        try {
            FileHandle var4;
            if (!(var4 = new FileHandle("C:\\Wetaps\\VDTT\\hinhchup\\")).exists()) {
                var4.file().mkdir();
            }

            var4 = new FileHandle(var4.file().getAbsolutePath() + "\\" + var1.substring(var1.indexOf("\\") + 1));
            var3.copyTo(var4);
            var2.a();
            return;
        } catch (Exception var7) {
            var2.b();
        } finally {
            if (var3 != null) {
                var3.delete();
            }

        }

    }

    public final byte[] a(byte[] var1, int var2, int var3) {
        return new byte[0];
    }

    public final void a(LoginCallback var1) {
        //todo webview
//      LoginWebView.login(var1);
    }

    public final void a(LogoutCallback var1) {
        var1.a();
    }

    public final void a(String var1, String var2) {
        //todo show captcha web
//      CapchaWebView.load(var1, var2);
    }

    public final void a(TextInputListener var1, String var2, String var3, String var4) {
        SwingUtilities.invokeLater(new InputDialogHandler(var3, var2, this.b, var4, var1));
    }

    public final int b(String var1, String var2) {
        ImageIcon var3 = new ImageIcon("5.png");
        JOptionPane var5 = new JOptionPane(var2, 0, -1, var3, (Object[])null, (Object)null);
        this.b = var5.createDialog((Component)null, var1);
        this.b.setAlwaysOnTop(true);
        this.b.setVisible(true);
        this.b.dispose();

        try {
            return Integer.parseInt(var5.getValue().toString());
        } catch (Exception var4) {
            return -1;
        }
    }

    public final boolean c() {
        return !Display.isVisible();
    }
}

