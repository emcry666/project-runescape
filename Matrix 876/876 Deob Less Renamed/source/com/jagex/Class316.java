/* Class316 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class316 implements Interface33 {
	Class472 aClass472_3420;
	Class472 aClass472_3421;
	Class381 aClass381_3422;
	Class164 aClass164_3423;

	Class316(Class472 class472, Class472 class472_0_, Class381 class381) {
		aClass381_3422 = class381;
		aClass472_3421 = class472;
		aClass472_3420 = class472_0_;
	}

	public void method210(int i) {
		Class10 class10 = Class555.method9193(aClass472_3420, aClass381_3422.anInt3949 * -2067299015, Class491.aClass423_5536, 2049792117);
		aClass164_3423 = (Class31.aClass178_303.method3111(class10, Class166.method2662(aClass472_3421, aClass381_3422.anInt3949 * -2067299015), true));
	}

	public void method213(boolean bool, short i) {
		if (bool) {
			int i_1_ = ((aClass381_3422.aClass380_3940.method6400(aClass381_3422.anInt3947 * 769728625, client.anInt11036 * 1536768403, (short) -27103)) + 1109999693 * aClass381_3422.anInt3939);
			int i_2_ = ((aClass381_3422.aClass389_3950.method6473(-783860805 * aClass381_3422.anInt3948, client.anInt11151 * -932988141, 2146227393)) + aClass381_3422.anInt3943 * 886284013);
			aClass164_3423.method2628(aClass381_3422.aString3942, i_1_, i_2_, 769728625 * aClass381_3422.anInt3947, -783860805 * aClass381_3422.anInt3948, aClass381_3422.anInt3944 * 824536135, -1451721797 * aClass381_3422.anInt3951, -1875426707 * aClass381_3422.anInt3941, -1712863195 * aClass381_3422.anInt3945, -1885448043 * aClass381_3422.anInt3946, null, null, null, 0, 0, -1156631892);
		}
	}

	public boolean method209(byte i) {
		boolean bool = true;
		if (!aClass472_3421.method7650(aClass381_3422.anInt3949 * -2067299015, -2113249596))
			bool = false;
		if (!aClass472_3420.method7650(-2067299015 * aClass381_3422.anInt3949, -1046638452))
			bool = false;
		return bool;
	}

	public void method208(boolean bool) {
		if (bool) {
			int i = ((aClass381_3422.aClass380_3940.method6400(aClass381_3422.anInt3947 * 769728625, client.anInt11036 * 1536768403, (short) -9659)) + 1109999693 * aClass381_3422.anInt3939);
			int i_3_ = ((aClass381_3422.aClass389_3950.method6473(-783860805 * aClass381_3422.anInt3948, client.anInt11151 * -932988141, 2146227393)) + aClass381_3422.anInt3943 * 886284013);
			aClass164_3423.method2628(aClass381_3422.aString3942, i, i_3_, 769728625 * aClass381_3422.anInt3947, -783860805 * aClass381_3422.anInt3948, aClass381_3422.anInt3944 * 824536135, -1451721797 * aClass381_3422.anInt3951, -1875426707 * aClass381_3422.anInt3941, -1712863195 * aClass381_3422.anInt3945, -1885448043 * aClass381_3422.anInt3946, null, null, null, 0, 0, 641125456);
		}
	}

	public boolean method211() {
		boolean bool = true;
		if (!aClass472_3421.method7650(aClass381_3422.anInt3949 * -2067299015, 831963313))
			bool = false;
		if (!aClass472_3420.method7650(-2067299015 * aClass381_3422.anInt3949, -1955737694))
			bool = false;
		return bool;
	}

	public void method212() {
		Class10 class10 = Class555.method9193(aClass472_3420, aClass381_3422.anInt3949 * -2067299015, Class491.aClass423_5536, 1439216888);
		aClass164_3423 = (Class31.aClass178_303.method3111(class10, Class166.method2662(aClass472_3421, aClass381_3422.anInt3949 * -2067299015), true));
	}

	static final void method5683(Class669 class669, short i) {
		int i_4_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_4_, (byte) -35)).anInt147) * 525800567;
	}

	static final void method5684(Class669 class669, int i) {
		class669.anInt8558 -= 2138772399;
	}

	public static int method5685(int i) {
		if (Class710.aBool8840 && null != Class310.aFrame3385)
			return 3;
		return client.aBool11147 ? 2 : 1;
	}

	static final void method5686(Class669 class669, byte i) {
		int i_5_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class461.aClass218_5122.method3967(i_5_, (byte) 2).method4182((short) 8340) ? 1 : 0;
	}
}
