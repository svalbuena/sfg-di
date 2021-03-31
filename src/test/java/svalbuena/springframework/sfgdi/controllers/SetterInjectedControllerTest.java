package svalbuena.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import svalbuena.springframework.sfgdi.services.ConstructorInjectedGreetingService;

class SetterInjectedControllerTest {
    private SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorInjectedGreetingService());
    }

    @Test
    void setGreetingService() {
        System.out.println(controller.getGreeting());
    }
}