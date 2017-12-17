/* Class406 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class406 {
	public static Class406 aClass406_4184 = new Class406(14, 0);
	public static Class406 aClass406_4185;
	public static Class406 aClass406_4186;
	public static Class406 aClass406_4187;
	static Class406 aClass406_4188;
	static Class406 aClass406_4189;
	public int anInt4190;
	static Class406 aClass406_4191;
	public static Class406 aClass406_4192;
	public static Class406 aClass406_4193;
	public static Class406 aClass406_4194 = new Class406(15, -1);
	static Class406 aClass406_4195;
	public static Class406 aClass406_4196;
	static Class406[] aClass406Array4197;
	protected static Class20[] aClass20Array4198;

	static {
		aClass406_4186 = new Class406(16, -2);
		aClass406_4187 = new Class406(19, -2);
		aClass406_4188 = new Class406(23, 4);
		aClass406_4189 = new Class406(24, -1);
		aClass406_4185 = new Class406(26, 0);
		aClass406_4191 = new Class406(27, 0);
		aClass406_4192 = new Class406(28, -2);
		aClass406_4196 = new Class406(29, -2);
		aClass406_4193 = new Class406(30, -2);
		aClass406_4195 = new Class406(31, 4);
		aClass406Array4197 = new Class406[32];
		Class406[] class406s = Class648.method10617(-1971648008);
		for (int i = 0; i < class406s.length; i++)
			aClass406Array4197[1752807475 * class406s[i].anInt4190] = class406s[i];
	}

	static Class406[] method6609() {
		return (new Class406[] { aClass406_4194, aClass406_4187, aClass406_4185, aClass406_4192, aClass406_4184, aClass406_4188, aClass406_4193, aClass406_4196, aClass406_4189, aClass406_4186, aClass406_4191, aClass406_4195 });
	}

	Class406(int i, int i_0_) {
		anInt4190 = -1779956997 * i;
	}

	static void method6610(long[] ls, Object[] objects, int i, int i_1_, byte i_2_) {
		if (i < i_1_) {
			int i_3_ = (i + i_1_) / 2;
			int i_4_ = i;
			long l = ls[i_3_];
			ls[i_3_] = ls[i_1_];
			ls[i_1_] = l;
			Object object = objects[i_3_];
			objects[i_3_] = objects[i_1_];
			objects[i_1_] = object;
			int i_5_ = l == 9223372036854775807L ? 0 : 1;
			for (int i_6_ = i; i_6_ < i_1_; i_6_++) {
				if (ls[i_6_] < l + (long) (i_6_ & i_5_)) {
					long l_7_ = ls[i_6_];
					ls[i_6_] = ls[i_4_];
					ls[i_4_] = l_7_;
					Object object_8_ = objects[i_6_];
					objects[i_6_] = objects[i_4_];
					objects[i_4_++] = object_8_;
				}
			}
			ls[i_1_] = ls[i_4_];
			ls[i_4_] = l;
			objects[i_1_] = objects[i_4_];
			objects[i_4_] = object;
			method6610(ls, objects, i, i_4_ - 1, (byte) 32);
			method6610(ls, objects, 1 + i_4_, i_1_, (byte) 50);
		}
	}

	static final void method6611(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method6612(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method6613(Class669 class669, int i) {
		int i_9_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_9_, -1020978585);
		Class242 class242 = Class31.aClass242Array302[i_9_ >> 16];
		Class396.method6515(class250, class242, class669, 268935392);
	}

	public static boolean method6614(char c, byte i) {
		return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
	}

	public static String method6615(CharSequence charsequence, int i) {
		int i_10_ = charsequence.length();
		StringBuilder stringbuilder = new StringBuilder(i_10_);
		for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
			char c = charsequence.charAt(i_11_);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || '.' == c || c == '-' || '*' == c || c == '_')
				stringbuilder.append(c);
			else if (c == ' ')
				stringbuilder.append('+');
			else {
				int i_12_ = Class523_Sub33.method16255(c, -74173527);
				stringbuilder.append('%');
				int i_13_ = i_12_ >> 4 & 0xf;
				if (i_13_ >= 10)
					stringbuilder.append((char) (i_13_ + 55));
				else
					stringbuilder.append((char) (48 + i_13_));
				i_13_ = i_12_ & 0xf;
				if (i_13_ >= 10)
					stringbuilder.append((char) (55 + i_13_));
				else
					stringbuilder.append((char) (i_13_ + 48));
			}
		}
		return stringbuilder.toString();
	}
}
