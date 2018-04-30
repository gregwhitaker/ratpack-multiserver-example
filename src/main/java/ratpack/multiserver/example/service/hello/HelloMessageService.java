package ratpack.multiserver.example.service.hello;

import ratpack.exec.Promise;

public interface HelloMessageService {

    Promise<String> getMessage();

    Promise<Long> getMessageCount();
}
