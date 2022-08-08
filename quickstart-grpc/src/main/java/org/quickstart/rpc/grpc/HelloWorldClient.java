/**
 * 项目名称：quickstart-rpc-grpc
 * 文件名：HelloWorldClient.java
 * 版本信息：
 * 日期：2018年5月26日
 * Copyright youngzil Corporation 2018
 * 版权所有 *
 */
package org.quickstart.rpc.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;

public class HelloWorldClient {

    // mvn compile
    private final ManagedChannel channel;
    private final GreeterGrpc.GreeterBlockingStub blockingStub;

    public HelloWorldClient(String host, int port) {
        // String target = "localhost:50051";
        // channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
        channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

        blockingStub = GreeterGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        // channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void greet(String name) {
        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        HelloReply response = blockingStub.sayHello(request);
        System.out.println("Message from gRPC-Server: " + response.getMessage());

    }

    public static void main(String[] args) {
        HelloWorldClient client = new HelloWorldClient("127.0.0.1", 50051);
        for (int i = 0; i < 5; i++) {
            client.greet("world:" + i);
        }
    }

}
