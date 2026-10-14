package com.vdtt.model;

import java.util.Comparator;

public class XYEntity {
//    public static final Comparator C = new vdtt_ah();
//    public static final Comparator D = new vdtt_ai();
//    public static final Comparator E = new vdtt_aj();
    public short x;
    public short y;

    public static XYEntity create(int var0, int var1) {
        XYEntity var2;
        (var2 = new XYEntity()).setXY(var0, var1);
        return var2;
    }

    public void setXY(int var1, int var2) {
        this.x = (short)var1;
        this.y = (short)var2;
    }

    public static XYEntity c(String var0) {
        String[] var2 = var0.split("_");
        XYEntity var1;
        (var1 = new XYEntity()).setXY(Integer.parseInt(var2[0]), Integer.parseInt(var2[1]));
        return var1;
    }

    public XYEntity u() {
        return create(this.x, this.y);
    }


    public Object clone() {
        return this.u();
    }
}
