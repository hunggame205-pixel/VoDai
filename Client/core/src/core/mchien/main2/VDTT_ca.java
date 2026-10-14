package core.mchien.main2;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.util.Vector;

public class VDTT_ca extends VDTT_m {
   public int l = 999;
   public int m;
   private String X = "";
   protected String n = "";
   protected int I = 0;
   public int J;
   public int K;
   protected int L = Integer.MIN_VALUE;
   private int Y = 11;
   protected String M = "";
   protected String N = "";
   public VDTT_hs O;
   protected int P;
   protected boolean Q = true;
   protected boolean R = false;
   private int Z = 50;
   public int S = Integer.MIN_VALUE;
   public int T = Integer.MAX_VALUE;
   private int aa;
   public boolean U;
   public boolean V;
   public boolean W;
   private String ab = "";

   public VDTT_ca(int var1, int var2, int var3, String var4, MainScreen var5, int var6, int var7) {
      this.M = var4;
      this.a = var5;
      this.P = var6;
      this.m = var7;
      this.f(var1, var2);
      this.d(var3, 22);
      if (var7 == 1) {
         this.aa = 22;
         this.R = true;
      }

      this.O = new VDTT_hw((byte)0, 5, 2, this.q - 10 - this.aa, this.r - 4, this.q, 0);
   }

   public final void b(String var1) {
      this.M = var1;
   }

   public int d() {
      return 0;
   }

   protected void f() {
      int var1;
      if ((var1 = VDTT_dg.b(VDTT_dg.d, this.n)) < this.O.q) {
         var1 = this.O.q;
      }

      this.O.a(5, var1, 0);
      var1 = 0;
      if (this.N.length() > 0) {
         var1 = VDTT_dg.b(VDTT_dg.d, this.N.substring(0, this.J));
      }

      VDTT_hs var10002 = this.O;
      var10002.j = var1 - var10002.q / 2;
   }

   private boolean k() {
      return this.m == 1 && this.R;
   }

   private void l() {
      this.m();
      if (this.k()) {
         this.n = this.X;
      } else {
         this.n = this.N;
      }

      if (this.I < 0 && VDTT_dg.b(VDTT_dg.d, this.n) + this.I < this.q - this.aa - 4 - 13) {
         this.I = this.q - this.aa - 10 - VDTT_dg.b(VDTT_dg.d, this.n);
      }

      if (this.I + VDTT_dg.b(VDTT_dg.d, this.n.substring(0, this.J)) <= 0) {
         this.I = -VDTT_dg.b(VDTT_dg.d, this.n.substring(0, this.J));
         this.I += 40;
      } else if (this.I + VDTT_dg.b(VDTT_dg.d, this.n.substring(0, this.J)) >= this.q - this.aa - 12) {
         this.I = this.q - this.aa - 10 - VDTT_dg.b(VDTT_dg.d, this.n.substring(0, this.J)) - 8;
      }

      if (this.I > 0) {
         this.I = 0;
      }

   }

   private void m() {
      if (this.J >= this.N.length()) {
         this.J = this.N.length();
      }

      if (this.J <= 0) {
         this.J = 0;
      }

   }

   protected void c(boolean var1) {
      if (var1) {
         if (this.J > 0 && this.N.length() > 0) {
            this.e(this.N.substring(0, this.J - 1) + this.N.substring(this.J, this.N.length()));
            --this.J;
            return;
         }
      } else if (this.J < this.N.length() && this.N.length() > 0) {
         this.e(this.N.substring(0, this.J) + this.N.substring(this.J + 1, this.N.length()));
      }

   }

   private void n() {
      if (this.k()) {
         this.X = "";

         for(int var1 = 0; var1 < this.N.length(); ++var1) {
            this.X = this.X + "*";
         }
      }

   }

   public final void a(int var1) {
      this.a("" + var1);
   }

   public final int h() {
      try {
         return Integer.parseInt(this.N);
      } catch (Exception var1) {
         return 0;
      }
   }

   public final String i() {
      return this.N;
   }

   public final void d(String var1) {
      this.a(this.N + var1);
   }

   public void a(String var1, int var2, int var3) {
      if ((var1 = this.N.substring(0, var2) + var1 + this.N.substring(this.J, this.N.length())).length() > this.l) {
         var1 = var1.substring(0, this.l);
      }

      this.N = this.n = var1;
      this.J = var3;
      this.L = Integer.MIN_VALUE;
      this.n();
      this.l();
      this.f();
   }

   public void a(String var1) {
      if (var1 != null) {
         var1 = this.f(var1);
         this.J = var1.length();
         this.N = this.n = var1;
         this.L = Integer.MIN_VALUE;
         this.n();
         this.l();
         this.f();
      }
   }

   private void e(String var1) {
      var1 = this.f(var1);
      this.N = var1;
   }

