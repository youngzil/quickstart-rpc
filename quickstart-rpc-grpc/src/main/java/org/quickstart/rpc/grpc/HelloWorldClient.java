/**
 * 项目名称：quickstart-rpc-grpc 
 * 文件名：HelloWorldClient.java
 * 版本信息：
 * 日期：2018年5月26日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.grpc;

import java.util.concurrent.TimeUnit;

/**
 * HelloWorldClient 
 *  
 * @author：yangzl@asiainfo.com
 * @2018年5月26日 上午10:51:41 
 * @since 1.0
 */
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class HelloWorldClient {

    // mvn compile
    private final ManagedChannel channel;
    private final GreeterGrpc.GreeterBlockingStub blockingStub;

    public HelloWorldClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext(true).build();

        blockingStub = GreeterGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void greet(String name) {
        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        HelloReply response = blockingStub.sayHello(request);
        System.out.println(response.getMessage());

    }

    public static void main(String[] args) throws InterruptedException {
        HelloWorldClient client = new HelloWorldClient("127.0.0.1", 50051);
        for (int i = 0; i < 5; i++) {
            client.greet("world:" + i);
        }

    }
}
