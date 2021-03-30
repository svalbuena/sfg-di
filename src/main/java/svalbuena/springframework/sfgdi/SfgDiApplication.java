package svalbuena.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import svalbuena.springframework.sfgdi.controllers.ConstructorInjectedController;
import svalbuena.springframework.sfgdi.controllers.MyController;
import svalbuena.springframework.sfgdi.controllers.PropertyInjectedController;
import svalbuena.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(final String[] args) {
        final ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

        final MyController myController = (MyController) context.getBean("myController");
        System.out.println("MyController = " + myController.sayHello());

        final PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println("PropertyInjected = " + propertyInjectedController.getGreeting());

        final SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println("SetterInjected = " + setterInjectedController.getGreeting());

        final ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println("ConstructorInjected = " + constructorInjectedController.getGreeting());
    }

}