   private String f(String var1) {
      if (var1 != null && var1.length() > this.l) {
         var1 = var1.substring(0, this.l);
      }

      if (this.m == 2) {
         try {
            int var3;
            if ((var3 = Integer.parseInt(var1)) < this.S) {
               var3 = this.S;
            }

            if (var3 > this.T) {
               var3 = this.T;
            }

            var1 = "" + var3;
         } catch (Exception var2) {
            var1 = "";
         }
      }

      return var1;
   }

   public void b(Graphics var1) {
      if (!this.d) {
         if (this.Q) {
            this.a(var1, 0, 1, this.q, 20, 46, 22, 23, 1, 1);
         } else {
            VDTT_aa.a(var1, 46, 0, 0, 1, this.q, (int)(this.r - 1));
         }

         if (this.b) {
            VDTT_dc.a(var1, 1, 2, this.q - 2, 18);
         }

         if (this.k()) {
            this.n = this.X;
         } else {
            this.n = this.N;
         }

         if (this.m == 1) {
            if (this.e(0)) {
               var1.e(30);
            }

            VDTT_dc.a(var1, this.Z, 0, this.q - this.aa + this.aa / 2, this.r / 2, 3);
            var1.h();
         }

         this.a(var1, this.O);
         if (this.n.equals("") && !this.b) {
            if (this.U) {
               VDTT_dg.d(VDTT_dg.d, var1, this.M, 1, this.r / 2 - 3, 0, -6255769, 0);
            } else {
               VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, this.M, 1, this.r / 2 - 3, 0, -6255769, 0);
            }
         } else {
            if (this.m == 1 && this.R) {
               if (this.U) {
                  VDTT_dg.d(VDTT_dg.d, var1, this.n, 1, this.r / 2, 0, -1, -16777216);
               } else {
                  VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, this.n, 1, this.r / 2, 0, -1, -16777216);
               }
            } else if (this.U) {
               VDTT_dg.d(VDTT_dg.d, var1, this.n, 1, this.r / 2 - 3, 0, -1, -16777216);
            } else {
               VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, this.n, 1, this.r / 2 - 3, 0, -1, -16777216);
            }

