/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class177 {
	public static final int anInt1862 = 11;
	static final int anInt1863 = 1;
	static final int anInt1864 = 2;
	public int anInt1865;
	static final int anInt1866 = 4;
	static final int anInt1867 = 0;
	static final int anInt1868 = 2;
	static final int anInt1869 = 16;
	public byte aByte1870;
	static final int anInt1871 = 32;
	static final int anInt1872 = 1;
	static final int anInt1873 = 16;
	static final int anInt1874 = 256;
	public byte aByte1875;
	public boolean aBool1876;
	public static final byte aByte1877 = 1;
	static final int anInt1878 = 1;
	static final int anInt1879 = 2;
	public int anInt1880;
	public boolean aBool1881 = false;
	boolean aBool1882 = false;
	public byte aByte1883;
	public Class593 aClass593_1884;
	public byte aByte1885;
	public byte aByte1886;
	public boolean aBool1887;
	static final int anInt1888 = 64;
	public byte aByte1889;
	static final int anInt1890 = 128;
	public static final int anInt1891 = 5;
	public static final int anInt1892 = 0;
	public static final int anInt1893 = 1;
	public static final int anInt1894 = 2;
	public static final int anInt1895 = 3;
	public static final int anInt1896 = 4;
	static final int anInt1897 = 512;
	public static final int anInt1898 = 6;
	static final int anInt1899 = 3;
	public static final int anInt1900 = 8;
	public static final int anInt1901 = 9;
	public static final byte aByte1902 = 0;
	public static final int anInt1903 = 13;
	public static final int anInt1904 = 16;
	public byte aByte1905;
	public byte aByte1906;
	public short aShort1907;
	public byte aByte1908;
	public boolean aBool1909;
	public boolean aBool1910 = false;
	public byte aByte1911;
	public byte aByte1912;
	public int anInt1913;
	public static final int anInt1914 = 7;

	public static boolean method3010(int i) {
		return 1 != i && 7 != i;
	}

	void method3011(int i, RSBuffer class523_sub34, int i_0_) {
		anInt1880 = i * 1536451783;
		class523_sub34.readUnsignedByte(-1371218213);
		int i_1_ = class523_sub34.readUnsignedByte(-1155890669);
		if (i_1_ == 0)
			anInt1913 = -263986240;
		else if (1 == i_1_)
			anInt1913 = -527972480;
		else if (i_1_ == 2)
			anInt1913 = -1055944960;
		else if (3 == i_1_)
			anInt1913 = -2111889920;
		else if (i_1_ == 4)
			anInt1913 = 71187456;
		int i_2_ = class523_sub34.readUnsignedInt((byte) -107);
		aBool1881 = (i_2_ & 0x1) != 0;
		aBool1882 = (i_2_ & 0x2) != 0;
		aBool1910 = 0 != (i_2_ & 0x10);
		int i_3_ = (byte) class523_sub34.readUnsignedByte(-1686186058);
		aByte1911 = (byte) (i_3_ & 0x7);
		aByte1875 = (byte) (i_3_ >> 3 & 0x7);
		int i_4_ = class523_sub34.readUnsignedInt((byte) -62);
		if ((i_4_ & 0x10) != 0) {
			class523_sub34.method16293(-1721488457);
			class523_sub34.method16293(-1531119782);
		}
		if (aBool1882)
			class523_sub34.method16293(-1099854644);
		if ((i_4_ & 0x20) != 0)
			class523_sub34.readUnsignedInt((byte) -81);
		if ((i_4_ & 0x40) != 0)
			class523_sub34.readUnsignedInt((byte) -21);
		if ((i_4_ & 0x80) != 0)
			class523_sub34.readUnsignedInt((byte) -93);
		if (0 != (i_4_ & 0x100))
			class523_sub34.readUnsignedInt((byte) -5);
		if (0 != (i_4_ & 0x200))
			class523_sub34.readUnsignedInt((byte) -108);
		aBool1887 = class523_sub34.readUnsignedByte(-1480861743) == 1;
		Class334.method5910(Class224.method4152((byte) 98), class523_sub34.readUnsignedByte(1380410168), 1462229547);
		Class334.method5910(Class333.method5848(1819646813), class523_sub34.readUnsignedByte(-1053833402), -528710555);
		aClass593_1884 = ((Class593) Class334.method5910(Class426.method6750(83363513), class523_sub34.readUnsignedByte(401799555), -1503274140));
		if (Class593.aClass593_7812 == aClass593_1884)
			aByte1889 = (byte) class523_sub34.readUnsignedByte(-741683607);
		int i_5_ = class523_sub34.readUnsignedByte(-2092764328);
		if ((i_5_ & 0x1) != 0)
			aByte1885 = (byte) class523_sub34.readUnsignedByte(-1808793377);
		if ((i_5_ & 0x2) != 0)
			aByte1886 = (byte) class523_sub34.readUnsignedByte(1240256372);
		if (class523_sub34.readUnsignedByte(1921095113) == 1) {
			aByte1905 = (byte) class523_sub34.readUnsignedByte(856587475);
			aByte1906 = (byte) class523_sub34.readUnsignedByte(-1258650984);
			anInt1865 = class523_sub34.readUnsignedInt((byte) -89) * -465009467;
			aByte1870 = (byte) class523_sub34.readUnsignedByte(1312487944);
			class523_sub34.readUnsignedByte(-2007698731);
			aByte1908 = (byte) class523_sub34.readUnsignedByte(-600860276);
			aBool1909 = class523_sub34.readUnsignedByte(1691249915) == 1;
			aBool1876 = class523_sub34.readUnsignedByte(-185124083) == 1;
			aByte1883 = (byte) class523_sub34.readUnsignedByte(1356297279);
			aByte1912 = (byte) class523_sub34.readUnsignedByte(-1404712514);
			aShort1907 = (short) class523_sub34.readUnsignedShort(-710086155);
		}
	}

	Class177() {
		aByte1885 = (byte) 0;
		aByte1886 = (byte) 0;
		aBool1887 = false;
		aClass593_1884 = Class593.aClass593_7813;
		aByte1889 = (byte) -1;
		aByte1911 = (byte) 0;
		aByte1875 = (byte) 0;
		aByte1905 = (byte) 0;
		aByte1906 = (byte) 0;
		anInt1865 = 0;
		aByte1908 = (byte) 0;
		aBool1909 = false;
		aBool1876 = false;
		aByte1883 = (byte) 0;
		aByte1912 = (byte) -1;
		aByte1870 = (byte) 0;
		aShort1907 = (short) 0;
	}

	public static boolean method3012(int i) {
		return 1 != i && 7 != i;
	}

	void method3013(int i, RSBuffer class523_sub34) {
		anInt1880 = i * 1536451783;
		class523_sub34.readUnsignedByte(-74877084);
		int i_6_ = class523_sub34.readUnsignedByte(1428901796);
		if (i_6_ == 0)
			anInt1913 = -263986240;
		else if (1 == i_6_)
			anInt1913 = -527972480;
		else if (i_6_ == 2)
			anInt1913 = -1055944960;
		else if (3 == i_6_)
			anInt1913 = -2111889920;
		else if (i_6_ == 4)
			anInt1913 = 71187456;
		int i_7_ = class523_sub34.readUnsignedInt((byte) -71);
		aBool1881 = (i_7_ & 0x1) != 0;
		aBool1882 = (i_7_ & 0x2) != 0;
		aBool1910 = 0 != (i_7_ & 0x10);
		int i_8_ = (byte) class523_sub34.readUnsignedByte(-35988343);
		aByte1911 = (byte) (i_8_ & 0x7);
		aByte1875 = (byte) (i_8_ >> 3 & 0x7);
		int i_9_ = class523_sub34.readUnsignedInt((byte) -19);
		if ((i_9_ & 0x10) != 0) {
			class523_sub34.method16293(-691561125);
			class523_sub34.method16293(-448375875);
		}
		if (aBool1882)
			class523_sub34.method16293(-2107451732);
		if ((i_9_ & 0x20) != 0)
			class523_sub34.readUnsignedInt((byte) -9);
		if ((i_9_ & 0x40) != 0)
			class523_sub34.readUnsignedInt((byte) -69);
		if ((i_9_ & 0x80) != 0)
			class523_sub34.readUnsignedInt((byte) -95);
		if (0 != (i_9_ & 0x100))
			class523_sub34.readUnsignedInt((byte) -35);
		if (0 != (i_9_ & 0x200))
			class523_sub34.readUnsignedInt((byte) -6);
		aBool1887 = class523_sub34.readUnsignedByte(-152900116) == 1;
		Class334.method5910(Class224.method4152((byte) 6), class523_sub34.readUnsignedByte(926284283), 2146305099);
		Class334.method5910(Class333.method5848(1502989521), class523_sub34.readUnsignedByte(-1166603720), -974817922);
		aClass593_1884 = ((Class593) Class334.method5910(Class426.method6750(83363513), class523_sub34.readUnsignedByte(1838468102), -450468745));
		if (Class593.aClass593_7812 == aClass593_1884)
			aByte1889 = (byte) class523_sub34.readUnsignedByte(423166190);
		int i_10_ = class523_sub34.readUnsignedByte(663762877);
		if ((i_10_ & 0x1) != 0)
			aByte1885 = (byte) class523_sub34.readUnsignedByte(866102410);
		if ((i_10_ & 0x2) != 0)
			aByte1886 = (byte) class523_sub34.readUnsignedByte(-51467561);
		if (class523_sub34.readUnsignedByte(-1677389333) == 1) {
			aByte1905 = (byte) class523_sub34.readUnsignedByte(86698099);
			aByte1906 = (byte) class523_sub34.readUnsignedByte(-34569818);
			anInt1865 = class523_sub34.readUnsignedInt((byte) -43) * -465009467;
			aByte1870 = (byte) class523_sub34.readUnsignedByte(405328625);
			class523_sub34.readUnsignedByte(-1507885480);
			aByte1908 = (byte) class523_sub34.readUnsignedByte(-1864695111);
			aBool1909 = class523_sub34.readUnsignedByte(-1638615058) == 1;
			aBool1876 = class523_sub34.readUnsignedByte(1224276500) == 1;
			aByte1883 = (byte) class523_sub34.readUnsignedByte(-1223070723);
			aByte1912 = (byte) class523_sub34.readUnsignedByte(-2062367241);
			aShort1907 = (short) class523_sub34.readUnsignedShort(-2133916852);
		}
	}

	static final void method3014(Class669 class669, int i) {
		int i_11_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4288, client.aClass116_11058.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i_11_, (byte) -27);
		client.aClass116_11058.method1974(class523_sub22, (byte) 58);
	}

	static Class146[] method3015(int i) {
		return (new Class146[] { Class146.aClass146_1702, Class146.aClass146_1703, Class146.aClass146_1699, Class146.aClass146_1696, Class146.aClass146_1697, Class146.aClass146_1698, Class146.aClass146_1701 });
	}

	static final void method3016(Class669 class669, int i) {
		class669.anInt8558 -= 2138772399;
	}
}
