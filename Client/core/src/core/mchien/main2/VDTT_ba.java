package core.mchien.main2;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import java.util.Vector;

public class VDTT_ba extends VDTT_m {
   public String l;
   public int m;
   public int n = -1;
   public short I;
   public short J;
   public int K;
   public int L;
   public Object M;
   public boolean N;
   public byte O;
   public VDTT_hi P;
   protected long Q = Long.MIN_VALUE;
   private long R;
   private boolean S;

   public VDTT_ba(int var1, int var2, int var3, int var4, String var5, MainScreen var6, int var7, int var8) {
      this.l = var5;
      this.a = var6;
      this.m = var7;
      this.L = 30;
      this.J = (short)var8;
      this.f(var1, var2);
      this.b(var8);
   }

   public final void a(int var1) {
      this.I = (short)var1;
      if (var1 == 100) {
         this.d(VDTT_jb.n(50), VDTT_jb.n(50));
      }

   }

   public final void b(int var1) {
      this.I = (short)var1;
      switch(var1) {
      case -679:
      case -52:
      case 578:
      case 579:
      case 580:
      case 581:
      case 582:
      case 675:
      case 676:
      case 678:
      case 679:
      case 680:
      case 681:
      case 687:
         this.d(VDTT_jb.n(24), VDTT_jb.n(24));
         return;
      case -107:
      case -15:
      case 73:
      case 82:
      case 552:
      case 572:
         this.d(36, 14);
         return;
      case -92:
         this.d(12, 18);
         return;
      case -91:
      case 91:
         this.d(23, 31);
         return;
      case -36:
         this.d(65, 26);
         return;
      case -35:
      case -34:
      case -33:
      case -14:
      case 673:
      case 674:
      case 677:
      case 683:
      case 688:
      case 689:
      case 690:
      case 740:
      case 741:
         this.d(VDTT_jb.n(20), VDTT_jb.n(20));
         return;
      case -32:
      case -25:
      case -9:
      case -6:
      case -5:
      case -4:
      case -3:
         this.d(44, 20);
         return;
      case -31:
      case -17:
         this.d(30, 14);
         return;
      case -30:
      case -29:
         this.L = -10;
         this.d(74, 20);
         return;
      case -28:
      case -8:
         this.L = -10;
         this.d(60, 20);
         return;
      case -27:
      case -26:
      case 49:
         this.d(20, 20);
         return;
      case -24:
      case 12:
      case 23:
      case 33:
      case 38:
      case 39:
      case 57:
      case 58:
      case 59:
      case 90:
         this.d(16, 16);
         return;
      case -23:
      case -22:
      case -21:
      case -20:
      case -19:
      case -18:
      case 256:
         this.d(20, 20);
         return;
      case -16:
         this.d(VDTT_jb.n(16), VDTT_jb.n(14));
         return;
      case -13:
      case 17:
      case 81:
      case 557:
         this.d(VDTT_jb.n(25), VDTT_jb.n(25));
         return;
      case -12:
      case 554:
         this.d(VDTT_jb.n(25), VDTT_jb.n(25));
         return;
      case -11:
         this.d(11, 30);
         return;
      case -10:
         this.d(102, 20);
         return;
      case -7:
         this.d(50, 20);
         return;
      case -2:
         this.d(20, 20);
         return;
      case 6:
         this.d(20, 20);
         return;
      case 7:
      case 9:
      case 13:
         this.L = -10;
         this.d(74, 20);
         return;
      case 14:
      case 67:
      case 75:
      case 76:
      case 77:
      case 78:
      case 84:
      case 85:
      case 455:
      case 522:
         this.d(20, 20);
         return;
      case 15:
         this.d(60, 20);
         return;
      case 16:
         this.L = 40;
         this.d(28, 28);
         return;
      case 18:
         this.d(30, 30);
         return;
      case 19:
         this.d(30, 30);
         return;
      case 20:
         this.d(VDTT_jb.n(60), VDTT_jb.n(60));
         return;
      case 21:
         this.d(74, 15);
         return;
      case 25:
         this.d(28, 20);
         return;
      case 42:
      case 61:
         this.d(30, 30);
         return;
      case 43:
      case 74:
      case 86:
         this.d(18, 18);
         return;
      case 52:
         this.d(14, 14);
         return;
      case 65:
         this.d(18, 18);
         return;
      case 66:
         this.d(65, 32);
         return;
      case 79:
         this.d(73, 83);
         return;
      case 89:
      case 566:
         this.d(VDTT_jb.n(18), VDTT_jb.n(18));
         return;
      case 94:
      case 672:
         this.d(VDTT_jb.n(20), VDTT_jb.n(20));
         return;
      case 100:
         this.d(VDTT_jb.n(50), VDTT_jb.n(50));
         return;
      case 286:
      case 287:
         this.d(15, 12);
         return;
      case 288:
         this.d(15, 14);
         return;
      case 373:
         this.d(50, 16);
         return;
      case 374:
         this.d(16, 16);
         return;
      case 382:
         this.d(16, 16);
         return;
      case 398:
         this.d(18, 16);
         return;
      case 460:
         this.d(VDTT_jb.n(25), VDTT_jb.n(25));
         return;
      case 638:
         this.d(16, 16);
         return;
      case 671:
         this.d(44, 18);
         return;
      case 684:
         this.d(36, 14);
         return;
      case 709:
         this.d(60, 60);
         return;
      case 715:
         this.d(14, 14);
         return;
      case 722:
      case 723:
      case 724:
      case 725:
         this.d(VDTT_jb.n(50), VDTT_jb.n(14));
         return;
      case 738:
         this.d(52, 52);
      default:
      }
   }

   public void a_() {
      if (this.m == 1020 && this.d() && this.a instanceof VDTT_cw && !MenuConfig.K().W) {
         if (this.Q == Long.MIN_VALUE) {
            this.Q = VDTT_jb.a();
         } else if (VDTT_jb.a() - this.Q >= 500L) {
            MenuConfig.S = true;
            MenuConfig.K().a(true);
            VDTT_cw.v().bg = null;
         }
      }

      if (this.P != null) {
         this.P.o();
         if (this.P.p()) {
            this.P = null;
         }
      }

   }

   public void r() {
      super.r();
      this.Q = Long.MIN_VALUE;
   }

   public final void c() {
      if (!this.c && !this.d) {
         if (this.d()) {
            if (this.I != 57 && this.I != 58) {
               if (this.I == 90) {
                  try {
                     if (this.R == 0L) {
                        VDTT_au.b();
                        if (!VDTT_au.a()) {
                           this.R = VDTT_jb.a();
                           VDTT_cw.v().b((String) Caption.sK);
                           return;
                        }

                        VDTT_cw.v().da = this.R = VDTT_jb.a();
                        if (VDTT_au.c.length() > 0 && VDTT_jb.a() - VDTT_au.b < 30000L) {
                           VDTT_au.a(this.I == 89);
                           return;
                        }

                        VDTT_au.c = "";
                        Message var5;
                        (var5 = Message.c((byte)-30)).a(this.I == 89);
                        var5.l();
                     } else if (VDTT_cw.v().da > 0L) {
                        long var1;
                        if ((var1 = VDTT_jb.a() - VDTT_cw.v().da) <= 10000L && VDTT_cw.v().c instanceof VDTT_kd) {
                           if (var1 > 1000L && VDTT_au.b().d) {
                              VDTT_cw.v().b(Caption.sM, -3407617);
                           }
                        } else {
                           VDTT_au.b().c();
                        }
                     }
                  } catch (Exception var4) {
                  }
               }
            } else if (this.R == 0L) {
               this.R = VDTT_jb.a();
            } else if (!this.S) {
               if (VDTT_jb.a() - this.R > 400L) {
                  this.S = true;
               }
            } else if (VDTT_jb.a() - this.R > 60L) {
               this.R = VDTT_jb.a();
               this.a.a(this.m, this.M, this);
            }

            this.a.a(this.m, this.M);
         } else {
            if (VDTT_cw.v().da > 0L && this.I == 90) {
               VDTT_au.b().c();
            }

            this.R = 0L;
            this.S = false;
         }

         if (this.o.a[5]) {
            this.a.a(this.m, this.M, this);
         }

      }
   }

