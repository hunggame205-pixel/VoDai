package com.vdtt.server;

import com.vdtt.util.Log;

import java.util.logging.Level;
import java.util.logging.Logger;
public class AutoSaveData implements Runnable {

    @Override
    public void run() {
    while (Server.start && !VDTT.isStop) {

            try {
                Thread.sleep(1800000);
                Server.saveAll();
                GlobalService.getInstance().chat("Hệ thống", "Giáng sinh an lành, Bulma chúc bạn chơi game vui vẻ!", (byte) 1);
//                GlobalService.getInstance().chat("Hệ thống", "Giftcode openbeta, 888zeni, plus9999, kimcuong, tuivai  chúc bạn chơi game vui vẻ!", (byte) 1);
                Log.info("Lưu data tự động");
            } catch (Exception ex) {
                Logger.getLogger(AutoSaveData.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
