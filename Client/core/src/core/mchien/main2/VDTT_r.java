package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.viewport.Viewport;

import java.util.Vector;

public abstract class VDTT_r implements Screen {
    public Graphics b;
    public OrthographicCamera c;
    private int a;
    public int d;
    public Viewport e;
    private InputMultiplexer l;
    public Stage f;
    public int g = 30;
    public static Vector h = new Vector();
    public static Vector i = new Vector();
    private boolean m = false;
    public static boolean j = false;
    public static int k = 1;
    private static long n;
    private static int o;

    public VDTT_r() {
        try {
            this.c();
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void c() {
        try {
            this.a = Gdx.graphics.getWidth();
            this.d = Gdx.graphics.getHeight();
            this.a /= k;
            this.d /= k;
            this.c = new OrthographicCamera((float) this.a, (float) this.d);
            this.c.setToOrtho(true, (float) this.a, (float) this.d);
            this.b = new Graphics(this);
            this.d();
            Graphics.e();
            int var1 = DataCenter.d().r;
            int var2 = DataCenter.d().p;
            this.e = new VDTT_ad(Scaling.fill, (float) this.a * (float) var1 / (float) var2 - (float) this.a % (float) var2, (float) this.d * (float) var1 / (float) var2 - (float) this.d % (float) var2, this.c);
            this.f = new Stage(this.e, this.b.c());
            this.l = new InputMultiplexer();
            this.l.addProcessor(new VDTT_w(this, 0, 0));
            this.l.addProcessor(this.f);
            Gdx.input.setInputProcessor(this.l);
            Gdx.input.setCatchBackKey(true);
            Gdx.input.setCatchMenuKey(true);
        } catch (Exception var3) {
            VDTT_jb.a(var3);
        }
    }

    public final void d() {
        if (Gdx.app.getType() != ApplicationType.Android && Gdx.app.getType() != ApplicationType.iOS) {
            if (this.a >= 1900) {
                DataCenter.d().r = 3;
            } else if (this.a >= 640 && this.d >= 480) {
                DataCenter.d().r = 2;
            } else {
                DataCenter.d().r = 1;
            }
        } else if (this.a >= 2560 && this.d >= 1440) {
            DataCenter.d().r = 6;
        } else if (this.a >= 1920 && this.d >= 1200) {
            DataCenter.d().r = 5;
        } else if (this.a >= 1280 && this.d >= 960) {
            DataCenter.d().r = 4;
        } else if (this.a >= 960 && this.d >= 720) {
            DataCenter.d().r = 3;
        } else if (this.a >= 640 && this.d >= 480) {
            DataCenter.d().r = 2;
        } else {
            DataCenter.d().r = 1;
        }

        VDTT_eq.a();
        DataCenter.d().p = DataCenter.d().r;
        if (DataCenter.d().p != 3 || VDTT_eq.a().b(2) != 0 && VDTT_eq.a().b(2) != 3) {
            if ((DataCenter.d().p == 4 || DataCenter.d().p == 5 || DataCenter.d().p == 6) && VDTT_eq.a().b(2) == 0) {
                DataCenter.d().r = 3;
            }
        } else {
            DataCenter.d().r = 2;
        }

        if (DataCenter.d().r > 4) {
            DataCenter.d().r = 4;
        }

    }

    private void a(boolean var1) {
        long var2 = System.currentTimeMillis();

        try {
            Graphics var6;
            if (j) {
                j = false;
                var6 = this.b;

                try {
                    if (var6.b != null) {
                        var6.b.getShader().dispose();
                        var6.b.dispose();
                        var6.b = null;
                    }

                    var6.c().setProjectionMatrix(var6.g.c.combined);
                    var6.c.dispose();
                    var6.c = new ShapeRenderer();
                    var6.c.setProjectionMatrix(var6.g.c.combined);
                } catch (Exception var12) {
                    VDTT_jb.a(var12);
                }
            }

            ++DataCenter.d().h;
            ++DataCenter.d().g;
            DataCenter.d().aA.b = false;
            this.c.update();
            this.a();
            if (var1) {
                if (Graphics.i2()) {
                    Gdx.gl.glClear(16384);
                } else {
                    Gdx.gl.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
                    Gdx.gl.glClear(16384);
                    Gdx.gl.glEnable(3042);
                    Gdx.gl20.glLineWidth((float) DataCenter.d().r);
                    var6 = this.b;

                    try {
                        var6.c().setProjectionMatrix(var6.g.c.combined);
                        var6.c.setProjectionMatrix(var6.g.c.combined);
                    } catch (Exception var11) {
                        VDTT_jb.a(var11);
                    }

                    var6 = this.b;

                    try {
                        var6.c().begin();
                        var6.c().enableBlending();
                        var6.c.begin(ShapeType.Line);
                    } catch (Exception var10) {
                        VDTT_jb.a(var10);
                    }

                    this.b.o();
                    this.b.d(0, 0, DataCenter.d().n, DataCenter.d().o);
                    Graphics var4;
                    if (Graphics.p) {
                        this.b.a(-this.b.e, -this.b.f);
                        this.b.a(-DataCenter.d().i, -DataCenter.d().j);
                        VDTT_ek var10000 = VDTT_ek.m();
                        var4 = this.b;
                        VDTT_ek var18 = var10000;
                        var10000.a(var4, var18.k() - 15, var18.objY - 12, false);
                        var18.a(var4, var18.k() - 15, var18.objY - 4, true);
                        if (MenuConfig.K().W) {
                            VDTT_dg.c(VDTT_dg.g[0], var4, Caption.T, var18.k(), var18.objY - 100, -1, -16711681, 0);
                        }

                    } else {
                        this.a(this.b);
                        VDTT_fp var19;
                        if ((var19 = DataCenter.d().aA).f) {
                            if (var19.e == 2) {
                                var19.g -= var19.g / 6;
                                if (var19.g < 65) {
                                    var19.g = 65;
                                    var19.e = 3;
                                }
                            } else if (var19.e == 5) {
                                var19.g -= var19.g / 15;
                                var19.h = (float) (65 - var19.g) / 30.0F;
                                if (var19.g < 35) {
                                    var19.g = 35;
                                    var19.f = false;
                                    var19.e = 1;
                                }
                            } else {
                                ++var19.e;
                            }
                        }

                        VDTT_fp var21 = DataCenter.d().aA;
                        var4 = this.b;
                        var19 = var21;
                        VDTT_cw var14;
                        if (var21.b() && VDTT_cw.v().D() && ((var14 = VDTT_cw.v()).k == null || !(var14.k instanceof VDTT_br)) && VDTT_cw.v().bP <= 0) {
                            DataCenter.o();
                            if (!DataCenter.l()) {
                                if (var19.f) {
                                    var4.d((int) ((1.0F - var19.h) * 100.0F));
                                    VDTT_dc.a(var4, 857, 0, var19.c - var19.g / 2, var19.d - var19.g / 2, var19.g * DataCenter.d().r, var19.g * DataCenter.d().r, 0, 0, 50, 50, 0);
                                    var4.l = 1.0F;
                                }

                                if (DataCenter.d().h % 6 >= 3) {
                                    VDTT_dc.a(var4, 419, 0, var19.c + 1, var19.d + 1, 20);
                                } else {
                                    VDTT_dc.a(var4, 419, 0, var19.c, var19.d, 20);
                                }
                            }
                        }
                    }

                    this.b.j();
                }
            }

            while (h.size() > 0) {
                try {
                    VDTT_v.a((Texture) h.remove(0));
                } catch (Exception var9) {
                    VDTT_jb.b("khong xoa dc textures");
                }
            }

            if (DataCenter.d().ai instanceof VDTT_cw) {
                for (int var5 = i.size() - 1; var5 >= 0; --var5) {
                    try {
                        VDTT_v var16 = (VDTT_v) i.get(var5);
                        if (var2 - var16.e > 100000L) {
                            VDTT_v var20 = var16;

                            try {
                                if (!var20.equals(VDTT_dc.a)) {
                                    if (var20.b != null) {
                                        var20.b.dispose();
                                        var20.b = null;
                                        --VDTT_v.f;
                                    }

                                    if (var20.a != null) {
                                        var20.a.dispose();
                                        var20.a = null;
                                        --VDTT_v.g;
                                    }
                                }
                            } catch (Exception var7) {
                            }

                            i.remove(var16);
                        }
                    } catch (Exception var8) {
                        VDTT_jb.b("khong xoa dc textures");
                    }
                }
            }
        } catch (Exception var13) {
            VDTT_jb.a(var13);
        }

        if (VDTT_dn.a > 0) {
            --VDTT_dn.a;
        }

        if (DataCenter.d().h % (Graphics.i2() ? 800 : 10000)  == 0) {
            System.gc();
            DataCenter.d().h = 0;
            DataCenter.d().g = 0;
        }
        ++o;
        long var17;
        if ((var17 = System.currentTimeMillis()) - n > 5000L) {
            if (o > 200) {
           //     VDTT_dn.a += o - 200;
            }

            n = var17;
            o = 0;
        }

        int var15;
        if ((var15 = (Graphics.i2() ? 300 : 16) - (int) (var17 - var2)) <= 0) {
            var15 = 1;
        }

        VDTT_jb.a((long) var15);
    }

    public void render(float var1) {
        this.a(true);
        this.f.act(Math.min(Gdx.graphics.getDeltaTime(), 0.033333335F));
        this.f.draw();
    }

    public final int e() {
        return DataCenter.d().r != DataCenter.d().p ? this.a / DataCenter.d().p : this.a / DataCenter.d().r;
    }

    public final int f() {
        return DataCenter.d().r != DataCenter.d().p ? this.d / DataCenter.d().p : this.d / DataCenter.d().r;
    }

    public abstract void a();

    public abstract void a(Graphics var1);

    public abstract void a(int var1);

    public abstract void a(char var1);

    public abstract void b(int var1);

    public abstract void a(int var1, int var2);

    public abstract void b(int var1, int var2);

    public abstract void c(int var1, int var2);

    public void show() {
    }

    public void resize(int var1, int var2) {
        this.f.getViewport().update(this.a, this.d, true);
    }

    public void pause() {
        VDTT_ac var1;
        (var1 = VDTT_ac.b()).a = true;
        var1.c();
        if (Gdx.app.getType() != ApplicationType.Desktop && Gdx.app.getType() != ApplicationType.iOS) {
            this.m = true;
            (new Thread(new VDTT_s(this))).start();
        }
    }

    public void resume() {
        this.m = false;
        VDTT_ac var1;
        (var1 = VDTT_ac.b()).a = false;
        var1.e = false;

        try {
            if (VDTT_eq.a().a(1)) {
                var1.k();
            }

            if (var1.c != null && var1.c.isPlaying()) {
                var1.c.setVolume(VDTT_ac.g());
            }

        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public void hide() {
    }

    public void dispose() {
        VDTT_ac var1;
        (var1 = VDTT_ac.b()).h();
        var1.i();
        if (var1.c != null) {
            var1.c.dispose();
            var1.c = null;
        }

    }

    // $FF: synthetic method
    static boolean a(VDTT_r var0) {
        return var0.m;
    }

    // $FF: synthetic method
    static void a(VDTT_r var0, boolean var1) {
        var0.a(false);
    }
}
