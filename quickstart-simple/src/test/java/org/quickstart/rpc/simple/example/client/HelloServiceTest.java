/**
 * 项目名称：quickstart-rpc-simple 
 * 文件名：HelloServiceTest.java
 * 版本信息：
 * 日期：2018年4月24日
 * Copyright youngzil Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.simple.example.client;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.quickstart.rpc.simple.self.example.client.RpcProxy;
import org.quickstart.rpc.simple.self.example.common.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * HelloServiceTest 
 * 
 * http://www.importnew.com/20327.html
 *  
 * @author：youngzil@163.com
 * @2018年4月24日 下午12:46:51 
 * @since 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-zk-rpc-client.xml")
public class HelloServiceTest {
 
    @Autowired
    private RpcProxy rpcProxy;
 
    @Test
    public void helloTest() {
        HelloService helloService = rpcProxy.create(HelloService.class);
        String result = helloService.hello("World");
        
        System.out.println("result=" + result);
        Assert.assertEquals("Hello! World", result);
    }
}

