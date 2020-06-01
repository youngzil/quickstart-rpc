/**
 * 项目名称：quickstart-rpc-jupiter 
 * 文件名：HelloJupiterRegistryServer.java
 * 版本信息：
 * 日期：2018年5月27日
 * Copyright youngzil Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.jupiter;

import org.jupiter.registry.RegistryServer;

/**
 * HelloJupiterRegistryServer 
 *  
 * @author：youngzil@163.com
 * @2018年5月27日 上午9:20:03 
 * @since 1.0
 */
public class HelloJupiterRegistryServer {

//    默认注册中心只建议在测试环境使用, 线上建议使用zookeeper实现

    public static void main(String[] args) {
        // 注册中心
        RegistryServer registryServer = RegistryServer.Default.createRegistryServer(20001, 1);
        registryServer.startRegistryServer();
    }
}

