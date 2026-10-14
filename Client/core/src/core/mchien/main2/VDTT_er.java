package core.mchien.main2;

import java.util.Vector;

public final class VDTT_er extends VDTT_n {
   public short k;
   private byte V = -1;
   private byte W = -1;
   private int X = 0;
   public VDTT_n l;
   private VDTT_n Y;
   private VDTT_n Z;
   private int aa;
   private int ab;
   private int ac;
   private int ad;
   private int ae;
   public int m;
   public int n;
   public int o;
   private boolean af;
   private boolean ag;
   private Vector ah = new Vector();
   private Vector ai = new Vector();
   private Vector aj = new Vector();
   private VDTT_fb ak;
   private int al;
   private int am;
   private Vector an;
   private Vector ao;
   public int p;
   public int I;
   public int J;
   public int K;
   public XYEntity L;
   public XYEntity M;
   public VDTT_ek N;
   public VDTT_ek O;
   private boolean ap;
   public static byte[] P = new byte[]{0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1};
   public static int[] Q = new int[]{0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};
   public static int[] R = new int[]{0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};
   public static int[] S = new int[]{0, 17, 34, 52, 69, 87, 104, 121, 139, 156, 173, 190, 207, 224, 241, 258, 275, 292, 309, 325, 342, 358, 374, 390, 406, 422, 438, 453, 469, 484, 499, 515, 529, 544, 559, 573, 587, 601, 615, 629, 642, 656, 669, 681, 694, 707, 719, 731, 743, 754, 766, 777, 788, 798, 809, 819, 829, 838, 848, 857, 866, 874, 882, 891, 898, 906, 913, 920, 927, 933, 939, 945, 951, 956, 961, 965, 970, 974, 978, 981, 984, 987, 990, 992, 994, 996, 997, 998, 999, 999, 1000};
   public static int[] T = new int[]{1000, 999, 999, 998, 997, 996, 994, 992, 990, 987, 984, 981, 978, 974, 970, 965, 961, 956, 951, 945, 939, 933, 927, 920, 913, 906, 898, 891, 882, 874, 866, 857, 848, 838, 829, 819, 809, 798, 788, 777, 766, 754, 743, 731, 719, 707, 694, 681, 669, 656, 642, 629, 615, 601, 587, 573, 559, 544, 529, 515, 500, 484, 469, 453, 438, 422, 406, 390, 374, 358, 342, 325, 309, 292, 275, 258, 241, 224, 207, 190, 173, 156, 139, 121, 104, 87, 69, 52, 34, 17, 0};
   public static int[] U = new int[]{0, 17, 34, 52, 69, 87, 105, 122, 140, 158, 176, 194, 212, 230, 249, 267, 286, 305, 324, 344, 363, 383, 404, 424, 445, 466, 487, 509, 531, 554, 577, 600, 624, 649, 674, 700, 726, 753, 781, 809, 839, 869, 900, 932, 965, 999, 1035, 1072, 1110, 1150, 1191, 1234, 1279, 1327, 1376, 1428, 1482, 1539, 1600, 1664, 1732, 1804, 1880, 1962, 2050, 2144, 2246, 2355, 2475, 2605, 2747, 2904, 3077, 3270, 3487, 3732, 4010, 4331, 4704, 5144, 5671, 6313, 7115, 8144, 9514, 11430, 14300, 19081, 28636, 57289, Integer.MAX_VALUE};

   public final VDTT_es m() {
      if (this.k < 0 || this.k >= DataCenter.d().B.length) {
         this.k = 0;
      }

      return DataCenter.d().B[this.k];
   }

   public VDTT_er(int var1, int var2, int var3, VDTT_n var4, int var5, int var6, boolean var7, Vector var8, Vector var9, VDTT_ek var10, VDTT_ek var11, int var12) {
      this.N = var10;
      this.O = var11;
      this.a(var1, var2, var3, var4, var5, var6, false, var8, var9, var12);
   }

