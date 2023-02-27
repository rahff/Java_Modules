package frenchApi;

import api.IGreeting;
import spi.ISayBonjourService;

import java.util.ServiceLoader;

public class Greeting implements IGreeting {
    ISayBonjourService bonjourService;
    public Greeting() {
        this.bonjourService = ServiceLoader.load(ISayBonjourService.class).findFirst().get();
    }

    public String sayHello() {
        return "Je vous dit "+ bonjourService.sayBonjour();
    }
}
