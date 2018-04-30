package ratpack.multiserver.example.api.external;

import com.google.inject.AbstractModule;
import ratpack.multiserver.example.api.external.hello.GetHelloHandler;

public class ExternalApiModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ExternalRoutes.class);

        bind(GetHelloHandler.class);
    }
}
