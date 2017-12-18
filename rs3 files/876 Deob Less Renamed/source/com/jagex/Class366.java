/* Class366 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class366 {
	float aFloat3868;
	Class366 aClass366_3869;
	Interface44 anInterface44_3870;
	float aFloat3871;
	float aFloat3872;
	float aFloat3873;
	long aLong3874;
	long aLong3875;

	float method6300() {
		return aFloat3871;
	}

	float method6301(short i) {
		return aFloat3871;
	}

	public float method6302(int i) {
		float f = 1.0F;
		for (Class366 class366_0_ = this; null != class366_0_; class366_0_ = class366_0_.method6319((byte) 14))
			f *= class366_0_.method6301((short) 1257);
		return f;
	}

	void method6303(byte i) {
		if (anInterface44_3870 != null) {
			float f = anInterface44_3870.method338((short) 20804);
			if (aFloat3872 != f && aFloat3868 < 0.0F) {
				aFloat3873 = aFloat3872;
				aFloat3868 = f;
				aLong3874 = Class248.method4401(1516375036) * -1292394744351011151L;
				aLong3875 = (-5155629226489502996L + aLong3874 * -4648023531823504413L);
			}
		}
		if (aFloat3868 >= 0.0F) {
			long l = Class248.method4401(1516375036);
			if (l > aLong3875 * 2432411006603265851L) {
				aFloat3872 = aFloat3868;
				aFloat3868 = -1.0F;
			} else {
				float f = aFloat3868 - aFloat3873;
				long l_1_ = (aLong3875 * 2432411006603265851L - 1359647296045922897L * aLong3874);
				float f_2_ = f / (float) l_1_;
				aFloat3872 = ((float) (l - aLong3874 * 1359647296045922897L) * f_2_ + aFloat3873);
				if (aFloat3868 == aFloat3872)
					aFloat3868 = -1.0F;
			}
		}
		aFloat3872 = Math.min(1.0F, Math.max(aFloat3872, 0.0F));
	}

	public float method6304() {
		float f = aFloat3872;
		for (Class366 class366_3_ = aClass366_3869; null != class366_3_; class366_3_ = class366_3_.method6319((byte) 14))
			f *= class366_3_.method6314(-320853210);
		f = Math.min(Math.max(f, 0.0F), 1.0F);
		return f;
	}

	public float method6305() {
		float f = aFloat3872;
		for (Class366 class366_4_ = aClass366_3869; null != class366_4_; class366_4_ = class366_4_.method6319((byte) 14))
			f *= class366_4_.method6314(-761570004);
		f = Math.min(Math.max(f, 0.0F), 1.0F);
		return f;
	}

	public Class366 method6306() {
		return aClass366_3869;
	}

	float method6307() {
		return aFloat3871;
	}

	float method6308() {
		return aFloat3871;
	}

	float method6309() {
		return aFloat3871;
	}

	public float method6310(int i) {
		float f = aFloat3872;
		for (Class366 class366_5_ = aClass366_3869; null != class366_5_; class366_5_ = class366_5_.method6319((byte) 14))
			f *= class366_5_.method6314(-869021754);
		f = Math.min(Math.max(f, 0.0F), 1.0F);
		return f;
	}

	public float method6311() {
		return aFloat3872;
	}

	public float method6312() {
		float f = 1.0F;
		for (Class366 class366_6_ = this; null != class366_6_; class366_6_ = class366_6_.method6319((byte) 14))
			f *= class366_6_.method6301((short) 1257);
		return f;
	}

	public float method6313() {
		float f = 1.0F;
		for (Class366 class366_7_ = this; null != class366_7_; class366_7_ = class366_7_.method6319((byte) 14))
			f *= class366_7_.method6301((short) 1257);
		return f;
	}

	public float method6314(int i) {
		return aFloat3872;
	}

	void method6315() {
		if (anInterface44_3870 != null) {
			float f = anInterface44_3870.method338((short) 14743);
			if (aFloat3872 != f && aFloat3868 < 0.0F) {
				aFloat3873 = aFloat3872;
				aFloat3868 = f;
				aLong3874 = Class248.method4401(1516375036) * -1292394744351011151L;
				aLong3875 = (-5155629226489502996L + aLong3874 * -4648023531823504413L);
			}
		}
		if (aFloat3868 >= 0.0F) {
			long l = Class248.method4401(1516375036);
			if (l > aLong3875 * 2432411006603265851L) {
				aFloat3872 = aFloat3868;
				aFloat3868 = -1.0F;
			} else {
				float f = aFloat3868 - aFloat3873;
				long l_8_ = (aLong3875 * 2432411006603265851L - 1359647296045922897L * aLong3874);
				float f_9_ = f / (float) l_8_;
				aFloat3872 = ((float) (l - aLong3874 * 1359647296045922897L) * f_9_ + aFloat3873);
				if (aFloat3868 == aFloat3872)
					aFloat3868 = -1.0F;
			}
		}
		aFloat3872 = Math.min(1.0F, Math.max(aFloat3872, 0.0F));
	}

	Class366(int i, float f, Object object, Class369 class369, Interface44 interface44, Class366 class366_10_) {
		aClass366_3869 = class366_10_;
		anInterface44_3870 = interface44;
		aFloat3872 = 1.0F;
		aFloat3871 = f;
		aFloat3873 = -1.0F;
		aFloat3868 = -1.0F;
		aLong3874 = 1292394744351011151L;
		aLong3875 = 3556437666269709837L;
	}

	public void method6316(float f, byte i) {
		if (null == anInterface44_3870) {
			aFloat3868 = f;
			aFloat3873 = aFloat3872;
			aLong3874 = Class248.method4401(1516375036) * -1292394744351011151L;
			aLong3875 = -4648023531823504413L * aLong3874 + -5155629226489502996L;
		}
	}

	public float method6317() {
		float f = aFloat3872;
		for (Class366 class366_11_ = aClass366_3869; null != class366_11_; class366_11_ = class366_11_.method6319((byte) 14))
			f *= class366_11_.method6314(-1099382197);
		f = Math.min(Math.max(f, 0.0F), 1.0F);
		return f;
	}

	public float method6318() {
		return aFloat3872;
	}

	public Class366 method6319(byte i) {
		return aClass366_3869;
	}

	public void method6320(float f) {
		if (null == anInterface44_3870) {
			aFloat3868 = f;
			aFloat3873 = aFloat3872;
			aLong3874 = Class248.method4401(1516375036) * -1292394744351011151L;
			aLong3875 = -4648023531823504413L * aLong3874 + -5155629226489502996L;
		}
	}

	public Class366 method6321() {
		return aClass366_3869;
	}

	public Class366 method6322() {
		return aClass366_3869;
	}

	void method6323() {
		if (anInterface44_3870 != null) {
			float f = anInterface44_3870.method338((short) 16336);
			if (aFloat3872 != f && aFloat3868 < 0.0F) {
				aFloat3873 = aFloat3872;
				aFloat3868 = f;
				aLong3874 = Class248.method4401(1516375036) * -1292394744351011151L;
				aLong3875 = (-5155629226489502996L + aLong3874 * -4648023531823504413L);
			}
		}
		if (aFloat3868 >= 0.0F) {
			long l = Class248.method4401(1516375036);
			if (l > aLong3875 * 2432411006603265851L) {
				aFloat3872 = aFloat3868;
				aFloat3868 = -1.0F;
			} else {
				float f = aFloat3868 - aFloat3873;
				long l_12_ = (aLong3875 * 2432411006603265851L - 1359647296045922897L * aLong3874);
				float f_13_ = f / (float) l_12_;
				aFloat3872 = ((float) (l - aLong3874 * 1359647296045922897L) * f_13_ + aFloat3873);
				if (aFloat3868 == aFloat3872)
					aFloat3868 = -1.0F;
			}
		}
		aFloat3872 = Math.min(1.0F, Math.max(aFloat3872, 0.0F));
	}

	public static final boolean method6324(int i) {
		return 1 != -1905499279 * Class43.anInt601;
	}

	public static void method6325(int i, int i_14_) {
		Class540.anInt7219 = i * -958065343;
	}

	static final void method6326(Class250 class250, Class242 class242, Class669 class669, byte i) {
		class250.aString2639 = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
	}

	static final void method6327(Class669 class669, byte i) {
		int i_15_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_15_, -542376996);
		Class242 class242 = Class31.aClass242Array302[i_15_ >> 16];
		Class39.method1126(class250, class242, class669, 1734160343);
	}

	static final void method6328(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub16_10624.method16885(712211183) ? 1 : 0;
	}

	static final void method6329(Class669 class669, byte i) {
		int i_16_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		int[] is = Class390.method6486(i_16_, 431187916);
		Class698.method14058(is, 0, class669.anIntArray8557, 1357652815 * class669.anInt8558, 3);
		class669.anInt8558 += 2121349901;
	}

	static final void method6330(Class669 class669, int i) {
		int i_17_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class523_Sub27_Sub17 class523_sub27_sub17 = Class502.method8158((byte) 125);
		if (null != class523_sub27_sub17) {
			boolean bool = class523_sub27_sub17.method18193(i_17_ >> 28 & 0x3, i_17_ >> 14 & 0x3fff, i_17_ & 0x3fff, Class663.anIntArray8517, (short) 23670);
			if (bool)
				Class241.method4361(Class663.anIntArray8517[1], Class663.anIntArray8517[2], (byte) -36);
		}
	}
}
