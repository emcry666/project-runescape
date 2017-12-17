/* Class625 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class Class625 {
	public int anInt8132;
	public int anInt8133 = 833284228;
	public short[][] aShortArrayArray8134;
	public int[] anIntArray8135;
	static final int anInt8136 = 4;
	public int anInt8137;
	public int anInt8138;
	public int anInt8139;
	public int anInt8140;
	public int anInt8141;
	static final int anInt8142 = 7;
	public int anInt8143;
	public int anInt8144;
	public byte aByte8145;
	public short aShort8146;
	public boolean aBool8147;
	public int anInt8148;
	public short[][] aShortArrayArray8149;
	public short[][][] aShortArrayArrayArray8150;
	public int anInt8151;
	static final int anInt8152 = 4;
	public boolean aBool8153;
	public int anInt8154;
	public boolean aBool8155;
	public int anInt8156;
	public int anInt8157;
	public int[] anIntArray8158 = null;
	public boolean aBool8159;
	public int anInt8160;
	public int anInt8161;
	public int anInt8162;
	public int anInt8163;
	static final int anInt8164 = 4;
	public int anInt8165;
	public int anInt8166;
	public int anInt8167;
	public int anInt8168;
	public int anInt8169;
	public int anInt8170;
	public int anInt8171;
	public int anInt8172;
	public int anInt8173;
	public int anInt8174;
	public short[][][] aShortArrayArrayArray8175;
	public int anInt8176;
	public int anInt8177;

	void method10217(RSBuffer class523_sub34) {
		boolean bool = false;
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-663786986);
			if (0 == i)
				break;
			if (i == 1) {
				if (null == anIntArray8158) {
					anInt8133 = 833284228;
					anIntArray8158 = new int[4];
					anIntArray8135 = new int[4];
				}
				for (int i_0_ = 0; i_0_ < anIntArray8158.length; i_0_++) {
					anIntArray8158[i_0_] = class523_sub34.readShort(-1390442961);
					anIntArray8135[i_0_] = class523_sub34.readShort(437952493);
				}
				bool = true;
			} else if (2 == i)
				anInt8169 = class523_sub34.readBigSmart((byte) -48) * -512179755;
			else if (i == 3) {
				anInt8133 = class523_sub34.readUnsignedByte(-172629702) * -865420767;
				anIntArray8158 = new int[anInt8133 * -113292831];
				anIntArray8135 = new int[-113292831 * anInt8133];
			} else if (i == 4)
				aBool8147 = false;
			else if (5 == i)
				anInt8143 = class523_sub34.read24BitInt(1717561019) * -577860671;
			else if (6 == i)
				anInt8144 = class523_sub34.read24BitInt(-1658476086) * 667981307;
			else if (i == 7) {
				aShortArrayArray8149 = new short[10][4];
				aShortArrayArrayArray8150 = new short[10][4][];
				for (int i_1_ = 0; i_1_ < 10; i_1_++) {
					for (int i_2_ = 0; i_2_ < 4; i_2_++) {
						int i_3_ = class523_sub34.readUnsignedShort(-2000136132);
						if (65535 == i_3_)
							i_3_ = -1;
						aShortArrayArray8149[i_1_][i_2_] = (short) i_3_;
						int i_4_ = class523_sub34.readUnsignedShort(-2078494164);
						aShortArrayArrayArray8150[i_1_][i_2_] = new short[i_4_];
						for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
							int i_6_ = class523_sub34.readUnsignedShort(-965344664);
							if (i_6_ == 65535)
								i_6_ = -1;
							aShortArrayArrayArray8150[i_1_][i_2_][i_5_] = (short) i_6_;
						}
					}
				}
			} else if (i == 8)
				aBool8153 = false;
			else if (i == 9)
				anInt8154 = class523_sub34.readUnsignedByte(-546124321) * -544802589;
			else if (10 == i)
				aBool8155 = false;
			else if (11 == i)
				anInt8177 = class523_sub34.readUnsignedByte(604012557) * 1853873231;
			else if (12 == i) {
				anInt8157 = class523_sub34.readUnsignedShort(-1202593685) * -1461121497;
				anInt8132 = class523_sub34.readUnsignedShort(-417275498) * 1716901393;
			} else if (13 == i)
				anInt8139 = class523_sub34.readUnsignedByte(446871215) * -1235220325;
			else if (14 == i)
				anInt8151 = class523_sub34.readUnsignedByte(-364984752) * -1250851255;
			else if (i == 15)
				anInt8140 = class523_sub34.readUnsignedByte(-367622623) * 1683732405;
			else if (16 == i)
				aBool8159 = true;
			else if (i == 17)
				anInt8138 = class523_sub34.readUnsignedInt((byte) -30) * 766865;
			else if (18 == i)
				anInt8161 = class523_sub34.readUnsignedInt((byte) -43) * -358294843;
			else if (i == 19)
				anInt8162 = class523_sub34.readUnsignedInt((byte) -32) * 1460751811;
			else if (i == 20) {
				aShort8146 = (short) class523_sub34.readUnsignedShort(-327983943);
				aByte8145 = (byte) class523_sub34.readUnsignedByte(2028330356);
			} else if (i == 21)
				anInt8141 = class523_sub34.readUnsignedByte(-130504497) * -1621851351;
			else if (i == 22) {
				anInt8163 = class523_sub34.readBigSmart((byte) -115) * 904124279;
				anInt8137 = class523_sub34.readBigSmart((byte) -41) * 602749711;
				anInt8165 = class523_sub34.readBigSmart((byte) 0) * 106513275;
				anInt8166 = class523_sub34.readBigSmart((byte) -1) * 221319331;
				anInt8167 = class523_sub34.readBigSmart((byte) -90) * 1076665381;
				anInt8168 = class523_sub34.readBigSmart((byte) -119) * 1267598825;
				anInt8160 = class523_sub34.readByte((short) -31402) * -1892853551;
				anInt8170 = class523_sub34.readByte((short) -26606) * 460796469;
				anInt8171 = class523_sub34.readBigSmart((byte) -59) * -968451287;
				anInt8172 = class523_sub34.readBigSmart((byte) -42) * 1375174807;
				anInt8173 = class523_sub34.readBigSmart((byte) -104) * 205987751;
				anInt8174 = class523_sub34.readBigSmart((byte) -22) * -1952940527;
				anInt8148 = class523_sub34.readBigSmart((byte) -124) * -1172753833;
				anInt8176 = class523_sub34.readBigSmart((byte) 0) * 442852847;
				anInt8156 = class523_sub34.readBigSmart((byte) -120) * 234793951;
			} else if (i == 23) {
				aShortArrayArray8134 = new short[10][4];
				aShortArrayArrayArray8175 = new short[10][4][];
				for (int i_7_ = 0; i_7_ < 10; i_7_++) {
					for (int i_8_ = 0; i_8_ < 4; i_8_++) {
						int i_9_ = class523_sub34.readUnsignedShort(-1861545597);
						if (65535 == i_9_)
							i_9_ = -1;
						aShortArrayArray8134[i_7_][i_8_] = (short) i_9_;
						int i_10_ = class523_sub34.readUnsignedShort(-1964455533);
						aShortArrayArrayArray8175[i_7_][i_8_] = new short[i_10_];
						for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
							int i_12_ = class523_sub34.readUnsignedShort(-599884079);
							if (65535 == i_12_)
								i_12_ = -1;
							aShortArrayArrayArray8175[i_7_][i_8_][i_11_] = (short) i_12_;
						}
					}
				}
			}
		}
		if (!bool) {
			if (null == anIntArray8158) {
				anInt8133 = 833284228;
				anIntArray8158 = new int[4];
				anIntArray8135 = new int[4];
			}
			for (int i = 0; i < anIntArray8158.length; i++) {
				anIntArray8158[i] = 0;
				anIntArray8135[i] = i * 20;
			}
		}
	}

	void method10218(RSBuffer class523_sub34, byte i) {
		boolean bool = false;
		for (;;) {
			int i_13_ = class523_sub34.readUnsignedByte(-2139420054);
			if (0 == i_13_)
				break;
			if (i_13_ == 1) {
				if (null == anIntArray8158) {
					anInt8133 = 833284228;
					anIntArray8158 = new int[4];
					anIntArray8135 = new int[4];
				}
				for (int i_14_ = 0; i_14_ < anIntArray8158.length; i_14_++) {
					anIntArray8158[i_14_] = class523_sub34.readShort(-1422519759);
					anIntArray8135[i_14_] = class523_sub34.readShort(-1472732287);
				}
				bool = true;
			} else if (2 == i_13_)
				anInt8169 = class523_sub34.readBigSmart((byte) -100) * -512179755;
			else if (i_13_ == 3) {
				anInt8133 = class523_sub34.readUnsignedByte(-669117938) * -865420767;
				anIntArray8158 = new int[anInt8133 * -113292831];
				anIntArray8135 = new int[-113292831 * anInt8133];
			} else if (i_13_ == 4)
				aBool8147 = false;
			else if (5 == i_13_)
				anInt8143 = class523_sub34.read24BitInt(1477889743) * -577860671;
			else if (6 == i_13_)
				anInt8144 = class523_sub34.read24BitInt(-676494093) * 667981307;
			else if (i_13_ == 7) {
				aShortArrayArray8149 = new short[10][4];
				aShortArrayArrayArray8150 = new short[10][4][];
				for (int i_15_ = 0; i_15_ < 10; i_15_++) {
					for (int i_16_ = 0; i_16_ < 4; i_16_++) {
						int i_17_ = class523_sub34.readUnsignedShort(-207698151);
						if (65535 == i_17_)
							i_17_ = -1;
						aShortArrayArray8149[i_15_][i_16_] = (short) i_17_;
						int i_18_ = class523_sub34.readUnsignedShort(-1004505015);
						aShortArrayArrayArray8150[i_15_][i_16_] = new short[i_18_];
						for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
							int i_20_ = class523_sub34.readUnsignedShort(-515637532);
							if (i_20_ == 65535)
								i_20_ = -1;
							aShortArrayArrayArray8150[i_15_][i_16_][i_19_] = (short) i_20_;
						}
					}
				}
			} else if (i_13_ == 8)
				aBool8153 = false;
			else if (i_13_ == 9)
				anInt8154 = class523_sub34.readUnsignedByte(1608063409) * -544802589;
			else if (10 == i_13_)
				aBool8155 = false;
			else if (11 == i_13_)
				anInt8177 = class523_sub34.readUnsignedByte(-387184231) * 1853873231;
			else if (12 == i_13_) {
				anInt8157 = class523_sub34.readUnsignedShort(-61057183) * -1461121497;
				anInt8132 = class523_sub34.readUnsignedShort(-1828458629) * 1716901393;
			} else if (13 == i_13_)
				anInt8139 = class523_sub34.readUnsignedByte(1363980515) * -1235220325;
			else if (14 == i_13_)
				anInt8151 = class523_sub34.readUnsignedByte(1178522026) * -1250851255;
			else if (i_13_ == 15)
				anInt8140 = class523_sub34.readUnsignedByte(-539304887) * 1683732405;
			else if (16 == i_13_)
				aBool8159 = true;
			else if (i_13_ == 17)
				anInt8138 = class523_sub34.readUnsignedInt((byte) -102) * 766865;
			else if (18 == i_13_)
				anInt8161 = class523_sub34.readUnsignedInt((byte) -7) * -358294843;
			else if (i_13_ == 19)
				anInt8162 = class523_sub34.readUnsignedInt((byte) -111) * 1460751811;
			else if (i_13_ == 20) {
				aShort8146 = (short) class523_sub34.readUnsignedShort(-336087817);
				aByte8145 = (byte) class523_sub34.readUnsignedByte(1087455698);
			} else if (i_13_ == 21)
				anInt8141 = class523_sub34.readUnsignedByte(-1804610858) * -1621851351;
			else if (i_13_ == 22) {
				anInt8163 = class523_sub34.readBigSmart((byte) -39) * 904124279;
				anInt8137 = class523_sub34.readBigSmart((byte) -105) * 602749711;
				anInt8165 = class523_sub34.readBigSmart((byte) -51) * 106513275;
				anInt8166 = class523_sub34.readBigSmart((byte) -6) * 221319331;
				anInt8167 = class523_sub34.readBigSmart((byte) -105) * 1076665381;
				anInt8168 = class523_sub34.readBigSmart((byte) -90) * 1267598825;
				anInt8160 = class523_sub34.readByte((short) -27494) * -1892853551;
				anInt8170 = class523_sub34.readByte((short) -11902) * 460796469;
				anInt8171 = class523_sub34.readBigSmart((byte) -6) * -968451287;
				anInt8172 = class523_sub34.readBigSmart((byte) -46) * 1375174807;
				anInt8173 = class523_sub34.readBigSmart((byte) -101) * 205987751;
				anInt8174 = class523_sub34.readBigSmart((byte) -76) * -1952940527;
				anInt8148 = class523_sub34.readBigSmart((byte) -47) * -1172753833;
				anInt8176 = class523_sub34.readBigSmart((byte) -105) * 442852847;
				anInt8156 = class523_sub34.readBigSmart((byte) -16) * 234793951;
			} else if (i_13_ == 23) {
				aShortArrayArray8134 = new short[10][4];
				aShortArrayArrayArray8175 = new short[10][4][];
				for (int i_21_ = 0; i_21_ < 10; i_21_++) {
					for (int i_22_ = 0; i_22_ < 4; i_22_++) {
						int i_23_ = class523_sub34.readUnsignedShort(-737371940);
						if (65535 == i_23_)
							i_23_ = -1;
						aShortArrayArray8134[i_21_][i_22_] = (short) i_23_;
						int i_24_ = class523_sub34.readUnsignedShort(-783962681);
						aShortArrayArrayArray8175[i_21_][i_22_] = new short[i_24_];
						for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
							int i_26_ = class523_sub34.readUnsignedShort(-592751122);
							if (65535 == i_26_)
								i_26_ = -1;
							aShortArrayArrayArray8175[i_21_][i_22_][i_25_] = (short) i_26_;
						}
					}
				}
			}
		}
		if (!bool) {
			if (null == anIntArray8158) {
				anInt8133 = 833284228;
				anIntArray8158 = new int[4];
				anIntArray8135 = new int[4];
			}
			for (int i_27_ = 0; i_27_ < anIntArray8158.length; i_27_++) {
				anIntArray8158[i_27_] = 0;
				anIntArray8135[i_27_] = i_27_ * 20;
			}
		}
	}

	void method10219(RSBuffer class523_sub34) {
		boolean bool = false;
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-105286498);
			if (0 == i)
				break;
			if (i == 1) {
				if (null == anIntArray8158) {
					anInt8133 = 833284228;
					anIntArray8158 = new int[4];
					anIntArray8135 = new int[4];
				}
				for (int i_28_ = 0; i_28_ < anIntArray8158.length; i_28_++) {
					anIntArray8158[i_28_] = class523_sub34.readShort(1878123744);
					anIntArray8135[i_28_] = class523_sub34.readShort(-1326909315);
				}
				bool = true;
			} else if (2 == i)
				anInt8169 = class523_sub34.readBigSmart((byte) -24) * -512179755;
			else if (i == 3) {
				anInt8133 = class523_sub34.readUnsignedByte(1575212029) * -865420767;
				anIntArray8158 = new int[anInt8133 * -113292831];
				anIntArray8135 = new int[-113292831 * anInt8133];
			} else if (i == 4)
				aBool8147 = false;
			else if (5 == i)
				anInt8143 = class523_sub34.read24BitInt(1587861262) * -577860671;
			else if (6 == i)
				anInt8144 = class523_sub34.read24BitInt(1242463280) * 667981307;
			else if (i == 7) {
				aShortArrayArray8149 = new short[10][4];
				aShortArrayArrayArray8150 = new short[10][4][];
				for (int i_29_ = 0; i_29_ < 10; i_29_++) {
					for (int i_30_ = 0; i_30_ < 4; i_30_++) {
						int i_31_ = class523_sub34.readUnsignedShort(-162991154);
						if (65535 == i_31_)
							i_31_ = -1;
						aShortArrayArray8149[i_29_][i_30_] = (short) i_31_;
						int i_32_ = class523_sub34.readUnsignedShort(-1868356111);
						aShortArrayArrayArray8150[i_29_][i_30_] = new short[i_32_];
						for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
							int i_34_ = class523_sub34.readUnsignedShort(-1052755888);
							if (i_34_ == 65535)
								i_34_ = -1;
							aShortArrayArrayArray8150[i_29_][i_30_][i_33_] = (short) i_34_;
						}
					}
				}
			} else if (i == 8)
				aBool8153 = false;
			else if (i == 9)
				anInt8154 = class523_sub34.readUnsignedByte(-1424891431) * -544802589;
			else if (10 == i)
				aBool8155 = false;
			else if (11 == i)
				anInt8177 = class523_sub34.readUnsignedByte(392041085) * 1853873231;
			else if (12 == i) {
				anInt8157 = class523_sub34.readUnsignedShort(-1526223969) * -1461121497;
				anInt8132 = class523_sub34.readUnsignedShort(-1055700388) * 1716901393;
			} else if (13 == i)
				anInt8139 = class523_sub34.readUnsignedByte(-239612440) * -1235220325;
			else if (14 == i)
				anInt8151 = class523_sub34.readUnsignedByte(902396976) * -1250851255;
			else if (i == 15)
				anInt8140 = class523_sub34.readUnsignedByte(-1342218732) * 1683732405;
			else if (16 == i)
				aBool8159 = true;
			else if (i == 17)
				anInt8138 = class523_sub34.readUnsignedInt((byte) -102) * 766865;
			else if (18 == i)
				anInt8161 = class523_sub34.readUnsignedInt((byte) 0) * -358294843;
			else if (i == 19)
				anInt8162 = class523_sub34.readUnsignedInt((byte) -116) * 1460751811;
			else if (i == 20) {
				aShort8146 = (short) class523_sub34.readUnsignedShort(-1434998765);
				aByte8145 = (byte) class523_sub34.readUnsignedByte(-1434702111);
			} else if (i == 21)
				anInt8141 = class523_sub34.readUnsignedByte(-1661820455) * -1621851351;
			else if (i == 22) {
				anInt8163 = class523_sub34.readBigSmart((byte) -50) * 904124279;
				anInt8137 = class523_sub34.readBigSmart((byte) -96) * 602749711;
				anInt8165 = class523_sub34.readBigSmart((byte) -54) * 106513275;
				anInt8166 = class523_sub34.readBigSmart((byte) -71) * 221319331;
				anInt8167 = class523_sub34.readBigSmart((byte) -106) * 1076665381;
				anInt8168 = class523_sub34.readBigSmart((byte) -8) * 1267598825;
				anInt8160 = class523_sub34.readByte((short) -9809) * -1892853551;
				anInt8170 = class523_sub34.readByte((short) -18697) * 460796469;
				anInt8171 = class523_sub34.readBigSmart((byte) 0) * -968451287;
				anInt8172 = class523_sub34.readBigSmart((byte) -87) * 1375174807;
				anInt8173 = class523_sub34.readBigSmart((byte) -19) * 205987751;
				anInt8174 = class523_sub34.readBigSmart((byte) -46) * -1952940527;
				anInt8148 = class523_sub34.readBigSmart((byte) -106) * -1172753833;
				anInt8176 = class523_sub34.readBigSmart((byte) -76) * 442852847;
				anInt8156 = class523_sub34.readBigSmart((byte) -4) * 234793951;
			} else if (i == 23) {
				aShortArrayArray8134 = new short[10][4];
				aShortArrayArrayArray8175 = new short[10][4][];
				for (int i_35_ = 0; i_35_ < 10; i_35_++) {
					for (int i_36_ = 0; i_36_ < 4; i_36_++) {
						int i_37_ = class523_sub34.readUnsignedShort(-1215881313);
						if (65535 == i_37_)
							i_37_ = -1;
						aShortArrayArray8134[i_35_][i_36_] = (short) i_37_;
						int i_38_ = class523_sub34.readUnsignedShort(-1841821515);
						aShortArrayArrayArray8175[i_35_][i_36_] = new short[i_38_];
						for (int i_39_ = 0; i_39_ < i_38_; i_39_++) {
							int i_40_ = class523_sub34.readUnsignedShort(-1290067933);
							if (65535 == i_40_)
								i_40_ = -1;
							aShortArrayArrayArray8175[i_35_][i_36_][i_39_] = (short) i_40_;
						}
					}
				}
			}
		}
		if (!bool) {
			if (null == anIntArray8158) {
				anInt8133 = 833284228;
				anIntArray8158 = new int[4];
				anIntArray8135 = new int[4];
			}
			for (int i = 0; i < anIntArray8158.length; i++) {
				anIntArray8158[i] = 0;
				anIntArray8135[i] = i * 20;
			}
		}
	}

	public Class625(Class472 class472) {
		anIntArray8135 = null;
		anInt8151 = -708437724;
		anInt8139 = -645914004;
		anInt8140 = -1098775053;
		anInt8169 = 512179755;
		anInt8143 = 577860671;
		anInt8144 = -667981307;
		aBool8147 = true;
		aShort8146 = (short) -1;
		aByte8145 = (byte) 0;
		anInt8141 = 1023622148;
		aBool8153 = true;
		anInt8154 = -1089605178;
		aBool8155 = true;
		anInt8177 = 1266652397;
		anInt8157 = 1461121497;
		anInt8132 = -1716901393;
		anInt8138 = -2058588416;
		anInt8161 = -631560901;
		anInt8162 = -988012928;
		anInt8163 = -904124279;
		anInt8137 = -602749711;
		anInt8165 = -106513275;
		anInt8166 = -221319331;
		anInt8167 = -1076665381;
		anInt8168 = -1267598825;
		anInt8171 = 968451287;
		anInt8172 = -1375174807;
		anInt8173 = -205987751;
		anInt8174 = 1952940527;
		anInt8148 = 1172753833;
		anInt8176 = -442852847;
		anInt8156 = -234793951;
		byte[] is = class472.method7721((Class620.aClass620_8065.anInt8073 * 1325648699), -387132909);
		method10218(new RSBuffer(is), (byte) -116);
	}

	static Class2 method10220(ItemDefinitions class12, RSBuffer class523_sub34, int i, int i_41_) {
		Class2 class2 = new Class2(class12);
		int i_42_ = class523_sub34.readUnsignedByte(413163437);
		boolean bool = (i_42_ & 0x1) != 0;
		boolean bool_43_ = 0 != (i_42_ & 0x2);
		boolean bool_44_ = (i_42_ & 0x4) != 0;
		boolean bool_45_ = 0 != (i_42_ & 0x8);
		if (bool) {
			if (i <= 1) {
				class2.anIntArray21[0] = class523_sub34.readUnsignedShort(-2113546873);
				class2.anIntArray22[0] = class523_sub34.readUnsignedShort(-2804878);
			} else {
				class2.anIntArray21[0] = class523_sub34.readBigSmart((byte) -36);
				class2.anIntArray22[0] = class523_sub34.readBigSmart((byte) -72);
			}
			if (-1 != class12.anInt130 * -551995617 || -1 != class12.anInt132 * 565816295) {
				if (i <= 1) {
					class2.anIntArray21[1] = class523_sub34.readUnsignedShort(-1389650257);
					class2.anIntArray22[1] = class523_sub34.readUnsignedShort(-884570268);
				} else {
					class2.anIntArray21[1] = class523_sub34.readBigSmart((byte) -33);
					class2.anIntArray22[1] = class523_sub34.readBigSmart((byte) -25);
				}
			}
			if (-1 != 1732973397 * class12.anInt133 || class12.anInt134 * -2015837427 != -1) {
				if (i <= 1) {
					class2.anIntArray21[2] = class523_sub34.readUnsignedShort(-1481029774);
					class2.anIntArray22[2] = class523_sub34.readUnsignedShort(-334759614);
				} else {
					class2.anIntArray21[2] = class523_sub34.readBigSmart((byte) -111);
					class2.anIntArray22[2] = class523_sub34.readBigSmart((byte) -62);
				}
			}
		}
		if (bool_43_) {
			if (i <= 1) {
				class2.anIntArray23[0] = class523_sub34.readUnsignedShort(-202227539);
				class2.anIntArray20[0] = class523_sub34.readUnsignedShort(-982440751);
			} else {
				class2.anIntArray23[0] = class523_sub34.readBigSmart((byte) -127);
				class2.anIntArray20[0] = class523_sub34.readBigSmart((byte) -15);
			}
			if (-1 != 1731276927 * class12.anInt100 || -1 != -1123046437 * class12.anInt144) {
				if (i <= 1) {
					class2.anIntArray23[1] = class523_sub34.readUnsignedShort(-1337581261);
					class2.anIntArray20[1] = class523_sub34.readUnsignedShort(-1189236858);
				} else {
					class2.anIntArray23[1] = class523_sub34.readBigSmart((byte) -108);
					class2.anIntArray20[1] = class523_sub34.readBigSmart((byte) -9);
				}
			}
		}
		if (bool_44_) {
			int i_46_ = class523_sub34.readUnsignedShort(-1401208865);
			int[] is = new int[4];
			is[0] = i_46_ & 0xf;
			is[1] = i_46_ >> 4 & 0xf;
			is[2] = i_46_ >> 8 & 0xf;
			is[3] = i_46_ >> 12 & 0xf;
			for (int i_47_ = 0; i_47_ < 4; i_47_++) {
				if (is[i_47_] != 15)
					class2.aShortArray25[is[i_47_]] = (short) class523_sub34.readUnsignedShort(-228753073);
			}
		}
		if (bool_45_) {
			int i_48_ = class523_sub34.readUnsignedByte(-1136033102);
			int[] is = new int[2];
			is[0] = i_48_ & 0xf;
			is[1] = i_48_ >> 4 & 0xf;
			for (int i_49_ = 0; i_49_ < 2; i_49_++) {
				if (is[i_49_] != 15)
					class2.aShortArray26[is[i_49_]] = (short) class523_sub34.readUnsignedShort(-2042491672);
			}
		}
		return class2;
	}

	static void method10221(int i) {
		if (-15297265 * Class95.anInt1162 < 102)
			Class95.anInt1162 += 263347098;
		if (-1 != Class95.anInt1176 * 1006265677 && (7528894964442540785L * Class687_Sub24.aLong10885 < TimeUtils.getCurrentTimeMilliseconds(1516375036))) {
			for (int i_50_ = 1006265677 * Class95.anInt1176; i_50_ < Class53_Sub6.aStringArray10968.length; i_50_++) {
				if (Class53_Sub6.aStringArray10968[i_50_].startsWith("pause")) {
					int i_51_ = 5;
					try {
						i_51_ = Integer.parseInt(Class53_Sub6.aStringArray10968[i_50_].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class485.method7932(new StringBuilder().append("Pausing for ").append(i_51_).append(" seconds...").toString(), (byte) 1);
					Class95.anInt1176 = (1 + i_50_) * -1190962299;
					Class687_Sub24.aLong10885 = (TimeUtils.getCurrentTimeMilliseconds(1516375036) + (long) (1000 * i_51_)) * 1332324763258881553L;
					return;
				}
				Class95.aString1171 = Class53_Sub6.aStringArray10968[i_50_];
				Class628.method10314(false, (byte) -1);
			}
			Class95.anInt1176 = 1190962299;
		}
		if (203206237 * client.anInt11028 != 0) {
			Class95.anInt1177 -= 1825767507 * client.anInt11028;
			if (-165903669 * Class95.anInt1177 >= Class95.anInt1179 * 1497187345)
				Class95.anInt1177 = -842412781 * Class95.anInt1179 - -149335325;
			if (-165903669 * Class95.anInt1177 < 0)
				Class95.anInt1177 = 0;
			client.anInt11028 = 0;
		}
		for (int i_52_ = 0; i_52_ < -1614747943 * client.anInt11030; i_52_++) {
			Interface64 interface64 = client.anInterface64Array11031[i_52_];
			int i_53_ = interface64.method390(-1886611859);
			char c = interface64.method425((byte) -1);
			int i_54_ = interface64.method426(917170940);
			if (i_53_ == 84)
				Class628.method10314(false, (byte) -1);
			if (i_53_ == 80)
				Class628.method10314(true, (byte) -1);
			else if (66 == i_53_ && (i_54_ & 0x4) != 0) {
				if (NetworkStream.aClipboard7479 != null) {
					String string = "";
					for (int i_55_ = Class95.aStringArray1165.length - 1; i_55_ >= 0; i_55_--) {
						if (null != Class95.aStringArray1165[i_55_] && Class95.aStringArray1165[i_55_].length() > 0)
							string = new StringBuilder().append(string).append(Class95.aStringArray1165[i_55_]).append('\n').toString();
					}
					NetworkStream.aClipboard7479.setContents(new StringSelection(string), null);
				}
			} else if (67 == i_53_ && (i_54_ & 0x4) != 0) {
				if (NetworkStream.aClipboard7479 != null) {
					try {
						Transferable transferable = NetworkStream.aClipboard7479.getContents(null);
						if (null != transferable) {
							String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
							if (string != null) {
								String[] strings = Class194_Sub13.method15512(string, '\n', (byte) 9);
								Class61.method1420(strings, -216636385);
							}
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
			} else if (i_53_ == 85 && 16594559 * Class95.anInt1173 > 0) {
				Class95.aString1171 = new StringBuilder().append(Class95.aString1171.substring(0, Class95.anInt1173 * 16594559 - 1)).append(Class95.aString1171.substring(16594559 * Class95.anInt1173)).toString();
				Class95.anInt1173 -= 331909503;
			} else if (i_53_ == 101 && (16594559 * Class95.anInt1173 < Class95.aString1171.length()))
				Class95.aString1171 = new StringBuilder().append(Class95.aString1171.substring(0, 16594559 * Class95.anInt1173)).append(Class95.aString1171.substring(1 + Class95.anInt1173 * 16594559)).toString();
			else if (96 == i_53_ && 16594559 * Class95.anInt1173 > 0)
				Class95.anInt1173 -= 331909503;
			else if (i_53_ == 97 && (Class95.anInt1173 * 16594559 < Class95.aString1171.length()))
				Class95.anInt1173 += 331909503;
			else if (102 == i_53_)
				Class95.anInt1173 = 0;
			else if (103 == i_53_)
				Class95.anInt1173 = Class95.aString1171.length() * 331909503;
			else if (i_53_ == 104 && (-1422624261 * Class95.anInt1166 < Class95.aStringArray1165.length)) {
				Class95.anInt1166 += 234858803;
				Class246.method4388(-1189628840);
				Class95.anInt1173 = Class95.aString1171.length() * 331909503;
			} else if (i_53_ == 105 && Class95.anInt1166 * -1422624261 > 0) {
				Class95.anInt1166 -= 234858803;
				Class246.method4388(-1189628840);
				Class95.anInt1173 = Class95.aString1171.length() * 331909503;
			} else if (Class615.method10068(c, 530847186) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
				Class95.aString1171 = new StringBuilder().append(Class95.aString1171.substring(0, 16594559 * Class95.anInt1173)).append(client.anInterface64Array11031[i_52_].method425((byte) -51)).append(Class95.aString1171.substring(Class95.anInt1173 * 16594559)).toString();
				Class95.anInt1173 += 331909503;
			}
		}
		client.anInt11030 = 0;
		client.anInt11184 = 0;
		if (Class241.anIntArray2455.length != 2141365743 * Class170.anInt1833 >> 1)
			Class241.anIntArray2455 = new int[2141365743 * Class170.anInt1833 >> 1];
		for (int i_56_ = 0; i_56_ < 100; i_56_++) {
			Class15.anIntArray184[i_56_] += Class318.anIntArray3430[i_56_];
			if (Class15.anIntArray184[i_56_] >> 4 >= 350) {
				int i_57_ = Class95.anIntArray1170[i_56_] >> 4;
				int i_58_ = Class95.anIntArray1170[i_56_] & 0xf;
				i_57_ += ((Class433.anIntArray4880[i_58_ * 1023 + 64 * (350 + (i_57_ & 0x40)) & 0x3fff]) >> 10);
				i_57_ >>= 1;
				for (int i_59_ = -3; i_59_ <= 3; i_59_++) {
					if (i_57_ + i_59_ >= 0 && i_59_ + i_57_ < Class241.anIntArray2455.length)
						Class241.anIntArray2455[i_59_ + i_57_] += 4 - Math.abs(i_59_);
				}
				Class95.anIntArray1170[i_56_] = ((int) (Math.random() * (double) (Class170.anInt1833 * 2141365743)) << 4) + (int) (Math.random() * 15.0);
				Class15.anIntArray184[i_56_] = 0;
				Class338.anIntArray3574[i_56_] = (int) (Math.random() * 102.0) + 51;
				Class318.anIntArray3430[i_56_] = 8 + (int) (Math.random() * 48.0);
			}
		}
		Class676_Sub1.method16781(-1240802613);
	}

	static final void method10222(Class178 class178, Class172 class172, byte i) {
		if (100 != Class534_Sub1.anInt10795 * -1547856073 && null != Class534_Sub1.aClass523_Sub27_Sub17_7144) {
			TimeUtils.getCurrentTimeMilliseconds(1516375036);
			TimeUtils.getCurrentTimeMilliseconds(1516375036);
			if (-1547856073 * Class534_Sub1.anInt10795 < 10) {
				for (int i_60_ = 0; i_60_ < Class534_Sub1.aClass164ArrayArray10792.length; i_60_++) {
					for (int i_61_ = 0; i_61_ < (Class534_Sub1.aClass164ArrayArray10792[i_60_]).length; i_61_++) {
						Class523_Sub8.aClass472_10406.method7650((Class534_Sub1.aClass624_7158.anIntArrayArray8123[i_60_][i_61_]), 598876360);
						Class272.aClass472_2886.method7650((Class534_Sub1.aClass624_7158.anIntArrayArray8123[i_60_][i_61_]), -1976003673);
					}
				}
				if (!Class534_Sub1.aClass472_7146.method7716(Class534_Sub1.aClass523_Sub27_Sub17_7144.aString11824, -521194827)) {
					Class534_Sub1.anInt10795 = (Class90.aClass472_891.method7671((Class534_Sub1.aClass523_Sub27_Sub17_7144.aString11824), 1666919970)) / 10 * 1356975751;
					return;
				}
				Class534_Sub1.anInt10795 = 684855622;
			}
			if (-1547856073 * Class534_Sub1.anInt10795 == 10) {
				Class534_Sub1.anInt7168 = (Class534_Sub1.aClass523_Sub27_Sub17_7144.anInt11830 * -332434647) >> 6 << 6;
				Class534_Sub1.anInt7159 = (Class534_Sub1.aClass523_Sub27_Sub17_7144.anInt11832 * 1023249187) >> 6 << 6;
				Class534_Sub1.anInt7160 = ((Class534_Sub1.aClass523_Sub27_Sub17_7144.anInt11828 * -267562095) >> 6 << 6) - Class534_Sub1.anInt7168 + 64;
				Class534_Sub1.anInt7138 = 64 + ((-1856765435 * (Class534_Sub1.aClass523_Sub27_Sub17_7144.anInt11833) >> 6 << 6) - Class534_Sub1.anInt7159);
				int[] is = new int[3];
				int i_62_ = -1;
				int i_63_ = -1;
				Class437 class437 = (Class241.player.method10569().aClass437_4862);
				Class592 class592 = client.aClass505_11019.method8242(55538902);
				if (Class534_Sub1.aClass523_Sub27_Sub17_7144.method18193(Class241.player.aByte10821, (class592.localX * 235453015 + ((int) class437.aFloat4903 >> 9)), (((int) class437.aFloat4905 >> 9) + class592.localY * 1704054549), is, (short) -17791)) {
					i_62_ = is[1] - Class534_Sub1.anInt7168;
					i_63_ = is[2] - Class534_Sub1.anInt7159;
				}
				if (!Class534_Sub1.aBool10783 && i_62_ >= 0 && i_62_ < Class534_Sub1.anInt7160 && i_63_ >= 0 && i_63_ < Class534_Sub1.anInt7138) {
					i_62_ += (int) (Math.random() * 10.0) - 5;
					i_63_ += (int) (Math.random() * 10.0) - 5;
					Class575.anInt7691 = i_62_ * 367905367;
					Class597.anInt7835 = -1099820943 * i_63_;
				} else if (Class534_Sub1.anInt10781 * -2025252731 != -1 && -1974716849 * Class534_Sub1.anInt10782 != -1) {
					Class534_Sub1.aClass523_Sub27_Sub17_7144.method18189(Class534_Sub1.anInt10781 * -2025252731, -1974716849 * Class534_Sub1.anInt10782, is, (byte) 10);
					if (null != is) {
						Class575.anInt7691 = 367905367 * (is[1] - Class534_Sub1.anInt7168);
						Class597.anInt7835 = (is[2] - Class534_Sub1.anInt7159) * -1099820943;
					}
					Class534_Sub1.anInt10782 = -349380783;
					Class534_Sub1.anInt10781 = 1743314867;
					Class534_Sub1.aBool10783 = false;
				} else {
					Class534_Sub1.aClass523_Sub27_Sub17_7144.method18189((Class534_Sub1.aClass523_Sub27_Sub17_7144.anInt11827 * -843169111) >> 14 & 0x3fff, -843169111 * (Class534_Sub1.aClass523_Sub27_Sub17_7144.anInt11827) & 0x3fff, is, (byte) 10);
					Class575.anInt7691 = 367905367 * (is[1] - Class534_Sub1.anInt7168);
					Class597.anInt7835 = (is[2] - Class534_Sub1.anInt7159) * -1099820943;
				}
				if ((-826777219 * Class534_Sub1.aClass523_Sub27_Sub17_7144.anInt11829) == 25) {
					Class534_Sub1.aFloat7154 = 2.0F;
					Class534_Sub1.aFloat7155 = 2.0F;
				} else if (-826777219 * (Class534_Sub1.aClass523_Sub27_Sub17_7144.anInt11829) == 37) {
					Class534_Sub1.aFloat7154 = 3.0F;
					Class534_Sub1.aFloat7155 = 3.0F;
				} else if ((Class534_Sub1.aClass523_Sub27_Sub17_7144.anInt11829 * -826777219) == 50) {
					Class534_Sub1.aFloat7154 = 4.0F;
					Class534_Sub1.aFloat7155 = 4.0F;
				} else if (75 == -826777219 * (Class534_Sub1.aClass523_Sub27_Sub17_7144.anInt11829)) {
					Class534_Sub1.aFloat7154 = 6.0F;
					Class534_Sub1.aFloat7155 = 6.0F;
				} else if (-826777219 * (Class534_Sub1.aClass523_Sub27_Sub17_7144.anInt11829) == 100) {
					Class534_Sub1.aFloat7154 = 8.0F;
					Class534_Sub1.aFloat7155 = 8.0F;
				} else if (200 == (Class534_Sub1.aClass523_Sub27_Sub17_7144.anInt11829) * -826777219) {
					Class534_Sub1.aFloat7154 = 16.0F;
					Class534_Sub1.aFloat7155 = 16.0F;
				} else {
					Class534_Sub1.aFloat7154 = 8.0F;
					Class534_Sub1.aFloat7155 = 8.0F;
				}
				Class534_Sub1.anInt7151 = (int) Class534_Sub1.aFloat7155 >> 1;
				Class534_Sub1.aByteArrayArrayArray7137 = Class306.method5555(Class534_Sub1.anInt7151, (byte) 77);
				JS5ArchiveReference.method1233((byte) -111);
				Class534_Sub1.method8859();
				Class629.aClass708_8229 = new Class708();
				Class534_Sub1.anInt7161 += (int) (Math.random() * 5.0) - 2;
				if (Class534_Sub1.anInt7161 < -8)
					Class534_Sub1.anInt7161 = -8;
				if (Class534_Sub1.anInt7161 > 8)
					Class534_Sub1.anInt7161 = 8;
				Class534_Sub1.anInt7149 += (int) (Math.random() * 5.0) - 2;
				if (Class534_Sub1.anInt7149 < -16)
					Class534_Sub1.anInt7149 = -16;
				if (Class534_Sub1.anInt7149 > 16)
					Class534_Sub1.anInt7149 = 16;
				Class534_Sub1.method8905(class172, Class534_Sub1.anInt7161 >> 2 << 10, Class534_Sub1.anInt7149 >> 1);
				Class534_Sub1.aClass53_Sub1_7206.method17139(1024, 256, -794484606);
				Class534_Sub1.aClass53_Sub14_7185.method17212(256, 256, -2083363148);
				Class534_Sub1.aClass53_Sub18_7190.method1292(4096, (byte) 67);
				Class539.aClass53_Sub3_7213.method1292(256, (byte) -5);
				Class534_Sub1.anInt10795 = 1369711244;
			} else if (Class534_Sub1.anInt10795 * -1547856073 == 20) {
				if (Class534_Sub1.aBool7193) {
					if (Class534_Sub1.method8818(class178, Class534_Sub1.anInt7161, Class534_Sub1.anInt7149, Class534_Sub1.aBool7193))
						Class534_Sub1.anInt10795 = -185833564;
				} else {
					Class469.method7613(true, -254137070);
					Class534_Sub1.method8818(class178, Class534_Sub1.anInt7161, Class534_Sub1.anInt7149, Class534_Sub1.aBool7193);
					Class534_Sub1.anInt10795 = -185833564;
					Class469.method7613(true, -679183399);
					Class268.method4898(765483496);
				}
			} else if (-1547856073 * Class534_Sub1.anInt10795 == 60) {
				if (Class534_Sub1.aClass472_7146.method7642(Class534_Sub1.aClass523_Sub27_Sub17_7144.aString11824, (byte) 17)) {
					if (!Class534_Sub1.aClass472_7146.method7716((Class534_Sub1.aClass523_Sub27_Sub17_7144.aString11824), -2125769499))
						return;
					Class534_Sub1.aClass528_7156 = Class478.method7891(Class534_Sub1.aClass472_7146, (Class534_Sub1.aClass523_Sub27_Sub17_7144.aString11824), client.aBool11157, -2046598281);
				} else
					Class534_Sub1.aClass528_7156 = new Class528(0);
				Class534_Sub1.method8822();
				Class534_Sub1.anInt10795 = 499022058;
				Class469.method7613(true, 2129923383);
				Class268.method4898(765483496);
			} else if (-1547856073 * Class534_Sub1.anInt10795 >= 70) {
				for (int i_64_ = 0; i_64_ < 3; i_64_++) {
					for (int i_65_ = 0; i_65_ < 5; i_65_++) {
						if (null == (Class534_Sub1.aClass164ArrayArray10792[i_64_][i_65_]) || (Class534_Sub1.aClass10ArrayArray10785[i_64_][i_65_]) == null) {
							Class534_Sub1.aClass164ArrayArray10792[i_64_][i_65_] = ((Class164) (Class491.aClass423_5536.method6689(client.anInterface50_11044, (Class534_Sub1.aClass624_7158.anIntArrayArray8123[i_64_][i_65_]), true, true, -1854433616)));
							Class534_Sub1.aClass10ArrayArray10785[i_64_][i_65_] = (Class491.aClass423_5536.method6688(client.anInterface50_11044, (Class534_Sub1.aClass624_7158.anIntArrayArray8123[i_64_][i_65_]), (byte) -64));
							if ((Class534_Sub1.aClass164ArrayArray10792[i_64_][i_65_]) != null && (Class534_Sub1.aClass10ArrayArray10785[i_64_][i_65_]) != null)
								Class534_Sub1.anInt10795 += -224040043;
							else
								return;
						}
					}
				}
				Class534_Sub1.anInt10795 = -1741378372;
				System.gc();
			}
		}
	}

	public static void method10223(int i, short i_66_) {
		Class25 class25 = (Class25) Class534_Sub1.aHashMap10786.get(Integer.valueOf(i));
		if (class25 == null)
			class25 = new Class25();
		class25.anInt246 = Class534_Sub1.anInt10788 * 649231935;
		class25.anInt245 = -2045175827 * Class534_Sub1.anInt10789;
		Class534_Sub1.aHashMap10786.put(Integer.valueOf(i), class25);
	}
}
