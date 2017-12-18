/* Class194_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class194_Sub3 extends Class194 {
	int anInt9880;
	int anInt9881;
	int anInt9882;
	int anInt9883;
	int anInt9884;
	static Class148[] aClass148Array9885;

	public void method3648(int i) {
		Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = Class191.aClass192Array2157[anInt9884 * -1581098997].method3631(594746006);
		class647_sub1_sub3_sub1.method18340(355766431 * anInt9881, anInt9883 * 398592077, 1470329515 * anInt9880, 90627269 * anInt9882, client.cycles, 0, -1360392525);
	}

	public void method3657() {
		Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = Class191.aClass192Array2157[anInt9884 * -1581098997].method3631(1339153044);
		class647_sub1_sub3_sub1.method18340(355766431 * anInt9881, anInt9883 * 398592077, 1470329515 * anInt9880, 90627269 * anInt9882, client.cycles, 0, -2138837222);
	}

	public void method3651() {
		Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = Class191.aClass192Array2157[anInt9884 * -1581098997].method3631(2046959875);
		class647_sub1_sub3_sub1.method18340(355766431 * anInt9881, anInt9883 * 398592077, 1470329515 * anInt9880, 90627269 * anInt9882, client.cycles, 0, -320655271);
	}

	public void method3656() {
		Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = Class191.aClass192Array2157[anInt9884 * -1581098997].method3631(1141863728);
		class647_sub1_sub3_sub1.method18340(355766431 * anInt9881, anInt9883 * 398592077, 1470329515 * anInt9880, 90627269 * anInt9882, client.cycles, 0, -270550537);
	}

	Class194_Sub3(RSBuffer class523_sub34) {
		super(class523_sub34);
		anInt9884 = class523_sub34.readUnsignedShort(-963589278) * -1153469533;
		int i = class523_sub34.readUnsignedByte(-2083154835);
		if ((i & 0x1) != 0) {
			anInt9881 = class523_sub34.readUnsignedShort(-520085109) * -1375171745;
			anInt9883 = class523_sub34.readUnsignedShort(-408654369) * 516976773;
		} else {
			anInt9881 = 1375171745;
			anInt9883 = -516976773;
		}
		if (0 != (i & 0x2)) {
			anInt9880 = class523_sub34.readUnsignedShort(-1548817737) * -436144125;
			anInt9882 = class523_sub34.readUnsignedShort(-274770103) * 1730953741;
		} else {
			anInt9880 = 436144125;
			anInt9882 = -1730953741;
		}
		if ((i & 0x4) != 0) {
			int i_0_ = class523_sub34.readUnsignedShort(-483337546);
			int i_1_ = class523_sub34.readUnsignedShort(-2099057197);
			int i_2_ = i_0_ * 255 / i_1_;
			if (i_0_ > 0 && i_2_ < 1) {
				boolean bool = true;
			}
		}
	}

	static int method15489(Player class647_sub1_sub3_sub1_sub2, byte i) {
		int i_3_ = -1258538771 * class647_sub1_sub3_sub1_sub2.anInt12193;
		Class588 class588 = class647_sub1_sub3_sub1_sub2.method18352(575125648);
		int i_4_ = class647_sub1_sub3_sub1_sub2.aClass707_Sub1_11887.method14163(-1880474707);
		if (-1 == i_4_ || class647_sub1_sub3_sub1_sub2.aClass707_Sub1_11887.aBool10956)
			i_3_ = class647_sub1_sub3_sub1_sub2.anInt12184 * 764561367;
		else if (684302799 * class588.anInt7772 == i_4_ || i_4_ == class588.anInt7759 * 1369343077 || class588.anInt7761 * 1751585825 == i_4_ || class588.anInt7760 * -893536895 == i_4_)
			i_3_ = -1487401711 * class647_sub1_sub3_sub1_sub2.anInt12190;
		else if (class588.anInt7762 * 87001555 == i_4_ || i_4_ == class588.anInt7763 * 1855181421 || -613234717 * class588.anInt7765 == i_4_ || i_4_ == 791380503 * class588.anInt7764)
			i_3_ = -1155504023 * class647_sub1_sub3_sub1_sub2.anInt12194;
		return i_3_;
	}

	public static Class523_Sub27_Sub15 method15490(int i, int i_5_, int i_6_) {
		Class261 class261 = (Class261) Class271.aMap2878.get(Integer.valueOf(i));
		return class261.method4721(i_5_, -1579645012);
	}
}
