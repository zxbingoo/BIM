package com.bingoo.im.server;

import com.bingoo.im.server.config.PropertiesConfig;
import com.bingoo.im.server.handle.ChatServerInitializer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.concurrent.ImmediateEventExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.net.InetSocketAddress;

/**
 * 服务端启动类
 *
 * @author jianbin
 * @date 2019/11/18
 */
@SpringBootApplication
public class BIMServerApplication {

    private static final Logger logger = LoggerFactory.getLogger(BIMServerApplication.class);

    private final ChannelGroup channelGroup =
            new DefaultChannelGroup(ImmediateEventExecutor.INSTANCE);
    private final NioEventLoopGroup group = new NioEventLoopGroup();
    private Channel channel;

    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(BIMServerApplication.class, args);
        PropertiesConfig propertiesConfig = context.getBean(PropertiesConfig.class);
        final BIMServerApplication endpoint = new BIMServerApplication();
        endpoint.start(propertiesConfig.getPort());
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                endpoint.destroy();
            }
        });
    }

    public void destroy() {
        if (channel != null) {
            channel.close();
        }
        channelGroup.close();
        group.shutdownGracefully();
    }

    private void start(int port) throws Exception {
        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.group(group)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChatServerInitializer(channelGroup));
        channel = bootstrap.bind(port).sync().channel();
        channel.closeFuture().sync();
    }
}
