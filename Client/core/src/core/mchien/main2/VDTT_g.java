package core.mchien.main2;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import java.util.Vector;
public final class VDTT_g implements Runnable {
   // $FF: synthetic field
   final VDTT_d a;

   public VDTT_g(VDTT_d var1) {
      this.a = var1;
   }

   public final void run() {
    try {
        String str;
      Vector<VDTT_ia> vector = new Vector();
      if (DataCenter.aj && !VDTT_d.h()) {
        if (Gdx.app.getType() == Application.ApplicationType.iOS) {
          str = VDTT_da.a((DataCenter.d()).linkCheckData + "serverlistios.txt", 6);
        } else {
          str = VDTT_da.a((DataCenter.d()).linkCheckData + "serverlistandroid.txt", 6);
        } 
      } else {
        str = VDTT_da.a((DataCenter.d()).linkCheckData + "serverlist.txt", 6);
      } 
      if (str == null || str.length() == 0)
        str = VDTT_d.q;
      //todo Load ip tại đây
     str += "Sever 1 = 2:180.93.120.92:7105:18021\r\n";
      (DataCenter.d()).aC = null;
      String[] arrayOfString = (str = (str = str.replaceAll(" =", "=")).replaceAll("= ", "=")).split("id=");
      boolean b1 = true;
      byte b2;
      for (b2 = 0; b2 < arrayOfString.length; b2++) {
        if (arrayOfString[b2].trim().length() > 0) {
          String[] arrayOfString1 = arrayOfString[b2].trim().split("\r\n");
          VDTT_ia vDTT_ia;
          (vDTT_ia = new VDTT_ia()).a = arrayOfString1[0];
          Vector<VDTT_hz> vector1 = new Vector();
          byte b;
          for (b = 1; b < arrayOfString1.length; b++) {
            if (arrayOfString1[b].trim().length() > 0) {
              String[] arrayOfString2;
              String[] arrayOfString3 = (arrayOfString2 = arrayOfString1[b].split("="))[0].split(":");
              String[] arrayOfString4 = arrayOfString2[1].split(":");
              (DataCenter.d()).a = arrayOfString4[1];
              (DataCenter.d()).b = Integer.parseInt(arrayOfString4[2]);
              VDTT_hz vDTT_hz = new VDTT_hz();
              if (arrayOfString3.length <= 1) {
                vDTT_hz.b = arrayOfString2[0];
              } else {
                vDTT_hz.g = arrayOfString3[0];
                vDTT_hz.b = arrayOfString3[1];
              } 
              if (!vDTT_hz.g.toUpperCase().equals(Caption.pe)) {
                vDTT_hz.a = Short.parseShort(arrayOfString4[0]);
                vDTT_hz.c = arrayOfString4[1];
                vDTT_hz.d = Short.parseShort(arrayOfString4[2]);
                vDTT_hz.e = Short.parseShort(arrayOfString4[3]);
                if (arrayOfString4.length > 4)
                  vDTT_hz.f = arrayOfString4[4]; 
                if (arrayOfString4.length > 5)
                  vDTT_hz.h = Boolean.parseBoolean(arrayOfString4[5]); 
                if (vDTT_hz.a == 101) {
                  b1 = false;
                  (DataCenter.d()).ah = vDTT_hz;
                } else {
                  b1 = true;
                  vector1.add(vDTT_hz);
                } 
              } 
            } 
          } 
          if (b1) {
            vDTT_ia.b = new VDTT_hz[vector1.size()];
            for (b = 0; b < vector1.size(); b++) {
              vDTT_ia.b[b] = vector1.get(b);
              if ((vDTT_ia.b[b]).h)
                (DataCenter.d()).aC = vDTT_ia.b[b]; 
            } 
            vector.add(vDTT_ia);
          } 
        } 
      } 
      (DataCenter.d()).ag = new VDTT_ia[vector.size()];
      for (b2 = 0; b2 < vector.size(); b2++)
        (DataCenter.d()).ag[b2] = vector.get(b2); 
      if ((DataCenter.d()).aC == null) {
        VDTT_ia vDTT_ia = (DataCenter.d()).ag[(DataCenter.d()).ag.length - 1];
        (DataCenter.d()).aC = vDTT_ia.b[vDTT_ia.b.length - 1];
      } 
      return;
    } catch (Exception exception) {
      return;
    } finally {
      try {
        String[] arrayOfString = VDTT_da.h("arr_server").split(":");
        for (byte b = 0; b < (DataCenter.d()).ag.length; b++) {
          for (byte b1 = 0; b1 < ((DataCenter.d()).ag[b]).b.length; b1++) {
            VDTT_hz vDTT_hz;
            if ((vDTT_hz = ((DataCenter.d()).ag[b]).b[b1]).c.toLowerCase().equals(arrayOfString[0].toLowerCase()) && vDTT_hz.d == Integer.parseInt(arrayOfString[1])) {
              DataCenter.d().a(vDTT_hz);
              return;
            } 
          } 
        } 
      } catch (Exception exception) {}
      DataCenter.d().a((DataCenter.d()).aC);
    } 
  }
}
