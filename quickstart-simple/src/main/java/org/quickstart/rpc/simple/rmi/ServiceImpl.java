/**
 * 项目名称：quickstart-rpc-simple 
 * 文件名：ServiceImpl.java
 * 版本信息：
 * 日期：2018年5月25日
 * Copyright youngzil Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.simple.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * ServiceImpl
 * 
 * @author：youngzil@163.com
 * @2018年5月25日 下午11:31:26
 * @since 1.0
 */
// 服务实现
public class ServiceImpl extends UnicastRemoteObject implements IService {

    /** 
     */
    private static final long serialVersionUID = 682805210518738166L;

    /**
     * @throws RemoteException
     */
    protected ServiceImpl() throws RemoteException {
        super();
    }

    /* (non-Javadoc) 
     * 
     */
    @Override
    public String queryName(String no) throws RemoteException {
        // 方法的具体实现
        System.out.println("hello" + no);
        return String.valueOf("hello" + no + ",time=" + System.currentTimeMillis());
    }

}
