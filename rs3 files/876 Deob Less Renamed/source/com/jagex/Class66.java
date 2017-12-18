/* Class66 - Decompiled by JODE
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

public class Class66 {
	static Class708 aClass708_791 = new Class708();

	public static void method1438(Class523_Sub34_Sub2 class523_sub34_sub2) {
		Class523_Sub30 class523_sub30 = (Class523_Sub30) aClass708_791.method14240(2040126335);
		if (null != class523_sub30) {
			int i = 2349011 * class523_sub34_sub2.anInt10661;
			class523_sub34_sub2.writeInt((class523_sub30.anInt10570 * -1301727099), -1491034603);
			for (int i_0_ = 0; i_0_ < class523_sub30.anInt10569 * -1434523687; i_0_++) {
				if (0 != class523_sub30.anIntArray10566[i_0_])
					class523_sub34_sub2.writeByte((class523_sub30.anIntArray10566[i_0_]), 209294173);
				else {
					try {
						int i_1_ = class523_sub30.anIntArray10565[i_0_];
						if (i_1_ == 0) {
							Field field = class523_sub30.aFieldArray10567[i_0_];
							int i_2_ = field.getInt(null);
							class523_sub34_sub2.writeByte(0, -665657097);
							class523_sub34_sub2.writeInt(i_2_, -1198464723);
						} else if (i_1_ == 1) {
							Field field = class523_sub30.aFieldArray10567[i_0_];
							field.setInt(null, class523_sub30.anIntArray10568[i_0_]);
							class523_sub34_sub2.writeByte(0, 340686231);
						} else if (i_1_ == 2) {
							Field field = class523_sub30.aFieldArray10567[i_0_];
							int i_3_ = field.getModifiers();
							class523_sub34_sub2.writeByte(0, -1506603894);
							class523_sub34_sub2.writeInt(i_3_, -2114459049);
						}
						if (3 == i_1_) {
							Method method = class523_sub30.aMethodArray10563[i_0_];
							byte[][] is = (class523_sub30.aByteArrayArrayArray10564[i_0_]);
							Object[] objects = new Object[is.length];
							for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
								ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_4_])));
								objects[i_4_] = objectinputstream.readObject();
							}
							Object object = method.invoke(null, objects);
							if (null == object)
								class523_sub34_sub2.writeByte(0, -1011210924);
							else if (object instanceof Number) {
								class523_sub34_sub2.writeByte(1, -139461962);
								class523_sub34_sub2.method16441(((Number) object).longValue());
							} else if (object instanceof String) {
								class523_sub34_sub2.writeByte(2, -559551566);
								class523_sub34_sub2.method16270((String) object, (byte) 13);
							} else
								class523_sub34_sub2.writeByte(4, 2024394809);
						} else if (4 == i_1_) {
							Method method = class523_sub30.aMethodArray10563[i_0_];
							int i_5_ = method.getModifiers();
							class523_sub34_sub2.writeByte(0, 2025217046);
							class523_sub34_sub2.writeInt(i_5_, -1969386121);
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class523_sub34_sub2.writeByte(-10, 152634307);
					} catch (InvalidClassException invalidclassexception) {
						class523_sub34_sub2.writeByte(-11, 622661567);
					} catch (StreamCorruptedException streamcorruptedexception) {
						class523_sub34_sub2.writeByte(-12, 560458760);
					} catch (OptionalDataException optionaldataexception) {
						class523_sub34_sub2.writeByte(-13, 618695255);
					} catch (IllegalAccessException illegalaccessexception) {
						class523_sub34_sub2.writeByte(-14, -1831002422);
					} catch (IllegalArgumentException illegalargumentexception) {
						class523_sub34_sub2.writeByte(-15, 1614010240);
					} catch (InvocationTargetException invocationtargetexception) {
						class523_sub34_sub2.writeByte(-16, -1900891922);
					} catch (SecurityException securityexception) {
						class523_sub34_sub2.writeByte(-17, 2105569635);
					} catch (IOException ioexception) {
						class523_sub34_sub2.writeByte(-18, 841443207);
					} catch (NullPointerException nullpointerexception) {
						class523_sub34_sub2.writeByte(-19, -1503788987);
					} catch (Exception exception) {
						class523_sub34_sub2.writeByte(-20, 328722926);
					} catch (Throwable throwable) {
						class523_sub34_sub2.writeByte(-21, 1759281938);
					}
				}
			}
			class523_sub34_sub2.method16312(i, 175251813);
			class523_sub30.method8661(607052656);
		}
	}

	public static void method1439() {
		aClass708_791 = new Class708();
	}

	public static void method1440(Class523_Sub34_Sub2 class523_sub34_sub2) {
		Class523_Sub30 class523_sub30 = (Class523_Sub30) aClass708_791.method14240(1229544293);
		if (null != class523_sub30) {
			int i = 2349011 * class523_sub34_sub2.anInt10661;
			class523_sub34_sub2.writeInt((class523_sub30.anInt10570 * -1301727099), -2010010126);
			for (int i_6_ = 0; i_6_ < class523_sub30.anInt10569 * -1434523687; i_6_++) {
				if (0 != class523_sub30.anIntArray10566[i_6_])
					class523_sub34_sub2.writeByte((class523_sub30.anIntArray10566[i_6_]), -108819817);
				else {
					try {
						int i_7_ = class523_sub30.anIntArray10565[i_6_];
						if (i_7_ == 0) {
							Field field = class523_sub30.aFieldArray10567[i_6_];
							int i_8_ = field.getInt(null);
							class523_sub34_sub2.writeByte(0, 871434370);
							class523_sub34_sub2.writeInt(i_8_, -1511585156);
						} else if (i_7_ == 1) {
							Field field = class523_sub30.aFieldArray10567[i_6_];
							field.setInt(null, class523_sub30.anIntArray10568[i_6_]);
							class523_sub34_sub2.writeByte(0, 1513750748);
						} else if (i_7_ == 2) {
							Field field = class523_sub30.aFieldArray10567[i_6_];
							int i_9_ = field.getModifiers();
							class523_sub34_sub2.writeByte(0, 1931154893);
							class523_sub34_sub2.writeInt(i_9_, -1457219719);
						}
						if (3 == i_7_) {
							Method method = class523_sub30.aMethodArray10563[i_6_];
							byte[][] is = (class523_sub30.aByteArrayArrayArray10564[i_6_]);
							Object[] objects = new Object[is.length];
							for (int i_10_ = 0; i_10_ < is.length; i_10_++) {
								ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_10_])));
								objects[i_10_] = objectinputstream.readObject();
							}
							Object object = method.invoke(null, objects);
							if (null == object)
								class523_sub34_sub2.writeByte(0, -1400494462);
							else if (object instanceof Number) {
								class523_sub34_sub2.writeByte(1, -1069859777);
								class523_sub34_sub2.method16441(((Number) object).longValue());
							} else if (object instanceof String) {
								class523_sub34_sub2.writeByte(2, 414482417);
								class523_sub34_sub2.method16270((String) object, (byte) -52);
							} else
								class523_sub34_sub2.writeByte(4, 401987057);
						} else if (4 == i_7_) {
							Method method = class523_sub30.aMethodArray10563[i_6_];
							int i_11_ = method.getModifiers();
							class523_sub34_sub2.writeByte(0, -960952711);
							class523_sub34_sub2.writeInt(i_11_, -2095690680);
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class523_sub34_sub2.writeByte(-10, -2003875185);
					} catch (InvalidClassException invalidclassexception) {
						class523_sub34_sub2.writeByte(-11, 1679093220);
					} catch (StreamCorruptedException streamcorruptedexception) {
						class523_sub34_sub2.writeByte(-12, 1826731877);
					} catch (OptionalDataException optionaldataexception) {
						class523_sub34_sub2.writeByte(-13, 824783621);
					} catch (IllegalAccessException illegalaccessexception) {
						class523_sub34_sub2.writeByte(-14, -758445969);
					} catch (IllegalArgumentException illegalargumentexception) {
						class523_sub34_sub2.writeByte(-15, -145128634);
					} catch (InvocationTargetException invocationtargetexception) {
						class523_sub34_sub2.writeByte(-16, -494300562);
					} catch (SecurityException securityexception) {
						class523_sub34_sub2.writeByte(-17, 302779708);
					} catch (IOException ioexception) {
						class523_sub34_sub2.writeByte(-18, 63847918);
					} catch (NullPointerException nullpointerexception) {
						class523_sub34_sub2.writeByte(-19, -1093940683);
					} catch (Exception exception) {
						class523_sub34_sub2.writeByte(-20, -391359649);
					} catch (Throwable throwable) {
						class523_sub34_sub2.writeByte(-21, -1113861945);
					}
				}
			}
			class523_sub34_sub2.method16312(i, 175251813);
			class523_sub30.method8661(607052656);
		}
	}

	public static void method1441() {
		aClass708_791 = new Class708();
	}

	public static boolean method1442() {
		Class523_Sub30 class523_sub30 = (Class523_Sub30) aClass708_791.method14240(1034420281);
		if (null == class523_sub30)
			return false;
		return true;
	}

	public static boolean method1443() {
		Class523_Sub30 class523_sub30 = (Class523_Sub30) aClass708_791.method14240(1219446738);
		if (null == class523_sub30)
			return false;
		return true;
	}

	public static void method1444() {
		aClass708_791 = new Class708();
	}

	public static void method1445(Class523_Sub34_Sub2 class523_sub34_sub2) {
		Class523_Sub30 class523_sub30 = (Class523_Sub30) aClass708_791.method14240(1942655380);
		if (null != class523_sub30) {
			int i = 2349011 * class523_sub34_sub2.anInt10661;
			class523_sub34_sub2.writeInt((class523_sub30.anInt10570 * -1301727099), -1299467225);
			for (int i_12_ = 0; i_12_ < class523_sub30.anInt10569 * -1434523687; i_12_++) {
				if (0 != class523_sub30.anIntArray10566[i_12_])
					class523_sub34_sub2.writeByte((class523_sub30.anIntArray10566[i_12_]), 92210376);
				else {
					try {
						int i_13_ = class523_sub30.anIntArray10565[i_12_];
						if (i_13_ == 0) {
							Field field = class523_sub30.aFieldArray10567[i_12_];
							int i_14_ = field.getInt(null);
							class523_sub34_sub2.writeByte(0, 457076975);
							class523_sub34_sub2.writeInt(i_14_, -980151393);
						} else if (i_13_ == 1) {
							Field field = class523_sub30.aFieldArray10567[i_12_];
							field.setInt(null, (class523_sub30.anIntArray10568[i_12_]));
							class523_sub34_sub2.writeByte(0, 421334558);
						} else if (i_13_ == 2) {
							Field field = class523_sub30.aFieldArray10567[i_12_];
							int i_15_ = field.getModifiers();
							class523_sub34_sub2.writeByte(0, 1116300235);
							class523_sub34_sub2.writeInt(i_15_, -1424016040);
						}
						if (3 == i_13_) {
							Method method = class523_sub30.aMethodArray10563[i_12_];
							byte[][] is = (class523_sub30.aByteArrayArrayArray10564[i_12_]);
							Object[] objects = new Object[is.length];
							for (int i_16_ = 0; i_16_ < is.length; i_16_++) {
								ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_16_])));
								objects[i_16_] = objectinputstream.readObject();
							}
							Object object = method.invoke(null, objects);
							if (null == object)
								class523_sub34_sub2.writeByte(0, -1938326936);
							else if (object instanceof Number) {
								class523_sub34_sub2.writeByte(1, 1378671598);
								class523_sub34_sub2.method16441(((Number) object).longValue());
							} else if (object instanceof String) {
								class523_sub34_sub2.writeByte(2, 2137174689);
								class523_sub34_sub2.method16270((String) object, (byte) -37);
							} else
								class523_sub34_sub2.writeByte(4, -714625911);
						} else if (4 == i_13_) {
							Method method = class523_sub30.aMethodArray10563[i_12_];
							int i_17_ = method.getModifiers();
							class523_sub34_sub2.writeByte(0, -631686316);
							class523_sub34_sub2.writeInt(i_17_, -1481396536);
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class523_sub34_sub2.writeByte(-10, 1796055363);
					} catch (InvalidClassException invalidclassexception) {
						class523_sub34_sub2.writeByte(-11, -1593557843);
					} catch (StreamCorruptedException streamcorruptedexception) {
						class523_sub34_sub2.writeByte(-12, 987229393);
					} catch (OptionalDataException optionaldataexception) {
						class523_sub34_sub2.writeByte(-13, -360023159);
					} catch (IllegalAccessException illegalaccessexception) {
						class523_sub34_sub2.writeByte(-14, -1987841922);
					} catch (IllegalArgumentException illegalargumentexception) {
						class523_sub34_sub2.writeByte(-15, -335817850);
					} catch (InvocationTargetException invocationtargetexception) {
						class523_sub34_sub2.writeByte(-16, 934079678);
					} catch (SecurityException securityexception) {
						class523_sub34_sub2.writeByte(-17, -159366638);
					} catch (IOException ioexception) {
						class523_sub34_sub2.writeByte(-18, 1065757375);
					} catch (NullPointerException nullpointerexception) {
						class523_sub34_sub2.writeByte(-19, 609391231);
					} catch (Exception exception) {
						class523_sub34_sub2.writeByte(-20, 946089720);
					} catch (Throwable throwable) {
						class523_sub34_sub2.writeByte(-21, -570442995);
					}
				}
			}
			class523_sub34_sub2.method16312(i, 175251813);
			class523_sub30.method8661(607052656);
		}
	}

	public static void method1446(Class523_Sub34_Sub2 class523_sub34_sub2) {
		Class523_Sub30 class523_sub30 = (Class523_Sub30) aClass708_791.method14240(1661046166);
		if (null != class523_sub30) {
			int i = 2349011 * class523_sub34_sub2.anInt10661;
			class523_sub34_sub2.writeInt((class523_sub30.anInt10570 * -1301727099), -982720511);
			for (int i_18_ = 0; i_18_ < class523_sub30.anInt10569 * -1434523687; i_18_++) {
				if (0 != class523_sub30.anIntArray10566[i_18_])
					class523_sub34_sub2.writeByte((class523_sub30.anIntArray10566[i_18_]), -1654881096);
				else {
					try {
						int i_19_ = class523_sub30.anIntArray10565[i_18_];
						if (i_19_ == 0) {
							Field field = class523_sub30.aFieldArray10567[i_18_];
							int i_20_ = field.getInt(null);
							class523_sub34_sub2.writeByte(0, -1511720193);
							class523_sub34_sub2.writeInt(i_20_, -829125457);
						} else if (i_19_ == 1) {
							Field field = class523_sub30.aFieldArray10567[i_18_];
							field.setInt(null, (class523_sub30.anIntArray10568[i_18_]));
							class523_sub34_sub2.writeByte(0, -1221807433);
						} else if (i_19_ == 2) {
							Field field = class523_sub30.aFieldArray10567[i_18_];
							int i_21_ = field.getModifiers();
							class523_sub34_sub2.writeByte(0, 58182054);
							class523_sub34_sub2.writeInt(i_21_, -1332799802);
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
								class523_sub34_sub2.writeByte(0, -770578264);
							else if (object instanceof Number) {
								class523_sub34_sub2.writeByte(1, 1535354488);
								class523_sub34_sub2.method16441(((Number) object).longValue());
							} else if (object instanceof String) {
								class523_sub34_sub2.writeByte(2, -1622936124);
								class523_sub34_sub2.method16270((String) object, (byte) 62);
							} else
								class523_sub34_sub2.writeByte(4, 1866127898);
						} else if (4 == i_19_) {
							Method method = class523_sub30.aMethodArray10563[i_18_];
							int i_23_ = method.getModifiers();
							class523_sub34_sub2.writeByte(0, -1604380576);
							class523_sub34_sub2.writeInt(i_23_, -898309119);
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class523_sub34_sub2.writeByte(-10, -1564985231);
					} catch (InvalidClassException invalidclassexception) {
						class523_sub34_sub2.writeByte(-11, 707868280);
					} catch (StreamCorruptedException streamcorruptedexception) {
						class523_sub34_sub2.writeByte(-12, -1654590540);
					} catch (OptionalDataException optionaldataexception) {
						class523_sub34_sub2.writeByte(-13, 1696075585);
					} catch (IllegalAccessException illegalaccessexception) {
						class523_sub34_sub2.writeByte(-14, -193556355);
					} catch (IllegalArgumentException illegalargumentexception) {
						class523_sub34_sub2.writeByte(-15, -1134103110);
					} catch (InvocationTargetException invocationtargetexception) {
						class523_sub34_sub2.writeByte(-16, 186256083);
					} catch (SecurityException securityexception) {
						class523_sub34_sub2.writeByte(-17, 86221883);
					} catch (IOException ioexception) {
						class523_sub34_sub2.writeByte(-18, -335397824);
					} catch (NullPointerException nullpointerexception) {
						class523_sub34_sub2.writeByte(-19, 1876080900);
					} catch (Exception exception) {
						class523_sub34_sub2.writeByte(-20, 1765315297);
					} catch (Throwable throwable) {
						class523_sub34_sub2.writeByte(-21, -771396657);
					}
				}
			}
			class523_sub34_sub2.method16312(i, 175251813);
			class523_sub30.method8661(607052656);
		}
	}

	public static void method1447(Class523_Sub34_Sub2 class523_sub34_sub2) {
		Class523_Sub30 class523_sub30 = (Class523_Sub30) aClass708_791.method14240(1248062469);
		if (null != class523_sub30) {
			int i = 2349011 * class523_sub34_sub2.anInt10661;
			class523_sub34_sub2.writeInt((class523_sub30.anInt10570 * -1301727099), -2091123044);
			for (int i_24_ = 0; i_24_ < class523_sub30.anInt10569 * -1434523687; i_24_++) {
				if (0 != class523_sub30.anIntArray10566[i_24_])
					class523_sub34_sub2.writeByte((class523_sub30.anIntArray10566[i_24_]), 642787697);
				else {
					try {
						int i_25_ = class523_sub30.anIntArray10565[i_24_];
						if (i_25_ == 0) {
							Field field = class523_sub30.aFieldArray10567[i_24_];
							int i_26_ = field.getInt(null);
							class523_sub34_sub2.writeByte(0, 1138953310);
							class523_sub34_sub2.writeInt(i_26_, -1482303558);
						} else if (i_25_ == 1) {
							Field field = class523_sub30.aFieldArray10567[i_24_];
							field.setInt(null, (class523_sub30.anIntArray10568[i_24_]));
							class523_sub34_sub2.writeByte(0, 1253855324);
						} else if (i_25_ == 2) {
							Field field = class523_sub30.aFieldArray10567[i_24_];
							int i_27_ = field.getModifiers();
							class523_sub34_sub2.writeByte(0, 1291966989);
							class523_sub34_sub2.writeInt(i_27_, -2082386678);
						}
						if (3 == i_25_) {
							Method method = class523_sub30.aMethodArray10563[i_24_];
							byte[][] is = (class523_sub30.aByteArrayArrayArray10564[i_24_]);
							Object[] objects = new Object[is.length];
							for (int i_28_ = 0; i_28_ < is.length; i_28_++) {
								ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_28_])));
								objects[i_28_] = objectinputstream.readObject();
							}
							Object object = method.invoke(null, objects);
							if (null == object)
								class523_sub34_sub2.writeByte(0, 1965856721);
							else if (object instanceof Number) {
								class523_sub34_sub2.writeByte(1, 1401668704);
								class523_sub34_sub2.method16441(((Number) object).longValue());
							} else if (object instanceof String) {
								class523_sub34_sub2.writeByte(2, 925199055);
								class523_sub34_sub2.method16270((String) object, (byte) 83);
							} else
								class523_sub34_sub2.writeByte(4, -1444633451);
						} else if (4 == i_25_) {
							Method method = class523_sub30.aMethodArray10563[i_24_];
							int i_29_ = method.getModifiers();
							class523_sub34_sub2.writeByte(0, 40717111);
							class523_sub34_sub2.writeInt(i_29_, -1158963576);
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class523_sub34_sub2.writeByte(-10, -86998988);
					} catch (InvalidClassException invalidclassexception) {
						class523_sub34_sub2.writeByte(-11, 962051800);
					} catch (StreamCorruptedException streamcorruptedexception) {
						class523_sub34_sub2.writeByte(-12, 191980697);
					} catch (OptionalDataException optionaldataexception) {
						class523_sub34_sub2.writeByte(-13, 1081605510);
					} catch (IllegalAccessException illegalaccessexception) {
						class523_sub34_sub2.writeByte(-14, 2120051599);
					} catch (IllegalArgumentException illegalargumentexception) {
						class523_sub34_sub2.writeByte(-15, 1423339556);
					} catch (InvocationTargetException invocationtargetexception) {
						class523_sub34_sub2.writeByte(-16, -1400473384);
					} catch (SecurityException securityexception) {
						class523_sub34_sub2.writeByte(-17, -429584204);
					} catch (IOException ioexception) {
						class523_sub34_sub2.writeByte(-18, -1867104066);
					} catch (NullPointerException nullpointerexception) {
						class523_sub34_sub2.writeByte(-19, -1138771090);
					} catch (Exception exception) {
						class523_sub34_sub2.writeByte(-20, -2114312284);
					} catch (Throwable throwable) {
						class523_sub34_sub2.writeByte(-21, -1224310587);
					}
				}
			}
			class523_sub34_sub2.method16312(i, 175251813);
			class523_sub30.method8661(607052656);
		}
	}

	public static void method1448(Class523_Sub34 class523_sub34, int i) {
		Class523_Sub30 class523_sub30 = new Class523_Sub30();
		class523_sub30.anInt10569 = class523_sub34.readUnsignedByte(1976951440) * 954280041;
		class523_sub30.anInt10570 = class523_sub34.readUnsignedInt((byte) -119) * -116260787;
		class523_sub30.anIntArray10565 = new int[-1434523687 * class523_sub30.anInt10569];
		class523_sub30.anIntArray10566 = new int[-1434523687 * class523_sub30.anInt10569];
		class523_sub30.aFieldArray10567 = new Field[class523_sub30.anInt10569 * -1434523687];
		class523_sub30.anIntArray10568 = new int[class523_sub30.anInt10569 * -1434523687];
		class523_sub30.aMethodArray10563 = new Method[class523_sub30.anInt10569 * -1434523687];
		class523_sub30.aByteArrayArrayArray10564 = new byte[-1434523687 * class523_sub30.anInt10569][][];
		for (int i_30_ = 0; i_30_ < -1434523687 * class523_sub30.anInt10569; i_30_++) {
			try {
				int i_31_ = class523_sub34.readUnsignedByte(-1964667659);
				if (i_31_ == 0 || 1 == i_31_ || i_31_ == 2) {
					String string = class523_sub34.readString(378554348);
					String string_32_ = class523_sub34.readString(-168308904);
					int i_33_ = 0;
					if (i_31_ == 1)
						i_33_ = class523_sub34.readUnsignedInt((byte) -100);
					class523_sub30.anIntArray10565[i_30_] = i_31_;
					class523_sub30.anIntArray10568[i_30_] = i_33_;
					if (Class365.method6298(string, (byte) 76).getClassLoader() == null)
						throw new SecurityException();
					class523_sub30.aFieldArray10567[i_30_] = Class365.method6298(string, (byte) 63).getDeclaredField(string_32_);
				} else if (i_31_ == 3 || 4 == i_31_) {
					String string = class523_sub34.readString(149963313);
					String string_34_ = class523_sub34.readString(-1792208314);
					int i_35_ = class523_sub34.readUnsignedByte(-874444553);
					String[] strings = new String[i_35_];
					for (int i_36_ = 0; i_36_ < i_35_; i_36_++)
						strings[i_36_] = class523_sub34.readString(-756352308);
					String string_37_ = class523_sub34.readString(-1797768960);
					byte[][] is = new byte[i_35_][];
					if (i_31_ == 3) {
						for (int i_38_ = 0; i_38_ < i_35_; i_38_++) {
							int i_39_ = class523_sub34.readUnsignedInt((byte) -119);
							is[i_38_] = new byte[i_39_];
							class523_sub34.method16298(is[i_38_], 0, i_39_, (byte) -28);
						}
					}
					class523_sub30.anIntArray10565[i_30_] = i_31_;
					Class[] var_classes = new Class[i_35_];
					for (int i_40_ = 0; i_40_ < i_35_; i_40_++)
						var_classes[i_40_] = Class365.method6298(strings[i_40_], (byte) 75);
					Class var_class = Class365.method6298(string_37_, (byte) 96);
					if (Class365.method6298(string, (byte) 28).getClassLoader() == null)
						throw new SecurityException();
					Method[] methods = Class365.method6298(string, (byte) 70).getDeclaredMethods();
					Method[] methods_41_ = methods;
					for (int i_42_ = 0; i_42_ < methods_41_.length; i_42_++) {
						Method method = methods_41_[i_42_];
						if (method.getName().equals(string_34_)) {
							Class[] var_classes_43_ = method.getParameterTypes();
							if (var_classes_43_.length == var_classes.length) {
								boolean bool = true;
								for (int i_44_ = 0; i_44_ < var_classes.length; i_44_++) {
									if (var_classes[i_44_] != var_classes_43_[i_44_]) {
										bool = false;
										break;
									}
								}
								if (bool && var_class == method.getReturnType())
									class523_sub30.aMethodArray10563[i_30_] = method;
							}
						}
					}
					class523_sub30.aByteArrayArrayArray10564[i_30_] = is;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				class523_sub30.anIntArray10566[i_30_] = -1;
			} catch (SecurityException securityexception) {
				class523_sub30.anIntArray10566[i_30_] = -2;
			} catch (NullPointerException nullpointerexception) {
				class523_sub30.anIntArray10566[i_30_] = -3;
			} catch (Exception exception) {
				class523_sub30.anIntArray10566[i_30_] = -4;
			} catch (Throwable throwable) {
				class523_sub30.anIntArray10566[i_30_] = -5;
			}
		}
		aClass708_791.method14236(class523_sub30, -202086639);
	}

	public static void method1449(Class523_Sub34 class523_sub34, int i) {
		Class523_Sub30 class523_sub30 = new Class523_Sub30();
		class523_sub30.anInt10569 = class523_sub34.readUnsignedByte(-516718349) * 954280041;
		class523_sub30.anInt10570 = class523_sub34.readUnsignedInt((byte) -57) * -116260787;
		class523_sub30.anIntArray10565 = new int[-1434523687 * class523_sub30.anInt10569];
		class523_sub30.anIntArray10566 = new int[-1434523687 * class523_sub30.anInt10569];
		class523_sub30.aFieldArray10567 = new Field[class523_sub30.anInt10569 * -1434523687];
		class523_sub30.anIntArray10568 = new int[class523_sub30.anInt10569 * -1434523687];
		class523_sub30.aMethodArray10563 = new Method[class523_sub30.anInt10569 * -1434523687];
		class523_sub30.aByteArrayArrayArray10564 = new byte[-1434523687 * class523_sub30.anInt10569][][];
		for (int i_45_ = 0; i_45_ < -1434523687 * class523_sub30.anInt10569; i_45_++) {
			try {
				int i_46_ = class523_sub34.readUnsignedByte(-1223212452);
				if (i_46_ == 0 || 1 == i_46_ || i_46_ == 2) {
					String string = class523_sub34.readString(-653755125);
					String string_47_ = class523_sub34.readString(-172413574);
					int i_48_ = 0;
					if (i_46_ == 1)
						i_48_ = class523_sub34.readUnsignedInt((byte) -27);
					class523_sub30.anIntArray10565[i_45_] = i_46_;
					class523_sub30.anIntArray10568[i_45_] = i_48_;
					if (Class365.method6298(string, (byte) 40).getClassLoader() == null)
						throw new SecurityException();
					class523_sub30.aFieldArray10567[i_45_] = Class365.method6298(string, (byte) 102).getDeclaredField(string_47_);
				} else if (i_46_ == 3 || 4 == i_46_) {
					String string = class523_sub34.readString(-558983921);
					String string_49_ = class523_sub34.readString(-554416883);
					int i_50_ = class523_sub34.readUnsignedByte(-565039169);
					String[] strings = new String[i_50_];
					for (int i_51_ = 0; i_51_ < i_50_; i_51_++)
						strings[i_51_] = class523_sub34.readString(-1937356057);
					String string_52_ = class523_sub34.readString(-1912329616);
					byte[][] is = new byte[i_50_][];
					if (i_46_ == 3) {
						for (int i_53_ = 0; i_53_ < i_50_; i_53_++) {
							int i_54_ = class523_sub34.readUnsignedInt((byte) -38);
							is[i_53_] = new byte[i_54_];
							class523_sub34.method16298(is[i_53_], 0, i_54_, (byte) -99);
						}
					}
					class523_sub30.anIntArray10565[i_45_] = i_46_;
					Class[] var_classes = new Class[i_50_];
					for (int i_55_ = 0; i_55_ < i_50_; i_55_++)
						var_classes[i_55_] = Class365.method6298(strings[i_55_], (byte) 39);
					Class var_class = Class365.method6298(string_52_, (byte) 64);
					if (Class365.method6298(string, (byte) 96).getClassLoader() == null)
						throw new SecurityException();
					Method[] methods = Class365.method6298(string, (byte) 34).getDeclaredMethods();
					Method[] methods_56_ = methods;
					for (int i_57_ = 0; i_57_ < methods_56_.length; i_57_++) {
						Method method = methods_56_[i_57_];
						if (method.getName().equals(string_49_)) {
							Class[] var_classes_58_ = method.getParameterTypes();
							if (var_classes_58_.length == var_classes.length) {
								boolean bool = true;
								for (int i_59_ = 0; i_59_ < var_classes.length; i_59_++) {
									if (var_classes[i_59_] != var_classes_58_[i_59_]) {
										bool = false;
										break;
									}
								}
								if (bool && var_class == method.getReturnType())
									class523_sub30.aMethodArray10563[i_45_] = method;
							}
						}
					}
					class523_sub30.aByteArrayArrayArray10564[i_45_] = is;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				class523_sub30.anIntArray10566[i_45_] = -1;
			} catch (SecurityException securityexception) {
				class523_sub30.anIntArray10566[i_45_] = -2;
			} catch (NullPointerException nullpointerexception) {
				class523_sub30.anIntArray10566[i_45_] = -3;
			} catch (Exception exception) {
				class523_sub30.anIntArray10566[i_45_] = -4;
			} catch (Throwable throwable) {
				class523_sub30.anIntArray10566[i_45_] = -5;
			}
		}
		aClass708_791.method14236(class523_sub30, 904401948);
	}

	Class66() throws Throwable {
		throw new Error();
	}

	static Class method1450(String string) throws ClassNotFoundException {
		if (string.equals("B"))
			return Byte.TYPE;
		if (string.equals("I"))
			return Integer.TYPE;
		if (string.equals("S"))
			return Short.TYPE;
		if (string.equals("J"))
			return Long.TYPE;
		if (string.equals("Z"))
			return Boolean.TYPE;
		if (string.equals("F"))
			return Float.TYPE;
		if (string.equals("D"))
			return Double.TYPE;
		if (string.equals("C"))
			return Character.TYPE;
		if (string.equals("void"))
			return Void.TYPE;
		return Class.forName(string);
	}
}
