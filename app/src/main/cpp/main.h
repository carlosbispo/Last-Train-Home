#include <GLES2/gl2.h>

void start();
void step();
void changed();
void on_surface_created();
void on_surface_changed(int width, int height);
void on_draw_frame();
void on_key_right(bool state);
void on_key_left(bool state);
void on_key_select(bool state);
void release_keys();
void set_scale(float scale_x, float scale_y);
