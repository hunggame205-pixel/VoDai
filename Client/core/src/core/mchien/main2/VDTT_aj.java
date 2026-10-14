package core.mchien.main2;

import java.util.Comparator;

final class VDTT_aj implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
//        return -1;
        XYEntity xYEntity = (XYEntity) o1;
        XYEntity xYEntity2 = (XYEntity) o2;
        return xYEntity.objY == xYEntity2.objY ? xYEntity2.objX - xYEntity.objX : xYEntity.objY - xYEntity2.objY;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
