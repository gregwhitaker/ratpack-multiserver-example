package ratpack.multiserver.example.api.internal.hello;

import com.google.inject.Inject;
import ratpack.handling.Context;
import ratpack.handling.Handler;
import ratpack.multiserver.example.service.hello.HelloMessageService;

public class GetHelloCountHandler implements Handler {

    @Inject
    private HelloMessageService helloMessageService;

    @Override
    public void handle(Context ctx) throws Exception {

    }
}
