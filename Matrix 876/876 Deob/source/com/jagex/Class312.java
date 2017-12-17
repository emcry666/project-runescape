/* Class312 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class312 implements Interface33 {
	long aLong3388;
	Class472 aClass472_3389;
	Class384 aClass384_3390;
	int anInt3391;
	Class472 aClass472_3392;
	Class164 aClass164_3393;

	abstract void method5640(boolean bool, int i, int i_0_);

	public void method213(boolean bool, short i) {
		int i_1_ = ((aClass384_3390.aClass380_3974.method6400(1773515723 * aClass384_3390.anInt3971, client.anInt11036 * 1536768403, (short) -385)) + 1653743623 * aClass384_3390.anInt3970);
		int i_2_ = ((aClass384_3390.aClass389_3968.method6473(-1825534571 * aClass384_3390.anInt3972, client.anInt11151 * -932988141, 2146227393)) + aClass384_3390.anInt3969 * -1732272073);
		method5642(bool, i_1_, i_2_, -1165660165);
		method5643(bool, i_1_, i_2_, (byte) 35);
		String string = Class661.aClass289_8509.method5190((byte) 116);
		if (TimeUtils.getCurrentTimeMilliseconds(1516375036) - 6564325488839177379L * aLong3388 > 10000L)
			string = new StringBuilder().append(string).append(" (").append(Class661.aClass289_8509.method5179(1889923371).anInt3139 * 1533974855).append(")").toString();
		aClass164_3393.method2624(string, i_1_ + 1773515723 * aClass384_3390.anInt3971 / 2, (-913347581 * aClass384_3390.anInt3973 + (4 + (-1825534571 * aClass384_3390.anInt3972 / 2 + i_2_))), aClass384_3390.anInt3975 * -495047775, -1, 539737807);
	}

	abstract void method5641(boolean bool, int i, int i_3_);

	public boolean method209(byte i) {
		boolean bool = true;
		if (!aClass472_3392.method7650(-2021763229 * aClass384_3390.anInt3967, 860254147))
			bool = false;
		if (!aClass472_3389.method7650(aClass384_3390.anInt3967 * -2021763229, -294041814))
			bool = false;
		return bool;
	}

	abstract void method5642(boolean bool, int i, int i_4_, int i_5_);

	abstract void method5643(boolean bool, int i, int i_6_, byte i_7_);

	Class312(Class472 class472, Class472 class472_8_, Class384 class384) {
		aClass472_3392 = class472;
		aClass472_3389 = class472_8_;
		aClass384_3390 = class384;
	}

	public void method208(boolean bool) {
		int i = ((aClass384_3390.aClass380_3974.method6400(1773515723 * aClass384_3390.anInt3971, client.anInt11036 * 1536768403, (short) 4361)) + 1653743623 * aClass384_3390.anInt3970);
		int i_9_ = ((aClass384_3390.aClass389_3968.method6473(-1825534571 * aClass384_3390.anInt3972, client.anInt11151 * -932988141, 2146227393)) + aClass384_3390.anInt3969 * -1732272073);
		method5642(bool, i, i_9_, 437363856);
		method5643(bool, i, i_9_, (byte) 29);
		String string = Class661.aClass289_8509.method5190((byte) 113);
		if (TimeUtils.getCurrentTimeMilliseconds(1516375036) - 6564325488839177379L * aLong3388 > 10000L)
			string = new StringBuilder().append(string).append(" (").append(Class661.aClass289_8509.method5179(2039578627).anInt3139 * 1533974855).append(")").toString();
		aClass164_3393.method2624(string, i + 1773515723 * aClass384_3390.anInt3971 / 2, (-913347581 * aClass384_3390.anInt3973 + (4 + (-1825534571 * aClass384_3390.anInt3972 / 2 + i_9_))), aClass384_3390.anInt3975 * -495047775, -1, -186809325);
	}

	int method5644(byte i) {
		int i_10_ = Class661.aClass289_8509.method5197((byte) 11);
		int i_11_ = 100 * i_10_;
		if (anInt3391 * -316203185 == i_10_ && i_10_ != 0) {
			int i_12_ = Class661.aClass289_8509.method5174((byte) -65);
			if (i_12_ > i_10_) {
				long l = (6564325488839177379L * aLong3388 - Class661.aClass289_8509.method5178(2049011160));
				if (l > 0L) {
					long l_13_ = 10000L * l / (long) i_10_ * (long) (i_12_ - i_10_);
					long l_14_ = ((TimeUtils.getCurrentTimeMilliseconds(1516375036) - 6564325488839177379L * aLong3388) * 10000L);
					if (l_14_ < l_13_)
						i_11_ = (int) ((long) (i_10_ * 100) + (l_14_ * (long) (i_12_ - i_10_) * 100L / l_13_));
					else
						i_11_ = i_12_ * 100;
				}
			}
		} else {
			anInt3391 = i_10_ * -2112448593;
			aLong3388 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * 7926514305215045387L;
		}
		return i_11_;
	}

	public void method212() {
		Class10 class10 = Class555.method9193(aClass472_3389, -2021763229 * aClass384_3390.anInt3967, Class491.aClass423_5536, 2049063513);
		aClass164_3393 = (Class31.aClass178_303.method3111(class10, Class166.method2662(aClass472_3392, aClass384_3390.anInt3967 * -2021763229), true));
	}

	abstract void method5645(boolean bool, int i, int i_15_);

	int method5646() {
		int i = Class661.aClass289_8509.method5197((byte) 11);
		int i_16_ = 100 * i;
		if (anInt3391 * -316203185 == i && i != 0) {
			int i_17_ = Class661.aClass289_8509.method5174((byte) -123);
			if (i_17_ > i) {
				long l = (6564325488839177379L * aLong3388 - Class661.aClass289_8509.method5178(1826645601));
				if (l > 0L) {
					long l_18_ = 10000L * l / (long) i * (long) (i_17_ - i);
					long l_19_ = ((TimeUtils.getCurrentTimeMilliseconds(1516375036) - 6564325488839177379L * aLong3388) * 10000L);
					if (l_19_ < l_18_)
						i_16_ = (int) ((long) (i * 100) + (l_19_ * (long) (i_17_ - i) * 100L / l_18_));
					else
						i_16_ = i_17_ * 100;
				}
			}
		} else {
			anInt3391 = i * -2112448593;
			aLong3388 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * 7926514305215045387L;
		}
		return i_16_;
	}

	public boolean method211() {
		boolean bool = true;
		if (!aClass472_3392.method7650(-2021763229 * aClass384_3390.anInt3967, -1714085998))
			bool = false;
		if (!aClass472_3389.method7650(aClass384_3390.anInt3967 * -2021763229, -1422575684))
			bool = false;
		return bool;
	}

	public void method210(int i) {
		Class10 class10 = Class555.method9193(aClass472_3389, -2021763229 * aClass384_3390.anInt3967, Class491.aClass423_5536, 1925532809);
		aClass164_3393 = (Class31.aClass178_303.method3111(class10, Class166.method2662(aClass472_3392, aClass384_3390.anInt3967 * -2021763229), true));
	}

	abstract void method5647(boolean bool, int i, int i_20_);

	abstract void method5648(boolean bool, int i, int i_21_);

	int method5649() {
		int i = Class661.aClass289_8509.method5197((byte) 11);
		int i_22_ = 100 * i;
		if (anInt3391 * -316203185 == i && i != 0) {
			int i_23_ = Class661.aClass289_8509.method5174((byte) -108);
			if (i_23_ > i) {
				long l = (6564325488839177379L * aLong3388 - Class661.aClass289_8509.method5178(1785273885));
				if (l > 0L) {
					long l_24_ = 10000L * l / (long) i * (long) (i_23_ - i);
					long l_25_ = ((TimeUtils.getCurrentTimeMilliseconds(1516375036) - 6564325488839177379L * aLong3388) * 10000L);
					if (l_25_ < l_24_)
						i_22_ = (int) ((long) (i * 100) + (l_25_ * (long) (i_23_ - i) * 100L / l_24_));
					else
						i_22_ = i_23_ * 100;
				}
			}
		} else {
			anInt3391 = i * -2112448593;
			aLong3388 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * 7926514305215045387L;
		}
		return i_22_;
	}

	static final void method5650(Class669 class669, int i) {
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub20_10616, (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1 ? 1 : 0, -482529197);
		client.aClass505_11019.method8294(-889374440);
		Class211.method3824(1345611436);
		client.aBool11012 = false;
	}

	static final void method5651(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class158.method2556(class250, class242, class669, (byte) 26);
	}

	static void method5652(Class669 class669, int i) {
		class669.anIntArray8557[class669.anInt8558 * 1357652815 - 1] = (((Class280) Class655.aClass58_Sub1_8422.getDefinition((class669.anIntArray8557[(class669.anInt8558 * 1357652815) - 1]), (byte) -27)).anInt3047 * -566861277);
	}

	static final void method5653(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class170.method2892(class250, class242, class669, ((class669.aClass523_Sub19_8569 == Class673.aClass523_Sub19_8611) ? PacketsDecoder.aClass233_2370 : PacketsDecoder.aClass233_2372), (byte) 0);
	}

	static final void method5654(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_26_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_27_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		Class76 class76 = (Class76) Class60.aClass53_Sub22_766.getDefinition(i_27_, (byte) 106);
		if (class76.method1537((byte) -73))
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = ((Class523_Sub27_Sub2) Class469.aClass58_Sub2_5344.getDefinition(i_26_, (byte) 43)).method17734(i_27_, class76.aString849, (byte) 17);
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (((Class523_Sub27_Sub2) Class469.aClass58_Sub2_5344.getDefinition(i_26_, (byte) -37)).method17733(i_27_, -1100663923 * class76.anInt850, 826144161));
	}
}
