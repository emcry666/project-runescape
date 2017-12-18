/* Class53_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;
import java.io.IOException;

public class Class53_Sub2 extends Class53 {
	public void method1293(int i) {
		super.method1293(-1644595269);
		((Class571) anInterface5_723).method9610((byte) 39);
	}

	public void method1297() {
		super.method1293(4381437);
		((Class571) anInterface5_723).method9610((byte) 44);
	}

	public void method1294(byte i) {
		super.method1294((byte) -121);
		((Class571) anInterface5_723).method9612(1330142625);
	}

	public Class53_Sub2(Class681 class681, Class668 class668, Class472 class472, Class472 class472_0_) {
		super(class681, class668, class472, Class656.aClass656_8469, 64, new Class571_Sub1(class472_0_));
	}

	public void method1298(int i) {
		super.method1299(i, (byte) -18);
		((Class571) anInterface5_723).method9611(i, (short) -21718);
	}

	public void method1299(int i, byte i_1_) {
		super.method1299(i, (byte) -104);
		((Class571) anInterface5_723).method9611(i, (short) -30115);
	}

	public void method1296(int i) {
		super.method1299(i, (byte) -118);
		((Class571) anInterface5_723).method9611(i, (short) -11448);
	}

	public void method1300() {
		super.method1293(264431745);
		((Class571) anInterface5_723).method9610((byte) 56);
	}

	public void method1301() {
		super.method1293(1162518365);
		((Class571) anInterface5_723).method9610((byte) 6);
	}

	public void method1302() {
		super.method1293(-1470620396);
		((Class571) anInterface5_723).method9610((byte) 112);
	}

	public void method1303() {
		super.method1294((byte) -54);
		((Class571) anInterface5_723).method9612(-1399039751);
	}

	public static Class19 method17146(String string, String string_2_, boolean bool, int i) {
		File file = new File(Class198.aFile2204, new StringBuilder().append("preferences").append(string).append(".dat").toString());
		do {
			if (file.exists()) {
				Class19 class19;
				try {
					Class19 class19_3_ = new Class19(file, "rw", 10000L);
					class19 = class19_3_;
				} catch (IOException ioexception) {
					break;
				}
				return class19;
			}
		} while (false);
		String string_4_ = "";
		if (33 == Class215.anInt2270 * -12827575)
			string_4_ = "_rc";
		else if (34 == Class215.anInt2270 * -12827575)
			string_4_ = "_wip";
		File file_5_ = new File(Class506.aString5699, new StringBuilder().append("jagex_").append(string_2_).append("_preferences").append(string).append(string_4_).append(".dat").toString());
		do {
			if (!bool && file_5_.exists()) {
				Class19 class19;
				try {
					Class19 class19_6_ = new Class19(file_5_, "rw", 10000L);
					class19 = class19_6_;
				} catch (IOException ioexception) {
					break;
				}
				return class19;
			}
		} while (false);
		Class19 class19;
		try {
			Class19 class19_7_ = new Class19(file, "rw", 10000L);
			class19 = class19_7_;
		} catch (IOException ioexception) {
			throw new RuntimeException();
		}
		return class19;
	}
}
