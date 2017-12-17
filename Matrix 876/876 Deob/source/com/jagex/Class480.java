/* Class480 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class480 implements Interface11 {
	public Object method66(RSBuffer class523_sub34) {
		return Class677.method13775(class523_sub34, (byte) 1);
	}

	public Object method65(RSBuffer class523_sub34, int i) {
		return Class677.method13775(class523_sub34, (byte) 1);
	}

	public Object method64(RSBuffer class523_sub34) {
		return Class677.method13775(class523_sub34, (byte) 1);
	}

	public Object method67(RSBuffer class523_sub34) {
		return Class677.method13775(class523_sub34, (byte) 1);
	}

	static final void method7898(Class669 class669, byte i) {
		class669.anInt8562 -= 204911810;
		if (class669.aLongArray8561[1 + class669.anInt8562 * 2056702369] != class669.aLongArray8561[2056702369 * class669.anInt8562])
			class669.anInt8579 += -1774429083 * (class669.anIntArray8577[class669.anInt8579 * 1180759405]);
	}

	static String method7899(long l) {
		if (l <= 0L || l >= 6582952005840035281L)
			return null;
		if (l % 37L == 0L)
			return null;
		int i = 0;
		for (long l_0_ = l; l_0_ != 0L; l_0_ /= 37L)
			i++;
		StringBuilder stringbuilder = new StringBuilder(i);
		while (0L != l) {
			long l_1_ = l;
			l /= 37L;
			char c = Class672.aCharArray8607[(int) (l_1_ - 37L * l)];
			if (c == '_') {
				int i_2_ = stringbuilder.length() - 1;
				stringbuilder.setCharAt(i_2_, Character.toUpperCase(stringbuilder.charAt(i_2_)));
				c = '\u00a0';
			}
			stringbuilder.append(c);
		}
		stringbuilder.reverse();
		stringbuilder.setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
		return stringbuilder.toString();
	}

	public static boolean method7900(int i, int i_3_) {
		return i == 0 || i == 2;
	}

	static final void method7901(Class669 class669, int i) {
		int i_4_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (-1 == i_4_)
			throw new RuntimeException();
		ClientScriptDefinitions class37 = (ClientScriptDefinitions) Class394.aClass53_Sub16_4056.getDefinition(i_4_, (byte) 22);
		if (class37.valueType != Class464.aClass464_5165)
			throw new RuntimeException();
		int[] is = class37.method1091(string, (byte) 68);
		int i_5_ = 0;
		if (is != null)
			i_5_ = is.length;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_5_;
	}
}
