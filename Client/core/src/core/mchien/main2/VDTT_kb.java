package core.mchien.main2;

import java.util.Collections;
import java.util.Vector;

public final class VDTT_kb extends VDTT_jr implements VDTT_u {

    private static VDTT_kb aG;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public VDTT_ek V;
    public VDTT_ic[] W;
    private VDTT_ic[] aH = new VDTT_ic[14];
    public VDTT_ic[] skillPet = new VDTT_ic[4];
    public VDTT_bd X;
    public int Y;
    public int Z = -1;
    public int aa;
    private int aI = 32;
    private int aJ = 15;
    public int am;
    public int an = -1;
    private VDTT_ht[][] aK;
    public VDTT_hs[][] ao;
    public VDTT_gj ap;
    private VDTT_iq[] aL;
    private VDTT_ca[] aM;
    private VDTT_ba aN;
    private VDTT_ba aO;
    private VDTT_ba aP;
    private VDTT_ba aQ;
    private VDTT_iu[] aR;
    public VDTT_ba aq;
    public VDTT_ba ar;
    public VDTT_ba as;
    private VDTT_ba aS;
    private VDTT_ba aT;
    private VDTT_ba aU;
    private VDTT_ba aV;
    private VDTT_bf aW;
    public VDTT_bf at;
    public Item au;
    private VDTT_ht aX;
    private boolean aY;
    public String[][] av = new String[5][0];
    private VDTT_ba[] aZ = new VDTT_ba[5];
    private VDTT_ba[] ba = new VDTT_ba[5];
    public VDTT_ba[] aw = new VDTT_ba[10];
    public VDTT_hs[] ax = new VDTT_hs[10];
    public VDTT_ba[] ay = new VDTT_ba[2];
    public VDTT_hs[] az = new VDTT_hs[2];
    private int bb = 20;
    private int bc = 14;
    private XYEntity[] bd;
    private XYEntity[] be;
    private XYEntity[] arrayXYPet;
    private XYEntity[] arrayXYPet2;
    private VDTT_ic bf;
    public boolean aA;
    public int aB;
    public int aC;
    public byte aD;
    public VDTT_hi aE;
    public int[] aF = new int[25];
    private int am2 = -1;

    public int exp;
    public int expMax;
    public int frameStart;
    public int frameEnd;
    public int tickSpeed;
    public int dxPet;
    public int dyPet;

    private int tick;

    public VDTT_kb(VDTT_p var1, VDTT_ek var2, VDTT_ic[] var3) {
        super(var1, Caption.yu);
        this.a(var1, var2, var3, -1);
    }

    public VDTT_kb(VDTT_p var1, VDTT_ek var2, VDTT_ic[] var3, int var4) {
        super(var1, Caption.yu);
        this.a(var1, var2, var3, var4);
    }

