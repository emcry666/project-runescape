/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public class Class55 implements Runnable {
	volatile boolean aBool734;
	Queue aQueue735 = new LinkedList();
	Thread aThread736 = new Thread(this);
	public static Class472 aClass472_737;

	Class100 method1351(URL url, int i) {
		Class100 class100 = new Class100(url);
		synchronized (this) {
			aQueue735.add(class100);
			this.notify();
		}
		return class100;
	}

	Class55() {
		aThread736.setPriority(1);
		aThread736.start();
	}

	public void run() {
		while (!aBool734) {
			try {
				Class100 class100;
				synchronized (this) {
					class100 = (Class100) aQueue735.poll();
					if (null == class100) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
						continue;
					}
				}
				try {
					URLConnection urlconnection = class100.anURL1235.openConnection();
					urlconnection.setConnectTimeout(30000);
					int i = urlconnection.getContentLength();
					if (i >= 0) {
						byte[] is = new byte[i];
						new DataInputStream(urlconnection.getInputStream()).readFully(is);
						class100.aByteArray1233 = is;
					}
					class100.aBool1234 = true;
				} catch (IOException ioexception) {
					class100.aBool1234 = true;
				}
			} catch (Exception exception) {
				Class305.method5553(null, exception, (byte) 1);
			}
		}
	}

	void method1352(int i) {
		aBool734 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			aThread736.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public void method1353() {
		while (!aBool734) {
			try {
				Class100 class100;
				synchronized (this) {
					class100 = (Class100) aQueue735.poll();
					if (null == class100) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
						continue;
					}
				}
				try {
					URLConnection urlconnection = class100.anURL1235.openConnection();
					urlconnection.setConnectTimeout(30000);
					int i = urlconnection.getContentLength();
					if (i >= 0) {
						byte[] is = new byte[i];
						new DataInputStream(urlconnection.getInputStream()).readFully(is);
						class100.aByteArray1233 = is;
					}
					class100.aBool1234 = true;
				} catch (IOException ioexception) {
					class100.aBool1234 = true;
				}
			} catch (Exception exception) {
				Class305.method5553(null, exception, (byte) 1);
			}
		}
	}

	public void method1354() {
		while (!aBool734) {
			try {
				Class100 class100;
				synchronized (this) {
					class100 = (Class100) aQueue735.poll();
					if (null == class100) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
						continue;
					}
				}
				try {
					URLConnection urlconnection = class100.anURL1235.openConnection();
					urlconnection.setConnectTimeout(30000);
					int i = urlconnection.getContentLength();
					if (i >= 0) {
						byte[] is = new byte[i];
						new DataInputStream(urlconnection.getInputStream()).readFully(is);
						class100.aByteArray1233 = is;
					}
					class100.aBool1234 = true;
				} catch (IOException ioexception) {
					class100.aBool1234 = true;
				}
			} catch (Exception exception) {
				Class305.method5553(null, exception, (byte) 1);
			}
		}
	}

	Class100 method1355(URL url) {
		Class100 class100 = new Class100(url);
		synchronized (this) {
			aQueue735.add(class100);
			this.notify();
		}
		return class100;
	}

	Class100 method1356(URL url) {
		Class100 class100 = new Class100(url);
		synchronized (this) {
			aQueue735.add(class100);
			this.notify();
		}
		return class100;
	}

	void method1357() {
		aBool734 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			aThread736.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	Class100 method1358(URL url) {
		Class100 class100 = new Class100(url);
		synchronized (this) {
			aQueue735.add(class100);
			this.notify();
		}
		return class100;
	}

	void method1359() {
		aBool734 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			aThread736.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public static String method1360(String string, int i) {
		int i_0_ = string.length();
		int i_1_ = 0;
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			char c = string.charAt(i_2_);
			if ('<' == c || c == '>')
				i_1_ += 3;
		}
		StringBuilder stringbuilder = new StringBuilder(i_0_ + i_1_);
		for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
			char c = string.charAt(i_3_);
			if (c == '<')
				stringbuilder.append("<lt>");
			else if (c == '>')
				stringbuilder.append("<gt>");
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	static final void method1361(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class595.method9814(class250, class242, class669, -158115584);
	}
}
