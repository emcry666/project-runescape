/* Class518 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class518 {
	static final int anInt7053 = 4096;
	static byte[] aByteArray7054 = new byte[2048];
	Class520[] aClass520Array7055;
	Class320[] aClass320Array7056;
	public static Class472 aClass472_7057;

	Class518() {
		Class478.method7894((byte) 16);
		aClass520Array7055 = new Class520[4096];
		new Class331();
		aClass320Array7056 = new Class320[4];
		new Class320(4);
		new Class541_Sub1(this);
		new Class541_Sub1(this);
		new Class539(this);
		for (int i = 0; i < 4096; i++)
			aClass520Array7055[i] = new Class520(this);
		for (int i = 0; i < 4; i++)
			aClass320Array7056[i] = new Class320(6);
	}

	static {
		int i = 22;
		int i_0_ = 2;
		aByteArray7054[0] = (byte) 0;
		aByteArray7054[1] = (byte) 1;
		for (int i_1_ = 2; i_1_ < i; i_1_++) {
			int i_2_ = 1 << (i_1_ >> 1) - 1;
			int i_3_ = 0;
			while (i_3_ < i_2_) {
				aByteArray7054[i_0_] = (byte) i_1_;
				i_3_++;
				i_0_++;
			}
		}
	}

	static final void method8631(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_4_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_5_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		Class76 class76 = (Class76) Class60.aClass53_Sub22_766.getDefinition(i_5_, (byte) 25);
		if (class76.method1537((byte) -128))
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = ((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition(i_4_, (byte) 42)).method5489(i_5_, class76.aString849, (byte) 54);
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition(i_4_, (byte) 31)).method5488(i_5_, class76.anInt850 * -1100663923, 196790065));
	}

	static final void method8632(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub11_10621.method16835(1690893910) ? 1 : 0;
	}

	static void setContainerItem(int key, int index, int i_7_, int i_8_, Class4 class4, boolean negativeKey, byte i_9_) {
		long l = (long) (key | (negativeKey ? -2147483648 : 0));
		ItemsContainer container = (ItemsContainer) ItemsContainer.containers.getFromIndex(l);
		if (null == container) {
			container = new ItemsContainer();
			ItemsContainer.containers.method738(container, l);
		}
		if (container.itemIds.length <= index) {
			int[] is = new int[index + 1];
			int[] is_10_ = new int[index + 1];
			Class4[] class4s = null;
			if (null != container.aClass4Array10322)
				class4s = new Class4[index + 1];
			for (int i_11_ = 0; i_11_ < container.itemIds.length; i_11_++) {
				is[i_11_] = container.itemIds[i_11_];
				is_10_[i_11_] = container.itemAmounts[i_11_];
				if (container.aClass4Array10322 != null)
					class4s[i_11_] = container.aClass4Array10322[i_11_];
			}
			for (int i_12_ = container.itemIds.length; i_12_ < index; i_12_++) {
				is[i_12_] = -1;
				is_10_[i_12_] = 0;
			}
			container.itemIds = is;
			container.itemAmounts = is_10_;
			container.aClass4Array10322 = class4s;
		}
		container.itemIds[index] = i_7_;
		container.itemAmounts[index] = i_8_;
		if (class4 != null) {
			if (null == container.aClass4Array10322)
				container.aClass4Array10322 = new Class4[container.itemIds.length];
			container.aClass4Array10322[index] = class4;
		} else if (null != container.aClass4Array10322)
			container.aClass4Array10322[index] = null;
	}
}
