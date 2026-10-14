package com.vdtt.serverCheck;

import java.net.Socket;

public class ServerCheck {

    public static MyServerSocket serverCheckOnline;

    public static void init() {
        serverCheckOnline = new MyServerSocket(7106, new ServerSocketHandler() {
            public void socketConnet(Socket socket) {
                try {
                    socket.getOutputStream().write(1);
                    socket.getOutputStream().flush();
                } catch (Exception var11) {
                    var11.printStackTrace();
                } finally {
                    try {
                        socket.close();
                    } catch (Exception var10) {
                    }

                }
            }

            public void serverClose() {
                System.exit(0);
            }
        });
        serverCheckOnline.open();
    }
}
