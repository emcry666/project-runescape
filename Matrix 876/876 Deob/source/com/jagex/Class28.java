/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class28 {
	static final int anInt259 = 127;
	static final int anInt260 = 7;
	static int anInt261;

	Class28() throws Throwable {
		throw new Error();
	}

	static void method865(Class178 class178, int i, int i_0_, InterfaceComponentDefinitions class250) {
		int i_1_ = 127;
		int i_2_ = 7;
		for (int i_3_ = 63; i_3_ >= 0; i_3_--) {
			int i_4_ = (i_3_ & 0x3f) << 10 | (i_2_ & 0x7) << 7 | i_1_ & 0x7f;
			Class226.method4166(false, true, 240723773);
			int i_5_ = Class638.anIntArray8306[i_4_];
			Class305.method5552(false, true, (byte) 0);
			class178.method3193(i, (-1759297857 * class250.anInt2543 * (63 - i_3_) >> 6) + i_0_, 365308179 * class250.anInt2581, (-1759297857 * class250.anInt2543 >> 6) + 1, ~0xffffff | i_5_, 0);
		}
	}

	static void method866(Class178 class178, int i, int i_6_, InterfaceComponentDefinitions class250) {
		int i_7_ = 127;
		int i_8_ = 7;
		for (int i_9_ = 63; i_9_ >= 0; i_9_--) {
			int i_10_ = (i_9_ & 0x3f) << 10 | (i_8_ & 0x7) << 7 | i_7_ & 0x7f;
			Class226.method4166(false, true, 240723773);
			int i_11_ = Class638.anIntArray8306[i_10_];
			Class305.method5552(false, true, (byte) 0);
			class178.method3193(i, (-1759297857 * class250.anInt2543 * (63 - i_9_) >> 6) + i_6_, 365308179 * class250.anInt2581, (-1759297857 * class250.anInt2543 >> 6) + 1, ~0xffffff | i_11_, 0);
		}
	}

	static void method867(Class178 class178, int i, int i_12_, InterfaceComponentDefinitions class250) {
		int i_13_ = 127;
		int i_14_ = 7;
		for (int i_15_ = 63; i_15_ >= 0; i_15_--) {
			int i_16_ = (i_15_ & 0x3f) << 10 | (i_14_ & 0x7) << 7 | i_13_ & 0x7f;
			Class226.method4166(false, true, 240723773);
			int i_17_ = Class638.anIntArray8306[i_16_];
			Class305.method5552(false, true, (byte) 0);
			class178.method3193(i, (-1759297857 * class250.anInt2543 * (63 - i_15_) >> 6) + i_12_, 365308179 * class250.anInt2581, (-1759297857 * class250.anInt2543 >> 6) + 1, ~0xffffff | i_17_, 0);
		}
	}

	static void method868(Class178 class178, int i, int i_18_, InterfaceComponentDefinitions class250) {
		int i_19_ = 127;
		int i_20_ = 7;
		for (int i_21_ = 63; i_21_ >= 0; i_21_--) {
			int i_22_ = (i_21_ & 0x3f) << 10 | (i_20_ & 0x7) << 7 | i_19_ & 0x7f;
			Class226.method4166(false, true, 240723773);
			int i_23_ = Class638.anIntArray8306[i_22_];
			Class305.method5552(false, true, (byte) 0);
			class178.method3193(i, (-1759297857 * class250.anInt2543 * (63 - i_21_) >> 6) + i_18_, 365308179 * class250.anInt2581, (-1759297857 * class250.anInt2543 >> 6) + 1, ~0xffffff | i_23_, 0);
		}
	}

	static void method869(Class178 class178, int i, int i_24_, InterfaceComponentDefinitions class250, int i_25_) {
		for (int i_26_ = 7; i_26_ >= 0; i_26_--) {
			for (int i_27_ = 127; i_27_ >= 0; i_27_--) {
				int i_28_ = (i_25_ & 0x3f) << 10 | (i_26_ & 0x7) << 7 | i_27_ & 0x7f;
				Class226.method4166(false, true, 240723773);
				int i_29_ = Class638.anIntArray8306[i_28_];
				Class305.method5552(false, true, (byte) 0);
				class178.method3193((i_27_ * (class250.anInt2581 * 365308179) >> 7) + i, i_24_ + (-1759297857 * class250.anInt2543 * (7 - i_26_) >> 3), 1 + (365308179 * class250.anInt2581 >> 7), (-1759297857 * class250.anInt2543 >> 3) + 1, ~0xffffff | i_29_, 0);
			}
		}
	}

	static final void method870(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub21_10604.method16922(122185232) ? 1 : 0;
	}

	static final void method871(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.anInt2605 * 1569774109;
	}

	static final void method872(int i, int i_30_, int i_31_, int i_32_, int i_33_, boolean bool, boolean bool_34_, byte i_35_) {
		if (!bool && (i_30_ < 512 || i_31_ < 512 || i_30_ > (client.aClass505_11019.method8292((byte) 99) - 2) * 512 || i_31_ > (client.aClass505_11019.method8235(2106970661) - 2) * 512)) {
			float[] fs = client.aFloatArray11297;
			client.aFloatArray11297[1] = -1.0F;
			fs[0] = -1.0F;
		} else {
			int i_36_ = (Class53_Sub17.method17220(i_30_, i_31_, i, -900867289) - i_33_);
			client.aClass435_11005.method6803(Class31.aClass178_303.method3122());
			client.aClass435_11005.method6819((float) i_32_, 0.0F, 0.0F);
			Class31.aClass178_303.method3300(client.aClass435_11005);
			if (bool)
				Class31.aClass178_303.method3153((float) i_30_, (float) i_36_, (float) i_31_, client.aFloatArray11297);
			else
				Class31.aClass178_303.method3152((float) i_30_, (float) i_36_, (float) i_31_, client.aFloatArray11297);
			client.aClass435_11005.method6819((float) -i_32_, 0.0F, 0.0F);
			Class31.aClass178_303.method3300(client.aClass435_11005);
			if (!bool_34_) {
				client.aFloatArray11297[0] -= (float) (-1518026941 * client.anInt11282);
				client.aFloatArray11297[1] -= (float) (-426061495 * client.anInt11262);
			}
		}
	}

	public static boolean method873(int i, String string, int i_37_, int i_38_, int i_39_) {
		Class155.aClass1_1735 = new RSSocket();
		Class155.aClass1_1735.anInt10 = 1274525161 * i;
		Class155.aClass1_1735.aString9 = string;
		Class155.aClass1_1735.anInt11 = 1509090121 * i_37_;
		Class155.aClass1_1735.anInt12 = i_38_ * 19836347;
		return true;
	}
}
