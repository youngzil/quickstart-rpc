/**
 * 项目名称：quickstart-rpc-simple 
 * 文件名：RpcBootstrap.java
 * 版本信息：
 * 日期：2018年4月24日
 * Copyright youngzil Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.simple.example.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * RpcBootstrap 
 *  
 *  http://www.importnew.com/20327.html
 *  
 * @author：youngzil@163.com
 * @2018年4月24日 下午12:24:57 
 * @since 1.0
 */
/**
 * RPC服务启动入口
 */
public class RpcBootstrap {
 
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("spring-zk-rpc-server.xml");
    }
}