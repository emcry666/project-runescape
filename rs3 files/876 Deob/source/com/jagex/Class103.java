/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class103 {
	int anInt1248;
	float aFloat1249 = 1.0F;
	float aFloat1250 = 1.0F;
	int anInt1251;
	int anInt1252;
	int anInt1253;
	int anInt1254;
	int anInt1255;
	float aFloat1256;
	int anInt1257;
	int anInt1258;

	Class103(int i) {
		anInt1258 = i * -1951506291;
	}

	Class103 method1804() {
		return new Class103(330457669 * anInt1258, aFloat1249, aFloat1250, -34734835 * anInt1248, anInt1251 * 1665462351, anInt1253 * 212895487);
	}

	Class103 method1805(int i) {
		return new Class103(330457669 * anInt1258, aFloat1249, aFloat1250, -34734835 * anInt1248, anInt1251 * 1665462351, anInt1253 * 212895487);
	}

	void method1806(Class103 class103_0_, int i) {
		aFloat1249 = class103_0_.aFloat1249;
		aFloat1250 = class103_0_.aFloat1250;
		anInt1248 = 1 * class103_0_.anInt1248;
		anInt1251 = 1 * class103_0_.anInt1251;
		anInt1258 = class103_0_.anInt1258 * 1;
		anInt1253 = 1 * class103_0_.anInt1253;
	}

	Class103(int i, float f, float f_1_, int i_2_, int i_3_, int i_4_) {
		anInt1258 = -1951506291 * i;
		aFloat1249 = f;
		aFloat1250 = f_1_;
		anInt1248 = 356391365 * i_2_;
		anInt1251 = 1938564783 * i_3_;
		anInt1253 = i_4_ * 891189503;
	}

	void method1807(Class103 class103_5_) {
		aFloat1249 = class103_5_.aFloat1249;
		aFloat1250 = class103_5_.aFloat1250;
		anInt1248 = 1 * class103_5_.anInt1248;
		anInt1251 = 1 * class103_5_.anInt1251;
		anInt1258 = class103_5_.anInt1258 * 1;
		anInt1253 = 1 * class103_5_.anInt1253;
	}

	void method1808(Class103 class103_6_) {
		aFloat1249 = class103_6_.aFloat1249;
		aFloat1250 = class103_6_.aFloat1250;
		anInt1248 = 1 * class103_6_.anInt1248;
		anInt1251 = 1 * class103_6_.anInt1251;
		anInt1258 = class103_6_.anInt1258 * 1;
		anInt1253 = 1 * class103_6_.anInt1253;
	}

	void method1809(Class103 class103_7_) {
		aFloat1249 = class103_7_.aFloat1249;
		aFloat1250 = class103_7_.aFloat1250;
		anInt1248 = 1 * class103_7_.anInt1248;
		anInt1251 = 1 * class103_7_.anInt1251;
		anInt1258 = class103_7_.anInt1258 * 1;
		anInt1253 = 1 * class103_7_.anInt1253;
	}

	static final void method1810(Class669 class669, byte i) {
		class669.anInt8558 -= -34844996;
		int i_8_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_9_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		int i_10_ = class669.anIntArray8557[2 + class669.anInt8558 * 1357652815];
		int i_11_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 3];
		ClientScriptDefinitions class37 = ((ClientScriptDefinitions) Class394.aClass53_Sub16_4056.getDefinition(i_10_, (byte) -54));
		if (class37.keyType.method82() != i_8_ || class37.valueType.method82() != i_9_)
			throw new RuntimeException(new StringBuilder().append(i_10_).append(" ").append(i_11_).toString());
		if (i_9_ == Class464.aClass464_5165.method82())
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class37.getStringValue(i_11_, -386694338);
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class37.getIntValue(i_11_, 878645558);
	}

	static final void method1811(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class669.aClass334_8571.anInt3532 * -987004643;
	}

	static final void method1812(Class669 class669, byte i) throws Exception_Sub7 {
		class669.anInt8558 -= -17422498;
		int i_12_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		Class437 class437 = Class437.method6879((float) i_12_, (float) i_12_, (float) i_12_);
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5308(class437, -259610649);
		class437.method6949();
	}
}
