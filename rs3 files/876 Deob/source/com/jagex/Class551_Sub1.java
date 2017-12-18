/* Class551_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Class551_Sub1 extends Class551 implements KeyListener, FocusListener {
	Class708 aClass708_10591;
	static final int anInt10592 = 112;
	static final int anInt10593 = 128;
	boolean[] aBoolArray10594;
	Class708 aClass708_10595 = new Class708();
	Component aComponent10596;
	static int[] anIntArray10597 = { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0, 0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	public synchronized void method16198(KeyEvent keyevent) {
		char c = keyevent.getKeyChar();
		if (c != '\uffff' && Class145.method2382(c, (byte) 11)) {
			method16213(3, c, -1, 419684);
			keyevent.consume();
		}
	}

	public Interface64 method9131() {
		return (Interface64) aClass708_10595.method14293(1990879434);
	}

	public boolean method9125(int i) {
		if (i < 0 || i >= 112)
			return false;
		return aBoolArray10594[i];
	}

	public synchronized void method16199(FocusEvent focusevent) {
		method16213(-1, '\0', 0, 419684);
	}

	public Interface64 method9128(int i) {
		return (Interface64) aClass708_10595.method14293(2067600902);
	}

	int method16200() {
		int i = 0;
		if (aBoolArray10594[81])
			i |= 0x1;
		if (aBoolArray10594[82])
			i |= 0x4;
		if (aBoolArray10594[86])
			i |= 0x2;
		return i;
	}

	public synchronized void method9135(int i) {
		aClass708_10595.method14235((byte) 18);
		for (Class523_Sub37 class523_sub37 = (Class523_Sub37) aClass708_10591.method14293(2102788757); null != class523_sub37; class523_sub37 = (Class523_Sub37) aClass708_10591.method14293(2080539108)) {
			class523_sub37.anInt10672 = method16215(-1233467849) * 469504401;
			if (0 == class523_sub37.anInt10673 * 715124767) {
				if (!aBoolArray10594[class523_sub37.anInt10676 * -693382237]) {
					Class523_Sub37 class523_sub37_0_ = new Class523_Sub37();
					class523_sub37_0_.anInt10673 = 0;
					class523_sub37_0_.aChar10671 = '\uffff';
					class523_sub37_0_.anInt10676 = 1 * class523_sub37.anInt10676;
					class523_sub37_0_.aLong10675 = class523_sub37.aLong10675 * 1L;
					class523_sub37_0_.anInt10672 = class523_sub37.anInt10672 * 1;
					aClass708_10595.method14236(class523_sub37_0_, 58652380);
					aBoolArray10594[-693382237 * class523_sub37.anInt10676] = true;
				}
				class523_sub37.anInt10673 = 1445402558;
				aClass708_10595.method14236(class523_sub37, -816700055);
			} else if (1 == class523_sub37.anInt10673 * 715124767) {
				if (aBoolArray10594[class523_sub37.anInt10676 * -693382237]) {
					aClass708_10595.method14236(class523_sub37, -1407412271);
					aBoolArray10594[-693382237 * class523_sub37.anInt10676] = false;
				}
			} else if (class523_sub37.anInt10673 * 715124767 == -1) {
				for (int i_1_ = 0; i_1_ < 112; i_1_++) {
					if (aBoolArray10594[i_1_]) {
						Class523_Sub37 class523_sub37_2_ = new Class523_Sub37();
						class523_sub37_2_.anInt10673 = 722701279;
						class523_sub37_2_.aChar10671 = '\uffff';
						class523_sub37_2_.anInt10676 = -1047988213 * i_1_;
						class523_sub37_2_.aLong10675 = 1L * class523_sub37.aLong10675;
						class523_sub37_2_.anInt10672 = class523_sub37.anInt10672 * 1;
						aClass708_10595.method14236(class523_sub37_2_, 474632688);
						aBoolArray10594[i_1_] = false;
					}
				}
			} else if (class523_sub37.anInt10673 * 715124767 == 3)
				aClass708_10595.method14236(class523_sub37, -1130563401);
		}
	}

	public void method9129(byte i) {
		method16210(-1764175771);
	}

	public boolean method9127(int i, byte i_3_) {
		if (i < 0 || i >= 112)
			return false;
		return aBoolArray10594[i];
	}

	void method16201(KeyEvent keyevent, int i, byte i_4_) {
		int i_5_ = keyevent.getKeyCode();
		if (0 != i_5_) {
			if (i_5_ >= 0 && i_5_ < anIntArray10597.length) {
				i_5_ = anIntArray10597[i_5_];
				if (0 == i && (i_5_ & 0x80) != 0)
					i_5_ = 0;
				else
					i_5_ &= ~0x80;
			} else
				i_5_ = 0;
		} else
			i_5_ = 0;
		if (i_5_ != 0) {
			method16213(i, '\uffff', i_5_, 419684);
			keyevent.consume();
		}
	}

	public synchronized void keyPressed(KeyEvent keyevent) {
		method16201(keyevent, 0, (byte) 2);
	}

	public synchronized void keyReleased(KeyEvent keyevent) {
		method16201(keyevent, 1, (byte) 116);
	}

	Class551_Sub1(Component component) {
		aClass708_10591 = new Class708();
		aBoolArray10594 = new boolean[112];
		Class192.method3638((byte) 11);
		method16214(component, (byte) 82);
	}

	public void focusGained(FocusEvent focusevent) {
		/* empty */
	}

	public synchronized void focusLost(FocusEvent focusevent) {
		method16213(-1, '\0', 0, 419684);
	}

	public void method16202(FocusEvent focusevent) {
		/* empty */
	}

	public void method16203(FocusEvent focusevent) {
		/* empty */
	}

	void method16204() {
		if (aComponent10596 != null) {
			aComponent10596.removeKeyListener(this);
			aComponent10596.removeFocusListener(this);
			aComponent10596 = null;
			for (int i = 0; i < 112; i++)
				aBoolArray10594[i] = false;
			aClass708_10595.method14235((byte) -83);
			aClass708_10591.method14235((byte) 60);
		}
	}

	public synchronized void method16205(FocusEvent focusevent) {
		method16213(-1, '\0', 0, 419684);
	}

	public synchronized void method16206(FocusEvent focusevent) {
		method16213(-1, '\0', 0, 419684);
	}

	public synchronized void method16207(FocusEvent focusevent) {
		method16213(-1, '\0', 0, 419684);
	}

	static void method16208() {
		anIntArray10597[44] = 71;
		anIntArray10597[45] = 26;
		anIntArray10597[46] = 72;
		anIntArray10597[47] = 73;
		anIntArray10597[59] = 57;
		anIntArray10597[61] = 27;
		anIntArray10597[91] = 42;
		anIntArray10597[92] = 74;
		anIntArray10597[93] = 43;
		anIntArray10597[192] = 28;
		anIntArray10597[222] = 58;
		anIntArray10597[520] = 59;
	}

	public synchronized void method16209(KeyEvent keyevent) {
		method16201(keyevent, 1, (byte) 84);
	}

	public void method9126() {
		method16210(5442497);
	}

	void method16210(int i) {
		if (aComponent10596 != null) {
			aComponent10596.removeKeyListener(this);
			aComponent10596.removeFocusListener(this);
			aComponent10596 = null;
			for (int i_6_ = 0; i_6_ < 112; i_6_++)
				aBoolArray10594[i_6_] = false;
			aClass708_10595.method14235((byte) -73);
			aClass708_10591.method14235((byte) -75);
		}
	}

	public boolean method9138(int i) {
		if (i < 0 || i >= 112)
			return false;
		return aBoolArray10594[i];
	}

	void method16211(int i, char c, int i_7_) {
		Class523_Sub37 class523_sub37 = new Class523_Sub37();
		class523_sub37.anInt10673 = i * 722701279;
		class523_sub37.aChar10671 = c;
		class523_sub37.anInt10676 = i_7_ * -1047988213;
		class523_sub37.aLong10675 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -9053204302428677845L;
		aClass708_10591.method14236(class523_sub37, -1641085890);
	}

	public Interface64 method9130() {
		return (Interface64) aClass708_10595.method14293(2055028294);
	}

	public Interface64 method9137() {
		return (Interface64) aClass708_10595.method14293(2129531605);
	}

	public synchronized void method9136() {
		aClass708_10595.method14235((byte) -29);
		for (Class523_Sub37 class523_sub37 = (Class523_Sub37) aClass708_10591.method14293(2021360343); null != class523_sub37; class523_sub37 = (Class523_Sub37) aClass708_10591.method14293(2047251722)) {
			class523_sub37.anInt10672 = method16215(-664727979) * 469504401;
			if (0 == class523_sub37.anInt10673 * 715124767) {
				if (!aBoolArray10594[class523_sub37.anInt10676 * -693382237]) {
					Class523_Sub37 class523_sub37_8_ = new Class523_Sub37();
					class523_sub37_8_.anInt10673 = 0;
					class523_sub37_8_.aChar10671 = '\uffff';
					class523_sub37_8_.anInt10676 = 1 * class523_sub37.anInt10676;
					class523_sub37_8_.aLong10675 = class523_sub37.aLong10675 * 1L;
					class523_sub37_8_.anInt10672 = class523_sub37.anInt10672 * 1;
					aClass708_10595.method14236(class523_sub37_8_, -1390625337);
					aBoolArray10594[-693382237 * class523_sub37.anInt10676] = true;
				}
				class523_sub37.anInt10673 = 1445402558;
				aClass708_10595.method14236(class523_sub37, 1002121605);
			} else if (1 == class523_sub37.anInt10673 * 715124767) {
				if (aBoolArray10594[class523_sub37.anInt10676 * -693382237]) {
					aClass708_10595.method14236(class523_sub37, -1932925672);
					aBoolArray10594[-693382237 * class523_sub37.anInt10676] = false;
				}
			} else if (class523_sub37.anInt10673 * 715124767 == -1) {
				for (int i = 0; i < 112; i++) {
					if (aBoolArray10594[i]) {
						Class523_Sub37 class523_sub37_9_ = new Class523_Sub37();
						class523_sub37_9_.anInt10673 = 722701279;
						class523_sub37_9_.aChar10671 = '\uffff';
						class523_sub37_9_.anInt10676 = -1047988213 * i;
						class523_sub37_9_.aLong10675 = 1L * class523_sub37.aLong10675;
						class523_sub37_9_.anInt10672 = class523_sub37.anInt10672 * 1;
						aClass708_10595.method14236(class523_sub37_9_, 343008388);
						aBoolArray10594[i] = false;
					}
				}
			} else if (class523_sub37.anInt10673 * 715124767 == 3)
				aClass708_10595.method14236(class523_sub37, -435674838);
		}
	}

	public synchronized void method16212(KeyEvent keyevent) {
		char c = keyevent.getKeyChar();
		if (c != '\uffff' && Class145.method2382(c, (byte) 11)) {
			method16213(3, c, -1, 419684);
			keyevent.consume();
		}
	}

	void method16213(int i, char c, int i_10_, int i_11_) {
		Class523_Sub37 class523_sub37 = new Class523_Sub37();
		class523_sub37.anInt10673 = i * 722701279;
		class523_sub37.aChar10671 = c;
		class523_sub37.anInt10676 = i_10_ * -1047988213;
		class523_sub37.aLong10675 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -9053204302428677845L;
		aClass708_10591.method14236(class523_sub37, -1700038453);
	}

	void method16214(Component component, byte i) {
		method16210(-1763692090);
		aComponent10596 = component;
		aComponent10596.addKeyListener(this);
		aComponent10596.addFocusListener(this);
	}

	public synchronized void method9132() {
		aClass708_10595.method14235((byte) -10);
		for (Class523_Sub37 class523_sub37 = (Class523_Sub37) aClass708_10591.method14293(1953145355); null != class523_sub37; class523_sub37 = (Class523_Sub37) aClass708_10591.method14293(2068895852)) {
			class523_sub37.anInt10672 = method16215(344258042) * 469504401;
			if (0 == class523_sub37.anInt10673 * 715124767) {
				if (!aBoolArray10594[class523_sub37.anInt10676 * -693382237]) {
					Class523_Sub37 class523_sub37_12_ = new Class523_Sub37();
					class523_sub37_12_.anInt10673 = 0;
					class523_sub37_12_.aChar10671 = '\uffff';
					class523_sub37_12_.anInt10676 = 1 * class523_sub37.anInt10676;
					class523_sub37_12_.aLong10675 = class523_sub37.aLong10675 * 1L;
					class523_sub37_12_.anInt10672 = class523_sub37.anInt10672 * 1;
					aClass708_10595.method14236(class523_sub37_12_, 635660065);
					aBoolArray10594[-693382237 * class523_sub37.anInt10676] = true;
				}
				class523_sub37.anInt10673 = 1445402558;
				aClass708_10595.method14236(class523_sub37, -562788568);
			} else if (1 == class523_sub37.anInt10673 * 715124767) {
				if (aBoolArray10594[class523_sub37.anInt10676 * -693382237]) {
					aClass708_10595.method14236(class523_sub37, -219333737);
					aBoolArray10594[-693382237 * class523_sub37.anInt10676] = false;
				}
			} else if (class523_sub37.anInt10673 * 715124767 == -1) {
				for (int i = 0; i < 112; i++) {
					if (aBoolArray10594[i]) {
						Class523_Sub37 class523_sub37_13_ = new Class523_Sub37();
						class523_sub37_13_.anInt10673 = 722701279;
						class523_sub37_13_.aChar10671 = '\uffff';
						class523_sub37_13_.anInt10676 = -1047988213 * i;
						class523_sub37_13_.aLong10675 = 1L * class523_sub37.aLong10675;
						class523_sub37_13_.anInt10672 = class523_sub37.anInt10672 * 1;
						aClass708_10595.method14236(class523_sub37_13_, -1757906848);
						aBoolArray10594[i] = false;
					}
				}
			} else if (class523_sub37.anInt10673 * 715124767 == 3)
				aClass708_10595.method14236(class523_sub37, 148308619);
		}
	}

	int method16215(int i) {
		int i_14_ = 0;
		if (aBoolArray10594[81])
			i_14_ |= 0x1;
		if (aBoolArray10594[82])
			i_14_ |= 0x4;
		if (aBoolArray10594[86])
			i_14_ |= 0x2;
		return i_14_;
	}

	public synchronized void method9140() {
		aClass708_10595.method14235((byte) 54);
		for (Class523_Sub37 class523_sub37 = (Class523_Sub37) aClass708_10591.method14293(2073742647); null != class523_sub37; class523_sub37 = (Class523_Sub37) aClass708_10591.method14293(2060452802)) {
			class523_sub37.anInt10672 = method16215(284745382) * 469504401;
			if (0 == class523_sub37.anInt10673 * 715124767) {
				if (!aBoolArray10594[class523_sub37.anInt10676 * -693382237]) {
					Class523_Sub37 class523_sub37_15_ = new Class523_Sub37();
					class523_sub37_15_.anInt10673 = 0;
					class523_sub37_15_.aChar10671 = '\uffff';
					class523_sub37_15_.anInt10676 = 1 * class523_sub37.anInt10676;
					class523_sub37_15_.aLong10675 = class523_sub37.aLong10675 * 1L;
					class523_sub37_15_.anInt10672 = class523_sub37.anInt10672 * 1;
					aClass708_10595.method14236(class523_sub37_15_, -1149858302);
					aBoolArray10594[-693382237 * class523_sub37.anInt10676] = true;
				}
				class523_sub37.anInt10673 = 1445402558;
				aClass708_10595.method14236(class523_sub37, -512680665);
			} else if (1 == class523_sub37.anInt10673 * 715124767) {
				if (aBoolArray10594[class523_sub37.anInt10676 * -693382237]) {
					aClass708_10595.method14236(class523_sub37, -987168450);
					aBoolArray10594[-693382237 * class523_sub37.anInt10676] = false;
				}
			} else if (class523_sub37.anInt10673 * 715124767 == -1) {
				for (int i = 0; i < 112; i++) {
					if (aBoolArray10594[i]) {
						Class523_Sub37 class523_sub37_16_ = new Class523_Sub37();
						class523_sub37_16_.anInt10673 = 722701279;
						class523_sub37_16_.aChar10671 = '\uffff';
						class523_sub37_16_.anInt10676 = -1047988213 * i;
						class523_sub37_16_.aLong10675 = 1L * class523_sub37.aLong10675;
						class523_sub37_16_.anInt10672 = class523_sub37.anInt10672 * 1;
						aClass708_10595.method14236(class523_sub37_16_, -1177239625);
						aBoolArray10594[i] = false;
					}
				}
			} else if (class523_sub37.anInt10673 * 715124767 == 3)
				aClass708_10595.method14236(class523_sub37, -1976365691);
		}
	}

	public synchronized void method16216(KeyEvent keyevent) {
		method16201(keyevent, 1, (byte) 86);
	}

	int method16217() {
		int i = 0;
		if (aBoolArray10594[81])
			i |= 0x1;
		if (aBoolArray10594[82])
			i |= 0x4;
		if (aBoolArray10594[86])
			i |= 0x2;
		return i;
	}

	public void method9141() {
		method16210(-888678040);
	}

	public void method9139() {
		method16210(948066216);
	}

	public synchronized void keyTyped(KeyEvent keyevent) {
		char c = keyevent.getKeyChar();
		if (c != '\uffff' && Class145.method2382(c, (byte) 11)) {
			method16213(3, c, -1, 419684);
			keyevent.consume();
		}
	}

	void method16218(KeyEvent keyevent, int i) {
		int i_17_ = keyevent.getKeyCode();
		if (0 != i_17_) {
			if (i_17_ >= 0 && i_17_ < anIntArray10597.length) {
				i_17_ = anIntArray10597[i_17_];
				if (0 == i && (i_17_ & 0x80) != 0)
					i_17_ = 0;
				else
					i_17_ &= ~0x80;
			} else
				i_17_ = 0;
		} else
			i_17_ = 0;
		if (i_17_ != 0) {
			method16213(i, '\uffff', i_17_, 419684);
			keyevent.consume();
		}
	}

	public synchronized void method16219(KeyEvent keyevent) {
		method16201(keyevent, 0, (byte) 118);
	}

	void method16220(int i, char c, int i_18_) {
		Class523_Sub37 class523_sub37 = new Class523_Sub37();
		class523_sub37.anInt10673 = i * 722701279;
		class523_sub37.aChar10671 = c;
		class523_sub37.anInt10676 = i_18_ * -1047988213;
		class523_sub37.aLong10675 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -9053204302428677845L;
		aClass708_10591.method14236(class523_sub37, -607360478);
	}

	public boolean method9134(int i) {
		if (i < 0 || i >= 112)
			return false;
		return aBoolArray10594[i];
	}

	void method16221(int i, char c, int i_19_) {
		Class523_Sub37 class523_sub37 = new Class523_Sub37();
		class523_sub37.anInt10673 = i * 722701279;
		class523_sub37.aChar10671 = c;
		class523_sub37.anInt10676 = i_19_ * -1047988213;
		class523_sub37.aLong10675 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -9053204302428677845L;
		aClass708_10591.method14236(class523_sub37, 402413716);
	}

	public synchronized void method16222(KeyEvent keyevent) {
		method16201(keyevent, 1, (byte) 63);
	}

	public synchronized void method16223(KeyEvent keyevent) {
		char c = keyevent.getKeyChar();
		if (c != '\uffff' && Class145.method2382(c, (byte) 11)) {
			method16213(3, c, -1, 419684);
			keyevent.consume();
		}
	}

	public synchronized void method16224(KeyEvent keyevent) {
		char c = keyevent.getKeyChar();
		if (c != '\uffff' && Class145.method2382(c, (byte) 11)) {
			method16213(3, c, -1, 419684);
			keyevent.consume();
		}
	}

	public synchronized void method16225(KeyEvent keyevent) {
		char c = keyevent.getKeyChar();
		if (c != '\uffff' && Class145.method2382(c, (byte) 11)) {
			method16213(3, c, -1, 419684);
			keyevent.consume();
		}
	}

	public synchronized void method16226(KeyEvent keyevent) {
		char c = keyevent.getKeyChar();
		if (c != '\uffff' && Class145.method2382(c, (byte) 11)) {
			method16213(3, c, -1, 419684);
			keyevent.consume();
		}
	}

	void method16227() {
		if (aComponent10596 != null) {
			aComponent10596.removeKeyListener(this);
			aComponent10596.removeFocusListener(this);
			aComponent10596 = null;
			for (int i = 0; i < 112; i++)
				aBoolArray10594[i] = false;
			aClass708_10595.method14235((byte) 18);
			aClass708_10591.method14235((byte) -57);
		}
	}
}
