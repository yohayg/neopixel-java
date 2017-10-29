package com.github.h0ru5.neopixel;


import static com.github.h0ru5.neopixel.ws2811_return_t.WS2811_SUCCESS;

public class NeopixelsImpl implements Neopixels {
    private final ws2811_t leds = new ws2811_t();
    private final ws2811_channel_t channelInUse;


    public NeopixelsImpl(int count, int pin, int freq_hz, int dma, int channel, boolean invert, short brightness, int stripType) {


//Initialize the channels to zero
        ws2811_channel_t channel_0 = rpi_ws281x.ws2811_channel_get(leds, 0);
        channel_0.setCount(0);
        channel_0.setInvert(0);
        channel_0.setGpionum(0);
        channel_0.setBrightness((short) 0);

        ws2811_channel_t channel_1 = rpi_ws281x.ws2811_channel_get(leds, 1);
        channel_1.setCount(0);
        channel_1.setInvert(0);
        channel_1.setGpionum(0);
        channel_1.setBrightness((short) 0);

//Initialize the channel in use
        channelInUse = rpi_ws281x.ws2811_channel_get(leds, channel);
        channelInUse.setCount(count);
        channelInUse.setInvert(invert ? 1 : 0);
        channelInUse.setGpionum(pin);
        channelInUse.setBrightness((short) brightness);
        channelInUse.setStrip_type(stripType);

        leds.setDmanum(dma);
        leds.setFreq(freq_hz);
        rpi_ws281x.ws2811_init(leds);

    }

    @Override
    protected void finalize() throws Throwable {
        if (leds != null) {
            rpi_ws281x.ws2811_fini(leds);
        }
        super.finalize();
    }

    @Override
    public void render() {
        final ws2811_return_t retval = rpi_ws281x.ws2811_render(leds);
        if (!retval.equals(WS2811_SUCCESS))
            throw new RuntimeException("Neopixels rendering exited with error " + retval);
    }

    @Override
    public void setColor(int num, NeoPixelColor color) {
        rpi_ws281x.ws2811_led_set(this.channelInUse, num, color.getValue());
        this.render();
    }

    @Override
    public int getCount() {
        return channelInUse.getCount();
    }

}