   public void b(Graphics var1) {
      int var2 = 0;
      int var3 = 0;
      boolean var10 = false;

      label5807: {
         label5808: {
            label5809: {
               label5810: {
                  label5811: {
                     label5812: {
                        label5813: {
                           label5814: {
                              label5815: {
                                 label5816: {
                                    label5817: {
                                       label5818: {
                                          label5819: {
                                             label5820: {
                                                label5821: {
                                                   label5822: {
                                                      label5823: {
                                                         label5824: {
                                                            label5825: {
                                                               label5826: {
                                                                  label5827: {
                                                                     label5828: {
                                                                        label5829: {
                                                                           label5830: {
                                                                              label5831: {
                                                                                 label5832: {
                                                                                    label5833: {
                                                                                       label5834: {
                                                                                          label5927: {
                                                                                             label5836: {
                                                                                                label5837: {
                                                                                                   label5838: {
                                                                                                      label5839: {
                                                                                                         label5840: {
                                                                                                            label5841: {
                                                                                                               label5928: {
                                                                                                                  label5843: {
                                                                                                                     label5929: {
                                                                                                                        label5845: {
                                                                                                                           label5846: {
                                                                                                                              label5847: {
                                                                                                                                 label5848: {
                                                                                                                                    label5849: {
                                                                                                                                       label5850: {
                                                                                                                                          label5851: {
                                                                                                                                             label5852: {
                                                                                                                                                label5853: {
                                                                                                                                                   label5854: {
                                                                                                                                                      label5855: {
                                                                                                                                                         label5856: {
                                                                                                                                                            label5857: {
                                                                                                                                                               label5858: {
                                                                                                                                                                  label5859: {
                                                                                                                                                                     label5860: {
                                                                                                                                                                        label5861: {
                                                                                                                                                                           label5862: {
                                                                                                                                                                              label5863: {
                                                                                                                                                                                 try {
                                                                                                                                                                                    var10 = true;
                                                                                                                                                                                    if (this.d) {
                                                                                                                                                                                       var10 = false;
                                                                                                                                                                                       break label5929;
                                                                                                                                                                                    }

                                                                                                                                                                                    if (this.O == 1) {
                                                                                                                                                                                       var2 = var1.m();
                                                                                                                                                                                       var3 = var1.n();
                                                                                                                                                                                       this.a(var1, -5000, -5000);
                                                                                                                                                                                    }

                                                                                                                                                                                    short var4 = this.I;
                                                                                                                                                                                    if (VDTT_dc.c(7) == null) {
                                                                                                                                                                                       var1.f(7682054);
                                                                                                                                                                                       var1.c(0, 0, this.q, this.r);
                                                                                                                                                                                       VDTT_jb.a((Graphics)var1, this.q, this.r);
                                                                                                                                                                                    }

                                                                                                                                                                                    if (this.d()) {
                                                                                                                                                                                       var1.e(30);
                                                                                                                                                                                    }

                                                                                                                                                                                    label5741: {
                                                                                                                                                                                       label5740: {
                                                                                                                                                                                          label5739: {
                                                                                                                                                                                             label5738: {
                                                                                                                                                                                                label5737: {
                                                                                                                                                                                                   label5736: {
                                                                                                                                                                                                      label5735: {
                                                                                                                                                                                                         label5734: {
                                                                                                                                                                                                            label5733: {
                                                                                                                                                                                                               label5732: {
                                                                                                                                                                                                                  label5731: {
                                                                                                                                                                                                                     label5730: {
                                                                                                                                                                                                                        label5729: {
                                                                                                                                                                                                                           label5728: {
                                                                                                                                                                                                                              label5727: {
                                                                                                                                                                                                                                 label5726: {
                                                                                                                                                                                                                                    label5725: {
                                                                                                                                                                                                                                       label5724: {
                                                                                                                                                                                                                                          label5723: {
                                                                                                                                                                                                                                             label5722: {
                                                                                                                                                                                                                                                label5721: {
                                                                                                                                                                                                                                                   label5720: {
                                                                                                                                                                                                                                                      label5719: {
                                                                                                                                                                                                                                                         label5718: {
                                                                                                                                                                                                                                                            label5717: {
                                                                                                                                                                                                                                                               label5716: {
                                                                                                                                                                                                                                                                  label5715: {
                                                                                                                                                                                                                                                                     label5714: {
                                                                                                                                                                                                                                                                        label5713: {
                                                                                                                                                                                                                                                                           label5712: {
                                                                                                                                                                                                                                                                              label5711: {
                                                                                                                                                                                                                                                                                 label5710: {
                                                                                                                                                                                                                                                                                    label5709: {
                                                                                                                                                                                                                                                                                       label5708: {
                                                                                                                                                                                                                                                                                          label5707: {
                                                                                                                                                                                                                                                                                             label5706: {
                                                                                                                                                                                                                                                                                                label5705: {
                                                                                                                                                                                                                                                                                                   label5704: {
                                                                                                                                                                                                                                                                                                      label5703: {
                                                                                                                                                                                                                                                                                                         label5702: {
                                                                                                                                                                                                                                                                                                            label5701: {
                                                                                                                                                                                                                                                                                                               label5700: {
                                                                                                                                                                                                                                                                                                                  label5699: {
                                                                                                                                                                                                                                                                                                                     label5698: {
                                                                                                                                                                                                                                                                                                                        label5697: {
                                                                                                                                                                                                                                                                                                                           label5696: {
                                                                                                                                                                                                                                                                                                                              label5695: {
                                                                                                                                                                                                                                                                                                                                 label5694: {
                                                                                                                                                                                                                                                                                                                                    label5693: {
                                                                                                                                                                                                                                                                                                                                       label5692: {
                                                                                                                                                                                                                                                                                                                                          label5691: {
                                                                                                                                                                                                                                                                                                                                             label5690: {
                                                                                                                                                                                                                                                                                                                                                label5689: {
                                                                                                                                                                                                                                                                                                                                                   label5688: {
                                                                                                                                                                                                                                                                                                                                                      label5687: {
                                                                                                                                                                                                                                                                                                                                                         label5686: {
                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                               label5920: {
                                                                                                                                                                                                                                                                                                                                                                  if (this.equals(VDTT_cw.v().aO)) {
                                                                                                                                                                                                                                                                                                                                                                     if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, var4, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, 647, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                     }
                                                                                                                                                                                                                                                                                                                                                                  } else if (VDTT_cw.v() != null && VDTT_cw.v().a(this)) {
                                                                                                                                                                                                                                                                                                                                                                     if (VDTT_eq.a().d()) {
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, var4, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, 647, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                     } else if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, 646, 0, 0, 0, VDTT_jb.n(100));
                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, var4, 0, 0, 0, VDTT_jb.n(100));
                                                                                                                                                                                                                                                                                                                                                                     }
                                                                                                                                                                                                                                                                                                                                                                  } else if (this.J == 460) {
                                                                                                                                                                                                                                                                                                                                                                     if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.b(var1, var4, this.K, -1, -1, this.q + 2, this.r + 2);
                                                                                                                                                                                                                                                                                                                                                                     }
                                                                                                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                                                                                                     if (this.I == 671 && DataCenter.l()) {
                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, 7, this.K, 1, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.d, var1, Caption.wy, this.q / 2 + 1, this.r / 2 + 1, 2, -1, -65536);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.d, var1, Caption.wy, this.q / 2, this.r / 2, 2, -1, -65536);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5721;
                                                                                                                                                                                                                                                                                                                                                                     }

                                                                                                                                                                                                                                                                                                                                                                     BitmapFont var10000;
                                                                                                                                                                                                                                                                                                                                                                     String var10002;
                                                                                                                                                                                                                                                                                                                                                                     String[] var19;
                                                                                                                                                                                                                                                                                                                                                                     int var10003;
                                                                                                                                                                                                                                                                                                                                                                     int var10004;
                                                                                                                                                                                                                                                                                                                                                                     int var21;
                                                                                                                                                                                                                                                                                                                                                                     switch(this.I) {
                                                                                                                                                                                                                                                                                                                                                                     case -679:
                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, 679, this.K, this.q / 2, this.r / 2, VDTT_jb.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                        VDTT_dg.a((VDTT_dg)VDTT_dg.c, var1, this.l, this.q / 2, this.r - 6, 2, -1, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        break label5688;
                                                                                                                                                                                                                                                                                                                                                                     case -107:
                                                                                                                                                                                                                                                                                                                                                                        var1.p();
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 2, this.q, this.r - 3, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        var1.r();
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.b, var1, this.l, this.q / 2 + 1, this.r / 2 + 1, 2, -6908266, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.b, var1, this.l, this.q / 2, this.r / 2, 2, -1, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5723;
                                                                                                                                                                                                                                                                                                                                                                     case -92:
                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, 91, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                        break label5699;
                                                                                                                                                                                                                                                                                                                                                                     case -91:
                                                                                                                                                                                                                                                                                                                                                                        VDTT_dc.a(var1, 91, this.K, 0, 0, 20);
                                                                                                                                                                                                                                                                                                                                                                        break label5686;
                                                                                                                                                                                                                                                                                                                                                                     case -52:
                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, 52, this.K, this.q / 2, this.r / 2, VDTT_jb.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                        VDTT_dg.a((VDTT_dg)VDTT_dg.c, var1, this.l, this.q / 2, this.r - 6, 2, -1, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        break label5692;
                                                                                                                                                                                                                                                                                                                                                                     case -36:
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, -1, this.q, this.r + 2, 7, 3, 4, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        if ((var19 = this.l.split("\n")).length == 1) {
                                                                                                                                                                                                                                                                                                                                                                           if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                              VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, var19[0], this.q / 2 + 1, this.r / 2, 2, -1, -16742145);
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, var19[0], this.q / 2, this.r / 2 - 1, 2, -1, 0);
                                                                                                                                                                                                                                                                                                                                                                           }
                                                                                                                                                                                                                                                                                                                                                                        } else if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, var19[0], this.q / 2 + 1, this.r / 2 - 4, 2, -1, -16742145);
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, var19[1], this.q / 2 + 1, this.r / 2 + 4, 2, -1, -16742145);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, var19[0], this.q / 2, this.r / 2 - 4 - 1, 2, -1, 0);
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, var19[1], this.q / 2, this.r / 2 + 4 - 1, 2, -1, 0);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5735;
                                                                                                                                                                                                                                                                                                                                                                     case -35:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d() || VDTT_cw.v().aA.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.b(var1, 689, this.K, 0, 0, this.q, this.r);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (VDTT_cw.v().aU) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, DataCenter.d().h % 24 < 12 ? 713 : 454, this.K, this.q / 2 - VDTT_jb.n(5), this.r / 2 - VDTT_jb.n(5), VDTT_jb.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                        VDTT_dg.a((VDTT_dg)VDTT_dg.c, var1, this.l, this.q / 2, this.r - 6, 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -34:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d() || VDTT_cw.v().aA.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.b(var1, 673, this.K, 0, 0, this.q, this.r);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -33:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d() || VDTT_cw.v().aA.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.b(var1, 674, this.K, 0, 0, this.q, this.r);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -32:
                                                                                                                                                                                                                                                                                                                                                                        if (this.c) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, 370, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                           var1.e(30);
                                                                                                                                                                                                                                                                                                                                                                           var21 = this.q / 2 - 13;
                                                                                                                                                                                                                                                                                                                                                                           if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                              a(var1, var21 + 1, this.r / 2 + 2, "", (byte)7);
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              a(var1, var21, this.r / 2 - 1 + 2, "", (byte)7);
                                                                                                                                                                                                                                                                                                                                                                           }

                                                                                                                                                                                                                                                                                                                                                                           var1.h();
                                                                                                                                                                                                                                                                                                                                                                           break label5737;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, 7, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                        var1.h();
                                                                                                                                                                                                                                                                                                                                                                        var21 = this.q / 2 - 13;
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           a(var1, var21 + 1, this.r / 2 + 2, "", (byte)7);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           a(var1, var21, this.r / 2 - 1 + 2, "", (byte)7);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -31:
                                                                                                                                                                                                                                                                                                                                                                        var1.h();
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.d(VDTT_dg.b, var1, this.l, this.q / 2 + 1, this.r / 2 + 1, 2, -9457905, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.d(VDTT_dg.b, var1, this.l, this.q / 2 + 1, this.r / 2, 2, -9457905, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5730;
                                                                                                                                                                                                                                                                                                                                                                     case -30:
                                                                                                                                                                                                                                                                                                                                                                        var1.c(199.0F);
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, -1, this.q, this.r + 2, 7, 3, 4, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        var1.r();
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.d, var1, this.l, this.q / 2 + 1, this.r / 2, 2, -1, 0);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.d, var1, this.l, this.q / 2, this.r / 2 - 1, 2, -1, 0);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5698;
                                                                                                                                                                                                                                                                                                                                                                     case -29:
                                                                                                                                                                                                                                                                                                                                                                        var1.c(-18.0F);
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, -1, this.q, this.r + 2, 7, 3, 4, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        var1.r();
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.d, var1, this.l, this.q / 2 + 1, this.r / 2, 2, -1, 0);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.d, var1, this.l, this.q / 2, this.r / 2 - 1, 2, -1, 0);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5700;
                                                                                                                                                                                                                                                                                                                                                                     case -28:
                                                                                                                                                                                                                                                                                                                                                                        if (this.c) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, 370, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.d, var1, this.l, this.q / 2, this.r / 2, 2, -11184811, 0);
                                                                                                                                                                                                                                                                                                                                                                           break label5702;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, 7, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                        var21 = 0;
                                                                                                                                                                                                                                                                                                                                                                        byte var24 = 0;
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           var21 = 1;
                                                                                                                                                                                                                                                                                                                                                                           var24 = 1;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (VDTT_cw.v().cZ == 1) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, 44, 0, 2 + var21, 2 + var24, 88);
                                                                                                                                                                                                                                                                                                                                                                           var21 += 3;
                                                                                                                                                                                                                                                                                                                                                                        } else if (VDTT_cw.v().cZ == 2) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, 65, 0, 2 + var21, 2 + var24, 88);
                                                                                                                                                                                                                                                                                                                                                                           var21 += 3;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_dg.a(var1, this.l, this.q / 2 + var21, this.r / 2 + var24, 2, -1);
                                                                                                                                                                                                                                                                                                                                                                        break label5707;
                                                                                                                                                                                                                                                                                                                                                                     case -27:
                                                                                                                                                                                                                                                                                                                                                                        VDTT_dc.a(var1, 49, this.K, this.q / 2, this.r / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -26:
                                                                                                                                                                                                                                                                                                                                                                        VDTT_dc.a(var1, 52, this.K, this.q / 2, this.r / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -25:
                                                                                                                                                                                                                                                                                                                                                                        if (this.c) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, 370, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                           var1.e(30);
                                                                                                                                                                                                                                                                                                                                                                           var21 = this.q / 2 - 13;
                                                                                                                                                                                                                                                                                                                                                                           if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                              a(var1, var21 + 1, this.r / 2 + 2, "", (byte)0);
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              a(var1, var21, this.r / 2 - 1 + 2, "", (byte)0);
                                                                                                                                                                                                                                                                                                                                                                           }

                                                                                                                                                                                                                                                                                                                                                                           var1.h();
                                                                                                                                                                                                                                                                                                                                                                           break label5713;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, 7, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                        var1.h();
                                                                                                                                                                                                                                                                                                                                                                        var21 = this.q / 2 - 13;
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           a(var1, var21 + 1, this.r / 2 + 2, "", (byte)0);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           a(var1, var21, this.r / 2 - 1 + 2, "", (byte)0);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -24:
                                                                                                                                                                                                                                                                                                                                                                        var1.f(VDTT_cw.v().cI);
                                                                                                                                                                                                                                                                                                                                                                        var1.c(0, 0, 16, 16);
                                                                                                                                                                                                                                                                                                                                                                        var1.f(VDTT_cw.v().cI == -11184811 ? -1 : -11184811);
                                                                                                                                                                                                                                                                                                                                                                        var1.b(0, 0, 16, 16);
                                                                                                                                                                                                                                                                                                                                                                        var1.f();
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -23:
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.q, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.q, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        if (this.b) {
                                                                                                                                                                                                                                                                                                                                                                           var1.f(-1);
                                                                                                                                                                                                                                                                                                                                                                           var1.b(0, 0, this.q - 1, this.r);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_dg.b(VDTT_dg.d, var1, this.l, this.q / 2, this.r / 2, 2, -1, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        break label5716;
                                                                                                                                                                                                                                                                                                                                                                     case -22:
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.q, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.q, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        if (this.b) {
                                                                                                                                                                                                                                                                                                                                                                           var1.f(-1);
                                                                                                                                                                                                                                                                                                                                                                           var1.b(0, 0, this.q - 1, this.r);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_dc.a(var1, 98, 270, this.q / 2, this.r / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        break label5718;
                                                                                                                                                                                                                                                                                                                                                                     case -21:
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.q, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.q, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        if (this.b) {
                                                                                                                                                                                                                                                                                                                                                                           var1.f(-1);
                                                                                                                                                                                                                                                                                                                                                                           var1.b(0, 0, this.q - 1, this.r);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_dc.a(var1, 98, 90, this.q / 2, this.r / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        break label5724;
                                                                                                                                                                                                                                                                                                                                                                     case -20:
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.q, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.q, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        if (this.b) {
                                                                                                                                                                                                                                                                                                                                                                           var1.f(-1);
                                                                                                                                                                                                                                                                                                                                                                           var1.b(0, 0, this.q - 1, this.r);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_dc.a(var1, 98, 180, this.q / 2, this.r / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        break label5722;
                                                                                                                                                                                                                                                                                                                                                                     case -19:
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.q, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        if (this.b) {
                                                                                                                                                                                                                                                                                                                                                                           var1.f(-1);
                                                                                                                                                                                                                                                                                                                                                                           var1.b(0, 0, this.q - 1, this.r);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_dc.a(var1, 98, 0, this.q / 2, this.r / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        break label5736;
                                                                                                                                                                                                                                                                                                                                                                     case -18:
                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, -10, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -17:
                                                                                                                                                                                                                                                                                                                                                                        var1.h();
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.d(VDTT_dg.b, var1, this.l, this.q / 2 + 1, this.r / 2 + 1, 2, -2559, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.d(VDTT_dg.b, var1, this.l, this.q / 2 + 1, this.r / 2, 2, -2559, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5728;
                                                                                                                                                                                                                                                                                                                                                                     case -16:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, f(), this.K, VDTT_jb.n(4), VDTT_jb.n(3), VDTT_jb.n(100));
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -15:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dc.a(var1, 82, this.K, 0, 1, 20);
                                                                                                                                                                                                                                                                                                                                                                           var10000 = Graphics.a(VDTT_jb.a(0.5F));
                                                                                                                                                                                                                                                                                                                                                                           var10002 = MenuConfig.K().z() ? Caption.xI : Caption.xJ;
                                                                                                                                                                                                                                                                                                                                                                           var10003 = this.q / 2;
                                                                                                                                                                                                                                                                                                                                                                           VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                           var10003 += 0;
                                                                                                                                                                                                                                                                                                                                                                           var10004 = this.r / 2;
                                                                                                                                                                                                                                                                                                                                                                           VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.a((BitmapFont)var10000, var1, var10002, var10003, var10004 - 1, 2, -9737365, 0);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           var10000 = Graphics.a(VDTT_jb.a(0.5F));
                                                                                                                                                                                                                                                                                                                                                                           var10002 = MenuConfig.K().z() ? Caption.xI : Caption.xJ;
                                                                                                                                                                                                                                                                                                                                                                           var10003 = this.q / 2;
                                                                                                                                                                                                                                                                                                                                                                           VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                           var10003 += 0;
                                                                                                                                                                                                                                                                                                                                                                           var10004 = this.r / 2;
                                                                                                                                                                                                                                                                                                                                                                           VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.a((BitmapFont)var10000, var1, var10002, var10003, var10004 - 1, 2, -5855836, 0);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5712;
                                                                                                                                                                                                                                                                                                                                                                     case -14:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d() || VDTT_cw.v().aA.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.b(var1, 672, this.K, 0, 0, this.q, this.r);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5694;
                                                                                                                                                                                                                                                                                                                                                                     case -13:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dc.a(var1, 604, this.K, this.q / 2, this.r / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        float var23;
                                                                                                                                                                                                                                                                                                                                                                        if ((var23 = (float)(VDTT_jb.a() - VDTT_cw.v().dm) / 1000.0F) <= 30.0F && var23 > 0.0F) {
                                                                                                                                                                                                                                                                                                                                                                           if ((var21 = (int)((1.0F - var23 / 30.0F) * (float)this.r)) == 0 || var21 > this.r) {
                                                                                                                                                                                                                                                                                                                                                                              var21 = 1;
                                                                                                                                                                                                                                                                                                                                                                           }

                                                                                                                                                                                                                                                                                                                                                                           VDTT_dc.a(var1, 64, 0, 0, VDTT_jb.n(this.r), VDTT_jb.n(this.q) * DataCenter.d().r, VDTT_jb.n(var21) * DataCenter.d().r, 0, this.r - var21, this.q, var21, 36);
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.e(VDTT_dg.b, var1, String.format("%.2f", 30.0F - var23), this.q / 2, this.r / 2, 2, -6488, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_dg.e(VDTT_dg.b, var1, Item.b(VDTT_cw.v().bS), this.q / 2, this.r / 2 + 9, 2, -6488, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        break label5725;
                                                                                                                                                                                                                                                                                                                                                                     case -12:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.b(var1, 81, this.K, 0, 0, this.q, this.r);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -11:
                                                                                                                                                                                                                                                                                                                                                                        VDTT_dc.a(var1, 59, 90, 0, 0, 20);
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -10:
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.q, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        VDTT_dg.b(VDTT_dg.d, var1, this.l, 7, this.r / 2, 0, -1, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        break label5703;
                                                                                                                                                                                                                                                                                                                                                                     case -9:
                                                                                                                                                                                                                                                                                                                                                                     case -6:
                                                                                                                                                                                                                                                                                                                                                                     case -5:
                                                                                                                                                                                                                                                                                                                                                                     case -4:
                                                                                                                                                                                                                                                                                                                                                                     case -3:
                                                                                                                                                                                                                                                                                                                                                                        if (this.c) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, 370, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                           if (this.l.equals(Caption.xD)) {
                                                                                                                                                                                                                                                                                                                                                                              VDTT_dg.b(VDTT_dg.d, var1, this.l, this.q / 2, this.r / 2, 2, -3089954, 0);
                                                                                                                                                                                                                                                                                                                                                                           } else if (this.l.equals(Caption.iJ)) {
                                                                                                                                                                                                                                                                                                                                                                              VDTT_dg.b(VDTT_dg.d, var1, this.l, this.q / 2, this.r / 2, 2, -7812062, 0);
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              VDTT_dg.b(VDTT_dg.d, var1, Caption.oI, this.q / 2, this.r / 2, 2, -3089954, 0);
                                                                                                                                                                                                                                                                                                                                                                           }
                                                                                                                                                                                                                                                                                                                                                                           break label5705;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, 7, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                        var1.h();
                                                                                                                                                                                                                                                                                                                                                                        byte var22 = 0;
                                                                                                                                                                                                                                                                                                                                                                        int var20 = this.q / 2 - 13;
                                                                                                                                                                                                                                                                                                                                                                        if (this.I == -3) {
                                                                                                                                                                                                                                                                                                                                                                           var22 = 2;
                                                                                                                                                                                                                                                                                                                                                                        } else if (this.I == -4) {
                                                                                                                                                                                                                                                                                                                                                                           var22 = 3;
                                                                                                                                                                                                                                                                                                                                                                        } else if (this.I == -5) {
                                                                                                                                                                                                                                                                                                                                                                           var22 = 0;
                                                                                                                                                                                                                                                                                                                                                                        } else if (this.I == -6) {
                                                                                                                                                                                                                                                                                                                                                                           var22 = 1;
                                                                                                                                                                                                                                                                                                                                                                        } else if (this.I == -9) {
                                                                                                                                                                                                                                                                                                                                                                           var22 = 4;
                                                                                                                                                                                                                                                                                                                                                                           var20 += 3;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (var22 != 4 && var22 != 5) {
                                                                                                                                                                                                                                                                                                                                                                           if (var22 != 0 && var22 != 1) {
                                                                                                                                                                                                                                                                                                                                                                              if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                                 a(var1, var20 + 1, this.r / 2 - 1, "", var22);
                                                                                                                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                                                                                                                 a(var1, var20, this.r / 2 - 2, "", var22);
                                                                                                                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                                                                                                                           } else if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                              a(var1, var20 + 1, this.r / 2 + 1, "", var22);
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              a(var1, var20, this.r / 2 - 1 + 1, "", var22);
                                                                                                                                                                                                                                                                                                                                                                           }
                                                                                                                                                                                                                                                                                                                                                                        } else if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           a(var1, var20 + 1, this.r / 2 + 1, "", var22);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           a(var1, var20, this.r / 2 - 1 + 1, "", var22);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -8:
                                                                                                                                                                                                                                                                                                                                                                     case 7:
                                                                                                                                                                                                                                                                                                                                                                     case 15:
                                                                                                                                                                                                                                                                                                                                                                        if (this.c) {
                                                                                                                                                                                                                                                                                                                                                                           if (this.q <= 67 && this.r <= 40) {
                                                                                                                                                                                                                                                                                                                                                                              VDTT_aa.a(var1, 370, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              this.a(var1, 0, -1, this.q, this.r + 2, 370, 3, 4, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                           }

                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.d, var1, this.l, this.q / 2, this.r / 2, 2, -11184811, 0);
                                                                                                                                                                                                                                                                                                                                                                           break label5696;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (this.q <= 67 && this.r <= 40) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, 7, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           this.a(var1, 0, -1, this.q, this.r + 2, 7, 3, 4, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -7:
                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, 15, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                        var1.h();
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.d, var1, this.l, this.q / 2 + 1, this.r / 2 + 1, 2, -6908266, -15191233);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.d, var1, this.l, this.q / 2, this.r / 2, 2, -6908266, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5693;
                                                                                                                                                                                                                                                                                                                                                                     case -2:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.d, var1, this.l, this.q / 2 + 1, this.r / 2 + 1, 2, -2560, -15191233);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.d, var1, this.l, this.q / 2, this.r / 2, 2, -2560, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           var1.h();
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        var1.f(-2560);
                                                                                                                                                                                                                                                                                                                                                                        var1.a(0, 15, this.q, 1);
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           var1.e(30);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5738;
                                                                                                                                                                                                                                                                                                                                                                     case 9:
                                                                                                                                                                                                                                                                                                                                                                        if (this.c) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, 370, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                           var21 = (this.q - VDTT_dg.b(VDTT_dg.d, this.l)) / 2 - 9;
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dc.a(var1, 9, 0, var21, this.r / 2, 6);
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.d, var1, this.l, var21 + 16, this.r / 2, 0, -3089954, 0);
                                                                                                                                                                                                                                                                                                                                                                           break label5695;
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5920;
                                                                                                                                                                                                                                                                                                                                                                     case 13:
                                                                                                                                                                                                                                                                                                                                                                        if (this.c) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, 370, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, var4, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5714;
                                                                                                                                                                                                                                                                                                                                                                     case 14:
                                                                                                                                                                                                                                                                                                                                                                     case 78:
                                                                                                                                                                                                                                                                                                                                                                     case 522:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dc.a(var1, var4, this.K, 2, 2, 20);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case 17:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.b(var1, 17, this.K, 0, 0, this.q, this.r);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case 25:
                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, 7, this.K, 1, 1, this.q - 2, (int)(this.r - 2));
                                                                                                                                                                                                                                                                                                                                                                        VDTT_dc.a(var1, 7, this.K, 14, 10, 3);
                                                                                                                                                                                                                                                                                                                                                                        var1.h();
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case 33:
                                                                                                                                                                                                                                                                                                                                                                     case 38:
                                                                                                                                                                                                                                                                                                                                                                        VDTT_dc.a(var1, var4, this.K, 0, 0, 20);
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case 42:
                                                                                                                                                                                                                                                                                                                                                                        VDTT_dc.a(var1, var4, this.K, 0, 0, 20);
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.f, var1, this.l, this.q / 2, this.r / 2, 2, -1, -65536);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.e, var1, this.l, this.q / 2, this.r / 2, 2, -1, -65536);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5711;
                                                                                                                                                                                                                                                                                                                                                                     case 49:
                                                                                                                                                                                                                                                                                                                                                                        var1.h();
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 1, -5, 19, 30, 67, 3, 4, 4, 0, 1, 0);
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           var1.e(30);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_dc.a(var1, var4, this.K, this.q / 2, this.r / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case 66:
                                                                                                                                                                                                                                                                                                                                                                        VDTT_dc.a(var1, var4, this.K, 0, this.r, 36);
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.a(var1, this.l, this.q / 2 + 4 + 1, this.r / 2 - 1 + 1, 2, -1);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.a(var1, this.l, this.q / 2 + 4, this.r / 2 - 1, 2, -1);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5706;
                                                                                                                                                                                                                                                                                                                                                                     case 73:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dc.a(var1, var4, this.K, 0, 1, 20);
                                                                                                                                                                                                                                                                                                                                                                           var10000 = Graphics.a(VDTT_jb.a(0.5F));
                                                                                                                                                                                                                                                                                                                                                                           var10002 = this.l;
                                                                                                                                                                                                                                                                                                                                                                           var10003 = this.q / 2;
                                                                                                                                                                                                                                                                                                                                                                           VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                           var10003 += 6;
                                                                                                                                                                                                                                                                                                                                                                           var10004 = this.r / 2;
                                                                                                                                                                                                                                                                                                                                                                           VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.a((BitmapFont)var10000, var1, var10002, var10003, var10004 - 1, 2, -9737365, 0);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           var10000 = Graphics.a(VDTT_jb.a(0.5F));
                                                                                                                                                                                                                                                                                                                                                                           var10002 = this.l;
                                                                                                                                                                                                                                                                                                                                                                           var10003 = this.q / 2;
                                                                                                                                                                                                                                                                                                                                                                           VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                           var10003 += 6;
                                                                                                                                                                                                                                                                                                                                                                           var10004 = this.r / 2;
                                                                                                                                                                                                                                                                                                                                                                           VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.a((BitmapFont)var10000, var1, var10002, var10003, var10004 - 1, 2, -5855836, 0);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5717;
                                                                                                                                                                                                                                                                                                                                                                     case 79:
                                                                                                                                                                                                                                                                                                                                                                        var19 = this.l.split(" ");
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, 79, 0, -2, -2, 105);
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.g[0], var1, var19[0], this.q / 2 + 1, this.r / 2 + 1 - 3, 2, -1, -16742145);
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.g[0], var1, var19[1], this.q / 2 + 1, this.r / 2 + 1 + 10, 2, -1, -16742145);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dc.a(var1, var4, this.K, 0, 0, 20);
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.g[0], var1, var19[0], this.q / 2, this.r / 2 - 3, 2, -1, 0);
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.g[0], var1, var19[1], this.q / 2, this.r / 2 + 10, 2, -1, 0);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5710;
                                                                                                                                                                                                                                                                                                                                                                     case 81:
                                                                                                                                                                                                                                                                                                                                                                     case 100:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, var4, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5739;
                                                                                                                                                                                                                                                                                                                                                                     case 82:
                                                                                                                                                                                                                                                                                                                                                                     case 572:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dc.a(var1, var4, this.K, 0, 1, 20);
                                                                                                                                                                                                                                                                                                                                                                           var10000 = Graphics.a(VDTT_jb.a(0.5F));
                                                                                                                                                                                                                                                                                                                                                                           var10002 = this.l;
                                                                                                                                                                                                                                                                                                                                                                           var10003 = this.q / 2;
                                                                                                                                                                                                                                                                                                                                                                           VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                           var10003 += 0;
                                                                                                                                                                                                                                                                                                                                                                           var10004 = this.r / 2;
                                                                                                                                                                                                                                                                                                                                                                           VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.a((BitmapFont)var10000, var1, var10002, var10003, var10004 - 1, 2, -9737365, 0);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           var10000 = Graphics.a(VDTT_jb.a(0.5F));
                                                                                                                                                                                                                                                                                                                                                                           var10002 = this.l;
                                                                                                                                                                                                                                                                                                                                                                           var10003 = this.q / 2;
                                                                                                                                                                                                                                                                                                                                                                           VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                           var10003 += 0;
                                                                                                                                                                                                                                                                                                                                                                           var10004 = this.r / 2;
                                                                                                                                                                                                                                                                                                                                                                           VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.a((BitmapFont)var10000, var1, var10002, var10003, var10004 - 1, 2, -5855836, 0);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5741;
                                                                                                                                                                                                                                                                                                                                                                     case 89:
                                                                                                                                                                                                                                                                                                                                                                     case 566:
                                                                                                                                                                                                                                                                                                                                                                     case 740:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d() || VDTT_cw.v().aA.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.b(var1, var4, this.K, 0, 0, this.q, this.r);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case 94:
                                                                                                                                                                                                                                                                                                                                                                     case 672:
                                                                                                                                                                                                                                                                                                                                                                     case 673:
                                                                                                                                                                                                                                                                                                                                                                     case 674:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, var4, this.K, this.q / 2, this.r / 2, VDTT_jb.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case 256:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, var4, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (this.m == 7006) {
                                                                                                                                                                                                                                                                                                                                                                           if (VDTT_eq.a().b()) {
                                                                                                                                                                                                                                                                                                                                                                              VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, "2X", this.q / 2, this.r / 2, 2, -1, -65536);
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, "1X", this.q / 2, this.r / 2, 2, -1, -65536);
                                                                                                                                                                                                                                                                                                                                                                           }
                                                                                                                                                                                                                                                                                                                                                                        } else if (this.m == 7007) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, Caption.yc, this.q / 2, this.r / 2, 2, -1, -65536);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case 286:
                                                                                                                                                                                                                                                                                                                                                                     case 287:
                                                                                                                                                                                                                                                                                                                                                                     case 288:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dc.a(var1, var4, this.K, 1, 1, 20);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dc.a(var1, var4, this.K, 0, 0, 20);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case 373:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.b, var1, this.l, this.q / 2 + 1, this.r / 2 + 1, 2, -3476028, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.b, var1, this.l, this.q / 2, this.r / 2, 2, -3476028, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5689;
                                                                                                                                                                                                                                                                                                                                                                     case 374:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dc.a(var1, var4, this.K, 0, 0, 20);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5740;
                                                                                                                                                                                                                                                                                                                                                                     case 398:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dc.a(var1, var4, this.K, -1, 1, 20);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dc.a(var1, var4, this.K, 0, 0, 20);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5690;
                                                                                                                                                                                                                                                                                                                                                                     case 552:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dc.a(var1, var4, this.K, 0, 1, 20);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5733;
                                                                                                                                                                                                                                                                                                                                                                     case 557:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           if (VDTT_cw.v().bX >= 0 && VDTT_cw.v().bX < DataCenter.d().O.length) {
                                                                                                                                                                                                                                                                                                                                                                              var4 = DataCenter.d().O[VDTT_cw.v().bX].h;
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              var4 = 81;
                                                                                                                                                                                                                                                                                                                                                                           }

                                                                                                                                                                                                                                                                                                                                                                           VDTT_dc.a(var1, var4, this.K, this.q / 2, this.r / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (VDTT_cw.v().bX >= 0 && VDTT_cw.v().bX < DataCenter.d().O.length) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(VDTT_dg.b, var1, Item.b(VDTT_cw.v().bW), this.q / 2, this.r / 2 + 9, 2, -6488, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5726;
                                                                                                                                                                                                                                                                                                                                                                     case 577:
                                                                                                                                                                                                                                                                                                                                                                     case 578:
                                                                                                                                                                                                                                                                                                                                                                     case 579:
                                                                                                                                                                                                                                                                                                                                                                     case 580:
                                                                                                                                                                                                                                                                                                                                                                     case 581:
                                                                                                                                                                                                                                                                                                                                                                     case 584:
                                                                                                                                                                                                                                                                                                                                                                     case 675:
                                                                                                                                                                                                                                                                                                                                                                     case 676:
                                                                                                                                                                                                                                                                                                                                                                     case 678:
                                                                                                                                                                                                                                                                                                                                                                     case 679:
                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, var4, this.K, this.q / 2, this.r / 2, VDTT_jb.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                        VDTT_dg.a((VDTT_dg)VDTT_dg.c, var1, this.l, this.q / 2, this.r - 6, 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        break label5709;
                                                                                                                                                                                                                                                                                                                                                                     case 638:
                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, var4, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                        break label5727;
                                                                                                                                                                                                                                                                                                                                                                     case 677:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, var4, this.K, this.q / 2, this.r / 2, VDTT_jb.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5691;
                                                                                                                                                                                                                                                                                                                                                                     case 680:
                                                                                                                                                                                                                                                                                                                                                                     case 681:
                                                                                                                                                                                                                                                                                                                                                                        if (DataCenter.d().e() instanceof VDTT_cw) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, var4, this.K, this.q / 2, this.r / 2, VDTT_jb.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                           VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.a((VDTT_dg)VDTT_dg.c, var1, this.l, this.q / 2, this.r - 6, 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, var4, this.K, this.q / 2, this.r / 2, VDTT_jb.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                           VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.a((VDTT_dg)VDTT_dg.c, var1, this.l, this.q / 2, this.r - 6, 2, -1, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5720;
                                                                                                                                                                                                                                                                                                                                                                     case 684:
                                                                                                                                                                                                                                                                                                                                                                        break label5697;
                                                                                                                                                                                                                                                                                                                                                                     case 687:
                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, var4, this.K, this.q / 2, this.r / 2, VDTT_jb.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        VDTT_cw.v();
                                                                                                                                                                                                                                                                                                                                                                        if (VDTT_cw.P() > 0) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, DataCenter.d().h % 24 < 12 ? 713 : 454, this.K, this.q / 2 - VDTT_jb.n(5), this.r / 2 - VDTT_jb.n(5), VDTT_jb.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                        VDTT_dg.a((VDTT_dg)VDTT_dg.c, var1, this.l, this.q / 2, this.r - 6, 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        break label5719;
                                                                                                                                                                                                                                                                                                                                                                     case 688:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, var4, this.K, this.q / 2, this.r / 2, VDTT_jb.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (VDTT_cw.v().aY) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, DataCenter.d().h % 24 < 12 ? 713 : 454, this.K, this.q / 2 - VDTT_jb.n(5), this.r / 2 - VDTT_jb.n(5), VDTT_jb.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                        VDTT_dg.a((VDTT_dg)VDTT_dg.c, var1, this.l, this.q / 2, this.r - 6, 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        break label5734;
                                                                                                                                                                                                                                                                                                                                                                     case 689:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, var4, this.K, this.q / 2, this.r / 2, VDTT_jb.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (VDTT_cw.v().aU) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, DataCenter.d().h % 24 < 12 ? 713 : 454, this.K, this.q / 2 - VDTT_jb.n(5), this.r / 2 - VDTT_jb.n(5), VDTT_jb.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                        VDTT_dg.a((VDTT_dg)VDTT_dg.c, var1, this.l, this.q / 2, this.r - 6, 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        break label5732;
                                                                                                                                                                                                                                                                                                                                                                     case 690:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, var4, this.K, this.q / 2, this.r / 2, VDTT_jb.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (VDTT_ji.z() != null && VDTT_cw.v().cn) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, DataCenter.d().h % 24 < 12 ? 713 : 454, this.K, this.q / 2 - VDTT_jb.n(5), this.r / 2 - VDTT_jb.n(5), VDTT_jb.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                        VDTT_dg.a((VDTT_dg)VDTT_dg.c, var1, this.l, this.q / 2, this.r - 6, 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        break label5715;
                                                                                                                                                                                                                                                                                                                                                                     case 715:
                                                                                                                                                                                                                                                                                                                                                                        if (DataCenter.l()) {
                                                                                                                                                                                                                                                                                                                                                                           var1.p();
                                                                                                                                                                                                                                                                                                                                                                           this.a(var1, 0, 2, this.q, this.r - 3, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                           var1.r();
                                                                                                                                                                                                                                                                                                                                                                           if (VDTT_cw.v().az.c()) {
                                                                                                                                                                                                                                                                                                                                                                              VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.dE, this.q / 2, this.r / 2, 2, this.d() ? -2560 : -1, -10275328);
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              VDTT_dg.a((VDTT_dg)VDTT_dg.b, var1, Caption.jW, this.q / 2, this.r / 2, 2, this.d() ? -2560 : -1, -10275328);
                                                                                                                                                                                                                                                                                                                                                                           }
                                                                                                                                                                                                                                                                                                                                                                           break label5701;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, var4, this.K, 0, 0, this.q, (int)this.r);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (this.m != 1100 || VDTT_cw.v().aA.c()) {
                                                                                                                                                                                                                                                                                                                                                                           break label5729;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (!VDTT_cw.v().aU && (VDTT_ji.z() == null || !VDTT_cw.v().cn) && !VDTT_cw.v().aY) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_cw.v();
                                                                                                                                                                                                                                                                                                                                                                           if (VDTT_cw.P() <= 0) {
                                                                                                                                                                                                                                                                                                                                                                              break label5729;
                                                                                                                                                                                                                                                                                                                                                                           }
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_aa.a(var1, DataCenter.d().h % 24 < 12 ? 713 : 454, this.K, this.q, 0, VDTT_jb.n(100), (byte)24);
                                                                                                                                                                                                                                                                                                                                                                        break label5729;
                                                                                                                                                                                                                                                                                                                                                                     case 722:
                                                                                                                                                                                                                                                                                                                                                                     case 723:
                                                                                                                                                                                                                                                                                                                                                                     case 724:
                                                                                                                                                                                                                                                                                                                                                                     case 725:
                                                                                                                                                                                                                                                                                                                                                                        if (var4 == 725) {
                                                                                                                                                                                                                                                                                                                                                                           if (VDTT_ek.m().bh != null && VDTT_ek.m().bh.d > 0) {
                                                                                                                                                                                                                                                                                                                                                                              VDTT_aa.a(var1, VDTT_ek.m().bh.d, this.K, VDTT_jb.n(4), VDTT_jb.n(3), VDTT_jb.n(100));
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              VDTT_aa.a(var1, var4, this.K, VDTT_jb.n(4), VDTT_jb.n(3), VDTT_jb.n(100));
                                                                                                                                                                                                                                                                                                                                                                           }
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.a(var1, var4, this.K, VDTT_jb.n(4), VDTT_jb.n(3), VDTT_jb.n(100));
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_eq.a();
                                                                                                                                                                                                                                                                                                                                                                        VDTT_dg var5 = VDTT_dg.b;
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(var5, var1, this.l, VDTT_jb.n(20), VDTT_jb.n(7), 0, -1, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_dg.b(var5, var1, this.l, VDTT_jb.n(20), VDTT_jb.n(6), 0, -1, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label5687;
                                                                                                                                                                                                                                                                                                                                                                     case 741:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d() || VDTT_cw.v().aA.d()) {
                                                                                                                                                                                                                                                                                                                                                                           VDTT_aa.b(var1, var4, this.K, 0, 0, this.q, this.r);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_dc.a(var1, 742 + DataCenter.d().h / 5 % 5, 0, this.q / 2, this.r / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     default:
                                                                                                                                                                                                                                                                                                                                                                        if (this.n == 0) {
                                                                                                                                                                                                                                                                                                                                                                           break label5704;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (this.n > 0) {
                                                                                                                                                                                                                                                                                                                                                                           var1.d(this.n);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        VDTT_dc.a(var1, var4, this.K, 0, 0, 20);
                                                                                                                                                                                                                                                                                                                                                                        if (this.n > 0) {
                                                                                                                                                                                                                                                                                                                                                                           var1.g();
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                     }
                                                                                                                                                                                                                                                                                                                                                                  }

                                                                                                                                                                                                                                                                                                                                                                  if (this.c) {
                                                                                                                                                                                                                                                                                                                                                                     VDTT_dg.b(VDTT_dg.d, var1, this.l, this.q / 2, this.r / 2, 2, -11184811, 0);
                                                                                                                                                                                                                                                                                                                                                                  } else if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                     VDTT_dg.a(var1, this.l, this.q / 2 + 1, this.r / 2 + 1, 2, -1);
                                                                                                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                                                                                                     VDTT_dg.a(var1, this.l, this.q / 2, this.r / 2, 2, -1);
                                                                                                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                                                                                                  break label5731;
                                                                                                                                                                                                                                                                                                                                                               }
                                                                                                                                                                                                                                                                                                                                                            } catch (Exception var15) {
                                                                                                                                                                                                                                                                                                                                                               VDTT_jb.a(var15);
                                                                                                                                                                                                                                                                                                                                                               break label5708;
                                                                                                                                                                                                                                                                                                                                                            } finally {
                                                                                                                                                                                                                                                                                                                                                               if (this.P != null) {
                                                                                                                                                                                                                                                                                                                                                                  this.P.b(var1, this.q / 2, this.r / 2);
                                                                                                                                                                                                                                                                                                                                                               }

                                                                                                                                                                                                                                                                                                                                                               if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                  var1.h();
                                                                                                                                                                                                                                                                                                                                                               }

                                                                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                                                            var10 = false;
                                                                                                                                                                                                                                                                                                                                                            break label5814;
                                                                                                                                                                                                                                                                                                                                                         }

                                                                                                                                                                                                                                                                                                                                                         var10 = false;
                                                                                                                                                                                                                                                                                                                                                         break label5838;
                                                                                                                                                                                                                                                                                                                                                      }

                                                                                                                                                                                                                                                                                                                                                      var10 = false;
                                                                                                                                                                                                                                                                                                                                                      break label5847;
                                                                                                                                                                                                                                                                                                                                                   }

                                                                                                                                                                                                                                                                                                                                                   var10 = false;
                                                                                                                                                                                                                                                                                                                                                   break label5841;
                                                                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                                                                var10 = false;
                                                                                                                                                                                                                                                                                                                                                break label5863;
                                                                                                                                                                                                                                                                                                                                             }

                                                                                                                                                                                                                                                                                                                                             var10 = false;
                                                                                                                                                                                                                                                                                                                                             break label5861;
                                                                                                                                                                                                                                                                                                                                          }

                                                                                                                                                                                                                                                                                                                                          var10 = false;
                                                                                                                                                                                                                                                                                                                                          break label5856;
                                                                                                                                                                                                                                                                                                                                       }

                                                                                                                                                                                                                                                                                                                                       var10 = false;
                                                                                                                                                                                                                                                                                                                                       break label5837;
                                                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                                                    var10 = false;
                                                                                                                                                                                                                                                                                                                                    break label5816;
                                                                                                                                                                                                                                                                                                                                 }

                                                                                                                                                                                                                                                                                                                                 var10 = false;
                                                                                                                                                                                                                                                                                                                                 break label5821;
                                                                                                                                                                                                                                                                                                                              }

                                                                                                                                                                                                                                                                                                                              var10 = false;
                                                                                                                                                                                                                                                                                                                              break label5813;
                                                                                                                                                                                                                                                                                                                           }

                                                                                                                                                                                                                                                                                                                           var10 = false;
                                                                                                                                                                                                                                                                                                                           break label5817;
                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                        var10 = false;
                                                                                                                                                                                                                                                                                                                        break label5854;
                                                                                                                                                                                                                                                                                                                     }

                                                                                                                                                                                                                                                                                                                     var10 = false;
                                                                                                                                                                                                                                                                                                                     break label5833;
                                                                                                                                                                                                                                                                                                                  }

                                                                                                                                                                                                                                                                                                                  var10 = false;
                                                                                                                                                                                                                                                                                                                  break label5839;
                                                                                                                                                                                                                                                                                                               }

                                                                                                                                                                                                                                                                                                               var10 = false;
                                                                                                                                                                                                                                                                                                               break label5832;
                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                            var10 = false;
                                                                                                                                                                                                                                                                                                            break label5848;
                                                                                                                                                                                                                                                                                                         }

                                                                                                                                                                                                                                                                                                         var10 = false;
                                                                                                                                                                                                                                                                                                         break label5830;
                                                                                                                                                                                                                                                                                                      }

                                                                                                                                                                                                                                                                                                      var10 = false;
                                                                                                                                                                                                                                                                                                      break label5819;
                                                                                                                                                                                                                                                                                                   }

                                                                                                                                                                                                                                                                                                   var10 = false;
                                                                                                                                                                                                                                                                                                   break label5928;
                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                var10 = false;
                                                                                                                                                                                                                                                                                                break label5818;
                                                                                                                                                                                                                                                                                             }

                                                                                                                                                                                                                                                                                             var10 = false;
                                                                                                                                                                                                                                                                                             break label5810;
                                                                                                                                                                                                                                                                                          }

                                                                                                                                                                                                                                                                                          var10 = false;
                                                                                                                                                                                                                                                                                          break label5831;
                                                                                                                                                                                                                                                                                       }

                                                                                                                                                                                                                                                                                       var10 = false;
                                                                                                                                                                                                                                                                                       break label5843;
                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                    var10 = false;
                                                                                                                                                                                                                                                                                    break label5858;
                                                                                                                                                                                                                                                                                 }

                                                                                                                                                                                                                                                                                 var10 = false;
                                                                                                                                                                                                                                                                                 break label5808;
                                                                                                                                                                                                                                                                              }

                                                                                                                                                                                                                                                                              var10 = false;
                                                                                                                                                                                                                                                                              break label5811;
                                                                                                                                                                                                                                                                           }

                                                                                                                                                                                                                                                                           var10 = false;
                                                                                                                                                                                                                                                                           break label5822;
                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                        var10 = false;
                                                                                                                                                                                                                                                                        break label5829;
                                                                                                                                                                                                                                                                     }

                                                                                                                                                                                                                                                                     var10 = false;
                                                                                                                                                                                                                                                                     break label5812;
                                                                                                                                                                                                                                                                  }

                                                                                                                                                                                                                                                                  var10 = false;
                                                                                                                                                                                                                                                                  break label5850;
                                                                                                                                                                                                                                                               }

                                                                                                                                                                                                                                                               var10 = false;
                                                                                                                                                                                                                                                               break label5828;
                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                            var10 = false;
                                                                                                                                                                                                                                                            break label5809;
                                                                                                                                                                                                                                                         }

                                                                                                                                                                                                                                                         var10 = false;
                                                                                                                                                                                                                                                         break label5827;
                                                                                                                                                                                                                                                      }

                                                                                                                                                                                                                                                      var10 = false;
                                                                                                                                                                                                                                                      break label5853;
                                                                                                                                                                                                                                                   }

                                                                                                                                                                                                                                                   var10 = false;
                                                                                                                                                                                                                                                   break label5855;
                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                var10 = false;
                                                                                                                                                                                                                                                break label5846;
                                                                                                                                                                                                                                             }

                                                                                                                                                                                                                                             var10 = false;
                                                                                                                                                                                                                                             break label5825;
                                                                                                                                                                                                                                          }

                                                                                                                                                                                                                                          var10 = false;
                                                                                                                                                                                                                                          break label5840;
                                                                                                                                                                                                                                       }

                                                                                                                                                                                                                                       var10 = false;
                                                                                                                                                                                                                                       break label5826;
                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                    var10 = false;
                                                                                                                                                                                                                                    break label5820;
                                                                                                                                                                                                                                 }

                                                                                                                                                                                                                                 var10 = false;
                                                                                                                                                                                                                                 break label5859;
                                                                                                                                                                                                                              }

                                                                                                                                                                                                                              var10 = false;
                                                                                                                                                                                                                              break label5857;
                                                                                                                                                                                                                           }

                                                                                                                                                                                                                           var10 = false;
                                                                                                                                                                                                                           break label5823;
                                                                                                                                                                                                                        }

                                                                                                                                                                                                                        var10 = false;
                                                                                                                                                                                                                        break label5849;
                                                                                                                                                                                                                     }

                                                                                                                                                                                                                     var10 = false;
                                                                                                                                                                                                                     break label5834;
                                                                                                                                                                                                                  }

                                                                                                                                                                                                                  var10 = false;
                                                                                                                                                                                                                  break label5843;
                                                                                                                                                                                                               }

                                                                                                                                                                                                               var10 = false;
                                                                                                                                                                                                               break label5851;
                                                                                                                                                                                                            }

                                                                                                                                                                                                            var10 = false;
                                                                                                                                                                                                            break label5860;
                                                                                                                                                                                                         }

                                                                                                                                                                                                         var10 = false;
                                                                                                                                                                                                         break label5852;
                                                                                                                                                                                                      }

                                                                                                                                                                                                      var10 = false;
                                                                                                                                                                                                      break label5836;
                                                                                                                                                                                                   }

                                                                                                                                                                                                   var10 = false;
                                                                                                                                                                                                   break label5824;
                                                                                                                                                                                                }

                                                                                                                                                                                                var10 = false;
                                                                                                                                                                                                break label5927;
                                                                                                                                                                                             }

                                                                                                                                                                                             var10 = false;
                                                                                                                                                                                             break label5815;
                                                                                                                                                                                          }

                                                                                                                                                                                          var10 = false;
                                                                                                                                                                                          break label5807;
                                                                                                                                                                                       }

                                                                                                                                                                                       var10 = false;
                                                                                                                                                                                       break label5862;
                                                                                                                                                                                    }

                                                                                                                                                                                    var10 = false;
                                                                                                                                                                                 } catch (Exception var17) {
                                                                                                                                                                                    VDTT_jb.a(var17);
                                                                                                                                                                                    var10 = false;
                                                                                                                                                                                    break label5845;
                                                                                                                                                                                 } finally {
                                                                                                                                                                                    if (var10) {
                                                                                                                                                                                       if (this.O == 0) {
                                                                                                                                                                                          this.O = 1;
                                                                                                                                                                                          this.b(var1);
                                                                                                                                                                                       } else if (this.O == 1) {
                                                                                                                                                                                          this.O = 2;
                                                                                                                                                                                          this.a(var1, var2, var3);
                                                                                                                                                                                       }

                                                                                                                                                                                    }
                                                                                                                                                                                 }

                                                                                                                                                                                 if (this.O == 0) {
                                                                                                                                                                                    this.O = 1;
                                                                                                                                                                                    this.b(var1);
                                                                                                                                                                                    return;
                                                                                                                                                                                 }

                                                                                                                                                                                 if (this.O == 1) {
                                                                                                                                                                                    this.O = 2;
                                                                                                                                                                                    this.a(var1, var2, var3);
                                                                                                                                                                                 }

                                                                                                                                                                                 return;
                                                                                                                                                                              }

                                                                                                                                                                              if (this.O == 0) {
                                                                                                                                                                                 this.O = 1;
                                                                                                                                                                                 this.b(var1);
                                                                                                                                                                                 return;
                                                                                                                                                                              }

                                                                                                                                                                              if (this.O == 1) {
                                                                                                                                                                                 this.O = 2;
                                                                                                                                                                                 this.a(var1, var2, var3);
                                                                                                                                                                              }

                                                                                                                                                                              return;
                                                                                                                                                                           }

                                                                                                                                                                           if (this.O == 0) {
                                                                                                                                                                              this.O = 1;
                                                                                                                                                                              this.b(var1);
                                                                                                                                                                              return;
                                                                                                                                                                           }

                                                                                                                                                                           if (this.O == 1) {
                                                                                                                                                                              this.O = 2;
                                                                                                                                                                              this.a(var1, var2, var3);
                                                                                                                                                                           }

                                                                                                                                                                           return;
                                                                                                                                                                        }

                                                                                                                                                                        if (this.O == 0) {
                                                                                                                                                                           this.O = 1;
                                                                                                                                                                           this.b(var1);
                                                                                                                                                                           return;
                                                                                                                                                                        }

                                                                                                                                                                        if (this.O == 1) {
                                                                                                                                                                           this.O = 2;
                                                                                                                                                                           this.a(var1, var2, var3);
                                                                                                                                                                        }

                                                                                                                                                                        return;
                                                                                                                                                                     }

                                                                                                                                                                     if (this.O == 0) {
                                                                                                                                                                        this.O = 1;
                                                                                                                                                                        this.b(var1);
                                                                                                                                                                        return;
                                                                                                                                                                     }

                                                                                                                                                                     if (this.O == 1) {
                                                                                                                                                                        this.O = 2;
                                                                                                                                                                        this.a(var1, var2, var3);
                                                                                                                                                                     }

                                                                                                                                                                     return;
                                                                                                                                                                  }

                                                                                                                                                                  if (this.O == 0) {
                                                                                                                                                                     this.O = 1;
                                                                                                                                                                     this.b(var1);
                                                                                                                                                                     return;
                                                                                                                                                                  }

                                                                                                                                                                  if (this.O == 1) {
                                                                                                                                                                     this.O = 2;
                                                                                                                                                                     this.a(var1, var2, var3);
                                                                                                                                                                  }

                                                                                                                                                                  return;
                                                                                                                                                               }

                                                                                                                                                               if (this.O == 0) {
                                                                                                                                                                  this.O = 1;
                                                                                                                                                                  this.b(var1);
                                                                                                                                                                  return;
                                                                                                                                                               }

                                                                                                                                                               if (this.O == 1) {
                                                                                                                                                                  this.O = 2;
                                                                                                                                                                  this.a(var1, var2, var3);
                                                                                                                                                               }

                                                                                                                                                               return;
                                                                                                                                                            }

                                                                                                                                                            if (this.O == 0) {
                                                                                                                                                               this.O = 1;
                                                                                                                                                               this.b(var1);
                                                                                                                                                               return;
                                                                                                                                                            }

                                                                                                                                                            if (this.O == 1) {
                                                                                                                                                               this.O = 2;
                                                                                                                                                               this.a(var1, var2, var3);
                                                                                                                                                            }

                                                                                                                                                            return;
                                                                                                                                                         }

                                                                                                                                                         if (this.O == 0) {
                                                                                                                                                            this.O = 1;
                                                                                                                                                            this.b(var1);
                                                                                                                                                            return;
                                                                                                                                                         }

                                                                                                                                                         if (this.O == 1) {
                                                                                                                                                            this.O = 2;
                                                                                                                                                            this.a(var1, var2, var3);
                                                                                                                                                         }

                                                                                                                                                         return;
                                                                                                                                                      }

                                                                                                                                                      if (this.O == 0) {
                                                                                                                                                         this.O = 1;
                                                                                                                                                         this.b(var1);
                                                                                                                                                         return;
                                                                                                                                                      }

                                                                                                                                                      if (this.O == 1) {
                                                                                                                                                         this.O = 2;
                                                                                                                                                         this.a(var1, var2, var3);
                                                                                                                                                      }

                                                                                                                                                      return;
                                                                                                                                                   }

                                                                                                                                                   if (this.O == 0) {
                                                                                                                                                      this.O = 1;
                                                                                                                                                      this.b(var1);
                                                                                                                                                      return;
                                                                                                                                                   }

                                                                                                                                                   if (this.O == 1) {
                                                                                                                                                      this.O = 2;
                                                                                                                                                      this.a(var1, var2, var3);
                                                                                                                                                   }

                                                                                                                                                   return;
                                                                                                                                                }

                                                                                                                                                if (this.O == 0) {
                                                                                                                                                   this.O = 1;
                                                                                                                                                   this.b(var1);
                                                                                                                                                   return;
                                                                                                                                                }

                                                                                                                                                if (this.O == 1) {
                                                                                                                                                   this.O = 2;
                                                                                                                                                   this.a(var1, var2, var3);
                                                                                                                                                }

                                                                                                                                                return;
                                                                                                                                             }

                                                                                                                                             if (this.O == 0) {
                                                                                                                                                this.O = 1;
                                                                                                                                                this.b(var1);
                                                                                                                                                return;
                                                                                                                                             }

                                                                                                                                             if (this.O == 1) {
                                                                                                                                                this.O = 2;
                                                                                                                                                this.a(var1, var2, var3);
                                                                                                                                             }

                                                                                                                                             return;
                                                                                                                                          }

                                                                                                                                          if (this.O == 0) {
                                                                                                                                             this.O = 1;
                                                                                                                                             this.b(var1);
                                                                                                                                             return;
                                                                                                                                          }

                                                                                                                                          if (this.O == 1) {
                                                                                                                                             this.O = 2;
                                                                                                                                             this.a(var1, var2, var3);
                                                                                                                                          }

                                                                                                                                          return;
                                                                                                                                       }

                                                                                                                                       if (this.O == 0) {
                                                                                                                                          this.O = 1;
                                                                                                                                          this.b(var1);
                                                                                                                                          return;
                                                                                                                                       }

                                                                                                                                       if (this.O == 1) {
                                                                                                                                          this.O = 2;
                                                                                                                                          this.a(var1, var2, var3);
                                                                                                                                       }

                                                                                                                                       return;
                                                                                                                                    }

                                                                                                                                    if (this.O == 0) {
                                                                                                                                       this.O = 1;
                                                                                                                                       this.b(var1);
                                                                                                                                       return;
                                                                                                                                    }

                                                                                                                                    if (this.O == 1) {
                                                                                                                                       this.O = 2;
                                                                                                                                       this.a(var1, var2, var3);
                                                                                                                                    }

                                                                                                                                    return;
                                                                                                                                 }

                                                                                                                                 if (this.O == 0) {
                                                                                                                                    this.O = 1;
                                                                                                                                    this.b(var1);
                                                                                                                                    return;
                                                                                                                                 }

                                                                                                                                 if (this.O == 1) {
                                                                                                                                    this.O = 2;
                                                                                                                                    this.a(var1, var2, var3);
                                                                                                                                 }

                                                                                                                                 return;
                                                                                                                              }

                                                                                                                              if (this.O == 0) {
                                                                                                                                 this.O = 1;
                                                                                                                                 this.b(var1);
                                                                                                                                 return;
                                                                                                                              }

                                                                                                                              if (this.O == 1) {
                                                                                                                                 this.O = 2;
                                                                                                                                 this.a(var1, var2, var3);
                                                                                                                              }

                                                                                                                              return;
                                                                                                                           }

                                                                                                                           if (this.O == 0) {
                                                                                                                              this.O = 1;
                                                                                                                              this.b(var1);
                                                                                                                              return;
                                                                                                                           }

                                                                                                                           if (this.O == 1) {
                                                                                                                              this.O = 2;
                                                                                                                              this.a(var1, var2, var3);
                                                                                                                           }

                                                                                                                           return;
                                                                                                                        }

                                                                                                                        if (this.O == 0) {
                                                                                                                           this.O = 1;
                                                                                                                           this.b(var1);
                                                                                                                           return;
                                                                                                                        }

                                                                                                                        if (this.O == 1) {
                                                                                                                           this.O = 2;
                                                                                                                           this.a(var1, var2, var3);
                                                                                                                           return;
                                                                                                                        }

                                                                                                                        return;
                                                                                                                     }

                                                                                                                     if (this.O == 0) {
                                                                                                                        this.O = 1;
                                                                                                                        this.b(var1);
                                                                                                                        return;
                                                                                                                     }

                                                                                                                     if (this.O == 1) {
                                                                                                                        this.O = 2;
                                                                                                                        this.a(var1, 0, 0);
                                                                                                                     }

                                                                                                                     return;
                                                                                                                  }

                                                                                                                  if (this.O == 0) {
                                                                                                                     this.O = 1;
                                                                                                                     this.b(var1);
                                                                                                                     return;
                                                                                                                  }

                                                                                                                  if (this.O == 1) {
                                                                                                                     this.O = 2;
                                                                                                                     this.a(var1, var2, var3);
                                                                                                                     return;
                                                                                                                  }

                                                                                                                  return;
                                                                                                               }

                                                                                                               if (this.O == 0) {
                                                                                                                  this.O = 1;
                                                                                                                  this.b(var1);
                                                                                                                  return;
                                                                                                               }

                                                                                                               if (this.O == 1) {
                                                                                                                  this.O = 2;
                                                                                                                  this.a(var1, var2, var3);
                                                                                                               }

                                                                                                               return;
                                                                                                            }

                                                                                                            if (this.O == 0) {
                                                                                                               this.O = 1;
                                                                                                               this.b(var1);
                                                                                                               return;
                                                                                                            }

                                                                                                            if (this.O == 1) {
                                                                                                               this.O = 2;
                                                                                                               this.a(var1, var2, var3);
                                                                                                            }

                                                                                                            return;
                                                                                                         }

                                                                                                         if (this.O == 0) {
                                                                                                            this.O = 1;
                                                                                                            this.b(var1);
                                                                                                            return;
                                                                                                         }

                                                                                                         if (this.O == 1) {
                                                                                                            this.O = 2;
                                                                                                            this.a(var1, var2, var3);
                                                                                                         }

                                                                                                         return;
                                                                                                      }

                                                                                                      if (this.O == 0) {
                                                                                                         this.O = 1;
                                                                                                         this.b(var1);
                                                                                                         return;
                                                                                                      }

                                                                                                      if (this.O == 1) {
                                                                                                         this.O = 2;
                                                                                                         this.a(var1, var2, var3);
                                                                                                      }

                                                                                                      return;
                                                                                                   }

                                                                                                   if (this.O == 0) {
                                                                                                      this.O = 1;
                                                                                                      this.b(var1);
                                                                                                      return;
                                                                                                   }

                                                                                                   if (this.O == 1) {
                                                                                                      this.O = 2;
                                                                                                      this.a(var1, var2, var3);
                                                                                                   }

                                                                                                   return;
                                                                                                }

                                                                                                if (this.O == 0) {
                                                                                                   this.O = 1;
                                                                                                   this.b(var1);
                                                                                                   return;
                                                                                                }

                                                                                                if (this.O == 1) {
                                                                                                   this.O = 2;
                                                                                                   this.a(var1, var2, var3);
                                                                                                }

                                                                                                return;
                                                                                             }

                                                                                             if (this.O == 0) {
                                                                                                this.O = 1;
                                                                                                this.b(var1);
                                                                                                return;
                                                                                             }

                                                                                             if (this.O == 1) {
                                                                                                this.O = 2;
                                                                                                this.a(var1, var2, var3);
                                                                                             }

                                                                                             return;
                                                                                          }

                                                                                          if (this.O == 0) {
                                                                                             this.O = 1;
                                                                                             this.b(var1);
                                                                                             return;
                                                                                          }

                                                                                          if (this.O == 1) {
                                                                                             this.O = 2;
                                                                                             this.a(var1, var2, var3);
                                                                                          }

                                                                                          return;
                                                                                       }

                                                                                       if (this.O == 0) {
                                                                                          this.O = 1;
                                                                                          this.b(var1);
                                                                                          return;
                                                                                       }

                                                                                       if (this.O == 1) {
                                                                                          this.O = 2;
                                                                                          this.a(var1, var2, var3);
                                                                                       }

                                                                                       return;
                                                                                    }

                                                                                    if (this.O == 0) {
                                                                                       this.O = 1;
                                                                                       this.b(var1);
                                                                                       return;
                                                                                    }

                                                                                    if (this.O == 1) {
                                                                                       this.O = 2;
                                                                                       this.a(var1, var2, var3);
                                                                                    }

                                                                                    return;
                                                                                 }

                                                                                 if (this.O == 0) {
                                                                                    this.O = 1;
                                                                                    this.b(var1);
                                                                                    return;
                                                                                 }

                                                                                 if (this.O == 1) {
                                                                                    this.O = 2;
                                                                                    this.a(var1, var2, var3);
                                                                                 }

                                                                                 return;
                                                                              }

                                                                              if (this.O == 0) {
                                                                                 this.O = 1;
                                                                                 this.b(var1);
                                                                                 return;
                                                                              }

                                                                              if (this.O == 1) {
                                                                                 this.O = 2;
                                                                                 this.a(var1, var2, var3);
                                                                              }

                                                                              return;
                                                                           }

                                                                           if (this.O == 0) {
                                                                              this.O = 1;
                                                                              this.b(var1);
                                                                              return;
                                                                           }

                                                                           if (this.O == 1) {
                                                                              this.O = 2;
                                                                              this.a(var1, var2, var3);
                                                                           }

                                                                           return;
                                                                        }

                                                                        if (this.O == 0) {
                                                                           this.O = 1;
                                                                           this.b(var1);
                                                                           return;
                                                                        }

                                                                        if (this.O == 1) {
                                                                           this.O = 2;
                                                                           this.a(var1, var2, var3);
                                                                        }

                                                                        return;
                                                                     }

                                                                     if (this.O == 0) {
                                                                        this.O = 1;
                                                                        this.b(var1);
                                                                        return;
                                                                     }

                                                                     if (this.O == 1) {
                                                                        this.O = 2;
                                                                        this.a(var1, var2, var3);
                                                                     }

                                                                     return;
                                                                  }

                                                                  if (this.O == 0) {
                                                                     this.O = 1;
                                                                     this.b(var1);
                                                                     return;
                                                                  }

                                                                  if (this.O == 1) {
                                                                     this.O = 2;
                                                                     this.a(var1, var2, var3);
                                                                  }

                                                                  return;
                                                               }

                                                               if (this.O == 0) {
                                                                  this.O = 1;
                                                                  this.b(var1);
                                                                  return;
                                                               }

                                                               if (this.O == 1) {
                                                                  this.O = 2;
                                                                  this.a(var1, var2, var3);
                                                               }

                                                               return;
                                                            }

                                                            if (this.O == 0) {
                                                               this.O = 1;
                                                               this.b(var1);
                                                               return;
                                                            }

                                                            if (this.O == 1) {
                                                               this.O = 2;
                                                               this.a(var1, var2, var3);
                                                            }

                                                            return;
                                                         }

                                                         if (this.O == 0) {
                                                            this.O = 1;
                                                            this.b(var1);
                                                            return;
                                                         }

                                                         if (this.O == 1) {
                                                            this.O = 2;
                                                            this.a(var1, var2, var3);
                                                         }

                                                         return;
                                                      }

                                                      if (this.O == 0) {
                                                         this.O = 1;
                                                         this.b(var1);
                                                         return;
                                                      }

                                                      if (this.O == 1) {
                                                         this.O = 2;
                                                         this.a(var1, var2, var3);
                                                      }

                                                      return;
                                                   }

                                                   if (this.O == 0) {
                                                      this.O = 1;
                                                      this.b(var1);
                                                      return;
                                                   }

                                                   if (this.O == 1) {
                                                      this.O = 2;
                                                      this.a(var1, var2, var3);
                                                   }

                                                   return;
                                                }

                                                if (this.O == 0) {
                                                   this.O = 1;
                                                   this.b(var1);
                                                   return;
                                                }

                                                if (this.O == 1) {
                                                   this.O = 2;
                                                   this.a(var1, var2, var3);
                                                }

                                                return;
                                             }

                                             if (this.O == 0) {
                                                this.O = 1;
                                                this.b(var1);
                                                return;
                                             }

                                             if (this.O == 1) {
                                                this.O = 2;
                                                this.a(var1, var2, var3);
                                             }

                                             return;
                                          }

                                          if (this.O == 0) {
                                             this.O = 1;
                                             this.b(var1);
                                             return;
                                          }

                                          if (this.O == 1) {
                                             this.O = 2;
                                             this.a(var1, var2, var3);
                                          }

                                          return;
                                       }

                                       if (this.O == 0) {
                                          this.O = 1;
                                          this.b(var1);
                                          return;
                                       }

                                       if (this.O == 1) {
                                          this.O = 2;
                                          this.a(var1, var2, var3);
                                       }

                                       return;
                                    }

                                    if (this.O == 0) {
                                       this.O = 1;
                                       this.b(var1);
                                       return;
                                    }

                                    if (this.O == 1) {
                                       this.O = 2;
                                       this.a(var1, var2, var3);
                                    }

                                    return;
                                 }

                                 if (this.O == 0) {
                                    this.O = 1;
                                    this.b(var1);
                                    return;
                                 }

                                 if (this.O == 1) {
                                    this.O = 2;
                                    this.a(var1, var2, var3);
                                 }

                                 return;
                              }

                              if (this.O == 0) {
                                 this.O = 1;
                                 this.b(var1);
                                 return;
                              }

                              if (this.O == 1) {
                                 this.O = 2;
                                 this.a(var1, var2, var3);
                              }

                              return;
                           }

                           if (this.O == 0) {
                              this.O = 1;
                              this.b(var1);
                              return;
                           }

                           if (this.O == 1) {
                              this.O = 2;
                              this.a(var1, var2, var3);
                           }

                           return;
                        }

                        if (this.O == 0) {
                           this.O = 1;
                           this.b(var1);
                           return;
                        }

                        if (this.O == 1) {
                           this.O = 2;
                           this.a(var1, var2, var3);
                        }

                        return;
                     }

                     if (this.O == 0) {
                        this.O = 1;
                        this.b(var1);
                        return;
                     }

                     if (this.O == 1) {
                        this.O = 2;
                        this.a(var1, var2, var3);
                     }

                     return;
                  }

                  if (this.O == 0) {
                     this.O = 1;
                     this.b(var1);
                     return;
                  }

                  if (this.O == 1) {
                     this.O = 2;
                     this.a(var1, var2, var3);
                  }

                  return;
               }

               if (this.O == 0) {
                  this.O = 1;
                  this.b(var1);
                  return;
               }

               if (this.O == 1) {
                  this.O = 2;
                  this.a(var1, var2, var3);
               }

               return;
            }

            if (this.O == 0) {
               this.O = 1;
               this.b(var1);
               return;
            }

            if (this.O == 1) {
               this.O = 2;
               this.a(var1, var2, var3);
            }

            return;
         }

         if (this.O == 0) {
            this.O = 1;
            this.b(var1);
            return;
         }

         if (this.O == 1) {
            this.O = 2;
            this.a(var1, var2, var3);
         }

         return;
      }

      if (this.O == 0) {
         this.O = 1;
         this.b(var1);
      } else {
         if (this.O == 1) {
            this.O = 2;
            this.a(var1, var2, var3);
         }

      }
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      if (!this.c && !this.d) {
         if (var1.j == null || !(var1.j instanceof VDTT_hu)) {
            this.a.a(var1.b, this.M, this);
            if (var1.b >= 1020 && var1.b < 1030) {
               return;
            }

            switch(this.I) {
            case -91:
               return;
            case -16:
            case -15:
            case 73:
            case 552:
            case 572:
            case 684:
            case 715:
            case 722:
            case 723:
            case 724:
            case 725:
               VDTT_ac.b().o();
               return;
            case -13:
            case -12:
            case 17:
               VDTT_ac.b().n();
               return;
            case -11:
            case 91:
               VDTT_ac.b().w();
               return;
            case 6:
               VDTT_ac.b().x();
               return;
            default:
               VDTT_ac.b().n();
            }
         }

      }
   }

   public Vector g() {
      Vector var1 = new Vector();
      if (!this.c && !this.d) {
         if (this.I != -15 && this.I != 552 && this.I != 572 && this.I != 73 && this.I != 82) {
            VDTT_cw var2;
            if (this.I != -12 && this.I != -13 && this.I != 460 && this.I != 557 && ((var2 = VDTT_cw.v()).du == null || var2.du.b == null || !var2.du.b.contains(this)) && !this.equals(VDTT_cw.v().aO)) {
               var1.addElement(new VDTT_hl(this.m, 0, 0, this.q, this.r, (VDTT_hs)null, this));
            } else {
               var1.addElement(new VDTT_hl(this.m, -2, -2, this.q + 1, this.r + 2, (VDTT_hs)null, this));
            }
         } else {
            var1.addElement(new VDTT_hl(this.m, 0, 0, VDTT_jb.n(this.q), VDTT_jb.n(this.r), (VDTT_hs)null, this));
         }
      }

      return var1;
   }

   public final boolean d() {
      if (!this.c && !this.d) {
         if (this.O == 1) {
            return true;
         } else {
            return this.N ? true : this.e(0);
         }
      } else {
         return false;
      }
   }

   public static int f() {
      switch(VDTT_ek.m().o) {
      case 0:
         return 722;
      case 1:
      default:
         return 0;
      case 2:
         return 723;
      case 3:
         return 724;
      case 4:
         return VDTT_ek.m().bh != null && VDTT_ek.m().bh.d > 0 ? VDTT_ek.m().bh.d : 725;
      }
   }
}
