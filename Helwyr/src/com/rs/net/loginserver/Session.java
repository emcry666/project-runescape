package com.rs.net.loginserver;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFuture;

import com.rs.game.LoginServer;
import com.rs.io.OutputStream;

public class Session {

	private Channel channel;
	private String macAddress;
	private int lastCacheRequest;
	private Encoder encoder;

	public Session(Channel channel) {
		this.channel = channel;
		setEncoder(0);
		@SuppressWarnings("unused")
		LoginServer login = new LoginServer(this);
		getLoginServerEncoder().sendHandshake();
	}

	public final ChannelFuture write(OutputStream outStream) {
		if (outStream == null || !channel.isConnected())
			return null;
		ChannelBuffer buffer = ChannelBuffers.copiedBuffer(
				outStream.getBuffer(), 0, outStream.getOffset());
		synchronized (channel) {
			return channel.write(buffer);
		}
	}

	public final ChannelFuture write(ChannelBuffer outStream) {
		if (outStream == null || !channel.isConnected())
			return null;
		synchronized (channel) {
			return channel.write(outStream);
		}
	}

	public final ChannelFuture writeLogin(ChannelBuffer outStream) {
		if (outStream == null || !channel.isConnected())
			return null;
		synchronized (channel) {
			return channel.write(outStream);
		}
	}

	public final Channel getChannel() {
		return channel;
	}

	public final Encoder getEncoder() {
		return encoder;
	}

	public final void setEncoder(int stage) {
		setEncoder(stage, null);
	}

	public LoginServerEncoder getLoginServerEncoder() {
		return (LoginServerEncoder) encoder;
	}

	public final void setEncoder(int stage, Object attachement) {
		switch (stage) {
		case 0:
			encoder = new LoginServerEncoder(this);
			break;
		case -1:
		default:
			encoder = null;
			break;
		}
	}

	public final int getLastCacheRequest() {
		return lastCacheRequest;
	}

	public String getIPAddress() {
		return channel == null ? "" : channel.getRemoteAddress().toString()
				.split(":")[0].replace("/", "");

	}

	public String getLocalAddress() {
		return channel.getLocalAddress().toString();
	}

	public String getMacAddress() {
		return macAddress;
	}
}
