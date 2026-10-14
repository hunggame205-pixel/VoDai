package core.mchien.main2;

/** Tab đăng ký tài khoản: Tài khoản / Mật khẩu / Email. */
public final class VDTT_mc extends VDTT_ar {
   private VDTT_ca tk;
   private VDTT_ca mk;
   private VDTT_ca mail;
   private VDTT_bd dk;

   public VDTT_mc(VDTT_p var1) {
      this.I = var1;
      this.a(220, 170);
      this.tk = this.a(74, 34, 130, "", this, 0);
      this.tk.l = 20;
      this.mk = this.a(74, 60, 130, "", this, 1);
      this.mk.l = 20;
      this.mail = this.a(74, 86, 130, "", this, 0);
      this.mail.l = 60;
      this.dk = new VDTT_bd(74, 112, Caption.ao, this, 0);
      this.a(this.dk);
      this.a(Caption.ab, 1002);
   }

   public final void b(int var1, Object var2) {
   }

   public final void perform(int var1, Object var2, VDTT_z var3) {
   }

   public final void a(VDTT_hl var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (var1.b != 1002) {
         return;
      }

      String u = this.tk.i().trim();
      String p = this.mk.i();
      String e = this.mail.i().trim();
      if (u.length() < 4 || u.length() > 20 || !u.matches("[a-zA-Z0-9]+")) {
         this.I.c("Tài khoản 4-20 ký tự, chỉ gồm chữ và số.", -1);
      } else if (p.length() < 4 || p.length() > 100) {
         this.I.c("Mật khẩu phải từ 4 đến 100 ký tự.", -1);
      } else if (e.indexOf('@') <= 0 || e.indexOf('.') < 0) {
         this.I.c("Email không hợp lệ.", -1);
      } else if (!this.dk.m) {
         this.I.c(Caption.au, -1);
      } else {
         this.k();
         this.send(u, p, e);
      }
   }

   private void send(final String u, final String p, final String e) {
      new Thread(new Runnable() {
         public void run() {
            Message m = null;
            try {
               (m = Message.c((byte) -17)).a(u);
               m.a(p);
               m.a(e);
               m.k();
            } catch (Exception ex) {
               VDTT_jb.a(ex);
            } finally {
               if (m != null) {
                  m.b();
               }
            }
         }
      }).start();
   }

   public final void b(Graphics var1) {
      this.a(var1, this.objX, this.objY, this.q, this.r, Caption.ai, (byte) 2, true);
      VDTT_dg.a(VDTT_dg.d, var1, Caption.yf[0], 15, 45, 0, -1);
      VDTT_dg.a(VDTT_dg.d, var1, Caption.yg[0], 15, 71, 0, -1);
      VDTT_dg.a(VDTT_dg.d, var1, Caption.an, 15, 97, 0, -1);
   }

   public final void a_() {
   }
}
