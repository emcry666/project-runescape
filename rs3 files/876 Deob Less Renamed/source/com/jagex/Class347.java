/* Class347 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class347 {
	static final boolean method5993(int i, int i_0_) {
		return ((i & 0x70000) != 0 || method6085(i, i_0_) || method6011(i, i_0_));
	}

	static final boolean method5994(int i, int i_1_) {
		return (i & 0x100) != 0;
	}

	static final boolean method5995(int i, int i_2_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method5996(int i, int i_3_) {
		return (i & 0x34) != 0;
	}

	static final boolean method5997(int i, int i_4_) {
		return ((i & 0x70000) != 0 || method5996(i, i_4_) || method6011(i, i_4_));
	}

	static final boolean method5998(int i, int i_5_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method5999(int i, int i_6_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method6000(int i, int i_7_) {
		return (i & 0x100) != 0;
	}

	static final boolean method6001(int i, int i_8_) {
		return ((i & 0x70000) != 0 || method6013(i, i_8_) || method6011(i, i_8_));
	}

	static final boolean method6002(int i, int i_9_) {
		if (!method6008(i, i_9_))
			return false;
		if ((i & 0x9000) != 0 | method5999(i, i_9_) | method5994(i, i_9_))
			return true;
		return (i_9_ & 0x37) == 0 & ((i & 0x2000) != 0 | method5998(i, i_9_) | method6005(i, i_9_));
	}

	static final boolean method6003(int i, int i_10_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method6004(int i, int i_11_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method6005(int i, int i_12_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method6006(int i, int i_13_) {
		return (i & 0x800) != 0;
	}

	static final boolean method6007(int i, int i_14_) {
		return (i & 0x800) != 0 && (i_14_ & 0x37) != 0;
	}

	static final boolean method6008(int i, int i_15_) {
		return (i & 0x800) != 0;
	}

	static final boolean method6009(int i, int i_16_) {
		return (i & 0x800) != 0;
	}

	static final boolean method6010(int i, int i_17_) {
		return (i & 0x800) != 0;
	}

	static final boolean method6011(int i, int i_18_) {
		return ((method6013(i, i_18_) | method6085(i, i_18_) | method5996(i, i_18_)) & method6006(i, i_18_));
	}

	static final boolean method6012(int i, int i_19_) {
		return method6007(i, i_19_) & ((i & 0x2000) != 0 | method5998(i, i_19_) | method6005(i, i_19_));
	}

	static final boolean method6013(int i, int i_20_) {
		return (i & 0x21) != 0;
	}

	static final boolean method6014(int i, int i_21_) {
		return method6047(i, i_21_) & method6009(i, i_21_);
	}

	static final boolean method6015(int i, int i_22_) {
		return method6081(i, i_22_) & method6010(i, i_22_);
	}

	static final boolean method6016(int i, int i_23_) {
		return ((i & 0x70000) != 0 || method5996(i, i_23_) || method6011(i, i_23_));
	}

	static final boolean method6017(int i, int i_24_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method6018(int i, int i_25_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method6019(int i, int i_26_) {
		return method5999(i, i_26_) || method6092(i, i_26_);
	}

	static final boolean method6020(int i, int i_27_) {
		return (i & 0x22) != 0;
	}

	static final boolean method6021(int i, int i_28_) {
		return method5999(i, i_28_) || method6092(i, i_28_);
	}

	static final boolean method6022(int i, int i_29_) {
		return method6047(i, i_29_) || method6014(i, i_29_);
	}

	static final boolean method6023(int i, int i_30_) {
		return (i & 0x180) != 0;
	}

	static final boolean method6024(int i, int i_31_) {
		return (i & 0x20) != 0;
	}

	static final boolean method6025(int i, int i_32_) {
		return method6047(i, i_32_) & method6009(i, i_32_);
	}

	static final boolean method6026(int i, int i_33_) {
		return ((i & 0x60000) != 0 | method6081(i, i_33_) || method6015(i, i_33_));
	}

	static final boolean method6027(int i, int i_34_) {
		return (i & 0x800) != 0 | method6003(i, i_34_) || method6092(i, i_34_);
	}

	static final boolean method6028(int i, int i_35_) {
		return (i & 0x21) != 0;
	}

	static final boolean method6029(int i, int i_36_) {
		return (i & 0x22) != 0;
	}

	static final boolean method6030(int i, int i_37_) {
		boolean bool = ((i_37_ & 0x37) != 0 ? method6012(i, i_37_) : method6092(i, i_37_));
		return (i & 0x10000) != 0 | method5998(i, i_37_) | bool;
	}

	static final boolean method6031(int i, int i_38_) {
		return (i & 0x34) != 0;
	}

	static final boolean method6032(int i, int i_39_) {
		return (i & 0x37) != 0;
	}

	static final boolean method6033(int i, int i_40_) {
		return ((i & 0x70000) != 0 || method5996(i, i_40_) || method6011(i, i_40_));
	}

	static final boolean method6034(int i, int i_41_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method6035(int i, int i_42_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method6036(int i, int i_43_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method6037(int i, int i_44_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method6038(int i, int i_45_) {
		return (i & 0x20) != 0;
	}

	static final boolean method6039(int i, int i_46_) {
		return (i & 0x100) != 0;
	}

	static final boolean method6040(int i, int i_47_) {
		return false;
	}

	static final boolean method6041(int i, int i_48_) {
		return (i & 0x10) != 0;
	}

	static final boolean method6042(int i, int i_49_) {
		return (i & 0x10) != 0;
	}

	static final boolean method6043(int i, int i_50_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method6044(int i, int i_51_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method6045(int i, int i_52_) {
		return ((i & 0x70000) != 0 || method5996(i, i_52_) || method6011(i, i_52_));
	}

	static final boolean method6046(int i, int i_53_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method6047(int i, int i_54_) {
		return false;
	}

	static final boolean method6048(int i, int i_55_) {
		return (i & 0x37) != 0;
	}

	static final boolean method6049(int i, int i_56_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method6050(int i, int i_57_) {
		return (i & 0x800) != 0;
	}

	static final boolean method6051(int i, int i_58_) {
		return (i & 0x800) != 0;
	}

	static final boolean method6052(int i, int i_59_) {
		return (i & 0x800) != 0;
	}

	static final boolean method6053(int i, int i_60_) {
		return (i & 0x800) != 0 && (i_60_ & 0x37) != 0;
	}

	static final boolean method6054(int i, int i_61_) {
		return ((method6013(i, i_61_) | method6085(i, i_61_) | method5996(i, i_61_)) & method6006(i, i_61_));
	}

	static final boolean method6055(int i, int i_62_) {
		return (i & 0x800) != 0;
	}

	static final boolean method6056(int i, int i_63_) {
		if (!method6008(i, i_63_))
			return false;
		if ((i & 0x9000) != 0 | method5999(i, i_63_) | method5994(i, i_63_))
			return true;
		return (i_63_ & 0x37) == 0 & ((i & 0x2000) != 0 | method5998(i, i_63_) | method6005(i, i_63_));
	}

	static final boolean method6057(int i, int i_64_) {
		return (i & 0x800) != 0;
	}

	static final boolean method6058(int i, int i_65_) {
		return ((method6013(i, i_65_) | method6085(i, i_65_) | method5996(i, i_65_)) & method6006(i, i_65_));
	}

	static final boolean method6059(int i, int i_66_) {
		return method6007(i, i_66_) & ((i & 0x2000) != 0 | method5998(i, i_66_) | method6005(i, i_66_));
	}

	static final boolean method6060(int i, int i_67_) {
		return (i & 0x800) != 0 | method6003(i, i_67_) || method6092(i, i_67_);
	}

	static final boolean method6061(int i, int i_68_) {
		return method6007(i, i_68_) & ((i & 0x2000) != 0 | method5998(i, i_68_) | method6005(i, i_68_));
	}

	static final boolean method6062(int i, int i_69_) {
		if (!method6008(i, i_69_))
			return false;
		if ((i & 0x9000) != 0 | method5999(i, i_69_) | method5994(i, i_69_))
			return true;
		return (i_69_ & 0x37) == 0 & ((i & 0x2000) != 0 | method5998(i, i_69_) | method6005(i, i_69_));
	}

	Class347() throws Throwable {
		throw new Error();
	}

	static final boolean method6063(int i, int i_70_) {
		return (i & 0x180) != 0;
	}

	static final boolean method6064(int i, int i_71_) {
		return method6047(i, i_71_) & method6009(i, i_71_);
	}

	static final boolean method6065(int i, int i_72_) {
		return (i & 0x400) != 0;
	}

	static final boolean method6066(int i, int i_73_) {
		return method6081(i, i_73_) & method6010(i, i_73_);
	}

	static final boolean method6067(int i, int i_74_) {
		return method6081(i, i_74_) & method6010(i, i_74_);
	}

	static final boolean method6068(int i, int i_75_) {
		return method6081(i, i_75_) & method6010(i, i_75_);
	}

	static final boolean method6069(int i, int i_76_) {
		return ((i & 0x70000) != 0 || method6013(i, i_76_) || method6011(i, i_76_));
	}

	static final boolean method6070(int i, int i_77_) {
		return ((i & 0x70000) != 0 || method6085(i, i_77_) || method6011(i, i_77_));
	}

	static final boolean method6071(int i, int i_78_) {
		return ((i & 0x70000) != 0 || method6085(i, i_78_) || method6011(i, i_78_));
	}

	static final boolean method6072(int i, int i_79_) {
		return ((i & 0x70000) != 0 || method6085(i, i_79_) || method6011(i, i_79_));
	}

	static final boolean method6073(int i, int i_80_) {
		return (i & 0x800) != 0 && (i_80_ & 0x37) != 0;
	}

	static final boolean method6074(int i, int i_81_) {
		return ((i & 0x70000) != 0 || method5996(i, i_81_) || method6011(i, i_81_));
	}

	static final boolean method6075(int i, int i_82_) {
		return method6047(i, i_82_) || method6014(i, i_82_);
	}

	static final boolean method6076(int i, int i_83_) {
		return ((i & 0x40000) != 0 | method5994(i, i_83_) || method6092(i, i_83_));
	}

	static final boolean method6077(int i, int i_84_) {
		boolean bool = ((i_84_ & 0x37) != 0 ? method6012(i, i_84_) : method6092(i, i_84_));
		return (i & 0x10000) != 0 | method5998(i, i_84_) | bool;
	}

	static final boolean method6078(int i, int i_85_) {
		boolean bool = ((i_85_ & 0x37) != 0 ? method6012(i, i_85_) : method6092(i, i_85_));
		return (i & 0x10000) != 0 | method5998(i, i_85_) | bool;
	}

	static final boolean method6079(int i, int i_86_) {
		boolean bool = ((i_86_ & 0x37) != 0 ? method6012(i, i_86_) : method6092(i, i_86_));
		return (i & 0x10000) != 0 | method5998(i, i_86_) | bool;
	}

	static final boolean method6080(int i, int i_87_) {
		return method5999(i, i_87_) || method6092(i, i_87_);
	}

	static final boolean method6081(int i, int i_88_) {
		return (i & 0x10) != 0;
	}

	static final boolean method6082(int i, int i_89_) {
		return ((i & 0x40000) != 0 | method5994(i, i_89_) || method6092(i, i_89_));
	}

	static final boolean method6083(int i, int i_90_) {
		return ((i & 0x40000) != 0 | method5994(i, i_90_) || method6092(i, i_90_));
	}

	static final boolean method6084(int i, int i_91_) {
		return method6047(i, i_91_) || method6014(i, i_91_);
	}

	static final boolean method6085(int i, int i_92_) {
		return (i & 0x22) != 0;
	}

	static final boolean method6086(int i, int i_93_) {
		return (i & 0x180) != 0;
	}

	static final boolean method6087(int i, int i_94_) {
		return (i & 0x180) != 0;
	}

	static final boolean method6088(int i, int i_95_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method6089(int i, int i_96_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method6090(int i, int i_97_) {
		return (i & 0x400) != 0;
	}

	static final boolean method6091(int i, int i_98_) {
		return ((i & 0x60000) != 0 | method6081(i, i_98_) || method6015(i, i_98_));
	}

	static final boolean method6092(int i, int i_99_) {
		if (!method6008(i, i_99_))
			return false;
		if ((i & 0x9000) != 0 | method5999(i, i_99_) | method5994(i, i_99_))
			return true;
		return (i_99_ & 0x37) == 0 & ((i & 0x2000) != 0 | method5998(i, i_99_) | method6005(i, i_99_));
	}

	static final boolean method6093(int i, int i_100_) {
		return ((i & 0x60000) != 0 | method6081(i, i_100_) || method6015(i, i_100_));
	}

	static final boolean method6094(int i, int i_101_) {
		return ((i & 0x800) != 0 | method6003(i, i_101_) || method6092(i, i_101_));
	}
}
