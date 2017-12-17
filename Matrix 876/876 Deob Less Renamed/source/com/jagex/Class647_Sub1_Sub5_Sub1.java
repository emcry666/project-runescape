/* Class647_Sub1_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class647_Sub1_Sub5_Sub1 extends Class647_Sub1_Sub5 {
	public Class435 aClass435_12116;
	public int anInt12117;
	static Class435 aClass435_12118 = new Class435();
	public int anInt12119 = -1205037175;
	public int anInt12120;
	public int anInt12121 = -1947751391;
	public int anInt12122;
	public Class435 aClass435_12123;
	public Class435 aClass435_12124;
	int anInt12125;
	public int anInt12126;
	int anInt12127;
	int anInt12128;
	int anInt12129;
	boolean aBool12130;
	int anInt12131;
	public int anInt12132;

	public static Class435 method18589() {
		Class435 class435 = new Class435();
		class435.method6855(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793 * 2.0));
		float f = (float) (0.5 + 0.5 * Math.random()) * 256.0F;
		class435.method6819(f - 128.0F, 0.0F, 0.0F);
		class435.method6814(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793 * 2.0));
		return class435;
	}

	void method18590(int i) {
		anInt12129 = (32 + (int) (Math.random() * 4.0)) * -1970349977;
		anInt12125 = (3 + (int) (Math.random() * 2.0)) * -124026549;
		anInt12131 = (16 + (int) (Math.random() * 3.0)) * 1628963331;
		if (Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(1809088486) == 1)
			anInt12127 = (int) (Math.random() * 10.0) * -1213287193;
		else
			anInt12127 = (int) (Math.random() * 20.0) * -1213287193;
	}

	boolean method16701(int i) {
		return false;
	}

	boolean method16702(int i) {
		return aBool12130;
	}

	public Class564 method16707(Class178 class178, byte i) {
		return null;
	}

	public int method16743(int i) {
		return -10;
	}

	Class559 method16744(Class178 class178, byte i) {
		Class437 class437 = Class437.method6884(method10569().aClass437_4862);
		Class548 class548 = aClass560_10822.method9285(aByte10821, (int) class437.aFloat4903 >> 9, (int) class437.aFloat4905 >> 9, -1424232899);
		Class647_Sub1_Sub2 class647_sub1_sub2 = aClass560_10822.method9398(aByte10821, (int) class437.aFloat4903 >> 9, (int) class437.aFloat4905 >> 9, -1793211672);
		int i_0_ = 0;
		for (/**/; class548 != null; class548 = class548.aClass548_7319) {
			if (class548.aClass647_Sub1_Sub3_7318.aBool11753 && (class548.aClass647_Sub1_Sub3_7318.method16743(1553107151) < i_0_))
				i_0_ = class548.aClass647_Sub1_Sub3_7318.method16743(-1593395015);
		}
		if (class647_sub1_sub2 != null && class647_sub1_sub2.aShort11740 > -i_0_)
			i_0_ = -class647_sub1_sub2.aShort11740;
		if (anInt12126 * -1837958075 != i_0_) {
			class437.aFloat4904 += (float) (i_0_ - anInt12126 * -1837958075);
			method10573(class437);
			anInt12126 = i_0_ * -1540704627;
		}
		Class435 class435 = class178.method3113();
		class435.method6806();
		if (0 == anInt12126 * -1837958075) {
			boolean bool = false;
			boolean bool_1_ = false;
			boolean bool_2_ = false;
			Class142 class142 = aClass560_10822.aClass142Array7509[aByte10818];
			int i_3_ = anInt12128 * 1125193101 << 1;
			int i_4_ = i_3_;
			int i_5_ = -i_3_ / 2;
			int i_6_ = -i_4_ / 2;
			int i_7_ = class142.method2326((int) class437.aFloat4903 + i_5_, i_6_ + (int) class437.aFloat4905, -1269093648);
			int i_8_ = i_3_ / 2;
			int i_9_ = -i_4_ / 2;
			int i_10_ = class142.method2326((int) class437.aFloat4903 + i_8_, i_9_ + (int) class437.aFloat4905, 1814628870);
			int i_11_ = -i_3_ / 2;
			int i_12_ = i_4_ / 2;
			int i_13_ = class142.method2326((int) class437.aFloat4903 + i_11_, i_12_ + (int) class437.aFloat4905, -976518849);
			int i_14_ = i_3_ / 2;
			int i_15_ = i_4_ / 2;
			int i_16_ = class142.method2326((int) class437.aFloat4903 + i_14_, i_15_ + (int) class437.aFloat4905, -422812180);
			int i_17_ = i_7_ < i_10_ ? i_7_ : i_10_;
			int i_18_ = i_13_ < i_16_ ? i_13_ : i_16_;
			int i_19_ = i_10_ < i_16_ ? i_10_ : i_16_;
			int i_20_ = i_7_ < i_13_ ? i_7_ : i_13_;
			if (0 != i_4_) {
				int i_21_ = ((int) (Math.atan2((double) (i_17_ - i_18_), (double) i_4_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_21_)
					class435.method6814(1.0F, 0.0F, 0.0F, Class433.method6799(i_21_));
			}
			if (0 != i_3_) {
				int i_22_ = ((int) (Math.atan2((double) (i_20_ - i_19_), (double) i_3_) * 2607.5945876176133) & 0x3fff);
				if (i_22_ != 0)
					class435.method6814(0.0F, 0.0F, 1.0F, Class433.method6799(-i_22_));
			}
			int i_23_ = i_16_ + i_7_;
			if (i_13_ + i_10_ < i_23_)
				i_23_ = i_13_ + i_10_;
			i_23_ = (i_23_ >> 1) - (int) class437.aFloat4904;
			if (0 != i_23_)
				class435.method6819(0.0F, (float) i_23_, 0.0F);
		}
		class437.method6949();
		Class437 class437_24_ = method10569().aClass437_4862;
		class435.method6819(class437_24_.aFloat4903, class437_24_.aFloat4904 - 10.0F, class437_24_.aFloat4905);
		Class559 class559 = Class238.method4306(true, -1389223737);
		aBool12130 = false;
		anInt12128 = 0;
		if (1382885407 * anInt12121 != -1) {
			Class167 class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(1382885407 * anInt12121, (byte) 67)).method660(class178, 526336, -2107666397 * anInt12122, null, null, 1706214231 * anInt12129, anInt12125 * 108462179, anInt12131 * -176015189, -1896538409 * anInt12127, (byte) 0));
			if (null != class167) {
				if (aClass435_12123 == null)
					aClass435_12118.method6806();
				else
					aClass435_12118.method6803(aClass435_12123);
				aClass435_12118.method6820(class435);
				class167.method2708(aClass435_12118, aClass180Array10823[2], 0);
				aBool12130 |= class167.method2730();
				anInt12128 = class167.method2834() * 627782981;
			}
		}
		if (-794103481 * anInt12119 != -1) {
			Class167 class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(-794103481 * anInt12119, (byte) -13)).method660(class178, 526336, 1257592359 * anInt12120, null, null, 1706214231 * anInt12129, anInt12125 * 108462179, anInt12131 * -176015189, anInt12127 * -1896538409, (byte) 0));
			if (class167 != null) {
				if (aClass435_12124 == null)
					aClass435_12118.method6806();
				else
					aClass435_12118.method6803(aClass435_12124);
				aClass435_12118.method6820(class435);
				class167.method2708(aClass435_12118, aClass180Array10823[1], 0);
				aBool12130 |= class167.method2730();
				if (class167.method2834() > 1125193101 * anInt12128)
					anInt12128 = class167.method2834() * 627782981;
			}
		}
		Class167 class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(anInt12117 * 742080807, (byte) 24)).method660(class178, 526336, -1098181263 * anInt12132, null, null, anInt12129 * 1706214231, anInt12125 * 108462179, -176015189 * anInt12131, -1896538409 * anInt12127, (byte) 0));
		if (class167 != null) {
			if (null == aClass435_12116)
				aClass435_12118.method6806();
			else
				aClass435_12118.method6803(aClass435_12116);
			aClass435_12118.method6820(class435);
			class167.method2708(aClass435_12118, aClass180Array10823[0], 0);
			aBool12130 |= class167.method2730();
			if (class167.method2834() > anInt12128 * 1125193101)
				anInt12128 = class167.method2834() * 627782981;
		}
		return class559;
	}

	void method16706(Class178 class178, short i) {
		/* empty */
	}

	int method16705(int i) {
		ItemDefinitions class12 = (ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(anInt12117 * 742080807, (byte) 56);
		int i_25_ = class12.anInt165 * -58882773;
		if (-1 != -794103481 * anInt12119) {
			ItemDefinitions class12_26_ = (ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(anInt12119 * -794103481, (byte) -25);
			if (class12_26_.anInt165 * -58882773 > i_25_)
				i_25_ = class12_26_.anInt165 * -58882773;
		}
		if (1382885407 * anInt12121 != -1) {
			ItemDefinitions class12_27_ = (ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(anInt12121 * 1382885407, (byte) 103);
			if (class12_27_.anInt165 * -58882773 > i_25_)
				i_25_ = class12_27_.anInt165 * -58882773;
		}
		return i_25_;
	}

	public Class647_Sub1_Sub5_Sub1(Class560 class560, int i, int i_28_, int i_29_, int i_30_, int i_31_) {
		super(class560, i, i_28_, i_29_, i_30_, i_31_);
		aClass435_12116 = null;
		aClass435_12124 = null;
		aClass435_12123 = null;
		anInt12126 = 0;
		anInt12128 = 0;
		aBool12130 = false;
		method16714(3, 1672451183);
		method18590(2081574401);
	}

	public int method16720() {
		return -10;
	}

	Class559 method16725(Class178 class178) {
		Class437 class437 = Class437.method6884(method10569().aClass437_4862);
		Class548 class548 = aClass560_10822.method9285(aByte10821, (int) class437.aFloat4903 >> 9, (int) class437.aFloat4905 >> 9, 707742776);
		Class647_Sub1_Sub2 class647_sub1_sub2 = aClass560_10822.method9398(aByte10821, (int) class437.aFloat4903 >> 9, (int) class437.aFloat4905 >> 9, -1218060992);
		int i = 0;
		for (/**/; class548 != null; class548 = class548.aClass548_7319) {
			if (class548.aClass647_Sub1_Sub3_7318.aBool11753 && (class548.aClass647_Sub1_Sub3_7318.method16743(1798950478) < i))
				i = class548.aClass647_Sub1_Sub3_7318.method16743(1780682809);
		}
		if (class647_sub1_sub2 != null && class647_sub1_sub2.aShort11740 > -i)
			i = -class647_sub1_sub2.aShort11740;
		if (anInt12126 * -1837958075 != i) {
			class437.aFloat4904 += (float) (i - anInt12126 * -1837958075);
			method10573(class437);
			anInt12126 = i * -1540704627;
		}
		Class435 class435 = class178.method3113();
		class435.method6806();
		if (0 == anInt12126 * -1837958075) {
			boolean bool = false;
			boolean bool_32_ = false;
			boolean bool_33_ = false;
			Class142 class142 = aClass560_10822.aClass142Array7509[aByte10818];
			int i_34_ = anInt12128 * 1125193101 << 1;
			int i_35_ = i_34_;
			int i_36_ = -i_34_ / 2;
			int i_37_ = -i_35_ / 2;
			int i_38_ = class142.method2326((int) class437.aFloat4903 + i_36_, i_37_ + (int) class437.aFloat4905, 518977465);
			int i_39_ = i_34_ / 2;
			int i_40_ = -i_35_ / 2;
			int i_41_ = class142.method2326((int) class437.aFloat4903 + i_39_, i_40_ + (int) class437.aFloat4905, 1678736284);
			int i_42_ = -i_34_ / 2;
			int i_43_ = i_35_ / 2;
			int i_44_ = class142.method2326((int) class437.aFloat4903 + i_42_, i_43_ + (int) class437.aFloat4905, -804432105);
			int i_45_ = i_34_ / 2;
			int i_46_ = i_35_ / 2;
			int i_47_ = class142.method2326((int) class437.aFloat4903 + i_45_, i_46_ + (int) class437.aFloat4905, -1890544330);
			int i_48_ = i_38_ < i_41_ ? i_38_ : i_41_;
			int i_49_ = i_44_ < i_47_ ? i_44_ : i_47_;
			int i_50_ = i_41_ < i_47_ ? i_41_ : i_47_;
			int i_51_ = i_38_ < i_44_ ? i_38_ : i_44_;
			if (0 != i_35_) {
				int i_52_ = ((int) (Math.atan2((double) (i_48_ - i_49_), (double) i_35_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_52_)
					class435.method6814(1.0F, 0.0F, 0.0F, Class433.method6799(i_52_));
			}
			if (0 != i_34_) {
				int i_53_ = ((int) (Math.atan2((double) (i_51_ - i_50_), (double) i_34_) * 2607.5945876176133) & 0x3fff);
				if (i_53_ != 0)
					class435.method6814(0.0F, 0.0F, 1.0F, Class433.method6799(-i_53_));
			}
			int i_54_ = i_47_ + i_38_;
			if (i_44_ + i_41_ < i_54_)
				i_54_ = i_44_ + i_41_;
			i_54_ = (i_54_ >> 1) - (int) class437.aFloat4904;
			if (0 != i_54_)
				class435.method6819(0.0F, (float) i_54_, 0.0F);
		}
		class437.method6949();
		Class437 class437_55_ = method10569().aClass437_4862;
		class435.method6819(class437_55_.aFloat4903, class437_55_.aFloat4904 - 10.0F, class437_55_.aFloat4905);
		Class559 class559 = Class238.method4306(true, -1396218356);
		aBool12130 = false;
		anInt12128 = 0;
		if (1382885407 * anInt12121 != -1) {
			Class167 class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(1382885407 * anInt12121, (byte) 22)).method660(class178, 526336, -2107666397 * anInt12122, null, null, 1706214231 * anInt12129, anInt12125 * 108462179, anInt12131 * -176015189, -1896538409 * anInt12127, (byte) 0));
			if (null != class167) {
				if (aClass435_12123 == null)
					aClass435_12118.method6806();
				else
					aClass435_12118.method6803(aClass435_12123);
				aClass435_12118.method6820(class435);
				class167.method2708(aClass435_12118, aClass180Array10823[2], 0);
				aBool12130 |= class167.method2730();
				anInt12128 = class167.method2834() * 627782981;
			}
		}
		if (-794103481 * anInt12119 != -1) {
			Class167 class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(-794103481 * anInt12119, (byte) -111)).method660(class178, 526336, 1257592359 * anInt12120, null, null, 1706214231 * anInt12129, anInt12125 * 108462179, anInt12131 * -176015189, anInt12127 * -1896538409, (byte) 0));
			if (class167 != null) {
				if (aClass435_12124 == null)
					aClass435_12118.method6806();
				else
					aClass435_12118.method6803(aClass435_12124);
				aClass435_12118.method6820(class435);
				class167.method2708(aClass435_12118, aClass180Array10823[1], 0);
				aBool12130 |= class167.method2730();
				if (class167.method2834() > 1125193101 * anInt12128)
					anInt12128 = class167.method2834() * 627782981;
			}
		}
		Class167 class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(anInt12117 * 742080807, (byte) 6)).method660(class178, 526336, -1098181263 * anInt12132, null, null, anInt12129 * 1706214231, anInt12125 * 108462179, -176015189 * anInt12131, -1896538409 * anInt12127, (byte) 0));
		if (class167 != null) {
			if (null == aClass435_12116)
				aClass435_12118.method6806();
			else
				aClass435_12118.method6803(aClass435_12116);
			aClass435_12118.method6820(class435);
			class167.method2708(aClass435_12118, aClass180Array10823[0], 0);
			aBool12130 |= class167.method2730();
			if (class167.method2834() > anInt12128 * 1125193101)
				anInt12128 = class167.method2834() * 627782981;
		}
		return class559;
	}

	boolean method16715() {
		return false;
	}

	boolean method16716() {
		return aBool12130;
	}

	boolean method16741() {
		return aBool12130;
	}

	boolean method16718() {
		return aBool12130;
	}

	public int method16719() {
		return -10;
	}

	public static Class435 method18591() {
		Class435 class435 = new Class435();
		class435.method6855(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793 * 2.0));
		float f = (float) (0.5 + 0.5 * Math.random()) * 256.0F;
		class435.method6819(f - 128.0F, 0.0F, 0.0F);
		class435.method6814(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793 * 2.0));
		return class435;
	}

	public Class564 method16721(Class178 class178) {
		return null;
	}

	void method18592() {
		anInt12129 = (32 + (int) (Math.random() * 4.0)) * -1970349977;
		anInt12125 = (3 + (int) (Math.random() * 2.0)) * -124026549;
		anInt12131 = (16 + (int) (Math.random() * 3.0)) * 1628963331;
		if (Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(2080154225) == 1)
			anInt12127 = (int) (Math.random() * 10.0) * -1213287193;
		else
			anInt12127 = (int) (Math.random() * 20.0) * -1213287193;
	}

	public int method16723() {
		return anInt12126 * -1837958075 - method16743(-1011109825);
	}

	Class559 method16724(Class178 class178) {
		Class437 class437 = Class437.method6884(method10569().aClass437_4862);
		Class548 class548 = aClass560_10822.method9285(aByte10821, (int) class437.aFloat4903 >> 9, (int) class437.aFloat4905 >> 9, -2023885104);
		Class647_Sub1_Sub2 class647_sub1_sub2 = aClass560_10822.method9398(aByte10821, (int) class437.aFloat4903 >> 9, (int) class437.aFloat4905 >> 9, -1582185778);
		int i = 0;
		for (/**/; class548 != null; class548 = class548.aClass548_7319) {
			if (class548.aClass647_Sub1_Sub3_7318.aBool11753 && (class548.aClass647_Sub1_Sub3_7318.method16743(-1085152548) < i))
				i = class548.aClass647_Sub1_Sub3_7318.method16743(-906019042);
		}
		if (class647_sub1_sub2 != null && class647_sub1_sub2.aShort11740 > -i)
			i = -class647_sub1_sub2.aShort11740;
		if (anInt12126 * -1837958075 != i) {
			class437.aFloat4904 += (float) (i - anInt12126 * -1837958075);
			method10573(class437);
			anInt12126 = i * -1540704627;
		}
		Class435 class435 = class178.method3113();
		class435.method6806();
		if (0 == anInt12126 * -1837958075) {
			boolean bool = false;
			boolean bool_56_ = false;
			boolean bool_57_ = false;
			Class142 class142 = aClass560_10822.aClass142Array7509[aByte10818];
			int i_58_ = anInt12128 * 1125193101 << 1;
			int i_59_ = i_58_;
			int i_60_ = -i_58_ / 2;
			int i_61_ = -i_59_ / 2;
			int i_62_ = class142.method2326((int) class437.aFloat4903 + i_60_, i_61_ + (int) class437.aFloat4905, 549910779);
			int i_63_ = i_58_ / 2;
			int i_64_ = -i_59_ / 2;
			int i_65_ = class142.method2326((int) class437.aFloat4903 + i_63_, i_64_ + (int) class437.aFloat4905, -448396013);
			int i_66_ = -i_58_ / 2;
			int i_67_ = i_59_ / 2;
			int i_68_ = class142.method2326((int) class437.aFloat4903 + i_66_, i_67_ + (int) class437.aFloat4905, -1040519896);
			int i_69_ = i_58_ / 2;
			int i_70_ = i_59_ / 2;
			int i_71_ = class142.method2326((int) class437.aFloat4903 + i_69_, i_70_ + (int) class437.aFloat4905, 1146390837);
			int i_72_ = i_62_ < i_65_ ? i_62_ : i_65_;
			int i_73_ = i_68_ < i_71_ ? i_68_ : i_71_;
			int i_74_ = i_65_ < i_71_ ? i_65_ : i_71_;
			int i_75_ = i_62_ < i_68_ ? i_62_ : i_68_;
			if (0 != i_59_) {
				int i_76_ = ((int) (Math.atan2((double) (i_72_ - i_73_), (double) i_59_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_76_)
					class435.method6814(1.0F, 0.0F, 0.0F, Class433.method6799(i_76_));
			}
			if (0 != i_58_) {
				int i_77_ = ((int) (Math.atan2((double) (i_75_ - i_74_), (double) i_58_) * 2607.5945876176133) & 0x3fff);
				if (i_77_ != 0)
					class435.method6814(0.0F, 0.0F, 1.0F, Class433.method6799(-i_77_));
			}
			int i_78_ = i_71_ + i_62_;
			if (i_68_ + i_65_ < i_78_)
				i_78_ = i_68_ + i_65_;
			i_78_ = (i_78_ >> 1) - (int) class437.aFloat4904;
			if (0 != i_78_)
				class435.method6819(0.0F, (float) i_78_, 0.0F);
		}
		class437.method6949();
		Class437 class437_79_ = method10569().aClass437_4862;
		class435.method6819(class437_79_.aFloat4903, class437_79_.aFloat4904 - 10.0F, class437_79_.aFloat4905);
		Class559 class559 = Class238.method4306(true, -304874565);
		aBool12130 = false;
		anInt12128 = 0;
		if (1382885407 * anInt12121 != -1) {
			Class167 class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(1382885407 * anInt12121, (byte) -81)).method660(class178, 526336, -2107666397 * anInt12122, null, null, 1706214231 * anInt12129, anInt12125 * 108462179, anInt12131 * -176015189, -1896538409 * anInt12127, (byte) 0));
			if (null != class167) {
				if (aClass435_12123 == null)
					aClass435_12118.method6806();
				else
					aClass435_12118.method6803(aClass435_12123);
				aClass435_12118.method6820(class435);
				class167.method2708(aClass435_12118, aClass180Array10823[2], 0);
				aBool12130 |= class167.method2730();
				anInt12128 = class167.method2834() * 627782981;
			}
		}
		if (-794103481 * anInt12119 != -1) {
			Class167 class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(-794103481 * anInt12119, (byte) -72)).method660(class178, 526336, 1257592359 * anInt12120, null, null, 1706214231 * anInt12129, anInt12125 * 108462179, anInt12131 * -176015189, anInt12127 * -1896538409, (byte) 0));
			if (class167 != null) {
				if (aClass435_12124 == null)
					aClass435_12118.method6806();
				else
					aClass435_12118.method6803(aClass435_12124);
				aClass435_12118.method6820(class435);
				class167.method2708(aClass435_12118, aClass180Array10823[1], 0);
				aBool12130 |= class167.method2730();
				if (class167.method2834() > 1125193101 * anInt12128)
					anInt12128 = class167.method2834() * 627782981;
			}
		}
		Class167 class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(anInt12117 * 742080807, (byte) 13)).method660(class178, 526336, -1098181263 * anInt12132, null, null, anInt12129 * 1706214231, anInt12125 * 108462179, -176015189 * anInt12131, -1896538409 * anInt12127, (byte) 0));
		if (class167 != null) {
			if (null == aClass435_12116)
				aClass435_12118.method6806();
			else
				aClass435_12118.method6803(aClass435_12116);
			aClass435_12118.method6820(class435);
			class167.method2708(aClass435_12118, aClass180Array10823[0], 0);
			aBool12130 |= class167.method2730();
			if (class167.method2834() > anInt12128 * 1125193101)
				anInt12128 = class167.method2834() * 627782981;
		}
		return class559;
	}

	public int method16722() {
		return anInt12126 * -1837958075 - method16743(-457016242);
	}

	Class559 method16726(Class178 class178) {
		Class437 class437 = Class437.method6884(method10569().aClass437_4862);
		Class548 class548 = aClass560_10822.method9285(aByte10821, (int) class437.aFloat4903 >> 9, (int) class437.aFloat4905 >> 9, -187462805);
		Class647_Sub1_Sub2 class647_sub1_sub2 = aClass560_10822.method9398(aByte10821, (int) class437.aFloat4903 >> 9, (int) class437.aFloat4905 >> 9, -1784298737);
		int i = 0;
		for (/**/; class548 != null; class548 = class548.aClass548_7319) {
			if (class548.aClass647_Sub1_Sub3_7318.aBool11753 && (class548.aClass647_Sub1_Sub3_7318.method16743(103752299) < i))
				i = class548.aClass647_Sub1_Sub3_7318.method16743(-848535898);
		}
		if (class647_sub1_sub2 != null && class647_sub1_sub2.aShort11740 > -i)
			i = -class647_sub1_sub2.aShort11740;
		if (anInt12126 * -1837958075 != i) {
			class437.aFloat4904 += (float) (i - anInt12126 * -1837958075);
			method10573(class437);
			anInt12126 = i * -1540704627;
		}
		Class435 class435 = class178.method3113();
		class435.method6806();
		if (0 == anInt12126 * -1837958075) {
			boolean bool = false;
			boolean bool_80_ = false;
			boolean bool_81_ = false;
			Class142 class142 = aClass560_10822.aClass142Array7509[aByte10818];
			int i_82_ = anInt12128 * 1125193101 << 1;
			int i_83_ = i_82_;
			int i_84_ = -i_82_ / 2;
			int i_85_ = -i_83_ / 2;
			int i_86_ = class142.method2326((int) class437.aFloat4903 + i_84_, i_85_ + (int) class437.aFloat4905, 1570905267);
			int i_87_ = i_82_ / 2;
			int i_88_ = -i_83_ / 2;
			int i_89_ = class142.method2326((int) class437.aFloat4903 + i_87_, i_88_ + (int) class437.aFloat4905, -1104185441);
			int i_90_ = -i_82_ / 2;
			int i_91_ = i_83_ / 2;
			int i_92_ = class142.method2326((int) class437.aFloat4903 + i_90_, i_91_ + (int) class437.aFloat4905, 2144646298);
			int i_93_ = i_82_ / 2;
			int i_94_ = i_83_ / 2;
			int i_95_ = class142.method2326((int) class437.aFloat4903 + i_93_, i_94_ + (int) class437.aFloat4905, -1465522379);
			int i_96_ = i_86_ < i_89_ ? i_86_ : i_89_;
			int i_97_ = i_92_ < i_95_ ? i_92_ : i_95_;
			int i_98_ = i_89_ < i_95_ ? i_89_ : i_95_;
			int i_99_ = i_86_ < i_92_ ? i_86_ : i_92_;
			if (0 != i_83_) {
				int i_100_ = ((int) (Math.atan2((double) (i_96_ - i_97_), (double) i_83_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_100_)
					class435.method6814(1.0F, 0.0F, 0.0F, Class433.method6799(i_100_));
			}
			if (0 != i_82_) {
				int i_101_ = ((int) (Math.atan2((double) (i_99_ - i_98_), (double) i_82_) * 2607.5945876176133) & 0x3fff);
				if (i_101_ != 0)
					class435.method6814(0.0F, 0.0F, 1.0F, Class433.method6799(-i_101_));
			}
			int i_102_ = i_95_ + i_86_;
			if (i_92_ + i_89_ < i_102_)
				i_102_ = i_92_ + i_89_;
			i_102_ = (i_102_ >> 1) - (int) class437.aFloat4904;
			if (0 != i_102_)
				class435.method6819(0.0F, (float) i_102_, 0.0F);
		}
		class437.method6949();
		Class437 class437_103_ = method10569().aClass437_4862;
		class435.method6819(class437_103_.aFloat4903, class437_103_.aFloat4904 - 10.0F, class437_103_.aFloat4905);
		Class559 class559 = Class238.method4306(true, -1161429256);
		aBool12130 = false;
		anInt12128 = 0;
		if (1382885407 * anInt12121 != -1) {
			Class167 class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(1382885407 * anInt12121, (byte) 33)).method660(class178, 526336, -2107666397 * anInt12122, null, null, 1706214231 * anInt12129, anInt12125 * 108462179, anInt12131 * -176015189, -1896538409 * anInt12127, (byte) 0));
			if (null != class167) {
				if (aClass435_12123 == null)
					aClass435_12118.method6806();
				else
					aClass435_12118.method6803(aClass435_12123);
				aClass435_12118.method6820(class435);
				class167.method2708(aClass435_12118, aClass180Array10823[2], 0);
				aBool12130 |= class167.method2730();
				anInt12128 = class167.method2834() * 627782981;
			}
		}
		if (-794103481 * anInt12119 != -1) {
			Class167 class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(-794103481 * anInt12119, (byte) -45)).method660(class178, 526336, 1257592359 * anInt12120, null, null, 1706214231 * anInt12129, anInt12125 * 108462179, anInt12131 * -176015189, anInt12127 * -1896538409, (byte) 0));
			if (class167 != null) {
				if (aClass435_12124 == null)
					aClass435_12118.method6806();
				else
					aClass435_12118.method6803(aClass435_12124);
				aClass435_12118.method6820(class435);
				class167.method2708(aClass435_12118, aClass180Array10823[1], 0);
				aBool12130 |= class167.method2730();
				if (class167.method2834() > 1125193101 * anInt12128)
					anInt12128 = class167.method2834() * 627782981;
			}
		}
		Class167 class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(anInt12117 * 742080807, (byte) -27)).method660(class178, 526336, -1098181263 * anInt12132, null, null, anInt12129 * 1706214231, anInt12125 * 108462179, -176015189 * anInt12131, -1896538409 * anInt12127, (byte) 0));
		if (class167 != null) {
			if (null == aClass435_12116)
				aClass435_12118.method6806();
			else
				aClass435_12118.method6803(aClass435_12116);
			aClass435_12118.method6820(class435);
			class167.method2708(aClass435_12118, aClass180Array10823[0], 0);
			aBool12130 |= class167.method2730();
			if (class167.method2834() > anInt12128 * 1125193101)
				anInt12128 = class167.method2834() * 627782981;
		}
		return class559;
	}

	void method16727(Class178 class178) {
		/* empty */
	}

	public static Class435 method18593() {
		Class435 class435 = new Class435();
		class435.method6855(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793 * 2.0));
		float f = (float) (0.5 + 0.5 * Math.random()) * 256.0F;
		class435.method6819(f - 128.0F, 0.0F, 0.0F);
		class435.method6814(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793 * 2.0));
		return class435;
	}

	int method16750() {
		ItemDefinitions class12 = (ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(anInt12117 * 742080807, (byte) 80);
		int i = class12.anInt165 * -58882773;
		if (-1 != -794103481 * anInt12119) {
			ItemDefinitions class12_104_ = (ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(anInt12119 * -794103481, (byte) 60);
			if (class12_104_.anInt165 * -58882773 > i)
				i = class12_104_.anInt165 * -58882773;
		}
		if (1382885407 * anInt12121 != -1) {
			ItemDefinitions class12_105_ = (ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(anInt12121 * 1382885407, (byte) -13);
			if (class12_105_.anInt165 * -58882773 > i)
				i = class12_105_.anInt165 * -58882773;
		}
		return i;
	}

	boolean method16736(Class178 class178, int i, int i_106_) {
		Class435 class435 = class178.method3113();
		class435.method6804(method10569());
		class435.method6819(0.0F, -10.0F, 0.0F);
		Class167 class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(742080807 * anInt12117, (byte) 52)).method660(class178, 131072, anInt12132 * -1098181263, null, null, 0, 0, 0, 0, (byte) 0));
		if (null != class167) {
			if (null == aClass435_12116)
				aClass435_12118.method6806();
			else
				aClass435_12118.method6803(aClass435_12116);
			aClass435_12118.method6820(class435);
			if (class167.method2709(i, i_106_, aClass435_12118, true, 0))
				return true;
		}
		if (-1 != -794103481 * anInt12119) {
			class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(-794103481 * anInt12119, (byte) 48)).method660(class178, 131072, 1257592359 * anInt12120, null, null, 0, 0, 0, 0, (byte) 0));
			if (null != class167) {
				if (null == aClass435_12124)
					aClass435_12118.method6806();
				else
					aClass435_12118.method6803(aClass435_12124);
				aClass435_12118.method6820(class435);
				if (class167.method2709(i, i_106_, aClass435_12118, true, 0))
					return true;
			}
		}
		if (-1 != anInt12121 * 1382885407) {
			class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(anInt12121 * 1382885407, (byte) 45)).method660(class178, 131072, anInt12122 * -2107666397, null, null, 0, 0, 0, 0, (byte) 0));
			if (class167 != null) {
				if (null == aClass435_12123)
					aClass435_12118.method6806();
				else
					aClass435_12118.method6803(aClass435_12123);
				aClass435_12118.method6820(class435);
				if (class167.method2709(i, i_106_, aClass435_12118, true, 0))
					return true;
			}
		}
		return false;
	}

	boolean method16713(Class178 class178, int i, int i_107_) {
		Class435 class435 = class178.method3113();
		class435.method6804(method10569());
		class435.method6819(0.0F, -10.0F, 0.0F);
		Class167 class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(742080807 * anInt12117, (byte) -31)).method660(class178, 131072, anInt12132 * -1098181263, null, null, 0, 0, 0, 0, (byte) 0));
		if (null != class167) {
			if (null == aClass435_12116)
				aClass435_12118.method6806();
			else
				aClass435_12118.method6803(aClass435_12116);
			aClass435_12118.method6820(class435);
			if (class167.method2709(i, i_107_, aClass435_12118, true, 0))
				return true;
		}
		if (-1 != -794103481 * anInt12119) {
			class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(-794103481 * anInt12119, (byte) 0)).method660(class178, 131072, 1257592359 * anInt12120, null, null, 0, 0, 0, 0, (byte) 0));
			if (null != class167) {
				if (null == aClass435_12124)
					aClass435_12118.method6806();
				else
					aClass435_12118.method6803(aClass435_12124);
				aClass435_12118.method6820(class435);
				if (class167.method2709(i, i_107_, aClass435_12118, true, 0))
					return true;
			}
		}
		if (-1 != anInt12121 * 1382885407) {
			class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(anInt12121 * 1382885407, (byte) -32)).method660(class178, 131072, anInt12122 * -2107666397, null, null, 0, 0, 0, 0, (byte) 0));
			if (class167 != null) {
				if (null == aClass435_12123)
					aClass435_12118.method6806();
				else
					aClass435_12118.method6803(aClass435_12123);
				aClass435_12118.method6820(class435);
				if (class167.method2709(i, i_107_, aClass435_12118, true, 0))
					return true;
			}
		}
		return false;
	}

	void method18594() {
		anInt12129 = (32 + (int) (Math.random() * 4.0)) * -1970349977;
		anInt12125 = (3 + (int) (Math.random() * 2.0)) * -124026549;
		anInt12131 = (16 + (int) (Math.random() * 3.0)) * 1628963331;
		if (Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(1594374261) == 1)
			anInt12127 = (int) (Math.random() * 10.0) * -1213287193;
		else
			anInt12127 = (int) (Math.random() * 20.0) * -1213287193;
	}

	void method18595() {
		anInt12129 = (32 + (int) (Math.random() * 4.0)) * -1970349977;
		anInt12125 = (3 + (int) (Math.random() * 2.0)) * -124026549;
		anInt12131 = (16 + (int) (Math.random() * 3.0)) * 1628963331;
		if (Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(1801209772) == 1)
			anInt12127 = (int) (Math.random() * 10.0) * -1213287193;
		else
			anInt12127 = (int) (Math.random() * 20.0) * -1213287193;
	}

	public int method16740(int i) {
		return anInt12126 * -1837958075 - method16743(1404472877);
	}

	void method16756(Class178 class178) {
		/* empty */
	}

	boolean method16698(Class178 class178, int i, int i_108_, byte i_109_) {
		Class435 class435 = class178.method3113();
		class435.method6804(method10569());
		class435.method6819(0.0F, -10.0F, 0.0F);
		Class167 class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(742080807 * anInt12117, (byte) -15)).method660(class178, 131072, anInt12132 * -1098181263, null, null, 0, 0, 0, 0, (byte) 0));
		if (null != class167) {
			if (null == aClass435_12116)
				aClass435_12118.method6806();
			else
				aClass435_12118.method6803(aClass435_12116);
			aClass435_12118.method6820(class435);
			if (class167.method2709(i, i_108_, aClass435_12118, true, 0))
				return true;
		}
		if (-1 != -794103481 * anInt12119) {
			class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(-794103481 * anInt12119, (byte) 92)).method660(class178, 131072, 1257592359 * anInt12120, null, null, 0, 0, 0, 0, (byte) 0));
			if (null != class167) {
				if (null == aClass435_12124)
					aClass435_12118.method6806();
				else
					aClass435_12118.method6803(aClass435_12124);
				aClass435_12118.method6820(class435);
				if (class167.method2709(i, i_108_, aClass435_12118, true, 0))
					return true;
			}
		}
		if (-1 != anInt12121 * 1382885407) {
			class167 = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(anInt12121 * 1382885407, (byte) 46)).method660(class178, 131072, anInt12122 * -2107666397, null, null, 0, 0, 0, 0, (byte) 0));
			if (class167 != null) {
				if (null == aClass435_12123)
					aClass435_12118.method6806();
				else
					aClass435_12118.method6803(aClass435_12123);
				aClass435_12118.method6820(class435);
				if (class167.method2709(i, i_108_, aClass435_12118, true, 0))
					return true;
			}
		}
		return false;
	}

	int method16738() {
		ItemDefinitions class12 = (ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(anInt12117 * 742080807, (byte) 2);
		int i = class12.anInt165 * -58882773;
		if (-1 != -794103481 * anInt12119) {
			ItemDefinitions class12_110_ = (ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(anInt12119 * -794103481, (byte) -88);
			if (class12_110_.anInt165 * -58882773 > i)
				i = class12_110_.anInt165 * -58882773;
		}
		if (1382885407 * anInt12121 != -1) {
			ItemDefinitions class12_111_ = ((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(anInt12121 * 1382885407, (byte) -102));
			if (class12_111_.anInt165 * -58882773 > i)
				i = class12_111_.anInt165 * -58882773;
		}
		return i;
	}

	void method16728(Class178 class178) {
		/* empty */
	}
}
