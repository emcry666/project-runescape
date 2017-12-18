/* Class399 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class399 implements Interface48 {
	Class472 aClass472_4064;
	Class209 aClass209_4065 = new Class209(64);
	static Class472 aClass472_4066;

	public void method6529(byte i) {
		aClass209_4065.method3773(-1908039328);
	}

	public synchronized Class400 method350(int i) {
		Class400 class400 = (Class400) aClass209_4065.method3767((long) i);
		if (class400 != null)
			return class400;
		byte[] is = aClass472_4064.method7688(0, i, -691640376);
		class400 = new Class400();
		if (null != is)
			class400.method6535(new Class523_Sub34(is), -2017279262);
		class400.method6543(-2176085);
		aClass209_4065.method3770(class400, (long) i);
		return class400;
	}

	public synchronized Class400 method348(int i, int i_0_) {
		Class400 class400 = (Class400) aClass209_4065.method3767((long) i);
		if (class400 != null)
			return class400;
		byte[] is = aClass472_4064.method7688(0, i, -2133066846);
		class400 = new Class400();
		if (null != is)
			class400.method6535(new Class523_Sub34(is), -1756254779);
		class400.method6543(1873106409);
		aClass209_4065.method3770(class400, (long) i);
		return class400;
	}

	public synchronized Class400 method349(int i) {
		Class400 class400 = (Class400) aClass209_4065.method3767((long) i);
		if (class400 != null)
			return class400;
		byte[] is = aClass472_4064.method7688(0, i, -1573296481);
		class400 = new Class400();
		if (null != is)
			class400.method6535(new Class523_Sub34(is), -1492866241);
		class400.method6543(-512496717);
		aClass209_4065.method3770(class400, (long) i);
		return class400;
	}

	public Class399(Class472 class472) {
		aClass472_4064 = class472;
	}

	public static int method6530(String string, byte i) {
		return Class323.aTwitchTV3452.SetStreamTitle(string, client.aClass681_11284.aString8647);
	}

	static final void method6531(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class324.method5730(class250, class242, class669, -2097763148);
	}

	public static Class523_Sub32 method6532(byte i) {
		if (null == Class534_Sub1.aClass708_7194 || null == Class534_Sub1.aClass706_10794)
			return null;
		Class534_Sub1.aClass706_10794.method14153(Class534_Sub1.aClass708_7194, -345344780);
		Class523_Sub32 class523_sub32 = ((Class523_Sub32) Class534_Sub1.aClass706_10794.method14146(838710311));
		if (null == class523_sub32)
			return null;
		Class239 class239 = ((Class239) Class534_Sub1.aClass53_Sub1_7206.getDefinition(((class523_sub32.anInt10578) * -1039292053), (byte) 4));
		if (null == class239 || !class239.aBool2442 || !class239.method4314(Class534_Sub1.anInterface19_7142, Class534_Sub1.anInterface17_7141, -1466702436))
			return Class523_Sub20.method16096(35051);
		return class523_sub32;
	}

	public static void method6533(int i) {
		if (client.aBool11000) {
			Class250 class250 = Class654.method10722(Class232.anInt2367 * 1383041209, client.anInt11105 * -1034378319, (byte) 15);
			if (class250 != null && class250.anObjectArray2647 != null) {
				Class523_Sub38 class523_sub38 = new Class523_Sub38();
				class523_sub38.aClass250_10678 = class250;
				class523_sub38.anObjectArray10687 = class250.anObjectArray2647;
				Class482.method7916(class523_sub38, (byte) 3);
			}
			client.anInt11178 = 99323203;
			client.anInt11095 = 1654645977;
			client.aBool11000 = false;
			if (null != class250)
				Class523_Sub14.method15991(class250, (byte) -27);
		}
	}
}
