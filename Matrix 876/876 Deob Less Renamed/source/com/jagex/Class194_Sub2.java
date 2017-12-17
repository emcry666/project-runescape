/* Class194_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class194_Sub2 extends Class194 {
	int anInt9865;
	static final int anInt9866 = 1;
	int anInt9867;
	int anInt9868;
	static final int anInt9869 = 0;
	int anInt9870;
	int anInt9871;
	int anInt9872;
	int anInt9873;
	int anInt9874;
	int anInt9875;
	int anInt9876;
	int anInt9877;
	int anInt9878;
	int anInt9879;

	Class194_Sub2(Class523_Sub34 class523_sub34, int i, int i_0_) {
		super(class523_sub34);
		if (0 == i) {
			int i_1_ = class523_sub34.readUnsignedInt((byte) -36);
			anInt9877 = (i_1_ >>> 16) * -1721635931;
			anInt9868 = (i_1_ & 0xffff) * 1016668841;
			anInt9871 = 1227733795;
		} else {
			anInt9877 = 1721635931;
			anInt9868 = -1016668841;
			anInt9871 = class523_sub34.readUnsignedShort(-835355007) * -1227733795;
		}
		if (0 == i_0_) {
			int i_2_ = class523_sub34.readUnsignedInt((byte) -99);
			anInt9873 = (i_2_ >>> 16) * -1868890121;
			anInt9874 = (i_2_ & 0xffff) * -1687725977;
			anInt9870 = 1043446097;
		} else {
			anInt9873 = 1868890121;
			anInt9874 = 1687725977;
			anInt9870 = class523_sub34.readUnsignedShort(-1225616425) * -1043446097;
		}
		if (0 == i && i_0_ == 0)
			anInt9867 = class523_sub34.readUnsignedByte(1353834129) * 1262143001;
		else
			anInt9867 = -1262143001;
		anInt9865 = class523_sub34.readUnsignedShort(-1671256497) * 1561376183;
		anInt9872 = class523_sub34.readUnsignedByte(-1161162794) * 1641178401;
		anInt9875 = class523_sub34.readUnsignedByte(-1273902135) * 920762661;
		anInt9876 = class523_sub34.read24BitInt(-1564991253) * -168464141;
		anInt9878 = class523_sub34.readUnsignedShort(-342025852) * 569674029;
		anInt9879 = class523_sub34.readUnsignedByte(478669515) * -917195575;
	}

	public void method3648(int i) {
		int i_3_;
		int i_4_;
		int i_5_;
		if (anInt9877 * 1254032429 >= 0) {
			i_3_ = 256 + anInt9877 * 2114476544;
			i_4_ = 256 + anInt9868 * -45927936;
			i_5_ = -204130775 * anInt9867;
		} else {
			Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = Class191.aClass192Array2157[anInt9871 * 2126558069].method3631(452530633);
			Class437 class437 = class647_sub1_sub3_sub1.method10569().aClass437_4862;
			i_3_ = (int) class437.aFloat4903;
			i_4_ = (int) class437.aFloat4905;
			i_5_ = class647_sub1_sub3_sub1.aByte10821;
		}
		int i_6_;
		int i_7_;
		if (654221721 * anInt9868 >= 0) {
			i_6_ = 256 + -488403456 * anInt9873;
			i_7_ = anInt9874 * 612806144 + 256;
		} else {
			Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = Class191.aClass192Array2157[anInt9870 * 20369487].method3631(862016180);
			Class437 class437 = class647_sub1_sub3_sub1.method10569().aClass437_4862;
			i_6_ = (int) class437.aFloat4903;
			i_7_ = (int) class437.aFloat4905;
			if (i_5_ < 0)
				i_5_ = class647_sub1_sub3_sub1.aByte10821;
		}
		int i_8_ = anInt9879 * 1483318649 << 2;
		Class647_Sub1_Sub3_Sub6 class647_sub1_sub3_sub6 = (new Class647_Sub1_Sub3_Sub6(client.aClass505_11019.method8241((byte) -122), 26032135 * anInt9865, i_5_, i_5_, i_3_, i_4_, anInt9872 * 1402167009 << 2, client.anInt11011, 1213409339 * anInt9876 + client.anInt11011, 589541029 * anInt9878, i_8_, 2126558069 * anInt9871 + 1, 1 + 20369487 * anInt9870, -2065843539 * anInt9875 << 2, false, 0, 0));
		class647_sub1_sub3_sub6.method18596(i_6_, i_7_, anInt9875 * -2065843539 << 2, (client.anInt11011 + 1213409339 * anInt9876), -410729865);
		client.aClass708_11074.method14236(new Class523_Sub27_Sub5(class647_sub1_sub3_sub6), -528131578);
	}

	boolean method3650(int i) {
		GraphicsDefinitions class671 = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(26032135 * anInt9865, (byte) 3));
		boolean bool = class671.method13700((byte) 127);
		AnimationDefinitions class205 = ((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(-61429051 * class671.anInt8590, (byte) -44));
		bool &= class205.method3719(169699403);
		return bool;
	}

	public void method3651() {
		int i;
		int i_9_;
		int i_10_;
		if (anInt9877 * 1254032429 >= 0) {
			i = 256 + anInt9877 * 2114476544;
			i_9_ = 256 + anInt9868 * -45927936;
			i_10_ = -204130775 * anInt9867;
		} else {
			Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = Class191.aClass192Array2157[anInt9871 * 2126558069].method3631(425606782);
			Class437 class437 = class647_sub1_sub3_sub1.method10569().aClass437_4862;
			i = (int) class437.aFloat4903;
			i_9_ = (int) class437.aFloat4905;
			i_10_ = class647_sub1_sub3_sub1.aByte10821;
		}
		int i_11_;
		int i_12_;
		if (654221721 * anInt9868 >= 0) {
			i_11_ = 256 + -488403456 * anInt9873;
			i_12_ = anInt9874 * 612806144 + 256;
		} else {
			Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = Class191.aClass192Array2157[anInt9870 * 20369487].method3631(366373682);
			Class437 class437 = class647_sub1_sub3_sub1.method10569().aClass437_4862;
			i_11_ = (int) class437.aFloat4903;
			i_12_ = (int) class437.aFloat4905;
			if (i_10_ < 0)
				i_10_ = class647_sub1_sub3_sub1.aByte10821;
		}
		int i_13_ = anInt9879 * 1483318649 << 2;
		Class647_Sub1_Sub3_Sub6 class647_sub1_sub3_sub6 = (new Class647_Sub1_Sub3_Sub6(client.aClass505_11019.method8241((byte) -83), 26032135 * anInt9865, i_10_, i_10_, i, i_9_, anInt9872 * 1402167009 << 2, client.anInt11011, 1213409339 * anInt9876 + client.anInt11011, 589541029 * anInt9878, i_13_, 2126558069 * anInt9871 + 1, 1 + 20369487 * anInt9870, -2065843539 * anInt9875 << 2, false, 0, 0));
		class647_sub1_sub3_sub6.method18596(i_11_, i_12_, anInt9875 * -2065843539 << 2, (client.anInt11011 + 1213409339 * anInt9876), -1140828668);
		client.aClass708_11074.method14236(new Class523_Sub27_Sub5(class647_sub1_sub3_sub6), -1477831160);
	}

	public void method3656() {
		int i;
		int i_14_;
		int i_15_;
		if (anInt9877 * 1254032429 >= 0) {
			i = 256 + anInt9877 * 2114476544;
			i_14_ = 256 + anInt9868 * -45927936;
			i_15_ = -204130775 * anInt9867;
		} else {
			Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = Class191.aClass192Array2157[anInt9871 * 2126558069].method3631(1360031954);
			Class437 class437 = class647_sub1_sub3_sub1.method10569().aClass437_4862;
			i = (int) class437.aFloat4903;
			i_14_ = (int) class437.aFloat4905;
			i_15_ = class647_sub1_sub3_sub1.aByte10821;
		}
		int i_16_;
		int i_17_;
		if (654221721 * anInt9868 >= 0) {
			i_16_ = 256 + -488403456 * anInt9873;
			i_17_ = anInt9874 * 612806144 + 256;
		} else {
			Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = Class191.aClass192Array2157[anInt9870 * 20369487].method3631(1469042098);
			Class437 class437 = class647_sub1_sub3_sub1.method10569().aClass437_4862;
			i_16_ = (int) class437.aFloat4903;
			i_17_ = (int) class437.aFloat4905;
			if (i_15_ < 0)
				i_15_ = class647_sub1_sub3_sub1.aByte10821;
		}
		int i_18_ = anInt9879 * 1483318649 << 2;
		Class647_Sub1_Sub3_Sub6 class647_sub1_sub3_sub6 = (new Class647_Sub1_Sub3_Sub6(client.aClass505_11019.method8241((byte) -125), 26032135 * anInt9865, i_15_, i_15_, i, i_14_, anInt9872 * 1402167009 << 2, client.anInt11011, 1213409339 * anInt9876 + client.anInt11011, 589541029 * anInt9878, i_18_, 2126558069 * anInt9871 + 1, 1 + 20369487 * anInt9870, -2065843539 * anInt9875 << 2, false, 0, 0));
		class647_sub1_sub3_sub6.method18596(i_16_, i_17_, anInt9875 * -2065843539 << 2, (client.anInt11011 + 1213409339 * anInt9876), 1682927556);
		client.aClass708_11074.method14236(new Class523_Sub27_Sub5(class647_sub1_sub3_sub6), -860172991);
	}

	public void method3657() {
		int i;
		int i_19_;
		int i_20_;
		if (anInt9877 * 1254032429 >= 0) {
			i = 256 + anInt9877 * 2114476544;
			i_19_ = 256 + anInt9868 * -45927936;
			i_20_ = -204130775 * anInt9867;
		} else {
			Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = Class191.aClass192Array2157[anInt9871 * 2126558069].method3631(134342352);
			Class437 class437 = class647_sub1_sub3_sub1.method10569().aClass437_4862;
			i = (int) class437.aFloat4903;
			i_19_ = (int) class437.aFloat4905;
			i_20_ = class647_sub1_sub3_sub1.aByte10821;
		}
		int i_21_;
		int i_22_;
		if (654221721 * anInt9868 >= 0) {
			i_21_ = 256 + -488403456 * anInt9873;
			i_22_ = anInt9874 * 612806144 + 256;
		} else {
			Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = Class191.aClass192Array2157[anInt9870 * 20369487].method3631(266061255);
			Class437 class437 = class647_sub1_sub3_sub1.method10569().aClass437_4862;
			i_21_ = (int) class437.aFloat4903;
			i_22_ = (int) class437.aFloat4905;
			if (i_20_ < 0)
				i_20_ = class647_sub1_sub3_sub1.aByte10821;
		}
		int i_23_ = anInt9879 * 1483318649 << 2;
		Class647_Sub1_Sub3_Sub6 class647_sub1_sub3_sub6 = (new Class647_Sub1_Sub3_Sub6(client.aClass505_11019.method8241((byte) -101), 26032135 * anInt9865, i_20_, i_20_, i, i_19_, anInt9872 * 1402167009 << 2, client.anInt11011, 1213409339 * anInt9876 + client.anInt11011, 589541029 * anInt9878, i_23_, 2126558069 * anInt9871 + 1, 1 + 20369487 * anInt9870, -2065843539 * anInt9875 << 2, false, 0, 0));
		class647_sub1_sub3_sub6.method18596(i_21_, i_22_, anInt9875 * -2065843539 << 2, (client.anInt11011 + 1213409339 * anInt9876), -1944611403);
		client.aClass708_11074.method14236(new Class523_Sub27_Sub5(class647_sub1_sub3_sub6), -1045368569);
	}

	boolean method3655() {
		GraphicsDefinitions class671 = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(26032135 * anInt9865, (byte) -46));
		boolean bool = class671.method13700((byte) 127);
		AnimationDefinitions class205 = ((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(-61429051 * class671.anInt8590, (byte) -119));
		bool &= class205.method3719(169699403);
		return bool;
	}

	boolean method3653() {
		GraphicsDefinitions class671 = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(26032135 * anInt9865, (byte) -5));
		boolean bool = class671.method13700((byte) 127);
		AnimationDefinitions class205 = ((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(-61429051 * class671.anInt8590, (byte) -69));
		bool &= class205.method3719(169699403);
		return bool;
	}

	boolean method3654() {
		GraphicsDefinitions class671 = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(26032135 * anInt9865, (byte) 12));
		boolean bool = class671.method13700((byte) 127);
		AnimationDefinitions class205 = ((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(-61429051 * class671.anInt8590, (byte) 61));
		bool &= class205.method3719(169699403);
		return bool;
	}
}
