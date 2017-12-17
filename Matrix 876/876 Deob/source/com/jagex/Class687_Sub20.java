/* Class687_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class687_Sub20 extends Class687 {
	public static final int anInt10867 = 0;
	public static final int anInt10868 = 1;
	static int anInt10869;

	public int method13895(int i) {
		if (aClass523_Sub33_8670.method16236((byte) -103) == Class681.aClass681_8646)
			return 1;
		return 3;
	}

	public Class687_Sub20(int i, Class523_Sub33 class523_sub33) {
		super(i, class523_sub33);
	}

	public Class687_Sub20(Class523_Sub33 class523_sub33) {
		super(class523_sub33);
	}

	public boolean method16908(int i) {
		if (aClass523_Sub33_8670.method16236((byte) -103) == Class681.aClass681_8646)
			return true;
		return false;
	}

	public boolean method16909() {
		if (aClass523_Sub33_8670.method16236((byte) -103) == Class681.aClass681_8646)
			return true;
		return false;
	}

	void method13892(int i, int i_0_) {
		anInt8673 = i * 1826678239;
	}

	public int method13890(int i, int i_1_) {
		if (aClass523_Sub33_8670.method16236((byte) -103) == Class681.aClass681_8646)
			return 1;
		return 3;
	}

	public int method16910(int i) {
		return anInt8673 * 1700599327;
	}

	public int method13893(int i) {
		if (aClass523_Sub33_8670.method16236((byte) -103) == Class681.aClass681_8646)
			return 1;
		return 3;
	}

	int method13894(int i) {
		return 1;
	}

	void method13888(int i) {
		anInt8673 = i * 1826678239;
	}

	public int method16911() {
		return anInt8673 * 1700599327;
	}

	void method13896(int i) {
		anInt8673 = i * 1826678239;
	}

	int method13897() {
		return 1;
	}

	int method13889() {
		return 1;
	}

	int method13899() {
		return 1;
	}

	int method13900() {
		return 1;
	}

	public boolean method16912() {
		if (aClass523_Sub33_8670.method16236((byte) -103) == Class681.aClass681_8646)
			return true;
		return false;
	}

	public boolean method16913() {
		if (aClass523_Sub33_8670.method16236((byte) -103) == Class681.aClass681_8646)
			return true;
		return false;
	}

	void method13901(int i) {
		anInt8673 = i * 1826678239;
	}

	public void method16914() {
		if (aClass523_Sub33_8670.method16236((byte) -103) != Class681.aClass681_8646)
			anInt8673 = 1826678239;
		if (anInt8673 * 1700599327 != 0 && 1 != 1700599327 * anInt8673)
			anInt8673 = method13894(-1606687663) * 1826678239;
	}

	public int method16915() {
		return anInt8673 * 1700599327;
	}

	public void method16916(byte i) {
		if (aClass523_Sub33_8670.method16236((byte) -103) != Class681.aClass681_8646)
			anInt8673 = 1826678239;
		if (anInt8673 * 1700599327 != 0 && 1 != 1700599327 * anInt8673)
			anInt8673 = method13894(-1419127058) * 1826678239;
	}

	public int method16917() {
		return anInt8673 * 1700599327;
	}

	public int method16918() {
		return anInt8673 * 1700599327;
	}

	static final void decodeUpdate(int i) {
		RSBitBuffer buffer = client.aClass116_11058.updateBuffer;
		buffer.method18223(663984196);
		int i_2_ = buffer.readBits(8, -1298121975);
		if (i_2_ < client.anInt11050 * 920163749) {
			for (int i_3_ = i_2_; i_3_ < 920163749 * client.anInt11050; i_3_++)
				client.anIntArray11253[(client.anInt11055 += -424713037) * -1760171397 - 1] = client.anIntArray11051[i_3_];
		}
		if (i_2_ > 920163749 * client.anInt11050)
			throw new RuntimeException();
		client.anInt11050 = 0;
		for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
			int i_5_ = client.anIntArray11051[i_4_];
			NPC class647_sub1_sub3_sub1_sub1 = ((NPC) (((Class523_Sub28) client.aClass14_11047.getFromIndex((long) i_5_)).anObject10554));
			int i_6_ = buffer.readBits(1, 1991583052);
			if (i_6_ == 0) {
				client.anIntArray11051[(client.anInt11050 += -1774433747) * 920163749 - 1] = i_5_;
				class647_sub1_sub3_sub1_sub1.anInt11916 = -1449978387 * client.anInt11054;
			} else {
				int i_7_ = buffer.readBits(2, 553875180);
				if (0 == i_7_) {
					client.anIntArray11051[(client.anInt11050 += -1774433747) * 920163749 - 1] = i_5_;
					class647_sub1_sub3_sub1_sub1.anInt11916 = client.anInt11054 * -1449978387;
					client.anIntArray11053[(client.anInt11052 += 2047749803) * 724589571 - 1] = i_5_;
				} else if (1 == i_7_) {
					client.anIntArray11051[(client.anInt11050 += -1774433747) * 920163749 - 1] = i_5_;
					class647_sub1_sub3_sub1_sub1.anInt11916 = -1449978387 * client.anInt11054;
					Class682 class682 = ((Class682) Class334.method5910(Class511.method8566(1842877177), buffer.readBits(3, 1995161457), 2107716457));
					class647_sub1_sub3_sub1_sub1.method18652(class682, (Class666.aClass666_8531.aByte8529), 869969279);
					int i_8_ = buffer.readBits(1, 1717109721);
					if (i_8_ == 1)
						client.anIntArray11053[(client.anInt11052 += 2047749803) * 724589571 - 1] = i_5_;
				} else if (2 == i_7_) {
					client.anIntArray11051[(client.anInt11050 += -1774433747) * 920163749 - 1] = i_5_;
					class647_sub1_sub3_sub1_sub1.anInt11916 = -1449978387 * client.anInt11054;
					if (buffer.readBits(1, -142285075) == 1) {
						Class682 class682 = ((Class682) (Class334.method5910(Class511.method8566(1369410184), buffer.readBits(3, 1286591545), 1342020022)));
						class647_sub1_sub3_sub1_sub1.method18652(class682, Class666.aClass666_8532.aByte8529, 869969279);
						Class682 class682_9_ = ((Class682) (Class334.method5910(Class511.method8566(-1279590000), buffer.readBits(3, -360185436), -1751129004)));
						class647_sub1_sub3_sub1_sub1.method18652(class682_9_, Class666.aClass666_8532.aByte8529, 869969279);
					} else {
						Class682 class682 = ((Class682) (Class334.method5910(Class511.method8566(1575854685), buffer.readBits(3, -1205237509), 1037437475)));
						class647_sub1_sub3_sub1_sub1.method18652(class682, Class666.aClass666_8533.aByte8529, 869969279);
					}
					int i_10_ = buffer.readBits(1, 1196920652);
					if (i_10_ == 1)
						client.anIntArray11053[(client.anInt11052 += 2047749803) * 724589571 - 1] = i_5_;
				} else if (i_7_ == 3)
					client.anIntArray11253[(client.anInt11055 += -424713037) * -1760171397 - 1] = i_5_;
			}
		}
	}
}
