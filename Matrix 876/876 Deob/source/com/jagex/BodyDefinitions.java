/* Class630 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class BodyDefinitions {
	public static final int anInt8230 = 0;
	public static final int anInt8231 = 1;
	static final int anInt8232 = 2;
	public int[] disabledSlots;
	public int anInt8234 = -1934311383;
	public int anInt8235 = 1960814827;
	public int[] anIntArray8236;
	public int[] anIntArray8237;
	public static Class53_Sub15 aClass53_Sub15_8238;

	void method10327(RSBuffer buffer, int i) {
		for (;;) {
			int opcode = buffer.readUnsignedByte(-1110945105);
			if (0 == opcode)
				break;
			if (1 == opcode) {
				int containerSize = buffer.readUnsignedByte(780609824);
				disabledSlots = new int[containerSize];
				for (int index = 0; index < disabledSlots.length; index++) {
					disabledSlots[index] = buffer.readUnsignedByte(-1697747380);
					if (disabledSlots[index] != 0 && 2 != disabledSlots[index]) {
						/* empty */
					}
				}
			} else if (opcode == 3)
				anInt8234 = buffer.readUnsignedByte(1486397209) * 1934311383;
			else if (4 == opcode)
				anInt8235 = buffer.readUnsignedByte(576368636) * -1960814827;
			else if (opcode == 5) {
				anIntArray8236 = new int[buffer.readUnsignedByte(-1272034007)];
				for (int i_3_ = 0; i_3_ < anIntArray8236.length; i_3_++)
					anIntArray8236[i_3_] = buffer.readUnsignedByte(1909964836);
			} else if (opcode == 6) {
				anIntArray8237 = new int[buffer.readUnsignedByte(-556189186)];
				for (int i_4_ = 0; i_4_ < anIntArray8237.length; i_4_++)
					anIntArray8237[i_4_] = buffer.readUnsignedByte(-1955453394);
			}
		}
		if (null == disabledSlots)
			throw new RuntimeException("");
	}

	public BodyDefinitions(Class472 class472) {
		byte[] is = class472.method7721((1325648699 * Class620.aClass620_8068.anInt8073), -387132909);
		method10327(new RSBuffer(is), 1630704460);
	}

	public static int method10328(CharSequence charsequence, CharSequence charsequence_5_, byte i) {
		int i_6_ = charsequence.length();
		int i_7_ = charsequence_5_.length();
		if (i_6_ == 0)
			return i_7_;
		if (i_7_ == 0)
			return i_6_;
		int[] is = new int[1 + i_6_];
		int[] is_8_ = new int[i_6_ + 1];
		for (int i_9_ = 0; i_9_ <= i_6_; i_9_++)
			is[i_9_] = i_9_;
		for (int i_10_ = 1; i_10_ <= i_7_; i_10_++) {
			is_8_[0] = i_10_;
			char c = charsequence_5_.charAt(i_10_ - 1);
			for (int i_11_ = 1; i_11_ <= i_6_; i_11_++)
				is_8_[i_11_] = Math.min(Math.min(1 + is_8_[i_11_ - 1], is[i_11_] + 1), (is[i_11_ - 1] + (charsequence.charAt(i_11_ - 1) == c ? 0 : 1)));
			int[] is_12_ = is;
			is = is_8_;
			is_8_ = is_12_;
		}
		return is[i_6_];
	}

	public static final void method10329(Class167 class167, Class707 class707, Class707 class707_13_, byte i) {
		if (class707.method14184(-1395576962) && class707_13_.method14184(-1181937013)) {
			AnimationDefinitions class205 = class707.aClass205_8825;
			AnimationDefinitions class205_14_ = class707_13_.aClass205_8825;
			class167.method2837(class707.aClass696_8835.aClass523_Sub27_Sub11_8757, 78444041 * class707.aClass696_8835.anInt8758, class707.aClass696_8835.aClass523_Sub27_Sub11_8760, class707.aClass696_8835.anInt8756 * -782873069, class707.anInt8834 * 2129671813, class205.anIntArray2225[1649052261 * class707.anInt8829], class707_13_.aClass696_8835.aClass523_Sub27_Sub11_8757, 78444041 * class707_13_.aClass696_8835.anInt8758, class707_13_.aClass696_8835.aClass523_Sub27_Sub11_8760, class707_13_.aClass696_8835.anInt8756 * -782873069, class707_13_.anInt8834 * 2129671813, (class205_14_.anIntArray2225[1649052261 * class707_13_.anInt8829]), (null != class205.aClass187_2221 ? class205.aClass187_2221.aBoolArray2132 : null), class205.aBool2232 | class205_14_.aBool2232);
		}
	}

	static String method10330(Class523_Sub27_Sub8 class523_sub27_sub8, short i) {
		return new StringBuilder().append(class523_sub27_sub8.aString11720).append(Class495.method8101(16777215, 694373030)).append(" >").toString();
	}

	public static void method10331(int i, int i_15_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(8, (long) i);
		class523_sub27_sub7.method17962((byte) 1);
	}
}
