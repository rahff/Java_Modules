package EnglishApi;

import api.IGreeting;
import spi.ISayHelloService;

import java.util.ServiceLoader;

public class Greeting implements IGreeting {
    ISayHelloService helloService;
    public Greeting() {
        this.helloService = ServiceLoader.load(ISayHelloService.class).findFirst().get();
    }

    public String sayHello() {
        return "I say you " +helloService.sayHello();
    }
}
