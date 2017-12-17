/* Class201 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class201 implements Interface44 {
	Class217 this$0;

	public float method339() {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10652.method16930(1637378778) / 255.0F);
	}

	public float method338(short i) {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10652.method16930(1427608158) / 255.0F);
	}

	Class201(Class217 class217) {
		this$0 = class217;
	}

	public float method337() {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10652.method16930(1520107940) / 255.0F);
	}

	public float method336() {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10652.method16930(1912545881) / 255.0F);
	}

	public static void method3691(byte i) {
		Class104.anInt1259 = 440028073;
	}

	public static final void method3692(String string, int i) {
		if (null != string) {
			String string_0_ = Class226.method4163(string, Class112.aClass73_1351, (byte) 45);
			if (string_0_ != null) {
				for (int i_1_ = 0; i_1_ < client.anInt11078 * 54287651; i_1_++) {
					Class51 class51 = client.aClass51Array11294[i_1_];
					String string_2_ = class51.aString714;
					String string_3_ = Class226.method4163(string_2_, Class112.aClass73_1351, (byte) 20);
					if (Class108.method1900(string, string_0_, string_2_, string_3_, 1836103182)) {
						client.anInt11078 -= -1357202805;
						for (int i_4_ = i_1_; i_4_ < client.anInt11078 * 54287651; i_4_++)
							client.aClass51Array11294[i_4_] = client.aClass51Array11294[1 + i_4_];
						client.anInt11183 = client.anInt11251 * -684273789;
						RSStream class116 = Class537.method8941(-1746561527);
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.aClass408_4300), (class116.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class6.method555(string, (byte) -39), -1257492124);
						class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) -11);
						class116.method1974(class523_sub22, (byte) 86);
						break;
					}
				}
			}
		}
	}

	public static void method3693(int i, int i_5_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(21, (long) i);
		class523_sub27_sub7.method17962((byte) 105);
	}

	static void method3694(int i, int i_6_, int i_7_, int i_8_, byte i_9_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(20, (long) i_6_ << 32 | (long) i);
		class523_sub27_sub7.method17963(958453162);
		class523_sub27_sub7.anInt11653 = i_7_ * -1217347391;
		class523_sub27_sub7.anInt11649 = i_8_ * -254643469;
	}
}
