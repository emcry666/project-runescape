/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.zip.Inflater;

public class Class79 {
	Inflater anInflater864;

	public byte[] method1556(byte[] is, int i) {
		RSBuffer class523_sub34 = new RSBuffer(is);
		class523_sub34.offset = 189765723 * (is.length - 4);
		int i_0_ = class523_sub34.method16288(-1907251214);
		byte[] is_1_ = new byte[i_0_];
		class523_sub34.offset = 0;
		decompress(class523_sub34, is_1_, 2144075199);
		return is_1_;
	}

	Class79(int i, int i_2_, int i_3_) {
		/* empty */
	}

	public void method1557(RSBuffer class523_sub34, byte[] is) {
		if (31 != (class523_sub34.buffer[2349011 * class523_sub34.offset]) || -117 != (class523_sub34.buffer[1 + class523_sub34.offset * 2349011]))
			throw new RuntimeException("");
		if (anInflater864 == null)
			anInflater864 = new Inflater(true);
		try {
			anInflater864.setInput(class523_sub34.buffer, 10 + 2349011 * class523_sub34.offset, (class523_sub34.buffer.length - (8 + (10 + (class523_sub34.offset * 2349011)))));
			anInflater864.inflate(is);
		} catch (Exception exception) {
			anInflater864.reset();
			throw new RuntimeException("");
		}
		anInflater864.reset();
	}

	public void decompress(RSBuffer class523_sub34, byte[] is, int i) {
		if (31 != (class523_sub34.buffer[2349011 * class523_sub34.offset]) || -117 != (class523_sub34.buffer[1 + class523_sub34.offset * 2349011]))
			throw new RuntimeException("");
		if (anInflater864 == null)
			anInflater864 = new Inflater(true);
		try {
			anInflater864.setInput(class523_sub34.buffer, 10 + 2349011 * class523_sub34.offset, (class523_sub34.buffer.length - (8 + (10 + (class523_sub34.offset * 2349011)))));
			anInflater864.inflate(is);
		} catch (Exception exception) {
			anInflater864.reset();
			throw new RuntimeException("");
		}
		anInflater864.reset();
	}

	public byte[] method1559(byte[] is) {
		RSBuffer class523_sub34 = new RSBuffer(is);
		class523_sub34.offset = 189765723 * (is.length - 4);
		int i = class523_sub34.method16288(-1012406061);
		byte[] is_4_ = new byte[i];
		class523_sub34.offset = 0;
		decompress(class523_sub34, is_4_, 2118423632);
		return is_4_;
	}

	public byte[] method1560(byte[] is) {
		RSBuffer class523_sub34 = new RSBuffer(is);
		class523_sub34.offset = 189765723 * (is.length - 4);
		int i = class523_sub34.method16288(-698017977);
		byte[] is_5_ = new byte[i];
		class523_sub34.offset = 0;
		decompress(class523_sub34, is_5_, 2110594685);
		return is_5_;
	}

	public void method1561(RSBuffer class523_sub34, byte[] is) {
		if (31 != (class523_sub34.buffer[2349011 * class523_sub34.offset]) || -117 != (class523_sub34.buffer[1 + class523_sub34.offset * 2349011]))
			throw new RuntimeException("");
		if (anInflater864 == null)
			anInflater864 = new Inflater(true);
		try {
			anInflater864.setInput(class523_sub34.buffer, 10 + 2349011 * class523_sub34.offset, (class523_sub34.buffer.length - (8 + (10 + (class523_sub34.offset * 2349011)))));
			anInflater864.inflate(is);
		} catch (Exception exception) {
			anInflater864.reset();
			throw new RuntimeException("");
		}
		anInflater864.reset();
	}

	public Class79() {
		this(-1, 1000000, 1000000);
	}

