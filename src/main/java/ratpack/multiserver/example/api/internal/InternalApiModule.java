package ratpack.multiserver.example.api.internal;

import com.google.inject.AbstractModule;
import ratpack.multiserver.example.api.internal.hello.GetHelloCountHandler;

public class InternalApiModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(InternalRoutes.class);

        bind(GetHelloCountHandler.class);
    }
}
