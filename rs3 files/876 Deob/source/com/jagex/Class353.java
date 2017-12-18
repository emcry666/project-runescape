/* Class353 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class353 {
	Class178_Sub2 aClass178_Sub2_3660;
	static final int anInt3661 = 128;
	public static final int anInt3662 = 16;
	public Interface34 anInterface34_3663;
	public boolean aBool3664;
	Interface37[] anInterface37Array3665 = null;
	static Object anObject3666;
	Interface34 anInterface34_3667 = null;
	public Interface37[] anInterface37Array3668 = null;
	static Object anObject3669;
	public Interface34 anInterface34_3670;
	static Object anObject3671;
	static final int anInt3672 = 128;

	static void method6194() {
		if (anObject3666 == null) {
			Class401_Sub1_Sub1 class401_sub1_sub1 = new Class401_Sub1_Sub1();
			byte[] is = class401_sub1_sub1.method17871(128, 128, 16);
			anObject3666 = Class39.method1128(is, false, -264766399);
		}
		if (anObject3671 == null) {
			Class401_Sub2_Sub1 class401_sub2_sub1 = new Class401_Sub2_Sub1();
			byte[] is = class401_sub2_sub1.method17811(128, 128, 16);
			anObject3671 = Class39.method1128(is, false, -936452550);
		}
	}

	public boolean method6195() {
		if (!aClass178_Sub2_3660.aBool9687)
			return false;
		if (anInterface34_3670 == null) {
			if (anObject3669 == null) {
				byte[] is = Class538.method8945(128, 128, 16, 8, new Class521_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject3669 = Class39.method1128(is, false, -1060232746);
			}
			byte[] is = Class654.method10718(anObject3669, false, 833007628);
			byte[] is_0_ = new byte[is.length * 4];
			int i = 0;
			for (int i_1_ = 0; i_1_ < 16; i_1_++) {
				int i_2_ = i_1_ * 16384;
				int i_3_ = i_2_;
				for (int i_4_ = 0; i_4_ < 128; i_4_++) {
					int i_5_ = i_3_ + i_4_ * 128;
					int i_6_ = i_3_ + (i_4_ - 1 & 0x7f) * 128;
					int i_7_ = i_3_ + (i_4_ + 1 & 0x7f) * 128;
					for (int i_8_ = 0; i_8_ < 128; i_8_++) {
						float f = (float) ((is[i_6_ + i_8_] & 0xff) - (is[i_7_ + i_8_] & 0xff));
						float f_9_ = (float) ((is[i_5_ + (i_8_ - 1 & 0x7f)] & 0xff) - (is[i_5_ + (i_8_ + 1 & 0x7f)] & 0xff));
						float f_10_ = (float) (128.0 / Math.sqrt((double) (f_9_ * f_9_ + 16384.0F + f * f)));
						is_0_[i++] = (byte) (int) (f_9_ * f_10_ + 127.0F);
						is_0_[i++] = (byte) (int) (128.0F * f_10_ + 127.0F);
						is_0_[i++] = (byte) (int) (f * f_10_ + 127.0F);
						is_0_[i++] = is[i_2_++];
					}
				}
			}
			anInterface34_3670 = aClass178_Sub2_3660.method15087(Class158.aClass158_1743, 128, 128, 16, true, is_0_);
		}
		return anInterface34_3670 != null;
	}

	public boolean method6196() {
		return (aBool3664 ? anInterface34_3667 != null : anInterface37Array3665 != null);
	}

	public boolean method6197() {
		return (aBool3664 ? anInterface34_3667 != null : anInterface37Array3665 != null);
	}

	static void method6198() {
		if (anObject3666 == null) {
			Class401_Sub1_Sub1 class401_sub1_sub1 = new Class401_Sub1_Sub1();
			byte[] is = class401_sub1_sub1.method17871(128, 128, 16);
			anObject3666 = Class39.method1128(is, false, -2003634543);
		}
		if (anObject3671 == null) {
			Class401_Sub2_Sub1 class401_sub2_sub1 = new Class401_Sub2_Sub1();
			byte[] is = class401_sub2_sub1.method17811(128, 128, 16);
			anObject3671 = Class39.method1128(is, false, -360130382);
		}
	}

	Class353(Class178_Sub2 class178_sub2) {
		anInterface34_3663 = null;
		anInterface34_3670 = null;
		aClass178_Sub2_3660 = class178_sub2;
		aBool3664 = aClass178_Sub2_3660.aBool9687;
		if (aBool3664 && !aClass178_Sub2_3660.aBool9688)
			aBool3664 = false;
		if (aBool3664 && !aClass178_Sub2_3660.method15057(Class158.aClass158_1746, Class170.aClass170_1822))
			aBool3664 = false;
		if (aBool3664 || aClass178_Sub2_3660.method14990(Class158.aClass158_1746, Class170.aClass170_1822)) {
			method6194();
			if (!aBool3664) {
				anInterface37Array3665 = new Interface37[16];
				for (int i = 0; i < 16; i++) {
					byte[] is = Class144.method2377(anObject3666, i * 32768, 32768, 1313500221);
					anInterface37Array3665[i] = aClass178_Sub2_3660.method15185((Class158.aClass158_1746), 128, 128, true, is);
				}
				anInterface37Array3668 = new Interface37[16];
				for (int i = 0; i < 16; i++) {
					byte[] is = Class144.method2377(anObject3671, i * 32768, 32768, -281710932);
					anInterface37Array3668[i] = aClass178_Sub2_3660.method15185((Class158.aClass158_1746), 128, 128, true, is);
				}
			} else {
				byte[] is = Class654.method10718(anObject3666, false, -1942488881);
				anInterface34_3667 = aClass178_Sub2_3660.method15087(Class158.aClass158_1746, 128, 128, 16, true, is);
				is = Class654.method10718(anObject3671, false, -1782014120);
				anInterface34_3663 = aClass178_Sub2_3660.method15087(Class158.aClass158_1746, 128, 128, 16, true, is);
			}
		}
	}

	static void method6199() {
		if (anObject3666 == null) {
			Class401_Sub1_Sub1 class401_sub1_sub1 = new Class401_Sub1_Sub1();
			byte[] is = class401_sub1_sub1.method17871(128, 128, 16);
			anObject3666 = Class39.method1128(is, false, -261090909);
		}
		if (anObject3671 == null) {
			Class401_Sub2_Sub1 class401_sub2_sub1 = new Class401_Sub2_Sub1();
			byte[] is = class401_sub2_sub1.method17811(128, 128, 16);
			anObject3671 = Class39.method1128(is, false, 201006810);
		}
	}

	public boolean method6200() {
		return (aBool3664 ? anInterface34_3667 != null : anInterface37Array3665 != null);
	}

	public boolean method6201() {
		return (aBool3664 ? anInterface34_3667 != null : anInterface37Array3665 != null);
	}

	public boolean method6202() {
		if (!aClass178_Sub2_3660.aBool9687)
			return false;
		if (anInterface34_3670 == null) {
			if (anObject3669 == null) {
				byte[] is = Class538.method8945(128, 128, 16, 8, new Class521_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject3669 = Class39.method1128(is, false, -2093159335);
			}
			byte[] is = Class654.method10718(anObject3669, false, -1310746978);
			byte[] is_11_ = new byte[is.length * 4];
			int i = 0;
			for (int i_12_ = 0; i_12_ < 16; i_12_++) {
				int i_13_ = i_12_ * 16384;
				int i_14_ = i_13_;
				for (int i_15_ = 0; i_15_ < 128; i_15_++) {
					int i_16_ = i_14_ + i_15_ * 128;
					int i_17_ = i_14_ + (i_15_ - 1 & 0x7f) * 128;
					int i_18_ = i_14_ + (i_15_ + 1 & 0x7f) * 128;
					for (int i_19_ = 0; i_19_ < 128; i_19_++) {
						float f = (float) ((is[i_17_ + i_19_] & 0xff) - (is[i_18_ + i_19_] & 0xff));
						float f_20_ = (float) ((is[i_16_ + (i_19_ - 1 & 0x7f)] & 0xff) - (is[i_16_ + (i_19_ + 1 & 0x7f)] & 0xff));
						float f_21_ = (float) (128.0 / Math.sqrt((double) (f_20_ * f_20_ + 16384.0F + f * f)));
						is_11_[i++] = (byte) (int) (f_20_ * f_21_ + 127.0F);
						is_11_[i++] = (byte) (int) (128.0F * f_21_ + 127.0F);
						is_11_[i++] = (byte) (int) (f * f_21_ + 127.0F);
						is_11_[i++] = is[i_13_++];
					}
				}
			}
			anInterface34_3670 = aClass178_Sub2_3660.method15087(Class158.aClass158_1743, 128, 128, 16, true, is_11_);
		}
		return anInterface34_3670 != null;
	}
}
