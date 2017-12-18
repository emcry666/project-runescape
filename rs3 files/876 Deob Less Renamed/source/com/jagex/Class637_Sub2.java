/* Class637_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class637_Sub2 extends Class637 {
	boolean method10452(byte i) {
		return (method16849((byte) 0) != null || (aLong8305 * 5505102922195369039L < Class248.method4401(1516375036) - 2000L));
	}

	boolean method10463() {
		return (method16849((byte) -69) != null || (aLong8305 * 5505102922195369039L < Class248.method4401(1516375036) - 2000L));
	}

	Class523_Sub22 method10468() {
		return Class523_Sub18.method16042(OutgoingPacket.aClass408_4249, client.aClass116_11058.aClass11_1413, 1370050649);
	}

	Class523_Sub39 method16849(byte i) {
		return (Class523_Sub39) client.aClass708_11027.method14240(1374369204);
	}

	Class523_Sub22 method10460(int i) {
		return Class523_Sub18.method16042(OutgoingPacket.aClass408_4249, client.aClass116_11058.aClass11_1413, 1370050649);
	}

	void method10457(Class523_Sub34 class523_sub34, Class523_Sub39 class523_sub39, int i) {
		/* empty */
	}

	int method10470() {
		return 0;
	}

	void method10459() {
		Class523_Sub39 class523_sub39 = method16849((byte) -94);
		if (class523_sub39 != null) {
			int i = method10453(class523_sub39, 32767, 2107558492);
			int i_0_ = class523_sub39.method16520((byte) 127);
			if (i_0_ < 0)
				i_0_ = 0;
			else if (i_0_ > 65535)
				i_0_ = 65535;
			int i_1_ = class523_sub39.method16519(118972274);
			if (i_1_ < 0)
				i_1_ = 0;
			else if (i_1_ > 65535)
				i_1_ = 65535;
			int i_2_ = 0;
			if (class523_sub39.method16518(-1905499279) == 2)
				i_2_ = 1;
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4277, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(i | i_2_ << 15, (byte) 12);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV1(i_1_ | i_0_ << 16, (byte) 1);
			client.aClass116_11058.method1974(class523_sub22, (byte) 22);
		}
	}

	void method10476() {
		Class523_Sub39 class523_sub39 = method16849((byte) -66);
		if (class523_sub39 != null) {
			int i = method10453(class523_sub39, 32767, -181698868);
			int i_3_ = class523_sub39.method16520((byte) 127);
			if (i_3_ < 0)
				i_3_ = 0;
			else if (i_3_ > 65535)
				i_3_ = 65535;
			int i_4_ = class523_sub39.method16519(-1563200215);
			if (i_4_ < 0)
				i_4_ = 0;
			else if (i_4_ > 65535)
				i_4_ = 65535;
			int i_5_ = 0;
			if (class523_sub39.method16518(-1905499279) == 2)
				i_5_ = 1;
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4277, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(i | i_5_ << 15, (byte) 57);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV1(i_4_ | i_3_ << 16, (byte) 1);
			client.aClass116_11058.method1974(class523_sub22, (byte) 63);
		}
	}

	void method10472() {
		Class523_Sub39 class523_sub39 = method16849((byte) -86);
		if (class523_sub39 != null) {
			int i = method10453(class523_sub39, 32767, 451299594);
			int i_6_ = class523_sub39.method16520((byte) 127);
			if (i_6_ < 0)
				i_6_ = 0;
			else if (i_6_ > 65535)
				i_6_ = 65535;
			int i_7_ = class523_sub39.method16519(-2002417350);
			if (i_7_ < 0)
				i_7_ = 0;
			else if (i_7_ > 65535)
				i_7_ = 65535;
			int i_8_ = 0;
			if (class523_sub39.method16518(-1905499279) == 2)
				i_8_ = 1;
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4277, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(i | i_8_ << 15, (byte) 56);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV1(i_7_ | i_6_ << 16, (byte) 1);
			client.aClass116_11058.method1974(class523_sub22, (byte) 68);
		}
	}

	boolean method10458() {
		return (method16849((byte) -38) != null || (aLong8305 * 5505102922195369039L < Class248.method4401(1516375036) - 2000L));
	}

	Class637_Sub2() {
		/* empty */
	}

	boolean method10464() {
		return (method16849((byte) -75) != null || (aLong8305 * 5505102922195369039L < Class248.method4401(1516375036) - 2000L));
	}

	boolean method10465() {
		return (method16849((byte) -81) != null || (aLong8305 * 5505102922195369039L < Class248.method4401(1516375036) - 2000L));
	}

	boolean method10466() {
		return (method16849((byte) -52) != null || (aLong8305 * 5505102922195369039L < Class248.method4401(1516375036) - 2000L));
	}

	int method10461() {
		return 0;
	}

	Class523_Sub22 method10475() {
		return Class523_Sub18.method16042(OutgoingPacket.aClass408_4249, client.aClass116_11058.aClass11_1413, 1370050649);
	}

	int method10469() {
		return 0;
	}

	void method10449(Class523_Sub34 class523_sub34, Class523_Sub39 class523_sub39) {
		/* empty */
	}

	int method10454(int i) {
		return 0;
	}

	int method10471() {
		return 0;
	}

	void method10467(Class523_Sub34 class523_sub34, Class523_Sub39 class523_sub39) {
		/* empty */
	}

	void method10456(int i) {
		Class523_Sub39 class523_sub39 = method16849((byte) -8);
		if (class523_sub39 != null) {
			int i_9_ = method10453(class523_sub39, 32767, 1821396905);
			int i_10_ = class523_sub39.method16520((byte) 127);
			if (i_10_ < 0)
				i_10_ = 0;
			else if (i_10_ > 65535)
				i_10_ = 65535;
			int i_11_ = class523_sub39.method16519(-562022764);
			if (i_11_ < 0)
				i_11_ = 0;
			else if (i_11_ > 65535)
				i_11_ = 65535;
			int i_12_ = 0;
			if (class523_sub39.method16518(-1905499279) == 2)
				i_12_ = 1;
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4277, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(i_9_ | i_12_ << 15, (byte) 55);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV1(i_11_ | i_10_ << 16, (byte) 1);
			client.aClass116_11058.method1974(class523_sub22, (byte) 71);
		}
	}

	static final void method16850(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class647_Sub1_Sub3_Sub3.method18448(class250, class242, class669, -2057678155);
	}
}
