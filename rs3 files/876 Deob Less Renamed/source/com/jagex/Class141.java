/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class141 {
	Class523_Sub27_Sub3 aClass523_Sub27_Sub3_1659;
	Class168_Sub1_Sub3 aClass168_Sub1_Sub3_1660;
	boolean aBool1661;
	Class126_Sub2 aClass126_Sub2_1662;
	int anInt1663 = 0;
	Class168_Sub1_Sub3 aClass168_Sub1_Sub3_1664;
	int anInt1665;
	int anInt1666;
	boolean aBool1667;
	Class708 aClass708_1668;
	boolean aBool1669;
	Class178_Sub1 aClass178_Sub1_1670;
	boolean aBool1671;
	boolean aBool1672;
	Class126_Sub2[] aClass126_Sub2Array1673;
	Class523_Sub27_Sub3 aClass523_Sub27_Sub3_1674;
	int anInt1675 = 0;
	Class168_Sub1_Sub3 aClass168_Sub1_Sub3_1676;
	boolean aBool1677;
	int anInt1678;
	Class170 aClass170_1679;

	boolean method2287() {
		return aBool1667;
	}

	void method2288() {
		int i = 0;
		boolean bool = false;
		Class170 class170 = Class170.aClass170_1822;
		for (Class523_Sub17 class523_sub17 = (Class523_Sub17) aClass708_1668.method14240(1786709686); class523_sub17 != null; class523_sub17 = (Class523_Sub17) aClass708_1668.method14244((byte) -27)) {
			Class170 class170_0_ = class523_sub17.method16012();
			if (class170_0_.anInt1831 * 1602321003 > class170.anInt1831 * 1602321003)
				class170 = class170_0_;
			bool |= class523_sub17.method16001();
			i += class523_sub17.method16006();
		}
		if (class170 != aClass170_1679) {
			aClass170_1679 = class170;
			aBool1669 = true;
		}
		int i_1_ = anInt1678 > 2 ? 2 : anInt1678;
		int i_2_ = i > 2 ? 2 : i;
		if (i_1_ != i_2_) {
			aBool1669 = true;
			aBool1671 = true;
		}
		if (bool != aBool1661) {
			aBool1661 = bool;
			aBool1677 = true;
		}
		anInt1678 = i;
	}

	boolean method2289() {
		return aClass168_Sub1_Sub3_1676 != null;
	}

	boolean method2290() {
		return aBool1667;
	}

	void method2291() {
		aClass168_Sub1_Sub3_1660 = null;
		aClass168_Sub1_Sub3_1664 = null;
		aClass168_Sub1_Sub3_1676 = null;
		aClass523_Sub27_Sub3_1659 = null;
		aClass126_Sub2_1662 = null;
		aClass126_Sub2Array1673 = null;
		aClass523_Sub27_Sub3_1674 = null;
		if (!aClass708_1668.method14237((byte) 104)) {
			for (Class523 class523 = aClass708_1668.method14240(2010955420); class523 != aClass708_1668.aClass523_8838; class523 = class523.aClass523_7063)
				((Class523_Sub17) class523).method16015();
		}
		anInt1666 = 1;
		anInt1665 = 1;
	}

	boolean method2292() {
		if (aBool1677) {
			if (aClass523_Sub27_Sub3_1659 != null) {
				aClass523_Sub27_Sub3_1659.method131();
				aClass523_Sub27_Sub3_1659 = null;
			}
			if (aClass126_Sub2_1662 != null) {
				aClass126_Sub2_1662.method2113();
				aClass126_Sub2_1662 = null;
			}
		}
		if (aBool1669) {
			if (aClass523_Sub27_Sub3_1674 != null) {
				aClass523_Sub27_Sub3_1674.method131();
				aClass523_Sub27_Sub3_1674 = null;
			}
			if (aClass126_Sub2Array1673[0] != null) {
				aClass126_Sub2Array1673[0].method2113();
				aClass126_Sub2Array1673[0] = null;
			}
			if (aClass126_Sub2Array1673[1] != null) {
				aClass126_Sub2Array1673[1].method2113();
				aClass126_Sub2Array1673[1] = null;
			}
		}
		if (aBool1677) {
			if (aClass168_Sub1_Sub3_1664 != null)
				aClass523_Sub27_Sub3_1659 = new Class523_Sub27_Sub3(aClass178_Sub1_1670, Class158.aClass158_1750, Class170.aClass170_1827, anInt1665, anInt1666, aClass178_Sub1_1670.anInt9381);
			if (aBool1661)
				aClass126_Sub2_1662 = new Class126_Sub2(aClass178_Sub1_1670, 34037, Class158.aClass158_1750, Class170.aClass170_1827, anInt1665, anInt1666);
			else if (aClass523_Sub27_Sub3_1659 == null)
				aClass523_Sub27_Sub3_1659 = new Class523_Sub27_Sub3(aClass178_Sub1_1670, Class158.aClass158_1750, Class170.aClass170_1827, anInt1665, anInt1666);
			aBool1677 = false;
			aBool1671 = true;
			aBool1672 = true;
		}
		if (aBool1669) {
			if (aClass168_Sub1_Sub3_1664 != null)
				aClass523_Sub27_Sub3_1674 = new Class523_Sub27_Sub3(aClass178_Sub1_1670, Class158.aClass158_1743, aClass170_1679, anInt1665, anInt1666, aClass178_Sub1_1670.anInt9381);
			aClass126_Sub2Array1673[0] = new Class126_Sub2(aClass178_Sub1_1670, 34037, Class158.aClass158_1743, aClass170_1679, anInt1665, anInt1666);
			aClass126_Sub2Array1673[1] = anInt1678 > 1 ? new Class126_Sub2(aClass178_Sub1_1670, 34037, Class158.aClass158_1743, aClass170_1679, anInt1665, anInt1666) : null;
			aBool1669 = false;
			aBool1671 = true;
			aBool1672 = true;
		}
		if (aBool1671) {
			if (aClass168_Sub1_Sub3_1664 != null) {
				aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1660, -830476800);
				aClass168_Sub1_Sub3_1660.method14423(null);
				aClass168_Sub1_Sub3_1660.method14424(0, null);
				aClass168_Sub1_Sub3_1660.method14424(1, null);
				aClass168_Sub1_Sub3_1660.method14424(0, aClass126_Sub2Array1673[0].method14378(0));
				aClass168_Sub1_Sub3_1660.method14424(1, (anInt1678 > 1 ? aClass126_Sub2Array1673[1].method14378(0) : null));
				if (aBool1661)
					aClass168_Sub1_Sub3_1660.method14423(aClass126_Sub2_1662.method14362(0));
				aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1660, (short) -1477);
				aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1664, -1008484875);
				aClass168_Sub1_Sub3_1664.method14423(null);
				aClass168_Sub1_Sub3_1664.method14424(0, null);
				aClass168_Sub1_Sub3_1664.method14424(0, aClass523_Sub27_Sub3_1674);
				aClass168_Sub1_Sub3_1664.method14423(aClass523_Sub27_Sub3_1659);
				aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1664, (short) -30981);
			} else {
				aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1660, 934814189);
				aClass168_Sub1_Sub3_1660.method14423(null);
				aClass168_Sub1_Sub3_1660.method14424(0, null);
				aClass168_Sub1_Sub3_1660.method14424(1, null);
				aClass168_Sub1_Sub3_1660.method14424(0, aClass126_Sub2Array1673[0].method14378(0));
				aClass168_Sub1_Sub3_1660.method14424(1, (anInt1678 > 1 ? aClass126_Sub2Array1673[1].method14378(0) : null));
				if (aBool1661)
					aClass168_Sub1_Sub3_1660.method14423(aClass126_Sub2_1662.method14362(0));
				else
					aClass168_Sub1_Sub3_1660.method14423(aClass523_Sub27_Sub3_1659);
				aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1660, (short) -17831);
			}
			aBool1671 = false;
			aBool1672 = true;
		}
		if (aBool1672) {
			aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1676, -501137050);
			aBool1672 = !aClass168_Sub1_Sub3_1676.method14426();
			aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1676, (short) -27345);
		}
		return !aBool1672;
	}

	boolean method2293(int i, int i_3_, int i_4_, int i_5_) {
		if (aClass168_Sub1_Sub3_1676 == null || aClass708_1668.method14237((byte) 104) || method2297())
			return false;
		if (anInt1665 != i_4_ || anInt1666 != i_5_) {
			anInt1665 = i_4_;
			anInt1666 = i_5_;
			for (Class523 class523 = aClass708_1668.method14240(1711413822); class523 != aClass708_1668.aClass523_8838; class523 = class523.aClass523_7063)
				((Class523_Sub17) class523).method16003(anInt1665, anInt1666);
			aBool1669 = true;
			aBool1677 = true;
			aBool1671 = true;
		}
		if (method2292()) {
			anInt1663 = i;
			anInt1675 = i_3_;
			aBool1667 = true;
			aClass178_Sub1_1670.method14632(-anInt1663, (anInt1666 + anInt1675 - aClass178_Sub1_1670.method3039(1820549754).method2874()));
			aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1676, 1412106610);
			aClass168_Sub1_Sub3_1676.method17790(0);
			aClass178_Sub1_1670.method3076(3, 0);
			return true;
		}
		return false;
	}

	void method2294(int i, int i_6_) {
		if (aBool1667) {
			if (aClass168_Sub1_Sub3_1664 != null) {
				aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1664, (short) -20176);
				aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1660, 693581542);
				aClass168_Sub1_Sub3_1660.method17790(0);
				aClass168_Sub1_Sub3_1664.method14433(0, 0, anInt1665, anInt1666, 0, 0, true, aBool1661);
			}
			aClass178_Sub1_1670.method14738();
			aClass178_Sub1_1670.method14687(0);
			aClass178_Sub1_1670.method14785(1);
			aClass178_Sub1_1670.method3071();
			int i_7_ = 0;
			int i_8_ = 1;
			int i_9_ = 0;
			int i_10_ = 0;
			int i_11_ = 0;
			Object object = null;
			for (Class523_Sub17 class523_sub17 = (Class523_Sub17) aClass708_1668.method14240(1345271898); class523_sub17 != null; class523_sub17 = (Class523_Sub17) aClass708_1668.method14244((byte) 0)) {
				if (!class523_sub17.method16002())
					i_10_++;
			}
			Class523_Sub17[] class523_sub17s = new Class523_Sub17[i_10_];
			i_10_ = 0;
			for (Class523_Sub17 class523_sub17 = (Class523_Sub17) aClass708_1668.method14240(830286736); class523_sub17 != null; class523_sub17 = ((Class523_Sub17) aClass708_1668.method14244((byte) -24))) {
				if (!class523_sub17.method16002())
					class523_sub17s[i_10_++] = class523_sub17;
			}
			while (i_9_ < i_10_) {
				for (int i_12_ = 0; i_12_ < i_10_; i_12_++) {
					Class523_Sub17 class523_sub17 = class523_sub17s[i_12_];
					if (class523_sub17.method16007() == i_11_) {
						int i_13_ = class523_sub17.method16006();
						for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
							aClass178_Sub1_1670.method14632(0, 0);
							class523_sub17.method16004(i_14_, (aClass126_Sub2Array1673[i_7_]), aClass126_Sub2_1662, i_6_, i);
							if (i_14_ == i_13_ - 1 && i_9_ == i_10_ - 1) {
								aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1660, (short) -3016);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (0 + anInt1666));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(anInt1663, anInt1675);
								OpenGL.glTexCoord2f(0.0F, (float) (anInt1666 - i_6_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(anInt1663, anInt1675 + i_6_);
								OpenGL.glTexCoord2f((float) (0 + i), (float) (anInt1666 - i_6_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(anInt1663 + i, anInt1675 + i_6_);
								OpenGL.glTexCoord2f((float) (0 + i), (float) (0 + anInt1666));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(anInt1663 + i, anInt1675);
								OpenGL.glEnd();
							} else {
								aClass168_Sub1_Sub3_1660.method17790(i_8_);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) anInt1666);
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(0, 0);
								OpenGL.glTexCoord2f(0.0F, (float) (anInt1666 - i_6_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(0, i_6_);
								OpenGL.glTexCoord2f((float) i, (float) (anInt1666 - i_6_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(i, i_6_);
								OpenGL.glTexCoord2f((float) i, (float) anInt1666);
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(i, 0);
								OpenGL.glEnd();
							}
							class523_sub17.method16005(i_14_);
							i_8_ = i_8_ + 1 & 0x1;
							i_7_ = i_7_ + 1 & 0x1;
						}
						i_9_++;
					}
				}
				i_11_++;
			}
			aBool1667 = false;
			object = null;
		}
	}

	boolean method2295() {
		for (Class523_Sub17 class523_sub17 = (Class523_Sub17) aClass708_1668.method14240(2023209994); class523_sub17 != null; class523_sub17 = (Class523_Sub17) aClass708_1668.method14244((byte) 32)) {
			if (!class523_sub17.method16002())
				return false;
		}
		return true;
	}

	boolean method2296(Class523_Sub17 class523_sub17) {
		if (aClass168_Sub1_Sub3_1676 != null) {
			if (class523_sub17.method16023() || class523_sub17.method16009()) {
				aClass708_1668.method14236(class523_sub17, -1177605009);
				method2313();
				if (class523_sub17.method16007() >= 0 && method2292()) {
					if (anInt1665 != -1 && anInt1666 != -1)
						class523_sub17.method16003(anInt1665, anInt1666);
					class523_sub17.aBool10481 = true;
					return true;
				}
			}
			method2305(class523_sub17);
		}
		return false;
	}

	boolean method2297() {
		for (Class523_Sub17 class523_sub17 = (Class523_Sub17) aClass708_1668.method14240(1674151217); class523_sub17 != null; class523_sub17 = (Class523_Sub17) aClass708_1668.method14244((byte) 72)) {
			if (!class523_sub17.method16002())
				return false;
		}
		return true;
	}

	Class141(Class178_Sub1 class178_sub1) {
		anInt1665 = 1;
		anInt1666 = 1;
		aClass708_1668 = new Class708();
		aBool1669 = true;
		aBool1677 = true;
		aBool1671 = true;
		aBool1672 = true;
		aClass126_Sub2Array1673 = new Class126_Sub2[2];
		aBool1661 = false;
		anInt1678 = 0;
		aClass170_1679 = Class170.aClass170_1822;
		aClass178_Sub1_1670 = class178_sub1;
		if (aClass178_Sub1_1670.aBool9398 && aClass178_Sub1_1670.aBool9409) {
			aClass168_Sub1_Sub3_1676 = aClass168_Sub1_Sub3_1660 = new Class168_Sub1_Sub3(aClass178_Sub1_1670);
			if (aClass178_Sub1_1670.anInt9381 > 1 && aClass178_Sub1_1670.aBool9259 && aClass178_Sub1_1670.aBool9400)
				aClass168_Sub1_Sub3_1676 = aClass168_Sub1_Sub3_1664 = new Class168_Sub1_Sub3(aClass178_Sub1_1670);
		}
	}

	void method2298() {
		aClass168_Sub1_Sub3_1660 = null;
		aClass168_Sub1_Sub3_1664 = null;
		aClass168_Sub1_Sub3_1676 = null;
		aClass523_Sub27_Sub3_1659 = null;
		aClass126_Sub2_1662 = null;
		aClass126_Sub2Array1673 = null;
		aClass523_Sub27_Sub3_1674 = null;
		if (!aClass708_1668.method14237((byte) 104)) {
			for (Class523 class523 = aClass708_1668.method14240(1563262923); class523 != aClass708_1668.aClass523_8838; class523 = class523.aClass523_7063)
				((Class523_Sub17) class523).method16015();
		}
		anInt1666 = 1;
		anInt1665 = 1;
	}

	boolean method2299() {
		return aClass168_Sub1_Sub3_1676 != null;
	}

	boolean method2300() {
		return aClass168_Sub1_Sub3_1676 != null;
	}

	boolean method2301() {
		return aClass168_Sub1_Sub3_1676 != null;
	}

	boolean method2302() {
		return aBool1667;
	}

	boolean method2303() {
		if (aBool1677) {
			if (aClass523_Sub27_Sub3_1659 != null) {
				aClass523_Sub27_Sub3_1659.method131();
				aClass523_Sub27_Sub3_1659 = null;
			}
			if (aClass126_Sub2_1662 != null) {
				aClass126_Sub2_1662.method2113();
				aClass126_Sub2_1662 = null;
			}
		}
		if (aBool1669) {
			if (aClass523_Sub27_Sub3_1674 != null) {
				aClass523_Sub27_Sub3_1674.method131();
				aClass523_Sub27_Sub3_1674 = null;
			}
			if (aClass126_Sub2Array1673[0] != null) {
				aClass126_Sub2Array1673[0].method2113();
				aClass126_Sub2Array1673[0] = null;
			}
			if (aClass126_Sub2Array1673[1] != null) {
				aClass126_Sub2Array1673[1].method2113();
				aClass126_Sub2Array1673[1] = null;
			}
		}
		if (aBool1677) {
			if (aClass168_Sub1_Sub3_1664 != null)
				aClass523_Sub27_Sub3_1659 = new Class523_Sub27_Sub3(aClass178_Sub1_1670, Class158.aClass158_1750, Class170.aClass170_1827, anInt1665, anInt1666, aClass178_Sub1_1670.anInt9381);
			if (aBool1661)
				aClass126_Sub2_1662 = new Class126_Sub2(aClass178_Sub1_1670, 34037, Class158.aClass158_1750, Class170.aClass170_1827, anInt1665, anInt1666);
			else if (aClass523_Sub27_Sub3_1659 == null)
				aClass523_Sub27_Sub3_1659 = new Class523_Sub27_Sub3(aClass178_Sub1_1670, Class158.aClass158_1750, Class170.aClass170_1827, anInt1665, anInt1666);
			aBool1677 = false;
			aBool1671 = true;
			aBool1672 = true;
		}
		if (aBool1669) {
			if (aClass168_Sub1_Sub3_1664 != null)
				aClass523_Sub27_Sub3_1674 = new Class523_Sub27_Sub3(aClass178_Sub1_1670, Class158.aClass158_1743, aClass170_1679, anInt1665, anInt1666, aClass178_Sub1_1670.anInt9381);
			aClass126_Sub2Array1673[0] = new Class126_Sub2(aClass178_Sub1_1670, 34037, Class158.aClass158_1743, aClass170_1679, anInt1665, anInt1666);
			aClass126_Sub2Array1673[1] = anInt1678 > 1 ? new Class126_Sub2(aClass178_Sub1_1670, 34037, Class158.aClass158_1743, aClass170_1679, anInt1665, anInt1666) : null;
			aBool1669 = false;
			aBool1671 = true;
			aBool1672 = true;
		}
		if (aBool1671) {
			if (aClass168_Sub1_Sub3_1664 != null) {
				aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1660, 32849814);
				aClass168_Sub1_Sub3_1660.method14423(null);
				aClass168_Sub1_Sub3_1660.method14424(0, null);
				aClass168_Sub1_Sub3_1660.method14424(1, null);
				aClass168_Sub1_Sub3_1660.method14424(0, aClass126_Sub2Array1673[0].method14378(0));
				aClass168_Sub1_Sub3_1660.method14424(1, (anInt1678 > 1 ? aClass126_Sub2Array1673[1].method14378(0) : null));
				if (aBool1661)
					aClass168_Sub1_Sub3_1660.method14423(aClass126_Sub2_1662.method14362(0));
				aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1660, (short) -15035);
				aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1664, 1920828107);
				aClass168_Sub1_Sub3_1664.method14423(null);
				aClass168_Sub1_Sub3_1664.method14424(0, null);
				aClass168_Sub1_Sub3_1664.method14424(0, aClass523_Sub27_Sub3_1674);
				aClass168_Sub1_Sub3_1664.method14423(aClass523_Sub27_Sub3_1659);
				aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1664, (short) -20806);
			} else {
				aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1660, -712198642);
				aClass168_Sub1_Sub3_1660.method14423(null);
				aClass168_Sub1_Sub3_1660.method14424(0, null);
				aClass168_Sub1_Sub3_1660.method14424(1, null);
				aClass168_Sub1_Sub3_1660.method14424(0, aClass126_Sub2Array1673[0].method14378(0));
				aClass168_Sub1_Sub3_1660.method14424(1, (anInt1678 > 1 ? aClass126_Sub2Array1673[1].method14378(0) : null));
				if (aBool1661)
					aClass168_Sub1_Sub3_1660.method14423(aClass126_Sub2_1662.method14362(0));
				else
					aClass168_Sub1_Sub3_1660.method14423(aClass523_Sub27_Sub3_1659);
				aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1660, (short) -2568);
			}
			aBool1671 = false;
			aBool1672 = true;
		}
		if (aBool1672) {
			aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1676, 57890912);
			aBool1672 = !aClass168_Sub1_Sub3_1676.method14426();
			aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1676, (short) -415);
		}
		return !aBool1672;
	}

	boolean method2304() {
		for (Class523_Sub17 class523_sub17 = (Class523_Sub17) aClass708_1668.method14240(1541792574); class523_sub17 != null; class523_sub17 = (Class523_Sub17) aClass708_1668.method14244((byte) -39)) {
			if (!class523_sub17.method16002())
				return false;
		}
		return true;
	}

	void method2305(Class523_Sub17 class523_sub17) {
		class523_sub17.aBool10481 = false;
		class523_sub17.method16015();
		class523_sub17.method8661(607052656);
		method2313();
	}

	boolean method2306(Class523_Sub17 class523_sub17) {
		if (aClass168_Sub1_Sub3_1676 != null) {
			if (class523_sub17.method16023() || class523_sub17.method16009()) {
				aClass708_1668.method14236(class523_sub17, -1200486851);
				method2313();
				if (class523_sub17.method16007() >= 0 && method2292()) {
					if (anInt1665 != -1 && anInt1666 != -1)
						class523_sub17.method16003(anInt1665, anInt1666);
					class523_sub17.aBool10481 = true;
					return true;
				}
			}
			method2305(class523_sub17);
		}
		return false;
	}

	boolean method2307() {
		if (aBool1677) {
			if (aClass523_Sub27_Sub3_1659 != null) {
				aClass523_Sub27_Sub3_1659.method131();
				aClass523_Sub27_Sub3_1659 = null;
			}
			if (aClass126_Sub2_1662 != null) {
				aClass126_Sub2_1662.method2113();
				aClass126_Sub2_1662 = null;
			}
		}
		if (aBool1669) {
			if (aClass523_Sub27_Sub3_1674 != null) {
				aClass523_Sub27_Sub3_1674.method131();
				aClass523_Sub27_Sub3_1674 = null;
			}
			if (aClass126_Sub2Array1673[0] != null) {
				aClass126_Sub2Array1673[0].method2113();
				aClass126_Sub2Array1673[0] = null;
			}
			if (aClass126_Sub2Array1673[1] != null) {
				aClass126_Sub2Array1673[1].method2113();
				aClass126_Sub2Array1673[1] = null;
			}
		}
		if (aBool1677) {
			if (aClass168_Sub1_Sub3_1664 != null)
				aClass523_Sub27_Sub3_1659 = new Class523_Sub27_Sub3(aClass178_Sub1_1670, Class158.aClass158_1750, Class170.aClass170_1827, anInt1665, anInt1666, aClass178_Sub1_1670.anInt9381);
			if (aBool1661)
				aClass126_Sub2_1662 = new Class126_Sub2(aClass178_Sub1_1670, 34037, Class158.aClass158_1750, Class170.aClass170_1827, anInt1665, anInt1666);
			else if (aClass523_Sub27_Sub3_1659 == null)
				aClass523_Sub27_Sub3_1659 = new Class523_Sub27_Sub3(aClass178_Sub1_1670, Class158.aClass158_1750, Class170.aClass170_1827, anInt1665, anInt1666);
			aBool1677 = false;
			aBool1671 = true;
			aBool1672 = true;
		}
		if (aBool1669) {
			if (aClass168_Sub1_Sub3_1664 != null)
				aClass523_Sub27_Sub3_1674 = new Class523_Sub27_Sub3(aClass178_Sub1_1670, Class158.aClass158_1743, aClass170_1679, anInt1665, anInt1666, aClass178_Sub1_1670.anInt9381);
			aClass126_Sub2Array1673[0] = new Class126_Sub2(aClass178_Sub1_1670, 34037, Class158.aClass158_1743, aClass170_1679, anInt1665, anInt1666);
			aClass126_Sub2Array1673[1] = anInt1678 > 1 ? new Class126_Sub2(aClass178_Sub1_1670, 34037, Class158.aClass158_1743, aClass170_1679, anInt1665, anInt1666) : null;
			aBool1669 = false;
			aBool1671 = true;
			aBool1672 = true;
		}
		if (aBool1671) {
			if (aClass168_Sub1_Sub3_1664 != null) {
				aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1660, -147041524);
				aClass168_Sub1_Sub3_1660.method14423(null);
				aClass168_Sub1_Sub3_1660.method14424(0, null);
				aClass168_Sub1_Sub3_1660.method14424(1, null);
				aClass168_Sub1_Sub3_1660.method14424(0, aClass126_Sub2Array1673[0].method14378(0));
				aClass168_Sub1_Sub3_1660.method14424(1, (anInt1678 > 1 ? aClass126_Sub2Array1673[1].method14378(0) : null));
				if (aBool1661)
					aClass168_Sub1_Sub3_1660.method14423(aClass126_Sub2_1662.method14362(0));
				aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1660, (short) -9397);
				aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1664, -1461906384);
				aClass168_Sub1_Sub3_1664.method14423(null);
				aClass168_Sub1_Sub3_1664.method14424(0, null);
				aClass168_Sub1_Sub3_1664.method14424(0, aClass523_Sub27_Sub3_1674);
				aClass168_Sub1_Sub3_1664.method14423(aClass523_Sub27_Sub3_1659);
				aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1664, (short) -11910);
			} else {
				aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1660, -2018927602);
				aClass168_Sub1_Sub3_1660.method14423(null);
				aClass168_Sub1_Sub3_1660.method14424(0, null);
				aClass168_Sub1_Sub3_1660.method14424(1, null);
				aClass168_Sub1_Sub3_1660.method14424(0, aClass126_Sub2Array1673[0].method14378(0));
				aClass168_Sub1_Sub3_1660.method14424(1, (anInt1678 > 1 ? aClass126_Sub2Array1673[1].method14378(0) : null));
				if (aBool1661)
					aClass168_Sub1_Sub3_1660.method14423(aClass126_Sub2_1662.method14362(0));
				else
					aClass168_Sub1_Sub3_1660.method14423(aClass523_Sub27_Sub3_1659);
				aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1660, (short) -4462);
			}
			aBool1671 = false;
			aBool1672 = true;
		}
		if (aBool1672) {
			aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1676, 2007198560);
			aBool1672 = !aClass168_Sub1_Sub3_1676.method14426();
			aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1676, (short) -25551);
		}
		return !aBool1672;
	}

	boolean method2308() {
		if (aBool1677) {
			if (aClass523_Sub27_Sub3_1659 != null) {
				aClass523_Sub27_Sub3_1659.method131();
				aClass523_Sub27_Sub3_1659 = null;
			}
			if (aClass126_Sub2_1662 != null) {
				aClass126_Sub2_1662.method2113();
				aClass126_Sub2_1662 = null;
			}
		}
		if (aBool1669) {
			if (aClass523_Sub27_Sub3_1674 != null) {
				aClass523_Sub27_Sub3_1674.method131();
				aClass523_Sub27_Sub3_1674 = null;
			}
			if (aClass126_Sub2Array1673[0] != null) {
				aClass126_Sub2Array1673[0].method2113();
				aClass126_Sub2Array1673[0] = null;
			}
			if (aClass126_Sub2Array1673[1] != null) {
				aClass126_Sub2Array1673[1].method2113();
				aClass126_Sub2Array1673[1] = null;
			}
		}
		if (aBool1677) {
			if (aClass168_Sub1_Sub3_1664 != null)
				aClass523_Sub27_Sub3_1659 = new Class523_Sub27_Sub3(aClass178_Sub1_1670, Class158.aClass158_1750, Class170.aClass170_1827, anInt1665, anInt1666, aClass178_Sub1_1670.anInt9381);
			if (aBool1661)
				aClass126_Sub2_1662 = new Class126_Sub2(aClass178_Sub1_1670, 34037, Class158.aClass158_1750, Class170.aClass170_1827, anInt1665, anInt1666);
			else if (aClass523_Sub27_Sub3_1659 == null)
				aClass523_Sub27_Sub3_1659 = new Class523_Sub27_Sub3(aClass178_Sub1_1670, Class158.aClass158_1750, Class170.aClass170_1827, anInt1665, anInt1666);
			aBool1677 = false;
			aBool1671 = true;
			aBool1672 = true;
		}
		if (aBool1669) {
			if (aClass168_Sub1_Sub3_1664 != null)
				aClass523_Sub27_Sub3_1674 = new Class523_Sub27_Sub3(aClass178_Sub1_1670, Class158.aClass158_1743, aClass170_1679, anInt1665, anInt1666, aClass178_Sub1_1670.anInt9381);
			aClass126_Sub2Array1673[0] = new Class126_Sub2(aClass178_Sub1_1670, 34037, Class158.aClass158_1743, aClass170_1679, anInt1665, anInt1666);
			aClass126_Sub2Array1673[1] = anInt1678 > 1 ? new Class126_Sub2(aClass178_Sub1_1670, 34037, Class158.aClass158_1743, aClass170_1679, anInt1665, anInt1666) : null;
			aBool1669 = false;
			aBool1671 = true;
			aBool1672 = true;
		}
		if (aBool1671) {
			if (aClass168_Sub1_Sub3_1664 != null) {
				aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1660, -220709455);
				aClass168_Sub1_Sub3_1660.method14423(null);
				aClass168_Sub1_Sub3_1660.method14424(0, null);
				aClass168_Sub1_Sub3_1660.method14424(1, null);
				aClass168_Sub1_Sub3_1660.method14424(0, aClass126_Sub2Array1673[0].method14378(0));
				aClass168_Sub1_Sub3_1660.method14424(1, (anInt1678 > 1 ? aClass126_Sub2Array1673[1].method14378(0) : null));
				if (aBool1661)
					aClass168_Sub1_Sub3_1660.method14423(aClass126_Sub2_1662.method14362(0));
				aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1660, (short) -28628);
				aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1664, 716455928);
				aClass168_Sub1_Sub3_1664.method14423(null);
				aClass168_Sub1_Sub3_1664.method14424(0, null);
				aClass168_Sub1_Sub3_1664.method14424(0, aClass523_Sub27_Sub3_1674);
				aClass168_Sub1_Sub3_1664.method14423(aClass523_Sub27_Sub3_1659);
				aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1664, (short) -4947);
			} else {
				aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1660, -896778115);
				aClass168_Sub1_Sub3_1660.method14423(null);
				aClass168_Sub1_Sub3_1660.method14424(0, null);
				aClass168_Sub1_Sub3_1660.method14424(1, null);
				aClass168_Sub1_Sub3_1660.method14424(0, aClass126_Sub2Array1673[0].method14378(0));
				aClass168_Sub1_Sub3_1660.method14424(1, (anInt1678 > 1 ? aClass126_Sub2Array1673[1].method14378(0) : null));
				if (aBool1661)
					aClass168_Sub1_Sub3_1660.method14423(aClass126_Sub2_1662.method14362(0));
				else
					aClass168_Sub1_Sub3_1660.method14423(aClass523_Sub27_Sub3_1659);
				aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1660, (short) -22608);
			}
			aBool1671 = false;
			aBool1672 = true;
		}
		if (aBool1672) {
			aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1676, -1722127818);
			aBool1672 = !aClass168_Sub1_Sub3_1676.method14426();
			aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1676, (short) -30889);
		}
		return !aBool1672;
	}

	boolean method2309(int i, int i_15_, int i_16_, int i_17_) {
		if (aClass168_Sub1_Sub3_1676 == null || aClass708_1668.method14237((byte) 104) || method2297())
			return false;
		if (anInt1665 != i_16_ || anInt1666 != i_17_) {
			anInt1665 = i_16_;
			anInt1666 = i_17_;
			for (Class523 class523 = aClass708_1668.method14240(1230553497); class523 != aClass708_1668.aClass523_8838; class523 = class523.aClass523_7063)
				((Class523_Sub17) class523).method16003(anInt1665, anInt1666);
			aBool1669 = true;
			aBool1677 = true;
			aBool1671 = true;
		}
		if (method2292()) {
			anInt1663 = i;
			anInt1675 = i_15_;
			aBool1667 = true;
			aClass178_Sub1_1670.method14632(-anInt1663, (anInt1666 + anInt1675 - aClass178_Sub1_1670.method3039(1957297438).method2874()));
			aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1676, 2083044023);
			aClass168_Sub1_Sub3_1676.method17790(0);
			aClass178_Sub1_1670.method3076(3, 0);
			return true;
		}
		return false;
	}

	boolean method2310(int i, int i_18_, int i_19_, int i_20_) {
		if (aClass168_Sub1_Sub3_1676 == null || aClass708_1668.method14237((byte) 104) || method2297())
			return false;
		if (anInt1665 != i_19_ || anInt1666 != i_20_) {
			anInt1665 = i_19_;
			anInt1666 = i_20_;
			for (Class523 class523 = aClass708_1668.method14240(1809969487); class523 != aClass708_1668.aClass523_8838; class523 = class523.aClass523_7063)
				((Class523_Sub17) class523).method16003(anInt1665, anInt1666);
			aBool1669 = true;
			aBool1677 = true;
			aBool1671 = true;
		}
		if (method2292()) {
			anInt1663 = i;
			anInt1675 = i_18_;
			aBool1667 = true;
			aClass178_Sub1_1670.method14632(-anInt1663, (anInt1666 + anInt1675 - aClass178_Sub1_1670.method3039(1397562691).method2874()));
			aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1676, -259602724);
			aClass168_Sub1_Sub3_1676.method17790(0);
			aClass178_Sub1_1670.method3076(3, 0);
			return true;
		}
		return false;
	}

	void method2311(int i, int i_21_) {
		if (aBool1667) {
			if (aClass168_Sub1_Sub3_1664 != null) {
				aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1664, (short) -15930);
				aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1660, -409614046);
				aClass168_Sub1_Sub3_1660.method17790(0);
				aClass168_Sub1_Sub3_1664.method14433(0, 0, anInt1665, anInt1666, 0, 0, true, aBool1661);
			}
			aClass178_Sub1_1670.method14738();
			aClass178_Sub1_1670.method14687(0);
			aClass178_Sub1_1670.method14785(1);
			aClass178_Sub1_1670.method3071();
			int i_22_ = 0;
			int i_23_ = 1;
			int i_24_ = 0;
			int i_25_ = 0;
			int i_26_ = 0;
			Object object = null;
			for (Class523_Sub17 class523_sub17 = (Class523_Sub17) aClass708_1668.method14240(1308779032); class523_sub17 != null; class523_sub17 = ((Class523_Sub17) aClass708_1668.method14244((byte) -85))) {
				if (!class523_sub17.method16002())
					i_25_++;
			}
			Class523_Sub17[] class523_sub17s = new Class523_Sub17[i_25_];
			i_25_ = 0;
			for (Class523_Sub17 class523_sub17 = (Class523_Sub17) aClass708_1668.method14240(1971568872); class523_sub17 != null; class523_sub17 = ((Class523_Sub17) aClass708_1668.method14244((byte) -109))) {
				if (!class523_sub17.method16002())
					class523_sub17s[i_25_++] = class523_sub17;
			}
			while (i_24_ < i_25_) {
				for (int i_27_ = 0; i_27_ < i_25_; i_27_++) {
					Class523_Sub17 class523_sub17 = class523_sub17s[i_27_];
					if (class523_sub17.method16007() == i_26_) {
						int i_28_ = class523_sub17.method16006();
						for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
							aClass178_Sub1_1670.method14632(0, 0);
							class523_sub17.method16004(i_29_, (aClass126_Sub2Array1673[i_22_]), aClass126_Sub2_1662, i_21_, i);
							if (i_29_ == i_28_ - 1 && i_24_ == i_25_ - 1) {
								aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1660, (short) -31504);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (0 + anInt1666));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(anInt1663, anInt1675);
								OpenGL.glTexCoord2f(0.0F, (float) (anInt1666 - i_21_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(anInt1663, anInt1675 + i_21_);
								OpenGL.glTexCoord2f((float) (0 + i), (float) (anInt1666 - i_21_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(anInt1663 + i, anInt1675 + i_21_);
								OpenGL.glTexCoord2f((float) (0 + i), (float) (0 + anInt1666));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(anInt1663 + i, anInt1675);
								OpenGL.glEnd();
							} else {
								aClass168_Sub1_Sub3_1660.method17790(i_23_);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) anInt1666);
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(0, 0);
								OpenGL.glTexCoord2f(0.0F, (float) (anInt1666 - i_21_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(0, i_21_);
								OpenGL.glTexCoord2f((float) i, (float) (anInt1666 - i_21_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(i, i_21_);
								OpenGL.glTexCoord2f((float) i, (float) anInt1666);
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(i, 0);
								OpenGL.glEnd();
							}
							class523_sub17.method16005(i_29_);
							i_23_ = i_23_ + 1 & 0x1;
							i_22_ = i_22_ + 1 & 0x1;
						}
						i_24_++;
					}
				}
				i_26_++;
			}
			aBool1667 = false;
			object = null;
		}
	}

	void method2312(int i, int i_30_) {
		if (aBool1667) {
			if (aClass168_Sub1_Sub3_1664 != null) {
				aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1664, (short) -9699);
				aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1660, 1119476351);
				aClass168_Sub1_Sub3_1660.method17790(0);
				aClass168_Sub1_Sub3_1664.method14433(0, 0, anInt1665, anInt1666, 0, 0, true, aBool1661);
			}
			aClass178_Sub1_1670.method14738();
			aClass178_Sub1_1670.method14687(0);
			aClass178_Sub1_1670.method14785(1);
			aClass178_Sub1_1670.method3071();
			int i_31_ = 0;
			int i_32_ = 1;
			int i_33_ = 0;
			int i_34_ = 0;
			int i_35_ = 0;
			Object object = null;
			for (Class523_Sub17 class523_sub17 = (Class523_Sub17) aClass708_1668.method14240(1876953158); class523_sub17 != null; class523_sub17 = ((Class523_Sub17) aClass708_1668.method14244((byte) -84))) {
				if (!class523_sub17.method16002())
					i_34_++;
			}
			Class523_Sub17[] class523_sub17s = new Class523_Sub17[i_34_];
			i_34_ = 0;
			for (Class523_Sub17 class523_sub17 = (Class523_Sub17) aClass708_1668.method14240(1689596079); class523_sub17 != null; class523_sub17 = ((Class523_Sub17) aClass708_1668.method14244((byte) 17))) {
				if (!class523_sub17.method16002())
					class523_sub17s[i_34_++] = class523_sub17;
			}
			while (i_33_ < i_34_) {
				for (int i_36_ = 0; i_36_ < i_34_; i_36_++) {
					Class523_Sub17 class523_sub17 = class523_sub17s[i_36_];
					if (class523_sub17.method16007() == i_35_) {
						int i_37_ = class523_sub17.method16006();
						for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
							aClass178_Sub1_1670.method14632(0, 0);
							class523_sub17.method16004(i_38_, (aClass126_Sub2Array1673[i_31_]), aClass126_Sub2_1662, i_30_, i);
							if (i_38_ == i_37_ - 1 && i_33_ == i_34_ - 1) {
								aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1660, (short) -16632);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (0 + anInt1666));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(anInt1663, anInt1675);
								OpenGL.glTexCoord2f(0.0F, (float) (anInt1666 - i_30_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(anInt1663, anInt1675 + i_30_);
								OpenGL.glTexCoord2f((float) (0 + i), (float) (anInt1666 - i_30_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(anInt1663 + i, anInt1675 + i_30_);
								OpenGL.glTexCoord2f((float) (0 + i), (float) (0 + anInt1666));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(anInt1663 + i, anInt1675);
								OpenGL.glEnd();
							} else {
								aClass168_Sub1_Sub3_1660.method17790(i_32_);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) anInt1666);
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(0, 0);
								OpenGL.glTexCoord2f(0.0F, (float) (anInt1666 - i_30_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(0, i_30_);
								OpenGL.glTexCoord2f((float) i, (float) (anInt1666 - i_30_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(i, i_30_);
								OpenGL.glTexCoord2f((float) i, (float) anInt1666);
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(i, 0);
								OpenGL.glEnd();
							}
							class523_sub17.method16005(i_38_);
							i_32_ = i_32_ + 1 & 0x1;
							i_31_ = i_31_ + 1 & 0x1;
						}
						i_33_++;
					}
				}
				i_35_++;
			}
			aBool1667 = false;
			object = null;
		}
	}

	void method2313() {
		int i = 0;
		boolean bool = false;
		Class170 class170 = Class170.aClass170_1822;
		for (Class523_Sub17 class523_sub17 = (Class523_Sub17) aClass708_1668.method14240(1647755685); class523_sub17 != null; class523_sub17 = (Class523_Sub17) aClass708_1668.method14244((byte) 1)) {
			Class170 class170_39_ = class523_sub17.method16012();
			if (class170_39_.anInt1831 * 1602321003 > class170.anInt1831 * 1602321003)
				class170 = class170_39_;
			bool |= class523_sub17.method16001();
			i += class523_sub17.method16006();
		}
		if (class170 != aClass170_1679) {
			aClass170_1679 = class170;
			aBool1669 = true;
		}
		int i_40_ = anInt1678 > 2 ? 2 : anInt1678;
		int i_41_ = i > 2 ? 2 : i;
		if (i_40_ != i_41_) {
			aBool1669 = true;
			aBool1671 = true;
		}
		if (bool != aBool1661) {
			aBool1661 = bool;
			aBool1677 = true;
		}
		anInt1678 = i;
	}

	void method2314() {
		aClass168_Sub1_Sub3_1660 = null;
		aClass168_Sub1_Sub3_1664 = null;
		aClass168_Sub1_Sub3_1676 = null;
		aClass523_Sub27_Sub3_1659 = null;
		aClass126_Sub2_1662 = null;
		aClass126_Sub2Array1673 = null;
		aClass523_Sub27_Sub3_1674 = null;
		if (!aClass708_1668.method14237((byte) 104)) {
			for (Class523 class523 = aClass708_1668.method14240(1984685124); class523 != aClass708_1668.aClass523_8838; class523 = class523.aClass523_7063)
				((Class523_Sub17) class523).method16015();
		}
		anInt1666 = 1;
		anInt1665 = 1;
	}

	boolean method2315(Class523_Sub17 class523_sub17) {
		if (aClass168_Sub1_Sub3_1676 != null) {
			if (class523_sub17.method16023() || class523_sub17.method16009()) {
				aClass708_1668.method14236(class523_sub17, -313697586);
				method2313();
				if (class523_sub17.method16007() >= 0 && method2292()) {
					if (anInt1665 != -1 && anInt1666 != -1)
						class523_sub17.method16003(anInt1665, anInt1666);
					class523_sub17.aBool10481 = true;
					return true;
				}
			}
			method2305(class523_sub17);
		}
		return false;
	}

	void method2316(Class523_Sub17 class523_sub17) {
		class523_sub17.aBool10481 = false;
		class523_sub17.method16015();
		class523_sub17.method8661(607052656);
		method2313();
	}

	void method2317() {
		int i = 0;
		boolean bool = false;
		Class170 class170 = Class170.aClass170_1822;
		for (Class523_Sub17 class523_sub17 = (Class523_Sub17) aClass708_1668.method14240(1193855919); class523_sub17 != null; class523_sub17 = (Class523_Sub17) aClass708_1668.method14244((byte) -16)) {
			Class170 class170_42_ = class523_sub17.method16012();
			if (class170_42_.anInt1831 * 1602321003 > class170.anInt1831 * 1602321003)
				class170 = class170_42_;
			bool |= class523_sub17.method16001();
			i += class523_sub17.method16006();
		}
		if (class170 != aClass170_1679) {
			aClass170_1679 = class170;
			aBool1669 = true;
		}
		int i_43_ = anInt1678 > 2 ? 2 : anInt1678;
		int i_44_ = i > 2 ? 2 : i;
		if (i_43_ != i_44_) {
			aBool1669 = true;
			aBool1671 = true;
		}
		if (bool != aBool1661) {
			aBool1661 = bool;
			aBool1677 = true;
		}
		anInt1678 = i;
	}

	void method2318(int i, int i_45_) {
		if (aBool1667) {
			if (aClass168_Sub1_Sub3_1664 != null) {
				aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1664, (short) -25514);
				aClass178_Sub1_1670.method3353(aClass168_Sub1_Sub3_1660, 1211486004);
				aClass168_Sub1_Sub3_1660.method17790(0);
				aClass168_Sub1_Sub3_1664.method14433(0, 0, anInt1665, anInt1666, 0, 0, true, aBool1661);
			}
			aClass178_Sub1_1670.method14738();
			aClass178_Sub1_1670.method14687(0);
			aClass178_Sub1_1670.method14785(1);
			aClass178_Sub1_1670.method3071();
			int i_46_ = 0;
			int i_47_ = 1;
			int i_48_ = 0;
			int i_49_ = 0;
			int i_50_ = 0;
			Object object = null;
			for (Class523_Sub17 class523_sub17 = (Class523_Sub17) aClass708_1668.method14240(1733480799); class523_sub17 != null; class523_sub17 = ((Class523_Sub17) aClass708_1668.method14244((byte) 21))) {
				if (!class523_sub17.method16002())
					i_49_++;
			}
			Class523_Sub17[] class523_sub17s = new Class523_Sub17[i_49_];
			i_49_ = 0;
			for (Class523_Sub17 class523_sub17 = (Class523_Sub17) aClass708_1668.method14240(1004728390); class523_sub17 != null; class523_sub17 = ((Class523_Sub17) aClass708_1668.method14244((byte) -43))) {
				if (!class523_sub17.method16002())
					class523_sub17s[i_49_++] = class523_sub17;
			}
			while (i_48_ < i_49_) {
				for (int i_51_ = 0; i_51_ < i_49_; i_51_++) {
					Class523_Sub17 class523_sub17 = class523_sub17s[i_51_];
					if (class523_sub17.method16007() == i_50_) {
						int i_52_ = class523_sub17.method16006();
						for (int i_53_ = 0; i_53_ < i_52_; i_53_++) {
							aClass178_Sub1_1670.method14632(0, 0);
							class523_sub17.method16004(i_53_, (aClass126_Sub2Array1673[i_46_]), aClass126_Sub2_1662, i_45_, i);
							if (i_53_ == i_52_ - 1 && i_48_ == i_49_ - 1) {
								aClass178_Sub1_1670.method3047(aClass168_Sub1_Sub3_1660, (short) -4758);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (0 + anInt1666));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(anInt1663, anInt1675);
								OpenGL.glTexCoord2f(0.0F, (float) (anInt1666 - i_45_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(anInt1663, anInt1675 + i_45_);
								OpenGL.glTexCoord2f((float) (0 + i), (float) (anInt1666 - i_45_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(anInt1663 + i, anInt1675 + i_45_);
								OpenGL.glTexCoord2f((float) (0 + i), (float) (0 + anInt1666));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(anInt1663 + i, anInt1675);
								OpenGL.glEnd();
							} else {
								aClass168_Sub1_Sub3_1660.method17790(i_47_);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) anInt1666);
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(0, 0);
								OpenGL.glTexCoord2f(0.0F, (float) (anInt1666 - i_45_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(0, i_45_);
								OpenGL.glTexCoord2f((float) i, (float) (anInt1666 - i_45_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(i, i_45_);
								OpenGL.glTexCoord2f((float) i, (float) anInt1666);
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(i, 0);
								OpenGL.glEnd();
							}
							class523_sub17.method16005(i_53_);
							i_47_ = i_47_ + 1 & 0x1;
							i_46_ = i_46_ + 1 & 0x1;
						}
						i_48_++;
					}
				}
				i_50_++;
			}
			aBool1667 = false;
			object = null;
		}
	}
}
