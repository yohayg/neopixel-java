package com.github.h0ru5.neopixel;


/**
 * Created by mchn1210 on 19.10.2015.
 */
public class DemoRunner {

    public static final NeoPixelColor COLOR1 = new NeoPixelColor(127, 0, 0, 0);
    public static final NeoPixelColor COLOR2 = new NeoPixelColor(0, 127, 0, 0);
    public static final NeoPixelColor COLOR3 = new NeoPixelColor(0, 0, 127, 0);
    public static final NeoPixelColor COLOR4 = new NeoPixelColor(0, 0, 0, 127);
    public static final NeoPixelColor COLOR5 = new NeoPixelColor(127, 127, 127, 0);
    public static final NeoPixelColor COLOR6 = new NeoPixelColor(127, 127, 127, 127);

    public static boolean run = true;

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                Thread.sleep(200);
                run = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
    }

    public static void main(String[] args) {

        System.loadLibrary("rpi_ws281x");


        Neopixels np = new NeopixelsImpl(12, 13, 800000, 5, 1, false, (short) 255, rpi_ws281xConstants.SK6812_STRIP_RGBW);

        while (run) {
            colorWipe(np, NeoPixelColor.RED);
            colorWipe(np, NeoPixelColor.GREEN);
            colorWipe(np, NeoPixelColor.BLUE);
            colorWipe(np, NeoPixelColor.WHITE);
            colorWipe(np, NeoPixelColor.COMPOSITE_WHITE);
            colorWipe(np, NeoPixelColor.COMPOSITE_WHITE_AND_WHITE_LED_WIPE);

            theaterChase(np, COLOR1);  //Red theater chase
            theaterChase(np, COLOR2);  //Green theater chase
            theaterChase(np, COLOR3);  //Blue theater chase
            theaterChase(np, COLOR4); //White theater chase
            theaterChase(np, COLOR5);  //Composite White theater chase
            theaterChase(np, COLOR6);  //Composite White +White theater chase
            rainbow(np);
            rainbowCycle(np);
            theaterChaseRainbow(np);
        }

        System.out.println("Shutting down ...");
    }


    public static void colorWipe(Neopixels np, NeoPixelColor color) {
        for (int i = 0; i < np.getCount(); i++) {
            try {
                np.setColor(i, color);
                np.render();
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void theaterChase(Neopixels np, NeoPixelColor color) {
        try {
            for (int j = 0; j < 10; j++) {
                for (int q = 0; q < 3; q++) {
                    for (int i = 0; i < np.getCount(); i += 3) {
                        np.setColor(i + q, color);
                    }
                    np.render();

                    Thread.sleep(50);

                    for (int i = 0; i < np.getCount(); i += 3) {
                        np.setColor(i + q, NeoPixelColor.CLEAR);
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void rainbow(Neopixels np) {
        //  """Draw rainbow that fades across all pixels at once."""
        try {
            for (int j = 0; j < 256 * 10; j++) {
                for (int i = 0; i < np.getCount(); i++) {
                    np.setColor(i, wheel((i + j) & 255));
                }
                np.render();
                Thread.sleep(20);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static NeoPixelColor wheel(int pos) {
        //"" "Generate rainbow colors across 0-255 positions." ""
        if (pos < 85) {
            return new NeoPixelColor(pos * 3, 255 - pos * 3, 0, 0);
        } else if (pos < 170) {
            pos -= 85;
            return new NeoPixelColor(255 - pos * 3, 0, pos * 3, 0);
        } else {
            pos -= 170;
            return new NeoPixelColor(0, pos * 3, 255 - pos * 3, 0);
        }
    }

    public static void rainbowCycle(Neopixels np) {
        try {
            //"" "Draw rainbow that uniformly distributes itself across all pixels." ""
            for (int j = 0; j < 256 * 5; j++) {
                for (int i = 0; i < np.getCount(); i++) {
                    np.setColor(i, wheel(((i * 256 / np.getCount()) + j) & 255));
                }
                np.render();

                Thread.sleep(50);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void theaterChaseRainbow(Neopixels np) {
        try {
            //"" "Draw rainbow that uniformly distributes itself across all pixels." ""
            for (int j = 0; j < 256; j++) {
                for (int q = 0; q < 3; q++) {
                    for (int i = 0; i < np.getCount(); i += 3) {
                        np.setColor(i + q, wheel((i + j) % 255));
                    }
                    np.render();
                    Thread.sleep(50);

                    for (int i = 0; i < np.getCount(); i += 3) {
                        np.setColor(i + q, NeoPixelColor.CLEAR);
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
