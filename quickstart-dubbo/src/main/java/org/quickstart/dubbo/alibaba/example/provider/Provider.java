/**
 * 项目名称：quickstart-dubbo 
 * 文件名：Provider.java
 * 版本信息：
 * 日期：2017年11月17日
 * Copyright asiainfo Corporation 2017
 * 版权所有 *
 */
package org.quickstart.dubbo.alibaba.example.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Provider
 * 
 * @author：yangzl@asiainfo.com
 * @2017年11月17日 上午10:44:38
 * @since 1.0
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-demo-provider.xml"});
        context.start();
        System.in.read(); // press any key to exit
    }
}
