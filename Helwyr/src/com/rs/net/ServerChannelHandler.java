package com.rs.net;

import java.net.InetSocketAddress;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;
import org.jboss.netty.channel.group.ChannelGroup;
import org.jboss.netty.channel.group.DefaultChannelGroup;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;

import com.rs.Settings;
import com.rs.cache.loaders.Configs;
import com.rs.engine.GameEngine;
import com.rs.io.InputStream;
import com.rs.net.decoders.WorldPacketsDecoder;
import com.rs.utils.Utils;

public final class ServerChannelHandler extends SimpleChannelHandler {

	private static ChannelGroup channels;
	private static ServerBootstrap bootstrap;

	public static final void init() {
		new ServerChannelHandler();
	}

	public static int getConnectedChannelsSize() {
		return channels == null ? 0 : channels.size();
	}

	/*
	 * throws exeption so if cant handle channel server closes
	 */
	private ServerChannelHandler() {
		try {
			channels = new DefaultChannelGroup();
			bootstrap = new ServerBootstrap(new NioServerSocketChannelFactory(
					GameEngine.getEngine().getBossChannelExecutor(), GameEngine
							.getEngine().getWorkerChannelExecutor(), GameEngine
							.getEngine().getWorkers()));
			bootstrap.getPipeline().addLast("handler", this);
			bootstrap.setOption("reuseAddress", true);
			bootstrap.setOption("child.tcpNoDelay", true);
			bootstrap.setOption("child.TcpAckFrequency", true);
			bootstrap.setOption("child.keepAlive", true);
			bootstrap.bind(new InetSocketAddress(Configs.PORT));
		} catch (Exception e) {
			System.out.println("Unable to start server channel. Port "+Configs.PORT+" is already in use.");
			System.exit(0);
		}
	}

	public void channelOpen(ChannelHandlerContext ctx, ChannelStateEvent e) {
		channels.add(e.getChannel());
		SessionLimiter.addConnection(e.getChannel());
	}

	@Override
	public void channelClosed(ChannelHandlerContext ctx, ChannelStateEvent e) {
		channels.remove(e.getChannel());
		SessionLimiter.removeConnection(e.getChannel());
	}

	public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) {
		if (SessionLimiter.getConnections(e.getChannel()) >= 3) {
			System.out.println("Several connections from " + Utils.getIP(e.getChannel()) + "! Stopping them...");
			e.getChannel().close();
			return;
		}
		ctx.setAttachment(new Session(e.getChannel()));
	}

	@Override
	public void channelDisconnected(ChannelHandlerContext ctx, ChannelStateEvent e) {
		Object sessionObject = ctx.getAttachment();
		if (sessionObject != null && sessionObject instanceof Session) {
			Session session = (Session) sessionObject;
			if (session.getDecoder() == null)
				return;
			if (session.getDecoder() instanceof WorldPacketsDecoder)
				session.getWorldPackets().getPlayer().finish();
		}
	}

	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) {
		if (!(e.getMessage() instanceof ChannelBuffer)) {
			e.getChannel().close();
			return;
		}
		
		Object sessionObject = ctx.getAttachment();
		
		if (sessionObject == null || !(sessionObject instanceof Session)) {
			return;
		}
		
		try {
			
			Session session = (Session) sessionObject;
			
			if (session.getDecoder() == null)
				return;
			
			ChannelBuffer buf = (ChannelBuffer) e.getMessage();
			
			if (buf == null) {
				//Output.danger("Channel Buffer is Null!");
				return;
			}
			
			buf.markReaderIndex();
			
			int avail = buf.readableBytes();
			
			// this is where u would monitor incoming packets if needed.
			if (avail < 1 || avail > Settings.RECEIVE_DATA_LIMIT) {
				System.out.println(""+session.getIP()+" has been kicked for packet flooding.");
				session.getChannel().close();
				return;
			}
			
			
			byte[] buffer = new byte[avail];
			buf.readBytes(buffer);
			
			session.getDecoder().decode(new InputStream(buffer));
			
		} catch (Throwable er) {
			er.printStackTrace();
		}
			
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent ee)
			throws Exception {

	}

	public static final void shutdown() {
		channels.close().awaitUninterruptibly();
		bootstrap.releaseExternalResources();
	}

}