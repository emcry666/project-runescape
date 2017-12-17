/* Class654 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class654 {
	int anInt8401;
	float aFloat8402;
	float aFloat8403;
	float aFloat8404;
	int[] anIntArray8405 = new int[3];
	int anInt8406;
	int anInt8407;
	float aFloat8408;
	float aFloat8409;
	float aFloat8410;
	int anInt8411;
	int anInt8412;
	int anInt8413;
	int anInt8414;
	int anInt8415;
	int anInt8416;
	Class437 aClass437_8417;
	float[] aFloatArray8418 = new float[3];
	int anInt8419;

	void method10657(byte i) {
		anInt8415 = 579341331;
		aFloat8402 = -1.0F;
		aFloat8403 = -1.0F;
		aFloat8404 = -1.0F;
		aClass437_8417 = null;
		anInt8412 = -1552764383;
		anInt8407 = 1970083653;
		aFloat8408 = -1.0F;
		aFloat8409 = -1.0F;
		aFloat8410 = -1.0F;
		anInt8411 = 736490469;
		anInt8416 = 472282515;
		anInt8413 = 1207440555;
		anInt8414 = -662349919;
		anInt8401 = 1011804429;
		anInt8406 = -363698325;
		for (int i_0_ = 0; i_0_ < anIntArray8405.length; i_0_++) {
			anIntArray8405[i_0_] = -1;
			aFloatArray8418[i_0_] = 0.0F;
		}
		anInt8419 = 2089742040;
	}

	public int method10658() {
		return 542405309 * anInt8406;
	}

	public int method10659() {
		return 762375699 * anInt8411;
	}

	public float method10660() {
		return aFloat8403;
	}

	public Class654() {
		method10657((byte) 1);
	}

	public float method10661(int i) {
		return aFloat8403;
	}

	public float method10662(byte i) {
		return aFloat8404;
	}

	public int method10663() {
		return anInt8412 * 1925885471;
	}

	public int method10664(int i) {
		return anInt8412 * 1925885471;
	}

	public int method10665(int i) {
		return -715711373 * anInt8407;
	}

	public float method10666(byte i) {
		return aFloat8408;
	}

	public int method10667() {
		return anInt8413 * 581745149;
	}

	public float method10668(byte i) {
		return aFloat8410;
	}

	public int method10669() {
		return anInt8416 * 1112543077;
	}

	public int method10670(int i) {
		return anInt8416 * 1112543077;
	}

	public int method10671(int i) {
		return anInt8413 * 581745149;
	}

	public int method10672(int i) {
		return -867585121 * anInt8414;
	}

	public int method10673(byte i) {
		return 1124790843 * anInt8401;
	}

	public boolean method10674(RSBuffer class523_sub34, int i) {
		int i_1_ = class523_sub34.readUnsignedShort(-1148428595);
		if (0 == i_1_) {
			anInt8419 = class523_sub34.readUnsignedShort(-1370026195) * -1064733941;
			return false;
		}
		if (0 != (i_1_ & Class646.aClass646_8349.anInt8363 * -123732887))
			anInt8415 = class523_sub34.readUnsignedInt((byte) -18) * -579341331;
		if (0 != (i_1_ & Class646.aClass646_8361.anInt8363 * -123732887))
			aFloat8402 = class523_sub34.method16293(-1203265998);
		if ((i_1_ & -123732887 * Class646.aClass646_8350.anInt8363) != 0)
			aFloat8403 = class523_sub34.method16293(-1206810246);
		if (0 != (i_1_ & -123732887 * Class646.aClass646_8358.anInt8363))
			aFloat8404 = class523_sub34.method16293(-523390328);
		if ((i_1_ & -123732887 * Class646.aClass646_8352.anInt8363) != 0)
			aClass437_8417 = Class437.method6881(class523_sub34);
		if (0 != (i_1_ & -123732887 * Class646.aClass646_8355.anInt8363))
			anInt8412 = class523_sub34.readUnsignedInt((byte) -15) * 1552764383;
		if ((i_1_ & -123732887 * Class646.aClass646_8354.anInt8363) != 0)
			anInt8407 = class523_sub34.readUnsignedShort(-1715720652) * -1970083653;
		if (0 != (i_1_ & -123732887 * Class646.aClass646_8348.anInt8363))
			anInt8411 = class523_sub34.readUnsignedShort(-23462211) * -736490469;
		if (0 != (i_1_ & -123732887 * Class646.aClass646_8356.anInt8363))
			aFloat8408 = class523_sub34.method16293(-1559900103);
		if ((i_1_ & Class646.aClass646_8357.anInt8363 * -123732887) != 0)
			aFloat8409 = class523_sub34.method16293(-1366956490);
		if ((i_1_ & Class646.aClass646_8353.anInt8363 * -123732887) != 0)
			aFloat8410 = class523_sub34.method16293(-1791602815);
		if (0 != (i_1_ & -123732887 * Class646.aClass646_8359.anInt8363)) {
			anInt8416 = class523_sub34.readUnsignedShort(-1441456564) * -472282515;
			anInt8413 = class523_sub34.readShort(464427954) * -1207440555;
			anInt8414 = class523_sub34.readShort(-882183735) * 662349919;
			anInt8401 = class523_sub34.readShort(1891423550) * -1011804429;
			anInt8406 = class523_sub34.readUnsignedShort(-2015652843) * 363698325;
		}
		if ((i_1_ & Class646.aClass646_8360.anInt8363 * -123732887) != 0) {
			anIntArray8405[0] = class523_sub34.readUnsignedShort(-428866956);
			aFloatArray8418[0] = class523_sub34.method16293(-746653143);
		}
		if (0 != (i_1_ & Class646.aClass646_8351.anInt8363 * -123732887)) {
			anIntArray8405[1] = class523_sub34.readUnsignedShort(-783403787);
			aFloatArray8418[1] = class523_sub34.method16293(-971711143);
		}
		if ((i_1_ & Class646.aClass646_8362.anInt8363 * -123732887) != 0) {
			anIntArray8405[2] = class523_sub34.readUnsignedShort(-163560340);
			aFloatArray8418[2] = class523_sub34.method16293(-824846842);
		}
		anInt8419 = class523_sub34.readUnsignedShort(-130295336) * -1064733941;
		return true;
	}

	public int method10675(int i, int i_2_) {
		return anIntArray8405[i];
	}

	public float method10676(int i, int i_3_) {
		return aFloatArray8418[i];
	}

	public int method10677(int i) {
		return anInt8419 * -1228193629;
	}

	void method10678() {
		anInt8415 = 579341331;
		aFloat8402 = -1.0F;
		aFloat8403 = -1.0F;
		aFloat8404 = -1.0F;
		aClass437_8417 = null;
		anInt8412 = -1552764383;
		anInt8407 = 1970083653;
		aFloat8408 = -1.0F;
		aFloat8409 = -1.0F;
		aFloat8410 = -1.0F;
		anInt8411 = 736490469;
		anInt8416 = 472282515;
		anInt8413 = 1207440555;
		anInt8414 = -662349919;
		anInt8401 = 1011804429;
		anInt8406 = -363698325;
		for (int i = 0; i < anIntArray8405.length; i++) {
			anIntArray8405[i] = -1;
			aFloatArray8418[i] = 0.0F;
		}
		anInt8419 = 2089742040;
	}

	public boolean method10679(RSBuffer class523_sub34) {
		int i = class523_sub34.readUnsignedShort(-1317630110);
		if (0 == i) {
			anInt8419 = class523_sub34.readUnsignedShort(-1780307950) * -1064733941;
			return false;
		}
		if (0 != (i & Class646.aClass646_8349.anInt8363 * -123732887))
			anInt8415 = class523_sub34.readUnsignedInt((byte) -39) * -579341331;
		if (0 != (i & Class646.aClass646_8361.anInt8363 * -123732887))
			aFloat8402 = class523_sub34.method16293(-2006846329);
		if ((i & -123732887 * Class646.aClass646_8350.anInt8363) != 0)
			aFloat8403 = class523_sub34.method16293(-1901090389);
		if (0 != (i & -123732887 * Class646.aClass646_8358.anInt8363))
			aFloat8404 = class523_sub34.method16293(-705391058);
		if ((i & -123732887 * Class646.aClass646_8352.anInt8363) != 0)
			aClass437_8417 = Class437.method6881(class523_sub34);
		if (0 != (i & -123732887 * Class646.aClass646_8355.anInt8363))
			anInt8412 = class523_sub34.readUnsignedInt((byte) -20) * 1552764383;
		if ((i & -123732887 * Class646.aClass646_8354.anInt8363) != 0)
			anInt8407 = class523_sub34.readUnsignedShort(-290589142) * -1970083653;
		if (0 != (i & -123732887 * Class646.aClass646_8348.anInt8363))
			anInt8411 = class523_sub34.readUnsignedShort(-1787111246) * -736490469;
		if (0 != (i & -123732887 * Class646.aClass646_8356.anInt8363))
			aFloat8408 = class523_sub34.method16293(-978892800);
		if ((i & Class646.aClass646_8357.anInt8363 * -123732887) != 0)
			aFloat8409 = class523_sub34.method16293(-768706355);
		if ((i & Class646.aClass646_8353.anInt8363 * -123732887) != 0)
			aFloat8410 = class523_sub34.method16293(-1781090355);
		if (0 != (i & -123732887 * Class646.aClass646_8359.anInt8363)) {
			anInt8416 = class523_sub34.readUnsignedShort(-1509769770) * -472282515;
			anInt8413 = class523_sub34.readShort(-1383369302) * -1207440555;
			anInt8414 = class523_sub34.readShort(1417493611) * 662349919;
			anInt8401 = class523_sub34.readShort(237475597) * -1011804429;
			anInt8406 = class523_sub34.readUnsignedShort(-1671588480) * 363698325;
		}
		if ((i & Class646.aClass646_8360.anInt8363 * -123732887) != 0) {
			anIntArray8405[0] = class523_sub34.readUnsignedShort(-533865819);
			aFloatArray8418[0] = class523_sub34.method16293(-1566831637);
		}
		if (0 != (i & Class646.aClass646_8351.anInt8363 * -123732887)) {
			anIntArray8405[1] = class523_sub34.readUnsignedShort(-2007350048);
			aFloatArray8418[1] = class523_sub34.method16293(-1604394275);
		}
		if ((i & Class646.aClass646_8362.anInt8363 * -123732887) != 0) {
			anIntArray8405[2] = class523_sub34.readUnsignedShort(-968935579);
			aFloatArray8418[2] = class523_sub34.method16293(-1080796639);
		}
		anInt8419 = class523_sub34.readUnsignedShort(-1839984404) * -1064733941;
		return true;
	}

	public boolean method10680(RSBuffer class523_sub34) {
		int i = class523_sub34.readUnsignedShort(-848359080);
		if (0 == i) {
			anInt8419 = class523_sub34.readUnsignedShort(-172611760) * -1064733941;
			return false;
		}
		if (0 != (i & Class646.aClass646_8349.anInt8363 * -123732887))
			anInt8415 = class523_sub34.readUnsignedInt((byte) -86) * -579341331;
		if (0 != (i & Class646.aClass646_8361.anInt8363 * -123732887))
			aFloat8402 = class523_sub34.method16293(-1318627771);
		if ((i & -123732887 * Class646.aClass646_8350.anInt8363) != 0)
			aFloat8403 = class523_sub34.method16293(-1383386378);
		if (0 != (i & -123732887 * Class646.aClass646_8358.anInt8363))
			aFloat8404 = class523_sub34.method16293(-1328439283);
		if ((i & -123732887 * Class646.aClass646_8352.anInt8363) != 0)
			aClass437_8417 = Class437.method6881(class523_sub34);
		if (0 != (i & -123732887 * Class646.aClass646_8355.anInt8363))
			anInt8412 = class523_sub34.readUnsignedInt((byte) -22) * 1552764383;
		if ((i & -123732887 * Class646.aClass646_8354.anInt8363) != 0)
			anInt8407 = class523_sub34.readUnsignedShort(-667040101) * -1970083653;
		if (0 != (i & -123732887 * Class646.aClass646_8348.anInt8363))
			anInt8411 = class523_sub34.readUnsignedShort(-1709927603) * -736490469;
		if (0 != (i & -123732887 * Class646.aClass646_8356.anInt8363))
			aFloat8408 = class523_sub34.method16293(-1150283313);
		if ((i & Class646.aClass646_8357.anInt8363 * -123732887) != 0)
			aFloat8409 = class523_sub34.method16293(-1665284317);
		if ((i & Class646.aClass646_8353.anInt8363 * -123732887) != 0)
			aFloat8410 = class523_sub34.method16293(-639207022);
		if (0 != (i & -123732887 * Class646.aClass646_8359.anInt8363)) {
			anInt8416 = class523_sub34.readUnsignedShort(-630729750) * -472282515;
			anInt8413 = class523_sub34.readShort(-440699490) * -1207440555;
			anInt8414 = class523_sub34.readShort(-1505466798) * 662349919;
			anInt8401 = class523_sub34.readShort(-950045418) * -1011804429;
			anInt8406 = class523_sub34.readUnsignedShort(-1482131794) * 363698325;
		}
		if ((i & Class646.aClass646_8360.anInt8363 * -123732887) != 0) {
			anIntArray8405[0] = class523_sub34.readUnsignedShort(-2003374936);
			aFloatArray8418[0] = class523_sub34.method16293(-932057938);
		}
		if (0 != (i & Class646.aClass646_8351.anInt8363 * -123732887)) {
			anIntArray8405[1] = class523_sub34.readUnsignedShort(-819958134);
			aFloatArray8418[1] = class523_sub34.method16293(-1180552103);
		}
		if ((i & Class646.aClass646_8362.anInt8363 * -123732887) != 0) {
			anIntArray8405[2] = class523_sub34.readUnsignedShort(-1028622136);
			aFloatArray8418[2] = class523_sub34.method16293(-367865043);
		}
		anInt8419 = class523_sub34.readUnsignedShort(-903915752) * -1064733941;
		return true;
	}

	public int method10681() {
		return anInt8415 * -190946843;
	}

	public int method10682(byte i) {
		return 762375699 * anInt8411;
	}

	public float method10683() {
		return aFloat8402;
	}

	public float method10684() {
		return aFloat8402;
	}

	public float method10685() {
		return aFloat8402;
	}

	public float method10686() {
		return aFloat8402;
	}

	public Class437 method10687() {
		return aClass437_8417;
	}

	public float method10688() {
		return aFloat8403;
	}

	public int method10689(int i) {
		return 542405309 * anInt8406;
	}

	public Class437 method10690() {
		return aClass437_8417;
	}

	public Class437 method10691() {
		return aClass437_8417;
	}

	public float method10692(int i) {
		return aFloat8402;
	}

	public int method10693() {
		return anInt8415 * -190946843;
	}

	public int method10694() {
		return anInt8412 * 1925885471;
	}

	public float method10695(int i) {
		return aFloatArray8418[i];
	}

	public float method10696() {
		return aFloat8404;
	}

	public float method10697() {
		return aFloat8408;
	}

	public int method10698(byte i) {
		return anInt8415 * -190946843;
	}

	public Class437 method10699(int i) {
		return aClass437_8417;
	}

	public float method10700(int i) {
		return aFloat8409;
	}

	public int method10701() {
		return anInt8412 * 1925885471;
	}

	public int method10702() {
		return anInt8416 * 1112543077;
	}

	public int method10703() {
		return -715711373 * anInt8407;
	}

	public float method10704() {
		return aFloat8410;
	}

	public int method10705() {
		return anInt8413 * 581745149;
	}

	public int method10706() {
		return -867585121 * anInt8414;
	}

	public int method10707() {
		return 1124790843 * anInt8401;
	}

	public int method10708() {
		return 1124790843 * anInt8401;
	}

	public float method10709() {
		return aFloat8408;
	}

	public int method10710(int i) {
		return anIntArray8405[i];
	}

	public float method10711() {
		return aFloat8410;
	}

	public float method10712(int i) {
		return aFloatArray8418[i];
	}

	public float method10713(int i) {
		return aFloatArray8418[i];
	}

	static final void method10714(Class669 class669, int i) {
		class669.anInt8560 -= -1823027158;
		String string = ((String) class669.anObjectArray8559[240723773 * class669.anInt8560]);
		String string_4_ = ((String) class669.anObjectArray8559[1 + class669.anInt8560 * 240723773]);
		int i_5_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = string.indexOf(string_4_, i_5_);
	}

	static final void method10715(Class669 class669, int i) throws Exception_Sub7 {
		class669.anInt8558 -= -17422498;
		int i_6_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_7_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5327((float) i_6_, (float) i_7_, -1513848006);
	}

	static final void method10716(Class669 class669, int i) {
		int i_8_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		int i_9_ = i_8_ >> 16;
		if (null == Class31.aClass242Array302[i_9_])
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 619150633 * (Class31.aClass242Array302[i_9_].aClass250Array2457[i_8_].anInt2527);
	}

	static int method10717(char c, Class668 class668, int i) {
		int i_10_ = c << 4;
		if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
			c = Character.toLowerCase(c);
			i_10_ = 1 + (c << 4);
		}
		if (c == 241 && class668 == Class668.aClass668_8544)
			i_10_ = 1762;
		return i_10_;
	}

	public static byte[] method10718(Object object, boolean bool, int i) {
		if (null == object)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			if (bool)
				return Arrays.copyOf(is, is.length);
			return is;
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[bytebuffer.capacity()];
			bytebuffer.position(0);
			bytebuffer.get(is);
			return is;
		}
		throw new IllegalArgumentException();
	}

	static final void method10719(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class711.method14327(class250, class242, class669, (byte) 114);
	}

	public static int method10720(int i, int i_11_, boolean bool, int i_12_) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1129979607);
		if (class523_sub1 == null)
			return 0;
		if (i_11_ < 0 || i_11_ >= class523_sub1.itemAmounts.length)
			return 0;
		return class523_sub1.itemAmounts[i_11_];
	}

	static void method10721(Class178 class178, int i) {
		int i_13_ = -1744502791 * Whirlpool.anInt231;
		int i_14_ = Class194_Sub17.anInt9941 * 14756423;
		int i_15_ = -345535891 * BaseVarType.anInt5390;
		int i_16_ = Class523_Sub19.anInt10492 * 2080544711 - 3;
		int i_17_ = 20;
		if (null == Class659.aClass164_8505 || null == Class331.aClass10_3506) {
			Class659.aClass164_8505 = (Class164) (Class491.aClass423_5536.method6689(client.anInterface50_11044, 1212810739 * Class687_Sub2.anInt10826, true, true, -1862322399));
			Class331.aClass10_3506 = Class491.aClass423_5536.method6688((client.anInterface50_11044), (Class687_Sub2.anInt10826 * 1212810739), (byte) -72);
			if (null != Class659.aClass164_8505 && Class331.aClass10_3506 != null) {
				Class524.method8685(-522212835);
				int i_18_ = i_15_ / 2 + i_13_;
				if (i_15_ + i_18_ > Class170.anInt1833 * 2141365743)
					i_18_ = 2141365743 * Class170.anInt1833 - i_15_;
				if (i_18_ < 0)
					i_18_ = 0;
				Class436.method6874(i_18_, 14756423 * Class194_Sub17.anInt9941, -882909686);
				return;
			}
		}
		Class164 class164;
		if (null == Class659.aClass164_8505 || null == Class331.aClass10_3506)
			class164 = Class34.aClass164_319;
		else
			class164 = Class659.aClass164_8505;
		Class10 class10 = client.method17697(1119168978);
		Class683.method13865(class178, -1744502791 * Whirlpool.anInt231, Class194_Sub17.anInt9941 * 14756423, -345535891 * BaseVarType.anInt5390, 2080544711 * Class523_Sub19.anInt10492, i_17_, class164, class10, Class39.aClass39_424.method1124(Class53_Sub20.aClass668_10979, (byte) -27), 957726005);
		int i_19_ = (255 - 148318499 * Class392.anInt4036 - 597769683 * Class36.anInt351);
		if (i_19_ < 0)
			i_19_ = 0;
		int i_20_ = Class642.aClass561_8334.method9426((byte) -62);
		int i_21_ = Class642.aClass561_8334.method9432(-1817966395);
		if (!Class36.aBool327) {
			int i_22_ = 0;
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) Class36.aClass708_342.method14240(989073589)); class523_sub27_sub6 != null; class523_sub27_sub6 = ((Class523_Sub27_Sub6) Class36.aClass708_342.method14244((byte) 61))) {
				int i_23_ = ((Class36.anInt323 * 1648921847 * (462991943 * Class36.anInt330 - 1 - i_22_)) + (1 + (i_17_ + i_14_ + class10.anInt76 * -1669009881)));
				if (i_20_ > Whirlpool.anInt231 * -1744502791 && i_20_ < (Whirlpool.anInt231 * -1744502791 + -345535891 * BaseVarType.anInt5390) && i_21_ > i_23_ - class10.anInt76 * -1669009881 - 1 && i_21_ < -853549931 * class10.anInt80 + i_23_ && class523_sub27_sub6.aBool11635)
					class178.method3193(-1744502791 * Whirlpool.anInt231, i_23_ - -1669009881 * class10.anInt76, BaseVarType.anInt5390 * -345535891, Class36.anInt323 * 1648921847, (i_19_ << 24 | -627853313 * Class17.anInt192), 1);
				i_22_++;
			}
		} else {
			int i_24_ = 0;
			for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) Class36.aClass697_339.first(-1426448868)); null != class523_sub27_sub8; class523_sub27_sub8 = ((Class523_Sub27_Sub8) Class36.aClass697_339.next(768418218))) {
				int i_25_ = (i_24_ * (1648921847 * Class36.anInt323) + (1 + (i_17_ + i_14_ + class10.anInt76 * -1669009881)));
				if (i_20_ > Whirlpool.anInt231 * -1744502791 && i_20_ < (Whirlpool.anInt231 * -1744502791 + -345535891 * BaseVarType.anInt5390) && i_21_ > i_25_ - -1669009881 * class10.anInt76 - 1 && i_21_ < i_25_ + class10.anInt80 * -853549931 && (1060081949 * class523_sub27_sub8.anInt11719 > 1 || (((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)).aBool11635)))
					class178.method3193(Whirlpool.anInt231 * -1744502791, i_25_ - -1669009881 * class10.anInt76, -345535891 * BaseVarType.anInt5390, 1648921847 * Class36.anInt323, (i_19_ << 24 | -627853313 * Class17.anInt192), 1);
				i_24_++;
			}
			if (Class36.aClass523_Sub27_Sub8_328 != null) {
				Class683.method13865(class178, Class523_Sub7.anInt10405 * 1464782871, 534142755 * Class301.anInt3330, 805194879 * Class426.anInt4824, 1850758193 * Class705.anInt8818, i_17_, class164, class10, (Class36.aClass523_Sub27_Sub8_328.aString11720), -174884897);
				i_24_ = 0;
				for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) Class36.aClass523_Sub27_Sub8_328.aClass697_11718.first(-1426448868)); null != class523_sub27_sub6; class523_sub27_sub6 = ((Class523_Sub27_Sub6) Class36.aClass523_Sub27_Sub8_328.aClass697_11718.next(768418218))) {
					int i_26_ = (i_24_ * (1648921847 * Class36.anInt323) + (534142755 * Class301.anInt3330 + i_17_ + -1669009881 * class10.anInt76 + 1));
					if (i_20_ > Class523_Sub7.anInt10405 * 1464782871 && i_20_ < (Class426.anInt4824 * 805194879 + 1464782871 * Class523_Sub7.anInt10405) && i_21_ > i_26_ - -1669009881 * class10.anInt76 - 1 && i_21_ < i_26_ + class10.anInt80 * -853549931 && class523_sub27_sub6.aBool11635)
						class178.method3193(Class523_Sub7.anInt10405 * 1464782871, i_26_ - class10.anInt76 * -1669009881, 805194879 * Class426.anInt4824, 1648921847 * Class36.anInt323, i_19_ << 24 | Class17.anInt192 * -627853313, 1);
					i_24_++;
				}
				Class297.method5303(class178, Class523_Sub7.anInt10405 * 1464782871, 534142755 * Class301.anInt3330, 805194879 * Class426.anInt4824, Class705.anInt8818 * 1850758193, i_17_, (short) -5240);
			}
		}
		Class297.method5303(class178, -1744502791 * Whirlpool.anInt231, 14756423 * Class194_Sub17.anInt9941, -345535891 * BaseVarType.anInt5390, Class523_Sub19.anInt10492 * 2080544711, i_17_, (short) 13402);
		if (!Class36.aBool327) {
			int i_27_ = 0;
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) Class36.aClass708_342.method14240(1273510327)); null != class523_sub27_sub6; class523_sub27_sub6 = ((Class523_Sub27_Sub6) Class36.aClass708_342.method14244((byte) 104))) {
				int i_28_ = (-1669009881 * class10.anInt76 + (i_14_ + i_17_) + 1 + ((Class36.anInt330 * 462991943 - 1 - i_27_) * (Class36.anInt323 * 1648921847)));
				Class676_Sub1.method16780(i_20_, i_21_, i_13_, i_14_, i_15_, i_16_, i_28_, class523_sub27_sub6, class164, class10, 1638226811 * Class328_Sub3_Sub3.anInt11590 | ~0xffffff, Class328_Sub3_Sub3.anInt11591 * -391136693 | ~0xffffff, 162873804);
				i_27_++;
			}
		} else {
			int i_29_ = 0;
			for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) Class36.aClass697_339.first(-1426448868)); null != class523_sub27_sub8; class523_sub27_sub8 = ((Class523_Sub27_Sub8) Class36.aClass697_339.next(768418218))) {
				int i_30_ = (14756423 * Class194_Sub17.anInt9941 + i_17_ + -1669009881 * class10.anInt76 + 1 + i_29_ * (Class36.anInt323 * 1648921847));
				if (1 == 1060081949 * class523_sub27_sub8.anInt11719)
					Class676_Sub1.method16780(i_20_, i_21_, Whirlpool.anInt231 * -1744502791, Class194_Sub17.anInt9941 * 14756423, -345535891 * BaseVarType.anInt5390, 2080544711 * Class523_Sub19.anInt10492, i_30_, ((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)), class164, class10, (1638226811 * Class328_Sub3_Sub3.anInt11590 | ~0xffffff), (-391136693 * Class328_Sub3_Sub3.anInt11591 | ~0xffffff), 162873804);
				else
					Class660.method10861(i_20_, i_21_, -1744502791 * Whirlpool.anInt231, Class194_Sub17.anInt9941 * 14756423, -345535891 * BaseVarType.anInt5390, Class523_Sub19.anInt10492 * 2080544711, i_30_, class523_sub27_sub8, class164, class10, (Class328_Sub3_Sub3.anInt11590 * 1638226811 | ~0xffffff), (-391136693 * Class328_Sub3_Sub3.anInt11591 | ~0xffffff), -1579629926);
				i_29_++;
			}
			if (null != Class36.aClass523_Sub27_Sub8_328) {
				i_29_ = 0;
				for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) Class36.aClass523_Sub27_Sub8_328.aClass697_11718.first(-1426448868)); class523_sub27_sub6 != null; class523_sub27_sub6 = ((Class523_Sub27_Sub6) Class36.aClass523_Sub27_Sub8_328.aClass697_11718.next(768418218))) {
					int i_31_ = (1 + (class10.anInt76 * -1669009881 + (i_17_ + Class301.anInt3330 * 534142755)) + 1648921847 * Class36.anInt323 * i_29_);
					Class676_Sub1.method16780(i_20_, i_21_, 1464782871 * Class523_Sub7.anInt10405, Class301.anInt3330 * 534142755, 805194879 * Class426.anInt4824, Class705.anInt8818 * 1850758193, i_31_, class523_sub27_sub6, class164, class10, (1638226811 * Class328_Sub3_Sub3.anInt11590 | ~0xffffff), (-391136693 * Class328_Sub3_Sub3.anInt11591 | ~0xffffff), 162873804);
					i_29_++;
				}
			}
		}
	}

	public static InterfaceComponentDefinitions method10722(int i, int i_32_, byte i_33_) {
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i, -771917131);
		if (i_32_ == -1)
			return class250;
		if (null == class250 || class250.aClass250Array2535 == null || i_32_ >= class250.aClass250Array2535.length)
			return null;
		return class250.aClass250Array2535[i_32_];
	}
}
