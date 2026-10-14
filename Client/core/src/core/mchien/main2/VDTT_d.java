package core.mchien.main2;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import core.mchien.listener.AppEventListener;
import core.mchien.listener.LoginCallback;
import core.mchien.listener.LogoutCallback;
import core.mchien.listener.SDKEventListener;

import java.util.Hashtable;
import java.util.Vector;

import core.mchien.vn.system.DialogText;

public class VDTT_d extends Game {
    public VDTT_l a;
    public static String b = (new VDTT_e()).toString();
    public static String c = "e9cc855dfdabaad44a69d3fa1f4837df";
    public static String d = "dbd8264c2628b783c4cd6c361d8e7057";
    private static VDTT_d r;
    public static Hashtable e = new Hashtable();
    public static Hashtable e2 = new Hashtable();
    public static Hashtable e3 = new Hashtable();
    public int f;
    public SDKEventListener g;
    public AppEventListener h;
    public String i = null;
    public Vector j = new Vector();
    private static boolean s = true;
    public String k;
    public String l;
    public int m = 0;
    public static byte[] n = new byte[200];
    private int t = 3;
    private int u;
    private int v;
    public static boolean o;
    public boolean p;
    public static String q = "id = Vũ trụ\r\nVõ Đài = 100:103.232.121.105:3847:4848";

    public VDTT_d() {
        n[0] = 62;
        n[1] = 21;
        n[2] = -115;
        n[3] = 72;
        n[4] = 22;
        n[5] = 5;
        n[6] = 31;
        n[7] = 10;
    }

    public final void d() {
        this.a.d();
        this.a.c();
        DataCenter.d().a(0, this.a.e(), this.a.f());
    }

    public final AppEventListener e() {
        return this.h;
    }

    public static void f() {
        e.clear();
        (new Thread(new VDTT_f())).start();
    }

    public static VDTT_d g() {
        if (r == null) {
            r = new VDTT_d();
        }

        return r;
    }

