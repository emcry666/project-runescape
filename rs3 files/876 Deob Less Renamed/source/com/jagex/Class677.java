/* Class677 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class677 {
	Class242 aClass242_8637;
	Class250 aClass250_8638;

	Class677() {
		/* empty */
	}

	Class250 method13769(int i) {
		return aClass242_8637.method4366((-1363815505 * aClass250_8638.anInt2585), -1936179899);
	}

	boolean method13770(int i, int i_0_, short i_1_) {
		Class250 class250 = Class654.method10722(i, i_0_, (byte) -91);
		if (null != class250) {
			aClass242_8637 = Class31.aClass242Array302[i >> 16];
			aClass250_8638 = class250;
			return true;
		}
		method13771(516488967);
		return false;
	}

	void method13771(int i) {
		aClass242_8637 = null;
		aClass250_8638 = null;
	}

	Class250 method13772() {
		return aClass242_8637.method4366((-1363815505 * aClass250_8638.anInt2585), -132937593);
	}

	boolean method13773(int i, int i_2_) {
		Class250 class250 = Class654.method10722(i, i_2_, (byte) 11);
		if (null != class250) {
			aClass242_8637 = Class31.aClass242Array302[i >> 16];
			aClass250_8638 = class250;
			return true;
		}
		method13771(1889344959);
		return false;
	}

	void method13774() {
		aClass242_8637 = null;
		aClass250_8638 = null;
	}

	public static Class245 method13775(Class523_Sub34 class523_sub34, byte i) {
		int i_3_ = class523_sub34.readUnsignedByte(-2067517890);
		if (i_3_ == 0)
			return null;
		i_3_--;
		class523_sub34.anInt10661 += 189765723;
		int i_4_ = class523_sub34.readUnsignedInt((byte) -31);
		Object[] objects = new Object[i_3_];
		for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
			int i_6_ = class523_sub34.readUnsignedByte(-1019325532);
			if (i_6_ == 0)
				objects[i_5_] = Class474.method7745(java.lang.Integer.class, 1928240851).method65(class523_sub34, -721285210);
			else if (i_6_ == 1)
				objects[i_5_] = Class474.method7745(java.lang.String.class, 1778696073).method65(class523_sub34, -721285210);
			else
				throw new IllegalStateException(new StringBuilder().append("Unrecognised type ID in deserialise: ").append(i_6_).toString());
		}
		return new Class245(i_4_, objects);
	}
}
