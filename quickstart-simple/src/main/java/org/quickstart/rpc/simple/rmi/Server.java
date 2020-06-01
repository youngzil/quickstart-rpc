/**
 * 项目名称：quickstart-rpc-simple 
 * 文件名：Server.java
 * 版本信息：
 * 日期：2018年5月25日
 * Copyright youngzil Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.simple.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Server
 * 
 * @author：youngzil@163.com
 * @2018年5月25日 下午11:33:52
 * @since 1.0
 */
// RMI服务端
public class Server {

    public static void main(String[] args) {

        // 服务注册管理器写在了Server里，当然也可以抽出来单独作为一个服务，在其他一些框架中，往往用Zookeeper充当注册管理角色。
        // 注册管理器
        try {

            // 创建一个服务注册管理器
            Registry registry = LocateRegistry.createRegistry(8088);

            // 创建一个服务
            IService server = new ServiceImpl();

            // 这个方法也可以实现绑定
            // Naming.bind("rmi://127.0.0.1:8088/queryName", server);

            // 将服务绑定命名,使用注册表registry进行绑定或者重绑定时，不需要写完整的RMI URL,一个字符串即可
            // registry.rebind("queryName", server);
            registry.rebind("rmi://127.0.0.1:8088/queryName", server);

            // Context namingContext = new InitialContext();
            // namingContext.rebind("rmi://127.0.0.1:8088/queryName", server);

            System.out.println("bind server");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
