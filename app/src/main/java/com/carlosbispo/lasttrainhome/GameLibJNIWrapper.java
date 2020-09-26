package com.carlosbispo.lasttrainhome;

import android.content.res.AssetManager;

public class GameLibJNIWrapper {
    static {
        System.loadLibrary("game");
    }
    public static native void start();
    public static native void on_surface_created();

    public static native void on_surface_changed(int width, int height);

    public static native void on_draw_frame();
    public static native void on_key_right(boolean state);
    public static native void on_key_left(boolean state);
    public static native void on_key_select(boolean state);
    public static native void on_release_keys();
    public static native void load(AssetManager mgr);

}
