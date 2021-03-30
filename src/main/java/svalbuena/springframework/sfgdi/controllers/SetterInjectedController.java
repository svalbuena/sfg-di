package svalbuena.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import svalbuena.springframework.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(final GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
