/* Class622 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class622 implements Iterator {
	Class618[] aClass618Array8090;
	int anInt8091;

	public Object method10158() {
		return aClass618Array8090[(anInt8091 += -1581716949) * 166102147 - 1];
	}

	public boolean method10159() {
		return 166102147 * anInt8091 < aClass618Array8090.length;
	}

	public Object next() {
		return aClass618Array8090[(anInt8091 += -1581716949) * 166102147 - 1];
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean hasNext() {
		return 166102147 * anInt8091 < aClass618Array8090.length;
	}

	Class622(Class618[] class618s) {
		aClass618Array8090 = class618s;
	}

	public boolean method10160() {
		return 166102147 * anInt8091 < aClass618Array8090.length;
	}

	public boolean method10161() {
		return 166102147 * anInt8091 < aClass618Array8090.length;
	}

	public boolean method10162() {
		return 166102147 * anInt8091 < aClass618Array8090.length;
	}

	public void method10163() {
		throw new UnsupportedOperationException();
	}

	public void method10164() {
		throw new UnsupportedOperationException();
	}

	public static void method10165(int[] is, Object[] objects, byte i) {
		Class644.method10554(is, objects, 0, is.length - 1, (byte) 100);
	}

	static final void method10166(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_0_, -1111322225);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1579360395 * class250.anInt2540;
	}

	public static void method10167(Class572 class572, int i, int i_1_, Interface61 interface61, byte i_2_) {
		Class669 class669 = Class540.method8981(1353836377);
		class669.anInterface61_8572 = interface61;
		Class687_Sub28.method16969(class572, i, i_1_, class669, -1211178059);
		class669.anInterface61_8572 = null;
	}

	static long method10168(byte i) {
		return Class506.aClass503_5666.method8167(-1671227279);
	}
}