    private void a(VDTT_p var1, VDTT_ek var2, VDTT_ic[] var3, int var4) {
        try {
            aG = this;
            this.I = var1;
            this.V = var2;
            this.a(var3);
            this.K = false;
            this.a(299);
            VDTT_hp var8;
            (var8 = new VDTT_hp(1001)).c = Caption.yu;
            new Vector();
            this.ap = new VDTT_gj(var8, this.q + 80, 1, this.f() - 3, 87, this.h() + 6, 31, this);
            this.ap.h = true;
            this.C();
            this.X = this.a(this.ap.objX + 62, this.f() + this.h() - 41, Caption.dE, 1234);
            boolean var9 = true;
            this.X.d = var9;
            this.aL = new VDTT_iq[1];
            this.aL[0] = new VDTT_iq(new VDTT_hp(2000, Caption.zM), this);
            if (DataCenter.l()) {
                this.aL[0].f = true;
            }

            int var14;
            for (var14 = 0; var14 < this.aZ.length; ++var14) {
                this.aZ[var14] = this.a(this.aK[0][0].objX - 26, this.aK[0][0].objY + 8 + var14 * 32, "", this, 1100 + var14, 287);
                VDTT_ba var10000 = this.aZ[var14];
                short var10 = -360;
                var10000.K = var10;
                this.ap.a((VDTT_m) this.aZ[var14], 0);
                this.aL[0].a(this.aZ[var14], 0);
                this.aZ[var14].b(!this.F() || DataCenter.n());
            }

            for (var14 = 0; var14 < this.ba.length; ++var14) {
                this.ba[var14] = this.a(this.aK[0][1].objX + 40, this.aK[0][1].objY + 8 + var14 * 32, "", this, 1100 + var14, 287);
                this.ap.a((VDTT_m) this.ba[var14], 0);
                this.aL[0].a(this.ba[var14], 0);
                this.ba[var14].b(!this.F() || DataCenter.n());
            }

            Vector var11 = new Vector();
            this.aq = this.a(super.q - 8 - 102, 122, Caption.dC, this, 3001, 7);
            this.aq.d(56, 20);
            var11.addElement(this.aq);
            this.ar = this.a(super.q - 8 - 102, 144, Caption.qt, this, 3002, 7);
            this.ar.d(56, 20);
            var11.addElement(this.ar);
            this.as = this.a(super.q - 8 - 102, 166, Caption.sR, this, 3003, 7);
            this.as.d(56, 20);
            var11.addElement(this.as);
            if (DataCenter.n()) {
                this.aq.f(this.ap.objX + 12, this.f() + this.r - 61);
                this.ar.f(this.aq.objX + this.aq.q + 5, this.aq.objY);
                this.as.f(this.aq.objX + 2 + (this.aq.q + 5) * 2, this.aq.objY);
            }

            VDTT_hp var15 = new VDTT_hp(1002, Caption.BS);
            this.at = this.a(super.q - 8 - 102, 144, 56, 6, var15, this, 1);
            this.at.b(true);
            var11.addElement(this.at);
            this.ap.a((Vector) var11, 2);
            this.g(0);
            var11 = new Vector();
            this.aS = this.a(super.q - 8 - 93, 122, Caption.dC, this, 2101, 7);
            this.aS.d(44, 18);
            var11.addElement(this.aS);
            this.aT = this.a(super.q - 8 - 93, 144, Caption.qt, this, 2102, 7);
            this.aT.d(44, 18);
            var11.addElement(this.aT);
            this.aU = this.a(super.q - 8 - 93, 166, Caption.sR, this, 2103, 7);
            this.aU.d(44, 18);
            var11.addElement(this.aU);
            this.aV = new VDTT_ba(super.q - 8 - 81, this.h() - 35, 0, 0, Caption.BR[var2.ap], this, 2106, -17);
            var11.addElement(this.aV);
            this.ap.a((Vector) var11, 1);
            this.aO = new VDTT_ba(this.q / 2 - 15, this.h() + 12, 0, 0, Caption.vt, this, 1028, -17);
            this.ap.a((VDTT_m) this.aO, 0);
            this.aL[0].a(this.aO, 0);
            this.aO.b(!this.F());
            this.aO.b(DataCenter.n());
            this.aP = new VDTT_ba(15, this.h() + 12, 0, 0, Caption.tS, this, 1026, -17);
            this.ap.a((VDTT_m) this.aP, 0);
            this.aL[0].a(this.aP, 0);
            this.aP.b(DataCenter.n());
            this.aQ = new VDTT_ba(this.q - 45, this.h() + 12, 0, 0, Caption.tT, this, 1027, -17);
            this.ap.a((VDTT_m) this.aQ, 0);
            this.aL[0].a(this.aQ, 0);
            this.aQ.b(DataCenter.n());
            byte var5;
            int var6;
            int var12;
            int var13;
            int var16;
            if (DataCenter.l()) {
                this.bb = 6;
                var14 = this.q / this.bb;
                this.bd = new XYEntity[this.bb];

                for (var6 = 0; var6 < 6; ++var6) {
                    this.bd[var6] = XYEntity.e(var6 * var14, 0);
                }
            } else {
                this.bd = new XYEntity[this.bb];
                var13 = this.bb % 4;
                var12 = (this.bb - 4) / 4;
                var14 = (this.q - 14) / (var12 + 2 + var13 / 2);
                var5 = 0;
                this.bd[0] = XYEntity.e(0, 0);
                var16 = var5 + 1;

                for (var6 = 0; var6 < var12 + var13 / 2; ++var6) {
                    this.bd[var16] = XYEntity.e(var16 * var14, 0);
                    ++var16;
                }

                this.bd[var16] = XYEntity.e((var12 + var13 / 2 + 1) * var14, 0);
                ++var16;

                for (var6 = 0; var6 < var12; ++var6) {
                    this.bd[var16] = XYEntity.e((var12 + var13 / 2 + 1) * var14, (var6 + 1) * 32);
                    ++var16;
                }

                this.bd[var16] = XYEntity.e((var12 + var13 / 2 + 1) * var14, (var12 + 1) * 32);
                ++var16;
                var6 = var12 - 1 + var13 / 2;

                label129:
                while (true) {
                    if (var6 < 0) {
                        this.bd[var16] = XYEntity.e(0, (var12 + 1) * 32);
                        ++var16;
                        var6 = var12 - 1;

                        while (true) {
                            if (var6 < 0) {
                                break label129;
                            }

                            this.bd[var16] = XYEntity.e(0, (var6 + 1) * 32);
                            ++var16;
                            --var6;
                        }
                    }

                    this.bd[var16] = XYEntity.e((var6 + 1) * var14, (var12 + 1) * 32);
                    ++var16;
                    --var6;
                }
            }

            this.be = new XYEntity[this.bc];
            var13 = this.bc % 3;
            var12 = (this.bc - 4) / 3;
            var14 = (this.q - (var13 > 0 ? 14 : 0)) / (var12 + 2 + var13 / 2);
            var5 = 0;
            this.be[0] = XYEntity.e(0, 0);
            var16 = var5 + 1;

            for (var6 = 0; var6 < var12 + var13 / 2; ++var6) {
                this.be[var16] = XYEntity.e(var16 * var14, 0);
                ++var16;
            }

            this.be[var16] = XYEntity.e((var12 + var13 / 2 + 1) * var14, 0);
            ++var16;

            for (var6 = 0; var6 < var12; ++var6) {
                this.be[var16] = XYEntity.e((var12 + var13 / 2 + 1) * var14, (var6 + 1) * 40);
                ++var16;
            }

            this.be[var16] = XYEntity.e((var12 + var13 / 2 + 1) * var14, (var12 + 1) * 40);
            ++var16;
            this.be[var16] = XYEntity.e(0, (var12 + 1) * 40);
            ++var16;

            for (var6 = var12 - 1; var6 >= 0; --var6) {
                this.be[var16] = XYEntity.e(0, (var6 + 1) * 40);
                ++var16;
            }

            arrayXYPet = new XYEntity[8];
            int xStart = 30;
            int yStart = 47;
            arrayXYPet[0] = XYEntity.e(xStart, yStart + 32);
            arrayXYPet[1] = XYEntity.e(xStart, yStart + 32 + 32);
            arrayXYPet[2] = XYEntity.e(xStart, yStart + 32 + 32 + 32);
            arrayXYPet[3] = XYEntity.e(xStart, yStart + 32 + 32 + 32 + 32);
            xStart = q - (30 + 32);
            arrayXYPet[4] = XYEntity.e(xStart, yStart + 32);
            arrayXYPet[5] = XYEntity.e(xStart, yStart + 32 + 32);
            arrayXYPet[6] = XYEntity.e(xStart, yStart + 32 + 32 + 32);
            arrayXYPet[7] = XYEntity.e(xStart, yStart + 32 + 32 + 32 + 32);
            for (int i = 4; i < W.length && i - 4 < skillPet.length; i++) {
                //    skillPet[i - 4] = W[i];
            }
            try {
                Message var11z;
                (var11z = Message.c((byte) -118)).a(var2.aD);
                var11z.l();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            if (DataCenter.n() && var4 >= 0) {
                for (var6 = 0; var6 < this.N.length; ++var6) {
                    this.N[var6] = var6 != var4;
                }

                this.f(var4);
            } else {
                if (this.F()) {
                    this.f(VDTT_cw.v().bc);
                    if (VDTT_cw.v().bc == 1) {
                        this.O();
                    }

                    if (DataCenter.l()) {
                        this.N[this.N.length - 1] = true;
                        return;
                    }
                } else {
                    this.N[3] = true;
                    this.f(0);
                }

                return;
            }

        } catch (Exception var7) {
            VDTT_jb.a(var7);
        }

    }

    public final void a(VDTT_ic[] var1) {
        Vector var2 = new Vector();

        int var3;
        for (var3 = 0; var3 < var1.length; ++var3) {
            if (!var1[var3].l() && var1[var3].b(this.V)) {
                var2.add(var1[var3]);
            }
        }

        this.W = new VDTT_ic[var2.size()];

        for (var3 = 0; var3 < var2.size(); ++var3) {
            this.W[var3] = (VDTT_ic) var2.get(var3);
        }

    }

    public final void C() {
        this.aK = new VDTT_ht[Caption.yu.length][];
        this.aK[0] = new VDTT_ht[5];
        this.aK[0][0] = new VDTT_ht((byte) 1, this.ap.objX + 48, this.f() + 40, this.aI, this.aI * 5, this.aI, 5, 1);
        this.aK[0][1] = new VDTT_ht((byte) 1, this.ap.objX + 48 + 172, this.f() + 40, this.aI, this.aI * 5, this.aI, 5, 1);
        this.aK[0][2] = new VDTT_ht((byte) 1, this.ap.objX + 48 + this.aI, this.f() + 40 + this.aI * 2, this.aI, this.aI * 3, this.aI, 3, 1);
        this.aK[0][3] = new VDTT_ht((byte) 1, this.ap.objX + 48 + 172 - this.aI, this.f() + 40 + this.aI * 3, this.aI, this.aI * 2, this.aI, 2, 1);
        this.aK[0][4] = new VDTT_ht((byte) 1, this.ap.objX + 48 + this.aI, this.f() + 40, this.aI, this.aI * 1, this.aI, 1, 1);
        this.aK[1] = new VDTT_ht[1];
        this.aK[1][0] = new VDTT_ht((byte) 1, this.ap.objX + 54, this.f() + 41 + this.aI * 4, this.aI * 6, this.aI, this.aI, this.aI, 1, 6);
        this.ao = new VDTT_hs[Caption.yu.length][];
        this.ao[0] = new VDTT_hs[5];
        this.ao[0][1] = new VDTT_hs((byte) 1, this.ap.objX + 5, this.f() + 34, super.q - 8 - 12, (this.r - 70) / 15 * 15, 15, this.av[1].length);
        this.ao[0][2] = new VDTT_hs((byte) 1, this.ap.objX + 5, this.f() + 34, super.q - 8 - 12, (this.r - 70) / 15 * 15, 15, this.av[2].length);
        this.ao[0][3] = new VDTT_hs((byte) 1, this.ap.objX + 5, this.f() + 34, super.q - 8 - 12, (this.r - 70) / 20 * 20, 20, this.V.bg.length);
        this.ao[1] = new VDTT_hs[1];
        this.ao[1][0] = new VDTT_hs((byte) 1, this.ap.objX + 82, this.ap.objY + 7 + 40, 135, this.aJ * 7 + 1, this.aJ, 0);
        this.ao[2] = new VDTT_hs[2];
        if (this.F()) {
            this.ao[2][0] = new VDTT_hs((byte) 1, this.ap.objX + 82, this.ap.objY + 7 + 40, 135, this.aJ * 7 + 1, this.aJ, 0);
            this.ao[2][1] = new VDTT_hs((byte) 1, this.ap.objX + 82, this.ap.objY + 7 + 40, 135, this.aJ * 7 + 1, this.aJ, 0);
        } else {
            this.ao[2][0] = new VDTT_hs((byte) 1, this.ap.objX + 82, this.ap.objY + 7 + 40, 190, this.aJ * 7 + 1, this.aJ, 0);
            this.ao[2][1] = new VDTT_hs((byte) 1, this.ap.objX + 82, this.ap.objY + 7 + 40, 190, this.aJ * 7 + 1, this.aJ, 0);
        }
    }

    public final int D() {
        return super.a.b;
    }

    public final int E() {
        return this.ap.b.b;
    }

    private void a(VDTT_hs var1, int var2) {
        this.aY = false;

        for (int var3 = 0; var3 < this.aK.length; ++var3) {
            if (this.aK[var3] != null) {
                for (int var4 = 0; var4 < this.aK[var3].length; ++var4) {
                    if (this.aK[var3][var4] != null) {
                        this.aK[var3][var4].k = -1;
                    }
                }
            }
        }

        if (var1 != null) {
            var1.k = var2;
        }

    }

    public final void d() {
        super.d();
        VDTT_cw.v().bc = super.a.b;
    }

    public final void a(VDTT_hl var1, int var2, int var3) {
        try {
            super.a(var1, var2, var3);
            if (super.a.b < this.w()) {
                if (var1.b == 1010) {
                    this.Y = 0;
                    this.a(var1.j, var1.j.k);
                    switch (var1.j.k) {
                        case 0:
                            this.k = a(var1, this, this.V.aR[2]);
                            return;
                        case 1:
                            this.k = a(var1, this, this.V.aR[4]);
                            return;
                        case 2:
                            this.k = a(var1, this, this.V.aR[6]);
                            return;
                        case 3:
                            this.k = a(var1, this, this.V.aR[8]);
                            return;
                        case 4:
                            this.k = a(var1, this, this.V.aR[14]);
                            return;
                        default:
                    }
                } else if (var1.b == 1011) {
                    this.Y = 1;
                    this.a(var1.j, var1.j.k);
                    switch (var1.j.k) {
                        case 0:
                            this.k = a(var1, this, this.V.aS[2]);
                            return;
                        case 1:
                            this.k = a(var1, this, this.V.aS[4]);
                            return;
                        case 2:
                            this.k = a(var1, this, this.V.aS[6]);
                            return;
                        case 3:
                            this.k = a(var1, this, this.V.aS[8]);
                            return;
                        case 4:
                            this.k = a(var1, this, this.V.aS[14]);
                            return;
                        default:
                    }
                } else if (var1.b == 1012) {
                    this.Y = 0;
                    this.a(var1.j, var1.j.k);
                    switch (var1.j.k) {
                        case 0:
                            this.k = a(var1, this, this.V.aR[12]);
                            return;
                        case 1:
                            this.k = a(var1, this, this.V.aR[10]);
                            return;
                        case 2:
                            this.k = a(var1, this, this.V.aR[15]);
                            return;
                        default:
                    }
                } else if (var1.b == 1013) {
                    this.Y = 1;
                    this.a(var1.j, var1.j.k);
                    switch (var1.j.k) {
                        case 0:
                            this.k = a(var1, this, this.V.aS[10]);
                            return;
                        case 1:
                            this.k = a(var1, this, this.V.aS[15]);
                            return;
                        default:
                    }
                } else {
                    Message var28;
                    if (var1.b == 1014) {
                        this.a(var1.j, var1.j.k);
                        this.k = a(var1, this, this.V.aR[13]);
                    } else if (var1.b == 1201) {
                        if (this.aL[0].h() == 0) {
                            if (var1.j.k >= 0 && this.V.av > 0) {
                                String var27;
                                if (this.V.av == 0 || this.V.av == 1 || this.V.av == 3 || this.V.av == 5) {
                                    var27 = Caption.zn[0];
                                } else {
                                    var27 = Caption.zn[1];
                                }

                                this.M();
                                this.k = a(var27, this, var1.j.objX + 40, var1.j.objY, 230);
                            }

                            return;
                        }
                    } else {
                        if (var1.b == 1020) {
                            this.an = -1;
                            this.a(var1.j, var1.j.k);
                            switch (var1.j.k) {
                                case 0:
                                    this.k = a(var1, this, this.V.aR[0]);
                                    break;
                                case 1:
                                    this.k = a(var1, this, this.V.aR[3]);
                                    break;
                                case 2:
                                    this.k = a(var1, this, this.V.aR[5]);
                                    break;
                                case 3:
                                    this.k = a(var1, this, this.V.aR[7]);
                                    break;
                                case 4:
                                    this.k = a(var1, this, this.V.aR[9]);
                                    break;
                                case 5:
                                    this.k = a(var1, this, this.V.aR[11]);
                            }

                            this.J();
                            return;
                        }

                        if (var1.b == 1021) {
                            this.a(var1.j, var1.j.k);
                            switch (var1.j.k) {
                                case 0:
                                    this.k = a(var1, this, this.V.aS[1]);
                                    return;
                                case 1:
                                    this.k = a(var1, this, this.V.aS[3]);
                                    return;
                                case 2:
                                    this.k = a(var1, this, this.V.aS[5]);
                                    return;
                                case 3:
                                    this.k = a(var1, this, this.V.aS[7]);
                                    return;
                                case 4:
                                    this.k = a(var1, this, this.V.aS[9]);
                                    return;
                                default:
                                    return;
                            }
                        }

                        if (var1.b == 1022) {
                            this.a(var1.j, var1.j.k);
                            return;
                        }

                        if (var1.b != 1023) {
                            if (var1.b == 1024) {
                                this.a(var1.j, var1.j.k);
                                this.k = a(var1, this, this.V.aS[14]);
                            } else if (var1.b == 1025) {
                                (var28 = Message.c((byte) -73)).a(this.V.aD);
                                var28.l();
                                VDTT_ac.b().n();
                            } else if (var1.b == 1026) {
                                VDTT_ac.b().n();
                                this.k = b(Caption.sV, this, 43, this.h(), 160);
                            } else if (var1.b == 1027) {
                                VDTT_ac.b().n();
                                this.k = b(Caption.sW, this, super.q - 8 - 150, this.h(), 160);
                            } else if (var1.b == 1028) {
                                if (this.V.p()) {
                                    VDTT_ac.b().n();
                                    this.I.a((MainScreen) (new VDTT_la(this.I, this.V.bq)));
                                    VDTT_cw.v();
                                    VDTT_cw.o(112);
                                }
                            } else if (var1.b == 1090) {
                                this.a(var1.j, var1.j.k);
                                this.aY = true;
                                this.k = a(var1, this, this.au);
                            } else {
                                if (var1.b >= 4000 && var1.b < 5000) {
                                    this.am = var1.b - 4000;
                                    this.g(this.am);
                                    VDTT_ac.b().n();
                                    return;
                                }

                                if (var1.b >= 5000 && var1.b < 6000) {
                                    this.a(this.aK[this.ap.b.b][0], -1);
                                    this.an = var1.b - 5000;
                                    this.K();
                                    this.h(this.an);
                                    VDTT_ac.b().n();
                                    return;
                                }
                                if (var1.b >= 7000 && var1.b < 8000) {
                                    this.am2 = var1.b - 7000;
                                    if (this.am2 >= 4 && this.am2 <= 7) {
                                        if (V.itemPet[am2 - 4] != null) {
                                            var1.j = new VDTT_ht((byte) 1, this.arrayXYPet[am2].objX, this.arrayXYPet[am2].objY, this.aI, this.aI, this.aI, 0, 1);
                                            V.itemPet[am2 - 4].w = 5;
                                            this.k = a(this, this.arrayXYPet[am2].objX, this.arrayXYPet[am2].objY, 1, V.itemPet[am2 - 4]);

                                        }
                                    } else {
                                        if (skillPet[am2] != null) {
                                            J2();
                                        }
                                    }
                                    return;
                                }
                            }
                        }
                    }

                    Message var25;
                    VDTT_kb var29;
                    switch (var1.b) {
                        case 200:
                            var29 = this;

                            try {
                                (var25 = new Message((byte) -24)).a(var29.aW.n.b);
                                var25.l();
                            } catch (Exception var22) {
                                VDTT_jb.a(var22);
                            }

                            return;
                        case 1001:
                            if (var1.j.k >= 0) {
                                this.l(var1.j.k);
                            }

                            return;
                        case 1030:
                        case 2010:
                        case 2105:
                        default:
                            return;
                        case 1031:
                            if (var1.j.k >= 0 && var1.j.k < VDTT_cw.v().ae.length) {
                                this.am = var1.j.k;
                                this.H();
                            }

                            return;
                        case 1040:
                        case 1041:
                        case 1042:
                            this.a(var1.j, var1.j.k);
                            this.k = a(var1, this, (Item) null);
                            return;
                        case 1100:
                        case 1101:
                        case 1102:
                        case 1103:
                        case 1104:
                            if (this.Z >= 0) {
                                return;
                            }

                            this.Z = var1.b - 1100;
                            this.aa = 0;
                            return;
                        case 1301:
                            if (var1.j.k >= 0) {
                                (var28 = Message.c((byte) -74)).a(var1.j.k - 1);
                                var28.l();
                            }

                            return;
                        case 1400:
                        case 1401:
                        case 1402:
                        case 1403:
                        case 1404:
                        case 1409:
                            VDTT_ac.b().n();
                            if (this.aL[super.a.b].h() == 1) {
                                this.k = b(Caption.Cd[var1.b - 1400], this, var1.a() + 20, var1.b(), 0);
                            } else {
                                this.k = b(Caption.BM[var1.b - 1400], this, var1.a() + 20, var1.b(), 0);
                            }

                            return;
                        case 1405:
                        case 1406:
                        case 1407:
                        case 1408:
                            VDTT_ac.b().n();
                            this.k = a(Caption.BM[var1.b - 1400], this, var1.a() + 20, var1.b(), 160);
                            return;
                        case 2000:
                            if (var1.j.k >= 0) {
                                this.aL[0].a(var1.j.k);
                                this.P();
                            }

                            return;
                        case 2001:
                            if (this.aM[0].h() - 1 >= this.aM[0].S) {
                                this.aM[0].a(this.aM[0].h() - 1);
                                ++this.T;
                            }

                            return;
                        case 2002:
                            if (this.T > 0) {
                                this.aM[0].a(this.aM[0].h() + 1);
                                --this.T;
                            }

                            return;
                        case 2003:
                            if (this.aM[1].h() - 1 >= this.aM[1].S) {
                                this.aM[1].a(this.aM[1].h() - 1);
                                ++this.T;
                            }

                            return;
                        case 2004:
                            if (this.T > 0) {
                                this.aM[1].a(this.aM[1].h() + 1);
                                --this.T;
                            }

                            return;
                        case 2005:
                            if (this.aM[2].h() - 1 >= this.aM[2].S) {
                                this.aM[2].a(this.aM[2].h() - 1);
                                ++this.T;
                            }

                            return;
                        case 2006:
                            if (this.T > 0) {
                                this.aM[2].a(this.aM[2].h() + 1);
                                --this.T;
                            }

                            return;
                        case 2007:
                            if (this.aM[3].h() - 1 >= this.aM[3].S) {
                                this.aM[3].a(this.aM[3].h() - 1);
                                ++this.T;
                            }

                            return;
                        case 2008:
                            if (this.T > 0) {
                                this.aM[3].a(this.aM[3].h() + 1);
                                --this.T;
                            }

                            return;
                        case 2009:
                            this.T += this.aM[0].h() + this.aM[1].h() + this.aM[2].h() + this.aM[3].h() - (this.P + this.Q + this.S + this.R);
                            this.aM[0].a("" + this.P);
                            this.aM[1].a("" + this.Q);
                            this.aM[2].a("" + this.S);
                            this.aM[3].a("" + this.R);
                            return;
                        case 2012:
                            if (this.T > 10) {
                                this.aM[0].a(this.aM[0].h() + 10);
                                this.T -= 10;
                            } else if (this.T > 0) {
                                this.aM[0].a(this.aM[0].h() + this.T);
                                this.T = 0;
                                return;
                            }

                            return;
                        case 2014:
                            if (this.T > 10) {
                                this.aM[1].a(this.aM[1].h() + 10);
                                this.T -= 10;
                            } else if (this.T > 0) {
                                this.aM[1].a(this.aM[1].h() + this.T);
                                this.T = 0;
                                return;
                            }

                            return;
                        case 2016:
                            if (this.T > 10) {
                                this.aM[2].a(this.aM[2].h() + 10);
                                this.T -= 10;
                            } else if (this.T > 0) {
                                this.aM[2].a(this.aM[2].h() + this.T);
                                this.T = 0;
                                return;
                            }

                            return;
                        case 2018:
                            if (this.T > 10) {
                                this.aM[3].a(this.aM[3].h() + 10);
                                this.T -= 10;
                            } else if (this.T > 0) {
                                this.aM[3].a(this.aM[3].h() + this.T);
                                this.T = 0;
                                return;
                            }

                            return;
                        case 2101:
                            var29 = this;

                            try {
                                (var25 = new Message((byte) 62)).a(var29.an);
                                var25.l();
                            } catch (Exception var18) {
                                VDTT_jb.a(var18);
                            }

                            return;
                        case 2102:
                            var29 = this;

                            try {
                                var29.k = a(var29.bf.a(), var29, -28, -10, var29.q + 94, var29.r + 20, var29.V);
                            } catch (Exception var17) {
                            }

                            return;
                        case 2103:
                            var29 = this;

                            try {
                                var29.I.a((MainScreen) (new VDTT_mk(var29.I, var29, var29.V, var29.W[var29.am])));
                            } catch (Exception var16) {
                            }

                            return;
                        case 2104:
                            this.an = -1;
                            this.am2 = -1;
                            this.a((VDTT_hs) null, -1);
                            this.J();
                            return;
                        case 2106:
                            var2 = VDTT_ek.m().s();
                            int var26 = 500000;
                            if ((var3 = 150 * (VDTT_ek.m().y() / 10000000)) < 150) {
                                var3 = 150;
                            } else if (var3 > 1500) {
                                var3 = 1500;
                            }

                            if (var2 == 57) {
                                var26 = 4000000;
                            } else if (var2 == 55) {
                                var26 = 2000000;
                            } else if (var2 == 50) {
                                var26 = 1000000;
                            }

                            var2 = VDTT_jb.c();
                            Vector var4 = new Vector();

                            for (int var5 = 0; var5 < Caption.BR.length; ++var5) {
                                String var6 = Caption.BR[var5];
                                if (var5 == 5) {
                                    var6 = var6 + VDTT_jb.b(Caption.xc, VDTT_jb.c(var3));
                                } else if (var5 == 6) {
                                    var6 = var6 + VDTT_jb.b(Caption.xb, VDTT_jb.c(var26));
                                }

                                if (VDTT_cw.v().ai != 86 && VDTT_ek.m().ap == 0 && var5 == 1) {
                                    var6 = var6 + Caption.wV;
                                }

                                if (var5 == 3 && this.aC > var2) {
                                    var6 = var6 + VDTT_jb.b(Caption.wX, VDTT_jb.i(this.aC - var2));
                                }

                                var4.addElement(new VDTT_iu(2110 + var5, var6));
                            }

                            String[] var31 = new String[var4.size()];
                            short[] var32 = new short[var4.size()];

                            for (var26 = 0; var26 < var4.size(); ++var26) {
                                VDTT_iu var30 = (VDTT_iu) var4.elementAt(var26);
                                var31[var26] = var30.b;
                                var32[var26] = (short) var30.a;
                            }

                            this.k = a(this, this.aO.objX - 88, this.aO.objY - 152, new VDTT_hp(0, var32, var31));
                            return;
                        case 2107:
                            m(5);
                            return;
                        case 3000:
                            k(this.W[this.am].d);
                            return;
                        case 3001:
                            var29 = this;

                            try {
                                (var25 = new Message((byte) 14)).b((int) var29.W[var29.am].d);
                                var25.l();
                            } catch (Exception var21) {
                                VDTT_jb.a(var21);
                            }

                            return;
                        case 3002:
                            var29 = this;

                            try {
                                var29.k = a(var29.bf.a(), var29, -28, -10, var29.q + 94, var29.r + 20, var29.V);
                            } catch (Exception var20) {
                            }

                            return;
                        case 3003:
                            var29 = this;

                            try {
                                var29.I.a((MainScreen) (new VDTT_mk(var29.I, var29, var29.V, var29.W[var29.am])));
                            } catch (Exception var19) {
                            }

                    }
                }
            }
        } catch (Exception var23) {
            VDTT_jb.a(var23);
        } finally {
            if (!this.F() && this.k != null && this.k instanceof VDTT_bn) {
                ((VDTT_bn) this.k).f();
            }

        }
    }

    public final boolean F() {
        return this.V.aD.equals(VDTT_ek.m().aD);
    }

    private void a(Vector var1, VDTT_ic var2, boolean var3, int var4, long var5) {
        if (this.F()) {
            if (var4 < var2.f) {
                var1.addElement("c#red" + Caption.bu + DataCenter.d().a((int) var2.f));
            } else if (var2.f > 1) {
                var1.addElement("c#yellow" + Caption.bu + DataCenter.d().a((int) var2.f));
            }

            if (var3 && var5 < var2.l) {
                var1.addElement("c#red" + Caption.ze[3] + VDTT_jb.c(var2.l) + " ki");
            } else {
                var1.addElement(Caption.ze[3] + VDTT_jb.c(var2.l) + " ki");
            }
        } else {
            var1.addElement(Caption.bu + DataCenter.d().a((int) var2.f));
            var1.addElement(Caption.ze[3] + VDTT_jb.c(var2.l) + " ki");
        }

        if (var2.b().g < 5) {
            var1.addElement(Caption.ze[7] + var2.g);
            if (var2.h >= 60000) {
                var1.addElement(Caption.ze[8] + VDTT_jb.i(var2.h / 1000));
            } else if (var2.h % 1000 == 0) {
                var1.addElement(Caption.ze[8] + var2.h / 1000 + Caption.dK);
            } else {
                var1.addElement(Caption.ze[8] + (float) var2.h / 1000.0F + Caption.dK);
            }

            if (!var2.e()) {
                var1.addElement(Caption.ze[9] + var2.i);
                var1.addElement(Caption.ze[10] + var2.k);
            }
        } else if (var2.i > 0) {
            var1.addElement(Caption.dJ + var2.i);
        }

        VDTT_gz[] var8;
        if ((var8 = var2.h()) != null) {
            var4 = (var8 = var8).length;

            for (int var9 = 0; var9 < var4; ++var9) {
                VDTT_gz var6;
                if ((var6 = var8[var9]).a().b.length() == 0) {
                    try {
                        Message var11;
                        (var11 = new Message((byte) -68)).a((int) 0);
                        var11.b((int) var2.d);
                        var11.l();
                        return;
                    } catch (Exception var7) {
                        return;
                    }
                }

                String var10;
                if ((var10 = var6.a(this.V.av)) != null && var10.length() > 0) {
                    var1.addElement(var10);
                }
            }
        }

    }

    public void g(int var1) {
        int var2 = 130;
        if (!this.F()) {
            var2 += 55;
        }

        try {
            this.aq.a(true);
            this.ar.a(true);
            if (var1 < this.W.length) {
                this.am = var1;
                int var3 = this.V.w();
                long var4 = VDTT_cw.v().ce;
                VDTT_ic var12 = this.W[var1];
                VDTT_ic var6;
                if (!this.F()) {
                    this.aq.b(true);
                    this.ar.b(true);
                    this.as.b(true);
                    this.at.b(true);
                } else {
                    this.aq.b(false);
                    if (var12 != null) {
                        System.out.println(var12.f + " " + var3);
                        if (var12.e < var12.b().f) {//
                            VDTT_cw.v();
                            var6 = VDTT_cw.j(var12.d, var12.e + 1);
                            System.out.println(var6.f <= var3);
                            System.out.println(var6.l <= var4);
                            if (var6.f <= var3 && var6.l <= var4) {
                                this.aq.a(false);
                            } else {
                                this.aq.a(true);
                            }
                        } else {
                            this.aq.a(true);
                        }
                    }

                    System.out.println("wtf" + this.aq.c);
                    this.G();
                }

                VDTT_cw.v();
                VDTT_cw.v();
                var6 = VDTT_cw.j(var12.d, var12.e + 1);
                if (var12.e <= 0) {
                    this.bf = var6;
                } else {
                    VDTT_cw.v();
                    this.bf = VDTT_cw.j(var12.d, var12.e);
                }

                Vector var7;
                (var7 = new Vector()).addElement("c#moc" + var12.b().b);
                if (var12.b().c != null && var12.b().c.length() > 0) {
                    var7.addElement(var12.b().c);
                }

                var7.addElement(Caption.ze[4] + var12.e + "/" + var12.b().f);
                if (var12.b().g >= 5) {
                    var7.addElement("c#green" + Caption.dL);
                } else if (var12.e()) {
                    var7.addElement("c#green" + Caption.mD);
                }

                if (var12.e == 0) {
                    var7.addElement("c#grey" + Caption.dM + var6.e + Caption.dN);
                    this.a(var7, var6, true, var3, var4);
                } else if (var12.e == var12.b().f) {
                    var7.addElement("c#yellow" + Caption.dO);
                    this.a(var7, var12, false, var3, var4);
                } else {
                    var7.addElement("c#yellow" + Caption.dP + var12.e);
                    this.a(var7, var12, false, var3, var4);
                    if (var6 != null && this.F()) {
                        var7.addElement("c#grey" + Caption.dQ + var6.e + Caption.dN);
                        this.a(var7, var6, true, var3, var4);
                    }
                }

                Vector var13 = new Vector();

                int var16;
                for (var16 = 0; var16 < var7.size(); ++var16) {
                    String var14 = String.valueOf(var7.elementAt(var16));
                    int var5;
                    Vector var15;
                    if (var16 == 0) {
                        var15 = VDTT_dg.a(VDTT_dg.e, var14, var2 - 5);

                        for (var5 = 0; var5 < var15.size(); ++var5) {
                            var13.add(new VDTT_iu(0, (String) var15.elementAt(var5)));
                        }
                    } else {
                        var15 = VDTT_dg.a(VDTT_dg.d, var14, var2 - 5);

                        for (var5 = 0; var5 < var15.size(); ++var5) {
                            var13.add(new VDTT_iu(1, (String) var15.elementAt(var5)));
                        }
                    }
                }

                this.aR = new VDTT_iu[var13.size()];

                for (var16 = 0; var16 < var13.size(); ++var16) {
                    this.aR[var16] = (VDTT_iu) var13.elementAt(var16);
                }

                return;
            }

            this.aR = new VDTT_iu[0];
        } catch (Exception var10) {
            return;
        } finally {
            if (DataCenter.n()) {
                this.ao[2][0] = new VDTT_hs((byte) 1, this.ap.objX + 23, this.ap.objY + 7 + 47, this.q - 50, 98, 14, this.aR.length);
                this.ao[2][1] = new VDTT_hs((byte) 1, this.ap.objX + 23, this.ap.objY + 7 + 47, this.q - 50, 98, 14, this.aR.length);
            } else {
                this.ao[2][0] = new VDTT_hs((byte) 1, this.ap.objX + 53, this.ap.objY + 7 + 41, var2, 112, 14, this.aR.length);
                this.ao[2][1] = new VDTT_hs((byte) 1, this.ap.objX + 53, this.ap.objY + 7 + 41, var2, 112, 14, this.aR.length);
            }

            this.M();
        }

    }

    public final void G() {
        if (!this.W[this.am].c()) {
            this.ar.a(false);
            if (this.N() && this.W[this.am].e > 0) {
                String[][] var1 = new String[][]{Caption.BS, Caption.BT, Caption.BU, Caption.BV, Caption.BW, Caption.BX};
                this.at.n.c = var1[this.W[this.am].e - 1];
                this.at.a(VDTT_ek.m().aB);
                if (this.at.m != null) {
                    this.at.m.a(VDTT_ek.m().aB);
                    this.at.m.k = VDTT_ek.m().aB;
                }

                this.at.a(this.at.n, this.W[this.am].e);
                this.ar.b(true);
                this.at.b(false);
                return;
            }

            this.ar.b(false);
            this.at.b(true);
        }

    }

    private void J() {
        Vector var1;
        (var1 = new Vector()).add(Caption.tU + this.V.x());
        var1.add(Caption.dU + this.aF[1] + "/" + this.aF[0]);
        var1.add(Caption.dV + this.aF[3] + "/" + this.aF[2]);

        String var2;
        for (int var3 = 0; var3 < Caption.yy.length; ++var3) {
            if (var3 == 0) {
                var2 = Caption.yy[var3] + ": " + this.aF[var3 + 4] * 90 / 100 + " - " + this.aF[var3 + 4];
            } else {
                var2 = Caption.yy[var3] + ": " + this.aF[var3 + 4] + (var3 != 16 && var3 != 17 && var3 != 18 && var3 != 19 && var3 != 20 ? "" : "%");
            }

            var1.add(var2);
        }

        Vector var7 = new Vector();

        int var4;
        for (var4 = 0; var4 < var1.size(); ++var4) {
            var2 = String.valueOf(var1.elementAt(var4));
            Vector var6 = VDTT_dg.a(VDTT_dg.d, var2, 145);

            for (int var5 = 0; var5 < var6.size(); ++var5) {
                var7.add(new VDTT_iu(1, (String) var6.elementAt(var5)));
            }
        }

        this.aR = new VDTT_iu[var7.size()];

        for (var4 = 0; var4 < var7.size(); ++var4) {
            this.aR[var4] = (VDTT_iu) var7.elementAt(var4);
        }

        this.ao[1][0] = new VDTT_hs((byte) 1, this.ap.objX + 53, this.ap.objY + 7 + 41, 150, 112, 14, this.aR.length);
        this.M();
    }

    private void J2() {
        int var2 = 130;
        if (!this.F()) {
            var2 += 55;
        }
        String var11;

        int var3 = this.V.v();
        long var4 = (long) this.V.z();
        Vector var6 = new Vector();
        VDTT_ic var7 = this.skillPet[am2];
        byte var8 = 0;
        short var9 = 0;
        switch (0) {
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                var9 = 750;
                var8 = 5;
                break;
            case 5:
                var9 = 750;
                var8 = 10;
                break;
            case 6:
                var9 = 100;
                var8 = 15;
                break;
            case 7:
                var9 = 200;
                var8 = 20;
                break;
            case 8:
                var9 = 300;
                var8 = 25;
                break;
            case 9:
                var9 = 750;
                var8 = 30;
                break;
            case 10:
                var9 = 400;
                var8 = 35;
                break;
            case 11:
                var9 = 750;
                var8 = 40;
                break;
            case 12:
                var9 = 500;
                var8 = 45;
                break;
            case 13:
                var9 = 750;
                var8 = 50;
                break;
            default:
                return;
        }
        if (var7 == null) {
            var6.addElement("c#moc" + Caption.wT);
            if (var3 < var8) {
                var6.addElement("c#red" + Caption.bu + DataCenter.d().a((int) var8));
            } else {
                var6.addElement(Caption.bu + DataCenter.d().a((int) var8));
            }

            var6.addElement("c#silver" + VDTT_jb.b(Caption.wU, VDTT_jb.k(var9)));

        } else {

            VDTT_ic var16;

            VDTT_cw.v();
            var16 = VDTT_cw.j(var7.d, var7.e + 1);

            var6.addElement("c#moc" + var7.b().b);
            if (var7.b().c != null && var7.b().c.length() > 0) {
                var6.addElement(var7.b().c);
            }

            var6.addElement(Caption.ze[4] + var7.e + "/" + var7.b().f);
            if (var7.p) {
                var11 = Caption.nt;
                if (var3 < var16.f) {
                    var6.addElement("c#red" + Caption.bu + DataCenter.d().a((int) var16.f));
                } else {
                    var6.addElement(Caption.bu + DataCenter.d().a((int) var16.f));
                }

                var6.addElement("c#silver" + VDTT_jb.b(Caption.wU, VDTT_jb.k(var9)));
            } else {
                if (var7.b().g >= 5) {
                    var6.addElement("c#green" + Caption.dL);
                } else if (var7.e()) {
                    var6.addElement("c#green" + Caption.mD);
                }

                if (var7.e == 0) {
                    var6.addElement("c#grey" + Caption.dM + var16.e + Caption.dN);
                    this.a(var6, var16, true, var3, var4);
                } else if (var7.e == var7.b().f) {
                    var6.addElement("c#yellow" + Caption.dO);
                    this.a(var6, var7, false, var3, var4);
                } else {
                    var6.addElement("c#yellow" + Caption.dP + var7.e);
                    this.a(var6, var7, false, var3, var4);
                    if (var16 != null && this.F()) {
                        var6.addElement("c#grey" + Caption.dQ + var16.e + Caption.dN);
                        this.a(var6, var16, true, var3, var4);
                    }
                }
            }
        }

        Vector var17 = new Vector();

        int var20;
        for (var20 = 0; var20 < var6.size(); ++var20) {
            String var18 = String.valueOf(var6.elementAt(var20));
            int var5;
            Vector var19;
            if (var20 == 0) {
                var19 = VDTT_dg.a(VDTT_dg.e, var18, var2 - 5);

                for (var5 = 0; var5 < var19.size(); ++var5) {
                    var17.add(new VDTT_iu(0, (String) var19.elementAt(var5)));
                }
            } else {
                var19 = VDTT_dg.a(VDTT_dg.d, var18, var2 - 5);

                for (var5 = 0; var5 < var19.size(); ++var5) {
                    var17.add(new VDTT_iu(1, (String) var19.elementAt(var5)));
                }
            }
        }

        this.aR = new VDTT_iu[var17.size()];

        for (var20 = 0; var20 < var17.size(); ++var20) {
            this.aR[var20] = (VDTT_iu) var17.elementAt(var20);
        }

        this.ao[2][1] = new VDTT_hs((byte) 1, (this.q / 2) - 150 / 2, (this.r / 2) - 40, 150, 100, 14, this.aR.length);
        this.M();
    }

    private void K() {
        Item var1;
        if ((var1 = this.V.aR[0]) != null) {
            VDTT_gz[] var6 = var1.L();
            int var2 = 0;

            for (int var3 = 0; var3 < var6.length; ++var3) {
                if (var6[var3].b[0] == 327) {
                    int var4;
                    if ((var4 = var6[var3].b[1]) >= 0) {
                        int var5;
                        if ((var5 = var6[var3].f()) < 0) {
                            var5 = 0;
                        }

                        VDTT_ic[] var10000 = this.aH;
                        VDTT_cw.v();
                        var10000[var2] = VDTT_cw.j(var4, var5).a();
                        this.aH[var2].p = var6[var3].f() < 0;
                    } else {
                        this.aH[var2] = null;
                    }

                    ++var2;
                    if (var2 >= this.aH.length) {
                        break;
                    }
                }
            }
        }

    }

    public void h(int var1) {
        int var2 = 130;
        if (!this.F()) {
            var2 += 20;
        }

        try {
            this.aS.a(true);
            this.aT.a(true);
            if (var1 < this.aH.length) {
                this.an = var1;
                int var3 = this.V.v();
                long var4 = (long) this.V.z();
                Vector var6 = new Vector();
                VDTT_ic var7 = this.aH[var1];
                byte var8 = 0;
                short var9 = 0;
                switch (var1) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        break;
                    case 4:
                        var9 = 750;
                        var8 = 5;
                        break;
                    case 5:
                        var9 = 750;
                        var8 = 10;
                        break;
                    case 6:
                        var9 = 100;
                        var8 = 15;
                        break;
                    case 7:
                        var9 = 200;
                        var8 = 20;
                        break;
                    case 8:
                        var9 = 300;
                        var8 = 25;
                        break;
                    case 9:
                        var9 = 750;
                        var8 = 30;
                        break;
                    case 10:
                        var9 = 400;
                        var8 = 35;
                        break;
                    case 11:
                        var9 = 750;
                        var8 = 40;
                        break;
                    case 12:
                        var9 = 500;
                        var8 = 45;
                        break;
                    case 13:
                        var9 = 750;
                        var8 = 50;
                        break;
                    default:
                        return;
                }

                String var11;
                if (var7 == null) {
                    var6.addElement("c#moc" + Caption.wT);
                    if (var3 < var8) {
                        var6.addElement("c#red" + Caption.bu + DataCenter.d().a((int) var8));
                    } else {
                        var6.addElement(Caption.bu + DataCenter.d().a((int) var8));
                    }

                    var6.addElement("c#silver" + VDTT_jb.b(Caption.wU, VDTT_jb.k(var9)));
                    var11 = Caption.nt;
                    this.aS.l = var11;
                    this.aS.b(false);
                    this.aT.b(true);
                    this.aU.b(true);
                    this.aS.a(var3 < var8);
                } else {
                    this.aS.b(false);
                    this.aT.b(true);
                    this.aU.b(true);
                    var11 = Caption.dC;
                    this.aS.l = var11;
                    if (!var7.c()) {
                        this.aT.a(false);
                    }

                    VDTT_ic var16;
                    if (!this.F()) {
                        this.aS.b(true);
                        this.aT.b(true);
                        this.aU.b(true);
                    } else {
                        this.aS.b(false);
                        if (var7.e < var7.b().f) {
                            VDTT_cw.v();
                            if ((var16 = VDTT_cw.j(var7.d, var7.e + 1)).f <= var3 && var16.l <= var4) {
                                this.aS.a(false);
                            } else {
                                this.aS.a(true);
                            }
                        } else {
                            this.aS.a(true);
                        }
                    }

                    VDTT_cw.v();
                    var16 = VDTT_cw.j(var7.d, var7.e + 1);
                    if (var7.e <= 0) {
                        this.bf = var16;
                    } else {
                        VDTT_cw.v();
                        this.bf = VDTT_cw.j(var7.d, var7.e);
                    }

                    var6.addElement("c#moc" + var7.b().b);
                    if (var7.b().c != null && var7.b().c.length() > 0) {
                        var6.addElement(var7.b().c);
                    }

                    var6.addElement(Caption.ze[4] + var7.e + "/" + var7.b().f);
                    if (var7.p) {
                        var11 = Caption.nt;
                        this.aS.l = var11;
                        this.aS.b(false);
                        this.aT.b(true);
                        this.aU.b(true);
                        this.aS.a(var3 < var8);
                        if (var3 < var16.f) {
                            var6.addElement("c#red" + Caption.bu + DataCenter.d().a((int) var16.f));
                        } else {
                            var6.addElement(Caption.bu + DataCenter.d().a((int) var16.f));
                        }

                        var6.addElement("c#silver" + VDTT_jb.b(Caption.wU, VDTT_jb.k(var9)));
                    } else {
                        if (var7.b().g >= 5) {
                            var6.addElement("c#green" + Caption.dL);
                        } else if (var7.e()) {
                            var6.addElement("c#green" + Caption.mD);
                        }

                        if (var7.e == 0) {
                            var6.addElement("c#grey" + Caption.dM + var16.e + Caption.dN);
                            this.a(var6, var16, true, var3, var4);
                        } else if (var7.e == var7.b().f) {
                            var6.addElement("c#yellow" + Caption.dO);
                            this.a(var6, var7, false, var3, var4);
                        } else {
                            var6.addElement("c#yellow" + Caption.dP + var7.e);
                            this.a(var6, var7, false, var3, var4);
                            if (var16 != null && this.F()) {
                                var6.addElement("c#grey" + Caption.dQ + var16.e + Caption.dN);
                                this.a(var6, var16, true, var3, var4);
                            }
                        }
                    }
                }

                Vector var17 = new Vector();

                int var20;
                for (var20 = 0; var20 < var6.size(); ++var20) {
                    String var18 = String.valueOf(var6.elementAt(var20));
                    int var5;
                    Vector var19;
                    if (var20 == 0) {
                        var19 = VDTT_dg.a(VDTT_dg.e, var18, var2 - 5);

                        for (var5 = 0; var5 < var19.size(); ++var5) {
                            var17.add(new VDTT_iu(0, (String) var19.elementAt(var5)));
                        }
                    } else {
                        var19 = VDTT_dg.a(VDTT_dg.d, var18, var2 - 5);

                        for (var5 = 0; var5 < var19.size(); ++var5) {
                            var17.add(new VDTT_iu(1, (String) var19.elementAt(var5)));
                        }
                    }
                }

                this.aR = new VDTT_iu[var17.size()];

                for (var20 = 0; var20 < var17.size(); ++var20) {
                    this.aR[var20] = (VDTT_iu) var17.elementAt(var20);
                }

                return;
            }

            this.aR = new VDTT_iu[0];
        } catch (Exception var14) {
            return;
        } finally {
            this.ao[1][0] = new VDTT_hs((byte) 1, this.ap.objX + 53, this.ap.objY + 7 + 41, var2, 112, 14, this.aR.length);
            this.M();
        }

    }