   public VDTT_er(int var1, int var2, int var3, VDTT_n var4, int var5, int var6, boolean var7, Vector var8, Vector var9) {
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, 0);
   }

   private void a(int var1, int var2, int var3, VDTT_n var4, int var5, int var6, boolean var7, Vector var8, Vector var9, int var10) {
      this.L = XYEntity.e(var2, var3);
      this.M = XYEntity.e(var2, var3);
      this.an = var8;
      this.ao = var9;
      this.ag = var7;
      this.k = (short)var1;
      this.l = var4;
      this.Z = var4;
      this.ad = var5;
      this.ae = var6;
      this.ab = var2;
      this.ac = var3;
      this.p = this.m().c;
      int var11;
      if (this.m().a == 1) {
         while((var11 = VDTT_jb.a(new int[]{0, -1, -2})) == var10) {
         }

         this.m = var11;
      } else if (this.m().a == 8) {
         while((var11 = VDTT_jb.a(new int[]{0, 6, 7})) == var10) {
         }

         this.m = var11;
      } else {
         this.m = this.m().a;
      }

      this.f(var2, var3);
      var11 = var4.objX - var2;
      var10 = var4.objY - var3;
      int var12 = b(var11, var10);
      VDTT_fb var13;
      VDTT_fb var19;
      if (this.m == 25) {
         for(var10 = 0; var10 < 20; ++var10) {
            this.ai.add(new VDTT_fb(var2, var3, true));
         }
      } else if (this.m == 3 && !var7) {
         if (var4.objX > var2) {
            this.ab = var4.objX - this.m().h;
         } else {
            this.ab = var4.objX + this.m().h;
         }

         this.ac = var4.objY - 200 - VDTT_jb.a((int)200);
         this.f(this.ab, this.ac);
      } else if (this.m == 10) {
         this.Y = var4;
         this.l = new VDTT_ek();
         this.l.f(var2, var3);
      } else if (this.m != -1 && this.m != -2) {
         int var14;
         Vector var18;
         if (this.m == 7) {
            var10 = this.m().g;
            var18 = new Vector();
            if (var4.objX > var2) {
               for(var12 = 305; var12 > 45; var12 -= this.p) {
                  var13 = VDTT_jb.a(new VDTT_fb(var2, var3), new VDTT_fb(var2 + var10, var3), var12);
                  this.ai.addElement(var13);
               }

               var19 = (VDTT_fb)this.ai.firstElement();
               var13 = new VDTT_fb(var2 + VDTT_jb.b(var19.objX - var2) / 2, var3 + VDTT_jb.b(var19.objY - var3) / 2);

               for(var14 = 360; var14 > 180; var14 -= this.p) {
                  var18.add(VDTT_jb.a(var13, new VDTT_fb(var2, var3), var14));
               }
            } else {
               for(var12 = 225; var12 < 485; var12 += this.p) {
                  var13 = VDTT_jb.a(new VDTT_fb(var2, var3), new VDTT_fb(var2 + var10, var3), var12);
                  this.ai.addElement(var13);
               }

               var19 = (VDTT_fb)this.ai.firstElement();
               var13 = new VDTT_fb(var2 - VDTT_jb.b(var19.objX - var2) / 2, var3 + VDTT_jb.b(var19.objY - var3) / 2);

               for(var14 = 0; var14 < 180; var14 += this.p) {
                  var18.add(VDTT_jb.a(var13, new VDTT_fb(var2, var3), var14));
               }
            }

            var18.addAll(this.ai);
            this.ai = var18;
         } else if (this.m == 6) {
            var10 = this.m().g;
            var18 = new Vector();
            if (var4.objX > var2) {
               for(var12 = 45; var12 < 305; var12 += this.p) {
                  var13 = VDTT_jb.a(new VDTT_fb(var2, var3), new VDTT_fb(var2 + var10, var3), var12);
                  this.ai.addElement(var13);
               }

               var19 = (VDTT_fb)this.ai.firstElement();
               var13 = new VDTT_fb(var2 + VDTT_jb.b(var19.objX - var2) / 2, var3 - VDTT_jb.b(var19.objY - var3) / 2);

               for(var14 = 180; var14 < 360; var14 += this.p) {
                  var18.add(VDTT_jb.a(var13, var19, var14));
               }
            } else {
               for(var12 = 135; var12 > -135; var12 -= this.p) {
                  var13 = VDTT_jb.a(new VDTT_fb(var2, var3), new VDTT_fb(var2 + var10, var3), var12);
                  this.ai.addElement(var13);
               }

               var19 = (VDTT_fb)this.ai.firstElement();
               var13 = new VDTT_fb(var2 - VDTT_jb.b(var19.objX - var2) / 2, var3 - VDTT_jb.b(var19.objY - var3) / 2);

               for(var14 = 180; var14 > 0; var14 -= this.p) {
                  var18.add(VDTT_jb.a(var13, var19, var14));
               }
            }

            var18.addAll(this.ai);
            this.ai = var18;
         } else if (this.m == 2) {
            this.Y = new VDTT_fb(var2, var3 - this.m().g);
         }
      } else {
         if (var11 > var10) {
            this.aa = b(var11, -var10);
         } else {
            this.aa = b(-var11, var10);
         }

         this.Y = new VDTT_ek();
         if (this.m == -1) {
            this.Y.f(var4.objX, var3 - 100);
            if (var12 >= 90 && var12 < 270) {
               if (var11 > var10) {
                  this.aa = b(-var11, var10);
               } else {
                  this.aa = b(var11, -var10);
               }

               this.Y.f(var4.objX, var3 + 100);
            }
         } else if (this.m == -2) {
            this.Y.f(var4.objX, var3 + 100);
            if (var12 >= 90 && var12 < 270) {
               if (var11 > var10) {
                  this.aa = b(-var11, var10);
               } else {
                  this.aa = b(var11, -var10);
               }

               this.Y.f(var4.objX, var3 - 100);
            }
         }
      }

      Vector var17 = new Vector();
      if (!var7) {
         if (this.m == 13) {
            for(var11 = 0; var11 < this.m().g; ++var11) {
               var19 = new VDTT_fb(var4.objX, var4.objY);
               VDTT_er var20;
               (var20 = new VDTT_er(var1, var19.objX, var19.objY, var4, -1, 0, true, var8, var9)).V = (byte)VDTT_jb.a(this.m().l[0].length);
               if (var11 % 2 == 0) {
                  var20.Y = new VDTT_fb(var19.objX + VDTT_jb.a(30, 70), var19.objY - VDTT_jb.a(30, 70));
                  var20.l = new VDTT_fb(var20.Y.objX + VDTT_jb.a(40, 80), var20.Y.objY + VDTT_jb.a(50, 150));
               } else {
                  var20.Y = new VDTT_fb(var19.objX - VDTT_jb.a(30, 70), var19.objY - VDTT_jb.a(30, 70));
                  var20.l = new VDTT_fb(var20.Y.objX - VDTT_jb.a(40, 80), var20.Y.objY + VDTT_jb.a(50, 150));
               }

               var17.add(var20);
            }

            var8.addAll(var17);
         } else {
            VDTT_er var22;
            if (this.m == 3) {
               for(var11 = 0; var11 < this.m().g; ++var11) {
                  var12 = VDTT_jb.a((int)100) - 50;
                  var13 = new VDTT_fb(var4.objX + var12, var4.objY - 200 - VDTT_jb.a((int)200));
                  (var22 = new VDTT_er(var1, var13.objX + (var4.objX > var2 ? -this.m().h : this.m().h), var13.objY, var4, var5, var6, true, var8, var9)).am = var12;
                  var8.add(var22);
               }
            } else {
               int var23;
               if (this.m == 16) {
                  if (this.m().h == 0) {
                     this.m().h = 30;
                  }

                  for(var11 = 0; var11 < 360; var11 += this.m().h) {
                     var13 = VDTT_jb.a(var19 = new VDTT_fb(var2, var3), new VDTT_fb(var19.objX + this.m().g, var19.objY), var11);
                     (var22 = new VDTT_er(var1, var19.objX, var19.objY, var13, var5, var6, true, var8, var9)).ag = true;
                     var22.p += VDTT_jb.a((int)5);
                     var8.add(var22);
                     var17.add(var22);
                  }

                  var11 = VDTT_jb.a(10, 50);
                  this.p += VDTT_jb.a((int)5);

                  for(var12 = 0; var12 < var11; ++var12) {
                     this.ai.add(new VDTT_fb(var2, var3, false));
                  }

                  for(var12 = 0; var12 < var17.size(); ++var12) {
                     var11 = VDTT_jb.a(10, 40);

                     for(var23 = 0; var23 < var11; ++var23) {
                        (var22 = (VDTT_er)var17.get(var12)).ai.add(new VDTT_fb(var22.objX, var22.objY, false));
                     }
                  }
               } else if (this.m().a == 11) {
                  var11 = 0;

                  for(var12 = 0; var12 < 360; var12 += this.m().h) {
                     ++var11;
                     if (var11 != 4) {
                        VDTT_fb var24 = VDTT_jb.a(var13 = new VDTT_fb(var4.objX, var4.objY), new VDTT_fb(var13.objX + this.m().g + VDTT_jb.a((int)100), var13.objY), var12);
                        if (var12 == 0) {
                           this.Y = new VDTT_fb(var24.objX, var24.objY);
                           this.p += 3;
                           var17.add(this);
                        } else {
                           VDTT_er var15;
                           (var15 = new VDTT_er(var1, var2, var3, var4, var5, var6, true, var8, var9)).Y = new VDTT_fb(var24.objX, var24.objY);
                           var15.p += 3;
                           var17.add(var15);
                           var8.add(var15);
                        }
                     }
                  }

                  for(var12 = 0; var12 < var17.size(); ++var12) {
                     for(var23 = var12; var23 < var17.size(); ++var23) {
                        (var22 = (VDTT_er)var17.get(var23)).O = this.O;
                        var22.ai.add(new VDTT_fb(var22.objX, var22.objY, false));
                        var22.ai.add(new VDTT_fb(var22.objX, var22.objY, false));
                        var22.ai.add(new VDTT_fb(var22.objX, var22.objY, false));
                        var22.ai.add(new VDTT_fb(var22.objX, var22.objY, false));
                        var22.ai.add(new VDTT_fb(var22.objX, var22.objY, false));
                     }
                  }

                  for(var12 = 0; var12 < var17.size(); ++var12) {
                     for(var23 = 0; var23 < var17.size(); ++var23) {
                        var22 = (VDTT_er)var17.get(var23);

                        for(int var16 = 0; var16 < 8; ++var16) {
                           var22.aj.add(new VDTT_fb(var22.Y.objX, var22.Y.objY));
                        }
                     }
                  }
               } else {
                  VDTT_fb var21;
                  if (this.m().a == 12) {
                     var21 = new VDTT_fb(var4.objX, var4.objY);

                     for(var12 = 0; var12 < 360; var12 += this.m().h) {
                        var13 = VDTT_jb.a(var21, new VDTT_fb(var21.objX + this.m().g, var21.objY), var12);
                        if (var12 == 0) {
                           this.ab = var13.objX;
                           this.ac = var13.objY;
                           this.f(var13.objX, var13.objY);
                           this.Y = var4;
                           this.l = var13;
                        } else {
                           (var22 = new VDTT_er(var1, var13.objX, var13.objY, var4, var5, var6, true, var8, var9)).Y = var4;
                           var22.l = var13;
                           var17.add(var22);
                        }
                     }

                     var8.addAll(var17);
                  } else if (this.m().a == 5) {
                     for(var11 = 0; var11 < 360; var11 += this.m().h) {
                        var13 = VDTT_jb.a(var19 = new VDTT_fb(var4.objX, var4.objY), new VDTT_fb(var19.objX + this.m().g, var19.objY), var11);
                        var8.add(new VDTT_er(var1, var13.objX, var13.objY, var4, var5, var6, true, var8, var9));
                     }
                  } else if (this.m().a == 15) {
                     var21 = new VDTT_fb(var2, var3);

                     for(var12 = 0; var12 < 360; var12 += this.m().h) {
                        var13 = VDTT_jb.a(var21, new VDTT_fb(var21.objX + this.m().g, var21.objY), var12);
                        var8.add(new VDTT_er(var1, var13.objX, var13.objY, var21, var5, var6, true, var8, var9));
                     }

                     this.l = var21;
                  } else if (this.m().a == 23) {
                     var21 = new VDTT_fb(var2, var3 - this.m().g);
                     this.l = var21;
                     this.J = this.m().h;
                  } else if (this.m().a == 20) {
                     for(var11 = 0; var11 < 40; ++var11) {
                        this.ai.add(new VDTT_fb(var2, var3));
                     }
                  } else if (this.m().a == 22) {
                     if (this.m().g == 0) {
                        this.m().g = 50;
                     }

                     if (this.m().h == 0) {
                        this.m().h = 72;
                     }

                     var21 = new VDTT_fb(var2, var3);

                     for(var12 = 0; var12 < 360; var12 += this.m().h) {
                        var13 = VDTT_jb.a(var21, new VDTT_fb(var21.objX - this.m().g, var21.objY), var12);
                        var22 = new VDTT_er(var1, var13.objX, var13.objY, var4, var5, var6, true, var8, var9);
                        var8.add(var22);
                     }
                  } else if (this.m().a == 21) {
                     if (this.m().g == 0) {
                        this.m().g = 50;
                     }

                     if (this.m().h == 0) {
                        this.m().h = 72;
                     }

                     this.J = 50;

                     for(var11 = 0; var11 < 360; var11 += this.m().h) {
                        var13 = VDTT_jb.a(var19 = new VDTT_fb(var2, var3), new VDTT_fb(var19.objX - this.m().g, var19.objY), var11);
                        if (var11 == 0) {
                           this.Y = var13;
                           this.M = var13;
                        } else {
                           (var22 = new VDTT_er(var1, var2, var3, var4, var5, var6, true, var8, var9)).Y = var13;
                           var22.N = this.N;
                           var22.J = this.J;
                           var22.M = var13;
                           var8.add(var22);
                        }
                     }
                  } else if (this.m().a == 9) {
                     var19 = VDTT_jb.a(var21 = new VDTT_fb(var2, var3), var4, 0);
                     this.Y = var19;
                     this.l = var4;

                     for(var23 = 0; var23 < this.m().g; ++var23) {
                        var19 = VDTT_jb.a(var21, this.Y, this.m().h * (var23 + 1));
                        (var22 = new VDTT_er(var1, var2, var3, var19, var5, var6, true, var8, var9)).Y = var19;
                        var22.l = this.l;
                        var8.add(var22);
                        var19 = VDTT_jb.a(var21, this.Y, -this.m().h * (var23 + 1));
                        (var22 = new VDTT_er(var1, var2, var3, var19, var5, var6, true, var8, var9)).Y = var19;
                        var22.l = this.l;
                        var8.add(var22);
                     }
                  } else if (this.m().a == 17) {
                     if (this.m().g == 0) {
                        this.m().g = 200;
                     }

                     this.l = new VDTT_fb(var2, var3 - this.m().g);
                  }
               }
            }
         }
      }

      if (this.ai.size() > 0) {
         this.ah.add(new VDTT_fb(var3, var3));
         this.ah.addAll(this.ai);
      }

      if (this.p() && this.O != null) {
         for(var11 = 0; var11 < 40; ++var11) {
            this.o();
         }

         this.Y = (VDTT_n)this.ah.get(this.ah.size() - 1);
         this.o = this.n;
         this.I = this.n = this.al = 0;
         this.ab = this.objX = (short)var2;
         this.ac = this.objY = (short)var3;
         if (var1 == 81) {
            this.I = 8;
         }
      }

      this.q();
   }

   public final int a() {
      return this.objX - this.q / 2;
   }

   public final int b() {
      return this.objX + this.q / 2;
   }

   public final int c() {
      return this.objY - this.r / 2;
   }

   public final int d() {
      return this.objY + this.r / 2;
   }

   public final boolean n() {
      boolean var1;
      if (var1 = this.r()) {
         this.w();
         if (!this.ap && this.ad > 0 && !this.s() && !this.ag && !this.ap) {
            this.ap = true;
            VDTT_hi var2 = new VDTT_hi(this.ad, this.l.objX + this.am, this.l.objY);
            if (this.ae == 1) {
               (var2 = new VDTT_hi(this.ad, this.l.k() + this.am, this.l.l())).J = true;
            }

            var2.L = this.am;
            if (this.m().a != 21) {
               if (this.l instanceof VDTT_ek) {
                  ((VDTT_ek)this.l).bf.add(var2);
               } else if (this.l instanceof VDTT_gk) {
                  this.ao.add(var2);
               }
            }
         }
      }

      return var1;
   }

   private boolean r() {
      if (this.af) {
         return this.af;
      } else {
         VDTT_n var1;
         VDTT_ek var2;
         if ((var1 = this.l) instanceof VDTT_ek && (var2 = (VDTT_ek)var1).ag == 0 && var2.ah == 0 && this.I < 20) {
            return false;
         } else {
            if (this.Y != null) {
               var1 = this.Y;
            }

            if (var1 == null) {
               this.af = true;
               return this.af;
            } else {
               boolean var5 = false;
               if (this.m().a == 21 && this.Y != null) {
                  if (var5 = this.objX == this.Y.objX && this.objY == this.Y.objY) {
                     this.p = this.m().c;
                  }
               } else if (this.J > 0) {
                  --this.J;
                  if (this.J == 0) {
                     var5 = true;
                  }
               } else if (this.m().a != 2 && this.m().a != 3) {
                  if (!(var5 = VDTT_jb.a(this.objX - this.m().i, this.objY - this.m().i, this.objX + this.m().i, this.objY + this.m().i, var1.k() + this.am - 5, var1.l() - 5, var1.k() + this.am + 5, var1.l() + 5)) && this.p() && this.O != null && this.l != null && VDTT_jb.a(this.O.k(), this.O.l(), this.l.k(), this.l.l()) < 70 && this.m().g < 120) {
                     var5 = true;
                  }
               } else {
                  var5 = VDTT_jb.a(this.objX - this.m().i, this.objY - this.m().i, this.objX + this.m().i, this.objY + this.m().i, var1.k() + this.am - 5, var1.objY - 5, var1.k() + this.am + 5, var1.objY + 5);
               }

               VDTT_hi var6;
               if (var5) {
                  if (this.m().a == 11 && this.Y != null) {
                     this.p = this.m().c;
                     this.ai = this.aj;
                  } else if (this.ad > 0 && !this.s() && (!this.ag || this.m().a == 11) && ((this.m().a == 10 || this.m().a == 12) && this.Y != null || this.m().a != 10 && this.m().a != 12 && this.m().a != 17 && this.m().a != 15 && this.m().a != 21 && this.Y == null) && !this.ap) {
                     var6 = new VDTT_hi(this.ad, var1.objX + this.am, var1.objY);
                     if (this.ae == 1) {
                        (var6 = new VDTT_hi(this.ad, var1.k() + this.am, var1.l())).J = true;
                     }

                     var6.L = this.am;
                     if (var1 instanceof VDTT_ek) {
                        ((VDTT_ek)var1).bf.add(var6);
                     } else {
                        this.ao.add(var6);
                     }

                     this.ap = true;
                  }

                  this.af = true;
                  VDTT_fb var3;
                  VDTT_er var4;
                  int var7;
                  if (this.m().a == 4 && !this.ag) {
                     for(var7 = 0; var7 < 360; var7 += this.m().h) {
                        var3 = VDTT_jb.a(var3 = new VDTT_fb(var1.objX + this.am, var1.objY), new VDTT_fb(var3.objX + this.m().g, var3.objY), var7);
                        var4 = new VDTT_er(this.k, var1.objX, var1.objY, var3, -1, 0, true, this.an, this.ao);
                        this.an.add(var4);
                     }
                  }

                  if (this.m().a == 17 && !this.ag) {
                     if (this.m().g == 0) {
                        this.m().g = 200;
                     }

                     if (this.m().h == 0) {
                        this.m().h = 30;
                     }

                     for(var7 = 0; var7 < 360; var7 += this.m().h) {
                        var3 = VDTT_jb.a(var3 = new VDTT_fb(var1.objX + this.am, var1.objY), new VDTT_fb(var3.objX + 180, var3.objY), var7);
                        int var10006 = var7 == 0 ? -1 : this.ad;
                        (var4 = new VDTT_er(this.m().f, var1.objX, var1.objY, this.Z, var10006, 0, var7 == 0, this.an, this.ao)).Y = new VDTT_fb(var3.objX, var3.objY);
                        this.an.add(var4);
                     }
                  }

                  if (this.p()) {
                     return true;
                  }
               } else if (VDTT_jb.a(this.objX, this.objY, var1.k(), var1.l()) > 1000) {
                  if (this.p()) {
                     return true;
                  }

                  this.af = true;
               }

               if (this.p() && VDTT_jb.a(this.objX - this.m().i, this.objY - this.m().i, this.objX + this.m().i, this.objY + this.m().i, this.l.k() + this.am - 5, this.l.l() - 5, this.l.k() + this.am + 5, this.l.l() + 5) && this.ad > 0 && !this.s() && !this.ag && !this.ap) {
                  this.ap = true;
                  var6 = new VDTT_hi(this.ad, this.l.objX + this.am, this.l.objY);
                  if (this.ae == 1) {
                     (var6 = new VDTT_hi(this.ad, this.l.k() + this.am, this.l.l())).J = true;
                  }

                  var6.L = this.am;
                  if (this.l instanceof VDTT_ek) {
                     ((VDTT_ek)this.l).bf.add(var6);
                  } else {
                     this.ao.add(var6);
                  }

                  if (this.k == 79 || this.k == 81 || this.k == 82) {
                     this.K = 1;
                  }
               }

               if (this.af && this.Y != null) {
                  this.Y = null;
                  this.af = false;
                  if (this.m == 2) {
                     this.objX = this.l.objX;
                  }
               }

               return this.af;
            }
         }
      }
   }

   public final void o() {
      ++this.I;
      int var1;
      if (this.p() && ((var1 = VDTT_jb.a(this.L.objX, this.L.objY, this.l.k(), this.l.l())) >= 120 || this.Y == null)) {
         if (var1 < this.m().g) {
            var1 = this.m().g;
         }

         VDTT_ek var2;
         if (var1 < 250 && this.l instanceof VDTT_ek && (var2 = (VDTT_ek)this.l).ag == 0 && var2.ah == 0) {
            var1 = 250;
         }

         int var5 = this.l.k();
         int var3 = this.l.l();
         if (this.m().g > 120) {
            byte var4 = 50;
            if (VDTT_jb.b(this.O.objY, this.l.objY) < 3) {
               var4 = 120;
            }

            if (this.O.objX > this.l.objX && this.O.objX - this.l.objX < var4) {
               var5 = (short)(this.O.objX - var4);
            } else if (this.O.objX < this.l.objX && this.l.objX - this.O.objX < var4) {
               var5 = (short)(this.O.objX + var4);
            }
         }

         XYEntity var6;
         if ((var6 = VDTT_jb.a(this.L, XYEntity.e(var5, var3), (double)var1)) != null) {
            this.Y = new VDTT_fb(var6.objX, var6.objY);
            this.Y.d(this.l.q, this.l.r);
         }
      }

      this.ab = this.objX;
      this.ac = this.objY;
      this.v();
      this.X += this.m().e;
      if (this.X >= 360) {
         this.X = 0;
      }

      if (this.m == 2 || this.m == 3) {
         ++this.al;
         if (this.al > 50) {
            this.al = 50;
         }
      }

      if (this.m == 27 && DataCenter.d().h % 3 > 0) {
         ++this.al;
         if (this.al > 40) {
            this.al = 40;
         }
      }

      if (this.p()) {
         this.al += this.m().h;
         if (this.al > 50) {
            this.al = 50;
         }
      }

      if (this.m().l != null && this.m().l.length > 0 && this.m().l[0] != null) {
         var1 = this.m().l[0].length;
         if (this.m != 13) {
            ++this.V;
         }

         if (this.V >= var1) {
            this.V = 0;
         }
      }

   }

   private boolean s() {
      return this.m().a == 13 && !this.ag || this.ak != null && !this.ak.k;
   }

   private int[] a(int var1, int var2, int var3) {
      var1 = this.L.objX - var1;
      var2 = this.L.objY - var2;
      if (VDTT_jb.b(this.L.objY, this.l.l()) < 5 && VDTT_jb.b(this.L.objX, this.l.objX) < 30) {
         var2 = 0;
      }

      var1 = b(var1, var2);
      this.n = var1;
      int var4 = 0;
      int var5 = 0;
      int[] var9;
      byte var10;
      byte var11;
      if (this.m().a != 14 && this.m().a != 26) {
         if (this.m().a == 18) {
            var1 = var1;
            var10 = 0;
            var11 = 0;
            if (var1 < 355 && var1 >= 5) {
               if (var1 >= 175 && var1 < 185) {
                  var10 = 58;
                  var11 = -3;
               } else if (var1 >= 185 && var1 < 195) {
                  var10 = 59;
                  var11 = 9;
               } else if (var1 >= 195 && var1 < 205) {
                  var10 = 57;
                  var11 = 22;
               } else if (var1 >= 205 && var1 < 215) {
                  var10 = 55;
                  var11 = 30;
               } else if (var1 >= 215 && var1 < 225) {
                  var10 = 51;
                  var11 = 35;
               } else if (var1 >= 225 && var1 < 235) {
                  var10 = 48;
                  var11 = 39;
               } else if (var1 >= 235 && var1 < 245) {
                  var10 = 43;
                  var11 = 43;
               } else if (var1 >= 245 && var1 < 255) {
                  var10 = 39;
                  var11 = 46;
               } else if (var1 >= 255 && var1 < 265) {
                  var10 = 31;
                  var11 = 49;
               } else if (var1 >= 265 && var1 < 270) {
                  var10 = 25;
                  var11 = 51;
               } else if (var1 >= 345 && var1 < 355) {
                  var10 = -59;
                  var11 = 9;
               } else if (var1 >= 335 && var1 < 345) {
                  var10 = -57;
                  var11 = 22;
               } else if (var1 >= 325 && var1 < 335) {
                  var10 = -55;
                  var11 = 30;
               } else if (var1 >= 315 && var1 < 325) {
                  var10 = -51;
                  var11 = 35;
               } else if (var1 >= 305 && var1 < 315) {
                  var10 = -48;
                  var11 = 39;
               } else if (var1 >= 295 && var1 < 305) {
                  var10 = -43;
                  var11 = 43;
               } else if (var1 >= 285 && var1 < 295) {
                  var10 = -39;
                  var11 = 46;
               } else if (var1 >= 275 && var1 < 285) {
                  var10 = -31;
                  var11 = 49;
               } else if (var1 > 270 && var1 < 275) {
                  var10 = -25;
                  var11 = 51;
               } else if (var1 >= 5 && var1 < 15) {
                  var10 = -54;
                  var11 = -16;
               } else if (var1 >= 15 && var1 < 25) {
                  var10 = -54;
                  var11 = -18;
               } else if (var1 >= 25 && var1 < 35) {
                  var10 = -48;
                  var11 = -30;
               } else if (var1 >= 35 && var1 < 45) {
                  var10 = -44;
                  var11 = -34;
               } else if (var1 >= 45 && var1 < 55) {
                  var10 = -40;
                  var11 = -40;
               } else if (var1 >= 55 && var1 < 65) {
                  var10 = -36;
                  var11 = -43;
               } else if (var1 >= 65 && var1 < 75) {
                  var10 = -31;
                  var11 = -46;
               } else if (var1 >= 75 && var1 < 85) {
                  var10 = -24;
                  var11 = -49;
               } else if (var1 >= 85 && var1 < 90) {
                  var10 = -20;
                  var11 = -50;
               } else if (var1 >= 165 && var1 < 175) {
                  var10 = 54;
                  var11 = -13;
               } else if (var1 >= 155 && var1 < 165) {
                  var10 = 54;
                  var11 = -18;
               } else if (var1 >= 145 && var1 < 155) {
                  var10 = 48;
                  var11 = -30;
               } else if (var1 >= 135 && var1 < 145) {
                  var10 = 44;
                  var11 = -34;
               } else if (var1 >= 125 && var1 < 135) {
                  var10 = 40;
                  var11 = -40;
               } else if (var1 >= 115 && var1 < 125) {
                  var10 = 36;
                  var11 = -43;
               } else if (var1 >= 105 && var1 < 115) {
                  var10 = 31;
                  var11 = -46;
               } else if (var1 >= 95 && var1 < 105) {
                  var10 = 24;
                  var11 = -49;
               } else if (var1 > 90 && var1 < 95) {
                  var10 = 20;
                  var11 = -50;
               } else if (var1 == 90) {
                  if (var3 < 90) {
                     var10 = -20;
                     var11 = -50;
                     --var1;
                  } else {
                     var10 = 20;
                     var11 = -50;
                     ++var1;
                  }
               } else if (var1 == 270) {
                  if (var3 < 270) {
                     var10 = -25;
                     var11 = 52;
                     --var1;
                  } else {
                     var10 = 25;
                     var11 = 52;
                     ++var1;
                  }
               }
            } else {
               var10 = -60;
               var11 = -2;
            }

            var4 = (var9 = new int[]{var10, var11, var1})[0];
            var5 = var9[1];
            this.n = var9[2];
         } else if (this.m().a == 24) {
            var4 = 0;
            var5 = 0;
            this.n = var1;
            if (this.N != null) {
               var3 = 66;
               if (this.n < 25 || this.n >= 155) {
                  if (this.n >= 205 && this.n < 335) {
                     var3 += 6;
                  } else if (this.n >= 165 && this.n < 175 || this.n >= 15 && this.n < 25) {
                     var3 += 2;
                  } else if (this.n >= 155 && this.n < 165 || this.n >= 5 && this.n < 15) {
                     ++var3;
                  } else if ((this.n < 345 || this.n >= 355) && (this.n < 185 || this.n >= 195)) {
                     if ((this.n < 335 || this.n >= 345) && (this.n < 195 || this.n >= 205)) {
                        var3 += 3;
                     } else {
                        var3 += 5;
                     }
                  } else {
                     var3 += 4;
                  }
               }

               Vector var6 = this.N.be;

               for(int var7 = 0; var7 < var6.size(); ++var7) {
                  VDTT_hc var8;
                  if ((var8 = (VDTT_hc)var6.get(var7)).d == 3) {
                     var4 = var8.h[var3].d;
                     var5 = var8.h[var3].e + 17;
                     if (this.N.bv != null) {
                        var5 = var8.h[var3].e + 20;
                     }

                     if (var1 < 90 || var1 >= 270) {
                        var4 = -var4;
                     }
                  }
               }
            }
         }
      } else {
         var1 = var1;
         var10 = 0;
         var11 = 0;
         if (var1 < 355 && var1 >= 5) {
            if (var1 >= 175 && var1 < 185) {
               var10 = 58;
               var11 = 0;
            } else if (var1 >= 185 && var1 < 195) {
               var10 = 59;
               var11 = 10;
            } else if (var1 >= 195 && var1 < 205) {
               var10 = 57;
               var11 = 22;
            } else if (var1 >= 205 && var1 < 215) {
               var10 = 53;
               var11 = 32;
            } else if (var1 >= 215 && var1 < 225) {
               var10 = 50;
               var11 = 38;
            } else if (var1 >= 225 && var1 < 235) {
               var10 = 46;
               var11 = 43;
            } else if (var1 >= 235 && var1 < 245) {
               var10 = 41;
               var11 = 46;
            } else if (var1 >= 245 && var1 < 255) {
               var10 = 37;
               var11 = 49;
            } else if (var1 >= 255 && var1 < 265) {
               var10 = 30;
               var11 = 52;
            } else if (var1 >= 265 && var1 < 270) {
               var10 = 25;
               var11 = 52;
            } else if (var1 >= 345 && var1 < 355) {
               var10 = -59;
               var11 = 10;
            } else if (var1 >= 335 && var1 < 345) {
               var10 = -57;
               var11 = 22;
            } else if (var1 >= 325 && var1 < 335) {
               var10 = -53;
               var11 = 32;
            } else if (var1 >= 315 && var1 < 325) {
               var10 = -50;
               var11 = 38;
            } else if (var1 >= 305 && var1 < 315) {
               var10 = -46;
               var11 = 43;
            } else if (var1 >= 295 && var1 < 305) {
               var10 = -41;
               var11 = 46;
            } else if (var1 >= 285 && var1 < 295) {
               var10 = -37;
               var11 = 49;
            } else if (var1 >= 275 && var1 < 285) {
               var10 = -30;
               var11 = 52;
            } else if (var1 > 270 && var1 < 275) {
               var10 = -25;
               var11 = 52;
            } else if (var1 >= 5 && var1 < 15) {
               var10 = -57;
               var11 = -7;
            } else if (var1 >= 15 && var1 < 25) {
               var10 = -54;
               var11 = -16;
            } else if (var1 >= 25 && var1 < 35) {
               var10 = -50;
               var11 = -25;
            } else if (var1 >= 35 && var1 < 45) {
               var10 = -48;
               var11 = -28;
            } else if (var1 >= 45 && var1 < 55) {
               var10 = -46;
               var11 = -34;
            } else if (var1 >= 55 && var1 < 65) {
               var10 = -41;
               var11 = -38;
            } else if (var1 >= 65 && var1 < 75) {
               var10 = -38;
               var11 = -40;
            } else if (var1 >= 75 && var1 < 85) {
               var10 = -36;
               var11 = -42;
            } else if (var1 >= 85 && var1 < 90) {
               var10 = -30;
               var11 = -44;
            } else if (var1 >= 165 && var1 < 175) {
               var10 = 57;
               var11 = -7;
            } else if (var1 >= 155 && var1 < 165) {
               var10 = 54;
               var11 = -16;
            } else if (var1 >= 145 && var1 < 155) {
               var10 = 50;
               var11 = -25;
            } else if (var1 >= 135 && var1 < 145) {
               var10 = 48;
               var11 = -28;
            } else if (var1 >= 125 && var1 < 135) {
               var10 = 46;
               var11 = -34;
            } else if (var1 >= 115 && var1 < 125) {
               var10 = 41;
               var11 = -38;
            } else if (var1 >= 105 && var1 < 115) {
               var10 = 38;
               var11 = -40;
            } else if (var1 >= 95 && var1 < 105) {
               var10 = 36;
               var11 = -42;
            } else if (var1 > 90 && var1 < 95) {
               var10 = 30;
               var11 = -44;
            } else if (var1 == 90) {
               if (var3 < 90) {
                  var10 = -30;
                  var11 = -44;
                  --var1;
               } else {
                  var10 = 30;
                  var11 = -44;
                  ++var1;
               }
            } else if (var1 == 270) {
               if (var3 < 270) {
                  var10 = -25;
                  var11 = 52;
                  --var1;
               } else {
                  var10 = 25;
                  var11 = 52;
                  ++var1;
               }
            }
         } else {
            var10 = -58;
            var11 = 5;
         }

         var4 = (var9 = new int[]{var10, var11, var1})[0];
         var5 = var9[1];
         this.n = var9[2];
      }

      if (var2 == 0) {
         var5 = 0;
      }

      return new int[]{var4, var5};
   }

   public final void a(Graphics var1) {
      if (!VDTT_jb.e() && !VDTT_eq.a().a(11) && !this.s()) {
         if (this.I >= 2 || this.m != 6 && this.m != 7) {
            int var2 = 0;
            int var3 = 0;
            boolean var4 = true;
            int[] var5 = null;
            if (this.k != 63 && this.k != 65 && this.k != 66) {
               if (this.k == 95) {
                  var1.c(22.0F);
               }
            } else {
               var1.c(179.0F);
            }

            int var7;
            boolean var14;
            if (this.m().m != null && this.m().m.length > 0) {
               ++this.W;
               int var6 = 0;
               var7 = this.m().b + this.m().d;
               short var8 = this.objX;
               short var9 = this.objY;

               for(int var10 = this.ah.size() - 1; var10 >= 0; --var10) {
                  if (var7 > 0) {
                     var7 -= this.p;
                  } else {
                     if (var6 >= this.m().m.length) {
                        break;
                     }

                     VDTT_fb var11 = (VDTT_fb)this.ah.get(var10);
                     int var12 = var8 - var11.objX;
                     int var13 = var9 - var11.objY;
                     var8 = var11.objX;
                     var9 = var11.objY;
                     var12 = b(var12, var13);
                     if (this.m().k) {
                        var12 = this.X;
                     }

                     var14 = true;
                     var1.j = var14;
                     short var23 = this.m().m[var6][0];

                     try {
                        var23 = this.m().m[var6][this.V];
                     } catch (Exception var15) {
                     }

                     if (this.p() || this.m().a == 17) {
                        var4 = false;
                        int[] var16;
                        var2 = (var16 = this.a(this.Y.objX, this.Y.objY, this.o))[0];
                        if ((var3 = var16[1]) != 0) {
                           this.n = this.o;
                        }

                        if (this.m().a == 24) {
                           if (this.W < this.m().m[var6].length) {
                              VDTT_dc.b(var1, this.m().m[var6][this.W], 0, this.L.objX + var2, this.L.objY + var3, 3);
                           }
                        } else {
                           var6 = VDTT_jb.a(this.L.objX + var2, this.L.objY + var3, ((VDTT_fb)this.ah.get(this.I)).objX, ((VDTT_fb)this.ah.get(this.I)).objY);
                           if (this.k == 81 && var6 < 70) {
                              var6 = 70;
                           }

                           if (var6 > 0) {
                              var5 = VDTT_aa.b(var1, var23, this.n, this.L.objX + var2, this.L.objY + var3, var6);
                           }
                        }
                        break;
                     }

                     VDTT_dc.b(var1, var23, c(var12), var11.objX, var11.objY, 3);
                     var14 = false;
                     var1.j = var14;
                     ++var6;
                     if (var7 <= 0) {
                        var7 = this.m().b;
                     }
                  }
               }
            }

            Vector var17;
            if (this.m().a == 21) {
               var17 = this.N.aa();
               short var18 = this.N.K;
               if (this.Y != null) {
                  var1.d(50);
                  this.N.a(var1, this.objX, this.objY, var17, var18, var18, this.N.aF == 3);
                  var1.l = 1.0F;
               } else {
                  this.N.a(var1, this.M.objX, this.M.objY, var17, var18, var18, this.N.aF == 3);
               }
            } else if (this.m().a != 19 && this.m().a != 20) {
               if (this.m().l != null && this.m().l.length > 0 && this.m().l[0] != null && this.m().l[0].length > 0 && this.V >= 0 && this.V < this.m().l[0].length) {
                  short var19 = this.m().l[0][this.V];
                  var7 = this.objX - this.ab;
                  int var20 = this.objY - this.ac;
                  var14 = true;
                  var1.j = var14;
                  int var21 = b(var7, var20) + this.m().e;
                  if (this.m().a == 11 && this.ak != null) {
                     var7 = this.l.objX - this.objX;
                     var20 = this.l.objY - this.objY;
                     var21 = b(var7, var20) + this.m().e;
                  }

                  if (this.m().j) {
                     var21 = this.X;
                  }

                  short[] var22 = null;
                  if (!this.p() && this.m().a != 17) {
                     var22 = VDTT_dc.b(var1, var19, c(var21), this.objX, this.objY, 3);
                  } else if (!var4) {
                     if (this.O.objX < this.L.objX + var2) {
                        this.O.d = 2;
                     } else {
                        this.O.d = 3;
                     }

                     this.O.aF = this.O.d;
                     if (this.m().a == 24) {
                        VDTT_aa.b(var1, var19, this.n, this.L.objX + var2, this.L.objY + var3, VDTT_jb.a(this.L.objX, this.L.objY, this.objX, this.objY));
                     } else {
                        if (var5 != null) {
                           VDTT_dc.b(var1, var19, this.n + 180, var5[0], var5[1], 3);
                        }

                        var19 = this.m().l[1][this.V];
                        var22 = VDTT_dc.b(var1, var19, this.n, this.L.objX + var2, this.L.objY + var3, 3);
                     }
                  }

                  var14 = false;
                  var1.j = var14;
                  if (var22 != null) {
                     this.d(var22[0], var22[1]);
                  }
               }
            } else {
               var17 = this.N.aa();
               if (this.objX == this.M.objX && this.objY == this.M.objY) {
                  var7 = DataCenter.d().h / 4 % 2 + 150;
                  this.N.a(var1, this.objX, this.objY, var17, var7, var7, this.N.aF == 3, true);
               } else {
                  var7 = DataCenter.d().h / 4 % 2 + 152;
                  this.N.a(var1, this.objX, this.objY, var17, var7, var7, this.objX - this.ab < 0, true);
               }
            }

            if (this.k == 63 || this.k == 65 || this.k == 66 || this.k == 95) {
               var1.r();
            }

         }
      }
   }

   private void v() {
      int var1 = this.p + this.al;
      this.ak = null;
      if (this.ai.size() > 0) {
         this.ak = (VDTT_fb)this.ai.remove(0);
         if (this.m == 25) {
            this.objX = this.O.objX;
            this.objY = (short)(this.O.objY - 80);
         } else {
            this.objX = this.ak.objX;
            this.objY = this.ak.objY;
         }
      } else {
         if (this.m == 25 && this.O.aV != null) {
            this.O.aV.i = true;
         }

         VDTT_n var2 = this.l;
         if (this.Y != null) {
            var2 = this.Y;
         }

         if (var2 != null) {
            int var3;
            int var4;
            int var5;
            int var6;
            if (this.m != -1 && this.m != -2) {
               var3 = VDTT_jb.b(var2.k() + this.am - this.objX);
               var4 = VDTT_jb.b(var2.l() - this.objY);
               var5 = var1;
               var6 = var1;
               if (var4 > var3) {
                  if (var4 / var1 == 0) {
                     var5 = var4;
                  } else {
                     var5 = var3 / (var4 / var1);
                  }
               } else if (var3 / var1 == 0) {
                  var6 = var3;
               } else {
                  var6 = var4 / (var3 / var1);
               }

               if (var5 <= 0) {
                  var5 = 1;
               }

               if (var6 <= 0) {
                  var6 = 1;
               }

               if (this.objX > var2.k() + this.am) {
                  this.objX = (short)(this.objX - var5);
               } else if (this.objX < var2.k() + this.am) {
                  this.objX = (short)(this.objX + var5);
               }

               if (this.objY > var2.l()) {
                  this.objY = (short)(this.objY - var6);
               } else if (this.objY < var2.l()) {
                  this.objY = (short)(this.objY + var6);
               }
            } else {
               var3 = var2.k() + this.am - this.objX;
               var4 = var2.l() - this.objY;
               this.aa = this.b(var3, var4, this.aa);
               var5 = var1 * this.a(T, this.aa, -1) >> 10;
               var6 = var1 * this.a(S, this.aa, 1) >> 10;
               this.objX = (short)(this.objX + var5);
               this.objY = (short)(this.objY + var6);
            }
         }

         XYEntity var9 = XYEntity.e(this.ab, this.ac);
         XYEntity var10 = XYEntity.e(this.objX, this.objY);
         XYEntity var11 = XYEntity.e(var2.k() + this.am - 5, var2.l() - 5);
         XYEntity var12 = XYEntity.e(var2.k() + this.am + 5, var2.l() + 5);
         if (VDTT_jb.a(var9, var10, var11, var12) != null) {
            this.objX = (short)(var2.objX + this.am);
            this.objY = var2.objY;
            if (this.m == 2 && this.Y == null) {
               this.objY = (short)(var2.objY - this.m().i);
            }
         }

         if (this.p()) {
            var1 = this.L.objX - var2.k();
            int var8 = this.L.objY - var2.l();
            this.n = b(var1, var8);
            if (this.I <= 1) {
               var1 = b(var1, var8);
               int[] var7 = this.a(this.objX, this.objY, var1);
               this.objX = (short)(this.L.objX + var7[0]);
               this.objY = (short)(this.L.objY + var7[1]);
            }
         }

         this.ah.add(new VDTT_fb(this.objX, this.objY, true));
      }
   }

   public static int b(int var0, int var1) {
      if (var0 == 0 && var1 == 0) {
         return 0;
      } else {
         int var2;
         if (var0 != 0) {
            var2 = a(Math.abs((var1 << 10) / var0));
            if (var1 >= 0 && var0 < 0) {
               var2 = 180 - var2;
            }

            if (var1 < 0 && var0 < 0) {
               var2 += 180;
            }

            if (var1 < 0 && var0 >= 0) {
               var2 = 360 - var2;
            }
         } else {
            var2 = var1 > 0 ? 90 : 270;
         }

         return var2;
      }
   }

   private static int a(int var0) {
      for(int var1 = 0; var1 <= 90; ++var1) {
         if (U[var1] >= var0) {
            return var1;
         }
      }

      return 0;
   }

   private static int b(int var0) {
      if (var0 >= 360) {
         var0 -= 360;
      }

      if (var0 < 0) {
         var0 += 360;
      }

      return var0;
   }

   private int a(int[] var1, int var2, int var3) {
      if ((var2 = b(var2)) >= 0 && var2 < 90) {
         return var1[var2];
      } else if (var2 >= 90 && var2 < 180) {
         return var3 * var1[180 - var2];
      } else {
         return var2 >= 180 && var2 < 270 ? -var1[var2 - 180] : var3 * -var1[360 - var2];
      }
   }

   private int b(int var1, int var2, int var3) {
      int var4;
      if (var1 != 0) {
         var4 = a(Math.abs((var2 << 10) / var1));
         if (var2 >= 0 && var1 < 0) {
            var4 = 180 - var4;
         }

         if (var2 < 0 && var1 < 0) {
            var4 += 180;
         }

         if (var2 < 0 && var1 >= 0) {
            var4 = 360 - var4;
         }
      } else {
         var4 = var2 > 0 ? 90 : 270;
      }

      if (Math.abs(var4 - var3) >= 90 && var1 * var1 + var2 * var2 <= 4096) {
         return var4;
      } else if (Math.abs(var4 - var3) < 15) {
         return var4;
      } else {
         return (var4 - var3 < 0 || var4 - var3 >= 180) && var4 - var3 >= -180 ? b(var3 - 15) : b(var3 + 15);
      }
   }

   public final String f() {
      return null;
   }

   public final String g() {
      return null;
   }

   public final void b(Graphics var1) {
   }

   public final int e() {
      return this.k == 78 ? 7 : 1;
   }

   private static int c(int var0) {
      if (var0 >= 91 && var0 < 180) {
         var0 = -(180 - var0);
      } else if (var0 >= 180 && var0 < 270) {
         var0 = -(540 - var0);
      }

      return var0;
   }

   public final boolean p() {
      return this.m().a == 14 || this.m().a == 18 || this.m().a == 24 || this.m().a == 26;
   }

   private void w() {
      if (this.l instanceof VDTT_gk) {
         ((VDTT_gk)this.l).aB = 20;
      }

   }

   public final void q() {
      try {
         int var1;
         int var2;
         if (this.m().l != null) {
            for(var1 = 0; var1 < this.m().l.length; ++var1) {
               for(var2 = 0; var2 < this.m().l[var1].length; ++var2) {
                  if (this.m().l[var1][var2] > 0) {
                     VDTT_dc.d(this.m().l[var1][var2]);
                  }
               }
            }
         }

         if (this.m().m != null) {
            for(var1 = 0; var1 < this.m().m.length; ++var1) {
               for(var2 = 0; var2 < this.m().m[var1].length; ++var2) {
                  if (this.m().m[var1][var2] > 0) {
                     VDTT_dc.d(this.m().m[var1][var2]);
                  }
               }
            }
         }

      } catch (Exception var3) {
      }
   }
}
