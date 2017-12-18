/* Class98_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class98_Sub1_Sub2 extends Class98_Sub1 implements Interface12 {
	Class209 aClass209_11330 = new Class209(64);
	Class472 aClass472_11331;
	public static Class112 playerVarsProvider;

	public Iterator method17716() {
		return new Class626(this);
	}

	public Interface13 getDefinition(int i, byte i_0_) {
		Class159_Sub1 class159_sub1;
		synchronized (aClass209_11330) {
			class159_sub1 = (Class159_Sub1) aClass209_11330.method3767((long) i);
			if (null == class159_sub1) {
				class159_sub1 = method17717(i, 1975516656);
				aClass209_11330.method3770(class159_sub1, (long) i);
			}
		}
		return class159_sub1;
	}

	Class159_Sub1 method17717(int i, int i_1_) {
		byte[] is = aClass472_11331.method7688((aClass470_8890.method7626((byte) 60).anInt8501) * 1688317219, i, -976886202);
		Class159_Sub1 class159_sub1 = new Class159_Sub1(aClass470_8890, i);
		if (null != is)
			class159_sub1.method80(new Class523_Sub34(is), 2079267786);
		return class159_sub1;
	}

	public void method17718(byte i) {
		synchronized (aClass209_11330) {
			aClass209_11330.method3773(-1889315169);
		}
	}

	public Iterator iterator() {
		return new Class626(this);
	}

	public void method17719(int i) {
		synchronized (aClass209_11330) {
			aClass209_11330.method3776(-78478907);
		}
	}

	public void method17720() {
		synchronized (aClass209_11330) {
			aClass209_11330.method3776(-1276234337);
		}
	}

	public int method69(int i) {
		return super.method69(-1534401851);
	}

	public int method6() {
		return super.method69(-2145434951);
	}

	public Interface13 method72(int i) {
		Class159_Sub1 class159_sub1;
		synchronized (aClass209_11330) {
			class159_sub1 = (Class159_Sub1) aClass209_11330.method3767((long) i);
			if (null == class159_sub1) {
				class159_sub1 = method17717(i, 1958429970);
				aClass209_11330.method3770(class159_sub1, (long) i);
			}
		}
		return class159_sub1;
	}

	public int method68() {
		return super.method69(-1221733543);
	}

	public void method17721(int i, short i_2_) {
		synchronized (aClass209_11330) {
			aClass209_11330.method3772(i, (byte) -124);
		}
	}

	public void method17722(int i) {
		synchronized (aClass209_11330) {
			aClass209_11330.method3772(i, (byte) -84);
		}
	}

	public void method17723() {
		synchronized (aClass209_11330) {
			aClass209_11330.method3776(1049151648);
		}
	}

	public void method17724() {
		synchronized (aClass209_11330) {
			aClass209_11330.method3773(-1914620176);
		}
	}

	public void method17725() {
		synchronized (aClass209_11330) {
			aClass209_11330.method3773(-2027988898);
		}
	}

	public Interface13 method70(int i) {
		Class159_Sub1 class159_sub1;
		synchronized (aClass209_11330) {
			class159_sub1 = (Class159_Sub1) aClass209_11330.method3767((long) i);
			if (null == class159_sub1) {
				class159_sub1 = method17717(i, 628364815);
				aClass209_11330.method3770(class159_sub1, (long) i);
			}
		}
		return class159_sub1;
	}

	public void method17726(int i) {
		synchronized (aClass209_11330) {
			aClass209_11330.method3772(i, (byte) -54);
		}
	}

	public void method17727() {
		synchronized (aClass209_11330) {
			aClass209_11330.method3776(-919653142);
		}
	}

	public Class98_Sub1_Sub2(Class681 class681, Class470 class470, Class668 class668, Class472 class472) {
		super(class681, class470, class668, (class472 != null ? class472.method7702((class470.method7626((byte) 33).anInt8501 * 1688317219), (byte) -3) : 0));
		aClass472_11331 = class472;
	}

	public void method17728(int i) {
		synchronized (aClass209_11330) {
			aClass209_11330.method3772(i, (byte) -41);
		}
	}

	public void method17729() {
		synchronized (aClass209_11330) {
			aClass209_11330.method3776(-57118486);
		}
	}

	public void method17730() {
		synchronized (aClass209_11330) {
			aClass209_11330.method3776(2079562703);
		}
	}

	public static int method17731(byte i) {
		return Class323.aTwitchTV3452.GetChatState();
	}
}