	static final void decodeMasks(int i) {
		RSBitBuffer buffer = client.aClass116_11058.updateBuffer;
		for (int index = 0; index < client.anInt11052 * 724589571; index++) {
			int npcIndex = client.anIntArray11053[index];
			NPC npc = ((NPC) (((Class523_Sub28) client.aClass14_11047.getFromIndex((long) npcIndex)).anObject10554));
			buffer.readUnsignedShort(-1866787127);
			int mask = buffer.readUnsignedByte(-2080031039);
			if ((mask & 0x2) != 0)
				mask += buffer.readUnsignedByte(-303211068) << 8;
			if ((mask & 0x200) != 0)
				mask += buffer.readUnsignedByte(1000380013) << 16;
			if ((mask & 0x400000) != 0)
				mask += buffer.readUnsignedByte(-672657712) << 24;
			
			
			
			
			
			
			
			//Transformation 0
			if ((mask & 0x1) != 0) {
				if (npc.aClass300_12175.method5492((byte) -64))
					Class297.method5306(npc, (short) -21903);
				npc.method18623((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(buffer.readBigSmart((byte) -62), (byte) 14)), (mask & 0x800000) == 0, (mask & 0x20000) == 0, true, (byte) -12);
				npc.method18344((npc.aClass300_12175.anInt3260 * 1610497933), 2026635853);
				npc.anInt11922 = ((npc.aClass300_12175.anInt3285 * 486429345) << 3) * 876423069;
				if (npc.aClass300_12175.method5492((byte) -79))
					Class451.method7292(npc.aByte10821, npc.screenX[0], npc.screenY[0], 0, null, npc, null, 1956168312);
			}
			
			//Target Information 1
			if (0 != (mask & 0x200000)) {
				int i_9_ = ((buffer.buffer[((buffer.offset += 189765723) * 2349011) - 1]) & 0xff);
				for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
					int i_11_ = buffer.readUnsigned128Byte(2137992688);
					int i_12_ = buffer.readUnsignedIntV2((short) 20762);
					int i_13_ = buffer.readUnsignedMediumV3((byte) 2);
					npc.setTargetInformation(i_11_, i_12_, i_13_, 1812890736);
				}
			}
			
			//Head Icon 2
			if ((mask & 0x40000) != 0) {
				int i_14_ = buffer.readUnsigned128Byte(1428095698);
				int[] is = new int[8];
				short[] is_15_ = new short[8];
				for (int i_16_ = 0; i_16_ < 8; i_16_++) {
					if ((i_14_ & 1 << i_16_) != 0) {
						is[i_16_] = buffer.readBigSmart((byte) -35);
						is_15_[i_16_] = (short) buffer.readUnsignedSmart((short) -32260);
					} else {
						is[i_16_] = -1;
						is_15_[i_16_] = (short) -1;
					}
				}
				npc.headIcon = new Class304(is, is_15_);
			}
			
			//3
			if ((mask & 0x8000000) != 0) {
				npc.aByte11926 = buffer.readByte((short) -966);
				npc.aByte11927 = buffer.readByte((short) -27396);
				npc.aByte11936 = buffer.readByteC(-1270473922);
				npc.aByte11929 = (byte) buffer.readUnsigned128Byte(1266462747);
				npc.colorDelay = ((client.cycles + buffer.readUnsignedShort128((short) 23817)) * -1819254063);
				npc.colorDuration = ((client.cycles + buffer.readUnsignedShortLE((byte) 14)) * -637108827);
			}
			
			//4
			if (0 != (mask & 0x100000)) {
				int i_17_ = (npc.aClass300_12175.anIntArray3256).length;
				int i_18_ = 0;
				if (null != (npc.aClass300_12175.aShortArray3317))
					i_18_ = (npc.aClass300_12175.aShortArray3317).length;
				int i_19_ = 0;
				if ((npc.aClass300_12175.aShortArray3263) != null)
					i_18_ = (npc.aClass300_12175.aShortArray3263).length;
				int i_20_ = buffer.readUnsignedByte(762831065);
				if ((i_20_ & 0x1) != 1) {
					buffer.offset += 379531446;
					int[] is = null;
					if ((i_20_ & 0x2) == 2) {
						is = new int[i_17_];
						for (int i_21_ = 0; i_21_ < i_17_; i_21_++)
							is[i_21_] = buffer.readBigSmart((byte) -49);
					}
					short[] is_22_ = null;
					if (4 == (i_20_ & 0x4)) {
						is_22_ = new short[i_18_];
						for (int i_23_ = 0; i_23_ < i_18_; i_23_++)
							is_22_[i_23_] = (short) buffer.readUnsignedShortLE128(1842765954);
					}
					short[] is_24_ = null;
					if ((i_20_ & 0x8) == 8) {
						is_24_ = new short[i_19_];
						for (int i_25_ = 0; i_25_ < i_19_; i_25_++)
							is_24_[i_25_] = (short) buffer.readUnsignedShort128((short) 15130);
					}
					long l = (long) ((NPC.anInt12165 += -763541499) * 1109148877 - 1);
					new Class302(l, is, null, null, null, is_22_, is_24_);
				}
			}
			
			//Face Entity 5
			if (0 != (mask & 0x10)) {
				npc.faceEntityId = (buffer.readUnsignedShort128((short) 1417) * -1843265241);
				if (65535 == npc.faceEntityId * -344760681)
					npc.faceEntityId = 1843265241;
			}
			
			//6
			if ((mask & 0x4000) != 0) {
				int i_26_ = buffer.readUnsignedByteC(1691865145);
				int[] is = new int[i_26_];
				int[] is_27_ = new int[i_26_];
				for (int i_28_ = 0; i_28_ < i_26_; i_28_++) {
					int i_29_ = buffer.readUnsignedShort(-2094556025);
					if (49152 == (i_29_ & 0xc000)) {
						int i_30_ = buffer.readUnsignedShort(-1428819062);
						is[i_28_] = i_29_ << 16 | i_30_;
					} else
						is[i_28_] = i_29_;
					is_27_[i_28_] = buffer.readUnsignedShortLE128(1709997883);
				}
				npc.method18334(is, is_27_, -312192020);
			}
			
			//Hitbar 7
			if ((mask & 0x80) != 0) {
				int i_31_ = buffer.readUnsignedByte(161916853);
				if (i_31_ > 0) {
					for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
						int i_33_ = -1;
						int i_34_ = -1;
						int i_35_ = -1;
						int i_36_ = buffer.readUnsignedSmart(368514876);
						if (i_36_ == 32767) {
							i_36_ = buffer.readUnsignedSmart(368514876);
							i_34_ = buffer.readUnsignedSmart(368514876);
							i_33_ = buffer.readUnsignedSmart(368514876);
							i_35_ = buffer.readUnsignedSmart(368514876);
						} else if (i_36_ != 32766)
							i_34_ = buffer.readUnsignedSmart(368514876);
						else {
							i_36_ = -1;
							i_34_ = buffer.readUnsignedByte128(339871479);
						}
						int i_37_ = buffer.readUnsignedSmart(368514876);
						npc.method18340(i_36_, i_34_, i_33_, i_35_, (client.cycles), i_37_, -218812152);
					}
				}
				int i_38_ = buffer.readUnsignedByteC(-1342945036);
				if (i_38_ > 0) {
					for (int i_39_ = 0; i_39_ < i_38_; i_39_++) {
						int i_40_ = buffer.readUnsignedSmart(368514876);
						int i_41_ = buffer.readUnsignedSmart(368514876);
						if (32767 != i_41_) {
							int i_42_ = buffer.readUnsignedSmart(368514876);
							int i_43_ = buffer.readUnsigned128Byte(1311458301);
							int i_44_ = (i_41_ > 0 ? buffer.readUnsignedByte(-965962575) : i_43_);
							npc.method18349(i_40_, client.cycles, i_41_, i_42_, i_43_, i_44_, -598699848);
						} else
							npc.method18341(i_40_, 1705836913);
					}
				}
			}
			
