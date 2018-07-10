/**
 * 项目名称：quickstart-rpc-simple 
 * 文件名：IService.java
 * 版本信息：
 * 日期：2018年5月25日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.simple.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * IService
 * 
 * @author：yangzl@asiainfo.com
 * @2018年5月25日 下午11:30:45
 * @since 1.0
 */
public interface IService extends Remote {

    public String queryName(String no) throws RemoteException;

}
