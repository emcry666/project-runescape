/* Class588 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Class588 implements Interface6, Interface13 {
	public int anInt7748;
	public int[] anIntArray7749;
	public int[] anIntArray7750;
	public int anInt7751;
	public int anInt7752;
	public int anInt7753;
	public int anInt7754;
	public int anInt7755;
	public int anInt7756;
	public int anInt7757;
	int anInt7758;
	public int anInt7759;
	public int anInt7760;
	public int anInt7761;
	public int anInt7762;
	public int anInt7763;
	public int anInt7764;
	public int anInt7765;
	public int anInt7766;
	public int anInt7767;
	public int[][] anIntArrayArray7768;
	public int anInt7769;
	public boolean aBool7770;
	public int anInt7771;
	public int anInt7772;
	public int anInt7773;
	public int anInt7774;
	public int anInt7775;
	public int[][] anIntArrayArray7776;
	Class435[] aClass435Array7777;
	public int anInt7778;
	public int[] anIntArray7779;
	public int[] anIntArray7780;
	public int anInt7781;
	public int anInt7782;
	public int anInt7783;
	public int anInt7784;
	public int anInt7785;
	public int anInt7786 = -1174182691;
	public int anInt7787;
	public int anInt7788;
	public int anInt7789;
	public int anInt7790;
	public int anInt7791;

	public void method80(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_0_ = class523_sub34.readUnsignedByte(-1871272407);
			if (0 == i_0_)
				break;
			method9721(class523_sub34, i_0_, (byte) 1);
		}
	}

	Class588(int i) {
		anIntArray7749 = null;
		anIntArray7750 = null;
		anInt7758 = 0;
		anInt7752 = 614174117;
		anInt7748 = -1913792169;
		anInt7754 = -1807228519;
		anInt7755 = 1920671043;
		anInt7756 = 1087799553;
		anInt7757 = 1390807265;
		anInt7772 = 2505425;
		anInt7759 = -232689005;
		anInt7760 = -2056292993;
		anInt7761 = 972197919;
		anInt7762 = -313177691;
		anInt7763 = 58652827;
		anInt7764 = 2058889817;
		anInt7765 = -1765324235;
		anInt7766 = 16594767;
		anInt7771 = -2053312601;
		anInt7785 = -1961683795;
		anInt7769 = -7519875;
		anInt7753 = -1666259799;
		anInt7775 = 1076100869;
		anInt7778 = 0;
		anInt7773 = 0;
		anInt7774 = 0;
		anInt7767 = 0;
		anInt7781 = 0;
		anInt7782 = 0;
		anInt7783 = 0;
		anInt7784 = 0;
		anInt7791 = 0;
		anInt7751 = 0;
		anInt7787 = 0;
		anInt7788 = 0;
		anInt7789 = 903871425;
		anInt7790 = -1856271587;
		aBool7770 = true;
	}

	public int[] method9720(byte i) {
		Class14 class14 = new Class14(16);
		Class589.method9752(anInt7786 * -1932039029, class14, 1755965526);
		if (anIntArray7749 != null) {
			int[] is = anIntArray7749;
			for (int i_1_ = 0; i_1_ < is.length; i_1_++) {
				int i_2_ = is[i_1_];
				Class589.method9752(i_2_, class14, 2056251360);
			}
		}
		Class589.method9752(anInt7752 * -207655469, class14, 2063858616);
		Class589.method9752(anInt7748 * -1863328359, class14, 1920266685);
		Class589.method9752(anInt7754 * 430185815, class14, 2046794529);
		Class589.method9752(-1140021099 * anInt7755, class14, 1744202425);
		Class589.method9752(anInt7756 * -724205313, class14, 1999889050);
		Class589.method9752(anInt7757 * 1796392159, class14, 1916595417);
		Class589.method9752(anInt7772 * 684302799, class14, 2058327327);
		Class589.method9752(1369343077 * anInt7759, class14, 1774318601);
		Class589.method9752(-893536895 * anInt7760, class14, 1897204910);
		Class589.method9752(1751585825 * anInt7761, class14, 2037920487);
		Class589.method9752(87001555 * anInt7762, class14, 2098518408);
		Class589.method9752(1855181421 * anInt7763, class14, 1976856520);
		Class589.method9752(anInt7764 * 791380503, class14, 2123054188);
		Class589.method9752(-613234717 * anInt7765, class14, 2086112021);
		Class589.method9752(anInt7766 * -1717141423, class14, 2013921157);
		Class589.method9752(-1416939543 * anInt7771, class14, 2118956444);
		Class589.method9752(213684443 * anInt7785, class14, 2116829643);
		Class589.method9752(-1019346901 * anInt7769, class14, 1780015794);
		Class589.method9752(735182951 * anInt7753, class14, 2135652402);
		Class589.method9752(anInt7775 * -1211758029, class14, 2113034776);
		int[] is = new int[class14.method734(653953441)];
		int i_3_ = 0;
		Iterator iterator = class14.iterator();
		while (iterator.hasNext()) {
			Class523 class523 = (Class523) iterator.next();
			is[i_3_++] = (int) (class523.aLong7065 * 1055205983951172633L);
		}
		return is;
	}

	void method9721(Class523_Sub34 class523_sub34, int i, byte i_4_) {
		if (1 == i) {
			anInt7786 = class523_sub34.readBigSmart((byte) -79) * 1174182691;
			anInt7754 = class523_sub34.readBigSmart((byte) -36) * 1807228519;
		} else if (2 == i)
			anInt7762 = class523_sub34.readBigSmart((byte) -87) * 313177691;
		else if (i == 3)
			anInt7763 = class523_sub34.readBigSmart((byte) -7) * -58652827;
		else if (i == 4)
			anInt7764 = class523_sub34.readBigSmart((byte) -100) * -2058889817;
		else if (i == 5)
			anInt7765 = class523_sub34.readBigSmart((byte) -62) * 1765324235;
		else if (i == 6)
			anInt7772 = class523_sub34.readBigSmart((byte) -10) * -2505425;
		else if (i == 7)
			anInt7759 = class523_sub34.readBigSmart((byte) -35) * 232689005;
		else if (i == 8)
			anInt7760 = class523_sub34.readBigSmart((byte) -30) * 2056292993;
		else if (i == 9)
			anInt7761 = class523_sub34.readBigSmart((byte) -10) * -972197919;
		else if (26 == i) {
			anInt7778 = ((short) (class523_sub34.readUnsignedByte(-362422386) * 4) * 1832272147);
			anInt7773 = ((short) (class523_sub34.readUnsignedByte(931313306) * 4) * -2072697619);
		} else if (i == 27) {
			int i_5_ = class523_sub34.readUnsignedByte(-461109709);
			if (anIntArrayArray7776 == null)
				anIntArrayArray7776 = new int[i_5_ + 1][];
			else if (i_5_ >= anIntArrayArray7776.length)
				anIntArrayArray7776 = (int[][]) Arrays.copyOf(anIntArrayArray7776, 1 + i_5_);
			anIntArrayArray7776[i_5_] = new int[6];
			for (int i_6_ = 0; i_6_ < 6; i_6_++)
				anIntArrayArray7776[i_5_][i_6_] = class523_sub34.readShort(-582084638);
		} else if (i == 28) {
			int i_7_ = class523_sub34.readUnsignedByte(2108502419);
			anIntArray7780 = new int[i_7_];
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
				anIntArray7780[i_8_] = class523_sub34.readUnsignedByte(-352909896);
				if (anIntArray7780[i_8_] == 255)
					anIntArray7780[i_8_] = -1;
			}
		} else if (29 == i)
			anInt7781 = class523_sub34.readUnsignedByte(-1227734465) * 578840467;
		else if (i == 30)
			anInt7782 = class523_sub34.readUnsignedShort(-1436697610) * 1017777589;
		else if (31 == i)
			anInt7783 = class523_sub34.readUnsignedByte(167401684) * -1367282903;
		else if (i == 32)
			anInt7784 = class523_sub34.readUnsignedShort(-162287372) * 2042475575;
		else if (i == 33)
			anInt7791 = class523_sub34.readShort(1955616467) * 1637927717;
		else if (34 == i)
			anInt7751 = class523_sub34.readUnsignedByte(345003859) * -534635571;
		else if (35 == i)
			anInt7787 = class523_sub34.readUnsignedShort(-1418039745) * 274877721;
		else if (i == 36)
			anInt7788 = class523_sub34.readShort(988562922) * 648213965;
		else if (i == 37)
			anInt7789 = class523_sub34.readUnsignedByte(-1359323704) * -903871425;
		else if (i == 38)
			anInt7752 = class523_sub34.readBigSmart((byte) -125) * -614174117;
		else if (i == 39)
			anInt7748 = class523_sub34.readBigSmart((byte) -52) * 1913792169;
		else if (40 == i)
			anInt7755 = class523_sub34.readBigSmart((byte) -33) * -1920671043;
		else if (i == 41)
			anInt7756 = class523_sub34.readBigSmart((byte) -10) * -1087799553;
		else if (42 == i)
			anInt7757 = class523_sub34.readBigSmart((byte) -43) * -1390807265;
		else if (43 == i)
			class523_sub34.readUnsignedShort(-323322134);
		else if (i == 44)
			class523_sub34.readUnsignedShort(-652443063);
		else if (i == 45)
			anInt7790 = class523_sub34.readUnsignedShort(-1104785287) * 1856271587;
		else if (46 == i)
			anInt7766 = class523_sub34.readBigSmart((byte) -79) * -16594767;
		else if (47 == i)
			anInt7771 = class523_sub34.readBigSmart((byte) -52) * 2053312601;
		else if (48 == i)
			anInt7785 = class523_sub34.readBigSmart((byte) -68) * 1961683795;
		else if (i == 49)
			anInt7769 = class523_sub34.readBigSmart((byte) -1) * 7519875;
		else if (50 == i)
			anInt7753 = class523_sub34.readBigSmart((byte) -120) * 1666259799;
		else if (51 == i)
			anInt7775 = class523_sub34.readBigSmart((byte) -46) * -1076100869;
		else if (52 == i) {
			int i_9_ = class523_sub34.readUnsignedByte(123123284);
			anIntArray7749 = new int[i_9_];
			anIntArray7750 = new int[i_9_];
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
				anIntArray7749[i_10_] = class523_sub34.readBigSmart((byte) -39);
				int i_11_ = class523_sub34.readUnsignedByte(-2024807884);
				anIntArray7750[i_10_] = i_11_;
				anInt7758 += i_11_ * -949857239;
			}
		} else if (i == 53)
			aBool7770 = false;
		else if (i == 54) {
			anInt7774 = (class523_sub34.readUnsignedByte(-1698171920) << 6) * 485441113;
			anInt7767 = (class523_sub34.readUnsignedByte(-1688822810) << 6) * -1588303995;
		} else if (55 == i) {
			int i_12_ = class523_sub34.readUnsignedByte(11116871);
			if (anIntArray7779 == null)
				anIntArray7779 = new int[1 + i_12_];
			else if (i_12_ >= anIntArray7779.length)
				anIntArray7779 = Arrays.copyOf(anIntArray7779, 1 + i_12_);
			anIntArray7779[i_12_] = class523_sub34.readUnsignedShort(-231816790);
		} else if (56 == i) {
			int i_13_ = class523_sub34.readUnsignedByte(-444571992);
			if (anIntArrayArray7768 == null)
				anIntArrayArray7768 = new int[1 + i_13_][];
			else if (i_13_ >= anIntArrayArray7768.length)
				anIntArrayArray7768 = (int[][]) Arrays.copyOf(anIntArrayArray7768, 1 + i_13_);
			anIntArrayArray7768[i_13_] = new int[3];
			for (int i_14_ = 0; i_14_ < 3; i_14_++)
				anIntArrayArray7768[i_13_][i_14_] = class523_sub34.readShort(139737665);
		}
	}

	Class588() {
		anIntArray7749 = null;
		anIntArray7750 = null;
		anInt7758 = 0;
		anInt7752 = 614174117;
		anInt7748 = -1913792169;
		anInt7754 = -1807228519;
		anInt7755 = 1920671043;
		anInt7756 = 1087799553;
		anInt7757 = 1390807265;
		anInt7772 = 2505425;
		anInt7759 = -232689005;
		anInt7760 = -2056292993;
		anInt7761 = 972197919;
		anInt7762 = -313177691;
		anInt7763 = 58652827;
		anInt7764 = 2058889817;
		anInt7765 = -1765324235;
		anInt7766 = 16594767;
		anInt7771 = -2053312601;
		anInt7785 = -1961683795;
		anInt7769 = -7519875;
		anInt7753 = -1666259799;
		anInt7775 = 1076100869;
		anInt7778 = 0;
		anInt7773 = 0;
		anInt7774 = 0;
		anInt7767 = 0;
		anInt7781 = 0;
		anInt7782 = 0;
		anInt7783 = 0;
		anInt7784 = 0;
		anInt7791 = 0;
		anInt7751 = 0;
		anInt7787 = 0;
		anInt7788 = 0;
		anInt7789 = 903871425;
		anInt7790 = -1856271587;
		aBool7770 = true;
	}

	static final void method9722(int i, Class14 class14) {
		if (i != -1 && class14.method741((long) i) == null)
			class14.method738(new Class523(), (long) i);
	}

	public Class435[] method9723() {
		if (null != aClass435Array7777)
			return aClass435Array7777;
		if (null == anIntArrayArray7776)
			return null;
		aClass435Array7777 = new Class435[anIntArrayArray7776.length];
		for (int i = 0; i < anIntArrayArray7776.length; i++) {
			int i_15_ = 0;
			int i_16_ = 0;
			int i_17_ = 0;
			int i_18_ = 0;
			int i_19_ = 0;
			int i_20_ = 0;
			if (anIntArrayArray7776[i] != null) {
				i_15_ = anIntArrayArray7776[i][0];
				i_16_ = anIntArrayArray7776[i][1];
				i_17_ = anIntArrayArray7776[i][2];
				i_18_ = anIntArrayArray7776[i][3] << 3;
				i_19_ = anIntArrayArray7776[i][4] << 3;
				i_20_ = anIntArrayArray7776[i][5] << 3;
			}
			if (i_15_ != 0 || 0 != i_16_ || i_17_ != 0 || i_18_ != 0 || i_19_ != 0 || 0 != i_20_) {
				Class435 class435 = aClass435Array7777[i] = new Class435();
				if (0 != i_20_)
					class435.method6814(0.0F, 0.0F, 1.0F, Class433.method6799(i_20_));
				if (0 != i_18_)
					class435.method6814(1.0F, 0.0F, 0.0F, Class433.method6799(i_18_));
				if (i_19_ != 0)
					class435.method6814(0.0F, 1.0F, 0.0F, Class433.method6799(i_19_));
				class435.method6819((float) i_15_, (float) i_16_, (float) i_17_);
			}
		}
		return aClass435Array7777;
	}

	public Class435[] method9724(int i) {
		if (null != aClass435Array7777)
			return aClass435Array7777;
		if (null == anIntArrayArray7776)
			return null;
		aClass435Array7777 = new Class435[anIntArrayArray7776.length];
		for (int i_21_ = 0; i_21_ < anIntArrayArray7776.length; i_21_++) {
			int i_22_ = 0;
			int i_23_ = 0;
			int i_24_ = 0;
			int i_25_ = 0;
			int i_26_ = 0;
			int i_27_ = 0;
			if (anIntArrayArray7776[i_21_] != null) {
				i_22_ = anIntArrayArray7776[i_21_][0];
				i_23_ = anIntArrayArray7776[i_21_][1];
				i_24_ = anIntArrayArray7776[i_21_][2];
				i_25_ = anIntArrayArray7776[i_21_][3] << 3;
				i_26_ = anIntArrayArray7776[i_21_][4] << 3;
				i_27_ = anIntArrayArray7776[i_21_][5] << 3;
			}
			if (i_22_ != 0 || 0 != i_23_ || i_24_ != 0 || i_25_ != 0 || i_26_ != 0 || 0 != i_27_) {
				Class435 class435 = aClass435Array7777[i_21_] = new Class435();
				if (0 != i_27_)
					class435.method6814(0.0F, 0.0F, 1.0F, Class433.method6799(i_27_));
				if (0 != i_25_)
					class435.method6814(1.0F, 0.0F, 0.0F, Class433.method6799(i_25_));
				if (i_26_ != 0)
					class435.method6814(0.0F, 1.0F, 0.0F, Class433.method6799(i_26_));
				class435.method6819((float) i_22_, (float) i_23_, (float) i_24_);
			}
		}
		return aClass435Array7777;
	}

	public void method51(int i) {
		/* empty */
	}

	public boolean method9725(int i) {
		if (i == -1)
			return false;
		if (anInt7786 * -1932039029 == i)
			return true;
		if (anIntArray7749 != null) {
			for (int i_28_ = 0; i_28_ < anIntArray7749.length; i_28_++) {
				if (i == anIntArray7749[i_28_])
					return true;
			}
		}
		return false;
	}

	public void method75(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1243644351);
			if (0 == i)
				break;
			method9721(class523_sub34, i, (byte) 6);
		}
	}

	public void method78() {
		/* empty */
	}

	public void method60(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(75858136);
			if (0 == i)
				break;
			method9721(class523_sub34, i, (byte) 34);
		}
	}

	public void method63(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1671245231);
			if (0 == i)
				break;
			method9721(class523_sub34, i, (byte) 86);
		}
	}

	public void method62(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1038024339);
			if (0 == i)
				break;
			method9721(class523_sub34, i, (byte) 52);
		}
	}

	public void method58(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(506477325);
			if (0 == i)
				break;
			method9721(class523_sub34, i, (byte) 104);
		}
	}

	public void method74(byte i) {
		/* empty */
	}

	public void method79() {
		/* empty */
	}

	public void method77() {
		/* empty */
	}

	public void method73() {
		/* empty */
	}

	public int[] method9726() {
		Class14 class14 = new Class14(16);
		Class589.method9752(anInt7786 * -1932039029, class14, 1946731211);
		if (anIntArray7749 != null) {
			int[] is = anIntArray7749;
			for (int i = 0; i < is.length; i++) {
				int i_29_ = is[i];
				Class589.method9752(i_29_, class14, 2043241389);
			}
		}
		Class589.method9752(anInt7752 * -207655469, class14, 2100176185);
		Class589.method9752(anInt7748 * -1863328359, class14, 1794729296);
		Class589.method9752(anInt7754 * 430185815, class14, 1837362059);
		Class589.method9752(-1140021099 * anInt7755, class14, 2020707371);
		Class589.method9752(anInt7756 * -724205313, class14, 1989708199);
		Class589.method9752(anInt7757 * 1796392159, class14, 1989797793);
		Class589.method9752(anInt7772 * 684302799, class14, 2017014707);
		Class589.method9752(1369343077 * anInt7759, class14, 1746119688);
		Class589.method9752(-893536895 * anInt7760, class14, 1960149039);
		Class589.method9752(1751585825 * anInt7761, class14, 1847847958);
		Class589.method9752(87001555 * anInt7762, class14, 1920884967);
		Class589.method9752(1855181421 * anInt7763, class14, 2029972226);
		Class589.method9752(anInt7764 * 791380503, class14, 2071021934);
		Class589.method9752(-613234717 * anInt7765, class14, 1966148936);
		Class589.method9752(anInt7766 * -1717141423, class14, 2025086434);
		Class589.method9752(-1416939543 * anInt7771, class14, 1872019310);
		Class589.method9752(213684443 * anInt7785, class14, 2024216406);
		Class589.method9752(-1019346901 * anInt7769, class14, 1792124305);
		Class589.method9752(735182951 * anInt7753, class14, 1908779011);
		Class589.method9752(anInt7775 * -1211758029, class14, 2091570862);
		int[] is = new int[class14.method734(912006164)];
		int i = 0;
		Iterator iterator = class14.iterator();
		while (iterator.hasNext()) {
			Class523 class523 = (Class523) iterator.next();
			is[i++] = (int) (class523.aLong7065 * 1055205983951172633L);
		}
		return is;
	}

	void method9727(Class523_Sub34 class523_sub34, int i) {
		if (1 == i) {
			anInt7786 = class523_sub34.readBigSmart((byte) -107) * 1174182691;
			anInt7754 = class523_sub34.readBigSmart((byte) -71) * 1807228519;
		} else if (2 == i)
			anInt7762 = class523_sub34.readBigSmart((byte) -57) * 313177691;
		else if (i == 3)
			anInt7763 = class523_sub34.readBigSmart((byte) -5) * -58652827;
		else if (i == 4)
			anInt7764 = class523_sub34.readBigSmart((byte) -26) * -2058889817;
		else if (i == 5)
			anInt7765 = class523_sub34.readBigSmart((byte) -36) * 1765324235;
		else if (i == 6)
			anInt7772 = class523_sub34.readBigSmart((byte) -35) * -2505425;
		else if (i == 7)
			anInt7759 = class523_sub34.readBigSmart((byte) -20) * 232689005;
		else if (i == 8)
			anInt7760 = class523_sub34.readBigSmart((byte) -106) * 2056292993;
		else if (i == 9)
			anInt7761 = class523_sub34.readBigSmart((byte) -72) * -972197919;
		else if (26 == i) {
			anInt7778 = ((short) (class523_sub34.readUnsignedByte(-32089068) * 4) * 1832272147);
			anInt7773 = ((short) (class523_sub34.readUnsignedByte(-1329810655) * 4) * -2072697619);
		} else if (i == 27) {
			int i_30_ = class523_sub34.readUnsignedByte(672487145);
			if (anIntArrayArray7776 == null)
				anIntArrayArray7776 = new int[i_30_ + 1][];
			else if (i_30_ >= anIntArrayArray7776.length)
				anIntArrayArray7776 = (int[][]) Arrays.copyOf(anIntArrayArray7776, 1 + i_30_);
			anIntArrayArray7776[i_30_] = new int[6];
			for (int i_31_ = 0; i_31_ < 6; i_31_++)
				anIntArrayArray7776[i_30_][i_31_] = class523_sub34.readShort(-949024182);
		} else if (i == 28) {
			int i_32_ = class523_sub34.readUnsignedByte(-889486727);
			anIntArray7780 = new int[i_32_];
			for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
				anIntArray7780[i_33_] = class523_sub34.readUnsignedByte(-1660707493);
				if (anIntArray7780[i_33_] == 255)
					anIntArray7780[i_33_] = -1;
			}
		} else if (29 == i)
			anInt7781 = class523_sub34.readUnsignedByte(231756507) * 578840467;
		else if (i == 30)
			anInt7782 = class523_sub34.readUnsignedShort(-495517604) * 1017777589;
		else if (31 == i)
			anInt7783 = class523_sub34.readUnsignedByte(1745985661) * -1367282903;
		else if (i == 32)
			anInt7784 = class523_sub34.readUnsignedShort(-1891488183) * 2042475575;
		else if (i == 33)
			anInt7791 = class523_sub34.readShort(-1190296861) * 1637927717;
		else if (34 == i)
			anInt7751 = class523_sub34.readUnsignedByte(-1537060674) * -534635571;
		else if (35 == i)
			anInt7787 = class523_sub34.readUnsignedShort(-1204290245) * 274877721;
		else if (i == 36)
			anInt7788 = class523_sub34.readShort(474414327) * 648213965;
		else if (i == 37)
			anInt7789 = class523_sub34.readUnsignedByte(-1843712935) * -903871425;
		else if (i == 38)
			anInt7752 = class523_sub34.readBigSmart((byte) -103) * -614174117;
		else if (i == 39)
			anInt7748 = class523_sub34.readBigSmart((byte) -47) * 1913792169;
		else if (40 == i)
			anInt7755 = class523_sub34.readBigSmart((byte) -69) * -1920671043;
		else if (i == 41)
			anInt7756 = class523_sub34.readBigSmart((byte) -86) * -1087799553;
		else if (42 == i)
			anInt7757 = class523_sub34.readBigSmart((byte) -68) * -1390807265;
		else if (43 == i)
			class523_sub34.readUnsignedShort(-1712643771);
		else if (i == 44)
			class523_sub34.readUnsignedShort(-715814392);
		else if (i == 45)
			anInt7790 = class523_sub34.readUnsignedShort(-531713317) * 1856271587;
		else if (46 == i)
			anInt7766 = class523_sub34.readBigSmart((byte) -81) * -16594767;
		else if (47 == i)
			anInt7771 = class523_sub34.readBigSmart((byte) -115) * 2053312601;
		else if (48 == i)
			anInt7785 = class523_sub34.readBigSmart((byte) -87) * 1961683795;
		else if (i == 49)
			anInt7769 = class523_sub34.readBigSmart((byte) -115) * 7519875;
		else if (50 == i)
			anInt7753 = class523_sub34.readBigSmart((byte) 0) * 1666259799;
		else if (51 == i)
			anInt7775 = class523_sub34.readBigSmart((byte) -43) * -1076100869;
		else if (52 == i) {
			int i_34_ = class523_sub34.readUnsignedByte(-695301869);
			anIntArray7749 = new int[i_34_];
			anIntArray7750 = new int[i_34_];
			for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
				anIntArray7749[i_35_] = class523_sub34.readBigSmart((byte) -7);
				int i_36_ = class523_sub34.readUnsignedByte(406454846);
				anIntArray7750[i_35_] = i_36_;
				anInt7758 += i_36_ * -949857239;
			}
		} else if (i == 53)
			aBool7770 = false;
		else if (i == 54) {
			anInt7774 = (class523_sub34.readUnsignedByte(51401752) << 6) * 485441113;
			anInt7767 = (class523_sub34.readUnsignedByte(1753597968) << 6) * -1588303995;
		} else if (55 == i) {
			int i_37_ = class523_sub34.readUnsignedByte(1200856361);
			if (anIntArray7779 == null)
				anIntArray7779 = new int[1 + i_37_];
			else if (i_37_ >= anIntArray7779.length)
				anIntArray7779 = Arrays.copyOf(anIntArray7779, 1 + i_37_);
			anIntArray7779[i_37_] = class523_sub34.readUnsignedShort(-952846772);
		} else if (56 == i) {
			int i_38_ = class523_sub34.readUnsignedByte(912366740);
			if (anIntArrayArray7768 == null)
				anIntArrayArray7768 = new int[1 + i_38_][];
			else if (i_38_ >= anIntArrayArray7768.length)
				anIntArrayArray7768 = (int[][]) Arrays.copyOf(anIntArrayArray7768, 1 + i_38_);
			anIntArrayArray7768[i_38_] = new int[3];
			for (int i_39_ = 0; i_39_ < 3; i_39_++)
				anIntArrayArray7768[i_38_][i_39_] = class523_sub34.readShort(-1511653050);
		}
	}

	void method9728(Class523_Sub34 class523_sub34, int i) {
		if (1 == i) {
			anInt7786 = class523_sub34.readBigSmart((byte) -67) * 1174182691;
			anInt7754 = class523_sub34.readBigSmart((byte) -24) * 1807228519;
		} else if (2 == i)
			anInt7762 = class523_sub34.readBigSmart((byte) -35) * 313177691;
		else if (i == 3)
			anInt7763 = class523_sub34.readBigSmart((byte) -90) * -58652827;
		else if (i == 4)
			anInt7764 = class523_sub34.readBigSmart((byte) -13) * -2058889817;
		else if (i == 5)
			anInt7765 = class523_sub34.readBigSmart((byte) -15) * 1765324235;
		else if (i == 6)
			anInt7772 = class523_sub34.readBigSmart((byte) -126) * -2505425;
		else if (i == 7)
			anInt7759 = class523_sub34.readBigSmart((byte) -28) * 232689005;
		else if (i == 8)
			anInt7760 = class523_sub34.readBigSmart((byte) -71) * 2056292993;
		else if (i == 9)
			anInt7761 = class523_sub34.readBigSmart((byte) -24) * -972197919;
		else if (26 == i) {
			anInt7778 = ((short) (class523_sub34.readUnsignedByte(2052183952) * 4) * 1832272147);
			anInt7773 = ((short) (class523_sub34.readUnsignedByte(191668427) * 4) * -2072697619);
		} else if (i == 27) {
			int i_40_ = class523_sub34.readUnsignedByte(-1072205742);
			if (anIntArrayArray7776 == null)
				anIntArrayArray7776 = new int[i_40_ + 1][];
			else if (i_40_ >= anIntArrayArray7776.length)
				anIntArrayArray7776 = (int[][]) Arrays.copyOf(anIntArrayArray7776, 1 + i_40_);
			anIntArrayArray7776[i_40_] = new int[6];
			for (int i_41_ = 0; i_41_ < 6; i_41_++)
				anIntArrayArray7776[i_40_][i_41_] = class523_sub34.readShort(-900040682);
		} else if (i == 28) {
			int i_42_ = class523_sub34.readUnsignedByte(-198195659);
			anIntArray7780 = new int[i_42_];
			for (int i_43_ = 0; i_43_ < i_42_; i_43_++) {
				anIntArray7780[i_43_] = class523_sub34.readUnsignedByte(-946041599);
				if (anIntArray7780[i_43_] == 255)
					anIntArray7780[i_43_] = -1;
			}
		} else if (29 == i)
			anInt7781 = class523_sub34.readUnsignedByte(486027819) * 578840467;
		else if (i == 30)
			anInt7782 = class523_sub34.readUnsignedShort(-1643141818) * 1017777589;
		else if (31 == i)
			anInt7783 = class523_sub34.readUnsignedByte(620291982) * -1367282903;
		else if (i == 32)
			anInt7784 = class523_sub34.readUnsignedShort(-524805412) * 2042475575;
		else if (i == 33)
			anInt7791 = class523_sub34.readShort(855919582) * 1637927717;
		else if (34 == i)
			anInt7751 = class523_sub34.readUnsignedByte(-1997371865) * -534635571;
		else if (35 == i)
			anInt7787 = class523_sub34.readUnsignedShort(-218007743) * 274877721;
		else if (i == 36)
			anInt7788 = class523_sub34.readShort(-1493540346) * 648213965;
		else if (i == 37)
			anInt7789 = class523_sub34.readUnsignedByte(-626551019) * -903871425;
		else if (i == 38)
			anInt7752 = class523_sub34.readBigSmart((byte) -12) * -614174117;
		else if (i == 39)
			anInt7748 = class523_sub34.readBigSmart((byte) -43) * 1913792169;
		else if (40 == i)
			anInt7755 = class523_sub34.readBigSmart((byte) -69) * -1920671043;
		else if (i == 41)
			anInt7756 = class523_sub34.readBigSmart((byte) -24) * -1087799553;
		else if (42 == i)
			anInt7757 = class523_sub34.readBigSmart((byte) -64) * -1390807265;
		else if (43 == i)
			class523_sub34.readUnsignedShort(-804789580);
		else if (i == 44)
			class523_sub34.readUnsignedShort(-1198366545);
		else if (i == 45)
			anInt7790 = class523_sub34.readUnsignedShort(-1474589943) * 1856271587;
		else if (46 == i)
			anInt7766 = class523_sub34.readBigSmart((byte) -22) * -16594767;
		else if (47 == i)
			anInt7771 = class523_sub34.readBigSmart((byte) -7) * 2053312601;
		else if (48 == i)
			anInt7785 = class523_sub34.readBigSmart((byte) -32) * 1961683795;
		else if (i == 49)
			anInt7769 = class523_sub34.readBigSmart((byte) -92) * 7519875;
		else if (50 == i)
			anInt7753 = class523_sub34.readBigSmart((byte) -27) * 1666259799;
		else if (51 == i)
			anInt7775 = class523_sub34.readBigSmart((byte) -43) * -1076100869;
		else if (52 == i) {
			int i_44_ = class523_sub34.readUnsignedByte(-124756708);
			anIntArray7749 = new int[i_44_];
			anIntArray7750 = new int[i_44_];
			for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
				anIntArray7749[i_45_] = class523_sub34.readBigSmart((byte) -47);
				int i_46_ = class523_sub34.readUnsignedByte(235705777);
				anIntArray7750[i_45_] = i_46_;
				anInt7758 += i_46_ * -949857239;
			}
		} else if (i == 53)
			aBool7770 = false;
		else if (i == 54) {
			anInt7774 = (class523_sub34.readUnsignedByte(-1719251519) << 6) * 485441113;
			anInt7767 = (class523_sub34.readUnsignedByte(1085985608) << 6) * -1588303995;
		} else if (55 == i) {
			int i_47_ = class523_sub34.readUnsignedByte(-1891253792);
			if (anIntArray7779 == null)
				anIntArray7779 = new int[1 + i_47_];
			else if (i_47_ >= anIntArray7779.length)
				anIntArray7779 = Arrays.copyOf(anIntArray7779, 1 + i_47_);
			anIntArray7779[i_47_] = class523_sub34.readUnsignedShort(-65561710);
		} else if (56 == i) {
			int i_48_ = class523_sub34.readUnsignedByte(181839198);
			if (anIntArrayArray7768 == null)
				anIntArrayArray7768 = new int[1 + i_48_][];
			else if (i_48_ >= anIntArrayArray7768.length)
				anIntArrayArray7768 = (int[][]) Arrays.copyOf(anIntArrayArray7768, 1 + i_48_);
			anIntArrayArray7768[i_48_] = new int[3];
			for (int i_49_ = 0; i_49_ < 3; i_49_++)
				anIntArrayArray7768[i_48_][i_49_] = class523_sub34.readShort(836891989);
		}
	}

	void method9729(Class523_Sub34 class523_sub34, int i) {
		if (1 == i) {
			anInt7786 = class523_sub34.readBigSmart((byte) -47) * 1174182691;
			anInt7754 = class523_sub34.readBigSmart((byte) -63) * 1807228519;
		} else if (2 == i)
			anInt7762 = class523_sub34.readBigSmart((byte) -69) * 313177691;
		else if (i == 3)
			anInt7763 = class523_sub34.readBigSmart((byte) -63) * -58652827;
		else if (i == 4)
			anInt7764 = class523_sub34.readBigSmart((byte) -14) * -2058889817;
		else if (i == 5)
			anInt7765 = class523_sub34.readBigSmart((byte) -71) * 1765324235;
		else if (i == 6)
			anInt7772 = class523_sub34.readBigSmart((byte) -99) * -2505425;
		else if (i == 7)
			anInt7759 = class523_sub34.readBigSmart((byte) -20) * 232689005;
		else if (i == 8)
			anInt7760 = class523_sub34.readBigSmart((byte) -17) * 2056292993;
		else if (i == 9)
			anInt7761 = class523_sub34.readBigSmart((byte) -58) * -972197919;
		else if (26 == i) {
			anInt7778 = ((short) (class523_sub34.readUnsignedByte(1807413929) * 4) * 1832272147);
			anInt7773 = ((short) (class523_sub34.readUnsignedByte(-354589726) * 4) * -2072697619);
		} else if (i == 27) {
			int i_50_ = class523_sub34.readUnsignedByte(1112300034);
			if (anIntArrayArray7776 == null)
				anIntArrayArray7776 = new int[i_50_ + 1][];
			else if (i_50_ >= anIntArrayArray7776.length)
				anIntArrayArray7776 = (int[][]) Arrays.copyOf(anIntArrayArray7776, 1 + i_50_);
			anIntArrayArray7776[i_50_] = new int[6];
			for (int i_51_ = 0; i_51_ < 6; i_51_++)
				anIntArrayArray7776[i_50_][i_51_] = class523_sub34.readShort(798339625);
		} else if (i == 28) {
			int i_52_ = class523_sub34.readUnsignedByte(-925367547);
			anIntArray7780 = new int[i_52_];
			for (int i_53_ = 0; i_53_ < i_52_; i_53_++) {
				anIntArray7780[i_53_] = class523_sub34.readUnsignedByte(1604184278);
				if (anIntArray7780[i_53_] == 255)
					anIntArray7780[i_53_] = -1;
			}
		} else if (29 == i)
			anInt7781 = class523_sub34.readUnsignedByte(-1819575808) * 578840467;
		else if (i == 30)
			anInt7782 = class523_sub34.readUnsignedShort(-624844903) * 1017777589;
		else if (31 == i)
			anInt7783 = class523_sub34.readUnsignedByte(1953452643) * -1367282903;
		else if (i == 32)
			anInt7784 = class523_sub34.readUnsignedShort(-1434237023) * 2042475575;
		else if (i == 33)
			anInt7791 = class523_sub34.readShort(-972166944) * 1637927717;
		else if (34 == i)
			anInt7751 = class523_sub34.readUnsignedByte(43435756) * -534635571;
		else if (35 == i)
			anInt7787 = class523_sub34.readUnsignedShort(-1181089484) * 274877721;
		else if (i == 36)
			anInt7788 = class523_sub34.readShort(-1315745343) * 648213965;
		else if (i == 37)
			anInt7789 = class523_sub34.readUnsignedByte(236043406) * -903871425;
		else if (i == 38)
			anInt7752 = class523_sub34.readBigSmart((byte) -49) * -614174117;
		else if (i == 39)
			anInt7748 = class523_sub34.readBigSmart((byte) -6) * 1913792169;
		else if (40 == i)
			anInt7755 = class523_sub34.readBigSmart((byte) -112) * -1920671043;
		else if (i == 41)
			anInt7756 = class523_sub34.readBigSmart((byte) -127) * -1087799553;
		else if (42 == i)
			anInt7757 = class523_sub34.readBigSmart((byte) -33) * -1390807265;
		else if (43 == i)
			class523_sub34.readUnsignedShort(-106951427);
		else if (i == 44)
			class523_sub34.readUnsignedShort(-482936542);
		else if (i == 45)
			anInt7790 = class523_sub34.readUnsignedShort(-339103943) * 1856271587;
		else if (46 == i)
			anInt7766 = class523_sub34.readBigSmart((byte) -114) * -16594767;
		else if (47 == i)
			anInt7771 = class523_sub34.readBigSmart((byte) -52) * 2053312601;
		else if (48 == i)
			anInt7785 = class523_sub34.readBigSmart((byte) -8) * 1961683795;
		else if (i == 49)
			anInt7769 = class523_sub34.readBigSmart((byte) -63) * 7519875;
		else if (50 == i)
			anInt7753 = class523_sub34.readBigSmart((byte) -36) * 1666259799;
		else if (51 == i)
			anInt7775 = class523_sub34.readBigSmart((byte) -35) * -1076100869;
		else if (52 == i) {
			int i_54_ = class523_sub34.readUnsignedByte(-174366837);
			anIntArray7749 = new int[i_54_];
			anIntArray7750 = new int[i_54_];
			for (int i_55_ = 0; i_55_ < i_54_; i_55_++) {
				anIntArray7749[i_55_] = class523_sub34.readBigSmart((byte) -95);
				int i_56_ = class523_sub34.readUnsignedByte(-1067047631);
				anIntArray7750[i_55_] = i_56_;
				anInt7758 += i_56_ * -949857239;
			}
		} else if (i == 53)
			aBool7770 = false;
		else if (i == 54) {
			anInt7774 = (class523_sub34.readUnsignedByte(-611721438) << 6) * 485441113;
			anInt7767 = (class523_sub34.readUnsignedByte(-249901976) << 6) * -1588303995;
		} else if (55 == i) {
			int i_57_ = class523_sub34.readUnsignedByte(-1829125825);
			if (anIntArray7779 == null)
				anIntArray7779 = new int[1 + i_57_];
			else if (i_57_ >= anIntArray7779.length)
				anIntArray7779 = Arrays.copyOf(anIntArray7779, 1 + i_57_);
			anIntArray7779[i_57_] = class523_sub34.readUnsignedShort(-1823294661);
		} else if (56 == i) {
			int i_58_ = class523_sub34.readUnsignedByte(-1762462744);
			if (anIntArrayArray7768 == null)
				anIntArrayArray7768 = new int[1 + i_58_][];
			else if (i_58_ >= anIntArrayArray7768.length)
				anIntArrayArray7768 = (int[][]) Arrays.copyOf(anIntArrayArray7768, 1 + i_58_);
			anIntArrayArray7768[i_58_] = new int[3];
			for (int i_59_ = 0; i_59_ < 3; i_59_++)
				anIntArrayArray7768[i_58_][i_59_] = class523_sub34.readShort(-403600899);
		}
	}

	void method9730(Class523_Sub34 class523_sub34, int i) {
		if (1 == i) {
			anInt7786 = class523_sub34.readBigSmart((byte) -12) * 1174182691;
			anInt7754 = class523_sub34.readBigSmart((byte) -23) * 1807228519;
		} else if (2 == i)
			anInt7762 = class523_sub34.readBigSmart((byte) -68) * 313177691;
		else if (i == 3)
			anInt7763 = class523_sub34.readBigSmart((byte) -55) * -58652827;
		else if (i == 4)
			anInt7764 = class523_sub34.readBigSmart((byte) -70) * -2058889817;
		else if (i == 5)
			anInt7765 = class523_sub34.readBigSmart((byte) -93) * 1765324235;
		else if (i == 6)
			anInt7772 = class523_sub34.readBigSmart((byte) -73) * -2505425;
		else if (i == 7)
			anInt7759 = class523_sub34.readBigSmart((byte) -27) * 232689005;
		else if (i == 8)
			anInt7760 = class523_sub34.readBigSmart((byte) -74) * 2056292993;
		else if (i == 9)
			anInt7761 = class523_sub34.readBigSmart((byte) -38) * -972197919;
		else if (26 == i) {
			anInt7778 = ((short) (class523_sub34.readUnsignedByte(-1441793652) * 4) * 1832272147);
			anInt7773 = ((short) (class523_sub34.readUnsignedByte(-1622588597) * 4) * -2072697619);
		} else if (i == 27) {
			int i_60_ = class523_sub34.readUnsignedByte(-152749916);
			if (anIntArrayArray7776 == null)
				anIntArrayArray7776 = new int[i_60_ + 1][];
			else if (i_60_ >= anIntArrayArray7776.length)
				anIntArrayArray7776 = (int[][]) Arrays.copyOf(anIntArrayArray7776, 1 + i_60_);
			anIntArrayArray7776[i_60_] = new int[6];
			for (int i_61_ = 0; i_61_ < 6; i_61_++)
				anIntArrayArray7776[i_60_][i_61_] = class523_sub34.readShort(524437982);
		} else if (i == 28) {
			int i_62_ = class523_sub34.readUnsignedByte(2092048731);
			anIntArray7780 = new int[i_62_];
			for (int i_63_ = 0; i_63_ < i_62_; i_63_++) {
				anIntArray7780[i_63_] = class523_sub34.readUnsignedByte(765046237);
				if (anIntArray7780[i_63_] == 255)
					anIntArray7780[i_63_] = -1;
			}
		} else if (29 == i)
			anInt7781 = class523_sub34.readUnsignedByte(1755861612) * 578840467;
		else if (i == 30)
			anInt7782 = class523_sub34.readUnsignedShort(-109971556) * 1017777589;
		else if (31 == i)
			anInt7783 = class523_sub34.readUnsignedByte(743511575) * -1367282903;
		else if (i == 32)
			anInt7784 = class523_sub34.readUnsignedShort(-230213024) * 2042475575;
		else if (i == 33)
			anInt7791 = class523_sub34.readShort(1602054446) * 1637927717;
		else if (34 == i)
			anInt7751 = class523_sub34.readUnsignedByte(881011621) * -534635571;
		else if (35 == i)
			anInt7787 = class523_sub34.readUnsignedShort(-1817704038) * 274877721;
		else if (i == 36)
			anInt7788 = class523_sub34.readShort(1657691434) * 648213965;
		else if (i == 37)
			anInt7789 = class523_sub34.readUnsignedByte(-869341292) * -903871425;
		else if (i == 38)
			anInt7752 = class523_sub34.readBigSmart((byte) -123) * -614174117;
		else if (i == 39)
			anInt7748 = class523_sub34.readBigSmart((byte) -128) * 1913792169;
		else if (40 == i)
			anInt7755 = class523_sub34.readBigSmart((byte) -36) * -1920671043;
		else if (i == 41)
			anInt7756 = class523_sub34.readBigSmart((byte) -68) * -1087799553;
		else if (42 == i)
			anInt7757 = class523_sub34.readBigSmart((byte) -45) * -1390807265;
		else if (43 == i)
			class523_sub34.readUnsignedShort(-364947045);
		else if (i == 44)
			class523_sub34.readUnsignedShort(-1537078953);
		else if (i == 45)
			anInt7790 = class523_sub34.readUnsignedShort(-322031026) * 1856271587;
		else if (46 == i)
			anInt7766 = class523_sub34.readBigSmart((byte) -92) * -16594767;
		else if (47 == i)
			anInt7771 = class523_sub34.readBigSmart((byte) -92) * 2053312601;
		else if (48 == i)
			anInt7785 = class523_sub34.readBigSmart((byte) -11) * 1961683795;
		else if (i == 49)
			anInt7769 = class523_sub34.readBigSmart((byte) -8) * 7519875;
		else if (50 == i)
			anInt7753 = class523_sub34.readBigSmart((byte) -75) * 1666259799;
		else if (51 == i)
			anInt7775 = class523_sub34.readBigSmart((byte) -127) * -1076100869;
		else if (52 == i) {
			int i_64_ = class523_sub34.readUnsignedByte(-2003129517);
			anIntArray7749 = new int[i_64_];
			anIntArray7750 = new int[i_64_];
			for (int i_65_ = 0; i_65_ < i_64_; i_65_++) {
				anIntArray7749[i_65_] = class523_sub34.readBigSmart((byte) -128);
				int i_66_ = class523_sub34.readUnsignedByte(-1911067967);
				anIntArray7750[i_65_] = i_66_;
				anInt7758 += i_66_ * -949857239;
			}
		} else if (i == 53)
			aBool7770 = false;
		else if (i == 54) {
			anInt7774 = (class523_sub34.readUnsignedByte(-663566794) << 6) * 485441113;
			anInt7767 = (class523_sub34.readUnsignedByte(-1351118841) << 6) * -1588303995;
		} else if (55 == i) {
			int i_67_ = class523_sub34.readUnsignedByte(621558229);
			if (anIntArray7779 == null)
				anIntArray7779 = new int[1 + i_67_];
			else if (i_67_ >= anIntArray7779.length)
				anIntArray7779 = Arrays.copyOf(anIntArray7779, 1 + i_67_);
			anIntArray7779[i_67_] = class523_sub34.readUnsignedShort(-1933117273);
		} else if (56 == i) {
			int i_68_ = class523_sub34.readUnsignedByte(597840541);
			if (anIntArrayArray7768 == null)
				anIntArrayArray7768 = new int[1 + i_68_][];
			else if (i_68_ >= anIntArrayArray7768.length)
				anIntArrayArray7768 = (int[][]) Arrays.copyOf(anIntArrayArray7768, 1 + i_68_);
			anIntArrayArray7768[i_68_] = new int[3];
			for (int i_69_ = 0; i_69_ < 3; i_69_++)
				anIntArrayArray7768[i_68_][i_69_] = class523_sub34.readShort(-801875356);
		}
	}

	public void method52(int i, byte i_70_) {
		/* empty */
	}

	public int method9731() {
		if (anInt7786 * -1932039029 != -1)
			return anInt7786 * -1932039029;
		if (anIntArray7749 != null) {
			int i = (int) (Math.random() * (double) (anInt7758 * -886011879));
			int i_71_;
			for (i_71_ = 0; i >= anIntArray7750[i_71_]; i_71_++)
				i -= anIntArray7750[i_71_];
			return anIntArray7749[i_71_];
		}
		return -1;
	}

	public void method76(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1800658704);
			if (0 == i)
				break;
			method9721(class523_sub34, i, (byte) 69);
		}
	}

	public boolean method9732(int i) {
		if (i == -1)
			return false;
		if (anInt7786 * -1932039029 == i)
			return true;
		if (anIntArray7749 != null) {
			for (int i_72_ = 0; i_72_ < anIntArray7749.length; i_72_++) {
				if (i == anIntArray7749[i_72_])
					return true;
			}
		}
		return false;
	}

	public boolean method9733(int i) {
		if (i == -1)
			return false;
		if (anInt7786 * -1932039029 == i)
			return true;
		if (anIntArray7749 != null) {
			for (int i_73_ = 0; i_73_ < anIntArray7749.length; i_73_++) {
				if (i == anIntArray7749[i_73_])
					return true;
			}
		}
		return false;
	}

	public int method9734(int i) {
		if (anInt7786 * -1932039029 != -1)
			return anInt7786 * -1932039029;
		if (anIntArray7749 != null) {
			int i_74_ = (int) (Math.random() * (double) (anInt7758 * -886011879));
			int i_75_;
			for (i_75_ = 0; i_74_ >= anIntArray7750[i_75_]; i_75_++)
				i_74_ -= anIntArray7750[i_75_];
			return anIntArray7749[i_75_];
		}
		return -1;
	}

	public Class435[] method9735() {
		if (null != aClass435Array7777)
			return aClass435Array7777;
		if (null == anIntArrayArray7776)
			return null;
		aClass435Array7777 = new Class435[anIntArrayArray7776.length];
		for (int i = 0; i < anIntArrayArray7776.length; i++) {
			int i_76_ = 0;
			int i_77_ = 0;
			int i_78_ = 0;
			int i_79_ = 0;
			int i_80_ = 0;
			int i_81_ = 0;
			if (anIntArrayArray7776[i] != null) {
				i_76_ = anIntArrayArray7776[i][0];
				i_77_ = anIntArrayArray7776[i][1];
				i_78_ = anIntArrayArray7776[i][2];
				i_79_ = anIntArrayArray7776[i][3] << 3;
				i_80_ = anIntArrayArray7776[i][4] << 3;
				i_81_ = anIntArrayArray7776[i][5] << 3;
			}
			if (i_76_ != 0 || 0 != i_77_ || i_78_ != 0 || i_79_ != 0 || i_80_ != 0 || 0 != i_81_) {
				Class435 class435 = aClass435Array7777[i] = new Class435();
				if (0 != i_81_)
					class435.method6814(0.0F, 0.0F, 1.0F, Class433.method6799(i_81_));
				if (0 != i_79_)
					class435.method6814(1.0F, 0.0F, 0.0F, Class433.method6799(i_79_));
				if (i_80_ != 0)
					class435.method6814(0.0F, 1.0F, 0.0F, Class433.method6799(i_80_));
				class435.method6819((float) i_76_, (float) i_77_, (float) i_78_);
			}
		}
		return aClass435Array7777;
	}

	public int[] method9736() {
		Class14 class14 = new Class14(16);
		Class589.method9752(anInt7786 * -1932039029, class14, 1916789177);
		if (anIntArray7749 != null) {
			int[] is = anIntArray7749;
			for (int i = 0; i < is.length; i++) {
				int i_82_ = is[i];
				Class589.method9752(i_82_, class14, 1857019702);
			}
		}
		Class589.method9752(anInt7752 * -207655469, class14, 1811666940);
		Class589.method9752(anInt7748 * -1863328359, class14, 1767661233);
		Class589.method9752(anInt7754 * 430185815, class14, 1833339729);
		Class589.method9752(-1140021099 * anInt7755, class14, 2099529275);
		Class589.method9752(anInt7756 * -724205313, class14, 2105030166);
		Class589.method9752(anInt7757 * 1796392159, class14, 1936248792);
		Class589.method9752(anInt7772 * 684302799, class14, 2098941242);
		Class589.method9752(1369343077 * anInt7759, class14, 2011000422);
		Class589.method9752(-893536895 * anInt7760, class14, 1792480205);
		Class589.method9752(1751585825 * anInt7761, class14, 2032317492);
		Class589.method9752(87001555 * anInt7762, class14, 1841724948);
		Class589.method9752(1855181421 * anInt7763, class14, 2069422921);
		Class589.method9752(anInt7764 * 791380503, class14, 1792346041);
		Class589.method9752(-613234717 * anInt7765, class14, 2070036091);
		Class589.method9752(anInt7766 * -1717141423, class14, 1855864193);
		Class589.method9752(-1416939543 * anInt7771, class14, 2145831800);
		Class589.method9752(213684443 * anInt7785, class14, 2006841677);
		Class589.method9752(-1019346901 * anInt7769, class14, 2042018319);
		Class589.method9752(735182951 * anInt7753, class14, 1974599195);
		Class589.method9752(anInt7775 * -1211758029, class14, 2144177901);
		int[] is = new int[class14.method734(458614454)];
		int i = 0;
		Iterator iterator = class14.iterator();
		while (iterator.hasNext()) {
			Class523 class523 = (Class523) iterator.next();
			is[i++] = (int) (class523.aLong7065 * 1055205983951172633L);
		}
		return is;
	}

	public boolean method9737(int i, int i_83_) {
		if (i == -1)
			return false;
		if (anInt7786 * -1932039029 == i)
			return true;
		if (anIntArray7749 != null) {
			for (int i_84_ = 0; i_84_ < anIntArray7749.length; i_84_++) {
				if (i == anIntArray7749[i_84_])
					return true;
			}
		}
		return false;
	}

	public int[] method9738() {
		Class14 class14 = new Class14(16);
		Class589.method9752(anInt7786 * -1932039029, class14, 2061053640);
		if (anIntArray7749 != null) {
			int[] is = anIntArray7749;
			for (int i = 0; i < is.length; i++) {
				int i_85_ = is[i];
				Class589.method9752(i_85_, class14, 1944347240);
			}
		}
		Class589.method9752(anInt7752 * -207655469, class14, 1957858387);
		Class589.method9752(anInt7748 * -1863328359, class14, 1977726435);
		Class589.method9752(anInt7754 * 430185815, class14, 1985951264);
		Class589.method9752(-1140021099 * anInt7755, class14, 1800941210);
		Class589.method9752(anInt7756 * -724205313, class14, 1957530392);
		Class589.method9752(anInt7757 * 1796392159, class14, 1746539244);
		Class589.method9752(anInt7772 * 684302799, class14, 1999450406);
		Class589.method9752(1369343077 * anInt7759, class14, 2142728337);
		Class589.method9752(-893536895 * anInt7760, class14, 1802910394);
		Class589.method9752(1751585825 * anInt7761, class14, 2024668116);
		Class589.method9752(87001555 * anInt7762, class14, 1812669215);
		Class589.method9752(1855181421 * anInt7763, class14, 2046702931);
		Class589.method9752(anInt7764 * 791380503, class14, 2116905736);
		Class589.method9752(-613234717 * anInt7765, class14, 1822368059);
		Class589.method9752(anInt7766 * -1717141423, class14, 2037799398);
		Class589.method9752(-1416939543 * anInt7771, class14, 1969045588);
		Class589.method9752(213684443 * anInt7785, class14, 2105043192);
		Class589.method9752(-1019346901 * anInt7769, class14, 2052803606);
		Class589.method9752(735182951 * anInt7753, class14, 1835972218);
		Class589.method9752(anInt7775 * -1211758029, class14, 1772076301);
		int[] is = new int[class14.method734(67948127)];
		int i = 0;
		Iterator iterator = class14.iterator();
		while (iterator.hasNext()) {
			Class523 class523 = (Class523) iterator.next();
			is[i++] = (int) (class523.aLong7065 * 1055205983951172633L);
		}
		return is;
	}

	void method9739(Class523_Sub34 class523_sub34, int i) {
		if (1 == i) {
			anInt7786 = class523_sub34.readBigSmart((byte) -97) * 1174182691;
			anInt7754 = class523_sub34.readBigSmart((byte) -98) * 1807228519;
		} else if (2 == i)
			anInt7762 = class523_sub34.readBigSmart((byte) -100) * 313177691;
		else if (i == 3)
			anInt7763 = class523_sub34.readBigSmart((byte) -124) * -58652827;
		else if (i == 4)
			anInt7764 = class523_sub34.readBigSmart((byte) -1) * -2058889817;
		else if (i == 5)
			anInt7765 = class523_sub34.readBigSmart((byte) -46) * 1765324235;
		else if (i == 6)
			anInt7772 = class523_sub34.readBigSmart((byte) -29) * -2505425;
		else if (i == 7)
			anInt7759 = class523_sub34.readBigSmart((byte) -69) * 232689005;
		else if (i == 8)
			anInt7760 = class523_sub34.readBigSmart((byte) -94) * 2056292993;
		else if (i == 9)
			anInt7761 = class523_sub34.readBigSmart((byte) -40) * -972197919;
		else if (26 == i) {
			anInt7778 = ((short) (class523_sub34.readUnsignedByte(940454859) * 4) * 1832272147);
			anInt7773 = ((short) (class523_sub34.readUnsignedByte(1987016791) * 4) * -2072697619);
		} else if (i == 27) {
			int i_86_ = class523_sub34.readUnsignedByte(-127853030);
			if (anIntArrayArray7776 == null)
				anIntArrayArray7776 = new int[i_86_ + 1][];
			else if (i_86_ >= anIntArrayArray7776.length)
				anIntArrayArray7776 = (int[][]) Arrays.copyOf(anIntArrayArray7776, 1 + i_86_);
			anIntArrayArray7776[i_86_] = new int[6];
			for (int i_87_ = 0; i_87_ < 6; i_87_++)
				anIntArrayArray7776[i_86_][i_87_] = class523_sub34.readShort(-793002095);
		} else if (i == 28) {
			int i_88_ = class523_sub34.readUnsignedByte(1773436534);
			anIntArray7780 = new int[i_88_];
			for (int i_89_ = 0; i_89_ < i_88_; i_89_++) {
				anIntArray7780[i_89_] = class523_sub34.readUnsignedByte(-939007883);
				if (anIntArray7780[i_89_] == 255)
					anIntArray7780[i_89_] = -1;
			}
		} else if (29 == i)
			anInt7781 = class523_sub34.readUnsignedByte(-1376943242) * 578840467;
		else if (i == 30)
			anInt7782 = class523_sub34.readUnsignedShort(-956503729) * 1017777589;
		else if (31 == i)
			anInt7783 = class523_sub34.readUnsignedByte(-930486633) * -1367282903;
		else if (i == 32)
			anInt7784 = class523_sub34.readUnsignedShort(-84059087) * 2042475575;
		else if (i == 33)
			anInt7791 = class523_sub34.readShort(-1458828331) * 1637927717;
		else if (34 == i)
			anInt7751 = class523_sub34.readUnsignedByte(-1275527706) * -534635571;
		else if (35 == i)
			anInt7787 = class523_sub34.readUnsignedShort(-1116883587) * 274877721;
		else if (i == 36)
			anInt7788 = class523_sub34.readShort(-285331603) * 648213965;
		else if (i == 37)
			anInt7789 = class523_sub34.readUnsignedByte(68500368) * -903871425;
		else if (i == 38)
			anInt7752 = class523_sub34.readBigSmart((byte) -56) * -614174117;
		else if (i == 39)
			anInt7748 = class523_sub34.readBigSmart((byte) -8) * 1913792169;
		else if (40 == i)
			anInt7755 = class523_sub34.readBigSmart((byte) -107) * -1920671043;
		else if (i == 41)
			anInt7756 = class523_sub34.readBigSmart((byte) -127) * -1087799553;
		else if (42 == i)
			anInt7757 = class523_sub34.readBigSmart((byte) -72) * -1390807265;
		else if (43 == i)
			class523_sub34.readUnsignedShort(-326993535);
		else if (i == 44)
			class523_sub34.readUnsignedShort(-1487408491);
		else if (i == 45)
			anInt7790 = class523_sub34.readUnsignedShort(-1482957248) * 1856271587;
		else if (46 == i)
			anInt7766 = class523_sub34.readBigSmart((byte) -8) * -16594767;
		else if (47 == i)
			anInt7771 = class523_sub34.readBigSmart((byte) -94) * 2053312601;
		else if (48 == i)
			anInt7785 = class523_sub34.readBigSmart((byte) -108) * 1961683795;
		else if (i == 49)
			anInt7769 = class523_sub34.readBigSmart((byte) -4) * 7519875;
		else if (50 == i)
			anInt7753 = class523_sub34.readBigSmart((byte) -76) * 1666259799;
		else if (51 == i)
			anInt7775 = class523_sub34.readBigSmart((byte) -106) * -1076100869;
		else if (52 == i) {
			int i_90_ = class523_sub34.readUnsignedByte(1596330025);
			anIntArray7749 = new int[i_90_];
			anIntArray7750 = new int[i_90_];
			for (int i_91_ = 0; i_91_ < i_90_; i_91_++) {
				anIntArray7749[i_91_] = class523_sub34.readBigSmart((byte) -110);
				int i_92_ = class523_sub34.readUnsignedByte(-1297806828);
				anIntArray7750[i_91_] = i_92_;
				anInt7758 += i_92_ * -949857239;
			}
		} else if (i == 53)
			aBool7770 = false;
		else if (i == 54) {
			anInt7774 = (class523_sub34.readUnsignedByte(1090668886) << 6) * 485441113;
			anInt7767 = (class523_sub34.readUnsignedByte(1491980748) << 6) * -1588303995;
		} else if (55 == i) {
			int i_93_ = class523_sub34.readUnsignedByte(-1068457217);
			if (anIntArray7779 == null)
				anIntArray7779 = new int[1 + i_93_];
			else if (i_93_ >= anIntArray7779.length)
				anIntArray7779 = Arrays.copyOf(anIntArray7779, 1 + i_93_);
			anIntArray7779[i_93_] = class523_sub34.readUnsignedShort(-1703485781);
		} else if (56 == i) {
			int i_94_ = class523_sub34.readUnsignedByte(-678059609);
			if (anIntArrayArray7768 == null)
				anIntArrayArray7768 = new int[1 + i_94_][];
			else if (i_94_ >= anIntArrayArray7768.length)
				anIntArrayArray7768 = (int[][]) Arrays.copyOf(anIntArrayArray7768, 1 + i_94_);
			anIntArrayArray7768[i_94_] = new int[3];
			for (int i_95_ = 0; i_95_ < 3; i_95_++)
				anIntArrayArray7768[i_94_][i_95_] = class523_sub34.readShort(-1446931379);
		}
	}

	static final void method9740(Class669 class669, int i) {
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18358((byte) 19);
	}

	static final void method9741(Class669 class669, short i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.anInt10988 * 503698129;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.anInt10987 * 742099907;
	}

	public static int method9742(Random random, int i, int i_96_) {
		if (null == random) {
			random = Class87.aRandom882;
			if (random == null) {
				synchronized (Class87.anObject883) {
					if (Class87.aRandom882 == null)
						Class87.aRandom882 = new Random();
					random = Class87.aRandom882;
				}
			}
		}
		if (i <= 0)
			throw new IllegalArgumentException();
		if (Class318.method5691(i, -857238400))
			return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i >> 32);
		int i_97_ = -2147483648 - (int) (4294967296L % (long) i);
		int i_98_;
		do
			i_98_ = random.nextInt();
		while (i_98_ >= i_97_);
		return Class542.method9002(i_98_, i, 227663610);
	}

	static final void method9743(Class647_Sub1 class647_sub1, int i, boolean bool, byte i_99_) {
		Class26.method848(class647_sub1, i, false, bool, -896565917);
	}
}
