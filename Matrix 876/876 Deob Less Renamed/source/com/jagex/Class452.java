/* Class452 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Class452 {
	static final int anInt4963 = 10;
	static final int anInt4964 = 10000;
	int anInt4965;
	ExecutorService anExecutorService4966;
	int anInt4967;
	static final int anInt4968 = 2;
	volatile int anInt4969 = 0;
	long aLong4970;
	static final int anInt4971 = 10000;
	String aString4972;
	static final int anInt4973 = 60000;
	boolean aBool4974;

	void method7293() {
		anInt4969 -= -1924850795;
	}

	boolean method7294(byte i) {
		return anInt4969 * -1167108163 >= 10;
	}

	Class523_Sub27_Sub14_Sub3 method7295(byte i) {
		return method7305(255, 255, (byte) 0, true, 0, 0, -894907498);
	}

	public Class452(String string, int i, int i_0_) {
		anExecutorService4966 = Executors.newFixedThreadPool(2);
		aBool4974 = false;
		aString4972 = string;
		anInt4967 = 356277559 * i;
		anInt4965 = -587073295 * i_0_;
	}

	void method7296(boolean bool, int i) {
		aBool4974 = bool;
	}

	public void method7297(int i) {
		anExecutorService4966.shutdown();
	}

	Class523_Sub27_Sub14_Sub3 method7298(int i, int i_1_, byte i_2_, boolean bool, int i_3_, int i_4_) {
		if (i < 0 || i_1_ < 0)
			throw new RuntimeException(new StringBuilder().append(i).append(",").append(i_1_).toString());
		if (method7294((byte) 43))
			return null;
		boolean bool_5_ = i == 255 && 255 == i_1_;
		if (!aBool4974 && !bool_5_)
			return null;
		if (10000L + aLong4970 * -8564360591818690391L >= Class248.method4401(1516375036))
			return null;
		Object object = null;
		String string;
		if (bool_5_)
			string = new StringBuilder().append("&cb=").append(Class248.method4401(1516375036)).toString();
		else
			string = new StringBuilder().append("&c=").append(i_3_).append("&v=").append(i_4_).toString();
		URL url;
		try {
			url = new URL("http", aString4972, 1834477703 * anInt4967, new StringBuilder().append("/ms?m=").append(anInt4965 * 1560672273).append("&a=").append(i).append("&g=").append(i_1_).append(string).toString());
			System.out.println(url.toString());
		} catch (MalformedURLException malformedurlexception) {
			return null;
		}
		Class523_Sub27_Sub14_Sub3 class523_sub27_sub14_sub3 = new Class523_Sub27_Sub14_Sub3(i_2_);
		class523_sub27_sub14_sub3.aBool11746 = bool;
		anInt4969 += -1924850795;
		Future future = anExecutorService4966.submit(new Class459(this, url, class523_sub27_sub14_sub3));
		class523_sub27_sub14_sub3.method18616(future, 1708688529);
		return class523_sub27_sub14_sub3;
	}

	void method7299() {
		anInt4969 -= -1924850795;
	}

	boolean method7300() {
		return anInt4969 * -1167108163 >= 10;
	}

	void method7301(boolean bool) {
		aBool4974 = bool;
	}

	Class523_Sub27_Sub14_Sub3 method7302(int i, int i_6_, byte i_7_, boolean bool, int i_8_, int i_9_) {
		if (i < 0 || i_6_ < 0)
			throw new RuntimeException(new StringBuilder().append(i).append(",").append(i_6_).toString());
		if (method7294((byte) 16))
			return null;
		boolean bool_10_ = i == 255 && 255 == i_6_;
		if (!aBool4974 && !bool_10_)
			return null;
		if (10000L + aLong4970 * -8564360591818690391L >= Class248.method4401(1516375036))
			return null;
		Object object = null;
		String string;
		if (bool_10_)
			string = new StringBuilder().append("&cb=").append(Class248.method4401(1516375036)).toString();
		else
			string = new StringBuilder().append("&c=").append(i_8_).append("&v=").append(i_9_).toString();
		URL url;
		try {
			url = new URL("http", aString4972, 1834477703 * anInt4967, new StringBuilder().append("/ms?m=").append(anInt4965 * 1560672273).append("&a=").append(i).append("&g=").append(i_6_).append(string).toString());
		} catch (MalformedURLException malformedurlexception) {
			return null;
		}
		Class523_Sub27_Sub14_Sub3 class523_sub27_sub14_sub3 = new Class523_Sub27_Sub14_Sub3(i_7_);
		class523_sub27_sub14_sub3.aBool11746 = bool;
		anInt4969 += -1924850795;
		Future future = anExecutorService4966.submit(new Class459(this, url, class523_sub27_sub14_sub3));
		class523_sub27_sub14_sub3.method18616(future, 1806224321);
		return class523_sub27_sub14_sub3;
	}

	void method7303() {
		anInt4969 -= -1924850795;
	}

	void method7304(int i) {
		anInt4969 -= -1924850795;
	}

	Class523_Sub27_Sub14_Sub3 method7305(int i, int i_11_, byte i_12_, boolean bool, int i_13_, int i_14_, int i_15_) {
		if (i < 0 || i_11_ < 0)
			throw new RuntimeException(new StringBuilder().append(i).append(",").append(i_11_).toString());
		if (method7294((byte) 95))
			return null;
		boolean bool_16_ = i == 255 && 255 == i_11_;
		if (!aBool4974 && !bool_16_)
			return null;
		if (10000L + aLong4970 * -8564360591818690391L >= Class248.method4401(1516375036))
			return null;
		Object object = null;
		String string;
		if (bool_16_)
			string = new StringBuilder().append("&cb=").append(Class248.method4401(1516375036)).toString();
		else
			string = new StringBuilder().append("&c=").append(i_13_).append("&v=").append(i_14_).toString();
		URL url;
		try {
			url = new URL("http", aString4972, 1834477703 * anInt4967, new StringBuilder().append("/ms?m=").append(anInt4965 * 1560672273).append("&a=").append(i).append("&g=").append(i_11_).append(string).toString());
		} catch (MalformedURLException malformedurlexception) {
			return null;
		}
		Class523_Sub27_Sub14_Sub3 class523_sub27_sub14_sub3 = new Class523_Sub27_Sub14_Sub3(i_12_);
		class523_sub27_sub14_sub3.aBool11746 = bool;
		anInt4969 += -1924850795;
		Future future = anExecutorService4966.submit(new Class459(this, url, class523_sub27_sub14_sub3));
		class523_sub27_sub14_sub3.method18616(future, 1278142478);
		return class523_sub27_sub14_sub3;
	}

	public void method7306() {
		anExecutorService4966.shutdown();
	}

	public void method7307() {
		anExecutorService4966.shutdown();
	}

	public void method7308() {
		anExecutorService4966.shutdown();
	}

	boolean method7309() {
		return anInt4969 * -1167108163 >= 10;
	}

	static final void method7310(Class669 class669, byte i) {
		if (0 == client.anInt11136 * -2020118759)
			Class6.aBool41 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1;
	}

	static final void method7311(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method7312(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_17_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_18_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		Class553.method9164(3, i_17_, i_18_, "", 2001348962);
	}

	public static Class75 method7313(int i, int i_19_) {
		Class75[] class75s = Class638.method10515((byte) -122);
		Class75[] class75s_20_ = class75s;
		for (int i_21_ = 0; i_21_ < class75s_20_.length; i_21_++) {
			Class75 class75 = class75s_20_[i_21_];
			if (i == class75.anInt837 * -1157772725)
				return class75;
		}
		return null;
	}

	public static Class148 method7314(Class472 class472, int i, byte i_22_) {
		Class148 class148 = (Class148) Class301.aClass209_3323.method3767((long) i);
		if (class148 == null) {
			if (Class308.aBool3363)
				class148 = Class31.aClass178_303.method3104(Class166.method2659(class472, i), true);
			else
				class148 = Class173.method2909(class472.method7721(i, -387132909), (byte) -128);
			Class301.aClass209_3323.method3770(class148, (long) i);
		}
		return class148;
	}

	static final void method7315(byte i) {
		if (client.aFloat11214 < 1093.0F)
			client.aFloat11214 = 1093.0F;
		if (client.aFloat11214 > 2971.0F)
			client.aFloat11214 = 2971.0F;
		for (/**/; client.aFloat11129 >= 16384.0F; client.aFloat11129 -= 16384.0F) {
			/* empty */
		}
		for (/**/; client.aFloat11129 < 0.0F; client.aFloat11129 += 16384.0F) {
			/* empty */
		}
		Class451 class451 = client.aClass505_11019.method8243(1116513280);
		Class560 class560 = client.aClass505_11019.method8241((byte) -79);
		int i_23_ = 1996014845 * Class21.anInt215 >> 9;
		int i_24_ = Class194_Sub8.anInt9906 * 1035887883 >> 9;
		int i_25_ = Class53_Sub17.method17220(Class21.anInt215 * 1996014845, 1035887883 * Class194_Sub8.anInt9906, -860310981 * Class222.anInt2334, 240164268);
		int i_26_ = 0;
		if (i_23_ > 3 && i_24_ > 3 && i_23_ < client.aClass505_11019.method8292((byte) 120) - 4 && i_24_ < client.aClass505_11019.method8235(2057805067) - 4) {
			for (int i_27_ = i_23_ - 4; i_27_ <= 4 + i_23_; i_27_++) {
				for (int i_28_ = i_24_ - 4; i_28_ <= i_24_ + 4; i_28_++) {
					int i_29_ = -860310981 * Class222.anInt2334;
					if (i_29_ < 3 && class451.method7282(i_27_, i_28_, -638715901))
						i_29_++;
					int i_30_ = 0;
					byte[][] is = client.aClass505_11019.method8308(i_29_, 477598394);
					if (null != is)
						i_30_ = 8 * (is[i_27_][i_28_] & 0xff) << 2;
					if (null != class560.aClass142Array7509 && null != class560.aClass142Array7509[i_29_]) {
						int i_31_ = (i_25_ - (class560.aClass142Array7509[i_29_].method2321(i_27_, i_28_, 1949902974) - i_30_));
						if (i_31_ > i_26_)
							i_26_ = i_31_;
					}
				}
			}
		}
		int i_32_ = 1536 * (i_26_ >> 2);
		if (i_32_ > 786432)
			i_32_ = 786432;
		if (i_32_ < 262144)
			i_32_ = 262144;
		if (i_32_ > client.anInt11199 * 1020478063)
			client.anInt11199 += (i_32_ - 1020478063 * client.anInt11199) / 24 * 1589795983;
		else if (i_32_ < 1020478063 * client.anInt11199)
			client.anInt11199 += 1589795983 * ((i_32_ - 1020478063 * client.anInt11199) / 80);
	}
}
