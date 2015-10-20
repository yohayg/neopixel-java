package com.github.h0ru5.neopixel;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : rpi_ws281x\gpio.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class gpio_t extends Structure {
	/**
	 * GPIO Function Select<br>
	 * C type : uint32_t[6]
	 */
	public int[] fsel = new int[6];
	public int resvd_0x18;
	/**
	 * GPIO Pin Output Set<br>
	 * C type : uint32_t[2]
	 */
	public int[] set = new int[2];
	public int resvd_0x24;
	/**
	 * GPIO Pin Output Clear<br>
	 * C type : uint32_t[2]
	 */
	public int[] clr = new int[2];
	public int resvd_0x30;
	/**
	 * GPIO Pin Level<br>
	 * C type : uint32_t[2]
	 */
	public int[] lev = new int[2];
	public int resvd_0x3c;
	/**
	 * GPIO Pin Event Detect Status<br>
	 * C type : uint32_t[2]
	 */
	public int[] eds = new int[2];
	public int resvd_0x48;
	/**
	 * GPIO Pin Rising Edge Detect Enable<br>
	 * C type : uint32_t[2]
	 */
	public int[] ren = new int[2];
	public int resvd_0x54;
	/**
	 * GPIO Pin Falling Edge Detect Enable<br>
	 * C type : uint32_t[2]
	 */
	public int[] fen = new int[2];
	public int resvd_0x60;
	/**
	 * GPIO Pin High Detect Enable<br>
	 * C type : uint32_t[2]
	 */
	public int[] hen = new int[2];
	public int resvd_0x6c;
	/**
	 * GPIO Pin Low Detect Enable<br>
	 * C type : uint32_t[2]
	 */
	public int[] len = new int[2];
	public int resvd_0x78;
	/**
	 * GPIO Pin Async Rising Edge Detect<br>
	 * C type : uint32_t[2]
	 */
	public int[] aren = new int[2];
	public int resvd_0x84;
	/**
	 * GPIO Pin Async Falling Edge Detect<br>
	 * C type : uint32_t[2]
	 */
	public int[] afen = new int[2];
	public int resvd_0x90;
	/** GPIO Pin Pull up/down Enable */
	public int pud;
	/**
	 * GPIO Pin Pull up/down Enable Clock<br>
	 * C type : uint32_t[2]
	 */
	public int[] pudclk = new int[2];
	/** C type : uint32_t[4] */
	public int[] resvd_0xa0 = new int[4];
	public int test;
	public gpio_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("fsel", "resvd_0x18", "set", "resvd_0x24", "clr", "resvd_0x30", "lev", "resvd_0x3c", "eds", "resvd_0x48", "ren", "resvd_0x54", "fen", "resvd_0x60", "hen", "resvd_0x6c", "len", "resvd_0x78", "aren", "resvd_0x84", "afen", "resvd_0x90", "pud", "pudclk", "resvd_0xa0", "test");
	}
	public static class ByReference extends gpio_t implements Structure.ByReference {
		
	};
	public static class ByValue extends gpio_t implements Structure.ByValue {
		
	};
}