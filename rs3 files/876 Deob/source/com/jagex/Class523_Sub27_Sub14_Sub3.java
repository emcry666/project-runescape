/* Class523_Sub27_Sub14_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Class523_Sub27_Sub14_Sub3 extends Class523_Sub27_Sub14 {
	static Class148[] aClass148Array12157;
	int anInt12158;
	Future aFuture12159;

	void method18615(Future future) {
		aFuture12159 = future;
	}

	byte[] method18153() {
		do {
			if (aFuture12159.isDone()) {
				byte[] is;
				try {
					is = ((Class457) aFuture12159.get()).method7440((byte) 1);
				} catch (InterruptedException interruptedexception) {
					interruptedexception.printStackTrace();
					break;
				} catch (ExecutionException executionexception) {
					executionexception.printStackTrace();
					break;
				}
				return is;
			}
		} while (false);
		return null;
	}

	byte[] method18148(int i) {
		do {
			if (aFuture12159.isDone()) {
				byte[] is;
				try {
					is = ((Class457) aFuture12159.get()).method7440((byte) 1);
				} catch (InterruptedException interruptedexception) {
					interruptedexception.printStackTrace();
					break;
				} catch (ExecutionException executionexception) {
					executionexception.printStackTrace();
					break;
				}
				return is;
			}
		} while (false);
		return null;
	}

	int method18156(byte i) {
		if (aFuture12159 == null)
			return 0;
		return aFuture12159.isDone() ? 100 : 0;
	}

	byte[] method18152() {
		do {
			if (aFuture12159.isDone()) {
				byte[] is;
				try {
					is = ((Class457) aFuture12159.get()).method7440((byte) 1);
				} catch (InterruptedException interruptedexception) {
					interruptedexception.printStackTrace();
					break;
				} catch (ExecutionException executionexception) {
					executionexception.printStackTrace();
					break;
				}
				return is;
			}
		} while (false);
		return null;
	}

	byte[] method18150() {
		do {
			if (aFuture12159.isDone()) {
				byte[] is;
				try {
					is = ((Class457) aFuture12159.get()).method7440((byte) 1);
				} catch (InterruptedException interruptedexception) {
					interruptedexception.printStackTrace();
					break;
				} catch (ExecutionException executionexception) {
					executionexception.printStackTrace();
					break;
				}
				return is;
			}
		} while (false);
		return null;
	}

	void method18616(Future future, int i) {
		aFuture12159 = future;
	}

	byte[] method18149() {
		do {
			if (aFuture12159.isDone()) {
				byte[] is;
				try {
					is = ((Class457) aFuture12159.get()).method7440((byte) 1);
				} catch (InterruptedException interruptedexception) {
					interruptedexception.printStackTrace();
					break;
				} catch (ExecutionException executionexception) {
					executionexception.printStackTrace();
					break;
				}
				return is;
			}
		} while (false);
		return null;
	}

	Class523_Sub27_Sub14_Sub3(int i) {
		anInt12158 = 605391055 * i;
	}

	int method18154() {
		if (aFuture12159 == null)
			return 0;
		return aFuture12159.isDone() ? 100 : 0;
	}

	void method18617(Future future) {
		aFuture12159 = future;
	}

	int method18147() {
		if (aFuture12159 == null)
			return 0;
		return aFuture12159.isDone() ? 100 : 0;
	}

	int method18155() {
		if (aFuture12159 == null)
			return 0;
		return aFuture12159.isDone() ? 100 : 0;
	}

	byte[] method18151() {
		do {
			if (aFuture12159.isDone()) {
				byte[] is;
				try {
					is = ((Class457) aFuture12159.get()).method7440((byte) 1);
				} catch (InterruptedException interruptedexception) {
					interruptedexception.printStackTrace();
					break;
				} catch (ExecutionException executionexception) {
					executionexception.printStackTrace();
					break;
				}
				return is;
			}
		} while (false);
		return null;
	}

	void method18618(Future future) {
		aFuture12159 = future;
	}
}
