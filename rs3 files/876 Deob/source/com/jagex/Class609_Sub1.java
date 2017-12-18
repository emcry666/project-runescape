/* Class609_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class609_Sub1 extends Class609 implements Interface5 {
	Class472 aClass472_10697;

	byte[] method10004(int i) {
		synchronized (aClass472_10697) {
			byte[] is = aClass472_10697.method7688(i, 0, -953602220);
			return is;
		}
	}

	public Class method49(int i) {
		return com.jagex.Class602.class;
	}

	Class609_Sub1(boolean bool, Class472 class472, Class668 class668, Class681 class681) {
		super(bool, class668, class681);
		aClass472_10697 = class472;
	}

	byte[] method9995(int i, int i_0_) {
		synchronized (aClass472_10697) {
			byte[] is = aClass472_10697.method7688(i, 0, -1454256406);
			return is;
		}
	}

	boolean method9996(int i, byte i_1_) {
		synchronized (aClass472_10697) {
			boolean bool = aClass472_10697.method7663(i, 0, 1089230115);
			return bool;
		}
	}

	public Interface13 method50(int i, Interface12 interface12) {
		return new Class602(i, this, interface12);
	}

	public Class method47() {
		return com.jagex.Class602.class;
	}

	public Interface13 method48(int i, Interface12 interface12, int i_2_) {
		return new Class602(i, this, interface12);
	}

	boolean method10007(int i) {
		synchronized (aClass472_10697) {
			boolean bool = aClass472_10697.method7663(i, 0, 1089230115);
			return bool;
		}
	}

	static void method16541(Class669 class669, int i) {
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		TwitchWebcamDevice twitchwebcamdevice = Class447.method7244(i_3_, 875589638);
		if (twitchwebcamdevice == null) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		} else {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -2015039365 * twitchwebcamdevice.anInt1136;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = twitchwebcamdevice.aString1134;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = twitchwebcamdevice.aString1135;
		}
	}

	static final void method16542(Class669 class669, int i) {
		throw new RuntimeException("");
	}
}
