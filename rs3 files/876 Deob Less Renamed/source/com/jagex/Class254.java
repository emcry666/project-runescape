/* Class254 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class254 implements Interface26 {
	Class224 this$0;
	Class229 aClass229_2741;
	public static int anInt2742;
	public static Class217 aClass217_2743;

	public void method165(Class218 class218) {
		class218.method3970(aClass229_2741, 1582063184);
	}

	public void method162(Class218 class218) {
		class218.method3970(aClass229_2741, 1777366756);
	}

	public void method163(Class218 class218, int i) {
		class218.method3970(aClass229_2741, 1587545326);
	}

	public void method161(Class218 class218) {
		class218.method3970(aClass229_2741, 1806834800);
	}

	public void method164(Class218 class218) {
		class218.method3970(aClass229_2741, 1669960057);
	}

	Class254(Class224 class224, Class523_Sub34 class523_sub34) {
		this$0 = class224;
		boolean bool = class523_sub34.readUnsignedByte(81646628) != 255;
		if (bool)
			class523_sub34.anInt10661 -= 189765723;
		aClass229_2741 = new Class229(class523_sub34, bool, true, class224.anInterface27_2338);
	}

	static final void method4545(Class250 class250, Class242 class242, Class669 class669, int i) {
		class669.anInt8558 -= 2121349901;
		class250.anInt2536 = (class669.anIntArray8557[1357652815 * class669.anInt8558] * 2098808279);
		class250.anInt2512 = (class669.anIntArray8557[1 + 1357652815 * class669.anInt8558] * -552287483);
		class250.anInt2608 = (-2046294063 * class669.anIntArray8557[class669.anInt8558 * 1357652815 + 2]);
		Class523_Sub14.method15991(class250, (byte) -90);
	}

	static final void method4546(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class194_Sub14.method15516((byte) -56).method82();
	}

	static final void method4547(Class669 class669, int i) {
		boolean bool = false;
		if (client.aBool11185) {
			try {
				Object object = (Class402.aClass402_4161.method6576((new Object[] { Integer.valueOf(-1857773681 * Class303.anInt3343), Boolean.valueOf((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte12182) == 1), Integer.valueOf(class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)]) }), 16711680));
				if (null != object)
					bool = ((Boolean) object).booleanValue();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = bool ? 1 : 0;
	}

	static final void method4548(Class250 class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (!string.equals(class250.aString2607)) {
			class250.aString2607 = string;
			Class523_Sub14.method15991(class250, (byte) 6);
		}
		if (-1 == 234012635 * class250.anInt2709 && !class242.aBool2456)
			Class543.method9010(-1363815505 * class250.anInt2585, -113773269);
	}

	public static String method4549(byte[] is, int i, int i_0_, int i_1_) {
		char[] cs = new char[i_0_];
		int i_2_ = 0;
		int i_3_ = i;
		int i_4_ = i + i_0_;
		while (i_3_ < i_4_) {
			int i_5_ = is[i_3_++] & 0xff;
			int i_6_;
			if (i_5_ < 128) {
				if (0 == i_5_)
					i_6_ = 65533;
				else
					i_6_ = i_5_;
			} else if (i_5_ < 192)
				i_6_ = 65533;
			else if (i_5_ < 224) {
				if (i_3_ < i_4_ && 128 == (is[i_3_] & 0xc0)) {
					i_6_ = (i_5_ & 0x1f) << 6 | is[i_3_++] & 0x3f;
					if (i_6_ < 128)
						i_6_ = 65533;
				} else
					i_6_ = 65533;
			} else if (i_5_ < 240) {
				if (i_3_ + 1 < i_4_ && 128 == (is[i_3_] & 0xc0) && (is[i_3_ + 1] & 0xc0) == 128) {
					i_6_ = ((i_5_ & 0xf) << 12 | (is[i_3_++] & 0x3f) << 6 | is[i_3_++] & 0x3f);
					if (i_6_ < 2048)
						i_6_ = 65533;
				} else
					i_6_ = 65533;
			} else if (i_5_ < 248) {
				if (i_3_ + 2 < i_4_ && 128 == (is[i_3_] & 0xc0) && 128 == (is[i_3_ + 1] & 0xc0) && (is[2 + i_3_] & 0xc0) == 128) {
					i_6_ = ((i_5_ & 0x7) << 18 | (is[i_3_++] & 0x3f) << 12 | (is[i_3_++] & 0x3f) << 6 | is[i_3_++] & 0x3f);
					if (i_6_ < 65536 || i_6_ > 1114111)
						i_6_ = 65533;
					else
						i_6_ = 65533;
				} else
					i_6_ = 65533;
			} else
				i_6_ = 65533;
			cs[i_2_++] = (char) i_6_;
		}
		return new String(cs, 0, i_2_);
	}

	public static void method4550(int i) {
		if (-2020118759 * client.anInt11136 == 16 && (!Class366.method6324(-1178085014) && !Class471.method7636(-1990483367)))
			Class657.method10791(13, (byte) -102);
	}
}
