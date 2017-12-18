/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class31 {
	static String aString295;
	static String aString296 = "true";
	static String aString297;
	public static String aString298;
	static String aString299;
	public static String aString300 = ",";
	static String aString301;
	public static Class242[] aClass242Array302;
	public static Class178 aClass178_303;

	public static String method901(int i) {
		return new StringBuilder().append("<img=").append(i).append(">").toString();
	}

	public static String method902(int i) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	Class31() throws Throwable {
		throw new Error();
	}

	public static String method903(int i) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	static {
		aString297 = " (";
		aString295 = ")";
		aString299 = "->";
		aString298 = "<br>";
		aString301 = "</col>";
	}

	public static String method904(int i) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	public static String method905(int i) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	static void method906(Class178 class178, byte i) {
		if ((Class36.anInt330 * 462991943 >= 2 || client.aBool11000) && null == client.aClass250_11197) {
			String string;
			if (client.aBool11000 && 462991943 * Class36.anInt330 < 2)
				string = new StringBuilder().append(client.aString11016).append(Class39.aClass39_516.method1124((Class53_Sub20.aClass668_10979), (byte) -104)).append(client.aString11225).append(" ").append(aString299).toString();
			else if (Class283.method5137((byte) 0) && 462991943 * Class36.anInt330 > 2)
				string = Class48.method1257(Class660.aClass523_Sub27_Sub6_8507, 988394078);
			else {
				Class523_Sub27_Sub6 class523_sub27_sub6 = Class660.aClass523_Sub27_Sub6_8507;
				if (class523_sub27_sub6 == null)
					return;
				string = Class48.method1257(class523_sub27_sub6, -972477945);
				int[] is = Class209.method3809(class523_sub27_sub6, 2029046854);
				if (null != is)
					string = new StringBuilder().append(string).append(Class163.method2593(is, 2090637326)).toString();
			}
			if (Class36.anInt330 * 462991943 > 2)
				string = new StringBuilder().append(string).append(Class495.method8101(16777215, 1817113364)).append(" / ").append(462991943 * Class36.anInt330 - 2).append(Class39.aClass39_397.method1124((Class53_Sub20.aClass668_10979), (byte) -111)).toString();
			if (Class36.aClass250_322 != null) {
				Class164 class164 = Class36.aClass250_322.method4493(Class491.aClass423_5536, (client.anInterface50_11044), (short) 255);
				if (class164 == null)
					class164 = Class34.aClass164_319;
				class164.method2603(string, 1577839669 * Class36.anInt344, Class36.anInt345 * -975086493, Class36.aClass250_322.anInt2581 * 365308179, Class36.aClass250_322.anInt2543 * -1759297857, Class36.aClass250_322.anInt2556 * -293786715, -728754787 * Class36.aClass250_322.anInt2565, 1588100583 * Class36.aClass250_322.anInt2536, Class36.aClass250_322.anInt2512 * -899509811, client.aRandom11099, Class330.anInt3500, client.anIntArray11250, Class62.aClass148Array772, null, 839481348);
				Class504.method8225(client.anIntArray11250[0], client.anIntArray11250[1], client.anIntArray11250[2], client.anIntArray11250[3], (byte) -109);
			}
		}
	}

	static final void method907(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method908(Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		Class647_Sub1.method16759(string, (byte) -97);
	}

	static final void method909(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_0_, -807270583);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 2014714437 * class250.anInt2501;
	}
}
