/* Class495 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class495 implements Interface47 {
	Class477 this$0;

	public void method292() {
		this$0.method7809(true, -976874041);
	}

	public void method347(byte i) {
		this$0.method7809(true, -976874041);
	}

	Class495(Class477 class477) {
		this$0 = class477;
	}

	static int method8096(RSBitBuffer class523_sub34_sub2, int i) {
		int i_0_ = class523_sub34_sub2.readBits(2, -1071375856);
		int i_1_;
		if (0 == i_0_)
			i_1_ = 0;
		else if (i_0_ == 1)
			i_1_ = class523_sub34_sub2.readBits(5, -1430371685);
		else if (2 == i_0_)
			i_1_ = class523_sub34_sub2.readBits(8, -1704397827);
		else
			i_1_ = class523_sub34_sub2.readBits(11, -971956758);
		return i_1_;
	}

	static final void method8097(Class669 class669, int i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_2_, -1236528956);
		Class242 class242 = Class31.aClass242Array302[i_2_ >> 16];
		Class554.method9171(class250, class242, class669, (byte) 1);
	}

	static final void method8098(InterfaceComponentDefinitions class250, int i, Class669 class669, int i_3_) {
		if (null == class250.aByteArrayArray2530)
			throw new RuntimeException();
		if (class250.anIntArray2614 == null)
			class250.anIntArray2614 = new int[class250.aByteArrayArray2530.length];
		class250.anIntArray2614[i] = 2147483647;
	}

	static final void method8099(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_4_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_5_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class664.method13640(i_4_, i_5_, true, -365378641);
	}

	static final void method8100(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (Class594.method9807(string, class669, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2664 = Class78.method1554(string, class669, -68449792);
		class250.aBool2635 = true;
	}

	public static String method8101(int i, int i_6_) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}
}
