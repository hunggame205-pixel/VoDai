package core.mchien.main2;

import java.util.Vector;

public final class VDTT_cg extends VDTT_p {
   private final int I = 25;
   private int J = 625;
   private int K = 344;
   private float L = 1.0F;
   public int d;
   private int M;
   private final VDTT_mg N;
   private int O;
   private float P;
   private int Q;
   private int R;

   public VDTT_cg(int var1, String var2, String var3) {
      this.d = var1;
      float var6 = (float)DataCenter.d().n / (float)this.J;
      float var4 = (float)DataCenter.d().o / (float)this.K;
      this.L = var6 > var4 ? var6 : var4;
      Vector var7 = new Vector();
      String[] var9 = VDTT_jb.a(var3, "\\n");
      String var10 = "";
      var10 = "c#yellow" + var2 + "\nc#white" + var10;
      var7.addElement(new VDTT_hq(new Vector(), var10, (byte)2, ""));

      for(int var8 = 0; var8 < var9.length; ++var8) {
         String[] var5;
         if ((var5 = var9[var8].split("@")).length == 1) {
            var10 = var9[var8].replaceAll("#", "c#green" + VDTT_ek.m().aD + "c#white").replaceAll("\\$", "c#blue" + VDTT_ek.m().ai() + "c#white").replaceAll("\\*", Caption.Ad[VDTT_ek.m().au]).replaceAll("\\&", Caption.Ae[VDTT_ek.m().au]).replaceAll("\\^", Caption.Af[VDTT_ek.m().au]).replaceAll("\\%", Caption.Ag[VDTT_ek.m().au]).replaceAll("\\~", Caption.Ah[VDTT_ek.m().au]).replaceAll("\\_", Caption.Ai[VDTT_ek.m().au]);
            var7.addElement(new VDTT_hq(VDTT_ek.m().be, var10, (byte)2, ""));
         } else {
            var10 = (var10 = var5[1]).replaceAll("#", "c#green" + VDTT_ek.m().aD + "c#white").replaceAll("\\$", "c#blue" + VDTT_ek.m().ai() + "c#white").replaceAll("\\*", Caption.Ad[VDTT_ek.m().au]).replaceAll("\\&", Caption.Ae[VDTT_ek.m().au]).replaceAll("\\^", Caption.Af[VDTT_ek.m().au]).replaceAll("\\%", Caption.Ag[VDTT_ek.m().au]).replaceAll("\\~", Caption.Ah[VDTT_ek.m().au]).replaceAll("\\_", Caption.Ai[VDTT_ek.m().au]);
            int var11;
            if ((var11 = Integer.parseInt(var5[0])) >= 0) {
               VDTT_gx var12 = new VDTT_gx((byte)0, var11, 0, 0);
               var7.addElement(new VDTT_hq(var12.m().b[0], var10, (byte)0, var12.m().j));
            } else {
               var7.addElement(new VDTT_hq(VDTT_ek.m().aa(), var10, (byte)1, VDTT_ek.m().aD));
            }
         }
      }

      this.N = new VDTT_mg(this, var7, -3);
      this.a(this.N);
      this.O = 0;
   }

   public final void j() {
   }

   public final void k() {
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      if (VDTT_d.g().f > 0) {
         --VDTT_d.g().f;
         if (VDTT_d.g().f == 0) {
            DataCenter.d().g();
            return;
         }
      }

      if (this.d == 0) {
         ++this.O;
         this.P = (float)this.O / 25.0F;
         if (this.P > 1.0F) {
            this.P = 1.0F;
         }

         VDTT_v var2;
         if ((var2 = (VDTT_v)VDTT_d.e.get(7)) != null) {
            this.Q = (int)(this.P * (float)DataCenter.d().n);
            this.R = (int)(this.P * (float)DataCenter.d().o);
            var1.a(var2, 0, 0, var2.c, var2.d, DataCenter.d().n - this.Q, (float)(DataCenter.d().n / 2), (float)(DataCenter.d().o / 2), (float)(this.Q * DataCenter.d().r), (float)(this.R * DataCenter.d().r), 3);
         }
      }

   }

   public final void a_() {
      if (this.O == 1) {
         VDTT_ac.b().b(86);
         VDTT_ac var1;
         if (!(var1 = VDTT_ac.b()).a) {
            var1.a(6);
         }
      }

      VDTT_cw.v().a_();
      if (this.M > 0) {
         --this.M;
         if (this.M == 0) {
            DataCenter var10000 = DataCenter.d();
            VDTT_cw var2 = VDTT_cw.v();
            var10000.ai = var2;

            try {
               if (this.d == 0) {
                  Message.c((byte)-123).l();
               }
            } catch (Exception var3) {
               VDTT_jb.a(var3);
            }
         }
      } else if (!(super.c instanceof VDTT_mg)) {
         this.M = 1;
      }

      DataCenter.d().aA.b = false;
   }

   public final void c() {
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
   }
}
