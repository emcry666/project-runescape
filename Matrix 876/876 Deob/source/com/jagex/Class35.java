/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.applet.Applet;

import netscape.javascript.JSObject;

public class Class35 {
	public static Object method950(Applet applet, String string, Object[] objects) throws Throwable {
		return JSObject.getWindow(applet).call(string, objects);
	}

	public static void method951(Applet applet, String string, byte i) throws Throwable {
		JSObject.getWindow(applet).eval(string);
	}

	public static Object method952(Applet applet, String string, byte i) throws Throwable {
		return JSObject.getWindow(applet).call(string, null);
	}

	public static Object method953(Applet applet, String string, Object[] objects) throws Throwable {
		return JSObject.getWindow(applet).call(string, objects);
	}

	public static Object method954(Applet applet, String string, Object[] objects, int i) throws Throwable {
		return JSObject.getWindow(applet).call(string, objects);
	}

	public static Object method955(Applet applet, String string, Object[] objects) throws Throwable {
		return JSObject.getWindow(applet).call(string, objects);
	}

	Class35() throws Throwable {
		throw new Error();
	}

	public static void method956(Applet applet, String string) throws Throwable {
		JSObject.getWindow(applet).eval(string);
	}
}
