/* Class523_Sub27_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523_Sub27_Sub19 extends Class523_Sub27 {
	public String aString11844;
	public Object[] anObjectArray11845;
	public Class514[] aClass514Array11846;
	public int[] anIntArray11847;
	public int anInt11848;
	public int anInt11849;
	public Class572 aClass572_11850;
	public int anInt11851;
	public int anInt11852;
	public int anInt11853;
	public int anInt11854;
	public Class14[] aClass14Array11855;
	Interface19 anInterface19_11856;

	Class514 method18273(RSBuffer class523_sub34, Class514[] class514s) {
		int i = class523_sub34.readUnsignedShort(-312623747);
		if (i < 0 || i >= class514s.length)
			throw new RuntimeException("");
		Class514 class514 = class514s[i];
		return class514;
	}

	Class514 method18274(RSBuffer class523_sub34, Class514[] class514s, int i) {
		int i_0_ = class523_sub34.readUnsignedShort(-1357750907);
		if (i_0_ < 0 || i_0_ >= class514s.length)
			throw new RuntimeException("");
		Class514 class514 = class514s[i_0_];
		return class514;
	}

	int method18275(RSBuffer class523_sub34, int i) {
		class523_sub34.offset = (class523_sub34.buffer.length - 2) * 189765723;
		int i_1_ = class523_sub34.readUnsignedShort(-1424530319);
		int i_2_ = class523_sub34.buffer.length - 2 - i_1_ - 16;
		class523_sub34.offset = i_2_ * 189765723;
		int i_3_ = class523_sub34.readUnsignedInt((byte) -101);
		anInt11849 = class523_sub34.readUnsignedShort(-415464336) * 1454050379;
		anInt11848 = class523_sub34.readUnsignedShort(-1418072369) * -1015614577;
		anInt11854 = class523_sub34.readUnsignedShort(-2054175109) * 1019714973;
		anInt11851 = class523_sub34.readUnsignedShort(-1037660632) * -2127184121;
		anInt11853 = class523_sub34.readUnsignedShort(-210832645) * -1434947011;
		anInt11852 = class523_sub34.readUnsignedShort(-687876320) * -1625360215;
		int i_4_ = class523_sub34.readUnsignedByte(-621028462);
		if (i_4_ > 0) {
			aClass14Array11855 = new Class14[i_4_];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				int i_6_ = class523_sub34.readUnsignedShort(-739310397);
				Class14 class14 = new Class14(Class628.method10313(i_6_, 1242045553));
				aClass14Array11855[i_5_] = class14;
				while (i_6_-- > 0) {
					int i_7_ = class523_sub34.readUnsignedInt((byte) -26);
					int i_8_ = class523_sub34.readUnsignedInt((byte) -114);
					class14.method738(new Class523_Sub24(i_8_), (long) i_7_);
				}
			}
		}
		class523_sub34.offset = 0;
		aString11844 = class523_sub34.method16363((byte) -30);
		aClass514Array11846 = new Class514[i_3_];
		return i_2_;
	}

	void method18276(RSBuffer class523_sub34, int i, Class514 class514, int i_9_) {
		int i_10_ = aClass514Array11846.length;
		if (Class514.aClass514_5768 == class514 || Class514.aClass514_5769 == class514) {
			VarDomainType class470 = ((VarDomainType) Class334.method5910(VarDomainType.getVarDomainTypes((byte) -65), class523_sub34.readUnsignedByte(1365046724), 94734504));
			int i_11_ = class523_sub34.readUnsignedShort(-1591202694);
			if (null == anObjectArray11845)
				anObjectArray11845 = new Object[i_10_];
			anObjectArray11845[i] = anInterface19_11856.method110(class470, i_11_, 1328687489);
			if (null == anIntArray11847)
				anIntArray11847 = new int[i_10_];
			anIntArray11847[i] = class523_sub34.readUnsignedByte(1915432796);
		} else if (Class514.aClass514_5772 == class514) {
			BaseVarType class474 = ((BaseVarType) Class334.method5910(BaseVarType.method7746(1087958472), class523_sub34.readUnsignedByte(-1514420909), 400405322));
			switch (-1710999695 * class474.anInt5386) {
			case 1:
				if (anObjectArray11845 == null)
					anObjectArray11845 = new Object[i_10_];
				class514 = Class514.aClass514_6755;
				anObjectArray11845[i] = Long.valueOf(class523_sub34.readLong((byte) -100));
				break;
			default:
				throw new RuntimeException();
			case 0:
				if (anIntArray11847 == null)
					anIntArray11847 = new int[i_10_];
				class514 = Class514.aClass514_6832;
				anIntArray11847[i] = class523_sub34.readUnsignedInt((byte) -88);
				break;
			case 2:
				if (null == anObjectArray11845)
					anObjectArray11845 = new Object[i_10_];
				anObjectArray11845[i] = class523_sub34.readString(-2011590980).intern();
			}
		} else if (class514 == Class514.aClass514_6110 || class514 == Class514.aClass514_6655) {
			int i_12_ = class523_sub34.readUnsignedShort(-484039003);
			if (null == anObjectArray11845)
				anObjectArray11845 = new Object[i_10_];
			anObjectArray11845[i] = anInterface19_11856.method106(i_12_, 1582019161);
			if (null == anIntArray11847)
				anIntArray11847 = new int[i_10_];
			anIntArray11847[i] = class523_sub34.readUnsignedByte(1555506906);
		} else {
			if (anIntArray11847 == null)
				anIntArray11847 = new int[i_10_];
			if (class514 != null && class514.aBool7039)
				anIntArray11847[i] = class523_sub34.readUnsignedInt((byte) -90);
			else
				anIntArray11847[i] = class523_sub34.readUnsignedByte(-500586139);
		}
		aClass514Array11846[i] = class514;
	}

	public Class523_Sub27_Sub19(RSBuffer class523_sub34, Interface19 interface19) {
		anInterface19_11856 = interface19;
		int i = method18275(class523_sub34, -1849153217);
		int i_13_ = 0;
		Class514[] class514s = Class484.method7929(-736713513);
		while (2349011 * class523_sub34.offset < i) {
			Class514 class514 = method18274(class523_sub34, class514s, 2088606336);
			method18276(class523_sub34, i_13_, class514, -606031200);
			i_13_++;
		}
	}

	Class514 method18277(RSBuffer class523_sub34, Class514[] class514s) {
		int i = class523_sub34.readUnsignedShort(-1479364006);
		if (i < 0 || i >= class514s.length)
			throw new RuntimeException("");
		Class514 class514 = class514s[i];
		return class514;
	}

	Class514 method18278(RSBuffer class523_sub34, Class514[] class514s) {
		int i = class523_sub34.readUnsignedShort(-498319943);
		if (i < 0 || i >= class514s.length)
			throw new RuntimeException("");
		Class514 class514 = class514s[i];
		return class514;
	}

	Class514 method18279(RSBuffer class523_sub34, Class514[] class514s) {
		int i = class523_sub34.readUnsignedShort(-1860144395);
		if (i < 0 || i >= class514s.length)
			throw new RuntimeException("");
		Class514 class514 = class514s[i];
		return class514;
	}

	Class514 method18280(RSBuffer class523_sub34, Class514[] class514s) {
		int i = class523_sub34.readUnsignedShort(-268783965);
		if (i < 0 || i >= class514s.length)
			throw new RuntimeException("");
		Class514 class514 = class514s[i];
		return class514;
	}

	int method18281(RSBuffer class523_sub34) {
		class523_sub34.offset = (class523_sub34.buffer.length - 2) * 189765723;
		int i = class523_sub34.readUnsignedShort(-731433173);
		int i_14_ = class523_sub34.buffer.length - 2 - i - 16;
		class523_sub34.offset = i_14_ * 189765723;
		int i_15_ = class523_sub34.readUnsignedInt((byte) -112);
		anInt11849 = class523_sub34.readUnsignedShort(-443364260) * 1454050379;
		anInt11848 = class523_sub34.readUnsignedShort(-402007740) * -1015614577;
		anInt11854 = class523_sub34.readUnsignedShort(-525461128) * 1019714973;
		anInt11851 = class523_sub34.readUnsignedShort(-1914950155) * -2127184121;
		anInt11853 = class523_sub34.readUnsignedShort(-1018908237) * -1434947011;
		anInt11852 = class523_sub34.readUnsignedShort(-269969481) * -1625360215;
		int i_16_ = class523_sub34.readUnsignedByte(-686453890);
		if (i_16_ > 0) {
			aClass14Array11855 = new Class14[i_16_];
			for (int i_17_ = 0; i_17_ < i_16_; i_17_++) {
				int i_18_ = class523_sub34.readUnsignedShort(-415572238);
				Class14 class14 = new Class14(Class628.method10313(i_18_, -1392259319));
				aClass14Array11855[i_17_] = class14;
				while (i_18_-- > 0) {
					int i_19_ = class523_sub34.readUnsignedInt((byte) -61);
					int i_20_ = class523_sub34.readUnsignedInt((byte) -47);
					class14.method738(new Class523_Sub24(i_20_), (long) i_19_);
				}
			}
		}
		class523_sub34.offset = 0;
		aString11844 = class523_sub34.method16363((byte) -15);
		aClass514Array11846 = new Class514[i_15_];
		return i_14_;
	}

	void method18282(RSBuffer class523_sub34, int i, Class514 class514) {
		int i_21_ = aClass514Array11846.length;
		if (Class514.aClass514_5768 == class514 || Class514.aClass514_5769 == class514) {
			VarDomainType class470 = ((VarDomainType) Class334.method5910(VarDomainType.getVarDomainTypes((byte) -24), class523_sub34.readUnsignedByte(-526216049), -1797107514));
			int i_22_ = class523_sub34.readUnsignedShort(-1624262046);
			if (null == anObjectArray11845)
				anObjectArray11845 = new Object[i_21_];
			anObjectArray11845[i] = anInterface19_11856.method110(class470, i_22_, 2058253885);
			if (null == anIntArray11847)
				anIntArray11847 = new int[i_21_];
			anIntArray11847[i] = class523_sub34.readUnsignedByte(-1399546673);
		} else if (Class514.aClass514_5772 == class514) {
			BaseVarType class474 = ((BaseVarType) Class334.method5910(BaseVarType.method7746(1837696919), class523_sub34.readUnsignedByte(896011592), 349525124));
			switch (-1710999695 * class474.anInt5386) {
			case 1:
				if (anObjectArray11845 == null)
					anObjectArray11845 = new Object[i_21_];
				class514 = Class514.aClass514_6755;
				anObjectArray11845[i] = Long.valueOf(class523_sub34.readLong((byte) -53));
				break;
			default:
				throw new RuntimeException();
			case 0:
				if (anIntArray11847 == null)
					anIntArray11847 = new int[i_21_];
				class514 = Class514.aClass514_6832;
				anIntArray11847[i] = class523_sub34.readUnsignedInt((byte) -125);
				break;
			case 2:
				if (null == anObjectArray11845)
					anObjectArray11845 = new Object[i_21_];
				anObjectArray11845[i] = class523_sub34.readString(-1599254046).intern();
			}
		} else if (class514 == Class514.aClass514_6110 || class514 == Class514.aClass514_6655) {
			int i_23_ = class523_sub34.readUnsignedShort(-1849078514);
			if (null == anObjectArray11845)
				anObjectArray11845 = new Object[i_21_];
			anObjectArray11845[i] = anInterface19_11856.method106(i_23_, -610432285);
			if (null == anIntArray11847)
				anIntArray11847 = new int[i_21_];
			anIntArray11847[i] = class523_sub34.readUnsignedByte(1085486408);
		} else {
			if (anIntArray11847 == null)
				anIntArray11847 = new int[i_21_];
			if (class514 != null && class514.aBool7039)
				anIntArray11847[i] = class523_sub34.readUnsignedInt((byte) -11);
			else
				anIntArray11847[i] = class523_sub34.readUnsignedByte(-2087164099);
		}
		aClass514Array11846[i] = class514;
	}
}
