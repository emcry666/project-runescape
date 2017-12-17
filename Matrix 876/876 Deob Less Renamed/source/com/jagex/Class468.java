/* Class468 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class468 implements Interface75 {
	int anInt5330;
	static Class468 aClass468_5331;
	static Class468 aClass468_5332 = new Class468(0);
	static Class468 aClass468_5333;

	public int method82() {
		return anInt5330 * 2061617813;
	}

	static {
		aClass468_5331 = new Class468(1);
		aClass468_5333 = new Class468(2);
	}

	public int method6() {
		return anInt5330 * 2061617813;
	}

	public int method101() {
		return anInt5330 * 2061617813;
	}

	Class468(int i) {
		anInt5330 = i * -1322536771;
	}

	public static Class468[] method7602() {
		return (new Class468[] { aClass468_5333, aClass468_5331, aClass468_5332 });
	}

	public static Class468[] method7603() {
		return (new Class468[] { aClass468_5333, aClass468_5331, aClass468_5332 });
	}

	public static Class468[] method7604() {
		return (new Class468[] { aClass468_5333, aClass468_5331, aClass468_5332 });
	}

	public static void method7605(Class47_Sub1 class47_sub1, byte i) {
		Class95.method1767(class47_sub1, 1328865451);
	}

	public static void method7606(float f, Class437 class437, Class440 class440, Class437 class437_0_, Class437 class437_1_, Class437 class437_2_, float f_3_, float f_4_, float f_5_, int i) {
		if (!class437_0_.method6880(class437)) {
			Class437 class437_6_ = Class437.method6879(0.0F, 0.0F, 0.0F);
			Class437 class437_7_ = Class437.method6884(Class437.method6932(class437_0_, class437));
			class437_7_.method6907(class440);
			Class437 class437_8_ = Class437.method6932(class437_7_, class437_6_);
			float f_9_ = class437_8_.method6958();
			if (class437_2_.aFloat4903 == Float.POSITIVE_INFINITY || Float.isNaN(class437.aFloat4903) || f_9_ > f_4_ || f_9_ < f_5_) {
				class437.method6886(class437_0_);
				class437_1_.method6887();
			} else {
				class440.method7021();
				Class437 class437_10_ = Class437.method6879(1.0F, 0.0F, 0.0F);
				Class437 class437_11_ = Class437.method6879(0.0F, 1.0F, 0.0F);
				Class437 class437_12_ = Class437.method6879(0.0F, 0.0F, 1.0F);
				class437_10_.method6907(class440);
				class437_11_.method6907(class440);
				class437_12_.method6907(class440);
				Class437 class437_13_ = Class437.method6879(Class437.method6899(class437_10_, class437_1_), Class437.method6899(class437_11_, class437_1_), Class437.method6899(class437_12_, class437_1_));
				Class437 class437_14_ = Class437.method6884(class437_13_);
				Class437 class437_15_ = (Class437.method6879(class437_2_.aFloat4903 * class437_8_.aFloat4903, class437_2_.aFloat4904 * class437_8_.aFloat4904, class437_8_.aFloat4905 * class437_2_.aFloat4905));
				class437_14_.method6891(class437_15_, f);
				class437_14_.method6905(f_3_);
				Class437 class437_16_ = Class437.method6906(class437_10_, class437_14_.aFloat4903);
				class437_16_.method6891(class437_11_, class437_14_.aFloat4904);
				class437_16_.method6891(class437_12_, class437_14_.aFloat4905);
				class437_1_.method6886(class437_16_);
				class437.method6961(Class437.method6906(class437_1_, f));
			}
		}
	}

	public static int method7607(int i) {
		if (Class292.aTwitchEventLiveStreams3159 == null || (Class569.anInt7647 * 2037822713 >= Class292.aTwitchEventLiveStreams3159.streamCount - 1))
			return -1;
		return (Class569.anInt7647 += -1915499191) * 2037822713;
	}

	public static void method7608(short i) {
		if (!Class110.aBool1331) {
			Class708.method14307((client.aClass505_11019.method8241((byte) -19).aClass565ArrayArrayArray7510), 1654592330);
			if ((client.aClass505_11019.method8241((byte) -63).aClass565ArrayArrayArray7512) != null)
				Class708.method14307((client.aClass505_11019.method8241((byte) -40).aClass565ArrayArrayArray7512), 1413838255);
			Class110.aBool1331 = true;
		}
	}

	static final void method7609(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class577.method9649(class250, class242, class669, 65535);
	}

	public static Class611_Sub1 method7610(int i) {
		Class6.anInt44 = 0;
		return Class98_Sub1.method14355(-1045742050);
	}

	public static void method7611(Class523_Sub34_Sub2 class523_sub34_sub2, int i) {
		Class523_Sub30 class523_sub30 = (Class523_Sub30) Class66.aClass708_791.method14240(1679298914);
		if (null != class523_sub30) {
			int i_17_ = 2349011 * class523_sub34_sub2.anInt10661;
			class523_sub34_sub2.writeInt((class523_sub30.anInt10570 * -1301727099), -1255508477);
			for (int i_18_ = 0; i_18_ < class523_sub30.anInt10569 * -1434523687; i_18_++) {
				if (0 != class523_sub30.anIntArray10566[i_18_])
					class523_sub34_sub2.writeByte((class523_sub30.anIntArray10566[i_18_]), 526210978);
				else {
					try {
						int i_19_ = class523_sub30.anIntArray10565[i_18_];
						if (i_19_ == 0) {
							Field field = class523_sub30.aFieldArray10567[i_18_];
							int i_20_ = field.getInt(null);
							class523_sub34_sub2.writeByte(0, 1991397745);
							class523_sub34_sub2.writeInt(i_20_, -851215655);
						} else if (i_19_ == 1) {
							Field field = class523_sub30.aFieldArray10567[i_18_];
							field.setInt(null, (class523_sub30.anIntArray10568[i_18_]));
							class523_sub34_sub2.writeByte(0, -1086036338);
						} else if (i_19_ == 2) {
							Field field = class523_sub30.aFieldArray10567[i_18_];
							int i_21_ = field.getModifiers();
							class523_sub34_sub2.writeByte(0, -1745054622);
							class523_sub34_sub2.writeInt(i_21_, -1025913272);
						}
						if (3 == i_19_) {
							Method method = class523_sub30.aMethodArray10563[i_18_];
							byte[][] is = (class523_sub30.aByteArrayArrayArray10564[i_18_]);
							Object[] objects = new Object[is.length];
							for (int i_22_ = 0; i_22_ < is.length; i_22_++) {
								ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_22_])));
								objects[i_22_] = objectinputstream.readObject();
							}
							Object object = method.invoke(null, objects);
							if (null == object)
								class523_sub34_sub2.writeByte(0, 1924699924);
							else if (object instanceof Number) {
								class523_sub34_sub2.writeByte(1, 517075612);
								class523_sub34_sub2.method16441(((Number) object).longValue());
							} else if (object instanceof String) {
								class523_sub34_sub2.writeByte(2, 2018196150);
								class523_sub34_sub2.method16270((String) object, (byte) -79);
							} else
								class523_sub34_sub2.writeByte(4, -2094920108);
						} else if (4 == i_19_) {
							Method method = class523_sub30.aMethodArray10563[i_18_];
							int i_23_ = method.getModifiers();
							class523_sub34_sub2.writeByte(0, 1915870268);
							class523_sub34_sub2.writeInt(i_23_, -1726967567);
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class523_sub34_sub2.writeByte(-10, -1311469723);
					} catch (InvalidClassException invalidclassexception) {
						class523_sub34_sub2.writeByte(-11, -1611337028);
					} catch (StreamCorruptedException streamcorruptedexception) {
						class523_sub34_sub2.writeByte(-12, -294701850);
					} catch (OptionalDataException optionaldataexception) {
						class523_sub34_sub2.writeByte(-13, -1103317585);
					} catch (IllegalAccessException illegalaccessexception) {
						class523_sub34_sub2.writeByte(-14, 1684107190);
					} catch (IllegalArgumentException illegalargumentexception) {
						class523_sub34_sub2.writeByte(-15, -925031938);
					} catch (InvocationTargetException invocationtargetexception) {
						class523_sub34_sub2.writeByte(-16, 1545934346);
					} catch (SecurityException securityexception) {
						class523_sub34_sub2.writeByte(-17, -1572650989);
					} catch (IOException ioexception) {
						class523_sub34_sub2.writeByte(-18, -1311981563);
					} catch (NullPointerException nullpointerexception) {
						class523_sub34_sub2.writeByte(-19, 964082408);
					} catch (Exception exception) {
						class523_sub34_sub2.writeByte(-20, 1636916544);
					} catch (Throwable throwable) {
						class523_sub34_sub2.writeByte(-21, 235132954);
					}
				}
			}
			class523_sub34_sub2.method16312(i_17_, 175251813);
			class523_sub30.method8661(607052656);
		}
	}
}
