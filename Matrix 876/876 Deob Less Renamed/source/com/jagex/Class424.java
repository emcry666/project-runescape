/* Class424 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.math.BigInteger;

public class Class424 {
	Class467_Sub1[] aClass467_Sub1Array4806;
	Class452 aClass452_4807;
	Class456 aClass456_4808;
	BigInteger aBigInteger4809;
	Class523_Sub27_Sub14_Sub2 aClass523_Sub27_Sub14_Sub2_4810;
	Class458 aClass458_4811;
	Class523_Sub27_Sub14_Sub3 aClass523_Sub27_Sub14_Sub3_4812;
	Class463 aClass463_4813;
	Class463 aClass463_4814;
	boolean aBool4815 = false;
	BigInteger aBigInteger4816;
	public static int anInt4817;

	Class467_Sub1 method6719(int i, Class545 class545, Class545 class545_0_, boolean bool, boolean bool_1_, byte i_2_) {
		if (aClass463_4813 == null)
			throw new RuntimeException();
		if (i < 0 || i >= aClass467_Sub1Array4806.length)
			throw new RuntimeException();
		if (null != aClass467_Sub1Array4806[i])
			return aClass467_Sub1Array4806[i];
		Class453 class453 = aClass463_4813.aClass453Array5126[i];
		Class467_Sub1 class467_sub1 = new Class467_Sub1(i, class545, class545_0_, aClass458_4811, bool_1_ ? aClass452_4807 : null, aClass456_4808, 2047842755 * class453.anInt4976, class453.aByteArray4978, class453.anInt4975 * 1366780505, bool, class453.anInt4977 * 1132245737);
		aClass467_Sub1Array4806[i] = class467_sub1;
		if (null != aClass463_4814 && bool_1_) {
			Class453 class453_3_ = aClass463_4814.aClass453Array5126[i];
			aClass467_Sub1Array4806[i].method15740((aClass467_Sub1Array4806[i].method15731(class453_3_.anInt4976 * 2047842755, class453_3_.aByteArray4978, 1366780505 * class453_3_.anInt4975, 1132245737 * class453_3_.anInt4977, 374036761)), -446436642);
		}
		return class467_sub1;
	}

	public boolean method6720(int i) {
		if (null != aClass463_4813)
			return true;
		if (null == aClass523_Sub27_Sub14_Sub2_4810) {
			if (aClass458_4811.method7466(1357652815))
				return false;
			aClass523_Sub27_Sub14_Sub2_4810 = aClass458_4811.method7450(255, 255, (byte) 0, true, (byte) 40);
		}
		if (aClass523_Sub27_Sub14_Sub2_4810.aBool11748)
			return false;
		Class523_Sub34 class523_sub34 = new Class523_Sub34(aClass523_Sub27_Sub14_Sub2_4810.method18148(310325297));
		aClass463_4813 = new Class463(class523_sub34, aBigInteger4809, aBigInteger4816);
		if (null == aClass467_Sub1Array4806)
			aClass467_Sub1Array4806 = new Class467_Sub1[aClass463_4813.aClass453Array5126.length];
		else {
			for (int i_4_ = 0; i_4_ < aClass467_Sub1Array4806.length; i_4_++) {
				if (null != aClass467_Sub1Array4806[i_4_]) {
					Class453 class453 = aClass463_4813.aClass453Array5126[i_4_];
					aClass467_Sub1Array4806[i_4_].method15730(class453.anInt4976 * 2047842755, class453.aByteArray4978, 1366780505 * class453.anInt4975, 1132245737 * class453.anInt4977, -332370899);
					if (aClass467_Sub1Array4806[i_4_].method15741(-746470699))
						aClass467_Sub1Array4806[i_4_].method15740(false, -485267624);
				}
			}
		}
		aBool4815 = false;
		return true;
	}

	public Class424(Class458 class458, Class452 class452, Class456 class456, BigInteger biginteger, BigInteger biginteger_5_) {
		aClass458_4811 = class458;
		aClass452_4807 = class452;
		aClass456_4808 = class456;
		aBigInteger4809 = biginteger;
		aBigInteger4816 = biginteger_5_;
		if (!aClass458_4811.method7466(1357652815))
			aClass523_Sub27_Sub14_Sub2_4810 = aClass458_4811.method7450(255, 255, (byte) 0, true, (byte) 8);
		if (aClass452_4807 != null)
			aClass523_Sub27_Sub14_Sub3_4812 = aClass452_4807.method7295((byte) -8);
	}

	public Class467_Sub1 method6721(int i, Class545 class545, Class545 class545_6_, boolean bool, byte i_7_) {
		return method6719(i, class545, class545_6_, true, bool, (byte) 22);
	}

	public void method6722(int i) {
		if (aClass467_Sub1Array4806 != null) {
			for (int i_8_ = 0; i_8_ < aClass467_Sub1Array4806.length; i_8_++) {
				if (null != aClass467_Sub1Array4806[i_8_])
					aClass467_Sub1Array4806[i_8_].method15771(-162441644);
			}
			for (int i_9_ = 0; i_9_ < aClass467_Sub1Array4806.length; i_9_++) {
				if (null != aClass467_Sub1Array4806[i_9_])
					aClass467_Sub1Array4806[i_9_].method15763((byte) 11);
			}
			if (null == aClass463_4813)
				method6720(232737714);
			else if (aClass452_4807 != null && !aBool4815) {
				if (null == aClass523_Sub27_Sub14_Sub3_4812)
					aClass523_Sub27_Sub14_Sub3_4812 = aClass452_4807.method7295((byte) 24);
				else if (!aClass523_Sub27_Sub14_Sub3_4812.aBool11748) {
					byte[] is = aClass523_Sub27_Sub14_Sub3_4812.method18148(-89889532);
					try {
						aClass463_4814 = new Class463(new Class523_Sub34(is), aBigInteger4809, aBigInteger4816);
						for (int i_10_ = 0; i_10_ < aClass467_Sub1Array4806.length; i_10_++) {
							if (aClass467_Sub1Array4806[i_10_] != null && aClass467_Sub1Array4806[i_10_].method15741(-81549921)) {
								Class453 class453 = aClass463_4814.aClass453Array5126[i_10_];
								aClass467_Sub1Array4806[i_10_].method15740((aClass467_Sub1Array4806[i_10_].method15731(class453.anInt4976 * 2047842755, class453.aByteArray4978, class453.anInt4975 * 1366780505, class453.anInt4977 * 1132245737, -798277597)), -814836593);
							}
						}
					} catch (Exception exception) {
						for (int i_11_ = 0; i_11_ < aClass467_Sub1Array4806.length; i_11_++) {
							if (aClass467_Sub1Array4806[i_11_] != null && aClass467_Sub1Array4806[i_11_].method15741(7016989))
								aClass467_Sub1Array4806[i_11_].method15740(false, -1012708650);
						}
					}
					aClass523_Sub27_Sub14_Sub3_4812 = null;
					aBool4815 = true;
				}
			}
		}
	}

	Class467_Sub1 method6723(int i, Class545 class545, Class545 class545_12_, boolean bool, boolean bool_13_) {
		if (aClass463_4813 == null)
			throw new RuntimeException();
		if (i < 0 || i >= aClass467_Sub1Array4806.length)
			throw new RuntimeException();
		if (null != aClass467_Sub1Array4806[i])
			return aClass467_Sub1Array4806[i];
		Class453 class453 = aClass463_4813.aClass453Array5126[i];
		Class467_Sub1 class467_sub1 = new Class467_Sub1(i, class545, class545_12_, aClass458_4811, bool_13_ ? aClass452_4807 : null, aClass456_4808, 2047842755 * class453.anInt4976, class453.aByteArray4978, class453.anInt4975 * 1366780505, bool, class453.anInt4977 * 1132245737);
		aClass467_Sub1Array4806[i] = class467_sub1;
		if (null != aClass463_4814 && bool_13_) {
			Class453 class453_14_ = aClass463_4814.aClass453Array5126[i];
			aClass467_Sub1Array4806[i].method15740((aClass467_Sub1Array4806[i].method15731(class453_14_.anInt4976 * 2047842755, class453_14_.aByteArray4978, 1366780505 * class453_14_.anInt4975, 1132245737 * class453_14_.anInt4977, 66514898)), -799535851);
		}
		return class467_sub1;
	}

	public Class467_Sub1 method6724(int i, Class545 class545, Class545 class545_15_, boolean bool) {
		return method6719(i, class545, class545_15_, true, bool, (byte) -106);
	}

	Class467_Sub1 method6725(int i, Class545 class545, Class545 class545_16_, boolean bool, boolean bool_17_) {
		if (aClass463_4813 == null)
			throw new RuntimeException();
		if (i < 0 || i >= aClass467_Sub1Array4806.length)
			throw new RuntimeException();
		if (null != aClass467_Sub1Array4806[i])
			return aClass467_Sub1Array4806[i];
		Class453 class453 = aClass463_4813.aClass453Array5126[i];
		Class467_Sub1 class467_sub1 = new Class467_Sub1(i, class545, class545_16_, aClass458_4811, bool_17_ ? aClass452_4807 : null, aClass456_4808, 2047842755 * class453.anInt4976, class453.aByteArray4978, class453.anInt4975 * 1366780505, bool, class453.anInt4977 * 1132245737);
		aClass467_Sub1Array4806[i] = class467_sub1;
		if (null != aClass463_4814 && bool_17_) {
			Class453 class453_18_ = aClass463_4814.aClass453Array5126[i];
			aClass467_Sub1Array4806[i].method15740((aClass467_Sub1Array4806[i].method15731(class453_18_.anInt4976 * 2047842755, class453_18_.aByteArray4978, 1366780505 * class453_18_.anInt4975, 1132245737 * class453_18_.anInt4977, 398606521)), -1512632849);
		}
		return class467_sub1;
	}

	public boolean method6726() {
		if (null != aClass463_4813)
			return true;
		if (null == aClass523_Sub27_Sub14_Sub2_4810) {
			if (aClass458_4811.method7466(1357652815))
				return false;
			aClass523_Sub27_Sub14_Sub2_4810 = aClass458_4811.method7450(255, 255, (byte) 0, true, (byte) 45);
		}
		if (aClass523_Sub27_Sub14_Sub2_4810.aBool11748)
			return false;
		Class523_Sub34 class523_sub34 = new Class523_Sub34(aClass523_Sub27_Sub14_Sub2_4810.method18148(763430061));
		aClass463_4813 = new Class463(class523_sub34, aBigInteger4809, aBigInteger4816);
		if (null == aClass467_Sub1Array4806)
			aClass467_Sub1Array4806 = new Class467_Sub1[aClass463_4813.aClass453Array5126.length];
		else {
			for (int i = 0; i < aClass467_Sub1Array4806.length; i++) {
				if (null != aClass467_Sub1Array4806[i]) {
					Class453 class453 = aClass463_4813.aClass453Array5126[i];
					aClass467_Sub1Array4806[i].method15730(class453.anInt4976 * 2047842755, class453.aByteArray4978, 1366780505 * class453.anInt4975, 1132245737 * class453.anInt4977, 73854722);
					if (aClass467_Sub1Array4806[i].method15741(-958266302))
						aClass467_Sub1Array4806[i].method15740(false, -565403720);
				}
			}
		}
		aBool4815 = false;
		return true;
	}

	public void method6727() {
		if (aClass467_Sub1Array4806 != null) {
			for (int i = 0; i < aClass467_Sub1Array4806.length; i++) {
				if (null != aClass467_Sub1Array4806[i])
					aClass467_Sub1Array4806[i].method15771(-162441644);
			}
			for (int i = 0; i < aClass467_Sub1Array4806.length; i++) {
				if (null != aClass467_Sub1Array4806[i])
					aClass467_Sub1Array4806[i].method15763((byte) -19);
			}
			if (null == aClass463_4813)
				method6720(232737714);
			else if (aClass452_4807 != null && !aBool4815) {
				if (null == aClass523_Sub27_Sub14_Sub3_4812)
					aClass523_Sub27_Sub14_Sub3_4812 = aClass452_4807.method7295((byte) -74);
				else if (!aClass523_Sub27_Sub14_Sub3_4812.aBool11748) {
					byte[] is = aClass523_Sub27_Sub14_Sub3_4812.method18148(405269967);
					try {
						aClass463_4814 = new Class463(new Class523_Sub34(is), aBigInteger4809, aBigInteger4816);
						for (int i = 0; i < aClass467_Sub1Array4806.length; i++) {
							if (aClass467_Sub1Array4806[i] != null && aClass467_Sub1Array4806[i].method15741(466236433)) {
								Class453 class453 = aClass463_4814.aClass453Array5126[i];
								aClass467_Sub1Array4806[i].method15740((aClass467_Sub1Array4806[i].method15731(class453.anInt4976 * 2047842755, class453.aByteArray4978, class453.anInt4975 * 1366780505, class453.anInt4977 * 1132245737, -435300742)), 210987073);
							}
						}
					} catch (Exception exception) {
						for (int i = 0; i < aClass467_Sub1Array4806.length; i++) {
							if (aClass467_Sub1Array4806[i] != null && aClass467_Sub1Array4806[i].method15741(1307456081))
								aClass467_Sub1Array4806[i].method15740(false, -1792697850);
						}
					}
					aClass523_Sub27_Sub14_Sub3_4812 = null;
					aBool4815 = true;
				}
			}
		}
	}

	public void method6728() {
		if (aClass467_Sub1Array4806 != null) {
			for (int i = 0; i < aClass467_Sub1Array4806.length; i++) {
				if (null != aClass467_Sub1Array4806[i])
					aClass467_Sub1Array4806[i].method15771(-162441644);
			}
			for (int i = 0; i < aClass467_Sub1Array4806.length; i++) {
				if (null != aClass467_Sub1Array4806[i])
					aClass467_Sub1Array4806[i].method15763((byte) -43);
			}
			if (null == aClass463_4813)
				method6720(232737714);
			else if (aClass452_4807 != null && !aBool4815) {
				if (null == aClass523_Sub27_Sub14_Sub3_4812)
					aClass523_Sub27_Sub14_Sub3_4812 = aClass452_4807.method7295((byte) 54);
				else if (!aClass523_Sub27_Sub14_Sub3_4812.aBool11748) {
					byte[] is = aClass523_Sub27_Sub14_Sub3_4812.method18148(-131010394);
					try {
						aClass463_4814 = new Class463(new Class523_Sub34(is), aBigInteger4809, aBigInteger4816);
						for (int i = 0; i < aClass467_Sub1Array4806.length; i++) {
							if (aClass467_Sub1Array4806[i] != null && aClass467_Sub1Array4806[i].method15741(1859657741)) {
								Class453 class453 = aClass463_4814.aClass453Array5126[i];
								aClass467_Sub1Array4806[i].method15740((aClass467_Sub1Array4806[i].method15731(class453.anInt4976 * 2047842755, class453.aByteArray4978, class453.anInt4975 * 1366780505, class453.anInt4977 * 1132245737, 532423345)), -1660773342);
							}
						}
					} catch (Exception exception) {
						for (int i = 0; i < aClass467_Sub1Array4806.length; i++) {
							if (aClass467_Sub1Array4806[i] != null && aClass467_Sub1Array4806[i].method15741(232387164))
								aClass467_Sub1Array4806[i].method15740(false, -575856293);
						}
					}
					aClass523_Sub27_Sub14_Sub3_4812 = null;
					aBool4815 = true;
				}
			}
		}
	}

	static boolean method6729(byte i) {
		return Class95.aBool1164;
	}

	static void method6730(Class669 class669, int i) {
		Class645.method10561(886782479);
		Class226.method4165(class669, -58023637);
	}

	static final void method6731(Class669 class669, byte i) {
		int i_19_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(i_19_, (byte) 21)).anInt2233) * -1826834279;
	}

	static final void method6732(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5337(1266067330).anInt3162) * -1378176729;
	}

	static int method6733(int i) {
		return 13;
	}
}
