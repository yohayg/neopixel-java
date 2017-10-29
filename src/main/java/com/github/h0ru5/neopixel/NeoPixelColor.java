package com.github.h0ru5.neopixel;

/**
 * Created by Johannes on 14.10.2015.
 */
public class NeoPixelColor {
    public static final NeoPixelColor CLEAR = new NeoPixelColor((byte) 0x0, (byte) 0x0, (byte) 0x0, (byte) 0x0);
    public static final NeoPixelColor RED = new NeoPixelColor((byte) 0xff, (byte) 0x0, (byte) 0x0, (byte) 0x0);
    public static final NeoPixelColor GREEN = new NeoPixelColor((byte) 0x0, (byte) 0xff, (byte) 0x0, (byte) 0x0);
    public static final NeoPixelColor BLUE = new NeoPixelColor((byte) 0x0, (byte) 0x0, (byte) 0xff, (byte) 0x0);
    public static final NeoPixelColor WHITE = new NeoPixelColor((byte) 0x0, (byte) 0x0, (byte) 0x0, (byte) 0xff);
    public static final NeoPixelColor COMPOSITE_WHITE = new NeoPixelColor((byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x0);
    public static final NeoPixelColor COMPOSITE_WHITE_AND_WHITE_LED_WIPE = new NeoPixelColor((byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff);
    public final byte red;
    public final byte green;
    public final byte blue;
    public final byte white;

    NeoPixelColor(byte red, byte green, byte blue, byte white) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.white = white;
    }

    public NeoPixelColor(int red, int green, int blue, int white) {
        this.red = (byte) red;
        this.green = (byte) green;
        this.blue = (byte) blue;
        this.white = (byte) white;
    }

    public long getValue() {
        return (white << 24) | (red << 16) | (green << 8) | blue;
    }
}
