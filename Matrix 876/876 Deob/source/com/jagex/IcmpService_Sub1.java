/* IcmpService_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jaclib.ping.IcmpService;

public class IcmpService_Sub1 extends IcmpService {
	List aList10859 = new ArrayList();

	protected void method1686(int i, int i_0_, int i_1_) {
		Iterator iterator = aList10859.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method491(i, i_0_, i_1_, (byte) 44);
		}
	}

	protected void notify(int i) {
		Iterator iterator = aList10859.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method490(i == 0, -1424825111);
		}
	}

	protected void notify(int i, int i_2_, int i_3_) {
		Iterator iterator = aList10859.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method491(i, i_2_, i_3_, (byte) 114);
		}
	}

	public static void method16878() {
		if (Class665.anIcmpService_Sub1_8528 != null) {
			try {
				Class665.anIcmpService_Sub1_8528.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			Class665.anIcmpService_Sub1_8528 = null;
		}
	}

	public static boolean method16879() {
		do {
			boolean bool;
			try {
				if (available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (Class665.anIcmpService_Sub1_8528 != null)
			throw new IllegalStateException("");
		Class665.anIcmpService_Sub1_8528 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class649());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	IcmpService_Sub1() {
		/* empty */
	}

	protected void method1681(int i) {
		Iterator iterator = aList10859.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method490(i == 0, -1712166398);
		}
	}

	public static boolean method16880() {
		do {
			boolean bool;
			try {
				if (available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (Class665.anIcmpService_Sub1_8528 != null)
			throw new IllegalStateException("");
		Class665.anIcmpService_Sub1_8528 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class649());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	protected void method1683(int i, int i_4_, int i_5_) {
		Iterator iterator = aList10859.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method491(i, i_4_, i_5_, (byte) 47);
		}
	}

	protected void method1684(int i, int i_6_, int i_7_) {
		Iterator iterator = aList10859.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method491(i, i_6_, i_7_, (byte) 28);
		}
	}

	protected void method1685(int i, int i_8_, int i_9_) {
		Iterator iterator = aList10859.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method491(i, i_8_, i_9_, (byte) 67);
		}
	}

	protected void method1682(int i) {
		Iterator iterator = aList10859.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method490(i == 0, -1984099314);
		}
	}

	static final void method16881(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class252.method4538(class250, class242, class669, 2097331984);
	}

	static final void method16882(Class669 class669, int i) {
		int i_10_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (!Class31.aClass178_303.method3032())
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 3;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub39_10605.method13890(i_10_, 2053281188);
	}
}
