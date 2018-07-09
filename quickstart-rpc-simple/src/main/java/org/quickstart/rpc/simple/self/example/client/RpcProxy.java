/**
 * 项目名称：quickstart-rpc-simple 
 * 文件名：RpcProxy.java
 * 版本信息：
 * 日期：2018年4月24日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.simple.self.example.client;

import java.lang.reflect.Method;
import java.util.UUID;

import org.quickstart.rpc.simple.self.example.util.RpcRequest;
import org.quickstart.rpc.simple.self.example.util.RpcResponse;

/**
 * RpcProxy 
 *  
 * @author：yangzl@asiainfo.com
 * @2018年4月24日 下午12:45:32 
 * @since 1.0
 */
import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;

/**
 * 客户端RPC调用代理
 */
public class RpcProxy {

    private String serverAddress;
    private ServiceDiscovery serviceDiscovery;

    public RpcProxy(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    public RpcProxy(ServiceDiscovery serviceDiscovery) {
        this.serviceDiscovery = serviceDiscovery;
    }

    @SuppressWarnings("unchecked")
    public <T> T create(Class<?> interfaceClass) {
        return (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class<?>[] {interfaceClass}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                RpcRequest request = new RpcRequest(); // 创建并初始化 RPC 请求
                request.setRequestId(UUID.randomUUID().toString());
                request.setClassName(method.getDeclaringClass().getName());
                request.setMethodName(method.getName());
                request.setParameterTypes(method.getParameterTypes());
                request.setParameters(args);

                if (serviceDiscovery != null) {
                    serverAddress = serviceDiscovery.discover(); // 发现服务
                }

                String[] array = serverAddress.split(":");
                String host = array[0];
                int port = Integer.parseInt(array[1]);

                RpcClient client = new RpcClient(host, port); // 初始化 RPC 客户端
                RpcResponse response = client.send(request); // 通过 RPC 客户端发送 RPC 请求并获取 RPC 响应

                if (response.getError() != null) {
                    throw response.getError();
                } else {
                    return response.getResult();
                }
            }
        });
    }
}
