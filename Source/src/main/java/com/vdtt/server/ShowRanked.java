package com.vdtt.server;

import com.vdtt.model.Char;
import com.vdtt.network.Message;
import com.vdtt.util.Log;

import java.io.IOException;
import java.util.Vector;

public class ShowRanked {
    private static final ShowRanked instance = new ShowRanked();

    public static ShowRanked gI() {
        return instance;
    }

    public void show(Message ms, Char pl) {
        try {
            if (pl.zone.map.isVoDai()) {
                pl.getService().openUIBXHTournament();
                return;
            }
            if (pl.zone.map.isGDSM()) {
                pl.getService().openUIBXHGDSM();
                return;
            }
            byte type = ms.reader().readByte();
            byte option = ms.reader().readByte();
            switch (type) {
                case 0:
                    switch (option) {
                        case 0:
                            pl.getService().showTopCaoThu(Ranked.RANKED[0], true);
                            break;
                        case 1:
                            pl.getService().showTopCaoThu(Ranked.RANKED[6], true);
                            break;
                        case 2:
                            pl.getService().showTopCaoThu(Ranked.RANKED[7], true);
                            break;
                        case 3:
                            pl.getService().showTopCaoThu(Ranked.RANKED[8], true);
                            break;
                        case 4:
                            pl.getService().showTopCaoThu(Ranked.RANKED[9], true);
                            break;
                        case 5:
                            pl.getService().showTopCaoThu(Ranked.RANKED[10], true);
                            break;
                        case 6:
                            pl.getService().showTopCaoThu(Ranked.RANKED[11], true);
                            break;
                    }
                    break;
                case 4:// top vu tru
                    pl.getService().showTopVuTru(Ranked.RANKED[1], true);
                    break;
                case 2:
                    pl.getService().showTopNap(Ranked.RANKED[12], true);
                    break;
                case 3:// top nap the sửa ở đây nè !!!
                    pl.getService().showTopNap(Ranked.RANKED[2], true);
                    break;
                case 23:
                    pl.getService().showTopKillBoss(Ranked.RANKED[3], true);
                    break;
                default:
                    pl.getService().showTopCaoThu(new Vector<>(), false);
                    break;
            }
            Log.debug("ShowRanked: " + type + " - " + option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Vector getTopByClass(byte classId, Vector list) {
        Vector result = new Vector();
        for (int i = 0; i < list.size(); i++) {
            CaoThu pl = (CaoThu) list.elementAt(i);
            if (pl.classId == classId) {
                result.addElement(pl);
            }
        }
        return result;

    }

}