			//Target Reticule 8
			if (0 != (mask & 0x10000000)) {
				int i_45_ = buffer.readUnsignedShort(-1452148576);
				int i_46_ = buffer.readUnsignedIntV2((short) 19328);
				if (65535 == i_45_)
					i_45_ = -1;
				int i_47_ = buffer.readUnsignedByte(1468242600);
				int i_48_ = i_47_ & 0x7;
				int i_49_ = i_47_ >> 3 & 0xf;
				if (15 == i_49_)
					i_49_ = -1;
				boolean bool = (i_47_ >> 7 & 0x1) == 1;
				npc.setGraphics(i_45_, i_46_, i_48_, i_49_, bool, 4, -133364751);
			}
			
			//Graphics 2 9
			if (0 != (mask & 0x400)) {
				int i_50_ = buffer.readUnsignedShort128((short) 15663);
				int i_51_ = buffer.readUnsignedIntLE((short) -18989);
				if (65535 == i_50_)
					i_50_ = -1;
				int i_52_ = buffer.readUnsignedByteC(1864762683);
				int i_53_ = i_52_ & 0x7;
				int i_54_ = i_52_ >> 3 & 0xf;
				if (i_54_ == 15)
					i_54_ = -1;
				boolean bool = 1 == (i_52_ >> 7 & 0x1);
				npc.setGraphics(i_50_, i_51_, i_53_, i_54_, bool, 1, 318853182);
			}
			
