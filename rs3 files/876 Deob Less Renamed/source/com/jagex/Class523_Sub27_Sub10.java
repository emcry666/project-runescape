/* Class523_Sub27_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523_Sub27_Sub10 extends Class523_Sub27 {
	public char[] aCharArray11723;
	public int[] anIntArray11724;
	public char[] aCharArray11725;
	public String aString11726;
	public int[] anIntArray11727;

	public int method18091(char c, byte i) {
		if (null == anIntArray11727)
			return -1;
		for (int i_0_ = 0; i_0_ < anIntArray11727.length; i_0_++) {
			if (aCharArray11725[i_0_] == c)
				return anIntArray11727[i_0_];
		}
		return -1;
	}

	void method18092(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_1_ = class523_sub34.readUnsignedByte(1528691896);
			if (i_1_ == 0)
				break;
			method18096(class523_sub34, i_1_, (byte) 1);
		}
	}

	public int method18093(char c) {
		if (null == anIntArray11724)
			return -1;
		for (int i = 0; i < anIntArray11724.length; i++) {
			if (c == aCharArray11723[i])
				return anIntArray11724[i];
		}
		return -1;
	}

	public int method18094(char c) {
		if (null == anIntArray11724)
			return -1;
		for (int i = 0; i < anIntArray11724.length; i++) {
			if (c == aCharArray11723[i])
				return anIntArray11724[i];
		}
		return -1;
	}

	public int method18095(char c, byte i) {
		if (null == anIntArray11724)
			return -1;
		for (int i_2_ = 0; i_2_ < anIntArray11724.length; i_2_++) {
			if (c == aCharArray11723[i_2_])
				return anIntArray11724[i_2_];
		}
		return -1;
	}

	void method18096(Class523_Sub34 class523_sub34, int i, byte i_3_) {
		do {
			if (i == 1)
				aString11726 = class523_sub34.readString(416307392);
			else if (i == 2) {
				int i_4_ = class523_sub34.readUnsignedByte(-1878718147);
				anIntArray11727 = new int[i_4_];
				aCharArray11725 = new char[i_4_];
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					anIntArray11727[i_5_] = class523_sub34.readUnsignedShort(-1631044469);
					byte i_6_ = class523_sub34.readByte((short) -21650);
					aCharArray11725[i_5_] = 0 == i_6_ ? '\0' : Class676.method13768(i_6_, (byte) -37);
				}
			} else if (3 == i) {
				int i_7_ = class523_sub34.readUnsignedByte(-1321797453);
				anIntArray11724 = new int[i_7_];
				aCharArray11723 = new char[i_7_];
				for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
					anIntArray11724[i_8_] = class523_sub34.readUnsignedShort(-594340207);
					byte i_9_ = class523_sub34.readByte((short) -7478);
					aCharArray11723[i_8_] = 0 == i_9_ ? '\0' : Class676.method13768(i_9_, (byte) -83);
				}
			} else if (4 == i)
				break;
		} while (false);
	}

	void method18097(Class523_Sub34 class523_sub34, int i) {
		do {
			if (i == 1)
				aString11726 = class523_sub34.readString(-1712213936);
			else if (i == 2) {
				int i_10_ = class523_sub34.readUnsignedByte(-293259025);
				anIntArray11727 = new int[i_10_];
				aCharArray11725 = new char[i_10_];
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
					anIntArray11727[i_11_] = class523_sub34.readUnsignedShort(-388216040);
					byte i_12_ = class523_sub34.readByte((short) -23392);
					aCharArray11725[i_11_] = 0 == i_12_ ? '\0' : Class676.method13768(i_12_, (byte) -48);
				}
			} else if (3 == i) {
				int i_13_ = class523_sub34.readUnsignedByte(41713576);
				anIntArray11724 = new int[i_13_];
				aCharArray11723 = new char[i_13_];
				for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
					anIntArray11724[i_14_] = class523_sub34.readUnsignedShort(-578895790);
					byte i_15_ = class523_sub34.readByte((short) -13439);
					aCharArray11723[i_14_] = 0 == i_15_ ? '\0' : Class676.method13768(i_15_, (byte) -83);
				}
			} else if (4 == i)
				break;
		} while (false);
	}

	void method18098(int i) {
		if (anIntArray11724 != null) {
			for (int i_16_ = 0; i_16_ < anIntArray11724.length; i_16_++)
				anIntArray11724[i_16_] |= 0x8000;
		}
		if (null != anIntArray11727) {
			for (int i_17_ = 0; i_17_ < anIntArray11727.length; i_17_++)
				anIntArray11727[i_17_] |= 0x8000;
		}
	}

	void method18099(Class523_Sub34 class523_sub34, int i) {
		do {
			if (i == 1)
				aString11726 = class523_sub34.readString(-376490812);
			else if (i == 2) {
				int i_18_ = class523_sub34.readUnsignedByte(-335828532);
				anIntArray11727 = new int[i_18_];
				aCharArray11725 = new char[i_18_];
				for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
					anIntArray11727[i_19_] = class523_sub34.readUnsignedShort(-1999857489);
					byte i_20_ = class523_sub34.readByte((short) -6581);
					aCharArray11725[i_19_] = 0 == i_20_ ? '\0' : Class676.method13768(i_20_, (byte) -27);
				}
			} else if (3 == i) {
				int i_21_ = class523_sub34.readUnsignedByte(-1726870731);
				anIntArray11724 = new int[i_21_];
				aCharArray11723 = new char[i_21_];
				for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
					anIntArray11724[i_22_] = class523_sub34.readUnsignedShort(-560350454);
					byte i_23_ = class523_sub34.readByte((short) -7685);
					aCharArray11723[i_22_] = 0 == i_23_ ? '\0' : Class676.method13768(i_23_, (byte) -31);
				}
			} else if (4 == i)
				break;
		} while (false);
	}

	void method18100(Class523_Sub34 class523_sub34, int i) {
		do {
			if (i == 1)
				aString11726 = class523_sub34.readString(281968789);
			else if (i == 2) {
				int i_24_ = class523_sub34.readUnsignedByte(-74827390);
				anIntArray11727 = new int[i_24_];
				aCharArray11725 = new char[i_24_];
				for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
					anIntArray11727[i_25_] = class523_sub34.readUnsignedShort(-2025525810);
					byte i_26_ = class523_sub34.readByte((short) -27015);
					aCharArray11725[i_25_] = 0 == i_26_ ? '\0' : Class676.method13768(i_26_, (byte) -73);
				}
			} else if (3 == i) {
				int i_27_ = class523_sub34.readUnsignedByte(1626118301);
				anIntArray11724 = new int[i_27_];
				aCharArray11723 = new char[i_27_];
				for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
					anIntArray11724[i_28_] = class523_sub34.readUnsignedShort(-712512517);
					byte i_29_ = class523_sub34.readByte((short) -2062);
					aCharArray11723[i_28_] = 0 == i_29_ ? '\0' : Class676.method13768(i_29_, (byte) -40);
				}
			} else if (4 == i)
				break;
		} while (false);
	}

	public int method18101(char c) {
		if (null == anIntArray11727)
			return -1;
		for (int i = 0; i < anIntArray11727.length; i++) {
			if (aCharArray11725[i] == c)
				return anIntArray11727[i];
		}
		return -1;
	}

	Class523_Sub27_Sub10() {
		/* empty */
	}

	void method18102(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1769412646);
			if (i == 0)
				break;
			method18096(class523_sub34, i, (byte) 1);
		}
	}

	void method18103() {
		if (anIntArray11724 != null) {
			for (int i = 0; i < anIntArray11724.length; i++)
				anIntArray11724[i] |= 0x8000;
		}
		if (null != anIntArray11727) {
			for (int i = 0; i < anIntArray11727.length; i++)
				anIntArray11727[i] |= 0x8000;
		}
	}

	static void method18104(int i) {
		Class54.aClass62_729 = Class62.aClass62_771;
		Class54.aClass711_730 = Class711.aClass711_8843;
		Class54.aClass704_728 = Class704.aClass704_8798;
		Class194_Sub4.aClass699_9895 = Class699.aClass699_8769;
		Class523_Sub27_Sub2.aClass700_11334 = Class700.aClass700_8778;
		Class687_Sub6.aClass691_10838 = Class691.aClass691_8695;
		Class54.aString725 = null;
	}
}