    private static void k(int var0) {
        try {
            Message var1;
            (var1 = new Message((byte) 126)).b(var0);
            var1.l();
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final void b(int var1, Object var2) {
    }

    public final void b(Graphics var1) {
        try {
            super.b(var1);
            if (super.a.b < this.w()) {
                VDTT_gj var10000 = this.ap;
                boolean var2 = true;
                Graphics var3 = var1;
                VDTT_gj var12 = var10000;
                int var4;
                int var6;
                int var8;
                if (!var10000.h) {
                    var4 = var1.e;
                    int var5 = var1.f;
                    var12.a(var1, var12.d.objX + var12.objX, var12.d.objY + var12.objY);
                    if (!var12.c.a && var12.b.c.length * var12.a.h <= var12.r - 20) {
                        var12.a.b(var1, var12.d.objX + var12.objX, var12.d.objY + var12.objY, var12.a.q + 6, var12.a.r);
                    } else {
                        var12.a.a(var1, var12.d.objX + var12.objX, var12.d.objY + var12.objY, var12.a.q + 6, var12.a.r);
                    }

                    var6 = 0;

                    while (true) {
                        if (var6 >= var12.b.c.length) {
                            if (var12.c.a || var12.b.c.length * var12.a.h > var12.r - 20) {
                                var12.a(var3, 0, 0);
                                var3.d(0, 0, DataCenter.d().n, DataCenter.d().o);
                            }

                            var12.a(var3, var4, var5);
                            break;
                        }

                        int var7 = var6;
                        if (!var12.g[var6]) {
                            var8 = var6 * var12.a.h + var12.a.h / 2;
                            if (var6 == var12.b.b) {
                                VDTT_dc.a(var3, 64, 0, var12.c.a(var6) - 1, var8, 6);
                            } else {
                                VDTT_dc.a(var3, 63, 0, var12.c.a(var6), var8, 6);
                            }

                            if (var12.e[var6].length >= 2) {
                                var8 -= 5;
                            }

                            for (int var9 = 0; var9 < var12.e[var7].length; ++var9) {
                                if (var7 == var12.b.b) {
                                    VDTT_dg.a((VDTT_dg) VDTT_dg.b, var3, var12.e[var7][var9].toUpperCase(), var12.a.q / 2, var8 + var9 * 10 - 1, 2, -16647137, 0);
                                } else if (var12.a.l == var6) {
                                    VDTT_dg.a((VDTT_dg) VDTT_dg.b, var3, var12.e[var7][var9].toUpperCase(), var12.a.q / 2 + 2, var8 + var9 * 10 - 1 + 1, 2, -9459941, 0);
                                } else {
                                    VDTT_dg.a((VDTT_dg) VDTT_dg.b, var3, var12.e[var7][var9].toUpperCase(), var12.a.q / 2 + 1, var8 + var9 * 10 - 1, 2, -9459941, 0);
                                }
                            }

                            if (var12.f[var7]) {
                                if (var7 == var12.b.b) {
                                    VDTT_dc.a(var3, 713, 0, var12.c.a(var7) + 43, var8, 0);
                                } else {
                                    VDTT_dc.a(var3, 713, 0, var12.c.a(var7) + 44, var8, 0);
                                }
                            }
                        }

                        ++var6;
                    }
                }

                this.ap.a(var1, this.objX, this.objY);
                switch (this.ap.b.b) {
                    case 0:
                        var3 = var1;
                        VDTT_kb var13 = this;

                        try {
                            var4 = var13.aL[0].objY + var13.aL[0].r + 10;
                            if (var13.au != null) {
                                a(var3, var13.aX.objX, var13.aX.objY, var13.au, var13.aY, "");
                            }

                            var13.aL[0].a(var3);
                            String var17;
                            switch (var13.aL[0].h()) {
                                case 0:
                                    Item var16 = null;
                                    if (var13.au != null) {
                                        a(var3, var13.aX.objX, var13.aX.objY, var13.au, var13.aY, "");
                                    }

                                    for (var6 = 0; var6 < var13.aK[var13.ap.b.b][0].i; ++var6) {
                                        var17 = Caption.yh[var6];
                                        switch (var6) {
                                            case 0:
                                                var16 = var13.V.aR[2];
                                                break;
                                            case 1:
                                                if (var13.V.av == 4) {
                                                    var17 = Caption.yh[5];
                                                }

                                                var16 = var13.V.aR[4];
                                                break;
                                            case 2:
                                                var16 = var13.V.aR[6];
                                                break;
                                            case 3:
                                                var16 = var13.V.aR[8];
                                                break;
                                            case 4:
                                                var16 = var13.V.aR[14];
                                        }

                                        var8 = var13.aK[var13.ap.b.b][0].objX;
                                        if (var6 == var13.Z) {
                                            var8 += var13.aa;
                                        }

                                        a(var3, var8, var13.aK[var13.ap.b.b][0].objY + var6 * var13.aK[var13.ap.b.b][0].h, var16, var6 == var13.aK[var13.ap.b.b][0].k, var17);
                                    }

                                    a(var3, var13.aK[var13.ap.b.b][4].objX, var13.aK[var13.ap.b.b][4].objY, var13.V.aR[13], 0 == var13.aK[var13.ap.b.b][4].k, Caption.dt);
                                    a(var3, var13.aK[var13.ap.b.b][2].objX, var13.aK[var13.ap.b.b][2].objY, var13.V.aR[12], 0 == var13.aK[var13.ap.b.b][2].k, Caption.xm);
                                    a(var3, var13.aK[var13.ap.b.b][2].objX, var13.aK[var13.ap.b.b][2].objY + var13.aK[var13.ap.b.b][2].h, var13.V.aR[10], 1 == var13.aK[var13.ap.b.b][2].k, Caption.zw[0]);
                                    a(var3, var13.aK[var13.ap.b.b][2].objX, var13.aK[var13.ap.b.b][2].objY + var13.aK[var13.ap.b.b][2].h * 2, var13.V.aR[15], 2 == var13.aK[var13.ap.b.b][2].k, Caption.rK);

                                    for (var6 = 0; var6 < var13.aK[var13.ap.b.b][1].i; ++var6) {
                                        var17 = Caption.yh[var6];
                                        switch (var6) {
                                            case 0:
                                                var16 = var13.V.aS[2];
                                                break;
                                            case 1:
                                                if (var13.V.av == 4) {
                                                    var17 = Caption.yh[5];
                                                }

                                                var16 = var13.V.aS[4];
                                                break;
                                            case 2:
                                                var16 = var13.V.aS[6];
                                                break;
                                            case 3:
                                                var16 = var13.V.aS[8];
                                                break;
                                            case 4:
                                                var16 = var13.V.aS[14];
                                        }

                                        var8 = var13.aK[var13.ap.b.b][1].objX;
                                        if (var6 == var13.Z) {
                                            var8 -= var13.aa;
                                        }

                                        a(var3, var8, var13.aK[var13.ap.b.b][1].objY + var6 * var13.aK[var13.ap.b.b][1].h, var16, var6 == var13.aK[var13.ap.b.b][1].k, var17);
                                    }

                                    a(var3, var13.aK[var13.ap.b.b][3].objX, var13.aK[var13.ap.b.b][3].objY, var13.V.aS[10], 0 == var13.aK[var13.ap.b.b][3].k, Caption.zw[0]);
                                    a(var3, var13.aK[var13.ap.b.b][3].objX, var13.aK[var13.ap.b.b][3].objY + var13.aK[var13.ap.b.b][3].h, var13.V.aS[15], 1 == var13.aK[var13.ap.b.b][3].k, Caption.rK);
                                    if (var13.aE != null) {
                                        var13.aE.b(var3, var13.aE.objX, var13.aE.objY);
                                    }

                                    if (var13.V.br) {
                                        var3.c(-649022);
                                    }

                                    var13.V.a(var3, var13.q / 2, 170, var13.V.a(var13.V.aR), DataCenter.d().h / 4 % 6, var13.V.L, true, false);
                                    var3.f();
                                    var13.V.b(var3, var13.q / 2, 115);
                                    return;
                                case 1:
                                case 2:
                                    var1 = var3;
                                    VDTT_kb var18 = var13;
                                    var13.a(var3, var13.ao[var13.ap.b.b][var13.aL[0].h()]);

                                    for (var4 = 0; var4 < var18.av[var18.aL[0].h()].length; ++var4) {
                                        int var14 = var4 * var18.ao[var18.ap.b.b][var18.aL[0].h()].h;
                                        if (var18.ao[var18.ap.b.b][var18.aL[0].h()].c(var14)) {
                                            VDTT_dg.a((VDTT_dg) VDTT_dg.d, var1, var18.av[var18.aL[0].h()][var4], 10, var14 + var18.ao[var18.ap.b.b][var18.aL[0].h()].h / 2, 0, -1, 0);
                                            var14 = var1.e;
                                            int var15 = var1.f;
                                            if (var18.aL[0].h() == 1) {
                                                if (var4 == var18.ao[var18.ap.b.b][var18.aL[0].h()].i - 1) {
                                                    var18.a(var1, var14 + var18.ay[var18.ay.length - 1].objX, var15 + var18.ay[var18.ay.length - 1].objY);
                                                    var18.ay[var18.ay.length - 1].b(var1);
                                                    var18.a(var1, var14, var15);
                                                } else if (var4 == var18.ao[var18.ap.b.b][var18.aL[0].h()].i - 2) {
                                                    var18.a(var1, var14 + var18.ay[var18.ay.length - 2].objX, var15 + var18.ay[var18.ay.length - 2].objY);
                                                    var18.ay[var18.ay.length - 2].b(var1);
                                                    var18.a(var1, var14, var15);
                                                }
                                            } else if (var18.aL[0].h() == 2) {
                                                if (var4 == var18.ao[var18.ap.b.b][var18.aL[0].h()].i - 1) {
                                                    var18.a(var1, var14 + var18.aw[var18.aw.length - 1].objX, var15 + var18.aw[var18.aw.length - 1].objY);
                                                    var18.aw[var18.aw.length - 1].b(var1);
                                                    var18.a(var1, var14, var15);
                                                } else if (var4 == var18.ao[var18.ap.b.b][var18.aL[0].h()].i - 2) {
                                                    var18.a(var1, var14 + var18.aw[var18.aw.length - 2].objX, var15 + var18.aw[var18.aw.length - 2].objY);
                                                    var18.aw[var18.aw.length - 2].b(var1);
                                                    var18.a(var1, var14, var15);
                                                } else if (var4 >= 6 && var4 < 14) {
                                                    var18.a(var1, var14 + var18.aw[var4 - 6].objX, var15 + var18.aw[var4 - 6].objY);
                                                    var18.aw[var4 - 6].b(var1);
                                                    var18.a(var1, var14, var15);
                                                }
                                            }
                                        }
                                    }

                                    var18.a((Graphics) var1);
                                    var18.ao[var18.ap.b.b][var18.aL[0].h()].a(var1, var18);
                                    return;
                                case 3:
                                    var13.a(var3, var13.ao[var13.ap.b.b][var13.aL[0].h()]);

                                    for (var6 = 0; var6 < var13.ao[var13.ap.b.b][var13.aL[0].h()].i; ++var6) {
                                        if (var13.ao[var13.ap.b.b][var13.aL[0].h()].b(var6)) {
                                            var4 = var6 * var13.ao[var13.ap.b.b][var13.aL[0].h()].h + var13.ao[var13.ap.b.b][var13.aL[0].h()].h / 2;
                                            VDTT_dc.a(var3, 10, 0, 15, var4, 3);
                                            if (var6 == var13.V.ay) {
                                                VDTT_dc.a(var3, 11, 0, 15, var4, 3);
                                            }

                                            var17 = var13.V.bg[var6].a;
                                            if (var6 > 0) {
                                                var17 = var17 + "c#yellow (" + Caption.sA + (var13.V.bg[var6].b == -1 ? Caption.mJ : VDTT_jb.g((long) var13.V.bg[var6].b * 1000L)) + ")";
                                            }

                                            if (var13.ao[var13.ap.b.b][var13.aL[0].h()].l == var6) {
                                                VDTT_dg.d(VDTT_dg.d, var3, var17, 29, var4 + 1, 0, -1, 0);
                                            } else {
                                                VDTT_dg.d(VDTT_dg.d, var3, var17, 28, var4, 0, -1, 0);
                                            }
                                        }
                                    }

                                    var13.a((Graphics) var3);
                                    var13.ao[var13.ap.b.b][var13.aL[0].h()].b(var3, var13);
                                    return;
                                case 4:

                                    for (int i = 0; i < arrayXYPet.length; i++) {
                                        var4 = i;
                                        if (i < 4) {
                                            b(var1, this.arrayXYPet[i].objX, this.arrayXYPet[i].objY, (Item) null, am2 == i);
                                            if (!VDTT_eq.a().d()) {
                                                VDTT_dc.a(var3, 646, 0, this.arrayXYPet[var4].objX + 2, this.arrayXYPet[var4].objY + 2, 20);
                                            }
                                            if (skillPet[i] == null) {
                                                VDTT_dc.a(var3, 460, 0, this.arrayXYPet[var4].objX + 2, this.arrayXYPet[var4].objY + 2, 20);
                                            } else {
                                                VDTT_dc.a(var3, skillPet[i].b().h, 0, this.arrayXYPet[var4].objX + 2, this.arrayXYPet[var4].objY + 2, 20);

                                            }
                                            if (VDTT_eq.a().d()) {
                                                VDTT_dc.a(var3, 647, 0, this.arrayXYPet[var4].objX + 2, this.arrayXYPet[var4].objY + 2, 20);
                                            }
                                        } else {
                                            if (var13.V.itemPet[i - 4] == null) {
                                                String[] str = {"Pet", "Vũ khí", "Nón", "Áo"};
                                                b(var1, this.arrayXYPet[i].objX, this.arrayXYPet[i].objY, null, am2 == i);
                                                VDTT_dg.a((VDTT_dg) VDTT_dg.b, var3, str[i - 4], this.arrayXYPet[var4].objX + 14, this.arrayXYPet[var4].objY + 14, 2, -1, -10275328);
                                            } else {
                                                b(var1, this.arrayXYPet[i].objX, this.arrayXYPet[i].objY, (Item) var13.V.itemPet[i - 4], am2 == i);
                                            }
                                        }
                                    }

                                    VDTT_dg.d(VDTT_dg.d, var3, "Kinh Nghiệm: " + this.exp + "/" + this.expMax, var13.q / 2, var13.r - 45, 2, -2560, 0);

                                    var1.f(-11184811);
                                    var1.c((this.q / 2) - (102 / 2), this.r - 30 - (10 / 2), 102, 10);
                                    var1.f(-2200046);
                                    //-199529
                                    var1.c((this.q / 2) - (100 / 2), this.r - 30 - (8 / 2), exp * 100 / this.expMax, 8);
                                    if (this.am2 != -1 && !(this.am2 >= 4 && this.am2 <= 7) && skillPet[am2] != null) {
                                        this.a(var1, this.ao[2][1].objX - 2, this.ao[2][1].objY - 2, this.ao[2][1].q + 5, this.ao[2][1].r + 5, -11, 22, 23, 1, 1);
                                        var1.a(this.ao[2][1].objX, this.ao[2][1].objY - 34);

                                        this.a(var1, this.ao[2][1]);

                                        for (int var5 = 0; var5 < this.aR.length; ++var5) {
                                            int var4z = var5 * this.ao[2][1].h;
                                            if (this.ao[2][1].c(var4z)) {
                                                if (this.aR[var5].a == 0) {
                                                    VDTT_dg.d(VDTT_dg.e, var1, this.aR[var5].b, 5, var4z + 1 + this.ao[2][1].h / 2, 0, -1, -16777216);
                                                } else {
                                                    VDTT_dg.d(VDTT_dg.d, var1, this.aR[var5].b, 5, var4z + 1 + this.ao[2][1].h / 2, 0, -1, -16777216);
                                                }
                                            }
                                        }

                                        this.a((Graphics) var1);
                                        this.ao[2][1].a(var1, this, 3);
                                    }

                                    /*
                                    frame_start => frame_end
tick ~ 2
X
Y
                                     */
 /*
                                     int var7 = -65536;
      int var8 = this.a(var4 - 2);
      if (var6) {
         var8 = this.c(var4 - 2);
         var7 = -16742145;
      }

      var1.f(-11184811);
      var1.c(var2, var3 - 68, var4, var5);
      var1.f(var7);
      var1.c(var2 + 1, var3 - 67, var8, var5 - 2);
                                     */
//                                    for (int i = 0; i < arrayXYPet2.length; i++) {
//                                        b(var1, this.arrayXYPet2[i].objX, this.arrayXYPet2[i].objY, (Item) null, false);
//                                    }
                                    //388
                                    if (var13.V.itemPet[0] != null) {
                                        if (tick == 0) {
                                            for (int i = frameStart; i <= frameEnd; i++) {
                                                VDTT_dc.d(10000 + i);
                                            }
                                        }
                                        tick++;
                                        int frame = frameStart + (tick / tickSpeed) % (frameEnd - frameStart);
                                        //int frame = 400 + DataCenter.d().h / 2 % (480 - 400);
                                        //338 + DataCenter.d().h / 3 % 241;

                                        VDTT_dc.b(var3, 10000 + frame, 0, (var13.q / 2) + dxPet, (var13.r / 2) + dyPet, 3);
                                    }
                                    // VDTT_dg.d(VDTT_dg.d, var3, String.valueOf(frame)+"    "+String.valueOf( DataCenter.d().h / 3 % 241), var13.q / 2, var13.r / 2, 0, -1, 0);
                                    /*
                                     int frame = 400 + DataCenter.d().h / 3 % (480-400);
                                    //338 + DataCenter.d().h / 3 % 241;

                                    VDTT_dc.b(var3, 32000 + frame, 0, var13.q / 2, var13.r / 2, 3);
                                    VDTT_dg.d(VDTT_dg.d, var3, String.valueOf(frame)+"    "+String.valueOf( DataCenter.d().h / 3 % 241), var13.q / 2, var13.r / 2, 0, -1, 0);s
                                     */

                                    //VDTT_dc.b(var3, 32000+0 + DataCenter.d().h / 3 % 354, 0, var13.q / 2, var13.r / 2, 3);
                                    // VDTT_dc.b(var3, 32000+580 + DataCenter.d().h / 3 % 83, 0, var13.q / 2, var13.r / 2, 3);
                                    return;
                                default:
                                    return;
                            }
                        } catch (Exception var10) {
                            VDTT_jb.a(var10);
                            return;
                        }
                    case 1:
                        this.g(var1);
                        return;
                    case 2:
                        this.f(var1);
                }
            }

        } catch (Exception var11) {
            var11.printStackTrace();
        }
    }

    private void f(Graphics var1) {
        int var2 = this.ap.objX + (DataCenter.n() ? 12 : 16);
        int var3 = this.ap.objY + 7 + 5;
        if (!this.F() && this.X.m) {
            VDTT_dg.a(VDTT_dg.d, var1, Caption.dW, this.q / 2, this.r / 2 + 10, 2, -2560, 3, 0);
        } else {
            int var4 = super.q - 8 - this.ao[this.ap.b.b][0].q - 102;
            int var5 = this.ao[this.ap.b.b][0].objX + this.ao[this.ap.b.b][0].q + 4;
            if (this.F()) {
                if (DataCenter.n()) {
                    VDTT_dg.a((VDTT_dg) VDTT_dg.b, var1, Caption.tW + ":" + VDTT_jb.c(VDTT_ek.m().A()), this.ap.objX + 12, this.ap.objY + 7 + this.r - 83, 0, -2560, 0);
                    VDTT_dg.a((VDTT_dg) VDTT_dg.b, var1, Caption.pd + ": " + VDTT_jb.c(VDTT_cw.v().ce), this.ap.objX + 12, this.ap.objY + 7 + this.r - 83 + 10, 0, -6488, 0);
                } else {
                    this.a(var1, var5, this.ao[this.ap.b.b][0].objY - 2, var4, 45, -11, 22, 23, 1, 1);
                    this.a(var1, var5, this.ao[this.ap.b.b][0].objY - 2 + 46, var4, this.ao[this.ap.b.b][0].r - 41, -11, 22, 23, 1, 1);
                    VDTT_dg.a((VDTT_dg) VDTT_dg.b, var1, Caption.tW, var5 + var4 / 2, this.ao[this.ap.b.b][0].objY + 5, 2, -2560, 0);
                    VDTT_dg.a((VDTT_dg) VDTT_dg.b, var1, VDTT_jb.c(VDTT_ek.m().A()), var5 + var4 / 2, this.ao[this.ap.b.b][0].objY + 15, 2, -2560, 0);
                    VDTT_dg.a((VDTT_dg) VDTT_dg.b, var1, Caption.pd, var5 + var4 / 2, this.ao[this.ap.b.b][0].objY + 25, 2, -6488, 0);
                    VDTT_dg.a((VDTT_dg) VDTT_dg.b, var1, VDTT_jb.c(VDTT_cw.v().ce), var5 + var4 / 2, this.ao[this.ap.b.b][0].objY + 35, 2, -6488, 0);
                }
            }

            VDTT_aa.a(var1, 79, 0, 31, this.f() + 22, super.q - 8 - 54, (int) 3);
            if (!DataCenter.n()) {
                VDTT_aa.a(var1, 79, 0, 31, this.f() + this.h() - 25, super.q - 8 - 54, (int) 3);
                VDTT_aa.a(var1, 79, 90, 30, this.f() + 22, 3, (int) (this.h() - 45));
                VDTT_aa.a(var1, 79, 90, 4 + (super.q - 8) - 29, this.f() + 22, 3, (int) (this.h() - 45));
            }

            for (var4 = 0; var4 < this.bd.length; ++var4) {
                var1.f(-16742145);
                b(var1, var2 + this.bd[var4].objX, var3 + this.bd[var4].objY, (Item) null, this.am == var4);
                if (var4 >= this.W.length) {
                    if (!VDTT_eq.a().d()) {
                        VDTT_dc.a(var1, 646, 0, var2 + this.bd[var4].objX + 2, var3 + this.bd[var4].objY + 2, 20);
                    }

                    VDTT_dc.a(var1, 460, 0, var2 + this.bd[var4].objX + 2, var3 + this.bd[var4].objY + 2, 20);
                    if (VDTT_eq.a().d()) {
                        VDTT_dc.a(var1, 647, 0, var2 + this.bd[var4].objX + 2, var3 + this.bd[var4].objY + 2, 20);
                    }
                } else {
                    this.W[var4].a(var1, this.V, var2 + this.bd[var4].objX + 2, var3 + this.bd[var4].objY + 2);
                }

                VDTT_ic var7 = null;
                if (var4 == 5) {
                    var7 = VDTT_cw.v().ad[0];
                } else if (var4 == 4) {
                    var7 = VDTT_cw.v().ad[1];
                } else if (var4 == 3) {
                    var7 = VDTT_cw.v().ad[2];
                }

                if (var7 != null && var7.e < var7.b().f) {
                    VDTT_cw.v();
                    var7 = VDTT_cw.j(var7.d, var7.e + 1);
                    if (this.F() && var7 != null && var7.f <= VDTT_ek.m().w() && var7.l <= VDTT_cw.v().ce) {
                        VDTT_dc.a(var1, 713, 0, var2 + this.bd[var4].objX - 3, var3 + this.bd[var4].objY - 4, 0);
                    }
                }
            }

            this.a(var1, this.ao[this.ap.b.b][0].objX - 2, this.ao[this.ap.b.b][0].objY - 2, this.ao[this.ap.b.b][0].q + 5, this.ao[this.ap.b.b][0].r + 5, -11, 22, 23, 1, 1);
            var1.a(this.ao[this.ap.b.b][0].objX, this.ao[this.ap.b.b][0].objY - 34);
            if (this.am >= this.W.length) {
                if (this.W.length == 0) {
                    VDTT_dg.a(VDTT_dg.e, var1, Caption.vJ, this.ao[this.ap.b.b][0].q / 2, 80, 2, -2560, 3, 0);
                } else {
                    VDTT_dg.a(VDTT_dg.e, var1, Caption.sQ, this.ao[this.ap.b.b][0].q / 2, 80, 2, -2560, 3, 0);
                }
            } else {
                this.a(var1, this.ao[this.ap.b.b][0]);

                for (var5 = 0; var5 < this.aR.length; ++var5) {
                    var4 = var5 * this.ao[this.ap.b.b][0].h;
                    if (this.ao[this.ap.b.b][0].c(var4)) {
                        if (this.aR[var5].a == 0) {
                            VDTT_dg.d(VDTT_dg.e, var1, this.aR[var5].b, 5, var4 + 1 + this.ao[this.ap.b.b][0].h / 2, 0, -1, -16777216);
                        } else {
                            VDTT_dg.d(VDTT_dg.d, var1, this.aR[var5].b, 5, var4 + 1 + this.ao[this.ap.b.b][0].h / 2, 0, -1, -16777216);
                        }
                    }
                }

                this.a((Graphics) var1);
                this.ao[this.ap.b.b][0].a(var1, this, 3);
            }
        }
    }

    private void g(Graphics var1) {
        Item var2 = null;

        int var4;
        for (var4 = 0; var4 < this.aK[this.ap.b.b][0].P; ++var4) {
            switch (var4) {
                case 0:
                    var2 = this.V.aR[0];
                    break;
                case 1:
                    var2 = this.V.aR[3];
                    break;
                case 2:
                    var2 = this.V.aR[5];
                    break;
                case 3:
                    var2 = this.V.aR[7];
                    break;
                case 4:
                    var2 = this.V.aR[9];
                    break;
                case 5:
                    var2 = this.V.aR[11];
            }

            a(var1, this.aK[this.ap.b.b][0].objX + var4 * this.aK[this.ap.b.b][0].h, this.aK[this.ap.b.b][0].objY, var2, var4 == this.aK[this.ap.b.b][0].k, Caption.BQ[var4]);
        }

        if (this.V.aR[0] != null) {
            int var10 = this.ap.objX + 16;
            int var3 = this.ap.objY + 7 + 5;
            var4 = super.q - 8 - this.ao[this.ap.b.b][0].q - 102;
            int var5 = this.ao[this.ap.b.b][0].objX + this.ao[this.ap.b.b][0].q + 4;
            Item var6 = this.V.aR[0];
            if (this.F() && this.an >= 0) {
                this.a(var1, var5, this.ao[this.ap.b.b][0].objY - 2, var4, 45, -11, 22, 23, 1, 1);
                this.a(var1, var5, this.ao[this.ap.b.b][0].objY - 2 + 46, var4, this.ao[this.ap.b.b][0].r - 41, -11, 22, 23, 1, 1);
                VDTT_dg.a((VDTT_dg) VDTT_dg.b, var1, Caption.tW, var5 + var4 / 2, this.ao[this.ap.b.b][0].objY + 5, 2, -2560, 0);
                VDTT_dg.a((VDTT_dg) VDTT_dg.b, var1, VDTT_jb.c(VDTT_ek.m().y()), var5 + var4 / 2, this.ao[this.ap.b.b][0].objY + 15, 2, -2560, 0);
                VDTT_dg.a((VDTT_dg) VDTT_dg.b, var1, Caption.pd, var5 + var4 / 2, this.ao[this.ap.b.b][0].objY + 25, 2, -6488, 0);
                VDTT_dg.a((VDTT_dg) VDTT_dg.b, var1, VDTT_jb.c(VDTT_ek.m().z()), var5 + var4 / 2, this.ao[this.ap.b.b][0].objY + 35, 2, -6488, 0);
            }

            VDTT_aa.a(var1, 79, 0, 31, this.f() + 22, super.q - 8 - 54, (int) 3);
            VDTT_aa.a(var1, 79, 90, 30, this.f() + 22, 3, (int) (this.h() - 45));
            VDTT_aa.a(var1, 79, 90, 4 + (super.q - 8) - 29, this.f() + 22, 3, (int) (this.h() - 45));
            if (var6 != null) {
                for (var4 = 0; var4 < this.be.length; ++var4) {
                    var1.f(-16742145);
                    b(var1, var10 + this.be[var4].objX, var3 + this.be[var4].objY, (Item) null, this.an == var4);
                    if (var4 < this.aH.length && this.aH[var4] != null && !this.aH[var4].p) {
                        this.aH[var4].a(var1, this.V, var10 + this.be[var4].objX + 2, var3 + this.be[var4].objY + 2);
                    } else {
                        VDTT_dc.a(var1, 460, 0, var10 + this.be[var4].objX + 2, var3 + this.be[var4].objY + 2, 20);
                        if (VDTT_eq.a().d()) {
                            VDTT_dc.a(var1, 647, 0, var10 + this.be[var4].objX + 2, var3 + this.be[var4].objY + 2, 20);
                        }
                    }
                }

                if (this.an >= 0 && this.an < this.aH.length && this.F()) {
                    this.a(var1, this.ao[this.ap.b.b][0].objX - 2, this.ao[this.ap.b.b][0].objY - 2, this.ao[this.ap.b.b][0].q + 5, this.ao[this.ap.b.b][0].r + 5, -11, 22, 23, 1, 1);
                } else {
                    this.a(var1, this.ao[this.ap.b.b][0].objX - 2, this.ao[this.ap.b.b][0].objY - 2, this.ao[this.ap.b.b][0].q + 45, this.ao[this.ap.b.b][0].r + 5, -11, 22, 23, 1, 1);
                }

                var1.a(this.ao[this.ap.b.b][0].objX, this.ao[this.ap.b.b][0].objY - 34);
                if (this.an >= this.aH.length) {
                    if (this.aH.length == 0) {
                        VDTT_dg.a(VDTT_dg.e, var1, Caption.vJ, this.ao[this.ap.b.b][0].q / 2, 80, 2, -2560, 3, 0);
                        return;
                    }

                    VDTT_dg.a(VDTT_dg.e, var1, Caption.sQ, this.ao[this.ap.b.b][0].q / 2, 80, 2, -2560, 3, 0);
                    return;
                }

                if (this.an < 0 || !this.F()) {
                    VDTT_ek var10000 = this.V;
                    int var10002 = this.ao[this.ap.b.b][0].q + 22;
                    int var10003 = 80 + this.ao[this.ap.b.b][0].objY / 2;
                    Item var9;
                    VDTT_ek var11;
                    Vector var10004;
                    if ((var9 = (var11 = this.V).aR[0]) != null) {
                        Vector var13 = new Vector();
                        var11.a((Vector) var13, var9.aq(), 0, true);
                        short var12 = 0;
                        if ((var9 = var11.aR[11]) != null && var9.strOptions != null && var9.strOptions.startsWith("436,")) {
                            VDTT_gz[] var14 = var9.L();
                            VDTT_gz var8;
                            int[] var10005 = (var8 = var14[0]).b;
                            short var7 = DataCenter.d().O[var10005[1]].k;
                            var10005 = (var8 = var14[0]).b;
                            if (DataCenter.d().O[var10005[1]].a() > 0) {
                                var10005 = (var8 = var14[0]).b;
                                var7 = DataCenter.d().O[var10005[1]].a();
                            }

                            short[] var17;
                            if ((var17 = DataCenter.d().A[var7].a[0]).length == 1) {
                                if (!var9.ao() || var11.bV.bv == null) {
                                    var12 = var17[0];
                                }
                            } else if (var17.length > 0) {
                                var13.clear();
                                var11.a((Vector) var13, var7, 0, true);
                            }
                        }

                        Vector var15 = new Vector();

                        for (int var18 = 0; var18 < var13.size(); ++var18) {
                            VDTT_he var16;
                            (var16 = (VDTT_he) var13.get(var18)).a(var15, false);
                            if (var12 > 0) {
                                var16.a(var15, var12);
                            }
                        }

                        var10004 = var15;
                    } else {
                        var10004 = new Vector();
                    }

                    var10000.a(var1, var10002, var10003, var10004, DataCenter.d().h / 4 % 6, this.V.L, true, false, true, true);
                }

                this.a(var1, this.ao[this.ap.b.b][0]);

                for (var10 = 0; var10 < this.aR.length; ++var10) {
                    var4 = var10 * this.ao[this.ap.b.b][0].h;
                    if (this.ao[this.ap.b.b][0].c(var4)) {
                        if (this.aR[var10].a == 0) {
                            VDTT_dg.d(VDTT_dg.e, var1, this.aR[var10].b, 5, var4 + 1 + this.ao[this.ap.b.b][0].h / 2, 0, -1, -16777216);
                        } else {
                            VDTT_dg.d(VDTT_dg.d, var1, this.aR[var10].b, 5, var4 + 1 + this.ao[this.ap.b.b][0].h / 2, 0, -1, -16777216);
                        }
                    }
                }

                this.a((Graphics) var1);
                this.ao[this.ap.b.b][0].a(var1, this, 3);
            }

        }
    }

    public final void a_() {
        super.a_();
        if (this.V.aA > 0 && super.a.b == 0 && this.aL[0].h() == 0) {
            if (this.au == null) {
                this.au = new Item(435, true);
                this.au.strOptions = "207,0,-1;208,0,-1";
                if (this.V.aA == 15) {
                    StringBuilder var10000 = new StringBuilder();
                    Item var10002 = this.au;
                    var10002.strOptions = var10000.append(var10002.strOptions).append(";486,5,-1").toString();
                }

                this.au.a(this.V.aA);
                this.aX = new VDTT_ht((byte) 1, this.ap.objX + 48 + this.aI, this.f() + 8 + this.aI * 2, this.aI, this.aI, this.aI, 5, 1);
            }
        } else {
            this.au = null;
            this.aX = null;
        }

        if (this.F()) {
            boolean[] var6 = this.d;
            VDTT_cw.v();
            var6[2] = VDTT_cw.af();
        } else {
            this.d[2] = false;
        }

        if (this.Z >= 0 && this.aa < this.aK[0][1].objX - this.aK[0][0].objX) {
            this.aa += 15;
            if (this.aa >= this.aK[0][1].objX - this.aK[0][0].objX) {
                this.aa = this.aK[0][1].objX - this.aK[0][0].objX;
                VDTT_kb var1 = this;

                try {
                    if (var1.Z >= 0 && var1.Z < 5) {
                        Message var2;
                        (var2 = new Message((byte) 35)).a(var1.Z);
                        var2.l();
                    }
                } catch (Exception var3) {
                    VDTT_jb.a(var3);
                }
            }
        }

        if (super.a.b < this.w()) {
            this.ap.a();

            int var4;
            int var5;
            for (var4 = 0; var4 < this.aK.length; ++var4) {
                if (this.aK[var4] != null) {
                    for (var5 = 0; var5 < this.aK[var4].length; ++var5) {
                        if (this.aK[var4][var5] != null) {
                            this.aK[var4][var5].a();
                        }
                    }
                }
            }

            for (var4 = 0; var4 < this.ao.length; ++var4) {
                if (this.ao[var4] != null) {
                    for (var5 = 0; var5 < this.ao[var4].length; ++var5) {
                        if (this.ao[var4][var5] != null) {
                            this.ao[var4][var5].a();
                        }
                    }
                }
            }

            this.M();
            this.aV.b(this.V.aR[0] == null || !this.F());
        }

        this.L();
        this.F();
        if (this.aE != null) {
            this.aE.o();
            if (this.aE.p()) {
                this.aE = null;
            }
        }

    }

    private void L() {
        DataCenter.d();
        if (!DataCenter.b()) {
            int[] var2;
            int var3;
            int[] var7;
            int var8;
            int var10001;
            int var10002;
            switch (VDTT_cw.v().br) {
                case 0:
                    switch (VDTT_cw.v().bs) {
                        case 2:
                            if (super.a.b < this.w()) {
                                DataCenter.d().aA.a(this.objX + this.q - 45, this.objY + 10);
                                DataCenter.d().aA.b = true;
                                return;
                            }

                            if (super.a.b == this.w() && this.k == null) {
                                var7 = this.V.d(724);
                                if (this.k == null) {
                                    var10001 = this.objX + var7[0] + 25;
                                    DataCenter.d().aA.a(var10001, this.objY + 25 + var7[1] + 45);
                                    DataCenter.d().aA.b = true;
                                }

                                return;
                            }
                            break;
                        case 3:
                            this.y();
                    }

                    return;
                case 1:
                    if (VDTT_cw.v().bs == 0) {
                        this.am = 4;
                        if (super.a.b != 2) {
                            var10001 = this.objX + 175;
                            DataCenter.d().aA.a(var10001, this.objY + 14);
                            DataCenter.d().aA.b = true;
                            return;
                        }

                        if (this.aq.c) {
                            this.y();
                            return;
                        }

                        var10001 = this.objX + this.aq.objX + 25;
                        var10002 = this.objY + this.aq.objY;
                        DataCenter.d().aA.a(var10001, var10002 + 12);
                        DataCenter.d().aA.b = true;
                        return;
                    }

                    if (VDTT_cw.v().bs == 1) {
                        if (super.a.b != 3) {
                            var10001 = this.objX + 230;
                            DataCenter.d().aA.a(var10001, this.objY + 14);
                            DataCenter.d().aA.b = true;
                            return;
                        }

                        if (this.k == null) {
                            if ((var7 = this.V.d(824)) != null) {
                                var10001 = this.objX + var7[0] + 20;
                                DataCenter.d().aA.a(var10001, this.objY + 50 + var7[1] + 15);
                                DataCenter.d().aA.b = true;
                            }

                            return;
                        }
                    } else if (VDTT_cw.v().bs == 2) {
                        if (super.a.b != 3) {
                            var10001 = this.objX + 230;
                            DataCenter.d().aA.a(var10001, this.objY + 14);
                            DataCenter.d().aA.b = true;
                            return;
                        }

                        if (this.k == null) {
                            var7 = null;

                            for (var8 = 771; var8 <= 790; ++var8) {
                                if (!VDTT_cw.v().cL.contains(var8) && (var7 = this.V.d(var8)) != null) {
                                    VDTT_cw.v().cL.addElement(this.V.e(var8).getItemTemplate().f);
                                    break;
                                }
                            }

                            if (var7 == null) {
                                byte var12 = 0;

                                for (var3 = 0; var3 < VDTT_ek.m().aP.length; ++var3) {
                                    if (VDTT_ek.m().aP[var3] != null && VDTT_ek.m().aP[var3].y() && !VDTT_cw.v().cL.contains(VDTT_ek.m().aP[var3].getItemTemplate().f) && VDTT_ek.m().aP[var3].s >= var12) {
                                        var7 = new int[]{var3 % 9 * 32, var3 / 9 * 32};
                                        var12 = VDTT_ek.m().aP[var3].s;
                                    }
                                }
                            }

                            if (var7 == null || VDTT_cw.v().cL.size() >= 4) {
                                this.y();
                                return;
                            }

                            var10001 = this.objX + var7[0] + 20;
                            DataCenter.d().aA.a(var10001, this.objY + 50 + var7[1] + 15);
                            DataCenter.d().aA.b = true;
                        }
                    }
                case 2:
                case 3:
                case 4:
                case 6:
                case 7:
                case 9:
                case 10:
                case 11:
                case 12:
                default:
                    break;
                case 5:
                    if (VDTT_cw.v().bs == 3) {
                        if (super.a.b != 2) {
                            var10001 = this.objX + 175;
                            DataCenter.d().aA.a(var10001, this.objY + 14);
                            DataCenter.d().aA.b = true;
                            return;
                        }

                        byte var5 = 5;
                        VDTT_ic var10 = this.W[5];
                        VDTT_cw.v();
                        VDTT_ic var11 = VDTT_cw.j(var10.d, var10.e + 1);
                        if (VDTT_cw.v().ce < var11.l) {
                            var5 = 4;
                        }

                        if (this.am != var5) {
                            if (var5 == 5) {
                                DataCenter.d().aA.a(this.objX + this.q - 30, this.objY + 50);
                                DataCenter.d().aA.b = true;
                            } else {
                                DataCenter.d().aA.a(this.objX + this.q - 80, this.objY + 50);
                                DataCenter.d().aA.b = true;
                            }
                        } else {
                            if (!this.aq.c) {
                                var10001 = this.objX + this.aq.objX + 25;
                                var10002 = this.objY + this.aq.objY;
                                DataCenter.d().aA.a(var10001, var10002 + 12);
                                DataCenter.d().aA.b = true;
                                return;
                            }

                            this.y();
                        }
                    }
                    break;
                case 8:
                    VDTT_il var1 = VDTT_cw.v().T();
                    if (VDTT_cw.v().bs == 1 && var1 != null && VDTT_ek.m().objX == var1.g && VDTT_ek.m().objY == var1.h) {
                        if (super.a.b < this.w()) {
                            var10001 = this.objX + 135;
                            DataCenter.d().aA.a(var10001, this.objY + 10);
                            DataCenter.d().aA.b = true;
                            return;
                        }

                        if (super.a.b == this.w() && this.k == null && var1 != null) {
                            var2 = this.V.d(var1.b());
                            var10001 = this.objX + var2[0] + 15;
                            DataCenter.d().aA.a(var10001, this.objY + 25 + var2[1] + 15);
                            DataCenter.d().aA.b = true;
                            return;
                        }
                    } else if (VDTT_cw.v().bs == 7) {
                        if (super.a.b < this.w()) {
                            var10001 = this.objX + 135;
                            DataCenter.d().aA.a(var10001, this.objY + 10);
                            DataCenter.d().aA.b = true;
                            return;
                        }

                        if (super.a.b == this.w() && this.k == null) {
                            VDTT_ek var4 = this.V;
                            Vector var6 = new Vector();

                            for (var3 = VDTT_ek.m().aP.length - 1; var3 >= 0; --var3) {
                                if (var4.aP[var3] != null && var4.aP[var3].getItemTemplate().f == 1 && var4.aP[var3].getItemTemplate().i <= var4.w() && var4.aP[var3].getItemTemplate().g == var4.av) {
                                    var6.add(var4.aP[var3]);
                                }
                            }

                            int[] var10000;
                            label198:
                            {
                                if (var6.size() != 0) {
                                    Collections.sort(var6, Item.a);
                                    Item var9 = (Item) var6.get(0);

                                    for (var8 = VDTT_ek.m().aP.length - 1; var8 >= 0; --var8) {
                                        if (var4.aP[var8] != null && var4.aP[var8] == var9) {
                                            var10000 = new int[]{var8 % 9 * 32, var8 / 9 * 32};
                                            break label198;
                                        }
                                    }
                                }

                                var10000 = null;
                            }

                            var2 = var10000;
                            var10001 = this.objX + var2[0] + 20;
                            DataCenter.d().aA.a(var10001, this.objY + 30 + var2[1] + 15);
                            DataCenter.d().aA.b = true;
                            return;
                        }
                    } else if (VDTT_cw.v().bs == 8) {
                        if (super.a.b < this.w()) {
                            if (this.ap.b.b != 2) {
                                var10001 = this.objX + 70;
                                DataCenter.d().aA.a(var10001, this.objY + 155);
                                DataCenter.d().aA.b = true;
                            } else if (this.aN.c) {
                                var10001 = this.objX + 280;
                                DataCenter.d().aA.a(var10001, this.objY + 125);
                                DataCenter.d().aA.b = true;
                            } else {
                                var10001 = this.objX + 280;
                                DataCenter.d().aA.a(var10001, this.objY + 190);
                                DataCenter.d().aA.b = true;
                            }
                        } else {
                            var10001 = this.objX + 60;
                            DataCenter.d().aA.a(var10001, this.objY + 15);
                            DataCenter.d().aA.b = true;
                        }

                        if (this.k != null) {
                            DataCenter.d().aA.b = false;
                            return;
                        }
                    } else if (VDTT_cw.v().bs == 9) {
                        if (super.a.b >= this.w()) {
                            var10001 = this.objX + 60;
                            DataCenter.d().aA.a(var10001, this.objY + 15);
                            DataCenter.d().aA.b = true;
                            return;
                        }

                        if (this.ap.b.b != 3) {
                            var10001 = this.objX + 70;
                            DataCenter.d().aA.a(var10001, this.objY + 190);
                            DataCenter.d().aA.b = true;
                        } else if (this.aq.c) {
                            var10001 = this.objX + 280;
                            DataCenter.d().aA.a(var10001, this.objY + 80);
                            DataCenter.d().aA.b = true;
                        } else {
                            var10001 = this.objX + 280;
                            DataCenter.d().aA.a(var10001, this.objY + 190);
                            DataCenter.d().aA.b = true;
                        }

                        if (this.k != null) {
                            DataCenter.d().aA.b = false;
                            return;
                        }
                    }
                    break;
                case 13:
                    if (VDTT_cw.v().bs == 1) {
                        if (VDTT_cw.v().bX == 205 && VDTT_cw.v().bt == 0) {
                            DataCenter.d().aA.a(this.objX + this.q - 5, this.objY + 5);
                            DataCenter.d().aA.b = true;
                            return;
                        }

                        if (super.a.b < this.w()) {
                            var10001 = this.objX + 135;
                            DataCenter.d().aA.a(var10001, this.objY + 10);
                            DataCenter.d().aA.b = true;
                            return;
                        }

                        if (super.a.b == this.w() && this.k == null && (var2 = this.V.d(205)) != null) {
                            var10001 = this.objX + var2[0] + 15;
                            DataCenter.d().aA.a(var10001, this.objY + 25 + var2[1] + 15);
                            DataCenter.d().aA.b = true;
                        }
                    }
            }

        }
    }

    private void M() {
        switch (this.ap.b.b) {
            case 1:
                if (this.V.aR[0] != null && this.an >= 0 && this.an < this.aH.length && this.F()) {
                    break;
                }

                this.aU.b(true);
                this.aS.b(true);
                this.aT.b(true);
                return;
            case 2:
                if (this.am < this.W.length) {
                    this.as.a(this.W[this.am].e <= 0 || !this.W[this.am].d() || this.W[this.am].d == 30);
                    if (!this.W[this.am].c()) {
                        this.ar.a(this.W[this.am].e <= 0);
                        return;
                    }

                    this.ar.a(true);
                    return;
                }
                break;
            case 3:
                this.aJ = 15;
        }

    }

    private boolean N() {
        return this.W[this.am].b().d == 5;
    }

    public final void f(int var1) {
        if (var1 != 3 || this.F()) {
            super.f(var1);
            if (this.ap != null) {
                this.ap.b();
                if (var1 < this.w()) {
                    this.l(var1);
                }
            }

        }
    }

    private void O() {
        try {
            Message var1;
            (var1 = Message.c((byte) 6)).a(this.V.aD);
            var1.l();
        } catch (Exception var2) {
        }
    }

    private void l(int var1) {
        this.ap.a(var1);
        switch (this.ap.b.b) {
            case 0:
                this.aL[0].c();
                this.P();
                break;
            case 1:
                this.O();
                this.I();
                break;
            case 2:
                this.S();
                this.H();
        }

        if (this.D() < this.w() && this.ap.b.b != this.D()) {
            this.f(this.ap.b.b);
        }

    }

    private void P() {
        this.aL[0].a(this.aL[0].h());
        switch (this.aL[0].h()) {
            case 0:
                return;
            case 1:
                this.Q();
                return;
            case 2:
            case 3:
                this.R();
            default:
        }
    }

    private void Q() {
        try {
            Message var1;
            (var1 = Message.c((byte) -73)).a(this.V.aD);
            var1.l();
        } catch (Exception var2) {
        }
    }

    private void R() {
        try {
            Message var1;
            (var1 = new Message((byte) 63)).a(this.V.aD);
            var1.l();
        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    private void S() {
        try {
            if (this.F()) {
                Message var1;
                (var1 = new Message((byte) -62)).a(this.V.aD);
                var1.l();
            }

        } catch (Exception var2) {
            VDTT_jb.a(var2);
        }
    }

    public final Vector g() {
        Vector var1 = super.g();
        if (this.Z >= 0) {
            return var1;
        } else {
            if (super.a.b < this.w()) {
                VDTT_gj var2;
                var1.addElement((var2 = this.ap).h ? var2.a.a(var2.b.a, -10000, -10000, var2.d) : var2.a.a(var2.b.a, var2.objX, var2.objY, var2.d));
                int var3;
                int var4;
                int var5;
                switch (this.ap.b.b) {
                    case 0:
                        if (this.aX != null) {
                            var1.addElement(this.aX.a(1090, this));
                        }

                        var1.addElement(this.aL[0].f());
                        if (this.aL[0].h() == 0) {
                            for (var5 = 0; var5 < this.aK[this.ap.b.b].length; ++var5) {
                                var1.addElement(this.aK[this.ap.b.b][var5].a(1010 + var5, this));
                            }
                        }

                        if (this.aL[0].h() == 4) {
                            for (var4 = 0; var4 < this.arrayXYPet.length; ++var4) {

                                var1.add(new VDTT_hl(7000 + var4, this.arrayXYPet[var4].objX, this.arrayXYPet[var4].objY, this.arrayXYPet[var4].objX + 28, this.arrayXYPet[var4].objY + 28, (VDTT_hs) null, this));
                            }
                            var1.addElement(this.ao[2][1].a(1030, this));

                            var1.add(new VDTT_hl(2104, 4, this.f(), 4 + (super.q - 8), this.f() + this.h(), (VDTT_hs) null, this));
                        } else if (this.aL[0].h() == 3) {
                            var1.addElement(this.ao[this.ap.b.b][this.aL[0].h()].a(1301, this));
                        } else if (this.ao[0][this.aL[0].h()] != null) {
                            if (this.aL[0].h() == 1) {
                                var5 = this.ao[0][this.aL[0].h()].objX + this.ao[0][this.aL[0].h()].q - 40;

                                for (var4 = 0; var4 < this.az.length; ++var4) {
                                    if (var4 == this.az.length - 1) {
                                        var3 = this.ao[0][this.aL[0].h()].objY + (this.ao[0][this.aL[0].h()].i - 1) * this.ao[0][this.aL[0].h()].h - this.ao[0][this.aL[0].h()].f;
                                        if (VDTT_jb.a(this.ao[0][this.aL[0].h()].objX, this.ao[0][this.aL[0].h()].objY, this.ao[0][this.aL[0].h()].objX + this.ao[0][this.aL[0].h()].q, this.ao[0][this.aL[0].h()].objY + this.ao[0][this.aL[0].h()].r, var5, var3) && VDTT_jb.a(this.ao[0][this.aL[0].h()].objX, this.ao[0][this.aL[0].h()].objY, this.ao[0][this.aL[0].h()].objX + this.ao[0][this.aL[0].h()].q, this.ao[0][this.aL[0].h()].objY + this.ao[0][this.aL[0].h()].r, var5 + 40, var3 + 15)) {
                                            var1.addElement(new VDTT_hl(1400 + var4, var5, var3, var5 + 40, 15 + var3, this.ao[0][this.aL[0].h()], this));
                                        }
                                    } else if (var4 == this.az.length - 2) {
                                        var3 = this.ao[0][this.aL[0].h()].objY + (this.ao[0][this.aL[0].h()].i - 2) * this.ao[0][this.aL[0].h()].h - this.ao[0][this.aL[0].h()].f;
                                        if (VDTT_jb.a(this.ao[0][this.aL[0].h()].objX, this.ao[0][this.aL[0].h()].objY, this.ao[0][this.aL[0].h()].objX + this.ao[0][this.aL[0].h()].q, this.ao[0][this.aL[0].h()].objY + this.ao[0][this.aL[0].h()].r, var5, var3) && VDTT_jb.a(this.ao[0][this.aL[0].h()].objX, this.ao[0][this.aL[0].h()].objY, this.ao[0][this.aL[0].h()].objX + this.ao[0][this.aL[0].h()].q, this.ao[0][this.aL[0].h()].objY + this.ao[0][this.aL[0].h()].r, var5 + 40, var3 + 15)) {
                                            var1.addElement(new VDTT_hl(1400 + var4, var5, var3, var5 + 40, 15 + var3, this.ao[0][this.aL[0].h()], this));
                                        }
                                    }
                                }
                            } else if (this.aL[0].h() == 2) {
                                var5 = this.ao[0][this.aL[0].h()].objX + this.ao[0][this.aL[0].h()].q - 40;

                                for (var4 = 0; var4 < this.ax.length; ++var4) {
                                    if (var4 == this.ax.length - 1) {
                                        var3 = this.ao[0][this.aL[0].h()].objY + (this.ao[0][this.aL[0].h()].i - 1) * this.ao[0][this.aL[0].h()].h - this.ao[0][this.aL[0].h()].f;
                                        if (VDTT_jb.a(this.ao[0][this.aL[0].h()].objX, this.ao[0][this.aL[0].h()].objY, this.ao[0][this.aL[0].h()].objX + this.ao[0][this.aL[0].h()].q, this.ao[0][this.aL[0].h()].objY + this.ao[0][this.aL[0].h()].r, var5, var3) && VDTT_jb.a(this.ao[0][this.aL[0].h()].objX, this.ao[0][this.aL[0].h()].objY, this.ao[0][this.aL[0].h()].objX + this.ao[0][this.aL[0].h()].q, this.ao[0][this.aL[0].h()].objY + this.ao[0][this.aL[0].h()].r, var5 + 40, var3 + 15)) {
                                            var1.addElement(new VDTT_hl(1400 + var4, var5, var3, var5 + 40, 15 + var3, this.ao[0][this.aL[0].h()], this));
                                        }
                                    } else if (var4 == this.ax.length - 2) {
                                        var3 = this.ao[0][this.aL[0].h()].objY + (this.ao[0][this.aL[0].h()].i - 2) * this.ao[0][this.aL[0].h()].h - this.ao[0][this.aL[0].h()].f;
                                        if (VDTT_jb.a(this.ao[0][this.aL[0].h()].objX, this.ao[0][this.aL[0].h()].objY, this.ao[0][this.aL[0].h()].objX + this.ao[0][this.aL[0].h()].q, this.ao[0][this.aL[0].h()].objY + this.ao[0][this.aL[0].h()].r, var5, var3) && VDTT_jb.a(this.ao[0][this.aL[0].h()].objX, this.ao[0][this.aL[0].h()].objY, this.ao[0][this.aL[0].h()].objX + this.ao[0][this.aL[0].h()].q, this.ao[0][this.aL[0].h()].objY + this.ao[0][this.aL[0].h()].r, var5 + 40, var3 + 15)) {
                                            var1.addElement(new VDTT_hl(1400 + var4, var5, var3, var5 + 40, 15 + var3, this.ao[0][this.aL[0].h()], this));
                                        }
                                    } else if (this.ao[0][this.aL[0].h()].b(6 + var4)) {
                                        var3 = this.ao[0][this.aL[0].h()].objY + (6 + var4) * this.ao[0][this.aL[0].h()].h - this.ao[0][this.aL[0].h()].f;
                                        if (VDTT_jb.a(this.ao[0][this.aL[0].h()].objX, this.ao[0][this.aL[0].h()].objY, this.ao[0][this.aL[0].h()].objX + this.ao[0][this.aL[0].h()].q, this.ao[0][this.aL[0].h()].objY + this.ao[0][this.aL[0].h()].r, var5, var3) && VDTT_jb.a(this.ao[0][this.aL[0].h()].objX, this.ao[0][this.aL[0].h()].objY, this.ao[0][this.aL[0].h()].objX + this.ao[0][this.aL[0].h()].q, this.ao[0][this.aL[0].h()].objY + this.ao[0][this.aL[0].h()].r, var5 + 40, var3 + 15)) {
                                            var1.addElement(new VDTT_hl(1400 + var4, var5, var3, var5 + 40, 15 + var3, this.ao[0][this.aL[0].h()], this));
                                        }
                                    }
                                }
                            }

                            var1.addElement(this.ao[0][this.aL[0].h()].a(999, this));
                        }
                        break;
                    case 1:
                        for (var5 = 0; var5 < this.aK[this.ap.b.b].length; ++var5) {
                            var1.addElement(this.aK[this.ap.b.b][var5].a(1020 + var5, this));
                        }

                        if (this.V.aR[0] != null) {
                            var1.addElement(this.ao[this.ap.b.b][0].a(1230, this));
                            if (VDTT_cw.v().br != 1 || VDTT_cw.v().bs != 0) {
                                var5 = this.ap.objX + 16;
                                var3 = this.ap.objY + 7 + 5;

                                for (var4 = 0; var4 < this.be.length; ++var4) {
                                    var1.add(new VDTT_hl(5000 + var4, var5 + this.be[var4].objX, var3 + this.be[var4].objY, var5 + this.be[var4].objX + 28, var3 + this.be[var4].objY + 28, (VDTT_hs) null, this));
                                }

                                if (this.an >= 0) {
                                    var1.add(new VDTT_hl(2105, this.ao[this.ap.b.b][0].objX + this.ao[this.ap.b.b][0].q, this.ao[this.ap.b.b][0].objY, this.ao[this.ap.b.b][0].objX + this.ao[this.ap.b.b][0].q + 65, this.ao[this.ap.b.b][0].objY + this.ao[this.ap.b.b][0].r, (VDTT_hs) null, this));
                                } else {
                                    var1.add(new VDTT_hl(2105, this.ao[this.ap.b.b][0].objX + this.ao[this.ap.b.b][0].q, this.ao[this.ap.b.b][0].objY, this.ao[this.ap.b.b][0].objX + this.ao[this.ap.b.b][0].q + 42, this.ao[this.ap.b.b][0].objY + this.ao[this.ap.b.b][0].r, (VDTT_hs) null, this));
                                }

                                var1.add(new VDTT_hl(2104, 4, this.f(), 4 + (super.q - 8), this.f() + this.h(), (VDTT_hs) null, this));
                            }
                        }
                        break;
                    case 2:
                        if (this.F() || !this.F() && !this.X.m) {
                            var1.addElement(this.ao[this.ap.b.b][0].a(1030, this));
                            if (VDTT_cw.v().br != 1 || VDTT_cw.v().bs != 0) {
                                var5 = this.ap.objX + 16;
                                var3 = this.ap.objY + 7 + 5;

                                for (var4 = 0; var4 < this.bd.length; ++var4) {
                                    var1.add(new VDTT_hl(4000 + var4, var5 + this.bd[var4].objX, var3 + this.bd[var4].objY, var5 + this.bd[var4].objX + 28, var3 + this.bd[var4].objY + 28, (VDTT_hs) null, this));
                                }
                            }
                        }
                }
            }

            return var1;
        }
    }

    public final void a(VDTT_ca var1) {
        VDTT_ca var10000;
        int var2;
        if (var1.equals(this.aM[0])) {
            var10000 = this.aM[0];
            var2 = this.aM[0].h() + this.T;
            var10000.T = var2;
        } else if (var1.equals(this.aM[1])) {
            var10000 = this.aM[1];
            var2 = this.aM[1].h() + this.T;
            var10000.T = var2;
        } else if (var1.equals(this.aM[2])) {
            var10000 = this.aM[2];
            var2 = this.aM[2].h() + this.T;
            var10000.T = var2;
        } else {
            if (var1.equals(this.aM[3])) {
                var10000 = this.aM[3];
                var2 = this.aM[3].h() + this.T;
                var10000.T = var2;
            }

        }
    }

    private static void m(int var0) {
        try {
            Message var1;
            (var1 = Message.c((byte) 8)).a(var0);
            var1.l();
        } catch (Exception var2) {
        }
    }

    public final void perform(int var1, Object var2, VDTT_z var3) {
        super.perform(var1, var2, var3);

        try {
            Message var5;
            switch (var1) {
                case 1002:
                    DataCenter.d().ai.c(Caption.xB + (this.at.n.b + 1), -2560);
                    (var5 = Message.c((byte) 19)).a(this.at.n.b);
                    var5.l();
                default:
                    return;
                case 1234:
                    (var5 = Message.c((byte) -109)).a(this.X.m);
                    var5.l();
                    break;
                case 2110:
                case 2111:
                case 2112:
                case 2113:
                case 2114:
                case 2116:
                case 2117:
                    m(var1 - 2110);
                    break;
                case 2115:
                    if ((var1 = 150 * (VDTT_ek.m().y() / 10000000)) < 150) {
                        var1 = 150;
                    } else if (var1 > 1500) {
                        var1 = 1500;
                    }

                    DataCenter.d().ai.a(VDTT_jb.b(Caption.wY, VDTT_jb.c(var1)), 2107, this);
            }
        } catch (Exception var4) {
        }

    }

    public final void b(VDTT_ca var1) {
        int var2;
        if ((var2 = var1.h()) > var1.T) {
            var1.a("" + var1.T);
        }

        if (var2 < var1.S) {
            var1.a("" + var1.S);
        }

        this.T = this.U - (this.aM[0].h() - this.P + (this.aM[1].h() - this.Q) + (this.aM[2].h() - this.S) + (this.aM[3].h() - this.R));
    }

    public final void H() {
        this.g(this.am);
    }

    public final void I() {
        this.K();
        if (this.an < 0) {
            this.J();
        } else {
            this.h(this.an);
        }
    }

    public final void j(int var1) {
        if (this.F()) {
            String var2 = Caption.BR[var1];
            this.aV.l = var2;
        }
    }
}
