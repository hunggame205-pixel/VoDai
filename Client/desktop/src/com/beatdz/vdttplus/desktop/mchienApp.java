package com.beatdz.vdttplus.desktop;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import core.mchien.main2.VDTT_d;
import core.mchien.vn.boot.GameM;

public class mchienApp extends LwjglApplication {
    public mchienApp(ApplicationListener var1, LwjglApplicationConfiguration var2) {
        super(var1, var2);
    }

    public final void exit() {
        GameM.a();
        VDTT_d.o();
    }
}

