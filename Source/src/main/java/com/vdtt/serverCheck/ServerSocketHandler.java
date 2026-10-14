package com.vdtt.serverCheck;

import java.net.Socket;

public interface ServerSocketHandler {

    void socketConnet(Socket var1);

    void serverClose();
}
