package main.adapters;

import spi.ISayHelloService;

public class HelloService implements ISayHelloService {
    @Override
    public String sayHello() {
        return "Hello";
    }
}
