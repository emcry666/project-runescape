/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class78 {
	static char[] aCharArray859;
	static final int anInt860 = 1;
	static char[] aCharArray861 = { ' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df' };
	static final int anInt862 = 12;
	public static Class148 aClass148_863;

	static final boolean method1547(char c) {
		if (Character.isISOControl(c))
			return false;
		if (Class615.method10068(c, 530847186))
			return true;
		char[] cs = aCharArray861;
		for (int i = 0; i < cs.length; i++) {
			char c_0_ = cs[i];
			if (c == c_0_)
				return true;
		}
		cs = aCharArray859;
		for (int i = 0; i < cs.length; i++) {
			char c_1_ = cs[i];
			if (c == c_1_)
				return true;
		}
		return false;
	}

	static final int method1548(Class73 class73) {
		if (class73 == null)
			return 12;
		switch (class73.anInt809 * 1652964889) {
		case 1:
			return 20;
		default:
			return 12;
		}
	}

	static final int method1549(Class73 class73) {
		if (class73 == null)
			return 12;
		switch (class73.anInt809 * 1652964889) {
		case 1:
			return 20;
		default:
			return 12;
		}
	}

	public static String method1550(CharSequence charsequence, Class73 class73) {
		if (charsequence == null)
			return null;
		int i = 0;
		int i_2_;
		for (i_2_ = charsequence.length(); (i < i_2_ && Class562.method9460(charsequence.charAt(i), -895658533)); i++) {
			/* empty */
		}
		for (/**/; i_2_ > i && Class562.method9460(charsequence.charAt(i_2_ - 1), -406113520); i_2_--) {
			/* empty */
		}
		int i_3_ = i_2_ - i;
		if (i_3_ < 1 || i_3_ > Class216.method3850(class73, -1775831749))
			return null;
		StringBuilder stringbuilder = new StringBuilder(i_3_);
		for (int i_4_ = i; i_4_ < i_2_; i_4_++) {
			char c = charsequence.charAt(i_4_);
			if (Class593.method9803(c, (byte) 40)) {
				char c_5_ = Class611.method10037(c, -1193023821);
				if ('\0' != c_5_)
					stringbuilder.append(c_5_);
			}
		}
		if (stringbuilder.length() == 0)
			return null;
		return stringbuilder.toString();
	}

	static final int method1551(Class73 class73) {
		if (class73 == null)
			return 12;
		switch (class73.anInt809 * 1652964889) {
		case 1:
			return 20;
		default:
			return 12;
		}
	}

	static {
		aCharArray859 = new char[] { '[', ']', '#' };
	}

	Class78() throws Throwable {
		throw new Error();
	}

	static final boolean method1552(char c) {
		return '\u00a0' == c || ' ' == c || '_' == c || '-' == c;
	}

	static char method1553(char c) {
		switch (c) {
		default:
			return Character.toLowerCase(c);
		case '\u00d9':
		case '\u00da':
		case '\u00db':
		case '\u00dc':
		case '\u00f9':
		case '\u00fa':
		case '\u00fb':
		case '\u00fc':
			return 'u';
		case '\u00d1':
		case '\u00f1':
			return 'n';
		case '\u00ff':
		case '\u0178':
			return 'y';
		case '\u00c8':
		case '\u00c9':
		case '\u00ca':
		case '\u00cb':
		case '\u00e8':
		case '\u00e9':
		case '\u00ea':
		case '\u00eb':
			return 'e';
		case '#':
		case '[':
		case ']':
			return c;
		case '\u00c7':
		case '\u00e7':
			return 'c';
		case '\u00cd':
		case '\u00ce':
		case '\u00cf':
		case '\u00ed':
		case '\u00ee':
		case '\u00ef':
			return 'i';
		case ' ':
		case '-':
		case '_':
		case '\u00a0':
			return '_';
		case '\u00df':
			return 'b';
		case '\u00c0':
		case '\u00c1':
		case '\u00c2':
		case '\u00c3':
		case '\u00c4':
		case '\u00e0':
		case '\u00e1':
		case '\u00e2':
		case '\u00e3':
		case '\u00e4':
			return 'a';
		case '\u00d2':
		case '\u00d3':
		case '\u00d4':
		case '\u00d5':
		case '\u00d6':
		case '\u00f2':
		case '\u00f3':
		case '\u00f4':
		case '\u00f5':
		case '\u00f6':
			return 'o';
		}
	}

	static final Object[] method1554(String string, Class669 class669, int i) {
		Object[] objects = new Object[string.length() + 1];
		for (int i_6_ = objects.length - 1; i_6_ >= 1; i_6_--) {
			if (string.charAt(i_6_ - 1) == 's')
				objects[i_6_] = (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
			else if (string.charAt(i_6_ - 1) == 'l')
				objects[i_6_] = new Long(class669.aLongArray8561[((class669.anInt8562 -= -2045027743) * 2056702369)]);
			else
				objects[i_6_] = new Integer(class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)]);
		}
		int i_7_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (i_7_ != -1)
			objects[0] = new Integer(i_7_);
		else
			objects = null;
		return objects;
	}

	static final void method1555(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_8_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_9_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		int i_10_ = 0;
		int i_11_ = i_9_ >>> 8;
		int i_12_ = i_9_ & 0xff;
		Class17 class17 = (Class17) Class546.aClass53_7303.getDefinition(i_8_, (byte) 50);
		Class84 class84 = (Class84) Class647_Sub1_Sub1_Sub2.aClass53_12014.getDefinition(i_11_, (byte) 59);
		Class464[] class464s = class84.aClass464ArrayArray875[i_12_];
		Object[] objects = class17.method773(i_12_, (byte) 3);
		if (null == objects && null != class84.anObjectArrayArray874)
			objects = class84.anObjectArrayArray874[i_12_];
		if (null != objects)
			i_10_ = objects.length / class464s.length;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_10_;
	}
}
