/* Class311_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class311_Sub1 extends Class311 {
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_9995;
	Class265 aClass265_9996;
	Class270 aClass270_9997;
	public static Class472 aClass472_9998;

	boolean method15542() throws Exception_Sub3 {
		aClass265_9996 = aClass178_Sub2_3386.method15073("BatchedSprite");
		aClass523_Sub4_Sub1_9995 = aClass265_9996.method4783("SpriteSampler", 773542512);
		aClass270_9997 = aClass265_9996.method4755("Normal", 760427037);
		aClass265_9996.method4852(aClass270_9997);
		return true;
	}

	boolean method15543(byte i) throws Exception_Sub3 {
		aClass265_9996 = aClass178_Sub2_3386.method15073("BatchedSprite");
		aClass523_Sub4_Sub1_9995 = aClass265_9996.method4783("SpriteSampler", -601594454);
		aClass270_9997 = aClass265_9996.method4755("Normal", 760427037);
		aClass265_9996.method4852(aClass270_9997);
		return true;
	}

	public void method5637() {
		aClass265_9996.method4750();
		aClass265_9996.method4836(aClass523_Sub4_Sub1_9995, 0, anInterface37_3387, -1911551867);
	}

	public void method5639() {
		aClass265_9996.method4750();
		aClass265_9996.method4836(aClass523_Sub4_Sub1_9995, 0, anInterface37_3387, -1299350710);
	}

	public Class311_Sub1(Class178_Sub2 class178_sub2) throws Exception_Sub3 {
		super(class178_sub2);
		method15543((byte) 112);
	}

	public void method5638() {
		aClass265_9996.method4750();
		aClass265_9996.method4836(aClass523_Sub4_Sub1_9995, 0, anInterface37_3387, 1326342438);
	}

	public static void method15544(float f, Class437 class437, Class440 class440, Class437 class437_0_, Class437 class437_1_, Class437 class437_2_, Class437 class437_3_, float f_4_, float f_5_, float f_6_, float f_7_, int i) {
		if (!class437_0_.method6880(class437)) {
			Class437 class437_8_ = Class437.method6879(0.0F, 0.0F, 0.0F);
			Class437 class437_9_ = Class437.method6884(Class437.method6932(class437_0_, class437));
			class437_9_.method6907(class440);
			Class437 class437_10_ = Class437.method6932(class437_9_, class437_8_);
			float f_11_ = class437_10_.method6958();
			if (f_4_ > 0.0F) {
				class437_2_ = Class437.method6884(class437_2_);
				class437_2_.method6902(f_11_ / f_4_ * f_5_);
			}
			if (Float.POSITIVE_INFINITY == class437_2_.aFloat4903 || Float.isNaN(class437.aFloat4903) || f_11_ > f_6_ || f_11_ < f_7_) {
				class437.method6886(class437_0_);
				class437_1_.method6887();
			} else {
				class440.method7021();
				Class437 class437_12_ = Class437.method6879(1.0F, 0.0F, 0.0F);
				Class437 class437_13_ = Class437.method6879(0.0F, 1.0F, 0.0F);
				Class437 class437_14_ = Class437.method6879(0.0F, 0.0F, 1.0F);
				class437_12_.method6907(class440);
				class437_13_.method6907(class440);
				class437_14_.method6907(class440);
				Class437 class437_15_ = Class437.method6879(Class437.method6899(class437_12_, class437_1_), Class437.method6899(class437_13_, class437_1_), Class437.method6899(class437_14_, class437_1_));
				Class437 class437_16_ = Class437.method6884(class437_15_);
				class437_16_.method6898();
				Class437 class437_17_ = Class437.method6904(Class437.method6877(class437_16_, class437_16_), Class437.method6906(class437_2_, 2.0F));
				Class437 class437_18_ = Class437.method6884(class437_10_);
				class437_18_.method6898();
				Class437 class437_19_ = Class437.method6884(class437_15_);
				if (class437_17_.aFloat4903 > class437_18_.aFloat4903) {
					if (class437_10_.aFloat4903 < 0.0F) {
						class437_19_.aFloat4903 += class437_2_.aFloat4903 * f;
						if (class437_19_.aFloat4903 > 0.0F)
							class437_19_.aFloat4903 = 0.0F;
					} else {
						class437_19_.aFloat4903 -= f * class437_2_.aFloat4903;
						if (class437_19_.aFloat4903 < 0.0F)
							class437_19_.aFloat4903 = 0.0F;
					}
				} else if (class437_16_.aFloat4903 < class437_3_.aFloat4903) {
					if (class437_10_.aFloat4903 < 0.0F) {
						class437_19_.aFloat4903 -= f * class437_2_.aFloat4903;
						if (class437_19_.aFloat4903 < -class437_3_.aFloat4903)
							class437_19_.aFloat4903 = -class437_3_.aFloat4903;
					} else {
						class437_19_.aFloat4903 += class437_2_.aFloat4903 * f;
						if (class437_19_.aFloat4903 > class437_3_.aFloat4903)
							class437_19_.aFloat4903 = class437_3_.aFloat4903;
					}
				}
				if (class437_17_.aFloat4904 > class437_18_.aFloat4904) {
					if (class437_10_.aFloat4904 < 0.0F) {
						class437_19_.aFloat4904 += class437_2_.aFloat4904 * f;
						if (class437_19_.aFloat4904 > 0.0F)
							class437_19_.aFloat4904 = 0.0F;
					} else {
						class437_19_.aFloat4904 -= f * class437_2_.aFloat4904;
						if (class437_19_.aFloat4904 < 0.0F)
							class437_19_.aFloat4904 = 0.0F;
					}
				} else if (class437_16_.aFloat4904 < class437_3_.aFloat4904) {
					if (class437_10_.aFloat4904 < 0.0F) {
						class437_19_.aFloat4904 -= class437_2_.aFloat4904 * f;
						if (class437_19_.aFloat4904 < -class437_3_.aFloat4904)
							class437_19_.aFloat4904 = -class437_3_.aFloat4904;
					} else {
						class437_19_.aFloat4904 += f * class437_2_.aFloat4904;
						if (class437_19_.aFloat4904 > class437_3_.aFloat4904)
							class437_19_.aFloat4904 = class437_3_.aFloat4904;
					}
				}
				if (class437_17_.aFloat4905 > class437_18_.aFloat4905) {
					if (class437_10_.aFloat4905 < 0.0F) {
						class437_19_.aFloat4905 += f * class437_2_.aFloat4905;
						if (class437_19_.aFloat4905 > 0.0F)
							class437_19_.aFloat4905 = 0.0F;
					} else {
						class437_19_.aFloat4905 -= f * class437_2_.aFloat4905;
						if (class437_19_.aFloat4905 < 0.0F)
							class437_19_.aFloat4905 = 0.0F;
					}
				} else if (class437_16_.aFloat4905 < class437_3_.aFloat4905) {
					if (class437_10_.aFloat4905 < 0.0F) {
						class437_19_.aFloat4905 -= f * class437_2_.aFloat4905;
						if (class437_19_.aFloat4905 < -class437_3_.aFloat4905)
							class437_19_.aFloat4905 = -class437_3_.aFloat4905;
					} else {
						class437_19_.aFloat4905 += f * class437_2_.aFloat4905;
						if (class437_19_.aFloat4905 > class437_3_.aFloat4905)
							class437_19_.aFloat4905 = class437_3_.aFloat4905;
					}
				}
				Class437 class437_20_ = Class437.method6906(class437_12_, class437_19_.aFloat4903);
				class437_20_.method6891(class437_13_, class437_19_.aFloat4904);
				class437_20_.method6891(class437_14_, class437_19_.aFloat4905);
				class437_1_.method6910(class437_20_, 0.8F);
				class437.method6961(Class437.method6906(class437_1_, f));
				class437_16_.method6949();
				class437_19_.method6949();
				class437_18_.method6949();
			}
		}
	}

	static final void method15545(Class669 class669, byte i) {
		int i_21_ = Class412.method6644((byte) -74);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (RuntimeException_Sub4.anInt12105 = Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -18) * 1759042155) * 253624899;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_21_;
		Class526.method8725(920290028);
		client.aClass505_11019.method8294(-889374440);
		Class211.method3824(1054130424);
		client.aBool11012 = false;
	}
}
