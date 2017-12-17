/* Class196 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class196 implements Interface58 {
	Class217 this$0;

	public void method376(Object object, float[] fs, Object[] objects, byte i) {
		Class489 class489 = (Class489) object;
		Class437 class437 = class489.method8035(671376946);
		float f = class489.method7959((byte) 103);
		float f_0_ = class489.method7962(2097005748);
		Class437 class437_1_ = Class437.method6932(class437, this$0.method3856(363755316));
		float f_2_ = 0.0F;
		float f_3_ = class437_1_.method6958();
		if (f_3_ >= f_0_)
			f_2_ = 0.0F;
		if (f_3_ <= f)
			f_2_ = 1.0F;
		else {
			float f_4_ = 1.0F - 1.0F / (f_0_ - f) * (f_3_ - f);
			if ((double) f_4_ < 0.0 || (double) f_4_ > 1.0)
				f_4_ = Math.min(Math.max(f_4_, 0.0F), 1.0F);
			f_2_ = f_4_;
		}
		int i_5_ = 8192;
		float f_6_ = 0.0F;
		if (2 == Class562.anInt7564 * 2097396553) {
			float f_7_ = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-1706788405);
			if (class437_1_.aFloat4903 != 0.0F || class437_1_.aFloat4905 != 0.0F) {
				int i_8_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_7_)) - (int) (Math.atan2((double) class437_1_.aFloat4903, (double) class437_1_.aFloat4905) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_8_ > 8192)
					i_8_ = 16384 - i_8_;
				int i_9_;
				if (f_3_ <= 0.0F)
					i_9_ = 8192;
				else if (f_3_ >= 4096.0F)
					i_9_ = 16384;
				else
					i_9_ = (int) (8192.0F + 8192.0F * f_3_ / 4096.0F);
				i_5_ = (16384 - i_9_ >> 1) + i_9_ * i_8_ / 8192;
			}
			f_6_ = 6.1035156E-5F * (float) i_5_;
		} else {
			if (0.0F != class437_1_.aFloat4903 || class437_1_.aFloat4905 != 0.0F) {
				int i_10_ = ((-(Class424.anInt4817 * 325333285) - (int) (Math.atan2((double) class437_1_.aFloat4903, (double) class437_1_.aFloat4905) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_10_ > 8192)
					i_10_ = 16384 - i_10_;
				int i_11_;
				if (f_3_ <= 0.0F)
					i_11_ = 8192;
				else if (f_3_ >= 4096.0F)
					i_11_ = 16384;
				else
					i_11_ = (int) (8192.0F + f_3_ * 8192.0F / 4096.0F);
				i_5_ = (16384 - i_11_ >> 1) + i_10_ * i_11_ / 8192;
			}
			f_6_ = 6.1035156E-5F * (float) i_5_;
		}
		fs[0] = (float) (i_5_ < 0 ? (double) f_2_ : ((double) f_2_ * Math.sqrt((double) (2.0F * (1.0F - f_6_)))));
		fs[1] = (float) (i_5_ < 0 ? (double) -f_2_ : (double) f_2_ * Math.sqrt((double) (f_6_ * 2.0F)));
	}

	Class196(Class217 class217) {
		this$0 = class217;
	}

	public void method377(Object object, float[] fs, Object[] objects) {
		Class489 class489 = (Class489) object;
		Class437 class437 = class489.method8035(-2139564786);
		float f = class489.method7959((byte) 42);
		float f_12_ = class489.method7962(-305342806);
		Class437 class437_13_ = Class437.method6932(class437, this$0.method3856(1707923020));
		float f_14_ = 0.0F;
		float f_15_ = class437_13_.method6958();
		if (f_15_ >= f_12_)
			f_14_ = 0.0F;
		if (f_15_ <= f)
			f_14_ = 1.0F;
		else {
			float f_16_ = 1.0F - 1.0F / (f_12_ - f) * (f_15_ - f);
			if ((double) f_16_ < 0.0 || (double) f_16_ > 1.0)
				f_16_ = Math.min(Math.max(f_16_, 0.0F), 1.0F);
			f_14_ = f_16_;
		}
		int i = 8192;
		float f_17_ = 0.0F;
		if (2 == Class562.anInt7564 * 2097396553) {
			float f_18_ = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-577835854);
			if (class437_13_.aFloat4903 != 0.0F || class437_13_.aFloat4905 != 0.0F) {
				int i_19_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_18_)) - (int) (Math.atan2((double) class437_13_.aFloat4903, (double) class437_13_.aFloat4905) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_19_ > 8192)
					i_19_ = 16384 - i_19_;
				int i_20_;
				if (f_15_ <= 0.0F)
					i_20_ = 8192;
				else if (f_15_ >= 4096.0F)
					i_20_ = 16384;
				else
					i_20_ = (int) (8192.0F + 8192.0F * f_15_ / 4096.0F);
				i = (16384 - i_20_ >> 1) + i_20_ * i_19_ / 8192;
			}
			f_17_ = 6.1035156E-5F * (float) i;
		} else {
			if (0.0F != class437_13_.aFloat4903 || class437_13_.aFloat4905 != 0.0F) {
				int i_21_ = ((-(Class424.anInt4817 * 325333285) - (int) (Math.atan2((double) class437_13_.aFloat4903, (double) class437_13_.aFloat4905) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_21_ > 8192)
					i_21_ = 16384 - i_21_;
				int i_22_;
				if (f_15_ <= 0.0F)
					i_22_ = 8192;
				else if (f_15_ >= 4096.0F)
					i_22_ = 16384;
				else
					i_22_ = (int) (8192.0F + f_15_ * 8192.0F / 4096.0F);
				i = (16384 - i_22_ >> 1) + i_21_ * i_22_ / 8192;
			}
			f_17_ = 6.1035156E-5F * (float) i;
		}
		fs[0] = (float) (i < 0 ? (double) f_14_ : ((double) f_14_ * Math.sqrt((double) (2.0F * (1.0F - f_17_)))));
		fs[1] = (float) (i < 0 ? (double) -f_14_ : (double) f_14_ * Math.sqrt((double) (f_17_ * 2.0F)));
	}

	public void method378(Object object, float[] fs, Object[] objects) {
		Class489 class489 = (Class489) object;
		Class437 class437 = class489.method8035(1585006445);
		float f = class489.method7959((byte) 15);
		float f_23_ = class489.method7962(1819075692);
		Class437 class437_24_ = Class437.method6932(class437, this$0.method3856(-50761844));
		float f_25_ = 0.0F;
		float f_26_ = class437_24_.method6958();
		if (f_26_ >= f_23_)
			f_25_ = 0.0F;
		if (f_26_ <= f)
			f_25_ = 1.0F;
		else {
			float f_27_ = 1.0F - 1.0F / (f_23_ - f) * (f_26_ - f);
			if ((double) f_27_ < 0.0 || (double) f_27_ > 1.0)
				f_27_ = Math.min(Math.max(f_27_, 0.0F), 1.0F);
			f_25_ = f_27_;
		}
		int i = 8192;
		float f_28_ = 0.0F;
		if (2 == Class562.anInt7564 * 2097396553) {
			float f_29_ = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-1777623557);
			if (class437_24_.aFloat4903 != 0.0F || class437_24_.aFloat4905 != 0.0F) {
				int i_30_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_29_)) - (int) (Math.atan2((double) class437_24_.aFloat4903, (double) class437_24_.aFloat4905) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_30_ > 8192)
					i_30_ = 16384 - i_30_;
				int i_31_;
				if (f_26_ <= 0.0F)
					i_31_ = 8192;
				else if (f_26_ >= 4096.0F)
					i_31_ = 16384;
				else
					i_31_ = (int) (8192.0F + 8192.0F * f_26_ / 4096.0F);
				i = (16384 - i_31_ >> 1) + i_31_ * i_30_ / 8192;
			}
			f_28_ = 6.1035156E-5F * (float) i;
		} else {
			if (0.0F != class437_24_.aFloat4903 || class437_24_.aFloat4905 != 0.0F) {
				int i_32_ = ((-(Class424.anInt4817 * 325333285) - (int) (Math.atan2((double) class437_24_.aFloat4903, (double) class437_24_.aFloat4905) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_32_ > 8192)
					i_32_ = 16384 - i_32_;
				int i_33_;
				if (f_26_ <= 0.0F)
					i_33_ = 8192;
				else if (f_26_ >= 4096.0F)
					i_33_ = 16384;
				else
					i_33_ = (int) (8192.0F + f_26_ * 8192.0F / 4096.0F);
				i = (16384 - i_33_ >> 1) + i_32_ * i_33_ / 8192;
			}
			f_28_ = 6.1035156E-5F * (float) i;
		}
		fs[0] = (float) (i < 0 ? (double) f_25_ : ((double) f_25_ * Math.sqrt((double) (2.0F * (1.0F - f_28_)))));
		fs[1] = (float) (i < 0 ? (double) -f_25_ : (double) f_25_ * Math.sqrt((double) (f_28_ * 2.0F)));
	}

	public void method379(Object object, float[] fs, Object[] objects) {
		Class489 class489 = (Class489) object;
		Class437 class437 = class489.method8035(-1723874729);
		float f = class489.method7959((byte) 84);
		float f_34_ = class489.method7962(1276290992);
		Class437 class437_35_ = Class437.method6932(class437, this$0.method3856(1914155433));
		float f_36_ = 0.0F;
		float f_37_ = class437_35_.method6958();
		if (f_37_ >= f_34_)
			f_36_ = 0.0F;
		if (f_37_ <= f)
			f_36_ = 1.0F;
		else {
			float f_38_ = 1.0F - 1.0F / (f_34_ - f) * (f_37_ - f);
			if ((double) f_38_ < 0.0 || (double) f_38_ > 1.0)
				f_38_ = Math.min(Math.max(f_38_, 0.0F), 1.0F);
			f_36_ = f_38_;
		}
		int i = 8192;
		float f_39_ = 0.0F;
		if (2 == Class562.anInt7564 * 2097396553) {
			float f_40_ = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-694406519);
			if (class437_35_.aFloat4903 != 0.0F || class437_35_.aFloat4905 != 0.0F) {
				int i_41_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_40_)) - (int) (Math.atan2((double) class437_35_.aFloat4903, (double) class437_35_.aFloat4905) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_41_ > 8192)
					i_41_ = 16384 - i_41_;
				int i_42_;
				if (f_37_ <= 0.0F)
					i_42_ = 8192;
				else if (f_37_ >= 4096.0F)
					i_42_ = 16384;
				else
					i_42_ = (int) (8192.0F + 8192.0F * f_37_ / 4096.0F);
				i = (16384 - i_42_ >> 1) + i_42_ * i_41_ / 8192;
			}
			f_39_ = 6.1035156E-5F * (float) i;
		} else {
			if (0.0F != class437_35_.aFloat4903 || class437_35_.aFloat4905 != 0.0F) {
				int i_43_ = ((-(Class424.anInt4817 * 325333285) - (int) (Math.atan2((double) class437_35_.aFloat4903, (double) class437_35_.aFloat4905) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_43_ > 8192)
					i_43_ = 16384 - i_43_;
				int i_44_;
				if (f_37_ <= 0.0F)
					i_44_ = 8192;
				else if (f_37_ >= 4096.0F)
					i_44_ = 16384;
				else
					i_44_ = (int) (8192.0F + f_37_ * 8192.0F / 4096.0F);
				i = (16384 - i_44_ >> 1) + i_43_ * i_44_ / 8192;
			}
			f_39_ = 6.1035156E-5F * (float) i;
		}
		fs[0] = (float) (i < 0 ? (double) f_36_ : ((double) f_36_ * Math.sqrt((double) (2.0F * (1.0F - f_39_)))));
		fs[1] = (float) (i < 0 ? (double) -f_36_ : (double) f_36_ * Math.sqrt((double) (f_39_ * 2.0F)));
	}

	static final void method3666(Class669 class669, byte i) {
		int i_45_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		Class115.method1970(i_45_, string, (byte) -97);
	}

	static final void method3667(Class669 class669, int i) {
		int i_46_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_46_, -1353203486);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (class250.anInt2570 * -428962391 == 1 ? -2080195333 * class250.anInt2571 : -1);
	}

	static final void method3668(byte i) {
		for (Class523_Sub27_Sub5 class523_sub27_sub5 = ((Class523_Sub27_Sub5) client.aClass708_11074.method14240(2059423785)); null != class523_sub27_sub5; class523_sub27_sub5 = ((Class523_Sub27_Sub5) client.aClass708_11074.method14244((byte) 39))) {
			Class647_Sub1_Sub3_Sub6 class647_sub1_sub3_sub6 = class523_sub27_sub5.aClass647_Sub1_Sub3_Sub6_11623;
			if (client.anInt11011 > -82135273 * class647_sub1_sub3_sub6.anInt12137) {
				class523_sub27_sub5.method8661(607052656);
				class647_sub1_sub3_sub6.method18600(766265633);
			} else if (client.anInt11011 >= class647_sub1_sub3_sub6.anInt12136 * -165356647) {
				class647_sub1_sub3_sub6.method18597((byte) 53);
				if (-803039009 * class647_sub1_sub3_sub6.anInt12154 > 0) {
					if (-1616721887 * client.anInt11071 == 4) {
						Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = Class191.aClass192Array2157[(class647_sub1_sub3_sub6.anInt12154 * -803039009) - 1].method3631(1477407209);
						if (class647_sub1_sub3_sub1 != null) {
							Class437 class437 = (class647_sub1_sub3_sub1.method10569().aClass437_4862);
							if ((int) class437.aFloat4903 >= 0 && ((int) class437.aFloat4903 < client.aClass505_11019.method8292((byte) 11) * 512) && (int) class437.aFloat4905 >= 0 && ((int) class437.aFloat4905 < client.aClass505_11019.method8235(2100867470) * 512))
								class647_sub1_sub3_sub6.method18596((int) class437.aFloat4903, (int) class437.aFloat4905, ((Class53_Sub17.method17220((int) class437.aFloat4903, (int) class437.aFloat4905, class647_sub1_sub3_sub1.aByte10821, -1129982151)) - 342507587 * (class647_sub1_sub3_sub6.anInt12135)), client.anInt11011, -1941086209);
						}
					} else {
						Class523_Sub28 class523_sub28 = ((Class523_Sub28) (client.aClass14_11047.method741((long) ((-803039009 * class647_sub1_sub3_sub6.anInt12154) - 1))));
						if (null != class523_sub28) {
							Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
							Class437 class437 = (class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862);
							if ((int) class437.aFloat4903 >= 0 && ((int) class437.aFloat4903 < client.aClass505_11019.method8292((byte) 126) * 512) && (int) class437.aFloat4905 >= 0 && ((int) class437.aFloat4905 < client.aClass505_11019.method8235(2112853327) * 512))
								class647_sub1_sub3_sub6.method18596((int) class437.aFloat4903, (int) class437.aFloat4905, ((Class53_Sub17.method17220((int) class437.aFloat4903, (int) class437.aFloat4905, class647_sub1_sub3_sub6.aByte10821, -294872371)) - 342507587 * (class647_sub1_sub3_sub6.anInt12135)), client.anInt11011, 536312846);
						}
					}
				}
				if (-803039009 * class647_sub1_sub3_sub6.anInt12154 < 0) {
					int i_47_ = (-(class647_sub1_sub3_sub6.anInt12154 * -803039009) - 1);
					Player class647_sub1_sub3_sub1_sub2;
					if (i_47_ == 1109726117 * client.anInt11154)
						class647_sub1_sub3_sub1_sub2 = Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453;
					else
						class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_47_]);
					if (class647_sub1_sub3_sub1_sub2 != null) {
						Class437 class437 = (class647_sub1_sub3_sub1_sub2.method10569().aClass437_4862);
						if ((int) class437.aFloat4903 >= 0 && ((int) class437.aFloat4903 < client.aClass505_11019.method8292((byte) 103) * 512) && (int) class437.aFloat4905 >= 0 && ((int) class437.aFloat4905 < client.aClass505_11019.method8235(2126337954) * 512))
							class647_sub1_sub3_sub6.method18596((int) class437.aFloat4903, (int) class437.aFloat4905, ((Class53_Sub17.method17220((int) class437.aFloat4903, (int) class437.aFloat4905, class647_sub1_sub3_sub6.aByte10821, -684964823)) - (342507587 * class647_sub1_sub3_sub6.anInt12135)), client.anInt11011, 1526337607);
					}
				}
				class647_sub1_sub3_sub6.method18605(client.anInt11059 * 1673150439, (byte) 99);
				client.aClass505_11019.method8241((byte) -88).method9268(class647_sub1_sub3_sub6, true, (byte) 95);
			}
		}
	}

	static final void method3669(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}
}
