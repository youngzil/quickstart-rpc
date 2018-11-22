/**
 * 项目名称：quickstart-rpc-simple 
 * 文件名：Client.java
 * 版本信息：
 * 日期：2018年5月25日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.simple.rmi;

import java.rmi.AccessException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.naming.Context;
import javax.naming.InitialContext;

/**
 * Client
 * 
 * @author：yangzl@asiainfo.com
 * @2018年5月25日 下午11:33:21
 * @since 1.0
 */
// RMI客户端
public class Client {

    public static void main(String[] args) {


        try {
            // 注册管理器
            // 获取服务注册管理器
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 8088);
            // 列出所有注册的服务
            String[] list = registry.list();
            for (String s : list) {
                System.out.println(s);
            }

            // 远程对象调用的端口和注册类
            // IService server = (IService)Naming.lookup("rmi://127.0.0.1:8088/queryName");

            // 根据命名获取服务
            // IService server = (IService) registry.lookup("queryName");
            IService server = (IService) registry.lookup("rmi://127.0.0.1:8088/queryName");

            // Context namingContext = new InitialContext();
            // IService server = (IService) namingContext.lookup("rmi://127.0.0.1:8088/queryName");

            // 调用远程方法
            String result = server.queryName("ha ha ha ha");
            // 输出调用结果
            System.out.println("result from remote : " + result);
        } catch (AccessException e) {

            e.printStackTrace();

        } catch (RemoteException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
