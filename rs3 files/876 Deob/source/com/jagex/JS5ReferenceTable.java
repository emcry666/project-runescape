/* Class460 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class JS5ReferenceTable {
	int[] anIntArray5097;
	int anInt5098;
	byte[] whirlpool;
	int[][] anIntArrayArray5100;
	int validArchivesCount;
	int[] anIntArray5102;
	int[] crcArray;
	Class283 aClass283_5104;
	int archives;
	int[] anIntArray5106;
	int[] hashArray;
	byte[][] whirlpoolArray;
	int[] validArchiveIds;
	int[] compressedArray;
	int[] uncompressedArray;
	int[] size;
	int[][] anIntArrayArray5113;
	int revision;
	Class283[] aClass283Array5115;
	static final int anInt5116 = 7;

	void decodeHeader(byte[] data, byte i) {
		RSBuffer buffer = new RSBuffer(Class558.decompress(data, 1829108753));
		int protocol = buffer.readUnsignedByte(-1487671675);
		if (protocol < 5 || protocol > 7) {
			throw new RuntimeException();
		}
		if (protocol >= 6) {
			revision = buffer.readUnsignedInt((byte) -117) * 162910219;
		} else {
			revision = 0;
		}
		int hash = buffer.readUnsignedByte(653514236);
		boolean isNamed = (hash & 0x1) != 0;
		boolean usesWhirlpool = 0 != (hash & 0x2);
		boolean flag4 = 0 != (hash & 0x4);
		boolean flag8 = 0 != (hash & 0x8);
		if (protocol >= 7)
			validArchivesCount = buffer.readBigSmart(2021508490) * 342435449;
		else
			validArchivesCount = buffer.readUnsignedShort(-1024256330) * 342435449;
		int lastArchiveId = 0;
		int biggestArchiveId = -1;
		validArchiveIds = new int[validArchivesCount * 672162761];
		if (protocol >= 7) {
			for (int index = 0; index < 672162761 * validArchivesCount; index++) {
				validArchiveIds[index] = lastArchiveId += buffer.readBigSmart(1971606873);
				if (validArchiveIds[index] > biggestArchiveId)
					biggestArchiveId = validArchiveIds[index];
			}
		} else {
			for (int index = 0; index < validArchivesCount * 672162761; index++) {
				validArchiveIds[index] = lastArchiveId += buffer.readUnsignedShort(-8982461);
				if (validArchiveIds[index] > biggestArchiveId)
					biggestArchiveId = validArchiveIds[index];
			}
		}
		archives = 2014493443 * (biggestArchiveId + 1);
		anIntArray5102 = new int[archives * -132118613];
		if (flag8)
			hashArray = new int[archives * -132118613];
		if (usesWhirlpool)
			whirlpoolArray = new byte[archives * -132118613][];
		anIntArray5097 = new int[archives * -132118613];
		size = new int[archives * -132118613];
		anIntArrayArray5100 = new int[archives * -132118613][];
		anIntArray5106 = new int[archives * -132118613];
		if (isNamed) {
			crcArray = new int[-132118613 * archives];
			for (int index = 0; index < archives * -132118613; index++)
				crcArray[index] = -1;
			for (int index = 0; index < 672162761 * validArchivesCount; index++)
				crcArray[validArchiveIds[index]] = buffer.readUnsignedInt((byte) -20);
			aClass283_5104 = new Class283(crcArray);
		}
		for (int index = 0; index < 672162761 * validArchivesCount; index++)
			anIntArray5102[validArchiveIds[index]] = buffer.readUnsignedInt((byte) -12);
		if (flag8) {
			for (int index = 0; index < validArchivesCount * 672162761; index++)
				hashArray[index] = buffer.readUnsignedInt((byte) -96);
		}
		if (usesWhirlpool) {
			for (int index = 0; index < 672162761 * validArchivesCount; index++) {
				byte[] whirlpool = new byte[64];
				buffer.readBytes(whirlpool, 0, 64, (byte) 43);
				whirlpoolArray[validArchiveIds[index]] = whirlpool;
			}
		}
		if (flag4) {
			compressedArray = new int[archives * -132118613];
			uncompressedArray = new int[archives * -132118613];
			for (int index = 0; index < 672162761 * validArchivesCount; index++) {
				compressedArray[validArchiveIds[index]] = buffer.readUnsignedInt((byte) -83);
				uncompressedArray[validArchiveIds[index]] = buffer.readUnsignedInt((byte) -125);
			}
		}
		for (int index = 0; index < 672162761 * validArchivesCount; index++)
			anIntArray5097[validArchiveIds[index]] = buffer.readUnsignedInt((byte) -122);
		if (protocol >= 7) {
			for (int index = 0; index < validArchivesCount * 672162761; index++)
				size[validArchiveIds[index]] = buffer.readBigSmart(2094552176);
			for (int index = 0; index < 672162761 * validArchivesCount; index++) {
				int archive = validArchiveIds[index];
				int i_56_ = size[archive];
				lastArchiveId = 0;
				int biggestFileId = -1;
				anIntArrayArray5100[archive] = new int[i_56_];
				for (int i_58_ = 0; i_58_ < i_56_; i_58_++) {
					int i_59_ = (anIntArrayArray5100[archive][i_58_] = lastArchiveId += buffer.readBigSmart(1944178785));
					if (i_59_ > biggestFileId)
						biggestFileId = i_59_;
				}
				anIntArray5106[archive] = 1 + biggestFileId;
				if (1 + biggestFileId == i_56_)
					anIntArrayArray5100[archive] = null;
			}
		} else {
			for (int i_60_ = 0; i_60_ < 672162761 * validArchivesCount; i_60_++)
				size[validArchiveIds[i_60_]] = buffer.readUnsignedShort(-1930793577);
			for (int i_61_ = 0; i_61_ < 672162761 * validArchivesCount; i_61_++) {
				int i_62_ = validArchiveIds[i_61_];
				int i_63_ = size[i_62_];
				lastArchiveId = 0;
				int i_64_ = -1;
				anIntArrayArray5100[i_62_] = new int[i_63_];
				for (int i_65_ = 0; i_65_ < i_63_; i_65_++) {
					int i_66_ = (anIntArrayArray5100[i_62_][i_65_] = lastArchiveId += buffer.readUnsignedShort(-1932766621));
					if (i_66_ > i_64_)
						i_64_ = i_66_;
				}
				anIntArray5106[i_62_] = 1 + i_64_;
				if (1 + i_64_ == i_63_)
					anIntArrayArray5100[i_62_] = null;
			}
		}
		if (isNamed) {
			anIntArrayArray5113 = new int[1 + biggestArchiveId][];
			aClass283Array5115 = new Class283[biggestArchiveId + 1];
			for (int i_67_ = 0; i_67_ < 672162761 * validArchivesCount; i_67_++) {
				int i_68_ = validArchiveIds[i_67_];
				int i_69_ = size[i_68_];
				anIntArrayArray5113[i_68_] = new int[anIntArray5106[i_68_]];
				for (int i_70_ = 0; i_70_ < anIntArray5106[i_68_]; i_70_++)
					anIntArrayArray5113[i_68_][i_70_] = -1;
				for (int i_71_ = 0; i_71_ < i_69_; i_71_++) {
					int i_72_;
					if (anIntArrayArray5100[i_68_] != null)
						i_72_ = anIntArrayArray5100[i_68_][i_71_];
					else
						i_72_ = i_71_;
					anIntArrayArray5113[i_68_][i_72_] = buffer.readUnsignedInt((byte) -25);
				}
				aClass283Array5115[i_68_] = new Class283(anIntArrayArray5113[i_68_]);
			}
		}
	}

	JS5ReferenceTable(byte[] is, int i, byte[] is_145_) {
		anInt5098 = Class590.method9774(is, is.length, -560533886) * 266609013;
		if (-905910563 * anInt5098 != i)
			throw new RuntimeException();
		if (is_145_ != null) {
			if (is_145_.length != 64)
				throw new RuntimeException();
			whirlpool = Class202.getHash(is, 0, is.length, -1413428846);
			for (int index = 0; index < 64; index++) {
				if (whirlpool[index] != is_145_[index])
					throw new RuntimeException();
			}
		}
		decodeHeader(is, (byte) -48);
	}

	static final void method7501(Class669 class669, byte i) {
		int i_147_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_147_, -859298043);
		Class242 class242 = Class31.aClass242Array302[i_147_ >> 16];
		Class170.method2892(class250, class242, class669, PacketsDecoder.aClass233_2368, (byte) 0);
	}

	static void method7502(int i, int i_148_, InterfaceComponentDefinitions class250, byte i_149_) {
		int i_150_ = i + 365308179 * class250.anInt2581;
		int i_151_ = i_148_ + 15;
		if (client.aBool11096) {
			int i_152_ = -256;
			if (client.anInt5662 * -1307622225 < 20)
				i_152_ = -65536;
			Class10.aClass164_83.method2596(new StringBuilder().append("Fps:").append(client.anInt5662 * -1307622225).append(" (").append(760293275 * client.anInt5663).append(" ms)").toString(), i_150_, i_151_, i_152_, -1, -492514935);
			i_151_ += 15;
			Runtime runtime = Runtime.getRuntime();
			long l = runtime.totalMemory() / 1024L;
			long l_153_ = l - runtime.freeMemory() / 1024L;
			int i_154_ = -256;
			if (l_153_ > 262144L)
				i_154_ = -65536;
			Class10.aClass164_83.method2596(new StringBuilder().append("Mem:").append(l_153_).append("/").append(l).append("k").toString(), i_150_, i_151_, i_154_, -1, -1671045031);
			i_151_ += 15;
			long l_155_ = client.aClass116_11058.aClass49_1433.method1263((short) 24024);
			String string = "N/A";
			if (-1L != l_155_) {
				string = new StringBuilder().append(l_155_).append("ms").toString();
				if (l_155_ > 500L)
					string = new StringBuilder().append(Class495.method8101(16711680, -121498471)).append(string).append(Class495.method8101(16776960, 1672214228)).toString();
			}
			Class10.aClass164_83.method2596(new StringBuilder().append("Game: In:").append(client.aClass116_11058.anInt1416 * 1499432703).append("B/s ").append("Out:").append(-297675755 * client.aClass116_11058.anInt1427).append("B/s ").append("Ping:").append(string).toString(), i_150_, i_151_, -256, -1, -1893103424);
			i_151_ += 15;
			long l_156_ = client.aClass116_11057.aClass49_1433.method1263((short) 17055);
			String string_157_ = "N/A";
			if (l_156_ != -1L) {
				string_157_ = new StringBuilder().append(l_156_).append("ms").toString();
				if (l_156_ > 500L)
					string_157_ = new StringBuilder().append(Class495.method8101(16711680, -1702055294)).append(string_157_).append(Class495.method8101(16776960, 2018833189)).toString();
			}
			Class10.aClass164_83.method2596(new StringBuilder().append("Lobby: In:").append(client.aClass116_11057.anInt1416 * 1499432703).append("B/s ").append("Out:").append(-297675755 * client.aClass116_11057.anInt1427).append("B/s ").append("Ping:").append(string_157_).toString(), i_150_, i_151_, -256, -1, 1962247312);
			i_151_ += 15;
			int i_158_ = Class31.aClass178_303.method3025() / 1024;
			Class10.aClass164_83.method2596(new StringBuilder().append("Offheap:").append(i_158_).append("k").toString(), i_150_, i_151_, i_158_ > 65536 ? -65536 : -256, -1, 1377717099);
			i_151_ += 15;
			int i_159_ = 0;
			int i_160_ = 0;
			int i_161_ = 0;
			for (int i_162_ = 0; i_162_ < GraphicsDefinitions.aClass467_Sub1Array8605.length; i_162_++) {
				if (GraphicsDefinitions.aClass467_Sub1Array8605[i_162_] != null && GraphicsDefinitions.aClass467_Sub1Array8605[i_162_].method15739(406530231)) {
					i_159_ += GraphicsDefinitions.aClass467_Sub1Array8605[i_162_].method15748(142613961);
					i_160_ += GraphicsDefinitions.aClass467_Sub1Array8605[i_162_].method15736((byte) 0);
					i_161_ += GraphicsDefinitions.aClass467_Sub1Array8605[i_162_].method15737(2120685459);
				}
			}
			int i_163_ = i_159_ == 0 ? 0 : i_161_ * 100 / i_159_;
			int i_164_ = i_159_ == 0 ? 0 : i_160_ * 10000 / i_159_;
			String string_165_ = new StringBuilder().append("Cache:").append(Class648.method10612((long) i_164_, 2, true, Class668.aClass668_8548, -1952865983)).append("% (").append(i_163_).append("%)").toString();
			Class34.aClass164_318.method2596(string_165_, i_150_, i_151_, -256, -1, -1739624929);
			i_151_ += 12;
		}
	}

	static QuickChatStringType[] getQuickChatTypes(byte i) {
		return (new QuickChatStringType[] { QuickChatStringType.aClass636_8286, QuickChatStringType.QC_SLAYER_TASK, QuickChatStringType.QC_EXPERIENCE, QuickChatStringType.QC_SKILL, QuickChatStringType.QC_COMBAT_LEVEL, QuickChatStringType.QC_ITEM, QuickChatStringType.QC_COMBAT_LEVEL_AVERAGE, QuickChatStringType.QC_MINIGAME_POINTS, QuickChatStringType.QC_GENERAL, QuickChatStringType.QC_ITEM_TRADE, QuickChatStringType.QC_SOULWARS, QuickChatStringType.QC_FRIEND_CHAT, QuickChatStringType.aClass636_8287, QuickChatStringType.QC_RANK });
	}

	static final void method7504(Class669 class669, int i) {
		int i_166_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Integer.toString(i_166_);
	}
}
