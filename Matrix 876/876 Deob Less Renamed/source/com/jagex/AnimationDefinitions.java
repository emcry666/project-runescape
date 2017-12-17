/* Class205 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class AnimationDefinitions implements Interface13 {
	public int anInt2214;
	Class208 aClass208_2215;
	public int anInt2216;
	public int[] anIntArray2217;
	public int[] anIntArray2218;
	public int anInt2219;
	public int anInt2220;
	public Class187 aClass187_2221;
	int anInt2222;
	public int[][] anIntArrayArray2223;
	public boolean aBool2224;
	public int[] anIntArray2225;
	public int anInt2226;
	Class14 aClass14_2227;
	public int anInt2228;
	public int anInt2229;
	public static boolean aBool2230 = false;
	public int priority;
	public boolean aBool2232;
	public int anInt2233 = 0;
	public int[] anIntArray2234;
	public int[] anIntArray2235;
	public int[] anIntArray2236;
	public int anInt2237;
	public int anInt2238;

	public String method3714(int i, String string) {
		if (null == aClass14_2227)
			return string;
		Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass14_2227.method741((long) i);
		if (null == class523_sub28)
			return string;
		return (String) class523_sub28.anObject10554;
	}

	AnimationDefinitions(int i, Class208 class208) {
		anInt2222 = -455055171;
		anInt2237 = 1029980571;
		priority = -1979391729;
		anInt2226 = 1846042203;
		anInt2219 = -2144577099;
		anInt2228 = 131897575;
		anInt2229 = 949876769;
		anInt2238 = 338850961;
		anInt2220 = -200019730;
		aBool2232 = false;
		aBool2224 = false;
		anInt2214 = -906618673;
		anInt2216 = 969928503 * i;
		aClass208_2215 = class208;
	}

	public void method76(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(421056421);
			if (0 == i)
				break;
			method3716(class523_sub34, i, -1771014218);
		}
	}

	public void method78() {
		if (-1032817633 * anInt2229 == -1) {
			if (aClass187_2221 != null && null != aClass187_2221.aBoolArray2132)
				anInt2229 = -1899753538;
			else
				anInt2229 = 0;
		}
		if (anInt2238 * 1830302607 == -1) {
			if (aClass187_2221 != null && null != aClass187_2221.aBoolArray2132)
				anInt2238 = -677701922;
			else
				anInt2238 = 0;
		}
		if (anIntArray2225 != null) {
			anInt2233 = 0;
			for (int i = 0; i < anIntArray2225.length; i++)
				anInt2233 += -1335747671 * anIntArray2225[i];
		}
	}

	public void method62(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(516202321);
			if (0 == i)
				break;
			method3716(class523_sub34, i, -1583503913);
		}
	}

	public int method3715(int i, int i_0_, byte i_1_) {
		if (aClass14_2227 == null)
			return i_0_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_2227.method741((long) i);
		if (class523_sub24 == null)
			return i_0_;
		return -677457577 * class523_sub24.anInt10542;
	}

	public void method80(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_2_ = class523_sub34.readUnsignedByte(-785026714);
			if (0 == i_2_)
				break;
			method3716(class523_sub34, i_2_, 156286991);
		}
	}

	public void method60(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-88019169);
			if (0 == i)
				break;
			method3716(class523_sub34, i, 1295437704);
		}
	}

	public void method79() {
		if (-1032817633 * anInt2229 == -1) {
			if (aClass187_2221 != null && null != aClass187_2221.aBoolArray2132)
				anInt2229 = -1899753538;
			else
				anInt2229 = 0;
		}
		if (anInt2238 * 1830302607 == -1) {
			if (aClass187_2221 != null && null != aClass187_2221.aBoolArray2132)
				anInt2238 = -677701922;
			else
				anInt2238 = 0;
		}
		if (anIntArray2225 != null) {
			anInt2233 = 0;
			for (int i = 0; i < anIntArray2225.length; i++)
				anInt2233 += -1335747671 * anIntArray2225[i];
		}
	}

	void method3716(Class523_Sub34 class523_sub34, int i, int i_3_) {
		if (1 == i) {
			int i_4_ = class523_sub34.readUnsignedShort(-256501963);
			anIntArray2225 = new int[i_4_];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
				anIntArray2225[i_5_] = class523_sub34.readUnsignedShort(-1087116111);
			anIntArray2217 = new int[i_4_];
			for (int i_6_ = 0; i_6_ < i_4_; i_6_++)
				anIntArray2217[i_6_] = class523_sub34.readUnsignedShort(-947463340);
			for (int i_7_ = 0; i_7_ < i_4_; i_7_++)
				anIntArray2217[i_7_] = (class523_sub34.readUnsignedShort(-1879595044) << 16) + anIntArray2217[i_7_];
		} else if (2 == i)
			anInt2237 = class523_sub34.readUnsignedShort(-1328464586) * -1029980571;
		else if (5 == i)
			priority = class523_sub34.readUnsignedByte(327742006) * -1254871805;
		else if (6 == i)
			anInt2226 = class523_sub34.readUnsignedShort(-1150484317) * -1846042203;
		else if (i == 7)
			anInt2219 = class523_sub34.readUnsignedShort(-162309997) * 2144577099;
		else if (i == 8)
			anInt2228 = class523_sub34.readUnsignedByte(2080546549) * -1864158547;
		else if (9 == i)
			anInt2229 = class523_sub34.readUnsignedByte(358457490) * -949876769;
		else if (10 == i)
			anInt2238 = class523_sub34.readUnsignedByte(645125595) * -338850961;
		else if (11 == i)
			anInt2220 = class523_sub34.readUnsignedByte(1677751437) * 2047473783;
		else if (12 == i || i == 112) {
			int i_8_;
			if (i == 12)
				i_8_ = class523_sub34.readUnsignedByte(577672302);
			else
				i_8_ = class523_sub34.readUnsignedShort(-432169923);
			anIntArray2218 = new int[i_8_];
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
				anIntArray2218[i_9_] = class523_sub34.readUnsignedShort(-1731353915);
			for (int i_10_ = 0; i_10_ < i_8_; i_10_++)
				anIntArray2218[i_10_] = (class523_sub34.readUnsignedShort(-773765861) << 16) + anIntArray2218[i_10_];
		} else if (i == 13) {
			int i_11_ = class523_sub34.readUnsignedShort(-582953369);
			anIntArrayArray2223 = new int[i_11_][];
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
				int i_13_ = class523_sub34.readUnsignedByte(-617642840);
				if (i_13_ > 0) {
					anIntArrayArray2223[i_12_] = new int[i_13_];
					anIntArrayArray2223[i_12_][0] = class523_sub34.read24BitInt(1887251181);
					for (int i_14_ = 1; i_14_ < i_13_; i_14_++)
						anIntArrayArray2223[i_12_][i_14_] = class523_sub34.readUnsignedShort(-347527520);
				}
			}
		} else if (i == 14)
			aBool2232 = true;
		else if (15 == i)
			aBool2224 = true;
		else if (i != 16 && i != 18) {
			if (i == 19 || i == 119) {
				if (null == anIntArray2234) {
					anIntArray2234 = new int[anIntArrayArray2223.length];
					for (int i_15_ = 0; i_15_ < anIntArrayArray2223.length; i_15_++)
						anIntArray2234[i_15_] = 255;
				}
				int i_16_;
				if (i == 19)
					i_16_ = class523_sub34.readUnsignedByte(-1507256211);
				else
					i_16_ = class523_sub34.readUnsignedShort(-224344599);
				anIntArray2234[i_16_] = class523_sub34.readUnsignedByte(-1876841193);
			} else if (i == 20 || i == 120) {
				if (anIntArray2235 == null || anIntArray2236 == null) {
					anIntArray2235 = new int[anIntArrayArray2223.length];
					anIntArray2236 = new int[anIntArrayArray2223.length];
					for (int i_17_ = 0; i_17_ < anIntArrayArray2223.length; i_17_++) {
						anIntArray2235[i_17_] = 256;
						anIntArray2236[i_17_] = 256;
					}
				}
				int i_18_;
				if (20 == i)
					i_18_ = class523_sub34.readUnsignedByte(-1711552297);
				else
					i_18_ = class523_sub34.readUnsignedShort(-1032410612);
				anIntArray2235[i_18_] = class523_sub34.readUnsignedShort(-1947663868);
				anIntArray2236[i_18_] = class523_sub34.readUnsignedShort(-330985560);
			} else if (i == 22)
				anInt2214 = class523_sub34.readUnsignedByte(1485641238) * 906618673;
			else if (i == 23)
				class523_sub34.readUnsignedShort(-1900799797);
			else if (i == 24) {
				anInt2222 = class523_sub34.readUnsignedShort(-1149309396) * 455055171;
				if (aClass208_2215 != null)
					aClass187_2221 = ((Class187) aClass208_2215.anInterface12_2249.getDefinition(anInt2222 * 455552363, (byte) 11));
			} else if (i == 249) {
				int i_19_ = class523_sub34.readUnsignedByte(-649237323);
				if (aClass14_2227 == null) {
					int i_20_ = Class628.method10313(i_19_, -1830742294);
					aClass14_2227 = new Class14(i_20_);
				}
				for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
					boolean bool = class523_sub34.readUnsignedByte(1940770612) == 1;
					int i_22_ = class523_sub34.read24BitInt(871781128);
					Class523 class523;
					if (bool)
						class523 = (new Class523_Sub28(class523_sub34.readString(-1625611599)));
					else
						class523 = new Class523_Sub24(class523_sub34.readUnsignedInt((byte) -21));
					aClass14_2227.method738(class523, (long) i_22_);
				}
			}
		}
	}

	public void method63(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(2140973969);
			if (0 == i)
				break;
			method3716(class523_sub34, i, -130581089);
		}
	}

	public void method74(byte i) {
		if (-1032817633 * anInt2229 == -1) {
			if (aClass187_2221 != null && null != aClass187_2221.aBoolArray2132)
				anInt2229 = -1899753538;
			else
				anInt2229 = 0;
		}
		if (anInt2238 * 1830302607 == -1) {
			if (aClass187_2221 != null && null != aClass187_2221.aBoolArray2132)
				anInt2238 = -677701922;
			else
				anInt2238 = 0;
		}
		if (anIntArray2225 != null) {
			anInt2233 = 0;
			for (int i_23_ = 0; i_23_ < anIntArray2225.length; i_23_++)
				anInt2233 += -1335747671 * anIntArray2225[i_23_];
		}
	}

	public void method58(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(255217256);
			if (0 == i)
				break;
			method3716(class523_sub34, i, -1517652802);
		}
	}

	void method3717(Class523_Sub34 class523_sub34, int i) {
		if (1 == i) {
			int i_24_ = class523_sub34.readUnsignedShort(-906303551);
			anIntArray2225 = new int[i_24_];
			for (int i_25_ = 0; i_25_ < i_24_; i_25_++)
				anIntArray2225[i_25_] = class523_sub34.readUnsignedShort(-1934269912);
			anIntArray2217 = new int[i_24_];
			for (int i_26_ = 0; i_26_ < i_24_; i_26_++)
				anIntArray2217[i_26_] = class523_sub34.readUnsignedShort(-1437167010);
			for (int i_27_ = 0; i_27_ < i_24_; i_27_++)
				anIntArray2217[i_27_] = ((class523_sub34.readUnsignedShort(-1793762139) << 16) + anIntArray2217[i_27_]);
		} else if (2 == i)
			anInt2237 = class523_sub34.readUnsignedShort(-2113396931) * -1029980571;
		else if (5 == i)
			priority = class523_sub34.readUnsignedByte(334622437) * -1254871805;
		else if (6 == i)
			anInt2226 = class523_sub34.readUnsignedShort(-438562714) * -1846042203;
		else if (i == 7)
			anInt2219 = class523_sub34.readUnsignedShort(-1636619985) * 2144577099;
		else if (i == 8)
			anInt2228 = class523_sub34.readUnsignedByte(-1187706324) * -1864158547;
		else if (9 == i)
			anInt2229 = class523_sub34.readUnsignedByte(42181208) * -949876769;
		else if (10 == i)
			anInt2238 = class523_sub34.readUnsignedByte(101600200) * -338850961;
		else if (11 == i)
			anInt2220 = class523_sub34.readUnsignedByte(-1472038895) * 2047473783;
		else if (12 == i || i == 112) {
			int i_28_;
			if (i == 12)
				i_28_ = class523_sub34.readUnsignedByte(-1105836970);
			else
				i_28_ = class523_sub34.readUnsignedShort(-1941303124);
			anIntArray2218 = new int[i_28_];
			for (int i_29_ = 0; i_29_ < i_28_; i_29_++)
				anIntArray2218[i_29_] = class523_sub34.readUnsignedShort(-4106504);
			for (int i_30_ = 0; i_30_ < i_28_; i_30_++)
				anIntArray2218[i_30_] = ((class523_sub34.readUnsignedShort(-1425623527) << 16) + anIntArray2218[i_30_]);
		} else if (i == 13) {
			int i_31_ = class523_sub34.readUnsignedShort(-1056183095);
			anIntArrayArray2223 = new int[i_31_][];
			for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
				int i_33_ = class523_sub34.readUnsignedByte(-2132821448);
				if (i_33_ > 0) {
					anIntArrayArray2223[i_32_] = new int[i_33_];
					anIntArrayArray2223[i_32_][0] = class523_sub34.read24BitInt(187291179);
					for (int i_34_ = 1; i_34_ < i_33_; i_34_++)
						anIntArrayArray2223[i_32_][i_34_] = class523_sub34.readUnsignedShort(-371287660);
				}
			}
		} else if (i == 14)
			aBool2232 = true;
		else if (15 == i)
			aBool2224 = true;
		else if (i != 16 && i != 18) {
			if (i == 19 || i == 119) {
				if (null == anIntArray2234) {
					anIntArray2234 = new int[anIntArrayArray2223.length];
					for (int i_35_ = 0; i_35_ < anIntArrayArray2223.length; i_35_++)
						anIntArray2234[i_35_] = 255;
				}
				int i_36_;
				if (i == 19)
					i_36_ = class523_sub34.readUnsignedByte(-296233094);
				else
					i_36_ = class523_sub34.readUnsignedShort(-1863155368);
				anIntArray2234[i_36_] = class523_sub34.readUnsignedByte(-808116866);
			} else if (i == 20 || i == 120) {
				if (anIntArray2235 == null || anIntArray2236 == null) {
					anIntArray2235 = new int[anIntArrayArray2223.length];
					anIntArray2236 = new int[anIntArrayArray2223.length];
					for (int i_37_ = 0; i_37_ < anIntArrayArray2223.length; i_37_++) {
						anIntArray2235[i_37_] = 256;
						anIntArray2236[i_37_] = 256;
					}
				}
				int i_38_;
				if (20 == i)
					i_38_ = class523_sub34.readUnsignedByte(-2112151892);
				else
					i_38_ = class523_sub34.readUnsignedShort(-1842783226);
				anIntArray2235[i_38_] = class523_sub34.readUnsignedShort(-287064091);
				anIntArray2236[i_38_] = class523_sub34.readUnsignedShort(-797083596);
			} else if (i == 22)
				anInt2214 = class523_sub34.readUnsignedByte(1471266037) * 906618673;
			else if (i == 23)
				class523_sub34.readUnsignedShort(-1241919064);
			else if (i == 24) {
				anInt2222 = class523_sub34.readUnsignedShort(-232015369) * 455055171;
				if (aClass208_2215 != null)
					aClass187_2221 = ((Class187) aClass208_2215.anInterface12_2249.getDefinition(anInt2222 * 455552363, (byte) -20));
			} else if (i == 249) {
				int i_39_ = class523_sub34.readUnsignedByte(558813575);
				if (aClass14_2227 == null) {
					int i_40_ = Class628.method10313(i_39_, -705810157);
					aClass14_2227 = new Class14(i_40_);
				}
				for (int i_41_ = 0; i_41_ < i_39_; i_41_++) {
					boolean bool = class523_sub34.readUnsignedByte(258540247) == 1;
					int i_42_ = class523_sub34.read24BitInt(-580763186);
					Class523 class523;
					if (bool)
						class523 = new Class523_Sub28(class523_sub34.readString(270500937));
					else
						class523 = new Class523_Sub24(class523_sub34.readUnsignedInt((byte) -33));
					aClass14_2227.method738(class523, (long) i_42_);
				}
			}
		}
	}

	void method3718(Class523_Sub34 class523_sub34, int i) {
		if (1 == i) {
			int i_43_ = class523_sub34.readUnsignedShort(-2113719786);
			anIntArray2225 = new int[i_43_];
			for (int i_44_ = 0; i_44_ < i_43_; i_44_++)
				anIntArray2225[i_44_] = class523_sub34.readUnsignedShort(-1568781384);
			anIntArray2217 = new int[i_43_];
			for (int i_45_ = 0; i_45_ < i_43_; i_45_++)
				anIntArray2217[i_45_] = class523_sub34.readUnsignedShort(-1355001246);
			for (int i_46_ = 0; i_46_ < i_43_; i_46_++)
				anIntArray2217[i_46_] = (class523_sub34.readUnsignedShort(-561054748) << 16) + anIntArray2217[i_46_];
		} else if (2 == i)
			anInt2237 = class523_sub34.readUnsignedShort(-1931795001) * -1029980571;
		else if (5 == i)
			priority = class523_sub34.readUnsignedByte(821945117) * -1254871805;
		else if (6 == i)
			anInt2226 = class523_sub34.readUnsignedShort(-2024747547) * -1846042203;
		else if (i == 7)
			anInt2219 = class523_sub34.readUnsignedShort(-627978040) * 2144577099;
		else if (i == 8)
			anInt2228 = class523_sub34.readUnsignedByte(682970721) * -1864158547;
		else if (9 == i)
			anInt2229 = class523_sub34.readUnsignedByte(-1170234301) * -949876769;
		else if (10 == i)
			anInt2238 = class523_sub34.readUnsignedByte(1206724246) * -338850961;
		else if (11 == i)
			anInt2220 = class523_sub34.readUnsignedByte(-224019738) * 2047473783;
		else if (12 == i || i == 112) {
			int i_47_;
			if (i == 12)
				i_47_ = class523_sub34.readUnsignedByte(-1027159523);
			else
				i_47_ = class523_sub34.readUnsignedShort(-2111241180);
			anIntArray2218 = new int[i_47_];
			for (int i_48_ = 0; i_48_ < i_47_; i_48_++)
				anIntArray2218[i_48_] = class523_sub34.readUnsignedShort(-1999196051);
			for (int i_49_ = 0; i_49_ < i_47_; i_49_++)
				anIntArray2218[i_49_] = ((class523_sub34.readUnsignedShort(-1797088446) << 16) + anIntArray2218[i_49_]);
		} else if (i == 13) {
			int i_50_ = class523_sub34.readUnsignedShort(-58887236);
			anIntArrayArray2223 = new int[i_50_][];
			for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
				int i_52_ = class523_sub34.readUnsignedByte(-871350698);
				if (i_52_ > 0) {
					anIntArrayArray2223[i_51_] = new int[i_52_];
					anIntArrayArray2223[i_51_][0] = class523_sub34.read24BitInt(483982663);
					for (int i_53_ = 1; i_53_ < i_52_; i_53_++)
						anIntArrayArray2223[i_51_][i_53_] = class523_sub34.readUnsignedShort(-1732118215);
				}
			}
		} else if (i == 14)
			aBool2232 = true;
		else if (15 == i)
			aBool2224 = true;
		else if (i != 16 && i != 18) {
			if (i == 19 || i == 119) {
				if (null == anIntArray2234) {
					anIntArray2234 = new int[anIntArrayArray2223.length];
					for (int i_54_ = 0; i_54_ < anIntArrayArray2223.length; i_54_++)
						anIntArray2234[i_54_] = 255;
				}
				int i_55_;
				if (i == 19)
					i_55_ = class523_sub34.readUnsignedByte(-982324218);
				else
					i_55_ = class523_sub34.readUnsignedShort(-1032605281);
				anIntArray2234[i_55_] = class523_sub34.readUnsignedByte(1174751383);
			} else if (i == 20 || i == 120) {
				if (anIntArray2235 == null || anIntArray2236 == null) {
					anIntArray2235 = new int[anIntArrayArray2223.length];
					anIntArray2236 = new int[anIntArrayArray2223.length];
					for (int i_56_ = 0; i_56_ < anIntArrayArray2223.length; i_56_++) {
						anIntArray2235[i_56_] = 256;
						anIntArray2236[i_56_] = 256;
					}
				}
				int i_57_;
				if (20 == i)
					i_57_ = class523_sub34.readUnsignedByte(-650875491);
				else
					i_57_ = class523_sub34.readUnsignedShort(-2124114405);
				anIntArray2235[i_57_] = class523_sub34.readUnsignedShort(-1101889848);
				anIntArray2236[i_57_] = class523_sub34.readUnsignedShort(-1450155482);
			} else if (i == 22)
				anInt2214 = class523_sub34.readUnsignedByte(2100186293) * 906618673;
			else if (i == 23)
				class523_sub34.readUnsignedShort(-1410365345);
			else if (i == 24) {
				anInt2222 = class523_sub34.readUnsignedShort(-2047070208) * 455055171;
				if (aClass208_2215 != null)
					aClass187_2221 = ((Class187) aClass208_2215.anInterface12_2249.getDefinition(anInt2222 * 455552363, (byte) -20));
			} else if (i == 249) {
				int i_58_ = class523_sub34.readUnsignedByte(-1037572801);
				if (aClass14_2227 == null) {
					int i_59_ = Class628.method10313(i_58_, 1235143079);
					aClass14_2227 = new Class14(i_59_);
				}
				for (int i_60_ = 0; i_60_ < i_58_; i_60_++) {
					boolean bool = class523_sub34.readUnsignedByte(997360142) == 1;
					int i_61_ = class523_sub34.read24BitInt(1145013668);
					Class523 class523;
					if (bool)
						class523 = new Class523_Sub28(class523_sub34.readString(-950400610));
					else
						class523 = new Class523_Sub24(class523_sub34.readUnsignedInt((byte) -84));
					aClass14_2227.method738(class523, (long) i_61_);
				}
			}
		}
	}

	public boolean method3719(int i) {
		if (null == anIntArray2217)
			return true;
		boolean bool = true;
		int[] is = anIntArray2217;
		for (int i_62_ = 0; i_62_ < is.length; i_62_++) {
			int i_63_ = is[i_62_];
			if (aClass208_2215.method3751(i_63_ >>> 16, 16777215) == null)
				bool = false;
		}
		return bool;
	}

	public void method75(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1180303089);
			if (0 == i)
				break;
			method3716(class523_sub34, i, 610698963);
		}
	}

	public void method77() {
		if (-1032817633 * anInt2229 == -1) {
			if (aClass187_2221 != null && null != aClass187_2221.aBoolArray2132)
				anInt2229 = -1899753538;
			else
				anInt2229 = 0;
		}
		if (anInt2238 * 1830302607 == -1) {
			if (aClass187_2221 != null && null != aClass187_2221.aBoolArray2132)
				anInt2238 = -677701922;
			else
				anInt2238 = 0;
		}
		if (anIntArray2225 != null) {
			anInt2233 = 0;
			for (int i = 0; i < anIntArray2225.length; i++)
				anInt2233 += -1335747671 * anIntArray2225[i];
		}
	}

	public void method73() {
		if (-1032817633 * anInt2229 == -1) {
			if (aClass187_2221 != null && null != aClass187_2221.aBoolArray2132)
				anInt2229 = -1899753538;
			else
				anInt2229 = 0;
		}
		if (anInt2238 * 1830302607 == -1) {
			if (aClass187_2221 != null && null != aClass187_2221.aBoolArray2132)
				anInt2238 = -677701922;
			else
				anInt2238 = 0;
		}
		if (anIntArray2225 != null) {
			anInt2233 = 0;
			for (int i = 0; i < anIntArray2225.length; i++)
				anInt2233 += -1335747671 * anIntArray2225[i];
		}
	}

	public boolean method3720() {
		if (null == anIntArray2217)
			return true;
		boolean bool = true;
		int[] is = anIntArray2217;
		for (int i = 0; i < is.length; i++) {
			int i_64_ = is[i];
			if (aClass208_2215.method3751(i_64_ >>> 16, 16777215) == null)
				bool = false;
		}
		return bool;
	}

	public int method3721(int i, int i_65_) {
		if (aClass14_2227 == null)
			return i_65_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_2227.method741((long) i);
		if (class523_sub24 == null)
			return i_65_;
		return -677457577 * class523_sub24.anInt10542;
	}

	public int method3722(int i, int i_66_) {
		if (aClass14_2227 == null)
			return i_66_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_2227.method741((long) i);
		if (class523_sub24 == null)
			return i_66_;
		return -677457577 * class523_sub24.anInt10542;
	}

	public int method3723(int i, int i_67_) {
		if (aClass14_2227 == null)
			return i_67_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_2227.method741((long) i);
		if (class523_sub24 == null)
			return i_67_;
		return -677457577 * class523_sub24.anInt10542;
	}

	public String method3724(int i, String string) {
		if (null == aClass14_2227)
			return string;
		Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass14_2227.method741((long) i);
		if (null == class523_sub28)
			return string;
		return (String) class523_sub28.anObject10554;
	}

	public String method3725(int i, String string, byte i_68_) {
		if (null == aClass14_2227)
			return string;
		Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass14_2227.method741((long) i);
		if (null == class523_sub28)
			return string;
		return (String) class523_sub28.anObject10554;
	}

	static final void method3726(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class543.method9006(class250, class242, class669, 1517807960);
	}

	static final void method3727(Class669 class669, int i) {
		int i_69_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (326760831 * client.anInt11235 == 2 && i_69_ < 1563815891 * client.anInt11287)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aClass60Array11182[i_69_].anInt757 * 2036106249;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method3728(Class669 class669, int i) {
		int i_70_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_70_, -1774915540);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.anInt2556 * -293786715;
	}

	static final void method3729(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		Class592.method9797((class669.anIntArray8557[1357652815 * class669.anInt8558]), (class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1]), 0, (byte) 70);
	}

	static void method3730(byte[] is, int i) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		for (;;) {
			int i_71_ = class523_sub34.readUnsignedByte(-122909005);
			if (i_71_ == 0)
				break;
			if (i_71_ == 1)
				Class627.anInt8198 = class523_sub34.readUnsignedShort(-1161078351) * 1190790947;
			else if (10 == i_71_)
				class523_sub34.readUnsignedShort(-59723172);
		}
	}
}
