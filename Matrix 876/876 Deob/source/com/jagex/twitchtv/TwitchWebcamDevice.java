/* TwitchWebcamDevice - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import java.util.LinkedList;

public class TwitchWebcamDevice {
	public String aString1134;
	public String aString1135;
	public int anInt1136;
	public int anInt1137;
	private LinkedList aLinkedList1138 = new LinkedList();

	public TwitchWebcamDevice(int i, int i_0_, String string, String string_1_) {
		anInt1136 = i * -1399492941;
		anInt1137 = i_0_ * 516891721;
		aString1134 = string;
		aString1135 = string_1_;
	}

	public void AddCapability(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		aLinkedList1138.add(new TwitchWebcamDeviceCapability(i, i_2_, i_3_, i_4_, i_5_));
	}

	public TwitchWebcamDeviceCapability method1687(int i) {
		if (i < 0 || i >= aLinkedList1138.size())
			return null;
		return (TwitchWebcamDeviceCapability) aLinkedList1138.get(i);
	}

	public TwitchWebcamDeviceCapability method1688(int i) {
		for (int i_6_ = 0; i_6_ < aLinkedList1138.size(); i_6_++) {
			if ((((TwitchWebcamDeviceCapability) aLinkedList1138.get(i_6_)).anInt1146) * 2027935125 == i)
				return ((TwitchWebcamDeviceCapability) aLinkedList1138.get(i_6_));
		}
		return null;
	}

	public int method1689() {
		return aLinkedList1138.size();
	}

	public TwitchWebcamDeviceCapability method1690(int i) {
		if (i < 0 || i >= aLinkedList1138.size())
			return null;
		return (TwitchWebcamDeviceCapability) aLinkedList1138.get(i);
	}

	public TwitchWebcamDeviceCapability method1691(int i) {
		if (i < 0 || i >= aLinkedList1138.size())
			return null;
		return (TwitchWebcamDeviceCapability) aLinkedList1138.get(i);
	}

	public TwitchWebcamDeviceCapability method1692(int i) {
		if (i < 0 || i >= aLinkedList1138.size())
			return null;
		return (TwitchWebcamDeviceCapability) aLinkedList1138.get(i);
	}

	public TwitchWebcamDeviceCapability method1693(int i) {
		for (int i_7_ = 0; i_7_ < aLinkedList1138.size(); i_7_++) {
			if ((((TwitchWebcamDeviceCapability) aLinkedList1138.get(i_7_)).anInt1146) * 2027935125 == i)
				return ((TwitchWebcamDeviceCapability) aLinkedList1138.get(i_7_));
		}
		return null;
	}

	public TwitchWebcamDeviceCapability method1694(int i) {
		for (int i_8_ = 0; i_8_ < aLinkedList1138.size(); i_8_++) {
			if ((((TwitchWebcamDeviceCapability) aLinkedList1138.get(i_8_)).anInt1146) * 2027935125 == i)
				return ((TwitchWebcamDeviceCapability) aLinkedList1138.get(i_8_));
		}
		return null;
	}

	public int method1695() {
		return aLinkedList1138.size();
	}

	public int method1696() {
		return aLinkedList1138.size();
	}
}
