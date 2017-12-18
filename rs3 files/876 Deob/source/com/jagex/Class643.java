/* Class643 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

import com.jagex.twitchtv.TwitchEvent;
import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchEventResult;

public class Class643 implements Interface75 {
	static Class643 aClass643_8335;
	static Class643 aClass643_8336;
	static Class643 aClass643_8337;
	int anInt8338;
	static Class643 aClass643_8339;
	public static Class643 aClass643_8340 = new Class643(0);

	Class643(int i) {
		anInt8338 = -1675356009 * i;
	}

	public int method6() {
		return anInt8338 * 942728999;
	}

	static {
		aClass643_8336 = new Class643(1);
		aClass643_8337 = new Class643(2);
		aClass643_8335 = new Class643(3);
		aClass643_8339 = new Class643(4);
	}

	public int method82() {
		return anInt8338 * 942728999;
	}

	public int method101() {
		return anInt8338 * 942728999;
	}

	public static void method10537(Class178 class178, long l) {
		Class617.anInt8048 = Class617.anInt8047 * 12696657;
		Class617.anInt8047 = 0;
		TimeUtils.getCurrentTimeMilliseconds(1516375036);
		Iterator iterator = Class617.aList8045.iterator();
		while (iterator.hasNext()) {
			Class621 class621 = (Class621) iterator.next();
			boolean bool = class621.method10156(class178, l);
			if (!bool) {
				iterator.remove();
				Class617.aClass621Array8044[Class617.anInt8046 * -1285472633] = class621;
				Class617.anInt8046 = (1 + -1285472633 * Class617.anInt8046 & (Class173.anIntArray1840[-1334998773 * Class617.anInt8054])) * 1174611767;
			}
		}
	}

	public static void setAnimation(Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1, int[] is, int i, boolean bool, int i_0_) {
		if (class647_sub1_sub3_sub1.anIntArray11911 != null) {
			boolean bool_1_ = true;
			for (int i_2_ = 0; i_2_ < class647_sub1_sub3_sub1.anIntArray11911.length; i_2_++) {
				if (is[i_2_] != class647_sub1_sub3_sub1.anIntArray11911[i_2_]) {
					bool_1_ = false;
					break;
				}
			}
			Class707 class707 = class647_sub1_sub3_sub1.aClass707_11913;
			if (bool_1_ && class707.method14161(-1847412529)) {
				AnimationDefinitions class205 = class647_sub1_sub3_sub1.aClass707_11913.method14203(708387695);
				int i_3_ = class205.anInt2220 * 1566662983;
				if (1 == i_3_)
					class707.method14180(i, (short) -4107);
				if (i_3_ == 2)
					class707.method14178(1545355649);
			}
		}
		boolean bool_4_ = true;
		for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
			if (is[i_5_] != -1)
				bool_4_ = false;
			if (class647_sub1_sub3_sub1.anIntArray11911 == null || class647_sub1_sub3_sub1.anIntArray11911[i_5_] == -1 || ((((AnimationDefinitions) TimeUtils.aClass53_Sub13_2492.getDefinition(is[i_5_], (byte) 58)).priority * 1835115947) >= ((AnimationDefinitions) (TimeUtils.aClass53_Sub13_2492.getDefinition(class647_sub1_sub3_sub1.anIntArray11911[i_5_], (byte) 45))).priority * 1835115947)) {
				class647_sub1_sub3_sub1.anIntArray11911 = is;
				class647_sub1_sub3_sub1.aClass707_11913.method14174(i, (byte) 53);
				if (bool)
					class647_sub1_sub3_sub1.anInt11946 = -1125057301 * class647_sub1_sub3_sub1.stepsCount;
			}
		}
		if (bool_4_) {
			class647_sub1_sub3_sub1.anIntArray11911 = is;
			class647_sub1_sub3_sub1.aClass707_11913.method14174(i, (byte) -97);
			if (bool)
				class647_sub1_sub3_sub1.anInt11946 = class647_sub1_sub3_sub1.stepsCount * -1125057301;
		}
	}

	static boolean method10539(TwitchEvent twitchevent, long l) {
		if (!Class569.aBool7650) {
			switch (twitchevent.eventType) {
			case 7:
			case 8:
			case 9:
				return false;
			}
		}
		if (twitchevent.eventType == 33) {
			if (Class569.aTwitchWebcamFrameData7642 == null)
				return false;
			int i = ((TwitchEventResult) twitchevent).result;
			int i_6_ = (Class323.aTwitchTV3452.GetWebcamFrameData(i, Class569.aTwitchWebcamFrameData7642));
			if (0 == i_6_) {
				if (Class569.aBool7635)
					Class569.aTwitchWebcamFrameData7642.method14329();
				if (Class569.aBool7652)
					Class569.aTwitchWebcamFrameData7642.method14330();
				Class224.method4151(-1942274309);
				Class569.aLong7649 = l * -3698484276435242643L;
				Class565.method9483(33, 0, -2131038615);
			} else
				Class569.aClass148_7626 = null;
			return false;
		}
		if (twitchevent.eventType == 30) {
			int i = ((TwitchEventResult) twitchevent).result;
			if (0 == i || i == 1)
				Class239.method4340((byte) 72);
			else if (2 == i)
				Class569.aLong7649 = -3698484276435242643L * l;
		}
		if (34 == twitchevent.eventType) {
			Class292.aTwitchEventLiveStreams3159 = (TwitchEventLiveStreams) twitchevent;
			Class565.method9483(34, 0, -2128139445);
		}
		return true;
	}
}
