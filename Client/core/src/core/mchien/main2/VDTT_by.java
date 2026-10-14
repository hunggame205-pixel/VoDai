package core.mchien.main2;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;

public final class VDTT_by extends VDTT_ca {
   private int X;
   private int Y;
   private String[] Z;

   public VDTT_by(int var1, int var2, int var3, String var4, MainScreen var5, int var6, int var7) {
      super(var1, var2, var3, var4, var5, -11, 0);
      this.M = var4;
      this.a = var5;
      this.P = -11;
      this.X = var7;
      this.Y = var7 == 1 ? 18 : 14;
      this.f(var1, var2);
      this.d(var3, var7 * this.Y + 4);
      this.O = new VDTT_hs((byte)1, 0, 2, this.q, this.Y * var7, this.Y, var7);
      this.Z = VDTT_dg.b(VDTT_dg.d, var4, this.q - 10);
      this.a("");
   }

   public final int d() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.K; ++var2) {
         var1 += this.Z[var2].length() + 1;
      }

      return var1;
   }

   public final void a(String var1) {
      if (var1.equals("")) {
         this.J = 0;
         this.N = "";
         this.Z = VDTT_dg.b(VDTT_dg.d, this.M, this.q - 10);
         this.O.j = 0;
         this.O.e();
      } else {
         this.N = var1;
         if (!var1.equals("")) {
            this.Z = VDTT_dg.b(VDTT_dg.d, var1, this.q - 10);
            this.O.j = this.K;
            this.f();
            this.O.e();
         } else {
            this.Z = VDTT_dg.b(VDTT_dg.d, this.M, this.q - 10);
            this.O.j = 0;
            this.O.e();
         }
      }
   }

   public final void a(String var1, int var2, int var3) {
      if (var1.equals("")) {
         this.J = 0;
         this.N = "";
         this.Z = VDTT_dg.b(VDTT_dg.d, this.M, this.q - 10);
         this.O.j = 0;
         this.O.e();
      } else {
         var1 = this.N.substring(0, this.d() + var2) + var1 + this.N.substring(this.d() + this.J, this.N.length());
         this.N = var1;
         if (!this.N.equals("")) {
            this.Z = VDTT_dg.b(VDTT_dg.d, this.N, this.q - 10);
            this.J = var3;
            if (this.J > this.Z[this.K].length()) {
               this.J = this.J - this.Z[this.K].length() - 1;
               ++this.K;
            }

            this.O.j = this.K;
            this.f();
            this.O.e();
         } else {
            this.Z = VDTT_dg.b(VDTT_dg.d, this.M, this.q - 10);
            this.O.j = 0;
            this.O.e();
         }
      }
   }

   public final void c() {
      byte var1 = 0;
      boolean var6 = false;

      label281: {
         label294: {
            label295: {
               label277: {
                  try {
                     var6 = true;
                     int var2;
                     if ((var2 = this.o.c()) == Integer.MIN_VALUE) {
                        int var11;
                        if ((var11 = this.o.d) != Integer.MIN_VALUE) {
                           var1 = 1;
                           if (var11 == 10) {
                              this.a.a(this.P, (Object)null, this);
                              this.o.b();
                           } else if (var11 == 127) {
                              this.c(false);
                              var1 = 2;
                           } else {
                              if (var11 == 3) {
                                 this.K = 0;
                                 this.J = 0;
                                 var6 = false;
                                 break label281;
                              }

                              if (var11 == 132) {
                                 this.K = this.Z.length - 1;
                                 this.J = this.Z[this.K].length();
                                 var6 = false;
                                 break label294;
                              }
                           }

                           if (var11 == 8 || var11 == -8 || var11 == 204) {
                              this.c(true);
                              var1 = 2;
                           }

                           if (var11 >= 32) {
                              if (this.N.length() > 0 && this.N.length() < this.l) {
                                 this.e(String.valueOf((char)var11));
                              }

                              var1 = 2;
                           }

                           this.L = Integer.MIN_VALUE;
                           if (this.o.b[4]) {
                              if (this.J > 0) {
                                 --this.J;
                                 var6 = false;
                              } else if (this.K > 0) {
                                 --this.K;
                                 this.J = this.Z[this.K].length();
                                 var6 = false;
                              } else {
                                 var6 = false;
                              }
                           } else if (this.o.b[6]) {
                              if (this.J < this.Z[this.K].length()) {
                                 ++this.J;
                                 var6 = false;
                              } else if (this.K < this.Z.length - 1) {
                                 ++this.K;
                                 this.J = 0;
                                 var6 = false;
                              } else {
                                 var6 = false;
                              }
                           } else if (this.o.b[2]) {
                              --this.K;
                              var6 = false;
                           } else if (this.o.b[8]) {
                              ++this.K;
                              var6 = false;
                           } else if (var11 == 19) {
                              this.c(true);
                              var1 = 2;
                              var6 = false;
                           } else {
                              this.L = var11;
                              var6 = false;
                           }
                        } else {
                           var6 = false;
                        }
                        break label295;
                     }

                     var1 = 2;
                     char var3 = (char)var2;
                     if (var2 == 22) {
                        Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard();
                        DataFlavor var10 = DataFlavor.stringFlavor;
                        if (var9.isDataFlavorAvailable(var10)) {
                           this.e((String)var9.getData(var10));
                           this.K = this.Z.length - 1;
                           this.J = this.Z[this.K].length();
                          var6 = false;
                        } else {
                           var6 = false;
                        }
                     } else if (var3 == 127) {
                        this.c(false);
                        var6 = false;
                     } else if (var3 == '\b') {
                        this.c(true);
                        var6 = false;
                     } else if (this.N.length() >= 0) {
                        if (this.N.length() < this.l) {
                           this.e(String.valueOf(var3));
                           var6 = false;
                        } else {
                           var6 = false;
                        }
                     } else {
                        var6 = false;
                     }
                  } catch (Exception var7) {
                     var6 = false;
                     break label277;
                  } finally {
                     if (var6) {
                        if (var1 == 2) {
                           this.a(this.N);
                           this.k();
                           this.o.b();
                        } else if (var1 == 1) {
                           this.a(this.N);
                           this.k();
                        }

                     }
                  }

                  this.a(this.N);
                  this.k();
                  this.o.b();
                  return;
               }

               if (var1 == 2) {
                  this.a(this.N);
                  this.k();
                  this.o.b();
                  return;
               }

               if (var1 == 1) {
                  this.a(this.N);
                  this.k();
                  return;
               }

               return;
            }

            if (var1 == 2) {
               this.a(this.N);
               this.k();
               this.o.b();
               return;
            }

            if (var1 == 1) {
               this.a(this.N);
               this.k();
               return;
            }

            return;
         }

         this.a(this.N);
         this.k();
         return;
      }

      this.a(this.N);
      this.k();
   }

   private void k() {
      if (this.K <= 0 || this.Z == null) {
         this.K = 0;
      }

      if (this.K >= this.Z.length) {
         this.K = this.Z.length - 1;
      }

      if (this.J <= 0) {
         this.J = 0;
      }

      if (this.J >= this.Z[this.K].length()) {
         this.J = this.Z[this.K].length();
      }

   }

   private void e(String var1) {
      int var2 = 0;
      String var3 = "";
      String[] var4 = new String[]{""};
      if (this.N.length() > 0) {
         var4 = this.Z;
      }

      for(int var5 = 0; var5 < var4.length; ++var5) {
         String var6 = var4[var5];
         if (var5 < var4.length - 1 && !var6.endsWith(" ")) {
            var6 = var6 + " ";
         }

         if (this.K == var5) {
            var6 = var6.substring(0, this.J) + var1 + var6.substring(this.J, var6.length());
            var2 += this.J + var1.length();
         } else if (var5 < this.K) {
            var2 += var6.length();
         }

         var3 = var3 + var6;
      }

      this.a(var3, var2);
   }

   private String f(String var1) {
      if (var1 != null && var1.length() > this.l) {
         var1 = var1.substring(0, this.l);
      }

      if (this.m == 2) {
         try {
            var1 = "" + Integer.parseInt(var1);
         } catch (Exception var2) {
            var1 = "";
         }
      }

      return var1;
   }

   protected final void f() {
      this.O.a(this.O.g, this.Y, this.Z.length);
   }

   private void a(String var1, int var2) {
      var1 = this.f(var1);
      this.a(var1);

      for(int var4 = 0; var4 < this.Z.length; ++var4) {
         String var3 = this.Z[var4];
         if (var4 < this.Z.length - 1 && !var3.endsWith(" ")) {
            var3 = var3 + " ";
         }

         if (var2 < var3.length()) {
            this.K = var4;
            this.J = var2;
            return;
         }

         var2 -= var3.length();
         this.K = var4;
         this.J = var3.length();
      }

   }

   protected final void c(boolean var1) {
      try {
         if (this.N.equals("")) {
            return;
         }

         String var2;
         String[] var3;
         int var4;
         String var5;
         int var7;
         if (!var1) {
            var7 = 0;
            var2 = "";
            var3 = new String[]{""};
            if (this.N.length() > 0) {
               var3 = this.Z;
            }

            for(var4 = 0; var4 < var3.length; ++var4) {
               var5 = var3[var4];
               if (var4 < var3.length - 1 && !var5.endsWith(" ")) {
                  var5 = var5 + " ";
               }

               if (this.K == var4) {
                  var5 = var5.substring(0, this.J) + var5.substring(this.J + 1, var5.length());
                  var7 += this.J;
               } else if (var4 < this.K) {
                  var7 += var5.length();
               }

               var2 = var2 + var5;
            }

            var2 = this.f(var2);
            this.a(var2, var7);
            return;
         }

         var7 = 0;
         var2 = "";
         var3 = new String[]{""};
         if (this.N.length() > 0) {
            var3 = this.Z;
         }

         for(var4 = 0; var4 < var3.length; ++var4) {
            var5 = var3[var4];
            if (var4 < var3.length - 1 && !var5.endsWith(" ")) {
               var5 = var5 + " ";
            }

            if (this.K == var4) {
               if (this.J > 0) {
                  var5 = var5.substring(0, this.J - 1) + var5.substring(this.J, var5.length());
               }

               var7 += this.J - 1;
            } else if (var4 < this.K) {
               var7 += var5.length();
            }

            var2 = var2 + var5;
         }

         if (var7 < 0) {
            var7 = 0;
         }

         this.a(var2, var7);
      } catch (Exception var6) {
      }

   }

   public final void a_() {
      this.O.a();
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      var2 -= 5;

      try {
         switch(var1.b) {
         case -1001:
            if (this.N.equals("")) {
               VDTT_aa.a(this, this.N, this.M, this.l, this.m, false);
               return;
            } else {
               if (var1.j.k >= 0) {
                  this.K = var1.j.k;
                  var3 = 0;
                  String var4 = this.Z[this.K];

                  for(int var5 = 0; var5 < var4.length(); ++var5) {
                     int var7 = var3;
                     var3 = VDTT_dg.b(VDTT_dg.d, var4.substring(0, var5)) + VDTT_dg.b(VDTT_dg.d, "" + var4.charAt(var5)) / 2;
                     if (var7 <= var2 && var2 <= var3) {
                        this.J = var5;
                        break;
                     }

                     if (var5 == var4.length() - 1) {
                        this.J = var4.length();
                     }
                  }
               }

               VDTT_aa.a(this, this.N, this.M, this.l, this.m, false);
            }
         default:
         }
      } catch (Exception var6) {
         VDTT_jb.a(var6);
      }
   }

   public final void b(Graphics var1) {
      this.a(var1, 0, 0, this.q, this.r, 46, 22, 23, 1, 1);
      if (this.b) {
         VDTT_dc.a(var1, 1, 1, this.q - 2, this.r - 2);
      }

      this.a(var1, this.O);
      int var2;
      if (!this.N.equals("")) {
         for(var2 = 0; var2 < this.Z.length; ++var2) {
            if (this.O.b(var2)) {
               VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, this.Z[var2], 6, this.Y / 2 + var2 * this.Y - 1, 0, -1, -16777216);
            }
         }
      } else if (!this.b) {
         for(var2 = 0; var2 < this.Z.length; ++var2) {
            if (this.O.b(var2)) {
               VDTT_dg.a((VDTT_dg)VDTT_dg.d, var1, this.Z[var2], 6, this.Y / 2 + var2 * this.Y - 1, 0, -6255769, 0);
            }
         }
      }

      if (this.b && (DataCenter.d().h % 20 > 15 || this.o.b[4] || this.o.b[6] || this.o.b[2] || this.o.b[8])) {
         try {
            var1.f(11382189);
            String var4 = this.Z[this.K];
            if ((var2 = VDTT_dg.a(VDTT_dg.d, var4.substring(0, this.J))) < 0) {
               var2 = 0;
            }

            var1.c(var2 + 1 + 5, this.K * this.Y + this.Y / 2 - 7 - 1, 1, 16);
         } catch (Exception var3) {
         }
      }

      this.a(var1);
   }
}
