package core.mchien.main2;

import java.util.Comparator;

final class VDTT_ga implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
//        return -1;
        return ((VDTT_fz) o1).d[0].objY - ((VDTT_fz) o2).d[0].objY;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
