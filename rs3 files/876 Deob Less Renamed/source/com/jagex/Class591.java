/* Class591 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;

public class Class591 {
	short[] aShortArray7804;
	int[] anIntArray7805;
	long aLong7806;
	short[] aShortArray7807;

	public Class591(long l, int[] is, short[] is_0_, short[] is_1_) {
		aLong7806 = l * -4025076616759503149L;
		anIntArray7805 = is;
		aShortArray7804 = is_0_;
		aShortArray7807 = is_1_;
	}

	public static void method9777(int i, int[] is, int i_2_) {
		if (-1 != i && Class69.method1464(i, is, 2009642973)) {
			Class250[] class250s = Class31.aClass242Array302[i].aClass250Array2457;
			Class204.method3709(class250s, -1730866738);
		}
	}

	static final void method9778(Class669 class669, byte i) {
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_3_, -635418857);
		Class242 class242 = Class31.aClass242Array302[i_3_ >> 16];
		Class194_Sub9.method15506(class250, class242, class669, -1649710533);
	}

	static final void method9779(Class669 class669, int i) {
		int i_4_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class523_Sub27_Sub17 class523_sub27_sub17 = Class534.method8812(i_4_ >> 14 & 0x3fff, i_4_ & 0x3fff);
		if (class523_sub27_sub17 == null)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -536403473 * class523_sub27_sub17.anInt11831;
	}

	static final void method9780(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1307622225 * Class506.anInt5662;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1307622225 * Class506.anInt5662;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1;
	}

	public static Class472 method9781(Archive class44, boolean bool, int i, boolean bool_5_, boolean bool_6_, short i_7_) {
		if (null == GraphicsDefinitions.aClass467_Sub1Array8605) {
			GraphicsDefinitions.aClass467_Sub1Array8605 = new Class467_Sub1[Class9.method593((byte) 44)];
			Class488.aMap5500 = new HashMap();
		}
		Class545 class545 = null;
		int i_8_ = class44.method1223(787387159);
		if (null != client.aClass20_5687 && !Class418.aBool4697)
			class545 = new Class545(i_8_, client.aClass20_5687, Class406.aClass20Array4198[i_8_], (i_8_ == Archive.aClass44_665.method1223(-1572055229) ? 8000000 : 2500000));
		GraphicsDefinitions.aClass467_Sub1Array8605[i_8_] = Class90.aClass424_890.method6721(i_8_, class545, Class516.aClass545_7051, class44.method1222((byte) 68), (byte) 57);
		if (bool_6_)
			GraphicsDefinitions.aClass467_Sub1Array8605[i_8_].method15766(1539041108);
		Class472 class472 = new Class472(GraphicsDefinitions.aClass467_Sub1Array8605[i_8_], bool, i);
		Class488.aMap5500.put(class44, class472);
		return class472;
	}

	static void method9782(Class178 class178, int i) {
		if (Class423.method6714(1237387895) && Class220.method4130((byte) 0))
			Class197.method3670(0, 0, Class170.anInt1833 * 2141365743, 350, 65280);
		class178.method3378(0, 0, 2141365743 * Class170.anInt1833, 350);
		class178.method3193(0, 0, Class170.anInt1833 * 2141365743, 350, Class95.anInt1162 * -15297265 << 24 | 0x332277, 1);
		if (Class95.aBool1174) {
			for (int i_9_ = 0; i_9_ < 100; i_9_++) {
				int i_10_ = Class95.anIntArray1170[i_9_] >> 4;
				int i_11_ = Class15.anIntArray184[i_9_] >> 4;
				i_10_ += (Class433.anIntArray4880[64 * (i_11_ + (i_10_ & 0x40)) & 0x3fff]) >> 10;
				if (i_10_ >= 0 && i_10_ >> 1 < Class241.anIntArray2455.length && Class241.anIntArray2455[i_10_ >> 1] >> 2 < 350 - i_11_)
					class178.method3193(i_10_, i_11_, 2, 2, (Class338.anIntArray3574[i_9_] << 24 | 0xffffff), 1);
			}
			for (int i_12_ = 0; i_12_ < Class241.anIntArray2455.length; i_12_++) {
				int i_13_ = Class241.anIntArray2455[i_12_] >> 2;
				class178.method3193(i_12_ << 1, 350 - i_13_, 2, i_13_, -2130706433, 1);
			}
		}
		int i_14_ = 350 / (1887129305 * Class95.anInt1167);
		if (Class95.anInt1179 * 1497187345 > 0) {
			int i_15_ = 346 - 1887129305 * Class95.anInt1167 - 4;
			int i_16_ = i_14_ * i_15_ / (1497187345 * Class95.anInt1179 + i_14_ - 1);
			int i_17_ = 4;
			if (1497187345 * Class95.anInt1179 > 1)
				i_17_ += ((Class95.anInt1179 * 1497187345 - 1 - Class95.anInt1177 * -165903669) * (i_15_ - i_16_) / (Class95.anInt1179 * 1497187345 - 1));
			class178.method3193(2141365743 * Class170.anInt1833 - 16, i_17_, 12, i_16_, -15297265 * Class95.anInt1162 << 24 | 0x332277, 2);
			for (int i_18_ = Class95.anInt1177 * -165903669; (i_18_ < i_14_ + -165903669 * Class95.anInt1177 && i_18_ < Class95.anInt1179 * 1497187345); i_18_++) {
				String[] strings = Class194_Sub13.method15512((Class95.aStringArray1165[i_18_]), '\010', (byte) 20);
				int i_19_ = ((Class170.anInt1833 * 2141365743 - 8 - 16) / strings.length);
				for (int i_20_ = 0; i_20_ < strings.length; i_20_++) {
					int i_21_ = i_20_ * i_19_ + 8;
					class178.method3378(i_21_, 0, i_19_ + i_21_ - 8, 350);
					Class10.aClass164_83.method2635(Class108.method1903(strings[i_20_], -1176727998), i_21_, (350 - -95002977 * Class95.anInt1163 - 2 - -853549931 * Class46.aClass10_672.anInt80 - (1887129305 * Class95.anInt1167 * (i_18_ - Class95.anInt1177 * -165903669))), -1, -16777216, (byte) 45);
				}
			}
		}
		Class34.aClass164_318.method2596("876 1", 2141365743 * Class170.anInt1833 - 25, 330, -1, -16777216, 1569977657);
		class178.method3378(0, 0, 2141365743 * Class170.anInt1833, 350);
		class178.method3080(0, 350 - Class95.anInt1163 * -95002977, 2141365743 * Class170.anInt1833, -1, -97366464);
		Class34.aClass164_319.method2635(new StringBuilder().append("--> ").append(Class108.method1903(Class95.aString1171, 72812596)).toString(), 10, 350 - -853549931 * Class655.aClass10_8421.anInt80 - 1, -1, -16777216, (byte) -48);
		if (Class341.aBool3608) {
			int i_22_ = -1;
			if (client.anInt11011 % 30 > 15)
				i_22_ = 16777215;
			class178.method3387(10 + (Class655.aClass10_8421.method597(new StringBuilder().append("--> ").append(Class108.method1903(Class95.aString1171, -866944959).substring(0, Class95.anInt1173 * 16594559)).toString(), -1759656773)), 350 - -853549931 * Class655.aClass10_8421.anInt80 - 11, 12, i_22_, 159828926);
		}
		class178.method3071();
		Class707_Sub2.method17205((byte) 0);
	}
}
