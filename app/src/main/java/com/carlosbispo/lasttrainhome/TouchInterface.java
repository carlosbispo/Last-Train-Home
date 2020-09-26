package com.carlosbispo.lasttrainhome;

import android.view.GestureDetector;
import android.view.MotionEvent;

public class TouchInterface extends GestureDetector.SimpleOnGestureListener {
//    private int width = 0;

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        float direction = e2.getX() - e1.getX();

        if (direction > 0) {
            GameLibJNIWrapper.on_key_left(false);
            GameLibJNIWrapper.on_key_right(true);
            return true;
        }

        if (direction < 0) {
            GameLibJNIWrapper.on_key_left(true);
            GameLibJNIWrapper.on_key_right(false);
            return true;
        }

        // Assume user wants to interact
        GameLibJNIWrapper.on_key_select(true);
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        releaseKeys();
        GameLibJNIWrapper.on_key_select(true);
        /*
        if (e.getX() > width / 2.0f) {
            GameLibJNIWrapper.on_key_left(false);
            GameLibJNIWrapper.on_key_right(true);
            return true;
        }

        if (e.getX() < width / 2.0f) {
            GameLibJNIWrapper.on_key_left(true);
            GameLibJNIWrapper.on_key_right(false);
            return true;
        }
*/
        return true;
    }

    public void releaseKeys() {
        GameLibJNIWrapper.on_release_keys();

        /*
        switch (lastMovement) {
            case 1:
                GameLibJNIWrapper.on_key_right(false);
                break;
            case 2:
                GameLibJNIWrapper.on_key_left(false);
                break;
            case 3:
                GameLibJNIWrapper.on_key_select(false);
                break;
        }
        lastMovement = 0;
*/
    }
/*
    public void setWidth(int width){
        this.width = width;
    }
    */

}
