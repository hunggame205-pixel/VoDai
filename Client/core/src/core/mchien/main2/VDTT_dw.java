package core.mchien.main2;

import java.util.Comparator;

final class VDTT_dw implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
//        return -1;
        return ((VDTT_dv) o1).b - ((VDTT_dv) o2).b;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
