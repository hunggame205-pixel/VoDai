package core.mchien.main2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Application.ApplicationType;
import java.util.Hashtable;
import java.util.Vector;
import core.mchien.vn.system.DialogText;

public final class VDTT_w implements InputProcessor {
   private static Hashtable c = new Hashtable();
   private static Hashtable d = new Hashtable();
   VDTT_r a;
   int b;
   private int e;
   private int f;

   public static void a() {
      c.clear();
      c.put(61, -15);
      c.put(66, -16);
      c.put(67, 8);
      c.put(62, 32);
      c.put(3, 3);
      c.put(132, 132);
      a(VDTT_da.a());
      d.put(8, 8);
      d.put(22, 22);
      d.put(127, 127);

      for(int var0 = 0; var0 < VDTT_dg.j.length(); ++var0) {
         char var1 = VDTT_dg.j.charAt(var0);
         d.put(Integer.valueOf(var1), Integer.valueOf(var1));
      }

   }

   public VDTT_w(VDTT_r var1, int var2, int var3) {
      this.a = var1;
      this.e = 0;
      this.f = 0;
      Gdx.input.setCatchBackKey(true);
   }

   public static void a(short[] var0) {
      c.put(Integer.valueOf(var0[0]), -1);
      c.put(Integer.valueOf(var0[1]), -2);
      c.put(Integer.valueOf(var0[2]), -3);
      c.put(Integer.valueOf(var0[3]), -4);
      c.put(Integer.valueOf(var0[4]), 15);
      c.put(Integer.valueOf(var0[5]), 16);
      c.put(Integer.valueOf(var0[6]), 17);
      c.put(Integer.valueOf(var0[7]), 18);
      c.put(Integer.valueOf(var0[8]), 19);
      c.put(Integer.valueOf(var0[9]), 20);
      c.put(Integer.valueOf(var0[10]), 21);
      c.put(Integer.valueOf(var0[11]), 22);
      c.put(Integer.valueOf(var0[12]), 23);
      c.put(Integer.valueOf(var0[13]), 24);
      c.put(Integer.valueOf(var0[14]), 25);
   }

   public final boolean keyDown(int var1) {System.out.println(var1);
      if ((var1 != 4 || Gdx.app.getType() == ApplicationType.Android) && var1 != 67) {
         MainScreen var2;
         boolean var7;
         switch(var1) {
            case 111:
         case 4:
         case 131:
            if (DialogText.a(false)) {
               return false;
            }

            if ((var2 = DataCenter.d().ai.c) == null) {
               break;
            }

            if (!(var2 instanceof VDTT_bi) && !(var2 instanceof VDTT_bj) && !(var2 instanceof VDTT_ky)) {
               if (var2.k != null) {
                  var2.b((VDTT_m)var2.k);
                  VDTT_ac.b().x();
                  return true;
               }

               if (var2.f.size() > 0) {
                  if (var2 instanceof VDTT_gi) {
                     ((VDTT_gi)var2).w();
                     return true;
                  }

                  if (var2 instanceof VDTT_am) {
                     ((VDTT_am)var2).k();
                     return true;
                  }

                  DataCenter.d().ai.k();
               }
               break;
            }

            return false;
         case 61:
            if (VDTT_aa.a != null) {
               VDTT_aa.a.k();
            }

            if ((var2 = DataCenter.d().ai.c) != null) {
               Vector var9 = new Vector();
               VDTT_ca var10 = null;

               int var11;
               for(var11 = 0; var11 < var2.f.size(); ++var11) {
                  VDTT_m var6;
                  if ((var6 = (VDTT_m)var2.f.elementAt(var11)) instanceof VDTT_ca) {
                     VDTT_ca var12 = (VDTT_ca)var6;
                     var9.add(var12);
                     if (var12.b) {
                        var10 = var12;
                     }
                  }
               }

               if (var9.size() > 1) {
                  var11 = 0;
                  if (var10 != null) {
                     var7 = false;
                     var10.b = var7;
                     var11 = var9.indexOf(var10);
                     ++var11;
                     if (var11 >= var9.size()) {
                        var11 = 0;
                     }
                  }

                  VDTT_ca var10000 = (VDTT_ca)var9.get(var11);
                  var7 = true;
                  var10000.b = var7;
                  ((VDTT_ca)var9.get(var11)).a((VDTT_hl)(new VDTT_hl(-1001, 0, 0, 0, 0, new VDTT_hs((byte)0, 0, 0, 0, 0, 0, 0), var2)), 0, 0);
               }
            }
            break;
         case 66:
            if (DialogText.a(true)) {
               return false;
            }

            if (VDTT_aa.a != null) {
               VDTT_aa.a.k();
            }

            if ((var2 = DataCenter.d().ai.c) != null) {
               if (!(var2 instanceof VDTT_ke) && !(var2 instanceof VDTT_cw)) {
                  if (var2 instanceof VDTT_cq) {
                     label121: {
                        VDTT_cq var8;
                        if ((var8 = (VDTT_cq)var2).J.b) {
                           if (var8.K.i().length() <= 0) {
                              var7 = false;
                              var8.J.b = var7;
                              var7 = true;
                              var8.K.b = var7;
                              break label121;
                           }

                           if (var8.J.i().length() != 0) {
                              var8.A();
                              break label121;
                           }
                        } else if (var8.J.i().length() > 0) {
                           if (var8.K.i().length() == 0) {
                              var7 = false;
                              var8.J.b = var7;
                              var7 = true;
                              var8.K.b = var7;
                           } else {
                              var8.A();
                           }
                           break label121;
                        }

                        var7 = true;
                        var8.J.b = var7;
                        var7 = false;
                        var8.K.b = var7;
                     }
                  } else if (var2 instanceof SelectCharScreen) {
                     ((SelectCharScreen)var2).v();
                  }
               } else {
                  for(int var3 = 0; var3 < var2.f.size(); ++var3) {
                     VDTT_m var4;
                     if ((var4 = (VDTT_m)var2.f.elementAt(var3)) instanceof VDTT_ca) {
                        VDTT_ca var5 = (VDTT_ca)var4;
                        if (Gdx.app.getType() == ApplicationType.Desktop) {
                           var7 = false;
                           var5.b = var7;
                           if (VDTT_cw.v().aP != null && VDTT_cw.v().aP.equals(var5)) {
                              var5.f(-200, -200);
                              var5.b(true);
                           }
                        }

                        if (var5.U) {
                           VDTT_cw.v().a(var5);

                           for(var1 = 0; var1 < DataCenter.d().ai.f.size(); ++var1) {
                              ((VDTT_m)DataCenter.d().ai.f.elementAt(var1)).b = false;
                           }

                           return true;
                        }
                     }
                  }
               }
            }
         }

         this.a.a(c(var1));
         return true;
      } else {
         return false;
      }
   }

