/* Class467 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class467 {
	abstract void method7581(int i, byte i_0_);

	Class467() {
		/* empty */
	}

	abstract byte[] method7582(int i, int i_1_);

	abstract Class460 method7583(int i);

	abstract byte[] method7584(int i);

	abstract Class460 method7585();

	abstract Class460 method7586();

	abstract byte[] method7587(int i);

	abstract int method7588(int i);

	abstract void method7589(int i);

	abstract int method7590(int i);

	abstract int method7591(int i, byte i_2_);

	abstract int method7592(int i);

	abstract int method7593(int i);

	abstract int method7594(int i);

	abstract int method7595(int i);

	static final void method7596(Class669 class669, int i) {
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_3_, -422753281);
		Class242 class242 = Class31.aClass242Array302[i_3_ >> 16];
		Class464.method7543(class250, class242, class669, (byte) -2);
	}

	static final void method7597(Class669 class669, int i) {
		class669.anIntArray8557[1357652815 * class669.anInt8558 - 1] = (class669.aClass334_8571.method5858((byte) 27)[class669.anIntArray8557[class669.anInt8558 * 1357652815 - 1]]);
	}

	static final void method7598(Class669 class669, byte i) {
		if (Class481.aClass551_5473.method9127(81, (byte) -17))
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method7599(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub22_10652.method16930(794086096);
	}

	static final void method7600(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class669.aClass334_8571.anInt3525 * -2125729363;
	}

	public static final int method7601(int i, int i_4_, int i_5_, int i_6_, int i_7_, byte i_8_) {
		if (client.aClass505_11019.method8241((byte) -70) == null)
			return 0;
		if (i_7_ < 3) {
			Class451 class451 = client.aClass505_11019.method8243(1995225040);
			int i_9_ = i >> 9;
			int i_10_ = i_4_ >> 9;
			if (i_5_ < 0 || i_6_ < 0 || i_5_ > client.aClass505_11019.method8292((byte) 5) - 1 || i_6_ > client.aClass505_11019.method8235(2121307128) - 1)
				return 0;
			if (i_9_ < 1 || i_10_ < 1 || i_9_ > client.aClass505_11019.method8292((byte) 31) - 1 || i_10_ > client.aClass505_11019.method8235(2095498762) - 1)
				return 0;
			boolean bool = ((class451.aByteArrayArrayArray4962[1][i >> 9][i_4_ >> 9] & 0x2) != 0);
			if (0 == (i & 0x1ff)) {
				boolean bool_11_ = 0 != ((class451.aByteArrayArrayArray4962[1][i_9_ - 1][i_4_ >> 9]) & 0x2);
				boolean bool_12_ = 0 != ((class451.aByteArrayArrayArray4962[1][i_9_][i_4_ >> 9]) & 0x2);
				if (bool_12_ != bool_11_)
					bool = 0 != ((class451.aByteArrayArrayArray4962[1][i_5_][i_6_]) & 0x2);
			}
			if ((i_4_ & 0x1ff) == 0) {
				boolean bool_13_ = ((class451.aByteArrayArrayArray4962[1][i >> 9][i_10_ - 1] & 0x2) != 0);
				boolean bool_14_ = 0 != (class451.aByteArrayArrayArray4962[1][i >> 9][i_10_] & 0x2);
				if (bool_13_ != bool_14_)
					bool = 0 != ((class451.aByteArrayArrayArray4962[1][i_5_][i_6_]) & 0x2);
			}
			if (bool)
				i_7_++;
		}
		return client.aClass505_11019.method8241((byte) -80).aClass142Array7509[i_7_].method2326(i, i_4_, 1492769187);
	}
}
