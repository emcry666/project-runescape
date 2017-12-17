/* Class390 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class390 implements Interface46 {
	Class209 aClass209_4019 = new Class209(64);
	Class472 aClass472_4020;

	public Class386 method344(int i, byte i_0_) {
		Class386 class386 = (Class386) aClass209_4019.method3767((long) i);
		if (class386 != null)
			return class386;
		byte[] is = aClass472_4020.method7688(0, i, 1339418354);
		class386 = new Class386();
		if (is != null)
			class386.method6451(new Class523_Sub34(is), i, -1142356443);
		aClass209_4019.method3770(class386, (long) i);
		return class386;
	}

	public Class390(Class472 class472) {
		aClass472_4020 = class472;
	}

	public Class386 method345(int i) {
		Class386 class386 = (Class386) aClass209_4019.method3767((long) i);
		if (class386 != null)
			return class386;
		byte[] is = aClass472_4020.method7688(0, i, 972588274);
		class386 = new Class386();
		if (is != null)
			class386.method6451(new Class523_Sub34(is), i, 777838017);
		aClass209_4019.method3770(class386, (long) i);
		return class386;
	}

	public Class386 method346(int i) {
		Class386 class386 = (Class386) aClass209_4019.method3767((long) i);
		if (class386 != null)
			return class386;
		byte[] is = aClass472_4020.method7688(0, i, 1700389225);
		class386 = new Class386();
		if (is != null)
			class386.method6451(new Class523_Sub34(is), i, -85481587);
		aClass209_4019.method3770(class386, (long) i);
		return class386;
	}

	static final void method6481(Class669 class669, byte i) throws Exception_Sub7 {
		class669.anInt8558 -= 2121349901;
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5320((float) class669.anIntArray8557[1357652815 * class669.anInt8558], (float) (class669.anIntArray8557[1 + class669.anInt8558 * 1357652815]), (float) (class669.anIntArray8557[2 + 1357652815 * class669.anInt8558]), 263900793);
	}

	static void method6482(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class7.method564((byte) -115);
	}

	static final void method6483(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_1_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_2_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558] - 1;
		ItemDefinitions class12 = ((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_1_, (byte) 64));
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class12.method671(i_2_, -1301380486);
	}

	static final void method6484(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1797182875 * Class431.anInt4861;
	}

	public static RuntimeException_Sub4 method6485(Throwable throwable, String string) {
		RuntimeException_Sub4 runtimeexception_sub4;
		if (throwable instanceof RuntimeException_Sub4) {
			runtimeexception_sub4 = (RuntimeException_Sub4) throwable;
			StringBuilder stringbuilder = new StringBuilder();
			RuntimeException_Sub4 runtimeexception_sub4_3_ = runtimeexception_sub4;
			runtimeexception_sub4_3_.aString12098 = stringbuilder.append(runtimeexception_sub4_3_.aString12098).append(' ').append(string).toString();
		} else
			runtimeexception_sub4 = new RuntimeException_Sub4(throwable, string);
		return runtimeexception_sub4;
	}

	public static int[] method6486(int i, int i_4_) {
		int[] is = new int[3];
		Class17.method776(Class524.method8684(i, 1050369988));
		is[0] = Class91.aCalendar893.get(5);
		is[1] = Class91.aCalendar893.get(2);
		is[2] = Class91.aCalendar893.get(1);
		return is;
	}
}
