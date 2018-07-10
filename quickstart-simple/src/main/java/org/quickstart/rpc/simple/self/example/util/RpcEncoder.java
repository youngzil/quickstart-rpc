/**
 * 项目名称：quickstart-rpc-simple 
 * 文件名：RpcEncoder.java
 * 版本信息：
 * 日期：2018年4月24日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.simple.self.example.util;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * RpcEncoder 
 *  
 * @author：yangzl@asiainfo.com
 * @2018年4月24日 下午12:42:26 
 * @since 1.0
 */
/**
 * RPC编码
 */
public class RpcEncoder extends MessageToByteEncoder {

    private Class<?> genericClass;

    public RpcEncoder(Class<?> genericClass) {
        this.genericClass = genericClass;
    }

    @Override
    public void encode(ChannelHandlerContext ctx, Object in, ByteBuf out) throws Exception {
        if (genericClass.isInstance(in)) {
            byte[] data = SerializationUtil.serialize(in);
            out.writeInt(data.length);
            out.writeBytes(data);
        }
    }
}
