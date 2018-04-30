package ratpack.multiserver.example.api.external;

import ratpack.func.Action;
import ratpack.handling.Chain;
import ratpack.multiserver.example.api.external.hello.GetHelloHandler;
import ratpack.multiserver.example.api.internal.hello.GetHelloCountHandler;

public class ExternalRoutes implements Action<Chain> {

    @Override
    public void execute(Chain chain) throws Exception {
        chain.get("hello", GetHelloHandler.class);
    }
}
