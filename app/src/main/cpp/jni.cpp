#include "main.h"
#include "asset_utils/android_fopen.h"
#include <jni.h>

extern "C" JNIEXPORT void JNICALL Java_com_carlosbispo_lasttrainhome_GameLibJNIWrapper_on_1surface_1created
(JNIEnv * env, jclass cls) {
on_surface_created();
}

extern "C" JNIEXPORT void JNICALL Java_com_carlosbispo_lasttrainhome_GameLibJNIWrapper_on_1surface_1changed
(JNIEnv * env, jclass cls, jint width, jint height) {
on_surface_changed(width, height);
}

extern "C" JNIEXPORT void JNICALL Java_com_carlosbispo_lasttrainhome_GameLibJNIWrapper_on_1draw_1frame
(JNIEnv * env, jclass cls) {
on_draw_frame();
}

extern "C" JNIEXPORT void JNICALL Java_com_carlosbispo_lasttrainhome_GameLibJNIWrapper_start(JNIEnv *env, jclass clazz) {
    start();
}

extern "C" JNIEXPORT void JNICALL Java_com_carlosbispo_lasttrainhome_GameLibJNIWrapper_on_1key_1right(JNIEnv *env, jclass clazz,
                                                                        jboolean state) {
    on_key_right(state);
}

extern "C" JNIEXPORT void JNICALL Java_com_carlosbispo_lasttrainhome_GameLibJNIWrapper_on_1key_1left(JNIEnv *env, jclass clazz,
                                                                                                      jboolean state) {
    on_key_left(state);
}

extern "C" JNIEXPORT void JNICALL Java_com_carlosbispo_lasttrainhome_GameLibJNIWrapper_on_1key_1select(JNIEnv *env, jclass clazz,
                                                                                                     jboolean state) {
    on_key_select(state);
}

extern "C" JNIEXPORT void JNICALL Java_com_carlosbispo_lasttrainhome_GameLibJNIWrapper_on_1release_1keys(JNIEnv *env, jclass clazz) {
    release_keys();
}

extern "C" JNIEXPORT void JNICALL Java_com_carlosbispo_lasttrainhome_GameLibJNIWrapper_load(JNIEnv *env, jclass clazz, jobject assetManager) {
    android_fopen_set_asset_manager(AAssetManager_fromJava(env, assetManager));
}