package com.sanshengshui.netty.server;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.SimpleChannelInboundHandler;
import java.net.InetAddress;
import java.util.Date;


@Sharable
public class ServerHandler extends SimpleChannelInboundHandler<String> {
    /**
     * 建立连接时，发送一条庆祝消息
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        // 为新连接发送庆祝
        ctx.write("欢迎来到主机 " + InetAddress.getLocalHost().getHostName() + "!\r\n");
        ctx.write("现在是 " + new Date() + " now.\r\n");
        ctx.flush();
    }

    @Override
    public void channelRead0(ChannelHandlerContext ctx, String request) throws Exception {
        // Generate and write a response.
        String response;
        boolean close = false;
        if (request.isEmpty()) {
            response = "Please type something.\r\n";
        } else if ("bye".equals(request.toLowerCase())) {
            response = "Have a good day!\r\n";
            close = true;
        } else {
            response = "你说的是 '" + request + "'?\r\n";
        }

        ChannelFuture future = ctx.write(response);

        if (close) {
            future.addListener(ChannelFutureListener.CLOSE);
        }
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }
    //异常处理
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
