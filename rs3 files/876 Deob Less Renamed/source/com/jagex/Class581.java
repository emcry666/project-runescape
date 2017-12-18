/* Class581 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class581 implements Interface66 {
	String aString7704;
	Class29 aClass29_7705;
	int anInt7706;
	String aString7707;

	public void method210(int i) {
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4255, client.aClass116_11058.aClass11_1413, 1370050649);
		int i_0_ = ((class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 += 189765723) * 2349011);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(aClass29_7705.method82(), -868978606);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(aString7707, (byte) 5);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(-1008475257 * anInt7706, (byte) -96);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(Class509.aString5725, (byte) 57);
		if (aString7704 != null) {
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(1, -674108822);
			String string = aString7704;
			if (string.length() > 100)
				string = string.substring(0, 100);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) 17);
		} else
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(0, -866202004);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16276((2349011 * class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 - i_0_), 1532677551);
		client.aClass116_11058.method1974(class523_sub22, (byte) 54);
	}

	public void method292() {
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4255, client.aClass116_11058.aClass11_1413, 1370050649);
		int i = ((class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 += 189765723) * 2349011);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(aClass29_7705.method82(), 1372709257);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(aString7707, (byte) -22);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(-1008475257 * anInt7706, (byte) -92);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(Class509.aString5725, (byte) 34);
		if (aString7704 != null) {
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(1, -1329356393);
			String string = aString7704;
			if (string.length() > 100)
				string = string.substring(0, 100);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) 26);
		} else
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(0, 1970132166);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16276((2349011 * class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 - i), 1789918335);
		client.aClass116_11058.method1974(class523_sub22, (byte) 62);
	}

	Class581(Class29 class29, String string, int i, Throwable throwable) {
		aClass29_7705 = class29;
		aString7707 = string;
		anInt7706 = -1182240201 * i;
		aString7704 = throwable != null ? throwable.getMessage() : null;
	}

	static final void method9661(Class250 class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (Class594.method9807(string, class669, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2667 = Class78.method1554(string, class669, -68449792);
		class250.aBool2635 = true;
	}

	static final void method9662(Class669 class669, int i) {
		Class535.method8919(class669.aClass647_Sub1_Sub3_Sub1_8552, class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)], true, (short) -18784);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) client.aFloatArray11297[0];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) client.aFloatArray11297[1];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) client.aFloatArray11297[2];
	}

	public static void method9663(float f, Class437 class437, Class437 class437_1_, Class437 class437_2_, Class437 class437_3_, Class437 class437_4_, float f_5_, float f_6_, float f_7_, float f_8_, int i) {
		if (!class437_1_.method6880(class437)) {
			Class437 class437_9_ = Class437.method6932(class437_1_, class437);
			float f_10_ = class437_9_.method6958();
			if (f_5_ > 0.0F) {
				class437_3_ = Class437.method6884(class437_3_);
				class437_3_.method6902(f_6_ * (f_10_ / f_5_));
			}
			if (class437_3_.aFloat4903 == Float.POSITIVE_INFINITY || Float.isNaN(class437.aFloat4903) || f_10_ > f_7_) {
				class437.method6886(class437_1_);
				class437_2_.method6887();
			} else {
				Class437 class437_11_ = Class437.method6884(class437_2_);
				class437_11_.method6898();
				Class437 class437_12_ = Class437.method6904(class437_11_, class437_3_);
				Class437 class437_13_ = Class437.method6877(class437_11_, class437_12_);
				class437_13_.method6902(0.5F);
				Class437 class437_14_ = Class437.method6884(class437_2_);
				Class437 class437_15_ = Class437.method6884(class437_9_);
				class437_15_.method6898();
				if (class437_13_.aFloat4903 > class437_15_.aFloat4903) {
					if (class437_9_.aFloat4903 < 0.0F) {
						class437_14_.aFloat4903 += class437_3_.aFloat4903 * f;
						if (class437_14_.aFloat4903 > 0.0F)
							class437_14_.aFloat4903 = 0.0F;
					} else {
						class437_14_.aFloat4903 -= class437_3_.aFloat4903 * f;
						if (class437_14_.aFloat4903 < 0.0F)
							class437_14_.aFloat4903 = 0.0F;
					}
				} else if (class437_11_.aFloat4903 < class437_4_.aFloat4903) {
					if (class437_9_.aFloat4903 < 0.0F) {
						class437_14_.aFloat4903 -= class437_3_.aFloat4903 * f;
						if (class437_14_.aFloat4903 < -class437_4_.aFloat4903)
							class437_14_.aFloat4903 = -class437_4_.aFloat4903;
					} else {
						class437_14_.aFloat4903 += class437_3_.aFloat4903 * f;
						if (class437_14_.aFloat4903 > class437_4_.aFloat4903)
							class437_14_.aFloat4903 = class437_4_.aFloat4903;
					}
				}
				if (class437_13_.aFloat4904 > class437_15_.aFloat4904) {
					if (class437_9_.aFloat4904 < 0.0F) {
						class437_14_.aFloat4904 += f * class437_3_.aFloat4904;
						if (class437_14_.aFloat4904 > 0.0F)
							class437_14_.aFloat4904 = 0.0F;
					} else {
						class437_14_.aFloat4904 -= class437_3_.aFloat4904 * f;
						if (class437_14_.aFloat4904 < 0.0F)
							class437_14_.aFloat4904 = 0.0F;
					}
				} else if (class437_11_.aFloat4904 < class437_4_.aFloat4904) {
					if (class437_9_.aFloat4904 < 0.0F) {
						class437_14_.aFloat4904 -= class437_3_.aFloat4904 * f;
						if (class437_14_.aFloat4904 < -class437_4_.aFloat4904)
							class437_14_.aFloat4904 = -class437_4_.aFloat4904;
					} else {
						class437_14_.aFloat4904 += class437_3_.aFloat4904 * f;
						if (class437_14_.aFloat4904 > class437_4_.aFloat4904)
							class437_14_.aFloat4904 = class437_4_.aFloat4904;
					}
				}
				if (class437_13_.aFloat4905 > class437_15_.aFloat4905) {
					if (class437_9_.aFloat4905 < 0.0F) {
						class437_14_.aFloat4905 += f * class437_3_.aFloat4905;
						if (class437_14_.aFloat4905 > 0.0F)
							class437_14_.aFloat4905 = 0.0F;
					} else {
						class437_14_.aFloat4905 -= f * class437_3_.aFloat4905;
						if (class437_14_.aFloat4905 < 0.0F)
							class437_14_.aFloat4905 = 0.0F;
					}
				} else if (class437_11_.aFloat4905 < class437_4_.aFloat4905) {
					if (class437_9_.aFloat4905 < 0.0F) {
						class437_14_.aFloat4905 -= class437_3_.aFloat4905 * f;
						if (class437_14_.aFloat4905 < -class437_4_.aFloat4905)
							class437_14_.aFloat4905 = -class437_4_.aFloat4905;
					} else {
						class437_14_.aFloat4905 += class437_3_.aFloat4905 * f;
						if (class437_14_.aFloat4905 > class437_4_.aFloat4905)
							class437_14_.aFloat4905 = class437_4_.aFloat4905;
					}
				}
				class437_2_.method6910(class437_14_, 0.8F);
				if (f_10_ < f_8_ && class437_2_.method6958() < f_8_) {
					class437.method6886(class437_1_);
					class437_2_.method6887();
				} else
					class437.method6961(Class437.method6906(class437_2_, f));
				class437_11_.method6949();
				class437_14_.method6949();
				class437_15_.method6949();
			}
		}
	}

	static final void method9664(int i, int i_16_, int i_17_) {
		Class104.anInt1269 = -250567387 * i;
		Class104.anInt1270 = -1284332517 * i_16_;
		Class104.aBool1265 = false;
		Class84.method1597(495131358);
	}
}
