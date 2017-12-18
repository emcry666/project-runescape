/* TwitchEvent - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import com.jagex.Class582;

public abstract class TwitchEvent {
	public int eventType;

	public TwitchEvent(int i) {
		eventType = i;
	}

	public abstract void method6617(int[] is, long[] ls, Object[] objects);

	public abstract Class582 method6618();

	public abstract Class582 method6619();

	public abstract void method6620(int[] is, long[] ls, Object[] objects);

	public abstract void method6621(int[] is, long[] ls, Object[] objects);

	public abstract void method6622(int[] is, long[] ls, Object[] objects);
}
