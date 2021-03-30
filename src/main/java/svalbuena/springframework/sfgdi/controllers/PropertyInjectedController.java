package svalbuena.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import svalbuena.springframework.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
