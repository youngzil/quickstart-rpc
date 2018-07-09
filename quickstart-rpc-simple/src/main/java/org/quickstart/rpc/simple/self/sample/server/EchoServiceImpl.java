/**
 * 项目名称：quickstart-rpc-simple 
 * 文件名：EchoServiceImpl.java
 * 版本信息：
 * 日期：2018年4月24日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.simple.self.sample.server;

/**
 * EchoServiceImpl 
 *  
 * @author：yangzl@asiainfo.com
 * @2018年4月24日 上午11:03:18 
 * @since 1.0
 */
public class EchoServiceImpl implements EchoService{

    @Override
    public String echo(String ping) {
        // TODO Auto-generated method stub
        return ping !=null?ping+"--> I am ok.":"I am bad.";
    } 

}
