/**
 * 项目名称：quickstart-dubbo 
 * 文件名：Consumer.java
 * 版本信息：
 * 日期：2017年11月17日
 * Copyright youngzil Corporation 2017
 * 版权所有 *
 */
package org.quickstart.dubbo.alibaba.example.consumer;

import org.quickstart.dubbo.alibaba.example.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Consumer
 * 
 * @author：youngzil@163.com
 * @2017年11月17日 上午10:45:49
 * @since 1.0
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-demo-consumer.xml"});
        context.start();

        DemoService demoService = context.getBean(DemoService.class);

        // DemoService demoService = (DemoService) context.getBean("demoService"); // obtain proxy object for remote invocation
        String hello = demoService.sayHello("world"); // execute remote invocation
        System.out.println(hello); // show the result
    }
}
