/**
 * 项目名称：quickstart-dubbo 
 * 文件名：DemoServiceImpl.java
 * 版本信息：
 * 日期：2017年11月17日
 * Copyright youngzil Corporation 2017
 * 版权所有 *
 */
package org.quickstart.dubbo.alibaba.example.provider;

import org.quickstart.dubbo.alibaba.example.api.DemoService;

/**
 * DemoServiceImpl
 * 
 * @author：youngzil@163.com
 * @2017年11月17日 上午10:42:43
 * @since 1.0
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