   public final boolean keyUp(int var1) {
      this.a.b(c(var1));
      return false;
   }

   public final boolean keyTyped(char var1) {
      if (d.get(Integer.valueOf(var1)) != null) {
         this.a.a(var1);
      }

      return false;
   }

   private int a(int var1) {
      return (var1 + this.e) / DataCenter.d().p;
   }

   private int b(int var1) {
      return (var1 + this.f) / DataCenter.d().p;
   }

   public final boolean touchDown(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.b = paramInt3;
    if ((DataCenter.d()).aA != null && (DataCenter.d()).aA.a()) {
      int i = paramInt2;
      paramInt4 = paramInt1;
      VDTT_fp vDTT_fp;
      if (VDTT_jb.a((vDTT_fp = (DataCenter.d()).aA).c, vDTT_fp.d, vDTT_fp.c + 50, vDTT_fp.d + 50, paramInt4 / (DataCenter.d()).r + 25, i / (DataCenter.d()).r + 25)) {
        vDTT_fp.f = false;
      } else if (vDTT_fp.a()) {
        vDTT_fp.f = true;
        vDTT_fp.g = vDTT_fp.a;
        vDTT_fp.e = 2;
        vDTT_fp.h = 0.0F;
      } 
    } 
    this.a.b(a(paramInt1), b(paramInt2));
    return true;
  }

   public final boolean touchUp(int var1, int var2, int var3, int var4) {
      if (this.b != var3) {
         return false;
      } else {
         this.a.c(this.a(var1), this.b(var2));
         return true;
      }
   }


   public final boolean touchDragged(int var1, int var2, int var3) {
      if (this.b != var3) {
         return false;
      } else {
         this.a.a(this.a(var1), this.b(var2));
         return true;
      }
   }

   public final boolean mouseMoved(int var1, int var2) {
      return false;
   }


   public final boolean scrolled(int var1) {
      return false;
   }

   private static int c(int var0) {
      Integer var1;
      return (var1 = (Integer)c.get(var0)) == null ? Integer.MIN_VALUE : var1;
   }

   static {
      a();
   }

    @Override
    public boolean touchCancelled(int i, int i1, int i2, int i3) {
        return false;
    }

    @Override
    public boolean scrolled(float f, float f1) {
        return false;
    }


}
