package ratpack.multiserver.example;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String... args) throws Exception {
        Executor executor = Executors.newFixedThreadPool(2);
        executor.execute(new ExternalServer());
        executor.execute(new InternalServer());

        Thread.currentThread().join();
    }
}