    public boolean isDone = false;
    public void create() {


//        System.setErr(new PrintStream(new OutputStream() {
//            public void write(int b) {
//            }
//        }));
//        System.setOut(new PrintStream(new OutputStream() {
//            public void write(int b) {
//            }
//        }));




        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {

                    long var2 = System.currentTimeMillis();
                    try {
                        if (DataCenter.d().ai instanceof VDTT_cw) {
                            if (Graphics.i2()) {
                                VDTT_cw.v().move();
                                VDTT_cw.v().auto();
                            } else {
                                VDTT_jb.a((long) 1000L);
                            }
                        }
                    } catch (Exception ex) {

                    }

                    int var15;
                    if ((var15 = (25) - (int) (System.currentTimeMillis() - var2)) <= 0) {
                        var15 = 1;
                    }

                    VDTT_jb.a((long) var15);
                }
            }
        }).start();
        if (Gdx.app.getGraphics().getGLVersion().getMajorVersion() < 2) {
            DialogText.a("Thông báo", "Rất tiếc! Máy tính của bạn cần hổ trợ tối thiểu phiên bản OpenGL 2.0 thì mới có thể mở được trò chơi.");
            g();
            i();
        } else {
            VDTT_fe.a();
            r = this;
            this.a = new VDTT_l();
            if (Gdx.app.getType() == ApplicationType.Desktop) {
                short[] var1 = VDTT_jb.h();
                this.u = var1[0];
                this.v = var1[1];
                if (this.u != this.a.e() || this.v != this.a.d || this.v <= 240) {
                    if (Gdx.app.getType() == ApplicationType.Desktop) {
                        Gdx.graphics.setWindowedMode(this.u, this.v);
                    }

                    this.a.d();
                    this.a.c();
                }
            }

            DataCenter.d().a(0, this.a.e(), this.a.f());
            VDTT_dn var10000 = VDTT_dn.a();
            if (Controller.a == null) {
                Controller.a = new Controller();
            }

            Controller var2 = Controller.a;
            var10000.m = var2;
            this.setScreen(this.a);
            this.m = 0;
            /*
            String[] arsg = ("mywjjasf4@max.ao;3709236\n" +
                    "mywjjasf5@max.ao;2466691\n" +
                    "mywjjasf6@max.ao;635501\n" +
                    "mywjjasa1@max.ao;679711\n" +
                    "wntzsyce2@max.ao;6028857\n" +
                    "wntzsyce3@max.ao;5201015\n" +
                    "wntzsyce4@max.ao;6673685\n" +
                    "wntzsyce5@max.ao;5081692\n" +
                    "wntzsyce6@max.ao;5300626\n" +
                    "wntzsycf1@max.ao;4265041\n" +
                    "wntzsycf2@max.ao;2357404\n" +
                    "wntzsycf3@max.ao;2958022\n" +
                    "wntzsycf4@max.ao;1573773\n" +
                    "wntzsycf5@max.ao;8586340\n" +
                    "wntzsycf6@max.ao;5914552\n" +
                    "wntzsyca1@max.ao;975273\n" +
                    "wntzsyca2@max.ao;1019483\n" +
                    "wntzsyca3@max.ao;3364988\n" +
                    "wntzsyca4@max.ao;8949095\n" +
                    "wntzsyca5@max.ao;1501561\n" +
                    "wntzsyca6@max.ao;2974231\n" +
                    "wntzsycb1@max.ao;1033574\n" +
                    "wntzsycb2@max.ao;2440987\n" +
                    "wntzsycb3@max.ao;7676431\n" +
                    "wntzsycb4@max.ao;6640846\n" +
                    "wntzsycb5@max.ao;4733209\n" +
                    "wntzsycb6@max.ao;6172859\n" +
                    "wntzsycc1@max.ao;361527\n" +
                    "wntzsycc2@max.ao;3960768\n" +
                    "wntzsycc3@max.ao;8465080\n" +
                    "wntzsycc4@max.ao;1889598\n" +
                    "wntzsycc5@max.ao;8030113\n" +
                    "wntzsycc6@max.ao;3581202\n" +
                    "wntzsycd1@max.ao;1673565\n" +
                    "wntzsycd2@max.ao;8129724\n" +
                    "wntzsycd3@max.ao;2318393\n" +
                    "wntzsycd4@max.ao;5742910\n" +
                    "wntzsycd5@max.ao;7215579\n" +
                    "wntzsycd6@max.ao;640097\n" +
                    "wntzsyce1@max.ao;7652664\n" +
                    "spmhghzc2@max.ao;3951093\n" +
                    "spmhghzc3@max.ao;9993331\n" +
                    "spmhghzc4@max.ao;037543\n" +
                    "spmhghzc5@max.ao;638160\n" +
                    "spmhghzc6@max.ao;9602574\n" +
                    "spmhghzd1@max.ao;9123397\n" +
                    "spmhghzd2@max.ao;6659353\n" +
                    "spmhghzd3@max.ao;1720073\n" +
                    "spmhghzd4@max.ao;6224385\n" +
                    "spmhghzd5@max.ao;4873156\n" +
                    "spmhghzd6@max.ao;4917366\n" +
                    "spmhghze3@max.ao;6871331\n" +
                    "spmhghze6@max.ao;9316447\n" +
                    "spmhghzf1@max.ao;3439859\n" +
                    "spmhghzf2@max.ao;4007457\n" +
                    "spmhghzf3@max.ao;2971872\n" +
                    "spmhghzf4@max.ao;3572490\n" +
                    "spmhghzf5@max.ao;2188241\n" +
                    "spmhghzf6@max.ao;9516452\n" +
                    "spmhghza1@max.ao;7783539\n" +
                    "spmhghza3@max.ao;3095430\n" +
                    "spmhghza4@max.ao;8614281\n" +
                    "spmhghza5@max.ao;5626849\n" +
                    "spmhghza6@max.ao;7622906\n" +
                    "spmhghzb1@max.ao;1047424\n" +
                    "spmhghzb2@max.ao;8059991\n" +
                    "spmhghzb3@max.ao;5072559\n" +
                    "spmhghzb4@max.ao;4593381\n" +
                    "spmhghzb5@max.ao;7145846\n" +
                    "spmhghzb6@max.ao;254720\n" +
                    "carjhzrf3@max.ao;4731572\n" +
                    "carjhzrf6@max.ao;3588638\n" +
                    "carjhzra1@max.ao;2172152\n" +
                    "carjhzra2@max.ao;4168209\n" +
                    "carjhzra3@max.ao;9719297\n" +
                    "carjhzra4@max.ao;7255253\n" +
                    "carjhzra5@max.ao;9807718\n" +
                    "carjhzra6@max.ao;4868438\n" +
                    "carjhzrb1@max.ao;3832853\n" +
                    "carjhzrb2@max.ao;7083430\n" +
                    "carjhzrb3@max.ao;2144150\n" +
                    "carjhzrb4@max.ao;5568667\n" +
                    "carjhzrc1@max.ao;6127192\n" +
                    "carjhzrc2@max.ao;1994708\n" +
                    "carjhzrc3@max.ao;3675121\n" +
                    "carjhzrc4@max.ao;3162924\n" +
                    "carjhzrd1@max.ao;5673297\n" +
                    "carjhzrd2@max.ao;1225168\n" +
                    "carjhzrd3@max.ao;6285888\n" +
                    "carjhzrd4@max.ao;7758558\n" +
                    "carjhzrd5@max.ao;5643177\n" +
                    "carjhzrd6@max.ao;4815336\n" +
                    "carjhzre1@max.ao;9319648\n" +
                    "carjhzre2@max.ao;2744166\n" +
                    "carjhzre3@max.ao;7248478\n" +
                    "carjhzre4@max.ao;7849096\n" +
                    "carjhzre5@max.ao;2909816\n" +
                    "carjhzre6@max.ao;2746283\n" +
                    "carjhzrf1@max.ao;5124808\n" +
                    "carjhzrf2@max.ao;5867129\n" +
                    "carjhzrf4@max.ao;6685898\n" +
                    "carjhzrf5@max.ao;3698466\n" +
                    "carjhzrb5@max.ao;6560403\n" +
                    "carjhzrb6@max.ao;6048206\n" +
                    "kmcjytvc2@max.ao;9473506\n" +
                    "kmcjytvc3@max.ao;389769\n" +
                    "kmcjytvc4@max.ao;3116957\n" +
                    "kmcjytvd1@max.ao;3119075\n" +
                    "kmcjytvd2@max.ao;764498\n" +
                    "kmcjytvd3@max.ao;808708\n" +
                    "kmcjytvd4@max.ao;5313020\n" +
                    "kmcjytve1@max.ao;3123310\n" +
                    "kmcjytve2@max.ao;8849904\n" +
                    "kmcjytve3@max.ao;5862472\n" +
                    "kmcjytve4@max.ao;1555265\n" +
                    "kmcjytve5@max.ao;7695780\n" +
                    "kmcjytve6@max.ao;2898204\n" +
                    "kmcjytvf2@max.ao;2986625\n" +
                    "kmcjytvf3@max.ao;5539090\n" +
                    "kmcjytvf4@max.ao;8091555\n" +
                    "kmcjytvf5@max.ao;8451410\n" +
                    "kmcjytvf6@max.ao;9052027\n" +
                    "kmcjytva1@max.ao;9747419\n" +
                    "bbruzmre1@max.ao;4796888\n" +
                    "bbruzmre2@max.ao;9203707\n" +
                    "bbruzmre5@max.ao;1365416\n" +
                    "bbruzmre6@max.ao;3089256\n" +
                    "bbruzmrf1@max.ao;7593569\n" +
                    "bbruzmrf2@max.ao;2621270\n" +
                    "bbruzmrf3@max.ao;888356\n" +
                    "bbruzmrf4@max.ao;2012362\n" +
                    "bbruzmrf5@max.ao;9024929\n" +
                    "bbruzmrf6@max.ao;7432936\n" +
                    "bbruzmra1@max.ao;8033554\n" +
                    "bbruzmra2@max.ao;2854294\n" +
                    "bbruzmra3@max.ao;9310454\n" +
                    "bbruzmra4@max.ao;3499122\n" +
                    "bbruzmra5@max.ao;2048834\n" +
                    "bbruzmra6@max.ao;948775\n" +
                    "bbruzmrb1@max.ao;1658077\n" +
                    "bbruzmrb2@max.ao;8115019\n" +
                    "bbruzmrb3@max.ao;111078\n" +
                    "bbruzmrb4@max.ao;711696\n" +
                    "bbruzmrb5@max.ao;6088060\n" +
                    "fghuyltc2@max.ao;8598432\n" +
                    "fghuyltc3@max.ao;4325027\n" +
                    "fghuyltc4@max.ao;3464166\n" +
                    "fghuyltc5@max.ao;443714\n" +
                    "fghuyltc6@max.ao;1044332\n" +
                    "fghuyltd1@max.ao;9136694\n" +
                    "fghuyltd2@max.ao;8101109\n" +
                    "fghuyltd3@max.ao;9017371\n" +
                    "fghuyltd4@max.ao;3521684\n" +
                    "fghuyltd5@max.ao;9629179\n" +
                    "fghuyltd6@max.ao;9357745\n" +
                    "fghuylte1@max.ao;7242365\n" +
                    "fghuylte2@max.ao;4254933\n" +
                    "fghuylte3@max.ao;3219348\n" +
                    "fghuylte4@max.ao;4692018\n" +
                    "fghuylte5@max.ao;4387564\n" +
                    "fghuylte6@max.ao;528080\n" +
                    "fghuyltf3@max.ao;2515064\n" +
                    "kcuvfgqf5@max.ao;516446;1;AutoNhanDo\n" +
                    "kcuvfgqf6@max.ao;4955501;1;AutoNhanDo\n").split("\n");
            for (int i = 0; i < arsg.length; i++) {
                int y = i;
                new Thread(() -> {
                    int z = y;


                    VDTT_dn var100001 = new VDTT_dn();
                    var100001.m = new VDTT_t() {
                        @Override
                        public void a() {
                            try {
                                Message var8 = null;
                                (var8 = Message.c((byte) -127)).a(arsg[z].split(";")[0]);
                                var8.a(arsg[z].split(";")[1]);
                                var8.c(DataCenter.d().u);
                                var8.c(DataCenter.d().v);
                                var8.a(false);
                                var100001.a(var8);

                                var100001.g.add(new byte[]{-122, 0, 2, -127, 0});
                                synchronized (var100001.h) {
                                    var100001.h.notify();
                                }
                                new Thread(() -> {
                                    while(true){

                                            try {
                                                Message var3;
                                                (var3 = new Message((byte) 22)).a(false);
                                                String[] arr = (":)\n"
                                                        + "@@\n"
                                                        + ":'(\n"
                                                        + ":o8\n"
                                                        + ":o\n"
                                                        + ":\\\n"
                                                        + ":|\n"
                                                        + ":d\n"
                                                        + "=(\n"
                                                        + ":\\\n"
                                                        + "*)\n"
                                                        + ":x\n"
                                                        + ":b\n"
                                                        + ">:(\n"
                                                        + ":]\n"
                                                        + ":<\n"
                                                        + "b)\n"
                                                        + ":'<\n"
                                                        + "x=\n"
                                                        + "<3\n"
                                                        + ":[\n"
                                                        + ":\\\n"
                                                        + ":p\n"
                                                        + ":\\\n"
                                                        + ":')\n"
                                                        + ";)\n"
                                                        + ";(\n"
                                                        + ":.\n"
                                                        + "=d\n"
                                                        + "o:)\n"
                                                        + "b;\n"
                                                        + ":/\n"
                                                        + "~.~\n"
                                                        + "*.*\n"
                                                        + "v.v").split("\n");
                                                String s= "";
                                                while(s.length()<30){
                                                    s+=arr[new Random().nextInt(arr.length)];
                                                }
                                                var3.a(s);

                                                var100001.a(var3);


                                                Thread.sleep(30000);
                                            } catch (Exception ex) {
                                                throw new RuntimeException(ex);
                                            }


                                    }
                                }).start();
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        }

                        @Override
                        public void b() {

                        }

                        @Override
                        public void c() {

                        }

                        @Override
                        public void a(Message var1) {
                            System.out.println(var1.a);
                            switch (var1.a) {
                                case -107:
                                    VDTT_cw.v().cB = false;
                                    String
                                            var58 = null;
                                    try {
                                        var58 = var1.j();
                                        System.out.println(var58);
                                    } catch (IOException ex) {
                                        throw new RuntimeException(ex);
                                    }
                                    boolean var78 = false;

                                    try {
                                        var78 = var1.c();
                                    } catch (Exception var14) {
                                    }

                                    if (!var78) {
                                        VDTT_bc.a(9, Caption.bY, var58);
                                    }

                                    DataCenter.d().e().c(var58, -1);
                                    return;
                            }
                            if (var1.a == -113) {
                                try {
                                    DataCenter.d().d = var1.f();
                                    DataCenter.d().e = var1.f();
                                    DataCenter.d().c = var1.j();

                                    try {
                                        byte[] var62 = var1.e();
                                        System.out.println("SEND");
                                        (new Thread(new VDTT_c(var62))).start();
                                    } catch (Exception var15) {
                                        var15.printStackTrace();
                                    }
                                } catch (IOException ex) {
                                    throw new RuntimeException(ex);
                                }


                            }

                        }
                    };
                    var100001.a("103.232.121.105", 7002);


                }).start();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println(i);
            }*/
        }
    }

    public static boolean h() {
        return Gdx.app.getType() == ApplicationType.Desktop && s;
    }

    public static void i() {
        Gdx.app.exit();
        System.exit(0);
    }

    public final void j() {
        VDTT_d var10000 = g();
        Object var2 = null;
        var10000.i = (String) var2;
        DataCenter.aD = 0;
        g().g.a((LogoutCallback) (new VDTT_h(this)));
    }

    public final void k() {
        o = true;
        g().g.a((LoginCallback) (new VDTT_i(this)));
    }

    private boolean a() {
        return this.t == 4 && this.m > 0;
    }

    public final int l() {
        return this.a() ? 0 : this.m;
    }

    public final int m() {
        return !this.a() ? this.m / 2 : this.m;
    }

    public final void a(boolean var1) {
        if (var1) {
            VDTT_cw.v();
            VDTT_cw.F();
        }

        if (this.h != null) {
            this.h.a();
        }

    }

    public static void a(String var0) {
        g().g.a(String.valueOf(DataCenter.d().aF), var0);
    }

    public static void n() {
        g().j();
    }

    public static void o() {
        if (DataCenter.d().ai instanceof VDTT_cw && ((VDTT_cw) DataCenter.d().ai).V()) {
            DataCenter.d().ai.a(Caption.jB, 30000, DataCenter.d().ai);
        } else {
            System.exit(0);
        }
    }
}
