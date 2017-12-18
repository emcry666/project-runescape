/* Class523_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class523_Sub4_Sub1 extends Class523_Sub4 {
	String aString11678;
	Class277 aClass277_11679;
	String aString11680;
	int anInt11681;
	Class277 aClass277_11682;

	public Class277 method18063() {
		return aClass277_11682;
	}

	public abstract boolean method18064(int i);

	public int method18065(int i) {
		if (Class277.aClass277_2950 != aClass277_11679)
			throw new IllegalArgumentException_Sub1(this, aClass277_11679.toString().toLowerCase());
		return 2052037267 * anInt11681;
	}

	String method18066(int i) {
		return aString11678;
	}

	public Class277 method18067(int i) {
		return aClass277_11679;
	}

	public Class277 method18068(byte i) {
		return aClass277_11682;
	}

	String method18069() {
		return aString11678;
	}

	public abstract int method18070(int i);

	public String method18071() {
		String string = new StringBuilder().append(aClass277_11679.toString()).append(" ").append(aString11678).toString();
		if (null != aString11680 && !"".equals(aString11680))
			string = new StringBuilder().append(string).append(" : ").append(aString11680).toString();
		return string;
	}

	String method18072() {
		return aString11678;
	}

	Class523_Sub4_Sub1(Class272 class272) {
		aClass277_11679 = class272.aClass277_2884;
		aString11678 = class272.aString2882;
		aString11680 = class272.aString2879;
		anInt11681 = class272.anInt2881 * -2076432655;
		aClass277_11682 = class272.aClass277_2880;
	}

	String method18073() {
		return aString11678;
	}

	public Class277 method18074() {
		return aClass277_11679;
	}

	public Class277 method18075() {
		return aClass277_11679;
	}

	public String toString() {
		String string = new StringBuilder().append(aClass277_11679.toString()).append(" ").append(aString11678).toString();
		if (null != aString11680 && !"".equals(aString11680))
			string = new StringBuilder().append(string).append(" : ").append(aString11680).toString();
		return string;
	}

	public Class277 method18076() {
		return aClass277_11682;
	}

	public Class277 method18077() {
		return aClass277_11682;
	}

	public Class277 method18078() {
		return aClass277_11682;
	}

	public int method18079() {
		if (Class277.aClass277_2950 != aClass277_11679)
			throw new IllegalArgumentException_Sub1(this, aClass277_11679.toString().toLowerCase());
		return 2052037267 * anInt11681;
	}

	public abstract int method18080(int i);

	public abstract boolean method18081(int i);

	static Class523_Sub27_Sub17 method18082(Class523_Sub34 class523_sub34, int i, int i_0_) {
		Class523_Sub27_Sub17 class523_sub27_sub17 = new Class523_Sub27_Sub17(i, class523_sub34.readString(-59057959), class523_sub34.readString(581978569), class523_sub34.readUnsignedInt((byte) -82), class523_sub34.readUnsignedInt((byte) -110), (class523_sub34.readUnsignedByte(-1355284370) == 1), class523_sub34.readUnsignedByte(-1866022689), class523_sub34.readUnsignedByte(-459956640));
		int i_1_ = class523_sub34.readUnsignedByte(-907133453);
		for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
			class523_sub27_sub17.aClass708_11825.method14236(new Class523_Sub40(class523_sub34.readUnsignedByte(834018544), class523_sub34.readUnsignedShort(-2131832250), class523_sub34.readUnsignedShort(-1679518497), class523_sub34.readUnsignedShort(-1466229899), class523_sub34.readUnsignedShort(-84811480), class523_sub34.readUnsignedShort(-1462541356), class523_sub34.readUnsignedShort(-1797214016), class523_sub34.readUnsignedShort(-49822711), class523_sub34.readUnsignedShort(-257780781)), -1009579946);
		class523_sub27_sub17.method18194(65535);
		return class523_sub27_sub17;
	}
}
