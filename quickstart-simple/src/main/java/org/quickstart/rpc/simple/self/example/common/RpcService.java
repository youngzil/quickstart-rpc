/**
 * 项目名称：quickstart-rpc-simple 
 * 文件名：RpcService.java
 * 版本信息：
 * 日期：2018年4月24日
 * Copyright youngzil Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.simple.self.example.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

/**
 * RpcService 
 *  
 * @author：youngzil@163.com
 * @2018年4月24日 上午11:18:22 
 * @since 1.0
 */
/**
 * RPC接口注解
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Component // 标明可被 Spring 扫描
public @interface RpcService {

    Class<?> value();
}
