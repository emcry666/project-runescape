/* Class553 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Iterator;

class Class553 implements Runnable {
	Class375_Sub1 this$0;

	public void run() {
		try {
			while (!this$0.aBool10157) {
				HashMap hashmap = this$0.method15704((byte) 86);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class478 class478 = (Class478) iterator.next();
					if (!class478.aBool5453) {
						Class477[] class477s = (Class477[]) hashmap.get(class478);
						for (int i = 0; i < class477s.length; i++)
							class477s[i].method7800(-2063355269);
					}
				}
				Class653.method10656(10L);
			}
		} catch (Exception exception) {
			Class305.method5553(null, exception, (byte) 1);
			exception.printStackTrace();
		}
	}

	public void method9159() {
		try {
			while (!this$0.aBool10157) {
				HashMap hashmap = this$0.method15704((byte) 79);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class478 class478 = (Class478) iterator.next();
					if (!class478.aBool5453) {
						Class477[] class477s = (Class477[]) hashmap.get(class478);
						for (int i = 0; i < class477s.length; i++)
							class477s[i].method7800(-2135035525);
					}
				}
				Class653.method10656(10L);
			}
		} catch (Exception exception) {
			Class305.method5553(null, exception, (byte) 1);
			exception.printStackTrace();
		}
	}

	Class553(Class375_Sub1 class375_sub1) {
		this$0 = class375_sub1;
	}

	public void method9160() {
		try {
			while (!this$0.aBool10157) {
				HashMap hashmap = this$0.method15704((byte) 75);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class478 class478 = (Class478) iterator.next();
					if (!class478.aBool5453) {
						Class477[] class477s = (Class477[]) hashmap.get(class478);
						for (int i = 0; i < class477s.length; i++)
							class477s[i].method7800(-2045388092);
					}
				}
				Class653.method10656(10L);
			}
		} catch (Exception exception) {
			Class305.method5553(null, exception, (byte) 1);
			exception.printStackTrace();
		}
	}

	public static int method9161(int i) {
		return 963672803 * Class569.anInt7631;
	}

	public static void method9162(Class560 class560, Class178 class178, byte i) {
		Iterator iterator = Class617.aList8045.iterator();
		while (iterator.hasNext()) {
			Class621 class621 = (Class621) iterator.next();
			if (class621.aBool8085)
				class621.method10134(class560, class178);
		}
	}

	static final void method9163(Class669 class669, byte i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_0_, -1437204886);
		Class242 class242 = Class31.aClass242Array302[i_0_ >> 16];
		Class246.method4385(class250, class242, class669, -1870392416);
	}

	public static void method9164(int i, int i_1_, int i_2_, String string, int i_3_) {
		InterfaceComponentDefinitions class250 = Class654.method10722(i_1_, i_2_, (byte) -4);
		if (class250 != null) {
			if (null != class250.anObjectArray2661) {
				Class523_Sub38 class523_sub38 = new Class523_Sub38();
				class523_sub38.aClass250_10678 = class250;
				class523_sub38.anInt10683 = -507775811 * i;
				class523_sub38.aString10680 = string;
				class523_sub38.anObjectArray10687 = class250.anObjectArray2661;
				Class482.method7916(class523_sub38, (byte) 3);
			}
			if (client.method17252(class250).method15966(i - 1, -464386923)) {
				RSStream class116 = Class537.method8941(-2079305718);
				if (-2020118759 * client.anInt11136 == 0 || 9 == client.anInt11136 * -2020118759 || client.anInt11136 * -2020118759 == 11) {
					if (null != class250.aString2515 && class250.aClass233_2683 != null) {
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.aClass408_4220), (class116.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(7 + Class6.method555(class250.aString2515, (byte) 25) + 1, 1830477006);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(i, -739920380);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(i_2_, -1262882661);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV2(i_1_, -2112256614);
						class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(class250.aClass233_2683.method82(), -159492164);
						class523_sub22.aClass523_Sub34_Sub2_10525.method16270(class250.aString2515, (byte) 89);
						class116.method1974(class523_sub22, (byte) 55);
					} else
						Class168_Sub2.method15409(class116, class250, i, i_1_, i_2_, -1762195064);
				}
			}
		}
	}
}
