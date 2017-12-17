/* Class459 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Stack;
import java.util.concurrent.Callable;

public class Class459 implements Callable {
	URL anURL5095;
	Class523_Sub27_Sub14_Sub3 aClass523_Sub27_Sub14_Sub3_5096;
	Class452 this$0;

	public Object method7489() throws Exception {
		URLConnection urlconnection = anURL5095.openConnection();
		urlconnection.setConnectTimeout(10000);
		urlconnection.setReadTimeout(60000);
		boolean bool = true;
		try {
			urlconnection.connect();
		} catch (IOException ioexception) {
			this$0.aLong4970 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -8106998428687354983L;
			bool = false;
		}
		return new Class457(this$0, bool ? urlconnection.getInputStream() : null, aClass523_Sub27_Sub14_Sub3_5096, anURL5095);
	}

	Class459(Class452 class452, URL url, Class523_Sub27_Sub14_Sub3 class523_sub27_sub14_sub3) {
		this$0 = class452;
		anURL5095 = url;
		aClass523_Sub27_Sub14_Sub3_5096 = class523_sub27_sub14_sub3;
	}

	public Object method7490() throws Exception {
		URLConnection urlconnection = anURL5095.openConnection();
		urlconnection.setConnectTimeout(10000);
		urlconnection.setReadTimeout(60000);
		boolean bool = true;
		try {
			urlconnection.connect();
		} catch (IOException ioexception) {
			this$0.aLong4970 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -8106998428687354983L;
			bool = false;
		}
		return new Class457(this$0, bool ? urlconnection.getInputStream() : null, aClass523_Sub27_Sub14_Sub3_5096, anURL5095);
	}

	public Object call() throws Exception {
		URLConnection urlconnection = anURL5095.openConnection();
		urlconnection.setConnectTimeout(10000);
		urlconnection.setReadTimeout(60000);
		boolean bool = true;
		try {
			urlconnection.connect();
		} catch (IOException ioexception) {
			this$0.aLong4970 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -8106998428687354983L;
			bool = false;
		}
		return new Class457(this$0, bool ? urlconnection.getInputStream() : null, aClass523_Sub27_Sub14_Sub3_5096, anURL5095);
	}

	public Object method7491() throws Exception {
		URLConnection urlconnection = anURL5095.openConnection();
		urlconnection.setConnectTimeout(10000);
		urlconnection.setReadTimeout(60000);
		boolean bool = true;
		try {
			urlconnection.connect();
		} catch (IOException ioexception) {
			this$0.aLong4970 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -8106998428687354983L;
			bool = false;
		}
		return new Class457(this$0, bool ? urlconnection.getInputStream() : null, aClass523_Sub27_Sub14_Sub3_5096, anURL5095);
	}

	public static void method7492(int i) {
		synchronized (Class559.aStack7491) {
			Class559.aStack7491 = new Stack();
		}
	}

	static final void method7493(Class669 class669, short i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class186.method3584(class250, class242, class669, (short) -12869);
	}

	static final void method7494(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class396.method6515(class250, class242, class669, -348952084);
	}

	static final void method7495(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub7_10627.method16795((byte) 101) ? 1 : 0;
	}

	public static void method7496(String string, int i) {
		if (client.aBool11000 && 0 != (382935923 * Class570.anInt7658 & 0x18)) {
			boolean bool = false;
			int i_0_ = 393652345 * Class108.anInt1318;
			int[] is = Class108.anIntArray1319;
			for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
				Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[is[i_1_]];
				if (null != class647_sub1_sub3_sub1_sub2.username && class647_sub1_sub3_sub1_sub2.username.equalsIgnoreCase(string) && (((Class241.player == class647_sub1_sub3_sub1_sub2) && (Class570.anInt7658 * 382935923 & 0x10) != 0) || (Class570.anInt7658 * 382935923 & 0x8) != 0)) {
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4214, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(Class232.anInt2367 * 1383041209, -1887962239);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(-1034378319 * client.anInt11105, (byte) 86);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(is[i_1_], (byte) -110);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(client.anInt11095 * -325213033, (byte) -26);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(0, 1528497997);
					client.aClass116_11058.method1974(class523_sub22, (byte) 21);
					Class581.method9664((class647_sub1_sub3_sub1_sub2.screenX[0]), (class647_sub1_sub3_sub1_sub2.screenY[0]), 452886911);
					bool = true;
					break;
				}
			}
			if (!bool)
				Class214.method3840(4, new StringBuilder().append(Class39.aClass39_444.method1124(Class53_Sub20.aClass668_10979, (byte) -43)).append(string).toString(), 1881487071);
			if (client.aBool11000)
				Class399.method6533(-1167565320);
		}
	}
}
