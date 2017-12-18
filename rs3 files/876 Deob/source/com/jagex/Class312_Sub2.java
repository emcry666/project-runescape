/* Class312_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class312_Sub2 extends Class312 {
	Class148 aClass148_10005;
	Class148 aClass148_10006;
	Class148 aClass148_10007;
	Class148 aClass148_10008;
	Class148 aClass148_10009;
	Class148 aClass148_10010;

	void method5648(boolean bool, int i, int i_0_) {
		if (bool) {
			int[] is = new int[4];
			Class31.aClass178_303.method3075(is);
			Class31.aClass178_303.method3378(i, i_0_, i + 1773515723 * aClass384_3390.anInt3971, i_0_ + -1825534571 * aClass384_3390.anInt3972);
			int i_1_ = aClass148_10007.method38();
			int i_2_ = aClass148_10007.method2429();
			int i_3_ = aClass148_10005.method38();
			int i_4_ = aClass148_10005.method2429();
			aClass148_10007.method2435(i, i_0_ + ((aClass384_3390.anInt3972 * -1825534571) - i_2_) / 2);
			aClass148_10005.method2435(i + aClass384_3390.anInt3971 * 1773515723 - i_3_, i_0_ + (-1825534571 * aClass384_3390.anInt3972 - i_4_) / 2);
			Class31.aClass178_303.method3378(i, i_0_, 1773515723 * aClass384_3390.anInt3971 + i, i_0_ + aClass148_10008.method2429());
			aClass148_10008.method2440(i_1_ + i, i_0_, (1773515723 * aClass384_3390.anInt3971 - i_1_ - i_3_), -1825534571 * aClass384_3390.anInt3972);
			int i_5_ = aClass148_10009.method2429();
			Class31.aClass178_303.method3378(i, aClass384_3390.anInt3972 * -1825534571 + i_0_ - i_5_, 1773515723 * aClass384_3390.anInt3971 + i, aClass384_3390.anInt3972 * -1825534571 + i_0_);
			aClass148_10009.method2440(i_1_ + i, i_0_ + (aClass384_3390.anInt3972 * -1825534571) - i_5_, (aClass384_3390.anInt3971 * 1773515723 - i_1_ - i_3_), -1825534571 * aClass384_3390.anInt3972);
			Class31.aClass178_303.method3378(is[0], is[1], is[2], is[3]);
		}
	}

	public void method210(int i) {
		super.method210(753588968);
		Class384_Sub2 class384_sub2 = (Class384_Sub2) aClass384_3390;
		aClass148_10010 = Class452.method7314(aClass472_3392, class384_sub2.anInt10257 * 800289073, (byte) -114);
		aClass148_10006 = Class452.method7314(aClass472_3392, 171920273 * class384_sub2.anInt10255, (byte) -22);
		aClass148_10007 = Class452.method7314(aClass472_3392, class384_sub2.anInt10256 * -650702109, (byte) -80);
		aClass148_10005 = Class452.method7314(aClass472_3392, 615521747 * class384_sub2.anInt10259, (byte) -35);
		aClass148_10008 = Class452.method7314(aClass472_3392, -849934999 * class384_sub2.anInt10258, (byte) -99);
		aClass148_10009 = Class452.method7314(aClass472_3392, class384_sub2.anInt10254 * -1624740753, (byte) -29);
	}

	void method5645(boolean bool, int i, int i_6_) {
		int i_7_ = i + aClass148_10007.method38();
		int i_8_ = (aClass384_3390.anInt3971 * 1773515723 + i - aClass148_10005.method38());
		int i_9_ = i_6_ + aClass148_10008.method2429();
		int i_10_ = (i_6_ + aClass384_3390.anInt3972 * -1825534571 - aClass148_10009.method2429());
		int i_11_ = i_8_ - i_7_;
		int i_12_ = i_10_ - i_9_;
		int i_13_ = method5644((byte) 25) * i_11_ / 10000;
		int[] is = new int[4];
		Class31.aClass178_303.method3075(is);
		Class31.aClass178_303.method3378(i_7_, i_9_, i_7_ + i_13_, i_10_);
		method15564(i_7_, i_9_, i_11_, i_12_, (byte) 79);
		Class31.aClass178_303.method3378(i_7_ + i_13_, i_9_, i_8_, i_10_);
		aClass148_10006.method2440(i_7_, i_9_, i_11_, i_12_);
		Class31.aClass178_303.method3378(is[0], is[1], is[2], is[3]);
	}

	void method5643(boolean bool, int i, int i_14_, byte i_15_) {
		int i_16_ = i + aClass148_10007.method38();
		int i_17_ = (aClass384_3390.anInt3971 * 1773515723 + i - aClass148_10005.method38());
		int i_18_ = i_14_ + aClass148_10008.method2429();
		int i_19_ = (i_14_ + aClass384_3390.anInt3972 * -1825534571 - aClass148_10009.method2429());
		int i_20_ = i_17_ - i_16_;
		int i_21_ = i_19_ - i_18_;
		int i_22_ = method5644((byte) 22) * i_20_ / 10000;
		int[] is = new int[4];
		Class31.aClass178_303.method3075(is);
		Class31.aClass178_303.method3378(i_16_, i_18_, i_16_ + i_22_, i_19_);
		method15564(i_16_, i_18_, i_20_, i_21_, (byte) 17);
		Class31.aClass178_303.method3378(i_16_ + i_22_, i_18_, i_17_, i_19_);
		aClass148_10006.method2440(i_16_, i_18_, i_20_, i_21_);
		Class31.aClass178_303.method3378(is[0], is[1], is[2], is[3]);
	}

	public boolean method209(byte i) {
		if (!super.method209((byte) -102))
			return false;
		Class384_Sub2 class384_sub2 = (Class384_Sub2) aClass384_3390;
		if (!aClass472_3392.method7650(800289073 * class384_sub2.anInt10257, -1323602478))
			return false;
		if (!aClass472_3392.method7650(class384_sub2.anInt10255 * 171920273, 143505359))
			return false;
		if (!aClass472_3392.method7650(class384_sub2.anInt10256 * -650702109, 414245481))
			return false;
		if (!aClass472_3392.method7650(class384_sub2.anInt10259 * 615521747, -675630561))
			return false;
		if (!aClass472_3392.method7650(class384_sub2.anInt10258 * -849934999, -1294419656))
			return false;
		if (!aClass472_3392.method7650(class384_sub2.anInt10254 * -1624740753, -385879676))
			return false;
		return true;
	}

	void method5642(boolean bool, int i, int i_23_, int i_24_) {
		if (bool) {
			int[] is = new int[4];
			Class31.aClass178_303.method3075(is);
			Class31.aClass178_303.method3378(i, i_23_, i + 1773515723 * aClass384_3390.anInt3971, i_23_ + -1825534571 * aClass384_3390.anInt3972);
			int i_25_ = aClass148_10007.method38();
			int i_26_ = aClass148_10007.method2429();
			int i_27_ = aClass148_10005.method38();
			int i_28_ = aClass148_10005.method2429();
			aClass148_10007.method2435(i, i_23_ + ((aClass384_3390.anInt3972 * -1825534571) - i_26_) / 2);
			aClass148_10005.method2435(i + aClass384_3390.anInt3971 * 1773515723 - i_27_, i_23_ + (-1825534571 * aClass384_3390.anInt3972 - i_28_) / 2);
			Class31.aClass178_303.method3378(i, i_23_, 1773515723 * aClass384_3390.anInt3971 + i, i_23_ + aClass148_10008.method2429());
			aClass148_10008.method2440(i_25_ + i, i_23_, (1773515723 * aClass384_3390.anInt3971 - i_25_ - i_27_), -1825534571 * aClass384_3390.anInt3972);
			int i_29_ = aClass148_10009.method2429();
			Class31.aClass178_303.method3378(i, aClass384_3390.anInt3972 * -1825534571 + i_23_ - i_29_, 1773515723 * aClass384_3390.anInt3971 + i, aClass384_3390.anInt3972 * -1825534571 + i_23_);
			aClass148_10009.method2440(i_25_ + i, i_23_ + (aClass384_3390.anInt3972 * -1825534571) - i_29_, (aClass384_3390.anInt3971 * 1773515723 - i_25_ - i_27_), -1825534571 * aClass384_3390.anInt3972);
			Class31.aClass178_303.method3378(is[0], is[1], is[2], is[3]);
		}
	}

	public boolean method211() {
		if (!super.method209((byte) -17))
			return false;
		Class384_Sub2 class384_sub2 = (Class384_Sub2) aClass384_3390;
		if (!aClass472_3392.method7650(800289073 * class384_sub2.anInt10257, -331811504))
			return false;
		if (!aClass472_3392.method7650(class384_sub2.anInt10255 * 171920273, 1510263845))
			return false;
		if (!aClass472_3392.method7650(class384_sub2.anInt10256 * -650702109, -122862991))
			return false;
		if (!aClass472_3392.method7650(class384_sub2.anInt10259 * 615521747, -179196388))
			return false;
		if (!aClass472_3392.method7650(class384_sub2.anInt10258 * -849934999, -1091169847))
			return false;
		if (!aClass472_3392.method7650(class384_sub2.anInt10254 * -1624740753, -20369486))
			return false;
		return true;
	}

	public void method212() {
		super.method210(-281298758);
		Class384_Sub2 class384_sub2 = (Class384_Sub2) aClass384_3390;
		aClass148_10010 = Class452.method7314(aClass472_3392, class384_sub2.anInt10257 * 800289073, (byte) -62);
		aClass148_10006 = Class452.method7314(aClass472_3392, 171920273 * class384_sub2.anInt10255, (byte) -103);
		aClass148_10007 = Class452.method7314(aClass472_3392, class384_sub2.anInt10256 * -650702109, (byte) -116);
		aClass148_10005 = Class452.method7314(aClass472_3392, 615521747 * class384_sub2.anInt10259, (byte) -2);
		aClass148_10008 = Class452.method7314(aClass472_3392, -849934999 * class384_sub2.anInt10258, (byte) -108);
		aClass148_10009 = Class452.method7314(aClass472_3392, class384_sub2.anInt10254 * -1624740753, (byte) -119);
	}

	void method15563(int i, int i_30_, int i_31_, int i_32_) {
		aClass148_10010.method2440(i, i_30_, i_31_, i_32_);
	}

	void method5641(boolean bool, int i, int i_33_) {
		int i_34_ = i + aClass148_10007.method38();
		int i_35_ = (aClass384_3390.anInt3971 * 1773515723 + i - aClass148_10005.method38());
		int i_36_ = i_33_ + aClass148_10008.method2429();
		int i_37_ = (i_33_ + aClass384_3390.anInt3972 * -1825534571 - aClass148_10009.method2429());
		int i_38_ = i_35_ - i_34_;
		int i_39_ = i_37_ - i_36_;
		int i_40_ = method5644((byte) 107) * i_38_ / 10000;
		int[] is = new int[4];
		Class31.aClass178_303.method3075(is);
		Class31.aClass178_303.method3378(i_34_, i_36_, i_34_ + i_40_, i_37_);
		method15564(i_34_, i_36_, i_38_, i_39_, (byte) 55);
		Class31.aClass178_303.method3378(i_34_ + i_40_, i_36_, i_35_, i_37_);
		aClass148_10006.method2440(i_34_, i_36_, i_38_, i_39_);
		Class31.aClass178_303.method3378(is[0], is[1], is[2], is[3]);
	}

	void method5640(boolean bool, int i, int i_41_) {
		if (bool) {
			int[] is = new int[4];
			Class31.aClass178_303.method3075(is);
			Class31.aClass178_303.method3378(i, i_41_, i + 1773515723 * aClass384_3390.anInt3971, i_41_ + -1825534571 * aClass384_3390.anInt3972);
			int i_42_ = aClass148_10007.method38();
			int i_43_ = aClass148_10007.method2429();
			int i_44_ = aClass148_10005.method38();
			int i_45_ = aClass148_10005.method2429();
			aClass148_10007.method2435(i, i_41_ + ((aClass384_3390.anInt3972 * -1825534571) - i_43_) / 2);
			aClass148_10005.method2435(i + aClass384_3390.anInt3971 * 1773515723 - i_44_, i_41_ + (-1825534571 * aClass384_3390.anInt3972 - i_45_) / 2);
			Class31.aClass178_303.method3378(i, i_41_, 1773515723 * aClass384_3390.anInt3971 + i, i_41_ + aClass148_10008.method2429());
			aClass148_10008.method2440(i_42_ + i, i_41_, (1773515723 * aClass384_3390.anInt3971 - i_42_ - i_44_), -1825534571 * aClass384_3390.anInt3972);
			int i_46_ = aClass148_10009.method2429();
			Class31.aClass178_303.method3378(i, aClass384_3390.anInt3972 * -1825534571 + i_41_ - i_46_, 1773515723 * aClass384_3390.anInt3971 + i, aClass384_3390.anInt3972 * -1825534571 + i_41_);
			aClass148_10009.method2440(i_42_ + i, i_41_ + (aClass384_3390.anInt3972 * -1825534571) - i_46_, (aClass384_3390.anInt3971 * 1773515723 - i_42_ - i_44_), -1825534571 * aClass384_3390.anInt3972);
			Class31.aClass178_303.method3378(is[0], is[1], is[2], is[3]);
		}
	}

	void method15564(int i, int i_47_, int i_48_, int i_49_, byte i_50_) {
		aClass148_10010.method2440(i, i_47_, i_48_, i_49_);
	}

	void method5647(boolean bool, int i, int i_51_) {
		if (bool) {
			int[] is = new int[4];
			Class31.aClass178_303.method3075(is);
			Class31.aClass178_303.method3378(i, i_51_, i + 1773515723 * aClass384_3390.anInt3971, i_51_ + -1825534571 * aClass384_3390.anInt3972);
			int i_52_ = aClass148_10007.method38();
			int i_53_ = aClass148_10007.method2429();
			int i_54_ = aClass148_10005.method38();
			int i_55_ = aClass148_10005.method2429();
			aClass148_10007.method2435(i, i_51_ + ((aClass384_3390.anInt3972 * -1825534571) - i_53_) / 2);
			aClass148_10005.method2435(i + aClass384_3390.anInt3971 * 1773515723 - i_54_, i_51_ + (-1825534571 * aClass384_3390.anInt3972 - i_55_) / 2);
			Class31.aClass178_303.method3378(i, i_51_, 1773515723 * aClass384_3390.anInt3971 + i, i_51_ + aClass148_10008.method2429());
			aClass148_10008.method2440(i_52_ + i, i_51_, (1773515723 * aClass384_3390.anInt3971 - i_52_ - i_54_), -1825534571 * aClass384_3390.anInt3972);
			int i_56_ = aClass148_10009.method2429();
			Class31.aClass178_303.method3378(i, aClass384_3390.anInt3972 * -1825534571 + i_51_ - i_56_, 1773515723 * aClass384_3390.anInt3971 + i, aClass384_3390.anInt3972 * -1825534571 + i_51_);
			aClass148_10009.method2440(i_52_ + i, i_51_ + (aClass384_3390.anInt3972 * -1825534571) - i_56_, (aClass384_3390.anInt3971 * 1773515723 - i_52_ - i_54_), -1825534571 * aClass384_3390.anInt3972);
			Class31.aClass178_303.method3378(is[0], is[1], is[2], is[3]);
		}
	}

	void method15565(int i, int i_57_, int i_58_, int i_59_) {
		aClass148_10010.method2440(i, i_57_, i_58_, i_59_);
	}

	Class312_Sub2(Class472 class472, Class472 class472_60_, Class384_Sub2 class384_sub2) {
		super(class472, class472_60_, (Class384) class384_sub2);
	}

	void method15566(int i, int i_61_, int i_62_, int i_63_) {
		aClass148_10010.method2440(i, i_61_, i_62_, i_63_);
	}

	void method15567(int i, int i_64_, int i_65_, int i_66_) {
		aClass148_10010.method2440(i, i_64_, i_65_, i_66_);
	}
}
