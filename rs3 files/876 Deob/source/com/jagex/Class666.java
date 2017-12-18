/* Class666 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class666 implements Interface75 {
	public byte aByte8529;
	public static Class666 aClass666_8530 = new Class666(0, (byte) -1);
	public static Class666 aClass666_8531;
	public static Class666 aClass666_8532;
	public static Class666 aClass666_8533 = new Class666(1, (byte) 0);
	public int anInt8534;
	public static Class666 aClass666_8535;
	public static final int anInt8536 = 4;

	public static Class666[] method13653(byte i) {
		return new Class666[] { aClass666_8530, aClass666_8533, aClass666_8531, aClass666_8532, aClass666_8535 };
	}

	static {
		aClass666_8531 = new Class666(2, (byte) 1);
		aClass666_8532 = new Class666(3, (byte) 2);
		aClass666_8535 = new Class666(4, (byte) 3);
	}

	public int method82() {
		return aByte8529;
	}

	public int method13654(int i) {
		return 1 + aByte8529;
	}

	public static Class666[] method13655() {
		return new Class666[] { aClass666_8530, aClass666_8533, aClass666_8531, aClass666_8532, aClass666_8535 };
	}

	public int method13656() {
		return 1 + aByte8529;
	}

	public static Class666[] method13657() {
		return new Class666[] { aClass666_8530, aClass666_8533, aClass666_8531, aClass666_8532, aClass666_8535 };
	}

	public int method6() {
		return aByte8529;
	}

	Class666(int i, byte i_0_) {
		anInt8534 = 600934283 * i;
		aByte8529 = i_0_;
	}

	public static Class666[] method13658() {
		return new Class666[] { aClass666_8530, aClass666_8533, aClass666_8531, aClass666_8532, aClass666_8535 };
	}

	public static Class666[] method13659() {
		return new Class666[] { aClass666_8530, aClass666_8533, aClass666_8531, aClass666_8532, aClass666_8535 };
	}

	public static Class666[] method13660() {
		return new Class666[] { aClass666_8530, aClass666_8533, aClass666_8531, aClass666_8532, aClass666_8535 };
	}

	public int method13661() {
		return 1 + aByte8529;
	}

	public int method101() {
		return aByte8529;
	}

	public int method13662() {
		return 1 + aByte8529;
	}

	static final void method13663(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class669.aClass523_Sub19_8569.aByte10490;
	}

	static final void method13664(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		int i_1_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class487.method7946(i_1_, class250, class669, 90540333);
	}

	static void method13665(Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1, int i, int i_2_, int i_3_, byte i_4_) {
		Class588 class588 = class647_sub1_sub3_sub1.method18352(561986906);
		Class707_Sub1 class707_sub1 = class647_sub1_sub3_sub1.aClass707_Sub1_11887;
		int i_5_ = ((-1400614241 * class647_sub1_sub3_sub1.anInt11937 - class647_sub1_sub3_sub1.aClass72_11938.anInt797 * 1230650225) & 0x3fff);
		if (i == aClass666_8530.aByte8529) {
			if (i_5_ != 0 || -277313783 * class647_sub1_sub3_sub1.anInt11935 > 25) {
				if (i_3_ < 0 && class588.anInt7752 * -207655469 != -1) {
					class707_sub1.method14226(-207655469 * class588.anInt7752, false, true, (byte) 86);
					class707_sub1.aBool10956 = false;
				} else if (i_3_ > 0 && -1 != -1863328359 * class588.anInt7748) {
					class707_sub1.method14226(class588.anInt7748 * -1863328359, false, true, (byte) 8);
					class707_sub1.aBool10956 = false;
				} else if (!class707_sub1.aBool10956 || !(class588.method9737(class707_sub1.method14163(-1848718199), 2037117366))) {
					class707_sub1.method14226(class588.method9734(912316948), false, true, (byte) 123);
					class707_sub1.aBool10956 = class647_sub1_sub3_sub1.aClass707_Sub1_11887.method14161(-19896032);
				}
			} else if (!class707_sub1.aBool10956 || !class588.method9737(class707_sub1.method14163(-1736442318), 2037117366)) {
				class707_sub1.method14226(class588.method9734(-1785899555), false, true, (byte) 96);
				class707_sub1.aBool10956 = class707_sub1.method14161(-495333728);
			}
		} else if (-1 != class647_sub1_sub3_sub1.faceEntityId * -344760681 && (i_5_ >= 10240 || i_5_ <= 2048)) {
			int i_6_ = ((client.anIntArray11086[i_2_] - (1230650225 * class647_sub1_sub3_sub1.aClass72_11938.anInt797)) & 0x3fff);
			if (i == aClass666_8532.aByte8529 && -1 != 684302799 * class588.anInt7772) {
				if (i_6_ > 2048 && i_6_ <= 6144 && -1 != class588.anInt7761 * 1751585825)
					class707_sub1.method14226(1751585825 * class588.anInt7761, false, true, (byte) 44);
				else if (i_6_ >= 10240 && i_6_ < 14336 && -1 != class588.anInt7760 * -893536895)
					class707_sub1.method14226(class588.anInt7760 * -893536895, false, true, (byte) 120);
				else if (i_6_ > 6144 && i_6_ < 10240 && class588.anInt7759 * 1369343077 != -1)
					class707_sub1.method14226(class588.anInt7759 * 1369343077, false, true, (byte) 108);
				else
					class707_sub1.method14226(684302799 * class588.anInt7772, false, true, (byte) 10);
			} else if (i == aClass666_8533.aByte8529 && -1 != 87001555 * class588.anInt7762) {
				if (i_6_ > 2048 && i_6_ <= 6144 && -1 != -613234717 * class588.anInt7765)
					class707_sub1.method14226(-613234717 * class588.anInt7765, false, true, (byte) 53);
				else if (i_6_ >= 10240 && i_6_ < 14336 && class588.anInt7764 * 791380503 != -1)
					class707_sub1.method14226(class588.anInt7764 * 791380503, false, true, (byte) 101);
				else if (i_6_ > 6144 && i_6_ < 10240 && -1 != class588.anInt7763 * 1855181421)
					class707_sub1.method14226(class588.anInt7763 * 1855181421, false, true, (byte) 89);
				else
					class707_sub1.method14226(87001555 * class588.anInt7762, false, true, (byte) 59);
			} else if (i_6_ > 2048 && i_6_ <= 6144 && -1 != 1796392159 * class588.anInt7757)
				class707_sub1.method14226(1796392159 * class588.anInt7757, false, true, (byte) 8);
			else if (i_6_ >= 10240 && i_6_ < 14336 && -1 != class588.anInt7756 * -724205313)
				class707_sub1.method14226(class588.anInt7756 * -724205313, false, true, (byte) 12);
			else if (i_6_ > 6144 && i_6_ < 10240 && -1 != -1140021099 * class588.anInt7755)
				class707_sub1.method14226(class588.anInt7755 * -1140021099, false, true, (byte) 114);
			else
				class707_sub1.method14226(class588.anInt7754 * 430185815, false, true, (byte) 59);
			class707_sub1.aBool10956 = false;
		} else if (0 != i_5_ || class647_sub1_sub3_sub1.anInt11935 * -277313783 > 25) {
			if (i == aClass666_8532.aByte8529 && 684302799 * class588.anInt7772 != -1) {
				if (i_3_ < 0 && class588.anInt7785 * 213684443 != -1)
					class707_sub1.method14226(213684443 * class588.anInt7785, false, true, (byte) 68);
				else if (i_3_ > 0 && class588.anInt7769 * -1019346901 != -1)
					class707_sub1.method14226(class588.anInt7769 * -1019346901, false, true, (byte) 95);
				else
					class707_sub1.method14226(class588.anInt7772 * 684302799, false, true, (byte) 16);
			} else if (aClass666_8533.aByte8529 == i && -1 != class588.anInt7762 * 87001555) {
				if (i_3_ < 0 && -1 != class588.anInt7766 * -1717141423)
					class707_sub1.method14226(class588.anInt7766 * -1717141423, false, true, (byte) 6);
				else if (i_3_ > 0 && -1 != -1416939543 * class588.anInt7771)
					class707_sub1.method14226(-1416939543 * class588.anInt7771, false, true, (byte) 76);
				else
					class707_sub1.method14226(87001555 * class588.anInt7762, false, true, (byte) 38);
			} else if (i_3_ < 0 && -1 != 735182951 * class588.anInt7753)
				class707_sub1.method14226(class588.anInt7753 * 735182951, false, true, (byte) 83);
			else if (i_3_ > 0 && -1 != class588.anInt7775 * -1211758029)
				class707_sub1.method14226(class588.anInt7775 * -1211758029, false, true, (byte) 36);
			else
				class707_sub1.method14226(430185815 * class588.anInt7754, false, true, (byte) 90);
			class707_sub1.aBool10956 = false;
		} else {
			if (i == aClass666_8532.aByte8529 && -1 != class588.anInt7772 * 684302799)
				class707_sub1.method14226(684302799 * class588.anInt7772, false, true, (byte) 68);
			else if (i == aClass666_8533.aByte8529 && class588.anInt7762 * 87001555 != -1)
				class707_sub1.method14226(87001555 * class588.anInt7762, false, true, (byte) 33);
			else
				class707_sub1.method14226(class588.anInt7754 * 430185815, false, true, (byte) 127);
			class707_sub1.aBool10956 = false;
		}
	}
}
