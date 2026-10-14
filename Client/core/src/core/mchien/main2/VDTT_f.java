package core.mchien.main2;

final class VDTT_f implements Runnable {

    public final void run() {
        for (int var1 = 100; var1 < 125; ++var1) {
            try {
                VDTT_v var2;
                if ((var2 = VDTT_aa.c(String.valueOf(var1))) != null) {
                    VDTT_d.e.put(var1 - 100, var2);
                }
            } catch (Exception var3) {
                return;
            }
        }
//        for (int var1 = 1; var1 <= 748; ++var1) {
//            String url = "C:\\Users\\TechCat PC\\Downloads\\pet\\" + var1 + ".png";
//            VDTT_d.e2.put(var1, VDTT_v.a(VDTT_jb.m(url)));
//        }
//        VDTT_d.e2.put("KB-Bardock", VDTT_v.a(VDTT_jb.m("C:\\Users\\admin\\Documents\\NetBeansProjects\\VDTTPlus_Desktop\\a\\KB-Bardock.png")));
//        VDTT_d.e2.put("KB-Beerus", VDTT_v.a(VDTT_jb.m("C:\\Users\\admin\\Documents\\NetBeansProjects\\VDTTPlus_Desktop\\a\\KB-Beerus.png")));
//        VDTT_d.e2.put("kb-buu-g", VDTT_v.a(VDTT_jb.m("C:\\Users\\admin\\Documents\\NetBeansProjects\\VDTTPlus_Desktop\\a\\kb-buu-g.png")));
//        VDTT_d.e2.put("kb-jiren", VDTT_v.a(VDTT_jb.m("C:\\Users\\admin\\Documents\\NetBeansProjects\\VDTTPlus_Desktop\\a\\kb-jiren.png")));
//        VDTT_d.e2.put("chucmung", VDTT_v.a(VDTT_jb.m("C:\\Users\\admin\\Documents\\NetBeansProjects\\VDTTPlus_Desktop\\a\\chucmung.png")));

//        for (int var1 = 1; var1 <= 748; ++var1) {
//            String url = "C:\\Users\\TechCat PC\\Downloads\\pet\\" + var1 + ".png";
//            VDTT_d.e2.put(var1, VDTT_v.a(VDTT_jb.m(url)));
//        }
//        for (int var1 = 1; var1 <= 354; ++var1) {
//            String url = "C:\\Users\\admin\\Desktop\\phuonghoanglua\\DefineSprite_362_pet.asset.game.pet062\\" + var1 + ".png";
//            VDTT_d.e3.put(var1, VDTT_v.a(VDTT_jb.m(url)));
//        }
    }
}
