/* Class411 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class411 {
	public static final int anInt4537 = 15;
	public static final int anInt4538 = 32768;
	public static final int anInt4539 = 15;
	public static boolean aBool4540;

	Class411() throws Throwable {
		throw new Error();
	}

	public static int method6635(int i, byte i_0_) {
		Class261 class261 = (Class261) Class271.aMap2878.get(Integer.valueOf(i));
		if (class261 == null)
			return 0;
		return class261.method4714(891189503);
	}

	static void method6636(Class47_Sub1 class47_sub1, int i, int i_1_, int i_2_) {
		class47_sub1.method16579(i, 1270352884);
		int i_3_;
		if (i_1_ > 100000) {
			Class415.method6655(-602155973);
			i_3_ = 4;
		} else if (i_1_ > 50000) {
			VarDomainType.method7628(189765723);
			i_3_ = 3;
		} else if (i_1_ > 10000) {
			Class227.method4168((byte) 126);
			i_3_ = 2;
		} else {
			Class464.method7544(true, -496963114);
			i_3_ = 1;
		}
		if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -37) != i) {
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), i, 502547801);
			Class535.method8921(i, false, (byte) -73);
		} else
			Class449.aClass523_Sub33_4946.method16234((Class449.aClass523_Sub33_4946.aClass687_Sub1_10630), true, 1318029618);
		Class211.method3824(1207583303);
		class47_sub1.method16578(i_3_, 1893216097);
	}

	static final void method6637(Class669 class669, short i) {
		int i_4_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_4_, -1580951506);
		Class242 class242 = Class31.aClass242Array302[i_4_ >> 16];
		Class496.method8102(class250, class242, class669, -925728856);
	}

	static Class681[] method6638(int i) {
		return (new Class681[] { Class681.aClass681_8646, Class681.aClass681_8642, Class681.aClass681_8641, Class681.aClass681_8643, Class681.aClass681_8640, Class681.aClass681_8644 });
	}

	static final void method6639(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_5_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_6_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		Class553.method9164(10, i_5_, i_6_, "", 1581289233);
	}
}
