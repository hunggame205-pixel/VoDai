package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.utils.ScissorStack;

import java.util.Hashtable;
import java.util.Vector;

public final class Graphics {
    private static int q = 100;
    private static Hashtable r = new Hashtable();
    public Rectangle a = new Rectangle();
    public SpriteBatch b;
    ShapeRenderer c;
    Rectangle d;
    public int e = 0;
    public int f = 0;
    VDTT_r g;
    private int s;
    private int t;
    private int u;
    private int v;
    public int h;
    public int i;
    private boolean w;
    public boolean j;
    public boolean k;
    private boolean x = true;
    private int y;
    private Color z;
    public float l;
    private static boolean A = false;
    public static int m = -1;
    private static GlyphLayout B = new GlyphLayout();
    private static Vector C = new Vector();
    private static Vector D = new Vector();
    public static Hashtable n = new Hashtable();
    private static BitmapFont E;
    private static BitmapFont F;
    private static BitmapFont G;
    private static BitmapFont[] H;
    public static String o = " 0123456789+-*='\"\\/_?.,~:;|<>[]{}!@#$%^&()aáàảãạâấầẩẫậăắằẳẵặbcdđeéèẻẽẹêếềểễệfghiíìỉĩịjklmnoóòỏõọôốồổỗộơớờởỡợpqrstuúùủũụưứừửữựvxyýỳỷỹỵzwAÁÀẢÃẠÂẤẦẨẪẬĂẮẰẲẴẶBCDĐEÉÈẺẼẸÊẾỀỂỄỆFGHIÍÌỈĨỊJKLMNOÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢPQRSTUÚÙỦŨỤƯỨỪỬỮỰVXYÝỲỶỸỴZW";
    public static boolean p;

