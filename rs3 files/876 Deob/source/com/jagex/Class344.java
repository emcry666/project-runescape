/* Class344 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class344 {
	static final int anInt3611 = 16;
	public static Class344 aClass344_3612;
	public static Class344 aClass344_3613;
	static Class344 aClass344_3614;
	public static Class344 aClass344_3615;
	public static Class344 aClass344_3616;
	public static Class344 aClass344_3617;
	static Class344 aClass344_3618;
	static Class344 aClass344_3619;
	static Class344 aClass344_3620;
	int anInt3621;
	static Class344 aClass344_3622;
	public int anInt3623;
	public static Class344 aClass344_3624 = new Class344(3, 0, 3, Class170.aClass170_1825);
	static int anInt3625;
	public int anInt3626;
	public static Class344 aClass344_3627;
	int anInt3628;
	Class170 aClass170_3629;

	static {
		aClass344_3612 = new Class344(1, 1, 3, Class170.aClass170_1825);
		aClass344_3613 = new Class344(4, 2, 4, Class170.aClass170_1822);
		aClass344_3627 = new Class344(6, 3, 1, Class170.aClass170_1825);
		aClass344_3615 = new Class344(8, 4, 2, Class170.aClass170_1825);
		aClass344_3617 = new Class344(7, 5, 3, Class170.aClass170_1825);
		aClass344_3616 = new Class344(10, 6, 4, Class170.aClass170_1825);
		aClass344_3618 = new Class344(0, 7, 4, Class170.aClass170_1825);
		aClass344_3619 = new Class344(11, 8, 4, Class170.aClass170_1825);
		aClass344_3620 = new Class344(5, 9, 4, Class170.aClass170_1825);
		aClass344_3614 = new Class344(9, 10, 3, Class170.aClass170_1825);
		aClass344_3622 = new Class344(2, 11, 3, Class170.aClass170_1825);
		anInt3625 = Class181.method3537(16, (byte) 0);
	}

	static Class344 method5991(int i) {
		switch (i) {
		case 6:
			return aClass344_3616;
		case 1:
			return aClass344_3612;
		case 4:
			return aClass344_3615;
		case 0:
			return aClass344_3624;
		case 5:
			return aClass344_3617;
		case 2:
			return aClass344_3613;
		case 3:
			return aClass344_3627;
		default:
			return null;
		}
	}

	static Class344 method5992(int i) {
		switch (i) {
		case 6:
			return aClass344_3616;
		case 1:
			return aClass344_3612;
		case 4:
			return aClass344_3615;
		case 0:
			return aClass344_3624;
		case 5:
			return aClass344_3617;
		case 2:
			return aClass344_3613;
		case 3:
			return aClass344_3627;
		default:
			return null;
		}
	}

	Class344(int i, int i_0_, int i_1_, Class170 class170) {
		anInt3623 = i;
		anInt3621 = i_0_;
		anInt3628 = i_1_;
		aClass170_3629 = class170;
		anInt3626 = anInt3628 * (aClass170_3629.anInt1831 * 1602321003);
		if (anInt3621 >= 16)
			throw new RuntimeException();
	}
}
