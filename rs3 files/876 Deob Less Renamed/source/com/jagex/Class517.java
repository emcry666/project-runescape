/* Class517 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;

public class Class517 {
	static Interface59 anInterface59_7052;

	public static Interface59 method8623() {
		if (anInterface59_7052 == null)
			throw new IllegalStateException("");
		return anInterface59_7052;
	}

	public static boolean method8624() {
		return anInterface59_7052 != null;
	}

	public static void method8625(Interface59 interface59) {
		if (anInterface59_7052 != null)
			throw new IllegalStateException("");
		anInterface59_7052 = interface59;
	}

	public static Interface59 method8626() {
		if (anInterface59_7052 == null)
			throw new IllegalStateException("");
		return anInterface59_7052;
	}

	public static boolean method8627() {
		return anInterface59_7052 != null;
	}

	public static boolean method8628() {
		return anInterface59_7052 != null;
	}

	Class517() throws Throwable {
		throw new Error();
	}

	static final void method8629(Class669 class669, int i) {
		if (Class710.aBool8840 && Class310.aFrame3385 != null)
			Class82.method1585(Class449.aClass523_Sub33_4946.aClass687_Sub5_10632.method16784(909887267), -1, -1, false, -1011984276);
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		boolean bool = ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1);
		String string_0_ = new StringBuilder().append(Class436.method6875((byte) -79)).append(string).toString();
		Class331.method5825(string_0_, bool, client.aBool10996, 623446590);
	}

	static void method8630(File file, int i) {
		Class626.aFile8179 = file;
		if (!Class626.aFile8179.exists())
			throw new RuntimeException("");
		Class512.aBool5763 = true;
	}
}
