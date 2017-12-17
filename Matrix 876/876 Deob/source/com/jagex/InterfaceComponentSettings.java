/* Class523_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class InterfaceComponentSettings extends Class523 {
	public static final int anInt10445 = 8;
	public static final int anInt10446 = 2;
	public static final int anInt10447 = 32;
	public static final int anInt10448 = 4;
	public static final int anInt10449 = 16;
	public int settings;
	public static final int anInt10451 = 64;
	static InterfaceComponentSettings aClass523_Sub13_10452 = new InterfaceComponentSettings(0, -1);
	public static final int anInt10453 = 1;
	public int anInt10454;

	public final int method15964(int i) {
		return Class503_Sub1.method15791(747608249 * settings, 622114455);
	}

	public final boolean method15966(int i, int i_0_) {
		return (settings * 747608249 >> 1 + i & 0x1) != 0;
	}

	public final boolean method15967(byte i) {
		return (settings * 747608249 >> 23 & 0x1) != 0;
	}

	public final int method15968(int i) {
		return settings * 747608249 >> 18 & 0x7;
	}

	public final boolean method15969(int i) {
		return (settings * 747608249 >> 21 & 0x1) != 0;
	}

	public final boolean method15970(int i) {
		return (747608249 * settings >> 22 & 0x1) != 0;
	}

	public InterfaceComponentSettings(int settings, int i_1_) {
		this.settings = settings * -1025184375;
		anInt10454 = 355680405 * i_1_;
	}

	public final boolean method15971() {
		return (settings * 747608249 >> 23 & 0x1) != 0;
	}

	public final boolean method15972() {
		return (settings * 747608249 & 0x1) != 0;
	}

	public final boolean method15973(int i) {
		return (settings * 747608249 >> 1 + i & 0x1) != 0;
	}

	public final boolean method15974(int i) {
		return (settings * 747608249 >> 1 + i & 0x1) != 0;
	}

	public final boolean method15979(int i) {
		return (settings * 747608249 & 0x1) != 0;
	}

	static void method15984(InterfaceComponentDefinitions class250, int i, int i_2_, int i_3_) {
		Class36.aClass250_322 = class250;
		Class36.anInt344 = i * -1639381475;
		Class36.anInt345 = i_2_ * -924580533;
	}
}
