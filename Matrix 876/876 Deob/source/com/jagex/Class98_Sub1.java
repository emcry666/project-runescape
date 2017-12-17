/* Class98_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Map;

public abstract class Class98_Sub1 extends Class98 implements Interface54 {
	protected VarDomainType aClass470_8890;

	public Object method370(int i) {
		Class159 class159 = (Class159) getDefinition(i, (byte) -64);
		if (class159 == null || !class159.method2559((byte) -12))
			return null;
		return class159.method2560(9448153);
	}

	public void method14341(RSBuffer class523_sub34, Class426 class426, byte i) {
		class523_sub34.writeShort(class426.anInt4821 * -408785679, (byte) -57);
		if (class426.anObject4822 instanceof Integer)
			class523_sub34.writeInt(((Integer) class426.anObject4822).intValue(), -736341563);
		else if (class426.anObject4822 instanceof Long)
			class523_sub34.method16441(((Long) class426.anObject4822).longValue());
		else if (class426.anObject4822 instanceof String)
			class523_sub34.method16266((String) class426.anObject4822, -1217966276);
		else if (class426.anObject4822 instanceof Interface9)
			((Interface9) class426.anObject4822).method57(class523_sub34, -42543758);
		else
			throw new IllegalStateException();
	}

	public int method69(int i) {
		return anInt1185 * -1994361779;
	}

	public Object method372(int i, byte i_0_) {
		Class159 class159 = (Class159) getDefinition(i, (byte) -38);
		if (class159 == null || !class159.method2559((byte) 61))
			return null;
		return class159.method2560(-905488769);
	}

	public int method14342(Class426 class426, int i) {
		int i_1_ = 2;
		if (class426.anObject4822 instanceof Integer)
			i_1_ += 4;
		else if (class426.anObject4822 instanceof Long)
			i_1_ += 8;
		else if (class426.anObject4822 instanceof String)
			i_1_ += Class57.method1388((String) class426.anObject4822, 1399579027);
		else if (class426.anObject4822 instanceof Interface9)
			i_1_ += ((Interface9) class426.anObject4822).method61((byte) 8);
		else
			throw new IllegalStateException();
		return i_1_;
	}

	Class98_Sub1(Class681 class681, VarDomainType class470, Class668 class668, int i) {
		super(class681, class668, i);
		aClass470_8890 = class470;
	}

	public Class426 refreshNIS(RSBuffer buffer, int i) {
		int id = buffer.readUnsignedShort(-566477946);
		Class159 class159 = (Class159) getDefinition(id, (byte) -19);
		if (!class159.method2559((byte) 74))
			throw new IllegalStateException("");
		Class426 class426 = new Class426(id);
		Class var_class = class159.aClass464_1756.method7527(2146361514).aClass5388;
		if (java.lang.Integer.class == var_class)
			class426.anObject4822 = Integer.valueOf(buffer.readUnsignedInt((byte) -20));
		else if (java.lang.Long.class == var_class)
			class426.anObject4822 = Long.valueOf(buffer.readLong((byte) -62));
		else if (java.lang.String.class == var_class)
			class426.anObject4822 = buffer.readVersionedString(2086386037);
		else if (com.jagex.Interface9.class.isAssignableFrom(var_class)) {
			try {
				Interface9 interface9 = (Interface9) var_class.newInstance();
				interface9.method59(buffer, 229719519);
				class426.anObject4822 = interface9;
			} catch (InstantiationException instantiationexception) {
				/* empty */
			} catch (IllegalAccessException illegalaccessexception) {
				/* empty */
			}
		} else
			throw new IllegalStateException();
		return class426;
	}

	public Class426 method14344(RSBuffer class523_sub34, BaseVarType class474, byte i) {
		int i_3_ = class523_sub34.readUnsignedShort(-1421566624);
		Class426 class426 = new Class426(i_3_);
		Class var_class = class474.aClass5388;
		if (java.lang.Integer.class == var_class)
			class426.anObject4822 = Integer.valueOf(class523_sub34.readUnsignedInt((byte) -114));
		else if (var_class == java.lang.Long.class)
			class426.anObject4822 = Long.valueOf(class523_sub34.readLong((byte) 0));
		else if (java.lang.String.class == var_class)
			class426.anObject4822 = class523_sub34.readVersionedString(2010820579);
		else if (com.jagex.Interface9.class.isAssignableFrom(var_class)) {
			try {
				Interface9 interface9 = (Interface9) var_class.newInstance();
				interface9.method59(class523_sub34, -1301618130);
				class426.anObject4822 = interface9;
			} catch (InstantiationException instantiationexception) {
				/* empty */
			} catch (IllegalAccessException illegalaccessexception) {
				/* empty */
			}
		} else
			throw new IllegalStateException();
		Class159 class159 = (Class159) getDefinition(i_3_, (byte) -30);
		if (!class159.method2559((byte) -24) || class159.aClass464_1756.method7527(2145963232) != class474)
			return null;
		return class426;
	}

	public abstract Interface13 method70(int i);

	public abstract Interface13 getDefinition(int i, byte i_4_);

	public static Map method14345(Class98_Sub1[] class98_sub1s) {
		if (class98_sub1s == null || 0 == class98_sub1s.length)
			return null;
		HashMap hashmap = new HashMap();
		Class98_Sub1[] class98_sub1s_5_ = class98_sub1s;
		for (int i = 0; i < class98_sub1s_5_.length; i++) {
			Class98_Sub1 class98_sub1 = class98_sub1s_5_[i];
			hashmap.put(class98_sub1.aClass470_8890, class98_sub1);
		}
		return hashmap;
	}

	public int method6() {
		return anInt1185 * -1994361779;
	}

	public static Map method14346(Class98_Sub1[] class98_sub1s) {
		if (class98_sub1s == null || 0 == class98_sub1s.length)
			return null;
		HashMap hashmap = new HashMap();
		Class98_Sub1[] class98_sub1s_6_ = class98_sub1s;
		for (int i = 0; i < class98_sub1s_6_.length; i++) {
			Class98_Sub1 class98_sub1 = class98_sub1s_6_[i];
			hashmap.put(class98_sub1.aClass470_8890, class98_sub1);
		}
		return hashmap;
	}

	public int method14347(Class426 class426) {
		int i = 2;
		if (class426.anObject4822 instanceof Integer)
			i += 4;
		else if (class426.anObject4822 instanceof Long)
			i += 8;
		else if (class426.anObject4822 instanceof String)
			i += Class57.method1388((String) class426.anObject4822, 1399579027);
		else if (class426.anObject4822 instanceof Interface9)
			i += ((Interface9) class426.anObject4822).method61((byte) -7);
		else
			throw new IllegalStateException();
		return i;
	}

	public static Map method14348(Class98_Sub1[] class98_sub1s) {
		if (class98_sub1s == null || 0 == class98_sub1s.length)
			return null;
		HashMap hashmap = new HashMap();
		Class98_Sub1[] class98_sub1s_7_ = class98_sub1s;
		for (int i = 0; i < class98_sub1s_7_.length; i++) {
			Class98_Sub1 class98_sub1 = class98_sub1s_7_[i];
			hashmap.put(class98_sub1.aClass470_8890, class98_sub1);
		}
		return hashmap;
	}

	public Object method369(int i) {
		Class159 class159 = (Class159) getDefinition(i, (byte) 51);
		if (class159 == null || !class159.method2559((byte) -99))
			return null;
		return class159.method2560(657031361);
	}

	public abstract Interface13 method72(int i);

	public Object method371(int i) {
		Class159 class159 = (Class159) getDefinition(i, (byte) -105);
		if (class159 == null || !class159.method2559((byte) 88))
			return null;
		return class159.method2560(1261513354);
	}

	public Object method368(int i) {
		Class159 class159 = (Class159) getDefinition(i, (byte) -85);
		if (class159 == null || !class159.method2559((byte) 37))
			return null;
		return class159.method2560(1822471226);
	}

	public Object method373(int i) {
		Class159 class159 = (Class159) getDefinition(i, (byte) -81);
		if (class159 == null || !class159.method2559((byte) 31))
			return null;
		return class159.method2560(-1645229855);
	}

	public int method14349(Class426 class426) {
		int i = 2;
		if (class426.anObject4822 instanceof Integer)
			i += 4;
		else if (class426.anObject4822 instanceof Long)
			i += 8;
		else if (class426.anObject4822 instanceof String)
			i += Class57.method1388((String) class426.anObject4822, 1399579027);
		else if (class426.anObject4822 instanceof Interface9)
			i += ((Interface9) class426.anObject4822).method61((byte) 94);
		else
			throw new IllegalStateException();
		return i;
	}

	public int method14350(Class426 class426) {
		int i = 2;
		if (class426.anObject4822 instanceof Integer)
			i += 4;
		else if (class426.anObject4822 instanceof Long)
			i += 8;
		else if (class426.anObject4822 instanceof String)
			i += Class57.method1388((String) class426.anObject4822, 1399579027);
		else if (class426.anObject4822 instanceof Interface9)
			i += ((Interface9) class426.anObject4822).method61((byte) -62);
		else
			throw new IllegalStateException();
		return i;
	}

	public int method68() {
		return anInt1185 * -1994361779;
	}

	public int method14351(Class426 class426) {
		int i = 2;
		if (class426.anObject4822 instanceof Integer)
			i += 4;
		else if (class426.anObject4822 instanceof Long)
			i += 8;
		else if (class426.anObject4822 instanceof String)
			i += Class57.method1388((String) class426.anObject4822, 1399579027);
		else if (class426.anObject4822 instanceof Interface9)
			i += ((Interface9) class426.anObject4822).method61((byte) 16);
		else
			throw new IllegalStateException();
		return i;
	}

	public void method14352(RSBuffer class523_sub34, Class426 class426) {
		class523_sub34.writeShort(class426.anInt4821 * -408785679, (byte) -6);
		if (class426.anObject4822 instanceof Integer)
			class523_sub34.writeInt(((Integer) class426.anObject4822).intValue(), -1524640417);
		else if (class426.anObject4822 instanceof Long)
			class523_sub34.method16441(((Long) class426.anObject4822).longValue());
		else if (class426.anObject4822 instanceof String)
			class523_sub34.method16266((String) class426.anObject4822, -1033169128);
		else if (class426.anObject4822 instanceof Interface9)
			((Interface9) class426.anObject4822).method57(class523_sub34, -163254270);
		else
			throw new IllegalStateException();
	}

	public Class426 method14353(RSBuffer class523_sub34, BaseVarType class474) {
		int i = class523_sub34.readUnsignedShort(-980638953);
		Class426 class426 = new Class426(i);
		Class var_class = class474.aClass5388;
		if (java.lang.Integer.class == var_class)
			class426.anObject4822 = Integer.valueOf(class523_sub34.readUnsignedInt((byte) -11));
		else if (var_class == java.lang.Long.class)
			class426.anObject4822 = Long.valueOf(class523_sub34.readLong((byte) -82));
		else if (java.lang.String.class == var_class)
			class426.anObject4822 = class523_sub34.readVersionedString(2013608213);
		else if (com.jagex.Interface9.class.isAssignableFrom(var_class)) {
			try {
				Interface9 interface9 = (Interface9) var_class.newInstance();
				interface9.method59(class523_sub34, -1338803446);
				class426.anObject4822 = interface9;
			} catch (InstantiationException instantiationexception) {
				/* empty */
			} catch (IllegalAccessException illegalaccessexception) {
				/* empty */
			}
		} else
			throw new IllegalStateException();
		Class159 class159 = (Class159) getDefinition(i, (byte) -26);
		if (!class159.method2559((byte) 13) || class159.aClass464_1756.method7527(2140113989) != class474)
			return null;
		return class426;
	}

	public Class426 method14354(RSBuffer class523_sub34, BaseVarType class474) {
		int i = class523_sub34.readUnsignedShort(-2014499390);
		Class426 class426 = new Class426(i);
		Class var_class = class474.aClass5388;
		if (java.lang.Integer.class == var_class)
			class426.anObject4822 = Integer.valueOf(class523_sub34.readUnsignedInt((byte) -119));
		else if (var_class == java.lang.Long.class)
			class426.anObject4822 = Long.valueOf(class523_sub34.readLong((byte) -25));
		else if (java.lang.String.class == var_class)
			class426.anObject4822 = class523_sub34.readVersionedString(2090944350);
		else if (com.jagex.Interface9.class.isAssignableFrom(var_class)) {
			try {
				Interface9 interface9 = (Interface9) var_class.newInstance();
				interface9.method59(class523_sub34, 85359924);
				class426.anObject4822 = interface9;
			} catch (InstantiationException instantiationexception) {
				/* empty */
			} catch (IllegalAccessException illegalaccessexception) {
				/* empty */
			}
		} else
			throw new IllegalStateException();
		Class159 class159 = (Class159) getDefinition(i, (byte) -48);
		if (!class159.method2559((byte) -10) || class159.aClass464_1756.method7527(2144033021) != class474)
			return null;
		return class426;
	}

	public static Class611_Sub1 method14355(int i) {
		if (Class6.anInt44 * -987191143 < Class6.aClass611_Sub1Array47.length)
			return (Class6.aClass611_Sub1Array47[(Class6.anInt44 += -1511052375) * -987191143 - 1]);
		return null;
	}

	static final void method14356(Class669 class669, int i) {
		int i_8_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_8_, -1864819601);
		Class627.method10309(class250, class669, -828277904);
	}
}
