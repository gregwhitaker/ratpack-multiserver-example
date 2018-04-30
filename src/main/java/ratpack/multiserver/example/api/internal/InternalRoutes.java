package ratpack.multiserver.example.api.internal;

import ratpack.func.Action;
import ratpack.handling.Chain;
import ratpack.multiserver.example.api.internal.hello.GetHelloCountHandler;

public class InternalRoutes implements Action<Chain> {

    @Override
    public void execute(Chain chain) throws Exception {
        chain.get("hello/count", GetHelloCountHandler.class);
    }
}
