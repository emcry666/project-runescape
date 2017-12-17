/* Class33_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public class Class33_Sub1 extends Class33 {
	ProxySelector aProxySelector10966 = ProxySelector.getDefault();
	static final String aString10967 = "java.net.useSystemProxies";

	Socket method17166(Proxy proxy) throws IOException {
		if (proxy.type() == Proxy.Type.DIRECT)
			return method915((byte) 23);
		java.net.SocketAddress socketaddress = proxy.address();
		if (!(socketaddress instanceof InetSocketAddress))
			return null;
		InetSocketAddress inetsocketaddress = (InetSocketAddress) socketaddress;
		if (proxy.type() == Proxy.Type.HTTP) {
			String string = null;
			try {
				Class var_class = (Class.forName("sun.net.www.protocol.http.AuthenticationInfo"));
				Method method = var_class.getDeclaredMethod("getProxyAuth", (new Class[] { java.lang.String.class, Integer.TYPE }));
				method.setAccessible(true);
				Object object = method.invoke(null, (new Object[] { inetsocketaddress.getHostName(), new Integer(inetsocketaddress.getPort()) }));
				if (object != null) {
					Method method_0_ = (var_class.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]));
					method_0_.setAccessible(true);
					if (((Boolean) method_0_.invoke(object, new Object[0])).booleanValue()) {
						Method method_1_ = var_class.getDeclaredMethod("getHeaderName", new Class[0]);
						method_1_.setAccessible(true);
						Method method_2_ = (var_class.getDeclaredMethod("getHeaderValue", new Class[] { java.net.URL.class, java.lang.String.class }));
						method_2_.setAccessible(true);
						String string_3_ = (String) method_1_.invoke(object, new Object[0]);
						String string_4_ = ((String) method_2_.invoke(object, (new Object[] { new URL(new StringBuilder().append("https://").append(aString309).append("/").toString()), "https" })));
						string = new StringBuilder().append(string_3_).append(": ").append(string_4_).toString();
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
			return method17168(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string, 1932936979);
		}
		if (proxy.type() == Proxy.Type.SOCKS) {
			Socket socket = new Socket(proxy);
			socket.connect(new InetSocketAddress(aString309, -1656900623 * anInt308));
			return socket;
		}
		return null;
	}

	public Socket method914(byte i) throws IOException {
		boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool)
			System.setProperty("java.net.useSystemProxies", "true");
		boolean bool_5_ = 443 == anInt308 * -1656900623;
		List list;
		List list_6_;
		try {
			list = aProxySelector10966.select(new URI(new StringBuilder().append(bool_5_ ? "https" : "http").append("://").append(aString309).toString()));
			list_6_ = aProxySelector10966.select(new URI(new StringBuilder().append(bool_5_ ? "http" : "https").append("://").append(aString309).toString()));
		} catch (URISyntaxException urisyntaxexception) {
			return method915((byte) -17);
		}
		list.addAll(list_6_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_7_ = objects;
		for (int i_8_ = 0; i_8_ < objects_7_.length; i_8_++) {
			Object object = objects_7_[i_8_];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_9_ = method17167(proxy, (byte) -12);
				if (socket_9_ == null)
					continue;
				socket = socket_9_;
			} catch (IOException_Sub1 ioexception_sub1_10_) {
				ioexception_sub1 = ioexception_sub1_10_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (null != ioexception_sub1)
			throw ioexception_sub1;
		return method915((byte) -50);
	}

	Socket method17167(Proxy proxy, byte i) throws IOException {
		if (proxy.type() == Proxy.Type.DIRECT)
			return method915((byte) 11);
		java.net.SocketAddress socketaddress = proxy.address();
		if (!(socketaddress instanceof InetSocketAddress))
			return null;
		InetSocketAddress inetsocketaddress = (InetSocketAddress) socketaddress;
		if (proxy.type() == Proxy.Type.HTTP) {
			String string = null;
			try {
				Class var_class = (Class.forName("sun.net.www.protocol.http.AuthenticationInfo"));
				Method method = var_class.getDeclaredMethod("getProxyAuth", (new Class[] { java.lang.String.class, Integer.TYPE }));
				method.setAccessible(true);
				Object object = method.invoke(null, (new Object[] { inetsocketaddress.getHostName(), new Integer(inetsocketaddress.getPort()) }));
				if (object != null) {
					Method method_11_ = (var_class.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]));
					method_11_.setAccessible(true);
					if (((Boolean) method_11_.invoke(object, new Object[0])).booleanValue()) {
						Method method_12_ = var_class.getDeclaredMethod("getHeaderName", new Class[0]);
						method_12_.setAccessible(true);
						Method method_13_ = (var_class.getDeclaredMethod("getHeaderValue", new Class[] { java.net.URL.class, java.lang.String.class }));
						method_13_.setAccessible(true);
						String string_14_ = ((String) method_12_.invoke(object, new Object[0]));
						String string_15_ = ((String) method_13_.invoke(object, (new Object[] { new URL(new StringBuilder().append("https://").append(aString309).append("/").toString()), "https" })));
						string = new StringBuilder().append(string_14_).append(": ").append(string_15_).toString();
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
			return method17168(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string, 2087420633);
		}
		if (proxy.type() == Proxy.Type.SOCKS) {
			Socket socket = new Socket(proxy);
			socket.connect(new InetSocketAddress(aString309, -1656900623 * anInt308));
			return socket;
		}
		return null;
	}

	Socket method17168(String string, int i, String string_16_, int i_17_) throws IOException {
		Socket socket = new Socket(string, i);
		socket.setSoTimeout(10000);
		OutputStream outputstream = socket.getOutputStream();
		if (string_16_ == null)
			outputstream.write(new StringBuilder().append("CONNECT ").append(aString309).append(":").append(-1656900623 * anInt308).append(" HTTP/1.0\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		else
			outputstream.write(new StringBuilder().append("CONNECT ").append(aString309).append(":").append(anInt308 * -1656900623).append(" HTTP/1.0\n").append(string_16_).append("\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		outputstream.flush();
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String string_18_ = bufferedreader.readLine();
		if (string_18_ != null) {
			if (string_18_.startsWith("HTTP/1.0 200") || string_18_.startsWith("HTTP/1.1 200"))
				return socket;
			if (string_18_.startsWith("HTTP/1.0 407") || string_18_.startsWith("HTTP/1.1 407")) {
				int i_19_ = 0;
				String string_20_ = "proxy-authenticate: ";
				for (string_18_ = bufferedreader.readLine(); null != string_18_ && i_19_ < 50; i_19_++) {
					if (string_18_.toLowerCase().startsWith(string_20_)) {
						string_18_ = string_18_.substring(string_20_.length()).trim();
						int i_21_ = string_18_.indexOf(' ');
						if (-1 != i_21_)
							string_18_ = string_18_.substring(0, i_21_);
						throw new IOException_Sub1(string_18_);
					}
					string_18_ = bufferedreader.readLine();
				}
				throw new IOException_Sub1("");
			}
		}
		outputstream.close();
		bufferedreader.close();
		socket.close();
		return null;
	}

	Socket method17169(Proxy proxy) throws IOException {
		if (proxy.type() == Proxy.Type.DIRECT)
			return method915((byte) -6);
		java.net.SocketAddress socketaddress = proxy.address();
		if (!(socketaddress instanceof InetSocketAddress))
			return null;
		InetSocketAddress inetsocketaddress = (InetSocketAddress) socketaddress;
		if (proxy.type() == Proxy.Type.HTTP) {
			String string = null;
			try {
				Class var_class = (Class.forName("sun.net.www.protocol.http.AuthenticationInfo"));
				Method method = var_class.getDeclaredMethod("getProxyAuth", (new Class[] { java.lang.String.class, Integer.TYPE }));
				method.setAccessible(true);
				Object object = method.invoke(null, (new Object[] { inetsocketaddress.getHostName(), new Integer(inetsocketaddress.getPort()) }));
				if (object != null) {
					Method method_22_ = (var_class.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]));
					method_22_.setAccessible(true);
					if (((Boolean) method_22_.invoke(object, new Object[0])).booleanValue()) {
						Method method_23_ = var_class.getDeclaredMethod("getHeaderName", new Class[0]);
						method_23_.setAccessible(true);
						Method method_24_ = (var_class.getDeclaredMethod("getHeaderValue", new Class[] { java.net.URL.class, java.lang.String.class }));
						method_24_.setAccessible(true);
						String string_25_ = ((String) method_23_.invoke(object, new Object[0]));
						String string_26_ = ((String) method_24_.invoke(object, (new Object[] { new URL(new StringBuilder().append("https://").append(aString309).append("/").toString()), "https" })));
						string = new StringBuilder().append(string_25_).append(": ").append(string_26_).toString();
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
			return method17168(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string, 2022530873);
		}
		if (proxy.type() == Proxy.Type.SOCKS) {
			Socket socket = new Socket(proxy);
			socket.connect(new InetSocketAddress(aString309, -1656900623 * anInt308));
			return socket;
		}
		return null;
	}

	public Socket method917() throws IOException {
		boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool)
			System.setProperty("java.net.useSystemProxies", "true");
		boolean bool_27_ = 443 == anInt308 * -1656900623;
		List list;
		List list_28_;
		try {
			list = aProxySelector10966.select(new URI(new StringBuilder().append(bool_27_ ? "https" : "http").append("://").append(aString309).toString()));
			list_28_ = aProxySelector10966.select(new URI(new StringBuilder().append(bool_27_ ? "http" : "https").append("://").append(aString309).toString()));
		} catch (URISyntaxException urisyntaxexception) {
			return method915((byte) 74);
		}
		list.addAll(list_28_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_29_ = objects;
		for (int i = 0; i < objects_29_.length; i++) {
			Object object = objects_29_[i];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_30_ = method17167(proxy, (byte) -54);
				if (socket_30_ == null)
					continue;
				socket = socket_30_;
			} catch (IOException_Sub1 ioexception_sub1_31_) {
				ioexception_sub1 = ioexception_sub1_31_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (null != ioexception_sub1)
			throw ioexception_sub1;
		return method915((byte) -119);
	}

	public Socket method918() throws IOException {
		boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool)
			System.setProperty("java.net.useSystemProxies", "true");
		boolean bool_32_ = 443 == anInt308 * -1656900623;
		List list;
		List list_33_;
		try {
			list = aProxySelector10966.select(new URI(new StringBuilder().append(bool_32_ ? "https" : "http").append("://").append(aString309).toString()));
			list_33_ = aProxySelector10966.select(new URI(new StringBuilder().append(bool_32_ ? "http" : "https").append("://").append(aString309).toString()));
		} catch (URISyntaxException urisyntaxexception) {
			return method915((byte) 2);
		}
		list.addAll(list_33_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_34_ = objects;
		for (int i = 0; i < objects_34_.length; i++) {
			Object object = objects_34_[i];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_35_ = method17167(proxy, (byte) -88);
				if (socket_35_ == null)
					continue;
				socket = socket_35_;
			} catch (IOException_Sub1 ioexception_sub1_36_) {
				ioexception_sub1 = ioexception_sub1_36_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (null != ioexception_sub1)
			throw ioexception_sub1;
		return method915((byte) -18);
	}

	Socket method17170(Proxy proxy) throws IOException {
		if (proxy.type() == Proxy.Type.DIRECT)
			return method915((byte) 18);
		java.net.SocketAddress socketaddress = proxy.address();
		if (!(socketaddress instanceof InetSocketAddress))
			return null;
		InetSocketAddress inetsocketaddress = (InetSocketAddress) socketaddress;
		if (proxy.type() == Proxy.Type.HTTP) {
			String string = null;
			try {
				Class var_class = (Class.forName("sun.net.www.protocol.http.AuthenticationInfo"));
				Method method = var_class.getDeclaredMethod("getProxyAuth", (new Class[] { java.lang.String.class, Integer.TYPE }));
				method.setAccessible(true);
				Object object = method.invoke(null, (new Object[] { inetsocketaddress.getHostName(), new Integer(inetsocketaddress.getPort()) }));
				if (object != null) {
					Method method_37_ = (var_class.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]));
					method_37_.setAccessible(true);
					if (((Boolean) method_37_.invoke(object, new Object[0])).booleanValue()) {
						Method method_38_ = var_class.getDeclaredMethod("getHeaderName", new Class[0]);
						method_38_.setAccessible(true);
						Method method_39_ = (var_class.getDeclaredMethod("getHeaderValue", new Class[] { java.net.URL.class, java.lang.String.class }));
						method_39_.setAccessible(true);
						String string_40_ = ((String) method_38_.invoke(object, new Object[0]));
						String string_41_ = ((String) method_39_.invoke(object, (new Object[] { new URL(new StringBuilder().append("https://").append(aString309).append("/").toString()), "https" })));
						string = new StringBuilder().append(string_40_).append(": ").append(string_41_).toString();
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
			return method17168(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string, 1785150272);
		}
		if (proxy.type() == Proxy.Type.SOCKS) {
			Socket socket = new Socket(proxy);
			socket.connect(new InetSocketAddress(aString309, -1656900623 * anInt308));
			return socket;
		}
		return null;
	}

	Socket method17171(String string, int i, String string_42_) throws IOException {
		Socket socket = new Socket(string, i);
		socket.setSoTimeout(10000);
		OutputStream outputstream = socket.getOutputStream();
		if (string_42_ == null)
			outputstream.write(new StringBuilder().append("CONNECT ").append(aString309).append(":").append(-1656900623 * anInt308).append(" HTTP/1.0\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		else
			outputstream.write(new StringBuilder().append("CONNECT ").append(aString309).append(":").append(anInt308 * -1656900623).append(" HTTP/1.0\n").append(string_42_).append("\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		outputstream.flush();
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String string_43_ = bufferedreader.readLine();
		if (string_43_ != null) {
			if (string_43_.startsWith("HTTP/1.0 200") || string_43_.startsWith("HTTP/1.1 200"))
				return socket;
			if (string_43_.startsWith("HTTP/1.0 407") || string_43_.startsWith("HTTP/1.1 407")) {
				int i_44_ = 0;
				String string_45_ = "proxy-authenticate: ";
				for (string_43_ = bufferedreader.readLine(); null != string_43_ && i_44_ < 50; i_44_++) {
					if (string_43_.toLowerCase().startsWith(string_45_)) {
						string_43_ = string_43_.substring(string_45_.length()).trim();
						int i_46_ = string_43_.indexOf(' ');
						if (-1 != i_46_)
							string_43_ = string_43_.substring(0, i_46_);
						throw new IOException_Sub1(string_43_);
					}
					string_43_ = bufferedreader.readLine();
				}
				throw new IOException_Sub1("");
			}
		}
		outputstream.close();
		bufferedreader.close();
		socket.close();
		return null;
	}

	public Socket method916() throws IOException {
		boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool)
			System.setProperty("java.net.useSystemProxies", "true");
		boolean bool_47_ = 443 == anInt308 * -1656900623;
		List list;
		List list_48_;
		try {
			list = aProxySelector10966.select(new URI(new StringBuilder().append(bool_47_ ? "https" : "http").append("://").append(aString309).toString()));
			list_48_ = aProxySelector10966.select(new URI(new StringBuilder().append(bool_47_ ? "http" : "https").append("://").append(aString309).toString()));
		} catch (URISyntaxException urisyntaxexception) {
			return method915((byte) -17);
		}
		list.addAll(list_48_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_49_ = objects;
		for (int i = 0; i < objects_49_.length; i++) {
			Object object = objects_49_[i];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_50_ = method17167(proxy, (byte) -118);
				if (socket_50_ == null)
					continue;
				socket = socket_50_;
			} catch (IOException_Sub1 ioexception_sub1_51_) {
				ioexception_sub1 = ioexception_sub1_51_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (null != ioexception_sub1)
			throw ioexception_sub1;
		return method915((byte) 25);
	}

	Class33_Sub1() {
		/* empty */
	}

	static final void method17172(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class160.method2575(class250, class242, class669, -1853995242);
	}
}
