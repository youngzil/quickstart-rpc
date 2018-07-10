package org.quickstart.rpc.finagle;

import com.twitter.finagle.Http;
import com.twitter.finagle.Service;
import com.twitter.finagle.http.Request;
import com.twitter.finagle.http.RequestBuilder;
import com.twitter.finagle.http.Response;
import com.twitter.finagle.http.Status;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;

public class BasicTests {

    @Test
    public void first() throws ExecutionException, InterruptedException {
        Service<Request, Response> client = Http.client().withLabel("my-http-client").withTransport().verbose().newService("inet!httpbin.org:80");
        Request request = RequestBuilder.safeBuildGet(RequestBuilder.create().url("https://httpbin.org/get"));
        Status status = client.apply(request).toJavaFuture().get().status();
        assertEquals(200, status.code());
    }
}
