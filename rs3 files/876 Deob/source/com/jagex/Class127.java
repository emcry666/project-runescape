/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class127 {
	static final boolean method2144(int i, int i_0_) {
		return (((i & 0x2000) != 0 | method2149(i, i_0_) | method2164(i, i_0_)) & method2157(i, i_0_));
	}

	static final boolean method2145(int i, int i_1_) {
		return (i & 0x21) != 0;
	}

	static final boolean method2146(int i, int i_2_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method2147(int i, int i_3_) {
		if (!method2159(i, i_3_))
			return false;
		if ((i & 0xb000) != 0 | method2150(i, i_3_) | method2194(i, i_3_))
			return true;
		return ((i_3_ & 0x37) == 0 & (method2149(i, i_3_) | method2164(i, i_3_)));
	}

	static final boolean method2148(int i, int i_4_) {
		return (i & 0x20) != 0;
	}

	static final boolean method2149(int i, int i_5_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method2150(int i, int i_6_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method2151(int i, int i_7_) {
		return ((i & 0x60000) != 0 | method2153(i, i_7_) || method2147(i, i_7_) || method2183(i, i_7_));
	}

	static final boolean method2152(int i, int i_8_) {
		return false;
	}

	static final boolean method2153(int i, int i_9_) {
		return (i & 0x10) != 0;
	}

	static final boolean method2154(int i, int i_10_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method2155(int i, int i_11_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method2156(int i, int i_12_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2157(int i, int i_13_) {
		return (i & 0x800) != 0 && (i_13_ & 0x37) != 0;
	}

	static final boolean method2158(int i, int i_14_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2159(int i, int i_15_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2160(int i, int i_16_) {
		return (i & 0x20) != 0;
	}

	static final boolean method2161(int i, int i_17_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2162(int i, int i_18_) {
		return ((method2145(i, i_18_) | method2169(i, i_18_) | method2193(i, i_18_)) & method2156(i, i_18_));
	}

	static final boolean method2163(int i, int i_19_) {
		return method2150(i, i_19_) || method2147(i, i_19_);
	}

	static final boolean method2164(int i, int i_20_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method2165(int i, int i_21_) {
		return method2152(i, i_21_) & method2189(i, i_21_);
	}

	static final boolean method2166(int i, int i_22_) {
		return (i & 0x37) != 0;
	}

	static final boolean method2167(int i, int i_23_) {
		return ((i & 0x70000) != 0 | method2145(i, i_23_) || method2162(i, i_23_));
	}

	static final boolean method2168(int i, int i_24_) {
		return ((i & 0x70000) != 0 | method2169(i, i_24_) || method2162(i, i_24_));
	}

	static final boolean method2169(int i, int i_25_) {
		return (i & 0x22) != 0;
	}

	static final boolean method2170(int i, int i_26_) {
		if ((i & 0x10000) != 0 | method2149(i, i_26_) || method2237(i, i_26_))
			return true;
		return (i_26_ & 0x37) == 0 && method2147(i, i_26_);
	}

	static final boolean method2171(int i, int i_27_) {
		return method2150(i, i_27_) || method2147(i, i_27_);
	}

	Class127() throws Throwable {
		throw new Error();
	}

	static final boolean method2172(int i, int i_28_) {
		return method2152(i, i_28_) || method2165(i, i_28_);
	}

	static final boolean method2173(int i, int i_29_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2174(int i, int i_30_) {
		return (i & 0x20) != 0;
	}

	static final boolean method2175(int i, int i_31_) {
		return (i & 0x400) != 0;
	}

	static final boolean method2176(int i, int i_32_) {
		return ((i & 0x60000) != 0 | method2153(i, i_32_) || method2147(i, i_32_) || method2183(i, i_32_));
	}

	static final boolean method2177(int i, int i_33_) {
		return (i & 0x800) != 0 | method2154(i, i_33_) || method2147(i, i_33_);
	}

	static final boolean method2178(int i, int i_34_) {
		return (i & 0x21) != 0;
	}

	static final boolean method2179(int i, int i_35_) {
		return (i & 0x22) != 0;
	}

	static final boolean method2180(int i, int i_36_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method2181(int i, int i_37_) {
		return (i & 0x34) != 0;
	}

	static final boolean method2182(int i, int i_38_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method2183(int i, int i_39_) {
		return method2153(i, i_39_) & method2158(i, i_39_);
	}

	static final boolean method2184(int i, int i_40_) {
		return (i & 0x100100) != 0;
	}

	static final boolean method2185(int i, int i_41_) {
		return false;
	}

	static final boolean method2186(int i, int i_42_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2187(int i, int i_43_) {
		return (i & 0x10) != 0;
	}

	static final boolean method2188(int i, int i_44_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method2189(int i, int i_45_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2190(int i, int i_46_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method2191(int i, int i_47_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method2192(int i, int i_48_) {
		return (i & 0x800) != 0 | method2154(i, i_48_) || method2147(i, i_48_);
	}

	static final boolean method2193(int i, int i_49_) {
		return (i & 0x34) != 0;
	}

	static final boolean method2194(int i, int i_50_) {
		return (i & 0x100100) != 0;
	}

	static final boolean method2195(int i, int i_51_) {
		return ((method2145(i, i_51_) | method2169(i, i_51_) | method2193(i, i_51_)) & method2156(i, i_51_));
	}

	static final boolean method2196(int i, int i_52_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2197(int i, int i_53_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2198(int i, int i_54_) {
		return (i & 0x20) != 0;
	}

	static final boolean method2199(int i, int i_55_) {
		return (i & 0x800) != 0 && (i_55_ & 0x37) != 0;
	}

	static final boolean method2200(int i, int i_56_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2201(int i, int i_57_) {
		return (i & 0x180) != 0;
	}

	static final boolean method2202(int i, int i_58_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2203(int i, int i_59_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2204(int i, int i_60_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2205(int i, int i_61_) {
		return ((method2145(i, i_61_) | method2169(i, i_61_) | method2193(i, i_61_)) & method2156(i, i_61_));
	}

	static final boolean method2206(int i, int i_62_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method2207(int i, int i_63_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2208(int i, int i_64_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2209(int i, int i_65_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2210(int i, int i_66_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2211(int i, int i_67_) {
		return ((method2145(i, i_67_) | method2169(i, i_67_) | method2193(i, i_67_)) & method2156(i, i_67_));
	}

	static final boolean method2212(int i, int i_68_) {
		if ((i & 0x10000) != 0 | method2149(i, i_68_) || method2237(i, i_68_))
			return true;
		return (i_68_ & 0x37) == 0 && method2147(i, i_68_);
	}

	static final boolean method2213(int i, int i_69_) {
		return ((i & 0x70000) != 0 | method2193(i, i_69_) || method2162(i, i_69_));
	}

	static final boolean method2214(int i, int i_70_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method2215(int i, int i_71_) {
		if (!method2159(i, i_71_))
			return false;
		if ((i & 0xb000) != 0 | method2150(i, i_71_) | method2194(i, i_71_))
			return true;
		return ((i_71_ & 0x37) == 0 & (method2149(i, i_71_) | method2164(i, i_71_)));
	}

	static final boolean method2216(int i, int i_72_) {
		return method2152(i, i_72_) & method2189(i, i_72_);
	}

	static final boolean method2217(int i, int i_73_) {
		return method2152(i, i_73_) & method2189(i, i_73_);
	}

	static final boolean method2218(int i, int i_74_) {
		return ((i & 0x70000) != 0 | method2145(i, i_74_) || method2162(i, i_74_));
	}

	static final boolean method2219(int i, int i_75_) {
		return ((i & 0x70000) != 0 | method2169(i, i_75_) || method2162(i, i_75_));
	}

	static final boolean method2220(int i, int i_76_) {
		return ((i & 0x70000) != 0 | method2169(i, i_76_) || method2162(i, i_76_));
	}

	static final boolean method2221(int i, int i_77_) {
		return ((i & 0x70000) != 0 | method2169(i, i_77_) || method2162(i, i_77_));
	}

	static final boolean method2222(int i, int i_78_) {
		return ((i & 0x70000) != 0 | method2193(i, i_78_) || method2162(i, i_78_));
	}

	static final boolean method2223(int i, int i_79_) {
		if ((i & 0x10000) != 0 | method2149(i, i_79_) || method2237(i, i_79_))
			return true;
		return (i_79_ & 0x37) == 0 && method2147(i, i_79_);
	}

	static final boolean method2224(int i, int i_80_) {
		if ((i & 0x10000) != 0 | method2149(i, i_80_) || method2237(i, i_80_))
			return true;
		return (i_80_ & 0x37) == 0 && method2147(i, i_80_);
	}

	static final boolean method2225(int i, int i_81_) {
		return (i & 0x22) != 0;
	}

	static final boolean method2226(int i, int i_82_) {
		return method2150(i, i_82_) || method2147(i, i_82_);
	}

	static final boolean method2227(int i, int i_83_) {
		return method2150(i, i_83_) || method2147(i, i_83_);
	}

	static final boolean method2228(int i, int i_84_) {
		return method2150(i, i_84_) || method2147(i, i_84_);
	}

	static final boolean method2229(int i, int i_85_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2230(int i, int i_86_) {
		return ((i & 0x40000) != 0 | method2194(i, i_86_) || method2147(i, i_86_));
	}

	static final boolean method2231(int i, int i_87_) {
		return ((i & 0x40000) != 0 | method2194(i, i_87_) || method2147(i, i_87_));
	}

	static final boolean method2232(int i, int i_88_) {
		return method2152(i, i_88_) || method2165(i, i_88_);
	}

	static final boolean method2233(int i, int i_89_) {
		return method2152(i, i_89_) || method2165(i, i_89_);
	}

	static final boolean method2234(int i, int i_90_) {
		return (i & 0x180) != 0;
	}

	static final boolean method2235(int i, int i_91_) {
		return (i & 0x180) != 0;
	}

	static final boolean method2236(int i, int i_92_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method2237(int i, int i_93_) {
		return (((i & 0x2000) != 0 | method2149(i, i_93_) | method2164(i, i_93_)) & method2157(i, i_93_));
	}

	static final boolean method2238(int i, int i_94_) {
		return (i & 0x180) != 0;
	}

	static final boolean method2239(int i, int i_95_) {
		return ((i & 0x60000) != 0 | method2153(i, i_95_) || method2147(i, i_95_) || method2183(i, i_95_));
	}

	static final boolean method2240(int i, int i_96_) {
		return (i & 0x20) != 0;
	}

	static final boolean method2241(int i, int i_97_) {
		return (i & 0x400) != 0;
	}

	static final boolean method2242(int i, int i_98_) {
		return ((i & 0x40000) != 0 | method2194(i, i_98_) || method2147(i, i_98_));
	}

	static final boolean method2243(int i, int i_99_) {
		return ((i & 0x60000) != 0 | method2153(i, i_99_) || method2147(i, i_99_) || method2183(i, i_99_));
	}

	static final boolean method2244(int i, int i_100_) {
		return (i & 0x10) != 0;
	}

	static final boolean method2245(int i, int i_101_) {
		return (i & 0x10000) != 0;
	}
}
