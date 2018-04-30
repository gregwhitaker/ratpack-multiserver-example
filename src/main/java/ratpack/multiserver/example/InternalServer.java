package ratpack.multiserver.example;

import ratpack.guice.Guice;
import ratpack.multiserver.example.api.internal.InternalApiModule;
import ratpack.multiserver.example.api.internal.InternalRoutes;
import ratpack.multiserver.example.service.ServiceModule;
import ratpack.server.BaseDir;
import ratpack.server.RatpackServer;

public class InternalServer implements Runnable {

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
                        .port(5051)
                        .env()
                        .baseDir(BaseDir.find())
                        .build()
                )
                .registry(Guice.registry(b -> b
                        .module(InternalApiModule.class)
                        .module(ServiceModule.class))
                )
                .handlers(chain -> chain
                        .insert(InternalRoutes.class)
                )
        );
    }
}
