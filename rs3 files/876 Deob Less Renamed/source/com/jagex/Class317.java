/* Class317 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class317 implements Interface33 {
	Class391 aClass391_3424;
	Class472 aClass472_3425;
	Class148 aClass148_3426;

	public void method208(boolean bool) {
		if (bool) {
			int i = ((2141365743 * Class170.anInt1833 > client.anInt11036 * 1536768403) ? 2141365743 * Class170.anInt1833 : client.anInt11036 * 1536768403);
			int i_0_ = ((-495986435 * Class254.anInt2742 > client.anInt11151 * -932988141) ? -495986435 * Class254.anInt2742 : client.anInt11151 * -932988141);
			int i_1_ = aClass148_3426.method38();
			int i_2_ = aClass148_3426.method2429();
			int i_3_ = 0;
			int i_4_ = i;
			int i_5_ = i_2_ * i / i_1_;
			int i_6_ = (i_0_ - i_5_) / 2;
			if (i_5_ > i_0_) {
				i_6_ = 0;
				i_5_ = i_0_;
				i_4_ = i_0_ * i_1_ / i_2_;
				i_3_ = (i - i_4_) / 2;
			}
			aClass148_3426.method2438(i_3_, i_6_, i_4_, i_5_);
		}
	}

	public void method210(int i) {
		aClass148_3426 = Class452.method7314(aClass472_3425, aClass391_3424.anInt4022 * 1911362213, (byte) -33);
	}

	public void method213(boolean bool, short i) {
		if (bool) {
			int i_7_ = ((2141365743 * Class170.anInt1833 > client.anInt11036 * 1536768403) ? 2141365743 * Class170.anInt1833 : client.anInt11036 * 1536768403);
			int i_8_ = ((-495986435 * Class254.anInt2742 > client.anInt11151 * -932988141) ? -495986435 * Class254.anInt2742 : client.anInt11151 * -932988141);
			int i_9_ = aClass148_3426.method38();
			int i_10_ = aClass148_3426.method2429();
			int i_11_ = 0;
			int i_12_ = i_7_;
			int i_13_ = i_10_ * i_7_ / i_9_;
			int i_14_ = (i_8_ - i_13_) / 2;
			if (i_13_ > i_8_) {
				i_14_ = 0;
				i_13_ = i_8_;
				i_12_ = i_8_ * i_9_ / i_10_;
				i_11_ = (i_7_ - i_12_) / 2;
			}
			aClass148_3426.method2438(i_11_, i_14_, i_12_, i_13_);
		}
	}

	public void method212() {
		aClass148_3426 = Class452.method7314(aClass472_3425, aClass391_3424.anInt4022 * 1911362213, (byte) -104);
	}

	Class317(Class472 class472, Class391 class391) {
		aClass472_3425 = class472;
		aClass391_3424 = class391;
	}

	public boolean method211() {
		return aClass472_3425.method7650(1911362213 * aClass391_3424.anInt4022, 50966702);
	}

	public boolean method209(byte i) {
		return aClass472_3425.method7650(1911362213 * aClass391_3424.anInt4022, 313755563);
	}

	static final void method5687(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class634.method10406(class250, class242, class669, 813909843);
	}

	static final void method5688(byte i) {
		Class286.method5152((byte) -114);
		client.aClass505_11019.method8274(1759211772);
		for (int i_15_ = 0; i_15_ < client.aClass111Array11017.length; i_15_++)
			client.aClass111Array11017[i_15_] = null;
		for (int i_16_ = 0; i_16_ < client.aClass540Array11018.length; i_16_++)
			client.aClass540Array11018[i_16_] = null;
		Class324.method5733(-552040456);
		for (int i_17_ = 0; i_17_ < 2048; i_17_++)
			client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_17_] = null;
		client.anInt11050 = 0;
		client.aClass14_11047.method733(-1570873203);
		client.anInt11049 = 0;
		client.aClass14_11172.method733(-947033344);
		Class313.method5656(Class557.method9224(-2132334046), 743172261);
		client.anInt11060 = 0;
		Class98_Sub1_Sub2.playerVarsProvider.aClass590_1348.method9755(-178244322);
		Class143.aClass334_1693 = null;
		Class194_Sub6.aClass334_9900 = null;
		Class675.aClass523_Sub19_8632 = null;
		Class673.aClass523_Sub19_8611 = null;
		Class461.aClass218_5122 = null;
		client.aBool11302 = true;
		Class168_Sub2.aClass640_9786 = null;
		Class520.aLong7060 = 0L;
		Class524.method8685(-522212835);
		Class648.method10616(-2055419416);
	}

	static final void method5689(Class669 class669, int i) {
		int i_18_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class523_Sub27_Sub17 class523_sub27_sub17 = Class534.method8813(i_18_);
		if (null == class523_sub27_sub17) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
		} else {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class523_sub27_sub17.anInt11830 * -332434647;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class523_sub27_sub17.anInt11832 * 1023249187;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -267562095 * class523_sub27_sub17.anInt11828;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1856765435 * class523_sub27_sub17.anInt11833;
		}
	}
}
