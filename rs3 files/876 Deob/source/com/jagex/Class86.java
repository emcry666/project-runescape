/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Class86 {
	Map aMap878;
	BaseVarType aClass474_879;
	public static byte friendsChatKickRequirement;
	public static RSSocket aClass1_881;

	public List method1599(Object object) {
		return (List) aMap878.get(object);
	}

	public Class86(Class472 class472, int i, int i_0_) {
		byte[] is = class472.method7688(i, i_0_, -1416954604);
		method1601(new RSBuffer(is), 1235970069);
	}

	public List method1600(Object object, int i) {
		return (List) aMap878.get(object);
	}

	void method1601(RSBuffer class523_sub34, int i) {
		aClass474_879 = ((BaseVarType) Class334.method5910(BaseVarType.method7746(1183088731), class523_sub34.readUnsignedByte(1056479536), 1856447186));
		int i_1_ = class523_sub34.method16306((byte) 0);
		aMap878 = new HashMap(i_1_);
		while (i_1_-- > 0) {
			Object object = aClass474_879.method7749(class523_sub34, 1875160567);
			int i_2_ = class523_sub34.method16306((byte) 0);
			LinkedList linkedlist = new LinkedList();
			while (i_2_-- > 0) {
				int i_3_ = class523_sub34.method16306((byte) 0);
				linkedlist.add(Integer.valueOf(i_3_));
			}
			aMap878.put(object, linkedlist);
		}
	}

	public List method1602(Object object) {
		return (List) aMap878.get(object);
	}

	public List method1603(Object object) {
		return (List) aMap878.get(object);
	}
}
