package main;


import api.IGreeting;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<IGreeting> myServices = ServiceLoader.load(IGreeting.class)
                .stream().map((provider)-> provider.get())
                .collect(Collectors.toList());
        for (IGreeting service: myServices) {
            System.out.println(service.sayHello());
        }
    }
}