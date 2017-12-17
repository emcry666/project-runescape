/* Class671 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Date;

public class GraphicsDefinitions implements Interface13 {
	static final int anInt8586 = 8224;
	Class676 aClass676_8587;
	int anInt8588;
	short[] aShortArray8589;
	public int emoteId = -1494828045;
	short[] aShortArray8591;
	short[] aShortArray8592;
	int anInt8593;
	short[] aShortArray8594;
	byte[] aByteArray8595;
	byte[] aByteArray8596;
	int anInt8597 = -924868480;
	int anInt8598 = 854698112;
	int anInt8599 = 0;
	int modelId;
	int anInt8601;
	public boolean aBool8602;
	byte byteValue;
	int intValue;
	public static Class467_Sub1[] aClass467_Sub1Array8605;

	public void readValues(RSBuffer buffer, int i) {
		for (;;) {
			int opcode = buffer.readUnsignedByte(1399327000);
			if (0 == opcode)
				break;
			decode(buffer, opcode, 1130064813);
		}
	}

	void decode(RSBuffer buffer, int opcode, int i_15_) {
		do {
			if (1 == opcode)
				modelId = buffer.readBigSmart((byte) -19) * 306593373;
			else if (opcode == 2)
				emoteId = buffer.readBigSmart((byte) -42) * 1494828045;
			else if (4 == opcode)
				anInt8597 = buffer.readUnsignedShort(-1828858284) * 496090945;
			else if (5 == opcode)
				anInt8598 = buffer.readUnsignedShort(-638237303) * 811983697;
			else if (6 == opcode)
				anInt8599 = buffer.readUnsignedShort(-244079246) * -1571829193;
			else if (7 == opcode)
				anInt8588 = buffer.readUnsignedByte(1931805262) * -1845835163;
			else if (opcode == 8)
				anInt8601 = buffer.readUnsignedByte(-1330425591) * 1769087705;
			else if (10 == opcode)
				aBool8602 = true;
			else if (opcode == 9) {
				byteValue = (byte) 3;
				intValue = 2106514592;
			} else if (15 == opcode) {
				byteValue = (byte) 3;
				intValue = buffer.readUnsignedShort(-477850707) * -245722651;
			} else if (16 == opcode) {
				byteValue = (byte) 3;
				intValue = buffer.readUnsignedInt((byte) -41) * -245722651;
			} else if (opcode == 40) {
				int i_16_ = buffer.readUnsignedByte(247519565);
				aShortArray8591 = new short[i_16_];
				aShortArray8592 = new short[i_16_];
				for (int i_17_ = 0; i_17_ < i_16_; i_17_++) {
					aShortArray8591[i_17_] = (short) buffer.readUnsignedShort(-915684066);
					aShortArray8592[i_17_] = (short) buffer.readUnsignedShort(-1969625112);
				}
			} else if (opcode == 41) {
				int i_18_ = buffer.readUnsignedByte(1209339065);
				aShortArray8589 = new short[i_18_];
				aShortArray8594 = new short[i_18_];
				for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
					aShortArray8589[i_19_] = (short) buffer.readUnsignedShort(-1780638785);
					aShortArray8594[i_19_] = (short) buffer.readUnsignedShort(-303104661);
				}
			} else if (44 == opcode) {
				int i_20_ = buffer.readUnsignedShort(-765546384);
				int i_21_ = 0;
				for (int i_22_ = i_20_; i_22_ > 0; i_22_ >>= 1)
					i_21_++;
				aByteArray8595 = new byte[i_21_];
				byte i_23_ = 0;
				for (int i_24_ = 0; i_24_ < i_21_; i_24_++) {
					if ((i_20_ & 1 << i_24_) > 0) {
						aByteArray8595[i_24_] = i_23_;
						i_23_++;
					} else
						aByteArray8595[i_24_] = (byte) -1;
				}
			} else if (opcode == 45) {
				int i_25_ = buffer.readUnsignedShort(-491308386);
				int i_26_ = 0;
				for (int i_27_ = i_25_; i_27_ > 0; i_27_ >>= 1)
					i_26_++;
				aByteArray8596 = new byte[i_26_];
				byte i_28_ = 0;
				for (int i_29_ = 0; i_29_ < i_26_; i_29_++) {
					if ((i_25_ & 1 << i_29_) > 0) {
						aByteArray8596[i_29_] = i_28_;
						i_28_++;
					} else
						aByteArray8596[i_29_] = (byte) -1;
				}
			} else if (46 == opcode)
				break;
		} while (false);
	}

	public void method77() {
		/* empty */
	}

	public final Class167 method13697(Class178 class178, int i, int i_30_, int i_31_, int i_32_, int i_33_, Class707 class707, byte i_34_, int i_35_) {
		if (byteValue != 3)
			return method13699(class178, i, false, null, null, 0, 0, 0, i_30_, 0, 0, 0, class707, i_34_, (short) 473);
		return method13699(class178, i, true, null, null, 0, 0, 0, i_30_, i_31_, i_32_, i_33_, class707, i_34_, (short) 473);
	}

	public final Class167 method13698(Class178 class178, int i, int i_36_, Class142 class142, Class142 class142_37_, int i_38_, int i_39_, int i_40_, Class707 class707, byte i_41_, byte i_42_) {
		return method13699(class178, i, true, class142, class142_37_, i_38_, i_39_, i_40_, i_36_, 0, 0, 0, class707, i_41_, (short) 473);
	}

	public void method74(byte i) {
		/* empty */
	}

	GraphicsDefinitions(int i, Class676 class676) {
		anInt8588 = 0;
		anInt8601 = 0;
		aBool8602 = false;
		byteValue = (byte) 0;
		intValue = 245722651;
		anInt8593 = -541553233 * i;
		aClass676_8587 = class676;
	}
	
	final Class167 method13699(Class178 class178, int i, boolean bool, Class142 class142, Class142 class142_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, Class707 class707, byte i_51_, short i_52_) {
		int i_53_ = i;
		bool = bool & byteValue != 0;
		if (class707 != null)
			i_53_ |= class707.method14173(96457813);
		if (128 != 41502129 * anInt8598)
			i_53_ |= 0x2;
		if (anInt8597 * -1254436671 != 128 || -1985737849 * anInt8599 != 0 || 0 != i_47_)
			i_53_ |= 0x5;
		if (bool)
			i_53_ |= 0x7;
		Class167 class167;
		synchronized (aClass676_8587.aClass209_8634) {
			class167 = ((Class167) (aClass676_8587.aClass209_8634.method3767((long) (anInt8593 * -228005553 | -1144788131 * class178.anInt1922 << 29))));
		}
		if (null == class167 || class178.method3068(class167.method2683(), i_53_) != 0) {
			if (null != class167)
				i_53_ = class178.method3117(i_53_, class167.method2683());
			int i_54_ = i_53_;
			if (null != aShortArray8591)
				i_54_ |= 0x4000;
			if (null != aShortArray8589)
				i_54_ |= 0x8000;
			Class179 class179 = Class179.method3485(aClass676_8587.aClass472_8633, modelId * 266372597, 0);
			if (class179 == null)
				return null;
			if (class179.anInt1952 < 13)
				class179.method3494(2);
			class167 = class178.method3115(class179, i_54_, 895462079 * aClass676_8587.anInt8635, 754571117 * anInt8588 + 64, anInt8601 * 196230505 + 850);
			if (aShortArray8591 != null) {
				for (int i_55_ = 0; i_55_ < aShortArray8591.length; i_55_++)
					class167.method2725(aShortArray8591[i_55_], aShortArray8592[i_55_]);
			}
			if (null != aShortArray8589) {
				for (int i_56_ = 0; i_56_ < aShortArray8589.length; i_56_++)
					class167.method2826(aShortArray8589[i_56_], aShortArray8594[i_56_]);
			}
			class167.method2769(i_53_);
			synchronized (aClass676_8587.aClass209_8634) {
				aClass676_8587.aClass209_8634.method3770(class167, (long) (-228005553 * anInt8593 | class178.anInt1922 * -1144788131 << 29));
			}
		}
		Class167 class167_57_ = class167.method2681(i_51_, i_53_, true);
		if (null != class707)
			class707.method14229(class167_57_, 0, 2010300175);
		if (128 != anInt8597 * -1254436671 || 41502129 * anInt8598 != 128)
			class167_57_.method2691(anInt8597 * -1254436671, anInt8598 * 41502129, anInt8597 * -1254436671);
		if (-1985737849 * anInt8599 != 0) {
			if (90 == -1985737849 * anInt8599)
				i_47_ += 4096;
			if (-1985737849 * anInt8599 == 180)
				i_47_ += 8192;
			if (270 == anInt8599 * -1985737849)
				i_47_ += 12288;
		}
		if (i_47_ != 0) {
			i_47_ &= 0x3fff;
			class167_57_.method2685(i_47_);
		}
		if (bool) {
			if (null != class142)
				class167_57_.method2692(byteValue, intValue * -1617411091, class142, class142_43_, i_44_, i_45_, i_46_);
			else {
				if (0 != i_48_)
					class167_57_.method2845(i_48_);
				if (i_49_ != 0)
					class167_57_.method2688(i_49_);
				if (0 != i_50_)
					class167_57_.method2689(0, i_50_, 0);
			}
		}
		class167_57_.method2769(i);
		return class167_57_;
	}

	public final boolean method13700(byte i) {
		if (266372597 * modelId == -1)
			return true;
		return aClass676_8587.aClass472_8633.method7663(modelId * 266372597, 0, 1089230115);
	}

	public final Class167 method13703(Class178 class178, int i, Class707 class707, byte i_77_, byte i_78_) {
		return method13699(class178, i, false, null, null, 0, 0, 0, 0, 0, 0, 0, class707, i_77_, (short) 473);
	}

	public void method73() {
		/* empty */
	}

	static String method13712(long l) {
		return Class241.method4346(new Date(l), "EEE dd-MMM-yyyy HH:mm:ss zzz", (short) 15905);
	}

	static final void method13713(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub40_10615.method17072(-1855157720) == 1 ? 1 : 0;
	}

	static final void method13714(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		class250.anInt2612 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) * 1413736565;
		Login.method15991(class250, (byte) -73);
	}

	static final void method13715(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		OutputStream_Sub1.method17238(class250, class242, class669, 136560515);
	}

	static final void method13716(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_105_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_106_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		Class553.method9164(2, i_105_, i_106_, "", 889032937);
	}
}
