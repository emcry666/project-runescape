/* Class511 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.LinkedList;

public class Class511 implements Runnable {
	volatile boolean aBool5758 = false;
	LinkedList aLinkedList5759 = new LinkedList();
	Class505 aClass505_5760 = new Class505(true);
	public static Class472 aClass472_5761;

	void method8536() {
		Object object = null;
		Class496 class496;
		synchronized (aLinkedList5759) {
			try {
				aLinkedList5759.wait();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			class496 = (Class496) aLinkedList5759.pollFirst();
		}
		do {
			try {
				try {
					if (class496 != null) {
						aBool5758 = true;
						method8544(class496, -2006008650);
					}
				} catch (Exception exception) {
					aBool5758 = false;
					break;
				}
				aBool5758 = false;
			} catch (Exception object_0_) {
				aBool5758 = false;
				throw object_0_;
			}
		} while (false);
	}

	public void method8537(Class53_Sub18 class53_sub18, byte i) {
		aClass505_5760.method8250(class53_sub18, -284308707);
	}

	void method8538() {
		Object object = null;
		Class496 class496;
		synchronized (aLinkedList5759) {
			try {
				aLinkedList5759.wait();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			class496 = (Class496) aLinkedList5759.pollFirst();
		}
		do {
			try {
				try {
					if (class496 != null) {
						aBool5758 = true;
						method8544(class496, -1954637597);
					}
				} catch (Exception exception) {
					aBool5758 = false;
					break;
				}
				aBool5758 = false;
			} catch (Exception object_1_) {
				aBool5758 = false;
				throw object_1_;
			}
		} while (false);
	}

	public boolean method8539(int i) {
		return aBool5758;
	}

	public Class505 method8540(int i) {
		return aClass505_5760;
	}

	void method8541(Class505 class505, byte i) {
		aClass505_5760 = class505;
	}

	public void method8542() {
		for (;;)
			method8543(-809651146);
	}

	void method8543(int i) {
		Object object = null;
		Class496 class496;
		synchronized (aLinkedList5759) {
			try {
				aLinkedList5759.wait();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			class496 = (Class496) aLinkedList5759.pollFirst();
		}
		do {
			try {
				try {
					if (class496 != null) {
						aBool5758 = true;
						method8544(class496, -2059469670);
					}
				} catch (Exception exception) {
					aBool5758 = false;
					break;
				}
				aBool5758 = false;
			} catch (Exception object_2_) {
				aBool5758 = false;
				throw object_2_;
			}
		} while (false);
	}

	void method8544(Class496 class496, int i) {
		if (class496.aClass500_5558 == Class500.aClass500_5574)
			aClass505_5760.method8294(-889374440);
		else
			aClass505_5760.method8368(class496, 1235970069);
		for (boolean bool = aClass505_5760.method8270(-221642871); !bool; bool = aClass505_5760.method8270(-221642871)) {
			/* empty */
		}
		aClass505_5760.method8253(2104865723);
		client.aClass505_11019.method8253(-219904097);
	}

	public void method8545() {
		for (;;)
			method8543(1308374847);
	}

	public void method8546(Class53_Sub18 class53_sub18) {
		aClass505_5760.method8250(class53_sub18, -1832608941);
	}

	public void method8547(Class53_Sub18 class53_sub18) {
		aClass505_5760.method8250(class53_sub18, -1144622270);
	}

	void method8548() {
		Object object = null;
		Class496 class496;
		synchronized (aLinkedList5759) {
			try {
				aLinkedList5759.wait();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			class496 = (Class496) aLinkedList5759.pollFirst();
		}
		do {
			try {
				try {
					if (class496 != null) {
						aBool5758 = true;
						method8544(class496, -2106117676);
					}
				} catch (Exception exception) {
					aBool5758 = false;
					break;
				}
				aBool5758 = false;
			} catch (Exception object_3_) {
				aBool5758 = false;
				throw object_3_;
			}
		} while (false);
	}

	public void method8549(Class53_Sub18 class53_sub18) {
		aClass505_5760.method8250(class53_sub18, -1205685939);
	}

	public void method8550(Class496 class496) {
		synchronized (aLinkedList5759) {
			aLinkedList5759.add(class496);
			aLinkedList5759.notify();
		}
	}

	public void method8551(Class496 class496) {
		synchronized (aLinkedList5759) {
			aLinkedList5759.add(class496);
			aLinkedList5759.notify();
		}
	}

	public void method8552(Class496 class496) {
		synchronized (aLinkedList5759) {
			aLinkedList5759.add(class496);
			aLinkedList5759.notify();
		}
	}

	public boolean method8553() {
		return aBool5758;
	}

	public Class505 method8554() {
		return aClass505_5760;
	}

	void method8555(Class505 class505) {
		aClass505_5760 = class505;
	}

	public void method8556(Class496 class496, short i) {
		synchronized (aLinkedList5759) {
			aLinkedList5759.add(class496);
			aLinkedList5759.notify();
		}
	}

	public void method8557(Class53_Sub18 class53_sub18) {
		aClass505_5760.method8250(class53_sub18, -348392496);
	}

	public void run() {
		for (;;)
			method8543(1506838580);
	}

	void method8558() {
		Object object = null;
		Class496 class496;
		synchronized (aLinkedList5759) {
			try {
				aLinkedList5759.wait();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			class496 = (Class496) aLinkedList5759.pollFirst();
		}
		do {
			try {
				try {
					if (class496 != null) {
						aBool5758 = true;
						method8544(class496, -1950793403);
					}
				} catch (Exception exception) {
					aBool5758 = false;
					break;
				}
				aBool5758 = false;
			} catch (Exception object_4_) {
				aBool5758 = false;
				throw object_4_;
			}
		} while (false);
	}

	void method8559(Class496 class496) {
		if (class496.aClass500_5558 == Class500.aClass500_5574)
			aClass505_5760.method8294(-889374440);
		else
			aClass505_5760.method8368(class496, 1235970069);
		for (boolean bool = aClass505_5760.method8270(-221642871); !bool; bool = aClass505_5760.method8270(-221642871)) {
			/* empty */
		}
		aClass505_5760.method8253(-659941494);
		client.aClass505_11019.method8253(-499322331);
	}

	void method8560(Class496 class496) {
		if (class496.aClass500_5558 == Class500.aClass500_5574)
			aClass505_5760.method8294(-889374440);
		else
			aClass505_5760.method8368(class496, 1235970069);
		for (boolean bool = aClass505_5760.method8270(-221642871); !bool; bool = aClass505_5760.method8270(-221642871)) {
			/* empty */
		}
		aClass505_5760.method8253(-477701723);
		client.aClass505_11019.method8253(-1580750667);
	}

	public static int method8561(int i) {
		if (3 == Class569.anInt7631 * 963672803)
			return -1;
		if (963672803 * Class569.anInt7631 != 0)
			return Class569.anInt7636 * 359766717;
		if (Class569.aStringArray7634 == null) {
			if (Class509.aString5723.startsWith("mac ")) {
				if (Class509.aString5724.startsWith("ppc")) {
					Class569.anInt7631 = 514052193;
					return -1;
				}
				Class569.aStringArray7634 = new String[3];
				Class569.aStringArray7634[0] = "sdk-mac-dynamic";
				Class569.aStringArray7634[1] = "twitchsdk";
				Class569.aStringArray7634[2] = "twitchtv";
				Class569.aBoolArray7633 = new boolean[3];
				Class569.aBoolArray7633[0] = false;
				Class569.aBoolArray7633[1] = false;
				Class569.aBoolArray7633[2] = true;
			} else if (Class509.aString5723.startsWith("win")) {
				Class569.aStringArray7634 = new String[6];
				Class569.aStringArray7634[0] = "avutil-ttv-51";
				Class569.aStringArray7634[1] = "libmp3lame-ttv";
				Class569.aStringArray7634[2] = "swresample-ttv-0";
				Class569.aStringArray7634[5] = "twitchtv";
				if (Class509.aString5724.startsWith("amd64") || Class509.aString5724.startsWith("x86_64")) {
					Class569.aStringArray7634[3] = "libmfxsw64";
					Class569.aStringArray7634[4] = "twitchsdk_64_release";
				} else if (Class509.aString5724.startsWith("i386") || Class509.aString5724.startsWith("i486") || Class509.aString5724.startsWith("i586") || Class509.aString5724.startsWith("x86")) {
					Class569.aStringArray7634[3] = "libmfxsw32";
					Class569.aStringArray7634[4] = "twitchsdk_32_release";
				} else {
					Class569.anInt7631 = 514052193;
					return -1;
				}
				Class569.aBoolArray7633 = new boolean[6];
				Class569.aBoolArray7633[0] = true;
				Class569.aBoolArray7633[1] = true;
				Class569.aBoolArray7633[2] = true;
				Class569.aBoolArray7633[3] = false;
				Class569.aBoolArray7633[4] = true;
				Class569.aBoolArray7633[5] = true;
			} else {
				Class569.anInt7631 = 514052193;
				return -1;
			}
		}
		Class569.anInt7631 = 171350731;
		return 0;
	}

	static final void method8562(Class669 class669, int i) {
		int i_5_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_5_, -1152617477);
		Class242 class242 = Class31.aClass242Array302[i_5_ >> 16];
		Class65.method1436(class250, class242, class669, (byte) 12);
	}

	static final void method8563(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, byte i) {
		class250.anInt2631 = class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)] * -1740552373;
	}

	static final void method8564(Class669 class669, byte i) {
		class669.anInt8558 -= 2121349901;
		Class274.method5034((class669.anIntArray8557[1 + 1357652815 * class669.anInt8558]), -2090997914);
	}

	static final void method8565(int i) {
		Login.method15991(client.aClass250_11197, (byte) -29);
		Class23.anInt236 += 1738486703;
		if (!client.aBool11207 || !client.aBool11213) {
			if (Class23.anInt236 * 956040015 > 1) {
				client.aClass250_11197 = null;
				client.aClass250_11198 = null;
			}
		} else {
			int i_6_ = Class642.aClass561_8334.method9426((byte) 54);
			int i_7_ = Class642.aClass561_8334.method9432(-1115609172);
			i_6_ -= client.anInt11104 * -1761464565;
			i_7_ -= client.anInt11200 * 1635185731;
			if (i_6_ < client.anInt11270 * 947059145)
				i_6_ = 947059145 * client.anInt11270;
			if (client.aClass250_11197.anInt2581 * 365308179 + i_6_ > (client.anInt11158 * 1076211565 + 947059145 * client.anInt11270))
				i_6_ = (client.anInt11158 * 1076211565 + 947059145 * client.anInt11270 - client.aClass250_11197.anInt2581 * 365308179);
			if (i_7_ < -1561193723 * client.anInt11204)
				i_7_ = client.anInt11204 * -1561193723;
			if (-1759297857 * client.aClass250_11197.anInt2543 + i_7_ > (-1561193723 * client.anInt11204 + 1984528093 * client.anInt11206))
				i_7_ = (1984528093 * client.anInt11206 + client.anInt11204 * -1561193723 - client.aClass250_11197.anInt2543 * -1759297857);
			int i_8_;
			int i_9_;
			if (BaseVarType.aClass250_5391 == client.aClass250_11198) {
				i_8_ = i_6_;
				i_9_ = i_7_;
			} else {
				i_8_ = (-448482823 * client.aClass250_11198.anInt2636 + (i_6_ - client.anInt11270 * 947059145));
				i_9_ = (i_7_ - client.anInt11204 * -1561193723 + client.aClass250_11198.anInt2539 * -1013149031);
			}
			if (!Class642.aClass561_8334.method9425((byte) -105)) {
				if (client.aBool11231) {
					Class399.method6533(298917845);
					if (null != client.aClass250_11197.anObjectArray2645) {
						Class523_Sub38 class523_sub38 = new Class523_Sub38();
						class523_sub38.aClass250_10678 = client.aClass250_11197;
						class523_sub38.anInt10681 = 298091521 * i_8_;
						class523_sub38.anInt10682 = i_9_ * -289057189;
						InterfaceComponentDefinitions class250 = client.method17597(client.aClass250_11197);
						InterfaceComponentDefinitions class250_10_ = client.aClass250_11201;
						boolean bool = false;
						for (/**/; (class250_10_ != null && 97896203 * class250_10_.parentId != -1 && class250 != null); class250_10_ = (Class31.aClass242Array302[(-1363815505 * class250_10_.interfaceHash >> 16)].aClass250Array2457[(97896203 * class250_10_.parentId & 0xffff)])) {
							if (-1363815505 * class250_10_.interfaceHash == -1363815505 * class250.interfaceHash) {
								bool = true;
								break;
							}
						}
						if (class250_10_ != null && null != class250 && BaseVarType.aClass250_5391 != class250 && !bool)
							class523_sub38.aClass250_10684 = BaseVarType.aClass250_5391;
						else
							class523_sub38.aClass250_10684 = client.aClass250_11201;
						class523_sub38.anObjectArray10687 = client.aClass250_11197.anObjectArray2645;
						Class482.method7916(class523_sub38, (byte) 3);
					}
					if (client.aClass250_11201 != null && client.method17597(client.aClass250_11197) != null)
						Class149_Sub1.method14397(client.aClass250_11197, client.aClass250_11201, (byte) -62);
				} else if ((1 == client.anInt11176 * 247606787 || Class150.method2520((byte) 110)) && Class36.anInt330 * 462991943 > 2)
					InterfaceComponentDefinitions.method4520((-1761464565 * client.anInt11104 + client.anInt11208 * 1656755535), (client.anInt11200 * 1635185731 + client.anInt11209 * 761746501), -1076969043);
				else if (Class318.method5694((byte) -37))
					InterfaceComponentDefinitions.method4520((client.anInt11208 * 1656755535 + -1761464565 * client.anInt11104), (1635185731 * client.anInt11200 + client.anInt11209 * 761746501), -1076969043);
				client.aClass250_11197 = null;
				client.aClass250_11198 = null;
			} else {
				if (Class23.anInt236 * 956040015 > client.aClass250_11197.anInt2627 * 2012577559) {
					int i_11_ = i_6_ - client.anInt11208 * 1656755535;
					int i_12_ = i_7_ - 761746501 * client.anInt11209;
					if (i_11_ > -400979357 * client.aClass250_11197.anInt2631 || i_11_ < -(client.aClass250_11197.anInt2631 * -400979357) || (i_12_ > -400979357 * client.aClass250_11197.anInt2631) || i_12_ < -(-400979357 * client.aClass250_11197.anInt2631))
						client.aBool11231 = true;
				}
				if (client.aClass250_11197.anObjectArray2576 != null && client.aBool11231) {
					Class523_Sub38 class523_sub38 = new Class523_Sub38();
					class523_sub38.aClass250_10678 = client.aClass250_11197;
					class523_sub38.anInt10681 = 298091521 * i_8_;
					class523_sub38.anInt10682 = -289057189 * i_9_;
					class523_sub38.anObjectArray10687 = client.aClass250_11197.anObjectArray2576;
					Class482.method7916(class523_sub38, (byte) 3);
				}
			}
		}
	}

	public static Class682[] method8566(int i) {
		return (new Class682[] { Class682.aClass682_8656, Class682.aClass682_8657, Class682.aClass682_8654, Class682.aClass682_8653, Class682.aClass682_8659, Class682.aClass682_8651, Class682.aClass682_8650, Class682.aClass682_8655 });
	}
}
