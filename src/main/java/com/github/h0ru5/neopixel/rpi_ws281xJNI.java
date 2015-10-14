package com.github.h0ru5.neopixel;

public class rpi_ws281xJNI {
    public final static native int WS2811_TARGET_FREQ_get();

    public final static native void ws2811_channel_t_gpionum_set(long jarg1, ws2811_channel_t jarg1_, int jarg2);

    public final static native int ws2811_channel_t_gpionum_get(long jarg1, ws2811_channel_t jarg1_);

    public final static native void ws2811_channel_t_invert_set(long jarg1, ws2811_channel_t jarg1_, int jarg2);

    public final static native int ws2811_channel_t_invert_get(long jarg1, ws2811_channel_t jarg1_);

    public final static native void ws2811_channel_t_count_set(long jarg1, ws2811_channel_t jarg1_, int jarg2);

    public final static native int ws2811_channel_t_count_get(long jarg1, ws2811_channel_t jarg1_);

    public final static native void ws2811_channel_t_brightness_set(long jarg1, ws2811_channel_t jarg1_, int jarg2);

    public final static native int ws2811_channel_t_brightness_get(long jarg1, ws2811_channel_t jarg1_);

    public final static native void ws2811_channel_t_leds_set(long jarg1, ws2811_channel_t jarg1_, long jarg2);

    public final static native long ws2811_channel_t_leds_get(long jarg1, ws2811_channel_t jarg1_);

    public final static native long new_ws2811_channel_t();

    public final static native void delete_ws2811_channel_t(long jarg1);

    public final static native void ws2811_t_device_set(long jarg1, ws2811_t jarg1_, long jarg2);

    public final static native long ws2811_t_device_get(long jarg1, ws2811_t jarg1_);

    public final static native void ws2811_t_freq_set(long jarg1, ws2811_t jarg1_, long jarg2);

    public final static native long ws2811_t_freq_get(long jarg1, ws2811_t jarg1_);

    public final static native void ws2811_t_dmanum_set(long jarg1, ws2811_t jarg1_, int jarg2);

    public final static native int ws2811_t_dmanum_get(long jarg1, ws2811_t jarg1_);

    public final static native void ws2811_t_channel_set(long jarg1, ws2811_t jarg1_, long jarg2, ws2811_channel_t jarg2_);

    public final static native long ws2811_t_channel_get(long jarg1, ws2811_t jarg1_);

    public final static native long new_ws2811_t();

    public final static native void delete_ws2811_t(long jarg1);

    public final static native int ws2811_init(long jarg1, ws2811_t jarg1_);

    public final static native void ws2811_fini(long jarg1, ws2811_t jarg1_);

    public final static native int ws2811_render(long jarg1, ws2811_t jarg1_);

    public final static native int ws2811_wait(long jarg1, ws2811_t jarg1_);

    public final static native long ws2811_led_get(long jarg1, ws2811_channel_t jarg1_, int jarg2);

    public final static native int ws2811_led_set(long jarg1, ws2811_channel_t jarg1_, int jarg2, long jarg3);

    public final static native long ws2811_channel_get(long jarg1, ws2811_t jarg1_, int jarg2);
}
