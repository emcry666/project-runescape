/* Class202 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class202 implements Interface17 {
	public int method97(VarBitDefinitions class309) {
		Class523_Sub24 class523_sub24 = ((Class523_Sub24) Class191.aClass14_2160.getFromIndex(0x100000000L | (long) (class309.anInt3365 * -637362725)));
		if (class523_sub24 == null)
			return Class98_Sub1_Sub2.playerVarsProvider.method93(class309, -1541406854);
		return -677457577 * class523_sub24.anInt10542;
	}

	public int method94(Class159 class159, int i) {
		Class523_Sub24 class523_sub24 = ((Class523_Sub24) Class191.aClass14_2160.getFromIndex((long) (class159.anInt1754 * -80020449)));
		if (null == class523_sub24)
			return Class98_Sub1_Sub2.playerVarsProvider.method94(class159, -2079291487);
		return -677457577 * class523_sub24.anInt10542;
	}

	public int method93(VarBitDefinitions class309, int i) {
		Class523_Sub24 class523_sub24 = ((Class523_Sub24) Class191.aClass14_2160.getFromIndex(0x100000000L | (long) (class309.anInt3365 * -637362725)));
		if (class523_sub24 == null)
			return Class98_Sub1_Sub2.playerVarsProvider.method93(class309, 459482827);
		return -677457577 * class523_sub24.anInt10542;
	}

	public int method95(Class159 class159) {
		Class523_Sub24 class523_sub24 = ((Class523_Sub24) Class191.aClass14_2160.getFromIndex((long) (class159.anInt1754 * -80020449)));
		if (null == class523_sub24)
			return Class98_Sub1_Sub2.playerVarsProvider.method94(class159, -1480032453);
		return -677457577 * class523_sub24.anInt10542;
	}

	public int method96(Class159 class159) {
		Class523_Sub24 class523_sub24 = ((Class523_Sub24) Class191.aClass14_2160.getFromIndex((long) (class159.anInt1754 * -80020449)));
		if (null == class523_sub24)
			return Class98_Sub1_Sub2.playerVarsProvider.method94(class159, -1867970991);
		return -677457577 * class523_sub24.anInt10542;
	}

	static final void method3695(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_0_, -861551293);
		Class242 class242 = Class31.aClass242Array302[i_0_ >> 16];
		Class457.method7443(class250, class242, false, 1, class669, -1351622825);
	}

	static final void method3696(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_1_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_2_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		Class76 class76 = (Class76) Class60.aClass53_Sub22_766.getDefinition(i_2_, (byte) 64);
		if (class76.method1537((byte) -6))
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = ((Class239) Class287.aClass53_Sub1_3102.getDefinition(i_1_, (byte) -36)).method4321(i_2_, class76.aString849, (byte) 6);
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (((Class239) Class287.aClass53_Sub1_3102.getDefinition(i_1_, (byte) 117)).method4317(i_2_, class76.anInt850 * -1100663923, 727054873));
	}

	static final void method3697(Class669 class669, byte i) {
		class669.anInt8558 -= 2121349901;
		int i_3_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_4_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		int i_5_ = class669.anIntArray8557[2 + 1357652815 * class669.anInt8558];
		if (i_4_ == -1)
			throw new RuntimeException();
		ClientScriptDefinitions class37 = (ClientScriptDefinitions) Class394.aClass53_Sub16_4056.getDefinition(i_4_, (byte) 1);
		if (class37.valueType.method82() != i_3_)
			throw new RuntimeException();
		int[] is = class37.method1091(Integer.valueOf(i_5_), (byte) -94);
		int i_6_ = 0;
		if (is != null)
			i_6_ = is.length;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_6_;
	}

	public static byte[] getHash(byte[] data, int offset, int length, int i_8_) {
		byte[] source;
		if (offset > 0) {
			source = new byte[length];
			for (int i_10_ = 0; i_10_ < length; i_10_++)
				source[i_10_] = data[offset + i_10_];
		} else
			source = data;
		Whirlpool whirlpool = new Whirlpool();
		whirlpool.NESSIEinit(541532719);
		whirlpool.NESSIEadd(source, (long) (8 * length));
		byte[] digest = new byte[64];
		whirlpool.NESSIEfinalize(digest, 0, -121914712);
		return digest;
	}

	public static final void method3699(int i, int i_12_, int i_13_, int i_14_, int i_15_, boolean bool, int i_16_) {
		Class548.anInt7322 = -1193109939 * i;
		Class144.anInt1695 = i_12_ * -773840215;
		Class700.anInt8780 = -1135963827 * i_13_;
		Class382.anInt3963 = i_14_ * -925955901;
		Class170.anInt1834 = i_15_ * 1375097753;
		if (2 == Class562.anInt7564 * 2097396553)
			Class334.method5911(-1218379387);
		if (bool && -1774497623 * Class170.anInt1834 >= 100) {
			Class77.anInt858 = 522204416 + 871043584 * Class548.anInt7322;
			Class497.anInt5563 = Class144.anInt1695 * -2040038912 + -1673411328;
			Class285.anInt3085 = (Class53_Sub17.method17220(Class77.anInt858 * 760427037, Class497.anInt5563 * -1221225203, Class222.anInt2334 * -860310981, 988740805) - -1707405435 * Class700.anInt8780) * 1059489463;
		}
		Class562.anInt7564 = -519670549;
		Class59.anInt755 = 1325954419;
		JS5FileQueue.anInt8764 = -763239385;
	}
}
