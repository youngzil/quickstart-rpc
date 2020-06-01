/**
 * 项目名称：quickstart-rpc-simple 
 * 文件名：RpcResponse.java
 * 版本信息：
 * 日期：2018年4月24日
 * Copyright youngzil Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.simple.self.example.util;

/**
 * RpcResponse 
 *  
 * @author：youngzil@163.com
 * @2018年4月24日 下午12:34:23 
 * @since 1.0
 */
/**
 * RPC响应
 */
public class RpcResponse {

    private String requestId;

    private Throwable error;

    private Object result;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Throwable getError() {
        return error;
    }

    public void setError(Throwable error) {
        this.error = error;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
