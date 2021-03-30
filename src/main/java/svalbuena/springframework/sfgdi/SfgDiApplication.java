package svalbuena.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import svalbuena.springframework.sfgdi.controllers.MyController;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(final String[] args) {
        final ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
        final MyController myController = (MyController) context.getBean("myController");

        final String greeting = myController.sayHello();
        System.out.println(greeting);
    }

}
