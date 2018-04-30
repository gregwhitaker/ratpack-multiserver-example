package ratpack.multiserver.example;

import ratpack.guice.Guice;
import ratpack.multiserver.example.api.external.ExternalApiModule;
import ratpack.multiserver.example.api.external.ExternalRoutes;
import ratpack.multiserver.example.config.HelloConfig;
import ratpack.multiserver.example.service.ServiceModule;
import ratpack.server.BaseDir;
import ratpack.server.RatpackServer;

public class ExternalServer implements Runnable {

    @Override
    public void run() {
        try {
            startServer();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void startServer() throws Exception {
        RatpackServer.start(s -> s
                .serverConfig(c -> c
                        .env()
                        .yaml("config.yml")
                        .require("/hello", HelloConfig.class)
                        .baseDir(BaseDir.find())
                        .build()
                )
                .registry(Guice.registry(b -> b
                        .module(ExternalApiModule.class)
                        .module(ServiceModule.class))
                )
                .handlers(chain -> chain
                        .insert(ExternalRoutes.class)
                )
        );
    }
}
