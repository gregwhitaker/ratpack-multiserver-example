package ratpack.multiserver.example.external.api;

import com.google.inject.AbstractModule;
import ratpack.multiserver.example.external.api.hello.GetHelloMessageHandler;

public class ExternalApiModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ExternalRoutes.class);

        bind(GetHelloMessageHandler.class);
    }
}
