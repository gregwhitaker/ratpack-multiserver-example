package ratpack.multiserver.example.internal;

import ratpack.guice.Guice;
import ratpack.multiserver.example.internal.api.InternalApiModule;
import ratpack.multiserver.example.internal.api.InternalRoutes;
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
                        .module(InternalApiModule.class))
                )
                .handlers(chain -> chain
                        .insert(InternalRoutes.class)
                )
        );
    }
}
