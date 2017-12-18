/* Class569 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

import com.jagex.twitchtv.TwitchEvent;
import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchEventResult;
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamFrameData;

public class Class569 {
	static int anInt7618;
	static final int anInt7619 = 0;
	static final int anInt7620 = 1;
	static final int anInt7621 = 2;
	static final int anInt7622 = 3;
	static long aLong7623;
	static final int anInt7624 = 1;
	static long aLong7625;
	static Class148 aClass148_7626;
	static int anInt7627;
	static int anInt7628;
	static long aLong7629;
	static int anInt7630;
	static int anInt7631;
	static float aFloat7632;
	static boolean[] aBoolArray7633;
	static String[] aStringArray7634;
	static boolean aBool7635;
	static int anInt7636;
	static final int anInt7637 = 2;
	static boolean aBool7638;
	static long aLong7639;
	static int anInt7640;
	static boolean aBool7641;
	static TwitchWebcamFrameData aTwitchWebcamFrameData7642;
	static boolean aBool7643;
	static int[] anIntArray7644;
	static LinkedList aLinkedList7645;
	static LinkedList aLinkedList7646;
	static int anInt7647;
	static TwitchWebcamDevice[] aTwitchWebcamDeviceArray7648;
	static long aLong7649;
	static boolean aBool7650 = false;
	static final int anInt7651 = 0;
	static boolean aBool7652;
	static final int anInt7653 = 2000;

	public static TwitchWebcamDevice method9525(int i) {
		if (aTwitchWebcamDeviceArray7648 == null)
			return null;
		for (int i_0_ = 0; i_0_ < aTwitchWebcamDeviceArray7648.length; i_0_++) {
			if (aTwitchWebcamDeviceArray7648[i_0_].anInt1136 * -2015039365 == i)
				return aTwitchWebcamDeviceArray7648[i_0_];
		}
		return null;
	}

	static {
		aFloat7632 = 0.2F;
		anInt7627 = -1904762847;
		anInt7628 = 417777632;
		anInt7618 = 0;
		anInt7630 = -620076176;
		anInt7631 = 0;
		anInt7636 = 0;
		aBoolArray7633 = null;
		aStringArray7634 = null;
		aBool7643 = false;
		aLong7625 = 0L;
		aLong7623 = 0L;
		aLong7639 = 0L;
		anInt7640 = 0;
		aBool7641 = false;
		aBool7638 = false;
		aTwitchWebcamFrameData7642 = null;
		aLinkedList7645 = new LinkedList();
		aLinkedList7646 = new LinkedList();
		anInt7647 = 1915499191;
		aTwitchWebcamDeviceArray7648 = null;
		aLong7649 = 0L;
		aClass148_7626 = null;
		aBool7635 = false;
		aBool7652 = false;
	}

	public static void method9526(boolean bool) {
		/* empty */
	}

	public static Class148 method9527() {
		return aClass148_7626;
	}

	public static int method9528() {
		if (!Class423.method6714(857491344))
			return 0;
		return anInt7640 * 1314363521;
	}

	public static void method9529() {
		aClass148_7626 = null;
	}

	public static void method9530(boolean bool) {
		/* empty */
	}

	public static int method9531(String string) {
		return Class323.aTwitchTV3452.SetStreamTitle(string, client.aClass681_11284.aString8647);
	}

	public static void method9532(boolean bool) {
		/* empty */
	}

	public static void method9533(boolean bool) {
		/* empty */
	}

	public static void method9534(boolean bool) {
		/* empty */
	}

	public static int method9535() {
		if (3 == anInt7631 * 963672803)
			return -1;
		if (963672803 * anInt7631 != 0)
			return anInt7636 * 359766717;
		if (aStringArray7634 == null) {
			if (Class509.aString5723.startsWith("mac ")) {
				if (Class509.aString5724.startsWith("ppc")) {
					anInt7631 = 514052193;
					return -1;
				}
				aStringArray7634 = new String[3];
				aStringArray7634[0] = "sdk-mac-dynamic";
				aStringArray7634[1] = "twitchsdk";
				aStringArray7634[2] = "twitchtv";
				aBoolArray7633 = new boolean[3];
				aBoolArray7633[0] = false;
				aBoolArray7633[1] = false;
				aBoolArray7633[2] = true;
			} else if (Class509.aString5723.startsWith("win")) {
				aStringArray7634 = new String[6];
				aStringArray7634[0] = "avutil-ttv-51";
				aStringArray7634[1] = "libmp3lame-ttv";
				aStringArray7634[2] = "swresample-ttv-0";
				aStringArray7634[5] = "twitchtv";
				if (Class509.aString5724.startsWith("amd64") || Class509.aString5724.startsWith("x86_64")) {
					aStringArray7634[3] = "libmfxsw64";
					aStringArray7634[4] = "twitchsdk_64_release";
				} else if (Class509.aString5724.startsWith("i386") || Class509.aString5724.startsWith("i486") || Class509.aString5724.startsWith("i586") || Class509.aString5724.startsWith("x86")) {
					aStringArray7634[3] = "libmfxsw32";
					aStringArray7634[4] = "twitchsdk_32_release";
				} else {
					anInt7631 = 514052193;
					return -1;
				}
				aBoolArray7633 = new boolean[6];
				aBoolArray7633[0] = true;
				aBoolArray7633[1] = true;
				aBoolArray7633[2] = true;
				aBoolArray7633[3] = false;
				aBoolArray7633[4] = true;
				aBoolArray7633[5] = true;
			} else {
				anInt7631 = 514052193;
				return -1;
			}
		}
		anInt7631 = 171350731;
		return 0;
	}

	public static int method9536() {
		return 963672803 * anInt7631;
	}

	public static void method9537(boolean bool) {
		if (bool != aBool7638) {
			Class292.method5236(-97951155);
			aBool7638 = bool;
		}
	}

	public static int method9538() {
		if (Class292.aTwitchEventLiveStreams3159 == null || (anInt7647 * 2037822713 >= Class292.aTwitchEventLiveStreams3159.streamCount - 1))
			return -1;
		return (anInt7647 += -1915499191) * 2037822713;
	}

	public static int method9539() {
		return Class323.aTwitchTV3452.GetStreamState();
	}

	public static int method9540() {
		return Class323.aTwitchTV3452.GetLoginState();
	}

	static void method9541(int[] is, LinkedList linkedlist, int i, int i_1_, float f) {
		if (!linkedlist.isEmpty()) {
			for (int i_2_ = 0; i_2_ < linkedlist.size(); i_2_++) {
				Class575 class575 = (Class575) linkedlist.get(i_2_);
				int i_3_ = i + (int) ((float) (class575.anInt7687 * -1339871957) * f);
				int i_4_ = ((int) (f * (float) (class575.anInt7689 * -375858305)) + i_1_);
				int i_5_ = (int) (f * (float) (-1859048369 * class575.anInt7688));
				int i_6_ = (int) (f * (float) (1653204735 * class575.anInt7690));
				if (i_3_ < 1568728259 * Class57.anInt746 && i_4_ < Class322.anInt3445 * -24538641) {
					if (i_5_ + i_3_ > Class57.anInt746 * 1568728259)
						i_5_ = Class57.anInt746 * 1568728259 - i_3_;
					if (i_6_ + i_4_ > Class322.anInt3445 * -24538641)
						i_6_ = -24538641 * Class322.anInt3445 - i_4_;
					for (int i_7_ = i_4_; i_7_ < i_4_ + i_6_; i_7_++) {
						int i_8_ = i_7_ * (1568728259 * Class57.anInt746) + i_3_;
						Arrays.fill(is, i_8_, i_8_ + i_5_, -16777216);
					}
				}
			}
		}
	}

	public static int method9542() {
		if (!aBool7643)
			return 12;
		Class193.method3646(Class31.aClass178_303, 336297659);
		return Class323.aTwitchTV3452.Logout();
	}

	public static boolean method9543() {
		if (Class509.aString5723.startsWith("win"))
			return true;
		return false;
	}

	public static int method9544(int i, int i_9_, int i_10_, boolean bool) {
		if (0 != i && (i < 50 || i > 100))
			i = 0;
		if (0 != i_9_ && (i_9_ < 50 || i_9_ > 100))
			i_9_ = 0;
		boolean bool_11_ = Class509.aString5723.startsWith("mac");
		int[] is = (Class323.aTwitchTV3452.GetRecommendedSettings(Class170.anInt1833 * 2141365743, Class254.anInt2742 * -495986435, i, 2000, i_10_, aFloat7632, bool_11_));
		if (is[0] != 0)
			return is[0];
		int i_12_ = is[1];
		int i_13_ = is[2];
		int i_14_ = is[3];
		int i_15_ = i_14_;
		aLong7625 = 0L;
		aLong7629 = (long) (1000.0F / (float) i_10_) * -206299636776198047L;
		Class57.anInt746 = -1918506005 * i_12_;
		Class322.anInt3445 = 1962786063 * i_13_;
		if (0 != i_9_)
			i_14_ = i_9_ * i_14_ / 100;
		Class485.method7932(new StringBuilder().append("Stream - Input: ").append(2141365743 * Class170.anInt1833).append("x").append(-495986435 * Class254.anInt2742).append(" (").append(i_15_).append("kbps)").append(" => ").append("Output: ").append(i_12_).append("x").append(i_13_).append(" [").append(0 == i ? "auto" : new StringBuilder().append(i).append("%").toString()).append("] (").append(i_14_).append("kbps [").append(i_9_ == 0 ? "auto" : new StringBuilder().append(i_9_).append("%").toString()).append("])").toString(), (byte) -96);
		return Class323.aTwitchTV3452.StartStreaming(i_12_, i_13_, i_10_, i_14_, i_9_ != 0, aFloat7632, -1778392095 * anInt7627, bool);
	}

	public static int method9545(Class178 class178) {
		Class292.method5236(-320958049);
		return Class323.aTwitchTV3452.StopStreaming();
	}

	static void method9546() {
		aBool7641 = false;
		Class3.anIntArray33 = null;
		anIntArray7644 = null;
		aLinkedList7645.clear();
		aLinkedList7646.clear();
		Class31.aClass178_303.method3066();
	}

	static void method9547() {
		aBool7641 = false;
		Class3.anIntArray33 = null;
		anIntArray7644 = null;
		aLinkedList7645.clear();
		aLinkedList7646.clear();
		Class31.aClass178_303.method3066();
	}

	public static int method9548() {
		return Class323.aTwitchTV3452.GetLoginState();
	}

	public static int method9549(String string) {
		return Class323.aTwitchTV3452.SetStreamTitle(string, client.aClass681_11284.aString8647);
	}

	public static int method9550(String string) {
		return Class323.aTwitchTV3452.SetStreamTitle(string, client.aClass681_11284.aString8647);
	}

	public static void method9551(Class178 class178, long l) {
		class178.method3066();
		aLinkedList7645.clear();
		aLinkedList7646.clear();
		aLong7625 = 5627345227462185109L * ((long) (763085699 * anInt7618) + l);
	}

	public static int method9552() {
		if (!Class423.method6714(641081474))
			return 0;
		return anInt7640 * 1314363521;
	}

	Class569() throws Throwable {
		throw new Error();
	}

	static boolean method9553(TwitchEvent twitchevent, long l) {
		if (!aBool7650) {
			switch (twitchevent.eventType) {
			case 7:
			case 8:
			case 9:
				return false;
			}
		}
		if (twitchevent.eventType == 33) {
			if (aTwitchWebcamFrameData7642 == null)
				return false;
			int i = ((TwitchEventResult) twitchevent).result;
			int i_16_ = Class323.aTwitchTV3452.GetWebcamFrameData(i, aTwitchWebcamFrameData7642);
			if (0 == i_16_) {
				if (aBool7635)
					aTwitchWebcamFrameData7642.method14329();
				if (aBool7652)
					aTwitchWebcamFrameData7642.method14330();
				Class224.method4151(-976016731);
				aLong7649 = l * -3698484276435242643L;
				Class565.method9483(33, 0, -2146303031);
			} else
				aClass148_7626 = null;
			return false;
		}
		if (twitchevent.eventType == 30) {
			int i = ((TwitchEventResult) twitchevent).result;
			if (0 == i || i == 1)
				Class239.method4340((byte) 117);
			else if (2 == i)
				aLong7649 = -3698484276435242643L * l;
		}
		if (34 == twitchevent.eventType) {
			Class292.aTwitchEventLiveStreams3159 = (TwitchEventLiveStreams) twitchevent;
			Class565.method9483(34, 0, -2133583601);
		}
		return true;
	}

	public static int method9554(String string) {
		return Class323.aTwitchTV3452.ChatSendMessage(string);
	}

	public static int method9555(String string) {
		return Class323.aTwitchTV3452.ChatSendMessage(string);
	}

	public static int method9556() {
		return Class323.aTwitchTV3452.GetWebcamState();
	}

	public static int method9557() {
		return Class323.aTwitchTV3452.GetViewerCount();
	}

	public static boolean method9558() {
		if (Class509.aString5723.startsWith("win"))
			return true;
		return false;
	}

	public static void method9559(Class178 class178, long l) {
		if (963672803 * anInt7631 != 3 && 0 != 963672803 * anInt7631) {
			if (963672803 * anInt7631 == 1) {
				if (null == aStringArray7634 || 0 == aStringArray7634.length)
					throw new RuntimeException("");
				int i = 0;
				for (int i_17_ = 0; i_17_ < aStringArray7634.length; i_17_++) {
					if (aStringArray7634[i_17_] != null) {
						try {
							i += (Class194_Sub19.aClass532_9953.method8782(aStringArray7634[i_17_], -818225186));
						} catch (Exception_Sub5 exception_sub5) {
							Class268.method4905(Class29.aClass29_264, exception_sub5.aString11360, (exception_sub5.anInt11361 * -1715672439), exception_sub5.getCause(), -1457672665);
							anInt7631 = 514052193;
							return;
						}
					} else
						i += 100;
				}
				anInt7636 = i / aStringArray7634.length * 1273737365;
				if (100 == 359766717 * anInt7636) {
					anInt7631 = Class469.method7612((byte) -125) * 171350731;
					if (anInt7631 * 963672803 != 2)
						return;
				} else
					return;
			}
			TwitchEvent[] twitchevents = Class323.aTwitchTV3452.Service();
			if (twitchevents != null) {
				for (int i = 0; i < twitchevents.length; i++) {
					TwitchEvent twitchevent = twitchevents[i];
					if (twitchevent != null && Class643.method10539(twitchevent, l)) {
						Class582 class582 = twitchevent.method6618();
						if (null != class582)
							IOException_Sub1.method18560(class582.method82(), twitchevent, 1357652815);
					}
				}
			}
			if (Class323.aTwitchTV3452.IsStreaming() && (l - aLong7625 * -8224487145473131843L > aLong7629 * 3793667966349935521L)) {
				aLong7625 = 5627345227462185109L * l;
				if (class178.method3056())
					aBool7641 = true;
			}
			if (Class323.aTwitchTV3452.IsStreaming()) {
				if (l - -3422948627883130143L * aLong7623 < (long) (1889251907 * anInt7628))
					anInt7640 = 1656835842;
				else if (l - -1775609124084343541L * aLong7639 < (long) (anInt7628 * 1889251907))
					anInt7640 = -1319065727;
				else
					anInt7640 = 0;
			} else
				anInt7640 = 0;
			if (l - 1967076064403718245L * aLong7649 > (long) (anInt7630 * 493745387) && Class323.aTwitchTV3452.GetWebcamState() == 5) {
				Class323.aTwitchTV3452.RestartWebcamDevice();
				aLong7649 = l * -3698484276435242643L;
			}
		}
	}

	public static int method9560() {
		Class292.aTwitchEventLiveStreams3159 = null;
		int i = Class323.aTwitchTV3452.RequestLiveStreams(client.aClass681_11284.aString8647);
		return i;
	}

	public static void method9561(Class178 class178, long l, int i, int i_18_) {
		do {
			if (class178.method3309() && class178.method3059() > -1) {
				int i_19_ = class178.method3059();
				Class587 class587 = null;
				if (!aLinkedList7646.isEmpty())
					class587 = (Class587) aLinkedList7646.getFirst();
				if (null == class587 || i_19_ != -1839458529 * class587.anInt7744) {
					class178.method3060();
					aLinkedList7646.clear();
				} else {
					aLinkedList7646.removeFirst();
					class178.method3186();
					boolean bool = false;
					int i_20_;
					if (class587.aLinkedList7745.isEmpty() && class178.method3057()) {
						long l_21_ = class178.method3324((Class57.anInt746 * 1568728259), (-24538641 * Class322.anInt3445));
						i_20_ = (Class323.aTwitchTV3452.SubmitFrame(l_21_, class178.method3058(), aBool7638, i, i_18_));
						class178.method3063(l_21_);
					} else {
						class178.method3130(Class57.anInt746 * 1568728259, Class322.anInt3445 * -24538641, Class3.anIntArray33, anIntArray7644);
						Class559.method9246(Class3.anIntArray33, class587.aLinkedList7745, class587.anInt7747 * 61394403, 215874015 * class587.anInt7743, class587.aFloat7746, (byte) -102);
						i_20_ = (Class323.aTwitchTV3452.SubmitFrameRaw(Class3.anIntArray33, aBool7638, i, i_18_));
					}
					class178.method3108();
					if (i_20_ == 2072)
						aLong7623 = 4921181089270546721L * l;
					else if (23 == i_20_)
						aLong7639 = l * -6939533996358416733L;
					else if (-995 == i_20_ || 0 != i_20_)
						break;
				}
			}
		} while (false);
		if (aBool7641) {
			if (Class3.anIntArray33 == null) {
				Class3.anIntArray33 = new int[(aBool7638 ? i_18_ * i : (Class57.anInt746 * 1568728259 * (Class322.anInt3445 * -24538641)))];
				anIntArray7644 = new int[(aBool7638 ? i * i_18_ : (Class322.anInt3445 * -24538641 * (1568728259 * Class57.anInt746)))];
			}
			if (!class178.method3309()) {
				class178.method3186();
				class178.method3130(1568728259 * Class57.anInt746, Class322.anInt3445 * -24538641, Class3.anIntArray33, anIntArray7644);
				Class559.method9246(Class3.anIntArray33, aLinkedList7645, 1970564341 * class178.anInt1945, class178.anInt1937 * 1216763507, class178.aFloat1948, (byte) -53);
				int i_22_ = Class323.aTwitchTV3452.SubmitFrameRaw((Class3.anIntArray33), aBool7638, i, i_18_);
				class178.method3108();
				aLinkedList7645.clear();
				do {
					if (2072 == i_22_)
						aLong7623 = 4921181089270546721L * l;
					else if (i_22_ == 23)
						aLong7639 = -6939533996358416733L * l;
					else if (-995 == i_22_ || i_22_ != 0)
						break;
				} while (false);
			} else {
				class178.method3061(client.cycles, Class57.anInt746 * 1568728259, Class322.anInt3445 * -24538641);
				aLinkedList7646.add(new Class587(client.cycles, aLinkedList7645, (1970564341 * class178.anInt1945), (1216763507 * class178.anInt1937), class178.aFloat1948));
				aLinkedList7645 = new LinkedList();
			}
			aBool7641 = false;
		}
	}

	public static void method9562(Class178 class178, long l, int i, int i_23_) {
		do {
			if (class178.method3309() && class178.method3059() > -1) {
				int i_24_ = class178.method3059();
				Class587 class587 = null;
				if (!aLinkedList7646.isEmpty())
					class587 = (Class587) aLinkedList7646.getFirst();
				if (null == class587 || i_24_ != -1839458529 * class587.anInt7744) {
					class178.method3060();
					aLinkedList7646.clear();
				} else {
					aLinkedList7646.removeFirst();
					class178.method3186();
					boolean bool = false;
					int i_25_;
					if (class587.aLinkedList7745.isEmpty() && class178.method3057()) {
						long l_26_ = class178.method3324((Class57.anInt746 * 1568728259), (-24538641 * Class322.anInt3445));
						i_25_ = (Class323.aTwitchTV3452.SubmitFrame(l_26_, class178.method3058(), aBool7638, i, i_23_));
						class178.method3063(l_26_);
					} else {
						class178.method3130(Class57.anInt746 * 1568728259, Class322.anInt3445 * -24538641, Class3.anIntArray33, anIntArray7644);
						Class559.method9246(Class3.anIntArray33, class587.aLinkedList7745, class587.anInt7747 * 61394403, 215874015 * class587.anInt7743, class587.aFloat7746, (byte) -103);
						i_25_ = (Class323.aTwitchTV3452.SubmitFrameRaw(Class3.anIntArray33, aBool7638, i, i_23_));
					}
					class178.method3108();
					if (i_25_ == 2072)
						aLong7623 = 4921181089270546721L * l;
					else if (23 == i_25_)
						aLong7639 = l * -6939533996358416733L;
					else if (-995 == i_25_ || 0 != i_25_)
						break;
				}
			}
		} while (false);
		if (aBool7641) {
			if (Class3.anIntArray33 == null) {
				Class3.anIntArray33 = new int[(aBool7638 ? i_23_ * i : (Class57.anInt746 * 1568728259 * (Class322.anInt3445 * -24538641)))];
				anIntArray7644 = new int[(aBool7638 ? i * i_23_ : (Class322.anInt3445 * -24538641 * (1568728259 * Class57.anInt746)))];
			}
			if (!class178.method3309()) {
				class178.method3186();
				class178.method3130(1568728259 * Class57.anInt746, Class322.anInt3445 * -24538641, Class3.anIntArray33, anIntArray7644);
				Class559.method9246(Class3.anIntArray33, aLinkedList7645, 1970564341 * class178.anInt1945, class178.anInt1937 * 1216763507, class178.aFloat1948, (byte) -80);
				int i_27_ = Class323.aTwitchTV3452.SubmitFrameRaw((Class3.anIntArray33), aBool7638, i, i_23_);
				class178.method3108();
				aLinkedList7645.clear();
				do {
					if (2072 == i_27_)
						aLong7623 = 4921181089270546721L * l;
					else if (i_27_ == 23)
						aLong7639 = -6939533996358416733L * l;
					else if (-995 == i_27_ || i_27_ != 0)
						break;
				} while (false);
			} else {
				class178.method3061(client.cycles, Class57.anInt746 * 1568728259, Class322.anInt3445 * -24538641);
				aLinkedList7646.add(new Class587(client.cycles, aLinkedList7645, (1970564341 * class178.anInt1945), (1216763507 * class178.anInt1937), class178.aFloat1948));
				aLinkedList7645 = new LinkedList();
			}
			aBool7641 = false;
		}
	}

	public static boolean method9563() {
		if (Class509.aString5723.startsWith("win")) {
			String string = "msvcr110.dll";
			String string_28_ = "msvcp110.dll";
			String[] strings = { string, string_28_ };
			String string_29_ = System.getenv("WINDIR");
			if (string_29_ == "")
				return false;
			for (int i = 0; i < strings.length; i++) {
				File file = new File(new StringBuilder().append(string_29_).append("\\system32\\").append(strings[i]).toString());
				if (!file.exists() || file.isDirectory())
					return false;
			}
			return true;
		}
		if (Class509.aString5723.startsWith("mac")) {
			boolean bool;
			try {
				Process process = Runtime.getRuntime().exec("ps -few");
				BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(process.getInputStream())));
				do {
					boolean bool_30_;
					try {
						int i = process.waitFor();
						if (i == 0)
							break;
						bool_30_ = false;
					} catch (InterruptedException interruptedexception) {
						return false;
					}
					return bool_30_;
				} while (false);
				boolean bool_31_ = false;
				while_36_: do {
					String string;
					do {
						if ((string = bufferedreader.readLine()) == null)
							break while_36_;
					} while (string.toLowerCase().indexOf("soundflowerbed") == -1);
					bool_31_ = true;
				} while (false);
				bufferedreader.close();
				bool = bool_31_;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		return false;
	}

	public static boolean method9564() {
		return aBool7641;
	}

	public static boolean method9565() {
		return aBool7641;
	}

	public static void method9566(boolean bool) {
		/* empty */
	}

	static void method9567(int i, int i_32_) {
		TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_32_);
		Class582 class582 = twitcheventresult.method6618();
		if (class582 != null)
			IOException_Sub1.method18560(class582.method82(), twitcheventresult, 1357652815);
	}

	public static void method9568(Class178 class178, long l) {
		class178.method3066();
		aLinkedList7645.clear();
		aLinkedList7646.clear();
		aLong7625 = 5627345227462185109L * ((long) (763085699 * anInt7618) + l);
	}

	public static void method9569(Class178 class178, long l) {
		class178.method3066();
		aLinkedList7645.clear();
		aLinkedList7646.clear();
		aLong7625 = 5627345227462185109L * ((long) (763085699 * anInt7618) + l);
	}

	public static boolean method9570() {
		if (Class509.aString5723.startsWith("win"))
			return true;
		return false;
	}

	public static void method9571(Class178 class178, long l) {
		class178.method3066();
		aLinkedList7645.clear();
		aLinkedList7646.clear();
		aLong7625 = 5627345227462185109L * ((long) (763085699 * anInt7618) + l);
	}

	static boolean method9572(TwitchEvent twitchevent, long l) {
		if (!aBool7650) {
			switch (twitchevent.eventType) {
			case 7:
			case 8:
			case 9:
				return false;
			}
		}
		if (twitchevent.eventType == 33) {
			if (aTwitchWebcamFrameData7642 == null)
				return false;
			int i = ((TwitchEventResult) twitchevent).result;
			int i_33_ = Class323.aTwitchTV3452.GetWebcamFrameData(i, aTwitchWebcamFrameData7642);
			if (0 == i_33_) {
				if (aBool7635)
					aTwitchWebcamFrameData7642.method14329();
				if (aBool7652)
					aTwitchWebcamFrameData7642.method14330();
				Class224.method4151(-1225586486);
				aLong7649 = l * -3698484276435242643L;
				Class565.method9483(33, 0, -2129835100);
			} else
				aClass148_7626 = null;
			return false;
		}
		if (twitchevent.eventType == 30) {
			int i = ((TwitchEventResult) twitchevent).result;
			if (0 == i || i == 1)
				Class239.method4340((byte) -3);
			else if (2 == i)
				aLong7649 = -3698484276435242643L * l;
		}
		if (34 == twitchevent.eventType) {
			Class292.aTwitchEventLiveStreams3159 = (TwitchEventLiveStreams) twitchevent;
			Class565.method9483(34, 0, -2143110400);
		}
		return true;
	}

	static boolean method9573(TwitchEvent twitchevent, long l) {
		if (!aBool7650) {
			switch (twitchevent.eventType) {
			case 7:
			case 8:
			case 9:
				return false;
			}
		}
		if (twitchevent.eventType == 33) {
			if (aTwitchWebcamFrameData7642 == null)
				return false;
			int i = ((TwitchEventResult) twitchevent).result;
			int i_34_ = Class323.aTwitchTV3452.GetWebcamFrameData(i, aTwitchWebcamFrameData7642);
			if (0 == i_34_) {
				if (aBool7635)
					aTwitchWebcamFrameData7642.method14329();
				if (aBool7652)
					aTwitchWebcamFrameData7642.method14330();
				Class224.method4151(-1159187452);
				aLong7649 = l * -3698484276435242643L;
				Class565.method9483(33, 0, -2132539728);
			} else
				aClass148_7626 = null;
			return false;
		}
		if (twitchevent.eventType == 30) {
			int i = ((TwitchEventResult) twitchevent).result;
			if (0 == i || i == 1)
				Class239.method4340((byte) 81);
			else if (2 == i)
				aLong7649 = -3698484276435242643L * l;
		}
		if (34 == twitchevent.eventType) {
			Class292.aTwitchEventLiveStreams3159 = (TwitchEventLiveStreams) twitchevent;
			Class565.method9483(34, 0, -2122937185);
		}
		return true;
	}

	public static int method9574() {
		if (!aBool7643)
			return 12;
		Class193.method3646(Class31.aClass178_303, 336297659);
		return Class323.aTwitchTV3452.Logout();
	}

	public static void method9575() {
		if (aBool7643) {
			int i = Class323.aTwitchTV3452.ShutdownTTV();
			if (i == 0) {
				Class323.aTwitchTV3452 = null;
				aBool7643 = false;
			}
		}
	}

	public static void method9576(Class178 class178, long l, int i, int i_35_) {
		do {
			if (class178.method3309() && class178.method3059() > -1) {
				int i_36_ = class178.method3059();
				Class587 class587 = null;
				if (!aLinkedList7646.isEmpty())
					class587 = (Class587) aLinkedList7646.getFirst();
				if (null == class587 || i_36_ != -1839458529 * class587.anInt7744) {
					class178.method3060();
					aLinkedList7646.clear();
				} else {
					aLinkedList7646.removeFirst();
					class178.method3186();
					boolean bool = false;
					int i_37_;
					if (class587.aLinkedList7745.isEmpty() && class178.method3057()) {
						long l_38_ = class178.method3324((Class57.anInt746 * 1568728259), (-24538641 * Class322.anInt3445));
						i_37_ = (Class323.aTwitchTV3452.SubmitFrame(l_38_, class178.method3058(), aBool7638, i, i_35_));
						class178.method3063(l_38_);
					} else {
						class178.method3130(Class57.anInt746 * 1568728259, Class322.anInt3445 * -24538641, Class3.anIntArray33, anIntArray7644);
						Class559.method9246(Class3.anIntArray33, class587.aLinkedList7745, class587.anInt7747 * 61394403, 215874015 * class587.anInt7743, class587.aFloat7746, (byte) -27);
						i_37_ = (Class323.aTwitchTV3452.SubmitFrameRaw(Class3.anIntArray33, aBool7638, i, i_35_));
					}
					class178.method3108();
					if (i_37_ == 2072)
						aLong7623 = 4921181089270546721L * l;
					else if (23 == i_37_)
						aLong7639 = l * -6939533996358416733L;
					else if (-995 == i_37_ || 0 != i_37_)
						break;
				}
			}
		} while (false);
		if (aBool7641) {
			if (Class3.anIntArray33 == null) {
				Class3.anIntArray33 = new int[(aBool7638 ? i_35_ * i : (Class57.anInt746 * 1568728259 * (Class322.anInt3445 * -24538641)))];
				anIntArray7644 = new int[(aBool7638 ? i * i_35_ : (Class322.anInt3445 * -24538641 * (1568728259 * Class57.anInt746)))];
			}
			if (!class178.method3309()) {
				class178.method3186();
				class178.method3130(1568728259 * Class57.anInt746, Class322.anInt3445 * -24538641, Class3.anIntArray33, anIntArray7644);
				Class559.method9246(Class3.anIntArray33, aLinkedList7645, 1970564341 * class178.anInt1945, class178.anInt1937 * 1216763507, class178.aFloat1948, (byte) -95);
				int i_39_ = Class323.aTwitchTV3452.SubmitFrameRaw((Class3.anIntArray33), aBool7638, i, i_35_);
				class178.method3108();
				aLinkedList7645.clear();
				do {
					if (2072 == i_39_)
						aLong7623 = 4921181089270546721L * l;
					else if (i_39_ == 23)
						aLong7639 = -6939533996358416733L * l;
					else if (-995 == i_39_ || i_39_ != 0)
						break;
				} while (false);
			} else {
				class178.method3061(client.cycles, Class57.anInt746 * 1568728259, Class322.anInt3445 * -24538641);
				aLinkedList7646.add(new Class587(client.cycles, aLinkedList7645, (1970564341 * class178.anInt1945), (1216763507 * class178.anInt1937), class178.aFloat1948));
				aLinkedList7645 = new LinkedList();
			}
			aBool7641 = false;
		}
	}

	static void method9577() {
		if (aClass148_7626 == null || aClass148_7626.method2504() != aTwitchWebcamFrameData7642.width || (aClass148_7626.method2428() != aTwitchWebcamFrameData7642.height))
			aClass148_7626 = (Class31.aClass178_303.method3102(aTwitchWebcamFrameData7642.buffer, 0, aTwitchWebcamFrameData7642.width, aTwitchWebcamFrameData7642.width, aTwitchWebcamFrameData7642.height, false));
		else
			aClass148_7626.method2431(0, 0, aTwitchWebcamFrameData7642.width, aTwitchWebcamFrameData7642.height, aTwitchWebcamFrameData7642.buffer, 0, aTwitchWebcamFrameData7642.width);
	}

	static void method9578() {
		if (aClass148_7626 == null || aClass148_7626.method2504() != aTwitchWebcamFrameData7642.width || (aClass148_7626.method2428() != aTwitchWebcamFrameData7642.height))
			aClass148_7626 = (Class31.aClass178_303.method3102(aTwitchWebcamFrameData7642.buffer, 0, aTwitchWebcamFrameData7642.width, aTwitchWebcamFrameData7642.width, aTwitchWebcamFrameData7642.height, false));
		else
			aClass148_7626.method2431(0, 0, aTwitchWebcamFrameData7642.width, aTwitchWebcamFrameData7642.height, aTwitchWebcamFrameData7642.buffer, 0, aTwitchWebcamFrameData7642.width);
	}

	static void method9579(int i, int i_40_) {
		TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_40_);
		Class582 class582 = twitcheventresult.method6618();
		if (class582 != null)
			IOException_Sub1.method18560(class582.method82(), twitcheventresult, 1357652815);
	}

	public static void method9580() {
		aClass148_7626 = null;
	}

	public static int method9581(int i, int i_41_) {
		aTwitchWebcamFrameData7642 = new TwitchWebcamFrameData();
		if (i < 0 || i >= aTwitchWebcamDeviceArray7648.length)
			return -1;
		return (Class323.aTwitchTV3452.StartWebcamDevice(aTwitchWebcamDeviceArray7648[i].anInt1137 * -365031943, i_41_));
	}

	public static boolean method9582() {
		return (null != Class323.aTwitchTV3452 && Class323.aTwitchTV3452.IsStreaming());
	}

	public static int method9583(int i) {
		aTwitchWebcamFrameData7642 = null;
		aClass148_7626 = null;
		if (i < 0 || i >= aTwitchWebcamDeviceArray7648.length)
			return -1;
		return (Class323.aTwitchTV3452.StopWebcamDevice(-365031943 * aTwitchWebcamDeviceArray7648[i].anInt1137));
	}

	public static int method9584(int i) {
		aTwitchWebcamFrameData7642 = null;
		aClass148_7626 = null;
		if (i < 0 || i >= aTwitchWebcamDeviceArray7648.length)
			return -1;
		return (Class323.aTwitchTV3452.StopWebcamDevice(-365031943 * aTwitchWebcamDeviceArray7648[i].anInt1137));
	}

	public static int method9585(int i) {
		aTwitchWebcamFrameData7642 = null;
		aClass148_7626 = null;
		if (i < 0 || i >= aTwitchWebcamDeviceArray7648.length)
			return -1;
		return (Class323.aTwitchTV3452.StopWebcamDevice(-365031943 * aTwitchWebcamDeviceArray7648[i].anInt1137));
	}

	static void method9586() {
		aTwitchWebcamDeviceArray7648 = Class323.aTwitchTV3452.GetWebcamDevices();
	}

	static void method9587() {
		aTwitchWebcamDeviceArray7648 = Class323.aTwitchTV3452.GetWebcamDevices();
	}

	public static int method9588() {
		Class292.aTwitchEventLiveStreams3159 = null;
		int i = Class323.aTwitchTV3452.RequestLiveStreams(client.aClass681_11284.aString8647);
		return i;
	}

	public static int method9589() {
		return Class323.aTwitchTV3452.GetViewerCount();
	}

	public static TwitchWebcamDevice method9590(int i) {
		if (aTwitchWebcamDeviceArray7648 == null)
			return null;
		for (int i_42_ = 0; i_42_ < aTwitchWebcamDeviceArray7648.length; i_42_++) {
			if (aTwitchWebcamDeviceArray7648[i_42_].anInt1136 * -2015039365 == i)
				return aTwitchWebcamDeviceArray7648[i_42_];
		}
		return null;
	}

	public static TwitchWebcamDevice method9591(String string) {
		if (aTwitchWebcamDeviceArray7648 == null)
			return null;
		for (int i = 0; i < aTwitchWebcamDeviceArray7648.length; i++) {
			if (aTwitchWebcamDeviceArray7648[i].aString1134.equals(string))
				return aTwitchWebcamDeviceArray7648[i];
		}
		return null;
	}

	public static TwitchWebcamDevice method9592(String string) {
		if (aTwitchWebcamDeviceArray7648 == null)
			return null;
		for (int i = 0; i < aTwitchWebcamDeviceArray7648.length; i++) {
			if (aTwitchWebcamDeviceArray7648[i].aString1134.equals(string))
				return aTwitchWebcamDeviceArray7648[i];
		}
		return null;
	}

	public static TwitchWebcamDevice method9593(String string) {
		if (aTwitchWebcamDeviceArray7648 == null)
			return null;
		for (int i = 0; i < aTwitchWebcamDeviceArray7648.length; i++) {
			if (aTwitchWebcamDeviceArray7648[i].aString1134.equals(string))
				return aTwitchWebcamDeviceArray7648[i];
		}
		return null;
	}

	public static void method9594(boolean bool, boolean bool_43_) {
		aBool7635 = bool;
		aBool7652 = bool_43_;
	}

	public static int method9595() {
		return (aTwitchWebcamDeviceArray7648 == null ? 0 : aTwitchWebcamDeviceArray7648.length);
	}

	public static int method9596() {
		return Class323.aTwitchTV3452.GetLoginState();
	}

	public static Class148 method9597() {
		return aClass148_7626;
	}

	public static boolean method9598() {
		return (null != Class323.aTwitchTV3452 && Class323.aTwitchTV3452.IsStreaming());
	}

	public static void method9599(int i, int i_44_, int i_45_, int i_46_) {
		aLinkedList7645.addLast(new Class575(i, i_44_, i_45_ - i, i_46_ - i_44_));
	}

	public static void method9600(int i, int i_47_, int i_48_, int i_49_) {
		aLinkedList7645.addLast(new Class575(i, i_47_, i_48_ - i, i_49_ - i_47_));
	}

	static void method9601(int[] is, LinkedList linkedlist, int i, int i_50_, float f) {
		if (!linkedlist.isEmpty()) {
			for (int i_51_ = 0; i_51_ < linkedlist.size(); i_51_++) {
				Class575 class575 = (Class575) linkedlist.get(i_51_);
				int i_52_ = i + (int) ((float) (class575.anInt7687 * -1339871957) * f);
				int i_53_ = ((int) (f * (float) (class575.anInt7689 * -375858305)) + i_50_);
				int i_54_ = (int) (f * (float) (-1859048369 * class575.anInt7688));
				int i_55_ = (int) (f * (float) (1653204735 * class575.anInt7690));
				if (i_52_ < 1568728259 * Class57.anInt746 && i_53_ < Class322.anInt3445 * -24538641) {
					if (i_54_ + i_52_ > Class57.anInt746 * 1568728259)
						i_54_ = Class57.anInt746 * 1568728259 - i_52_;
					if (i_55_ + i_53_ > Class322.anInt3445 * -24538641)
						i_55_ = -24538641 * Class322.anInt3445 - i_53_;
					for (int i_56_ = i_53_; i_56_ < i_53_ + i_55_; i_56_++) {
						int i_57_ = i_56_ * (1568728259 * Class57.anInt746) + i_52_;
						Arrays.fill(is, i_57_, i_57_ + i_54_, -16777216);
					}
				}
			}
		}
	}

	public static int method9602(int i, int i_58_) {
		aTwitchWebcamFrameData7642 = new TwitchWebcamFrameData();
		if (i < 0 || i >= aTwitchWebcamDeviceArray7648.length)
			return -1;
		return (Class323.aTwitchTV3452.StartWebcamDevice(aTwitchWebcamDeviceArray7648[i].anInt1137 * -365031943, i_58_));
	}

	public static int method9603(String string) {
		return Class323.aTwitchTV3452.ChatSendMessage(string);
	}

	static final void method9604(Class669 class669, short i) {
		class669.anInt8558 -= -17422498;
		Class666 class666 = ((Class666) Class334.method5910(Class666.method13653((byte) 6), (class669.anIntArray8557[class669.anInt8558 * 1357652815]), 352639290));
		Class592 class592 = new Class592(class669.anIntArray8557[1 + 1357652815 * class669.anInt8558]);
		if (-1 == class592.anInt7809 * -608757111)
			throw new RuntimeException("");
		if (Class666.aClass666_8533 != class666 && Class666.aClass666_8531 != class666 && class666 != Class666.aClass666_8532)
			throw new RuntimeException("");
		if (null != client.aClass116_11058) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4204, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(class592.localY * 1704054549, (byte) 88);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(235453015 * class592.localX, -1309879819);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16314(class666.method82(), (byte) 14);
			client.aClass116_11058.method1974(class523_sub22, (byte) 26);
		}
	}
}
