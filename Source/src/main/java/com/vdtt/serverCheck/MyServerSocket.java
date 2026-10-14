package com.vdtt.serverCheck;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket {
    public int PORT = -1;
    public ServerSocketHandler handler;
    public ServerSocket server;
    public boolean RUN = false;
    public Thread thread;

    public MyServerSocket(int PORT, ServerSocketHandler handler) {
        this.PORT = PORT;
        this.handler = handler;
    }

    public void open() {
        if (!this.RUN) {
            this.RUN = true;
            this.thread = new Thread(() -> {
                try {
                    if (this.PORT == -1) {
                        System.out.println("CHUA NHAP PORT");
                    } else {
                        this.server = new ServerSocket(this.PORT);
                        System.out.println("MO SERVER: " + this.PORT);

                        while(this.server != null && !this.server.isClosed() && this.RUN) {
                            try {
                                Socket socket = this.server.accept();
                                if (this.handler != null) {
                                    this.handler.socketConnet(socket);
                                }
                            } catch (Exception var2) {
                                var2.printStackTrace();
                                this.close();
                                return;
                            }
                        }

                    }
                } catch (IOException var3) {
                    System.out.println("KHONG THE MO PORT: " + this.PORT);
                    this.close();
                }
            });
            this.thread.setName("Server Socket");
            this.thread.start();
        }
    }

    private void close() {
        if (this.RUN) {
            this.RUN = false;
            if (this.server != null) {
                try {
                    this.server.close();
                } catch (Exception var3) {
                }

                this.server = null;
            }

            if (this.thread != null) {
                try {
                    this.thread.interrupt();
                } catch (Exception var2) {
                }

                this.thread = null;
            }

            System.out.println("CLOSE SERVER: " + this.PORT);
            if (this.handler != null) {
                this.handler.serverClose();
            }

        }
    }
}
