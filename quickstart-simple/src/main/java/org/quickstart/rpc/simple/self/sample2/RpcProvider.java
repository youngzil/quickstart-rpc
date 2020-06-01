package org.quickstart.rpc.simple.self.sample2;

public class RpcProvider {

    public static void main(String[] args) throws Exception {
        HelloService service = new HelloServiceImpl();
        RpcFramework.export(service, HelloService.class, 9000);
    }

}
