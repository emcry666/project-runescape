/* Class417 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class417 {
	public static final int anInt4592 = 536870912;
	public static final int anInt4593 = 16;
	public static final int anInt4594 = 32;
	public static final int anInt4595 = 1;
	public static final int anInt4596 = 64;
	public static final int anInt4597 = 134217728;
	public static final int anInt4598 = 2;
	public static final int anInt4599 = 4;
	public static final int anInt4600 = 1024;
	public static final int anInt4601 = 16384;
	public static final int anInt4602 = 4194304;
	public static final int anInt4603 = 4096;
	public static final int anInt4604 = 8192;
	public static final int anInt4605 = 32768;
	public static final int anInt4606 = 2048;
	public static final int anInt4607 = 131072;
	public static final int anInt4608 = 16384;
	public static final int anInt4609 = 2097152;
	public static final int anInt4610 = 131072;
	public static final int anInt4611 = 262144;
	public static final int anInt4612 = 65536;
	public static final int anInt4613 = 1;
	public static final int anInt4614 = 8388608;
	public static final int anInt4615 = 64;
	public static final int anInt4616 = 2048;
	public static final int anInt4617 = 16;
	public static final int anInt4618 = 8;
	public static final int anInt4619 = 128;
	public static final int anInt4620 = 32;
	public static final int anInt4621 = 4;
	public static final int anInt4622 = 2;
	public static final int anInt4623 = 4096;
	public static final int anInt4624 = 1024;
	public static final int anInt4625 = 512;
	public static final int anInt4626 = 1048576;
	public static final int anInt4627 = 32768;
	public static final int anInt4628 = 4194304;
	public static final int anInt4629 = 512;
	public static final int anInt4630 = 1048576;
	public static final int anInt4631 = 8388608;
	public static final int anInt4632 = 8;
	public static final int anInt4633 = 262144;
	public static final int anInt4634 = 524288;
	public static final int anInt4635 = 65536;
	public static final int anInt4636 = 2097152;
	public static final int anInt4637 = 524288;
	public static final int anInt4638 = 128;
	public static final int anInt4639 = 33554432;
	public static final int anInt4640 = 67108864;
	public static final int anInt4641 = 268435456;
	public static final int anInt4642 = 16777216;
	public static final int anInt4643 = 8192;

	Class417() throws Throwable {
		throw new Error();
	}

	public static Class611_Sub1 method6657(int i, int i_0_) {
		if (!Class595.aBool7822 || i < Class687_Sub25.anInt10886 * -2074972287 || i > Class595.anInt7824 * 615132109)
			return null;
		return (Class595.aClass611_Sub1Array7823[i - -2074972287 * Class687_Sub25.anInt10886]);
	}

	public static void method6658(String[] strings, int[] is, int i) {
		Class523_Sub16.method15998(strings, is, 0, strings.length - 1, (short) 14487);
	}

	static final void method6659(Class669 class669, int i) {
		Class561.method9457(Class421.method6676(-1647626681), class669, 1787600709);
	}

	static final void method6660(Class669 class669, int i) {
		class669.anInt8558 -= 2103927403;
		int i_1_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_2_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		int i_3_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 2];
		int i_4_ = class669.anIntArray8557[3 + class669.anInt8558 * 1357652815];
		int i_5_ = class669.anIntArray8557[4 + class669.anInt8558 * 1357652815];
		if (i_3_ == -1)
			throw new RuntimeException();
		Class37 class37 = (Class37) Class394.aClass53_Sub16_4056.getDefinition(i_3_, (byte) 55);
		if (class37.aClass464_373.method82() != i_2_)
			throw new RuntimeException();
		if (class37.aClass464_367.method82() != i_1_)
			throw new RuntimeException();
		int[] is = class37.method1091(Integer.valueOf(i_4_), (byte) 30);
		if (i_5_ < 0 || null == is || is.length <= i_5_)
			throw new RuntimeException();
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = is[i_5_];
	}
}
