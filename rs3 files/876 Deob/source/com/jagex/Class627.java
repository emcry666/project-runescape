/* Class627 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class627 {
	Class209 aClass209_8180;
	long aLong8181;
	float aFloat8182;
	static int anInt8183;
	boolean aBool8184;
	Class632[][] aClass632ArrayArray8185;
	static Class185 aClass185_8186;
	int anInt8187;
	boolean aBool8188;
	int anInt8189 = 0;
	Class632 aClass632_8190;
	Class178 aClass178_8191;
	Class632 aClass632_8192;
	Class632 aClass632_8193;
	Class632 aClass632_8194;
	Class654 aClass654_8195;
	Class437 aClass437_8196;
	Class209 aClass209_8197;
	public static int anInt8198 = -1190790947;
	Class209 aClass209_8199;
	Class472 aClass472_8200;
	static Class504 aClass504_8201;
	int[] anIntArray8202;
	float[] aFloatArray8203;
	boolean aBool8204;
	float aFloat8205;
	float aFloat8206;
	float aFloat8207;
	Class632 aClass632_8208;
	float aFloat8209;

	public void method10233(int i, int i_0_, Class632 class632, byte i_1_) {
		aClass632ArrayArray8185[i][i_0_] = class632;
	}

	public void method10234(Class505 class505, int i) {
		Class632 class632 = method10247(class505, (byte) -57);
		if (aClass654_8195 != null) {
			aClass632_8194.method10349(class632, 1054079783);
			aClass632_8194.method10357(this, aClass654_8195, 35051);
			method10305(aClass632_8194, aClass654_8195.method10677(1616892831), -1415267832);
		} else
			method10305(class632, anInt8183 * -242875077, 408703164);
		method10263(-1944335215);
		method10250(-1927862543);
		method10276((byte) 0);
	}

	void method10235() {
		if (aClass178_8191.method3029()) {
			Class165 class165 = null;
			Class165 class165_2_ = null;
			Class165 class165_3_ = null;
			if (aBool8184) {
				if (anIntArray8202[0] > -1)
					class165 = method10246(anIntArray8202[0], 1338166832);
				if (anIntArray8202[1] > -1)
					class165_2_ = method10246(anIntArray8202[1], 2096318312);
				if (anIntArray8202[2] > -1)
					class165_3_ = method10246(anIntArray8202[2], 1506541984);
				aClass178_8191.method3148(class165, aFloatArray8203[0], class165_2_, aFloatArray8203[1], class165_3_, aFloatArray8203[2]);
			} else {
				if (aClass632_8208.anIntArray8252[0] > -1)
					class165 = method10246(aClass632_8208.anIntArray8252[0], 1369316776);
				if (aClass632_8208.anIntArray8252[1] > -1)
					class165_2_ = method10246(aClass632_8208.anIntArray8252[1], 910172443);
				if (aClass632_8208.anIntArray8252[2] > -1)
					class165_3_ = method10246(aClass632_8208.anIntArray8252[2], 902410508);
				aClass178_8191.method3148(class165, aClass632_8208.aFloatArray8259[0], class165_2_, aClass632_8208.aFloatArray8259[1], class165_3_, aClass632_8208.aFloatArray8259[2]);
			}
		}
	}

	public void method10236(Class505 class505, Class654 class654, int i, int i_4_) {
		aClass654_8195 = class654;
		Class632 class632 = method10247(class505, (byte) 69);
		if (null != aClass654_8195) {
			if (null == aClass632_8194)
				aClass632_8194 = new Class632();
			aClass632_8194.method10349(class632, 1054079783);
			aClass632_8194.method10357(this, aClass654_8195, 35051);
			method10305(aClass632_8194, i, -1476987359);
		} else {
			method10305(class632, i, 284443791);
			aClass632_8194 = null;
		}
	}

	public Class654 method10237(byte i) {
		return aClass654_8195;
	}

	public Class632 method10238(byte i) {
		return aClass632_8208;
	}

	Class185 method10239(int i) {
		Class185 class185 = (Class185) aClass209_8197.method3767((long) i);
		if (class185 != null)
			return class185;
		class185 = aClass178_8191.method3133(i);
		aClass209_8197.method3770(class185, (long) i);
		return class185;
	}

	public void method10240(int i) {
		aClass209_8197.method3773(-1982175291);
		aClass209_8180.method3773(-1982374939);
		aClass209_8199.method3773(-2025290359);
	}

	Class185 method10241(int i, byte i_5_) {
		Class185 class185 = (Class185) aClass209_8197.method3767((long) i);
		if (class185 != null)
			return class185;
		class185 = aClass178_8191.method3133(i);
		aClass209_8197.method3770(class185, (long) i);
		return class185;
	}

	Class504 method10242(int i, int i_6_, int i_7_, int i_8_, byte i_9_) {
		long l = (((long) i_6_ & 0xffffL) << 48 | ((long) i_7_ & 0xffffL) << 32 | ((long) i_8_ & 0xffffL) << 16 | (long) i & 0xffffL);
		Class504 class504 = (Class504) aClass209_8180.method3767(l);
		if (null == class504) {
			class504 = Class532.method8787(i, i_6_, i_7_, i_8_, Class380.aClass53_Sub11_3937, Class326_Sub2.aClass53_Sub10_10063, 1878979887);
			aClass209_8180.method3770(class504, l);
		}
		return class504;
	}

	Class185 method10243(int i) {
		Class185 class185 = (Class185) aClass209_8197.method3767((long) i);
		if (class185 != null)
			return class185;
		class185 = aClass178_8191.method3133(i);
		aClass209_8197.method3770(class185, (long) i);
		return class185;
	}

	public void method10244(Class505 class505, int i) {
		Class632 class632 = method10247(class505, (byte) 2);
		if (null != aClass654_8195) {
			aClass632_8194.method10349(class632, 1054079783);
			aClass632_8194.method10357(this, aClass654_8195, 35051);
			method10305(aClass632_8194, aClass654_8195.method10677(1616892831), -1284481183);
		} else
			method10305(class632, anInt8183 * -242875077, 766120849);
		method10263(-1944335215);
		method10269((short) 5557);
		method10262(-1781868763);
		method10256(-1816681436);
	}

	public void method10245(int i) {
		for (int i_10_ = 0; i_10_ < aClass632ArrayArray8185.length; i_10_++) {
			for (int i_11_ = 0; i_11_ < aClass632ArrayArray8185[i_10_].length; i_11_++)
				aClass632ArrayArray8185[i_10_][i_11_] = aClass632_8190;
		}
	}

	Class165 method10246(int i, int i_12_) {
		Class165 class165 = (Class165) aClass209_8199.method3767((long) i);
		if (null != class165)
			return class165;
		Class175 class175 = Class166.method2659(aClass472_8200, i);
		if (class175 != null && class175.method2944() == 256 && class175.method2945() == 16) {
			int[] is = class175.method2959(false);
			class165 = aClass178_8191.method3141(is);
			if (null != class165)
				aClass209_8199.method3770(class165, (long) i);
		}
		return class165;
	}

	Class632 method10247(Class505 class505, byte i) {
		Object object = null;
		int i_13_ = -1;
		int i_14_ = -1;
		if (Class616.method10074(client.anInt11136 * -2020118759, (byte) -15) || Class691.method13965(client.anInt11136 * -2020118759, (byte) -10)) {
			i_13_ = Class77.anInt858 * 760427037 >> 12;
			i_14_ = Class497.anInt5563 * -1221225203 >> 12;
		} else {
			if (Class241.player != null) {
				i_13_ = (Class241.player.screenX[0]) >> 3;
				i_14_ = (Class241.player.screenY[0]) >> 3;
			}
			if (i_13_ < 0 || i_13_ >= class505.method8292((byte) 17) >> 3 || i_14_ < 0 || i_14_ >= class505.method8235(2112883936) >> 3) {
				i_13_ = class505.method8292((byte) 103) >> 4;
				i_14_ = class505.method8235(2104607976) >> 4;
			}
		}
		Class632 class632 = aClass632ArrayArray8185[i_13_][i_14_];
		if (class632 == null)
			class632 = aClass632_8190;
		return class632;
	}

	public Class627(Class178 class178, Class472 class472, int i, int i_15_) {
		anInt8187 = 290442931;
		aLong8181 = 0L;
		aBool8188 = false;
		aClass437_8196 = new Class437(-50.0F, -60.0F, -50.0F);
		aClass209_8197 = new Class209(8);
		aClass209_8180 = new Class209(8);
		aClass209_8199 = new Class209(8);
		aBool8184 = false;
		anIntArray8202 = new int[] { -1, -1, -1 };
		aFloatArray8203 = new float[] { 0.0F, 0.0F, 0.0F };
		aBool8204 = false;
		aClass178_8191 = class178;
		aClass472_8200 = class472;
		aClass632ArrayArray8185 = new Class632[i][i_15_];
		if (anInt8198 * -541368181 != -1)
			aClass185_8186 = method10241(anInt8198 * -541368181, (byte) -72);
		aClass504_8201 = null;
		aClass632_8190 = new Class632();
		aClass632_8208 = new Class632();
		aClass632_8192 = new Class632();
		aClass632_8193 = new Class632();
		method10249(1399369970);
		method10257((byte) 2);
		method10254((byte) -107);
	}

	Class185 method10248(int i) {
		Class185 class185 = (Class185) aClass209_8197.method3767((long) i);
		if (class185 != null)
			return class185;
		class185 = aClass178_8191.method3133(i);
		aClass209_8197.method3770(class185, (long) i);
		return class185;
	}

	public void method10249(int i) {
		aBool8188 = true;
	}

	void method10250(int i) {
		aClass178_8191.method3126((0.7F + ((float) Class449.aClass523_Sub33_4946.aClass687_Sub18_10609.method16899(1887773681) * 0.1F) + client.aClass505_11019.method8238((byte) 68)) * aClass632_8208.aFloat8241);
		aClass178_8191.method3460(aClass632_8208.anInt8258 * 1248942493, aClass632_8208.aFloat8243, aClass632_8208.aFloat8244, (float) ((int) aClass437_8196.aFloat4903 << 2), (float) ((int) aClass437_8196.aFloat4904 << 2), (float) ((int) aClass437_8196.aFloat4905 << 2));
		aClass178_8191.method3135(aClass632_8208.aClass185_8248);
	}

	Class185 method10251(int i) {
		Class185 class185 = (Class185) aClass209_8197.method3767((long) i);
		if (class185 != null)
			return class185;
		class185 = aClass178_8191.method3133(i);
		aClass209_8197.method3770(class185, (long) i);
		return class185;
	}

	public void method10252(float f, float f_16_, float f_17_, int i, int i_18_, int i_19_, int i_20_, int i_21_, byte i_22_) {
		aClass178_8191.method3126((0.7F + ((float) Class449.aClass523_Sub33_4946.aClass687_Sub18_10609.method16899(1490985961) * 0.1F) + client.aClass505_11019.method8238((byte) 76)) * f);
		aClass178_8191.method3460(i, f_16_, f_17_, (float) (i_18_ << 2), (float) (i_19_ << 2), (float) (i_20_ << 2));
		aClass178_8191.method3135(method10241(i_21_, (byte) -17));
	}

	public void method10253(Class505 class505, Class654 class654, int i) {
		aClass654_8195 = class654;
		Class632 class632 = method10247(class505, (byte) -33);
		if (null != aClass654_8195) {
			if (null == aClass632_8194)
				aClass632_8194 = new Class632();
			aClass632_8194.method10349(class632, 1054079783);
			aClass632_8194.method10357(this, aClass654_8195, 35051);
			method10305(aClass632_8194, i, 675562281);
		} else {
			method10305(class632, i, -1877197224);
			aClass632_8194 = null;
		}
	}

	void method10254(byte i) {
		aBool8204 = false;
		aFloat8205 = 1.0F;
		aFloat8206 = 0.0F;
		aFloat8207 = 1.0F;
		aFloat8182 = 0.0F;
		aFloat8209 = 1.0F;
	}

	void method10255(Class632 class632, int i) {
		if (aBool8188) {
			aBool8188 = false;
			i = 0;
		}
		if (!aClass632_8193.method10356(class632, (byte) -27)) {
			aClass632_8193.method10349(class632, 1054079783);
			aLong8181 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -4397476594842451547L;
			anInt8189 = (anInt8187 = i * -290442931) * 1343106415;
			if (-623189941 * anInt8189 != 0) {
				aClass632_8192.method10349(aClass632_8208, 1054079783);
				if (null != aClass632_8208.aClass504_8255) {
					if (aClass632_8208.aClass504_8255.method8213(-1653830856))
						aClass632_8208.aClass504_8255 = aClass632_8192.aClass504_8255 = aClass632_8208.aClass504_8255.method8187((short) 1137);
					if (aClass632_8208.aClass504_8255 != null && (aClass632_8208.aClass504_8255 != aClass632_8193.aClass504_8255))
						aClass632_8208.aClass504_8255.method8205(aClass632_8193.aClass504_8255, -884961381);
				}
			}
		}
	}

	void method10256(int i) {
		if (aClass178_8191.method3029()) {
			Class165 class165 = null;
			Class165 class165_23_ = null;
			Class165 class165_24_ = null;
			if (aBool8184) {
				if (anIntArray8202[0] > -1)
					class165 = method10246(anIntArray8202[0], 1851719014);
				if (anIntArray8202[1] > -1)
					class165_23_ = method10246(anIntArray8202[1], 1677855457);
				if (anIntArray8202[2] > -1)
					class165_24_ = method10246(anIntArray8202[2], 2034376258);
				aClass178_8191.method3148(class165, aFloatArray8203[0], class165_23_, aFloatArray8203[1], class165_24_, aFloatArray8203[2]);
			} else {
				if (aClass632_8208.anIntArray8252[0] > -1)
					class165 = method10246(aClass632_8208.anIntArray8252[0], 1778781146);
				if (aClass632_8208.anIntArray8252[1] > -1)
					class165_23_ = method10246(aClass632_8208.anIntArray8252[1], 1398024408);
				if (aClass632_8208.anIntArray8252[2] > -1)
					class165_24_ = method10246(aClass632_8208.anIntArray8252[2], 1131614389);
				aClass178_8191.method3148(class165, aClass632_8208.aFloatArray8259[0], class165_23_, aClass632_8208.aFloatArray8259[1], class165_24_, aClass632_8208.aFloatArray8259[2]);
			}
		}
	}

	void method10257(byte i) {
		aBool8184 = false;
		int[] is = anIntArray8202;
		int[] is_25_ = anIntArray8202;
		anIntArray8202[2] = -1;
		is_25_[1] = -1;
		is[0] = -1;
		float[] fs = aFloatArray8203;
		float[] fs_26_ = aFloatArray8203;
		aFloatArray8203[2] = 0.0F;
		fs_26_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	public void method10258(int i) {
		aClass178_8191.method3126((0.7F + ((float) Class449.aClass523_Sub33_4946.aClass687_Sub18_10609.method16899(-740035976) * 0.1F) + client.aClass505_11019.method8238((byte) -69)) * 1.1523438F);
		aClass178_8191.method3460(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		aClass178_8191.method3349(13156520, -1, 0);
		aClass178_8191.method3135(aClass185_8186);
	}

	static {
		anInt8183 = -243003275;
	}

	public void method10259(Class505 class505) {
		Class632 class632 = method10247(class505, (byte) 37);
		if (aClass654_8195 != null) {
			aClass632_8194.method10349(class632, 1054079783);
			aClass632_8194.method10357(this, aClass654_8195, 35051);
			method10305(aClass632_8194, aClass654_8195.method10677(1616892831), 1585759912);
		} else
			method10305(class632, anInt8183 * -242875077, -636599263);
		method10263(-1944335215);
		method10250(-1849691406);
		method10276((byte) 0);
	}

	public void method10260(Class505 class505) {
		Class632 class632 = method10247(class505, (byte) -3);
		if (null != aClass654_8195) {
			aClass632_8194.method10349(class632, 1054079783);
			aClass632_8194.method10357(this, aClass654_8195, 35051);
			method10305(aClass632_8194, aClass654_8195.method10677(1616892831), -449415508);
		} else
			method10305(class632, anInt8183 * -242875077, -1488505295);
		method10263(-1944335215);
		method10269((short) -8879);
		method10262(-1781868763);
		method10256(-2081684767);
	}

	public void method10261(Class505 class505, Class654 class654, int i) {
		aClass654_8195 = class654;
		Class632 class632 = method10247(class505, (byte) 16);
		if (null != aClass654_8195) {
			if (null == aClass632_8194)
				aClass632_8194 = new Class632();
			aClass632_8194.method10349(class632, 1054079783);
			aClass632_8194.method10357(this, aClass654_8195, 35051);
			method10305(aClass632_8194, i, -856758834);
		} else {
			method10305(class632, i, -2082531014);
			aClass632_8194 = null;
		}
	}

	void method10262(int i) {
		if (aClass178_8191.method3139()) {
			if (aBool8204)
				aClass178_8191.method3398(aFloat8205, aFloat8206, aFloat8207, aFloat8182, aFloat8209);
			else
				aClass178_8191.method3398(aClass632_8208.aFloat8253, aClass632_8208.aFloat8254, aClass632_8208.aFloat8246, aClass632_8208.aFloat8256, aClass632_8208.aFloat8257);
		}
	}

	void method10263(int i) {
		if (309227397 * anInt8187 >= 0) {
			long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
			anInt8187 -= (l - aLong8181 * 7353493511396310573L) * -290442931L;
			if (309227397 * anInt8187 > 0)
				aClass632_8208.method10350(aClass178_8191, aClass632_8192, aClass632_8193, ((float) (-623189941 * anInt8189 - 309227397 * anInt8187) / (float) (-623189941 * anInt8189)), 1794714147);
			else {
				aClass632_8208.method10349(aClass632_8193, 1054079783);
				if (aClass632_8208.aClass504_8255 != null)
					aClass632_8208.aClass504_8255.method8185(-1366997638);
				anInt8187 = 290442931;
			}
			aLong8181 = -4397476594842451547L * l;
		}
	}

	public Class654 method10264() {
		return aClass654_8195;
	}

	public Class654 method10265() {
		return aClass654_8195;
	}

	public Class632 method10266() {
		return aClass632_8208;
	}

	public void method10267(Class627 class627_27_) {
		aClass632_8208.method10349(class627_27_.aClass632_8208, 1054079783);
		aClass632_8192.method10349(class627_27_.aClass632_8192, 1054079783);
		aClass632_8193.method10349(class627_27_.aClass632_8193, 1054079783);
		aLong8181 = 1L * class627_27_.aLong8181;
		anInt8189 = 1 * class627_27_.anInt8189;
		anInt8187 = 1 * class627_27_.anInt8187;
	}

	Class632 method10268(Class505 class505) {
		Object object = null;
		int i = -1;
		int i_28_ = -1;
		if (Class616.method10074(client.anInt11136 * -2020118759, (byte) 118) || Class691.method13965(client.anInt11136 * -2020118759, (byte) 65)) {
			i = Class77.anInt858 * 760427037 >> 12;
			i_28_ = Class497.anInt5563 * -1221225203 >> 12;
		} else {
			if (Class241.player != null) {
				i = (Class241.player.screenX[0]) >> 3;
				i_28_ = (Class241.player.screenY[0]) >> 3;
			}
			if (i < 0 || i >= class505.method8292((byte) 121) >> 3 || i_28_ < 0 || i_28_ >= class505.method8235(2118065050) >> 3) {
				i = class505.method8292((byte) 2) >> 4;
				i_28_ = class505.method8235(2090333402) >> 4;
			}
		}
		Class632 class632 = aClass632ArrayArray8185[i][i_28_];
		if (class632 == null)
			class632 = aClass632_8190;
		return class632;
	}

	void method10269(short i) {
		aClass178_8191.method3147(aClass632_8208.aFloat8251, aClass632_8208.aFloat8249, aClass632_8208.aFloat8250, (byte) 3);
	}

	public void method10270(Class627 class627_29_, int i) {
		aClass632_8208.method10349(class627_29_.aClass632_8208, 1054079783);
		aClass632_8192.method10349(class627_29_.aClass632_8192, 1054079783);
		aClass632_8193.method10349(class627_29_.aClass632_8193, 1054079783);
		aLong8181 = 1L * class627_29_.aLong8181;
		anInt8189 = 1 * class627_29_.anInt8189;
		anInt8187 = 1 * class627_29_.anInt8187;
	}

	public void method10271() {
		aBool8188 = true;
	}

	Class185 method10272(int i) {
		Class185 class185 = (Class185) aClass209_8197.method3767((long) i);
		if (class185 != null)
			return class185;
		class185 = aClass178_8191.method3133(i);
		aClass209_8197.method3770(class185, (long) i);
		return class185;
	}

	public void method10273(int i, int i_30_, int i_31_) {
		Class632 class632 = aClass632ArrayArray8185[i][i_30_];
		if (null != class632)
			aClass437_8196.method6886(class632.aClass437_8245);
		method10250(-1775388354);
	}

	public void method10274(float f, float f_32_, float f_33_, int i, int i_34_, int i_35_, int i_36_, int i_37_) {
		aClass178_8191.method3126((0.7F + ((float) Class449.aClass523_Sub33_4946.aClass687_Sub18_10609.method16899(1076862290) * 0.1F) + client.aClass505_11019.method8238((byte) -44)) * f);
		aClass178_8191.method3460(i, f_32_, f_33_, (float) (i_34_ << 2), (float) (i_35_ << 2), (float) (i_36_ << 2));
		aClass178_8191.method3135(method10241(i_37_, (byte) 68));
	}

	public void method10275(int i, int i_38_, Class632 class632) {
		aClass632ArrayArray8185[i][i_38_] = class632;
	}

	public void method10276(byte i) {
		int i_39_ = 0;
		int i_40_ = i_39_ + (1112964251 * aClass632_8208.anInt8242 + 256 << 2);
		aClass178_8191.method3349(aClass632_8208.anInt8247 * -1195996065, (Class449.aClass523_Sub33_4946.aClass687_Sub14_10598.method16864((short) -5638) == 1 ? i_40_ : -1), 0);
	}

	public void method10277(int i, int i_41_, Class632 class632) {
		aClass632ArrayArray8185[i][i_41_] = class632;
	}

	public void method10278(int i, int i_42_, Class632 class632) {
		aClass632ArrayArray8185[i][i_42_] = class632;
	}

	public void method10279(Class505 class505, Class654 class654, int i) {
		aClass654_8195 = class654;
		Class632 class632 = method10247(class505, (byte) -110);
		if (null != aClass654_8195) {
			if (null == aClass632_8194)
				aClass632_8194 = new Class632();
			aClass632_8194.method10349(class632, 1054079783);
			aClass632_8194.method10357(this, aClass654_8195, 35051);
			method10305(aClass632_8194, i, 419359709);
		} else {
			method10305(class632, i, -1257885096);
			aClass632_8194 = null;
		}
	}

	Class504 method10280(int i, int i_43_, int i_44_, int i_45_) {
		long l = (((long) i_43_ & 0xffffL) << 48 | ((long) i_44_ & 0xffffL) << 32 | ((long) i_45_ & 0xffffL) << 16 | (long) i & 0xffffL);
		Class504 class504 = (Class504) aClass209_8180.method3767(l);
		if (null == class504) {
			class504 = Class532.method8787(i, i_43_, i_44_, i_45_, Class380.aClass53_Sub11_3937, Class326_Sub2.aClass53_Sub10_10063, 2139373318);
			aClass209_8180.method3770(class504, l);
		}
		return class504;
	}

	public void method10281(int i, int i_46_) {
		Class632 class632 = aClass632ArrayArray8185[i][i_46_];
		if (null != class632)
			aClass437_8196.method6886(class632.aClass437_8245);
		method10250(-2121099845);
	}

	public void method10282(int i, int i_47_) {
		Class632 class632 = aClass632ArrayArray8185[i][i_47_];
		if (null != class632)
			aClass437_8196.method6886(class632.aClass437_8245);
		method10250(-2135850274);
	}

	public void method10283(int i, int i_48_) {
		Class632 class632 = aClass632ArrayArray8185[i][i_48_];
		if (null != class632)
			aClass437_8196.method6886(class632.aClass437_8245);
		method10250(-2045347915);
	}

	public void method10284(int i, int i_49_) {
		Class632 class632 = aClass632ArrayArray8185[i][i_49_];
		if (null != class632)
			aClass437_8196.method6886(class632.aClass437_8245);
		method10250(-1896959946);
	}

	public void method10285() {
		for (int i = 0; i < aClass632ArrayArray8185.length; i++) {
			for (int i_50_ = 0; i_50_ < aClass632ArrayArray8185[i].length; i_50_++)
				aClass632ArrayArray8185[i][i_50_] = aClass632_8190;
		}
	}

	void method10286(Class632 class632, int i) {
		if (aBool8188) {
			aBool8188 = false;
			i = 0;
		}
		if (!aClass632_8193.method10356(class632, (byte) -127)) {
			aClass632_8193.method10349(class632, 1054079783);
			aLong8181 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -4397476594842451547L;
			anInt8189 = (anInt8187 = i * -290442931) * 1343106415;
			if (-623189941 * anInt8189 != 0) {
				aClass632_8192.method10349(aClass632_8208, 1054079783);
				if (null != aClass632_8208.aClass504_8255) {
					if (aClass632_8208.aClass504_8255.method8213(-1789970390))
						aClass632_8208.aClass504_8255 = aClass632_8192.aClass504_8255 = aClass632_8208.aClass504_8255.method8187((short) 1137);
					if (aClass632_8208.aClass504_8255 != null && (aClass632_8208.aClass504_8255 != aClass632_8193.aClass504_8255))
						aClass632_8208.aClass504_8255.method8205(aClass632_8193.aClass504_8255, -1957300764);
				}
			}
		}
	}

	public void method10287() {
		aClass178_8191.method3126((0.7F + ((float) Class449.aClass523_Sub33_4946.aClass687_Sub18_10609.method16899(-1919364567) * 0.1F) + client.aClass505_11019.method8238((byte) -117)) * 1.1523438F);
		aClass178_8191.method3460(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		aClass178_8191.method3349(13156520, -1, 0);
		aClass178_8191.method3135(aClass185_8186);
	}

	void method10288(Class632 class632, int i) {
		if (aBool8188) {
			aBool8188 = false;
			i = 0;
		}
		if (!aClass632_8193.method10356(class632, (byte) -99)) {
			aClass632_8193.method10349(class632, 1054079783);
			aLong8181 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -4397476594842451547L;
			anInt8189 = (anInt8187 = i * -290442931) * 1343106415;
			if (-623189941 * anInt8189 != 0) {
				aClass632_8192.method10349(aClass632_8208, 1054079783);
				if (null != aClass632_8208.aClass504_8255) {
					if (aClass632_8208.aClass504_8255.method8213(-1940455433))
						aClass632_8208.aClass504_8255 = aClass632_8192.aClass504_8255 = aClass632_8208.aClass504_8255.method8187((short) 1137);
					if (aClass632_8208.aClass504_8255 != null && (aClass632_8208.aClass504_8255 != aClass632_8193.aClass504_8255))
						aClass632_8208.aClass504_8255.method8205(aClass632_8193.aClass504_8255, 1723381488);
				}
			}
		}
	}

	void method10289() {
		if (309227397 * anInt8187 >= 0) {
			long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
			anInt8187 -= (l - aLong8181 * 7353493511396310573L) * -290442931L;
			if (309227397 * anInt8187 > 0)
				aClass632_8208.method10350(aClass178_8191, aClass632_8192, aClass632_8193, ((float) (-623189941 * anInt8189 - 309227397 * anInt8187) / (float) (-623189941 * anInt8189)), -1003582134);
			else {
				aClass632_8208.method10349(aClass632_8193, 1054079783);
				if (aClass632_8208.aClass504_8255 != null)
					aClass632_8208.aClass504_8255.method8185(-1366997638);
				anInt8187 = 290442931;
			}
			aLong8181 = -4397476594842451547L * l;
		}
	}

	void method10290() {
		if (309227397 * anInt8187 >= 0) {
			long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
			anInt8187 -= (l - aLong8181 * 7353493511396310573L) * -290442931L;
			if (309227397 * anInt8187 > 0)
				aClass632_8208.method10350(aClass178_8191, aClass632_8192, aClass632_8193, ((float) (-623189941 * anInt8189 - 309227397 * anInt8187) / (float) (-623189941 * anInt8189)), -325758216);
			else {
				aClass632_8208.method10349(aClass632_8193, 1054079783);
				if (aClass632_8208.aClass504_8255 != null)
					aClass632_8208.aClass504_8255.method8185(-1366997638);
				anInt8187 = 290442931;
			}
			aLong8181 = -4397476594842451547L * l;
		}
	}

	void method10291() {
		if (309227397 * anInt8187 >= 0) {
			long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
			anInt8187 -= (l - aLong8181 * 7353493511396310573L) * -290442931L;
			if (309227397 * anInt8187 > 0)
				aClass632_8208.method10350(aClass178_8191, aClass632_8192, aClass632_8193, ((float) (-623189941 * anInt8189 - 309227397 * anInt8187) / (float) (-623189941 * anInt8189)), -1474357189);
			else {
				aClass632_8208.method10349(aClass632_8193, 1054079783);
				if (aClass632_8208.aClass504_8255 != null)
					aClass632_8208.aClass504_8255.method8185(-1366997638);
				anInt8187 = 290442931;
			}
			aLong8181 = -4397476594842451547L * l;
		}
	}

	Class504 method10292(int i, int i_51_, int i_52_, int i_53_) {
		long l = (((long) i_51_ & 0xffffL) << 48 | ((long) i_52_ & 0xffffL) << 32 | ((long) i_53_ & 0xffffL) << 16 | (long) i & 0xffffL);
		Class504 class504 = (Class504) aClass209_8180.method3767(l);
		if (null == class504) {
			class504 = Class532.method8787(i, i_51_, i_52_, i_53_, Class380.aClass53_Sub11_3937, Class326_Sub2.aClass53_Sub10_10063, 2061780077);
			aClass209_8180.method3770(class504, l);
		}
		return class504;
	}

	public void method10293() {
		aBool8188 = true;
	}

	void method10294() {
		aClass178_8191.method3126((0.7F + ((float) Class449.aClass523_Sub33_4946.aClass687_Sub18_10609.method16899(-1481480018) * 0.1F) + client.aClass505_11019.method8238((byte) -52)) * aClass632_8208.aFloat8241);
		aClass178_8191.method3460(aClass632_8208.anInt8258 * 1248942493, aClass632_8208.aFloat8243, aClass632_8208.aFloat8244, (float) ((int) aClass437_8196.aFloat4903 << 2), (float) ((int) aClass437_8196.aFloat4904 << 2), (float) ((int) aClass437_8196.aFloat4905 << 2));
		aClass178_8191.method3135(aClass632_8208.aClass185_8248);
	}

	public void method10295(float f, float f_54_, float f_55_, int i, int i_56_, int i_57_, int i_58_, int i_59_) {
		aClass178_8191.method3126((0.7F + ((float) Class449.aClass523_Sub33_4946.aClass687_Sub18_10609.method16899(1615254566) * 0.1F) + client.aClass505_11019.method8238((byte) 35)) * f);
		aClass178_8191.method3460(i, f_54_, f_55_, (float) (i_56_ << 2), (float) (i_57_ << 2), (float) (i_58_ << 2));
		aClass178_8191.method3135(method10241(i_59_, (byte) 43));
	}

	public void method10296(float f, float f_60_, float f_61_, int i, int i_62_, int i_63_, int i_64_, int i_65_) {
		aClass178_8191.method3126((0.7F + ((float) Class449.aClass523_Sub33_4946.aClass687_Sub18_10609.method16899(-178226680) * 0.1F) + client.aClass505_11019.method8238((byte) -91)) * f);
		aClass178_8191.method3460(i, f_60_, f_61_, (float) (i_62_ << 2), (float) (i_63_ << 2), (float) (i_64_ << 2));
		aClass178_8191.method3135(method10241(i_65_, (byte) -20));
	}

	public void method10297(float f, float f_66_, float f_67_, int i, int i_68_, int i_69_, int i_70_, int i_71_) {
		aClass178_8191.method3126((0.7F + ((float) Class449.aClass523_Sub33_4946.aClass687_Sub18_10609.method16899(-1200956862) * 0.1F) + client.aClass505_11019.method8238((byte) 53)) * f);
		aClass178_8191.method3460(i, f_66_, f_67_, (float) (i_68_ << 2), (float) (i_69_ << 2), (float) (i_70_ << 2));
		aClass178_8191.method3135(method10241(i_71_, (byte) 79));
	}

	public void method10298(int i, int i_72_, Class632 class632) {
		aClass632ArrayArray8185[i][i_72_] = class632;
	}

	public void method10299() {
		int i = 0;
		int i_73_ = i + (1112964251 * aClass632_8208.anInt8242 + 256 << 2);
		aClass178_8191.method3349(aClass632_8208.anInt8247 * -1195996065, (Class449.aClass523_Sub33_4946.aClass687_Sub14_10598.method16864((short) -1111) == 1 ? i_73_ : -1), 0);
	}

	public void method10300() {
		int i = 0;
		int i_74_ = i + (1112964251 * aClass632_8208.anInt8242 + 256 << 2);
		aClass178_8191.method3349(aClass632_8208.anInt8247 * -1195996065, (Class449.aClass523_Sub33_4946.aClass687_Sub14_10598.method16864((short) -22038) == 1 ? i_74_ : -1), 0);
	}

	void method10301() {
		aClass178_8191.method3147(aClass632_8208.aFloat8251, aClass632_8208.aFloat8249, aClass632_8208.aFloat8250, (byte) 3);
	}

	void method10302() {
		aClass178_8191.method3147(aClass632_8208.aFloat8251, aClass632_8208.aFloat8249, aClass632_8208.aFloat8250, (byte) 3);
	}

	void method10303() {
		if (aClass178_8191.method3139()) {
			if (aBool8204)
				aClass178_8191.method3398(aFloat8205, aFloat8206, aFloat8207, aFloat8182, aFloat8209);
			else
				aClass178_8191.method3398(aClass632_8208.aFloat8253, aClass632_8208.aFloat8254, aClass632_8208.aFloat8246, aClass632_8208.aFloat8256, aClass632_8208.aFloat8257);
		}
	}

	void method10304() {
		if (aClass178_8191.method3139()) {
			if (aBool8204)
				aClass178_8191.method3398(aFloat8205, aFloat8206, aFloat8207, aFloat8182, aFloat8209);
			else
				aClass178_8191.method3398(aClass632_8208.aFloat8253, aClass632_8208.aFloat8254, aClass632_8208.aFloat8246, aClass632_8208.aFloat8256, aClass632_8208.aFloat8257);
		}
	}

	void method10305(Class632 class632, int i, int i_75_) {
		if (aBool8188) {
			aBool8188 = false;
			i = 0;
		}
		if (!aClass632_8193.method10356(class632, (byte) -118)) {
			aClass632_8193.method10349(class632, 1054079783);
			aLong8181 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -4397476594842451547L;
			anInt8189 = (anInt8187 = i * -290442931) * 1343106415;
			if (-623189941 * anInt8189 != 0) {
				aClass632_8192.method10349(aClass632_8208, 1054079783);
				if (null != aClass632_8208.aClass504_8255) {
					if (aClass632_8208.aClass504_8255.method8213(-262321802))
						aClass632_8208.aClass504_8255 = aClass632_8192.aClass504_8255 = aClass632_8208.aClass504_8255.method8187((short) 1137);
					if (aClass632_8208.aClass504_8255 != null && (aClass632_8208.aClass504_8255 != aClass632_8193.aClass504_8255))
						aClass632_8208.aClass504_8255.method8205(aClass632_8193.aClass504_8255, -1095007734);
				}
			}
		}
	}

	void method10306() {
		aBool8184 = false;
		int[] is = anIntArray8202;
		int[] is_76_ = anIntArray8202;
		anIntArray8202[2] = -1;
		is_76_[1] = -1;
		is[0] = -1;
		float[] fs = aFloatArray8203;
		float[] fs_77_ = aFloatArray8203;
		aFloatArray8203[2] = 0.0F;
		fs_77_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	public void method10307() {
		aClass178_8191.method3126((0.7F + ((float) Class449.aClass523_Sub33_4946.aClass687_Sub18_10609.method16899(-1194691699) * 0.1F) + client.aClass505_11019.method8238((byte) -21)) * 1.1523438F);
		aClass178_8191.method3460(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		aClass178_8191.method3349(13156520, -1, 0);
		aClass178_8191.method3135(aClass185_8186);
	}

	public void method10308() {
		for (int i = 0; i < aClass632ArrayArray8185.length; i++) {
			for (int i_78_ = 0; i_78_ < aClass632ArrayArray8185[i].length; i_78_++)
				aClass632ArrayArray8185[i][i_78_] = aClass632_8190;
		}
	}

	static final void method10309(InterfaceComponentDefinitions class250, Class669 class669, int i) {
		int i_79_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		int i_80_ = ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) - 1);
		int i_81_ = i_80_;
		if (-428962391 * class250.modelType != 6 && -428962391 * class250.modelType != 2)
			throw new RuntimeException("");
		NPCDefinition class300 = ((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition(-2080195333 * class250.anInt2571, (byte) 77));
		if (class250.aClass302_2553 == null)
			class250.aClass302_2553 = new Class302(class300, 6 == -428962391 * class250.modelType);
		class250.aClass302_2553.aLong3337 = Class547.method9086((byte) -31) * 1634705471692094829L;
		if (class300.aByteArray3280 != null) {
			if (i_80_ < 0 || i_80_ >= class300.aByteArray3280.length)
				throw new RuntimeException("");
			i_81_ = class300.aByteArray3280[i_80_];
		}
		if (null == class300.aShortArray3263 || i_81_ < 0 || i_81_ >= class300.aShortArray3263.length)
			throw new RuntimeException("");
		class250.aClass302_2553.aShortArray3333[i_81_] = (short) i_79_;
		Login.method15991(class250, (byte) -91);
	}

	static final void method10310(Class669 class669, int i) {
		int i_82_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub41_10626.method13890(i_82_, 2110488339);
	}
}
