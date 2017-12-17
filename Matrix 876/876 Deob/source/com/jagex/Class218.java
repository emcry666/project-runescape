/* Class218 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Class218 {
	static final int anInt2303 = 1;
	boolean aBool2304;
	ArrayList anArrayList2305;
	static final int anInt2306 = 4;
	long aLong2307;
	long aLong2308;
	static final int anInt2309 = 1;
	boolean aBool2310;
	int anInt2311;
	Class4 aClass4_2312;
	String aString2313;
	ArrayList anArrayList2314;
	boolean aBool2315;
	static final int anInt2316 = 2;
	int anInt2317 = 673358509;
	int anInt2318;
	public static Class523_Sub41 aClass523_Sub41_2319;

	void method3956(int i, int i_0_) {
		((Class229) anArrayList2305.get(i)).method4187(i_0_, 1486880042);
	}

	void method3957(int i, Class229 class229) {
		Class229 class229_1_ = (Class229) anArrayList2305.get(i);
		class229_1_.method4191(class229, 300875996);
	}

	public String method3958() {
		return aString2313;
	}

	int method3959(byte i) {
		return 414659683 * anInt2318;
	}

	void method3960(byte i) {
		anInt2318 += -1541608117;
	}

	public Class218(long l, RSBuffer class523_sub34, boolean bool, Interface27 interface27) {
		aLong2307 = l * 153656077270814505L;
		int i = class523_sub34.readUnsignedByte(-670734939);
		if (i == 1) {
			int i_2_ = class523_sub34.readUnsignedByte(-1243395740);
			aBool2310 = 0 != (i_2_ & 0x1);
			aBool2315 = (i_2_ & 0x2) != 0;
			aBool2304 = (i_2_ & 0x4) != 0;
			anInt2318 = class523_sub34.readUnsignedInt((byte) -53) * -1541608117;
			aLong2308 = (class523_sub34.readLong((byte) -52) * 7823073037239365673L);
			aString2313 = class523_sub34.readString(-1194394745);
			anInt2311 = class523_sub34.readShort(1875562760) * 1157464405;
			class523_sub34.readUnsignedInt((byte) -6);
			class523_sub34.readLong((byte) -117);
			int i_3_ = class523_sub34.readUnsignedShort(-1023131162);
			anArrayList2305 = new ArrayList(i_3_);
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
				anArrayList2305.add(new Class229(class523_sub34, aBool2315, aBool2304, interface27));
			int i_5_ = class523_sub34.readUnsignedShort(-1393398927);
			anArrayList2314 = new ArrayList(i_5_);
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
				anArrayList2314.add(new Class212(class523_sub34, aBool2315, aBool2304));
			aClass4_2312 = new Class4(interface27.method160(1215182171));
			int i_7_ = class523_sub34.readUnsignedShort(-1075028645);
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
				Class426 class426 = interface27.method160(1215182171).refreshNIS(class523_sub34, 942298695);
				aClass4_2312.method14(-408785679 * class426.anInt4821, class426.anObject4822, -1874145022);
			}
			if (!bool) {
				class523_sub34.readUnsignedShort(-1680608802);
				class523_sub34.readUnsignedShort(-2102843045);
				class523_sub34.readUnsignedShort(-65401885);
				class523_sub34.readUnsignedShort(-188989280);
				class523_sub34.readUnsignedShort(-751816081);
			}
			method3999((byte) 115);
		}
	}

	public List method3961() {
		return Collections.unmodifiableList(anArrayList2305);
	}

	void method3962(Class212 class212, int i) {
		anArrayList2314.add(class212);
	}

	void method3963(int i, Class229 class229, int i_9_) {
		Class229 class229_10_ = (Class229) anArrayList2305.get(i);
		class229_10_.method4191(class229, 300875996);
	}

	void method3964(int i) {
		Iterator iterator = anArrayList2305.iterator();
		while (iterator.hasNext()) {
			Class229 class229 = (Class229) iterator.next();
			class229.method4185(Class251.aClass251_2712, -408501989);
		}
	}

	public int method3965(int i) {
		return anInt2317 * 2045439707;
	}

	public Class251 method3966(int i) {
		if (anArrayList2305.isEmpty())
			return Class251.aClass251_2710;
		Class251 class251 = ((Class229) anArrayList2305.get(0)).method4225(1914675911);
		switch (class251.anInt2713 * -1097855183) {
		case 1:
		case 3:
			return class251;
		default: {
			Iterator iterator = anArrayList2305.iterator();
			while (iterator.hasNext()) {
				Class229 class229 = (Class229) iterator.next();
				if (class229.method4225(1918831003) == Class251.aClass251_2710)
					return Class251.aClass251_2710;
			}
			return Class251.aClass251_2711;
		}
		}
	}

	public Class229 method3967(int i, byte i_11_) {
		if (i == -1)
			return null;
		return (Class229) anArrayList2305.get(i);
	}

	public String method3968(int i) {
		return aString2313;
	}

	public List method3969(int i) {
		return Collections.unmodifiableList(anArrayList2305);
	}

	void method3970(Class229 class229, int i) {
		anArrayList2305.add(class229);
		method3999((byte) 78);
	}

	void method3971(int i, byte i_12_) {
		anArrayList2305.remove(i);
		method3999((byte) 93);
	}

	public List method3972(short i) {
		return Collections.unmodifiableList(anArrayList2314);
	}

	void method3973(int i, int i_13_) {
		anArrayList2314.remove(i);
	}

	void method3974(int i, int i_14_) {
		Class229 class229 = (Class229) anArrayList2305.get(i);
		class229.method4181(i_14_, (byte) 0);
		class229.method4183(true, (byte) -89);
	}

	public int method3975() {
		return (int) (aLong2307 * 7686009528133188889L);
	}

	void method3976(int i, byte i_15_) {
		Class229 class229 = (Class229) anArrayList2305.get(i);
		class229.method4183(false, (byte) -14);
	}

	void method3977(int i, boolean bool, int i_16_) {
		Class229 class229 = (Class229) anArrayList2305.get(i);
		class229.method4185((bool ? Class251.aClass251_2711 : Class251.aClass251_2710), -1479358992);
	}

	void method3978(int i, int i_17_, byte i_18_) {
		((Class229) anArrayList2305.get(i)).method4187(i_17_, 1486880042);
	}

	void method3979(int i, int i_19_) {
		((Class229) anArrayList2305.get(i)).method4187(i_19_, 1486880042);
	}

	void method3980(int i) {
		Iterator iterator = anArrayList2305.iterator();
		while (iterator.hasNext()) {
			Class229 class229 = (Class229) iterator.next();
			class229.method4185(Class251.aClass251_2715, -345991938);
		}
	}

	void method3981(int i, int i_20_, int i_21_) {
		((Class229) anArrayList2305.get(i)).method4178(i_20_, (byte) 67);
		method3999((byte) 113);
	}

	void method3982(int i, int i_22_, byte i_23_) {
		Class229 class229 = (Class229) anArrayList2305.get(i);
		class229.method4181(i_22_, (byte) -127);
		class229.method4183(true, (byte) -12);
	}

	public List method3983() {
		return Collections.unmodifiableList(anArrayList2314);
	}

	public List method3984() {
		return Collections.unmodifiableList(anArrayList2314);
	}

	public List method3985() {
		return Collections.unmodifiableList(anArrayList2314);
	}

	public int method3986() {
		return anInt2317 * 2045439707;
	}

	int method3987() {
		return 414659683 * anInt2318;
	}

	void method3988() {
		anInt2318 += -1541608117;
	}

	public boolean method3989() {
		return aBool2310;
	}

	public boolean method3990() {
		return aBool2310;
	}

	public int method3991() {
		return anInt2311 * -957975555;
	}

	public int method3992() {
		return anInt2311 * -957975555;
	}

	public int method3993() {
		return anInt2311 * -957975555;
	}

	public int method3994() {
		return anInt2311 * -957975555;
	}

	public int method3995() {
		return anInt2311 * -957975555;
	}

	public long method3996() {
		return 8647122326697798681L * aLong2308;
	}

	public long method3997() {
		return 8647122326697798681L * aLong2308;
	}

	void method3998(int i, int i_24_) {
		((Class229) anArrayList2305.get(i)).method4187(i_24_, 1486880042);
	}

	void method3999(byte i) {
		int i_25_ = -1;
		int i_26_ = -1;
		for (int i_27_ = 0; i_27_ < anArrayList2305.size(); i_27_++) {
			Class229 class229 = (Class229) anArrayList2305.get(i_27_);
			int i_28_ = class229.method4198(-606857992);
			if (i_28_ > i_25_) {
				i_25_ = i_28_;
				i_26_ = i_27_;
			}
		}
		anInt2317 = -673358509 * i_26_;
	}

	public boolean method4000(byte i) {
		return aBool2310;
	}

	public int method4001() {
		return anInt2317 * 2045439707;
	}

	public Class229 method4002(int i) {
		if (i == -1)
			return null;
		return (Class229) anArrayList2305.get(i);
	}

	public Class229 method4003(int i) {
		if (i == -1)
			return null;
		return (Class229) anArrayList2305.get(i);
	}

	int method4004() {
		return 414659683 * anInt2318;
	}

	public Class229 method4005(int i) {
		if (i == -1)
			return null;
		return (Class229) anArrayList2305.get(i);
	}

	public Class229 method4006(int i) {
		if (i == -1)
			return null;
		return (Class229) anArrayList2305.get(i);
	}

	void method4007(Class229 class229) {
		anArrayList2305.add(class229);
		method3999((byte) 101);
	}

	public Interface20 method4008() {
		return new Class149(VarDomainType.aClass470_5345, aClass4_2312);
	}

	public Interface20 method4009() {
		return new Class149(VarDomainType.aClass470_5345, aClass4_2312);
	}

	public Interface20 method4010() {
		return new Class149(VarDomainType.aClass470_5345, aClass4_2312);
	}

	public Interface20 method4011() {
		return new Class149(VarDomainType.aClass470_5345, aClass4_2312);
	}

	void method4012(int i, int i_29_) {
		((Class229) anArrayList2305.get(i)).method4178(i_29_, (byte) 27);
		method3999((byte) 18);
	}

	void method4013(int i) {
		anArrayList2305.remove(i);
		method3999((byte) 126);
	}

	void method4014(Class212 class212) {
		anArrayList2314.add(class212);
	}

	void method4015(Class212 class212) {
		anArrayList2314.add(class212);
	}

	void method4016(Class212 class212) {
		anArrayList2314.add(class212);
	}

	void method4017(int i) {
		anArrayList2314.remove(i);
	}

	void method4018(int i) {
		anArrayList2314.remove(i);
	}

	void method4019(int i) {
		anArrayList2314.remove(i);
	}

	void method4020() {
		Iterator iterator = anArrayList2305.iterator();
		while (iterator.hasNext()) {
			Class229 class229 = (Class229) iterator.next();
			class229.method4185(Class251.aClass251_2715, -1299482347);
		}
	}

	void method4021(int i, int i_30_) {
		((Class229) anArrayList2305.get(i)).method4178(i_30_, (byte) 78);
		method3999((byte) 114);
	}

	void method4022(int i, int i_31_) {
		Class229 class229 = (Class229) anArrayList2305.get(i);
		class229.method4181(i_31_, (byte) -12);
		class229.method4183(true, (byte) -91);
	}

	public long method4023(byte i) {
		return 8647122326697798681L * aLong2308;
	}

	public Interface20 method4024(int i) {
		return new Class149(VarDomainType.aClass470_5345, aClass4_2312);
	}

	void method4025(int i, int i_32_) {
		Class229 class229 = (Class229) anArrayList2305.get(i);
		class229.method4181(i_32_, (byte) -31);
		class229.method4183(true, (byte) -1);
	}

	void method4026(int i, int i_33_) {
		((Class229) anArrayList2305.get(i)).method4187(i_33_, 1486880042);
	}

	public Class229 method4027(int i) {
		if (i == -1)
			return null;
		return (Class229) anArrayList2305.get(i);
	}

	void method4028() {
		int i = -1;
		int i_34_ = -1;
		for (int i_35_ = 0; i_35_ < anArrayList2305.size(); i_35_++) {
			Class229 class229 = (Class229) anArrayList2305.get(i_35_);
			int i_36_ = class229.method4198(-606857992);
			if (i_36_ > i) {
				i = i_36_;
				i_34_ = i_35_;
			}
		}
		anInt2317 = -673358509 * i_34_;
	}

	void method4029() {
		Iterator iterator = anArrayList2305.iterator();
		while (iterator.hasNext()) {
			Class229 class229 = (Class229) iterator.next();
			class229.method4185(Class251.aClass251_2712, -311942045);
		}
	}

	void method4030() {
		Iterator iterator = anArrayList2305.iterator();
		while (iterator.hasNext()) {
			Class229 class229 = (Class229) iterator.next();
			class229.method4185(Class251.aClass251_2712, -1065799260);
		}
	}

	void method4031() {
		Iterator iterator = anArrayList2305.iterator();
		while (iterator.hasNext()) {
			Class229 class229 = (Class229) iterator.next();
			class229.method4185(Class251.aClass251_2715, -882636957);
		}
	}

	public int hashCode() {
		return (int) (aLong2307 * 7686009528133188889L);
	}

	public int method4032(short i) {
		return anInt2311 * -957975555;
	}

	void method4033(int i, Class229 class229) {
		Class229 class229_37_ = (Class229) anArrayList2305.get(i);
		class229_37_.method4191(class229, 300875996);
	}

	static final void method4034(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class551.method9142(class250, class242, class669, 964576300);
	}

	public static Class691[] method4035(int i) {
		return (new Class691[] { Class691.aClass691_8697, Class691.aClass691_8691, Class691.aClass691_8692, Class691.aClass691_8693, Class691.aClass691_8698, Class691.aClass691_8700, Class691.aClass691_8696, Class691.aClass691_8694, Class691.aClass691_8695 });
	}

	static Class705[] method4036(int i) {
		return (new Class705[] { Class705.aClass705_8816, Class705.aClass705_8814, Class705.aClass705_8815 });
	}

	static final void method4037(Class669 class669, byte i) {
		int i_38_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub14_10598.method13890(i_38_, 2136470446);
	}
}
