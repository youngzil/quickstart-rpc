/**
 * 项目名称：quickstart-rpc-jupiter 
 * 文件名：ServiceTest.java
 * 版本信息：
 * 日期：2018年5月27日
 * Copyright youngzil Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.jupiter.service;

import org.jupiter.rpc.ServiceProvider;

/**
 * ServiceTest 
 *  
 * @author：youngzil@163.com
 * @2018年5月27日 上午9:17:36 
 * @since 1.0
 */
@ServiceProvider(group = "test", name = "serviceTest")
public interface Service {
    String sayHelloString();
}

/*@ServiceProvider:
    - 建议每个服务接口通过此注解来指定服务信息, 如不希望业务代码对jupiter依赖也可以不使用此注解而手动去设置服务信息
        + group: 服务组别(选填, 默认组别为'Jupiter')
        + name: 服务名称(选填, 默认名称为接口全限定名称)*/

