/**
 * 项目名称：quickstart-rpc-simple 
 * 文件名：Constant.java
 * 版本信息：
 * 日期：2018年4月24日
 * Copyright youngzil Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.simple.self.example.common;

/**
 * Constant 
 *  
 * @author：youngzil@163.com
 * @2018年4月24日 上午11:21:14 
 * @since 1.0
 */
/**
 * ZK相关常量
 */
public interface Constant {

    int ZK_SESSION_TIMEOUT = 5000;

    String ZK_REGISTRY_PATH = "/registry";
    String ZK_DATA_PATH = ZK_REGISTRY_PATH + "/data";
}
