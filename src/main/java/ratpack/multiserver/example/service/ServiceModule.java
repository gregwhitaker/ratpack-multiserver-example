package ratpack.multiserver.example.service;

import com.google.inject.AbstractModule;
import ratpack.multiserver.example.service.hello.DefaultHelloMessageService;
import ratpack.multiserver.example.service.hello.HelloMessageService;

public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(HelloMessageService.class).to(DefaultHelloMessageService.class);
    }
}
