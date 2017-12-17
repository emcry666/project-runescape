/* Class568 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class568 {
	Class568() throws Throwable {
		throw new Error();
	}

	public static void method9519(float f, Class437 class437, Class440 class440, Class437 class437_0_, Class437 class437_1_, Class437 class437_2_, float f_3_, float f_4_, float f_5_) {
		if (!class437_0_.method6880(class437)) {
			Class437 class437_6_ = Class437.method6879(0.0F, 0.0F, 0.0F);
			Class437 class437_7_ = Class437.method6884(Class437.method6932(class437_0_, class437));
			class437_7_.method6907(class440);
			Class437 class437_8_ = Class437.method6932(class437_7_, class437_6_);
			float f_9_ = class437_8_.method6958();
			if (class437_2_.aFloat4903 == Float.POSITIVE_INFINITY || Float.isNaN(class437.aFloat4903) || f_9_ > f_4_ || f_9_ < f_5_) {
				class437.method6886(class437_0_);
				class437_1_.method6887();
			} else {
				class440.method7021();
				Class437 class437_10_ = Class437.method6879(1.0F, 0.0F, 0.0F);
				Class437 class437_11_ = Class437.method6879(0.0F, 1.0F, 0.0F);
				Class437 class437_12_ = Class437.method6879(0.0F, 0.0F, 1.0F);
				class437_10_.method6907(class440);
				class437_11_.method6907(class440);
				class437_12_.method6907(class440);
				Class437 class437_13_ = Class437.method6879(Class437.method6899(class437_10_, class437_1_), Class437.method6899(class437_11_, class437_1_), Class437.method6899(class437_12_, class437_1_));
				Class437 class437_14_ = Class437.method6884(class437_13_);
				Class437 class437_15_ = (Class437.method6879(class437_2_.aFloat4903 * class437_8_.aFloat4903, class437_2_.aFloat4904 * class437_8_.aFloat4904, class437_8_.aFloat4905 * class437_2_.aFloat4905));
				class437_14_.method6891(class437_15_, f);
				class437_14_.method6905(f_3_);
				Class437 class437_16_ = Class437.method6906(class437_10_, class437_14_.aFloat4903);
				class437_16_.method6891(class437_11_, class437_14_.aFloat4904);
				class437_16_.method6891(class437_12_, class437_14_.aFloat4905);
				class437_1_.method6886(class437_16_);
				class437.method6961(Class437.method6906(class437_1_, f));
			}
		}
	}

	public static void method9520(int i) {
		synchronized (Class644.aQueue8346) {
			for (;;) {
				Class523_Sub39_Sub2 class523_sub39_sub2 = (Class523_Sub39_Sub2) Class644.aQueue8346.poll();
				if (class523_sub39_sub2 == null)
					break;
				class523_sub39_sub2.method16523((byte) -53);
			}
		}
	}

	static final void method9521(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class145_Sub1.method14915(class250, class242, class669, (byte) 3);
	}

	static final void method9522(Class669 class669, int i) {
		int i_17_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) (Class524.method8684(i_17_, 1050369988) / 60000L);
	}

	static final void method9523(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_18_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_19_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		int i_20_ = client.exchangeOfferSlots[i_19_][i_18_].method7910(817141070);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_20_ == 5 ? 1 : 0;
	}

	static final void method9524(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class461.aClass218_5122.method3969(1695999810).size();
	}
}
