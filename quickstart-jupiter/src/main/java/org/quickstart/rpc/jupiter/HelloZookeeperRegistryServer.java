/**
 * 项目名称：quickstart-rpc-jupiter 
 * 文件名：HelloZookeeperRegistryServer.java
 * 版本信息：
 * 日期：2018年5月27日
 * Copyright youngzil Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.jupiter;

import org.jupiter.registry.RegistryService;
import org.jupiter.rpc.DefaultClient;
import org.jupiter.rpc.DefaultServer;
import org.jupiter.rpc.JClient;
import org.jupiter.rpc.JServer;

/**
 * HelloZookeeperRegistryServer 
 *  
 * @author：youngzil@163.com
 * @2018年5月27日 上午9:21:29 
 * @since 1.0
 */
public class HelloZookeeperRegistryServer {
    
//    默认注册中心只建议在测试环境使用, 线上建议使用zookeeper实现

    public static void main(String[] args) {
      //设置使用zookeeper作为注册中心
        JServer server = new DefaultServer(RegistryService.RegistryType.ZOOKEEPER);
        JClient client = new DefaultClient(RegistryService.RegistryType.ZOOKEEPER);

//        在server和client中配置jupiter-registry-zookeeper依赖(jupiter-all包含jupiter-registry-zookeeper)

//        <dependency>
//         <groupId>org.jupiter-rpc</groupId>
//         <artifactId>jupiter-registry-zookeeper</artifactId>
//         <version>${jupiter.version}</version>
//        </dependency>

    }

}
