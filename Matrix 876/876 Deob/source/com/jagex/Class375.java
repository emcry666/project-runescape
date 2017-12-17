/* Class375 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class375 {
	public abstract int method6350(Object object, byte i);

	abstract Object method6351(Class366 class366);

	public abstract int method6352(Object object);

	public abstract void method6353();

	public abstract void method6354(Object object, byte[] is, int i, int i_0_, int i_1_);

	Class375() {
		/* empty */
	}

	public abstract Class477 method6355(Class478 class478, int i);

	abstract Object method6356(Class366 class366, int i);

	public abstract Class369 method6357(byte i);

	public abstract void method6358(Object object, byte[] is, int i, int i_2_);

	public abstract void method6359();

	public abstract void method6360(Object object, byte i);

	public abstract Class369 method6361();

	public abstract Object method6362(int i, int i_3_, Class393 class393, Class365 class365, int i_4_, float f);

	public abstract int method6363(Object object);

	public abstract int method6364(Object object);

	public abstract Object method6365(int i, int i_5_, Class393 class393, Class365 class365, int i_6_, float f);

	public abstract void method6366(Object object);

	public abstract Object method6367(int i, int i_7_, Class393 class393, Class365 class365, int i_8_, float f);

	public abstract void method6368(int i);

	public abstract void method6369(int i);

	public abstract void method6370(Object object);

	public abstract Object method6371(int i, int i_9_, Class393 class393, Class365 class365, int i_10_, float f, int i_11_);

	public abstract void method6372(Object object, byte[] is, int i, int i_12_);

	public abstract Class477 method6373(Class478 class478);

	public abstract void method6374();

	abstract Object method6375(Class366 class366);

	abstract Object method6376(Class366 class366);

	public abstract Class369 method6377();

	public abstract void method6378(Object object);

	public abstract Class369 method6379();

	public abstract void method6380();

	public abstract void method6381();

	static boolean method6382(int i) {
		if (-1 != 426956199 * Class43.anInt572)
			return NPCVarDomainType.method15863(1274230479);
		return Class523_Sub30.method16186(Class43.aString603, Class43.aString594, -97929275);
	}

	public static int method6383(int i, int i_13_) {
		int i_14_ = i >>> 1;
		i_14_ |= i_14_ >>> 1;
		i_14_ |= i_14_ >>> 2;
		i_14_ |= i_14_ >>> 4;
		i_14_ |= i_14_ >>> 8;
		i_14_ |= i_14_ >>> 16;
		return i & (i_14_ ^ 0xffffffff);
	}

	static final void method6384(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (null != Class534.aClass523_Sub27_Sub17_7144 ? -536403473 * Class534.aClass523_Sub27_Sub17_7144.anInt11831 : -1);
	}

	static final void method6385(int i) {
		int[] is = Class108.anIntArray1319;
		for (int i_15_ = 0; i_15_ < 393652345 * Class108.anInt1318; i_15_++) {
			Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[is[i_15_]];
			if (null != class647_sub1_sub3_sub1_sub2)
				class647_sub1_sub3_sub1_sub2.method18350((byte) 57);
		}
		for (int i_16_ = 0; i_16_ < client.anInt11050 * 920163749; i_16_++) {
			long l = (long) client.anIntArray11051[i_16_];
			Class523_Sub28 class523_sub28 = (Class523_Sub28) client.aClass14_11047.getFromIndex(l);
			if (null != class523_sub28)
				((Class647_Sub1_Sub3_Sub1) class523_sub28.anObject10554).method18350((byte) 117);
		}
		if (4 == -1616721887 * client.anInt11071) {
			for (int i_17_ = 0; i_17_ < Class191.aClass192Array2157.length; i_17_++) {
				Class192 class192 = Class191.aClass192Array2157[i_17_];
				if (class192.aBool2174)
					class192.method3631(695340605).method18350((byte) 55);
			}
		}
	}

	static void method6386(int i, int i_18_, int i_19_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(1, (long) i);
		class523_sub27_sub7.method17963(1872854763);
		class523_sub27_sub7.anInt11653 = i_18_ * -1217347391;
	}

	static Class523_Sub39_Sub1 method6387(int i, int i_20_, int i_21_, long l, int i_22_, byte i_23_) {
		synchronized (Class523_Sub39_Sub1.aClass523_Sub39_Sub1Array11730) {
			Class523_Sub39_Sub1 class523_sub39_sub1;
			if (0 == -998735461 * Class446.anInt4933)
				class523_sub39_sub1 = new Class523_Sub39_Sub1();
			else
				class523_sub39_sub1 = (Class523_Sub39_Sub1.aClass523_Sub39_Sub1Array11730[(Class446.anInt4933 -= 1505492115) * -998735461]);
			class523_sub39_sub1.anInt11728 = i * 1413285307;
			class523_sub39_sub1.anInt11732 = i_20_ * -586060101;
			class523_sub39_sub1.anInt11729 = 967687727 * i_21_;
			class523_sub39_sub1.aLong11731 = l * 7965289002561612171L;
			class523_sub39_sub1.anInt11733 = 277493091 * i_22_;
			Class523_Sub39_Sub1 class523_sub39_sub1_24_ = class523_sub39_sub1;
			return class523_sub39_sub1_24_;
		}
	}
}
