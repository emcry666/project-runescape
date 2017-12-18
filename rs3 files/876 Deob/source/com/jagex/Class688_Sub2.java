/* Class688_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class688_Sub2 extends Class688 {
	Class437 aClass437_10929;
	Class437 aClass437_10930 = new Class437();
	Interface31 anInterface31_10931;
	Class437 aClass437_10932 = new Class437(Float.NaN, Float.NaN, Float.NaN);
	boolean aBool10933;
	Class437 aClass437_10934;

	public Class437 method13921() {
		Class437 class437 = Class437.method6884(aClass437_10929);
		Class437 class437_0_ = Class437.method6884(aClass437_10930);
		if (aBool10933)
			class437_0_.method6907(anInterface31_10931.method179(341854532));
		class437.method6961(class437_0_);
		class437_0_.method6949();
		return class437;
	}

	public Class437 method13918() {
		Class437 class437 = Class437.method6884(aClass437_10929);
		Class437 class437_1_ = Class437.method6884(aClass437_10930);
		if (aBool10933)
			class437_1_.method6907(anInterface31_10931.method179(830377400));
		class437.method6961(class437_1_);
		class437_1_.method6949();
		return class437;
	}

	public void method17078(byte i) {
		if (null != anInterface31_10931)
			anInterface31_10931 = (aClass298_8675.method5402((byte) -8).method174(anInterface31_10931.method176((byte) 12), anInterface31_10931.method69(365587714), 1731208491));
	}

	public void method17079(Interface31 interface31, Class437 class437, boolean bool) {
		anInterface31_10931 = interface31;
		aClass437_10930.method6886(class437);
		aBool10933 = bool;
		interface31.method181(972604367);
	}

	public void method17080(Interface31 interface31, Class437 class437, boolean bool, byte i) {
		anInterface31_10931 = interface31;
		aClass437_10930.method6886(class437);
		aBool10933 = bool;
		interface31.method181(391301671);
	}

	public void method13904(Class307 class307, Class435 class435, int i, int i_2_, float f, int i_3_) {
		Class437 class437 = Class437.method6884(aClass298_8675.method5378(1803369239));
		class437.aFloat4903 -= (float) i;
		class437.aFloat4905 -= (float) i_2_;
		class437.aFloat4904 *= -1.0F;
		Class437 class437_4_ = method13909(1098112522);
		class437_4_.aFloat4903 -= (float) i;
		class437_4_.aFloat4905 -= (float) i_2_;
		class437_4_.aFloat4904 *= -1.0F;
		class435.method6807((double) class437.aFloat4903, (double) class437.aFloat4904, (double) class437.aFloat4905, (double) class437_4_.aFloat4903, (double) class437_4_.aFloat4904, (double) class437_4_.aFloat4905, 0.0F, 1.0F, 0.0F);
		class437.method6949();
		class437_4_.method6949();
	}

	public Class437 method13909(int i) {
		Class437 class437 = Class437.method6884(aClass437_10932);
		Class437 class437_5_ = Class437.method6884(aClass437_10930);
		if (aBool10933)
			class437_5_.method6907(anInterface31_10931.method179(625309907));
		class437.method6961(class437_5_);
		class437_5_.method6949();
		return class437;
	}

	public Class437 method13908(int i) {
		Class437 class437 = Class437.method6884(aClass437_10929);
		Class437 class437_6_ = Class437.method6884(aClass437_10930);
		if (aBool10933)
			class437_6_.method6907(anInterface31_10931.method179(918100198));
		class437.method6961(class437_6_);
		class437_6_.method6949();
		return class437;
	}

	public Class437 method17081(byte i) {
		return aClass437_10932;
	}

	public void method13910(RSBuffer class523_sub34, int i) {
		Class292 class292 = Class60.method1402(class523_sub34.readUnsignedByte(-1256883156), -290009836);
		int i_7_ = class523_sub34.readUnsignedShort(-855201349);
		anInterface31_10931 = aClass298_8675.method5402((byte) -8).method174(class292, i_7_, 1750876744);
		aClass437_10930.method6941(class523_sub34);
		if (class523_sub34.readUnsignedByte(-422782430) == 1)
			aBool10933 = true;
		else
			aBool10933 = false;
	}

	public Class437 method13927() {
		Class437 class437 = Class437.method6884(aClass437_10929);
		Class437 class437_8_ = Class437.method6884(aClass437_10930);
		if (aBool10933)
			class437_8_.method6907(anInterface31_10931.method179(312354053));
		class437.method6961(class437_8_);
		class437_8_.method6949();
		return class437;
	}

	public void method13912(float f) {
		if (null != anInterface31_10931) {
			aClass437_10929.method6886(anInterface31_10931.method181(1914061837).method16163((byte) 16));
			aClass298_8675.method5310(false, f, aClass437_10932, aClass298_8675.method5376((short) 256), aClass437_10929, aClass437_10934, (byte) -76);
		}
	}

	public Class437 method13920() {
		Class437 class437 = Class437.method6884(aClass437_10929);
		Class437 class437_9_ = Class437.method6884(aClass437_10930);
		if (aBool10933)
			class437_9_.method6907(anInterface31_10931.method179(1640155512));
		class437.method6961(class437_9_);
		class437_9_.method6949();
		return class437;
	}

	public boolean method13914() {
		return !Float.isNaN(aClass437_10932.aFloat4903);
	}

	public void method13913(float f) {
		if (null != anInterface31_10931) {
			aClass437_10929.method6886(anInterface31_10931.method181(-15877076).method16163((byte) -12));
			aClass298_8675.method5310(false, f, aClass437_10932, aClass298_8675.method5376((short) 256), aClass437_10929, aClass437_10934, (byte) -60);
		}
	}

	public boolean method13906(int i) {
		return !Float.isNaN(aClass437_10932.aFloat4903);
	}

	public Class437 method13917() {
		Class437 class437 = Class437.method6884(aClass437_10929);
		Class437 class437_10_ = Class437.method6884(aClass437_10930);
		if (aBool10933)
			class437_10_.method6907(anInterface31_10931.method179(1350232107));
		class437.method6961(class437_10_);
		class437_10_.method6949();
		return class437;
	}

	public Class437 method13905() {
		Class437 class437 = Class437.method6884(aClass437_10929);
		Class437 class437_11_ = Class437.method6884(aClass437_10930);
		if (aBool10933)
			class437_11_.method6907(anInterface31_10931.method179(1478936651));
		class437.method6961(class437_11_);
		class437_11_.method6949();
		return class437;
	}

	public Class437 method13907() {
		Class437 class437 = Class437.method6884(aClass437_10929);
		Class437 class437_12_ = Class437.method6884(aClass437_10930);
		if (aBool10933)
			class437_12_.method6907(anInterface31_10931.method179(1138472068));
		class437.method6961(class437_12_);
		class437_12_.method6949();
		return class437;
	}

	public void method13924(float f, byte i) {
		if (null != anInterface31_10931) {
			aClass437_10929.method6886(anInterface31_10931.method181(2103527449).method16163((byte) 20));
			aClass298_8675.method5310(false, f, aClass437_10932, aClass298_8675.method5376((short) 256), aClass437_10929, aClass437_10934, (byte) -120);
		}
	}

	public void method13925(RSBuffer class523_sub34) {
		Class292 class292 = Class60.method1402(class523_sub34.readUnsignedByte(1186528906), -290009836);
		int i = class523_sub34.readUnsignedShort(-338942436);
		anInterface31_10931 = aClass298_8675.method5402((byte) -8).method174(class292, i, -995793041);
		aClass437_10930.method6941(class523_sub34);
		if (class523_sub34.readUnsignedByte(-1940983222) == 1)
			aBool10933 = true;
		else
			aBool10933 = false;
	}

	public void method13916(Class307 class307, Class435 class435, int i, int i_13_, float f) {
		Class437 class437 = Class437.method6884(aClass298_8675.method5378(1334965130));
		class437.aFloat4903 -= (float) i;
		class437.aFloat4905 -= (float) i_13_;
		class437.aFloat4904 *= -1.0F;
		Class437 class437_14_ = method13909(1581879397);
		class437_14_.aFloat4903 -= (float) i;
		class437_14_.aFloat4905 -= (float) i_13_;
		class437_14_.aFloat4904 *= -1.0F;
		class435.method6807((double) class437.aFloat4903, (double) class437.aFloat4904, (double) class437.aFloat4905, (double) class437_14_.aFloat4903, (double) class437_14_.aFloat4904, (double) class437_14_.aFloat4905, 0.0F, 1.0F, 0.0F);
		class437.method6949();
		class437_14_.method6949();
	}

	public Class437 method13923() {
		Class437 class437 = Class437.method6884(aClass437_10929);
		Class437 class437_15_ = Class437.method6884(aClass437_10930);
		if (aBool10933)
			class437_15_.method6907(anInterface31_10931.method179(1480535834));
		class437.method6961(class437_15_);
		class437_15_.method6949();
		return class437;
	}

	public Class688_Sub2(Class298 class298) {
		super(class298);
		aClass437_10929 = new Class437(Float.NaN, Float.NaN, Float.NaN);
		aClass437_10934 = new Class437();
	}

	public void method13911(float f) {
		if (null != anInterface31_10931) {
			aClass437_10929.method6886(anInterface31_10931.method181(-1188298279).method16163((byte) 22));
			aClass298_8675.method5310(false, f, aClass437_10932, aClass298_8675.method5376((short) 256), aClass437_10929, aClass437_10934, (byte) -96);
		}
	}

	public void method13926(RSBuffer class523_sub34) {
		Class292 class292 = Class60.method1402(class523_sub34.readUnsignedByte(473242550), -290009836);
		int i = class523_sub34.readUnsignedShort(-2004658850);
		anInterface31_10931 = aClass298_8675.method5402((byte) -8).method174(class292, i, 1503070563);
		aClass437_10930.method6941(class523_sub34);
		if (class523_sub34.readUnsignedByte(681928821) == 1)
			aBool10933 = true;
		else
			aBool10933 = false;
	}

	public Class437 method13922() {
		Class437 class437 = Class437.method6884(aClass437_10932);
		Class437 class437_16_ = Class437.method6884(aClass437_10930);
		if (aBool10933)
			class437_16_.method6907(anInterface31_10931.method179(1294125701));
		class437.method6961(class437_16_);
		class437_16_.method6949();
		return class437;
	}

	public Class437 method13919() {
		Class437 class437 = Class437.method6884(aClass437_10932);
		Class437 class437_17_ = Class437.method6884(aClass437_10930);
		if (aBool10933)
			class437_17_.method6907(anInterface31_10931.method179(876184577));
		class437.method6961(class437_17_);
		class437_17_.method6949();
		return class437;
	}

	public void method17082(Interface31 interface31, Class437 class437, boolean bool) {
		anInterface31_10931 = interface31;
		aClass437_10930.method6886(class437);
		aBool10933 = bool;
		interface31.method181(-210239522);
	}

	public void method17083(Interface31 interface31, Class437 class437, boolean bool) {
		anInterface31_10931 = interface31;
		aClass437_10930.method6886(class437);
		aBool10933 = bool;
		interface31.method181(10006246);
	}

	public void method13915(Class307 class307, Class435 class435, int i, int i_18_, float f) {
		Class437 class437 = Class437.method6884(aClass298_8675.method5378(2037630253));
		class437.aFloat4903 -= (float) i;
		class437.aFloat4905 -= (float) i_18_;
		class437.aFloat4904 *= -1.0F;
		Class437 class437_19_ = method13909(717268124);
		class437_19_.aFloat4903 -= (float) i;
		class437_19_.aFloat4905 -= (float) i_18_;
		class437_19_.aFloat4904 *= -1.0F;
		class435.method6807((double) class437.aFloat4903, (double) class437.aFloat4904, (double) class437.aFloat4905, (double) class437_19_.aFloat4903, (double) class437_19_.aFloat4904, (double) class437_19_.aFloat4905, 0.0F, 1.0F, 0.0F);
		class437.method6949();
		class437_19_.method6949();
	}

	public void method17084() {
		if (null != anInterface31_10931)
			anInterface31_10931 = (aClass298_8675.method5402((byte) -8).method174(anInterface31_10931.method176((byte) 12), anInterface31_10931.method69(365587714), -1205203782));
	}

	public void method17085() {
		if (null != anInterface31_10931)
			anInterface31_10931 = (aClass298_8675.method5402((byte) -8).method174(anInterface31_10931.method176((byte) 12), anInterface31_10931.method69(365587714), -324450922));
	}

	public void method17086() {
		if (null != anInterface31_10931)
			anInterface31_10931 = (aClass298_8675.method5402((byte) -8).method174(anInterface31_10931.method176((byte) 12), anInterface31_10931.method69(365587714), -1502708594));
	}

	public Class437 method17087() {
		return aClass437_10932;
	}
}
