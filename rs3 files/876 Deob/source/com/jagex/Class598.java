/* Class598 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class598 implements Interface71 {
	int anInt7836;
	Class597 aClass597_7837 = Class597.aClass597_7833;
	Class472 aClass472_7838;
	Class375 aClass375_7839;
	Interface69 anInterface69_7840;
	public static Class472 aClass472_7841;

	public int method453(byte i) {
		return 0;
	}

	public void method210(int i) {
		if (Class597.aClass597_7832 == aClass597_7837) {
			method9851((byte) -1);
			aClass597_7837 = Class597.aClass597_7834;
			if (null != anInterface69_7840)
				anInterface69_7840.method440(this, 0, -2043778933 * anInt7836, true, 530705158);
		}
	}

	public Class489 method466(int i) {
		Class489 class489 = new Class489(aClass375_7839);
		class489.method7956(this, 1939022271);
		return class489;
	}

	public Class597 method474(short i) {
		return aClass597_7837;
	}

	public boolean method477(short i) {
		return true;
	}

	void method9849() {
		/* empty */
	}

	public boolean method462(short i) {
		return false;
	}

	public Class478 method458(int i) {
		return Class478.aClass478_5447;
	}

	void method9850() {
		/* empty */
	}

	public byte[] method452(int i, byte i_0_) {
		int i_1_ = i;
		if (0 == i_1_)
			i_1_ = -2043778933 * anInt7836;
		return aClass472_7838.method7721(i_1_, -387132909);
	}

	public void method456(RSBuffer class523_sub34, short i) {
		/* empty */
	}

	public Class597 method470() {
		return aClass597_7837;
	}

	public boolean method457(int i, int i_2_) {
		return false;
	}

	public int method460(int i) {
		return 0;
	}

	public Class597 method467() {
		return aClass597_7837;
	}

	public void method461(boolean bool, byte i) {
		/* empty */
	}

	public RSBuffer method469(int i, int i_3_) {
		return null;
	}

	public int method451() {
		return 0;
	}

	public Class489 method463() {
		Class489 class489 = new Class489(aClass375_7839);
		class489.method7956(this, 1939022271);
		return class489;
	}

	public Class597 method464() {
		return aClass597_7837;
	}

	public Class597 method465() {
		return aClass597_7837;
	}

	public RSBuffer method473(int i) {
		return null;
	}

	public RSBuffer method472(int i) {
		return null;
	}

	public boolean method254() {
		return true;
	}

	public byte[] method468(int i) {
		int i_4_ = i;
		if (0 == i_4_)
			i_4_ = -2043778933 * anInt7836;
		return aClass472_7838.method7721(i_4_, -387132909);
	}

	public Class478 method449() {
		return Class478.aClass478_5447;
	}

	public int method450() {
		return -2043778933 * anInt7836;
	}

	public void method454(RSBuffer class523_sub34) {
		/* empty */
	}

	void method9851(byte i) {
		/* empty */
	}

	public void method266() {
		if (Class597.aClass597_7832 == aClass597_7837) {
			method9851((byte) -1);
			aClass597_7837 = Class597.aClass597_7834;
			if (null != anInterface69_7840)
				anInterface69_7840.method440(this, 0, -2043778933 * anInt7836, true, 768060570);
		}
	}

	public boolean method479(int i) {
		return false;
	}

	public boolean method475() {
		return false;
	}

	public boolean method476() {
		return false;
	}

	public boolean method482() {
		return false;
	}

	public void method478(boolean bool) {
		/* empty */
	}

	public boolean method459() {
		return false;
	}

	public boolean method480() {
		return false;
	}

	public int method455(byte i) {
		return -2043778933 * anInt7836;
	}

	public int method484() {
		return 0;
	}

	public int method483() {
		return 0;
	}

	public boolean method471(int i) {
		return false;
	}

	public Class598(Class472 class472, int i, Class375 class375, Interface69 interface69) {
		aClass472_7838 = class472;
		anInt7836 = i * 1677246243;
		aClass375_7839 = class375;
		anInterface69_7840 = interface69;
		aClass597_7837 = Class597.aClass597_7832;
	}

	public int method481() {
		return 0;
	}

	public static String method9852(String string, char c, String string_5_, int i) {
		int i_6_ = string.length();
		int i_7_ = string_5_.length();
		int i_8_ = i_6_;
		int i_9_ = i_7_ - 1;
		if (i_9_ != 0) {
			int i_10_ = 0;
			for (;;) {
				i_10_ = string.indexOf(c, i_10_);
				if (i_10_ < 0)
					break;
				i_10_++;
				i_8_ += i_9_;
			}
		}
		StringBuilder stringbuilder = new StringBuilder(i_8_);
		int i_11_ = 0;
		for (;;) {
			int i_12_ = string.indexOf(c, i_11_);
			if (i_12_ < 0)
				break;
			stringbuilder.append(string.substring(i_11_, i_12_));
			stringbuilder.append(string_5_);
			i_11_ = 1 + i_12_;
		}
		stringbuilder.append(string.substring(i_11_));
		return stringbuilder.toString();
	}
}
