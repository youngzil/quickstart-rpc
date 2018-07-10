/**
 * 项目名称：quickstart-rpc-jupiter 
 * 文件名：ServiceImpl.java
 * 版本信息：
 * 日期：2018年5月27日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.jupiter.service;

import org.jupiter.rpc.ServiceProviderImpl;

/**
 * ServiceImpl 
 *  
 * @author：yangzl@asiainfo.com
 * @2018年5月27日 上午9:18:56 
 * @since 1.0
 */
@ServiceProviderImpl(version = "1.0.0")
public class ServiceImpl implements Service {
    @Override
    public String sayHelloString() {
        return "Hello jupiter";
    }
}

/*@ServiceProviderImpl:
    - 建议每个服务实现通过此注解来指定服务版本信息, 如不希望业务代码对jupiter依赖也可以不使用此注解而手动去设置版本信息
        + version: 服务版本号(选填, 默认版本号为'1.0.0')*/
