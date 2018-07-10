/**
 * 项目名称：quickstart-rpc-simple 
 * 文件名：HelloServiceImpl.java
 * 版本信息：
 * 日期：2018年4月24日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.simple.self.example.server;

import org.quickstart.rpc.simple.self.example.common.HelloService;
import org.quickstart.rpc.simple.self.example.common.RpcService;

/**
 * HelloServiceImpl 
 *  
 * @author：yangzl@asiainfo.com
 * @2018年4月24日 上午11:17:38 
 * @since 1.0
 */
/**
 * 实现服务接口
 */
@RpcService(HelloService.class) // 指定远程接口
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }
}
