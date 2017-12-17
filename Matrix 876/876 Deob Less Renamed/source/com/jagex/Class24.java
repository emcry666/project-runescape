/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class24 {
	static final int anInt237 = 1;
	Class472 aClass472_238;
	Class209 aClass209_239;
	public int anInt240 = 0;
	static final int anInt241 = 32768;
	public int anInt242 = 0;
	Class472 aClass472_243;
	Interface72 anInterface72_244;

	public Class523_Sub27_Sub18 method836(int i) {
		Class523_Sub27_Sub18 class523_sub27_sub18 = (Class523_Sub27_Sub18) aClass209_239.method3767((long) i);
		if (class523_sub27_sub18 != null)
			return class523_sub27_sub18;
		byte[] is;
		if (i >= 32768)
			is = aClass472_238.method7688(1, i & 0x7fff, 1064416814);
		else
			is = aClass472_243.method7688(1, i, -902591317);
		class523_sub27_sub18 = new Class523_Sub27_Sub18();
		class523_sub27_sub18.aClass24_11838 = this;
		if (is != null)
			class523_sub27_sub18.method18265(new Class523_Sub34(is), 1953306581);
		if (i >= 32768)
			class523_sub27_sub18.method18255(1070879909);
		aClass209_239.method3770(class523_sub27_sub18, (long) i);
		return class523_sub27_sub18;
	}

	public Class24(Class668 class668, Class472 class472, Class472 class472_0_, Interface72 interface72) {
		aClass209_239 = new Class209(64);
		anInterface72_244 = null;
		aClass472_243 = class472;
		aClass472_238 = class472_0_;
		anInterface72_244 = interface72;
		if (aClass472_243 != null)
			anInt240 = aClass472_243.method7702(1, (byte) 40) * 161853065;
		if (aClass472_238 != null)
			anInt242 = aClass472_238.method7702(1, (byte) -53) * 1516782873;
	}

	String method837(Class636 class636, int[] is, long l) {
		if (anInterface72_244 != null) {
			String string = anInterface72_244.method486(class636, is, l);
			if (null != string)
				return string;
		}
		return Long.toString(l);
	}

	String method838(Class636 class636, int[] is, long l) {
		if (anInterface72_244 != null) {
			String string = anInterface72_244.method486(class636, is, l);
			if (null != string)
				return string;
		}
		return Long.toString(l);
	}

	public Class523_Sub27_Sub18 method839(int i, byte i_1_) {
		Class523_Sub27_Sub18 class523_sub27_sub18 = (Class523_Sub27_Sub18) aClass209_239.method3767((long) i);
		if (class523_sub27_sub18 != null)
			return class523_sub27_sub18;
		byte[] is;
		if (i >= 32768)
			is = aClass472_238.method7688(1, i & 0x7fff, -814694724);
		else
			is = aClass472_243.method7688(1, i, 409437561);
		class523_sub27_sub18 = new Class523_Sub27_Sub18();
		class523_sub27_sub18.aClass24_11838 = this;
		if (is != null)
			class523_sub27_sub18.method18265(new Class523_Sub34(is), 1953306581);
		if (i >= 32768)
			class523_sub27_sub18.method18255(1776806092);
		aClass209_239.method3770(class523_sub27_sub18, (long) i);
		return class523_sub27_sub18;
	}

	static final void method840(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_2_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_3_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		int i_4_ = (Class645.aClass24_8347.method839(i_2_, (byte) -36).method18266(i_3_, (short) -6764).anInt8296 * -1912590719);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_4_;
	}

	static final void updateNPC(int i, int i_5_) {
		client.anInt11055 = 0;
		client.anInt11052 = 0;
		client.anInt11054 += -2087146099;
		Class687_Sub20.method16919(-505058275);
		Class3.method518(i, -1475006295);
		Class79.method1562(-816065565);
		boolean bool = false;
		for (int i_6_ = 0; i_6_ < -1760171397 * client.anInt11055; i_6_++) {
			int i_7_ = client.anIntArray11253[i_6_];
			Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.method741((long) i_7_));
			Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = (Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554;
			if (4283717 * client.anInt11054 != 315619769 * class647_sub1_sub3_sub1_sub1.anInt11916) {
				if (Class36.aBool326 && Class204.method3713(i_7_, (byte) 72))
					Class524.method8685(-522212835);
				if (class647_sub1_sub3_sub1_sub1.aClass300_12175.method5492((byte) -87))
					Class297.method5306(class647_sub1_sub3_sub1_sub1, (short) -6432);
				class647_sub1_sub3_sub1_sub1.method18622(null, -65534);
				class523_sub28.method8661(607052656);
				bool = true;
			}
		}
		if (bool) {
			int i_8_ = client.anInt11049 * -1359865227;
			client.anInt11049 = client.aClass14_11047.method734(-26583709) * 175334877;
			int i_9_ = 0;
			Iterator iterator = client.aClass14_11047.iterator();
			while (iterator.hasNext()) {
				Class523_Sub28 class523_sub28 = (Class523_Sub28) iterator.next();
				client.aClass523_Sub28Array11195[i_9_++] = class523_sub28;
			}
			for (int i_10_ = -1359865227 * client.anInt11049; i_10_ < i_8_; i_10_++)
				client.aClass523_Sub28Array11195[i_10_] = null;
			Class291 class291 = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5342(-1390175100);
			if (class291 == Class291.aClass291_3148) {
				Class328_Sub2 class328_sub2 = ((Class328_Sub2) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5430(1778757505));
				class328_sub2.method15596(-129672557);
			}
			Class294 class294 = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5341((byte) 112);
			if (Class294.aClass294_3164 == class294) {
				Class688_Sub2 class688_sub2 = ((Class688_Sub2) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5465((byte) 115));
				class688_sub2.method17078((byte) 79);
			}
		}
		if (-1372959327 * client.aClass116_11058.anInt1421 != (2349011 * client.aClass116_11058.aClass523_Sub34_Sub2_1431.anInt10661))
			throw new RuntimeException(new StringBuilder().append(2349011 * (client.aClass116_11058.aClass523_Sub34_Sub2_1431.anInt10661)).append(" ").append(client.aClass116_11058.anInt1421 * -1372959327).toString());
		for (int i_11_ = 0; i_11_ < 920163749 * client.anInt11050; i_11_++) {
			if (client.aClass14_11047.method741((long) client.anIntArray11051[i_11_]) == null)
				throw new RuntimeException(new StringBuilder().append(i_11_).append(" ").append(920163749 * client.anInt11050).toString());
		}
		if (client.anInt11049 * -1359865227 - client.anInt11050 * 920163749 != 0)
			throw new RuntimeException(new StringBuilder().append("").append(-1359865227 * client.anInt11049 - client.anInt11050 * 920163749).toString());
		for (int i_12_ = 0; i_12_ < client.anInt11049 * -1359865227; i_12_++) {
			if ((((Class647_Sub1_Sub3_Sub1) client.aClass523_Sub28Array11195[i_12_].anObject10554).anInt11916) * 315619769 != client.anInt11054 * 4283717)
				throw new RuntimeException(new StringBuilder().append("").append(-1087669731 * (((Class647_Sub1_Sub3_Sub1) (client.aClass523_Sub28Array11195[i_12_].anObject10554)).anInt11888)).toString());
		}
	}

	static final void method842(Class669 class669, int i) {
		int i_13_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_13_, -1932431598);
		Class242 class242 = Class31.aClass242Array302[i_13_ >> 16];
		Class477.method7889(class250, class242, class669, (byte) 0);
	}
}
