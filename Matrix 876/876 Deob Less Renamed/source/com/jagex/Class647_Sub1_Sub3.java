/* Class647_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class647_Sub1_Sub3 extends Class647_Sub1 {
	public short aShort11749;
	public short aShort11750;
	public short aShort11751;
	public short aShort11752;
	public boolean aBool11753;
	int anInt11754 = 0;
	Class523_Sub20[] aClass523_Sub20Array11755 = new Class523_Sub20[4];
	byte aByte11756;

	boolean method16733() {
		for (int i = aShort11750; i <= aShort11749; i++) {
			for (int i_0_ = aShort11751; i_0_ <= aShort11752; i_0_++) {
				int i_1_ = (aClass560_10822.anInt7538 * -1164760089 + (i - aClass560_10822.anInt7504 * -208391685));
				if (i_1_ >= 0 && i_1_ < aClass560_10822.aBoolArrayArray7558.length) {
					int i_2_ = (i_0_ - aClass560_10822.anInt7533 * 164493233 + -1164760089 * aClass560_10822.anInt7538);
					if (i_2_ >= 0 && i_2_ < aClass560_10822.aBoolArrayArray7558.length && aClass560_10822.aBoolArrayArray7558[i_1_][i_2_])
						return true;
				}
			}
		}
		return false;
	}

	void method18158(int i) {
		/* empty */
	}

	boolean method16752() {
		for (int i = aShort11750; i <= aShort11749; i++) {
			for (int i_3_ = aShort11751; i_3_ <= aShort11752; i_3_++) {
				int i_4_ = (aClass560_10822.anInt7538 * -1164760089 + (i - aClass560_10822.anInt7504 * -208391685));
				if (i_4_ >= 0 && i_4_ < aClass560_10822.aBoolArrayArray7558.length) {
					int i_5_ = (i_3_ - aClass560_10822.anInt7533 * 164493233 + -1164760089 * aClass560_10822.anInt7538);
					if (i_5_ >= 0 && i_5_ < aClass560_10822.aBoolArrayArray7558.length && aClass560_10822.aBoolArrayArray7558[i_4_][i_5_])
						return true;
				}
			}
		}
		return false;
	}

	boolean method16708(Class178 class178, int i) {
		return (aClass560_10822.aClass544_7541.method9025(aByte10818, aShort11750, aShort11749, aShort11751, aShort11752, method16707(class178, (byte) 10)));
	}

	boolean method16709(int i) {
		for (int i_6_ = aShort11750; i_6_ <= aShort11749; i_6_++) {
			for (int i_7_ = aShort11751; i_7_ <= aShort11752; i_7_++) {
				int i_8_ = (aClass560_10822.anInt7538 * -1164760089 + (i_6_ - aClass560_10822.anInt7504 * -208391685));
				if (i_8_ >= 0 && i_8_ < aClass560_10822.aBoolArrayArray7558.length) {
					int i_9_ = (i_7_ - aClass560_10822.anInt7533 * 164493233 + -1164760089 * aClass560_10822.anInt7538);
					if (i_9_ >= 0 && i_9_ < aClass560_10822.aBoolArrayArray7558.length && aClass560_10822.aBoolArrayArray7558[i_8_][i_9_])
						return true;
				}
			}
		}
		return false;
	}

	int method16747(Class523_Sub20[] class523_sub20s) {
		if (aBool8371) {
			anInt11754 = 0;
			int i = Math.max(0, aShort11750);
			int i_10_ = Math.min((aClass560_10822.aLongArrayArrayArray7529[aByte10821]).length - 1, aShort11749);
			int i_11_ = Math.max(0, aShort11751);
			int i_12_ = Math.min((aClass560_10822.aLongArrayArrayArray7529[aByte10821][i]).length - 1, aShort11752);
			while_155_: for (/**/; i <= i_10_; i++) {
				for (/**/; i_11_ <= i_12_; i_11_++) {
					long l = (aClass560_10822.aLongArrayArrayArray7529[aByte10821][i][i_11_]);
					long l_13_ = 0L;
					while_154_: while (l_13_ <= 48L) {
						int i_14_ = (int) (l >>> (int) l_13_ & 0xffffL);
						if (i_14_ <= 0)
							break;
						Class550 class550 = aClass560_10822.aClass550Array7506[i_14_ - 1];
						for (int i_15_ = 0; i_15_ < -1527062611 * anInt11754; i_15_++) {
							if (class550.aClass523_Sub20_7349 == aClass523_Sub20Array11755[i_15_]) {
								l_13_ += 16L;
								continue while_154_;
							}
						}
						aClass523_Sub20Array11755[(anInt11754 += 171564069) * -1527062611 - 1] = class550.aClass523_Sub20_7349;
						if (4 == anInt11754 * -1527062611)
							break while_155_;
						l_13_ += 16L;
					}
				}
			}
			for (int i_16_ = -1527062611 * anInt11754; i_16_ < 4; i_16_++)
				aClass523_Sub20Array11755[i_16_] = null;
			if (0 != aByte11756) {
				int i_17_ = aShort11750 - -208391685 * aClass560_10822.anInt7504;
				int i_18_ = aShort11751 - aClass560_10822.anInt7533 * 164493233;
				short i_19_;
				int i_20_;
				int i_21_;
				short i_22_;
				if (aByte11756 == 1) {
					if (i_18_ > i_17_) {
						i_19_ = aShort11750;
						i_20_ = aShort11751 - 1;
						i_21_ = 1 + aShort11750;
						i_22_ = aShort11751;
					} else {
						i_19_ = aShort11750;
						i_20_ = 1 + aShort11751;
						i_21_ = aShort11750 - 1;
						i_22_ = aShort11751;
					}
				} else if (i_18_ > -i_17_) {
					i_19_ = aShort11750;
					i_20_ = aShort11751 - 1;
					i_21_ = aShort11750 - 1;
					i_22_ = aShort11751;
				} else {
					i_19_ = aShort11750;
					i_20_ = aShort11751 + 1;
					i_21_ = aShort11750 + 1;
					i_22_ = aShort11751;
				}
				int i_23_ = 0;
				while_157_: for (/**/; i_23_ < anInt11754 * -1527062611; i_23_++) {
					long l = (aClass560_10822.aLongArrayArrayArray7529[aByte10821][i_19_][i_20_]);
					while (l != 0L) {
						Class550 class550 = (aClass560_10822.aClass550Array7506[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (aClass523_Sub20Array11755[i_23_] == class550.aClass523_Sub20_7349)
							continue while_157_;
					}
					l = (aClass560_10822.aLongArrayArrayArray7529[aByte10821][i_21_][i_22_]);
					while (0L != l) {
						Class550 class550 = (aClass560_10822.aClass550Array7506[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (aClass523_Sub20Array11755[i_23_] == class550.aClass523_Sub20_7349)
							continue while_157_;
					}
					for (int i_24_ = i_23_; i_24_ < anInt11754 * -1527062611 - 1; i_24_++)
						aClass523_Sub20Array11755[i_24_] = aClass523_Sub20Array11755[i_24_ + 1];
					anInt11754 -= 171564069;
				}
			}
			aBool8371 = false;
		}
		for (int i = 0; i < anInt11754 * -1527062611; i++)
			class523_sub20s[i] = aClass523_Sub20Array11755[i];
		return -1527062611 * anInt11754;
	}

	void method18159() {
		/* empty */
	}

	void method18160() {
		/* empty */
	}

	int method16746(Class523_Sub20[] class523_sub20s) {
		if (aBool8371) {
			anInt11754 = 0;
			int i = Math.max(0, aShort11750);
			int i_25_ = Math.min((aClass560_10822.aLongArrayArrayArray7529[aByte10821]).length - 1, aShort11749);
			int i_26_ = Math.max(0, aShort11751);
			int i_27_ = Math.min((aClass560_10822.aLongArrayArrayArray7529[aByte10821][i]).length - 1, aShort11752);
			while_159_: for (/**/; i <= i_25_; i++) {
				for (/**/; i_26_ <= i_27_; i_26_++) {
					long l = (aClass560_10822.aLongArrayArrayArray7529[aByte10821][i][i_26_]);
					long l_28_ = 0L;
					while_158_: while (l_28_ <= 48L) {
						int i_29_ = (int) (l >>> (int) l_28_ & 0xffffL);
						if (i_29_ <= 0)
							break;
						Class550 class550 = aClass560_10822.aClass550Array7506[i_29_ - 1];
						for (int i_30_ = 0; i_30_ < -1527062611 * anInt11754; i_30_++) {
							if (class550.aClass523_Sub20_7349 == aClass523_Sub20Array11755[i_30_]) {
								l_28_ += 16L;
								continue while_158_;
							}
						}
						aClass523_Sub20Array11755[(anInt11754 += 171564069) * -1527062611 - 1] = class550.aClass523_Sub20_7349;
						if (4 == anInt11754 * -1527062611)
							break while_159_;
						l_28_ += 16L;
					}
				}
			}
			for (int i_31_ = -1527062611 * anInt11754; i_31_ < 4; i_31_++)
				aClass523_Sub20Array11755[i_31_] = null;
			if (0 != aByte11756) {
				int i_32_ = aShort11750 - -208391685 * aClass560_10822.anInt7504;
				int i_33_ = aShort11751 - aClass560_10822.anInt7533 * 164493233;
				short i_34_;
				int i_35_;
				int i_36_;
				short i_37_;
				if (aByte11756 == 1) {
					if (i_33_ > i_32_) {
						i_34_ = aShort11750;
						i_35_ = aShort11751 - 1;
						i_36_ = 1 + aShort11750;
						i_37_ = aShort11751;
					} else {
						i_34_ = aShort11750;
						i_35_ = 1 + aShort11751;
						i_36_ = aShort11750 - 1;
						i_37_ = aShort11751;
					}
				} else if (i_33_ > -i_32_) {
					i_34_ = aShort11750;
					i_35_ = aShort11751 - 1;
					i_36_ = aShort11750 - 1;
					i_37_ = aShort11751;
				} else {
					i_34_ = aShort11750;
					i_35_ = aShort11751 + 1;
					i_36_ = aShort11750 + 1;
					i_37_ = aShort11751;
				}
				int i_38_ = 0;
				while_161_: for (/**/; i_38_ < anInt11754 * -1527062611; i_38_++) {
					long l = (aClass560_10822.aLongArrayArrayArray7529[aByte10821][i_34_][i_35_]);
					while (l != 0L) {
						Class550 class550 = (aClass560_10822.aClass550Array7506[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (aClass523_Sub20Array11755[i_38_] == class550.aClass523_Sub20_7349)
							continue while_161_;
					}
					l = (aClass560_10822.aLongArrayArrayArray7529[aByte10821][i_36_][i_37_]);
					while (0L != l) {
						Class550 class550 = (aClass560_10822.aClass550Array7506[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (aClass523_Sub20Array11755[i_38_] == class550.aClass523_Sub20_7349)
							continue while_161_;
					}
					for (int i_39_ = i_38_; i_39_ < anInt11754 * -1527062611 - 1; i_39_++)
						aClass523_Sub20Array11755[i_39_] = aClass523_Sub20Array11755[i_39_ + 1];
					anInt11754 -= 171564069;
				}
			}
			aBool8371 = false;
		}
		for (int i = 0; i < anInt11754 * -1527062611; i++)
			class523_sub20s[i] = aClass523_Sub20Array11755[i];
		return -1527062611 * anInt11754;
	}

	Class647_Sub1_Sub3(Class560 class560, int i, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, boolean bool, byte i_48_) {
		super(class560);
		aByte10821 = (byte) i;
		aByte10818 = (byte) i_40_;
		method10573(new Class437((float) i_41_, (float) i_42_, (float) i_43_));
		aShort11750 = (short) i_44_;
		aShort11749 = (short) i_45_;
		aShort11751 = (short) i_46_;
		aShort11752 = (short) i_47_;
		aBool11753 = bool;
		aByte11756 = i_48_;
		for (int i_49_ = 0; i_49_ < 4; i_49_++)
			aClass523_Sub20Array11755[i_49_] = null;
	}

	int method16739(Class523_Sub20[] class523_sub20s) {
		if (aBool8371) {
			anInt11754 = 0;
			int i = Math.max(0, aShort11750);
			int i_50_ = Math.min((aClass560_10822.aLongArrayArrayArray7529[aByte10821]).length - 1, aShort11749);
			int i_51_ = Math.max(0, aShort11751);
			int i_52_ = Math.min((aClass560_10822.aLongArrayArrayArray7529[aByte10821][i]).length - 1, aShort11752);
			while_163_: for (/**/; i <= i_50_; i++) {
				for (/**/; i_51_ <= i_52_; i_51_++) {
					long l = (aClass560_10822.aLongArrayArrayArray7529[aByte10821][i][i_51_]);
					long l_53_ = 0L;
					while_162_: while (l_53_ <= 48L) {
						int i_54_ = (int) (l >>> (int) l_53_ & 0xffffL);
						if (i_54_ <= 0)
							break;
						Class550 class550 = aClass560_10822.aClass550Array7506[i_54_ - 1];
						for (int i_55_ = 0; i_55_ < -1527062611 * anInt11754; i_55_++) {
							if (class550.aClass523_Sub20_7349 == aClass523_Sub20Array11755[i_55_]) {
								l_53_ += 16L;
								continue while_162_;
							}
						}
						aClass523_Sub20Array11755[(anInt11754 += 171564069) * -1527062611 - 1] = class550.aClass523_Sub20_7349;
						if (4 == anInt11754 * -1527062611)
							break while_163_;
						l_53_ += 16L;
					}
				}
			}
			for (int i_56_ = -1527062611 * anInt11754; i_56_ < 4; i_56_++)
				aClass523_Sub20Array11755[i_56_] = null;
			if (0 != aByte11756) {
				int i_57_ = aShort11750 - -208391685 * aClass560_10822.anInt7504;
				int i_58_ = aShort11751 - aClass560_10822.anInt7533 * 164493233;
				short i_59_;
				int i_60_;
				int i_61_;
				short i_62_;
				if (aByte11756 == 1) {
					if (i_58_ > i_57_) {
						i_59_ = aShort11750;
						i_60_ = aShort11751 - 1;
						i_61_ = 1 + aShort11750;
						i_62_ = aShort11751;
					} else {
						i_59_ = aShort11750;
						i_60_ = 1 + aShort11751;
						i_61_ = aShort11750 - 1;
						i_62_ = aShort11751;
					}
				} else if (i_58_ > -i_57_) {
					i_59_ = aShort11750;
					i_60_ = aShort11751 - 1;
					i_61_ = aShort11750 - 1;
					i_62_ = aShort11751;
				} else {
					i_59_ = aShort11750;
					i_60_ = aShort11751 + 1;
					i_61_ = aShort11750 + 1;
					i_62_ = aShort11751;
				}
				int i_63_ = 0;
				while_165_: for (/**/; i_63_ < anInt11754 * -1527062611; i_63_++) {
					long l = (aClass560_10822.aLongArrayArrayArray7529[aByte10821][i_59_][i_60_]);
					while (l != 0L) {
						Class550 class550 = (aClass560_10822.aClass550Array7506[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (aClass523_Sub20Array11755[i_63_] == class550.aClass523_Sub20_7349)
							continue while_165_;
					}
					l = (aClass560_10822.aLongArrayArrayArray7529[aByte10821][i_61_][i_62_]);
					while (0L != l) {
						Class550 class550 = (aClass560_10822.aClass550Array7506[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (aClass523_Sub20Array11755[i_63_] == class550.aClass523_Sub20_7349)
							continue while_165_;
					}
					for (int i_64_ = i_63_; i_64_ < anInt11754 * -1527062611 - 1; i_64_++)
						aClass523_Sub20Array11755[i_64_] = aClass523_Sub20Array11755[i_64_ + 1];
					anInt11754 -= 171564069;
				}
			}
			aBool8371 = false;
		}
		for (int i = 0; i < anInt11754 * -1527062611; i++)
			class523_sub20s[i] = aClass523_Sub20Array11755[i];
		return -1527062611 * anInt11754;
	}

	boolean method16749(Class178 class178) {
		return (aClass560_10822.aClass544_7541.method9025(aByte10818, aShort11750, aShort11749, aShort11751, aShort11752, method16707(class178, (byte) 10)));
	}

	void method18161() {
		/* empty */
	}

	boolean method16712() {
		for (int i = aShort11750; i <= aShort11749; i++) {
			for (int i_65_ = aShort11751; i_65_ <= aShort11752; i_65_++) {
				int i_66_ = (aClass560_10822.anInt7538 * -1164760089 + (i - aClass560_10822.anInt7504 * -208391685));
				if (i_66_ >= 0 && i_66_ < aClass560_10822.aBoolArrayArray7558.length) {
					int i_67_ = (i_65_ - aClass560_10822.anInt7533 * 164493233 + -1164760089 * aClass560_10822.anInt7538);
					if (i_67_ >= 0 && i_67_ < aClass560_10822.aBoolArrayArray7558.length && aClass560_10822.aBoolArrayArray7558[i_66_][i_67_])
						return true;
				}
			}
		}
		return false;
	}

	int method16751(Class523_Sub20[] class523_sub20s, byte i) {
		if (aBool8371) {
			anInt11754 = 0;
			int i_68_ = Math.max(0, aShort11750);
			int i_69_ = Math.min((aClass560_10822.aLongArrayArrayArray7529[aByte10821]).length - 1, aShort11749);
			int i_70_ = Math.max(0, aShort11751);
			int i_71_ = Math.min((aClass560_10822.aLongArrayArrayArray7529[aByte10821][i_68_]).length - 1, aShort11752);
			while_167_: for (/**/; i_68_ <= i_69_; i_68_++) {
				for (/**/; i_70_ <= i_71_; i_70_++) {
					long l = (aClass560_10822.aLongArrayArrayArray7529[aByte10821][i_68_][i_70_]);
					long l_72_ = 0L;
					while_166_: while (l_72_ <= 48L) {
						int i_73_ = (int) (l >>> (int) l_72_ & 0xffffL);
						if (i_73_ <= 0)
							break;
						Class550 class550 = aClass560_10822.aClass550Array7506[i_73_ - 1];
						for (int i_74_ = 0; i_74_ < -1527062611 * anInt11754; i_74_++) {
							if (class550.aClass523_Sub20_7349 == aClass523_Sub20Array11755[i_74_]) {
								l_72_ += 16L;
								continue while_166_;
							}
						}
						aClass523_Sub20Array11755[(anInt11754 += 171564069) * -1527062611 - 1] = class550.aClass523_Sub20_7349;
						if (4 == anInt11754 * -1527062611)
							break while_167_;
						l_72_ += 16L;
					}
				}
			}
			for (int i_75_ = -1527062611 * anInt11754; i_75_ < 4; i_75_++)
				aClass523_Sub20Array11755[i_75_] = null;
			if (0 != aByte11756) {
				int i_76_ = aShort11750 - -208391685 * aClass560_10822.anInt7504;
				int i_77_ = aShort11751 - aClass560_10822.anInt7533 * 164493233;
				short i_78_;
				int i_79_;
				int i_80_;
				short i_81_;
				if (aByte11756 == 1) {
					if (i_77_ > i_76_) {
						i_78_ = aShort11750;
						i_79_ = aShort11751 - 1;
						i_80_ = 1 + aShort11750;
						i_81_ = aShort11751;
					} else {
						i_78_ = aShort11750;
						i_79_ = 1 + aShort11751;
						i_80_ = aShort11750 - 1;
						i_81_ = aShort11751;
					}
				} else if (i_77_ > -i_76_) {
					i_78_ = aShort11750;
					i_79_ = aShort11751 - 1;
					i_80_ = aShort11750 - 1;
					i_81_ = aShort11751;
				} else {
					i_78_ = aShort11750;
					i_79_ = aShort11751 + 1;
					i_80_ = aShort11750 + 1;
					i_81_ = aShort11751;
				}
				int i_82_ = 0;
				while_169_: for (/**/; i_82_ < anInt11754 * -1527062611; i_82_++) {
					long l = (aClass560_10822.aLongArrayArrayArray7529[aByte10821][i_78_][i_79_]);
					while (l != 0L) {
						Class550 class550 = (aClass560_10822.aClass550Array7506[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (aClass523_Sub20Array11755[i_82_] == class550.aClass523_Sub20_7349)
							continue while_169_;
					}
					l = (aClass560_10822.aLongArrayArrayArray7529[aByte10821][i_80_][i_81_]);
					while (0L != l) {
						Class550 class550 = (aClass560_10822.aClass550Array7506[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (aClass523_Sub20Array11755[i_82_] == class550.aClass523_Sub20_7349)
							continue while_169_;
					}
					for (int i_83_ = i_82_; i_83_ < anInt11754 * -1527062611 - 1; i_83_++)
						aClass523_Sub20Array11755[i_83_] = aClass523_Sub20Array11755[i_83_ + 1];
					anInt11754 -= 171564069;
				}
			}
			aBool8371 = false;
		}
		for (int i_84_ = 0; i_84_ < anInt11754 * -1527062611; i_84_++)
			class523_sub20s[i_84_] = aClass523_Sub20Array11755[i_84_];
		return -1527062611 * anInt11754;
	}
}
