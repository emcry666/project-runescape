/* Class561_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class561_Sub1 extends Class561 implements MouseListener, MouseMotionListener, MouseWheelListener {
	static final int anInt10802 = 1;
	static final int anInt10803 = 2;
	static final int anInt10804 = 4;
	int anInt10805;
	Component aComponent10806;
	int anInt10807;
	Class708 aClass708_10808 = new Class708();
	int anInt10809;
	int anInt10810;
	int anInt10811;
	Class708 aClass708_10812 = new Class708();
	int anInt10813;
	boolean aBool10814;

	void method16658(int i, int i_0_, int i_1_, int i_2_) {
		Class523_Sub39_Sub1 class523_sub39_sub1 = Class375.method6387(i, i_0_, i_1_, Class248.method4401(1516375036), i_2_, (byte) 6);
		aClass708_10812.method14236(class523_sub39_sub1, -1373006864);
	}

	void method16659(Component component, int i) {
		method16664(517711017);
		aComponent10806 = component;
		aComponent10806.addMouseListener(this);
		aComponent10806.addMouseMotionListener(this);
		aComponent10806.addMouseWheelListener(this);
	}

	public int method9447() {
		return anInt10811 * 627988951;
	}

	void method16660(int i, int i_3_, int i_4_, int i_5_, byte i_6_) {
		Class523_Sub39_Sub1 class523_sub39_sub1 = Class375.method6387(i, i_3_, i_4_, Class248.method4401(1516375036), i_5_, (byte) 46);
		aClass708_10812.method14236(class523_sub39_sub1, -670546004);
	}

	public boolean method9436() {
		return 0 != (-1020999047 * anInt10813 & 0x1);
	}

	public synchronized void mousePressed(MouseEvent mouseevent) {
		int i = method16665(mouseevent, 1632710487);
		if (1 == i)
			method16660(0, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), (byte) 1);
		else if (i == 4)
			method16660(2, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), (byte) 1);
		else if (2 == i)
			method16660(1, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), (byte) 1);
		anInt10810 = -418771611 * (164125805 * anInt10810 | i);
		if (mouseevent.isPopupTrigger())
			mouseevent.consume();
	}

	public synchronized void method9421(int i) {
		anInt10811 = -1638027429 * anInt10809;
		anInt10805 = 93152965 * anInt10807;
		anInt10813 = anInt10810 * -1766742891;
		Class708 class708 = aClass708_10808;
		aClass708_10808 = aClass708_10812;
		aClass708_10812 = class708;
		aClass708_10812.method14235((byte) 82);
	}

	public boolean method9422(byte i) {
		return 0 != (-1020999047 * anInt10813 & 0x1);
	}

	public boolean method9423(byte i) {
		return (anInt10813 * -1020999047 & 0x2) != 0;
	}

	void method16661() {
		if (aComponent10806 != null) {
			aComponent10806.removeMouseWheelListener(this);
			aComponent10806.removeMouseMotionListener(this);
			aComponent10806.removeMouseListener(this);
			aComponent10806 = null;
			anInt10813 = 0;
			anInt10805 = 0;
			anInt10811 = 0;
			anInt10810 = 0;
			anInt10807 = 0;
			anInt10809 = 0;
			aClass708_10808 = null;
			aClass708_10812 = null;
		}
	}

	public int method9426(byte i) {
		return anInt10811 * 627988951;
	}

	int method16662(MouseEvent mouseevent) {
		if (mouseevent.getButton() == 1) {
			if (mouseevent.isMetaDown())
				return 4;
			return 1;
		}
		if (mouseevent.getButton() == 2)
			return 2;
		if (mouseevent.getButton() == 3)
			return 4;
		return 0;
	}

	public void method9455(int i) {
		method16664(-941989226);
	}

	public synchronized void mouseClicked(MouseEvent mouseevent) {
		if (mouseevent.isPopupTrigger())
			mouseevent.consume();
	}

	public int method9451() {
		return anInt10805 * -2103737395;
	}

	public boolean method9424(int i) {
		return (anInt10813 * -1020999047 & 0x4) != 0;
	}

	void method16663(int i, int i_7_, int i_8_, int i_9_) {
		Class523_Sub39_Sub1 class523_sub39_sub1 = Class375.method6387(i, i_7_, i_8_, Class248.method4401(1516375036), i_9_, (byte) 125);
		aClass708_10812.method14236(class523_sub39_sub1, -1187393884);
	}

	public int method9432(int i) {
		return anInt10805 * -2103737395;
	}

	public synchronized void mouseReleased(MouseEvent mouseevent) {
		int i = method16665(mouseevent, 1925845073);
		if ((164125805 * anInt10810 & i) == 0)
			i = 164125805 * anInt10810;
		if ((i & 0x1) != 0)
			method16660(3, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), (byte) 1);
		if (0 != (i & 0x4))
			method16660(5, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), (byte) 1);
		if ((i & 0x2) != 0)
			method16660(4, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), (byte) 1);
		anInt10810 = -418771611 * (164125805 * anInt10810 & (i ^ 0xffffffff));
		if (mouseevent.isPopupTrigger())
			mouseevent.consume();
	}

	void method16664(int i) {
		if (aComponent10806 != null) {
			aComponent10806.removeMouseWheelListener(this);
			aComponent10806.removeMouseMotionListener(this);
			aComponent10806.removeMouseListener(this);
			aComponent10806 = null;
			anInt10813 = 0;
			anInt10805 = 0;
			anInt10811 = 0;
			anInt10810 = 0;
			anInt10807 = 0;
			anInt10809 = 0;
			aClass708_10808 = null;
			aClass708_10812 = null;
		}
	}

	public synchronized void mouseMoved(MouseEvent mouseevent) {
		method16667(mouseevent.getX(), mouseevent.getY(), 159935257);
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
		int i = mousewheelevent.getX();
		int i_10_ = mousewheelevent.getY();
		int i_11_ = mousewheelevent.getWheelRotation();
		method16660(6, i, i_10_, i_11_, (byte) 1);
		mousewheelevent.consume();
	}

	int method16665(MouseEvent mouseevent, int i) {
		if (mouseevent.getButton() == 1) {
			if (mouseevent.isMetaDown())
				return 4;
			return 1;
		}
		if (mouseevent.getButton() == 2)
			return 2;
		if (mouseevent.getButton() == 3)
			return 4;
		return 0;
	}

	public boolean method9437() {
		return 0 != (-1020999047 * anInt10813 & 0x1);
	}

	public boolean method9429() {
		return 0 != (-1020999047 * anInt10813 & 0x1);
	}

	public boolean method9443() {
		return (anInt10813 * -1020999047 & 0x2) != 0;
	}

	public boolean method9439() {
		return (anInt10813 * -1020999047 & 0x4) != 0;
	}

	public boolean method9442() {
		return (anInt10813 * -1020999047 & 0x4) != 0;
	}

	public boolean method9438() {
		return (anInt10813 * -1020999047 & 0x4) != 0;
	}

	public boolean method9420() {
		return (anInt10813 * -1020999047 & 0x4) != 0;
	}

	public boolean method9444() {
		return (anInt10813 * -1020999047 & 0x4) != 0;
	}

	public synchronized void mouseEntered(MouseEvent mouseevent) {
		method16667(mouseevent.getX(), mouseevent.getY(), 159935257);
	}

	public int method9448() {
		return anInt10811 * 627988951;
	}

	public int method9449() {
		return anInt10805 * -2103737395;
	}

	public synchronized void mouseDragged(MouseEvent mouseevent) {
		method16667(mouseevent.getX(), mouseevent.getY(), 159935257);
	}

	public Class523_Sub39 method9428(short i) {
		return (Class523_Sub39) aClass708_10808.method14293(2076440294);
	}

	public int method9452() {
		return anInt10805 * -2103737395;
	}

	Class561_Sub1(Component component, boolean bool) {
		method16659(component, 736214381);
		aBool10814 = bool;
	}

	public void method9454() {
		method16664(510300394);
	}

	void method16666(Component component) {
		method16664(586594947);
		aComponent10806 = component;
		aComponent10806.addMouseListener(this);
		aComponent10806.addMouseMotionListener(this);
		aComponent10806.addMouseWheelListener(this);
	}

	void method16667(int i, int i_12_, int i_13_) {
		anInt10809 = i * -1896783515;
		anInt10807 = i_12_ * -1494846143;
		if (aBool10814)
			method16660(-1, i, i_12_, 0, (byte) 1);
	}

	void method16668() {
		if (aComponent10806 != null) {
			aComponent10806.removeMouseWheelListener(this);
			aComponent10806.removeMouseMotionListener(this);
			aComponent10806.removeMouseListener(this);
			aComponent10806 = null;
			anInt10813 = 0;
			anInt10805 = 0;
			anInt10811 = 0;
			anInt10810 = 0;
			anInt10807 = 0;
			anInt10809 = 0;
			aClass708_10808 = null;
			aClass708_10812 = null;
		}
	}

	public synchronized void method9427() {
		anInt10811 = -1638027429 * anInt10809;
		anInt10805 = 93152965 * anInt10807;
		anInt10813 = anInt10810 * -1766742891;
		Class708 class708 = aClass708_10808;
		aClass708_10808 = aClass708_10812;
		aClass708_10812 = class708;
		aClass708_10812.method14235((byte) -87);
	}

	void method16669(Component component) {
		method16664(-1528417660);
		aComponent10806 = component;
		aComponent10806.addMouseListener(this);
		aComponent10806.addMouseMotionListener(this);
		aComponent10806.addMouseWheelListener(this);
	}

	public int method9450() {
		return anInt10805 * -2103737395;
	}

	void method16670(int i, int i_14_) {
		anInt10809 = i * -1896783515;
		anInt10807 = i_14_ * -1494846143;
		if (aBool10814)
			method16660(-1, i, i_14_, 0, (byte) 1);
	}

	public synchronized void method9445() {
		anInt10811 = -1638027429 * anInt10809;
		anInt10805 = 93152965 * anInt10807;
		anInt10813 = anInt10810 * -1766742891;
		Class708 class708 = aClass708_10808;
		aClass708_10808 = aClass708_10812;
		aClass708_10812 = class708;
		aClass708_10812.method14235((byte) -57);
	}

	public Class523_Sub39 method9453() {
		return (Class523_Sub39) aClass708_10808.method14293(2061011611);
	}

	public synchronized void method9456() {
		anInt10811 = -1638027429 * anInt10809;
		anInt10805 = 93152965 * anInt10807;
		anInt10813 = anInt10810 * -1766742891;
		Class708 class708 = aClass708_10808;
		aClass708_10808 = aClass708_10812;
		aClass708_10812 = class708;
		aClass708_10812.method14235((byte) 9);
	}

	int method16671(MouseEvent mouseevent) {
		if (mouseevent.getButton() == 1) {
			if (mouseevent.isMetaDown())
				return 4;
			return 1;
		}
		if (mouseevent.getButton() == 2)
			return 2;
		if (mouseevent.getButton() == 3)
			return 4;
		return 0;
	}

	int method16672(MouseEvent mouseevent) {
		if (mouseevent.getButton() == 1) {
			if (mouseevent.isMetaDown())
				return 4;
			return 1;
		}
		if (mouseevent.getButton() == 2)
			return 2;
		if (mouseevent.getButton() == 3)
			return 4;
		return 0;
	}

	public synchronized void mouseExited(MouseEvent mouseevent) {
		method16667(mouseevent.getX(), mouseevent.getY(), 159935257);
	}

	int method16673(MouseEvent mouseevent) {
		if (mouseevent.getButton() == 1) {
			if (mouseevent.isMetaDown())
				return 4;
			return 1;
		}
		if (mouseevent.getButton() == 2)
			return 2;
		if (mouseevent.getButton() == 3)
			return 4;
		return 0;
	}

	static final void method16674(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}
}