			//Custom Name 10
			if (0 != (mask & 0x800000)) {
				npc.customName = buffer.readString(-716843961);
				if ("".equals(npc.customName) || (npc.customName.equals(npc.aClass300_12175.name)))
					npc.customName = (npc.aClass300_12175.name);
			}
			
			//11
			if ((mask & 0x10000) != 0) {
				npc.anInterface2_11952.method20(1702722298);
				buffer.offset += 379531446;
				int i_55_ = ((buffer.buffer[((buffer.offset += 189765723) * 2349011) - 1]) & 0xff);
				for (int i_56_ = 0; i_56_ < i_55_; i_56_++) {
					int i_57_ = buffer.readUnsigned128Byte(1834890296);
					BaseVarType class474 = ((BaseVarType) Class334.method5910(BaseVarType.method7746(726055570), i_57_, -77011585));
					Class426 class426 = (Class265.aClass98_Sub1_Sub2_2858.method14344(buffer, class474, (byte) 1));
					npc.anInterface2_11952.method14(-408785679 * class426.anInt4821, class426.anObject4822, -1579515817);
				}
			}
			
			//12
			if ((mask & 0x800) != 0) {
				npc.anInt12166 = buffer.readUnsignedShortLE((byte) 55) * 507824959;
				if (npc.anInt12166 * -511138625 == 65535)
					npc.anInt12166 = -507824959;
			}
			
			//Animation 13
			if (0 != (mask & 0x20)) {
				int[] is = new int[4];
				for (int i_58_ = 0; i_58_ < 4; i_58_++)
					is[i_58_] = buffer.readBigSmart((byte) -73);
				int i_59_ = buffer.readUnsigned128Byte(1654048939);
				Class643.setAnimation(npc, is, i_59_, true, -203589407);
			}
			
			//Force Movement 14
			if (0 != (mask & 0x2000)) {
				npc.anInt11915 = (buffer.readByte((short) -7980) * -25072087);
				npc.anInt11917 = buffer.read128Byte(1542854725) * 245440217;
				npc.anInt11908 = (buffer.readByte((short) -29668) * 1206178097);
				npc.anInt11918 = (buffer.readByteC(-1270473922) * -360111831);
				npc.anInt11940 = (buffer.read128Byte(1542854725) * -2133855093);
				npc.anInt11893 = (buffer.readByteC(-1270473922) * -901004921);
				npc.anInt11954 = (buffer.readUnsignedShortLE128(1504061531) + client.cycles) * -1242459571;
				npc.anInt11932 = (buffer.readUnsignedShort128((short) 31204) + client.cycles) * 1395835143;
				npc.anInt11923 = buffer.readUnsignedShortLE((byte) 94) * 272295045;
				npc.stepsCount = -822788275;
				npc.anInt11946 = 0;
				npc.anInt11915 += (npc.screenX[0] * -25072087);
				npc.anInt11917 += (245440217 * npc.screenY[0]);
				npc.anInt11908 += (npc.screenX[0] * 1206178097);
				npc.anInt11918 += (-360111831 * npc.screenY[0]);
				npc.anInt11940 += npc.aByte10821 * -2133855093;
				npc.anInt11893 += npc.aByte10821 * -901004921;
			}
			