    public Graphics(VDTT_r var1) {
        this.z = Color.CLEAR;
        this.l = 1.0F;

        try {
            this.g = var1;
            this.c();
            this.c = new ShapeRenderer();
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public static void a() {
        try {
            if (A) {
                A = false;
                t();
                VDTT_dg.b();
            }

        } catch (Exception var0) {
        }
    }

    public static BitmapFont a(int var0) {
        BitmapFont var1 = F;
        switch (var0) {
            case 0:
                return c(var1);
            case 1:
                return d(var1);
            case 2:
                return b();
            case 3:
                return a(var1);
            case 4:
                return b(var1);
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return g(var0 - 5);
            default:
                return c(var1);
        }
    }

    private static void a(BitmapFont var0, float var1, float var2) {
        if (VDTT_cw.dK) {
            var0.getData().setScale(var1 * 75.0F / 100.0F, var2 * 75.0F / 100.0F);
        } else {
            var0.getData().setScale(var1, var2);
        }
    }

    public static BitmapFont b(int var0) {
        BitmapFont var1 = F;
        switch (DataCenter.d().r) {
            case 1:
                a(var1, (float) var0 / 100.0F, (float) var0 / 100.0F);
                break;
            case 2:
                a(var1, (float) var0 / 100.0F, (float) var0 / 100.0F);
                break;
            case 3:
                a(var1, (float) var0 / 100.0F, (float) var0 / 100.0F);
                break;
            case 4:
                a(var1, (float) var0 / 100.0F, (float) var0 / 100.0F);
        }

        return var1;
    }

    private static BitmapFont a(BitmapFont var0) {
        switch (DataCenter.d().r) {
            case 1:
                a(var0, 0.88F, 0.88F);
                break;
            case 2:
                a(var0, 0.88F, 0.88F);
                break;
            case 3:
                a(var0, 0.88F, 0.88F);
                break;
            case 4:
                a(var0, 0.88F, 0.88F);
        }

        return var0;
    }

    private static BitmapFont b(BitmapFont var0) {
        switch (DataCenter.d().r) {
            case 1:
                a(var0, 0.88F, 0.88F);
                break;
            case 2:
                a(var0, 0.88F, 0.88F);
                break;
            case 3:
                a(var0, 0.88F, 0.88F);
                break;
            case 4:
                a(var0, 0.88F, 0.88F);
        }

        return var0;
    }

    private static BitmapFont c(BitmapFont var0) {
        VDTT_eq.a().b(25);
        switch (DataCenter.d().r) {
            case 1:
                a(var0, 0.975F, 0.975F);
                break;
            case 2:
                a(var0, 0.975F, 0.975F);
                break;
            case 3:
                a(var0, 0.975F, 0.975F);
                break;
            case 4:
                a(var0, 0.975F, 0.975F);
        }

        return var0;
    }

    private static BitmapFont d(BitmapFont var0) {
        switch (DataCenter.d().r) {
            case 1:
                a(var0, 1.16F, 1.2F);
                break;
            case 2:
                a(var0, 1.16F, 1.2F);
                break;
            case 3:
                a(var0, 1.16F, 1.2F);
                break;
            case 4:
                a(var0, 1.16F, 1.2F);
        }

        return var0;
    }

    public static BitmapFont b() {
        if (DataCenter.l()) {
            return a(0);
        } else {
            switch (DataCenter.d().r) {
                case 1:
                    G.getData().setScale(0.25F, 0.25F);
                    break;
                case 2:
                    G.getData().setScale(0.5F, 0.5F);
                    break;
                case 3:
                    G.getData().setScale(0.5F, 0.5F);
                    break;
                case 4:
                    G.getData().setScale(0.5F, 0.5F);
            }

            return G;
        }
    }

    public static BitmapFont a(float var0) {
        switch (DataCenter.d().r) {
            case 1:
            case 2:
            case 3:
                G.getData().setScale(0.78F * var0, 0.78F * var0);
                break;
            case 4:
                G.getData().setScale(0.88F * var0, 0.88F * var0);
        }

        return G;
    }

    public static BitmapFont b(float var0) {
        H[1].getData().setScale(var0 * (float) DataCenter.d().r / 100.0F, var0 * (float) DataCenter.d().r / 100.0F);
        return H[1];
    }

    private static BitmapFont g(int var0) {
        switch (DataCenter.d().r) {
            case 1:
                H[var0].getData().setScale(0.25F, 0.25F);
                break;
            case 2:
                H[var0].getData().setScale(0.5F, 0.5F);
                break;
            case 3:
                H[var0].getData().setScale(0.75F, 0.75F);
                break;
            case 4:
                H[var0].getData().setScale(1.0F, 1.0F);
        }

        return H[var0];
    }

    public static int a(int var0, String var1) {
        try {
            BitmapFont var2 = E;
            BitmapFont var10001;
            switch (var0) {
                case 0:
                    var10001 = c(var2);
                    break;
                case 1:
                    var10001 = d(var2);
                    break;
                case 2:
                    var10001 = b();
                    break;
                case 3:
                    var10001 = a(var2);
                    break;
                case 4:
                    var10001 = b(var2);
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    var10001 = g(var0 - 5);
                    break;
                default:
                    var10001 = c(var2);
            }

            return (int) a(var0, var10001, var1).width;
        } catch (Exception var3) {
            return 0;
        }
    }

    public static int b(int var0, String var1) {
        try {
            return (int) a(var0, a(var0), var1).height;
        } catch (Exception var2) {
            return 0;
        }
    }

    private static String a(String var0) {
        String var1 = "";

        for (int var2 = 0; var2 < var0.length(); ++var2) {
            if (o.indexOf(var0.charAt(var2)) >= 0) {
                var1 = var1 + var0.charAt(var2);
            }
        }

        if (n.size() > 5000) {
            n.clear();
        }

        n.put(var0, var1);
        return var1;
    }

    public static GlyphLayout a(int var0, BitmapFont var1, String var2) {
        return a(var0, var1, var2, i(var0));
    }

    private static GlyphLayout a(int var0, BitmapFont var1, String var2, Vector var3) {
        String var7;
        if ((var7 = (String) n.get(var2)) != null) {
            var2 = var7;
        }

        if (var2.length() == 0) {
            return B;
        } else {
            while (true) {
                GlyphLayout var4 = null;

                try {
                    if (var3.size() == 0) {
                        var4 = new GlyphLayout();
                    } else {
                        (var4 = (GlyphLayout) var3.remove(0)).reset();
                    }

                    var4.setText(var1, var2);
                    String var5;
                    if ((var5 = ((GlyphRun) var4.runs.get(0)).toString()).length() > var2.length()) {
                        if (var5.substring(0, var2.length()).equals(var2)) {
                            var3.add(var4);

                            for (int var8 = var3.size(); var8 < 5; ++var8) {
                                var3.add(new GlyphLayout());
                            }

                            return var4;
                        }

                        if (var7 == null && (var2 = a(var2)).length() == 0) {
                            return B;
                        }
                    }
                } catch (Exception var6) {
                    if (var7 == null && (var2 = a(var2)).length() == 0) {
                        return B;
                    }
                }

                if (var4 != null) {
                    var4.reset();
                }
            }
        }
    }

    public final SpriteBatch c() {
        try {
            if (this.b == null) {
                this.b = new SpriteBatch();
            }
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }

        return this.b;
    }

    private static void t() {
        try {
            if (E != null) {
                E.dispose();
            }
        } catch (Exception var4) {
        }

        try {
            if (F != null) {
                F.dispose();
            }
        } catch (Exception var3) {
        }

        try {
            if (G != null) {
                G.dispose();
            }
        } catch (Exception var2) {
        }

        F = null;
        E = null;
        if (H != null) {
            for (int var0 = 0; var0 < H.length; ++var0) {
                try {
                    if (H[var0] != null) {
                        H[var0].dispose();
                    }

                    H[var0] = null;
                } catch (Exception var1) {
                }
            }
        }

    }

    public static void d() {
        try {
            VDTT_dg.b();
            t();
            e();
        } catch (Exception var0) {
        }
    }

    private static void a(Vector var0) {
        int var1;
        for (var1 = 0; var1 < var0.size(); ++var1) {
            for (int var2 = 0; var2 < ((Vector) var0.get(var1)).size(); ++var2) {
                ((GlyphLayout) ((Vector) var0.get(var1)).get(var2)).reset();
            }
        }

        var0.clear();

        for (var1 = 0; var1 < 8; ++var1) {
            Vector var4 = new Vector();

            for (int var3 = 0; var3 < 5; ++var3) {
                var4.add(new GlyphLayout());
            }

            var0.add(var4);
        }

    }

    public static void e() {
        if (m != DataCenter.d().r) {
            t();
        }

        if (F == null || G == null || H == null) {
            a(C);
            a(D);
            m = DataCenter.d().r;
            FreeTypeFontParameter var0;
            (var0 = new FreeTypeFontParameter()).characters = o;
            var0.flip = true;
            var0.borderColor = VDTT_jb.b(-10275328L);
            var0.borderWidth = 0.0F;
            var0.spaceX = 0;
            var0.color = Color.WHITE;
            var0.borderColor = VDTT_jb.b(-14013910L);
            var0.size = 8 * DataCenter.d().r;
            var0.borderWidth = 0.0F;
            var0.shadowColor = VDTT_jb.b(-16708448L);
            var0.shadowOffsetX = 1;
            var0.shadowOffsetY = 1;
            FreeTypeFontGenerator var1 = null;
            DataCenter.d();
            if (!DataCenter.t() && DataCenter.k()) {
                q = 8;
                var1 = new FreeTypeFontGenerator(Gdx.files.internal("tffdata"));
                var0.size = DataCenter.d().r * q;
                F = G = E = var1.generateFont(var0);
                switch (DataCenter.d().r) {
                    case 2:
                        q = 24;
                        break;
                    case 3:
                        q = 22;
                        break;
                    default:
                        q = 20;
                }

                var0.size = DataCenter.d().r * q;
                G = var1.generateFont(var0);
                var0.size = DataCenter.d().r * q;
                H = new BitmapFont[8];

                for (int var4 = 0; var4 < H.length; ++var4) {
                    H[var4] = var1.generateFont(var0);
                }

                return;
            }

            if (DataCenter.d().r == 1) {
                var1 = new FreeTypeFontGenerator(VDTT_jb.g("tff6"));
                var0.size = 9;
            } else {
                byte var3;
                switch (var3 = VDTT_eq.a().b(25)) {
                    case 0:
                        var1 = new FreeTypeFontGenerator(VDTT_jb.g("tff3"));
                        break;
                    case 1:
                        var1 = new FreeTypeFontGenerator(VDTT_jb.g("tff1"));
                        break;
                    case 2:
                        var1 = new FreeTypeFontGenerator(VDTT_jb.g("tff2"));
                        break;
                    case 3:
                        var1 = new FreeTypeFontGenerator(VDTT_jb.g("tff4"));
                        break;
                    case 4:
                        var1 = new FreeTypeFontGenerator(VDTT_jb.g("tff6"));
                        break;
                    case 5:
                        var1 = new FreeTypeFontGenerator(VDTT_jb.g("tff5"));
                }

                var0.size = DataCenter.d().r * 8;
                if (var3 == 4) {
                    var0.size += DataCenter.d().r / 2;
                }
            }

            F = var1.generateFont(var0);
            E = var1.generateFont(var0);
            var0.size = 21 * DataCenter.d().r;
            var0.borderWidth = 0.0F;
            var0.shadowOffsetX = 0;
            var0.shadowOffsetY = 0;
            G = (var1 = new FreeTypeFontGenerator(VDTT_jb.g("tff3"))).generateFont(var0);
            var1.dispose();
            H = new BitmapFont[8];

            int var5;
            for (var5 = 0; var5 < H.length; ++var5) {
                FileHandle var2;
                if ((var2 = VDTT_jb.h(String.format("font9%d.fnt", var5))).exists()) {
                    H[var5] = new BitmapFont(VDTT_jb.h(var2.name()), true);
                }
            }

            for (var5 = 0; var5 < VDTT_dg.h.length; ++var5) {
                VDTT_dg.h[var5].b();
            }
        }

    }

    public final void c(int var1) {
        this.z = VDTT_jb.b((long) var1);
    }

    public final void f() {
        try {
            this.z = Color.CLEAR;
            this.c().setColor(Color.WHITE);
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void d(int var1) {
        if (var1 > 100) {
            this.l = 1.0F;
        } else {
            this.l = (float) var1 / 100.0F;
        }
    }

    public final void g() {
        this.l = 1.0F;
    }

    public final void e(int var1) {
        try {
            if (DataCenter.d().s()) {
                this.c(-6645094);
                return;
            }

            ((VDTT_ao) this.c()).a(30);
        } catch (Exception var2) {
        }

    }

    public final void h() {
        try {
            if (DataCenter.d().s()) {
                this.f();
                return;
            }

            ((VDTT_ao) this.c()).a();
        } catch (Exception var1) {
        }

    }

    public static boolean i() {
        return false;
    }
    public static boolean i2() {
        return VDTT_d.g().h != null && VDTT_d.g().h.c();
    }

    private boolean u() {
        if (i()) {
            return true;
        } else {
            return this.h == 0 || this.i == 0;
        }
    }

    private void v() {
        try {
            ScissorStack.calculateScissors(this.g.c, this.c().getTransformMatrix(), this.d, this.a);
            ScissorStack.pushScissors(this.a);
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    private void w() {
        try {
            if (!this.u()) {
                this.c().flush();
                ScissorStack.popScissors();
            }
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void j() {
        try {
            this.w = false;
            this.c().end();
            this.c.end();
            if (!this.u()) {
                this.c().flush();
                ScissorStack.popScissors();
            }
        } catch (Exception var1) {
        }
    }

    public final void a(int var1, int var2, int var3, int var4) {
        try {
            this.x = false;
            if (!this.u()) {
                VDTT_v var5 = h(this.y);
                if (var1 == var3) {
                    this.a(var5, 0, 0, 1, 1, 0, (float) var1, (float) var2, (float) DataCenter.d().r, (float) ((var4 - var2) * DataCenter.d().r), 0);
                } else {
                    this.a(var5, 0, 0, 1, 1, 0, (float) var1, (float) var2, (float) ((var3 - var1) * DataCenter.d().r), (float) DataCenter.d().r, 0);
                }

                this.x = true;
            }
        } catch (Exception var6) {
        }
    }

    private static VDTT_v h(int var0) {
        VDTT_v var1 = null;

        try {
            if ((var1 = (VDTT_v) r.get(var0)) == null) {
                Pixmap var2;
                (var2 = (var1 = VDTT_v.a(1, 1)).b).setColor(VDTT_jb.b((long) var0));
                var2.fill();
                VDTT_da.a(var1);
                r.put(var0, var1);
            }
        } catch (Exception var3) {
        }

        return var1;
    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        this.x = false;
        switch (var2) {
            case -39:
                var3 = -1560281088;
                break;
            case -38:
            case -37:
            case -36:
            case -35:
            case -34:
            case -33:
            case -32:
            case -31:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            default:
                var3 = var2;
                break;
            case -30:
                var3 = -398256362;
                break;
            case -29:
                var3 = -1275058924;
                break;
            case -28:
                var3 = -13355973;
                break;
            case -27:
                var3 = -1769577835;
                break;
            case -26:
                var3 = -595765745;
                break;
            case -25:
                var3 = -1442245870;
                break;
            case -24:
                var3 = -14399156;
                break;
            case -23:
                var3 = -1427649639;
                break;
            case -22:
                var3 = -1278446549;
                break;
            case -21:
                var3 = -851931;
                break;
            case -20:
                var3 = -11456235;
                break;
            case -19:
                var3 = -6200792;
                break;
            case -18:
                var3 = -429507045;
                break;
            case -17:
                var3 = -3640790;
                break;
            case -16:
                var3 = -10076645;
                break;
            case -15:
                var3 = -7978471;
                break;
            case -14:
                var3 = -435612910;
                break;
            case -13:
                var3 = 1526368273;
                break;
            case -12:
                var3 = -1;
                break;
            case -11:
            case 80:
                var3 = -5332328;
                break;
            case -10:
                var3 = -518501300;
                break;
            case -9:
                var3 = -11197433;
                break;
            case -8:
                var3 = -15323092;
                break;
            case -7:
            case -5:
                var3 = 1677721600;
                break;
            case -6:
                var3 = -1290201339;
                break;
            case -4:
                var3 = -868916617;
                break;
            case -3:
                var3 = -934343646;
                break;
            case -2:
                var3 = -1290123955;
                break;
            case -1:
                var3 = 0;
        }

        if (var3 == var2) {
            var1.f();
        }

        VDTT_v var8 = h(var3);
        this.a(var8, 0, 0, 1, 1, 0, (float) var4, (float) var5, (float) var6, (float) var7, 0);
        this.x = true;
    }

    public final void b(int var1, int var2, int var3, int var4) {
        if (!this.u() && var3 != 0 && var4 != 0) {
            this.x = false;
            int var5 = var3;
            int var6 = var4;
            var3 *= DataCenter.d().r;
            var4 *= DataCenter.d().r;
            VDTT_v var7 = h(this.y);
            this.a(var7, 0, 0, 1, 1, 0, (float) var1, (float) var2, (float) var3, (float) DataCenter.d().r, 0);
            this.a(var7, 0, 0, 1, 1, 0, (float) var1, (float) var2, (float) DataCenter.d().r, (float) var4, 0);
            this.a(var7, 0, 0, 1, 1, 0, (float) var1, (float) (var2 + var6), (float) (var3 + DataCenter.d().r), (float) DataCenter.d().r, 0);
            this.a(var7, 0, 0, 1, 1, 0, (float) (var1 + var5), (float) var2, (float) DataCenter.d().r, (float) (var4 + DataCenter.d().r), 0);
            this.x = true;
        }
    }

    public final void c(int var1, int var2, int var3, int var4) {
        if (!this.u() && var3 != 0 && var4 != 0) {
            try {
                this.x = false;
                var3 *= DataCenter.d().r;
                var4 *= DataCenter.d().r;
                VDTT_v var5 = h(this.y);
                this.a(var5, 0, 0, 1, 1, 0, (float) var1, (float) var2, (float) var3, (float) var4, 0);
                this.x = true;
            } catch (Exception var6) {
                VDTT_jb.a(var6);
            }
        }
    }

    public final void a(VDTT_v var1, int var2, int var3) {
        if (var1 != null) {
            this.a(var1, 0, 0, var1.c, var1.d, 0, (float) var2, (float) var3, 0);
        }
    }

    public final void a(VDTT_v var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, int var9) {
        this.a(var1, var2, var3, var4, var5, var6, var7, var8, (float) var4, (float) var5, var9);
    }

    public final void a(VDTT_v var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10, int var11) {
        try {
            if (var1 == null || this.u()) {
                return;
            }

            var7 += (float) this.e;
            var8 += (float) this.f;
            var7 *= (float) DataCenter.d().r;
            var8 *= (float) DataCenter.d().r;
            if (var4 > 1 && var5 > 1) {
                var2 *= DataCenter.d().r;
                var3 *= DataCenter.d().r;
            }

            if ((var11 & 2) != 0) {
                if (this.j || var6 != 90 && var6 != 270 && var6 != -270 && var6 != -90) {
                    var8 -= var10 / 2.0F;
                } else {
                    var8 -= var9 / 2.0F;
                }
            } else if ((var11 & 32) != 0) {
                if (this.j || var6 != 90 && var6 != 270 && var6 != -270 && var6 != -90) {
                    var8 -= var10;
                } else {
                    var8 -= var9;
                }
            }

            if ((var11 & 8) != 0) {
                if (this.j || var6 != 90 && var6 != 270 && var6 != -270 && var6 != -90) {
                    var7 -= var9;
                } else {
                    var7 -= var10;
                }
            } else if ((var11 & 1) != 0) {
                if (this.j || var6 != 90 && var6 != 270 && var6 != -270 && var6 != -90) {
                    var7 -= var9 / 2.0F;
                } else {
                    var7 -= var10 / 2.0F;
                }
            }

            var9 = var9 == 0.0F ? (float) var4 : var9;
            var10 = var10 == 0.0F ? (float) var5 : var10;
            Texture var16;
            if ((var16 = var1.c()) == null) {
                return;
            }

            Color var15;
            TextureFilter var10001;
            if (this.j) {
                if (var16 != null) {
                    var15 = this.c().getColor();
                    this.c().setColor(var15.r, var15.g, var15.b, this.l);
                    if (!this.z.equals(Color.CLEAR)) {
                        this.c().setColor(this.z.r, this.z.g, this.z.b, this.z.a);
                    }

                    if (this.x) {
                        var10001 = TextureFilter.Linear;
                        var16.setFilter(var10001, var10001);
                    }

                    this.c().draw(var16, var7, var8, var9 / 2.0F, var10 / 2.0F, var9, var10, 1.0F, 1.0F, (float) var6, var2, var3, var4, var5, var6 < 0, true);
                }

                return;
            }

            if (var6 != 180 && var6 != -180) {
                if (var6 == 270) {
                    var8 += var9;
                } else {
                    float var14;
                    if (var6 == -90) {
                        if ((float) var1.c == this.d(var9) && (float) var1.d == this.d(var10)) {
                            var8 += var9;
                        } else {
                            var14 = var9;
                            var9 = var10;
                            var10 = var14;
                            var8 += var9;
                        }
                    } else if (var6 == 90) {
                        if ((float) var1.c == this.d(var9) && (float) var1.d == this.d(var10)) {
                            var7 += var10;
                        } else {
                            var14 = var9;
                            var9 = var10;
                            var10 = var14;
                            var7 += var14;
                        }
                    } else if (var6 == -270) {
                        if ((float) var1.c == this.d(var9) && (float) var1.d == this.d(var10)) {
                            var7 += var10;
                        } else {
                            var14 = var9;
                            var9 = var10;
                            var10 = var14;
                            var7 += var14;
                        }
                    }
                }
            } else {
                var7 += var9;
                var8 += var10;
            }

            var15 = this.c().getColor();
            this.c().setColor(var15.r, var15.g, var15.b, this.l);
            if (!this.z.equals(Color.CLEAR)) {
                this.c().setColor(this.z.r, this.z.g, this.z.b, this.z.a);
            }

            if (var16 != null) {
                if (this.x) {
                    var10001 = TextureFilter.Linear;
                    var16.setFilter(var10001, var10001);
                }

                this.c().draw(var16, var7, var8, 0.0F, 0.0F, var9, var10, 1.0F, 1.0F, (float) var6, var2, var3, var4, var5, var6 < 0, true);
            }
        } catch (Exception var13) {
            VDTT_jb.a(var13);
        }

    }

    public final void a(VDTT_v var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10, float var11, float var12, int var13) {
        try {
            if (var1 != null && !this.u()) {
                var7 += (float) this.e;
                var8 += (float) this.f;
                var7 *= (float) DataCenter.d().r;
                var8 *= (float) DataCenter.d().r;
                if (var4 > 1 && var5 > 1) {
                    var2 = 0 * DataCenter.d().r;
                    var3 *= DataCenter.d().r;
                }

                if ((var13 & 2) != 0) {
                    if (this.j || var6 != 90 && var6 != 270 && var6 != -270 && var6 != -90) {
                        var8 -= var10 / 2.0F;
                    } else {
                        var8 -= var9 / 2.0F;
                    }
                } else if ((var13 & 32) != 0) {
                    if (this.j || var6 != 90 && var6 != 270 && var6 != -270 && var6 != -90) {
                        var8 -= var10;
                    } else {
                        var8 -= var9;
                    }
                }

                if ((var13 & 8) != 0) {
                    if (this.j || var6 != 90 && var6 != 270 && var6 != -270 && var6 != -90) {
                        var7 -= var9;
                    } else {
                        var7 -= var10;
                    }
                } else if ((var13 & 1) != 0) {
                    if (this.j || var6 != 90 && var6 != 270 && var6 != -270 && var6 != -90) {
                        var7 -= var9 / 2.0F;
                    } else {
                        var7 -= var10 / 2.0F;
                    }
                }

                var9 = var9 == 0.0F ? (float) var4 : var9;
                var10 = var10 == 0.0F ? (float) var5 : var10;
                Texture var15;
                if ((var15 = var1.c()) != null) {
                    Color var16 = this.c().getColor();
                    this.c().setColor(var16.r, var16.g, var16.b, this.l);
                    if (!this.z.equals(Color.CLEAR)) {
                        this.c().setColor(this.z.r, this.z.g, this.z.b, this.z.a);
                    }

                    TextureFilter var10001 = TextureFilter.Linear;
                    var15.setFilter(var10001, var10001);
                    if (var11 == 0.0F) {
                        var11 = var9 / 2.0F;
                    }

                    if (var12 == 0.0F) {
                        var12 = var10 / 2.0F;
                    }

                    this.c().draw(var15, var7, var8, var11, var12, var9, var10, 1.0F, 1.0F, (float) (180 + var6), var2, var3, var4, var5, false, false);
                }

            }
        } catch (Exception var14) {
            VDTT_jb.a(var14);
        }
    }

    public final int[] b(VDTT_v var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10, int var11) {
        try {
            if (var1 == null || this.u()) {
                return null;
            }

            var7 += (float) this.e;
            var8 += (float) this.f;
            var7 *= (float) DataCenter.d().r;
            var8 *= (float) DataCenter.d().r;
            if (var4 > 1 && var5 > 1) {
                var2 *= DataCenter.d().r;
                var3 *= DataCenter.d().r;
            }

            var9 = var9 == 0.0F ? (float) var4 : var9;
            var10 = var10 == 0.0F ? (float) var5 : var10;
            Texture var14;
            if ((var14 = var1.c()) != null) {
                Color var21 = this.c().getColor();
                this.c().setColor(var21.r, var21.g, var21.b, this.l);
                if (!this.z.equals(Color.CLEAR)) {
                    this.c().setColor(this.z.r, this.z.g, this.z.b, this.z.a);
                }

                TextureFilter var10001 = TextureFilter.Linear;
                var14.setFilter(var10001, var10001);
                this.c().draw(var14, var7, var8 - var10 / 2.0F, 0.0F, var10 / 2.0F, var9, var10, 1.0F, 1.0F, (float) (180 + var6), var2, var3, var4, var5, false, false);
                float var23 = var7;
                float var10002 = var8 - var10 / 2.0F;
                float var10004 = var10 / 2.0F;
                var7 = (float) (180 + var6);
                float var15 = 1.0F;
                var15 = 1.0F;
                float var18 = var10004;
                var15 = 0.0F;
                float var17 = var10002;
                float var16 = var23;
                var16 += 0.0F;
                var17 += var18;
                var8 = -var18;
                float var19 = var9 - 0.0F;
                var18 = var10 - var18;
                var10 = var19;
                float var20;
                if (var7 != 0.0F) {
                    float var22 = MathUtils.cosDeg(var7);
                    float var12 = MathUtils.sinDeg(var7);
                    var19 = var22 * -0.0F - var12 * var8;
                    var20 = var12 * -0.0F + var22 * var8;
                    var7 = var22 * -0.0F - var12 * var18;
                    var8 = var12 * -0.0F + var22 * var18;
                    var9 = var22 * var10 - var12 * var18;
                    var18 = var12 * var10 + var22 * var18;
                    var19 += var9 - var7;
                    var20 = var18 - (var8 - var20);
                } else {
                    var9 = var19;
                    var18 = var18;
                    var19 = var19;
                    var20 = var8;
                }

                var9 += var16;
                var18 += var17;
                var19 += var16;
                var20 += var17;
                DataCenter.d();
                DataCenter.d();
                var9 /= (float) DataCenter.d().r;
                var19 /= (float) DataCenter.d().r;
                DataCenter.d();
                DataCenter.d();
                var18 /= (float) DataCenter.d().r;
                var20 /= (float) DataCenter.d().r;
                var9 -= (float) this.e;
                var19 -= (float) this.e;
                var18 -= (float) this.f;
                var20 -= (float) this.f;
                return new int[]{(int) (var9 + (var19 - var9) / 2.0F), (int) (var18 + (var20 - var18) / 2.0F)};
            }
        } catch (Exception var13) {
            VDTT_jb.a(var13);
        }

        return null;
    }

    private float d(float var1) {
        return this.k ? var1 : var1 * (1.0F / DataCenter.d().w);
    }

    public final void a(int var1, BitmapFont var2, String var3, float var4, float var5, int var6, int var7, float var8) {
        try {
            if (!this.u()) {
                if ((var3 = Caption.a(var3)) == null) {
                    var3 = "";
                }

                var3 = var3.replaceAll("\n", "").trim();
                if (var7 == Color.BLACK.toIntBits()) {
                    Graphics var9 = this;

                    try {
                        ShaderProgram var10;
                        if ((var10 = VDTT_ap.c()).isCompiled()) {
                            var9.c().end();
                            var9.c().setShader(var10);
                            var9.c().begin();
                        }
                    } catch (Exception var11) {
                    }
                } else {
                    var2.setColor(VDTT_jb.b((long) var7));
                }

                int var16 = var1;
                if (var1 >= D.size()) {
                    var16 = 0;
                }

                GlyphLayout var13;
                int var14 = (int) (var13 = a(var1, var2, var3, (Vector) D.get(var16))).width;
                var16 = (int) var13.height;
                var4 = (var4 + (float) this.e) * (float) DataCenter.d().r;
                var5 = (var5 + (float) this.f) * (float) DataCenter.d().r;
                if (var6 == 1) {
                    var4 -= (float) var14;
                } else if (var6 == 2) {
                    var4 -= (float) (var14 / 2);
                }

                var5 -= (float) (var16 / 2);
                if (var7 != Color.BLACK.toIntBits()) {
                    var2.setColor(VDTT_jb.b((long) var7));
                    Color var15 = this.c().getColor();
                    this.c().setColor(var15.r, var15.g, var15.b, this.l);
                    if (!this.z.equals(Color.CLEAR)) {
                        this.c().setColor(this.z.r, this.z.g, this.z.b, this.z.a);
                    }
                }

                Texture var10000 = var2.getRegion().getTexture();
                TextureFilter var10001 = TextureFilter.Linear;
                var10000.setFilter(var10001, var10001);
                var2.draw(this.c(), var13, var4 + var8, var5);
                if (var7 == Color.BLACK.toIntBits()) {
                    this.r();
                }

            }
        } catch (Exception var12) {
        }
    }

    public final int k() {
        return this.u + this.s;
    }

    public final int l() {
        return this.v + this.t;
    }

    public final int m() {
        return this.e;
    }

    public final int n() {
        return this.f;
    }

    public final void d(int var1, int var2, int var3, int var4) {
        try {
            this.s = var1 + this.e;
            this.t = var2 + this.f;
            this.u = var1;
            this.v = var2;
            var1 += this.e;
            var2 += this.f;
            this.h = var3;
            this.i = var4;
            var1 *= DataCenter.d().r;
            var2 *= DataCenter.d().r;
            var3 *= DataCenter.d().r;
            var4 *= DataCenter.d().r;
            this.d = new Rectangle((float) var1, (float) var2, (float) var3, (float) var4);
            if (this.w) {
                this.w();
            }

            this.v();
            this.w = true;
        } catch (Exception var5) {
        }
    }

    public final void f(int var1) {
        this.y = -16777216 | var1;
    }

    public final void a(int var1, int var2) {
        this.e += var1;
        this.f += var2;
        this.u = -var1;
        this.v = -var2;
    }

    public final void o() {
        this.e = 0;
        this.f = 0;
    }

    public final void c(float var1) {
        try {
            if (!VDTT_eq.a().a(36)) {
                ShaderProgram var2;
                if ((var2 = VDTT_ap.d()).isCompiled()) {
                    this.c().end();
                    var2.begin();
                    var2.setUniformf("hue", var1);
                    var2.end();
                    this.c().setShader(var2);
                    this.c().begin();
                }

            }
        } catch (Exception var3) {
        }
    }

    public final void p() {
        try {
            ShaderProgram var1;
            if ((var1 = VDTT_ap.e()).isCompiled()) {
                this.c().end();
                this.c().setShader(var1);
                this.c().begin();
            }

        } catch (Exception var2) {
        }
    }

    public final void a(float var1, float var2) {
        try {
            if (!VDTT_eq.a().a(36)) {
                ShaderProgram var3;
                if ((var3 = VDTT_ap.b()).isCompiled()) {
                    this.c().end();
                    var3.begin();
                    var3.setUniformf("contrast", var1);
                    var3.setUniformf("brightness", var2);
                    var3.end();
                    this.c().setShader(var3);
                    this.c().begin();
                }

            }
        } catch (Exception var4) {
        }
    }

    public final void q() {
        try {
            if (!VDTT_eq.a().a(36)) {
                ShaderProgram var1;
                if ((var1 = VDTT_ap.f()).isCompiled()) {
                    this.c().end();
                    this.c().setShader(var1);
                    this.c().begin();
                }

            }
        } catch (Exception var2) {
        }
    }

    public final void r() {
        this.c().end();
        this.c().setShader((ShaderProgram) null);
        this.c().begin();
    }

    public static float s() {
        int var0 = DataCenter.d().r;
        if (VDTT_cw.dK) {
            ++var0;
        }

        float var1 = 1.0F;
        if (var0 != 2 || DataCenter.d().p != 3 || VDTT_eq.a().b(2) != 0 && VDTT_eq.a().b(2) != 3) {
            if ((var0 == 3 || var0 == 4) && VDTT_eq.a().b(2) == 1) {
                var1 = (float) var0 / ((float) var0 - 1.0F);
            }
        } else {
            var1 = 1.0F;
        }

        if (VDTT_cw.dK) {
            var1 = var1 * (float) DataCenter.d().r / (float) DataCenter.d().p;
        }

        return var1;
    }

    private static Vector i(int var0) {
        if (var0 >= C.size()) {
            var0 = 0;
        }

        return (Vector) C.get(var0);
    }

    int a(VDTT_v var4, int i, int i0, int c, int d, int i1, float f, float f0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
