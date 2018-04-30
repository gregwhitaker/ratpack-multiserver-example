package ratpack.multiserver.example.external;

import ratpack.guice.Guice;
import ratpack.multiserver.example.external.api.ExternalApiModule;
import ratpack.multiserver.example.external.api.ExternalRoutes;
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
                        .baseDir(BaseDir.find())
                        .build()
                )
                .registry(Guice.registry(b -> b
                        .module(ExternalApiModule.class))
                )
                .handlers(chain -> chain
                        .insert(ExternalRoutes.class)
                )
        );
    }
}
