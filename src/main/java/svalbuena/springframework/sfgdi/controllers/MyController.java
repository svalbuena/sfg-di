package svalbuena.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import svalbuena.springframework.sfgdi.services.GreetingService;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(final GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
