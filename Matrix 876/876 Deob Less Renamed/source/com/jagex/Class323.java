/* Class323 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchTV;

public class Class323 implements Interface33 {
	Class164 aClass164_3446;
	Class472 aClass472_3447;
	Class472 aClass472_3448;
	Class382 aClass382_3449;
	long aLong3450 = 2435300774810256131L;
	int anInt3451;
	static TwitchTV aTwitchTV3452;

	public boolean method211() {
		boolean bool = true;
		if (!aClass472_3447.method7650(aClass382_3449.anInt3962 * 1104637541, -1642251357))
			bool = false;
		if (!aClass472_3448.method7650(aClass382_3449.anInt3962 * 1104637541, -310424702))
			bool = false;
		return bool;
	}

	public void method213(boolean bool, short i) {
		int i_0_ = (aClass382_3449.aClass380_3956.method6400(0, (client.anInt11036 * 1536768403), (short) 28029) + aClass382_3449.anInt3958 * 1522863683);
		int i_1_ = (aClass382_3449.aClass389_3957.method6473(0, -932988141 * client.anInt11151, 2146227393) + aClass382_3449.anInt3959 * 1142260257);
		String string;
		switch (aClass382_3449.anInt3960 * 890516591) {
		case 1:
			string = new StringBuilder().append("").append(Class661.aClass289_8509.method5197((byte) 11)).append("%").toString();
			break;
		default:
			string = "";
			break;
		case 2:
			string = Class661.aClass289_8509.method5190((byte) 127);
			break;
		case 0:
			string = Class661.aClass289_8509.method5177(2089297222);
		}
		int i_2_ = Class661.aClass289_8509.method5197((byte) 11);
		if (aLong3450 * -412001436560424875L < 0L || i_2_ == 0 || i_2_ != anInt3451 * -1599492569) {
			aLong3450 = Class248.method4401(1516375036) * -2435300774810256131L;
			anInt3451 = -644423273 * i_2_;
		}
		if (1 != aClass382_3449.anInt3960 * 890516591 && (Class248.method4401(1516375036) - aLong3450 * -412001436560424875L) > 10000L)
			string = new StringBuilder().append(string).append(" (").append(Class661.aClass289_8509.method5179(1593169638).anInt3139 * 1533974855).append(")").toString();
		aClass164_3446.method2624(string, i_0_, i_1_, aClass382_3449.anInt3955 * -1350163237, -1, 1820334484);
	}

	Class323(Class472 class472, Class472 class472_3_, Class382 class382) {
		aClass472_3447 = class472;
		aClass472_3448 = class472_3_;
		aClass382_3449 = class382;
	}

	public boolean method209(byte i) {
		boolean bool = true;
		if (!aClass472_3447.method7650(aClass382_3449.anInt3962 * 1104637541, -265296569))
			bool = false;
		if (!aClass472_3448.method7650(aClass382_3449.anInt3962 * 1104637541, -1020825047))
			bool = false;
		return bool;
	}

	public void method208(boolean bool) {
		int i = (aClass382_3449.aClass380_3956.method6400(0, (client.anInt11036 * 1536768403), (short) -15611) + aClass382_3449.anInt3958 * 1522863683);
		int i_4_ = (aClass382_3449.aClass389_3957.method6473(0, -932988141 * client.anInt11151, 2146227393) + aClass382_3449.anInt3959 * 1142260257);
		String string;
		switch (aClass382_3449.anInt3960 * 890516591) {
		case 1:
			string = new StringBuilder().append("").append(Class661.aClass289_8509.method5197((byte) 11)).append("%").toString();
			break;
		default:
			string = "";
			break;
		case 2:
			string = Class661.aClass289_8509.method5190((byte) 123);
			break;
		case 0:
			string = Class661.aClass289_8509.method5177(2104511551);
		}
		int i_5_ = Class661.aClass289_8509.method5197((byte) 11);
		if (aLong3450 * -412001436560424875L < 0L || i_5_ == 0 || i_5_ != anInt3451 * -1599492569) {
			aLong3450 = Class248.method4401(1516375036) * -2435300774810256131L;
			anInt3451 = -644423273 * i_5_;
		}
		if (1 != aClass382_3449.anInt3960 * 890516591 && (Class248.method4401(1516375036) - aLong3450 * -412001436560424875L) > 10000L)
			string = new StringBuilder().append(string).append(" (").append(Class661.aClass289_8509.method5179(1743352747).anInt3139 * 1533974855).append(")").toString();
		aClass164_3446.method2624(string, i, i_4_, aClass382_3449.anInt3955 * -1350163237, -1, 1807413472);
	}

	public void method210(int i) {
		Class10 class10 = Class555.method9193(aClass472_3448, aClass382_3449.anInt3962 * 1104637541, Class491.aClass423_5536, 1859675847);
		aClass164_3446 = (Class31.aClass178_303.method3111(class10, Class166.method2662(aClass472_3447, aClass382_3449.anInt3962 * 1104637541), true));
	}

	public void method212() {
		Class10 class10 = Class555.method9193(aClass472_3448, aClass382_3449.anInt3962 * 1104637541, Class491.aClass423_5536, 1784306533);
		aClass164_3446 = (Class31.aClass178_303.method3111(class10, Class166.method2662(aClass472_3447, aClass382_3449.anInt3962 * 1104637541), true));
	}

	static final void method5723(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class606.method9968(class250, class242, class669, (byte) 0);
	}

	static final void method5724(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class212.method3828(class250, class242, class669, -802520218);
	}

	static final void method5725(Class669 class669, byte i) {
		Class523_Sub4.method15924(class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)], -1676658555);
	}

	static final void method5726(Class669 class669, int i) {
		System.out.println(class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
	}

	static int method5727(Class523_Sub27_Sub8 class523_sub27_sub8, Class10 class10, int i) {
		String string = BodyDefinitions.method10330(class523_sub27_sub8, (short) -7432);
		return class10.method626(string, Class62.aClass148Array772, -1942791872);
	}

	static void method5728(int i, String string, String string_6_, int i_7_) {
		if (client.aClass116_11058 != null) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4264, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((1 + Class57.method1388(string, 1399579027) + Class57.method1388(string_6_, 1399579027)), (byte) -71);
			class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(i, -159492164);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16266(string_6_, -564975912);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16266(string, 1820948800);
			client.aClass116_11058.method1974(class523_sub22, (byte) 116);
		}
	}

	public static float method5729(float f, float f_8_, short i) {
		double d = Math.atan2((double) f, (double) f_8_);
		if (d < 0.0)
			d = d + 3.141592653589793 + 3.141592653589793;
		return (float) d;
	}
}