			//Face Direction 15
			if (0 != (mask & 0x40)) {
				npc.anInt12161 = buffer.readUnsignedShortLE128(1688741967) * 1973145421;
				npc.anInt12162 = buffer.readUnsignedShortLE((byte) 38) * -1181559979;
			}
			
			//Graphics 4 16
			if (0 != (mask & 0x4000000)) {
				int i_60_ = buffer.readUnsignedShortLE((byte) 6);
				int i_61_ = buffer.readUnsignedInt((byte) -21);
				if (i_60_ == 65535)
					i_60_ = -1;
				int i_62_ = buffer.readUnsignedByte128(-425391972);
				int i_63_ = i_62_ & 0x7;
				int i_64_ = i_62_ >> 3 & 0xf;
				if (i_64_ == 15)
					i_64_ = -1;
				boolean bool = (i_62_ >> 7 & 0x1) == 1;
				npc.setGraphics(i_60_, i_61_, i_63_, i_64_, bool, 3, 1038503416);
			}
			
			//Combat Level 17
			if (0 != (mask & 0x20000)) {
				npc.customCombatLevel = (buffer.readUnsignedShort(-818822816) * -1497475163);
				if (1167898669 * npc.customCombatLevel == 65535)
					npc.customCombatLevel = 1584612661 * (npc.aClass300_12175.anInt3295);
			}
			
			//Graphics 3 18
			if ((mask & 0x2000000) != 0) {
				int i_65_ = buffer.readUnsignedShortLE128(1803329715);
				int i_66_ = buffer.readUnsignedInt((byte) -65);
				if (65535 == i_65_)
					i_65_ = -1;
				int i_67_ = buffer.readUnsignedByteC(1274528785);
				int i_68_ = i_67_ & 0x7;
				int i_69_ = i_67_ >> 3 & 0xf;
				if (i_69_ == 15)
					i_69_ = -1;
				boolean bool = (i_67_ >> 7 & 0x1) == 1;
				npc.setGraphics(i_65_, i_66_, i_68_, i_69_, bool, 2, 1316973418);
			}
			
			//Force Talk 19
			if (0 != (mask & 0x8))
				npc.method18636(buffer.readString(601219518), 0, 0, -2099094812);
			
			//20
			if (0 != (mask & 0x8000)) {
				int i_70_ = (npc.aClass300_12175.anIntArray3255).length;
				int i_71_ = 0;
				if ((npc.aClass300_12175.aShortArray3317) != null)
					i_71_ = (npc.aClass300_12175.aShortArray3317).length;
				int i_72_ = 0;
				if ((npc.aClass300_12175.aShortArray3263) != null)
					i_72_ = (npc.aClass300_12175.aShortArray3263).length;
				int i_73_ = buffer.readUnsigned128Byte(1449198068);
				if (1 == (i_73_ & 0x1))
					npc.aClass302_12174 = null;
				else {
					buffer.offset += 379531446;
					int[] is = null;
					float[] fs = null;
					int[][] is_74_ = null;
					int[][] is_75_ = null;
					if ((i_73_ & 0x2) == 2) {
						is = new int[i_70_];
						if (16 == (i_73_ & 0x10)) {
							fs = new float[i_70_];
							is_74_ = new int[i_70_][3];
							is_75_ = new int[i_70_][3];
						}
						for (int i_76_ = 0; i_76_ < i_70_; i_76_++) {
							is[i_76_] = buffer.readBigSmart((byte) -12);
							if (16 == (i_73_ & 0x10) && -1 != is[i_76_]) {
								fs[i_76_] = buffer.method16293(-375470481);
								for (int i_77_ = 0; i_77_ < 3; i_77_++)
									is_74_[i_76_][i_77_] = buffer.method16268(337763545);
								for (int i_78_ = 0; i_78_ < 3; i_78_++)
									is_75_[i_76_][i_78_] = buffer.readUnsignedShortLE(-1834933844);
							}
						}
					}
					short[] is_79_ = null;
					if ((i_73_ & 0x4) == 4) {
						is_79_ = new short[i_71_];
						for (int i_80_ = 0; i_80_ < i_71_; i_80_++)
							is_79_[i_80_] = (short) buffer.readUnsignedShortLE((byte) 125);
					}
					short[] is_81_ = null;
					if (8 == (i_73_ & 0x8)) {
						is_81_ = new short[i_72_];
						for (int i_82_ = 0; i_82_ < i_72_; i_82_++)
							is_81_[i_82_] = (short) buffer.readUnsignedShort(-243656084);
					}
					long l = (long) ((NPC.anInt12164 += -233645755) * -1768304243 - 1);
					npc.aClass302_12174 = new Class302(l, is, fs, is_74_, is_75_, is_79_, is_81_);
				}
			}
			
