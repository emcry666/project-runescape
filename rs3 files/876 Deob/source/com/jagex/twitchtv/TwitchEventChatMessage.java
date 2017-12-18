/* TwitchEventChatMessage - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import com.jagex.Class582;

public class TwitchEventChatMessage extends TwitchEvent {
	public String name;
	public String message;
	public int nameColourARGB;
	public int modes;
	public int subscriptions;
	public boolean isAction;

	public TwitchEventChatMessage(int i, String string, String string_0_, int i_1_, int i_2_, int i_3_, boolean bool) {
		super(i);
		name = string;
		message = string_0_;
		nameColourARGB = i_1_;
		modes = i_2_;
		subscriptions = i_3_;
		isAction = bool;
	}

	public void method6617(int[] is, long[] ls, Object[] objects) {
		objects[0] = name;
		objects[1] = message;
	}

	public Class582 method6618() {
		return Class582.aClass582_7710;
	}

	public Class582 method6619() {
		return Class582.aClass582_7710;
	}

	public void method6620(int[] is, long[] ls, Object[] objects) {
		objects[0] = name;
		objects[1] = message;
	}

	public void method6621(int[] is, long[] ls, Object[] objects) {
		objects[0] = name;
		objects[1] = message;
	}

	public void method6622(int[] is, long[] ls, Object[] objects) {
		objects[0] = name;
		objects[1] = message;
	}
}
