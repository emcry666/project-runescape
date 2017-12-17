/* Class708 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Collection;
import java.util.Iterator;

import com.jagex.twitchtv.TwitchEvent;

public class Class708 implements Iterable, Collection {
	Class523 aClass523_8837;
	public Class523 aClass523_8838 = new Class523();

	public boolean method14234(Object object) {
		throw new RuntimeException();
	}

	public void method14235(byte i) {
		while (aClass523_8838.aClass523_7063 != aClass523_8838)
			aClass523_8838.aClass523_7063.method8661(607052656);
	}

	public void method14236(Class523 class523, int i) {
		if (null != class523.aClass523_7064)
			class523.method8661(607052656);
		class523.aClass523_7064 = aClass523_8838.aClass523_7064;
		class523.aClass523_7063 = aClass523_8838;
		class523.aClass523_7064.aClass523_7063 = class523;
		class523.aClass523_7063.aClass523_7064 = class523;
	}

	public boolean method14237(byte i) {
		return aClass523_8838.aClass523_7063 == aClass523_8838;
	}

	void method14238(Class708 class708_0_, Class523 class523, int i) {
		Class523 class523_1_ = aClass523_8838.aClass523_7064;
		aClass523_8838.aClass523_7064 = class523.aClass523_7064;
		class523.aClass523_7064.aClass523_7063 = aClass523_8838;
		if (class523 != aClass523_8838) {
			class523.aClass523_7064 = class708_0_.aClass523_8838.aClass523_7064;
			class523.aClass523_7064.aClass523_7063 = class523;
			class523_1_.aClass523_7063 = class708_0_.aClass523_8838;
			class708_0_.aClass523_8838.aClass523_7064 = class523_1_;
		}
	}

	public void method14239(Class708 class708_2_, int i) {
		if (aClass523_8838.aClass523_7063 != aClass523_8838)
			method14238(class708_2_, aClass523_8838.aClass523_7063, 1189191398);
	}

	public Class523 method14240(int i) {
		return method14298(null, 102400);
	}

	boolean method14241(Class523 class523) {
		method14236(class523, -285299383);
		return true;
	}

	public Class523 method14242(int i) {
		return method14243(null, 1503858915);
	}

	Class523 method14243(Class523 class523, int i) {
		Class523 class523_3_;
		if (class523 == null)
			class523_3_ = aClass523_8838.aClass523_7064;
		else
			class523_3_ = class523;
		if (class523_3_ == aClass523_8838) {
			aClass523_8837 = null;
			return null;
		}
		aClass523_8837 = class523_3_.aClass523_7064;
		return class523_3_;
	}

	public Class523 method14244(byte i) {
		Class523 class523 = aClass523_8837;
		if (aClass523_8838 == class523) {
			aClass523_8837 = null;
			return null;
		}
		aClass523_8837 = class523.aClass523_7063;
		return class523;
	}

	public Class523 method14245(int i) {
		Class523 class523 = aClass523_8837;
		if (aClass523_8838 == class523) {
			aClass523_8837 = null;
			return null;
		}
		aClass523_8837 = class523.aClass523_7064;
		return class523;
	}

	public int method14246(byte i) {
		int i_4_ = 0;
		for (Class523 class523 = aClass523_8838.aClass523_7063; class523 != aClass523_8838; class523 = class523.aClass523_7063)
			i_4_++;
		return i_4_;
	}

	public Class523 method14247() {
		return method14298(null, 102400);
	}

	public void method14248(Class523 class523) {
		if (null != class523.aClass523_7064)
			class523.method8661(607052656);
		class523.aClass523_7064 = aClass523_8838.aClass523_7064;
		class523.aClass523_7063 = aClass523_8838;
		class523.aClass523_7064.aClass523_7063 = class523;
		class523.aClass523_7063.aClass523_7064 = class523;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public int size() {
		return method14246((byte) 13);
	}

	public boolean isEmpty() {
		return method14237((byte) 104);
	}

	public void method14249() {
		while (aClass523_8838.aClass523_7063 != aClass523_8838)
			aClass523_8838.aClass523_7063.method8661(607052656);
	}

	public Object[] toArray() {
		return method14301((byte) 66);
	}

	public boolean method14250(Collection collection) {
		throw new RuntimeException();
	}

	public boolean method14251() {
		return method14237((byte) 104);
	}

	public boolean remove(Object object) {
		throw new RuntimeException();
	}

	public boolean containsAll(Collection collection) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection collection) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection collection) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection collection) {
		throw new RuntimeException();
	}

	public static void method14252(Class523 class523, Class523 class523_5_) {
		if (null != class523.aClass523_7064)
			class523.method8661(607052656);
		class523.aClass523_7064 = class523_5_.aClass523_7064;
		class523.aClass523_7063 = class523_5_;
		class523.aClass523_7064.aClass523_7063 = class523;
		class523.aClass523_7063.aClass523_7064 = class523;
	}

	public boolean add(Object object) {
		return method14288((Class523) object, -1079430419);
	}

	public boolean equals(Object object) {
		return super.equals(object);
	}

	public boolean method14253() {
		return aClass523_8838.aClass523_7063 == aClass523_8838;
	}

	public boolean method14254(Object object) {
		return super.equals(object);
	}

	public int method14255() {
		return super.hashCode();
	}

	public boolean method14256(Object object) {
		return method14288((Class523) object, -1837320009);
	}

	public Object[] method14257(Object[] objects) {
		int i = 0;
		for (Class523 class523 = aClass523_8838.aClass523_7063; class523 != aClass523_8838; class523 = class523.aClass523_7063)
			objects[i++] = class523;
		return objects;
	}

	public boolean method14258(Object object) {
		throw new RuntimeException();
	}

	public boolean method14259(Object object) {
		throw new RuntimeException();
	}

	public boolean method14260(Object object) {
		throw new RuntimeException();
	}

	public Iterator method14261() {
		return new Class706(this);
	}

	public Object[] method14262() {
		return method14301((byte) 43);
	}

	public boolean method14263(Object object) {
		throw new RuntimeException();
	}

	public void method14264(Class523 class523) {
		if (null != class523.aClass523_7064)
			class523.method8661(607052656);
		class523.aClass523_7064 = aClass523_8838.aClass523_7064;
		class523.aClass523_7063 = aClass523_8838;
		class523.aClass523_7064.aClass523_7063 = class523;
		class523.aClass523_7063.aClass523_7064 = class523;
	}

	public boolean method14265(Collection collection) {
		throw new RuntimeException();
	}

	public void method14266(Class523 class523) {
		if (null != class523.aClass523_7064)
			class523.method8661(607052656);
		class523.aClass523_7064 = aClass523_8838.aClass523_7064;
		class523.aClass523_7063 = aClass523_8838;
		class523.aClass523_7064.aClass523_7063 = class523;
		class523.aClass523_7063.aClass523_7064 = class523;
	}

	public static void method14267(Class523 class523, Class523 class523_6_) {
		if (null != class523.aClass523_7064)
			class523.method8661(607052656);
		class523.aClass523_7064 = class523_6_.aClass523_7064;
		class523.aClass523_7063 = class523_6_;
		class523.aClass523_7064.aClass523_7063 = class523;
		class523.aClass523_7063.aClass523_7064 = class523;
	}

	public static void method14268(Class523 class523, Class523 class523_7_) {
		if (null != class523.aClass523_7064)
			class523.method8661(607052656);
		class523.aClass523_7064 = class523_7_.aClass523_7064;
		class523.aClass523_7063 = class523_7_;
		class523.aClass523_7064.aClass523_7063 = class523;
		class523.aClass523_7063.aClass523_7064 = class523;
	}

	public Class523 method14269() {
		return method14243(null, 1392479015);
	}

	public Class523 method14270() {
		Class523 class523 = aClass523_8838.aClass523_7063;
		if (aClass523_8838 == class523)
			return null;
		class523.method8661(607052656);
		return class523;
	}

	public Object[] method14271() {
		return method14301((byte) 37);
	}

	public void method14272(Class708 class708_8_) {
		if (aClass523_8838.aClass523_7063 != aClass523_8838)
			method14238(class708_8_, aClass523_8838.aClass523_7063, -724463099);
	}

	public Class523 method14273() {
		return method14298(null, 102400);
	}

	public Class523 method14274() {
		return method14298(null, 102400);
	}

	public Iterator iterator() {
		return new Class706(this);
	}

	public Class523 method14275() {
		return method14298(null, 102400);
	}

	Class523 method14276(Class523 class523) {
		Class523 class523_9_;
		if (null == class523)
			class523_9_ = aClass523_8838.aClass523_7063;
		else
			class523_9_ = class523;
		if (class523_9_ == aClass523_8838) {
			aClass523_8837 = null;
			return null;
		}
		aClass523_8837 = class523_9_.aClass523_7063;
		return class523_9_;
	}

	public void method14277() {
		method14235((byte) 37);
	}

	public Class523 method14278() {
		return method14243(null, 1584347500);
	}

	void method14279(Class708 class708_10_, Class523 class523) {
		Class523 class523_11_ = aClass523_8838.aClass523_7064;
		aClass523_8838.aClass523_7064 = class523.aClass523_7064;
		class523.aClass523_7064.aClass523_7063 = aClass523_8838;
		if (class523 != aClass523_8838) {
			class523.aClass523_7064 = class708_10_.aClass523_8838.aClass523_7064;
			class523.aClass523_7064.aClass523_7063 = class523;
			class523_11_.aClass523_7063 = class708_10_.aClass523_8838;
			class708_10_.aClass523_8838.aClass523_7064 = class523_11_;
		}
	}

	public int method14280() {
		return method14246((byte) 13);
	}

	Class523 method14281(Class523 class523) {
		Class523 class523_12_;
		if (class523 == null)
			class523_12_ = aClass523_8838.aClass523_7064;
		else
			class523_12_ = class523;
		if (class523_12_ == aClass523_8838) {
			aClass523_8837 = null;
			return null;
		}
		aClass523_8837 = class523_12_.aClass523_7064;
		return class523_12_;
	}

	Class523 method14282(Class523 class523) {
		Class523 class523_13_;
		if (null == class523)
			class523_13_ = aClass523_8838.aClass523_7063;
		else
			class523_13_ = class523;
		if (class523_13_ == aClass523_8838) {
			aClass523_8837 = null;
			return null;
		}
		aClass523_8837 = class523_13_.aClass523_7063;
		return class523_13_;
	}

	public Class523 method14283() {
		Class523 class523 = aClass523_8837;
		if (aClass523_8838 == class523) {
			aClass523_8837 = null;
			return null;
		}
		aClass523_8837 = class523.aClass523_7064;
		return class523;
	}

	public int method14284() {
		int i = 0;
		for (Class523 class523 = aClass523_8838.aClass523_7063; class523 != aClass523_8838; class523 = class523.aClass523_7063)
			i++;
		return i;
	}

	public Object[] toArray(Object[] objects) {
		int i = 0;
		for (Class523 class523 = aClass523_8838.aClass523_7063; class523 != aClass523_8838; class523 = class523.aClass523_7063)
			objects[i++] = class523;
		return objects;
	}

	Class523[] method14285() {
		Class523[] class523s = new Class523[method14246((byte) 13)];
		int i = 0;
		for (Class523 class523 = aClass523_8838.aClass523_7063; aClass523_8838 != class523; class523 = class523.aClass523_7063)
			class523s[i++] = class523;
		return class523s;
	}

	Class523[] method14286() {
		Class523[] class523s = new Class523[method14246((byte) 13)];
		int i = 0;
		for (Class523 class523 = aClass523_8838.aClass523_7063; aClass523_8838 != class523; class523 = class523.aClass523_7063)
			class523s[i++] = class523;
		return class523s;
	}

	public boolean method14287() {
		return method14237((byte) 104);
	}

	boolean method14288(Class523 class523, int i) {
		method14236(class523, -1846152071);
		return true;
	}

	public Class708() {
		aClass523_8838.aClass523_7063 = aClass523_8838;
		aClass523_8838.aClass523_7064 = aClass523_8838;
	}

	public Class523 method14289() {
		return method14243(null, -1335039223);
	}

	boolean method14290(Class523 class523) {
		method14236(class523, 631867130);
		return true;
	}

	public boolean contains(Object object) {
		throw new RuntimeException();
	}

	boolean method14291(Class523 class523) {
		method14236(class523, 342619218);
		return true;
	}

	public boolean method14292(Object object) {
		throw new RuntimeException();
	}

	public Class523 method14293(int i) {
		Class523 class523 = aClass523_8838.aClass523_7063;
		if (aClass523_8838 == class523)
			return null;
		class523.method8661(607052656);
		return class523;
	}

	Class523 method14294(Class523 class523) {
		Class523 class523_14_;
		if (class523 == null)
			class523_14_ = aClass523_8838.aClass523_7064;
		else
			class523_14_ = class523;
		if (class523_14_ == aClass523_8838) {
			aClass523_8837 = null;
			return null;
		}
		aClass523_8837 = class523_14_.aClass523_7064;
		return class523_14_;
	}

	public boolean method14295(Collection collection) {
		throw new RuntimeException();
	}

	public Object[] method14296(Object[] objects) {
		int i = 0;
		for (Class523 class523 = aClass523_8838.aClass523_7063; class523 != aClass523_8838; class523 = class523.aClass523_7063)
			objects[i++] = class523;
		return objects;
	}

	public boolean method14297(Collection collection) {
		throw new RuntimeException();
	}

	Class523 method14298(Class523 class523, int i) {
		Class523 class523_15_;
		if (null == class523)
			class523_15_ = aClass523_8838.aClass523_7063;
		else
			class523_15_ = class523;
		if (class523_15_ == aClass523_8838) {
			aClass523_8837 = null;
			return null;
		}
		aClass523_8837 = class523_15_.aClass523_7063;
		return class523_15_;
	}

	public boolean method14299(Collection collection) {
		throw new RuntimeException();
	}

	public void method14300() {
		method14235((byte) -55);
	}

	Class523[] method14301(byte i) {
		Class523[] class523s = new Class523[method14246((byte) 13)];
		int i_16_ = 0;
		for (Class523 class523 = aClass523_8838.aClass523_7063; aClass523_8838 != class523; class523 = class523.aClass523_7063)
			class523s[i_16_++] = class523;
		return class523s;
	}

	public boolean method14302(Object object) {
		return method14288((Class523) object, -1184442484);
	}

	public void clear() {
		method14235((byte) -8);
	}

	public boolean method14303(Object object) {
		return method14288((Class523) object, -905750513);
	}

	static final void method14304(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class193.method3642(class250, class242, class669, (byte) 86);
	}

	public static void method14305(Class178 class178, long l) {
		if (963672803 * Class569.anInt7631 != 3 && 0 != 963672803 * Class569.anInt7631) {
			if (963672803 * Class569.anInt7631 == 1) {
				if (null == Class569.aStringArray7634 || 0 == Class569.aStringArray7634.length)
					throw new RuntimeException("");
				int i = 0;
				for (int i_17_ = 0; i_17_ < Class569.aStringArray7634.length; i_17_++) {
					if (Class569.aStringArray7634[i_17_] != null) {
						try {
							i += (Class194_Sub19.aClass532_9953.method8782(Class569.aStringArray7634[i_17_], -2135084480));
						} catch (Exception_Sub5 exception_sub5) {
							Class268.method4905(Class29.aClass29_264, exception_sub5.aString11360, (exception_sub5.anInt11361 * -1715672439), exception_sub5.getCause(), -566598069);
							Class569.anInt7631 = 514052193;
							return;
						}
					} else
						i += 100;
				}
				Class569.anInt7636 = i / Class569.aStringArray7634.length * 1273737365;
				if (100 == 359766717 * Class569.anInt7636) {
					Class569.anInt7631 = Class469.method7612((byte) -123) * 171350731;
					if (Class569.anInt7631 * 963672803 != 2)
						return;
				} else
					return;
			}
			TwitchEvent[] twitchevents = Class323.aTwitchTV3452.Service();
			if (twitchevents != null) {
				for (int i = 0; i < twitchevents.length; i++) {
					TwitchEvent twitchevent = twitchevents[i];
					if (twitchevent != null && Class643.method10539(twitchevent, l)) {
						Class582 class582 = twitchevent.method6618();
						if (null != class582)
							IOException_Sub1.method18560(class582.method82(), twitchevent, 1357652815);
					}
				}
			}
			if (Class323.aTwitchTV3452.IsStreaming() && (l - Class569.aLong7625 * -8224487145473131843L > Class569.aLong7629 * 3793667966349935521L)) {
				Class569.aLong7625 = 5627345227462185109L * l;
				if (class178.method3056())
					Class569.aBool7641 = true;
			}
			if (Class323.aTwitchTV3452.IsStreaming()) {
				if (l - -3422948627883130143L * Class569.aLong7623 < (long) (1889251907 * Class569.anInt7628))
					Class569.anInt7640 = 1656835842;
				else if (l - -1775609124084343541L * Class569.aLong7639 < (long) (Class569.anInt7628 * 1889251907))
					Class569.anInt7640 = -1319065727;
				else
					Class569.anInt7640 = 0;
			} else
				Class569.anInt7640 = 0;
			if ((l - 1967076064403718245L * Class569.aLong7649 > (long) (Class569.anInt7630 * 493745387)) && Class323.aTwitchTV3452.GetWebcamState() == 5) {
				Class323.aTwitchTV3452.RestartWebcamDevice();
				Class569.aLong7649 = l * -3698484276435242643L;
			}
		}
	}

	static final void method14306(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (class669.anIntArray8581[class669.anIntArray8577[1180759405 * class669.anInt8579]]);
	}

	static void method14307(Class565[][][] class565s, int i) {
		for (int i_18_ = 0; i_18_ < class565s.length; i_18_++) {
			Class565[][] class565s_19_ = class565s[i_18_];
			for (int i_20_ = 0; i_20_ < class565s_19_.length; i_20_++) {
				for (int i_21_ = 0; i_21_ < class565s_19_[i_20_].length; i_21_++) {
					Class565 class565 = class565s_19_[i_20_][i_21_];
					if (null != class565) {
						if (class565.aClass647_Sub1_Sub2_7591 instanceof Interface61)
							((Interface61) class565.aClass647_Sub1_Sub2_7591).method391(-2145870668);
						if (class565.aClass647_Sub1_Sub1_7589 instanceof Interface61)
							((Interface61) class565.aClass647_Sub1_Sub1_7589).method391(-2073812884);
						if (class565.aClass647_Sub1_Sub1_7590 instanceof Interface61)
							((Interface61) class565.aClass647_Sub1_Sub1_7590).method391(-2082094426);
						if (class565.aClass647_Sub1_Sub4_7587 instanceof Interface61)
							((Interface61) class565.aClass647_Sub1_Sub4_7587).method391(-2073165144);
						if (class565.aClass647_Sub1_Sub4_7596 instanceof Interface61)
							((Interface61) class565.aClass647_Sub1_Sub4_7596).method391(-2146754491);
						for (Class548 class548 = class565.aClass548_7593; null != class548; class548 = class548.aClass548_7319) {
							Class647_Sub1_Sub3 class647_sub1_sub3 = class548.aClass647_Sub1_Sub3_7318;
							if (class647_sub1_sub3 instanceof Interface61)
								((Interface61) class647_sub1_sub3).method391(-2086285621);
						}
					}
				}
			}
		}
	}
}
