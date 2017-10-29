package com.github.h0ru5.neopixel;

/**
 * Created by mchn1210 on 20.10.2015.
 */
public interface Neopixels {

    void render();

    void setColor(int num, NeoPixelColor color);

    int getCount();
}
