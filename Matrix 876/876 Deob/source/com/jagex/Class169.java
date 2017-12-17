/* Class169 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class169 {
	short[] aShortArray1802;
	static short[] aShortArray1803;
	static short[] aShortArray1804;
	static short[] aShortArray1805;
	static short[] aShortArray1806;
	static byte[] aByteArray1807;
	Class523_Sub15 aClass523_Sub15_1808 = null;
	short[] aShortArray1809;
	static short[] aShortArray1810 = new short[500];
	boolean aBool1811;
	short[] aShortArray1812;
	static final int anInt1813 = 2;
	short[] aShortArray1814;
	int anInt1815 = 0;
	static final int anInt1816 = 1;
	boolean aBool1817;
	boolean aBool1818;
	short[] aShortArray1819;
	static final int anInt1820 = 2;
	byte[] aByteArray1821;

	Class169(byte[] is, Class523_Sub15 class523_sub15) {
		aBool1811 = false;
		aBool1817 = false;
		aBool1818 = false;
		aClass523_Sub15_1808 = class523_sub15;
		try {
			RSBuffer class523_sub34 = new RSBuffer(is);
			RSBuffer class523_sub34_0_ = new RSBuffer(is);
			int i = class523_sub34.readUnsignedByte(-607798955);
			class523_sub34.offset += 379531446;
			int i_1_ = class523_sub34.readUnsignedShort(-1421573098);
			int i_2_ = 0;
			int i_3_ = -1;
			int i_4_ = -1;
			class523_sub34_0_.offset = (class523_sub34.offset * 2349011 + i_1_) * 189765723;
			for (int i_5_ = 0; i_5_ < i_1_; i_5_++) {
				int i_6_ = aClass523_Sub15_1808.anIntArray10467[i_5_];
				if (i_6_ == 0)
					i_3_ = i_5_;
				int i_7_ = class523_sub34.readUnsignedByte(-958856072);
				if (i_7_ > 0) {
					if (i_6_ == 0)
						i_4_ = i_5_;
					aShortArray1810[i_2_] = (short) i_5_;
					short i_8_ = 0;
					if (i_6_ == 3 || i_6_ == 10)
						i_8_ = (short) 128;
					if (i >= 2 && i_6_ == 7) {
						if ((i_7_ & 0x1) != 0) {
							aShortArray1803[i_2_] = (short) class523_sub34_0_.method16487((byte) -58);
							class523_sub34_0_.method16487((byte) -7);
						} else
							aShortArray1803[i_2_] = i_8_;
						if ((i_7_ & 0x2) != 0) {
							aShortArray1804[i_2_] = (short) class523_sub34_0_.method16487((byte) -54);
							class523_sub34_0_.method16487((byte) 15);
						} else
							aShortArray1804[i_2_] = i_8_;
						if ((i_7_ & 0x4) != 0) {
							aShortArray1805[i_2_] = (short) class523_sub34_0_.method16487((byte) 1);
							class523_sub34_0_.method16487((byte) -60);
						} else
							aShortArray1805[i_2_] = i_8_;
					} else {
						if ((i_7_ & 0x1) != 0)
							aShortArray1803[i_2_] = (short) class523_sub34_0_.method16487((byte) -114);
						else
							aShortArray1803[i_2_] = i_8_;
						if ((i_7_ & 0x2) != 0)
							aShortArray1804[i_2_] = (short) class523_sub34_0_.method16487((byte) -67);
						else
							aShortArray1804[i_2_] = i_8_;
						if ((i_7_ & 0x4) != 0)
							aShortArray1805[i_2_] = (short) class523_sub34_0_.method16487((byte) -110);
						else
							aShortArray1805[i_2_] = i_8_;
					}
					aByteArray1807[i_2_] = (byte) (i_7_ >>> 3 & 0x3);
					if (i_6_ == 2 || i_6_ == 9) {
						aShortArray1803[i_2_] = (short) (aShortArray1803[i_2_] << 2 & 0x3fff);
						aShortArray1804[i_2_] = (short) (aShortArray1804[i_2_] << 2 & 0x3fff);
						aShortArray1805[i_2_] = (short) (aShortArray1805[i_2_] << 2 & 0x3fff);
					}
					aShortArray1806[i_2_] = (short) -1;
					if (i_6_ == 1 || i_6_ == 2 || i_6_ == 3) {
						if (i_3_ > i_4_) {
							aShortArray1806[i_2_] = (short) i_3_;
							i_4_ = i_3_;
						}
					} else if (i_6_ == 5)
						aBool1811 = true;
					else if (i_6_ == 7)
						aBool1817 = true;
					else if (i_6_ == 9 || i_6_ == 10 || i_6_ == 8)
						aBool1818 = true;
					i_2_++;
				}
			}
			if (class523_sub34_0_.offset * 2349011 != is.length)
				throw new RuntimeException();
			anInt1815 = i_2_;
			aShortArray1809 = new short[i_2_];
			aShortArray1819 = new short[i_2_];
			aShortArray1802 = new short[i_2_];
			aShortArray1812 = new short[i_2_];
			aShortArray1814 = new short[i_2_];
			aByteArray1821 = new byte[i_2_];
			for (int i_9_ = 0; i_9_ < i_2_; i_9_++) {
				aShortArray1809[i_9_] = aShortArray1810[i_9_];
				aShortArray1819[i_9_] = aShortArray1803[i_9_];
				aShortArray1802[i_9_] = aShortArray1804[i_9_];
				aShortArray1812[i_9_] = aShortArray1805[i_9_];
				aShortArray1814[i_9_] = aShortArray1806[i_9_];
				aByteArray1821[i_9_] = aByteArray1807[i_9_];
			}
		} catch (Exception exception) {
			anInt1815 = 0;
			aBool1811 = false;
			aBool1817 = false;
		}
	}

	static {
		aShortArray1803 = new short[500];
		aShortArray1804 = new short[500];
		aShortArray1805 = new short[500];
		aShortArray1806 = new short[500];
		aByteArray1807 = new byte[500];
	}
}
