/* Class384 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class384 implements Interface49 {
	public int anInt3967;
	public Class389 aClass389_3968;
	public int anInt3969;
	public int anInt3970;
	public int anInt3971;
	public int anInt3972;
	public int anInt3973;
	public Class380 aClass380_3974;
	public int anInt3975;

	Class384(Class380 class380, Class389 class389, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		aClass380_3974 = class380;
		aClass389_3968 = class389;
		anInt3970 = 1049578935 * i;
		anInt3969 = i_0_ * 1755452807;
		anInt3971 = -48211485 * i_1_;
		anInt3972 = 1112626621 * i_2_;
		anInt3973 = i_3_ * 830709419;
		anInt3967 = i_4_ * 2029904459;
		anInt3975 = -1057064863 * i_5_;
	}

	public Class394 method353(int i) {
		return null;
	}

	public Class394 method352() {
		return null;
	}

	public Class394 method354() {
		return null;
	}

	public Class394 method351() {
		return null;
	}

	static Class384 method6425(Class523_Sub34 class523_sub34) {
		Class380 class380 = (Class228.method4175(423562249)[class523_sub34.readUnsignedByte(-1115813800)]);
		Class389 class389 = (Class25.method843(-1703137411)[class523_sub34.readUnsignedByte(-1685174991)]);
		int i = class523_sub34.readShort(-801687147);
		int i_6_ = class523_sub34.readShort(-352485270);
		int i_7_ = class523_sub34.readUnsignedShort(-1476560095);
		int i_8_ = class523_sub34.readUnsignedShort(-2058054412);
		int i_9_ = class523_sub34.readShort(1552102963);
		int i_10_ = class523_sub34.readBigSmart((byte) -65);
		int i_11_ = class523_sub34.readUnsignedInt((byte) -36);
		return new Class384(class380, class389, i, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_);
	}

	public static Class391 method6426(Class523_Sub34 class523_sub34, byte i) {
		int i_12_ = class523_sub34.readBigSmart((byte) -96);
		return new Class391(i_12_);
	}

	static final void method6427(Class669 class669, byte i) {
		Class561.method9457(Class63.method1430(-2045515673), class669, 790024078);
	}

	static void method6428(Class669 class669, int i) {
		Class280 class280 = ((Class280) Class655.aClass58_Sub1_8422.getDefinition((class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)]), (byte) -6));
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (null == class280.anIntArray3052 ? 0 : class280.anIntArray3052.length);
	}
}
