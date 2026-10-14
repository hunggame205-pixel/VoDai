package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import java.util.Vector;

public final class VDTT_lk extends VDTT_am {

    public VDTT_ll a;
    public boolean b;
    public long c;
    public int d;
    public static boolean N;

    public VDTT_lk(VDTT_p var1) {
        this.I = var1;
        this.d((DataCenter.d().n - 240) / 14 * 14 + 192, 26);
        this.f(DataCenter.d().n / 2 - this.q / 2, DataCenter.d().o - 30);
        this.a = new VDTT_ll(var1);
        this.a.d(this.q, this.r);
        this.a.d = 200;
        this.d = this.a.x();
        this.c = VDTT_jb.a();
    }

    public final void a(boolean var1) {
        this.a.N = true;
    }

    public final void b(Graphics var1) {
        Graphics var10001 = var1;
        short var5 = this.objY;
        var5 = this.objX;
        Graphics var2 = var10001;
        VDTT_ll var6 = this.a;
        DataCenter.o();
        if (var6.b < 40) {
            var6.b += 4;
        } else {
            if (!var6.a) {
                var6.b += 8;
                if (var6.b == 360) {
                    var6.a = true;
                }
            } else {
                var6.b -= 16;
                if (var6.b == 40) {
                    var6.a = false;
                }
            }

            var2.o();
            var2.d(70);
            var2.f(0);
            var2.c(0, 0, DataCenter.d().n, DataCenter.d().o);
            boolean var4 = true;
            var2.j = var4;
            VDTT_dc.a(var2, 459, var6.b, DataCenter.d().n / 2, DataCenter.d().o / 2, 3);
            var4 = false;
            var2.j = var4;
            VDTT_dg.a(var2, Caption.c, DataCenter.d().n / 2, DataCenter.d().o / 2 - 5, 2, -48128);
            VDTT_dg.a(var2, var6.x() + "%", DataCenter.d().n / 2, DataCenter.d().o / 2 + 5, 2, -48128);
            var2.l = 1.0F;
        }
    }

    public final void a_() {
        this.a.a_();
        if (this.b) {
            DataCenter.ak = true;
            VDTT_cf var1 = VDTT_cq.v();
            DataCenter.d().ai = var1;
            if (N) {
                N = false;
            } else if (Gdx.app.getType() != ApplicationType.Desktop) {
                if (VDTT_d.g().i != null) {
                    VDTT_d.g().j();
                    VDTT_d var10000 = VDTT_d.g();
                    Object var2 = null;
                    var10000.i = (String) var2;
                } else {
                    VDTT_d.g().k();
                }
            }

            if (Gdx.app.getType() == ApplicationType.iOS) {
                VDTT_ac.b().a();
            }

        } else {
            if (this.a.c >= this.a.d) {
                this.b = true;
            }

            if (this.a.x() != this.d) {
                this.d = this.a.x();
                this.c = VDTT_jb.a();
            }

            if (this.d > 0 && this.d < 100 && VDTT_jb.a() - this.c > 60000L) {
                this.a(true);
            }

        }
    }

    public final Vector g() {
        return new Vector();
    }

    public final void a(VDTT_hl var1, int var2, int var3) {
        super.a(var1, var2, var3);
    }

    public final void perform(int var1, Object var2, VDTT_z var3) {
    }

    public final void b(int var1, Object var2) {
    }
}
