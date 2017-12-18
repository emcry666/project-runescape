/* Class606 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.LinkedList;

public class Class606 implements Interface75 {
	static Class606 aClass606_7956;
	static Class606 aClass606_7957 = new Class606(0);
	static Class606 aClass606_7958;
	static Class606 aClass606_7959;
	static Class606 aClass606_7960;
	static Class606 aClass606_7961;
	int anInt7962;

	public int method82() {
		return anInt7962 * -362084515;
	}

	public int method6() {
		return anInt7962 * -362084515;
	}

	static {
		aClass606_7956 = new Class606(1);
		aClass606_7958 = new Class606(2);
		aClass606_7959 = new Class606(3);
		aClass606_7960 = new Class606(4);
		aClass606_7961 = new Class606(5);
	}

	public static Class606[] method9963() {
		return (new Class606[] { aClass606_7959, aClass606_7956, aClass606_7960, aClass606_7958, aClass606_7957, aClass606_7961 });
	}

	public int method101() {
		return anInt7962 * -362084515;
	}

	Class606(int i) {
		anInt7962 = -1199667979 * i;
	}

	public static Class606[] method9964() {
		return (new Class606[] { aClass606_7959, aClass606_7956, aClass606_7960, aClass606_7958, aClass606_7957, aClass606_7961 });
	}

	public static Class606[] method9965() {
		return (new Class606[] { aClass606_7959, aClass606_7956, aClass606_7960, aClass606_7958, aClass606_7957, aClass606_7961 });
	}

	public static Class606[] method9966() {
		return (new Class606[] { aClass606_7959, aClass606_7956, aClass606_7960, aClass606_7958, aClass606_7957, aClass606_7961 });
	}

	static Class523_Sub27_Sub19 method9967(Class572 class572, int i, int i_0_, int i_1_) {
		int i_2_ = -313548161 * class572.anInt7672 | i << 10;
		Class523_Sub27_Sub19 class523_sub27_sub19 = ((Class523_Sub27_Sub19) Class659.aClass207_8504.method3739((long) i_2_ << 16));
		if (class523_sub27_sub19 != null)
			return class523_sub27_sub19;
		byte[] is = (Class515.aClass472_7045.method7721(Class515.aClass472_7045.method7664(i_2_, -298110208), -387132909));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class523_sub27_sub19 = Class644.method10550(is, (byte) 3);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_2_).toString());
			}
			class523_sub27_sub19.aClass572_11850 = class572;
			Class659.aClass207_8504.method3741(class523_sub27_sub19, (long) i_2_ << 16);
			return class523_sub27_sub19;
		}
		i_2_ = -313548161 * class572.anInt7672 | i_0_ + 65536 << 10;
		class523_sub27_sub19 = ((Class523_Sub27_Sub19) Class659.aClass207_8504.method3739((long) i_2_ << 16));
		if (null != class523_sub27_sub19)
			return class523_sub27_sub19;
		is = (Class515.aClass472_7045.method7721(Class515.aClass472_7045.method7664(i_2_, -1462130436), -387132909));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class523_sub27_sub19 = Class644.method10550(is, (byte) 3);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_2_).toString());
			}
			class523_sub27_sub19.aClass572_11850 = class572;
			Class659.aClass207_8504.method3741(class523_sub27_sub19, (long) i_2_ << 16);
			return class523_sub27_sub19;
		}
		i_2_ = -313548161 * class572.anInt7672 | 0x3fffc00;
		class523_sub27_sub19 = ((Class523_Sub27_Sub19) Class659.aClass207_8504.method3739((long) i_2_ << 16));
		if (null != class523_sub27_sub19)
			return class523_sub27_sub19;
		is = (Class515.aClass472_7045.method7721(Class515.aClass472_7045.method7664(i_2_, -1987696389), -387132909));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class523_sub27_sub19 = Class644.method10550(is, (byte) 3);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_2_).toString());
			}
			class523_sub27_sub19.aClass572_11850 = class572;
			Class659.aClass207_8504.method3741(class523_sub27_sub19, (long) i_2_ << 16);
			return class523_sub27_sub19;
		}
		return null;
	}

	static final void method9968(Class250 class250, Class242 class242, Class669 class669, byte i) {
		class250.anInt2570 = -365376206;
		class250.aClass302_2553 = null;
		class250.anInt2571 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) * 903474739;
		if (-1 == 234012635 * class250.anInt2709 && !class242.aBool2456)
			Class328_Sub3_Sub1.method17886(class250.anInt2585 * -1363815505, 1648921847);
	}

	public static void method9969(Class178 class178, long l, int i, int i_3_, int i_4_) {
		do {
			if (class178.method3309() && class178.method3059() > -1) {
				int i_5_ = class178.method3059();
				Class587 class587 = null;
				if (!Class569.aLinkedList7646.isEmpty())
					class587 = (Class587) Class569.aLinkedList7646.getFirst();
				if (null == class587 || i_5_ != -1839458529 * class587.anInt7744) {
					class178.method3060();
					Class569.aLinkedList7646.clear();
				} else {
					Class569.aLinkedList7646.removeFirst();
					class178.method3186();
					boolean bool = false;
					int i_6_;
					if (class587.aLinkedList7745.isEmpty() && class178.method3057()) {
						long l_7_ = class178.method3324((Class57.anInt746 * 1568728259), (-24538641 * Class322.anInt3445));
						i_6_ = (Class323.aTwitchTV3452.SubmitFrame(l_7_, class178.method3058(), Class569.aBool7638, i, i_3_));
						class178.method3063(l_7_);
					} else {
						class178.method3130(Class57.anInt746 * 1568728259, Class322.anInt3445 * -24538641, Class3.anIntArray33, Class569.anIntArray7644);
						Class559.method9246(Class3.anIntArray33, class587.aLinkedList7745, class587.anInt7747 * 61394403, 215874015 * class587.anInt7743, class587.aFloat7746, (byte) -109);
						i_6_ = (Class323.aTwitchTV3452.SubmitFrameRaw(Class3.anIntArray33, Class569.aBool7638, i, i_3_));
					}
					class178.method3108();
					if (i_6_ == 2072)
						Class569.aLong7623 = 4921181089270546721L * l;
					else if (23 == i_6_)
						Class569.aLong7639 = l * -6939533996358416733L;
					else if (-995 == i_6_ || 0 != i_6_)
						break;
				}
			}
		} while (false);
		if (Class569.aBool7641) {
			if (Class3.anIntArray33 == null) {
				Class3.anIntArray33 = new int[(Class569.aBool7638 ? i_3_ * i : (Class57.anInt746 * 1568728259 * (Class322.anInt3445 * -24538641)))];
				Class569.anIntArray7644 = new int[(Class569.aBool7638 ? i * i_3_ : (Class322.anInt3445 * -24538641 * (1568728259 * Class57.anInt746)))];
			}
			if (!class178.method3309()) {
				class178.method3186();
				class178.method3130(1568728259 * Class57.anInt746, Class322.anInt3445 * -24538641, Class3.anIntArray33, Class569.anIntArray7644);
				Class559.method9246(Class3.anIntArray33, Class569.aLinkedList7645, 1970564341 * class178.anInt1945, class178.anInt1937 * 1216763507, class178.aFloat1948, (byte) -120);
				int i_8_ = Class323.aTwitchTV3452.SubmitFrameRaw((Class3.anIntArray33), Class569.aBool7638, i, i_3_);
				class178.method3108();
				Class569.aLinkedList7645.clear();
				do {
					if (2072 == i_8_)
						Class569.aLong7623 = 4921181089270546721L * l;
					else if (i_8_ == 23)
						Class569.aLong7639 = -6939533996358416733L * l;
					else if (-995 == i_8_ || i_8_ != 0)
						break;
				} while (false);
			} else {
				class178.method3061(client.anInt11011, Class57.anInt746 * 1568728259, Class322.anInt3445 * -24538641);
				Class569.aLinkedList7646.add(new Class587(client.anInt11011, Class569.aLinkedList7645, 1970564341 * class178.anInt1945, 1216763507 * class178.anInt1937, class178.aFloat1948));
				Class569.aLinkedList7645 = new LinkedList();
			}
			Class569.aBool7641 = false;
		}
	}

	static final void method9970(Class669 class669, int i) {
		class669.anInt8560 -= -1823027158;
		String string = ((String) class669.anObjectArray8559[class669.anInt8560 * 240723773]);
		String string_9_ = ((String) class669.anObjectArray8559[1 + class669.anInt8560 * 240723773]);
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = new StringBuilder().append(string).append(string_9_).toString();
	}
}
