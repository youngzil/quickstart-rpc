package org.quickstart.rpc.finagle;

import com.twitter.finagle.Thrift;
import com.twitter.util.Await;
import com.twitter.util.Function;
import com.twitter.util.Future;

import playground.HelloService;
import scala.runtime.BoxedUnit;

public final class HelloThriftClient {

  private HelloThriftClient() { }

  public static void main(String[] args) throws Exception {
    HelloService.FutureIface client = Thrift.client().newIface("localhost:9097", HelloService.FutureIface.class);
    Future<String> response = client.hi("Maven").onSuccess(new Function<String, BoxedUnit>() {
      @Override
      public BoxedUnit apply(String response) {
        System.out.println("Received response: " + response);
        return null;
      }
    });

    Await.result(response);
  }
}