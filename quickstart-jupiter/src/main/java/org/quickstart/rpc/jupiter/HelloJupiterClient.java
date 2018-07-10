/**
 * 项目名称：quickstart-rpc-jupiter 
 * 文件名：HelloJupiterClient.java
 * 版本信息：
 * 日期：2018年5月27日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.jupiter;

import org.jupiter.rpc.DefaultClient;
import org.jupiter.rpc.JClient;
import org.jupiter.rpc.consumer.ProxyFactory;
import org.jupiter.transport.JConnector;
import org.jupiter.transport.exception.ConnectFailedException;
import org.jupiter.transport.netty.JNettyTcpConnector;
import org.quickstart.rpc.jupiter.service.Service;

/**
 * HelloJupiterClient
 * 
 * @author：yangzl@asiainfo.com
 * @2018年5月27日 上午9:25:01
 * @since 1.0
 */
public class HelloJupiterClient {

    public static void main(String[] args) {
        JClient client = new DefaultClient().withConnector(new JNettyTcpConnector());
        // 连接RegistryServer
        client.connectToRegistryServer("127.0.0.1:20001");
        // 自动管理可用连接
        JConnector.ConnectionWatcher watcher = client.watchConnections(Service.class);
        // 等待连接可用
        if (!watcher.waitForAvailable(3000)) {
            throw new ConnectFailedException();
        }

        Service service = ProxyFactory.factory(Service.class).version("1.0.0").client(client).newProxyInstance();

        String response = service.sayHelloString();

        System.out.println("response=" + response);
    }
}
