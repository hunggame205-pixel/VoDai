package core.mchien.main2;

import java.util.Comparator;

final class VDTT_go implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
//        return -1;
        return ((VDTT_gn) o1).d - ((VDTT_gn) o2).d;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
