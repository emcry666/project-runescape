/* Class556 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Iterator;

class Class556 implements Runnable {
	Class375_Sub1 this$0;

	Class556(Class375_Sub1 class375_sub1) {
		this$0 = class375_sub1;
	}

	public void run() {
		try {
			while (!this$0.aBool10157) {
				Iterator iterator = this$0.aList10160.iterator();
				while (iterator.hasNext()) {
					Class567 class567 = (Class567) iterator.next();
					class567.method9505((byte) 0);
				}
				HashMap hashmap = this$0.method15704((byte) 49);
				Iterator iterator_0_ = hashmap.keySet().iterator();
				while (iterator_0_.hasNext()) {
					Class478 class478 = (Class478) iterator_0_.next();
					if (!class478.aBool5453) {
						Class477[] class477s = (Class477[]) hashmap.get(class478);
						for (int i = 0; i < class477s.length; i++)
							class477s[i].method7849(816437162);
					}
				}
				iterator_0_ = this$0.aList10160.iterator();
				while (iterator_0_.hasNext()) {
					Class567 class567 = (Class567) iterator_0_.next();
					class567.method9506((byte) -52);
				}
				Class653.method10656(6L);
			}
		} catch (Exception exception) {
			Class305.method5553(null, exception, (byte) 1);
			exception.printStackTrace();
		}
	}

	public void method9194() {
		try {
			while (!this$0.aBool10157) {
				Iterator iterator = this$0.aList10160.iterator();
				while (iterator.hasNext()) {
					Class567 class567 = (Class567) iterator.next();
					class567.method9505((byte) 0);
				}
				HashMap hashmap = this$0.method15704((byte) 7);
				Iterator iterator_1_ = hashmap.keySet().iterator();
				while (iterator_1_.hasNext()) {
					Class478 class478 = (Class478) iterator_1_.next();
					if (!class478.aBool5453) {
						Class477[] class477s = (Class477[]) hashmap.get(class478);
						for (int i = 0; i < class477s.length; i++)
							class477s[i].method7849(664057084);
					}
				}
				iterator_1_ = this$0.aList10160.iterator();
				while (iterator_1_.hasNext()) {
					Class567 class567 = (Class567) iterator_1_.next();
					class567.method9506((byte) 37);
				}
				Class653.method10656(6L);
			}
		} catch (Exception exception) {
			Class305.method5553(null, exception, (byte) 1);
			exception.printStackTrace();
		}
	}

	public void method9195() {
		try {
			while (!this$0.aBool10157) {
				Iterator iterator = this$0.aList10160.iterator();
				while (iterator.hasNext()) {
					Class567 class567 = (Class567) iterator.next();
					class567.method9505((byte) 0);
				}
				HashMap hashmap = this$0.method15704((byte) 93);
				Iterator iterator_2_ = hashmap.keySet().iterator();
				while (iterator_2_.hasNext()) {
					Class478 class478 = (Class478) iterator_2_.next();
					if (!class478.aBool5453) {
						Class477[] class477s = (Class477[]) hashmap.get(class478);
						for (int i = 0; i < class477s.length; i++)
							class477s[i].method7849(-278517364);
					}
				}
				iterator_2_ = this$0.aList10160.iterator();
				while (iterator_2_.hasNext()) {
					Class567 class567 = (Class567) iterator_2_.next();
					class567.method9506((byte) -47);
				}
				Class653.method10656(6L);
			}
		} catch (Exception exception) {
			Class305.method5553(null, exception, (byte) 1);
			exception.printStackTrace();
		}
	}

	static final void method9196(Class669 class669, Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1, short i) {
		class669.anInt8558 -= 2086504905;
		int i_3_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_4_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		int i_5_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 2];
		int i_6_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 3];
		int i_7_ = class669.anIntArray8557[4 + 1357652815 * class669.anInt8558];
		boolean bool = 1 == (class669.anIntArray8557[5 + class669.anInt8558 * 1357652815]);
		int i_8_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 6];
		if (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5342(-1390175100) != Class291.aClass291_3148)
			throw new RuntimeException();
		Class328_Sub2 class328_sub2 = (Class328_Sub2) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5430(1517298019);
		Class440 class440 = new Class440();
		Class440 class440_9_ = new Class440();
		class440.method7017(0.0F, 1.0F, 0.0F, (float) (3.141592653589793 * (double) i_7_ * 2.0 / 16384.0));
		Class437 class437 = new Class437(1.0F, 0.0F, 0.0F);
		class437.method6907(class440);
		class437.method6889();
		class440_9_.method7016(class437, (float) (2.0 * ((double) i_6_ * 3.141592653589793) / 16384.0));
		class440.method7042(class440_9_);
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		int i_10_ = 235453015 * class592.localX << 9;
		int i_11_ = 1704054549 * class592.localY << 9;
		if (null != class647_sub1_sub3_sub1)
			class328_sub2.method15595(class647_sub1_sub3_sub1, new Class437((float) i_3_, (float) i_4_, (float) i_5_), class440, bool, i_8_, (client.aClass505_11019.method8249(1879048087).anIntArrayArrayArray5033), client.aClass505_11019.method8243(1195562362), i_10_, i_11_, 1297915498);
		client.aBool11111 = true;
	}

	static final void method9197(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_12_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_13_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (2044791377 * client.exchangeOfferSlots[i_13_][i_12_].anInt5468);
	}
}
