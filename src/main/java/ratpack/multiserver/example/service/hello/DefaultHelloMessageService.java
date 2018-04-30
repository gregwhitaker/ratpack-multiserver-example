package ratpack.multiserver.example.service.hello;

import com.google.inject.Singleton;
import ratpack.exec.Promise;

@Singleton
public class DefaultHelloMessageService implements HelloMessageService {

    @Override
    public Promise<String> getMessage() {
        return null;
    }

    @Override
    public Promise<Long> getMessageCount() {
        return null;
    }
}
