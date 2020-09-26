package com.carlosbispo.lasttrainhome;

import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;


public class RendererWrapper implements GLSurfaceView.Renderer {
    private final TouchInterface touchInterface;

    public RendererWrapper(TouchInterface touchInterface) {
        this.touchInterface = touchInterface;
    }

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        GameLibJNIWrapper.on_surface_created();
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        //touchInterface.setWidth(width);
        GameLibJNIWrapper.on_surface_changed(width, height);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        GameLibJNIWrapper.on_draw_frame();
    }



}
