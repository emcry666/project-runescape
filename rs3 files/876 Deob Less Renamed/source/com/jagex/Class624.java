/* Class624 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class624 {
	public static final int anInt8111 = 3;
	public static final int anInt8112 = 0;
	public static final int anInt8113 = 2;
	public static final int anInt8114 = 3;
	public static final int anInt8115 = 0;
	public static final int anInt8116 = 1;
	public static final int anInt8117 = 2;
	public int anInt8118;
	public static final int anInt8119 = 4;
	public static final int anInt8120 = 5;
	public int anInt8121;
	static final int anInt8122 = 100;
	public int[][] anIntArrayArray8123 = new int[3][5];
	public static final int anInt8124 = 1;
	public int anInt8125;
	public int anInt8126;
	public int anInt8127;
	public int anInt8128;
	static final int anInt8129 = 3;
	public int anInt8130;
	public static Class53_Sub12 aClass53_Sub12_8131;

	void method10213(Class523_Sub34 class523_sub34, byte i) {
		for (;;) {
			int i_0_ = class523_sub34.readUnsignedByte(1682836318);
			if (i_0_ == 0)
				break;
			if (i_0_ == 1)
				anInt8118 = class523_sub34.readUnsignedInt((byte) -64) * 144145599;
			else if (i_0_ == 2)
				anInt8130 = class523_sub34.readUnsignedInt((byte) -12) * -1270374501;
			else if (3 == i_0_)
				anInt8125 = class523_sub34.readUnsignedInt((byte) -5) * 105245959;
			else if (4 == i_0_)
				anInt8126 = class523_sub34.readUnsignedByte(-1721142648) * 378969593;
			else if (5 == i_0_)
				anInt8127 = class523_sub34.readUnsignedByte(1039847424) * -198241665;
			else if (6 == i_0_)
				anInt8128 = class523_sub34.readUnsignedInt((byte) -54) * -553506261;
			else if (7 == i_0_)
				anInt8121 = class523_sub34.readUnsignedInt((byte) -34) * -1291800053;
			else if (i_0_ >= 100) {
				i_0_ -= 100;
				anIntArrayArray8123[i_0_ & (int) (Math.pow(2.0, 3.0) - 1.0)][i_0_ >> 3] = class523_sub34.readUnsignedShort(-1399883706);
			}
		}
	}

	void method10214(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-2134459874);
			if (i == 0)
				break;
			if (i == 1)
				anInt8118 = class523_sub34.readUnsignedInt((byte) -78) * 144145599;
			else if (i == 2)
				anInt8130 = class523_sub34.readUnsignedInt((byte) -106) * -1270374501;
			else if (3 == i)
				anInt8125 = class523_sub34.readUnsignedInt((byte) -57) * 105245959;
			else if (4 == i)
				anInt8126 = class523_sub34.readUnsignedByte(207028388) * 378969593;
			else if (5 == i)
				anInt8127 = class523_sub34.readUnsignedByte(241582360) * -198241665;
			else if (6 == i)
				anInt8128 = class523_sub34.readUnsignedInt((byte) -59) * -553506261;
			else if (7 == i)
				anInt8121 = class523_sub34.readUnsignedInt((byte) -74) * -1291800053;
			else if (i >= 100) {
				i -= 100;
				anIntArrayArray8123[i & (int) (Math.pow(2.0, 3.0) - 1.0)][i >> 3] = class523_sub34.readUnsignedShort(-635921104);
			}
		}
	}

	public Class624(Class472 class472) {
		byte[] is = class472.method7721((1325648699 * Class620.aClass620_8069.anInt8073), -387132909);
		if (null != is) {
			/* empty */
		}
		method10213(new Class523_Sub34(is), (byte) 16);
	}

	static final void method10215(Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (-1746920271 * client.rights != 0 || ((!client.aBool11160 || client.aBool11161) && !client.aBool11164)) {
			String string_1_ = string.toLowerCase();
			int i_2_ = 0;
			if (string_1_.startsWith(Class39.aClass39_534.method1124(Class668.aClass668_8548, (byte) -85))) {
				i_2_ = 0;
				string = string.substring(Class39.aClass39_534.method1124(Class668.aClass668_8548, (byte) -112).length());
			} else if (string_1_.startsWith(Class39.aClass39_535.method1124(Class668.aClass668_8548, (byte) -97))) {
				i_2_ = 1;
				string = string.substring(Class39.aClass39_535.method1124(Class668.aClass668_8548, (byte) -22).length());
			} else if (string_1_.startsWith(Class39.aClass39_536.method1124(Class668.aClass668_8548, (byte) -117))) {
				i_2_ = 2;
				string = string.substring(Class39.aClass39_536.method1124(Class668.aClass668_8548, (byte) -56).length());
			} else if (string_1_.startsWith(Class39.aClass39_537.method1124(Class668.aClass668_8548, (byte) -77))) {
				i_2_ = 3;
				string = string.substring(Class39.aClass39_537.method1124(Class668.aClass668_8548, (byte) -64).length());
			} else if (string_1_.startsWith(Class39.aClass39_405.method1124(Class668.aClass668_8548, (byte) -40))) {
				i_2_ = 4;
				string = string.substring(Class39.aClass39_405.method1124(Class668.aClass668_8548, (byte) -56).length());
			} else if (string_1_.startsWith(Class39.aClass39_550.method1124(Class668.aClass668_8548, (byte) -98))) {
				i_2_ = 5;
				string = string.substring(Class39.aClass39_550.method1124(Class668.aClass668_8548, (byte) -69).length());
			} else if (string_1_.startsWith(Class39.aClass39_540.method1124(Class668.aClass668_8548, (byte) -9))) {
				i_2_ = 6;
				string = string.substring(Class39.aClass39_540.method1124(Class668.aClass668_8548, (byte) -55).length());
			} else if (string_1_.startsWith(Class39.aClass39_541.method1124(Class668.aClass668_8548, (byte) -42))) {
				i_2_ = 7;
				string = string.substring(Class39.aClass39_541.method1124(Class668.aClass668_8548, (byte) -51).length());
			} else if (string_1_.startsWith(Class39.aClass39_524.method1124(Class668.aClass668_8548, (byte) -23))) {
				i_2_ = 8;
				string = string.substring(Class39.aClass39_524.method1124(Class668.aClass668_8548, (byte) -50).length());
			} else if (string_1_.startsWith(Class39.aClass39_401.method1124(Class668.aClass668_8548, (byte) -103))) {
				i_2_ = 9;
				string = string.substring(Class39.aClass39_401.method1124(Class668.aClass668_8548, (byte) -29).length());
			} else if (string_1_.startsWith(Class39.aClass39_377.method1124(Class668.aClass668_8548, (byte) -116))) {
				i_2_ = 10;
				string = string.substring(Class39.aClass39_377.method1124(Class668.aClass668_8548, (byte) -38).length());
			} else if (string_1_.startsWith(Class39.aClass39_496.method1124(Class668.aClass668_8548, (byte) -89))) {
				i_2_ = 11;
				string = string.substring(Class39.aClass39_496.method1124(Class668.aClass668_8548, (byte) -96).length());
			} else if (Class668.aClass668_8548 != Class53_Sub20.aClass668_10979) {
				if (string_1_.startsWith(Class39.aClass39_534.method1124(Class53_Sub20.aClass668_10979, (byte) -51))) {
					i_2_ = 0;
					string = string.substring(Class39.aClass39_534.method1124(Class53_Sub20.aClass668_10979, (byte) -110).length());
				} else if (string_1_.startsWith(Class39.aClass39_535.method1124(Class53_Sub20.aClass668_10979, (byte) -82))) {
					i_2_ = 1;
					string = string.substring(Class39.aClass39_535.method1124(Class53_Sub20.aClass668_10979, (byte) -42).length());
				} else if (string_1_.startsWith(Class39.aClass39_536.method1124(Class53_Sub20.aClass668_10979, (byte) -112))) {
					i_2_ = 2;
					string = string.substring(Class39.aClass39_536.method1124(Class53_Sub20.aClass668_10979, (byte) -103).length());
				} else if (string_1_.startsWith(Class39.aClass39_537.method1124(Class53_Sub20.aClass668_10979, (byte) -23))) {
					i_2_ = 3;
					string = string.substring(Class39.aClass39_537.method1124(Class53_Sub20.aClass668_10979, (byte) -128).length());
				} else if (string_1_.startsWith(Class39.aClass39_405.method1124(Class53_Sub20.aClass668_10979, (byte) -30))) {
					i_2_ = 4;
					string = string.substring(Class39.aClass39_405.method1124(Class53_Sub20.aClass668_10979, (byte) -106).length());
				} else if (string_1_.startsWith(Class39.aClass39_550.method1124(Class53_Sub20.aClass668_10979, (byte) -51))) {
					i_2_ = 5;
					string = string.substring(Class39.aClass39_550.method1124(Class53_Sub20.aClass668_10979, (byte) -45).length());
				} else if (string_1_.startsWith(Class39.aClass39_540.method1124(Class53_Sub20.aClass668_10979, (byte) -11))) {
					i_2_ = 6;
					string = string.substring(Class39.aClass39_540.method1124(Class53_Sub20.aClass668_10979, (byte) -67).length());
				} else if (string_1_.startsWith(Class39.aClass39_541.method1124(Class53_Sub20.aClass668_10979, (byte) -120))) {
					i_2_ = 7;
					string = string.substring(Class39.aClass39_541.method1124(Class53_Sub20.aClass668_10979, (byte) -116).length());
				} else if (string_1_.startsWith(Class39.aClass39_524.method1124(Class53_Sub20.aClass668_10979, (byte) -68))) {
					i_2_ = 8;
					string = string.substring(Class39.aClass39_524.method1124(Class53_Sub20.aClass668_10979, (byte) -40).length());
				} else if (string_1_.startsWith(Class39.aClass39_401.method1124(Class53_Sub20.aClass668_10979, (byte) -59))) {
					i_2_ = 9;
					string = string.substring(Class39.aClass39_401.method1124(Class53_Sub20.aClass668_10979, (byte) -12).length());
				} else if (string_1_.startsWith(Class39.aClass39_377.method1124(Class53_Sub20.aClass668_10979, (byte) -94))) {
					i_2_ = 10;
					string = string.substring(Class39.aClass39_377.method1124(Class53_Sub20.aClass668_10979, (byte) -114).length());
				} else if (string_1_.startsWith(Class39.aClass39_496.method1124(Class53_Sub20.aClass668_10979, (byte) -91))) {
					i_2_ = 11;
					string = string.substring(Class39.aClass39_496.method1124(Class53_Sub20.aClass668_10979, (byte) -6).length());
				}
			}
			string_1_ = string.toLowerCase();
			int i_3_ = 0;
			if (string_1_.startsWith(Class39.aClass39_546.method1124(Class668.aClass668_8548, (byte) -51))) {
				i_3_ = 1;
				string = string.substring(Class39.aClass39_546.method1124(Class668.aClass668_8548, (byte) -70).length());
			} else if (string_1_.startsWith(Class39.aClass39_522.method1124(Class668.aClass668_8548, (byte) -99))) {
				i_3_ = 2;
				string = string.substring(Class39.aClass39_522.method1124(Class668.aClass668_8548, (byte) -3).length());
			} else if (string_1_.startsWith(Class39.aClass39_548.method1124(Class668.aClass668_8548, (byte) -67))) {
				i_3_ = 3;
				string = string.substring(Class39.aClass39_548.method1124(Class668.aClass668_8548, (byte) -71).length());
			} else if (string_1_.startsWith(Class39.aClass39_549.method1124(Class668.aClass668_8548, (byte) -64))) {
				i_3_ = 4;
				string = string.substring(Class39.aClass39_549.method1124(Class668.aClass668_8548, (byte) -78).length());
			} else if (string_1_.startsWith(Class39.aClass39_497.method1124(Class668.aClass668_8548, (byte) -99))) {
				i_3_ = 5;
				string = string.substring(Class39.aClass39_497.method1124(Class668.aClass668_8548, (byte) -62).length());
			} else if (Class668.aClass668_8548 != Class53_Sub20.aClass668_10979) {
				if (string_1_.startsWith(Class39.aClass39_546.method1124(Class53_Sub20.aClass668_10979, (byte) -71))) {
					i_3_ = 1;
					string = string.substring(Class39.aClass39_546.method1124(Class53_Sub20.aClass668_10979, (byte) -67).length());
				} else if (string_1_.startsWith(Class39.aClass39_522.method1124(Class53_Sub20.aClass668_10979, (byte) -92))) {
					i_3_ = 2;
					string = string.substring(Class39.aClass39_522.method1124(Class53_Sub20.aClass668_10979, (byte) -102).length());
				} else if (string_1_.startsWith(Class39.aClass39_548.method1124(Class53_Sub20.aClass668_10979, (byte) -61))) {
					i_3_ = 3;
					string = string.substring(Class39.aClass39_548.method1124(Class53_Sub20.aClass668_10979, (byte) -62).length());
				} else if (string_1_.startsWith(Class39.aClass39_549.method1124(Class53_Sub20.aClass668_10979, (byte) -80))) {
					i_3_ = 4;
					string = string.substring(Class39.aClass39_549.method1124(Class53_Sub20.aClass668_10979, (byte) -81).length());
				} else if (string_1_.startsWith(Class39.aClass39_497.method1124(Class53_Sub20.aClass668_10979, (byte) -26))) {
					i_3_ = 5;
					string = string.substring(Class39.aClass39_497.method1124(Class53_Sub20.aClass668_10979, (byte) -56).length());
				}
			}
			Class116 class116 = Class537.method8941(-1581360660);
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4291, class116.aClass11_1413, 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(0, 1134636379);
			int i_4_ = (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(i_2_, -151464271);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(i_3_, -597876087);
			Class257.method4683(class523_sub22.aClass523_Sub34_Sub2_10525, string, (short) -5303);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16276((class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011) - i_4_, 1313557169);
			class116.method1974(class523_sub22, (byte) 63);
		}
	}

	static final void method10216(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class646.method10564(class250, class242, class669, 693132578);
	}
}
