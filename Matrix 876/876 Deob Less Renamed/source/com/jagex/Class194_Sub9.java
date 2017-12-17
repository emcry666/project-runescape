/* Class194_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public class Class194_Sub9 extends Class194 {
	int anInt9907;

	public void method3657() {
		Class191.aClass190Array2158[anInt9907 * 1301343233].method3604(156062722);
	}

	Class194_Sub9(Class523_Sub34 class523_sub34) {
		super(class523_sub34);
		anInt9907 = class523_sub34.readUnsignedShort(-1599912733) * 1275008001;
	}

	public void method3651() {
		Class191.aClass190Array2158[anInt9907 * 1301343233].method3604(633536562);
	}

	public void method3656() {
		Class191.aClass190Array2158[anInt9907 * 1301343233].method3604(961830723);
	}

	public void method3648(int i) {
		Class191.aClass190Array2158[anInt9907 * 1301343233].method3604(-1141498831);
	}

	static final void method15504(int i) {
		if (1930550897 * client.anInt11063 > 1) {
			client.anInt11063 -= -1078582639;
			client.anInt11221 = 1635505145 * client.anInt11251;
		}
		if (client.aClass116_11058.aBool1432) {
			client.aClass116_11058.aBool1432 = false;
			Class145.method2383((byte) -106);
		} else {
			if (!Class36.aBool326)
				Class648.method10616(-2067123551);
			for (int i_0_ = 0; i_0_ < 100 && Class586.method9714(client.aClass116_11058, (short) -22670); i_0_++) {
				/* empty */
			}
			if (9 == client.anInt11136 * -2020118759) {
				while (Class652.method10645(-279284202)) {
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4286, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(0, -2135722339);
					int i_1_ = 2349011 * (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661);
					Class468.method7611((class523_sub22.aClass523_Sub34_Sub2_10525), -533357774);
					class523_sub22.aClass523_Sub34_Sub2_10525.method16276(2349011 * (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661) - i_1_, 1768886921);
					client.aClass116_11058.method1974(class523_sub22, (byte) 97);
				}
				if (Class168_Sub2.aClass640_9786 != null) {
					if (Class168_Sub2.aClass640_9786.anInt8314 * 167852121 != -1) {
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.GC_COLLECTOR_PACKET), (client.aClass116_11058.aClass11_1413), 1370050649);
						if (null == Class194_Sub10.aGarbageCollectorMXBean9910 || !Class194_Sub10.aGarbageCollectorMXBean9910.isValid()) {
							try {
								Iterator iterator = ManagementFactory.getGarbageCollectorMXBeans().iterator();
								while (iterator.hasNext()) {
									GarbageCollectorMXBean garbagecollectormxbean = ((GarbageCollectorMXBean) iterator.next());
									if (garbagecollectormxbean.isValid()) {
										Class194_Sub10.aGarbageCollectorMXBean9910 = garbagecollectormxbean;
										client.aLong11168 = 2782801265857846535L;
										client.aLong11125 = -6891687222580726967L;
									}
								}
							} catch (Throwable throwable) {
								/* empty */
							}
						}
						long l = Class248.method4401(1516375036);
						int i_2_ = -1;
						if (Class194_Sub10.aGarbageCollectorMXBean9910 != null) {
							long l_3_ = Class194_Sub10.aGarbageCollectorMXBean9910.getCollectionTime();
							if (client.aLong11125 * 6636447390930489607L != -1L) {
								long l_4_ = l_3_ - (6636447390930489607L * client.aLong11125);
								long l_5_ = l - (client.aLong11168 * -7350823958003318967L);
								if (l_5_ != 0L)
									i_2_ = (int) (l_4_ * 100L / l_5_);
							}
							client.aLong11125 = 6891687222580726967L * l_3_;
							client.aLong11168 = l * -2782801265857846535L;
						}
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByteC(i_2_, (byte) 96);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128((Class168_Sub2.aClass640_9786.anInt8314 * 167852121), -1262882661);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByteC(-1307622225 * client.anInt5662, (byte) 89);
						client.aClass116_11058.method1974(class523_sub22, (byte) 59);
						Class168_Sub2.aClass640_9786 = null;
						Class520.aLong7060 = (30000L + l) * 6994432451389868545L;
					}
				} else if (Class248.method4401(1516375036) >= -4281200043935582719L * Class520.aLong7060)
					Class168_Sub2.aClass640_9786 = client.aClass648_11303.method10606((Class155.aClass1_1735.aString9), (short) -20801);
				Class488.method7952(176784443);
				Class397.method6520((byte) 0);
				Class523_Sub39 class523_sub39 = ((Class523_Sub39) client.aClass708_11027.method14240(931283684));
				if (client.aClass505_11019.method8241((byte) -77) != null) {
					if (2097396553 * Class562.anInt7564 == 3)
						Class516.method8621((byte) -124);
					else if (4 == 2097396553 * Class562.anInt7564)
						Class393.method6496((byte) -14);
				}
				if (client.aBool11107)
					client.aBool11107 = false;
				else
					client.aFloat11106 /= 2.0F;
				if (client.aBool11108)
					client.aBool11108 = false;
				else
					client.aFloat11177 /= 2.0F;
				if (Class274.method5030(-376237283))
					Class279.method5057(-533491144);
				else if (2 == Class562.anInt7564 * 2097396553) {
					Class592 class592 = client.aClass505_11019.method8242(55538902);
					int i_6_ = class592.localX * 235453015 << 9;
					int i_7_ = class592.localY * 1704054549 << 9;
					if (Class168.aLong1799 * -2251960109566032967L <= 0L)
						Class168.aLong1799 = (Class248.method4401(1516375036) * 6286482357763674761L);
					float f = (float) (Class248.method4401(1516375036) - (-2251960109566032967L * Class168.aLong1799));
					int i_8_ = 1000 / Class286.method5150(2076635009);
					i_8_ *= 1.25;
					for (/**/; f > 0.0F; f -= (float) i_8_) {
						float f_9_ = Math.min(f, (float) i_8_);
						Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5399(f_9_ / 1000.0F, (client.aClass505_11019.method8249(-393232349).anIntArrayArrayArray5033), client.aClass505_11019.method8243(29858829), i_6_, i_7_, (byte) 0);
					}
					Class168.aLong1799 = (Class248.method4401(1516375036) * 6286482357763674761L);
				}
				Class143.method2371(-2004941549);
				if (9 == -2020118759 * client.anInt11136) {
					client.aClass505_11019.method8271((byte) 8).method10234(client.aClass505_11019, 593181001);
					Class282.method5126(1855959876);
					if (-235668157 * client.anInt11025 > 10)
						client.aClass116_11058.anInt1423 += 737527675;
					if (-524877901 * client.aClass116_11058.anInt1423 > 2250)
						Class145.method2383((byte) -17);
					else {
						if (3 == -1616721887 * client.anInt11071) {
							Class230.method4231(2048208731);
							Class332.method5843(16777215);
						} else if (Class200.aClass613_2205.anInterface68_8018.method435(class523_sub39, client.anInterface64Array11194, -751939039 * client.anInt11184, Class481.aClass551_5473, (byte) -85))
							Class61.method1414(false, 1194354683);
						else {
							if (client.anInt11071 * -1616721887 == 0 && Class638.method10512((-2131499789 * client.anInt11070), (byte) -107)) {
								client.aClass505_11019.method8368(new Class496(Class500.aClass500_5569, null), 1235970069);
								client.anInt11071 = 436124641;
							}
							if (1 == client.anInt11071 * -1616721887 && 10 != -2020118759 * client.anInt11136) {
								Class191.aClass14_2160.method733(1482209312);
								client.anInt11071 = 1744498564;
								client.anInt11073 = client.anInt11011 * 470293709;
								client.anInt11230 = 0;
								client.aBool11072 = false;
								Class263.method4740((byte) -116);
							}
							if (-1616721887 * client.anInt11071 == 4) {
								int i_10_ = (client.anInt11011 - client.anInt11073 * -667602939);
								if (client.anInt11230 * -1711605365 < Class174.aClass194Array1855.length) {
									do {
										Class194 class194 = (Class174.aClass194Array1855[(-1711605365 * client.anInt11230)]);
										if (class194.anInt2187 * 312710341 > i_10_)
											break;
										class194.method3648(1881450593);
									} while ((-1616721887 * client.anInt11071 == 4) && ((client.anInt11230 += -2129140189) * -1711605365 < (Class174.aClass194Array1855).length));
								}
								if (4 == -1616721887 * client.anInt11071) {
									for (int i_11_ = 0; i_11_ < (Class191.aClass192Array2157).length; i_11_++) {
										Class192 class192 = (Class191.aClass192Array2157[i_11_]);
										if (class192.aBool2174) {
											Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = class192.method3631(1826992391);
											Class309.method5617(class647_sub1_sub3_sub1, true, (byte) -53);
										}
									}
								}
							}
						}
						Class375.method6385(1776103005);
						Class687_Sub23.method16938(1733079304);
						Class672.method13724((byte) 0);
						InputStream_Sub1.method17232(false, (byte) -19);
						Class625.method10222(Class31.aClass178_303, Class174_Sub1.aClass172_9785, (byte) -73);
						client.anInt11059 += -982359081;
						if (1204002983 * client.anInt11135 != 0) {
							client.anInt11134 += -1404741860;
							if (985877459 * client.anInt11134 >= 400)
								client.anInt11135 = 0;
						}
						if (null != Class436.aClass250_4899) {
							client.anInt11173 += 1664064409;
							if (client.anInt11173 * -1412331351 >= 15) {
								Class523_Sub14.method15991((Class436.aClass250_4899), (byte) -117);
								Class436.aClass250_4899 = null;
							}
						}
						client.aClass250_11201 = null;
						client.aBool11207 = false;
						client.aBool11213 = false;
						RSSocket.aClass250_15 = null;
						Class523_Sub13.method15984(null, -1, -1, 184849983);
						if (!client.aBool11000)
							client.anInt11178 = 99323203;
						Class453.method7317((byte) 6);
						client.anInt11251 += -1840203945;
						if (client.aBool11281) {
							Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.WORLD_MAP_CLICK_PACKET), (client.aClass116_11058.aClass11_1413), 1370050649);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeIntLE((Class704.anInt8813 * -297334695 << 28 | -195883575 * Class449.anInt4947 << 14 | Class555.anInt7478 * -1902344811), 1861452639);
							client.aClass116_11058.method1974(class523_sub22, (byte) 58);
							client.aBool11281 = false;
						}
						for (;;) {
							Class523_Sub38 class523_sub38 = ((Class523_Sub38) client.aClass708_11240.method14293(1939623824));
							if (class523_sub38 == null)
								break;
							Class250 class250 = class523_sub38.aClass250_10678;
							if (234012635 * class250.anInt2709 >= 0) {
								Class250 class250_12_ = Class188.method3592((97896203 * (class250.anInt2546)), -1182986515);
								if (null == class250_12_ || null == class250_12_.aClass250Array2535 || (234012635 * class250.anInt2709 >= (class250_12_.aClass250Array2535).length) || (class250 != (class250_12_.aClass250Array2535[234012635 * class250.anInt2709])))
									continue;
							}
							Class482.method7916(class523_sub38, (byte) 3);
						}
						for (;;) {
							Class523_Sub38 class523_sub38 = ((Class523_Sub38) client.aClass708_11241.method14293(1966898728));
							if (null == class523_sub38)
								break;
							Class250 class250 = class523_sub38.aClass250_10678;
							if (234012635 * class250.anInt2709 >= 0) {
								Class250 class250_13_ = Class188.method3592((97896203 * (class250.anInt2546)), -602113869);
								if (null == class250_13_ || class250_13_.aClass250Array2535 == null || (class250.anInt2709 * 234012635 >= (class250_13_.aClass250Array2535).length) || ((class250_13_.aClass250Array2535[234012635 * class250.anInt2709]) != class250))
									continue;
							}
							Class482.method7916(class523_sub38, (byte) 3);
						}
						for (;;) {
							Class523_Sub38 class523_sub38 = ((Class523_Sub38) client.aClass708_11239.method14293(2061617124));
							if (null == class523_sub38)
								break;
							Class250 class250 = class523_sub38.aClass250_10678;
							if (234012635 * class250.anInt2709 >= 0) {
								Class250 class250_14_ = Class188.method3592((97896203 * (class250.anInt2546)), -1924443434);
								if (null == class250_14_ || null == class250_14_.aClass250Array2535 || (class250.anInt2709 * 234012635 >= (class250_14_.aClass250Array2535).length) || ((class250_14_.aClass250Array2535[234012635 * class250.anInt2709]) != class250))
									continue;
							}
							Class482.method7916(class523_sub38, (byte) 3);
						}
						if (RSSocket.aClass250_15 == null)
							client.anInt11211 = 0;
						if (null != client.aClass250_11197)
							Class511.method8565(1662134478);
						Class536.method8928(1870687181);
						if (-1746920271 * client.rights > 0 && Class481.aClass551_5473.method9127(82, (byte) -25) && Class481.aClass551_5473.method9127(81, (byte) -15) && 0 != 203206237 * client.anInt11028) {
							int i_15_ = ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821) - 203206237 * client.anInt11028);
							if (i_15_ < 0)
								i_15_ = 0;
							else if (i_15_ > 3)
								i_15_ = 3;
							Class592 class592 = client.aClass505_11019.method8242(55538902);
							RSSocket.method506(i_15_, ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anIntArray11885[0]) + class592.localX * 235453015), (class592.localY * 1704054549 + (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anIntArray11943[0])), -1854377085);
						}
						for (int i_16_ = 0; i_16_ < 5; i_16_++)
							client.anIntArray11273[i_16_]++;
						if (Class423.clientConfigsDomain.aBool8903 && ((Class423.clientConfigsDomain.aLong8904 * -6425266789231785447L) < Class248.method4401(1516375036) - 60000L))
							Class545.method9063(1647862059);
						Class423.clientConfigsDomain.method14386((byte) -65);
						for (Class522_Sub5 class522_sub5 = ((Class522_Sub5) client.aClass701_11309.method14087(1706431677)); null != class522_sub5; class522_sub5 = ((Class522_Sub5) client.aClass701_11309.method14088(949172309))) {
							if ((long) (class522_sub5.anInt10341 * -754049503) < (Class248.method4401(1516375036) / 1000L - 5L)) {
								if (class522_sub5.aShort10343 > 0)
									Class515.method8593(5, 0, "", "", "", new StringBuilder().append(class522_sub5.aString10342).append(Class39.aClass39_501.method1124(Class53_Sub20.aClass668_10979, (byte) -47)).toString(), null, -1227255261);
								if (0 == class522_sub5.aShort10343)
									Class515.method8593(5, 0, "", "", "", new StringBuilder().append(class522_sub5.aString10342).append(Class39.aClass39_545.method1124(Class53_Sub20.aClass668_10979, (byte) -9)).toString(), null, -571670959);
								class522_sub5.method8652((byte) -45);
							}
						}
						client.anInt11259 += 2106772449;
						if (client.anInt11259 * 785037345 > 502) {
							client.anInt11259 = 0;
							int i_17_ = (int) (Math.random() * 8.0);
							if ((i_17_ & 0x1) == 1)
								client.anInt11087 += 71238301 * client.anInt10993;
							if ((i_17_ & 0x2) == 2)
								client.anInt11089 += -874296537 * client.anInt11090;
							if ((i_17_ & 0x4) == 4)
								client.anInt11091 += -937275133 * client.anInt11092;
						}
						if (client.anInt11087 * -1492355445 < -56)
							client.anInt10993 = -2061546114;
						if (client.anInt11087 * -1492355445 > 55)
							client.anInt10993 = 2061546114;
						if (978919341 * client.anInt11089 < -58)
							client.anInt11090 = 128301990;
						if (client.anInt11089 * 978919341 > 57)
							client.anInt11090 = -128301990;
						if (-2135173819 * client.anInt11091 < -44)
							client.anInt11092 = -1077398993;
						if (client.anInt11091 * -2135173819 > 41)
							client.anInt11092 = 1077398993;
						client.anInt11098 += -1844349101;
						if (client.anInt11098 * -1007426341 > 500) {
							client.anInt11098 = 0;
							int i_18_ = (int) (Math.random() * 8.0);
							if (1 == (i_18_ & 0x1))
								client.anInt11094 += client.anInt11126 * -793319323;
							if (2 == (i_18_ & 0x2))
								client.anInt11068 += -2128663989 * client.anInt11097;
						}
						if (client.anInt11094 * 724985463 < -60)
							client.anInt11126 = -1644894090;
						if (724985463 * client.anInt11094 > 63)
							client.anInt11126 = 1644894090;
						if (client.anInt11068 * -1193506389 < -21)
							client.anInt11097 = 1023887657;
						if (-1193506389 * client.anInt11068 > 11)
							client.anInt11097 = -1023887657;
						client.aClass116_11058.anInt1424 += -575771961;
						if (-1555613961 * client.aClass116_11058.anInt1424 > 50) {
							Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.aClass408_4323), (client.aClass116_11058.aClass11_1413), 1370050649);
							client.aClass116_11058.method1974(class523_sub22, (byte) 66);
						}
						if (client.aBool11061) {
							Class102.method1803((byte) 6);
							client.aBool11061 = false;
						}
						try {
							client.aClass116_11058.method1973(1512049308);
						} catch (IOException ioexception) {
							Class145.method2383((byte) -112);
						}
					}
				}
			}
		}
	}

	public static Class303 method15505(int i, byte i_19_) {
		if (-741545153 * Class303.aClass303_3338.anInt3341 == i)
			return Class303.aClass303_3338;
		if (Class303.aClass303_3339.anInt3341 * -741545153 == i)
			return Class303.aClass303_3339;
		if (i == Class303.aClass303_3340.anInt3341 * -741545153)
			return Class303.aClass303_3340;
		return null;
	}

	static final void method15506(Class250 class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (Class594.method9807(string, class669, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2645 = Class78.method1554(string, class669, -68449792);
		class250.aBool2635 = true;
	}
}
