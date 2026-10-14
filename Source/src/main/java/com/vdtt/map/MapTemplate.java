package com.vdtt.map;

import com.vdtt.data.*;
import com.vdtt.mob.Mob;
import com.vdtt.model.Entity;
import com.vdtt.model.WayPoint;
import com.vdtt.model.XYEntity;
import com.vdtt.npc.Npc;
import com.vdtt.util.Log;
import com.vdtt.util.VDTTUtlis;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MapTemplate {
    public short id;
    public String name;
    public short typeArr;
    public byte type;
    public byte e;
    public byte[] arrMap;
    public short maxX;
    public short maxY;
    public ArrayList<WayPoint> listWayPoint = new ArrayList();
    public ArrayList<WayPoint> listWayPointIn = new ArrayList();
    public List<Mob> mobList = new ArrayList<>();
    public List<Npc> npcList = new ArrayList<>();
    public Vector Q = new Vector();
    public Vector R = new Vector();
    private int cN;
    public vdtt_fk V;
    public Vector X = new Vector();
    public Vector dM = new Vector();
    public Vector dN = new Vector();
    public Hashtable dL = new Hashtable();
    public List<Entity>listEntity = new ArrayList<>();

    public MapTemplate(int var1) {
        this.id = (short) var1;
    }

    public static int dK = 120;


    public void load() {
        try {
            byte[] array = arrMap;
            if (array == null||array.length == 0) {
                return;
            }
            DataInputStream dis = new DataInputStream(new ByteArrayInputStream(array));

            check(dis);
            this.maxX = dis.readShort();
            this.maxY = dis.readShort();
            this.cN = 0;
            this.Q.clear();
            new Vector();

            vdtt_fw[] var2;
            (var2 = new vdtt_fw[dis.readUnsignedByte() + 4])[var2.length - 1] = b(-50, -50, this.maxX + 50, 50);
            var2[var2.length - 2] = b(-50, -50, 15, this.maxY + 50);
            var2[var2.length - 3] = b(-50, this.maxY - 15, this.maxX + 50, this.maxY + 50);
            var2[var2.length - 4] = b(this.maxX - 15, -50, this.maxX + 50, this.maxY + 50);

            int var3;
            for (var3 = 0; var3 < var2.length - 4; ++var3) {
                var2[var3] = new vdtt_fw();
                var2[var3].d = new XYEntity[dis.readUnsignedByte()];

                for (int var4 = 0; var4 < var2[var3].d.length; ++var4) {
                    var2[var3].d[var4] = new XYEntity();
                    var2[var3].d[var4].setXY(dis.readShort(), dis.readShort());
                    if (var4 == 0) {
                        var2[var3].e = var2[var3].g = var2[var3].d[var4].x;
                        var2[var3].f = var2[var3].h = var2[var3].d[var4].y;
                    } else {
                        if (var2[var3].d[var4].x < var2[var3].e) {
                            var2[var3].e = var2[var3].d[var4].x;
                        }

                        if (var2[var3].d[var4].x > var2[var3].g) {
                            var2[var3].g = var2[var3].d[var4].x;
                        }

                        if (var2[var3].d[var4].y < var2[var3].f) {
                            var2[var3].f = var2[var3].d[var4].y;
                        }

                        if (var2[var3].d[var4].y > var2[var3].h) {
                            var2[var3].h = var2[var3].d[var4].y;
                        }
                    }
                }
            }

            this.V = new vdtt_fk(var2, this);
            vdtt_fv[] var29 = new vdtt_fv[dis.readShort()];
            Vector var30 = new Vector();
            Vector var26 = new Vector();

            int var5;
            int var6;
            for (var5 = 0; var5 < var29.length; ++var5) {
                var29[var5] = new vdtt_fv();
                var29[var5].a = dis.readBoolean();
                if (var29[var5].a) {
                    var26.add(var29[var5]);
                } else {
                    var30.add(var29[var5]);
                }

                var29[var5].d = new XYEntity[dis.readShort()];

                for (var6 = 0; var6 < var29[var5].d.length; ++var6) {
                    var29[var5].d[var6] = new XYEntity();
                    var29[var5].d[var6].setXY(dis.readShort(), dis.readShort());
                }
            }

            this.dL.clear();
            this.dM.clear();
            this.dN.clear();

            vdtt_fv var32;
            for (var5 = 0; var5 < var26.size(); ++var5) {
                if ((var32 = (vdtt_fv) var26.get(var5)).d.length > 2) {
                    V.a.add(new vdtt_fw(var32.d));

                    try {
                        for (var3 = 0; var3 < var32.d.length; ++var3) {
                            if (var32.d[var3].y != var32.d[var3 + 1].y) {
                                if (var32.d[var3].y < var32.d[var3 + 1].y) {
                                    this.dN.add(new vdtt_fw(new XYEntity[]{var32.d[var3], var32.d[var3 + 1]}));
                                } else {
                                    this.dN.add(new vdtt_fw(new XYEntity[]{var32.d[var3 + 1], var32.d[var3]}));
                                }

                                ++var3;
                            }
                        }
                    } catch (Exception var23) {
                    }
                } else {
                    for (var3 = 0; var3 < var32.d.length; ++var3) {
                        XYEntity var7 = var32.d[var3];
                        if (V.a(var7.x, var7.y)) {
                            XYEntity var8 = V.b(var7.x, var7.y);
                            var32.d[var3].x = var8.x;
                            var32.d[var3].y = var8.y;
                        }
                    }
                }
            }

            var29 = new vdtt_fv[var30.size()];

            for (var5 = 0; var5 < var30.size(); ++var5) {
                var29[var5] = (vdtt_fv) var30.get(var5);
                if (VDTTUtlis.b(var29[var5].d[0].y - var29[var5].d[1].y) > dK) {
                    if (var29[var5].d[0].y > var29[var5].d[1].y) {
                        this.a(var29[var5].d[1], var29[var5].d[0], true, this.dL);
                    } else {
                        this.a(var29[var5].d[0], var29[var5].d[1], true, this.dL);
                    }
                } else {
                    this.a(var29[var5].d[0], var29[var5].d[1], true, this.dL);
                    this.a(var29[var5].d[1], var29[var5].d[0], true, this.dL);
                }
            }

            Iterator var33 = this.dL.keySet().iterator();

            while (var33.hasNext()) {
                String var34 = (String) var33.next();
                ((vdtt_gn) this.dL.get(var34)).b = new Vector();
                ((vdtt_gn) this.dL.get(var34)).c = new Vector();
                ((vdtt_gn) this.dL.get(var34)).d = new Vector();
                ((vdtt_gn) this.dL.get(var34)).e = new Vector();
                ((vdtt_gn) this.dL.get(var34)).f = new Vector();
                ((vdtt_gn) this.dL.get(var34)).e.addAll(((vdtt_gn) this.dL.get(var34)).a);
                ((vdtt_gn) this.dL.get(var34)).f.addAll(((vdtt_gn) this.dL.get(var34)).a);
                Collections.sort(((vdtt_gn) this.dL.get(var34)).e);
                Collections.sort(((vdtt_gn) this.dL.get(var34)).f, Collections.reverseOrder());

                for (var3 = ((vdtt_gn) this.dL.get(var34)).a.size() - 1; var3 >= 0; --var3) {
                    ((vdtt_gn) this.dL.get(var34)).b.add(((vdtt_gn) this.dL.get(var34)).a.get(var3));
                }

                ((vdtt_gn) this.dL.get(var34)).c.addAll(((vdtt_gn) this.dL.get(var34)).a);
                String var35;
                if (((vdtt_gn) this.dL.get(var34)).c.size() > 0) {
                    var35 = (String) ((vdtt_gn) this.dL.get(var34)).c.get(0);
                    ((vdtt_gn) this.dL.get(var34)).c.removeElementAt(0);
                    ((vdtt_gn) this.dL.get(var34)).c.add(var35);
                }

                ((vdtt_gn) this.dL.get(var34)).d.addAll(((vdtt_gn) this.dL.get(var34)).b);
                if (((vdtt_gn) this.dL.get(var34)).d.size() > 0) {
                    var35 = (String) ((vdtt_gn) this.dL.get(var34)).d.get(0);
                    ((vdtt_gn) this.dL.get(var34)).d.removeElementAt(0);
                    ((vdtt_gn) this.dL.get(var34)).d.add(var35);
                }
            }

            this.X.clear();

            for (var5 = 0; var5 < var26.size(); ++var5) {
                var32 = (vdtt_fv) var26.get(var5);

                try {
                    for (var3 = 0; var3 < var32.d.length; var3 += 2) {
                        vdtt_fw var36;
                        (var36 = new vdtt_fw()).d = new XYEntity[2];
                        var36.d[0] = var32.d[var3];
                        var36.d[1] = var32.d[var3 + 1];
                        if (var36.d[0].y == var36.d[1].y && var36.d[0].y < this.maxY - 20) {
                            this.X.add(var36);
                        }
                    }
                } catch (Exception var22) {
                }
            }

            Collections.sort(this.dN, vdtt_fw.c);
            Collections.sort(this.dM, vdtt_fw.b);
            Collections.sort(this.X, vdtt_fw.b);
            short var38 = dis.readShort();
//
//            for(var6 = 0; var6 < var38; ++var6) {
//                var1.dis.readShort();
//            }
//
//            this.R.removeAllElements();
//            var38 = var1.dis.readShort();
//            Short var39 = null;
//            int var37 = 0;
//            Vector var40 = new Vector();
//            int var27 = 0;
//            vdtt_iw var31 = null;
//
//            int var9;
//            vdtt_iw var41;
//            for(var9 = 0; var9 < var38; ++var9) {
//                if (var37 == 0) {
//                    var39 = new Short(var1.dis.readShort());
//                    this.Q.addElement(var39);
//                    var37 = var1.dis.readShort();
//                }
//
//                (var41 = new vdtt_iw(var39)).x = var41.m = var1.dis.readShort();
//                var41.y = var41.n = var1.dis.readShort();
//                var41.k = var1.dis.readByte();
//                if (var41.m().e >= 0 && var41.m().d >= 6 && var41.m().d != 11) {
//                    var40.add(var41);
//                    if (var41.m().d == 9 || var41.m().d == 10) {
//                        var31 = var41;
//                        ++var27;
//                    }
//                } else {
//                    this.R.addElement(var41);
//                }
//
//                if (var37 > 0) {
//                    --var37;
//                }
//            }
//
//            this.bH = true;
//
//            for(var9 = 0; var9 < this.vMob.size(); ++var9) {
//                ((Mob)this.vMob.get(var9)).m();
//            }
//
//            for(var9 = 0; var9 < this.vNpc.size(); ++var9) {
//                ((Npc)this.vNpc.get(var9)).n();
//            }
//
//            this.eh.clear();
//            this.ei.clear();
//            short var42;
//            label852:
//            switch(this.typeArr) {
//                case 1:
//                    var5 = 0;
//
//                    while(true) {
//                        if (var5 >= 30) {
//                            break label852;
//                        }
//
//                        var42 = 577;
//                        if (var5 % 4 == 0) {
//                            var42 = 578;
//                        } else if (var5 % 5 == 0) {
//                            var42 = 579;
//                        }
//
//                        this.ei.add(new vdtt_du(var42, 5, 5, 5, var5, 30, this.maxX, this.maxY, false));
//                        ++var5;
//                    }
//                case 2:
//                    var5 = 0;
//
//                    while(true) {
//                        if (var5 >= 25) {
//                            break label852;
//                        }
//
//                        var42 = 580;
//                        if (var5 % 4 == 0) {
//                            var42 = 581;
//                        } else if (var5 % 5 == 0) {
//                            var42 = 582;
//                        }
//
//                        this.ei.add(new vdtt_du(var42, 4, 4, 5, var5, 25, this.maxX, this.maxY, false));
//                        ++var5;
//                    }
//                case 3:
//                    var5 = 0;
//
//                    while(true) {
//                        if (var5 >= 200) {
//                            break label852;
//                        }
//
//                        byte var43 = 28;
//                        if (var5 % 2 == 0) {
//                            var43 = 29;
//                        } else if (var5 % 3 == 0) {
//                            var43 = 30;
//                        }
//
//                        this.ei.add(new vdtt_du(var43, 2, 2, 8, var5, 200, this.maxX, this.maxY, false));
//                        ++var5;
//                    }
//                case 4:
//                    var42 = 0;
//                    var5 = 0;
//
//                    while(true) {
//                        if (var5 >= 60) {
//                            break label852;
//                        }
//
//                        if (var5 % 2 == 0) {
//                            var42 = 191;
//                        } else if (var5 % 3 == 0) {
//                            var42 = 192;
//                        }
//
//                        this.ei.add(new vdtt_du(var42, 4, 1, 8, var5, 60, this.maxX, this.maxY, false));
//                        ++var5;
//                    }
//                case 5:
//                    var5 = 0;
//
//                    while(true) {
//                        if (var5 >= 150) {
//                            break label852;
//                        }
//
//                        if (var5 % 8 == 0) {
//                            var3 = Utlis.b() ? 12 : 14;
//                            this.ei.add(new vdtt_du(var3, 0, 3, 11, var5, 150, this.maxX, this.maxY, false));
//                        } else {
//                            var3 = Utlis.b() ? 11 : 13;
//                            this.ei.add(new vdtt_du(var3, 0, 3, 11, var5, 150, this.maxX, this.maxY, false));
//                        }

//                        ++var5;
//                    }
//                case 6:
//                    var5 = 0;
//
//                    while(true) {
//                        if (var5 >= 100) {
//                            break label852;
//                        }
//
//                        if (var5 % 8 == 0) {
//                            this.ei.add(new vdtt_du(14, 0, 3, 11, var5, 100, this.maxX, this.maxY, false));
//                        } else {
//                            this.ei.add(new vdtt_du(13, 0, 3, 11, var5, 100, this.maxX, this.maxY, false));
//                        }
//
//                        ++var5;
//                    }
//                case 7:
//                    for(var5 = 0; var5 < 80; ++var5) {
//                        if (var5 % 8 == 0) {
//                            this.ei.add(new vdtt_du(12, 0, 3, 11, var5, 80, this.maxX, this.maxY, false));
//                        } else {
//                            this.ei.add(new vdtt_du(11, 0, 3, 11, var5, 80, this.maxX, this.maxY, false));
//                        }
//                    }
//                case 8:
//                default:
//                    break;
//                case 9:
//                    for(var5 = 0; var5 < 100; ++var5) {
//                        var42 = 443;
//                        if (var5 % 2 == 0) {
//                            var42 = 444;
//                        } else if (var5 % 3 == 0) {
//                            var42 = 445;
//                        }
//
//                        this.ei.add(new vdtt_du(var42, Utlis.a(1, 3), 0, 9, var5, 100, this.maxX, this.maxY, false));
//                    }
//            }
//
//            if (var40.size() > 0) {
//                if (var31 != null) {
//                    (var41 = new vdtt_iw(var31.l)).x = var41.m = (short)(var31.x + var31.m().a);
//                    var41.y = var41.n = var31.y;
//                    var41.k = var31.k;
//                    var40.add(var41);
//                    (var41 = new vdtt_iw(var31.l)).x = var41.m = (short)(var31.x + var31.m().a * 2);
//                    var41.y = var41.n = var31.y;
//                    var41.k = var31.k;
//                    var40.add(var41);
//                    (var41 = new vdtt_iw(var31.l)).x = var41.m = (short)(var31.x + var31.m().a * 3);
//                    var41.y = var41.n = var31.y;
//                    var41.k = var31.k;
//                    var40.add(var41);
//                }
//
//                Collections.sort(var40, XYEntity.E);
//
//                for(var9 = 0; var9 < var40.size(); ++var9) {
//                    if (((vdtt_iw)var40.get(var9)).m().d == 10) {
//                        this.eh.add(new vdtt_du(DataCenter.gI().E[((vdtt_iw)var40.get(var9)).m().e].b[0].a, 1, 0, 4, var9, var27 + 3, this.maxX, ((vdtt_iw)var40.get(var9)).y, true, ((vdtt_iw)var40.get(var9)).m().a, ((vdtt_iw)var40.get(var9)).m().b));
//                    } else if (((vdtt_iw)var40.get(var9)).m().d == 9) {
//                        this.eh.add(new vdtt_du(DataCenter.gI().E[((vdtt_iw)var40.get(var9)).m().e].b[0].a, 1, 0, 3, var9, var27 + 3, this.maxX, ((vdtt_iw)var40.get(var9)).y, true, ((vdtt_iw)var40.get(var9)).m().a, ((vdtt_iw)var40.get(var9)).m().b));
//                    } else if (((vdtt_iw)var40.get(var9)).m().d == 8) {
//                        this.eh.add(new vdtt_du(DataCenter.gI().E[((vdtt_iw)var40.get(var9)).m().e].b[0].a, 3, 0, 2, var9, 0, this.maxX, ((vdtt_iw)var40.get(var9)).y, true));
//                    } else if (((vdtt_iw)var40.get(var9)).m().d == 7) {
//                        this.eh.add(new vdtt_du(DataCenter.gI().E[((vdtt_iw)var40.get(var9)).m().e].b[0].a, 3, 0, 0, var9, 0, this.maxX, ((vdtt_iw)var40.get(var9)).y, true));
//                    } else if (((vdtt_iw)var40.get(var9)).m().d == 6) {
//                        this.eh.add(new vdtt_du(DataCenter.gI().E[((vdtt_iw)var40.get(var9)).m().e].b[0].a, 3, 0, 1, var9, 0, this.maxX, ((vdtt_iw)var40.get(var9)).y, true));
//                    }
//                }
//            }
//
//            if (this.mapID == 67) {
//                for(var9 = 0; var9 < 25; ++var9) {
//                    this.eh.add(new vdtt_du(4, 2, 0, 12, var9, 25, this.maxX, this.maxY + 30, false, (short)112, (short)10));
//                }
//            }
//
//            this.eo = false;
//            this.ej.clear();
//            this.cO = 0;
//            this.z();
//            this.cc = false;
//            if (this.aC == null) {
//                this.aC = new vdtt_lh(this);
//            }
//
//            this.aC.M = true;
//            m = false;
//            this.cr = 1;
//            this.dF = null;
//            this.o.b();
//            vdtt_aa var10000 = vdtt_aa.gI();
//            boolean var28 = false;
//            var10000.g = var28;
//            if (gI().getMapTemplate().type != 19) {
//                this.ax.clear();
//            }

        } catch (Exception ex) {
            Log.debug("error load map " + id);
        }
    }
    public final void a(XYEntity var1, XYEntity var2, boolean var3, Hashtable var4) {
        if (!var3 || var1.x == var2.x || var1.y == var2.y || this.V.a(var1, var2) == null) {
            String var5 = var1.x + "_" + var1.y;
            String var6 = var2.x + "_" + var2.y;
            if (!var5.equals(var6)) {
                vdtt_gn var7;
                if ((var7 = (vdtt_gn)var4.get(var5)) == null) {
                    var7 = new vdtt_gn();
                }

                if (!var7.a.contains(var6)) {
                    var7.a.add(var6);
                    if (var3 && var1.y == var2.y) {
                        this.dM.add(new vdtt_fw(new XYEntity[]{var1, var2}));
                    }
                }

                var4.put(var5, var7);
            }
        }
    }

    private static vdtt_fw b(int var0, int var1, int var2, int var3) {
        vdtt_fw var4;
        (var4 = new vdtt_fw()).d = new XYEntity[5];
        var4.d[0] = XYEntity.create(var0, var1);
        var4.d[1] = XYEntity.create(var2, var1);
        var4.d[2] = XYEntity.create(var2, var3);
        var4.d[3] = XYEntity.create(var0, var3);
        var4.d[4] = XYEntity.create(var0, var1);
        return var4;
    }

    public void check(DataInputStream dis) throws IOException {
        int size = dis.readUnsignedShort();
        for (int i = 0; i < size; i++) {
            dis.readShort();
            dis.readShort();
            dis.readByte();
            dis.readShort();
            dis.readShort();
            int size2 = dis.readUnsignedByte();
            for (int j = 0; j < size2; ++j) {
                int size3 = dis.readUnsignedByte();
                for (int k = 0; k < size3; ++k) {
                    int size4 = dis.readByte() / 2;
                    for (int l = 0; l < size4; ++l) {
                        dis.readShort();
                        dis.readShort();
                    }
                }
            }
        }
        size = dis.readUnsignedShort();
        for (int i = 0; i < size; i++) {
            dis.readShort();
            dis.readShort();
            int size2 = dis.readUnsignedByte();
            for (int j = 0; j < size2; ++j) {
                dis.readShort();
                dis.readShort();
                dis.readShort();
                dis.readByte();
            }
            size2 = dis.readUnsignedByte();
            for (int j = 0; j < size2; ++j) {
                int size3 = dis.readUnsignedByte();
                for (int k = 0; k < size3; ++k) {
                    int size4 = dis.readByte() / 2;
                    for (int l = 0; l < size4; ++l) {
                        dis.readShort();
                        dis.readShort();
                    }
                }
            }
        }

    }

    public void createWayPoint() {
        try {
            for (int var10 = 0; var10 < DataCenter.gI().dataWayPoint.length; ++var10) {
                WayPoint var11;
                if (DataCenter.gI().dataWayPoint[var10][0] == this.id) {
                    (var11 = new WayPoint(0, 0)).a(DataCenter.gI().dataWayPoint[var10][0], DataCenter.gI().dataWayPoint[var10][5], DataCenter.gI().dataWayPoint[var10][1], DataCenter.gI().dataWayPoint[var10][2], DataCenter.gI().dataWayPoint[var10][3], DataCenter.gI().dataWayPoint[var10][4], DataCenter.gI().dataWayPoint[var10][10], DataCenter.gI().dataWayPoint[var10][11]);
                    this.listWayPoint.add(var11);
                } else if (DataCenter.gI().dataWayPoint[var10][5] == this.id) {
                    (var11 = new WayPoint(0, 0)).a(DataCenter.gI().dataWayPoint[var10][5], DataCenter.gI().dataWayPoint[var10][0], DataCenter.gI().dataWayPoint[var10][6], DataCenter.gI().dataWayPoint[var10][7], DataCenter.gI().dataWayPoint[var10][8], DataCenter.gI().dataWayPoint[var10][9], DataCenter.gI().dataWayPoint[var10][12], DataCenter.gI().dataWayPoint[var10][13]);
                    this.listWayPoint.add(var11);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void loadData() {
        try {
            byte[] dataJsonMob = VDTTUtlis.read("data\\DataMap\\Mob\\" + this.id + ".bin");
            byte[] dataJsonNpc = VDTTUtlis.read("data\\DataMap\\Npc\\" + this.id + ".bin");
            if (dataJsonMob != null) {
                JSONArray jsonArray = new JSONArray(new String(dataJsonMob, "UTF-8"));
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject json = jsonArray.getJSONObject(i);
                    Mob mob = new Mob();
                    mob.readJson(json);
                    if(mob.id >= 199&&mob.id<=203)
                        continue;
                    mobList.add(mob);
                    Entity entity = new Entity();
                    entity.x = (short) mob.x;
                    entity.y = (short) mob.y;
                    listEntity.add(entity);
                }
            }
            if (dataJsonNpc != null) {
                JSONArray jsonArray = new JSONArray(new String(dataJsonNpc, "UTF-8"));
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject json = jsonArray.getJSONObject(i);
                    Npc npc = new Npc();
                    npc.readJson(json);
                    npcList.add(npc);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void loadData2() {
        try {
            String path = "data/DataMap/Mob/" + id + ".json";
            if (!Files.exists(Paths.get(path)))
                return;
            String content = new String(Files.readAllBytes(Paths.get(path)));
            if (content == null || content.isEmpty()) {
                return;
            }
            JSONArray jsonArray = new JSONArray(content);
            mobList.clear();
            listEntity.clear();
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject json = jsonArray.getJSONObject(i);
                int id = json.getInt("id");
                int levelBoss = json.getInt("levelBoss");
                int status = json.getInt("status");
                int x = json.getInt("x");
                int y = json.getInt("y");
                boolean paintMiniMap = json.getBoolean("paintMiniMap");
                int hpFull = json.getInt("hpFull");
                int level = json.getInt("level");
                Mob mob = new Mob();
                mob.id = id;
                if(mob.id >= 199&&mob.id<=203)
                    continue;
                mob.levelBoss = levelBoss;
                mob.status = (byte) status;
                mob.x = x;
                mob.y = y;
                mob.isPaint = paintMiniMap;
                mob.hp = mob.hpFull = hpFull;
                mob.level = level;
                mob.loadKiNow();
                mobList.add(mob);
                Entity entity = new Entity();
                entity.x = (short) mob.x;
                entity.y = (short) mob.y;
                listEntity.add(entity);
                // Tiếp tục xử lý dữ liệu tại đây...
            }
            path = "data/DataMap/Npc/" + id + ".json";
            if (!Files.exists(Paths.get(path)))
                return;
            content = new String(Files.readAllBytes(Paths.get(path)));
            if (content == null || content.isEmpty()) {
                return;
            }
            npcList.clear();
            jsonArray = new JSONArray(content);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject json = jsonArray.getJSONObject(i);
                int id = json.getInt("id");
                int status = json.getInt("status");
                int x = json.getInt("cx");
                int y = json.getInt("cy");
                Npc npc = new Npc();
                npc.id = id;
                npc.status = status;
                npc.x = (short) x;
                npc.y = (short) y;
                npcList.add(npc);
                // Tiếp tục xử lý dữ liệu tại đây...
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean isPhoBan() {
        try {
            if (this.type == 4 || this.type == 14 || this.type == 15 || this.type == 5 || this.type == 7 || this.type == 8 || this.type == 6 || this.type == 9 || this.type == 10 || this.type == 12 || this.type == 13 || this.type == 16 || this.type == 17 || this.type == 19 || this.type == 20 || this.type == 21 || this.type == 23 || this.type == 24) {
                return true;
            }
        } catch (Exception var1) {
        }

        return false;
    }

}
