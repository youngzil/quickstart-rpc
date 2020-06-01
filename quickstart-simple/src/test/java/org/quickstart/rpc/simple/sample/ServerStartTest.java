/**
 * 项目名称：quickstart-rpc-simple 
 * 文件名：RpcTest.java
 * 版本信息：
 * 日期：2018年4月24日
 * Copyright youngzil Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.simple.sample;

import java.net.InetSocketAddress;

import org.quickstart.rpc.simple.self.sample.client.RpcImporter;
import org.quickstart.rpc.simple.self.sample.server.EchoService;
import org.quickstart.rpc.simple.self.sample.server.EchoServiceImpl;
import org.quickstart.rpc.simple.self.sample.server.RpcExporter;

/**
 * RpcTest
 * 
 * https://www.cnblogs.com/ChrisMurphy/p/6550184.html
 * 
 * @author：youngzil@163.com
 * @2018年4月24日 上午11:05:37
 * @since 1.0
 */
public class ServerStartTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // 创建异步发布服务端的线程并启动，用于接受PRC客户端的请求，根据请求参数调用服务实现类，返回结果给客户端
        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                try {
                    RpcExporter.exporter("localhost", 8088);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
//        // 创建客户端服务代理类，构造RPC求情参数，发起RPC调用
//        RpcImporter<EchoService> importer = new RpcImporter<EchoService>();
//        EchoService echo = importer.importer(EchoServiceImpl.class, new InetSocketAddress("localhost", 8088));
//        System.out.println(echo.echo("Are u ok?"));
    }

}
