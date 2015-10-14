package com.github.h0ru5.neopixel;

public class rpi_ws281x implements rpi_ws281xConstants {
    public static int ws2811_init(ws2811_t ws2811) {
        return rpi_ws281xJNI.ws2811_init(ws2811_t.getCPtr(ws2811), ws2811);
    }

    public static void ws2811_fini(ws2811_t ws2811) {
        rpi_ws281xJNI.ws2811_fini(ws2811_t.getCPtr(ws2811), ws2811);
    }

    public static int ws2811_render(ws2811_t ws2811) {
        return rpi_ws281xJNI.ws2811_render(ws2811_t.getCPtr(ws2811), ws2811);
    }

    public static int ws2811_wait(ws2811_t ws2811) {
        return rpi_ws281xJNI.ws2811_wait(ws2811_t.getCPtr(ws2811), ws2811);
    }

    public static long ws2811_led_get(ws2811_channel_t channel, int lednum) {
        return rpi_ws281xJNI.ws2811_led_get(ws2811_channel_t.getCPtr(channel), channel, lednum);
    }

    public static int ws2811_led_set(ws2811_channel_t channel, int lednum, long color) {
        return rpi_ws281xJNI.ws2811_led_set(ws2811_channel_t.getCPtr(channel), channel, lednum, color);
    }

    public static ws2811_channel_t ws2811_channel_get(ws2811_t ws, int channelnum) {
        long cPtr = rpi_ws281xJNI.ws2811_channel_get(ws2811_t.getCPtr(ws), ws, channelnum);
        return (cPtr == 0) ? null : new ws2811_channel_t(cPtr, false);
    }

}
