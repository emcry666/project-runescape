/* Class647_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class647_Sub1 extends Class647 {
	public byte aByte10818;
	Class647_Sub1 aClass647_Sub1_10819;
	int anInt10820;
	public byte aByte10821;
	public Class560 aClass560_10822;
	public Class180[] aClass180Array10823;

	abstract void method16697();

	abstract boolean method16698(Class178 class178, int i, int i_0_, byte i_1_);

	abstract boolean method16699(int i);

	static void method16700(Class564 class564, int i, int i_2_, int i_3_, Class167 class167) {
		if (class167 != null)
			class564.method9478(i, i_2_, i_3_, class167.method2711(), class167.method2712(), class167.method2713(), class167.method2804(), class167.method2847(), class167.method2716(), class167.method2717());
	}

	abstract boolean method16701(int i);

	abstract boolean method16702(int i);

	abstract void method16703(Class178 class178, Class647_Sub1 class647_sub1_4_, int i, int i_5_, int i_6_, boolean bool, int i_7_);

	abstract void method16704(byte i);

	int method16705(int i) {
		return 0;
	}

	abstract void method16706(Class178 class178, short i);

	public abstract Class564 method16707(Class178 class178, byte i);

	Class647_Sub1(Class560 class560) {
		aClass560_10822 = class560;
	}

	abstract boolean method16708(Class178 class178, int i);

	abstract boolean method16709(int i);

	public boolean method16710(int i) {
		return true;
	}

	int method16711(int i, int i_8_, Class523_Sub20[] class523_sub20s, short i_9_) {
		long l = aClass560_10822.aLongArrayArrayArray7529[aByte10821][i][i_8_];
		long l_10_ = 0L;
		int i_11_ = 0;
		for (/**/; l_10_ <= 48L; l_10_ += 16L) {
			int i_12_ = (int) (l >> (int) l_10_ & 0xffffL);
			if (i_12_ <= 0)
				break;
			class523_sub20s[i_11_++] = (aClass560_10822.aClass550Array7506[i_12_ - 1].aClass523_Sub20_7349);
		}
		for (int i_13_ = i_11_; i_13_ < 4; i_13_++)
			class523_sub20s[i_13_] = null;
		return i_11_;
	}

	abstract boolean method16712();

	abstract boolean method16713(Class178 class178, int i, int i_14_);

	void method16714(int i, int i_15_) {
		aClass180Array10823 = new Class180[i];
		for (int i_16_ = 0; i_16_ < aClass180Array10823.length; i_16_++)
			aClass180Array10823[i_16_] = new Class180();
	}

	abstract boolean method16715();

	abstract boolean method16716();

	public boolean method16717() {
		return true;
	}

	abstract boolean method16718();

	public abstract int method16719();

	public abstract int method16720();

	public abstract Class564 method16721(Class178 class178);

	public int method16722() {
		return -method16743(1246453091);
	}

	public int method16723() {
		return -method16743(2049636724);
	}

	abstract Class559 method16724(Class178 class178);

	abstract Class559 method16725(Class178 class178);

	abstract Class559 method16726(Class178 class178);

	abstract void method16727(Class178 class178);

	abstract void method16728(Class178 class178);

	public boolean method16729() {
		return true;
	}

	abstract boolean method16730();

	abstract boolean method16731();

	abstract void method16732(Class178 class178, Class647_Sub1 class647_sub1_17_, int i, int i_18_, int i_19_, boolean bool);

	abstract boolean method16733();

	abstract void method16734();

	abstract void method16735();

	abstract boolean method16736(Class178 class178, int i, int i_20_);

	public boolean method16737() {
		return true;
	}

	int method16738() {
		return 0;
	}

	abstract int method16739(Class523_Sub20[] class523_sub20s);

	public int method16740(int i) {
		return -method16743(144496205);
	}

	abstract boolean method16741();

	public boolean method16742() {
		return true;
	}

	public abstract int method16743(int i);

	abstract Class559 method16744(Class178 class178, byte i);

	public boolean method16745() {
		return true;
	}

	abstract int method16746(Class523_Sub20[] class523_sub20s);

	abstract int method16747(Class523_Sub20[] class523_sub20s);

	public boolean method16748() {
		return true;
	}

	abstract boolean method16749(Class178 class178);

	int method16750() {
		return 0;
	}

	abstract int method16751(Class523_Sub20[] class523_sub20s, byte i);

	abstract boolean method16752();

	static void method16753(Class564 class564, int i, int i_21_, int i_22_, Class167 class167) {
		if (class167 != null)
			class564.method9478(i, i_21_, i_22_, class167.method2711(), class167.method2712(), class167.method2713(), class167.method2804(), class167.method2847(), class167.method2716(), class167.method2717());
	}

	static void method16754(Class564 class564, int i, int i_23_, int i_24_, Class167 class167) {
		if (class167 != null)
			class564.method9478(i, i_23_, i_24_, class167.method2711(), class167.method2712(), class167.method2713(), class167.method2804(), class167.method2847(), class167.method2716(), class167.method2717());
	}

	static void method16755(Class564 class564, int i, int i_25_, int i_26_, Class167 class167) {
		if (class167 != null)
			class564.method9478(i, i_25_, i_26_, class167.method2711(), class167.method2712(), class167.method2713(), class167.method2804(), class167.method2847(), class167.method2716(), class167.method2717());
	}

	abstract void method16756(Class178 class178);

	void method16757(int i) {
		aClass180Array10823 = new Class180[i];
		for (int i_27_ = 0; i_27_ < aClass180Array10823.length; i_27_++)
			aClass180Array10823[i_27_] = new Class180();
	}

	void method16758(int i) {
		aClass180Array10823 = new Class180[i];
		for (int i_28_ = 0; i_28_ < aClass180Array10823.length; i_28_++)
			aClass180Array10823[i_28_] = new Class180();
	}

	public static final void method16759(String string, byte i) {
		if (null != string) {
			String string_29_ = Class226.method4163(string, Class112.aClass73_1351, (byte) 125);
			if (string_29_ != null) {
				for (int i_30_ = 0; i_30_ < client.anInt11287 * 1563815891; i_30_++) {
					Class60 class60 = client.aClass60Array11182[i_30_];
					String string_31_ = class60.aString763;
					String string_32_ = Class226.method4163(string_31_, Class112.aClass73_1351, (byte) 45);
					if (Class108.method1900(string, string_29_, string_31_, string_32_, 2112153215)) {
						client.anInt11287 -= -1975173029;
						for (int i_33_ = i_30_; i_33_ < 1563815891 * client.anInt11287; i_33_++)
							client.aClass60Array11182[i_33_] = client.aClass60Array11182[i_33_ + 1];
						client.anInt11183 = client.anInt11251 * -684273789;
						Class116 class116 = Class537.method8941(-1136408138);
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.aClass408_4279), (class116.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class6.method555(string, (byte) 64), 695481186);
						class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) 12);
						class116.method1974(class523_sub22, (byte) 53);
						break;
					}
				}
			}
		}
	}
}
