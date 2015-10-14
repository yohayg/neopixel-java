package com.github.h0ru5.neopixel;

public class ws2811_channel_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected ws2811_channel_t(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    public ws2811_channel_t() {
        this(rpi_ws281xJNI.new_ws2811_channel_t(), true);
    }

    protected static long getCPtr(ws2811_channel_t obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                rpi_ws281xJNI.delete_ws2811_channel_t(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public int getGpionum() {
        return rpi_ws281xJNI.ws2811_channel_t_gpionum_get(swigCPtr, this);
    }

    public void setGpionum(int value) {
        rpi_ws281xJNI.ws2811_channel_t_gpionum_set(swigCPtr, this, value);
    }

    public int getInvert() {
        return rpi_ws281xJNI.ws2811_channel_t_invert_get(swigCPtr, this);
    }

    public void setInvert(int value) {
        rpi_ws281xJNI.ws2811_channel_t_invert_set(swigCPtr, this, value);
    }

    public int getCount() {
        return rpi_ws281xJNI.ws2811_channel_t_count_get(swigCPtr, this);
    }

    public void setCount(int value) {
        rpi_ws281xJNI.ws2811_channel_t_count_set(swigCPtr, this, value);
    }

    public int getBrightness() {
        return rpi_ws281xJNI.ws2811_channel_t_brightness_get(swigCPtr, this);
    }

    public void setBrightness(int value) {
        rpi_ws281xJNI.ws2811_channel_t_brightness_set(swigCPtr, this, value);
    }

    public SWIGTYPE_p_unsigned_int getLeds() {
        long cPtr = rpi_ws281xJNI.ws2811_channel_t_leds_get(swigCPtr, this);
        return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_int(cPtr, false);
    }

    public void setLeds(SWIGTYPE_p_unsigned_int value) {
        rpi_ws281xJNI.ws2811_channel_t_leds_set(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(value));
    }

}
