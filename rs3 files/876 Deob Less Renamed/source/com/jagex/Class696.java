/* Class696 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class696 {
	int anInt8756;
	Class523_Sub27_Sub11 aClass523_Sub27_Sub11_8757;
	int anInt8758;
	int anInt8759;
	Class523_Sub27_Sub11 aClass523_Sub27_Sub11_8760;
	boolean aBool8761 = false;

	final boolean method14005(Class53_Sub13 class53_sub13, AnimationDefinitions class205, int i, int i_0_, int[] is, int i_1_) {
		if (!aBool8761) {
			if (i >= is.length)
				return false;
			anInt8758 = -1826523079 * is[i];
			aClass523_Sub27_Sub11_8757 = class53_sub13.method17209(anInt8758 * 78444041 >> 16, 852729051);
			anInt8758 = -1826523079 * (anInt8758 * 78444041 & 0xffff);
			if (aClass523_Sub27_Sub11_8757 != null) {
				if (class205.aBool2224 && -1 != i_0_ && i_0_ < is.length) {
					anInt8756 = is[i_0_] * 753642523;
					aClass523_Sub27_Sub11_8760 = class53_sub13.method17209((anInt8756 * -782873069 >> 16), 852729051);
					anInt8756 = (anInt8756 * -782873069 & 0xffff) * 753642523;
				}
				if (class205.aBool2232)
					anInt8759 = (65387229 * anInt8759 | 0x200) * -631247499;
				if (aClass523_Sub27_Sub11_8757.method18123(78444041 * anInt8758, (byte) -125))
					anInt8759 = (anInt8759 * 65387229 | 0x80) * -631247499;
				if (aClass523_Sub27_Sub11_8757.method18116(78444041 * anInt8758, -736417362))
					anInt8759 = (anInt8759 * 65387229 | 0x100) * -631247499;
				if (aClass523_Sub27_Sub11_8757.method18117(78444041 * anInt8758, (byte) -87))
					anInt8759 = (anInt8759 * 65387229 | 0x400) * -631247499;
				if (null != aClass523_Sub27_Sub11_8760) {
					if (aClass523_Sub27_Sub11_8760.method18123(-782873069 * anInt8756, (byte) -28))
						anInt8759 = -631247499 * (65387229 * anInt8759 | 0x80);
					if (aClass523_Sub27_Sub11_8760.method18116(anInt8756 * -782873069, 1875397368))
						anInt8759 = (65387229 * anInt8759 | 0x100) * -631247499;
					if (aClass523_Sub27_Sub11_8760.method18117(anInt8756 * -782873069, (byte) -37))
						anInt8759 = (65387229 * anInt8759 | 0x400) * -631247499;
				}
				anInt8759 = -631247499 * (anInt8759 * 65387229 | 0x20);
				aBool8761 = true;
				return true;
			}
			return false;
		}
		return true;
	}

	Class696() {
		/* empty */
	}

	final void method14006(int i) {
		aBool8761 = false;
		anInt8759 = 0;
		aClass523_Sub27_Sub11_8760 = null;
		aClass523_Sub27_Sub11_8757 = null;
	}

	final boolean method14007(Class53_Sub13 class53_sub13, AnimationDefinitions class205, int i, int i_2_, int[] is) {
		if (!aBool8761) {
			if (i >= is.length)
				return false;
			anInt8758 = -1826523079 * is[i];
			aClass523_Sub27_Sub11_8757 = class53_sub13.method17209(anInt8758 * 78444041 >> 16, 852729051);
			anInt8758 = -1826523079 * (anInt8758 * 78444041 & 0xffff);
			if (aClass523_Sub27_Sub11_8757 != null) {
				if (class205.aBool2224 && -1 != i_2_ && i_2_ < is.length) {
					anInt8756 = is[i_2_] * 753642523;
					aClass523_Sub27_Sub11_8760 = class53_sub13.method17209((anInt8756 * -782873069 >> 16), 852729051);
					anInt8756 = (anInt8756 * -782873069 & 0xffff) * 753642523;
				}
				if (class205.aBool2232)
					anInt8759 = (65387229 * anInt8759 | 0x200) * -631247499;
				if (aClass523_Sub27_Sub11_8757.method18123(78444041 * anInt8758, (byte) -74))
					anInt8759 = (anInt8759 * 65387229 | 0x80) * -631247499;
				if (aClass523_Sub27_Sub11_8757.method18116(78444041 * anInt8758, 1630232728))
					anInt8759 = (anInt8759 * 65387229 | 0x100) * -631247499;
				if (aClass523_Sub27_Sub11_8757.method18117(78444041 * anInt8758, (byte) -38))
					anInt8759 = (anInt8759 * 65387229 | 0x400) * -631247499;
				if (null != aClass523_Sub27_Sub11_8760) {
					if (aClass523_Sub27_Sub11_8760.method18123(-782873069 * anInt8756, (byte) -19))
						anInt8759 = -631247499 * (65387229 * anInt8759 | 0x80);
					if (aClass523_Sub27_Sub11_8760.method18116(anInt8756 * -782873069, 1769825801))
						anInt8759 = (65387229 * anInt8759 | 0x100) * -631247499;
					if (aClass523_Sub27_Sub11_8760.method18117(anInt8756 * -782873069, (byte) -60))
						anInt8759 = (65387229 * anInt8759 | 0x400) * -631247499;
				}
				anInt8759 = -631247499 * (anInt8759 * 65387229 | 0x20);
				aBool8761 = true;
				return true;
			}
			return false;
		}
		return true;
	}

	final boolean method14008(Class53_Sub13 class53_sub13, AnimationDefinitions class205, int i, int i_3_, int[] is) {
		if (!aBool8761) {
			if (i >= is.length)
				return false;
			anInt8758 = -1826523079 * is[i];
			aClass523_Sub27_Sub11_8757 = class53_sub13.method17209(anInt8758 * 78444041 >> 16, 852729051);
			anInt8758 = -1826523079 * (anInt8758 * 78444041 & 0xffff);
			if (aClass523_Sub27_Sub11_8757 != null) {
				if (class205.aBool2224 && -1 != i_3_ && i_3_ < is.length) {
					anInt8756 = is[i_3_] * 753642523;
					aClass523_Sub27_Sub11_8760 = class53_sub13.method17209((anInt8756 * -782873069 >> 16), 852729051);
					anInt8756 = (anInt8756 * -782873069 & 0xffff) * 753642523;
				}
				if (class205.aBool2232)
					anInt8759 = (65387229 * anInt8759 | 0x200) * -631247499;
				if (aClass523_Sub27_Sub11_8757.method18123(78444041 * anInt8758, (byte) -12))
					anInt8759 = (anInt8759 * 65387229 | 0x80) * -631247499;
				if (aClass523_Sub27_Sub11_8757.method18116(78444041 * anInt8758, 2082862118))
					anInt8759 = (anInt8759 * 65387229 | 0x100) * -631247499;
				if (aClass523_Sub27_Sub11_8757.method18117(78444041 * anInt8758, (byte) -19))
					anInt8759 = (anInt8759 * 65387229 | 0x400) * -631247499;
				if (null != aClass523_Sub27_Sub11_8760) {
					if (aClass523_Sub27_Sub11_8760.method18123(-782873069 * anInt8756, (byte) -68))
						anInt8759 = -631247499 * (65387229 * anInt8759 | 0x80);
					if (aClass523_Sub27_Sub11_8760.method18116(anInt8756 * -782873069, -254176693))
						anInt8759 = (65387229 * anInt8759 | 0x100) * -631247499;
					if (aClass523_Sub27_Sub11_8760.method18117(anInt8756 * -782873069, (byte) -36))
						anInt8759 = (65387229 * anInt8759 | 0x400) * -631247499;
				}
				anInt8759 = -631247499 * (anInt8759 * 65387229 | 0x20);
				aBool8761 = true;
				return true;
			}
			return false;
		}
		return true;
	}

	final void method14009() {
		aBool8761 = false;
		anInt8759 = 0;
		aClass523_Sub27_Sub11_8760 = null;
		aClass523_Sub27_Sub11_8757 = null;
	}

	public static Class10 method14010(Class472 class472, int i, int i_4_, int i_5_) {
		return Class628.method10312(class472, i, i_4_, null, (byte) 14);
	}

	static final void method14011(Class250 class250, Class242 class242, Class669 class669, int i) {
		class250.aBool2555 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1;
		Class523_Sub14.method15991(class250, (byte) -15);
	}

	static final void method14012(Class669 class669, byte i) {
		/* empty */
	}
}
