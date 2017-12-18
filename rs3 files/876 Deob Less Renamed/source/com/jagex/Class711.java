/* Class711 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class711 implements Interface75 {
	static Class711 aClass711_8841 = new Class711(-1);
	public static Class711 aClass711_8842 = new Class711(-2);
	public static Class711 aClass711_8843 = new Class711(-3);
	static Class711 aClass711_8844 = new Class711(-4);
	public static Class711 aClass711_8845 = new Class711(-5);
	static Class711 aClass711_8846;
	static Class711 aClass711_8847;
	static Class711 aClass711_8848;
	static Class711 aClass711_8849;
	int anInt8850;
	public static Class711 aClass711_8851 = new Class711(2);

	public static Class711[] method14324() {
		return new Class711[] { aClass711_8845, aClass711_8846, aClass711_8851, aClass711_8848, aClass711_8847, aClass711_8849, aClass711_8843, aClass711_8842, aClass711_8841, aClass711_8844 };
	}

	public int method82() {
		return anInt8850 * 1043043337;
	}

	static {
		aClass711_8847 = new Class711(3);
		aClass711_8848 = new Class711(7);
		aClass711_8849 = new Class711(9);
		aClass711_8846 = new Class711(37);
	}

	public int method6() {
		return anInt8850 * 1043043337;
	}

	public int method101() {
		return anInt8850 * 1043043337;
	}

	Class711(int i) {
		anInt8850 = i * 657603129;
	}

	public static String method14325(long l, int i, short i_0_) {
		Class17.method776(l);
		int i_1_ = Class91.aCalendar893.get(5);
		int i_2_ = Class91.aCalendar893.get(2);
		int i_3_ = Class91.aCalendar893.get(1);
		if (i == 3)
			return Class477.method7890(l, i, -2095769947);
		return new StringBuilder().append(Integer.toString(i_1_ / 10)).append(i_1_ % 10).append("-").append(Class91.aStringArrayArray892[i][i_2_]).append("-").append(i_3_).toString();
	}

	static Class577[] method14326(int i) {
		return (new Class577[] { Class577.aClass577_7698, Class577.aClass577_7699 });
	}

	static final void method14327(Class250 class250, Class242 class242, Class669 class669, byte i) {
		class250.method4501(-1200468114);
	}

	public static Class384 method14328(Class523_Sub34 class523_sub34, byte i) {
		Class384 class384 = Class2.method514(class523_sub34, -192467867);
		int i_4_ = class523_sub34.readUnsignedInt((byte) -85);
		int i_5_ = class523_sub34.readUnsignedInt((byte) -41);
		return new Class384_Sub3(class384.aClass380_3974, class384.aClass389_3968, class384.anInt3970 * 1653743623, class384.anInt3969 * -1732272073, class384.anInt3971 * 1773515723, -1825534571 * class384.anInt3972, -913347581 * class384.anInt3973, -2021763229 * class384.anInt3967, class384.anInt3975 * -495047775, i_4_, i_5_);
	}
}