            if (this.b && DataCenter.d().h % 20 > 15) {
               var1.f(11382189);
               int var2 = 0;

               try {
                  if (this.n.length() > 0) {
                     var2 = VDTT_dg.a(VDTT_dg.d, this.n.substring(0, this.J));
                  }

                  if (var2 < 0) {
                     var2 = 0;
                  }
               } catch (Exception var3) {
               }

               var1.c(var2 + 1, (this.r - 16) / 2 - 2, 1, 16);
            }
         }

         this.a(var1);
      }
   }

   public void a_() {
      try {
         this.m();
         this.O.a();
         if (!this.ab.equals(this.N)) {
            this.ab = this.N;
            this.j();
         }

      } catch (Exception var2) {
         VDTT_jb.a(var2);
      }
   }

   public void c() {
      byte var1 = 0;
      boolean var7 = false;

      label332: {
         label333: {
            label310: {
               label334: {
                  try {
                     var7 = true;
                     int var2;
                     String var11;
                     if ((var2 = this.o.c()) != Integer.MIN_VALUE) {
                        var1 = 2;
                        char var12 = (char)var2;
                        if (var2 == 22) {
                           try {
                             Clipboard var15 = Toolkit.getDefaultToolkit().getSystemClipboard();
DataFlavor var13 = DataFlavor.stringFlavor;
                              if (var15.isDataFlavorAvailable(var13)) {
                                 var11 = (String)var15.getData(var13);
                                 String var14 = this.N.substring(0, this.J) + var11;
                                 if (this.J < this.N.length()) {
                                    var14 = var14 + this.N.substring(this.J, this.N.length());
                                 }

                                 this.e(var14);
                                 this.J += var11.length();
                                 var7 = false;
                              } else {
                                 var7 = false;
                              }
                           } catch (Exception var8) {
                              var7 = false;
                           }
                           break label334;
                        }

                        if (this.W) {
                           this.e(String.valueOf(var12));
                           var7 = false;
                           break label334;
                        }

                        if (var12 == 127) {
                           this.c(false);
                           var7 = false;
                           break label334;
                        }

                        if (var12 == '\b') {
                           this.c(true);
                           var7 = false;
                           break label334;
                        }

                        if (this.N.length() >= 0) {
                           if (this.N.length() < this.l) {
                              if (this.m == 2) {
                                 if (var12 < '0') {
                                    var7 = false;
                                    break label334;
                                 }

                                 if (var12 > '9') {
                                    var7 = false;
                                    break label334;
                                 }
                              }

                              var11 = this.N.substring(0, this.J) + var12;
                              if (this.J < this.N.length()) {
                                 var11 = var11 + this.N.substring(this.J, this.N.length());
                              }

                              this.e(var11);
                              ++this.J;
                              var7 = false;
                              break label334;
                           }

                           var7 = false;
                           break label334;
                        }

                        var7 = false;
                        break label334;
                     }

                     int var3;
                     if ((var3 = this.o.d) != Integer.MIN_VALUE) {
                        var1 = 1;
                        if (var3 == 10) {
                           this.a.a(this.P, (Object)null, this);
                           this.o.b();
                        } else if (var3 == 127) {
                           this.c(false);
                           var1 = 2;
                        } else {
                           if (var3 == 3) {
                              this.J = 0;
                              var7 = false;
                              break label332;
                           }

                           if (var3 == 132) {
                              this.J = this.N.length();
                              var7 = false;
                              break label333;
                           }
                        }

                        if (var3 == 8 || var3 == -8 || var3 == 204) {
                           this.c(true);
                           var1 = 2;
                        }

                        if (var3 >= 32) {
                           if (this.N.length() > 0 && this.N.length() < this.l) {
                              var11 = this.N.substring(0, this.J) + (char)var3;
                              if (this.J < this.N.length()) {
                                 var11 = var11 + this.N.substring(this.J, this.N.length());
                              }

                              this.e(var11);
                              ++this.J;
                           }

                           var1 = 2;
                        }

                        this.L = Integer.MIN_VALUE;
                        if (this.o.b[4]) {
                           --this.J;
                           var7 = false;
                        } else if (this.o.b[6]) {
                           ++this.J;
                           var7 = false;
                        } else if (var3 == 19) {
                           this.c(true);
                           var1 = 2;
                           var7 = false;
                        } else {
                           this.L = var3;
                           var7 = false;
                        }
                     } else {
                        var7 = false;
                     }
                  } catch (Exception var9) {
                     var7 = false;
                     break label310;
                  } finally {
                     if (var7) {
                        if (var1 == 2) {
                           this.n();
                           this.l();
                           this.f();
                           this.o.b();
                        } else if (var1 == 1) {
                           this.n();
                           this.l();
                           this.f();
                        }

                     }
                  }

                  if (var1 == 2) {
                     this.n();
                     this.l();
                     this.f();
                     this.o.b();
                     return;
                  }

                  if (var1 == 1) {
                     this.n();
                     this.l();
                     this.f();
                     return;
                  }

                  return;
               }

               this.n();
               this.l();
               this.f();
               this.o.b();
               return;
            }

            if (var1 == 2) {
               this.n();
               this.l();
               this.f();
               this.o.b();
               return;
            }

            if (var1 == 1) {
               this.n();
               this.l();
               this.f();
               return;
            }

            return;
         }

         this.n();
         this.l();
         this.f();
         return;
      }

      this.n();
      this.l();
      this.f();
   }

   public final Vector g() {
      if (this.c) {
         return null;
      } else {
         Vector var1 = new Vector();
         if (this.m == 1) {
            var1.addElement(new VDTT_hl(-1000, this.q - this.aa, 0, this.q, this.r, (VDTT_hs)null, this));
         }

         var1.addElement(new VDTT_hl(-1001, 0, 0, this.q, this.r, this.O, this));
         return var1;
      }
   }

   public void a(VDTT_hl var1, int var2, int var3) {
      if (!this.c && !this.d) {
         var3 = this.O.j + (var2 - this.O.objX);

         try {
            switch(var1.b) {
            case -1001:
               if (this.a instanceof VDTT_kd && ((VDTT_kd)this.a).Q.j() == 5 && VDTT_bc.K.length() > 0 && !this.N.startsWith("/" + VDTT_bc.K + ": ")) {
                  this.a("/" + VDTT_bc.K + ": ");
               }

               if (var3 <= 1) {
                  this.J = 0;
               } else {
                  var2 = 0;

                  for(int var4 = 0; var4 < this.N.length(); ++var4) {
                     int var6 = var2;
                     var2 = VDTT_dg.b(VDTT_dg.d, this.N.substring(0, var4)) + VDTT_dg.b(VDTT_dg.d, "" + this.N.charAt(var4)) / 2;
                     if (var6 <= var3 && var3 <= var2) {
                        this.J = var4;
                        break;
                     }

                     if (var4 == this.N.length() - 1) {
                        this.J = this.N.length();
                     }
                  }
               }

               this.f();
               VDTT_aa.a(this, this.N, this.M, this.l, this.m, false);
               break;
            case -1000:
               if (!this.N.equals("")) {
                  this.R = !this.R;
                  this.n();
                  this.l();
                  this.f();
                  VDTT_ac.b().n();
                  return;
               }
            }

         } catch (Exception var5) {
            VDTT_jb.a(var5);
         }
      }
   }

   public void j() {
   }
}
