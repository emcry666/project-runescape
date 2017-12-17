/* Class532 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class Class532 implements Interface59 {
	Class472 aClass472_7126;
	String aString7127;
	Hashtable aHashtable7128 = new Hashtable();
	Hashtable aHashtable7129 = new Hashtable();

	static String method8779(String string) {
		if (Class509.aString5723.startsWith("win"))
			return new StringBuilder().append(string).append(".dll").toString();
		if (Class509.aString5723.startsWith("linux"))
			return new StringBuilder().append("lib").append(string).append(".so").toString();
		if (Class509.aString5723.startsWith("mac"))
			return new StringBuilder().append("lib").append(string).append(".dylib").toString();
		return null;
	}

	public Class532(Class472 class472) {
		aClass472_7126 = class472;
		String string = "";
		if (Class509.aString5723.startsWith("win") || Class509.aString5723.startsWith("windows 7"))
			string = new StringBuilder().append(string).append("windows/").toString();
		else if (Class509.aString5723.startsWith("linux"))
			string = new StringBuilder().append(string).append("linux/").toString();
		else if (Class509.aString5723.startsWith("mac"))
			string = new StringBuilder().append(string).append("macos/").toString();
		if (Class509.aString5724.startsWith("amd64") || Class509.aString5724.startsWith("x86_64"))
			string = new StringBuilder().append(string).append("x86_64/").toString();
		else if (Class509.aString5724.startsWith("i386") || Class509.aString5724.startsWith("i486") || Class509.aString5724.startsWith("i586") || Class509.aString5724.startsWith("x86"))
			string = new StringBuilder().append(string).append("x86/").toString();
		else if (Class509.aString5724.startsWith("ppc"))
			string = new StringBuilder().append(string).append("ppc/").toString();
		else
			string = new StringBuilder().append(string).append("universal/").toString();
		aString7127 = string;
	}

	public boolean method359() {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = aHashtable7129.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, aHashtable7129.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_0_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_0_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = aHashtable7129.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = (File) aHashtable7128.get(string);
						Class var_class_1_ = (Class) aHashtable7129.get(string);
						Vector vector = ((Vector) field.get(var_class_1_.getClassLoader()));
						for (int i = 0; i < vector.size(); i++) {
							try {
								Object object = vector.elementAt(i);
								Field field_2_ = object.getClass().getDeclaredField("name");
								method.invoke(field_2_, new Object[] { Boolean.TRUE });
								try {
									String string_3_ = (String) field_2_.get(object);
									if (null != string_3_ && (string_3_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_4_ = object.getClass().getDeclaredField("handle");
										Method method_5_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_4_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_5_, (new Object[] { Boolean.TRUE }));
										try {
											method_5_.invoke(object, new Object[0]);
											field_4_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_5_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_4_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_2_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
			/* empty */
		}
		aHashtable7129 = hashtable;
		return aHashtable7129.isEmpty();
	}

	public boolean method381(String string, int i) {
		return aHashtable7128.containsKey(string);
	}

	public void method383(String string, int i) throws Exception_Sub6 {
		method8780(string, com.jagex.Class535.class, -262243752);
	}

	void method8780(String string, Class var_class, int i) throws Exception_Sub6 {
		Class var_class_6_ = (Class) aHashtable7129.get(string);
		if (null != var_class_6_ && var_class_6_.getClassLoader() != var_class.getClassLoader())
			throw new Exception_Sub6(1, string);
		File file = null;
		if (null == file)
			file = (File) aHashtable7128.get(string);
		if (null != file) {
			try {
				file = new File(file.getCanonicalPath());
				Class var_class_7_ = Class.forName("java.lang.Runtime");
				Class var_class_8_ = Class.forName("java.lang.reflect.AccessibleObject");
				Method method = var_class_8_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
				Method method_9_ = (var_class_7_.getDeclaredMethod("load0", new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") }));
				method.invoke(method_9_, new Object[] { Boolean.TRUE });
				method_9_.invoke(Runtime.getRuntime(), new Object[] { var_class, file.getPath() });
				method.invoke(method_9_, new Object[] { Boolean.FALSE });
				aHashtable7129.put(string, var_class);
			} catch (NoSuchMethodException nosuchmethodexception) {
				System.load(file.getPath());
				aHashtable7129.put(string, com.jagex.Class535.class);
			} catch (Throwable throwable) {
				throw new Exception_Sub6(3, string, throwable);
			}
		} else
			throw new Exception_Sub6(4, string);
	}

	public boolean method380(int i) {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = aHashtable7129.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, aHashtable7129.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_10_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_10_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = aHashtable7129.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = (File) aHashtable7128.get(string);
						Class var_class_11_ = (Class) aHashtable7129.get(string);
						Vector vector = ((Vector) field.get(var_class_11_.getClassLoader()));
						for (int i_12_ = 0; i_12_ < vector.size(); i_12_++) {
							try {
								Object object = vector.elementAt(i_12_);
								Field field_13_ = object.getClass().getDeclaredField("name");
								method.invoke(field_13_, new Object[] { Boolean.TRUE });
								try {
									String string_14_ = (String) field_13_.get(object);
									if (null != string_14_ && (string_14_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_15_ = object.getClass().getDeclaredField("handle");
										Method method_16_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_15_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_16_, (new Object[] { Boolean.TRUE }));
										try {
											method_16_.invoke(object, new Object[0]);
											field_15_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_16_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_15_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_13_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
			/* empty */
		}
		aHashtable7129 = hashtable;
		return aHashtable7129.isEmpty();
	}

	public void method382(String string) throws Exception_Sub6 {
		method8780(string, com.jagex.Class535.class, -567593953);
	}

	void method8781(String string, File file, int i) {
		aHashtable7128.put(string, file);
	}

	public int method8782(String string, int i) throws Exception_Sub5 {
		if (aHashtable7128.containsKey(string))
			return 100;
		String string_17_ = Class457.method7442(string, 1969179734);
		if (null == string_17_)
			throw new Exception_Sub5(1, string);
		String string_18_ = null;
		if (string_18_ == null) {
			string_18_ = new StringBuilder().append(aString7127).append(string_17_).toString();
			if (aClass472_7126 == null || !aClass472_7126.method7666(string_18_, "", 1896939840))
				throw new Exception_Sub5(2, string);
		}
		if (!aClass472_7126.method7716(string_18_, -1452510584))
			return aClass472_7126.method7671(string_18_, -489905627);
		byte[] is = aClass472_7126.method7667(string_18_, "", 1104791258);
		if (null == is)
			throw new Exception_Sub5(3, string);
		Object object = null;
		File file;
		try {
			file = Class578.method9655(string_17_, (byte) 50);
		} catch (RuntimeException runtimeexception) {
			throw new Exception_Sub5(4, string, runtimeexception);
		}
		if (file == null)
			throw new Exception_Sub5(5, string);
		boolean bool = true;
		byte[] is_19_ = Class578.method9654(file, (short) 1028);
		if (is_19_ != null && is_19_.length == is.length) {
			for (int i_20_ = 0; i_20_ < is_19_.length; i_20_++) {
				if (is[i_20_] != is_19_[i_20_]) {
					bool = false;
					break;
				}
			}
		} else
			bool = false;
		if (!bool) {
			try {
				FileOutputStream fileoutputstream = new FileOutputStream(file);
				fileoutputstream.write(is, 0, is.length);
				fileoutputstream.close();
			} catch (Throwable throwable) {
				throw new Exception_Sub5(6, string, throwable);
			}
		}
		method8781(string, file, -1555345910);
		return 100;
	}

	public int method8783(String string) throws Exception_Sub5 {
		if (aHashtable7128.containsKey(string))
			return 100;
		String string_21_ = Class457.method7442(string, 2101263202);
		if (null == string_21_)
			throw new Exception_Sub5(1, string);
		String string_22_ = null;
		if (string_22_ == null) {
			string_22_ = new StringBuilder().append(aString7127).append(string_21_).toString();
			if (aClass472_7126 == null || !aClass472_7126.method7666(string_22_, "", 2042304095))
				throw new Exception_Sub5(2, string);
		}
		if (!aClass472_7126.method7716(string_22_, 844128132))
			return aClass472_7126.method7671(string_22_, 1564153898);
		byte[] is = aClass472_7126.method7667(string_22_, "", 1610096487);
		if (null == is)
			throw new Exception_Sub5(3, string);
		Object object = null;
		File file;
		try {
			file = Class578.method9655(string_21_, (byte) 12);
		} catch (RuntimeException runtimeexception) {
			throw new Exception_Sub5(4, string, runtimeexception);
		}
		if (file == null)
			throw new Exception_Sub5(5, string);
		boolean bool = true;
		byte[] is_23_ = Class578.method9654(file, (short) 1028);
		if (is_23_ != null && is_23_.length == is.length) {
			for (int i = 0; i < is_23_.length; i++) {
				if (is[i] != is_23_[i]) {
					bool = false;
					break;
				}
			}
		} else
			bool = false;
		if (!bool) {
			try {
				FileOutputStream fileoutputstream = new FileOutputStream(file);
				fileoutputstream.write(is, 0, is.length);
				fileoutputstream.close();
			} catch (Throwable throwable) {
				throw new Exception_Sub5(6, string, throwable);
			}
		}
		method8781(string, file, -355949636);
		return 100;
	}

	public boolean method384(String string) {
		return aHashtable7128.containsKey(string);
	}

	public boolean method385(String string) {
		return aHashtable7128.containsKey(string);
	}

	public void method386(String string) throws Exception_Sub6 {
		method8780(string, com.jagex.Class535.class, -123021839);
	}

	public boolean method211() {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = aHashtable7129.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, aHashtable7129.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_24_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_24_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = aHashtable7129.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = (File) aHashtable7128.get(string);
						Class var_class_25_ = (Class) aHashtable7129.get(string);
						Vector vector = ((Vector) field.get(var_class_25_.getClassLoader()));
						for (int i = 0; i < vector.size(); i++) {
							try {
								Object object = vector.elementAt(i);
								Field field_26_ = object.getClass().getDeclaredField("name");
								method.invoke(field_26_, new Object[] { Boolean.TRUE });
								try {
									String string_27_ = (String) field_26_.get(object);
									if (null != string_27_ && (string_27_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_28_ = object.getClass().getDeclaredField("handle");
										Method method_29_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_28_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_29_, (new Object[] { Boolean.TRUE }));
										try {
											method_29_.invoke(object, new Object[0]);
											field_28_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_29_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_28_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_26_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
			/* empty */
		}
		aHashtable7129 = hashtable;
		return aHashtable7129.isEmpty();
	}

	void method8784(String string, Class var_class) throws Exception_Sub6 {
		Class var_class_30_ = (Class) aHashtable7129.get(string);
		if (null != var_class_30_ && var_class_30_.getClassLoader() != var_class.getClassLoader())
			throw new Exception_Sub6(1, string);
		File file = null;
		if (null == file)
			file = (File) aHashtable7128.get(string);
		if (null != file) {
			try {
				file = new File(file.getCanonicalPath());
				Class var_class_31_ = Class.forName("java.lang.Runtime");
				Class var_class_32_ = Class.forName("java.lang.reflect.AccessibleObject");
				Method method = var_class_32_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
				Method method_33_ = (var_class_31_.getDeclaredMethod("load0", new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") }));
				method.invoke(method_33_, new Object[] { Boolean.TRUE });
				method_33_.invoke(Runtime.getRuntime(), new Object[] { var_class, file.getPath() });
				method.invoke(method_33_, new Object[] { Boolean.FALSE });
				aHashtable7129.put(string, var_class);
			} catch (NoSuchMethodException nosuchmethodexception) {
				System.load(file.getPath());
				aHashtable7129.put(string, com.jagex.Class535.class);
			} catch (Throwable throwable) {
				throw new Exception_Sub6(3, string, throwable);
			}
		} else
			throw new Exception_Sub6(4, string);
	}

	static final void method8785(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class194_Sub18.method15522(class250, class242, class669, (byte) 63);
	}

	static final void method8786(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class463.method7520(class250, class242, class669, 835793257);
	}

	public static Class504 method8787(int i, int i_34_, int i_35_, int i_36_, Interface12 interface12, Interface12 interface12_37_, int i_38_) {
		Class510[] class510s = null;
		Class576 class576 = (Class576) interface12.getDefinition(i, (byte) -55);
		if (null != class576.anIntArray7694) {
			class510s = new Class510[class576.anIntArray7694.length];
			for (int i_39_ = 0; i_39_ < class510s.length; i_39_++) {
				Class286 class286 = ((Class286) interface12_37_.getDefinition(class576.anIntArray7694[i_39_], (byte) -88));
				class510s[i_39_] = new Class510(class286.anInt3094 * 1277180001, class286.anInt3093 * 156739431, 2107416927 * class286.anInt3086, 580026927 * class286.anInt3096, -1497120019 * class286.anInt3090, class286.anInt3087 * 1756113097, class286.anInt3092 * -210612203, class286.aBool3091, class286.anInt3089 * 382505871, class286.anInt3095 * 952982467, 1347747559 * class286.anInt3088);
			}
		}
		return new Class504(class576.anInt7692 * -610144529, class510s, class576.anInt7693 * -1296973425, i_34_, i_35_, i_36_, class576.aClass577_7695, 281158815 * class576.anInt7696);
	}
}
