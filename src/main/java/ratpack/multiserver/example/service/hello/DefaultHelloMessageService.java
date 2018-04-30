package ratpack.multiserver.example.service.hello;

import com.google.inject.Singleton;
import ratpack.exec.Blocking;
import ratpack.exec.Promise;

import java.util.concurrent.atomic.AtomicLong;

@Singleton
public class DefaultHelloMessageService implements HelloMessageService {

    private static final AtomicLong count = new AtomicLong(0);

    @Override
    public Promise<String> getMessage() {
        return Blocking.get(() -> {
            count.incrementAndGet();
            return "Hello, World!";
        });
    }

    @Override
    public Promise<Long> getMessageCount() {
        return Blocking.get(count::get);
    }
}
