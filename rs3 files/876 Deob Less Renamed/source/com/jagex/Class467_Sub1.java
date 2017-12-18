/* Class467_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.zip.CRC32;

public class Class467_Sub1 extends Class467 {
	Class708 aClass708_10207;
	Class458 aClass458_10208;
	Class452 aClass452_10209;
	Class456 aClass456_10210;
	int anInt10211;
	Class545 aClass545_10212;
	Class523_Sub27_Sub14 aClass523_Sub27_Sub14_10213;
	int anInt10214;
	byte[] aByteArray10215;
	static final int anInt10216 = 250;
	Class460 aClass460_10217;
	static final byte aByte10218 = 0;
	Class545 aClass545_10219;
	static CRC32 aCRC32_10220 = new CRC32();
	static final byte aByte10221 = 1;
	int anInt10222 = 0;
	Class14 aClass14_10223 = new Class14(16);
	boolean aBool10224;
	byte[] aByteArray10225;
	boolean aBool10226;
	int anInt10227;
	Class708 aClass708_10228;
	static final byte aByte10229 = -1;
	boolean aBool10230;
	boolean aBool10231;
	static final int anInt10232 = 1000;
	long aLong10233;
	static final int anInt10234 = 0;
	int anInt10235;
	static final int anInt10236 = 1;
	static final int anInt10237 = 2;

	byte[] method7584(int i) {
		Class523_Sub27_Sub14 class523_sub27_sub14 = method15733(i, 0, -1659550609);
		if (class523_sub27_sub14 == null)
			return null;
		byte[] is = class523_sub27_sub14.method18148(279682401);
		class523_sub27_sub14.method8661(607052656);
		return is;
	}

	void method15730(int i, byte[] is, int i_0_, int i_1_, int i_2_) {
		if (!method15731(i, is, i_0_, i_1_, 132910268)) {
			anInt10235 = i * 444297217;
			aByteArray10215 = is;
			anInt10214 = i_0_ * -1398195927;
			aClass460_10217 = null;
			aClass523_Sub27_Sub14_10213 = null;
			if (!aClass458_10208.method7466(1357652815))
				aClass523_Sub27_Sub14_10213 = aClass458_10208.method7450(255, anInt10227 * -1015669585, (byte) 0, true, (byte) 60);
		}
	}

	boolean method15731(int i, byte[] is, int i_3_, int i_4_, int i_5_) {
		if (-1232826367 * anInt10235 == i && i_3_ == anInt10214 * -1511230695) {
			boolean bool = true;
			for (int i_6_ = 0; i_6_ < aByteArray10215.length; i_6_++) {
				if (aByteArray10215[i_6_] != is[i_6_]) {
					bool = false;
					break;
				}
			}
			if (bool)
				return true;
		}
		return false;
	}

	public int method15732(int i) {
		if (method7583(-1160257881) == null) {
			if (null == aClass523_Sub27_Sub14_10213)
				return 0;
			return aClass523_Sub27_Sub14_10213.method18156((byte) -122);
		}
		return 100;
	}

	Class460 method7583(int i) {
		if (null != aClass460_10217)
			return aClass460_10217;
		if (null == aClass523_Sub27_Sub14_10213) {
			if (aClass458_10208.method7466(1357652815))
				return null;
			aClass523_Sub27_Sub14_10213 = aClass458_10208.method7450(255, anInt10227 * -1015669585, (byte) 0, true, (byte) 11);
		}
		if (aClass523_Sub27_Sub14_10213.aBool11748)
			return null;
		byte[] is = aClass523_Sub27_Sub14_10213.method18148(-1229852616);
		if (aClass523_Sub27_Sub14_10213 instanceof Class523_Sub27_Sub14_Sub1) {
			try {
				if (null == is)
					throw new RuntimeException();
				aClass460_10217 = new Class460(is, anInt10235 * -1232826367, aByteArray10215);
				if (anInt10214 * -1511230695 != 991837091 * aClass460_10217.anInt5114)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				aClass460_10217 = null;
				if (aClass458_10208.method7466(1357652815))
					aClass523_Sub27_Sub14_10213 = null;
				else
					aClass523_Sub27_Sub14_10213 = aClass458_10208.method7450(255, -1015669585 * anInt10227, (byte) 0, true, (byte) -32);
				return null;
			}
		} else {
			try {
				if (is == null)
					throw new RuntimeException();
				aClass460_10217 = new Class460(is, -1232826367 * anInt10235, aByteArray10215);
			} catch (RuntimeException runtimeexception) {
				aClass458_10208.method7454(255, anInt10227 * -1015669585, 2009754461);
				aClass460_10217 = null;
				if (aClass458_10208.method7466(1357652815))
					aClass523_Sub27_Sub14_10213 = null;
				else
					aClass523_Sub27_Sub14_10213 = aClass458_10208.method7450(255, anInt10227 * -1015669585, (byte) 0, true, (byte) 33);
				return null;
			}
			if (null != aClass545_10212)
				aClass456_10210.method7415(-1015669585 * anInt10227, is, aClass545_10212, -1037883768);
		}
		aClass523_Sub27_Sub14_10213 = null;
		if (null != aClass545_10219) {
			aByteArray10225 = new byte[-132118613 * aClass460_10217.anInt5105];
			anInt10222 = 0;
		}
		return aClass460_10217;
	}

	byte[] method7582(int i, int i_7_) {
		Class523_Sub27_Sub14 class523_sub27_sub14 = method15733(i, 0, -1264526227);
		if (class523_sub27_sub14 == null)
			return null;
		byte[] is = class523_sub27_sub14.method18148(-815728467);
		class523_sub27_sub14.method8661(607052656);
		return is;
	}

	Class523_Sub27_Sub14 method15733(int i, int i_8_, int i_9_) {
		Class523_Sub27_Sub14 class523_sub27_sub14 = (Class523_Sub27_Sub14) aClass14_10223.method741((long) i);
		if (class523_sub27_sub14 != null && i_8_ == 0 && !class523_sub27_sub14.aBool11746 && class523_sub27_sub14.aBool11748) {
			class523_sub27_sub14.method8661(607052656);
			class523_sub27_sub14 = null;
		}
		if (null == class523_sub27_sub14) {
			if (i_8_ == 0) {
				if (null != aClass545_10219 && -1 != aByteArray10225[i])
					class523_sub27_sub14 = aClass456_10210.method7416(i, aClass545_10219, -416862475);
				else if (aClass452_10209 != null) {
					class523_sub27_sub14 = aClass452_10209.method7305(anInt10227 * -1015669585, i, (byte) 2, true, (aClass460_10217.anIntArray5102[i]), (aClass460_10217.anIntArray5097[i]), -275024306);
					if (class523_sub27_sub14 == null)
						return null;
				} else if (!aClass458_10208.method7466(1357652815))
					class523_sub27_sub14 = aClass458_10208.method7450(-1015669585 * anInt10227, i, (byte) 2, true, (byte) -3);
				else
					return null;
			} else if (1 == i_8_) {
				if (null == aClass545_10219)
					throw new RuntimeException();
				class523_sub27_sub14 = aClass456_10210.method7429(i, aClass545_10219, 1804132408);
			} else if (i_8_ == 2) {
				if (null == aClass545_10219)
					throw new RuntimeException();
				if (aByteArray10225[i] != -1)
					throw new RuntimeException();
				if (null != aClass452_10209)
					return null;
				if (!aClass458_10208.method7467((byte) -13))
					class523_sub27_sub14 = aClass458_10208.method7450(-1015669585 * anInt10227, i, (byte) 2, false, (byte) 13);
				else
					return null;
			} else
				throw new RuntimeException();
			aClass14_10223.method738(class523_sub27_sub14, (long) i);
		}
		if (class523_sub27_sub14.aBool11748)
			return null;
		byte[] is = class523_sub27_sub14.method18148(-98422428);
		if (class523_sub27_sub14 instanceof Class523_Sub27_Sub14_Sub1) {
			Class523_Sub27_Sub14 class523_sub27_sub14_10_;
			try {
				if (null == is || is.length <= 2)
					throw new RuntimeException();
				aCRC32_10220.reset();
				aCRC32_10220.update(is, 0, is.length - 2);
				int i_11_ = (int) aCRC32_10220.getValue();
				if (i_11_ != aClass460_10217.anIntArray5102[i])
					throw new RuntimeException();
				if (aClass460_10217.aByteArrayArray5108 != null && aClass460_10217.aByteArrayArray5108[i] != null) {
					byte[] is_12_ = aClass460_10217.aByteArrayArray5108[i];
					byte[] is_13_ = Class202.method3698(is, 0, is.length - 2, -2118710135);
					for (int i_14_ = 0; i_14_ < 64; i_14_++) {
						if (is_13_[i_14_] != is_12_[i_14_])
							throw new RuntimeException();
					}
				}
				int i_15_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
				if (i_15_ != (aClass460_10217.anIntArray5097[i] & 0xffff))
					throw new RuntimeException();
				if (1 != aByteArray10225[i]) {
					if (0 != aByteArray10225[i]) {
						/* empty */
					}
					anInt10222 += -1893115207;
					aByteArray10225[i] = (byte) 1;
				}
				if (!class523_sub27_sub14.aBool11746)
					class523_sub27_sub14.method8661(607052656);
				class523_sub27_sub14_10_ = class523_sub27_sub14;
			} catch (Exception exception) {
				aByteArray10225[i] = (byte) -1;
				class523_sub27_sub14.method8661(607052656);
				if (class523_sub27_sub14.aBool11746) {
					if (null != aClass452_10209) {
						if (!aClass452_10209.method7294((byte) 76)) {
							Class523_Sub27_Sub14_Sub3 class523_sub27_sub14_sub3 = (aClass452_10209.method7305(anInt10227 * -1015669585, i, (byte) 2, true, aClass460_10217.anIntArray5102[i], aClass460_10217.anIntArray5097[i], -189653165));
							if (null != class523_sub27_sub14_sub3)
								aClass14_10223.method738(class523_sub27_sub14_sub3, (long) i);
						}
					} else if (!aClass458_10208.method7466(1357652815)) {
						Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = aClass458_10208.method7450((-1015669585 * anInt10227), i, (byte) 2, true, (byte) -56);
						aClass14_10223.method738(class523_sub27_sub14_sub2, (long) i);
					}
				}
				return null;
			}
			return class523_sub27_sub14_10_;
		}
		try {
			if (null == is || is.length <= 2) {
				if (aClass452_10209 != null) {
					class523_sub27_sub14.method8661(607052656);
					return null;
				}
				throw new RuntimeException();
			}
			aCRC32_10220.reset();
			aCRC32_10220.update(is, 0, is.length - 2);
			int i_16_ = (int) aCRC32_10220.getValue();
			if (i_16_ != aClass460_10217.anIntArray5102[i])
				throw new RuntimeException();
			if (null != aClass460_10217.aByteArrayArray5108 && null != aClass460_10217.aByteArrayArray5108[i]) {
				byte[] is_17_ = aClass460_10217.aByteArrayArray5108[i];
				byte[] is_18_ = Class202.method3698(is, 0, is.length - 2, -1748586224);
				for (int i_19_ = 0; i_19_ < 64; i_19_++) {
					if (is_18_[i_19_] != is_17_[i_19_])
						throw new RuntimeException();
				}
			}
			if (aClass452_10209 != null) {
				aClass458_10208.anInt5084 = 0;
				aClass458_10208.anInt5088 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			aClass458_10208.method7454(-1015669585 * anInt10227, i, 2110654839);
			class523_sub27_sub14.method8661(607052656);
			if (class523_sub27_sub14.aBool11746) {
				if (null != aClass452_10209) {
					if (!aClass452_10209.method7294((byte) 94)) {
						Class523_Sub27_Sub14_Sub3 class523_sub27_sub14_sub3 = (aClass452_10209.method7305(anInt10227 * -1015669585, i, (byte) 2, true, aClass460_10217.anIntArray5102[i], aClass460_10217.anIntArray5097[i], 110518719));
						if (class523_sub27_sub14_sub3 != null)
							aClass14_10223.method738(class523_sub27_sub14_sub3, (long) i);
					}
				} else if (!aClass458_10208.method7466(1357652815)) {
					Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = aClass458_10208.method7450(anInt10227 * -1015669585, i, (byte) 2, true, (byte) -31);
					aClass14_10223.method738(class523_sub27_sub14_sub2, (long) i);
				}
			}
			return null;
		}
		is[is.length - 2] = (byte) (aClass460_10217.anIntArray5097[i] >>> 8);
		is[is.length - 1] = (byte) aClass460_10217.anIntArray5097[i];
		if (aClass545_10219 != null) {
			aClass456_10210.method7415(i, is, aClass545_10219, -1403458790);
			if (1 != aByteArray10225[i]) {
				anInt10222 += -1893115207;
				aByteArray10225[i] = (byte) 1;
			}
		}
		if (!class523_sub27_sub14.aBool11746)
			class523_sub27_sub14.method8661(607052656);
		return class523_sub27_sub14;
	}

	int method7593(int i) {
		Class523_Sub27_Sub14 class523_sub27_sub14 = (Class523_Sub27_Sub14) aClass14_10223.method741((long) i);
		if (null != class523_sub27_sub14)
			return class523_sub27_sub14.method18156((byte) -56);
		return 0;
	}

	boolean method15734(int i, byte[] is, int i_20_, int i_21_) {
		if (-1232826367 * anInt10235 == i && i_20_ == anInt10214 * -1511230695) {
			boolean bool = true;
			for (int i_22_ = 0; i_22_ < aByteArray10215.length; i_22_++) {
				if (aByteArray10215[i_22_] != is[i_22_]) {
					bool = false;
					break;
				}
			}
			if (bool)
				return true;
		}
		return false;
	}

	public int method15735() {
		if (null == aClass460_10217)
			return 0;
		if (!aBool10226)
			return aClass460_10217.anInt5101 * 672162761;
		Class523 class523 = aClass708_10228.method14240(1336192264);
		if (null == class523)
			return 0;
		return (int) (1055205983951172633L * class523.aLong7065);
	}

	public int method15736(byte i) {
		return anInt10222 * 1702661001;
	}

	public int method15737(int i) {
		if (null == aClass460_10217)
			return 0;
		if (!aBool10226)
			return aClass460_10217.anInt5101 * 672162761;
		Class523 class523 = aClass708_10228.method14240(642061745);
		if (null == class523)
			return 0;
		return (int) (1055205983951172633L * class523.aLong7065);
	}

	public int method15738() {
		if (null == aClass460_10217)
			return 0;
		return 672162761 * aClass460_10217.anInt5101;
	}

	int method7591(int i, byte i_23_) {
		Class523_Sub27_Sub14 class523_sub27_sub14 = (Class523_Sub27_Sub14) aClass14_10223.method741((long) i);
		if (null != class523_sub27_sub14)
			return class523_sub27_sub14.method18156((byte) -45);
		return 0;
	}

	public boolean method15739(int i) {
		return aBool10231;
	}

	void method15740(boolean bool, int i) {
		aClass452_10209.method7296(bool, 641567388);
	}

	boolean method15741(int i) {
		return aClass452_10209 != null;
	}

	public int method15742() {
		if (method7583(-1160257881) == null) {
			if (null == aClass523_Sub27_Sub14_10213)
				return 0;
			return aClass523_Sub27_Sub14_10213.method18156((byte) -121);
		}
		return 100;
	}

	Class460 method7585() {
		if (null != aClass460_10217)
			return aClass460_10217;
		if (null == aClass523_Sub27_Sub14_10213) {
			if (aClass458_10208.method7466(1357652815))
				return null;
			aClass523_Sub27_Sub14_10213 = aClass458_10208.method7450(255, anInt10227 * -1015669585, (byte) 0, true, (byte) 68);
		}
		if (aClass523_Sub27_Sub14_10213.aBool11748)
			return null;
		byte[] is = aClass523_Sub27_Sub14_10213.method18148(-1745923965);
		if (aClass523_Sub27_Sub14_10213 instanceof Class523_Sub27_Sub14_Sub1) {
			try {
				if (null == is)
					throw new RuntimeException();
				aClass460_10217 = new Class460(is, anInt10235 * -1232826367, aByteArray10215);
				if (anInt10214 * -1511230695 != 991837091 * aClass460_10217.anInt5114)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				aClass460_10217 = null;
				if (aClass458_10208.method7466(1357652815))
					aClass523_Sub27_Sub14_10213 = null;
				else
					aClass523_Sub27_Sub14_10213 = aClass458_10208.method7450(255, -1015669585 * anInt10227, (byte) 0, true, (byte) 109);
				return null;
			}
		} else {
			try {
				if (is == null)
					throw new RuntimeException();
				aClass460_10217 = new Class460(is, -1232826367 * anInt10235, aByteArray10215);
			} catch (RuntimeException runtimeexception) {
				aClass458_10208.method7454(255, anInt10227 * -1015669585, 2037584211);
				aClass460_10217 = null;
				if (aClass458_10208.method7466(1357652815))
					aClass523_Sub27_Sub14_10213 = null;
				else
					aClass523_Sub27_Sub14_10213 = aClass458_10208.method7450(255, anInt10227 * -1015669585, (byte) 0, true, (byte) -91);
				return null;
			}
			if (null != aClass545_10212)
				aClass456_10210.method7415(-1015669585 * anInt10227, is, aClass545_10212, -1540409046);
		}
		aClass523_Sub27_Sub14_10213 = null;
		if (null != aClass545_10219) {
			aByteArray10225 = new byte[-132118613 * aClass460_10217.anInt5105];
			anInt10222 = 0;
		}
		return aClass460_10217;
	}

	Class460 method7586() {
		if (null != aClass460_10217)
			return aClass460_10217;
		if (null == aClass523_Sub27_Sub14_10213) {
			if (aClass458_10208.method7466(1357652815))
				return null;
			aClass523_Sub27_Sub14_10213 = aClass458_10208.method7450(255, anInt10227 * -1015669585, (byte) 0, true, (byte) -21);
		}
		if (aClass523_Sub27_Sub14_10213.aBool11748)
			return null;
		byte[] is = aClass523_Sub27_Sub14_10213.method18148(412573830);
		if (aClass523_Sub27_Sub14_10213 instanceof Class523_Sub27_Sub14_Sub1) {
			try {
				if (null == is)
					throw new RuntimeException();
				aClass460_10217 = new Class460(is, anInt10235 * -1232826367, aByteArray10215);
				if (anInt10214 * -1511230695 != 991837091 * aClass460_10217.anInt5114)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				aClass460_10217 = null;
				if (aClass458_10208.method7466(1357652815))
					aClass523_Sub27_Sub14_10213 = null;
				else
					aClass523_Sub27_Sub14_10213 = aClass458_10208.method7450(255, -1015669585 * anInt10227, (byte) 0, true, (byte) -32);
				return null;
			}
		} else {
			try {
				if (is == null)
					throw new RuntimeException();
				aClass460_10217 = new Class460(is, -1232826367 * anInt10235, aByteArray10215);
			} catch (RuntimeException runtimeexception) {
				aClass458_10208.method7454(255, anInt10227 * -1015669585, 1986420462);
				aClass460_10217 = null;
				if (aClass458_10208.method7466(1357652815))
					aClass523_Sub27_Sub14_10213 = null;
				else
					aClass523_Sub27_Sub14_10213 = aClass458_10208.method7450(255, anInt10227 * -1015669585, (byte) 0, true, (byte) -42);
				return null;
			}
			if (null != aClass545_10212)
				aClass456_10210.method7415(-1015669585 * anInt10227, is, aClass545_10212, -509677065);
		}
		aClass523_Sub27_Sub14_10213 = null;
		if (null != aClass545_10219) {
			aByteArray10225 = new byte[-132118613 * aClass460_10217.anInt5105];
			anInt10222 = 0;
		}
		return aClass460_10217;
	}

	byte[] method7587(int i) {
		Class523_Sub27_Sub14 class523_sub27_sub14 = method15733(i, 0, -1463148245);
		if (class523_sub27_sub14 == null)
			return null;
		byte[] is = class523_sub27_sub14.method18148(-1435227852);
		class523_sub27_sub14.method8661(607052656);
		return is;
	}

	int method7594(int i) {
		Class523_Sub27_Sub14 class523_sub27_sub14 = (Class523_Sub27_Sub14) aClass14_10223.method741((long) i);
		if (null != class523_sub27_sub14)
			return class523_sub27_sub14.method18156((byte) -3);
		return 0;
	}

	void method7589(int i) {
		if (aClass545_10219 != null) {
			for (Class523 class523 = aClass708_10207.method14240(1962327248); class523 != null; class523 = aClass708_10207.method14244((byte) -8)) {
				if ((long) i == class523.aLong7065 * 1055205983951172633L)
					return;
			}
			Class523 class523 = new Class523();
			class523.aLong7065 = 2947252533757437993L * (long) i;
			aClass708_10207.method14236(class523, 529104429);
		}
	}

	int method7588(int i) {
		Class523_Sub27_Sub14 class523_sub27_sub14 = (Class523_Sub27_Sub14) aClass14_10223.method741((long) i);
		if (null != class523_sub27_sub14)
			return class523_sub27_sub14.method18156((byte) -52);
		return 0;
	}

	int method7590(int i) {
		Class523_Sub27_Sub14 class523_sub27_sub14 = (Class523_Sub27_Sub14) aClass14_10223.method741((long) i);
		if (null != class523_sub27_sub14)
			return class523_sub27_sub14.method18156((byte) -44);
		return 0;
	}

	int method7592(int i) {
		Class523_Sub27_Sub14 class523_sub27_sub14 = (Class523_Sub27_Sub14) aClass14_10223.method741((long) i);
		if (null != class523_sub27_sub14)
			return class523_sub27_sub14.method18156((byte) -57);
		return 0;
	}

	public int method15743() {
		if (null == aClass460_10217)
			return 0;
		return 672162761 * aClass460_10217.anInt5101;
	}

	void method7581(int i, byte i_24_) {
		if (aClass545_10219 != null) {
			for (Class523 class523 = aClass708_10207.method14240(615039406); class523 != null; class523 = aClass708_10207.method14244((byte) -34)) {
				if ((long) i == class523.aLong7065 * 1055205983951172633L)
					return;
			}
			Class523 class523 = new Class523();
			class523.aLong7065 = 2947252533757437993L * (long) i;
			aClass708_10207.method14236(class523, -1647746764);
		}
	}

	int method7595(int i) {
		Class523_Sub27_Sub14 class523_sub27_sub14 = (Class523_Sub27_Sub14) aClass14_10223.method741((long) i);
		if (null != class523_sub27_sub14)
			return class523_sub27_sub14.method18156((byte) -103);
		return 0;
	}

	void method15744(boolean bool) {
		aClass452_10209.method7296(bool, -1560164213);
	}

	void method15745(int i, byte[] is, int i_25_, int i_26_) {
		if (!method15731(i, is, i_25_, i_26_, -376552896)) {
			anInt10235 = i * 444297217;
			aByteArray10215 = is;
			anInt10214 = i_25_ * -1398195927;
			aClass460_10217 = null;
			aClass523_Sub27_Sub14_10213 = null;
			if (!aClass458_10208.method7466(1357652815))
				aClass523_Sub27_Sub14_10213 = aClass458_10208.method7450(255, anInt10227 * -1015669585, (byte) 0, true, (byte) 68);
		}
	}

	boolean method15746(int i, byte[] is, int i_27_, int i_28_) {
		if (-1232826367 * anInt10235 == i && i_27_ == anInt10214 * -1511230695) {
			boolean bool = true;
			for (int i_29_ = 0; i_29_ < aByteArray10215.length; i_29_++) {
				if (aByteArray10215[i_29_] != is[i_29_]) {
					bool = false;
					break;
				}
			}
			if (bool)
				return true;
		}
		return false;
	}

	boolean method15747(int i, byte[] is, int i_30_, int i_31_) {
		if (-1232826367 * anInt10235 == i && i_30_ == anInt10214 * -1511230695) {
			boolean bool = true;
			for (int i_32_ = 0; i_32_ < aByteArray10215.length; i_32_++) {
				if (aByteArray10215[i_32_] != is[i_32_]) {
					bool = false;
					break;
				}
			}
			if (bool)
				return true;
		}
		return false;
	}

	public int method15748(int i) {
		if (null == aClass460_10217)
			return 0;
		return 672162761 * aClass460_10217.anInt5101;
	}

	void method15749(int i, byte[] is, int i_33_, int i_34_) {
		if (!method15731(i, is, i_33_, i_34_, 2033810958)) {
			anInt10235 = i * 444297217;
			aByteArray10215 = is;
			anInt10214 = i_33_ * -1398195927;
			aClass460_10217 = null;
			aClass523_Sub27_Sub14_10213 = null;
			if (!aClass458_10208.method7466(1357652815))
				aClass523_Sub27_Sub14_10213 = aClass458_10208.method7450(255, anInt10227 * -1015669585, (byte) 0, true, (byte) 103);
		}
	}

	boolean method15750(int i, byte[] is, int i_35_, int i_36_) {
		if (-1232826367 * anInt10235 == i && i_35_ == anInt10214 * -1511230695) {
			boolean bool = true;
			for (int i_37_ = 0; i_37_ < aByteArray10215.length; i_37_++) {
				if (aByteArray10215[i_37_] != is[i_37_]) {
					bool = false;
					break;
				}
			}
			if (bool)
				return true;
		}
		return false;
	}

	public int method15751() {
		return anInt10222 * 1702661001;
	}

	void method15752(boolean bool) {
		aClass452_10209.method7296(bool, -1982866568);
	}

	Class523_Sub27_Sub14 method15753(int i, int i_38_) {
		Class523_Sub27_Sub14 class523_sub27_sub14 = (Class523_Sub27_Sub14) aClass14_10223.method741((long) i);
		if (class523_sub27_sub14 != null && i_38_ == 0 && !class523_sub27_sub14.aBool11746 && class523_sub27_sub14.aBool11748) {
			class523_sub27_sub14.method8661(607052656);
			class523_sub27_sub14 = null;
		}
		if (null == class523_sub27_sub14) {
			if (i_38_ == 0) {
				if (null != aClass545_10219 && -1 != aByteArray10225[i])
					class523_sub27_sub14 = aClass456_10210.method7416(i, aClass545_10219, 713878482);
				else if (aClass452_10209 != null) {
					class523_sub27_sub14 = aClass452_10209.method7305(anInt10227 * -1015669585, i, (byte) 2, true, (aClass460_10217.anIntArray5102[i]), (aClass460_10217.anIntArray5097[i]), -979174552);
					if (class523_sub27_sub14 == null)
						return null;
				} else if (!aClass458_10208.method7466(1357652815))
					class523_sub27_sub14 = aClass458_10208.method7450(-1015669585 * anInt10227, i, (byte) 2, true, (byte) -15);
				else
					return null;
			} else if (1 == i_38_) {
				if (null == aClass545_10219)
					throw new RuntimeException();
				class523_sub27_sub14 = aClass456_10210.method7429(i, aClass545_10219, 1554472906);
			} else if (i_38_ == 2) {
				if (null == aClass545_10219)
					throw new RuntimeException();
				if (aByteArray10225[i] != -1)
					throw new RuntimeException();
				if (null != aClass452_10209)
					return null;
				if (!aClass458_10208.method7467((byte) -88))
					class523_sub27_sub14 = aClass458_10208.method7450(-1015669585 * anInt10227, i, (byte) 2, false, (byte) -17);
				else
					return null;
			} else
				throw new RuntimeException();
			aClass14_10223.method738(class523_sub27_sub14, (long) i);
		}
		if (class523_sub27_sub14.aBool11748)
			return null;
		byte[] is = class523_sub27_sub14.method18148(521281681);
		if (class523_sub27_sub14 instanceof Class523_Sub27_Sub14_Sub1) {
			Class523_Sub27_Sub14 class523_sub27_sub14_39_;
			try {
				if (null == is || is.length <= 2)
					throw new RuntimeException();
				aCRC32_10220.reset();
				aCRC32_10220.update(is, 0, is.length - 2);
				int i_40_ = (int) aCRC32_10220.getValue();
				if (i_40_ != aClass460_10217.anIntArray5102[i])
					throw new RuntimeException();
				if (aClass460_10217.aByteArrayArray5108 != null && aClass460_10217.aByteArrayArray5108[i] != null) {
					byte[] is_41_ = aClass460_10217.aByteArrayArray5108[i];
					byte[] is_42_ = Class202.method3698(is, 0, is.length - 2, -1687118069);
					for (int i_43_ = 0; i_43_ < 64; i_43_++) {
						if (is_42_[i_43_] != is_41_[i_43_])
							throw new RuntimeException();
					}
				}
				int i_44_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
				if (i_44_ != (aClass460_10217.anIntArray5097[i] & 0xffff))
					throw new RuntimeException();
				if (1 != aByteArray10225[i]) {
					if (0 != aByteArray10225[i]) {
						/* empty */
					}
					anInt10222 += -1893115207;
					aByteArray10225[i] = (byte) 1;
				}
				if (!class523_sub27_sub14.aBool11746)
					class523_sub27_sub14.method8661(607052656);
				class523_sub27_sub14_39_ = class523_sub27_sub14;
			} catch (Exception exception) {
				aByteArray10225[i] = (byte) -1;
				class523_sub27_sub14.method8661(607052656);
				if (class523_sub27_sub14.aBool11746) {
					if (null != aClass452_10209) {
						if (!aClass452_10209.method7294((byte) 28)) {
							Class523_Sub27_Sub14_Sub3 class523_sub27_sub14_sub3 = (aClass452_10209.method7305(anInt10227 * -1015669585, i, (byte) 2, true, aClass460_10217.anIntArray5102[i], aClass460_10217.anIntArray5097[i], -732392556));
							if (null != class523_sub27_sub14_sub3)
								aClass14_10223.method738(class523_sub27_sub14_sub3, (long) i);
						}
					} else if (!aClass458_10208.method7466(1357652815)) {
						Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = aClass458_10208.method7450((-1015669585 * anInt10227), i, (byte) 2, true, (byte) -11);
						aClass14_10223.method738(class523_sub27_sub14_sub2, (long) i);
					}
				}
				return null;
			}
			return class523_sub27_sub14_39_;
		}
		try {
			if (null == is || is.length <= 2) {
				if (aClass452_10209 != null) {
					class523_sub27_sub14.method8661(607052656);
					return null;
				}
				throw new RuntimeException();
			}
			aCRC32_10220.reset();
			aCRC32_10220.update(is, 0, is.length - 2);
			int i_45_ = (int) aCRC32_10220.getValue();
			if (i_45_ != aClass460_10217.anIntArray5102[i])
				throw new RuntimeException();
			if (null != aClass460_10217.aByteArrayArray5108 && null != aClass460_10217.aByteArrayArray5108[i]) {
				byte[] is_46_ = aClass460_10217.aByteArrayArray5108[i];
				byte[] is_47_ = Class202.method3698(is, 0, is.length - 2, -1644443847);
				for (int i_48_ = 0; i_48_ < 64; i_48_++) {
					if (is_47_[i_48_] != is_46_[i_48_])
						throw new RuntimeException();
				}
			}
			if (aClass452_10209 != null) {
				aClass458_10208.anInt5084 = 0;
				aClass458_10208.anInt5088 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			aClass458_10208.method7454(-1015669585 * anInt10227, i, 2065583211);
			class523_sub27_sub14.method8661(607052656);
			if (class523_sub27_sub14.aBool11746) {
				if (null != aClass452_10209) {
					if (!aClass452_10209.method7294((byte) 57)) {
						Class523_Sub27_Sub14_Sub3 class523_sub27_sub14_sub3 = (aClass452_10209.method7305(anInt10227 * -1015669585, i, (byte) 2, true, aClass460_10217.anIntArray5102[i], aClass460_10217.anIntArray5097[i], -53620289));
						if (class523_sub27_sub14_sub3 != null)
							aClass14_10223.method738(class523_sub27_sub14_sub3, (long) i);
					}
				} else if (!aClass458_10208.method7466(1357652815)) {
					Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = aClass458_10208.method7450(anInt10227 * -1015669585, i, (byte) 2, true, (byte) -54);
					aClass14_10223.method738(class523_sub27_sub14_sub2, (long) i);
				}
			}
			return null;
		}
		is[is.length - 2] = (byte) (aClass460_10217.anIntArray5097[i] >>> 8);
		is[is.length - 1] = (byte) aClass460_10217.anIntArray5097[i];
		if (aClass545_10219 != null) {
			aClass456_10210.method7415(i, is, aClass545_10219, -1141642670);
			if (1 != aByteArray10225[i]) {
				anInt10222 += -1893115207;
				aByteArray10225[i] = (byte) 1;
			}
		}
		if (!class523_sub27_sub14.aBool11746)
			class523_sub27_sub14.method8661(607052656);
		return class523_sub27_sub14;
	}

	Class523_Sub27_Sub14 method15754(int i, int i_49_) {
		Class523_Sub27_Sub14 class523_sub27_sub14 = (Class523_Sub27_Sub14) aClass14_10223.method741((long) i);
		if (class523_sub27_sub14 != null && i_49_ == 0 && !class523_sub27_sub14.aBool11746 && class523_sub27_sub14.aBool11748) {
			class523_sub27_sub14.method8661(607052656);
			class523_sub27_sub14 = null;
		}
		if (null == class523_sub27_sub14) {
			if (i_49_ == 0) {
				if (null != aClass545_10219 && -1 != aByteArray10225[i])
					class523_sub27_sub14 = aClass456_10210.method7416(i, aClass545_10219, -882932353);
				else if (aClass452_10209 != null) {
					class523_sub27_sub14 = aClass452_10209.method7305(anInt10227 * -1015669585, i, (byte) 2, true, (aClass460_10217.anIntArray5102[i]), (aClass460_10217.anIntArray5097[i]), 332324315);
					if (class523_sub27_sub14 == null)
						return null;
				} else if (!aClass458_10208.method7466(1357652815))
					class523_sub27_sub14 = aClass458_10208.method7450(-1015669585 * anInt10227, i, (byte) 2, true, (byte) -55);
				else
					return null;
			} else if (1 == i_49_) {
				if (null == aClass545_10219)
					throw new RuntimeException();
				class523_sub27_sub14 = aClass456_10210.method7429(i, aClass545_10219, 1894841549);
			} else if (i_49_ == 2) {
				if (null == aClass545_10219)
					throw new RuntimeException();
				if (aByteArray10225[i] != -1)
					throw new RuntimeException();
				if (null != aClass452_10209)
					return null;
				if (!aClass458_10208.method7467((byte) -90))
					class523_sub27_sub14 = aClass458_10208.method7450(-1015669585 * anInt10227, i, (byte) 2, false, (byte) 6);
				else
					return null;
			} else
				throw new RuntimeException();
			aClass14_10223.method738(class523_sub27_sub14, (long) i);
		}
		if (class523_sub27_sub14.aBool11748)
			return null;
		byte[] is = class523_sub27_sub14.method18148(2012305526);
		if (class523_sub27_sub14 instanceof Class523_Sub27_Sub14_Sub1) {
			Class523_Sub27_Sub14 class523_sub27_sub14_50_;
			try {
				if (null == is || is.length <= 2)
					throw new RuntimeException();
				aCRC32_10220.reset();
				aCRC32_10220.update(is, 0, is.length - 2);
				int i_51_ = (int) aCRC32_10220.getValue();
				if (i_51_ != aClass460_10217.anIntArray5102[i])
					throw new RuntimeException();
				if (aClass460_10217.aByteArrayArray5108 != null && aClass460_10217.aByteArrayArray5108[i] != null) {
					byte[] is_52_ = aClass460_10217.aByteArrayArray5108[i];
					byte[] is_53_ = Class202.method3698(is, 0, is.length - 2, -1416331021);
					for (int i_54_ = 0; i_54_ < 64; i_54_++) {
						if (is_53_[i_54_] != is_52_[i_54_])
							throw new RuntimeException();
					}
				}
				int i_55_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
				if (i_55_ != (aClass460_10217.anIntArray5097[i] & 0xffff))
					throw new RuntimeException();
				if (1 != aByteArray10225[i]) {
					if (0 != aByteArray10225[i]) {
						/* empty */
					}
					anInt10222 += -1893115207;
					aByteArray10225[i] = (byte) 1;
				}
				if (!class523_sub27_sub14.aBool11746)
					class523_sub27_sub14.method8661(607052656);
				class523_sub27_sub14_50_ = class523_sub27_sub14;
			} catch (Exception exception) {
				aByteArray10225[i] = (byte) -1;
				class523_sub27_sub14.method8661(607052656);
				if (class523_sub27_sub14.aBool11746) {
					if (null != aClass452_10209) {
						if (!aClass452_10209.method7294((byte) 99)) {
							Class523_Sub27_Sub14_Sub3 class523_sub27_sub14_sub3 = (aClass452_10209.method7305(anInt10227 * -1015669585, i, (byte) 2, true, aClass460_10217.anIntArray5102[i], aClass460_10217.anIntArray5097[i], -1219688642));
							if (null != class523_sub27_sub14_sub3)
								aClass14_10223.method738(class523_sub27_sub14_sub3, (long) i);
						}
					} else if (!aClass458_10208.method7466(1357652815)) {
						Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = aClass458_10208.method7450((-1015669585 * anInt10227), i, (byte) 2, true, (byte) 83);
						aClass14_10223.method738(class523_sub27_sub14_sub2, (long) i);
					}
				}
				return null;
			}
			return class523_sub27_sub14_50_;
		}
		try {
			if (null == is || is.length <= 2) {
				if (aClass452_10209 != null) {
					class523_sub27_sub14.method8661(607052656);
					return null;
				}
				throw new RuntimeException();
			}
			aCRC32_10220.reset();
			aCRC32_10220.update(is, 0, is.length - 2);
			int i_56_ = (int) aCRC32_10220.getValue();
			if (i_56_ != aClass460_10217.anIntArray5102[i])
				throw new RuntimeException();
			if (null != aClass460_10217.aByteArrayArray5108 && null != aClass460_10217.aByteArrayArray5108[i]) {
				byte[] is_57_ = aClass460_10217.aByteArrayArray5108[i];
				byte[] is_58_ = Class202.method3698(is, 0, is.length - 2, -2082022752);
				for (int i_59_ = 0; i_59_ < 64; i_59_++) {
					if (is_58_[i_59_] != is_57_[i_59_])
						throw new RuntimeException();
				}
			}
			if (aClass452_10209 != null) {
				aClass458_10208.anInt5084 = 0;
				aClass458_10208.anInt5088 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			aClass458_10208.method7454(-1015669585 * anInt10227, i, 2128821402);
			class523_sub27_sub14.method8661(607052656);
			if (class523_sub27_sub14.aBool11746) {
				if (null != aClass452_10209) {
					if (!aClass452_10209.method7294((byte) 69)) {
						Class523_Sub27_Sub14_Sub3 class523_sub27_sub14_sub3 = (aClass452_10209.method7305(anInt10227 * -1015669585, i, (byte) 2, true, aClass460_10217.anIntArray5102[i], aClass460_10217.anIntArray5097[i], -549676011));
						if (class523_sub27_sub14_sub3 != null)
							aClass14_10223.method738(class523_sub27_sub14_sub3, (long) i);
					}
				} else if (!aClass458_10208.method7466(1357652815)) {
					Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = aClass458_10208.method7450(anInt10227 * -1015669585, i, (byte) 2, true, (byte) 22);
					aClass14_10223.method738(class523_sub27_sub14_sub2, (long) i);
				}
			}
			return null;
		}
		is[is.length - 2] = (byte) (aClass460_10217.anIntArray5097[i] >>> 8);
		is[is.length - 1] = (byte) aClass460_10217.anIntArray5097[i];
		if (aClass545_10219 != null) {
			aClass456_10210.method7415(i, is, aClass545_10219, -497637139);
			if (1 != aByteArray10225[i]) {
				anInt10222 += -1893115207;
				aByteArray10225[i] = (byte) 1;
			}
		}
		if (!class523_sub27_sub14.aBool11746)
			class523_sub27_sub14.method8661(607052656);
		return class523_sub27_sub14;
	}

	Class523_Sub27_Sub14 method15755(int i, int i_60_) {
		Class523_Sub27_Sub14 class523_sub27_sub14 = (Class523_Sub27_Sub14) aClass14_10223.method741((long) i);
		if (class523_sub27_sub14 != null && i_60_ == 0 && !class523_sub27_sub14.aBool11746 && class523_sub27_sub14.aBool11748) {
			class523_sub27_sub14.method8661(607052656);
			class523_sub27_sub14 = null;
		}
		if (null == class523_sub27_sub14) {
			if (i_60_ == 0) {
				if (null != aClass545_10219 && -1 != aByteArray10225[i])
					class523_sub27_sub14 = aClass456_10210.method7416(i, aClass545_10219, -1670504988);
				else if (aClass452_10209 != null) {
					class523_sub27_sub14 = aClass452_10209.method7305(anInt10227 * -1015669585, i, (byte) 2, true, (aClass460_10217.anIntArray5102[i]), (aClass460_10217.anIntArray5097[i]), -687177363);
					if (class523_sub27_sub14 == null)
						return null;
				} else if (!aClass458_10208.method7466(1357652815))
					class523_sub27_sub14 = aClass458_10208.method7450(-1015669585 * anInt10227, i, (byte) 2, true, (byte) 57);
				else
					return null;
			} else if (1 == i_60_) {
				if (null == aClass545_10219)
					throw new RuntimeException();
				class523_sub27_sub14 = aClass456_10210.method7429(i, aClass545_10219, 1031520016);
			} else if (i_60_ == 2) {
				if (null == aClass545_10219)
					throw new RuntimeException();
				if (aByteArray10225[i] != -1)
					throw new RuntimeException();
				if (null != aClass452_10209)
					return null;
				if (!aClass458_10208.method7467((byte) -118))
					class523_sub27_sub14 = aClass458_10208.method7450(-1015669585 * anInt10227, i, (byte) 2, false, (byte) -65);
				else
					return null;
			} else
				throw new RuntimeException();
			aClass14_10223.method738(class523_sub27_sub14, (long) i);
		}
		if (class523_sub27_sub14.aBool11748)
			return null;
		byte[] is = class523_sub27_sub14.method18148(1116774315);
		if (class523_sub27_sub14 instanceof Class523_Sub27_Sub14_Sub1) {
			Class523_Sub27_Sub14 class523_sub27_sub14_61_;
			try {
				if (null == is || is.length <= 2)
					throw new RuntimeException();
				aCRC32_10220.reset();
				aCRC32_10220.update(is, 0, is.length - 2);
				int i_62_ = (int) aCRC32_10220.getValue();
				if (i_62_ != aClass460_10217.anIntArray5102[i])
					throw new RuntimeException();
				if (aClass460_10217.aByteArrayArray5108 != null && aClass460_10217.aByteArrayArray5108[i] != null) {
					byte[] is_63_ = aClass460_10217.aByteArrayArray5108[i];
					byte[] is_64_ = Class202.method3698(is, 0, is.length - 2, -1827203615);
					for (int i_65_ = 0; i_65_ < 64; i_65_++) {
						if (is_64_[i_65_] != is_63_[i_65_])
							throw new RuntimeException();
					}
				}
				int i_66_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
				if (i_66_ != (aClass460_10217.anIntArray5097[i] & 0xffff))
					throw new RuntimeException();
				if (1 != aByteArray10225[i]) {
					if (0 != aByteArray10225[i]) {
						/* empty */
					}
					anInt10222 += -1893115207;
					aByteArray10225[i] = (byte) 1;
				}
				if (!class523_sub27_sub14.aBool11746)
					class523_sub27_sub14.method8661(607052656);
				class523_sub27_sub14_61_ = class523_sub27_sub14;
			} catch (Exception exception) {
				aByteArray10225[i] = (byte) -1;
				class523_sub27_sub14.method8661(607052656);
				if (class523_sub27_sub14.aBool11746) {
					if (null != aClass452_10209) {
						if (!aClass452_10209.method7294((byte) 109)) {
							Class523_Sub27_Sub14_Sub3 class523_sub27_sub14_sub3 = (aClass452_10209.method7305(anInt10227 * -1015669585, i, (byte) 2, true, aClass460_10217.anIntArray5102[i], aClass460_10217.anIntArray5097[i], 436785490));
							if (null != class523_sub27_sub14_sub3)
								aClass14_10223.method738(class523_sub27_sub14_sub3, (long) i);
						}
					} else if (!aClass458_10208.method7466(1357652815)) {
						Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = aClass458_10208.method7450((-1015669585 * anInt10227), i, (byte) 2, true, (byte) 32);
						aClass14_10223.method738(class523_sub27_sub14_sub2, (long) i);
					}
				}
				return null;
			}
			return class523_sub27_sub14_61_;
		}
		try {
			if (null == is || is.length <= 2) {
				if (aClass452_10209 != null) {
					class523_sub27_sub14.method8661(607052656);
					return null;
				}
				throw new RuntimeException();
			}
			aCRC32_10220.reset();
			aCRC32_10220.update(is, 0, is.length - 2);
			int i_67_ = (int) aCRC32_10220.getValue();
			if (i_67_ != aClass460_10217.anIntArray5102[i])
				throw new RuntimeException();
			if (null != aClass460_10217.aByteArrayArray5108 && null != aClass460_10217.aByteArrayArray5108[i]) {
				byte[] is_68_ = aClass460_10217.aByteArrayArray5108[i];
				byte[] is_69_ = Class202.method3698(is, 0, is.length - 2, -1389473071);
				for (int i_70_ = 0; i_70_ < 64; i_70_++) {
					if (is_69_[i_70_] != is_68_[i_70_])
						throw new RuntimeException();
				}
			}
			if (aClass452_10209 != null) {
				aClass458_10208.anInt5084 = 0;
				aClass458_10208.anInt5088 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			aClass458_10208.method7454(-1015669585 * anInt10227, i, 1972809553);
			class523_sub27_sub14.method8661(607052656);
			if (class523_sub27_sub14.aBool11746) {
				if (null != aClass452_10209) {
					if (!aClass452_10209.method7294((byte) 12)) {
						Class523_Sub27_Sub14_Sub3 class523_sub27_sub14_sub3 = (aClass452_10209.method7305(anInt10227 * -1015669585, i, (byte) 2, true, aClass460_10217.anIntArray5102[i], aClass460_10217.anIntArray5097[i], 235141470));
						if (class523_sub27_sub14_sub3 != null)
							aClass14_10223.method738(class523_sub27_sub14_sub3, (long) i);
					}
				} else if (!aClass458_10208.method7466(1357652815)) {
					Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = aClass458_10208.method7450(anInt10227 * -1015669585, i, (byte) 2, true, (byte) -46);
					aClass14_10223.method738(class523_sub27_sub14_sub2, (long) i);
				}
			}
			return null;
		}
		is[is.length - 2] = (byte) (aClass460_10217.anIntArray5097[i] >>> 8);
		is[is.length - 1] = (byte) aClass460_10217.anIntArray5097[i];
		if (aClass545_10219 != null) {
			aClass456_10210.method7415(i, is, aClass545_10219, -1211518245);
			if (1 != aByteArray10225[i]) {
				anInt10222 += -1893115207;
				aByteArray10225[i] = (byte) 1;
			}
		}
		if (!class523_sub27_sub14.aBool11746)
			class523_sub27_sub14.method8661(607052656);
		return class523_sub27_sub14;
	}

	void method15756() {
		if (null != aClass708_10228 && method7583(-1160257881) != null) {
			for (Class523 class523 = aClass708_10207.method14240(1435731496); null != class523; class523 = aClass708_10207.method14244((byte) -7)) {
				int i = (int) (1055205983951172633L * class523.aLong7065);
				if (i < 0 || i >= -132118613 * aClass460_10217.anInt5105 || 0 == aClass460_10217.anIntArray5112[i])
					class523.method8661(607052656);
				else {
					if (0 == aByteArray10225[i])
						method15733(i, 1, -925604711);
					if (-1 == aByteArray10225[i])
						method15733(i, 2, -1964707551);
					if (aByteArray10225[i] == 1)
						class523.method8661(607052656);
				}
			}
		}
	}

	void method15757() {
		if (null != aClass708_10228) {
			if (method7583(-1160257881) == null)
				return;
			if (aBool10226) {
				boolean bool = true;
				for (Class523 class523 = aClass708_10228.method14240(898346754); null != class523; class523 = aClass708_10228.method14244((byte) 67)) {
					int i = (int) (class523.aLong7065 * 1055205983951172633L);
					if (0 == aByteArray10225[i])
						method15733(i, 1, -1465826664);
					if (aByteArray10225[i] != 0)
						class523.method8661(607052656);
					else
						bool = false;
				}
				while (670164327 * anInt10211 < aClass460_10217.anIntArray5112.length) {
					if (aClass460_10217.anIntArray5112[670164327 * anInt10211] == 0)
						anInt10211 += -1224972713;
					else {
						if (1780200209 * aClass456_10210.anInt5071 >= 250) {
							bool = false;
							break;
						}
						if (0 == aByteArray10225[anInt10211 * 670164327])
							method15733(anInt10211 * 670164327, 1, -1971434966);
						if (aByteArray10225[670164327 * anInt10211] == 0) {
							Class523 class523 = new Class523();
							class523.aLong7065 = 4946778263288321407L * (long) anInt10211;
							aClass708_10228.method14236(class523, 774511431);
							bool = false;
						}
						anInt10211 += -1224972713;
					}
				}
				if (bool) {
					aBool10226 = false;
					anInt10211 = 0;
				}
			} else if (aBool10224) {
				boolean bool = true;
				for (Class523 class523 = aClass708_10228.method14240(883614941); null != class523; class523 = aClass708_10228.method14244((byte) -94)) {
					int i = (int) (1055205983951172633L * class523.aLong7065);
					if (1 != aByteArray10225[i])
						method15733(i, 2, -1065465683);
					if (aByteArray10225[i] == 1)
						class523.method8661(607052656);
					else
						bool = false;
				}
				while (anInt10211 * 670164327 < aClass460_10217.anIntArray5112.length) {
					if (aClass460_10217.anIntArray5112[670164327 * anInt10211] == 0)
						anInt10211 += -1224972713;
					else {
						if (aClass458_10208.method7467((byte) -43)) {
							bool = false;
							break;
						}
						if (aByteArray10225[anInt10211 * 670164327] != 1)
							method15733(670164327 * anInt10211, 2, -1242316727);
						if (1 != aByteArray10225[anInt10211 * 670164327]) {
							Class523 class523 = new Class523();
							class523.aLong7065 = 4946778263288321407L * (long) anInt10211;
							aClass708_10228.method14236(class523, -2078106337);
							bool = false;
						}
						anInt10211 += -1224972713;
					}
				}
				if (bool) {
					aBool10224 = false;
					anInt10211 = 0;
				}
			} else
				aClass708_10228 = null;
		}
		if (aBool10230 && (Class248.method4401(1516375036) >= 2275495580412572123L * aLong10233)) {
			for (Class523_Sub27_Sub14 class523_sub27_sub14 = ((Class523_Sub27_Sub14) aClass14_10223.method735(-380907255)); class523_sub27_sub14 != null; class523_sub27_sub14 = ((Class523_Sub27_Sub14) aClass14_10223.method749(236309110))) {
				if (!class523_sub27_sub14.aBool11748) {
					if (class523_sub27_sub14.aBool11747) {
						if (!class523_sub27_sub14.aBool11746)
							throw new RuntimeException();
						class523_sub27_sub14.method8661(607052656);
					} else
						class523_sub27_sub14.aBool11747 = true;
				}
			}
			aLong10233 = ((Class248.method4401(1516375036) + 1000L) * 173341866200015443L);
		}
	}

	void method15758() {
		if (null != aClass708_10228) {
			if (method7583(-1160257881) == null)
				return;
			if (aBool10226) {
				boolean bool = true;
				for (Class523 class523 = aClass708_10228.method14240(1931770392); null != class523; class523 = aClass708_10228.method14244((byte) 106)) {
					int i = (int) (class523.aLong7065 * 1055205983951172633L);
					if (0 == aByteArray10225[i])
						method15733(i, 1, -1273441208);
					if (aByteArray10225[i] != 0)
						class523.method8661(607052656);
					else
						bool = false;
				}
				while (670164327 * anInt10211 < aClass460_10217.anIntArray5112.length) {
					if (aClass460_10217.anIntArray5112[670164327 * anInt10211] == 0)
						anInt10211 += -1224972713;
					else {
						if (1780200209 * aClass456_10210.anInt5071 >= 250) {
							bool = false;
							break;
						}
						if (0 == aByteArray10225[anInt10211 * 670164327])
							method15733(anInt10211 * 670164327, 1, -1617325647);
						if (aByteArray10225[670164327 * anInt10211] == 0) {
							Class523 class523 = new Class523();
							class523.aLong7065 = 4946778263288321407L * (long) anInt10211;
							aClass708_10228.method14236(class523, -218580206);
							bool = false;
						}
						anInt10211 += -1224972713;
					}
				}
				if (bool) {
					aBool10226 = false;
					anInt10211 = 0;
				}
			} else if (aBool10224) {
				boolean bool = true;
				for (Class523 class523 = aClass708_10228.method14240(1076328295); null != class523; class523 = aClass708_10228.method14244((byte) -101)) {
					int i = (int) (1055205983951172633L * class523.aLong7065);
					if (1 != aByteArray10225[i])
						method15733(i, 2, -1027159609);
					if (aByteArray10225[i] == 1)
						class523.method8661(607052656);
					else
						bool = false;
				}
				while (anInt10211 * 670164327 < aClass460_10217.anIntArray5112.length) {
					if (aClass460_10217.anIntArray5112[670164327 * anInt10211] == 0)
						anInt10211 += -1224972713;
					else {
						if (aClass458_10208.method7467((byte) -15)) {
							bool = false;
							break;
						}
						if (aByteArray10225[anInt10211 * 670164327] != 1)
							method15733(670164327 * anInt10211, 2, -1857317205);
						if (1 != aByteArray10225[anInt10211 * 670164327]) {
							Class523 class523 = new Class523();
							class523.aLong7065 = 4946778263288321407L * (long) anInt10211;
							aClass708_10228.method14236(class523, 1030394894);
							bool = false;
						}
						anInt10211 += -1224972713;
					}
				}
				if (bool) {
					aBool10224 = false;
					anInt10211 = 0;
				}
			} else
				aClass708_10228 = null;
		}
		if (aBool10230 && (Class248.method4401(1516375036) >= 2275495580412572123L * aLong10233)) {
			for (Class523_Sub27_Sub14 class523_sub27_sub14 = ((Class523_Sub27_Sub14) aClass14_10223.method735(-380907255)); class523_sub27_sub14 != null; class523_sub27_sub14 = ((Class523_Sub27_Sub14) aClass14_10223.method749(1351170386))) {
				if (!class523_sub27_sub14.aBool11748) {
					if (class523_sub27_sub14.aBool11747) {
						if (!class523_sub27_sub14.aBool11746)
							throw new RuntimeException();
						class523_sub27_sub14.method8661(607052656);
					} else
						class523_sub27_sub14.aBool11747 = true;
				}
			}
			aLong10233 = ((Class248.method4401(1516375036) + 1000L) * 173341866200015443L);
		}
	}

	public int method15759() {
		if (method7583(-1160257881) == null) {
			if (null == aClass523_Sub27_Sub14_10213)
				return 0;
			return aClass523_Sub27_Sub14_10213.method18156((byte) -128);
		}
		return 100;
	}

	public int method15760() {
		if (null == aClass460_10217)
			return 0;
		return 672162761 * aClass460_10217.anInt5101;
	}

	boolean method15761(int i, byte[] is, int i_71_, int i_72_) {
		if (-1232826367 * anInt10235 == i && i_71_ == anInt10214 * -1511230695) {
			boolean bool = true;
			for (int i_73_ = 0; i_73_ < aByteArray10215.length; i_73_++) {
				if (aByteArray10215[i_73_] != is[i_73_]) {
					bool = false;
					break;
				}
			}
			if (bool)
				return true;
		}
		return false;
	}

	public int method15762() {
		if (null == aClass460_10217)
			return 0;
		return 672162761 * aClass460_10217.anInt5101;
	}

	void method15763(byte i) {
		if (null != aClass708_10228) {
			if (method7583(-1160257881) == null)
				return;
			if (aBool10226) {
				boolean bool = true;
				for (Class523 class523 = aClass708_10228.method14240(1251087550); null != class523; class523 = aClass708_10228.method14244((byte) -27)) {
					int i_74_ = (int) (class523.aLong7065 * 1055205983951172633L);
					if (0 == aByteArray10225[i_74_])
						method15733(i_74_, 1, -1341083984);
					if (aByteArray10225[i_74_] != 0)
						class523.method8661(607052656);
					else
						bool = false;
				}
				while (670164327 * anInt10211 < aClass460_10217.anIntArray5112.length) {
					if (aClass460_10217.anIntArray5112[670164327 * anInt10211] == 0)
						anInt10211 += -1224972713;
					else {
						if (1780200209 * aClass456_10210.anInt5071 >= 250) {
							bool = false;
							break;
						}
						if (0 == aByteArray10225[anInt10211 * 670164327])
							method15733(anInt10211 * 670164327, 1, -1629191618);
						if (aByteArray10225[670164327 * anInt10211] == 0) {
							Class523 class523 = new Class523();
							class523.aLong7065 = 4946778263288321407L * (long) anInt10211;
							aClass708_10228.method14236(class523, -1134979655);
							bool = false;
						}
						anInt10211 += -1224972713;
					}
				}
				if (bool) {
					aBool10226 = false;
					anInt10211 = 0;
				}
			} else if (aBool10224) {
				boolean bool = true;
				for (Class523 class523 = aClass708_10228.method14240(1118442669); null != class523; class523 = aClass708_10228.method14244((byte) -10)) {
					int i_75_ = (int) (1055205983951172633L * class523.aLong7065);
					if (1 != aByteArray10225[i_75_])
						method15733(i_75_, 2, -1661742229);
					if (aByteArray10225[i_75_] == 1)
						class523.method8661(607052656);
					else
						bool = false;
				}
				while (anInt10211 * 670164327 < aClass460_10217.anIntArray5112.length) {
					if (aClass460_10217.anIntArray5112[670164327 * anInt10211] == 0)
						anInt10211 += -1224972713;
					else {
						if (aClass458_10208.method7467((byte) -91)) {
							bool = false;
							break;
						}
						if (aByteArray10225[anInt10211 * 670164327] != 1)
							method15733(670164327 * anInt10211, 2, -1836273484);
						if (1 != aByteArray10225[anInt10211 * 670164327]) {
							Class523 class523 = new Class523();
							class523.aLong7065 = 4946778263288321407L * (long) anInt10211;
							aClass708_10228.method14236(class523, -2045252118);
							bool = false;
						}
						anInt10211 += -1224972713;
					}
				}
				if (bool) {
					aBool10224 = false;
					anInt10211 = 0;
				}
			} else
				aClass708_10228 = null;
		}
		if (aBool10230 && (Class248.method4401(1516375036) >= 2275495580412572123L * aLong10233)) {
			for (Class523_Sub27_Sub14 class523_sub27_sub14 = ((Class523_Sub27_Sub14) aClass14_10223.method735(-380907255)); class523_sub27_sub14 != null; class523_sub27_sub14 = ((Class523_Sub27_Sub14) aClass14_10223.method749(727298340))) {
				if (!class523_sub27_sub14.aBool11748) {
					if (class523_sub27_sub14.aBool11747) {
						if (!class523_sub27_sub14.aBool11746)
							throw new RuntimeException();
						class523_sub27_sub14.method8661(607052656);
					} else
						class523_sub27_sub14.aBool11747 = true;
				}
			}
			aLong10233 = ((Class248.method4401(1516375036) + 1000L) * 173341866200015443L);
		}
	}

	boolean method15764() {
		return aClass452_10209 != null;
	}

	public int method15765() {
		if (null == aClass460_10217)
			return 0;
		if (!aBool10226)
			return aClass460_10217.anInt5101 * 672162761;
		Class523 class523 = aClass708_10228.method14240(2018844881);
		if (null == class523)
			return 0;
		return (int) (1055205983951172633L * class523.aLong7065);
	}

	public void method15766(int i) {
		if (aClass452_10209 == null && null != aClass545_10219) {
			aBool10224 = true;
			aBool10231 = true;
			if (aClass708_10228 == null)
				aClass708_10228 = new Class708();
		}
	}

	public boolean method15767() {
		return aBool10231;
	}

	public boolean method15768() {
		return aBool10231;
	}

	Class467_Sub1(int i, Class545 class545, Class545 class545_76_, Class458 class458, Class452 class452, Class456 class456, int i_77_, byte[] is, int i_78_, boolean bool, int i_79_) {
		anInt10211 = 0;
		aClass708_10207 = new Class708();
		aLong10233 = 0L;
		anInt10227 = -1490372017 * i;
		aClass545_10219 = class545;
		if (null == aClass545_10219)
			aBool10226 = false;
		else {
			aBool10226 = true;
			aClass708_10228 = new Class708();
		}
		aClass545_10212 = class545_76_;
		aClass458_10208 = class458;
		aClass452_10209 = class452;
		aClass456_10210 = class456;
		anInt10235 = i_77_ * 444297217;
		aByteArray10215 = is;
		anInt10214 = i_78_ * -1398195927;
		aBool10230 = bool;
		if (aClass545_10212 != null)
			aClass523_Sub27_Sub14_10213 = aClass456_10210.method7416(anInt10227 * -1015669585, aClass545_10212, 274262804);
	}

	public int method15769() {
		return anInt10222 * 1702661001;
	}

	void method15770(boolean bool) {
		aClass452_10209.method7296(bool, 619129591);
	}

	void method15771(int i) {
		if (null != aClass708_10228 && method7583(-1160257881) != null) {
			for (Class523 class523 = aClass708_10207.method14240(1097874472); null != class523; class523 = aClass708_10207.method14244((byte) 15)) {
				int i_80_ = (int) (1055205983951172633L * class523.aLong7065);
				if (i_80_ < 0 || i_80_ >= -132118613 * aClass460_10217.anInt5105 || 0 == aClass460_10217.anIntArray5112[i_80_])
					class523.method8661(607052656);
				else {
					if (0 == aByteArray10225[i_80_])
						method15733(i_80_, 1, -1234038338);
					if (-1 == aByteArray10225[i_80_])
						method15733(i_80_, 2, -874794691);
					if (aByteArray10225[i_80_] == 1)
						class523.method8661(607052656);
				}
			}
		}
	}
}
