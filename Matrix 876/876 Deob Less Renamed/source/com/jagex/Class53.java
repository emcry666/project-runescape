/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class53 implements Interface12 {
	Class209 aClass209_719;
	Class656 aClass656_720;
	public int anInt721;
	Class472 aClass472_722;
	protected Interface5 anInterface5_723;
	public static int anInt724;

	public void method1290(int i) {
		synchronized (aClass209_719) {
			aClass209_719.method3773(-1899318901);
			aClass209_719 = new Class209(i);
		}
	}

	public Interface13 getDefinition(int i, byte i_0_) {
		Interface13 interface13;
		synchronized (aClass209_719) {
			interface13 = (Interface13) aClass209_719.method3767((long) i);
		}
		if (interface13 != null)
			return interface13;
		interface13 = method1291(i, 2125566745);
		synchronized (aClass209_719) {
			aClass209_719.method3770(interface13, (long) i);
		}
		return interface13;
	}

	Interface13 method1291(int i, int i_1_) {
		byte[] is;
		synchronized (aClass472_722) {
			is = Class198.method3674(aClass472_722, aClass656_720, i, -1125562652);
		}
		Interface13 interface13 = anInterface5_723.method48(i, this, 1978605384);
		if (is != null)
			interface13.method80(new Class523_Sub34(is), 2099928681);
		interface13.method74((byte) 51);
		return interface13;
	}

	public int method69(int i) {
		return anInt721 * 787510181;
	}

	public void method1292(int i, byte i_2_) {
		synchronized (aClass209_719) {
			aClass209_719.method3773(-2042226562);
			aClass209_719 = new Class209(i);
		}
	}

	public void method1293(int i) {
		synchronized (aClass209_719) {
			aClass209_719.method3773(-2147375132);
		}
	}

	public Interface13 method72(int i) {
		Interface13 interface13;
		synchronized (aClass209_719) {
			interface13 = (Interface13) aClass209_719.method3767((long) i);
		}
		if (interface13 != null)
			return interface13;
		interface13 = method1291(i, 2125566745);
		synchronized (aClass209_719) {
			aClass209_719.method3770(interface13, (long) i);
		}
		return interface13;
	}

	public void method1294(byte i) {
		synchronized (aClass209_719) {
			aClass209_719.method3776(144745863);
		}
	}

	public Iterator iterator() {
		return new Class71(this);
	}

	public Interface13 method70(int i) {
		Interface13 interface13;
		synchronized (aClass209_719) {
			interface13 = (Interface13) aClass209_719.method3767((long) i);
		}
		if (interface13 != null)
			return interface13;
		interface13 = method1291(i, 2125566745);
		synchronized (aClass209_719) {
			aClass209_719.method3770(interface13, (long) i);
		}
		return interface13;
	}

	public Class53(Class681 class681, Class668 class668, Class472 class472, Class656 class656, int i, Interface5 interface5) {
		aClass472_722 = class472;
		aClass656_720 = class656;
		anInterface5_723 = interface5;
		anInt721 = Class268.method4906(aClass472_722, aClass656_720, -1571598358) * 1817001005;
		aClass209_719 = new Class209(i);
	}

	Interface13 method1295(int i) {
		byte[] is;
		synchronized (aClass472_722) {
			is = Class198.method3674(aClass472_722, aClass656_720, i, -702600122);
		}
		Interface13 interface13 = anInterface5_723.method48(i, this, -1577549163);
		if (is != null)
			interface13.method80(new Class523_Sub34(is), 2087221192);
		interface13.method74((byte) 14);
		return interface13;
	}

	public int method68() {
		return anInt721 * 787510181;
	}

	public void method1296(int i) {
		synchronized (aClass209_719) {
			aClass209_719.method3772(i, (byte) -36);
		}
	}

	public void method1297() {
		synchronized (aClass209_719) {
			aClass209_719.method3773(-2004321298);
		}
	}

	public void method1298(int i) {
		synchronized (aClass209_719) {
			aClass209_719.method3772(i, (byte) -26);
		}
	}

	public void method1299(int i, byte i_3_) {
		synchronized (aClass209_719) {
			aClass209_719.method3772(i, (byte) -27);
		}
	}

	public void method1300() {
		synchronized (aClass209_719) {
			aClass209_719.method3773(-2032162513);
		}
	}

	public void method1301() {
		synchronized (aClass209_719) {
			aClass209_719.method3773(-1867806443);
		}
	}

	public void method1302() {
		synchronized (aClass209_719) {
			aClass209_719.method3773(-1953800316);
		}
	}

	public void method1303() {
		synchronized (aClass209_719) {
			aClass209_719.method3776(749658935);
		}
	}

	Interface13 method1304(int i) {
		byte[] is;
		synchronized (aClass472_722) {
			is = Class198.method3674(aClass472_722, aClass656_720, i, -725436613);
		}
		Interface13 interface13 = anInterface5_723.method48(i, this, 491400592);
		if (is != null)
			interface13.method80(new Class523_Sub34(is), 2097309453);
		interface13.method74((byte) -7);
		return interface13;
	}

	public Iterator method1305() {
		return new Class71(this);
	}

	public int method6() {
		return anInt721 * 787510181;
	}

	Interface13 method1306(int i) {
		byte[] is;
		synchronized (aClass472_722) {
			is = Class198.method3674(aClass472_722, aClass656_720, i, -1209084042);
		}
		Interface13 interface13 = anInterface5_723.method48(i, this, 1240838634);
		if (is != null)
			interface13.method80(new Class523_Sub34(is), 2111839080);
		interface13.method74((byte) 101);
		return interface13;
	}

	public static void method1307(int i) {
		Class66.aClass708_791 = new Class708();
	}

	public static Class513 method1308(byte i) {
		return Class506.aClass513_5691;
	}
}
