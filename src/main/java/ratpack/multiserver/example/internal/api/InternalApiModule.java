package ratpack.multiserver.example.internal.api;

import com.google.inject.AbstractModule;
import ratpack.multiserver.example.internal.api.hello.GetHelloCountHandler;

public class InternalApiModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(InternalRoutes.class);

        bind(GetHelloCountHandler.class);
    }
}
