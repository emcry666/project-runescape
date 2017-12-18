/* Class499 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class499 {
	public static void method8109(boolean bool) {
		Class254.aClass217_2743.method3939(-652048753);
		if (BaseVarType.method7761(-2020118759 * client.anInt11136, (byte) 92)) {
			RSStream[] class116s = client.aClass116Array11210;
			for (int i = 0; i < class116s.length; i++) {
				RSStream class116 = class116s[i];
				class116.anInt1424 += -575771961;
				if (class116.anInt1424 * -1555613961 < 50 && !bool)
					return;
				class116.anInt1424 = 0;
				if (!class116.aBool1432 && class116.getCurrentStream(782493095) != null) {
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4323, class116.aClass11_1413, 1370050649);
					class116.method1974(class523_sub22, (byte) 67);
					try {
						class116.method1973(1512049308);
					} catch (IOException ioexception) {
						class116.aBool1432 = true;
					}
				}
			}
			Class254.aClass217_2743.method3939(1597720077);
		}
	}

	Class499() throws Throwable {
		throw new Error();
	}

	static final void method8110(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub32_10644.method16999(1074115321) == 1 ? 1 : 0;
	}

	static final void method8111(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		class250.anInt2579 = 228670967 * (class669.anIntArray8557[1357652815 * class669.anInt8558]);
		class250.anInt2580 = (-1951650067 * class669.anIntArray8557[1357652815 * class669.anInt8558 + 1]);
		Login.method15991(class250, (byte) -79);
	}

	static int method8112(int i) {
		if (null == client.aClass250_11197) {
			if (!Class36.aBool326) {
				if (Class61.aClass633_769.aBool8263) {
					if (null != Class36.aClass523_Sub27_Sub6_334)
						return (149462549 * Class36.aClass523_Sub27_Sub6_334.anInt11630);
				} else if (Class660.aClass523_Sub27_Sub6_8507 != null)
					return (149462549 * Class660.aClass523_Sub27_Sub6_8507.anInt11630);
			} else {
				Class10 class10 = client.method17697(1288452555);
				int i_0_ = Class642.aClass561_8334.method9426((byte) -89);
				int i_1_ = Class642.aClass561_8334.method9432(-886955547);
				if (!Class36.aBool327) {
					if (i_0_ > Whirlpool.anInt231 * -1744502791 && i_0_ < (-1744502791 * Whirlpool.anInt231 + BaseVarType.anInt5390 * -345535891)) {
						int i_2_ = -1;
						for (int i_3_ = 0; i_3_ < Class36.anInt330 * 462991943; i_3_++) {
							if (Class36.aBool353) {
								int i_4_ = (1 + (class10.anInt76 * -1669009881 + (20 + (Class194_Sub17.anInt9941 * 14756423))) + (1648921847 * Class36.anInt323 * (Class36.anInt330 * 462991943 - 1 - i_3_)));
								if (i_1_ > (i_4_ - -1669009881 * class10.anInt76 - 1) && (i_1_ < i_4_ + class10.anInt80 * -853549931))
									i_2_ = i_3_;
							} else {
								int i_5_ = (31 + 14756423 * Class194_Sub17.anInt9941 + ((Class36.anInt330 * 462991943 - 1 - i_3_) * (1648921847 * Class36.anInt323)));
								if (i_1_ > (i_5_ - class10.anInt76 * -1669009881 - 1) && (i_1_ < -853549931 * class10.anInt80 + i_5_))
									i_2_ = i_3_;
							}
						}
						if (i_2_ != -1) {
							int i_6_ = 0;
							Class706 class706 = new Class706(Class36.aClass708_342);
							for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) class706.method14146(1072242276)); null != class523_sub27_sub6; class523_sub27_sub6 = (Class523_Sub27_Sub6) class706.next()) {
								if (i_6_++ == i_2_)
									return (149462549 * class523_sub27_sub6.anInt11630);
							}
						}
					}
				} else if (i_0_ > -1744502791 * Whirlpool.anInt231 && i_0_ < (BaseVarType.anInt5390 * -345535891 + Whirlpool.anInt231 * -1744502791)) {
					int i_7_ = -1;
					for (int i_8_ = 0; i_8_ < -914479837 * Class36.anInt336; i_8_++) {
						if (Class36.aBool353) {
							int i_9_ = (Class36.anInt323 * 1648921847 * i_8_ + (1 + (-1669009881 * class10.anInt76 + (20 + 14756423 * (Class194_Sub17.anInt9941)))));
							if (i_1_ > i_9_ - -1669009881 * class10.anInt76 - 1 && i_1_ < class10.anInt80 * -853549931 + i_9_)
								i_7_ = i_8_;
						} else {
							int i_10_ = (1648921847 * Class36.anInt323 * i_8_ + (31 + Class194_Sub17.anInt9941 * 14756423));
							if ((i_1_ > i_10_ - class10.anInt76 * -1669009881 - 1) && i_1_ < class10.anInt80 * -853549931 + i_10_)
								i_7_ = i_8_;
						}
					}
					if (i_7_ != -1) {
						int i_11_ = 0;
						Class703 class703 = new Class703(Class36.aClass697_339);
						for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.method14129(-1229212183)); class523_sub27_sub8 != null; class523_sub27_sub8 = (Class523_Sub27_Sub8) class703.next()) {
							if (i_11_++ == i_7_)
								return (((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)).anInt11630 * 149462549);
						}
					}
				} else if (Class36.aClass523_Sub27_Sub8_328 != null && i_0_ > 1464782871 * Class523_Sub7.anInt10405 && i_0_ < (Class523_Sub7.anInt10405 * 1464782871 + 805194879 * Class426.anInt4824)) {
					int i_12_ = -1;
					for (int i_13_ = 0; i_13_ < 1060081949 * (Class36.aClass523_Sub27_Sub8_328.anInt11719); i_13_++) {
						if (Class36.aBool353) {
							int i_14_ = (class10.anInt76 * -1669009881 + (20 + 534142755 * Class301.anInt3330) + 1 + i_13_ * (Class36.anInt323 * 1648921847));
							if ((i_1_ > i_14_ - class10.anInt76 * -1669009881 - 1) && i_1_ < i_14_ + -853549931 * class10.anInt80)
								i_12_ = i_13_;
						} else {
							int i_15_ = (1648921847 * Class36.anInt323 * i_13_ + (534142755 * Class301.anInt3330 + 31));
							if ((i_1_ > i_15_ - -1669009881 * class10.anInt76 - 1) && i_1_ < i_15_ + -853549931 * class10.anInt80)
								i_12_ = i_13_;
						}
					}
					if (-1 != i_12_) {
						int i_16_ = 0;
						Class703 class703 = new Class703(Class36.aClass523_Sub27_Sub8_328.aClass697_11718);
						for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) class703.method14129(1994749506)); class523_sub27_sub6 != null; class523_sub27_sub6 = (Class523_Sub27_Sub6) class703.next()) {
							if (i_16_++ == i_12_)
								return (149462549 * class523_sub27_sub6.anInt11630);
						}
					}
				}
			}
		}
		return -1;
	}
}
