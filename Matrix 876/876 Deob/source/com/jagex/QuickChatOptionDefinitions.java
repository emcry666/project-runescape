/* Class523_Sub27_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class QuickChatOptionDefinitions extends Class523_Sub27 {
	Class24 aClass24_11838;
	String[] aStringArray11839;
	int[] staticData;
	int[][] dynamicDataTypes;
	public boolean searchable = true;
	public int[] quickReplyOptions;

	public String method18244() {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (aStringArray11839 == null)
			return "";
		stringbuilder.append(aStringArray11839[0]);
		for (int i = 1; i < aStringArray11839.length; i++) {
			for (int i_0_ = 0; i_0_ < 3; i_0_++)
				stringbuilder.append('.');
			stringbuilder.append(aStringArray11839[i]);
		}
		return stringbuilder.toString();
	}

	void decode(RSBuffer buffer, int opcode, byte i_1_) {
		if (1 == opcode)
			aStringArray11839 = Class194_Sub13.method15512(buffer.readString(599504757), '<', (byte) -23);
		else if (2 == opcode) {
			int length = buffer.readUnsignedByte(1128153505);
			quickReplyOptions = new int[length];
			for (int index = 0; index < length; index++)
				quickReplyOptions[index] = buffer.readUnsignedShort(-2141308250);
		} else if (3 == opcode) {
			int count = buffer.readUnsignedByte(1515815961);
			staticData = new int[count];
			dynamicDataTypes = new int[count][];
			for (int index = 0; index < count; index++) {
				int id = buffer.readUnsignedShort(-1876143958);
				QuickChatStringType type = Class471.getQuickChatType(id, -1079039757);
				if (type != null) {
					staticData[index] = id;
					dynamicDataTypes[index] = new int[type.dataCount * 868797487];
					for (int i_7_ = 0; i_7_ < 868797487 * type.dataCount; i_7_++)
						dynamicDataTypes[index][i_7_] = buffer.readUnsignedShort(-1560037237);
				}
			}
		} else if (4 == opcode)
			searchable = false;
	}

	public int method18246(int i, int i_8_, byte i_9_) {
		if (staticData == null || i < 0 || i > staticData.length)
			return -1;
		if (dynamicDataTypes[i] == null || i_8_ < 0 || i_8_ > dynamicDataTypes[i].length)
			return -1;
		return dynamicDataTypes[i][i_8_];
	}

	public int method18247() {
		if (null == staticData)
			return 0;
		return staticData.length;
	}

	public String method18248(RSBuffer class523_sub34, int i) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (staticData != null) {
			for (int i_10_ = 0; i_10_ < staticData.length; i_10_++) {
				stringbuilder.append(aStringArray11839[i_10_]);
				stringbuilder.append(aClass24_11838.method837(method18266(i_10_, (short) -3228), dynamicDataTypes[i_10_], class523_sub34.method16267((Class471.getQuickChatType(staticData[i_10_], -2094588323).serverToClientBytes) * 335133729, 1925965260)));
			}
		}
		stringbuilder.append(aStringArray11839[aStringArray11839.length - 1]);
		return stringbuilder.toString();
	}

	public String method18249(int i) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (aStringArray11839 == null)
			return "";
		stringbuilder.append(aStringArray11839[0]);
		for (int i_11_ = 1; i_11_ < aStringArray11839.length; i_11_++) {
			for (int i_12_ = 0; i_12_ < 3; i_12_++)
				stringbuilder.append('.');
			stringbuilder.append(aStringArray11839[i_11_]);
		}
		return stringbuilder.toString();
	}

	public int method18250(short i) {
		if (null == staticData)
			return 0;
		return staticData.length;
	}

	public void method18252(RSBuffer class523_sub34, int[] is, byte i) {
		if (staticData != null) {
			for (int i_19_ = 0; i_19_ < staticData.length && i_19_ < is.length; i_19_++) {
				int i_20_ = (method18266(i_19_, (short) -14725).clientToServerBytes * 1611468749);
				if (i_20_ > 0)
					class523_sub34.method16269((long) is[i_19_], i_20_, (byte) -23);
			}
		}
	}

	public String method18253() {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (aStringArray11839 == null)
			return "";
		stringbuilder.append(aStringArray11839[0]);
		for (int i = 1; i < aStringArray11839.length; i++) {
			for (int i_21_ = 0; i_21_ < 3; i_21_++)
				stringbuilder.append('.');
			stringbuilder.append(aStringArray11839[i]);
		}
		return stringbuilder.toString();
	}

	void method18255(int i) {
		if (quickReplyOptions != null) {
			for (int i_28_ = 0; i_28_ < quickReplyOptions.length; i_28_++)
				quickReplyOptions[i_28_] |= 0x8000;
		}
	}

	public QuickChatStringType method18256(int i) {
		if (null == staticData || i < 0 || i > staticData.length)
			return null;
		return Class471.getQuickChatType(staticData[i], -1864679191);
	}

	public void method18257(RSBuffer class523_sub34, int[] is) {
		if (staticData != null) {
			for (int i = 0; i < staticData.length && i < is.length; i++) {
				int i_29_ = method18266(i, (short) 15207).clientToServerBytes * 1611468749;
				if (i_29_ > 0)
					class523_sub34.method16269((long) is[i], i_29_, (byte) -93);
			}
		}
	}

	public String method18258(RSBuffer class523_sub34) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (staticData != null) {
			for (int i = 0; i < staticData.length; i++) {
				stringbuilder.append(aStringArray11839[i]);
				stringbuilder.append(aClass24_11838.method837(method18266(i, (short) -6929), dynamicDataTypes[i], class523_sub34.method16267((Class471.getQuickChatType(staticData[i], -1593604464).serverToClientBytes) * 335133729, 1925965260)));
			}
		}
		stringbuilder.append(aStringArray11839[aStringArray11839.length - 1]);
		return stringbuilder.toString();
	}

	public String method18259(RSBuffer class523_sub34) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (staticData != null) {
			for (int i = 0; i < staticData.length; i++) {
				stringbuilder.append(aStringArray11839[i]);
				stringbuilder.append(aClass24_11838.method837(method18266(i, (short) -4987), dynamicDataTypes[i], class523_sub34.method16267((Class471.getQuickChatType(staticData[i], -1934111365).serverToClientBytes) * 335133729, 1925965260)));
			}
		}
		stringbuilder.append(aStringArray11839[aStringArray11839.length - 1]);
		return stringbuilder.toString();
	}

	public String method18260(RSBuffer class523_sub34) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (staticData != null) {
			for (int i = 0; i < staticData.length; i++) {
				stringbuilder.append(aStringArray11839[i]);
				stringbuilder.append(aClass24_11838.method837(method18266(i, (short) -4045), dynamicDataTypes[i], class523_sub34.method16267((Class471.getQuickChatType(staticData[i], -1681809521).serverToClientBytes) * 335133729, 1925965260)));
			}
		}
		stringbuilder.append(aStringArray11839[aStringArray11839.length - 1]);
		return stringbuilder.toString();
	}

	public int method18261() {
		if (null == staticData)
			return 0;
		return staticData.length;
	}

	public int method18262() {
		if (null == staticData)
			return 0;
		return staticData.length;
	}

	public String method18263() {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (aStringArray11839 == null)
			return "";
		stringbuilder.append(aStringArray11839[0]);
		for (int i = 1; i < aStringArray11839.length; i++) {
			for (int i_30_ = 0; i_30_ < 3; i_30_++)
				stringbuilder.append('.');
			stringbuilder.append(aStringArray11839[i]);
		}
		return stringbuilder.toString();
	}

	public int method18264() {
		if (null == staticData)
			return 0;
		return staticData.length;
	}

	void readValues(RSBuffer buffer, int i) {
		for (;;) {
			int opcode = buffer.readUnsignedByte(-412849120);
			if (0 == opcode)
				break;
			decode(buffer, opcode, (byte) 45);
		}
	}

	public QuickChatStringType method18266(int i, short i_32_) {
		if (null == staticData || i < 0 || i > staticData.length)
			return null;
		return Class471.getQuickChatType(staticData[i], -1070596303);
	}

	public int method18267() {
		if (null == staticData)
			return 0;
		return staticData.length;
	}

	QuickChatOptionDefinitions() {
		/* empty */
	}

	public QuickChatStringType method18268(int i) {
		if (null == staticData || i < 0 || i > staticData.length)
			return null;
		return Class471.getQuickChatType(staticData[i], -1319546836);
	}

	public int method18270(int i, int i_39_) {
		if (staticData == null || i < 0 || i > staticData.length)
			return -1;
		if (dynamicDataTypes[i] == null || i_39_ < 0 || i_39_ > dynamicDataTypes[i].length)
			return -1;
		return dynamicDataTypes[i][i_39_];
	}

	public int method18271(int i, int i_40_) {
		if (staticData == null || i < 0 || i > staticData.length)
			return -1;
		if (dynamicDataTypes[i] == null || i_40_ < 0 || i_40_ > dynamicDataTypes[i].length)
			return -1;
		return dynamicDataTypes[i][i_40_];
	}

	void method18272() {
		if (quickReplyOptions != null) {
			for (int i = 0; i < quickReplyOptions.length; i++)
				quickReplyOptions[i] |= 0x8000;
		}
	}
}