			//21
			if (0 != (mask & 0x1000)) {
				int i_83_ = buffer.readUnsignedByte128(1556341460);
				int[] is = new int[i_83_];
				int[] is_84_ = new int[i_83_];
				int[] is_85_ = new int[i_83_];
				for (int i_86_ = 0; i_86_ < i_83_; i_86_++) {
					int i_87_ = buffer.readBigSmart((byte) -85);
					is[i_86_] = i_87_;
					is_84_[i_86_] = buffer.readUnsigned128Byte(1499276450);
					is_85_[i_86_] = buffer.readUnsignedShortLE128(1467378663);
				}
				Class523.method8667(npc, is, is_84_, is_85_, (byte) 71);
			}
			
			//22
			if (0 != (mask & 0x20000000))//new mask in 876 TODO
				npc.aBool11891 = buffer.readUnsignedByte128(798050249) == 1;
			
			//23
			if ((mask & 0x80000) != 0) {
				buffer.offset += 379531446;
				int i_88_ = ((buffer.buffer[((buffer.offset += 189765723) * 2349011) - 1]) & 0xff);
				for (int i_89_ = 0; i_89_ < i_88_; i_89_++) {
					int i_90_ = buffer.readUnsignedByteC(-574110408);
					BaseVarType class474 = ((BaseVarType) Class334.method5910(BaseVarType.method7746(2041046849), i_90_, -2115939625));
					Class426 class426 = (Class265.aClass98_Sub1_Sub2_2858.method14344(buffer, class474, (byte) 1));
					npc.anInterface2_11952.method14(-408785679 * class426.anInt4821, class426.anObject4822, -2122651574);
				}
			}
			
			//24
			if ((mask & 0x1000000) != 0)
				npc.anInt12176 = (buffer.readUnsignedByteC(1478583236) * -1577334183);
			
			//Graphics 1 25
			if (0 != (mask & 0x4)) {
				int i_91_ = buffer.readUnsignedShort(-1418973609);
				int i_92_ = buffer.readUnsignedInt((byte) -109);
				if (65535 == i_91_)
					i_91_ = -1;
				int i_93_ = buffer.readUnsignedByte(1383834664);
				int i_94_ = i_93_ & 0x7;
				int i_95_ = i_93_ >> 3 & 0xf;
				if (15 == i_95_)
					i_95_ = -1;
				boolean bool = 1 == (i_93_ >> 7 & 0x1);
				npc.setGraphics(i_91_, i_92_, i_94_, i_95_, bool, 0, -1534750927);
			}
		}
	}

	public static void method1563(Class242 class242, InterfaceComponentDefinitions class250, int i) {
		InterfaceComponentDefinitions class250_96_ = Class617.method10090(class242, class250, 2025695974);
		int i_97_;
		int i_98_;
		if (class250_96_ == null) {
			i_97_ = Class170.anInt1833 * 2141365743;
			i_98_ = Class254.anInt2742 * -495986435;
		} else {
			i_97_ = 365308179 * class250_96_.anInt2581;
			i_98_ = class250_96_.anInt2543 * -1759297857;
		}
		Class101.method1798(class250, i_97_, i_98_, false, (short) -22216);
		Class33.method924(class250, i_97_, i_98_, (byte) -44);
	}
}
