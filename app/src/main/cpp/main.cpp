#include "main.h"
#include "game.h"
void on_surface_created() {
    glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
    start();
}

void on_surface_changed(int width, int height) {
        float scale_x = (float)width / GAME_WIDTH;
        float scale_y = (float)height / GAME_HEIGHT;
        set_scale(scale_x, scale_y);
        //set_scale(4.7093749, 4.7093749);
        changed();
}

void on_draw_frame() {
    glClear(GL_COLOR_BUFFER_BIT);
    step();
}
