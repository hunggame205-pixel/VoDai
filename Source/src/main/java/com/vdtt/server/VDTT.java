package com.vdtt.server;

import com.vdtt.serverCheck.ServerCheck;
import com.vdtt.util.Log;

public class VDTT {

    public static volatile boolean isStop = false;

    public static void main(String[] args) {

        ServerCheck.init();
        new ServerPanel();

        Log.info("Khoi dong server...");

        Server.init();
        Server.updateMaxConnect();
        Server.start();

        // giữ main thread sống
        while (!isStop) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {}
        }

        Log.info("Server da dung. Thoat chuong trinh.");
        System.exit(0);
    }
}



