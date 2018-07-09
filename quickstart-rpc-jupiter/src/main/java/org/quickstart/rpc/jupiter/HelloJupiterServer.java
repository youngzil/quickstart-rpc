/**
 * 项目名称：quickstart-rpc-jupiter 
 * 文件名：HelloJupiterServer.java
 * 版本信息：
 * 日期：2018年5月27日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.jupiter;

import org.jupiter.rpc.DefaultServer;
import org.jupiter.rpc.JServer;
import org.jupiter.rpc.model.metadata.ServiceWrapper;
import org.jupiter.transport.netty.JNettyTcpAcceptor;
import org.quickstart.rpc.jupiter.service.Service;
import org.quickstart.rpc.jupiter.service.ServiceImpl;

/**
 * HelloJupiterServer 
 *  
 * @author：yangzl@asiainfo.com
 * @2018年5月27日 上午9:23:51 
 * @since 1.0
 */
public class HelloJupiterServer {

    public static void main(String[] args) throws Exception {
        JServer server = new DefaultServer().withAcceptor(new JNettyTcpAcceptor(18090));
        // provider
        Service service = new ServiceImpl();
        // 本地注册
        ServiceWrapper provider = server.serviceRegistry()
                .provider(service)
                .register();
        // 连接注册中心
        server.connectToRegistryServer("127.0.0.1:20001");
        // 向注册中心发布服务
        server.publish(provider);
        // 启动server
        server.start();
    }
}
