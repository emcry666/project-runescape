/* Class523_Sub27_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523_Sub27_Sub18 extends Class523_Sub27 {
	Class24 aClass24_11838;
	String[] aStringArray11839;
	int[] anIntArray11840;
	int[][] anIntArrayArray11841;
	public boolean aBool11842 = true;
	public int[] anIntArray11843;

	public String method18244() {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (aStringArray11839 == null)
			return "";
		stringbuilder.append(aStringArray11839[0]);
		for (int i = 1; i < aStringArray11839.length; i++) {
			for (int i_0_ = 0; i_0_ < 3; i_0_++)
				stringbuilder.append('.');
			stringbuilder.append(aStringArray11839[i]);
		}
		return stringbuilder.toString();
	}

	void method18245(Class523_Sub34 class523_sub34, int i, byte i_1_) {
		if (1 == i)
			aStringArray11839 = Class194_Sub13.method15512(class523_sub34.readString(599504757), '<', (byte) -23);
		else if (2 == i) {
			int i_2_ = class523_sub34.readUnsignedByte(1128153505);
			anIntArray11843 = new int[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
				anIntArray11843[i_3_] = class523_sub34.readUnsignedShort(-2141308250);
		} else if (3 == i) {
			int i_4_ = class523_sub34.readUnsignedByte(1515815961);
			anIntArray11840 = new int[i_4_];
			anIntArrayArray11841 = new int[i_4_][];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				int i_6_ = class523_sub34.readUnsignedShort(-1876143958);
				Class636 class636 = Class471.method7638(i_6_, -1079039757);
				if (class636 != null) {
					anIntArray11840[i_5_] = i_6_;
					anIntArrayArray11841[i_5_] = new int[class636.anInt8299 * 868797487];
					for (int i_7_ = 0; i_7_ < 868797487 * class636.anInt8299; i_7_++)
						anIntArrayArray11841[i_5_][i_7_] = class523_sub34.readUnsignedShort(-1560037237);
				}
			}
		} else if (4 == i)
			aBool11842 = false;
	}

	public int method18246(int i, int i_8_, byte i_9_) {
		if (anIntArray11840 == null || i < 0 || i > anIntArray11840.length)
			return -1;
		if (anIntArrayArray11841[i] == null || i_8_ < 0 || i_8_ > anIntArrayArray11841[i].length)
			return -1;
		return anIntArrayArray11841[i][i_8_];
	}

	public int method18247() {
		if (null == anIntArray11840)
			return 0;
		return anIntArray11840.length;
	}

	public String method18248(Class523_Sub34 class523_sub34, int i) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (anIntArray11840 != null) {
			for (int i_10_ = 0; i_10_ < anIntArray11840.length; i_10_++) {
				stringbuilder.append(aStringArray11839[i_10_]);
				stringbuilder.append(aClass24_11838.method837(method18266(i_10_, (short) -3228), anIntArrayArray11841[i_10_], class523_sub34.method16267((Class471.method7638(anIntArray11840[i_10_], -2094588323).anInt8292) * 335133729, 1925965260)));
			}
		}
		stringbuilder.append(aStringArray11839[aStringArray11839.length - 1]);
		return stringbuilder.toString();
	}

	public String method18249(int i) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (aStringArray11839 == null)
			return "";
		stringbuilder.append(aStringArray11839[0]);
		for (int i_11_ = 1; i_11_ < aStringArray11839.length; i_11_++) {
			for (int i_12_ = 0; i_12_ < 3; i_12_++)
				stringbuilder.append('.');
			stringbuilder.append(aStringArray11839[i_11_]);
		}
		return stringbuilder.toString();
	}

	public int method18250(short i) {
		if (null == anIntArray11840)
			return 0;
		return anIntArray11840.length;
	}

	void method18251(Class523_Sub34 class523_sub34, int i) {
		if (1 == i)
			aStringArray11839 = Class194_Sub13.method15512(class523_sub34.readString(-1660134221), '<', (byte) 12);
		else if (2 == i) {
			int i_13_ = class523_sub34.readUnsignedByte(1898225848);
			anIntArray11843 = new int[i_13_];
			for (int i_14_ = 0; i_14_ < i_13_; i_14_++)
				anIntArray11843[i_14_] = class523_sub34.readUnsignedShort(-2093678900);
		} else if (3 == i) {
			int i_15_ = class523_sub34.readUnsignedByte(190873271);
			anIntArray11840 = new int[i_15_];
			anIntArrayArray11841 = new int[i_15_][];
			for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
				int i_17_ = class523_sub34.readUnsignedShort(-497575169);
				Class636 class636 = Class471.method7638(i_17_, -2056848557);
				if (class636 != null) {
					anIntArray11840[i_16_] = i_17_;
					anIntArrayArray11841[i_16_] = new int[class636.anInt8299 * 868797487];
					for (int i_18_ = 0; i_18_ < 868797487 * class636.anInt8299; i_18_++)
						anIntArrayArray11841[i_16_][i_18_] = class523_sub34.readUnsignedShort(-142347035);
				}
			}
		} else if (4 == i)
			aBool11842 = false;
	}

	public void method18252(Class523_Sub34 class523_sub34, int[] is, byte i) {
		if (anIntArray11840 != null) {
			for (int i_19_ = 0; i_19_ < anIntArray11840.length && i_19_ < is.length; i_19_++) {
				int i_20_ = (method18266(i_19_, (short) -14725).anInt8297 * 1611468749);
				if (i_20_ > 0)
					class523_sub34.method16269((long) is[i_19_], i_20_, (byte) -23);
			}
		}
	}

	public String method18253() {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (aStringArray11839 == null)
			return "";
		stringbuilder.append(aStringArray11839[0]);
		for (int i = 1; i < aStringArray11839.length; i++) {
			for (int i_21_ = 0; i_21_ < 3; i_21_++)
				stringbuilder.append('.');
			stringbuilder.append(aStringArray11839[i]);
		}
		return stringbuilder.toString();
	}

	void method18254(Class523_Sub34 class523_sub34, int i) {
		if (1 == i)
			aStringArray11839 = Class194_Sub13.method15512(class523_sub34.readString(273811876), '<', (byte) 26);
		else if (2 == i) {
			int i_22_ = class523_sub34.readUnsignedByte(-1913152901);
			anIntArray11843 = new int[i_22_];
			for (int i_23_ = 0; i_23_ < i_22_; i_23_++)
				anIntArray11843[i_23_] = class523_sub34.readUnsignedShort(-1556610824);
		} else if (3 == i) {
			int i_24_ = class523_sub34.readUnsignedByte(-1370884270);
			anIntArray11840 = new int[i_24_];
			anIntArrayArray11841 = new int[i_24_][];
			for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
				int i_26_ = class523_sub34.readUnsignedShort(-1668394691);
				Class636 class636 = Class471.method7638(i_26_, -1143875070);
				if (class636 != null) {
					anIntArray11840[i_25_] = i_26_;
					anIntArrayArray11841[i_25_] = new int[class636.anInt8299 * 868797487];
					for (int i_27_ = 0; i_27_ < 868797487 * class636.anInt8299; i_27_++)
						anIntArrayArray11841[i_25_][i_27_] = class523_sub34.readUnsignedShort(-2030621322);
				}
			}
		} else if (4 == i)
			aBool11842 = false;
	}

	void method18255(int i) {
		if (anIntArray11843 != null) {
			for (int i_28_ = 0; i_28_ < anIntArray11843.length; i_28_++)
				anIntArray11843[i_28_] |= 0x8000;
		}
	}

	public Class636 method18256(int i) {
		if (null == anIntArray11840 || i < 0 || i > anIntArray11840.length)
			return null;
		return Class471.method7638(anIntArray11840[i], -1864679191);
	}

	public void method18257(Class523_Sub34 class523_sub34, int[] is) {
		if (anIntArray11840 != null) {
			for (int i = 0; i < anIntArray11840.length && i < is.length; i++) {
				int i_29_ = method18266(i, (short) 15207).anInt8297 * 1611468749;
				if (i_29_ > 0)
					class523_sub34.method16269((long) is[i], i_29_, (byte) -93);
			}
		}
	}

	public String method18258(Class523_Sub34 class523_sub34) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (anIntArray11840 != null) {
			for (int i = 0; i < anIntArray11840.length; i++) {
				stringbuilder.append(aStringArray11839[i]);
				stringbuilder.append(aClass24_11838.method837(method18266(i, (short) -6929), anIntArrayArray11841[i], class523_sub34.method16267((Class471.method7638(anIntArray11840[i], -1593604464).anInt8292) * 335133729, 1925965260)));
			}
		}
		stringbuilder.append(aStringArray11839[aStringArray11839.length - 1]);
		return stringbuilder.toString();
	}

	public String method18259(Class523_Sub34 class523_sub34) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (anIntArray11840 != null) {
			for (int i = 0; i < anIntArray11840.length; i++) {
				stringbuilder.append(aStringArray11839[i]);
				stringbuilder.append(aClass24_11838.method837(method18266(i, (short) -4987), anIntArrayArray11841[i], class523_sub34.method16267((Class471.method7638(anIntArray11840[i], -1934111365).anInt8292) * 335133729, 1925965260)));
			}
		}
		stringbuilder.append(aStringArray11839[aStringArray11839.length - 1]);
		return stringbuilder.toString();
	}

	public String method18260(Class523_Sub34 class523_sub34) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (anIntArray11840 != null) {
			for (int i = 0; i < anIntArray11840.length; i++) {
				stringbuilder.append(aStringArray11839[i]);
				stringbuilder.append(aClass24_11838.method837(method18266(i, (short) -4045), anIntArrayArray11841[i], class523_sub34.method16267((Class471.method7638(anIntArray11840[i], -1681809521).anInt8292) * 335133729, 1925965260)));
			}
		}
		stringbuilder.append(aStringArray11839[aStringArray11839.length - 1]);
		return stringbuilder.toString();
	}

	public int method18261() {
		if (null == anIntArray11840)
			return 0;
		return anIntArray11840.length;
	}

	public int method18262() {
		if (null == anIntArray11840)
			return 0;
		return anIntArray11840.length;
	}

	public String method18263() {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (aStringArray11839 == null)
			return "";
		stringbuilder.append(aStringArray11839[0]);
		for (int i = 1; i < aStringArray11839.length; i++) {
			for (int i_30_ = 0; i_30_ < 3; i_30_++)
				stringbuilder.append('.');
			stringbuilder.append(aStringArray11839[i]);
		}
		return stringbuilder.toString();
	}

	public int method18264() {
		if (null == anIntArray11840)
			return 0;
		return anIntArray11840.length;
	}

	void method18265(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_31_ = class523_sub34.readUnsignedByte(-412849120);
			if (0 == i_31_)
				break;
			method18245(class523_sub34, i_31_, (byte) 45);
		}
	}

	public Class636 method18266(int i, short i_32_) {
		if (null == anIntArray11840 || i < 0 || i > anIntArray11840.length)
			return null;
		return Class471.method7638(anIntArray11840[i], -1070596303);
	}

	public int method18267() {
		if (null == anIntArray11840)
			return 0;
		return anIntArray11840.length;
	}

	Class523_Sub27_Sub18() {
		/* empty */
	}

	public Class636 method18268(int i) {
		if (null == anIntArray11840 || i < 0 || i > anIntArray11840.length)
			return null;
		return Class471.method7638(anIntArray11840[i], -1319546836);
	}

	void method18269(Class523_Sub34 class523_sub34, int i) {
		if (1 == i)
			aStringArray11839 = Class194_Sub13.method15512(class523_sub34.readString(-969163982), '<', (byte) 56);
		else if (2 == i) {
			int i_33_ = class523_sub34.readUnsignedByte(939050743);
			anIntArray11843 = new int[i_33_];
			for (int i_34_ = 0; i_34_ < i_33_; i_34_++)
				anIntArray11843[i_34_] = class523_sub34.readUnsignedShort(-1853729459);
		} else if (3 == i) {
			int i_35_ = class523_sub34.readUnsignedByte(283013145);
			anIntArray11840 = new int[i_35_];
			anIntArrayArray11841 = new int[i_35_][];
			for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
				int i_37_ = class523_sub34.readUnsignedShort(-1461190600);
				Class636 class636 = Class471.method7638(i_37_, -1317494390);
				if (class636 != null) {
					anIntArray11840[i_36_] = i_37_;
					anIntArrayArray11841[i_36_] = new int[class636.anInt8299 * 868797487];
					for (int i_38_ = 0; i_38_ < 868797487 * class636.anInt8299; i_38_++)
						anIntArrayArray11841[i_36_][i_38_] = class523_sub34.readUnsignedShort(-659914494);
				}
			}
		} else if (4 == i)
			aBool11842 = false;
	}

	public int method18270(int i, int i_39_) {
		if (anIntArray11840 == null || i < 0 || i > anIntArray11840.length)
			return -1;
		if (anIntArrayArray11841[i] == null || i_39_ < 0 || i_39_ > anIntArrayArray11841[i].length)
			return -1;
		return anIntArrayArray11841[i][i_39_];
	}

	public int method18271(int i, int i_40_) {
		if (anIntArray11840 == null || i < 0 || i > anIntArray11840.length)
			return -1;
		if (anIntArrayArray11841[i] == null || i_40_ < 0 || i_40_ > anIntArrayArray11841[i].length)
			return -1;
		return anIntArrayArray11841[i][i_40_];
	}

	void method18272() {
		if (anIntArray11843 != null) {
			for (int i = 0; i < anIntArray11843.length; i++)
				anIntArray11843[i] |= 0x8000;
		}
	}
}
