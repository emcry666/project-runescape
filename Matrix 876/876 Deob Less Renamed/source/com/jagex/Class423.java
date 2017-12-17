/* Class423 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Map;

public class Class423 implements Interface4 {
	Map aMap4797;
	Class472 aClass472_4798;
	Class472 aClass472_4799;
	Class209 aClass209_4800;
	Class209 aClass209_4801;
	Class178 aClass178_4802;
	Class209 aClass209_4803 = new Class209(20);
	int[] anIntArray4804;
	public static Class149_Sub1 clientConfigsDomain;

	public int method6684(boolean bool) {
		if (null == anIntArray4804)
			return 0;
		if (!bool && null != aMap4797)
			return 2 * anIntArray4804.length;
		int i = 0;
		for (int i_0_ = 0; i_0_ < anIntArray4804.length; i_0_++) {
			int i_1_ = anIntArray4804[i_0_];
			if (aClass472_4799.method7650(i_1_, 1385473038))
				i++;
			if (aClass472_4798.method7650(i_1_, 553752932))
				i++;
		}
		return i;
	}

	public void method6685(Interface50 interface50, int i) {
		aMap4797 = new HashMap(anIntArray4804.length);
		for (int i_2_ = 0; i_2_ < anIntArray4804.length; i_2_++) {
			int i_3_ = anIntArray4804[i_2_];
			Class10 class10 = Class555.method9193(aClass472_4798, i_3_, this, 1841468729);
			byte[] is = aClass472_4799.method7721(i_3_, -387132909);
			Object object = interface50.method357(is, class10, true, -300563509);
			aMap4797.put(Integer.valueOf(i_2_), new Class5(object, class10));
		}
	}

	public void method6686(byte i) {
		aMap4797 = null;
	}

	public Class10 method6687(Interface50 interface50, int i) {
		return method6692(interface50, i, true, true, (byte) -20);
	}

	public Class10 method6688(Interface50 interface50, int i, byte i_4_) {
		return method6692(interface50, i, true, true, (byte) -83);
	}

	public Object method6689(Interface50 interface50, int i, boolean bool, boolean bool_5_, int i_6_) {
		if (-1 == i)
			return null;
		if (anIntArray4804 != null) {
			for (int i_7_ = 0; i_7_ < anIntArray4804.length; i_7_++) {
				if (i == anIntArray4804[i_7_])
					return (((Class5) aMap4797.get(Integer.valueOf(i_7_))).anObject37);
			}
		}
		Object object = aClass209_4803.method3767((long) (i << 1 | (bool_5_ ? 1 : 0)));
		if (object != null)
			return object;
		byte[] is = aClass472_4799.method7721(i, -387132909);
		if (is == null)
			return null;
		Class10 class10 = method6692(interface50, i, bool, false, (byte) -61);
		if (null == class10)
			return null;
		object = interface50.method357(is, class10, bool_5_, -1482618289);
		aClass209_4803.method3770(object, (long) (i << 1 | (bool_5_ ? 1 : 0)));
		return object;
	}

	public int method6690(int i) {
		if (null == anIntArray4804)
			return 0;
		return anIntArray4804.length * 2;
	}

	public void method6691(byte i) {
		aClass209_4800.method3776(789676329);
		aClass209_4803.method3776(121341185);
		if (aClass209_4801 != null)
			aClass209_4801.method3776(205416426);
	}

	Class10 method6692(Interface50 interface50, int i, boolean bool, boolean bool_8_, byte i_9_) {
		if (i == -1)
			return null;
		if (anIntArray4804 != null) {
			for (int i_10_ = 0; i_10_ < anIntArray4804.length; i_10_++) {
				if (i == anIntArray4804[i_10_])
					return ((Class10) (((Class5) aMap4797.get(Integer.valueOf(i_10_))).anObject36));
			}
		}
		if (bool_8_)
			aClass472_4799.method7650(i, 654195857);
		Class10 class10 = (Class10) aClass209_4800.method3767((long) i);
		if (class10 != null)
			return class10;
		class10 = Class555.method9193(aClass472_4798, i, this, 1512625107);
		if (null == class10)
			return null;
		if (bool)
			aClass209_4800.method3770(class10, (long) i);
		return class10;
	}

	public void method6693(short i) {
		aClass209_4800.method3773(-2007012709);
		aClass209_4803.method3773(-1869325464);
		if (aClass209_4801 != null)
			aClass209_4801.method3773(-1875556146);
	}

	public void method6694(int i, int i_11_) {
		aClass209_4800.method3772(i, (byte) -121);
		aClass209_4803.method3772(i, (byte) -113);
		if (aClass209_4801 != null)
			aClass209_4801.method3772(i, (byte) -120);
	}

	public Class423(Class178 class178, Class472 class472, Class472 class472_12_, int[] is) {
		aClass209_4800 = new Class209(20);
		aClass178_4802 = null;
		aMap4797 = null;
		aClass178_4802 = class178;
		aClass472_4799 = class472;
		aClass472_4798 = class472_12_;
		anIntArray4804 = is;
		aClass209_4801 = new Class209(20);
	}

	public Class148[] method44(Class178 class178, int i, byte i_13_) {
		if (aClass209_4801 == null)
			return null;
		if (class178 != null) {
			if (aClass178_4802 != class178)
				aClass209_4801.method3773(-2055655695);
			aClass178_4802 = class178;
		} else
			class178 = aClass178_4802;
		if (null != class178) {
			Class148[] class148s = (Class148[]) aClass209_4801.method3767((long) i);
			if (null == class148s) {
				Class175[] class175s = Class166.method2672(aClass472_4799, i, 0);
				if (class175s != null && class175s.length > 0) {
					class148s = new Class148[class175s.length];
					for (int i_14_ = 0; i_14_ < class175s.length; i_14_++)
						class148s[i_14_] = class178.method3104(class175s[i_14_], true);
					aClass209_4801.method3770(class148s, (long) i);
				}
			}
			return class148s;
		}
		return null;
	}

	public int method41(int i, int i_15_) {
		Class148[] class148s = method44(aClass178_4802, i, (byte) -5);
		if (class148s != null)
			return class148s[0].method38();
		return 0;
	}

	public void method6695(Interface50 interface50) {
		aMap4797 = new HashMap(anIntArray4804.length);
		for (int i = 0; i < anIntArray4804.length; i++) {
			int i_16_ = anIntArray4804[i];
			Class10 class10 = Class555.method9193(aClass472_4798, i_16_, this, 1468278529);
			byte[] is = aClass472_4799.method7721(i_16_, -387132909);
			Object object = interface50.method357(is, class10, true, 602890489);
			aMap4797.put(Integer.valueOf(i), new Class5(object, class10));
		}
	}

	public void method6696() {
		aMap4797 = null;
	}

	public void method6697(Interface50 interface50) {
		aMap4797 = new HashMap(anIntArray4804.length);
		for (int i = 0; i < anIntArray4804.length; i++) {
			int i_17_ = anIntArray4804[i];
			Class10 class10 = Class555.method9193(aClass472_4798, i_17_, this, 1118251681);
			byte[] is = aClass472_4799.method7721(i_17_, -387132909);
			Object object = interface50.method357(is, class10, true, -1932429892);
			aMap4797.put(Integer.valueOf(i), new Class5(object, class10));
		}
	}

	Class10 method6698(Interface50 interface50, int i, boolean bool, boolean bool_18_) {
		if (i == -1)
			return null;
		if (anIntArray4804 != null) {
			for (int i_19_ = 0; i_19_ < anIntArray4804.length; i_19_++) {
				if (i == anIntArray4804[i_19_])
					return ((Class10) (((Class5) aMap4797.get(Integer.valueOf(i_19_))).anObject36));
			}
		}
		if (bool_18_)
			aClass472_4799.method7650(i, -1697300331);
		Class10 class10 = (Class10) aClass209_4800.method3767((long) i);
		if (class10 != null)
			return class10;
		class10 = Class555.method9193(aClass472_4798, i, this, 1153076366);
		if (null == class10)
			return null;
		if (bool)
			aClass209_4800.method3770(class10, (long) i);
		return class10;
	}

	public int method6699() {
		return method6707(false, 978114243);
	}

	public int method6700() {
		return method6707(false, 1264800791);
	}

	public int method6701() {
		return method6707(false, 1977749482);
	}

	Class10 method6702(Interface50 interface50, int i, boolean bool, boolean bool_20_) {
		if (i == -1)
			return null;
		if (anIntArray4804 != null) {
			for (int i_21_ = 0; i_21_ < anIntArray4804.length; i_21_++) {
				if (i == anIntArray4804[i_21_])
					return ((Class10) (((Class5) aMap4797.get(Integer.valueOf(i_21_))).anObject36));
			}
		}
		if (bool_20_)
			aClass472_4799.method7650(i, 782630044);
		Class10 class10 = (Class10) aClass209_4800.method3767((long) i);
		if (class10 != null)
			return class10;
		class10 = Class555.method9193(aClass472_4798, i, this, 1386312846);
		if (null == class10)
			return null;
		if (bool)
			aClass209_4800.method3770(class10, (long) i);
		return class10;
	}

	public Object method6703(Interface50 interface50, int i, boolean bool, boolean bool_22_) {
		if (-1 == i)
			return null;
		if (anIntArray4804 != null) {
			for (int i_23_ = 0; i_23_ < anIntArray4804.length; i_23_++) {
				if (i == anIntArray4804[i_23_])
					return (((Class5) aMap4797.get(Integer.valueOf(i_23_))).anObject37);
			}
		}
		Object object = aClass209_4803.method3767((long) (i << 1 | (bool_22_ ? 1 : 0)));
		if (object != null)
			return object;
		byte[] is = aClass472_4799.method7721(i, -387132909);
		if (is == null)
			return null;
		Class10 class10 = method6692(interface50, i, bool, false, (byte) -128);
		if (null == class10)
			return null;
		object = interface50.method357(is, class10, bool_22_, -1370254982);
		aClass209_4803.method3770(object, (long) (i << 1 | (bool_22_ ? 1 : 0)));
		return object;
	}

	public Object method6704(Interface50 interface50, int i, boolean bool, boolean bool_24_) {
		if (-1 == i)
			return null;
		if (anIntArray4804 != null) {
			for (int i_25_ = 0; i_25_ < anIntArray4804.length; i_25_++) {
				if (i == anIntArray4804[i_25_])
					return (((Class5) aMap4797.get(Integer.valueOf(i_25_))).anObject37);
			}
		}
		Object object = aClass209_4803.method3767((long) (i << 1 | (bool_24_ ? 1 : 0)));
		if (object != null)
			return object;
		byte[] is = aClass472_4799.method7721(i, -387132909);
		if (is == null)
			return null;
		Class10 class10 = method6692(interface50, i, bool, false, (byte) -43);
		if (null == class10)
			return null;
		object = interface50.method357(is, class10, bool_24_, -2062442583);
		aClass209_4803.method3770(object, (long) (i << 1 | (bool_24_ ? 1 : 0)));
		return object;
	}

	public Object method6705(Interface50 interface50, int i, boolean bool, boolean bool_26_) {
		if (-1 == i)
			return null;
		if (anIntArray4804 != null) {
			for (int i_27_ = 0; i_27_ < anIntArray4804.length; i_27_++) {
				if (i == anIntArray4804[i_27_])
					return (((Class5) aMap4797.get(Integer.valueOf(i_27_))).anObject37);
			}
		}
		Object object = aClass209_4803.method3767((long) (i << 1 | (bool_26_ ? 1 : 0)));
		if (object != null)
			return object;
		byte[] is = aClass472_4799.method7721(i, -387132909);
		if (is == null)
			return null;
		Class10 class10 = method6692(interface50, i, bool, false, (byte) -10);
		if (null == class10)
			return null;
		object = interface50.method357(is, class10, bool_26_, -1213185406);
		aClass209_4803.method3770(object, (long) (i << 1 | (bool_26_ ? 1 : 0)));
		return object;
	}

	public Class10 method6706(Interface50 interface50, int i) {
		return method6692(interface50, i, true, true, (byte) -97);
	}

	public int method6707(boolean bool, int i) {
		if (null == anIntArray4804)
			return 0;
		if (!bool && null != aMap4797)
			return 2 * anIntArray4804.length;
		int i_28_ = 0;
		for (int i_29_ = 0; i_29_ < anIntArray4804.length; i_29_++) {
			int i_30_ = anIntArray4804[i_29_];
			if (aClass472_4799.method7650(i_30_, -229291507))
				i_28_++;
			if (aClass472_4798.method7650(i_30_, -1062008063))
				i_28_++;
		}
		return i_28_;
	}

	public void method6708(Interface50 interface50) {
		aMap4797 = new HashMap(anIntArray4804.length);
		for (int i = 0; i < anIntArray4804.length; i++) {
			int i_31_ = anIntArray4804[i];
			Class10 class10 = Class555.method9193(aClass472_4798, i_31_, this, 1379461615);
			byte[] is = aClass472_4799.method7721(i_31_, -387132909);
			Object object = interface50.method357(is, class10, true, 617626064);
			aMap4797.put(Integer.valueOf(i), new Class5(object, class10));
		}
	}

	public void method6709() {
		aClass209_4800.method3776(-243728135);
		aClass209_4803.method3776(-1923024220);
		if (aClass209_4801 != null)
			aClass209_4801.method3776(655926236);
	}

	public void method6710() {
		aClass209_4800.method3773(-2082199404);
		aClass209_4803.method3773(-1844263459);
		if (aClass209_4801 != null)
			aClass209_4801.method3773(-1867824259);
	}

	public void method6711() {
		aClass209_4800.method3773(-1841540159);
		aClass209_4803.method3773(-1923653661);
		if (aClass209_4801 != null)
			aClass209_4801.method3773(-1923229780);
	}

	public void method6712(int i) {
		aClass209_4800.method3772(i, (byte) -115);
		aClass209_4803.method3772(i, (byte) -49);
		if (aClass209_4801 != null)
			aClass209_4801.method3772(i, (byte) -83);
	}

	public Class148[] method45(Class178 class178, int i) {
		if (aClass209_4801 == null)
			return null;
		if (class178 != null) {
			if (aClass178_4802 != class178)
				aClass209_4801.method3773(-1955101336);
			aClass178_4802 = class178;
		} else
			class178 = aClass178_4802;
		if (null != class178) {
			Class148[] class148s = (Class148[]) aClass209_4801.method3767((long) i);
			if (null == class148s) {
				Class175[] class175s = Class166.method2672(aClass472_4799, i, 0);
				if (class175s != null && class175s.length > 0) {
					class148s = new Class148[class175s.length];
					for (int i_32_ = 0; i_32_ < class175s.length; i_32_++)
						class148s[i_32_] = class178.method3104(class175s[i_32_], true);
					aClass209_4801.method3770(class148s, (long) i);
				}
			}
			return class148s;
		}
		return null;
	}

	public Class148[] method43(Class178 class178, int i) {
		if (aClass209_4801 == null)
			return null;
		if (class178 != null) {
			if (aClass178_4802 != class178)
				aClass209_4801.method3773(-2068754756);
			aClass178_4802 = class178;
		} else
			class178 = aClass178_4802;
		if (null != class178) {
			Class148[] class148s = (Class148[]) aClass209_4801.method3767((long) i);
			if (null == class148s) {
				Class175[] class175s = Class166.method2672(aClass472_4799, i, 0);
				if (class175s != null && class175s.length > 0) {
					class148s = new Class148[class175s.length];
					for (int i_33_ = 0; i_33_ < class175s.length; i_33_++)
						class148s[i_33_] = class178.method3104(class175s[i_33_], true);
					aClass209_4801.method3770(class148s, (long) i);
				}
			}
			return class148s;
		}
		return null;
	}

	public int method6713(byte i) {
		return method6707(false, 834638372);
	}

	public int method42(int i) {
		Class148[] class148s = method44(aClass178_4802, i, (byte) -39);
		if (class148s != null)
			return class148s[0].method38();
		return 0;
	}

	public int method46(int i) {
		Class148[] class148s = method44(aClass178_4802, i, (byte) -33);
		if (class148s != null)
			return class148s[0].method38();
		return 0;
	}

	public static boolean method6714(int i) {
		return (null != Class323.aTwitchTV3452 && Class323.aTwitchTV3452.IsStreaming());
	}

	static boolean method6715(String string, String string_34_, int i) {
		Class43.anInt567 = 1953306581;
		Class43.aClass116_568 = client.aClass116_11058;
		return Class159.method2570(false, false, string, string_34_, -1L);
	}

	static final void method6716(Class250 class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (Class594.method9807(string, class669, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2677 = Class78.method1554(string, class669, -68449792);
		class250.aBool2635 = true;
	}

	static final void method6717(Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		class669.anInt8558 -= -17422498;
		int i_35_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_36_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = string.indexOf(i_35_, i_36_);
	}

	static Class194 method6718(Class523_Sub34 class523_sub34, byte i) {
		int i_37_ = class523_sub34.readUnsignedByte(-1105103355);
		Class75 class75 = Class452.method7313(i_37_, 1807679216);
		Class194 class194 = null;
		switch (-1834071955 * class75.anInt847) {
		case 18:
			class194 = new Class194_Sub22(class523_sub34);
			break;
		case 13:
			class194 = new Class194_Sub19(class523_sub34);
			break;
		case 2:
			class194 = new Class194_Sub2(class523_sub34, 0, 1);
			break;
		case 23:
			class194 = new Class194_Sub5(class523_sub34);
			break;
		case 5:
			class194 = new Class194_Sub15(class523_sub34);
			break;
		case 17:
			class194 = new Class194_Sub10(class523_sub34);
			break;
		case 20:
			class194 = new Class194_Sub16_Sub2(class523_sub34);
			break;
		case 15:
			class194 = new Class194_Sub9(class523_sub34);
			break;
		case 26:
			class194 = new Class194_Sub11(class523_sub34);
			break;
		case 4:
			class194 = new Class194_Sub21(class523_sub34);
			break;
		case 12:
			class194 = new Class194_Sub18(class523_sub34);
			break;
		case 10:
			class194 = new Class194_Sub23(class523_sub34, false);
			break;
		case 16:
			class194 = new Class194_Sub2(class523_sub34, 1, 0);
			break;
		case 25:
			class194 = new Class194_Sub13(class523_sub34);
			break;
		case 22:
			class194 = new Class194_Sub2(class523_sub34, 0, 0);
			break;
		case 28:
			class194 = new Class194_Sub6(class523_sub34);
			break;
		case 6:
			class194 = new Class194_Sub12(class523_sub34);
			break;
		default:
			break;
		case 0:
			class194 = new Class194_Sub7(class523_sub34);
			break;
		case 21:
			class194 = new Class194_Sub8(class523_sub34);
			break;
		case 24:
			class194 = new Class194_Sub3(class523_sub34);
			break;
		case 14:
			class194 = new Class194_Sub14(class523_sub34);
			break;
		case 3:
			class194 = new Class194_Sub1(class523_sub34);
			break;
		case 27:
			class194 = new Class194_Sub4(class523_sub34);
			break;
		case 19:
			class194 = new Class194_Sub2(class523_sub34, 1, 1);
			break;
		case 30:
			class194 = new Class194_Sub16_Sub1(class523_sub34);
			break;
		case 1:
			class194 = new Class194_Sub20(class523_sub34);
			break;
		case 8:
			class194 = new Class194_Sub23(class523_sub34, true);
			break;
		case 9:
			class194 = new Class194_Sub17(class523_sub34);
		}
		return class194;
	}
}
